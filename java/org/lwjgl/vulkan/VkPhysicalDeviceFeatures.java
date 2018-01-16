/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing the fine-grained features that can be supported by an implementation.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code robustBufferAccess} &ndash; indicates that accesses to buffers are bounds-checked against the range of the buffer descriptor (as determined by {@link VkDescriptorBufferInfo}{@code ::range}, {@link VkBufferViewCreateInfo}{@code ::range}, or the size of the buffer). Out of bounds accesses <b>must</b> not cause application termination, and the effects of shader loads, stores, and atomics <b>must</b> conform to an implementation-dependent behavior as described below.
 * 
 * <ul>
 * <li>A buffer access is considered to be out of bounds if any of the following are true:
 * 
 * <ul>
 * <li>The pointer was formed by {@code OpImageTexelPointer} and the coordinate is less than zero or greater than or equal to the number of whole elements in the bound range.</li>
 * <li>The pointer was not formed by {@code OpImageTexelPointer} and the object pointed to is not wholly contained within the bound range. This includes accesses performed via <em>variable pointers</em> where the buffer descriptor being accessed cannot be statically determined. Uninitialized pointers and pointers equal to {@code OpConstantNull} are treated as pointing to a zero-sized object, so all accesses through such pointers are considered to be out of bounds.
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>If a SPIR-V {@code OpLoad} instruction loads a structure and the tail end of the structure is out of bounds, then all members of the structure are considered out of bounds even if the members at the end are not statically used.</p>
 * </div>
 * </li>
 * <li>If any buffer access in a given SPIR-V block is determined to be out of bounds, then any other access of the same type (load, store, or atomic) in the same SPIR-V block that accesses an address less than 16 bytes away from the out of bounds address <b>may</b> also be considered out of bounds.</li>
 * </ul>
 * </li>
 * <li>Out-of-bounds buffer loads will return any of the following values:
 * 
 * <ul>
 * <li>Values from anywhere within the memory range(s) bound to the buffer (possibly including bytes of memory past the end of the buffer, up to the end of the bound range).</li>
 * <li>Zero values, or <code>(0,0,0,x)</code> vectors for vector reads where x is a valid value represented in the type of the vector components and <b>may</b> be any of:
 * 
 * <ul>
 * <li>0, 1, or the maximum representable positive integer value, for signed or unsigned integer components</li>
 * <li>0.0 or 1.0, for floating-point components</li>
 * </ul>
 * </li>
 * </ul>
 * </li>
 * <li>Out-of-bounds writes <b>may</b> modify values within the memory range(s) bound to the buffer, but <b>must</b> not modify any other memory.</li>
 * <li>Out-of-bounds atomics <b>may</b> modify values within the memory range(s) bound to the buffer, but <b>must</b> not modify any other memory, and return an undefined value.</li>
 * <li>Vertex input attributes are considered out of bounds if the offset of the attribute in the bound vertex buffer range plus the size of the attribute is greater than either:
 * 
 * <ul>
 * <li>{@code vertexBufferRangeSize}, if <code>bindingStride == 0</code>; or</li>
 * <li><code>(vertexBufferRangeSize - (vertexBufferRangeSize % bindingStride))</code></li>
 * </ul>
 * 
 * <p>where {@code vertexBufferRangeSize} is the byte size of the memory range bound to the vertex buffer binding and {@code bindingStride} is the byte stride of the corresponding vertex input binding. Further, if any vertex input attribute using a specific vertex input binding is out of bounds, then all vertex input attributes using that vertex input binding for that vertex shader invocation are considered out of bounds.</p>
 * 
 * <ul>
 * <li>If a vertex input attribute is out of bounds, it will be assigned one of the following values:
 * 
 * <ul>
 * <li>Values from anywhere within the memory range(s) bound to the buffer, converted according to the format of the attribute.</li>
 * <li>Zero values, format converted according to the format of the attribute.</li>
 * <li>Zero values, or <code>(0,0,0,x)</code> vectors, as described above.</li>
 * </ul>
 * </li>
 * </ul>
 * </li>
 * <li>If {@code robustBufferAccess} is not enabled, out of bounds accesses <b>may</b> corrupt any memory within the process and cause undefined behavior up to and including application termination.</li>
 * </ul></li>
 * <li>{@code fullDrawIndexUint32} &ndash; indicates the full 32-bit range of indices is supported for indexed draw calls when using a {@code VkIndexType} of {@link VK10#VK_INDEX_TYPE_UINT32 INDEX_TYPE_UINT32}. {@code maxDrawIndexedIndexValue} is the maximum index value that <b>may</b> be used (aside from the primitive restart index, which is always 2<sup>32</sup>-1 when the {@code VkIndexType} is {@link VK10#VK_INDEX_TYPE_UINT32 INDEX_TYPE_UINT32}). If this feature is supported, {@code maxDrawIndexedIndexValue} <b>must</b> be 2<sup>32</sup>-1; otherwise it <b>must</b> be no smaller than 2<sup>24</sup>-1. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-limits-maxDrawIndexedIndexValue">maxDrawIndexedIndexValue</a>.</li>
 * <li>{@code imageCubeArray} &ndash; indicates whether image views with a {@code VkImageViewType} of {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY} <b>can</b> be created, and that the corresponding {@code SampledCubeArray} and {@code ImageCubeArray} SPIR-V capabilities <b>can</b> be used in shader code.</li>
 * <li>{@code independentBlend} &ndash; indicates whether the {@link VkPipelineColorBlendAttachmentState} settings are controlled independently per-attachment. If this feature is not enabled, the {@link VkPipelineColorBlendAttachmentState} settings for all color attachments <b>must</b> be identical. Otherwise, a different {@link VkPipelineColorBlendAttachmentState} <b>can</b> be provided for each bound color attachment.</li>
 * <li>{@code geometryShader} &ndash; indicates whether geometry shaders are supported. If this feature is not enabled, the {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT} and {@link VK10#VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT} enum values <b>must</b> not be used. This also indicates whether shader modules <b>can</b> declare the {@code Geometry} capability.</li>
 * <li>{@code tessellationShader} &ndash; indicates whether tessellation control and evaluation shaders are supported. If this feature is not enabled, the {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}, {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}, and {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO} enum values <b>must</b> not be used. This also indicates whether shader modules <b>can</b> declare the {@code Tessellation} capability.</li>
 * <li>{@code sampleRateShading} &ndash; indicates whether per-sample shading and multisample interpolation are supported. If this feature is not enabled, the {@code sampleShadingEnable} member of the {@link VkPipelineMultisampleStateCreateInfo} structure <b>must</b> be set to {@link VK10#VK_FALSE FALSE} and the {@code minSampleShading} member is ignored. This also indicates whether shader modules <b>can</b> declare the {@code SampleRateShading} capability.</li>
 * <li>{@code dualSrcBlend} &ndash; indicates whether blend operations which take two sources are supported. If this feature is not enabled, the {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, and {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA} enum values <b>must</b> not be used as source or destination blending factors. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#framebuffer-dsb">the “Dual-Source Blending” section</a>.</li>
 * <li>{@code logicOp} &ndash; indicates whether logic operations are supported. If this feature is not enabled, the {@code logicOpEnable} member of the {@link VkPipelineColorBlendStateCreateInfo} structure <b>must</b> be set to {@link VK10#VK_FALSE FALSE}, and the {@code logicOp} member is ignored.</li>
 * <li>{@code multiDrawIndirect} &ndash; indicates whether multiple draw indirect is supported. If this feature is not enabled, the {@code drawCount} parameter to the {@link VK10#vkCmdDrawIndirect CmdDrawIndirect} and {@link VK10#vkCmdDrawIndexedIndirect CmdDrawIndexedIndirect} commands <b>must</b> be 0 or 1. The {@code maxDrawIndirectCount} member of the {@link VkPhysicalDeviceLimits} structure <b>must</b> also be 1 if this feature is not supported. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-limits-maxDrawIndirectCount">maxDrawIndirectCount</a>.</li>
 * <li>{@code drawIndirectFirstInstance} &ndash; indicates whether indirect draw calls support the {@code firstInstance} parameter. If this feature is not enabled, the {@code firstInstance} member of all {@link VkDrawIndirectCommand} and {@link VkDrawIndexedIndirectCommand} structures that are provided to the {@link VK10#vkCmdDrawIndirect CmdDrawIndirect} and {@link VK10#vkCmdDrawIndexedIndirect CmdDrawIndexedIndirect} commands <b>must</b> be 0.</li>
 * <li>{@code depthClamp} &ndash; indicates whether depth clamping is supported. If this feature is not enabled, the {@code depthClampEnable} member of the {@link VkPipelineRasterizationStateCreateInfo} structure <b>must</b> be set to {@link VK10#VK_FALSE FALSE}. Otherwise, setting {@code depthClampEnable} to {@link VK10#VK_TRUE TRUE} will enable depth clamping.</li>
 * <li>{@code depthBiasClamp} &ndash; indicates whether depth bias clamping is supported. If this feature is not enabled, the {@code depthBiasClamp} member of the {@link VkPipelineRasterizationStateCreateInfo} structure <b>must</b> be set to 0.0 unless the {@link VK10#VK_DYNAMIC_STATE_DEPTH_BIAS DYNAMIC_STATE_DEPTH_BIAS} dynamic state is enabled, and the {@code depthBiasClamp} parameter to {@link VK10#vkCmdSetDepthBias CmdSetDepthBias} <b>must</b> be set to 0.0.</li>
 * <li>{@code fillModeNonSolid} &ndash; indicates whether point and wireframe fill modes are supported. If this feature is not enabled, the {@link VK10#VK_POLYGON_MODE_POINT POLYGON_MODE_POINT} and {@link VK10#VK_POLYGON_MODE_LINE POLYGON_MODE_LINE} enum values <b>must</b> not be used.</li>
 * <li>{@code depthBounds} &ndash; indicates whether depth bounds tests are supported. If this feature is not enabled, the {@code depthBoundsTestEnable} member of the {@link VkPipelineDepthStencilStateCreateInfo} structure <b>must</b> be set to {@link VK10#VK_FALSE FALSE}. When {@code depthBoundsTestEnable} is set to {@link VK10#VK_FALSE FALSE}, the {@code minDepthBounds} and {@code maxDepthBounds} members of the {@link VkPipelineDepthStencilStateCreateInfo} structure are ignored.</li>
 * <li>{@code wideLines} &ndash; indicates whether lines with width other than 1.0 are supported. If this feature is not enabled, the {@code lineWidth} member of the {@link VkPipelineRasterizationStateCreateInfo} structure <b>must</b> be set to 1.0 unless the {@link VK10#VK_DYNAMIC_STATE_LINE_WIDTH DYNAMIC_STATE_LINE_WIDTH} dynamic state is enabled, and the {@code lineWidth} parameter to {@link VK10#vkCmdSetLineWidth CmdSetLineWidth} <b>must</b> be set to 1.0. When this feature is supported, the range and granularity of supported line widths are indicated by the {@code lineWidthRange} and {@code lineWidthGranularity} members of the {@link VkPhysicalDeviceLimits} structure, respectively.</li>
 * <li>{@code largePoints} &ndash; indicates whether points with size greater than 1.0 are supported. If this feature is not enabled, only a point size of 1.0 written by a shader is supported. The range and granularity of supported point sizes are indicated by the {@code pointSizeRange} and {@code pointSizeGranularity} members of the {@link VkPhysicalDeviceLimits} structure, respectively.</li>
 * <li>{@code alphaToOne} &ndash; indicates whether the implementation is able to replace the alpha value of the color fragment output from the fragment shader with the maximum representable alpha value for fixed-point colors or 1.0 for floating-point colors. If this feature is not enabled, then the {@code alphaToOneEnable} member of the {@link VkPipelineMultisampleStateCreateInfo} structure <b>must</b> be set to {@link VK10#VK_FALSE FALSE}. Otherwise setting {@code alphaToOneEnable} to {@link VK10#VK_TRUE TRUE} will enable alpha-to-one behavior.</li>
 * <li>{@code multiViewport} &ndash; indicates whether more than one viewport is supported. If this feature is not enabled, the {@code viewportCount} and {@code scissorCount} members of the {@link VkPipelineViewportStateCreateInfo} structure <b>must</b> be set to 1. Similarly, the {@code viewportCount} parameter to the {@link VK10#vkCmdSetViewport CmdSetViewport} command and the {@code scissorCount} parameter to the {@link VK10#vkCmdSetScissor CmdSetScissor} command <b>must</b> be 1, and the {@code firstViewport} parameter to the {@link VK10#vkCmdSetViewport CmdSetViewport} command and the {@code firstScissor} parameter to the {@link VK10#vkCmdSetScissor CmdSetScissor} command <b>must</b> be 0.</li>
 * <li>{@code samplerAnisotropy} &ndash; indicates whether anisotropic filtering is supported. If this feature is not enabled, the {@code anisotropyEnable} member of the {@link VkSamplerCreateInfo} structure <b>must</b> be {@link VK10#VK_FALSE FALSE}.</li>
 * <li>{@code textureCompressionETC2} &ndash; indicates whether all of the ETC2 and EAC compressed texture formats are supported. If this feature is enabled, then the {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}, {@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT} and {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} features <b>must</b> be supported in {@code optimalTilingFeatures} for the following formats:
 * 
 * <ul>
 * <li>{@link VK10#VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK FORMAT_ETC2_R8G8B8_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK FORMAT_ETC2_R8G8B8_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_EAC_R11_UNORM_BLOCK FORMAT_EAC_R11_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_EAC_R11_SNORM_BLOCK FORMAT_EAC_R11_SNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_EAC_R11G11_UNORM_BLOCK FORMAT_EAC_R11G11_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_EAC_R11G11_SNORM_BLOCK FORMAT_EAC_R11G11_SNORM_BLOCK}</li>
 * </ul>
 * 
 * <p>{@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} and {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} <b>can</b> be used to check for additional supported properties of individual formats.</p></li>
 * <li>{@code textureCompressionASTC_LDR} &ndash; indicates whether all of the ASTC LDR compressed texture formats are supported. If this feature is enabled, then the {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}, {@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT} and {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} features <b>must</b> be supported in {@code optimalTilingFeatures} for the following formats:
 * 
 * <ul>
 * <li>{@link VK10#VK_FORMAT_ASTC_4x4_UNORM_BLOCK FORMAT_ASTC_4x4_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_4x4_SRGB_BLOCK FORMAT_ASTC_4x4_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_5x4_UNORM_BLOCK FORMAT_ASTC_5x4_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_5x4_SRGB_BLOCK FORMAT_ASTC_5x4_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_5x5_UNORM_BLOCK FORMAT_ASTC_5x5_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_5x5_SRGB_BLOCK FORMAT_ASTC_5x5_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_6x5_UNORM_BLOCK FORMAT_ASTC_6x5_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_6x5_SRGB_BLOCK FORMAT_ASTC_6x5_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_6x6_UNORM_BLOCK FORMAT_ASTC_6x6_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_6x6_SRGB_BLOCK FORMAT_ASTC_6x6_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_8x5_UNORM_BLOCK FORMAT_ASTC_8x5_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_8x5_SRGB_BLOCK FORMAT_ASTC_8x5_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_8x6_UNORM_BLOCK FORMAT_ASTC_8x6_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_8x6_SRGB_BLOCK FORMAT_ASTC_8x6_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_8x8_UNORM_BLOCK FORMAT_ASTC_8x8_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_8x8_SRGB_BLOCK FORMAT_ASTC_8x8_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_10x5_UNORM_BLOCK FORMAT_ASTC_10x5_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_10x5_SRGB_BLOCK FORMAT_ASTC_10x5_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_10x6_UNORM_BLOCK FORMAT_ASTC_10x6_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_10x6_SRGB_BLOCK FORMAT_ASTC_10x6_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_10x8_UNORM_BLOCK FORMAT_ASTC_10x8_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_10x8_SRGB_BLOCK FORMAT_ASTC_10x8_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_10x10_UNORM_BLOCK FORMAT_ASTC_10x10_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_10x10_SRGB_BLOCK FORMAT_ASTC_10x10_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_12x10_UNORM_BLOCK FORMAT_ASTC_12x10_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_12x10_SRGB_BLOCK FORMAT_ASTC_12x10_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_12x12_UNORM_BLOCK FORMAT_ASTC_12x12_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_ASTC_12x12_SRGB_BLOCK FORMAT_ASTC_12x12_SRGB_BLOCK}</li>
 * </ul>
 * 
 * <p>{@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} and {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} <b>can</b> be used to check for additional supported properties of individual formats.</p></li>
 * <li>{@code textureCompressionBC} &ndash; indicates whether all of the BC compressed texture formats are supported. If this feature is enabled, then the {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}, {@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT} and {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} features <b>must</b> be supported in {@code optimalTilingFeatures} for the following formats:
 * 
 * <ul>
 * <li>{@link VK10#VK_FORMAT_BC1_RGB_UNORM_BLOCK FORMAT_BC1_RGB_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC1_RGB_SRGB_BLOCK FORMAT_BC1_RGB_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC1_RGBA_UNORM_BLOCK FORMAT_BC1_RGBA_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC1_RGBA_SRGB_BLOCK FORMAT_BC1_RGBA_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC2_UNORM_BLOCK FORMAT_BC2_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC2_SRGB_BLOCK FORMAT_BC2_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC3_UNORM_BLOCK FORMAT_BC3_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC3_SRGB_BLOCK FORMAT_BC3_SRGB_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC4_UNORM_BLOCK FORMAT_BC4_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC4_SNORM_BLOCK FORMAT_BC4_SNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC5_UNORM_BLOCK FORMAT_BC5_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC5_SNORM_BLOCK FORMAT_BC5_SNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC6H_UFLOAT_BLOCK FORMAT_BC6H_UFLOAT_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC6H_SFLOAT_BLOCK FORMAT_BC6H_SFLOAT_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC7_UNORM_BLOCK FORMAT_BC7_UNORM_BLOCK}</li>
 * <li>{@link VK10#VK_FORMAT_BC7_SRGB_BLOCK FORMAT_BC7_SRGB_BLOCK}</li>
 * </ul>
 * 
 * <p>{@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} and {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} <b>can</b> be used to check for additional supported properties of individual formats.</p></li>
 * <li>{@code occlusionQueryPrecise} &ndash; indicates whether occlusion queries returning actual sample counts are supported. Occlusion queries are created in a {@code VkQueryPool} by specifying the {@code queryType} of {@link VK10#VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} in the {@link VkQueryPoolCreateInfo} structure which is passed to {@link VK10#vkCreateQueryPool CreateQueryPool}. If this feature is enabled, queries of this type <b>can</b> enable {@link VK10#VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT} in the {@code flags} parameter to {@link VK10#vkCmdBeginQuery CmdBeginQuery}. If this feature is not supported, the implementation supports only boolean occlusion queries. When any samples are passed, boolean queries will return a non-zero result value, otherwise a result value of zero is returned. When this feature is enabled and {@link VK10#VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT} is set, occlusion queries will report the actual number of samples passed.</li>
 * <li>{@code pipelineStatisticsQuery} &ndash; indicates whether the pipeline statistics queries are supported. If this feature is not enabled, queries of type {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} <b>cannot</b> be created, and none of the {@code VkQueryPipelineStatisticFlagBits} bits <b>can</b> be set in the {@code pipelineStatistics} member of the {@link VkQueryPoolCreateInfo} structure.</li>
 * <li>{@code vertexPipelineStoresAndAtomics} &ndash; indicates whether storage buffers and images support stores and atomic operations in the vertex, tessellation, and geometry shader stages. If this feature is not enabled, all storage image, storage texel buffers, and storage buffer variables used by these stages in shader modules <b>must</b> be decorated with the {@code NonWriteable} decoration (or the {@code readonly} memory qualifier in GLSL).</li>
 * <li>{@code fragmentStoresAndAtomics} &ndash; indicates whether storage buffers and images support stores and atomic operations in the fragment shader stage. If this feature is not enabled, all storage image, storage texel buffers, and storage buffer variables used by the fragment stage in shader modules <b>must</b> be decorated with the {@code NonWriteable} decoration (or the {@code readonly} memory qualifier in GLSL).</li>
 * <li>{@code shaderTessellationAndGeometryPointSize} &ndash; indicates whether the {@code PointSize} built-in decoration is available in the tessellation control, tessellation evaluation, and geometry shader stages. If this feature is not enabled, members decorated with the {@code PointSize} built-in decoration <b>must</b> not be read from or written to and all points written from a tessellation or geometry shader will have a size of 1.0. This also indicates whether shader modules <b>can</b> declare the {@code TessellationPointSize} capability for tessellation control and evaluation shaders, or if the shader modules <b>can</b> declare the {@code GeometryPointSize} capability for geometry shaders. An implementation supporting this feature <b>must</b> also support one or both of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-tessellationShader">{@code tessellationShader}</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-geometryShader">{@code geometryShader}</a> features.</li>
 * <li>{@code shaderImageGatherExtended} &ndash; indicates whether the extended set of image gather instructions are available in shader code. If this feature is not enabled, the {@code OpImage}*{@code Gather} instructions do not support the {@code Offset} and {@code ConstOffsets} operands. This also indicates whether shader modules <b>can</b> declare the {@code ImageGatherExtended} capability.</li>
 * <li>{@code shaderStorageImageExtendedFormats} &ndash; indicates whether the extended storage image formats are available in shader code. If this feature is not enabled, the formats requiring the {@code StorageImageExtendedFormats} capability are not supported for storage images. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageExtendedFormats} capability.</li>
 * <li>{@code shaderStorageImageMultisample} &ndash; indicates whether multisampled storage images are supported. If this feature is not enabled, images that are created with a {@code usage} that includes {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT} <b>must</b> be created with {@code samples} equal to {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageMultisample} capability.</li>
 * <li>{@code shaderStorageImageReadWithoutFormat} &ndash; indicates whether storage images require a format qualifier to be specified when reading from storage images. If this feature is not enabled, the {@code OpImageRead} instruction <b>must</b> not have an {@code OpTypeImage} of {@code Unknown}. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageReadWithoutFormat} capability.</li>
 * <li>{@code shaderStorageImageWriteWithoutFormat} &ndash; indicates whether storage images require a format qualifier to be specified when writing to storage images. If this feature is not enabled, the {@code OpImageWrite} instruction <b>must</b> not have an {@code OpTypeImage} of {@code Unknown}. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageWriteWithoutFormat} capability.</li>
 * <li>{@code shaderUniformBufferArrayDynamicIndexing} &ndash; indicates whether arrays of uniform buffers <b>can</b> be indexed by <em>dynamically uniform</em> integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformBufferArrayDynamicIndexing} capability.</li>
 * <li>{@code shaderSampledImageArrayDynamicIndexing} &ndash; indicates whether arrays of samplers or sampled images <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, or {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code SampledImageArrayDynamicIndexing} capability.</li>
 * <li>{@code shaderStorageBufferArrayDynamicIndexing} &ndash; indicates whether arrays of storage buffers <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageBufferArrayDynamicIndexing} capability.</li>
 * <li>{@code shaderStorageImageArrayDynamicIndexing} &ndash; indicates whether arrays of storage images <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageArrayDynamicIndexing} capability.</li>
 * <li>{@code shaderClipDistance} &ndash; indicates whether clip distances are supported in shader code. If this feature is not enabled, any members decorated with the {@code ClipDistance} built-in decoration <b>must</b> not be read from or written to in shader modules. This also indicates whether shader modules <b>can</b> declare the {@code ClipDistance} capability.</li>
 * <li>{@code shaderCullDistance} &ndash; indicates whether cull distances are supported in shader code. If this feature is not enabled, any members decorated with the {@code CullDistance} built-in decoration <b>must</b> not be read from or written to in shader modules. This also indicates whether shader modules <b>can</b> declare the {@code CullDistance} capability.</li>
 * <li>{@code shaderFloat64} &ndash; indicates whether 64-bit floats (doubles) are supported in shader code. If this feature is not enabled, 64-bit floating-point types <b>must</b> not be used in shader code. This also indicates whether shader modules <b>can</b> declare the {@code Float64} capability.</li>
 * <li>{@code shaderInt64} &ndash; indicates whether 64-bit integers (signed and unsigned) are supported in shader code. If this feature is not enabled, 64-bit integer types <b>must</b> not be used in shader code. This also indicates whether shader modules <b>can</b> declare the {@code Int64} capability.</li>
 * <li>{@code shaderInt16} &ndash; indicates whether 16-bit integers (signed and unsigned) are supported in shader code. If this feature is not enabled, 16-bit integer types <b>must</b> not be used in shader code. This also indicates whether shader modules <b>can</b> declare the {@code Int16} capability.</li>
 * <li>{@code shaderResourceResidency} &ndash; indicates whether image operations that return resource residency information are supported in shader code. If this feature is not enabled, the {@code OpImageSparse}* instructions <b>must</b> not be used in shader code. This also indicates whether shader modules <b>can</b> declare the {@code SparseResidency} capability. The feature requires at least one of the {@code sparseResidency}* features to be supported.</li>
 * <li>{@code shaderResourceMinLod} &ndash; indicates whether image operations that specify the minimum resource LOD are supported in shader code. If this feature is not enabled, the {@code MinLod} image operand <b>must</b> not be used in shader code. This also indicates whether shader modules <b>can</b> declare the {@code MinLod} capability.</li>
 * <li>{@code sparseBinding} &ndash; indicates whether resource memory <b>can</b> be managed at opaque sparse block level instead of at the object level. If this feature is not enabled, resource memory <b>must</b> be bound only on a per-object basis using the {@link VK10#vkBindBufferMemory BindBufferMemory} and {@link VK10#vkBindImageMemory BindImageMemory} commands. In this case, buffers and images <b>must</b> not be created with {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT} and {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT} set in the {@code flags} member of the {@link VkBufferCreateInfo} and {@link VkImageCreateInfo} structures, respectively. Otherwise resource memory <b>can</b> be managed as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#sparsememory-sparseresourcefeatures">Sparse Resource Features</a>.</li>
 * <li>{@code sparseResidencyBuffer} &ndash; indicates whether the device <b>can</b> access partially resident buffers. If this feature is not enabled, buffers <b>must</b> not be created with {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkBufferCreateInfo} structure.</li>
 * <li>{@code sparseResidencyImage2D} &ndash; indicates whether the device <b>can</b> access partially resident 2D images with 1 sample per pixel. If this feature is not enabled, images with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code samples} set to {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT} <b>must</b> not be created with {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkImageCreateInfo} structure.</li>
 * <li>{@code sparseResidencyImage3D} &ndash; indicates whether the device <b>can</b> access partially resident 3D images. If this feature is not enabled, images with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} <b>must</b> not be created with {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkImageCreateInfo} structure.</li>
 * <li>{@code sparseResidency2Samples} &ndash; indicates whether the physical device <b>can</b> access partially resident 2D images with 2 samples per pixel. If this feature is not enabled, images with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code samples} set to {@link VK10#VK_SAMPLE_COUNT_2_BIT SAMPLE_COUNT_2_BIT} <b>must</b> not be created with {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkImageCreateInfo} structure.</li>
 * <li>{@code sparseResidency4Samples} &ndash; indicates whether the physical device <b>can</b> access partially resident 2D images with 4 samples per pixel. If this feature is not enabled, images with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code samples} set to {@link VK10#VK_SAMPLE_COUNT_4_BIT SAMPLE_COUNT_4_BIT} <b>must</b> not be created with {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkImageCreateInfo} structure.</li>
 * <li>{@code sparseResidency8Samples} &ndash; indicates whether the physical device <b>can</b> access partially resident 2D images with 8 samples per pixel. If this feature is not enabled, images with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code samples} set to {@link VK10#VK_SAMPLE_COUNT_8_BIT SAMPLE_COUNT_8_BIT} <b>must</b> not be created with {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkImageCreateInfo} structure.</li>
 * <li>{@code sparseResidency16Samples} &ndash; indicates whether the physical device <b>can</b> access partially resident 2D images with 16 samples per pixel. If this feature is not enabled, images with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code samples} set to {@link VK10#VK_SAMPLE_COUNT_16_BIT SAMPLE_COUNT_16_BIT} <b>must</b> not be created with {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkImageCreateInfo} structure.</li>
 * <li>{@code sparseResidencyAliased} &ndash; indicates whether the physical device <b>can</b> correctly access data aliased into multiple locations. If this feature is not enabled, the {@link VK10#VK_BUFFER_CREATE_SPARSE_ALIASED_BIT BUFFER_CREATE_SPARSE_ALIASED_BIT} and {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT} enum values <b>must</b> not be used in {@code flags} members of the {@link VkBufferCreateInfo} and {@link VkImageCreateInfo} structures, respectively.</li>
 * <li>{@code variableMultisampleRate} &ndash; indicates whether all pipelines that will be bound to a command buffer during a subpass with no attachments <b>must</b> have the same value for {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples}. If set to {@link VK10#VK_TRUE TRUE}, the implementation supports variable multisample rates in a subpass with no attachments. If set to {@link VK10#VK_FALSE FALSE}, then all pipelines bound in such a subpass <b>must</b> have the same multisample rate. This has no effect in situations where a subpass uses any attachments.</li>
 * <li>{@code inheritedQueries} &ndash; indicates whether a secondary command buffer <b>may</b> be executed while a query is active.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceFeatures {
 *     VkBool32 robustBufferAccess;
 *     VkBool32 fullDrawIndexUint32;
 *     VkBool32 imageCubeArray;
 *     VkBool32 independentBlend;
 *     VkBool32 geometryShader;
 *     VkBool32 tessellationShader;
 *     VkBool32 sampleRateShading;
 *     VkBool32 dualSrcBlend;
 *     VkBool32 logicOp;
 *     VkBool32 multiDrawIndirect;
 *     VkBool32 drawIndirectFirstInstance;
 *     VkBool32 depthClamp;
 *     VkBool32 depthBiasClamp;
 *     VkBool32 fillModeNonSolid;
 *     VkBool32 depthBounds;
 *     VkBool32 wideLines;
 *     VkBool32 largePoints;
 *     VkBool32 alphaToOne;
 *     VkBool32 multiViewport;
 *     VkBool32 samplerAnisotropy;
 *     VkBool32 textureCompressionETC2;
 *     VkBool32 textureCompressionASTC_LDR;
 *     VkBool32 textureCompressionBC;
 *     VkBool32 occlusionQueryPrecise;
 *     VkBool32 pipelineStatisticsQuery;
 *     VkBool32 vertexPipelineStoresAndAtomics;
 *     VkBool32 fragmentStoresAndAtomics;
 *     VkBool32 shaderTessellationAndGeometryPointSize;
 *     VkBool32 shaderImageGatherExtended;
 *     VkBool32 shaderStorageImageExtendedFormats;
 *     VkBool32 shaderStorageImageMultisample;
 *     VkBool32 shaderStorageImageReadWithoutFormat;
 *     VkBool32 shaderStorageImageWriteWithoutFormat;
 *     VkBool32 shaderUniformBufferArrayDynamicIndexing;
 *     VkBool32 shaderSampledImageArrayDynamicIndexing;
 *     VkBool32 shaderStorageBufferArrayDynamicIndexing;
 *     VkBool32 shaderStorageImageArrayDynamicIndexing;
 *     VkBool32 shaderClipDistance;
 *     VkBool32 shaderCullDistance;
 *     VkBool32 shaderFloat64;
 *     VkBool32 shaderInt64;
 *     VkBool32 shaderInt16;
 *     VkBool32 shaderResourceResidency;
 *     VkBool32 shaderResourceMinLod;
 *     VkBool32 sparseBinding;
 *     VkBool32 sparseResidencyBuffer;
 *     VkBool32 sparseResidencyImage2D;
 *     VkBool32 sparseResidencyImage3D;
 *     VkBool32 sparseResidency2Samples;
 *     VkBool32 sparseResidency4Samples;
 *     VkBool32 sparseResidency8Samples;
 *     VkBool32 sparseResidency16Samples;
 *     VkBool32 sparseResidencyAliased;
 *     VkBool32 variableMultisampleRate;
 *     VkBool32 inheritedQueries;
 * }</pre></code>
 */
public class VkPhysicalDeviceFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ROBUSTBUFFERACCESS,
        FULLDRAWINDEXUINT32,
        IMAGECUBEARRAY,
        INDEPENDENTBLEND,
        GEOMETRYSHADER,
        TESSELLATIONSHADER,
        SAMPLERATESHADING,
        DUALSRCBLEND,
        LOGICOP,
        MULTIDRAWINDIRECT,
        DRAWINDIRECTFIRSTINSTANCE,
        DEPTHCLAMP,
        DEPTHBIASCLAMP,
        FILLMODENONSOLID,
        DEPTHBOUNDS,
        WIDELINES,
        LARGEPOINTS,
        ALPHATOONE,
        MULTIVIEWPORT,
        SAMPLERANISOTROPY,
        TEXTURECOMPRESSIONETC2,
        TEXTURECOMPRESSIONASTC_LDR,
        TEXTURECOMPRESSIONBC,
        OCCLUSIONQUERYPRECISE,
        PIPELINESTATISTICSQUERY,
        VERTEXPIPELINESTORESANDATOMICS,
        FRAGMENTSTORESANDATOMICS,
        SHADERTESSELLATIONANDGEOMETRYPOINTSIZE,
        SHADERIMAGEGATHEREXTENDED,
        SHADERSTORAGEIMAGEEXTENDEDFORMATS,
        SHADERSTORAGEIMAGEMULTISAMPLE,
        SHADERSTORAGEIMAGEREADWITHOUTFORMAT,
        SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT,
        SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING,
        SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING,
        SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING,
        SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING,
        SHADERCLIPDISTANCE,
        SHADERCULLDISTANCE,
        SHADERFLOAT64,
        SHADERINT64,
        SHADERINT16,
        SHADERRESOURCERESIDENCY,
        SHADERRESOURCEMINLOD,
        SPARSEBINDING,
        SPARSERESIDENCYBUFFER,
        SPARSERESIDENCYIMAGE2D,
        SPARSERESIDENCYIMAGE3D,
        SPARSERESIDENCY2SAMPLES,
        SPARSERESIDENCY4SAMPLES,
        SPARSERESIDENCY8SAMPLES,
        SPARSERESIDENCY16SAMPLES,
        SPARSERESIDENCYALIASED,
        VARIABLEMULTISAMPLERATE,
        INHERITEDQUERIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ROBUSTBUFFERACCESS = layout.offsetof(0);
        FULLDRAWINDEXUINT32 = layout.offsetof(1);
        IMAGECUBEARRAY = layout.offsetof(2);
        INDEPENDENTBLEND = layout.offsetof(3);
        GEOMETRYSHADER = layout.offsetof(4);
        TESSELLATIONSHADER = layout.offsetof(5);
        SAMPLERATESHADING = layout.offsetof(6);
        DUALSRCBLEND = layout.offsetof(7);
        LOGICOP = layout.offsetof(8);
        MULTIDRAWINDIRECT = layout.offsetof(9);
        DRAWINDIRECTFIRSTINSTANCE = layout.offsetof(10);
        DEPTHCLAMP = layout.offsetof(11);
        DEPTHBIASCLAMP = layout.offsetof(12);
        FILLMODENONSOLID = layout.offsetof(13);
        DEPTHBOUNDS = layout.offsetof(14);
        WIDELINES = layout.offsetof(15);
        LARGEPOINTS = layout.offsetof(16);
        ALPHATOONE = layout.offsetof(17);
        MULTIVIEWPORT = layout.offsetof(18);
        SAMPLERANISOTROPY = layout.offsetof(19);
        TEXTURECOMPRESSIONETC2 = layout.offsetof(20);
        TEXTURECOMPRESSIONASTC_LDR = layout.offsetof(21);
        TEXTURECOMPRESSIONBC = layout.offsetof(22);
        OCCLUSIONQUERYPRECISE = layout.offsetof(23);
        PIPELINESTATISTICSQUERY = layout.offsetof(24);
        VERTEXPIPELINESTORESANDATOMICS = layout.offsetof(25);
        FRAGMENTSTORESANDATOMICS = layout.offsetof(26);
        SHADERTESSELLATIONANDGEOMETRYPOINTSIZE = layout.offsetof(27);
        SHADERIMAGEGATHEREXTENDED = layout.offsetof(28);
        SHADERSTORAGEIMAGEEXTENDEDFORMATS = layout.offsetof(29);
        SHADERSTORAGEIMAGEMULTISAMPLE = layout.offsetof(30);
        SHADERSTORAGEIMAGEREADWITHOUTFORMAT = layout.offsetof(31);
        SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT = layout.offsetof(32);
        SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING = layout.offsetof(33);
        SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING = layout.offsetof(34);
        SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING = layout.offsetof(35);
        SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING = layout.offsetof(36);
        SHADERCLIPDISTANCE = layout.offsetof(37);
        SHADERCULLDISTANCE = layout.offsetof(38);
        SHADERFLOAT64 = layout.offsetof(39);
        SHADERINT64 = layout.offsetof(40);
        SHADERINT16 = layout.offsetof(41);
        SHADERRESOURCERESIDENCY = layout.offsetof(42);
        SHADERRESOURCEMINLOD = layout.offsetof(43);
        SPARSEBINDING = layout.offsetof(44);
        SPARSERESIDENCYBUFFER = layout.offsetof(45);
        SPARSERESIDENCYIMAGE2D = layout.offsetof(46);
        SPARSERESIDENCYIMAGE3D = layout.offsetof(47);
        SPARSERESIDENCY2SAMPLES = layout.offsetof(48);
        SPARSERESIDENCY4SAMPLES = layout.offsetof(49);
        SPARSERESIDENCY8SAMPLES = layout.offsetof(50);
        SPARSERESIDENCY16SAMPLES = layout.offsetof(51);
        SPARSERESIDENCYALIASED = layout.offsetof(52);
        VARIABLEMULTISAMPLERATE = layout.offsetof(53);
        INHERITEDQUERIES = layout.offsetof(54);
    }

    VkPhysicalDeviceFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFeatures(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code robustBufferAccess} field. */
    @NativeType("VkBool32")
    public boolean robustBufferAccess() { return nrobustBufferAccess(address()) != 0; }
    /** Returns the value of the {@code fullDrawIndexUint32} field. */
    @NativeType("VkBool32")
    public boolean fullDrawIndexUint32() { return nfullDrawIndexUint32(address()) != 0; }
    /** Returns the value of the {@code imageCubeArray} field. */
    @NativeType("VkBool32")
    public boolean imageCubeArray() { return nimageCubeArray(address()) != 0; }
    /** Returns the value of the {@code independentBlend} field. */
    @NativeType("VkBool32")
    public boolean independentBlend() { return nindependentBlend(address()) != 0; }
    /** Returns the value of the {@code geometryShader} field. */
    @NativeType("VkBool32")
    public boolean geometryShader() { return ngeometryShader(address()) != 0; }
    /** Returns the value of the {@code tessellationShader} field. */
    @NativeType("VkBool32")
    public boolean tessellationShader() { return ntessellationShader(address()) != 0; }
    /** Returns the value of the {@code sampleRateShading} field. */
    @NativeType("VkBool32")
    public boolean sampleRateShading() { return nsampleRateShading(address()) != 0; }
    /** Returns the value of the {@code dualSrcBlend} field. */
    @NativeType("VkBool32")
    public boolean dualSrcBlend() { return ndualSrcBlend(address()) != 0; }
    /** Returns the value of the {@code logicOp} field. */
    @NativeType("VkBool32")
    public boolean logicOp() { return nlogicOp(address()) != 0; }
    /** Returns the value of the {@code multiDrawIndirect} field. */
    @NativeType("VkBool32")
    public boolean multiDrawIndirect() { return nmultiDrawIndirect(address()) != 0; }
    /** Returns the value of the {@code drawIndirectFirstInstance} field. */
    @NativeType("VkBool32")
    public boolean drawIndirectFirstInstance() { return ndrawIndirectFirstInstance(address()) != 0; }
    /** Returns the value of the {@code depthClamp} field. */
    @NativeType("VkBool32")
    public boolean depthClamp() { return ndepthClamp(address()) != 0; }
    /** Returns the value of the {@code depthBiasClamp} field. */
    @NativeType("VkBool32")
    public boolean depthBiasClamp() { return ndepthBiasClamp(address()) != 0; }
    /** Returns the value of the {@code fillModeNonSolid} field. */
    @NativeType("VkBool32")
    public boolean fillModeNonSolid() { return nfillModeNonSolid(address()) != 0; }
    /** Returns the value of the {@code depthBounds} field. */
    @NativeType("VkBool32")
    public boolean depthBounds() { return ndepthBounds(address()) != 0; }
    /** Returns the value of the {@code wideLines} field. */
    @NativeType("VkBool32")
    public boolean wideLines() { return nwideLines(address()) != 0; }
    /** Returns the value of the {@code largePoints} field. */
    @NativeType("VkBool32")
    public boolean largePoints() { return nlargePoints(address()) != 0; }
    /** Returns the value of the {@code alphaToOne} field. */
    @NativeType("VkBool32")
    public boolean alphaToOne() { return nalphaToOne(address()) != 0; }
    /** Returns the value of the {@code multiViewport} field. */
    @NativeType("VkBool32")
    public boolean multiViewport() { return nmultiViewport(address()) != 0; }
    /** Returns the value of the {@code samplerAnisotropy} field. */
    @NativeType("VkBool32")
    public boolean samplerAnisotropy() { return nsamplerAnisotropy(address()) != 0; }
    /** Returns the value of the {@code textureCompressionETC2} field. */
    @NativeType("VkBool32")
    public boolean textureCompressionETC2() { return ntextureCompressionETC2(address()) != 0; }
    /** Returns the value of the {@code textureCompressionASTC_LDR} field. */
    @NativeType("VkBool32")
    public boolean textureCompressionASTC_LDR() { return ntextureCompressionASTC_LDR(address()) != 0; }
    /** Returns the value of the {@code textureCompressionBC} field. */
    @NativeType("VkBool32")
    public boolean textureCompressionBC() { return ntextureCompressionBC(address()) != 0; }
    /** Returns the value of the {@code occlusionQueryPrecise} field. */
    @NativeType("VkBool32")
    public boolean occlusionQueryPrecise() { return nocclusionQueryPrecise(address()) != 0; }
    /** Returns the value of the {@code pipelineStatisticsQuery} field. */
    @NativeType("VkBool32")
    public boolean pipelineStatisticsQuery() { return npipelineStatisticsQuery(address()) != 0; }
    /** Returns the value of the {@code vertexPipelineStoresAndAtomics} field. */
    @NativeType("VkBool32")
    public boolean vertexPipelineStoresAndAtomics() { return nvertexPipelineStoresAndAtomics(address()) != 0; }
    /** Returns the value of the {@code fragmentStoresAndAtomics} field. */
    @NativeType("VkBool32")
    public boolean fragmentStoresAndAtomics() { return nfragmentStoresAndAtomics(address()) != 0; }
    /** Returns the value of the {@code shaderTessellationAndGeometryPointSize} field. */
    @NativeType("VkBool32")
    public boolean shaderTessellationAndGeometryPointSize() { return nshaderTessellationAndGeometryPointSize(address()) != 0; }
    /** Returns the value of the {@code shaderImageGatherExtended} field. */
    @NativeType("VkBool32")
    public boolean shaderImageGatherExtended() { return nshaderImageGatherExtended(address()) != 0; }
    /** Returns the value of the {@code shaderStorageImageExtendedFormats} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageExtendedFormats() { return nshaderStorageImageExtendedFormats(address()) != 0; }
    /** Returns the value of the {@code shaderStorageImageMultisample} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageMultisample() { return nshaderStorageImageMultisample(address()) != 0; }
    /** Returns the value of the {@code shaderStorageImageReadWithoutFormat} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageReadWithoutFormat() { return nshaderStorageImageReadWithoutFormat(address()) != 0; }
    /** Returns the value of the {@code shaderStorageImageWriteWithoutFormat} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageWriteWithoutFormat() { return nshaderStorageImageWriteWithoutFormat(address()) != 0; }
    /** Returns the value of the {@code shaderUniformBufferArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderUniformBufferArrayDynamicIndexing() { return nshaderUniformBufferArrayDynamicIndexing(address()) != 0; }
    /** Returns the value of the {@code shaderSampledImageArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderSampledImageArrayDynamicIndexing() { return nshaderSampledImageArrayDynamicIndexing(address()) != 0; }
    /** Returns the value of the {@code shaderStorageBufferArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageBufferArrayDynamicIndexing() { return nshaderStorageBufferArrayDynamicIndexing(address()) != 0; }
    /** Returns the value of the {@code shaderStorageImageArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageArrayDynamicIndexing() { return nshaderStorageImageArrayDynamicIndexing(address()) != 0; }
    /** Returns the value of the {@code shaderClipDistance} field. */
    @NativeType("VkBool32")
    public boolean shaderClipDistance() { return nshaderClipDistance(address()) != 0; }
    /** Returns the value of the {@code shaderCullDistance} field. */
    @NativeType("VkBool32")
    public boolean shaderCullDistance() { return nshaderCullDistance(address()) != 0; }
    /** Returns the value of the {@code shaderFloat64} field. */
    @NativeType("VkBool32")
    public boolean shaderFloat64() { return nshaderFloat64(address()) != 0; }
    /** Returns the value of the {@code shaderInt64} field. */
    @NativeType("VkBool32")
    public boolean shaderInt64() { return nshaderInt64(address()) != 0; }
    /** Returns the value of the {@code shaderInt16} field. */
    @NativeType("VkBool32")
    public boolean shaderInt16() { return nshaderInt16(address()) != 0; }
    /** Returns the value of the {@code shaderResourceResidency} field. */
    @NativeType("VkBool32")
    public boolean shaderResourceResidency() { return nshaderResourceResidency(address()) != 0; }
    /** Returns the value of the {@code shaderResourceMinLod} field. */
    @NativeType("VkBool32")
    public boolean shaderResourceMinLod() { return nshaderResourceMinLod(address()) != 0; }
    /** Returns the value of the {@code sparseBinding} field. */
    @NativeType("VkBool32")
    public boolean sparseBinding() { return nsparseBinding(address()) != 0; }
    /** Returns the value of the {@code sparseResidencyBuffer} field. */
    @NativeType("VkBool32")
    public boolean sparseResidencyBuffer() { return nsparseResidencyBuffer(address()) != 0; }
    /** Returns the value of the {@code sparseResidencyImage2D} field. */
    @NativeType("VkBool32")
    public boolean sparseResidencyImage2D() { return nsparseResidencyImage2D(address()) != 0; }
    /** Returns the value of the {@code sparseResidencyImage3D} field. */
    @NativeType("VkBool32")
    public boolean sparseResidencyImage3D() { return nsparseResidencyImage3D(address()) != 0; }
    /** Returns the value of the {@code sparseResidency2Samples} field. */
    @NativeType("VkBool32")
    public boolean sparseResidency2Samples() { return nsparseResidency2Samples(address()) != 0; }
    /** Returns the value of the {@code sparseResidency4Samples} field. */
    @NativeType("VkBool32")
    public boolean sparseResidency4Samples() { return nsparseResidency4Samples(address()) != 0; }
    /** Returns the value of the {@code sparseResidency8Samples} field. */
    @NativeType("VkBool32")
    public boolean sparseResidency8Samples() { return nsparseResidency8Samples(address()) != 0; }
    /** Returns the value of the {@code sparseResidency16Samples} field. */
    @NativeType("VkBool32")
    public boolean sparseResidency16Samples() { return nsparseResidency16Samples(address()) != 0; }
    /** Returns the value of the {@code sparseResidencyAliased} field. */
    @NativeType("VkBool32")
    public boolean sparseResidencyAliased() { return nsparseResidencyAliased(address()) != 0; }
    /** Returns the value of the {@code variableMultisampleRate} field. */
    @NativeType("VkBool32")
    public boolean variableMultisampleRate() { return nvariableMultisampleRate(address()) != 0; }
    /** Returns the value of the {@code inheritedQueries} field. */
    @NativeType("VkBool32")
    public boolean inheritedQueries() { return ninheritedQueries(address()) != 0; }

    /** Sets the specified value to the {@code robustBufferAccess} field. */
    public VkPhysicalDeviceFeatures robustBufferAccess(@NativeType("VkBool32") boolean value) { nrobustBufferAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code fullDrawIndexUint32} field. */
    public VkPhysicalDeviceFeatures fullDrawIndexUint32(@NativeType("VkBool32") boolean value) { nfullDrawIndexUint32(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code imageCubeArray} field. */
    public VkPhysicalDeviceFeatures imageCubeArray(@NativeType("VkBool32") boolean value) { nimageCubeArray(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code independentBlend} field. */
    public VkPhysicalDeviceFeatures independentBlend(@NativeType("VkBool32") boolean value) { nindependentBlend(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code geometryShader} field. */
    public VkPhysicalDeviceFeatures geometryShader(@NativeType("VkBool32") boolean value) { ngeometryShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tessellationShader} field. */
    public VkPhysicalDeviceFeatures tessellationShader(@NativeType("VkBool32") boolean value) { ntessellationShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sampleRateShading} field. */
    public VkPhysicalDeviceFeatures sampleRateShading(@NativeType("VkBool32") boolean value) { nsampleRateShading(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dualSrcBlend} field. */
    public VkPhysicalDeviceFeatures dualSrcBlend(@NativeType("VkBool32") boolean value) { ndualSrcBlend(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code logicOp} field. */
    public VkPhysicalDeviceFeatures logicOp(@NativeType("VkBool32") boolean value) { nlogicOp(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multiDrawIndirect} field. */
    public VkPhysicalDeviceFeatures multiDrawIndirect(@NativeType("VkBool32") boolean value) { nmultiDrawIndirect(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code drawIndirectFirstInstance} field. */
    public VkPhysicalDeviceFeatures drawIndirectFirstInstance(@NativeType("VkBool32") boolean value) { ndrawIndirectFirstInstance(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code depthClamp} field. */
    public VkPhysicalDeviceFeatures depthClamp(@NativeType("VkBool32") boolean value) { ndepthClamp(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code depthBiasClamp} field. */
    public VkPhysicalDeviceFeatures depthBiasClamp(@NativeType("VkBool32") boolean value) { ndepthBiasClamp(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code fillModeNonSolid} field. */
    public VkPhysicalDeviceFeatures fillModeNonSolid(@NativeType("VkBool32") boolean value) { nfillModeNonSolid(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code depthBounds} field. */
    public VkPhysicalDeviceFeatures depthBounds(@NativeType("VkBool32") boolean value) { ndepthBounds(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code wideLines} field. */
    public VkPhysicalDeviceFeatures wideLines(@NativeType("VkBool32") boolean value) { nwideLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code largePoints} field. */
    public VkPhysicalDeviceFeatures largePoints(@NativeType("VkBool32") boolean value) { nlargePoints(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code alphaToOne} field. */
    public VkPhysicalDeviceFeatures alphaToOne(@NativeType("VkBool32") boolean value) { nalphaToOne(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multiViewport} field. */
    public VkPhysicalDeviceFeatures multiViewport(@NativeType("VkBool32") boolean value) { nmultiViewport(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code samplerAnisotropy} field. */
    public VkPhysicalDeviceFeatures samplerAnisotropy(@NativeType("VkBool32") boolean value) { nsamplerAnisotropy(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code textureCompressionETC2} field. */
    public VkPhysicalDeviceFeatures textureCompressionETC2(@NativeType("VkBool32") boolean value) { ntextureCompressionETC2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code textureCompressionASTC_LDR} field. */
    public VkPhysicalDeviceFeatures textureCompressionASTC_LDR(@NativeType("VkBool32") boolean value) { ntextureCompressionASTC_LDR(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code textureCompressionBC} field. */
    public VkPhysicalDeviceFeatures textureCompressionBC(@NativeType("VkBool32") boolean value) { ntextureCompressionBC(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code occlusionQueryPrecise} field. */
    public VkPhysicalDeviceFeatures occlusionQueryPrecise(@NativeType("VkBool32") boolean value) { nocclusionQueryPrecise(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pipelineStatisticsQuery} field. */
    public VkPhysicalDeviceFeatures pipelineStatisticsQuery(@NativeType("VkBool32") boolean value) { npipelineStatisticsQuery(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vertexPipelineStoresAndAtomics} field. */
    public VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomics(@NativeType("VkBool32") boolean value) { nvertexPipelineStoresAndAtomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code fragmentStoresAndAtomics} field. */
    public VkPhysicalDeviceFeatures fragmentStoresAndAtomics(@NativeType("VkBool32") boolean value) { nfragmentStoresAndAtomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderTessellationAndGeometryPointSize} field. */
    public VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSize(@NativeType("VkBool32") boolean value) { nshaderTessellationAndGeometryPointSize(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderImageGatherExtended} field. */
    public VkPhysicalDeviceFeatures shaderImageGatherExtended(@NativeType("VkBool32") boolean value) { nshaderImageGatherExtended(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageImageExtendedFormats} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageExtendedFormats(@NativeType("VkBool32") boolean value) { nshaderStorageImageExtendedFormats(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageImageMultisample} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageMultisample(@NativeType("VkBool32") boolean value) { nshaderStorageImageMultisample(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageImageReadWithoutFormat} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormat(@NativeType("VkBool32") boolean value) { nshaderStorageImageReadWithoutFormat(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageImageWriteWithoutFormat} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormat(@NativeType("VkBool32") boolean value) { nshaderStorageImageWriteWithoutFormat(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderUniformBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSampledImageArrayDynamicIndexing} field. */
    public VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderSampledImageArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageImageArrayDynamicIndexing} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageImageArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderClipDistance} field. */
    public VkPhysicalDeviceFeatures shaderClipDistance(@NativeType("VkBool32") boolean value) { nshaderClipDistance(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderCullDistance} field. */
    public VkPhysicalDeviceFeatures shaderCullDistance(@NativeType("VkBool32") boolean value) { nshaderCullDistance(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderFloat64} field. */
    public VkPhysicalDeviceFeatures shaderFloat64(@NativeType("VkBool32") boolean value) { nshaderFloat64(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderInt64} field. */
    public VkPhysicalDeviceFeatures shaderInt64(@NativeType("VkBool32") boolean value) { nshaderInt64(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderInt16} field. */
    public VkPhysicalDeviceFeatures shaderInt16(@NativeType("VkBool32") boolean value) { nshaderInt16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderResourceResidency} field. */
    public VkPhysicalDeviceFeatures shaderResourceResidency(@NativeType("VkBool32") boolean value) { nshaderResourceResidency(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderResourceMinLod} field. */
    public VkPhysicalDeviceFeatures shaderResourceMinLod(@NativeType("VkBool32") boolean value) { nshaderResourceMinLod(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseBinding} field. */
    public VkPhysicalDeviceFeatures sparseBinding(@NativeType("VkBool32") boolean value) { nsparseBinding(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidencyBuffer} field. */
    public VkPhysicalDeviceFeatures sparseResidencyBuffer(@NativeType("VkBool32") boolean value) { nsparseResidencyBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidencyImage2D} field. */
    public VkPhysicalDeviceFeatures sparseResidencyImage2D(@NativeType("VkBool32") boolean value) { nsparseResidencyImage2D(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidencyImage3D} field. */
    public VkPhysicalDeviceFeatures sparseResidencyImage3D(@NativeType("VkBool32") boolean value) { nsparseResidencyImage3D(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidency2Samples} field. */
    public VkPhysicalDeviceFeatures sparseResidency2Samples(@NativeType("VkBool32") boolean value) { nsparseResidency2Samples(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidency4Samples} field. */
    public VkPhysicalDeviceFeatures sparseResidency4Samples(@NativeType("VkBool32") boolean value) { nsparseResidency4Samples(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidency8Samples} field. */
    public VkPhysicalDeviceFeatures sparseResidency8Samples(@NativeType("VkBool32") boolean value) { nsparseResidency8Samples(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidency16Samples} field. */
    public VkPhysicalDeviceFeatures sparseResidency16Samples(@NativeType("VkBool32") boolean value) { nsparseResidency16Samples(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidencyAliased} field. */
    public VkPhysicalDeviceFeatures sparseResidencyAliased(@NativeType("VkBool32") boolean value) { nsparseResidencyAliased(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code variableMultisampleRate} field. */
    public VkPhysicalDeviceFeatures variableMultisampleRate(@NativeType("VkBool32") boolean value) { nvariableMultisampleRate(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code inheritedQueries} field. */
    public VkPhysicalDeviceFeatures inheritedQueries(@NativeType("VkBool32") boolean value) { ninheritedQueries(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFeatures set(
        boolean robustBufferAccess,
        boolean fullDrawIndexUint32,
        boolean imageCubeArray,
        boolean independentBlend,
        boolean geometryShader,
        boolean tessellationShader,
        boolean sampleRateShading,
        boolean dualSrcBlend,
        boolean logicOp,
        boolean multiDrawIndirect,
        boolean drawIndirectFirstInstance,
        boolean depthClamp,
        boolean depthBiasClamp,
        boolean fillModeNonSolid,
        boolean depthBounds,
        boolean wideLines,
        boolean largePoints,
        boolean alphaToOne,
        boolean multiViewport,
        boolean samplerAnisotropy,
        boolean textureCompressionETC2,
        boolean textureCompressionASTC_LDR,
        boolean textureCompressionBC,
        boolean occlusionQueryPrecise,
        boolean pipelineStatisticsQuery,
        boolean vertexPipelineStoresAndAtomics,
        boolean fragmentStoresAndAtomics,
        boolean shaderTessellationAndGeometryPointSize,
        boolean shaderImageGatherExtended,
        boolean shaderStorageImageExtendedFormats,
        boolean shaderStorageImageMultisample,
        boolean shaderStorageImageReadWithoutFormat,
        boolean shaderStorageImageWriteWithoutFormat,
        boolean shaderUniformBufferArrayDynamicIndexing,
        boolean shaderSampledImageArrayDynamicIndexing,
        boolean shaderStorageBufferArrayDynamicIndexing,
        boolean shaderStorageImageArrayDynamicIndexing,
        boolean shaderClipDistance,
        boolean shaderCullDistance,
        boolean shaderFloat64,
        boolean shaderInt64,
        boolean shaderInt16,
        boolean shaderResourceResidency,
        boolean shaderResourceMinLod,
        boolean sparseBinding,
        boolean sparseResidencyBuffer,
        boolean sparseResidencyImage2D,
        boolean sparseResidencyImage3D,
        boolean sparseResidency2Samples,
        boolean sparseResidency4Samples,
        boolean sparseResidency8Samples,
        boolean sparseResidency16Samples,
        boolean sparseResidencyAliased,
        boolean variableMultisampleRate,
        boolean inheritedQueries
    ) {
        robustBufferAccess(robustBufferAccess);
        fullDrawIndexUint32(fullDrawIndexUint32);
        imageCubeArray(imageCubeArray);
        independentBlend(independentBlend);
        geometryShader(geometryShader);
        tessellationShader(tessellationShader);
        sampleRateShading(sampleRateShading);
        dualSrcBlend(dualSrcBlend);
        logicOp(logicOp);
        multiDrawIndirect(multiDrawIndirect);
        drawIndirectFirstInstance(drawIndirectFirstInstance);
        depthClamp(depthClamp);
        depthBiasClamp(depthBiasClamp);
        fillModeNonSolid(fillModeNonSolid);
        depthBounds(depthBounds);
        wideLines(wideLines);
        largePoints(largePoints);
        alphaToOne(alphaToOne);
        multiViewport(multiViewport);
        samplerAnisotropy(samplerAnisotropy);
        textureCompressionETC2(textureCompressionETC2);
        textureCompressionASTC_LDR(textureCompressionASTC_LDR);
        textureCompressionBC(textureCompressionBC);
        occlusionQueryPrecise(occlusionQueryPrecise);
        pipelineStatisticsQuery(pipelineStatisticsQuery);
        vertexPipelineStoresAndAtomics(vertexPipelineStoresAndAtomics);
        fragmentStoresAndAtomics(fragmentStoresAndAtomics);
        shaderTessellationAndGeometryPointSize(shaderTessellationAndGeometryPointSize);
        shaderImageGatherExtended(shaderImageGatherExtended);
        shaderStorageImageExtendedFormats(shaderStorageImageExtendedFormats);
        shaderStorageImageMultisample(shaderStorageImageMultisample);
        shaderStorageImageReadWithoutFormat(shaderStorageImageReadWithoutFormat);
        shaderStorageImageWriteWithoutFormat(shaderStorageImageWriteWithoutFormat);
        shaderUniformBufferArrayDynamicIndexing(shaderUniformBufferArrayDynamicIndexing);
        shaderSampledImageArrayDynamicIndexing(shaderSampledImageArrayDynamicIndexing);
        shaderStorageBufferArrayDynamicIndexing(shaderStorageBufferArrayDynamicIndexing);
        shaderStorageImageArrayDynamicIndexing(shaderStorageImageArrayDynamicIndexing);
        shaderClipDistance(shaderClipDistance);
        shaderCullDistance(shaderCullDistance);
        shaderFloat64(shaderFloat64);
        shaderInt64(shaderInt64);
        shaderInt16(shaderInt16);
        shaderResourceResidency(shaderResourceResidency);
        shaderResourceMinLod(shaderResourceMinLod);
        sparseBinding(sparseBinding);
        sparseResidencyBuffer(sparseResidencyBuffer);
        sparseResidencyImage2D(sparseResidencyImage2D);
        sparseResidencyImage3D(sparseResidencyImage3D);
        sparseResidency2Samples(sparseResidency2Samples);
        sparseResidency4Samples(sparseResidency4Samples);
        sparseResidency8Samples(sparseResidency8Samples);
        sparseResidency16Samples(sparseResidency16Samples);
        sparseResidencyAliased(sparseResidencyAliased);
        variableMultisampleRate(variableMultisampleRate);
        inheritedQueries(inheritedQueries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFeatures set(VkPhysicalDeviceFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFeatures malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFeatures calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFeatures create() {
        return new VkPhysicalDeviceFeatures(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceFeatures create(long address) {
        return new VkPhysicalDeviceFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFeatures createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceFeatures} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceFeatures mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceFeatures} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceFeatures callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #robustBufferAccess}. */
    public static int nrobustBufferAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.ROBUSTBUFFERACCESS); }
    /** Unsafe version of {@link #fullDrawIndexUint32}. */
    public static int nfullDrawIndexUint32(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.FULLDRAWINDEXUINT32); }
    /** Unsafe version of {@link #imageCubeArray}. */
    public static int nimageCubeArray(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.IMAGECUBEARRAY); }
    /** Unsafe version of {@link #independentBlend}. */
    public static int nindependentBlend(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.INDEPENDENTBLEND); }
    /** Unsafe version of {@link #geometryShader}. */
    public static int ngeometryShader(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.GEOMETRYSHADER); }
    /** Unsafe version of {@link #tessellationShader}. */
    public static int ntessellationShader(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.TESSELLATIONSHADER); }
    /** Unsafe version of {@link #sampleRateShading}. */
    public static int nsampleRateShading(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SAMPLERATESHADING); }
    /** Unsafe version of {@link #dualSrcBlend}. */
    public static int ndualSrcBlend(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DUALSRCBLEND); }
    /** Unsafe version of {@link #logicOp}. */
    public static int nlogicOp(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.LOGICOP); }
    /** Unsafe version of {@link #multiDrawIndirect}. */
    public static int nmultiDrawIndirect(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.MULTIDRAWINDIRECT); }
    /** Unsafe version of {@link #drawIndirectFirstInstance}. */
    public static int ndrawIndirectFirstInstance(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DRAWINDIRECTFIRSTINSTANCE); }
    /** Unsafe version of {@link #depthClamp}. */
    public static int ndepthClamp(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DEPTHCLAMP); }
    /** Unsafe version of {@link #depthBiasClamp}. */
    public static int ndepthBiasClamp(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DEPTHBIASCLAMP); }
    /** Unsafe version of {@link #fillModeNonSolid}. */
    public static int nfillModeNonSolid(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.FILLMODENONSOLID); }
    /** Unsafe version of {@link #depthBounds}. */
    public static int ndepthBounds(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DEPTHBOUNDS); }
    /** Unsafe version of {@link #wideLines}. */
    public static int nwideLines(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.WIDELINES); }
    /** Unsafe version of {@link #largePoints}. */
    public static int nlargePoints(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.LARGEPOINTS); }
    /** Unsafe version of {@link #alphaToOne}. */
    public static int nalphaToOne(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.ALPHATOONE); }
    /** Unsafe version of {@link #multiViewport}. */
    public static int nmultiViewport(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.MULTIVIEWPORT); }
    /** Unsafe version of {@link #samplerAnisotropy}. */
    public static int nsamplerAnisotropy(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SAMPLERANISOTROPY); }
    /** Unsafe version of {@link #textureCompressionETC2}. */
    public static int ntextureCompressionETC2(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONETC2); }
    /** Unsafe version of {@link #textureCompressionASTC_LDR}. */
    public static int ntextureCompressionASTC_LDR(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONASTC_LDR); }
    /** Unsafe version of {@link #textureCompressionBC}. */
    public static int ntextureCompressionBC(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONBC); }
    /** Unsafe version of {@link #occlusionQueryPrecise}. */
    public static int nocclusionQueryPrecise(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.OCCLUSIONQUERYPRECISE); }
    /** Unsafe version of {@link #pipelineStatisticsQuery}. */
    public static int npipelineStatisticsQuery(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.PIPELINESTATISTICSQUERY); }
    /** Unsafe version of {@link #vertexPipelineStoresAndAtomics}. */
    public static int nvertexPipelineStoresAndAtomics(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.VERTEXPIPELINESTORESANDATOMICS); }
    /** Unsafe version of {@link #fragmentStoresAndAtomics}. */
    public static int nfragmentStoresAndAtomics(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.FRAGMENTSTORESANDATOMICS); }
    /** Unsafe version of {@link #shaderTessellationAndGeometryPointSize}. */
    public static int nshaderTessellationAndGeometryPointSize(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERTESSELLATIONANDGEOMETRYPOINTSIZE); }
    /** Unsafe version of {@link #shaderImageGatherExtended}. */
    public static int nshaderImageGatherExtended(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERIMAGEGATHEREXTENDED); }
    /** Unsafe version of {@link #shaderStorageImageExtendedFormats}. */
    public static int nshaderStorageImageExtendedFormats(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEEXTENDEDFORMATS); }
    /** Unsafe version of {@link #shaderStorageImageMultisample}. */
    public static int nshaderStorageImageMultisample(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEMULTISAMPLE); }
    /** Unsafe version of {@link #shaderStorageImageReadWithoutFormat}. */
    public static int nshaderStorageImageReadWithoutFormat(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEREADWITHOUTFORMAT); }
    /** Unsafe version of {@link #shaderStorageImageWriteWithoutFormat}. */
    public static int nshaderStorageImageWriteWithoutFormat(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT); }
    /** Unsafe version of {@link #shaderUniformBufferArrayDynamicIndexing}. */
    public static int nshaderUniformBufferArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderSampledImageArrayDynamicIndexing}. */
    public static int nshaderSampledImageArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderStorageBufferArrayDynamicIndexing}. */
    public static int nshaderStorageBufferArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderStorageImageArrayDynamicIndexing}. */
    public static int nshaderStorageImageArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderClipDistance}. */
    public static int nshaderClipDistance(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERCLIPDISTANCE); }
    /** Unsafe version of {@link #shaderCullDistance}. */
    public static int nshaderCullDistance(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERCULLDISTANCE); }
    /** Unsafe version of {@link #shaderFloat64}. */
    public static int nshaderFloat64(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERFLOAT64); }
    /** Unsafe version of {@link #shaderInt64}. */
    public static int nshaderInt64(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERINT64); }
    /** Unsafe version of {@link #shaderInt16}. */
    public static int nshaderInt16(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERINT16); }
    /** Unsafe version of {@link #shaderResourceResidency}. */
    public static int nshaderResourceResidency(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERRESOURCERESIDENCY); }
    /** Unsafe version of {@link #shaderResourceMinLod}. */
    public static int nshaderResourceMinLod(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERRESOURCEMINLOD); }
    /** Unsafe version of {@link #sparseBinding}. */
    public static int nsparseBinding(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSEBINDING); }
    /** Unsafe version of {@link #sparseResidencyBuffer}. */
    public static int nsparseResidencyBuffer(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYBUFFER); }
    /** Unsafe version of {@link #sparseResidencyImage2D}. */
    public static int nsparseResidencyImage2D(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE2D); }
    /** Unsafe version of {@link #sparseResidencyImage3D}. */
    public static int nsparseResidencyImage3D(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE3D); }
    /** Unsafe version of {@link #sparseResidency2Samples}. */
    public static int nsparseResidency2Samples(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY2SAMPLES); }
    /** Unsafe version of {@link #sparseResidency4Samples}. */
    public static int nsparseResidency4Samples(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY4SAMPLES); }
    /** Unsafe version of {@link #sparseResidency8Samples}. */
    public static int nsparseResidency8Samples(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY8SAMPLES); }
    /** Unsafe version of {@link #sparseResidency16Samples}. */
    public static int nsparseResidency16Samples(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY16SAMPLES); }
    /** Unsafe version of {@link #sparseResidencyAliased}. */
    public static int nsparseResidencyAliased(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYALIASED); }
    /** Unsafe version of {@link #variableMultisampleRate}. */
    public static int nvariableMultisampleRate(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.VARIABLEMULTISAMPLERATE); }
    /** Unsafe version of {@link #inheritedQueries}. */
    public static int ninheritedQueries(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.INHERITEDQUERIES); }

    /** Unsafe version of {@link #robustBufferAccess(boolean) robustBufferAccess}. */
    public static void nrobustBufferAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.ROBUSTBUFFERACCESS, value); }
    /** Unsafe version of {@link #fullDrawIndexUint32(boolean) fullDrawIndexUint32}. */
    public static void nfullDrawIndexUint32(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.FULLDRAWINDEXUINT32, value); }
    /** Unsafe version of {@link #imageCubeArray(boolean) imageCubeArray}. */
    public static void nimageCubeArray(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.IMAGECUBEARRAY, value); }
    /** Unsafe version of {@link #independentBlend(boolean) independentBlend}. */
    public static void nindependentBlend(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.INDEPENDENTBLEND, value); }
    /** Unsafe version of {@link #geometryShader(boolean) geometryShader}. */
    public static void ngeometryShader(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.GEOMETRYSHADER, value); }
    /** Unsafe version of {@link #tessellationShader(boolean) tessellationShader}. */
    public static void ntessellationShader(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.TESSELLATIONSHADER, value); }
    /** Unsafe version of {@link #sampleRateShading(boolean) sampleRateShading}. */
    public static void nsampleRateShading(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SAMPLERATESHADING, value); }
    /** Unsafe version of {@link #dualSrcBlend(boolean) dualSrcBlend}. */
    public static void ndualSrcBlend(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DUALSRCBLEND, value); }
    /** Unsafe version of {@link #logicOp(boolean) logicOp}. */
    public static void nlogicOp(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.LOGICOP, value); }
    /** Unsafe version of {@link #multiDrawIndirect(boolean) multiDrawIndirect}. */
    public static void nmultiDrawIndirect(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.MULTIDRAWINDIRECT, value); }
    /** Unsafe version of {@link #drawIndirectFirstInstance(boolean) drawIndirectFirstInstance}. */
    public static void ndrawIndirectFirstInstance(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DRAWINDIRECTFIRSTINSTANCE, value); }
    /** Unsafe version of {@link #depthClamp(boolean) depthClamp}. */
    public static void ndepthClamp(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DEPTHCLAMP, value); }
    /** Unsafe version of {@link #depthBiasClamp(boolean) depthBiasClamp}. */
    public static void ndepthBiasClamp(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DEPTHBIASCLAMP, value); }
    /** Unsafe version of {@link #fillModeNonSolid(boolean) fillModeNonSolid}. */
    public static void nfillModeNonSolid(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.FILLMODENONSOLID, value); }
    /** Unsafe version of {@link #depthBounds(boolean) depthBounds}. */
    public static void ndepthBounds(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DEPTHBOUNDS, value); }
    /** Unsafe version of {@link #wideLines(boolean) wideLines}. */
    public static void nwideLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.WIDELINES, value); }
    /** Unsafe version of {@link #largePoints(boolean) largePoints}. */
    public static void nlargePoints(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.LARGEPOINTS, value); }
    /** Unsafe version of {@link #alphaToOne(boolean) alphaToOne}. */
    public static void nalphaToOne(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.ALPHATOONE, value); }
    /** Unsafe version of {@link #multiViewport(boolean) multiViewport}. */
    public static void nmultiViewport(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.MULTIVIEWPORT, value); }
    /** Unsafe version of {@link #samplerAnisotropy(boolean) samplerAnisotropy}. */
    public static void nsamplerAnisotropy(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SAMPLERANISOTROPY, value); }
    /** Unsafe version of {@link #textureCompressionETC2(boolean) textureCompressionETC2}. */
    public static void ntextureCompressionETC2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONETC2, value); }
    /** Unsafe version of {@link #textureCompressionASTC_LDR(boolean) textureCompressionASTC_LDR}. */
    public static void ntextureCompressionASTC_LDR(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONASTC_LDR, value); }
    /** Unsafe version of {@link #textureCompressionBC(boolean) textureCompressionBC}. */
    public static void ntextureCompressionBC(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONBC, value); }
    /** Unsafe version of {@link #occlusionQueryPrecise(boolean) occlusionQueryPrecise}. */
    public static void nocclusionQueryPrecise(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.OCCLUSIONQUERYPRECISE, value); }
    /** Unsafe version of {@link #pipelineStatisticsQuery(boolean) pipelineStatisticsQuery}. */
    public static void npipelineStatisticsQuery(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.PIPELINESTATISTICSQUERY, value); }
    /** Unsafe version of {@link #vertexPipelineStoresAndAtomics(boolean) vertexPipelineStoresAndAtomics}. */
    public static void nvertexPipelineStoresAndAtomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.VERTEXPIPELINESTORESANDATOMICS, value); }
    /** Unsafe version of {@link #fragmentStoresAndAtomics(boolean) fragmentStoresAndAtomics}. */
    public static void nfragmentStoresAndAtomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.FRAGMENTSTORESANDATOMICS, value); }
    /** Unsafe version of {@link #shaderTessellationAndGeometryPointSize(boolean) shaderTessellationAndGeometryPointSize}. */
    public static void nshaderTessellationAndGeometryPointSize(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERTESSELLATIONANDGEOMETRYPOINTSIZE, value); }
    /** Unsafe version of {@link #shaderImageGatherExtended(boolean) shaderImageGatherExtended}. */
    public static void nshaderImageGatherExtended(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERIMAGEGATHEREXTENDED, value); }
    /** Unsafe version of {@link #shaderStorageImageExtendedFormats(boolean) shaderStorageImageExtendedFormats}. */
    public static void nshaderStorageImageExtendedFormats(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEEXTENDEDFORMATS, value); }
    /** Unsafe version of {@link #shaderStorageImageMultisample(boolean) shaderStorageImageMultisample}. */
    public static void nshaderStorageImageMultisample(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEMULTISAMPLE, value); }
    /** Unsafe version of {@link #shaderStorageImageReadWithoutFormat(boolean) shaderStorageImageReadWithoutFormat}. */
    public static void nshaderStorageImageReadWithoutFormat(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEREADWITHOUTFORMAT, value); }
    /** Unsafe version of {@link #shaderStorageImageWriteWithoutFormat(boolean) shaderStorageImageWriteWithoutFormat}. */
    public static void nshaderStorageImageWriteWithoutFormat(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT, value); }
    /** Unsafe version of {@link #shaderUniformBufferArrayDynamicIndexing(boolean) shaderUniformBufferArrayDynamicIndexing}. */
    public static void nshaderUniformBufferArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderSampledImageArrayDynamicIndexing(boolean) shaderSampledImageArrayDynamicIndexing}. */
    public static void nshaderSampledImageArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageBufferArrayDynamicIndexing(boolean) shaderStorageBufferArrayDynamicIndexing}. */
    public static void nshaderStorageBufferArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageImageArrayDynamicIndexing(boolean) shaderStorageImageArrayDynamicIndexing}. */
    public static void nshaderStorageImageArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderClipDistance(boolean) shaderClipDistance}. */
    public static void nshaderClipDistance(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERCLIPDISTANCE, value); }
    /** Unsafe version of {@link #shaderCullDistance(boolean) shaderCullDistance}. */
    public static void nshaderCullDistance(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERCULLDISTANCE, value); }
    /** Unsafe version of {@link #shaderFloat64(boolean) shaderFloat64}. */
    public static void nshaderFloat64(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERFLOAT64, value); }
    /** Unsafe version of {@link #shaderInt64(boolean) shaderInt64}. */
    public static void nshaderInt64(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERINT64, value); }
    /** Unsafe version of {@link #shaderInt16(boolean) shaderInt16}. */
    public static void nshaderInt16(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERINT16, value); }
    /** Unsafe version of {@link #shaderResourceResidency(boolean) shaderResourceResidency}. */
    public static void nshaderResourceResidency(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERRESOURCERESIDENCY, value); }
    /** Unsafe version of {@link #shaderResourceMinLod(boolean) shaderResourceMinLod}. */
    public static void nshaderResourceMinLod(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERRESOURCEMINLOD, value); }
    /** Unsafe version of {@link #sparseBinding(boolean) sparseBinding}. */
    public static void nsparseBinding(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSEBINDING, value); }
    /** Unsafe version of {@link #sparseResidencyBuffer(boolean) sparseResidencyBuffer}. */
    public static void nsparseResidencyBuffer(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYBUFFER, value); }
    /** Unsafe version of {@link #sparseResidencyImage2D(boolean) sparseResidencyImage2D}. */
    public static void nsparseResidencyImage2D(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE2D, value); }
    /** Unsafe version of {@link #sparseResidencyImage3D(boolean) sparseResidencyImage3D}. */
    public static void nsparseResidencyImage3D(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE3D, value); }
    /** Unsafe version of {@link #sparseResidency2Samples(boolean) sparseResidency2Samples}. */
    public static void nsparseResidency2Samples(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY2SAMPLES, value); }
    /** Unsafe version of {@link #sparseResidency4Samples(boolean) sparseResidency4Samples}. */
    public static void nsparseResidency4Samples(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY4SAMPLES, value); }
    /** Unsafe version of {@link #sparseResidency8Samples(boolean) sparseResidency8Samples}. */
    public static void nsparseResidency8Samples(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY8SAMPLES, value); }
    /** Unsafe version of {@link #sparseResidency16Samples(boolean) sparseResidency16Samples}. */
    public static void nsparseResidency16Samples(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY16SAMPLES, value); }
    /** Unsafe version of {@link #sparseResidencyAliased(boolean) sparseResidencyAliased}. */
    public static void nsparseResidencyAliased(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYALIASED, value); }
    /** Unsafe version of {@link #variableMultisampleRate(boolean) variableMultisampleRate}. */
    public static void nvariableMultisampleRate(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.VARIABLEMULTISAMPLERATE, value); }
    /** Unsafe version of {@link #inheritedQueries(boolean) inheritedQueries}. */
    public static void ninheritedQueries(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.INHERITEDQUERIES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFeatures, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFeatures#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkPhysicalDeviceFeatures newInstance(long address) {
            return new VkPhysicalDeviceFeatures(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code robustBufferAccess} field. */
        @NativeType("VkBool32")
        public boolean robustBufferAccess() { return VkPhysicalDeviceFeatures.nrobustBufferAccess(address()) != 0; }
        /** Returns the value of the {@code fullDrawIndexUint32} field. */
        @NativeType("VkBool32")
        public boolean fullDrawIndexUint32() { return VkPhysicalDeviceFeatures.nfullDrawIndexUint32(address()) != 0; }
        /** Returns the value of the {@code imageCubeArray} field. */
        @NativeType("VkBool32")
        public boolean imageCubeArray() { return VkPhysicalDeviceFeatures.nimageCubeArray(address()) != 0; }
        /** Returns the value of the {@code independentBlend} field. */
        @NativeType("VkBool32")
        public boolean independentBlend() { return VkPhysicalDeviceFeatures.nindependentBlend(address()) != 0; }
        /** Returns the value of the {@code geometryShader} field. */
        @NativeType("VkBool32")
        public boolean geometryShader() { return VkPhysicalDeviceFeatures.ngeometryShader(address()) != 0; }
        /** Returns the value of the {@code tessellationShader} field. */
        @NativeType("VkBool32")
        public boolean tessellationShader() { return VkPhysicalDeviceFeatures.ntessellationShader(address()) != 0; }
        /** Returns the value of the {@code sampleRateShading} field. */
        @NativeType("VkBool32")
        public boolean sampleRateShading() { return VkPhysicalDeviceFeatures.nsampleRateShading(address()) != 0; }
        /** Returns the value of the {@code dualSrcBlend} field. */
        @NativeType("VkBool32")
        public boolean dualSrcBlend() { return VkPhysicalDeviceFeatures.ndualSrcBlend(address()) != 0; }
        /** Returns the value of the {@code logicOp} field. */
        @NativeType("VkBool32")
        public boolean logicOp() { return VkPhysicalDeviceFeatures.nlogicOp(address()) != 0; }
        /** Returns the value of the {@code multiDrawIndirect} field. */
        @NativeType("VkBool32")
        public boolean multiDrawIndirect() { return VkPhysicalDeviceFeatures.nmultiDrawIndirect(address()) != 0; }
        /** Returns the value of the {@code drawIndirectFirstInstance} field. */
        @NativeType("VkBool32")
        public boolean drawIndirectFirstInstance() { return VkPhysicalDeviceFeatures.ndrawIndirectFirstInstance(address()) != 0; }
        /** Returns the value of the {@code depthClamp} field. */
        @NativeType("VkBool32")
        public boolean depthClamp() { return VkPhysicalDeviceFeatures.ndepthClamp(address()) != 0; }
        /** Returns the value of the {@code depthBiasClamp} field. */
        @NativeType("VkBool32")
        public boolean depthBiasClamp() { return VkPhysicalDeviceFeatures.ndepthBiasClamp(address()) != 0; }
        /** Returns the value of the {@code fillModeNonSolid} field. */
        @NativeType("VkBool32")
        public boolean fillModeNonSolid() { return VkPhysicalDeviceFeatures.nfillModeNonSolid(address()) != 0; }
        /** Returns the value of the {@code depthBounds} field. */
        @NativeType("VkBool32")
        public boolean depthBounds() { return VkPhysicalDeviceFeatures.ndepthBounds(address()) != 0; }
        /** Returns the value of the {@code wideLines} field. */
        @NativeType("VkBool32")
        public boolean wideLines() { return VkPhysicalDeviceFeatures.nwideLines(address()) != 0; }
        /** Returns the value of the {@code largePoints} field. */
        @NativeType("VkBool32")
        public boolean largePoints() { return VkPhysicalDeviceFeatures.nlargePoints(address()) != 0; }
        /** Returns the value of the {@code alphaToOne} field. */
        @NativeType("VkBool32")
        public boolean alphaToOne() { return VkPhysicalDeviceFeatures.nalphaToOne(address()) != 0; }
        /** Returns the value of the {@code multiViewport} field. */
        @NativeType("VkBool32")
        public boolean multiViewport() { return VkPhysicalDeviceFeatures.nmultiViewport(address()) != 0; }
        /** Returns the value of the {@code samplerAnisotropy} field. */
        @NativeType("VkBool32")
        public boolean samplerAnisotropy() { return VkPhysicalDeviceFeatures.nsamplerAnisotropy(address()) != 0; }
        /** Returns the value of the {@code textureCompressionETC2} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionETC2() { return VkPhysicalDeviceFeatures.ntextureCompressionETC2(address()) != 0; }
        /** Returns the value of the {@code textureCompressionASTC_LDR} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionASTC_LDR() { return VkPhysicalDeviceFeatures.ntextureCompressionASTC_LDR(address()) != 0; }
        /** Returns the value of the {@code textureCompressionBC} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionBC() { return VkPhysicalDeviceFeatures.ntextureCompressionBC(address()) != 0; }
        /** Returns the value of the {@code occlusionQueryPrecise} field. */
        @NativeType("VkBool32")
        public boolean occlusionQueryPrecise() { return VkPhysicalDeviceFeatures.nocclusionQueryPrecise(address()) != 0; }
        /** Returns the value of the {@code pipelineStatisticsQuery} field. */
        @NativeType("VkBool32")
        public boolean pipelineStatisticsQuery() { return VkPhysicalDeviceFeatures.npipelineStatisticsQuery(address()) != 0; }
        /** Returns the value of the {@code vertexPipelineStoresAndAtomics} field. */
        @NativeType("VkBool32")
        public boolean vertexPipelineStoresAndAtomics() { return VkPhysicalDeviceFeatures.nvertexPipelineStoresAndAtomics(address()) != 0; }
        /** Returns the value of the {@code fragmentStoresAndAtomics} field. */
        @NativeType("VkBool32")
        public boolean fragmentStoresAndAtomics() { return VkPhysicalDeviceFeatures.nfragmentStoresAndAtomics(address()) != 0; }
        /** Returns the value of the {@code shaderTessellationAndGeometryPointSize} field. */
        @NativeType("VkBool32")
        public boolean shaderTessellationAndGeometryPointSize() { return VkPhysicalDeviceFeatures.nshaderTessellationAndGeometryPointSize(address()) != 0; }
        /** Returns the value of the {@code shaderImageGatherExtended} field. */
        @NativeType("VkBool32")
        public boolean shaderImageGatherExtended() { return VkPhysicalDeviceFeatures.nshaderImageGatherExtended(address()) != 0; }
        /** Returns the value of the {@code shaderStorageImageExtendedFormats} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageExtendedFormats() { return VkPhysicalDeviceFeatures.nshaderStorageImageExtendedFormats(address()) != 0; }
        /** Returns the value of the {@code shaderStorageImageMultisample} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageMultisample() { return VkPhysicalDeviceFeatures.nshaderStorageImageMultisample(address()) != 0; }
        /** Returns the value of the {@code shaderStorageImageReadWithoutFormat} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageReadWithoutFormat() { return VkPhysicalDeviceFeatures.nshaderStorageImageReadWithoutFormat(address()) != 0; }
        /** Returns the value of the {@code shaderStorageImageWriteWithoutFormat} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageWriteWithoutFormat() { return VkPhysicalDeviceFeatures.nshaderStorageImageWriteWithoutFormat(address()) != 0; }
        /** Returns the value of the {@code shaderUniformBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderUniformBufferArrayDynamicIndexing(address()) != 0; }
        /** Returns the value of the {@code shaderSampledImageArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderSampledImageArrayDynamicIndexing(address()) != 0; }
        /** Returns the value of the {@code shaderStorageBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderStorageBufferArrayDynamicIndexing(address()) != 0; }
        /** Returns the value of the {@code shaderStorageImageArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderStorageImageArrayDynamicIndexing(address()) != 0; }
        /** Returns the value of the {@code shaderClipDistance} field. */
        @NativeType("VkBool32")
        public boolean shaderClipDistance() { return VkPhysicalDeviceFeatures.nshaderClipDistance(address()) != 0; }
        /** Returns the value of the {@code shaderCullDistance} field. */
        @NativeType("VkBool32")
        public boolean shaderCullDistance() { return VkPhysicalDeviceFeatures.nshaderCullDistance(address()) != 0; }
        /** Returns the value of the {@code shaderFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderFloat64() { return VkPhysicalDeviceFeatures.nshaderFloat64(address()) != 0; }
        /** Returns the value of the {@code shaderInt64} field. */
        @NativeType("VkBool32")
        public boolean shaderInt64() { return VkPhysicalDeviceFeatures.nshaderInt64(address()) != 0; }
        /** Returns the value of the {@code shaderInt16} field. */
        @NativeType("VkBool32")
        public boolean shaderInt16() { return VkPhysicalDeviceFeatures.nshaderInt16(address()) != 0; }
        /** Returns the value of the {@code shaderResourceResidency} field. */
        @NativeType("VkBool32")
        public boolean shaderResourceResidency() { return VkPhysicalDeviceFeatures.nshaderResourceResidency(address()) != 0; }
        /** Returns the value of the {@code shaderResourceMinLod} field. */
        @NativeType("VkBool32")
        public boolean shaderResourceMinLod() { return VkPhysicalDeviceFeatures.nshaderResourceMinLod(address()) != 0; }
        /** Returns the value of the {@code sparseBinding} field. */
        @NativeType("VkBool32")
        public boolean sparseBinding() { return VkPhysicalDeviceFeatures.nsparseBinding(address()) != 0; }
        /** Returns the value of the {@code sparseResidencyBuffer} field. */
        @NativeType("VkBool32")
        public boolean sparseResidencyBuffer() { return VkPhysicalDeviceFeatures.nsparseResidencyBuffer(address()) != 0; }
        /** Returns the value of the {@code sparseResidencyImage2D} field. */
        @NativeType("VkBool32")
        public boolean sparseResidencyImage2D() { return VkPhysicalDeviceFeatures.nsparseResidencyImage2D(address()) != 0; }
        /** Returns the value of the {@code sparseResidencyImage3D} field. */
        @NativeType("VkBool32")
        public boolean sparseResidencyImage3D() { return VkPhysicalDeviceFeatures.nsparseResidencyImage3D(address()) != 0; }
        /** Returns the value of the {@code sparseResidency2Samples} field. */
        @NativeType("VkBool32")
        public boolean sparseResidency2Samples() { return VkPhysicalDeviceFeatures.nsparseResidency2Samples(address()) != 0; }
        /** Returns the value of the {@code sparseResidency4Samples} field. */
        @NativeType("VkBool32")
        public boolean sparseResidency4Samples() { return VkPhysicalDeviceFeatures.nsparseResidency4Samples(address()) != 0; }
        /** Returns the value of the {@code sparseResidency8Samples} field. */
        @NativeType("VkBool32")
        public boolean sparseResidency8Samples() { return VkPhysicalDeviceFeatures.nsparseResidency8Samples(address()) != 0; }
        /** Returns the value of the {@code sparseResidency16Samples} field. */
        @NativeType("VkBool32")
        public boolean sparseResidency16Samples() { return VkPhysicalDeviceFeatures.nsparseResidency16Samples(address()) != 0; }
        /** Returns the value of the {@code sparseResidencyAliased} field. */
        @NativeType("VkBool32")
        public boolean sparseResidencyAliased() { return VkPhysicalDeviceFeatures.nsparseResidencyAliased(address()) != 0; }
        /** Returns the value of the {@code variableMultisampleRate} field. */
        @NativeType("VkBool32")
        public boolean variableMultisampleRate() { return VkPhysicalDeviceFeatures.nvariableMultisampleRate(address()) != 0; }
        /** Returns the value of the {@code inheritedQueries} field. */
        @NativeType("VkBool32")
        public boolean inheritedQueries() { return VkPhysicalDeviceFeatures.ninheritedQueries(address()) != 0; }

        /** Sets the specified value to the {@code robustBufferAccess} field. */
        public VkPhysicalDeviceFeatures.Buffer robustBufferAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nrobustBufferAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code fullDrawIndexUint32} field. */
        public VkPhysicalDeviceFeatures.Buffer fullDrawIndexUint32(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nfullDrawIndexUint32(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code imageCubeArray} field. */
        public VkPhysicalDeviceFeatures.Buffer imageCubeArray(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nimageCubeArray(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code independentBlend} field. */
        public VkPhysicalDeviceFeatures.Buffer independentBlend(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nindependentBlend(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code geometryShader} field. */
        public VkPhysicalDeviceFeatures.Buffer geometryShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ngeometryShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tessellationShader} field. */
        public VkPhysicalDeviceFeatures.Buffer tessellationShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ntessellationShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sampleRateShading} field. */
        public VkPhysicalDeviceFeatures.Buffer sampleRateShading(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsampleRateShading(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dualSrcBlend} field. */
        public VkPhysicalDeviceFeatures.Buffer dualSrcBlend(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndualSrcBlend(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code logicOp} field. */
        public VkPhysicalDeviceFeatures.Buffer logicOp(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nlogicOp(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multiDrawIndirect} field. */
        public VkPhysicalDeviceFeatures.Buffer multiDrawIndirect(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nmultiDrawIndirect(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code drawIndirectFirstInstance} field. */
        public VkPhysicalDeviceFeatures.Buffer drawIndirectFirstInstance(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndrawIndirectFirstInstance(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code depthClamp} field. */
        public VkPhysicalDeviceFeatures.Buffer depthClamp(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndepthClamp(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code depthBiasClamp} field. */
        public VkPhysicalDeviceFeatures.Buffer depthBiasClamp(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndepthBiasClamp(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code fillModeNonSolid} field. */
        public VkPhysicalDeviceFeatures.Buffer fillModeNonSolid(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nfillModeNonSolid(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code depthBounds} field. */
        public VkPhysicalDeviceFeatures.Buffer depthBounds(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndepthBounds(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code wideLines} field. */
        public VkPhysicalDeviceFeatures.Buffer wideLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nwideLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code largePoints} field. */
        public VkPhysicalDeviceFeatures.Buffer largePoints(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nlargePoints(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code alphaToOne} field. */
        public VkPhysicalDeviceFeatures.Buffer alphaToOne(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nalphaToOne(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multiViewport} field. */
        public VkPhysicalDeviceFeatures.Buffer multiViewport(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nmultiViewport(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code samplerAnisotropy} field. */
        public VkPhysicalDeviceFeatures.Buffer samplerAnisotropy(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsamplerAnisotropy(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code textureCompressionETC2} field. */
        public VkPhysicalDeviceFeatures.Buffer textureCompressionETC2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ntextureCompressionETC2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code textureCompressionASTC_LDR} field. */
        public VkPhysicalDeviceFeatures.Buffer textureCompressionASTC_LDR(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ntextureCompressionASTC_LDR(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code textureCompressionBC} field. */
        public VkPhysicalDeviceFeatures.Buffer textureCompressionBC(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ntextureCompressionBC(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code occlusionQueryPrecise} field. */
        public VkPhysicalDeviceFeatures.Buffer occlusionQueryPrecise(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nocclusionQueryPrecise(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pipelineStatisticsQuery} field. */
        public VkPhysicalDeviceFeatures.Buffer pipelineStatisticsQuery(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.npipelineStatisticsQuery(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vertexPipelineStoresAndAtomics} field. */
        public VkPhysicalDeviceFeatures.Buffer vertexPipelineStoresAndAtomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nvertexPipelineStoresAndAtomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code fragmentStoresAndAtomics} field. */
        public VkPhysicalDeviceFeatures.Buffer fragmentStoresAndAtomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nfragmentStoresAndAtomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderTessellationAndGeometryPointSize} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderTessellationAndGeometryPointSize(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderTessellationAndGeometryPointSize(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderImageGatherExtended} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderImageGatherExtended(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderImageGatherExtended(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageImageExtendedFormats} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageExtendedFormats(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageExtendedFormats(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageImageMultisample} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageMultisample(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageMultisample(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageImageReadWithoutFormat} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageReadWithoutFormat(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageReadWithoutFormat(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageImageWriteWithoutFormat} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageWriteWithoutFormat(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageWriteWithoutFormat(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderUniformBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderUniformBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderUniformBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSampledImageArrayDynamicIndexing} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderSampledImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderSampledImageArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageImageArrayDynamicIndexing} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderClipDistance} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderClipDistance(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderClipDistance(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderCullDistance} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderCullDistance(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderCullDistance(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderFloat64} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderFloat64(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderFloat64(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderInt64} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderInt64(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderInt64(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderInt16} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderInt16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderInt16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderResourceResidency} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderResourceResidency(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderResourceResidency(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderResourceMinLod} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderResourceMinLod(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderResourceMinLod(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseBinding} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseBinding(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseBinding(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidencyBuffer} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidencyBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidencyBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidencyImage2D} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidencyImage2D(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidencyImage2D(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidencyImage3D} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidencyImage3D(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidencyImage3D(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidency2Samples} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidency2Samples(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidency2Samples(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidency4Samples} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidency4Samples(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidency4Samples(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidency8Samples} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidency8Samples(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidency8Samples(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidency16Samples} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidency16Samples(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidency16Samples(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidencyAliased} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidencyAliased(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidencyAliased(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code variableMultisampleRate} field. */
        public VkPhysicalDeviceFeatures.Buffer variableMultisampleRate(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nvariableMultisampleRate(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code inheritedQueries} field. */
        public VkPhysicalDeviceFeatures.Buffer inheritedQueries(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ninheritedQueries(address(), value ? 1 : 0); return this; }

    }

}