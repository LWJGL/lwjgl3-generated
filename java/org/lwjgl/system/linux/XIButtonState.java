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

/** XInput2 button state. */
public final class XIButtonState {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		MASK_LEN,
		MASK;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		MASK_LEN = offsets.get(0);
		MASK = offsets.get(1);
	}

	private XIButtonState() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int mask_len,
		long mask
	) {
		ByteBuffer xibuttonstate = malloc();

		mask_lenSet(xibuttonstate, mask_len);
		maskSet(xibuttonstate, mask);

		return xibuttonstate;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int mask_len,
		ByteBuffer mask
	) {
		ByteBuffer xibuttonstate = malloc();

		mask_lenSet(xibuttonstate, mask_len);
		maskSet(xibuttonstate, mask);

		return xibuttonstate;
	}

	public static void mask_lenSet(ByteBuffer xibuttonstate, int mask_len) { xibuttonstate.putInt(xibuttonstate.position() + MASK_LEN, mask_len); }
	public static void maskSet(ByteBuffer xibuttonstate, long mask) { PointerBuffer.put(xibuttonstate, xibuttonstate.position() + MASK, mask); }
	public static void maskSet(ByteBuffer xibuttonstate, ByteBuffer mask) { maskSet(xibuttonstate, memAddress(mask)); }

	public static int mask_lenGet(ByteBuffer xibuttonstate) { return xibuttonstate.getInt(xibuttonstate.position() + MASK_LEN); }
	public static long maskGet(ByteBuffer xibuttonstate) { return PointerBuffer.get(xibuttonstate, xibuttonstate.position() + MASK); }
	public static ByteBuffer maskGet(ByteBuffer xibuttonstate, int size) { long address = maskGet(xibuttonstate); return address == 0 ? null : memByteBuffer(address, size); }

}