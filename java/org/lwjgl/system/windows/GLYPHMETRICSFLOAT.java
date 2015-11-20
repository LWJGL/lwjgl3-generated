/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Contains information about the placement and orientation of a glyph in a character cell.
 * 
 * <h3>GLYPHMETRICSFLOAT members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>gmfBlackBoxX</td><td class="nw">FLOAT</td><td>specifies the width of the smallest rectangle (the glyph's black box) that completely encloses the glyph</td></tr>
 * <tr><td>gmfBlackBoxY</td><td class="nw">FLOAT</td><td>specifies the height of the smallest rectangle (the glyph's black box) that completely encloses the glyph</td></tr>
 * <tr><td>gmfptGlyphOrigin</td><td class="nw">{@link POINTFLOAT POINTFLOAT}</td><td>specifies the x and y coordinates of the upper-left corner of the smallest rectangle that completely encloses the glyph</td></tr>
 * <tr><td>gmfCellIncX</td><td class="nw">FLOAT</td><td>specifies the horizontal distance from the origin of the current character cell to the origin of the next character cell</td></tr>
 * <tr><td>gmfCellIncY</td><td class="nw">FLOAT</td><td>specifies the vertical distance from the origin of the current character cell to the origin of the next character cell</td></tr>
 * </table>
 */
public class GLYPHMETRICSFLOAT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		GMFBLACKBOXX,
		GMFBLACKBOXY,
		GMFPTGLYPHORIGIN,
		GMFCELLINCX,
		GMFCELLINCY;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(POINTFLOAT.SIZEOF, POINTFLOAT.__ALIGNMENT),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		GMFBLACKBOXX = layout.offsetof(0);
		GMFBLACKBOXY = layout.offsetof(1);
		GMFPTGLYPHORIGIN = layout.offsetof(2);
		GMFCELLINCX = layout.offsetof(3);
		GMFCELLINCY = layout.offsetof(4);
	}

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

	/** Returns the value of the {@code gmfBlackBoxX} field. */
	public float gmfBlackBoxX() { return ngmfBlackBoxX(address()); }
	/** Returns the value of the {@code gmfBlackBoxY} field. */
	public float gmfBlackBoxY() { return ngmfBlackBoxY(address()); }
	/** Returns a {@link POINTFLOAT} view of the {@code gmfptGlyphOrigin} field. */
	public POINTFLOAT gmfptGlyphOrigin() { return ngmfptGlyphOrigin(address()); }
	/** Returns the value of the {@code gmfCellIncX} field. */
	public float gmfCellIncX() { return ngmfCellIncX(address()); }
	/** Returns the value of the {@code gmfCellIncY} field. */
	public float gmfCellIncY() { return ngmfCellIncY(address()); }

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

	/**
	 * Create a {@link GLYPHMETRICSFLOAT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #gmfBlackBoxX}. */
	public static float ngmfBlackBoxX(long struct) { return memGetFloat(struct + GLYPHMETRICSFLOAT.GMFBLACKBOXX); }
	/** Unsafe version of {@link #gmfBlackBoxY}. */
	public static float ngmfBlackBoxY(long struct) { return memGetFloat(struct + GLYPHMETRICSFLOAT.GMFBLACKBOXY); }
	/** Unsafe version of {@link #gmfptGlyphOrigin}. */
	public static POINTFLOAT ngmfptGlyphOrigin(long struct) { return new POINTFLOAT(struct + GLYPHMETRICSFLOAT.GMFPTGLYPHORIGIN); }
	/** Unsafe version of {@link #gmfCellIncX}. */
	public static float ngmfCellIncX(long struct) { return memGetFloat(struct + GLYPHMETRICSFLOAT.GMFCELLINCX); }
	/** Unsafe version of {@link #gmfCellIncY}. */
	public static float ngmfCellIncY(long struct) { return memGetFloat(struct + GLYPHMETRICSFLOAT.GMFCELLINCY); }

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

		/** Returns the value of the {@code gmfBlackBoxX} field. */
		public float gmfBlackBoxX() { return ngmfBlackBoxX(address()); }
		/** Returns the value of the {@code gmfBlackBoxY} field. */
		public float gmfBlackBoxY() { return ngmfBlackBoxY(address()); }
		/** Returns a {@link POINTFLOAT} view of the {@code gmfptGlyphOrigin} field. */
		public POINTFLOAT gmfptGlyphOrigin() { return ngmfptGlyphOrigin(address()); }
		/** Returns the value of the {@code gmfCellIncX} field. */
		public float gmfCellIncX() { return ngmfCellIncX(address()); }
		/** Returns the value of the {@code gmfCellIncY} field. */
		public float gmfCellIncY() { return ngmfCellIncY(address()); }

	}

}