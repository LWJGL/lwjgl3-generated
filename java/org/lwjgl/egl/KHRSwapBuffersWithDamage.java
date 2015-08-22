/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_swap_buffers_with_damage.txt">KHR_swap_buffers_with_damage</a> extension.
 * 
 * <p>This extension provides a means to issue a swap buffers request to display the contents of the current back buffer and also specify a list of damage
 * rectangles that can be passed to a system compositor so it can minimize how much it has to recompose.</p>
 * 
 * <p>This should be used in situations where an application is only animating a small portion of a surface since it enables the compositor to avoid wasting
 * time recomposing parts of the surface that haven't changed.</p>
 * 
 * <p>Requires {@link EGL14 EGL L.1}.</p>
 */
public final class KHRSwapBuffersWithDamage {

	/** Function address. */
	@JavadocExclude
	public final long SwapBuffersWithDamageKHR;

	@JavadocExclude
	public KHRSwapBuffersWithDamage(FunctionProvider provider) {
		SwapBuffersWithDamageKHR = provider.getFunctionAddress("eglSwapBuffersWithDamageKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRSwapBuffersWithDamage} instance. */
	public static KHRSwapBuffersWithDamage getInstance() {
		return checkFunctionality(EGL.getCapabilities().__KHRSwapBuffersWithDamage);
	}

	// --- [ eglSwapBuffersWithDamageKHR ] ---

	/** Unsafe version of {@link #eglSwapBuffersWithDamageKHR SwapBuffersWithDamageKHR} */
	@JavadocExclude
	public static boolean neglSwapBuffersWithDamageKHR(long dpy, long surface, long rects, int n_rects) {
		long __functionAddress = getInstance().SwapBuffersWithDamageKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return callPPPIZ(__functionAddress, dpy, surface, rects, n_rects);
	}

	public static boolean eglSwapBuffersWithDamageKHR(long dpy, long surface, ByteBuffer rects, int n_rects) {
		if ( LWJGLUtil.CHECKS )
			if ( rects != null ) checkBuffer(rects, n_rects << 2);
		return neglSwapBuffersWithDamageKHR(dpy, surface, memAddressSafe(rects), n_rects);
	}

	/** Alternative version of: {@link #eglSwapBuffersWithDamageKHR SwapBuffersWithDamageKHR} */
	public static boolean eglSwapBuffersWithDamageKHR(long dpy, long surface, IntBuffer rects) {
		return neglSwapBuffersWithDamageKHR(dpy, surface, memAddressSafe(rects), rects == null ? 0 : rects.remaining());
	}

}