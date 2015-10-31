/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

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

	/** Function address. */
	@JavadocExclude
	public final long
		BindSwapBarrierSGIX,
		QueryMaxSwapBarriersSGIX;

	@JavadocExclude
	protected GLXSGIXSwapBarrier() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GLXSGIXSwapBarrier(FunctionProvider provider) {
		BindSwapBarrierSGIX = provider.getFunctionAddress("glXBindSwapBarrierSGIX");
		QueryMaxSwapBarriersSGIX = provider.getFunctionAddress("glXQueryMaxSwapBarriersSGIX");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLXSGIXSwapBarrier} instance of the current context. */
	public static GLXSGIXSwapBarrier getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link GLXSGIXSwapBarrier} instance of the specified {@link GLCapabilities}. */
	public static GLXSGIXSwapBarrier getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__GLXSGIXSwapBarrier);
	}

	static GLXSGIXSwapBarrier create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_SGIX_swap_barrier") ) return null;

		GLXSGIXSwapBarrier funcs = new GLXSGIXSwapBarrier(provider);

		boolean supported = checkFunctions(
			funcs.BindSwapBarrierSGIX, funcs.QueryMaxSwapBarriersSGIX
		);

		return GL.checkExtension("GLX_SGIX_swap_barrier", funcs, supported);
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
		long __functionAddress = getInstance().BindSwapBarrierSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(drawable);
		}
		callPPIV(__functionAddress, display, drawable, barrier);
	}

	// --- [ glXQueryMaxSwapBarriersSGIX ] ---

	/** Unsafe version of {@link #glXQueryMaxSwapBarriersSGIX QueryMaxSwapBarriersSGIX} */
	@JavadocExclude
	public static int nglXQueryMaxSwapBarriersSGIX(long display, int screen, long max) {
		long __functionAddress = getInstance().QueryMaxSwapBarriersSGIX;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return callPIPI(__functionAddress, display, screen, max);
	}

	/**
	 * Returns in {@code max} the maximum number of barriers supported by an implementation on {@code screen}.
	 *
	 * @param display the connection to the X server
	 * @param screen  the screen
	 * @param max     returns the maximum number of barriers
	 */
	public static int glXQueryMaxSwapBarriersSGIX(long display, int screen, ByteBuffer max) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(max, 1 << 2);
		return nglXQueryMaxSwapBarriersSGIX(display, screen, memAddress(max));
	}

	/** Alternative version of: {@link #glXQueryMaxSwapBarriersSGIX QueryMaxSwapBarriersSGIX} */
	public static int glXQueryMaxSwapBarriersSGIX(long display, int screen, IntBuffer max) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(max, 1);
		return nglXQueryMaxSwapBarriersSGIX(display, screen, memAddress(max));
	}

}