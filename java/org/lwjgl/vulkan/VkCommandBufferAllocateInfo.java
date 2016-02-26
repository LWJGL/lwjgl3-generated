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
 * struct VkCommandBufferAllocateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkCommandPool commandPool;
 *     VkCommandBufferLevel level;
 *     uint32_t commandBufferCount;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>pNext</td><td>reserved for use by extensions</td></tr>
 * </table>
 */
public class VkCommandBufferAllocateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		COMMANDPOOL,
		LEVEL,
		COMMANDBUFFERCOUNT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(8),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		COMMANDPOOL = layout.offsetof(2);
		LEVEL = layout.offsetof(3);
		COMMANDBUFFERCOUNT = layout.offsetof(4);
	}

	VkCommandBufferAllocateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkCommandBufferAllocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkCommandBufferAllocateInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code commandPool} field. */
	public long commandPool() { return ncommandPool(address()); }
	/** Returns the value of the {@code level} field. */
	public int level() { return nlevel(address()); }
	/** Returns the value of the {@code commandBufferCount} field. */
	public int commandBufferCount() { return ncommandBufferCount(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkCommandBufferAllocateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkCommandBufferAllocateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code commandPool} field. */
	public VkCommandBufferAllocateInfo commandPool(long value) { ncommandPool(address(), value); return this; }
	/** Sets the specified value to the {@code level} field. */
	public VkCommandBufferAllocateInfo level(int value) { nlevel(address(), value); return this; }
	/** Sets the specified value to the {@code commandBufferCount} field. */
	public VkCommandBufferAllocateInfo commandBufferCount(int value) { ncommandBufferCount(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkCommandBufferAllocateInfo set(
		int sType,
		long pNext,
		long commandPool,
		int level,
		int commandBufferCount
	) {
		sType(sType);
		pNext(pNext);
		commandPool(commandPool);
		level(level);
		commandBufferCount(commandBufferCount);

		return this;
	}

	/** Unsafe version of {@link #set(VkCommandBufferAllocateInfo) set}. */
	public VkCommandBufferAllocateInfo nset(long struct) {
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
	public VkCommandBufferAllocateInfo set(VkCommandBufferAllocateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkCommandBufferAllocateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkCommandBufferAllocateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkCommandBufferAllocateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkCommandBufferAllocateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkCommandBufferAllocateInfo} instance allocated with {@link BufferUtils}. */
	public static VkCommandBufferAllocateInfo create() {
		return new VkCommandBufferAllocateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkCommandBufferAllocateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkCommandBufferAllocateInfo create(long address) {
		return address == NULL ? null : new VkCommandBufferAllocateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkCommandBufferAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandBufferAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandBufferAllocateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkCommandBufferAllocateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkCommandBufferAllocateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferAllocateInfo.PNEXT); }
	/** Unsafe version of {@link #commandPool}. */
	public static long ncommandPool(long struct) { return memGetLong(struct + VkCommandBufferAllocateInfo.COMMANDPOOL); }
	/** Unsafe version of {@link #level}. */
	public static int nlevel(long struct) { return memGetInt(struct + VkCommandBufferAllocateInfo.LEVEL); }
	/** Unsafe version of {@link #commandBufferCount}. */
	public static int ncommandBufferCount(long struct) { return memGetInt(struct + VkCommandBufferAllocateInfo.COMMANDBUFFERCOUNT); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkCommandBufferAllocateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferAllocateInfo.PNEXT, value); }
	/** Unsafe version of {@link #commandPool(long) commandPool}. */
	public static void ncommandPool(long struct, long value) { memPutLong(struct + VkCommandBufferAllocateInfo.COMMANDPOOL, value); }
	/** Unsafe version of {@link #level(int) level}. */
	public static void nlevel(long struct, int value) { memPutInt(struct + VkCommandBufferAllocateInfo.LEVEL, value); }
	/** Unsafe version of {@link #commandBufferCount(int) commandBufferCount}. */
	public static void ncommandBufferCount(long struct, int value) { memPutInt(struct + VkCommandBufferAllocateInfo.COMMANDBUFFERCOUNT, value); }

	// -----------------------------------

	/** An array of {@link VkCommandBufferAllocateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkCommandBufferAllocateInfo, Buffer> {

		/**
		 * Creates a new {@link VkCommandBufferAllocateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkCommandBufferAllocateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkCommandBufferAllocateInfo newInstance(long address) {
			return new VkCommandBufferAllocateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkCommandBufferAllocateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkCommandBufferAllocateInfo.npNext(address()); }
		/** Returns the value of the {@code commandPool} field. */
		public long commandPool() { return VkCommandBufferAllocateInfo.ncommandPool(address()); }
		/** Returns the value of the {@code level} field. */
		public int level() { return VkCommandBufferAllocateInfo.nlevel(address()); }
		/** Returns the value of the {@code commandBufferCount} field. */
		public int commandBufferCount() { return VkCommandBufferAllocateInfo.ncommandBufferCount(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkCommandBufferAllocateInfo.Buffer sType(int value) { VkCommandBufferAllocateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkCommandBufferAllocateInfo.Buffer pNext(long value) { VkCommandBufferAllocateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code commandPool} field. */
		public VkCommandBufferAllocateInfo.Buffer commandPool(long value) { VkCommandBufferAllocateInfo.ncommandPool(address(), value); return this; }
		/** Sets the specified value to the {@code level} field. */
		public VkCommandBufferAllocateInfo.Buffer level(int value) { VkCommandBufferAllocateInfo.nlevel(address(), value); return this; }
		/** Sets the specified value to the {@code commandBufferCount} field. */
		public VkCommandBufferAllocateInfo.Buffer commandBufferCount(int value) { VkCommandBufferAllocateInfo.ncommandBufferCount(address(), value); return this; }

	}

}