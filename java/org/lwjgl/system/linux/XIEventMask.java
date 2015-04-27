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
public final class XIEventMask implements Pointer {

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

	private final ByteBuffer struct;

	public XIEventMask() {
		this(malloc());
	}

	public XIEventMask(ByteBuffer struct) {
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

	public void setDeviceid(int deviceid) { deviceid(struct, deviceid); }
	public void setMask(long mask) { mask(struct, mask); }
	public void setMask(ByteBuffer mask) { mask(struct, mask); }
	public void setMaskLen(int mask_len) { mask_len(struct, mask_len); }

	public int getDeviceid() { return deviceid(struct); }
	public long getMask() { return mask(struct); }
	public ByteBuffer getMask(int byteLen) { return mask(struct, byteLen); }
	public int getMaskLen() { return mask_len(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int deviceid,
		ByteBuffer mask,
		int mask_len
	) {
		ByteBuffer xieventmask = malloc();

		deviceid(xieventmask, deviceid);
		mask(xieventmask, mask);
		mask_len(xieventmask, mask_len);

		return xieventmask;
	}

	public static void deviceid(ByteBuffer xieventmask, int deviceid) { xieventmask.putInt(xieventmask.position() + DEVICEID, deviceid); }
	public static void mask(ByteBuffer xieventmask, long mask) { PointerBuffer.put(xieventmask, xieventmask.position() + MASK, mask); }
	public static void mask(ByteBuffer xieventmask, ByteBuffer mask) { mask(xieventmask, memAddressSafe(mask)); }
	public static void mask_len(ByteBuffer xieventmask, int mask_len) { xieventmask.putInt(xieventmask.position() + MASK_LEN, mask_len); }

	public static int deviceid(ByteBuffer xieventmask) { return xieventmask.getInt(xieventmask.position() + DEVICEID); }
	public static long mask(ByteBuffer xieventmask) { return PointerBuffer.get(xieventmask, xieventmask.position() + MASK); }
	public static ByteBuffer mask(ByteBuffer xieventmask, int byteLen) { return memByteBuffer(mask(xieventmask), byteLen); }
	public static int mask_len(ByteBuffer xieventmask) { return xieventmask.getInt(xieventmask.position() + MASK_LEN); }

}