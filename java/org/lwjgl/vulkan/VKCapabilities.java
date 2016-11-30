/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.MemoryUtil.*;

/** Defines the capabilities of a Vulkan {@code VkInstance} or {@code VkDevice}. */
public class VKCapabilities {

	// VK10
	public final long
		vkCreateInstance,
		vkDestroyInstance,
		vkEnumeratePhysicalDevices,
		vkGetPhysicalDeviceFeatures,
		vkGetPhysicalDeviceFormatProperties,
		vkGetPhysicalDeviceImageFormatProperties,
		vkGetPhysicalDeviceProperties,
		vkGetPhysicalDeviceQueueFamilyProperties,
		vkGetPhysicalDeviceMemoryProperties,
		vkGetInstanceProcAddr,
		vkGetDeviceProcAddr,
		vkCreateDevice,
		vkDestroyDevice,
		vkEnumerateInstanceExtensionProperties,
		vkEnumerateDeviceExtensionProperties,
		vkEnumerateInstanceLayerProperties,
		vkEnumerateDeviceLayerProperties,
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
		vkGetPhysicalDeviceSparseImageFormatProperties,
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

	// EXT_debug_report
	public final long
		vkCreateDebugReportCallbackEXT,
		vkDestroyDebugReportCallbackEXT,
		vkDebugReportMessageEXT;

	// KHR_display
	public final long
		vkGetPhysicalDeviceDisplayPropertiesKHR,
		vkGetPhysicalDeviceDisplayPlanePropertiesKHR,
		vkGetDisplayPlaneSupportedDisplaysKHR,
		vkGetDisplayModePropertiesKHR,
		vkCreateDisplayModeKHR,
		vkGetDisplayPlaneCapabilitiesKHR,
		vkCreateDisplayPlaneSurfaceKHR;

	// KHR_display_swapchain
	public final long
		vkCreateSharedSwapchainsKHR;

	// KHR_surface
	public final long
		vkDestroySurfaceKHR,
		vkGetPhysicalDeviceSurfaceSupportKHR,
		vkGetPhysicalDeviceSurfaceCapabilitiesKHR,
		vkGetPhysicalDeviceSurfaceFormatsKHR,
		vkGetPhysicalDeviceSurfacePresentModesKHR;

	// KHR_swapchain
	public final long
		vkCreateSwapchainKHR,
		vkDestroySwapchainKHR,
		vkGetSwapchainImagesKHR,
		vkAcquireNextImageKHR,
		vkQueuePresentKHR;

	// KHR_win32_surface
	public final long
		vkCreateWin32SurfaceKHR,
		vkGetPhysicalDeviceWin32PresentationSupportKHR;

	// KHR_xlib_surface
	public final long
		vkCreateXlibSurfaceKHR,
		vkGetPhysicalDeviceXlibPresentationSupportKHR;

	// NV_external_memory_capabilities
	public final long
		vkGetPhysicalDeviceExternalImageFormatPropertiesNV;

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
		vkUnregisterObjectsNVX,
		vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX;

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
	/** When true, {@link EXTDebugReport} is supported. */
	public final boolean VK_EXT_debug_report;
	/** When true, {@link EXTValidationFlags} is supported. */
	public final boolean VK_EXT_validation_flags;
	/** When true, {@link IMGFilterCubic} is supported. */
	public final boolean VK_IMG_filter_cubic;
	/** When true, {@link IMGFormatPVRTC} is supported. */
	public final boolean VK_IMG_format_pvrtc;
	/** When true, {@link KHRDisplay} is supported. */
	public final boolean VK_KHR_display;
	/** When true, {@link KHRDisplaySwapchain} is supported. */
	public final boolean VK_KHR_display_swapchain;
	/** When true, {@link KHRSamplerMirrorClampToEdge} is supported. */
	public final boolean VK_KHR_sampler_mirror_clamp_to_edge;
	/** When true, {@link KHRSurface} is supported. */
	public final boolean VK_KHR_surface;
	/** When true, {@link KHRSwapchain} is supported. */
	public final boolean VK_KHR_swapchain;
	/** When true, {@link KHRWin32Surface} is supported. */
	public final boolean VK_KHR_win32_surface;
	/** When true, {@link KHRXlibSurface} is supported. */
	public final boolean VK_KHR_xlib_surface;
	/** When true, {@link NVDedicatedAllocation} is supported. */
	public final boolean VK_NV_dedicated_allocation;
	/** When true, {@link NVExternalMemory} is supported. */
	public final boolean VK_NV_external_memory;
	/** When true, {@link NVExternalMemoryCapabilities} is supported. */
	public final boolean VK_NV_external_memory_capabilities;
	/** When true, {@link NVExternalMemoryWin32} is supported. */
	public final boolean VK_NV_external_memory_win32;
	/** When true, {@link NVGLSLShader} is supported. */
	public final boolean VK_NV_glsl_shader;
	/** When true, {@link NVWin32KeyedMutex} is supported. */
	public final boolean VK_NV_win32_keyed_mutex;
	/** When true, {@link NVXDeviceGeneratedCommands} is supported. */
	public final boolean VK_NVX_device_generated_commands;

	VKCapabilities(FunctionProvider provider, int apiVersion, Set<String> ext) {
		this.apiVersion = apiVersion;

		boolean supported;

		{
			vkCreateInstance = provider.getFunctionAddress("vkCreateInstance");
			vkDestroyInstance = provider.getFunctionAddress("vkDestroyInstance");
			vkEnumeratePhysicalDevices = provider.getFunctionAddress("vkEnumeratePhysicalDevices");
			vkGetPhysicalDeviceFeatures = provider.getFunctionAddress("vkGetPhysicalDeviceFeatures");
			vkGetPhysicalDeviceFormatProperties = provider.getFunctionAddress("vkGetPhysicalDeviceFormatProperties");
			vkGetPhysicalDeviceImageFormatProperties = provider.getFunctionAddress("vkGetPhysicalDeviceImageFormatProperties");
			vkGetPhysicalDeviceProperties = provider.getFunctionAddress("vkGetPhysicalDeviceProperties");
			vkGetPhysicalDeviceQueueFamilyProperties = provider.getFunctionAddress("vkGetPhysicalDeviceQueueFamilyProperties");
			vkGetPhysicalDeviceMemoryProperties = provider.getFunctionAddress("vkGetPhysicalDeviceMemoryProperties");
			vkGetInstanceProcAddr = provider.getFunctionAddress("vkGetInstanceProcAddr");
			vkGetDeviceProcAddr = provider.getFunctionAddress("vkGetDeviceProcAddr");
			vkCreateDevice = provider.getFunctionAddress("vkCreateDevice");
			vkDestroyDevice = provider.getFunctionAddress("vkDestroyDevice");
			vkEnumerateInstanceExtensionProperties = provider.getFunctionAddress("vkEnumerateInstanceExtensionProperties");
			vkEnumerateDeviceExtensionProperties = provider.getFunctionAddress("vkEnumerateDeviceExtensionProperties");
			vkEnumerateInstanceLayerProperties = provider.getFunctionAddress("vkEnumerateInstanceLayerProperties");
			vkEnumerateDeviceLayerProperties = provider.getFunctionAddress("vkEnumerateDeviceLayerProperties");
			vkGetDeviceQueue = provider.getFunctionAddress("vkGetDeviceQueue");
			vkQueueSubmit = provider.getFunctionAddress("vkQueueSubmit");
			vkQueueWaitIdle = provider.getFunctionAddress("vkQueueWaitIdle");
			vkDeviceWaitIdle = provider.getFunctionAddress("vkDeviceWaitIdle");
			vkAllocateMemory = provider.getFunctionAddress("vkAllocateMemory");
			vkFreeMemory = provider.getFunctionAddress("vkFreeMemory");
			vkMapMemory = provider.getFunctionAddress("vkMapMemory");
			vkUnmapMemory = provider.getFunctionAddress("vkUnmapMemory");
			vkFlushMappedMemoryRanges = provider.getFunctionAddress("vkFlushMappedMemoryRanges");
			vkInvalidateMappedMemoryRanges = provider.getFunctionAddress("vkInvalidateMappedMemoryRanges");
			vkGetDeviceMemoryCommitment = provider.getFunctionAddress("vkGetDeviceMemoryCommitment");
			vkBindBufferMemory = provider.getFunctionAddress("vkBindBufferMemory");
			vkBindImageMemory = provider.getFunctionAddress("vkBindImageMemory");
			vkGetBufferMemoryRequirements = provider.getFunctionAddress("vkGetBufferMemoryRequirements");
			vkGetImageMemoryRequirements = provider.getFunctionAddress("vkGetImageMemoryRequirements");
			vkGetImageSparseMemoryRequirements = provider.getFunctionAddress("vkGetImageSparseMemoryRequirements");
			vkGetPhysicalDeviceSparseImageFormatProperties = provider.getFunctionAddress("vkGetPhysicalDeviceSparseImageFormatProperties");
			vkQueueBindSparse = provider.getFunctionAddress("vkQueueBindSparse");
			vkCreateFence = provider.getFunctionAddress("vkCreateFence");
			vkDestroyFence = provider.getFunctionAddress("vkDestroyFence");
			vkResetFences = provider.getFunctionAddress("vkResetFences");
			vkGetFenceStatus = provider.getFunctionAddress("vkGetFenceStatus");
			vkWaitForFences = provider.getFunctionAddress("vkWaitForFences");
			vkCreateSemaphore = provider.getFunctionAddress("vkCreateSemaphore");
			vkDestroySemaphore = provider.getFunctionAddress("vkDestroySemaphore");
			vkCreateEvent = provider.getFunctionAddress("vkCreateEvent");
			vkDestroyEvent = provider.getFunctionAddress("vkDestroyEvent");
			vkGetEventStatus = provider.getFunctionAddress("vkGetEventStatus");
			vkSetEvent = provider.getFunctionAddress("vkSetEvent");
			vkResetEvent = provider.getFunctionAddress("vkResetEvent");
			vkCreateQueryPool = provider.getFunctionAddress("vkCreateQueryPool");
			vkDestroyQueryPool = provider.getFunctionAddress("vkDestroyQueryPool");
			vkGetQueryPoolResults = provider.getFunctionAddress("vkGetQueryPoolResults");
			vkCreateBuffer = provider.getFunctionAddress("vkCreateBuffer");
			vkDestroyBuffer = provider.getFunctionAddress("vkDestroyBuffer");
			vkCreateBufferView = provider.getFunctionAddress("vkCreateBufferView");
			vkDestroyBufferView = provider.getFunctionAddress("vkDestroyBufferView");
			vkCreateImage = provider.getFunctionAddress("vkCreateImage");
			vkDestroyImage = provider.getFunctionAddress("vkDestroyImage");
			vkGetImageSubresourceLayout = provider.getFunctionAddress("vkGetImageSubresourceLayout");
			vkCreateImageView = provider.getFunctionAddress("vkCreateImageView");
			vkDestroyImageView = provider.getFunctionAddress("vkDestroyImageView");
			vkCreateShaderModule = provider.getFunctionAddress("vkCreateShaderModule");
			vkDestroyShaderModule = provider.getFunctionAddress("vkDestroyShaderModule");
			vkCreatePipelineCache = provider.getFunctionAddress("vkCreatePipelineCache");
			vkDestroyPipelineCache = provider.getFunctionAddress("vkDestroyPipelineCache");
			vkGetPipelineCacheData = provider.getFunctionAddress("vkGetPipelineCacheData");
			vkMergePipelineCaches = provider.getFunctionAddress("vkMergePipelineCaches");
			vkCreateGraphicsPipelines = provider.getFunctionAddress("vkCreateGraphicsPipelines");
			vkCreateComputePipelines = provider.getFunctionAddress("vkCreateComputePipelines");
			vkDestroyPipeline = provider.getFunctionAddress("vkDestroyPipeline");
			vkCreatePipelineLayout = provider.getFunctionAddress("vkCreatePipelineLayout");
			vkDestroyPipelineLayout = provider.getFunctionAddress("vkDestroyPipelineLayout");
			vkCreateSampler = provider.getFunctionAddress("vkCreateSampler");
			vkDestroySampler = provider.getFunctionAddress("vkDestroySampler");
			vkCreateDescriptorSetLayout = provider.getFunctionAddress("vkCreateDescriptorSetLayout");
			vkDestroyDescriptorSetLayout = provider.getFunctionAddress("vkDestroyDescriptorSetLayout");
			vkCreateDescriptorPool = provider.getFunctionAddress("vkCreateDescriptorPool");
			vkDestroyDescriptorPool = provider.getFunctionAddress("vkDestroyDescriptorPool");
			vkResetDescriptorPool = provider.getFunctionAddress("vkResetDescriptorPool");
			vkAllocateDescriptorSets = provider.getFunctionAddress("vkAllocateDescriptorSets");
			vkFreeDescriptorSets = provider.getFunctionAddress("vkFreeDescriptorSets");
			vkUpdateDescriptorSets = provider.getFunctionAddress("vkUpdateDescriptorSets");
			vkCreateFramebuffer = provider.getFunctionAddress("vkCreateFramebuffer");
			vkDestroyFramebuffer = provider.getFunctionAddress("vkDestroyFramebuffer");
			vkCreateRenderPass = provider.getFunctionAddress("vkCreateRenderPass");
			vkDestroyRenderPass = provider.getFunctionAddress("vkDestroyRenderPass");
			vkGetRenderAreaGranularity = provider.getFunctionAddress("vkGetRenderAreaGranularity");
			vkCreateCommandPool = provider.getFunctionAddress("vkCreateCommandPool");
			vkDestroyCommandPool = provider.getFunctionAddress("vkDestroyCommandPool");
			vkResetCommandPool = provider.getFunctionAddress("vkResetCommandPool");
			vkAllocateCommandBuffers = provider.getFunctionAddress("vkAllocateCommandBuffers");
			vkFreeCommandBuffers = provider.getFunctionAddress("vkFreeCommandBuffers");
			vkBeginCommandBuffer = provider.getFunctionAddress("vkBeginCommandBuffer");
			vkEndCommandBuffer = provider.getFunctionAddress("vkEndCommandBuffer");
			vkResetCommandBuffer = provider.getFunctionAddress("vkResetCommandBuffer");
			vkCmdBindPipeline = provider.getFunctionAddress("vkCmdBindPipeline");
			vkCmdSetViewport = provider.getFunctionAddress("vkCmdSetViewport");
			vkCmdSetScissor = provider.getFunctionAddress("vkCmdSetScissor");
			vkCmdSetLineWidth = provider.getFunctionAddress("vkCmdSetLineWidth");
			vkCmdSetDepthBias = provider.getFunctionAddress("vkCmdSetDepthBias");
			vkCmdSetBlendConstants = provider.getFunctionAddress("vkCmdSetBlendConstants");
			vkCmdSetDepthBounds = provider.getFunctionAddress("vkCmdSetDepthBounds");
			vkCmdSetStencilCompareMask = provider.getFunctionAddress("vkCmdSetStencilCompareMask");
			vkCmdSetStencilWriteMask = provider.getFunctionAddress("vkCmdSetStencilWriteMask");
			vkCmdSetStencilReference = provider.getFunctionAddress("vkCmdSetStencilReference");
			vkCmdBindDescriptorSets = provider.getFunctionAddress("vkCmdBindDescriptorSets");
			vkCmdBindIndexBuffer = provider.getFunctionAddress("vkCmdBindIndexBuffer");
			vkCmdBindVertexBuffers = provider.getFunctionAddress("vkCmdBindVertexBuffers");
			vkCmdDraw = provider.getFunctionAddress("vkCmdDraw");
			vkCmdDrawIndexed = provider.getFunctionAddress("vkCmdDrawIndexed");
			vkCmdDrawIndirect = provider.getFunctionAddress("vkCmdDrawIndirect");
			vkCmdDrawIndexedIndirect = provider.getFunctionAddress("vkCmdDrawIndexedIndirect");
			vkCmdDispatch = provider.getFunctionAddress("vkCmdDispatch");
			vkCmdDispatchIndirect = provider.getFunctionAddress("vkCmdDispatchIndirect");
			vkCmdCopyBuffer = provider.getFunctionAddress("vkCmdCopyBuffer");
			vkCmdCopyImage = provider.getFunctionAddress("vkCmdCopyImage");
			vkCmdBlitImage = provider.getFunctionAddress("vkCmdBlitImage");
			vkCmdCopyBufferToImage = provider.getFunctionAddress("vkCmdCopyBufferToImage");
			vkCmdCopyImageToBuffer = provider.getFunctionAddress("vkCmdCopyImageToBuffer");
			vkCmdUpdateBuffer = provider.getFunctionAddress("vkCmdUpdateBuffer");
			vkCmdFillBuffer = provider.getFunctionAddress("vkCmdFillBuffer");
			vkCmdClearColorImage = provider.getFunctionAddress("vkCmdClearColorImage");
			vkCmdClearDepthStencilImage = provider.getFunctionAddress("vkCmdClearDepthStencilImage");
			vkCmdClearAttachments = provider.getFunctionAddress("vkCmdClearAttachments");
			vkCmdResolveImage = provider.getFunctionAddress("vkCmdResolveImage");
			vkCmdSetEvent = provider.getFunctionAddress("vkCmdSetEvent");
			vkCmdResetEvent = provider.getFunctionAddress("vkCmdResetEvent");
			vkCmdWaitEvents = provider.getFunctionAddress("vkCmdWaitEvents");
			vkCmdPipelineBarrier = provider.getFunctionAddress("vkCmdPipelineBarrier");
			vkCmdBeginQuery = provider.getFunctionAddress("vkCmdBeginQuery");
			vkCmdEndQuery = provider.getFunctionAddress("vkCmdEndQuery");
			vkCmdResetQueryPool = provider.getFunctionAddress("vkCmdResetQueryPool");
			vkCmdWriteTimestamp = provider.getFunctionAddress("vkCmdWriteTimestamp");
			vkCmdCopyQueryPoolResults = provider.getFunctionAddress("vkCmdCopyQueryPoolResults");
			vkCmdPushConstants = provider.getFunctionAddress("vkCmdPushConstants");
			vkCmdBeginRenderPass = provider.getFunctionAddress("vkCmdBeginRenderPass");
			vkCmdNextSubpass = provider.getFunctionAddress("vkCmdNextSubpass");
			vkCmdEndRenderPass = provider.getFunctionAddress("vkCmdEndRenderPass");
			vkCmdExecuteCommands = provider.getFunctionAddress("vkCmdExecuteCommands");
			Vulkan10 = VK.checkExtension("Vulkan10", VK10.isAvailable(this));
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
			supported = ext.contains("VK_EXT_debug_report");
			vkCreateDebugReportCallbackEXT = isSupported(provider, "vkCreateDebugReportCallbackEXT", supported);
			vkDestroyDebugReportCallbackEXT = isSupported(provider, "vkDestroyDebugReportCallbackEXT", supported);
			vkDebugReportMessageEXT = isSupported(provider, "vkDebugReportMessageEXT", supported);
			VK_EXT_debug_report = supported && VK.checkExtension("VK_EXT_debug_report", EXTDebugReport.isAvailable(this));
		}
		VK_EXT_validation_flags = ext.contains("VK_EXT_validation_flags");
		VK_IMG_filter_cubic = ext.contains("VK_IMG_filter_cubic");
		VK_IMG_format_pvrtc = ext.contains("VK_IMG_format_pvrtc");
		{
			supported = ext.contains("VK_KHR_display");
			vkGetPhysicalDeviceDisplayPropertiesKHR = isSupported(provider, "vkGetPhysicalDeviceDisplayPropertiesKHR", supported);
			vkGetPhysicalDeviceDisplayPlanePropertiesKHR = isSupported(provider, "vkGetPhysicalDeviceDisplayPlanePropertiesKHR", supported);
			vkGetDisplayPlaneSupportedDisplaysKHR = isSupported(provider, "vkGetDisplayPlaneSupportedDisplaysKHR", supported);
			vkGetDisplayModePropertiesKHR = isSupported(provider, "vkGetDisplayModePropertiesKHR", supported);
			vkCreateDisplayModeKHR = isSupported(provider, "vkCreateDisplayModeKHR", supported);
			vkGetDisplayPlaneCapabilitiesKHR = isSupported(provider, "vkGetDisplayPlaneCapabilitiesKHR", supported);
			vkCreateDisplayPlaneSurfaceKHR = isSupported(provider, "vkCreateDisplayPlaneSurfaceKHR", supported);
			VK_KHR_display = supported && VK.checkExtension("VK_KHR_display", KHRDisplay.isAvailable(this));
		}
		{
			supported = ext.contains("VK_KHR_display_swapchain");
			vkCreateSharedSwapchainsKHR = isSupported(provider, "vkCreateSharedSwapchainsKHR", supported);
			VK_KHR_display_swapchain = supported && VK.checkExtension("VK_KHR_display_swapchain", KHRDisplaySwapchain.isAvailable(this));
		}
		VK_KHR_sampler_mirror_clamp_to_edge = ext.contains("VK_KHR_sampler_mirror_clamp_to_edge");
		{
			supported = ext.contains("VK_KHR_surface");
			vkDestroySurfaceKHR = isSupported(provider, "vkDestroySurfaceKHR", supported);
			vkGetPhysicalDeviceSurfaceSupportKHR = isSupported(provider, "vkGetPhysicalDeviceSurfaceSupportKHR", supported);
			vkGetPhysicalDeviceSurfaceCapabilitiesKHR = isSupported(provider, "vkGetPhysicalDeviceSurfaceCapabilitiesKHR", supported);
			vkGetPhysicalDeviceSurfaceFormatsKHR = isSupported(provider, "vkGetPhysicalDeviceSurfaceFormatsKHR", supported);
			vkGetPhysicalDeviceSurfacePresentModesKHR = isSupported(provider, "vkGetPhysicalDeviceSurfacePresentModesKHR", supported);
			VK_KHR_surface = supported && VK.checkExtension("VK_KHR_surface", KHRSurface.isAvailable(this));
		}
		{
			supported = ext.contains("VK_KHR_swapchain");
			vkCreateSwapchainKHR = isSupported(provider, "vkCreateSwapchainKHR", supported);
			vkDestroySwapchainKHR = isSupported(provider, "vkDestroySwapchainKHR", supported);
			vkGetSwapchainImagesKHR = isSupported(provider, "vkGetSwapchainImagesKHR", supported);
			vkAcquireNextImageKHR = isSupported(provider, "vkAcquireNextImageKHR", supported);
			vkQueuePresentKHR = isSupported(provider, "vkQueuePresentKHR", supported);
			VK_KHR_swapchain = supported && VK.checkExtension("VK_KHR_swapchain", KHRSwapchain.isAvailable(this));
		}
		{
			supported = ext.contains("VK_KHR_win32_surface");
			vkCreateWin32SurfaceKHR = isSupported(provider, "vkCreateWin32SurfaceKHR", supported);
			vkGetPhysicalDeviceWin32PresentationSupportKHR = isSupported(provider, "vkGetPhysicalDeviceWin32PresentationSupportKHR", supported);
			VK_KHR_win32_surface = supported && VK.checkExtension("VK_KHR_win32_surface", KHRWin32Surface.isAvailable(this));
		}
		{
			supported = ext.contains("VK_KHR_xlib_surface");
			vkCreateXlibSurfaceKHR = isSupported(provider, "vkCreateXlibSurfaceKHR", supported);
			vkGetPhysicalDeviceXlibPresentationSupportKHR = isSupported(provider, "vkGetPhysicalDeviceXlibPresentationSupportKHR", supported);
			VK_KHR_xlib_surface = supported && VK.checkExtension("VK_KHR_xlib_surface", KHRXlibSurface.isAvailable(this));
		}
		VK_NV_dedicated_allocation = ext.contains("VK_NV_dedicated_allocation");
		VK_NV_external_memory = ext.contains("VK_NV_external_memory");
		{
			supported = ext.contains("VK_NV_external_memory_capabilities");
			vkGetPhysicalDeviceExternalImageFormatPropertiesNV = isSupported(provider, "vkGetPhysicalDeviceExternalImageFormatPropertiesNV", supported);
			VK_NV_external_memory_capabilities = supported && VK.checkExtension("VK_NV_external_memory_capabilities", NVExternalMemoryCapabilities.isAvailable(this));
		}
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
			vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX = isSupported(provider, "vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX", supported);
			VK_NVX_device_generated_commands = supported && VK.checkExtension("VK_NVX_device_generated_commands", NVXDeviceGeneratedCommands.isAvailable(this));
		}

	}

	private static long isSupported(FunctionProvider provider, String functionName, boolean extensionSupported) {
		return extensionSupported ? provider.getFunctionAddress(functionName) : NULL;
	}

}
