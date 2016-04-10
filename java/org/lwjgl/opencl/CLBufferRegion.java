/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Buffer region struct.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code origin} &ndash; the region offset, in bytes</li>
 * <li>{@code size} &ndash; the region size, in bytes</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct cl_buffer_region {
    size_t origin;
    size_t size;
}</code></pre>
 */
public class CLBufferRegion extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ORIGIN,
		SIZE;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ORIGIN = layout.offsetof(0);
		SIZE = layout.offsetof(1);
	}

	CLBufferRegion(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link CLBufferRegion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public CLBufferRegion(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code origin} field. */
	public long origin() { return norigin(address()); }
	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }

	/** Sets the specified value to the {@code origin} field. */
	public CLBufferRegion origin(long value) { norigin(address(), value); return this; }
	/** Sets the specified value to the {@code size} field. */
	public CLBufferRegion size(long value) { nsize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public CLBufferRegion set(
		long origin,
		long size
	) {
		origin(origin);
		size(size);

		return this;
	}

	/** Unsafe version of {@link #set(CLBufferRegion) set}. */
	public CLBufferRegion nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public CLBufferRegion set(CLBufferRegion src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link CLBufferRegion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static CLBufferRegion malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link CLBufferRegion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static CLBufferRegion calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link CLBufferRegion} instance allocated with {@link BufferUtils}. */
	public static CLBufferRegion create() {
		return new CLBufferRegion(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link CLBufferRegion} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static CLBufferRegion create(long address) {
		return address == NULL ? null : new CLBufferRegion(address, null);
	}

	/**
	 * Returns a new {@link CLBufferRegion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CLBufferRegion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CLBufferRegion.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link CLBufferRegion.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link CLBufferRegion} instance allocated on the thread-local {@link MemoryStack}. */
	public static CLBufferRegion mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link CLBufferRegion} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static CLBufferRegion callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link CLBufferRegion} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static CLBufferRegion mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link CLBufferRegion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static CLBufferRegion callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link CLBufferRegion.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link CLBufferRegion.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link CLBufferRegion.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CLBufferRegion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #origin}. */
	public static long norigin(long struct) { return memGetAddress(struct + CLBufferRegion.ORIGIN); }
	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetAddress(struct + CLBufferRegion.SIZE); }

	/** Unsafe version of {@link #origin(long) origin}. */
	public static void norigin(long struct, long value) { memPutAddress(struct + CLBufferRegion.ORIGIN, value); }
	/** Unsafe version of {@link #size(long) size}. */
	public static void nsize(long struct, long value) { memPutAddress(struct + CLBufferRegion.SIZE, value); }

	// -----------------------------------

	/** An array of {@link CLBufferRegion} structs. */
	public static final class Buffer extends StructBuffer<CLBufferRegion, Buffer> {

		/**
		 * Creates a new {@link CLBufferRegion.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link CLBufferRegion#SIZEOF}, and its mark will be undefined.
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
		protected CLBufferRegion newInstance(long address) {
			return new CLBufferRegion(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code origin} field. */
		public long origin() { return CLBufferRegion.norigin(address()); }
		/** Returns the value of the {@code size} field. */
		public long size() { return CLBufferRegion.nsize(address()); }

		/** Sets the specified value to the {@code origin} field. */
		public CLBufferRegion.Buffer origin(long value) { CLBufferRegion.norigin(address(), value); return this; }
		/** Sets the specified value to the {@code size} field. */
		public CLBufferRegion.Buffer size(long value) { CLBufferRegion.nsize(address(), value); return this; }

	}

}