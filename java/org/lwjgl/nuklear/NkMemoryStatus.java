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
 * <pre><code>struct nk_memory_status {
    void * memory;
    unsigned int type;
    nk_size size;
    nk_size allocated;
    nk_size needed;
    nk_size calls;
}</code></pre>
 */
public class NkMemoryStatus extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		MEMORY,
		TYPE,
		SIZE,
		ALLOCATED,
		NEEDED,
		CALLS;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		MEMORY = layout.offsetof(0);
		TYPE = layout.offsetof(1);
		SIZE = layout.offsetof(2);
		ALLOCATED = layout.offsetof(3);
		NEEDED = layout.offsetof(4);
		CALLS = layout.offsetof(5);
	}

	NkMemoryStatus(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkMemoryStatus} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkMemoryStatus(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code memory} field. */
	public ByteBuffer memory() { return nmemory(address()); }
	/** Returns the value of the {@code type} field. */
	public int type() { return ntype(address()); }
	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }
	/** Returns the value of the {@code allocated} field. */
	public long allocated() { return nallocated(address()); }
	/** Returns the value of the {@code needed} field. */
	public long needed() { return nneeded(address()); }
	/** Returns the value of the {@code calls} field. */
	public long calls() { return ncalls(address()); }

	/** Sets the address of the specified {@link ByteBuffer} to the {@code memory} field. */
	public NkMemoryStatus memory(ByteBuffer value) { nmemory(address(), value); return this; }
	/** Sets the specified value to the {@code type} field. */
	public NkMemoryStatus type(int value) { ntype(address(), value); return this; }
	/** Sets the specified value to the {@code allocated} field. */
	public NkMemoryStatus allocated(long value) { nallocated(address(), value); return this; }
	/** Sets the specified value to the {@code needed} field. */
	public NkMemoryStatus needed(long value) { nneeded(address(), value); return this; }
	/** Sets the specified value to the {@code calls} field. */
	public NkMemoryStatus calls(long value) { ncalls(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkMemoryStatus set(
		ByteBuffer memory,
		int type,
		long allocated,
		long needed,
		long calls
	) {
		memory(memory);
		type(type);
		allocated(allocated);
		needed(needed);
		calls(calls);

		return this;
	}

	/** Unsafe version of {@link #set(NkMemoryStatus) set}. */
	public NkMemoryStatus nset(long struct) {
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
	public NkMemoryStatus set(NkMemoryStatus src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkMemoryStatus} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkMemoryStatus malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkMemoryStatus} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkMemoryStatus calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkMemoryStatus} instance allocated with {@link BufferUtils}. */
	public static NkMemoryStatus create() {
		return new NkMemoryStatus(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkMemoryStatus} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkMemoryStatus create(long address) {
		return address == NULL ? null : new NkMemoryStatus(address, null);
	}

	/**
	 * Returns a new {@link NkMemoryStatus.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkMemoryStatus.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkMemoryStatus.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkMemoryStatus.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkMemoryStatus} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkMemoryStatus mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkMemoryStatus} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkMemoryStatus callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkMemoryStatus} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkMemoryStatus mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkMemoryStatus} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkMemoryStatus callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkMemoryStatus.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkMemoryStatus.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkMemoryStatus.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkMemoryStatus.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #memory() memory}. */
	public static ByteBuffer nmemory(long struct) { return memByteBuffer(memGetAddress(struct + NkMemoryStatus.MEMORY), (int)nsize(struct)); }
	/** Unsafe version of {@link #type}. */
	public static int ntype(long struct) { return memGetInt(struct + NkMemoryStatus.TYPE); }
	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetAddress(struct + NkMemoryStatus.SIZE); }
	/** Unsafe version of {@link #allocated}. */
	public static long nallocated(long struct) { return memGetAddress(struct + NkMemoryStatus.ALLOCATED); }
	/** Unsafe version of {@link #needed}. */
	public static long nneeded(long struct) { return memGetAddress(struct + NkMemoryStatus.NEEDED); }
	/** Unsafe version of {@link #calls}. */
	public static long ncalls(long struct) { return memGetAddress(struct + NkMemoryStatus.CALLS); }

	/** Unsafe version of {@link #memory(ByteBuffer) memory}. */
	public static void nmemory(long struct, ByteBuffer value) { memPutAddress(struct + NkMemoryStatus.MEMORY, memAddress(value)); nsize(struct, value.remaining()); }
	/** Unsafe version of {@link #type(int) type}. */
	public static void ntype(long struct, int value) { memPutInt(struct + NkMemoryStatus.TYPE, value); }
	/** Sets the specified value to the {@code size} field of the specified {@code struct}. */
	public static void nsize(long struct, long value) { memPutAddress(struct + NkMemoryStatus.SIZE, value); }
	/** Unsafe version of {@link #allocated(long) allocated}. */
	public static void nallocated(long struct, long value) { memPutAddress(struct + NkMemoryStatus.ALLOCATED, value); }
	/** Unsafe version of {@link #needed(long) needed}. */
	public static void nneeded(long struct, long value) { memPutAddress(struct + NkMemoryStatus.NEEDED, value); }
	/** Unsafe version of {@link #calls(long) calls}. */
	public static void ncalls(long struct, long value) { memPutAddress(struct + NkMemoryStatus.CALLS, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + NkMemoryStatus.MEMORY));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link NkMemoryStatus} structs. */
	public static final class Buffer extends StructBuffer<NkMemoryStatus, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkMemoryStatus.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkMemoryStatus#SIZEOF}, and its mark will be undefined.
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
		protected NkMemoryStatus newInstance(long address) {
			return new NkMemoryStatus(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code memory} field. */
		public ByteBuffer memory() { return NkMemoryStatus.nmemory(address()); }
		/** Returns the value of the {@code type} field. */
		public int type() { return NkMemoryStatus.ntype(address()); }
		/** Returns the value of the {@code size} field. */
		public long size() { return NkMemoryStatus.nsize(address()); }
		/** Returns the value of the {@code allocated} field. */
		public long allocated() { return NkMemoryStatus.nallocated(address()); }
		/** Returns the value of the {@code needed} field. */
		public long needed() { return NkMemoryStatus.nneeded(address()); }
		/** Returns the value of the {@code calls} field. */
		public long calls() { return NkMemoryStatus.ncalls(address()); }

		/** Sets the address of the specified {@link ByteBuffer} to the {@code memory} field. */
		public NkMemoryStatus.Buffer memory(ByteBuffer value) { NkMemoryStatus.nmemory(address(), value); return this; }
		/** Sets the specified value to the {@code type} field. */
		public NkMemoryStatus.Buffer type(int value) { NkMemoryStatus.ntype(address(), value); return this; }
		/** Sets the specified value to the {@code allocated} field. */
		public NkMemoryStatus.Buffer allocated(long value) { NkMemoryStatus.nallocated(address(), value); return this; }
		/** Sets the specified value to the {@code needed} field. */
		public NkMemoryStatus.Buffer needed(long value) { NkMemoryStatus.nneeded(address(), value); return this; }
		/** Sets the specified value to the {@code calls} field. */
		public NkMemoryStatus.Buffer calls(long value) { NkMemoryStatus.ncalls(address(), value); return this; }

	}

}