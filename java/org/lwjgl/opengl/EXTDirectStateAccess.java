/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.opengl.org/registry/specs/EXT/direct_state_access.txt">EXT_direct_state_access</a> extension.
 * 
 * <p>This extension introduces a set of new "direct state access" commands (meaning no selector is involved) to access (update and query) OpenGL state that
 * previously depended on the OpenGL state selectors for access. These new commands supplement the existing selector-based OpenGL commands to access the
 * same state.</p>
 * 
 * <p>The intent of this extension is to make it more efficient for libraries to avoid disturbing selector and latched state. The extension also allows more
 * efficient command usage by eliminating the need for selector update commands.</p>
 * 
 * <p>Two derivative advantages of this extension are 1) display lists can be executed using these commands that avoid disturbing selectors that subsequent
 * commands may depend on, and 2) drivers implemented with a dual-thread partitioning with OpenGL command buffering from an application thread and then
 * OpenGL command dispatching in a concurrent driver thread can avoid thread synchronization created by selector saving, setting, command execution, and
 * selector restoration.</p>
 * 
 * <p>This extension does not itself add any new OpenGL state.</p>
 * 
 * <p>We call a state variable in OpenGL an "OpenGL state selector" or simply a "selector" if OpenGL commands depend on the state variable to determine what
 * state to query or update. The matrix mode and active texture are both selectors. Object bindings for buffers, programs, textures, and framebuffer
 * objects are also selectors.</p>
 * 
 * <p>We call OpenGL state "latched" if the state is set by one OpenGL command but then that state is saved by a subsequent command or the state determines
 * how client memory or buffer object memory is accessed by a subsequent command. The array and element array buffer bindings are latched by vertex array
 * specification commands to determine which buffer a given vertex array uses. Vertex array state and pixel pack/unpack state decides how client memory or
 * buffer object memory is accessed by subsequent vertex pulling or image specification commands.</p>
 * 
 * <p>The existence of selectors and latched state in the OpenGL API reduces the number of parameters to various sets of OpenGL commands but complicates the
 * access to state for layered libraries which seek to access state without disturbing other state, namely the state of state selectors and latched state.
 * In many cases, selectors and latched state were introduced by extensions as OpenGL evolved to minimize the disruption to the OpenGL API when new
 * functionality, particularly the pluralization of existing functionality as when texture objects and later multiple texture units, was introduced.</p>
 * 
 * <p>The OpenGL API involves several selectors (listed in historical order of introduction):</p>
 * 
 * <ul>
 * <li>The matrix mode.</li>
 * <li>The current bound texture for each supported texture target.</li>
 * <li>The active texture.</li>
 * <li>The active client texture.</li>
 * <li>The current bound program for each supported program target.</li>
 * <li>The current bound buffer for each supported buffer target.</li>
 * <li>The current GLSL program.</li>
 * <li>The current framebuffer object.</li>
 * </ul>
 * 
 * <p>The new selector-free update commands can be compiled into display lists.</p>
 * 
 * <p>The OpenGL API has latched state for vertex array buffer objects and pixel store state. When an application issues a GL command to unpack or pack pixels
 * (for example, glTexImage2D or glReadPixels respectively), the current unpack and pack pixel store state determines how the pixels are unpacked
 * from/packed to client memory or pixel buffer objects. For example, consider:</p>
 * 
 * <pre><code>glPixelStorei(GL_UNPACK_SWAP_BYTES, GL_TRUE);
glPixelStorei(GL_UNPACK_ROW_LENGTH, 640);
glBindBuffer(GL_PIXEL_UNPACK_BUFFER, 47);
glDrawPixels(100, 100, GL_RGB, GL_FLOAT, pixels);</code></pre>
 * 
 * <p>The unpack swap bytes and row length state set by the preceding glPixelStorei commands (as well as the 6 other unpack pixel store state variables)
 * control how data is read (unpacked) from buffer of data pointed to by pixels. The glBindBuffer command also specifies an unpack buffer object (47) so
 * the pixel pointer is actually treated as a byte offset into buffer object 47.</p>
 * 
 * <p>When an application issues a command to configure a vertex array, the current array buffer state is latched as the binding for the particular vertex
 * array being specified. For example, consider:</p>
 * 
 * <pre><code>glBindBuffer(GL_ARRAY_BUFFER, 23);
glVertexPointer(3, GL_FLOAT, 12, pointer);</code></pre>
 * 
 * <p>The glBindBuffer command updates the array buffering binding (GL_ARRAY_BUFFER_BINDING) to the buffer object named 23. The subsequent glVertexPointer
 * command specifies explicit parameters for the size, type, stride, and pointer to access the position vertex array BUT ALSO latches the current array
 * buffer binding for the vertex array buffer binding (GL_VERTEX_ARRAY_BUFFER_BINDING). Effectively the current array buffer binding buffer object becomes
 * an implicit fifth parameter to glVertexPointer and this applies to all the gl*Pointer vertex array specification commands.</p>
 * 
 * <p>Selectors and latched state create problems for layered libraries using OpenGL because selectors require the selector state to be modified to update
 * some other state and latched state means implicit state can affect the operation of commands specifying, packing, or unpacking data through
 * pointers/offsets. For layered libraries, a state update performed by the library may attempt to save the selector state, set the selector, update/query
 * some state the selector controls, and then restore the selector to its saved state. Layered libraries can skip the selector save/restore but this risks
 * introducing uncertainty about the state of a selector after calling layered library routines. Such selector side-effects are difficult to document and
 * lead to compatibility issues as the layered library evolves or its usage varies. For latched state, layered libraries may find commands such as
 * glDrawPixels do not work as expected because latched pixel store state is not what the library expects. Querying or pushing the latched state, setting
 * the latched state explicitly, performing the operation involving latched state, and then restoring or popping the latched state avoids entanglements
 * with latched state but at considerable cost.</p>
 * 
 * <h3>EXAMPLE USAGE OF THIS EXTENSION'S FUNCTIONALITY</h3>
 * 
 * <p>Consider the following routine to set the modelview matrix involving the matrix mode selector:</p>
 * 
 * <pre><code>void setModelviewMatrix(const GLfloat matrix[16])
{
    GLenum savedMatrixMode;

    glGetIntegerv(GL_MATRIX_MODE, &savedMatrixMode);
    glMatrixMode(GL_MODELVIEW);
    glLoadMatrixf(matrix);
    glMatrixMode(savedMatrixMode);
}</code></pre>
 * 
 * <p>Notice that four OpenGL commands are required to update the current modelview matrix without disturbing the matrix mode selector.</p>
 * 
 * <p>OpenGL query commands can also substantially reduce the performance of modern OpenGL implementations which may off-load OpenGL state processing to
 * another CPU core/thread or to the GPU itself.</p>
 * 
 * <p>An alternative to querying the selector is to use the glPushAttrib/glPopAttrib commands. However this approach typically involves pushing far more state
 * than simply the one or two selectors that need to be saved and restored. Because so much state is associated with a given push/pop attribute bit, the
 * glPushAttrib and glPopAttrib commands are considerably more costly than the save/restore approach. Additionally glPushAttrib risks overflowing the
 * attribute stack.</p>
 * 
 * <p>The reliability and performance of layered libraries and applications can be improved by adding to the OpenGL API a new set of commands to access
 * directly OpenGL state that otherwise involves selectors to access.</p>
 * 
 * <p>The above example can be reimplemented more efficiently and without selector side-effects:</p>
 * 
 * <pre><code>void setModelviewMatrix(const GLfloat matrix[16])
{
    glMatrixLoadfEXT(GL_MODELVIEW, matrix);
}</code></pre>
 * 
 * <p>Consider a layered library seeking to load a texture:</p>
 * 
 * <pre><code>void loadTexture(GLint texobj, GLint width, GLint height, void *data)
{
    glBindTexture(GL_TEXTURE_2D, texobj);
    glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB8, width, height, GL_RGB, GL_FLOAT, data);
}</code></pre>
 * 
 * <p>The library expects the data to be packed into the buffer pointed to by data. But what if the current pixel unpack buffer binding is not zero so the
 * current pixel unpack buffer, rather than client memory, will be read? Or what if the application has modified the GL_UNPACK_ROW_LENGTH pixel store state
 * before loadTexture is called?</p>
 * 
 * <p>We can fix the routine by calling glBindBuffer(GL_PIXEL_UNPACK_BUFFER, 0) and setting all the pixel store unpack state to the initial state the
 * loadTexture routine expects, but this is expensive. It also risks disturbing the state so when loadTexture returns to the application, the application
 * doesn't realize the current texture object (for whatever texture unit the current active texture happens to be) and pixel store state has changed.</p>
 * 
 * <p>We can more efficiently implement this routine without disturbing selector or latched state as follows:</p>
 * 
 * <pre><code>void loadTexture(GLint texobj, GLint width, GLint height, void *data)
{
    glPushClientAttribDefaultEXT(GL_CLIENT_PIXEL_STORE_BIT);
    glTextureImage2D(texobj, GL_TEXTURE_2D, 0, GL_RGB8, width, height, GL_RGB, GL_FLOAT, data);
    glPopClientAttrib();
}</code></pre>
 * 
 * <p>Now loadTexture does not have to worry about inappropriately configured pixel store state or a non-zero pixel unpack buffer binding. And loadTexture has
 * no unintended side-effects for selector or latched state (assuming the client attrib state does not overflow).</p>
 */
public class EXTDirectStateAccess {

    /** GetBooleani_v, GetIntegeri_v, GetFloati_vEXT, GetDoublei_vEXT. */
    public static final int
        GL_PROGRAM_MATRIX_EXT             = 0x8E2D,
        GL_TRANSPOSE_PROGRAM_MATRIX_EXT   = 0x8E2E,
        GL_PROGRAM_MATRIX_STACK_DEPTH_EXT = 0x8E2F;

    static { GL.initialize(); }

    protected EXTDirectStateAccess() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps, java.util.Set<String> ext) {
        return checkFunctions(
            caps.glClientAttribDefaultEXT, caps.glPushClientAttribDefaultEXT, caps.glMatrixLoadfEXT, caps.glMatrixLoaddEXT, caps.glMatrixMultfEXT, 
            caps.glMatrixMultdEXT, caps.glMatrixLoadIdentityEXT, caps.glMatrixRotatefEXT, caps.glMatrixRotatedEXT, caps.glMatrixScalefEXT, 
            caps.glMatrixScaledEXT, caps.glMatrixTranslatefEXT, caps.glMatrixTranslatedEXT, caps.glMatrixOrthoEXT, caps.glMatrixFrustumEXT, 
            caps.glMatrixPushEXT, caps.glMatrixPopEXT, caps.glTextureParameteriEXT, caps.glTextureParameterivEXT, caps.glTextureParameterfEXT, 
            caps.glTextureParameterfvEXT, caps.glTextureImage1DEXT, caps.glTextureImage2DEXT, caps.glTextureSubImage1DEXT, caps.glTextureSubImage2DEXT, 
            caps.glCopyTextureImage1DEXT, caps.glCopyTextureImage2DEXT, caps.glCopyTextureSubImage1DEXT, caps.glCopyTextureSubImage2DEXT, 
            caps.glGetTextureImageEXT, caps.glGetTextureParameterfvEXT, caps.glGetTextureParameterivEXT, caps.glGetTextureLevelParameterfvEXT, 
            caps.glGetTextureLevelParameterivEXT, ext.contains("OpenGL12") ? caps.glTextureImage3DEXT : -1L, 
            ext.contains("OpenGL12") ? caps.glTextureSubImage3DEXT : -1L, ext.contains("OpenGL12") ? caps.glCopyTextureSubImage3DEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glBindMultiTextureEXT : -1L, ext.contains("OpenGL13") ? caps.glMultiTexCoordPointerEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glMultiTexEnvfEXT : -1L, ext.contains("OpenGL13") ? caps.glMultiTexEnvfvEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glMultiTexEnviEXT : -1L, ext.contains("OpenGL13") ? caps.glMultiTexEnvivEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glMultiTexGendEXT : -1L, ext.contains("OpenGL13") ? caps.glMultiTexGendvEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glMultiTexGenfEXT : -1L, ext.contains("OpenGL13") ? caps.glMultiTexGenfvEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glMultiTexGeniEXT : -1L, ext.contains("OpenGL13") ? caps.glMultiTexGenivEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glGetMultiTexEnvfvEXT : -1L, ext.contains("OpenGL13") ? caps.glGetMultiTexEnvivEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glGetMultiTexGendvEXT : -1L, ext.contains("OpenGL13") ? caps.glGetMultiTexGenfvEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glGetMultiTexGenivEXT : -1L, ext.contains("OpenGL13") ? caps.glMultiTexParameteriEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glMultiTexParameterivEXT : -1L, ext.contains("OpenGL13") ? caps.glMultiTexParameterfEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glMultiTexParameterfvEXT : -1L, ext.contains("OpenGL13") ? caps.glMultiTexImage1DEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glMultiTexImage2DEXT : -1L, ext.contains("OpenGL13") ? caps.glMultiTexSubImage1DEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glMultiTexSubImage2DEXT : -1L, ext.contains("OpenGL13") ? caps.glCopyMultiTexImage1DEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glCopyMultiTexImage2DEXT : -1L, ext.contains("OpenGL13") ? caps.glCopyMultiTexSubImage1DEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glCopyMultiTexSubImage2DEXT : -1L, ext.contains("OpenGL13") ? caps.glGetMultiTexImageEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glGetMultiTexParameterfvEXT : -1L, ext.contains("OpenGL13") ? caps.glGetMultiTexParameterivEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glGetMultiTexLevelParameterfvEXT : -1L, ext.contains("OpenGL13") ? caps.glGetMultiTexLevelParameterivEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glMultiTexImage3DEXT : -1L, ext.contains("OpenGL13") ? caps.glMultiTexSubImage3DEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glCopyMultiTexSubImage3DEXT : -1L, ext.contains("OpenGL13") ? caps.glEnableClientStateIndexedEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glDisableClientStateIndexedEXT : -1L, ext.contains("OpenGL13") ? caps.glGetFloatIndexedvEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glGetDoubleIndexedvEXT : -1L, ext.contains("OpenGL13") ? caps.glGetPointerIndexedvEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glEnableIndexedEXT : -1L, ext.contains("OpenGL13") ? caps.glDisableIndexedEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glIsEnabledIndexedEXT : -1L, ext.contains("OpenGL13") ? caps.glGetIntegerIndexedvEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glGetBooleanIndexedvEXT : -1L, ext.contains("GL_ARB_vertex_program") ? caps.glNamedProgramStringEXT : -1L, 
            ext.contains("GL_ARB_vertex_program") ? caps.glNamedProgramLocalParameter4dEXT : -1L, 
            ext.contains("GL_ARB_vertex_program") ? caps.glNamedProgramLocalParameter4dvEXT : -1L, 
            ext.contains("GL_ARB_vertex_program") ? caps.glNamedProgramLocalParameter4fEXT : -1L, 
            ext.contains("GL_ARB_vertex_program") ? caps.glNamedProgramLocalParameter4fvEXT : -1L, 
            ext.contains("GL_ARB_vertex_program") ? caps.glGetNamedProgramLocalParameterdvEXT : -1L, 
            ext.contains("GL_ARB_vertex_program") ? caps.glGetNamedProgramLocalParameterfvEXT : -1L, 
            ext.contains("GL_ARB_vertex_program") ? caps.glGetNamedProgramivEXT : -1L, 
            ext.contains("GL_ARB_vertex_program") ? caps.glGetNamedProgramStringEXT : -1L, ext.contains("OpenGL13") ? caps.glCompressedTextureImage3DEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glCompressedTextureImage2DEXT : -1L, ext.contains("OpenGL13") ? caps.glCompressedTextureImage1DEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glCompressedTextureSubImage3DEXT : -1L, ext.contains("OpenGL13") ? caps.glCompressedTextureSubImage2DEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glCompressedTextureSubImage1DEXT : -1L, ext.contains("OpenGL13") ? caps.glGetCompressedTextureImageEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glCompressedMultiTexImage3DEXT : -1L, ext.contains("OpenGL13") ? caps.glCompressedMultiTexImage2DEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glCompressedMultiTexImage1DEXT : -1L, ext.contains("OpenGL13") ? caps.glCompressedMultiTexSubImage3DEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glCompressedMultiTexSubImage2DEXT : -1L, ext.contains("OpenGL13") ? caps.glCompressedMultiTexSubImage1DEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glGetCompressedMultiTexImageEXT : -1L, ext.contains("OpenGL13") ? caps.glMatrixLoadTransposefEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glMatrixLoadTransposedEXT : -1L, ext.contains("OpenGL13") ? caps.glMatrixMultTransposefEXT : -1L, 
            ext.contains("OpenGL13") ? caps.glMatrixMultTransposedEXT : -1L, ext.contains("OpenGL15") ? caps.glNamedBufferDataEXT : -1L, 
            ext.contains("OpenGL15") ? caps.glNamedBufferSubDataEXT : -1L, ext.contains("OpenGL15") ? caps.glMapNamedBufferEXT : -1L, 
            ext.contains("OpenGL15") ? caps.glUnmapNamedBufferEXT : -1L, ext.contains("OpenGL15") ? caps.glGetNamedBufferParameterivEXT : -1L, 
            ext.contains("OpenGL15") ? caps.glGetNamedBufferSubDataEXT : -1L, ext.contains("OpenGL20") ? caps.glProgramUniform1fEXT : -1L, 
            ext.contains("OpenGL20") ? caps.glProgramUniform2fEXT : -1L, ext.contains("OpenGL20") ? caps.glProgramUniform3fEXT : -1L, 
            ext.contains("OpenGL20") ? caps.glProgramUniform4fEXT : -1L, ext.contains("OpenGL20") ? caps.glProgramUniform1iEXT : -1L, 
            ext.contains("OpenGL20") ? caps.glProgramUniform2iEXT : -1L, ext.contains("OpenGL20") ? caps.glProgramUniform3iEXT : -1L, 
            ext.contains("OpenGL20") ? caps.glProgramUniform4iEXT : -1L, ext.contains("OpenGL20") ? caps.glProgramUniform1fvEXT : -1L, 
            ext.contains("OpenGL20") ? caps.glProgramUniform2fvEXT : -1L, ext.contains("OpenGL20") ? caps.glProgramUniform3fvEXT : -1L, 
            ext.contains("OpenGL20") ? caps.glProgramUniform4fvEXT : -1L, ext.contains("OpenGL20") ? caps.glProgramUniform1ivEXT : -1L, 
            ext.contains("OpenGL20") ? caps.glProgramUniform2ivEXT : -1L, ext.contains("OpenGL20") ? caps.glProgramUniform3ivEXT : -1L, 
            ext.contains("OpenGL20") ? caps.glProgramUniform4ivEXT : -1L, ext.contains("OpenGL20") ? caps.glProgramUniformMatrix2fvEXT : -1L, 
            ext.contains("OpenGL20") ? caps.glProgramUniformMatrix3fvEXT : -1L, ext.contains("OpenGL20") ? caps.glProgramUniformMatrix4fvEXT : -1L, 
            ext.contains("OpenGL21") ? caps.glProgramUniformMatrix2x3fvEXT : -1L, ext.contains("OpenGL21") ? caps.glProgramUniformMatrix3x2fvEXT : -1L, 
            ext.contains("OpenGL21") ? caps.glProgramUniformMatrix2x4fvEXT : -1L, ext.contains("OpenGL21") ? caps.glProgramUniformMatrix4x2fvEXT : -1L, 
            ext.contains("OpenGL21") ? caps.glProgramUniformMatrix3x4fvEXT : -1L, ext.contains("OpenGL21") ? caps.glProgramUniformMatrix4x3fvEXT : -1L, 
            ext.contains("GL_EXT_texture_buffer_object") ? caps.glTextureBufferEXT : -1L, 
            ext.contains("GL_EXT_texture_buffer_object") ? caps.glMultiTexBufferEXT : -1L, 
            ext.contains("GL_EXT_texture_integer") ? caps.glTextureParameterIivEXT : -1L, 
            ext.contains("GL_EXT_texture_integer") ? caps.glTextureParameterIuivEXT : -1L, 
            ext.contains("GL_EXT_texture_integer") ? caps.glGetTextureParameterIivEXT : -1L, 
            ext.contains("GL_EXT_texture_integer") ? caps.glGetTextureParameterIuivEXT : -1L, 
            ext.contains("GL_EXT_texture_integer") ? caps.glMultiTexParameterIivEXT : -1L, 
            ext.contains("GL_EXT_texture_integer") ? caps.glMultiTexParameterIuivEXT : -1L, 
            ext.contains("GL_EXT_texture_integer") ? caps.glGetMultiTexParameterIivEXT : -1L, 
            ext.contains("GL_EXT_texture_integer") ? caps.glGetMultiTexParameterIuivEXT : -1L, 
            ext.contains("GL_EXT_gpu_shader4") ? caps.glProgramUniform1uiEXT : -1L, ext.contains("GL_EXT_gpu_shader4") ? caps.glProgramUniform2uiEXT : -1L, 
            ext.contains("GL_EXT_gpu_shader4") ? caps.glProgramUniform3uiEXT : -1L, ext.contains("GL_EXT_gpu_shader4") ? caps.glProgramUniform4uiEXT : -1L, 
            ext.contains("GL_EXT_gpu_shader4") ? caps.glProgramUniform1uivEXT : -1L, ext.contains("GL_EXT_gpu_shader4") ? caps.glProgramUniform2uivEXT : -1L, 
            ext.contains("GL_EXT_gpu_shader4") ? caps.glProgramUniform3uivEXT : -1L, ext.contains("GL_EXT_gpu_shader4") ? caps.glProgramUniform4uivEXT : -1L, 
            ext.contains("GL_EXT_gpu_program_parameters") ? caps.glNamedProgramLocalParameters4fvEXT : -1L, 
            ext.contains("GL_NV_gpu_program4") ? caps.glNamedProgramLocalParameterI4iEXT : -1L, 
            ext.contains("GL_NV_gpu_program4") ? caps.glNamedProgramLocalParameterI4ivEXT : -1L, 
            ext.contains("GL_NV_gpu_program4") ? caps.glNamedProgramLocalParametersI4ivEXT : -1L, 
            ext.contains("GL_NV_gpu_program4") ? caps.glNamedProgramLocalParameterI4uiEXT : -1L, 
            ext.contains("GL_NV_gpu_program4") ? caps.glNamedProgramLocalParameterI4uivEXT : -1L, 
            ext.contains("GL_NV_gpu_program4") ? caps.glNamedProgramLocalParametersI4uivEXT : -1L, 
            ext.contains("GL_NV_gpu_program4") ? caps.glGetNamedProgramLocalParameterIivEXT : -1L, 
            ext.contains("GL_NV_gpu_program4") ? caps.glGetNamedProgramLocalParameterIuivEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glNamedRenderbufferStorageEXT : -1L, ext.contains("OpenGL30") ? caps.glGetNamedRenderbufferParameterivEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glNamedRenderbufferStorageMultisampleEXT : -1L, 
            ext.contains("GL_NV_framebuffer_multisample_coverage") ? caps.glNamedRenderbufferStorageMultisampleCoverageEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glCheckNamedFramebufferStatusEXT : -1L, ext.contains("OpenGL30") ? caps.glNamedFramebufferTexture1DEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glNamedFramebufferTexture2DEXT : -1L, ext.contains("OpenGL30") ? caps.glNamedFramebufferTexture3DEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glNamedFramebufferRenderbufferEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glGetNamedFramebufferAttachmentParameterivEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glGenerateTextureMipmapEXT : -1L, ext.contains("OpenGL30") ? caps.glGenerateMultiTexMipmapEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glFramebufferDrawBufferEXT : -1L, ext.contains("OpenGL30") ? caps.glFramebufferDrawBuffersEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glFramebufferReadBufferEXT : -1L, ext.contains("OpenGL30") ? caps.glGetFramebufferParameterivEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glNamedCopyBufferSubDataEXT : -1L, 
            ext.contains("GL_EXT_geometry_shader4") || ext.contains("GL_NV_gpu_program4") ? caps.glNamedFramebufferTextureEXT : -1L, 
            ext.contains("GL_EXT_geometry_shader4") || ext.contains("GL_NV_gpu_program4") ? caps.glNamedFramebufferTextureLayerEXT : -1L, 
            ext.contains("GL_EXT_geometry_shader4") || ext.contains("GL_NV_gpu_program4") ? caps.glNamedFramebufferTextureFaceEXT : -1L, 
            ext.contains("GL_NV_explicit_multisample") ? caps.glTextureRenderbufferEXT : -1L, 
            ext.contains("GL_NV_explicit_multisample") ? caps.glMultiTexRenderbufferEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glVertexArrayVertexOffsetEXT : -1L, ext.contains("OpenGL30") ? caps.glVertexArrayColorOffsetEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glVertexArrayEdgeFlagOffsetEXT : -1L, ext.contains("OpenGL30") ? caps.glVertexArrayIndexOffsetEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glVertexArrayNormalOffsetEXT : -1L, ext.contains("OpenGL30") ? caps.glVertexArrayTexCoordOffsetEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glVertexArrayMultiTexCoordOffsetEXT : -1L, ext.contains("OpenGL30") ? caps.glVertexArrayFogCoordOffsetEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glVertexArraySecondaryColorOffsetEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glVertexArrayVertexAttribOffsetEXT : -1L, ext.contains("OpenGL30") ? caps.glVertexArrayVertexAttribIOffsetEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glEnableVertexArrayEXT : -1L, ext.contains("OpenGL30") ? caps.glDisableVertexArrayEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glEnableVertexArrayAttribEXT : -1L, ext.contains("OpenGL30") ? caps.glDisableVertexArrayAttribEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glGetVertexArrayIntegervEXT : -1L, ext.contains("OpenGL30") ? caps.glGetVertexArrayPointervEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glGetVertexArrayIntegeri_vEXT : -1L, ext.contains("OpenGL30") ? caps.glGetVertexArrayPointeri_vEXT : -1L, 
            ext.contains("OpenGL30") ? caps.glMapNamedBufferRangeEXT : -1L, ext.contains("OpenGL30") ? caps.glFlushMappedNamedBufferRangeEXT : -1L
        );
    }

    // --- [ glClientAttribDefaultEXT ] ---

    public static native void glClientAttribDefaultEXT(int mask);

    // --- [ glPushClientAttribDefaultEXT ] ---

    public static native void glPushClientAttribDefaultEXT(int mask);

    // --- [ glMatrixLoadfEXT ] ---

    public static native void nglMatrixLoadfEXT(int matrixMode, long m);

    public static void glMatrixLoadfEXT(int matrixMode, FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixLoadfEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixLoaddEXT ] ---

    public static native void nglMatrixLoaddEXT(int matrixMode, long m);

    public static void glMatrixLoaddEXT(int matrixMode, DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixLoaddEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultfEXT ] ---

    public static native void nglMatrixMultfEXT(int matrixMode, long m);

    public static void glMatrixMultfEXT(int matrixMode, FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixMultfEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultdEXT ] ---

    public static native void nglMatrixMultdEXT(int matrixMode, long m);

    public static void glMatrixMultdEXT(int matrixMode, DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixMultdEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixLoadIdentityEXT ] ---

    public static native void glMatrixLoadIdentityEXT(int matrixMode);

    // --- [ glMatrixRotatefEXT ] ---

    public static native void glMatrixRotatefEXT(int matrixMode, float angle, float x, float y, float z);

    // --- [ glMatrixRotatedEXT ] ---

    public static native void glMatrixRotatedEXT(int matrixMode, double angle, double x, double y, double z);

    // --- [ glMatrixScalefEXT ] ---

    public static native void glMatrixScalefEXT(int matrixMode, float x, float y, float z);

    // --- [ glMatrixScaledEXT ] ---

    public static native void glMatrixScaledEXT(int matrixMode, double x, double y, double z);

    // --- [ glMatrixTranslatefEXT ] ---

    public static native void glMatrixTranslatefEXT(int matrixMode, float x, float y, float z);

    // --- [ glMatrixTranslatedEXT ] ---

    public static native void glMatrixTranslatedEXT(int matrixMode, double x, double y, double z);

    // --- [ glMatrixOrthoEXT ] ---

    public static native void glMatrixOrthoEXT(int matrixMode, double l, double r, double b, double t, double n, double f);

    // --- [ glMatrixFrustumEXT ] ---

    public static native void glMatrixFrustumEXT(int matrixMode, double l, double r, double b, double t, double n, double f);

    // --- [ glMatrixPushEXT ] ---

    public static native void glMatrixPushEXT(int matrixMode);

    // --- [ glMatrixPopEXT ] ---

    public static native void glMatrixPopEXT(int matrixMode);

    // --- [ glTextureParameteriEXT ] ---

    public static native void glTextureParameteriEXT(int texture, int target, int pname, int param);

    // --- [ glTextureParameterivEXT ] ---

    public static native void nglTextureParameterivEXT(int texture, int target, int pname, long param);

    public static void glTextureParameterivEXT(int texture, int target, int pname, IntBuffer param) {
        if (CHECKS) {
            check(param, 4);
        }
        nglTextureParameterivEXT(texture, target, pname, memAddress(param));
    }

    // --- [ glTextureParameterfEXT ] ---

    public static native void glTextureParameterfEXT(int texture, int target, int pname, float param);

    // --- [ glTextureParameterfvEXT ] ---

    public static native void nglTextureParameterfvEXT(int texture, int target, int pname, long param);

    public static void glTextureParameterfvEXT(int texture, int target, int pname, FloatBuffer param) {
        if (CHECKS) {
            check(param, 4);
        }
        nglTextureParameterfvEXT(texture, target, pname, memAddress(param));
    }

    // --- [ glTextureImage1DEXT ] ---

    public static native void nglTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

    public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTextureImage2DEXT ] ---

    public static native void nglTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

    public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTextureSubImage1DEXT ] ---

    public static native void nglTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, long pixels);

    public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, long pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, pixels);
    }

    public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    // --- [ glTextureSubImage2DEXT ] ---

    public static native void nglTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    // --- [ glCopyTextureImage1DEXT ] ---

    public static native void glCopyTextureImage1DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int border);

    // --- [ glCopyTextureImage2DEXT ] ---

    public static native void glCopyTextureImage2DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int height, int border);

    // --- [ glCopyTextureSubImage1DEXT ] ---

    public static native void glCopyTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int x, int y, int width);

    // --- [ glCopyTextureSubImage2DEXT ] ---

    public static native void glCopyTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);

    // --- [ glGetTextureImageEXT ] ---

    public static native void nglGetTextureImageEXT(int texture, int target, int level, int format, int type, long pixels);

    public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, ByteBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, long pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, pixels);
    }

    public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, ShortBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, IntBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, FloatBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, DoubleBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    // --- [ glGetTextureParameterfvEXT ] ---

    public static native void nglGetTextureParameterfvEXT(int texture, int target, int pname, long params);

    public static void glGetTextureParameterfvEXT(int texture, int target, int pname, FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterfvEXT(texture, target, pname, memAddress(params));
    }

    public static float glGetTextureParameterfEXT(int texture, int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTextureParameterfvEXT(texture, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameterivEXT ] ---

    public static native void nglGetTextureParameterivEXT(int texture, int target, int pname, long params);

    public static void glGetTextureParameterivEXT(int texture, int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterivEXT(texture, target, pname, memAddress(params));
    }

    public static int glGetTextureParameteriEXT(int texture, int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameterivEXT(texture, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureLevelParameterfvEXT ] ---

    public static native void nglGetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, long params);

    public static void glGetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureLevelParameterfvEXT(texture, target, level, pname, memAddress(params));
    }

    public static float glGetTextureLevelParameterfEXT(int texture, int target, int level, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTextureLevelParameterfvEXT(texture, target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureLevelParameterivEXT ] ---

    public static native void nglGetTextureLevelParameterivEXT(int texture, int target, int level, int pname, long params);

    public static void glGetTextureLevelParameterivEXT(int texture, int target, int level, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureLevelParameterivEXT(texture, target, level, pname, memAddress(params));
    }

    public static int glGetTextureLevelParameteriEXT(int texture, int target, int level, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureLevelParameterivEXT(texture, target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTextureImage3DEXT ] ---

    public static native void nglTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels);

    public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTextureSubImage3DEXT ] ---

    public static native void nglTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

    public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    // --- [ glCopyTextureSubImage3DEXT ] ---

    public static native void glCopyTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height);

    // --- [ glBindMultiTextureEXT ] ---

    public static native void glBindMultiTextureEXT(int texunit, int target, int texture);

    // --- [ glMultiTexCoordPointerEXT ] ---

    public static native void nglMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, long pointer);

    public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, ByteBuffer pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
    }

    public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, long pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, pointer);
    }

    public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, ShortBuffer pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
    }

    public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, IntBuffer pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
    }

    public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, FloatBuffer pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
    }

    // --- [ glMultiTexEnvfEXT ] ---

    public static native void glMultiTexEnvfEXT(int texunit, int target, int pname, float param);

    // --- [ glMultiTexEnvfvEXT ] ---

    public static native void nglMultiTexEnvfvEXT(int texunit, int target, int pname, long params);

    public static void glMultiTexEnvfvEXT(int texunit, int target, int pname, FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexEnvfvEXT(texunit, target, pname, memAddress(params));
    }

    // --- [ glMultiTexEnviEXT ] ---

    public static native void glMultiTexEnviEXT(int texunit, int target, int pname, int param);

    // --- [ glMultiTexEnvivEXT ] ---

    public static native void nglMultiTexEnvivEXT(int texunit, int target, int pname, long params);

    public static void glMultiTexEnvivEXT(int texunit, int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexEnvivEXT(texunit, target, pname, memAddress(params));
    }

    // --- [ glMultiTexGendEXT ] ---

    public static native void glMultiTexGendEXT(int texunit, int coord, int pname, double param);

    // --- [ glMultiTexGendvEXT ] ---

    public static native void nglMultiTexGendvEXT(int texunit, int coord, int pname, long params);

    public static void glMultiTexGendvEXT(int texunit, int coord, int pname, DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexGendvEXT(texunit, coord, pname, memAddress(params));
    }

    // --- [ glMultiTexGenfEXT ] ---

    public static native void glMultiTexGenfEXT(int texunit, int coord, int pname, float param);

    // --- [ glMultiTexGenfvEXT ] ---

    public static native void nglMultiTexGenfvEXT(int texunit, int coord, int pname, long params);

    public static void glMultiTexGenfvEXT(int texunit, int coord, int pname, FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexGenfvEXT(texunit, coord, pname, memAddress(params));
    }

    // --- [ glMultiTexGeniEXT ] ---

    public static native void glMultiTexGeniEXT(int texunit, int coord, int pname, int param);

    // --- [ glMultiTexGenivEXT ] ---

    public static native void nglMultiTexGenivEXT(int texunit, int coord, int pname, long params);

    public static void glMultiTexGenivEXT(int texunit, int coord, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexGenivEXT(texunit, coord, pname, memAddress(params));
    }

    // --- [ glGetMultiTexEnvfvEXT ] ---

    public static native void nglGetMultiTexEnvfvEXT(int texunit, int target, int pname, long params);

    public static void glGetMultiTexEnvfvEXT(int texunit, int target, int pname, FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexEnvfvEXT(texunit, target, pname, memAddress(params));
    }

    public static float glGetMultiTexEnvfEXT(int texunit, int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMultiTexEnvfvEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexEnvivEXT ] ---

    public static native void nglGetMultiTexEnvivEXT(int texunit, int target, int pname, long params);

    public static void glGetMultiTexEnvivEXT(int texunit, int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexEnvivEXT(texunit, target, pname, memAddress(params));
    }

    public static int glGetMultiTexEnviEXT(int texunit, int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexEnvivEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexGendvEXT ] ---

    public static native void nglGetMultiTexGendvEXT(int texunit, int coord, int pname, long params);

    public static void glGetMultiTexGendvEXT(int texunit, int coord, int pname, DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexGendvEXT(texunit, coord, pname, memAddress(params));
    }

    public static double glGetMultiTexGendEXT(int texunit, int coord, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetMultiTexGendvEXT(texunit, coord, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexGenfvEXT ] ---

    public static native void nglGetMultiTexGenfvEXT(int texunit, int coord, int pname, long params);

    public static void glGetMultiTexGenfvEXT(int texunit, int coord, int pname, FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexGenfvEXT(texunit, coord, pname, memAddress(params));
    }

    public static float glGetMultiTexGenfEXT(int texunit, int coord, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMultiTexGenfvEXT(texunit, coord, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexGenivEXT ] ---

    public static native void nglGetMultiTexGenivEXT(int texunit, int coord, int pname, long params);

    public static void glGetMultiTexGenivEXT(int texunit, int coord, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexGenivEXT(texunit, coord, pname, memAddress(params));
    }

    public static int glGetMultiTexGeniEXT(int texunit, int coord, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexGenivEXT(texunit, coord, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMultiTexParameteriEXT ] ---

    public static native void glMultiTexParameteriEXT(int texunit, int target, int pname, int param);

    // --- [ glMultiTexParameterivEXT ] ---

    public static native void nglMultiTexParameterivEXT(int texunit, int target, int pname, long param);

    public static void glMultiTexParameterivEXT(int texunit, int target, int pname, IntBuffer param) {
        if (CHECKS) {
            check(param, 4);
        }
        nglMultiTexParameterivEXT(texunit, target, pname, memAddress(param));
    }

    // --- [ glMultiTexParameterfEXT ] ---

    public static native void glMultiTexParameterfEXT(int texunit, int target, int pname, float param);

    // --- [ glMultiTexParameterfvEXT ] ---

    public static native void nglMultiTexParameterfvEXT(int texunit, int target, int pname, long param);

    public static void glMultiTexParameterfvEXT(int texunit, int target, int pname, FloatBuffer param) {
        if (CHECKS) {
            check(param, 4);
        }
        nglMultiTexParameterfvEXT(texunit, target, pname, memAddress(param));
    }

    // --- [ glMultiTexImage1DEXT ] ---

    public static native void nglMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

    public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glMultiTexImage2DEXT ] ---

    public static native void nglMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

    public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glMultiTexSubImage1DEXT ] ---

    public static native void nglMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, long pixels);

    public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, long pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, pixels);
    }

    public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    // --- [ glMultiTexSubImage2DEXT ] ---

    public static native void nglMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    // --- [ glCopyMultiTexImage1DEXT ] ---

    public static native void glCopyMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int border);

    // --- [ glCopyMultiTexImage2DEXT ] ---

    public static native void glCopyMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int height, int border);

    // --- [ glCopyMultiTexSubImage1DEXT ] ---

    public static native void glCopyMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int x, int y, int width);

    // --- [ glCopyMultiTexSubImage2DEXT ] ---

    public static native void glCopyMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);

    // --- [ glGetMultiTexImageEXT ] ---

    public static native void nglGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, long pixels);

    public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, ByteBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, long pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, pixels);
    }

    public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, ShortBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, IntBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, FloatBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, DoubleBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    // --- [ glGetMultiTexParameterfvEXT ] ---

    public static native void nglGetMultiTexParameterfvEXT(int texunit, int target, int pname, long params);

    public static void glGetMultiTexParameterfvEXT(int texunit, int target, int pname, FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexParameterfvEXT(texunit, target, pname, memAddress(params));
    }

    public static float glGetMultiTexParameterfEXT(int texunit, int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMultiTexParameterfvEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexParameterivEXT ] ---

    public static native void nglGetMultiTexParameterivEXT(int texunit, int target, int pname, long params);

    public static void glGetMultiTexParameterivEXT(int texunit, int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexParameterivEXT(texunit, target, pname, memAddress(params));
    }

    public static int glGetMultiTexParameteriEXT(int texunit, int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexParameterivEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexLevelParameterfvEXT ] ---

    public static native void nglGetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, long params);

    public static void glGetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, memAddress(params));
    }

    public static float glGetMultiTexLevelParameterfEXT(int texunit, int target, int level, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexLevelParameterivEXT ] ---

    public static native void nglGetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, long params);

    public static void glGetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, memAddress(params));
    }

    public static int glGetMultiTexLevelParameteriEXT(int texunit, int target, int level, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMultiTexImage3DEXT ] ---

    public static native void nglMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels);

    public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glMultiTexSubImage3DEXT ] ---

    public static native void nglMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

    public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    // --- [ glCopyMultiTexSubImage3DEXT ] ---

    public static native void glCopyMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height);

    // --- [ glEnableClientStateIndexedEXT ] ---

    public static native void glEnableClientStateIndexedEXT(int array, int index);

    // --- [ glDisableClientStateIndexedEXT ] ---

    public static native void glDisableClientStateIndexedEXT(int array, int index);

    // --- [ glEnableClientStateiEXT ] ---

    public static native void glEnableClientStateiEXT(int array, int index);

    // --- [ glDisableClientStateiEXT ] ---

    public static native void glDisableClientStateiEXT(int array, int index);

    // --- [ glGetFloatIndexedvEXT ] ---

    public static native void nglGetFloatIndexedvEXT(int target, int index, long params);

    public static void glGetFloatIndexedvEXT(int target, int index, FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFloatIndexedvEXT(target, index, memAddress(params));
    }

    public static float glGetFloatIndexedEXT(int target, int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetFloatIndexedvEXT(target, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetDoubleIndexedvEXT ] ---

    public static native void nglGetDoubleIndexedvEXT(int target, int index, long params);

    public static void glGetDoubleIndexedvEXT(int target, int index, DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetDoubleIndexedvEXT(target, index, memAddress(params));
    }

    public static double glGetDoubleIndexedEXT(int target, int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetDoubleIndexedvEXT(target, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetPointerIndexedvEXT ] ---

    public static native void nglGetPointerIndexedvEXT(int target, int index, long params);

    public static void glGetPointerIndexedvEXT(int target, int index, PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetPointerIndexedvEXT(target, index, memAddress(params));
    }

    public static long glGetPointerIndexedEXT(int target, int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetPointerIndexedvEXT(target, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFloati_vEXT ] ---

    public static native void nglGetFloati_vEXT(int pname, int index, long params);

    public static void glGetFloati_vEXT(int pname, int index, FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFloati_vEXT(pname, index, memAddress(params));
    }

    public static float glGetFloatiEXT(int pname, int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetFloati_vEXT(pname, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetDoublei_vEXT ] ---

    public static native void nglGetDoublei_vEXT(int pname, int index, long params);

    public static void glGetDoublei_vEXT(int pname, int index, DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetDoublei_vEXT(pname, index, memAddress(params));
    }

    public static double glGetDoubleiEXT(int pname, int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetDoublei_vEXT(pname, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetPointeri_vEXT ] ---

    public static native void nglGetPointeri_vEXT(int pname, int index, long params);

    public static void glGetPointeri_vEXT(int pname, int index, PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetPointeri_vEXT(pname, index, memAddress(params));
    }

    public static long glGetPointeriEXT(int pname, int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetPointeri_vEXT(pname, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glEnableIndexedEXT ] ---

    public static native void glEnableIndexedEXT(int cap, int index);

    // --- [ glDisableIndexedEXT ] ---

    public static native void glDisableIndexedEXT(int cap, int index);

    // --- [ glIsEnabledIndexedEXT ] ---

    public static native boolean glIsEnabledIndexedEXT(int target, int index);

    // --- [ glGetIntegerIndexedvEXT ] ---

    public static native void nglGetIntegerIndexedvEXT(int target, int index, long params);

    public static void glGetIntegerIndexedvEXT(int target, int index, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetIntegerIndexedvEXT(target, index, memAddress(params));
    }

    public static int glGetIntegerIndexedEXT(int target, int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetIntegerIndexedvEXT(target, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetBooleanIndexedvEXT ] ---

    public static native void nglGetBooleanIndexedvEXT(int target, int index, long params);

    public static void glGetBooleanIndexedvEXT(int target, int index, ByteBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBooleanIndexedvEXT(target, index, memAddress(params));
    }

    public static boolean glGetBooleanIndexedEXT(int target, int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer params = stack.calloc(1);
            nglGetBooleanIndexedvEXT(target, index, memAddress(params));
            return params.get(0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedProgramStringEXT ] ---

    public static native void nglNamedProgramStringEXT(int program, int target, int format, int len, long string);

    public static void glNamedProgramStringEXT(int program, int target, int format, ByteBuffer string) {
        nglNamedProgramStringEXT(program, target, format, string.remaining(), memAddress(string));
    }

    // --- [ glNamedProgramLocalParameter4dEXT ] ---

    public static native void glNamedProgramLocalParameter4dEXT(int program, int target, int index, double x, double y, double z, double w);

    // --- [ glNamedProgramLocalParameter4dvEXT ] ---

    public static native void nglNamedProgramLocalParameter4dvEXT(int program, int target, int index, long params);

    public static void glNamedProgramLocalParameter4dvEXT(int program, int target, int index, DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglNamedProgramLocalParameter4dvEXT(program, target, index, memAddress(params));
    }

    // --- [ glNamedProgramLocalParameter4fEXT ] ---

    public static native void glNamedProgramLocalParameter4fEXT(int program, int target, int index, float x, float y, float z, float w);

    // --- [ glNamedProgramLocalParameter4fvEXT ] ---

    public static native void nglNamedProgramLocalParameter4fvEXT(int program, int target, int index, long params);

    public static void glNamedProgramLocalParameter4fvEXT(int program, int target, int index, FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglNamedProgramLocalParameter4fvEXT(program, target, index, memAddress(params));
    }

    // --- [ glGetNamedProgramLocalParameterdvEXT ] ---

    public static native void nglGetNamedProgramLocalParameterdvEXT(int program, int target, int index, long params);

    public static void glGetNamedProgramLocalParameterdvEXT(int program, int target, int index, DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetNamedProgramLocalParameterdvEXT(program, target, index, memAddress(params));
    }

    // --- [ glGetNamedProgramLocalParameterfvEXT ] ---

    public static native void nglGetNamedProgramLocalParameterfvEXT(int program, int target, int index, long params);

    public static void glGetNamedProgramLocalParameterfvEXT(int program, int target, int index, FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetNamedProgramLocalParameterfvEXT(program, target, index, memAddress(params));
    }

    // --- [ glGetNamedProgramivEXT ] ---

    public static native void nglGetNamedProgramivEXT(int program, int target, int pname, long params);

    public static void glGetNamedProgramivEXT(int program, int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedProgramivEXT(program, target, pname, memAddress(params));
    }

    public static int glGetNamedProgramiEXT(int program, int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedProgramivEXT(program, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedProgramStringEXT ] ---

    public static native void nglGetNamedProgramStringEXT(int program, int target, int pname, long string);

    public static void glGetNamedProgramStringEXT(int program, int target, int pname, ByteBuffer string) {
        if (CHECKS) {
            if (DEBUG) {
                check(string, glGetNamedProgramiEXT(program, target, ARBVertexProgram.GL_PROGRAM_LENGTH_ARB));
            }
        }
        nglGetNamedProgramStringEXT(program, target, pname, memAddress(string));
    }

    // --- [ glCompressedTextureImage3DEXT ] ---

    public static native void nglCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    public static void glCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        nglCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    public static void glCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
        nglCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTextureImage2DEXT ] ---

    public static native void nglCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

    public static void glCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        nglCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, imageSize, data);
    }

    public static void glCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
        nglCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTextureImage1DEXT ] ---

    public static native void nglCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, long data);

    public static void glCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, long data) {
        nglCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, imageSize, data);
    }

    public static void glCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, ByteBuffer data) {
        nglCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTextureSubImage3DEXT ] ---

    public static native void nglCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    public static void glCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        nglCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    public static void glCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
        nglCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTextureSubImage2DEXT ] ---

    public static native void nglCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

    public static void glCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        nglCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    public static void glCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
        nglCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTextureSubImage1DEXT ] ---

    public static native void nglCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, long data);

    public static void glCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, long data) {
        nglCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, imageSize, data);
    }

    public static void glCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, ByteBuffer data) {
        nglCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, data.remaining(), memAddress(data));
    }

    // --- [ glGetCompressedTextureImageEXT ] ---

    public static native void nglGetCompressedTextureImageEXT(int texture, int target, int level, long img);

    public static void glGetCompressedTextureImageEXT(int texture, int target, int level, ByteBuffer img) {
        if (CHECKS) {
            if (DEBUG) {
                check(img, glGetTextureLevelParameteriEXT(texture, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
            }
        }
        nglGetCompressedTextureImageEXT(texture, target, level, memAddress(img));
    }

    public static void glGetCompressedTextureImageEXT(int texture, int target, int level, long img) {
        nglGetCompressedTextureImageEXT(texture, target, level, img);
    }

    // --- [ glCompressedMultiTexImage3DEXT ] ---

    public static native void nglCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    public static void glCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        nglCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    public static void glCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
        nglCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedMultiTexImage2DEXT ] ---

    public static native void nglCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

    public static void glCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        nglCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, imageSize, data);
    }

    public static void glCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
        nglCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedMultiTexImage1DEXT ] ---

    public static native void nglCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, long data);

    public static void glCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, long data) {
        nglCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, imageSize, data);
    }

    public static void glCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, ByteBuffer data) {
        nglCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedMultiTexSubImage3DEXT ] ---

    public static native void nglCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    public static void glCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        nglCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    public static void glCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
        nglCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedMultiTexSubImage2DEXT ] ---

    public static native void nglCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

    public static void glCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        nglCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    public static void glCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
        nglCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedMultiTexSubImage1DEXT ] ---

    public static native void nglCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, long data);

    public static void glCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, long data) {
        nglCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, imageSize, data);
    }

    public static void glCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, ByteBuffer data) {
        nglCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, data.remaining(), memAddress(data));
    }

    // --- [ glGetCompressedMultiTexImageEXT ] ---

    public static native void nglGetCompressedMultiTexImageEXT(int texunit, int target, int level, long img);

    public static void glGetCompressedMultiTexImageEXT(int texunit, int target, int level, ByteBuffer img) {
        if (CHECKS) {
            if (DEBUG) {
                check(img, glGetMultiTexLevelParameteriEXT(texunit, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
            }
        }
        nglGetCompressedMultiTexImageEXT(texunit, target, level, memAddress(img));
    }

    public static void glGetCompressedMultiTexImageEXT(int texunit, int target, int level, long img) {
        nglGetCompressedMultiTexImageEXT(texunit, target, level, img);
    }

    // --- [ glMatrixLoadTransposefEXT ] ---

    public static native void nglMatrixLoadTransposefEXT(int matrixMode, long m);

    public static void glMatrixLoadTransposefEXT(int matrixMode, FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixLoadTransposefEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixLoadTransposedEXT ] ---

    public static native void nglMatrixLoadTransposedEXT(int matrixMode, long m);

    public static void glMatrixLoadTransposedEXT(int matrixMode, DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixLoadTransposedEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultTransposefEXT ] ---

    public static native void nglMatrixMultTransposefEXT(int matrixMode, long m);

    public static void glMatrixMultTransposefEXT(int matrixMode, FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixMultTransposefEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultTransposedEXT ] ---

    public static native void nglMatrixMultTransposedEXT(int matrixMode, long m);

    public static void glMatrixMultTransposedEXT(int matrixMode, DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixMultTransposedEXT(matrixMode, memAddress(m));
    }

    // --- [ glNamedBufferDataEXT ] ---

    public static native void nglNamedBufferDataEXT(int buffer, long size, long data, int usage);

    public static void glNamedBufferDataEXT(int buffer, long size, int usage) {
        nglNamedBufferDataEXT(buffer, size, NULL, usage);
    }

    public static void glNamedBufferDataEXT(int buffer, ByteBuffer data, int usage) {
        nglNamedBufferDataEXT(buffer, data.remaining(), memAddress(data), usage);
    }

    public static void glNamedBufferDataEXT(int buffer, ShortBuffer data, int usage) {
        nglNamedBufferDataEXT(buffer, data.remaining() << 1, memAddress(data), usage);
    }

    public static void glNamedBufferDataEXT(int buffer, IntBuffer data, int usage) {
        nglNamedBufferDataEXT(buffer, data.remaining() << 2, memAddress(data), usage);
    }

    public static void glNamedBufferDataEXT(int buffer, FloatBuffer data, int usage) {
        nglNamedBufferDataEXT(buffer, data.remaining() << 2, memAddress(data), usage);
    }

    public static void glNamedBufferDataEXT(int buffer, DoubleBuffer data, int usage) {
        nglNamedBufferDataEXT(buffer, data.remaining() << 3, memAddress(data), usage);
    }

    // --- [ glNamedBufferSubDataEXT ] ---

    public static native void nglNamedBufferSubDataEXT(int buffer, long offset, long size, long data);

    public static void glNamedBufferSubDataEXT(int buffer, long offset, ByteBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, data.remaining(), memAddress(data));
    }

    public static void glNamedBufferSubDataEXT(int buffer, long offset, ShortBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, data.remaining() << 1, memAddress(data));
    }

    public static void glNamedBufferSubDataEXT(int buffer, long offset, IntBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, data.remaining() << 2, memAddress(data));
    }

    public static void glNamedBufferSubDataEXT(int buffer, long offset, FloatBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, data.remaining() << 2, memAddress(data));
    }

    public static void glNamedBufferSubDataEXT(int buffer, long offset, DoubleBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, data.remaining() << 3, memAddress(data));
    }

    // --- [ glMapNamedBufferEXT ] ---

    public static native long nglMapNamedBufferEXT(int buffer, int access);

    public static ByteBuffer glMapNamedBufferEXT(int buffer, int access) {
        long __result = nglMapNamedBufferEXT(buffer, access);
        return memByteBuffer(__result, glGetNamedBufferParameteriEXT(buffer, GL15.GL_BUFFER_SIZE));
    }

    public static ByteBuffer glMapNamedBufferEXT(int buffer, int access, ByteBuffer old_buffer) {
        long __result = nglMapNamedBufferEXT(buffer, access);
        int length = glGetNamedBufferParameteriEXT(buffer, GL15.GL_BUFFER_SIZE);
		return apiGetMappedBuffer(old_buffer, __result, length);
    }

    public static ByteBuffer glMapNamedBufferEXT(int buffer, int access, long length, ByteBuffer old_buffer) {
        long __result = nglMapNamedBufferEXT(buffer, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glUnmapNamedBufferEXT ] ---

    public static native boolean glUnmapNamedBufferEXT(int buffer);

    // --- [ glGetNamedBufferParameterivEXT ] ---

    public static native void nglGetNamedBufferParameterivEXT(int buffer, int pname, long params);

    public static void glGetNamedBufferParameterivEXT(int buffer, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedBufferParameterivEXT(buffer, pname, memAddress(params));
    }

    public static int glGetNamedBufferParameteriEXT(int buffer, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedBufferParameterivEXT(buffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedBufferSubDataEXT ] ---

    public static native void nglGetNamedBufferSubDataEXT(int buffer, long offset, long size, long data);

    public static void glGetNamedBufferSubDataEXT(int buffer, long offset, ByteBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining(), memAddress(data));
    }

    public static void glGetNamedBufferSubDataEXT(int buffer, long offset, ShortBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining() << 1, memAddress(data));
    }

    public static void glGetNamedBufferSubDataEXT(int buffer, long offset, IntBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining() << 2, memAddress(data));
    }

    public static void glGetNamedBufferSubDataEXT(int buffer, long offset, FloatBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining() << 2, memAddress(data));
    }

    public static void glGetNamedBufferSubDataEXT(int buffer, long offset, DoubleBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining() << 3, memAddress(data));
    }

    // --- [ glProgramUniform1fEXT ] ---

    public static native void glProgramUniform1fEXT(int program, int location, float v0);

    // --- [ glProgramUniform2fEXT ] ---

    public static native void glProgramUniform2fEXT(int program, int location, float v0, float v1);

    // --- [ glProgramUniform3fEXT ] ---

    public static native void glProgramUniform3fEXT(int program, int location, float v0, float v1, float v2);

    // --- [ glProgramUniform4fEXT ] ---

    public static native void glProgramUniform4fEXT(int program, int location, float v0, float v1, float v2, float v3);

    // --- [ glProgramUniform1iEXT ] ---

    public static native void glProgramUniform1iEXT(int program, int location, int v0);

    // --- [ glProgramUniform2iEXT ] ---

    public static native void glProgramUniform2iEXT(int program, int location, int v0, int v1);

    // --- [ glProgramUniform3iEXT ] ---

    public static native void glProgramUniform3iEXT(int program, int location, int v0, int v1, int v2);

    // --- [ glProgramUniform4iEXT ] ---

    public static native void glProgramUniform4iEXT(int program, int location, int v0, int v1, int v2, int v3);

    // --- [ glProgramUniform1fvEXT ] ---

    public static native void nglProgramUniform1fvEXT(int program, int location, int count, long value);

    public static void glProgramUniform1fvEXT(int program, int location, FloatBuffer value) {
        nglProgramUniform1fvEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2fvEXT ] ---

    public static native void nglProgramUniform2fvEXT(int program, int location, int count, long value);

    public static void glProgramUniform2fvEXT(int program, int location, FloatBuffer value) {
        nglProgramUniform2fvEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3fvEXT ] ---

    public static native void nglProgramUniform3fvEXT(int program, int location, int count, long value);

    public static void glProgramUniform3fvEXT(int program, int location, FloatBuffer value) {
        nglProgramUniform3fvEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4fvEXT ] ---

    public static native void nglProgramUniform4fvEXT(int program, int location, int count, long value);

    public static void glProgramUniform4fvEXT(int program, int location, FloatBuffer value) {
        nglProgramUniform4fvEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform1ivEXT ] ---

    public static native void nglProgramUniform1ivEXT(int program, int location, int count, long value);

    public static void glProgramUniform1ivEXT(int program, int location, IntBuffer value) {
        nglProgramUniform1ivEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2ivEXT ] ---

    public static native void nglProgramUniform2ivEXT(int program, int location, int count, long value);

    public static void glProgramUniform2ivEXT(int program, int location, IntBuffer value) {
        nglProgramUniform2ivEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3ivEXT ] ---

    public static native void nglProgramUniform3ivEXT(int program, int location, int count, long value);

    public static void glProgramUniform3ivEXT(int program, int location, IntBuffer value) {
        nglProgramUniform3ivEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4ivEXT ] ---

    public static native void nglProgramUniform4ivEXT(int program, int location, int count, long value);

    public static void glProgramUniform4ivEXT(int program, int location, IntBuffer value) {
        nglProgramUniform4ivEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2fvEXT ] ---

    public static native void nglProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix2fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
        nglProgramUniformMatrix2fvEXT(program, location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3fvEXT ] ---

    public static native void nglProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix3fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
        nglProgramUniformMatrix3fvEXT(program, location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4fvEXT ] ---

    public static native void nglProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix4fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
        nglProgramUniformMatrix4fvEXT(program, location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x3fvEXT ] ---

    public static native void nglProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix2x3fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
        nglProgramUniformMatrix2x3fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x2fvEXT ] ---

    public static native void nglProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix3x2fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
        nglProgramUniformMatrix3x2fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x4fvEXT ] ---

    public static native void nglProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix2x4fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
        nglProgramUniformMatrix2x4fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x2fvEXT ] ---

    public static native void nglProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix4x2fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
        nglProgramUniformMatrix4x2fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x4fvEXT ] ---

    public static native void nglProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix3x4fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
        nglProgramUniformMatrix3x4fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x3fvEXT ] ---

    public static native void nglProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix4x3fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
        nglProgramUniformMatrix4x3fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glTextureBufferEXT ] ---

    public static native void glTextureBufferEXT(int texture, int target, int internalformat, int buffer);

    // --- [ glMultiTexBufferEXT ] ---

    public static native void glMultiTexBufferEXT(int texunit, int target, int internalformat, int buffer);

    // --- [ glTextureParameterIivEXT ] ---

    public static native void nglTextureParameterIivEXT(int texture, int target, int pname, long params);

    public static void glTextureParameterIivEXT(int texture, int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTextureParameterIivEXT(texture, target, pname, memAddress(params));
    }

    // --- [ glTextureParameterIuivEXT ] ---

    public static native void nglTextureParameterIuivEXT(int texture, int target, int pname, long params);

    public static void glTextureParameterIuivEXT(int texture, int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTextureParameterIuivEXT(texture, target, pname, memAddress(params));
    }

    // --- [ glGetTextureParameterIivEXT ] ---

    public static native void nglGetTextureParameterIivEXT(int texture, int target, int pname, long params);

    public static void glGetTextureParameterIivEXT(int texture, int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterIivEXT(texture, target, pname, memAddress(params));
    }

    public static int glGetTextureParameterIiEXT(int texture, int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameterIivEXT(texture, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameterIuivEXT ] ---

    public static native void nglGetTextureParameterIuivEXT(int texture, int target, int pname, long params);

    public static void glGetTextureParameterIuivEXT(int texture, int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterIuivEXT(texture, target, pname, memAddress(params));
    }

    public static int glGetTextureParameterIuiEXT(int texture, int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameterIuivEXT(texture, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMultiTexParameterIivEXT ] ---

    public static native void nglMultiTexParameterIivEXT(int texunit, int target, int pname, long params);

    public static void glMultiTexParameterIivEXT(int texunit, int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexParameterIivEXT(texunit, target, pname, memAddress(params));
    }

    // --- [ glMultiTexParameterIuivEXT ] ---

    public static native void nglMultiTexParameterIuivEXT(int texunit, int target, int pname, long params);

    public static void glMultiTexParameterIuivEXT(int texunit, int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexParameterIuivEXT(texunit, target, pname, memAddress(params));
    }

    // --- [ glGetMultiTexParameterIivEXT ] ---

    public static native void nglGetMultiTexParameterIivEXT(int texunit, int target, int pname, long params);

    public static void glGetMultiTexParameterIivEXT(int texunit, int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexParameterIivEXT(texunit, target, pname, memAddress(params));
    }

    public static int glGetMultiTexParameterIiEXT(int texunit, int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexParameterIivEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexParameterIuivEXT ] ---

    public static native void nglGetMultiTexParameterIuivEXT(int texunit, int target, int pname, long params);

    public static void glGetMultiTexParameterIuivEXT(int texunit, int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexParameterIuivEXT(texunit, target, pname, memAddress(params));
    }

    public static int glGetMultiTexParameterIuiEXT(int texunit, int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexParameterIuivEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glProgramUniform1uiEXT ] ---

    public static native void glProgramUniform1uiEXT(int program, int location, int v0);

    // --- [ glProgramUniform2uiEXT ] ---

    public static native void glProgramUniform2uiEXT(int program, int location, int v0, int v1);

    // --- [ glProgramUniform3uiEXT ] ---

    public static native void glProgramUniform3uiEXT(int program, int location, int v0, int v1, int v2);

    // --- [ glProgramUniform4uiEXT ] ---

    public static native void glProgramUniform4uiEXT(int program, int location, int v0, int v1, int v2, int v3);

    // --- [ glProgramUniform1uivEXT ] ---

    public static native void nglProgramUniform1uivEXT(int program, int location, int count, long value);

    public static void glProgramUniform1uivEXT(int program, int location, IntBuffer value) {
        nglProgramUniform1uivEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2uivEXT ] ---

    public static native void nglProgramUniform2uivEXT(int program, int location, int count, long value);

    public static void glProgramUniform2uivEXT(int program, int location, IntBuffer value) {
        nglProgramUniform2uivEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3uivEXT ] ---

    public static native void nglProgramUniform3uivEXT(int program, int location, int count, long value);

    public static void glProgramUniform3uivEXT(int program, int location, IntBuffer value) {
        nglProgramUniform3uivEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4uivEXT ] ---

    public static native void nglProgramUniform4uivEXT(int program, int location, int count, long value);

    public static void glProgramUniform4uivEXT(int program, int location, IntBuffer value) {
        nglProgramUniform4uivEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glNamedProgramLocalParameters4fvEXT ] ---

    public static native void nglNamedProgramLocalParameters4fvEXT(int program, int target, int index, int count, long params);

    public static void glNamedProgramLocalParameters4fvEXT(int program, int target, int index, FloatBuffer params) {
        nglNamedProgramLocalParameters4fvEXT(program, target, index, params.remaining() >> 2, memAddress(params));
    }

    // --- [ glNamedProgramLocalParameterI4iEXT ] ---

    public static native void glNamedProgramLocalParameterI4iEXT(int program, int target, int index, int x, int y, int z, int w);

    // --- [ glNamedProgramLocalParameterI4ivEXT ] ---

    public static native void nglNamedProgramLocalParameterI4ivEXT(int program, int target, int index, long params);

    public static void glNamedProgramLocalParameterI4ivEXT(int program, int target, int index, IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglNamedProgramLocalParameterI4ivEXT(program, target, index, memAddress(params));
    }

    // --- [ glNamedProgramLocalParametersI4ivEXT ] ---

    public static native void nglNamedProgramLocalParametersI4ivEXT(int program, int target, int index, int count, long params);

    public static void glNamedProgramLocalParametersI4ivEXT(int program, int target, int index, IntBuffer params) {
        nglNamedProgramLocalParametersI4ivEXT(program, target, index, params.remaining() >> 2, memAddress(params));
    }

    // --- [ glNamedProgramLocalParameterI4uiEXT ] ---

    public static native void glNamedProgramLocalParameterI4uiEXT(int program, int target, int index, int x, int y, int z, int w);

    // --- [ glNamedProgramLocalParameterI4uivEXT ] ---

    public static native void nglNamedProgramLocalParameterI4uivEXT(int program, int target, int index, long params);

    public static void glNamedProgramLocalParameterI4uivEXT(int program, int target, int index, IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglNamedProgramLocalParameterI4uivEXT(program, target, index, memAddress(params));
    }

    // --- [ glNamedProgramLocalParametersI4uivEXT ] ---

    public static native void nglNamedProgramLocalParametersI4uivEXT(int program, int target, int index, int count, long params);

    public static void glNamedProgramLocalParametersI4uivEXT(int program, int target, int index, IntBuffer params) {
        nglNamedProgramLocalParametersI4uivEXT(program, target, index, params.remaining() >> 2, memAddress(params));
    }

    // --- [ glGetNamedProgramLocalParameterIivEXT ] ---

    public static native void nglGetNamedProgramLocalParameterIivEXT(int program, int target, int index, long params);

    public static void glGetNamedProgramLocalParameterIivEXT(int program, int target, int index, IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetNamedProgramLocalParameterIivEXT(program, target, index, memAddress(params));
    }

    // --- [ glGetNamedProgramLocalParameterIuivEXT ] ---

    public static native void nglGetNamedProgramLocalParameterIuivEXT(int program, int target, int index, long params);

    public static void glGetNamedProgramLocalParameterIuivEXT(int program, int target, int index, IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetNamedProgramLocalParameterIuivEXT(program, target, index, memAddress(params));
    }

    // --- [ glNamedRenderbufferStorageEXT ] ---

    public static native void glNamedRenderbufferStorageEXT(int renderbuffer, int internalformat, int width, int height);

    // --- [ glGetNamedRenderbufferParameterivEXT ] ---

    public static native void nglGetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, long params);

    public static void glGetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, memAddress(params));
    }

    public static int glGetNamedRenderbufferParameteriEXT(int renderbuffer, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedRenderbufferStorageMultisampleEXT ] ---

    public static native void glNamedRenderbufferStorageMultisampleEXT(int renderbuffer, int samples, int internalformat, int width, int height);

    // --- [ glNamedRenderbufferStorageMultisampleCoverageEXT ] ---

    public static native void glNamedRenderbufferStorageMultisampleCoverageEXT(int renderbuffer, int coverageSamples, int colorSamples, int internalformat, int width, int height);

    // --- [ glCheckNamedFramebufferStatusEXT ] ---

    public static native int glCheckNamedFramebufferStatusEXT(int framebuffer, int target);

    // --- [ glNamedFramebufferTexture1DEXT ] ---

    public static native void glNamedFramebufferTexture1DEXT(int framebuffer, int attachment, int textarget, int texture, int level);

    // --- [ glNamedFramebufferTexture2DEXT ] ---

    public static native void glNamedFramebufferTexture2DEXT(int framebuffer, int attachment, int textarget, int texture, int level);

    // --- [ glNamedFramebufferTexture3DEXT ] ---

    public static native void glNamedFramebufferTexture3DEXT(int framebuffer, int attachment, int textarget, int texture, int level, int zoffset);

    // --- [ glNamedFramebufferRenderbufferEXT ] ---

    public static native void glNamedFramebufferRenderbufferEXT(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer);

    // --- [ glGetNamedFramebufferAttachmentParameterivEXT ] ---

    public static native void nglGetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, long params);

    public static void glGetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, memAddress(params));
    }

    public static int glGetNamedFramebufferAttachmentParameteriEXT(int framebuffer, int attachment, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenerateTextureMipmapEXT ] ---

    public static native void glGenerateTextureMipmapEXT(int texture, int target);

    // --- [ glGenerateMultiTexMipmapEXT ] ---

    public static native void glGenerateMultiTexMipmapEXT(int texunit, int target);

    // --- [ glFramebufferDrawBufferEXT ] ---

    public static native void glFramebufferDrawBufferEXT(int framebuffer, int mode);

    // --- [ glFramebufferDrawBuffersEXT ] ---

    public static native void nglFramebufferDrawBuffersEXT(int framebuffer, int n, long bufs);

    public static void glFramebufferDrawBuffersEXT(int framebuffer, IntBuffer bufs) {
        nglFramebufferDrawBuffersEXT(framebuffer, bufs.remaining(), memAddress(bufs));
    }

    // --- [ glFramebufferReadBufferEXT ] ---

    public static native void glFramebufferReadBufferEXT(int framebuffer, int mode);

    // --- [ glGetFramebufferParameterivEXT ] ---

    public static native void nglGetFramebufferParameterivEXT(int framebuffer, int pname, long param);

    public static void glGetFramebufferParameterivEXT(int framebuffer, int pname, IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetFramebufferParameterivEXT(framebuffer, pname, memAddress(param));
    }

    public static int glGetFramebufferParameteriEXT(int framebuffer, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetFramebufferParameterivEXT(framebuffer, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedCopyBufferSubDataEXT ] ---

    public static native void glNamedCopyBufferSubDataEXT(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size);

    // --- [ glNamedFramebufferTextureEXT ] ---

    public static native void glNamedFramebufferTextureEXT(int framebuffer, int attachment, int texture, int level);

    // --- [ glNamedFramebufferTextureLayerEXT ] ---

    public static native void glNamedFramebufferTextureLayerEXT(int framebuffer, int attachment, int texture, int level, int layer);

    // --- [ glNamedFramebufferTextureFaceEXT ] ---

    public static native void glNamedFramebufferTextureFaceEXT(int framebuffer, int attachment, int texture, int level, int face);

    // --- [ glTextureRenderbufferEXT ] ---

    public static native void glTextureRenderbufferEXT(int texture, int target, int renderbuffer);

    // --- [ glMultiTexRenderbufferEXT ] ---

    public static native void glMultiTexRenderbufferEXT(int texunit, int target, int renderbuffer);

    // --- [ glVertexArrayVertexOffsetEXT ] ---

    public static native void glVertexArrayVertexOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset);

    // --- [ glVertexArrayColorOffsetEXT ] ---

    public static native void glVertexArrayColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset);

    // --- [ glVertexArrayEdgeFlagOffsetEXT ] ---

    public static native void glVertexArrayEdgeFlagOffsetEXT(int vaobj, int buffer, int stride, long offset);

    // --- [ glVertexArrayIndexOffsetEXT ] ---

    public static native void glVertexArrayIndexOffsetEXT(int vaobj, int buffer, int type, int stride, long offset);

    // --- [ glVertexArrayNormalOffsetEXT ] ---

    public static native void glVertexArrayNormalOffsetEXT(int vaobj, int buffer, int type, int stride, long offset);

    // --- [ glVertexArrayTexCoordOffsetEXT ] ---

    public static native void glVertexArrayTexCoordOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset);

    // --- [ glVertexArrayMultiTexCoordOffsetEXT ] ---

    public static native void glVertexArrayMultiTexCoordOffsetEXT(int vaobj, int buffer, int texunit, int size, int type, int stride, long offset);

    // --- [ glVertexArrayFogCoordOffsetEXT ] ---

    public static native void glVertexArrayFogCoordOffsetEXT(int vaobj, int buffer, int type, int stride, long offset);

    // --- [ glVertexArraySecondaryColorOffsetEXT ] ---

    public static native void glVertexArraySecondaryColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset);

    // --- [ glVertexArrayVertexAttribOffsetEXT ] ---

    public static native void glVertexArrayVertexAttribOffsetEXT(int vaobj, int buffer, int index, int size, int type, boolean normalized, int stride, long offset);

    // --- [ glVertexArrayVertexAttribIOffsetEXT ] ---

    public static native void glVertexArrayVertexAttribIOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset);

    // --- [ glEnableVertexArrayEXT ] ---

    public static native void glEnableVertexArrayEXT(int vaobj, int array);

    // --- [ glDisableVertexArrayEXT ] ---

    public static native void glDisableVertexArrayEXT(int vaobj, int array);

    // --- [ glEnableVertexArrayAttribEXT ] ---

    public static native void glEnableVertexArrayAttribEXT(int vaobj, int index);

    // --- [ glDisableVertexArrayAttribEXT ] ---

    public static native void glDisableVertexArrayAttribEXT(int vaobj, int index);

    // --- [ glGetVertexArrayIntegervEXT ] ---

    public static native void nglGetVertexArrayIntegervEXT(int vaobj, int pname, long param);

    public static void glGetVertexArrayIntegervEXT(int vaobj, int pname, IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayIntegervEXT(vaobj, pname, memAddress(param));
    }

    public static int glGetVertexArrayIntegerEXT(int vaobj, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetVertexArrayIntegervEXT(vaobj, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexArrayPointervEXT ] ---

    public static native void nglGetVertexArrayPointervEXT(int vaobj, int pname, long param);

    public static void glGetVertexArrayPointervEXT(int vaobj, int pname, PointerBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayPointervEXT(vaobj, pname, memAddress(param));
    }

    public static long glGetVertexArrayPointerEXT(int vaobj, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer param = stack.callocPointer(1);
            nglGetVertexArrayPointervEXT(vaobj, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexArrayIntegeri_vEXT ] ---

    public static native void nglGetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, long param);

    public static void glGetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, memAddress(param));
    }

    public static int glGetVertexArrayIntegeriEXT(int vaobj, int index, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexArrayPointeri_vEXT ] ---

    public static native void nglGetVertexArrayPointeri_vEXT(int vaobj, int index, int pname, long param);

    public static void glGetVertexArrayPointeri_vEXT(int vaobj, int index, int pname, PointerBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayPointeri_vEXT(vaobj, index, pname, memAddress(param));
    }

    public static long glGetVertexArrayPointeriEXT(int vaobj, int index, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer param = stack.callocPointer(1);
            nglGetVertexArrayPointeri_vEXT(vaobj, index, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMapNamedBufferRangeEXT ] ---

    public static native long nglMapNamedBufferRangeEXT(int buffer, long offset, long length, int access);

    public static ByteBuffer glMapNamedBufferRangeEXT(int buffer, long offset, long length, int access) {
        long __result = nglMapNamedBufferRangeEXT(buffer, offset, length, access);
        return memByteBuffer(__result, (int)length);
    }

    public static ByteBuffer glMapNamedBufferRangeEXT(int buffer, long offset, long length, int access, ByteBuffer old_buffer) {
        long __result = nglMapNamedBufferRangeEXT(buffer, offset, length, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glFlushMappedNamedBufferRangeEXT ] ---

    public static native void glFlushMappedNamedBufferRangeEXT(int buffer, long offset, long length);

    /** Array version of: {@link #glMatrixLoadfEXT MatrixLoadfEXT} */
    public static void glMatrixLoadfEXT(int matrixMode, float[] m) {
        long __functionAddress = GL.getICD().glMatrixLoadfEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(__functionAddress, matrixMode, m);
    }

    /** Array version of: {@link #glMatrixLoaddEXT MatrixLoaddEXT} */
    public static void glMatrixLoaddEXT(int matrixMode, double[] m) {
        long __functionAddress = GL.getICD().glMatrixLoaddEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(__functionAddress, matrixMode, m);
    }

    /** Array version of: {@link #glMatrixMultfEXT MatrixMultfEXT} */
    public static void glMatrixMultfEXT(int matrixMode, float[] m) {
        long __functionAddress = GL.getICD().glMatrixMultfEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(__functionAddress, matrixMode, m);
    }

    /** Array version of: {@link #glMatrixMultdEXT MatrixMultdEXT} */
    public static void glMatrixMultdEXT(int matrixMode, double[] m) {
        long __functionAddress = GL.getICD().glMatrixMultdEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(__functionAddress, matrixMode, m);
    }

    /** Array version of: {@link #glTextureParameterivEXT TextureParameterivEXT} */
    public static void glTextureParameterivEXT(int texture, int target, int pname, int[] param) {
        long __functionAddress = GL.getICD().glTextureParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 4);
        }
        callPV(__functionAddress, texture, target, pname, param);
    }

    /** Array version of: {@link #glTextureParameterfvEXT TextureParameterfvEXT} */
    public static void glTextureParameterfvEXT(int texture, int target, int pname, float[] param) {
        long __functionAddress = GL.getICD().glTextureParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 4);
        }
        callPV(__functionAddress, texture, target, pname, param);
    }

    /** Array version of: {@link #glTextureImage1DEXT TextureImage1DEXT} */
    public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, internalformat, width, border, format, type, pixels);
    }

    /** Array version of: {@link #glTextureImage1DEXT TextureImage1DEXT} */
    public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, internalformat, width, border, format, type, pixels);
    }

    /** Array version of: {@link #glTextureImage1DEXT TextureImage1DEXT} */
    public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, internalformat, width, border, format, type, pixels);
    }

    /** Array version of: {@link #glTextureImage1DEXT TextureImage1DEXT} */
    public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, internalformat, width, border, format, type, pixels);
    }

    /** Array version of: {@link #glTextureImage2DEXT TextureImage2DEXT} */
    public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, internalformat, width, height, border, format, type, pixels);
    }

    /** Array version of: {@link #glTextureImage2DEXT TextureImage2DEXT} */
    public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, internalformat, width, height, border, format, type, pixels);
    }

    /** Array version of: {@link #glTextureImage2DEXT TextureImage2DEXT} */
    public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, internalformat, width, height, border, format, type, pixels);
    }

    /** Array version of: {@link #glTextureImage2DEXT TextureImage2DEXT} */
    public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, internalformat, width, height, border, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
    public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, xoffset, width, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
    public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, xoffset, width, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
    public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, xoffset, width, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
    public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, xoffset, width, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
    public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
    public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
    public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
    public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** Array version of: {@link #glGetTextureImageEXT GetTextureImageEXT} */
    public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, format, type, pixels);
    }

    /** Array version of: {@link #glGetTextureImageEXT GetTextureImageEXT} */
    public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, format, type, pixels);
    }

    /** Array version of: {@link #glGetTextureImageEXT GetTextureImageEXT} */
    public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, format, type, pixels);
    }

    /** Array version of: {@link #glGetTextureImageEXT GetTextureImageEXT} */
    public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, format, type, pixels);
    }

    /** Array version of: {@link #glGetTextureParameterfvEXT GetTextureParameterfvEXT} */
    public static void glGetTextureParameterfvEXT(int texture, int target, int pname, float[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texture, target, pname, params);
    }

    /** Array version of: {@link #glGetTextureParameterivEXT GetTextureParameterivEXT} */
    public static void glGetTextureParameterivEXT(int texture, int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texture, target, pname, params);
    }

    /** Array version of: {@link #glGetTextureLevelParameterfvEXT GetTextureLevelParameterfvEXT} */
    public static void glGetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, float[] params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texture, target, level, pname, params);
    }

    /** Array version of: {@link #glGetTextureLevelParameterivEXT GetTextureLevelParameterivEXT} */
    public static void glGetTextureLevelParameterivEXT(int texture, int target, int level, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texture, target, level, pname, params);
    }

    /** Array version of: {@link #glTextureImage3DEXT TextureImage3DEXT} */
    public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    /** Array version of: {@link #glTextureImage3DEXT TextureImage3DEXT} */
    public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    /** Array version of: {@link #glTextureImage3DEXT TextureImage3DEXT} */
    public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    /** Array version of: {@link #glTextureImage3DEXT TextureImage3DEXT} */
    public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
    public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
    public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
    public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
    public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
    public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, short[] pointer) {
        long __functionAddress = GL.getICD().glMultiTexCoordPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, size, type, stride, pointer);
    }

    /** Array version of: {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
    public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, int[] pointer) {
        long __functionAddress = GL.getICD().glMultiTexCoordPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, size, type, stride, pointer);
    }

    /** Array version of: {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
    public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, float[] pointer) {
        long __functionAddress = GL.getICD().glMultiTexCoordPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, size, type, stride, pointer);
    }

    /** Array version of: {@link #glMultiTexEnvfvEXT MultiTexEnvfvEXT} */
    public static void glMultiTexEnvfvEXT(int texunit, int target, int pname, float[] params) {
        long __functionAddress = GL.getICD().glMultiTexEnvfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, texunit, target, pname, params);
    }

    /** Array version of: {@link #glMultiTexEnvivEXT MultiTexEnvivEXT} */
    public static void glMultiTexEnvivEXT(int texunit, int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glMultiTexEnvivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, texunit, target, pname, params);
    }

    /** Array version of: {@link #glMultiTexGendvEXT MultiTexGendvEXT} */
    public static void glMultiTexGendvEXT(int texunit, int coord, int pname, double[] params) {
        long __functionAddress = GL.getICD().glMultiTexGendvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, texunit, coord, pname, params);
    }

    /** Array version of: {@link #glMultiTexGenfvEXT MultiTexGenfvEXT} */
    public static void glMultiTexGenfvEXT(int texunit, int coord, int pname, float[] params) {
        long __functionAddress = GL.getICD().glMultiTexGenfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, texunit, coord, pname, params);
    }

    /** Array version of: {@link #glMultiTexGenivEXT MultiTexGenivEXT} */
    public static void glMultiTexGenivEXT(int texunit, int coord, int pname, int[] params) {
        long __functionAddress = GL.getICD().glMultiTexGenivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, texunit, coord, pname, params);
    }

    /** Array version of: {@link #glGetMultiTexEnvfvEXT GetMultiTexEnvfvEXT} */
    public static void glGetMultiTexEnvfvEXT(int texunit, int target, int pname, float[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexEnvfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texunit, target, pname, params);
    }

    /** Array version of: {@link #glGetMultiTexEnvivEXT GetMultiTexEnvivEXT} */
    public static void glGetMultiTexEnvivEXT(int texunit, int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexEnvivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texunit, target, pname, params);
    }

    /** Array version of: {@link #glGetMultiTexGendvEXT GetMultiTexGendvEXT} */
    public static void glGetMultiTexGendvEXT(int texunit, int coord, int pname, double[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexGendvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texunit, coord, pname, params);
    }

    /** Array version of: {@link #glGetMultiTexGenfvEXT GetMultiTexGenfvEXT} */
    public static void glGetMultiTexGenfvEXT(int texunit, int coord, int pname, float[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexGenfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texunit, coord, pname, params);
    }

    /** Array version of: {@link #glGetMultiTexGenivEXT GetMultiTexGenivEXT} */
    public static void glGetMultiTexGenivEXT(int texunit, int coord, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexGenivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texunit, coord, pname, params);
    }

    /** Array version of: {@link #glMultiTexParameterivEXT MultiTexParameterivEXT} */
    public static void glMultiTexParameterivEXT(int texunit, int target, int pname, int[] param) {
        long __functionAddress = GL.getICD().glMultiTexParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 4);
        }
        callPV(__functionAddress, texunit, target, pname, param);
    }

    /** Array version of: {@link #glMultiTexParameterfvEXT MultiTexParameterfvEXT} */
    public static void glMultiTexParameterfvEXT(int texunit, int target, int pname, float[] param) {
        long __functionAddress = GL.getICD().glMultiTexParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 4);
        }
        callPV(__functionAddress, texunit, target, pname, param);
    }

    /** Array version of: {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
    public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, internalformat, width, border, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
    public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, internalformat, width, border, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
    public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, internalformat, width, border, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
    public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, internalformat, width, border, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
    public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, internalformat, width, height, border, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
    public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, internalformat, width, height, border, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
    public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, internalformat, width, height, border, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
    public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, internalformat, width, height, border, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
    public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, xoffset, width, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
    public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, xoffset, width, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
    public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, xoffset, width, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
    public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, xoffset, width, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
    public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
    public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
    public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
    public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** Array version of: {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
    public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glGetMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, format, type, pixels);
    }

    /** Array version of: {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
    public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glGetMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, format, type, pixels);
    }

    /** Array version of: {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
    public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glGetMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, format, type, pixels);
    }

    /** Array version of: {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
    public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glGetMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, format, type, pixels);
    }

    /** Array version of: {@link #glGetMultiTexParameterfvEXT GetMultiTexParameterfvEXT} */
    public static void glGetMultiTexParameterfvEXT(int texunit, int target, int pname, float[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texunit, target, pname, params);
    }

    /** Array version of: {@link #glGetMultiTexParameterivEXT GetMultiTexParameterivEXT} */
    public static void glGetMultiTexParameterivEXT(int texunit, int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texunit, target, pname, params);
    }

    /** Array version of: {@link #glGetMultiTexLevelParameterfvEXT GetMultiTexLevelParameterfvEXT} */
    public static void glGetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, float[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexLevelParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texunit, target, level, pname, params);
    }

    /** Array version of: {@link #glGetMultiTexLevelParameterivEXT GetMultiTexLevelParameterivEXT} */
    public static void glGetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexLevelParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texunit, target, level, pname, params);
    }

    /** Array version of: {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
    public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
    public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
    public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
    public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
    public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
    public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
    public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
    public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glGetFloatIndexedvEXT GetFloatIndexedvEXT} */
    public static void glGetFloatIndexedvEXT(int target, int index, float[] params) {
        long __functionAddress = GL.getICD().glGetFloatIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, target, index, params);
    }

    /** Array version of: {@link #glGetDoubleIndexedvEXT GetDoubleIndexedvEXT} */
    public static void glGetDoubleIndexedvEXT(int target, int index, double[] params) {
        long __functionAddress = GL.getICD().glGetDoubleIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, target, index, params);
    }

    /** Array version of: {@link #glGetFloati_vEXT GetFloati_vEXT} */
    public static void glGetFloati_vEXT(int pname, int index, float[] params) {
        long __functionAddress = GL.getICD().glGetFloati_vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, pname, index, params);
    }

    /** Array version of: {@link #glGetDoublei_vEXT GetDoublei_vEXT} */
    public static void glGetDoublei_vEXT(int pname, int index, double[] params) {
        long __functionAddress = GL.getICD().glGetDoublei_vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, pname, index, params);
    }

    /** Array version of: {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
    public static void glGetIntegerIndexedvEXT(int target, int index, int[] params) {
        long __functionAddress = GL.getICD().glGetIntegerIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, target, index, params);
    }

    /** Array version of: {@link #glNamedProgramLocalParameter4dvEXT NamedProgramLocalParameter4dvEXT} */
    public static void glNamedProgramLocalParameter4dvEXT(int program, int target, int index, double[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameter4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, program, target, index, params);
    }

    /** Array version of: {@link #glNamedProgramLocalParameter4fvEXT NamedProgramLocalParameter4fvEXT} */
    public static void glNamedProgramLocalParameter4fvEXT(int program, int target, int index, float[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameter4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, program, target, index, params);
    }

    /** Array version of: {@link #glGetNamedProgramLocalParameterdvEXT GetNamedProgramLocalParameterdvEXT} */
    public static void glGetNamedProgramLocalParameterdvEXT(int program, int target, int index, double[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterdvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, program, target, index, params);
    }

    /** Array version of: {@link #glGetNamedProgramLocalParameterfvEXT GetNamedProgramLocalParameterfvEXT} */
    public static void glGetNamedProgramLocalParameterfvEXT(int program, int target, int index, float[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, program, target, index, params);
    }

    /** Array version of: {@link #glGetNamedProgramivEXT GetNamedProgramivEXT} */
    public static void glGetNamedProgramivEXT(int program, int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, program, target, pname, params);
    }

    /** Array version of: {@link #glMatrixLoadTransposefEXT MatrixLoadTransposefEXT} */
    public static void glMatrixLoadTransposefEXT(int matrixMode, float[] m) {
        long __functionAddress = GL.getICD().glMatrixLoadTransposefEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(__functionAddress, matrixMode, m);
    }

    /** Array version of: {@link #glMatrixLoadTransposedEXT MatrixLoadTransposedEXT} */
    public static void glMatrixLoadTransposedEXT(int matrixMode, double[] m) {
        long __functionAddress = GL.getICD().glMatrixLoadTransposedEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(__functionAddress, matrixMode, m);
    }

    /** Array version of: {@link #glMatrixMultTransposefEXT MatrixMultTransposefEXT} */
    public static void glMatrixMultTransposefEXT(int matrixMode, float[] m) {
        long __functionAddress = GL.getICD().glMatrixMultTransposefEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(__functionAddress, matrixMode, m);
    }

    /** Array version of: {@link #glMatrixMultTransposedEXT MatrixMultTransposedEXT} */
    public static void glMatrixMultTransposedEXT(int matrixMode, double[] m) {
        long __functionAddress = GL.getICD().glMatrixMultTransposedEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(__functionAddress, matrixMode, m);
    }

    /** Array version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
    public static void glNamedBufferDataEXT(int buffer, short[] data, int usage) {
        long __functionAddress = GL.getICD().glNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, buffer, (long)(data.length << 1), data, usage);
    }

    /** Array version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
    public static void glNamedBufferDataEXT(int buffer, int[] data, int usage) {
        long __functionAddress = GL.getICD().glNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, buffer, (long)(data.length << 2), data, usage);
    }

    /** Array version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
    public static void glNamedBufferDataEXT(int buffer, float[] data, int usage) {
        long __functionAddress = GL.getICD().glNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, buffer, (long)(data.length << 2), data, usage);
    }

    /** Array version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
    public static void glNamedBufferDataEXT(int buffer, double[] data, int usage) {
        long __functionAddress = GL.getICD().glNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, buffer, (long)(data.length << 3), data, usage);
    }

    /** Array version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
    public static void glNamedBufferSubDataEXT(int buffer, long offset, short[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, buffer, offset, (long)(data.length << 1), data);
    }

    /** Array version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
    public static void glNamedBufferSubDataEXT(int buffer, long offset, int[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, buffer, offset, (long)(data.length << 2), data);
    }

    /** Array version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
    public static void glNamedBufferSubDataEXT(int buffer, long offset, float[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, buffer, offset, (long)(data.length << 2), data);
    }

    /** Array version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
    public static void glNamedBufferSubDataEXT(int buffer, long offset, double[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, buffer, offset, (long)(data.length << 3), data);
    }

    /** Array version of: {@link #glGetNamedBufferParameterivEXT GetNamedBufferParameterivEXT} */
    public static void glGetNamedBufferParameterivEXT(int buffer, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetNamedBufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, buffer, pname, params);
    }

    /** Array version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
    public static void glGetNamedBufferSubDataEXT(int buffer, long offset, short[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, buffer, offset, (long)(data.length << 1), data);
    }

    /** Array version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
    public static void glGetNamedBufferSubDataEXT(int buffer, long offset, int[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, buffer, offset, (long)(data.length << 2), data);
    }

    /** Array version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
    public static void glGetNamedBufferSubDataEXT(int buffer, long offset, float[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, buffer, offset, (long)(data.length << 2), data);
    }

    /** Array version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
    public static void glGetNamedBufferSubDataEXT(int buffer, long offset, double[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, buffer, offset, (long)(data.length << 3), data);
    }

    /** Array version of: {@link #glProgramUniform1fvEXT ProgramUniform1fvEXT} */
    public static void glProgramUniform1fvEXT(int program, int location, float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length, value);
    }

    /** Array version of: {@link #glProgramUniform2fvEXT ProgramUniform2fvEXT} */
    public static void glProgramUniform2fvEXT(int program, int location, float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 1, value);
    }

    /** Array version of: {@link #glProgramUniform3fvEXT ProgramUniform3fvEXT} */
    public static void glProgramUniform3fvEXT(int program, int location, float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 3, value);
    }

    /** Array version of: {@link #glProgramUniform4fvEXT ProgramUniform4fvEXT} */
    public static void glProgramUniform4fvEXT(int program, int location, float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 2, value);
    }

    /** Array version of: {@link #glProgramUniform1ivEXT ProgramUniform1ivEXT} */
    public static void glProgramUniform1ivEXT(int program, int location, int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length, value);
    }

    /** Array version of: {@link #glProgramUniform2ivEXT ProgramUniform2ivEXT} */
    public static void glProgramUniform2ivEXT(int program, int location, int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 1, value);
    }

    /** Array version of: {@link #glProgramUniform3ivEXT ProgramUniform3ivEXT} */
    public static void glProgramUniform3ivEXT(int program, int location, int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 3, value);
    }

    /** Array version of: {@link #glProgramUniform4ivEXT ProgramUniform4ivEXT} */
    public static void glProgramUniform4ivEXT(int program, int location, int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 2, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix2fvEXT ProgramUniformMatrix2fvEXT} */
    public static void glProgramUniformMatrix2fvEXT(int program, int location, boolean transpose, float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 2, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix3fvEXT ProgramUniformMatrix3fvEXT} */
    public static void glProgramUniformMatrix3fvEXT(int program, int location, boolean transpose, float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 9, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix4fvEXT ProgramUniformMatrix4fvEXT} */
    public static void glProgramUniformMatrix4fvEXT(int program, int location, boolean transpose, float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 4, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix2x3fvEXT ProgramUniformMatrix2x3fvEXT} */
    public static void glProgramUniformMatrix2x3fvEXT(int program, int location, boolean transpose, float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 6, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix3x2fvEXT ProgramUniformMatrix3x2fvEXT} */
    public static void glProgramUniformMatrix3x2fvEXT(int program, int location, boolean transpose, float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 6, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix2x4fvEXT ProgramUniformMatrix2x4fvEXT} */
    public static void glProgramUniformMatrix2x4fvEXT(int program, int location, boolean transpose, float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix4x2fvEXT ProgramUniformMatrix4x2fvEXT} */
    public static void glProgramUniformMatrix4x2fvEXT(int program, int location, boolean transpose, float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix3x4fvEXT ProgramUniformMatrix3x4fvEXT} */
    public static void glProgramUniformMatrix3x4fvEXT(int program, int location, boolean transpose, float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 12, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix4x3fvEXT ProgramUniformMatrix4x3fvEXT} */
    public static void glProgramUniformMatrix4x3fvEXT(int program, int location, boolean transpose, float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 12, transpose, value);
    }

    /** Array version of: {@link #glTextureParameterIivEXT TextureParameterIivEXT} */
    public static void glTextureParameterIivEXT(int texture, int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glTextureParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, texture, target, pname, params);
    }

    /** Array version of: {@link #glTextureParameterIuivEXT TextureParameterIuivEXT} */
    public static void glTextureParameterIuivEXT(int texture, int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glTextureParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, texture, target, pname, params);
    }

    /** Array version of: {@link #glGetTextureParameterIivEXT GetTextureParameterIivEXT} */
    public static void glGetTextureParameterIivEXT(int texture, int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texture, target, pname, params);
    }

    /** Array version of: {@link #glGetTextureParameterIuivEXT GetTextureParameterIuivEXT} */
    public static void glGetTextureParameterIuivEXT(int texture, int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texture, target, pname, params);
    }

    /** Array version of: {@link #glMultiTexParameterIivEXT MultiTexParameterIivEXT} */
    public static void glMultiTexParameterIivEXT(int texunit, int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glMultiTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, texunit, target, pname, params);
    }

    /** Array version of: {@link #glMultiTexParameterIuivEXT MultiTexParameterIuivEXT} */
    public static void glMultiTexParameterIuivEXT(int texunit, int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glMultiTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, texunit, target, pname, params);
    }

    /** Array version of: {@link #glGetMultiTexParameterIivEXT GetMultiTexParameterIivEXT} */
    public static void glGetMultiTexParameterIivEXT(int texunit, int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texunit, target, pname, params);
    }

    /** Array version of: {@link #glGetMultiTexParameterIuivEXT GetMultiTexParameterIuivEXT} */
    public static void glGetMultiTexParameterIuivEXT(int texunit, int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, texunit, target, pname, params);
    }

    /** Array version of: {@link #glProgramUniform1uivEXT ProgramUniform1uivEXT} */
    public static void glProgramUniform1uivEXT(int program, int location, int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length, value);
    }

    /** Array version of: {@link #glProgramUniform2uivEXT ProgramUniform2uivEXT} */
    public static void glProgramUniform2uivEXT(int program, int location, int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 1, value);
    }

    /** Array version of: {@link #glProgramUniform3uivEXT ProgramUniform3uivEXT} */
    public static void glProgramUniform3uivEXT(int program, int location, int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 3, value);
    }

    /** Array version of: {@link #glProgramUniform4uivEXT ProgramUniform4uivEXT} */
    public static void glProgramUniform4uivEXT(int program, int location, int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 2, value);
    }

    /** Array version of: {@link #glNamedProgramLocalParameters4fvEXT NamedProgramLocalParameters4fvEXT} */
    public static void glNamedProgramLocalParameters4fvEXT(int program, int target, int index, float[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameters4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, target, index, params.length >> 2, params);
    }

    /** Array version of: {@link #glNamedProgramLocalParameterI4ivEXT NamedProgramLocalParameterI4ivEXT} */
    public static void glNamedProgramLocalParameterI4ivEXT(int program, int target, int index, int[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameterI4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, program, target, index, params);
    }

    /** Array version of: {@link #glNamedProgramLocalParametersI4ivEXT NamedProgramLocalParametersI4ivEXT} */
    public static void glNamedProgramLocalParametersI4ivEXT(int program, int target, int index, int[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParametersI4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, target, index, params.length >> 2, params);
    }

    /** Array version of: {@link #glNamedProgramLocalParameterI4uivEXT NamedProgramLocalParameterI4uivEXT} */
    public static void glNamedProgramLocalParameterI4uivEXT(int program, int target, int index, int[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameterI4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, program, target, index, params);
    }

    /** Array version of: {@link #glNamedProgramLocalParametersI4uivEXT NamedProgramLocalParametersI4uivEXT} */
    public static void glNamedProgramLocalParametersI4uivEXT(int program, int target, int index, int[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParametersI4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, target, index, params.length >> 2, params);
    }

    /** Array version of: {@link #glGetNamedProgramLocalParameterIivEXT GetNamedProgramLocalParameterIivEXT} */
    public static void glGetNamedProgramLocalParameterIivEXT(int program, int target, int index, int[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, program, target, index, params);
    }

    /** Array version of: {@link #glGetNamedProgramLocalParameterIuivEXT GetNamedProgramLocalParameterIuivEXT} */
    public static void glGetNamedProgramLocalParameterIuivEXT(int program, int target, int index, int[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, program, target, index, params);
    }

    /** Array version of: {@link #glGetNamedRenderbufferParameterivEXT GetNamedRenderbufferParameterivEXT} */
    public static void glGetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetNamedRenderbufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, renderbuffer, pname, params);
    }

    /** Array version of: {@link #glGetNamedFramebufferAttachmentParameterivEXT GetNamedFramebufferAttachmentParameterivEXT} */
    public static void glGetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetNamedFramebufferAttachmentParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, framebuffer, attachment, pname, params);
    }

    /** Array version of: {@link #glFramebufferDrawBuffersEXT FramebufferDrawBuffersEXT} */
    public static void glFramebufferDrawBuffersEXT(int framebuffer, int[] bufs) {
        long __functionAddress = GL.getICD().glFramebufferDrawBuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, framebuffer, bufs.length, bufs);
    }

    /** Array version of: {@link #glGetFramebufferParameterivEXT GetFramebufferParameterivEXT} */
    public static void glGetFramebufferParameterivEXT(int framebuffer, int pname, int[] param) {
        long __functionAddress = GL.getICD().glGetFramebufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(__functionAddress, framebuffer, pname, param);
    }

    /** Array version of: {@link #glGetVertexArrayIntegervEXT GetVertexArrayIntegervEXT} */
    public static void glGetVertexArrayIntegervEXT(int vaobj, int pname, int[] param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIntegervEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(__functionAddress, vaobj, pname, param);
    }

    /** Array version of: {@link #glGetVertexArrayIntegeri_vEXT GetVertexArrayIntegeri_vEXT} */
    public static void glGetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, int[] param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIntegeri_vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(__functionAddress, vaobj, index, pname, param);
    }

}