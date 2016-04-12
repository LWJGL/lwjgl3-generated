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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkMemoryType.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkMemoryType">Vulkan Specification</a>
 * 
 * <p>Contains information about a memory type.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code propertyFlags} &ndash; a bitmask of {@code VkMemoryPropertyFlagBits} properties for this memory type. One or more of:<br><table><tr><td>{@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT}</td><td>{@link VK10#VK_MEMORY_PROPERTY_HOST_CACHED_BIT MEMORY_PROPERTY_HOST_CACHED_BIT}</td></tr><tr><td>{@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}</td><td>{@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT}</td></tr><tr><td>{@link VK10#VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT}</td></tr></table></li>
 * <li>{@code heapIndex} &ndash; 
 * describes which memory heap this memory type corresponds to, and <b>must</b> be less than {@code memoryHeapCount} from the {@link VkPhysicalDeviceMemoryProperties}
 * structure</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkMemoryType {
    VkMemoryPropertyFlags propertyFlags;
    uint32_t heapIndex;
}</code></pre>
 */
public class VkMemoryType extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		PROPERTYFLAGS,
		HEAPINDEX;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		PROPERTYFLAGS = layout.offsetof(0);
		HEAPINDEX = layout.offsetof(1);
	}

	VkMemoryType(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkMemoryType} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkMemoryType(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code propertyFlags} field. */
	public int propertyFlags() { return npropertyFlags(address()); }
	/** Returns the value of the {@code heapIndex} field. */
	public int heapIndex() { return nheapIndex(address()); }

	// -----------------------------------

	/** Returns a new {@link VkMemoryType} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkMemoryType malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkMemoryType} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkMemoryType calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkMemoryType} instance allocated with {@link BufferUtils}. */
	public static VkMemoryType create() {
		return new VkMemoryType(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkMemoryType} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkMemoryType create(long address) {
		return address == NULL ? null : new VkMemoryType(address, null);
	}

	/**
	 * Returns a new {@link VkMemoryType.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryType.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryType.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkMemoryType.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkMemoryType} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkMemoryType mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkMemoryType} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkMemoryType callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkMemoryType} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkMemoryType mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkMemoryType} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkMemoryType callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkMemoryType.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkMemoryType.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkMemoryType.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryType.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #propertyFlags}. */
	public static int npropertyFlags(long struct) { return memGetInt(struct + VkMemoryType.PROPERTYFLAGS); }
	/** Unsafe version of {@link #heapIndex}. */
	public static int nheapIndex(long struct) { return memGetInt(struct + VkMemoryType.HEAPINDEX); }

	// -----------------------------------

	/** An array of {@link VkMemoryType} structs. */
	public static final class Buffer extends StructBuffer<VkMemoryType, Buffer> {

		/**
		 * Creates a new {@link VkMemoryType.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkMemoryType#SIZEOF}, and its mark will be undefined.
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
		protected VkMemoryType newInstance(long address) {
			return new VkMemoryType(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code propertyFlags} field. */
		public int propertyFlags() { return VkMemoryType.npropertyFlags(address()); }
		/** Returns the value of the {@code heapIndex} field. */
		public int heapIndex() { return VkMemoryType.nheapIndex(address()); }

	}

}