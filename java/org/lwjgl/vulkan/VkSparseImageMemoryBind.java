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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkSparseImageMemoryBind.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkSparseImageMemoryBind">Vulkan Specification</a>
 * 
 * <p>Describes a memory binding to a sparse image block of a {@code VkImage} object.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code subresource} <b>must</b> be a valid {@link VkImageSubresource} structure</li>
 * <li>If {@code memory} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSparseMemoryBindFlagBits} values</li>
 * <li>If the sparse aliased residency feature is not enabled, and if any other resources are bound to ranges of {@code memory}, the range of
 * {@code memory} being bound <b>must not</b> overlap with those bound ranges</li>
 * <li>{@code memory} and {@code memoryOffset} <b>must</b> match the memory requirements of the calling command's {@code image}</li>
 * <li>{@code subresource} <b>must</b> be a valid image subresource for {@code image}</li>
 * <li>{@code offset.x} <b>must</b> be a multiple of the sparse image block width ({@link VkSparseImageFormatProperties}{@code ::imageGranularity}.width) of the image</li>
 * <li>{@code extent.width} <b>must</b> either be a multiple of the sparse image block width of the image, or else {@code extent.width} + {@code offset.x} <b>must</b>
 * equal the width of the image subresource</li>
 * <li>{@code offset.y} <b>must</b> be a multiple of the sparse image block height ({@link VkSparseImageFormatProperties}{@code ::imageGranularity}.height) of the
 * image</li>
 * <li>{@code extent.height} <b>must</b> either be a multiple of the sparse image block height of the image, or else {@code extent.height} + {@code offset.y}
 * <b>must</b> equal the height of the image subresource</li>
 * <li>{@code offset.z} <b>must</b> be a multiple of the sparse image block depth ({@link VkSparseImageFormatProperties}{@code ::imageGranularity}.depth) of the image</li>
 * <li>{@code extent.depth} <b>must</b> either be a multiple of the sparse image block depth of the image, or else {@code extent.depth} + {@code offset.z} <b>must</b>
 * equal the depth of the image subresource</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code subresource} &ndash; the {@code aspectMask} and region of interest in the image</li>
 * <li>{@code offset} &ndash; the coordinates of the first texel within the image subresource to bind</li>
 * <li>{@code extent} &ndash; 
 * the size in texels of the region within the image subresource to bind. The extent must be a multiple of the sparse image block dimensions, except when
 * binding sparse image blocks along the edge of an image subresource it can instead be such that any coordinate of {@code offset + extent} equals the
 * corresponding dimensions of the image subresource.</li>
 * <li>{@code memory} &ndash; 
 * the {@code VkDeviceMemory} object that the sparse image blocks of the image are bound to. If memory is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the sparse image blocks are
 * unbound.</li>
 * <li>{@code memoryOffset} &ndash; an offset into {@code VkDeviceMemory} object. If {@code memory} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, this value is ignored.</li>
 * <li>{@code flags} &ndash; sparse memory binding flags. One or more of:<br><table><tr><td>{@link VK10#VK_SPARSE_MEMORY_BIND_METADATA_BIT SPARSE_MEMORY_BIND_METADATA_BIT}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSparseImageMemoryBind {
    {@link VkImageSubresource VkImageSubresource} subresource;
    {@link VkOffset3D VkOffset3D} offset;
    {@link VkExtent3D VkExtent3D} extent;
    VkDeviceMemory memory;
    VkDeviceSize memoryOffset;
    VkSparseMemoryBindFlags flags;
}</code></pre>
 */
public class VkSparseImageMemoryBind extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		SUBRESOURCE,
		OFFSET,
		EXTENT,
		MEMORY,
		MEMORYOFFSET,
		FLAGS;

	static {
		Layout layout = __struct(
			__member(VkImageSubresource.SIZEOF, VkImageSubresource.ALIGNOF),
			__member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
			__member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF),
			__member(8),
			__member(8),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		SUBRESOURCE = layout.offsetof(0);
		OFFSET = layout.offsetof(1);
		EXTENT = layout.offsetof(2);
		MEMORY = layout.offsetof(3);
		MEMORYOFFSET = layout.offsetof(4);
		FLAGS = layout.offsetof(5);
	}

	VkSparseImageMemoryBind(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSparseImageMemoryBind} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSparseImageMemoryBind(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link VkImageSubresource} view of the {@code subresource} field. */
	public VkImageSubresource subresource() { return nsubresource(address()); }
	/** Returns a {@link VkOffset3D} view of the {@code offset} field. */
	public VkOffset3D offset() { return noffset(address()); }
	/** Returns a {@link VkExtent3D} view of the {@code extent} field. */
	public VkExtent3D extent() { return nextent(address()); }
	/** Returns the value of the {@code memory} field. */
	public long memory() { return nmemory(address()); }
	/** Returns the value of the {@code memoryOffset} field. */
	public long memoryOffset() { return nmemoryOffset(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }

	/** Copies the specified {@link VkImageSubresource} to the {@code subresource} field. */
	public VkSparseImageMemoryBind subresource(VkImageSubresource value) { nsubresource(address(), value); return this; }
	/** Copies the specified {@link VkOffset3D} to the {@code offset} field. */
	public VkSparseImageMemoryBind offset(VkOffset3D value) { noffset(address(), value); return this; }
	/** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
	public VkSparseImageMemoryBind extent(VkExtent3D value) { nextent(address(), value); return this; }
	/** Sets the specified value to the {@code memory} field. */
	public VkSparseImageMemoryBind memory(long value) { nmemory(address(), value); return this; }
	/** Sets the specified value to the {@code memoryOffset} field. */
	public VkSparseImageMemoryBind memoryOffset(long value) { nmemoryOffset(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkSparseImageMemoryBind flags(int value) { nflags(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSparseImageMemoryBind set(
		VkImageSubresource subresource,
		VkOffset3D offset,
		VkExtent3D extent,
		long memory,
		long memoryOffset,
		int flags
	) {
		subresource(subresource);
		offset(offset);
		extent(extent);
		memory(memory);
		memoryOffset(memoryOffset);
		flags(flags);

		return this;
	}

	/** Unsafe version of {@link #set(VkSparseImageMemoryBind) set}. */
	public VkSparseImageMemoryBind nset(long struct) {
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
	public VkSparseImageMemoryBind set(VkSparseImageMemoryBind src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkSparseImageMemoryBind} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSparseImageMemoryBind malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSparseImageMemoryBind} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSparseImageMemoryBind calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSparseImageMemoryBind} instance allocated with {@link BufferUtils}. */
	public static VkSparseImageMemoryBind create() {
		return new VkSparseImageMemoryBind(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSparseImageMemoryBind} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSparseImageMemoryBind create(long address) {
		return address == NULL ? null : new VkSparseImageMemoryBind(address, null);
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryBind.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryBind.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryBind.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSparseImageMemoryBind.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkSparseImageMemoryBind} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkSparseImageMemoryBind mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkSparseImageMemoryBind} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkSparseImageMemoryBind callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryBind} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSparseImageMemoryBind mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryBind} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSparseImageMemoryBind callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryBind.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryBind.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryBind.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryBind.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #subresource}. */
	public static VkImageSubresource nsubresource(long struct) { return VkImageSubresource.create(struct + VkSparseImageMemoryBind.SUBRESOURCE); }
	/** Unsafe version of {@link #offset}. */
	public static VkOffset3D noffset(long struct) { return VkOffset3D.create(struct + VkSparseImageMemoryBind.OFFSET); }
	/** Unsafe version of {@link #extent}. */
	public static VkExtent3D nextent(long struct) { return VkExtent3D.create(struct + VkSparseImageMemoryBind.EXTENT); }
	/** Unsafe version of {@link #memory}. */
	public static long nmemory(long struct) { return memGetLong(struct + VkSparseImageMemoryBind.MEMORY); }
	/** Unsafe version of {@link #memoryOffset}. */
	public static long nmemoryOffset(long struct) { return memGetLong(struct + VkSparseImageMemoryBind.MEMORYOFFSET); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkSparseImageMemoryBind.FLAGS); }

	/** Unsafe version of {@link #subresource(VkImageSubresource) subresource}. */
	public static void nsubresource(long struct, VkImageSubresource value) { memCopy(value.address(), struct + VkSparseImageMemoryBind.SUBRESOURCE, VkImageSubresource.SIZEOF); }
	/** Unsafe version of {@link #offset(VkOffset3D) offset}. */
	public static void noffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkSparseImageMemoryBind.OFFSET, VkOffset3D.SIZEOF); }
	/** Unsafe version of {@link #extent(VkExtent3D) extent}. */
	public static void nextent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkSparseImageMemoryBind.EXTENT, VkExtent3D.SIZEOF); }
	/** Unsafe version of {@link #memory(long) memory}. */
	public static void nmemory(long struct, long value) { memPutLong(struct + VkSparseImageMemoryBind.MEMORY, value); }
	/** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
	public static void nmemoryOffset(long struct, long value) { memPutLong(struct + VkSparseImageMemoryBind.MEMORYOFFSET, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkSparseImageMemoryBind.FLAGS, value); }

	// -----------------------------------

	/** An array of {@link VkSparseImageMemoryBind} structs. */
	public static final class Buffer extends StructBuffer<VkSparseImageMemoryBind, Buffer> {

		/**
		 * Creates a new {@link VkSparseImageMemoryBind.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSparseImageMemoryBind#SIZEOF}, and its mark will be undefined.
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
		protected VkSparseImageMemoryBind newInstance(long address) {
			return new VkSparseImageMemoryBind(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link VkImageSubresource} view of the {@code subresource} field. */
		public VkImageSubresource subresource() { return VkSparseImageMemoryBind.nsubresource(address()); }
		/** Returns a {@link VkOffset3D} view of the {@code offset} field. */
		public VkOffset3D offset() { return VkSparseImageMemoryBind.noffset(address()); }
		/** Returns a {@link VkExtent3D} view of the {@code extent} field. */
		public VkExtent3D extent() { return VkSparseImageMemoryBind.nextent(address()); }
		/** Returns the value of the {@code memory} field. */
		public long memory() { return VkSparseImageMemoryBind.nmemory(address()); }
		/** Returns the value of the {@code memoryOffset} field. */
		public long memoryOffset() { return VkSparseImageMemoryBind.nmemoryOffset(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkSparseImageMemoryBind.nflags(address()); }

		/** Copies the specified {@link VkImageSubresource} to the {@code subresource} field. */
		public VkSparseImageMemoryBind.Buffer subresource(VkImageSubresource value) { VkSparseImageMemoryBind.nsubresource(address(), value); return this; }
		/** Copies the specified {@link VkOffset3D} to the {@code offset} field. */
		public VkSparseImageMemoryBind.Buffer offset(VkOffset3D value) { VkSparseImageMemoryBind.noffset(address(), value); return this; }
		/** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
		public VkSparseImageMemoryBind.Buffer extent(VkExtent3D value) { VkSparseImageMemoryBind.nextent(address(), value); return this; }
		/** Sets the specified value to the {@code memory} field. */
		public VkSparseImageMemoryBind.Buffer memory(long value) { VkSparseImageMemoryBind.nmemory(address(), value); return this; }
		/** Sets the specified value to the {@code memoryOffset} field. */
		public VkSparseImageMemoryBind.Buffer memoryOffset(long value) { VkSparseImageMemoryBind.nmemoryOffset(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkSparseImageMemoryBind.Buffer flags(int value) { VkSparseImageMemoryBind.nflags(address(), value); return this; }

	}

}