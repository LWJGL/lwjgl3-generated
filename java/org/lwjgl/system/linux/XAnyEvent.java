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

/** Any event. */
public final class XAnyEvent {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		SERIAL,
		SEND_EVENT,
		DISPLAY,
		WINDOW;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(5);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		SERIAL = offsets.get(1);
		SEND_EVENT = offsets.get(2);
		DISPLAY = offsets.get(3);
		WINDOW = offsets.get(4);
	}

	private XAnyEvent() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int type,
		long serial,
		int send_event,
		long display,
		long window
	) {
		ByteBuffer xanyevent = malloc();

		typeSet(xanyevent, type);
		serialSet(xanyevent, serial);
		send_eventSet(xanyevent, send_event);
		displaySet(xanyevent, display);
		windowSet(xanyevent, window);

		return xanyevent;
	}

	public static void typeSet(ByteBuffer xanyevent, int type) { xanyevent.putInt(xanyevent.position() + TYPE, type); }
	public static void serialSet(ByteBuffer xanyevent, long serial) { PointerBuffer.put(xanyevent, xanyevent.position() + SERIAL, serial); }
	public static void send_eventSet(ByteBuffer xanyevent, int send_event) { xanyevent.putInt(xanyevent.position() + SEND_EVENT, send_event); }
	public static void displaySet(ByteBuffer xanyevent, long display) { PointerBuffer.put(xanyevent, xanyevent.position() + DISPLAY, display); }
	public static void windowSet(ByteBuffer xanyevent, long window) { PointerBuffer.put(xanyevent, xanyevent.position() + WINDOW, window); }

	public static int typeGet(ByteBuffer xanyevent) { return xanyevent.getInt(xanyevent.position() + TYPE); }
	public static long serialGet(ByteBuffer xanyevent) { return PointerBuffer.get(xanyevent, xanyevent.position() + SERIAL); }
	public static int send_eventGet(ByteBuffer xanyevent) { return xanyevent.getInt(xanyevent.position() + SEND_EVENT); }
	public static long displayGet(ByteBuffer xanyevent) { return PointerBuffer.get(xanyevent, xanyevent.position() + DISPLAY); }
	public static long windowGet(ByteBuffer xanyevent) { return PointerBuffer.get(xanyevent, xanyevent.position() + WINDOW); }

}