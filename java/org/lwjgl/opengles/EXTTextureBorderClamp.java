/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_texture_border_clamp.txt">EXT_texture_border_clamp</a> extension.
 * 
 * <p>OpenGL ES provides only a single clamping wrap mode: CLAMP_TO_EDGE. However, the ability to clamp to a constant border color can be useful to quickly
 * detect texture coordinates that exceed their expected limits or to dummy out any such accesses with transparency or a neutral color in tiling or light
 * maps.</p>
 * 
 * <p>This extension defines an additional texture clamping algorithm. CLAMP_TO_BORDER_EXT clamps texture coordinates at all mipmap levels such that NEAREST
 * and LINEAR filters of clamped coordinates return only the constant border color. This does not add the ability for textures to specify borders using
 * glTexImage2D, but only to clamp to a constant border value set using glTexParameter and glSamplerParameter.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class EXTTextureBorderClamp {

	/**
	 * Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, SamplerParameteriv, SamplerParameterfv, TexParameterIivEXT,
	 * TexParameterIuivEXT, SamplerParameterIivEXT, SamplerParameterIuivEXT, GetTexParameteriv, GetTexParameterfv, GetTexParameterIivEXT,
	 * GetTexParameterIuivEXT, GetSamplerParameteriv, GetSamplerParameterfv, GetSamplerParameterIivEXT, and GetSamplerParameterIuivEXT.
	 */
	public static final int GL_TEXTURE_BORDER_COLOR_EXT = 0x1004;

	/**
	 * Accepted by the {@code param} parameter of TexParameteri, TexParameterf, SamplerParameteri and SamplerParameterf, and by the {@code params} parameter of
	 * TexParameteriv, TexParameterfv, TexParameterIivEXT, TexParameterIuivEXT, SamplerParameterIivEXT, SamplerParameterIuivEXT and returned by the
	 * {@code params} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIivEXT, GetTexParameterIuivEXT, GetSamplerParameteriv,
	 * GetSamplerParameterfv, GetSamplerParameterIivEXT, and GetSamplerParameterIuivEXT when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T,
	 * or TEXTURE_WRAP_R.
	 */
	public static final int GL_CLAMP_TO_BORDER_EXT = 0x812D;

	static { GLES.initialize(); }

	protected EXTTextureBorderClamp() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glTexParameterIivEXT, caps.glTexParameterIuivEXT, caps.glGetTexParameterIivEXT, caps.glGetTexParameterIuivEXT, caps.glSamplerParameterIivEXT, 
			caps.glSamplerParameterIuivEXT, caps.glGetSamplerParameterIivEXT, caps.glGetSamplerParameterIuivEXT
		);
	}

	// --- [ glTexParameterIivEXT ] ---

	public static native void nglTexParameterIivEXT(int target, int pname, long params);

	public static void glTexParameterIivEXT(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglTexParameterIivEXT(target, pname, memAddress(params));
	}

	// --- [ glTexParameterIuivEXT ] ---

	public static native void nglTexParameterIuivEXT(int target, int pname, long params);

	public static void glTexParameterIuivEXT(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglTexParameterIuivEXT(target, pname, memAddress(params));
	}

	// --- [ glGetTexParameterIivEXT ] ---

	public static native void nglGetTexParameterIivEXT(int target, int pname, long params);

	public static void glGetTexParameterIivEXT(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetTexParameterIivEXT(target, pname, memAddress(params));
	}

	public static int glGetTexParameterIiEXT(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetTexParameterIivEXT(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexParameterIuivEXT ] ---

	public static native void nglGetTexParameterIuivEXT(int target, int pname, long params);

	public static void glGetTexParameterIuivEXT(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetTexParameterIuivEXT(target, pname, memAddress(params));
	}

	public static int glGetTexParameterIuiEXT(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetTexParameterIuivEXT(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glSamplerParameterIivEXT ] ---

	public static native void nglSamplerParameterIivEXT(int sampler, int pname, long param);

	public static void glSamplerParameterIivEXT(int sampler, int pname, IntBuffer param) {
		if ( CHECKS )
			check(param, 1);
		nglSamplerParameterIivEXT(sampler, pname, memAddress(param));
	}

	// --- [ glSamplerParameterIuivEXT ] ---

	public static native void nglSamplerParameterIuivEXT(int sampler, int pname, long param);

	public static void glSamplerParameterIuivEXT(int sampler, int pname, IntBuffer param) {
		if ( CHECKS )
			check(param, 1);
		nglSamplerParameterIuivEXT(sampler, pname, memAddress(param));
	}

	// --- [ glGetSamplerParameterIivEXT ] ---

	public static native void nglGetSamplerParameterIivEXT(int sampler, int pname, long params);

	public static void glGetSamplerParameterIivEXT(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetSamplerParameterIivEXT(sampler, pname, memAddress(params));
	}

	public static int glGetSamplerParameterIiEXT(int sampler, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetSamplerParameterIivEXT(sampler, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetSamplerParameterIuivEXT ] ---

	public static native void nglGetSamplerParameterIuivEXT(int sampler, int pname, long params);

	public static void glGetSamplerParameterIuivEXT(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetSamplerParameterIuivEXT(sampler, pname, memAddress(params));
	}

	public static int glGetSamplerParameterIuiEXT(int sampler, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetSamplerParameterIuivEXT(sampler, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glTexParameterIivEXT TexParameterIivEXT} */
	public static void glTexParameterIivEXT(int target, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glTexParameterIivEXT;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glTexParameterIuivEXT TexParameterIuivEXT} */
	public static void glTexParameterIuivEXT(int target, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glTexParameterIuivEXT;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetTexParameterIivEXT GetTexParameterIivEXT} */
	public static void glGetTexParameterIivEXT(int target, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glGetTexParameterIivEXT;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetTexParameterIuivEXT GetTexParameterIuivEXT} */
	public static void glGetTexParameterIuivEXT(int target, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glGetTexParameterIuivEXT;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glSamplerParameterIivEXT SamplerParameterIivEXT} */
	public static void glSamplerParameterIivEXT(int sampler, int pname, int[] param) {
		long __functionAddress = GLES.getICD().glSamplerParameterIivEXT;
		if ( CHECKS ) {
			check(__functionAddress);
			check(param, 1);
		}
		callPV(__functionAddress, sampler, pname, param);
	}

	/** Array version of: {@link #glSamplerParameterIuivEXT SamplerParameterIuivEXT} */
	public static void glSamplerParameterIuivEXT(int sampler, int pname, int[] param) {
		long __functionAddress = GLES.getICD().glSamplerParameterIuivEXT;
		if ( CHECKS ) {
			check(__functionAddress);
			check(param, 1);
		}
		callPV(__functionAddress, sampler, pname, param);
	}

	/** Array version of: {@link #glGetSamplerParameterIivEXT GetSamplerParameterIivEXT} */
	public static void glGetSamplerParameterIivEXT(int sampler, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glGetSamplerParameterIivEXT;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glGetSamplerParameterIuivEXT GetSamplerParameterIuivEXT} */
	public static void glGetSamplerParameterIuivEXT(int sampler, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glGetSamplerParameterIuivEXT;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

}