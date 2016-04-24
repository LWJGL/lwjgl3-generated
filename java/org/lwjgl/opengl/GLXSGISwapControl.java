/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

import org.lwjgl.system.linux.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/SGI/swap_control.txt">GLX_SGI_swap_control</a> extension.
 * 
 * <p>This extension allows an application to specify a minimum periodicity of color buffer swaps, measured in video frame periods.</p>
 */
public class GLXSGISwapControl {

	protected GLXSGISwapControl() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLXCapabilities caps) {
		return checkFunctions(
			caps.glXSwapIntervalSGI
		);
	}

	// --- [ glXSwapIntervalSGI ] ---

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
		long __functionAddress = GL.getCapabilitiesGLXClient().glXSwapIntervalSGI;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callI(__functionAddress, interval);
	}

}