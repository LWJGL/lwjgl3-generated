/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_memory {
    void * ptr;
    nk_size size;
}</code></pre>
 */
public class NkMemory extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		PTR,
		SIZE;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		PTR = layout.offsetof(0);
		SIZE = layout.offsetof(1);
	}

	NkMemory(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkMemory} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkMemory(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code ptr} field. */
	public ByteBuffer ptr() { return nptr(address()); }
	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }

	/** Sets the address of the specified {@link ByteBuffer} to the {@code ptr} field. */
	public NkMemory ptr(ByteBuffer value) { nptr(address(), value); return this; }
	/** Sets the specified value to the {@code size} field. */
	public NkMemory size(long value) { nsize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkMemory set(
		ByteBuffer ptr,
		long size
	) {
		ptr(ptr);
		size(size);

		return this;
	}

	/** Unsafe version of {@link #set(NkMemory) set}. */
	public NkMemory nset(long struct) {
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
	public NkMemory set(NkMemory src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkMemory} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkMemory malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkMemory} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkMemory calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkMemory} instance allocated with {@link BufferUtils}. */
	public static NkMemory create() {
		return new NkMemory(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkMemory} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkMemory create(long address) {
		return address == NULL ? null : new NkMemory(address, null);
	}

	/**
	 * Returns a new {@link NkMemory.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkMemory.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkMemory.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkMemory.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkMemory} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkMemory mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkMemory} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkMemory callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkMemory} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkMemory mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkMemory} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkMemory callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkMemory.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkMemory.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkMemory.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkMemory.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #ptr() ptr}. */
	public static ByteBuffer nptr(long struct) { return memByteBuffer(memGetAddress(struct + NkMemory.PTR), (int)nsize(struct)); }
	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetAddress(struct + NkMemory.SIZE); }

	/** Unsafe version of {@link #ptr(ByteBuffer) ptr}. */
	public static void nptr(long struct, ByteBuffer value) { memPutAddress(struct + NkMemory.PTR, memAddressSafe(value)); if ( value != null ) nsize(struct, value.remaining()); }
	/** Sets the specified value to the {@code size} field of the specified {@code struct}. */
	public static void nsize(long struct, long value) { memPutAddress(struct + NkMemory.SIZE, value); }

	// -----------------------------------

	/** An array of {@link NkMemory} structs. */
	public static final class Buffer extends StructBuffer<NkMemory, Buffer> {

		/**
		 * Creates a new {@link NkMemory.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkMemory#SIZEOF}, and its mark will be undefined.
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
		protected NkMemory newInstance(long address) {
			return new NkMemory(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code ptr} field. */
		public ByteBuffer ptr() { return NkMemory.nptr(address()); }
		/** Returns the value of the {@code size} field. */
		public long size() { return NkMemory.nsize(address()); }

		/** Sets the address of the specified {@link ByteBuffer} to the {@code ptr} field. */
		public NkMemory.Buffer ptr(ByteBuffer value) { NkMemory.nptr(address(), value); return this; }
		/** Sets the specified value to the {@code size} field. */
		public NkMemory.Buffer size(long value) { NkMemory.nsize(address(), value); return this; }

	}

}