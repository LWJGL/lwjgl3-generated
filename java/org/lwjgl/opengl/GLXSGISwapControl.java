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
 * 
 * <p>This extension allows an application to specify a minimum periodicity of color buffer swaps, measured in video frame periods.</p>
 */
public final class GLXSGISwapControl {

	/** Function address. */
	@JavadocExclude
	public final long SwapIntervalSGI;

	@JavadocExclude
	public GLXSGISwapControl(FunctionProvider provider) {
		SwapIntervalSGI = provider.getFunctionAddress("glXSwapIntervalSGI");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLXSGISwapControl} instance for the current context. */
	public static GLXSGISwapControl getInstance() {
		return checkFunctionality(GL.getCapabilities().__GLXSGISwapControl);
	}

	static GLXSGISwapControl create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_SGI_swap_control") ) return null;

		GLXSGISwapControl funcs = new GLXSGISwapControl(provider);

		boolean supported = checkFunctions(
			funcs.SwapIntervalSGI
		);

		return GL.checkExtension("GLX_SGI_swap_control", funcs, supported);
	}

	// --- [ glXSwapIntervalSGI ] ---

	/** JNI method for {@link #glXSwapIntervalSGI SwapIntervalSGI} */
	@JavadocExclude
	public static native int nglXSwapIntervalSGI(int interval, long __functionAddress);

	/**
	 * Specifies the minimum number of video frame periods per buffer swap. (e.g. a value of two means that the color buffers will be swapped at most every
	 * other video frame.)  A return value of zero indicates success; otherwise an error occurred.  The interval takes effect when {@link GLX#glXSwapBuffers SwapBuffers}
	 * is first called subsequent to the {@code glXSwapIntervalSGI} call.
	 * 
	 * <p>A video frame period is the time required by the monitor to display a full frame of video data.  In the case of an interlaced monitor, this is typically
	 * the time required to display both the even and odd fields of a frame of video data.</p>
	 *
	 * @param interval the swap interval
	 */
	public static int glXSwapIntervalSGI(int interval) {
		long __functionAddress = getInstance().SwapIntervalSGI;
		return nglXSwapIntervalSGI(interval, __functionAddress);
	}

}