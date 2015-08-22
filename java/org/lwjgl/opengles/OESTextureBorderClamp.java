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
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class OESTextureBorderClamp {

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

	/** Function address. */
	@JavadocExclude
	public final long
		TexParameterIivOES,
		TexParameterIuivOES,
		GetTexParameterIivOES,
		GetTexParameterIuivOES,
		SamplerParameterIivOES,
		SamplerParameterIuivOES,
		GetSamplerParameterIivOES,
		GetSamplerParameterIuivOES;

	@JavadocExclude
	public OESTextureBorderClamp(FunctionProvider provider) {
		TexParameterIivOES = provider.getFunctionAddress("glTexParameterIivOES");
		TexParameterIuivOES = provider.getFunctionAddress("glTexParameterIuivOES");
		GetTexParameterIivOES = provider.getFunctionAddress("glGetTexParameterIivOES");
		GetTexParameterIuivOES = provider.getFunctionAddress("glGetTexParameterIuivOES");
		SamplerParameterIivOES = provider.getFunctionAddress("glSamplerParameterIivOES");
		SamplerParameterIuivOES = provider.getFunctionAddress("glSamplerParameterIuivOES");
		GetSamplerParameterIivOES = provider.getFunctionAddress("glGetSamplerParameterIivOES");
		GetSamplerParameterIuivOES = provider.getFunctionAddress("glGetSamplerParameterIuivOES");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OESTextureBorderClamp} instance for the current context. */
	public static OESTextureBorderClamp getInstance() {
		return checkFunctionality(GLES.getCapabilities().__OESTextureBorderClamp);
	}

	static OESTextureBorderClamp create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OES_texture_border_clamp") ) return null;

		OESTextureBorderClamp funcs = new OESTextureBorderClamp(provider);
		boolean supported = checkFunctions(
			funcs.TexParameterIivOES, funcs.TexParameterIuivOES, funcs.GetTexParameterIivOES, funcs.GetTexParameterIuivOES, funcs.SamplerParameterIivOES, 
			funcs.SamplerParameterIuivOES, funcs.GetSamplerParameterIivOES, funcs.GetSamplerParameterIuivOES
		);

		return GLES.checkExtension("GL_OES_texture_border_clamp", funcs, supported);
	}

	// --- [ glTexParameterIivOES ] ---

	/** Unsafe version of {@link #glTexParameterIivOES TexParameterIivOES} */
	@JavadocExclude
	public static void nglTexParameterIivOES(int target, int pname, long params) {
		long __functionAddress = getInstance().TexParameterIivOES;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glTexParameterIivOES(int target, int pname, ByteBuffer params) {
		nglTexParameterIivOES(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexParameterIivOES TexParameterIivOES} */
	public static void glTexParameterIivOES(int target, int pname, IntBuffer params) {
		nglTexParameterIivOES(target, pname, memAddress(params));
	}

	/** Single value version of: {@link #glTexParameterIivOES TexParameterIivOES} */
	public static void glTexParameterIiOES(int target, int pname, int param) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam(param);
		nglTexParameterIivOES(target, pname, __buffer.address(params));
	}

	// --- [ glTexParameterIuivOES ] ---

	/** Unsafe version of {@link #glTexParameterIuivOES TexParameterIuivOES} */
	@JavadocExclude
	public static void nglTexParameterIuivOES(int target, int pname, long params) {
		long __functionAddress = getInstance().TexParameterIuivOES;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glTexParameterIuivOES(int target, int pname, ByteBuffer params) {
		nglTexParameterIuivOES(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexParameterIuivOES TexParameterIuivOES} */
	public static void glTexParameterIuivOES(int target, int pname, IntBuffer params) {
		nglTexParameterIuivOES(target, pname, memAddress(params));
	}

	/** Single value version of: {@link #glTexParameterIuivOES TexParameterIuivOES} */
	public static void glTexParameterIuiOES(int target, int pname, int param) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam(param);
		nglTexParameterIuivOES(target, pname, __buffer.address(params));
	}

	// --- [ glGetTexParameterIivOES ] ---

	/** Unsafe version of {@link #glGetTexParameterIivOES GetTexParameterIivOES} */
	@JavadocExclude
	public static void nglGetTexParameterIivOES(int target, int pname, long params) {
		long __functionAddress = getInstance().GetTexParameterIivOES;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetTexParameterIivOES(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexParameterIivOES(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexParameterIivOES GetTexParameterIivOES} */
	public static void glGetTexParameterIivOES(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterIivOES(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexParameterIivOES GetTexParameterIivOES} */
	public static int glGetTexParameterIiOES(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTexParameterIivOES(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetTexParameterIuivOES ] ---

	/** Unsafe version of {@link #glGetTexParameterIuivOES GetTexParameterIuivOES} */
	@JavadocExclude
	public static void nglGetTexParameterIuivOES(int target, int pname, long params) {
		long __functionAddress = getInstance().GetTexParameterIuivOES;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetTexParameterIuivOES(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexParameterIuivOES(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexParameterIuivOES GetTexParameterIuivOES} */
	public static void glGetTexParameterIuivOES(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterIuivOES(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexParameterIuivOES GetTexParameterIuivOES} */
	public static int glGetTexParameterIuiOES(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTexParameterIuivOES(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glSamplerParameterIivOES ] ---

	/** Unsafe version of {@link #glSamplerParameterIivOES SamplerParameterIivOES} */
	@JavadocExclude
	public static void nglSamplerParameterIivOES(int sampler, int pname, long params) {
		long __functionAddress = getInstance().SamplerParameterIivOES;
		callIIPV(__functionAddress, sampler, pname, params);
	}

	public static void glSamplerParameterIivOES(int sampler, int pname, ByteBuffer params) {
		nglSamplerParameterIivOES(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glSamplerParameterIivOES SamplerParameterIivOES} */
	public static void glSamplerParameterIivOES(int sampler, int pname, IntBuffer params) {
		nglSamplerParameterIivOES(sampler, pname, memAddress(params));
	}

	/** Single value version of: {@link #glSamplerParameterIivOES SamplerParameterIivOES} */
	public static void glSamplerParameterIiOES(int sampler, int pname, int param) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam(param);
		nglSamplerParameterIivOES(sampler, pname, __buffer.address(params));
	}

	// --- [ glSamplerParameterIuivOES ] ---

	/** Unsafe version of {@link #glSamplerParameterIuivOES SamplerParameterIuivOES} */
	@JavadocExclude
	public static void nglSamplerParameterIuivOES(int sampler, int pname, long params) {
		long __functionAddress = getInstance().SamplerParameterIuivOES;
		callIIPV(__functionAddress, sampler, pname, params);
	}

	public static void glSamplerParameterIuivOES(int sampler, int pname, ByteBuffer params) {
		nglSamplerParameterIuivOES(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glSamplerParameterIuivOES SamplerParameterIuivOES} */
	public static void glSamplerParameterIuivOES(int sampler, int pname, IntBuffer params) {
		nglSamplerParameterIuivOES(sampler, pname, memAddress(params));
	}

	/** Single value version of: {@link #glSamplerParameterIuivOES SamplerParameterIuivOES} */
	public static void glSamplerParameterIuiOES(int sampler, int pname, int param) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam(param);
		nglSamplerParameterIuivOES(sampler, pname, __buffer.address(params));
	}

	// --- [ glGetSamplerParameterIivOES ] ---

	/** Unsafe version of {@link #glGetSamplerParameterIivOES GetSamplerParameterIivOES} */
	@JavadocExclude
	public static void nglGetSamplerParameterIivOES(int sampler, int pname, long params) {
		long __functionAddress = getInstance().GetSamplerParameterIivOES;
		callIIPV(__functionAddress, sampler, pname, params);
	}

	public static void glGetSamplerParameterIivOES(int sampler, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetSamplerParameterIivOES(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetSamplerParameterIivOES GetSamplerParameterIivOES} */
	public static void glGetSamplerParameterIivOES(int sampler, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterIivOES(sampler, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetSamplerParameterIivOES GetSamplerParameterIivOES} */
	public static int glGetSamplerParameterIiOES(int sampler, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetSamplerParameterIivOES(sampler, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetSamplerParameterIuivOES ] ---

	/** Unsafe version of {@link #glGetSamplerParameterIuivOES GetSamplerParameterIuivOES} */
	@JavadocExclude
	public static void nglGetSamplerParameterIuivOES(int sampler, int pname, long params) {
		long __functionAddress = getInstance().GetSamplerParameterIuivOES;
		callIIPV(__functionAddress, sampler, pname, params);
	}

	public static void glGetSamplerParameterIuivOES(int sampler, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetSamplerParameterIuivOES(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetSamplerParameterIuivOES GetSamplerParameterIuivOES} */
	public static void glGetSamplerParameterIuivOES(int sampler, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterIuivOES(sampler, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetSamplerParameterIuivOES GetSamplerParameterIuivOES} */
	public static int glGetSamplerParameterIuiOES(int sampler, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetSamplerParameterIuivOES(sampler, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

}