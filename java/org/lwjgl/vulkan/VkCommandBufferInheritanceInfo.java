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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkCommandBufferInheritanceInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkCommandBufferInheritanceInfo">Vulkan Specification</a>
 * 
 * <p>Defines any state that will be inherited from a primary command buffer to a secondary command buffer.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>Each of {@code renderPass} and {@code framebuffer} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
 * {@code VkDevice}</li>
 * <li>If the inherited queries feature is not enabled, {@code occlusionQueryEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If the inherited queries feature is enabled, {@code queryFlags} <b>must</b> be a valid combination of {@code VkQueryControlFlagBits} values</li>
 * <li>If the pipeline statistics queries feature is not enabled, {@code pipelineStatistics} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code renderPass} &ndash; 
 * a {@code VkRenderPass} object that must be compatible with the one that is bound when the {@code VkCommandBuffer} is executed if the command buffer was
 * allocated with the {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT} set</li>
 * <li>{@code subpass} &ndash; 
 * the index of the subpass within {@code renderPass} that the {@code VkCommandBuffer} will be rendering against if it was allocated with the
 * {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT} set</li>
 * <li>{@code framebuffer} &ndash; 
 * refers to the {@code VkFramebuffer} object that the {@code VkCommandBuffer} will be rendering to if it was allocated with the
 * {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT} set. It can be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} if the framebuffer is not known.</li>
 * <li>{@code occlusionQueryEnable} &ndash; indicates whether the command buffer can be executed while an occlusion query is active in the primary command buffer</li>
 * <li>{@code queryFlags} &ndash; indicates the query flags that can be used by an active occlusion query in the primary command buffer when this secondary command buffer is executed. One or more of:<br><table><tr><td>{@link VK10#VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT}</td></tr></table></li>
 * <li>{@code pipelineStatistics} &ndash; indicates the set of pipeline statistics that can be counted by an active query in the primary command buffer when this secondary command buffer is
 * executed. One or more of:<br><table><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT}</td></tr></table></li>
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
public class VkCommandBufferInheritanceInfo extends Struct {

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
			return new VkCommandBufferInheritanceInfo(address, getContainer());
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