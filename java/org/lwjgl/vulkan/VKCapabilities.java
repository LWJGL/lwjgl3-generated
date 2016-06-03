/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;
import java.util.Set;

/** Defines the capabilities of a Vulkan {@code VkInstance} or {@code VkDevice}. */
public class VKCapabilities {

	public final long
		vkAcquireNextImageKHR,
		vkAllocateCommandBuffers,
		vkAllocateDescriptorSets,
		vkAllocateMemory,
		vkBeginCommandBuffer,
		vkBindBufferMemory,
		vkBindImageMemory,
		vkCmdBeginQuery,
		vkCmdBeginRenderPass,
		vkCmdBindDescriptorSets,
		vkCmdBindIndexBuffer,
		vkCmdBindPipeline,
		vkCmdBindVertexBuffers,
		vkCmdBlitImage,
		vkCmdClearAttachments,
		vkCmdClearColorImage,
		vkCmdClearDepthStencilImage,
		vkCmdCopyBuffer,
		vkCmdCopyBufferToImage,
		vkCmdCopyImage,
		vkCmdCopyImageToBuffer,
		vkCmdCopyQueryPoolResults,
		vkCmdDebugMarkerBeginEXT,
		vkCmdDebugMarkerEndEXT,
		vkCmdDebugMarkerInsertEXT,
		vkCmdDispatch,
		vkCmdDispatchIndirect,
		vkCmdDraw,
		vkCmdDrawIndexed,
		vkCmdDrawIndexedIndirect,
		vkCmdDrawIndirect,
		vkCmdEndQuery,
		vkCmdEndRenderPass,
		vkCmdExecuteCommands,
		vkCmdFillBuffer,
		vkCmdNextSubpass,
		vkCmdPipelineBarrier,
		vkCmdPushConstants,
		vkCmdResetEvent,
		vkCmdResetQueryPool,
		vkCmdResolveImage,
		vkCmdSetBlendConstants,
		vkCmdSetDepthBias,
		vkCmdSetDepthBounds,
		vkCmdSetEvent,
		vkCmdSetLineWidth,
		vkCmdSetScissor,
		vkCmdSetStencilCompareMask,
		vkCmdSetStencilReference,
		vkCmdSetStencilWriteMask,
		vkCmdSetViewport,
		vkCmdUpdateBuffer,
		vkCmdWaitEvents,
		vkCmdWriteTimestamp,
		vkCreateBuffer,
		vkCreateBufferView,
		vkCreateCommandPool,
		vkCreateComputePipelines,
		vkCreateDebugReportCallbackEXT,
		vkCreateDescriptorPool,
		vkCreateDescriptorSetLayout,
		vkCreateDevice,
		vkCreateDisplayModeKHR,
		vkCreateDisplayPlaneSurfaceKHR,
		vkCreateEvent,
		vkCreateFence,
		vkCreateFramebuffer,
		vkCreateGraphicsPipelines,
		vkCreateImage,
		vkCreateImageView,
		vkCreateInstance,
		vkCreatePipelineCache,
		vkCreatePipelineLayout,
		vkCreateQueryPool,
		vkCreateRenderPass,
		vkCreateSampler,
		vkCreateSemaphore,
		vkCreateShaderModule,
		vkCreateSharedSwapchainsKHR,
		vkCreateSwapchainKHR,
		vkCreateWin32SurfaceKHR,
		vkCreateXlibSurfaceKHR,
		vkDebugMarkerSetObjectNameEXT,
		vkDebugMarkerSetObjectTagEXT,
		vkDebugReportMessageEXT,
		vkDestroyBuffer,
		vkDestroyBufferView,
		vkDestroyCommandPool,
		vkDestroyDebugReportCallbackEXT,
		vkDestroyDescriptorPool,
		vkDestroyDescriptorSetLayout,
		vkDestroyDevice,
		vkDestroyEvent,
		vkDestroyFence,
		vkDestroyFramebuffer,
		vkDestroyImage,
		vkDestroyImageView,
		vkDestroyInstance,
		vkDestroyPipeline,
		vkDestroyPipelineCache,
		vkDestroyPipelineLayout,
		vkDestroyQueryPool,
		vkDestroyRenderPass,
		vkDestroySampler,
		vkDestroySemaphore,
		vkDestroyShaderModule,
		vkDestroySurfaceKHR,
		vkDestroySwapchainKHR,
		vkDeviceWaitIdle,
		vkEndCommandBuffer,
		vkEnumerateDeviceExtensionProperties,
		vkEnumerateDeviceLayerProperties,
		vkEnumerateInstanceExtensionProperties,
		vkEnumerateInstanceLayerProperties,
		vkEnumeratePhysicalDevices,
		vkFlushMappedMemoryRanges,
		vkFreeCommandBuffers,
		vkFreeDescriptorSets,
		vkFreeMemory,
		vkGetBufferMemoryRequirements,
		vkGetDeviceMemoryCommitment,
		vkGetDeviceProcAddr,
		vkGetDeviceQueue,
		vkGetDisplayModePropertiesKHR,
		vkGetDisplayPlaneCapabilitiesKHR,
		vkGetDisplayPlaneSupportedDisplaysKHR,
		vkGetEventStatus,
		vkGetFenceStatus,
		vkGetImageMemoryRequirements,
		vkGetImageSparseMemoryRequirements,
		vkGetImageSubresourceLayout,
		vkGetInstanceProcAddr,
		vkGetPhysicalDeviceDisplayPlanePropertiesKHR,
		vkGetPhysicalDeviceDisplayPropertiesKHR,
		vkGetPhysicalDeviceFeatures,
		vkGetPhysicalDeviceFormatProperties,
		vkGetPhysicalDeviceImageFormatProperties,
		vkGetPhysicalDeviceMemoryProperties,
		vkGetPhysicalDeviceProperties,
		vkGetPhysicalDeviceQueueFamilyProperties,
		vkGetPhysicalDeviceSparseImageFormatProperties,
		vkGetPhysicalDeviceSurfaceCapabilitiesKHR,
		vkGetPhysicalDeviceSurfaceFormatsKHR,
		vkGetPhysicalDeviceSurfacePresentModesKHR,
		vkGetPhysicalDeviceSurfaceSupportKHR,
		vkGetPhysicalDeviceWin32PresentationSupportKHR,
		vkGetPhysicalDeviceXlibPresentationSupportKHR,
		vkGetPipelineCacheData,
		vkGetQueryPoolResults,
		vkGetRenderAreaGranularity,
		vkGetSwapchainImagesKHR,
		vkInvalidateMappedMemoryRanges,
		vkMapMemory,
		vkMergePipelineCaches,
		vkQueueBindSparse,
		vkQueuePresentKHR,
		vkQueueSubmit,
		vkQueueWaitIdle,
		vkResetCommandBuffer,
		vkResetCommandPool,
		vkResetDescriptorPool,
		vkResetEvent,
		vkResetFences,
		vkSetEvent,
		vkUnmapMemory,
		vkUpdateDescriptorSets,
		vkWaitForFences;


	/** The Vulkan API version number. */
	public final int apiVersion;

	/** When true, {@link VK10} is supported. */
	public final boolean Vulkan10;
	/** When true, {@link AMDGCNShader} is supported. */
	public final boolean VK_AMD_gcn_shader;
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
	/** When true, {@link IMGFilterCubic} is supported. */
	public final boolean VK_IMG_filter_cubic;
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
	/** When true, {@link NVGLSLShader} is supported. */
	public final boolean VK_NV_glsl_shader;

	VKCapabilities(FunctionProvider provider, int apiVersion, Set<String> ext) {
		this.apiVersion = apiVersion;

		vkAcquireNextImageKHR = provider.getFunctionAddress("vkAcquireNextImageKHR");
		vkAllocateCommandBuffers = provider.getFunctionAddress("vkAllocateCommandBuffers");
		vkAllocateDescriptorSets = provider.getFunctionAddress("vkAllocateDescriptorSets");
		vkAllocateMemory = provider.getFunctionAddress("vkAllocateMemory");
		vkBeginCommandBuffer = provider.getFunctionAddress("vkBeginCommandBuffer");
		vkBindBufferMemory = provider.getFunctionAddress("vkBindBufferMemory");
		vkBindImageMemory = provider.getFunctionAddress("vkBindImageMemory");
		vkCmdBeginQuery = provider.getFunctionAddress("vkCmdBeginQuery");
		vkCmdBeginRenderPass = provider.getFunctionAddress("vkCmdBeginRenderPass");
		vkCmdBindDescriptorSets = provider.getFunctionAddress("vkCmdBindDescriptorSets");
		vkCmdBindIndexBuffer = provider.getFunctionAddress("vkCmdBindIndexBuffer");
		vkCmdBindPipeline = provider.getFunctionAddress("vkCmdBindPipeline");
		vkCmdBindVertexBuffers = provider.getFunctionAddress("vkCmdBindVertexBuffers");
		vkCmdBlitImage = provider.getFunctionAddress("vkCmdBlitImage");
		vkCmdClearAttachments = provider.getFunctionAddress("vkCmdClearAttachments");
		vkCmdClearColorImage = provider.getFunctionAddress("vkCmdClearColorImage");
		vkCmdClearDepthStencilImage = provider.getFunctionAddress("vkCmdClearDepthStencilImage");
		vkCmdCopyBuffer = provider.getFunctionAddress("vkCmdCopyBuffer");
		vkCmdCopyBufferToImage = provider.getFunctionAddress("vkCmdCopyBufferToImage");
		vkCmdCopyImage = provider.getFunctionAddress("vkCmdCopyImage");
		vkCmdCopyImageToBuffer = provider.getFunctionAddress("vkCmdCopyImageToBuffer");
		vkCmdCopyQueryPoolResults = provider.getFunctionAddress("vkCmdCopyQueryPoolResults");
		vkCmdDebugMarkerBeginEXT = provider.getFunctionAddress("vkCmdDebugMarkerBeginEXT");
		vkCmdDebugMarkerEndEXT = provider.getFunctionAddress("vkCmdDebugMarkerEndEXT");
		vkCmdDebugMarkerInsertEXT = provider.getFunctionAddress("vkCmdDebugMarkerInsertEXT");
		vkCmdDispatch = provider.getFunctionAddress("vkCmdDispatch");
		vkCmdDispatchIndirect = provider.getFunctionAddress("vkCmdDispatchIndirect");
		vkCmdDraw = provider.getFunctionAddress("vkCmdDraw");
		vkCmdDrawIndexed = provider.getFunctionAddress("vkCmdDrawIndexed");
		vkCmdDrawIndexedIndirect = provider.getFunctionAddress("vkCmdDrawIndexedIndirect");
		vkCmdDrawIndirect = provider.getFunctionAddress("vkCmdDrawIndirect");
		vkCmdEndQuery = provider.getFunctionAddress("vkCmdEndQuery");
		vkCmdEndRenderPass = provider.getFunctionAddress("vkCmdEndRenderPass");
		vkCmdExecuteCommands = provider.getFunctionAddress("vkCmdExecuteCommands");
		vkCmdFillBuffer = provider.getFunctionAddress("vkCmdFillBuffer");
		vkCmdNextSubpass = provider.getFunctionAddress("vkCmdNextSubpass");
		vkCmdPipelineBarrier = provider.getFunctionAddress("vkCmdPipelineBarrier");
		vkCmdPushConstants = provider.getFunctionAddress("vkCmdPushConstants");
		vkCmdResetEvent = provider.getFunctionAddress("vkCmdResetEvent");
		vkCmdResetQueryPool = provider.getFunctionAddress("vkCmdResetQueryPool");
		vkCmdResolveImage = provider.getFunctionAddress("vkCmdResolveImage");
		vkCmdSetBlendConstants = provider.getFunctionAddress("vkCmdSetBlendConstants");
		vkCmdSetDepthBias = provider.getFunctionAddress("vkCmdSetDepthBias");
		vkCmdSetDepthBounds = provider.getFunctionAddress("vkCmdSetDepthBounds");
		vkCmdSetEvent = provider.getFunctionAddress("vkCmdSetEvent");
		vkCmdSetLineWidth = provider.getFunctionAddress("vkCmdSetLineWidth");
		vkCmdSetScissor = provider.getFunctionAddress("vkCmdSetScissor");
		vkCmdSetStencilCompareMask = provider.getFunctionAddress("vkCmdSetStencilCompareMask");
		vkCmdSetStencilReference = provider.getFunctionAddress("vkCmdSetStencilReference");
		vkCmdSetStencilWriteMask = provider.getFunctionAddress("vkCmdSetStencilWriteMask");
		vkCmdSetViewport = provider.getFunctionAddress("vkCmdSetViewport");
		vkCmdUpdateBuffer = provider.getFunctionAddress("vkCmdUpdateBuffer");
		vkCmdWaitEvents = provider.getFunctionAddress("vkCmdWaitEvents");
		vkCmdWriteTimestamp = provider.getFunctionAddress("vkCmdWriteTimestamp");
		vkCreateBuffer = provider.getFunctionAddress("vkCreateBuffer");
		vkCreateBufferView = provider.getFunctionAddress("vkCreateBufferView");
		vkCreateCommandPool = provider.getFunctionAddress("vkCreateCommandPool");
		vkCreateComputePipelines = provider.getFunctionAddress("vkCreateComputePipelines");
		vkCreateDebugReportCallbackEXT = provider.getFunctionAddress("vkCreateDebugReportCallbackEXT");
		vkCreateDescriptorPool = provider.getFunctionAddress("vkCreateDescriptorPool");
		vkCreateDescriptorSetLayout = provider.getFunctionAddress("vkCreateDescriptorSetLayout");
		vkCreateDevice = provider.getFunctionAddress("vkCreateDevice");
		vkCreateDisplayModeKHR = provider.getFunctionAddress("vkCreateDisplayModeKHR");
		vkCreateDisplayPlaneSurfaceKHR = provider.getFunctionAddress("vkCreateDisplayPlaneSurfaceKHR");
		vkCreateEvent = provider.getFunctionAddress("vkCreateEvent");
		vkCreateFence = provider.getFunctionAddress("vkCreateFence");
		vkCreateFramebuffer = provider.getFunctionAddress("vkCreateFramebuffer");
		vkCreateGraphicsPipelines = provider.getFunctionAddress("vkCreateGraphicsPipelines");
		vkCreateImage = provider.getFunctionAddress("vkCreateImage");
		vkCreateImageView = provider.getFunctionAddress("vkCreateImageView");
		vkCreateInstance = provider.getFunctionAddress("vkCreateInstance");
		vkCreatePipelineCache = provider.getFunctionAddress("vkCreatePipelineCache");
		vkCreatePipelineLayout = provider.getFunctionAddress("vkCreatePipelineLayout");
		vkCreateQueryPool = provider.getFunctionAddress("vkCreateQueryPool");
		vkCreateRenderPass = provider.getFunctionAddress("vkCreateRenderPass");
		vkCreateSampler = provider.getFunctionAddress("vkCreateSampler");
		vkCreateSemaphore = provider.getFunctionAddress("vkCreateSemaphore");
		vkCreateShaderModule = provider.getFunctionAddress("vkCreateShaderModule");
		vkCreateSharedSwapchainsKHR = provider.getFunctionAddress("vkCreateSharedSwapchainsKHR");
		vkCreateSwapchainKHR = provider.getFunctionAddress("vkCreateSwapchainKHR");
		vkCreateWin32SurfaceKHR = provider.getFunctionAddress("vkCreateWin32SurfaceKHR");
		vkCreateXlibSurfaceKHR = provider.getFunctionAddress("vkCreateXlibSurfaceKHR");
		vkDebugMarkerSetObjectNameEXT = provider.getFunctionAddress("vkDebugMarkerSetObjectNameEXT");
		vkDebugMarkerSetObjectTagEXT = provider.getFunctionAddress("vkDebugMarkerSetObjectTagEXT");
		vkDebugReportMessageEXT = provider.getFunctionAddress("vkDebugReportMessageEXT");
		vkDestroyBuffer = provider.getFunctionAddress("vkDestroyBuffer");
		vkDestroyBufferView = provider.getFunctionAddress("vkDestroyBufferView");
		vkDestroyCommandPool = provider.getFunctionAddress("vkDestroyCommandPool");
		vkDestroyDebugReportCallbackEXT = provider.getFunctionAddress("vkDestroyDebugReportCallbackEXT");
		vkDestroyDescriptorPool = provider.getFunctionAddress("vkDestroyDescriptorPool");
		vkDestroyDescriptorSetLayout = provider.getFunctionAddress("vkDestroyDescriptorSetLayout");
		vkDestroyDevice = provider.getFunctionAddress("vkDestroyDevice");
		vkDestroyEvent = provider.getFunctionAddress("vkDestroyEvent");
		vkDestroyFence = provider.getFunctionAddress("vkDestroyFence");
		vkDestroyFramebuffer = provider.getFunctionAddress("vkDestroyFramebuffer");
		vkDestroyImage = provider.getFunctionAddress("vkDestroyImage");
		vkDestroyImageView = provider.getFunctionAddress("vkDestroyImageView");
		vkDestroyInstance = provider.getFunctionAddress("vkDestroyInstance");
		vkDestroyPipeline = provider.getFunctionAddress("vkDestroyPipeline");
		vkDestroyPipelineCache = provider.getFunctionAddress("vkDestroyPipelineCache");
		vkDestroyPipelineLayout = provider.getFunctionAddress("vkDestroyPipelineLayout");
		vkDestroyQueryPool = provider.getFunctionAddress("vkDestroyQueryPool");
		vkDestroyRenderPass = provider.getFunctionAddress("vkDestroyRenderPass");
		vkDestroySampler = provider.getFunctionAddress("vkDestroySampler");
		vkDestroySemaphore = provider.getFunctionAddress("vkDestroySemaphore");
		vkDestroyShaderModule = provider.getFunctionAddress("vkDestroyShaderModule");
		vkDestroySurfaceKHR = provider.getFunctionAddress("vkDestroySurfaceKHR");
		vkDestroySwapchainKHR = provider.getFunctionAddress("vkDestroySwapchainKHR");
		vkDeviceWaitIdle = provider.getFunctionAddress("vkDeviceWaitIdle");
		vkEndCommandBuffer = provider.getFunctionAddress("vkEndCommandBuffer");
		vkEnumerateDeviceExtensionProperties = provider.getFunctionAddress("vkEnumerateDeviceExtensionProperties");
		vkEnumerateDeviceLayerProperties = provider.getFunctionAddress("vkEnumerateDeviceLayerProperties");
		vkEnumerateInstanceExtensionProperties = provider.getFunctionAddress("vkEnumerateInstanceExtensionProperties");
		vkEnumerateInstanceLayerProperties = provider.getFunctionAddress("vkEnumerateInstanceLayerProperties");
		vkEnumeratePhysicalDevices = provider.getFunctionAddress("vkEnumeratePhysicalDevices");
		vkFlushMappedMemoryRanges = provider.getFunctionAddress("vkFlushMappedMemoryRanges");
		vkFreeCommandBuffers = provider.getFunctionAddress("vkFreeCommandBuffers");
		vkFreeDescriptorSets = provider.getFunctionAddress("vkFreeDescriptorSets");
		vkFreeMemory = provider.getFunctionAddress("vkFreeMemory");
		vkGetBufferMemoryRequirements = provider.getFunctionAddress("vkGetBufferMemoryRequirements");
		vkGetDeviceMemoryCommitment = provider.getFunctionAddress("vkGetDeviceMemoryCommitment");
		vkGetDeviceProcAddr = provider.getFunctionAddress("vkGetDeviceProcAddr");
		vkGetDeviceQueue = provider.getFunctionAddress("vkGetDeviceQueue");
		vkGetDisplayModePropertiesKHR = provider.getFunctionAddress("vkGetDisplayModePropertiesKHR");
		vkGetDisplayPlaneCapabilitiesKHR = provider.getFunctionAddress("vkGetDisplayPlaneCapabilitiesKHR");
		vkGetDisplayPlaneSupportedDisplaysKHR = provider.getFunctionAddress("vkGetDisplayPlaneSupportedDisplaysKHR");
		vkGetEventStatus = provider.getFunctionAddress("vkGetEventStatus");
		vkGetFenceStatus = provider.getFunctionAddress("vkGetFenceStatus");
		vkGetImageMemoryRequirements = provider.getFunctionAddress("vkGetImageMemoryRequirements");
		vkGetImageSparseMemoryRequirements = provider.getFunctionAddress("vkGetImageSparseMemoryRequirements");
		vkGetImageSubresourceLayout = provider.getFunctionAddress("vkGetImageSubresourceLayout");
		vkGetInstanceProcAddr = provider.getFunctionAddress("vkGetInstanceProcAddr");
		vkGetPhysicalDeviceDisplayPlanePropertiesKHR = provider.getFunctionAddress("vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
		vkGetPhysicalDeviceDisplayPropertiesKHR = provider.getFunctionAddress("vkGetPhysicalDeviceDisplayPropertiesKHR");
		vkGetPhysicalDeviceFeatures = provider.getFunctionAddress("vkGetPhysicalDeviceFeatures");
		vkGetPhysicalDeviceFormatProperties = provider.getFunctionAddress("vkGetPhysicalDeviceFormatProperties");
		vkGetPhysicalDeviceImageFormatProperties = provider.getFunctionAddress("vkGetPhysicalDeviceImageFormatProperties");
		vkGetPhysicalDeviceMemoryProperties = provider.getFunctionAddress("vkGetPhysicalDeviceMemoryProperties");
		vkGetPhysicalDeviceProperties = provider.getFunctionAddress("vkGetPhysicalDeviceProperties");
		vkGetPhysicalDeviceQueueFamilyProperties = provider.getFunctionAddress("vkGetPhysicalDeviceQueueFamilyProperties");
		vkGetPhysicalDeviceSparseImageFormatProperties = provider.getFunctionAddress("vkGetPhysicalDeviceSparseImageFormatProperties");
		vkGetPhysicalDeviceSurfaceCapabilitiesKHR = provider.getFunctionAddress("vkGetPhysicalDeviceSurfaceCapabilitiesKHR");
		vkGetPhysicalDeviceSurfaceFormatsKHR = provider.getFunctionAddress("vkGetPhysicalDeviceSurfaceFormatsKHR");
		vkGetPhysicalDeviceSurfacePresentModesKHR = provider.getFunctionAddress("vkGetPhysicalDeviceSurfacePresentModesKHR");
		vkGetPhysicalDeviceSurfaceSupportKHR = provider.getFunctionAddress("vkGetPhysicalDeviceSurfaceSupportKHR");
		vkGetPhysicalDeviceWin32PresentationSupportKHR = provider.getFunctionAddress("vkGetPhysicalDeviceWin32PresentationSupportKHR");
		vkGetPhysicalDeviceXlibPresentationSupportKHR = provider.getFunctionAddress("vkGetPhysicalDeviceXlibPresentationSupportKHR");
		vkGetPipelineCacheData = provider.getFunctionAddress("vkGetPipelineCacheData");
		vkGetQueryPoolResults = provider.getFunctionAddress("vkGetQueryPoolResults");
		vkGetRenderAreaGranularity = provider.getFunctionAddress("vkGetRenderAreaGranularity");
		vkGetSwapchainImagesKHR = provider.getFunctionAddress("vkGetSwapchainImagesKHR");
		vkInvalidateMappedMemoryRanges = provider.getFunctionAddress("vkInvalidateMappedMemoryRanges");
		vkMapMemory = provider.getFunctionAddress("vkMapMemory");
		vkMergePipelineCaches = provider.getFunctionAddress("vkMergePipelineCaches");
		vkQueueBindSparse = provider.getFunctionAddress("vkQueueBindSparse");
		vkQueuePresentKHR = provider.getFunctionAddress("vkQueuePresentKHR");
		vkQueueSubmit = provider.getFunctionAddress("vkQueueSubmit");
		vkQueueWaitIdle = provider.getFunctionAddress("vkQueueWaitIdle");
		vkResetCommandBuffer = provider.getFunctionAddress("vkResetCommandBuffer");
		vkResetCommandPool = provider.getFunctionAddress("vkResetCommandPool");
		vkResetDescriptorPool = provider.getFunctionAddress("vkResetDescriptorPool");
		vkResetEvent = provider.getFunctionAddress("vkResetEvent");
		vkResetFences = provider.getFunctionAddress("vkResetFences");
		vkSetEvent = provider.getFunctionAddress("vkSetEvent");
		vkUnmapMemory = provider.getFunctionAddress("vkUnmapMemory");
		vkUpdateDescriptorSets = provider.getFunctionAddress("vkUpdateDescriptorSets");
		vkWaitForFences = provider.getFunctionAddress("vkWaitForFences");

		Vulkan10 = ext.contains("Vulkan10") && VK.checkExtension("Vulkan10", VK10.isAvailable(this));
		VK_AMD_gcn_shader = ext.contains("VK_AMD_gcn_shader");
		VK_AMD_rasterization_order = ext.contains("VK_AMD_rasterization_order");
		VK_AMD_shader_ballot = ext.contains("VK_AMD_shader_ballot");
		VK_AMD_shader_explicit_vertex_parameter = ext.contains("VK_AMD_shader_explicit_vertex_parameter");
		VK_AMD_shader_trinary_minmax = ext.contains("VK_AMD_shader_trinary_minmax");
		VK_EXT_debug_marker = ext.contains("VK_EXT_debug_marker") && VK.checkExtension("VK_EXT_debug_marker", EXTDebugMarker.isAvailable(this));
		VK_EXT_debug_report = ext.contains("VK_EXT_debug_report") && VK.checkExtension("VK_EXT_debug_report", EXTDebugReport.isAvailable(this));
		VK_IMG_filter_cubic = ext.contains("VK_IMG_filter_cubic");
		VK_KHR_display = ext.contains("VK_KHR_display") && VK.checkExtension("VK_KHR_display", KHRDisplay.isAvailable(this));
		VK_KHR_display_swapchain = ext.contains("VK_KHR_display_swapchain") && VK.checkExtension("VK_KHR_display_swapchain", KHRDisplaySwapchain.isAvailable(this));
		VK_KHR_sampler_mirror_clamp_to_edge = ext.contains("VK_KHR_sampler_mirror_clamp_to_edge");
		VK_KHR_surface = ext.contains("VK_KHR_surface") && VK.checkExtension("VK_KHR_surface", KHRSurface.isAvailable(this));
		VK_KHR_swapchain = ext.contains("VK_KHR_swapchain") && VK.checkExtension("VK_KHR_swapchain", KHRSwapchain.isAvailable(this));
		VK_KHR_win32_surface = ext.contains("VK_KHR_win32_surface") && VK.checkExtension("VK_KHR_win32_surface", KHRWin32Surface.isAvailable(this));
		VK_KHR_xlib_surface = ext.contains("VK_KHR_xlib_surface") && VK.checkExtension("VK_KHR_xlib_surface", KHRXlibSurface.isAvailable(this));
		VK_NV_glsl_shader = ext.contains("VK_NV_glsl_shader");
	}

}