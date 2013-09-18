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
		BLUE,
		SIZE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		RED = offsets.get(0);
		GREEN = offsets.get(1);
		BLUE = offsets.get(2);
		SIZE = offsets.get(3);
	}

	private GLFWgammaramp() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long red,
		long green,
		long blue,
		int size
	) {
		ByteBuffer glfwgammaramp = malloc();

		red(glfwgammaramp, red);
		green(glfwgammaramp, green);
		blue(glfwgammaramp, blue);
		size(glfwgammaramp, size);

		return glfwgammaramp;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		ByteBuffer red,
		ByteBuffer green,
		ByteBuffer blue,
		int size
	) {
		ByteBuffer glfwgammaramp = malloc();

		red(glfwgammaramp, red);
		green(glfwgammaramp, green);
		blue(glfwgammaramp, blue);
		size(glfwgammaramp, size);

		return glfwgammaramp;
	}

	public static void red(ByteBuffer glfwgammaramp, long red) { PointerBuffer.put(glfwgammaramp, glfwgammaramp.position() + RED, red); }
	public static void red(ByteBuffer glfwgammaramp, ByteBuffer red) { red(glfwgammaramp, memAddress(red)); }
	public static void green(ByteBuffer glfwgammaramp, long green) { PointerBuffer.put(glfwgammaramp, glfwgammaramp.position() + GREEN, green); }
	public static void green(ByteBuffer glfwgammaramp, ByteBuffer green) { green(glfwgammaramp, memAddress(green)); }
	public static void blue(ByteBuffer glfwgammaramp, long blue) { PointerBuffer.put(glfwgammaramp, glfwgammaramp.position() + BLUE, blue); }
	public static void blue(ByteBuffer glfwgammaramp, ByteBuffer blue) { blue(glfwgammaramp, memAddress(blue)); }
	public static void size(ByteBuffer glfwgammaramp, int size) { glfwgammaramp.putInt(glfwgammaramp.position() + SIZE, size); }

	public static long red(ByteBuffer glfwgammaramp) { return PointerBuffer.get(glfwgammaramp, glfwgammaramp.position() + RED); }
	public static ByteBuffer red(ByteBuffer glfwgammaramp, int size) { long address = red(glfwgammaramp); return address == NULL ? null : memByteBuffer(address, size); }
	public static long green(ByteBuffer glfwgammaramp) { return PointerBuffer.get(glfwgammaramp, glfwgammaramp.position() + GREEN); }
	public static ByteBuffer green(ByteBuffer glfwgammaramp, int size) { long address = green(glfwgammaramp); return address == NULL ? null : memByteBuffer(address, size); }
	public static long blue(ByteBuffer glfwgammaramp) { return PointerBuffer.get(glfwgammaramp, glfwgammaramp.position() + BLUE); }
	public static ByteBuffer blue(ByteBuffer glfwgammaramp, int size) { long address = blue(glfwgammaramp); return address == NULL ? null : memByteBuffer(address, size); }
	public static int size(ByteBuffer glfwgammaramp) { return glfwgammaramp.getInt(glfwgammaramp.position() + SIZE); }

}