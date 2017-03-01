/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.opengl.org/registry/specs/NV/draw_texture.txt">NV_draw_texture</a> extension.
 * 
 * <p>This extension provides a new function, DrawTextureNV(), allowing
 * applications to draw an screen-aligned rectangle displaying some or all of
 * the contents of a two-dimensional or rectangle texture.  Callers specify a
 * texture object, an optional sampler object, window coordinates of the
 * rectangle to draw, and texture coordinates corresponding to the corners of
 * the rectangle.  For each fragment produced by the rectangle, DrawTextureNV
 * interpolates the texture coordinates, performs a texture lookup, and uses
 * the texture result as the fragment color.</p>
 */
public class NVDrawTexture {

	static { GL.initialize(); }

	protected NVDrawTexture() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glDrawTextureNV
		);
	}

	// --- [ glDrawTextureNV ] ---

	public static native void glDrawTextureNV(int texture, int sampler, float x0, float y0, float x1, float y1, float z, float s0, float t0, float s1, float t1);

}