/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/texture_barrier.txt">NV_texture_barrier</a> extension.
 * 
 * <p>This extension relaxes the restrictions on rendering to a currently bound texture and provides a mechanism to avoid read-after-write hazards.</p>
 */
public class NVTextureBarrier {

	protected NVTextureBarrier() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glTextureBarrierNV
		);
	}

	// --- [ glTextureBarrierNV ] ---

	/** Guarantees that writes have completed and caches have been invalidated before subsequent Draws are executed. */
	public static void glTextureBarrierNV() {
		long __functionAddress = GL.getCapabilities().glTextureBarrierNV;
		if ( CHECKS )
			check(__functionAddress);
		callV(__functionAddress);
	}

}