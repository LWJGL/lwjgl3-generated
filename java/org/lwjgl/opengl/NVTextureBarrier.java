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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/texture_barrier.txt">NV_texture_barrier</a> extension.
 * 
 * <p>This extension relaxes the restrictions on rendering to a currently bound texture and provides a mechanism to avoid
 * read-after-write hazards.</p>
 */
public final class NVTextureBarrier {

	/** Function address. */
	@JavadocExclude
	public final long TextureBarrierNV;

	@JavadocExclude
	public NVTextureBarrier(FunctionProvider provider) {
		TextureBarrierNV = provider.getFunctionAddress("glTextureBarrierNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVTextureBarrier} instance for the current context. */
	public static NVTextureBarrier getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVTextureBarrier);
	}

	static NVTextureBarrier create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_texture_barrier") ) return null;

		NVTextureBarrier funcs = new NVTextureBarrier(provider);

		boolean supported = checkFunctions(
			funcs.TextureBarrierNV
		);

		return GL.checkExtension("GL_NV_texture_barrier", funcs, supported);
	}

	// --- [ glTextureBarrierNV ] ---

	/** JNI method for {@link #glTextureBarrierNV TextureBarrierNV} */
	@JavadocExclude
	public static native void nglTextureBarrierNV(long __functionAddress);

	/**  */
	public static void glTextureBarrierNV() {
		long __functionAddress = getInstance().TextureBarrierNV;
		nglTextureBarrierNV(__functionAddress);
	}

}