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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/point_parameters.txt">EXT_point_parameters</a> extension.
 * 
 * <p>This extension supports additional geometric characteristics of points. It can be used to render particles or tiny light sources, commonly referred as
 * "Light points".</p>
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
 * <p>This extension defines a derived point size to be closely related to point brightness. The brightness of a point is given by:
 * <pre><code style="font-family: monospace">
 * 						1
 * dist_atten(d) = -------------------
 *                 a + b * d + c * d^2
 * 
 * brightness(Pe) = Brightness * dist_atten(|Pe|)</code></pre>
 * where 'Pe' is the point in eye coordinates, and 'Brightness' is some initial value proportional to the square of the size provided with glPointSize.
 * Here we simplify the raster brightness to be a function of the rasterized point area and point transparency.
 * <pre><code style="font-family: monospace">
 * 			brightness(Pe)      brightness(Pe) >= Threshold_Area
 * area(Pe) =
 * 			Threshold_Area      Otherwise
 * 
 * factor(Pe) = brightness(Pe)/Threshold_Area
 * 
 * alpha(Pe) = Alpha * factor(Pe)</code></pre>
 * where 'Alpha' comes with the point color (possibly modified by lighting).</p>
 * 
 * <p>'Threshold_Area' above is in area units. Thus, it is proportional to the square of the threshold provided by the programmer through this extension.</p>
 * 
 * <p>The new point size derivation method applies to all points, while the threshold applies to multisample points only.</p>
 */
public final class EXTPointParameters {

	/** Accepted by the {@code pname} parameter of glPointParameterfvEXT, and the {@code pname} of glGet. */
	public static final int
		GL_POINT_SIZE_MIN_EXT            = 0x8126,
		GL_POINT_SIZE_MAX_EXT            = 0x8127,
		GL_POINT_FADE_THRESHOLD_SIZE_EXT = 0x8128,
		GL_DISTANCE_ATTENUATION_EXT      = 0x8129;

	/** Function address. */
	@JavadocExclude
	public final long
		PointParameterfEXT,
		PointParameterfvEXT;

	@JavadocExclude
	public EXTPointParameters(FunctionProvider provider) {
		PointParameterfEXT = provider.getFunctionAddress("glPointParameterfEXT");
		PointParameterfvEXT = provider.getFunctionAddress("glPointParameterfvEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTPointParameters} instance for the current context. */
	public static EXTPointParameters getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTPointParameters);
	}

	static EXTPointParameters create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_point_parameters") ) return null;

		EXTPointParameters funcs = new EXTPointParameters(provider);

		boolean supported = checkFunctions(
			funcs.PointParameterfEXT, funcs.PointParameterfvEXT
		);

		return GL.checkExtension("GL_EXT_point_parameters", funcs, supported);
	}

	// --- [ glPointParameterfEXT ] ---

	/** JNI method for {@link #glPointParameterfEXT PointParameterfEXT} */
	@JavadocExclude
	public static native void nglPointParameterfEXT(int pname, float param, long __functionAddress);

	/**
	 * 
	 *
	 * @param pname 
	 * @param param 
	 */
	public static void glPointParameterfEXT(int pname, float param) {
		long __functionAddress = getInstance().PointParameterfEXT;
		nglPointParameterfEXT(pname, param, __functionAddress);
	}

	// --- [ glPointParameterfvEXT ] ---

	/** JNI method for {@link #glPointParameterfvEXT PointParameterfvEXT} */
	@JavadocExclude
	public static native void nglPointParameterfvEXT(int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glPointParameterfvEXT PointParameterfvEXT} */
	@JavadocExclude
	public static void nglPointParameterfvEXT(int pname, long params) {
		long __functionAddress = getInstance().PointParameterfvEXT;
		nglPointParameterfvEXT(pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param pname  
	 * @param params 
	 */
	public static void glPointParameterfvEXT(int pname, ByteBuffer params) {
		nglPointParameterfvEXT(pname, memAddress(params));
	}

	/** Alternative version of: {@link #glPointParameterfvEXT PointParameterfvEXT} */
	public static void glPointParameterfvEXT(int pname, FloatBuffer params) {
		nglPointParameterfvEXT(pname, memAddress(params));
	}

}