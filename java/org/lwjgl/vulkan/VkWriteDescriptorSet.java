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
 * struct VkWriteDescriptorSet {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkDescriptorSet dstSet;
 *     uint32_t dstBinding;
 *     uint32_t dstArrayElement;
 *     uint32_t descriptorCount;
 *     VkDescriptorType descriptorType;
 *     const VkDescriptorImageInfo * pImageInfo;
 *     const VkDescriptorBufferInfo * pBufferInfo;
 *     const VkBufferView * pTexelBufferView;
 * }</code></pre>
 */
public class VkWriteDescriptorSet extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		DSTSET,
		DSTBINDING,
		DSTARRAYELEMENT,
		DESCRIPTORCOUNT,
		DESCRIPTORTYPE,
		PIMAGEINFO,
		PBUFFERINFO,
		PTEXELBUFFERVIEW;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(8),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		DSTSET = layout.offsetof(2);
		DSTBINDING = layout.offsetof(3);
		DSTARRAYELEMENT = layout.offsetof(4);
		DESCRIPTORCOUNT = layout.offsetof(5);
		DESCRIPTORTYPE = layout.offsetof(6);
		PIMAGEINFO = layout.offsetof(7);
		PBUFFERINFO = layout.offsetof(8);
		PTEXELBUFFERVIEW = layout.offsetof(9);
	}

	VkWriteDescriptorSet(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkWriteDescriptorSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkWriteDescriptorSet(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code dstSet} field. */
	public long dstSet() { return ndstSet(address()); }
	/** Returns the value of the {@code dstBinding} field. */
	public int dstBinding() { return ndstBinding(address()); }
	/** Returns the value of the {@code dstArrayElement} field. */
	public int dstArrayElement() { return ndstArrayElement(address()); }
	/** Returns the value of the {@code descriptorCount} field. */
	public int descriptorCount() { return ndescriptorCount(address()); }
	/** Returns the value of the {@code descriptorType} field. */
	public int descriptorType() { return ndescriptorType(address()); }
	/** Returns a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@code pImageInfo} field. */
	public VkDescriptorImageInfo pImageInfo() { return npImageInfo(address()); }
	/** Returns a {@link VkDescriptorBufferInfo} view of the struct pointed to by the {@code pBufferInfo} field. */
	public VkDescriptorBufferInfo pBufferInfo() { return npBufferInfo(address()); }
	/**
	 * Returns a {@link LongBuffer} view of the data pointed to by the {@code pTexelBufferView} field.
	 *
	 * @param capacity the number of elements in the returned {@link LongBuffer}
	 */
	public LongBuffer pTexelBufferView(int capacity) { return npTexelBufferView(address(), capacity); }

	/** Sets the specified value to the {@code sType} field. */
	public VkWriteDescriptorSet sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkWriteDescriptorSet pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code dstSet} field. */
	public VkWriteDescriptorSet dstSet(long value) { ndstSet(address(), value); return this; }
	/** Sets the specified value to the {@code dstBinding} field. */
	public VkWriteDescriptorSet dstBinding(int value) { ndstBinding(address(), value); return this; }
	/** Sets the specified value to the {@code dstArrayElement} field. */
	public VkWriteDescriptorSet dstArrayElement(int value) { ndstArrayElement(address(), value); return this; }
	/** Sets the specified value to the {@code descriptorCount} field. */
	public VkWriteDescriptorSet descriptorCount(int value) { ndescriptorCount(address(), value); return this; }
	/** Sets the specified value to the {@code descriptorType} field. */
	public VkWriteDescriptorSet descriptorType(int value) { ndescriptorType(address(), value); return this; }
	/** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@code pImageInfo} field. */
	public VkWriteDescriptorSet pImageInfo(VkDescriptorImageInfo value) { npImageInfo(address(), value); return this; }
	/** Sets the address of the specified {@link VkDescriptorBufferInfo} to the {@code pBufferInfo} field. */
	public VkWriteDescriptorSet pBufferInfo(VkDescriptorBufferInfo value) { npBufferInfo(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pTexelBufferView} field. */
	public VkWriteDescriptorSet pTexelBufferView(LongBuffer value) { npTexelBufferView(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkWriteDescriptorSet set(
		int sType,
		long pNext,
		long dstSet,
		int dstBinding,
		int dstArrayElement,
		int descriptorCount,
		int descriptorType,
		VkDescriptorImageInfo pImageInfo,
		VkDescriptorBufferInfo pBufferInfo,
		LongBuffer pTexelBufferView
	) {
		sType(sType);
		pNext(pNext);
		dstSet(dstSet);
		dstBinding(dstBinding);
		dstArrayElement(dstArrayElement);
		descriptorCount(descriptorCount);
		descriptorType(descriptorType);
		pImageInfo(pImageInfo);
		pBufferInfo(pBufferInfo);
		pTexelBufferView(pTexelBufferView);

		return this;
	}

	/** Unsafe version of {@link #set(VkWriteDescriptorSet) set}. */
	public VkWriteDescriptorSet nset(long struct) {
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
	public VkWriteDescriptorSet set(VkWriteDescriptorSet src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkWriteDescriptorSet) set}. */
	public VkWriteDescriptorSet set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkWriteDescriptorSet} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkWriteDescriptorSet malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkWriteDescriptorSet} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkWriteDescriptorSet calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkWriteDescriptorSet} instance allocated with {@link BufferUtils}. */
	public static VkWriteDescriptorSet create() {
		return new VkWriteDescriptorSet(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkWriteDescriptorSet} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkWriteDescriptorSet create(long address) {
		return address == NULL ? null : new VkWriteDescriptorSet(address, null);
	}

	/**
	 * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkWriteDescriptorSet.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkWriteDescriptorSet.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkWriteDescriptorSet.PNEXT); }
	/** Unsafe version of {@link #dstSet}. */
	public static long ndstSet(long struct) { return memGetLong(struct + VkWriteDescriptorSet.DSTSET); }
	/** Unsafe version of {@link #dstBinding}. */
	public static int ndstBinding(long struct) { return memGetInt(struct + VkWriteDescriptorSet.DSTBINDING); }
	/** Unsafe version of {@link #dstArrayElement}. */
	public static int ndstArrayElement(long struct) { return memGetInt(struct + VkWriteDescriptorSet.DSTARRAYELEMENT); }
	/** Unsafe version of {@link #descriptorCount}. */
	public static int ndescriptorCount(long struct) { return memGetInt(struct + VkWriteDescriptorSet.DESCRIPTORCOUNT); }
	/** Unsafe version of {@link #descriptorType}. */
	public static int ndescriptorType(long struct) { return memGetInt(struct + VkWriteDescriptorSet.DESCRIPTORTYPE); }
	/** Unsafe version of {@link #pImageInfo}. */
	public static VkDescriptorImageInfo npImageInfo(long struct) { return VkDescriptorImageInfo.create(memGetAddress(struct + VkWriteDescriptorSet.PIMAGEINFO)); }
	/** Unsafe version of {@link #pBufferInfo}. */
	public static VkDescriptorBufferInfo npBufferInfo(long struct) { return VkDescriptorBufferInfo.create(memGetAddress(struct + VkWriteDescriptorSet.PBUFFERINFO)); }
	/** Unsafe version of {@link #pTexelBufferView(int) pTexelBufferView}. */
	public static LongBuffer npTexelBufferView(long struct, int capacity) { return memLongBuffer(memGetAddress(struct + VkWriteDescriptorSet.PTEXELBUFFERVIEW), capacity); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkWriteDescriptorSet.PNEXT, value); }
	/** Unsafe version of {@link #dstSet(long) dstSet}. */
	public static void ndstSet(long struct, long value) { memPutLong(struct + VkWriteDescriptorSet.DSTSET, value); }
	/** Unsafe version of {@link #dstBinding(int) dstBinding}. */
	public static void ndstBinding(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.DSTBINDING, value); }
	/** Unsafe version of {@link #dstArrayElement(int) dstArrayElement}. */
	public static void ndstArrayElement(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.DSTARRAYELEMENT, value); }
	/** Unsafe version of {@link #descriptorCount(int) descriptorCount}. */
	public static void ndescriptorCount(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.DESCRIPTORCOUNT, value); }
	/** Unsafe version of {@link #descriptorType(int) descriptorType}. */
	public static void ndescriptorType(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.DESCRIPTORTYPE, value); }
	/** Unsafe version of {@link #pImageInfo(VkDescriptorImageInfo) pImageInfo}. */
	public static void npImageInfo(long struct, VkDescriptorImageInfo value) { memPutAddress(struct + VkWriteDescriptorSet.PIMAGEINFO, value.address()); }
	/** Unsafe version of {@link #pBufferInfo(VkDescriptorBufferInfo) pBufferInfo}. */
	public static void npBufferInfo(long struct, VkDescriptorBufferInfo value) { memPutAddress(struct + VkWriteDescriptorSet.PBUFFERINFO, value.address()); }
	/** Unsafe version of {@link #pTexelBufferView(LongBuffer) pTexelBufferView}. */
	public static void npTexelBufferView(long struct, LongBuffer value) { memPutAddress(struct + VkWriteDescriptorSet.PTEXELBUFFERVIEW, memAddressSafe(value)); }

	// -----------------------------------

	/** An array of {@link VkWriteDescriptorSet} structs. */
	public static final class Buffer extends StructBuffer<VkWriteDescriptorSet, Buffer> {

		/**
		 * Creates a new {@link VkWriteDescriptorSet.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkWriteDescriptorSet#SIZEOF}, and its mark will be undefined.
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
		protected VkWriteDescriptorSet newInstance(long address) {
			return new VkWriteDescriptorSet(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkWriteDescriptorSet.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkWriteDescriptorSet.npNext(address()); }
		/** Returns the value of the {@code dstSet} field. */
		public long dstSet() { return VkWriteDescriptorSet.ndstSet(address()); }
		/** Returns the value of the {@code dstBinding} field. */
		public int dstBinding() { return VkWriteDescriptorSet.ndstBinding(address()); }
		/** Returns the value of the {@code dstArrayElement} field. */
		public int dstArrayElement() { return VkWriteDescriptorSet.ndstArrayElement(address()); }
		/** Returns the value of the {@code descriptorCount} field. */
		public int descriptorCount() { return VkWriteDescriptorSet.ndescriptorCount(address()); }
		/** Returns the value of the {@code descriptorType} field. */
		public int descriptorType() { return VkWriteDescriptorSet.ndescriptorType(address()); }
		/** Returns a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@code pImageInfo} field. */
		public VkDescriptorImageInfo pImageInfo() { return VkWriteDescriptorSet.npImageInfo(address()); }
		/** Returns a {@link VkDescriptorBufferInfo} view of the struct pointed to by the {@code pBufferInfo} field. */
		public VkDescriptorBufferInfo pBufferInfo() { return VkWriteDescriptorSet.npBufferInfo(address()); }
		/**
		 * Returns a {@link LongBuffer} view of the data pointed to by the {@code pTexelBufferView} field.
		 *
		 * @param capacity the number of elements in the returned {@link LongBuffer}
		 */
		public LongBuffer pTexelBufferView(int capacity) { return VkWriteDescriptorSet.npTexelBufferView(address(), capacity); }

		/** Sets the specified value to the {@code sType} field. */
		public VkWriteDescriptorSet.Buffer sType(int value) { VkWriteDescriptorSet.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkWriteDescriptorSet.Buffer pNext(long value) { VkWriteDescriptorSet.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code dstSet} field. */
		public VkWriteDescriptorSet.Buffer dstSet(long value) { VkWriteDescriptorSet.ndstSet(address(), value); return this; }
		/** Sets the specified value to the {@code dstBinding} field. */
		public VkWriteDescriptorSet.Buffer dstBinding(int value) { VkWriteDescriptorSet.ndstBinding(address(), value); return this; }
		/** Sets the specified value to the {@code dstArrayElement} field. */
		public VkWriteDescriptorSet.Buffer dstArrayElement(int value) { VkWriteDescriptorSet.ndstArrayElement(address(), value); return this; }
		/** Sets the specified value to the {@code descriptorCount} field. */
		public VkWriteDescriptorSet.Buffer descriptorCount(int value) { VkWriteDescriptorSet.ndescriptorCount(address(), value); return this; }
		/** Sets the specified value to the {@code descriptorType} field. */
		public VkWriteDescriptorSet.Buffer descriptorType(int value) { VkWriteDescriptorSet.ndescriptorType(address(), value); return this; }
		/** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@code pImageInfo} field. */
		public VkWriteDescriptorSet.Buffer pImageInfo(VkDescriptorImageInfo value) { VkWriteDescriptorSet.npImageInfo(address(), value); return this; }
		/** Sets the address of the specified {@link VkDescriptorBufferInfo} to the {@code pBufferInfo} field. */
		public VkWriteDescriptorSet.Buffer pBufferInfo(VkDescriptorBufferInfo value) { VkWriteDescriptorSet.npBufferInfo(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pTexelBufferView} field. */
		public VkWriteDescriptorSet.Buffer pTexelBufferView(LongBuffer value) { VkWriteDescriptorSet.npTexelBufferView(address(), value); return this; }

	}

}