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
 * <pre><code>struct VkSparseImageMemoryBindInfo {
    VkImage image;
    uint32_t bindCount;
    const VkSparseMemoryBind * pBinds;
}</code></pre>
 */
public class VkSparseImageMemoryBindInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		IMAGE,
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

		IMAGE = layout.offsetof(0);
		BINDCOUNT = layout.offsetof(1);
		PBINDS = layout.offsetof(2);
	}

	VkSparseImageMemoryBindInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSparseImageMemoryBindInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSparseImageMemoryBindInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code image} field. */
	public long image() { return nimage(address()); }
	/** Returns the value of the {@code bindCount} field. */
	public int bindCount() { return nbindCount(address()); }
	/** Returns a {@link VkSparseMemoryBind.Buffer} view of the struct array pointed to by the {@code pBinds} field. */
	public VkSparseMemoryBind.Buffer pBinds() { return npBinds(address()); }

	/** Sets the specified value to the {@code image} field. */
	public VkSparseImageMemoryBindInfo image(long value) { nimage(address(), value); return this; }
	/** Sets the address of the specified {@link VkSparseMemoryBind.Buffer} to the {@code pBinds} field. */
	public VkSparseImageMemoryBindInfo pBinds(VkSparseMemoryBind.Buffer value) { npBinds(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSparseImageMemoryBindInfo set(
		long image,
		VkSparseMemoryBind.Buffer pBinds
	) {
		image(image);
		pBinds(pBinds);

		return this;
	}

	/** Unsafe version of {@link #set(VkSparseImageMemoryBindInfo) set}. */
	public VkSparseImageMemoryBindInfo nset(long struct) {
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
	public VkSparseImageMemoryBindInfo set(VkSparseImageMemoryBindInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkSparseImageMemoryBindInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSparseImageMemoryBindInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSparseImageMemoryBindInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSparseImageMemoryBindInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSparseImageMemoryBindInfo} instance allocated with {@link BufferUtils}. */
	public static VkSparseImageMemoryBindInfo create() {
		return new VkSparseImageMemoryBindInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSparseImageMemoryBindInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSparseImageMemoryBindInfo create(long address) {
		return address == NULL ? null : new VkSparseImageMemoryBindInfo(address, null);
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageMemoryBindInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSparseImageMemoryBindInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #image}. */
	public static long nimage(long struct) { return memGetLong(struct + VkSparseImageMemoryBindInfo.IMAGE); }
	/** Unsafe version of {@link #bindCount}. */
	public static int nbindCount(long struct) { return memGetInt(struct + VkSparseImageMemoryBindInfo.BINDCOUNT); }
	/** Unsafe version of {@link #pBinds}. */
	public static VkSparseMemoryBind.Buffer npBinds(long struct) { return VkSparseMemoryBind.create(memGetAddress(struct + VkSparseImageMemoryBindInfo.PBINDS), nbindCount(struct)); }

	/** Unsafe version of {@link #image(long) image}. */
	public static void nimage(long struct, long value) { memPutLong(struct + VkSparseImageMemoryBindInfo.IMAGE, value); }
	/** Sets the specified value to the {@code bindCount} field of the specified {@code struct}. */
	public static void nbindCount(long struct, int value) { memPutInt(struct + VkSparseImageMemoryBindInfo.BINDCOUNT, value); }
	/** Unsafe version of {@link #pBinds(VkSparseMemoryBind.Buffer) pBinds}. */
	public static void npBinds(long struct, VkSparseMemoryBind.Buffer value) { memPutAddress(struct + VkSparseImageMemoryBindInfo.PBINDS, value.address()); nbindCount(struct, value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkSparseImageMemoryBindInfo.PBINDS));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link VkSparseImageMemoryBindInfo} structs. */
	public static final class Buffer extends StructBuffer<VkSparseImageMemoryBindInfo, Buffer> {

		/**
		 * Creates a new {@link VkSparseImageMemoryBindInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSparseImageMemoryBindInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkSparseImageMemoryBindInfo newInstance(long address) {
			return new VkSparseImageMemoryBindInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code image} field. */
		public long image() { return VkSparseImageMemoryBindInfo.nimage(address()); }
		/** Returns the value of the {@code bindCount} field. */
		public int bindCount() { return VkSparseImageMemoryBindInfo.nbindCount(address()); }
		/** Returns a {@link VkSparseMemoryBind.Buffer} view of the struct array pointed to by the {@code pBinds} field. */
		public VkSparseMemoryBind.Buffer pBinds() { return VkSparseImageMemoryBindInfo.npBinds(address()); }

		/** Sets the specified value to the {@code image} field. */
		public VkSparseImageMemoryBindInfo.Buffer image(long value) { VkSparseImageMemoryBindInfo.nimage(address(), value); return this; }
		/** Sets the address of the specified {@link VkSparseMemoryBind.Buffer} to the {@code pBinds} field. */
		public VkSparseImageMemoryBindInfo.Buffer pBinds(VkSparseMemoryBind.Buffer value) { VkSparseImageMemoryBindInfo.npBinds(address(), value); return this; }

	}

}