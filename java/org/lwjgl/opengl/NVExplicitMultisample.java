/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/explicit_multisample.txt">NV_explicit_multisample</a> extension.
 * 
 * <p>In traditional multisample specs, the API only allows access to the samples indirectly through methods such as coverage values and downsampled
 * readbacks. NV_explicit_multisample adds a set of new capabilities to allow more precise control over the use of multisamples. Specifically, it adds:</p>
 * 
 * <ul>
 * <li>A query in the API to query the location of samples within the pixel</li>
 * <li>An explicit control for the multisample sample mask to augment the control provided by SampleCoverage</li>
 * <li>A new texture target to wrap a renderbuffer and allow a restricted class of accesses to the samples</li>
 * <li>The ability to fetch a specific sample from a multisampled texture from within a shader</li>
 * <li>A program option to enable the new behavior</li>
 * </ul>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} and {@link ARBMultisample ARB_multisample}.</p>
 */
public class NVExplicitMultisample {

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

	protected NVExplicitMultisample() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glGetMultisamplefvNV, caps.glSampleMaskIndexedNV, caps.glTexRenderbufferNV
		);
	}

	// --- [ glGetMultisamplefvNV ] ---

	public static void nglGetMultisamplefvNV(int pname, int index, long val) {
		long __functionAddress = GL.getCapabilities().glGetMultisamplefvNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pname, index, val);
	}

	public static void glGetMultisamplefvNV(int pname, int index, FloatBuffer val) {
		if ( CHECKS )
			checkBuffer(val, 2);
		nglGetMultisamplefvNV(pname, index, memAddress(val));
	}

	// --- [ glSampleMaskIndexedNV ] ---

	public static void glSampleMaskIndexedNV(int index, int mask) {
		long __functionAddress = GL.getCapabilities().glSampleMaskIndexedNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, mask);
	}

	// --- [ glTexRenderbufferNV ] ---

	public static void glTexRenderbufferNV(int target, int renderbuffer) {
		long __functionAddress = GL.getCapabilities().glTexRenderbufferNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, renderbuffer);
	}

	/** Array version of: {@link #glGetMultisamplefvNV GetMultisamplefvNV} */
	public static void glGetMultisamplefvNV(int pname, int index, float[] val) {
		long __functionAddress = GL.getCapabilities().glGetMultisamplefvNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(val, 2);
		}
		callPV(__functionAddress, pname, index, val);
	}

}