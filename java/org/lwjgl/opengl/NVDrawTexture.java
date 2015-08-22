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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/draw_texture.txt">NV_draw_texture</a> extension.
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
public final class NVDrawTexture {

	/** Function address. */
	@JavadocExclude
	public final long DrawTextureNV;

	@JavadocExclude
	public NVDrawTexture(FunctionProvider provider) {
		DrawTextureNV = provider.getFunctionAddress("glDrawTextureNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVDrawTexture} instance for the current context. */
	public static NVDrawTexture getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVDrawTexture);
	}

	static NVDrawTexture create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_draw_texture") ) return null;

		NVDrawTexture funcs = new NVDrawTexture(provider);

		boolean supported = checkFunctions(
			funcs.DrawTextureNV
		);

		return GL.checkExtension("GL_NV_draw_texture", funcs, supported);
	}

	// --- [ glDrawTextureNV ] ---

	public static void glDrawTextureNV(int texture, int sampler, float x0, float y0, float x1, float y1, float z, float s0, float t0, float s1, float t1) {
		long __functionAddress = getInstance().DrawTextureNV;
		callIIFFFFFFFFFV(__functionAddress, texture, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1);
	}

}