/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/point_parameters.txt">ARB_point_parameters</a> extension.
 * 
 * <p>This extension supports additional geometric characteristics of points. It can be used to render particles or tiny light sources, commonly referred to
 * as "Light points".</p>
 * 
 * <p>The raster brightness of a point is a function of the point area, point color, point transparency, and the response of the display's electron gun and
 * phosphor. The point area and the point transparency are derived from the point size, currently provided with the {@code size} parameter of
 * {@link GL11#glPointSize PointSize}.</p>
 * 
 * <p>The primary motivation is to allow the size of a point to be affected by distance attenuation. When distance attenuation has an effect, the final point
 * size decreases as the distance of the point from the eye increases.</p>
 * 
 * <p>The secondary motivation is a mean to control the mapping from the point size to the raster point area and point transparency. This is done in order to
 * increase the dynamic range of the raster brightness of points. In other words, the alpha component of a point may be decreased (and its transparency
 * increased) as its area shrinks below a defined threshold.</p>
 * 
 * <p>Promoted to core in {@link GL14 OpenGL 1.4}.</p>
 */
public class ARBPointParameters {

	/** Accepted by the {@code pname} parameter of PointParameterfvARB, and the {@code pname} of Get. */
	public static final int
		GL_POINT_SIZE_MIN_ARB             = 0x8126,
		GL_POINT_SIZE_MAX_ARB             = 0x8127,
		GL_POINT_FADE_THRESHOLD_SIZE_ARB  = 0x8128,
		GL_POINT_DISTANCE_ATTENUATION_ARB = 0x8129;

	protected ARBPointParameters() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glPointParameterfARB, caps.glPointParameterfvARB
		);
	}

	// --- [ glPointParameterfARB ] ---

	/**
	 * Sets the float value of a pointer parameter.
	 *
	 * @param pname the parameter to set. One of:<br><table><tr><td>{@link #GL_POINT_SIZE_MIN_ARB POINT_SIZE_MIN_ARB}</td><td>{@link #GL_POINT_SIZE_MAX_ARB POINT_SIZE_MAX_ARB}</td><td>{@link #GL_POINT_FADE_THRESHOLD_SIZE_ARB POINT_FADE_THRESHOLD_SIZE_ARB}</td></tr></table>
	 * @param param the parameter value
	 */
	public static void glPointParameterfARB(int pname, float param) {
		long __functionAddress = GL.getCapabilities().glPointParameterfARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, pname, param);
	}

	// --- [ glPointParameterfvARB ] ---

	/**
	 * Pointer version of {@link #glPointParameterfARB PointParameterfARB}.
	 *
	 * @param pname  the parameter to set. Must be:<br><table><tr><td>{@link #GL_POINT_DISTANCE_ATTENUATION_ARB POINT_DISTANCE_ATTENUATION_ARB}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void nglPointParameterfvARB(int pname, long params) {
		long __functionAddress = GL.getCapabilities().glPointParameterfvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pname, params);
	}

	/**
	 * Pointer version of {@link #glPointParameterfARB PointParameterfARB}.
	 *
	 * @param pname  the parameter to set. Must be:<br><table><tr><td>{@link #GL_POINT_DISTANCE_ATTENUATION_ARB POINT_DISTANCE_ATTENUATION_ARB}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void glPointParameterfvARB(int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 3);
		nglPointParameterfvARB(pname, memAddress(params));
	}

	/** Array version of: {@link #glPointParameterfvARB PointParameterfvARB} */
	public static void glPointParameterfvARB(int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glPointParameterfvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 3);
		}
		callPV(__functionAddress, pname, params);
	}

}