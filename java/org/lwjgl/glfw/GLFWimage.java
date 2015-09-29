/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Image data. */
public final class GLFWimage extends Struct {

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

	private static native int offsets(long buffer);

	GLFWimage(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link GLFWimage} instance at the specified memory address. */
	public GLFWimage(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link GLFWimage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLFWimage(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getWidth() { return ngetWidth(address()); }
	public int getHeight() { return ngetHeight(address()); }
	public ByteBuffer getPixels(int byteLen) { return ngetPixels(address(), byteLen); }

	public GLFWimage setWidth(int width) { nsetWidth(address(), width); return this; }
	public GLFWimage setHeight(int height) { nsetHeight(address(), height); return this; }
	public GLFWimage setPixels(ByteBuffer pixels) { nsetPixels(address(), pixels); return this; }

	/** Initializes this struct with the specified values. */
	public GLFWimage set(
		int width,
		int height,
		ByteBuffer pixels
	) {
		setWidth(width);
		setHeight(height);
		setPixels(pixels);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public GLFWimage nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public GLFWimage set(GLFWimage src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public GLFWimage set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link GLFWimage} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static GLFWimage malloc() {
		return new GLFWimage(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLFWimage} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static GLFWimage calloc() {
		return new GLFWimage(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLFWimage} instance allocated with {@link BufferUtils}. */
	public static GLFWimage create() {
		return new GLFWimage(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWimage.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWimage.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWimage.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetWidth(long struct) { return memGetInt(struct + WIDTH); }
	public static int getWidth(ByteBuffer struct) { return ngetWidth(memAddress(struct)); }
	public static int ngetHeight(long struct) { return memGetInt(struct + HEIGHT); }
	public static int getHeight(ByteBuffer struct) { return ngetHeight(memAddress(struct)); }
	public static long ngetPixels(long struct) { return memGetAddress(struct + PIXELS); }
	public static ByteBuffer ngetPixels(long struct, int byteLen) { return memByteBuffer(ngetPixels(struct), byteLen); }
	public static ByteBuffer getPixels(ByteBuffer struct, int byteLen) { return ngetPixels(memAddress(struct), byteLen); }

	public static void nsetWidth(long struct, int width) { memPutInt(struct + WIDTH, width); }
	public static void setWidth(ByteBuffer struct, int width) { nsetWidth(memAddress(struct), width); }
	public static void nsetHeight(long struct, int height) { memPutInt(struct + HEIGHT, height); }
	public static void setHeight(ByteBuffer struct, int height) { nsetHeight(memAddress(struct), height); }
	public static void nsetPixels(long struct, long pixels) { memPutAddress(struct + PIXELS, pixels); }
	public static void nsetPixels(long struct, ByteBuffer pixels) { nsetPixels(struct, memAddressSafe(pixels)); }
	public static void setPixels(ByteBuffer struct, ByteBuffer pixels) { nsetPixels(memAddress(struct), pixels); }

	// -----------------------------------

	/** An array of {@link GLFWimage} structs. */
	public static final class Buffer extends StructBuffer<GLFWimage, Buffer> {

		/**
		 * Creates a new {@link GLFWimage.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link GLFWimage#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected GLFWimage newInstance(long address) {
			return new GLFWimage(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}