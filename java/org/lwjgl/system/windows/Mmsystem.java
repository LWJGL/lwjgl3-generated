/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to Mmsystem.h. */
public final class Mmsystem {

	/** general error return values. */
	public static final int
		MMSYSERR_NOERROR      = 0x0,
		MMSYSERR_ERROR        = 0 + 1,
		MMSYSERR_BADDEVICEID  = 0 + 2,
		MMSYSERR_NOTENABLED   = 0 + 3,
		MMSYSERR_ALLOCATED    = 0 + 4,
		MMSYSERR_INVALHANDLE  = 0 + 5,
		MMSYSERR_NODRIVER     = 0 + 6,
		MMSYSERR_NOMEM        = 0 + 7,
		MMSYSERR_NOTSUPPORTED = 0 + 8,
		MMSYSERR_BADERRNUM    = 0 + 9,
		MMSYSERR_INVALFLAG    = 0 + 10,
		MMSYSERR_INVALPARAM   = 0 + 11,
		MMSYSERR_HANDLEBUSY   = 0 + 12,
		MMSYSERR_INVALIDALIAS = 0 + 13,
		MMSYSERR_BADDB        = 0 + 14,
		MMSYSERR_KEYNOTFOUND  = 0 + 15,
		MMSYSERR_READERROR    = 0 + 16,
		MMSYSERR_WRITEERROR   = 0 + 17,
		MMSYSERR_DELETEERROR  = 0 + 18,
		MMSYSERR_VALNOTFOUND  = 0 + 19,
		MMSYSERR_NODRIVERCB   = 0 + 20,
		MMSYSERR_MOREDATA     = 0 + 21,
		MMSYSERR_LASTERROR    = 0 + 21;

	/** joystick error return values. */
	public static final int
		JOYERR_NOERROR   = 0x0,
		JOYERR_PARMS     = 160 + 5,
		JOYERR_NOCANDO   = 160 + 6,
		JOYERR_UNPLUGGED = 160 + 7;

	/** Constants used with JOYINFO and JOYINFOEX structures and MM_JOY* messages. */
	public static final int
		JOY_BUTTON1    = 0x1,
		JOY_BUTTON2    = 0x2,
		JOY_BUTTON3    = 0x4,
		JOY_BUTTON4    = 0x8,
		JOY_BUTTON1CHG = 0x100,
		JOY_BUTTON2CHG = 0x200,
		JOY_BUTTON3CHG = 0x400;

	/** constants used with JOYINFOEX. */
	public static final int
		JOY_BUTTON5  = 0x10,
		JOY_BUTTON6  = 0x20,
		JOY_BUTTON7  = 0x40,
		JOY_BUTTON8  = 0x80,
		JOY_BUTTON9  = 0x100,
		JOY_BUTTON10 = 0x200,
		JOY_BUTTON11 = 0x400,
		JOY_BUTTON12 = 0x800,
		JOY_BUTTON13 = 0x1000,
		JOY_BUTTON14 = 0x2000,
		JOY_BUTTON15 = 0x4000,
		JOY_BUTTON16 = 0x8000,
		JOY_BUTTON17 = 0x10000,
		JOY_BUTTON18 = 0x20000,
		JOY_BUTTON19 = 0x40000,
		JOY_BUTTON20 = 0x80000,
		JOY_BUTTON21 = 0x100000,
		JOY_BUTTON22 = 0x200000,
		JOY_BUTTON23 = 0x400000,
		JOY_BUTTON24 = 0x800000,
		JOY_BUTTON25 = 0x1000000,
		JOY_BUTTON26 = 0x2000000,
		JOY_BUTTON27 = 0x4000000,
		JOY_BUTTON28 = 0x8000000,
		JOY_BUTTON29 = 0x10000000,
		JOY_BUTTON30 = 0x20000000,
		JOY_BUTTON31 = 0x40000000,
		JOY_BUTTON32 = 0x80000000;

	/** constants used with JOYINFOEX structure. */
	public static final int
		JOY_POVCENTERED    = 0xFFFFFFFF,
		JOY_POVFORWARD     = 0x0,
		JOY_POVRIGHT       = 0x2328,
		JOY_POVBACKWARD    = 0x4650,
		JOY_POVLEFT        = 0x6978,
		JOY_RETURNX        = 0x1,
		JOY_RETURNY        = 0x2,
		JOY_RETURNZ        = 0x4,
		JOY_RETURNR        = 0x8,
		JOY_RETURNU        = 0x10,
		JOY_RETURNV        = 0x20,
		JOY_RETURNPOV      = 0x40,
		JOY_RETURNBUTTONS  = 0x80,
		JOY_RETURNRAWDATA  = 0x100,
		JOY_RETURNPOVCTS   = 0x200,
		JOY_RETURNCENTERED = 0x400,
		JOY_USEDEADZONE    = 0x800,
		JOY_RETURNALL      = (JOY_RETURNX | JOY_RETURNY | JOY_RETURNZ | JOY_RETURNR | JOY_RETURNU | JOY_RETURNV | JOY_RETURNPOV | JOY_RETURNBUTTONS),
		JOY_CAL_READALWAYS = 0x10000,
		JOY_CAL_READXYONLY = 0x20000,
		JOY_CAL_READ3      = 0x40000,
		JOY_CAL_READ4      = 0x80000,
		JOY_CAL_READXONLY  = 0x100000,
		JOY_CAL_READYONLY  = 0x200000,
		JOY_CAL_READ5      = 0x400000,
		JOY_CAL_READ6      = 0x800000,
		JOY_CAL_READZONLY  = 0x1000000,
		JOY_CAL_READRONLY  = 0x2000000,
		JOY_CAL_READUONLY  = 0x4000000,
		JOY_CAL_READVONLY  = 0x8000000;

	/** joystick ID constants. */
	public static final int
		JOYSTICKID1 = 0x0,
		JOYSTICKID2 = 0x1;

	/** joystick driver capabilites. */
	public static final int
		JOYCAPS_HASZ    = 0x1,
		JOYCAPS_HASR    = 0x2,
		JOYCAPS_HASU    = 0x4,
		JOYCAPS_HASV    = 0x8,
		JOYCAPS_HASPOV  = 0x10,
		JOYCAPS_POV4DIR = 0x20,
		JOYCAPS_POVCTS  = 0x40;

	static { LWJGLUtil.initialize(); }

	private Mmsystem() {}

	// --- [ joyGetDevCaps ] ---

	/** JNI method for {@link #joyGetDevCaps} */
	@JavadocExclude
	public static native int njoyGetDevCaps(long joyID, long jc, int bjc);

	/**
	 * Queries a joystick to determine its capabilities.
	 *
	 * @param joyID Identifier of the joystick to be queried. Valid values for {@code joyID} range from -1 to 15. A value of -1 enables retrieval of the
	 *              {@code szRegKey} member of the {@link JOYCAPS} structure whether a device is present or not.
	 * @param jc    pointer to a {@code JOYCAPS} structure to contain the capabilities of the joystick.
	 * @param bjc   size, in bytes, of the {@code JOYCAPS} structure.
	 */
	public static int joyGetDevCaps(long joyID, ByteBuffer jc, int bjc) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(jc, JOYCAPS.SIZEOF);
		return njoyGetDevCaps(joyID, memAddress(jc), bjc);
	}

	// --- [ joyGetPos ] ---

	/** JNI method for {@link #joyGetPos} */
	@JavadocExclude
	public static native int njoyGetPos(int joyID, long ji);

	/**
	 * Queries a joystick for its position and button status.
	 *
	 * @param joyID identifier of the joystick to be queried. Valid values for {@code joyID} range from zero ({@link #JOYSTICKID1}) to 15
	 * @param ji    pointer to a {@link JOYINFO} structure that contains the position and button status of the joystick
	 */
	public static int joyGetPos(int joyID, ByteBuffer ji) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ji, JOYINFO.SIZEOF);
		return njoyGetPos(joyID, memAddress(ji));
	}

	// --- [ joyGetPosEx ] ---

	/** JNI method for {@link #joyGetPosEx} */
	@JavadocExclude
	public static native int njoyGetPosEx(int joyID, long ji);

	/**
	 * Queries a joystick for its position and button status.
	 *
	 * @param joyID identifier of the joystick to be queried. Valid values for {@code joyID} range from zero ({@link #JOYSTICKID1}) to 15
	 * @param ji    pointer to a {@link JOYINFOEX} structure that contains the position and button status of the joystick. You must set the {@code size} and
	 *              {@code flags} members or {@code joyGetPosEx} will fail. The information returned from {@code joyGetPosEx} depends on the flags you specify in
	 *              {@code flags}.
	 */
	public static int joyGetPosEx(int joyID, ByteBuffer ji) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ji, JOYINFOEX.SIZEOF);
		return njoyGetPosEx(joyID, memAddress(ji));
	}

	// --- [ timeGetTime ] ---

	/**
	 * retrieves the system time, in milliseconds. The system time is the time elapsed since Windows was started.
	 * 
	 * <p>Note that the value returned by the {@code timeGetTime} function is a {@code DWORD} value. The return value wraps around to 0 every 2^32 milliseconds,
	 * which is about 49.71 days. This can cause problems in code that directly uses the {@code timeGetTime} return value in computations, particularly where
	 * the value is used to control code execution. You should always use the difference between two {@code timeGetTime} return values in computations.</p>
	 */
	public static native int timeGetTime();

}