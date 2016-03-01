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
 * <pre><code>struct VkPushConstantRange {
    VkShaderStageFlags stageFlags;
    uint32_t offset;
    uint32_t size;
}</code></pre>
 */
public class VkPushConstantRange extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STAGEFLAGS,
		OFFSET,
		SIZE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STAGEFLAGS = layout.offsetof(0);
		OFFSET = layout.offsetof(1);
		SIZE = layout.offsetof(2);
	}

	VkPushConstantRange(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPushConstantRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPushConstantRange(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code stageFlags} field. */
	public int stageFlags() { return nstageFlags(address()); }
	/** Returns the value of the {@code offset} field. */
	public int offset() { return noffset(address()); }
	/** Returns the value of the {@code size} field. */
	public int size() { return nsize(address()); }

	/** Sets the specified value to the {@code stageFlags} field. */
	public VkPushConstantRange stageFlags(int value) { nstageFlags(address(), value); return this; }
	/** Sets the specified value to the {@code offset} field. */
	public VkPushConstantRange offset(int value) { noffset(address(), value); return this; }
	/** Sets the specified value to the {@code size} field. */
	public VkPushConstantRange size(int value) { nsize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPushConstantRange set(
		int stageFlags,
		int offset,
		int size
	) {
		stageFlags(stageFlags);
		offset(offset);
		size(size);

		return this;
	}

	/** Unsafe version of {@link #set(VkPushConstantRange) set}. */
	public VkPushConstantRange nset(long struct) {
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
	public VkPushConstantRange set(VkPushConstantRange src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkPushConstantRange} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPushConstantRange malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPushConstantRange} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPushConstantRange calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPushConstantRange} instance allocated with {@link BufferUtils}. */
	public static VkPushConstantRange create() {
		return new VkPushConstantRange(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPushConstantRange} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPushConstantRange create(long address) {
		return address == NULL ? null : new VkPushConstantRange(address, null);
	}

	/**
	 * Returns a new {@link VkPushConstantRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPushConstantRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPushConstantRange.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPushConstantRange.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #stageFlags}. */
	public static int nstageFlags(long struct) { return memGetInt(struct + VkPushConstantRange.STAGEFLAGS); }
	/** Unsafe version of {@link #offset}. */
	public static int noffset(long struct) { return memGetInt(struct + VkPushConstantRange.OFFSET); }
	/** Unsafe version of {@link #size}. */
	public static int nsize(long struct) { return memGetInt(struct + VkPushConstantRange.SIZE); }

	/** Unsafe version of {@link #stageFlags(int) stageFlags}. */
	public static void nstageFlags(long struct, int value) { memPutInt(struct + VkPushConstantRange.STAGEFLAGS, value); }
	/** Unsafe version of {@link #offset(int) offset}. */
	public static void noffset(long struct, int value) { memPutInt(struct + VkPushConstantRange.OFFSET, value); }
	/** Unsafe version of {@link #size(int) size}. */
	public static void nsize(long struct, int value) { memPutInt(struct + VkPushConstantRange.SIZE, value); }

	// -----------------------------------

	/** An array of {@link VkPushConstantRange} structs. */
	public static final class Buffer extends StructBuffer<VkPushConstantRange, Buffer> {

		/**
		 * Creates a new {@link VkPushConstantRange.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPushConstantRange#SIZEOF}, and its mark will be undefined.
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
		protected VkPushConstantRange newInstance(long address) {
			return new VkPushConstantRange(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code stageFlags} field. */
		public int stageFlags() { return VkPushConstantRange.nstageFlags(address()); }
		/** Returns the value of the {@code offset} field. */
		public int offset() { return VkPushConstantRange.noffset(address()); }
		/** Returns the value of the {@code size} field. */
		public int size() { return VkPushConstantRange.nsize(address()); }

		/** Sets the specified value to the {@code stageFlags} field. */
		public VkPushConstantRange.Buffer stageFlags(int value) { VkPushConstantRange.nstageFlags(address(), value); return this; }
		/** Sets the specified value to the {@code offset} field. */
		public VkPushConstantRange.Buffer offset(int value) { VkPushConstantRange.noffset(address(), value); return this; }
		/** Sets the specified value to the {@code size} field. */
		public VkPushConstantRange.Buffer size(int value) { VkPushConstantRange.nsize(address(), value); return this; }

	}

}