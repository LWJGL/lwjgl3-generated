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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/texture_barrier.txt">ARB_texture_barrier</a> extension.
 * 
 * <p>This extension relaxes the restrictions on rendering to a currently bound texture and provides a mechanism to avoid read-after-write hazards.</p>
 * 
 * <p>Promoted to core in {@link GL45 OpenGL 4.5}.</p>
 */
public final class ARBTextureBarrier {

	/** Function address. */
	@JavadocExclude
	public final long TextureBarrier;

	@JavadocExclude
	public ARBTextureBarrier(FunctionProvider provider) {
		TextureBarrier = provider.getFunctionAddress("glTextureBarrier");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBTextureBarrier} instance for the current context. */
	public static ARBTextureBarrier getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBTextureBarrier);
	}

	static ARBTextureBarrier create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_texture_barrier") ) return null;

		ARBTextureBarrier funcs = new ARBTextureBarrier(provider);

		boolean supported = checkFunctions(
			funcs.TextureBarrier
		);

		return GL.checkExtension("GL_ARB_texture_barrier", funcs, supported);
	}

	// --- [ glTextureBarrier ] ---

	/** Guarantees that writes have completed and caches have been invalidated before subsequent Draws are executed. */
	public static void glTextureBarrier() {
		long __functionAddress = getInstance().TextureBarrier;
		GL45.nglTextureBarrier(__functionAddress);
	}

}