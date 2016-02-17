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
 * struct VkCommandBufferInheritanceInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkRenderPass renderPass;
 *     uint32_t subpass;
 *     VkFramebuffer framebuffer;
 *     VkBool32 occlusionQueryEnable;
 *     VkQueryControlFlags queryFlags;
 *     VkQueryPipelineStatisticFlags pipelineStatistics;
 * }</code></pre>
 */
public class VkCommandBufferInheritanceInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		RENDERPASS,
		SUBPASS,
		FRAMEBUFFER,
		OCCLUSIONQUERYENABLE,
		QUERYFLAGS,
		PIPELINESTATISTICS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
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
		RENDERPASS = layout.offsetof(2);
		SUBPASS = layout.offsetof(3);
		FRAMEBUFFER = layout.offsetof(4);
		OCCLUSIONQUERYENABLE = layout.offsetof(5);
		QUERYFLAGS = layout.offsetof(6);
		PIPELINESTATISTICS = layout.offsetof(7);
	}

	VkCommandBufferInheritanceInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkCommandBufferInheritanceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkCommandBufferInheritanceInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code subpass} field. */
	public int subpass() { return nsubpass(address()); }
	/** Returns the value of the {@code framebuffer} field. */
	public long framebuffer() { return nframebuffer(address()); }
	/** Returns the value of the {@code occlusionQueryEnable} field. */
	public int occlusionQueryEnable() { return nocclusionQueryEnable(address()); }
	/** Returns the value of the {@code queryFlags} field. */
	public int queryFlags() { return nqueryFlags(address()); }
	/** Returns the value of the {@code pipelineStatistics} field. */
	public int pipelineStatistics() { return npipelineStatistics(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkCommandBufferInheritanceInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkCommandBufferInheritanceInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code renderPass} field. */
	public VkCommandBufferInheritanceInfo renderPass(long value) { nrenderPass(address(), value); return this; }
	/** Sets the specified value to the {@code subpass} field. */
	public VkCommandBufferInheritanceInfo subpass(int value) { nsubpass(address(), value); return this; }
	/** Sets the specified value to the {@code framebuffer} field. */
	public VkCommandBufferInheritanceInfo framebuffer(long value) { nframebuffer(address(), value); return this; }
	/** Sets the specified value to the {@code occlusionQueryEnable} field. */
	public VkCommandBufferInheritanceInfo occlusionQueryEnable(int value) { nocclusionQueryEnable(address(), value); return this; }
	/** Sets the specified value to the {@code queryFlags} field. */
	public VkCommandBufferInheritanceInfo queryFlags(int value) { nqueryFlags(address(), value); return this; }
	/** Sets the specified value to the {@code pipelineStatistics} field. */
	public VkCommandBufferInheritanceInfo pipelineStatistics(int value) { npipelineStatistics(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkCommandBufferInheritanceInfo set(
		int sType,
		long pNext,
		long renderPass,
		int subpass,
		long framebuffer,
		int occlusionQueryEnable,
		int queryFlags,
		int pipelineStatistics
	) {
		sType(sType);
		pNext(pNext);
		renderPass(renderPass);
		subpass(subpass);
		framebuffer(framebuffer);
		occlusionQueryEnable(occlusionQueryEnable);
		queryFlags(queryFlags);
		pipelineStatistics(pipelineStatistics);

		return this;
	}

	/** Unsafe version of {@link #set(VkCommandBufferInheritanceInfo) set}. */
	public VkCommandBufferInheritanceInfo nset(long struct) {
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
	public VkCommandBufferInheritanceInfo set(VkCommandBufferInheritanceInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkCommandBufferInheritanceInfo) set}. */
	public VkCommandBufferInheritanceInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkCommandBufferInheritanceInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkCommandBufferInheritanceInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkCommandBufferInheritanceInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkCommandBufferInheritanceInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkCommandBufferInheritanceInfo} instance allocated with {@link BufferUtils}. */
	public static VkCommandBufferInheritanceInfo create() {
		return new VkCommandBufferInheritanceInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkCommandBufferInheritanceInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkCommandBufferInheritanceInfo create(long address) {
		return address == NULL ? null : new VkCommandBufferInheritanceInfo(address, null);
	}

	/**
	 * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkCommandBufferInheritanceInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkCommandBufferInheritanceInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceInfo.PNEXT); }
	/** Unsafe version of {@link #renderPass}. */
	public static long nrenderPass(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceInfo.RENDERPASS); }
	/** Unsafe version of {@link #subpass}. */
	public static int nsubpass(long struct) { return memGetInt(struct + VkCommandBufferInheritanceInfo.SUBPASS); }
	/** Unsafe version of {@link #framebuffer}. */
	public static long nframebuffer(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceInfo.FRAMEBUFFER); }
	/** Unsafe version of {@link #occlusionQueryEnable}. */
	public static int nocclusionQueryEnable(long struct) { return memGetInt(struct + VkCommandBufferInheritanceInfo.OCCLUSIONQUERYENABLE); }
	/** Unsafe version of {@link #queryFlags}. */
	public static int nqueryFlags(long struct) { return memGetInt(struct + VkCommandBufferInheritanceInfo.QUERYFLAGS); }
	/** Unsafe version of {@link #pipelineStatistics}. */
	public static int npipelineStatistics(long struct) { return memGetInt(struct + VkCommandBufferInheritanceInfo.PIPELINESTATISTICS); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferInheritanceInfo.PNEXT, value); }
	/** Unsafe version of {@link #renderPass(long) renderPass}. */
	public static void nrenderPass(long struct, long value) { memPutAddress(struct + VkCommandBufferInheritanceInfo.RENDERPASS, value); }
	/** Unsafe version of {@link #subpass(int) subpass}. */
	public static void nsubpass(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.SUBPASS, value); }
	/** Unsafe version of {@link #framebuffer(long) framebuffer}. */
	public static void nframebuffer(long struct, long value) { memPutAddress(struct + VkCommandBufferInheritanceInfo.FRAMEBUFFER, value); }
	/** Unsafe version of {@link #occlusionQueryEnable(int) occlusionQueryEnable}. */
	public static void nocclusionQueryEnable(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.OCCLUSIONQUERYENABLE, value); }
	/** Unsafe version of {@link #queryFlags(int) queryFlags}. */
	public static void nqueryFlags(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.QUERYFLAGS, value); }
	/** Unsafe version of {@link #pipelineStatistics(int) pipelineStatistics}. */
	public static void npipelineStatistics(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.PIPELINESTATISTICS, value); }

	// -----------------------------------

	/** An array of {@link VkCommandBufferInheritanceInfo} structs. */
	public static final class Buffer extends StructBuffer<VkCommandBufferInheritanceInfo, Buffer> {

		/**
		 * Creates a new {@link VkCommandBufferInheritanceInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkCommandBufferInheritanceInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkCommandBufferInheritanceInfo newInstance(long address) {
			return new VkCommandBufferInheritanceInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkCommandBufferInheritanceInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkCommandBufferInheritanceInfo.npNext(address()); }
		/** Returns the value of the {@code renderPass} field. */
		public long renderPass() { return VkCommandBufferInheritanceInfo.nrenderPass(address()); }
		/** Returns the value of the {@code subpass} field. */
		public int subpass() { return VkCommandBufferInheritanceInfo.nsubpass(address()); }
		/** Returns the value of the {@code framebuffer} field. */
		public long framebuffer() { return VkCommandBufferInheritanceInfo.nframebuffer(address()); }
		/** Returns the value of the {@code occlusionQueryEnable} field. */
		public int occlusionQueryEnable() { return VkCommandBufferInheritanceInfo.nocclusionQueryEnable(address()); }
		/** Returns the value of the {@code queryFlags} field. */
		public int queryFlags() { return VkCommandBufferInheritanceInfo.nqueryFlags(address()); }
		/** Returns the value of the {@code pipelineStatistics} field. */
		public int pipelineStatistics() { return VkCommandBufferInheritanceInfo.npipelineStatistics(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkCommandBufferInheritanceInfo.Buffer sType(int value) { VkCommandBufferInheritanceInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkCommandBufferInheritanceInfo.Buffer pNext(long value) { VkCommandBufferInheritanceInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code renderPass} field. */
		public VkCommandBufferInheritanceInfo.Buffer renderPass(long value) { VkCommandBufferInheritanceInfo.nrenderPass(address(), value); return this; }
		/** Sets the specified value to the {@code subpass} field. */
		public VkCommandBufferInheritanceInfo.Buffer subpass(int value) { VkCommandBufferInheritanceInfo.nsubpass(address(), value); return this; }
		/** Sets the specified value to the {@code framebuffer} field. */
		public VkCommandBufferInheritanceInfo.Buffer framebuffer(long value) { VkCommandBufferInheritanceInfo.nframebuffer(address(), value); return this; }
		/** Sets the specified value to the {@code occlusionQueryEnable} field. */
		public VkCommandBufferInheritanceInfo.Buffer occlusionQueryEnable(int value) { VkCommandBufferInheritanceInfo.nocclusionQueryEnable(address(), value); return this; }
		/** Sets the specified value to the {@code queryFlags} field. */
		public VkCommandBufferInheritanceInfo.Buffer queryFlags(int value) { VkCommandBufferInheritanceInfo.nqueryFlags(address(), value); return this; }
		/** Sets the specified value to the {@code pipelineStatistics} field. */
		public VkCommandBufferInheritanceInfo.Buffer pipelineStatistics(int value) { VkCommandBufferInheritanceInfo.npipelineStatistics(address(), value); return this; }

	}

}