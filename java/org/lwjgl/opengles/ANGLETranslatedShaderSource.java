/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/ANGLE/ANGLE_translated_shader_source.txt">ANGLE_translated_shader_source</a> extension.
 * 
 * <p>WebGL uses the GLSL ES 2.0 spec on all platforms, and translates these shaders to the host platform's native language (HLSL, GLSL, and even GLSL ES).
 * For debugging purposes, it is useful to be able to examine the shader after translation.</p>
 * 
 * <p>This extension addes a new function to query the translated shader source, and adds a new enum for GetShaderiv's &lt;pname&gt; parameter to query the
 * translated shader source length.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class ANGLETranslatedShaderSource {

	/** Accepted by the {@code pname} parameter of GetShaderiv. */
	public static final int GL_TRANSLATED_SHADER_SOURCE_LENGTH_ANGLE = 0x93A0;

	/** Function address. */
	@JavadocExclude
	public final long GetTranslatedShaderSourceANGLE;

	@JavadocExclude
	public ANGLETranslatedShaderSource(FunctionProvider provider) {
		GetTranslatedShaderSourceANGLE = provider.getFunctionAddress("glGetTranslatedShaderSourceANGLE");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ANGLETranslatedShaderSource} instance for the current context. */
	public static ANGLETranslatedShaderSource getInstance() {
		return checkFunctionality(GLES.getCapabilities().__ANGLETranslatedShaderSource);
	}

	static ANGLETranslatedShaderSource create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ANGLE_translated_shader_source") ) return null;

		ANGLETranslatedShaderSource funcs = new ANGLETranslatedShaderSource(provider);
		boolean supported = checkFunctions(
			funcs.GetTranslatedShaderSourceANGLE
		);

		return GLES.checkExtension("GL_ANGLE_translated_shader_source", funcs, supported);
	}

	// --- [ glGetTranslatedShaderSourceANGLE ] ---

	/** Unsafe version of {@link #glGetTranslatedShaderSourceANGLE GetTranslatedShaderSourceANGLE} */
	@JavadocExclude
	public static void nglGetTranslatedShaderSourceANGLE(int shader, int bufsize, long length, long source) {
		long __functionAddress = getInstance().GetTranslatedShaderSourceANGLE;
		callIIPPV(__functionAddress, shader, bufsize, length, source);
	}

	public static void glGetTranslatedShaderSourceANGLE(int shader, int bufsize, ByteBuffer length, ByteBuffer source) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(source, bufsize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetTranslatedShaderSourceANGLE(shader, bufsize, memAddressSafe(length), memAddress(source));
	}

	/** Alternative version of: {@link #glGetTranslatedShaderSourceANGLE GetTranslatedShaderSourceANGLE} */
	public static void glGetTranslatedShaderSourceANGLE(int shader, IntBuffer length, ByteBuffer source) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetTranslatedShaderSourceANGLE(shader, source.remaining(), memAddressSafe(length), memAddress(source));
	}

	/** String return version of: {@link #glGetTranslatedShaderSourceANGLE GetTranslatedShaderSourceANGLE} */
	public static String glGetTranslatedShaderSourceANGLE(int shader, int bufsize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int source = __buffer.bufferParam(bufsize);
		nglGetTranslatedShaderSourceANGLE(shader, bufsize, __buffer.address(length), __buffer.address(source));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), source);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetTranslatedShaderSourceANGLE GetTranslatedShaderSourceANGLE} */
	public static String glGetTranslatedShaderSourceANGLE(int shader) {
		int bufsize = GLES20.glGetShaderi(shader, GL_TRANSLATED_SHADER_SOURCE_LENGTH_ANGLE);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int source = __buffer.bufferParam(bufsize);
		nglGetTranslatedShaderSourceANGLE(shader, bufsize, __buffer.address(length), __buffer.address(source));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), source);
	}

}