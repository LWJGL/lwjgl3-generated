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

	/**
	 * XkbUseCoreKbd is used to specify the core keyboard without having to look up its X input extension identifier.
	 * XkbUseCorePtr is used to specify the core pointer without having to look up its X input extension identifier.
	 * XkbDfltXIClass is used to specify "don't care" any place that the XKB protocol is looking for an X Input Extension device class.
	 * XkbDfltXIId is used to specify "don't care" any place that the XKB protocol is looking for an X Input Extension feedback identifier.
	 * XkbAllXIClasses is used to get information about all device indicators, whether they're part of the indicator feedback class or the keyboard feedback class.
	 * XkbAllXIIds is used to get information about all device indicator feedbacks without having to list them.
	 * XkbXINone is used to indicate that no class or id has been specified.
	 * 
	 * <p>XkbLegalXILedClass(c) True if 'c' specifies a legal class with LEDs
	 * XkbLegalXIBellClass(c) True if 'c' specifies a legal class with bells
	 * XkbExplicitXIDevice(d) True if 'd' explicitly specifies a device
	 * XkbExplicitXIClass(c) True if 'c' explicitly specifies a device class
	 * XkbExplicitXIId(c) True if 'i' explicitly specifies a device id
	 * XkbSingleXIClass(c) True if 'c' specifies exactly one device class, including the default.
	 * XkbSingleXIId(i) True if 'i' specifies exactly one device identifier, including the default.</p>
	 */
	public static final int
		XkbUseCoreKbd   = 0x100,
		XkbUseCorePtr   = 0x200,
		XkbDfltXIClass  = 0x300,
		XkbDfltXIId     = 0x400,
		XkbAllXIClasses = 0x500,
		XkbAllXIIds     = 0x600,
		XkbXINone       = 0xFF00;

	/**  */
	public static final int XkbNumKbdGroups = 0x4;

	/** Assorted constants and limits. */
	public static final int
		XkbNumModifiers        = 0x8,
		XkbNumVirtualMods      = 0x10,
		XkbNumIndicators       = 0x20,
		XkbAllIndicatorsMask   = 0xffffffff,
		XkbMaxRadioGroups      = 0x20,
		XkbAllRadioGroupsMask  = 0xffffffff,
		XkbMaxShiftLevel       = 0x3F,
		XkbMaxSymsPerKey       = XkbMaxShiftLevel*XkbNumKbdGroups,
		XkbRGMaxMembers        = 0xC,
		XkbActionMessageLength = 0x6,
		XkbKeyNameLength       = 0x4,
		XkbMaxRedirectCount    = 0x8;

	/** Mask bits for {@link XkbDescRec}. */
	public static final int
		XkbControlsMask      = 1<<0,
		XkbServerMapMask     = 1<<1,
		XkbIClientMapMask    = 1<<2,
		XkbIndicatorMapMask  = 1<<3,
		XkbNamesMask         = 1<<4,
		XkbCompatMapMask     = 1<<5,
		XkbGeometryMask      = 1<<6,
		XkbAllComponentsMask = 0x7F;

	static { LWJGLUtil.initialize(); }

	private XKBlib() {}

	// --- [ XkbQueryExtension ] ---

	/** JNI method for {@link #XkbQueryExtension} */
	@JavadocExclude
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
	@JavadocExclude
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
	@JavadocExclude
	public static native long nXkbKeycodeToKeysym(long display, int kc, int group, int level);

	/**
	 * Finds the keysym bound to a particular key at a specified group and shift level.
	 *
	 * @param display the connection to the X server
	 * @param kc      key of interest
	 * @param group   group of interest
	 * @param level   shift level of interest
	 */
	public static long XkbKeycodeToKeysym(long display, int kc, int group, int level) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXkbKeycodeToKeysym(display, kc, group, level);
	}

	// --- [ XkbGetKeyboard ] ---

	/** JNI method for {@link #XkbGetKeyboard} */
	@JavadocExclude
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
	@JavadocExclude
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