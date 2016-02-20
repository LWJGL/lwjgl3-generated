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
 * struct VkGraphicsPipelineCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkPipelineCreateFlags flags;
 *     uint32_t stageCount;
 *     const VkPipelineShaderStageCreateInfo * pStages;
 *     const VkPipelineVertexInputStateCreateInfo * pVertexInputState;
 *     const VkPipelineInputAssemblyStateCreateInfo * pInputAssemblyState;
 *     const VkPipelineTessellationStateCreateInfo * pTessellationState;
 *     const VkPipelineViewportStateCreateInfo * pViewportState;
 *     const VkPipelineRasterizationStateCreateInfo * pRasterizationState;
 *     const VkPipelineMultisampleStateCreateInfo * pMultisampleState;
 *     const VkPipelineDepthStencilStateCreateInfo * pDepthStencilState;
 *     const VkPipelineColorBlendStateCreateInfo * pColorBlendState;
 *     const VkPipelineDynamicStateCreateInfo * pDynamicState;
 *     VkPipelineLayout layout;
 *     VkRenderPass renderPass;
 *     uint32_t subpass;
 *     VkPipeline basePipelineHandle;
 *     int32_t basePipelineIndex;
 * }</code></pre>
 */
public class VkGraphicsPipelineCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		STAGECOUNT,
		PSTAGES,
		PVERTEXINPUTSTATE,
		PINPUTASSEMBLYSTATE,
		PTESSELLATIONSTATE,
		PVIEWPORTSTATE,
		PRASTERIZATIONSTATE,
		PMULTISAMPLESTATE,
		PDEPTHSTENCILSTATE,
		PCOLORBLENDSTATE,
		PDYNAMICSTATE,
		LAYOUT,
		RENDERPASS,
		SUBPASS,
		BASEPIPELINEHANDLE,
		BASEPIPELINEINDEX;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(8),
			__member(8),
			__member(4),
			__member(8),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		STAGECOUNT = layout.offsetof(3);
		PSTAGES = layout.offsetof(4);
		PVERTEXINPUTSTATE = layout.offsetof(5);
		PINPUTASSEMBLYSTATE = layout.offsetof(6);
		PTESSELLATIONSTATE = layout.offsetof(7);
		PVIEWPORTSTATE = layout.offsetof(8);
		PRASTERIZATIONSTATE = layout.offsetof(9);
		PMULTISAMPLESTATE = layout.offsetof(10);
		PDEPTHSTENCILSTATE = layout.offsetof(11);
		PCOLORBLENDSTATE = layout.offsetof(12);
		PDYNAMICSTATE = layout.offsetof(13);
		LAYOUT = layout.offsetof(14);
		RENDERPASS = layout.offsetof(15);
		SUBPASS = layout.offsetof(16);
		BASEPIPELINEHANDLE = layout.offsetof(17);
		BASEPIPELINEINDEX = layout.offsetof(18);
	}

	VkGraphicsPipelineCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkGraphicsPipelineCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkGraphicsPipelineCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code stageCount} field. */
	public int stageCount() { return nstageCount(address()); }
	/** Returns a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
	public VkPipelineShaderStageCreateInfo.Buffer pStages(int capacity) { return npStages(address(), capacity); }
	/** Returns a {@link VkPipelineVertexInputStateCreateInfo} view of the struct pointed to by the {@code pVertexInputState} field. */
	public VkPipelineVertexInputStateCreateInfo pVertexInputState() { return npVertexInputState(address()); }
	/** Returns a {@link VkPipelineInputAssemblyStateCreateInfo} view of the struct pointed to by the {@code pInputAssemblyState} field. */
	public VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() { return npInputAssemblyState(address()); }
	/** Returns a {@link VkPipelineTessellationStateCreateInfo} view of the struct pointed to by the {@code pTessellationState} field. */
	public VkPipelineTessellationStateCreateInfo pTessellationState() { return npTessellationState(address()); }
	/** Returns a {@link VkPipelineViewportStateCreateInfo} view of the struct pointed to by the {@code pViewportState} field. */
	public VkPipelineViewportStateCreateInfo pViewportState() { return npViewportState(address()); }
	/** Returns a {@link VkPipelineRasterizationStateCreateInfo} view of the struct pointed to by the {@code pRasterizationState} field. */
	public VkPipelineRasterizationStateCreateInfo pRasterizationState() { return npRasterizationState(address()); }
	/** Returns a {@link VkPipelineMultisampleStateCreateInfo} view of the struct pointed to by the {@code pMultisampleState} field. */
	public VkPipelineMultisampleStateCreateInfo pMultisampleState() { return npMultisampleState(address()); }
	/** Returns a {@link VkPipelineDepthStencilStateCreateInfo} view of the struct pointed to by the {@code pDepthStencilState} field. */
	public VkPipelineDepthStencilStateCreateInfo pDepthStencilState() { return npDepthStencilState(address()); }
	/** Returns a {@link VkPipelineColorBlendStateCreateInfo} view of the struct pointed to by the {@code pColorBlendState} field. */
	public VkPipelineColorBlendStateCreateInfo pColorBlendState() { return npColorBlendState(address()); }
	/** Returns a {@link VkPipelineDynamicStateCreateInfo} view of the struct pointed to by the {@code pDynamicState} field. */
	public VkPipelineDynamicStateCreateInfo pDynamicState() { return npDynamicState(address()); }
	/** Returns the value of the {@code layout} field. */
	public long layout() { return nlayout(address()); }
	/** Returns the value of the {@code renderPass} field. */
	public long renderPass() { return nrenderPass(address()); }
	/** Returns the value of the {@code subpass} field. */
	public int subpass() { return nsubpass(address()); }
	/** Returns the value of the {@code basePipelineHandle} field. */
	public long basePipelineHandle() { return nbasePipelineHandle(address()); }
	/** Returns the value of the {@code basePipelineIndex} field. */
	public int basePipelineIndex() { return nbasePipelineIndex(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkGraphicsPipelineCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkGraphicsPipelineCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkGraphicsPipelineCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code stageCount} field. */
	public VkGraphicsPipelineCreateInfo stageCount(int value) { nstageCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
	public VkGraphicsPipelineCreateInfo pStages(VkPipelineShaderStageCreateInfo.Buffer value) { npStages(address(), value); return this; }
	/** Sets the address of the specified {@link VkPipelineVertexInputStateCreateInfo} to the {@code pVertexInputState} field. */
	public VkGraphicsPipelineCreateInfo pVertexInputState(VkPipelineVertexInputStateCreateInfo value) { npVertexInputState(address(), value); return this; }
	/** Sets the address of the specified {@link VkPipelineInputAssemblyStateCreateInfo} to the {@code pInputAssemblyState} field. */
	public VkGraphicsPipelineCreateInfo pInputAssemblyState(VkPipelineInputAssemblyStateCreateInfo value) { npInputAssemblyState(address(), value); return this; }
	/** Sets the address of the specified {@link VkPipelineTessellationStateCreateInfo} to the {@code pTessellationState} field. */
	public VkGraphicsPipelineCreateInfo pTessellationState(VkPipelineTessellationStateCreateInfo value) { npTessellationState(address(), value); return this; }
	/** Sets the address of the specified {@link VkPipelineViewportStateCreateInfo} to the {@code pViewportState} field. */
	public VkGraphicsPipelineCreateInfo pViewportState(VkPipelineViewportStateCreateInfo value) { npViewportState(address(), value); return this; }
	/** Sets the address of the specified {@link VkPipelineRasterizationStateCreateInfo} to the {@code pRasterizationState} field. */
	public VkGraphicsPipelineCreateInfo pRasterizationState(VkPipelineRasterizationStateCreateInfo value) { npRasterizationState(address(), value); return this; }
	/** Sets the address of the specified {@link VkPipelineMultisampleStateCreateInfo} to the {@code pMultisampleState} field. */
	public VkGraphicsPipelineCreateInfo pMultisampleState(VkPipelineMultisampleStateCreateInfo value) { npMultisampleState(address(), value); return this; }
	/** Sets the address of the specified {@link VkPipelineDepthStencilStateCreateInfo} to the {@code pDepthStencilState} field. */
	public VkGraphicsPipelineCreateInfo pDepthStencilState(VkPipelineDepthStencilStateCreateInfo value) { npDepthStencilState(address(), value); return this; }
	/** Sets the address of the specified {@link VkPipelineColorBlendStateCreateInfo} to the {@code pColorBlendState} field. */
	public VkGraphicsPipelineCreateInfo pColorBlendState(VkPipelineColorBlendStateCreateInfo value) { npColorBlendState(address(), value); return this; }
	/** Sets the address of the specified {@link VkPipelineDynamicStateCreateInfo} to the {@code pDynamicState} field. */
	public VkGraphicsPipelineCreateInfo pDynamicState(VkPipelineDynamicStateCreateInfo value) { npDynamicState(address(), value); return this; }
	/** Sets the specified value to the {@code layout} field. */
	public VkGraphicsPipelineCreateInfo layout(long value) { nlayout(address(), value); return this; }
	/** Sets the specified value to the {@code renderPass} field. */
	public VkGraphicsPipelineCreateInfo renderPass(long value) { nrenderPass(address(), value); return this; }
	/** Sets the specified value to the {@code subpass} field. */
	public VkGraphicsPipelineCreateInfo subpass(int value) { nsubpass(address(), value); return this; }
	/** Sets the specified value to the {@code basePipelineHandle} field. */
	public VkGraphicsPipelineCreateInfo basePipelineHandle(long value) { nbasePipelineHandle(address(), value); return this; }
	/** Sets the specified value to the {@code basePipelineIndex} field. */
	public VkGraphicsPipelineCreateInfo basePipelineIndex(int value) { nbasePipelineIndex(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkGraphicsPipelineCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int stageCount,
		VkPipelineShaderStageCreateInfo.Buffer pStages,
		VkPipelineVertexInputStateCreateInfo pVertexInputState,
		VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState,
		VkPipelineTessellationStateCreateInfo pTessellationState,
		VkPipelineViewportStateCreateInfo pViewportState,
		VkPipelineRasterizationStateCreateInfo pRasterizationState,
		VkPipelineMultisampleStateCreateInfo pMultisampleState,
		VkPipelineDepthStencilStateCreateInfo pDepthStencilState,
		VkPipelineColorBlendStateCreateInfo pColorBlendState,
		VkPipelineDynamicStateCreateInfo pDynamicState,
		long layout,
		long renderPass,
		int subpass,
		long basePipelineHandle,
		int basePipelineIndex
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		stageCount(stageCount);
		pStages(pStages);
		pVertexInputState(pVertexInputState);
		pInputAssemblyState(pInputAssemblyState);
		pTessellationState(pTessellationState);
		pViewportState(pViewportState);
		pRasterizationState(pRasterizationState);
		pMultisampleState(pMultisampleState);
		pDepthStencilState(pDepthStencilState);
		pColorBlendState(pColorBlendState);
		pDynamicState(pDynamicState);
		layout(layout);
		renderPass(renderPass);
		subpass(subpass);
		basePipelineHandle(basePipelineHandle);
		basePipelineIndex(basePipelineIndex);

		return this;
	}

	/** Unsafe version of {@link #set(VkGraphicsPipelineCreateInfo) set}. */
	public VkGraphicsPipelineCreateInfo nset(long struct) {
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
	public VkGraphicsPipelineCreateInfo set(VkGraphicsPipelineCreateInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkGraphicsPipelineCreateInfo) set}. */
	public VkGraphicsPipelineCreateInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkGraphicsPipelineCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkGraphicsPipelineCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkGraphicsPipelineCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkGraphicsPipelineCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkGraphicsPipelineCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkGraphicsPipelineCreateInfo create() {
		return new VkGraphicsPipelineCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkGraphicsPipelineCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkGraphicsPipelineCreateInfo create(long address) {
		return address == NULL ? null : new VkGraphicsPipelineCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkGraphicsPipelineCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkGraphicsPipelineCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkGraphicsPipelineCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkGraphicsPipelineCreateInfo.FLAGS); }
	/** Unsafe version of {@link #stageCount}. */
	public static int nstageCount(long struct) { return memGetInt(struct + VkGraphicsPipelineCreateInfo.STAGECOUNT); }
	/** Unsafe version of {@link #pStages}. */
	public static VkPipelineShaderStageCreateInfo.Buffer npStages(long struct, int capacity) { return VkPipelineShaderStageCreateInfo.create(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PSTAGES), capacity); }
	/** Unsafe version of {@link #pVertexInputState}. */
	public static VkPipelineVertexInputStateCreateInfo npVertexInputState(long struct) { return VkPipelineVertexInputStateCreateInfo.create(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE)); }
	/** Unsafe version of {@link #pInputAssemblyState}. */
	public static VkPipelineInputAssemblyStateCreateInfo npInputAssemblyState(long struct) { return VkPipelineInputAssemblyStateCreateInfo.create(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PINPUTASSEMBLYSTATE)); }
	/** Unsafe version of {@link #pTessellationState}. */
	public static VkPipelineTessellationStateCreateInfo npTessellationState(long struct) { return VkPipelineTessellationStateCreateInfo.create(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PTESSELLATIONSTATE)); }
	/** Unsafe version of {@link #pViewportState}. */
	public static VkPipelineViewportStateCreateInfo npViewportState(long struct) { return VkPipelineViewportStateCreateInfo.create(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PVIEWPORTSTATE)); }
	/** Unsafe version of {@link #pRasterizationState}. */
	public static VkPipelineRasterizationStateCreateInfo npRasterizationState(long struct) { return VkPipelineRasterizationStateCreateInfo.create(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE)); }
	/** Unsafe version of {@link #pMultisampleState}. */
	public static VkPipelineMultisampleStateCreateInfo npMultisampleState(long struct) { return VkPipelineMultisampleStateCreateInfo.create(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PMULTISAMPLESTATE)); }
	/** Unsafe version of {@link #pDepthStencilState}. */
	public static VkPipelineDepthStencilStateCreateInfo npDepthStencilState(long struct) { return VkPipelineDepthStencilStateCreateInfo.create(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PDEPTHSTENCILSTATE)); }
	/** Unsafe version of {@link #pColorBlendState}. */
	public static VkPipelineColorBlendStateCreateInfo npColorBlendState(long struct) { return VkPipelineColorBlendStateCreateInfo.create(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PCOLORBLENDSTATE)); }
	/** Unsafe version of {@link #pDynamicState}. */
	public static VkPipelineDynamicStateCreateInfo npDynamicState(long struct) { return VkPipelineDynamicStateCreateInfo.create(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PDYNAMICSTATE)); }
	/** Unsafe version of {@link #layout}. */
	public static long nlayout(long struct) { return memGetLong(struct + VkGraphicsPipelineCreateInfo.LAYOUT); }
	/** Unsafe version of {@link #renderPass}. */
	public static long nrenderPass(long struct) { return memGetLong(struct + VkGraphicsPipelineCreateInfo.RENDERPASS); }
	/** Unsafe version of {@link #subpass}. */
	public static int nsubpass(long struct) { return memGetInt(struct + VkGraphicsPipelineCreateInfo.SUBPASS); }
	/** Unsafe version of {@link #basePipelineHandle}. */
	public static long nbasePipelineHandle(long struct) { return memGetLong(struct + VkGraphicsPipelineCreateInfo.BASEPIPELINEHANDLE); }
	/** Unsafe version of {@link #basePipelineIndex}. */
	public static int nbasePipelineIndex(long struct) { return memGetInt(struct + VkGraphicsPipelineCreateInfo.BASEPIPELINEINDEX); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkGraphicsPipelineCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkGraphicsPipelineCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #stageCount(int) stageCount}. */
	public static void nstageCount(long struct, int value) { memPutInt(struct + VkGraphicsPipelineCreateInfo.STAGECOUNT, value); }
	/** Unsafe version of {@link #pStages(VkPipelineShaderStageCreateInfo.Buffer) pStages}. */
	public static void npStages(long struct, VkPipelineShaderStageCreateInfo.Buffer value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PSTAGES, addressSafe(value)); }
	/** Unsafe version of {@link #pVertexInputState(VkPipelineVertexInputStateCreateInfo) pVertexInputState}. */
	public static void npVertexInputState(long struct, VkPipelineVertexInputStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE, addressSafe(value)); }
	/** Unsafe version of {@link #pInputAssemblyState(VkPipelineInputAssemblyStateCreateInfo) pInputAssemblyState}. */
	public static void npInputAssemblyState(long struct, VkPipelineInputAssemblyStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PINPUTASSEMBLYSTATE, addressSafe(value)); }
	/** Unsafe version of {@link #pTessellationState(VkPipelineTessellationStateCreateInfo) pTessellationState}. */
	public static void npTessellationState(long struct, VkPipelineTessellationStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PTESSELLATIONSTATE, addressSafe(value)); }
	/** Unsafe version of {@link #pViewportState(VkPipelineViewportStateCreateInfo) pViewportState}. */
	public static void npViewportState(long struct, VkPipelineViewportStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PVIEWPORTSTATE, addressSafe(value)); }
	/** Unsafe version of {@link #pRasterizationState(VkPipelineRasterizationStateCreateInfo) pRasterizationState}. */
	public static void npRasterizationState(long struct, VkPipelineRasterizationStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE, addressSafe(value)); }
	/** Unsafe version of {@link #pMultisampleState(VkPipelineMultisampleStateCreateInfo) pMultisampleState}. */
	public static void npMultisampleState(long struct, VkPipelineMultisampleStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PMULTISAMPLESTATE, addressSafe(value)); }
	/** Unsafe version of {@link #pDepthStencilState(VkPipelineDepthStencilStateCreateInfo) pDepthStencilState}. */
	public static void npDepthStencilState(long struct, VkPipelineDepthStencilStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PDEPTHSTENCILSTATE, addressSafe(value)); }
	/** Unsafe version of {@link #pColorBlendState(VkPipelineColorBlendStateCreateInfo) pColorBlendState}. */
	public static void npColorBlendState(long struct, VkPipelineColorBlendStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PCOLORBLENDSTATE, addressSafe(value)); }
	/** Unsafe version of {@link #pDynamicState(VkPipelineDynamicStateCreateInfo) pDynamicState}. */
	public static void npDynamicState(long struct, VkPipelineDynamicStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PDYNAMICSTATE, addressSafe(value)); }
	/** Unsafe version of {@link #layout(long) layout}. */
	public static void nlayout(long struct, long value) { memPutLong(struct + VkGraphicsPipelineCreateInfo.LAYOUT, value); }
	/** Unsafe version of {@link #renderPass(long) renderPass}. */
	public static void nrenderPass(long struct, long value) { memPutLong(struct + VkGraphicsPipelineCreateInfo.RENDERPASS, value); }
	/** Unsafe version of {@link #subpass(int) subpass}. */
	public static void nsubpass(long struct, int value) { memPutInt(struct + VkGraphicsPipelineCreateInfo.SUBPASS, value); }
	/** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
	public static void nbasePipelineHandle(long struct, long value) { memPutLong(struct + VkGraphicsPipelineCreateInfo.BASEPIPELINEHANDLE, value); }
	/** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
	public static void nbasePipelineIndex(long struct, int value) { memPutInt(struct + VkGraphicsPipelineCreateInfo.BASEPIPELINEINDEX, value); }

	// -----------------------------------

	/** An array of {@link VkGraphicsPipelineCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkGraphicsPipelineCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkGraphicsPipelineCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkGraphicsPipelineCreateInfo newInstance(long address) {
			return new VkGraphicsPipelineCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkGraphicsPipelineCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkGraphicsPipelineCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkGraphicsPipelineCreateInfo.nflags(address()); }
		/** Returns the value of the {@code stageCount} field. */
		public int stageCount() { return VkGraphicsPipelineCreateInfo.nstageCount(address()); }
		/** Returns a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
		public VkPipelineShaderStageCreateInfo.Buffer pStages(int capacity) { return VkGraphicsPipelineCreateInfo.npStages(address(), capacity); }
		/** Returns a {@link VkPipelineVertexInputStateCreateInfo} view of the struct pointed to by the {@code pVertexInputState} field. */
		public VkPipelineVertexInputStateCreateInfo pVertexInputState() { return VkGraphicsPipelineCreateInfo.npVertexInputState(address()); }
		/** Returns a {@link VkPipelineInputAssemblyStateCreateInfo} view of the struct pointed to by the {@code pInputAssemblyState} field. */
		public VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() { return VkGraphicsPipelineCreateInfo.npInputAssemblyState(address()); }
		/** Returns a {@link VkPipelineTessellationStateCreateInfo} view of the struct pointed to by the {@code pTessellationState} field. */
		public VkPipelineTessellationStateCreateInfo pTessellationState() { return VkGraphicsPipelineCreateInfo.npTessellationState(address()); }
		/** Returns a {@link VkPipelineViewportStateCreateInfo} view of the struct pointed to by the {@code pViewportState} field. */
		public VkPipelineViewportStateCreateInfo pViewportState() { return VkGraphicsPipelineCreateInfo.npViewportState(address()); }
		/** Returns a {@link VkPipelineRasterizationStateCreateInfo} view of the struct pointed to by the {@code pRasterizationState} field. */
		public VkPipelineRasterizationStateCreateInfo pRasterizationState() { return VkGraphicsPipelineCreateInfo.npRasterizationState(address()); }
		/** Returns a {@link VkPipelineMultisampleStateCreateInfo} view of the struct pointed to by the {@code pMultisampleState} field. */
		public VkPipelineMultisampleStateCreateInfo pMultisampleState() { return VkGraphicsPipelineCreateInfo.npMultisampleState(address()); }
		/** Returns a {@link VkPipelineDepthStencilStateCreateInfo} view of the struct pointed to by the {@code pDepthStencilState} field. */
		public VkPipelineDepthStencilStateCreateInfo pDepthStencilState() { return VkGraphicsPipelineCreateInfo.npDepthStencilState(address()); }
		/** Returns a {@link VkPipelineColorBlendStateCreateInfo} view of the struct pointed to by the {@code pColorBlendState} field. */
		public VkPipelineColorBlendStateCreateInfo pColorBlendState() { return VkGraphicsPipelineCreateInfo.npColorBlendState(address()); }
		/** Returns a {@link VkPipelineDynamicStateCreateInfo} view of the struct pointed to by the {@code pDynamicState} field. */
		public VkPipelineDynamicStateCreateInfo pDynamicState() { return VkGraphicsPipelineCreateInfo.npDynamicState(address()); }
		/** Returns the value of the {@code layout} field. */
		public long layout() { return VkGraphicsPipelineCreateInfo.nlayout(address()); }
		/** Returns the value of the {@code renderPass} field. */
		public long renderPass() { return VkGraphicsPipelineCreateInfo.nrenderPass(address()); }
		/** Returns the value of the {@code subpass} field. */
		public int subpass() { return VkGraphicsPipelineCreateInfo.nsubpass(address()); }
		/** Returns the value of the {@code basePipelineHandle} field. */
		public long basePipelineHandle() { return VkGraphicsPipelineCreateInfo.nbasePipelineHandle(address()); }
		/** Returns the value of the {@code basePipelineIndex} field. */
		public int basePipelineIndex() { return VkGraphicsPipelineCreateInfo.nbasePipelineIndex(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkGraphicsPipelineCreateInfo.Buffer sType(int value) { VkGraphicsPipelineCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkGraphicsPipelineCreateInfo.Buffer pNext(long value) { VkGraphicsPipelineCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkGraphicsPipelineCreateInfo.Buffer flags(int value) { VkGraphicsPipelineCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code stageCount} field. */
		public VkGraphicsPipelineCreateInfo.Buffer stageCount(int value) { VkGraphicsPipelineCreateInfo.nstageCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
		public VkGraphicsPipelineCreateInfo.Buffer pStages(VkPipelineShaderStageCreateInfo.Buffer value) { VkGraphicsPipelineCreateInfo.npStages(address(), value); return this; }
		/** Sets the address of the specified {@link VkPipelineVertexInputStateCreateInfo} to the {@code pVertexInputState} field. */
		public VkGraphicsPipelineCreateInfo.Buffer pVertexInputState(VkPipelineVertexInputStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npVertexInputState(address(), value); return this; }
		/** Sets the address of the specified {@link VkPipelineInputAssemblyStateCreateInfo} to the {@code pInputAssemblyState} field. */
		public VkGraphicsPipelineCreateInfo.Buffer pInputAssemblyState(VkPipelineInputAssemblyStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npInputAssemblyState(address(), value); return this; }
		/** Sets the address of the specified {@link VkPipelineTessellationStateCreateInfo} to the {@code pTessellationState} field. */
		public VkGraphicsPipelineCreateInfo.Buffer pTessellationState(VkPipelineTessellationStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npTessellationState(address(), value); return this; }
		/** Sets the address of the specified {@link VkPipelineViewportStateCreateInfo} to the {@code pViewportState} field. */
		public VkGraphicsPipelineCreateInfo.Buffer pViewportState(VkPipelineViewportStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npViewportState(address(), value); return this; }
		/** Sets the address of the specified {@link VkPipelineRasterizationStateCreateInfo} to the {@code pRasterizationState} field. */
		public VkGraphicsPipelineCreateInfo.Buffer pRasterizationState(VkPipelineRasterizationStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npRasterizationState(address(), value); return this; }
		/** Sets the address of the specified {@link VkPipelineMultisampleStateCreateInfo} to the {@code pMultisampleState} field. */
		public VkGraphicsPipelineCreateInfo.Buffer pMultisampleState(VkPipelineMultisampleStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npMultisampleState(address(), value); return this; }
		/** Sets the address of the specified {@link VkPipelineDepthStencilStateCreateInfo} to the {@code pDepthStencilState} field. */
		public VkGraphicsPipelineCreateInfo.Buffer pDepthStencilState(VkPipelineDepthStencilStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npDepthStencilState(address(), value); return this; }
		/** Sets the address of the specified {@link VkPipelineColorBlendStateCreateInfo} to the {@code pColorBlendState} field. */
		public VkGraphicsPipelineCreateInfo.Buffer pColorBlendState(VkPipelineColorBlendStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npColorBlendState(address(), value); return this; }
		/** Sets the address of the specified {@link VkPipelineDynamicStateCreateInfo} to the {@code pDynamicState} field. */
		public VkGraphicsPipelineCreateInfo.Buffer pDynamicState(VkPipelineDynamicStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npDynamicState(address(), value); return this; }
		/** Sets the specified value to the {@code layout} field. */
		public VkGraphicsPipelineCreateInfo.Buffer layout(long value) { VkGraphicsPipelineCreateInfo.nlayout(address(), value); return this; }
		/** Sets the specified value to the {@code renderPass} field. */
		public VkGraphicsPipelineCreateInfo.Buffer renderPass(long value) { VkGraphicsPipelineCreateInfo.nrenderPass(address(), value); return this; }
		/** Sets the specified value to the {@code subpass} field. */
		public VkGraphicsPipelineCreateInfo.Buffer subpass(int value) { VkGraphicsPipelineCreateInfo.nsubpass(address(), value); return this; }
		/** Sets the specified value to the {@code basePipelineHandle} field. */
		public VkGraphicsPipelineCreateInfo.Buffer basePipelineHandle(long value) { VkGraphicsPipelineCreateInfo.nbasePipelineHandle(address(), value); return this; }
		/** Sets the specified value to the {@code basePipelineIndex} field. */
		public VkGraphicsPipelineCreateInfo.Buffer basePipelineIndex(int value) { VkGraphicsPipelineCreateInfo.nbasePipelineIndex(address(), value); return this; }

	}

}