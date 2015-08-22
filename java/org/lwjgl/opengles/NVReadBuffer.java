/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_read_buffer.txt">NV_read_buffer</a> extension.
 * 
 * <p>Unextended OpenGL ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
 * for debugging to be able to read from non-default color buffers. Particularly, when the NV_draw_buffers extension is supported, each framebuffer may
 * contain multiple color buffers. This extension provides a mechanism to select which color buffer to read from.</p>
 * 
 * <p>The NV_read_buffer extension adds the command ReadBufferNV, which is used to select which color buffer of the currently-bound framebuffer to use as the
 * source for subsequent calls to ReadPixels, CopyTexImage2D, and CopyTexSubImage2D. If the system-provided framebuffer is bound, then ReadBufferNV
 * accepts value BACK. If a user-created FBO is bound, then ReadBufferNV accepts COLOR_ATTACHMENT0. Additionally, if the NV_draw_buffers extension is
 * supported, ReadBufferNV accepts COLOR_ATTACHMENTn_NV (n is 0 to 15).</p>
 */
public final class NVReadBuffer {

	/** Accepted by the {@code pname} parameter of GetIntegerv. */
	public static final int GL_READ_BUFFER_NV = 0xC02;

	/** Function address. */
	@JavadocExclude
	public final long ReadBufferNV;

	@JavadocExclude
	public NVReadBuffer(FunctionProvider provider) {
		ReadBufferNV = provider.getFunctionAddress("glReadBufferNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVReadBuffer} instance for the current context. */
	public static NVReadBuffer getInstance() {
		return checkFunctionality(GLES.getCapabilities().__NVReadBuffer);
	}

	static NVReadBuffer create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_read_buffer") ) return null;

		NVReadBuffer funcs = new NVReadBuffer(provider);
		boolean supported = checkFunctions(
			funcs.ReadBufferNV
		);

		return GLES.checkExtension("GL_NV_read_buffer", funcs, supported);
	}

	// --- [ glReadBufferNV ] ---

	public static void glReadBufferNV(int mode) {
		long __functionAddress = getInstance().ReadBufferNV;
		callIV(__functionAddress, mode);
	}

}