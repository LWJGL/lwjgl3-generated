/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_pool {
    {@link NkAllocator struct nk_allocator} alloc;
    nk_allocation_type type;
    unsigned int page_count;
    nk_page * pages;
    nk_page_element * freelist;
    unsigned capacity;
    nk_size size;
    nk_size cap;
}</code></pre>
 */
class NkPool extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ALLOC,
		TYPE,
		PAGE_COUNT,
		PAGES,
		FREELIST,
		CAPACITY,
		SIZE,
		CAP;

	static {
		Layout layout = __struct(
			__member(NkAllocator.SIZEOF, NkAllocator.ALIGNOF),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ALLOC = layout.offsetof(0);
		TYPE = layout.offsetof(1);
		PAGE_COUNT = layout.offsetof(2);
		PAGES = layout.offsetof(3);
		FREELIST = layout.offsetof(4);
		CAPACITY = layout.offsetof(5);
		SIZE = layout.offsetof(6);
		CAP = layout.offsetof(7);
	}

	NkPool(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkPool} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	NkPool(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkAllocator} view of the {@code alloc} field. */
	public NkAllocator alloc() { return nalloc(address()); }
	/** Returns the value of the {@code type} field. */
	public int type() { return ntype(address()); }
	/** Returns the value of the {@code page_count} field. */
	public int page_count() { return npage_count(address()); }
	/** Returns the value of the {@code pages} field. */
	public long pages() { return npages(address()); }
	/** Returns the value of the {@code freelist} field. */
	public long freelist() { return nfreelist(address()); }
	/** Returns the value of the {@code capacity} field. */
	public int capacity() { return ncapacity(address()); }
	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }
	/** Returns the value of the {@code cap} field. */
	public long cap() { return ncap(address()); }

	// -----------------------------------

	/** Returns a new {@link NkPool} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkPool create(long address) {
		return address == NULL ? null : new NkPool(address, null);
	}

	/**
	 * Create a {@link NkPool.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #alloc}. */
	public static NkAllocator nalloc(long struct) { return NkAllocator.create(struct + NkPool.ALLOC); }
	/** Unsafe version of {@link #type}. */
	public static int ntype(long struct) { return memGetInt(struct + NkPool.TYPE); }
	/** Unsafe version of {@link #page_count}. */
	public static int npage_count(long struct) { return memGetInt(struct + NkPool.PAGE_COUNT); }
	/** Unsafe version of {@link #pages}. */
	public static long npages(long struct) { return memGetAddress(struct + NkPool.PAGES); }
	/** Unsafe version of {@link #freelist}. */
	public static long nfreelist(long struct) { return memGetAddress(struct + NkPool.FREELIST); }
	/** Unsafe version of {@link #capacity}. */
	public static int ncapacity(long struct) { return memGetInt(struct + NkPool.CAPACITY); }
	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetAddress(struct + NkPool.SIZE); }
	/** Unsafe version of {@link #cap}. */
	public static long ncap(long struct) { return memGetAddress(struct + NkPool.CAP); }

	// -----------------------------------

	/** An array of {@link NkPool} structs. */
	public static class Buffer extends StructBuffer<NkPool, Buffer> {

		/**
		 * Creates a new {@link NkPool.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkPool#SIZEOF}, and its mark will be undefined.
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
		protected NkPool newInstance(long address) {
			return new NkPool(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkAllocator} view of the {@code alloc} field. */
		public NkAllocator alloc() { return NkPool.nalloc(address()); }
		/** Returns the value of the {@code type} field. */
		public int type() { return NkPool.ntype(address()); }
		/** Returns the value of the {@code page_count} field. */
		public int page_count() { return NkPool.npage_count(address()); }
		/** Returns the value of the {@code pages} field. */
		public long pages() { return NkPool.npages(address()); }
		/** Returns the value of the {@code freelist} field. */
		public long freelist() { return NkPool.nfreelist(address()); }
		/** Returns the value of the {@code capacity} field. */
		public int capacity() { return NkPool.ncapacity(address()); }
		/** Returns the value of the {@code size} field. */
		public long size() { return NkPool.nsize(address()); }
		/** Returns the value of the {@code cap} field. */
		public long cap() { return NkPool.ncap(address()); }

	}

}