/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/conservative_raster_dilate.txt">NV_conservative_raster_dilate</a> extension.
 * 
 * <p>This extension extends the conservative rasterization funtionality provided by NV_conservative_raster. It provides a new control to generate an
 * "over-conservative" rasterization by dilating primitives prior to rasterization.</p>
 * 
 * <p>When using conservative raster to bin geometry, this extension provides a programmable overlap region between adjacent primitives. Regular
 * rasterization bins triangles with a shared edge uniquely into pixels. Conservative raster has a one-pixel overlap along the shared edge. Using a
 * half-pixel raster dilation, this overlap region increases to two pixels.</p>
 * 
 * <p>Requires {@link NVConservativeRaster NV_conservative_raster}.</p>
 */
public class NVConservativeRasterDilate {

	/** Accepted by the {@code pname} parameter of ConservativeRasterParameterfNV, GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_CONSERVATIVE_RASTER_DILATE_NV             = 0x9379,
		GL_CONSERVATIVE_RASTER_DILATE_RANGE_NV       = 0x937A,
		GL_CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV = 0x937B;

	protected NVConservativeRasterDilate() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glConservativeRasterParameterfNV
		);
	}

	// --- [ glConservativeRasterParameterfNV ] ---

	public static void glConservativeRasterParameterfNV(int pname, float value) {
		long __functionAddress = GL.getCapabilities().glConservativeRasterParameterfNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, pname, value);
	}

}