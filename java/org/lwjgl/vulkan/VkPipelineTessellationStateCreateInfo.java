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
 * struct VkPipelineTessellationStateCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkPipelineTessellationStateCreateFlags flags;
 *     uint32_t patchControlPoints;
 * }</code></pre>
 */
public class VkPipelineTessellationStateCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		PATCHCONTROLPOINTS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		PATCHCONTROLPOINTS = layout.offsetof(3);
	}

	VkPipelineTessellationStateCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineTessellationStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineTessellationStateCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code patchControlPoints} field. */
	public int patchControlPoints() { return npatchControlPoints(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineTessellationStateCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineTessellationStateCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineTessellationStateCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code patchControlPoints} field. */
	public VkPipelineTessellationStateCreateInfo patchControlPoints(int value) { npatchControlPoints(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineTessellationStateCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int patchControlPoints
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		patchControlPoints(patchControlPoints);

		return this;
	}

	/** Unsafe version of {@link #set(VkPipelineTessellationStateCreateInfo) set}. */
	public VkPipelineTessellationStateCreateInfo nset(long struct) {
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
	public VkPipelineTessellationStateCreateInfo set(VkPipelineTessellationStateCreateInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkPipelineTessellationStateCreateInfo) set}. */
	public VkPipelineTessellationStateCreateInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineTessellationStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineTessellationStateCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineTessellationStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineTessellationStateCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineTessellationStateCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkPipelineTessellationStateCreateInfo create() {
		return new VkPipelineTessellationStateCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineTessellationStateCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineTessellationStateCreateInfo create(long address) {
		return address == NULL ? null : new VkPipelineTessellationStateCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineTessellationStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineTessellationStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineTessellationStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineTessellationStateCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineTessellationStateCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineTessellationStateCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineTessellationStateCreateInfo.FLAGS); }
	/** Unsafe version of {@link #patchControlPoints}. */
	public static int npatchControlPoints(long struct) { return memGetInt(struct + VkPipelineTessellationStateCreateInfo.PATCHCONTROLPOINTS); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineTessellationStateCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineTessellationStateCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineTessellationStateCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #patchControlPoints(int) patchControlPoints}. */
	public static void npatchControlPoints(long struct, int value) { memPutInt(struct + VkPipelineTessellationStateCreateInfo.PATCHCONTROLPOINTS, value); }

	// -----------------------------------

	/** An array of {@link VkPipelineTessellationStateCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkPipelineTessellationStateCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkPipelineTessellationStateCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineTessellationStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineTessellationStateCreateInfo newInstance(long address) {
			return new VkPipelineTessellationStateCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineTessellationStateCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineTessellationStateCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineTessellationStateCreateInfo.nflags(address()); }
		/** Returns the value of the {@code patchControlPoints} field. */
		public int patchControlPoints() { return VkPipelineTessellationStateCreateInfo.npatchControlPoints(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineTessellationStateCreateInfo.Buffer sType(int value) { VkPipelineTessellationStateCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineTessellationStateCreateInfo.Buffer pNext(long value) { VkPipelineTessellationStateCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineTessellationStateCreateInfo.Buffer flags(int value) { VkPipelineTessellationStateCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code patchControlPoints} field. */
		public VkPipelineTessellationStateCreateInfo.Buffer patchControlPoints(int value) { VkPipelineTessellationStateCreateInfo.npatchControlPoints(address(), value); return this; }

	}

}