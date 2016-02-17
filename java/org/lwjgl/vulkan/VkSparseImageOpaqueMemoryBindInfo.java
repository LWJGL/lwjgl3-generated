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
 * struct VkSparseImageOpaqueMemoryBindInfo {
 *     VkImage image;
 *     uint32_t bindCount;
 *     const VkSparseMemoryBind * pBinds;
 * }</code></pre>
 */
public class VkSparseImageOpaqueMemoryBindInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		IMAGE,
		BINDCOUNT,
		PBINDS;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		IMAGE = layout.offsetof(0);
		BINDCOUNT = layout.offsetof(1);
		PBINDS = layout.offsetof(2);
	}

	VkSparseImageOpaqueMemoryBindInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSparseImageOpaqueMemoryBindInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSparseImageOpaqueMemoryBindInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code image} field. */
	public long image() { return nimage(address()); }
	/** Returns the value of the {@code bindCount} field. */
	public int bindCount() { return nbindCount(address()); }
	/** Returns a {@link VkSparseMemoryBind} view of the struct pointed to by the {@code pBinds} field. */
	public VkSparseMemoryBind pBinds() { return npBinds(address()); }

	/** Sets the specified value to the {@code image} field. */
	public VkSparseImageOpaqueMemoryBindInfo image(long value) { nimage(address(), value); return this; }
	/** Sets the specified value to the {@code bindCount} field. */
	public VkSparseImageOpaqueMemoryBindInfo bindCount(int value) { nbindCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkSparseMemoryBind} to the {@code pBinds} field. */
	public VkSparseImageOpaqueMemoryBindInfo pBinds(VkSparseMemoryBind value) { npBinds(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSparseImageOpaqueMemoryBindInfo set(
		long image,
		int bindCount,
		VkSparseMemoryBind pBinds
	) {
		image(image);
		bindCount(bindCount);
		pBinds(pBinds);

		return this;
	}

	/** Unsafe version of {@link #set(VkSparseImageOpaqueMemoryBindInfo) set}. */
	public VkSparseImageOpaqueMemoryBindInfo nset(long struct) {
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
	public VkSparseImageOpaqueMemoryBindInfo set(VkSparseImageOpaqueMemoryBindInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkSparseImageOpaqueMemoryBindInfo) set}. */
	public VkSparseImageOpaqueMemoryBindInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkSparseImageOpaqueMemoryBindInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkSparseImageOpaqueMemoryBindInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSparseImageOpaqueMemoryBindInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkSparseImageOpaqueMemoryBindInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSparseImageOpaqueMemoryBindInfo} instance allocated with {@link BufferUtils}. */
	public static VkSparseImageOpaqueMemoryBindInfo create() {
		return new VkSparseImageOpaqueMemoryBindInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSparseImageOpaqueMemoryBindInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSparseImageOpaqueMemoryBindInfo create(long address) {
		return address == NULL ? null : new VkSparseImageOpaqueMemoryBindInfo(address, null);
	}

	/**
	 * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #image}. */
	public static long nimage(long struct) { return memGetAddress(struct + VkSparseImageOpaqueMemoryBindInfo.IMAGE); }
	/** Unsafe version of {@link #bindCount}. */
	public static int nbindCount(long struct) { return memGetInt(struct + VkSparseImageOpaqueMemoryBindInfo.BINDCOUNT); }
	/** Unsafe version of {@link #pBinds}. */
	public static VkSparseMemoryBind npBinds(long struct) { return VkSparseMemoryBind.create(memGetAddress(struct + VkSparseImageOpaqueMemoryBindInfo.PBINDS)); }

	/** Unsafe version of {@link #image(long) image}. */
	public static void nimage(long struct, long value) { memPutAddress(struct + VkSparseImageOpaqueMemoryBindInfo.IMAGE, value); }
	/** Unsafe version of {@link #bindCount(int) bindCount}. */
	public static void nbindCount(long struct, int value) { memPutInt(struct + VkSparseImageOpaqueMemoryBindInfo.BINDCOUNT, value); }
	/** Unsafe version of {@link #pBinds(VkSparseMemoryBind) pBinds}. */
	public static void npBinds(long struct, VkSparseMemoryBind value) { memPutAddress(struct + VkSparseImageOpaqueMemoryBindInfo.PBINDS, value.address()); }

	// -----------------------------------

	/** An array of {@link VkSparseImageOpaqueMemoryBindInfo} structs. */
	public static final class Buffer extends StructBuffer<VkSparseImageOpaqueMemoryBindInfo, Buffer> {

		/**
		 * Creates a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSparseImageOpaqueMemoryBindInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkSparseImageOpaqueMemoryBindInfo newInstance(long address) {
			return new VkSparseImageOpaqueMemoryBindInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code image} field. */
		public long image() { return VkSparseImageOpaqueMemoryBindInfo.nimage(address()); }
		/** Returns the value of the {@code bindCount} field. */
		public int bindCount() { return VkSparseImageOpaqueMemoryBindInfo.nbindCount(address()); }
		/** Returns a {@link VkSparseMemoryBind} view of the struct pointed to by the {@code pBinds} field. */
		public VkSparseMemoryBind pBinds() { return VkSparseImageOpaqueMemoryBindInfo.npBinds(address()); }

		/** Sets the specified value to the {@code image} field. */
		public VkSparseImageOpaqueMemoryBindInfo.Buffer image(long value) { VkSparseImageOpaqueMemoryBindInfo.nimage(address(), value); return this; }
		/** Sets the specified value to the {@code bindCount} field. */
		public VkSparseImageOpaqueMemoryBindInfo.Buffer bindCount(int value) { VkSparseImageOpaqueMemoryBindInfo.nbindCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkSparseMemoryBind} to the {@code pBinds} field. */
		public VkSparseImageOpaqueMemoryBindInfo.Buffer pBinds(VkSparseMemoryBind value) { VkSparseImageOpaqueMemoryBindInfo.npBinds(address(), value); return this; }

	}

}