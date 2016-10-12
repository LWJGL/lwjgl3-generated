/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A glyph position.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code str} &ndash; position of the glyph in the input string</li>
 * <li>{@code x} &ndash; the x-coordinate of the logical glyph position</li>
 * <li>{@code minx} &ndash; the left bound of the glyph shape</li>
 * <li>{@code maxx} &ndash; the right bound of the glyph shape</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct NVGglyphPosition {
    char * str;
    float x;
    float minx;
    float maxx;
}</code></pre>
 */
public class NVGGlyphPosition extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STR,
		X,
		MINX,
		MAXX;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STR = layout.offsetof(0);
		X = layout.offsetof(1);
		MINX = layout.offsetof(2);
		MAXX = layout.offsetof(3);
	}

	NVGGlyphPosition(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NVGGlyphPosition} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NVGGlyphPosition(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code str} field. */
	public long str() { return nstr(address()); }
	/** Returns the value of the {@code x} field. */
	public float x() { return nx(address()); }
	/** Returns the value of the {@code minx} field. */
	public float minx() { return nminx(address()); }
	/** Returns the value of the {@code maxx} field. */
	public float maxx() { return nmaxx(address()); }

	// -----------------------------------

	/** Returns a new {@link NVGGlyphPosition} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NVGGlyphPosition malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NVGGlyphPosition} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NVGGlyphPosition calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NVGGlyphPosition} instance allocated with {@link BufferUtils}. */
	public static NVGGlyphPosition create() {
		return new NVGGlyphPosition(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NVGGlyphPosition} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NVGGlyphPosition create(long address) {
		return address == NULL ? null : new NVGGlyphPosition(address, null);
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NVGGlyphPosition.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NVGGlyphPosition} instance allocated on the thread-local {@link MemoryStack}. */
	public static NVGGlyphPosition mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NVGGlyphPosition} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NVGGlyphPosition callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NVGGlyphPosition} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NVGGlyphPosition mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NVGGlyphPosition} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NVGGlyphPosition callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #str}. */
	public static long nstr(long struct) { return memGetAddress(struct + NVGGlyphPosition.STR); }
	/** Unsafe version of {@link #x}. */
	public static float nx(long struct) { return memGetFloat(struct + NVGGlyphPosition.X); }
	/** Unsafe version of {@link #minx}. */
	public static float nminx(long struct) { return memGetFloat(struct + NVGGlyphPosition.MINX); }
	/** Unsafe version of {@link #maxx}. */
	public static float nmaxx(long struct) { return memGetFloat(struct + NVGGlyphPosition.MAXX); }

	// -----------------------------------

	/** An array of {@link NVGGlyphPosition} structs. */
	public static class Buffer extends StructBuffer<NVGGlyphPosition, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NVGGlyphPosition.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NVGGlyphPosition#SIZEOF}, and its mark will be undefined.
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
		protected NVGGlyphPosition newInstance(long address) {
			return new NVGGlyphPosition(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code str} field. */
		public long str() { return NVGGlyphPosition.nstr(address()); }
		/** Returns the value of the {@code x} field. */
		public float x() { return NVGGlyphPosition.nx(address()); }
		/** Returns the value of the {@code minx} field. */
		public float minx() { return NVGGlyphPosition.nminx(address()); }
		/** Returns the value of the {@code maxx} field. */
		public float maxx() { return NVGGlyphPosition.nmaxx(address()); }

	}

}