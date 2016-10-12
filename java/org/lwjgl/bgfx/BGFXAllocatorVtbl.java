/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Allocator virtual table
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code realloc} &ndash; the reallocation callback</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct bgfx_allocator_vtbl_t {
    realloc realloc;
}</code></pre>
 */
public class BGFXAllocatorVtbl extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		REALLOC;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		REALLOC = layout.offsetof(0);
	}

	BGFXAllocatorVtbl(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link BGFXAllocatorVtbl} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public BGFXAllocatorVtbl(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the {@code BGFXReallocCallback} instance at the {@code realloc} field. */
	public BGFXReallocCallback realloc() { return BGFXReallocCallback.create(nrealloc(address())); }

	/** Sets the address of the specified {@link BGFXReallocCallbackI} to the {@code realloc} field. */
	public BGFXAllocatorVtbl realloc(BGFXReallocCallbackI value) { nrealloc(address(), addressSafe(value)); return this; }

	/** Unsafe version of {@link #set(BGFXAllocatorVtbl) set}. */
	public BGFXAllocatorVtbl nset(long struct) {
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
	public BGFXAllocatorVtbl set(BGFXAllocatorVtbl src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link BGFXAllocatorVtbl} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static BGFXAllocatorVtbl malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link BGFXAllocatorVtbl} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static BGFXAllocatorVtbl calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link BGFXAllocatorVtbl} instance allocated with {@link BufferUtils}. */
	public static BGFXAllocatorVtbl create() {
		return new BGFXAllocatorVtbl(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link BGFXAllocatorVtbl} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static BGFXAllocatorVtbl create(long address) {
		return address == NULL ? null : new BGFXAllocatorVtbl(address, null);
	}

	/**
	 * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link BGFXAllocatorVtbl.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link BGFXAllocatorVtbl} instance allocated on the thread-local {@link MemoryStack}. */
	public static BGFXAllocatorVtbl mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link BGFXAllocatorVtbl} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static BGFXAllocatorVtbl callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link BGFXAllocatorVtbl} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static BGFXAllocatorVtbl mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link BGFXAllocatorVtbl} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static BGFXAllocatorVtbl callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #realloc}. */
	public static long nrealloc(long struct) { return memGetAddress(struct + BGFXAllocatorVtbl.REALLOC); }

	/** Unsafe version of {@link #realloc(BGFXReallocCallbackI) realloc}. */
	public static void nrealloc(long struct, long value) { memPutAddress(struct + BGFXAllocatorVtbl.REALLOC, checkPointer(value)); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + BGFXAllocatorVtbl.REALLOC));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link BGFXAllocatorVtbl} structs. */
	public static class Buffer extends StructBuffer<BGFXAllocatorVtbl, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link BGFXAllocatorVtbl.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link BGFXAllocatorVtbl#SIZEOF}, and its mark will be undefined.
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
		protected BGFXAllocatorVtbl newInstance(long address) {
			return new BGFXAllocatorVtbl(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the {@code BGFXReallocCallback} instance at the {@code realloc} field. */
		public BGFXReallocCallback realloc() { return BGFXReallocCallback.create(BGFXAllocatorVtbl.nrealloc(address())); }

		/** Sets the address of the specified {@link BGFXReallocCallbackI} to the {@code realloc} field. */
		public BGFXAllocatorVtbl.Buffer realloc(BGFXReallocCallbackI value) { BGFXAllocatorVtbl.nrealloc(address(), addressSafe(value)); return this; }

	}

}