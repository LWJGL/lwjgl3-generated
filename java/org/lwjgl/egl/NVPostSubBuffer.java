/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

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
public class NVPostSubBuffer {

	/**  */
	public static final int EGL_POST_SUB_BUFFER_SUPPORTED_NV = 0x30BE;

	protected NVPostSubBuffer() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglPostSubBufferNV
		);
	}

	// --- [ eglPostSubBufferNV ] ---

	public static int eglPostSubBufferNV(long dpy, long surface, int x, int y, int width, int height) {
		long __functionAddress = EGL.getCapabilities().eglPostSubBufferNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(surface);
		}
		return callPPI(__functionAddress, dpy, surface, x, y, width, height);
	}

}