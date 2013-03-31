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
		ByteBuffer struct = malloc();

		widthSet(struct, width);
		heightSet(struct, height);
		redBitsSet(struct, redBits);
		blueBitsSet(struct, blueBits);
		greenBitsSet(struct, greenBits);

		return struct;
	}

	public static void widthSet(ByteBuffer struct, int width) { struct.putInt(struct.position() + WIDTH, width); }
	public static void heightSet(ByteBuffer struct, int height) { struct.putInt(struct.position() + HEIGHT, height); }
	public static void redBitsSet(ByteBuffer struct, int redBits) { struct.putInt(struct.position() + REDBITS, redBits); }
	public static void blueBitsSet(ByteBuffer struct, int blueBits) { struct.putInt(struct.position() + BLUEBITS, blueBits); }
	public static void greenBitsSet(ByteBuffer struct, int greenBits) { struct.putInt(struct.position() + GREENBITS, greenBits); }

	public static int widthGet(ByteBuffer struct) { return struct.getInt(struct.position() + WIDTH); }
	public static int heightGet(ByteBuffer struct) { return struct.getInt(struct.position() + HEIGHT); }
	public static int redBitsGet(ByteBuffer struct) { return struct.getInt(struct.position() + REDBITS); }
	public static int blueBitsGet(ByteBuffer struct) { return struct.getInt(struct.position() + BLUEBITS); }
	public static int greenBitsGet(ByteBuffer struct) { return struct.getInt(struct.position() + GREENBITS); }

}