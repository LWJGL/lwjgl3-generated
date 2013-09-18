/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Buffer region struct. */
public final class cl_buffer_region {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ORIGIN,
		SIZE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		ORIGIN = offsets.get(0);
		SIZE = offsets.get(1);
	}

	private cl_buffer_region() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long origin,
		long size
	) {
		ByteBuffer cl_buffer_region = malloc();

		origin(cl_buffer_region, origin);
		size(cl_buffer_region, size);

		return cl_buffer_region;
	}

	public static void origin(ByteBuffer cl_buffer_region, long origin) { PointerBuffer.put(cl_buffer_region, cl_buffer_region.position() + ORIGIN, origin); }
	public static void size(ByteBuffer cl_buffer_region, long size) { PointerBuffer.put(cl_buffer_region, cl_buffer_region.position() + SIZE, size); }

	public static long origin(ByteBuffer cl_buffer_region) { return PointerBuffer.get(cl_buffer_region, cl_buffer_region.position() + ORIGIN); }
	public static long size(ByteBuffer cl_buffer_region) { return PointerBuffer.get(cl_buffer_region, cl_buffer_region.position() + SIZE); }

}