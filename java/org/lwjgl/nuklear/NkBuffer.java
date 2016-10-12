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
    {@link NkBufferMarker struct nk_buffer_marker} marker[2];
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

	// -----------------------------------

	/** An array of {@link NkBuffer} structs. */
	public static class Buffer extends StructBuffer<NkBuffer, Buffer> implements NativeResource {

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
			return new NkBuffer(address, container);
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

	}

}