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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkSparseImageFormatProperties.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkSparseImageFormatProperties">Vulkan Specification</a>
 * 
 * <p>Describes properties for a set of image aspects that are bound simultaneously in an image.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code aspectMask} &ndash; a {@code VkImageAspectFlags} specifying which aspects of the image the properties apply to</li>
 * <li>{@code imageGranularity} &ndash; the width, height, and depth of the sparse image block in texels or compressed texel blocks</li>
 * <li>{@code flags} &ndash; a {@code VkSparseImageFormatFlagBits} bitmask specifying additional information about the sparse resource. One or more of:<br><table><tr><td>{@link VK10#VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT}</td></tr><tr><td>{@link VK10#VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT}</td></tr><tr><td>{@link VK10#VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSparseImageFormatProperties {
    VkImageAspectFlags aspectMask;
    {@link VkExtent3D VkExtent3D} imageGranularity;
    VkSparseImageFormatFlags flags;
}</code></pre>
 */
public class VkSparseImageFormatProperties extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ASPECTMASK,
		IMAGEGRANULARITY,
		FLAGS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ASPECTMASK = layout.offsetof(0);
		IMAGEGRANULARITY = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
	}

	VkSparseImageFormatProperties(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSparseImageFormatProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSparseImageFormatProperties(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code aspectMask} field. */
	public int aspectMask() { return naspectMask(address()); }
	/** Returns a {@link VkExtent3D} view of the {@code imageGranularity} field. */
	public VkExtent3D imageGranularity() { return nimageGranularity(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }

	// -----------------------------------

	/** Returns a new {@link VkSparseImageFormatProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSparseImageFormatProperties malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSparseImageFormatProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSparseImageFormatProperties calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSparseImageFormatProperties} instance allocated with {@link BufferUtils}. */
	public static VkSparseImageFormatProperties create() {
		return new VkSparseImageFormatProperties(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSparseImageFormatProperties} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSparseImageFormatProperties create(long address) {
		return address == NULL ? null : new VkSparseImageFormatProperties(address, null);
	}

	/**
	 * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSparseImageFormatProperties.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkSparseImageFormatProperties} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkSparseImageFormatProperties mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkSparseImageFormatProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkSparseImageFormatProperties callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkSparseImageFormatProperties} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSparseImageFormatProperties mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSparseImageFormatProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSparseImageFormatProperties callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #aspectMask}. */
	public static int naspectMask(long struct) { return memGetInt(struct + VkSparseImageFormatProperties.ASPECTMASK); }
	/** Unsafe version of {@link #imageGranularity}. */
	public static VkExtent3D nimageGranularity(long struct) { return VkExtent3D.create(struct + VkSparseImageFormatProperties.IMAGEGRANULARITY); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkSparseImageFormatProperties.FLAGS); }

	// -----------------------------------

	/** An array of {@link VkSparseImageFormatProperties} structs. */
	public static final class Buffer extends StructBuffer<VkSparseImageFormatProperties, Buffer> {

		/**
		 * Creates a new {@link VkSparseImageFormatProperties.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSparseImageFormatProperties#SIZEOF}, and its mark will be undefined.
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
		protected VkSparseImageFormatProperties newInstance(long address) {
			return new VkSparseImageFormatProperties(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code aspectMask} field. */
		public int aspectMask() { return VkSparseImageFormatProperties.naspectMask(address()); }
		/** Returns a {@link VkExtent3D} view of the {@code imageGranularity} field. */
		public VkExtent3D imageGranularity() { return VkSparseImageFormatProperties.nimageGranularity(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkSparseImageFormatProperties.nflags(address()); }

	}

}