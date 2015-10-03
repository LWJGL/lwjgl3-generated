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

/** Gamma ramp. */
public class GLFWGammaRamp extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		RED,
		GREEN,
		BLUE,
		SIZE;

	static {
		IntBuffer offsets = memAllocInt(4);

		SIZEOF = offsets(memAddress(offsets));

		RED = offsets.get(0);
		GREEN = offsets.get(1);
		BLUE = offsets.get(2);
		SIZE = offsets.get(3);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	GLFWGammaRamp(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link GLFWGammaRamp} instance at the specified memory address. */
	public GLFWGammaRamp(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link GLFWGammaRamp} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLFWGammaRamp(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public ByteBuffer getRed(int byteLen) { return ngetRed(address(), byteLen); }
	public ByteBuffer getGreen(int byteLen) { return ngetGreen(address(), byteLen); }
	public ByteBuffer getBlue(int byteLen) { return ngetBlue(address(), byteLen); }
	public int getSize() { return ngetSize(address()); }

	public GLFWGammaRamp setRed(ByteBuffer red) { nsetRed(address(), red); return this; }
	public GLFWGammaRamp setGreen(ByteBuffer green) { nsetGreen(address(), green); return this; }
	public GLFWGammaRamp setBlue(ByteBuffer blue) { nsetBlue(address(), blue); return this; }
	public GLFWGammaRamp setSize(int size) { nsetSize(address(), size); return this; }

	/** Initializes this struct with the specified values. */
	public GLFWGammaRamp set(
		ByteBuffer red,
		ByteBuffer green,
		ByteBuffer blue,
		int size
	) {
		setRed(red);
		setGreen(green);
		setBlue(blue);
		setSize(size);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public GLFWGammaRamp nset(long struct) {
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
	public GLFWGammaRamp set(GLFWGammaRamp src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public GLFWGammaRamp set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link GLFWGammaRamp} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static GLFWGammaRamp malloc() {
		return new GLFWGammaRamp(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLFWGammaRamp} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static GLFWGammaRamp calloc() {
		return new GLFWGammaRamp(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLFWGammaRamp} instance allocated with {@link BufferUtils}. */
	public static GLFWGammaRamp create() {
		return new GLFWGammaRamp(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWGammaRamp.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWGammaRamp.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWGammaRamp.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static long ngetRed(long struct) { return memGetAddress(struct + RED); }
	public static ByteBuffer ngetRed(long struct, int byteLen) { return memByteBuffer(ngetRed(struct), byteLen); }
	public static ByteBuffer getRed(ByteBuffer struct, int byteLen) { return ngetRed(memAddress(struct), byteLen); }
	public static long ngetGreen(long struct) { return memGetAddress(struct + GREEN); }
	public static ByteBuffer ngetGreen(long struct, int byteLen) { return memByteBuffer(ngetGreen(struct), byteLen); }
	public static ByteBuffer getGreen(ByteBuffer struct, int byteLen) { return ngetGreen(memAddress(struct), byteLen); }
	public static long ngetBlue(long struct) { return memGetAddress(struct + BLUE); }
	public static ByteBuffer ngetBlue(long struct, int byteLen) { return memByteBuffer(ngetBlue(struct), byteLen); }
	public static ByteBuffer getBlue(ByteBuffer struct, int byteLen) { return ngetBlue(memAddress(struct), byteLen); }
	public static int ngetSize(long struct) { return memGetInt(struct + SIZE); }
	public static int getSize(ByteBuffer struct) { return ngetSize(memAddress(struct)); }

	public static void nsetRed(long struct, long red) { memPutAddress(struct + RED, red); }
	public static void nsetRed(long struct, ByteBuffer red) { nsetRed(struct, memAddressSafe(red)); }
	public static void setRed(ByteBuffer struct, ByteBuffer red) { nsetRed(memAddress(struct), red); }
	public static void nsetGreen(long struct, long green) { memPutAddress(struct + GREEN, green); }
	public static void nsetGreen(long struct, ByteBuffer green) { nsetGreen(struct, memAddressSafe(green)); }
	public static void setGreen(ByteBuffer struct, ByteBuffer green) { nsetGreen(memAddress(struct), green); }
	public static void nsetBlue(long struct, long blue) { memPutAddress(struct + BLUE, blue); }
	public static void nsetBlue(long struct, ByteBuffer blue) { nsetBlue(struct, memAddressSafe(blue)); }
	public static void setBlue(ByteBuffer struct, ByteBuffer blue) { nsetBlue(memAddress(struct), blue); }
	public static void nsetSize(long struct, int size) { memPutInt(struct + SIZE, size); }
	public static void setSize(ByteBuffer struct, int size) { nsetSize(memAddress(struct), size); }

	// -----------------------------------

	/** An array of {@link GLFWGammaRamp} structs. */
	public static final class Buffer extends StructBuffer<GLFWGammaRamp, Buffer> {

		/**
		 * Creates a new {@link GLFWGammaRamp.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link GLFWGammaRamp#SIZEOF}, and its mark will be undefined.
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
		protected GLFWGammaRamp newInstance(long address) {
			return new GLFWGammaRamp(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public ByteBuffer getRed(int byteLen) { return ngetRed(address(), byteLen); }
		public ByteBuffer getGreen(int byteLen) { return ngetGreen(address(), byteLen); }
		public ByteBuffer getBlue(int byteLen) { return ngetBlue(address(), byteLen); }
		public int getSize() { return ngetSize(address()); }

		public GLFWGammaRamp.Buffer setRed(ByteBuffer red) { nsetRed(address(), red); return this; }
		public GLFWGammaRamp.Buffer setGreen(ByteBuffer green) { nsetGreen(address(), green); return this; }
		public GLFWGammaRamp.Buffer setBlue(ByteBuffer blue) { nsetBlue(address(), blue); return this; }
		public GLFWGammaRamp.Buffer setSize(int size) { nsetSize(address(), size); return this; }

	}

}