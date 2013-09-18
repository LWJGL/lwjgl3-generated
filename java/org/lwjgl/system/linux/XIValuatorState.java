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

/** XInput2 valuator state. */
public final class XIValuatorState {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		MASK_LEN,
		MASK,
		VALUES;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		MASK_LEN = offsets.get(0);
		MASK = offsets.get(1);
		VALUES = offsets.get(2);
	}

	private XIValuatorState() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int mask_len,
		long mask,
		long values
	) {
		ByteBuffer xivaluatorstate = malloc();

		mask_len(xivaluatorstate, mask_len);
		mask(xivaluatorstate, mask);
		values(xivaluatorstate, values);

		return xivaluatorstate;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int mask_len,
		ByteBuffer mask,
		ByteBuffer values
	) {
		ByteBuffer xivaluatorstate = malloc();

		mask_len(xivaluatorstate, mask_len);
		mask(xivaluatorstate, mask);
		values(xivaluatorstate, values);

		return xivaluatorstate;
	}

	public static void mask_len(ByteBuffer xivaluatorstate, int mask_len) { xivaluatorstate.putInt(xivaluatorstate.position() + MASK_LEN, mask_len); }
	public static void mask(ByteBuffer xivaluatorstate, long mask) { PointerBuffer.put(xivaluatorstate, xivaluatorstate.position() + MASK, mask); }
	public static void mask(ByteBuffer xivaluatorstate, ByteBuffer mask) { mask(xivaluatorstate, memAddress(mask)); }
	public static void values(ByteBuffer xivaluatorstate, long values) { PointerBuffer.put(xivaluatorstate, xivaluatorstate.position() + VALUES, values); }
	public static void values(ByteBuffer xivaluatorstate, ByteBuffer values) { values(xivaluatorstate, memAddress(values)); }

	public static int mask_len(ByteBuffer xivaluatorstate) { return xivaluatorstate.getInt(xivaluatorstate.position() + MASK_LEN); }
	public static long mask(ByteBuffer xivaluatorstate) { return PointerBuffer.get(xivaluatorstate, xivaluatorstate.position() + MASK); }
	public static ByteBuffer mask(ByteBuffer xivaluatorstate, int size) { long address = mask(xivaluatorstate); return address == NULL ? null : memByteBuffer(address, size); }
	public static long values(ByteBuffer xivaluatorstate) { return PointerBuffer.get(xivaluatorstate, xivaluatorstate.position() + VALUES); }
	public static ByteBuffer values(ByteBuffer xivaluatorstate, int size) { long address = values(xivaluatorstate); return address == NULL ? null : memByteBuffer(address, size); }

}