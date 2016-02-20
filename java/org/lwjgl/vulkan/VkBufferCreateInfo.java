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
 * struct VkBufferCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkBufferCreateFlags flags;
 *     VkDeviceSize size;
 *     VkBufferUsageFlags usage;
 *     VkSharingMode sharingMode;
 *     uint32_t queueFamilyIndexCount;
 *     const uint32_t * pQueueFamilyIndices;
 * }</code></pre>
 */
public class VkBufferCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		SIZE,
		USAGE,
		SHARINGMODE,
		QUEUEFAMILYINDEXCOUNT,
		PQUEUEFAMILYINDICES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(8),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		SIZE = layout.offsetof(3);
		USAGE = layout.offsetof(4);
		SHARINGMODE = layout.offsetof(5);
		QUEUEFAMILYINDEXCOUNT = layout.offsetof(6);
		PQUEUEFAMILYINDICES = layout.offsetof(7);
	}

	VkBufferCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkBufferCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkBufferCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }
	/** Returns the value of the {@code usage} field. */
	public int usage() { return nusage(address()); }
	/** Returns the value of the {@code sharingMode} field. */
	public int sharingMode() { return nsharingMode(address()); }
	/** Returns the value of the {@code queueFamilyIndexCount} field. */
	public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
	public IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkBufferCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkBufferCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkBufferCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code size} field. */
	public VkBufferCreateInfo size(long value) { nsize(address(), value); return this; }
	/** Sets the specified value to the {@code usage} field. */
	public VkBufferCreateInfo usage(int value) { nusage(address(), value); return this; }
	/** Sets the specified value to the {@code sharingMode} field. */
	public VkBufferCreateInfo sharingMode(int value) { nsharingMode(address(), value); return this; }
	/** Sets the specified value to the {@code queueFamilyIndexCount} field. */
	public VkBufferCreateInfo queueFamilyIndexCount(int value) { nqueueFamilyIndexCount(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
	public VkBufferCreateInfo pQueueFamilyIndices(IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkBufferCreateInfo set(
		int sType,
		long pNext,
		int flags,
		long size,
		int usage,
		int sharingMode,
		IntBuffer pQueueFamilyIndices
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		size(size);
		usage(usage);
		sharingMode(sharingMode);
		queueFamilyIndexCount(pQueueFamilyIndices != null ? pQueueFamilyIndices.remaining() : 0);
		pQueueFamilyIndices(pQueueFamilyIndices);

		return this;
	}

	/** Unsafe version of {@link #set(VkBufferCreateInfo) set}. */
	public VkBufferCreateInfo nset(long struct) {
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
	public VkBufferCreateInfo set(VkBufferCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkBufferCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkBufferCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkBufferCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkBufferCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkBufferCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkBufferCreateInfo create() {
		return new VkBufferCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkBufferCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkBufferCreateInfo create(long address) {
		return address == NULL ? null : new VkBufferCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkBufferCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkBufferCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkBufferCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkBufferCreateInfo.FLAGS); }
	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetLong(struct + VkBufferCreateInfo.SIZE); }
	/** Unsafe version of {@link #usage}. */
	public static int nusage(long struct) { return memGetInt(struct + VkBufferCreateInfo.USAGE); }
	/** Unsafe version of {@link #sharingMode}. */
	public static int nsharingMode(long struct) { return memGetInt(struct + VkBufferCreateInfo.SHARINGMODE); }
	/** Unsafe version of {@link #queueFamilyIndexCount}. */
	public static int nqueueFamilyIndexCount(long struct) { return memGetInt(struct + VkBufferCreateInfo.QUEUEFAMILYINDEXCOUNT); }
	/** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
	public static IntBuffer npQueueFamilyIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkBufferCreateInfo.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #size(long) size}. */
	public static void nsize(long struct, long value) { memPutLong(struct + VkBufferCreateInfo.SIZE, value); }
	/** Unsafe version of {@link #usage(int) usage}. */
	public static void nusage(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.USAGE, value); }
	/** Unsafe version of {@link #sharingMode(int) sharingMode}. */
	public static void nsharingMode(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.SHARINGMODE, value); }
	/** Unsafe version of {@link #queueFamilyIndexCount(int) queueFamilyIndexCount}. */
	public static void nqueueFamilyIndexCount(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.QUEUEFAMILYINDEXCOUNT, value); }
	/** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
	public static void npQueueFamilyIndices(long struct, IntBuffer value) { memPutAddress(struct + VkBufferCreateInfo.PQUEUEFAMILYINDICES, memAddressSafe(value)); }

	// -----------------------------------

	/** An array of {@link VkBufferCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkBufferCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkBufferCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkBufferCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkBufferCreateInfo newInstance(long address) {
			return new VkBufferCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkBufferCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkBufferCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkBufferCreateInfo.nflags(address()); }
		/** Returns the value of the {@code size} field. */
		public long size() { return VkBufferCreateInfo.nsize(address()); }
		/** Returns the value of the {@code usage} field. */
		public int usage() { return VkBufferCreateInfo.nusage(address()); }
		/** Returns the value of the {@code sharingMode} field. */
		public int sharingMode() { return VkBufferCreateInfo.nsharingMode(address()); }
		/** Returns the value of the {@code queueFamilyIndexCount} field. */
		public int queueFamilyIndexCount() { return VkBufferCreateInfo.nqueueFamilyIndexCount(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
		public IntBuffer pQueueFamilyIndices() { return VkBufferCreateInfo.npQueueFamilyIndices(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkBufferCreateInfo.Buffer sType(int value) { VkBufferCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkBufferCreateInfo.Buffer pNext(long value) { VkBufferCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkBufferCreateInfo.Buffer flags(int value) { VkBufferCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code size} field. */
		public VkBufferCreateInfo.Buffer size(long value) { VkBufferCreateInfo.nsize(address(), value); return this; }
		/** Sets the specified value to the {@code usage} field. */
		public VkBufferCreateInfo.Buffer usage(int value) { VkBufferCreateInfo.nusage(address(), value); return this; }
		/** Sets the specified value to the {@code sharingMode} field. */
		public VkBufferCreateInfo.Buffer sharingMode(int value) { VkBufferCreateInfo.nsharingMode(address(), value); return this; }
		/** Sets the specified value to the {@code queueFamilyIndexCount} field. */
		public VkBufferCreateInfo.Buffer queueFamilyIndexCount(int value) { VkBufferCreateInfo.nqueueFamilyIndexCount(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
		public VkBufferCreateInfo.Buffer pQueueFamilyIndices(IntBuffer value) { VkBufferCreateInfo.npQueueFamilyIndices(address(), value); return this; }

	}

}