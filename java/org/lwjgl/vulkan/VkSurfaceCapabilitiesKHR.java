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

/**
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct VkSurfaceCapabilitiesKHR {
 *     uint32_t minImageCount;
 *     uint32_t maxImageCount;
 *     {@link VkExtent2D VkExtent2D} currentExtent;
 *     {@link VkExtent2D VkExtent2D} minImageExtent;
 *     {@link VkExtent2D VkExtent2D} maxImageExtent;
 *     uint32_t maxImageArrayLayers;
 *     VkSurfaceTransformFlagsKHR supportedTransforms;
 *     VkSurfaceTransformFlagBitsKHR currentTransform;
 *     VkCompositeAlphaFlagsKHR supportedCompositeAlpha;
 *     VkImageUsageFlags supportedUsageFlags;
 * }</code></pre>
 */
public class VkSurfaceCapabilitiesKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		MINIMAGECOUNT,
		MAXIMAGECOUNT,
		CURRENTEXTENT,
		MINIMAGEEXTENT,
		MAXIMAGEEXTENT,
		MAXIMAGEARRAYLAYERS,
		SUPPORTEDTRANSFORMS,
		CURRENTTRANSFORM,
		SUPPORTEDCOMPOSITEALPHA,
		SUPPORTEDUSAGEFLAGS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(VkExtent2D.SIZEOF, VkExtent2D.__ALIGNMENT),
			__member(VkExtent2D.SIZEOF, VkExtent2D.__ALIGNMENT),
			__member(VkExtent2D.SIZEOF, VkExtent2D.__ALIGNMENT),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		MINIMAGECOUNT = layout.offsetof(0);
		MAXIMAGECOUNT = layout.offsetof(1);
		CURRENTEXTENT = layout.offsetof(2);
		MINIMAGEEXTENT = layout.offsetof(3);
		MAXIMAGEEXTENT = layout.offsetof(4);
		MAXIMAGEARRAYLAYERS = layout.offsetof(5);
		SUPPORTEDTRANSFORMS = layout.offsetof(6);
		CURRENTTRANSFORM = layout.offsetof(7);
		SUPPORTEDCOMPOSITEALPHA = layout.offsetof(8);
		SUPPORTEDUSAGEFLAGS = layout.offsetof(9);
	}

	VkSurfaceCapabilitiesKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSurfaceCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSurfaceCapabilitiesKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code minImageCount} field. */
	public int minImageCount() { return nminImageCount(address()); }
	/** Returns the value of the {@code maxImageCount} field. */
	public int maxImageCount() { return nmaxImageCount(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code currentExtent} field. */
	public VkExtent2D currentExtent() { return ncurrentExtent(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code minImageExtent} field. */
	public VkExtent2D minImageExtent() { return nminImageExtent(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code maxImageExtent} field. */
	public VkExtent2D maxImageExtent() { return nmaxImageExtent(address()); }
	/** Returns the value of the {@code maxImageArrayLayers} field. */
	public int maxImageArrayLayers() { return nmaxImageArrayLayers(address()); }
	/** Returns the value of the {@code supportedTransforms} field. */
	public int supportedTransforms() { return nsupportedTransforms(address()); }
	/** Returns the value of the {@code currentTransform} field. */
	public int currentTransform() { return ncurrentTransform(address()); }
	/** Returns the value of the {@code supportedCompositeAlpha} field. */
	public int supportedCompositeAlpha() { return nsupportedCompositeAlpha(address()); }
	/** Returns the value of the {@code supportedUsageFlags} field. */
	public int supportedUsageFlags() { return nsupportedUsageFlags(address()); }

	// -----------------------------------

	/** Returns a new {@link VkSurfaceCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkSurfaceCapabilitiesKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSurfaceCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkSurfaceCapabilitiesKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSurfaceCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
	public static VkSurfaceCapabilitiesKHR create() {
		return new VkSurfaceCapabilitiesKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSurfaceCapabilitiesKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSurfaceCapabilitiesKHR create(long address) {
		return address == NULL ? null : new VkSurfaceCapabilitiesKHR(address, null);
	}

	/**
	 * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSurfaceCapabilitiesKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #minImageCount}. */
	public static int nminImageCount(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.MINIMAGECOUNT); }
	/** Unsafe version of {@link #maxImageCount}. */
	public static int nmaxImageCount(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.MAXIMAGECOUNT); }
	/** Unsafe version of {@link #currentExtent}. */
	public static VkExtent2D ncurrentExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilitiesKHR.CURRENTEXTENT); }
	/** Unsafe version of {@link #minImageExtent}. */
	public static VkExtent2D nminImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilitiesKHR.MINIMAGEEXTENT); }
	/** Unsafe version of {@link #maxImageExtent}. */
	public static VkExtent2D nmaxImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilitiesKHR.MAXIMAGEEXTENT); }
	/** Unsafe version of {@link #maxImageArrayLayers}. */
	public static int nmaxImageArrayLayers(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.MAXIMAGEARRAYLAYERS); }
	/** Unsafe version of {@link #supportedTransforms}. */
	public static int nsupportedTransforms(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.SUPPORTEDTRANSFORMS); }
	/** Unsafe version of {@link #currentTransform}. */
	public static int ncurrentTransform(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.CURRENTTRANSFORM); }
	/** Unsafe version of {@link #supportedCompositeAlpha}. */
	public static int nsupportedCompositeAlpha(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.SUPPORTEDCOMPOSITEALPHA); }
	/** Unsafe version of {@link #supportedUsageFlags}. */
	public static int nsupportedUsageFlags(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.SUPPORTEDUSAGEFLAGS); }

	// -----------------------------------

	/** An array of {@link VkSurfaceCapabilitiesKHR} structs. */
	public static final class Buffer extends StructBuffer<VkSurfaceCapabilitiesKHR, Buffer> {

		/**
		 * Creates a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSurfaceCapabilitiesKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkSurfaceCapabilitiesKHR newInstance(long address) {
			return new VkSurfaceCapabilitiesKHR(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code minImageCount} field. */
		public int minImageCount() { return VkSurfaceCapabilitiesKHR.nminImageCount(address()); }
		/** Returns the value of the {@code maxImageCount} field. */
		public int maxImageCount() { return VkSurfaceCapabilitiesKHR.nmaxImageCount(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code currentExtent} field. */
		public VkExtent2D currentExtent() { return VkSurfaceCapabilitiesKHR.ncurrentExtent(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code minImageExtent} field. */
		public VkExtent2D minImageExtent() { return VkSurfaceCapabilitiesKHR.nminImageExtent(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code maxImageExtent} field. */
		public VkExtent2D maxImageExtent() { return VkSurfaceCapabilitiesKHR.nmaxImageExtent(address()); }
		/** Returns the value of the {@code maxImageArrayLayers} field. */
		public int maxImageArrayLayers() { return VkSurfaceCapabilitiesKHR.nmaxImageArrayLayers(address()); }
		/** Returns the value of the {@code supportedTransforms} field. */
		public int supportedTransforms() { return VkSurfaceCapabilitiesKHR.nsupportedTransforms(address()); }
		/** Returns the value of the {@code currentTransform} field. */
		public int currentTransform() { return VkSurfaceCapabilitiesKHR.ncurrentTransform(address()); }
		/** Returns the value of the {@code supportedCompositeAlpha} field. */
		public int supportedCompositeAlpha() { return VkSurfaceCapabilitiesKHR.nsupportedCompositeAlpha(address()); }
		/** Returns the value of the {@code supportedUsageFlags} field. */
		public int supportedUsageFlags() { return VkSurfaceCapabilitiesKHR.nsupportedUsageFlags(address()); }

	}

}