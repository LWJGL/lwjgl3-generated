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

	/** JNI method for {@link #glClientAttribDefaultEXT ClientAttribDefaultEXT} */
	@JavadocExclude
	public static native void nglClientAttribDefaultEXT(int mask, long __functionAddress);

	/**
	 * 
	 *
	 * @param mask 
	 */
	public static void glClientAttribDefaultEXT(int mask) {
		long __functionAddress = getInstance().ClientAttribDefaultEXT;
		nglClientAttribDefaultEXT(mask, __functionAddress);
	}

	// --- [ glPushClientAttribDefaultEXT ] ---

	/** JNI method for {@link #glPushClientAttribDefaultEXT PushClientAttribDefaultEXT} */
	@JavadocExclude
	public static native void nglPushClientAttribDefaultEXT(int mask, long __functionAddress);

	/**
	 * 
	 *
	 * @param mask 
	 */
	public static void glPushClientAttribDefaultEXT(int mask) {
		long __functionAddress = getInstance().PushClientAttribDefaultEXT;
		nglPushClientAttribDefaultEXT(mask, __functionAddress);
	}

	// --- [ glMatrixLoadfEXT ] ---

	/** JNI method for {@link #glMatrixLoadfEXT MatrixLoadfEXT} */
	@JavadocExclude
	public static native void nglMatrixLoadfEXT(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixLoadfEXT MatrixLoadfEXT} */
	@JavadocExclude
	public static void nglMatrixLoadfEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixLoadfEXT;
		nglMatrixLoadfEXT(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param m          
	 */
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

	/** JNI method for {@link #glMatrixLoaddEXT MatrixLoaddEXT} */
	@JavadocExclude
	public static native void nglMatrixLoaddEXT(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixLoaddEXT MatrixLoaddEXT} */
	@JavadocExclude
	public static void nglMatrixLoaddEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixLoaddEXT;
		nglMatrixLoaddEXT(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param m          
	 */
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

	/** JNI method for {@link #glMatrixMultfEXT MatrixMultfEXT} */
	@JavadocExclude
	public static native void nglMatrixMultfEXT(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixMultfEXT MatrixMultfEXT} */
	@JavadocExclude
	public static void nglMatrixMultfEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixMultfEXT;
		nglMatrixMultfEXT(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param m          
	 */
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

	/** JNI method for {@link #glMatrixMultdEXT MatrixMultdEXT} */
	@JavadocExclude
	public static native void nglMatrixMultdEXT(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixMultdEXT MatrixMultdEXT} */
	@JavadocExclude
	public static void nglMatrixMultdEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixMultdEXT;
		nglMatrixMultdEXT(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param m          
	 */
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

	/** JNI method for {@link #glMatrixLoadIdentityEXT MatrixLoadIdentityEXT} */
	@JavadocExclude
	public static native void nglMatrixLoadIdentityEXT(int matrixMode, long __functionAddress);

	/**
	 * 
	 *
	 * @param matrixMode 
	 */
	public static void glMatrixLoadIdentityEXT(int matrixMode) {
		long __functionAddress = getInstance().MatrixLoadIdentityEXT;
		nglMatrixLoadIdentityEXT(matrixMode, __functionAddress);
	}

	// --- [ glMatrixRotatefEXT ] ---

	/** JNI method for {@link #glMatrixRotatefEXT MatrixRotatefEXT} */
	@JavadocExclude
	public static native void nglMatrixRotatefEXT(int matrixMode, float angle, float x, float y, float z, long __functionAddress);

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param angle      
	 * @param x          
	 * @param y          
	 * @param z          
	 */
	public static void glMatrixRotatefEXT(int matrixMode, float angle, float x, float y, float z) {
		long __functionAddress = getInstance().MatrixRotatefEXT;
		nglMatrixRotatefEXT(matrixMode, angle, x, y, z, __functionAddress);
	}

	// --- [ glMatrixRotatedEXT ] ---

	/** JNI method for {@link #glMatrixRotatedEXT MatrixRotatedEXT} */
	@JavadocExclude
	public static native void nglMatrixRotatedEXT(int matrixMode, double angle, double x, double y, double z, long __functionAddress);

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param angle      
	 * @param x          
	 * @param y          
	 * @param z          
	 */
	public static void glMatrixRotatedEXT(int matrixMode, double angle, double x, double y, double z) {
		long __functionAddress = getInstance().MatrixRotatedEXT;
		nglMatrixRotatedEXT(matrixMode, angle, x, y, z, __functionAddress);
	}

	// --- [ glMatrixScalefEXT ] ---

	/** JNI method for {@link #glMatrixScalefEXT MatrixScalefEXT} */
	@JavadocExclude
	public static native void nglMatrixScalefEXT(int matrixMode, float x, float y, float z, long __functionAddress);

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param x          
	 * @param y          
	 * @param z          
	 */
	public static void glMatrixScalefEXT(int matrixMode, float x, float y, float z) {
		long __functionAddress = getInstance().MatrixScalefEXT;
		nglMatrixScalefEXT(matrixMode, x, y, z, __functionAddress);
	}

	// --- [ glMatrixScaledEXT ] ---

	/** JNI method for {@link #glMatrixScaledEXT MatrixScaledEXT} */
	@JavadocExclude
	public static native void nglMatrixScaledEXT(int matrixMode, double x, double y, double z, long __functionAddress);

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param x          
	 * @param y          
	 * @param z          
	 */
	public static void glMatrixScaledEXT(int matrixMode, double x, double y, double z) {
		long __functionAddress = getInstance().MatrixScaledEXT;
		nglMatrixScaledEXT(matrixMode, x, y, z, __functionAddress);
	}

	// --- [ glMatrixTranslatefEXT ] ---

	/** JNI method for {@link #glMatrixTranslatefEXT MatrixTranslatefEXT} */
	@JavadocExclude
	public static native void nglMatrixTranslatefEXT(int matrixMode, float x, float y, float z, long __functionAddress);

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param x          
	 * @param y          
	 * @param z          
	 */
	public static void glMatrixTranslatefEXT(int matrixMode, float x, float y, float z) {
		long __functionAddress = getInstance().MatrixTranslatefEXT;
		nglMatrixTranslatefEXT(matrixMode, x, y, z, __functionAddress);
	}

	// --- [ glMatrixTranslatedEXT ] ---

	/** JNI method for {@link #glMatrixTranslatedEXT MatrixTranslatedEXT} */
	@JavadocExclude
	public static native void nglMatrixTranslatedEXT(int matrixMode, double x, double y, double z, long __functionAddress);

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param x          
	 * @param y          
	 * @param z          
	 */
	public static void glMatrixTranslatedEXT(int matrixMode, double x, double y, double z) {
		long __functionAddress = getInstance().MatrixTranslatedEXT;
		nglMatrixTranslatedEXT(matrixMode, x, y, z, __functionAddress);
	}

	// --- [ glMatrixOrthoEXT ] ---

	/** JNI method for {@link #glMatrixOrthoEXT MatrixOrthoEXT} */
	@JavadocExclude
	public static native void nglMatrixOrthoEXT(int matrixMode, double l, double r, double b, double t, double n, double f, long __functionAddress);

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param l          
	 * @param r          
	 * @param b          
	 * @param t          
	 * @param n          
	 * @param f          
	 */
	public static void glMatrixOrthoEXT(int matrixMode, double l, double r, double b, double t, double n, double f) {
		long __functionAddress = getInstance().MatrixOrthoEXT;
		nglMatrixOrthoEXT(matrixMode, l, r, b, t, n, f, __functionAddress);
	}

	// --- [ glMatrixFrustumEXT ] ---

	/** JNI method for {@link #glMatrixFrustumEXT MatrixFrustumEXT} */
	@JavadocExclude
	public static native void nglMatrixFrustumEXT(int matrixMode, double l, double r, double b, double t, double n, double f, long __functionAddress);

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param l          
	 * @param r          
	 * @param b          
	 * @param t          
	 * @param n          
	 * @param f          
	 */
	public static void glMatrixFrustumEXT(int matrixMode, double l, double r, double b, double t, double n, double f) {
		long __functionAddress = getInstance().MatrixFrustumEXT;
		nglMatrixFrustumEXT(matrixMode, l, r, b, t, n, f, __functionAddress);
	}

	// --- [ glMatrixPushEXT ] ---

	/** JNI method for {@link #glMatrixPushEXT MatrixPushEXT} */
	@JavadocExclude
	public static native void nglMatrixPushEXT(int matrixMode, long __functionAddress);

	/**
	 * 
	 *
	 * @param matrixMode 
	 */
	public static void glMatrixPushEXT(int matrixMode) {
		long __functionAddress = getInstance().MatrixPushEXT;
		nglMatrixPushEXT(matrixMode, __functionAddress);
	}

	// --- [ glMatrixPopEXT ] ---

	/** JNI method for {@link #glMatrixPopEXT MatrixPopEXT} */
	@JavadocExclude
	public static native void nglMatrixPopEXT(int matrixMode, long __functionAddress);

	/**
	 * 
	 *
	 * @param matrixMode 
	 */
	public static void glMatrixPopEXT(int matrixMode) {
		long __functionAddress = getInstance().MatrixPopEXT;
		nglMatrixPopEXT(matrixMode, __functionAddress);
	}

	// --- [ glTextureParameteriEXT ] ---

	/** JNI method for {@link #glTextureParameteriEXT TextureParameteriEXT} */
	@JavadocExclude
	public static native void nglTextureParameteriEXT(int texture, int target, int pname, int param, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param pname   
	 * @param param   
	 */
	public static void glTextureParameteriEXT(int texture, int target, int pname, int param) {
		long __functionAddress = getInstance().TextureParameteriEXT;
		nglTextureParameteriEXT(texture, target, pname, param, __functionAddress);
	}

	// --- [ glTextureParameterivEXT ] ---

	/** JNI method for {@link #glTextureParameterivEXT TextureParameterivEXT} */
	@JavadocExclude
	public static native void nglTextureParameterivEXT(int texture, int target, int pname, long param, long __functionAddress);

	/** Unsafe version of {@link #glTextureParameterivEXT TextureParameterivEXT} */
	@JavadocExclude
	public static void nglTextureParameterivEXT(int texture, int target, int pname, long param) {
		long __functionAddress = getInstance().TextureParameterivEXT;
		nglTextureParameterivEXT(texture, target, pname, param, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param pname   
	 * @param param   
	 */
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

	/** JNI method for {@link #glTextureParameterfEXT TextureParameterfEXT} */
	@JavadocExclude
	public static native void nglTextureParameterfEXT(int texture, int target, int pname, float param, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param pname   
	 * @param param   
	 */
	public static void glTextureParameterfEXT(int texture, int target, int pname, float param) {
		long __functionAddress = getInstance().TextureParameterfEXT;
		nglTextureParameterfEXT(texture, target, pname, param, __functionAddress);
	}

	// --- [ glTextureParameterfvEXT ] ---

	/** JNI method for {@link #glTextureParameterfvEXT TextureParameterfvEXT} */
	@JavadocExclude
	public static native void nglTextureParameterfvEXT(int texture, int target, int pname, long param, long __functionAddress);

	/** Unsafe version of {@link #glTextureParameterfvEXT TextureParameterfvEXT} */
	@JavadocExclude
	public static void nglTextureParameterfvEXT(int texture, int target, int pname, long param) {
		long __functionAddress = getInstance().TextureParameterfvEXT;
		nglTextureParameterfvEXT(texture, target, pname, param, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param pname   
	 * @param param   
	 */
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

	/** JNI method for {@link #glTextureImage1DEXT TextureImage1DEXT} */
	@JavadocExclude
	public static native void nglTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glTextureImage1DEXT TextureImage1DEXT} */
	@JavadocExclude
	public static void nglTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureImage1DEXT;
		nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param width          
	 * @param border         
	 * @param format         
	 * @param type           
	 * @param pixels         
	 */
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

	/** JNI method for {@link #glTextureImage2DEXT TextureImage2DEXT} */
	@JavadocExclude
	public static native void nglTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glTextureImage2DEXT TextureImage2DEXT} */
	@JavadocExclude
	public static void nglTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureImage2DEXT;
		nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param width          
	 * @param height         
	 * @param border         
	 * @param format         
	 * @param type           
	 * @param pixels         
	 */
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

	/** JNI method for {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
	@JavadocExclude
	public static native void nglTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
	@JavadocExclude
	public static void nglTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureSubImage1DEXT;
		nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param level   
	 * @param xoffset 
	 * @param width   
	 * @param format  
	 * @param type    
	 * @param pixels  
	 */
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

	/** JNI method for {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
	@JavadocExclude
	public static native void nglTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
	@JavadocExclude
	public static void nglTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureSubImage2DEXT;
		nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param level   
	 * @param xoffset 
	 * @param yoffset 
	 * @param width   
	 * @param height  
	 * @param format  
	 * @param type    
	 * @param pixels  
	 */
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

	/** JNI method for {@link #glCopyTextureImage1DEXT CopyTextureImage1DEXT} */
	@JavadocExclude
	public static native void nglCopyTextureImage1DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int border, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param x              
	 * @param y              
	 * @param width          
	 * @param border         
	 */
	public static void glCopyTextureImage1DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int border) {
		long __functionAddress = getInstance().CopyTextureImage1DEXT;
		nglCopyTextureImage1DEXT(texture, target, level, internalformat, x, y, width, border, __functionAddress);
	}

	// --- [ glCopyTextureImage2DEXT ] ---

	/** JNI method for {@link #glCopyTextureImage2DEXT CopyTextureImage2DEXT} */
	@JavadocExclude
	public static native void nglCopyTextureImage2DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int height, int border, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param x              
	 * @param y              
	 * @param width          
	 * @param height         
	 * @param border         
	 */
	public static void glCopyTextureImage2DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int height, int border) {
		long __functionAddress = getInstance().CopyTextureImage2DEXT;
		nglCopyTextureImage2DEXT(texture, target, level, internalformat, x, y, width, height, border, __functionAddress);
	}

	// --- [ glCopyTextureSubImage1DEXT ] ---

	/** JNI method for {@link #glCopyTextureSubImage1DEXT CopyTextureSubImage1DEXT} */
	@JavadocExclude
	public static native void nglCopyTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int x, int y, int width, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param level   
	 * @param xoffset 
	 * @param x       
	 * @param y       
	 * @param width   
	 */
	public static void glCopyTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int x, int y, int width) {
		long __functionAddress = getInstance().CopyTextureSubImage1DEXT;
		nglCopyTextureSubImage1DEXT(texture, target, level, xoffset, x, y, width, __functionAddress);
	}

	// --- [ glCopyTextureSubImage2DEXT ] ---

	/** JNI method for {@link #glCopyTextureSubImage2DEXT CopyTextureSubImage2DEXT} */
	@JavadocExclude
	public static native void nglCopyTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param level   
	 * @param xoffset 
	 * @param yoffset 
	 * @param x       
	 * @param y       
	 * @param width   
	 * @param height  
	 */
	public static void glCopyTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().CopyTextureSubImage2DEXT;
		nglCopyTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, x, y, width, height, __functionAddress);
	}

	// --- [ glGetTextureImageEXT ] ---

	/** JNI method for {@link #glGetTextureImageEXT GetTextureImageEXT} */
	@JavadocExclude
	public static native void nglGetTextureImageEXT(int texture, int target, int level, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureImageEXT GetTextureImageEXT} */
	@JavadocExclude
	public static void nglGetTextureImageEXT(int texture, int target, int level, int format, int type, long pixels) {
		long __functionAddress = getInstance().GetTextureImageEXT;
		nglGetTextureImageEXT(texture, target, level, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param level   
	 * @param format  
	 * @param type    
	 * @param pixels  
	 */
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

	/** JNI method for {@link #glGetTextureParameterfvEXT GetTextureParameterfvEXT} */
	@JavadocExclude
	public static native void nglGetTextureParameterfvEXT(int texture, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureParameterfvEXT GetTextureParameterfvEXT} */
	@JavadocExclude
	public static void nglGetTextureParameterfvEXT(int texture, int target, int pname, long params) {
		long __functionAddress = getInstance().GetTextureParameterfvEXT;
		nglGetTextureParameterfvEXT(texture, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetTextureParameterivEXT GetTextureParameterivEXT} */
	@JavadocExclude
	public static native void nglGetTextureParameterivEXT(int texture, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureParameterivEXT GetTextureParameterivEXT} */
	@JavadocExclude
	public static void nglGetTextureParameterivEXT(int texture, int target, int pname, long params) {
		long __functionAddress = getInstance().GetTextureParameterivEXT;
		nglGetTextureParameterivEXT(texture, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetTextureLevelParameterfvEXT GetTextureLevelParameterfvEXT} */
	@JavadocExclude
	public static native void nglGetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureLevelParameterfvEXT GetTextureLevelParameterfvEXT} */
	@JavadocExclude
	public static void nglGetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, long params) {
		long __functionAddress = getInstance().GetTextureLevelParameterfvEXT;
		nglGetTextureLevelParameterfvEXT(texture, target, level, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param level   
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetTextureLevelParameterivEXT GetTextureLevelParameterivEXT} */
	@JavadocExclude
	public static native void nglGetTextureLevelParameterivEXT(int texture, int target, int level, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureLevelParameterivEXT GetTextureLevelParameterivEXT} */
	@JavadocExclude
	public static void nglGetTextureLevelParameterivEXT(int texture, int target, int level, int pname, long params) {
		long __functionAddress = getInstance().GetTextureLevelParameterivEXT;
		nglGetTextureLevelParameterivEXT(texture, target, level, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param level   
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glTextureImage3DEXT TextureImage3DEXT} */
	@JavadocExclude
	public static native void nglTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glTextureImage3DEXT TextureImage3DEXT} */
	@JavadocExclude
	public static void nglTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param width          
	 * @param height         
	 * @param depth          
	 * @param border         
	 * @param format         
	 * @param type           
	 * @param pixels         
	 */
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

	/** JNI method for {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
	@JavadocExclude
	public static native void nglTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
	@JavadocExclude
	public static void nglTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureSubImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param level   
	 * @param xoffset 
	 * @param yoffset 
	 * @param zoffset 
	 * @param width   
	 * @param height  
	 * @param depth   
	 * @param format  
	 * @param type    
	 * @param pixels  
	 */
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

	/** JNI method for {@link #glCopyTextureSubImage3DEXT CopyTextureSubImage3DEXT} */
	@JavadocExclude
	public static native void nglCopyTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param level   
	 * @param xoffset 
	 * @param yoffset 
	 * @param zoffset 
	 * @param x       
	 * @param y       
	 * @param width   
	 * @param height  
	 */
	public static void glCopyTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().CopyTextureSubImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, x, y, width, height, __functionAddress);
	}

	// --- [ glBindMultiTextureEXT ] ---

	/** JNI method for {@link #glBindMultiTextureEXT BindMultiTextureEXT} */
	@JavadocExclude
	public static native void nglBindMultiTextureEXT(int texunit, int target, int texture, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param texture 
	 */
	public static void glBindMultiTextureEXT(int texunit, int target, int texture) {
		long __functionAddress = getInstance().BindMultiTextureEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindMultiTextureEXT(texunit, target, texture, __functionAddress);
	}

	// --- [ glMultiTexCoordPointerEXT ] ---

	/** JNI method for {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
	@JavadocExclude
	public static native void nglMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
	@JavadocExclude
	public static void nglMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, long pointer) {
		long __functionAddress = getInstance().MultiTexCoordPointerEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoordPointerEXT(texunit, size, type, stride, pointer, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param size    
	 * @param type    
	 * @param stride  
	 * @param pointer 
	 */
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

	/** GL_HALF_FLOAT version of: {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
	public static void glMultiTexCoordPointerEXT(int texunit, int size, int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglMultiTexCoordPointerEXT(texunit, size, GL30.GL_HALF_FLOAT, stride, memAddress(pointer));
	}

	/** GL_FLOAT version of: {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
	public static void glMultiTexCoordPointerEXT(int texunit, int size, int stride, FloatBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglMultiTexCoordPointerEXT(texunit, size, GL11.GL_FLOAT, stride, memAddress(pointer));
	}

	// --- [ glMultiTexEnvfEXT ] ---

	/** JNI method for {@link #glMultiTexEnvfEXT MultiTexEnvfEXT} */
	@JavadocExclude
	public static native void nglMultiTexEnvfEXT(int texunit, int target, int pname, float param, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param param   
	 */
	public static void glMultiTexEnvfEXT(int texunit, int target, int pname, float param) {
		long __functionAddress = getInstance().MultiTexEnvfEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexEnvfEXT(texunit, target, pname, param, __functionAddress);
	}

	// --- [ glMultiTexEnvfvEXT ] ---

	/** JNI method for {@link #glMultiTexEnvfvEXT MultiTexEnvfvEXT} */
	@JavadocExclude
	public static native void nglMultiTexEnvfvEXT(int texunit, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexEnvfvEXT MultiTexEnvfvEXT} */
	@JavadocExclude
	public static void nglMultiTexEnvfvEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().MultiTexEnvfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexEnvfvEXT(texunit, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glMultiTexEnviEXT MultiTexEnviEXT} */
	@JavadocExclude
	public static native void nglMultiTexEnviEXT(int texunit, int target, int pname, int param, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param param   
	 */
	public static void glMultiTexEnviEXT(int texunit, int target, int pname, int param) {
		long __functionAddress = getInstance().MultiTexEnviEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexEnviEXT(texunit, target, pname, param, __functionAddress);
	}

	// --- [ glMultiTexEnvivEXT ] ---

	/** JNI method for {@link #glMultiTexEnvivEXT MultiTexEnvivEXT} */
	@JavadocExclude
	public static native void nglMultiTexEnvivEXT(int texunit, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexEnvivEXT MultiTexEnvivEXT} */
	@JavadocExclude
	public static void nglMultiTexEnvivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().MultiTexEnvivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexEnvivEXT(texunit, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glMultiTexGendEXT MultiTexGendEXT} */
	@JavadocExclude
	public static native void nglMultiTexGendEXT(int texunit, int coord, int pname, double param, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit 
	 * @param coord   
	 * @param pname   
	 * @param param   
	 */
	public static void glMultiTexGendEXT(int texunit, int coord, int pname, double param) {
		long __functionAddress = getInstance().MultiTexGendEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexGendEXT(texunit, coord, pname, param, __functionAddress);
	}

	// --- [ glMultiTexGendvEXT ] ---

	/** JNI method for {@link #glMultiTexGendvEXT MultiTexGendvEXT} */
	@JavadocExclude
	public static native void nglMultiTexGendvEXT(int texunit, int coord, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexGendvEXT MultiTexGendvEXT} */
	@JavadocExclude
	public static void nglMultiTexGendvEXT(int texunit, int coord, int pname, long params) {
		long __functionAddress = getInstance().MultiTexGendvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexGendvEXT(texunit, coord, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param coord   
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glMultiTexGenfEXT MultiTexGenfEXT} */
	@JavadocExclude
	public static native void nglMultiTexGenfEXT(int texunit, int coord, int pname, float param, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit 
	 * @param coord   
	 * @param pname   
	 * @param param   
	 */
	public static void glMultiTexGenfEXT(int texunit, int coord, int pname, float param) {
		long __functionAddress = getInstance().MultiTexGenfEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexGenfEXT(texunit, coord, pname, param, __functionAddress);
	}

	// --- [ glMultiTexGenfvEXT ] ---

	/** JNI method for {@link #glMultiTexGenfvEXT MultiTexGenfvEXT} */
	@JavadocExclude
	public static native void nglMultiTexGenfvEXT(int texunit, int coord, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexGenfvEXT MultiTexGenfvEXT} */
	@JavadocExclude
	public static void nglMultiTexGenfvEXT(int texunit, int coord, int pname, long params) {
		long __functionAddress = getInstance().MultiTexGenfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexGenfvEXT(texunit, coord, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param coord   
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glMultiTexGeniEXT MultiTexGeniEXT} */
	@JavadocExclude
	public static native void nglMultiTexGeniEXT(int texunit, int coord, int pname, int param, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit 
	 * @param coord   
	 * @param pname   
	 * @param param   
	 */
	public static void glMultiTexGeniEXT(int texunit, int coord, int pname, int param) {
		long __functionAddress = getInstance().MultiTexGeniEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexGeniEXT(texunit, coord, pname, param, __functionAddress);
	}

	// --- [ glMultiTexGenivEXT ] ---

	/** JNI method for {@link #glMultiTexGenivEXT MultiTexGenivEXT} */
	@JavadocExclude
	public static native void nglMultiTexGenivEXT(int texunit, int coord, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexGenivEXT MultiTexGenivEXT} */
	@JavadocExclude
	public static void nglMultiTexGenivEXT(int texunit, int coord, int pname, long params) {
		long __functionAddress = getInstance().MultiTexGenivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexGenivEXT(texunit, coord, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param coord   
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetMultiTexEnvfvEXT GetMultiTexEnvfvEXT} */
	@JavadocExclude
	public static native void nglGetMultiTexEnvfvEXT(int texunit, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetMultiTexEnvfvEXT GetMultiTexEnvfvEXT} */
	@JavadocExclude
	public static void nglGetMultiTexEnvfvEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexEnvfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMultiTexEnvfvEXT(texunit, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetMultiTexEnvivEXT GetMultiTexEnvivEXT} */
	@JavadocExclude
	public static native void nglGetMultiTexEnvivEXT(int texunit, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetMultiTexEnvivEXT GetMultiTexEnvivEXT} */
	@JavadocExclude
	public static void nglGetMultiTexEnvivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexEnvivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMultiTexEnvivEXT(texunit, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetMultiTexGendvEXT GetMultiTexGendvEXT} */
	@JavadocExclude
	public static native void nglGetMultiTexGendvEXT(int texunit, int coord, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetMultiTexGendvEXT GetMultiTexGendvEXT} */
	@JavadocExclude
	public static void nglGetMultiTexGendvEXT(int texunit, int coord, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexGendvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMultiTexGendvEXT(texunit, coord, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param coord   
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetMultiTexGenfvEXT GetMultiTexGenfvEXT} */
	@JavadocExclude
	public static native void nglGetMultiTexGenfvEXT(int texunit, int coord, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetMultiTexGenfvEXT GetMultiTexGenfvEXT} */
	@JavadocExclude
	public static void nglGetMultiTexGenfvEXT(int texunit, int coord, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexGenfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMultiTexGenfvEXT(texunit, coord, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param coord   
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetMultiTexGenivEXT GetMultiTexGenivEXT} */
	@JavadocExclude
	public static native void nglGetMultiTexGenivEXT(int texunit, int coord, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetMultiTexGenivEXT GetMultiTexGenivEXT} */
	@JavadocExclude
	public static void nglGetMultiTexGenivEXT(int texunit, int coord, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexGenivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMultiTexGenivEXT(texunit, coord, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param coord   
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glMultiTexParameteriEXT MultiTexParameteriEXT} */
	@JavadocExclude
	public static native void nglMultiTexParameteriEXT(int texunit, int target, int pname, int param, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param param   
	 */
	public static void glMultiTexParameteriEXT(int texunit, int target, int pname, int param) {
		long __functionAddress = getInstance().MultiTexParameteriEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexParameteriEXT(texunit, target, pname, param, __functionAddress);
	}

	// --- [ glMultiTexParameterivEXT ] ---

	/** JNI method for {@link #glMultiTexParameterivEXT MultiTexParameterivEXT} */
	@JavadocExclude
	public static native void nglMultiTexParameterivEXT(int texunit, int target, int pname, long param, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexParameterivEXT MultiTexParameterivEXT} */
	@JavadocExclude
	public static void nglMultiTexParameterivEXT(int texunit, int target, int pname, long param) {
		long __functionAddress = getInstance().MultiTexParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexParameterivEXT(texunit, target, pname, param, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param param   
	 */
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

	/** JNI method for {@link #glMultiTexParameterfEXT MultiTexParameterfEXT} */
	@JavadocExclude
	public static native void nglMultiTexParameterfEXT(int texunit, int target, int pname, float param, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param param   
	 */
	public static void glMultiTexParameterfEXT(int texunit, int target, int pname, float param) {
		long __functionAddress = getInstance().MultiTexParameterfEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexParameterfEXT(texunit, target, pname, param, __functionAddress);
	}

	// --- [ glMultiTexParameterfvEXT ] ---

	/** JNI method for {@link #glMultiTexParameterfvEXT MultiTexParameterfvEXT} */
	@JavadocExclude
	public static native void nglMultiTexParameterfvEXT(int texunit, int target, int pname, long param, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexParameterfvEXT MultiTexParameterfvEXT} */
	@JavadocExclude
	public static void nglMultiTexParameterfvEXT(int texunit, int target, int pname, long param) {
		long __functionAddress = getInstance().MultiTexParameterfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexParameterfvEXT(texunit, target, pname, param, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param param   
	 */
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

	/** JNI method for {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
	@JavadocExclude
	public static native void nglMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
	@JavadocExclude
	public static void nglMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().MultiTexImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param width          
	 * @param border         
	 * @param format         
	 * @param type           
	 * @param pixels         
	 */
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

	/** JNI method for {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
	@JavadocExclude
	public static native void nglMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
	@JavadocExclude
	public static void nglMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().MultiTexImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param width          
	 * @param height         
	 * @param border         
	 * @param format         
	 * @param type           
	 * @param pixels         
	 */
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

	/** JNI method for {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
	@JavadocExclude
	public static native void nglMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
	@JavadocExclude
	public static void nglMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, long pixels) {
		long __functionAddress = getInstance().MultiTexSubImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param level   
	 * @param xoffset 
	 * @param width   
	 * @param format  
	 * @param type    
	 * @param pixels  
	 */
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

	/** JNI method for {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
	@JavadocExclude
	public static native void nglMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
	@JavadocExclude
	public static void nglMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
		long __functionAddress = getInstance().MultiTexSubImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param level   
	 * @param xoffset 
	 * @param yoffset 
	 * @param width   
	 * @param height  
	 * @param format  
	 * @param type    
	 * @param pixels  
	 */
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

	/** JNI method for {@link #glCopyMultiTexImage1DEXT CopyMultiTexImage1DEXT} */
	@JavadocExclude
	public static native void nglCopyMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int border, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param x              
	 * @param y              
	 * @param width          
	 * @param border         
	 */
	public static void glCopyMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int border) {
		long __functionAddress = getInstance().CopyMultiTexImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyMultiTexImage1DEXT(texunit, target, level, internalformat, x, y, width, border, __functionAddress);
	}

	// --- [ glCopyMultiTexImage2DEXT ] ---

	/** JNI method for {@link #glCopyMultiTexImage2DEXT CopyMultiTexImage2DEXT} */
	@JavadocExclude
	public static native void nglCopyMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int height, int border, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param x              
	 * @param y              
	 * @param width          
	 * @param height         
	 * @param border         
	 */
	public static void glCopyMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int height, int border) {
		long __functionAddress = getInstance().CopyMultiTexImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyMultiTexImage2DEXT(texunit, target, level, internalformat, x, y, width, height, border, __functionAddress);
	}

	// --- [ glCopyMultiTexSubImage1DEXT ] ---

	/** JNI method for {@link #glCopyMultiTexSubImage1DEXT CopyMultiTexSubImage1DEXT} */
	@JavadocExclude
	public static native void nglCopyMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int x, int y, int width, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param level   
	 * @param xoffset 
	 * @param x       
	 * @param y       
	 * @param width   
	 */
	public static void glCopyMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int x, int y, int width) {
		long __functionAddress = getInstance().CopyMultiTexSubImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyMultiTexSubImage1DEXT(texunit, target, level, xoffset, x, y, width, __functionAddress);
	}

	// --- [ glCopyMultiTexSubImage2DEXT ] ---

	/** JNI method for {@link #glCopyMultiTexSubImage2DEXT CopyMultiTexSubImage2DEXT} */
	@JavadocExclude
	public static native void nglCopyMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param level   
	 * @param xoffset 
	 * @param yoffset 
	 * @param x       
	 * @param y       
	 * @param width   
	 * @param height  
	 */
	public static void glCopyMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().CopyMultiTexSubImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, x, y, width, height, __functionAddress);
	}

	// --- [ glGetMultiTexImageEXT ] ---

	/** JNI method for {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
	@JavadocExclude
	public static native void nglGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
	@JavadocExclude
	public static void nglGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, long pixels) {
		long __functionAddress = getInstance().GetMultiTexImageEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMultiTexImageEXT(texunit, target, level, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param level   
	 * @param format  
	 * @param type    
	 * @param pixels  
	 */
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

	/** JNI method for {@link #glGetMultiTexParameterfvEXT GetMultiTexParameterfvEXT} */
	@JavadocExclude
	public static native void nglGetMultiTexParameterfvEXT(int texunit, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetMultiTexParameterfvEXT GetMultiTexParameterfvEXT} */
	@JavadocExclude
	public static void nglGetMultiTexParameterfvEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexParameterfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMultiTexParameterfvEXT(texunit, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetMultiTexParameterivEXT GetMultiTexParameterivEXT} */
	@JavadocExclude
	public static native void nglGetMultiTexParameterivEXT(int texunit, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetMultiTexParameterivEXT GetMultiTexParameterivEXT} */
	@JavadocExclude
	public static void nglGetMultiTexParameterivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMultiTexParameterivEXT(texunit, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetMultiTexLevelParameterfvEXT GetMultiTexLevelParameterfvEXT} */
	@JavadocExclude
	public static native void nglGetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetMultiTexLevelParameterfvEXT GetMultiTexLevelParameterfvEXT} */
	@JavadocExclude
	public static void nglGetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexLevelParameterfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param level   
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetMultiTexLevelParameterivEXT GetMultiTexLevelParameterivEXT} */
	@JavadocExclude
	public static native void nglGetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetMultiTexLevelParameterivEXT GetMultiTexLevelParameterivEXT} */
	@JavadocExclude
	public static void nglGetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexLevelParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param level   
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
	@JavadocExclude
	public static native void nglMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
	@JavadocExclude
	public static void nglMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().MultiTexImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param width          
	 * @param height         
	 * @param depth          
	 * @param border         
	 * @param format         
	 * @param type           
	 * @param pixels         
	 */
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

	/** JNI method for {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
	@JavadocExclude
	public static native void nglMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
	@JavadocExclude
	public static void nglMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		long __functionAddress = getInstance().MultiTexSubImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param level   
	 * @param xoffset 
	 * @param yoffset 
	 * @param zoffset 
	 * @param width   
	 * @param height  
	 * @param depth   
	 * @param format  
	 * @param type    
	 * @param pixels  
	 */
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

	/** JNI method for {@link #glCopyMultiTexSubImage3DEXT CopyMultiTexSubImage3DEXT} */
	@JavadocExclude
	public static native void nglCopyMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param level   
	 * @param xoffset 
	 * @param yoffset 
	 * @param zoffset 
	 * @param x       
	 * @param y       
	 * @param width   
	 * @param height  
	 */
	public static void glCopyMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().CopyMultiTexSubImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, x, y, width, height, __functionAddress);
	}

	// --- [ glEnableClientStateIndexedEXT ] ---

	/** JNI method for {@link #glEnableClientStateIndexedEXT EnableClientStateIndexedEXT} */
	@JavadocExclude
	public static native void nglEnableClientStateIndexedEXT(int array, int index, long __functionAddress);

	/**
	 * 
	 *
	 * @param array 
	 * @param index 
	 */
	public static void glEnableClientStateIndexedEXT(int array, int index) {
		long __functionAddress = getInstance().EnableClientStateIndexedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEnableClientStateIndexedEXT(array, index, __functionAddress);
	}

	// --- [ glDisableClientStateIndexedEXT ] ---

	/** JNI method for {@link #glDisableClientStateIndexedEXT DisableClientStateIndexedEXT} */
	@JavadocExclude
	public static native void nglDisableClientStateIndexedEXT(int array, int index, long __functionAddress);

	/**
	 * 
	 *
	 * @param array 
	 * @param index 
	 */
	public static void glDisableClientStateIndexedEXT(int array, int index) {
		long __functionAddress = getInstance().DisableClientStateIndexedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDisableClientStateIndexedEXT(array, index, __functionAddress);
	}

	// --- [ glEnableClientStateiEXT ] ---

	/** JNI method for {@link #glEnableClientStateiEXT EnableClientStateiEXT} */
	@JavadocExclude
	public static native void nglEnableClientStateiEXT(int array, int index, long __functionAddress);

	/**
	 * 
	 *
	 * @param array 
	 * @param index 
	 */
	public static void glEnableClientStateiEXT(int array, int index) {
		long __functionAddress = getInstance().EnableClientStateiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEnableClientStateiEXT(array, index, __functionAddress);
	}

	// --- [ glDisableClientStateiEXT ] ---

	/** JNI method for {@link #glDisableClientStateiEXT DisableClientStateiEXT} */
	@JavadocExclude
	public static native void nglDisableClientStateiEXT(int array, int index, long __functionAddress);

	/**
	 * 
	 *
	 * @param array 
	 * @param index 
	 */
	public static void glDisableClientStateiEXT(int array, int index) {
		long __functionAddress = getInstance().DisableClientStateiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDisableClientStateiEXT(array, index, __functionAddress);
	}

	// --- [ glGetFloatIndexedvEXT ] ---

	/** JNI method for {@link #glGetFloatIndexedvEXT GetFloatIndexedvEXT} */
	@JavadocExclude
	public static native void nglGetFloatIndexedvEXT(int target, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetFloatIndexedvEXT GetFloatIndexedvEXT} */
	@JavadocExclude
	public static void nglGetFloatIndexedvEXT(int target, int index, long params) {
		long __functionAddress = getInstance().GetFloatIndexedvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetFloatIndexedvEXT(target, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param index  
	 * @param params 
	 */
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

	/** JNI method for {@link #glGetDoubleIndexedvEXT GetDoubleIndexedvEXT} */
	@JavadocExclude
	public static native void nglGetDoubleIndexedvEXT(int target, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetDoubleIndexedvEXT GetDoubleIndexedvEXT} */
	@JavadocExclude
	public static void nglGetDoubleIndexedvEXT(int target, int index, long params) {
		long __functionAddress = getInstance().GetDoubleIndexedvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetDoubleIndexedvEXT(target, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param index  
	 * @param params 
	 */
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

	/** JNI method for {@link #glGetPointerIndexedvEXT GetPointerIndexedvEXT} */
	@JavadocExclude
	public static native void nglGetPointerIndexedvEXT(int target, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetPointerIndexedvEXT GetPointerIndexedvEXT} */
	@JavadocExclude
	public static void nglGetPointerIndexedvEXT(int target, int index, long params) {
		long __functionAddress = getInstance().GetPointerIndexedvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetPointerIndexedvEXT(target, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param index  
	 * @param params 
	 */
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

	/** JNI method for {@link #glGetFloati_vEXT GetFloati_vEXT} */
	@JavadocExclude
	public static native void nglGetFloati_vEXT(int pname, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetFloati_vEXT GetFloati_vEXT} */
	@JavadocExclude
	public static void nglGetFloati_vEXT(int pname, int index, long params) {
		long __functionAddress = getInstance().GetFloati_vEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetFloati_vEXT(pname, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param pname  
	 * @param index  
	 * @param params 
	 */
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

	/** JNI method for {@link #glGetDoublei_vEXT GetDoublei_vEXT} */
	@JavadocExclude
	public static native void nglGetDoublei_vEXT(int pname, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetDoublei_vEXT GetDoublei_vEXT} */
	@JavadocExclude
	public static void nglGetDoublei_vEXT(int pname, int index, long params) {
		long __functionAddress = getInstance().GetDoublei_vEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetDoublei_vEXT(pname, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param pname  
	 * @param index  
	 * @param params 
	 */
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

	/** JNI method for {@link #glGetPointeri_vEXT GetPointeri_vEXT} */
	@JavadocExclude
	public static native void nglGetPointeri_vEXT(int pname, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetPointeri_vEXT GetPointeri_vEXT} */
	@JavadocExclude
	public static void nglGetPointeri_vEXT(int pname, int index, long params) {
		long __functionAddress = getInstance().GetPointeri_vEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetPointeri_vEXT(pname, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param pname  
	 * @param index  
	 * @param params 
	 */
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

	/** JNI method for {@link #glEnableIndexedEXT EnableIndexedEXT} */
	@JavadocExclude
	public static native void nglEnableIndexedEXT(int cap, int index, long __functionAddress);

	/**
	 * 
	 *
	 * @param cap   
	 * @param index 
	 */
	public static void glEnableIndexedEXT(int cap, int index) {
		long __functionAddress = getInstance().EnableIndexedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEnableIndexedEXT(cap, index, __functionAddress);
	}

	// --- [ glDisableIndexedEXT ] ---

	/** JNI method for {@link #glDisableIndexedEXT DisableIndexedEXT} */
	@JavadocExclude
	public static native void nglDisableIndexedEXT(int cap, int index, long __functionAddress);

	/**
	 * 
	 *
	 * @param cap   
	 * @param index 
	 */
	public static void glDisableIndexedEXT(int cap, int index) {
		long __functionAddress = getInstance().DisableIndexedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDisableIndexedEXT(cap, index, __functionAddress);
	}

	// --- [ glIsEnabledIndexedEXT ] ---

	/** JNI method for {@link #glIsEnabledIndexedEXT IsEnabledIndexedEXT} */
	@JavadocExclude
	public static native boolean nglIsEnabledIndexedEXT(int target, int index, long __functionAddress);

	/**
	 * 
	 *
	 * @param target 
	 * @param index  
	 */
	public static boolean glIsEnabledIndexedEXT(int target, int index) {
		long __functionAddress = getInstance().IsEnabledIndexedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsEnabledIndexedEXT(target, index, __functionAddress);
	}

	// --- [ glGetIntegerIndexedvEXT ] ---

	/** JNI method for {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
	@JavadocExclude
	public static native void nglGetIntegerIndexedvEXT(int target, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
	@JavadocExclude
	public static void nglGetIntegerIndexedvEXT(int target, int index, long params) {
		long __functionAddress = getInstance().GetIntegerIndexedvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetIntegerIndexedvEXT(target, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param index  
	 * @param params 
	 */
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

	/** JNI method for {@link #glGetBooleanIndexedvEXT GetBooleanIndexedvEXT} */
	@JavadocExclude
	public static native void nglGetBooleanIndexedvEXT(int target, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetBooleanIndexedvEXT GetBooleanIndexedvEXT} */
	@JavadocExclude
	public static void nglGetBooleanIndexedvEXT(int target, int index, long params) {
		long __functionAddress = getInstance().GetBooleanIndexedvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetBooleanIndexedvEXT(target, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param index  
	 * @param params 
	 */
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

	/** JNI method for {@link #glNamedProgramStringEXT NamedProgramStringEXT} */
	@JavadocExclude
	public static native void nglNamedProgramStringEXT(int program, int target, int format, int len, long string, long __functionAddress);

	/** Unsafe version of {@link #glNamedProgramStringEXT NamedProgramStringEXT} */
	@JavadocExclude
	public static void nglNamedProgramStringEXT(int program, int target, int format, int len, long string) {
		long __functionAddress = getInstance().NamedProgramStringEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedProgramStringEXT(program, target, format, len, string, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param format  
	 * @param len     
	 * @param string  
	 */
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

	/** JNI method for {@link #glNamedProgramLocalParameter4dEXT NamedProgramLocalParameter4dEXT} */
	@JavadocExclude
	public static native void nglNamedProgramLocalParameter4dEXT(int program, int target, int index, double x, double y, double z, double w, long __functionAddress);

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param x       
	 * @param y       
	 * @param z       
	 * @param w       
	 */
	public static void glNamedProgramLocalParameter4dEXT(int program, int target, int index, double x, double y, double z, double w) {
		long __functionAddress = getInstance().NamedProgramLocalParameter4dEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedProgramLocalParameter4dEXT(program, target, index, x, y, z, w, __functionAddress);
	}

	// --- [ glNamedProgramLocalParameter4dvEXT ] ---

	/** JNI method for {@link #glNamedProgramLocalParameter4dvEXT NamedProgramLocalParameter4dvEXT} */
	@JavadocExclude
	public static native void nglNamedProgramLocalParameter4dvEXT(int program, int target, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glNamedProgramLocalParameter4dvEXT NamedProgramLocalParameter4dvEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParameter4dvEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParameter4dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedProgramLocalParameter4dvEXT(program, target, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param params  
	 */
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

	/** JNI method for {@link #glNamedProgramLocalParameter4fEXT NamedProgramLocalParameter4fEXT} */
	@JavadocExclude
	public static native void nglNamedProgramLocalParameter4fEXT(int program, int target, int index, float x, float y, float z, float w, long __functionAddress);

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param x       
	 * @param y       
	 * @param z       
	 * @param w       
	 */
	public static void glNamedProgramLocalParameter4fEXT(int program, int target, int index, float x, float y, float z, float w) {
		long __functionAddress = getInstance().NamedProgramLocalParameter4fEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedProgramLocalParameter4fEXT(program, target, index, x, y, z, w, __functionAddress);
	}

	// --- [ glNamedProgramLocalParameter4fvEXT ] ---

	/** JNI method for {@link #glNamedProgramLocalParameter4fvEXT NamedProgramLocalParameter4fvEXT} */
	@JavadocExclude
	public static native void nglNamedProgramLocalParameter4fvEXT(int program, int target, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glNamedProgramLocalParameter4fvEXT NamedProgramLocalParameter4fvEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParameter4fvEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParameter4fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedProgramLocalParameter4fvEXT(program, target, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetNamedProgramLocalParameterdvEXT GetNamedProgramLocalParameterdvEXT} */
	@JavadocExclude
	public static native void nglGetNamedProgramLocalParameterdvEXT(int program, int target, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedProgramLocalParameterdvEXT GetNamedProgramLocalParameterdvEXT} */
	@JavadocExclude
	public static void nglGetNamedProgramLocalParameterdvEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().GetNamedProgramLocalParameterdvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetNamedProgramLocalParameterdvEXT(program, target, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetNamedProgramLocalParameterfvEXT GetNamedProgramLocalParameterfvEXT} */
	@JavadocExclude
	public static native void nglGetNamedProgramLocalParameterfvEXT(int program, int target, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedProgramLocalParameterfvEXT GetNamedProgramLocalParameterfvEXT} */
	@JavadocExclude
	public static void nglGetNamedProgramLocalParameterfvEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().GetNamedProgramLocalParameterfvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetNamedProgramLocalParameterfvEXT(program, target, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetNamedProgramivEXT GetNamedProgramivEXT} */
	@JavadocExclude
	public static native void nglGetNamedProgramivEXT(int program, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedProgramivEXT GetNamedProgramivEXT} */
	@JavadocExclude
	public static void nglGetNamedProgramivEXT(int program, int target, int pname, long params) {
		long __functionAddress = getInstance().GetNamedProgramivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetNamedProgramivEXT(program, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetNamedProgramStringEXT GetNamedProgramStringEXT} */
	@JavadocExclude
	public static native void nglGetNamedProgramStringEXT(int program, int target, int pname, long string, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedProgramStringEXT GetNamedProgramStringEXT} */
	@JavadocExclude
	public static void nglGetNamedProgramStringEXT(int program, int target, int pname, long string) {
		long __functionAddress = getInstance().GetNamedProgramStringEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetNamedProgramStringEXT(program, target, pname, string, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param pname   
	 * @param string  
	 */
	public static void glGetNamedProgramStringEXT(int program, int target, int pname, ByteBuffer string) {
		if ( LWJGLUtil.CHECKS )
			if ( LWJGLUtil.DEBUG )
				checkBuffer(string, glGetNamedProgramiEXT(program, target, ARBVertexProgram.GL_PROGRAM_LENGTH_ARB));
		nglGetNamedProgramStringEXT(program, target, pname, memAddress(string));
	}

	// --- [ glCompressedTextureImage3DEXT ] ---

	/** JNI method for {@link #glCompressedTextureImage3DEXT CompressedTextureImage3DEXT} */
	@JavadocExclude
	public static native void nglCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTextureImage3DEXT CompressedTextureImage3DEXT} */
	@JavadocExclude
	public static void nglCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, imageSize, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param width          
	 * @param height         
	 * @param depth          
	 * @param border         
	 * @param imageSize      
	 * @param data           
	 */
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

	/** JNI method for {@link #glCompressedTextureImage2DEXT CompressedTextureImage2DEXT} */
	@JavadocExclude
	public static native void nglCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTextureImage2DEXT CompressedTextureImage2DEXT} */
	@JavadocExclude
	public static void nglCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, imageSize, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param width          
	 * @param height         
	 * @param border         
	 * @param imageSize      
	 * @param data           
	 */
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

	/** JNI method for {@link #glCompressedTextureImage1DEXT CompressedTextureImage1DEXT} */
	@JavadocExclude
	public static native void nglCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTextureImage1DEXT CompressedTextureImage1DEXT} */
	@JavadocExclude
	public static void nglCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, imageSize, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param width          
	 * @param border         
	 * @param imageSize      
	 * @param data           
	 */
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

	/** JNI method for {@link #glCompressedTextureSubImage3DEXT CompressedTextureSubImage3DEXT} */
	@JavadocExclude
	public static native void nglCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTextureSubImage3DEXT CompressedTextureSubImage3DEXT} */
	@JavadocExclude
	public static void nglCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureSubImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture   
	 * @param target    
	 * @param level     
	 * @param xoffset   
	 * @param yoffset   
	 * @param zoffset   
	 * @param width     
	 * @param height    
	 * @param depth     
	 * @param format    
	 * @param imageSize 
	 * @param data      
	 */
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

	/** JNI method for {@link #glCompressedTextureSubImage2DEXT CompressedTextureSubImage2DEXT} */
	@JavadocExclude
	public static native void nglCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTextureSubImage2DEXT CompressedTextureSubImage2DEXT} */
	@JavadocExclude
	public static void nglCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureSubImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, imageSize, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture   
	 * @param target    
	 * @param level     
	 * @param xoffset   
	 * @param yoffset   
	 * @param width     
	 * @param height    
	 * @param format    
	 * @param imageSize 
	 * @param data      
	 */
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

	/** JNI method for {@link #glCompressedTextureSubImage1DEXT CompressedTextureSubImage1DEXT} */
	@JavadocExclude
	public static native void nglCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTextureSubImage1DEXT CompressedTextureSubImage1DEXT} */
	@JavadocExclude
	public static void nglCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureSubImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, imageSize, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture   
	 * @param target    
	 * @param level     
	 * @param xoffset   
	 * @param width     
	 * @param format    
	 * @param imageSize 
	 * @param data      
	 */
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

	/** JNI method for {@link #glGetCompressedTextureImageEXT GetCompressedTextureImageEXT} */
	@JavadocExclude
	public static native void nglGetCompressedTextureImageEXT(int texture, int target, int level, long img, long __functionAddress);

	/** Unsafe version of {@link #glGetCompressedTextureImageEXT GetCompressedTextureImageEXT} */
	@JavadocExclude
	public static void nglGetCompressedTextureImageEXT(int texture, int target, int level, long img) {
		long __functionAddress = getInstance().GetCompressedTextureImageEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetCompressedTextureImageEXT(texture, target, level, img, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param level   
	 * @param img     
	 */
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

	/** JNI method for {@link #glCompressedMultiTexImage3DEXT CompressedMultiTexImage3DEXT} */
	@JavadocExclude
	public static native void nglCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedMultiTexImage3DEXT CompressedMultiTexImage3DEXT} */
	@JavadocExclude
	public static void nglCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedMultiTexImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, imageSize, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param width          
	 * @param height         
	 * @param depth          
	 * @param border         
	 * @param imageSize      
	 * @param data           
	 */
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

	/** JNI method for {@link #glCompressedMultiTexImage2DEXT CompressedMultiTexImage2DEXT} */
	@JavadocExclude
	public static native void nglCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedMultiTexImage2DEXT CompressedMultiTexImage2DEXT} */
	@JavadocExclude
	public static void nglCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedMultiTexImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, imageSize, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param width          
	 * @param height         
	 * @param border         
	 * @param imageSize      
	 * @param data           
	 */
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

	/** JNI method for {@link #glCompressedMultiTexImage1DEXT CompressedMultiTexImage1DEXT} */
	@JavadocExclude
	public static native void nglCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedMultiTexImage1DEXT CompressedMultiTexImage1DEXT} */
	@JavadocExclude
	public static void nglCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedMultiTexImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, imageSize, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit        
	 * @param target         
	 * @param level          
	 * @param internalformat 
	 * @param width          
	 * @param border         
	 * @param imageSize      
	 * @param data           
	 */
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

	/** JNI method for {@link #glCompressedMultiTexSubImage3DEXT CompressedMultiTexSubImage3DEXT} */
	@JavadocExclude
	public static native void nglCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedMultiTexSubImage3DEXT CompressedMultiTexSubImage3DEXT} */
	@JavadocExclude
	public static void nglCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedMultiTexSubImage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit   
	 * @param target    
	 * @param level     
	 * @param xoffset   
	 * @param yoffset   
	 * @param zoffset   
	 * @param width     
	 * @param height    
	 * @param depth     
	 * @param format    
	 * @param imageSize 
	 * @param data      
	 */
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

	/** JNI method for {@link #glCompressedMultiTexSubImage2DEXT CompressedMultiTexSubImage2DEXT} */
	@JavadocExclude
	public static native void nglCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedMultiTexSubImage2DEXT CompressedMultiTexSubImage2DEXT} */
	@JavadocExclude
	public static void nglCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedMultiTexSubImage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, imageSize, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit   
	 * @param target    
	 * @param level     
	 * @param xoffset   
	 * @param yoffset   
	 * @param width     
	 * @param height    
	 * @param format    
	 * @param imageSize 
	 * @param data      
	 */
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

	/** JNI method for {@link #glCompressedMultiTexSubImage1DEXT CompressedMultiTexSubImage1DEXT} */
	@JavadocExclude
	public static native void nglCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedMultiTexSubImage1DEXT CompressedMultiTexSubImage1DEXT} */
	@JavadocExclude
	public static void nglCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedMultiTexSubImage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, imageSize, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit   
	 * @param target    
	 * @param level     
	 * @param xoffset   
	 * @param width     
	 * @param format    
	 * @param imageSize 
	 * @param data      
	 */
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

	/** JNI method for {@link #glGetCompressedMultiTexImageEXT GetCompressedMultiTexImageEXT} */
	@JavadocExclude
	public static native void nglGetCompressedMultiTexImageEXT(int texunit, int target, int level, long img, long __functionAddress);

	/** Unsafe version of {@link #glGetCompressedMultiTexImageEXT GetCompressedMultiTexImageEXT} */
	@JavadocExclude
	public static void nglGetCompressedMultiTexImageEXT(int texunit, int target, int level, long img) {
		long __functionAddress = getInstance().GetCompressedMultiTexImageEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetCompressedMultiTexImageEXT(texunit, target, level, img, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param level   
	 * @param img     
	 */
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

	/** JNI method for {@link #glMatrixLoadTransposefEXT MatrixLoadTransposefEXT} */
	@JavadocExclude
	public static native void nglMatrixLoadTransposefEXT(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixLoadTransposefEXT MatrixLoadTransposefEXT} */
	@JavadocExclude
	public static void nglMatrixLoadTransposefEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixLoadTransposefEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMatrixLoadTransposefEXT(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param m          
	 */
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

	/** JNI method for {@link #glMatrixLoadTransposedEXT MatrixLoadTransposedEXT} */
	@JavadocExclude
	public static native void nglMatrixLoadTransposedEXT(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixLoadTransposedEXT MatrixLoadTransposedEXT} */
	@JavadocExclude
	public static void nglMatrixLoadTransposedEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixLoadTransposedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMatrixLoadTransposedEXT(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param m          
	 */
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

	/** JNI method for {@link #glMatrixMultTransposefEXT MatrixMultTransposefEXT} */
	@JavadocExclude
	public static native void nglMatrixMultTransposefEXT(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixMultTransposefEXT MatrixMultTransposefEXT} */
	@JavadocExclude
	public static void nglMatrixMultTransposefEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixMultTransposefEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMatrixMultTransposefEXT(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param m          
	 */
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

	/** JNI method for {@link #glMatrixMultTransposedEXT MatrixMultTransposedEXT} */
	@JavadocExclude
	public static native void nglMatrixMultTransposedEXT(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixMultTransposedEXT MatrixMultTransposedEXT} */
	@JavadocExclude
	public static void nglMatrixMultTransposedEXT(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixMultTransposedEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMatrixMultTransposedEXT(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode 
	 * @param m          
	 */
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

	/** JNI method for {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
	@JavadocExclude
	public static native void nglNamedBufferDataEXT(int buffer, long size, long data, int usage, long __functionAddress);

	/** Unsafe version of {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
	@JavadocExclude
	public static void nglNamedBufferDataEXT(int buffer, long size, long data, int usage) {
		long __functionAddress = getInstance().NamedBufferDataEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedBufferDataEXT(buffer, size, data, usage, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param buffer 
	 * @param size   
	 * @param data   
	 * @param usage  
	 */
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

	/** JNI method for {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
	@JavadocExclude
	public static native void nglNamedBufferSubDataEXT(int buffer, long offset, long size, long data, long __functionAddress);

	/** Unsafe version of {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
	@JavadocExclude
	public static void nglNamedBufferSubDataEXT(int buffer, long offset, long size, long data) {
		long __functionAddress = getInstance().NamedBufferSubDataEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedBufferSubDataEXT(buffer, offset, size, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param buffer 
	 * @param offset 
	 * @param size   
	 * @param data   
	 */
	public static void glNamedBufferSubDataEXT(int buffer, long offset, long size, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, size);
		nglNamedBufferSubDataEXT(buffer, offset, size, memAddress(data));
	}

	/** ByteBuffer version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
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

	/** JNI method for {@link #glMapNamedBufferEXT MapNamedBufferEXT} */
	@JavadocExclude
	public static native long nglMapNamedBufferEXT(int buffer, int access, long __functionAddress);

	/** Unsafe version of {@link #glMapNamedBufferEXT MapNamedBufferEXT} */
	@JavadocExclude
	public static long nglMapNamedBufferEXT(int buffer, int access) {
		long __functionAddress = getInstance().MapNamedBufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglMapNamedBufferEXT(buffer, access, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param buffer 
	 * @param access 
	 */
	public static ByteBuffer glMapNamedBufferEXT(int buffer, int access) {
		long __result = nglMapNamedBufferEXT(buffer, access);
		return memByteBuffer(__result, (int)glGetNamedBufferParameteriEXT(buffer, GL15.GL_BUFFER_SIZE));
	}

	/** Alternative version of: {@link #glMapNamedBufferEXT MapNamedBufferEXT} */
	public static ByteBuffer glMapNamedBufferEXT(int buffer, int access, ByteBuffer old_buffer) {
		long __result = nglMapNamedBufferEXT(buffer, access);
		int length = glGetNamedBufferParameteriEXT(buffer, GL15.GL_BUFFER_SIZE);
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	/** Explicit size alternative version of: {@link #glMapNamedBufferEXT MapNamedBufferEXT} */
	public static ByteBuffer glMapNamedBufferEXT(int buffer, int access, long length, ByteBuffer old_buffer) {
		long __result = nglMapNamedBufferEXT(buffer, access);
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, (int)length);
	}

	// --- [ glUnmapNamedBufferEXT ] ---

	/** JNI method for {@link #glUnmapNamedBufferEXT UnmapNamedBufferEXT} */
	@JavadocExclude
	public static native boolean nglUnmapNamedBufferEXT(int buffer, long __functionAddress);

	/**
	 * 
	 *
	 * @param buffer 
	 */
	public static boolean glUnmapNamedBufferEXT(int buffer) {
		long __functionAddress = getInstance().UnmapNamedBufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglUnmapNamedBufferEXT(buffer, __functionAddress);
	}

	// --- [ glGetNamedBufferParameterivEXT ] ---

	/** JNI method for {@link #glGetNamedBufferParameterivEXT GetNamedBufferParameterivEXT} */
	@JavadocExclude
	public static native void nglGetNamedBufferParameterivEXT(int buffer, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedBufferParameterivEXT GetNamedBufferParameterivEXT} */
	@JavadocExclude
	public static void nglGetNamedBufferParameterivEXT(int buffer, int pname, long params) {
		long __functionAddress = getInstance().GetNamedBufferParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetNamedBufferParameterivEXT(buffer, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param buffer 
	 * @param pname  
	 * @param params 
	 */
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

	/** JNI method for {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
	@JavadocExclude
	public static native void nglGetNamedBufferSubDataEXT(int buffer, long offset, long size, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
	@JavadocExclude
	public static void nglGetNamedBufferSubDataEXT(int buffer, long offset, long size, long data) {
		long __functionAddress = getInstance().GetNamedBufferSubDataEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetNamedBufferSubDataEXT(buffer, offset, size, data, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param buffer 
	 * @param offset 
	 * @param size   
	 * @param data   
	 */
	public static void glGetNamedBufferSubDataEXT(int buffer, long offset, long size, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, size);
		nglGetNamedBufferSubDataEXT(buffer, offset, size, memAddress(data));
	}

	/** ByteBuffer version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
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

	/** JNI method for {@link #glProgramUniform1fEXT ProgramUniform1fEXT} */
	@JavadocExclude
	public static native void nglProgramUniform1fEXT(int program, int location, float v0, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param v0       
	 */
	public static void glProgramUniform1fEXT(int program, int location, float v0) {
		long __functionAddress = getInstance().ProgramUniform1fEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1fEXT(program, location, v0, __functionAddress);
	}

	// --- [ glProgramUniform2fEXT ] ---

	/** JNI method for {@link #glProgramUniform2fEXT ProgramUniform2fEXT} */
	@JavadocExclude
	public static native void nglProgramUniform2fEXT(int program, int location, float v0, float v1, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param v0       
	 * @param v1       
	 */
	public static void glProgramUniform2fEXT(int program, int location, float v0, float v1) {
		long __functionAddress = getInstance().ProgramUniform2fEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2fEXT(program, location, v0, v1, __functionAddress);
	}

	// --- [ glProgramUniform3fEXT ] ---

	/** JNI method for {@link #glProgramUniform3fEXT ProgramUniform3fEXT} */
	@JavadocExclude
	public static native void nglProgramUniform3fEXT(int program, int location, float v0, float v1, float v2, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param v0       
	 * @param v1       
	 * @param v2       
	 */
	public static void glProgramUniform3fEXT(int program, int location, float v0, float v1, float v2) {
		long __functionAddress = getInstance().ProgramUniform3fEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3fEXT(program, location, v0, v1, v2, __functionAddress);
	}

	// --- [ glProgramUniform4fEXT ] ---

	/** JNI method for {@link #glProgramUniform4fEXT ProgramUniform4fEXT} */
	@JavadocExclude
	public static native void nglProgramUniform4fEXT(int program, int location, float v0, float v1, float v2, float v3, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param v0       
	 * @param v1       
	 * @param v2       
	 * @param v3       
	 */
	public static void glProgramUniform4fEXT(int program, int location, float v0, float v1, float v2, float v3) {
		long __functionAddress = getInstance().ProgramUniform4fEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4fEXT(program, location, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glProgramUniform1iEXT ] ---

	/** JNI method for {@link #glProgramUniform1iEXT ProgramUniform1iEXT} */
	@JavadocExclude
	public static native void nglProgramUniform1iEXT(int program, int location, int v0, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param v0       
	 */
	public static void glProgramUniform1iEXT(int program, int location, int v0) {
		long __functionAddress = getInstance().ProgramUniform1iEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1iEXT(program, location, v0, __functionAddress);
	}

	// --- [ glProgramUniform2iEXT ] ---

	/** JNI method for {@link #glProgramUniform2iEXT ProgramUniform2iEXT} */
	@JavadocExclude
	public static native void nglProgramUniform2iEXT(int program, int location, int v0, int v1, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param v0       
	 * @param v1       
	 */
	public static void glProgramUniform2iEXT(int program, int location, int v0, int v1) {
		long __functionAddress = getInstance().ProgramUniform2iEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2iEXT(program, location, v0, v1, __functionAddress);
	}

	// --- [ glProgramUniform3iEXT ] ---

	/** JNI method for {@link #glProgramUniform3iEXT ProgramUniform3iEXT} */
	@JavadocExclude
	public static native void nglProgramUniform3iEXT(int program, int location, int v0, int v1, int v2, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param v0       
	 * @param v1       
	 * @param v2       
	 */
	public static void glProgramUniform3iEXT(int program, int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().ProgramUniform3iEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3iEXT(program, location, v0, v1, v2, __functionAddress);
	}

	// --- [ glProgramUniform4iEXT ] ---

	/** JNI method for {@link #glProgramUniform4iEXT ProgramUniform4iEXT} */
	@JavadocExclude
	public static native void nglProgramUniform4iEXT(int program, int location, int v0, int v1, int v2, int v3, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param v0       
	 * @param v1       
	 * @param v2       
	 * @param v3       
	 */
	public static void glProgramUniform4iEXT(int program, int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().ProgramUniform4iEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4iEXT(program, location, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glProgramUniform1fvEXT ] ---

	/** JNI method for {@link #glProgramUniform1fvEXT ProgramUniform1fvEXT} */
	@JavadocExclude
	public static native void nglProgramUniform1fvEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform1fvEXT ProgramUniform1fvEXT} */
	@JavadocExclude
	public static void nglProgramUniform1fvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1fvEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
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

	/** JNI method for {@link #glProgramUniform2fvEXT ProgramUniform2fvEXT} */
	@JavadocExclude
	public static native void nglProgramUniform2fvEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform2fvEXT ProgramUniform2fvEXT} */
	@JavadocExclude
	public static void nglProgramUniform2fvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2fvEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
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

	/** JNI method for {@link #glProgramUniform3fvEXT ProgramUniform3fvEXT} */
	@JavadocExclude
	public static native void nglProgramUniform3fvEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform3fvEXT ProgramUniform3fvEXT} */
	@JavadocExclude
	public static void nglProgramUniform3fvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3fvEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
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

	/** JNI method for {@link #glProgramUniform4fvEXT ProgramUniform4fvEXT} */
	@JavadocExclude
	public static native void nglProgramUniform4fvEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform4fvEXT ProgramUniform4fvEXT} */
	@JavadocExclude
	public static void nglProgramUniform4fvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4fvEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
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

	/** JNI method for {@link #glProgramUniform1ivEXT ProgramUniform1ivEXT} */
	@JavadocExclude
	public static native void nglProgramUniform1ivEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform1ivEXT ProgramUniform1ivEXT} */
	@JavadocExclude
	public static void nglProgramUniform1ivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1ivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1ivEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
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

	/** JNI method for {@link #glProgramUniform2ivEXT ProgramUniform2ivEXT} */
	@JavadocExclude
	public static native void nglProgramUniform2ivEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform2ivEXT ProgramUniform2ivEXT} */
	@JavadocExclude
	public static void nglProgramUniform2ivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2ivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2ivEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
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

	/** JNI method for {@link #glProgramUniform3ivEXT ProgramUniform3ivEXT} */
	@JavadocExclude
	public static native void nglProgramUniform3ivEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform3ivEXT ProgramUniform3ivEXT} */
	@JavadocExclude
	public static void nglProgramUniform3ivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3ivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3ivEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
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

	/** JNI method for {@link #glProgramUniform4ivEXT ProgramUniform4ivEXT} */
	@JavadocExclude
	public static native void nglProgramUniform4ivEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform4ivEXT ProgramUniform4ivEXT} */
	@JavadocExclude
	public static void nglProgramUniform4ivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4ivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4ivEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
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

	/** JNI method for {@link #glProgramUniformMatrix2fvEXT ProgramUniformMatrix2fvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix2fvEXT ProgramUniformMatrix2fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix2fvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program   
	 * @param location  
	 * @param count     
	 * @param transpose 
	 * @param value     
	 */
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

	/** JNI method for {@link #glProgramUniformMatrix3fvEXT ProgramUniformMatrix3fvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix3fvEXT ProgramUniformMatrix3fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix3fvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program   
	 * @param location  
	 * @param count     
	 * @param transpose 
	 * @param value     
	 */
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

	/** JNI method for {@link #glProgramUniformMatrix4fvEXT ProgramUniformMatrix4fvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix4fvEXT ProgramUniformMatrix4fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix4fvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program   
	 * @param location  
	 * @param count     
	 * @param transpose 
	 * @param value     
	 */
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

	/** JNI method for {@link #glProgramUniformMatrix2x3fvEXT ProgramUniformMatrix2x3fvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix2x3fvEXT ProgramUniformMatrix2x3fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x3fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix2x3fvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program   
	 * @param location  
	 * @param count     
	 * @param transpose 
	 * @param value     
	 */
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

	/** JNI method for {@link #glProgramUniformMatrix3x2fvEXT ProgramUniformMatrix3x2fvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix3x2fvEXT ProgramUniformMatrix3x2fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x2fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix3x2fvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program   
	 * @param location  
	 * @param count     
	 * @param transpose 
	 * @param value     
	 */
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

	/** JNI method for {@link #glProgramUniformMatrix2x4fvEXT ProgramUniformMatrix2x4fvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix2x4fvEXT ProgramUniformMatrix2x4fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x4fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix2x4fvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program   
	 * @param location  
	 * @param count     
	 * @param transpose 
	 * @param value     
	 */
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

	/** JNI method for {@link #glProgramUniformMatrix4x2fvEXT ProgramUniformMatrix4x2fvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix4x2fvEXT ProgramUniformMatrix4x2fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x2fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix4x2fvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program   
	 * @param location  
	 * @param count     
	 * @param transpose 
	 * @param value     
	 */
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

	/** JNI method for {@link #glProgramUniformMatrix3x4fvEXT ProgramUniformMatrix3x4fvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix3x4fvEXT ProgramUniformMatrix3x4fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x4fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix3x4fvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program   
	 * @param location  
	 * @param count     
	 * @param transpose 
	 * @param value     
	 */
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

	/** JNI method for {@link #glProgramUniformMatrix4x3fvEXT ProgramUniformMatrix4x3fvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix4x3fvEXT ProgramUniformMatrix4x3fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x3fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix4x3fvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program   
	 * @param location  
	 * @param count     
	 * @param transpose 
	 * @param value     
	 */
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

	/** JNI method for {@link #glTextureBufferEXT TextureBufferEXT} */
	@JavadocExclude
	public static native void nglTextureBufferEXT(int texture, int target, int internalformat, int buffer, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture        
	 * @param target         
	 * @param internalformat 
	 * @param buffer         
	 */
	public static void glTextureBufferEXT(int texture, int target, int internalformat, int buffer) {
		long __functionAddress = getInstance().TextureBufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTextureBufferEXT(texture, target, internalformat, buffer, __functionAddress);
	}

	// --- [ glMultiTexBufferEXT ] ---

	/** JNI method for {@link #glMultiTexBufferEXT MultiTexBufferEXT} */
	@JavadocExclude
	public static native void nglMultiTexBufferEXT(int texunit, int target, int internalformat, int buffer, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit        
	 * @param target         
	 * @param internalformat 
	 * @param buffer         
	 */
	public static void glMultiTexBufferEXT(int texunit, int target, int internalformat, int buffer) {
		long __functionAddress = getInstance().MultiTexBufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexBufferEXT(texunit, target, internalformat, buffer, __functionAddress);
	}

	// --- [ glTextureParameterIivEXT ] ---

	/** JNI method for {@link #glTextureParameterIivEXT TextureParameterIivEXT} */
	@JavadocExclude
	public static native void nglTextureParameterIivEXT(int texture, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTextureParameterIivEXT TextureParameterIivEXT} */
	@JavadocExclude
	public static void nglTextureParameterIivEXT(int texture, int target, int pname, long params) {
		long __functionAddress = getInstance().TextureParameterIivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTextureParameterIivEXT(texture, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glTextureParameterIuivEXT TextureParameterIuivEXT} */
	@JavadocExclude
	public static native void nglTextureParameterIuivEXT(int texture, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTextureParameterIuivEXT TextureParameterIuivEXT} */
	@JavadocExclude
	public static void nglTextureParameterIuivEXT(int texture, int target, int pname, long params) {
		long __functionAddress = getInstance().TextureParameterIuivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTextureParameterIuivEXT(texture, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetTextureParameterIivEXT GetTextureParameterIivEXT} */
	@JavadocExclude
	public static native void nglGetTextureParameterIivEXT(int texture, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureParameterIivEXT GetTextureParameterIivEXT} */
	@JavadocExclude
	public static void nglGetTextureParameterIivEXT(int texture, int target, int pname, long params) {
		long __functionAddress = getInstance().GetTextureParameterIivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetTextureParameterIivEXT(texture, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetTextureParameterIuivEXT GetTextureParameterIuivEXT} */
	@JavadocExclude
	public static native void nglGetTextureParameterIuivEXT(int texture, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureParameterIuivEXT GetTextureParameterIuivEXT} */
	@JavadocExclude
	public static void nglGetTextureParameterIuivEXT(int texture, int target, int pname, long params) {
		long __functionAddress = getInstance().GetTextureParameterIuivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetTextureParameterIuivEXT(texture, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glMultiTexParameterIivEXT MultiTexParameterIivEXT} */
	@JavadocExclude
	public static native void nglMultiTexParameterIivEXT(int texunit, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexParameterIivEXT MultiTexParameterIivEXT} */
	@JavadocExclude
	public static void nglMultiTexParameterIivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().MultiTexParameterIivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexParameterIivEXT(texunit, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glMultiTexParameterIuivEXT MultiTexParameterIuivEXT} */
	@JavadocExclude
	public static native void nglMultiTexParameterIuivEXT(int texunit, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexParameterIuivEXT MultiTexParameterIuivEXT} */
	@JavadocExclude
	public static void nglMultiTexParameterIuivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().MultiTexParameterIuivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexParameterIuivEXT(texunit, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetMultiTexParameterIivEXT GetMultiTexParameterIivEXT} */
	@JavadocExclude
	public static native void nglGetMultiTexParameterIivEXT(int texunit, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetMultiTexParameterIivEXT GetMultiTexParameterIivEXT} */
	@JavadocExclude
	public static void nglGetMultiTexParameterIivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexParameterIivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMultiTexParameterIivEXT(texunit, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetMultiTexParameterIuivEXT GetMultiTexParameterIuivEXT} */
	@JavadocExclude
	public static native void nglGetMultiTexParameterIuivEXT(int texunit, int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetMultiTexParameterIuivEXT GetMultiTexParameterIuivEXT} */
	@JavadocExclude
	public static void nglGetMultiTexParameterIuivEXT(int texunit, int target, int pname, long params) {
		long __functionAddress = getInstance().GetMultiTexParameterIuivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMultiTexParameterIuivEXT(texunit, target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 * @param pname   
	 * @param params  
	 */
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

	/** JNI method for {@link #glProgramUniform1uiEXT ProgramUniform1uiEXT} */
	@JavadocExclude
	public static native void nglProgramUniform1uiEXT(int program, int location, int v0, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param v0       
	 */
	public static void glProgramUniform1uiEXT(int program, int location, int v0) {
		long __functionAddress = getInstance().ProgramUniform1uiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1uiEXT(program, location, v0, __functionAddress);
	}

	// --- [ glProgramUniform2uiEXT ] ---

	/** JNI method for {@link #glProgramUniform2uiEXT ProgramUniform2uiEXT} */
	@JavadocExclude
	public static native void nglProgramUniform2uiEXT(int program, int location, int v0, int v1, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param v0       
	 * @param v1       
	 */
	public static void glProgramUniform2uiEXT(int program, int location, int v0, int v1) {
		long __functionAddress = getInstance().ProgramUniform2uiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2uiEXT(program, location, v0, v1, __functionAddress);
	}

	// --- [ glProgramUniform3uiEXT ] ---

	/** JNI method for {@link #glProgramUniform3uiEXT ProgramUniform3uiEXT} */
	@JavadocExclude
	public static native void nglProgramUniform3uiEXT(int program, int location, int v0, int v1, int v2, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param v0       
	 * @param v1       
	 * @param v2       
	 */
	public static void glProgramUniform3uiEXT(int program, int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().ProgramUniform3uiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3uiEXT(program, location, v0, v1, v2, __functionAddress);
	}

	// --- [ glProgramUniform4uiEXT ] ---

	/** JNI method for {@link #glProgramUniform4uiEXT ProgramUniform4uiEXT} */
	@JavadocExclude
	public static native void nglProgramUniform4uiEXT(int program, int location, int v0, int v1, int v2, int v3, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param v0       
	 * @param v1       
	 * @param v2       
	 * @param v3       
	 */
	public static void glProgramUniform4uiEXT(int program, int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().ProgramUniform4uiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4uiEXT(program, location, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glProgramUniform1uivEXT ] ---

	/** JNI method for {@link #glProgramUniform1uivEXT ProgramUniform1uivEXT} */
	@JavadocExclude
	public static native void nglProgramUniform1uivEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform1uivEXT ProgramUniform1uivEXT} */
	@JavadocExclude
	public static void nglProgramUniform1uivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1uivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1uivEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
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

	/** JNI method for {@link #glProgramUniform2uivEXT ProgramUniform2uivEXT} */
	@JavadocExclude
	public static native void nglProgramUniform2uivEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform2uivEXT ProgramUniform2uivEXT} */
	@JavadocExclude
	public static void nglProgramUniform2uivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2uivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2uivEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
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

	/** JNI method for {@link #glProgramUniform3uivEXT ProgramUniform3uivEXT} */
	@JavadocExclude
	public static native void nglProgramUniform3uivEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform3uivEXT ProgramUniform3uivEXT} */
	@JavadocExclude
	public static void nglProgramUniform3uivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3uivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3uivEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
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

	/** JNI method for {@link #glProgramUniform4uivEXT ProgramUniform4uivEXT} */
	@JavadocExclude
	public static native void nglProgramUniform4uivEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform4uivEXT ProgramUniform4uivEXT} */
	@JavadocExclude
	public static void nglProgramUniform4uivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4uivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4uivEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
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

	/** JNI method for {@link #glNamedProgramLocalParameters4fvEXT NamedProgramLocalParameters4fvEXT} */
	@JavadocExclude
	public static native void nglNamedProgramLocalParameters4fvEXT(int program, int target, int index, int count, long params, long __functionAddress);

	/** Unsafe version of {@link #glNamedProgramLocalParameters4fvEXT NamedProgramLocalParameters4fvEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParameters4fvEXT(int program, int target, int index, int count, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParameters4fvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedProgramLocalParameters4fvEXT(program, target, index, count, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param count   
	 * @param params  
	 */
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

	/** JNI method for {@link #glNamedProgramLocalParameterI4iEXT NamedProgramLocalParameterI4iEXT} */
	@JavadocExclude
	public static native void nglNamedProgramLocalParameterI4iEXT(int program, int target, int index, int x, int y, int z, int w, long __functionAddress);

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param x       
	 * @param y       
	 * @param z       
	 * @param w       
	 */
	public static void glNamedProgramLocalParameterI4iEXT(int program, int target, int index, int x, int y, int z, int w) {
		long __functionAddress = getInstance().NamedProgramLocalParameterI4iEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedProgramLocalParameterI4iEXT(program, target, index, x, y, z, w, __functionAddress);
	}

	// --- [ glNamedProgramLocalParameterI4ivEXT ] ---

	/** JNI method for {@link #glNamedProgramLocalParameterI4ivEXT NamedProgramLocalParameterI4ivEXT} */
	@JavadocExclude
	public static native void nglNamedProgramLocalParameterI4ivEXT(int program, int target, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glNamedProgramLocalParameterI4ivEXT NamedProgramLocalParameterI4ivEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParameterI4ivEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParameterI4ivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedProgramLocalParameterI4ivEXT(program, target, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param params  
	 */
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

	/** JNI method for {@link #glNamedProgramLocalParametersI4ivEXT NamedProgramLocalParametersI4ivEXT} */
	@JavadocExclude
	public static native void nglNamedProgramLocalParametersI4ivEXT(int program, int target, int index, int count, long params, long __functionAddress);

	/** Unsafe version of {@link #glNamedProgramLocalParametersI4ivEXT NamedProgramLocalParametersI4ivEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParametersI4ivEXT(int program, int target, int index, int count, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParametersI4ivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedProgramLocalParametersI4ivEXT(program, target, index, count, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param count   
	 * @param params  
	 */
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

	/** JNI method for {@link #glNamedProgramLocalParameterI4uiEXT NamedProgramLocalParameterI4uiEXT} */
	@JavadocExclude
	public static native void nglNamedProgramLocalParameterI4uiEXT(int program, int target, int index, int x, int y, int z, int w, long __functionAddress);

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param x       
	 * @param y       
	 * @param z       
	 * @param w       
	 */
	public static void glNamedProgramLocalParameterI4uiEXT(int program, int target, int index, int x, int y, int z, int w) {
		long __functionAddress = getInstance().NamedProgramLocalParameterI4uiEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedProgramLocalParameterI4uiEXT(program, target, index, x, y, z, w, __functionAddress);
	}

	// --- [ glNamedProgramLocalParameterI4uivEXT ] ---

	/** JNI method for {@link #glNamedProgramLocalParameterI4uivEXT NamedProgramLocalParameterI4uivEXT} */
	@JavadocExclude
	public static native void nglNamedProgramLocalParameterI4uivEXT(int program, int target, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glNamedProgramLocalParameterI4uivEXT NamedProgramLocalParameterI4uivEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParameterI4uivEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParameterI4uivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedProgramLocalParameterI4uivEXT(program, target, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param params  
	 */
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

	/** JNI method for {@link #glNamedProgramLocalParametersI4uivEXT NamedProgramLocalParametersI4uivEXT} */
	@JavadocExclude
	public static native void nglNamedProgramLocalParametersI4uivEXT(int program, int target, int index, int count, long params, long __functionAddress);

	/** Unsafe version of {@link #glNamedProgramLocalParametersI4uivEXT NamedProgramLocalParametersI4uivEXT} */
	@JavadocExclude
	public static void nglNamedProgramLocalParametersI4uivEXT(int program, int target, int index, int count, long params) {
		long __functionAddress = getInstance().NamedProgramLocalParametersI4uivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedProgramLocalParametersI4uivEXT(program, target, index, count, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param count   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetNamedProgramLocalParameterIivEXT GetNamedProgramLocalParameterIivEXT} */
	@JavadocExclude
	public static native void nglGetNamedProgramLocalParameterIivEXT(int program, int target, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedProgramLocalParameterIivEXT GetNamedProgramLocalParameterIivEXT} */
	@JavadocExclude
	public static void nglGetNamedProgramLocalParameterIivEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().GetNamedProgramLocalParameterIivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetNamedProgramLocalParameterIivEXT(program, target, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param params  
	 */
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

	/** JNI method for {@link #glGetNamedProgramLocalParameterIuivEXT GetNamedProgramLocalParameterIuivEXT} */
	@JavadocExclude
	public static native void nglGetNamedProgramLocalParameterIuivEXT(int program, int target, int index, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedProgramLocalParameterIuivEXT GetNamedProgramLocalParameterIuivEXT} */
	@JavadocExclude
	public static void nglGetNamedProgramLocalParameterIuivEXT(int program, int target, int index, long params) {
		long __functionAddress = getInstance().GetNamedProgramLocalParameterIuivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetNamedProgramLocalParameterIuivEXT(program, target, index, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program 
	 * @param target  
	 * @param index   
	 * @param params  
	 */
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

	/** JNI method for {@link #glNamedRenderbufferStorageEXT NamedRenderbufferStorageEXT} */
	@JavadocExclude
	public static native void nglNamedRenderbufferStorageEXT(int renderbuffer, int internalformat, int width, int height, long __functionAddress);

	/**
	 * 
	 *
	 * @param renderbuffer   
	 * @param internalformat 
	 * @param width          
	 * @param height         
	 */
	public static void glNamedRenderbufferStorageEXT(int renderbuffer, int internalformat, int width, int height) {
		long __functionAddress = getInstance().NamedRenderbufferStorageEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedRenderbufferStorageEXT(renderbuffer, internalformat, width, height, __functionAddress);
	}

	// --- [ glGetNamedRenderbufferParameterivEXT ] ---

	/** JNI method for {@link #glGetNamedRenderbufferParameterivEXT GetNamedRenderbufferParameterivEXT} */
	@JavadocExclude
	public static native void nglGetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedRenderbufferParameterivEXT GetNamedRenderbufferParameterivEXT} */
	@JavadocExclude
	public static void nglGetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, long params) {
		long __functionAddress = getInstance().GetNamedRenderbufferParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param renderbuffer 
	 * @param pname        
	 * @param params       
	 */
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

	/** JNI method for {@link #glNamedRenderbufferStorageMultisampleEXT NamedRenderbufferStorageMultisampleEXT} */
	@JavadocExclude
	public static native void nglNamedRenderbufferStorageMultisampleEXT(int renderbuffer, int samples, int internalformat, int width, int height, long __functionAddress);

	/**
	 * 
	 *
	 * @param renderbuffer   
	 * @param samples        
	 * @param internalformat 
	 * @param width          
	 * @param height         
	 */
	public static void glNamedRenderbufferStorageMultisampleEXT(int renderbuffer, int samples, int internalformat, int width, int height) {
		long __functionAddress = getInstance().NamedRenderbufferStorageMultisampleEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedRenderbufferStorageMultisampleEXT(renderbuffer, samples, internalformat, width, height, __functionAddress);
	}

	// --- [ glNamedRenderbufferStorageMultisampleCoverageEXT ] ---

	/** JNI method for {@link #glNamedRenderbufferStorageMultisampleCoverageEXT NamedRenderbufferStorageMultisampleCoverageEXT} */
	@JavadocExclude
	public static native void nglNamedRenderbufferStorageMultisampleCoverageEXT(int renderbuffer, int coverageSamples, int colorSamples, int internalformat, int width, int height, long __functionAddress);

	/**
	 * 
	 *
	 * @param renderbuffer    
	 * @param coverageSamples 
	 * @param colorSamples    
	 * @param internalformat  
	 * @param width           
	 * @param height          
	 */
	public static void glNamedRenderbufferStorageMultisampleCoverageEXT(int renderbuffer, int coverageSamples, int colorSamples, int internalformat, int width, int height) {
		long __functionAddress = getInstance().NamedRenderbufferStorageMultisampleCoverageEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedRenderbufferStorageMultisampleCoverageEXT(renderbuffer, coverageSamples, colorSamples, internalformat, width, height, __functionAddress);
	}

	// --- [ glCheckNamedFramebufferStatusEXT ] ---

	/** JNI method for {@link #glCheckNamedFramebufferStatusEXT CheckNamedFramebufferStatusEXT} */
	@JavadocExclude
	public static native int nglCheckNamedFramebufferStatusEXT(int framebuffer, int target, long __functionAddress);

	/**
	 * 
	 *
	 * @param framebuffer 
	 * @param target      
	 */
	public static int glCheckNamedFramebufferStatusEXT(int framebuffer, int target) {
		long __functionAddress = getInstance().CheckNamedFramebufferStatusEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglCheckNamedFramebufferStatusEXT(framebuffer, target, __functionAddress);
	}

	// --- [ glNamedFramebufferTexture1DEXT ] ---

	/** JNI method for {@link #glNamedFramebufferTexture1DEXT NamedFramebufferTexture1DEXT} */
	@JavadocExclude
	public static native void nglNamedFramebufferTexture1DEXT(int framebuffer, int attachment, int textarget, int texture, int level, long __functionAddress);

	/**
	 * 
	 *
	 * @param framebuffer 
	 * @param attachment  
	 * @param textarget   
	 * @param texture     
	 * @param level       
	 */
	public static void glNamedFramebufferTexture1DEXT(int framebuffer, int attachment, int textarget, int texture, int level) {
		long __functionAddress = getInstance().NamedFramebufferTexture1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedFramebufferTexture1DEXT(framebuffer, attachment, textarget, texture, level, __functionAddress);
	}

	// --- [ glNamedFramebufferTexture2DEXT ] ---

	/** JNI method for {@link #glNamedFramebufferTexture2DEXT NamedFramebufferTexture2DEXT} */
	@JavadocExclude
	public static native void nglNamedFramebufferTexture2DEXT(int framebuffer, int attachment, int textarget, int texture, int level, long __functionAddress);

	/**
	 * 
	 *
	 * @param framebuffer 
	 * @param attachment  
	 * @param textarget   
	 * @param texture     
	 * @param level       
	 */
	public static void glNamedFramebufferTexture2DEXT(int framebuffer, int attachment, int textarget, int texture, int level) {
		long __functionAddress = getInstance().NamedFramebufferTexture2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedFramebufferTexture2DEXT(framebuffer, attachment, textarget, texture, level, __functionAddress);
	}

	// --- [ glNamedFramebufferTexture3DEXT ] ---

	/** JNI method for {@link #glNamedFramebufferTexture3DEXT NamedFramebufferTexture3DEXT} */
	@JavadocExclude
	public static native void nglNamedFramebufferTexture3DEXT(int framebuffer, int attachment, int textarget, int texture, int level, int zoffset, long __functionAddress);

	/**
	 * 
	 *
	 * @param framebuffer 
	 * @param attachment  
	 * @param textarget   
	 * @param texture     
	 * @param level       
	 * @param zoffset     
	 */
	public static void glNamedFramebufferTexture3DEXT(int framebuffer, int attachment, int textarget, int texture, int level, int zoffset) {
		long __functionAddress = getInstance().NamedFramebufferTexture3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedFramebufferTexture3DEXT(framebuffer, attachment, textarget, texture, level, zoffset, __functionAddress);
	}

	// --- [ glNamedFramebufferRenderbufferEXT ] ---

	/** JNI method for {@link #glNamedFramebufferRenderbufferEXT NamedFramebufferRenderbufferEXT} */
	@JavadocExclude
	public static native void nglNamedFramebufferRenderbufferEXT(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer, long __functionAddress);

	/**
	 * 
	 *
	 * @param framebuffer        
	 * @param attachment         
	 * @param renderbuffertarget 
	 * @param renderbuffer       
	 */
	public static void glNamedFramebufferRenderbufferEXT(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
		long __functionAddress = getInstance().NamedFramebufferRenderbufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedFramebufferRenderbufferEXT(framebuffer, attachment, renderbuffertarget, renderbuffer, __functionAddress);
	}

	// --- [ glGetNamedFramebufferAttachmentParameterivEXT ] ---

	/** JNI method for {@link #glGetNamedFramebufferAttachmentParameterivEXT GetNamedFramebufferAttachmentParameterivEXT} */
	@JavadocExclude
	public static native void nglGetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedFramebufferAttachmentParameterivEXT GetNamedFramebufferAttachmentParameterivEXT} */
	@JavadocExclude
	public static void nglGetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, long params) {
		long __functionAddress = getInstance().GetNamedFramebufferAttachmentParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param framebuffer 
	 * @param attachment  
	 * @param pname       
	 * @param params      
	 */
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

	/** JNI method for {@link #glGenerateTextureMipmapEXT GenerateTextureMipmapEXT} */
	@JavadocExclude
	public static native void nglGenerateTextureMipmapEXT(int texture, int target, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture 
	 * @param target  
	 */
	public static void glGenerateTextureMipmapEXT(int texture, int target) {
		long __functionAddress = getInstance().GenerateTextureMipmapEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGenerateTextureMipmapEXT(texture, target, __functionAddress);
	}

	// --- [ glGenerateMultiTexMipmapEXT ] ---

	/** JNI method for {@link #glGenerateMultiTexMipmapEXT GenerateMultiTexMipmapEXT} */
	@JavadocExclude
	public static native void nglGenerateMultiTexMipmapEXT(int texunit, int target, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit 
	 * @param target  
	 */
	public static void glGenerateMultiTexMipmapEXT(int texunit, int target) {
		long __functionAddress = getInstance().GenerateMultiTexMipmapEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGenerateMultiTexMipmapEXT(texunit, target, __functionAddress);
	}

	// --- [ glFramebufferDrawBufferEXT ] ---

	/** JNI method for {@link #glFramebufferDrawBufferEXT FramebufferDrawBufferEXT} */
	@JavadocExclude
	public static native void nglFramebufferDrawBufferEXT(int framebuffer, int mode, long __functionAddress);

	/**
	 * 
	 *
	 * @param framebuffer 
	 * @param mode        
	 */
	public static void glFramebufferDrawBufferEXT(int framebuffer, int mode) {
		long __functionAddress = getInstance().FramebufferDrawBufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFramebufferDrawBufferEXT(framebuffer, mode, __functionAddress);
	}

	// --- [ glFramebufferDrawBuffersEXT ] ---

	/** JNI method for {@link #glFramebufferDrawBuffersEXT FramebufferDrawBuffersEXT} */
	@JavadocExclude
	public static native void nglFramebufferDrawBuffersEXT(int framebuffer, int n, long bufs, long __functionAddress);

	/** Unsafe version of {@link #glFramebufferDrawBuffersEXT FramebufferDrawBuffersEXT} */
	@JavadocExclude
	public static void nglFramebufferDrawBuffersEXT(int framebuffer, int n, long bufs) {
		long __functionAddress = getInstance().FramebufferDrawBuffersEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFramebufferDrawBuffersEXT(framebuffer, n, bufs, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param framebuffer 
	 * @param n           
	 * @param bufs        
	 */
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

	/** JNI method for {@link #glFramebufferReadBufferEXT FramebufferReadBufferEXT} */
	@JavadocExclude
	public static native void nglFramebufferReadBufferEXT(int framebuffer, int mode, long __functionAddress);

	/**
	 * 
	 *
	 * @param framebuffer 
	 * @param mode        
	 */
	public static void glFramebufferReadBufferEXT(int framebuffer, int mode) {
		long __functionAddress = getInstance().FramebufferReadBufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFramebufferReadBufferEXT(framebuffer, mode, __functionAddress);
	}

	// --- [ glGetFramebufferParameterivEXT ] ---

	/** JNI method for {@link #glGetFramebufferParameterivEXT GetFramebufferParameterivEXT} */
	@JavadocExclude
	public static native void nglGetFramebufferParameterivEXT(int framebuffer, int pname, long param, long __functionAddress);

	/** Unsafe version of {@link #glGetFramebufferParameterivEXT GetFramebufferParameterivEXT} */
	@JavadocExclude
	public static void nglGetFramebufferParameterivEXT(int framebuffer, int pname, long param) {
		long __functionAddress = getInstance().GetFramebufferParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetFramebufferParameterivEXT(framebuffer, pname, param, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param framebuffer 
	 * @param pname       
	 * @param param       
	 */
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

	/** JNI method for {@link #glNamedCopyBufferSubDataEXT NamedCopyBufferSubDataEXT} */
	@JavadocExclude
	public static native void nglNamedCopyBufferSubDataEXT(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size, long __functionAddress);

	/**
	 * 
	 *
	 * @param readBuffer  
	 * @param writeBuffer 
	 * @param readOffset  
	 * @param writeOffset 
	 * @param size        
	 */
	public static void glNamedCopyBufferSubDataEXT(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
		long __functionAddress = getInstance().NamedCopyBufferSubDataEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedCopyBufferSubDataEXT(readBuffer, writeBuffer, readOffset, writeOffset, size, __functionAddress);
	}

	// --- [ glNamedFramebufferTextureEXT ] ---

	/** JNI method for {@link #glNamedFramebufferTextureEXT NamedFramebufferTextureEXT} */
	@JavadocExclude
	public static native void nglNamedFramebufferTextureEXT(int framebuffer, int attachment, int texture, int level, long __functionAddress);

	/**
	 * 
	 *
	 * @param framebuffer 
	 * @param attachment  
	 * @param texture     
	 * @param level       
	 */
	public static void glNamedFramebufferTextureEXT(int framebuffer, int attachment, int texture, int level) {
		long __functionAddress = getInstance().NamedFramebufferTextureEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedFramebufferTextureEXT(framebuffer, attachment, texture, level, __functionAddress);
	}

	// --- [ glNamedFramebufferTextureLayerEXT ] ---

	/** JNI method for {@link #glNamedFramebufferTextureLayerEXT NamedFramebufferTextureLayerEXT} */
	@JavadocExclude
	public static native void nglNamedFramebufferTextureLayerEXT(int framebuffer, int attachment, int texture, int level, int layer, long __functionAddress);

	/**
	 * 
	 *
	 * @param framebuffer 
	 * @param attachment  
	 * @param texture     
	 * @param level       
	 * @param layer       
	 */
	public static void glNamedFramebufferTextureLayerEXT(int framebuffer, int attachment, int texture, int level, int layer) {
		long __functionAddress = getInstance().NamedFramebufferTextureLayerEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedFramebufferTextureLayerEXT(framebuffer, attachment, texture, level, layer, __functionAddress);
	}

	// --- [ glNamedFramebufferTextureFaceEXT ] ---

	/** JNI method for {@link #glNamedFramebufferTextureFaceEXT NamedFramebufferTextureFaceEXT} */
	@JavadocExclude
	public static native void nglNamedFramebufferTextureFaceEXT(int framebuffer, int attachment, int texture, int level, int face, long __functionAddress);

	/**
	 * 
	 *
	 * @param framebuffer 
	 * @param attachment  
	 * @param texture     
	 * @param level       
	 * @param face        
	 */
	public static void glNamedFramebufferTextureFaceEXT(int framebuffer, int attachment, int texture, int level, int face) {
		long __functionAddress = getInstance().NamedFramebufferTextureFaceEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedFramebufferTextureFaceEXT(framebuffer, attachment, texture, level, face, __functionAddress);
	}

	// --- [ glTextureRenderbufferEXT ] ---

	/** JNI method for {@link #glTextureRenderbufferEXT TextureRenderbufferEXT} */
	@JavadocExclude
	public static native void nglTextureRenderbufferEXT(int texture, int target, int renderbuffer, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture      
	 * @param target       
	 * @param renderbuffer 
	 */
	public static void glTextureRenderbufferEXT(int texture, int target, int renderbuffer) {
		long __functionAddress = getInstance().TextureRenderbufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTextureRenderbufferEXT(texture, target, renderbuffer, __functionAddress);
	}

	// --- [ glMultiTexRenderbufferEXT ] ---

	/** JNI method for {@link #glMultiTexRenderbufferEXT MultiTexRenderbufferEXT} */
	@JavadocExclude
	public static native void nglMultiTexRenderbufferEXT(int texunit, int target, int renderbuffer, long __functionAddress);

	/**
	 * 
	 *
	 * @param texunit      
	 * @param target       
	 * @param renderbuffer 
	 */
	public static void glMultiTexRenderbufferEXT(int texunit, int target, int renderbuffer) {
		long __functionAddress = getInstance().MultiTexRenderbufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexRenderbufferEXT(texunit, target, renderbuffer, __functionAddress);
	}

	// --- [ glVertexArrayVertexOffsetEXT ] ---

	/** JNI method for {@link #glVertexArrayVertexOffsetEXT VertexArrayVertexOffsetEXT} */
	@JavadocExclude
	public static native void nglVertexArrayVertexOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj  
	 * @param buffer 
	 * @param size   
	 * @param type   
	 * @param stride 
	 * @param offset 
	 */
	public static void glVertexArrayVertexOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayVertexOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexArrayVertexOffsetEXT(vaobj, buffer, size, type, stride, offset, __functionAddress);
	}

	// --- [ glVertexArrayColorOffsetEXT ] ---

	/** JNI method for {@link #glVertexArrayColorOffsetEXT VertexArrayColorOffsetEXT} */
	@JavadocExclude
	public static native void nglVertexArrayColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj  
	 * @param buffer 
	 * @param size   
	 * @param type   
	 * @param stride 
	 * @param offset 
	 */
	public static void glVertexArrayColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayColorOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexArrayColorOffsetEXT(vaobj, buffer, size, type, stride, offset, __functionAddress);
	}

	// --- [ glVertexArrayEdgeFlagOffsetEXT ] ---

	/** JNI method for {@link #glVertexArrayEdgeFlagOffsetEXT VertexArrayEdgeFlagOffsetEXT} */
	@JavadocExclude
	public static native void nglVertexArrayEdgeFlagOffsetEXT(int vaobj, int buffer, int stride, long offset, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj  
	 * @param buffer 
	 * @param stride 
	 * @param offset 
	 */
	public static void glVertexArrayEdgeFlagOffsetEXT(int vaobj, int buffer, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayEdgeFlagOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexArrayEdgeFlagOffsetEXT(vaobj, buffer, stride, offset, __functionAddress);
	}

	// --- [ glVertexArrayIndexOffsetEXT ] ---

	/** JNI method for {@link #glVertexArrayIndexOffsetEXT VertexArrayIndexOffsetEXT} */
	@JavadocExclude
	public static native void nglVertexArrayIndexOffsetEXT(int vaobj, int buffer, int type, int stride, long offset, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj  
	 * @param buffer 
	 * @param type   
	 * @param stride 
	 * @param offset 
	 */
	public static void glVertexArrayIndexOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayIndexOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexArrayIndexOffsetEXT(vaobj, buffer, type, stride, offset, __functionAddress);
	}

	// --- [ glVertexArrayNormalOffsetEXT ] ---

	/** JNI method for {@link #glVertexArrayNormalOffsetEXT VertexArrayNormalOffsetEXT} */
	@JavadocExclude
	public static native void nglVertexArrayNormalOffsetEXT(int vaobj, int buffer, int type, int stride, long offset, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj  
	 * @param buffer 
	 * @param type   
	 * @param stride 
	 * @param offset 
	 */
	public static void glVertexArrayNormalOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayNormalOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexArrayNormalOffsetEXT(vaobj, buffer, type, stride, offset, __functionAddress);
	}

	// --- [ glVertexArrayTexCoordOffsetEXT ] ---

	/** JNI method for {@link #glVertexArrayTexCoordOffsetEXT VertexArrayTexCoordOffsetEXT} */
	@JavadocExclude
	public static native void nglVertexArrayTexCoordOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj  
	 * @param buffer 
	 * @param size   
	 * @param type   
	 * @param stride 
	 * @param offset 
	 */
	public static void glVertexArrayTexCoordOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayTexCoordOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexArrayTexCoordOffsetEXT(vaobj, buffer, size, type, stride, offset, __functionAddress);
	}

	// --- [ glVertexArrayMultiTexCoordOffsetEXT ] ---

	/** JNI method for {@link #glVertexArrayMultiTexCoordOffsetEXT VertexArrayMultiTexCoordOffsetEXT} */
	@JavadocExclude
	public static native void nglVertexArrayMultiTexCoordOffsetEXT(int vaobj, int buffer, int texunit, int size, int type, int stride, long offset, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj   
	 * @param buffer  
	 * @param texunit 
	 * @param size    
	 * @param type    
	 * @param stride  
	 * @param offset  
	 */
	public static void glVertexArrayMultiTexCoordOffsetEXT(int vaobj, int buffer, int texunit, int size, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayMultiTexCoordOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexArrayMultiTexCoordOffsetEXT(vaobj, buffer, texunit, size, type, stride, offset, __functionAddress);
	}

	// --- [ glVertexArrayFogCoordOffsetEXT ] ---

	/** JNI method for {@link #glVertexArrayFogCoordOffsetEXT VertexArrayFogCoordOffsetEXT} */
	@JavadocExclude
	public static native void nglVertexArrayFogCoordOffsetEXT(int vaobj, int buffer, int type, int stride, long offset, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj  
	 * @param buffer 
	 * @param type   
	 * @param stride 
	 * @param offset 
	 */
	public static void glVertexArrayFogCoordOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayFogCoordOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexArrayFogCoordOffsetEXT(vaobj, buffer, type, stride, offset, __functionAddress);
	}

	// --- [ glVertexArraySecondaryColorOffsetEXT ] ---

	/** JNI method for {@link #glVertexArraySecondaryColorOffsetEXT VertexArraySecondaryColorOffsetEXT} */
	@JavadocExclude
	public static native void nglVertexArraySecondaryColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj  
	 * @param buffer 
	 * @param size   
	 * @param type   
	 * @param stride 
	 * @param offset 
	 */
	public static void glVertexArraySecondaryColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArraySecondaryColorOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexArraySecondaryColorOffsetEXT(vaobj, buffer, size, type, stride, offset, __functionAddress);
	}

	// --- [ glVertexArrayVertexAttribOffsetEXT ] ---

	/** JNI method for {@link #glVertexArrayVertexAttribOffsetEXT VertexArrayVertexAttribOffsetEXT} */
	@JavadocExclude
	public static native void nglVertexArrayVertexAttribOffsetEXT(int vaobj, int buffer, int index, int size, int type, boolean normalized, int stride, long offset, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj      
	 * @param buffer     
	 * @param index      
	 * @param size       
	 * @param type       
	 * @param normalized 
	 * @param stride     
	 * @param offset     
	 */
	public static void glVertexArrayVertexAttribOffsetEXT(int vaobj, int buffer, int index, int size, int type, boolean normalized, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayVertexAttribOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexArrayVertexAttribOffsetEXT(vaobj, buffer, index, size, type, normalized, stride, offset, __functionAddress);
	}

	// --- [ glVertexArrayVertexAttribIOffsetEXT ] ---

	/** JNI method for {@link #glVertexArrayVertexAttribIOffsetEXT VertexArrayVertexAttribIOffsetEXT} */
	@JavadocExclude
	public static native void nglVertexArrayVertexAttribIOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj  
	 * @param buffer 
	 * @param index  
	 * @param size   
	 * @param type   
	 * @param stride 
	 * @param offset 
	 */
	public static void glVertexArrayVertexAttribIOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayVertexAttribIOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexArrayVertexAttribIOffsetEXT(vaobj, buffer, index, size, type, stride, offset, __functionAddress);
	}

	// --- [ glEnableVertexArrayEXT ] ---

	/** JNI method for {@link #glEnableVertexArrayEXT EnableVertexArrayEXT} */
	@JavadocExclude
	public static native void nglEnableVertexArrayEXT(int vaobj, int array, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj 
	 * @param array 
	 */
	public static void glEnableVertexArrayEXT(int vaobj, int array) {
		long __functionAddress = getInstance().EnableVertexArrayEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEnableVertexArrayEXT(vaobj, array, __functionAddress);
	}

	// --- [ glDisableVertexArrayEXT ] ---

	/** JNI method for {@link #glDisableVertexArrayEXT DisableVertexArrayEXT} */
	@JavadocExclude
	public static native void nglDisableVertexArrayEXT(int vaobj, int array, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj 
	 * @param array 
	 */
	public static void glDisableVertexArrayEXT(int vaobj, int array) {
		long __functionAddress = getInstance().DisableVertexArrayEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDisableVertexArrayEXT(vaobj, array, __functionAddress);
	}

	// --- [ glEnableVertexArrayAttribEXT ] ---

	/** JNI method for {@link #glEnableVertexArrayAttribEXT EnableVertexArrayAttribEXT} */
	@JavadocExclude
	public static native void nglEnableVertexArrayAttribEXT(int vaobj, int index, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj 
	 * @param index 
	 */
	public static void glEnableVertexArrayAttribEXT(int vaobj, int index) {
		long __functionAddress = getInstance().EnableVertexArrayAttribEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEnableVertexArrayAttribEXT(vaobj, index, __functionAddress);
	}

	// --- [ glDisableVertexArrayAttribEXT ] ---

	/** JNI method for {@link #glDisableVertexArrayAttribEXT DisableVertexArrayAttribEXT} */
	@JavadocExclude
	public static native void nglDisableVertexArrayAttribEXT(int vaobj, int index, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj 
	 * @param index 
	 */
	public static void glDisableVertexArrayAttribEXT(int vaobj, int index) {
		long __functionAddress = getInstance().DisableVertexArrayAttribEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDisableVertexArrayAttribEXT(vaobj, index, __functionAddress);
	}

	// --- [ glGetVertexArrayIntegervEXT ] ---

	/** JNI method for {@link #glGetVertexArrayIntegervEXT GetVertexArrayIntegervEXT} */
	@JavadocExclude
	public static native void nglGetVertexArrayIntegervEXT(int vaobj, int pname, long param, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexArrayIntegervEXT GetVertexArrayIntegervEXT} */
	@JavadocExclude
	public static void nglGetVertexArrayIntegervEXT(int vaobj, int pname, long param) {
		long __functionAddress = getInstance().GetVertexArrayIntegervEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetVertexArrayIntegervEXT(vaobj, pname, param, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param vaobj 
	 * @param pname 
	 * @param param 
	 */
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

	/** JNI method for {@link #glGetVertexArrayPointervEXT GetVertexArrayPointervEXT} */
	@JavadocExclude
	public static native void nglGetVertexArrayPointervEXT(int vaobj, int pname, long param, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexArrayPointervEXT GetVertexArrayPointervEXT} */
	@JavadocExclude
	public static void nglGetVertexArrayPointervEXT(int vaobj, int pname, long param) {
		long __functionAddress = getInstance().GetVertexArrayPointervEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetVertexArrayPointervEXT(vaobj, pname, param, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param vaobj 
	 * @param pname 
	 * @param param 
	 */
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

	/** JNI method for {@link #glGetVertexArrayIntegeri_vEXT GetVertexArrayIntegeri_vEXT} */
	@JavadocExclude
	public static native void nglGetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, long param, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexArrayIntegeri_vEXT GetVertexArrayIntegeri_vEXT} */
	@JavadocExclude
	public static void nglGetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, long param) {
		long __functionAddress = getInstance().GetVertexArrayIntegeri_vEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, param, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param vaobj 
	 * @param index 
	 * @param pname 
	 * @param param 
	 */
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

	/** JNI method for {@link #glGetVertexArrayPointeri_vEXT GetVertexArrayPointeri_vEXT} */
	@JavadocExclude
	public static native void nglGetVertexArrayPointeri_vEXT(int vaobj, int index, int pname, long param, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexArrayPointeri_vEXT GetVertexArrayPointeri_vEXT} */
	@JavadocExclude
	public static void nglGetVertexArrayPointeri_vEXT(int vaobj, int index, int pname, long param) {
		long __functionAddress = getInstance().GetVertexArrayPointeri_vEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetVertexArrayPointeri_vEXT(vaobj, index, pname, param, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param vaobj 
	 * @param index 
	 * @param pname 
	 * @param param 
	 */
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

	/** JNI method for {@link #glMapNamedBufferRangeEXT MapNamedBufferRangeEXT} */
	@JavadocExclude
	public static native long nglMapNamedBufferRangeEXT(int buffer, long offset, long length, int access, long __functionAddress);

	/** Unsafe version of {@link #glMapNamedBufferRangeEXT MapNamedBufferRangeEXT} */
	@JavadocExclude
	public static long nglMapNamedBufferRangeEXT(int buffer, long offset, long length, int access) {
		long __functionAddress = getInstance().MapNamedBufferRangeEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglMapNamedBufferRangeEXT(buffer, offset, length, access, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param buffer 
	 * @param offset 
	 * @param length 
	 * @param access 
	 */
	public static ByteBuffer glMapNamedBufferRangeEXT(int buffer, long offset, long length, int access) {
		long __result = nglMapNamedBufferRangeEXT(buffer, offset, length, access);
		return memByteBuffer(__result, (int)length);
	}

	/** Alternative version of: {@link #glMapNamedBufferRangeEXT MapNamedBufferRangeEXT} */
	public static ByteBuffer glMapNamedBufferRangeEXT(int buffer, long offset, long length, int access, ByteBuffer old_buffer) {
		long __result = nglMapNamedBufferRangeEXT(buffer, offset, length, access);
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, (int)length);
	}

	// --- [ glFlushMappedNamedBufferRangeEXT ] ---

	/** JNI method for {@link #glFlushMappedNamedBufferRangeEXT FlushMappedNamedBufferRangeEXT} */
	@JavadocExclude
	public static native void nglFlushMappedNamedBufferRangeEXT(int buffer, long offset, long length, long __functionAddress);

	/**
	 * 
	 *
	 * @param buffer 
	 * @param offset 
	 * @param length 
	 */
	public static void glFlushMappedNamedBufferRangeEXT(int buffer, long offset, long length) {
		long __functionAddress = getInstance().FlushMappedNamedBufferRangeEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFlushMappedNamedBufferRangeEXT(buffer, offset, length, __functionAddress);
	}

}