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
 * struct VkRenderPassBeginInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkRenderPass renderPass;
 *     VkFramebuffer framebuffer;
 *     {@link VkRect2D VkRect2D} renderArea;
 *     uint32_t clearValueCount;
 *     const VkClearValue * pClearValues;
 * }</code></pre>
 */
public class VkRenderPassBeginInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		RENDERPASS,
		FRAMEBUFFER,
		RENDERAREA,
		CLEARVALUECOUNT,
		PCLEARVALUES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(VkRect2D.SIZEOF, VkRect2D.__ALIGNMENT),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		RENDERPASS = layout.offsetof(2);
		FRAMEBUFFER = layout.offsetof(3);
		RENDERAREA = layout.offsetof(4);
		CLEARVALUECOUNT = layout.offsetof(5);
		PCLEARVALUES = layout.offsetof(6);
	}

	VkRenderPassBeginInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkRenderPassBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkRenderPassBeginInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code renderPass} field. */
	public long renderPass() { return nrenderPass(address()); }
	/** Returns the value of the {@code framebuffer} field. */
	public long framebuffer() { return nframebuffer(address()); }
	/** Returns a {@link VkRect2D} view of the {@code renderArea} field. */
	public VkRect2D renderArea() { return nrenderArea(address()); }
	/** Returns the value of the {@code clearValueCount} field. */
	public int clearValueCount() { return nclearValueCount(address()); }
	/** Returns a {@link VkClearValue} view of the struct pointed to by the {@code pClearValues} field. */
	public VkClearValue pClearValues() { return npClearValues(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkRenderPassBeginInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkRenderPassBeginInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code renderPass} field. */
	public VkRenderPassBeginInfo renderPass(long value) { nrenderPass(address(), value); return this; }
	/** Sets the specified value to the {@code framebuffer} field. */
	public VkRenderPassBeginInfo framebuffer(long value) { nframebuffer(address(), value); return this; }
	/** Copies the specified {@link VkRect2D} to the {@code renderArea} field. */
	public VkRenderPassBeginInfo renderArea(VkRect2D value) { nrenderArea(address(), value); return this; }
	/** Sets the specified value to the {@code clearValueCount} field. */
	public VkRenderPassBeginInfo clearValueCount(int value) { nclearValueCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkClearValue} to the {@code pClearValues} field. */
	public VkRenderPassBeginInfo pClearValues(VkClearValue value) { npClearValues(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkRenderPassBeginInfo set(
		int sType,
		long pNext,
		long renderPass,
		long framebuffer,
		VkRect2D renderArea,
		int clearValueCount,
		VkClearValue pClearValues
	) {
		sType(sType);
		pNext(pNext);
		renderPass(renderPass);
		framebuffer(framebuffer);
		renderArea(renderArea);
		clearValueCount(clearValueCount);
		pClearValues(pClearValues);

		return this;
	}

	/** Unsafe version of {@link #set(VkRenderPassBeginInfo) set}. */
	public VkRenderPassBeginInfo nset(long struct) {
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
	public VkRenderPassBeginInfo set(VkRenderPassBeginInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkRenderPassBeginInfo) set}. */
	public VkRenderPassBeginInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkRenderPassBeginInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkRenderPassBeginInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkRenderPassBeginInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkRenderPassBeginInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkRenderPassBeginInfo} instance allocated with {@link BufferUtils}. */
	public static VkRenderPassBeginInfo create() {
		return new VkRenderPassBeginInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkRenderPassBeginInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkRenderPassBeginInfo create(long address) {
		return address == NULL ? null : new VkRenderPassBeginInfo(address, null);
	}

	/**
	 * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkRenderPassBeginInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkRenderPassBeginInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassBeginInfo.PNEXT); }
	/** Unsafe version of {@link #renderPass}. */
	public static long nrenderPass(long struct) { return memGetAddress(struct + VkRenderPassBeginInfo.RENDERPASS); }
	/** Unsafe version of {@link #framebuffer}. */
	public static long nframebuffer(long struct) { return memGetAddress(struct + VkRenderPassBeginInfo.FRAMEBUFFER); }
	/** Unsafe version of {@link #renderArea}. */
	public static VkRect2D nrenderArea(long struct) { return VkRect2D.create(struct + VkRenderPassBeginInfo.RENDERAREA); }
	/** Unsafe version of {@link #clearValueCount}. */
	public static int nclearValueCount(long struct) { return memGetInt(struct + VkRenderPassBeginInfo.CLEARVALUECOUNT); }
	/** Unsafe version of {@link #pClearValues}. */
	public static VkClearValue npClearValues(long struct) { return VkClearValue.create(memGetAddress(struct + VkRenderPassBeginInfo.PCLEARVALUES)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassBeginInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassBeginInfo.PNEXT, value); }
	/** Unsafe version of {@link #renderPass(long) renderPass}. */
	public static void nrenderPass(long struct, long value) { memPutAddress(struct + VkRenderPassBeginInfo.RENDERPASS, value); }
	/** Unsafe version of {@link #framebuffer(long) framebuffer}. */
	public static void nframebuffer(long struct, long value) { memPutAddress(struct + VkRenderPassBeginInfo.FRAMEBUFFER, value); }
	/** Unsafe version of {@link #renderArea(VkRect2D) renderArea}. */
	public static void nrenderArea(long struct, VkRect2D value) { memCopy(value.address(), struct + VkRenderPassBeginInfo.RENDERAREA, VkRect2D.SIZEOF); }
	/** Unsafe version of {@link #clearValueCount(int) clearValueCount}. */
	public static void nclearValueCount(long struct, int value) { memPutInt(struct + VkRenderPassBeginInfo.CLEARVALUECOUNT, value); }
	/** Unsafe version of {@link #pClearValues(VkClearValue) pClearValues}. */
	public static void npClearValues(long struct, VkClearValue value) { memPutAddress(struct + VkRenderPassBeginInfo.PCLEARVALUES, value.address()); }

	// -----------------------------------

	/** An array of {@link VkRenderPassBeginInfo} structs. */
	public static final class Buffer extends StructBuffer<VkRenderPassBeginInfo, Buffer> {

		/**
		 * Creates a new {@link VkRenderPassBeginInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkRenderPassBeginInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkRenderPassBeginInfo newInstance(long address) {
			return new VkRenderPassBeginInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkRenderPassBeginInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkRenderPassBeginInfo.npNext(address()); }
		/** Returns the value of the {@code renderPass} field. */
		public long renderPass() { return VkRenderPassBeginInfo.nrenderPass(address()); }
		/** Returns the value of the {@code framebuffer} field. */
		public long framebuffer() { return VkRenderPassBeginInfo.nframebuffer(address()); }
		/** Returns a {@link VkRect2D} view of the {@code renderArea} field. */
		public VkRect2D renderArea() { return VkRenderPassBeginInfo.nrenderArea(address()); }
		/** Returns the value of the {@code clearValueCount} field. */
		public int clearValueCount() { return VkRenderPassBeginInfo.nclearValueCount(address()); }
		/** Returns a {@link VkClearValue} view of the struct pointed to by the {@code pClearValues} field. */
		public VkClearValue pClearValues() { return VkRenderPassBeginInfo.npClearValues(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkRenderPassBeginInfo.Buffer sType(int value) { VkRenderPassBeginInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkRenderPassBeginInfo.Buffer pNext(long value) { VkRenderPassBeginInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code renderPass} field. */
		public VkRenderPassBeginInfo.Buffer renderPass(long value) { VkRenderPassBeginInfo.nrenderPass(address(), value); return this; }
		/** Sets the specified value to the {@code framebuffer} field. */
		public VkRenderPassBeginInfo.Buffer framebuffer(long value) { VkRenderPassBeginInfo.nframebuffer(address(), value); return this; }
		/** Copies the specified {@link VkRect2D} to the {@code renderArea} field. */
		public VkRenderPassBeginInfo.Buffer renderArea(VkRect2D value) { VkRenderPassBeginInfo.nrenderArea(address(), value); return this; }
		/** Sets the specified value to the {@code clearValueCount} field. */
		public VkRenderPassBeginInfo.Buffer clearValueCount(int value) { VkRenderPassBeginInfo.nclearValueCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkClearValue} to the {@code pClearValues} field. */
		public VkRenderPassBeginInfo.Buffer pClearValues(VkClearValue value) { VkRenderPassBeginInfo.npClearValues(address(), value); return this; }

	}

}