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
public final class XConfigureEvent {

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

	private XConfigureEvent() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
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

		typeSet(xconfigureevent, type);
		serialSet(xconfigureevent, serial);
		send_eventSet(xconfigureevent, send_event);
		displaySet(xconfigureevent, display);
		eventSet(xconfigureevent, event);
		windowSet(xconfigureevent, window);
		xSet(xconfigureevent, x);
		ySet(xconfigureevent, y);
		widthSet(xconfigureevent, width);
		heightSet(xconfigureevent, height);
		border_widthSet(xconfigureevent, border_width);
		aboveSet(xconfigureevent, above);
		override_redirectSet(xconfigureevent, override_redirect);

		return xconfigureevent;
	}

	public static void typeSet(ByteBuffer xconfigureevent, int type) { xconfigureevent.putInt(xconfigureevent.position() + TYPE, type); }
	public static void serialSet(ByteBuffer xconfigureevent, long serial) { PointerBuffer.put(xconfigureevent, xconfigureevent.position() + SERIAL, serial); }
	public static void send_eventSet(ByteBuffer xconfigureevent, int send_event) { xconfigureevent.putInt(xconfigureevent.position() + SEND_EVENT, send_event); }
	public static void displaySet(ByteBuffer xconfigureevent, long display) { PointerBuffer.put(xconfigureevent, xconfigureevent.position() + DISPLAY, display); }
	public static void eventSet(ByteBuffer xconfigureevent, long event) { PointerBuffer.put(xconfigureevent, xconfigureevent.position() + EVENT, event); }
	public static void windowSet(ByteBuffer xconfigureevent, long window) { PointerBuffer.put(xconfigureevent, xconfigureevent.position() + WINDOW, window); }
	public static void xSet(ByteBuffer xconfigureevent, int x) { xconfigureevent.putInt(xconfigureevent.position() + X, x); }
	public static void ySet(ByteBuffer xconfigureevent, int y) { xconfigureevent.putInt(xconfigureevent.position() + Y, y); }
	public static void widthSet(ByteBuffer xconfigureevent, int width) { xconfigureevent.putInt(xconfigureevent.position() + WIDTH, width); }
	public static void heightSet(ByteBuffer xconfigureevent, int height) { xconfigureevent.putInt(xconfigureevent.position() + HEIGHT, height); }
	public static void border_widthSet(ByteBuffer xconfigureevent, int border_width) { xconfigureevent.putInt(xconfigureevent.position() + BORDER_WIDTH, border_width); }
	public static void aboveSet(ByteBuffer xconfigureevent, long above) { PointerBuffer.put(xconfigureevent, xconfigureevent.position() + ABOVE, above); }
	public static void override_redirectSet(ByteBuffer xconfigureevent, int override_redirect) { xconfigureevent.putInt(xconfigureevent.position() + OVERRIDE_REDIRECT, override_redirect); }

	public static int typeGet(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + TYPE); }
	public static long serialGet(ByteBuffer xconfigureevent) { return PointerBuffer.get(xconfigureevent, xconfigureevent.position() + SERIAL); }
	public static int send_eventGet(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + SEND_EVENT); }
	public static long displayGet(ByteBuffer xconfigureevent) { return PointerBuffer.get(xconfigureevent, xconfigureevent.position() + DISPLAY); }
	public static long eventGet(ByteBuffer xconfigureevent) { return PointerBuffer.get(xconfigureevent, xconfigureevent.position() + EVENT); }
	public static long windowGet(ByteBuffer xconfigureevent) { return PointerBuffer.get(xconfigureevent, xconfigureevent.position() + WINDOW); }
	public static int xGet(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + X); }
	public static int yGet(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + Y); }
	public static int widthGet(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + WIDTH); }
	public static int heightGet(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + HEIGHT); }
	public static int border_widthGet(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + BORDER_WIDTH); }
	public static long aboveGet(ByteBuffer xconfigureevent) { return PointerBuffer.get(xconfigureevent, xconfigureevent.position() + ABOVE); }
	public static int override_redirectGet(ByteBuffer xconfigureevent) { return xconfigureevent.getInt(xconfigureevent.position() + OVERRIDE_REDIRECT); }

}