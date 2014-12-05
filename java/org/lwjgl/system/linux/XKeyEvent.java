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
public final class XKeyEvent implements Pointer {

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

	private final ByteBuffer struct;

	public XKeyEvent() {
		this(malloc());
	}

	public XKeyEvent(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public void setType(int type) { type(struct, type); }
	public void setSerial(long serial) { serial(struct, serial); }
	public void setSendEvent(int send_event) { send_event(struct, send_event); }
	public void setDisplay(long display) { display(struct, display); }
	public void setWindow(long window) { window(struct, window); }
	public void setRoot(long root) { root(struct, root); }
	public void setSubwindow(long subwindow) { subwindow(struct, subwindow); }
	public void setTime(long time) { time(struct, time); }
	public void setX(int x) { x(struct, x); }
	public void setY(int y) { y(struct, y); }
	public void setXRoot(int x_root) { x_root(struct, x_root); }
	public void setYRoot(int y_root) { y_root(struct, y_root); }
	public void setState(int state) { state(struct, state); }
	public void setKeycode(int keycode) { keycode(struct, keycode); }
	public void setSameScreen(int same_screen) { same_screen(struct, same_screen); }

	public int getType() { return type(struct); }
	public long getSerial() { return serial(struct); }
	public int getSendEvent() { return send_event(struct); }
	public long getDisplay() { return display(struct); }
	public long getWindow() { return window(struct); }
	public long getRoot() { return root(struct); }
	public long getSubwindow() { return subwindow(struct); }
	public long getTime() { return time(struct); }
	public int getX() { return x(struct); }
	public int getY() { return y(struct); }
	public int getXRoot() { return x_root(struct); }
	public int getYRoot() { return y_root(struct); }
	public int getState() { return state(struct); }
	public int getKeycode() { return keycode(struct); }
	public int getSameScreen() { return same_screen(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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

		type(xkeyevent, type);
		serial(xkeyevent, serial);
		send_event(xkeyevent, send_event);
		display(xkeyevent, display);
		window(xkeyevent, window);
		root(xkeyevent, root);
		subwindow(xkeyevent, subwindow);
		time(xkeyevent, time);
		x(xkeyevent, x);
		y(xkeyevent, y);
		x_root(xkeyevent, x_root);
		y_root(xkeyevent, y_root);
		state(xkeyevent, state);
		keycode(xkeyevent, keycode);
		same_screen(xkeyevent, same_screen);

		return xkeyevent;
	}

	public static void type(ByteBuffer xkeyevent, int type) { xkeyevent.putInt(xkeyevent.position() + TYPE, type); }
	public static void serial(ByteBuffer xkeyevent, long serial) { PointerBuffer.put(xkeyevent, xkeyevent.position() + SERIAL, serial); }
	public static void send_event(ByteBuffer xkeyevent, int send_event) { xkeyevent.putInt(xkeyevent.position() + SEND_EVENT, send_event); }
	public static void display(ByteBuffer xkeyevent, long display) { PointerBuffer.put(xkeyevent, xkeyevent.position() + DISPLAY, display); }
	public static void window(ByteBuffer xkeyevent, long window) { PointerBuffer.put(xkeyevent, xkeyevent.position() + WINDOW, window); }
	public static void root(ByteBuffer xkeyevent, long root) { PointerBuffer.put(xkeyevent, xkeyevent.position() + ROOT, root); }
	public static void subwindow(ByteBuffer xkeyevent, long subwindow) { PointerBuffer.put(xkeyevent, xkeyevent.position() + SUBWINDOW, subwindow); }
	public static void time(ByteBuffer xkeyevent, long time) { PointerBuffer.put(xkeyevent, xkeyevent.position() + TIME, time); }
	public static void x(ByteBuffer xkeyevent, int x) { xkeyevent.putInt(xkeyevent.position() + X, x); }
	public static void y(ByteBuffer xkeyevent, int y) { xkeyevent.putInt(xkeyevent.position() + Y, y); }
	public static void x_root(ByteBuffer xkeyevent, int x_root) { xkeyevent.putInt(xkeyevent.position() + X_ROOT, x_root); }
	public static void y_root(ByteBuffer xkeyevent, int y_root) { xkeyevent.putInt(xkeyevent.position() + Y_ROOT, y_root); }
	public static void state(ByteBuffer xkeyevent, int state) { xkeyevent.putInt(xkeyevent.position() + STATE, state); }
	public static void keycode(ByteBuffer xkeyevent, int keycode) { xkeyevent.putInt(xkeyevent.position() + KEYCODE, keycode); }
	public static void same_screen(ByteBuffer xkeyevent, int same_screen) { xkeyevent.putInt(xkeyevent.position() + SAME_SCREEN, same_screen); }

	public static int type(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + TYPE); }
	public static long serial(ByteBuffer xkeyevent) { return PointerBuffer.get(xkeyevent, xkeyevent.position() + SERIAL); }
	public static int send_event(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + SEND_EVENT); }
	public static long display(ByteBuffer xkeyevent) { return PointerBuffer.get(xkeyevent, xkeyevent.position() + DISPLAY); }
	public static long window(ByteBuffer xkeyevent) { return PointerBuffer.get(xkeyevent, xkeyevent.position() + WINDOW); }
	public static long root(ByteBuffer xkeyevent) { return PointerBuffer.get(xkeyevent, xkeyevent.position() + ROOT); }
	public static long subwindow(ByteBuffer xkeyevent) { return PointerBuffer.get(xkeyevent, xkeyevent.position() + SUBWINDOW); }
	public static long time(ByteBuffer xkeyevent) { return PointerBuffer.get(xkeyevent, xkeyevent.position() + TIME); }
	public static int x(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + X); }
	public static int y(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + Y); }
	public static int x_root(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + X_ROOT); }
	public static int y_root(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + Y_ROOT); }
	public static int state(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + STATE); }
	public static int keycode(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + KEYCODE); }
	public static int same_screen(ByteBuffer xkeyevent) { return xkeyevent.getInt(xkeyevent.position() + SAME_SCREEN); }

}