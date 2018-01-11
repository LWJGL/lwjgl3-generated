/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.util.Set;
import org.lwjgl.system.*;

import static org.lwjgl.vulkan.VK.*;

/** Defines the capabilities of a Vulkan {@code VkDevice}. */
public class VKCapabilitiesDevice {

    // VK10
    public final long
        vkGetDeviceProcAddr,
        vkDestroyDevice,
        vkGetDeviceQueue,
        vkQueueSubmit,
        vkQueueWaitIdle,
        vkDeviceWaitIdle,
        vkAllocateMemory,
        vkFreeMemory,
        vkMapMemory,
        vkUnmapMemory,
        vkFlushMappedMemoryRanges,
        vkInvalidateMappedMemoryRanges,
        vkGetDeviceMemoryCommitment,
        vkBindBufferMemory,
        vkBindImageMemory,
        vkGetBufferMemoryRequirements,
        vkGetImageMemoryRequirements,
        vkGetImageSparseMemoryRequirements,
        vkQueueBindSparse,
        vkCreateFence,
        vkDestroyFence,
        vkResetFences,
        vkGetFenceStatus,
        vkWaitForFences,
        vkCreateSemaphore,
        vkDestroySemaphore,
        vkCreateEvent,
        vkDestroyEvent,
        vkGetEventStatus,
        vkSetEvent,
        vkResetEvent,
        vkCreateQueryPool,
        vkDestroyQueryPool,
        vkGetQueryPoolResults,
        vkCreateBuffer,
        vkDestroyBuffer,
        vkCreateBufferView,
        vkDestroyBufferView,
        vkCreateImage,
        vkDestroyImage,
        vkGetImageSubresourceLayout,
        vkCreateImageView,
        vkDestroyImageView,
        vkCreateShaderModule,
        vkDestroyShaderModule,
        vkCreatePipelineCache,
        vkDestroyPipelineCache,
        vkGetPipelineCacheData,
        vkMergePipelineCaches,
        vkCreateGraphicsPipelines,
        vkCreateComputePipelines,
        vkDestroyPipeline,
        vkCreatePipelineLayout,
        vkDestroyPipelineLayout,
        vkCreateSampler,
        vkDestroySampler,
        vkCreateDescriptorSetLayout,
        vkDestroyDescriptorSetLayout,
        vkCreateDescriptorPool,
        vkDestroyDescriptorPool,
        vkResetDescriptorPool,
        vkAllocateDescriptorSets,
        vkFreeDescriptorSets,
        vkUpdateDescriptorSets,
        vkCreateFramebuffer,
        vkDestroyFramebuffer,
        vkCreateRenderPass,
        vkDestroyRenderPass,
        vkGetRenderAreaGranularity,
        vkCreateCommandPool,
        vkDestroyCommandPool,
        vkResetCommandPool,
        vkAllocateCommandBuffers,
        vkFreeCommandBuffers,
        vkBeginCommandBuffer,
        vkEndCommandBuffer,
        vkResetCommandBuffer,
        vkCmdBindPipeline,
        vkCmdSetViewport,
        vkCmdSetScissor,
        vkCmdSetLineWidth,
        vkCmdSetDepthBias,
        vkCmdSetBlendConstants,
        vkCmdSetDepthBounds,
        vkCmdSetStencilCompareMask,
        vkCmdSetStencilWriteMask,
        vkCmdSetStencilReference,
        vkCmdBindDescriptorSets,
        vkCmdBindIndexBuffer,
        vkCmdBindVertexBuffers,
        vkCmdDraw,
        vkCmdDrawIndexed,
        vkCmdDrawIndirect,
        vkCmdDrawIndexedIndirect,
        vkCmdDispatch,
        vkCmdDispatchIndirect,
        vkCmdCopyBuffer,
        vkCmdCopyImage,
        vkCmdBlitImage,
        vkCmdCopyBufferToImage,
        vkCmdCopyImageToBuffer,
        vkCmdUpdateBuffer,
        vkCmdFillBuffer,
        vkCmdClearColorImage,
        vkCmdClearDepthStencilImage,
        vkCmdClearAttachments,
        vkCmdResolveImage,
        vkCmdSetEvent,
        vkCmdResetEvent,
        vkCmdWaitEvents,
        vkCmdPipelineBarrier,
        vkCmdBeginQuery,
        vkCmdEndQuery,
        vkCmdResetQueryPool,
        vkCmdWriteTimestamp,
        vkCmdCopyQueryPoolResults,
        vkCmdPushConstants,
        vkCmdBeginRenderPass,
        vkCmdNextSubpass,
        vkCmdEndRenderPass,
        vkCmdExecuteCommands;

    // AMD_draw_indirect_count
    public final long
        vkCmdDrawIndirectCountAMD,
        vkCmdDrawIndexedIndirectCountAMD;

    // AMD_shader_info
    public final long
        vkGetShaderInfoAMD;

    // EXT_debug_marker
    public final long
        vkDebugMarkerSetObjectTagEXT,
        vkDebugMarkerSetObjectNameEXT,
        vkCmdDebugMarkerBeginEXT,
        vkCmdDebugMarkerEndEXT,
        vkCmdDebugMarkerInsertEXT;

    // EXT_discard_rectangles
    public final long
        vkCmdSetDiscardRectangleEXT;

    // EXT_display_control
    public final long
        vkDisplayPowerControlEXT,
        vkRegisterDeviceEventEXT,
        vkRegisterDisplayEventEXT,
        vkGetSwapchainCounterEXT;

    // EXT_external_memory_host
    public final long
        vkGetMemoryHostPointerPropertiesEXT;

    // EXT_hdr_metadata
    public final long
        vkSetHdrMetadataEXT;

    // EXT_sample_locations
    public final long
        vkCmdSetSampleLocationsEXT;

    // EXT_validation_cache
    public final long
        vkCreateValidationCacheEXT,
        vkDestroyValidationCacheEXT,
        vkMergeValidationCachesEXT,
        vkGetValidationCacheDataEXT;

    // GOOGLE_display_timing
    public final long
        vkGetRefreshCycleDurationGOOGLE,
        vkGetPastPresentationTimingGOOGLE;

    // KHR_bind_memory2
    public final long
        vkBindBufferMemory2KHR,
        vkBindImageMemory2KHR;

    // KHR_descriptor_update_template
    public final long
        vkCreateDescriptorUpdateTemplateKHR,
        vkDestroyDescriptorUpdateTemplateKHR,
        vkUpdateDescriptorSetWithTemplateKHR,
        vkCmdPushDescriptorSetWithTemplateKHR;

    // KHR_display_swapchain
    public final long
        vkCreateSharedSwapchainsKHR;

    // KHR_external_fence_fd
    public final long
        vkImportFenceFdKHR,
        vkGetFenceFdKHR;

    // KHR_external_fence_win32
    public final long
        vkImportFenceWin32HandleKHR,
        vkGetFenceWin32HandleKHR;

    // KHR_external_memory_fd
    public final long
        vkGetMemoryFdKHR,
        vkGetMemoryFdPropertiesKHR;

    // KHR_external_memory_win32
    public final long
        vkGetMemoryWin32HandleKHR,
        vkGetMemoryWin32HandlePropertiesKHR;

    // KHR_external_semaphore_fd
    public final long
        vkImportSemaphoreFdKHR,
        vkGetSemaphoreFdKHR;

    // KHR_external_semaphore_win32
    public final long
        vkImportSemaphoreWin32HandleKHR,
        vkGetSemaphoreWin32HandleKHR;

    // KHR_get_memory_requirements2
    public final long
        vkGetImageMemoryRequirements2KHR,
        vkGetBufferMemoryRequirements2KHR,
        vkGetImageSparseMemoryRequirements2KHR;

    // KHR_maintenance1
    public final long
        vkTrimCommandPoolKHR;

    // KHR_push_descriptor
    public final long
        vkCmdPushDescriptorSetKHR;

    // KHR_sampler_ycbcr_conversion
    public final long
        vkCreateSamplerYcbcrConversionKHR,
        vkDestroySamplerYcbcrConversionKHR;

    // KHR_shared_presentable_image
    public final long
        vkGetSwapchainStatusKHR;

    // KHR_swapchain
    public final long
        vkCreateSwapchainKHR,
        vkDestroySwapchainKHR,
        vkGetSwapchainImagesKHR,
        vkAcquireNextImageKHR,
        vkQueuePresentKHR;

    // KHX_device_group
    public final long
        vkGetDeviceGroupPeerMemoryFeaturesKHX,
        vkCmdSetDeviceMaskKHX,
        vkCmdDispatchBaseKHX,
        vkGetDeviceGroupPresentCapabilitiesKHX,
        vkGetDeviceGroupSurfacePresentModesKHX,
        vkAcquireNextImage2KHX;

    // NV_clip_space_w_scaling
    public final long
        vkCmdSetViewportWScalingNV;

    // NV_external_memory_win32
    public final long
        vkGetMemoryWin32HandleNV;

    // NVX_device_generated_commands
    public final long
        vkCmdProcessCommandsNVX,
        vkCmdReserveSpaceForCommandsNVX,
        vkCreateIndirectCommandsLayoutNVX,
        vkDestroyIndirectCommandsLayoutNVX,
        vkCreateObjectTableNVX,
        vkDestroyObjectTableNVX,
        vkRegisterObjectsNVX,
        vkUnregisterObjectsNVX;

    /** The Vulkan API version number. */
    public final int apiVersion;

    /** When true, {@link VK10} is supported. */
    public final boolean Vulkan10;
    /** When true, {@link AMDDrawIndirectCount} is supported. */
    public final boolean VK_AMD_draw_indirect_count;
    /** When true, {@link AMDGCNShader} is supported. */
    public final boolean VK_AMD_gcn_shader;
    /** When true, {@link AMDGPUShaderHalfFloat} is supported. */
    public final boolean VK_AMD_gpu_shader_half_float;
    /** When true, {@link AMDGPUShaderInt16} is supported. */
    public final boolean VK_AMD_gpu_shader_int16;
    /** When true, {@link AMDMixedAttachmentSamples} is supported. */
    public final boolean VK_AMD_mixed_attachment_samples;
    /** When true, {@link AMDNegativeViewportHeight} is supported. */
    public final boolean VK_AMD_negative_viewport_height;
    /** When true, {@link AMDRasterizationOrder} is supported. */
    public final boolean VK_AMD_rasterization_order;
    /** When true, {@link AMDShaderBallot} is supported. */
    public final boolean VK_AMD_shader_ballot;
    /** When true, {@link AMDShaderExplicitVertexParameter} is supported. */
    public final boolean VK_AMD_shader_explicit_vertex_parameter;
    /** When true, {@link AMDShaderFragmentMask} is supported. */
    public final boolean VK_AMD_shader_fragment_mask;
    /** When true, {@link AMDShaderImageLoadStoreLod} is supported. */
    public final boolean VK_AMD_shader_image_load_store_lod;
    /** When true, {@link AMDShaderInfo} is supported. */
    public final boolean VK_AMD_shader_info;
    /** When true, {@link AMDShaderTrinaryMinmax} is supported. */
    public final boolean VK_AMD_shader_trinary_minmax;
    /** When true, {@link AMDTextureGatherBiasLod} is supported. */
    public final boolean VK_AMD_texture_gather_bias_lod;
    /** When true, {@link EXTBlendOperationAdvanced} is supported. */
    public final boolean VK_EXT_blend_operation_advanced;
    /** When true, {@link EXTConservativeRasterization} is supported. */
    public final boolean VK_EXT_conservative_rasterization;
    /** When true, {@link EXTDebugMarker} is supported. */
    public final boolean VK_EXT_debug_marker;
    /** When true, {@link EXTDepthRangeUnrestricted} is supported. */
    public final boolean VK_EXT_depth_range_unrestricted;
    /** When true, {@link EXTDiscardRectangles} is supported. */
    public final boolean VK_EXT_discard_rectangles;
    /** When true, {@link EXTDisplayControl} is supported. */
    public final boolean VK_EXT_display_control;
    /** When true, {@link EXTExternalMemoryDmaBuf} is supported. */
    public final boolean VK_EXT_external_memory_dma_buf;
    /** When true, {@link EXTExternalMemoryHost} is supported. */
    public final boolean VK_EXT_external_memory_host;
    /** When true, {@link EXTGlobalPriority} is supported. */
    public final boolean VK_EXT_global_priority;
    /** When true, {@link EXTHdrMetadata} is supported. */
    public final boolean VK_EXT_hdr_metadata;
    /** When true, {@link EXTPostDepthCoverage} is supported. */
    public final boolean VK_EXT_post_depth_coverage;
    /** When true, {@link EXTQueueFamilyForeign} is supported. */
    public final boolean VK_EXT_queue_family_foreign;
    /** When true, {@link EXTSampleLocations} is supported. */
    public final boolean VK_EXT_sample_locations;
    /** When true, {@link EXTSamplerFilterMinmax} is supported. */
    public final boolean VK_EXT_sampler_filter_minmax;
    /** When true, {@link EXTShaderStencilExport} is supported. */
    public final boolean VK_EXT_shader_stencil_export;
    /** When true, {@link EXTShaderSubgroupBallot} is supported. */
    public final boolean VK_EXT_shader_subgroup_ballot;
    /** When true, {@link EXTShaderSubgroupVote} is supported. */
    public final boolean VK_EXT_shader_subgroup_vote;
    /** When true, {@link EXTShaderViewportIndexLayer} is supported. */
    public final boolean VK_EXT_shader_viewport_index_layer;
    /** When true, {@link EXTValidationCache} is supported. */
    public final boolean VK_EXT_validation_cache;
    /** When true, {@link GOOGLEDisplayTiming} is supported. */
    public final boolean VK_GOOGLE_display_timing;
    /** When true, {@link IMGFilterCubic} is supported. */
    public final boolean VK_IMG_filter_cubic;
    /** When true, {@link IMGFormatPVRTC} is supported. */
    public final boolean VK_IMG_format_pvrtc;
    /** When true, {@link KHR16bitStorage} is supported. */
    public final boolean VK_KHR_16bit_storage;
    /** When true, {@link KHRBindMemory2} is supported. */
    public final boolean VK_KHR_bind_memory2;
    /** When true, {@link KHRDedicatedAllocation} is supported. */
    public final boolean VK_KHR_dedicated_allocation;
    /** When true, {@link KHRDescriptorUpdateTemplate} is supported. */
    public final boolean VK_KHR_descriptor_update_template;
    /** When true, {@link KHRDisplaySwapchain} is supported. */
    public final boolean VK_KHR_display_swapchain;
    /** When true, {@link KHRExternalFence} is supported. */
    public final boolean VK_KHR_external_fence;
    /** When true, {@link KHRExternalFenceFd} is supported. */
    public final boolean VK_KHR_external_fence_fd;
    /** When true, {@link KHRExternalFenceWin32} is supported. */
    public final boolean VK_KHR_external_fence_win32;
    /** When true, {@link KHRExternalMemory} is supported. */
    public final boolean VK_KHR_external_memory;
    /** When true, {@link KHRExternalMemoryFd} is supported. */
    public final boolean VK_KHR_external_memory_fd;
    /** When true, {@link KHRExternalMemoryWin32} is supported. */
    public final boolean VK_KHR_external_memory_win32;
    /** When true, {@link KHRExternalSemaphore} is supported. */
    public final boolean VK_KHR_external_semaphore;
    /** When true, {@link KHRExternalSemaphoreFd} is supported. */
    public final boolean VK_KHR_external_semaphore_fd;
    /** When true, {@link KHRExternalSemaphoreWin32} is supported. */
    public final boolean VK_KHR_external_semaphore_win32;
    /** When true, {@link KHRGetMemoryRequirements2} is supported. */
    public final boolean VK_KHR_get_memory_requirements2;
    /** When true, {@link KHRImageFormatList} is supported. */
    public final boolean VK_KHR_image_format_list;
    /** When true, {@link KHRIncrementalPresent} is supported. */
    public final boolean VK_KHR_incremental_present;
    /** When true, {@link KHRMaintenance1} is supported. */
    public final boolean VK_KHR_maintenance1;
    /** When true, {@link KHRMaintenance2} is supported. */
    public final boolean VK_KHR_maintenance2;
    /** When true, {@link KHRPushDescriptor} is supported. */
    public final boolean VK_KHR_push_descriptor;
    /** When true, {@link KHRRelaxedBlockLayout} is supported. */
    public final boolean VK_KHR_relaxed_block_layout;
    /** When true, {@link KHRSamplerMirrorClampToEdge} is supported. */
    public final boolean VK_KHR_sampler_mirror_clamp_to_edge;
    /** When true, {@link KHRSamplerYcbcrConversion} is supported. */
    public final boolean VK_KHR_sampler_ycbcr_conversion;
    /** When true, {@link KHRShaderDrawParameters} is supported. */
    public final boolean VK_KHR_shader_draw_parameters;
    /** When true, {@link KHRSharedPresentableImage} is supported. */
    public final boolean VK_KHR_shared_presentable_image;
    /** When true, {@link KHRStorageBufferStorageClass} is supported. */
    public final boolean VK_KHR_storage_buffer_storage_class;
    /** When true, {@link KHRSwapchain} is supported. */
    public final boolean VK_KHR_swapchain;
    /** When true, {@link KHRVariablePointers} is supported. */
    public final boolean VK_KHR_variable_pointers;
    /** When true, {@link KHRWin32KeyedMutex} is supported. */
    public final boolean VK_KHR_win32_keyed_mutex;
    /** When true, {@link KHXDeviceGroup} is supported. */
    public final boolean VK_KHX_device_group;
    /** When true, {@link KHXMultiview} is supported. */
    public final boolean VK_KHX_multiview;
    /** When true, {@link NVClipSpaceWScaling} is supported. */
    public final boolean VK_NV_clip_space_w_scaling;
    /** When true, {@link NVDedicatedAllocation} is supported. */
    public final boolean VK_NV_dedicated_allocation;
    /** When true, {@link NVExternalMemory} is supported. */
    public final boolean VK_NV_external_memory;
    /** When true, {@link NVExternalMemoryWin32} is supported. */
    public final boolean VK_NV_external_memory_win32;
    /** When true, {@link NVFillRectangle} is supported. */
    public final boolean VK_NV_fill_rectangle;
    /** When true, {@link NVFragmentCoverageToColor} is supported. */
    public final boolean VK_NV_fragment_coverage_to_color;
    /** When true, {@link NVFramebufferMixedSamples} is supported. */
    public final boolean VK_NV_framebuffer_mixed_samples;
    /** When true, {@link NVGeometryShaderPassthrough} is supported. */
    public final boolean VK_NV_geometry_shader_passthrough;
    /** When true, {@link NVGLSLShader} is supported. */
    public final boolean VK_NV_glsl_shader;
    /** When true, {@link NVSampleMaskOverrideCoverage} is supported. */
    public final boolean VK_NV_sample_mask_override_coverage;
    /** When true, {@link NVViewportArray2} is supported. */
    public final boolean VK_NV_viewport_array2;
    /** When true, {@link NVViewportSwizzle} is supported. */
    public final boolean VK_NV_viewport_swizzle;
    /** When true, {@link NVWin32KeyedMutex} is supported. */
    public final boolean VK_NV_win32_keyed_mutex;
    /** When true, {@link NVXDeviceGeneratedCommands} is supported. */
    public final boolean VK_NVX_device_generated_commands;
    /** When true, {@link NVXMultiviewPerViewAttributes} is supported. */
    public final boolean VK_NVX_multiview_per_view_attributes;

    VKCapabilitiesDevice(FunctionProvider provider, VKCapabilitiesInstance capsInstance, Set<String> ext) {
        this.apiVersion = capsInstance.apiVersion;

        boolean supported;

        {
            supported = ext.contains("Vulkan10");
            vkGetDeviceProcAddr = isSupported(provider, "vkGetDeviceProcAddr", supported);
            vkDestroyDevice = isSupported(provider, "vkDestroyDevice", supported);
            vkGetDeviceQueue = isSupported(provider, "vkGetDeviceQueue", supported);
            vkQueueSubmit = isSupported(provider, "vkQueueSubmit", supported);
            vkQueueWaitIdle = isSupported(provider, "vkQueueWaitIdle", supported);
            vkDeviceWaitIdle = isSupported(provider, "vkDeviceWaitIdle", supported);
            vkAllocateMemory = isSupported(provider, "vkAllocateMemory", supported);
            vkFreeMemory = isSupported(provider, "vkFreeMemory", supported);
            vkMapMemory = isSupported(provider, "vkMapMemory", supported);
            vkUnmapMemory = isSupported(provider, "vkUnmapMemory", supported);
            vkFlushMappedMemoryRanges = isSupported(provider, "vkFlushMappedMemoryRanges", supported);
            vkInvalidateMappedMemoryRanges = isSupported(provider, "vkInvalidateMappedMemoryRanges", supported);
            vkGetDeviceMemoryCommitment = isSupported(provider, "vkGetDeviceMemoryCommitment", supported);
            vkBindBufferMemory = isSupported(provider, "vkBindBufferMemory", supported);
            vkBindImageMemory = isSupported(provider, "vkBindImageMemory", supported);
            vkGetBufferMemoryRequirements = isSupported(provider, "vkGetBufferMemoryRequirements", supported);
            vkGetImageMemoryRequirements = isSupported(provider, "vkGetImageMemoryRequirements", supported);
            vkGetImageSparseMemoryRequirements = isSupported(provider, "vkGetImageSparseMemoryRequirements", supported);
            vkQueueBindSparse = isSupported(provider, "vkQueueBindSparse", supported);
            vkCreateFence = isSupported(provider, "vkCreateFence", supported);
            vkDestroyFence = isSupported(provider, "vkDestroyFence", supported);
            vkResetFences = isSupported(provider, "vkResetFences", supported);
            vkGetFenceStatus = isSupported(provider, "vkGetFenceStatus", supported);
            vkWaitForFences = isSupported(provider, "vkWaitForFences", supported);
            vkCreateSemaphore = isSupported(provider, "vkCreateSemaphore", supported);
            vkDestroySemaphore = isSupported(provider, "vkDestroySemaphore", supported);
            vkCreateEvent = isSupported(provider, "vkCreateEvent", supported);
            vkDestroyEvent = isSupported(provider, "vkDestroyEvent", supported);
            vkGetEventStatus = isSupported(provider, "vkGetEventStatus", supported);
            vkSetEvent = isSupported(provider, "vkSetEvent", supported);
            vkResetEvent = isSupported(provider, "vkResetEvent", supported);
            vkCreateQueryPool = isSupported(provider, "vkCreateQueryPool", supported);
            vkDestroyQueryPool = isSupported(provider, "vkDestroyQueryPool", supported);
            vkGetQueryPoolResults = isSupported(provider, "vkGetQueryPoolResults", supported);
            vkCreateBuffer = isSupported(provider, "vkCreateBuffer", supported);
            vkDestroyBuffer = isSupported(provider, "vkDestroyBuffer", supported);
            vkCreateBufferView = isSupported(provider, "vkCreateBufferView", supported);
            vkDestroyBufferView = isSupported(provider, "vkDestroyBufferView", supported);
            vkCreateImage = isSupported(provider, "vkCreateImage", supported);
            vkDestroyImage = isSupported(provider, "vkDestroyImage", supported);
            vkGetImageSubresourceLayout = isSupported(provider, "vkGetImageSubresourceLayout", supported);
            vkCreateImageView = isSupported(provider, "vkCreateImageView", supported);
            vkDestroyImageView = isSupported(provider, "vkDestroyImageView", supported);
            vkCreateShaderModule = isSupported(provider, "vkCreateShaderModule", supported);
            vkDestroyShaderModule = isSupported(provider, "vkDestroyShaderModule", supported);
            vkCreatePipelineCache = isSupported(provider, "vkCreatePipelineCache", supported);
            vkDestroyPipelineCache = isSupported(provider, "vkDestroyPipelineCache", supported);
            vkGetPipelineCacheData = isSupported(provider, "vkGetPipelineCacheData", supported);
            vkMergePipelineCaches = isSupported(provider, "vkMergePipelineCaches", supported);
            vkCreateGraphicsPipelines = isSupported(provider, "vkCreateGraphicsPipelines", supported);
            vkCreateComputePipelines = isSupported(provider, "vkCreateComputePipelines", supported);
            vkDestroyPipeline = isSupported(provider, "vkDestroyPipeline", supported);
            vkCreatePipelineLayout = isSupported(provider, "vkCreatePipelineLayout", supported);
            vkDestroyPipelineLayout = isSupported(provider, "vkDestroyPipelineLayout", supported);
            vkCreateSampler = isSupported(provider, "vkCreateSampler", supported);
            vkDestroySampler = isSupported(provider, "vkDestroySampler", supported);
            vkCreateDescriptorSetLayout = isSupported(provider, "vkCreateDescriptorSetLayout", supported);
            vkDestroyDescriptorSetLayout = isSupported(provider, "vkDestroyDescriptorSetLayout", supported);
            vkCreateDescriptorPool = isSupported(provider, "vkCreateDescriptorPool", supported);
            vkDestroyDescriptorPool = isSupported(provider, "vkDestroyDescriptorPool", supported);
            vkResetDescriptorPool = isSupported(provider, "vkResetDescriptorPool", supported);
            vkAllocateDescriptorSets = isSupported(provider, "vkAllocateDescriptorSets", supported);
            vkFreeDescriptorSets = isSupported(provider, "vkFreeDescriptorSets", supported);
            vkUpdateDescriptorSets = isSupported(provider, "vkUpdateDescriptorSets", supported);
            vkCreateFramebuffer = isSupported(provider, "vkCreateFramebuffer", supported);
            vkDestroyFramebuffer = isSupported(provider, "vkDestroyFramebuffer", supported);
            vkCreateRenderPass = isSupported(provider, "vkCreateRenderPass", supported);
            vkDestroyRenderPass = isSupported(provider, "vkDestroyRenderPass", supported);
            vkGetRenderAreaGranularity = isSupported(provider, "vkGetRenderAreaGranularity", supported);
            vkCreateCommandPool = isSupported(provider, "vkCreateCommandPool", supported);
            vkDestroyCommandPool = isSupported(provider, "vkDestroyCommandPool", supported);
            vkResetCommandPool = isSupported(provider, "vkResetCommandPool", supported);
            vkAllocateCommandBuffers = isSupported(provider, "vkAllocateCommandBuffers", supported);
            vkFreeCommandBuffers = isSupported(provider, "vkFreeCommandBuffers", supported);
            vkBeginCommandBuffer = isSupported(provider, "vkBeginCommandBuffer", supported);
            vkEndCommandBuffer = isSupported(provider, "vkEndCommandBuffer", supported);
            vkResetCommandBuffer = isSupported(provider, "vkResetCommandBuffer", supported);
            vkCmdBindPipeline = isSupported(provider, "vkCmdBindPipeline", supported);
            vkCmdSetViewport = isSupported(provider, "vkCmdSetViewport", supported);
            vkCmdSetScissor = isSupported(provider, "vkCmdSetScissor", supported);
            vkCmdSetLineWidth = isSupported(provider, "vkCmdSetLineWidth", supported);
            vkCmdSetDepthBias = isSupported(provider, "vkCmdSetDepthBias", supported);
            vkCmdSetBlendConstants = isSupported(provider, "vkCmdSetBlendConstants", supported);
            vkCmdSetDepthBounds = isSupported(provider, "vkCmdSetDepthBounds", supported);
            vkCmdSetStencilCompareMask = isSupported(provider, "vkCmdSetStencilCompareMask", supported);
            vkCmdSetStencilWriteMask = isSupported(provider, "vkCmdSetStencilWriteMask", supported);
            vkCmdSetStencilReference = isSupported(provider, "vkCmdSetStencilReference", supported);
            vkCmdBindDescriptorSets = isSupported(provider, "vkCmdBindDescriptorSets", supported);
            vkCmdBindIndexBuffer = isSupported(provider, "vkCmdBindIndexBuffer", supported);
            vkCmdBindVertexBuffers = isSupported(provider, "vkCmdBindVertexBuffers", supported);
            vkCmdDraw = isSupported(provider, "vkCmdDraw", supported);
            vkCmdDrawIndexed = isSupported(provider, "vkCmdDrawIndexed", supported);
            vkCmdDrawIndirect = isSupported(provider, "vkCmdDrawIndirect", supported);
            vkCmdDrawIndexedIndirect = isSupported(provider, "vkCmdDrawIndexedIndirect", supported);
            vkCmdDispatch = isSupported(provider, "vkCmdDispatch", supported);
            vkCmdDispatchIndirect = isSupported(provider, "vkCmdDispatchIndirect", supported);
            vkCmdCopyBuffer = isSupported(provider, "vkCmdCopyBuffer", supported);
            vkCmdCopyImage = isSupported(provider, "vkCmdCopyImage", supported);
            vkCmdBlitImage = isSupported(provider, "vkCmdBlitImage", supported);
            vkCmdCopyBufferToImage = isSupported(provider, "vkCmdCopyBufferToImage", supported);
            vkCmdCopyImageToBuffer = isSupported(provider, "vkCmdCopyImageToBuffer", supported);
            vkCmdUpdateBuffer = isSupported(provider, "vkCmdUpdateBuffer", supported);
            vkCmdFillBuffer = isSupported(provider, "vkCmdFillBuffer", supported);
            vkCmdClearColorImage = isSupported(provider, "vkCmdClearColorImage", supported);
            vkCmdClearDepthStencilImage = isSupported(provider, "vkCmdClearDepthStencilImage", supported);
            vkCmdClearAttachments = isSupported(provider, "vkCmdClearAttachments", supported);
            vkCmdResolveImage = isSupported(provider, "vkCmdResolveImage", supported);
            vkCmdSetEvent = isSupported(provider, "vkCmdSetEvent", supported);
            vkCmdResetEvent = isSupported(provider, "vkCmdResetEvent", supported);
            vkCmdWaitEvents = isSupported(provider, "vkCmdWaitEvents", supported);
            vkCmdPipelineBarrier = isSupported(provider, "vkCmdPipelineBarrier", supported);
            vkCmdBeginQuery = isSupported(provider, "vkCmdBeginQuery", supported);
            vkCmdEndQuery = isSupported(provider, "vkCmdEndQuery", supported);
            vkCmdResetQueryPool = isSupported(provider, "vkCmdResetQueryPool", supported);
            vkCmdWriteTimestamp = isSupported(provider, "vkCmdWriteTimestamp", supported);
            vkCmdCopyQueryPoolResults = isSupported(provider, "vkCmdCopyQueryPoolResults", supported);
            vkCmdPushConstants = isSupported(provider, "vkCmdPushConstants", supported);
            vkCmdBeginRenderPass = isSupported(provider, "vkCmdBeginRenderPass", supported);
            vkCmdNextSubpass = isSupported(provider, "vkCmdNextSubpass", supported);
            vkCmdEndRenderPass = isSupported(provider, "vkCmdEndRenderPass", supported);
            vkCmdExecuteCommands = isSupported(provider, "vkCmdExecuteCommands", supported);
            Vulkan10 = supported && VK.checkExtension("Vulkan10", VK10.isAvailable(capsInstance, this));
        }
        {
            supported = ext.contains("VK_AMD_draw_indirect_count");
            vkCmdDrawIndirectCountAMD = isSupported(provider, "vkCmdDrawIndirectCountAMD", supported);
            vkCmdDrawIndexedIndirectCountAMD = isSupported(provider, "vkCmdDrawIndexedIndirectCountAMD", supported);
            VK_AMD_draw_indirect_count = supported && VK.checkExtension("VK_AMD_draw_indirect_count", AMDDrawIndirectCount.isAvailable(this));
        }
        VK_AMD_gcn_shader = ext.contains("VK_AMD_gcn_shader");
        VK_AMD_gpu_shader_half_float = ext.contains("VK_AMD_gpu_shader_half_float");
        VK_AMD_gpu_shader_int16 = ext.contains("VK_AMD_gpu_shader_int16");
        VK_AMD_mixed_attachment_samples = ext.contains("VK_AMD_mixed_attachment_samples");
        VK_AMD_negative_viewport_height = ext.contains("VK_AMD_negative_viewport_height");
        VK_AMD_rasterization_order = ext.contains("VK_AMD_rasterization_order");
        VK_AMD_shader_ballot = ext.contains("VK_AMD_shader_ballot");
        VK_AMD_shader_explicit_vertex_parameter = ext.contains("VK_AMD_shader_explicit_vertex_parameter");
        VK_AMD_shader_fragment_mask = ext.contains("VK_AMD_shader_fragment_mask");
        VK_AMD_shader_image_load_store_lod = ext.contains("VK_AMD_shader_image_load_store_lod");
        {
            supported = ext.contains("VK_AMD_shader_info");
            vkGetShaderInfoAMD = isSupported(provider, "vkGetShaderInfoAMD", supported);
            VK_AMD_shader_info = supported && VK.checkExtension("VK_AMD_shader_info", AMDShaderInfo.isAvailable(this));
        }
        VK_AMD_shader_trinary_minmax = ext.contains("VK_AMD_shader_trinary_minmax");
        VK_AMD_texture_gather_bias_lod = ext.contains("VK_AMD_texture_gather_bias_lod");
        VK_EXT_blend_operation_advanced = ext.contains("VK_EXT_blend_operation_advanced");
        VK_EXT_conservative_rasterization = ext.contains("VK_EXT_conservative_rasterization");
        {
            supported = ext.contains("VK_EXT_debug_marker");
            vkDebugMarkerSetObjectTagEXT = isSupported(provider, "vkDebugMarkerSetObjectTagEXT", supported);
            vkDebugMarkerSetObjectNameEXT = isSupported(provider, "vkDebugMarkerSetObjectNameEXT", supported);
            vkCmdDebugMarkerBeginEXT = isSupported(provider, "vkCmdDebugMarkerBeginEXT", supported);
            vkCmdDebugMarkerEndEXT = isSupported(provider, "vkCmdDebugMarkerEndEXT", supported);
            vkCmdDebugMarkerInsertEXT = isSupported(provider, "vkCmdDebugMarkerInsertEXT", supported);
            VK_EXT_debug_marker = supported && VK.checkExtension("VK_EXT_debug_marker", EXTDebugMarker.isAvailable(this));
        }
        VK_EXT_depth_range_unrestricted = ext.contains("VK_EXT_depth_range_unrestricted");
        {
            supported = ext.contains("VK_EXT_discard_rectangles");
            vkCmdSetDiscardRectangleEXT = isSupported(provider, "vkCmdSetDiscardRectangleEXT", supported);
            VK_EXT_discard_rectangles = supported && VK.checkExtension("VK_EXT_discard_rectangles", EXTDiscardRectangles.isAvailable(this));
        }
        {
            supported = ext.contains("VK_EXT_display_control");
            vkDisplayPowerControlEXT = isSupported(provider, "vkDisplayPowerControlEXT", supported);
            vkRegisterDeviceEventEXT = isSupported(provider, "vkRegisterDeviceEventEXT", supported);
            vkRegisterDisplayEventEXT = isSupported(provider, "vkRegisterDisplayEventEXT", supported);
            vkGetSwapchainCounterEXT = isSupported(provider, "vkGetSwapchainCounterEXT", supported);
            VK_EXT_display_control = supported && VK.checkExtension("VK_EXT_display_control", EXTDisplayControl.isAvailable(this));
        }
        VK_EXT_external_memory_dma_buf = ext.contains("VK_EXT_external_memory_dma_buf");
        {
            supported = ext.contains("VK_EXT_external_memory_host");
            vkGetMemoryHostPointerPropertiesEXT = isSupported(provider, "vkGetMemoryHostPointerPropertiesEXT", supported);
            VK_EXT_external_memory_host = supported && VK.checkExtension("VK_EXT_external_memory_host", EXTExternalMemoryHost.isAvailable(this));
        }
        VK_EXT_global_priority = ext.contains("VK_EXT_global_priority");
        {
            supported = ext.contains("VK_EXT_hdr_metadata");
            vkSetHdrMetadataEXT = isSupported(provider, "vkSetHdrMetadataEXT", supported);
            VK_EXT_hdr_metadata = supported && VK.checkExtension("VK_EXT_hdr_metadata", EXTHdrMetadata.isAvailable(this));
        }
        VK_EXT_post_depth_coverage = ext.contains("VK_EXT_post_depth_coverage");
        VK_EXT_queue_family_foreign = ext.contains("VK_EXT_queue_family_foreign");
        {
            supported = ext.contains("VK_EXT_sample_locations");
            vkCmdSetSampleLocationsEXT = isSupported(provider, "vkCmdSetSampleLocationsEXT", supported);
            VK_EXT_sample_locations = supported && VK.checkExtension("VK_EXT_sample_locations", EXTSampleLocations.isAvailable(capsInstance, this));
        }
        VK_EXT_sampler_filter_minmax = ext.contains("VK_EXT_sampler_filter_minmax");
        VK_EXT_shader_stencil_export = ext.contains("VK_EXT_shader_stencil_export");
        VK_EXT_shader_subgroup_ballot = ext.contains("VK_EXT_shader_subgroup_ballot");
        VK_EXT_shader_subgroup_vote = ext.contains("VK_EXT_shader_subgroup_vote");
        VK_EXT_shader_viewport_index_layer = ext.contains("VK_EXT_shader_viewport_index_layer");
        {
            supported = ext.contains("VK_EXT_validation_cache");
            vkCreateValidationCacheEXT = isSupported(provider, "vkCreateValidationCacheEXT", supported);
            vkDestroyValidationCacheEXT = isSupported(provider, "vkDestroyValidationCacheEXT", supported);
            vkMergeValidationCachesEXT = isSupported(provider, "vkMergeValidationCachesEXT", supported);
            vkGetValidationCacheDataEXT = isSupported(provider, "vkGetValidationCacheDataEXT", supported);
            VK_EXT_validation_cache = supported && VK.checkExtension("VK_EXT_validation_cache", EXTValidationCache.isAvailable(this));
        }
        {
            supported = ext.contains("VK_GOOGLE_display_timing");
            vkGetRefreshCycleDurationGOOGLE = isSupported(provider, "vkGetRefreshCycleDurationGOOGLE", supported);
            vkGetPastPresentationTimingGOOGLE = isSupported(provider, "vkGetPastPresentationTimingGOOGLE", supported);
            VK_GOOGLE_display_timing = supported && VK.checkExtension("VK_GOOGLE_display_timing", GOOGLEDisplayTiming.isAvailable(this));
        }
        VK_IMG_filter_cubic = ext.contains("VK_IMG_filter_cubic");
        VK_IMG_format_pvrtc = ext.contains("VK_IMG_format_pvrtc");
        VK_KHR_16bit_storage = ext.contains("VK_KHR_16bit_storage");
        {
            supported = ext.contains("VK_KHR_bind_memory2");
            vkBindBufferMemory2KHR = isSupported(provider, "vkBindBufferMemory2KHR", supported);
            vkBindImageMemory2KHR = isSupported(provider, "vkBindImageMemory2KHR", supported);
            VK_KHR_bind_memory2 = supported && VK.checkExtension("VK_KHR_bind_memory2", KHRBindMemory2.isAvailable(this));
        }
        VK_KHR_dedicated_allocation = ext.contains("VK_KHR_dedicated_allocation");
        {
            supported = ext.contains("VK_KHR_descriptor_update_template");
            vkCreateDescriptorUpdateTemplateKHR = isSupported(provider, "vkCreateDescriptorUpdateTemplateKHR", supported);
            vkDestroyDescriptorUpdateTemplateKHR = isSupported(provider, "vkDestroyDescriptorUpdateTemplateKHR", supported);
            vkUpdateDescriptorSetWithTemplateKHR = isSupported(provider, "vkUpdateDescriptorSetWithTemplateKHR", supported);
            vkCmdPushDescriptorSetWithTemplateKHR = isSupported(provider, "vkCmdPushDescriptorSetWithTemplateKHR", supported);
            VK_KHR_descriptor_update_template = supported && VK.checkExtension("VK_KHR_descriptor_update_template", KHRDescriptorUpdateTemplate.isAvailable(this));
        }
        {
            supported = ext.contains("VK_KHR_display_swapchain");
            vkCreateSharedSwapchainsKHR = isSupported(provider, "vkCreateSharedSwapchainsKHR", supported);
            VK_KHR_display_swapchain = supported && VK.checkExtension("VK_KHR_display_swapchain", KHRDisplaySwapchain.isAvailable(this));
        }
        VK_KHR_external_fence = ext.contains("VK_KHR_external_fence");
        {
            supported = ext.contains("VK_KHR_external_fence_fd");
            vkImportFenceFdKHR = isSupported(provider, "vkImportFenceFdKHR", supported);
            vkGetFenceFdKHR = isSupported(provider, "vkGetFenceFdKHR", supported);
            VK_KHR_external_fence_fd = supported && VK.checkExtension("VK_KHR_external_fence_fd", KHRExternalFenceFd.isAvailable(this));
        }
        {
            supported = ext.contains("VK_KHR_external_fence_win32");
            vkImportFenceWin32HandleKHR = isSupported(provider, "vkImportFenceWin32HandleKHR", supported);
            vkGetFenceWin32HandleKHR = isSupported(provider, "vkGetFenceWin32HandleKHR", supported);
            VK_KHR_external_fence_win32 = supported && VK.checkExtension("VK_KHR_external_fence_win32", KHRExternalFenceWin32.isAvailable(this));
        }
        VK_KHR_external_memory = ext.contains("VK_KHR_external_memory");
        {
            supported = ext.contains("VK_KHR_external_memory_fd");
            vkGetMemoryFdKHR = isSupported(provider, "vkGetMemoryFdKHR", supported);
            vkGetMemoryFdPropertiesKHR = isSupported(provider, "vkGetMemoryFdPropertiesKHR", supported);
            VK_KHR_external_memory_fd = supported && VK.checkExtension("VK_KHR_external_memory_fd", KHRExternalMemoryFd.isAvailable(this));
        }
        {
            supported = ext.contains("VK_KHR_external_memory_win32");
            vkGetMemoryWin32HandleKHR = isSupported(provider, "vkGetMemoryWin32HandleKHR", supported);
            vkGetMemoryWin32HandlePropertiesKHR = isSupported(provider, "vkGetMemoryWin32HandlePropertiesKHR", supported);
            VK_KHR_external_memory_win32 = supported && VK.checkExtension("VK_KHR_external_memory_win32", KHRExternalMemoryWin32.isAvailable(this));
        }
        VK_KHR_external_semaphore = ext.contains("VK_KHR_external_semaphore");
        {
            supported = ext.contains("VK_KHR_external_semaphore_fd");
            vkImportSemaphoreFdKHR = isSupported(provider, "vkImportSemaphoreFdKHR", supported);
            vkGetSemaphoreFdKHR = isSupported(provider, "vkGetSemaphoreFdKHR", supported);
            VK_KHR_external_semaphore_fd = supported && VK.checkExtension("VK_KHR_external_semaphore_fd", KHRExternalSemaphoreFd.isAvailable(this));
        }
        {
            supported = ext.contains("VK_KHR_external_semaphore_win32");
            vkImportSemaphoreWin32HandleKHR = isSupported(provider, "vkImportSemaphoreWin32HandleKHR", supported);
            vkGetSemaphoreWin32HandleKHR = isSupported(provider, "vkGetSemaphoreWin32HandleKHR", supported);
            VK_KHR_external_semaphore_win32 = supported && VK.checkExtension("VK_KHR_external_semaphore_win32", KHRExternalSemaphoreWin32.isAvailable(this));
        }
        {
            supported = ext.contains("VK_KHR_get_memory_requirements2");
            vkGetImageMemoryRequirements2KHR = isSupported(provider, "vkGetImageMemoryRequirements2KHR", supported);
            vkGetBufferMemoryRequirements2KHR = isSupported(provider, "vkGetBufferMemoryRequirements2KHR", supported);
            vkGetImageSparseMemoryRequirements2KHR = isSupported(provider, "vkGetImageSparseMemoryRequirements2KHR", supported);
            VK_KHR_get_memory_requirements2 = supported && VK.checkExtension("VK_KHR_get_memory_requirements2", KHRGetMemoryRequirements2.isAvailable(this));
        }
        VK_KHR_image_format_list = ext.contains("VK_KHR_image_format_list");
        VK_KHR_incremental_present = ext.contains("VK_KHR_incremental_present");
        {
            supported = ext.contains("VK_KHR_maintenance1");
            vkTrimCommandPoolKHR = isSupported(provider, "vkTrimCommandPoolKHR", supported);
            VK_KHR_maintenance1 = supported && VK.checkExtension("VK_KHR_maintenance1", KHRMaintenance1.isAvailable(this));
        }
        VK_KHR_maintenance2 = ext.contains("VK_KHR_maintenance2");
        {
            supported = ext.contains("VK_KHR_push_descriptor");
            vkCmdPushDescriptorSetKHR = isSupported(provider, "vkCmdPushDescriptorSetKHR", supported);
            VK_KHR_push_descriptor = supported && VK.checkExtension("VK_KHR_push_descriptor", KHRPushDescriptor.isAvailable(this));
        }
        VK_KHR_relaxed_block_layout = ext.contains("VK_KHR_relaxed_block_layout");
        VK_KHR_sampler_mirror_clamp_to_edge = ext.contains("VK_KHR_sampler_mirror_clamp_to_edge");
        {
            supported = ext.contains("VK_KHR_sampler_ycbcr_conversion");
            vkCreateSamplerYcbcrConversionKHR = isSupported(provider, "vkCreateSamplerYcbcrConversionKHR", supported);
            vkDestroySamplerYcbcrConversionKHR = isSupported(provider, "vkDestroySamplerYcbcrConversionKHR", supported);
            VK_KHR_sampler_ycbcr_conversion = supported && VK.checkExtension("VK_KHR_sampler_ycbcr_conversion", KHRSamplerYcbcrConversion.isAvailable(this));
        }
        VK_KHR_shader_draw_parameters = ext.contains("VK_KHR_shader_draw_parameters");
        {
            supported = ext.contains("VK_KHR_shared_presentable_image");
            vkGetSwapchainStatusKHR = isSupported(provider, "vkGetSwapchainStatusKHR", supported);
            VK_KHR_shared_presentable_image = supported && VK.checkExtension("VK_KHR_shared_presentable_image", KHRSharedPresentableImage.isAvailable(this));
        }
        VK_KHR_storage_buffer_storage_class = ext.contains("VK_KHR_storage_buffer_storage_class");
        {
            supported = ext.contains("VK_KHR_swapchain");
            vkCreateSwapchainKHR = isSupported(provider, "vkCreateSwapchainKHR", supported);
            vkDestroySwapchainKHR = isSupported(provider, "vkDestroySwapchainKHR", supported);
            vkGetSwapchainImagesKHR = isSupported(provider, "vkGetSwapchainImagesKHR", supported);
            vkAcquireNextImageKHR = isSupported(provider, "vkAcquireNextImageKHR", supported);
            vkQueuePresentKHR = isSupported(provider, "vkQueuePresentKHR", supported);
            VK_KHR_swapchain = supported && VK.checkExtension("VK_KHR_swapchain", KHRSwapchain.isAvailable(this));
        }
        VK_KHR_variable_pointers = ext.contains("VK_KHR_variable_pointers");
        VK_KHR_win32_keyed_mutex = ext.contains("VK_KHR_win32_keyed_mutex");
        {
            supported = ext.contains("VK_KHX_device_group");
            vkGetDeviceGroupPeerMemoryFeaturesKHX = isSupported(provider, "vkGetDeviceGroupPeerMemoryFeaturesKHX", supported);
            vkCmdSetDeviceMaskKHX = isSupported(provider, "vkCmdSetDeviceMaskKHX", supported);
            vkCmdDispatchBaseKHX = isSupported(provider, "vkCmdDispatchBaseKHX", supported);
            vkGetDeviceGroupPresentCapabilitiesKHX = isSupported(provider, "vkGetDeviceGroupPresentCapabilitiesKHX", supported);
            vkGetDeviceGroupSurfacePresentModesKHX = isSupported(provider, "vkGetDeviceGroupSurfacePresentModesKHX", supported);
            vkAcquireNextImage2KHX = isSupported(provider, "vkAcquireNextImage2KHX", supported);
            VK_KHX_device_group = supported && VK.checkExtension("VK_KHX_device_group", KHXDeviceGroup.isAvailable(capsInstance, this, ext));
        }
        VK_KHX_multiview = ext.contains("VK_KHX_multiview");
        {
            supported = ext.contains("VK_NV_clip_space_w_scaling");
            vkCmdSetViewportWScalingNV = isSupported(provider, "vkCmdSetViewportWScalingNV", supported);
            VK_NV_clip_space_w_scaling = supported && VK.checkExtension("VK_NV_clip_space_w_scaling", NVClipSpaceWScaling.isAvailable(this));
        }
        VK_NV_dedicated_allocation = ext.contains("VK_NV_dedicated_allocation");
        VK_NV_external_memory = ext.contains("VK_NV_external_memory");
        {
            supported = ext.contains("VK_NV_external_memory_win32");
            vkGetMemoryWin32HandleNV = isSupported(provider, "vkGetMemoryWin32HandleNV", supported);
            VK_NV_external_memory_win32 = supported && VK.checkExtension("VK_NV_external_memory_win32", NVExternalMemoryWin32.isAvailable(this));
        }
        VK_NV_fill_rectangle = ext.contains("VK_NV_fill_rectangle");
        VK_NV_fragment_coverage_to_color = ext.contains("VK_NV_fragment_coverage_to_color");
        VK_NV_framebuffer_mixed_samples = ext.contains("VK_NV_framebuffer_mixed_samples");
        VK_NV_geometry_shader_passthrough = ext.contains("VK_NV_geometry_shader_passthrough");
        VK_NV_glsl_shader = ext.contains("VK_NV_glsl_shader");
        VK_NV_sample_mask_override_coverage = ext.contains("VK_NV_sample_mask_override_coverage");
        VK_NV_viewport_array2 = ext.contains("VK_NV_viewport_array2");
        VK_NV_viewport_swizzle = ext.contains("VK_NV_viewport_swizzle");
        VK_NV_win32_keyed_mutex = ext.contains("VK_NV_win32_keyed_mutex");
        {
            supported = ext.contains("VK_NVX_device_generated_commands");
            vkCmdProcessCommandsNVX = isSupported(provider, "vkCmdProcessCommandsNVX", supported);
            vkCmdReserveSpaceForCommandsNVX = isSupported(provider, "vkCmdReserveSpaceForCommandsNVX", supported);
            vkCreateIndirectCommandsLayoutNVX = isSupported(provider, "vkCreateIndirectCommandsLayoutNVX", supported);
            vkDestroyIndirectCommandsLayoutNVX = isSupported(provider, "vkDestroyIndirectCommandsLayoutNVX", supported);
            vkCreateObjectTableNVX = isSupported(provider, "vkCreateObjectTableNVX", supported);
            vkDestroyObjectTableNVX = isSupported(provider, "vkDestroyObjectTableNVX", supported);
            vkRegisterObjectsNVX = isSupported(provider, "vkRegisterObjectsNVX", supported);
            vkUnregisterObjectsNVX = isSupported(provider, "vkUnregisterObjectsNVX", supported);
            VK_NVX_device_generated_commands = supported && VK.checkExtension("VK_NVX_device_generated_commands", NVXDeviceGeneratedCommands.isAvailable(capsInstance, this));
        }
        VK_NVX_multiview_per_view_attributes = ext.contains("VK_NVX_multiview_per_view_attributes");
    }

}
