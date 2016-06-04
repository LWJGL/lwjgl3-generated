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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code len} &ndash; in codepoints/runes/glyphs</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_str {
    {@link NkBuffer struct nk_buffer} buffer;
    int len;
}</code></pre>
 */
public class NkStr extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		BUFFER,
		LEN;

	static {
		Layout layout = __struct(
			__member(NkBuffer.SIZEOF, NkBuffer.ALIGNOF),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		BUFFER = layout.offsetof(0);
		LEN = layout.offsetof(1);
	}

	NkStr(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkStr} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkStr(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkBuffer} view of the {@code buffer} field. */
	public NkBuffer buffer() { return nbuffer(address()); }
	/** Returns the value of the {@code len} field. */
	public int len() { return nlen(address()); }

	/** Copies the specified {@link NkBuffer} to the {@code buffer} field. */
	public NkStr buffer(NkBuffer value) { nbuffer(address(), value); return this; }
	/** Sets the specified value to the {@code len} field. */
	public NkStr len(int value) { nlen(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkStr set(
		NkBuffer buffer,
		int len
	) {
		buffer(buffer);
		len(len);

		return this;
	}

	/** Unsafe version of {@link #set(NkStr) set}. */
	public NkStr nset(long struct) {
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
	public NkStr set(NkStr src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkStr} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkStr malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkStr} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkStr calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkStr} instance allocated with {@link BufferUtils}. */
	public static NkStr create() {
		return new NkStr(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkStr} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkStr create(long address) {
		return address == NULL ? null : new NkStr(address, null);
	}

	/**
	 * Returns a new {@link NkStr.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStr.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStr.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkStr.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkStr} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkStr mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkStr} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkStr callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkStr} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStr mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStr} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStr callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStr.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStr.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStr.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStr.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #buffer}. */
	public static NkBuffer nbuffer(long struct) { return NkBuffer.create(struct + NkStr.BUFFER); }
	/** Unsafe version of {@link #len}. */
	public static int nlen(long struct) { return memGetInt(struct + NkStr.LEN); }

	/** Unsafe version of {@link #buffer(NkBuffer) buffer}. */
	public static void nbuffer(long struct, NkBuffer value) { memCopy(value.address(), struct + NkStr.BUFFER, NkBuffer.SIZEOF); }
	/** Unsafe version of {@link #len(int) len}. */
	public static void nlen(long struct, int value) { memPutInt(struct + NkStr.LEN, value); }

	// -----------------------------------

	/** An array of {@link NkStr} structs. */
	public static final class Buffer extends StructBuffer<NkStr, Buffer> {

		/**
		 * Creates a new {@link NkStr.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkStr#SIZEOF}, and its mark will be undefined.
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
		protected NkStr newInstance(long address) {
			return new NkStr(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkBuffer} view of the {@code buffer} field. */
		public NkBuffer buffer() { return NkStr.nbuffer(address()); }
		/** Returns the value of the {@code len} field. */
		public int len() { return NkStr.nlen(address()); }

		/** Copies the specified {@link NkBuffer} to the {@code buffer} field. */
		public NkStr.Buffer buffer(NkBuffer value) { NkStr.nbuffer(address(), value); return this; }
		/** Sets the specified value to the {@code len} field. */
		public NkStr.Buffer len(int value) { NkStr.nlen(address(), value); return this; }

	}

}