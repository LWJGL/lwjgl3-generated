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
 * <pre><code>struct VkSubresourceLayout {
    VkDeviceSize offset;
    VkDeviceSize size;
    VkDeviceSize rowPitch;
    VkDeviceSize arrayPitch;
    VkDeviceSize depthPitch;
}</code></pre>
 */
public class VkSubresourceLayout extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		OFFSET,
		SIZE,
		ROWPITCH,
		ARRAYPITCH,
		DEPTHPITCH;

	static {
		Layout layout = __struct(
			__member(8),
			__member(8),
			__member(8),
			__member(8),
			__member(8)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		OFFSET = layout.offsetof(0);
		SIZE = layout.offsetof(1);
		ROWPITCH = layout.offsetof(2);
		ARRAYPITCH = layout.offsetof(3);
		DEPTHPITCH = layout.offsetof(4);
	}

	VkSubresourceLayout(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSubresourceLayout} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSubresourceLayout(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code offset} field. */
	public long offset() { return noffset(address()); }
	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }
	/** Returns the value of the {@code rowPitch} field. */
	public long rowPitch() { return nrowPitch(address()); }
	/** Returns the value of the {@code arrayPitch} field. */
	public long arrayPitch() { return narrayPitch(address()); }
	/** Returns the value of the {@code depthPitch} field. */
	public long depthPitch() { return ndepthPitch(address()); }

	// -----------------------------------

	/** Returns a new {@link VkSubresourceLayout} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSubresourceLayout malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSubresourceLayout} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSubresourceLayout calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSubresourceLayout} instance allocated with {@link BufferUtils}. */
	public static VkSubresourceLayout create() {
		return new VkSubresourceLayout(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSubresourceLayout} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSubresourceLayout create(long address) {
		return address == NULL ? null : new VkSubresourceLayout(address, null);
	}

	/**
	 * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSubresourceLayout.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #offset}. */
	public static long noffset(long struct) { return memGetLong(struct + VkSubresourceLayout.OFFSET); }
	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetLong(struct + VkSubresourceLayout.SIZE); }
	/** Unsafe version of {@link #rowPitch}. */
	public static long nrowPitch(long struct) { return memGetLong(struct + VkSubresourceLayout.ROWPITCH); }
	/** Unsafe version of {@link #arrayPitch}. */
	public static long narrayPitch(long struct) { return memGetLong(struct + VkSubresourceLayout.ARRAYPITCH); }
	/** Unsafe version of {@link #depthPitch}. */
	public static long ndepthPitch(long struct) { return memGetLong(struct + VkSubresourceLayout.DEPTHPITCH); }

	// -----------------------------------

	/** An array of {@link VkSubresourceLayout} structs. */
	public static final class Buffer extends StructBuffer<VkSubresourceLayout, Buffer> {

		/**
		 * Creates a new {@link VkSubresourceLayout.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSubresourceLayout#SIZEOF}, and its mark will be undefined.
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
		protected VkSubresourceLayout newInstance(long address) {
			return new VkSubresourceLayout(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code offset} field. */
		public long offset() { return VkSubresourceLayout.noffset(address()); }
		/** Returns the value of the {@code size} field. */
		public long size() { return VkSubresourceLayout.nsize(address()); }
		/** Returns the value of the {@code rowPitch} field. */
		public long rowPitch() { return VkSubresourceLayout.nrowPitch(address()); }
		/** Returns the value of the {@code arrayPitch} field. */
		public long arrayPitch() { return VkSubresourceLayout.narrayPitch(address()); }
		/** Returns the value of the {@code depthPitch} field. */
		public long depthPitch() { return VkSubresourceLayout.ndepthPitch(address()); }

	}

}