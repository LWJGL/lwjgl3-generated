/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/NV/EGL_NV_post_sub_buffer.txt">NV_post_sub_buffer</a> extension.
 * 
 * <p>Many EGL client APIs do not support rendering to window surfaces directly, so there is no way to efficiently make small updates to window surfaces.
 * Applications that need to perform many small updates must either use the back-buffer preservation flag which forces eglSwapBuffers to copy the entire
 * back surface, or redraw the entire back buffer on every update and hope eglSwapBuffers is implemented using buffer-flipping. This extension provides a
 * 3rd alternative: a function which posts a sub-rectangle of a window surface and preserves the back-buffer contents.</p>
 * 
 * <p>Requires {@link EGL11 EGL L.1}.</p>
 */
public final class NVPostSubBuffer {

	/**  */
	public static final int EGL_POST_SUB_BUFFER_SUPPORTED_NV = 0x30BE;

	/** Function address. */
	@JavadocExclude
	public final long PostSubBufferNV;

	@JavadocExclude
	public NVPostSubBuffer(FunctionProvider provider) {
		PostSubBufferNV = provider.getFunctionAddress("eglPostSubBufferNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVPostSubBuffer} instance. */
	public static NVPostSubBuffer getInstance() {
		return checkFunctionality(EGL.getCapabilities().__NVPostSubBuffer);
	}

	// --- [ eglPostSubBufferNV ] ---

	public static boolean eglPostSubBufferNV(long dpy, long surface, int x, int y, int width, int height) {
		long __functionAddress = getInstance().PostSubBufferNV;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return callPPIIIIZ(__functionAddress, dpy, surface, x, y, width, height);
	}

}