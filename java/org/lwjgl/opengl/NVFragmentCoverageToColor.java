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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/fragment_coverage_to_color.txt">NV_fragment_coverage_to_color</a> extension.
 * 
 * <p>This extension allows the fragment coverage value, represented as an
 * integer bitfield, to be substituted for a color output being written to a
 * single-component color buffer with integer components (e.g., R8UI).  The
 * capability provided by this extension is different from simply writing the
 * gl_SampleMask fragment shader output in that the coverage value written to
 * the framebuffer is taken after alpha test, stencil test, and depth test,
 * as well as after the multisample fragment operations such as
 * alpha-to-coverage.</p>
 */
public final class NVFragmentCoverageToColor {

	/** Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled. */
	public static final int GL_FRAGMENT_COVERAGE_TO_COLOR_NV = 0x92DD;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int GL_FRAGMENT_COVERAGE_COLOR_NV = 0x92DE;

	/** Function address. */
	@JavadocExclude
	public final long FragmentCoverageColorNV;

	@JavadocExclude
	public NVFragmentCoverageToColor(FunctionProvider provider) {
		FragmentCoverageColorNV = provider.getFunctionAddress("glFragmentCoverageColorNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVFragmentCoverageToColor} instance for the current context. */
	public static NVFragmentCoverageToColor getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVFragmentCoverageToColor);
	}

	static NVFragmentCoverageToColor create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_fragment_coverage_to_color") ) return null;

		NVFragmentCoverageToColor funcs = new NVFragmentCoverageToColor(provider);

		boolean supported = checkFunctions(
			funcs.FragmentCoverageColorNV
		);

		return GL.checkExtension("GL_NV_fragment_coverage_to_color", funcs, supported);
	}

	// --- [ glFragmentCoverageColorNV ] ---

	/** JNI method for {@link #glFragmentCoverageColorNV FragmentCoverageColorNV} */
	@JavadocExclude
	public static native void nglFragmentCoverageColorNV(int color, long __functionAddress);

	/**
	 * 
	 *
	 * @param color the draw buffer index that the coverage value will be written to. Must be between 0 and the value of MAX_DRAW_BUFFERS minus one, inclusive.
	 */
	public static void glFragmentCoverageColorNV(int color) {
		long __functionAddress = getInstance().FragmentCoverageColorNV;
		nglFragmentCoverageColorNV(color, __functionAddress);
	}

}