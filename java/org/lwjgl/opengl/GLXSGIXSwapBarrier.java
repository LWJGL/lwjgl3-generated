/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/SGIX/swap_barrier.txt">GLX_SGIX_swap_barrier</a> extension.
 * 
 * <p>This extension provides the capability to sychronize the buffer swaps of different swap groups.</p>
 * 
 * <p>Requires {@link GLXSGIXSwapGroup GLX_SGIX_swap_group}.</p>
 */
public class GLXSGIXSwapBarrier {

	protected GLXSGIXSwapBarrier() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLXCapabilities caps) {
		return checkFunctions(
			caps.glXBindSwapBarrierSGIX, caps.glXQueryMaxSwapBarriersSGIX
		);
	}

	// --- [ glXBindSwapBarrierSGIX ] ---

	/**
	 * Binds the swap group that contains {@code drawable} to {@code barrier}. Subsequent buffer swaps for that group will be subject to this binding, until
	 * the group is unbound from {@code barrier}. If {@code barrier} is zero, the group is unbound from its current barrier, if any.
	 *
	 * @param display  the connection to the X server
	 * @param drawable the swap group GLXDrawable
	 * @param barrier  the swap barrier
	 */
	public static void glXBindSwapBarrierSGIX(long display, long drawable, int barrier) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXBindSwapBarrierSGIX;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(drawable);
		}
		callPPV(__functionAddress, display, drawable, barrier);
	}

	// --- [ glXQueryMaxSwapBarriersSGIX ] ---

	/**
	 * Returns in {@code max} the maximum number of barriers supported by an implementation on {@code screen}.
	 *
	 * @param display the connection to the X server
	 * @param screen  the screen
	 * @param max     returns the maximum number of barriers
	 */
	public static int nglXQueryMaxSwapBarriersSGIX(long display, int screen, long max) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryMaxSwapBarriersSGIX;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return callPPI(__functionAddress, display, screen, max);
	}

	/**
	 * Returns in {@code max} the maximum number of barriers supported by an implementation on {@code screen}.
	 *
	 * @param display the connection to the X server
	 * @param screen  the screen
	 * @param max     returns the maximum number of barriers
	 */
	public static int glXQueryMaxSwapBarriersSGIX(long display, int screen, IntBuffer max) {
		if ( CHECKS )
			checkBuffer(max, 1);
		return nglXQueryMaxSwapBarriersSGIX(display, screen, memAddress(max));
	}

	/** Array version of: {@link #glXQueryMaxSwapBarriersSGIX QueryMaxSwapBarriersSGIX} */
	public static int glXQueryMaxSwapBarriersSGIX(long display, int screen, int[] max) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryMaxSwapBarriersSGIX;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkBuffer(max, 1);
		}
		return callPPI(__functionAddress, display, screen, max);
	}

}