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
 * struct VkPipelineInputAssemblyStateCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkPipelineInputAssemblyStateCreateFlags flags;
 *     VkPrimitiveTopology topology;
 *     VkBool32 primitiveRestartEnable;
 * }</code></pre>
 */
public class VkPipelineInputAssemblyStateCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		TOPOLOGY,
		PRIMITIVERESTARTENABLE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		TOPOLOGY = layout.offsetof(3);
		PRIMITIVERESTARTENABLE = layout.offsetof(4);
	}

	VkPipelineInputAssemblyStateCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineInputAssemblyStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineInputAssemblyStateCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code topology} field. */
	public int topology() { return ntopology(address()); }
	/** Returns the value of the {@code primitiveRestartEnable} field. */
	public int primitiveRestartEnable() { return nprimitiveRestartEnable(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineInputAssemblyStateCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineInputAssemblyStateCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineInputAssemblyStateCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code topology} field. */
	public VkPipelineInputAssemblyStateCreateInfo topology(int value) { ntopology(address(), value); return this; }
	/** Sets the specified value to the {@code primitiveRestartEnable} field. */
	public VkPipelineInputAssemblyStateCreateInfo primitiveRestartEnable(int value) { nprimitiveRestartEnable(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineInputAssemblyStateCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int topology,
		int primitiveRestartEnable
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		topology(topology);
		primitiveRestartEnable(primitiveRestartEnable);

		return this;
	}

	/** Unsafe version of {@link #set(VkPipelineInputAssemblyStateCreateInfo) set}. */
	public VkPipelineInputAssemblyStateCreateInfo nset(long struct) {
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
	public VkPipelineInputAssemblyStateCreateInfo set(VkPipelineInputAssemblyStateCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineInputAssemblyStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineInputAssemblyStateCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineInputAssemblyStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineInputAssemblyStateCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineInputAssemblyStateCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkPipelineInputAssemblyStateCreateInfo create() {
		return new VkPipelineInputAssemblyStateCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineInputAssemblyStateCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineInputAssemblyStateCreateInfo create(long address) {
		return address == NULL ? null : new VkPipelineInputAssemblyStateCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineInputAssemblyStateCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineInputAssemblyStateCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineInputAssemblyStateCreateInfo.FLAGS); }
	/** Unsafe version of {@link #topology}. */
	public static int ntopology(long struct) { return memGetInt(struct + VkPipelineInputAssemblyStateCreateInfo.TOPOLOGY); }
	/** Unsafe version of {@link #primitiveRestartEnable}. */
	public static int nprimitiveRestartEnable(long struct) { return memGetInt(struct + VkPipelineInputAssemblyStateCreateInfo.PRIMITIVERESTARTENABLE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineInputAssemblyStateCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineInputAssemblyStateCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineInputAssemblyStateCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #topology(int) topology}. */
	public static void ntopology(long struct, int value) { memPutInt(struct + VkPipelineInputAssemblyStateCreateInfo.TOPOLOGY, value); }
	/** Unsafe version of {@link #primitiveRestartEnable(int) primitiveRestartEnable}. */
	public static void nprimitiveRestartEnable(long struct, int value) { memPutInt(struct + VkPipelineInputAssemblyStateCreateInfo.PRIMITIVERESTARTENABLE, value); }

	// -----------------------------------

	/** An array of {@link VkPipelineInputAssemblyStateCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkPipelineInputAssemblyStateCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineInputAssemblyStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineInputAssemblyStateCreateInfo newInstance(long address) {
			return new VkPipelineInputAssemblyStateCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineInputAssemblyStateCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineInputAssemblyStateCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineInputAssemblyStateCreateInfo.nflags(address()); }
		/** Returns the value of the {@code topology} field. */
		public int topology() { return VkPipelineInputAssemblyStateCreateInfo.ntopology(address()); }
		/** Returns the value of the {@code primitiveRestartEnable} field. */
		public int primitiveRestartEnable() { return VkPipelineInputAssemblyStateCreateInfo.nprimitiveRestartEnable(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineInputAssemblyStateCreateInfo.Buffer sType(int value) { VkPipelineInputAssemblyStateCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineInputAssemblyStateCreateInfo.Buffer pNext(long value) { VkPipelineInputAssemblyStateCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineInputAssemblyStateCreateInfo.Buffer flags(int value) { VkPipelineInputAssemblyStateCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code topology} field. */
		public VkPipelineInputAssemblyStateCreateInfo.Buffer topology(int value) { VkPipelineInputAssemblyStateCreateInfo.ntopology(address(), value); return this; }
		/** Sets the specified value to the {@code primitiveRestartEnable} field. */
		public VkPipelineInputAssemblyStateCreateInfo.Buffer primitiveRestartEnable(int value) { VkPipelineInputAssemblyStateCreateInfo.nprimitiveRestartEnable(address(), value); return this; }

	}

}