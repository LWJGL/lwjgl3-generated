/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/raster_multisample.txt">EXT_raster_multisample</a> extension.
 * 
 * <p>This extension allows rendering to a non-multisample color buffer while rasterizing with more than one sample. The result of rasterization (coverage)
 * is available in the {@code gl_SampleMaskIn[]} fragment shader input, multisample rasterization is enabled for all primitives, and several per- fragment
 * operations operate at the raster sample rate.</p>
 * 
 * <p>When using the functionality provided by this extension, depth, stencil, and depth bounds tests must be disabled, and a multisample draw framebuffer
 * must not be used.</p>
 * 
 * <p>A fragment's "coverage", or "effective raster samples" is considered to have "N bits" (as opposed to "one bit" corresponding to the single color
 * sample) through the fragment shader, in the sample mask output, through the multisample fragment operations and occlusion query, until the coverage is
 * finally "reduced" to a single bit in a new "Coverage Reduction" stage that occurs before blending.</p>
 */
public final class EXTRasterMultisample {

	/** Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled. */
	public static final int GL_RASTER_MULTISAMPLE_EXT = 0x9327;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_RASTER_SAMPLES_EXT                    = 0x9328,
		GL_MAX_RASTER_SAMPLES_EXT                = 0x9329,
		GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT     = 0x932A,
		GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT = 0x932B,
		GL_EFFECTIVE_RASTER_SAMPLES_EXT          = 0x932C;

	/** Function address. */
	@JavadocExclude
	public final long RasterSamplesEXT;

	@JavadocExclude
	public EXTRasterMultisample(FunctionProvider provider) {
		RasterSamplesEXT = provider.getFunctionAddress("glRasterSamplesEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTRasterMultisample} instance for the current context. */
	public static EXTRasterMultisample getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTRasterMultisample);
	}

	static EXTRasterMultisample create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_raster_multisample") ) return null;

		EXTRasterMultisample funcs = new EXTRasterMultisample(provider);

		boolean supported = checkFunctions(
			funcs.RasterSamplesEXT
		);

		return GL.checkExtension("GL_EXT_raster_multisample", funcs, supported);
	}

	// --- [ glRasterSamplesEXT ] ---

	/** JNI method for {@link #glRasterSamplesEXT RasterSamplesEXT} */
	@JavadocExclude
	public static native void nglRasterSamplesEXT(int samples, boolean fixedsamplelocations, long __functionAddress);

	/**
	 * Selects the number of samples to be used for rasterization. {@code samples} represents a request for a desired minimum number of samples. Since
	 * different implementations may support different sample counts, the actual sample pattern used is implementation-dependent. However, the resulting value
	 * for {@link #GL_RASTER_SAMPLES_EXT RASTER_SAMPLES_EXT} is guaranteed to be greater than or equal to {@code samples} and no more than the next larger sample count supported by the
	 * implementation. If {@code fixedsamplelocations} is {@link GL11#GL_TRUE TRUE}, identical sample locations will be used for all pixels. The sample locations chosen are a
	 * function of only the parameters to RasterSamplesEXT and not of any other state.
	 * 
	 * <p>If {@link #GL_RASTER_MULTISAMPLE_EXT RASTER_MULTISAMPLE_EXT} is enabled, then the sample pattern chosen by RasterSamplesEXT will be used instead of sampling at the center of the pixel.
	 * The sample locations can be queried with {@link GL32#glGetMultisamplefv GetMultisamplefv} with a {@code pname} of {@link GL32#GL_SAMPLE_POSITION SAMPLE_POSITION}, similar to normal multisample sample
	 * locations.</p>
	 * 
	 * <p>The value {@link #GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT MULTISAMPLE_RASTERIZATION_ALLOWED_EXT} is {@link GL11#GL_TRUE TRUE} if {@link GL13#GL_SAMPLE_BUFFERS SAMPLE_BUFFERS} is one or if {@link #GL_RASTER_MULTISAMPLE_EXT RASTER_MULTISAMPLE_EXT} is enabled. The value
	 * {@link #GL_EFFECTIVE_RASTER_SAMPLES_EXT EFFECTIVE_RASTER_SAMPLES_EXT} is equal to {@link #GL_RASTER_SAMPLES_EXT RASTER_SAMPLES_EXT} if {@link #GL_RASTER_MULTISAMPLE_EXT RASTER_MULTISAMPLE_EXT} is enabled, otherwise is equal to {@link GL13#GL_SAMPLES SAMPLES}.</p>
	 * 
	 * <p>Explicit multisample rasterization can not be used in conjunction with depth, stencil, or depth bounds tests, multisample framebuffers, or if
	 * {@link #GL_RASTER_SAMPLES_EXT RASTER_SAMPLES_EXT} is zero. If {@link #GL_RASTER_MULTISAMPLE_EXT RASTER_MULTISAMPLE_EXT} is enabled, the error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} will be generated by Draw commands if
	 * <ul>
	 * <li>the value of {@link #GL_RASTER_SAMPLES_EXT RASTER_SAMPLES_EXT} is zero</li>
	 * <li>the depth, stencil, or depth bounds test is enabled</li>
	 * <li>a multisample draw framebuffer is bound ({@link GL13#GL_SAMPLE_BUFFERS SAMPLE_BUFFERS} is one)</li>
	 * </ul>
	 * <h3>Errors</h3></p>
	 * 
	 * <p>An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if {@code samples} is greater than the value of {@link #GL_MAX_RASTER_SAMPLES_EXT MAX_RASTER_SAMPLES_EXT} (the implementation-dependent maximum
	 * number of samples).</p>
	 *
	 * @param samples              the number of samples to be used for rasterization
	 * @param fixedsamplelocations if {@link GL11#GL_TRUE TRUE}, identical sample locations will be used for all pixels
	 */
	public static void glRasterSamplesEXT(int samples, boolean fixedsamplelocations) {
		long __functionAddress = getInstance().RasterSamplesEXT;
		nglRasterSamplesEXT(samples, fixedsamplelocations, __functionAddress);
	}

}