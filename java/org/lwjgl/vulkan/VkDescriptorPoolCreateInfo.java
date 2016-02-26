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
 * struct VkDescriptorPoolCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkDescriptorPoolCreateFlags flags;
 *     uint32_t maxSets;
 *     uint32_t poolSizeCount;
 *     const VkDescriptorPoolSize * pPoolSizes;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>pNext</td><td>reserved for use by extensions</td></tr>
 * </table>
 */
public class VkDescriptorPoolCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		MAXSETS,
		POOLSIZECOUNT,
		PPOOLSIZES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		MAXSETS = layout.offsetof(3);
		POOLSIZECOUNT = layout.offsetof(4);
		PPOOLSIZES = layout.offsetof(5);
	}

	VkDescriptorPoolCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDescriptorPoolCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDescriptorPoolCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code maxSets} field. */
	public int maxSets() { return nmaxSets(address()); }
	/** Returns the value of the {@code poolSizeCount} field. */
	public int poolSizeCount() { return npoolSizeCount(address()); }
	/** Returns a {@link VkDescriptorPoolSize.Buffer} view of the struct array pointed to by the {@code pPoolSizes} field. */
	public VkDescriptorPoolSize.Buffer pPoolSizes() { return npPoolSizes(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDescriptorPoolCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDescriptorPoolCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkDescriptorPoolCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code maxSets} field. */
	public VkDescriptorPoolCreateInfo maxSets(int value) { nmaxSets(address(), value); return this; }
	/** Sets the address of the specified {@link VkDescriptorPoolSize.Buffer} to the {@code pPoolSizes} field. */
	public VkDescriptorPoolCreateInfo pPoolSizes(VkDescriptorPoolSize.Buffer value) { npPoolSizes(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDescriptorPoolCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int maxSets,
		VkDescriptorPoolSize.Buffer pPoolSizes
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		maxSets(maxSets);
		pPoolSizes(pPoolSizes);

		return this;
	}

	/** Unsafe version of {@link #set(VkDescriptorPoolCreateInfo) set}. */
	public VkDescriptorPoolCreateInfo nset(long struct) {
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
	public VkDescriptorPoolCreateInfo set(VkDescriptorPoolCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorPoolCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkDescriptorPoolCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorPoolCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkDescriptorPoolCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDescriptorPoolCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkDescriptorPoolCreateInfo create() {
		return new VkDescriptorPoolCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorPoolCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDescriptorPoolCreateInfo create(long address) {
		return address == NULL ? null : new VkDescriptorPoolCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDescriptorPoolCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDescriptorPoolCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorPoolCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkDescriptorPoolCreateInfo.FLAGS); }
	/** Unsafe version of {@link #maxSets}. */
	public static int nmaxSets(long struct) { return memGetInt(struct + VkDescriptorPoolCreateInfo.MAXSETS); }
	/** Unsafe version of {@link #poolSizeCount}. */
	public static int npoolSizeCount(long struct) { return memGetInt(struct + VkDescriptorPoolCreateInfo.POOLSIZECOUNT); }
	/** Unsafe version of {@link #pPoolSizes}. */
	public static VkDescriptorPoolSize.Buffer npPoolSizes(long struct) { return VkDescriptorPoolSize.create(memGetAddress(struct + VkDescriptorPoolCreateInfo.PPOOLSIZES), npoolSizeCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorPoolCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorPoolCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkDescriptorPoolCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #maxSets(int) maxSets}. */
	public static void nmaxSets(long struct, int value) { memPutInt(struct + VkDescriptorPoolCreateInfo.MAXSETS, value); }
	/** Sets the specified value to the {@code poolSizeCount} field of the specified {@code struct}. */
	public static void npoolSizeCount(long struct, int value) { memPutInt(struct + VkDescriptorPoolCreateInfo.POOLSIZECOUNT, value); }
	/** Unsafe version of {@link #pPoolSizes(VkDescriptorPoolSize.Buffer) pPoolSizes}. */
	public static void npPoolSizes(long struct, VkDescriptorPoolSize.Buffer value) { memPutAddress(struct + VkDescriptorPoolCreateInfo.PPOOLSIZES, value.address()); npoolSizeCount(struct, value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkDescriptorPoolCreateInfo.PPOOLSIZES));
	}

	// -----------------------------------

	/** An array of {@link VkDescriptorPoolCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkDescriptorPoolCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkDescriptorPoolCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDescriptorPoolCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkDescriptorPoolCreateInfo newInstance(long address) {
			return new VkDescriptorPoolCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDescriptorPoolCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDescriptorPoolCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkDescriptorPoolCreateInfo.nflags(address()); }
		/** Returns the value of the {@code maxSets} field. */
		public int maxSets() { return VkDescriptorPoolCreateInfo.nmaxSets(address()); }
		/** Returns the value of the {@code poolSizeCount} field. */
		public int poolSizeCount() { return VkDescriptorPoolCreateInfo.npoolSizeCount(address()); }
		/** Returns a {@link VkDescriptorPoolSize.Buffer} view of the struct array pointed to by the {@code pPoolSizes} field. */
		public VkDescriptorPoolSize.Buffer pPoolSizes() { return VkDescriptorPoolCreateInfo.npPoolSizes(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDescriptorPoolCreateInfo.Buffer sType(int value) { VkDescriptorPoolCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDescriptorPoolCreateInfo.Buffer pNext(long value) { VkDescriptorPoolCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkDescriptorPoolCreateInfo.Buffer flags(int value) { VkDescriptorPoolCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code maxSets} field. */
		public VkDescriptorPoolCreateInfo.Buffer maxSets(int value) { VkDescriptorPoolCreateInfo.nmaxSets(address(), value); return this; }
		/** Sets the address of the specified {@link VkDescriptorPoolSize.Buffer} to the {@code pPoolSizes} field. */
		public VkDescriptorPoolCreateInfo.Buffer pPoolSizes(VkDescriptorPoolSize.Buffer value) { VkDescriptorPoolCreateInfo.npPoolSizes(address(), value); return this; }

	}

}