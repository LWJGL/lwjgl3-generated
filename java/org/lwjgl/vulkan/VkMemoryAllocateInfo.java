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
import static org.lwjgl.system.MemoryStack.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkMemoryAllocateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkMemoryAllocateInfo">Vulkan Specification</a>
 * 
 * <p>Describes parameters of a memory allocation.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code allocationSize} <b>must</b> be less than or equal to the amount of memory available to the {@code VkMemoryHeap} specified by
 * {@code memoryTypeIndex} and the calling command's {@code VkDevice}</li>
 * <li>{@code allocationSize} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code allocationSize} &ndash; the size of the allocation in bytes</li>
 * <li>{@code memoryTypeIndex} &ndash; the memory type index, which selects the properties of the memory to be allocated, as well as the heap the memory will come from</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkMemoryAllocateInfo {
    VkStructureType sType;
    const void * pNext;
    VkDeviceSize allocationSize;
    uint32_t memoryTypeIndex;
}</code></pre>
 */
public class VkMemoryAllocateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
		ALIGNOF = layout.getAlignment();

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

	// -----------------------------------

	/** Returns a new {@link VkMemoryAllocateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkMemoryAllocateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkMemoryAllocateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
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
	 * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
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

	// -----------------------------------

	/** Returns a new {@link VkMemoryAllocateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkMemoryAllocateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkMemoryAllocateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkMemoryAllocateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkMemoryAllocateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkMemoryAllocateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkMemoryAllocateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkMemoryAllocateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

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
			return new VkMemoryAllocateInfo(address, getContainer());
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