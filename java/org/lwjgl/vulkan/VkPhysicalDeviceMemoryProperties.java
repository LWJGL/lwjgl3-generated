/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure specifying physical device memory properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link VkPhysicalDeviceMemoryProperties} structure describes a number of <em>memory heaps</em> as well as a number of <em>memory types</em> that <b>can</b> be used to access memory allocated in those heaps. Each heap describes a memory resource of a particular size, and each memory type describes a set of memory properties (e.g. host cached vs uncached) that <b>can</b> be used with a given memory heap. Allocations using a particular memory type will consume resources from the heap indicated by that memory type's heap index. More than one memory type <b>may</b> share each heap, and the heaps and memory types provide a mechanism to advertise an accurate size of the physical memory resources while allowing the memory to be used with a variety of different properties.</p>
 * 
 * <p>The number of memory heaps is given by {@code memoryHeapCount} and is less than or equal to {@link VK10#VK_MAX_MEMORY_HEAPS MAX_MEMORY_HEAPS}. Each heap is described by an element of the {@code memoryHeaps} array, as a {@link VkMemoryHeap} structure. The number of memory types available across all memory heaps is given by {@code memoryTypeCount} and is less than or equal to {@link VK10#VK_MAX_MEMORY_TYPES MAX_MEMORY_TYPES}. Each memory type is described by an element of the {@code memoryTypes} array, as a {@link VkMemoryType} structure.</p>
 * 
 * <p>At least one heap <b>must</b> include {@link VK10#VK_MEMORY_HEAP_DEVICE_LOCAL_BIT MEMORY_HEAP_DEVICE_LOCAL_BIT} in {@link VkMemoryHeap}{@code ::flags}. If there are multiple heaps that all have similar performance characteristics, they <b>may</b> all include {@link VK10#VK_MEMORY_HEAP_DEVICE_LOCAL_BIT MEMORY_HEAP_DEVICE_LOCAL_BIT}. In a unified memory architecture (UMA) system, there is often only a single memory heap which is considered to be equally “local” to the host and to the device, and such an implementation <b>must</b> advertise the heap as device-local.</p>
 * 
 * <p>Each memory type returned by {@link VK10#vkGetPhysicalDeviceMemoryProperties GetPhysicalDeviceMemoryProperties} <b>must</b> have its {@code propertyFlags} set to one of the following values:</p>
 * 
 * <ul>
 * <li>0</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_CACHED_BIT MEMORY_PROPERTY_HOST_CACHED_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_CACHED_BIT MEMORY_PROPERTY_HOST_CACHED_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_CACHED_BIT MEMORY_PROPERTY_HOST_CACHED_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_CACHED_BIT MEMORY_PROPERTY_HOST_CACHED_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT} | {@link VK10#VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT}</li>
 * </ul>
 * 
 * <p>There <b>must</b> be at least one memory type with both the {@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} and {@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT} bits set in its {@code propertyFlags}. There <b>must</b> be at least one memory type with the {@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT} bit set in its {@code propertyFlags}.</p>
 * 
 * <p>The memory types are sorted according to a preorder which serves to aid in easily selecting an appropriate memory type. Given two memory types X and Y, the preorder defines <code>X {leq} Y</code> if:</p>
 * 
 * <ul>
 * <li>the memory property bits set for X are a strict subset of the memory property bits set for Y. Or,</li>
 * <li>the memory property bits set for X are the same as the memory property bits set for Y, and X uses a memory heap with greater or equal performance (as determined in an implementation-specific manner).</li>
 * </ul>
 * 
 * <p>Memory types are ordered in the list such that X is assigned a lesser {@code memoryTypeIndex} than Y if <code>(X {leq} Y) {land} {lnot} (Y {leq} X)</code> according to the preorder. Note that the list of all allowed memory property flag combinations above satisfies this preorder, but other orders would as well. The goal of this ordering is to enable applications to use a simple search loop in selecting the proper memory type, along the lines of:</p>
 * 
 * <pre><code>// Find a memory type in "memoryTypeBits" that includes all of "properties"
int32_t FindProperties(uint32_t memoryTypeBits, VkMemoryPropertyFlags properties)
{
    for (int32_t i = 0; i < memoryTypeCount; ++i)
    {
        if ((memoryTypeBits & (1 << i)) &&
            ((memoryTypes[i].propertyFlags & properties) == properties))
            return i;
    }
    return -1;
}

// Try to find an optimal memory type, or if it does not exist
// find any compatible memory type
VkMemoryRequirements memoryRequirements;
vkGetImageMemoryRequirements(device, image, &memoryRequirements);
int32_t memoryType = FindProperties(memoryRequirements.memoryTypeBits, optimalProperties);
if (memoryType == -1)
    memoryType = FindProperties(memoryRequirements.memoryTypeBits, requiredProperties);</code></pre>
 * 
 * <p>The loop will find the first supported memory type that has all bits requested in {@code properties} set. If there is no exact match, it will find a closest match (i.e. a memory type with the fewest additional bits set), which has some additional bits set but which are not detrimental to the behaviors requested by {@code properties}. The application <b>can</b> first search for the optimal properties, e.g. a memory type that is device-local or supports coherent cached accesses, as appropriate for the intended usage, and if such a memory type is not present <b>can</b> fallback to searching for a less optimal but guaranteed set of properties such as "0" or "host-visible and coherent".</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkMemoryHeap}, {@link VkMemoryType}, {@link VkPhysicalDeviceMemoryProperties2KHR}, {@link VK10#vkGetPhysicalDeviceMemoryProperties GetPhysicalDeviceMemoryProperties}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code memoryTypeCount} &ndash; the number of valid elements in the {@code memoryTypes} array.</li>
 * <li>{@code memoryTypes} &ndash; an array of {@link VkMemoryType} structures describing the <em>memory types</em> that <b>can</b> be used to access memory allocated from the heaps specified by {@code memoryHeaps}.</li>
 * <li>{@code memoryHeapCount} &ndash; the number of valid elements in the {@code memoryHeaps} array.</li>
 * <li>{@code memoryHeaps} &ndash; an array of {@link VkMemoryHeap} structures describing the <em>memory heaps</em> from which memory <b>can</b> be allocated.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPhysicalDeviceMemoryProperties {
    uint32_t memoryTypeCount;
    {@link VkMemoryType VkMemoryType} memoryTypes[VK_MAX_MEMORY_TYPES];
    uint32_t memoryHeapCount;
    {@link VkMemoryHeap VkMemoryHeap} memoryHeaps[VK_MAX_MEMORY_HEAPS];
}</code></pre>
 */
public class VkPhysicalDeviceMemoryProperties extends Struct implements NativeResource {

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
			__array(VkMemoryType.SIZEOF, VkMemoryType.ALIGNOF, VK_MAX_MEMORY_TYPES),
			__member(4),
			__array(VkMemoryHeap.SIZEOF, VkMemoryHeap.ALIGNOF, VK_MAX_MEMORY_HEAPS)
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
	public static VkMemoryType.Buffer nmemoryTypes(long struct) { return VkMemoryType.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYTYPES, nmemoryTypeCount(struct)); }
	/** Unsafe version of {@link #memoryTypes(int) memoryTypes}. */
	public static VkMemoryType nmemoryTypes(long struct, int index) {
		if ( CHECKS ) check(index, VK_MAX_MEMORY_TYPES);
		return VkMemoryType.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYTYPES + index * VkMemoryType.SIZEOF);
	}
	/** Unsafe version of {@link #memoryHeapCount}. */
	public static int nmemoryHeapCount(long struct) { return memGetInt(struct + VkPhysicalDeviceMemoryProperties.MEMORYHEAPCOUNT); }
	/** Unsafe version of {@link #memoryHeaps}. */
	public static VkMemoryHeap.Buffer nmemoryHeaps(long struct) { return VkMemoryHeap.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYHEAPS, nmemoryHeapCount(struct)); }
	/** Unsafe version of {@link #memoryHeaps(int) memoryHeaps}. */
	public static VkMemoryHeap nmemoryHeaps(long struct, int index) {
		if ( CHECKS ) check(index, VK_MAX_MEMORY_HEAPS);
		return VkMemoryHeap.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYHEAPS + index * VkMemoryHeap.SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link VkPhysicalDeviceMemoryProperties} structs. */
	public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryProperties, Buffer> implements NativeResource {

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
			return new VkPhysicalDeviceMemoryProperties(address, container);
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