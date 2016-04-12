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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkGraphicsPipelineCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkGraphicsPipelineCreateInfo">Vulkan Specification</a>
 * 
 * <p>Includes an array of shader create info structures containing all the desired active shader stages, as well as creation info to define all relevant
 * fixed-function stages, and a pipeline layout.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
 * <li>{@code pStages} <b>must</b> be a pointer to an array of {@code stageCount} valid {@link VkPipelineShaderStageCreateInfo} structures</li>
 * <li>{@code pVertexInputState} <b>must</b> be a pointer to a valid {@link VkPipelineVertexInputStateCreateInfo} structure</li>
 * <li>{@code pInputAssemblyState} <b>must</b> be a pointer to a valid {@link VkPipelineInputAssemblyStateCreateInfo} structure</li>
 * <li>{@code pRasterizationState} <b>must</b> be a pointer to a valid {@link VkPipelineRasterizationStateCreateInfo} structure</li>
 * <li>If {@code pDynamicState} is not {@code NULL}, {@code pDynamicState} <b>must</b> be a pointer to a valid {@link VkPipelineDynamicStateCreateInfo} structure</li>
 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
 * <li>{@code stageCount} <b>must</b> be greater than 0</li>
 * <li>Each of {@code layout}, {@code renderPass} and {@code basePipelineHandle} that are valid handles <b>must</b> have been created, allocated or retrieved
 * from the same {@code VkDevice}</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineIndex} is not {@code -1}, {@code basePipelineHandle}
 * <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineIndex} is not {@code -1}, it <b>must</b> be a valid index into
 * the calling command's {@code pCreateInfos} parameter</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code basePipelineIndex}
 * <b>must</b> be {@code -1}</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code basePipelineHandle}
 * <b>must</b> be a valid {@code VkPipeline} handle</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> be a valid handle
 * to a graphics {@code VkPipeline}</li>
 * <li>The {@code stage} member of each element of {@code pStages} <b>must</b> be unique</li>
 * <li>The {@code stage} member of one element of {@code pStages} <b>must</b> be {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}</li>
 * <li>The {@code stage} member of any given element of {@code pStages} <b>must not</b> be {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}</li>
 * <li>If {@code pStages} includes a tessellation control shader stage, it <b>must</b> include a tessellation evaluation shader stage</li>
 * <li>If {@code pStages} includes a tessellation evaluation shader stage, it <b>must</b> include a tessellation control shader stage</li>
 * <li>If {@code pStages} includes a tessellation control shader stage and a tessellation evaluation shader stage, {@code pTessellationState} <b>must not</b> be
 * {@code NULL}</li>
 * <li>If {@code pStages} includes both a tessellation control shader stage and a tessellation evaluation shader stage, the shader code of at least one
 * <b>must</b> contain an {@code OpExecutionMode} instruction that specifies the type of subdivision in the pipeline</li>
 * <li>If {@code pStages} includes both a tessellation control shader stage and a tessellation evaluation shader stage, and the shader code of both
 * contain an {@code OpExecutionMode} instruction that specifies the type of subdivision in the pipeline, they <b>must</b> both specify the same subdivision
 * mode</li>
 * <li>If {@code pStages} includes both a tessellation control shader stage and a tessellation evaluation shader stage, the shader code of at least one
 * <b>must</b> contain an {@code OpExecutionMode} instruction that specifies the output patch size in the pipeline</li>
 * <li>If {@code pStages} includes both a tessellation control shader stage and a tessellation evaluation shader stage, and the shader code of both
 * contain an {@code OpExecutionMode} instruction that specifies the out patch size in the pipeline, they <b>must</b> both specify the same patch size</li>
 * <li>If {@code pStages} includes tessellation shader stages, the {@code topology} member of {@code pInputAssembly} <b>must</b> be
 * {@link VK10#VK_PRIMITIVE_TOPOLOGY_PATCH_LIST PRIMITIVE_TOPOLOGY_PATCH_LIST}</li>
 * <li>If {@code pStages} includes a geometry shader stage, and doesn't include any tessellation shader stages, its shader code <b>must</b> contain an
 * {@code OpExecutionMode} instruction that specifies an input primitive type that is compatible with the primitive topology specified in
 * {@code pInputAssembly}</li>
 * <li>If {@code pStages} includes a geometry shader stage, and also includes tessellation shader stages, its shader code <b>must</b> contain an
 * {@code OpExecutionMode} instruction that specifies an input primitive type that is compatible with the primitive topology that is output by the
 * tessellation stages</li>
 * <li>If {@code pStages} includes a fragment shader stage and a geometry shader stage, and the fragment shader code reads from an input variable that is
 * decorated with {@code PrimitiveID}, then the geometry shader code <b>must</b> write to a matching output variable, decorated with {@code PrimitiveID}, in
 * all execution paths</li>
 * <li>If {@code pStages} includes a fragment shader stage, its shader code <b>must not</b> read from any input attachment that is defined as {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}
 * in {@code subpass}</li>
 * <li>The shader code for the entry points identified by {@code pStages}, and the rest of the state identified by this structure <b>must</b> adhere to the
 * pipeline linking rules described in the Shader Interfaces chapter</li>
 * <li>If {@code subpass} uses a depth/stencil attachment in {@code renderpass} that has a layout of {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL} in the
 * {@code VkAttachmentReference} defined by {@code subpass}, and {@code pDepthStencilState} is not {@code NULL}, the {@code depthWriteEnable} member of
 * {@code pDepthStencilState} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code subpass} uses a depth/stencil attachment in {@code renderpass} that has a layout of {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL} in the
 * {@code VkAttachmentReference} defined by {@code subpass}, and {@code pDepthStencilState} is not {@code NULL}, the {@code failOp}, {@code passOp} and
 * {@code depthFailOp} members of each of the {@code front} and {@code back} members of {@code pDepthStencilState} <b>must</b> be {@link VK10#VK_STENCIL_OP_KEEP STENCIL_OP_KEEP}</li>
 * <li>If {@code pColorBlendState} is not {@code NULL}, the {@code blendEnable} member of each element of the {@code pAttachment} member of
 * {@code pColorBlendState} <b>must</b> be {@link VK10#VK_FALSE FALSE} if the {@code format} of the attachment referred to in {@code subpass} of {@code renderPass} does not
 * support color blend operations, as specified by the {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT} flag in
 * {@link VkFormatProperties}{@code ::linearTilingFeatures} or {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * <li>If {@code pColorBlendState} is not {@code NULL}, The {@code attachmentCount} member of {@code pColorBlendState} <b>must</b> be equal to the
 * {@code colorAttachmentCount} used to create {@code subpass}</li>
 * <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link VK10#VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT}, the {@code pViewports} member of
 * {@code pViewportState} <b>must</b> be a pointer to an array of {@code pViewportState}->viewportCount {@link VkViewport} structures</li>
 * <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link VK10#VK_DYNAMIC_STATE_SCISSOR DYNAMIC_STATE_SCISSOR}, the {@code pScissors} member of
 * {@code pViewportState} <b>must</b> be a pointer to an array of {@code pViewportState}->scissorCount {@link VkRect2D} structures</li>
 * <li>If the wide lines feature is not enabled, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is
 * {@link VK10#VK_DYNAMIC_STATE_LINE_WIDTH DYNAMIC_STATE_LINE_WIDTH}, the {@code lineWidth} member of {@code pRasterizationState} <b>must</b> be {@code 1.0}</li>
 * <li>If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is {@link VK10#VK_FALSE FALSE}, {@code pViewportState} <b>must</b> be a pointer to a valid
 * {@link VkPipelineViewportStateCreateInfo} structure</li>
 * <li>If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is {@link VK10#VK_FALSE FALSE}, {@code pMultisampleState} <b>must</b> be a pointer to a valid
 * {@link VkPipelineMultisampleStateCreateInfo} structure</li>
 * <li>If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is {@link VK10#VK_FALSE FALSE}, and {@code subpass} uses a depth/stencil attachment,
 * {@code pDepthStencilState} <b>must</b> be a pointer to a valid {@link VkPipelineDepthStencilStateCreateInfo} structure</li>
 * <li>If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is {@link VK10#VK_FALSE FALSE}, and {@code subpass} uses color attachments,
 * {@code pColorBlendState} <b>must</b> be a pointer to a valid {@link VkPipelineColorBlendStateCreateInfo} structure</li>
 * <li>If the depth bias clamping feature is not enabled, no element of the {@code pDynamicStates} member of {@code pDynamicState} is
 * {@link VK10#VK_DYNAMIC_STATE_DEPTH_BIAS DYNAMIC_STATE_DEPTH_BIAS}, and the {@code depthBiasEnable} member of {@code pDepthStencil} is {@link VK10#VK_TRUE TRUE}, the {@code depthBiasClamp} member of
 * {@code pDepthStencil} <b>must</b> be {@code 0.0}</li>
 * <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link VK10#VK_DYNAMIC_STATE_DEPTH_BOUNDS DYNAMIC_STATE_DEPTH_BOUNDS}, and the {@code depthBoundsTestEnable}
 * member of {@code pDepthStencil} is {@link VK10#VK_TRUE TRUE}, the {@code minDepthBounds} and {@code maxDepthBounds} members of {@code pDepthStencil} <b>must</b> be between
 * {@code 0.0} and {@code 1.0}, inclusive</li>
 * <li>{@code layout} <b>must</b> be consistent with all shaders specified in {@code pStages}</li>
 * <li>If {@code subpass} uses color and/or depth/stencil attachments, then the {@code rasterizationSamples} member of {@code pMultisampleState} <b>must</b> be
 * the same as the sample count for those subpass attachments</li>
 * <li>If {@code subpass} does not use any color and/or depth/stencil attachments, then the {@code rasterizationSamples} member of
 * {@code pMultisampleState} <b>must</b> follow the rules for a zero-attachment subpass</li>
 * <li>{@code subpass} <b>must</b> be a valid subpass within {@code renderpass}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; a bitfield of {@code VkPipelineCreateFlagBits} controlling how the pipeline will be generated. One or more of:<br><table><tr><td>{@link VK10#VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT}</td><td>{@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT}</td></tr><tr><td>{@link VK10#VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT}</td></tr></table></li>
 * <li>{@code stageCount} &ndash; the number of entries in the {@code pStages} array</li>
 * <li>{@code pStages} &ndash; 
 * an array of size {@code stageCount} structures of type {@link VkPipelineShaderStageCreateInfo} describing the set of the shader stages to be included in the
 * graphics pipeline</li>
 * <li>{@code pVertexInputState} &ndash; a pointer to an instance of the {@link VkPipelineVertexInputStateCreateInfo} structure</li>
 * <li>{@code pInputAssemblyState} &ndash; a pointer to an instance of the {@link VkPipelineInputAssemblyStateCreateInfo} structure which determines input assembly behavior</li>
 * <li>{@code pTessellationState} &ndash; 
 * a pointer to an instance of the {@link VkPipelineTessellationStateCreateInfo} structure, or {@code NULL} if the pipeline does not include a tessellation control
 * shader stage and tessellation evaluation shader stage</li>
 * <li>{@code pViewportState} &ndash; a pointer to an instance of the {@link VkPipelineViewportStateCreateInfo} structure, or {@code NULL} if the pipeline has rasterization disabled</li>
 * <li>{@code pRasterizationState} &ndash; a pointer to an instance of the {@link VkPipelineRasterizationStateCreateInfo} structure</li>
 * <li>{@code pMultisampleState} &ndash; a pointer to an instance of the {@link VkPipelineMultisampleStateCreateInfo}, or {@code NULL} if the pipeline has rasterization disabled</li>
 * <li>{@code pDepthStencilState} &ndash; 
 * a pointer to an instance of the {@link VkPipelineDepthStencilStateCreateInfo} structure, or {@code NULL} if the pipeline has rasterization disabled or if the
 * subpass of the render pass the pipeline is created against does not use a depth/stencil attachment</li>
 * <li>{@code pColorBlendState} &ndash; 
 * a pointer to an instance of the {@link VkPipelineColorBlendStateCreateInfo} structure, or {@code NULL} if the pipeline has rasterization disabled or if the subpass
 * of the render pass the pipeline is created against does not use any color attachments</li>
 * <li>{@code pDynamicState} &ndash; 
 * a pointer to {@link VkPipelineDynamicStateCreateInfo} and is used to indicate which properties of the pipeline state object are dynamic and can be changed
 * independently of the pipeline state. This can be {@code NULL}, which means no state in the pipeline is considered dynamic.</li>
 * <li>{@code layout} &ndash; the description of binding locations used by both the pipeline and descriptor sets used with the pipeline</li>
 * <li>{@code renderPass} &ndash; 
 * a handle to a render pass object describing the environment in which the pipeline will be used; the pipeline can be used with an instance of any render
 * pass compatible with the one provided</li>
 * <li>{@code subpass} &ndash; the index of the subpass in {@code renderPass} where this pipeline will be used</li>
 * <li>{@code basePipelineHandle} &ndash; a pipeline to derive from</li>
 * <li>{@code basePipelineIndex} &ndash; an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkGraphicsPipelineCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkPipelineCreateFlags flags;
    uint32_t stageCount;
    const VkPipelineShaderStageCreateInfo * pStages;
    const VkPipelineVertexInputStateCreateInfo * pVertexInputState;
    const VkPipelineInputAssemblyStateCreateInfo * pInputAssemblyState;
    const VkPipelineTessellationStateCreateInfo * pTessellationState;
    const VkPipelineViewportStateCreateInfo * pViewportState;
    const VkPipelineRasterizationStateCreateInfo * pRasterizationState;
    const VkPipelineMultisampleStateCreateInfo * pMultisampleState;
    const VkPipelineDepthStencilStateCreateInfo * pDepthStencilState;
    const VkPipelineColorBlendStateCreateInfo * pColorBlendState;
    const VkPipelineDynamicStateCreateInfo * pDynamicState;
    VkPipelineLayout layout;
    VkRenderPass renderPass;
    uint32_t subpass;
    VkPipeline basePipelineHandle;
    int32_t basePipelineIndex;
}</code></pre>
 */
public class VkGraphicsPipelineCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
		ALIGNOF = layout.getAlignment();

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
	public VkPipelineShaderStageCreateInfo.Buffer pStages() { return npStages(address()); }
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

	// -----------------------------------

	/** Returns a new {@link VkGraphicsPipelineCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkGraphicsPipelineCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkGraphicsPipelineCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
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
	 * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
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

	// -----------------------------------

	/** Returns a new {@link VkGraphicsPipelineCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkGraphicsPipelineCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkGraphicsPipelineCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkGraphicsPipelineCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkGraphicsPipelineCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkGraphicsPipelineCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkGraphicsPipelineCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkGraphicsPipelineCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkGraphicsPipelineCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkGraphicsPipelineCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkGraphicsPipelineCreateInfo.FLAGS); }
	/** Unsafe version of {@link #stageCount}. */
	public static int nstageCount(long struct) { return memGetInt(struct + VkGraphicsPipelineCreateInfo.STAGECOUNT); }
	/** Unsafe version of {@link #pStages}. */
	public static VkPipelineShaderStageCreateInfo.Buffer npStages(long struct) { return VkPipelineShaderStageCreateInfo.create(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PSTAGES), nstageCount(struct)); }
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
	/** Sets the specified value to the {@code stageCount} field of the specified {@code struct}. */
	public static void nstageCount(long struct, int value) { memPutInt(struct + VkGraphicsPipelineCreateInfo.STAGECOUNT, value); }
	/** Unsafe version of {@link #pStages(VkPipelineShaderStageCreateInfo.Buffer) pStages}. */
	public static void npStages(long struct, VkPipelineShaderStageCreateInfo.Buffer value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PSTAGES, value.address()); nstageCount(struct, value.remaining()); }
	/** Unsafe version of {@link #pVertexInputState(VkPipelineVertexInputStateCreateInfo) pVertexInputState}. */
	public static void npVertexInputState(long struct, VkPipelineVertexInputStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE, value.address()); }
	/** Unsafe version of {@link #pInputAssemblyState(VkPipelineInputAssemblyStateCreateInfo) pInputAssemblyState}. */
	public static void npInputAssemblyState(long struct, VkPipelineInputAssemblyStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PINPUTASSEMBLYSTATE, value.address()); }
	/** Unsafe version of {@link #pTessellationState(VkPipelineTessellationStateCreateInfo) pTessellationState}. */
	public static void npTessellationState(long struct, VkPipelineTessellationStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PTESSELLATIONSTATE, addressSafe(value)); }
	/** Unsafe version of {@link #pViewportState(VkPipelineViewportStateCreateInfo) pViewportState}. */
	public static void npViewportState(long struct, VkPipelineViewportStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PVIEWPORTSTATE, addressSafe(value)); }
	/** Unsafe version of {@link #pRasterizationState(VkPipelineRasterizationStateCreateInfo) pRasterizationState}. */
	public static void npRasterizationState(long struct, VkPipelineRasterizationStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE, value.address()); }
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

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		int stageCount = nstageCount(struct);
		long pStages = memGetAddress(struct + VkGraphicsPipelineCreateInfo.PSTAGES);
		checkPointer(pStages);
		VkPipelineShaderStageCreateInfo.validate(pStages, stageCount);
		long pVertexInputState = memGetAddress(struct + VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE);
		checkPointer(pVertexInputState);
		VkPipelineVertexInputStateCreateInfo.validate(pVertexInputState);
		checkPointer(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PINPUTASSEMBLYSTATE));
		checkPointer(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE));
		long pColorBlendState = memGetAddress(struct + VkGraphicsPipelineCreateInfo.PCOLORBLENDSTATE);
		if ( pColorBlendState != NULL )
			VkPipelineColorBlendStateCreateInfo.validate(pColorBlendState);
		long pDynamicState = memGetAddress(struct + VkGraphicsPipelineCreateInfo.PDYNAMICSTATE);
		if ( pDynamicState != NULL )
			VkPipelineDynamicStateCreateInfo.validate(pDynamicState);
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

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
			return new VkGraphicsPipelineCreateInfo(address, getContainer());
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
		public VkPipelineShaderStageCreateInfo.Buffer pStages() { return VkGraphicsPipelineCreateInfo.npStages(address()); }
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