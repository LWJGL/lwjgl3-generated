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
 * <pre><code style="font-family: monospace">
 * struct VkImageMemoryBarrier {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkAccessFlags srcAccessMask;
 *     VkAccessFlags dstAccessMask;
 *     VkImageLayout oldLayout;
 *     VkImageLayout newLayout;
 *     uint32_t srcQueueFamilyIndex;
 *     uint32_t dstQueueFamilyIndex;
 *     VkImage image;
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} subresourceRange;
 * }</code></pre>
 */
public class VkImageMemoryBarrier extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		SRCACCESSMASK,
		DSTACCESSMASK,
		OLDLAYOUT,
		NEWLAYOUT,
		SRCQUEUEFAMILYINDEX,
		DSTQUEUEFAMILYINDEX,
		IMAGE,
		SUBRESOURCERANGE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(8),
			__member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		SRCACCESSMASK = layout.offsetof(2);
		DSTACCESSMASK = layout.offsetof(3);
		OLDLAYOUT = layout.offsetof(4);
		NEWLAYOUT = layout.offsetof(5);
		SRCQUEUEFAMILYINDEX = layout.offsetof(6);
		DSTQUEUEFAMILYINDEX = layout.offsetof(7);
		IMAGE = layout.offsetof(8);
		SUBRESOURCERANGE = layout.offsetof(9);
	}

	VkImageMemoryBarrier(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImageMemoryBarrier} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImageMemoryBarrier(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code srcAccessMask} field. */
	public int srcAccessMask() { return nsrcAccessMask(address()); }
	/** Returns the value of the {@code dstAccessMask} field. */
	public int dstAccessMask() { return ndstAccessMask(address()); }
	/** Returns the value of the {@code oldLayout} field. */
	public int oldLayout() { return noldLayout(address()); }
	/** Returns the value of the {@code newLayout} field. */
	public int newLayout() { return nnewLayout(address()); }
	/** Returns the value of the {@code srcQueueFamilyIndex} field. */
	public int srcQueueFamilyIndex() { return nsrcQueueFamilyIndex(address()); }
	/** Returns the value of the {@code dstQueueFamilyIndex} field. */
	public int dstQueueFamilyIndex() { return ndstQueueFamilyIndex(address()); }
	/** Returns the value of the {@code image} field. */
	public long image() { return nimage(address()); }
	/** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
	public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkImageMemoryBarrier sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkImageMemoryBarrier pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code srcAccessMask} field. */
	public VkImageMemoryBarrier srcAccessMask(int value) { nsrcAccessMask(address(), value); return this; }
	/** Sets the specified value to the {@code dstAccessMask} field. */
	public VkImageMemoryBarrier dstAccessMask(int value) { ndstAccessMask(address(), value); return this; }
	/** Sets the specified value to the {@code oldLayout} field. */
	public VkImageMemoryBarrier oldLayout(int value) { noldLayout(address(), value); return this; }
	/** Sets the specified value to the {@code newLayout} field. */
	public VkImageMemoryBarrier newLayout(int value) { nnewLayout(address(), value); return this; }
	/** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
	public VkImageMemoryBarrier srcQueueFamilyIndex(int value) { nsrcQueueFamilyIndex(address(), value); return this; }
	/** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
	public VkImageMemoryBarrier dstQueueFamilyIndex(int value) { ndstQueueFamilyIndex(address(), value); return this; }
	/** Sets the specified value to the {@code image} field. */
	public VkImageMemoryBarrier image(long value) { nimage(address(), value); return this; }
	/** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
	public VkImageMemoryBarrier subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkImageMemoryBarrier set(
		int sType,
		long pNext,
		int srcAccessMask,
		int dstAccessMask,
		int oldLayout,
		int newLayout,
		int srcQueueFamilyIndex,
		int dstQueueFamilyIndex,
		long image,
		VkImageSubresourceRange subresourceRange
	) {
		sType(sType);
		pNext(pNext);
		srcAccessMask(srcAccessMask);
		dstAccessMask(dstAccessMask);
		oldLayout(oldLayout);
		newLayout(newLayout);
		srcQueueFamilyIndex(srcQueueFamilyIndex);
		dstQueueFamilyIndex(dstQueueFamilyIndex);
		image(image);
		subresourceRange(subresourceRange);

		return this;
	}

	/** Unsafe version of {@link #set(VkImageMemoryBarrier) set}. */
	public VkImageMemoryBarrier nset(long struct) {
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
	public VkImageMemoryBarrier set(VkImageMemoryBarrier src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkImageMemoryBarrier} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkImageMemoryBarrier malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImageMemoryBarrier} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkImageMemoryBarrier calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImageMemoryBarrier} instance allocated with {@link BufferUtils}. */
	public static VkImageMemoryBarrier create() {
		return new VkImageMemoryBarrier(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImageMemoryBarrier} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImageMemoryBarrier create(long address) {
		return address == NULL ? null : new VkImageMemoryBarrier(address, null);
	}

	/**
	 * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImageMemoryBarrier.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkImageMemoryBarrier.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkImageMemoryBarrier.PNEXT); }
	/** Unsafe version of {@link #srcAccessMask}. */
	public static int nsrcAccessMask(long struct) { return memGetInt(struct + VkImageMemoryBarrier.SRCACCESSMASK); }
	/** Unsafe version of {@link #dstAccessMask}. */
	public static int ndstAccessMask(long struct) { return memGetInt(struct + VkImageMemoryBarrier.DSTACCESSMASK); }
	/** Unsafe version of {@link #oldLayout}. */
	public static int noldLayout(long struct) { return memGetInt(struct + VkImageMemoryBarrier.OLDLAYOUT); }
	/** Unsafe version of {@link #newLayout}. */
	public static int nnewLayout(long struct) { return memGetInt(struct + VkImageMemoryBarrier.NEWLAYOUT); }
	/** Unsafe version of {@link #srcQueueFamilyIndex}. */
	public static int nsrcQueueFamilyIndex(long struct) { return memGetInt(struct + VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX); }
	/** Unsafe version of {@link #dstQueueFamilyIndex}. */
	public static int ndstQueueFamilyIndex(long struct) { return memGetInt(struct + VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX); }
	/** Unsafe version of {@link #image}. */
	public static long nimage(long struct) { return memGetLong(struct + VkImageMemoryBarrier.IMAGE); }
	/** Unsafe version of {@link #subresourceRange}. */
	public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkImageMemoryBarrier.SUBRESOURCERANGE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkImageMemoryBarrier.PNEXT, value); }
	/** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
	public static void nsrcAccessMask(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.SRCACCESSMASK, value); }
	/** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
	public static void ndstAccessMask(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.DSTACCESSMASK, value); }
	/** Unsafe version of {@link #oldLayout(int) oldLayout}. */
	public static void noldLayout(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.OLDLAYOUT, value); }
	/** Unsafe version of {@link #newLayout(int) newLayout}. */
	public static void nnewLayout(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.NEWLAYOUT, value); }
	/** Unsafe version of {@link #srcQueueFamilyIndex(int) srcQueueFamilyIndex}. */
	public static void nsrcQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX, value); }
	/** Unsafe version of {@link #dstQueueFamilyIndex(int) dstQueueFamilyIndex}. */
	public static void ndstQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX, value); }
	/** Unsafe version of {@link #image(long) image}. */
	public static void nimage(long struct, long value) { memPutLong(struct + VkImageMemoryBarrier.IMAGE, value); }
	/** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
	public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkImageMemoryBarrier.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkImageMemoryBarrier} structs. */
	public static final class Buffer extends StructBuffer<VkImageMemoryBarrier, Buffer> {

		/**
		 * Creates a new {@link VkImageMemoryBarrier.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImageMemoryBarrier#SIZEOF}, and its mark will be undefined.
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
		protected VkImageMemoryBarrier newInstance(long address) {
			return new VkImageMemoryBarrier(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkImageMemoryBarrier.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkImageMemoryBarrier.npNext(address()); }
		/** Returns the value of the {@code srcAccessMask} field. */
		public int srcAccessMask() { return VkImageMemoryBarrier.nsrcAccessMask(address()); }
		/** Returns the value of the {@code dstAccessMask} field. */
		public int dstAccessMask() { return VkImageMemoryBarrier.ndstAccessMask(address()); }
		/** Returns the value of the {@code oldLayout} field. */
		public int oldLayout() { return VkImageMemoryBarrier.noldLayout(address()); }
		/** Returns the value of the {@code newLayout} field. */
		public int newLayout() { return VkImageMemoryBarrier.nnewLayout(address()); }
		/** Returns the value of the {@code srcQueueFamilyIndex} field. */
		public int srcQueueFamilyIndex() { return VkImageMemoryBarrier.nsrcQueueFamilyIndex(address()); }
		/** Returns the value of the {@code dstQueueFamilyIndex} field. */
		public int dstQueueFamilyIndex() { return VkImageMemoryBarrier.ndstQueueFamilyIndex(address()); }
		/** Returns the value of the {@code image} field. */
		public long image() { return VkImageMemoryBarrier.nimage(address()); }
		/** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
		public VkImageSubresourceRange subresourceRange() { return VkImageMemoryBarrier.nsubresourceRange(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkImageMemoryBarrier.Buffer sType(int value) { VkImageMemoryBarrier.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkImageMemoryBarrier.Buffer pNext(long value) { VkImageMemoryBarrier.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code srcAccessMask} field. */
		public VkImageMemoryBarrier.Buffer srcAccessMask(int value) { VkImageMemoryBarrier.nsrcAccessMask(address(), value); return this; }
		/** Sets the specified value to the {@code dstAccessMask} field. */
		public VkImageMemoryBarrier.Buffer dstAccessMask(int value) { VkImageMemoryBarrier.ndstAccessMask(address(), value); return this; }
		/** Sets the specified value to the {@code oldLayout} field. */
		public VkImageMemoryBarrier.Buffer oldLayout(int value) { VkImageMemoryBarrier.noldLayout(address(), value); return this; }
		/** Sets the specified value to the {@code newLayout} field. */
		public VkImageMemoryBarrier.Buffer newLayout(int value) { VkImageMemoryBarrier.nnewLayout(address(), value); return this; }
		/** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
		public VkImageMemoryBarrier.Buffer srcQueueFamilyIndex(int value) { VkImageMemoryBarrier.nsrcQueueFamilyIndex(address(), value); return this; }
		/** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
		public VkImageMemoryBarrier.Buffer dstQueueFamilyIndex(int value) { VkImageMemoryBarrier.ndstQueueFamilyIndex(address(), value); return this; }
		/** Sets the specified value to the {@code image} field. */
		public VkImageMemoryBarrier.Buffer image(long value) { VkImageMemoryBarrier.nimage(address(), value); return this; }
		/** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
		public VkImageMemoryBarrier.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageMemoryBarrier.nsubresourceRange(address(), value); return this; }

	}

}