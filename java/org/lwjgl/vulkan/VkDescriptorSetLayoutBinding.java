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
 * struct VkDescriptorSetLayoutBinding {
 *     uint32_t binding;
 *     VkDescriptorType descriptorType;
 *     uint32_t descriptorCount;
 *     VkShaderStageFlags stageFlags;
 *     const VkSampler * pImmutableSamplers;
 * }</code></pre>
 */
public class VkDescriptorSetLayoutBinding extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		BINDING,
		DESCRIPTORTYPE,
		DESCRIPTORCOUNT,
		STAGEFLAGS,
		PIMMUTABLESAMPLERS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		BINDING = layout.offsetof(0);
		DESCRIPTORTYPE = layout.offsetof(1);
		DESCRIPTORCOUNT = layout.offsetof(2);
		STAGEFLAGS = layout.offsetof(3);
		PIMMUTABLESAMPLERS = layout.offsetof(4);
	}

	VkDescriptorSetLayoutBinding(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDescriptorSetLayoutBinding} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDescriptorSetLayoutBinding(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code binding} field. */
	public int binding() { return nbinding(address()); }
	/** Returns the value of the {@code descriptorType} field. */
	public int descriptorType() { return ndescriptorType(address()); }
	/** Returns the value of the {@code descriptorCount} field. */
	public int descriptorCount() { return ndescriptorCount(address()); }
	/** Returns the value of the {@code stageFlags} field. */
	public int stageFlags() { return nstageFlags(address()); }
	/**
	 * Returns a {@link LongBuffer} view of the data pointed to by the {@code pImmutableSamplers} field.
	 *
	 * @param capacity the number of elements in the returned buffer
	 */
	public LongBuffer pImmutableSamplers(int capacity) { return npImmutableSamplers(address(), capacity); }

	/** Sets the specified value to the {@code binding} field. */
	public VkDescriptorSetLayoutBinding binding(int value) { nbinding(address(), value); return this; }
	/** Sets the specified value to the {@code descriptorType} field. */
	public VkDescriptorSetLayoutBinding descriptorType(int value) { ndescriptorType(address(), value); return this; }
	/** Sets the specified value to the {@code descriptorCount} field. */
	public VkDescriptorSetLayoutBinding descriptorCount(int value) { ndescriptorCount(address(), value); return this; }
	/** Sets the specified value to the {@code stageFlags} field. */
	public VkDescriptorSetLayoutBinding stageFlags(int value) { nstageFlags(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pImmutableSamplers} field. */
	public VkDescriptorSetLayoutBinding pImmutableSamplers(LongBuffer value) { npImmutableSamplers(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDescriptorSetLayoutBinding set(
		int binding,
		int descriptorType,
		int descriptorCount,
		int stageFlags,
		LongBuffer pImmutableSamplers
	) {
		binding(binding);
		descriptorType(descriptorType);
		descriptorCount(descriptorCount);
		stageFlags(stageFlags);
		pImmutableSamplers(pImmutableSamplers);

		return this;
	}

	/** Unsafe version of {@link #set(VkDescriptorSetLayoutBinding) set}. */
	public VkDescriptorSetLayoutBinding nset(long struct) {
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
	public VkDescriptorSetLayoutBinding set(VkDescriptorSetLayoutBinding src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorSetLayoutBinding} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkDescriptorSetLayoutBinding malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetLayoutBinding} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkDescriptorSetLayoutBinding calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetLayoutBinding} instance allocated with {@link BufferUtils}. */
	public static VkDescriptorSetLayoutBinding create() {
		return new VkDescriptorSetLayoutBinding(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetLayoutBinding} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDescriptorSetLayoutBinding create(long address) {
		return address == NULL ? null : new VkDescriptorSetLayoutBinding(address, null);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDescriptorSetLayoutBinding.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #binding}. */
	public static int nbinding(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBinding.BINDING); }
	/** Unsafe version of {@link #descriptorType}. */
	public static int ndescriptorType(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBinding.DESCRIPTORTYPE); }
	/** Unsafe version of {@link #descriptorCount}. */
	public static int ndescriptorCount(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBinding.DESCRIPTORCOUNT); }
	/** Unsafe version of {@link #stageFlags}. */
	public static int nstageFlags(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBinding.STAGEFLAGS); }
	/** Unsafe version of {@link #pImmutableSamplers(int) pImmutableSamplers}. */
	public static LongBuffer npImmutableSamplers(long struct, int capacity) { return memLongBuffer(memGetAddress(struct + VkDescriptorSetLayoutBinding.PIMMUTABLESAMPLERS), capacity); }

	/** Unsafe version of {@link #binding(int) binding}. */
	public static void nbinding(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBinding.BINDING, value); }
	/** Unsafe version of {@link #descriptorType(int) descriptorType}. */
	public static void ndescriptorType(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBinding.DESCRIPTORTYPE, value); }
	/** Unsafe version of {@link #descriptorCount(int) descriptorCount}. */
	public static void ndescriptorCount(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBinding.DESCRIPTORCOUNT, value); }
	/** Unsafe version of {@link #stageFlags(int) stageFlags}. */
	public static void nstageFlags(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBinding.STAGEFLAGS, value); }
	/** Unsafe version of {@link #pImmutableSamplers(LongBuffer) pImmutableSamplers}. */
	public static void npImmutableSamplers(long struct, LongBuffer value) { memPutAddress(struct + VkDescriptorSetLayoutBinding.PIMMUTABLESAMPLERS, memAddressSafe(value)); }

	// -----------------------------------

	/** An array of {@link VkDescriptorSetLayoutBinding} structs. */
	public static final class Buffer extends StructBuffer<VkDescriptorSetLayoutBinding, Buffer> {

		/**
		 * Creates a new {@link VkDescriptorSetLayoutBinding.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDescriptorSetLayoutBinding#SIZEOF}, and its mark will be undefined.
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
		protected VkDescriptorSetLayoutBinding newInstance(long address) {
			return new VkDescriptorSetLayoutBinding(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code binding} field. */
		public int binding() { return VkDescriptorSetLayoutBinding.nbinding(address()); }
		/** Returns the value of the {@code descriptorType} field. */
		public int descriptorType() { return VkDescriptorSetLayoutBinding.ndescriptorType(address()); }
		/** Returns the value of the {@code descriptorCount} field. */
		public int descriptorCount() { return VkDescriptorSetLayoutBinding.ndescriptorCount(address()); }
		/** Returns the value of the {@code stageFlags} field. */
		public int stageFlags() { return VkDescriptorSetLayoutBinding.nstageFlags(address()); }
		/**
		 * Returns a {@link LongBuffer} view of the data pointed to by the {@code pImmutableSamplers} field.
		 *
		 * @param capacity the number of elements in the returned buffer
		 */
		public LongBuffer pImmutableSamplers(int capacity) { return VkDescriptorSetLayoutBinding.npImmutableSamplers(address(), capacity); }

		/** Sets the specified value to the {@code binding} field. */
		public VkDescriptorSetLayoutBinding.Buffer binding(int value) { VkDescriptorSetLayoutBinding.nbinding(address(), value); return this; }
		/** Sets the specified value to the {@code descriptorType} field. */
		public VkDescriptorSetLayoutBinding.Buffer descriptorType(int value) { VkDescriptorSetLayoutBinding.ndescriptorType(address(), value); return this; }
		/** Sets the specified value to the {@code descriptorCount} field. */
		public VkDescriptorSetLayoutBinding.Buffer descriptorCount(int value) { VkDescriptorSetLayoutBinding.ndescriptorCount(address(), value); return this; }
		/** Sets the specified value to the {@code stageFlags} field. */
		public VkDescriptorSetLayoutBinding.Buffer stageFlags(int value) { VkDescriptorSetLayoutBinding.nstageFlags(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pImmutableSamplers} field. */
		public VkDescriptorSetLayoutBinding.Buffer pImmutableSamplers(LongBuffer value) { VkDescriptorSetLayoutBinding.npImmutableSamplers(address(), value); return this; }

	}

}