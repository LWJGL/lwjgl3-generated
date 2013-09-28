/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

import org.lwjgl.system.linux.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/SGI/swap_control.txt">GLX_SGI_swap_control</a> extension.
 * <p/>
 * This extension allows an application to specify a minimum periodicity of color buffer swaps, measured in video frame periods.
 */
public final class GLXSGISwapControl {

	private GLXSGISwapControl() {}

	// --- [ glXSwapIntervalSGI ] ---

	/** JNI method for {@link #glXSwapIntervalSGI glXSwapIntervalSGI} */
	public static native int nglXSwapIntervalSGI(int interval, long __functionAddress);

	/**
	 * Specifies the minimum number of video frame periods per buffer swap. (e.g. a value of two means that the color buffers will be swapped at most every
	 * other video frame.)  A return value of zero indicates success; otherwise an error occurred.  The interval takes effect when {@link GLX#glXSwapBuffers SwapBuffers}
	 * is first called subsequent to the {@code glXSwapIntervalSGI} call.
	 * <p/>
	 * A video frame period is the time required by the monitor to display a full frame of video data.  In the case of an interlaced monitor, this is typically
	 * the time required to display both the even and odd fields of a frame of video data.
	 *
	 * @param interval the swap interval
	 */
	public static int glXSwapIntervalSGI(int interval) {
		long __functionAddress = getInstance().glXSwapIntervalSGI;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglXSwapIntervalSGI(interval, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	@JavadocExclude
	public static Functions getInstance() {
		return GL.getCapabilities().__GLXSGISwapControl;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_SGI_swap_control") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported =  GL.isFunctionSupported(funcs.glXSwapIntervalSGI);

		return GL.checkExtension("GLX_SGI_swap_control", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GLXSGISwapControl}. */
	@JavadocExclude
	public static final class Functions implements FunctionMap {

		public final long glXSwapIntervalSGI;

		public Functions(FunctionProvider provider) {
			glXSwapIntervalSGI = provider.getFunctionAddress("glXSwapIntervalSGI");
		}

	}

}