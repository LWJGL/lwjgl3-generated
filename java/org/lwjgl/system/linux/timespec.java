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
public final class timespec {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SEC,
		NSEC;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		SEC = offsets.get(0);
		NSEC = offsets.get(1);
	}

	private timespec() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long sec,
		long nsec
	) {
		ByteBuffer timespec = malloc();

		sec(timespec, sec);
		nsec(timespec, nsec);

		return timespec;
	}

	public static void sec(ByteBuffer timespec, long sec) { timespec.putLong(timespec.position() + SEC, sec); }
	public static void nsec(ByteBuffer timespec, long nsec) { PointerBuffer.put(timespec, timespec.position() + NSEC, nsec); }

	public static long sec(ByteBuffer timespec) { return timespec.getLong(timespec.position() + SEC); }
	public static long nsec(ByteBuffer timespec) { return PointerBuffer.get(timespec, timespec.position() + NSEC); }

}