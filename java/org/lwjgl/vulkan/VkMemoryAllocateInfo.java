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
 * struct VkMemoryAllocateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkDeviceSize allocationSize;
 *     uint32_t memoryTypeIndex;
 * }</code></pre>
 */
public class VkMemoryAllocateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		ALLOCATIONSIZE,
		MEMORYTYPEINDEX;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(8),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		ALLOCATIONSIZE = layout.offsetof(2);
		MEMORYTYPEINDEX = layout.offsetof(3);
	}

	VkMemoryAllocateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkMemoryAllocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkMemoryAllocateInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code allocationSize} field. */
	public long allocationSize() { return nallocationSize(address()); }
	/** Returns the value of the {@code memoryTypeIndex} field. */
	public int memoryTypeIndex() { return nmemoryTypeIndex(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkMemoryAllocateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkMemoryAllocateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code allocationSize} field. */
	public VkMemoryAllocateInfo allocationSize(long value) { nallocationSize(address(), value); return this; }
	/** Sets the specified value to the {@code memoryTypeIndex} field. */
	public VkMemoryAllocateInfo memoryTypeIndex(int value) { nmemoryTypeIndex(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkMemoryAllocateInfo set(
		int sType,
		long pNext,
		long allocationSize,
		int memoryTypeIndex
	) {
		sType(sType);
		pNext(pNext);
		allocationSize(allocationSize);
		memoryTypeIndex(memoryTypeIndex);

		return this;
	}

	/** Unsafe version of {@link #set(VkMemoryAllocateInfo) set}. */
	public VkMemoryAllocateInfo nset(long struct) {
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
	public VkMemoryAllocateInfo set(VkMemoryAllocateInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkMemoryAllocateInfo) set}. */
	public VkMemoryAllocateInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkMemoryAllocateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkMemoryAllocateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkMemoryAllocateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkMemoryAllocateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkMemoryAllocateInfo} instance allocated with {@link BufferUtils}. */
	public static VkMemoryAllocateInfo create() {
		return new VkMemoryAllocateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkMemoryAllocateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkMemoryAllocateInfo create(long address) {
		return address == NULL ? null : new VkMemoryAllocateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkMemoryAllocateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkMemoryAllocateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkMemoryAllocateInfo.PNEXT); }
	/** Unsafe version of {@link #allocationSize}. */
	public static long nallocationSize(long struct) { return memGetLong(struct + VkMemoryAllocateInfo.ALLOCATIONSIZE); }
	/** Unsafe version of {@link #memoryTypeIndex}. */
	public static int nmemoryTypeIndex(long struct) { return memGetInt(struct + VkMemoryAllocateInfo.MEMORYTYPEINDEX); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryAllocateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryAllocateInfo.PNEXT, value); }
	/** Unsafe version of {@link #allocationSize(long) allocationSize}. */
	public static void nallocationSize(long struct, long value) { memPutLong(struct + VkMemoryAllocateInfo.ALLOCATIONSIZE, value); }
	/** Unsafe version of {@link #memoryTypeIndex(int) memoryTypeIndex}. */
	public static void nmemoryTypeIndex(long struct, int value) { memPutInt(struct + VkMemoryAllocateInfo.MEMORYTYPEINDEX, value); }

	// -----------------------------------

	/** An array of {@link VkMemoryAllocateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkMemoryAllocateInfo, Buffer> {

		/**
		 * Creates a new {@link VkMemoryAllocateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkMemoryAllocateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkMemoryAllocateInfo newInstance(long address) {
			return new VkMemoryAllocateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkMemoryAllocateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkMemoryAllocateInfo.npNext(address()); }
		/** Returns the value of the {@code allocationSize} field. */
		public long allocationSize() { return VkMemoryAllocateInfo.nallocationSize(address()); }
		/** Returns the value of the {@code memoryTypeIndex} field. */
		public int memoryTypeIndex() { return VkMemoryAllocateInfo.nmemoryTypeIndex(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkMemoryAllocateInfo.Buffer sType(int value) { VkMemoryAllocateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkMemoryAllocateInfo.Buffer pNext(long value) { VkMemoryAllocateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code allocationSize} field. */
		public VkMemoryAllocateInfo.Buffer allocationSize(long value) { VkMemoryAllocateInfo.nallocationSize(address(), value); return this; }
		/** Sets the specified value to the {@code memoryTypeIndex} field. */
		public VkMemoryAllocateInfo.Buffer memoryTypeIndex(int value) { VkMemoryAllocateInfo.nmemoryTypeIndex(address(), value); return this; }

	}

}