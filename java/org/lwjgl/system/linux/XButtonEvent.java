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

/** Button event. */
public final class XButtonEvent {

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
		BUTTON,
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
		BUTTON = offsets.get(13);
		SAME_SCREEN = offsets.get(14);
	}

	private XButtonEvent() {}

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
		int button,
		int same_screen
	) {
		ByteBuffer xbuttonevent = malloc();

		typeSet(xbuttonevent, type);
		serialSet(xbuttonevent, serial);
		send_eventSet(xbuttonevent, send_event);
		displaySet(xbuttonevent, display);
		windowSet(xbuttonevent, window);
		rootSet(xbuttonevent, root);
		subwindowSet(xbuttonevent, subwindow);
		timeSet(xbuttonevent, time);
		xSet(xbuttonevent, x);
		ySet(xbuttonevent, y);
		x_rootSet(xbuttonevent, x_root);
		y_rootSet(xbuttonevent, y_root);
		stateSet(xbuttonevent, state);
		buttonSet(xbuttonevent, button);
		same_screenSet(xbuttonevent, same_screen);

		return xbuttonevent;
	}

	public static void typeSet(ByteBuffer xbuttonevent, int type) { xbuttonevent.putInt(xbuttonevent.position() + TYPE, type); }
	public static void serialSet(ByteBuffer xbuttonevent, long serial) { PointerBuffer.put(xbuttonevent, xbuttonevent.position() + SERIAL, serial); }
	public static void send_eventSet(ByteBuffer xbuttonevent, int send_event) { xbuttonevent.putInt(xbuttonevent.position() + SEND_EVENT, send_event); }
	public static void displaySet(ByteBuffer xbuttonevent, long display) { PointerBuffer.put(xbuttonevent, xbuttonevent.position() + DISPLAY, display); }
	public static void windowSet(ByteBuffer xbuttonevent, long window) { PointerBuffer.put(xbuttonevent, xbuttonevent.position() + WINDOW, window); }
	public static void rootSet(ByteBuffer xbuttonevent, long root) { PointerBuffer.put(xbuttonevent, xbuttonevent.position() + ROOT, root); }
	public static void subwindowSet(ByteBuffer xbuttonevent, long subwindow) { PointerBuffer.put(xbuttonevent, xbuttonevent.position() + SUBWINDOW, subwindow); }
	public static void timeSet(ByteBuffer xbuttonevent, long time) { PointerBuffer.put(xbuttonevent, xbuttonevent.position() + TIME, time); }
	public static void xSet(ByteBuffer xbuttonevent, int x) { xbuttonevent.putInt(xbuttonevent.position() + X, x); }
	public static void ySet(ByteBuffer xbuttonevent, int y) { xbuttonevent.putInt(xbuttonevent.position() + Y, y); }
	public static void x_rootSet(ByteBuffer xbuttonevent, int x_root) { xbuttonevent.putInt(xbuttonevent.position() + X_ROOT, x_root); }
	public static void y_rootSet(ByteBuffer xbuttonevent, int y_root) { xbuttonevent.putInt(xbuttonevent.position() + Y_ROOT, y_root); }
	public static void stateSet(ByteBuffer xbuttonevent, int state) { xbuttonevent.putInt(xbuttonevent.position() + STATE, state); }
	public static void buttonSet(ByteBuffer xbuttonevent, int button) { xbuttonevent.putInt(xbuttonevent.position() + BUTTON, button); }
	public static void same_screenSet(ByteBuffer xbuttonevent, int same_screen) { xbuttonevent.putInt(xbuttonevent.position() + SAME_SCREEN, same_screen); }

	public static int typeGet(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + TYPE); }
	public static long serialGet(ByteBuffer xbuttonevent) { return PointerBuffer.get(xbuttonevent, xbuttonevent.position() + SERIAL); }
	public static int send_eventGet(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + SEND_EVENT); }
	public static long displayGet(ByteBuffer xbuttonevent) { return PointerBuffer.get(xbuttonevent, xbuttonevent.position() + DISPLAY); }
	public static long windowGet(ByteBuffer xbuttonevent) { return PointerBuffer.get(xbuttonevent, xbuttonevent.position() + WINDOW); }
	public static long rootGet(ByteBuffer xbuttonevent) { return PointerBuffer.get(xbuttonevent, xbuttonevent.position() + ROOT); }
	public static long subwindowGet(ByteBuffer xbuttonevent) { return PointerBuffer.get(xbuttonevent, xbuttonevent.position() + SUBWINDOW); }
	public static long timeGet(ByteBuffer xbuttonevent) { return PointerBuffer.get(xbuttonevent, xbuttonevent.position() + TIME); }
	public static int xGet(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + X); }
	public static int yGet(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + Y); }
	public static int x_rootGet(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + X_ROOT); }
	public static int y_rootGet(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + Y_ROOT); }
	public static int stateGet(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + STATE); }
	public static int buttonGet(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + BUTTON); }
	public static int same_screenGet(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + SAME_SCREEN); }

}