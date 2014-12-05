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

/** Joystick event. */
public final class JSEvent implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TIME,
		VALUE,
		TYPE,
		NUMBER;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		TIME = offsets.get(0);
		VALUE = offsets.get(1);
		TYPE = offsets.get(2);
		NUMBER = offsets.get(3);
	}

	private final ByteBuffer struct;

	public JSEvent() {
		this(malloc());
	}

	public JSEvent(ByteBuffer struct) {
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

	public void setTime(int time) { time(struct, time); }
	public void setValue(int value) { value(struct, value); }
	public void setType(int type) { type(struct, type); }
	public void setNumber(int number) { number(struct, number); }

	public int getTime() { return time(struct); }
	public int getValue() { return value(struct); }
	public int getType() { return type(struct); }
	public int getNumber() { return number(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int time,
		int value,
		int type,
		int number
	) {
		ByteBuffer js_event = malloc();

		time(js_event, time);
		value(js_event, value);
		type(js_event, type);
		number(js_event, number);

		return js_event;
	}

	public static void time(ByteBuffer js_event, int time) { js_event.putInt(js_event.position() + TIME, time); }
	public static void value(ByteBuffer js_event, int value) { js_event.putShort(js_event.position() + VALUE, (short)value); }
	public static void type(ByteBuffer js_event, int type) { js_event.put(js_event.position() + TYPE, (byte)type); }
	public static void number(ByteBuffer js_event, int number) { js_event.put(js_event.position() + NUMBER, (byte)number); }

	public static int time(ByteBuffer js_event) { return js_event.getInt(js_event.position() + TIME); }
	public static int value(ByteBuffer js_event) { return js_event.getShort(js_event.position() + VALUE); }
	public static int type(ByteBuffer js_event) { return js_event.get(js_event.position() + TYPE) & 0xFF; }
	public static int number(ByteBuffer js_event) { return js_event.get(js_event.position() + NUMBER) & 0xFF; }

}