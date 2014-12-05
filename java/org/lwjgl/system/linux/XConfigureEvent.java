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
public final class XConfigureEvent implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		SERIAL,
		SEND_EVENT,
		DISPLAY,
		EVENT,
		WINDOW,
		X,
		Y,
		WIDTH,
		HEIGHT,
		BORDER_WIDTH,
		ABOVE,
		OVERRIDE_REDIRECT;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(13);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		SERIAL = offsets.get(1);
		SEND_EVENT = offsets.get(2);
		DISPLAY = offsets.get(3);
		EVENT = offsets.get(4);
		WINDOW = offsets.get(5);
		X = offsets.get(6);
		Y = offsets.get(7);
		WIDTH = offsets.get(8);
		HEIGHT = offsets.get(9);
		BORDER_WIDTH = offsets.get(10);
		ABOVE = offsets.get(11);
		OVERRIDE_REDIRECT = offsets.get(12);
	}

	private final ByteBuffer struct;

	public XConfigureEvent() {
		this(malloc());
	}

	public XConfigureEvent(ByteBuffer struct) {
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
	public void setEvent(long event) { event(struct, event); }
	public void setWindow(long window) { window(struct, window); }
	public void setX(int x) { x(struct, x); }
	public void setY(int y) { y(struct, y); }
	public void setWidth(int width) { width(struct, width); }
	public void setHeight(int height) { height(struct, height); }
	public void setBorderWidth(int border_width) { border_width(struct, border_width); }
	public void setAbove(long above) { above(struct, above); }
	public void setOverrideRedirect(int override_redirect) { override_redirect(struct, override_redirect); }

	public int getType() { return type(struct); }
	public long getSerial() { return serial(struct); }
	public int getSendEvent() { return send_event(struct); }
	public long getDisplay() { return display(struct); }
	public long getEvent() { return event(struct); }
	public long getWindow() { return window(struct); }
	public int getX() { return x(struct); }
	public int getY() { return y(struct); }
	public int getWidth() { return width(struct); }
	public int getHeight() { return height(struct); }
	public int getBorderWidth() { return border_width(struct); }
	public long getAbove() { return above(struct); }
	public int getOverrideRedirect() { return override_redirect(struct); }

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
		long event,
		long window,
		int x,
		int y,
		int width,
		int height,
		int border_width,
		long above,
		int override_redirect
	) {
		ByteBuffer xconfigureevent = malloc();

		type(xconfigureevent, type);
		serial(xconfigureevent, serial);
		send_event(xconfigureevent, send_event);
		display(xconfigureevent, display);
		event(xconfigureevent, event);
		window(xconfigureevent, window);
		x(xconfigureevent, x);
		y(xconfigureevent, y);
		width(xconfigureevent, width);
		height(xconfigureevent, height);
		border_width(xconfigureevent, border_width);
		above(xconfigureevent, above);
		override_redirect(xconfigureevent, override_redirect);

		return xconfigureevent;
	}

	public static void type(ByteBuffer xconfigureevent, int type) { xconfigureevent.putInt(xconfigureevent.position() + TYPE, type); }
	public static void serial(ByteBuffer xconfigureevent, long serial) { PointerBuffer.put(xconfigureevent, xconfigureevent.position() + SERIAL, serial); }
	public static void send_event(ByteBuffer xconfigureevent, int send_event) { xconfigureevent.putInt(xconfigureevent.position() + SEND_EVENT, send_event); }
	public static void display(ByteBuffer xconfigureevent, long display) { PointerBuffer.put(xconfigureevent, xconfigureevent.position() + DISPLAY, display); }
	public static void event(ByteBuffer xconfigureevent, long event) { PointerBuffer.put(xconfigureevent, xconfigureevent.position() + EVENT, event); }
	public static void window(ByteBuffer xconfigureevent, long window) { PointerBuffer.put(xconfigureevent, xconfigureevent.position() + WINDOW, window); }
	public static void x(ByteBuffer xconfigureevent, int x) { xconfigureevent.putInt(xconfigureevent.position() + X, x); }
	public static void y(ByteBuffer xconfigureevent, int y) { xconfigureevent.putInt(xconfigureevent.position() + Y, y); }
	public static void width(ByteBuffer xconfigureevent, int width) { xconfigureevent.putInt(xconfigureevent.position() + WIDTH, width); }
	public static void height(ByteBuffer xconfigureevent, int height) { xconfigureevent.putInt(xconfigureevent.position() + HEIGHT, height); }
	public static void border_width(ByteBuffer xconfigureevent, int border_width) { xconfigureevent.putInt(xconfigureevent.position() + BORDER_WIDTH, border_width); }
	public static void above(ByteBuffer xconfigureevent, long above) { PointerBuffer.put(xconfigureevent, xconfigureevent.position() + ABOVE, above); }
	public static void override_redirect(ByteBuffer xconfigureevent, int override_redirect) { xconfigureevent.putInt(xconfigureevent.position() + OVERRIDE_REDIRECT, override_redirect); }

	public static int type(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + TYPE); }
	public static long serial(ByteBuffer xconfigureevent) { return PointerBuffer.get(xconfigureevent, xconfigureevent.position() + SERIAL); }
	public static int send_event(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + SEND_EVENT); }
	public static long display(ByteBuffer xconfigureevent) { return PointerBuffer.get(xconfigureevent, xconfigureevent.position() + DISPLAY); }
	public static long event(ByteBuffer xconfigureevent) { return PointerBuffer.get(xconfigureevent, xconfigureevent.position() + EVENT); }
	public static long window(ByteBuffer xconfigureevent) { return PointerBuffer.get(xconfigureevent, xconfigureevent.position() + WINDOW); }
	public static int x(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + X); }
	public static int y(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + Y); }
	public static int width(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + WIDTH); }
	public static int height(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + HEIGHT); }
	public static int border_width(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + BORDER_WIDTH); }
	public static long above(ByteBuffer xconfigureevent) { return PointerBuffer.get(xconfigureevent, xconfigureevent.position() + ABOVE); }
	public static int override_redirect(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + OVERRIDE_REDIRECT); }

}