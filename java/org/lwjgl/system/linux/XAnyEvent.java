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
public final class XAnyEvent implements Pointer {

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

	private final ByteBuffer struct;

	public XAnyEvent() {
		this(malloc());
	}

	public XAnyEvent(ByteBuffer struct) {
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

	public int getType() { return type(struct); }
	public long getSerial() { return serial(struct); }
	public int getSendEvent() { return send_event(struct); }
	public long getDisplay() { return display(struct); }
	public long getWindow() { return window(struct); }

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
		long window
	) {
		ByteBuffer xanyevent = malloc();

		type(xanyevent, type);
		serial(xanyevent, serial);
		send_event(xanyevent, send_event);
		display(xanyevent, display);
		window(xanyevent, window);

		return xanyevent;
	}

	public static void type(ByteBuffer xanyevent, int type) { xanyevent.putInt(xanyevent.position() + TYPE, type); }
	public static void serial(ByteBuffer xanyevent, long serial) { PointerBuffer.put(xanyevent, xanyevent.position() + SERIAL, serial); }
	public static void send_event(ByteBuffer xanyevent, int send_event) { xanyevent.putInt(xanyevent.position() + SEND_EVENT, send_event); }
	public static void display(ByteBuffer xanyevent, long display) { PointerBuffer.put(xanyevent, xanyevent.position() + DISPLAY, display); }
	public static void window(ByteBuffer xanyevent, long window) { PointerBuffer.put(xanyevent, xanyevent.position() + WINDOW, window); }

	public static int type(ByteBuffer xanyevent) { return xanyevent.getInt(xanyevent.position() + TYPE); }
	public static long serial(ByteBuffer xanyevent) { return PointerBuffer.get(xanyevent, xanyevent.position() + SERIAL); }
	public static int send_event(ByteBuffer xanyevent) { return xanyevent.getInt(xanyevent.position() + SEND_EVENT); }
	public static long display(ByteBuffer xanyevent) { return PointerBuffer.get(xanyevent, xanyevent.position() + DISPLAY); }
	public static long window(ByteBuffer xanyevent) { return PointerBuffer.get(xanyevent, xanyevent.position() + WINDOW); }

}