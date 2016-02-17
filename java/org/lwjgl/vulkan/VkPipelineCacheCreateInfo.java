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
 * struct VkPipelineCacheCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkPipelineCacheCreateFlags flags;
 *     size_t initialDataSize;
 *     const void * pInitialData;
 * }</code></pre>
 */
public class VkPipelineCacheCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		INITIALDATASIZE,
		PINITIALDATA;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		INITIALDATASIZE = layout.offsetof(3);
		PINITIALDATA = layout.offsetof(4);
	}

	VkPipelineCacheCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineCacheCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineCacheCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code initialDataSize} field. */
	public long initialDataSize() { return ninitialDataSize(address()); }
	/** Returns the value of the {@code pInitialData} field. */
	public long pInitialData() { return npInitialData(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineCacheCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineCacheCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineCacheCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code initialDataSize} field. */
	public VkPipelineCacheCreateInfo initialDataSize(long value) { ninitialDataSize(address(), value); return this; }
	/** Sets the specified value to the {@code pInitialData} field. */
	public VkPipelineCacheCreateInfo pInitialData(long value) { npInitialData(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineCacheCreateInfo set(
		int sType,
		long pNext,
		int flags,
		long initialDataSize,
		long pInitialData
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		initialDataSize(initialDataSize);
		pInitialData(pInitialData);

		return this;
	}

	/** Unsafe version of {@link #set(VkPipelineCacheCreateInfo) set}. */
	public VkPipelineCacheCreateInfo nset(long struct) {
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
	public VkPipelineCacheCreateInfo set(VkPipelineCacheCreateInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkPipelineCacheCreateInfo) set}. */
	public VkPipelineCacheCreateInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineCacheCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineCacheCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineCacheCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineCacheCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineCacheCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkPipelineCacheCreateInfo create() {
		return new VkPipelineCacheCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineCacheCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineCacheCreateInfo create(long address) {
		return address == NULL ? null : new VkPipelineCacheCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineCacheCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineCacheCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineCacheCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineCacheCreateInfo.FLAGS); }
	/** Unsafe version of {@link #initialDataSize}. */
	public static long ninitialDataSize(long struct) { return memGetAddress(struct + VkPipelineCacheCreateInfo.INITIALDATASIZE); }
	/** Unsafe version of {@link #pInitialData}. */
	public static long npInitialData(long struct) { return memGetAddress(struct + VkPipelineCacheCreateInfo.PINITIALDATA); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineCacheCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineCacheCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineCacheCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #initialDataSize(long) initialDataSize}. */
	public static void ninitialDataSize(long struct, long value) { memPutAddress(struct + VkPipelineCacheCreateInfo.INITIALDATASIZE, value); }
	/** Unsafe version of {@link #pInitialData(long) pInitialData}. */
	public static void npInitialData(long struct, long value) { memPutAddress(struct + VkPipelineCacheCreateInfo.PINITIALDATA, value); }

	// -----------------------------------

	/** An array of {@link VkPipelineCacheCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkPipelineCacheCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkPipelineCacheCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineCacheCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineCacheCreateInfo newInstance(long address) {
			return new VkPipelineCacheCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineCacheCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineCacheCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineCacheCreateInfo.nflags(address()); }
		/** Returns the value of the {@code initialDataSize} field. */
		public long initialDataSize() { return VkPipelineCacheCreateInfo.ninitialDataSize(address()); }
		/** Returns the value of the {@code pInitialData} field. */
		public long pInitialData() { return VkPipelineCacheCreateInfo.npInitialData(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineCacheCreateInfo.Buffer sType(int value) { VkPipelineCacheCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineCacheCreateInfo.Buffer pNext(long value) { VkPipelineCacheCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineCacheCreateInfo.Buffer flags(int value) { VkPipelineCacheCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code initialDataSize} field. */
		public VkPipelineCacheCreateInfo.Buffer initialDataSize(long value) { VkPipelineCacheCreateInfo.ninitialDataSize(address(), value); return this; }
		/** Sets the specified value to the {@code pInitialData} field. */
		public VkPipelineCacheCreateInfo.Buffer pInitialData(long value) { VkPipelineCacheCreateInfo.npInitialData(address(), value); return this; }

	}

}