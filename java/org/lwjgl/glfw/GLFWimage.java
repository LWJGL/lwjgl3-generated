/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Image data. */
public final class GLFWimage implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		WIDTH,
		HEIGHT,
		PIXELS;

	static {
		IntBuffer offsets = memAllocInt(3);

		SIZEOF = offsets(memAddress(offsets));

		WIDTH = offsets.get(0);
		HEIGHT = offsets.get(1);
		PIXELS = offsets.get(2);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public GLFWimage() {
		this(malloc());
	}

	public GLFWimage(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public GLFWimage setWidth(int width) { width(struct, width); return this; }
	public GLFWimage setHeight(int height) { height(struct, height); return this; }
	public GLFWimage setPixels(long pixels) { pixels(struct, pixels); return this; }
	public GLFWimage setPixels(ByteBuffer pixels) { pixels(struct, pixels); return this; }

	public int getWidth() { return width(struct); }
	public int getHeight() { return height(struct); }
	public long getPixels() { return pixels(struct); }
	public ByteBuffer getPixels(int byteLen) { return pixels(struct, byteLen); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int width,
		int height,
		ByteBuffer pixels
	) {
		ByteBuffer glfwimage = malloc();

		width(glfwimage, width);
		height(glfwimage, height);
		pixels(glfwimage, pixels);

		return glfwimage;
	}

	public static void width(ByteBuffer glfwimage, int width) { glfwimage.putInt(glfwimage.position() + WIDTH, width); }
	public static void height(ByteBuffer glfwimage, int height) { glfwimage.putInt(glfwimage.position() + HEIGHT, height); }
	public static void pixels(ByteBuffer glfwimage, long pixels) { PointerBuffer.put(glfwimage, glfwimage.position() + PIXELS, pixels); }
	public static void pixels(ByteBuffer glfwimage, ByteBuffer pixels) { pixels(glfwimage, memAddressSafe(pixels)); }

	public static int width(ByteBuffer glfwimage) { return glfwimage.getInt(glfwimage.position() + WIDTH); }
	public static int height(ByteBuffer glfwimage) { return glfwimage.getInt(glfwimage.position() + HEIGHT); }
	public static long pixels(ByteBuffer glfwimage) { return PointerBuffer.get(glfwimage, glfwimage.position() + PIXELS); }
	public static ByteBuffer pixels(ByteBuffer glfwimage, int byteLen) { return memByteBuffer(pixels(glfwimage), byteLen); }

}