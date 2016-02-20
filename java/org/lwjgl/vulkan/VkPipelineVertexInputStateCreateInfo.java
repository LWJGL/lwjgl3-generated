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
 * struct VkPipelineVertexInputStateCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkPipelineVertexInputStateCreateFlags flags;
 *     uint32_t vertexBindingDescriptionCount;
 *     const VkVertexInputBindingDescription * pVertexBindingDescriptions;
 *     uint32_t vertexAttributeDescriptionCount;
 *     const VkVertexInputAttributeDescription * pVertexAttributeDescriptions;
 * }</code></pre>
 */
public class VkPipelineVertexInputStateCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		VERTEXBINDINGDESCRIPTIONCOUNT,
		PVERTEXBINDINGDESCRIPTIONS,
		VERTEXATTRIBUTEDESCRIPTIONCOUNT,
		PVERTEXATTRIBUTEDESCRIPTIONS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		VERTEXBINDINGDESCRIPTIONCOUNT = layout.offsetof(3);
		PVERTEXBINDINGDESCRIPTIONS = layout.offsetof(4);
		VERTEXATTRIBUTEDESCRIPTIONCOUNT = layout.offsetof(5);
		PVERTEXATTRIBUTEDESCRIPTIONS = layout.offsetof(6);
	}

	VkPipelineVertexInputStateCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineVertexInputStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineVertexInputStateCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code vertexBindingDescriptionCount} field. */
	public int vertexBindingDescriptionCount() { return nvertexBindingDescriptionCount(address()); }
	/** Returns a {@link VkVertexInputBindingDescription.Buffer} view of the struct array pointed to by the {@code pVertexBindingDescriptions} field. */
	public VkVertexInputBindingDescription.Buffer pVertexBindingDescriptions(int capacity) { return npVertexBindingDescriptions(address(), capacity); }
	/** Returns the value of the {@code vertexAttributeDescriptionCount} field. */
	public int vertexAttributeDescriptionCount() { return nvertexAttributeDescriptionCount(address()); }
	/** Returns a {@link VkVertexInputAttributeDescription.Buffer} view of the struct array pointed to by the {@code pVertexAttributeDescriptions} field. */
	public VkVertexInputAttributeDescription.Buffer pVertexAttributeDescriptions(int capacity) { return npVertexAttributeDescriptions(address(), capacity); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineVertexInputStateCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineVertexInputStateCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineVertexInputStateCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code vertexBindingDescriptionCount} field. */
	public VkPipelineVertexInputStateCreateInfo vertexBindingDescriptionCount(int value) { nvertexBindingDescriptionCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkVertexInputBindingDescription.Buffer} to the {@code pVertexBindingDescriptions} field. */
	public VkPipelineVertexInputStateCreateInfo pVertexBindingDescriptions(VkVertexInputBindingDescription.Buffer value) { npVertexBindingDescriptions(address(), value); return this; }
	/** Sets the specified value to the {@code vertexAttributeDescriptionCount} field. */
	public VkPipelineVertexInputStateCreateInfo vertexAttributeDescriptionCount(int value) { nvertexAttributeDescriptionCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkVertexInputAttributeDescription.Buffer} to the {@code pVertexAttributeDescriptions} field. */
	public VkPipelineVertexInputStateCreateInfo pVertexAttributeDescriptions(VkVertexInputAttributeDescription.Buffer value) { npVertexAttributeDescriptions(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineVertexInputStateCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int vertexBindingDescriptionCount,
		VkVertexInputBindingDescription.Buffer pVertexBindingDescriptions,
		int vertexAttributeDescriptionCount,
		VkVertexInputAttributeDescription.Buffer pVertexAttributeDescriptions
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		vertexBindingDescriptionCount(vertexBindingDescriptionCount);
		pVertexBindingDescriptions(pVertexBindingDescriptions);
		vertexAttributeDescriptionCount(vertexAttributeDescriptionCount);
		pVertexAttributeDescriptions(pVertexAttributeDescriptions);

		return this;
	}

	/** Unsafe version of {@link #set(VkPipelineVertexInputStateCreateInfo) set}. */
	public VkPipelineVertexInputStateCreateInfo nset(long struct) {
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
	public VkPipelineVertexInputStateCreateInfo set(VkPipelineVertexInputStateCreateInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkPipelineVertexInputStateCreateInfo) set}. */
	public VkPipelineVertexInputStateCreateInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineVertexInputStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineVertexInputStateCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineVertexInputStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineVertexInputStateCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineVertexInputStateCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkPipelineVertexInputStateCreateInfo create() {
		return new VkPipelineVertexInputStateCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineVertexInputStateCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineVertexInputStateCreateInfo create(long address) {
		return address == NULL ? null : new VkPipelineVertexInputStateCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineVertexInputStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineVertexInputStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineVertexInputStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineVertexInputStateCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineVertexInputStateCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineVertexInputStateCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineVertexInputStateCreateInfo.FLAGS); }
	/** Unsafe version of {@link #vertexBindingDescriptionCount}. */
	public static int nvertexBindingDescriptionCount(long struct) { return memGetInt(struct + VkPipelineVertexInputStateCreateInfo.VERTEXBINDINGDESCRIPTIONCOUNT); }
	/** Unsafe version of {@link #pVertexBindingDescriptions}. */
	public static VkVertexInputBindingDescription.Buffer npVertexBindingDescriptions(long struct, int capacity) { return VkVertexInputBindingDescription.create(memGetAddress(struct + VkPipelineVertexInputStateCreateInfo.PVERTEXBINDINGDESCRIPTIONS), capacity); }
	/** Unsafe version of {@link #vertexAttributeDescriptionCount}. */
	public static int nvertexAttributeDescriptionCount(long struct) { return memGetInt(struct + VkPipelineVertexInputStateCreateInfo.VERTEXATTRIBUTEDESCRIPTIONCOUNT); }
	/** Unsafe version of {@link #pVertexAttributeDescriptions}. */
	public static VkVertexInputAttributeDescription.Buffer npVertexAttributeDescriptions(long struct, int capacity) { return VkVertexInputAttributeDescription.create(memGetAddress(struct + VkPipelineVertexInputStateCreateInfo.PVERTEXATTRIBUTEDESCRIPTIONS), capacity); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineVertexInputStateCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineVertexInputStateCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineVertexInputStateCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #vertexBindingDescriptionCount(int) vertexBindingDescriptionCount}. */
	public static void nvertexBindingDescriptionCount(long struct, int value) { memPutInt(struct + VkPipelineVertexInputStateCreateInfo.VERTEXBINDINGDESCRIPTIONCOUNT, value); }
	/** Unsafe version of {@link #pVertexBindingDescriptions(VkVertexInputBindingDescription.Buffer) pVertexBindingDescriptions}. */
	public static void npVertexBindingDescriptions(long struct, VkVertexInputBindingDescription.Buffer value) { memPutAddress(struct + VkPipelineVertexInputStateCreateInfo.PVERTEXBINDINGDESCRIPTIONS, addressSafe(value)); }
	/** Unsafe version of {@link #vertexAttributeDescriptionCount(int) vertexAttributeDescriptionCount}. */
	public static void nvertexAttributeDescriptionCount(long struct, int value) { memPutInt(struct + VkPipelineVertexInputStateCreateInfo.VERTEXATTRIBUTEDESCRIPTIONCOUNT, value); }
	/** Unsafe version of {@link #pVertexAttributeDescriptions(VkVertexInputAttributeDescription.Buffer) pVertexAttributeDescriptions}. */
	public static void npVertexAttributeDescriptions(long struct, VkVertexInputAttributeDescription.Buffer value) { memPutAddress(struct + VkPipelineVertexInputStateCreateInfo.PVERTEXATTRIBUTEDESCRIPTIONS, addressSafe(value)); }

	// -----------------------------------

	/** An array of {@link VkPipelineVertexInputStateCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkPipelineVertexInputStateCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkPipelineVertexInputStateCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineVertexInputStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineVertexInputStateCreateInfo newInstance(long address) {
			return new VkPipelineVertexInputStateCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineVertexInputStateCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineVertexInputStateCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineVertexInputStateCreateInfo.nflags(address()); }
		/** Returns the value of the {@code vertexBindingDescriptionCount} field. */
		public int vertexBindingDescriptionCount() { return VkPipelineVertexInputStateCreateInfo.nvertexBindingDescriptionCount(address()); }
		/** Returns a {@link VkVertexInputBindingDescription.Buffer} view of the struct array pointed to by the {@code pVertexBindingDescriptions} field. */
		public VkVertexInputBindingDescription.Buffer pVertexBindingDescriptions(int capacity) { return VkPipelineVertexInputStateCreateInfo.npVertexBindingDescriptions(address(), capacity); }
		/** Returns the value of the {@code vertexAttributeDescriptionCount} field. */
		public int vertexAttributeDescriptionCount() { return VkPipelineVertexInputStateCreateInfo.nvertexAttributeDescriptionCount(address()); }
		/** Returns a {@link VkVertexInputAttributeDescription.Buffer} view of the struct array pointed to by the {@code pVertexAttributeDescriptions} field. */
		public VkVertexInputAttributeDescription.Buffer pVertexAttributeDescriptions(int capacity) { return VkPipelineVertexInputStateCreateInfo.npVertexAttributeDescriptions(address(), capacity); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineVertexInputStateCreateInfo.Buffer sType(int value) { VkPipelineVertexInputStateCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineVertexInputStateCreateInfo.Buffer pNext(long value) { VkPipelineVertexInputStateCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineVertexInputStateCreateInfo.Buffer flags(int value) { VkPipelineVertexInputStateCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code vertexBindingDescriptionCount} field. */
		public VkPipelineVertexInputStateCreateInfo.Buffer vertexBindingDescriptionCount(int value) { VkPipelineVertexInputStateCreateInfo.nvertexBindingDescriptionCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkVertexInputBindingDescription.Buffer} to the {@code pVertexBindingDescriptions} field. */
		public VkPipelineVertexInputStateCreateInfo.Buffer pVertexBindingDescriptions(VkVertexInputBindingDescription.Buffer value) { VkPipelineVertexInputStateCreateInfo.npVertexBindingDescriptions(address(), value); return this; }
		/** Sets the specified value to the {@code vertexAttributeDescriptionCount} field. */
		public VkPipelineVertexInputStateCreateInfo.Buffer vertexAttributeDescriptionCount(int value) { VkPipelineVertexInputStateCreateInfo.nvertexAttributeDescriptionCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkVertexInputAttributeDescription.Buffer} to the {@code pVertexAttributeDescriptions} field. */
		public VkPipelineVertexInputStateCreateInfo.Buffer pVertexAttributeDescriptions(VkVertexInputAttributeDescription.Buffer value) { VkPipelineVertexInputStateCreateInfo.npVertexAttributeDescriptions(address(), value); return this; }

	}

}