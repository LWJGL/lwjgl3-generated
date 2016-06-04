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
 * <pre><code>struct nk_popup_buffer {
    nk_size begin;
    nk_size parent;
    nk_size last;
    nk_size end;
    int active;
}</code></pre>
 */
public class NkPopupBuffer extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		BEGIN,
		PARENT,
		LAST,
		END,
		ACTIVE;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		BEGIN = layout.offsetof(0);
		PARENT = layout.offsetof(1);
		LAST = layout.offsetof(2);
		END = layout.offsetof(3);
		ACTIVE = layout.offsetof(4);
	}

	NkPopupBuffer(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkPopupBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkPopupBuffer(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code begin} field. */
	public long begin() { return nbegin(address()); }
	/** Returns the value of the {@code parent} field. */
	public long parent() { return nparent(address()); }
	/** Returns the value of the {@code last} field. */
	public long last() { return nlast(address()); }
	/** Returns the value of the {@code end} field. */
	public long end() { return nend(address()); }
	/** Returns the value of the {@code active} field. */
	public int active() { return nactive(address()); }

	/** Sets the specified value to the {@code begin} field. */
	public NkPopupBuffer begin(long value) { nbegin(address(), value); return this; }
	/** Sets the specified value to the {@code parent} field. */
	public NkPopupBuffer parent(long value) { nparent(address(), value); return this; }
	/** Sets the specified value to the {@code last} field. */
	public NkPopupBuffer last(long value) { nlast(address(), value); return this; }
	/** Sets the specified value to the {@code end} field. */
	public NkPopupBuffer end(long value) { nend(address(), value); return this; }
	/** Sets the specified value to the {@code active} field. */
	public NkPopupBuffer active(int value) { nactive(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkPopupBuffer set(
		long begin,
		long parent,
		long last,
		long end,
		int active
	) {
		begin(begin);
		parent(parent);
		last(last);
		end(end);
		active(active);

		return this;
	}

	/** Unsafe version of {@link #set(NkPopupBuffer) set}. */
	public NkPopupBuffer nset(long struct) {
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
	public NkPopupBuffer set(NkPopupBuffer src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkPopupBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkPopupBuffer malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkPopupBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkPopupBuffer calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkPopupBuffer} instance allocated with {@link BufferUtils}. */
	public static NkPopupBuffer create() {
		return new NkPopupBuffer(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkPopupBuffer} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkPopupBuffer create(long address) {
		return address == NULL ? null : new NkPopupBuffer(address, null);
	}

	/**
	 * Returns a new {@link NkPopupBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkPopupBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkPopupBuffer.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkPopupBuffer.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkPopupBuffer} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkPopupBuffer mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkPopupBuffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkPopupBuffer callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkPopupBuffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkPopupBuffer mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkPopupBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkPopupBuffer callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkPopupBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkPopupBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkPopupBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkPopupBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #begin}. */
	public static long nbegin(long struct) { return memGetAddress(struct + NkPopupBuffer.BEGIN); }
	/** Unsafe version of {@link #parent}. */
	public static long nparent(long struct) { return memGetAddress(struct + NkPopupBuffer.PARENT); }
	/** Unsafe version of {@link #last}. */
	public static long nlast(long struct) { return memGetAddress(struct + NkPopupBuffer.LAST); }
	/** Unsafe version of {@link #end}. */
	public static long nend(long struct) { return memGetAddress(struct + NkPopupBuffer.END); }
	/** Unsafe version of {@link #active}. */
	public static int nactive(long struct) { return memGetInt(struct + NkPopupBuffer.ACTIVE); }

	/** Unsafe version of {@link #begin(long) begin}. */
	public static void nbegin(long struct, long value) { memPutAddress(struct + NkPopupBuffer.BEGIN, value); }
	/** Unsafe version of {@link #parent(long) parent}. */
	public static void nparent(long struct, long value) { memPutAddress(struct + NkPopupBuffer.PARENT, value); }
	/** Unsafe version of {@link #last(long) last}. */
	public static void nlast(long struct, long value) { memPutAddress(struct + NkPopupBuffer.LAST, value); }
	/** Unsafe version of {@link #end(long) end}. */
	public static void nend(long struct, long value) { memPutAddress(struct + NkPopupBuffer.END, value); }
	/** Unsafe version of {@link #active(int) active}. */
	public static void nactive(long struct, int value) { memPutInt(struct + NkPopupBuffer.ACTIVE, value); }

	// -----------------------------------

	/** An array of {@link NkPopupBuffer} structs. */
	public static final class Buffer extends StructBuffer<NkPopupBuffer, Buffer> {

		/**
		 * Creates a new {@link NkPopupBuffer.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkPopupBuffer#SIZEOF}, and its mark will be undefined.
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
		protected NkPopupBuffer newInstance(long address) {
			return new NkPopupBuffer(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code begin} field. */
		public long begin() { return NkPopupBuffer.nbegin(address()); }
		/** Returns the value of the {@code parent} field. */
		public long parent() { return NkPopupBuffer.nparent(address()); }
		/** Returns the value of the {@code last} field. */
		public long last() { return NkPopupBuffer.nlast(address()); }
		/** Returns the value of the {@code end} field. */
		public long end() { return NkPopupBuffer.nend(address()); }
		/** Returns the value of the {@code active} field. */
		public int active() { return NkPopupBuffer.nactive(address()); }

		/** Sets the specified value to the {@code begin} field. */
		public NkPopupBuffer.Buffer begin(long value) { NkPopupBuffer.nbegin(address(), value); return this; }
		/** Sets the specified value to the {@code parent} field. */
		public NkPopupBuffer.Buffer parent(long value) { NkPopupBuffer.nparent(address(), value); return this; }
		/** Sets the specified value to the {@code last} field. */
		public NkPopupBuffer.Buffer last(long value) { NkPopupBuffer.nlast(address(), value); return this; }
		/** Sets the specified value to the {@code end} field. */
		public NkPopupBuffer.Buffer end(long value) { NkPopupBuffer.nend(address(), value); return this; }
		/** Sets the specified value to the {@code active} field. */
		public NkPopupBuffer.Buffer active(int value) { NkPopupBuffer.nactive(address(), value); return this; }

	}

}