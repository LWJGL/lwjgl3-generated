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

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDescriptorBufferInfo {
    VkBuffer buffer;
    VkDeviceSize offset;
    VkDeviceSize range;
}</code></pre>
 */
public class VkDescriptorBufferInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		BUFFER,
		OFFSET,
		RANGE;

	static {
		Layout layout = __struct(
			__member(8),
			__member(8),
			__member(8)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		BUFFER = layout.offsetof(0);
		OFFSET = layout.offsetof(1);
		RANGE = layout.offsetof(2);
	}

	VkDescriptorBufferInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDescriptorBufferInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDescriptorBufferInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code buffer} field. */
	public long buffer() { return nbuffer(address()); }
	/** Returns the value of the {@code offset} field. */
	public long offset() { return noffset(address()); }
	/** Returns the value of the {@code range} field. */
	public long range() { return nrange(address()); }

	/** Sets the specified value to the {@code buffer} field. */
	public VkDescriptorBufferInfo buffer(long value) { nbuffer(address(), value); return this; }
	/** Sets the specified value to the {@code offset} field. */
	public VkDescriptorBufferInfo offset(long value) { noffset(address(), value); return this; }
	/** Sets the specified value to the {@code range} field. */
	public VkDescriptorBufferInfo range(long value) { nrange(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDescriptorBufferInfo set(
		long buffer,
		long offset,
		long range
	) {
		buffer(buffer);
		offset(offset);
		range(range);

		return this;
	}

	/** Unsafe version of {@link #set(VkDescriptorBufferInfo) set}. */
	public VkDescriptorBufferInfo nset(long struct) {
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
	public VkDescriptorBufferInfo set(VkDescriptorBufferInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorBufferInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDescriptorBufferInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorBufferInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDescriptorBufferInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDescriptorBufferInfo} instance allocated with {@link BufferUtils}. */
	public static VkDescriptorBufferInfo create() {
		return new VkDescriptorBufferInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorBufferInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDescriptorBufferInfo create(long address) {
		return address == NULL ? null : new VkDescriptorBufferInfo(address, null);
	}

	/**
	 * Returns a new {@link VkDescriptorBufferInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorBufferInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorBufferInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDescriptorBufferInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #buffer}. */
	public static long nbuffer(long struct) { return memGetLong(struct + VkDescriptorBufferInfo.BUFFER); }
	/** Unsafe version of {@link #offset}. */
	public static long noffset(long struct) { return memGetLong(struct + VkDescriptorBufferInfo.OFFSET); }
	/** Unsafe version of {@link #range}. */
	public static long nrange(long struct) { return memGetLong(struct + VkDescriptorBufferInfo.RANGE); }

	/** Unsafe version of {@link #buffer(long) buffer}. */
	public static void nbuffer(long struct, long value) { memPutLong(struct + VkDescriptorBufferInfo.BUFFER, value); }
	/** Unsafe version of {@link #offset(long) offset}. */
	public static void noffset(long struct, long value) { memPutLong(struct + VkDescriptorBufferInfo.OFFSET, value); }
	/** Unsafe version of {@link #range(long) range}. */
	public static void nrange(long struct, long value) { memPutLong(struct + VkDescriptorBufferInfo.RANGE, value); }

	// -----------------------------------

	/** An array of {@link VkDescriptorBufferInfo} structs. */
	public static final class Buffer extends StructBuffer<VkDescriptorBufferInfo, Buffer> {

		/**
		 * Creates a new {@link VkDescriptorBufferInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDescriptorBufferInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkDescriptorBufferInfo newInstance(long address) {
			return new VkDescriptorBufferInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code buffer} field. */
		public long buffer() { return VkDescriptorBufferInfo.nbuffer(address()); }
		/** Returns the value of the {@code offset} field. */
		public long offset() { return VkDescriptorBufferInfo.noffset(address()); }
		/** Returns the value of the {@code range} field. */
		public long range() { return VkDescriptorBufferInfo.nrange(address()); }

		/** Sets the specified value to the {@code buffer} field. */
		public VkDescriptorBufferInfo.Buffer buffer(long value) { VkDescriptorBufferInfo.nbuffer(address(), value); return this; }
		/** Sets the specified value to the {@code offset} field. */
		public VkDescriptorBufferInfo.Buffer offset(long value) { VkDescriptorBufferInfo.noffset(address(), value); return this; }
		/** Sets the specified value to the {@code range} field. */
		public VkDescriptorBufferInfo.Buffer range(long value) { VkDescriptorBufferInfo.nrange(address(), value); return this; }

	}

}