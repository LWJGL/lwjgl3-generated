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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/framebuffer_mixed_samples.txt">NV_framebuffer_mixed_samples</a> extension.
 * 
 * <p>This extension allows multisample rendering with a raster and
 * depth/stencil sample count that is larger than the color sample count.
 * Rasterization and the results of the depth and stencil tests together
 * determine the portion of a pixel that is "covered".  It can be useful to
 * evaluate coverage at a higher frequency than color samples are stored.
 * This coverage is then "reduced" to a collection of covered color samples,
 * each having an opacity value corresponding to the fraction of the color
 * sample covered.  The opacity can optionally be blended into individual
 * color samples.</p>
 */
public final class NVFramebufferMixedSamples {

	/** Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled. */
	public static final int
		GL_RASTER_MULTISAMPLE_EXT       = 0x9327,
		GL_COVERAGE_MODULATION_TABLE_NV = 0x9331;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_RASTER_SAMPLES_EXT                    = 0x9328,
		GL_MAX_RASTER_SAMPLES_EXT                = 0x9329,
		GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT     = 0x932A,
		GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT = 0x932B,
		GL_EFFECTIVE_RASTER_SAMPLES_EXT          = 0x932C,
		GL_COLOR_SAMPLES_NV                      = 0x8E20,
		GL_DEPTH_SAMPLES_NV                      = 0x932D,
		GL_STENCIL_SAMPLES_NV                    = 0x932E,
		GL_MIXED_DEPTH_SAMPLES_SUPPORTED_NV      = 0x932F,
		GL_MIXED_STENCIL_SAMPLES_SUPPORTED_NV    = 0x9330,
		GL_COVERAGE_MODULATION_NV                = 0x9332,
		GL_COVERAGE_MODULATION_TABLE_SIZE_NV     = 0x9333;

	/** Function address. */
	@JavadocExclude
	public final long
		RasterSamplesEXT,
		CoverageModulationTableNV,
		GetCoverageModulationTableNV,
		CoverageModulationNV;

	@JavadocExclude
	public NVFramebufferMixedSamples(FunctionProvider provider) {
		RasterSamplesEXT = provider.getFunctionAddress("glRasterSamplesEXT");
		CoverageModulationTableNV = provider.getFunctionAddress("glCoverageModulationTableNV");
		GetCoverageModulationTableNV = provider.getFunctionAddress("glGetCoverageModulationTableNV");
		CoverageModulationNV = provider.getFunctionAddress("glCoverageModulationNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVFramebufferMixedSamples} instance for the current context. */
	public static NVFramebufferMixedSamples getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVFramebufferMixedSamples);
	}

	static NVFramebufferMixedSamples create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_framebuffer_mixed_samples") ) return null;

		NVFramebufferMixedSamples funcs = new NVFramebufferMixedSamples(provider);

		boolean supported = checkFunctions(
			funcs.RasterSamplesEXT, funcs.CoverageModulationTableNV, funcs.GetCoverageModulationTableNV, funcs.CoverageModulationNV
		);

		return GL.checkExtension("GL_NV_framebuffer_mixed_samples", funcs, supported);
	}

	// --- [ glRasterSamplesEXT ] ---

	/** JNI method for {@link #glRasterSamplesEXT RasterSamplesEXT} */
	@JavadocExclude
	public static native void nglRasterSamplesEXT(int samples, boolean fixedsamplelocations, long __functionAddress);

	/**
	 * 
	 *
	 * @param samples              
	 * @param fixedsamplelocations 
	 */
	public static void glRasterSamplesEXT(int samples, boolean fixedsamplelocations) {
		long __functionAddress = getInstance().RasterSamplesEXT;
		nglRasterSamplesEXT(samples, fixedsamplelocations, __functionAddress);
	}

	// --- [ glCoverageModulationTableNV ] ---

	/** JNI method for {@link #glCoverageModulationTableNV CoverageModulationTableNV} */
	@JavadocExclude
	public static native void nglCoverageModulationTableNV(int n, long v, long __functionAddress);

	/** Unsafe version of {@link #glCoverageModulationTableNV CoverageModulationTableNV} */
	@JavadocExclude
	public static void nglCoverageModulationTableNV(int n, long v) {
		long __functionAddress = getInstance().CoverageModulationTableNV;
		nglCoverageModulationTableNV(n, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param n The size of the coverage modulation table. Must be equal to the value of COVERAGE_MODULATION_TABLE_SIZE_NV.
	 * @param v 
	 */
	public static void glCoverageModulationTableNV(int n, ByteBuffer v) {
		nglCoverageModulationTableNV(n, memAddress(v));
	}

	/** Alternative version of: {@link #glCoverageModulationTableNV CoverageModulationTableNV} */
	public static void glCoverageModulationTableNV(int n, FloatBuffer v) {
		nglCoverageModulationTableNV(n, memAddress(v));
	}

	// --- [ glGetCoverageModulationTableNV ] ---

	/** JNI method for {@link #glGetCoverageModulationTableNV GetCoverageModulationTableNV} */
	@JavadocExclude
	public static native void nglGetCoverageModulationTableNV(int bufsize, long v, long __functionAddress);

	/** Unsafe version of {@link #glGetCoverageModulationTableNV GetCoverageModulationTableNV} */
	@JavadocExclude
	public static void nglGetCoverageModulationTableNV(int bufsize, long v) {
		long __functionAddress = getInstance().GetCoverageModulationTableNV;
		nglGetCoverageModulationTableNV(bufsize, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param bufsize 
	 * @param v       
	 */
	public static void glGetCoverageModulationTableNV(int bufsize, ByteBuffer v) {
		nglGetCoverageModulationTableNV(bufsize, memAddress(v));
	}

	/** Alternative version of: {@link #glGetCoverageModulationTableNV GetCoverageModulationTableNV} */
	public static void glGetCoverageModulationTableNV(int bufsize, FloatBuffer v) {
		nglGetCoverageModulationTableNV(bufsize, memAddress(v));
	}

	// --- [ glCoverageModulationNV ] ---

	/** JNI method for {@link #glCoverageModulationNV CoverageModulationNV} */
	@JavadocExclude
	public static native void nglCoverageModulationNV(int components, long __functionAddress);

	/**
	 * 
	 *
	 * @param components 
	 */
	public static void glCoverageModulationNV(int components) {
		long __functionAddress = getInstance().CoverageModulationNV;
		nglCoverageModulationNV(components, __functionAddress);
	}

}