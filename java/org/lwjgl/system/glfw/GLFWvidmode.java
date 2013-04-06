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

/** Video mode. */
public final class GLFWvidmode {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		WIDTH,
		HEIGHT,
		REDBITS,
		BLUEBITS,
		GREENBITS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(5);

		SIZEOF = offsets(memAddress(offsets));

		WIDTH = offsets.get(0);
		HEIGHT = offsets.get(1);
		REDBITS = offsets.get(2);
		BLUEBITS = offsets.get(3);
		GREENBITS = offsets.get(4);
	}

	private GLFWvidmode() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int width,
		int height,
		int redBits,
		int blueBits,
		int greenBits
	) {
		ByteBuffer glfwvidmode = malloc();

		widthSet(glfwvidmode, width);
		heightSet(glfwvidmode, height);
		redBitsSet(glfwvidmode, redBits);
		blueBitsSet(glfwvidmode, blueBits);
		greenBitsSet(glfwvidmode, greenBits);

		return glfwvidmode;
	}

	public static void widthSet(ByteBuffer glfwvidmode, int width) { glfwvidmode.putInt(glfwvidmode.position() + WIDTH, width); }
	public static void heightSet(ByteBuffer glfwvidmode, int height) { glfwvidmode.putInt(glfwvidmode.position() + HEIGHT, height); }
	public static void redBitsSet(ByteBuffer glfwvidmode, int redBits) { glfwvidmode.putInt(glfwvidmode.position() + REDBITS, redBits); }
	public static void blueBitsSet(ByteBuffer glfwvidmode, int blueBits) { glfwvidmode.putInt(glfwvidmode.position() + BLUEBITS, blueBits); }
	public static void greenBitsSet(ByteBuffer glfwvidmode, int greenBits) { glfwvidmode.putInt(glfwvidmode.position() + GREENBITS, greenBits); }

	public static int widthGet(ByteBuffer glfwvidmode) { return glfwvidmode.getInt(glfwvidmode.position() + WIDTH); }
	public static int heightGet(ByteBuffer glfwvidmode) { return glfwvidmode.getInt(glfwvidmode.position() + HEIGHT); }
	public static int redBitsGet(ByteBuffer glfwvidmode) { return glfwvidmode.getInt(glfwvidmode.position() + REDBITS); }
	public static int blueBitsGet(ByteBuffer glfwvidmode) { return glfwvidmode.getInt(glfwvidmode.position() + BLUEBITS); }
	public static int greenBitsGet(ByteBuffer glfwvidmode) { return glfwvidmode.getInt(glfwvidmode.position() + GREENBITS); }

}