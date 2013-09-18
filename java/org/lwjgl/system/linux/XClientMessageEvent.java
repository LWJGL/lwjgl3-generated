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

/** Client message event. */
public final class XClientMessageEvent {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		SERIAL,
		SEND_EVENT,
		DISPLAY,
		WINDOW,
		MESSAGE_TYPE,
		FORMAT,
		DATA,
			DATA_B,
			DATA_S,
			DATA_L;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(11);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		SERIAL = offsets.get(1);
		SEND_EVENT = offsets.get(2);
		DISPLAY = offsets.get(3);
		WINDOW = offsets.get(4);
		MESSAGE_TYPE = offsets.get(5);
		FORMAT = offsets.get(6);
		DATA = offsets.get(7);
			DATA_B = offsets.get(8);
			DATA_S = offsets.get(9);
			DATA_L = offsets.get(10);
	}

	private XClientMessageEvent() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int type,
		long serial,
		int send_event,
		long display,
		long window,
		long message_type,
		int format,
		long data_b,
		int data_bBytes,
		long data_s,
		int data_sBytes,
		long data_l,
		int data_lBytes
	) {
		ByteBuffer xclientmessageevent = malloc();

		type(xclientmessageevent, type);
		serial(xclientmessageevent, serial);
		send_event(xclientmessageevent, send_event);
		display(xclientmessageevent, display);
		window(xclientmessageevent, window);
		message_type(xclientmessageevent, message_type);
		format(xclientmessageevent, format);
		dataBSet(xclientmessageevent, data_b, data_bBytes);
		dataSSet(xclientmessageevent, data_s, data_sBytes);
		dataLSet(xclientmessageevent, data_l, data_lBytes);

		return xclientmessageevent;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int type,
		long serial,
		int send_event,
		long display,
		long window,
		long message_type,
		int format,
		ByteBuffer data_b,
		ByteBuffer data_s,
		ByteBuffer data_l
	) {
		ByteBuffer xclientmessageevent = malloc();

		type(xclientmessageevent, type);
		serial(xclientmessageevent, serial);
		send_event(xclientmessageevent, send_event);
		display(xclientmessageevent, display);
		window(xclientmessageevent, window);
		message_type(xclientmessageevent, message_type);
		format(xclientmessageevent, format);
		dataBSet(xclientmessageevent, data_b);
		dataSSet(xclientmessageevent, data_s);
		dataLSet(xclientmessageevent, data_l);

		return xclientmessageevent;
	}

	public static void type(ByteBuffer xclientmessageevent, int type) { xclientmessageevent.putInt(xclientmessageevent.position() + TYPE, type); }
	public static void serial(ByteBuffer xclientmessageevent, long serial) { PointerBuffer.put(xclientmessageevent, xclientmessageevent.position() + SERIAL, serial); }
	public static void send_event(ByteBuffer xclientmessageevent, int send_event) { xclientmessageevent.putInt(xclientmessageevent.position() + SEND_EVENT, send_event); }
	public static void display(ByteBuffer xclientmessageevent, long display) { PointerBuffer.put(xclientmessageevent, xclientmessageevent.position() + DISPLAY, display); }
	public static void window(ByteBuffer xclientmessageevent, long window) { PointerBuffer.put(xclientmessageevent, xclientmessageevent.position() + WINDOW, window); }
	public static void message_type(ByteBuffer xclientmessageevent, long message_type) { PointerBuffer.put(xclientmessageevent, xclientmessageevent.position() + MESSAGE_TYPE, message_type); }
	public static void format(ByteBuffer xclientmessageevent, int format) { xclientmessageevent.putInt(xclientmessageevent.position() + FORMAT, format); }
	public static void dataBSet(ByteBuffer xclientmessageevent, long b, int bytes) { memCopy(b, memAddress(xclientmessageevent) + DATA_B, bytes); }
	public static void dataBSet(ByteBuffer xclientmessageevent, ByteBuffer b) {
		checkBufferGT(b, 20 * 1);
		dataBSet(xclientmessageevent, memAddress(b), b.remaining());
	}
	public static void dataSSet(ByteBuffer xclientmessageevent, long s, int bytes) { memCopy(s, memAddress(xclientmessageevent) + DATA_S, bytes); }
	public static void dataSSet(ByteBuffer xclientmessageevent, ByteBuffer s) {
		checkBufferGT(s, 10 * 2);
		dataSSet(xclientmessageevent, memAddress(s), s.remaining());
	}
	public static void dataLSet(ByteBuffer xclientmessageevent, long l, int bytes) { memCopy(l, memAddress(xclientmessageevent) + DATA_L, bytes); }
	public static void dataLSet(ByteBuffer xclientmessageevent, ByteBuffer l) {
		checkBufferGT(l, 5 * 8);
		dataLSet(xclientmessageevent, memAddress(l), l.remaining());
	}

	public static int type(ByteBuffer xclientmessageevent) { return xclientmessageevent.getInt(xclientmessageevent.position() + TYPE); }
	public static long serial(ByteBuffer xclientmessageevent) { return PointerBuffer.get(xclientmessageevent, xclientmessageevent.position() + SERIAL); }
	public static int send_event(ByteBuffer xclientmessageevent) { return xclientmessageevent.getInt(xclientmessageevent.position() + SEND_EVENT); }
	public static long display(ByteBuffer xclientmessageevent) { return PointerBuffer.get(xclientmessageevent, xclientmessageevent.position() + DISPLAY); }
	public static long window(ByteBuffer xclientmessageevent) { return PointerBuffer.get(xclientmessageevent, xclientmessageevent.position() + WINDOW); }
	public static long message_type(ByteBuffer xclientmessageevent) { return PointerBuffer.get(xclientmessageevent, xclientmessageevent.position() + MESSAGE_TYPE); }
	public static int format(ByteBuffer xclientmessageevent) { return xclientmessageevent.getInt(xclientmessageevent.position() + FORMAT); }
	public static void dataBGet(ByteBuffer xclientmessageevent, long b, int bytes) {
		memCopy(memAddress(xclientmessageevent) + DATA_B, b, bytes);
	}
	public static void dataBGet(ByteBuffer xclientmessageevent, ByteBuffer b) {
		checkBufferGT(b, 20 * 1);
		dataBGet(xclientmessageevent, memAddress(b), b.remaining());
	}
	public static void dataSGet(ByteBuffer xclientmessageevent, long s, int bytes) {
		memCopy(memAddress(xclientmessageevent) + DATA_S, s, bytes);
	}
	public static void dataSGet(ByteBuffer xclientmessageevent, ByteBuffer s) {
		checkBufferGT(s, 10 * 2);
		dataSGet(xclientmessageevent, memAddress(s), s.remaining());
	}
	public static void dataLGet(ByteBuffer xclientmessageevent, long l, int bytes) {
		memCopy(memAddress(xclientmessageevent) + DATA_L, l, bytes);
	}
	public static void dataLGet(ByteBuffer xclientmessageevent, ByteBuffer l) {
		checkBufferGT(l, 5 * 8);
		dataLGet(xclientmessageevent, memAddress(l), l.remaining());
	}

}