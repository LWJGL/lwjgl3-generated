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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_polygon_mode.txt">NV_polygon_mode</a> extension.
 * 
 * <p>This extension adds a PolygonModeNV entry point which can be used to change the polygon rasterization method. Using this extension, state consistent
 * with rendering triangle primitives can trivially be toggled to render primitives as lines or points. In addition, independent enables are provided for
 * polygon offset in conjunction with these new point and line polygon modes.</p>
 * 
 * <p>This introduces a level of support for PolygonMode comparable with the OpenGL 4.3 core profile.</p>
 */
public final class NVPolygonMode {

	/** Accepted by the {@code pname} parameter to GetIntegerv. */
	public static final int GL_POLYGON_MODE_NV = 0xB40;

	/** Accepted by the {@code pname} parameter to IsEnabled. */
	public static final int
		GL_POLYGON_OFFSET_POINT_NV = 0x2A01,
		GL_POLYGON_OFFSET_LINE_NV  = 0x2A02;

	/** Returned by GetIntegerv, GetFloatv, and GetInteger64v when {@code pname} is POLYGON_MODE_NV. */
	public static final int
		GL_POINT_NV = 0x1B00,
		GL_LINE_NV  = 0x1B01,
		GL_FILL_NV  = 0x1B02;

	/** Function address. */
	@JavadocExclude
	public final long PolygonModeNV;

	@JavadocExclude
	public NVPolygonMode(FunctionProvider provider) {
		PolygonModeNV = provider.getFunctionAddress("glPolygonModeNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVPolygonMode} instance for the current context. */
	public static NVPolygonMode getInstance() {
		return checkFunctionality(GLES.getCapabilities().__NVPolygonMode);
	}

	static NVPolygonMode create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_polygon_mode") ) return null;

		NVPolygonMode funcs = new NVPolygonMode(provider);
		boolean supported = checkFunctions(
			funcs.PolygonModeNV
		);

		return GLES.checkExtension("GL_NV_polygon_mode", funcs, supported);
	}

	// --- [ glPolygonModeNV ] ---

	public static void glPolygonModeNV(int face, int mode) {
		long __functionAddress = getInstance().PolygonModeNV;
		callIIV(__functionAddress, face, mode);
	}

}