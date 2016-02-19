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
 * struct VkDescriptorSetLayoutCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkDescriptorSetLayoutCreateFlags flags;
 *     uint32_t bindingCount;
 *     const VkDescriptorSetLayoutBinding * pBindings;
 * }</code></pre>
 */
public class VkDescriptorSetLayoutCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		BINDINGCOUNT,
		PBINDINGS;

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
		BINDINGCOUNT = layout.offsetof(3);
		PBINDINGS = layout.offsetof(4);
	}

	VkDescriptorSetLayoutCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDescriptorSetLayoutCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDescriptorSetLayoutCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code bindingCount} field. */
	public int bindingCount() { return nbindingCount(address()); }
	/** Returns a {@link VkDescriptorSetLayoutBinding.Buffer} view of the struct array pointed to by the {@code pBindings} field. */
	public VkDescriptorSetLayoutBinding.Buffer pBindings(int capacity) { return npBindings(address(), capacity); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDescriptorSetLayoutCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDescriptorSetLayoutCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkDescriptorSetLayoutCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code bindingCount} field. */
	public VkDescriptorSetLayoutCreateInfo bindingCount(int value) { nbindingCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkDescriptorSetLayoutBinding.Buffer} to the {@code pBindings} field. */
	public VkDescriptorSetLayoutCreateInfo pBindings(VkDescriptorSetLayoutBinding.Buffer value) { npBindings(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDescriptorSetLayoutCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int bindingCount,
		VkDescriptorSetLayoutBinding.Buffer pBindings
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		bindingCount(bindingCount);
		pBindings(pBindings);

		return this;
	}

	/** Unsafe version of {@link #set(VkDescriptorSetLayoutCreateInfo) set}. */
	public VkDescriptorSetLayoutCreateInfo nset(long struct) {
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
	public VkDescriptorSetLayoutCreateInfo set(VkDescriptorSetLayoutCreateInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkDescriptorSetLayoutCreateInfo) set}. */
	public VkDescriptorSetLayoutCreateInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorSetLayoutCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkDescriptorSetLayoutCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetLayoutCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkDescriptorSetLayoutCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetLayoutCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkDescriptorSetLayoutCreateInfo create() {
		return new VkDescriptorSetLayoutCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetLayoutCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDescriptorSetLayoutCreateInfo create(long address) {
		return address == NULL ? null : new VkDescriptorSetLayoutCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDescriptorSetLayoutCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetLayoutCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkDescriptorSetLayoutCreateInfo.FLAGS); }
	/** Unsafe version of {@link #bindingCount}. */
	public static int nbindingCount(long struct) { return memGetInt(struct + VkDescriptorSetLayoutCreateInfo.BINDINGCOUNT); }
	/** Unsafe version of {@link #pBindings}. */
	public static VkDescriptorSetLayoutBinding.Buffer npBindings(long struct, int capacity) { return VkDescriptorSetLayoutBinding.create(memGetAddress(struct + VkDescriptorSetLayoutCreateInfo.PBINDINGS), capacity); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetLayoutCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #bindingCount(int) bindingCount}. */
	public static void nbindingCount(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutCreateInfo.BINDINGCOUNT, value); }
	/** Unsafe version of {@link #pBindings(VkDescriptorSetLayoutBinding.Buffer) pBindings}. */
	public static void npBindings(long struct, VkDescriptorSetLayoutBinding.Buffer value) { memPutAddress(struct + VkDescriptorSetLayoutCreateInfo.PBINDINGS, value.address()); }

	// -----------------------------------

	/** An array of {@link VkDescriptorSetLayoutCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkDescriptorSetLayoutCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDescriptorSetLayoutCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkDescriptorSetLayoutCreateInfo newInstance(long address) {
			return new VkDescriptorSetLayoutCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDescriptorSetLayoutCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDescriptorSetLayoutCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkDescriptorSetLayoutCreateInfo.nflags(address()); }
		/** Returns the value of the {@code bindingCount} field. */
		public int bindingCount() { return VkDescriptorSetLayoutCreateInfo.nbindingCount(address()); }
		/** Returns a {@link VkDescriptorSetLayoutBinding.Buffer} view of the struct array pointed to by the {@code pBindings} field. */
		public VkDescriptorSetLayoutBinding.Buffer pBindings(int capacity) { return VkDescriptorSetLayoutCreateInfo.npBindings(address(), capacity); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDescriptorSetLayoutCreateInfo.Buffer sType(int value) { VkDescriptorSetLayoutCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDescriptorSetLayoutCreateInfo.Buffer pNext(long value) { VkDescriptorSetLayoutCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkDescriptorSetLayoutCreateInfo.Buffer flags(int value) { VkDescriptorSetLayoutCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code bindingCount} field. */
		public VkDescriptorSetLayoutCreateInfo.Buffer bindingCount(int value) { VkDescriptorSetLayoutCreateInfo.nbindingCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkDescriptorSetLayoutBinding.Buffer} to the {@code pBindings} field. */
		public VkDescriptorSetLayoutCreateInfo.Buffer pBindings(VkDescriptorSetLayoutBinding.Buffer value) { VkDescriptorSetLayoutCreateInfo.npBindings(address(), value); return this; }

	}

}