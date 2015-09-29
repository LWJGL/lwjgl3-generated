/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Packed character data, returned by {@link STBTruetype#stbtt_PackFontRange} */
public final class STBTTPackedchar extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X0,
		Y0,
		X1,
		Y1,
		XOFF,
		YOFF,
		XADVANCE,
		XOFF2,
		YOFF2;

	static {
		IntBuffer offsets = memAllocInt(9);

		SIZEOF = offsets(memAddress(offsets));

		X0 = offsets.get(0);
		Y0 = offsets.get(1);
		X1 = offsets.get(2);
		Y1 = offsets.get(3);
		XOFF = offsets.get(4);
		YOFF = offsets.get(5);
		XADVANCE = offsets.get(6);
		XOFF2 = offsets.get(7);
		YOFF2 = offsets.get(8);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	STBTTPackedchar(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link STBTTPackedchar} instance at the specified memory address. */
	public STBTTPackedchar(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link STBTTPackedchar} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBTTPackedchar(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getX0() { return ngetX0(address()); }
	public int getY0() { return ngetY0(address()); }
	public int getX1() { return ngetX1(address()); }
	public int getY1() { return ngetY1(address()); }
	public float getXoff() { return ngetXoff(address()); }
	public float getYoff() { return ngetYoff(address()); }
	public float getXadvance() { return ngetXadvance(address()); }
	public float getXoff2() { return ngetXoff2(address()); }
	public float getYoff2() { return ngetYoff2(address()); }

	public STBTTPackedchar setX0(int x0) { nsetX0(address(), x0); return this; }
	public STBTTPackedchar setY0(int y0) { nsetY0(address(), y0); return this; }
	public STBTTPackedchar setX1(int x1) { nsetX1(address(), x1); return this; }
	public STBTTPackedchar setY1(int y1) { nsetY1(address(), y1); return this; }
	public STBTTPackedchar setXoff(float xoff) { nsetXoff(address(), xoff); return this; }
	public STBTTPackedchar setYoff(float yoff) { nsetYoff(address(), yoff); return this; }
	public STBTTPackedchar setXadvance(float xadvance) { nsetXadvance(address(), xadvance); return this; }
	public STBTTPackedchar setXoff2(float xoff2) { nsetXoff2(address(), xoff2); return this; }
	public STBTTPackedchar setYoff2(float yoff2) { nsetYoff2(address(), yoff2); return this; }

	/** Initializes this struct with the specified values. */
	public STBTTPackedchar set(
		int x0,
		int y0,
		int x1,
		int y1,
		float xoff,
		float yoff,
		float xadvance,
		float xoff2,
		float yoff2
	) {
		setX0(x0);
		setY0(y0);
		setX1(x1);
		setY1(y1);
		setXoff(xoff);
		setYoff(yoff);
		setXadvance(xadvance);
		setXoff2(xoff2);
		setYoff2(yoff2);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public STBTTPackedchar nset(long struct) {
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
	public STBTTPackedchar set(STBTTPackedchar src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public STBTTPackedchar set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link STBTTPackedchar} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBTTPackedchar malloc() {
		return new STBTTPackedchar(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBTTPackedchar} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBTTPackedchar calloc() {
		return new STBTTPackedchar(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBTTPackedchar} instance allocated with {@link BufferUtils}. */
	public static STBTTPackedchar create() {
		return new STBTTPackedchar(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTPackedchar.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTPackedchar.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTPackedchar.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetX0(long struct) { return memGetShort(struct + X0) & 0xFFFF; }
	public static int getX0(ByteBuffer struct) { return ngetX0(memAddress(struct)); }
	public static int ngetY0(long struct) { return memGetShort(struct + Y0) & 0xFFFF; }
	public static int getY0(ByteBuffer struct) { return ngetY0(memAddress(struct)); }
	public static int ngetX1(long struct) { return memGetShort(struct + X1) & 0xFFFF; }
	public static int getX1(ByteBuffer struct) { return ngetX1(memAddress(struct)); }
	public static int ngetY1(long struct) { return memGetShort(struct + Y1) & 0xFFFF; }
	public static int getY1(ByteBuffer struct) { return ngetY1(memAddress(struct)); }
	public static float ngetXoff(long struct) { return memGetFloat(struct + XOFF); }
	public static float getXoff(ByteBuffer struct) { return ngetXoff(memAddress(struct)); }
	public static float ngetYoff(long struct) { return memGetFloat(struct + YOFF); }
	public static float getYoff(ByteBuffer struct) { return ngetYoff(memAddress(struct)); }
	public static float ngetXadvance(long struct) { return memGetFloat(struct + XADVANCE); }
	public static float getXadvance(ByteBuffer struct) { return ngetXadvance(memAddress(struct)); }
	public static float ngetXoff2(long struct) { return memGetFloat(struct + XOFF2); }
	public static float getXoff2(ByteBuffer struct) { return ngetXoff2(memAddress(struct)); }
	public static float ngetYoff2(long struct) { return memGetFloat(struct + YOFF2); }
	public static float getYoff2(ByteBuffer struct) { return ngetYoff2(memAddress(struct)); }

	public static void nsetX0(long struct, int x0) { memPutShort(struct + X0, (short)x0); }
	public static void setX0(ByteBuffer struct, int x0) { nsetX0(memAddress(struct), x0); }
	public static void nsetY0(long struct, int y0) { memPutShort(struct + Y0, (short)y0); }
	public static void setY0(ByteBuffer struct, int y0) { nsetY0(memAddress(struct), y0); }
	public static void nsetX1(long struct, int x1) { memPutShort(struct + X1, (short)x1); }
	public static void setX1(ByteBuffer struct, int x1) { nsetX1(memAddress(struct), x1); }
	public static void nsetY1(long struct, int y1) { memPutShort(struct + Y1, (short)y1); }
	public static void setY1(ByteBuffer struct, int y1) { nsetY1(memAddress(struct), y1); }
	public static void nsetXoff(long struct, float xoff) { memPutFloat(struct + XOFF, xoff); }
	public static void setXoff(ByteBuffer struct, float xoff) { nsetXoff(memAddress(struct), xoff); }
	public static void nsetYoff(long struct, float yoff) { memPutFloat(struct + YOFF, yoff); }
	public static void setYoff(ByteBuffer struct, float yoff) { nsetYoff(memAddress(struct), yoff); }
	public static void nsetXadvance(long struct, float xadvance) { memPutFloat(struct + XADVANCE, xadvance); }
	public static void setXadvance(ByteBuffer struct, float xadvance) { nsetXadvance(memAddress(struct), xadvance); }
	public static void nsetXoff2(long struct, float xoff2) { memPutFloat(struct + XOFF2, xoff2); }
	public static void setXoff2(ByteBuffer struct, float xoff2) { nsetXoff2(memAddress(struct), xoff2); }
	public static void nsetYoff2(long struct, float yoff2) { memPutFloat(struct + YOFF2, yoff2); }
	public static void setYoff2(ByteBuffer struct, float yoff2) { nsetYoff2(memAddress(struct), yoff2); }

	// -----------------------------------

	/** An array of {@link STBTTPackedchar} structs. */
	public static final class Buffer extends StructBuffer<STBTTPackedchar, Buffer> {

		/**
		 * Creates a new {@link STBTTPackedchar.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBTTPackedchar#SIZEOF}, and its mark will be undefined.
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
		protected STBTTPackedchar newInstance(long address) {
			return new STBTTPackedchar(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}