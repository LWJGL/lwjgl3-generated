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
public final class GLFWvidmode extends Struct {

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

	GLFWvidmode(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link GLFWvidmode} instance at the specified memory address. */
	public GLFWvidmode(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link GLFWvidmode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLFWvidmode(ByteBuffer container) {
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

	public GLFWvidmode setWidth(int width) { nsetWidth(address(), width); return this; }
	public GLFWvidmode setHeight(int height) { nsetHeight(address(), height); return this; }
	public GLFWvidmode setRedBits(int redBits) { nsetRedBits(address(), redBits); return this; }
	public GLFWvidmode setGreenBits(int greenBits) { nsetGreenBits(address(), greenBits); return this; }
	public GLFWvidmode setBlueBits(int blueBits) { nsetBlueBits(address(), blueBits); return this; }
	public GLFWvidmode setRefreshRate(int refreshRate) { nsetRefreshRate(address(), refreshRate); return this; }

	/** Initializes this struct with the specified values. */
	public GLFWvidmode set(
		int width,
		int height,
		int redBits,
		int greenBits,
		int blueBits,
		int refreshRate
	) {
		setWidth(width);
		setHeight(height);
		setRedBits(redBits);
		setGreenBits(greenBits);
		setBlueBits(blueBits);
		setRefreshRate(refreshRate);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public GLFWvidmode nset(long struct) {
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
	public GLFWvidmode set(GLFWvidmode src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public GLFWvidmode set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link GLFWvidmode} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static GLFWvidmode malloc() {
		return new GLFWvidmode(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLFWvidmode} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static GLFWvidmode calloc() {
		return new GLFWvidmode(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLFWvidmode} instance allocated with {@link BufferUtils}. */
	public static GLFWvidmode create() {
		return new GLFWvidmode(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWvidmode.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWvidmode.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWvidmode.Buffer} instance allocated with {@link BufferUtils}.
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
	public static int ngetRedBits(long struct) { return memGetInt(struct + REDBITS); }
	public static int getRedBits(ByteBuffer struct) { return ngetRedBits(memAddress(struct)); }
	public static int ngetGreenBits(long struct) { return memGetInt(struct + GREENBITS); }
	public static int getGreenBits(ByteBuffer struct) { return ngetGreenBits(memAddress(struct)); }
	public static int ngetBlueBits(long struct) { return memGetInt(struct + BLUEBITS); }
	public static int getBlueBits(ByteBuffer struct) { return ngetBlueBits(memAddress(struct)); }
	public static int ngetRefreshRate(long struct) { return memGetInt(struct + REFRESHRATE); }
	public static int getRefreshRate(ByteBuffer struct) { return ngetRefreshRate(memAddress(struct)); }

	public static void nsetWidth(long struct, int width) { memPutInt(struct + WIDTH, width); }
	public static void setWidth(ByteBuffer struct, int width) { nsetWidth(memAddress(struct), width); }
	public static void nsetHeight(long struct, int height) { memPutInt(struct + HEIGHT, height); }
	public static void setHeight(ByteBuffer struct, int height) { nsetHeight(memAddress(struct), height); }
	public static void nsetRedBits(long struct, int redBits) { memPutInt(struct + REDBITS, redBits); }
	public static void setRedBits(ByteBuffer struct, int redBits) { nsetRedBits(memAddress(struct), redBits); }
	public static void nsetGreenBits(long struct, int greenBits) { memPutInt(struct + GREENBITS, greenBits); }
	public static void setGreenBits(ByteBuffer struct, int greenBits) { nsetGreenBits(memAddress(struct), greenBits); }
	public static void nsetBlueBits(long struct, int blueBits) { memPutInt(struct + BLUEBITS, blueBits); }
	public static void setBlueBits(ByteBuffer struct, int blueBits) { nsetBlueBits(memAddress(struct), blueBits); }
	public static void nsetRefreshRate(long struct, int refreshRate) { memPutInt(struct + REFRESHRATE, refreshRate); }
	public static void setRefreshRate(ByteBuffer struct, int refreshRate) { nsetRefreshRate(memAddress(struct), refreshRate); }

	// -----------------------------------

	/** An array of {@link GLFWvidmode} structs. */
	public static final class Buffer extends StructBuffer<GLFWvidmode, Buffer> {

		/**
		 * Creates a new {@link GLFWvidmode.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link GLFWvidmode#SIZEOF}, and its mark will be undefined.
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
		protected GLFWvidmode newInstance(long address) {
			return new GLFWvidmode(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}