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

/** XInput2 event mask. */
public final class XIEventMask {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		DEVICEID,
		MASK,
		MASK_LEN;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		DEVICEID = offsets.get(0);
		MASK = offsets.get(1);
		MASK_LEN = offsets.get(2);
	}

	private XIEventMask() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int deviceid,
		long mask,
		int mask_len
	) {
		ByteBuffer xieventmask = malloc();

		deviceidSet(xieventmask, deviceid);
		maskSet(xieventmask, mask);
		mask_lenSet(xieventmask, mask_len);

		return xieventmask;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int deviceid,
		ByteBuffer mask,
		int mask_len
	) {
		ByteBuffer xieventmask = malloc();

		deviceidSet(xieventmask, deviceid);
		maskSet(xieventmask, mask);
		mask_lenSet(xieventmask, mask_len);

		return xieventmask;
	}

	public static void deviceidSet(ByteBuffer xieventmask, int deviceid) { xieventmask.putInt(xieventmask.position() + DEVICEID, deviceid); }
	public static void maskSet(ByteBuffer xieventmask, long mask) { PointerBuffer.put(xieventmask, xieventmask.position() + MASK, mask); }
	public static void maskSet(ByteBuffer xieventmask, ByteBuffer mask) { maskSet(xieventmask, memAddress(mask)); }
	public static void mask_lenSet(ByteBuffer xieventmask, int mask_len) { xieventmask.putInt(xieventmask.position() + MASK_LEN, mask_len); }

	public static int deviceidGet(ByteBuffer xieventmask) { return xieventmask.getInt(xieventmask.position() + DEVICEID); }
	public static long maskGet(ByteBuffer xieventmask) { return PointerBuffer.get(xieventmask, xieventmask.position() + MASK); }
	public static ByteBuffer maskGet(ByteBuffer xieventmask, int size) { long address = maskGet(xieventmask); return address == 0 ? null : memByteBuffer(address, size); }
	public static int mask_lenGet(ByteBuffer xieventmask) { return xieventmask.getInt(xieventmask.position() + MASK_LEN); }

}