/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkPhysicalDeviceMemoryProperties.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkPhysicalDeviceMemoryProperties">Vulkan Specification</a>
 * 
 * <p>Describes the memory heaps and memory types available to a physical device.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code memoryTypeCount} &ndash; the number of memory types available across all memory heaps</li>
 * <li>{@code memoryTypes} &ndash; the memory type descriptions</li>
 * <li>{@code memoryHeapCount} &ndash; the number of memory heaps</li>
 * <li>{@code memoryHeaps} &ndash; the memory heap descriptions</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPhysicalDeviceMemoryProperties {
    uint32_t memoryTypeCount;
    {@link VkMemoryType VkMemoryType}[32] memoryTypes;
    uint32_t memoryHeapCount;
    {@link VkMemoryHeap VkMemoryHeap}[16] memoryHeaps;
}</code></pre>
 */
public class VkPhysicalDeviceMemoryProperties extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		MEMORYTYPECOUNT,
		MEMORYTYPES,
		MEMORYHEAPCOUNT,
		MEMORYHEAPS;

	static {
		Layout layout = __struct(
			__member(4),
			__array(VkMemoryType.SIZEOF, VkMemoryType.ALIGNOF, 32),
			__member(4),
			__array(VkMemoryHeap.SIZEOF, VkMemoryHeap.ALIGNOF, 16)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		MEMORYTYPECOUNT = layout.offsetof(0);
		MEMORYTYPES = layout.offsetof(1);
		MEMORYHEAPCOUNT = layout.offsetof(2);
		MEMORYHEAPS = layout.offsetof(3);
	}

	VkPhysicalDeviceMemoryProperties(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPhysicalDeviceMemoryProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPhysicalDeviceMemoryProperties(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code memoryTypeCount} field. */
	public int memoryTypeCount() { return nmemoryTypeCount(address()); }
	/** Returns a {@link VkMemoryType}.Buffer view of the {@code memoryTypes} field. */
	public VkMemoryType.Buffer memoryTypes() { return nmemoryTypes(address()); }
	/** Returns a {@link VkMemoryType} view of the struct at the specified index of the {@code memoryTypes} field. */
	public VkMemoryType memoryTypes(int index) { return nmemoryTypes(address(), index); }
	/** Returns the value of the {@code memoryHeapCount} field. */
	public int memoryHeapCount() { return nmemoryHeapCount(address()); }
	/** Returns a {@link VkMemoryHeap}.Buffer view of the {@code memoryHeaps} field. */
	public VkMemoryHeap.Buffer memoryHeaps() { return nmemoryHeaps(address()); }
	/** Returns a {@link VkMemoryHeap} view of the struct at the specified index of the {@code memoryHeaps} field. */
	public VkMemoryHeap memoryHeaps(int index) { return nmemoryHeaps(address(), index); }

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceMemoryProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceMemoryProperties malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceMemoryProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceMemoryProperties calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceMemoryProperties} instance allocated with {@link BufferUtils}. */
	public static VkPhysicalDeviceMemoryProperties create() {
		return new VkPhysicalDeviceMemoryProperties(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceMemoryProperties} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPhysicalDeviceMemoryProperties create(long address) {
		return address == NULL ? null : new VkPhysicalDeviceMemoryProperties(address, null);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPhysicalDeviceMemoryProperties.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceMemoryProperties} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPhysicalDeviceMemoryProperties mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPhysicalDeviceMemoryProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPhysicalDeviceMemoryProperties callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMemoryProperties} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDeviceMemoryProperties mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMemoryProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDeviceMemoryProperties callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #memoryTypeCount}. */
	public static int nmemoryTypeCount(long struct) { return memGetInt(struct + VkPhysicalDeviceMemoryProperties.MEMORYTYPECOUNT); }
	/** Unsafe version of {@link #memoryTypes}. */
	public static VkMemoryType.Buffer nmemoryTypes(long struct) {
		return VkMemoryType.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYTYPES, nmemoryTypeCount(struct));
	}
	/** Unsafe version of {@link #memoryTypes(int) memoryTypes}. */
	public static VkMemoryType nmemoryTypes(long struct, int index) {
		return VkMemoryType.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYTYPES + index * VkMemoryType.SIZEOF);
	}
	/** Unsafe version of {@link #memoryHeapCount}. */
	public static int nmemoryHeapCount(long struct) { return memGetInt(struct + VkPhysicalDeviceMemoryProperties.MEMORYHEAPCOUNT); }
	/** Unsafe version of {@link #memoryHeaps}. */
	public static VkMemoryHeap.Buffer nmemoryHeaps(long struct) {
		return VkMemoryHeap.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYHEAPS, nmemoryHeapCount(struct));
	}
	/** Unsafe version of {@link #memoryHeaps(int) memoryHeaps}. */
	public static VkMemoryHeap nmemoryHeaps(long struct, int index) {
		return VkMemoryHeap.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYHEAPS + index * VkMemoryHeap.SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link VkPhysicalDeviceMemoryProperties} structs. */
	public static final class Buffer extends StructBuffer<VkPhysicalDeviceMemoryProperties, Buffer> {

		/**
		 * Creates a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPhysicalDeviceMemoryProperties#SIZEOF}, and its mark will be undefined.
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
		protected VkPhysicalDeviceMemoryProperties newInstance(long address) {
			return new VkPhysicalDeviceMemoryProperties(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code memoryTypeCount} field. */
		public int memoryTypeCount() { return VkPhysicalDeviceMemoryProperties.nmemoryTypeCount(address()); }
		/** Returns a {@link VkMemoryType}.Buffer view of the {@code memoryTypes} field. */
		public VkMemoryType.Buffer memoryTypes() { return VkPhysicalDeviceMemoryProperties.nmemoryTypes(address()); }
		/** Returns a {@link VkMemoryType} view of the struct at the specified index of the {@code memoryTypes} field. */
		public VkMemoryType memoryTypes(int index) { return VkPhysicalDeviceMemoryProperties.nmemoryTypes(address(), index); }
		/** Returns the value of the {@code memoryHeapCount} field. */
		public int memoryHeapCount() { return VkPhysicalDeviceMemoryProperties.nmemoryHeapCount(address()); }
		/** Returns a {@link VkMemoryHeap}.Buffer view of the {@code memoryHeaps} field. */
		public VkMemoryHeap.Buffer memoryHeaps() { return VkPhysicalDeviceMemoryProperties.nmemoryHeaps(address()); }
		/** Returns a {@link VkMemoryHeap} view of the struct at the specified index of the {@code memoryHeaps} field. */
		public VkMemoryHeap memoryHeaps(int index) { return VkPhysicalDeviceMemoryProperties.nmemoryHeaps(address(), index); }

	}

}