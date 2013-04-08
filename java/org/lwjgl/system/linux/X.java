/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

/** Native bindings to X.h. */
public final class X {

	/** RESERVED RESOURCE AND CONSTANT DEFINITIONS */
	public static final int
		None            = 0x0,
		ParentRelative  = 0x1,
		CopyFromParent  = 0x0,
		PointerWindow   = 0x0,
		InputFocus      = 0x1,
		PointerRoot     = 0x1,
		AnyPropertyType = 0x0,
		AnyKey          = 0x0,
		AnyButton       = 0x0,
		AllTemporary    = 0x0,
		CurrentTime     = 0x0,
		NoSymbol        = 0x0;

	/** ERROR CODES */
	public static final int
		Success           = 0x0,
		BadRequest        = 0x1,
		BadValue          = 0x2,
		BadWindow         = 0x3,
		BadPixmap         = 0x4,
		BadAtom           = 0x5,
		BadCursor         = 0x6,
		BadFont           = 0x7,
		BadMatch          = 0x8,
		BadDrawable       = 0x9,
		BadAccess         = 0xA,
		BadAlloc          = 0xB,
		BadColor          = 0xC,
		BadGC             = 0xD,
		BadIDChoice       = 0xE,
		BadName           = 0xF,
		BadLength         = 0x10,
		BadImplementation = 0x11;

	/** Window attributes for CreateWindow and ChangeWindowAttributes */
	public static final int
		CWBackPixmap       = 1 << 0,
		CWBackPixel        = 1 << 1,
		CWBorderPixmap     = 1 << 2,
		CWBorderPixel      = 1 << 3,
		CWBitGravity       = 1 << 4,
		CWWinGravity       = 1 << 5,
		CWBackingStore     = 1 << 6,
		CWBackingPlanes    = 1 << 7,
		CWBackingPixel     = 1 << 8,
		CWOverrideRedirect = 1 << 9,
		CWSaveUnder        = 1 << 10,
		CWEventMask        = 1 << 11,
		CWDontPropagate    = 1 << 12,
		CWColormap         = 1 << 13,
		CWCursor           = 1 << 14;

	/** Input Event Masks. Used as event-mask window attribute and as arguments to Grab requests. Not to be confused with event names. */
	public static final int
		NoEventMask              = 0x0,
		KeyPressMask             = 1 << 0,
		KeyReleaseMask           = 1 << 1,
		ButtonPressMask          = 1 << 2,
		ButtonReleaseMask        = 1 << 3,
		EnterWindowMask          = 1 << 4,
		LeaveWindowMask          = 1 << 5,
		PointerMotionMask        = 1 << 6,
		PointerMotionHintMask    = 1 << 7,
		Button1MotionMask        = 1 << 8,
		Button2MotionMask        = 1 << 9,
		Button3MotionMask        = 1 << 10,
		Button4MotionMask        = 1 << 11,
		Button5MotionMask        = 1 << 12,
		ButtonMotionMask         = 1 << 13,
		KeymapStateMask          = 1 << 14,
		ExposureMask             = 1 << 15,
		VisibilityChangeMask     = 1 << 16,
		StructureNotifyMask      = 1 << 17,
		ResizeRedirectMask       = 1 << 18,
		SubstructureNotifyMask   = 1 << 19,
		SubstructureRedirectMask = 1 << 20,
		FocusChangeMask          = 1 << 21,
		PropertyChangeMask       = 1 << 22,
		ColormapChangeMask       = 1 << 23,
		OwnerGrabButtonMask      = 1 << 24;

	/** Window classes used by {@link Xlib#XCreateWindow}. */
	public static final int
		InputOutput = 0x1,
		InputOnly   = 0x2;

	/** GrabPointer, GrabButton, GrabKeyboard, GrabKey Modes */
	public static final int
		GrabModeSync  = 0x0,
		GrabModeAsync = 0x1;

	/** GrabPointer, GrabKeyboard reply status */
	public static final int
		GrabSuccess     = 0x0,
		AlreadyGrabbed  = 0x1,
		GrabInvalidTime = 0x2,
		GrabNotViewable = 0x3,
		GrabFrozen      = 0x4;

	/** SCREEN SAVER STUFF */
	public static final int
		DontPreferBlanking    = 0x0,
		PreferBlanking        = 0x1,
		DefaultBlanking       = 0x2,
		DisableScreenSaver    = 0x0,
		DisableScreenInterval = 0x0,
		DontAllowExposures    = 0x0,
		AllowExposures        = 0x1,
		DefaultExposures      = 0x2,
		ScreenSaverReset      = 0x0,
		ScreenSaverActive     = 0x1;

	/** Used in {@link Xlib#XSetInputFocus}, {@link Xlib#XGetInputFocus}. */
	public static final int
		RevertToNone        = None,
		RevertToPointerRoot = PointerRoot,
		RevertToParent      = 0x2;

	/** Property modes */
	public static final int
		PropModeReplace = 0x0,
		PropModePrepend = 0x1,
		PropModeAppend  = 0x2;

	/** graphics functions, as in GC.alu */
	public static final int
		GXclear        = 0x0,
		GXand          = 0x1,
		GXandReverse   = 0x2,
		GXcopy         = 0x3,
		GXandInverted  = 0x4,
		GXnoop         = 0x5,
		GXxor          = 0x6,
		GXor           = 0x7,
		GXnor          = 0x8,
		GXequiv        = 0x9,
		GXinvert       = 0xA,
		GXorReverse    = 0xB,
		GXcopyInverted = 0xC,
		GXorInverted   = 0xD,
		GXnand         = 0xE,
		GXset          = 0xF;

	private X() {}

}