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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/stencil_two_side.txt">EXT_stencil_two_side</a> extension.
 * 
 * <p>This extension provides two-sided stencil testing where the stencil-related state (stencil operations, reference value, compare mask, and write mask)
 * may be different for front- and back-facing polygons. Two-sided stencil testing may improve the performance of stenciled shadow volume and Constructive
 * Solid Geometry (CSG) rendering algorithms.</p>
 */
public final class EXTStencilTwoSide {

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int GL_STENCIL_TEST_TWO_SIDE_EXT = 0x8910;

	/** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_ACTIVE_STENCIL_FACE_EXT = 0x8911;

	/** Function address. */
	@JavadocExclude
	public final long ActiveStencilFaceEXT;

	@JavadocExclude
	public EXTStencilTwoSide(FunctionProvider provider) {
		ActiveStencilFaceEXT = provider.getFunctionAddress("glActiveStencilFaceEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTStencilTwoSide} instance for the current context. */
	public static EXTStencilTwoSide getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTStencilTwoSide);
	}

	static EXTStencilTwoSide create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_stencil_two_side") ) return null;

		EXTStencilTwoSide funcs = new EXTStencilTwoSide(provider);

		boolean supported = checkFunctions(
			funcs.ActiveStencilFaceEXT
		);

		return GL.checkExtension("GL_EXT_stencil_two_side", funcs, supported);
	}

	// --- [ glActiveStencilFaceEXT ] ---

	public static void glActiveStencilFaceEXT(int face) {
		long __functionAddress = getInstance().ActiveStencilFaceEXT;
		callIV(__functionAddress, face);
	}

}