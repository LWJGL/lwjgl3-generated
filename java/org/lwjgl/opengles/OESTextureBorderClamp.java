/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_border_clamp.txt">OES_texture_border_clamp</a> extension.
 * 
 * <p>OpenGL ES provides only a single clamping wrap mode: CLAMP_TO_EDGE. However, the ability to clamp to a constant border color can be useful to quickly
 * detect texture coordinates that exceed their expected limits or to dummy out any such accesses with transparency or a neutral color in tiling or light
 * maps.</p>
 * 
 * <p>This extension defines an additional texture clamping algorithm. CLAMP_TO_BORDER_OES clamps texture coordinates at all mipmap levels such that NEAREST
 * and LINEAR filters of clamped coordinates return only the constant border color. This does not add the ability for textures to specify borders using
 * glTexImage2D, but only to clamp to a constant border value set using glTexParameter and glSamplerParameter.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class OESTextureBorderClamp {

	/**
	 * Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, SamplerParameteriv, SamplerParameterfv, TexParameterIivOES,
	 * TexParameterIuivOES, SamplerParameterIivOES, SamplerParameterIuivOES, GetTexParameteriv, GetTexParameterfv, GetTexParameterIivOES,
	 * GetTexParameterIuivOES, GetSamplerParameteriv, GetSamplerParameterfv, GetSamplerParameterIivOES, and GetSamplerParameterIuivOES.
	 */
	public static final int GL_TEXTURE_BORDER_COLOR_OES = 0x1004;

	/**
	 * Accepted by the {@code param} parameter of TexParameteri, TexParameterf, SamplerParameteri and SamplerParameterf, and by the {@code params} parameter of
	 * TexParameteriv, TexParameterfv, TexParameterIivOES, TexParameterIuivOES, SamplerParameterIivOES, SamplerParameterIuivOES and returned by the
	 * {@code params} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIivOES, GetTexParameterIuivOES, GetSamplerParameteriv,
	 * GetSamplerParameterfv, GetSamplerParameterIivOES, and GetSamplerParameterIuivOES when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T,
	 * or TEXTURE_WRAP_R.
	 */
	public static final int GL_CLAMP_TO_BORDER_OES = 0x812D;

	protected OESTextureBorderClamp() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glTexParameterIivOES, caps.glTexParameterIuivOES, caps.glGetTexParameterIivOES, caps.glGetTexParameterIuivOES, caps.glSamplerParameterIivOES, 
			caps.glSamplerParameterIuivOES, caps.glGetSamplerParameterIivOES, caps.glGetSamplerParameterIuivOES
		);
	}

	// --- [ glTexParameterIivOES ] ---

	public static void nglTexParameterIivOES(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glTexParameterIivOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glTexParameterIivOES(int target, int pname, IntBuffer params) {
		nglTexParameterIivOES(target, pname, memAddress(params));
	}

	public static void glTexParameterIiOES(int target, int pname, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.ints(param);
			nglTexParameterIivOES(target, pname, memAddress(params));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glTexParameterIuivOES ] ---

	public static void nglTexParameterIuivOES(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glTexParameterIuivOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glTexParameterIuivOES(int target, int pname, IntBuffer params) {
		nglTexParameterIuivOES(target, pname, memAddress(params));
	}

	public static void glTexParameterIuiOES(int target, int pname, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.ints(param);
			nglTexParameterIuivOES(target, pname, memAddress(params));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexParameterIivOES ] ---

	public static void nglGetTexParameterIivOES(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetTexParameterIivOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glGetTexParameterIivOES(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterIivOES(target, pname, memAddress(params));
	}

	public static int glGetTexParameterIiOES(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetTexParameterIivOES(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexParameterIuivOES ] ---

	public static void nglGetTexParameterIuivOES(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetTexParameterIuivOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glGetTexParameterIuivOES(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterIuivOES(target, pname, memAddress(params));
	}

	public static int glGetTexParameterIuiOES(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetTexParameterIuivOES(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glSamplerParameterIivOES ] ---

	public static void nglSamplerParameterIivOES(int sampler, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameterIivOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	public static void glSamplerParameterIivOES(int sampler, int pname, IntBuffer params) {
		nglSamplerParameterIivOES(sampler, pname, memAddress(params));
	}

	public static void glSamplerParameterIiOES(int sampler, int pname, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.ints(param);
			nglSamplerParameterIivOES(sampler, pname, memAddress(params));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glSamplerParameterIuivOES ] ---

	public static void nglSamplerParameterIuivOES(int sampler, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameterIuivOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	public static void glSamplerParameterIuivOES(int sampler, int pname, IntBuffer params) {
		nglSamplerParameterIuivOES(sampler, pname, memAddress(params));
	}

	public static void glSamplerParameterIuiOES(int sampler, int pname, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.ints(param);
			nglSamplerParameterIuivOES(sampler, pname, memAddress(params));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetSamplerParameterIivOES ] ---

	public static void nglGetSamplerParameterIivOES(int sampler, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetSamplerParameterIivOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	public static void glGetSamplerParameterIivOES(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterIivOES(sampler, pname, memAddress(params));
	}

	public static int glGetSamplerParameterIiOES(int sampler, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetSamplerParameterIivOES(sampler, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetSamplerParameterIuivOES ] ---

	public static void nglGetSamplerParameterIuivOES(int sampler, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetSamplerParameterIuivOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	public static void glGetSamplerParameterIuivOES(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterIuivOES(sampler, pname, memAddress(params));
	}

	public static int glGetSamplerParameterIuiOES(int sampler, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetSamplerParameterIuivOES(sampler, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glTexParameterIivOES TexParameterIivOES} */
	public static void glTexParameterIivOES(int target, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glTexParameterIivOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glTexParameterIuivOES TexParameterIuivOES} */
	public static void glTexParameterIuivOES(int target, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glTexParameterIuivOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetTexParameterIivOES GetTexParameterIivOES} */
	public static void glGetTexParameterIivOES(int target, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetTexParameterIivOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetTexParameterIuivOES GetTexParameterIuivOES} */
	public static void glGetTexParameterIuivOES(int target, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetTexParameterIuivOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glSamplerParameterIivOES SamplerParameterIivOES} */
	public static void glSamplerParameterIivOES(int sampler, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameterIivOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glSamplerParameterIuivOES SamplerParameterIuivOES} */
	public static void glSamplerParameterIuivOES(int sampler, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameterIuivOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glGetSamplerParameterIivOES GetSamplerParameterIivOES} */
	public static void glGetSamplerParameterIivOES(int sampler, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetSamplerParameterIivOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glGetSamplerParameterIuivOES GetSamplerParameterIuivOES} */
	public static void glGetSamplerParameterIuivOES(int sampler, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetSamplerParameterIuivOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

}