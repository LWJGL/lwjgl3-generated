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
 * struct VkPipelineLayoutCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkPipelineLayoutCreateFlags flags;
 *     uint32_t setLayoutCount;
 *     const VkDescriptorSetLayout * pSetLayouts;
 *     uint32_t pushConstantRangeCount;
 *     const VkPushConstantRange * pPushConstantRanges;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>pNext</td><td>reserved for use by extensions</td></tr>
 * </table>
 */
public class VkPipelineLayoutCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		SETLAYOUTCOUNT,
		PSETLAYOUTS,
		PUSHCONSTANTRANGECOUNT,
		PPUSHCONSTANTRANGES;

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
		SETLAYOUTCOUNT = layout.offsetof(3);
		PSETLAYOUTS = layout.offsetof(4);
		PUSHCONSTANTRANGECOUNT = layout.offsetof(5);
		PPUSHCONSTANTRANGES = layout.offsetof(6);
	}

	VkPipelineLayoutCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineLayoutCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineLayoutCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code setLayoutCount} field. */
	public int setLayoutCount() { return nsetLayoutCount(address()); }
	/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSetLayouts} field. */
	public LongBuffer pSetLayouts() { return npSetLayouts(address()); }
	/** Returns the value of the {@code pushConstantRangeCount} field. */
	public int pushConstantRangeCount() { return npushConstantRangeCount(address()); }
	/** Returns a {@link VkPushConstantRange.Buffer} view of the struct array pointed to by the {@code pPushConstantRanges} field. */
	public VkPushConstantRange.Buffer pPushConstantRanges() { return npPushConstantRanges(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineLayoutCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineLayoutCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineLayoutCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pSetLayouts} field. */
	public VkPipelineLayoutCreateInfo pSetLayouts(LongBuffer value) { npSetLayouts(address(), value); return this; }
	/** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@code pPushConstantRanges} field. */
	public VkPipelineLayoutCreateInfo pPushConstantRanges(VkPushConstantRange.Buffer value) { npPushConstantRanges(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineLayoutCreateInfo set(
		int sType,
		long pNext,
		int flags,
		LongBuffer pSetLayouts,
		VkPushConstantRange.Buffer pPushConstantRanges
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		pSetLayouts(pSetLayouts);
		pPushConstantRanges(pPushConstantRanges);

		return this;
	}

	/** Unsafe version of {@link #set(VkPipelineLayoutCreateInfo) set}. */
	public VkPipelineLayoutCreateInfo nset(long struct) {
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
	public VkPipelineLayoutCreateInfo set(VkPipelineLayoutCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineLayoutCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineLayoutCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineLayoutCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineLayoutCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineLayoutCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkPipelineLayoutCreateInfo create() {
		return new VkPipelineLayoutCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineLayoutCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineLayoutCreateInfo create(long address) {
		return address == NULL ? null : new VkPipelineLayoutCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineLayoutCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineLayoutCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineLayoutCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineLayoutCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineLayoutCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineLayoutCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineLayoutCreateInfo.FLAGS); }
	/** Unsafe version of {@link #setLayoutCount}. */
	public static int nsetLayoutCount(long struct) { return memGetInt(struct + VkPipelineLayoutCreateInfo.SETLAYOUTCOUNT); }
	/** Unsafe version of {@link #pSetLayouts() pSetLayouts}. */
	public static LongBuffer npSetLayouts(long struct) { return memLongBuffer(memGetAddress(struct + VkPipelineLayoutCreateInfo.PSETLAYOUTS), nsetLayoutCount(struct)); }
	/** Unsafe version of {@link #pushConstantRangeCount}. */
	public static int npushConstantRangeCount(long struct) { return memGetInt(struct + VkPipelineLayoutCreateInfo.PUSHCONSTANTRANGECOUNT); }
	/** Unsafe version of {@link #pPushConstantRanges}. */
	public static VkPushConstantRange.Buffer npPushConstantRanges(long struct) { return VkPushConstantRange.create(memGetAddress(struct + VkPipelineLayoutCreateInfo.PPUSHCONSTANTRANGES), npushConstantRangeCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineLayoutCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineLayoutCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineLayoutCreateInfo.FLAGS, value); }
	/** Sets the specified value to the {@code setLayoutCount} field of the specified {@code struct}. */
	public static void nsetLayoutCount(long struct, int value) { memPutInt(struct + VkPipelineLayoutCreateInfo.SETLAYOUTCOUNT, value); }
	/** Unsafe version of {@link #pSetLayouts(LongBuffer) pSetLayouts}. */
	public static void npSetLayouts(long struct, LongBuffer value) { memPutAddress(struct + VkPipelineLayoutCreateInfo.PSETLAYOUTS, memAddressSafe(value)); nsetLayoutCount(struct, value == null ? 0 : value.remaining()); }
	/** Sets the specified value to the {@code pushConstantRangeCount} field of the specified {@code struct}. */
	public static void npushConstantRangeCount(long struct, int value) { memPutInt(struct + VkPipelineLayoutCreateInfo.PUSHCONSTANTRANGECOUNT, value); }
	/** Unsafe version of {@link #pPushConstantRanges(VkPushConstantRange.Buffer) pPushConstantRanges}. */
	public static void npPushConstantRanges(long struct, VkPushConstantRange.Buffer value) { memPutAddress(struct + VkPipelineLayoutCreateInfo.PPUSHCONSTANTRANGES, addressSafe(value)); npushConstantRangeCount(struct, value == null ? 0 : value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( nsetLayoutCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkPipelineLayoutCreateInfo.PSETLAYOUTS));
		if ( npushConstantRangeCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkPipelineLayoutCreateInfo.PPUSHCONSTANTRANGES));
	}

	// -----------------------------------

	/** An array of {@link VkPipelineLayoutCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkPipelineLayoutCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkPipelineLayoutCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineLayoutCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineLayoutCreateInfo newInstance(long address) {
			return new VkPipelineLayoutCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineLayoutCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineLayoutCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineLayoutCreateInfo.nflags(address()); }
		/** Returns the value of the {@code setLayoutCount} field. */
		public int setLayoutCount() { return VkPipelineLayoutCreateInfo.nsetLayoutCount(address()); }
		/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSetLayouts} field. */
		public LongBuffer pSetLayouts() { return VkPipelineLayoutCreateInfo.npSetLayouts(address()); }
		/** Returns the value of the {@code pushConstantRangeCount} field. */
		public int pushConstantRangeCount() { return VkPipelineLayoutCreateInfo.npushConstantRangeCount(address()); }
		/** Returns a {@link VkPushConstantRange.Buffer} view of the struct array pointed to by the {@code pPushConstantRanges} field. */
		public VkPushConstantRange.Buffer pPushConstantRanges() { return VkPipelineLayoutCreateInfo.npPushConstantRanges(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineLayoutCreateInfo.Buffer sType(int value) { VkPipelineLayoutCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineLayoutCreateInfo.Buffer pNext(long value) { VkPipelineLayoutCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineLayoutCreateInfo.Buffer flags(int value) { VkPipelineLayoutCreateInfo.nflags(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pSetLayouts} field. */
		public VkPipelineLayoutCreateInfo.Buffer pSetLayouts(LongBuffer value) { VkPipelineLayoutCreateInfo.npSetLayouts(address(), value); return this; }
		/** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@code pPushConstantRanges} field. */
		public VkPipelineLayoutCreateInfo.Buffer pPushConstantRanges(VkPushConstantRange.Buffer value) { VkPipelineLayoutCreateInfo.npPushConstantRanges(address(), value); return this; }

	}

}