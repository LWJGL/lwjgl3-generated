/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.glfw;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Gamma ramp. */
public final class GLFWgammaramp {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		RED,
		GREEN,
		BLUE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		RED = offsets.get(0);
		GREEN = offsets.get(1);
		BLUE = offsets.get(2);
	}

	private GLFWgammaramp() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long red,
		int redBytes,
		long green,
		int greenBytes,
		long blue,
		int blueBytes
	) {
		ByteBuffer struct = malloc();

		redSet(struct, red, redBytes);
		greenSet(struct, green, greenBytes);
		blueSet(struct, blue, blueBytes);

		return struct;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		ByteBuffer red,
		ByteBuffer green,
		ByteBuffer blue
	) {
		ByteBuffer struct = malloc();

		redSet(struct, red);
		greenSet(struct, green);
		blueSet(struct, blue);

		return struct;
	}

	public static void redSet(ByteBuffer struct, long red, int bytes) { memCopy(red, memAddress(struct) + RED, bytes); }
	public static void redSet(ByteBuffer struct, ByteBuffer red) {
		checkBufferGT(red, 256 * 2);
		redSet(struct, memAddress(red), red.remaining());
	}
	public static void greenSet(ByteBuffer struct, long green, int bytes) { memCopy(green, memAddress(struct) + GREEN, bytes); }
	public static void greenSet(ByteBuffer struct, ByteBuffer green) {
		checkBufferGT(green, 256 * 2);
		greenSet(struct, memAddress(green), green.remaining());
	}
	public static void blueSet(ByteBuffer struct, long blue, int bytes) { memCopy(blue, memAddress(struct) + BLUE, bytes); }
	public static void blueSet(ByteBuffer struct, ByteBuffer blue) {
		checkBufferGT(blue, 256 * 2);
		blueSet(struct, memAddress(blue), blue.remaining());
	}

	public static void redGet(ByteBuffer struct, long red, int bytes) {
		memCopy(memAddress(struct) + RED, red, bytes);
	}
	public static void redGetb(ByteBuffer struct, ByteBuffer red) {
		checkBufferGT(red, 256 * 2);
		redGet(struct, memAddress(red), red.remaining());
	}
	public static void greenGet(ByteBuffer struct, long green, int bytes) {
		memCopy(memAddress(struct) + GREEN, green, bytes);
	}
	public static void greenGetb(ByteBuffer struct, ByteBuffer green) {
		checkBufferGT(green, 256 * 2);
		greenGet(struct, memAddress(green), green.remaining());
	}
	public static void blueGet(ByteBuffer struct, long blue, int bytes) {
		memCopy(memAddress(struct) + BLUE, blue, bytes);
	}
	public static void blueGetb(ByteBuffer struct, ByteBuffer blue) {
		checkBufferGT(blue, 256 * 2);
		blueGet(struct, memAddress(blue), blue.remaining());
	}

}