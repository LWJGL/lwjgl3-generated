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
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/NOK/EGL_NOK_swap_region2.txt">NOK_swap_region2</a> extension.
 * 
 * <p>This extension adds a new function which provides an alternative to eglSwapBuffers. eglSwapBuffersRegion2NOK accepts two new parameters in addition to
 * those in eglSwapBuffers. The new parameters consist of a pointer to a list of 4-integer blocks defining rectangles (x, y, width, height) and an integer
 * specifying the number of rectangles in the list.</p>
 * 
 * <p>The new parameters allow users to declare the region of the surface that has been updated. The implementation uses this information to transfer the
 * updated region to the front buffer. Only the pixels within the specified region are copied; any rendering outside that region will not become visible
 * on the window surface. This in contrast with the EGL_NOK_swap_region extension which treats the modified region only as a hint.</p>
 * 
 * <p>This functional change is aimed at further reducing the processing and bandwidth requirements of optimizations of applications whose graphics are
 * commonly subjected to region-based changes. Specifically, this extension enables partial surface updates without requiring the use of preserved swaps.</p>
 * 
 * <p>Requires {@link EGL14 EGL L.1}.</p>
 */
public final class NOKSwapRegion2 {

	/** Function address. */
	@JavadocExclude
	public final long SwapBuffersRegion2NOK;

	@JavadocExclude
	public NOKSwapRegion2(FunctionProvider provider) {
		SwapBuffersRegion2NOK = provider.getFunctionAddress("eglSwapBuffersRegion2NOK");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NOKSwapRegion2} instance. */
	public static NOKSwapRegion2 getInstance() {
		return checkFunctionality(EGL.getCapabilities().__NOKSwapRegion2);
	}

	// --- [ eglSwapBuffersRegion2NOK ] ---

	/** Unsafe version of {@link #eglSwapBuffersRegion2NOK SwapBuffersRegion2NOK} */
	@JavadocExclude
	public static boolean neglSwapBuffersRegion2NOK(long dpy, long surface, int numRects, long rects) {
		long __functionAddress = getInstance().SwapBuffersRegion2NOK;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return callPPIPZ(__functionAddress, dpy, surface, numRects, rects);
	}

	public static boolean eglSwapBuffersRegion2NOK(long dpy, long surface, int numRects, ByteBuffer rects) {
		if ( LWJGLUtil.CHECKS )
			if ( rects != null ) checkBuffer(rects, numRects << 2);
		return neglSwapBuffersRegion2NOK(dpy, surface, numRects, memAddressSafe(rects));
	}

	/** Alternative version of: {@link #eglSwapBuffersRegion2NOK SwapBuffersRegion2NOK} */
	public static boolean eglSwapBuffersRegion2NOK(long dpy, long surface, IntBuffer rects) {
		return neglSwapBuffersRegion2NOK(dpy, surface, rects == null ? 0 : rects.remaining(), memAddressSafe(rects));
	}

}