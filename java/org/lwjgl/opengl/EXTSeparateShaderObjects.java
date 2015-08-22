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
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/separate_shader_objects.txt">EXT_separate_shader_objects</a> extension.
 * 
 * <p>rior to this extension, GLSL requires multiple shader domains (vertex, fragment, geometry) to be linked into a single monolithic program object to
 * specify a GLSL shader for each domain.</p>
 * 
 * <p>While GLSL's monolithic approach has some advantages for optimizing shaders as a unit that span multiple domains, all existing GPU hardware supports
 * the more flexible mix-and-match approach.</p>
 * 
 * <p>HLSL9, Cg, the prior OpenGL assembly program extensions, and game console programmers favor a more flexible "mix-and-match" approach to specifying
 * shaders independently for these different shader domains. Many developers build their shader content around the mix-and-match approach where they can
 * use a single vertex shader with multiple fragment shaders (or vice versa).</p>
 * 
 * <p>This keep-it-simple extension adapts the "mix-and-match" shader domain model for GLSL so different GLSL program objects can be bound to different
 * shader domains.</p>
 * 
 * <p>This extension redefines the operation of glUseProgram(GLenum program) to be equivalent to:
 * <pre><code style="font-family: monospace">
 *  glUseShaderProgramEXT(GL_VERTEX_SHADER, program);
 * glUseShaderProgramEXT(GL_GEOMETRY_SHADER_EXT, program);
 * glUseShaderProgramEXT(GL_FRAGMENT_SHADER, program);
 * glActiveProgramEXT(program);</code></pre>
 * You can also call these commands separately to bind each respective domain. The GL_VERTEX_SHADER, GL_GEOMETRY_SHADER_EXT, and GL_FRAGMENT_SHADER tokens
 * refer to the conventional vertex, geometry, and fragment domains respectively. glActiveProgramEXT specifies the program that glUniform* commands will
 * update.</p>
 * 
 * <p>Separate linking creates the possibility that certain output varyings of a shader may go unread by the subsequent shader inputting varyings. In this
 * case, the output varyings are simply ignored. It is also possible input varyings from a shader may not be written as output varyings of a preceding
 * shader. In this case, the unwritten input varying values are undefined. Implementations are encouraged to zero these undefined input varying values.</p>
 * 
 * <p>This extension is a proof-of-concept that separate shader objects can work for GLSL and a response to repeated requests for this functionality. There
 * are various loose ends, particularly when dealing with user-defined varyings. The hope is a future extension will improve this situation.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} or {@link ARBShaderObjects ARB_shader_objects}.</p>
 */
public final class EXTSeparateShaderObjects {

	/** Accepted by {@code type} parameter to GetIntegerv and GetFloatv. */
	public static final int GL_ACTIVE_PROGRAM_EXT = 0x8B8D;

	/** Function address. */
	@JavadocExclude
	public final long
		UseShaderProgramEXT,
		ActiveProgramEXT,
		CreateShaderProgramEXT;

	@JavadocExclude
	public EXTSeparateShaderObjects(FunctionProvider provider) {
		UseShaderProgramEXT = provider.getFunctionAddress("glUseShaderProgramEXT");
		ActiveProgramEXT = provider.getFunctionAddress("glActiveProgramEXT");
		CreateShaderProgramEXT = provider.getFunctionAddress("glCreateShaderProgramEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTSeparateShaderObjects} instance for the current context. */
	public static EXTSeparateShaderObjects getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTSeparateShaderObjects);
	}

	static EXTSeparateShaderObjects create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_separate_shader_objects") ) return null;

		EXTSeparateShaderObjects funcs = new EXTSeparateShaderObjects(provider);

		boolean supported = checkFunctions(
			funcs.UseShaderProgramEXT, funcs.ActiveProgramEXT, funcs.CreateShaderProgramEXT
		);

		return GL.checkExtension("GL_EXT_separate_shader_objects", funcs, supported);
	}

	// --- [ glUseShaderProgramEXT ] ---

	public static void glUseShaderProgramEXT(int type, int program) {
		long __functionAddress = getInstance().UseShaderProgramEXT;
		callIIV(__functionAddress, type, program);
	}

	// --- [ glActiveProgramEXT ] ---

	public static void glActiveProgramEXT(int program) {
		long __functionAddress = getInstance().ActiveProgramEXT;
		callIV(__functionAddress, program);
	}

	// --- [ glCreateShaderProgramEXT ] ---

	/** Unsafe version of {@link #glCreateShaderProgramEXT CreateShaderProgramEXT} */
	@JavadocExclude
	public static int nglCreateShaderProgramEXT(int type, long string) {
		long __functionAddress = getInstance().CreateShaderProgramEXT;
		return callIPI(__functionAddress, type, string);
	}

	public static int glCreateShaderProgramEXT(int type, ByteBuffer string) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(string);
		return nglCreateShaderProgramEXT(type, memAddress(string));
	}

	/** CharSequence version of: {@link #glCreateShaderProgramEXT CreateShaderProgramEXT} */
	public static int glCreateShaderProgramEXT(int type, CharSequence string) {
		APIBuffer __buffer = apiBuffer();
		int stringEncoded = __buffer.stringParamUTF8(string, true);
		return nglCreateShaderProgramEXT(type, __buffer.address(stringEncoded));
	}

}