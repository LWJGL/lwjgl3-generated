/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
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
public final class ARBPointParameters {

	/** Accepted by the {@code pname} parameter of PointParameterfvARB, and the {@code pname} of Get. */
	public static final int
		GL_POINT_SIZE_MIN_ARB             = 0x8126,
		GL_POINT_SIZE_MAX_ARB             = 0x8127,
		GL_POINT_FADE_THRESHOLD_SIZE_ARB  = 0x8128,
		GL_POINT_DISTANCE_ATTENUATION_ARB = 0x8129;

	/** Function address. */
	@JavadocExclude
	public final long
		PointParameterfARB,
		PointParameterfvARB;

	@JavadocExclude
	public ARBPointParameters(FunctionProvider provider) {
		PointParameterfARB = provider.getFunctionAddress("glPointParameterfARB");
		PointParameterfvARB = provider.getFunctionAddress("glPointParameterfvARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBPointParameters} instance for the current context. */
	public static ARBPointParameters getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBPointParameters);
	}

	static ARBPointParameters create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_point_parameters") ) return null;

		ARBPointParameters funcs = new ARBPointParameters(provider);

		boolean supported = checkFunctions(
			funcs.PointParameterfARB, funcs.PointParameterfvARB
		);

		return GL.checkExtension("GL_ARB_point_parameters", funcs, supported);
	}

	// --- [ glPointParameterfARB ] ---

	/** JNI method for {@link #glPointParameterfARB PointParameterfARB} */
	@JavadocExclude
	public static native void nglPointParameterfARB(int pname, float param, long __functionAddress);

	/**
	 * Sets the float value of a pointer parameter.
	 *
	 * @param pname the parameter to set. One of:<br>{@link #GL_POINT_SIZE_MIN_ARB POINT_SIZE_MIN_ARB}, {@link #GL_POINT_SIZE_MAX_ARB POINT_SIZE_MAX_ARB}, {@link #GL_POINT_FADE_THRESHOLD_SIZE_ARB POINT_FADE_THRESHOLD_SIZE_ARB}
	 * @param param the parameter value
	 */
	public static void glPointParameterfARB(int pname, float param) {
		long __functionAddress = getInstance().PointParameterfARB;
		nglPointParameterfARB(pname, param, __functionAddress);
	}

	// --- [ glPointParameterfvARB ] ---

	/** JNI method for {@link #glPointParameterfvARB PointParameterfvARB} */
	@JavadocExclude
	public static native void nglPointParameterfvARB(int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glPointParameterfvARB PointParameterfvARB} */
	@JavadocExclude
	public static void nglPointParameterfvARB(int pname, long params) {
		long __functionAddress = getInstance().PointParameterfvARB;
		nglPointParameterfvARB(pname, params, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glPointParameterfARB PointParameterfARB}.
	 *
	 * @param pname  the parameter to set. Must be:<br>{@link #GL_POINT_DISTANCE_ATTENUATION_ARB POINT_DISTANCE_ATTENUATION_ARB}
	 * @param params the parameter value
	 */
	public static void glPointParameterfvARB(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 3 << 2);
		nglPointParameterfvARB(pname, memAddress(params));
	}

	/** Alternative version of: {@link #glPointParameterfvARB PointParameterfvARB} */
	public static void glPointParameterfvARB(int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 3);
		nglPointParameterfvARB(pname, memAddress(params));
	}

}