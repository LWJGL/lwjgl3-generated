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

/** Motion event. */
public final class XMotionEvent {

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
		IS_HINT,
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
		IS_HINT = offsets.get(13);
		SAME_SCREEN = offsets.get(14);
	}

	private XMotionEvent() {}

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
		int is_hint,
		int same_screen
	) {
		ByteBuffer xmotionevent = malloc();

		typeSet(xmotionevent, type);
		serialSet(xmotionevent, serial);
		send_eventSet(xmotionevent, send_event);
		displaySet(xmotionevent, display);
		windowSet(xmotionevent, window);
		rootSet(xmotionevent, root);
		subwindowSet(xmotionevent, subwindow);
		timeSet(xmotionevent, time);
		xSet(xmotionevent, x);
		ySet(xmotionevent, y);
		x_rootSet(xmotionevent, x_root);
		y_rootSet(xmotionevent, y_root);
		stateSet(xmotionevent, state);
		is_hintSet(xmotionevent, is_hint);
		same_screenSet(xmotionevent, same_screen);

		return xmotionevent;
	}

	public static void typeSet(ByteBuffer xmotionevent, int type) { xmotionevent.putInt(xmotionevent.position() + TYPE, type); }
	public static void serialSet(ByteBuffer xmotionevent, long serial) { PointerBuffer.put(xmotionevent, xmotionevent.position() + SERIAL, serial); }
	public static void send_eventSet(ByteBuffer xmotionevent, int send_event) { xmotionevent.putInt(xmotionevent.position() + SEND_EVENT, send_event); }
	public static void displaySet(ByteBuffer xmotionevent, long display) { PointerBuffer.put(xmotionevent, xmotionevent.position() + DISPLAY, display); }
	public static void windowSet(ByteBuffer xmotionevent, long window) { PointerBuffer.put(xmotionevent, xmotionevent.position() + WINDOW, window); }
	public static void rootSet(ByteBuffer xmotionevent, long root) { PointerBuffer.put(xmotionevent, xmotionevent.position() + ROOT, root); }
	public static void subwindowSet(ByteBuffer xmotionevent, long subwindow) { PointerBuffer.put(xmotionevent, xmotionevent.position() + SUBWINDOW, subwindow); }
	public static void timeSet(ByteBuffer xmotionevent, long time) { PointerBuffer.put(xmotionevent, xmotionevent.position() + TIME, time); }
	public static void xSet(ByteBuffer xmotionevent, int x) { xmotionevent.putInt(xmotionevent.position() + X, x); }
	public static void ySet(ByteBuffer xmotionevent, int y) { xmotionevent.putInt(xmotionevent.position() + Y, y); }
	public static void x_rootSet(ByteBuffer xmotionevent, int x_root) { xmotionevent.putInt(xmotionevent.position() + X_ROOT, x_root); }
	public static void y_rootSet(ByteBuffer xmotionevent, int y_root) { xmotionevent.putInt(xmotionevent.position() + Y_ROOT, y_root); }
	public static void stateSet(ByteBuffer xmotionevent, int state) { xmotionevent.putInt(xmotionevent.position() + STATE, state); }
	public static void is_hintSet(ByteBuffer xmotionevent, int is_hint) { xmotionevent.put(xmotionevent.position() + IS_HINT, (byte)is_hint); }
	public static void same_screenSet(ByteBuffer xmotionevent, int same_screen) { xmotionevent.putInt(xmotionevent.position() + SAME_SCREEN, same_screen); }

	public static int typeGet(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + TYPE); }
	public static long serialGet(ByteBuffer xmotionevent) { return PointerBuffer.get(xmotionevent, xmotionevent.position() + SERIAL); }
	public static int send_eventGet(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + SEND_EVENT); }
	public static long displayGet(ByteBuffer xmotionevent) { return PointerBuffer.get(xmotionevent, xmotionevent.position() + DISPLAY); }
	public static long windowGet(ByteBuffer xmotionevent) { return PointerBuffer.get(xmotionevent, xmotionevent.position() + WINDOW); }
	public static long rootGet(ByteBuffer xmotionevent) { return PointerBuffer.get(xmotionevent, xmotionevent.position() + ROOT); }
	public static long subwindowGet(ByteBuffer xmotionevent) { return PointerBuffer.get(xmotionevent, xmotionevent.position() + SUBWINDOW); }
	public static long timeGet(ByteBuffer xmotionevent) { return PointerBuffer.get(xmotionevent, xmotionevent.position() + TIME); }
	public static int xGet(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + X); }
	public static int yGet(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + Y); }
	public static int x_rootGet(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + X_ROOT); }
	public static int y_rootGet(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + Y_ROOT); }
	public static int stateGet(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + STATE); }
	public static int is_hintGet(ByteBuffer xmotionevent) { return xmotionevent.get(xmotionevent.position() + IS_HINT); }
	public static int same_screenGet(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + SAME_SCREEN); }

}