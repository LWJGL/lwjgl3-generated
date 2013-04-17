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
public final class JSEvent {

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

	private JSEvent() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int time,
		int value,
		int type,
		int number
	) {
		ByteBuffer js_event = malloc();

		timeSet(js_event, time);
		valueSet(js_event, value);
		typeSet(js_event, type);
		numberSet(js_event, number);

		return js_event;
	}

	public static void timeSet(ByteBuffer js_event, int time) { js_event.putInt(js_event.position() + TIME, time); }
	public static void valueSet(ByteBuffer js_event, int value) { js_event.putShort(js_event.position() + VALUE, (short)value); }
	public static void typeSet(ByteBuffer js_event, int type) { js_event.put(js_event.position() + TYPE, (byte)type); }
	public static void numberSet(ByteBuffer js_event, int number) { js_event.put(js_event.position() + NUMBER, (byte)number); }

	public static int timeGet(ByteBuffer js_event) { return js_event.getInt(js_event.position() + TIME); }
	public static int valueGet(ByteBuffer js_event) { return js_event.getShort(js_event.position() + VALUE); }
	public static int typeGet(ByteBuffer js_event) { return js_event.get(js_event.position() + TYPE) & 0xFF; }
	public static int numberGet(ByteBuffer js_event) { return js_event.get(js_event.position() + NUMBER) & 0xFF; }

}