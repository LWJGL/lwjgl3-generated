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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkImageSubresourceLayers.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkImageSubresourceLayers">Vulkan Specification</a>
 * 
 * <p>Specifies an image subresource of an image.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
 * <li>{@code aspectMask} <b>must not</b> be 0</li>
 * <li>If {@code aspectMask} contains {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}, it <b>must not</b> contain either of {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} or {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>{@code aspectMask} <b>must not</b> contain {@link VK10#VK_IMAGE_ASPECT_METADATA_BIT IMAGE_ASPECT_METADATA_BIT}</li>
 * <li>{@code mipLevel} <b>must</b> be less than the {@code mipLevels} specified in {@code VkImageCreateInfo} when the image was created</li>
 * <li>{@code baseArrayLayer + layerCount} <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@code VkImageCreateInfo} when
 * the image was created</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code aspectMask} &ndash; a combination of {@code VkImageAspectFlagBits}, selecting the color, depth and/or stencil aspects. One or more of:<br><table><tr><td>{@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</td><td>{@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT}</td><td>{@link VK10#VK_IMAGE_ASPECT_METADATA_BIT IMAGE_ASPECT_METADATA_BIT}</td></tr><tr><td>{@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</td></tr></table></li>
 * <li>{@code mipLevel} &ndash; the mipmap level</li>
 * <li>{@code baseArrayLayer} &ndash; the starting layer</li>
 * <li>{@code layerCount} &ndash; the number of layers</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkImageSubresourceLayers {
    VkImageAspectFlags aspectMask;
    uint32_t mipLevel;
    uint32_t baseArrayLayer;
    uint32_t layerCount;
}</code></pre>
 */
public class VkImageSubresourceLayers extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ASPECTMASK,
		MIPLEVEL,
		BASEARRAYLAYER,
		LAYERCOUNT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ASPECTMASK = layout.offsetof(0);
		MIPLEVEL = layout.offsetof(1);
		BASEARRAYLAYER = layout.offsetof(2);
		LAYERCOUNT = layout.offsetof(3);
	}

	VkImageSubresourceLayers(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImageSubresourceLayers} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImageSubresourceLayers(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code aspectMask} field. */
	public int aspectMask() { return naspectMask(address()); }
	/** Returns the value of the {@code mipLevel} field. */
	public int mipLevel() { return nmipLevel(address()); }
	/** Returns the value of the {@code baseArrayLayer} field. */
	public int baseArrayLayer() { return nbaseArrayLayer(address()); }
	/** Returns the value of the {@code layerCount} field. */
	public int layerCount() { return nlayerCount(address()); }

	/** Sets the specified value to the {@code aspectMask} field. */
	public VkImageSubresourceLayers aspectMask(int value) { naspectMask(address(), value); return this; }
	/** Sets the specified value to the {@code mipLevel} field. */
	public VkImageSubresourceLayers mipLevel(int value) { nmipLevel(address(), value); return this; }
	/** Sets the specified value to the {@code baseArrayLayer} field. */
	public VkImageSubresourceLayers baseArrayLayer(int value) { nbaseArrayLayer(address(), value); return this; }
	/** Sets the specified value to the {@code layerCount} field. */
	public VkImageSubresourceLayers layerCount(int value) { nlayerCount(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkImageSubresourceLayers set(
		int aspectMask,
		int mipLevel,
		int baseArrayLayer,
		int layerCount
	) {
		aspectMask(aspectMask);
		mipLevel(mipLevel);
		baseArrayLayer(baseArrayLayer);
		layerCount(layerCount);

		return this;
	}

	/** Unsafe version of {@link #set(VkImageSubresourceLayers) set}. */
	public VkImageSubresourceLayers nset(long struct) {
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
	public VkImageSubresourceLayers set(VkImageSubresourceLayers src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkImageSubresourceLayers} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkImageSubresourceLayers malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImageSubresourceLayers} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkImageSubresourceLayers calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImageSubresourceLayers} instance allocated with {@link BufferUtils}. */
	public static VkImageSubresourceLayers create() {
		return new VkImageSubresourceLayers(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImageSubresourceLayers} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImageSubresourceLayers create(long address) {
		return address == NULL ? null : new VkImageSubresourceLayers(address, null);
	}

	/**
	 * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImageSubresourceLayers.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkImageSubresourceLayers} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkImageSubresourceLayers mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkImageSubresourceLayers} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkImageSubresourceLayers callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkImageSubresourceLayers} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImageSubresourceLayers mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImageSubresourceLayers} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImageSubresourceLayers callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #aspectMask}. */
	public static int naspectMask(long struct) { return memGetInt(struct + VkImageSubresourceLayers.ASPECTMASK); }
	/** Unsafe version of {@link #mipLevel}. */
	public static int nmipLevel(long struct) { return memGetInt(struct + VkImageSubresourceLayers.MIPLEVEL); }
	/** Unsafe version of {@link #baseArrayLayer}. */
	public static int nbaseArrayLayer(long struct) { return memGetInt(struct + VkImageSubresourceLayers.BASEARRAYLAYER); }
	/** Unsafe version of {@link #layerCount}. */
	public static int nlayerCount(long struct) { return memGetInt(struct + VkImageSubresourceLayers.LAYERCOUNT); }

	/** Unsafe version of {@link #aspectMask(int) aspectMask}. */
	public static void naspectMask(long struct, int value) { memPutInt(struct + VkImageSubresourceLayers.ASPECTMASK, value); }
	/** Unsafe version of {@link #mipLevel(int) mipLevel}. */
	public static void nmipLevel(long struct, int value) { memPutInt(struct + VkImageSubresourceLayers.MIPLEVEL, value); }
	/** Unsafe version of {@link #baseArrayLayer(int) baseArrayLayer}. */
	public static void nbaseArrayLayer(long struct, int value) { memPutInt(struct + VkImageSubresourceLayers.BASEARRAYLAYER, value); }
	/** Unsafe version of {@link #layerCount(int) layerCount}. */
	public static void nlayerCount(long struct, int value) { memPutInt(struct + VkImageSubresourceLayers.LAYERCOUNT, value); }

	// -----------------------------------

	/** An array of {@link VkImageSubresourceLayers} structs. */
	public static final class Buffer extends StructBuffer<VkImageSubresourceLayers, Buffer> {

		/**
		 * Creates a new {@link VkImageSubresourceLayers.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImageSubresourceLayers#SIZEOF}, and its mark will be undefined.
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
		protected VkImageSubresourceLayers newInstance(long address) {
			return new VkImageSubresourceLayers(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code aspectMask} field. */
		public int aspectMask() { return VkImageSubresourceLayers.naspectMask(address()); }
		/** Returns the value of the {@code mipLevel} field. */
		public int mipLevel() { return VkImageSubresourceLayers.nmipLevel(address()); }
		/** Returns the value of the {@code baseArrayLayer} field. */
		public int baseArrayLayer() { return VkImageSubresourceLayers.nbaseArrayLayer(address()); }
		/** Returns the value of the {@code layerCount} field. */
		public int layerCount() { return VkImageSubresourceLayers.nlayerCount(address()); }

		/** Sets the specified value to the {@code aspectMask} field. */
		public VkImageSubresourceLayers.Buffer aspectMask(int value) { VkImageSubresourceLayers.naspectMask(address(), value); return this; }
		/** Sets the specified value to the {@code mipLevel} field. */
		public VkImageSubresourceLayers.Buffer mipLevel(int value) { VkImageSubresourceLayers.nmipLevel(address(), value); return this; }
		/** Sets the specified value to the {@code baseArrayLayer} field. */
		public VkImageSubresourceLayers.Buffer baseArrayLayer(int value) { VkImageSubresourceLayers.nbaseArrayLayer(address(), value); return this; }
		/** Sets the specified value to the {@code layerCount} field. */
		public VkImageSubresourceLayers.Buffer layerCount(int value) { VkImageSubresourceLayers.nlayerCount(address(), value); return this; }

	}

}