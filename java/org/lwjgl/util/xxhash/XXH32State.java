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
 * 32-bit XXH state for stack allocation. Unstable API.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct XXH32_state_t {
    long long total_len;
    unsigned seed;
    unsigned v1;
    unsigned v2;
    unsigned v3;
    unsigned v4;
    unsigned[4] mem32;
    unsigned memsize;
}</code></pre>
 */
public class XXH32State extends Struct implements NativeResource {

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
		MEM32,
		MEMSIZE;

	static {
		Layout layout = __struct(
			__member(8),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__array(4, 4),
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
		MEM32 = layout.offsetof(6);
		MEMSIZE = layout.offsetof(7);
	}

	XXH32State(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link XXH32State} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public XXH32State(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code total_len} field. */
	public long total_len() { return ntotal_len(address()); }
	/** Returns the value of the {@code seed} field. */
	public int seed() { return nseed(address()); }
	/** Returns the value of the {@code v1} field. */
	public int v1() { return nv1(address()); }
	/** Returns the value of the {@code v2} field. */
	public int v2() { return nv2(address()); }
	/** Returns the value of the {@code v3} field. */
	public int v3() { return nv3(address()); }
	/** Returns the value of the {@code v4} field. */
	public int v4() { return nv4(address()); }
	/** Returns a {@link IntBuffer} view of the {@code mem32} field. */
	public IntBuffer mem32() { return nmem32(address()); }
	/** Returns the value at the specified index of the {@code mem32} field. */
	public int mem32(int index) { return nmem32(address(), index); }
	/** Returns the value of the {@code memsize} field. */
	public int memsize() { return nmemsize(address()); }

	/** Sets the specified value to the {@code total_len} field. */
	public XXH32State total_len(long value) { ntotal_len(address(), value); return this; }
	/** Sets the specified value to the {@code seed} field. */
	public XXH32State seed(int value) { nseed(address(), value); return this; }
	/** Sets the specified value to the {@code v1} field. */
	public XXH32State v1(int value) { nv1(address(), value); return this; }
	/** Sets the specified value to the {@code v2} field. */
	public XXH32State v2(int value) { nv2(address(), value); return this; }
	/** Sets the specified value to the {@code v3} field. */
	public XXH32State v3(int value) { nv3(address(), value); return this; }
	/** Sets the specified value to the {@code v4} field. */
	public XXH32State v4(int value) { nv4(address(), value); return this; }
	/** Copies the specified {@link IntBuffer} to the {@code mem32} field. */
	public XXH32State mem32(IntBuffer value) { nmem32(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code mem32} field. */
	public XXH32State mem32(int index, int value) { nmem32(address(), index, value); return this; }
	/** Sets the specified value to the {@code memsize} field. */
	public XXH32State memsize(int value) { nmemsize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public XXH32State set(
		long total_len,
		int seed,
		int v1,
		int v2,
		int v3,
		int v4,
		IntBuffer mem32,
		int memsize
	) {
		total_len(total_len);
		seed(seed);
		v1(v1);
		v2(v2);
		v3(v3);
		v4(v4);
		mem32(mem32);
		memsize(memsize);

		return this;
	}

	/** Unsafe version of {@link #set(XXH32State) set}. */
	public XXH32State nset(long struct) {
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
	public XXH32State set(XXH32State src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link XXH32State} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static XXH32State malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link XXH32State} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static XXH32State calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link XXH32State} instance allocated with {@link BufferUtils}. */
	public static XXH32State create() {
		return new XXH32State(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link XXH32State} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static XXH32State create(long address) {
		return address == NULL ? null : new XXH32State(address, null);
	}

	/**
	 * Returns a new {@link XXH32State.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link XXH32State.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link XXH32State.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link XXH32State.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link XXH32State} instance allocated on the thread-local {@link MemoryStack}. */
	public static XXH32State mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link XXH32State} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static XXH32State callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link XXH32State} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static XXH32State mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link XXH32State} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static XXH32State callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link XXH32State.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link XXH32State.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link XXH32State.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link XXH32State.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #total_len}. */
	public static long ntotal_len(long struct) { return memGetLong(struct + XXH32State.TOTAL_LEN); }
	/** Unsafe version of {@link #seed}. */
	public static int nseed(long struct) { return memGetInt(struct + XXH32State.SEED); }
	/** Unsafe version of {@link #v1}. */
	public static int nv1(long struct) { return memGetInt(struct + XXH32State.V1); }
	/** Unsafe version of {@link #v2}. */
	public static int nv2(long struct) { return memGetInt(struct + XXH32State.V2); }
	/** Unsafe version of {@link #v3}. */
	public static int nv3(long struct) { return memGetInt(struct + XXH32State.V3); }
	/** Unsafe version of {@link #v4}. */
	public static int nv4(long struct) { return memGetInt(struct + XXH32State.V4); }
	/** Unsafe version of {@link #mem32}. */
	public static IntBuffer nmem32(long struct) {
		return memIntBuffer(struct + XXH32State.MEM32, 4);
	}
	/** Unsafe version of {@link #mem32(int) mem32}. */
	public static int nmem32(long struct, int index) { return memGetInt(struct + XXH32State.MEM32 + index * 4); }
	/** Unsafe version of {@link #memsize}. */
	public static int nmemsize(long struct) { return memGetInt(struct + XXH32State.MEMSIZE); }

	/** Unsafe version of {@link #total_len(long) total_len}. */
	public static void ntotal_len(long struct, long value) { memPutLong(struct + XXH32State.TOTAL_LEN, value); }
	/** Unsafe version of {@link #seed(int) seed}. */
	public static void nseed(long struct, int value) { memPutInt(struct + XXH32State.SEED, value); }
	/** Unsafe version of {@link #v1(int) v1}. */
	public static void nv1(long struct, int value) { memPutInt(struct + XXH32State.V1, value); }
	/** Unsafe version of {@link #v2(int) v2}. */
	public static void nv2(long struct, int value) { memPutInt(struct + XXH32State.V2, value); }
	/** Unsafe version of {@link #v3(int) v3}. */
	public static void nv3(long struct, int value) { memPutInt(struct + XXH32State.V3, value); }
	/** Unsafe version of {@link #v4(int) v4}. */
	public static void nv4(long struct, int value) { memPutInt(struct + XXH32State.V4, value); }
	/** Unsafe version of {@link #mem32(IntBuffer) mem32}. */
	public static void nmem32(long struct, IntBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 4);
		memCopy(memAddress(value), struct + XXH32State.MEM32, value.remaining() * 4);
	}
	/** Unsafe version of {@link #mem32(int, int) mem32}. */
	public static void nmem32(long struct, int index, int value) { memPutInt(struct + XXH32State.MEM32 + index * 4, value); }
	/** Unsafe version of {@link #memsize(int) memsize}. */
	public static void nmemsize(long struct, int value) { memPutInt(struct + XXH32State.MEMSIZE, value); }

	// -----------------------------------

	/** An array of {@link XXH32State} structs. */
	public static final class Buffer extends StructBuffer<XXH32State, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link XXH32State.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link XXH32State#SIZEOF}, and its mark will be undefined.
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
		protected XXH32State newInstance(long address) {
			return new XXH32State(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code total_len} field. */
		public long total_len() { return XXH32State.ntotal_len(address()); }
		/** Returns the value of the {@code seed} field. */
		public int seed() { return XXH32State.nseed(address()); }
		/** Returns the value of the {@code v1} field. */
		public int v1() { return XXH32State.nv1(address()); }
		/** Returns the value of the {@code v2} field. */
		public int v2() { return XXH32State.nv2(address()); }
		/** Returns the value of the {@code v3} field. */
		public int v3() { return XXH32State.nv3(address()); }
		/** Returns the value of the {@code v4} field. */
		public int v4() { return XXH32State.nv4(address()); }
		/** Returns a {@link IntBuffer} view of the {@code mem32} field. */
		public IntBuffer mem32() { return XXH32State.nmem32(address()); }
		/** Returns the value at the specified index of the {@code mem32} field. */
		public int mem32(int index) { return XXH32State.nmem32(address(), index); }
		/** Returns the value of the {@code memsize} field. */
		public int memsize() { return XXH32State.nmemsize(address()); }

		/** Sets the specified value to the {@code total_len} field. */
		public XXH32State.Buffer total_len(long value) { XXH32State.ntotal_len(address(), value); return this; }
		/** Sets the specified value to the {@code seed} field. */
		public XXH32State.Buffer seed(int value) { XXH32State.nseed(address(), value); return this; }
		/** Sets the specified value to the {@code v1} field. */
		public XXH32State.Buffer v1(int value) { XXH32State.nv1(address(), value); return this; }
		/** Sets the specified value to the {@code v2} field. */
		public XXH32State.Buffer v2(int value) { XXH32State.nv2(address(), value); return this; }
		/** Sets the specified value to the {@code v3} field. */
		public XXH32State.Buffer v3(int value) { XXH32State.nv3(address(), value); return this; }
		/** Sets the specified value to the {@code v4} field. */
		public XXH32State.Buffer v4(int value) { XXH32State.nv4(address(), value); return this; }
		/** Copies the specified {@link IntBuffer} to the {@code mem32} field. */
		public XXH32State.Buffer mem32(IntBuffer value) { XXH32State.nmem32(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code mem32} field. */
		public XXH32State.Buffer mem32(int index, int value) { XXH32State.nmem32(address(), index, value); return this; }
		/** Sets the specified value to the {@code memsize} field. */
		public XXH32State.Buffer memsize(int value) { XXH32State.nmemsize(address(), value); return this; }

	}

}