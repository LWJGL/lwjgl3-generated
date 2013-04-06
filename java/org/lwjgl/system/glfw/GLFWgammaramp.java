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
		ByteBuffer glfwgammaramp = malloc();

		redSet(glfwgammaramp, red, redBytes);
		greenSet(glfwgammaramp, green, greenBytes);
		blueSet(glfwgammaramp, blue, blueBytes);

		return glfwgammaramp;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		ByteBuffer red,
		ByteBuffer green,
		ByteBuffer blue
	) {
		ByteBuffer glfwgammaramp = malloc();

		redSet(glfwgammaramp, red);
		greenSet(glfwgammaramp, green);
		blueSet(glfwgammaramp, blue);

		return glfwgammaramp;
	}

	public static void redSet(ByteBuffer glfwgammaramp, long red, int bytes) { memCopy(red, memAddress(glfwgammaramp) + RED, bytes); }
	public static void redSet(ByteBuffer glfwgammaramp, ByteBuffer red) {
		checkBufferGT(red, 256 * 2);
		redSet(glfwgammaramp, memAddress(red), red.remaining());
	}
	public static void greenSet(ByteBuffer glfwgammaramp, long green, int bytes) { memCopy(green, memAddress(glfwgammaramp) + GREEN, bytes); }
	public static void greenSet(ByteBuffer glfwgammaramp, ByteBuffer green) {
		checkBufferGT(green, 256 * 2);
		greenSet(glfwgammaramp, memAddress(green), green.remaining());
	}
	public static void blueSet(ByteBuffer glfwgammaramp, long blue, int bytes) { memCopy(blue, memAddress(glfwgammaramp) + BLUE, bytes); }
	public static void blueSet(ByteBuffer glfwgammaramp, ByteBuffer blue) {
		checkBufferGT(blue, 256 * 2);
		blueSet(glfwgammaramp, memAddress(blue), blue.remaining());
	}

	public static void redGet(ByteBuffer glfwgammaramp, long red, int bytes) {
		memCopy(memAddress(glfwgammaramp) + RED, red, bytes);
	}
	public static void redGetb(ByteBuffer glfwgammaramp, ByteBuffer red) {
		checkBufferGT(red, 256 * 2);
		redGet(glfwgammaramp, memAddress(red), red.remaining());
	}
	public static void greenGet(ByteBuffer glfwgammaramp, long green, int bytes) {
		memCopy(memAddress(glfwgammaramp) + GREEN, green, bytes);
	}
	public static void greenGetb(ByteBuffer glfwgammaramp, ByteBuffer green) {
		checkBufferGT(green, 256 * 2);
		greenGet(glfwgammaramp, memAddress(green), green.remaining());
	}
	public static void blueGet(ByteBuffer glfwgammaramp, long blue, int bytes) {
		memCopy(memAddress(glfwgammaramp) + BLUE, blue, bytes);
	}
	public static void blueGetb(ByteBuffer glfwgammaramp, ByteBuffer blue) {
		checkBufferGT(blue, 256 * 2);
		blueGet(glfwgammaramp, memAddress(blue), blue.remaining());
	}

}