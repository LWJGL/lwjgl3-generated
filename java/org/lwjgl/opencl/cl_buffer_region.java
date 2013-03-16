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

	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	public static void originSet(ByteBuffer struct, long origin) { PointerBuffer.put(struct, struct.position() + ORIGIN, origin); }
	public static void sizeSet(ByteBuffer struct, long size) { PointerBuffer.put(struct, struct.position() + SIZE, size); }

	public static long originGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + ORIGIN); }
	public static long sizeGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + SIZE); }

}