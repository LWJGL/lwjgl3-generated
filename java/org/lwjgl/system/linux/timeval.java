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

/** Time structure */
public final class timeval implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SEC,
		USEC;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		SEC = offsets.get(0);
		USEC = offsets.get(1);
	}

	private final ByteBuffer struct;

	public timeval() {
		this(malloc());
	}

	public timeval(ByteBuffer struct) {
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

	public void setSec(long sec) { sec(struct, sec); }
	public void setUsec(long usec) { usec(struct, usec); }

	public long getSec() { return sec(struct); }
	public long getUsec() { return usec(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		long sec,
		long usec
	) {
		ByteBuffer timeval = malloc();

		sec(timeval, sec);
		usec(timeval, usec);

		return timeval;
	}

	public static void sec(ByteBuffer timeval, long sec) { PointerBuffer.put(timeval, timeval.position() + SEC, sec); }
	public static void usec(ByteBuffer timeval, long usec) { PointerBuffer.put(timeval, timeval.position() + USEC, usec); }

	public static long sec(ByteBuffer timeval) { return PointerBuffer.get(timeval, timeval.position() + SEC); }
	public static long usec(ByteBuffer timeval) { return PointerBuffer.get(timeval, timeval.position() + USEC); }

}