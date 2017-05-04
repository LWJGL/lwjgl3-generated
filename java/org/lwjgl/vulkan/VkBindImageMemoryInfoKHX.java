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

/**
 * Structure specifying how to bind an image to memory.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code deviceIndexCount} is greater than zero, then on device index <code>i</code> the image is attached to the instance of memory on the physical device with device index <code>pDeviceIndices[i]</code>.</p>
 * 
 * <p>Let <code>N</code> be the number of physical devices in the logical device. If {@code SFRRectCount} is greater than zero, then {@code pSFRRects} is an array of <code>N<sup>2</sup></code> rectangles, where the image region specified by the rectangle at element <code>i*N+j</code> in resource instance <code>i</code> is bound to memory instance <code>j</code>. The blocks of memory that are bound to each sparse image block region use an offset in memory, relative to {@code memoryOffset}, computed as if the whole image were being bound to a contiguous range of memory. In other words, horizontally adjacent image blocks use consecutive blocks of memory, vertically adjacent image blocks are separated by the number of bytes per block multiplied by the width in blocks of the image, and the block at <code>(0,0)</code> corresponds to memory starting at {@code memoryOffset}.</p>
 * 
 * <p>If {@code SFRRectCount} and {@code deviceIndexCount} are zero and the memory comes from a memory heap with the {@link KHXDeviceGroupCreation#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX} bit set, then it is as if {@code pDeviceIndices} contains consecutive indices from zero to the number of physical devices in the logical device, minus one. In other words, by default each physical device attaches to its own instance of the memory.</p>
 * 
 * <p>If {@code SFRRectCount} and {@code deviceIndexCount} are zero and the memory comes from a memory heap without the {@link KHXDeviceGroupCreation#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX} bit set, then it is as if {@code pDeviceIndices} contains an array of zeros. In other words, by default each physical device attaches to instance zero.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>All valid usage rules from {@link VK10#vkBindImageMemory BindImageMemory} apply to the identically named members of {@link VkBindImageMemoryInfoKHX}</li>
 * <li>At least one of {@code deviceIndexCount} and {@code SFRRectCount} <b>must</b> be zero.</li>
 * <li>{@code deviceIndexCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device</li>
 * <li>All elements of {@code pDeviceIndices} <b>must</b> be valid device indices.</li>
 * <li>{@code SFRRectCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device squared</li>
 * <li>If {@code SFRRectCount} is not zero, then {@code image} <b>must</b> have been created with the {@link KHXDeviceGroup#VK_IMAGE_CREATE_BIND_SFR_BIT_KHX IMAGE_CREATE_BIND_SFR_BIT_KHX} bit set.</li>
 * <li>All elements of {@code pSFRRects} <b>must</b> be valid rectangles contained within the dimensions of the image</li>
 * <li>Elements of {@code pSFRRects} that correspond to the same instance of the image <b>must</b> not overlap and their union <b>must</b> cover the entire image.</li>
 * <li>For each element of {@code pSFRRects}:
 * 
 * <ul>
 * <li>{@code offset.x} <b>must</b> be a multiple of the sparse image block width ({@link VkSparseImageFormatProperties}{@code ::imageGranularity}.width) of all non-metadata aspects of the image</li>
 * <li>{@code extent.width} <b>must</b> either be a multiple of the sparse image block width of all non-metadata aspects of the image, or else {@code extent.width} + {@code offset.x} <b>must</b> equal the width of the image subresource</li>
 * <li>{@code offset.y} <b>must</b> be a multiple of the sparse image block height ({@link VkSparseImageFormatProperties}{@code ::imageGranularity}.height) of all non-metadata aspects of the image</li>
 * <li>{@code extent.height} <b>must</b> either be a multiple of the sparse image block height of all non-metadata aspects of the image, or else {@code extent.height} + {@code offset.y} <b>must</b> equal the height of the image subresource</li>
 * </ul>
 * </li>
 * <li>All instances of memory that are bound <b>must</b> have been allocated</li>
 * <li>If {@code image} was created with a valid swapchain handle in {@link VkImageSwapchainCreateInfoKHX}{@code ::swapchain}, then the image <b>must</b> be bound to memory from that swapchain (using {@link VkBindImageMemorySwapchainInfoKHX}).</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHX STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkBindImageMemorySwapchainInfoKHX}</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * <li>If {@code deviceIndexCount} is not 0, {@code pDeviceIndices} <b>must</b> be a pointer to an array of {@code deviceIndexCount} {@code uint32_t} values</li>
 * <li>If {@code SFRRectCount} is not 0, {@code pSFRRects} <b>must</b> be a pointer to an array of {@code SFRRectCount} {@link VkRect2D} structures</li>
 * <li>Both of {@code image}, and {@code memory} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRect2D}, {@link KHXDeviceGroup#vkBindImageMemory2KHX BindImageMemory2KHX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code image} &ndash; the image to be attached to memory.</li>
 * <li>{@code memory} &ndash; a {@code VkDeviceMemory} object describing the device memory to attach.</li>
 * <li>{@code memoryOffset} &ndash; the start offset of the region of {@code memory} which is to be bound to the image. If {@code SFRRectCount} is zero, the number of bytes returned in the {@link VkMemoryRequirements}{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified image.</li>
 * <li>{@code deviceIndexCount} &ndash; the number of elements in {@code pDeviceIndices}.</li>
 * <li>{@code pDeviceIndices} &ndash; a pointer to an array of device indices.</li>
 * <li>{@code SFRRectCount} &ndash; the number of elements in {@code pSFRRects}.</li>
 * <li>{@code pSFRRects} &ndash; a pointer to an array of rectangles describing which regions of the image are attached to each instance of memory.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkBindImageMemoryInfoKHX {
    VkStructureType sType;
    const void * pNext;
    VkImage image;
    VkDeviceMemory memory;
    VkDeviceSize memoryOffset;
    uint32_t deviceIndexCount;
    const uint32_t * pDeviceIndices;
    uint32_t SFRRectCount;
    const {@link VkRect2D VkRect2D} * pSFRRects;
}</code></pre>
 */
public class VkBindImageMemoryInfoKHX extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		IMAGE,
		MEMORY,
		MEMORYOFFSET,
		DEVICEINDEXCOUNT,
		PDEVICEINDICES,
		SFRRECTCOUNT,
		PSFRRECTS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(8),
			__member(8),
			__member(8),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		IMAGE = layout.offsetof(2);
		MEMORY = layout.offsetof(3);
		MEMORYOFFSET = layout.offsetof(4);
		DEVICEINDEXCOUNT = layout.offsetof(5);
		PDEVICEINDICES = layout.offsetof(6);
		SFRRECTCOUNT = layout.offsetof(7);
		PSFRRECTS = layout.offsetof(8);
	}

	VkBindImageMemoryInfoKHX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkBindImageMemoryInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkBindImageMemoryInfoKHX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code image} field. */
	public long image() { return nimage(address()); }
	/** Returns the value of the {@code memory} field. */
	public long memory() { return nmemory(address()); }
	/** Returns the value of the {@code memoryOffset} field. */
	public long memoryOffset() { return nmemoryOffset(address()); }
	/** Returns the value of the {@code deviceIndexCount} field. */
	public int deviceIndexCount() { return ndeviceIndexCount(address()); }
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
	public IntBuffer pDeviceIndices() { return npDeviceIndices(address()); }
	/** Returns the value of the {@code SFRRectCount} field. */
	public int SFRRectCount() { return nSFRRectCount(address()); }
	/** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pSFRRects} field. */
	public VkRect2D.Buffer pSFRRects() { return npSFRRects(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkBindImageMemoryInfoKHX sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkBindImageMemoryInfoKHX pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code image} field. */
	public VkBindImageMemoryInfoKHX image(long value) { nimage(address(), value); return this; }
	/** Sets the specified value to the {@code memory} field. */
	public VkBindImageMemoryInfoKHX memory(long value) { nmemory(address(), value); return this; }
	/** Sets the specified value to the {@code memoryOffset} field. */
	public VkBindImageMemoryInfoKHX memoryOffset(long value) { nmemoryOffset(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
	public VkBindImageMemoryInfoKHX pDeviceIndices(IntBuffer value) { npDeviceIndices(address(), value); return this; }
	/** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pSFRRects} field. */
	public VkBindImageMemoryInfoKHX pSFRRects(VkRect2D.Buffer value) { npSFRRects(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkBindImageMemoryInfoKHX set(
		int sType,
		long pNext,
		long image,
		long memory,
		long memoryOffset,
		IntBuffer pDeviceIndices,
		VkRect2D.Buffer pSFRRects
	) {
		sType(sType);
		pNext(pNext);
		image(image);
		memory(memory);
		memoryOffset(memoryOffset);
		pDeviceIndices(pDeviceIndices);
		pSFRRects(pSFRRects);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkBindImageMemoryInfoKHX set(VkBindImageMemoryInfoKHX src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkBindImageMemoryInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkBindImageMemoryInfoKHX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkBindImageMemoryInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkBindImageMemoryInfoKHX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkBindImageMemoryInfoKHX} instance allocated with {@link BufferUtils}. */
	public static VkBindImageMemoryInfoKHX create() {
		return new VkBindImageMemoryInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkBindImageMemoryInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkBindImageMemoryInfoKHX create(long address) {
		return address == NULL ? null : new VkBindImageMemoryInfoKHX(address, null);
	}

	/**
	 * Returns a new {@link VkBindImageMemoryInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBindImageMemoryInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBindImageMemoryInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkBindImageMemoryInfoKHX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkBindImageMemoryInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkBindImageMemoryInfoKHX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkBindImageMemoryInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkBindImageMemoryInfoKHX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkBindImageMemoryInfoKHX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkBindImageMemoryInfoKHX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkBindImageMemoryInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkBindImageMemoryInfoKHX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkBindImageMemoryInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkBindImageMemoryInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkBindImageMemoryInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBindImageMemoryInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkBindImageMemoryInfoKHX.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkBindImageMemoryInfoKHX.PNEXT); }
	/** Unsafe version of {@link #image}. */
	public static long nimage(long struct) { return memGetLong(struct + VkBindImageMemoryInfoKHX.IMAGE); }
	/** Unsafe version of {@link #memory}. */
	public static long nmemory(long struct) { return memGetLong(struct + VkBindImageMemoryInfoKHX.MEMORY); }
	/** Unsafe version of {@link #memoryOffset}. */
	public static long nmemoryOffset(long struct) { return memGetLong(struct + VkBindImageMemoryInfoKHX.MEMORYOFFSET); }
	/** Unsafe version of {@link #deviceIndexCount}. */
	public static int ndeviceIndexCount(long struct) { return memGetInt(struct + VkBindImageMemoryInfoKHX.DEVICEINDEXCOUNT); }
	/** Unsafe version of {@link #pDeviceIndices() pDeviceIndices}. */
	public static IntBuffer npDeviceIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkBindImageMemoryInfoKHX.PDEVICEINDICES), ndeviceIndexCount(struct)); }
	/** Unsafe version of {@link #SFRRectCount}. */
	public static int nSFRRectCount(long struct) { return memGetInt(struct + VkBindImageMemoryInfoKHX.SFRRECTCOUNT); }
	/** Unsafe version of {@link #pSFRRects}. */
	public static VkRect2D.Buffer npSFRRects(long struct) { return VkRect2D.create(memGetAddress(struct + VkBindImageMemoryInfoKHX.PSFRRECTS), nSFRRectCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkBindImageMemoryInfoKHX.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkBindImageMemoryInfoKHX.PNEXT, value); }
	/** Unsafe version of {@link #image(long) image}. */
	public static void nimage(long struct, long value) { memPutLong(struct + VkBindImageMemoryInfoKHX.IMAGE, value); }
	/** Unsafe version of {@link #memory(long) memory}. */
	public static void nmemory(long struct, long value) { memPutLong(struct + VkBindImageMemoryInfoKHX.MEMORY, value); }
	/** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
	public static void nmemoryOffset(long struct, long value) { memPutLong(struct + VkBindImageMemoryInfoKHX.MEMORYOFFSET, value); }
	/** Sets the specified value to the {@code deviceIndexCount} field of the specified {@code struct}. */
	public static void ndeviceIndexCount(long struct, int value) { memPutInt(struct + VkBindImageMemoryInfoKHX.DEVICEINDEXCOUNT, value); }
	/** Unsafe version of {@link #pDeviceIndices(IntBuffer) pDeviceIndices}. */
	public static void npDeviceIndices(long struct, IntBuffer value) { memPutAddress(struct + VkBindImageMemoryInfoKHX.PDEVICEINDICES, memAddressSafe(value)); ndeviceIndexCount(struct, value == null ? 0 : value.remaining()); }
	/** Sets the specified value to the {@code SFRRectCount} field of the specified {@code struct}. */
	public static void nSFRRectCount(long struct, int value) { memPutInt(struct + VkBindImageMemoryInfoKHX.SFRRECTCOUNT, value); }
	/** Unsafe version of {@link #pSFRRects(VkRect2D.Buffer) pSFRRects}. */
	public static void npSFRRects(long struct, VkRect2D.Buffer value) { memPutAddress(struct + VkBindImageMemoryInfoKHX.PSFRRECTS, addressSafe(value)); nSFRRectCount(struct, value == null ? 0 : value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( ndeviceIndexCount(struct) != 0 )
			check(memGetAddress(struct + VkBindImageMemoryInfoKHX.PDEVICEINDICES));
		if ( nSFRRectCount(struct) != 0 )
			check(memGetAddress(struct + VkBindImageMemoryInfoKHX.PSFRRECTS));
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

	/** An array of {@link VkBindImageMemoryInfoKHX} structs. */
	public static class Buffer extends StructBuffer<VkBindImageMemoryInfoKHX, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkBindImageMemoryInfoKHX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkBindImageMemoryInfoKHX#SIZEOF}, and its mark will be undefined.
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
		protected VkBindImageMemoryInfoKHX newInstance(long address) {
			return new VkBindImageMemoryInfoKHX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkBindImageMemoryInfoKHX.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkBindImageMemoryInfoKHX.npNext(address()); }
		/** Returns the value of the {@code image} field. */
		public long image() { return VkBindImageMemoryInfoKHX.nimage(address()); }
		/** Returns the value of the {@code memory} field. */
		public long memory() { return VkBindImageMemoryInfoKHX.nmemory(address()); }
		/** Returns the value of the {@code memoryOffset} field. */
		public long memoryOffset() { return VkBindImageMemoryInfoKHX.nmemoryOffset(address()); }
		/** Returns the value of the {@code deviceIndexCount} field. */
		public int deviceIndexCount() { return VkBindImageMemoryInfoKHX.ndeviceIndexCount(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
		public IntBuffer pDeviceIndices() { return VkBindImageMemoryInfoKHX.npDeviceIndices(address()); }
		/** Returns the value of the {@code SFRRectCount} field. */
		public int SFRRectCount() { return VkBindImageMemoryInfoKHX.nSFRRectCount(address()); }
		/** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pSFRRects} field. */
		public VkRect2D.Buffer pSFRRects() { return VkBindImageMemoryInfoKHX.npSFRRects(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkBindImageMemoryInfoKHX.Buffer sType(int value) { VkBindImageMemoryInfoKHX.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkBindImageMemoryInfoKHX.Buffer pNext(long value) { VkBindImageMemoryInfoKHX.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code image} field. */
		public VkBindImageMemoryInfoKHX.Buffer image(long value) { VkBindImageMemoryInfoKHX.nimage(address(), value); return this; }
		/** Sets the specified value to the {@code memory} field. */
		public VkBindImageMemoryInfoKHX.Buffer memory(long value) { VkBindImageMemoryInfoKHX.nmemory(address(), value); return this; }
		/** Sets the specified value to the {@code memoryOffset} field. */
		public VkBindImageMemoryInfoKHX.Buffer memoryOffset(long value) { VkBindImageMemoryInfoKHX.nmemoryOffset(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
		public VkBindImageMemoryInfoKHX.Buffer pDeviceIndices(IntBuffer value) { VkBindImageMemoryInfoKHX.npDeviceIndices(address(), value); return this; }
		/** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pSFRRects} field. */
		public VkBindImageMemoryInfoKHX.Buffer pSFRRects(VkRect2D.Buffer value) { VkBindImageMemoryInfoKHX.npSFRRects(address(), value); return this; }

	}

}