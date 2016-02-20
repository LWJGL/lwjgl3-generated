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
 * struct VkImageViewCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkImageViewCreateFlags flags;
 *     VkImage image;
 *     VkImageViewType viewType;
 *     VkFormat format;
 *     {@link VkComponentMapping VkComponentMapping} components;
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} subresourceRange;
 * }</code></pre>
 */
public class VkImageViewCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		IMAGE,
		VIEWTYPE,
		FORMAT,
		COMPONENTS,
		SUBRESOURCERANGE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(8),
			__member(4),
			__member(4),
			__member(VkComponentMapping.SIZEOF, VkComponentMapping.__ALIGNMENT),
			__member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		IMAGE = layout.offsetof(3);
		VIEWTYPE = layout.offsetof(4);
		FORMAT = layout.offsetof(5);
		COMPONENTS = layout.offsetof(6);
		SUBRESOURCERANGE = layout.offsetof(7);
	}

	VkImageViewCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImageViewCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImageViewCreateInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code image} field. */
	public long image() { return nimage(address()); }
	/** Returns the value of the {@code viewType} field. */
	public int viewType() { return nviewType(address()); }
	/** Returns the value of the {@code format} field. */
	public int format() { return nformat(address()); }
	/** Returns a {@link VkComponentMapping} view of the {@code components} field. */
	public VkComponentMapping components() { return ncomponents(address()); }
	/** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
	public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkImageViewCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkImageViewCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkImageViewCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code image} field. */
	public VkImageViewCreateInfo image(long value) { nimage(address(), value); return this; }
	/** Sets the specified value to the {@code viewType} field. */
	public VkImageViewCreateInfo viewType(int value) { nviewType(address(), value); return this; }
	/** Sets the specified value to the {@code format} field. */
	public VkImageViewCreateInfo format(int value) { nformat(address(), value); return this; }
	/** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
	public VkImageViewCreateInfo components(VkComponentMapping value) { ncomponents(address(), value); return this; }
	/** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
	public VkImageViewCreateInfo subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkImageViewCreateInfo set(
		int sType,
		long pNext,
		int flags,
		long image,
		int viewType,
		int format,
		VkComponentMapping components,
		VkImageSubresourceRange subresourceRange
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		image(image);
		viewType(viewType);
		format(format);
		components(components);
		subresourceRange(subresourceRange);

		return this;
	}

	/** Unsafe version of {@link #set(VkImageViewCreateInfo) set}. */
	public VkImageViewCreateInfo nset(long struct) {
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
	public VkImageViewCreateInfo set(VkImageViewCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkImageViewCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkImageViewCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImageViewCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkImageViewCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImageViewCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkImageViewCreateInfo create() {
		return new VkImageViewCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImageViewCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImageViewCreateInfo create(long address) {
		return address == NULL ? null : new VkImageViewCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImageViewCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkImageViewCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkImageViewCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkImageViewCreateInfo.FLAGS); }
	/** Unsafe version of {@link #image}. */
	public static long nimage(long struct) { return memGetLong(struct + VkImageViewCreateInfo.IMAGE); }
	/** Unsafe version of {@link #viewType}. */
	public static int nviewType(long struct) { return memGetInt(struct + VkImageViewCreateInfo.VIEWTYPE); }
	/** Unsafe version of {@link #format}. */
	public static int nformat(long struct) { return memGetInt(struct + VkImageViewCreateInfo.FORMAT); }
	/** Unsafe version of {@link #components}. */
	public static VkComponentMapping ncomponents(long struct) { return VkComponentMapping.create(struct + VkImageViewCreateInfo.COMPONENTS); }
	/** Unsafe version of {@link #subresourceRange}. */
	public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkImageViewCreateInfo.SUBRESOURCERANGE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #image(long) image}. */
	public static void nimage(long struct, long value) { memPutLong(struct + VkImageViewCreateInfo.IMAGE, value); }
	/** Unsafe version of {@link #viewType(int) viewType}. */
	public static void nviewType(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.VIEWTYPE, value); }
	/** Unsafe version of {@link #format(int) format}. */
	public static void nformat(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.FORMAT, value); }
	/** Unsafe version of {@link #components(VkComponentMapping) components}. */
	public static void ncomponents(long struct, VkComponentMapping value) { memCopy(value.address(), struct + VkImageViewCreateInfo.COMPONENTS, VkComponentMapping.SIZEOF); }
	/** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
	public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkImageViewCreateInfo.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkImageViewCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkImageViewCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkImageViewCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImageViewCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkImageViewCreateInfo newInstance(long address) {
			return new VkImageViewCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkImageViewCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkImageViewCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkImageViewCreateInfo.nflags(address()); }
		/** Returns the value of the {@code image} field. */
		public long image() { return VkImageViewCreateInfo.nimage(address()); }
		/** Returns the value of the {@code viewType} field. */
		public int viewType() { return VkImageViewCreateInfo.nviewType(address()); }
		/** Returns the value of the {@code format} field. */
		public int format() { return VkImageViewCreateInfo.nformat(address()); }
		/** Returns a {@link VkComponentMapping} view of the {@code components} field. */
		public VkComponentMapping components() { return VkImageViewCreateInfo.ncomponents(address()); }
		/** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
		public VkImageSubresourceRange subresourceRange() { return VkImageViewCreateInfo.nsubresourceRange(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkImageViewCreateInfo.Buffer sType(int value) { VkImageViewCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkImageViewCreateInfo.Buffer pNext(long value) { VkImageViewCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkImageViewCreateInfo.Buffer flags(int value) { VkImageViewCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code image} field. */
		public VkImageViewCreateInfo.Buffer image(long value) { VkImageViewCreateInfo.nimage(address(), value); return this; }
		/** Sets the specified value to the {@code viewType} field. */
		public VkImageViewCreateInfo.Buffer viewType(int value) { VkImageViewCreateInfo.nviewType(address(), value); return this; }
		/** Sets the specified value to the {@code format} field. */
		public VkImageViewCreateInfo.Buffer format(int value) { VkImageViewCreateInfo.nformat(address(), value); return this; }
		/** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
		public VkImageViewCreateInfo.Buffer components(VkComponentMapping value) { VkImageViewCreateInfo.ncomponents(address(), value); return this; }
		/** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
		public VkImageViewCreateInfo.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageViewCreateInfo.nsubresourceRange(address(), value); return this; }

	}

}