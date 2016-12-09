/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_texture_barrier.txt">NV_texture_barrier</a> extension.
 * 
 * <p>This extension relaxes the restrictions on rendering to a currently bound texture and provides a mechanism to avoid read-after-write hazards.</p>
 */
public class NVTextureBarrier {

	static { GLES.initialize(); }

	protected NVTextureBarrier() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glTextureBarrierNV
		);
	}

	// --- [ glTextureBarrierNV ] ---

	/** Unsafe version of: {@link #glTextureBarrierNV TextureBarrierNV} */
	public static native void nglTextureBarrierNV();

	/** Guarantees that writes have completed and caches have been invalidated before subsequent Draws are executed. */
	public static void glTextureBarrierNV() {
		nglTextureBarrierNV();
	}

}