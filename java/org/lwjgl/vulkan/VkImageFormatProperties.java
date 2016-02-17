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
 * struct VkImageFormatProperties {
 *     {@link VkExtent3D VkExtent3D} maxExtent;
 *     uint32_t maxMipLevels;
 *     uint32_t maxArrayLayers;
 *     VkSampleCountFlags sampleCounts;
 *     VkDeviceSize maxResourceSize;
 * }</code></pre>
 */
public class VkImageFormatProperties extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		MAXEXTENT,
		MAXMIPLEVELS,
		MAXARRAYLAYERS,
		SAMPLECOUNTS,
		MAXRESOURCESIZE;

	static {
		Layout layout = __struct(
			__member(VkExtent3D.SIZEOF, VkExtent3D.__ALIGNMENT),
			__member(4),
			__member(4),
			__member(4),
			__member(8)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		MAXEXTENT = layout.offsetof(0);
		MAXMIPLEVELS = layout.offsetof(1);
		MAXARRAYLAYERS = layout.offsetof(2);
		SAMPLECOUNTS = layout.offsetof(3);
		MAXRESOURCESIZE = layout.offsetof(4);
	}

	VkImageFormatProperties(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImageFormatProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImageFormatProperties(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link VkExtent3D} view of the {@code maxExtent} field. */
	public VkExtent3D maxExtent() { return nmaxExtent(address()); }
	/** Returns the value of the {@code maxMipLevels} field. */
	public int maxMipLevels() { return nmaxMipLevels(address()); }
	/** Returns the value of the {@code maxArrayLayers} field. */
	public int maxArrayLayers() { return nmaxArrayLayers(address()); }
	/** Returns the value of the {@code sampleCounts} field. */
	public int sampleCounts() { return nsampleCounts(address()); }
	/** Returns the value of the {@code maxResourceSize} field. */
	public long maxResourceSize() { return nmaxResourceSize(address()); }

	// -----------------------------------

	/** Returns a new {@link VkImageFormatProperties} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkImageFormatProperties malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImageFormatProperties} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkImageFormatProperties calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImageFormatProperties} instance allocated with {@link BufferUtils}. */
	public static VkImageFormatProperties create() {
		return new VkImageFormatProperties(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImageFormatProperties} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImageFormatProperties create(long address) {
		return address == NULL ? null : new VkImageFormatProperties(address, null);
	}

	/**
	 * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImageFormatProperties.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #maxExtent}. */
	public static VkExtent3D nmaxExtent(long struct) { return VkExtent3D.create(struct + VkImageFormatProperties.MAXEXTENT); }
	/** Unsafe version of {@link #maxMipLevels}. */
	public static int nmaxMipLevels(long struct) { return memGetInt(struct + VkImageFormatProperties.MAXMIPLEVELS); }
	/** Unsafe version of {@link #maxArrayLayers}. */
	public static int nmaxArrayLayers(long struct) { return memGetInt(struct + VkImageFormatProperties.MAXARRAYLAYERS); }
	/** Unsafe version of {@link #sampleCounts}. */
	public static int nsampleCounts(long struct) { return memGetInt(struct + VkImageFormatProperties.SAMPLECOUNTS); }
	/** Unsafe version of {@link #maxResourceSize}. */
	public static long nmaxResourceSize(long struct) { return memGetLong(struct + VkImageFormatProperties.MAXRESOURCESIZE); }

	// -----------------------------------

	/** An array of {@link VkImageFormatProperties} structs. */
	public static final class Buffer extends StructBuffer<VkImageFormatProperties, Buffer> {

		/**
		 * Creates a new {@link VkImageFormatProperties.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImageFormatProperties#SIZEOF}, and its mark will be undefined.
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
		protected VkImageFormatProperties newInstance(long address) {
			return new VkImageFormatProperties(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link VkExtent3D} view of the {@code maxExtent} field. */
		public VkExtent3D maxExtent() { return VkImageFormatProperties.nmaxExtent(address()); }
		/** Returns the value of the {@code maxMipLevels} field. */
		public int maxMipLevels() { return VkImageFormatProperties.nmaxMipLevels(address()); }
		/** Returns the value of the {@code maxArrayLayers} field. */
		public int maxArrayLayers() { return VkImageFormatProperties.nmaxArrayLayers(address()); }
		/** Returns the value of the {@code sampleCounts} field. */
		public int sampleCounts() { return VkImageFormatProperties.nsampleCounts(address()); }
		/** Returns the value of the {@code maxResourceSize} field. */
		public long maxResourceSize() { return VkImageFormatProperties.nmaxResourceSize(address()); }

	}

}