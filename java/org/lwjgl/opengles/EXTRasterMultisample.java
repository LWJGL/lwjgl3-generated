/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/raster_multisample.txt">EXT_raster_multisample</a> extension.
 * 
 * <p>This extension allows rendering to a non-multisample color buffer while rasterizing with more than one sample. The result of rasterization (coverage)
 * is available in the gl_SampleMaskIn[] fragment shader input, multisample rasterization is enabled for all primitives, and several per- fragment
 * operations operate at the raster sample rate.</p>
 * 
 * <p>When using the functionality provided by this extension, depth, stencil, and depth bounds tests must be disabled, and a multisample draw framebuffer
 * must not be used.</p>
 * 
 * <p>A fragment's "coverage", or "effective raster samples" is considered to have "N bits" (as opposed to "one bit" corresponding to the single color
 * sample) through the fragment shader, in the sample mask output, through the multisample fragment operations and occlusion query, until the coverage is
 * finally "reduced" to a single bit in a new "Coverage Reduction" stage that occurs before blending.</p>
 * 
 * <p>Requires {@link GLES30 GLES E.S}.</p>
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
		return checkFunctionality(GLES.getCapabilities().__EXTRasterMultisample);
	}

	static EXTRasterMultisample create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_raster_multisample") ) return null;

		EXTRasterMultisample funcs = new EXTRasterMultisample(provider);
		boolean supported = checkFunctions(
			funcs.RasterSamplesEXT
		);

		return GLES.checkExtension("GL_EXT_raster_multisample", funcs, supported);
	}

	// --- [ glRasterSamplesEXT ] ---

	public static void glRasterSamplesEXT(int samples, boolean fixedsamplelocations) {
		long __functionAddress = getInstance().RasterSamplesEXT;
		callIZV(__functionAddress, samples, fixedsamplelocations);
	}

}