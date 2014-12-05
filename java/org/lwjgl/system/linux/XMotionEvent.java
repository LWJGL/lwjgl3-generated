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
public final class XMotionEvent implements Pointer {

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

	private final ByteBuffer struct;

	public XMotionEvent() {
		this(malloc());
	}

	public XMotionEvent(ByteBuffer struct) {
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
	public void setIsHint(int is_hint) { is_hint(struct, is_hint); }
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
	public int getIsHint() { return is_hint(struct); }
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
		int is_hint,
		int same_screen
	) {
		ByteBuffer xmotionevent = malloc();

		type(xmotionevent, type);
		serial(xmotionevent, serial);
		send_event(xmotionevent, send_event);
		display(xmotionevent, display);
		window(xmotionevent, window);
		root(xmotionevent, root);
		subwindow(xmotionevent, subwindow);
		time(xmotionevent, time);
		x(xmotionevent, x);
		y(xmotionevent, y);
		x_root(xmotionevent, x_root);
		y_root(xmotionevent, y_root);
		state(xmotionevent, state);
		is_hint(xmotionevent, is_hint);
		same_screen(xmotionevent, same_screen);

		return xmotionevent;
	}

	public static void type(ByteBuffer xmotionevent, int type) { xmotionevent.putInt(xmotionevent.position() + TYPE, type); }
	public static void serial(ByteBuffer xmotionevent, long serial) { PointerBuffer.put(xmotionevent, xmotionevent.position() + SERIAL, serial); }
	public static void send_event(ByteBuffer xmotionevent, int send_event) { xmotionevent.putInt(xmotionevent.position() + SEND_EVENT, send_event); }
	public static void display(ByteBuffer xmotionevent, long display) { PointerBuffer.put(xmotionevent, xmotionevent.position() + DISPLAY, display); }
	public static void window(ByteBuffer xmotionevent, long window) { PointerBuffer.put(xmotionevent, xmotionevent.position() + WINDOW, window); }
	public static void root(ByteBuffer xmotionevent, long root) { PointerBuffer.put(xmotionevent, xmotionevent.position() + ROOT, root); }
	public static void subwindow(ByteBuffer xmotionevent, long subwindow) { PointerBuffer.put(xmotionevent, xmotionevent.position() + SUBWINDOW, subwindow); }
	public static void time(ByteBuffer xmotionevent, long time) { PointerBuffer.put(xmotionevent, xmotionevent.position() + TIME, time); }
	public static void x(ByteBuffer xmotionevent, int x) { xmotionevent.putInt(xmotionevent.position() + X, x); }
	public static void y(ByteBuffer xmotionevent, int y) { xmotionevent.putInt(xmotionevent.position() + Y, y); }
	public static void x_root(ByteBuffer xmotionevent, int x_root) { xmotionevent.putInt(xmotionevent.position() + X_ROOT, x_root); }
	public static void y_root(ByteBuffer xmotionevent, int y_root) { xmotionevent.putInt(xmotionevent.position() + Y_ROOT, y_root); }
	public static void state(ByteBuffer xmotionevent, int state) { xmotionevent.putInt(xmotionevent.position() + STATE, state); }
	public static void is_hint(ByteBuffer xmotionevent, int is_hint) { xmotionevent.put(xmotionevent.position() + IS_HINT, (byte)is_hint); }
	public static void same_screen(ByteBuffer xmotionevent, int same_screen) { xmotionevent.putInt(xmotionevent.position() + SAME_SCREEN, same_screen); }

	public static int type(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + TYPE); }
	public static long serial(ByteBuffer xmotionevent) { return PointerBuffer.get(xmotionevent, xmotionevent.position() + SERIAL); }
	public static int send_event(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + SEND_EVENT); }
	public static long display(ByteBuffer xmotionevent) { return PointerBuffer.get(xmotionevent, xmotionevent.position() + DISPLAY); }
	public static long window(ByteBuffer xmotionevent) { return PointerBuffer.get(xmotionevent, xmotionevent.position() + WINDOW); }
	public static long root(ByteBuffer xmotionevent) { return PointerBuffer.get(xmotionevent, xmotionevent.position() + ROOT); }
	public static long subwindow(ByteBuffer xmotionevent) { return PointerBuffer.get(xmotionevent, xmotionevent.position() + SUBWINDOW); }
	public static long time(ByteBuffer xmotionevent) { return PointerBuffer.get(xmotionevent, xmotionevent.position() + TIME); }
	public static int x(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + X); }
	public static int y(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + Y); }
	public static int x_root(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + X_ROOT); }
	public static int y_root(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + Y_ROOT); }
	public static int state(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + STATE); }
	public static int is_hint(ByteBuffer xmotionevent) { return xmotionevent.get(xmotionevent.position() + IS_HINT); }
	public static int same_screen(ByteBuffer xmotionevent) { return xmotionevent.getInt(xmotionevent.position() + SAME_SCREEN); }

}