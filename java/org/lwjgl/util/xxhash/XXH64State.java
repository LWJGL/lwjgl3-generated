/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.xxhash;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * 64-bit XXH state for stack allocation. Unstable API.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct XXH64_state_t {
    long long total_len;
    long long seed;
    long long v1;
    long long v2;
    long long v3;
    long long v4;
    long long[4] mem64;
    unsigned memsize;
}</code></pre>
 */
public class XXH64State extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		TOTAL_LEN,
		SEED,
		V1,
		V2,
		V3,
		V4,
		MEM64,
		MEMSIZE;

	static {
		Layout layout = __struct(
			__member(8),
			__member(8),
			__member(8),
			__member(8),
			__member(8),
			__member(8),
			__array(8, 4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		TOTAL_LEN = layout.offsetof(0);
		SEED = layout.offsetof(1);
		V1 = layout.offsetof(2);
		V2 = layout.offsetof(3);
		V3 = layout.offsetof(4);
		V4 = layout.offsetof(5);
		MEM64 = layout.offsetof(6);
		MEMSIZE = layout.offsetof(7);
	}

	XXH64State(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link XXH64State} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public XXH64State(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code total_len} field. */
	public long total_len() { return ntotal_len(address()); }
	/** Returns the value of the {@code seed} field. */
	public long seed() { return nseed(address()); }
	/** Returns the value of the {@code v1} field. */
	public long v1() { return nv1(address()); }
	/** Returns the value of the {@code v2} field. */
	public long v2() { return nv2(address()); }
	/** Returns the value of the {@code v3} field. */
	public long v3() { return nv3(address()); }
	/** Returns the value of the {@code v4} field. */
	public long v4() { return nv4(address()); }
	/** Returns a {@link LongBuffer} view of the {@code mem64} field. */
	public LongBuffer mem64() { return nmem64(address()); }
	/** Returns the value at the specified index of the {@code mem64} field. */
	public long mem64(int index) { return nmem64(address(), index); }
	/** Returns the value of the {@code memsize} field. */
	public int memsize() { return nmemsize(address()); }

	/** Sets the specified value to the {@code total_len} field. */
	public XXH64State total_len(long value) { ntotal_len(address(), value); return this; }
	/** Sets the specified value to the {@code seed} field. */
	public XXH64State seed(long value) { nseed(address(), value); return this; }
	/** Sets the specified value to the {@code v1} field. */
	public XXH64State v1(long value) { nv1(address(), value); return this; }
	/** Sets the specified value to the {@code v2} field. */
	public XXH64State v2(long value) { nv2(address(), value); return this; }
	/** Sets the specified value to the {@code v3} field. */
	public XXH64State v3(long value) { nv3(address(), value); return this; }
	/** Sets the specified value to the {@code v4} field. */
	public XXH64State v4(long value) { nv4(address(), value); return this; }
	/** Copies the specified {@link LongBuffer} to the {@code mem64} field. */
	public XXH64State mem64(LongBuffer value) { nmem64(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code mem64} field. */
	public XXH64State mem64(int index, long value) { nmem64(address(), index, value); return this; }
	/** Sets the specified value to the {@code memsize} field. */
	public XXH64State memsize(int value) { nmemsize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public XXH64State set(
		long total_len,
		long seed,
		long v1,
		long v2,
		long v3,
		long v4,
		LongBuffer mem64,
		int memsize
	) {
		total_len(total_len);
		seed(seed);
		v1(v1);
		v2(v2);
		v3(v3);
		v4(v4);
		mem64(mem64);
		memsize(memsize);

		return this;
	}

	/** Unsafe version of {@link #set(XXH64State) set}. */
	public XXH64State nset(long struct) {
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
	public XXH64State set(XXH64State src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link XXH64State} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static XXH64State malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link XXH64State} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static XXH64State calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link XXH64State} instance allocated with {@link BufferUtils}. */
	public static XXH64State create() {
		return new XXH64State(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link XXH64State} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static XXH64State create(long address) {
		return address == NULL ? null : new XXH64State(address, null);
	}

	/**
	 * Returns a new {@link XXH64State.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link XXH64State.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link XXH64State.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link XXH64State.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link XXH64State} instance allocated on the thread-local {@link MemoryStack}. */
	public static XXH64State mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link XXH64State} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static XXH64State callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link XXH64State} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static XXH64State mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link XXH64State} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static XXH64State callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link XXH64State.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link XXH64State.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link XXH64State.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link XXH64State.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #total_len}. */
	public static long ntotal_len(long struct) { return memGetLong(struct + XXH64State.TOTAL_LEN); }
	/** Unsafe version of {@link #seed}. */
	public static long nseed(long struct) { return memGetLong(struct + XXH64State.SEED); }
	/** Unsafe version of {@link #v1}. */
	public static long nv1(long struct) { return memGetLong(struct + XXH64State.V1); }
	/** Unsafe version of {@link #v2}. */
	public static long nv2(long struct) { return memGetLong(struct + XXH64State.V2); }
	/** Unsafe version of {@link #v3}. */
	public static long nv3(long struct) { return memGetLong(struct + XXH64State.V3); }
	/** Unsafe version of {@link #v4}. */
	public static long nv4(long struct) { return memGetLong(struct + XXH64State.V4); }
	/** Unsafe version of {@link #mem64}. */
	public static LongBuffer nmem64(long struct) {
		return memLongBuffer(struct + XXH64State.MEM64, 4);
	}
	/** Unsafe version of {@link #mem64(int) mem64}. */
	public static long nmem64(long struct, int index) { return memGetLong(struct + XXH64State.MEM64 + index * 8); }
	/** Unsafe version of {@link #memsize}. */
	public static int nmemsize(long struct) { return memGetInt(struct + XXH64State.MEMSIZE); }

	/** Unsafe version of {@link #total_len(long) total_len}. */
	public static void ntotal_len(long struct, long value) { memPutLong(struct + XXH64State.TOTAL_LEN, value); }
	/** Unsafe version of {@link #seed(long) seed}. */
	public static void nseed(long struct, long value) { memPutLong(struct + XXH64State.SEED, value); }
	/** Unsafe version of {@link #v1(long) v1}. */
	public static void nv1(long struct, long value) { memPutLong(struct + XXH64State.V1, value); }
	/** Unsafe version of {@link #v2(long) v2}. */
	public static void nv2(long struct, long value) { memPutLong(struct + XXH64State.V2, value); }
	/** Unsafe version of {@link #v3(long) v3}. */
	public static void nv3(long struct, long value) { memPutLong(struct + XXH64State.V3, value); }
	/** Unsafe version of {@link #v4(long) v4}. */
	public static void nv4(long struct, long value) { memPutLong(struct + XXH64State.V4, value); }
	/** Unsafe version of {@link #mem64(LongBuffer) mem64}. */
	public static void nmem64(long struct, LongBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 4);
		memCopy(memAddress(value), struct + XXH64State.MEM64, value.remaining() * 8);
	}
	/** Unsafe version of {@link #mem64(int, long) mem64}. */
	public static void nmem64(long struct, int index, long value) { memPutLong(struct + XXH64State.MEM64 + index * 8, value); }
	/** Unsafe version of {@link #memsize(int) memsize}. */
	public static void nmemsize(long struct, int value) { memPutInt(struct + XXH64State.MEMSIZE, value); }

	// -----------------------------------

	/** An array of {@link XXH64State} structs. */
	public static final class Buffer extends StructBuffer<XXH64State, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link XXH64State.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link XXH64State#SIZEOF}, and its mark will be undefined.
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
		protected XXH64State newInstance(long address) {
			return new XXH64State(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code total_len} field. */
		public long total_len() { return XXH64State.ntotal_len(address()); }
		/** Returns the value of the {@code seed} field. */
		public long seed() { return XXH64State.nseed(address()); }
		/** Returns the value of the {@code v1} field. */
		public long v1() { return XXH64State.nv1(address()); }
		/** Returns the value of the {@code v2} field. */
		public long v2() { return XXH64State.nv2(address()); }
		/** Returns the value of the {@code v3} field. */
		public long v3() { return XXH64State.nv3(address()); }
		/** Returns the value of the {@code v4} field. */
		public long v4() { return XXH64State.nv4(address()); }
		/** Returns a {@link LongBuffer} view of the {@code mem64} field. */
		public LongBuffer mem64() { return XXH64State.nmem64(address()); }
		/** Returns the value at the specified index of the {@code mem64} field. */
		public long mem64(int index) { return XXH64State.nmem64(address(), index); }
		/** Returns the value of the {@code memsize} field. */
		public int memsize() { return XXH64State.nmemsize(address()); }

		/** Sets the specified value to the {@code total_len} field. */
		public XXH64State.Buffer total_len(long value) { XXH64State.ntotal_len(address(), value); return this; }
		/** Sets the specified value to the {@code seed} field. */
		public XXH64State.Buffer seed(long value) { XXH64State.nseed(address(), value); return this; }
		/** Sets the specified value to the {@code v1} field. */
		public XXH64State.Buffer v1(long value) { XXH64State.nv1(address(), value); return this; }
		/** Sets the specified value to the {@code v2} field. */
		public XXH64State.Buffer v2(long value) { XXH64State.nv2(address(), value); return this; }
		/** Sets the specified value to the {@code v3} field. */
		public XXH64State.Buffer v3(long value) { XXH64State.nv3(address(), value); return this; }
		/** Sets the specified value to the {@code v4} field. */
		public XXH64State.Buffer v4(long value) { XXH64State.nv4(address(), value); return this; }
		/** Copies the specified {@link LongBuffer} to the {@code mem64} field. */
		public XXH64State.Buffer mem64(LongBuffer value) { XXH64State.nmem64(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code mem64} field. */
		public XXH64State.Buffer mem64(int index, long value) { XXH64State.nmem64(address(), index, value); return this; }
		/** Sets the specified value to the {@code memsize} field. */
		public XXH64State.Buffer memsize(int value) { XXH64State.nmemsize(address(), value); return this; }

	}

}