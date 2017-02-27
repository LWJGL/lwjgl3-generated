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
 * Memory obtained by calling {@link BGFX#bgfx_alloc alloc}, {@link BGFX#bgfx_copy copy}, or {@link BGFX#bgfx_make_ref make_ref}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code data} &ndash; pointer to allocated memory</li>
 * <li>{@code size} &ndash; size of {@code data}, in bytes</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct bgfx_memory_t {
    uint8_t * data;
    uint32_t size;
}</code></pre>
 */
public class BGFXMemory extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		DATA,
		SIZE;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		DATA = layout.offsetof(0);
		SIZE = layout.offsetof(1);
	}

	BGFXMemory(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link BGFXMemory} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public BGFXMemory(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
	public ByteBuffer data() { return ndata(address()); }
	/** Returns the value of the {@code size} field. */
	public int size() { return nsize(address()); }

	/** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
	public BGFXMemory data(ByteBuffer value) { ndata(address(), value); return this; }

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public BGFXMemory set(BGFXMemory src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link BGFXMemory} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static BGFXMemory malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link BGFXMemory} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static BGFXMemory calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link BGFXMemory} instance allocated with {@link BufferUtils}. */
	public static BGFXMemory create() {
		return new BGFXMemory(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link BGFXMemory} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static BGFXMemory create(long address) {
		return address == NULL ? null : new BGFXMemory(address, null);
	}

	/**
	 * Returns a new {@link BGFXMemory.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXMemory.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXMemory.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link BGFXMemory.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link BGFXMemory} instance allocated on the thread-local {@link MemoryStack}. */
	public static BGFXMemory mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link BGFXMemory} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static BGFXMemory callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link BGFXMemory} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static BGFXMemory mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link BGFXMemory} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static BGFXMemory callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link BGFXMemory.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link BGFXMemory.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link BGFXMemory.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXMemory.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #data() data}. */
	public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + BGFXMemory.DATA), nsize(struct)); }
	/** Unsafe version of {@link #size}. */
	public static int nsize(long struct) { return memGetInt(struct + BGFXMemory.SIZE); }

	/** Unsafe version of {@link #data(ByteBuffer) data}. */
	public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + BGFXMemory.DATA, memAddress(value)); nsize(struct, value.remaining()); }
	/** Sets the specified value to the {@code size} field of the specified {@code struct}. */
	public static void nsize(long struct, int value) { memPutInt(struct + BGFXMemory.SIZE, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		check(memGetAddress(struct + BGFXMemory.DATA));
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

	/** An array of {@link BGFXMemory} structs. */
	public static class Buffer extends StructBuffer<BGFXMemory, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link BGFXMemory.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link BGFXMemory#SIZEOF}, and its mark will be undefined.
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
		protected BGFXMemory newInstance(long address) {
			return new BGFXMemory(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
		public ByteBuffer data() { return BGFXMemory.ndata(address()); }
		/** Returns the value of the {@code size} field. */
		public int size() { return BGFXMemory.nsize(address()); }

		/** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
		public BGFXMemory.Buffer data(ByteBuffer value) { BGFXMemory.ndata(address(), value); return this; }

	}

}