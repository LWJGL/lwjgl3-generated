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
 * struct VkSparseBufferMemoryBindInfo {
 *     VkBuffer buffer;
 *     uint32_t bindCount;
 *     const VkSparseMemoryBind * pBinds;
 * }</code></pre>
 */
public class VkSparseBufferMemoryBindInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		BUFFER,
		BINDCOUNT,
		PBINDS;

	static {
		Layout layout = __struct(
			__member(8),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		BUFFER = layout.offsetof(0);
		BINDCOUNT = layout.offsetof(1);
		PBINDS = layout.offsetof(2);
	}

	VkSparseBufferMemoryBindInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSparseBufferMemoryBindInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSparseBufferMemoryBindInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code buffer} field. */
	public long buffer() { return nbuffer(address()); }
	/** Returns the value of the {@code bindCount} field. */
	public int bindCount() { return nbindCount(address()); }
	/** Returns a {@link VkSparseMemoryBind.Buffer} view of the struct array pointed to by the {@code pBinds} field. */
	public VkSparseMemoryBind.Buffer pBinds(int capacity) { return npBinds(address(), capacity); }

	/** Sets the specified value to the {@code buffer} field. */
	public VkSparseBufferMemoryBindInfo buffer(long value) { nbuffer(address(), value); return this; }
	/** Sets the specified value to the {@code bindCount} field. */
	public VkSparseBufferMemoryBindInfo bindCount(int value) { nbindCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkSparseMemoryBind.Buffer} to the {@code pBinds} field. */
	public VkSparseBufferMemoryBindInfo pBinds(VkSparseMemoryBind.Buffer value) { npBinds(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSparseBufferMemoryBindInfo set(
		long buffer,
		int bindCount,
		VkSparseMemoryBind.Buffer pBinds
	) {
		buffer(buffer);
		bindCount(bindCount);
		pBinds(pBinds);

		return this;
	}

	/** Unsafe version of {@link #set(VkSparseBufferMemoryBindInfo) set}. */
	public VkSparseBufferMemoryBindInfo nset(long struct) {
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
	public VkSparseBufferMemoryBindInfo set(VkSparseBufferMemoryBindInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkSparseBufferMemoryBindInfo) set}. */
	public VkSparseBufferMemoryBindInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkSparseBufferMemoryBindInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkSparseBufferMemoryBindInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSparseBufferMemoryBindInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkSparseBufferMemoryBindInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSparseBufferMemoryBindInfo} instance allocated with {@link BufferUtils}. */
	public static VkSparseBufferMemoryBindInfo create() {
		return new VkSparseBufferMemoryBindInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSparseBufferMemoryBindInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSparseBufferMemoryBindInfo create(long address) {
		return address == NULL ? null : new VkSparseBufferMemoryBindInfo(address, null);
	}

	/**
	 * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSparseBufferMemoryBindInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #buffer}. */
	public static long nbuffer(long struct) { return memGetLong(struct + VkSparseBufferMemoryBindInfo.BUFFER); }
	/** Unsafe version of {@link #bindCount}. */
	public static int nbindCount(long struct) { return memGetInt(struct + VkSparseBufferMemoryBindInfo.BINDCOUNT); }
	/** Unsafe version of {@link #pBinds}. */
	public static VkSparseMemoryBind.Buffer npBinds(long struct, int capacity) { return VkSparseMemoryBind.create(memGetAddress(struct + VkSparseBufferMemoryBindInfo.PBINDS), capacity); }

	/** Unsafe version of {@link #buffer(long) buffer}. */
	public static void nbuffer(long struct, long value) { memPutLong(struct + VkSparseBufferMemoryBindInfo.BUFFER, value); }
	/** Unsafe version of {@link #bindCount(int) bindCount}. */
	public static void nbindCount(long struct, int value) { memPutInt(struct + VkSparseBufferMemoryBindInfo.BINDCOUNT, value); }
	/** Unsafe version of {@link #pBinds(VkSparseMemoryBind.Buffer) pBinds}. */
	public static void npBinds(long struct, VkSparseMemoryBind.Buffer value) { memPutAddress(struct + VkSparseBufferMemoryBindInfo.PBINDS, addressSafe(value)); }

	// -----------------------------------

	/** An array of {@link VkSparseBufferMemoryBindInfo} structs. */
	public static final class Buffer extends StructBuffer<VkSparseBufferMemoryBindInfo, Buffer> {

		/**
		 * Creates a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSparseBufferMemoryBindInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkSparseBufferMemoryBindInfo newInstance(long address) {
			return new VkSparseBufferMemoryBindInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code buffer} field. */
		public long buffer() { return VkSparseBufferMemoryBindInfo.nbuffer(address()); }
		/** Returns the value of the {@code bindCount} field. */
		public int bindCount() { return VkSparseBufferMemoryBindInfo.nbindCount(address()); }
		/** Returns a {@link VkSparseMemoryBind.Buffer} view of the struct array pointed to by the {@code pBinds} field. */
		public VkSparseMemoryBind.Buffer pBinds(int capacity) { return VkSparseBufferMemoryBindInfo.npBinds(address(), capacity); }

		/** Sets the specified value to the {@code buffer} field. */
		public VkSparseBufferMemoryBindInfo.Buffer buffer(long value) { VkSparseBufferMemoryBindInfo.nbuffer(address(), value); return this; }
		/** Sets the specified value to the {@code bindCount} field. */
		public VkSparseBufferMemoryBindInfo.Buffer bindCount(int value) { VkSparseBufferMemoryBindInfo.nbindCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkSparseMemoryBind.Buffer} to the {@code pBinds} field. */
		public VkSparseBufferMemoryBindInfo.Buffer pBinds(VkSparseMemoryBind.Buffer value) { VkSparseBufferMemoryBindInfo.npBinds(address(), value); return this; }

	}

}