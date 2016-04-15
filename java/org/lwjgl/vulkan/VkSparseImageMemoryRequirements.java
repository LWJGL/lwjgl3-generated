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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkSparseImageMemoryRequirements.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkSparseImageMemoryRequirements">Vulkan Specification</a>
 * 
 * <p>Describes the sparse memory requirements for a group of aspects of an image.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code formatProperties} &ndash; the format properties</li>
 * <li>{@code imageMipTailFirstLod} &ndash; the first mip level at which image subresources are included in the mip tail region</li>
 * <li>{@code imageMipTailSize} &ndash; the memory size (in bytes) of the mip tail region</li>
 * <li>{@code imageMipTailOffset} &ndash; he opaque memory offset used with {@link VkSparseImageOpaqueMemoryBindInfo} to bind the mip tail region(s)</li>
 * <li>{@code imageMipTailStride} &ndash; 
 * the offset stride between each array-layer’s mip tail, if {@code formatProperties.flags} does not contain {@link VK10#VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT}
 * (otherwise the value is undefined)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSparseImageMemoryRequirements {
    {@link VkSparseImageFormatProperties VkSparseImageFormatProperties} formatProperties;
    uint32_t imageMipTailFirstLod;
    VkDeviceSize imageMipTailSize;
    VkDeviceSize imageMipTailOffset;
    VkDeviceSize imageMipTailStride;
}</code></pre>
 */
public class VkSparseImageMemoryRequirements extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		FORMATPROPERTIES,
		IMAGEMIPTAILFIRSTLOD,
		IMAGEMIPTAILSIZE,
		IMAGEMIPTAILOFFSET,
		IMAGEMIPTAILSTRIDE;

	static {
		Layout layout = __struct(
			__member(VkSparseImageFormatProperties.SIZEOF, VkSparseImageFormatProperties.ALIGNOF),
			__member(4),
			__member(8),
			__member(8),
			__member(8)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		FORMATPROPERTIES = layout.offsetof(0);
		IMAGEMIPTAILFIRSTLOD = layout.offsetof(1);
		IMAGEMIPTAILSIZE = layout.offsetof(2);
		IMAGEMIPTAILOFFSET = layout.offsetof(3);
		IMAGEMIPTAILSTRIDE = layout.offsetof(4);
	}

	VkSparseImageMemoryRequirements(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSparseImageMemoryRequirements} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSparseImageMemoryRequirements(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link VkSparseImageFormatProperties} view of the {@code formatProperties} field. */
	public VkSparseImageFormatProperties formatProperties() { return nformatProperties(address()); }
	/** Returns the value of the {@code imageMipTailFirstLod} field. */
	public int imageMipTailFirstLod() { return nimageMipTailFirstLod(address()); }
	/** Returns the value of the {@code imageMipTailSize} field. */
	public long imageMipTailSize() { return nimageMipTailSize(address()); }
	/** Returns the value of the {@code imageMipTailOffset} field. */
	public long imageMipTailOffset() { return nimageMipTailOffset(address()); }
	/** Returns the value of the {@code imageMipTailStride} field. */
	public long imageMipTailStride() { return nimageMipTailStride(address()); }

	// -----------------------------------

	/** Returns a new {@link VkSparseImageMemoryRequirements} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSparseImageMemoryRequirements malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSparseImageMemoryRequirements} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSparseImageMemoryRequirements calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSparseImageMemoryRequirements} instance allocated with {@link BufferUtils}. */
	public static VkSparseImageMemoryRequirements create() {
		return new VkSparseImageMemoryRequirements(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSparseImageMemoryRequirements} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSparseImageMemoryRequirements create(long address) {
		return address == NULL ? null : new VkSparseImageMemoryRequirements(address, null);
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSparseImageMemoryRequirements.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkSparseImageMemoryRequirements} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkSparseImageMemoryRequirements mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkSparseImageMemoryRequirements} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkSparseImageMemoryRequirements callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryRequirements} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSparseImageMemoryRequirements mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryRequirements} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSparseImageMemoryRequirements callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #formatProperties}. */
	public static VkSparseImageFormatProperties nformatProperties(long struct) { return VkSparseImageFormatProperties.create(struct + VkSparseImageMemoryRequirements.FORMATPROPERTIES); }
	/** Unsafe version of {@link #imageMipTailFirstLod}. */
	public static int nimageMipTailFirstLod(long struct) { return memGetInt(struct + VkSparseImageMemoryRequirements.IMAGEMIPTAILFIRSTLOD); }
	/** Unsafe version of {@link #imageMipTailSize}. */
	public static long nimageMipTailSize(long struct) { return memGetLong(struct + VkSparseImageMemoryRequirements.IMAGEMIPTAILSIZE); }
	/** Unsafe version of {@link #imageMipTailOffset}. */
	public static long nimageMipTailOffset(long struct) { return memGetLong(struct + VkSparseImageMemoryRequirements.IMAGEMIPTAILOFFSET); }
	/** Unsafe version of {@link #imageMipTailStride}. */
	public static long nimageMipTailStride(long struct) { return memGetLong(struct + VkSparseImageMemoryRequirements.IMAGEMIPTAILSTRIDE); }

	// -----------------------------------

	/** An array of {@link VkSparseImageMemoryRequirements} structs. */
	public static final class Buffer extends StructBuffer<VkSparseImageMemoryRequirements, Buffer> {

		/**
		 * Creates a new {@link VkSparseImageMemoryRequirements.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSparseImageMemoryRequirements#SIZEOF}, and its mark will be undefined.
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
		protected VkSparseImageMemoryRequirements newInstance(long address) {
			return new VkSparseImageMemoryRequirements(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link VkSparseImageFormatProperties} view of the {@code formatProperties} field. */
		public VkSparseImageFormatProperties formatProperties() { return VkSparseImageMemoryRequirements.nformatProperties(address()); }
		/** Returns the value of the {@code imageMipTailFirstLod} field. */
		public int imageMipTailFirstLod() { return VkSparseImageMemoryRequirements.nimageMipTailFirstLod(address()); }
		/** Returns the value of the {@code imageMipTailSize} field. */
		public long imageMipTailSize() { return VkSparseImageMemoryRequirements.nimageMipTailSize(address()); }
		/** Returns the value of the {@code imageMipTailOffset} field. */
		public long imageMipTailOffset() { return VkSparseImageMemoryRequirements.nimageMipTailOffset(address()); }
		/** Returns the value of the {@code imageMipTailStride} field. */
		public long imageMipTailStride() { return VkSparseImageMemoryRequirements.nimageMipTailStride(address()); }

	}

}