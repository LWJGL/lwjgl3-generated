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
import static org.lwjgl.system.MemoryStack.*;

/**
 * When the {@code VK_AMD_rasterization_order} device extension is enabled the application <b>can</b> also chain a
 * {@code VkPipelineRasterizationStateRasterizationOrderAMD} structure to the {@link VkPipelineRasterizationStateCreateInfo} structure through its {@code pNext}
 * member. This structure enables selecting the rasterization order to use when rendering with the corresponding graphics pipeline.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link AMDRasterizationOrder#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code rasterizationOrder} &ndash; the primitive rasterization order to use. One of:<br><table><tr><td>{@link AMDRasterizationOrder#VK_RASTERIZATION_ORDER_RELAXED_AMD RASTERIZATION_ORDER_RELAXED_AMD}</td><td>{@link AMDRasterizationOrder#VK_RASTERIZATION_ORDER_STRICT_AMD RASTERIZATION_ORDER_STRICT_AMD}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPipelineRasterizationStateRasterizationOrderAMD {
    VkStructureType sType;
    const void * pNext;
    VkRasterizationOrderAMD rasterizationOrder;
}</code></pre>
 */
public class VkPipelineRasterizationStateRasterizationOrderAMD extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		RASTERIZATIONORDER;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		RASTERIZATIONORDER = layout.offsetof(2);
	}

	VkPipelineRasterizationStateRasterizationOrderAMD(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineRasterizationStateRasterizationOrderAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineRasterizationStateRasterizationOrderAMD(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code rasterizationOrder} field. */
	public int rasterizationOrder() { return nrasterizationOrder(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineRasterizationStateRasterizationOrderAMD sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineRasterizationStateRasterizationOrderAMD pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code rasterizationOrder} field. */
	public VkPipelineRasterizationStateRasterizationOrderAMD rasterizationOrder(int value) { nrasterizationOrder(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineRasterizationStateRasterizationOrderAMD set(
		int sType,
		long pNext,
		int rasterizationOrder
	) {
		sType(sType);
		pNext(pNext);
		rasterizationOrder(rasterizationOrder);

		return this;
	}

	/** Unsafe version of {@link #set(VkPipelineRasterizationStateRasterizationOrderAMD) set}. */
	public VkPipelineRasterizationStateRasterizationOrderAMD nset(long struct) {
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
	public VkPipelineRasterizationStateRasterizationOrderAMD set(VkPipelineRasterizationStateRasterizationOrderAMD src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineRasterizationStateRasterizationOrderAMD malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineRasterizationStateRasterizationOrderAMD calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD} instance allocated with {@link BufferUtils}. */
	public static VkPipelineRasterizationStateRasterizationOrderAMD create() {
		return new VkPipelineRasterizationStateRasterizationOrderAMD(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineRasterizationStateRasterizationOrderAMD create(long address) {
		return address == NULL ? null : new VkPipelineRasterizationStateRasterizationOrderAMD(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPipelineRasterizationStateRasterizationOrderAMD mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPipelineRasterizationStateRasterizationOrderAMD callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineRasterizationStateRasterizationOrderAMD mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineRasterizationStateRasterizationOrderAMD callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineRasterizationStateRasterizationOrderAMD.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRasterizationStateRasterizationOrderAMD.PNEXT); }
	/** Unsafe version of {@link #rasterizationOrder}. */
	public static int nrasterizationOrder(long struct) { return memGetInt(struct + VkPipelineRasterizationStateRasterizationOrderAMD.RASTERIZATIONORDER); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineRasterizationStateRasterizationOrderAMD.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRasterizationStateRasterizationOrderAMD.PNEXT, value); }
	/** Unsafe version of {@link #rasterizationOrder(int) rasterizationOrder}. */
	public static void nrasterizationOrder(long struct, int value) { memPutInt(struct + VkPipelineRasterizationStateRasterizationOrderAMD.RASTERIZATIONORDER, value); }

	// -----------------------------------

	/** An array of {@link VkPipelineRasterizationStateRasterizationOrderAMD} structs. */
	public static final class Buffer extends StructBuffer<VkPipelineRasterizationStateRasterizationOrderAMD, Buffer> {

		/**
		 * Creates a new {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineRasterizationStateRasterizationOrderAMD#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineRasterizationStateRasterizationOrderAMD newInstance(long address) {
			return new VkPipelineRasterizationStateRasterizationOrderAMD(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineRasterizationStateRasterizationOrderAMD.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineRasterizationStateRasterizationOrderAMD.npNext(address()); }
		/** Returns the value of the {@code rasterizationOrder} field. */
		public int rasterizationOrder() { return VkPipelineRasterizationStateRasterizationOrderAMD.nrasterizationOrder(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineRasterizationStateRasterizationOrderAMD.Buffer sType(int value) { VkPipelineRasterizationStateRasterizationOrderAMD.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineRasterizationStateRasterizationOrderAMD.Buffer pNext(long value) { VkPipelineRasterizationStateRasterizationOrderAMD.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code rasterizationOrder} field. */
		public VkPipelineRasterizationStateRasterizationOrderAMD.Buffer rasterizationOrder(int value) { VkPipelineRasterizationStateRasterizationOrderAMD.nrasterizationOrder(address(), value); return this; }

	}

}