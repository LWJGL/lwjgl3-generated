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

/** Key event. */
public final class XKeyEvent {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		SERIAL,
		SEND_EVENT,
		DISPLAY,
		WINDOW,
		ROOT,
		SUBWINDOW,
		TIME,
		X,
		Y,
		X_ROOT,
		Y_ROOT,
		STATE,
		KEYCODE,
		SAME_SCREEN;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(15);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		SERIAL = offsets.get(1);
		SEND_EVENT = offsets.get(2);
		DISPLAY = offsets.get(3);
		WINDOW = offsets.get(4);
		ROOT = offsets.get(5);
		SUBWINDOW = offsets.get(6);
		TIME = offsets.get(7);
		X = offsets.get(8);
		Y = offsets.get(9);
		X_ROOT = offsets.get(10);
		Y_ROOT = offsets.get(11);
		STATE = offsets.get(12);
		KEYCODE = offsets.get(13);
		SAME_SCREEN = offsets.get(14);
	}

	private XKeyEvent() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int type,
		long serial,
		int send_event,
		long display,
		long window,
		long root,
		long subwindow,
		long time,
		int x,
		int y,
		int x_root,
		int y_root,
		int state,
		int keycode,
		int same_screen
	) {
		ByteBuffer xkeyevent = malloc();

		typeSet(xkeyevent, type);
		serialSet(xkeyevent, serial);
		send_eventSet(xkeyevent, send_event);
		displaySet(xkeyevent, display);
		windowSet(xkeyevent, window);
		rootSet(xkeyevent, root);
		subwindowSet(xkeyevent, subwindow);
		timeSet(xkeyevent, time);
		xSet(xkeyevent, x);
		ySet(xkeyevent, y);
		x_rootSet(xkeyevent, x_root);
		y_rootSet(xkeyevent, y_root);
		stateSet(xkeyevent, state);
		keycodeSet(xkeyevent, keycode);
		same_screenSet(xkeyevent, same_screen);

		return xkeyevent;
	}

	public static void typeSet(ByteBuffer xkeyevent, int type) { xkeyevent.putInt(xkeyevent.position() + TYPE, type); }
	public static void serialSet(ByteBuffer xkeyevent, long serial) { PointerBuffer.put(xkeyevent, xkeyevent.position() + SERIAL, serial); }
	public static void send_eventSet(ByteBuffer xkeyevent, int send_event) { xkeyevent.putInt(xkeyevent.position() + SEND_EVENT, send_event); }
	public static void displaySet(ByteBuffer xkeyevent, long display) { PointerBuffer.put(xkeyevent, xkeyevent.position() + DISPLAY, display); }
	public static void windowSet(ByteBuffer xkeyevent, long window) { PointerBuffer.put(xkeyevent, xkeyevent.position() + WINDOW, window); }
	public static void rootSet(ByteBuffer xkeyevent, long root) { PointerBuffer.put(xkeyevent, xkeyevent.position() + ROOT, root); }
	public static void subwindowSet(ByteBuffer xkeyevent, long subwindow) { PointerBuffer.put(xkeyevent, xkeyevent.position() + SUBWINDOW, subwindow); }
	public static void timeSet(ByteBuffer xkeyevent, long time) { PointerBuffer.put(xkeyevent, xkeyevent.position() + TIME, time); }
	public static void xSet(ByteBuffer xkeyevent, int x) { xkeyevent.putInt(xkeyevent.position() + X, x); }
	public static void ySet(ByteBuffer xkeyevent, int y) { xkeyevent.putInt(xkeyevent.position() + Y, y); }
	public static void x_rootSet(ByteBuffer xkeyevent, int x_root) { xkeyevent.putInt(xkeyevent.position() + X_ROOT, x_root); }
	public static void y_rootSet(ByteBuffer xkeyevent, int y_root) { xkeyevent.putInt(xkeyevent.position() + Y_ROOT, y_root); }
	public static void stateSet(ByteBuffer xkeyevent, int state) { xkeyevent.putInt(xkeyevent.position() + STATE, state); }
	public static void keycodeSet(ByteBuffer xkeyevent, int keycode) { xkeyevent.putInt(xkeyevent.position() + KEYCODE, keycode); }
	public static void same_screenSet(ByteBuffer xkeyevent, int same_screen) { xkeyevent.putInt(xkeyevent.position() + SAME_SCREEN, same_screen); }

	public static int typeGet(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + TYPE); }
	public static long serialGet(ByteBuffer xkeyevent) { return PointerBuffer.get(xkeyevent, xkeyevent.position() + SERIAL); }
	public static int send_eventGet(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + SEND_EVENT); }
	public static long displayGet(ByteBuffer xkeyevent) { return PointerBuffer.get(xkeyevent, xkeyevent.position() + DISPLAY); }
	public static long windowGet(ByteBuffer xkeyevent) { return PointerBuffer.get(xkeyevent, xkeyevent.position() + WINDOW); }
	public static long rootGet(ByteBuffer xkeyevent) { return PointerBuffer.get(xkeyevent, xkeyevent.position() + ROOT); }
	public static long subwindowGet(ByteBuffer xkeyevent) { return PointerBuffer.get(xkeyevent, xkeyevent.position() + SUBWINDOW); }
	public static long timeGet(ByteBuffer xkeyevent) { return PointerBuffer.get(xkeyevent, xkeyevent.position() + TIME); }
	public static int xGet(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + X); }
	public static int yGet(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + Y); }
	public static int x_rootGet(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + X_ROOT); }
	public static int y_rootGet(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + Y_ROOT); }
	public static int stateGet(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + STATE); }
	public static int keycodeGet(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + KEYCODE); }
	public static int same_screenGet(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + SAME_SCREEN); }

}