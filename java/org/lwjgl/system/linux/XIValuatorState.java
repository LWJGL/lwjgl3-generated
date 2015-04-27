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
public final class XIValuatorState implements Pointer {

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

	private final ByteBuffer struct;

	public XIValuatorState() {
		this(malloc());
	}

	public XIValuatorState(ByteBuffer struct) {
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
	public void setValues(long values) { values(struct, values); }
	public void setValues(ByteBuffer values) { values(struct, values); }

	public int getMaskLen() { return mask_len(struct); }
	public long getMask() { return mask(struct); }
	public ByteBuffer getMask(int byteLen) { return mask(struct, byteLen); }
	public long getValues() { return values(struct); }
	public ByteBuffer getValues(int byteLen) { return values(struct, byteLen); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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
	public static void mask(ByteBuffer xivaluatorstate, ByteBuffer mask) { mask(xivaluatorstate, memAddressSafe(mask)); }
	public static void values(ByteBuffer xivaluatorstate, long values) { PointerBuffer.put(xivaluatorstate, xivaluatorstate.position() + VALUES, values); }
	public static void values(ByteBuffer xivaluatorstate, ByteBuffer values) { values(xivaluatorstate, memAddressSafe(values)); }

	public static int mask_len(ByteBuffer xivaluatorstate) { return xivaluatorstate.getInt(xivaluatorstate.position() + MASK_LEN); }
	public static long mask(ByteBuffer xivaluatorstate) { return PointerBuffer.get(xivaluatorstate, xivaluatorstate.position() + MASK); }
	public static ByteBuffer mask(ByteBuffer xivaluatorstate, int byteLen) { return memByteBuffer(mask(xivaluatorstate), byteLen); }
	public static long values(ByteBuffer xivaluatorstate) { return PointerBuffer.get(xivaluatorstate, xivaluatorstate.position() + VALUES); }
	public static ByteBuffer values(ByteBuffer xivaluatorstate, int byteLen) { return memByteBuffer(values(xivaluatorstate), byteLen); }

}