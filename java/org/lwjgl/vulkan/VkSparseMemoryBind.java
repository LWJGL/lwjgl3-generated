/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct VkSparseMemoryBind {
 *     VkDeviceSize resourceOffset;
 *     VkDeviceSize size;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 *     VkSparseMemoryBindFlags flags;
 * }</code></pre>
 */
public class VkSparseMemoryBind extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		RESOURCEOFFSET,
		SIZE,
		MEMORY,
		MEMORYOFFSET,
		FLAGS;

	static {
		Layout layout = __struct(
			__member(8),
			__member(8),
			__member(8),
			__member(8),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		RESOURCEOFFSET = layout.offsetof(0);
		SIZE = layout.offsetof(1);
		MEMORY = layout.offsetof(2);
		MEMORYOFFSET = layout.offsetof(3);
		FLAGS = layout.offsetof(4);
	}

	VkSparseMemoryBind(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSparseMemoryBind} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSparseMemoryBind(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code resourceOffset} field. */
	public long resourceOffset() { return nresourceOffset(address()); }
	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }
	/** Returns the value of the {@code memory} field. */
	public long memory() { return nmemory(address()); }
	/** Returns the value of the {@code memoryOffset} field. */
	public long memoryOffset() { return nmemoryOffset(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }

	/** Sets the specified value to the {@code resourceOffset} field. */
	public VkSparseMemoryBind resourceOffset(long value) { nresourceOffset(address(), value); return this; }
	/** Sets the specified value to the {@code size} field. */
	public VkSparseMemoryBind size(long value) { nsize(address(), value); return this; }
	/** Sets the specified value to the {@code memory} field. */
	public VkSparseMemoryBind memory(long value) { nmemory(address(), value); return this; }
	/** Sets the specified value to the {@code memoryOffset} field. */
	public VkSparseMemoryBind memoryOffset(long value) { nmemoryOffset(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkSparseMemoryBind flags(int value) { nflags(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSparseMemoryBind set(
		long resourceOffset,
		long size,
		long memory,
		long memoryOffset,
		int flags
	) {
		resourceOffset(resourceOffset);
		size(size);
		memory(memory);
		memoryOffset(memoryOffset);
		flags(flags);

		return this;
	}

	/** Unsafe version of {@link #set(VkSparseMemoryBind) set}. */
	public VkSparseMemoryBind nset(long struct) {
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
	public VkSparseMemoryBind set(VkSparseMemoryBind src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkSparseMemoryBind) set}. */
	public VkSparseMemoryBind set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkSparseMemoryBind} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkSparseMemoryBind malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSparseMemoryBind} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkSparseMemoryBind calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSparseMemoryBind} instance allocated with {@link BufferUtils}. */
	public static VkSparseMemoryBind create() {
		return new VkSparseMemoryBind(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSparseMemoryBind} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSparseMemoryBind create(long address) {
		return address == NULL ? null : new VkSparseMemoryBind(address, null);
	}

	/**
	 * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSparseMemoryBind.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #resourceOffset}. */
	public static long nresourceOffset(long struct) { return memGetLong(struct + VkSparseMemoryBind.RESOURCEOFFSET); }
	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetLong(struct + VkSparseMemoryBind.SIZE); }
	/** Unsafe version of {@link #memory}. */
	public static long nmemory(long struct) { return memGetLong(struct + VkSparseMemoryBind.MEMORY); }
	/** Unsafe version of {@link #memoryOffset}. */
	public static long nmemoryOffset(long struct) { return memGetLong(struct + VkSparseMemoryBind.MEMORYOFFSET); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkSparseMemoryBind.FLAGS); }

	/** Unsafe version of {@link #resourceOffset(long) resourceOffset}. */
	public static void nresourceOffset(long struct, long value) { memPutLong(struct + VkSparseMemoryBind.RESOURCEOFFSET, value); }
	/** Unsafe version of {@link #size(long) size}. */
	public static void nsize(long struct, long value) { memPutLong(struct + VkSparseMemoryBind.SIZE, value); }
	/** Unsafe version of {@link #memory(long) memory}. */
	public static void nmemory(long struct, long value) { memPutLong(struct + VkSparseMemoryBind.MEMORY, value); }
	/** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
	public static void nmemoryOffset(long struct, long value) { memPutLong(struct + VkSparseMemoryBind.MEMORYOFFSET, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkSparseMemoryBind.FLAGS, value); }

	// -----------------------------------

	/** An array of {@link VkSparseMemoryBind} structs. */
	public static final class Buffer extends StructBuffer<VkSparseMemoryBind, Buffer> {

		/**
		 * Creates a new {@link VkSparseMemoryBind.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSparseMemoryBind#SIZEOF}, and its mark will be undefined.
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
		protected VkSparseMemoryBind newInstance(long address) {
			return new VkSparseMemoryBind(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code resourceOffset} field. */
		public long resourceOffset() { return VkSparseMemoryBind.nresourceOffset(address()); }
		/** Returns the value of the {@code size} field. */
		public long size() { return VkSparseMemoryBind.nsize(address()); }
		/** Returns the value of the {@code memory} field. */
		public long memory() { return VkSparseMemoryBind.nmemory(address()); }
		/** Returns the value of the {@code memoryOffset} field. */
		public long memoryOffset() { return VkSparseMemoryBind.nmemoryOffset(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkSparseMemoryBind.nflags(address()); }

		/** Sets the specified value to the {@code resourceOffset} field. */
		public VkSparseMemoryBind.Buffer resourceOffset(long value) { VkSparseMemoryBind.nresourceOffset(address(), value); return this; }
		/** Sets the specified value to the {@code size} field. */
		public VkSparseMemoryBind.Buffer size(long value) { VkSparseMemoryBind.nsize(address(), value); return this; }
		/** Sets the specified value to the {@code memory} field. */
		public VkSparseMemoryBind.Buffer memory(long value) { VkSparseMemoryBind.nmemory(address(), value); return this; }
		/** Sets the specified value to the {@code memoryOffset} field. */
		public VkSparseMemoryBind.Buffer memoryOffset(long value) { VkSparseMemoryBind.nmemoryOffset(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkSparseMemoryBind.Buffer flags(int value) { VkSparseMemoryBind.nflags(address(), value); return this; }

	}

}