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
import static org.lwjgl.system.MemoryStack.*;

/**
 * Contains information about the placement and orientation of a glyph in a character cell.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code gmfBlackBoxX} &ndash; specifies the width of the smallest rectangle (the glyph's black box) that completely encloses the glyph</li>
 * <li>{@code gmfBlackBoxY} &ndash; specifies the height of the smallest rectangle (the glyph's black box) that completely encloses the glyph</li>
 * <li>{@code gmfptGlyphOrigin} &ndash; specifies the x and y coordinates of the upper-left corner of the smallest rectangle that completely encloses the glyph</li>
 * <li>{@code gmfCellIncX} &ndash; specifies the horizontal distance from the origin of the current character cell to the origin of the next character cell</li>
 * <li>{@code gmfCellIncY} &ndash; specifies the vertical distance from the origin of the current character cell to the origin of the next character cell</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct GLYPHMETRICSFLOAT {
    FLOAT gmfBlackBoxX;
    FLOAT gmfBlackBoxY;
    {@link POINTFLOAT POINTFLOAT} gmfptGlyphOrigin;
    FLOAT gmfCellIncX;
    FLOAT gmfCellIncY;
}</code></pre>
 */
public class GLYPHMETRICSFLOAT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
			__member(POINTFLOAT.SIZEOF, POINTFLOAT.ALIGNOF),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		GMFBLACKBOXX = layout.offsetof(0);
		GMFBLACKBOXY = layout.offsetof(1);
		GMFPTGLYPHORIGIN = layout.offsetof(2);
		GMFCELLINCX = layout.offsetof(3);
		GMFCELLINCY = layout.offsetof(4);
	}

	GLYPHMETRICSFLOAT(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link GLYPHMETRICSFLOAT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLYPHMETRICSFLOAT(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
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

	/** Returns a new {@link GLYPHMETRICSFLOAT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static GLYPHMETRICSFLOAT malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLYPHMETRICSFLOAT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static GLYPHMETRICSFLOAT calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLYPHMETRICSFLOAT} instance allocated with {@link BufferUtils}. */
	public static GLYPHMETRICSFLOAT create() {
		return new GLYPHMETRICSFLOAT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link GLYPHMETRICSFLOAT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static GLYPHMETRICSFLOAT create(long address) {
		return address == NULL ? null : new GLYPHMETRICSFLOAT(address, null);
	}

	/**
	 * Returns a new {@link GLYPHMETRICSFLOAT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link GLYPHMETRICSFLOAT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link GLYPHMETRICSFLOAT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link GLYPHMETRICSFLOAT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link GLYPHMETRICSFLOAT} instance allocated on the thread-local {@link MemoryStack}. */
	public static GLYPHMETRICSFLOAT mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link GLYPHMETRICSFLOAT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static GLYPHMETRICSFLOAT callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link GLYPHMETRICSFLOAT} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static GLYPHMETRICSFLOAT mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link GLYPHMETRICSFLOAT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static GLYPHMETRICSFLOAT callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link GLYPHMETRICSFLOAT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link GLYPHMETRICSFLOAT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link GLYPHMETRICSFLOAT.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link GLYPHMETRICSFLOAT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #gmfBlackBoxX}. */
	public static float ngmfBlackBoxX(long struct) { return memGetFloat(struct + GLYPHMETRICSFLOAT.GMFBLACKBOXX); }
	/** Unsafe version of {@link #gmfBlackBoxY}. */
	public static float ngmfBlackBoxY(long struct) { return memGetFloat(struct + GLYPHMETRICSFLOAT.GMFBLACKBOXY); }
	/** Unsafe version of {@link #gmfptGlyphOrigin}. */
	public static POINTFLOAT ngmfptGlyphOrigin(long struct) { return POINTFLOAT.create(struct + GLYPHMETRICSFLOAT.GMFPTGLYPHORIGIN); }
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
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected GLYPHMETRICSFLOAT newInstance(long address) {
			return new GLYPHMETRICSFLOAT(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code gmfBlackBoxX} field. */
		public float gmfBlackBoxX() { return GLYPHMETRICSFLOAT.ngmfBlackBoxX(address()); }
		/** Returns the value of the {@code gmfBlackBoxY} field. */
		public float gmfBlackBoxY() { return GLYPHMETRICSFLOAT.ngmfBlackBoxY(address()); }
		/** Returns a {@link POINTFLOAT} view of the {@code gmfptGlyphOrigin} field. */
		public POINTFLOAT gmfptGlyphOrigin() { return GLYPHMETRICSFLOAT.ngmfptGlyphOrigin(address()); }
		/** Returns the value of the {@code gmfCellIncX} field. */
		public float gmfCellIncX() { return GLYPHMETRICSFLOAT.ngmfCellIncX(address()); }
		/** Returns the value of the {@code gmfCellIncY} field. */
		public float gmfCellIncY() { return GLYPHMETRICSFLOAT.ngmfCellIncY(address()); }

	}

}