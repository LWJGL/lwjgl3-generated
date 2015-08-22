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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/framebuffer_mixed_samples.txt">NV_framebuffer_mixed_samples</a> extension.
 * 
 * <p>This extension allows multisample rendering with a raster and depth/stencil sample count that is larger than the color sample count. Rasterization and
 * the results of the depth and stencil tests together determine the portion of a pixel that is "covered". It can be useful to evaluate coverage at a
 * higher frequency than color samples are stored. This coverage is then "reduced" to a collection of covered color samples, each having an opacity value
 * corresponding to the fraction of the color sample covered. The opacity can optionally be blended into individual color samples.</p>
 * 
 * <p>In the current hardware incarnation both depth and stencil testing are supported with mixed samples, although the API accommodates supporting only one
 * or the other.</p>
 * 
 * <p>Rendering with fewer color samples than depth/stencil samples can greatly reduce the amount of memory and bandwidth consumed by the color buffer.
 * However, converting the coverage values into opacity can introduce artifacts where triangles share edges and may not be suitable for normal triangle
 * mesh rendering.</p>
 * 
 * <p>One expected use case for this functionality is Stencil-then-Cover path rendering (NV_path_rendering). The stencil step determines the coverage (in the
 * stencil buffer) for an entire path at the higher sample frequency, and then the cover step can draw the path into the lower frequency color buffer
 * using the coverage information to antialias path edges. With this two-step process, internal edges are fully covered when antialiasing is applied and
 * there is no corruption on these edges.</p>
 * 
 * <p>The key features of this extension are:
 * <ul>
 * <li>It allows a framebuffer object to be considered complete when its depth or stencil samples are a multiple of the number of color samples.</li>
 * <li>It redefines SAMPLES to be the number of depth/stencil samples (if any); otherwise, it uses the number of color samples. SAMPLE_BUFFERS is one if
 * there are multisample depth/stencil attachments. Multisample rasterization and multisample fragment ops are allowed if SAMPLE_BUFFERS is one.</li>
 * <li>It replaces several error checks involving SAMPLE_BUFFERS by error checks directly referencing the number of samples in the relevant attachments.</li>
 * <li>A coverage reduction step is added to Per-Fragment Operations which converts a set of covered raster/depth/stencil samples to a set of covered
 * color samples. The coverage reduction step also includes an optional coverage modulation step, multiplying color values by a fractional opacity
 * corresponding to the number of associated raster/depth/stencil samples covered.</li>
 * </ul></p>
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
		return checkFunctionality(GLES.getCapabilities().__NVFramebufferMixedSamples);
	}

	static NVFramebufferMixedSamples create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_framebuffer_mixed_samples") ) return null;

		NVFramebufferMixedSamples funcs = new NVFramebufferMixedSamples(provider);
		boolean supported = checkFunctions(
			funcs.RasterSamplesEXT, funcs.CoverageModulationTableNV, funcs.GetCoverageModulationTableNV, funcs.CoverageModulationNV
		);

		return GLES.checkExtension("GL_NV_framebuffer_mixed_samples", funcs, supported);
	}

	// --- [ glRasterSamplesEXT ] ---

	public static void glRasterSamplesEXT(int samples, boolean fixedsamplelocations) {
		long __functionAddress = getInstance().RasterSamplesEXT;
		callIZV(__functionAddress, samples, fixedsamplelocations);
	}

	// --- [ glCoverageModulationTableNV ] ---

	/** Unsafe version of {@link #glCoverageModulationTableNV CoverageModulationTableNV} */
	@JavadocExclude
	public static void nglCoverageModulationTableNV(int n, long v) {
		long __functionAddress = getInstance().CoverageModulationTableNV;
		callIPV(__functionAddress, n, v);
	}

	public static void glCoverageModulationTableNV(int n, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, n << 2);
		nglCoverageModulationTableNV(n, memAddress(v));
	}

	/** Alternative version of: {@link #glCoverageModulationTableNV CoverageModulationTableNV} */
	public static void glCoverageModulationTableNV(FloatBuffer v) {
		nglCoverageModulationTableNV(v.remaining(), memAddress(v));
	}

	// --- [ glGetCoverageModulationTableNV ] ---

	/** Unsafe version of {@link #glGetCoverageModulationTableNV GetCoverageModulationTableNV} */
	@JavadocExclude
	public static void nglGetCoverageModulationTableNV(int bufsize, long v) {
		long __functionAddress = getInstance().GetCoverageModulationTableNV;
		callIPV(__functionAddress, bufsize, v);
	}

	public static void glGetCoverageModulationTableNV(int bufsize, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, bufsize << 2);
		nglGetCoverageModulationTableNV(bufsize, memAddress(v));
	}

	/** Alternative version of: {@link #glGetCoverageModulationTableNV GetCoverageModulationTableNV} */
	public static void glGetCoverageModulationTableNV(FloatBuffer v) {
		nglGetCoverageModulationTableNV(v.remaining(), memAddress(v));
	}

	// --- [ glCoverageModulationNV ] ---

	public static void glCoverageModulationNV(int components) {
		long __functionAddress = getInstance().CoverageModulationNV;
		callIV(__functionAddress, components);
	}

}