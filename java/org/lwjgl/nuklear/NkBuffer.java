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
 * <li>{@code marker} &ndash; buffer marker to free a buffer to a certain offset</li>
 * <li>{@code pool} &ndash; allocator callback for dynamic buffers</li>
 * <li>{@code type} &ndash; memory management type</li>
 * <li>{@code memory} &ndash; memory and size of the current memory block</li>
 * <li>{@code grow_factor} &ndash; growing factor for dynamic memory management</li>
 * <li>{@code allocated} &ndash; total amount of memory allocated</li>
 * <li>{@code needed} &ndash; totally consumed memory given that enough memory is present</li>
 * <li>{@code calls} &ndash; number of allocation calls</li>
 * <li>{@code size} &ndash; current size of the buffer</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_buffer {
    {@link NkBufferMarker struct nk_buffer_marker}[2] marker;
    {@link NkAllocator struct nk_allocator} pool;
    nk_allocation_type type;
    {@link NkMemory struct nk_memory} memory;
    float grow_factor;
    nk_size allocated;
    nk_size needed;
    nk_size calls;
    nk_size size;
}</code></pre>
 */
public class NkBuffer extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		MARKER,
		POOL,
		TYPE,
		MEMORY,
		GROW_FACTOR,
		ALLOCATED,
		NEEDED,
		CALLS,
		SIZE;

	static {
		Layout layout = __struct(
			__array(NkBufferMarker.SIZEOF, NkBufferMarker.ALIGNOF, 2),
			__member(NkAllocator.SIZEOF, NkAllocator.ALIGNOF),
			__member(4),
			__member(NkMemory.SIZEOF, NkMemory.ALIGNOF),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		MARKER = layout.offsetof(0);
		POOL = layout.offsetof(1);
		TYPE = layout.offsetof(2);
		MEMORY = layout.offsetof(3);
		GROW_FACTOR = layout.offsetof(4);
		ALLOCATED = layout.offsetof(5);
		NEEDED = layout.offsetof(6);
		CALLS = layout.offsetof(7);
		SIZE = layout.offsetof(8);
	}

	NkBuffer(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkBuffer(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkBufferMarker}.Buffer view of the {@code marker} field. */
	public NkBufferMarker.Buffer marker() { return nmarker(address()); }
	/** Returns a {@link NkBufferMarker} view of the struct at the specified index of the {@code marker} field. */
	public NkBufferMarker marker(int index) { return nmarker(address(), index); }
	/** Returns a {@link NkAllocator} view of the {@code pool} field. */
	public NkAllocator pool() { return npool(address()); }
	/** Returns the value of the {@code type} field. */
	public int type() { return ntype(address()); }
	/** Returns a {@link NkMemory} view of the {@code memory} field. */
	public NkMemory memory() { return nmemory(address()); }
	/** Returns the value of the {@code grow_factor} field. */
	public float grow_factor() { return ngrow_factor(address()); }
	/** Returns the value of the {@code allocated} field. */
	public long allocated() { return nallocated(address()); }
	/** Returns the value of the {@code needed} field. */
	public long needed() { return nneeded(address()); }
	/** Returns the value of the {@code calls} field. */
	public long calls() { return ncalls(address()); }
	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }

	/** Copies the specified {@link NkBufferMarker.Buffer} to the {@code marker} field. */
	public NkBuffer marker(NkBufferMarker.Buffer value) { nmarker(address(), value); return this; }
	/** Copies the specified {@link NkBufferMarker} at the specified index of the {@code marker} field. */
	public NkBuffer marker(int index, NkBufferMarker value) { nmarker(address(), index, value); return this; }
	/** Copies the specified {@link NkAllocator} to the {@code pool} field. */
	public NkBuffer pool(NkAllocator value) { npool(address(), value); return this; }
	/** Sets the specified value to the {@code type} field. */
	public NkBuffer type(int value) { ntype(address(), value); return this; }
	/** Copies the specified {@link NkMemory} to the {@code memory} field. */
	public NkBuffer memory(NkMemory value) { nmemory(address(), value); return this; }
	/** Sets the specified value to the {@code grow_factor} field. */
	public NkBuffer grow_factor(float value) { ngrow_factor(address(), value); return this; }
	/** Sets the specified value to the {@code allocated} field. */
	public NkBuffer allocated(long value) { nallocated(address(), value); return this; }
	/** Sets the specified value to the {@code needed} field. */
	public NkBuffer needed(long value) { nneeded(address(), value); return this; }
	/** Sets the specified value to the {@code calls} field. */
	public NkBuffer calls(long value) { ncalls(address(), value); return this; }
	/** Sets the specified value to the {@code size} field. */
	public NkBuffer size(long value) { nsize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkBuffer set(
		NkBufferMarker.Buffer marker,
		NkAllocator pool,
		int type,
		NkMemory memory,
		float grow_factor,
		long allocated,
		long needed,
		long calls,
		long size
	) {
		marker(marker);
		pool(pool);
		type(type);
		memory(memory);
		grow_factor(grow_factor);
		allocated(allocated);
		needed(needed);
		calls(calls);
		size(size);

		return this;
	}

	/** Unsafe version of {@link #set(NkBuffer) set}. */
	public NkBuffer nset(long struct) {
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
	public NkBuffer set(NkBuffer src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkBuffer malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkBuffer calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkBuffer} instance allocated with {@link BufferUtils}. */
	public static NkBuffer create() {
		return new NkBuffer(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkBuffer} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkBuffer create(long address) {
		return address == NULL ? null : new NkBuffer(address, null);
	}

	/**
	 * Returns a new {@link NkBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkBuffer.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkBuffer.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkBuffer} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkBuffer mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkBuffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkBuffer callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkBuffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkBuffer mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkBuffer callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #marker}. */
	public static NkBufferMarker.Buffer nmarker(long struct) {
		return NkBufferMarker.create(struct + NkBuffer.MARKER, 2);
	}
	/** Unsafe version of {@link #marker(int) marker}. */
	public static NkBufferMarker nmarker(long struct, int index) {
		return NkBufferMarker.create(struct + NkBuffer.MARKER + index * NkBufferMarker.SIZEOF);
	}
	/** Unsafe version of {@link #pool}. */
	public static NkAllocator npool(long struct) { return NkAllocator.create(struct + NkBuffer.POOL); }
	/** Unsafe version of {@link #type}. */
	public static int ntype(long struct) { return memGetInt(struct + NkBuffer.TYPE); }
	/** Unsafe version of {@link #memory}. */
	public static NkMemory nmemory(long struct) { return NkMemory.create(struct + NkBuffer.MEMORY); }
	/** Unsafe version of {@link #grow_factor}. */
	public static float ngrow_factor(long struct) { return memGetFloat(struct + NkBuffer.GROW_FACTOR); }
	/** Unsafe version of {@link #allocated}. */
	public static long nallocated(long struct) { return memGetAddress(struct + NkBuffer.ALLOCATED); }
	/** Unsafe version of {@link #needed}. */
	public static long nneeded(long struct) { return memGetAddress(struct + NkBuffer.NEEDED); }
	/** Unsafe version of {@link #calls}. */
	public static long ncalls(long struct) { return memGetAddress(struct + NkBuffer.CALLS); }
	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetAddress(struct + NkBuffer.SIZE); }

	/** Unsafe version of {@link #marker(NkBufferMarker.Buffer) marker}. */
	public static void nmarker(long struct, NkBufferMarker.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + NkBuffer.MARKER, value.remaining() * NkBufferMarker.SIZEOF);
	}
	/** Unsafe version of {@link #marker(int, NkBufferMarker) marker}. */
	public static void nmarker(long struct, int index, NkBufferMarker value) { memCopy(value.address(), struct + NkBuffer.MARKER + index * NkBufferMarker.SIZEOF, NkBufferMarker.SIZEOF); }
	/** Unsafe version of {@link #pool(NkAllocator) pool}. */
	public static void npool(long struct, NkAllocator value) { memCopy(value.address(), struct + NkBuffer.POOL, NkAllocator.SIZEOF); }
	/** Unsafe version of {@link #type(int) type}. */
	public static void ntype(long struct, int value) { memPutInt(struct + NkBuffer.TYPE, value); }
	/** Unsafe version of {@link #memory(NkMemory) memory}. */
	public static void nmemory(long struct, NkMemory value) { memCopy(value.address(), struct + NkBuffer.MEMORY, NkMemory.SIZEOF); }
	/** Unsafe version of {@link #grow_factor(float) grow_factor}. */
	public static void ngrow_factor(long struct, float value) { memPutFloat(struct + NkBuffer.GROW_FACTOR, value); }
	/** Unsafe version of {@link #allocated(long) allocated}. */
	public static void nallocated(long struct, long value) { memPutAddress(struct + NkBuffer.ALLOCATED, value); }
	/** Unsafe version of {@link #needed(long) needed}. */
	public static void nneeded(long struct, long value) { memPutAddress(struct + NkBuffer.NEEDED, value); }
	/** Unsafe version of {@link #calls(long) calls}. */
	public static void ncalls(long struct, long value) { memPutAddress(struct + NkBuffer.CALLS, value); }
	/** Unsafe version of {@link #size(long) size}. */
	public static void nsize(long struct, long value) { memPutAddress(struct + NkBuffer.SIZE, value); }

	// -----------------------------------

	/** An array of {@link NkBuffer} structs. */
	public static final class Buffer extends StructBuffer<NkBuffer, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkBuffer.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkBuffer#SIZEOF}, and its mark will be undefined.
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
		protected NkBuffer newInstance(long address) {
			return new NkBuffer(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkBufferMarker}.Buffer view of the {@code marker} field. */
		public NkBufferMarker.Buffer marker() { return NkBuffer.nmarker(address()); }
		/** Returns a {@link NkBufferMarker} view of the struct at the specified index of the {@code marker} field. */
		public NkBufferMarker marker(int index) { return NkBuffer.nmarker(address(), index); }
		/** Returns a {@link NkAllocator} view of the {@code pool} field. */
		public NkAllocator pool() { return NkBuffer.npool(address()); }
		/** Returns the value of the {@code type} field. */
		public int type() { return NkBuffer.ntype(address()); }
		/** Returns a {@link NkMemory} view of the {@code memory} field. */
		public NkMemory memory() { return NkBuffer.nmemory(address()); }
		/** Returns the value of the {@code grow_factor} field. */
		public float grow_factor() { return NkBuffer.ngrow_factor(address()); }
		/** Returns the value of the {@code allocated} field. */
		public long allocated() { return NkBuffer.nallocated(address()); }
		/** Returns the value of the {@code needed} field. */
		public long needed() { return NkBuffer.nneeded(address()); }
		/** Returns the value of the {@code calls} field. */
		public long calls() { return NkBuffer.ncalls(address()); }
		/** Returns the value of the {@code size} field. */
		public long size() { return NkBuffer.nsize(address()); }

		/** Copies the specified {@link NkBufferMarker.Buffer} to the {@code marker} field. */
		public NkBuffer.Buffer marker(NkBufferMarker.Buffer value) { NkBuffer.nmarker(address(), value); return this; }
		/** Copies the specified {@link NkBufferMarker} at the specified index of the {@code marker} field. */
		public NkBuffer.Buffer marker(int index, NkBufferMarker value) { NkBuffer.nmarker(address(), index, value); return this; }
		/** Copies the specified {@link NkAllocator} to the {@code pool} field. */
		public NkBuffer.Buffer pool(NkAllocator value) { NkBuffer.npool(address(), value); return this; }
		/** Sets the specified value to the {@code type} field. */
		public NkBuffer.Buffer type(int value) { NkBuffer.ntype(address(), value); return this; }
		/** Copies the specified {@link NkMemory} to the {@code memory} field. */
		public NkBuffer.Buffer memory(NkMemory value) { NkBuffer.nmemory(address(), value); return this; }
		/** Sets the specified value to the {@code grow_factor} field. */
		public NkBuffer.Buffer grow_factor(float value) { NkBuffer.ngrow_factor(address(), value); return this; }
		/** Sets the specified value to the {@code allocated} field. */
		public NkBuffer.Buffer allocated(long value) { NkBuffer.nallocated(address(), value); return this; }
		/** Sets the specified value to the {@code needed} field. */
		public NkBuffer.Buffer needed(long value) { NkBuffer.nneeded(address(), value); return this; }
		/** Sets the specified value to the {@code calls} field. */
		public NkBuffer.Buffer calls(long value) { NkBuffer.ncalls(address(), value); return this; }
		/** Sets the specified value to the {@code size} field. */
		public NkBuffer.Buffer size(long value) { NkBuffer.nsize(address(), value); return this; }

	}

}