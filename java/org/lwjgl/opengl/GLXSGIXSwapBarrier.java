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
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.linux.X;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/SGIX/swap_barrier.txt">GLX_SGIX_swap_barrier</a> extension.
 * <p/>
 * This extension provides the capability to sychronize the buffer swaps of different swap groups.
 */
public final class GLXSGIXSwapBarrier {

	private GLXSGIXSwapBarrier() {}

	// --- [ glXBindSwapBarrierSGIX ] ---

	/** JNI method for {@link #glXBindSwapBarrierSGIX glXBindSwapBarrierSGIX} */
	public static native void nglXBindSwapBarrierSGIX(long display, long drawable, int barrier, long __functionAddress);

	/**
	 * Binds the swap group that contains {@code drawable} to {@code barrier}. Subsequent buffer swaps for that group will be subject to this binding, until
	 * the group is unbound from {@code barrier}. If {@code barrier} is zero, the group is unbound from its current barrier, if any.
	 *
	 * @param display  the connection to the X server
	 * @param drawable the swap group GLXDrawable
	 * @param barrier  the swap barrier
	 */
	public static void glXBindSwapBarrierSGIX(long display, long drawable, int barrier) {
		long __functionAddress = getInstance().glXBindSwapBarrierSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(drawable);
		}
		nglXBindSwapBarrierSGIX(display, drawable, barrier, __functionAddress);
	}

	// --- [ glXQueryMaxSwapBarriersSGIX ] ---

	/** JNI method for {@link #glXQueryMaxSwapBarriersSGIX glXQueryMaxSwapBarriersSGIX} */
	public static native int nglXQueryMaxSwapBarriersSGIX(long display, int screen, long max, long __functionAddress);

	/**
	 * Returns in {@code max} the maximum number of barriers supported by an implementation on {@code screen}.
	 *
	 * @param display the connection to the X server
	 * @param screen  the screen
	 * @param max     returns the maximum number of barriers
	 */
	public static int glXQueryMaxSwapBarriersSGIX(long display, int screen, ByteBuffer max) {
		long __functionAddress = getInstance().glXQueryMaxSwapBarriersSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkBuffer(max, 1 << 2);
		}
		return nglXQueryMaxSwapBarriersSGIX(display, screen, memAddress(max), __functionAddress);
	}

	/** Alternative version of: {@link #glXQueryMaxSwapBarriersSGIX glXQueryMaxSwapBarriersSGIX} */
	public static int glXQueryMaxSwapBarriersSGIX(long display, int screen, IntBuffer max) {
		long __functionAddress = getInstance().glXQueryMaxSwapBarriersSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkBuffer(max, 1);
		}
		return nglXQueryMaxSwapBarriersSGIX(display, screen, memAddress(max), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GLXSGIXSwapBarrier;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_SGIX_swap_barrier") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glXBindSwapBarrierSGIX) &&
			GL.isFunctionSupported(funcs.glXQueryMaxSwapBarriersSGIX);

		return GL.checkExtension("GLX_SGIX_swap_barrier", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GLXSGIXSwapBarrier}. */
	public static final class Functions implements FunctionMap {

		public final long
			glXBindSwapBarrierSGIX,
			glXQueryMaxSwapBarriersSGIX;

		public Functions(FunctionProvider provider) {
			glXBindSwapBarrierSGIX = provider.getFunctionAddress("glXBindSwapBarrierSGIX");
			glXQueryMaxSwapBarriersSGIX = provider.getFunctionAddress("glXQueryMaxSwapBarriersSGIX");
		}

	}

}