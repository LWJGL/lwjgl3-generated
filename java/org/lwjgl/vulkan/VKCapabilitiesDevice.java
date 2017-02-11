/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.util.Set;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
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

	// EXT_debug_marker
	public final long
		vkDebugMarkerSetObjectTagEXT,
		vkDebugMarkerSetObjectNameEXT,
		vkCmdDebugMarkerBeginEXT,
		vkCmdDebugMarkerEndEXT,
		vkCmdDebugMarkerInsertEXT;

	// EXT_display_control
	public final long
		vkDisplayPowerControlEXT,
		vkRegisterDeviceEventEXT,
		vkRegisterDisplayEventEXT,
		vkGetSwapchainCounterEXT;

	// KHR_display_swapchain
	public final long
		vkCreateSharedSwapchainsKHR;

	// KHR_maintenance1
	public final long
		vkTrimCommandPoolKHR;

	// KHR_swapchain
	public final long
		vkCreateSwapchainKHR,
		vkDestroySwapchainKHR,
		vkGetSwapchainImagesKHR,
		vkAcquireNextImageKHR,
		vkQueuePresentKHR;

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
	/** When true, {@link AMDNegativeViewportHeight} is supported. */
	public final boolean VK_AMD_negative_viewport_height;
	/** When true, {@link AMDRasterizationOrder} is supported. */
	public final boolean VK_AMD_rasterization_order;
	/** When true, {@link AMDShaderBallot} is supported. */
	public final boolean VK_AMD_shader_ballot;
	/** When true, {@link AMDShaderExplicitVertexParameter} is supported. */
	public final boolean VK_AMD_shader_explicit_vertex_parameter;
	/** When true, {@link AMDShaderTrinaryMinmax} is supported. */
	public final boolean VK_AMD_shader_trinary_minmax;
	/** When true, {@link EXTDebugMarker} is supported. */
	public final boolean VK_EXT_debug_marker;
	/** When true, {@link EXTDisplayControl} is supported. */
	public final boolean VK_EXT_display_control;
	/** When true, {@link EXTShaderSubgroupBallot} is supported. */
	public final boolean VK_EXT_shader_subgroup_ballot;
	/** When true, {@link EXTShaderSubgroupVote} is supported. */
	public final boolean VK_EXT_shader_subgroup_vote;
	/** When true, {@link EXTSwapchainColorspace} is supported. */
	public final boolean VK_EXT_swapchain_colorspace;
	/** When true, {@link IMGFilterCubic} is supported. */
	public final boolean VK_IMG_filter_cubic;
	/** When true, {@link IMGFormatPVRTC} is supported. */
	public final boolean VK_IMG_format_pvrtc;
	/** When true, {@link KHRDisplaySwapchain} is supported. */
	public final boolean VK_KHR_display_swapchain;
	/** When true, {@link KHRMaintenance1} is supported. */
	public final boolean VK_KHR_maintenance1;
	/** When true, {@link KHRSamplerMirrorClampToEdge} is supported. */
	public final boolean VK_KHR_sampler_mirror_clamp_to_edge;
	/** When true, {@link KHRShaderDrawParameters} is supported. */
	public final boolean VK_KHR_shader_draw_parameters;
	/** When true, {@link KHRSwapchain} is supported. */
	public final boolean VK_KHR_swapchain;
	/** When true, {@link NVDedicatedAllocation} is supported. */
	public final boolean VK_NV_dedicated_allocation;
	/** When true, {@link NVExternalMemory} is supported. */
	public final boolean VK_NV_external_memory;
	/** When true, {@link NVExternalMemoryWin32} is supported. */
	public final boolean VK_NV_external_memory_win32;
	/** When true, {@link NVGLSLShader} is supported. */
	public final boolean VK_NV_glsl_shader;
	/** When true, {@link NVWin32KeyedMutex} is supported. */
	public final boolean VK_NV_win32_keyed_mutex;
	/** When true, {@link NVXDeviceGeneratedCommands} is supported. */
	public final boolean VK_NVX_device_generated_commands;

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
		VK_AMD_negative_viewport_height = ext.contains("VK_AMD_negative_viewport_height");
		VK_AMD_rasterization_order = ext.contains("VK_AMD_rasterization_order");
		VK_AMD_shader_ballot = ext.contains("VK_AMD_shader_ballot");
		VK_AMD_shader_explicit_vertex_parameter = ext.contains("VK_AMD_shader_explicit_vertex_parameter");
		VK_AMD_shader_trinary_minmax = ext.contains("VK_AMD_shader_trinary_minmax");
		{
			supported = ext.contains("VK_EXT_debug_marker");
			vkDebugMarkerSetObjectTagEXT = isSupported(provider, "vkDebugMarkerSetObjectTagEXT", supported);
			vkDebugMarkerSetObjectNameEXT = isSupported(provider, "vkDebugMarkerSetObjectNameEXT", supported);
			vkCmdDebugMarkerBeginEXT = isSupported(provider, "vkCmdDebugMarkerBeginEXT", supported);
			vkCmdDebugMarkerEndEXT = isSupported(provider, "vkCmdDebugMarkerEndEXT", supported);
			vkCmdDebugMarkerInsertEXT = isSupported(provider, "vkCmdDebugMarkerInsertEXT", supported);
			VK_EXT_debug_marker = supported && VK.checkExtension("VK_EXT_debug_marker", EXTDebugMarker.isAvailable(this));
		}
		{
			supported = ext.contains("VK_EXT_display_control");
			vkDisplayPowerControlEXT = isSupported(provider, "vkDisplayPowerControlEXT", supported);
			vkRegisterDeviceEventEXT = isSupported(provider, "vkRegisterDeviceEventEXT", supported);
			vkRegisterDisplayEventEXT = isSupported(provider, "vkRegisterDisplayEventEXT", supported);
			vkGetSwapchainCounterEXT = isSupported(provider, "vkGetSwapchainCounterEXT", supported);
			VK_EXT_display_control = supported && VK.checkExtension("VK_EXT_display_control", EXTDisplayControl.isAvailable(this));
		}
		VK_EXT_shader_subgroup_ballot = ext.contains("VK_EXT_shader_subgroup_ballot");
		VK_EXT_shader_subgroup_vote = ext.contains("VK_EXT_shader_subgroup_vote");
		VK_EXT_swapchain_colorspace = ext.contains("VK_EXT_swapchain_colorspace");
		VK_IMG_filter_cubic = ext.contains("VK_IMG_filter_cubic");
		VK_IMG_format_pvrtc = ext.contains("VK_IMG_format_pvrtc");
		{
			supported = ext.contains("VK_KHR_display_swapchain");
			vkCreateSharedSwapchainsKHR = isSupported(provider, "vkCreateSharedSwapchainsKHR", supported);
			VK_KHR_display_swapchain = supported && VK.checkExtension("VK_KHR_display_swapchain", KHRDisplaySwapchain.isAvailable(this));
		}
		{
			supported = ext.contains("VK_KHR_maintenance1");
			vkTrimCommandPoolKHR = isSupported(provider, "vkTrimCommandPoolKHR", supported);
			VK_KHR_maintenance1 = supported && VK.checkExtension("VK_KHR_maintenance1", KHRMaintenance1.isAvailable(this));
		}
		VK_KHR_sampler_mirror_clamp_to_edge = ext.contains("VK_KHR_sampler_mirror_clamp_to_edge");
		VK_KHR_shader_draw_parameters = ext.contains("VK_KHR_shader_draw_parameters");
		{
			supported = ext.contains("VK_KHR_swapchain");
			vkCreateSwapchainKHR = isSupported(provider, "vkCreateSwapchainKHR", supported);
			vkDestroySwapchainKHR = isSupported(provider, "vkDestroySwapchainKHR", supported);
			vkGetSwapchainImagesKHR = isSupported(provider, "vkGetSwapchainImagesKHR", supported);
			vkAcquireNextImageKHR = isSupported(provider, "vkAcquireNextImageKHR", supported);
			vkQueuePresentKHR = isSupported(provider, "vkQueuePresentKHR", supported);
			VK_KHR_swapchain = supported && VK.checkExtension("VK_KHR_swapchain", KHRSwapchain.isAvailable(this));
		}
		VK_NV_dedicated_allocation = ext.contains("VK_NV_dedicated_allocation");
		VK_NV_external_memory = ext.contains("VK_NV_external_memory");
		{
			supported = ext.contains("VK_NV_external_memory_win32");
			vkGetMemoryWin32HandleNV = isSupported(provider, "vkGetMemoryWin32HandleNV", supported);
			VK_NV_external_memory_win32 = supported && VK.checkExtension("VK_NV_external_memory_win32", NVExternalMemoryWin32.isAvailable(this));
		}
		VK_NV_glsl_shader = ext.contains("VK_NV_glsl_shader");
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
	}

}
