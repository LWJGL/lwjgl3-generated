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
 * struct VkPipelineDynamicStateCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkPipelineDynamicStateCreateFlags flags;
 *     uint32_t dynamicStateCount;
 *     const VkDynamicState * pDynamicStates;
 * }</code></pre>
 */
public class VkPipelineDynamicStateCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		DYNAMICSTATECOUNT,
		PDYNAMICSTATES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		DYNAMICSTATECOUNT = layout.offsetof(3);
		PDYNAMICSTATES = layout.offsetof(4);
	}

	VkPipelineDynamicStateCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineDynamicStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineDynamicStateCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code dynamicStateCount} field. */
	public int dynamicStateCount() { return ndynamicStateCount(address()); }
	/**
	 * Returns a {@link IntBuffer} view of the data pointed to by the {@code pDynamicStates} field.
	 *
	 * @param capacity the number of elements in the returned {@link IntBuffer}
	 */
	public IntBuffer pDynamicStates(int capacity) { return npDynamicStates(address(), capacity); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineDynamicStateCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineDynamicStateCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineDynamicStateCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code dynamicStateCount} field. */
	public VkPipelineDynamicStateCreateInfo dynamicStateCount(int value) { ndynamicStateCount(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pDynamicStates} field. */
	public VkPipelineDynamicStateCreateInfo pDynamicStates(IntBuffer value) { npDynamicStates(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineDynamicStateCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int dynamicStateCount,
		IntBuffer pDynamicStates
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		dynamicStateCount(dynamicStateCount);
		pDynamicStates(pDynamicStates);

		return this;
	}

	/** Unsafe version of {@link #set(VkPipelineDynamicStateCreateInfo) set}. */
	public VkPipelineDynamicStateCreateInfo nset(long struct) {
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
	public VkPipelineDynamicStateCreateInfo set(VkPipelineDynamicStateCreateInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkPipelineDynamicStateCreateInfo) set}. */
	public VkPipelineDynamicStateCreateInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineDynamicStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineDynamicStateCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineDynamicStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineDynamicStateCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineDynamicStateCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkPipelineDynamicStateCreateInfo create() {
		return new VkPipelineDynamicStateCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineDynamicStateCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineDynamicStateCreateInfo create(long address) {
		return address == NULL ? null : new VkPipelineDynamicStateCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineDynamicStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineDynamicStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineDynamicStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineDynamicStateCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineDynamicStateCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineDynamicStateCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineDynamicStateCreateInfo.FLAGS); }
	/** Unsafe version of {@link #dynamicStateCount}. */
	public static int ndynamicStateCount(long struct) { return memGetInt(struct + VkPipelineDynamicStateCreateInfo.DYNAMICSTATECOUNT); }
	/** Unsafe version of {@link #pDynamicStates(int) pDynamicStates}. */
	public static IntBuffer npDynamicStates(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + VkPipelineDynamicStateCreateInfo.PDYNAMICSTATES), capacity); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineDynamicStateCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineDynamicStateCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineDynamicStateCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #dynamicStateCount(int) dynamicStateCount}. */
	public static void ndynamicStateCount(long struct, int value) { memPutInt(struct + VkPipelineDynamicStateCreateInfo.DYNAMICSTATECOUNT, value); }
	/** Unsafe version of {@link #pDynamicStates(IntBuffer) pDynamicStates}. */
	public static void npDynamicStates(long struct, IntBuffer value) { memPutAddress(struct + VkPipelineDynamicStateCreateInfo.PDYNAMICSTATES, memAddressSafe(value)); }

	// -----------------------------------

	/** An array of {@link VkPipelineDynamicStateCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkPipelineDynamicStateCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkPipelineDynamicStateCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineDynamicStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineDynamicStateCreateInfo newInstance(long address) {
			return new VkPipelineDynamicStateCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineDynamicStateCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineDynamicStateCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineDynamicStateCreateInfo.nflags(address()); }
		/** Returns the value of the {@code dynamicStateCount} field. */
		public int dynamicStateCount() { return VkPipelineDynamicStateCreateInfo.ndynamicStateCount(address()); }
		/**
		 * Returns a {@link IntBuffer} view of the data pointed to by the {@code pDynamicStates} field.
		 *
		 * @param capacity the number of elements in the returned {@link IntBuffer}
		 */
		public IntBuffer pDynamicStates(int capacity) { return VkPipelineDynamicStateCreateInfo.npDynamicStates(address(), capacity); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineDynamicStateCreateInfo.Buffer sType(int value) { VkPipelineDynamicStateCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineDynamicStateCreateInfo.Buffer pNext(long value) { VkPipelineDynamicStateCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineDynamicStateCreateInfo.Buffer flags(int value) { VkPipelineDynamicStateCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code dynamicStateCount} field. */
		public VkPipelineDynamicStateCreateInfo.Buffer dynamicStateCount(int value) { VkPipelineDynamicStateCreateInfo.ndynamicStateCount(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pDynamicStates} field. */
		public VkPipelineDynamicStateCreateInfo.Buffer pDynamicStates(IntBuffer value) { VkPipelineDynamicStateCreateInfo.npDynamicStates(address(), value); return this; }

	}

}