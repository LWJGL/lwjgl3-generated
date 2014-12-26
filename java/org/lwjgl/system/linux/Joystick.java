/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to &ltlinux/joystick.h&gt;. */
public final class Joystick {

	/** Types and constants for reading from /dev/js */
	public static final int
		JS_EVENT_BUTTON = 0x1,
		JS_EVENT_AXIS   = 0x2,
		JS_EVENT_INIT   = 0x80;

	static { LWJGLUtil.initialize(); }

	private Joystick() {}

	// --- [ JSIOCGVERSION ] ---

	/** IOCTL command: get driver version. */
	public static native int JSIOCGVERSION();

	// --- [ JSIOCGAXES ] ---

	/** IOCTL command: get number of axes. */
	public static native int JSIOCGAXES();

	// --- [ JSIOCGBUTTONS ] ---

	/** IOCTL command: get number of buttons. */
	public static native int JSIOCGBUTTONS();

	// --- [ JSIOCGNAME ] ---

	/**
	 * IOCTL command: get identifier string.
	 *
	 * @param len the string length
	 */
	public static native int JSIOCGNAME(int len);

}