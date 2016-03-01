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
 * <pre><code>struct VkImageSubresourceRange {
    VkImageAspectFlags aspectMask;
    uint32_t baseMipLevel;
    uint32_t levelCount;
    uint32_t baseArrayLayer;
    uint32_t layerCount;
}</code></pre>
 */
public class VkImageSubresourceRange extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		ASPECTMASK,
		BASEMIPLEVEL,
		LEVELCOUNT,
		BASEARRAYLAYER,
		LAYERCOUNT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		ASPECTMASK = layout.offsetof(0);
		BASEMIPLEVEL = layout.offsetof(1);
		LEVELCOUNT = layout.offsetof(2);
		BASEARRAYLAYER = layout.offsetof(3);
		LAYERCOUNT = layout.offsetof(4);
	}

	VkImageSubresourceRange(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImageSubresourceRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImageSubresourceRange(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code aspectMask} field. */
	public int aspectMask() { return naspectMask(address()); }
	/** Returns the value of the {@code baseMipLevel} field. */
	public int baseMipLevel() { return nbaseMipLevel(address()); }
	/** Returns the value of the {@code levelCount} field. */
	public int levelCount() { return nlevelCount(address()); }
	/** Returns the value of the {@code baseArrayLayer} field. */
	public int baseArrayLayer() { return nbaseArrayLayer(address()); }
	/** Returns the value of the {@code layerCount} field. */
	public int layerCount() { return nlayerCount(address()); }

	/** Sets the specified value to the {@code aspectMask} field. */
	public VkImageSubresourceRange aspectMask(int value) { naspectMask(address(), value); return this; }
	/** Sets the specified value to the {@code baseMipLevel} field. */
	public VkImageSubresourceRange baseMipLevel(int value) { nbaseMipLevel(address(), value); return this; }
	/** Sets the specified value to the {@code levelCount} field. */
	public VkImageSubresourceRange levelCount(int value) { nlevelCount(address(), value); return this; }
	/** Sets the specified value to the {@code baseArrayLayer} field. */
	public VkImageSubresourceRange baseArrayLayer(int value) { nbaseArrayLayer(address(), value); return this; }
	/** Sets the specified value to the {@code layerCount} field. */
	public VkImageSubresourceRange layerCount(int value) { nlayerCount(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkImageSubresourceRange set(
		int aspectMask,
		int baseMipLevel,
		int levelCount,
		int baseArrayLayer,
		int layerCount
	) {
		aspectMask(aspectMask);
		baseMipLevel(baseMipLevel);
		levelCount(levelCount);
		baseArrayLayer(baseArrayLayer);
		layerCount(layerCount);

		return this;
	}

	/** Unsafe version of {@link #set(VkImageSubresourceRange) set}. */
	public VkImageSubresourceRange nset(long struct) {
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
	public VkImageSubresourceRange set(VkImageSubresourceRange src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkImageSubresourceRange} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkImageSubresourceRange malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImageSubresourceRange} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkImageSubresourceRange calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImageSubresourceRange} instance allocated with {@link BufferUtils}. */
	public static VkImageSubresourceRange create() {
		return new VkImageSubresourceRange(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImageSubresourceRange} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImageSubresourceRange create(long address) {
		return address == NULL ? null : new VkImageSubresourceRange(address, null);
	}

	/**
	 * Returns a new {@link VkImageSubresourceRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageSubresourceRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageSubresourceRange.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImageSubresourceRange.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #aspectMask}. */
	public static int naspectMask(long struct) { return memGetInt(struct + VkImageSubresourceRange.ASPECTMASK); }
	/** Unsafe version of {@link #baseMipLevel}. */
	public static int nbaseMipLevel(long struct) { return memGetInt(struct + VkImageSubresourceRange.BASEMIPLEVEL); }
	/** Unsafe version of {@link #levelCount}. */
	public static int nlevelCount(long struct) { return memGetInt(struct + VkImageSubresourceRange.LEVELCOUNT); }
	/** Unsafe version of {@link #baseArrayLayer}. */
	public static int nbaseArrayLayer(long struct) { return memGetInt(struct + VkImageSubresourceRange.BASEARRAYLAYER); }
	/** Unsafe version of {@link #layerCount}. */
	public static int nlayerCount(long struct) { return memGetInt(struct + VkImageSubresourceRange.LAYERCOUNT); }

	/** Unsafe version of {@link #aspectMask(int) aspectMask}. */
	public static void naspectMask(long struct, int value) { memPutInt(struct + VkImageSubresourceRange.ASPECTMASK, value); }
	/** Unsafe version of {@link #baseMipLevel(int) baseMipLevel}. */
	public static void nbaseMipLevel(long struct, int value) { memPutInt(struct + VkImageSubresourceRange.BASEMIPLEVEL, value); }
	/** Unsafe version of {@link #levelCount(int) levelCount}. */
	public static void nlevelCount(long struct, int value) { memPutInt(struct + VkImageSubresourceRange.LEVELCOUNT, value); }
	/** Unsafe version of {@link #baseArrayLayer(int) baseArrayLayer}. */
	public static void nbaseArrayLayer(long struct, int value) { memPutInt(struct + VkImageSubresourceRange.BASEARRAYLAYER, value); }
	/** Unsafe version of {@link #layerCount(int) layerCount}. */
	public static void nlayerCount(long struct, int value) { memPutInt(struct + VkImageSubresourceRange.LAYERCOUNT, value); }

	// -----------------------------------

	/** An array of {@link VkImageSubresourceRange} structs. */
	public static final class Buffer extends StructBuffer<VkImageSubresourceRange, Buffer> {

		/**
		 * Creates a new {@link VkImageSubresourceRange.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImageSubresourceRange#SIZEOF}, and its mark will be undefined.
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
		protected VkImageSubresourceRange newInstance(long address) {
			return new VkImageSubresourceRange(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code aspectMask} field. */
		public int aspectMask() { return VkImageSubresourceRange.naspectMask(address()); }
		/** Returns the value of the {@code baseMipLevel} field. */
		public int baseMipLevel() { return VkImageSubresourceRange.nbaseMipLevel(address()); }
		/** Returns the value of the {@code levelCount} field. */
		public int levelCount() { return VkImageSubresourceRange.nlevelCount(address()); }
		/** Returns the value of the {@code baseArrayLayer} field. */
		public int baseArrayLayer() { return VkImageSubresourceRange.nbaseArrayLayer(address()); }
		/** Returns the value of the {@code layerCount} field. */
		public int layerCount() { return VkImageSubresourceRange.nlayerCount(address()); }

		/** Sets the specified value to the {@code aspectMask} field. */
		public VkImageSubresourceRange.Buffer aspectMask(int value) { VkImageSubresourceRange.naspectMask(address(), value); return this; }
		/** Sets the specified value to the {@code baseMipLevel} field. */
		public VkImageSubresourceRange.Buffer baseMipLevel(int value) { VkImageSubresourceRange.nbaseMipLevel(address(), value); return this; }
		/** Sets the specified value to the {@code levelCount} field. */
		public VkImageSubresourceRange.Buffer levelCount(int value) { VkImageSubresourceRange.nlevelCount(address(), value); return this; }
		/** Sets the specified value to the {@code baseArrayLayer} field. */
		public VkImageSubresourceRange.Buffer baseArrayLayer(int value) { VkImageSubresourceRange.nbaseArrayLayer(address(), value); return this; }
		/** Sets the specified value to the {@code layerCount} field. */
		public VkImageSubresourceRange.Buffer layerCount(int value) { VkImageSubresourceRange.nlayerCount(address(), value); return this; }

	}

}