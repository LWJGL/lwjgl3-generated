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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/blend_equation_advanced.txt">NV_blend_equation_advanced</a> extension.
 * 
 * <p>This extension adds a number of "advanced" blending equations that can be
 * used to perform new color blending operations, many of which are more
 * complex than the standard blend modes provided by unextended OpenGL.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public final class NVBlendEquationAdvanced {

	/**
	 * Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev
	 * and GetInteger64v.
	 */
	public static final int GL_BLEND_ADVANCED_COHERENT_NV = 0x9285;

	/** Accepted by the {@code pname} parameter of BlendParameteriNV, GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_BLEND_PREMULTIPLIED_SRC_NV = 0x9280,
		GL_BLEND_OVERLAP_NV           = 0x9281;

	/** Accepted by the {@code value} parameter of BlendParameteriNV when <pname> is BLEND_OVERLAP_NV. */
	public static final int
		GL_UNCORRELATED_NV = 0x8521,
		GL_DISJOINT_NV     = 0x9283,
		GL_CONJOINT_NV     = 0x9284;

	/** Accepted by the {@code mode} parameter of BlendEquation and BlendEquationi. */
	public static final int
		GL_SRC_NV                = 0x9286,
		GL_DST_NV                = 0x9287,
		GL_SRC_OVER_NV           = 0x9288,
		GL_DST_OVER_NV           = 0x9289,
		GL_SRC_IN_NV             = 0x928A,
		GL_DST_IN_NV             = 0x928B,
		GL_SRC_OUT_NV            = 0x928C,
		GL_DST_OUT_NV            = 0x928D,
		GL_SRC_ATOP_NV           = 0x928E,
		GL_DST_ATOP_NV           = 0x928F,
		GL_XOR_NV                = 0x1506,
		GL_MULTIPLY_NV           = 0x9294,
		GL_SCREEN_NV             = 0x9295,
		GL_OVERLAY_NV            = 0x9296,
		GL_DARKEN_NV             = 0x9297,
		GL_LIGHTEN_NV            = 0x9298,
		GL_COLORDODGE_NV         = 0x9299,
		GL_COLORBURN_NV          = 0x929A,
		GL_HARDLIGHT_NV          = 0x929B,
		GL_SOFTLIGHT_NV          = 0x929C,
		GL_DIFFERENCE_NV         = 0x929E,
		GL_EXCLUSION_NV          = 0x92A0,
		GL_INVERT_RGB_NV         = 0x92A3,
		GL_LINEARDODGE_NV        = 0x92A4,
		GL_LINEARBURN_NV         = 0x92A5,
		GL_VIVIDLIGHT_NV         = 0x92A6,
		GL_LINEARLIGHT_NV        = 0x92A7,
		GL_PINLIGHT_NV           = 0x92A8,
		GL_HARDMIX_NV            = 0x92A9,
		GL_HSL_HUE_NV            = 0x92AD,
		GL_HSL_SATURATION_NV     = 0x92AE,
		GL_HSL_COLOR_NV          = 0x92AF,
		GL_HSL_LUMINOSITY_NV     = 0x92B0,
		GL_PLUS_NV               = 0x9291,
		GL_PLUS_CLAMPED_NV       = 0x92B1,
		GL_PLUS_CLAMPED_ALPHA_NV = 0x92B2,
		GL_PLUS_DARKER_NV        = 0x9292,
		GL_MINUS_NV              = 0x929F,
		GL_MINUS_CLAMPED_NV      = 0x92B3,
		GL_CONTRAST_NV           = 0x92A1,
		GL_INVERT_OVG_NV         = 0x92B4,
		GL_RED_NV                = 0x1903,
		GL_GREEN_NV              = 0x1904,
		GL_BLUE_NV               = 0x1905;

	/** Function address. */
	@JavadocExclude
	public final long
		BlendParameteriNV,
		BlendBarrierNV;

	@JavadocExclude
	public NVBlendEquationAdvanced(FunctionProvider provider) {
		BlendParameteriNV = provider.getFunctionAddress("glBlendParameteriNV");
		BlendBarrierNV = provider.getFunctionAddress("glBlendBarrierNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVBlendEquationAdvanced} instance for the current context. */
	public static NVBlendEquationAdvanced getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVBlendEquationAdvanced);
	}

	static NVBlendEquationAdvanced create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_blend_equation_advanced") ) return null;

		NVBlendEquationAdvanced funcs = new NVBlendEquationAdvanced(provider);

		boolean supported = checkFunctions(
			funcs.BlendParameteriNV, funcs.BlendBarrierNV
		);

		return GL.checkExtension("GL_NV_blend_equation_advanced", funcs, supported);
	}

	// --- [ glBlendParameteriNV ] ---

	/** JNI method for {@link #glBlendParameteriNV BlendParameteriNV} */
	@JavadocExclude
	public static native void nglBlendParameteriNV(int pname, int value, long __functionAddress);

	/**
	 * 
	 *
	 * @param pname 
	 * @param value 
	 */
	public static void glBlendParameteriNV(int pname, int value) {
		long __functionAddress = getInstance().BlendParameteriNV;
		nglBlendParameteriNV(pname, value, __functionAddress);
	}

	// --- [ glBlendBarrierNV ] ---

	/** JNI method for {@link #glBlendBarrierNV BlendBarrierNV} */
	@JavadocExclude
	public static native void nglBlendBarrierNV(long __functionAddress);

	/**  */
	public static void glBlendBarrierNV() {
		long __functionAddress = getInstance().BlendBarrierNV;
		nglBlendBarrierNV(__functionAddress);
	}

}