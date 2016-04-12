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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDescriptorImageInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDescriptorImageInfo">Vulkan Specification</a>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Each of {@code sampler} and {@code imageView} that are valid handles <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sampler} &ndash; 
 * a sampler handle, and is used in descriptor updates for types {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} and {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} if the binding being
 * updated does not use immutable samplers</li>
 * <li>{@code imageView} &ndash; 
 * an image view handle, and is used in descriptor updates for types {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE},
 * {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, and {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}</li>
 * <li>{@code imageLayout} &ndash; the layout that the image will be in at the time this descriptor is accessed. {@code imageLayout} is used in descriptor updates for types
 * {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, and {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}. One of:<br><table><tr><td>{@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</td><td>{@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDescriptorImageInfo {
    VkSampler sampler;
    VkImageView imageView;
    VkImageLayout imageLayout;
}</code></pre>
 */
public class VkDescriptorImageInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		SAMPLER,
		IMAGEVIEW,
		IMAGELAYOUT;

	static {
		Layout layout = __struct(
			__member(8),
			__member(8),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		SAMPLER = layout.offsetof(0);
		IMAGEVIEW = layout.offsetof(1);
		IMAGELAYOUT = layout.offsetof(2);
	}

	VkDescriptorImageInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDescriptorImageInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDescriptorImageInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sampler} field. */
	public long sampler() { return nsampler(address()); }
	/** Returns the value of the {@code imageView} field. */
	public long imageView() { return nimageView(address()); }
	/** Returns the value of the {@code imageLayout} field. */
	public int imageLayout() { return nimageLayout(address()); }

	/** Sets the specified value to the {@code sampler} field. */
	public VkDescriptorImageInfo sampler(long value) { nsampler(address(), value); return this; }
	/** Sets the specified value to the {@code imageView} field. */
	public VkDescriptorImageInfo imageView(long value) { nimageView(address(), value); return this; }
	/** Sets the specified value to the {@code imageLayout} field. */
	public VkDescriptorImageInfo imageLayout(int value) { nimageLayout(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDescriptorImageInfo set(
		long sampler,
		long imageView,
		int imageLayout
	) {
		sampler(sampler);
		imageView(imageView);
		imageLayout(imageLayout);

		return this;
	}

	/** Unsafe version of {@link #set(VkDescriptorImageInfo) set}. */
	public VkDescriptorImageInfo nset(long struct) {
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
	public VkDescriptorImageInfo set(VkDescriptorImageInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorImageInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDescriptorImageInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorImageInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDescriptorImageInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDescriptorImageInfo} instance allocated with {@link BufferUtils}. */
	public static VkDescriptorImageInfo create() {
		return new VkDescriptorImageInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorImageInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDescriptorImageInfo create(long address) {
		return address == NULL ? null : new VkDescriptorImageInfo(address, null);
	}

	/**
	 * Returns a new {@link VkDescriptorImageInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorImageInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorImageInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDescriptorImageInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorImageInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDescriptorImageInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDescriptorImageInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDescriptorImageInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorImageInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDescriptorImageInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDescriptorImageInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDescriptorImageInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDescriptorImageInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorImageInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorImageInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorImageInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sampler}. */
	public static long nsampler(long struct) { return memGetLong(struct + VkDescriptorImageInfo.SAMPLER); }
	/** Unsafe version of {@link #imageView}. */
	public static long nimageView(long struct) { return memGetLong(struct + VkDescriptorImageInfo.IMAGEVIEW); }
	/** Unsafe version of {@link #imageLayout}. */
	public static int nimageLayout(long struct) { return memGetInt(struct + VkDescriptorImageInfo.IMAGELAYOUT); }

	/** Unsafe version of {@link #sampler(long) sampler}. */
	public static void nsampler(long struct, long value) { memPutLong(struct + VkDescriptorImageInfo.SAMPLER, value); }
	/** Unsafe version of {@link #imageView(long) imageView}. */
	public static void nimageView(long struct, long value) { memPutLong(struct + VkDescriptorImageInfo.IMAGEVIEW, value); }
	/** Unsafe version of {@link #imageLayout(int) imageLayout}. */
	public static void nimageLayout(long struct, int value) { memPutInt(struct + VkDescriptorImageInfo.IMAGELAYOUT, value); }

	// -----------------------------------

	/** An array of {@link VkDescriptorImageInfo} structs. */
	public static final class Buffer extends StructBuffer<VkDescriptorImageInfo, Buffer> {

		/**
		 * Creates a new {@link VkDescriptorImageInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDescriptorImageInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkDescriptorImageInfo newInstance(long address) {
			return new VkDescriptorImageInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sampler} field. */
		public long sampler() { return VkDescriptorImageInfo.nsampler(address()); }
		/** Returns the value of the {@code imageView} field. */
		public long imageView() { return VkDescriptorImageInfo.nimageView(address()); }
		/** Returns the value of the {@code imageLayout} field. */
		public int imageLayout() { return VkDescriptorImageInfo.nimageLayout(address()); }

		/** Sets the specified value to the {@code sampler} field. */
		public VkDescriptorImageInfo.Buffer sampler(long value) { VkDescriptorImageInfo.nsampler(address(), value); return this; }
		/** Sets the specified value to the {@code imageView} field. */
		public VkDescriptorImageInfo.Buffer imageView(long value) { VkDescriptorImageInfo.nimageView(address(), value); return this; }
		/** Sets the specified value to the {@code imageLayout} field. */
		public VkDescriptorImageInfo.Buffer imageLayout(int value) { VkDescriptorImageInfo.nimageLayout(address(), value); return this; }

	}

}