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
public final class XButtonEvent implements Pointer {

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

	private final ByteBuffer struct;

	public XButtonEvent() {
		this(malloc());
	}

	public XButtonEvent(ByteBuffer struct) {
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
	public void setButton(int button) { button(struct, button); }
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
	public int getButton() { return button(struct); }
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
		int button,
		int same_screen
	) {
		ByteBuffer xbuttonevent = malloc();

		type(xbuttonevent, type);
		serial(xbuttonevent, serial);
		send_event(xbuttonevent, send_event);
		display(xbuttonevent, display);
		window(xbuttonevent, window);
		root(xbuttonevent, root);
		subwindow(xbuttonevent, subwindow);
		time(xbuttonevent, time);
		x(xbuttonevent, x);
		y(xbuttonevent, y);
		x_root(xbuttonevent, x_root);
		y_root(xbuttonevent, y_root);
		state(xbuttonevent, state);
		button(xbuttonevent, button);
		same_screen(xbuttonevent, same_screen);

		return xbuttonevent;
	}

	public static void type(ByteBuffer xbuttonevent, int type) { xbuttonevent.putInt(xbuttonevent.position() + TYPE, type); }
	public static void serial(ByteBuffer xbuttonevent, long serial) { PointerBuffer.put(xbuttonevent, xbuttonevent.position() + SERIAL, serial); }
	public static void send_event(ByteBuffer xbuttonevent, int send_event) { xbuttonevent.putInt(xbuttonevent.position() + SEND_EVENT, send_event); }
	public static void display(ByteBuffer xbuttonevent, long display) { PointerBuffer.put(xbuttonevent, xbuttonevent.position() + DISPLAY, display); }
	public static void window(ByteBuffer xbuttonevent, long window) { PointerBuffer.put(xbuttonevent, xbuttonevent.position() + WINDOW, window); }
	public static void root(ByteBuffer xbuttonevent, long root) { PointerBuffer.put(xbuttonevent, xbuttonevent.position() + ROOT, root); }
	public static void subwindow(ByteBuffer xbuttonevent, long subwindow) { PointerBuffer.put(xbuttonevent, xbuttonevent.position() + SUBWINDOW, subwindow); }
	public static void time(ByteBuffer xbuttonevent, long time) { PointerBuffer.put(xbuttonevent, xbuttonevent.position() + TIME, time); }
	public static void x(ByteBuffer xbuttonevent, int x) { xbuttonevent.putInt(xbuttonevent.position() + X, x); }
	public static void y(ByteBuffer xbuttonevent, int y) { xbuttonevent.putInt(xbuttonevent.position() + Y, y); }
	public static void x_root(ByteBuffer xbuttonevent, int x_root) { xbuttonevent.putInt(xbuttonevent.position() + X_ROOT, x_root); }
	public static void y_root(ByteBuffer xbuttonevent, int y_root) { xbuttonevent.putInt(xbuttonevent.position() + Y_ROOT, y_root); }
	public static void state(ByteBuffer xbuttonevent, int state) { xbuttonevent.putInt(xbuttonevent.position() + STATE, state); }
	public static void button(ByteBuffer xbuttonevent, int button) { xbuttonevent.putInt(xbuttonevent.position() + BUTTON, button); }
	public static void same_screen(ByteBuffer xbuttonevent, int same_screen) { xbuttonevent.putInt(xbuttonevent.position() + SAME_SCREEN, same_screen); }

	public static int type(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + TYPE); }
	public static long serial(ByteBuffer xbuttonevent) { return PointerBuffer.get(xbuttonevent, xbuttonevent.position() + SERIAL); }
	public static int send_event(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + SEND_EVENT); }
	public static long display(ByteBuffer xbuttonevent) { return PointerBuffer.get(xbuttonevent, xbuttonevent.position() + DISPLAY); }
	public static long window(ByteBuffer xbuttonevent) { return PointerBuffer.get(xbuttonevent, xbuttonevent.position() + WINDOW); }
	public static long root(ByteBuffer xbuttonevent) { return PointerBuffer.get(xbuttonevent, xbuttonevent.position() + ROOT); }
	public static long subwindow(ByteBuffer xbuttonevent) { return PointerBuffer.get(xbuttonevent, xbuttonevent.position() + SUBWINDOW); }
	public static long time(ByteBuffer xbuttonevent) { return PointerBuffer.get(xbuttonevent, xbuttonevent.position() + TIME); }
	public static int x(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + X); }
	public static int y(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + Y); }
	public static int x_root(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + X_ROOT); }
	public static int y_root(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + Y_ROOT); }
	public static int state(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + STATE); }
	public static int button(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + BUTTON); }
	public static int same_screen(ByteBuffer xbuttonevent) { return xbuttonevent.getInt(xbuttonevent.position() + SAME_SCREEN); }

}