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

/** A packed rectangle. */
public class STBRPRect extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ID,
		W,
		H,
		X,
		Y,
		WAS_PACKED;

	static {
		IntBuffer offsets = memAllocInt(6);

		SIZEOF = offsets(memAddress(offsets));

		ID = offsets.get(0);
		W = offsets.get(1);
		H = offsets.get(2);
		X = offsets.get(3);
		Y = offsets.get(4);
		WAS_PACKED = offsets.get(5);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	STBRPRect(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link STBRPRect} instance at the specified memory address. */
	public STBRPRect(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link STBRPRect} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBRPRect(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getId() { return ngetId(address()); }
	public int getW() { return ngetW(address()); }
	public int getH() { return ngetH(address()); }
	public int getX() { return ngetX(address()); }
	public int getY() { return ngetY(address()); }
	public int getWasPacked() { return ngetWasPacked(address()); }

	public STBRPRect setId(int id) { nsetId(address(), id); return this; }
	public STBRPRect setW(int w) { nsetW(address(), w); return this; }
	public STBRPRect setH(int h) { nsetH(address(), h); return this; }
	public STBRPRect setX(int x) { nsetX(address(), x); return this; }
	public STBRPRect setY(int y) { nsetY(address(), y); return this; }
	public STBRPRect setWasPacked(int was_packed) { nsetWasPacked(address(), was_packed); return this; }

	/** Initializes this struct with the specified values. */
	public STBRPRect set(
		int id,
		int w,
		int h,
		int x,
		int y,
		int was_packed
	) {
		setId(id);
		setW(w);
		setH(h);
		setX(x);
		setY(y);
		setWasPacked(was_packed);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public STBRPRect nset(long struct) {
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
	public STBRPRect set(STBRPRect src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public STBRPRect set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link STBRPRect} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBRPRect malloc() {
		return new STBRPRect(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBRPRect} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBRPRect calloc() {
		return new STBRPRect(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBRPRect} instance allocated with {@link BufferUtils}. */
	public static STBRPRect create() {
		return new STBRPRect(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link STBRPRect.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link STBRPRect.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link STBRPRect.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link STBRPRect.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static int ngetId(long struct) { return memGetInt(struct + ID); }
	public static int getId(ByteBuffer struct) { return ngetId(memAddress(struct)); }
	public static int ngetW(long struct) { return memGetShort(struct + W) & 0xFFFF; }
	public static int getW(ByteBuffer struct) { return ngetW(memAddress(struct)); }
	public static int ngetH(long struct) { return memGetShort(struct + H) & 0xFFFF; }
	public static int getH(ByteBuffer struct) { return ngetH(memAddress(struct)); }
	public static int ngetX(long struct) { return memGetShort(struct + X) & 0xFFFF; }
	public static int getX(ByteBuffer struct) { return ngetX(memAddress(struct)); }
	public static int ngetY(long struct) { return memGetShort(struct + Y) & 0xFFFF; }
	public static int getY(ByteBuffer struct) { return ngetY(memAddress(struct)); }
	public static int ngetWasPacked(long struct) { return memGetInt(struct + WAS_PACKED); }
	public static int getWasPacked(ByteBuffer struct) { return ngetWasPacked(memAddress(struct)); }

	public static void nsetId(long struct, int id) { memPutInt(struct + ID, id); }
	public static void setId(ByteBuffer struct, int id) { nsetId(memAddress(struct), id); }
	public static void nsetW(long struct, int w) { memPutShort(struct + W, (short)w); }
	public static void setW(ByteBuffer struct, int w) { nsetW(memAddress(struct), w); }
	public static void nsetH(long struct, int h) { memPutShort(struct + H, (short)h); }
	public static void setH(ByteBuffer struct, int h) { nsetH(memAddress(struct), h); }
	public static void nsetX(long struct, int x) { memPutShort(struct + X, (short)x); }
	public static void setX(ByteBuffer struct, int x) { nsetX(memAddress(struct), x); }
	public static void nsetY(long struct, int y) { memPutShort(struct + Y, (short)y); }
	public static void setY(ByteBuffer struct, int y) { nsetY(memAddress(struct), y); }
	public static void nsetWasPacked(long struct, int was_packed) { memPutInt(struct + WAS_PACKED, was_packed); }
	public static void setWasPacked(ByteBuffer struct, int was_packed) { nsetWasPacked(memAddress(struct), was_packed); }

	// -----------------------------------

	/** An array of {@link STBRPRect} structs. */
	public static final class Buffer extends StructBuffer<STBRPRect, Buffer> {

		/**
		 * Creates a new {@link STBRPRect.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBRPRect#SIZEOF}, and its mark will be undefined.
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
		protected STBRPRect newInstance(long address) {
			return new STBRPRect(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getId() { return ngetId(address()); }
		public int getW() { return ngetW(address()); }
		public int getH() { return ngetH(address()); }
		public int getX() { return ngetX(address()); }
		public int getY() { return ngetY(address()); }
		public int getWasPacked() { return ngetWasPacked(address()); }

		public STBRPRect.Buffer setId(int id) { nsetId(address(), id); return this; }
		public STBRPRect.Buffer setW(int w) { nsetW(address(), w); return this; }
		public STBRPRect.Buffer setH(int h) { nsetH(address(), h); return this; }
		public STBRPRect.Buffer setX(int x) { nsetX(address(), x); return this; }
		public STBRPRect.Buffer setY(int y) { nsetY(address(), y); return this; }
		public STBRPRect.Buffer setWasPacked(int was_packed) { nsetWasPacked(address(), was_packed); return this; }

	}

}