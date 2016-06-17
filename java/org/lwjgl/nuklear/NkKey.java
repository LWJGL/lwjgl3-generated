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
 * <pre><code>struct nk_key {
    int down;
    unsigned int clicked;
}</code></pre>
 */
public class NkKey extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		DOWN,
		CLICKED;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		DOWN = layout.offsetof(0);
		CLICKED = layout.offsetof(1);
	}

	NkKey(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkKey} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkKey(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code down} field. */
	public int down() { return ndown(address()); }
	/** Returns the value of the {@code clicked} field. */
	public int clicked() { return nclicked(address()); }

	/** Sets the specified value to the {@code down} field. */
	public NkKey down(int value) { ndown(address(), value); return this; }
	/** Sets the specified value to the {@code clicked} field. */
	public NkKey clicked(int value) { nclicked(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkKey set(
		int down,
		int clicked
	) {
		down(down);
		clicked(clicked);

		return this;
	}

	/** Unsafe version of {@link #set(NkKey) set}. */
	public NkKey nset(long struct) {
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
	public NkKey set(NkKey src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkKey} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkKey malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkKey} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkKey calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkKey} instance allocated with {@link BufferUtils}. */
	public static NkKey create() {
		return new NkKey(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkKey} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkKey create(long address) {
		return address == NULL ? null : new NkKey(address, null);
	}

	/**
	 * Returns a new {@link NkKey.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkKey.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkKey.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkKey.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkKey} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkKey mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkKey} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkKey callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkKey} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkKey mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkKey} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkKey callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkKey.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkKey.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkKey.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkKey.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #down}. */
	public static int ndown(long struct) { return memGetInt(struct + NkKey.DOWN); }
	/** Unsafe version of {@link #clicked}. */
	public static int nclicked(long struct) { return memGetInt(struct + NkKey.CLICKED); }

	/** Unsafe version of {@link #down(int) down}. */
	public static void ndown(long struct, int value) { memPutInt(struct + NkKey.DOWN, value); }
	/** Unsafe version of {@link #clicked(int) clicked}. */
	public static void nclicked(long struct, int value) { memPutInt(struct + NkKey.CLICKED, value); }

	// -----------------------------------

	/** An array of {@link NkKey} structs. */
	public static final class Buffer extends StructBuffer<NkKey, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkKey.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkKey#SIZEOF}, and its mark will be undefined.
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
		protected NkKey newInstance(long address) {
			return new NkKey(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code down} field. */
		public int down() { return NkKey.ndown(address()); }
		/** Returns the value of the {@code clicked} field. */
		public int clicked() { return NkKey.nclicked(address()); }

		/** Sets the specified value to the {@code down} field. */
		public NkKey.Buffer down(int value) { NkKey.ndown(address(), value); return this; }
		/** Sets the specified value to the {@code clicked} field. */
		public NkKey.Buffer clicked(int value) { NkKey.nclicked(address(), value); return this; }

	}

}