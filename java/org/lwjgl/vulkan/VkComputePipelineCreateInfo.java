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
 * struct VkComputePipelineCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkPipelineCreateFlags flags;
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo} stage;
 *     VkPipelineLayout layout;
 *     VkPipeline basePipelineHandle;
 *     int32_t basePipelineIndex;
 * }</code></pre>
 */
public class VkComputePipelineCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		STAGE,
		LAYOUT,
		BASEPIPELINEHANDLE,
		BASEPIPELINEINDEX;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(VkPipelineShaderStageCreateInfo.SIZEOF, VkPipelineShaderStageCreateInfo.__ALIGNMENT),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		STAGE = layout.offsetof(3);
		LAYOUT = layout.offsetof(4);
		BASEPIPELINEHANDLE = layout.offsetof(5);
		BASEPIPELINEINDEX = layout.offsetof(6);
	}

	VkComputePipelineCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkComputePipelineCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkComputePipelineCreateInfo(ByteBuffer container) {
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
	/** Returns a {@link VkPipelineShaderStageCreateInfo} view of the {@code stage} field. */
	public VkPipelineShaderStageCreateInfo stage() { return nstage(address()); }
	/** Returns the value of the {@code layout} field. */
	public long layout() { return nlayout(address()); }
	/** Returns the value of the {@code basePipelineHandle} field. */
	public long basePipelineHandle() { return nbasePipelineHandle(address()); }
	/** Returns the value of the {@code basePipelineIndex} field. */
	public int basePipelineIndex() { return nbasePipelineIndex(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkComputePipelineCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkComputePipelineCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkComputePipelineCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Copies the specified {@link VkPipelineShaderStageCreateInfo} to the {@code stage} field. */
	public VkComputePipelineCreateInfo stage(VkPipelineShaderStageCreateInfo value) { nstage(address(), value); return this; }
	/** Sets the specified value to the {@code layout} field. */
	public VkComputePipelineCreateInfo layout(long value) { nlayout(address(), value); return this; }
	/** Sets the specified value to the {@code basePipelineHandle} field. */
	public VkComputePipelineCreateInfo basePipelineHandle(long value) { nbasePipelineHandle(address(), value); return this; }
	/** Sets the specified value to the {@code basePipelineIndex} field. */
	public VkComputePipelineCreateInfo basePipelineIndex(int value) { nbasePipelineIndex(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkComputePipelineCreateInfo set(
		int sType,
		long pNext,
		int flags,
		VkPipelineShaderStageCreateInfo stage,
		long layout,
		long basePipelineHandle,
		int basePipelineIndex
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		stage(stage);
		layout(layout);
		basePipelineHandle(basePipelineHandle);
		basePipelineIndex(basePipelineIndex);

		return this;
	}

	/** Unsafe version of {@link #set(VkComputePipelineCreateInfo) set}. */
	public VkComputePipelineCreateInfo nset(long struct) {
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
	public VkComputePipelineCreateInfo set(VkComputePipelineCreateInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkComputePipelineCreateInfo) set}. */
	public VkComputePipelineCreateInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkComputePipelineCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkComputePipelineCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkComputePipelineCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkComputePipelineCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkComputePipelineCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkComputePipelineCreateInfo create() {
		return new VkComputePipelineCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkComputePipelineCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkComputePipelineCreateInfo create(long address) {
		return address == NULL ? null : new VkComputePipelineCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkComputePipelineCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkComputePipelineCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkComputePipelineCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkComputePipelineCreateInfo.FLAGS); }
	/** Unsafe version of {@link #stage}. */
	public static VkPipelineShaderStageCreateInfo nstage(long struct) { return VkPipelineShaderStageCreateInfo.create(struct + VkComputePipelineCreateInfo.STAGE); }
	/** Unsafe version of {@link #layout}. */
	public static long nlayout(long struct) { return memGetAddress(struct + VkComputePipelineCreateInfo.LAYOUT); }
	/** Unsafe version of {@link #basePipelineHandle}. */
	public static long nbasePipelineHandle(long struct) { return memGetAddress(struct + VkComputePipelineCreateInfo.BASEPIPELINEHANDLE); }
	/** Unsafe version of {@link #basePipelineIndex}. */
	public static int nbasePipelineIndex(long struct) { return memGetInt(struct + VkComputePipelineCreateInfo.BASEPIPELINEINDEX); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkComputePipelineCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkComputePipelineCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkComputePipelineCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #stage(VkPipelineShaderStageCreateInfo) stage}. */
	public static void nstage(long struct, VkPipelineShaderStageCreateInfo value) { memCopy(value.address(), struct + VkComputePipelineCreateInfo.STAGE, VkPipelineShaderStageCreateInfo.SIZEOF); }
	/** Unsafe version of {@link #layout(long) layout}. */
	public static void nlayout(long struct, long value) { memPutAddress(struct + VkComputePipelineCreateInfo.LAYOUT, value); }
	/** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
	public static void nbasePipelineHandle(long struct, long value) { memPutAddress(struct + VkComputePipelineCreateInfo.BASEPIPELINEHANDLE, value); }
	/** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
	public static void nbasePipelineIndex(long struct, int value) { memPutInt(struct + VkComputePipelineCreateInfo.BASEPIPELINEINDEX, value); }

	// -----------------------------------

	/** An array of {@link VkComputePipelineCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkComputePipelineCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkComputePipelineCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkComputePipelineCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkComputePipelineCreateInfo newInstance(long address) {
			return new VkComputePipelineCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkComputePipelineCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkComputePipelineCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkComputePipelineCreateInfo.nflags(address()); }
		/** Returns a {@link VkPipelineShaderStageCreateInfo} view of the {@code stage} field. */
		public VkPipelineShaderStageCreateInfo stage() { return VkComputePipelineCreateInfo.nstage(address()); }
		/** Returns the value of the {@code layout} field. */
		public long layout() { return VkComputePipelineCreateInfo.nlayout(address()); }
		/** Returns the value of the {@code basePipelineHandle} field. */
		public long basePipelineHandle() { return VkComputePipelineCreateInfo.nbasePipelineHandle(address()); }
		/** Returns the value of the {@code basePipelineIndex} field. */
		public int basePipelineIndex() { return VkComputePipelineCreateInfo.nbasePipelineIndex(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkComputePipelineCreateInfo.Buffer sType(int value) { VkComputePipelineCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkComputePipelineCreateInfo.Buffer pNext(long value) { VkComputePipelineCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkComputePipelineCreateInfo.Buffer flags(int value) { VkComputePipelineCreateInfo.nflags(address(), value); return this; }
		/** Copies the specified {@link VkPipelineShaderStageCreateInfo} to the {@code stage} field. */
		public VkComputePipelineCreateInfo.Buffer stage(VkPipelineShaderStageCreateInfo value) { VkComputePipelineCreateInfo.nstage(address(), value); return this; }
		/** Sets the specified value to the {@code layout} field. */
		public VkComputePipelineCreateInfo.Buffer layout(long value) { VkComputePipelineCreateInfo.nlayout(address(), value); return this; }
		/** Sets the specified value to the {@code basePipelineHandle} field. */
		public VkComputePipelineCreateInfo.Buffer basePipelineHandle(long value) { VkComputePipelineCreateInfo.nbasePipelineHandle(address(), value); return this; }
		/** Sets the specified value to the {@code basePipelineIndex} field. */
		public VkComputePipelineCreateInfo.Buffer basePipelineIndex(int value) { VkComputePipelineCreateInfo.nbasePipelineIndex(address(), value); return this; }

	}

}