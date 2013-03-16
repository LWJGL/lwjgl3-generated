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

public final class POINTFLOAT {

	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		X = offsets.get(0);
		Y = offsets.get(1);
	}

	private POINTFLOAT() {}

	private static native int offsets(long buffer);

	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	public static void xSet(ByteBuffer struct, float x) { struct.putFloat(struct.position() + X, x); }
	public static void ySet(ByteBuffer struct, float y) { struct.putFloat(struct.position() + Y, y); }

	public static float xGet(ByteBuffer struct) { return struct.getFloat(struct.position() + X); }
	public static float yGet(ByteBuffer struct) { return struct.getFloat(struct.position() + Y); }

}