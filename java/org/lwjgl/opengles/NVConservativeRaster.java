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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/conservative_raster.txt">NV_conservative_raster</a> extension.
 * 
 * <p>This extension adds a "conservative" rasterization mode where any pixel that is partially covered, even if no sample location is covered, is treated as
 * fully covered and a corresponding fragment will be shaded.</p>
 * 
 * <p>A new control is also added to modify window coordinate snapping precision.</p>
 * 
 * <p>These controls can be used to implement "binning" to a low-resolution render target, for example to determine which tiles of a sparse texture need to
 * be populated. An app can construct a framebuffer where there is one pixel per tile in the sparse texture, and adjust the number of subpixel bits such
 * that snapping occurs to the same effective grid as when rendering to the sparse texture. Then triangles should cover (at least) the same pixels in the
 * low-res framebuffer as they do tiles in the sparse texture.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class NVConservativeRaster {

	/** Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled. */
	public static final int GL_CONSERVATIVE_RASTERIZATION_NV = 0x9346;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV   = 0x9347,
		GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV   = 0x9348,
		GL_MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV = 0x9349;

	/** Function address. */
	@JavadocExclude
	public final long SubpixelPrecisionBiasNV;

	@JavadocExclude
	public NVConservativeRaster(FunctionProvider provider) {
		SubpixelPrecisionBiasNV = provider.getFunctionAddress("glSubpixelPrecisionBiasNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVConservativeRaster} instance for the current context. */
	public static NVConservativeRaster getInstance() {
		return checkFunctionality(GLES.getCapabilities().__NVConservativeRaster);
	}

	static NVConservativeRaster create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_conservative_raster") ) return null;

		NVConservativeRaster funcs = new NVConservativeRaster(provider);
		boolean supported = checkFunctions(
			funcs.SubpixelPrecisionBiasNV
		);

		return GLES.checkExtension("GL_NV_conservative_raster", funcs, supported);
	}

	// --- [ glSubpixelPrecisionBiasNV ] ---

	public static void glSubpixelPrecisionBiasNV(int xbits, int ybits) {
		long __functionAddress = getInstance().SubpixelPrecisionBiasNV;
		callIIV(__functionAddress, xbits, ybits);
	}

}