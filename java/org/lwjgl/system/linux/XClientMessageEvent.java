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
public final class XClientMessageEvent implements Pointer {

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

	private final ByteBuffer struct;

	public XClientMessageEvent() {
		this(malloc());
	}

	public XClientMessageEvent(ByteBuffer struct) {
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
	public void setMessageType(long message_type) { message_type(struct, message_type); }
	public void setFormat(int format) { format(struct, format); }
	public void setDataB(ByteBuffer b) { dataBSet(struct, b); }
	public void setDataB(int index, byte b) { dataB(struct, index, b); }
	public void setDataS(ByteBuffer s) { dataSSet(struct, s); }
	public void setDataS(int index, short s) { dataS(struct, index, s); }
	public void setDataL(ByteBuffer l) { dataLSet(struct, l); }
	public void setDataL(int index, long l) { dataL(struct, index, l); }

	public int getType() { return type(struct); }
	public long getSerial() { return serial(struct); }
	public int getSendEvent() { return send_event(struct); }
	public long getDisplay() { return display(struct); }
	public long getWindow() { return window(struct); }
	public long getMessageType() { return message_type(struct); }
	public int getFormat() { return format(struct); }
	public void getDataB(ByteBuffer b) { dataBGet(struct, b); }
	public void getDataS(ByteBuffer s) { dataSGet(struct, s); }
	public void getDataL(ByteBuffer l) { dataLGet(struct, l); }

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
	public static void dataBSet(ByteBuffer xclientmessageevent, ByteBuffer b) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(b, 20 * 1);
		}
		memCopy(memAddress(b), memAddress(xclientmessageevent) + DATA_B, b.remaining());
	}
	public static void dataB(ByteBuffer xclientmessageevent, int index, byte b) { xclientmessageevent.put(DATA_B + index, b); }
	public static void dataSSet(ByteBuffer xclientmessageevent, ByteBuffer s) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(s, 10 * 2);
		}
		memCopy(memAddress(s), memAddress(xclientmessageevent) + DATA_S, s.remaining());
	}
	public static void dataS(ByteBuffer xclientmessageevent, int index, short s) { xclientmessageevent.putShort(DATA_S + index * 2, s); }
	public static void dataLSet(ByteBuffer xclientmessageevent, ByteBuffer l) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(l, 5 * POINTER_SIZE);
		}
		memCopy(memAddress(l), memAddress(xclientmessageevent) + DATA_L, l.remaining());
	}
	public static void dataL(ByteBuffer xclientmessageevent, int index, long l) { PointerBuffer.put(xclientmessageevent, DATA_L + index * POINTER_SIZE, l); }

	public static int type(ByteBuffer xclientmessageevent) { return xclientmessageevent.getInt(xclientmessageevent.position() + TYPE); }
	public static long serial(ByteBuffer xclientmessageevent) { return PointerBuffer.get(xclientmessageevent, xclientmessageevent.position() + SERIAL); }
	public static int send_event(ByteBuffer xclientmessageevent) { return xclientmessageevent.getInt(xclientmessageevent.position() + SEND_EVENT); }
	public static long display(ByteBuffer xclientmessageevent) { return PointerBuffer.get(xclientmessageevent, xclientmessageevent.position() + DISPLAY); }
	public static long window(ByteBuffer xclientmessageevent) { return PointerBuffer.get(xclientmessageevent, xclientmessageevent.position() + WINDOW); }
	public static long message_type(ByteBuffer xclientmessageevent) { return PointerBuffer.get(xclientmessageevent, xclientmessageevent.position() + MESSAGE_TYPE); }
	public static int format(ByteBuffer xclientmessageevent) { return xclientmessageevent.getInt(xclientmessageevent.position() + FORMAT); }
	public static void dataBGet(ByteBuffer xclientmessageevent, ByteBuffer b) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(b, 20 * 1);
		memCopy(memAddress(xclientmessageevent) + DATA_B, memAddress(b), b.remaining());
	}
	public static byte dataB(ByteBuffer xclientmessageevent, int index) {
		return xclientmessageevent.get(DATA_B + index * 1);
	}
	public static void dataSGet(ByteBuffer xclientmessageevent, ByteBuffer s) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(s, 10 * 2);
		memCopy(memAddress(xclientmessageevent) + DATA_S, memAddress(s), s.remaining());
	}
	public static short dataS(ByteBuffer xclientmessageevent, int index) {
		return xclientmessageevent.getShort(DATA_S + index * 2);
	}
	public static void dataLGet(ByteBuffer xclientmessageevent, ByteBuffer l) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(l, 5 * 8);
		memCopy(memAddress(xclientmessageevent) + DATA_L, memAddress(l), l.remaining());
	}
	public static long dataL(ByteBuffer xclientmessageevent, int index) {
		return xclientmessageevent.getLong(DATA_L + index * 8);
	}

}