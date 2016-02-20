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
 * struct VkCommandPoolCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkCommandPoolCreateFlags flags;
 *     uint32_t queueFamilyIndex;
 * }</code></pre>
 */
public class VkCommandPoolCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		QUEUEFAMILYINDEX;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		QUEUEFAMILYINDEX = layout.offsetof(3);
	}

	VkCommandPoolCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkCommandPoolCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkCommandPoolCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code queueFamilyIndex} field. */
	public int queueFamilyIndex() { return nqueueFamilyIndex(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkCommandPoolCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkCommandPoolCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkCommandPoolCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code queueFamilyIndex} field. */
	public VkCommandPoolCreateInfo queueFamilyIndex(int value) { nqueueFamilyIndex(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkCommandPoolCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int queueFamilyIndex
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		queueFamilyIndex(queueFamilyIndex);

		return this;
	}

	/** Unsafe version of {@link #set(VkCommandPoolCreateInfo) set}. */
	public VkCommandPoolCreateInfo nset(long struct) {
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
	public VkCommandPoolCreateInfo set(VkCommandPoolCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkCommandPoolCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkCommandPoolCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkCommandPoolCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkCommandPoolCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkCommandPoolCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkCommandPoolCreateInfo create() {
		return new VkCommandPoolCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkCommandPoolCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkCommandPoolCreateInfo create(long address) {
		return address == NULL ? null : new VkCommandPoolCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkCommandPoolCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkCommandPoolCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkCommandPoolCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkCommandPoolCreateInfo.FLAGS); }
	/** Unsafe version of {@link #queueFamilyIndex}. */
	public static int nqueueFamilyIndex(long struct) { return memGetInt(struct + VkCommandPoolCreateInfo.QUEUEFAMILYINDEX); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkCommandPoolCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandPoolCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkCommandPoolCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
	public static void nqueueFamilyIndex(long struct, int value) { memPutInt(struct + VkCommandPoolCreateInfo.QUEUEFAMILYINDEX, value); }

	// -----------------------------------

	/** An array of {@link VkCommandPoolCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkCommandPoolCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkCommandPoolCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkCommandPoolCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkCommandPoolCreateInfo newInstance(long address) {
			return new VkCommandPoolCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkCommandPoolCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkCommandPoolCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkCommandPoolCreateInfo.nflags(address()); }
		/** Returns the value of the {@code queueFamilyIndex} field. */
		public int queueFamilyIndex() { return VkCommandPoolCreateInfo.nqueueFamilyIndex(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkCommandPoolCreateInfo.Buffer sType(int value) { VkCommandPoolCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkCommandPoolCreateInfo.Buffer pNext(long value) { VkCommandPoolCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkCommandPoolCreateInfo.Buffer flags(int value) { VkCommandPoolCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code queueFamilyIndex} field. */
		public VkCommandPoolCreateInfo.Buffer queueFamilyIndex(int value) { VkCommandPoolCreateInfo.nqueueFamilyIndex(address(), value); return this; }

	}

}