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
public final class XIButtonState implements Pointer {

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

	private final ByteBuffer struct;

	public XIButtonState() {
		this(malloc());
	}

	public XIButtonState(ByteBuffer struct) {
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

	public void setMaskLen(int mask_len) { mask_len(struct, mask_len); }
	public void setMask(long mask) { mask(struct, mask); }
	public void setMask(ByteBuffer mask) { mask(struct, mask); }

	public int getMaskLen() { return mask_len(struct); }
	public long getMask() { return mask(struct); }
	public ByteBuffer getMask(int byteLen) { return mask(struct, byteLen); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int mask_len,
		ByteBuffer mask
	) {
		ByteBuffer xibuttonstate = malloc();

		mask_len(xibuttonstate, mask_len);
		mask(xibuttonstate, mask);

		return xibuttonstate;
	}

	public static void mask_len(ByteBuffer xibuttonstate, int mask_len) { xibuttonstate.putInt(xibuttonstate.position() + MASK_LEN, mask_len); }
	public static void mask(ByteBuffer xibuttonstate, long mask) { PointerBuffer.put(xibuttonstate, xibuttonstate.position() + MASK, mask); }
	public static void mask(ByteBuffer xibuttonstate, ByteBuffer mask) { mask(xibuttonstate, memAddressSafe(mask)); }

	public static int mask_len(ByteBuffer xibuttonstate) { return xibuttonstate.getInt(xibuttonstate.position() + MASK_LEN); }
	public static long mask(ByteBuffer xibuttonstate) { return PointerBuffer.get(xibuttonstate, xibuttonstate.position() + MASK); }
	public static ByteBuffer mask(ByteBuffer xibuttonstate, int byteLen) { return memByteBuffer(mask(xibuttonstate), byteLen); }

}