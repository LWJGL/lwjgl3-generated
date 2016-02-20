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
 * struct VkDescriptorSetAllocateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkDescriptorPool descriptorPool;
 *     uint32_t descriptorSetCount;
 *     const VkDescriptorSetLayout * pSetLayouts;
 * }</code></pre>
 */
public class VkDescriptorSetAllocateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		DESCRIPTORPOOL,
		DESCRIPTORSETCOUNT,
		PSETLAYOUTS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(8),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		DESCRIPTORPOOL = layout.offsetof(2);
		DESCRIPTORSETCOUNT = layout.offsetof(3);
		PSETLAYOUTS = layout.offsetof(4);
	}

	VkDescriptorSetAllocateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDescriptorSetAllocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDescriptorSetAllocateInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code descriptorPool} field. */
	public long descriptorPool() { return ndescriptorPool(address()); }
	/** Returns the value of the {@code descriptorSetCount} field. */
	public int descriptorSetCount() { return ndescriptorSetCount(address()); }
	/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSetLayouts} field. */
	public LongBuffer pSetLayouts() { return npSetLayouts(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDescriptorSetAllocateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDescriptorSetAllocateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code descriptorPool} field. */
	public VkDescriptorSetAllocateInfo descriptorPool(long value) { ndescriptorPool(address(), value); return this; }
	/** Sets the specified value to the {@code descriptorSetCount} field. */
	public VkDescriptorSetAllocateInfo descriptorSetCount(int value) { ndescriptorSetCount(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pSetLayouts} field. */
	public VkDescriptorSetAllocateInfo pSetLayouts(LongBuffer value) { npSetLayouts(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDescriptorSetAllocateInfo set(
		int sType,
		long pNext,
		long descriptorPool,
		LongBuffer pSetLayouts
	) {
		sType(sType);
		pNext(pNext);
		descriptorPool(descriptorPool);
		descriptorSetCount(pSetLayouts != null ? pSetLayouts.remaining() : 0);
		pSetLayouts(pSetLayouts);

		return this;
	}

	/** Unsafe version of {@link #set(VkDescriptorSetAllocateInfo) set}. */
	public VkDescriptorSetAllocateInfo nset(long struct) {
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
	public VkDescriptorSetAllocateInfo set(VkDescriptorSetAllocateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorSetAllocateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkDescriptorSetAllocateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetAllocateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkDescriptorSetAllocateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetAllocateInfo} instance allocated with {@link BufferUtils}. */
	public static VkDescriptorSetAllocateInfo create() {
		return new VkDescriptorSetAllocateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetAllocateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDescriptorSetAllocateInfo create(long address) {
		return address == NULL ? null : new VkDescriptorSetAllocateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkDescriptorSetAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorSetAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorSetAllocateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDescriptorSetAllocateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDescriptorSetAllocateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetAllocateInfo.PNEXT); }
	/** Unsafe version of {@link #descriptorPool}. */
	public static long ndescriptorPool(long struct) { return memGetLong(struct + VkDescriptorSetAllocateInfo.DESCRIPTORPOOL); }
	/** Unsafe version of {@link #descriptorSetCount}. */
	public static int ndescriptorSetCount(long struct) { return memGetInt(struct + VkDescriptorSetAllocateInfo.DESCRIPTORSETCOUNT); }
	/** Unsafe version of {@link #pSetLayouts() pSetLayouts}. */
	public static LongBuffer npSetLayouts(long struct) { return memLongBuffer(memGetAddress(struct + VkDescriptorSetAllocateInfo.PSETLAYOUTS), ndescriptorSetCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorSetAllocateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetAllocateInfo.PNEXT, value); }
	/** Unsafe version of {@link #descriptorPool(long) descriptorPool}. */
	public static void ndescriptorPool(long struct, long value) { memPutLong(struct + VkDescriptorSetAllocateInfo.DESCRIPTORPOOL, value); }
	/** Unsafe version of {@link #descriptorSetCount(int) descriptorSetCount}. */
	public static void ndescriptorSetCount(long struct, int value) { memPutInt(struct + VkDescriptorSetAllocateInfo.DESCRIPTORSETCOUNT, value); }
	/** Unsafe version of {@link #pSetLayouts(LongBuffer) pSetLayouts}. */
	public static void npSetLayouts(long struct, LongBuffer value) { memPutAddress(struct + VkDescriptorSetAllocateInfo.PSETLAYOUTS, memAddressSafe(value)); }

	// -----------------------------------

	/** An array of {@link VkDescriptorSetAllocateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkDescriptorSetAllocateInfo, Buffer> {

		/**
		 * Creates a new {@link VkDescriptorSetAllocateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDescriptorSetAllocateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkDescriptorSetAllocateInfo newInstance(long address) {
			return new VkDescriptorSetAllocateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDescriptorSetAllocateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDescriptorSetAllocateInfo.npNext(address()); }
		/** Returns the value of the {@code descriptorPool} field. */
		public long descriptorPool() { return VkDescriptorSetAllocateInfo.ndescriptorPool(address()); }
		/** Returns the value of the {@code descriptorSetCount} field. */
		public int descriptorSetCount() { return VkDescriptorSetAllocateInfo.ndescriptorSetCount(address()); }
		/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSetLayouts} field. */
		public LongBuffer pSetLayouts() { return VkDescriptorSetAllocateInfo.npSetLayouts(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDescriptorSetAllocateInfo.Buffer sType(int value) { VkDescriptorSetAllocateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDescriptorSetAllocateInfo.Buffer pNext(long value) { VkDescriptorSetAllocateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code descriptorPool} field. */
		public VkDescriptorSetAllocateInfo.Buffer descriptorPool(long value) { VkDescriptorSetAllocateInfo.ndescriptorPool(address(), value); return this; }
		/** Sets the specified value to the {@code descriptorSetCount} field. */
		public VkDescriptorSetAllocateInfo.Buffer descriptorSetCount(int value) { VkDescriptorSetAllocateInfo.ndescriptorSetCount(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pSetLayouts} field. */
		public VkDescriptorSetAllocateInfo.Buffer pSetLayouts(LongBuffer value) { VkDescriptorSetAllocateInfo.npSetLayouts(address(), value); return this; }

	}

}