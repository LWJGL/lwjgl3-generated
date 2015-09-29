/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Contains information about the placement and orientation of a glyph in a character cell. */
public final class GLYPHMETRICSFLOAT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		BLACKBOXX,
		BLOCKBOXY,
		GLYPHORIGIN,
		CELLINCX,
		CELLINCY;

	static {
		IntBuffer offsets = memAllocInt(5);

		SIZEOF = offsets(memAddress(offsets));

		BLACKBOXX = offsets.get(0);
		BLOCKBOXY = offsets.get(1);
		GLYPHORIGIN = offsets.get(2);
		CELLINCX = offsets.get(3);
		CELLINCY = offsets.get(4);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	GLYPHMETRICSFLOAT(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link GLYPHMETRICSFLOAT} instance at the specified memory address. */
	public GLYPHMETRICSFLOAT(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link GLYPHMETRICSFLOAT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLYPHMETRICSFLOAT(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public float getBlackBoxX() { return ngetBlackBoxX(address()); }
	public float getBlockBoxY() { return ngetBlockBoxY(address()); }
	public POINTFLOAT getGlyphOrigin() { return ngetGlyphOrigin(address()); }
	public float getGlyphOriginX() { return ngetGlyphOriginX(address()); }
	public float getGlyphOriginY() { return ngetGlyphOriginY(address()); }
	public float getCellIncX() { return ngetCellIncX(address()); }
	public float getCellIncY() { return ngetCellIncY(address()); }

	public GLYPHMETRICSFLOAT setBlackBoxX(float blackBoxX) { nsetBlackBoxX(address(), blackBoxX); return this; }
	public GLYPHMETRICSFLOAT setBlockBoxY(float blockBoxY) { nsetBlockBoxY(address(), blockBoxY); return this; }
	public GLYPHMETRICSFLOAT setGlyphOrigin(POINTFLOAT glyphOrigin) { nsetGlyphOrigin(address(), glyphOrigin); return this; }
	public GLYPHMETRICSFLOAT setGlyphOriginX(float x) { nsetGlyphOriginX(address(), x); return this; }
	public GLYPHMETRICSFLOAT setGlyphOriginY(float y) { nsetGlyphOriginY(address(), y); return this; }
	public GLYPHMETRICSFLOAT setCellIncX(float cellIncX) { nsetCellIncX(address(), cellIncX); return this; }
	public GLYPHMETRICSFLOAT setCellIncY(float cellIncY) { nsetCellIncY(address(), cellIncY); return this; }

	/** Initializes this struct with the specified values. */
	public GLYPHMETRICSFLOAT set(
		float blackBoxX,
		float blockBoxY,
		POINTFLOAT glyphOrigin,
		float cellIncX,
		float cellIncY
	) {
		setBlackBoxX(blackBoxX);
		setBlockBoxY(blockBoxY);
		setGlyphOrigin(glyphOrigin);
		setCellIncX(cellIncX);
		setCellIncY(cellIncY);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public GLYPHMETRICSFLOAT nset(long struct) {
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
	public GLYPHMETRICSFLOAT set(GLYPHMETRICSFLOAT src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public GLYPHMETRICSFLOAT set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link GLYPHMETRICSFLOAT} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static GLYPHMETRICSFLOAT malloc() {
		return new GLYPHMETRICSFLOAT(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLYPHMETRICSFLOAT} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static GLYPHMETRICSFLOAT calloc() {
		return new GLYPHMETRICSFLOAT(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLYPHMETRICSFLOAT} instance allocated with {@link BufferUtils}. */
	public static GLYPHMETRICSFLOAT create() {
		return new GLYPHMETRICSFLOAT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link GLYPHMETRICSFLOAT.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link GLYPHMETRICSFLOAT.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link GLYPHMETRICSFLOAT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static float ngetBlackBoxX(long struct) { return memGetFloat(struct + BLACKBOXX); }
	public static float getBlackBoxX(ByteBuffer struct) { return ngetBlackBoxX(memAddress(struct)); }
	public static float ngetBlockBoxY(long struct) { return memGetFloat(struct + BLOCKBOXY); }
	public static float getBlockBoxY(ByteBuffer struct) { return ngetBlockBoxY(memAddress(struct)); }
	public static POINTFLOAT ngetGlyphOrigin(long struct) { return POINTFLOAT.malloc().nset(struct + GLYPHORIGIN); }
	/** Returns a copy of the {@code glyphOrigin} {@link POINTFLOAT} struct. */
	public static POINTFLOAT getGlyphOrigin(ByteBuffer struct) { return ngetGlyphOrigin(memAddress(struct)); }
	public static float ngetGlyphOriginX(long struct) { return memGetFloat(struct + GLYPHORIGIN + POINTFLOAT.X); }
	public static float getGlyphOriginX(ByteBuffer struct) { return ngetGlyphOriginX(memAddress(struct)); }
	public static float ngetGlyphOriginY(long struct) { return memGetFloat(struct + GLYPHORIGIN + POINTFLOAT.Y); }
	public static float getGlyphOriginY(ByteBuffer struct) { return ngetGlyphOriginY(memAddress(struct)); }
	public static float ngetCellIncX(long struct) { return memGetFloat(struct + CELLINCX); }
	public static float getCellIncX(ByteBuffer struct) { return ngetCellIncX(memAddress(struct)); }
	public static float ngetCellIncY(long struct) { return memGetFloat(struct + CELLINCY); }
	public static float getCellIncY(ByteBuffer struct) { return ngetCellIncY(memAddress(struct)); }

	public static void nsetBlackBoxX(long struct, float blackBoxX) { memPutFloat(struct + BLACKBOXX, blackBoxX); }
	public static void setBlackBoxX(ByteBuffer struct, float blackBoxX) { nsetBlackBoxX(memAddress(struct), blackBoxX); }
	public static void nsetBlockBoxY(long struct, float blockBoxY) { memPutFloat(struct + BLOCKBOXY, blockBoxY); }
	public static void setBlockBoxY(ByteBuffer struct, float blockBoxY) { nsetBlockBoxY(memAddress(struct), blockBoxY); }
	public static void nsetGlyphOrigin(long struct, POINTFLOAT glyphOrigin) { memCopy(glyphOrigin.address(), struct + GLYPHORIGIN, POINTFLOAT.SIZEOF); }
	/** Copies the specified {@link POINTFLOAT} struct to the nested {@code glyphOrigin} struct. */
	public static void setGlyphOrigin(ByteBuffer struct, POINTFLOAT glyphOrigin) { nsetGlyphOrigin(memAddress(struct), glyphOrigin); }
	public static void nsetGlyphOriginX(long struct, float x) { memPutFloat(struct + GLYPHORIGIN + POINTFLOAT.X, x); }
	public static void setGlyphOriginX(ByteBuffer struct, float x) { nsetGlyphOriginX(memAddress(struct), x); }
	public static void nsetGlyphOriginY(long struct, float y) { memPutFloat(struct + GLYPHORIGIN + POINTFLOAT.Y, y); }
	public static void setGlyphOriginY(ByteBuffer struct, float y) { nsetGlyphOriginY(memAddress(struct), y); }
	public static void nsetCellIncX(long struct, float cellIncX) { memPutFloat(struct + CELLINCX, cellIncX); }
	public static void setCellIncX(ByteBuffer struct, float cellIncX) { nsetCellIncX(memAddress(struct), cellIncX); }
	public static void nsetCellIncY(long struct, float cellIncY) { memPutFloat(struct + CELLINCY, cellIncY); }
	public static void setCellIncY(ByteBuffer struct, float cellIncY) { nsetCellIncY(memAddress(struct), cellIncY); }

	// -----------------------------------

	/** An array of {@link GLYPHMETRICSFLOAT} structs. */
	public static final class Buffer extends StructBuffer<GLYPHMETRICSFLOAT, Buffer> {

		/**
		 * Creates a new {@link GLYPHMETRICSFLOAT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link GLYPHMETRICSFLOAT#SIZEOF}, and its mark will be undefined.
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
		protected GLYPHMETRICSFLOAT newInstance(long address) {
			return new GLYPHMETRICSFLOAT(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}