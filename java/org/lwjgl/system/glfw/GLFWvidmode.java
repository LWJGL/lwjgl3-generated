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
		GREENBITS,
		BLUEBITS,
		REFRESHRATE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(6);

		SIZEOF = offsets(memAddress(offsets));

		WIDTH = offsets.get(0);
		HEIGHT = offsets.get(1);
		REDBITS = offsets.get(2);
		GREENBITS = offsets.get(3);
		BLUEBITS = offsets.get(4);
		REFRESHRATE = offsets.get(5);
	}

	private GLFWvidmode() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int width,
		int height,
		int redBits,
		int greenBits,
		int blueBits,
		int refreshRate
	) {
		ByteBuffer glfwvidmode = malloc();

		width(glfwvidmode, width);
		height(glfwvidmode, height);
		redBits(glfwvidmode, redBits);
		greenBits(glfwvidmode, greenBits);
		blueBits(glfwvidmode, blueBits);
		refreshRate(glfwvidmode, refreshRate);

		return glfwvidmode;
	}

	public static void width(ByteBuffer glfwvidmode, int width) { glfwvidmode.putInt(glfwvidmode.position() + WIDTH, width); }
	public static void height(ByteBuffer glfwvidmode, int height) { glfwvidmode.putInt(glfwvidmode.position() + HEIGHT, height); }
	public static void redBits(ByteBuffer glfwvidmode, int redBits) { glfwvidmode.putInt(glfwvidmode.position() + REDBITS, redBits); }
	public static void greenBits(ByteBuffer glfwvidmode, int greenBits) { glfwvidmode.putInt(glfwvidmode.position() + GREENBITS, greenBits); }
	public static void blueBits(ByteBuffer glfwvidmode, int blueBits) { glfwvidmode.putInt(glfwvidmode.position() + BLUEBITS, blueBits); }
	public static void refreshRate(ByteBuffer glfwvidmode, int refreshRate) { glfwvidmode.putInt(glfwvidmode.position() + REFRESHRATE, refreshRate); }

	public static int width(ByteBuffer glfwvidmode) { return glfwvidmode.getInt(glfwvidmode.position() + WIDTH); }
	public static int height(ByteBuffer glfwvidmode) { return glfwvidmode.getInt(glfwvidmode.position() + HEIGHT); }
	public static int redBits(ByteBuffer glfwvidmode) { return glfwvidmode.getInt(glfwvidmode.position() + REDBITS); }
	public static int greenBits(ByteBuffer glfwvidmode) { return glfwvidmode.getInt(glfwvidmode.position() + GREENBITS); }
	public static int blueBits(ByteBuffer glfwvidmode) { return glfwvidmode.getInt(glfwvidmode.position() + BLUEBITS); }
	public static int refreshRate(ByteBuffer glfwvidmode) { return glfwvidmode.getInt(glfwvidmode.position() + REFRESHRATE); }

}