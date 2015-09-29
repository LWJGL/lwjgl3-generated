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

/** Vertex data. */
public final class STBTTVertex extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		CX,
		CY,
		TYPE;

	static {
		IntBuffer offsets = memAllocInt(5);

		SIZEOF = offsets(memAddress(offsets));

		X = offsets.get(0);
		Y = offsets.get(1);
		CX = offsets.get(2);
		CY = offsets.get(3);
		TYPE = offsets.get(4);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	STBTTVertex(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link STBTTVertex} instance at the specified memory address. */
	public STBTTVertex(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link STBTTVertex} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBTTVertex(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getX() { return ngetX(address()); }
	public int getY() { return ngetY(address()); }
	public int getCx() { return ngetCx(address()); }
	public int getCy() { return ngetCy(address()); }
	public int getType() { return ngetType(address()); }

	public STBTTVertex setX(int x) { nsetX(address(), x); return this; }
	public STBTTVertex setY(int y) { nsetY(address(), y); return this; }
	public STBTTVertex setCx(int cx) { nsetCx(address(), cx); return this; }
	public STBTTVertex setCy(int cy) { nsetCy(address(), cy); return this; }
	public STBTTVertex setType(int type) { nsetType(address(), type); return this; }

	/** Initializes this struct with the specified values. */
	public STBTTVertex set(
		int x,
		int y,
		int cx,
		int cy,
		int type
	) {
		setX(x);
		setY(y);
		setCx(cx);
		setCy(cy);
		setType(type);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public STBTTVertex nset(long struct) {
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
	public STBTTVertex set(STBTTVertex src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public STBTTVertex set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link STBTTVertex} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBTTVertex malloc() {
		return new STBTTVertex(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBTTVertex} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBTTVertex calloc() {
		return new STBTTVertex(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBTTVertex} instance allocated with {@link BufferUtils}. */
	public static STBTTVertex create() {
		return new STBTTVertex(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTVertex.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTVertex.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTVertex.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetX(long struct) { return memGetShort(struct + X); }
	public static int getX(ByteBuffer struct) { return ngetX(memAddress(struct)); }
	public static int ngetY(long struct) { return memGetShort(struct + Y); }
	public static int getY(ByteBuffer struct) { return ngetY(memAddress(struct)); }
	public static int ngetCx(long struct) { return memGetShort(struct + CX); }
	public static int getCx(ByteBuffer struct) { return ngetCx(memAddress(struct)); }
	public static int ngetCy(long struct) { return memGetShort(struct + CY); }
	public static int getCy(ByteBuffer struct) { return ngetCy(memAddress(struct)); }
	public static int ngetType(long struct) { return memGetByte(struct + TYPE) & 0xFF; }
	public static int getType(ByteBuffer struct) { return ngetType(memAddress(struct)); }

	public static void nsetX(long struct, int x) { memPutShort(struct + X, (short)x); }
	public static void setX(ByteBuffer struct, int x) { nsetX(memAddress(struct), x); }
	public static void nsetY(long struct, int y) { memPutShort(struct + Y, (short)y); }
	public static void setY(ByteBuffer struct, int y) { nsetY(memAddress(struct), y); }
	public static void nsetCx(long struct, int cx) { memPutShort(struct + CX, (short)cx); }
	public static void setCx(ByteBuffer struct, int cx) { nsetCx(memAddress(struct), cx); }
	public static void nsetCy(long struct, int cy) { memPutShort(struct + CY, (short)cy); }
	public static void setCy(ByteBuffer struct, int cy) { nsetCy(memAddress(struct), cy); }
	public static void nsetType(long struct, int type) { memPutByte(struct + TYPE, (byte)type); }
	public static void setType(ByteBuffer struct, int type) { nsetType(memAddress(struct), type); }

	// -----------------------------------

	/** An array of {@link STBTTVertex} structs. */
	public static final class Buffer extends StructBuffer<STBTTVertex, Buffer> {

		/**
		 * Creates a new {@link STBTTVertex.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBTTVertex#SIZEOF}, and its mark will be undefined.
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
		protected STBTTVertex newInstance(long address) {
			return new STBTTVertex(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}