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
 * struct VkMappedMemoryRange {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkDeviceMemory memory;
 *     VkDeviceSize offset;
 *     VkDeviceSize size;
 * }</code></pre>
 */
public class VkMappedMemoryRange extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		MEMORY,
		OFFSET,
		SIZE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(8),
			__member(8),
			__member(8)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		MEMORY = layout.offsetof(2);
		OFFSET = layout.offsetof(3);
		SIZE = layout.offsetof(4);
	}

	VkMappedMemoryRange(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkMappedMemoryRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkMappedMemoryRange(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code memory} field. */
	public long memory() { return nmemory(address()); }
	/** Returns the value of the {@code offset} field. */
	public long offset() { return noffset(address()); }
	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkMappedMemoryRange sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkMappedMemoryRange pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code memory} field. */
	public VkMappedMemoryRange memory(long value) { nmemory(address(), value); return this; }
	/** Sets the specified value to the {@code offset} field. */
	public VkMappedMemoryRange offset(long value) { noffset(address(), value); return this; }
	/** Sets the specified value to the {@code size} field. */
	public VkMappedMemoryRange size(long value) { nsize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkMappedMemoryRange set(
		int sType,
		long pNext,
		long memory,
		long offset,
		long size
	) {
		sType(sType);
		pNext(pNext);
		memory(memory);
		offset(offset);
		size(size);

		return this;
	}

	/** Unsafe version of {@link #set(VkMappedMemoryRange) set}. */
	public VkMappedMemoryRange nset(long struct) {
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
	public VkMappedMemoryRange set(VkMappedMemoryRange src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkMappedMemoryRange) set}. */
	public VkMappedMemoryRange set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkMappedMemoryRange} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkMappedMemoryRange malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkMappedMemoryRange} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkMappedMemoryRange calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkMappedMemoryRange} instance allocated with {@link BufferUtils}. */
	public static VkMappedMemoryRange create() {
		return new VkMappedMemoryRange(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkMappedMemoryRange} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkMappedMemoryRange create(long address) {
		return address == NULL ? null : new VkMappedMemoryRange(address, null);
	}

	/**
	 * Returns a new {@link VkMappedMemoryRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMappedMemoryRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMappedMemoryRange.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkMappedMemoryRange.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkMappedMemoryRange.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkMappedMemoryRange.PNEXT); }
	/** Unsafe version of {@link #memory}. */
	public static long nmemory(long struct) { return memGetLong(struct + VkMappedMemoryRange.MEMORY); }
	/** Unsafe version of {@link #offset}. */
	public static long noffset(long struct) { return memGetLong(struct + VkMappedMemoryRange.OFFSET); }
	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetLong(struct + VkMappedMemoryRange.SIZE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkMappedMemoryRange.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkMappedMemoryRange.PNEXT, value); }
	/** Unsafe version of {@link #memory(long) memory}. */
	public static void nmemory(long struct, long value) { memPutLong(struct + VkMappedMemoryRange.MEMORY, value); }
	/** Unsafe version of {@link #offset(long) offset}. */
	public static void noffset(long struct, long value) { memPutLong(struct + VkMappedMemoryRange.OFFSET, value); }
	/** Unsafe version of {@link #size(long) size}. */
	public static void nsize(long struct, long value) { memPutLong(struct + VkMappedMemoryRange.SIZE, value); }

	// -----------------------------------

	/** An array of {@link VkMappedMemoryRange} structs. */
	public static final class Buffer extends StructBuffer<VkMappedMemoryRange, Buffer> {

		/**
		 * Creates a new {@link VkMappedMemoryRange.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkMappedMemoryRange#SIZEOF}, and its mark will be undefined.
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
		protected VkMappedMemoryRange newInstance(long address) {
			return new VkMappedMemoryRange(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkMappedMemoryRange.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkMappedMemoryRange.npNext(address()); }
		/** Returns the value of the {@code memory} field. */
		public long memory() { return VkMappedMemoryRange.nmemory(address()); }
		/** Returns the value of the {@code offset} field. */
		public long offset() { return VkMappedMemoryRange.noffset(address()); }
		/** Returns the value of the {@code size} field. */
		public long size() { return VkMappedMemoryRange.nsize(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkMappedMemoryRange.Buffer sType(int value) { VkMappedMemoryRange.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkMappedMemoryRange.Buffer pNext(long value) { VkMappedMemoryRange.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code memory} field. */
		public VkMappedMemoryRange.Buffer memory(long value) { VkMappedMemoryRange.nmemory(address(), value); return this; }
		/** Sets the specified value to the {@code offset} field. */
		public VkMappedMemoryRange.Buffer offset(long value) { VkMappedMemoryRange.noffset(address(), value); return this; }
		/** Sets the specified value to the {@code size} field. */
		public VkMappedMemoryRange.Buffer size(long value) { VkMappedMemoryRange.nsize(address(), value); return this; }

	}

}