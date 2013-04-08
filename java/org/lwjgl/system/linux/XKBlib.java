/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to XKBlib.h. */
public final class XKBlib {

	/** Mask bits for {@link XkbDescRec}. */
	public static final int
		XkbControlsMask      = 1<<0,
		XkbServerMapMask     = 1<<1,
		XkbIClientMapMask    = 1<<2,
		XkbIndicatorMapMask  = 1<<3,
		XkbNamesMask         = 1<<4,
		XkbCompatMapMask     = 1<<5,
		XkbGeometryMask      = 1<<6,
		XkbAllComponentsMask = 1<<7;

	private XKBlib() {}

	// --- [ XkbQueryExtension ] ---

	/** JNI method for {@link #XkbQueryExtension} */
	public static native int nXkbQueryExtension(long display, long opcodeReturn, long eventBaseReturn, long errorBaseReturn, long majorRtrn, long minorRtrn);

	/**
	 * Determines the compatibility of a library at runtime.
	 *
	 * @param display         the connection to the X server
	 * @param opcodeReturn    backfilled with the major extension opcode
	 * @param eventBaseReturn backfilled with the extension base event code
	 * @param errorBaseReturn backfilled with the extension base error code
	 * @param majorRtrn       compile time lib major version in, server major version out
	 * @param minorRtrn       compile time lib min version in, server minor version out
	 */
	public static int XkbQueryExtension(long display, ByteBuffer opcodeReturn, ByteBuffer eventBaseReturn, ByteBuffer errorBaseReturn, ByteBuffer majorRtrn, ByteBuffer minorRtrn) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(opcodeReturn, 1 << 2);
			checkBuffer(eventBaseReturn, 1 << 2);
			checkBuffer(errorBaseReturn, 1 << 2);
			checkBuffer(majorRtrn, 1 << 2);
			checkBuffer(minorRtrn, 1 << 2);
		}
		return nXkbQueryExtension(display, memAddress(opcodeReturn), memAddress(eventBaseReturn), memAddress(errorBaseReturn), memAddress(majorRtrn), memAddress(minorRtrn));
	}

	/** Alternative version of: {@link #XkbQueryExtension} */
	public static int XkbQueryExtension(long display, IntBuffer opcodeReturn, IntBuffer eventBaseReturn, IntBuffer errorBaseReturn, IntBuffer majorRtrn, IntBuffer minorRtrn) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(opcodeReturn, 1);
			checkBuffer(eventBaseReturn, 1);
			checkBuffer(errorBaseReturn, 1);
			checkBuffer(majorRtrn, 1);
			checkBuffer(minorRtrn, 1);
		}
		return nXkbQueryExtension(display, memAddress(opcodeReturn), memAddress(eventBaseReturn), memAddress(errorBaseReturn), memAddress(majorRtrn), memAddress(minorRtrn));
	}

	// --- [ XkbSetDetectableAutoRepeat ] ---

	/** JNI method for {@link #XkbSetDetectableAutoRepeat} */
	public static native int nXkbSetDetectableAutoRepeat(long display, int detectable, long supported);

	/**
	 * Sets DetectableAutorepeat.
	 *
	 * @param display    the connection to the X server
	 * @param detectable if true will enable detectable auto-repeat
	 * @param supported  backefilled with true if DetectableAutorepeat is supported
	 */
	public static int XkbSetDetectableAutoRepeat(long display, int detectable, ByteBuffer supported) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXkbSetDetectableAutoRepeat(display, detectable, memAddress(supported));
	}

	/** Alternative version of: {@link #XkbSetDetectableAutoRepeat} */
	public static int XkbSetDetectableAutoRepeat(long display, int detectable, IntBuffer supported) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXkbSetDetectableAutoRepeat(display, detectable, memAddress(supported));
	}

	// --- [ XkbKeycodeToKeysym ] ---

	/** JNI method for {@link #XkbKeycodeToKeysym} */
	public static native long nXkbKeycodeToKeysym(long display, byte kc, int group, int level);

	/**
	 * Finds the keysym bound to a particular key at a specified group and shift level.
	 *
	 * @param display the connection to the X server
	 * @param kc      key of interest
	 * @param group   group of interest
	 * @param level   shift level of interest
	 */
	public static long XkbKeycodeToKeysym(long display, byte kc, int group, int level) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXkbKeycodeToKeysym(display, kc, group, level);
	}

	// --- [ XkbGetKeyboard ] ---

	/** JNI method for {@link #XkbGetKeyboard} */
	public static native long nXkbGetKeyboard(long display, int which, int deviceSpec);

	/**
	 * Allocates and returns a pointer to a keyboard description.
	 *
	 * @param display    the connection to the X server
	 * @param which      the components to query
	 * @param deviceSpec the device to query
	 */
	public static ByteBuffer XkbGetKeyboard(long display, int which, int deviceSpec) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		long __result = nXkbGetKeyboard(display, which, deviceSpec);
		return memByteBuffer(__result, XkbDescRec.SIZEOF);
	}

	// --- [ XkbFreeKeyboard ] ---

	/** JNI method for {@link #XkbFreeKeyboard} */
	public static native void nXkbFreeKeyboard(long xkb, int which, int freeDesc);

	/**
	 * Destroys either an entire {@link XkbDescRec} or just some of its members.
	 *
	 * @param xkb      the keyboard description with components to free
	 * @param which    the mask selecting components to free
	 * @param freeDesc if true, free all components and {@code xkb}
	 */
	public static void XkbFreeKeyboard(ByteBuffer xkb, int which, int freeDesc) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(xkb, XkbDescRec.SIZEOF);
		nXkbFreeKeyboard(memAddress(xkb), which, freeDesc);
	}

}