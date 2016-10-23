/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure specifying memory type.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code propertyFlags} &ndash; a bitmask of properties for this memory type. The bits specified in {@code propertyFlags} are:
 * 
 * <pre><code>typedef enum VkMemoryPropertyFlagBits {
    VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 0x00000001,
    VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 0x00000002,
    VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 0x00000004,
    VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 0x00000008,
    VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 0x00000010,
} VkMemoryPropertyFlagBits;</code></pre>
 * 
 * <ul>
 * <li>if {@code propertyFlags} has the {@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT} bit set, memory allocated with this type is the most efficient for device access. This property will only be set for memory types belonging to heaps with the {@link VK10#VK_MEMORY_HEAP_DEVICE_LOCAL_BIT MEMORY_HEAP_DEVICE_LOCAL_BIT} set.</li>
 * <li>if {@code propertyFlags} has the {@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} bit set, memory allocated with this type <b>can</b> be mapped for host access using {@link VK10#vkMapMemory MapMemory}.</li>
 * <li>if {@code propertyFlags} has the {@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT} bit set, host cache management commands {@link VK10#vkFlushMappedMemoryRanges FlushMappedMemoryRanges} and {@link VK10#vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} are not needed to make host writes visible to the device or device writes visible to the host, respectively.</li>
 * <li>if {@code propertyFlags} has the {@link VK10#VK_MEMORY_PROPERTY_HOST_CACHED_BIT MEMORY_PROPERTY_HOST_CACHED_BIT} bit set, memory allocated with this type is cached on the host. Host memory accesses to uncached memory are slower than to cached memory, however uncached memory is always host coherent.</li>
 * <li>if {@code propertyFlags} has the {@link VK10#VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT} bit set, the memory type only allows device access to the memory. Memory types <b>must</b> not have both {@link VK10#VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT} and {@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} set. Additionally, the object&#8217;s backing memory <b>may</b> be provided by the implementation lazily as specified in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-device-lazy_allocation">Lazily Allocated Memory</a>.</li>
 * </ul></li>
 * <li>{@code heapIndex} &ndash; describes which memory heap this memory type corresponds to, and <b>must</b> be less than {@code memoryHeapCount} from the {@link VkPhysicalDeviceMemoryProperties} structure.</li>
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

	/** Returns a new {@link VkMemoryType} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkMemoryType create(long address) {
		return address == NULL ? null : new VkMemoryType(address, null);
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

	/** Unsafe version of {@link #propertyFlags}. */
	public static int npropertyFlags(long struct) { return memGetInt(struct + VkMemoryType.PROPERTYFLAGS); }
	/** Unsafe version of {@link #heapIndex}. */
	public static int nheapIndex(long struct) { return memGetInt(struct + VkMemoryType.HEAPINDEX); }

	// -----------------------------------

	/** An array of {@link VkMemoryType} structs. */
	public static class Buffer extends StructBuffer<VkMemoryType, Buffer> {

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
			return new VkMemoryType(address, container);
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