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
public class GLFWImage extends Struct {

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

	GLFWImage(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link GLFWImage} instance at the specified memory address. */
	public GLFWImage(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link GLFWImage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLFWImage(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getWidth() { return ngetWidth(address()); }
	public int getHeight() { return ngetHeight(address()); }
	public ByteBuffer getPixels(int byteLen) { return ngetPixels(address(), byteLen); }

	public GLFWImage setWidth(int width) { nsetWidth(address(), width); return this; }
	public GLFWImage setHeight(int height) { nsetHeight(address(), height); return this; }
	public GLFWImage setPixels(ByteBuffer pixels) { nsetPixels(address(), pixels); return this; }

	/** Initializes this struct with the specified values. */
	public GLFWImage set(
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
	public GLFWImage nset(long struct) {
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
	public GLFWImage set(GLFWImage src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public GLFWImage set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link GLFWImage} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static GLFWImage malloc() {
		return new GLFWImage(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLFWImage} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static GLFWImage calloc() {
		return new GLFWImage(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLFWImage} instance allocated with {@link BufferUtils}. */
	public static GLFWImage create() {
		return new GLFWImage(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWImage.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWImage.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWImage.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link GLFWImage.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
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

	/** An array of {@link GLFWImage} structs. */
	public static final class Buffer extends StructBuffer<GLFWImage, Buffer> {

		/**
		 * Creates a new {@link GLFWImage.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link GLFWImage#SIZEOF}, and its mark will be undefined.
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
		protected GLFWImage newInstance(long address) {
			return new GLFWImage(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getWidth() { return ngetWidth(address()); }
		public int getHeight() { return ngetHeight(address()); }
		public ByteBuffer getPixels(int byteLen) { return ngetPixels(address(), byteLen); }

		public GLFWImage.Buffer setWidth(int width) { nsetWidth(address(), width); return this; }
		public GLFWImage.Buffer setHeight(int height) { nsetHeight(address(), height); return this; }
		public GLFWImage.Buffer setPixels(ByteBuffer pixels) { nsetPixels(address(), pixels); return this; }

	}

}