/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This union is defined so Xlib can always use the same sized event structure internally, to avoid memory fragmentation. */
public final class XEvent {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		XKEY,
			XKEY_TYPE,
			XKEY_SERIAL,
			XKEY_SEND_EVENT,
			XKEY_DISPLAY,
			XKEY_WINDOW,
			XKEY_ROOT,
			XKEY_SUBWINDOW,
			XKEY_TIME,
			XKEY_X,
			XKEY_Y,
			XKEY_X_ROOT,
			XKEY_Y_ROOT,
			XKEY_STATE,
			XKEY_KEYCODE,
			XKEY_SAME_SCREEN,
		XERROR,
			XERROR_TYPE,
			XERROR_DISPLAY,
			XERROR_SERIAL,
			XERROR_ERROR_CODE,
			XERROR_REQUEST_CODE,
			XERROR_MINOR_CODE,
			XERROR_RESOURCEID,
		PAD;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		XKEY = offsets.get(1);
			XKEY_TYPE = XKEY + XKeyEvent.TYPE;
			XKEY_SERIAL = XKEY + XKeyEvent.SERIAL;
			XKEY_SEND_EVENT = XKEY + XKeyEvent.SEND_EVENT;
			XKEY_DISPLAY = XKEY + XKeyEvent.DISPLAY;
			XKEY_WINDOW = XKEY + XKeyEvent.WINDOW;
			XKEY_ROOT = XKEY + XKeyEvent.ROOT;
			XKEY_SUBWINDOW = XKEY + XKeyEvent.SUBWINDOW;
			XKEY_TIME = XKEY + XKeyEvent.TIME;
			XKEY_X = XKEY + XKeyEvent.X;
			XKEY_Y = XKEY + XKeyEvent.Y;
			XKEY_X_ROOT = XKEY + XKeyEvent.X_ROOT;
			XKEY_Y_ROOT = XKEY + XKeyEvent.Y_ROOT;
			XKEY_STATE = XKEY + XKeyEvent.STATE;
			XKEY_KEYCODE = XKEY + XKeyEvent.KEYCODE;
			XKEY_SAME_SCREEN = XKEY + XKeyEvent.SAME_SCREEN;
		XERROR = offsets.get(2);
			XERROR_TYPE = XERROR + XErrorEvent.TYPE;
			XERROR_DISPLAY = XERROR + XErrorEvent.DISPLAY;
			XERROR_SERIAL = XERROR + XErrorEvent.SERIAL;
			XERROR_ERROR_CODE = XERROR + XErrorEvent.ERROR_CODE;
			XERROR_REQUEST_CODE = XERROR + XErrorEvent.REQUEST_CODE;
			XERROR_MINOR_CODE = XERROR + XErrorEvent.MINOR_CODE;
			XERROR_RESOURCEID = XERROR + XErrorEvent.RESOURCEID;
		PAD = offsets.get(3);
	}

	private XEvent() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int type,
		int xkey_type,
		long xkey_serial,
		int xkey_send_event,
		long xkey_display,
		long xkey_window,
		long xkey_root,
		long xkey_subwindow,
		long xkey_time,
		int xkey_x,
		int xkey_y,
		int xkey_x_root,
		int xkey_y_root,
		int xkey_state,
		int xkey_keycode,
		int xkey_same_screen,
		int xerror_type,
		long xerror_display,
		long xerror_serial,
		int xerror_error_code,
		int xerror_request_code,
		int xerror_minor_code,
		long xerror_resourceid,
		long pad,
		int padBytes
	) {
		ByteBuffer xevent = malloc();

		typeSet(xevent, type);
		xkeyTypeSet(xevent, xkey_type);
		xkeySerialSet(xevent, xkey_serial);
		xkeySend_eventSet(xevent, xkey_send_event);
		xkeyDisplaySet(xevent, xkey_display);
		xkeyWindowSet(xevent, xkey_window);
		xkeyRootSet(xevent, xkey_root);
		xkeySubwindowSet(xevent, xkey_subwindow);
		xkeyTimeSet(xevent, xkey_time);
		xkeyXSet(xevent, xkey_x);
		xkeyYSet(xevent, xkey_y);
		xkeyX_rootSet(xevent, xkey_x_root);
		xkeyY_rootSet(xevent, xkey_y_root);
		xkeyStateSet(xevent, xkey_state);
		xkeyKeycodeSet(xevent, xkey_keycode);
		xkeySame_screenSet(xevent, xkey_same_screen);
		xerrorTypeSet(xevent, xerror_type);
		xerrorDisplaySet(xevent, xerror_display);
		xerrorSerialSet(xevent, xerror_serial);
		xerrorError_codeSet(xevent, xerror_error_code);
		xerrorRequest_codeSet(xevent, xerror_request_code);
		xerrorMinor_codeSet(xevent, xerror_minor_code);
		xerrorResourceidSet(xevent, xerror_resourceid);
		padSet(xevent, pad, padBytes);

		return xevent;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int type,
		int xkey_type,
		long xkey_serial,
		int xkey_send_event,
		long xkey_display,
		long xkey_window,
		long xkey_root,
		long xkey_subwindow,
		long xkey_time,
		int xkey_x,
		int xkey_y,
		int xkey_x_root,
		int xkey_y_root,
		int xkey_state,
		int xkey_keycode,
		int xkey_same_screen,
		int xerror_type,
		long xerror_display,
		long xerror_serial,
		int xerror_error_code,
		int xerror_request_code,
		int xerror_minor_code,
		long xerror_resourceid,
		ByteBuffer pad
	) {
		ByteBuffer xevent = malloc();

		typeSet(xevent, type);
		xkeyTypeSet(xevent, xkey_type);
		xkeySerialSet(xevent, xkey_serial);
		xkeySend_eventSet(xevent, xkey_send_event);
		xkeyDisplaySet(xevent, xkey_display);
		xkeyWindowSet(xevent, xkey_window);
		xkeyRootSet(xevent, xkey_root);
		xkeySubwindowSet(xevent, xkey_subwindow);
		xkeyTimeSet(xevent, xkey_time);
		xkeyXSet(xevent, xkey_x);
		xkeyYSet(xevent, xkey_y);
		xkeyX_rootSet(xevent, xkey_x_root);
		xkeyY_rootSet(xevent, xkey_y_root);
		xkeyStateSet(xevent, xkey_state);
		xkeyKeycodeSet(xevent, xkey_keycode);
		xkeySame_screenSet(xevent, xkey_same_screen);
		xerrorTypeSet(xevent, xerror_type);
		xerrorDisplaySet(xevent, xerror_display);
		xerrorSerialSet(xevent, xerror_serial);
		xerrorError_codeSet(xevent, xerror_error_code);
		xerrorRequest_codeSet(xevent, xerror_request_code);
		xerrorMinor_codeSet(xevent, xerror_minor_code);
		xerrorResourceidSet(xevent, xerror_resourceid);
		padSet(xevent, pad);

		return xevent;
	}

	public static void typeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + TYPE, type); }
	public static void xkeyTypeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XKEY_TYPE, type); }
	public static void xkeySerialSet(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XKEY_SERIAL, serial); }
	public static void xkeySend_eventSet(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XKEY_SEND_EVENT, send_event); }
	public static void xkeyDisplaySet(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XKEY_DISPLAY, display); }
	public static void xkeyWindowSet(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XKEY_WINDOW, window); }
	public static void xkeyRootSet(ByteBuffer xevent, long root) { PointerBuffer.put(xevent, xevent.position() + XKEY_ROOT, root); }
	public static void xkeySubwindowSet(ByteBuffer xevent, long subwindow) { PointerBuffer.put(xevent, xevent.position() + XKEY_SUBWINDOW, subwindow); }
	public static void xkeyTimeSet(ByteBuffer xevent, long time) { PointerBuffer.put(xevent, xevent.position() + XKEY_TIME, time); }
	public static void xkeyXSet(ByteBuffer xevent, int x) { xevent.putInt(xevent.position() + XKEY_X, x); }
	public static void xkeyYSet(ByteBuffer xevent, int y) { xevent.putInt(xevent.position() + XKEY_Y, y); }
	public static void xkeyX_rootSet(ByteBuffer xevent, int x_root) { xevent.putInt(xevent.position() + XKEY_X_ROOT, x_root); }
	public static void xkeyY_rootSet(ByteBuffer xevent, int y_root) { xevent.putInt(xevent.position() + XKEY_Y_ROOT, y_root); }
	public static void xkeyStateSet(ByteBuffer xevent, int state) { xevent.putInt(xevent.position() + XKEY_STATE, state); }
	public static void xkeyKeycodeSet(ByteBuffer xevent, int keycode) { xevent.putInt(xevent.position() + XKEY_KEYCODE, keycode); }
	public static void xkeySame_screenSet(ByteBuffer xevent, int same_screen) { xevent.putInt(xevent.position() + XKEY_SAME_SCREEN, same_screen); }
	public static void xerrorTypeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XERROR_TYPE, type); }
	public static void xerrorDisplaySet(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XERROR_DISPLAY, display); }
	public static void xerrorSerialSet(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XERROR_SERIAL, serial); }
	public static void xerrorError_codeSet(ByteBuffer xevent, int error_code) { xevent.put(xevent.position() + XERROR_ERROR_CODE, (byte)error_code); }
	public static void xerrorRequest_codeSet(ByteBuffer xevent, int request_code) { xevent.put(xevent.position() + XERROR_REQUEST_CODE, (byte)request_code); }
	public static void xerrorMinor_codeSet(ByteBuffer xevent, int minor_code) { xevent.put(xevent.position() + XERROR_MINOR_CODE, (byte)minor_code); }
	public static void xerrorResourceidSet(ByteBuffer xevent, long resourceid) { PointerBuffer.put(xevent, xevent.position() + XERROR_RESOURCEID, resourceid); }
	public static void padSet(ByteBuffer xevent, long pad, int bytes) { memCopy(pad, memAddress(xevent) + PAD, bytes); }
	public static void padSet(ByteBuffer xevent, ByteBuffer pad) {
		checkBufferGT(pad, 24 * 8);
		padSet(xevent, memAddress(pad), pad.remaining());
	}

	public static int typeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + TYPE); }
	public static int xkeyTypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY_TYPE); }
	public static long xkeySerialGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY_SERIAL); }
	public static int xkeySend_eventGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY_SEND_EVENT); }
	public static long xkeyDisplayGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY_DISPLAY); }
	public static long xkeyWindowGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY_WINDOW); }
	public static long xkeyRootGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY_ROOT); }
	public static long xkeySubwindowGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY_SUBWINDOW); }
	public static long xkeyTimeGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY_TIME); }
	public static int xkeyXGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY_X); }
	public static int xkeyYGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY_Y); }
	public static int xkeyX_rootGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY_X_ROOT); }
	public static int xkeyY_rootGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY_Y_ROOT); }
	public static int xkeyStateGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY_STATE); }
	public static int xkeyKeycodeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY_KEYCODE); }
	public static int xkeySame_screenGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY_SAME_SCREEN); }
	public static int xerrorTypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XERROR_TYPE); }
	public static long xerrorDisplayGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XERROR_DISPLAY); }
	public static long xerrorSerialGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XERROR_SERIAL); }
	public static int xerrorError_codeGet(ByteBuffer xevent) { return xevent.get(xevent.position() + XERROR_ERROR_CODE); }
	public static int xerrorRequest_codeGet(ByteBuffer xevent) { return xevent.get(xevent.position() + XERROR_REQUEST_CODE); }
	public static int xerrorMinor_codeGet(ByteBuffer xevent) { return xevent.get(xevent.position() + XERROR_MINOR_CODE); }
	public static long xerrorResourceidGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XERROR_RESOURCEID); }
	public static void padGet(ByteBuffer xevent, long pad, int bytes) {
		memCopy(memAddress(xevent) + PAD, pad, bytes);
	}
	public static void padGetb(ByteBuffer xevent, ByteBuffer pad) {
		checkBufferGT(pad, 24 * 8);
		padGet(xevent, memAddress(pad), pad.remaining());
	}

}