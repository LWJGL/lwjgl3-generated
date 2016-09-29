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
 * A text row.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code start} &ndash; pointer to the input text where the row starts</li>
 * <li>{@code end} &ndash; pointer to the input text where the row ends (one past the last character</li>
 * <li>{@code next} &ndash; pointer to the beginning of the next row</li>
 * <li>{@code width} &ndash; logical width of the row</li>
 * <li>{@code minx} &ndash; actual left bound of the row. Logical width and bounds can differ because of kerning and some parts over extending.</li>
 * <li>{@code maxx} &ndash; actual right bound of the row. Logical width and bounds can differ because of kerning and some parts over extending.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct NVGtextRow {
    char * start;
    char * end;
    char * next;
    float width;
    float minx;
    float maxx;
}</code></pre>
 */
public class NVGTextRow extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		START,
		END,
		NEXT,
		WIDTH,
		MINX,
		MAXX;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		START = layout.offsetof(0);
		END = layout.offsetof(1);
		NEXT = layout.offsetof(2);
		WIDTH = layout.offsetof(3);
		MINX = layout.offsetof(4);
		MAXX = layout.offsetof(5);
	}

	NVGTextRow(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NVGTextRow} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NVGTextRow(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code start} field. */
	public long start() { return nstart(address()); }
	/** Returns the value of the {@code end} field. */
	public long end() { return nend(address()); }
	/** Returns the value of the {@code next} field. */
	public long next() { return nnext(address()); }
	/** Returns the value of the {@code width} field. */
	public float width() { return nwidth(address()); }
	/** Returns the value of the {@code minx} field. */
	public float minx() { return nminx(address()); }
	/** Returns the value of the {@code maxx} field. */
	public float maxx() { return nmaxx(address()); }

	// -----------------------------------

	/** Returns a new {@link NVGTextRow} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NVGTextRow malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NVGTextRow} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NVGTextRow calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NVGTextRow} instance allocated with {@link BufferUtils}. */
	public static NVGTextRow create() {
		return new NVGTextRow(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NVGTextRow} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NVGTextRow create(long address) {
		return address == NULL ? null : new NVGTextRow(address, null);
	}

	/**
	 * Returns a new {@link NVGTextRow.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGTextRow.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGTextRow.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NVGTextRow.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NVGTextRow} instance allocated on the thread-local {@link MemoryStack}. */
	public static NVGTextRow mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NVGTextRow} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NVGTextRow callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NVGTextRow} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NVGTextRow mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NVGTextRow} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NVGTextRow callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NVGTextRow.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NVGTextRow.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NVGTextRow.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGTextRow.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #start}. */
	public static long nstart(long struct) { return memGetAddress(struct + NVGTextRow.START); }
	/** Unsafe version of {@link #end}. */
	public static long nend(long struct) { return memGetAddress(struct + NVGTextRow.END); }
	/** Unsafe version of {@link #next}. */
	public static long nnext(long struct) { return memGetAddress(struct + NVGTextRow.NEXT); }
	/** Unsafe version of {@link #width}. */
	public static float nwidth(long struct) { return memGetFloat(struct + NVGTextRow.WIDTH); }
	/** Unsafe version of {@link #minx}. */
	public static float nminx(long struct) { return memGetFloat(struct + NVGTextRow.MINX); }
	/** Unsafe version of {@link #maxx}. */
	public static float nmaxx(long struct) { return memGetFloat(struct + NVGTextRow.MAXX); }

	// -----------------------------------

	/** An array of {@link NVGTextRow} structs. */
	public static final class Buffer extends StructBuffer<NVGTextRow, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NVGTextRow.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NVGTextRow#SIZEOF}, and its mark will be undefined.
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
		protected NVGTextRow newInstance(long address) {
			return new NVGTextRow(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code start} field. */
		public long start() { return NVGTextRow.nstart(address()); }
		/** Returns the value of the {@code end} field. */
		public long end() { return NVGTextRow.nend(address()); }
		/** Returns the value of the {@code next} field. */
		public long next() { return NVGTextRow.nnext(address()); }
		/** Returns the value of the {@code width} field. */
		public float width() { return NVGTextRow.nwidth(address()); }
		/** Returns the value of the {@code minx} field. */
		public float minx() { return NVGTextRow.nminx(address()); }
		/** Returns the value of the {@code maxx} field. */
		public float maxx() { return NVGTextRow.nmaxx(address()); }

	}

}