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
 * <pre><code>struct VkMemoryRequirements {
    VkDeviceSize size;
    VkDeviceSize alignment;
    uint32_t memoryTypeBits;
}</code></pre>
 */
public class VkMemoryRequirements extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		SIZE,
		ALIGNMENT,
		MEMORYTYPEBITS;

	static {
		Layout layout = __struct(
			__member(8),
			__member(8),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		SIZE = layout.offsetof(0);
		ALIGNMENT = layout.offsetof(1);
		MEMORYTYPEBITS = layout.offsetof(2);
	}

	VkMemoryRequirements(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkMemoryRequirements} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkMemoryRequirements(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }
	/** Returns the value of the {@code alignment} field. */
	public long alignment() { return nalignment(address()); }
	/** Returns the value of the {@code memoryTypeBits} field. */
	public int memoryTypeBits() { return nmemoryTypeBits(address()); }

	// -----------------------------------

	/** Returns a new {@link VkMemoryRequirements} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkMemoryRequirements malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkMemoryRequirements} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkMemoryRequirements calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkMemoryRequirements} instance allocated with {@link BufferUtils}. */
	public static VkMemoryRequirements create() {
		return new VkMemoryRequirements(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkMemoryRequirements} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkMemoryRequirements create(long address) {
		return address == NULL ? null : new VkMemoryRequirements(address, null);
	}

	/**
	 * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkMemoryRequirements.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetLong(struct + VkMemoryRequirements.SIZE); }
	/** Unsafe version of {@link #alignment}. */
	public static long nalignment(long struct) { return memGetLong(struct + VkMemoryRequirements.ALIGNMENT); }
	/** Unsafe version of {@link #memoryTypeBits}. */
	public static int nmemoryTypeBits(long struct) { return memGetInt(struct + VkMemoryRequirements.MEMORYTYPEBITS); }

	// -----------------------------------

	/** An array of {@link VkMemoryRequirements} structs. */
	public static final class Buffer extends StructBuffer<VkMemoryRequirements, Buffer> {

		/**
		 * Creates a new {@link VkMemoryRequirements.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkMemoryRequirements#SIZEOF}, and its mark will be undefined.
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
		protected VkMemoryRequirements newInstance(long address) {
			return new VkMemoryRequirements(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code size} field. */
		public long size() { return VkMemoryRequirements.nsize(address()); }
		/** Returns the value of the {@code alignment} field. */
		public long alignment() { return VkMemoryRequirements.nalignment(address()); }
		/** Returns the value of the {@code memoryTypeBits} field. */
		public int memoryTypeBits() { return VkMemoryRequirements.nmemoryTypeBits(address()); }

	}

}