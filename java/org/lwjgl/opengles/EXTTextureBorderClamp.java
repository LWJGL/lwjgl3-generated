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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_texture_border_clamp.txt">EXT_texture_border_clamp</a> extension.
 * 
 * <p>OpenGL ES provides only a single clamping wrap mode: CLAMP_TO_EDGE. However, the ability to clamp to a constant border color can be useful to quickly
 * detect texture coordinates that exceed their expected limits or to dummy out any such accesses with transparency or a neutral color in tiling or light
 * maps.</p>
 * 
 * <p>This extension defines an additional texture clamping algorithm. CLAMP_TO_BORDER_EXT clamps texture coordinates at all mipmap levels such that NEAREST
 * and LINEAR filters of clamped coordinates return only the constant border color. This does not add the ability for textures to specify borders using
 * glTexImage2D, but only to clamp to a constant border value set using glTexParameter and glSamplerParameter.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class EXTTextureBorderClamp {

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

	/** Function address. */
	@JavadocExclude
	public final long
		TexParameterIivEXT,
		TexParameterIuivEXT,
		GetTexParameterIivEXT,
		GetTexParameterIuivEXT,
		SamplerParameterIivEXT,
		SamplerParameterIuivEXT,
		GetSamplerParameterIivEXT,
		GetSamplerParameterIuivEXT;

	@JavadocExclude
	public EXTTextureBorderClamp(FunctionProvider provider) {
		TexParameterIivEXT = provider.getFunctionAddress("glTexParameterIivEXT");
		TexParameterIuivEXT = provider.getFunctionAddress("glTexParameterIuivEXT");
		GetTexParameterIivEXT = provider.getFunctionAddress("glGetTexParameterIivEXT");
		GetTexParameterIuivEXT = provider.getFunctionAddress("glGetTexParameterIuivEXT");
		SamplerParameterIivEXT = provider.getFunctionAddress("glSamplerParameterIivEXT");
		SamplerParameterIuivEXT = provider.getFunctionAddress("glSamplerParameterIuivEXT");
		GetSamplerParameterIivEXT = provider.getFunctionAddress("glGetSamplerParameterIivEXT");
		GetSamplerParameterIuivEXT = provider.getFunctionAddress("glGetSamplerParameterIuivEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTTextureBorderClamp} instance for the current context. */
	public static EXTTextureBorderClamp getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTTextureBorderClamp);
	}

	static EXTTextureBorderClamp create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_texture_border_clamp") ) return null;

		EXTTextureBorderClamp funcs = new EXTTextureBorderClamp(provider);
		boolean supported = checkFunctions(
			funcs.TexParameterIivEXT, funcs.TexParameterIuivEXT, funcs.GetTexParameterIivEXT, funcs.GetTexParameterIuivEXT, funcs.SamplerParameterIivEXT, 
			funcs.SamplerParameterIuivEXT, funcs.GetSamplerParameterIivEXT, funcs.GetSamplerParameterIuivEXT
		);

		return GLES.checkExtension("GL_EXT_texture_border_clamp", funcs, supported);
	}

	// --- [ glTexParameterIivEXT ] ---

	/** Unsafe version of {@link #glTexParameterIivEXT TexParameterIivEXT} */
	@JavadocExclude
	public static void nglTexParameterIivEXT(int target, int pname, long params) {
		long __functionAddress = getInstance().TexParameterIivEXT;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glTexParameterIivEXT(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglTexParameterIivEXT(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexParameterIivEXT TexParameterIivEXT} */
	public static void glTexParameterIivEXT(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglTexParameterIivEXT(target, pname, memAddress(params));
	}

	// --- [ glTexParameterIuivEXT ] ---

	/** Unsafe version of {@link #glTexParameterIuivEXT TexParameterIuivEXT} */
	@JavadocExclude
	public static void nglTexParameterIuivEXT(int target, int pname, long params) {
		long __functionAddress = getInstance().TexParameterIuivEXT;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glTexParameterIuivEXT(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglTexParameterIuivEXT(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexParameterIuivEXT TexParameterIuivEXT} */
	public static void glTexParameterIuivEXT(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglTexParameterIuivEXT(target, pname, memAddress(params));
	}

	// --- [ glGetTexParameterIivEXT ] ---

	/** Unsafe version of {@link #glGetTexParameterIivEXT GetTexParameterIivEXT} */
	@JavadocExclude
	public static void nglGetTexParameterIivEXT(int target, int pname, long params) {
		long __functionAddress = getInstance().GetTexParameterIivEXT;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetTexParameterIivEXT(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexParameterIivEXT(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexParameterIivEXT GetTexParameterIivEXT} */
	public static void glGetTexParameterIivEXT(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterIivEXT(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexParameterIivEXT GetTexParameterIivEXT} */
	public static int glGetTexParameterIiEXT(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTexParameterIivEXT(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetTexParameterIuivEXT ] ---

	/** Unsafe version of {@link #glGetTexParameterIuivEXT GetTexParameterIuivEXT} */
	@JavadocExclude
	public static void nglGetTexParameterIuivEXT(int target, int pname, long params) {
		long __functionAddress = getInstance().GetTexParameterIuivEXT;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetTexParameterIuivEXT(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexParameterIuivEXT(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexParameterIuivEXT GetTexParameterIuivEXT} */
	public static void glGetTexParameterIuivEXT(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterIuivEXT(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexParameterIuivEXT GetTexParameterIuivEXT} */
	public static int glGetTexParameterIuiEXT(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTexParameterIuivEXT(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glSamplerParameterIivEXT ] ---

	/** Unsafe version of {@link #glSamplerParameterIivEXT SamplerParameterIivEXT} */
	@JavadocExclude
	public static void nglSamplerParameterIivEXT(int sampler, int pname, long param) {
		long __functionAddress = getInstance().SamplerParameterIivEXT;
		callIIPV(__functionAddress, sampler, pname, param);
	}

	public static void glSamplerParameterIivEXT(int sampler, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1 << 2);
		nglSamplerParameterIivEXT(sampler, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glSamplerParameterIivEXT SamplerParameterIivEXT} */
	public static void glSamplerParameterIivEXT(int sampler, int pname, IntBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1);
		nglSamplerParameterIivEXT(sampler, pname, memAddress(param));
	}

	// --- [ glSamplerParameterIuivEXT ] ---

	/** Unsafe version of {@link #glSamplerParameterIuivEXT SamplerParameterIuivEXT} */
	@JavadocExclude
	public static void nglSamplerParameterIuivEXT(int sampler, int pname, long param) {
		long __functionAddress = getInstance().SamplerParameterIuivEXT;
		callIIPV(__functionAddress, sampler, pname, param);
	}

	public static void glSamplerParameterIuivEXT(int sampler, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1 << 2);
		nglSamplerParameterIuivEXT(sampler, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glSamplerParameterIuivEXT SamplerParameterIuivEXT} */
	public static void glSamplerParameterIuivEXT(int sampler, int pname, IntBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1);
		nglSamplerParameterIuivEXT(sampler, pname, memAddress(param));
	}

	// --- [ glGetSamplerParameterIivEXT ] ---

	/** Unsafe version of {@link #glGetSamplerParameterIivEXT GetSamplerParameterIivEXT} */
	@JavadocExclude
	public static void nglGetSamplerParameterIivEXT(int sampler, int pname, long params) {
		long __functionAddress = getInstance().GetSamplerParameterIivEXT;
		callIIPV(__functionAddress, sampler, pname, params);
	}

	public static void glGetSamplerParameterIivEXT(int sampler, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetSamplerParameterIivEXT(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetSamplerParameterIivEXT GetSamplerParameterIivEXT} */
	public static void glGetSamplerParameterIivEXT(int sampler, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterIivEXT(sampler, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetSamplerParameterIivEXT GetSamplerParameterIivEXT} */
	public static int glGetSamplerParameterIiEXT(int sampler, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetSamplerParameterIivEXT(sampler, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetSamplerParameterIuivEXT ] ---

	/** Unsafe version of {@link #glGetSamplerParameterIuivEXT GetSamplerParameterIuivEXT} */
	@JavadocExclude
	public static void nglGetSamplerParameterIuivEXT(int sampler, int pname, long params) {
		long __functionAddress = getInstance().GetSamplerParameterIuivEXT;
		callIIPV(__functionAddress, sampler, pname, params);
	}

	public static void glGetSamplerParameterIuivEXT(int sampler, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetSamplerParameterIuivEXT(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetSamplerParameterIuivEXT GetSamplerParameterIuivEXT} */
	public static void glGetSamplerParameterIuivEXT(int sampler, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterIuivEXT(sampler, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetSamplerParameterIuivEXT GetSamplerParameterIuivEXT} */
	public static int glGetSamplerParameterIuiEXT(int sampler, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetSamplerParameterIuivEXT(sampler, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

}