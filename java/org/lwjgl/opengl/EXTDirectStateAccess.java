/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/direct_state_access.txt">EXT_direct_state_access</a> extension.
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
 * <p>The OpenGL API involves several selectors (listed in historical order of introduction):
 * <ul>
 * <li>The matrix mode.</li>
 * <li>The current bound texture for each supported texture target.</li>
 * <li>The active texture.</li>
 * <li>The active client texture.</li>
 * <li>The current bound program for each supported program target.</li>
 * <li>The current bound buffer for each supported buffer target.</li>
 * <li>The current GLSL program.</li>
 * <li>The current framebuffer object.</li>
 * </ul>  The new selector-free update commands can be compiled into display lists.</p>
 * 
 * <p>The OpenGL API has latched state for vertex array buffer objects and pixel store state. When an application issues a GL command to unpack or pack pixels
 * (for example, glTexImage2D or glReadPixels respectively), the current unpack and pack pixel store state determines how the pixels are unpacked
 * from/packed to client memory or pixel buffer objects. For example, consider:
 * <pre><code style="font-family: monospace">
 * glPixelStorei(GL_UNPACK_SWAP_BYTES, GL_TRUE);
 * glPixelStorei(GL_UNPACK_ROW_LENGTH, 640);
 * glBindBuffer(GL_PIXEL_UNPACK_BUFFER, 47);
 * glDrawPixels(100, 100, GL_RGB, GL_FLOAT, pixels);</code></pre>
 * The unpack swap bytes and row length state set by the preceding glPixelStorei commands (as well as the 6 other unpack pixel store state variables)
 * control how data is read (unpacked) from buffer of data pointed to by pixels. The glBindBuffer command also specifies an unpack buffer object (47) so
 * the pixel pointer is actually treated as a byte offset into buffer object 47.</p>
 * 
 * <p>When an application issues a command to configure a vertex array, the current array buffer state is latched as the binding for the particular vertex
 * array being specified. For example, consider:
 * <pre><code style="font-family: monospace">
 * glBindBuffer(GL_ARRAY_BUFFER, 23);
 * glVertexPointer(3, GL_FLOAT, 12, pointer);</code></pre>
 * The glBindBuffer command updates the array buffering binding (GL_ARRAY_BUFFER_BINDING) to the buffer object named 23. The subsequent glVertexPointer
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
 * <p>Consider the following routine to set the modelview matrix involving the matrix mode selector:
 * <pre><code style="font-family: monospace">
 * void setModelviewMatrix(const GLfloat matrix[16])
 * {
 * 	GLenum savedMatrixMode;
 * 
 * 	glGetIntegerv(GL_MATRIX_MODE, &savedMatrixMode);
 * 	glMatrixMode(GL_MODELVIEW);
 * 	glLoadMatrixf(matrix);
 * 	glMatrixMode(savedMatrixMode);
 * }</code></pre>
 * Notice that four OpenGL commands are required to update the current modelview matrix without disturbing the matrix mode selector.</p>
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
 * <p>The above example can be reimplemented more efficiently and without selector side-effects:
 * <pre><code style="font-family: monospace">
 * void setModelviewMatrix(const GLfloat matrix[16])
 * {
 * 	glMatrixLoadfEXT(GL_MODELVIEW, matrix);
 * }</code></pre>
 * Consider a layered library seeking to load a texture:
 * <pre><code style="font-family: monospace">
 * void loadTexture(GLint texobj, GLint width, GLint height, void *data)
 * {
 * 	glBindTexture(GL_TEXTURE_2D, texobj);
 * 	glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB8, width, height, GL_RGB, GL_FLOAT, data);
 * }</code></pre>
 * The library expects the data to be packed into the buffer pointed to by data. But what if the current pixel unpack buffer binding is not zero so the
 * current pixel unpack buffer, rather than client memory, will be read? Or what if the application has modified the GL_UNPACK_ROW_LENGTH pixel store state
 * before loadTexture is called?</p>
 * 
 * <p>We can fix the routine by calling glBindBuffer(GL_PIXEL_UNPACK_BUFFER, 0) and setting all the pixel store unpack state to the initial state the
 * loadTexture routine expects, but this is expensive. It also risks disturbing the state so when loadTexture returns to the application, the application
 * doesn't realize the current texture object (for whatever texture unit the current active texture happens to be) and pixel store state has changed.</p>
 * 
 * <p>We can more efficiently implement this routine without disturbing selector or latched state as follows:
 * <pre><code style="font-family: monospace">
 * void loadTexture(GLint texobj, GLint width, GLint height, void *data)
 * {
 * 	glPushClientAttribDefaultEXT(GL_CLIENT_PIXEL_STORE_BIT);
 * 	glTextureImage2D(texobj, GL_TEXTURE_2D, 0, GL_RGB8, width, height, GL_RGB, GL_FLOAT, data);
 * 	glPopClientAttrib();
 * }</code></pre>
 * Now loadTexture does not have to worry about inappropriately configured pixel store state or a non-zero pixel unpack buffer binding. And loadTexture has
 * no unintended side-effects for selector or latched state (assuming the client attrib state does not overflow).</p>
 */
public final class EXTDirectStateAccess {

	/** GetBooleani_v, GetIntegeri_v, GetFloati_vEXT, GetDoublei_vEXT. */
	public static final int
		GL_PROGRAM_MATRIX_EXT             = 0x8E2D,
		GL_TRANSPOSE_PROGRAM_MATRIX_EXT   = 0x8E2E,
		GL_PROGRAM_MATRIX_STACK_DEPTH_EXT = 0x8E2F;

	/** Function address. */
	@JavadocExclude
	public final long
		ClientAttribDefaultEXT,
		PushClientAttribDefaultEXT,
		MatrixLoadfEXT,
		MatrixLoaddEXT,
		MatrixMultfEXT,
		MatrixMultdEXT,
		MatrixLoadIdentityEXT,
		MatrixRotatefEXT,
		MatrixRotatedEXT,
		MatrixScalefEXT,
		MatrixScaledEXT,
		MatrixTranslatefEXT,
		MatrixTranslatedEXT,
		MatrixOrthoEXT,
		MatrixFrustumEXT,
		MatrixPushEXT,
		MatrixPopEXT,
		TextureParameteriEXT,
		TextureParameterivEXT,
		TextureParameterfEXT,
		TextureParameterfvEXT,
		TextureImage1DEXT,
		TextureImage2DEXT,
		TextureSubImage1DEXT,
		TextureSubImage2DEXT,
		CopyTextureImage1DEXT,
		CopyTextureImage2DEXT,
		CopyTextureSubImage1DEXT,
		CopyTextureSubImage2DEXT,
		GetTextureImageEXT,
		GetTextureParameterfvEXT,
		GetTextureParameterivEXT,
		GetTextureLevelParameterfvEXT,
		GetTextureLevelParameterivEXT,
		TextureImage3DEXT,
		TextureSubImage3DEXT,
		CopyTextureSubImage3DEXT,
		BindMultiTextureEXT,
		MultiTexCoordPointerEXT,
		MultiTexEnvfEXT,
		MultiTexEnvfvEXT,
		MultiTexEnviEXT,
		MultiTexEnvivEXT,
		MultiTexGendEXT,
		MultiTexGendvEXT,
		MultiTexGenfEXT,
		MultiTexGenfvEXT,
		MultiTexGeniEXT,
		MultiTexGenivEXT,
		GetMultiTexEnvfvEXT,
		GetMultiTexEnvivEXT,
		GetMultiTexGendvEXT,
		GetMultiTexGenfvEXT,
		GetMultiTexGenivEXT,
		MultiTexParameteriEXT,
		MultiTexParameterivEXT,
		MultiTexParameterfEXT,
		MultiTexParameterfvEXT,
		MultiTexImage1DEXT,
		MultiTexImage2DEXT,
		MultiTexSubImage1DEXT,
		MultiTexSubImage2DEXT,
		CopyMultiTexImage1DEXT,
		CopyMultiTexImage2DEXT,
		CopyMultiTexSubImage1DEXT,
		CopyMultiTexSubImage2DEXT,
		GetMultiTexImageEXT,
		GetMultiTexParameterfvEXT,
		GetMultiTexParameterivEXT,
		GetMultiTexLevelParameterfvEXT,
		GetMultiTexLevelParameterivEXT,
		MultiTexImage3DEXT,
		MultiTexSubImage3DEXT,
		CopyMultiTexSubImage3DEXT,
		EnableClientStateIndexedEXT,
		DisableClientStateIndexedEXT,
		EnableClientStateiEXT,
		DisableClientStateiEXT,
		GetFloatIndexedvEXT,
		GetDoubleIndexedvEXT,
		GetPointerIndexedvEXT,
		GetFloati_vEXT,
		GetDoublei_vEXT,
		GetPointeri_vEXT,
		EnableIndexedEXT,
		DisableIndexedEXT,
		IsEnabledIndexedEXT,
		GetIntegerIndexedvEXT,
		GetBooleanIndexedvEXT,
		NamedProgramStringEXT,
		NamedProgramLocalParameter4dEXT,
		NamedProgramLocalParameter4dvEXT,
		NamedProgramLocalParameter4fEXT,
		NamedProgramLocalParameter4fvEXT,
		GetNamedProgramLocalParameterdvEXT,
		GetNamedProgramLocalParameterfvEXT,
		GetNamedProgramivEXT,
		GetNamedProgramStringEXT,
		CompressedTextureImage3DEXT,
		CompressedTextureImage2DEXT,
		CompressedTextureImage1DEXT,
		CompressedTextureSubImage3DEXT,
		CompressedTextureSubImage2DEXT,
		CompressedTextureSubImage1DEXT,
		GetCompressedTextureImageEXT,
		CompressedMultiTexImage3DEXT,
		CompressedMultiTexImage2DEXT,
		CompressedMultiTexImage1DEXT,
		CompressedMultiTexSubImage3DEXT,
		CompressedMultiTexSubImage2DEXT,
		CompressedMultiTexSubImage1DEXT,
		GetCompressedMultiTexImageEXT,
		MatrixLoadTransposefEXT,
		MatrixLoadTransposedEXT,
		MatrixMultTransposefEXT,
		MatrixMultTransposedEXT,
		NamedBufferDataEXT,
		NamedBufferSubDataEXT,
		MapNamedBufferEXT,
		UnmapNamedBufferEXT,
		GetNamedBufferParameterivEXT,
		GetNamedBufferSubDataEXT,
		ProgramUniform1fEXT,
		ProgramUniform2fEXT,
		ProgramUniform3fEXT,
		ProgramUniform4fEXT,
		ProgramUniform1iEXT,
		ProgramUniform2iEXT,
		ProgramUniform3iEXT,
		ProgramUniform4iEXT,
		ProgramUniform1fvEXT,
		ProgramUniform2fvEXT,
		ProgramUniform3fvEXT,
		ProgramUniform4fvEXT,
		ProgramUniform1ivEXT,
		ProgramUniform2ivEXT,
		ProgramUniform3ivEXT,
		ProgramUniform4ivEXT,
		ProgramUniformMatrix2fvEXT,
		ProgramUniformMatrix3fvEXT,
		ProgramUniformMatrix4fvEXT,
		ProgramUniformMatrix2x3fvEXT,
		ProgramUniformMatrix3x2fvEXT,
		ProgramUniformMatrix2x4fvEXT,
		ProgramUniformMatrix4x2fvEXT,
		ProgramUniformMatrix3x4fvEXT,
		ProgramUniformMatrix4x3fvEXT,
		TextureBufferEXT,
		MultiTexBufferEXT,
		TextureParameterIivEXT,
		TextureParameterIuivEXT,
		GetTextureParameterIivEXT,
		GetTextureParameterIuivEXT,
		MultiTexParameterIivEXT,
		MultiTexParameterIuivEXT,
		GetMultiTexParameterIivEXT,
		GetMultiTexParameterIuivEXT,
		ProgramUniform1uiEXT,
		ProgramUniform2uiEXT,
		ProgramUniform3uiEXT,
		ProgramUniform4uiEXT,
		ProgramUniform1uivEXT,
		ProgramUniform2uivEXT,
		ProgramUniform3uivEXT,
		ProgramUniform4uivEXT,
		NamedProgramLocalParameters4fvEXT,
		NamedProgramLocalParameterI4iEXT,
		NamedProgramLocalParameterI4ivEXT,
		NamedProgramLocalParametersI4ivEXT,
		NamedProgramLocalParameterI4uiEXT,
		NamedProgramLocalParameterI4uivEXT,
		NamedProgramLocalParametersI4uivEXT,
		GetNamedProgramLocalParameterIivEXT,
		GetNamedProgramLocalParameterIuivEXT,
		NamedRenderbufferStorageEXT,
		GetNamedRenderbufferParameterivEXT,
		NamedRenderbufferStorageMultisampleEXT,
		NamedRenderbufferStorageMultisampleCoverageEXT,
		CheckNamedFramebufferStatusEXT,
		NamedFramebufferTexture1DEXT,
		NamedFramebufferTexture2DEXT,
		NamedFramebufferTexture3DEXT,
		NamedFramebufferRenderbufferEXT,
		GetNamedFramebufferAttachmentParameterivEXT,
		GenerateTextureMipmapEXT,
		GenerateMultiTexMipmapEXT,
		FramebufferDrawBufferEXT,
		FramebufferDrawBuffersEXT,
		FramebufferReadBufferEXT,
		GetFramebufferParameterivEXT,
		NamedCopyBufferSubDataEXT,
		NamedFramebufferTextureEXT,
		NamedFramebufferTextureLayerEXT,
		NamedFramebufferTextureFaceEXT,
		TextureRenderbufferEXT,
		MultiTexRenderbufferEXT,
		VertexArrayVertexOffsetEXT,
		VertexArrayColorOffsetEXT,
		VertexArrayEdgeFlagOffsetEXT,
		VertexArrayIndexOffsetEXT,
		VertexArrayNormalOffsetEXT,
		VertexArrayTexCoordOffsetEXT,
		VertexArrayMultiTexCoordOffsetEXT,
		VertexArrayFogCoordOffsetEXT,
		VertexArraySecondaryColorOffsetEXT,
		VertexArrayVertexAttribOffsetEXT,
		VertexArrayVertexAttribIOffsetEXT,
		EnableVertexArrayEXT,
		DisableVertexArrayEXT,
		EnableVertexArrayAttribEXT,
		DisableVertexArrayAttribEXT,
		GetVertexArrayIntegervEXT,
		GetVertexArrayPointervEXT,
		GetVertexArrayIntegeri_vEXT,
		GetVertexArrayPointeri_vEXT,
		MapNamedBufferRangeEXT,
		FlushMappedNamedBufferRangeEXT;

	@JavadocExclude
	public EXTDirectStateAccess(FunctionProvider provider) {
		ClientAttribDefaultEXT = provider.getFunctionAddress("glClientAttribDefaultEXT");
		PushClientAttribDefaultEXT = provider.getFunctionAddress("glPushClientAttribDefaultEXT");
		MatrixLoadfEXT = provider.getFunctionAddress("glMatrixLoadfEXT");
		MatrixLoaddEXT = provider.getFunctionAddress("glMatrixLoaddEXT");
		MatrixMultfEXT = provider.getFunctionAddress("glMatrixMultfEXT");
		MatrixMultdEXT = provider.getFunctionAddress("glMatrixMultdEXT");
		MatrixLoadIdentityEXT = provider.getFunctionAddress("glMatrixLoadIdentityEXT");
		MatrixRotatefEXT = provider.getFunctionAddress("glMatrixRotatefEXT");
		MatrixRotatedEXT = provider.getFunctionAddress("glMatrixRotatedEXT");
		MatrixScalefEXT = provider.getFunctionAddress("glMatrixScalefEXT");
		MatrixScaledEXT = provider.getFunctionAddress("glMatrixScaledEXT");
		MatrixTranslatefEXT = provider.getFunctionAddress("glMatrixTranslatefEXT");
		MatrixTranslatedEXT = provider.getFunctionAddress("glMatrixTranslatedEXT");
		MatrixOrthoEXT = provider.getFunctionAddress("glMatrixOrthoEXT");
		MatrixFrustumEXT = provider.getFunctionAddress("glMatrixFrustumEXT");
		MatrixPushEXT = provider.getFunctionAddress("glMatrixPushEXT");
		MatrixPopEXT = provider.getFunctionAddress("glMatrixPopEXT");
		TextureParameteriEXT = provider.getFunctionAddress("glTextureParameteriEXT");
		TextureParameterivEXT = provider.getFunctionAddress("glTextureParameterivEXT");
		TextureParameterfEXT = provider.getFunctionAddress("glTextureParameterfEXT");
		TextureParameterfvEXT = provider.getFunctionAddress("glTextureParameterfvEXT");
		TextureImage1DEXT = provider.getFunctionAddress("glTextureImage1DEXT");
		TextureImage2DEXT = provider.getFunctionAddress("glTextureImage2DEXT");
		TextureSubImage1DEXT = provider.getFunctionAddress("glTextureSubImage1DEXT");
		TextureSubImage2DEXT = provider.getFunctionAddress("glTextureSubImage2DEXT");
		CopyTextureImage1DEXT = provider.getFunctionAddress("glCopyTextureImage1DEXT");
		CopyTextureImage2DEXT = provider.getFunctionAddress("glCopyTextureImage2DEXT");
		CopyTextureSubImage1DEXT = provider.getFunctionAddress("glCopyTextureSubImage1DEXT");
		CopyTextureSubImage2DEXT = provider.getFunctionAddress("glCopyTextureSubImage2DEXT");
		GetTextureImageEXT = provider.getFunctionAddress("glGetTextureImageEXT");
		GetTextureParameterfvEXT = provider.getFunctionAddress("glGetTextureParameterfvEXT");
		GetTextureParameterivEXT = provider.getFunctionAddress("glGetTextureParameterivEXT");
		GetTextureLevelParameterfvEXT = provider.getFunctionAddress("glGetTextureLevelParameterfvEXT");
		GetTextureLevelParameterivEXT = provider.getFunctionAddress("glGetTextureLevelParameterivEXT");
		TextureImage3DEXT = provider.getFunctionAddress("glTextureImage3DEXT");
		TextureSubImage3DEXT = provider.getFunctionAddress("glTextureSubImage3DEXT");
		CopyTextureSubImage3DEXT = provider.getFunctionAddress("glCopyTextureSubImage3DEXT");
		BindMultiTextureEXT = provider.getFunctionAddress("glBindMultiTextureEXT");
		MultiTexCoordPointerEXT = provider.getFunctionAddress("glMultiTexCoordPointerEXT");
		MultiTexEnvfEXT = provider.getFunctionAddress("glMultiTexEnvfEXT");
		MultiTexEnvfvEXT = provider.getFunctionAddress("glMultiTexEnvfvEXT");
		MultiTexEnviEXT = provider.getFunctionAddress("glMultiTexEnviEXT");
		MultiTexEnvivEXT = provider.getFunctionAddress("glMultiTexEnvivEXT");
		MultiTexGendEXT = provider.getFunctionAddress("glMultiTexGendEXT");
		MultiTexGendvEXT = provider.getFunctionAddress("glMultiTexGendvEXT");
		MultiTexGenfEXT = provider.getFunctionAddress("glMultiTexGenfEXT");
		MultiTexGenfvEXT = provider.getFunctionAddress("glMultiTexGenfvEXT");
		MultiTexGeniEXT = provider.getFunctionAddress("glMultiTexGeniEXT");
		MultiTexGenivEXT = provider.getFunctionAddress("glMultiTexGenivEXT");
		GetMultiTexEnvfvEXT = provider.getFunctionAddress("glGetMultiTexEnvfvEXT");
		GetMultiTexEnvivEXT = provider.getFunctionAddress("glGetMultiTexEnvivEXT");
		GetMultiTexGendvEXT = provider.getFunctionAddress("glGetMultiTexGendvEXT");
		GetMultiTexGenfvEXT = provider.getFunctionAddress("glGetMultiTexGenfvEXT");
		GetMultiTexGenivEXT = provider.getFunctionAddress("glGetMultiTexGenivEXT");
		MultiTexParameteriEXT = provider.getFunctionAddress("glMultiTexParameteriEXT");
		MultiTexParameterivEXT = provider.getFunctionAddress("glMultiTexParameterivEXT");
		MultiTexParameterfEXT = provider.getFunctionAddress("glMultiTexParameterfEXT");
		MultiTexParameterfvEXT = provider.getFunctionAddress("glMultiTexParameterfvEXT");
		MultiTexImage1DEXT = provider.getFunctionAddress("glMultiTexImage1DEXT");
		MultiTexImage2DEXT = provider.getFunctionAddress("glMultiTexImage2DEXT");
		MultiTexSubImage1DEXT = provider.getFunctionAddress("glMultiTexSubImage1DEXT");
		MultiTexSubImage2DEXT = provider.getFunctionAddress("glMultiTexSubImage2DEXT");
		CopyMultiTexImage1DEXT = provider.getFunctionAddress("glCopyMultiTexImage1DEXT");
		CopyMultiTexImage2DEXT = provider.getFunctionAddress("glCopyMultiTexImage2DEXT");
		CopyMultiTexSubImage1DEXT = provider.getFunctionAddress("glCopyMultiTexSubImage1DEXT");
		CopyMultiTexSubImage2DEXT = provider.getFunctionAddress("glCopyMultiTexSubImage2DEXT");
		GetMultiTexImageEXT = provider.getFunctionAddress("glGetMultiTexImageEXT");
		GetMultiTexParameterfvEXT = provider.getFunctionAddress("glGetMultiTexParameterfvEXT");
		GetMultiTexParameterivEXT = provider.getFunctionAddress("glGetMultiTexParameterivEXT");
		GetMultiTexLevelParameterfvEXT = provider.getFunctionAddress("glGetMultiTexLevelParameterfvEXT");
		GetMultiTexLevelParameterivEXT = provider.getFunctionAddress("glGetMultiTexLevelParameterivEXT");
		MultiTexImage3DEXT = provider.getFunctionAddress("glMultiTexImage3DEXT");
		MultiTexSubImage3DEXT = provider.getFunctionAddress("glMultiTexSubImage3DEXT");
		CopyMultiTexSubImage3DEXT = provider.getFunctionAddress("glCopyMultiTexSubImage3DEXT");
		EnableClientStateIndexedEXT = provider.getFunctionAddress("glEnableClientStateIndexedEXT");
		DisableClientStateIndexedEXT = provider.getFunctionAddress("glDisableClientStateIndexedEXT");
		EnableClientStateiEXT = provider.getFunctionAddress("glEnableClientStateiEXT");
		DisableClientStateiEXT = provider.getFunctionAddress("glDisableClientStateiEXT");
		GetFloatIndexedvEXT = provider.getFunctionAddress("glGetFloatIndexedvEXT");
		GetDoubleIndexedvEXT = provider.getFunctionAddress("glGetDoubleIndexedvEXT");
		GetPointerIndexedvEXT = provider.getFunctionAddress("glGetPointerIndexedvEXT");
		GetFloati_vEXT = provider.getFunctionAddress("glGetFloati_vEXT");
		GetDoublei_vEXT = provider.getFunctionAddress("glGetDoublei_vEXT");
		GetPointeri_vEXT = provider.getFunctionAddress("glGetPointeri_vEXT");
		EnableIndexedEXT = provider.getFunctionAddress("glEnableIndexedEXT");
		DisableIndexedEXT = provider.getFunctionAddress("glDisableIndexedEXT");
		IsEnabledIndexedEXT = provider.getFunctionAddress("glIsEnabledIndexedEXT");
		GetIntegerIndexedvEXT = provider.getFunctionAddress("glGetIntegerIndexedvEXT");
		GetBooleanIndexedvEXT = provider.getFunctionAddress("glGetBooleanIndexedvEXT");
		NamedProgramStringEXT = provider.getFunctionAddress("glNamedProgramStringEXT");
		NamedProgramLocalParameter4dEXT = provider.getFunctionAddress("glNamedProgramLocalParameter4dEXT");
		NamedProgramLocalParameter4dvEXT = provider.getFunctionAddress("glNamedProgramLocalParameter4dvEXT");
		NamedProgramLocalParameter4fEXT = provider.getFunctionAddress("glNamedProgramLocalParameter4fEXT");
		NamedProgramLocalParameter4fvEXT = provider.getFunctionAddress("glNamedProgramLocalParameter4fvEXT");
		GetNamedProgramLocalParameterdvEXT = provider.getFunctionAddress("glGetNamedProgramLocalParameterdvEXT");
		GetNamedProgramLocalParameterfvEXT = provider.getFunctionAddress("glGetNamedProgramLocalParameterfvEXT");
		GetNamedProgramivEXT = provider.getFunctionAddress("glGetNamedProgramivEXT");
		GetNamedProgramStringEXT = provider.getFunctionAddress("glGetNamedProgramStringEXT");
		CompressedTextureImage3DEXT = provider.getFunctionAddress("glCompressedTextureImage3DEXT");
		CompressedTextureImage2DEXT = provider.getFunctionAddress("glCompressedTextureImage2DEXT");
		CompressedTextureImage1DEXT = provider.getFunctionAddress("glCompressedTextureImage1DEXT");
		CompressedTextureSubImage3DEXT = provider.getFunctionAddress("glCompressedTextureSubImage3DEXT");
		CompressedTextureSubImage2DEXT = provider.getFunctionAddress("glCompressedTextureSubImage2DEXT");
		CompressedTextureSubImage1DEXT = provider.getFunctionAddress("glCompressedTextureSubImage1DEXT");
		GetCompressedTextureImageEXT = provider.getFunctionAddress("glGetCompressedTextureImageEXT");
		CompressedMultiTexImage3DEXT = provider.getFunctionAddress("glCompressedMultiTexImage3DEXT");
		CompressedMultiTexImage2DEXT = provider.getFunctionAddress("glCompressedMultiTexImage2DEXT");
		CompressedMultiTexImage1DEXT = provider.getFunctionAddress("glCompressedMultiTexImage1DEXT");
		CompressedMultiTexSubImage3DEXT = provider.getFunctionAddress("glCompressedMultiTexSubImage3DEXT");
		CompressedMultiTexSubImage2DEXT = provider.getFunctionAddress("glCompressedMultiTexSubImage2DEXT");
		CompressedMultiTexSubImage1DEXT = provider.getFunctionAddress("glCompressedMultiTexSubImage1DEXT");
		GetCompressedMultiTexImageEXT = provider.getFunctionAddress("glGetCompressedMultiTexImageEXT");
		MatrixLoadTransposefEXT = provider.getFunctionAddress("glMatrixLoadTransposefEXT");
		MatrixLoadTransposedEXT = provider.getFunctionAddress("glMatrixLoadTransposedEXT");
		MatrixMultTransposefEXT = provider.getFunctionAddress("glMatrixMultTransposefEXT");
		MatrixMultTransposedEXT = provider.getFunctionAddress("glMatrixMultTransposedEXT");
		NamedBufferDataEXT = provider.getFunctionAddress("glNamedBufferDataEXT");
		NamedBufferSubDataEXT = provider.getFunctionAddress("glNamedBufferSubDataEXT");
		MapNamedBufferEXT = provider.getFunctionAddress("glMapNamedBufferEXT");
		UnmapNamedBufferEXT = provider.getFunctionAddress("glUnmapNamedBufferEXT");
		GetNamedBufferParameterivEXT = provider.getFunctionAddress("glGetNamedBufferParameterivEXT");
		GetNamedBufferSubDataEXT = provider.getFunctionAddress("glGetNamedBufferSubDataEXT");
		ProgramUniform1fEXT = provider.getFunctionAddress("glProgramUniform1fEXT");
		ProgramUniform2fEXT = provider.getFunctionAddress("glProgramUniform2fEXT");
		ProgramUniform3fEXT = provider.getFunctionAddress("glProgramUniform3fEXT");
		ProgramUniform4fEXT = provider.getFunctionAddress("glProgramUniform4fEXT");
		ProgramUniform1iEXT = provider.getFunctionAddress("glProgramUniform1iEXT");
		ProgramUniform2iEXT = provider.getFunctionAddress("glProgramUniform2iEXT");
		ProgramUniform3iEXT = provider.getFunctionAddress("glProgramUniform3iEXT");
		ProgramUniform4iEXT = provider.getFunctionAddress("glProgramUniform4iEXT");
		ProgramUniform1fvEXT = provider.getFunctionAddress("glProgramUniform1fvEXT");
		ProgramUniform2fvEXT = provider.getFunctionAddress("glProgramUniform2fvEXT");
		ProgramUniform3fvEXT = provider.getFunctionAddress("glProgramUniform3fvEXT");
		ProgramUniform4fvEXT = provider.getFunctionAddress("glProgramUniform4fvEXT");
		ProgramUniform1ivEXT = provider.getFunctionAddress("glProgramUniform1ivEXT");
		ProgramUniform2ivEXT = provider.getFunctionAddress("glProgramUniform2ivEXT");
		ProgramUniform3ivEXT = provider.getFunctionAddress("glProgramUniform3ivEXT");
		ProgramUniform4ivEXT = provider.getFunctionAddress("glProgramUniform4ivEXT");
		ProgramUniformMatrix2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2fvEXT");
		ProgramUniformMatrix3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3fvEXT");
		ProgramUniformMatrix4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4fvEXT");
		ProgramUniformMatrix2x3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x3fvEXT");
		ProgramUniformMatrix3x2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x2fvEXT");
		ProgramUniformMatrix2x4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x4fvEXT");
		ProgramUniformMatrix4x2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x2fvEXT");
		ProgramUniformMatrix3x4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x4fvEXT");
		ProgramUniformMatrix4x3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x3fvEXT");
		TextureBufferEXT = provider.getFunctionAddress("glTextureBufferEXT");
		MultiTexBufferEXT = provider.getFunctionAddress("glMultiTexBufferEXT");
		TextureParameterIivEXT = provider.getFunctionAddress("glTextureParameterIivEXT");
		TextureParameterIuivEXT = provider.getFunctionAddress("glTextureParameterIuivEXT");
		GetTextureParameterIivEXT = provider.getFunctionAddress("glGetTextureParameterIivEXT");
		GetTextureParameterIuivEXT = provider.getFunctionAddress("glGetTextureParameterIuivEXT");
		MultiTexParameterIivEXT = provider.getFunctionAddress("glMultiTexParameterIivEXT");
		MultiTexParameterIuivEXT = provider.getFunctionAddress("glMultiTexParameterIuivEXT");
		GetMultiTexParameterIivEXT = provider.getFunctionAddress("glGetMultiTexParameterIivEXT");
		GetMultiTexParameterIuivEXT = provider.getFunctionAddress("glGetMultiTexParameterIuivEXT");
		ProgramUniform1uiEXT = provider.getFunctionAddress("glProgramUniform1uiEXT");
		ProgramUniform2uiEXT = provider.getFunctionAddress("glProgramUniform2uiEXT");
		ProgramUniform3uiEXT = provider.getFunctionAddress("glProgramUniform3uiEXT");
		ProgramUniform4uiEXT = provider.getFunctionAddress("glProgramUniform4uiEXT");
		ProgramUniform1uivEXT = provider.getFunctionAddress("glProgramUniform1uivEXT");
		ProgramUniform2uivEXT = provider.getFunctionAddress("glProgramUniform2uivEXT");
		ProgramUniform3uivEXT = provider.getFunctionAddress("glProgramUniform3uivEXT");
		ProgramUniform4uivEXT = provider.getFunctionAddress("glProgramUniform4uivEXT");
		NamedProgramLocalParameters4fvEXT = provider.getFunctionAddress("glNamedProgramLocalParameters4fvEXT");
		NamedProgramLocalParameterI4iEXT = provider.getFunctionAddress("glNamedProgramLocalParameterI4iEXT");
		NamedProgramLocalParameterI4ivEXT = provider.getFunctionAddress("glNamedProgramLocalParameterI4ivEXT");
		NamedProgramLocalParametersI4ivEXT = provider.getFunctionAddress("glNamedProgramLocalParametersI4ivEXT");
		NamedProgramLocalParameterI4uiEXT = provider.getFunctionAddress("glNamedProgramLocalParameterI4uiEXT");
		NamedProgramLocalParameterI4uivEXT = provider.getFunctionAddress("glNamedProgramLocalParameterI4uivEXT");
		NamedProgramLocalParametersI4uivEXT = provider.getFunctionAddress("glNamedProgramLocalParametersI4uivEXT");
		GetNamedProgramLocalParameterIivEXT = provider.getFunctionAddress("glGetNamedProgramLocalParameterIivEXT");
		GetNamedProgramLocalParameterIuivEXT = provider.getFunctionAddress("glGetNamedProgramLocalParameterIuivEXT");
		NamedRenderbufferStorageEXT = provider.getFunctionAddress("glNamedRenderbufferStorageEXT");
		GetNamedRenderbufferParameterivEXT = provider.getFunctionAddress("glGetNamedRenderbufferParameterivEXT");
		NamedRenderbufferStorageMultisampleEXT = provider.getFunctionAddress("glNamedRenderbufferStorageMultisampleEXT");
		NamedRenderbufferStorageMultisampleCoverageEXT = provider.getFunctionAddress("glNamedRenderbufferStorageMultisampleCoverageEXT");
		CheckNamedFramebufferStatusEXT = provider.getFunctionAddress("glCheckNamedFramebufferStatusEXT");
		NamedFramebufferTexture1DEXT = provider.getFunctionAddress("glNamedFramebufferTexture1DEXT");
		NamedFramebufferTexture2DEXT = provider.getFunctionAddress("glNamedFramebufferTexture2DEXT");
		NamedFramebufferTexture3DEXT = provider.getFunctionAddress("glNamedFramebufferTexture3DEXT");
		NamedFramebufferRenderbufferEXT = provider.getFunctionAddress("glNamedFramebufferRenderbufferEXT");
		GetNamedFramebufferAttachmentParameterivEXT = provider.getFunctionAddress("glGetNamedFramebufferAttachmentParameterivEXT");
		GenerateTextureMipmapEXT = provider.getFunctionAddress("glGenerateTextureMipmapEXT");
		GenerateMultiTexMipmapEXT = provider.getFunctionAddress("glGenerateMultiTexMipmapEXT");
		FramebufferDrawBufferEXT = provider.getFunctionAddress("glFramebufferDrawBufferEXT");
		FramebufferDrawBuffersEXT = provider.getFunctionAddress("glFramebufferDrawBuffersEXT");
		FramebufferReadBufferEXT = provider.getFunctionAddress("glFramebufferReadBufferEXT");
		GetFramebufferParameterivEXT = provider.getFunctionAddress("glGetFramebufferParameterivEXT");
		NamedCopyBufferSubDataEXT = provider.getFunctionAddress("glNamedCopyBufferSubDataEXT");
		NamedFramebufferTextureEXT = provider.getFunctionAddress("glNamedFramebufferTextureEXT");
		NamedFramebufferTextureLayerEXT = provider.getFunctionAddress("glNamedFramebufferTextureLayerEXT");
		NamedFramebufferTextureFaceEXT = provider.getFunctionAddress("glNamedFramebufferTextureFaceEXT");
		TextureRenderbufferEXT = provider.getFunctionAddress("glTextureRenderbufferEXT");
		MultiTexRenderbufferEXT = provider.getFunctionAddress("glMultiTexRenderbufferEXT");
		VertexArrayVertexOffsetEXT = provider.getFunctionAddress("glVertexArrayVertexOffsetEXT");
		VertexArrayColorOffsetEXT = provider.getFunctionAddress("glVertexArrayColorOffsetEXT");
		VertexArrayEdgeFlagOffsetEXT = provider.getFunctionAddress("glVertexArrayEdgeFlagOffsetEXT");
		VertexArrayIndexOffsetEXT = provider.getFunctionAddress("glVertexArrayIndexOffsetEXT");
		VertexArrayNormalOffsetEXT = provider.getFunctionAddress("glVertexArrayNormalOffsetEXT");
		VertexArrayTexCoordOffsetEXT = provider.getFunctionAddress("glVertexArrayTexCoordOffsetEXT");
		VertexArrayMultiTexCoordOffsetEXT = provider.getFunctionAddress("glVertexArrayMultiTexCoordOffsetEXT");
		VertexArrayFogCoordOffsetEXT = provider.getFunctionAddress("glVertexArrayFogCoordOffsetEXT");
		VertexArraySecondaryColorOffsetEXT = provider.getFunctionAddress("glVertexArraySecondaryColorOffsetEXT");
		VertexArrayVertexAttribOffsetEXT = provider.getFunctionAddress("glVertexArrayVertexAttribOffsetEXT");
		VertexArrayVertexAttribIOffsetEXT = provider.getFunctionAddress("glVertexArrayVertexAttribIOffsetEXT");
		EnableVertexArrayEXT = provider.getFunctionAddress("glEnableVertexArrayEXT");
		DisableVertexArrayEXT = provider.getFunctionAddress("glDisableVertexArrayEXT");
		EnableVertexArrayAttribEXT = provider.getFunctionAddress("glEnableVertexArrayAttribEXT");
		DisableVertexArrayAttribEXT = provider.getFunctionAddress("glDisableVertexArrayAttribEXT");
		GetVertexArrayIntegervEXT = provider.getFunctionAddress("glGetVertexArrayIntegervEXT");
		GetVertexArrayPointervEXT = provider.getFunctionAddress("glGetVertexArrayPointervEXT");
		GetVertexArrayIntegeri_vEXT = provider.getFunctionAddress("glGetVertexArrayIntegeri_vEXT");
		GetVertexArrayPointeri_vEXT = provider.getFunctionAddress("glGetVertexArrayPointeri_vEXT");
		MapNamedBufferRangeEXT = provider.getFunctionAddress("glMapNamedBufferRangeEXT");
		FlushMappedNamedBufferRangeEXT = provider.getFunctionAddress("glFlushMappedNamedBufferRangeEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTDirectStateAccess} instance for the current context. */
	public static EXTDirectStateAccess getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTDirectStateAccess);
	}

	static EXTDirectStateAccess create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_direct_state_access") ) return null;

		EXTDirectStateAccess funcs = new EXTDirectStateAccess(provider);

		boolean supported = checkFunctions(
			funcs.ClientAttribDefaultEXT, funcs.PushClientAttribDefaultEXT, funcs.MatrixLoadfEXT, funcs.MatrixLoaddEXT, funcs.MatrixMultfEXT, 
			funcs.MatrixMultdEXT, funcs.MatrixLoadIdentityEXT, funcs.MatrixRotatefEXT, funcs.MatrixRotatedEXT, funcs.MatrixScalefEXT, funcs.MatrixScaledEXT, 
			funcs.MatrixTranslatefEXT, funcs.MatrixTranslatedEXT, funcs.MatrixOrthoEXT, funcs.MatrixFrustumEXT, funcs.MatrixPushEXT, funcs.MatrixPopEXT, 
			funcs.TextureParameteriEXT, funcs.TextureParameterivEXT, funcs.TextureParameterfEXT, funcs.TextureParameterfvEXT, funcs.TextureImage1DEXT, 
			funcs.TextureImage2DEXT, funcs.TextureSubImage1DEXT, funcs.TextureSubImage2DEXT, funcs.CopyTextureImage1DEXT, funcs.CopyTextureImage2DEXT, 
			funcs.CopyTextureSubImage1DEXT, funcs.CopyTextureSubImage2DEXT, funcs.GetTextureImageEXT, funcs.GetTextureParameterfvEXT, 
			funcs.GetTextureParameterivEXT, funcs.GetTextureLevelParameterfvEXT, funcs.GetTextureLevelParameterivEXT, 
			ext.contains("OpenGL12") ? funcs.TextureImage3DEXT : -1L, ext.contains("OpenGL12") ? funcs.TextureSubImage3DEXT : -1L, 
			ext.contains("OpenGL12") ? funcs.CopyTextureSubImage3DEXT : -1L, ext.contains("OpenGL13") ? funcs.BindMultiTextureEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.MultiTexCoordPointerEXT : -1L, ext.contains("OpenGL13") ? funcs.MultiTexEnvfEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.MultiTexEnvfvEXT : -1L, ext.contains("OpenGL13") ? funcs.MultiTexEnviEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.MultiTexEnvivEXT : -1L, ext.contains("OpenGL13") ? funcs.MultiTexGendEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.MultiTexGendvEXT : -1L, ext.contains("OpenGL13") ? funcs.MultiTexGenfEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.MultiTexGenfvEXT : -1L, ext.contains("OpenGL13") ? funcs.MultiTexGeniEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.MultiTexGenivEXT : -1L, ext.contains("OpenGL13") ? funcs.GetMultiTexEnvfvEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.GetMultiTexEnvivEXT : -1L, ext.contains("OpenGL13") ? funcs.GetMultiTexGendvEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.GetMultiTexGenfvEXT : -1L, ext.contains("OpenGL13") ? funcs.GetMultiTexGenivEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.MultiTexParameteriEXT : -1L, ext.contains("OpenGL13") ? funcs.MultiTexParameterivEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.MultiTexParameterfEXT : -1L, ext.contains("OpenGL13") ? funcs.MultiTexParameterfvEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.MultiTexImage1DEXT : -1L, ext.contains("OpenGL13") ? funcs.MultiTexImage2DEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.MultiTexSubImage1DEXT : -1L, ext.contains("OpenGL13") ? funcs.MultiTexSubImage2DEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.CopyMultiTexImage1DEXT : -1L, ext.contains("OpenGL13") ? funcs.CopyMultiTexImage2DEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.CopyMultiTexSubImage1DEXT : -1L, ext.contains("OpenGL13") ? funcs.CopyMultiTexSubImage2DEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.GetMultiTexImageEXT : -1L, ext.contains("OpenGL13") ? funcs.GetMultiTexParameterfvEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.GetMultiTexParameterivEXT : -1L, ext.contains("OpenGL13") ? funcs.GetMultiTexLevelParameterfvEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.GetMultiTexLevelParameterivEXT : -1L, ext.contains("OpenGL13") ? funcs.MultiTexImage3DEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.MultiTexSubImage3DEXT : -1L, ext.contains("OpenGL13") ? funcs.CopyMultiTexSubImage3DEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.EnableClientStateIndexedEXT : -1L, ext.contains("OpenGL13") ? funcs.DisableClientStateIndexedEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.GetFloatIndexedvEXT : -1L, ext.contains("OpenGL13") ? funcs.GetDoubleIndexedvEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.GetPointerIndexedvEXT : -1L, ext.contains("OpenGL13") ? funcs.EnableIndexedEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.DisableIndexedEXT : -1L, ext.contains("OpenGL13") ? funcs.IsEnabledIndexedEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.GetIntegerIndexedvEXT : -1L, ext.contains("OpenGL13") ? funcs.GetBooleanIndexedvEXT : -1L, 
			ext.contains("GL_ARB_vertex_program") ? funcs.NamedProgramStringEXT : -1L, 
			ext.contains("GL_ARB_vertex_program") ? funcs.NamedProgramLocalParameter4dEXT : -1L, 
			ext.contains("GL_ARB_vertex_program") ? funcs.NamedProgramLocalParameter4dvEXT : -1L, 
			ext.contains("GL_ARB_vertex_program") ? funcs.NamedProgramLocalParameter4fEXT : -1L, 
			ext.contains("GL_ARB_vertex_program") ? funcs.NamedProgramLocalParameter4fvEXT : -1L, 
			ext.contains("GL_ARB_vertex_program") ? funcs.GetNamedProgramLocalParameterdvEXT : -1L, 
			ext.contains("GL_ARB_vertex_program") ? funcs.GetNamedProgramLocalParameterfvEXT : -1L, 
			ext.contains("GL_ARB_vertex_program") ? funcs.GetNamedProgramivEXT : -1L, 
			ext.contains("GL_ARB_vertex_program") ? funcs.GetNamedProgramStringEXT : -1L, ext.contains("OpenGL13") ? funcs.CompressedTextureImage3DEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.CompressedTextureImage2DEXT : -1L, ext.contains("OpenGL13") ? funcs.CompressedTextureImage1DEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.CompressedTextureSubImage3DEXT : -1L, ext.contains("OpenGL13") ? funcs.CompressedTextureSubImage2DEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.CompressedTextureSubImage1DEXT : -1L, ext.contains("OpenGL13") ? funcs.GetCompressedTextureImageEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.CompressedMultiTexImage3DEXT : -1L, ext.contains("OpenGL13") ? funcs.CompressedMultiTexImage2DEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.CompressedMultiTexImage1DEXT : -1L, ext.contains("OpenGL13") ? funcs.CompressedMultiTexSubImage3DEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.CompressedMultiTexSubImage2DEXT : -1L, ext.contains("OpenGL13") ? funcs.CompressedMultiTexSubImage1DEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.GetCompressedMultiTexImageEXT : -1L, ext.contains("OpenGL13") ? funcs.MatrixLoadTransposefEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.MatrixLoadTransposedEXT : -1L, ext.contains("OpenGL13") ? funcs.MatrixMultTransposefEXT : -1L, 
			ext.contains("OpenGL13") ? funcs.MatrixMultTransposedEXT : -1L, ext.contains("OpenGL15") ? funcs.NamedBufferDataEXT : -1L, 
			ext.contains("OpenGL15") ? funcs.NamedBufferSubDataEXT : -1L, ext.contains("OpenGL15") ? funcs.MapNamedBufferEXT : -1L, 
			ext.contains("OpenGL15") ? funcs.UnmapNamedBufferEXT : -1L, ext.contains("OpenGL15") ? funcs.GetNamedBufferParameterivEXT : -1L, 
			ext.contains("OpenGL15") ? funcs.GetNamedBufferSubDataEXT : -1L, ext.contains("OpenGL20") ? funcs.ProgramUniform1fEXT : -1L, 
			ext.contains("OpenGL20") ? funcs.ProgramUniform2fEXT : -1L, ext.contains("OpenGL20") ? funcs.ProgramUniform3fEXT : -1L, 
			ext.contains("OpenGL20") ? funcs.ProgramUniform4fEXT : -1L, ext.contains("OpenGL20") ? funcs.ProgramUniform1iEXT : -1L, 
			ext.contains("OpenGL20") ? funcs.ProgramUniform2iEXT : -1L, ext.contains("OpenGL20") ? funcs.ProgramUniform3iEXT : -1L, 
			ext.contains("OpenGL20") ? funcs.ProgramUniform4iEXT : -1L, ext.contains("OpenGL20") ? funcs.ProgramUniform1fvEXT : -1L, 
			ext.contains("OpenGL20") ? funcs.ProgramUniform2fvEXT : -1L, ext.contains("OpenGL20") ? funcs.ProgramUniform3fvEXT : -1L, 
			ext.contains("OpenGL20") ? funcs.ProgramUniform4fvEXT : -1L, ext.contains("OpenGL20") ? funcs.ProgramUniform1ivEXT : -1L, 
			ext.contains("OpenGL20") ? funcs.ProgramUniform2ivEXT : -1L, ext.contains("OpenGL20") ? funcs.ProgramUniform3ivEXT : -1L, 
			ext.contains("OpenGL20") ? funcs.ProgramUniform4ivEXT : -1L, ext.contains("OpenGL20") ? funcs.ProgramUniformMatrix2fvEXT : -1L, 
			ext.contains("OpenGL20") ? funcs.ProgramUniformMatrix3fvEXT : -1L, ext.contains("OpenGL20") ? funcs.ProgramUniformMatrix4fvEXT : -1L, 
			ext.contains("OpenGL21") ? funcs.ProgramUniformMatrix2x3fvEXT : -1L, ext.contains("OpenGL21") ? funcs.ProgramUniformMatrix3x2fvEXT : -1L, 
			ext.contains("OpenGL21") ? funcs.ProgramUniformMatrix2x4fvEXT : -1L, ext.contains("OpenGL21") ? funcs.ProgramUniformMatrix4x2fvEXT : -1L, 
			ext.contains("OpenGL21") ? funcs.ProgramUniformMatrix3x4fvEXT : -1L, ext.contains("OpenGL21") ? funcs.ProgramUniformMatrix4x3fvEXT : -1L, 
			ext.contains("GL_EXT_texture_buffer_object") ? funcs.TextureBufferEXT : -1L, 
			ext.contains("GL_EXT_texture_buffer_object") ? funcs.MultiTexBufferEXT : -1L, 
			ext.contains("GL_EXT_texture_integer") ? funcs.TextureParameterIivEXT : -1L, 
			ext.contains("GL_EXT_texture_integer") ? funcs.TextureParameterIuivEXT : -1L, 
			ext.contains("GL_EXT_texture_integer") ? funcs.GetTextureParameterIivEXT : -1L, 
			ext.contains("GL_EXT_texture_integer") ? funcs.GetTextureParameterIuivEXT : -1L, 
			ext.contains("GL_EXT_texture_integer") ? funcs.MultiTexParameterIivEXT : -1L, 
			ext.contains("GL_EXT_texture_integer") ? funcs.MultiTexParameterIuivEXT : -1L, 
			ext.contains("GL_EXT_texture_integer") ? funcs.GetMultiTexParameterIivEXT : -1L, 
			ext.contains("GL_EXT_texture_integer") ? funcs.GetMultiTexParameterIuivEXT : -1L, 
			ext.contains("GL_EXT_gpu_shader4") ? funcs.ProgramUniform1uiEXT : -1L, ext.contains("GL_EXT_gpu_shader4") ? funcs.ProgramUniform2uiEXT : -1L, 
			ext.contains("GL_EXT_gpu_shader4") ? funcs.ProgramUniform3uiEXT : -1L, ext.contains("GL_EXT_gpu_shader4") ? funcs.ProgramUniform4uiEXT : -1L, 
			ext.contains("GL_EXT_gpu_shader4") ? funcs.ProgramUniform1uivEXT : -1L, ext.contains("GL_EXT_gpu_shader4") ? funcs.ProgramUniform2uivEXT : -1L, 
			ext.contains("GL_EXT_gpu_shader4") ? funcs.ProgramUniform3uivEXT : -1L, ext.contains("GL_EXT_gpu_shader4") ? funcs.ProgramUniform4uivEXT : -1L, 
			ext.contains("GL_EXT_gpu_program_parameters") ? funcs.NamedProgramLocalParameters4fvEXT : -1L, 
			ext.contains("GL_NV_gpu_program4") ? funcs.NamedProgramLocalParameterI4iEXT : -1L, 
			ext.contains("GL_NV_gpu_program4") ? funcs.NamedProgramLocalParameterI4ivEXT : -1L, 
			ext.contains("GL_NV_gpu_program4") ? funcs.NamedProgramLocalParametersI4ivEXT : -1L, 
			ext.contains("GL_NV_gpu_program4") ? funcs.NamedProgramLocalParameterI4uiEXT : -1L, 
			ext.contains("GL_NV_gpu_program4") ? funcs.NamedProgramLocalParameterI4uivEXT : -1L, 
			ext.contains("GL_NV_gpu_program4") ? funcs.NamedProgramLocalParametersI4uivEXT : -1L, 
			ext.contains("GL_NV_gpu_program4") ? funcs.GetNamedProgramLocalParameterIivEXT : -1L, 
			ext.contains("GL_NV_gpu_program4") ? funcs.GetNamedProgramLocalParameterIuivEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.NamedRenderbufferStorageEXT : -1L, ext.contains("OpenGL30") ? funcs.GetNamedRenderbufferParameterivEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.NamedRenderbufferStorageMultisampleEXT : -1L, 
			ext.contains("GL_NV_framebuffer_multisample_coverage") ? funcs.NamedRenderbufferStorageMultisampleCoverageEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.CheckNamedFramebufferStatusEXT : -1L, ext.contains("OpenGL30") ? funcs.NamedFramebufferTexture1DEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.NamedFramebufferTexture2DEXT : -1L, ext.contains("OpenGL30") ? funcs.NamedFramebufferTexture3DEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.NamedFramebufferRenderbufferEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.GetNamedFramebufferAttachmentParameterivEXT : -1L, ext.contains("OpenGL30") ? funcs.GenerateTextureMipmapEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.GenerateMultiTexMipmapEXT : -1L, ext.contains("OpenGL30") ? funcs.FramebufferDrawBufferEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.FramebufferDrawBuffersEXT : -1L, ext.contains("OpenGL30") ? funcs.FramebufferReadBufferEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.GetFramebufferParameterivEXT : -1L, ext.contains("OpenGL30") ? funcs.NamedCopyBufferSubDataEXT : -1L, 
			ext.contains("GL_EXT_geometry_shader4") || ext.contains("GL_NV_gpu_program4") ? funcs.NamedFramebufferTextureEXT : -1L, 
			ext.contains("GL_EXT_geometry_shader4") || ext.contains("GL_NV_gpu_program4") ? funcs.NamedFramebufferTextureLayerEXT : -1L, 
			ext.contains("GL_EXT_geometry_shader4") || ext.contains("GL_NV_gpu_program4") ? funcs.NamedFramebufferTextureFaceEXT : -1L, 
			ext.contains("GL_NV_explicit_multisample") ? funcs.TextureRenderbufferEXT : -1L, 
			ext.contains("GL_NV_explicit_multisample") ? funcs.MultiTexRenderbufferEXT : -1L, ext.contains("OpenGL30") ? funcs.VertexArrayVertexOffsetEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.VertexArrayColorOffsetEXT : -1L, ext.contains("OpenGL30") ? funcs.VertexArrayEdgeFlagOffsetEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.VertexArrayIndexOffsetEXT : -1L, ext.contains("OpenGL30") ? funcs.VertexArrayNormalOffsetEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.VertexArrayTexCoordOffsetEXT : -1L, ext.contains("OpenGL30") ? funcs.VertexArrayMultiTexCoordOffsetEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.VertexArrayFogCoordOffsetEXT : -1L, ext.contains("OpenGL30") ? funcs.VertexArraySecondaryColorOffsetEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.VertexArrayVertexAttribOffsetEXT : -1L, ext.contains("OpenGL30") ? funcs.VertexArrayVertexAttribIOffsetEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.EnableVertexArrayEXT : -1L, ext.contains("OpenGL30") ? funcs.DisableVertexArrayEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.EnableVertexArrayAttribEXT : -1L, ext.contains("OpenGL30") ? funcs.DisableVertexArrayAttribEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.GetVertexArrayIntegervEXT : -1L, ext.contains("OpenGL30") ? funcs.GetVertexArrayPointervEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.GetVertexArrayIntegeri_vEXT : -1L, ext.contains("OpenGL30") ? funcs.GetVertexArrayPointeri_vEXT : -1L, 
			ext.contains("OpenGL30") ? funcs.MapNamedBufferRangeEXT : -1L, ext.contains("OpenGL30") ? funcs.FlushMappedNamedBufferRangeEXT : -1L
		);

		return GL.checkExtension("GL_EXT_direct_state_access", funcs, supported);
	}

	// --- [ glClientAttribDefaultEXT ] ---

	public static void glClientAttribDefaultEXT(int mask) {
		long __functionAddress = getInstance().ClientAttribDefaultEXT;
		callIV(__functionAddress, mask);
	}

	// --- [ glPushClientAttribDefaultEXT ] ---

	public static void glPushClientAttribDefaultEXT(int mask) {
		long __functionAddress = getInstance().PushClientAttribDefaultEXT;
		callIV(__functionAddress, mask);
	}

	// --- [ glMatrixLoadfEXT ] ---

	/** Unsafe version of {@link #glMatrixLoadfEXT MatrixLoadfEXT} */
	@JavadocExclude
	public static void nglMatrixLoadfEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixLoadfEXT;
		callIPV(__functionAddress, matrixMode, m);
	}

	public static void glMatrixLoadfEXT(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 2);
		nglMatrixLoadfEXT(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixLoadfEXT MatrixLoadfEXT} */
	public static void glMatrixLoadfEXT(int matrixMode, FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglMatrixLoadfEXT(matrixMode, memAddress(m));
	}

	// --- [ glMatrixLoaddEXT ] ---

	/** Unsafe version of {@link #glMatrixLoaddEXT MatrixLoaddEXT} */
	@JavadocExclude
	public static void nglMatrixLoaddEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixLoaddEXT;
		callIPV(__functionAddress, matrixMode, m);
	}

	public static void glMatrixLoaddEXT(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 3);
		nglMatrixLoaddEXT(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixLoaddEXT MatrixLoaddEXT} */
	public static void glMatrixLoaddEXT(int matrixMode, DoubleBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglMatrixLoaddEXT(matrixMode, memAddress(m));
	}

	// --- [ glMatrixMultfEXT ] ---

	/** Unsafe version of {@link #glMatrixMultfEXT MatrixMultfEXT} */
	@JavadocExclude
	public static void nglMatrixMultfEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixMultfEXT;
		callIPV(__functionAddress, matrixMode, m);
	}

	public static void glMatrixMultfEXT(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 2);
		nglMatrixMultfEXT(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixMultfEXT MatrixMultfEXT} */
	public static void glMatrixMultfEXT(int matrixMode, FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglMatrixMultfEXT(matrixMode, memAddress(m));
	}

	// --- [ glMatrixMultdEXT ] ---

	/** Unsafe version of {@link #glMatrixMultdEXT MatrixMultdEXT} */
	@JavadocExclude
	public static void nglMatrixMultdEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixMultdEXT;
		callIPV(__functionAddress, matrixMode, m);
	}

	public static void glMatrixMultdEXT(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 3);
		nglMatrixMultdEXT(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixMultdEXT MatrixMultdEXT} */
	public static void glMatrixMultdEXT(int matrixMode, DoubleBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglMatrixMultdEXT(matrixMode, memAddress(m));
	}

	// --- [ glMatrixLoadIdentityEXT ] ---

	public static void glMatrixLoadIdentityEXT(int matrixMode) {
		long __functionAddress = getInstance().MatrixLoadIdentityEXT;
		callIV(__functionAddress, matrixMode);
	}

	// --- [ glMatrixRotatefEXT ] ---

	public static void glMatrixRotatefEXT(int matrixMode, float angle, float x, float y, float z) {
		long __functionAddress = getInstance().MatrixRotatefEXT;
		callIFFFFV(__functionAddress, matrixMode, angle, x, y, z);
	}

	// --- [ glMatrixRotatedEXT ] ---

	public static void glMatrixRotatedEXT(int matrixMode, double angle, double x, double y, double z) {
		long __functionAddress = getInstance().MatrixRotatedEXT;
		callIDDDDV(__functionAddress, matrixMode, angle, x, y, z);
	}

	// --- [ glMatrixScalefEXT ] ---

	public static void glMatrixScalefEXT(int matrixMode, float x, float y, float z) {
		long __functionAddress = getInstance().MatrixScalefEXT;
		callIFFFV(__functionAddress, matrixMode, x, y, z);
	}

	// --- [ glMatrixScaledEXT ] ---

	public static void glMatrixScaledEXT(int matrixMode, double x, double y, double z) {
		long __functionAddress = getInstance().MatrixScaledEXT;
		callIDDDV(__functionAddress, matrixMode, x, y, z);
	}

	// --- [ glMatrixTranslatefEXT ] ---

	public static void glMatrixTranslatefEXT(int matrixMode, float x, float y, float z) {
		long __functionAddress = getInstance().MatrixTranslatefEXT;
		callIFFFV(__functionAddress, matrixMode, x, y, z);
	}

	// --- [ glMatrixTranslatedEXT ] ---

	public static void glMatrixTranslatedEXT(int matrixMode, double x, double y, double z) {
		long __functionAddress = getInstance().MatrixTranslatedEXT;
		callIDDDV(__functionAddress, matrixMode, x, y, z);
	}

	// --- [ glMatrixOrthoEXT ] ---

	public static void glMatrixOrthoEXT(int matrixMode, double l, double r, double b, double t, double n, double f) {
		long __functionAddress = getInstance().MatrixOrthoEXT;
		callIDDDDDDV(__functionAddress, matrixMode, l, r, b, t, n, f);
	}

	// --- [ glMatrixFrustumEXT ] ---

	public static void glMatrixFrustumEXT(int matrixMode, double l, double r, double b, double t, double n, double f) {
		long __functionAddress = getInstance().MatrixFrustumEXT;
		callIDDDDDDV(__functionAddress, matrixMode, l, r, b, t, n, f);
	}

	// --- [ glMatrixPushEXT ] ---

	public static void glMatrixPushEXT(int matrixMode) {
		long __functionAddress = getInstance().MatrixPushEXT;
		callIV(__functionAddress, matrixMode);
	}

	// --- [ glMatrixPopEXT ] ---

	public static void glMatrixPopEXT(int matrixMode) {
		long __functionAddress = getInstance().MatrixPopEXT;
		callIV(__functionAddress, matrixMode);
	}

	// --- [ glTextureParameteriEXT ] ---

	public static void glTextureParameteriEXT(int texture, int target, int pname, int param) {
		long __functionAddress = getInstance().TextureParameteriEXT;
		callIIIIV(__functionAddress, texture, target, pname, param);
	}

	// --- [ glTextureParameterivEXT ] ---

	/** Unsafe version of {@link #glTextureParameterivEXT TextureParameterivEXT} */
	@JavadocExclude
	public static void nglTextureParameterivEXT(int texture, int target, int pname, long param) {
		long __functionAddress = getInstance().TextureParameterivEXT;
		callIIIPV(__functionAddress, texture, target, pname, param);
	}

	public static void glTextureParameterivEXT(int texture, int target, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 4 << 2);
		nglTextureParameterivEXT(texture, target, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glTextureParameterivEXT TextureParameterivEXT} */
	public static void glTextureParameterivEXT(int texture, int target, int pname, IntBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 4);
		nglTextureParameterivEXT(texture, target, pname, memAddress(param));
	}

	// --- [ glTextureParameterfEXT ] ---

	public static void glTextureParameterfEXT(int texture, int target, int pname, float param) {
		long __functionAddress = getInstance().TextureParameterfEXT;
		callIIIFV(__functionAddress, texture, target, pname, param);
	}

	// --- [ glTextureParameterfvEXT ] ---

	/** Unsafe version of {@link #glTextureParameterfvEXT TextureParameterfvEXT} */
	@JavadocExclude
	public static void nglTextureParameterfvEXT(int texture, int target, int pname, long param) {
		long __functionAddress = getInstance().TextureParameterfvEXT;
		callIIIPV(__functionAddress, texture, target, pname, param);
	}

	public static void glTextureParameterfvEXT(int texture, int target, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 4 << 2);
		nglTextureParameterfvEXT(texture, target, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glTextureParameterfvEXT TextureParameterfvEXT} */
	public static void glTextureParameterfvEXT(int texture, int target, int pname, FloatBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 4);
		nglTextureParameterfvEXT(texture, target, pname, memAddress(param));
	}

	// --- [ glTextureImage1DEXT ] ---

	/** Unsafe version of {@link #glTextureImage1DEXT TextureImage1DEXT} */
	@JavadocExclude
	public static void nglTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureImage1DEXT;
		callIIIIIIIIPV(__functionAddress, texture, target, level, internalformat, width, border, format, type, pixels);
	}

	public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/** Buffer object offset version of: {@link #glTextureImage1DEXT TextureImage1DEXT} */
	public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTextureImage1DEXT TextureImage1DEXT} */
	public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glTextureImage1DEXT TextureImage1DEXT} */
	public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glTextureImage1DEXT TextureImage1DEXT} */
	public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/** DoubleBuffer version of: {@link #glTextureImage1DEXT TextureImage1DEXT} */
	public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glTextureImage2DEXT ] ---

	/** Unsafe version of {@link #glTextureImage2DEXT TextureImage2DEXT} */
	@JavadocExclude
	public static void nglTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureImage2DEXT;
		callIIIIIIIIIPV(__functionAddress, texture, target, level, internalformat, width, height, border, format, type, pixels);
	}

	public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** Buffer object offset version of: {@link #glTextureImage2DEXT TextureImage2DEXT} */
	public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTextureImage2DEXT TextureImage2DEXT} */
	public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glTextureImage2DEXT TextureImage2DEXT} */
	public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glTextureImage2DEXT TextureImage2DEXT} */
	public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** DoubleBuffer version of: {@link #glTextureImage2DEXT TextureImage2DEXT} */
	public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glTextureSubImage1DEXT ] ---

	/** Unsafe version of {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
	@JavadocExclude
	public static void nglTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureSubImage1DEXT;
		callIIIIIIIPV(__functionAddress, texture, target, level, xoffset, width, format, type, pixels);
	}

	public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
	public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
	public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
	public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
	public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
	public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
	}

	// --- [ glTextureSubImage2DEXT ] ---

	/** Unsafe version of {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
	@JavadocExclude
	public static void nglTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureSubImage2DEXT;
		callIIIIIIIIIPV(__functionAddress, texture, target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
	public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
	public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
	public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
	public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
	public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	// --- [ glCopyTextureImage1DEXT ] ---

	public static void glCopyTextureImage1DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int border) {
		long __functionAddress = getInstance().CopyTextureImage1DEXT;
		callIIIIIIIIV(__functionAddress, texture, target, level, internalformat, x, y, width, border);
	}

	// --- [ glCopyTextureImage2DEXT ] ---

	public static void glCopyTextureImage2DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int height, int border) {
		long __functionAddress = getInstance().CopyTextureImage2DEXT;
		callIIIIIIIIIV(__functionAddress, texture, target, level, internalformat, x, y, width, height, border);
	}

	// --- [ glCopyTextureSubImage1DEXT ] ---

	public static void glCopyTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int x, int y, int width) {
		long __functionAddress = getInstance().CopyTextureSubImage1DEXT;
		callIIIIIIIV(__functionAddress, texture, target, level, xoffset, x, y, width);
	}

	// --- [ glCopyTextureSubImage2DEXT ] ---

	public static void glCopyTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().CopyTextureSubImage2DEXT;
		callIIIIIIIIIV(__functionAddress, texture, target, level, xoffset, yoffset, x, y, width, height);
	}

	// --- [ glGetTextureImageEXT ] ---

	/** Unsafe version of {@link #glGetTextureImageEXT GetTextureImageEXT} */
	@JavadocExclude
	public static void nglGetTextureImageEXT(int texture, int target, int level, int format, int type, long pixels) {
		long __functionAddress = getInstance().GetTextureImageEXT;
		callIIIIIPV(__functionAddress, texture, target, level, format, type, pixels);
	}

	public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glGetTextureImageEXT GetTextureImageEXT} */
	public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetTextureImageEXT(texture, target, level, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glGetTextureImageEXT GetTextureImageEXT} */
	public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glGetTextureImageEXT GetTextureImageEXT} */
	public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glGetTextureImageEXT GetTextureImageEXT} */
	public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glGetTextureImageEXT GetTextureImageEXT} */
	public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
	}

	// --- [ glGetTextureParameterfvEXT ] ---

	/** Unsafe version of {@link #glGetTextureParameterfvEXT GetTextureParameterfvEXT} */
	@JavadocExclude
	public static void nglGetTextureParameterfvEXT(int texture, int target, int pname, long params) {
		long __functionAddress = getInstance().GetTextureParameterfvEXT;
		callIIIPV(__functionAddress, texture, target, pname, params);
	}

	public static void glGetTextureParameterfvEXT(int texture, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTextureParameterfvEXT(texture, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTextureParameterfvEXT GetTextureParameterfvEXT} */
	public static void glGetTextureParameterfvEXT(int texture, int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTextureParameterfvEXT(texture, target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTextureParameterfvEXT GetTextureParameterfvEXT} */
	public static float glGetTextureParameterfEXT(int texture, int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetTextureParameterfvEXT(texture, target, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetTextureParameterivEXT ] ---

	/** Unsafe version of {@link #glGetTextureParameterivEXT GetTextureParameterivEXT} */
	@JavadocExclude
	public static void nglGetTextureParameterivEXT(int texture, int target, int pname, long params) {
		long __functionAddress = getInstance().GetTextureParameterivEXT;
		callIIIPV(__functionAddress, texture, target, pname, params);
	}

	public static void glGetTextureParameterivEXT(int texture, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTextureParameterivEXT(texture, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTextureParameterivEXT GetTextureParameterivEXT} */
	public static void glGetTextureParameterivEXT(int texture, int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTextureParameterivEXT(texture, target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTextureParameterivEXT GetTextureParameterivEXT} */
	public static int glGetTextureParameteriEXT(int texture, int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTextureParameterivEXT(texture, target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetTextureLevelParameterfvEXT ] ---

	/** Unsafe version of {@link #glGetTextureLevelParameterfvEXT GetTextureLevelParameterfvEXT} */
	@JavadocExclude
	public static void nglGetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, long params) {
		long __functionAddress = getInstance().GetTextureLevelParameterfvEXT;
		callIIIIPV(__functionAddress, texture, target, level, pname, params);
	}

	public static void glGetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTextureLevelParameterfvEXT(texture, target, level, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTextureLevelParameterfvEXT GetTextureLevelParameterfvEXT} */
	public static void glGetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTextureLevelParameterfvEXT(texture, target, level, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTextureLevelParameterfvEXT GetTextureLevelParameterfvEXT} */
	public static float glGetTextureLevelParameterfEXT(int texture, int target, int level, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetTextureLevelParameterfvEXT(texture, target, level, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetTextureLevelParameterivEXT ] ---

	/** Unsafe version of {@link #glGetTextureLevelParameterivEXT GetTextureLevelParameterivEXT} */
	@JavadocExclude
	public static void nglGetTextureLevelParameterivEXT(int texture, int target, int level, int pname, long params) {
		long __functionAddress = getInstance().GetTextureLevelParameterivEXT;
		callIIIIPV(__functionAddress, texture, target, level, pname, params);
	}

	public static void glGetTextureLevelParameterivEXT(int texture, int target, int level, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTextureLevelParameterivEXT(texture, target, level, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTextureLevelParameterivEXT GetTextureLevelParameterivEXT} */
	public static void glGetTextureLevelParameterivEXT(int texture, int target, int level, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTextureLevelParameterivEXT(texture, target, level, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTextureLevelParameterivEXT GetTextureLevelParameterivEXT} */
	public static int glGetTextureLevelParameteriEXT(int texture, int target, int level, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTextureLevelParameterivEXT(texture, target, level, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glTextureImage3DEXT ] ---

	/** Unsafe version of {@link #glTextureImage3DEXT TextureImage3DEXT} */
	@JavadocExclude
	public static void nglTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIIPV(__functionAddress, texture, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** Buffer object offset version of: {@link #glTextureImage3DEXT TextureImage3DEXT} */
	public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTextureImage3DEXT TextureImage3DEXT} */
	public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glTextureImage3DEXT TextureImage3DEXT} */
	public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glTextureImage3DEXT TextureImage3DEXT} */
	public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** DoubleBuffer version of: {@link #glTextureImage3DEXT TextureImage3DEXT} */
	public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glTextureSubImage3DEXT ] ---

	/** Unsafe version of {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
	@JavadocExclude
	public static void nglTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureSubImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIIIPV(__functionAddress, texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
	public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
	public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
	public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
	public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
	public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	// --- [ glCopyTextureSubImage3DEXT ] ---

	public static void glCopyTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().CopyTextureSubImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIIV(__functionAddress, texture, target, level, xoffset, yoffset, zoffset, x, y, width, height);
	}

	// --- [ glBindMultiTextureEXT ] ---

	public static void glBindMultiTextureEXT(int texunit, int target, int texture) {
		long __functionAddress = getInstance().BindMultiTextureEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIV(__functionAddress, texunit, target, texture);
	}

	// --- [ glMultiTexCoordPointerEXT ] ---

	/** Unsafe version of {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
	@JavadocExclude
	public static void nglMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, long pointer) {
		long __functionAddress = getInstance().MultiTexCoordPointerEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIPV(__functionAddress, texunit, size, type, stride, pointer);
	}

	public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
	public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglMultiTexCoordPointerEXT(texunit, size, type, stride, pointerOffset);
	}

	/** ShortBuffer version of: {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
	public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
	}

	/** IntBuffer version of: {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
	public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, IntBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
	}

	/** FloatBuffer version of: {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
	public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, FloatBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
	}

	// --- [ glMultiTexEnvfEXT ] ---

	public static void glMultiTexEnvfEXT(int texunit, int target, int pname, float param) {
		long __functionAddress = getInstance().MultiTexEnvfEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIFV(__functionAddress, texunit, target, pname, param);
	}

	// --- [ glMultiTexEnvfvEXT ] ---

	/** Unsafe version of {@link #glMultiTexEnvfvEXT MultiTexEnvfvEXT} */
	@JavadocExclude
	public static void nglMultiTexEnvfvEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().MultiTexEnvfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, target, pname, params);
	}

	public static void glMultiTexEnvfvEXT(int texunit, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglMultiTexEnvfvEXT(texunit, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glMultiTexEnvfvEXT MultiTexEnvfvEXT} */
	public static void glMultiTexEnvfvEXT(int texunit, int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglMultiTexEnvfvEXT(texunit, target, pname, memAddress(params));
	}

	// --- [ glMultiTexEnviEXT ] ---

	public static void glMultiTexEnviEXT(int texunit, int target, int pname, int param) {
		long __functionAddress = getInstance().MultiTexEnviEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIV(__functionAddress, texunit, target, pname, param);
	}

	// --- [ glMultiTexEnvivEXT ] ---

	/** Unsafe version of {@link #glMultiTexEnvivEXT MultiTexEnvivEXT} */
	@JavadocExclude
	public static void nglMultiTexEnvivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().MultiTexEnvivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, target, pname, params);
	}

	public static void glMultiTexEnvivEXT(int texunit, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglMultiTexEnvivEXT(texunit, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glMultiTexEnvivEXT MultiTexEnvivEXT} */
	public static void glMultiTexEnvivEXT(int texunit, int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglMultiTexEnvivEXT(texunit, target, pname, memAddress(params));
	}

	// --- [ glMultiTexGendEXT ] ---

	public static void glMultiTexGendEXT(int texunit, int coord, int pname, double param) {
		long __functionAddress = getInstance().MultiTexGendEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIDV(__functionAddress, texunit, coord, pname, param);
	}

	// --- [ glMultiTexGendvEXT ] ---

	/** Unsafe version of {@link #glMultiTexGendvEXT MultiTexGendvEXT} */
	@JavadocExclude
	public static void nglMultiTexGendvEXT(int texunit, int coord, int pname, long params) {
		long __functionAddress = getInstance().MultiTexGendvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, coord, pname, params);
	}

	public static void glMultiTexGendvEXT(int texunit, int coord, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 3);
		nglMultiTexGendvEXT(texunit, coord, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glMultiTexGendvEXT MultiTexGendvEXT} */
	public static void glMultiTexGendvEXT(int texunit, int coord, int pname, DoubleBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglMultiTexGendvEXT(texunit, coord, pname, memAddress(params));
	}

	// --- [ glMultiTexGenfEXT ] ---

	public static void glMultiTexGenfEXT(int texunit, int coord, int pname, float param) {
		long __functionAddress = getInstance().MultiTexGenfEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIFV(__functionAddress, texunit, coord, pname, param);
	}

	// --- [ glMultiTexGenfvEXT ] ---

	/** Unsafe version of {@link #glMultiTexGenfvEXT MultiTexGenfvEXT} */
	@JavadocExclude
	public static void nglMultiTexGenfvEXT(int texunit, int coord, int pname, long params) {
		long __functionAddress = getInstance().MultiTexGenfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, coord, pname, params);
	}

	public static void glMultiTexGenfvEXT(int texunit, int coord, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglMultiTexGenfvEXT(texunit, coord, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glMultiTexGenfvEXT MultiTexGenfvEXT} */
	public static void glMultiTexGenfvEXT(int texunit, int coord, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglMultiTexGenfvEXT(texunit, coord, pname, memAddress(params));
	}

	// --- [ glMultiTexGeniEXT ] ---

	public static void glMultiTexGeniEXT(int texunit, int coord, int pname, int param) {
		long __functionAddress = getInstance().MultiTexGeniEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIV(__functionAddress, texunit, coord, pname, param);
	}

	// --- [ glMultiTexGenivEXT ] ---

	/** Unsafe version of {@link #glMultiTexGenivEXT MultiTexGenivEXT} */
	@JavadocExclude
	public static void nglMultiTexGenivEXT(int texunit, int coord, int pname, long params) {
		long __functionAddress = getInstance().MultiTexGenivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, coord, pname, params);
	}

	public static void glMultiTexGenivEXT(int texunit, int coord, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglMultiTexGenivEXT(texunit, coord, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glMultiTexGenivEXT MultiTexGenivEXT} */
	public static void glMultiTexGenivEXT(int texunit, int coord, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglMultiTexGenivEXT(texunit, coord, pname, memAddress(params));
	}

	// --- [ glGetMultiTexEnvfvEXT ] ---

	/** Unsafe version of {@link #glGetMultiTexEnvfvEXT GetMultiTexEnvfvEXT} */
	@JavadocExclude
	public static void nglGetMultiTexEnvfvEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexEnvfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, target, pname, params);
	}

	public static void glGetMultiTexEnvfvEXT(int texunit, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetMultiTexEnvfvEXT(texunit, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetMultiTexEnvfvEXT GetMultiTexEnvfvEXT} */
	public static void glGetMultiTexEnvfvEXT(int texunit, int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetMultiTexEnvfvEXT(texunit, target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetMultiTexEnvfvEXT GetMultiTexEnvfvEXT} */
	public static float glGetMultiTexEnvfEXT(int texunit, int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetMultiTexEnvfvEXT(texunit, target, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetMultiTexEnvivEXT ] ---

	/** Unsafe version of {@link #glGetMultiTexEnvivEXT GetMultiTexEnvivEXT} */
	@JavadocExclude
	public static void nglGetMultiTexEnvivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexEnvivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, target, pname, params);
	}

	public static void glGetMultiTexEnvivEXT(int texunit, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetMultiTexEnvivEXT(texunit, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetMultiTexEnvivEXT GetMultiTexEnvivEXT} */
	public static void glGetMultiTexEnvivEXT(int texunit, int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetMultiTexEnvivEXT(texunit, target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetMultiTexEnvivEXT GetMultiTexEnvivEXT} */
	public static int glGetMultiTexEnviEXT(int texunit, int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetMultiTexEnvivEXT(texunit, target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetMultiTexGendvEXT ] ---

	/** Unsafe version of {@link #glGetMultiTexGendvEXT GetMultiTexGendvEXT} */
	@JavadocExclude
	public static void nglGetMultiTexGendvEXT(int texunit, int coord, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexGendvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, coord, pname, params);
	}

	public static void glGetMultiTexGendvEXT(int texunit, int coord, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetMultiTexGendvEXT(texunit, coord, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetMultiTexGendvEXT GetMultiTexGendvEXT} */
	public static void glGetMultiTexGendvEXT(int texunit, int coord, int pname, DoubleBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetMultiTexGendvEXT(texunit, coord, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetMultiTexGendvEXT GetMultiTexGendvEXT} */
	public static double glGetMultiTexGendEXT(int texunit, int coord, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.doubleParam();
		nglGetMultiTexGendvEXT(texunit, coord, pname, __buffer.address(params));
		return __buffer.doubleValue(params);
	}

	// --- [ glGetMultiTexGenfvEXT ] ---

	/** Unsafe version of {@link #glGetMultiTexGenfvEXT GetMultiTexGenfvEXT} */
	@JavadocExclude
	public static void nglGetMultiTexGenfvEXT(int texunit, int coord, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexGenfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, coord, pname, params);
	}

	public static void glGetMultiTexGenfvEXT(int texunit, int coord, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetMultiTexGenfvEXT(texunit, coord, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetMultiTexGenfvEXT GetMultiTexGenfvEXT} */
	public static void glGetMultiTexGenfvEXT(int texunit, int coord, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetMultiTexGenfvEXT(texunit, coord, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetMultiTexGenfvEXT GetMultiTexGenfvEXT} */
	public static float glGetMultiTexGenfEXT(int texunit, int coord, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetMultiTexGenfvEXT(texunit, coord, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetMultiTexGenivEXT ] ---

	/** Unsafe version of {@link #glGetMultiTexGenivEXT GetMultiTexGenivEXT} */
	@JavadocExclude
	public static void nglGetMultiTexGenivEXT(int texunit, int coord, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexGenivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, coord, pname, params);
	}

	public static void glGetMultiTexGenivEXT(int texunit, int coord, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetMultiTexGenivEXT(texunit, coord, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetMultiTexGenivEXT GetMultiTexGenivEXT} */
	public static void glGetMultiTexGenivEXT(int texunit, int coord, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetMultiTexGenivEXT(texunit, coord, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetMultiTexGenivEXT GetMultiTexGenivEXT} */
	public static int glGetMultiTexGeniEXT(int texunit, int coord, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetMultiTexGenivEXT(texunit, coord, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glMultiTexParameteriEXT ] ---

	public static void glMultiTexParameteriEXT(int texunit, int target, int pname, int param) {
		long __functionAddress = getInstance().MultiTexParameteriEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIV(__functionAddress, texunit, target, pname, param);
	}

	// --- [ glMultiTexParameterivEXT ] ---

	/** Unsafe version of {@link #glMultiTexParameterivEXT MultiTexParameterivEXT} */
	@JavadocExclude
	public static void nglMultiTexParameterivEXT(int texunit, int target, int pname, long param) {
		long __functionAddress = getInstance().MultiTexParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, target, pname, param);
	}

	public static void glMultiTexParameterivEXT(int texunit, int target, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 4 << 2);
		nglMultiTexParameterivEXT(texunit, target, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glMultiTexParameterivEXT MultiTexParameterivEXT} */
	public static void glMultiTexParameterivEXT(int texunit, int target, int pname, IntBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 4);
		nglMultiTexParameterivEXT(texunit, target, pname, memAddress(param));
	}

	// --- [ glMultiTexParameterfEXT ] ---

	public static void glMultiTexParameterfEXT(int texunit, int target, int pname, float param) {
		long __functionAddress = getInstance().MultiTexParameterfEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIFV(__functionAddress, texunit, target, pname, param);
	}

	// --- [ glMultiTexParameterfvEXT ] ---

	/** Unsafe version of {@link #glMultiTexParameterfvEXT MultiTexParameterfvEXT} */
	@JavadocExclude
	public static void nglMultiTexParameterfvEXT(int texunit, int target, int pname, long param) {
		long __functionAddress = getInstance().MultiTexParameterfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, target, pname, param);
	}

	public static void glMultiTexParameterfvEXT(int texunit, int target, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 4 << 2);
		nglMultiTexParameterfvEXT(texunit, target, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glMultiTexParameterfvEXT MultiTexParameterfvEXT} */
	public static void glMultiTexParameterfvEXT(int texunit, int target, int pname, FloatBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 4);
		nglMultiTexParameterfvEXT(texunit, target, pname, memAddress(param));
	}

	// --- [ glMultiTexImage1DEXT ] ---

	/** Unsafe version of {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
	@JavadocExclude
	public static void nglMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().MultiTexImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIPV(__functionAddress, texunit, target, level, internalformat, width, border, format, type, pixels);
	}

	public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/** Buffer object offset version of: {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
	public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
	public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
	public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
	public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/** DoubleBuffer version of: {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
	public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glMultiTexImage2DEXT ] ---

	/** Unsafe version of {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
	@JavadocExclude
	public static void nglMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().MultiTexImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIPV(__functionAddress, texunit, target, level, internalformat, width, height, border, format, type, pixels);
	}

	public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** Buffer object offset version of: {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
	public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
	public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
	public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
	public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** DoubleBuffer version of: {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
	public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glMultiTexSubImage1DEXT ] ---

	/** Unsafe version of {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
	@JavadocExclude
	public static void nglMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, long pixels) {
		long __functionAddress = getInstance().MultiTexSubImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIPV(__functionAddress, texunit, target, level, xoffset, width, format, type, pixels);
	}

	public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
	public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
	public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
	public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
	public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
	public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
	}

	// --- [ glMultiTexSubImage2DEXT ] ---

	/** Unsafe version of {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
	@JavadocExclude
	public static void nglMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
		long __functionAddress = getInstance().MultiTexSubImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIPV(__functionAddress, texunit, target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
	public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
	public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
	public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
	public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
	public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	// --- [ glCopyMultiTexImage1DEXT ] ---

	public static void glCopyMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int border) {
		long __functionAddress = getInstance().CopyMultiTexImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIV(__functionAddress, texunit, target, level, internalformat, x, y, width, border);
	}

	// --- [ glCopyMultiTexImage2DEXT ] ---

	public static void glCopyMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int height, int border) {
		long __functionAddress = getInstance().CopyMultiTexImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIV(__functionAddress, texunit, target, level, internalformat, x, y, width, height, border);
	}

	// --- [ glCopyMultiTexSubImage1DEXT ] ---

	public static void glCopyMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int x, int y, int width) {
		long __functionAddress = getInstance().CopyMultiTexSubImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIV(__functionAddress, texunit, target, level, xoffset, x, y, width);
	}

	// --- [ glCopyMultiTexSubImage2DEXT ] ---

	public static void glCopyMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().CopyMultiTexSubImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIV(__functionAddress, texunit, target, level, xoffset, yoffset, x, y, width, height);
	}

	// --- [ glGetMultiTexImageEXT ] ---

	/** Unsafe version of {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
	@JavadocExclude
	public static void nglGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, long pixels) {
		long __functionAddress = getInstance().GetMultiTexImageEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIPV(__functionAddress, texunit, target, level, format, type, pixels);
	}

	public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
	public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetMultiTexImageEXT(texunit, target, level, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
	public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
	public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
	public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
	public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
	}

	// --- [ glGetMultiTexParameterfvEXT ] ---

	/** Unsafe version of {@link #glGetMultiTexParameterfvEXT GetMultiTexParameterfvEXT} */
	@JavadocExclude
	public static void nglGetMultiTexParameterfvEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexParameterfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, target, pname, params);
	}

	public static void glGetMultiTexParameterfvEXT(int texunit, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetMultiTexParameterfvEXT(texunit, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetMultiTexParameterfvEXT GetMultiTexParameterfvEXT} */
	public static void glGetMultiTexParameterfvEXT(int texunit, int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetMultiTexParameterfvEXT(texunit, target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetMultiTexParameterfvEXT GetMultiTexParameterfvEXT} */
	public static float glGetMultiTexParameterfEXT(int texunit, int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetMultiTexParameterfvEXT(texunit, target, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetMultiTexParameterivEXT ] ---

	/** Unsafe version of {@link #glGetMultiTexParameterivEXT GetMultiTexParameterivEXT} */
	@JavadocExclude
	public static void nglGetMultiTexParameterivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, target, pname, params);
	}

	public static void glGetMultiTexParameterivEXT(int texunit, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetMultiTexParameterivEXT(texunit, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetMultiTexParameterivEXT GetMultiTexParameterivEXT} */
	public static void glGetMultiTexParameterivEXT(int texunit, int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetMultiTexParameterivEXT(texunit, target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetMultiTexParameterivEXT GetMultiTexParameterivEXT} */
	public static int glGetMultiTexParameteriEXT(int texunit, int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetMultiTexParameterivEXT(texunit, target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetMultiTexLevelParameterfvEXT ] ---

	/** Unsafe version of {@link #glGetMultiTexLevelParameterfvEXT GetMultiTexLevelParameterfvEXT} */
	@JavadocExclude
	public static void nglGetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexLevelParameterfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIPV(__functionAddress, texunit, target, level, pname, params);
	}

	public static void glGetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetMultiTexLevelParameterfvEXT GetMultiTexLevelParameterfvEXT} */
	public static void glGetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetMultiTexLevelParameterfvEXT GetMultiTexLevelParameterfvEXT} */
	public static float glGetMultiTexLevelParameterfEXT(int texunit, int target, int level, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetMultiTexLevelParameterivEXT ] ---

	/** Unsafe version of {@link #glGetMultiTexLevelParameterivEXT GetMultiTexLevelParameterivEXT} */
	@JavadocExclude
	public static void nglGetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexLevelParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIPV(__functionAddress, texunit, target, level, pname, params);
	}

	public static void glGetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetMultiTexLevelParameterivEXT GetMultiTexLevelParameterivEXT} */
	public static void glGetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetMultiTexLevelParameterivEXT GetMultiTexLevelParameterivEXT} */
	public static int glGetMultiTexLevelParameteriEXT(int texunit, int target, int level, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glMultiTexImage3DEXT ] ---

	/** Unsafe version of {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
	@JavadocExclude
	public static void nglMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().MultiTexImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIIPV(__functionAddress, texunit, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** Buffer object offset version of: {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
	public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
	public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
	public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
	public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** DoubleBuffer version of: {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
	public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glMultiTexSubImage3DEXT ] ---

	/** Unsafe version of {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
	@JavadocExclude
	public static void nglMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		long __functionAddress = getInstance().MultiTexSubImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIIIPV(__functionAddress, texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
	public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
	public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
	public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
	public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
	public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	// --- [ glCopyMultiTexSubImage3DEXT ] ---

	public static void glCopyMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().CopyMultiTexSubImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIIV(__functionAddress, texunit, target, level, xoffset, yoffset, zoffset, x, y, width, height);
	}

	// --- [ glEnableClientStateIndexedEXT ] ---

	public static void glEnableClientStateIndexedEXT(int array, int index) {
		long __functionAddress = getInstance().EnableClientStateIndexedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, array, index);
	}

	// --- [ glDisableClientStateIndexedEXT ] ---

	public static void glDisableClientStateIndexedEXT(int array, int index) {
		long __functionAddress = getInstance().DisableClientStateIndexedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, array, index);
	}

	// --- [ glEnableClientStateiEXT ] ---

	public static void glEnableClientStateiEXT(int array, int index) {
		long __functionAddress = getInstance().EnableClientStateiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, array, index);
	}

	// --- [ glDisableClientStateiEXT ] ---

	public static void glDisableClientStateiEXT(int array, int index) {
		long __functionAddress = getInstance().DisableClientStateiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, array, index);
	}

	// --- [ glGetFloatIndexedvEXT ] ---

	/** Unsafe version of {@link #glGetFloatIndexedvEXT GetFloatIndexedvEXT} */
	@JavadocExclude
	public static void nglGetFloatIndexedvEXT(int target, int index, long params) {
		long __functionAddress = getInstance().GetFloatIndexedvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, target, index, params);
	}

	public static void glGetFloatIndexedvEXT(int target, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetFloatIndexedvEXT(target, index, memAddress(params));
	}

	/** Alternative version of: {@link #glGetFloatIndexedvEXT GetFloatIndexedvEXT} */
	public static void glGetFloatIndexedvEXT(int target, int index, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetFloatIndexedvEXT(target, index, memAddress(params));
	}

	/** Single return value version of: {@link #glGetFloatIndexedvEXT GetFloatIndexedvEXT} */
	public static float glGetFloatIndexedEXT(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetFloatIndexedvEXT(target, index, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetDoubleIndexedvEXT ] ---

	/** Unsafe version of {@link #glGetDoubleIndexedvEXT GetDoubleIndexedvEXT} */
	@JavadocExclude
	public static void nglGetDoubleIndexedvEXT(int target, int index, long params) {
		long __functionAddress = getInstance().GetDoubleIndexedvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, target, index, params);
	}

	public static void glGetDoubleIndexedvEXT(int target, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetDoubleIndexedvEXT(target, index, memAddress(params));
	}

	/** Alternative version of: {@link #glGetDoubleIndexedvEXT GetDoubleIndexedvEXT} */
	public static void glGetDoubleIndexedvEXT(int target, int index, DoubleBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetDoubleIndexedvEXT(target, index, memAddress(params));
	}

	/** Single return value version of: {@link #glGetDoubleIndexedvEXT GetDoubleIndexedvEXT} */
	public static double glGetDoubleIndexedEXT(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.doubleParam();
		nglGetDoubleIndexedvEXT(target, index, __buffer.address(params));
		return __buffer.doubleValue(params);
	}

	// --- [ glGetPointerIndexedvEXT ] ---

	/** Unsafe version of {@link #glGetPointerIndexedvEXT GetPointerIndexedvEXT} */
	@JavadocExclude
	public static void nglGetPointerIndexedvEXT(int target, int index, long params) {
		long __functionAddress = getInstance().GetPointerIndexedvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, target, index, params);
	}

	public static void glGetPointerIndexedvEXT(int target, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << POINTER_SHIFT);
		nglGetPointerIndexedvEXT(target, index, memAddress(params));
	}

	/** Alternative version of: {@link #glGetPointerIndexedvEXT GetPointerIndexedvEXT} */
	public static void glGetPointerIndexedvEXT(int target, int index, PointerBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetPointerIndexedvEXT(target, index, memAddress(params));
	}

	/** Single return value version of: {@link #glGetPointerIndexedvEXT GetPointerIndexedvEXT} */
	public static long glGetPointerIndexedEXT(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.pointerParam();
		nglGetPointerIndexedvEXT(target, index, __buffer.address(params));
		return __buffer.pointerValue(params);
	}

	// --- [ glGetFloati_vEXT ] ---

	/** Unsafe version of {@link #glGetFloati_vEXT GetFloati_vEXT} */
	@JavadocExclude
	public static void nglGetFloati_vEXT(int pname, int index, long params) {
		long __functionAddress = getInstance().GetFloati_vEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, pname, index, params);
	}

	public static void glGetFloati_vEXT(int pname, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetFloati_vEXT(pname, index, memAddress(params));
	}

	/** Alternative version of: {@link #glGetFloati_vEXT GetFloati_vEXT} */
	public static void glGetFloati_vEXT(int pname, int index, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetFloati_vEXT(pname, index, memAddress(params));
	}

	/** Single return value version of: {@link #glGetFloati_vEXT GetFloati_vEXT} */
	public static float glGetFloatiEXT(int pname, int index) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetFloati_vEXT(pname, index, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetDoublei_vEXT ] ---

	/** Unsafe version of {@link #glGetDoublei_vEXT GetDoublei_vEXT} */
	@JavadocExclude
	public static void nglGetDoublei_vEXT(int pname, int index, long params) {
		long __functionAddress = getInstance().GetDoublei_vEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, pname, index, params);
	}

	public static void glGetDoublei_vEXT(int pname, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetDoublei_vEXT(pname, index, memAddress(params));
	}

	/** Alternative version of: {@link #glGetDoublei_vEXT GetDoublei_vEXT} */
	public static void glGetDoublei_vEXT(int pname, int index, DoubleBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetDoublei_vEXT(pname, index, memAddress(params));
	}

	/** Single return value version of: {@link #glGetDoublei_vEXT GetDoublei_vEXT} */
	public static double glGetDoubleiEXT(int pname, int index) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.doubleParam();
		nglGetDoublei_vEXT(pname, index, __buffer.address(params));
		return __buffer.doubleValue(params);
	}

	// --- [ glGetPointeri_vEXT ] ---

	/** Unsafe version of {@link #glGetPointeri_vEXT GetPointeri_vEXT} */
	@JavadocExclude
	public static void nglGetPointeri_vEXT(int pname, int index, long params) {
		long __functionAddress = getInstance().GetPointeri_vEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, pname, index, params);
	}

	public static void glGetPointeri_vEXT(int pname, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << POINTER_SHIFT);
		nglGetPointeri_vEXT(pname, index, memAddress(params));
	}

	/** Alternative version of: {@link #glGetPointeri_vEXT GetPointeri_vEXT} */
	public static void glGetPointeri_vEXT(int pname, int index, PointerBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetPointeri_vEXT(pname, index, memAddress(params));
	}

	/** Single return value version of: {@link #glGetPointeri_vEXT GetPointeri_vEXT} */
	public static long glGetPointeriEXT(int pname, int index) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.pointerParam();
		nglGetPointeri_vEXT(pname, index, __buffer.address(params));
		return __buffer.pointerValue(params);
	}

	// --- [ glEnableIndexedEXT ] ---

	public static void glEnableIndexedEXT(int cap, int index) {
		long __functionAddress = getInstance().EnableIndexedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, cap, index);
	}

	// --- [ glDisableIndexedEXT ] ---

	public static void glDisableIndexedEXT(int cap, int index) {
		long __functionAddress = getInstance().DisableIndexedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, cap, index);
	}

	// --- [ glIsEnabledIndexedEXT ] ---

	public static boolean glIsEnabledIndexedEXT(int target, int index) {
		long __functionAddress = getInstance().IsEnabledIndexedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return callIIZ(__functionAddress, target, index);
	}

	// --- [ glGetIntegerIndexedvEXT ] ---

	/** Unsafe version of {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
	@JavadocExclude
	public static void nglGetIntegerIndexedvEXT(int target, int index, long params) {
		long __functionAddress = getInstance().GetIntegerIndexedvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, target, index, params);
	}

	public static void glGetIntegerIndexedvEXT(int target, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetIntegerIndexedvEXT(target, index, memAddress(params));
	}

	/** Alternative version of: {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
	public static void glGetIntegerIndexedvEXT(int target, int index, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetIntegerIndexedvEXT(target, index, memAddress(params));
	}

	/** Single return value version of: {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
	public static int glGetIntegerIndexedEXT(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetIntegerIndexedvEXT(target, index, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetBooleanIndexedvEXT ] ---

	/** Unsafe version of {@link #glGetBooleanIndexedvEXT GetBooleanIndexedvEXT} */
	@JavadocExclude
	public static void nglGetBooleanIndexedvEXT(int target, int index, long params) {
		long __functionAddress = getInstance().GetBooleanIndexedvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, target, index, params);
	}

	public static void glGetBooleanIndexedvEXT(int target, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetBooleanIndexedvEXT(target, index, memAddress(params));
	}

	/** Single return value version of: {@link #glGetBooleanIndexedvEXT GetBooleanIndexedvEXT} */
	public static boolean glGetBooleanIndexedEXT(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.booleanParam();
		nglGetBooleanIndexedvEXT(target, index, __buffer.address(params));
		return __buffer.booleanValue(params);
	}

	// --- [ glNamedProgramStringEXT ] ---

	/** Unsafe version of {@link #glNamedProgramStringEXT NamedProgramStringEXT} */
	@JavadocExclude
	public static void nglNamedProgramStringEXT(int program, int target, int format, int len, long string) {
		long __functionAddress = getInstance().NamedProgramStringEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIPV(__functionAddress, program, target, format, len, string);
	}

	public static void glNamedProgramStringEXT(int program, int target, int format, int len, ByteBuffer string) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(string, len);
		nglNamedProgramStringEXT(program, target, format, len, memAddress(string));
	}

	/** Alternative version of: {@link #glNamedProgramStringEXT NamedProgramStringEXT} */
	public static void glNamedProgramStringEXT(int program, int target, int format, ByteBuffer string) {
		nglNamedProgramStringEXT(program, target, format, string.remaining(), memAddress(string));
	}

	// --- [ glNamedProgramLocalParameter4dEXT ] ---

	public static void glNamedProgramLocalParameter4dEXT(int program, int target, int index, double x, double y, double z, double w) {
		long __functionAddress = getInstance().NamedProgramLocalParameter4dEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIDDDDV(__functionAddress, program, target, index, x, y, z, w);
	}

	// --- [ glNamedProgramLocalParameter4dvEXT ] ---

	/** Unsafe version of {@link #glNamedProgramLocalParameter4dvEXT NamedProgramLocalParameter4dvEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParameter4dvEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParameter4dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, target, index, params);
	}

	public static void glNamedProgramLocalParameter4dvEXT(int program, int target, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 3);
		nglNamedProgramLocalParameter4dvEXT(program, target, index, memAddress(params));
	}

	/** Alternative version of: {@link #glNamedProgramLocalParameter4dvEXT NamedProgramLocalParameter4dvEXT} */
	public static void glNamedProgramLocalParameter4dvEXT(int program, int target, int index, DoubleBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglNamedProgramLocalParameter4dvEXT(program, target, index, memAddress(params));
	}

	// --- [ glNamedProgramLocalParameter4fEXT ] ---

	public static void glNamedProgramLocalParameter4fEXT(int program, int target, int index, float x, float y, float z, float w) {
		long __functionAddress = getInstance().NamedProgramLocalParameter4fEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIFFFFV(__functionAddress, program, target, index, x, y, z, w);
	}

	// --- [ glNamedProgramLocalParameter4fvEXT ] ---

	/** Unsafe version of {@link #glNamedProgramLocalParameter4fvEXT NamedProgramLocalParameter4fvEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParameter4fvEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParameter4fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, target, index, params);
	}

	public static void glNamedProgramLocalParameter4fvEXT(int program, int target, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglNamedProgramLocalParameter4fvEXT(program, target, index, memAddress(params));
	}

	/** Alternative version of: {@link #glNamedProgramLocalParameter4fvEXT NamedProgramLocalParameter4fvEXT} */
	public static void glNamedProgramLocalParameter4fvEXT(int program, int target, int index, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglNamedProgramLocalParameter4fvEXT(program, target, index, memAddress(params));
	}

	// --- [ glGetNamedProgramLocalParameterdvEXT ] ---

	/** Unsafe version of {@link #glGetNamedProgramLocalParameterdvEXT GetNamedProgramLocalParameterdvEXT} */
	@JavadocExclude
	public static void nglGetNamedProgramLocalParameterdvEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().GetNamedProgramLocalParameterdvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, target, index, params);
	}

	public static void glGetNamedProgramLocalParameterdvEXT(int program, int target, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 3);
		nglGetNamedProgramLocalParameterdvEXT(program, target, index, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedProgramLocalParameterdvEXT GetNamedProgramLocalParameterdvEXT} */
	public static void glGetNamedProgramLocalParameterdvEXT(int program, int target, int index, DoubleBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetNamedProgramLocalParameterdvEXT(program, target, index, memAddress(params));
	}

	// --- [ glGetNamedProgramLocalParameterfvEXT ] ---

	/** Unsafe version of {@link #glGetNamedProgramLocalParameterfvEXT GetNamedProgramLocalParameterfvEXT} */
	@JavadocExclude
	public static void nglGetNamedProgramLocalParameterfvEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().GetNamedProgramLocalParameterfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, target, index, params);
	}

	public static void glGetNamedProgramLocalParameterfvEXT(int program, int target, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetNamedProgramLocalParameterfvEXT(program, target, index, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedProgramLocalParameterfvEXT GetNamedProgramLocalParameterfvEXT} */
	public static void glGetNamedProgramLocalParameterfvEXT(int program, int target, int index, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetNamedProgramLocalParameterfvEXT(program, target, index, memAddress(params));
	}

	// --- [ glGetNamedProgramivEXT ] ---

	/** Unsafe version of {@link #glGetNamedProgramivEXT GetNamedProgramivEXT} */
	@JavadocExclude
	public static void nglGetNamedProgramivEXT(int program, int target, int pname, long params) {
		long __functionAddress = getInstance().GetNamedProgramivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, target, pname, params);
	}

	public static void glGetNamedProgramivEXT(int program, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetNamedProgramivEXT(program, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedProgramivEXT GetNamedProgramivEXT} */
	public static void glGetNamedProgramivEXT(int program, int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetNamedProgramivEXT(program, target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetNamedProgramivEXT GetNamedProgramivEXT} */
	public static int glGetNamedProgramiEXT(int program, int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetNamedProgramivEXT(program, target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetNamedProgramStringEXT ] ---

	/** Unsafe version of {@link #glGetNamedProgramStringEXT GetNamedProgramStringEXT} */
	@JavadocExclude
	public static void nglGetNamedProgramStringEXT(int program, int target, int pname, long string) {
		long __functionAddress = getInstance().GetNamedProgramStringEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, target, pname, string);
	}

	public static void glGetNamedProgramStringEXT(int program, int target, int pname, ByteBuffer string) {
		if ( LWJGLUtil.CHECKS )
			if ( LWJGLUtil.DEBUG )
				checkBuffer(string, glGetNamedProgramiEXT(program, target, ARBVertexProgram.GL_PROGRAM_LENGTH_ARB));
		nglGetNamedProgramStringEXT(program, target, pname, memAddress(string));
	}

	// --- [ glCompressedTextureImage3DEXT ] ---

	/** Unsafe version of {@link #glCompressedTextureImage3DEXT CompressedTextureImage3DEXT} */
	@JavadocExclude
	public static void nglCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIPV(__functionAddress, texture, target, level, internalformat, width, height, depth, border, imageSize, data);
	}

	public static void glCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			if ( data != null ) checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, imageSize, memAddressSafe(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTextureImage3DEXT CompressedTextureImage3DEXT} */
	public static void glCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTextureImage3DEXT CompressedTextureImage3DEXT} */
	public static void glCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, data == null ? 0 : data.remaining(), memAddressSafe(data));
	}

	// --- [ glCompressedTextureImage2DEXT ] ---

	/** Unsafe version of {@link #glCompressedTextureImage2DEXT CompressedTextureImage2DEXT} */
	@JavadocExclude
	public static void nglCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIPV(__functionAddress, texture, target, level, internalformat, width, height, border, imageSize, data);
	}

	public static void glCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			if ( data != null ) checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, imageSize, memAddressSafe(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTextureImage2DEXT CompressedTextureImage2DEXT} */
	public static void glCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTextureImage2DEXT CompressedTextureImage2DEXT} */
	public static void glCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, data == null ? 0 : data.remaining(), memAddressSafe(data));
	}

	// --- [ glCompressedTextureImage1DEXT ] ---

	/** Unsafe version of {@link #glCompressedTextureImage1DEXT CompressedTextureImage1DEXT} */
	@JavadocExclude
	public static void nglCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIPV(__functionAddress, texture, target, level, internalformat, width, border, imageSize, data);
	}

	public static void glCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			if ( data != null ) checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, imageSize, memAddressSafe(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTextureImage1DEXT CompressedTextureImage1DEXT} */
	public static void glCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTextureImage1DEXT CompressedTextureImage1DEXT} */
	public static void glCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, data == null ? 0 : data.remaining(), memAddressSafe(data));
	}

	// --- [ glCompressedTextureSubImage3DEXT ] ---

	/** Unsafe version of {@link #glCompressedTextureSubImage3DEXT CompressedTextureSubImage3DEXT} */
	@JavadocExclude
	public static void nglCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureSubImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIIIPV(__functionAddress, texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	public static void glCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTextureSubImage3DEXT CompressedTextureSubImage3DEXT} */
	public static void glCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTextureSubImage3DEXT CompressedTextureSubImage3DEXT} */
	public static void glCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedTextureSubImage2DEXT ] ---

	/** Unsafe version of {@link #glCompressedTextureSubImage2DEXT CompressedTextureSubImage2DEXT} */
	@JavadocExclude
	public static void nglCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureSubImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIPV(__functionAddress, texture, target, level, xoffset, yoffset, width, height, format, imageSize, data);
	}

	public static void glCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTextureSubImage2DEXT CompressedTextureSubImage2DEXT} */
	public static void glCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTextureSubImage2DEXT CompressedTextureSubImage2DEXT} */
	public static void glCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedTextureSubImage1DEXT ] ---

	/** Unsafe version of {@link #glCompressedTextureSubImage1DEXT CompressedTextureSubImage1DEXT} */
	@JavadocExclude
	public static void nglCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureSubImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIPV(__functionAddress, texture, target, level, xoffset, width, format, imageSize, data);
	}

	public static void glCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTextureSubImage1DEXT CompressedTextureSubImage1DEXT} */
	public static void glCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTextureSubImage1DEXT CompressedTextureSubImage1DEXT} */
	public static void glCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, data.remaining(), memAddress(data));
	}

	// --- [ glGetCompressedTextureImageEXT ] ---

	/** Unsafe version of {@link #glGetCompressedTextureImageEXT GetCompressedTextureImageEXT} */
	@JavadocExclude
	public static void nglGetCompressedTextureImageEXT(int texture, int target, int level, long img) {
		long __functionAddress = getInstance().GetCompressedTextureImageEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texture, target, level, img);
	}

	public static void glGetCompressedTextureImageEXT(int texture, int target, int level, ByteBuffer img) {
		if ( LWJGLUtil.CHECKS ) {
			if ( LWJGLUtil.DEBUG )
				checkBuffer(img, glGetTextureLevelParameteriEXT(texture, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetCompressedTextureImageEXT(texture, target, level, memAddress(img));
	}

	/** Buffer object offset version of: {@link #glGetCompressedTextureImageEXT GetCompressedTextureImageEXT} */
	public static void glGetCompressedTextureImageEXT(int texture, int target, int level, long imgOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetCompressedTextureImageEXT(texture, target, level, imgOffset);
	}

	// --- [ glCompressedMultiTexImage3DEXT ] ---

	/** Unsafe version of {@link #glCompressedMultiTexImage3DEXT CompressedMultiTexImage3DEXT} */
	@JavadocExclude
	public static void nglCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedMultiTexImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIPV(__functionAddress, texunit, target, level, internalformat, width, height, depth, border, imageSize, data);
	}

	public static void glCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			if ( data != null ) checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, imageSize, memAddressSafe(data));
	}

	/** Buffer object offset version of: {@link #glCompressedMultiTexImage3DEXT CompressedMultiTexImage3DEXT} */
	public static void glCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedMultiTexImage3DEXT CompressedMultiTexImage3DEXT} */
	public static void glCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, data == null ? 0 : data.remaining(), memAddressSafe(data));
	}

	// --- [ glCompressedMultiTexImage2DEXT ] ---

	/** Unsafe version of {@link #glCompressedMultiTexImage2DEXT CompressedMultiTexImage2DEXT} */
	@JavadocExclude
	public static void nglCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedMultiTexImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIPV(__functionAddress, texunit, target, level, internalformat, width, height, border, imageSize, data);
	}

	public static void glCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			if ( data != null ) checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, imageSize, memAddressSafe(data));
	}

	/** Buffer object offset version of: {@link #glCompressedMultiTexImage2DEXT CompressedMultiTexImage2DEXT} */
	public static void glCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedMultiTexImage2DEXT CompressedMultiTexImage2DEXT} */
	public static void glCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, data == null ? 0 : data.remaining(), memAddressSafe(data));
	}

	// --- [ glCompressedMultiTexImage1DEXT ] ---

	/** Unsafe version of {@link #glCompressedMultiTexImage1DEXT CompressedMultiTexImage1DEXT} */
	@JavadocExclude
	public static void nglCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedMultiTexImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIPV(__functionAddress, texunit, target, level, internalformat, width, border, imageSize, data);
	}

	public static void glCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			if ( data != null ) checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, imageSize, memAddressSafe(data));
	}

	/** Buffer object offset version of: {@link #glCompressedMultiTexImage1DEXT CompressedMultiTexImage1DEXT} */
	public static void glCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedMultiTexImage1DEXT CompressedMultiTexImage1DEXT} */
	public static void glCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, data == null ? 0 : data.remaining(), memAddressSafe(data));
	}

	// --- [ glCompressedMultiTexSubImage3DEXT ] ---

	/** Unsafe version of {@link #glCompressedMultiTexSubImage3DEXT CompressedMultiTexSubImage3DEXT} */
	@JavadocExclude
	public static void nglCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedMultiTexSubImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIIIPV(__functionAddress, texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	public static void glCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedMultiTexSubImage3DEXT CompressedMultiTexSubImage3DEXT} */
	public static void glCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedMultiTexSubImage3DEXT CompressedMultiTexSubImage3DEXT} */
	public static void glCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedMultiTexSubImage2DEXT ] ---

	/** Unsafe version of {@link #glCompressedMultiTexSubImage2DEXT CompressedMultiTexSubImage2DEXT} */
	@JavadocExclude
	public static void nglCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedMultiTexSubImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIIIPV(__functionAddress, texunit, target, level, xoffset, yoffset, width, height, format, imageSize, data);
	}

	public static void glCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedMultiTexSubImage2DEXT CompressedMultiTexSubImage2DEXT} */
	public static void glCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedMultiTexSubImage2DEXT CompressedMultiTexSubImage2DEXT} */
	public static void glCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedMultiTexSubImage1DEXT ] ---

	/** Unsafe version of {@link #glCompressedMultiTexSubImage1DEXT CompressedMultiTexSubImage1DEXT} */
	@JavadocExclude
	public static void nglCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedMultiTexSubImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIPV(__functionAddress, texunit, target, level, xoffset, width, format, imageSize, data);
	}

	public static void glCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedMultiTexSubImage1DEXT CompressedMultiTexSubImage1DEXT} */
	public static void glCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedMultiTexSubImage1DEXT CompressedMultiTexSubImage1DEXT} */
	public static void glCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, data.remaining(), memAddress(data));
	}

	// --- [ glGetCompressedMultiTexImageEXT ] ---

	/** Unsafe version of {@link #glGetCompressedMultiTexImageEXT GetCompressedMultiTexImageEXT} */
	@JavadocExclude
	public static void nglGetCompressedMultiTexImageEXT(int texunit, int target, int level, long img) {
		long __functionAddress = getInstance().GetCompressedMultiTexImageEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, target, level, img);
	}

	public static void glGetCompressedMultiTexImageEXT(int texunit, int target, int level, ByteBuffer img) {
		if ( LWJGLUtil.CHECKS ) {
			if ( LWJGLUtil.DEBUG )
				checkBuffer(img, glGetMultiTexLevelParameteriEXT(texunit, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetCompressedMultiTexImageEXT(texunit, target, level, memAddress(img));
	}

	/** Buffer object offset version of: {@link #glGetCompressedMultiTexImageEXT GetCompressedMultiTexImageEXT} */
	public static void glGetCompressedMultiTexImageEXT(int texunit, int target, int level, long imgOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetCompressedMultiTexImageEXT(texunit, target, level, imgOffset);
	}

	// --- [ glMatrixLoadTransposefEXT ] ---

	/** Unsafe version of {@link #glMatrixLoadTransposefEXT MatrixLoadTransposefEXT} */
	@JavadocExclude
	public static void nglMatrixLoadTransposefEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixLoadTransposefEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPV(__functionAddress, matrixMode, m);
	}

	public static void glMatrixLoadTransposefEXT(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 2);
		nglMatrixLoadTransposefEXT(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixLoadTransposefEXT MatrixLoadTransposefEXT} */
	public static void glMatrixLoadTransposefEXT(int matrixMode, FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglMatrixLoadTransposefEXT(matrixMode, memAddress(m));
	}

	// --- [ glMatrixLoadTransposedEXT ] ---

	/** Unsafe version of {@link #glMatrixLoadTransposedEXT MatrixLoadTransposedEXT} */
	@JavadocExclude
	public static void nglMatrixLoadTransposedEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixLoadTransposedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPV(__functionAddress, matrixMode, m);
	}

	public static void glMatrixLoadTransposedEXT(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 3);
		nglMatrixLoadTransposedEXT(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixLoadTransposedEXT MatrixLoadTransposedEXT} */
	public static void glMatrixLoadTransposedEXT(int matrixMode, DoubleBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglMatrixLoadTransposedEXT(matrixMode, memAddress(m));
	}

	// --- [ glMatrixMultTransposefEXT ] ---

	/** Unsafe version of {@link #glMatrixMultTransposefEXT MatrixMultTransposefEXT} */
	@JavadocExclude
	public static void nglMatrixMultTransposefEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixMultTransposefEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPV(__functionAddress, matrixMode, m);
	}

	public static void glMatrixMultTransposefEXT(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 2);
		nglMatrixMultTransposefEXT(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixMultTransposefEXT MatrixMultTransposefEXT} */
	public static void glMatrixMultTransposefEXT(int matrixMode, FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglMatrixMultTransposefEXT(matrixMode, memAddress(m));
	}

	// --- [ glMatrixMultTransposedEXT ] ---

	/** Unsafe version of {@link #glMatrixMultTransposedEXT MatrixMultTransposedEXT} */
	@JavadocExclude
	public static void nglMatrixMultTransposedEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixMultTransposedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPV(__functionAddress, matrixMode, m);
	}

	public static void glMatrixMultTransposedEXT(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 3);
		nglMatrixMultTransposedEXT(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixMultTransposedEXT MatrixMultTransposedEXT} */
	public static void glMatrixMultTransposedEXT(int matrixMode, DoubleBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglMatrixMultTransposedEXT(matrixMode, memAddress(m));
	}

	// --- [ glNamedBufferDataEXT ] ---

	/** Unsafe version of {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
	@JavadocExclude
	public static void nglNamedBufferDataEXT(int buffer, long size, long data, int usage) {
		long __functionAddress = getInstance().NamedBufferDataEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPPIV(__functionAddress, buffer, size, data, usage);
	}

	public static void glNamedBufferDataEXT(int buffer, long size, ByteBuffer data, int usage) {
		if ( LWJGLUtil.CHECKS )
			if ( data != null ) checkBuffer(data, size);
		nglNamedBufferDataEXT(buffer, size, memAddressSafe(data), usage);
	}

	/** Alternative version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
	public static void glNamedBufferDataEXT(int buffer, long size, int usage) {
		nglNamedBufferDataEXT(buffer, size, 0L, usage);
	}

	/** ByteBuffer version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
	public static void glNamedBufferDataEXT(int buffer, ByteBuffer data, int usage) {
		nglNamedBufferDataEXT(buffer, data.remaining(), memAddress(data), usage);
	}

	/** ShortBuffer version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
	public static void glNamedBufferDataEXT(int buffer, ShortBuffer data, int usage) {
		nglNamedBufferDataEXT(buffer, data.remaining() << 1, memAddress(data), usage);
	}

	/** IntBuffer version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
	public static void glNamedBufferDataEXT(int buffer, IntBuffer data, int usage) {
		nglNamedBufferDataEXT(buffer, data.remaining() << 2, memAddress(data), usage);
	}

	/** FloatBuffer version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
	public static void glNamedBufferDataEXT(int buffer, FloatBuffer data, int usage) {
		nglNamedBufferDataEXT(buffer, data.remaining() << 2, memAddress(data), usage);
	}

	/** DoubleBuffer version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
	public static void glNamedBufferDataEXT(int buffer, DoubleBuffer data, int usage) {
		nglNamedBufferDataEXT(buffer, data.remaining() << 3, memAddress(data), usage);
	}

	// --- [ glNamedBufferSubDataEXT ] ---

	/** Unsafe version of {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
	@JavadocExclude
	public static void nglNamedBufferSubDataEXT(int buffer, long offset, long size, long data) {
		long __functionAddress = getInstance().NamedBufferSubDataEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPPPV(__functionAddress, buffer, offset, size, data);
	}

	public static void glNamedBufferSubDataEXT(int buffer, long offset, long size, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, size);
		nglNamedBufferSubDataEXT(buffer, offset, size, memAddress(data));
	}

	/** Alternative version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
	public static void glNamedBufferSubDataEXT(int buffer, long offset, ByteBuffer data) {
		nglNamedBufferSubDataEXT(buffer, offset, data.remaining(), memAddress(data));
	}

	/** ShortBuffer version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
	public static void glNamedBufferSubDataEXT(int buffer, long offset, ShortBuffer data) {
		nglNamedBufferSubDataEXT(buffer, offset, data.remaining() << 1, memAddress(data));
	}

	/** IntBuffer version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
	public static void glNamedBufferSubDataEXT(int buffer, long offset, IntBuffer data) {
		nglNamedBufferSubDataEXT(buffer, offset, data.remaining() << 2, memAddress(data));
	}

	/** FloatBuffer version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
	public static void glNamedBufferSubDataEXT(int buffer, long offset, FloatBuffer data) {
		nglNamedBufferSubDataEXT(buffer, offset, data.remaining() << 2, memAddress(data));
	}

	/** DoubleBuffer version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
	public static void glNamedBufferSubDataEXT(int buffer, long offset, DoubleBuffer data) {
		nglNamedBufferSubDataEXT(buffer, offset, data.remaining() << 3, memAddress(data));
	}

	// --- [ glMapNamedBufferEXT ] ---

	/** Unsafe version of {@link #glMapNamedBufferEXT MapNamedBufferEXT} */
	@JavadocExclude
	public static long nglMapNamedBufferEXT(int buffer, int access) {
		long __functionAddress = getInstance().MapNamedBufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return callIIP(__functionAddress, buffer, access);
	}

	public static ByteBuffer glMapNamedBufferEXT(int buffer, int access) {
		long __result = nglMapNamedBufferEXT(buffer, access);
		return memByteBuffer(__result, glGetNamedBufferParameteriEXT(buffer, GL15.GL_BUFFER_SIZE));
	}

	/** Alternative version of: {@link #glMapNamedBufferEXT MapNamedBufferEXT} */
	public static ByteBuffer glMapNamedBufferEXT(int buffer, int access, ByteBuffer old_buffer) {
		long __result = nglMapNamedBufferEXT(buffer, access);
		int length = glGetNamedBufferParameteriEXT(buffer, GL15.GL_BUFFER_SIZE);
		return old_buffer == null ? memByteBuffer(__result, length) : memSetupBuffer(old_buffer, __result, length);
	}

	/** Explicit size alternative version of: {@link #glMapNamedBufferEXT MapNamedBufferEXT} */
	public static ByteBuffer glMapNamedBufferEXT(int buffer, int access, long length, ByteBuffer old_buffer) {
		long __result = nglMapNamedBufferEXT(buffer, access);
		return old_buffer == null ? memByteBuffer(__result, (int)length) : memSetupBuffer(old_buffer, __result, (int)length);
	}

	// --- [ glUnmapNamedBufferEXT ] ---

	public static boolean glUnmapNamedBufferEXT(int buffer) {
		long __functionAddress = getInstance().UnmapNamedBufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return callIZ(__functionAddress, buffer);
	}

	// --- [ glGetNamedBufferParameterivEXT ] ---

	/** Unsafe version of {@link #glGetNamedBufferParameterivEXT GetNamedBufferParameterivEXT} */
	@JavadocExclude
	public static void nglGetNamedBufferParameterivEXT(int buffer, int pname, long params) {
		long __functionAddress = getInstance().GetNamedBufferParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, buffer, pname, params);
	}

	public static void glGetNamedBufferParameterivEXT(int buffer, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetNamedBufferParameterivEXT(buffer, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedBufferParameterivEXT GetNamedBufferParameterivEXT} */
	public static void glGetNamedBufferParameterivEXT(int buffer, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetNamedBufferParameterivEXT(buffer, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetNamedBufferParameterivEXT GetNamedBufferParameterivEXT} */
	public static int glGetNamedBufferParameteriEXT(int buffer, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetNamedBufferParameterivEXT(buffer, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetNamedBufferSubDataEXT ] ---

	/** Unsafe version of {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
	@JavadocExclude
	public static void nglGetNamedBufferSubDataEXT(int buffer, long offset, long size, long data) {
		long __functionAddress = getInstance().GetNamedBufferSubDataEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPPPV(__functionAddress, buffer, offset, size, data);
	}

	public static void glGetNamedBufferSubDataEXT(int buffer, long offset, long size, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, size);
		nglGetNamedBufferSubDataEXT(buffer, offset, size, memAddress(data));
	}

	/** Alternative version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
	public static void glGetNamedBufferSubDataEXT(int buffer, long offset, ByteBuffer data) {
		nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining(), memAddress(data));
	}

	/** ShortBuffer version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
	public static void glGetNamedBufferSubDataEXT(int buffer, long offset, ShortBuffer data) {
		nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining() << 1, memAddress(data));
	}

	/** IntBuffer version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
	public static void glGetNamedBufferSubDataEXT(int buffer, long offset, IntBuffer data) {
		nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining() << 2, memAddress(data));
	}

	/** FloatBuffer version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
	public static void glGetNamedBufferSubDataEXT(int buffer, long offset, FloatBuffer data) {
		nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining() << 2, memAddress(data));
	}

	/** DoubleBuffer version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
	public static void glGetNamedBufferSubDataEXT(int buffer, long offset, DoubleBuffer data) {
		nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining() << 3, memAddress(data));
	}

	// --- [ glProgramUniform1fEXT ] ---

	public static void glProgramUniform1fEXT(int program, int location, float v0) {
		long __functionAddress = getInstance().ProgramUniform1fEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIFV(__functionAddress, program, location, v0);
	}

	// --- [ glProgramUniform2fEXT ] ---

	public static void glProgramUniform2fEXT(int program, int location, float v0, float v1) {
		long __functionAddress = getInstance().ProgramUniform2fEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIFFV(__functionAddress, program, location, v0, v1);
	}

	// --- [ glProgramUniform3fEXT ] ---

	public static void glProgramUniform3fEXT(int program, int location, float v0, float v1, float v2) {
		long __functionAddress = getInstance().ProgramUniform3fEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIFFFV(__functionAddress, program, location, v0, v1, v2);
	}

	// --- [ glProgramUniform4fEXT ] ---

	public static void glProgramUniform4fEXT(int program, int location, float v0, float v1, float v2, float v3) {
		long __functionAddress = getInstance().ProgramUniform4fEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIFFFFV(__functionAddress, program, location, v0, v1, v2, v3);
	}

	// --- [ glProgramUniform1iEXT ] ---

	public static void glProgramUniform1iEXT(int program, int location, int v0) {
		long __functionAddress = getInstance().ProgramUniform1iEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIV(__functionAddress, program, location, v0);
	}

	// --- [ glProgramUniform2iEXT ] ---

	public static void glProgramUniform2iEXT(int program, int location, int v0, int v1) {
		long __functionAddress = getInstance().ProgramUniform2iEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIV(__functionAddress, program, location, v0, v1);
	}

	// --- [ glProgramUniform3iEXT ] ---

	public static void glProgramUniform3iEXT(int program, int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().ProgramUniform3iEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIV(__functionAddress, program, location, v0, v1, v2);
	}

	// --- [ glProgramUniform4iEXT ] ---

	public static void glProgramUniform4iEXT(int program, int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().ProgramUniform4iEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIV(__functionAddress, program, location, v0, v1, v2, v3);
	}

	// --- [ glProgramUniform1fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniform1fvEXT ProgramUniform1fvEXT} */
	@JavadocExclude
	public static void nglProgramUniform1fvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform1fvEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglProgramUniform1fvEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1fvEXT ProgramUniform1fvEXT} */
	public static void glProgramUniform1fvEXT(int program, int location, FloatBuffer value) {
		nglProgramUniform1fvEXT(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniform2fvEXT ProgramUniform2fvEXT} */
	@JavadocExclude
	public static void nglProgramUniform2fvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform2fvEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglProgramUniform2fvEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2fvEXT ProgramUniform2fvEXT} */
	public static void glProgramUniform2fvEXT(int program, int location, FloatBuffer value) {
		nglProgramUniform2fvEXT(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniform3fvEXT ProgramUniform3fvEXT} */
	@JavadocExclude
	public static void nglProgramUniform3fvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform3fvEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglProgramUniform3fvEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3fvEXT ProgramUniform3fvEXT} */
	public static void glProgramUniform3fvEXT(int program, int location, FloatBuffer value) {
		nglProgramUniform3fvEXT(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniform4fvEXT ProgramUniform4fvEXT} */
	@JavadocExclude
	public static void nglProgramUniform4fvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform4fvEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniform4fvEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4fvEXT ProgramUniform4fvEXT} */
	public static void glProgramUniform4fvEXT(int program, int location, FloatBuffer value) {
		nglProgramUniform4fvEXT(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1ivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform1ivEXT ProgramUniform1ivEXT} */
	@JavadocExclude
	public static void nglProgramUniform1ivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1ivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform1ivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglProgramUniform1ivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1ivEXT ProgramUniform1ivEXT} */
	public static void glProgramUniform1ivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform1ivEXT(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2ivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform2ivEXT ProgramUniform2ivEXT} */
	@JavadocExclude
	public static void nglProgramUniform2ivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2ivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform2ivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglProgramUniform2ivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2ivEXT ProgramUniform2ivEXT} */
	public static void glProgramUniform2ivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform2ivEXT(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3ivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform3ivEXT ProgramUniform3ivEXT} */
	@JavadocExclude
	public static void nglProgramUniform3ivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3ivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform3ivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglProgramUniform3ivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3ivEXT ProgramUniform3ivEXT} */
	public static void glProgramUniform3ivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform3ivEXT(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4ivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform4ivEXT ProgramUniform4ivEXT} */
	@JavadocExclude
	public static void nglProgramUniform4ivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4ivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform4ivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniform4ivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4ivEXT ProgramUniform4ivEXT} */
	public static void glProgramUniform4ivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform4ivEXT(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix2fvEXT ProgramUniformMatrix2fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniformMatrix2fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2fvEXT ProgramUniformMatrix2fvEXT} */
	public static void glProgramUniformMatrix2fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2fvEXT(program, location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix3fvEXT ProgramUniformMatrix3fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 9) << 2);
		nglProgramUniformMatrix3fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3fvEXT ProgramUniformMatrix3fvEXT} */
	public static void glProgramUniformMatrix3fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3fvEXT(program, location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix4fvEXT ProgramUniformMatrix4fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 4) << 2);
		nglProgramUniformMatrix4fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4fvEXT ProgramUniformMatrix4fvEXT} */
	public static void glProgramUniformMatrix4fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4fvEXT(program, location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x3fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix2x3fvEXT ProgramUniformMatrix2x3fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x3fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglProgramUniformMatrix2x3fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x3fvEXT ProgramUniformMatrix2x3fvEXT} */
	public static void glProgramUniformMatrix2x3fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x3fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x2fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix3x2fvEXT ProgramUniformMatrix3x2fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x2fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglProgramUniformMatrix3x2fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x2fvEXT ProgramUniformMatrix3x2fvEXT} */
	public static void glProgramUniformMatrix3x2fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x2fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x4fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix2x4fvEXT ProgramUniformMatrix2x4fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x4fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglProgramUniformMatrix2x4fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x4fvEXT ProgramUniformMatrix2x4fvEXT} */
	public static void glProgramUniformMatrix2x4fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x4fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x2fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix4x2fvEXT ProgramUniformMatrix4x2fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x2fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglProgramUniformMatrix4x2fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x2fvEXT ProgramUniformMatrix4x2fvEXT} */
	public static void glProgramUniformMatrix4x2fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x2fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x4fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix3x4fvEXT ProgramUniformMatrix3x4fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x4fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglProgramUniformMatrix3x4fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x4fvEXT ProgramUniformMatrix3x4fvEXT} */
	public static void glProgramUniformMatrix3x4fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x4fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x3fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix4x3fvEXT ProgramUniformMatrix4x3fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x3fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglProgramUniformMatrix4x3fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x3fvEXT ProgramUniformMatrix4x3fvEXT} */
	public static void glProgramUniformMatrix4x3fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x3fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glTextureBufferEXT ] ---

	public static void glTextureBufferEXT(int texture, int target, int internalformat, int buffer) {
		long __functionAddress = getInstance().TextureBufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIV(__functionAddress, texture, target, internalformat, buffer);
	}

	// --- [ glMultiTexBufferEXT ] ---

	public static void glMultiTexBufferEXT(int texunit, int target, int internalformat, int buffer) {
		long __functionAddress = getInstance().MultiTexBufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIV(__functionAddress, texunit, target, internalformat, buffer);
	}

	// --- [ glTextureParameterIivEXT ] ---

	/** Unsafe version of {@link #glTextureParameterIivEXT TextureParameterIivEXT} */
	@JavadocExclude
	public static void nglTextureParameterIivEXT(int texture, int target, int pname, long params) {
		long __functionAddress = getInstance().TextureParameterIivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texture, target, pname, params);
	}

	public static void glTextureParameterIivEXT(int texture, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglTextureParameterIivEXT(texture, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTextureParameterIivEXT TextureParameterIivEXT} */
	public static void glTextureParameterIivEXT(int texture, int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglTextureParameterIivEXT(texture, target, pname, memAddress(params));
	}

	// --- [ glTextureParameterIuivEXT ] ---

	/** Unsafe version of {@link #glTextureParameterIuivEXT TextureParameterIuivEXT} */
	@JavadocExclude
	public static void nglTextureParameterIuivEXT(int texture, int target, int pname, long params) {
		long __functionAddress = getInstance().TextureParameterIuivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texture, target, pname, params);
	}

	public static void glTextureParameterIuivEXT(int texture, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglTextureParameterIuivEXT(texture, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTextureParameterIuivEXT TextureParameterIuivEXT} */
	public static void glTextureParameterIuivEXT(int texture, int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglTextureParameterIuivEXT(texture, target, pname, memAddress(params));
	}

	// --- [ glGetTextureParameterIivEXT ] ---

	/** Unsafe version of {@link #glGetTextureParameterIivEXT GetTextureParameterIivEXT} */
	@JavadocExclude
	public static void nglGetTextureParameterIivEXT(int texture, int target, int pname, long params) {
		long __functionAddress = getInstance().GetTextureParameterIivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texture, target, pname, params);
	}

	public static void glGetTextureParameterIivEXT(int texture, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTextureParameterIivEXT(texture, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTextureParameterIivEXT GetTextureParameterIivEXT} */
	public static void glGetTextureParameterIivEXT(int texture, int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTextureParameterIivEXT(texture, target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTextureParameterIivEXT GetTextureParameterIivEXT} */
	public static int glGetTextureParameterIiEXT(int texture, int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTextureParameterIivEXT(texture, target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetTextureParameterIuivEXT ] ---

	/** Unsafe version of {@link #glGetTextureParameterIuivEXT GetTextureParameterIuivEXT} */
	@JavadocExclude
	public static void nglGetTextureParameterIuivEXT(int texture, int target, int pname, long params) {
		long __functionAddress = getInstance().GetTextureParameterIuivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texture, target, pname, params);
	}

	public static void glGetTextureParameterIuivEXT(int texture, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTextureParameterIuivEXT(texture, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTextureParameterIuivEXT GetTextureParameterIuivEXT} */
	public static void glGetTextureParameterIuivEXT(int texture, int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTextureParameterIuivEXT(texture, target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTextureParameterIuivEXT GetTextureParameterIuivEXT} */
	public static int glGetTextureParameterIuiEXT(int texture, int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTextureParameterIuivEXT(texture, target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glMultiTexParameterIivEXT ] ---

	/** Unsafe version of {@link #glMultiTexParameterIivEXT MultiTexParameterIivEXT} */
	@JavadocExclude
	public static void nglMultiTexParameterIivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().MultiTexParameterIivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, target, pname, params);
	}

	public static void glMultiTexParameterIivEXT(int texunit, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglMultiTexParameterIivEXT(texunit, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glMultiTexParameterIivEXT MultiTexParameterIivEXT} */
	public static void glMultiTexParameterIivEXT(int texunit, int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglMultiTexParameterIivEXT(texunit, target, pname, memAddress(params));
	}

	// --- [ glMultiTexParameterIuivEXT ] ---

	/** Unsafe version of {@link #glMultiTexParameterIuivEXT MultiTexParameterIuivEXT} */
	@JavadocExclude
	public static void nglMultiTexParameterIuivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().MultiTexParameterIuivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, target, pname, params);
	}

	public static void glMultiTexParameterIuivEXT(int texunit, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglMultiTexParameterIuivEXT(texunit, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glMultiTexParameterIuivEXT MultiTexParameterIuivEXT} */
	public static void glMultiTexParameterIuivEXT(int texunit, int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglMultiTexParameterIuivEXT(texunit, target, pname, memAddress(params));
	}

	// --- [ glGetMultiTexParameterIivEXT ] ---

	/** Unsafe version of {@link #glGetMultiTexParameterIivEXT GetMultiTexParameterIivEXT} */
	@JavadocExclude
	public static void nglGetMultiTexParameterIivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexParameterIivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, target, pname, params);
	}

	public static void glGetMultiTexParameterIivEXT(int texunit, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetMultiTexParameterIivEXT(texunit, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetMultiTexParameterIivEXT GetMultiTexParameterIivEXT} */
	public static void glGetMultiTexParameterIivEXT(int texunit, int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetMultiTexParameterIivEXT(texunit, target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetMultiTexParameterIivEXT GetMultiTexParameterIivEXT} */
	public static int glGetMultiTexParameterIiEXT(int texunit, int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetMultiTexParameterIivEXT(texunit, target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetMultiTexParameterIuivEXT ] ---

	/** Unsafe version of {@link #glGetMultiTexParameterIuivEXT GetMultiTexParameterIuivEXT} */
	@JavadocExclude
	public static void nglGetMultiTexParameterIuivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexParameterIuivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, texunit, target, pname, params);
	}

	public static void glGetMultiTexParameterIuivEXT(int texunit, int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetMultiTexParameterIuivEXT(texunit, target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetMultiTexParameterIuivEXT GetMultiTexParameterIuivEXT} */
	public static void glGetMultiTexParameterIuivEXT(int texunit, int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetMultiTexParameterIuivEXT(texunit, target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetMultiTexParameterIuivEXT GetMultiTexParameterIuivEXT} */
	public static int glGetMultiTexParameterIuiEXT(int texunit, int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetMultiTexParameterIuivEXT(texunit, target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glProgramUniform1uiEXT ] ---

	public static void glProgramUniform1uiEXT(int program, int location, int v0) {
		long __functionAddress = getInstance().ProgramUniform1uiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIV(__functionAddress, program, location, v0);
	}

	// --- [ glProgramUniform2uiEXT ] ---

	public static void glProgramUniform2uiEXT(int program, int location, int v0, int v1) {
		long __functionAddress = getInstance().ProgramUniform2uiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIV(__functionAddress, program, location, v0, v1);
	}

	// --- [ glProgramUniform3uiEXT ] ---

	public static void glProgramUniform3uiEXT(int program, int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().ProgramUniform3uiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIV(__functionAddress, program, location, v0, v1, v2);
	}

	// --- [ glProgramUniform4uiEXT ] ---

	public static void glProgramUniform4uiEXT(int program, int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().ProgramUniform4uiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIV(__functionAddress, program, location, v0, v1, v2, v3);
	}

	// --- [ glProgramUniform1uivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform1uivEXT ProgramUniform1uivEXT} */
	@JavadocExclude
	public static void nglProgramUniform1uivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1uivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform1uivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglProgramUniform1uivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1uivEXT ProgramUniform1uivEXT} */
	public static void glProgramUniform1uivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform1uivEXT(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2uivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform2uivEXT ProgramUniform2uivEXT} */
	@JavadocExclude
	public static void nglProgramUniform2uivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2uivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform2uivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglProgramUniform2uivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2uivEXT ProgramUniform2uivEXT} */
	public static void glProgramUniform2uivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform2uivEXT(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3uivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform3uivEXT ProgramUniform3uivEXT} */
	@JavadocExclude
	public static void nglProgramUniform3uivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3uivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform3uivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglProgramUniform3uivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3uivEXT ProgramUniform3uivEXT} */
	public static void glProgramUniform3uivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform3uivEXT(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4uivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform4uivEXT ProgramUniform4uivEXT} */
	@JavadocExclude
	public static void nglProgramUniform4uivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4uivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform4uivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniform4uivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4uivEXT ProgramUniform4uivEXT} */
	public static void glProgramUniform4uivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform4uivEXT(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glNamedProgramLocalParameters4fvEXT ] ---

	/** Unsafe version of {@link #glNamedProgramLocalParameters4fvEXT NamedProgramLocalParameters4fvEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParameters4fvEXT(int program, int target, int index, int count, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParameters4fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIPV(__functionAddress, program, target, index, count, params);
	}

	public static void glNamedProgramLocalParameters4fvEXT(int program, int target, int index, int count, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, (count << 2) << 2);
		nglNamedProgramLocalParameters4fvEXT(program, target, index, count, memAddress(params));
	}

	/** Alternative version of: {@link #glNamedProgramLocalParameters4fvEXT NamedProgramLocalParameters4fvEXT} */
	public static void glNamedProgramLocalParameters4fvEXT(int program, int target, int index, FloatBuffer params) {
		nglNamedProgramLocalParameters4fvEXT(program, target, index, params.remaining() >> 2, memAddress(params));
	}

	// --- [ glNamedProgramLocalParameterI4iEXT ] ---

	public static void glNamedProgramLocalParameterI4iEXT(int program, int target, int index, int x, int y, int z, int w) {
		long __functionAddress = getInstance().NamedProgramLocalParameterI4iEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIV(__functionAddress, program, target, index, x, y, z, w);
	}

	// --- [ glNamedProgramLocalParameterI4ivEXT ] ---

	/** Unsafe version of {@link #glNamedProgramLocalParameterI4ivEXT NamedProgramLocalParameterI4ivEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParameterI4ivEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParameterI4ivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, target, index, params);
	}

	public static void glNamedProgramLocalParameterI4ivEXT(int program, int target, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglNamedProgramLocalParameterI4ivEXT(program, target, index, memAddress(params));
	}

	/** Alternative version of: {@link #glNamedProgramLocalParameterI4ivEXT NamedProgramLocalParameterI4ivEXT} */
	public static void glNamedProgramLocalParameterI4ivEXT(int program, int target, int index, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglNamedProgramLocalParameterI4ivEXT(program, target, index, memAddress(params));
	}

	// --- [ glNamedProgramLocalParametersI4ivEXT ] ---

	/** Unsafe version of {@link #glNamedProgramLocalParametersI4ivEXT NamedProgramLocalParametersI4ivEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParametersI4ivEXT(int program, int target, int index, int count, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParametersI4ivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIPV(__functionAddress, program, target, index, count, params);
	}

	public static void glNamedProgramLocalParametersI4ivEXT(int program, int target, int index, int count, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, (count << 2) << 2);
		nglNamedProgramLocalParametersI4ivEXT(program, target, index, count, memAddress(params));
	}

	/** Alternative version of: {@link #glNamedProgramLocalParametersI4ivEXT NamedProgramLocalParametersI4ivEXT} */
	public static void glNamedProgramLocalParametersI4ivEXT(int program, int target, int index, IntBuffer params) {
		nglNamedProgramLocalParametersI4ivEXT(program, target, index, params.remaining() >> 2, memAddress(params));
	}

	// --- [ glNamedProgramLocalParameterI4uiEXT ] ---

	public static void glNamedProgramLocalParameterI4uiEXT(int program, int target, int index, int x, int y, int z, int w) {
		long __functionAddress = getInstance().NamedProgramLocalParameterI4uiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIIV(__functionAddress, program, target, index, x, y, z, w);
	}

	// --- [ glNamedProgramLocalParameterI4uivEXT ] ---

	/** Unsafe version of {@link #glNamedProgramLocalParameterI4uivEXT NamedProgramLocalParameterI4uivEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParameterI4uivEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParameterI4uivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, target, index, params);
	}

	public static void glNamedProgramLocalParameterI4uivEXT(int program, int target, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglNamedProgramLocalParameterI4uivEXT(program, target, index, memAddress(params));
	}

	/** Alternative version of: {@link #glNamedProgramLocalParameterI4uivEXT NamedProgramLocalParameterI4uivEXT} */
	public static void glNamedProgramLocalParameterI4uivEXT(int program, int target, int index, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglNamedProgramLocalParameterI4uivEXT(program, target, index, memAddress(params));
	}

	// --- [ glNamedProgramLocalParametersI4uivEXT ] ---

	/** Unsafe version of {@link #glNamedProgramLocalParametersI4uivEXT NamedProgramLocalParametersI4uivEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParametersI4uivEXT(int program, int target, int index, int count, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParametersI4uivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIPV(__functionAddress, program, target, index, count, params);
	}

	public static void glNamedProgramLocalParametersI4uivEXT(int program, int target, int index, int count, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, (count << 2) << 2);
		nglNamedProgramLocalParametersI4uivEXT(program, target, index, count, memAddress(params));
	}

	/** Alternative version of: {@link #glNamedProgramLocalParametersI4uivEXT NamedProgramLocalParametersI4uivEXT} */
	public static void glNamedProgramLocalParametersI4uivEXT(int program, int target, int index, IntBuffer params) {
		nglNamedProgramLocalParametersI4uivEXT(program, target, index, params.remaining() >> 2, memAddress(params));
	}

	// --- [ glGetNamedProgramLocalParameterIivEXT ] ---

	/** Unsafe version of {@link #glGetNamedProgramLocalParameterIivEXT GetNamedProgramLocalParameterIivEXT} */
	@JavadocExclude
	public static void nglGetNamedProgramLocalParameterIivEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().GetNamedProgramLocalParameterIivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, target, index, params);
	}

	public static void glGetNamedProgramLocalParameterIivEXT(int program, int target, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetNamedProgramLocalParameterIivEXT(program, target, index, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedProgramLocalParameterIivEXT GetNamedProgramLocalParameterIivEXT} */
	public static void glGetNamedProgramLocalParameterIivEXT(int program, int target, int index, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetNamedProgramLocalParameterIivEXT(program, target, index, memAddress(params));
	}

	// --- [ glGetNamedProgramLocalParameterIuivEXT ] ---

	/** Unsafe version of {@link #glGetNamedProgramLocalParameterIuivEXT GetNamedProgramLocalParameterIuivEXT} */
	@JavadocExclude
	public static void nglGetNamedProgramLocalParameterIuivEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().GetNamedProgramLocalParameterIuivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, target, index, params);
	}

	public static void glGetNamedProgramLocalParameterIuivEXT(int program, int target, int index, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetNamedProgramLocalParameterIuivEXT(program, target, index, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedProgramLocalParameterIuivEXT GetNamedProgramLocalParameterIuivEXT} */
	public static void glGetNamedProgramLocalParameterIuivEXT(int program, int target, int index, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetNamedProgramLocalParameterIuivEXT(program, target, index, memAddress(params));
	}

	// --- [ glNamedRenderbufferStorageEXT ] ---

	public static void glNamedRenderbufferStorageEXT(int renderbuffer, int internalformat, int width, int height) {
		long __functionAddress = getInstance().NamedRenderbufferStorageEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIV(__functionAddress, renderbuffer, internalformat, width, height);
	}

	// --- [ glGetNamedRenderbufferParameterivEXT ] ---

	/** Unsafe version of {@link #glGetNamedRenderbufferParameterivEXT GetNamedRenderbufferParameterivEXT} */
	@JavadocExclude
	public static void nglGetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, long params) {
		long __functionAddress = getInstance().GetNamedRenderbufferParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, renderbuffer, pname, params);
	}

	public static void glGetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedRenderbufferParameterivEXT GetNamedRenderbufferParameterivEXT} */
	public static void glGetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetNamedRenderbufferParameterivEXT GetNamedRenderbufferParameterivEXT} */
	public static int glGetNamedRenderbufferParameteriEXT(int renderbuffer, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glNamedRenderbufferStorageMultisampleEXT ] ---

	public static void glNamedRenderbufferStorageMultisampleEXT(int renderbuffer, int samples, int internalformat, int width, int height) {
		long __functionAddress = getInstance().NamedRenderbufferStorageMultisampleEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIV(__functionAddress, renderbuffer, samples, internalformat, width, height);
	}

	// --- [ glNamedRenderbufferStorageMultisampleCoverageEXT ] ---

	public static void glNamedRenderbufferStorageMultisampleCoverageEXT(int renderbuffer, int coverageSamples, int colorSamples, int internalformat, int width, int height) {
		long __functionAddress = getInstance().NamedRenderbufferStorageMultisampleCoverageEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIV(__functionAddress, renderbuffer, coverageSamples, colorSamples, internalformat, width, height);
	}

	// --- [ glCheckNamedFramebufferStatusEXT ] ---

	public static int glCheckNamedFramebufferStatusEXT(int framebuffer, int target) {
		long __functionAddress = getInstance().CheckNamedFramebufferStatusEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return callIII(__functionAddress, framebuffer, target);
	}

	// --- [ glNamedFramebufferTexture1DEXT ] ---

	public static void glNamedFramebufferTexture1DEXT(int framebuffer, int attachment, int textarget, int texture, int level) {
		long __functionAddress = getInstance().NamedFramebufferTexture1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIV(__functionAddress, framebuffer, attachment, textarget, texture, level);
	}

	// --- [ glNamedFramebufferTexture2DEXT ] ---

	public static void glNamedFramebufferTexture2DEXT(int framebuffer, int attachment, int textarget, int texture, int level) {
		long __functionAddress = getInstance().NamedFramebufferTexture2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIV(__functionAddress, framebuffer, attachment, textarget, texture, level);
	}

	// --- [ glNamedFramebufferTexture3DEXT ] ---

	public static void glNamedFramebufferTexture3DEXT(int framebuffer, int attachment, int textarget, int texture, int level, int zoffset) {
		long __functionAddress = getInstance().NamedFramebufferTexture3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIV(__functionAddress, framebuffer, attachment, textarget, texture, level, zoffset);
	}

	// --- [ glNamedFramebufferRenderbufferEXT ] ---

	public static void glNamedFramebufferRenderbufferEXT(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
		long __functionAddress = getInstance().NamedFramebufferRenderbufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIV(__functionAddress, framebuffer, attachment, renderbuffertarget, renderbuffer);
	}

	// --- [ glGetNamedFramebufferAttachmentParameterivEXT ] ---

	/** Unsafe version of {@link #glGetNamedFramebufferAttachmentParameterivEXT GetNamedFramebufferAttachmentParameterivEXT} */
	@JavadocExclude
	public static void nglGetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, long params) {
		long __functionAddress = getInstance().GetNamedFramebufferAttachmentParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, framebuffer, attachment, pname, params);
	}

	public static void glGetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedFramebufferAttachmentParameterivEXT GetNamedFramebufferAttachmentParameterivEXT} */
	public static void glGetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetNamedFramebufferAttachmentParameterivEXT GetNamedFramebufferAttachmentParameterivEXT} */
	public static int glGetNamedFramebufferAttachmentParameteriEXT(int framebuffer, int attachment, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGenerateTextureMipmapEXT ] ---

	public static void glGenerateTextureMipmapEXT(int texture, int target) {
		long __functionAddress = getInstance().GenerateTextureMipmapEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, texture, target);
	}

	// --- [ glGenerateMultiTexMipmapEXT ] ---

	public static void glGenerateMultiTexMipmapEXT(int texunit, int target) {
		long __functionAddress = getInstance().GenerateMultiTexMipmapEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, texunit, target);
	}

	// --- [ glFramebufferDrawBufferEXT ] ---

	public static void glFramebufferDrawBufferEXT(int framebuffer, int mode) {
		long __functionAddress = getInstance().FramebufferDrawBufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, framebuffer, mode);
	}

	// --- [ glFramebufferDrawBuffersEXT ] ---

	/** Unsafe version of {@link #glFramebufferDrawBuffersEXT FramebufferDrawBuffersEXT} */
	@JavadocExclude
	public static void nglFramebufferDrawBuffersEXT(int framebuffer, int n, long bufs) {
		long __functionAddress = getInstance().FramebufferDrawBuffersEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, framebuffer, n, bufs);
	}

	public static void glFramebufferDrawBuffersEXT(int framebuffer, int n, ByteBuffer bufs) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(bufs, n << 2);
		nglFramebufferDrawBuffersEXT(framebuffer, n, memAddress(bufs));
	}

	/** Alternative version of: {@link #glFramebufferDrawBuffersEXT FramebufferDrawBuffersEXT} */
	public static void glFramebufferDrawBuffersEXT(int framebuffer, IntBuffer bufs) {
		nglFramebufferDrawBuffersEXT(framebuffer, bufs.remaining(), memAddress(bufs));
	}

	// --- [ glFramebufferReadBufferEXT ] ---

	public static void glFramebufferReadBufferEXT(int framebuffer, int mode) {
		long __functionAddress = getInstance().FramebufferReadBufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, framebuffer, mode);
	}

	// --- [ glGetFramebufferParameterivEXT ] ---

	/** Unsafe version of {@link #glGetFramebufferParameterivEXT GetFramebufferParameterivEXT} */
	@JavadocExclude
	public static void nglGetFramebufferParameterivEXT(int framebuffer, int pname, long param) {
		long __functionAddress = getInstance().GetFramebufferParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, framebuffer, pname, param);
	}

	public static void glGetFramebufferParameterivEXT(int framebuffer, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1 << 2);
		nglGetFramebufferParameterivEXT(framebuffer, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glGetFramebufferParameterivEXT GetFramebufferParameterivEXT} */
	public static void glGetFramebufferParameterivEXT(int framebuffer, int pname, IntBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1);
		nglGetFramebufferParameterivEXT(framebuffer, pname, memAddress(param));
	}

	/** Single return value version of: {@link #glGetFramebufferParameterivEXT GetFramebufferParameterivEXT} */
	public static int glGetFramebufferParameteriEXT(int framebuffer, int pname) {
		APIBuffer __buffer = apiBuffer();
		int param = __buffer.intParam();
		nglGetFramebufferParameterivEXT(framebuffer, pname, __buffer.address(param));
		return __buffer.intValue(param);
	}

	// --- [ glNamedCopyBufferSubDataEXT ] ---

	public static void glNamedCopyBufferSubDataEXT(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
		long __functionAddress = getInstance().NamedCopyBufferSubDataEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPPPV(__functionAddress, readBuffer, writeBuffer, readOffset, writeOffset, size);
	}

	// --- [ glNamedFramebufferTextureEXT ] ---

	public static void glNamedFramebufferTextureEXT(int framebuffer, int attachment, int texture, int level) {
		long __functionAddress = getInstance().NamedFramebufferTextureEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIV(__functionAddress, framebuffer, attachment, texture, level);
	}

	// --- [ glNamedFramebufferTextureLayerEXT ] ---

	public static void glNamedFramebufferTextureLayerEXT(int framebuffer, int attachment, int texture, int level, int layer) {
		long __functionAddress = getInstance().NamedFramebufferTextureLayerEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIV(__functionAddress, framebuffer, attachment, texture, level, layer);
	}

	// --- [ glNamedFramebufferTextureFaceEXT ] ---

	public static void glNamedFramebufferTextureFaceEXT(int framebuffer, int attachment, int texture, int level, int face) {
		long __functionAddress = getInstance().NamedFramebufferTextureFaceEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIV(__functionAddress, framebuffer, attachment, texture, level, face);
	}

	// --- [ glTextureRenderbufferEXT ] ---

	public static void glTextureRenderbufferEXT(int texture, int target, int renderbuffer) {
		long __functionAddress = getInstance().TextureRenderbufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIV(__functionAddress, texture, target, renderbuffer);
	}

	// --- [ glMultiTexRenderbufferEXT ] ---

	public static void glMultiTexRenderbufferEXT(int texunit, int target, int renderbuffer) {
		long __functionAddress = getInstance().MultiTexRenderbufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIV(__functionAddress, texunit, target, renderbuffer);
	}

	// --- [ glVertexArrayVertexOffsetEXT ] ---

	public static void glVertexArrayVertexOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayVertexOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIPV(__functionAddress, vaobj, buffer, size, type, stride, offset);
	}

	// --- [ glVertexArrayColorOffsetEXT ] ---

	public static void glVertexArrayColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayColorOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIPV(__functionAddress, vaobj, buffer, size, type, stride, offset);
	}

	// --- [ glVertexArrayEdgeFlagOffsetEXT ] ---

	public static void glVertexArrayEdgeFlagOffsetEXT(int vaobj, int buffer, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayEdgeFlagOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, vaobj, buffer, stride, offset);
	}

	// --- [ glVertexArrayIndexOffsetEXT ] ---

	public static void glVertexArrayIndexOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayIndexOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIPV(__functionAddress, vaobj, buffer, type, stride, offset);
	}

	// --- [ glVertexArrayNormalOffsetEXT ] ---

	public static void glVertexArrayNormalOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayNormalOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIPV(__functionAddress, vaobj, buffer, type, stride, offset);
	}

	// --- [ glVertexArrayTexCoordOffsetEXT ] ---

	public static void glVertexArrayTexCoordOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayTexCoordOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIPV(__functionAddress, vaobj, buffer, size, type, stride, offset);
	}

	// --- [ glVertexArrayMultiTexCoordOffsetEXT ] ---

	public static void glVertexArrayMultiTexCoordOffsetEXT(int vaobj, int buffer, int texunit, int size, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayMultiTexCoordOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIPV(__functionAddress, vaobj, buffer, texunit, size, type, stride, offset);
	}

	// --- [ glVertexArrayFogCoordOffsetEXT ] ---

	public static void glVertexArrayFogCoordOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayFogCoordOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIPV(__functionAddress, vaobj, buffer, type, stride, offset);
	}

	// --- [ glVertexArraySecondaryColorOffsetEXT ] ---

	public static void glVertexArraySecondaryColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArraySecondaryColorOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIPV(__functionAddress, vaobj, buffer, size, type, stride, offset);
	}

	// --- [ glVertexArrayVertexAttribOffsetEXT ] ---

	public static void glVertexArrayVertexAttribOffsetEXT(int vaobj, int buffer, int index, int size, int type, boolean normalized, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayVertexAttribOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIZIPV(__functionAddress, vaobj, buffer, index, size, type, normalized, stride, offset);
	}

	// --- [ glVertexArrayVertexAttribIOffsetEXT ] ---

	public static void glVertexArrayVertexAttribIOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayVertexAttribIOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIIPV(__functionAddress, vaobj, buffer, index, size, type, stride, offset);
	}

	// --- [ glEnableVertexArrayEXT ] ---

	public static void glEnableVertexArrayEXT(int vaobj, int array) {
		long __functionAddress = getInstance().EnableVertexArrayEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, vaobj, array);
	}

	// --- [ glDisableVertexArrayEXT ] ---

	public static void glDisableVertexArrayEXT(int vaobj, int array) {
		long __functionAddress = getInstance().DisableVertexArrayEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, vaobj, array);
	}

	// --- [ glEnableVertexArrayAttribEXT ] ---

	public static void glEnableVertexArrayAttribEXT(int vaobj, int index) {
		long __functionAddress = getInstance().EnableVertexArrayAttribEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, vaobj, index);
	}

	// --- [ glDisableVertexArrayAttribEXT ] ---

	public static void glDisableVertexArrayAttribEXT(int vaobj, int index) {
		long __functionAddress = getInstance().DisableVertexArrayAttribEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, vaobj, index);
	}

	// --- [ glGetVertexArrayIntegervEXT ] ---

	/** Unsafe version of {@link #glGetVertexArrayIntegervEXT GetVertexArrayIntegervEXT} */
	@JavadocExclude
	public static void nglGetVertexArrayIntegervEXT(int vaobj, int pname, long param) {
		long __functionAddress = getInstance().GetVertexArrayIntegervEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, vaobj, pname, param);
	}

	public static void glGetVertexArrayIntegervEXT(int vaobj, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1 << 2);
		nglGetVertexArrayIntegervEXT(vaobj, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glGetVertexArrayIntegervEXT GetVertexArrayIntegervEXT} */
	public static void glGetVertexArrayIntegervEXT(int vaobj, int pname, IntBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1);
		nglGetVertexArrayIntegervEXT(vaobj, pname, memAddress(param));
	}

	/** Single return value version of: {@link #glGetVertexArrayIntegervEXT GetVertexArrayIntegervEXT} */
	public static int glGetVertexArrayIntegerEXT(int vaobj, int pname) {
		APIBuffer __buffer = apiBuffer();
		int param = __buffer.intParam();
		nglGetVertexArrayIntegervEXT(vaobj, pname, __buffer.address(param));
		return __buffer.intValue(param);
	}

	// --- [ glGetVertexArrayPointervEXT ] ---

	/** Unsafe version of {@link #glGetVertexArrayPointervEXT GetVertexArrayPointervEXT} */
	@JavadocExclude
	public static void nglGetVertexArrayPointervEXT(int vaobj, int pname, long param) {
		long __functionAddress = getInstance().GetVertexArrayPointervEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, vaobj, pname, param);
	}

	public static void glGetVertexArrayPointervEXT(int vaobj, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1 << POINTER_SHIFT);
		nglGetVertexArrayPointervEXT(vaobj, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glGetVertexArrayPointervEXT GetVertexArrayPointervEXT} */
	public static void glGetVertexArrayPointervEXT(int vaobj, int pname, PointerBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1);
		nglGetVertexArrayPointervEXT(vaobj, pname, memAddress(param));
	}

	/** Single return value version of: {@link #glGetVertexArrayPointervEXT GetVertexArrayPointervEXT} */
	public static long glGetVertexArrayPointerEXT(int vaobj, int pname) {
		APIBuffer __buffer = apiBuffer();
		int param = __buffer.pointerParam();
		nglGetVertexArrayPointervEXT(vaobj, pname, __buffer.address(param));
		return __buffer.pointerValue(param);
	}

	// --- [ glGetVertexArrayIntegeri_vEXT ] ---

	/** Unsafe version of {@link #glGetVertexArrayIntegeri_vEXT GetVertexArrayIntegeri_vEXT} */
	@JavadocExclude
	public static void nglGetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, long param) {
		long __functionAddress = getInstance().GetVertexArrayIntegeri_vEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, vaobj, index, pname, param);
	}

	public static void glGetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1 << 2);
		nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glGetVertexArrayIntegeri_vEXT GetVertexArrayIntegeri_vEXT} */
	public static void glGetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, IntBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1);
		nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, memAddress(param));
	}

	/** Single return value version of: {@link #glGetVertexArrayIntegeri_vEXT GetVertexArrayIntegeri_vEXT} */
	public static int glGetVertexArrayIntegeriEXT(int vaobj, int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int param = __buffer.intParam();
		nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, __buffer.address(param));
		return __buffer.intValue(param);
	}

	// --- [ glGetVertexArrayPointeri_vEXT ] ---

	/** Unsafe version of {@link #glGetVertexArrayPointeri_vEXT GetVertexArrayPointeri_vEXT} */
	@JavadocExclude
	public static void nglGetVertexArrayPointeri_vEXT(int vaobj, int index, int pname, long param) {
		long __functionAddress = getInstance().GetVertexArrayPointeri_vEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, vaobj, index, pname, param);
	}

	public static void glGetVertexArrayPointeri_vEXT(int vaobj, int index, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1 << POINTER_SHIFT);
		nglGetVertexArrayPointeri_vEXT(vaobj, index, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glGetVertexArrayPointeri_vEXT GetVertexArrayPointeri_vEXT} */
	public static void glGetVertexArrayPointeri_vEXT(int vaobj, int index, int pname, PointerBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1);
		nglGetVertexArrayPointeri_vEXT(vaobj, index, pname, memAddress(param));
	}

	/** Single return value version of: {@link #glGetVertexArrayPointeri_vEXT GetVertexArrayPointeri_vEXT} */
	public static long glGetVertexArrayPointeriEXT(int vaobj, int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int param = __buffer.pointerParam();
		nglGetVertexArrayPointeri_vEXT(vaobj, index, pname, __buffer.address(param));
		return __buffer.pointerValue(param);
	}

	// --- [ glMapNamedBufferRangeEXT ] ---

	/** Unsafe version of {@link #glMapNamedBufferRangeEXT MapNamedBufferRangeEXT} */
	@JavadocExclude
	public static long nglMapNamedBufferRangeEXT(int buffer, long offset, long length, int access) {
		long __functionAddress = getInstance().MapNamedBufferRangeEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return callIPPIP(__functionAddress, buffer, offset, length, access);
	}

	public static ByteBuffer glMapNamedBufferRangeEXT(int buffer, long offset, long length, int access) {
		long __result = nglMapNamedBufferRangeEXT(buffer, offset, length, access);
		return memByteBuffer(__result, (int)length);
	}

	/** Alternative version of: {@link #glMapNamedBufferRangeEXT MapNamedBufferRangeEXT} */
	public static ByteBuffer glMapNamedBufferRangeEXT(int buffer, long offset, long length, int access, ByteBuffer old_buffer) {
		long __result = nglMapNamedBufferRangeEXT(buffer, offset, length, access);
		return old_buffer == null ? memByteBuffer(__result, (int)length) : memSetupBuffer(old_buffer, __result, (int)length);
	}

	// --- [ glFlushMappedNamedBufferRangeEXT ] ---

	public static void glFlushMappedNamedBufferRangeEXT(int buffer, long offset, long length) {
		long __functionAddress = getInstance().FlushMappedNamedBufferRangeEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPPV(__functionAddress, buffer, offset, length);
	}

}