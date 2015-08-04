/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.simd;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Bindings to SSE3 macros. */
public final class SSE3 {

	/** Denormals are zero mode. */
	public static final int
		_MM_DENORMALS_ZERO_MASK = 0x40,
		_MM_DENORMALS_ZERO_ON   = 0x40,
		_MM_DENORMALS_ZERO_OFF  = 0x0;

	static { LWJGLUtil.initialize(); }

	private SSE3() {}

	// --- [ _MM_SET_DENORMALS_ZERO_MODE ] ---

	/**
	 * Causes the \"denormals are zero\" mode to be turned ON or OFF by setting the appropriate bit of the control register. DAZ treats denormal values used
	 * as input to floating-point instructions as zero.
	 * 
	 * <p>DAZ is very similar to FTZ in many ways. DAZ mode is a method of bypassing IEEE 754 methods of dealing with denormal floating-point numbers. This mode
	 * is less precise, but much faster and is typically used in applications like streaming media when minute differences in quality are essentially
	 * undetectable.</p>
	 *
	 * @param mode the denormals are zero mode. One of:<br>{@link #_MM_DENORMALS_ZERO_MASK DENORMALS_ZERO_MASK}, {@link #_MM_DENORMALS_ZERO_ON DENORMALS_ZERO_ON}, {@link #_MM_DENORMALS_ZERO_OFF DENORMALS_ZERO_OFF}
	 */
	public static native void _MM_SET_DENORMALS_ZERO_MODE(int mode);

	// --- [ _MM_GET_DENORMALS_ZERO_MODE ] ---

	/** Returns the current value of the "denormals are zero mode" bit of the control register. */
	public static native int _MM_GET_DENORMALS_ZERO_MODE();

}