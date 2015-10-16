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

/** Video mode. */
public class GLFWVidMode extends Struct {

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
		IntBuffer offsets = memAllocInt(6);

		SIZEOF = offsets(memAddress(offsets));

		WIDTH = offsets.get(0);
		HEIGHT = offsets.get(1);
		REDBITS = offsets.get(2);
		GREENBITS = offsets.get(3);
		BLUEBITS = offsets.get(4);
		REFRESHRATE = offsets.get(5);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	GLFWVidMode(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link GLFWVidMode} instance at the specified memory address. */
	public GLFWVidMode(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link GLFWVidMode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLFWVidMode(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getWidth() { return ngetWidth(address()); }
	public int getHeight() { return ngetHeight(address()); }
	public int getRedBits() { return ngetRedBits(address()); }
	public int getGreenBits() { return ngetGreenBits(address()); }
	public int getBlueBits() { return ngetBlueBits(address()); }
	public int getRefreshRate() { return ngetRefreshRate(address()); }

	// -----------------------------------

	/** Returns a new {@link GLFWVidMode} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static GLFWVidMode malloc() {
		return new GLFWVidMode(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLFWVidMode} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static GLFWVidMode calloc() {
		return new GLFWVidMode(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLFWVidMode} instance allocated with {@link BufferUtils}. */
	public static GLFWVidMode create() {
		return new GLFWVidMode(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWVidMode.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWVidMode.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWVidMode.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link GLFWVidMode.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static int ngetWidth(long struct) { return memGetInt(struct + WIDTH); }
	public static int getWidth(ByteBuffer struct) { return ngetWidth(memAddress(struct)); }
	public static int ngetHeight(long struct) { return memGetInt(struct + HEIGHT); }
	public static int getHeight(ByteBuffer struct) { return ngetHeight(memAddress(struct)); }
	public static int ngetRedBits(long struct) { return memGetInt(struct + REDBITS); }
	public static int getRedBits(ByteBuffer struct) { return ngetRedBits(memAddress(struct)); }
	public static int ngetGreenBits(long struct) { return memGetInt(struct + GREENBITS); }
	public static int getGreenBits(ByteBuffer struct) { return ngetGreenBits(memAddress(struct)); }
	public static int ngetBlueBits(long struct) { return memGetInt(struct + BLUEBITS); }
	public static int getBlueBits(ByteBuffer struct) { return ngetBlueBits(memAddress(struct)); }
	public static int ngetRefreshRate(long struct) { return memGetInt(struct + REFRESHRATE); }
	public static int getRefreshRate(ByteBuffer struct) { return ngetRefreshRate(memAddress(struct)); }

	// -----------------------------------

	/** An array of {@link GLFWVidMode} structs. */
	public static final class Buffer extends StructBuffer<GLFWVidMode, Buffer> {

		/**
		 * Creates a new {@link GLFWVidMode.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link GLFWVidMode#SIZEOF}, and its mark will be undefined.
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
		protected GLFWVidMode newInstance(long address) {
			return new GLFWVidMode(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getWidth() { return ngetWidth(address()); }
		public int getHeight() { return ngetHeight(address()); }
		public int getRedBits() { return ngetRedBits(address()); }
		public int getGreenBits() { return ngetGreenBits(address()); }
		public int getBlueBits() { return ngetBlueBits(address()); }
		public int getRefreshRate() { return ngetRefreshRate(address()); }

	}

}