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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkImageSubresource.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkImageSubresource">Vulkan Specification</a>
 * 
 * <p>Selects a specific image of an image subresource (mipLevel/arrayLayer) of an image created with linear tiling.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
 * <li>{@code aspectMask} <b>must not</b> be 0</li>
 * <li>{@code mipLevel} <b>must</b> be less than the {@code mipLevels} specified in {@code VkImageCreateInfo} when the image was created</li>
 * <li>{@code arrayLayer} <b>must</b> be less than the {@code arrayLayers} specified in {@code VkImageCreateInfo} when the image was created</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code aspectMask} &ndash; a {@code VkImageAspectFlags} selecting the image aspect. One or more of:<br><table><tr><td>{@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</td><td>{@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT}</td><td>{@link VK10#VK_IMAGE_ASPECT_METADATA_BIT IMAGE_ASPECT_METADATA_BIT}</td></tr><tr><td>{@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</td></tr></table></li>
 * <li>{@code mipLevel} &ndash; selects the mipmap level</li>
 * <li>{@code arrayLayer} &ndash; selects the array layer</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkImageSubresource {
    VkImageAspectFlags aspectMask;
    uint32_t mipLevel;
    uint32_t arrayLayer;
}</code></pre>
 */
public class VkImageSubresource extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ASPECTMASK,
		MIPLEVEL,
		ARRAYLAYER;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ASPECTMASK = layout.offsetof(0);
		MIPLEVEL = layout.offsetof(1);
		ARRAYLAYER = layout.offsetof(2);
	}

	VkImageSubresource(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImageSubresource} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImageSubresource(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code aspectMask} field. */
	public int aspectMask() { return naspectMask(address()); }
	/** Returns the value of the {@code mipLevel} field. */
	public int mipLevel() { return nmipLevel(address()); }
	/** Returns the value of the {@code arrayLayer} field. */
	public int arrayLayer() { return narrayLayer(address()); }

	/** Sets the specified value to the {@code aspectMask} field. */
	public VkImageSubresource aspectMask(int value) { naspectMask(address(), value); return this; }
	/** Sets the specified value to the {@code mipLevel} field. */
	public VkImageSubresource mipLevel(int value) { nmipLevel(address(), value); return this; }
	/** Sets the specified value to the {@code arrayLayer} field. */
	public VkImageSubresource arrayLayer(int value) { narrayLayer(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkImageSubresource set(
		int aspectMask,
		int mipLevel,
		int arrayLayer
	) {
		aspectMask(aspectMask);
		mipLevel(mipLevel);
		arrayLayer(arrayLayer);

		return this;
	}

	/** Unsafe version of {@link #set(VkImageSubresource) set}. */
	public VkImageSubresource nset(long struct) {
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
	public VkImageSubresource set(VkImageSubresource src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkImageSubresource} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkImageSubresource malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImageSubresource} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkImageSubresource calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImageSubresource} instance allocated with {@link BufferUtils}. */
	public static VkImageSubresource create() {
		return new VkImageSubresource(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImageSubresource} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImageSubresource create(long address) {
		return address == NULL ? null : new VkImageSubresource(address, null);
	}

	/**
	 * Returns a new {@link VkImageSubresource.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageSubresource.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageSubresource.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImageSubresource.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkImageSubresource} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkImageSubresource mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkImageSubresource} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkImageSubresource callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkImageSubresource} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImageSubresource mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImageSubresource} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImageSubresource callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImageSubresource.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImageSubresource.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImageSubresource.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageSubresource.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #aspectMask}. */
	public static int naspectMask(long struct) { return memGetInt(struct + VkImageSubresource.ASPECTMASK); }
	/** Unsafe version of {@link #mipLevel}. */
	public static int nmipLevel(long struct) { return memGetInt(struct + VkImageSubresource.MIPLEVEL); }
	/** Unsafe version of {@link #arrayLayer}. */
	public static int narrayLayer(long struct) { return memGetInt(struct + VkImageSubresource.ARRAYLAYER); }

	/** Unsafe version of {@link #aspectMask(int) aspectMask}. */
	public static void naspectMask(long struct, int value) { memPutInt(struct + VkImageSubresource.ASPECTMASK, value); }
	/** Unsafe version of {@link #mipLevel(int) mipLevel}. */
	public static void nmipLevel(long struct, int value) { memPutInt(struct + VkImageSubresource.MIPLEVEL, value); }
	/** Unsafe version of {@link #arrayLayer(int) arrayLayer}. */
	public static void narrayLayer(long struct, int value) { memPutInt(struct + VkImageSubresource.ARRAYLAYER, value); }

	// -----------------------------------

	/** An array of {@link VkImageSubresource} structs. */
	public static final class Buffer extends StructBuffer<VkImageSubresource, Buffer> {

		/**
		 * Creates a new {@link VkImageSubresource.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImageSubresource#SIZEOF}, and its mark will be undefined.
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
		protected VkImageSubresource newInstance(long address) {
			return new VkImageSubresource(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code aspectMask} field. */
		public int aspectMask() { return VkImageSubresource.naspectMask(address()); }
		/** Returns the value of the {@code mipLevel} field. */
		public int mipLevel() { return VkImageSubresource.nmipLevel(address()); }
		/** Returns the value of the {@code arrayLayer} field. */
		public int arrayLayer() { return VkImageSubresource.narrayLayer(address()); }

		/** Sets the specified value to the {@code aspectMask} field. */
		public VkImageSubresource.Buffer aspectMask(int value) { VkImageSubresource.naspectMask(address(), value); return this; }
		/** Sets the specified value to the {@code mipLevel} field. */
		public VkImageSubresource.Buffer mipLevel(int value) { VkImageSubresource.nmipLevel(address(), value); return this; }
		/** Sets the specified value to the {@code arrayLayer} field. */
		public VkImageSubresource.Buffer arrayLayer(int value) { VkImageSubresource.narrayLayer(address(), value); return this; }

	}

}