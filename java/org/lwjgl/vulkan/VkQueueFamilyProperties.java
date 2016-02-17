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
 * struct VkQueueFamilyProperties {
 *     VkQueueFlags queueFlags;
 *     uint32_t queueCount;
 *     uint32_t timestampValidBits;
 *     {@link VkExtent3D VkExtent3D} minImageTransferGranularity;
 * }</code></pre>
 */
public class VkQueueFamilyProperties extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		QUEUEFLAGS,
		QUEUECOUNT,
		TIMESTAMPVALIDBITS,
		MINIMAGETRANSFERGRANULARITY;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(VkExtent3D.SIZEOF, VkExtent3D.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		QUEUEFLAGS = layout.offsetof(0);
		QUEUECOUNT = layout.offsetof(1);
		TIMESTAMPVALIDBITS = layout.offsetof(2);
		MINIMAGETRANSFERGRANULARITY = layout.offsetof(3);
	}

	VkQueueFamilyProperties(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkQueueFamilyProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkQueueFamilyProperties(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code queueFlags} field. */
	public int queueFlags() { return nqueueFlags(address()); }
	/** Returns the value of the {@code queueCount} field. */
	public int queueCount() { return nqueueCount(address()); }
	/** Returns the value of the {@code timestampValidBits} field. */
	public int timestampValidBits() { return ntimestampValidBits(address()); }
	/** Returns a {@link VkExtent3D} view of the {@code minImageTransferGranularity} field. */
	public VkExtent3D minImageTransferGranularity() { return nminImageTransferGranularity(address()); }

	// -----------------------------------

	/** Returns a new {@link VkQueueFamilyProperties} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkQueueFamilyProperties malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkQueueFamilyProperties} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkQueueFamilyProperties calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkQueueFamilyProperties} instance allocated with {@link BufferUtils}. */
	public static VkQueueFamilyProperties create() {
		return new VkQueueFamilyProperties(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkQueueFamilyProperties} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkQueueFamilyProperties create(long address) {
		return address == NULL ? null : new VkQueueFamilyProperties(address, null);
	}

	/**
	 * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkQueueFamilyProperties.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #queueFlags}. */
	public static int nqueueFlags(long struct) { return memGetInt(struct + VkQueueFamilyProperties.QUEUEFLAGS); }
	/** Unsafe version of {@link #queueCount}. */
	public static int nqueueCount(long struct) { return memGetInt(struct + VkQueueFamilyProperties.QUEUECOUNT); }
	/** Unsafe version of {@link #timestampValidBits}. */
	public static int ntimestampValidBits(long struct) { return memGetInt(struct + VkQueueFamilyProperties.TIMESTAMPVALIDBITS); }
	/** Unsafe version of {@link #minImageTransferGranularity}. */
	public static VkExtent3D nminImageTransferGranularity(long struct) { return VkExtent3D.create(struct + VkQueueFamilyProperties.MINIMAGETRANSFERGRANULARITY); }

	// -----------------------------------

	/** An array of {@link VkQueueFamilyProperties} structs. */
	public static final class Buffer extends StructBuffer<VkQueueFamilyProperties, Buffer> {

		/**
		 * Creates a new {@link VkQueueFamilyProperties.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkQueueFamilyProperties#SIZEOF}, and its mark will be undefined.
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
		protected VkQueueFamilyProperties newInstance(long address) {
			return new VkQueueFamilyProperties(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code queueFlags} field. */
		public int queueFlags() { return VkQueueFamilyProperties.nqueueFlags(address()); }
		/** Returns the value of the {@code queueCount} field. */
		public int queueCount() { return VkQueueFamilyProperties.nqueueCount(address()); }
		/** Returns the value of the {@code timestampValidBits} field. */
		public int timestampValidBits() { return VkQueueFamilyProperties.ntimestampValidBits(address()); }
		/** Returns a {@link VkExtent3D} view of the {@code minImageTransferGranularity} field. */
		public VkExtent3D minImageTransferGranularity() { return VkQueueFamilyProperties.nminImageTransferGranularity(address()); }

	}

}