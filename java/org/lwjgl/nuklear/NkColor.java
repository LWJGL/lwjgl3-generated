/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_color {
    nk_byte r;
    nk_byte g;
    nk_byte b;
    nk_byte a;
}</code></pre>
 */
public class NkColor extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		R,
		G,
		B,
		A;

	static {
		Layout layout = __struct(
			__member(1),
			__member(1),
			__member(1),
			__member(1)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		R = layout.offsetof(0);
		G = layout.offsetof(1);
		B = layout.offsetof(2);
		A = layout.offsetof(3);
	}

	NkColor(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkColor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkColor(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code r} field. */
	public byte r() { return nr(address()); }
	/** Returns the value of the {@code g} field. */
	public byte g() { return ng(address()); }
	/** Returns the value of the {@code b} field. */
	public byte b() { return nb(address()); }
	/** Returns the value of the {@code a} field. */
	public byte a() { return na(address()); }

	/** Sets the specified value to the {@code r} field. */
	public NkColor r(byte value) { nr(address(), value); return this; }
	/** Sets the specified value to the {@code g} field. */
	public NkColor g(byte value) { ng(address(), value); return this; }
	/** Sets the specified value to the {@code b} field. */
	public NkColor b(byte value) { nb(address(), value); return this; }
	/** Sets the specified value to the {@code a} field. */
	public NkColor a(byte value) { na(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkColor set(
		byte r,
		byte g,
		byte b,
		byte a
	) {
		r(r);
		g(g);
		b(b);
		a(a);

		return this;
	}

	/** Unsafe version of {@link #set(NkColor) set}. */
	public NkColor nset(long struct) {
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
	public NkColor set(NkColor src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkColor} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkColor malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkColor} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkColor calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkColor} instance allocated with {@link BufferUtils}. */
	public static NkColor create() {
		return new NkColor(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkColor} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkColor create(long address) {
		return address == NULL ? null : new NkColor(address, null);
	}

	/**
	 * Returns a new {@link NkColor.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkColor.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkColor.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkColor.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkColor} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkColor mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkColor} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkColor callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkColor} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkColor mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkColor} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkColor callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkColor.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkColor.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkColor.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkColor.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #r}. */
	public static byte nr(long struct) { return memGetByte(struct + NkColor.R); }
	/** Unsafe version of {@link #g}. */
	public static byte ng(long struct) { return memGetByte(struct + NkColor.G); }
	/** Unsafe version of {@link #b}. */
	public static byte nb(long struct) { return memGetByte(struct + NkColor.B); }
	/** Unsafe version of {@link #a}. */
	public static byte na(long struct) { return memGetByte(struct + NkColor.A); }

	/** Unsafe version of {@link #r(byte) r}. */
	public static void nr(long struct, byte value) { memPutByte(struct + NkColor.R, value); }
	/** Unsafe version of {@link #g(byte) g}. */
	public static void ng(long struct, byte value) { memPutByte(struct + NkColor.G, value); }
	/** Unsafe version of {@link #b(byte) b}. */
	public static void nb(long struct, byte value) { memPutByte(struct + NkColor.B, value); }
	/** Unsafe version of {@link #a(byte) a}. */
	public static void na(long struct, byte value) { memPutByte(struct + NkColor.A, value); }

	// -----------------------------------

	/** An array of {@link NkColor} structs. */
	public static class Buffer extends StructBuffer<NkColor, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkColor.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkColor#SIZEOF}, and its mark will be undefined.
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
		protected NkColor newInstance(long address) {
			return new NkColor(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code r} field. */
		public byte r() { return NkColor.nr(address()); }
		/** Returns the value of the {@code g} field. */
		public byte g() { return NkColor.ng(address()); }
		/** Returns the value of the {@code b} field. */
		public byte b() { return NkColor.nb(address()); }
		/** Returns the value of the {@code a} field. */
		public byte a() { return NkColor.na(address()); }

		/** Sets the specified value to the {@code r} field. */
		public NkColor.Buffer r(byte value) { NkColor.nr(address(), value); return this; }
		/** Sets the specified value to the {@code g} field. */
		public NkColor.Buffer g(byte value) { NkColor.ng(address(), value); return this; }
		/** Sets the specified value to the {@code b} field. */
		public NkColor.Buffer b(byte value) { NkColor.nb(address(), value); return this; }
		/** Sets the specified value to the {@code a} field. */
		public NkColor.Buffer a(byte value) { NkColor.na(address(), value); return this; }

	}

}