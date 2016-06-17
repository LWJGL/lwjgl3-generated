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
 * <pre><code>struct nk_keyboard {
    {@link NkKey struct nk_key}[25] keys;
    char[16] text;
    int text_len;
}</code></pre>
 */
public class NkKeyboard extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		KEYS,
		TEXT,
		TEXT_LEN;

	static {
		Layout layout = __struct(
			__array(NkKey.SIZEOF, NkKey.ALIGNOF, 25),
			__array(1, 16),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		KEYS = layout.offsetof(0);
		TEXT = layout.offsetof(1);
		TEXT_LEN = layout.offsetof(2);
	}

	NkKeyboard(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkKeyboard} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkKeyboard(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkKey}.Buffer view of the {@code keys} field. */
	public NkKey.Buffer keys() { return nkeys(address()); }
	/** Returns a {@link NkKey} view of the struct at the specified index of the {@code keys} field. */
	public NkKey keys(int index) { return nkeys(address(), index); }
	/** Returns a {@link ByteBuffer} view of the {@code text} field. */
	public ByteBuffer text() { return ntext(address()); }
	/** Returns the value at the specified index of the {@code text} field. */
	public byte text(int index) { return ntext(address(), index); }
	/** Returns the value of the {@code text_len} field. */
	public int text_len() { return ntext_len(address()); }

	/** Copies the specified {@link NkKey.Buffer} to the {@code keys} field. */
	public NkKeyboard keys(NkKey.Buffer value) { nkeys(address(), value); return this; }
	/** Copies the specified {@link NkKey} at the specified index of the {@code keys} field. */
	public NkKeyboard keys(int index, NkKey value) { nkeys(address(), index, value); return this; }
	/** Copies the specified {@link ByteBuffer} to the {@code text} field. */
	public NkKeyboard text(ByteBuffer value) { ntext(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code text} field. */
	public NkKeyboard text(int index, byte value) { ntext(address(), index, value); return this; }
	/** Sets the specified value to the {@code text_len} field. */
	public NkKeyboard text_len(int value) { ntext_len(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkKeyboard set(
		NkKey.Buffer keys,
		ByteBuffer text,
		int text_len
	) {
		keys(keys);
		text(text);
		text_len(text_len);

		return this;
	}

	/** Unsafe version of {@link #set(NkKeyboard) set}. */
	public NkKeyboard nset(long struct) {
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
	public NkKeyboard set(NkKeyboard src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkKeyboard} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkKeyboard malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkKeyboard} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkKeyboard calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkKeyboard} instance allocated with {@link BufferUtils}. */
	public static NkKeyboard create() {
		return new NkKeyboard(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkKeyboard} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkKeyboard create(long address) {
		return address == NULL ? null : new NkKeyboard(address, null);
	}

	/**
	 * Returns a new {@link NkKeyboard.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkKeyboard.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkKeyboard.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkKeyboard.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkKeyboard} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkKeyboard mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkKeyboard} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkKeyboard callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkKeyboard} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkKeyboard mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkKeyboard} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkKeyboard callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkKeyboard.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkKeyboard.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkKeyboard.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkKeyboard.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #keys}. */
	public static NkKey.Buffer nkeys(long struct) {
		return NkKey.create(struct + NkKeyboard.KEYS, 25);
	}
	/** Unsafe version of {@link #keys(int) keys}. */
	public static NkKey nkeys(long struct, int index) {
		return NkKey.create(struct + NkKeyboard.KEYS + index * NkKey.SIZEOF);
	}
	/** Unsafe version of {@link #text}. */
	public static ByteBuffer ntext(long struct) {
		return memByteBuffer(struct + NkKeyboard.TEXT, 16);
	}
	/** Unsafe version of {@link #text(int) text}. */
	public static byte ntext(long struct, int index) { return memGetByte(struct + NkKeyboard.TEXT + index * 1); }
	/** Unsafe version of {@link #text_len}. */
	public static int ntext_len(long struct) { return memGetInt(struct + NkKeyboard.TEXT_LEN); }

	/** Unsafe version of {@link #keys(NkKey.Buffer) keys}. */
	public static void nkeys(long struct, NkKey.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 25);
		memCopy(value.address(), struct + NkKeyboard.KEYS, value.remaining() * NkKey.SIZEOF);
	}
	/** Unsafe version of {@link #keys(int, NkKey) keys}. */
	public static void nkeys(long struct, int index, NkKey value) { memCopy(value.address(), struct + NkKeyboard.KEYS + index * NkKey.SIZEOF, NkKey.SIZEOF); }
	/** Unsafe version of {@link #text(ByteBuffer) text}. */
	public static void ntext(long struct, ByteBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 16);
		memCopy(memAddress(value), struct + NkKeyboard.TEXT, value.remaining() * 1);
	}
	/** Unsafe version of {@link #text(int, byte) text}. */
	public static void ntext(long struct, int index, byte value) { memPutByte(struct + NkKeyboard.TEXT + index * 1, value); }
	/** Unsafe version of {@link #text_len(int) text_len}. */
	public static void ntext_len(long struct, int value) { memPutInt(struct + NkKeyboard.TEXT_LEN, value); }

	// -----------------------------------

	/** An array of {@link NkKeyboard} structs. */
	public static final class Buffer extends StructBuffer<NkKeyboard, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkKeyboard.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkKeyboard#SIZEOF}, and its mark will be undefined.
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
		protected NkKeyboard newInstance(long address) {
			return new NkKeyboard(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkKey}.Buffer view of the {@code keys} field. */
		public NkKey.Buffer keys() { return NkKeyboard.nkeys(address()); }
		/** Returns a {@link NkKey} view of the struct at the specified index of the {@code keys} field. */
		public NkKey keys(int index) { return NkKeyboard.nkeys(address(), index); }
		/** Returns a {@link ByteBuffer} view of the {@code text} field. */
		public ByteBuffer text() { return NkKeyboard.ntext(address()); }
		/** Returns the value at the specified index of the {@code text} field. */
		public byte text(int index) { return NkKeyboard.ntext(address(), index); }
		/** Returns the value of the {@code text_len} field. */
		public int text_len() { return NkKeyboard.ntext_len(address()); }

		/** Copies the specified {@link NkKey.Buffer} to the {@code keys} field. */
		public NkKeyboard.Buffer keys(NkKey.Buffer value) { NkKeyboard.nkeys(address(), value); return this; }
		/** Copies the specified {@link NkKey} at the specified index of the {@code keys} field. */
		public NkKeyboard.Buffer keys(int index, NkKey value) { NkKeyboard.nkeys(address(), index, value); return this; }
		/** Copies the specified {@link ByteBuffer} to the {@code text} field. */
		public NkKeyboard.Buffer text(ByteBuffer value) { NkKeyboard.ntext(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code text} field. */
		public NkKeyboard.Buffer text(int index, byte value) { NkKeyboard.ntext(address(), index, value); return this; }
		/** Sets the specified value to the {@code text_len} field. */
		public NkKeyboard.Buffer text_len(int value) { NkKeyboard.ntext_len(address(), value); return this; }

	}

}