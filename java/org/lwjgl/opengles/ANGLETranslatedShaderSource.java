/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/ANGLE/ANGLE_translated_shader_source.txt">ANGLE_translated_shader_source</a> extension.
 * 
 * <p>WebGL uses the GLSL ES 2.0 spec on all platforms, and translates these shaders to the host platform's native language (HLSL, GLSL, and even GLSL ES).
 * For debugging purposes, it is useful to be able to examine the shader after translation.</p>
 * 
 * <p>This extension addes a new function to query the translated shader source, and adds a new enum for GetShaderiv's &lt;pname&gt; parameter to query the
 * translated shader source length.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class ANGLETranslatedShaderSource {

	/** Accepted by the {@code pname} parameter of GetShaderiv. */
	public static final int GL_TRANSLATED_SHADER_SOURCE_LENGTH_ANGLE = 0x93A0;

	protected ANGLETranslatedShaderSource() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glGetTranslatedShaderSourceANGLE
		);
	}

	// --- [ glGetTranslatedShaderSourceANGLE ] ---

	public static void nglGetTranslatedShaderSourceANGLE(int shader, int bufsize, long length, long source) {
		long __functionAddress = GLES.getCapabilities().glGetTranslatedShaderSourceANGLE;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, shader, bufsize, length, source);
	}

	public static void glGetTranslatedShaderSourceANGLE(int shader, IntBuffer length, ByteBuffer source) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetTranslatedShaderSourceANGLE(shader, source.remaining(), memAddressSafe(length), memAddress(source));
	}

	public static String glGetTranslatedShaderSourceANGLE(int shader, int bufsize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		ByteBuffer source = memAlloc(bufsize);
		try {
			IntBuffer length = stack.ints(0);
			nglGetTranslatedShaderSourceANGLE(shader, bufsize, memAddress(length), memAddress(source));
			return memUTF8(source, length.get(0));
		} finally {
			memFree(source);
			stack.setPointer(stackPointer);
		}
	}

	public static String glGetTranslatedShaderSourceANGLE(int shader) {
		int bufsize = GLES20.glGetShaderi(shader, GL_TRANSLATED_SHADER_SOURCE_LENGTH_ANGLE);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		ByteBuffer source = memAlloc(bufsize);
		try {
			IntBuffer length = stack.ints(0);
			nglGetTranslatedShaderSourceANGLE(shader, bufsize, memAddress(length), memAddress(source));
			return memUTF8(source, length.get(0));
		} finally {
			memFree(source);
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glGetTranslatedShaderSourceANGLE GetTranslatedShaderSourceANGLE} */
	public static void glGetTranslatedShaderSourceANGLE(int shader, int[] length, ByteBuffer source) {
		long __functionAddress = GLES.getCapabilities().glGetTranslatedShaderSourceANGLE;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPV(__functionAddress, shader, source.remaining(), length, memAddress(source));
	}

}