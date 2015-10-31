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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/texture_barrier.txt">NV_texture_barrier</a> extension.
 * 
 * <p>This extension relaxes the restrictions on rendering to a currently bound texture and provides a mechanism to avoid
 * read-after-write hazards.</p>
 */
public class NVTextureBarrier {

	/** Function address. */
	@JavadocExclude
	public final long TextureBarrierNV;

	@JavadocExclude
	protected NVTextureBarrier() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public NVTextureBarrier(FunctionProvider provider) {
		TextureBarrierNV = provider.getFunctionAddress("glTextureBarrierNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVTextureBarrier} instance of the current context. */
	public static NVTextureBarrier getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link NVTextureBarrier} instance of the specified {@link GLCapabilities}. */
	public static NVTextureBarrier getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__NVTextureBarrier);
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

	public static void glTextureBarrierNV() {
		long __functionAddress = getInstance().TextureBarrierNV;
		callV(__functionAddress);
	}

}