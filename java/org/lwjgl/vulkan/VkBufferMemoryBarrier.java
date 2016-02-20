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
 * struct VkBufferMemoryBarrier {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkAccessFlags srcAccessMask;
 *     VkAccessFlags dstAccessMask;
 *     uint32_t srcQueueFamilyIndex;
 *     uint32_t dstQueueFamilyIndex;
 *     VkBuffer buffer;
 *     VkDeviceSize offset;
 *     VkDeviceSize size;
 * }</code></pre>
 */
public class VkBufferMemoryBarrier extends Struct {

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
		SRCQUEUEFAMILYINDEX,
		DSTQUEUEFAMILYINDEX,
		BUFFER,
		OFFSET,
		SIZE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(8),
			__member(8),
			__member(8)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		SRCACCESSMASK = layout.offsetof(2);
		DSTACCESSMASK = layout.offsetof(3);
		SRCQUEUEFAMILYINDEX = layout.offsetof(4);
		DSTQUEUEFAMILYINDEX = layout.offsetof(5);
		BUFFER = layout.offsetof(6);
		OFFSET = layout.offsetof(7);
		SIZE = layout.offsetof(8);
	}

	VkBufferMemoryBarrier(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkBufferMemoryBarrier} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkBufferMemoryBarrier(ByteBuffer container) {
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
	/** Returns the value of the {@code srcQueueFamilyIndex} field. */
	public int srcQueueFamilyIndex() { return nsrcQueueFamilyIndex(address()); }
	/** Returns the value of the {@code dstQueueFamilyIndex} field. */
	public int dstQueueFamilyIndex() { return ndstQueueFamilyIndex(address()); }
	/** Returns the value of the {@code buffer} field. */
	public long buffer() { return nbuffer(address()); }
	/** Returns the value of the {@code offset} field. */
	public long offset() { return noffset(address()); }
	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkBufferMemoryBarrier sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkBufferMemoryBarrier pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code srcAccessMask} field. */
	public VkBufferMemoryBarrier srcAccessMask(int value) { nsrcAccessMask(address(), value); return this; }
	/** Sets the specified value to the {@code dstAccessMask} field. */
	public VkBufferMemoryBarrier dstAccessMask(int value) { ndstAccessMask(address(), value); return this; }
	/** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
	public VkBufferMemoryBarrier srcQueueFamilyIndex(int value) { nsrcQueueFamilyIndex(address(), value); return this; }
	/** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
	public VkBufferMemoryBarrier dstQueueFamilyIndex(int value) { ndstQueueFamilyIndex(address(), value); return this; }
	/** Sets the specified value to the {@code buffer} field. */
	public VkBufferMemoryBarrier buffer(long value) { nbuffer(address(), value); return this; }
	/** Sets the specified value to the {@code offset} field. */
	public VkBufferMemoryBarrier offset(long value) { noffset(address(), value); return this; }
	/** Sets the specified value to the {@code size} field. */
	public VkBufferMemoryBarrier size(long value) { nsize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkBufferMemoryBarrier set(
		int sType,
		long pNext,
		int srcAccessMask,
		int dstAccessMask,
		int srcQueueFamilyIndex,
		int dstQueueFamilyIndex,
		long buffer,
		long offset,
		long size
	) {
		sType(sType);
		pNext(pNext);
		srcAccessMask(srcAccessMask);
		dstAccessMask(dstAccessMask);
		srcQueueFamilyIndex(srcQueueFamilyIndex);
		dstQueueFamilyIndex(dstQueueFamilyIndex);
		buffer(buffer);
		offset(offset);
		size(size);

		return this;
	}

	/** Unsafe version of {@link #set(VkBufferMemoryBarrier) set}. */
	public VkBufferMemoryBarrier nset(long struct) {
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
	public VkBufferMemoryBarrier set(VkBufferMemoryBarrier src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkBufferMemoryBarrier} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkBufferMemoryBarrier malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkBufferMemoryBarrier} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkBufferMemoryBarrier calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkBufferMemoryBarrier} instance allocated with {@link BufferUtils}. */
	public static VkBufferMemoryBarrier create() {
		return new VkBufferMemoryBarrier(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkBufferMemoryBarrier} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkBufferMemoryBarrier create(long address) {
		return address == NULL ? null : new VkBufferMemoryBarrier(address, null);
	}

	/**
	 * Returns a new {@link VkBufferMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferMemoryBarrier.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkBufferMemoryBarrier.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkBufferMemoryBarrier.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkBufferMemoryBarrier.PNEXT); }
	/** Unsafe version of {@link #srcAccessMask}. */
	public static int nsrcAccessMask(long struct) { return memGetInt(struct + VkBufferMemoryBarrier.SRCACCESSMASK); }
	/** Unsafe version of {@link #dstAccessMask}. */
	public static int ndstAccessMask(long struct) { return memGetInt(struct + VkBufferMemoryBarrier.DSTACCESSMASK); }
	/** Unsafe version of {@link #srcQueueFamilyIndex}. */
	public static int nsrcQueueFamilyIndex(long struct) { return memGetInt(struct + VkBufferMemoryBarrier.SRCQUEUEFAMILYINDEX); }
	/** Unsafe version of {@link #dstQueueFamilyIndex}. */
	public static int ndstQueueFamilyIndex(long struct) { return memGetInt(struct + VkBufferMemoryBarrier.DSTQUEUEFAMILYINDEX); }
	/** Unsafe version of {@link #buffer}. */
	public static long nbuffer(long struct) { return memGetLong(struct + VkBufferMemoryBarrier.BUFFER); }
	/** Unsafe version of {@link #offset}. */
	public static long noffset(long struct) { return memGetLong(struct + VkBufferMemoryBarrier.OFFSET); }
	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetLong(struct + VkBufferMemoryBarrier.SIZE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkBufferMemoryBarrier.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferMemoryBarrier.PNEXT, value); }
	/** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
	public static void nsrcAccessMask(long struct, int value) { memPutInt(struct + VkBufferMemoryBarrier.SRCACCESSMASK, value); }
	/** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
	public static void ndstAccessMask(long struct, int value) { memPutInt(struct + VkBufferMemoryBarrier.DSTACCESSMASK, value); }
	/** Unsafe version of {@link #srcQueueFamilyIndex(int) srcQueueFamilyIndex}. */
	public static void nsrcQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkBufferMemoryBarrier.SRCQUEUEFAMILYINDEX, value); }
	/** Unsafe version of {@link #dstQueueFamilyIndex(int) dstQueueFamilyIndex}. */
	public static void ndstQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkBufferMemoryBarrier.DSTQUEUEFAMILYINDEX, value); }
	/** Unsafe version of {@link #buffer(long) buffer}. */
	public static void nbuffer(long struct, long value) { memPutLong(struct + VkBufferMemoryBarrier.BUFFER, value); }
	/** Unsafe version of {@link #offset(long) offset}. */
	public static void noffset(long struct, long value) { memPutLong(struct + VkBufferMemoryBarrier.OFFSET, value); }
	/** Unsafe version of {@link #size(long) size}. */
	public static void nsize(long struct, long value) { memPutLong(struct + VkBufferMemoryBarrier.SIZE, value); }

	// -----------------------------------

	/** An array of {@link VkBufferMemoryBarrier} structs. */
	public static final class Buffer extends StructBuffer<VkBufferMemoryBarrier, Buffer> {

		/**
		 * Creates a new {@link VkBufferMemoryBarrier.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkBufferMemoryBarrier#SIZEOF}, and its mark will be undefined.
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
		protected VkBufferMemoryBarrier newInstance(long address) {
			return new VkBufferMemoryBarrier(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkBufferMemoryBarrier.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkBufferMemoryBarrier.npNext(address()); }
		/** Returns the value of the {@code srcAccessMask} field. */
		public int srcAccessMask() { return VkBufferMemoryBarrier.nsrcAccessMask(address()); }
		/** Returns the value of the {@code dstAccessMask} field. */
		public int dstAccessMask() { return VkBufferMemoryBarrier.ndstAccessMask(address()); }
		/** Returns the value of the {@code srcQueueFamilyIndex} field. */
		public int srcQueueFamilyIndex() { return VkBufferMemoryBarrier.nsrcQueueFamilyIndex(address()); }
		/** Returns the value of the {@code dstQueueFamilyIndex} field. */
		public int dstQueueFamilyIndex() { return VkBufferMemoryBarrier.ndstQueueFamilyIndex(address()); }
		/** Returns the value of the {@code buffer} field. */
		public long buffer() { return VkBufferMemoryBarrier.nbuffer(address()); }
		/** Returns the value of the {@code offset} field. */
		public long offset() { return VkBufferMemoryBarrier.noffset(address()); }
		/** Returns the value of the {@code size} field. */
		public long size() { return VkBufferMemoryBarrier.nsize(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkBufferMemoryBarrier.Buffer sType(int value) { VkBufferMemoryBarrier.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkBufferMemoryBarrier.Buffer pNext(long value) { VkBufferMemoryBarrier.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code srcAccessMask} field. */
		public VkBufferMemoryBarrier.Buffer srcAccessMask(int value) { VkBufferMemoryBarrier.nsrcAccessMask(address(), value); return this; }
		/** Sets the specified value to the {@code dstAccessMask} field. */
		public VkBufferMemoryBarrier.Buffer dstAccessMask(int value) { VkBufferMemoryBarrier.ndstAccessMask(address(), value); return this; }
		/** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
		public VkBufferMemoryBarrier.Buffer srcQueueFamilyIndex(int value) { VkBufferMemoryBarrier.nsrcQueueFamilyIndex(address(), value); return this; }
		/** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
		public VkBufferMemoryBarrier.Buffer dstQueueFamilyIndex(int value) { VkBufferMemoryBarrier.ndstQueueFamilyIndex(address(), value); return this; }
		/** Sets the specified value to the {@code buffer} field. */
		public VkBufferMemoryBarrier.Buffer buffer(long value) { VkBufferMemoryBarrier.nbuffer(address(), value); return this; }
		/** Sets the specified value to the {@code offset} field. */
		public VkBufferMemoryBarrier.Buffer offset(long value) { VkBufferMemoryBarrier.noffset(address(), value); return this; }
		/** Sets the specified value to the {@code size} field. */
		public VkBufferMemoryBarrier.Buffer size(long value) { VkBufferMemoryBarrier.nsize(address(), value); return this; }

	}

}