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

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/explicit_multisample.txt">NV_explicit_multisample</a> extension.
 * 
 * <p>In traditional multisample specs, the API only allows access to the samples indirectly through methods such as coverage values and downsampled
 * readbacks. NV_explicit_multisample adds a set of new capabilities to allow more precise control over the use of multisamples. Specifically, it adds:
 * <ul>
 * <li>A query in the API to query the location of samples within the pixel</li>
 * <li>An explicit control for the multisample sample mask to augment the control provided by SampleCoverage</li>
 * <li>A new texture target to wrap a renderbuffer and allow a restricted class of accesses to the samples</li>
 * <li>The ability to fetch a specific sample from a multisampled texture from within a shader</li>
 * <li>A program option to enable the new behavior</li>
 * </ul></p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} and {@link ARBMultisample ARB_multisample}.</p>
 */
public final class NVExplicitMultisample {

	/** Accepted by the {@code pname} parameter of GetMultisamplefvNV. */
	public static final int GL_SAMPLE_POSITION_NV = 0x8E50;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int GL_SAMPLE_MASK_NV = 0x8E51;

	/** Accepted by the {@code pname} parameter of GetBooleanIndexedvEXT and GetIntegerIndexedvEXT. */
	public static final int GL_SAMPLE_MASK_VALUE_NV = 0x8E52;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_TEXTURE_BINDING_RENDERBUFFER_NV            = 0x8E53,
		GL_TEXTURE_RENDERBUFFER_DATA_STORE_BINDING_NV = 0x8E54,
		GL_MAX_SAMPLE_MASK_WORDS_NV                   = 0x8E59;

	/** Accepted by the {@code target} parameter of BindTexture, and TexRenderbufferNV. */
	public static final int GL_TEXTURE_RENDERBUFFER_NV = 0x8E55;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int
		GL_SAMPLER_RENDERBUFFER_NV              = 0x8E56,
		GL_INT_SAMPLER_RENDERBUFFER_NV          = 0x8E57,
		GL_UNSIGNED_INT_SAMPLER_RENDERBUFFER_NV = 0x8E58;

	/** Function address. */
	@JavadocExclude
	public final long
		GetMultisamplefvNV,
		SampleMaskIndexedNV,
		TexRenderbufferNV;

	@JavadocExclude
	public NVExplicitMultisample(FunctionProvider provider) {
		GetMultisamplefvNV = provider.getFunctionAddress("glGetMultisamplefvNV");
		SampleMaskIndexedNV = provider.getFunctionAddress("glSampleMaskIndexedNV");
		TexRenderbufferNV = provider.getFunctionAddress("glTexRenderbufferNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVExplicitMultisample} instance for the current context. */
	public static NVExplicitMultisample getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVExplicitMultisample);
	}

	static NVExplicitMultisample create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_explicit_multisample") ) return null;

		NVExplicitMultisample funcs = new NVExplicitMultisample(provider);

		boolean supported = checkFunctions(
			funcs.GetMultisamplefvNV, funcs.SampleMaskIndexedNV, funcs.TexRenderbufferNV
		);

		return GL.checkExtension("GL_NV_explicit_multisample", funcs, supported);
	}

	// --- [ glGetMultisamplefvNV ] ---

	/** Unsafe version of {@link #glGetMultisamplefvNV GetMultisamplefvNV} */
	@JavadocExclude
	public static void nglGetMultisamplefvNV(int pname, int index, long val) {
		long __functionAddress = getInstance().GetMultisamplefvNV;
		callIIPV(__functionAddress, pname, index, val);
	}

	public static void glGetMultisamplefvNV(int pname, int index, ByteBuffer val) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(val, 2 << 2);
		nglGetMultisamplefvNV(pname, index, memAddress(val));
	}

	/** Alternative version of: {@link #glGetMultisamplefvNV GetMultisamplefvNV} */
	public static void glGetMultisamplefvNV(int pname, int index, FloatBuffer val) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(val, 2);
		nglGetMultisamplefvNV(pname, index, memAddress(val));
	}

	// --- [ glSampleMaskIndexedNV ] ---

	public static void glSampleMaskIndexedNV(int index, int mask) {
		long __functionAddress = getInstance().SampleMaskIndexedNV;
		callIIV(__functionAddress, index, mask);
	}

	// --- [ glTexRenderbufferNV ] ---

	public static void glTexRenderbufferNV(int target, int renderbuffer) {
		long __functionAddress = getInstance().TexRenderbufferNV;
		callIIV(__functionAddress, target, renderbuffer);
	}

}