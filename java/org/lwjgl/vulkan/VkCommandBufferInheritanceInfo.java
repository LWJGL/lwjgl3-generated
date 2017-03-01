/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying command buffer inheritance info.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-inheritedQueries">inherited queries</a> feature is not enabled, {@code occlusionQueryEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-inheritedQueries">inherited queries</a> feature is enabled, {@code queryFlags} <b>must</b> be a valid combination of {@code VkQueryControlFlagBits} values</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-pipelineStatisticsQuery">pipeline statistics queries</a> feature is not enabled, {@code pipelineStatistics} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>Both of {@code framebuffer}, and {@code renderPass} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCommandBufferBeginInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code renderPass} &ndash; a {@code VkRenderPass} object defining which render passes the {@code VkCommandBuffer} will be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#renderpass-compatibility">compatible</a> with and <b>can</b> be executed within. If the {@code VkCommandBuffer} will not be executed within a render pass instance, {@code renderPass} is ignored.</li>
 * <li>{@code subpass} &ndash; the index of the subpass within the render pass instance that the {@code VkCommandBuffer} will be executed within. If the {@code VkCommandBuffer} will not be executed within a render pass instance, {@code subpass} is ignored.</li>
 * <li>{@code framebuffer} &ndash; optionally refers to the {@code VkFramebuffer} object that the {@code VkCommandBuffer} will be rendering to if it is executed within a render pass instance. It <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} if the framebuffer is not known, or if the {@code VkCommandBuffer} will not be executed within a render pass instance.
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Specifying the exact framebuffer that the secondary command buffer will be executed with <b>may</b> result in better performance at command buffer execution time.</p>
 * </div></li>
 * <li>{@code occlusionQueryEnable} &ndash; indicates whether the command buffer <b>can</b> be executed while an occlusion query is active in the primary command buffer. If this is {@link VK10#VK_TRUE TRUE}, then this command buffer <b>can</b> be executed whether the primary command buffer has an occlusion query active or not. If this is {@link VK10#VK_FALSE FALSE}, then the primary command buffer <b>must</b> not have an occlusion query active.</li>
 * <li>{@code queryFlags} &ndash; indicates the query flags that <b>can</b> be used by an active occlusion query in the primary command buffer when this secondary command buffer is executed. If this value includes the {@link VK10#VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT} bit, then the active query <b>can</b> return boolean results or actual sample counts. If this bit is not set, then the active query <b>must</b> not use the {@link VK10#VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT} bit.</li>
 * <li>{@code pipelineStatistics} &ndash; indicates the set of pipeline statistics that <b>can</b> be counted by an active query in the primary command buffer when this secondary command buffer is executed. If this value includes a given bit, then this command buffer <b>can</b> be executed whether the primary command buffer has a pipeline statistics query active that includes this bit or not. If this value excludes a given bit, then the active pipeline statistics query <b>must</b> not be from a query pool that counts that statistic.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkCommandBufferInheritanceInfo {
    VkStructureType sType;
    const void * pNext;
    VkRenderPass renderPass;
    uint32_t subpass;
    VkFramebuffer framebuffer;
    VkBool32 occlusionQueryEnable;
    VkQueryControlFlags queryFlags;
    VkQueryPipelineStatisticFlags pipelineStatistics;
}</code></pre>
 */
public class VkCommandBufferInheritanceInfo extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
			__member(8),
			__member(4),
			__member(8),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

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
	public boolean occlusionQueryEnable() { return nocclusionQueryEnable(address()) != 0; }
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
	public VkCommandBufferInheritanceInfo occlusionQueryEnable(boolean value) { nocclusionQueryEnable(address(), value ? 1 : 0); return this; }
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
		boolean occlusionQueryEnable,
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

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkCommandBufferInheritanceInfo set(VkCommandBufferInheritanceInfo src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkCommandBufferInheritanceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkCommandBufferInheritanceInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkCommandBufferInheritanceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
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
	 * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
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

	// -----------------------------------

	/** Returns a new {@link VkCommandBufferInheritanceInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkCommandBufferInheritanceInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkCommandBufferInheritanceInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkCommandBufferInheritanceInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkCommandBufferInheritanceInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkCommandBufferInheritanceInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkCommandBufferInheritanceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkCommandBufferInheritanceInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkCommandBufferInheritanceInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceInfo.PNEXT); }
	/** Unsafe version of {@link #renderPass}. */
	public static long nrenderPass(long struct) { return memGetLong(struct + VkCommandBufferInheritanceInfo.RENDERPASS); }
	/** Unsafe version of {@link #subpass}. */
	public static int nsubpass(long struct) { return memGetInt(struct + VkCommandBufferInheritanceInfo.SUBPASS); }
	/** Unsafe version of {@link #framebuffer}. */
	public static long nframebuffer(long struct) { return memGetLong(struct + VkCommandBufferInheritanceInfo.FRAMEBUFFER); }
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
	public static void nrenderPass(long struct, long value) { memPutLong(struct + VkCommandBufferInheritanceInfo.RENDERPASS, value); }
	/** Unsafe version of {@link #subpass(int) subpass}. */
	public static void nsubpass(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.SUBPASS, value); }
	/** Unsafe version of {@link #framebuffer(long) framebuffer}. */
	public static void nframebuffer(long struct, long value) { memPutLong(struct + VkCommandBufferInheritanceInfo.FRAMEBUFFER, value); }
	/** Unsafe version of {@link #occlusionQueryEnable(boolean) occlusionQueryEnable}. */
	public static void nocclusionQueryEnable(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.OCCLUSIONQUERYENABLE, value); }
	/** Unsafe version of {@link #queryFlags(int) queryFlags}. */
	public static void nqueryFlags(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.QUERYFLAGS, value); }
	/** Unsafe version of {@link #pipelineStatistics(int) pipelineStatistics}. */
	public static void npipelineStatistics(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.PIPELINESTATISTICS, value); }

	// -----------------------------------

	/** An array of {@link VkCommandBufferInheritanceInfo} structs. */
	public static class Buffer extends StructBuffer<VkCommandBufferInheritanceInfo, Buffer> implements NativeResource {

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
		public boolean occlusionQueryEnable() { return VkCommandBufferInheritanceInfo.nocclusionQueryEnable(address()) != 0; }
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
		public VkCommandBufferInheritanceInfo.Buffer occlusionQueryEnable(boolean value) { VkCommandBufferInheritanceInfo.nocclusionQueryEnable(address(), value ? 1 : 0); return this; }
		/** Sets the specified value to the {@code queryFlags} field. */
		public VkCommandBufferInheritanceInfo.Buffer queryFlags(int value) { VkCommandBufferInheritanceInfo.nqueryFlags(address(), value); return this; }
		/** Sets the specified value to the {@code pipelineStatistics} field. */
		public VkCommandBufferInheritanceInfo.Buffer pipelineStatistics(int value) { VkCommandBufferInheritanceInfo.npipelineStatistics(address(), value); return this; }

	}

}