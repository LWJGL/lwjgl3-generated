/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class LARGE_INTEGER implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		QUADPART;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(1);

		SIZEOF = offsets(memAddress(offsets));

		QUADPART = offsets.get(0);
	}

	private final ByteBuffer struct;

	public LARGE_INTEGER() {
		this(malloc());
	}

	public LARGE_INTEGER(ByteBuffer struct) {
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

	public void setQuadPart(long QuadPart) { QuadPart(struct, QuadPart); }

	public long getQuadPart() { return QuadPart(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		long QuadPart
	) {
		ByteBuffer large_integer = malloc();

		QuadPart(large_integer, QuadPart);

		return large_integer;
	}

	public static void QuadPart(ByteBuffer large_integer, long QuadPart) { large_integer.putLong(large_integer.position() + QUADPART, QuadPart); }

	public static long QuadPart(ByteBuffer large_integer) { return large_integer.getLong(large_integer.position() + QUADPART); }

}