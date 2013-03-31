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

/** Defines the coordinates of the upper-left and lower-right corners of a rectangle. */
public final class RECT {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		LEFT,
		TOP,
		RIGHT,
		BOTTOM;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		LEFT = offsets.get(0);
		TOP = offsets.get(1);
		RIGHT = offsets.get(2);
		BOTTOM = offsets.get(3);
	}

	private RECT() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int left,
		int top,
		int right,
		int bottom
	) {
		ByteBuffer struct = malloc();

		leftSet(struct, left);
		topSet(struct, top);
		rightSet(struct, right);
		bottomSet(struct, bottom);

		return struct;
	}

	public static void leftSet(ByteBuffer struct, int left) { struct.putInt(struct.position() + LEFT, left); }
	public static void topSet(ByteBuffer struct, int top) { struct.putInt(struct.position() + TOP, top); }
	public static void rightSet(ByteBuffer struct, int right) { struct.putInt(struct.position() + RIGHT, right); }
	public static void bottomSet(ByteBuffer struct, int bottom) { struct.putInt(struct.position() + BOTTOM, bottom); }

	public static int leftGet(ByteBuffer struct) { return struct.getInt(struct.position() + LEFT); }
	public static int topGet(ByteBuffer struct) { return struct.getInt(struct.position() + TOP); }
	public static int rightGet(ByteBuffer struct) { return struct.getInt(struct.position() + RIGHT); }
	public static int bottomGet(ByteBuffer struct) { return struct.getInt(struct.position() + BOTTOM); }

}