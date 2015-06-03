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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/swap_control.txt">GLX_EXT_swap_control</a> extension.
 * 
 * <p>This extension allows an application to specify a minimum periodicity of color buffer swaps, measured in video frame periods, for a particular drawable.
 * It also allows an application to query the swap interval and the implementation-dependent maximum swap interval of a drawable.</p>
 */
public final class GLXEXTSwapControl {

	/** Function address. */
	@JavadocExclude
	public final long SwapIntervalEXT;

	@JavadocExclude
	public GLXEXTSwapControl(FunctionProvider provider) {
		SwapIntervalEXT = provider.getFunctionAddress("glXSwapIntervalEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLXEXTSwapControl} instance for the current context. */
	public static GLXEXTSwapControl getInstance() {
		return checkFunctionality(GL.getCapabilities().__GLXEXTSwapControl);
	}

	static GLXEXTSwapControl create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_EXT_swap_control") ) return null;

		GLXEXTSwapControl funcs = new GLXEXTSwapControl(provider);

		boolean supported = checkFunctions(
			funcs.SwapIntervalEXT
		);

		return GL.checkExtension("GLX_EXT_swap_control", funcs, supported);
	}

	// --- [ glXSwapIntervalEXT ] ---

	/** JNI method for {@link #glXSwapIntervalEXT SwapIntervalEXT} */
	@JavadocExclude
	public static native void nglXSwapIntervalEXT(long display, long drawable, int interval, long __functionAddress);

	/**
	 * Specifies the minimum number of video frame periods per buffer swap for a particular GLX drawable (e.g. a value of two means that the color buffers will
	 * be swapped at most every other video frame). The interval takes effect when {@link GLX#glXSwapBuffers SwapBuffers} is first called on the drawable subsequent to the
	 * {@code glXSwapIntervalEXT} call.
	 *
	 * @param display  the connection to the X server
	 * @param drawable the drawable
	 * @param interval the swap interval
	 */
	public static void glXSwapIntervalEXT(long display, long drawable, int interval) {
		long __functionAddress = getInstance().SwapIntervalEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(drawable);
		}
		nglXSwapIntervalEXT(display, drawable, interval, __functionAddress);
	}

}