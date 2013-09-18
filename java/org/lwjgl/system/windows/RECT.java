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

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int left,
		int top,
		int right,
		int bottom
	) {
		ByteBuffer rect = malloc();

		left(rect, left);
		top(rect, top);
		right(rect, right);
		bottom(rect, bottom);

		return rect;
	}

	public static void left(ByteBuffer rect, int left) { rect.putInt(rect.position() + LEFT, left); }
	public static void top(ByteBuffer rect, int top) { rect.putInt(rect.position() + TOP, top); }
	public static void right(ByteBuffer rect, int right) { rect.putInt(rect.position() + RIGHT, right); }
	public static void bottom(ByteBuffer rect, int bottom) { rect.putInt(rect.position() + BOTTOM, bottom); }

	public static int left(ByteBuffer rect) { return rect.getInt(rect.position() + LEFT); }
	public static int top(ByteBuffer rect) { return rect.getInt(rect.position() + TOP); }
	public static int right(ByteBuffer rect) { return rect.getInt(rect.position() + RIGHT); }
	public static int bottom(ByteBuffer rect) { return rect.getInt(rect.position() + BOTTOM); }

}