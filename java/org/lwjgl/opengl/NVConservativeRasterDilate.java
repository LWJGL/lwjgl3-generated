/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

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
public final class NVConservativeRasterDilate {

	/** Accepted by the {@code pname} parameter of ConservativeRasterParameterfNV, GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_CONSERVATIVE_RASTER_DILATE_NV             = 0x9379,
		GL_CONSERVATIVE_RASTER_DILATE_RANGE_NV       = 0x937A,
		GL_CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV = 0x937B;

	/** Function address. */
	@JavadocExclude
	public final long ConservativeRasterParameterfNV;

	@JavadocExclude
	public NVConservativeRasterDilate(FunctionProvider provider) {
		ConservativeRasterParameterfNV = provider.getFunctionAddress("glConservativeRasterParameterfNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVConservativeRasterDilate} instance for the current context. */
	public static NVConservativeRasterDilate getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVConservativeRasterDilate);
	}

	static NVConservativeRasterDilate create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_conservative_raster_dilate") ) return null;

		NVConservativeRasterDilate funcs = new NVConservativeRasterDilate(provider);

		boolean supported = checkFunctions(
			funcs.ConservativeRasterParameterfNV
		);

		return GL.checkExtension("GL_NV_conservative_raster_dilate", funcs, supported);
	}

	// --- [ glConservativeRasterParameterfNV ] ---

	public static void glConservativeRasterParameterfNV(int pname, float value) {
		long __functionAddress = getInstance().ConservativeRasterParameterfNV;
		callIFV(__functionAddress, pname, value);
	}

}