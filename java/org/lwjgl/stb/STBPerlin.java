/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to stb_perlin.h from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <p>Revised Perlin noise (3D input, 1D output).</p>
 */
public final class STBPerlin {

	static { LWJGLUtil.initialize(); }

	private STBPerlin() {}

	// --- [ stb_perlin_noise3 ] ---

	/**
	 * Computes a random value at the coordinate (x,y,z).
	 * 
	 * <p>Adjacent random values are continuous but the noise fluctuates its randomness with period 1, i.e. takes on wholly unrelated values at integer points.
	 * Specifically, this implements Ken Perlin's revised noise function from 2002.</p>
	 * 
	 * <p>The "wrap" parameters can be used to create wraparound noise that wraps at powers of two. The numbers MUST be powers of two. Specify 0 to mean "don't
	 * care". (The noise always wraps every 256 due details of the implementation, even if you ask for larger or no wrapping.)</p>
	 *
	 * @param x      the x coordinate
	 * @param y      the y coordinate
	 * @param z      the z coordinate
	 * @param x_wrap 0, or a power of two value that specifies the x wraparound coordinate
	 * @param y_wrap 0, or a power of two value that specifies the y wraparound coordinate
	 * @param z_wrap 0, or a power of two value that specifies the z wraparound coordinate
	 */
	public static native float stb_perlin_noise3(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap);

}