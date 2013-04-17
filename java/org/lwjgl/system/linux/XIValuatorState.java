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

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int mask_len,
		long mask,
		long values
	) {
		ByteBuffer xivaluatorstate = malloc();

		mask_lenSet(xivaluatorstate, mask_len);
		maskSet(xivaluatorstate, mask);
		valuesSet(xivaluatorstate, values);

		return xivaluatorstate;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int mask_len,
		ByteBuffer mask,
		ByteBuffer values
	) {
		ByteBuffer xivaluatorstate = malloc();

		mask_lenSet(xivaluatorstate, mask_len);
		maskSet(xivaluatorstate, mask);
		valuesSet(xivaluatorstate, values);

		return xivaluatorstate;
	}

	public static void mask_lenSet(ByteBuffer xivaluatorstate, int mask_len) { xivaluatorstate.putInt(xivaluatorstate.position() + MASK_LEN, mask_len); }
	public static void maskSet(ByteBuffer xivaluatorstate, long mask) { PointerBuffer.put(xivaluatorstate, xivaluatorstate.position() + MASK, mask); }
	public static void maskSet(ByteBuffer xivaluatorstate, ByteBuffer mask) { maskSet(xivaluatorstate, memAddress(mask)); }
	public static void valuesSet(ByteBuffer xivaluatorstate, long values) { PointerBuffer.put(xivaluatorstate, xivaluatorstate.position() + VALUES, values); }
	public static void valuesSet(ByteBuffer xivaluatorstate, ByteBuffer values) { valuesSet(xivaluatorstate, memAddress(values)); }

	public static int mask_lenGet(ByteBuffer xivaluatorstate) { return xivaluatorstate.getInt(xivaluatorstate.position() + MASK_LEN); }
	public static long maskGet(ByteBuffer xivaluatorstate) { return PointerBuffer.get(xivaluatorstate, xivaluatorstate.position() + MASK); }
	public static ByteBuffer maskGet(ByteBuffer xivaluatorstate, int size) { long address = maskGet(xivaluatorstate); return address == 0 ? null : memByteBuffer(address, size); }
	public static long valuesGet(ByteBuffer xivaluatorstate) { return PointerBuffer.get(xivaluatorstate, xivaluatorstate.position() + VALUES); }
	public static ByteBuffer valuesGet(ByteBuffer xivaluatorstate, int size) { long address = valuesGet(xivaluatorstate); return address == 0 ? null : memByteBuffer(address, size); }

}