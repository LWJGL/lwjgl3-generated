/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to libX11. */
public class X11 {

	/** Boolean values */
	public static final int
		True  = 0x1,
		False = 0x0;

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

	/**
	 * Event names. Used in "type" field in {@code XEvent} structures. Not to be confused with event masks above. They start from 2 because 0 and 1 are reserved in
	 * the protocol for errors and replies.
	 */
	public static final int
		KeyPress         = 0x2,
		KeyRelease       = 0x3,
		ButtonPress      = 0x4,
		ButtonRelease    = 0x5,
		MotionNotify     = 0x6,
		EnterNotify      = 0x7,
		LeaveNotify      = 0x8,
		FocusIn          = 0x9,
		FocusOut         = 0xA,
		KeymapNotify     = 0xB,
		Expose           = 0xC,
		GraphicsExpose   = 0xD,
		NoExpose         = 0xE,
		VisibilityNotify = 0xF,
		CreateNotify     = 0x10,
		DestroyNotify    = 0x11,
		UnmapNotify      = 0x12,
		MapNotify        = 0x13,
		MapRequest       = 0x14,
		ReparentNotify   = 0x15,
		ConfigureNotify  = 0x16,
		ConfigureRequest = 0x17,
		GravityNotify    = 0x18,
		ResizeRequest    = 0x19,
		CirculateNotify  = 0x1A,
		CirculateRequest = 0x1B,
		PropertyNotify   = 0x1C,
		SelectionClear   = 0x1D,
		SelectionRequest = 0x1E,
		SelectionNotify  = 0x1F,
		ColormapNotify   = 0x20,
		ClientMessage    = 0x21,
		MappingNotify    = 0x22,
		GenericEvent     = 0x23,
		LASTEvent        = 0x24;

	/** Key masks. Used as modifiers to GrabButton and GrabKey, results of QueryPointer, state in various key-, mouse-, and button-related events. */
	public static final int
		ShiftMask   = 1<<0,
		LockMask    = 1<<1,
		ControlMask = 1<<2,
		Mod1Mask    = 1<<3,
		Mod2Mask    = 1<<4,
		Mod3Mask    = 1<<5,
		Mod4Mask    = 1<<6,
		Mod5Mask    = 1<<7;

	/** modifier names. Used to build a SetModifierMapping request or to read a GetModifierMapping request. These correspond to the masks defined above. */
	public static final int
		ShiftMapIndex   = 0x0,
		LockMapIndex    = 0x1,
		ControlMapIndex = 0x2,
		Mod1MapIndex    = 0x3,
		Mod2MapIndex    = 0x4,
		Mod3MapIndex    = 0x5,
		Mod4MapIndex    = 0x6,
		Mod5MapIndex    = 0x7;

	/** button masks. Used in same manner as Key masks above. Not to be confused with button names below. */
	public static final int
		Button1Mask = 1<<8,
		Button2Mask = 1<<9,
		Button3Mask = 1<<10,
		Button4Mask = 1<<11,
		Button5Mask = 1<<12,
		AnyModifier = 1<<15;

	/**
	 * button names. Used as arguments to GrabButton and as detail in ButtonPress and ButtonRelease events. Not to be confused with button masks above. Note
	 * that 0 is already defined above as "AnyButton".
	 */
	public static final int
		Button1 = 0x1,
		Button2 = 0x2,
		Button3 = 0x3,
		Button4 = 0x4,
		Button5 = 0x5;

	/** Notify modes */
	public static final int
		NotifyNormal       = 0x0,
		NotifyGrab         = 0x1,
		NotifyUngrab       = 0x2,
		NotifyWhileGrabbed = 0x3,
		NotifyHint         = 0x1;

	/** Notify detail */
	public static final int
		NotifyAncestor         = 0x0,
		NotifyVirtual          = 0x1,
		NotifyInferior         = 0x2,
		NotifyNonlinear        = 0x3,
		NotifyNonlinearVirtual = 0x4,
		NotifyPointer          = 0x5,
		NotifyPointerRoot      = 0x6,
		NotifyDetailNone       = 0x7;

	/** Visibility notify */
	public static final int
		VisibilityUnobscured        = 0x0,
		VisibilityPartiallyObscured = 0x1,
		VisibilityFullyObscured     = 0x2;

	/** Circulation request */
	public static final int
		PlaceOnTop    = 0x0,
		PlaceOnBottom = 0x1;

	/** Property notification */
	public static final int
		PropertyNewValue = 0x0,
		PropertyDelete   = 0x1;

	/** Color Map notification */
	public static final int
		ColormapUninstalled = 0x0,
		ColormapInstalled   = 0x1;

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

	/** AllowEvents modes */
	public static final int
		AsyncPointer   = 0x0,
		SyncPointer    = 0x1,
		ReplayPointer  = 0x2,
		AsyncKeyboard  = 0x3,
		SyncKeyboard   = 0x4,
		ReplayKeyboard = 0x5,
		AsyncBoth      = 0x6,
		SyncBoth       = 0x7;

	/** For {@link #XCreateColormap}. */
	public static final int
		AllocNone = 0x0,
		AllocAll  = 0x1;

	/** Used in XSetInputFocus(), XGetInputFocus(). */
	public static final int
		RevertToNone        = None,
		RevertToPointerRoot = PointerRoot,
		RevertToParent      = 0x2;

	/** Window classes used by {@link #XCreateWindow}. */
	public static final int
		InputOutput = 0x1,
		InputOnly   = 0x2;

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

	/** LineStyle */
	public static final int
		LineSolid      = 0x0,
		LineOnOffDash  = 0x1,
		LineDoubleDash = 0x2;

	/** capStyle */
	public static final int
		CapNotLast    = 0x0,
		CapButt       = 0x1,
		CapRound      = 0x2,
		CapProjecting = 0x3;

	/** joinStyle */
	public static final int
		JoinMiter = 0x0,
		JoinRound = 0x1,
		JoinBevel = 0x2;

	/** fillStyle */
	public static final int
		FillSolid          = 0x0,
		FillTiled          = 0x1,
		FillStippled       = 0x2,
		FillOpaqueStippled = 0x3;

	/** fillRule */
	public static final int
		EvenOddRule = 0x0,
		WindingRule = 0x1;

	/** subwindow mode */
	public static final int
		ClipByChildren   = 0x0,
		IncludeInferiors = 0x1;

	/** SetClipRectangles ordering */
	public static final int
		Unsorted = 0x0,
		YSorted  = 0x1,
		YXSorted = 0x2,
		YXBanded = 0x3;

	/** CoordinateMode for drawing routines */
	public static final int
		CoordModeOrigin   = 0x0,
		CoordModePrevious = 0x1;

	/** Polygon shapes */
	public static final int
		Complex   = 0x0,
		Nonconvex = 0x1,
		Convex    = 0x2;

	/** Arc modes for PolyFillArc */
	public static final int
		ArcChord    = 0x0,
		ArcPieSlice = 0x1;

	/** GC components: masks used in CreateGC, CopyGC, ChangeGC, OR'ed into GC.stateChanges */
	public static final int
		GCFunction          = 1<<0,
		GCPlaneMask         = 1<<1,
		GCForeground        = 1<<2,
		GCBackground        = 1<<3,
		GCLineWidth         = 1<<4,
		GCLineStyle         = 1<<5,
		GCCapStyle          = 1<<6,
		GCJoinStyle         = 1<<7,
		GCFillStyle         = 1<<8,
		GCFillRule          = 1<<9,
		GCTile              = 1<<10,
		GCStipple           = 1<<11,
		GCTileStipXOrigin   = 1<<12,
		GCTileStipYOrigin   = 1<<13,
		GCFont              = 1<<14,
		GCSubwindowMode     = 1<<15,
		GCGraphicsExposures = 1<<16,
		GCClipXOrigin       = 1<<17,
		GCClipYOrigin       = 1<<18,
		GCClipMask          = 1<<19,
		GCDashOffset        = 1<<20,
		GCDashList          = 1<<21,
		GCArcMode           = 1<<22,
		GCLastBit           = 0x16;

	protected X11() {
		throw new UnsupportedOperationException();
	}

	private static final SharedLibrary X11 = Library.loadNative("X11");

	/** Contains the function pointers loaded from the X11 {@link SharedLibrary}. */
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			XOpenDisplay    = apiGetFunctionAddress(X11, "XOpenDisplay"),
			XCloseDisplay   = apiGetFunctionAddress(X11, "XCloseDisplay"),
			XDefaultScreen  = apiGetFunctionAddress(X11, "XDefaultScreen"),
			XRootWindow     = apiGetFunctionAddress(X11, "XRootWindow"),
			XCreateColormap = apiGetFunctionAddress(X11, "XCreateColormap"),
			XFreeColormap   = apiGetFunctionAddress(X11, "XFreeColormap"),
			XCreateWindow   = apiGetFunctionAddress(X11, "XCreateWindow"),
			XDestroyWindow  = apiGetFunctionAddress(X11, "XDestroyWindow"),
			XFree           = apiGetFunctionAddress(X11, "XFree");

	}

	/** Returns the X11 {@link SharedLibrary}. */
	public static SharedLibrary getLibrary() {
		return X11;
	}

	// --- [ XOpenDisplay ] ---

	/**
	 * Returns a Display structure that serves as the connection to the X server and that contains all the information about that X server. {@code XOpenDisplay}
	 * connects your application to the X server through TCP or DECnet communications protocols, or through some local inter-process communication protocol.
	 * If the hostname is a host machine name and a single colon (:) separates the hostname and display number, {@code XOpenDisplay} connects using TCP streams.
	 * If the hostname is not specified, Xlib uses whatever it believes is the fastest transport. If the hostname is a host machine name and a double colon
	 * (::) separates the hostname and display number, {@code XOpenDisplay} connects using DECnet. A single X server can support any or all of these transport
	 * mechanisms simultaneously. A particular Xlib implementation can support many more of these transport mechanisms.
	 *
	 * @param display_name the hardware display name, which determines the display and communications domain to be used. On a POSIX-conformant system, if the
	 *                     {@code display_name} is {@code NULL}, it defaults to the value of the DISPLAY environment variable.
	 */
	public static long nXOpenDisplay(long display_name) {
		long __functionAddress = Functions.XOpenDisplay;
		return invokePP(__functionAddress, display_name);
	}

	/**
	 * Returns a Display structure that serves as the connection to the X server and that contains all the information about that X server. {@code XOpenDisplay}
	 * connects your application to the X server through TCP or DECnet communications protocols, or through some local inter-process communication protocol.
	 * If the hostname is a host machine name and a single colon (:) separates the hostname and display number, {@code XOpenDisplay} connects using TCP streams.
	 * If the hostname is not specified, Xlib uses whatever it believes is the fastest transport. If the hostname is a host machine name and a double colon
	 * (::) separates the hostname and display number, {@code XOpenDisplay} connects using DECnet. A single X server can support any or all of these transport
	 * mechanisms simultaneously. A particular Xlib implementation can support many more of these transport mechanisms.
	 *
	 * @param display_name the hardware display name, which determines the display and communications domain to be used. On a POSIX-conformant system, if the
	 *                     {@code display_name} is {@code NULL}, it defaults to the value of the DISPLAY environment variable.
	 */
	public static long XOpenDisplay(ByteBuffer display_name) {
		if ( CHECKS )
			if ( display_name != null ) checkNT1(display_name);
		return nXOpenDisplay(memAddressSafe(display_name));
	}

	/**
	 * Returns a Display structure that serves as the connection to the X server and that contains all the information about that X server. {@code XOpenDisplay}
	 * connects your application to the X server through TCP or DECnet communications protocols, or through some local inter-process communication protocol.
	 * If the hostname is a host machine name and a single colon (:) separates the hostname and display number, {@code XOpenDisplay} connects using TCP streams.
	 * If the hostname is not specified, Xlib uses whatever it believes is the fastest transport. If the hostname is a host machine name and a double colon
	 * (::) separates the hostname and display number, {@code XOpenDisplay} connects using DECnet. A single X server can support any or all of these transport
	 * mechanisms simultaneously. A particular Xlib implementation can support many more of these transport mechanisms.
	 *
	 * @param display_name the hardware display name, which determines the display and communications domain to be used. On a POSIX-conformant system, if the
	 *                     {@code display_name} is {@code NULL}, it defaults to the value of the DISPLAY environment variable.
	 */
	public static long XOpenDisplay(CharSequence display_name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer display_nameEncoded = display_name == null ? null : stack.ASCII(display_name);
			return nXOpenDisplay(memAddressSafe(display_nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ XCloseDisplay ] ---

	/**
	 * Closes the connection to the X server for the display specified in the {@code Display} structure and destroys all windows, resource IDs (Window, Font,
	 * Pixmap, Colormap, Cursor, and GContext), or other resources that the client has created on this display, unless the close-down mode of the resource has
	 * been changed (see {@code XSetCloseDownMode()}). Therefore, these windows, resource IDs, and other resources should never be referenced again or an error will
	 * be generated. Before exiting, you should call {@code XCloseDisplay()} explicitly so that any pending errors are reported as {@code XCloseDisplay()}
	 * performs a final {@code XSync()} operation.
	 *
	 * @param display the connection to the X server
	 */
	public static void XCloseDisplay(long display) {
		long __functionAddress = Functions.XCloseDisplay;
		if ( CHECKS )
			checkPointer(display);
		invokePV(__functionAddress, display);
	}

	// --- [ XDefaultScreen ] ---

	/**
	 * Returns a pointer to the default screen.
	 *
	 * @param display the connection to the X server
	 */
	public static int XDefaultScreen(long display) {
		long __functionAddress = Functions.XDefaultScreen;
		if ( CHECKS )
			checkPointer(display);
		return invokePI(__functionAddress, display);
	}

	// --- [ XRootWindow ] ---

	/**
	 * Returns the root window of the specified screen.
	 *
	 * @param display       the connection to the X server
	 * @param screen_number the appropriate screen number on the host server
	 */
	public static long XRootWindow(long display, int screen_number) {
		long __functionAddress = Functions.XRootWindow;
		if ( CHECKS )
			checkPointer(display);
		return invokePIP(__functionAddress, display, screen_number);
	}

	// --- [ XCreateColormap ] ---

	/**
	 * Creates a colormap of the specified visual type for the screen on which the specified window resides and returns the colormap ID associated with it.
	 * Note that the specified window is only used to determine the screen.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 * @param visual  a visual type supported on the screen. If the visual type is not one supported by the screen, a {@code BadMatch} error results.
	 * @param alloc   the colormap entries to be allocated. You can pass AllocNone or AllocAll.
	 */
	public static long nXCreateColormap(long display, long w, long visual, int alloc) {
		long __functionAddress = Functions.XCreateColormap;
		if ( CHECKS )
			checkPointer(display);
		return invokePPPIP(__functionAddress, display, w, visual, alloc);
	}

	/**
	 * Creates a colormap of the specified visual type for the screen on which the specified window resides and returns the colormap ID associated with it.
	 * Note that the specified window is only used to determine the screen.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 * @param visual  a visual type supported on the screen. If the visual type is not one supported by the screen, a {@code BadMatch} error results.
	 * @param alloc   the colormap entries to be allocated. You can pass AllocNone or AllocAll.
	 */
	public static long XCreateColormap(long display, long w, Visual visual, int alloc) {
		return nXCreateColormap(display, w, visual.address(), alloc);
	}

	// --- [ XFreeColormap ] ---

	/**
	 * Deletes the association between the {@code colormap} resource ID and the {@code colormap} and frees the {@code colormap} storage. However, this function
	 * has no effect on the default colormap for a screen. If the specified {@code colormap} is an installed map for a screen, it is uninstalled. If the
	 * specified {@code colormap} is defined as the {@code colormap} for a window, {@code XFreeColormap()} changes the colormap associated with the window to
	 * {@link #None} and generates a {@code ColormapNotify} event. X does not define the colors displayed for a window with a colormap of {@link #None}.
	 *
	 * @param display  the connection to the X server
	 * @param colormap the colormap to destroy
	 */
	public static int XFreeColormap(long display, long colormap) {
		long __functionAddress = Functions.XFreeColormap;
		if ( CHECKS )
			checkPointer(display);
		return invokePPI(__functionAddress, display, colormap);
	}

	// --- [ XCreateWindow ] ---

	/**
	 * Creates an unmapped subwindow for a specified parent window, returns the window ID of the created window, and causes the X server to generate a
	 * {@code CreateNotify }event. The created window is placed on top in the stacking order with respect to siblings.
	 * 
	 * <p>The coordinate system has the X axis horizontal and the Y axis vertical with the origin [0, 0] at the upper-left corner. Coordinates are integral, in
	 * terms of pixels, and coincide with pixel centers. Each window and pixmap has its own coordinate system. For a window, the origin is inside the border at
	 * the inside, upper-left corner.</p>
	 * 
	 * <p>The x and y coordinates are the top-left outside corner of the window's borders and are relative to the inside of the parent window's borders.</p>
	 * 
	 * <p>The width and height are the created window's inside dimensions and do not include the created window's borders.</p>
	 *
	 * @param display      the connection to the X server
	 * @param parent       the parent window
	 * @param x            the window x-coordinate
	 * @param y            the window y-coordinate
	 * @param width        the window width
	 * @param height       the window height
	 * @param border_width the border width
	 * @param depth        the window's depth. A depth of {@link #CopyFromParent} means the depth is taken from the parent.
	 * @param windowClass  the created window's class. One of:<br><table><tr><td>{@link #InputOutput}</td><td>{@link #InputOnly}</td><td>{@link #CopyFromParent}</td></tr></table>
	 * @param visual       the visual type. A visual of {@link #CopyFromParent} means the visual type is taken from the parent.
	 * @param valuemask    which window attributes are defined in the attributes argument. This mask is the bitwise inclusive OR of the valid attribute mask bits. If
	 *                     {@code valuemask} is zero, the attributes are ignored and are not referenced.
	 * @param attributes   the structure from which the values (as specified by the value mask) are to be taken
	 */
	public static long nXCreateWindow(long display, long parent, int x, int y, int width, int height, int border_width, int depth, int windowClass, long visual, long valuemask, long attributes) {
		long __functionAddress = Functions.XCreateWindow;
		if ( CHECKS )
			checkPointer(display);
		return invokePPIIIIIIIPPPP(__functionAddress, display, parent, x, y, width, height, border_width, depth, windowClass, visual, valuemask, attributes);
	}

	/**
	 * Creates an unmapped subwindow for a specified parent window, returns the window ID of the created window, and causes the X server to generate a
	 * {@code CreateNotify }event. The created window is placed on top in the stacking order with respect to siblings.
	 * 
	 * <p>The coordinate system has the X axis horizontal and the Y axis vertical with the origin [0, 0] at the upper-left corner. Coordinates are integral, in
	 * terms of pixels, and coincide with pixel centers. Each window and pixmap has its own coordinate system. For a window, the origin is inside the border at
	 * the inside, upper-left corner.</p>
	 * 
	 * <p>The x and y coordinates are the top-left outside corner of the window's borders and are relative to the inside of the parent window's borders.</p>
	 * 
	 * <p>The width and height are the created window's inside dimensions and do not include the created window's borders.</p>
	 *
	 * @param display      the connection to the X server
	 * @param parent       the parent window
	 * @param x            the window x-coordinate
	 * @param y            the window y-coordinate
	 * @param width        the window width
	 * @param height       the window height
	 * @param border_width the border width
	 * @param depth        the window's depth. A depth of {@link #CopyFromParent} means the depth is taken from the parent.
	 * @param windowClass  the created window's class. One of:<br><table><tr><td>{@link #InputOutput}</td><td>{@link #InputOnly}</td><td>{@link #CopyFromParent}</td></tr></table>
	 * @param visual       the visual type. A visual of {@link #CopyFromParent} means the visual type is taken from the parent.
	 * @param valuemask    which window attributes are defined in the attributes argument. This mask is the bitwise inclusive OR of the valid attribute mask bits. If
	 *                     {@code valuemask} is zero, the attributes are ignored and are not referenced.
	 * @param attributes   the structure from which the values (as specified by the value mask) are to be taken
	 */
	public static long XCreateWindow(long display, long parent, int x, int y, int width, int height, int border_width, int depth, int windowClass, Visual visual, long valuemask, XSetWindowAttributes attributes) {
		return nXCreateWindow(display, parent, x, y, width, height, border_width, depth, windowClass, visual.address(), valuemask, attributes.address());
	}

	// --- [ XDestroyWindow ] ---

	/**
	 * Destroys the specified window as well as all of its subwindows and causes the X server to generate a {@code DestroyNotify} event for each window. The
	 * window should never be referenced again. If the window specified by the {@code w} argument is mapped, it is unmapped automatically. The ordering of the
	 * {@code DestroyNotify} events is such that for any given window being destroyed, {@code DestroyNotify} is generated on any inferiors of the window before
	 * being generated on the window itself. The ordering among siblings and across subhierarchies is not otherwise constrained. If the window you specified is
	 * a root window, no windows are destroyed. Destroying a mapped window will generate {@code Expose} events on other windows that were obscured by the
	 * window being destroyed.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 */
	public static int XDestroyWindow(long display, long w) {
		long __functionAddress = Functions.XDestroyWindow;
		if ( CHECKS )
			checkPointer(display);
		return invokePPI(__functionAddress, display, w);
	}

	// --- [ XFree ] ---

	/**
	 * Free in-memory data that was created by an Xlib function.
	 *
	 * @param data the data that is to be freed
	 */
	public static int nXFree(long data) {
		long __functionAddress = Functions.XFree;
		return invokePI(__functionAddress, data);
	}

	/**
	 * Free in-memory data that was created by an Xlib function.
	 *
	 * @param data the data that is to be freed
	 */
	public static int XFree(ByteBuffer data) {
		return nXFree(memAddress(data));
	}

	/** PointerBuffer version of: {@link #XFree} */
	public static int XFree(PointerBuffer data) {
		return nXFree(memAddress(data));
	}

}