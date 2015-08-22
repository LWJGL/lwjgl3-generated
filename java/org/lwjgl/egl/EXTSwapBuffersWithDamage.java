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
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/EXT/EGL_EXT_swap_buffers_with_damage.txt">EXT_swap_buffers_with_damage</a> extension.
 * 
 * <p>This extension provides a means to issue a swap buffers request to display the contents of the current back buffer and also specify a list of damage
 * rectangles that can be passed to a system compositor so it can minimize how much it has to recompose.</p>
 * 
 * <p>This should be used in situations where an application is only animating a small portion of a surface since it enables the compositor to avoid wasting
 * time recomposing parts of the surface that haven't changed.</p>
 * 
 * <p>Requires {@link EGL14 EGL L.1}.</p>
 */
public final class EXTSwapBuffersWithDamage {

	/** Function address. */
	@JavadocExclude
	public final long SwapBuffersWithDamageEXT;

	@JavadocExclude
	public EXTSwapBuffersWithDamage(FunctionProvider provider) {
		SwapBuffersWithDamageEXT = provider.getFunctionAddress("eglSwapBuffersWithDamageEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTSwapBuffersWithDamage} instance. */
	public static EXTSwapBuffersWithDamage getInstance() {
		return checkFunctionality(EGL.getCapabilities().__EXTSwapBuffersWithDamage);
	}

	// --- [ eglSwapBuffersWithDamageEXT ] ---

	/** Unsafe version of {@link #eglSwapBuffersWithDamageEXT SwapBuffersWithDamageEXT} */
	@JavadocExclude
	public static boolean neglSwapBuffersWithDamageEXT(long dpy, long surface, long rects, int n_rects) {
		long __functionAddress = getInstance().SwapBuffersWithDamageEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return callPPPIZ(__functionAddress, dpy, surface, rects, n_rects);
	}

	public static boolean eglSwapBuffersWithDamageEXT(long dpy, long surface, ByteBuffer rects, int n_rects) {
		if ( LWJGLUtil.CHECKS )
			if ( rects != null ) checkBuffer(rects, n_rects << 2);
		return neglSwapBuffersWithDamageEXT(dpy, surface, memAddressSafe(rects), n_rects);
	}

	/** Alternative version of: {@link #eglSwapBuffersWithDamageEXT SwapBuffersWithDamageEXT} */
	public static boolean eglSwapBuffersWithDamageEXT(long dpy, long surface, IntBuffer rects) {
		return neglSwapBuffersWithDamageEXT(dpy, surface, memAddressSafe(rects), rects == null ? 0 : rects.remaining());
	}

}