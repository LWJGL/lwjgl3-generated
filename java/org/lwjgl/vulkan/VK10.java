/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core Vulkan 1.0 functionality. */
public class VK10 {

	/** API Constants */
	public static final int
		VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = 256,
		VK_UUID_SIZE                     = 16,
		VK_MAX_EXTENSION_NAME_SIZE       = 256,
		VK_MAX_DESCRIPTION_SIZE          = 256,
		VK_MAX_MEMORY_TYPES              = 32,
		VK_MAX_MEMORY_HEAPS              = 16,
		VK_REMAINING_MIP_LEVELS          = (~0),
		VK_REMAINING_ARRAY_LAYERS        = (~0),
		VK_ATTACHMENT_UNUSED             = (~0),
		VK_TRUE                          = 1,
		VK_FALSE                         = 0,
		VK_QUEUE_FAMILY_IGNORED          = (~0),
		VK_SUBPASS_EXTERNAL              = (~0);

	/** API Constants */
	public static final float VK_LOD_CLAMP_NONE = 1000.0f;

	/** API Constants */
	public static final long VK_WHOLE_SIZE = (~0L);

	/**
	 * VkPipelineCacheHeaderVersion - Encode pipeline cache version
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>A consumer of the pipeline cache <b>should</b> use the cache version to interpret the remainder of the cache header.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link #vkCreatePipelineCache CreatePipelineCache}, {@link #vkGetPipelineCacheData GetPipelineCacheData}</p>
	 */
	public static final int VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1;

	/**
	 * VkResult - Vulkan command return codes
	 * 
	 * <h5>Description</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_SUCCESS SUCCESS} Command successfully completed</li>
	 * <li>{@link #VK_NOT_READY NOT_READY} A fence or query has not yet completed</li>
	 * <li>{@link #VK_TIMEOUT TIMEOUT} A wait operation has not completed in the specified time</li>
	 * <li>{@link #VK_EVENT_SET EVENT_SET} An event is signaled</li>
	 * <li>{@link #VK_EVENT_RESET EVENT_RESET} An event is unsignaled</li>
	 * <li>{@link #VK_INCOMPLETE INCOMPLETE} A return array was too small for the result</li>
	 * <li>{@link KHRSwapchain#VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR} A swapchain no longer matches the surface properties exactly, but <b>can</b> still be used to present to the surface successfully.</li>
	 * </ul>
	 * 
	 * <ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY} A host memory allocation has failed.</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY} A device memory allocation has failed.</li>
	 * <li>{@link #VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED} Initialization of an object could not be completed for implementation-specific reasons.</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST} The logical or physical device has been lost. See <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#devsandqueues-lost-device">Lost Device</a></li>
	 * <li>{@link #VK_ERROR_MEMORY_MAP_FAILED ERROR_MEMORY_MAP_FAILED} Mapping of a memory object has failed.</li>
	 * <li>{@link #VK_ERROR_LAYER_NOT_PRESENT ERROR_LAYER_NOT_PRESENT} A requested layer is not present or could not be loaded.</li>
	 * <li>{@link #VK_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT} A requested extension is not supported.</li>
	 * <li>{@link #VK_ERROR_FEATURE_NOT_PRESENT ERROR_FEATURE_NOT_PRESENT} A requested feature is not supported.</li>
	 * <li>{@link #VK_ERROR_INCOMPATIBLE_DRIVER ERROR_INCOMPATIBLE_DRIVER} The requested version of Vulkan is not supported by the driver or is otherwise incompatible for implementation-specific reasons.</li>
	 * <li>{@link #VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS} Too many objects of the type have already been created.</li>
	 * <li>{@link #VK_ERROR_FORMAT_NOT_SUPPORTED ERROR_FORMAT_NOT_SUPPORTED} A requested format is not supported on this device.</li>
	 * <li>{@link #VK_ERROR_FRAGMENTED_POOL ERROR_FRAGMENTED_POOL} A requested pool allocation has failed due to fragmentation of the pool&#8217;s memory.</li>
	 * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR} A surface is no longer available.</li>
	 * <li>{@link KHRSurface#VK_ERROR_NATIVE_WINDOW_IN_USE_KHR ERROR_NATIVE_WINDOW_IN_USE_KHR} The requested window is already in use by Vulkan or another API in a manner which prevents it from being used again.</li>
	 * <li>{@link KHRSwapchain#VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR} A surface has changed in such a way that it is no longer compatible with the swapchain, and further presentation requests using the swapchain will fail. Applications <b>must</b> query the new surface properties and recreate their swapchain if they wish to continue presenting to the surface.</li>
	 * <li>{@link KHRDisplaySwapchain#VK_ERROR_INCOMPATIBLE_DISPLAY_KHR ERROR_INCOMPATIBLE_DISPLAY_KHR} The display used by a swapchain does not use the same presentable image layout, or is incompatible in a way that prevents sharing an image.</li>
	 * <li>{@link NVGLSLShader#VK_ERROR_INVALID_SHADER_NV ERROR_INVALID_SHADER_NV} One or more shaders failed to compile or link. More details are reported back to the application via {@code VK_EXT_debug_report} if enabled.</li>
	 * </ul>
	 * 
	 * <p>If a command returns a run time error, it will leave any result pointers unmodified, unless other behavior is explicitly defined in the specification.</p>
	 * 
	 * <p>Out of memory errors do not damage any currently existing Vulkan objects. Objects that have already been successfully created <b>can</b> still be used by the application.</p>
	 * 
	 * <p>Performance-critical commands generally do not have return codes. If a run time error occurs in such commands, the implementation will defer reporting the error until a specified point. For commands that record into command buffers (ftext:vkCmd*) run time errors are reported by {@link #vkEndCommandBuffer EndCommandBuffer}.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>No cross-references are available, {@link VkPresentInfoKHR}</p>
	 */
	public static final int
		VK_SUCCESS                     = 0,
		VK_NOT_READY                   = 1,
		VK_TIMEOUT                     = 2,
		VK_EVENT_SET                   = 3,
		VK_EVENT_RESET                 = 4,
		VK_INCOMPLETE                  = 5,
		VK_ERROR_OUT_OF_HOST_MEMORY    = -1,
		VK_ERROR_OUT_OF_DEVICE_MEMORY  = -2,
		VK_ERROR_INITIALIZATION_FAILED = -3,
		VK_ERROR_DEVICE_LOST           = -4,
		VK_ERROR_MEMORY_MAP_FAILED     = -5,
		VK_ERROR_LAYER_NOT_PRESENT     = -6,
		VK_ERROR_EXTENSION_NOT_PRESENT = -7,
		VK_ERROR_FEATURE_NOT_PRESENT   = -8,
		VK_ERROR_INCOMPATIBLE_DRIVER   = -9,
		VK_ERROR_TOO_MANY_OBJECTS      = -10,
		VK_ERROR_FORMAT_NOT_SUPPORTED  = -11,
		VK_ERROR_FRAGMENTED_POOL       = -12;

	/**
	 * VkStructureType - Vulkan structure types ({@code stype})
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAndroidSurfaceCreateInfoKHR}, {@link VkApplicationInfo}, {@link VkBindSparseInfo}, {@link VkBufferCreateInfo}, {@link VkBufferMemoryBarrier}, {@link VkBufferViewCreateInfo}, {@link VkCommandBufferAllocateInfo}, {@link VkCommandBufferBeginInfo}, {@link VkCommandBufferInheritanceInfo}, {@link VkCommandPoolCreateInfo}, {@link VkComputePipelineCreateInfo}, {@link VkCopyDescriptorSet}, {@link VkDebugMarkerMarkerInfoEXT}, {@link VkDebugMarkerObjectNameInfoEXT}, {@link VkDebugMarkerObjectTagInfoEXT}, {@link VkDebugReportCallbackCreateInfoEXT}, {@link VkDedicatedAllocationBufferCreateInfoNV}, {@link VkDedicatedAllocationImageCreateInfoNV}, {@link VkDedicatedAllocationMemoryAllocateInfoNV}, {@link VkDescriptorPoolCreateInfo}, {@link VkDescriptorSetAllocateInfo}, {@link VkDescriptorSetLayoutCreateInfo}, {@link VkDeviceCreateInfo}, {@link VkDeviceQueueCreateInfo}, {@link VkDisplayModeCreateInfoKHR}, {@link VkDisplayPresentInfoKHR}, {@link VkDisplaySurfaceCreateInfoKHR}, {@link VkEventCreateInfo}, {@link VkExportMemoryAllocateInfoNV}, {@link VkExportMemoryWin32HandleInfoNV}, {@link VkExternalMemoryImageCreateInfoNV}, {@link VkFenceCreateInfo}, {@link VkFramebufferCreateInfo}, {@link VkGraphicsPipelineCreateInfo}, {@link VkImageCreateInfo}, {@link VkImageMemoryBarrier}, {@link VkImageViewCreateInfo}, {@link VkImportMemoryWin32HandleInfoNV}, {@link VkInstanceCreateInfo}, {@link VkMappedMemoryRange}, {@link VkMemoryAllocateInfo}, {@link VkMemoryBarrier}, {@link VkMirSurfaceCreateInfoKHR}, {@link VkPipelineCacheCreateInfo}, {@link VkPipelineColorBlendStateCreateInfo}, {@link VkPipelineDepthStencilStateCreateInfo}, {@link VkPipelineDynamicStateCreateInfo}, {@link VkPipelineInputAssemblyStateCreateInfo}, {@link VkPipelineLayoutCreateInfo}, {@link VkPipelineMultisampleStateCreateInfo}, {@link VkPipelineRasterizationStateCreateInfo}, {@link VkPipelineRasterizationStateRasterizationOrderAMD}, {@link VkPipelineShaderStageCreateInfo}, {@link VkPipelineTessellationStateCreateInfo}, {@link VkPipelineVertexInputStateCreateInfo}, {@link VkPipelineViewportStateCreateInfo}, {@link VkPresentInfoKHR}, {@link VkQueryPoolCreateInfo}, {@link VkRenderPassBeginInfo}, {@link VkRenderPassCreateInfo}, {@link VkSamplerCreateInfo}, {@link VkSemaphoreCreateInfo}, {@link VkShaderModuleCreateInfo}, {@link VkSubmitInfo}, {@link VkSwapchainCreateInfoKHR}, {@link VkValidationFlagsEXT}, {@link VkWaylandSurfaceCreateInfoKHR}, {@link VkWin32KeyedMutexAcquireReleaseInfoNV}, {@link VkWin32SurfaceCreateInfoKHR}, {@link VkWriteDescriptorSet}, {@link VkXcbSurfaceCreateInfoKHR}, {@link VkXlibSurfaceCreateInfoKHR}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_STRUCTURE_TYPE_APPLICATION_INFO STRUCTURE_TYPE_APPLICATION_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO STRUCTURE_TYPE_INSTANCE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO STRUCTURE_TYPE_DEVICE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_SUBMIT_INFO STRUCTURE_TYPE_SUBMIT_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE STRUCTURE_TYPE_MAPPED_MEMORY_RANGE}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_BIND_SPARSE_INFO STRUCTURE_TYPE_BIND_SPARSE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_FENCE_CREATE_INFO STRUCTURE_TYPE_FENCE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_EVENT_CREATE_INFO STRUCTURE_TYPE_EVENT_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO STRUCTURE_TYPE_BUFFER_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO STRUCTURE_TYPE_SAMPLER_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET STRUCTURE_TYPE_COPY_DESCRIPTOR_SET}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_BARRIER STRUCTURE_TYPE_MEMORY_BARRIER}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO}</li>
	 * </ul>
	 */
	public static final int
		VK_STRUCTURE_TYPE_APPLICATION_INFO                          = 0,
		VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO                      = 1,
		VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO                  = 2,
		VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO                        = 3,
		VK_STRUCTURE_TYPE_SUBMIT_INFO                               = 4,
		VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO                      = 5,
		VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE                       = 6,
		VK_STRUCTURE_TYPE_BIND_SPARSE_INFO                          = 7,
		VK_STRUCTURE_TYPE_FENCE_CREATE_INFO                         = 8,
		VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO                     = 9,
		VK_STRUCTURE_TYPE_EVENT_CREATE_INFO                         = 10,
		VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO                    = 11,
		VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO                        = 12,
		VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO                   = 13,
		VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO                         = 14,
		VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO                    = 15,
		VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO                 = 16,
		VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO                = 17,
		VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO         = 18,
		VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO   = 19,
		VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO = 20,
		VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO   = 21,
		VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO       = 22,
		VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO  = 23,
		VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO    = 24,
		VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO  = 25,
		VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO    = 26,
		VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO        = 27,
		VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO             = 28,
		VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO              = 29,
		VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO               = 30,
		VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO                       = 31,
		VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO         = 32,
		VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO               = 33,
		VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO              = 34,
		VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET                      = 35,
		VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET                       = 36,
		VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO                   = 37,
		VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO                   = 38,
		VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO                  = 39,
		VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO              = 40,
		VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO           = 41,
		VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO                 = 42,
		VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO                    = 43,
		VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER                     = 44,
		VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER                      = 45,
		VK_STRUCTURE_TYPE_MEMORY_BARRIER                            = 46,
		VK_STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO               = 47,
		VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO                 = 48;

	/**
	 * VkSystemAllocationScope - Allocation scope
	 * 
	 * <h5>Description</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_SYSTEM_ALLOCATION_SCOPE_COMMAND SYSTEM_ALLOCATION_SCOPE_COMMAND} - The allocation is scoped to the duration of the Vulkan command.</li>
	 * <li>{@link #VK_SYSTEM_ALLOCATION_SCOPE_OBJECT SYSTEM_ALLOCATION_SCOPE_OBJECT} - The allocation is scoped to the lifetime of the Vulkan object that is being created or used.</li>
	 * <li>{@link #VK_SYSTEM_ALLOCATION_SCOPE_CACHE SYSTEM_ALLOCATION_SCOPE_CACHE} - The allocation is scoped to the lifetime of a {@code VkPipelineCache} object.</li>
	 * <li>{@link #VK_SYSTEM_ALLOCATION_SCOPE_DEVICE SYSTEM_ALLOCATION_SCOPE_DEVICE} - The allocation is scoped to the lifetime of the Vulkan device.</li>
	 * <li>{@link #VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE SYSTEM_ALLOCATION_SCOPE_INSTANCE} - The allocation is scoped to the lifetime of the Vulkan instance.</li>
	 * </ul>
	 * 
	 * <p>Most Vulkan commands operate on a single object, or there is a sole object that is being created or manipulated. When an allocation uses an allocation scope of {@link #VK_SYSTEM_ALLOCATION_SCOPE_OBJECT SYSTEM_ALLOCATION_SCOPE_OBJECT} or {@link #VK_SYSTEM_ALLOCATION_SCOPE_CACHE SYSTEM_ALLOCATION_SCOPE_CACHE}, the allocation is scoped to the object being created or manipulated.</p>
	 * 
	 * <p>When an implementation requires host memory, it will make callbacks to the application using the most specific allocator and allocation scope available:</p>
	 * 
	 * <ul>
	 * <li>If an allocation is scoped to the duration of a command, the allocator will use the {@link #VK_SYSTEM_ALLOCATION_SCOPE_COMMAND SYSTEM_ALLOCATION_SCOPE_COMMAND} allocation scope. The most specific allocator available is used: if the object being created or manipulated has an allocator, that object&#8217;s allocator will be used, else if the parent {@code VkDevice} has an allocator it will be used, else if the parent {@code VkInstance} has an allocator it will be used. Else,</li>
	 * <li>If an allocation is associated with an object of type {@code VkPipelineCache}, the allocator will use the {@link #VK_SYSTEM_ALLOCATION_SCOPE_CACHE SYSTEM_ALLOCATION_SCOPE_CACHE} allocation scope. The most specific allocator available is used (pipeline cache, else device, else instance). Else,</li>
	 * <li>If an allocation is scoped to the lifetime of an object, that object is being created or manipulated by the command, and that object&#8217;s type is not {@code VkDevice} or {@code VkInstance}, the allocator will use an allocation scope of {@link #VK_SYSTEM_ALLOCATION_SCOPE_OBJECT SYSTEM_ALLOCATION_SCOPE_OBJECT}. The most specific allocator available is used (object, else device, else instance). Else,</li>
	 * <li>If an allocation is scoped to the lifetime of a device, the allocator will use an allocation scope of ename VK_SYSTEM_ALLOCATION_SCOPE_DEVICE. The most specific allocator available is used (device, else instance). Else,</li>
	 * <li>If the allocation is scoped to the lifetime of an instance and the instance has an allocator, its allocator will be used with an allocation scope of {@link #VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE SYSTEM_ALLOCATION_SCOPE_INSTANCE}.</li>
	 * <li>Otherwise an implementation will allocate memory through an alternative mechanism that is unspecified.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 */
	public static final int
		VK_SYSTEM_ALLOCATION_SCOPE_COMMAND  = 0,
		VK_SYSTEM_ALLOCATION_SCOPE_OBJECT   = 1,
		VK_SYSTEM_ALLOCATION_SCOPE_CACHE    = 2,
		VK_SYSTEM_ALLOCATION_SCOPE_DEVICE   = 3,
		VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4;

	/**
	 * VkInternalAllocationType - Allocation type
	 * 
	 * <h5>Description</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE INTERNAL_ALLOCATION_TYPE_EXECUTABLE} - The allocation is intended for execution by the host.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkInternalAllocationNotification}, {@link VkInternalFreeNotification}</p>
	 */
	public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0;

	/**
	 * VkFormat - Available image formats
	 * 
	 * <h5>Description</h5>
	 * 
	 * <dl>
	 * <dt>{@link #VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</dt>
	 * <dd>The format is not specified.</dd>
	 * <dt>{@link #VK_FORMAT_R4G4_UNORM_PACK8 FORMAT_R4G4_UNORM_PACK8}</dt>
	 * <dd>A two-component, 8-bit packed unsigned normalized format that has a 4-bit R component in bits 4..7, and a 4-bit G component in bits 0..3.</dd>
	 * <dt>{@link #VK_FORMAT_R4G4B4A4_UNORM_PACK16 FORMAT_R4G4B4A4_UNORM_PACK16}</dt>
	 * <dd>A four-component, 16-bit packed unsigned normalized format that has a 4-bit R component in bits 12..15, a 4-bit G component in bits 8..11, a 4-bit B component in bits 4..7, and a 4-bit A component in bits 0..3.</dd>
	 * <dt>{@link #VK_FORMAT_B4G4R4A4_UNORM_PACK16 FORMAT_B4G4R4A4_UNORM_PACK16}</dt>
	 * <dd>A four-component, 16-bit packed unsigned normalized format that has a 4-bit B component in bits 12..15, a 4-bit G component in bits 8..11, a 4-bit R component in bits 4..7, and a 4-bit A component in bits 0..3.</dd>
	 * <dt>{@link #VK_FORMAT_R5G6B5_UNORM_PACK16 FORMAT_R5G6B5_UNORM_PACK16}</dt>
	 * <dd>A three-component, 16-bit packed unsigned normalized format that has a 5-bit R component in bits 11..15, a 6-bit G component in bits 5..10, and a 5-bit B component in bits 0..4.</dd>
	 * <dt>{@link #VK_FORMAT_B5G6R5_UNORM_PACK16 FORMAT_B5G6R5_UNORM_PACK16}</dt>
	 * <dd>A three-component, 16-bit packed unsigned normalized format that has a 5-bit B component in bits 11..15, a 6-bit G component in bits 5..10, and a 5-bit R component in bits 0..4.</dd>
	 * <dt>{@link #VK_FORMAT_R5G5B5A1_UNORM_PACK16 FORMAT_R5G5B5A1_UNORM_PACK16}</dt>
	 * <dd>A four-component, 16-bit packed unsigned normalized format that has a 5-bit R component in bits 11..15, a 5-bit G component in bits 6..10, a 5-bit B component in bits 1..5, and a 1-bit A component in bit 0.</dd>
	 * <dt>{@link #VK_FORMAT_B5G5R5A1_UNORM_PACK16 FORMAT_B5G5R5A1_UNORM_PACK16}</dt>
	 * <dd>A four-component, 16-bit packed unsigned normalized format that has a 5-bit B component in bits 11..15, a 5-bit G component in bits 6..10, a 5-bit R component in bits 1..5, and a 1-bit A component in bit 0.</dd>
	 * <dt>{@link #VK_FORMAT_A1R5G5B5_UNORM_PACK16 FORMAT_A1R5G5B5_UNORM_PACK16}</dt>
	 * <dd>A four-component, 16-bit packed unsigned normalized format that has a 1-bit A component in bit 15, a 5-bit R component in bits 10..14, a 5-bit G component in bits 5..9, and a 5-bit B component in bits 0..4.</dd>
	 * <dt>{@link #VK_FORMAT_R8_UNORM FORMAT_R8_UNORM}</dt>
	 * <dd>A one-component, 8-bit unsigned normalized format that has a single 8-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R8_SNORM FORMAT_R8_SNORM}</dt>
	 * <dd>A one-component, 8-bit signed normalized format that has a single 8-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R8_USCALED FORMAT_R8_USCALED}</dt>
	 * <dd>A one-component, 8-bit unsigned scaled integer format that has a single 8-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R8_SSCALED FORMAT_R8_SSCALED}</dt>
	 * <dd>A one-component, 8-bit signed scaled integer format that has a single 8-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R8_UINT FORMAT_R8_UINT}</dt>
	 * <dd>A one-component, 8-bit unsigned integer format that has a single 8-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R8_SINT FORMAT_R8_SINT}</dt>
	 * <dd>A one-component, 8-bit signed integer format that has a single 8-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R8_SRGB FORMAT_R8_SRGB}</dt>
	 * <dd>A one-component, 8-bit unsigned normalized format that has a single 8-bit R component stored with sRGB nonlinear encoding.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8_UNORM FORMAT_R8G8_UNORM}</dt>
	 * <dd>A two-component, 16-bit unsigned normalized format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8_SNORM FORMAT_R8G8_SNORM}</dt>
	 * <dd>A two-component, 16-bit signed normalized format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8_USCALED FORMAT_R8G8_USCALED}</dt>
	 * <dd>A two-component, 16-bit unsigned scaled integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8_SSCALED FORMAT_R8G8_SSCALED}</dt>
	 * <dd>A two-component, 16-bit signed scaled integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8_UINT FORMAT_R8G8_UINT}</dt>
	 * <dd>A two-component, 16-bit unsigned integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8_SINT FORMAT_R8G8_SINT}</dt>
	 * <dd>A two-component, 16-bit signed integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8_SRGB FORMAT_R8G8_SRGB}</dt>
	 * <dd>A two-component, 16-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, and an 8-bit G component stored with sRGB nonlinear encoding in byte 1.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8_UNORM FORMAT_R8G8B8_UNORM}</dt>
	 * <dd>A three-component, 24-bit unsigned normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8_SNORM FORMAT_R8G8B8_SNORM}</dt>
	 * <dd>A three-component, 24-bit signed normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8_USCALED FORMAT_R8G8B8_USCALED}</dt>
	 * <dd>A three-component, 24-bit unsigned scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8_SSCALED FORMAT_R8G8B8_SSCALED}</dt>
	 * <dd>A three-component, 24-bit signed scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8_UINT FORMAT_R8G8B8_UINT}</dt>
	 * <dd>A three-component, 24-bit unsigned integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8_SINT FORMAT_R8G8B8_SINT}</dt>
	 * <dd>A three-component, 24-bit signed integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8_SRGB FORMAT_R8G8B8_SRGB}</dt>
	 * <dd>A three-component, 24-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, and an 8-bit B component stored with sRGB nonlinear encoding in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8_UNORM FORMAT_B8G8R8_UNORM}</dt>
	 * <dd>A three-component, 24-bit unsigned normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8_SNORM FORMAT_B8G8R8_SNORM}</dt>
	 * <dd>A three-component, 24-bit signed normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8_USCALED FORMAT_B8G8R8_USCALED}</dt>
	 * <dd>A three-component, 24-bit unsigned scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8_SSCALED FORMAT_B8G8R8_SSCALED}</dt>
	 * <dd>A three-component, 24-bit signed scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8_UINT FORMAT_B8G8R8_UINT}</dt>
	 * <dd>A three-component, 24-bit unsigned integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8_SINT FORMAT_B8G8R8_SINT}</dt>
	 * <dd>A three-component, 24-bit signed integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8_SRGB FORMAT_B8G8R8_SRGB}</dt>
	 * <dd>A three-component, 24-bit unsigned normalized format that has an 8-bit B component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, and an 8-bit R component stored with sRGB nonlinear encoding in byte 2.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM}</dt>
	 * <dd>A four-component, 32-bit unsigned normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8A8_SNORM FORMAT_R8G8B8A8_SNORM}</dt>
	 * <dd>A four-component, 32-bit signed normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8A8_USCALED FORMAT_R8G8B8A8_USCALED}</dt>
	 * <dd>A four-component, 32-bit unsigned scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8A8_SSCALED FORMAT_R8G8B8A8_SSCALED}</dt>
	 * <dd>A four-component, 32-bit signed scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8A8_UINT FORMAT_R8G8B8A8_UINT}</dt>
	 * <dd>A four-component, 32-bit unsigned integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8A8_SINT FORMAT_R8G8B8A8_SINT}</dt>
	 * <dd>A four-component, 32-bit signed integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_R8G8B8A8_SRGB FORMAT_R8G8B8A8_SRGB}</dt>
	 * <dd>A four-component, 32-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, an 8-bit B component stored with sRGB nonlinear encoding in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8A8_UNORM FORMAT_B8G8R8A8_UNORM}</dt>
	 * <dd>A four-component, 32-bit unsigned normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8A8_SNORM FORMAT_B8G8R8A8_SNORM}</dt>
	 * <dd>A four-component, 32-bit signed normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8A8_USCALED FORMAT_B8G8R8A8_USCALED}</dt>
	 * <dd>A four-component, 32-bit unsigned scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8A8_SSCALED FORMAT_B8G8R8A8_SSCALED}</dt>
	 * <dd>A four-component, 32-bit signed scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8A8_UINT FORMAT_B8G8R8A8_UINT}</dt>
	 * <dd>A four-component, 32-bit unsigned integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8A8_SINT FORMAT_B8G8R8A8_SINT}</dt>
	 * <dd>A four-component, 32-bit signed integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_B8G8R8A8_SRGB FORMAT_B8G8R8A8_SRGB}</dt>
	 * <dd>A four-component, 32-bit unsigned normalized format that has an 8-bit B component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, an 8-bit R component stored with sRGB nonlinear encoding in byte 2, and an 8-bit A component in byte 3.</dd>
	 * <dt>{@link #VK_FORMAT_A8B8G8R8_UNORM_PACK32 FORMAT_A8B8G8R8_UNORM_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed unsigned normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</dd>
	 * <dt>{@link #VK_FORMAT_A8B8G8R8_SNORM_PACK32 FORMAT_A8B8G8R8_SNORM_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed signed normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</dd>
	 * <dt>{@link #VK_FORMAT_A8B8G8R8_USCALED_PACK32 FORMAT_A8B8G8R8_USCALED_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed unsigned scaled integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</dd>
	 * <dt>{@link #VK_FORMAT_A8B8G8R8_SSCALED_PACK32 FORMAT_A8B8G8R8_SSCALED_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed signed scaled integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</dd>
	 * <dt>{@link #VK_FORMAT_A8B8G8R8_UINT_PACK32 FORMAT_A8B8G8R8_UINT_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed unsigned integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</dd>
	 * <dt>{@link #VK_FORMAT_A8B8G8R8_SINT_PACK32 FORMAT_A8B8G8R8_SINT_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed signed integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</dd>
	 * <dt>{@link #VK_FORMAT_A8B8G8R8_SRGB_PACK32 FORMAT_A8B8G8R8_SRGB_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed unsigned normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component stored with sRGB nonlinear encoding in bits 16..23, an 8-bit G component stored with sRGB nonlinear encoding in bits 8..15, and an 8-bit R component stored with sRGB nonlinear encoding in bits 0..7.</dd>
	 * <dt>{@link #VK_FORMAT_A2R10G10B10_UNORM_PACK32 FORMAT_A2R10G10B10_UNORM_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed unsigned normalized format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</dd>
	 * <dt>{@link #VK_FORMAT_A2R10G10B10_SNORM_PACK32 FORMAT_A2R10G10B10_SNORM_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed signed normalized format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</dd>
	 * <dt>{@link #VK_FORMAT_A2R10G10B10_USCALED_PACK32 FORMAT_A2R10G10B10_USCALED_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed unsigned scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</dd>
	 * <dt>{@link #VK_FORMAT_A2R10G10B10_SSCALED_PACK32 FORMAT_A2R10G10B10_SSCALED_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed signed scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</dd>
	 * <dt>{@link #VK_FORMAT_A2R10G10B10_UINT_PACK32 FORMAT_A2R10G10B10_UINT_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed unsigned integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</dd>
	 * <dt>{@link #VK_FORMAT_A2R10G10B10_SINT_PACK32 FORMAT_A2R10G10B10_SINT_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed signed integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</dd>
	 * <dt>{@link #VK_FORMAT_A2B10G10R10_UNORM_PACK32 FORMAT_A2B10G10R10_UNORM_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed unsigned normalized format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</dd>
	 * <dt>{@link #VK_FORMAT_A2B10G10R10_SNORM_PACK32 FORMAT_A2B10G10R10_SNORM_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed signed normalized format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</dd>
	 * <dt>{@link #VK_FORMAT_A2B10G10R10_USCALED_PACK32 FORMAT_A2B10G10R10_USCALED_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed unsigned scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</dd>
	 * <dt>{@link #VK_FORMAT_A2B10G10R10_SSCALED_PACK32 FORMAT_A2B10G10R10_SSCALED_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed signed scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</dd>
	 * <dt>{@link #VK_FORMAT_A2B10G10R10_UINT_PACK32 FORMAT_A2B10G10R10_UINT_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed unsigned integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</dd>
	 * <dt>{@link #VK_FORMAT_A2B10G10R10_SINT_PACK32 FORMAT_A2B10G10R10_SINT_PACK32}</dt>
	 * <dd>A four-component, 32-bit packed signed integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</dd>
	 * <dt>{@link #VK_FORMAT_R16_UNORM FORMAT_R16_UNORM}</dt>
	 * <dd>A one-component, 16-bit unsigned normalized format that has a single 16-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R16_SNORM FORMAT_R16_SNORM}</dt>
	 * <dd>A one-component, 16-bit signed normalized format that has a single 16-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R16_USCALED FORMAT_R16_USCALED}</dt>
	 * <dd>A one-component, 16-bit unsigned scaled integer format that has a single 16-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R16_SSCALED FORMAT_R16_SSCALED}</dt>
	 * <dd>A one-component, 16-bit signed scaled integer format that has a single 16-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R16_UINT FORMAT_R16_UINT}</dt>
	 * <dd>A one-component, 16-bit unsigned integer format that has a single 16-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R16_SINT FORMAT_R16_SINT}</dt>
	 * <dd>A one-component, 16-bit signed integer format that has a single 16-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R16_SFLOAT FORMAT_R16_SFLOAT}</dt>
	 * <dd>A one-component, 16-bit signed floating-point format that has a single 16-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16_UNORM FORMAT_R16G16_UNORM}</dt>
	 * <dd>A two-component, 32-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16_SNORM FORMAT_R16G16_SNORM}</dt>
	 * <dd>A two-component, 32-bit signed normalized format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16_USCALED FORMAT_R16G16_USCALED}</dt>
	 * <dd>A two-component, 32-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16_SSCALED FORMAT_R16G16_SSCALED}</dt>
	 * <dd>A two-component, 32-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16_UINT FORMAT_R16G16_UINT}</dt>
	 * <dd>A two-component, 32-bit unsigned integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16_SINT FORMAT_R16G16_SINT}</dt>
	 * <dd>A two-component, 32-bit signed integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16_SFLOAT FORMAT_R16G16_SFLOAT}</dt>
	 * <dd>A two-component, 32-bit signed floating-point format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16_UNORM FORMAT_R16G16B16_UNORM}</dt>
	 * <dd>A three-component, 48-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16_SNORM FORMAT_R16G16B16_SNORM}</dt>
	 * <dd>A three-component, 48-bit signed normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16_USCALED FORMAT_R16G16B16_USCALED}</dt>
	 * <dd>A three-component, 48-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16_SSCALED FORMAT_R16G16B16_SSCALED}</dt>
	 * <dd>A three-component, 48-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16_UINT FORMAT_R16G16B16_UINT}</dt>
	 * <dd>A three-component, 48-bit unsigned integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16_SINT FORMAT_R16G16B16_SINT}</dt>
	 * <dd>A three-component, 48-bit signed integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16_SFLOAT FORMAT_R16G16B16_SFLOAT}</dt>
	 * <dd>A three-component, 48-bit signed floating-point format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16A16_UNORM FORMAT_R16G16B16A16_UNORM}</dt>
	 * <dd>A four-component, 64-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16A16_SNORM FORMAT_R16G16B16A16_SNORM}</dt>
	 * <dd>A four-component, 64-bit signed normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16A16_USCALED FORMAT_R16G16B16A16_USCALED}</dt>
	 * <dd>A four-component, 64-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16A16_SSCALED FORMAT_R16G16B16A16_SSCALED}</dt>
	 * <dd>A four-component, 64-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16A16_UINT FORMAT_R16G16B16A16_UINT}</dt>
	 * <dd>A four-component, 64-bit unsigned integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16A16_SINT FORMAT_R16G16B16A16_SINT}</dt>
	 * <dd>A four-component, 64-bit signed integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</dd>
	 * <dt>{@link #VK_FORMAT_R16G16B16A16_SFLOAT FORMAT_R16G16B16A16_SFLOAT}</dt>
	 * <dd>A four-component, 64-bit signed floating-point format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</dd>
	 * <dt>{@link #VK_FORMAT_R32_UINT FORMAT_R32_UINT}</dt>
	 * <dd>A one-component, 32-bit unsigned integer format that has a single 32-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R32_SINT FORMAT_R32_SINT}</dt>
	 * <dd>A one-component, 32-bit signed integer format that has a single 32-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R32_SFLOAT FORMAT_R32_SFLOAT}</dt>
	 * <dd>A one-component, 32-bit signed floating-point format that has a single 32-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R32G32_UINT FORMAT_R32G32_UINT}</dt>
	 * <dd>A two-component, 64-bit unsigned integer format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7.</dd>
	 * <dt>{@link #VK_FORMAT_R32G32_SINT FORMAT_R32G32_SINT}</dt>
	 * <dd>A two-component, 64-bit signed integer format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7.</dd>
	 * <dt>{@link #VK_FORMAT_R32G32_SFLOAT FORMAT_R32G32_SFLOAT}</dt>
	 * <dd>A two-component, 64-bit signed floating-point format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7.</dd>
	 * <dt>{@link #VK_FORMAT_R32G32B32_UINT FORMAT_R32G32B32_UINT}</dt>
	 * <dd>A three-component, 96-bit unsigned integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11.</dd>
	 * <dt>{@link #VK_FORMAT_R32G32B32_SINT FORMAT_R32G32B32_SINT}</dt>
	 * <dd>A three-component, 96-bit signed integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11.</dd>
	 * <dt>{@link #VK_FORMAT_R32G32B32_SFLOAT FORMAT_R32G32B32_SFLOAT}</dt>
	 * <dd>A three-component, 96-bit signed floating-point format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11.</dd>
	 * <dt>{@link #VK_FORMAT_R32G32B32A32_UINT FORMAT_R32G32B32A32_UINT}</dt>
	 * <dd>A four-component, 128-bit unsigned integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15.</dd>
	 * <dt>{@link #VK_FORMAT_R32G32B32A32_SINT FORMAT_R32G32B32A32_SINT}</dt>
	 * <dd>A four-component, 128-bit signed integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15.</dd>
	 * <dt>{@link #VK_FORMAT_R32G32B32A32_SFLOAT FORMAT_R32G32B32A32_SFLOAT}</dt>
	 * <dd>A four-component, 128-bit signed floating-point format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15.</dd>
	 * <dt>{@link #VK_FORMAT_R64_UINT FORMAT_R64_UINT}</dt>
	 * <dd>A one-component, 64-bit unsigned integer format that has a single 64-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R64_SINT FORMAT_R64_SINT}</dt>
	 * <dd>A one-component, 64-bit signed integer format that has a single 64-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R64_SFLOAT FORMAT_R64_SFLOAT}</dt>
	 * <dd>A one-component, 64-bit signed floating-point format that has a single 64-bit R component.</dd>
	 * <dt>{@link #VK_FORMAT_R64G64_UINT FORMAT_R64G64_UINT}</dt>
	 * <dd>A two-component, 128-bit unsigned integer format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15.</dd>
	 * <dt>{@link #VK_FORMAT_R64G64_SINT FORMAT_R64G64_SINT}</dt>
	 * <dd>A two-component, 128-bit signed integer format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15.</dd>
	 * <dt>{@link #VK_FORMAT_R64G64_SFLOAT FORMAT_R64G64_SFLOAT}</dt>
	 * <dd>A two-component, 128-bit signed floating-point format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15.</dd>
	 * <dt>{@link #VK_FORMAT_R64G64B64_UINT FORMAT_R64G64B64_UINT}</dt>
	 * <dd>A three-component, 192-bit unsigned integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23.</dd>
	 * <dt>{@link #VK_FORMAT_R64G64B64_SINT FORMAT_R64G64B64_SINT}</dt>
	 * <dd>A three-component, 192-bit signed integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23.</dd>
	 * <dt>{@link #VK_FORMAT_R64G64B64_SFLOAT FORMAT_R64G64B64_SFLOAT}</dt>
	 * <dd>A three-component, 192-bit signed floating-point format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23.</dd>
	 * <dt>{@link #VK_FORMAT_R64G64B64A64_UINT FORMAT_R64G64B64A64_UINT}</dt>
	 * <dd>A four-component, 256-bit unsigned integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31.</dd>
	 * <dt>{@link #VK_FORMAT_R64G64B64A64_SINT FORMAT_R64G64B64A64_SINT}</dt>
	 * <dd>A four-component, 256-bit signed integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31.</dd>
	 * <dt>{@link #VK_FORMAT_R64G64B64A64_SFLOAT FORMAT_R64G64B64A64_SFLOAT}</dt>
	 * <dd>A four-component, 256-bit signed floating-point format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31.</dd>
	 * <dt>{@link #VK_FORMAT_B10G11R11_UFLOAT_PACK32 FORMAT_B10G11R11_UFLOAT_PACK32}</dt>
	 * <dd>A three-component, 32-bit packed unsigned floating-point format that has a 10-bit B component in bits 22..31, an 11-bit G component in bits 11..21, an 11-bit R component in bits 0..10. See <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#fundamentals-fp10">the “Unsigned 10-Bit Floating-Point Numbers” section</a> and <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#fundamentals-fp11">the “Unsigned 11-Bit Floating-Point Numbers” section</a>.</dd>
	 * <dt>{@link #VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 FORMAT_E5B9G9R9_UFLOAT_PACK32}</dt>
	 * <dd>A three-component, 32-bit packed unsigned floating-point format that has a 5-bit shared exponent in bits 27..31, a 9-bit B component mantissa in bits 18..26, a 9-bit G component mantissa in bits 9..17, and a 9-bit R component mantissa in bits 0..8.</dd>
	 * <dt>{@link #VK_FORMAT_D16_UNORM FORMAT_D16_UNORM}</dt>
	 * <dd>A one-component, 16-bit unsigned normalized format that has a single 16-bit depth component.</dd>
	 * <dt>{@link #VK_FORMAT_X8_D24_UNORM_PACK32 FORMAT_X8_D24_UNORM_PACK32}</dt>
	 * <dd>A two-component, 32-bit format that has 24 unsigned normalized bits in the depth component and, optionally:, 8 bits that are unused.</dd>
	 * <dt>{@link #VK_FORMAT_D32_SFLOAT FORMAT_D32_SFLOAT}</dt>
	 * <dd>A one-component, 32-bit signed floating-point format that has 32-bits in the depth component.</dd>
	 * <dt>{@link #VK_FORMAT_S8_UINT FORMAT_S8_UINT}</dt>
	 * <dd>A one-component, 8-bit unsigned integer format that has 8-bits in the stencil component.</dd>
	 * <dt>{@link #VK_FORMAT_D16_UNORM_S8_UINT FORMAT_D16_UNORM_S8_UINT}</dt>
	 * <dd>A two-component, 24-bit format that has 16 unsigned normalized bits in the depth component and 8 unsigned integer bits in the stencil component.</dd>
	 * <dt>{@link #VK_FORMAT_D24_UNORM_S8_UINT FORMAT_D24_UNORM_S8_UINT}</dt>
	 * <dd>A two-component, 32-bit packed format that has 8 unsigned integer bits in the stencil component, and 24 unsigned normalized bits in the depth component.</dd>
	 * <dt>{@link #VK_FORMAT_D32_SFLOAT_S8_UINT FORMAT_D32_SFLOAT_S8_UINT}</dt>
	 * <dd>A two-component format that has 32 signed float bits in the depth component and 8 unsigned integer bits in the stencil component. There are optionally: 24-bits that are unused.</dd>
	 * <dt>{@link #VK_FORMAT_BC1_RGB_UNORM_BLOCK FORMAT_BC1_RGB_UNORM_BLOCK}</dt>
	 * <dd>A three-component, block-compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data. This format has no alpha and is considered opaque.</dd>
	 * <dt>{@link #VK_FORMAT_BC1_RGB_SRGB_BLOCK FORMAT_BC1_RGB_SRGB_BLOCK}</dt>
	 * <dd>A three-component, block-compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data with sRGB nonlinear encoding. This format has no alpha and is considered opaque.</dd>
	 * <dt>{@link #VK_FORMAT_BC1_RGBA_UNORM_BLOCK FORMAT_BC1_RGBA_UNORM_BLOCK}</dt>
	 * <dd>A four-component, block-compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data, and provides 1 bit of alpha.</dd>
	 * <dt>{@link #VK_FORMAT_BC1_RGBA_SRGB_BLOCK FORMAT_BC1_RGBA_SRGB_BLOCK}</dt>
	 * <dd>A four-component, block-compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data with sRGB nonlinear encoding, and provides 1 bit of alpha.</dd>
	 * <dt>{@link #VK_FORMAT_BC2_UNORM_BLOCK FORMAT_BC2_UNORM_BLOCK}</dt>
	 * <dd>A four-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values.</dd>
	 * <dt>{@link #VK_FORMAT_BC2_SRGB_BLOCK FORMAT_BC2_SRGB_BLOCK}</dt>
	 * <dd>A four-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values with sRGB nonlinear encoding.</dd>
	 * <dt>{@link #VK_FORMAT_BC3_UNORM_BLOCK FORMAT_BC3_UNORM_BLOCK}</dt>
	 * <dd>A four-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values.</dd>
	 * <dt>{@link #VK_FORMAT_BC3_SRGB_BLOCK FORMAT_BC3_SRGB_BLOCK}</dt>
	 * <dd>A four-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values with sRGB nonlinear encoding.</dd>
	 * <dt>{@link #VK_FORMAT_BC4_UNORM_BLOCK FORMAT_BC4_UNORM_BLOCK}</dt>
	 * <dd>A one-component, block-compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized red texel data.</dd>
	 * <dt>{@link #VK_FORMAT_BC4_SNORM_BLOCK FORMAT_BC4_SNORM_BLOCK}</dt>
	 * <dd>A one-component, block-compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of signed normalized red texel data.</dd>
	 * <dt>{@link #VK_FORMAT_BC5_UNORM_BLOCK FORMAT_BC5_UNORM_BLOCK}</dt>
	 * <dd>A two-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RG texel data with the first 64 bits encoding red values followed by 64 bits encoding green values.</dd>
	 * <dt>{@link #VK_FORMAT_BC5_SNORM_BLOCK FORMAT_BC5_SNORM_BLOCK}</dt>
	 * <dd>A two-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of signed normalized RG texel data with the first 64 bits encoding red values followed by 64 bits encoding green values.</dd>
	 * <dt>{@link #VK_FORMAT_BC6H_UFLOAT_BLOCK FORMAT_BC6H_UFLOAT_BLOCK}</dt>
	 * <dd>A three-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned floating-point RGB texel data.</dd>
	 * <dt>{@link #VK_FORMAT_BC6H_SFLOAT_BLOCK FORMAT_BC6H_SFLOAT_BLOCK}</dt>
	 * <dd>A three-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of signed floating-point RGB texel data.</dd>
	 * <dt>{@link #VK_FORMAT_BC7_UNORM_BLOCK FORMAT_BC7_UNORM_BLOCK}</dt>
	 * <dd>A four-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_BC7_SRGB_BLOCK FORMAT_BC7_SRGB_BLOCK}</dt>
	 * <dd>A four-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK FORMAT_ETC2_R8G8B8_UNORM_BLOCK}</dt>
	 * <dd>A three-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data. This format has no alpha and is considered opaque.</dd>
	 * <dt>{@link #VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK FORMAT_ETC2_R8G8B8_SRGB_BLOCK}</dt>
	 * <dd>A three-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data with sRGB nonlinear encoding. This format has no alpha and is considered opaque.</dd>
	 * <dt>{@link #VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data, and provides 1 bit of alpha.</dd>
	 * <dt>{@link #VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data with sRGB nonlinear encoding, and provides 1 bit of alpha.</dd>
	 * <dt>{@link #VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ETC2 compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values.</dd>
	 * <dt>{@link #VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values with sRGB nonlinear encoding applied.</dd>
	 * <dt>{@link #VK_FORMAT_EAC_R11_UNORM_BLOCK FORMAT_EAC_R11_UNORM_BLOCK}</dt>
	 * <dd>A one-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized red texel data.</dd>
	 * <dt>{@link #VK_FORMAT_EAC_R11_SNORM_BLOCK FORMAT_EAC_R11_SNORM_BLOCK}</dt>
	 * <dd>A one-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of signed normalized red texel data.</dd>
	 * <dt>{@link #VK_FORMAT_EAC_R11G11_UNORM_BLOCK FORMAT_EAC_R11G11_UNORM_BLOCK}</dt>
	 * <dd>A two-component, ETC2 compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RG texel data with the first 64 bits encoding red values followed by 64 bits encoding green values.</dd>
	 * <dt>{@link #VK_FORMAT_EAC_R11G11_SNORM_BLOCK FORMAT_EAC_R11G11_SNORM_BLOCK}</dt>
	 * <dd>A two-component, ETC2 compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of signed normalized RG texel data with the first 64 bits encoding red values followed by 64 bits encoding green values.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_4x4_UNORM_BLOCK FORMAT_ASTC_4x4_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_4x4_SRGB_BLOCK FORMAT_ASTC_4x4_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_5x4_UNORM_BLOCK FORMAT_ASTC_5x4_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5x4 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_5x4_SRGB_BLOCK FORMAT_ASTC_5x4_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5x4 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_5x5_UNORM_BLOCK FORMAT_ASTC_5x5_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5x5 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_5x5_SRGB_BLOCK FORMAT_ASTC_5x5_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5x5 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_6x5_UNORM_BLOCK FORMAT_ASTC_6x5_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6x5 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_6x5_SRGB_BLOCK FORMAT_ASTC_6x5_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6x5 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_6x6_UNORM_BLOCK FORMAT_ASTC_6x6_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6x6 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_6x6_SRGB_BLOCK FORMAT_ASTC_6x6_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6x6 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_8x5_UNORM_BLOCK FORMAT_ASTC_8x5_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8x5 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_8x5_SRGB_BLOCK FORMAT_ASTC_8x5_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8x5 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_8x6_UNORM_BLOCK FORMAT_ASTC_8x6_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8x6 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_8x6_SRGB_BLOCK FORMAT_ASTC_8x6_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8x6 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_8x8_UNORM_BLOCK FORMAT_ASTC_8x8_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8x8 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_8x8_SRGB_BLOCK FORMAT_ASTC_8x8_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8x8 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_10x5_UNORM_BLOCK FORMAT_ASTC_10x5_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x5 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_10x5_SRGB_BLOCK FORMAT_ASTC_10x5_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x5 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_10x6_UNORM_BLOCK FORMAT_ASTC_10x6_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x6 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_10x6_SRGB_BLOCK FORMAT_ASTC_10x6_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x6 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_10x8_UNORM_BLOCK FORMAT_ASTC_10x8_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x8 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_10x8_SRGB_BLOCK FORMAT_ASTC_10x8_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x8 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_10x10_UNORM_BLOCK FORMAT_ASTC_10x10_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x10 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_10x10_SRGB_BLOCK FORMAT_ASTC_10x10_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x10 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_12x10_UNORM_BLOCK FORMAT_ASTC_12x10_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12x10 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_12x10_SRGB_BLOCK FORMAT_ASTC_12x10_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12x10 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_12x12_UNORM_BLOCK FORMAT_ASTC_12x12_UNORM_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12x12 rectangle of unsigned normalized RGBA texel data.</dd>
	 * <dt>{@link #VK_FORMAT_ASTC_12x12_SRGB_BLOCK FORMAT_ASTC_12x12_SRGB_BLOCK}</dt>
	 * <dd>A four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12x12 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAttachmentDescription}, {@link VkBufferViewCreateInfo}, {@link VkImageCreateInfo}, {@link VkImageViewCreateInfo}, {@link VkSurfaceFormatKHR}, {@link VkSwapchainCreateInfoKHR}, {@link VkVertexInputAttributeDescription}, {@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}, {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}, {@link #vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}, {@link #vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties}</p>
	 */
	public static final int
		VK_FORMAT_UNDEFINED                  = 0,
		VK_FORMAT_R4G4_UNORM_PACK8           = 1,
		VK_FORMAT_R4G4B4A4_UNORM_PACK16      = 2,
		VK_FORMAT_B4G4R4A4_UNORM_PACK16      = 3,
		VK_FORMAT_R5G6B5_UNORM_PACK16        = 4,
		VK_FORMAT_B5G6R5_UNORM_PACK16        = 5,
		VK_FORMAT_R5G5B5A1_UNORM_PACK16      = 6,
		VK_FORMAT_B5G5R5A1_UNORM_PACK16      = 7,
		VK_FORMAT_A1R5G5B5_UNORM_PACK16      = 8,
		VK_FORMAT_R8_UNORM                   = 9,
		VK_FORMAT_R8_SNORM                   = 10,
		VK_FORMAT_R8_USCALED                 = 11,
		VK_FORMAT_R8_SSCALED                 = 12,
		VK_FORMAT_R8_UINT                    = 13,
		VK_FORMAT_R8_SINT                    = 14,
		VK_FORMAT_R8_SRGB                    = 15,
		VK_FORMAT_R8G8_UNORM                 = 16,
		VK_FORMAT_R8G8_SNORM                 = 17,
		VK_FORMAT_R8G8_USCALED               = 18,
		VK_FORMAT_R8G8_SSCALED               = 19,
		VK_FORMAT_R8G8_UINT                  = 20,
		VK_FORMAT_R8G8_SINT                  = 21,
		VK_FORMAT_R8G8_SRGB                  = 22,
		VK_FORMAT_R8G8B8_UNORM               = 23,
		VK_FORMAT_R8G8B8_SNORM               = 24,
		VK_FORMAT_R8G8B8_USCALED             = 25,
		VK_FORMAT_R8G8B8_SSCALED             = 26,
		VK_FORMAT_R8G8B8_UINT                = 27,
		VK_FORMAT_R8G8B8_SINT                = 28,
		VK_FORMAT_R8G8B8_SRGB                = 29,
		VK_FORMAT_B8G8R8_UNORM               = 30,
		VK_FORMAT_B8G8R8_SNORM               = 31,
		VK_FORMAT_B8G8R8_USCALED             = 32,
		VK_FORMAT_B8G8R8_SSCALED             = 33,
		VK_FORMAT_B8G8R8_UINT                = 34,
		VK_FORMAT_B8G8R8_SINT                = 35,
		VK_FORMAT_B8G8R8_SRGB                = 36,
		VK_FORMAT_R8G8B8A8_UNORM             = 37,
		VK_FORMAT_R8G8B8A8_SNORM             = 38,
		VK_FORMAT_R8G8B8A8_USCALED           = 39,
		VK_FORMAT_R8G8B8A8_SSCALED           = 40,
		VK_FORMAT_R8G8B8A8_UINT              = 41,
		VK_FORMAT_R8G8B8A8_SINT              = 42,
		VK_FORMAT_R8G8B8A8_SRGB              = 43,
		VK_FORMAT_B8G8R8A8_UNORM             = 44,
		VK_FORMAT_B8G8R8A8_SNORM             = 45,
		VK_FORMAT_B8G8R8A8_USCALED           = 46,
		VK_FORMAT_B8G8R8A8_SSCALED           = 47,
		VK_FORMAT_B8G8R8A8_UINT              = 48,
		VK_FORMAT_B8G8R8A8_SINT              = 49,
		VK_FORMAT_B8G8R8A8_SRGB              = 50,
		VK_FORMAT_A8B8G8R8_UNORM_PACK32      = 51,
		VK_FORMAT_A8B8G8R8_SNORM_PACK32      = 52,
		VK_FORMAT_A8B8G8R8_USCALED_PACK32    = 53,
		VK_FORMAT_A8B8G8R8_SSCALED_PACK32    = 54,
		VK_FORMAT_A8B8G8R8_UINT_PACK32       = 55,
		VK_FORMAT_A8B8G8R8_SINT_PACK32       = 56,
		VK_FORMAT_A8B8G8R8_SRGB_PACK32       = 57,
		VK_FORMAT_A2R10G10B10_UNORM_PACK32   = 58,
		VK_FORMAT_A2R10G10B10_SNORM_PACK32   = 59,
		VK_FORMAT_A2R10G10B10_USCALED_PACK32 = 60,
		VK_FORMAT_A2R10G10B10_SSCALED_PACK32 = 61,
		VK_FORMAT_A2R10G10B10_UINT_PACK32    = 62,
		VK_FORMAT_A2R10G10B10_SINT_PACK32    = 63,
		VK_FORMAT_A2B10G10R10_UNORM_PACK32   = 64,
		VK_FORMAT_A2B10G10R10_SNORM_PACK32   = 65,
		VK_FORMAT_A2B10G10R10_USCALED_PACK32 = 66,
		VK_FORMAT_A2B10G10R10_SSCALED_PACK32 = 67,
		VK_FORMAT_A2B10G10R10_UINT_PACK32    = 68,
		VK_FORMAT_A2B10G10R10_SINT_PACK32    = 69,
		VK_FORMAT_R16_UNORM                  = 70,
		VK_FORMAT_R16_SNORM                  = 71,
		VK_FORMAT_R16_USCALED                = 72,
		VK_FORMAT_R16_SSCALED                = 73,
		VK_FORMAT_R16_UINT                   = 74,
		VK_FORMAT_R16_SINT                   = 75,
		VK_FORMAT_R16_SFLOAT                 = 76,
		VK_FORMAT_R16G16_UNORM               = 77,
		VK_FORMAT_R16G16_SNORM               = 78,
		VK_FORMAT_R16G16_USCALED             = 79,
		VK_FORMAT_R16G16_SSCALED             = 80,
		VK_FORMAT_R16G16_UINT                = 81,
		VK_FORMAT_R16G16_SINT                = 82,
		VK_FORMAT_R16G16_SFLOAT              = 83,
		VK_FORMAT_R16G16B16_UNORM            = 84,
		VK_FORMAT_R16G16B16_SNORM            = 85,
		VK_FORMAT_R16G16B16_USCALED          = 86,
		VK_FORMAT_R16G16B16_SSCALED          = 87,
		VK_FORMAT_R16G16B16_UINT             = 88,
		VK_FORMAT_R16G16B16_SINT             = 89,
		VK_FORMAT_R16G16B16_SFLOAT           = 90,
		VK_FORMAT_R16G16B16A16_UNORM         = 91,
		VK_FORMAT_R16G16B16A16_SNORM         = 92,
		VK_FORMAT_R16G16B16A16_USCALED       = 93,
		VK_FORMAT_R16G16B16A16_SSCALED       = 94,
		VK_FORMAT_R16G16B16A16_UINT          = 95,
		VK_FORMAT_R16G16B16A16_SINT          = 96,
		VK_FORMAT_R16G16B16A16_SFLOAT        = 97,
		VK_FORMAT_R32_UINT                   = 98,
		VK_FORMAT_R32_SINT                   = 99,
		VK_FORMAT_R32_SFLOAT                 = 100,
		VK_FORMAT_R32G32_UINT                = 101,
		VK_FORMAT_R32G32_SINT                = 102,
		VK_FORMAT_R32G32_SFLOAT              = 103,
		VK_FORMAT_R32G32B32_UINT             = 104,
		VK_FORMAT_R32G32B32_SINT             = 105,
		VK_FORMAT_R32G32B32_SFLOAT           = 106,
		VK_FORMAT_R32G32B32A32_UINT          = 107,
		VK_FORMAT_R32G32B32A32_SINT          = 108,
		VK_FORMAT_R32G32B32A32_SFLOAT        = 109,
		VK_FORMAT_R64_UINT                   = 110,
		VK_FORMAT_R64_SINT                   = 111,
		VK_FORMAT_R64_SFLOAT                 = 112,
		VK_FORMAT_R64G64_UINT                = 113,
		VK_FORMAT_R64G64_SINT                = 114,
		VK_FORMAT_R64G64_SFLOAT              = 115,
		VK_FORMAT_R64G64B64_UINT             = 116,
		VK_FORMAT_R64G64B64_SINT             = 117,
		VK_FORMAT_R64G64B64_SFLOAT           = 118,
		VK_FORMAT_R64G64B64A64_UINT          = 119,
		VK_FORMAT_R64G64B64A64_SINT          = 120,
		VK_FORMAT_R64G64B64A64_SFLOAT        = 121,
		VK_FORMAT_B10G11R11_UFLOAT_PACK32    = 122,
		VK_FORMAT_E5B9G9R9_UFLOAT_PACK32     = 123,
		VK_FORMAT_D16_UNORM                  = 124,
		VK_FORMAT_X8_D24_UNORM_PACK32        = 125,
		VK_FORMAT_D32_SFLOAT                 = 126,
		VK_FORMAT_S8_UINT                    = 127,
		VK_FORMAT_D16_UNORM_S8_UINT          = 128,
		VK_FORMAT_D24_UNORM_S8_UINT          = 129,
		VK_FORMAT_D32_SFLOAT_S8_UINT         = 130,
		VK_FORMAT_BC1_RGB_UNORM_BLOCK        = 131,
		VK_FORMAT_BC1_RGB_SRGB_BLOCK         = 132,
		VK_FORMAT_BC1_RGBA_UNORM_BLOCK       = 133,
		VK_FORMAT_BC1_RGBA_SRGB_BLOCK        = 134,
		VK_FORMAT_BC2_UNORM_BLOCK            = 135,
		VK_FORMAT_BC2_SRGB_BLOCK             = 136,
		VK_FORMAT_BC3_UNORM_BLOCK            = 137,
		VK_FORMAT_BC3_SRGB_BLOCK             = 138,
		VK_FORMAT_BC4_UNORM_BLOCK            = 139,
		VK_FORMAT_BC4_SNORM_BLOCK            = 140,
		VK_FORMAT_BC5_UNORM_BLOCK            = 141,
		VK_FORMAT_BC5_SNORM_BLOCK            = 142,
		VK_FORMAT_BC6H_UFLOAT_BLOCK          = 143,
		VK_FORMAT_BC6H_SFLOAT_BLOCK          = 144,
		VK_FORMAT_BC7_UNORM_BLOCK            = 145,
		VK_FORMAT_BC7_SRGB_BLOCK             = 146,
		VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK    = 147,
		VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK     = 148,
		VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK  = 149,
		VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK   = 150,
		VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK  = 151,
		VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK   = 152,
		VK_FORMAT_EAC_R11_UNORM_BLOCK        = 153,
		VK_FORMAT_EAC_R11_SNORM_BLOCK        = 154,
		VK_FORMAT_EAC_R11G11_UNORM_BLOCK     = 155,
		VK_FORMAT_EAC_R11G11_SNORM_BLOCK     = 156,
		VK_FORMAT_ASTC_4x4_UNORM_BLOCK       = 157,
		VK_FORMAT_ASTC_4x4_SRGB_BLOCK        = 158,
		VK_FORMAT_ASTC_5x4_UNORM_BLOCK       = 159,
		VK_FORMAT_ASTC_5x4_SRGB_BLOCK        = 160,
		VK_FORMAT_ASTC_5x5_UNORM_BLOCK       = 161,
		VK_FORMAT_ASTC_5x5_SRGB_BLOCK        = 162,
		VK_FORMAT_ASTC_6x5_UNORM_BLOCK       = 163,
		VK_FORMAT_ASTC_6x5_SRGB_BLOCK        = 164,
		VK_FORMAT_ASTC_6x6_UNORM_BLOCK       = 165,
		VK_FORMAT_ASTC_6x6_SRGB_BLOCK        = 166,
		VK_FORMAT_ASTC_8x5_UNORM_BLOCK       = 167,
		VK_FORMAT_ASTC_8x5_SRGB_BLOCK        = 168,
		VK_FORMAT_ASTC_8x6_UNORM_BLOCK       = 169,
		VK_FORMAT_ASTC_8x6_SRGB_BLOCK        = 170,
		VK_FORMAT_ASTC_8x8_UNORM_BLOCK       = 171,
		VK_FORMAT_ASTC_8x8_SRGB_BLOCK        = 172,
		VK_FORMAT_ASTC_10x5_UNORM_BLOCK      = 173,
		VK_FORMAT_ASTC_10x5_SRGB_BLOCK       = 174,
		VK_FORMAT_ASTC_10x6_UNORM_BLOCK      = 175,
		VK_FORMAT_ASTC_10x6_SRGB_BLOCK       = 176,
		VK_FORMAT_ASTC_10x8_UNORM_BLOCK      = 177,
		VK_FORMAT_ASTC_10x8_SRGB_BLOCK       = 178,
		VK_FORMAT_ASTC_10x10_UNORM_BLOCK     = 179,
		VK_FORMAT_ASTC_10x10_SRGB_BLOCK      = 180,
		VK_FORMAT_ASTC_12x10_UNORM_BLOCK     = 181,
		VK_FORMAT_ASTC_12x10_SRGB_BLOCK      = 182,
		VK_FORMAT_ASTC_12x12_UNORM_BLOCK     = 183,
		VK_FORMAT_ASTC_12x12_SRGB_BLOCK      = 184;

	/**
	 * VkFormatFeatureFlagBits - Bitmask specifying features supported by a buffer
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkFormatProperties}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkFormatFeatureFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}</li>
	 * <li>{@link #VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT}</li>
	 * <li>{@link #VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</li>
	 * <li>{@link #VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT}</li>
	 * <li>{@link #VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT}</li>
	 * <li>{@link #VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT}</li>
	 * <li>{@link #VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT FORMAT_FEATURE_VERTEX_BUFFER_BIT}</li>
	 * <li>{@link #VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}</li>
	 * <li>{@link #VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}</li>
	 * <li>{@link #VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
	 * <li>{@link #VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT}</li>
	 * <li>{@link #VK_FORMAT_FEATURE_BLIT_DST_BIT FORMAT_FEATURE_BLIT_DST_BIT}</li>
	 * <li>{@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
	 * </ul>
	 */
	public static final int
		VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT               = 0x1,
		VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT               = 0x2,
		VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT        = 0x4,
		VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT        = 0x8,
		VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT        = 0x10,
		VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 0x20,
		VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT               = 0x40,
		VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT            = 0x80,
		VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT      = 0x100,
		VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT    = 0x200,
		VK_FORMAT_FEATURE_BLIT_SRC_BIT                    = 0x400,
		VK_FORMAT_FEATURE_BLIT_DST_BIT                    = 0x800,
		VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 0x1000;

	/**
	 * VkImageType - Specifies the type of an image object
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>These values specify one-, two-, or three-dimensional images, respectively.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkImageCreateInfo}, {@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}, {@link #vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}, {@link #vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}</li>
	 * <li>{@link #VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
	 * <li>{@link #VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</li>
	 * </ul>
	 */
	public static final int
		VK_IMAGE_TYPE_1D = 0,
		VK_IMAGE_TYPE_2D = 1,
		VK_IMAGE_TYPE_3D = 2;

	/**
	 * VkImageTiling - Specifies the tiling arrangement of data in an image
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL} specifies optimal tiling (texels are laid out in an implementation-dependent arrangement, for more optimal memory access), and {@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} specifies linear tiling (texels are laid out in memory in row-major order, possibly with some padding on each row).</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkImageCreateInfo}, {@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}, {@link #vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}, {@link #vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties}</p>
	 */
	public static final int
		VK_IMAGE_TILING_OPTIMAL = 0,
		VK_IMAGE_TILING_LINEAR  = 1;

	/**
	 * VkImageUsageFlagBits - Bitmask specifying intended usage of an image
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>These bits have the following meanings:</p>
	 * 
	 * <ul>
	 * <li>{@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} indicates that the image <b>can</b> be used as the source of a transfer command.</li>
	 * <li>{@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} indicates that the image <b>can</b> be used as the destination of a transfer command.</li>
	 * <li>{@link #VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} indicates that the image <b>can</b> be used to create a {@code VkImageView} suitable for occupying a {@code VkDescriptorSet} slot either of type {@link #VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} or {@link #VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, and be sampled by a shader.</li>
	 * <li>{@link #VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT} indicates that the image <b>can</b> be used to create a {@code VkImageView} suitable for occupying a {@code VkDescriptorSet} slot of type {@link #VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}.</li>
	 * <li>{@link #VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} indicates that the image <b>can</b> be used to create a {@code VkImageView} suitable for use as a color or resolve attachment in a {@code VkFramebuffer}.</li>
	 * <li>{@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} indicates that the image <b>can</b> be used to create a {@code VkImageView} suitable for use as a depth/stencil attachment in a {@code VkFramebuffer}.</li>
	 * <li>{@link #VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT} indicates that the memory bound to this image will have been allocated with the {@link #VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT} (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory">the “Memory Allocation” chapter</a> for more detail). This bit <b>can</b> be set for any image that <b>can</b> be used to create a {@code VkImageView} suitable for use as a color, resolve, depth/stencil, or input attachment.</li>
	 * <li>{@link #VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} indicates that the image <b>can</b> be used to create a {@code VkImageView} suitable for occupying {@code VkDescriptorSet} slot of type {@link #VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}; be read from a shader as an input attachment; and be used as an input attachment in a framebuffer.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkImageUsageFlags}</p>
	 */
	public static final int
		VK_IMAGE_USAGE_TRANSFER_SRC_BIT             = 0x1,
		VK_IMAGE_USAGE_TRANSFER_DST_BIT             = 0x2,
		VK_IMAGE_USAGE_SAMPLED_BIT                  = 0x4,
		VK_IMAGE_USAGE_STORAGE_BIT                  = 0x8,
		VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT         = 0x10,
		VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x20,
		VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT     = 0x40,
		VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT         = 0x80;

	/**
	 * VkImageCreateFlagBits - Bitmask specifying additional parameters of an image
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>These bits have the following meanings:</p>
	 * 
	 * <ul>
	 * <li>{@link #VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT} indicates that the image will be backed using sparse memory binding.</li>
	 * <li>{@link #VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} indicates that the image <b>can</b> be partially backed using sparse memory binding. Images created with this flag <b>must</b> also be created with the {@link #VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT} flag.</li>
	 * <li>{@link #VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT} indicates that the image will be backed using sparse memory binding with memory ranges that might also simultaneously be backing another image (or another portion of the same image). Images created with this flag <b>must</b> also be created with the {@link #VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT} flag</li>
	 * <li>{@link #VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} indicates that the image <b>can</b> be used to create a {@code VkImageView} with a different format from the image.</li>
	 * <li>{@link #VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT} indicates that the image <b>can</b> be used to create a {@code VkImageView} of type {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}.</li>
	 * </ul>
	 * 
	 * <p>If any of the bits {@link #VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, {@link #VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}, or {@link #VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT} are set, {@link #VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT} <b>must</b> not also be set.</p>
	 * 
	 * <p>See <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#sparsememory-sparseresourcefeatures">Sparse Resource Features</a> and <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#sparsememory-physicalfeatures">Sparse Physical Device Features</a> for more details.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkImageCreateFlags}</p>
	 */
	public static final int
		VK_IMAGE_CREATE_SPARSE_BINDING_BIT   = 0x1,
		VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = 0x2,
		VK_IMAGE_CREATE_SPARSE_ALIASED_BIT   = 0x4,
		VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT   = 0x8,
		VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT  = 0x10;

	/**
	 * VkSampleCountFlagBits - Bitmask specifying sample counts supported for an image used for storage operations
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkPhysicalDeviceLimits}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAttachmentDescription}, {@link VkImageCreateInfo}, {@link VkPipelineMultisampleStateCreateInfo}, {@code VkSampleCountFlags}, {@link #vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@link #VK_SAMPLE_COUNT_2_BIT SAMPLE_COUNT_2_BIT}</li>
	 * <li>{@link #VK_SAMPLE_COUNT_4_BIT SAMPLE_COUNT_4_BIT}</li>
	 * <li>{@link #VK_SAMPLE_COUNT_8_BIT SAMPLE_COUNT_8_BIT}</li>
	 * <li>{@link #VK_SAMPLE_COUNT_16_BIT SAMPLE_COUNT_16_BIT}</li>
	 * <li>{@link #VK_SAMPLE_COUNT_32_BIT SAMPLE_COUNT_32_BIT}</li>
	 * <li>{@link #VK_SAMPLE_COUNT_64_BIT SAMPLE_COUNT_64_BIT}</li>
	 * </ul>
	 */
	public static final int
		VK_SAMPLE_COUNT_1_BIT  = 0x1,
		VK_SAMPLE_COUNT_2_BIT  = 0x2,
		VK_SAMPLE_COUNT_4_BIT  = 0x4,
		VK_SAMPLE_COUNT_8_BIT  = 0x8,
		VK_SAMPLE_COUNT_16_BIT = 0x10,
		VK_SAMPLE_COUNT_32_BIT = 0x20,
		VK_SAMPLE_COUNT_64_BIT = 0x40;

	/**
	 * VkPhysicalDeviceType - Supported physical device types
	 * 
	 * <h5>Description</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_PHYSICAL_DEVICE_TYPE_OTHER PHYSICAL_DEVICE_TYPE_OTHER} The device does not match any other available types.</li>
	 * <li>{@link #VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU} The device is typically one embedded in or tightly coupled with the host.</li>
	 * <li>{@link #VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU PHYSICAL_DEVICE_TYPE_DISCRETE_GPU} The device is typically a separate processor connected to the host via an interlink.</li>
	 * <li>{@link #VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU} The device is typically a virtual node in a virtualization environment.</li>
	 * <li>{@link #VK_PHYSICAL_DEVICE_TYPE_CPU PHYSICAL_DEVICE_TYPE_CPU} The device is typically running on the same processors as the host.</li>
	 * </ul>
	 * 
	 * <p>The physical device type is advertised for informational purposes only, and does not directly affect the operation of the system. However, the device type <b>may</b> correlate with other advertised properties or capabilities of the system, such as how many memory heaps there are.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPhysicalDeviceProperties}</p>
	 */
	public static final int
		VK_PHYSICAL_DEVICE_TYPE_OTHER          = 0,
		VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1,
		VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU   = 2,
		VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU    = 3,
		VK_PHYSICAL_DEVICE_TYPE_CPU            = 4;

	/**
	 * VkQueueFlagBits - Bitmask specifying capabilities of queues in a queue family
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkQueueFamilyProperties}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkQueueFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT}</li>
	 * <li>{@link #VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}</li>
	 * <li>{@link #VK_QUEUE_TRANSFER_BIT QUEUE_TRANSFER_BIT}</li>
	 * <li>{@link #VK_QUEUE_SPARSE_BINDING_BIT QUEUE_SPARSE_BINDING_BIT}</li>
	 * </ul>
	 */
	public static final int
		VK_QUEUE_GRAPHICS_BIT       = 0x1,
		VK_QUEUE_COMPUTE_BIT        = 0x2,
		VK_QUEUE_TRANSFER_BIT       = 0x4,
		VK_QUEUE_SPARSE_BINDING_BIT = 0x8;

	/**
	 * VkMemoryPropertyFlagBits - Bitmask specifying properties for a memory type
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkMemoryType}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkMemoryPropertyFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT}</li>
	 * <li>{@link #VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT}</li>
	 * <li>{@link #VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}</li>
	 * <li>{@link #VK_MEMORY_PROPERTY_HOST_CACHED_BIT MEMORY_PROPERTY_HOST_CACHED_BIT}</li>
	 * <li>{@link #VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT}</li>
	 * </ul>
	 */
	public static final int
		VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT     = 0x1,
		VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT     = 0x2,
		VK_MEMORY_PROPERTY_HOST_COHERENT_BIT    = 0x4,
		VK_MEMORY_PROPERTY_HOST_CACHED_BIT      = 0x8,
		VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 0x10;

	/**
	 * VkMemoryHeapFlagBits - Bitmask specifying attribute flags for a heap
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkMemoryHeap}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkMemoryHeapFlags}</p>
	 */
	public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 0x1;

	/**
	 * VkPipelineStageFlagBits - Bitmask specifying pipeline stages
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The meaning of each bit is:</p>
	 * 
	 * <ul>
	 * <li>{@link #VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT PIPELINE_STAGE_TOP_OF_PIPE_BIT}: Stage of the pipeline where commands are initially received by the queue.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT PIPELINE_STAGE_DRAW_INDIRECT_BIT}: Stage of the pipeline where Draw/DispatchIndirect data structures are consumed.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_VERTEX_INPUT_BIT PIPELINE_STAGE_VERTEX_INPUT_BIT}: Stage of the pipeline where vertex and index buffers are consumed.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT}: Vertex shader stage.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}: Tessellation control shader stage.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}: Tessellation evaluation shader stage.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}: Geometry shader stage.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT PIPELINE_STAGE_FRAGMENT_SHADER_BIT}: Fragment shader stage.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT}: Stage of the pipeline where early fragment tests (depth and stencil tests before fragment shading) are performed.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT}: Stage of the pipeline where late fragment tests (depth and stencil tests after fragment shading) are performed.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}: Stage of the pipeline after blending where the final color values are output from the pipeline. This stage also includes resolve operations that occur at the end of a subpass. Note that this does not necessarily indicate that the values have been committed to memory.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}: Execution of copy commands. This includes the operations resulting from all transfer commands. The set of transfer commands comprises {@link #vkCmdCopyBuffer CmdCopyBuffer}, {@link #vkCmdCopyImage CmdCopyImage}, {@link #vkCmdBlitImage CmdBlitImage}, {@link #vkCmdCopyBufferToImage CmdCopyBufferToImage}, {@link #vkCmdCopyImageToBuffer CmdCopyImageToBuffer}, {@link #vkCmdUpdateBuffer CmdUpdateBuffer}, {@link #vkCmdFillBuffer CmdFillBuffer}, {@link #vkCmdClearColorImage CmdClearColorImage}, {@link #vkCmdClearDepthStencilImage CmdClearDepthStencilImage}, {@link #vkCmdResolveImage CmdResolveImage}, and {@link #vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults}.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT PIPELINE_STAGE_COMPUTE_SHADER_BIT}: Execution of a compute shader.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}: Final stage in the pipeline where commands complete execution.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}: A pseudo-stage indicating execution on the host of reads/writes of device memory.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}: Execution of all graphics pipeline stages.</li>
	 * <li>{@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT}: Execution of all stages supported on the queue.</li>
	 * </ul>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>The {@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT} and {@link #VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT} differ from {@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT} in that they correspond to all (or all graphics) stages, rather than to a specific stage at the end of the pipeline. An execution dependency with only {@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT} in {@code dstStageMask} will not delay subsequent commands, while including either of the other two bits will. Similarly, when defining a memory dependency, if the stage mask(s) refer to all stages, then the indicated access types from all stages will be made available and/or visible, but using only {@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT} would not make any accesses available and/or visible because this stage does not access memory. The {@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT} is useful for accomplishing memory barriers and layout transitions when the next accesses will be done in a different queue or by a presentation engine; in these cases subsequent commands in the same queue do not need to wait, but the barrier or transition <b>must</b> complete before semaphores associated with the batch signal.</p>
	 * </div>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkPipelineStageFlags}, {@link #vkCmdWriteTimestamp CmdWriteTimestamp}</p>
	 */
	public static final int
		VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT                    = 0x1,
		VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT                  = 0x2,
		VK_PIPELINE_STAGE_VERTEX_INPUT_BIT                   = 0x4,
		VK_PIPELINE_STAGE_VERTEX_SHADER_BIT                  = 0x8,
		VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT    = 0x10,
		VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = 0x20,
		VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT                = 0x40,
		VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT                = 0x80,
		VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT           = 0x100,
		VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT            = 0x200,
		VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT        = 0x400,
		VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT                 = 0x800,
		VK_PIPELINE_STAGE_TRANSFER_BIT                       = 0x1000,
		VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT                 = 0x2000,
		VK_PIPELINE_STAGE_HOST_BIT                           = 0x4000,
		VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT                   = 0x8000,
		VK_PIPELINE_STAGE_ALL_COMMANDS_BIT                   = 0x10000;

	/**
	 * VkImageAspectFlagBits - Bitmask specifying which aspects of an image are included in a view
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkImageSubresourceRange}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkImageAspectFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
	 * <li>{@link #VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT}</li>
	 * <li>{@link #VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
	 * <li>{@link #VK_IMAGE_ASPECT_METADATA_BIT IMAGE_ASPECT_METADATA_BIT}</li>
	 * </ul>
	 */
	public static final int
		VK_IMAGE_ASPECT_COLOR_BIT    = 0x1,
		VK_IMAGE_ASPECT_DEPTH_BIT    = 0x2,
		VK_IMAGE_ASPECT_STENCIL_BIT  = 0x4,
		VK_IMAGE_ASPECT_METADATA_BIT = 0x8;

	/**
	 * VkSparseImageFormatFlagBits - Bitmask specifying additional information about a sparse image resource
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkSparseImageFormatProperties}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkSparseImageFormatFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT}</li>
	 * <li>{@link #VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT}</li>
	 * <li>{@link #VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT}</li>
	 * </ul>
	 */
	public static final int
		VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT         = 0x1,
		VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT       = 0x2,
		VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = 0x4;

	/**
	 * VkSparseMemoryBindFlagBits - Bitmask specifying usage of a sparse memory binding operation
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkSparseMemoryBind}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkSparseMemoryBindFlags}</p>
	 */
	public static final int VK_SPARSE_MEMORY_BIND_METADATA_BIT = 0x1;

	/**
	 * VkFenceCreateFlagBits - Bitmask specifying initial state and behavior of a fence
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkFenceCreateInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkFenceCreateFlags}</p>
	 */
	public static final int VK_FENCE_CREATE_SIGNALED_BIT = 0x1;

	/**
	 * VkQueryType - Specify the type of queries managed by a query pool
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkQueryPoolCreateInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkQueryPoolCreateInfo}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION}</li>
	 * <li>{@link #VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS}</li>
	 * <li>{@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}</li>
	 * </ul>
	 */
	public static final int
		VK_QUERY_TYPE_OCCLUSION           = 0,
		VK_QUERY_TYPE_PIPELINE_STATISTICS = 1,
		VK_QUERY_TYPE_TIMESTAMP           = 2;

	/**
	 * VkQueryPipelineStatisticFlagBits - Bitmask specifying queried pipeline statistics
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>These bits have the following meanings:</p>
	 * 
	 * <ul>
	 * <li>If {@link #VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT} is set, queries managed by the pool will count the number of vertices processed by the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#drawing">input assembly</a> stage. Vertices corresponding to incomplete primitives <b>may</b> contribute to the count.</li>
	 * <li>If {@link #VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT} is set, queries managed by the pool will count the number of primitives processed by the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#drawing">input assembly</a> stage. If primitive restart is enabled, restarting the primitive topology has no effect on the count. Incomplete primitives <b>may</b> be counted.</li>
	 * <li>If {@link #VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT} is set, queries managed by the pool will count the number of vertex shader invocations. This counter&#8217;s value is incremented each time a vertex shader is <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#shaders-vertex-execution">invoked</a>.</li>
	 * <li>If {@link #VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT} is set, queries managed by the pool will count the number of geometry shader invocations. This counter&#8217;s value is incremented each time a geometry shader is <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#shaders-geometry-execution">invoked</a>. In the case of <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#geometry-invocations">instanced geometry shaders</a>, the geometry shader invocations count is incremented for each separate instanced invocation.</li>
	 * <li>If {@link #VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT} is set, queries managed by the pool will count the number of primitives generated by geometry shader invocations. The counter&#8217;s value is incremented each time the geometry shader emits a primitive. Restarting primitive topology using the SPIR-V instructions {@code OpEndPrimitive} or {@code OpEndStreamPrimitive} has no effect on the geometry shader output primitives count.</li>
	 * <li>If {@link #VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT} is set, queries managed by the pool will count the number of primitives processed by the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#vertexpostproc-clipping">Primitive Clipping</a> stage of the pipeline. The counter&#8217;s value is incremented each time a primitive reaches the primitive clipping stage.</li>
	 * <li>If {@link #VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT} is set, queries managed by the pool will count the number of primitives output by the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#vertexpostproc-clipping">Primitive Clipping</a> stage of the pipeline. The counter&#8217;s value is incremented each time a primitive passes the primitive clipping stage. The actual number of primitives output by the primitive clipping stage for a particular input primitive is implementation-dependent but <b>must</b> satisfy the following conditions:
	 * 
	 * <ul>
	 * <li>If at least one vertex of the input primitive lies inside the clipping volume, the counter is incremented by one or more.</li>
	 * <li>Otherwise, the counter is incremented by zero or more.</li>
	 * </ul>
	 * </li>
	 * <li>If {@link #VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT} is set, queries managed by the pool will count the number of fragment shader invocations. The counter&#8217;s value is incremented each time the fragment shader is <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#shaders-fragment-execution">invoked</a>.</li>
	 * <li>If {@link #VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT} is set, queries managed by the pool will count the number of patches processed by the tessellation control shader. The counter&#8217;s value is incremented once for each patch for which a tessellation control shader is <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#shaders-tessellation-control-execution">invoked</a>.</li>
	 * <li>If {@link #VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT} is set, queries managed by the pool will count the number of invocations of the tessellation evaluation shader. The counter&#8217;s value is incremented each time the tessellation evaluation shader is <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#shaders-tessellation-evaluation-execution">invoked</a>.</li>
	 * <li>If {@link #VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT} is set, queries managed by the pool will count the number of compute shader invocations. The counter&#8217;s value is incremented every time the compute shader is invoked. Implementations <b>may</b> skip the execution of certain compute shader invocations or execute additional compute shader invocations for implementation-dependent reasons as long as the results of rendering otherwise remain unchanged.</li>
	 * </ul>
	 * 
	 * <p>These values are intended to measure relative statistics on one implementation. Various device architectures will count these values differently. Any or all counters <b>may</b> be affected by the issues described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-undefined">Query Operation</a>.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>For example, tile-based rendering devices <b>may</b> need to replay the scene multiple times, affecting some of the counts.</p>
	 * </div>
	 * 
	 * <p>If a pipeline has {@code rasterizerDiscardEnable} enabled, implementations <b>may</b> discard primitives after the final vertex processing stage. As a result, if {@code rasterizerDiscardEnable} is enabled, the clipping input and output primitives counters <b>may</b> not be incremented.</p>
	 * 
	 * <p>When a pipeline statistics query finishes, the result for that query is marked as available. The application <b>can</b> copy the result to a buffer (via {@link #vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults}), or request it be put into host memory (via {@link #vkGetQueryPoolResults GetQueryPoolResults}).</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkQueryPipelineStatisticFlags}</p>
	 */
	public static final int
		VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT                    = 0x1,
		VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT                  = 0x2,
		VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT                  = 0x4,
		VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT                = 0x8,
		VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT                 = 0x10,
		VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT                       = 0x20,
		VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT                        = 0x40,
		VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT                = 0x80,
		VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT        = 0x100,
		VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT = 0x200,
		VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT                 = 0x400;

	/**
	 * VkQueryResultFlagBits - Bitmask specifying how and when query results are returned
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link #vkGetQueryPoolResults GetQueryPoolResults}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkQueryResultFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT}</li>
	 * <li>{@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT}</li>
	 * <li>{@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT}</li>
	 * <li>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT}</li>
	 * </ul>
	 */
	public static final int
		VK_QUERY_RESULT_64_BIT                = 0x1,
		VK_QUERY_RESULT_WAIT_BIT              = 0x2,
		VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 0x4,
		VK_QUERY_RESULT_PARTIAL_BIT           = 0x8;

	/**
	 * VkBufferCreateFlagBits - Bitmask specifying additional parameters of a buffer
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkBufferCreateInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkBufferCreateFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT}</li>
	 * <li>{@link #VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT}</li>
	 * <li>{@link #VK_BUFFER_CREATE_SPARSE_ALIASED_BIT BUFFER_CREATE_SPARSE_ALIASED_BIT}</li>
	 * </ul>
	 */
	public static final int
		VK_BUFFER_CREATE_SPARSE_BINDING_BIT   = 0x1,
		VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 0x2,
		VK_BUFFER_CREATE_SPARSE_ALIASED_BIT   = 0x4;

	/**
	 * VkBufferUsageFlagBits - Bitmask specifying allowed usage of a buffer
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkBufferCreateInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkBufferUsageFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_BUFFER_USAGE_TRANSFER_SRC_BIT BUFFER_USAGE_TRANSFER_SRC_BIT}</li>
	 * <li>{@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT}</li>
	 * <li>{@link #VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT}</li>
	 * <li>{@link #VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT}</li>
	 * <li>{@link #VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT BUFFER_USAGE_UNIFORM_BUFFER_BIT}</li>
	 * <li>{@link #VK_BUFFER_USAGE_STORAGE_BUFFER_BIT BUFFER_USAGE_STORAGE_BUFFER_BIT}</li>
	 * <li>{@link #VK_BUFFER_USAGE_INDEX_BUFFER_BIT BUFFER_USAGE_INDEX_BUFFER_BIT}</li>
	 * <li>{@link #VK_BUFFER_USAGE_VERTEX_BUFFER_BIT BUFFER_USAGE_VERTEX_BUFFER_BIT}</li>
	 * <li>{@link #VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT}</li>
	 * </ul>
	 */
	public static final int
		VK_BUFFER_USAGE_TRANSFER_SRC_BIT         = 0x1,
		VK_BUFFER_USAGE_TRANSFER_DST_BIT         = 0x2,
		VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = 0x4,
		VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = 0x8,
		VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT       = 0x10,
		VK_BUFFER_USAGE_STORAGE_BUFFER_BIT       = 0x20,
		VK_BUFFER_USAGE_INDEX_BUFFER_BIT         = 0x40,
		VK_BUFFER_USAGE_VERTEX_BUFFER_BIT        = 0x80,
		VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT      = 0x100;

	/**
	 * VkSharingMode - Buffer and image sharing modes
	 * 
	 * <h5>Description</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE} specifies that access to any range or image subresource of the object will be exclusive to a single queue family at a time.</li>
	 * <li>{@link #VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT} specifies that concurrent access to any range or image subresource of the object from multiple queue families is supported.</li>
	 * </ul>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>{@link #VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT} <b>may</b> result in lower performance access to the buffer or image than {@link #VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE}.</p>
	 * </div>
	 * 
	 * <p>Ranges of buffers and image subresources of image objects created using {@link #VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE} <b>must</b> only be accessed by queues in the same queue family at any given time. In order for a different queue family to be able to interpret the memory contents of a range or image subresource, the application <b>must</b> transfer exclusive ownership of the range or image subresource between the source and destination queue families with the following sequence of operations:</p>
	 * 
	 * <ul>
	 * <li>Release exclusive ownership from the source queue family to the destination queue family.</li>
	 * <li>Use semaphores to ensure proper execution control for the ownership transfer.</li>
	 * <li>Acquire exclusive ownership for the destination queue family from the source queue family.</li>
	 * </ul>
	 * 
	 * <p>To release exclusive ownership of a range of a buffer or image subresource of an image object, the application <b>must</b> execute a buffer or image memory barrier, respectively (see {@link VkBufferMemoryBarrier} and {@link VkImageMemoryBarrier}) on a queue from the source queue family. The {@code srcQueueFamilyIndex} parameter of the barrier <b>must</b> be set to the source queue family index, and the {@code dstQueueFamilyIndex} parameter to the destination queue family index.</p>
	 * 
	 * <p>To acquire exclusive ownership, the application <b>must</b> execute the same buffer or image memory barrier (i.e. an identically defined instance of the {@link VkBufferMemoryBarrier} or {@link VkImageMemoryBarrier} structure that was used for the exclusive ownership release) on a queue from the destination queue family.</p>
	 * 
	 * <p>Upon creation, resources using {@link #VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE} are not owned by any queue family. A buffer or image memory barrier is not required to acquire ownership when no queue family owns the resource - it is implicitly acquired upon first use within a queue. However, images still require a <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#resources-image-layouts">layout transition</a> from {@link #VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link #VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED} before being used on the first queue. This layout transition <b>can</b> either be accomplished by an image memory barrier or by use in a render pass instance.</p>
	 * 
	 * <p>Once a queue family has used a range or image subresource of an {@link #VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE} resource, its contents are undefined to other queue families unless ownership is transferred. The contents <b>may</b> also become undefined for other reasons, e.g. as a result of writes to an image subresource that aliases the same memory. A queue family <b>can</b> take ownership of a range or image subresource without an ownership transfer in the same way as for a resource that was just created, however doing so means any contents written by other queue families or via incompatible aliases are undefined.</p>
	 * 
	 * <p>Ranges of buffers and image subresources of image objects created using {@link #VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT} <b>must</b> only be accessed by queues from the queue families specified through the {@code queueFamilyIndexCount} and {@code pQueueFamilyIndices} members of the corresponding create info structures.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkBufferCreateInfo}, {@link VkImageCreateInfo}, {@link VkSwapchainCreateInfoKHR}</p>
	 */
	public static final int
		VK_SHARING_MODE_EXCLUSIVE  = 0,
		VK_SHARING_MODE_CONCURRENT = 1;

	/**
	 * VkImageLayout - Layout of image and image subresources
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The type(s) of device access supported by each layout are:</p>
	 * 
	 * <ul>
	 * <li>{@link #VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}: Supports no device access. This layout <b>must</b> only be used as the {@code initialLayout} member of {@link VkImageCreateInfo} or {@link VkAttachmentDescription}, or as the {@code oldLayout} in an image transition. When transitioning out of this layout, the contents of the memory are not guaranteed to be preserved.</li>
	 * <li>{@link #VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}: Supports no device access. This layout <b>must</b> only be used as the {@code initialLayout} member of {@link VkImageCreateInfo} or {@link VkAttachmentDescription}, or as the {@code oldLayout} in an image transition. When transitioning out of this layout, the contents of the memory are preserved. This layout is intended to be used as the initial layout for an image whose contents are written by the host, and hence the data <b>can</b> be written to memory immediately, without first executing a layout transition. Currently, {@link #VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED} is only useful with {@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} images because there is not a standard layout defined for {@link #VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL} images.</li>
	 * <li>{@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}: Supports all types of device access.</li>
	 * <li>{@link #VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}: <b>must</b> only be used as a color or resolve attachment in a {@code VkFramebuffer}. This layout is valid only for image subresources of images created with the {@link #VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} usage bit enabled.</li>
	 * <li>{@link #VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}: <b>must</b> only be used as a depth/stencil attachment in a {@code VkFramebuffer}. This layout is valid only for image subresources of images created with the {@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} usage bit enabled.</li>
	 * <li>{@link #VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}: <b>must</b> only be used as a read-only depth/stencil attachment in a {@code VkFramebuffer} and/or as a read-only image in a shader (which <b>can</b> be read as a sampled image, combined image/sampler and/or input attachment). This layout is valid only for image subresources of images created with the {@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} usage bit enabled. Only image subresources of images created with {@link #VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} <b>can</b> be used as sampled image or combined image/sampler in a shader. Similarly, only image subresources of images created with {@link #VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} <b>can</b> be used as input attachments.</li>
	 * <li>{@link #VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}: <b>must</b> only be used as a read-only image in a shader (which <b>can</b> be read as a sampled image, combined image/sampler and/or input attachment). This layout is valid only for image subresources of images created with the {@link #VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} or {@link #VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} usage bit enabled.</li>
	 * <li>{@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL}: <b>must</b> only be used as a source image of a transfer command (see the definition of <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-transfer">{@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</a>). This layout is valid only for image subresources of images created with the {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage bit enabled.</li>
	 * <li>{@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}: <b>must</b> only be used as a destination image of a transfer command. This layout is valid only for image subresources of images created with the {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage bit enabled.</li>
	 * <li>{@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}: <b>must</b> only be used for presenting a swapchain image for display. A swapchain&#8217;s image <b>must</b> be transitioned to this layout before calling {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR}, and <b>must</b> be transitioned away from this layout after calling {@link KHRSwapchain#vkAcquireNextImageKHR AcquireNextImageKHR}.</li>
	 * </ul>
	 * 
	 * <p>For each mechanism of accessing an image in the API, there is a parameter or structure member that controls the image layout used to access the image. For transfer commands, this is a parameter to the command (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#clears>> and <<copies>>). For use as a framebuffer attachment"> this is a member in the substructures of the {@link VkRenderPassCreateInfo} (see <<renderpass,Render Pass</a>). For use in a descriptor set, this is a member in the {@link VkDescriptorImageInfo} structure (see <<descriptorsets-updates>>). At the time that any command buffer command accessing an image executes on any queue, the layouts of the image subresources that are accessed <b>must</b> all match the layout specified via the API controlling those accesses.</p>
	 * 
	 * <p>The image layout of each image subresource <b>must</b> be well-defined at each point in the image subresource's lifetime. This means that when performing a layout transition on the image subresource, the old layout value <b>must</b> either equal the current layout of the image subresource (at the time the transition executes), or else be {@link #VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} (implying that the contents of the image subresource need not be preserved). The new layout used in a transition <b>must</b> not be {@link #VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link #VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAttachmentDescription}, {@link VkAttachmentReference}, {@link VkDescriptorImageInfo}, {@link VkImageCreateInfo}, {@link VkImageMemoryBarrier}, {@link #vkCmdBlitImage CmdBlitImage}, {@link #vkCmdClearColorImage CmdClearColorImage}, {@link #vkCmdClearDepthStencilImage CmdClearDepthStencilImage}, {@link #vkCmdCopyBufferToImage CmdCopyBufferToImage}, {@link #vkCmdCopyImage CmdCopyImage}, {@link #vkCmdCopyImageToBuffer CmdCopyImageToBuffer}, {@link #vkCmdResolveImage CmdResolveImage}</p>
	 */
	public static final int
		VK_IMAGE_LAYOUT_UNDEFINED                        = 0,
		VK_IMAGE_LAYOUT_GENERAL                          = 1,
		VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL         = 2,
		VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = 3,
		VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL  = 4,
		VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL         = 5,
		VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL             = 6,
		VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL             = 7,
		VK_IMAGE_LAYOUT_PREINITIALIZED                   = 8;

	/**
	 * VkImageViewType - Image view types
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The exact image view type is partially implicit, based on the image's type and sample count, as well as the view creation parameters as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#resources-image-views-compatibility">table below</a>. This table also shows which SPIR-V OpTypeImage Dim and Arrayed parameters correspond to each image view type.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkImageViewCreateInfo}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_IMAGE_VIEW_TYPE_1D IMAGE_VIEW_TYPE_1D}</li>
	 * <li>{@link #VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D}</li>
	 * <li>{@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}</li>
	 * <li>{@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}</li>
	 * <li>{@link #VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}</li>
	 * <li>{@link #VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}</li>
	 * <li>{@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
	 * </ul>
	 */
	public static final int
		VK_IMAGE_VIEW_TYPE_1D         = 0,
		VK_IMAGE_VIEW_TYPE_2D         = 1,
		VK_IMAGE_VIEW_TYPE_3D         = 2,
		VK_IMAGE_VIEW_TYPE_CUBE       = 3,
		VK_IMAGE_VIEW_TYPE_1D_ARRAY   = 4,
		VK_IMAGE_VIEW_TYPE_2D_ARRAY   = 5,
		VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 6;

	/**
	 * VkComponentSwizzle - Specify how a component is swizzled
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkComponentMapping}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkComponentMapping}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}</li>
	 * <li>{@link #VK_COMPONENT_SWIZZLE_ZERO COMPONENT_SWIZZLE_ZERO}</li>
	 * <li>{@link #VK_COMPONENT_SWIZZLE_ONE COMPONENT_SWIZZLE_ONE}</li>
	 * <li>{@link #VK_COMPONENT_SWIZZLE_R COMPONENT_SWIZZLE_R}</li>
	 * <li>{@link #VK_COMPONENT_SWIZZLE_G COMPONENT_SWIZZLE_G}</li>
	 * <li>{@link #VK_COMPONENT_SWIZZLE_B COMPONENT_SWIZZLE_B}</li>
	 * <li>{@link #VK_COMPONENT_SWIZZLE_A COMPONENT_SWIZZLE_A}</li>
	 * </ul>
	 */
	public static final int
		VK_COMPONENT_SWIZZLE_IDENTITY = 0,
		VK_COMPONENT_SWIZZLE_ZERO     = 1,
		VK_COMPONENT_SWIZZLE_ONE      = 2,
		VK_COMPONENT_SWIZZLE_R        = 3,
		VK_COMPONENT_SWIZZLE_G        = 4,
		VK_COMPONENT_SWIZZLE_B        = 5,
		VK_COMPONENT_SWIZZLE_A        = 6;

	/**
	 * VkPipelineCreateFlagBits - Bitmask controlling how a pipeline is generated
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkGraphicsPipelineCreateInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkPipelineCreateFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT}</li>
	 * <li>{@link #VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT}</li>
	 * <li>{@link #VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT}</li>
	 * </ul>
	 */
	public static final int
		VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = 0x1,
		VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT    = 0x2,
		VK_PIPELINE_CREATE_DERIVATIVE_BIT           = 0x4;

	/**
	 * VkShaderStageFlagBits - Bitmask specifying a pipeline stage
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkPipelineShaderStageCreateInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPipelineShaderStageCreateInfo}, {@code VkShaderStageFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}</li>
	 * <li>{@link #VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}</li>
	 * <li>{@link #VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}</li>
	 * <li>{@link #VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}</li>
	 * <li>{@link #VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}</li>
	 * <li>{@link #VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}</li>
	 * <li>{@link #VK_SHADER_STAGE_ALL_GRAPHICS SHADER_STAGE_ALL_GRAPHICS}</li>
	 * <li>{@link #VK_SHADER_STAGE_ALL SHADER_STAGE_ALL}</li>
	 * </ul>
	 */
	public static final int
		VK_SHADER_STAGE_VERTEX_BIT                  = 0x1,
		VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT    = 0x2,
		VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = 0x4,
		VK_SHADER_STAGE_GEOMETRY_BIT                = 0x8,
		VK_SHADER_STAGE_FRAGMENT_BIT                = 0x10,
		VK_SHADER_STAGE_COMPUTE_BIT                 = 0x20,
		VK_SHADER_STAGE_ALL_GRAPHICS                = 0x0000001F,
		VK_SHADER_STAGE_ALL                         = 0x7FFFFFFF;

	/**
	 * VkVertexInputRate - Specify rate at which vertex attributes are pulled from buffers
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkVertexInputBindingDescription}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkVertexInputBindingDescription}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_VERTEX_INPUT_RATE_VERTEX VERTEX_INPUT_RATE_VERTEX}</li>
	 * <li>{@link #VK_VERTEX_INPUT_RATE_INSTANCE VERTEX_INPUT_RATE_INSTANCE}</li>
	 * </ul>
	 */
	public static final int
		VK_VERTEX_INPUT_RATE_VERTEX   = 0,
		VK_VERTEX_INPUT_RATE_INSTANCE = 1;

	/**
	 * VkPrimitiveTopology - Supported primitive topologies
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPipelineInputAssemblyStateCreateInfo}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_PRIMITIVE_TOPOLOGY_POINT_LIST PRIMITIVE_TOPOLOGY_POINT_LIST}</li>
	 * <li>{@link #VK_PRIMITIVE_TOPOLOGY_LINE_LIST PRIMITIVE_TOPOLOGY_LINE_LIST}</li>
	 * <li>{@link #VK_PRIMITIVE_TOPOLOGY_LINE_STRIP PRIMITIVE_TOPOLOGY_LINE_STRIP}</li>
	 * <li>{@link #VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST PRIMITIVE_TOPOLOGY_TRIANGLE_LIST}</li>
	 * <li>{@link #VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP}</li>
	 * <li>{@link #VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN PRIMITIVE_TOPOLOGY_TRIANGLE_FAN}</li>
	 * <li>{@link #VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY}</li>
	 * <li>{@link #VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY}</li>
	 * <li>{@link #VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY}</li>
	 * <li>{@link #VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY}</li>
	 * <li>{@link #VK_PRIMITIVE_TOPOLOGY_PATCH_LIST PRIMITIVE_TOPOLOGY_PATCH_LIST}</li>
	 * </ul>
	 */
	public static final int
		VK_PRIMITIVE_TOPOLOGY_POINT_LIST                    = 0,
		VK_PRIMITIVE_TOPOLOGY_LINE_LIST                     = 1,
		VK_PRIMITIVE_TOPOLOGY_LINE_STRIP                    = 2,
		VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST                 = 3,
		VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP                = 4,
		VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN                  = 5,
		VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY      = 6,
		VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY     = 7,
		VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY  = 8,
		VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = 9,
		VK_PRIMITIVE_TOPOLOGY_PATCH_LIST                    = 10;

	/**
	 * VkPolygonMode - Control polygon rasterization mode
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The {@code polygonMode} selects which method of rasterization is used for polygons. If {@code polygonMode} is {@link #VK_POLYGON_MODE_POINT POLYGON_MODE_POINT}, then the vertices of polygons are treated, for rasterization purposes, as if they had been drawn as points. {@link #VK_POLYGON_MODE_LINE POLYGON_MODE_LINE} causes polygon edges to be drawn as line segments. {@link #VK_POLYGON_MODE_FILL POLYGON_MODE_FILL} causes polygons to render using the polygon rasterization rules in this section.</p>
	 * 
	 * <p>Note that these modes affect only the final rasterization of polygons: in particular, a polygon's vertices are shaded and the polygon is clipped and possibly culled before these modes are applied.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPipelineRasterizationStateCreateInfo}</p>
	 */
	public static final int
		VK_POLYGON_MODE_FILL  = 0,
		VK_POLYGON_MODE_LINE  = 1,
		VK_POLYGON_MODE_POINT = 2;

	/**
	 * VkCullModeFlagBits - Bitmask controlling triangle culling
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If the {@code cullMode} is set to {@link #VK_CULL_MODE_NONE CULL_MODE_NONE} no triangles are discarded, if it is set to {@link #VK_CULL_MODE_FRONT_BIT CULL_MODE_FRONT_BIT} front-facing triangles are discarded, if it is set to {@link #VK_CULL_MODE_BACK_BIT CULL_MODE_BACK_BIT} then back-facing triangles are discarded and if it is set to {@link #VK_CULL_MODE_FRONT_AND_BACK CULL_MODE_FRONT_AND_BACK} then all triangles are discarded. Following culling, fragments are produced for any triangles which have not been discarded.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkCullModeFlags}</p>
	 */
	public static final int
		VK_CULL_MODE_NONE           = 0,
		VK_CULL_MODE_FRONT_BIT      = 0x1,
		VK_CULL_MODE_BACK_BIT       = 0x2,
		VK_CULL_MODE_FRONT_AND_BACK = 0x00000003;

	/**
	 * VkFrontFace - Interpret polygon front-facing orientation
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If {@code frontFace} is set to {@link #VK_FRONT_FACE_COUNTER_CLOCKWISE FRONT_FACE_COUNTER_CLOCKWISE}, a triangle with positive area is considered front-facing. If it is set to {@link #VK_FRONT_FACE_CLOCKWISE FRONT_FACE_CLOCKWISE}, a triangle with negative area is considered front-facing. Any triangle which is not front-facing is back-facing, including zero-area triangles.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPipelineRasterizationStateCreateInfo}</p>
	 */
	public static final int
		VK_FRONT_FACE_COUNTER_CLOCKWISE = 0,
		VK_FRONT_FACE_CLOCKWISE         = 1;

	/**
	 * VkCompareOp - Stencil comparison function
	 * 
	 * <h5>Description</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_COMPARE_OP_NEVER COMPARE_OP_NEVER}: the test never passes.</li>
	 * <li>{@link #VK_COMPARE_OP_LESS COMPARE_OP_LESS}: the test passes when <code>R &lt; S</code>.</li>
	 * <li>{@link #VK_COMPARE_OP_EQUAL COMPARE_OP_EQUAL}: the test passes when <code>R = S</code>.</li>
	 * <li>{@link #VK_COMPARE_OP_LESS_OR_EQUAL COMPARE_OP_LESS_OR_EQUAL}: the test passes when <code>R &#x2264; S</code>.</li>
	 * <li>{@link #VK_COMPARE_OP_GREATER COMPARE_OP_GREATER}: the test passes when <code>R &gt; S</code>.</li>
	 * <li>{@link #VK_COMPARE_OP_NOT_EQUAL COMPARE_OP_NOT_EQUAL}: the test passes when <code>R &#x2260; S</code>.</li>
	 * <li>{@link #VK_COMPARE_OP_GREATER_OR_EQUAL COMPARE_OP_GREATER_OR_EQUAL}: the test passes when <code>R &#x2265; S</code>.</li>
	 * <li>{@link #VK_COMPARE_OP_ALWAYS COMPARE_OP_ALWAYS}: the test always passes.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPipelineDepthStencilStateCreateInfo}, {@link VkSamplerCreateInfo}, {@link VkStencilOpState}</p>
	 */
	public static final int
		VK_COMPARE_OP_NEVER            = 0,
		VK_COMPARE_OP_LESS             = 1,
		VK_COMPARE_OP_EQUAL            = 2,
		VK_COMPARE_OP_LESS_OR_EQUAL    = 3,
		VK_COMPARE_OP_GREATER          = 4,
		VK_COMPARE_OP_NOT_EQUAL        = 5,
		VK_COMPARE_OP_GREATER_OR_EQUAL = 6,
		VK_COMPARE_OP_ALWAYS           = 7;

	/**
	 * VkStencilOp - Stencil comparison function
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The possible values are:</p>
	 * 
	 * <ul>
	 * <li>{@link #VK_STENCIL_OP_KEEP STENCIL_OP_KEEP} keeps the current value.</li>
	 * <li>{@link #VK_STENCIL_OP_ZERO STENCIL_OP_ZERO} sets the value to 0.</li>
	 * <li>{@link #VK_STENCIL_OP_REPLACE STENCIL_OP_REPLACE} sets the value to {@code reference}.</li>
	 * <li>{@link #VK_STENCIL_OP_INCREMENT_AND_CLAMP STENCIL_OP_INCREMENT_AND_CLAMP} increments the current value and clamps to the maximum representable unsigned value.</li>
	 * <li>{@link #VK_STENCIL_OP_DECREMENT_AND_CLAMP STENCIL_OP_DECREMENT_AND_CLAMP} decrements the current value and clamps to 0.</li>
	 * <li>{@link #VK_STENCIL_OP_INVERT STENCIL_OP_INVERT} bitwise-inverts the current value.</li>
	 * <li>{@link #VK_STENCIL_OP_INCREMENT_AND_WRAP STENCIL_OP_INCREMENT_AND_WRAP} increments the current value and wraps to 0 when the maximum value would have been exceeded.</li>
	 * <li>{@link #VK_STENCIL_OP_DECREMENT_AND_WRAP STENCIL_OP_DECREMENT_AND_WRAP} decrements the current value and wraps to the maximum possible value when the value would go below 0.</li>
	 * </ul>
	 * 
	 * <p>For purposes of increment and decrement, the stencil bits are considered as an unsigned integer.</p>
	 * 
	 * <p>If the stencil test fails, the sample's coverage bit is cleared in the fragment. If there is no stencil framebuffer attachment, stencil modification <b>cannot</b> occur, and it is as if the stencil tests always pass.</p>
	 * 
	 * <p>If the stencil test passes, the {@code writeMask} member of the {@link VkStencilOpState} structures controls how the updated stencil value is written to the stencil framebuffer attachment.</p>
	 * 
	 * <p>The least significant <code>s</code> bits of {@code writeMask}, where <code>s</code> is the number of bits in the stencil framebuffer attachment, specify an integer mask. Where a <code>1</code> appears in this mask, the corresponding bit in the stencil value in the depth/stencil attachment is written; where a <code>0</code> appears, the bit is not written. The {@code writeMask} value uses either the front-facing or back-facing state based on the facing-ness of the fragment. Fragments generated by front-facing primitives use the front mask and fragments generated by back-facing primitives use the back mask.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkStencilOpState}</p>
	 */
	public static final int
		VK_STENCIL_OP_KEEP                = 0,
		VK_STENCIL_OP_ZERO                = 1,
		VK_STENCIL_OP_REPLACE             = 2,
		VK_STENCIL_OP_INCREMENT_AND_CLAMP = 3,
		VK_STENCIL_OP_DECREMENT_AND_CLAMP = 4,
		VK_STENCIL_OP_INVERT              = 5,
		VK_STENCIL_OP_INCREMENT_AND_WRAP  = 6,
		VK_STENCIL_OP_DECREMENT_AND_WRAP  = 7;

	/**
	 * VkLogicOp - Framebuffer logical operations
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The logical operations supported by Vulkan are summarized in the following table in which</p>
	 * 
	 * <ul>
	 * <li><code>&#x00ac;</code> is bitwise invert,</li>
	 * <li><code>&#x2227;</code> is bitwise and,</li>
	 * <li><code>&#x2228;</code> is bitwise or,</li>
	 * <li><code>&#x2295;</code> is bitwise exclusive or,</li>
	 * <li><code>s</code> is the fragment&#8217;s <code>R<sub>s0</sub>, G<sub>s0</sub>, B<sub>s0</sub></code> or <code>A<sub>s0</sub></code> component value for the fragment output corresponding to the color attachment being updated, and</li>
	 * <li><code>d</code> is the color attachment&#8217;s <code>R, G, B</code> or <code>A</code> component value:</li>
	 * </ul>
	 * 
	 * <h6>Logical Operations</h6>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Mode</th><th>Operation</th></tr></thead>
	 * <tbody>
	 * <tr><td>{@link #VK_LOGIC_OP_CLEAR LOGIC_OP_CLEAR}</td><td><code>0</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_AND LOGIC_OP_AND}</td><td><code>s &#x2227; d</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_AND_REVERSE LOGIC_OP_AND_REVERSE}</td><td><code>s &#x2227; &#x00ac; d</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_COPY LOGIC_OP_COPY}</td><td><code>s</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_AND_INVERTED LOGIC_OP_AND_INVERTED}</td><td><code>&#x00ac; s &#x2227; d</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_NO_OP LOGIC_OP_NO_OP}</td><td><code>d</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_XOR LOGIC_OP_XOR}</td><td><code>s &#x2295; d</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_OR LOGIC_OP_OR}</td><td><code>s &#x2228; d</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_NOR LOGIC_OP_NOR}</td><td><code>&#x00ac; (s &#x2228; d)</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_EQUIVALENT LOGIC_OP_EQUIVALENT}</td><td><code>&#x00ac; (s &#x2295; d)</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_INVERT LOGIC_OP_INVERT}</td><td><code>&#x00ac; d</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_OR_REVERSE LOGIC_OP_OR_REVERSE}</td><td><code>s &#x2228; &#x00ac; d</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_COPY_INVERTED LOGIC_OP_COPY_INVERTED}</td><td><code>&#x00ac; s</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_OR_INVERTED LOGIC_OP_OR_INVERTED}</td><td><code>&#x00ac; s &#x2228; d</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_NAND LOGIC_OP_NAND}</td><td><code>&#x00ac; (s &#x2227; d)</code></td></tr>
	 * <tr><td>{@link #VK_LOGIC_OP_SET LOGIC_OP_SET}</td><td>all 1s</td></tr>
	 * </tbody>
	 * </table>
	 * 
	 * <p>The result of the logical operation is then written to the color attachment as controlled by the component write mask, described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#framebuffer-blendoperations">Blend Operations</a>.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPipelineColorBlendStateCreateInfo}</p>
	 */
	public static final int
		VK_LOGIC_OP_CLEAR         = 0,
		VK_LOGIC_OP_AND           = 1,
		VK_LOGIC_OP_AND_REVERSE   = 2,
		VK_LOGIC_OP_COPY          = 3,
		VK_LOGIC_OP_AND_INVERTED  = 4,
		VK_LOGIC_OP_NO_OP         = 5,
		VK_LOGIC_OP_XOR           = 6,
		VK_LOGIC_OP_OR            = 7,
		VK_LOGIC_OP_NOR           = 8,
		VK_LOGIC_OP_EQUIVALENT    = 9,
		VK_LOGIC_OP_INVERT        = 10,
		VK_LOGIC_OP_OR_REVERSE    = 11,
		VK_LOGIC_OP_COPY_INVERTED = 12,
		VK_LOGIC_OP_OR_INVERTED   = 13,
		VK_LOGIC_OP_NAND          = 14,
		VK_LOGIC_OP_SET           = 15;

	/**
	 * VkBlendFactor - Framebuffer blending factors
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The semantics of each enum value is described in the table below:</p>
	 * 
	 * <h6>Blend Factors</h6>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>VkBlendFactor</th><th>RGB Blend Factors <code>(S<sub>r</sub>,S<sub>g</sub>,S<sub>b</sub>)</code> or <code>(D<sub>r</sub>,D<sub>g</sub>,D<sub>b</sub>)</code></th><th>Alpha Blend Factor (<code>S<sub>a</sub></code> or <code>D<sub>a</sub></code>)</th></tr></thead>
	 * <tbody>
	 * <tr><td>{@link #VK_BLEND_FACTOR_ZERO BLEND_FACTOR_ZERO}</td><td><code>(0,0,0)</code></td><td><code>0</code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_ONE BLEND_FACTOR_ONE}</td><td><code>(1,1,1)</code></td><td><code>1</code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_SRC_COLOR BLEND_FACTOR_SRC_COLOR}</td><td><code>(R<sub>s0</sub>,G<sub>s0</sub>,B<sub>s0</sub>)</code></td><td><code>A<sub>s0</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR BLEND_FACTOR_ONE_MINUS_SRC_COLOR}</td><td><code>(1-R<sub>s0</sub>,1-G<sub>s0</sub>,1-B<sub>s0</sub>)</code></td><td><code>1-A<sub>s0</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_DST_COLOR BLEND_FACTOR_DST_COLOR}</td><td><code>(R<sub>d</sub>,G<sub>d</sub>,B<sub>d</sub>)</code></td><td><code>A<sub>d</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR BLEND_FACTOR_ONE_MINUS_DST_COLOR}</td><td><code>(1-R<sub>d</sub>,1-G<sub>d</sub>,1-B<sub>d</sub>)</code></td><td><code>1-A<sub>d</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_SRC_ALPHA BLEND_FACTOR_SRC_ALPHA}</td><td><code>(A<sub>s0</sub>,A<sub>s0</sub>,A<sub>s0</sub>)</code></td><td><code>A<sub>s0</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA BLEND_FACTOR_ONE_MINUS_SRC_ALPHA}</td><td><code>(1-A<sub>s0</sub>,1-A<sub>s0</sub>,1-A<sub>s0</sub>)</code></td><td><code>1-A<sub>s0</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_DST_ALPHA BLEND_FACTOR_DST_ALPHA}</td><td><code>(A<sub>d</sub>,A<sub>d</sub>,A<sub>d</sub>)</code></td><td><code>A<sub>d</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA BLEND_FACTOR_ONE_MINUS_DST_ALPHA}</td><td><code>(1-A<sub>d</sub>,1-A<sub>d</sub>,1-A<sub>d</sub>)</code></td><td><code>1-A<sub>d</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_CONSTANT_COLOR BLEND_FACTOR_CONSTANT_COLOR}</td><td><code>(R<sub>c</sub>,G<sub>c</sub>,B<sub>c</sub>)</code></td><td><code>A<sub>c</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR}</td><td><code>(1-R<sub>c</sub>,1-G<sub>c</sub>,1-B<sub>c</sub>)</code></td><td><code>1-A<sub>c</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_CONSTANT_ALPHA BLEND_FACTOR_CONSTANT_ALPHA}</td><td><code>(A<sub>c</sub>,A<sub>c</sub>,A<sub>c</sub>)</code></td><td><code>A<sub>c</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA}</td><td><code>(1-A<sub>c</sub>,1-A<sub>c</sub>,1-A<sub>c</sub>)</code></td><td><code>1-A<sub>c</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_SRC_ALPHA_SATURATE BLEND_FACTOR_SRC_ALPHA_SATURATE}</td><td><code>(f,f,f)</code>; <code>f = min(A<sub>s0</sub>,1-A<sub>d</sub>)</code></td><td><code>1</code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR}</td><td><code>(R<sub>s1</sub>,G<sub>s1</sub>,B<sub>s1</sub>)</code></td><td><code>A<sub>s1</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}</td><td><code>(1-R<sub>s1</sub>,1-G<sub>s1</sub>,1-B<sub>s1</sub>)</code></td><td><code>1-A<sub>s1</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}</td><td><code>(A<sub>s1</sub>,A<sub>s1</sub>,A<sub>s1</sub>)</code></td><td><code>A<sub>s1</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</td><td><code>(1-A<sub>s1</sub>,1-A<sub>s1</sub>,1-A<sub>s1</sub>)</code></td><td><code>1-A<sub>s1</sub></code></td></tr>
	 * </tbody>
	 * </table>
	 * 
	 * <p>In this table, the following conventions are used:</p>
	 * 
	 * <ul>
	 * <li><code>R<sub>s0</sub>,G<sub>s0</sub>,B<sub>s0</sub></code> and <code>A<sub>s0</sub></code> represent the first source color R, G, B, and A components, respectively, for the fragment output location corresponding to the color attachment being blended.</li>
	 * <li><code>R<sub>s1</sub>,G<sub>s1</sub>,B<sub>s1</sub></code> and <code>A<sub>s1</sub></code> represent the second source color R, G, B, and A components, respectively, used in dual source blending modes, for the fragment output location corresponding to the color attachment being blended.</li>
	 * <li><code>R<sub>d</sub>,G<sub>d</sub>,B<sub>d</sub></code> and <code>A<sub>d</sub></code> represent the R, G, B, and A components of the destination color. That is, the color currently in the corresponding color attachment for this fragment/sample.</li>
	 * <li><code>R<sub>c</sub>,G<sub>c</sub>,B<sub>c</sub></code> and <code>A<sub>c</sub></code> represent the blend constant R, G, B, and A components, respectively.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPipelineColorBlendAttachmentState}</p>
	 */
	public static final int
		VK_BLEND_FACTOR_ZERO                     = 0,
		VK_BLEND_FACTOR_ONE                      = 1,
		VK_BLEND_FACTOR_SRC_COLOR                = 2,
		VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR      = 3,
		VK_BLEND_FACTOR_DST_COLOR                = 4,
		VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR      = 5,
		VK_BLEND_FACTOR_SRC_ALPHA                = 6,
		VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA      = 7,
		VK_BLEND_FACTOR_DST_ALPHA                = 8,
		VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA      = 9,
		VK_BLEND_FACTOR_CONSTANT_COLOR           = 10,
		VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = 11,
		VK_BLEND_FACTOR_CONSTANT_ALPHA           = 12,
		VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = 13,
		VK_BLEND_FACTOR_SRC_ALPHA_SATURATE       = 14,
		VK_BLEND_FACTOR_SRC1_COLOR               = 15,
		VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR     = 16,
		VK_BLEND_FACTOR_SRC1_ALPHA               = 17,
		VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA     = 18;

	/**
	 * VkBlendOp - Framebuffer blending operations
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The semantics of each enum value is described in the table below:</p>
	 * 
	 * <h6>Blend Operations</h6>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>VkBlendOp</th><th>RGB Components</th><th>Alpha Component</th></tr></thead>
	 * <tbody>
	 * <tr><td>{@link #VK_BLEND_OP_ADD BLEND_OP_ADD}</td><td><code>R = R<sub>s0</sub> &#x00d7; S<sub>r</sub> + R<sub>d</sub> &#x00d7; D<sub>r</sub></code> <code>G = G<sub>s0</sub> &#x00d7; S<sub>g</sub> + G<sub>d</sub> &#x00d7; D<sub>g</sub></code> <code>B = B<sub>s0</sub> &#x00d7; S<sub>b</sub> + B<sub>d</sub> &#x00d7; D<sub>b</sub></code></td><td><code>A = A<sub>s0</sub> &#x00d7; S<sub>a</sub> + A<sub>d</sub> &#x00d7; D<sub>a</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_OP_SUBTRACT BLEND_OP_SUBTRACT}</td><td><code>R = R<sub>s0</sub> &#x00d7; S<sub>r</sub> - R<sub>d</sub> &#x00d7; D<sub>r</sub></code> <code>G = G<sub>s0</sub> &#x00d7; S<sub>g</sub> - G<sub>d</sub> &#x00d7; D<sub>g</sub></code> <code>B = B<sub>s0</sub> &#x00d7; S<sub>b</sub> - B<sub>d</sub> &#x00d7; D<sub>b</sub></code></td><td><code>A = A<sub>s0</sub> &#x00d7; S<sub>a</sub> - A<sub>d</sub> &#x00d7; D<sub>a</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_OP_REVERSE_SUBTRACT BLEND_OP_REVERSE_SUBTRACT}</td><td><code>R = R<sub>d</sub> &#x00d7; D<sub>r</sub> - R<sub>s0</sub> &#x00d7; S<sub>r</sub></code> <code>G = G<sub>d</sub> &#x00d7; D<sub>g</sub> - G<sub>s0</sub> &#x00d7; S<sub>g</sub></code> <code>B = B<sub>d</sub> &#x00d7; D<sub>b</sub> - B<sub>s0</sub> &#x00d7; S<sub>b</sub></code></td><td><code>A = A<sub>d</sub> &#x00d7; D<sub>a</sub> - A<sub>s0</sub> &#x00d7; S<sub>a</sub></code></td></tr>
	 * <tr><td>{@link #VK_BLEND_OP_MIN BLEND_OP_MIN}</td><td><code>R = min(R<sub>s0</sub>,R<sub>d</sub>)</code> <code>G = min(G<sub>s0</sub>,G<sub>d</sub>)</code> <code>B = min(B<sub>s0</sub>,B<sub>d</sub>)</code></td><td><code>A = min(A<sub>s0</sub>,A<sub>d</sub>)</code></td></tr>
	 * <tr><td>{@link #VK_BLEND_OP_MAX BLEND_OP_MAX}</td><td><code>R = max(R<sub>s0</sub>,R<sub>d</sub>)</code> <code>G = max(G<sub>s0</sub>,G<sub>d</sub>)</code> <code>B = max(B<sub>s0</sub>,B<sub>d</sub>)</code></td><td><code>A = max(A<sub>s0</sub>,A<sub>d</sub>)</code></td></tr>
	 * </tbody>
	 * </table>
	 * 
	 * <p>In this table, the following conventions are used:</p>
	 * 
	 * <ul>
	 * <li><code>R<sub>s0</sub>, G<sub>s0</sub>, B<sub>s0</sub></code> and <code>A<sub>s0</sub></code> represent the first source color R, G, B, and A components, respectively.</li>
	 * <li><code>R<sub>d</sub>, G<sub>d</sub>, B<sub>d</sub></code> and <code>A<sub>d</sub></code> represent the R, G, B, and A components of the destination color. That is, the color currently in the corresponding color attachment for this fragment/sample.</li>
	 * <li><code>S<sub>r</sub>, S<sub>g</sub>, S<sub>b</sub></code> and <code>S<sub>a</sub></code> represent the source blend factor R, G, B, and A components, respectively.</li>
	 * <li><code>D<sub>r</sub>, D<sub>g</sub>, D<sub>b</sub></code> and <code>D<sub>a</sub></code> represent the destination blend factor R, G, B, and A components, respectively.</li>
	 * </ul>
	 * 
	 * <p>The blending operation produces a new set of values <code>R, G, B</code> and <code>A</code>, which are written to the framebuffer attachment. If blending is not enabled for this attachment, then <code>R, G, B</code> and <code>A</code> are assigned <code>R<sub>s0</sub>, G<sub>s0</sub>, B<sub>s0</sub></code> and <code>A<sub>s0</sub></code>, respectively.</p>
	 * 
	 * <p>If the color attachment is fixed-point, the components of the source and destination values and blend factors are each clamped to <code>[0,1]</code> or <code>[-1,1]</code> respectively for an unsigned normalized or signed normalized color attachment prior to evaluating the blend operations. If the color attachment is floating-point, no clamping occurs.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPipelineColorBlendAttachmentState}</p>
	 */
	public static final int
		VK_BLEND_OP_ADD              = 0,
		VK_BLEND_OP_SUBTRACT         = 1,
		VK_BLEND_OP_REVERSE_SUBTRACT = 2,
		VK_BLEND_OP_MIN              = 3,
		VK_BLEND_OP_MAX              = 4;

	/**
	 * VkColorComponentFlagBits - Bitmask controlling which components are written to the framebuffer
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If {@link #VK_COLOR_COMPONENT_R_BIT COLOR_COMPONENT_R_BIT} is set, then the <code>R</code> value is written to color attachment for the appropriate sample, otherwise the value in memory is unmodified. The {@link #VK_COLOR_COMPONENT_G_BIT COLOR_COMPONENT_G_BIT}, {@link #VK_COLOR_COMPONENT_B_BIT COLOR_COMPONENT_B_BIT}, and {@link #VK_COLOR_COMPONENT_A_BIT COLOR_COMPONENT_A_BIT} bits similarly control writing of the <code>G, B,</code> and <code>A</code> values. The {@code colorWriteMask} is applied regardless of whether blending is enabled.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkColorComponentFlags}</p>
	 */
	public static final int
		VK_COLOR_COMPONENT_R_BIT = 0x1,
		VK_COLOR_COMPONENT_G_BIT = 0x2,
		VK_COLOR_COMPONENT_B_BIT = 0x4,
		VK_COLOR_COMPONENT_A_BIT = 0x8;

	/**
	 * VkDynamicState - Indicate which dynamic state is taken from dynamic state commands
	 * 
	 * <h5>Description</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT} indicates that the {@code pViewports} state in {@link VkPipelineViewportStateCreateInfo} will be ignored and <b>must</b> be set dynamically with {@link #vkCmdSetViewport CmdSetViewport} before any draw commands. The number of viewports used by a pipeline is still specified by the {@code viewportCount} member of {@link VkPipelineViewportStateCreateInfo}.</li>
	 * <li>{@link #VK_DYNAMIC_STATE_SCISSOR DYNAMIC_STATE_SCISSOR} indicates that the {@code pScissors} state in {@link VkPipelineViewportStateCreateInfo} will be ignored and <b>must</b> be set dynamically with {@link #vkCmdSetScissor CmdSetScissor} before any draw commands. The number of scissor rectangles used by a pipeline is still specified by the {@code scissorCount} member of {@link VkPipelineViewportStateCreateInfo}.</li>
	 * <li>{@link #VK_DYNAMIC_STATE_LINE_WIDTH DYNAMIC_STATE_LINE_WIDTH} indicates that the {@code lineWidth} state in {@link VkPipelineRasterizationStateCreateInfo} will be ignored and <b>must</b> be set dynamically with {@link #vkCmdSetLineWidth CmdSetLineWidth} before any draw commands that generate line primitives for the rasterizer.</li>
	 * <li>{@link #VK_DYNAMIC_STATE_DEPTH_BIAS DYNAMIC_STATE_DEPTH_BIAS} indicates that the {@code depthBiasConstantFactor}, {@code depthBiasClamp} and {@code depthBiasSlopeFactor} states in {@link VkPipelineRasterizationStateCreateInfo} will be ignored and <b>must</b> be set dynamically with {@link #vkCmdSetDepthBias CmdSetDepthBias} before any draws are performed with {@code depthBiasEnable} in {@link VkPipelineRasterizationStateCreateInfo} set to {@link #VK_TRUE TRUE}.</li>
	 * <li>{@link #VK_DYNAMIC_STATE_BLEND_CONSTANTS DYNAMIC_STATE_BLEND_CONSTANTS} indicates that the {@code blendConstants} state in {@link VkPipelineColorBlendStateCreateInfo} will be ignored and <b>must</b> be set dynamically with {@link #vkCmdSetBlendConstants CmdSetBlendConstants} before any draws are performed with a pipeline state with {@link VkPipelineColorBlendAttachmentState} member {@code blendEnable} set to {@link #VK_TRUE TRUE} and any of the blend functions using a constant blend color.</li>
	 * <li>{@link #VK_DYNAMIC_STATE_DEPTH_BOUNDS DYNAMIC_STATE_DEPTH_BOUNDS} indicates that the {@code minDepthBounds} and {@code maxDepthBounds} states of {@link VkPipelineDepthStencilStateCreateInfo} will be ignored and <b>must</b> be set dynamically with {@link #vkCmdSetDepthBounds CmdSetDepthBounds} before any draws are performed with a pipeline state with {@link VkPipelineDepthStencilStateCreateInfo} member {@code depthBoundsTestEnable} set to {@link #VK_TRUE TRUE}.</li>
	 * <li>{@link #VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK DYNAMIC_STATE_STENCIL_COMPARE_MASK} indicates that the {@code compareMask} state in {@link VkPipelineDepthStencilStateCreateInfo} for both {@code front} and {@code back} will be ignored and <b>must</b> be set dynamically with {@link #vkCmdSetStencilCompareMask CmdSetStencilCompareMask} before any draws are performed with a pipeline state with {@link VkPipelineDepthStencilStateCreateInfo} member {@code stencilTestEnable} set to {@link #VK_TRUE TRUE}</li>
	 * <li>{@link #VK_DYNAMIC_STATE_STENCIL_WRITE_MASK DYNAMIC_STATE_STENCIL_WRITE_MASK} indicates that the {@code writeMask} state in {@link VkPipelineDepthStencilStateCreateInfo} for both {@code front} and {@code back} will be ignored and <b>must</b> be set dynamically with {@link #vkCmdSetStencilWriteMask CmdSetStencilWriteMask} before any draws are performed with a pipeline state with {@link VkPipelineDepthStencilStateCreateInfo} member {@code stencilTestEnable} set to {@link #VK_TRUE TRUE}</li>
	 * <li>{@link #VK_DYNAMIC_STATE_STENCIL_REFERENCE DYNAMIC_STATE_STENCIL_REFERENCE} indicates that the {@code reference} state in {@link VkPipelineDepthStencilStateCreateInfo} for both {@code front} and {@code back} will be ignored and <b>must</b> be set dynamically with {@link #vkCmdSetStencilReference CmdSetStencilReference} before any draws are performed with a pipeline state with {@link VkPipelineDepthStencilStateCreateInfo} member {@code stencilTestEnable} set to {@link #VK_TRUE TRUE}</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPipelineDynamicStateCreateInfo}</p>
	 */
	public static final int
		VK_DYNAMIC_STATE_VIEWPORT             = 0,
		VK_DYNAMIC_STATE_SCISSOR              = 1,
		VK_DYNAMIC_STATE_LINE_WIDTH           = 2,
		VK_DYNAMIC_STATE_DEPTH_BIAS           = 3,
		VK_DYNAMIC_STATE_BLEND_CONSTANTS      = 4,
		VK_DYNAMIC_STATE_DEPTH_BOUNDS         = 5,
		VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = 6,
		VK_DYNAMIC_STATE_STENCIL_WRITE_MASK   = 7,
		VK_DYNAMIC_STATE_STENCIL_REFERENCE    = 8;

	/**
	 * VkFilter - Specify filters used for texture lookups
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkSamplerCreateInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkSamplerCreateInfo}, {@link #vkCmdBlitImage CmdBlitImage}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_FILTER_NEAREST FILTER_NEAREST}</li>
	 * <li>{@link #VK_FILTER_LINEAR FILTER_LINEAR}</li>
	 * </ul>
	 */
	public static final int
		VK_FILTER_NEAREST = 0,
		VK_FILTER_LINEAR  = 1;

	/**
	 * VkSamplerMipmapMode - Specify mipmap mode used for texture lookups
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkSamplerCreateInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkSamplerCreateInfo}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_SAMPLER_MIPMAP_MODE_NEAREST SAMPLER_MIPMAP_MODE_NEAREST}</li>
	 * <li>{@link #VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR}</li>
	 * </ul>
	 */
	public static final int
		VK_SAMPLER_MIPMAP_MODE_NEAREST = 0,
		VK_SAMPLER_MIPMAP_MODE_LINEAR  = 1;

	/**
	 * VkSamplerAddressMode - Specify behavior of sampling with texture coordinates outside an image
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkSamplerCreateInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkSamplerCreateInfo}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_SAMPLER_ADDRESS_MODE_REPEAT SAMPLER_ADDRESS_MODE_REPEAT}</li>
	 * <li>{@link #VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT}</li>
	 * <li>{@link #VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}</li>
	 * <li>{@link #VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER}</li>
	 * </ul>
	 */
	public static final int
		VK_SAMPLER_ADDRESS_MODE_REPEAT          = 0,
		VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1,
		VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE   = 2,
		VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3;

	/**
	 * VkBorderColor - Specify border color used for texture lookups
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkSamplerCreateInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkSamplerCreateInfo}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK BORDER_COLOR_FLOAT_TRANSPARENT_BLACK}</li>
	 * <li>{@link #VK_BORDER_COLOR_INT_TRANSPARENT_BLACK BORDER_COLOR_INT_TRANSPARENT_BLACK}</li>
	 * <li>{@link #VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK BORDER_COLOR_FLOAT_OPAQUE_BLACK}</li>
	 * <li>{@link #VK_BORDER_COLOR_INT_OPAQUE_BLACK BORDER_COLOR_INT_OPAQUE_BLACK}</li>
	 * <li>{@link #VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE BORDER_COLOR_FLOAT_OPAQUE_WHITE}</li>
	 * <li>{@link #VK_BORDER_COLOR_INT_OPAQUE_WHITE BORDER_COLOR_INT_OPAQUE_WHITE}</li>
	 * </ul>
	 */
	public static final int
		VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = 0,
		VK_BORDER_COLOR_INT_TRANSPARENT_BLACK   = 1,
		VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK      = 2,
		VK_BORDER_COLOR_INT_OPAQUE_BLACK        = 3,
		VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE      = 4,
		VK_BORDER_COLOR_INT_OPAQUE_WHITE        = 5;

	/**
	 * VkDescriptorType - Specifies the type of a descriptor in a descriptor set
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If {@code descriptorType} is {@link #VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}, {@link #VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}, {@link #VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, or {@link #VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}, the elements of the {@link VkWriteDescriptorSet}{@code ::pBufferInfo} array of {@link VkDescriptorBufferInfo} structures will be used to update the descriptors, and other arrays will be ignored.</p>
	 * 
	 * <p>If {@code descriptorType} is {@link #VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} or {@link #VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}, the {@link VkWriteDescriptorSet}{@code ::pTexelBufferView} array will be used to update the descriptors, and other arrays will be ignored.</p>
	 * 
	 * <p>If {@code descriptorType} is {@link #VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, {@link #VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link #VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link #VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, or {@link #VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, the elements of the {@link VkWriteDescriptorSet}{@code ::pImageInfo} array of {@link VkDescriptorImageInfo} structures will be used to update the descriptors, and other arrays will be ignored.</p>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkDescriptorPoolSize}, {@link VkDescriptorSetLayoutBinding}, {@link VkWriteDescriptorSet}</p>
	 */
	public static final int
		VK_DESCRIPTOR_TYPE_SAMPLER                = 0,
		VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER = 1,
		VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE          = 2,
		VK_DESCRIPTOR_TYPE_STORAGE_IMAGE          = 3,
		VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER   = 4,
		VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER   = 5,
		VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER         = 6,
		VK_DESCRIPTOR_TYPE_STORAGE_BUFFER         = 7,
		VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC = 8,
		VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC = 9,
		VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT       = 10;

	/**
	 * VkDescriptorPoolCreateFlagBits - Bitmask specifying certain supported operations on a descriptor pool
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkDescriptorPoolCreateInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkDescriptorPoolCreateFlags}</p>
	 */
	public static final int VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = 0x1;

	/**
	 * VkAttachmentDescriptionFlagBits - Bitmask specifying additional properties of an attachment
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkAttachmentDescription}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkAttachmentDescriptionFlags}</p>
	 */
	public static final int VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = 0x1;

	/**
	 * VkAttachmentLoadOp - Specify how contents of an attachment are treated at the beginning of a subpass
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkAttachmentDescription}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAttachmentDescription}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_ATTACHMENT_LOAD_OP_LOAD ATTACHMENT_LOAD_OP_LOAD}</li>
	 * <li>{@link #VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}</li>
	 * <li>{@link #VK_ATTACHMENT_LOAD_OP_DONT_CARE ATTACHMENT_LOAD_OP_DONT_CARE}</li>
	 * </ul>
	 */
	public static final int
		VK_ATTACHMENT_LOAD_OP_LOAD      = 0,
		VK_ATTACHMENT_LOAD_OP_CLEAR     = 1,
		VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2;

	/**
	 * VkAttachmentStoreOp - Specify how contents of an attachment are treated at the end of a subpass
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkAttachmentDescription}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAttachmentDescription}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_ATTACHMENT_STORE_OP_STORE ATTACHMENT_STORE_OP_STORE}</li>
	 * <li>{@link #VK_ATTACHMENT_STORE_OP_DONT_CARE ATTACHMENT_STORE_OP_DONT_CARE}</li>
	 * </ul>
	 */
	public static final int
		VK_ATTACHMENT_STORE_OP_STORE     = 0,
		VK_ATTACHMENT_STORE_OP_DONT_CARE = 1;

	/**
	 * VkPipelineBindPoint - Specify the bind point of a pipeline object to a command buffer
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link #vkCmdBindPipeline CmdBindPipeline}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkSubpassDescription}, {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}, {@link #vkCmdBindPipeline CmdBindPipeline}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
	 * <li>{@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}</li>
	 * </ul>
	 */
	public static final int
		VK_PIPELINE_BIND_POINT_GRAPHICS = 0,
		VK_PIPELINE_BIND_POINT_COMPUTE  = 1;

	/**
	 * VkAccessFlagBits - Bitmask specifying classes of memory access the will participate in a memory barrier dependency
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkMemoryBarrier}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkAccessFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_ACCESS_INDIRECT_COMMAND_READ_BIT ACCESS_INDIRECT_COMMAND_READ_BIT}</li>
	 * <li>{@link #VK_ACCESS_INDEX_READ_BIT ACCESS_INDEX_READ_BIT}</li>
	 * <li>{@link #VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT ACCESS_VERTEX_ATTRIBUTE_READ_BIT}</li>
	 * <li>{@link #VK_ACCESS_UNIFORM_READ_BIT ACCESS_UNIFORM_READ_BIT}</li>
	 * <li>{@link #VK_ACCESS_INPUT_ATTACHMENT_READ_BIT ACCESS_INPUT_ATTACHMENT_READ_BIT}</li>
	 * <li>{@link #VK_ACCESS_SHADER_READ_BIT ACCESS_SHADER_READ_BIT}</li>
	 * <li>{@link #VK_ACCESS_SHADER_WRITE_BIT ACCESS_SHADER_WRITE_BIT}</li>
	 * <li>{@link #VK_ACCESS_COLOR_ATTACHMENT_READ_BIT ACCESS_COLOR_ATTACHMENT_READ_BIT}</li>
	 * <li>{@link #VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT ACCESS_COLOR_ATTACHMENT_WRITE_BIT}</li>
	 * <li>{@link #VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT}</li>
	 * <li>{@link #VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT}</li>
	 * <li>{@link #VK_ACCESS_TRANSFER_READ_BIT ACCESS_TRANSFER_READ_BIT}</li>
	 * <li>{@link #VK_ACCESS_TRANSFER_WRITE_BIT ACCESS_TRANSFER_WRITE_BIT}</li>
	 * <li>{@link #VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT}</li>
	 * <li>{@link #VK_ACCESS_HOST_WRITE_BIT ACCESS_HOST_WRITE_BIT}</li>
	 * <li>{@link #VK_ACCESS_MEMORY_READ_BIT ACCESS_MEMORY_READ_BIT}</li>
	 * <li>{@link #VK_ACCESS_MEMORY_WRITE_BIT ACCESS_MEMORY_WRITE_BIT}</li>
	 * </ul>
	 */
	public static final int
		VK_ACCESS_INDIRECT_COMMAND_READ_BIT          = 0x1,
		VK_ACCESS_INDEX_READ_BIT                     = 0x2,
		VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT          = 0x4,
		VK_ACCESS_UNIFORM_READ_BIT                   = 0x8,
		VK_ACCESS_INPUT_ATTACHMENT_READ_BIT          = 0x10,
		VK_ACCESS_SHADER_READ_BIT                    = 0x20,
		VK_ACCESS_SHADER_WRITE_BIT                   = 0x40,
		VK_ACCESS_COLOR_ATTACHMENT_READ_BIT          = 0x80,
		VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT         = 0x100,
		VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT  = 0x200,
		VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 0x400,
		VK_ACCESS_TRANSFER_READ_BIT                  = 0x800,
		VK_ACCESS_TRANSFER_WRITE_BIT                 = 0x1000,
		VK_ACCESS_HOST_READ_BIT                      = 0x2000,
		VK_ACCESS_HOST_WRITE_BIT                     = 0x4000,
		VK_ACCESS_MEMORY_READ_BIT                    = 0x8000,
		VK_ACCESS_MEMORY_WRITE_BIT                   = 0x10000;

	/**
	 * VkDependencyFlagBits - Bitmask specifying dependencies between subpasses
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkSubpassDependency}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkDependencyFlags}</p>
	 */
	public static final int VK_DEPENDENCY_BY_REGION_BIT = 0x1;

	/**
	 * VkCommandPoolCreateFlagBits - Bitmask specifying usage behavior for a command pool
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkCommandPoolCreateInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkCommandPoolCreateFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_COMMAND_POOL_CREATE_TRANSIENT_BIT COMMAND_POOL_CREATE_TRANSIENT_BIT}</li>
	 * <li>{@link #VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT}</li>
	 * </ul>
	 */
	public static final int
		VK_COMMAND_POOL_CREATE_TRANSIENT_BIT            = 0x1,
		VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = 0x2;

	/**
	 * VkCommandPoolResetFlagBits - Bitmask controlling behavior of a command pool reset
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link #vkResetCommandPool ResetCommandPool}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkCommandPoolResetFlags}</p>
	 */
	public static final int VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 0x1;

	/**
	 * VkCommandBufferLevel - Structure specifying a command buffer level
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkCommandBufferAllocateInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkCommandBufferAllocateInfo}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_COMMAND_BUFFER_LEVEL_PRIMARY COMMAND_BUFFER_LEVEL_PRIMARY}</li>
	 * <li>{@link #VK_COMMAND_BUFFER_LEVEL_SECONDARY COMMAND_BUFFER_LEVEL_SECONDARY}</li>
	 * </ul>
	 */
	public static final int
		VK_COMMAND_BUFFER_LEVEL_PRIMARY   = 0,
		VK_COMMAND_BUFFER_LEVEL_SECONDARY = 1;

	/**
	 * VkCommandBufferUsageFlagBits - Bitmask specifying usage behavior for command buffer
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkCommandBufferBeginInfo}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkCommandBufferUsageFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT}</li>
	 * <li>{@link #VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}</li>
	 * <li>{@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}</li>
	 * </ul>
	 */
	public static final int
		VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT      = 0x1,
		VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = 0x2,
		VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT     = 0x4;

	/**
	 * VkQueryControlFlagBits - Bitmask specifying constraints on a query
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link #vkCmdBeginQuery CmdBeginQuery}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkQueryControlFlags}</p>
	 */
	public static final int VK_QUERY_CONTROL_PRECISE_BIT = 0x1;

	/**
	 * VkCommandBufferResetFlagBits - Bitmask controlling behavior of a command buffer reset
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link #vkResetCommandBuffer ResetCommandBuffer}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkCommandBufferResetFlags}</p>
	 */
	public static final int VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 0x1;

	/**
	 * VkStencilFaceFlagBits - Bitmask specifying sets of stencil state for which to update the compare mask
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link #vkCmdSetStencilCompareMask CmdSetStencilCompareMask}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkStencilFaceFlags}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_STENCIL_FACE_FRONT_BIT STENCIL_FACE_FRONT_BIT}</li>
	 * <li>{@link #VK_STENCIL_FACE_BACK_BIT STENCIL_FACE_BACK_BIT}</li>
	 * <li>{@link #VK_STENCIL_FRONT_AND_BACK STENCIL_FRONT_AND_BACK}</li>
	 * </ul>
	 */
	public static final int
		VK_STENCIL_FACE_FRONT_BIT = 0x1,
		VK_STENCIL_FACE_BACK_BIT  = 0x2,
		VK_STENCIL_FRONT_AND_BACK = 0x00000003;

	/**
	 * VkIndexType - Type of index buffer indices
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link #vkCmdBindIndexBuffer CmdBindIndexBuffer}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link #vkCmdBindIndexBuffer CmdBindIndexBuffer}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_INDEX_TYPE_UINT16 INDEX_TYPE_UINT16}</li>
	 * <li>{@link #VK_INDEX_TYPE_UINT32 INDEX_TYPE_UINT32}</li>
	 * </ul>
	 */
	public static final int
		VK_INDEX_TYPE_UINT16 = 0,
		VK_INDEX_TYPE_UINT32 = 1;

	/**
	 * VkSubpassContents - Specify how commands in the first subpass of a render pass are provided
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link #vkCmdBeginRenderPass CmdBeginRenderPass}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link #vkCmdBeginRenderPass CmdBeginRenderPass}, {@link #vkCmdNextSubpass CmdNextSubpass}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_SUBPASS_CONTENTS_INLINE SUBPASS_CONTENTS_INLINE}</li>
	 * <li>{@link #VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS}</li>
	 * </ul>
	 */
	public static final int
		VK_SUBPASS_CONTENTS_INLINE                    = 0,
		VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1;

	/**
	 * The API version number for Vulkan 1.0.
	 * 
	 * <p>The patch version number in this macro will always be zero. The supported patch version for a physical device <b>can</b> be queried with
	 * {@link #vkGetPhysicalDeviceProperties GetPhysicalDeviceProperties}.</p>
	 */
	public static final int VK_API_VERSION_1_0 = VK_MAKE_VERSION(1, 0, 0);

	/**
	 * The reserved handle {@code VK_NULL_HANDLE} <b>can</b> be passed in place of valid object handles when explicitly called out in the specification. Any
	 * command that creates an object successfully <b>must</b> not return {@code VK_NULL_HANDLE}. It is valid to pass {@code VK_NULL_HANDLE} to any
	 * {@code vkDestroy*} or {@code vkFree*} command, which will silently ignore these values.
	 */
	public static final long VK_NULL_HANDLE = 0x0L;

	protected VK10() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilities caps) {
		return checkFunctions(
			caps.vkCreateInstance, caps.vkDestroyInstance, caps.vkEnumeratePhysicalDevices, caps.vkGetPhysicalDeviceFeatures, 
			caps.vkGetPhysicalDeviceFormatProperties, caps.vkGetPhysicalDeviceImageFormatProperties, caps.vkGetPhysicalDeviceProperties, 
			caps.vkGetPhysicalDeviceQueueFamilyProperties, caps.vkGetPhysicalDeviceMemoryProperties, caps.vkGetInstanceProcAddr, caps.vkGetDeviceProcAddr, 
			caps.vkCreateDevice, caps.vkDestroyDevice, caps.vkEnumerateInstanceExtensionProperties, caps.vkEnumerateDeviceExtensionProperties, 
			caps.vkEnumerateInstanceLayerProperties, caps.vkEnumerateDeviceLayerProperties, caps.vkGetDeviceQueue, caps.vkQueueSubmit, caps.vkQueueWaitIdle, 
			caps.vkDeviceWaitIdle, caps.vkAllocateMemory, caps.vkFreeMemory, caps.vkMapMemory, caps.vkUnmapMemory, caps.vkFlushMappedMemoryRanges, 
			caps.vkInvalidateMappedMemoryRanges, caps.vkGetDeviceMemoryCommitment, caps.vkBindBufferMemory, caps.vkBindImageMemory, 
			caps.vkGetBufferMemoryRequirements, caps.vkGetImageMemoryRequirements, caps.vkGetImageSparseMemoryRequirements, 
			caps.vkGetPhysicalDeviceSparseImageFormatProperties, caps.vkQueueBindSparse, caps.vkCreateFence, caps.vkDestroyFence, caps.vkResetFences, 
			caps.vkGetFenceStatus, caps.vkWaitForFences, caps.vkCreateSemaphore, caps.vkDestroySemaphore, caps.vkCreateEvent, caps.vkDestroyEvent, 
			caps.vkGetEventStatus, caps.vkSetEvent, caps.vkResetEvent, caps.vkCreateQueryPool, caps.vkDestroyQueryPool, caps.vkGetQueryPoolResults, 
			caps.vkCreateBuffer, caps.vkDestroyBuffer, caps.vkCreateBufferView, caps.vkDestroyBufferView, caps.vkCreateImage, caps.vkDestroyImage, 
			caps.vkGetImageSubresourceLayout, caps.vkCreateImageView, caps.vkDestroyImageView, caps.vkCreateShaderModule, caps.vkDestroyShaderModule, 
			caps.vkCreatePipelineCache, caps.vkDestroyPipelineCache, caps.vkGetPipelineCacheData, caps.vkMergePipelineCaches, caps.vkCreateGraphicsPipelines, 
			caps.vkCreateComputePipelines, caps.vkDestroyPipeline, caps.vkCreatePipelineLayout, caps.vkDestroyPipelineLayout, caps.vkCreateSampler, 
			caps.vkDestroySampler, caps.vkCreateDescriptorSetLayout, caps.vkDestroyDescriptorSetLayout, caps.vkCreateDescriptorPool, 
			caps.vkDestroyDescriptorPool, caps.vkResetDescriptorPool, caps.vkAllocateDescriptorSets, caps.vkFreeDescriptorSets, caps.vkUpdateDescriptorSets, 
			caps.vkCreateFramebuffer, caps.vkDestroyFramebuffer, caps.vkCreateRenderPass, caps.vkDestroyRenderPass, caps.vkGetRenderAreaGranularity, 
			caps.vkCreateCommandPool, caps.vkDestroyCommandPool, caps.vkResetCommandPool, caps.vkAllocateCommandBuffers, caps.vkFreeCommandBuffers, 
			caps.vkBeginCommandBuffer, caps.vkEndCommandBuffer, caps.vkResetCommandBuffer, caps.vkCmdBindPipeline, caps.vkCmdSetViewport, caps.vkCmdSetScissor, 
			caps.vkCmdSetLineWidth, caps.vkCmdSetDepthBias, caps.vkCmdSetBlendConstants, caps.vkCmdSetDepthBounds, caps.vkCmdSetStencilCompareMask, 
			caps.vkCmdSetStencilWriteMask, caps.vkCmdSetStencilReference, caps.vkCmdBindDescriptorSets, caps.vkCmdBindIndexBuffer, caps.vkCmdBindVertexBuffers, 
			caps.vkCmdDraw, caps.vkCmdDrawIndexed, caps.vkCmdDrawIndirect, caps.vkCmdDrawIndexedIndirect, caps.vkCmdDispatch, caps.vkCmdDispatchIndirect, 
			caps.vkCmdCopyBuffer, caps.vkCmdCopyImage, caps.vkCmdBlitImage, caps.vkCmdCopyBufferToImage, caps.vkCmdCopyImageToBuffer, caps.vkCmdUpdateBuffer, 
			caps.vkCmdFillBuffer, caps.vkCmdClearColorImage, caps.vkCmdClearDepthStencilImage, caps.vkCmdClearAttachments, caps.vkCmdResolveImage, 
			caps.vkCmdSetEvent, caps.vkCmdResetEvent, caps.vkCmdWaitEvents, caps.vkCmdPipelineBarrier, caps.vkCmdBeginQuery, caps.vkCmdEndQuery, 
			caps.vkCmdResetQueryPool, caps.vkCmdWriteTimestamp, caps.vkCmdCopyQueryPoolResults, caps.vkCmdPushConstants, caps.vkCmdBeginRenderPass, 
			caps.vkCmdNextSubpass, caps.vkCmdEndRenderPass, caps.vkCmdExecuteCommands
		);
	}

	// --- [ vkCreateInstance ] ---

	/** Unsafe version of: {@link #vkCreateInstance CreateInstance} */
	public static int nvkCreateInstance(long pCreateInfo, long pAllocator, long pInstance) {
		long __functionAddress = VK.getGlobalCommands().vkCreateInstance;
		if ( CHECKS ) {
			VkInstanceCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPI(__functionAddress, pCreateInfo, pAllocator, pInstance);
	}

	/**
	 * Create a new Vulkan instance.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create an instance object, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateInstance(
    const VkInstanceCreateInfo*                 pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkInstance*                                 pInstance);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkCreateInstance CreateInstance} creates the instance, then enables and initializes global layers and extensions requested by the application. If an extension is provided by a layer, both the layer and extension <b>must</b> be specified at {@link #vkCreateInstance CreateInstance} time. If a specified layer cannot be found, no {@code VkInstance} will be created and the function will return {@link #VK_ERROR_LAYER_NOT_PRESENT ERROR_LAYER_NOT_PRESENT}. Likewise, if a specified extension cannot be found the call will return {@link #VK_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkInstanceCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pInstance} <b>must</b> be a pointer to a {@code VkInstance} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
	 * <li>{@link #VK_ERROR_LAYER_NOT_PRESENT ERROR_LAYER_NOT_PRESENT}</li>
	 * <li>{@link #VK_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}</li>
	 * <li>{@link #VK_ERROR_INCOMPATIBLE_DRIVER ERROR_INCOMPATIBLE_DRIVER}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkInstanceCreateInfo}</p>
	 *
	 * @param pCreateInfo points to an instance of {@link VkInstanceCreateInfo} controlling creation of the instance.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pInstance   points a {@code VkInstance} handle in which the resulting instance is returned.
	 */
	public static int vkCreateInstance(VkInstanceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, PointerBuffer pInstance) {
		if ( CHECKS )
			checkBuffer(pInstance, 1);
		return nvkCreateInstance(pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pInstance));
	}

	// --- [ vkDestroyInstance ] ---

	/** Unsafe version of: {@link #vkDestroyInstance DestroyInstance} */
	public static void nvkDestroyInstance(VkInstance instance, long pAllocator) {
		long __functionAddress = instance.getCapabilities().vkDestroyInstance;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPPV(__functionAddress, instance.address(), pAllocator);
	}

	/**
	 * Destroy an instance of Vulkan.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy an instance, call:</p>
	 * 
	 * <pre><code>void vkDestroyInstance(
    VkInstance                                  instance,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All child objects created using {@code instance} <b>must</b> have been destroyed prior to destroying {@code instance}</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code instance} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code instance} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>If {@code instance} is not {@code NULL}, {@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code instance} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param instance   the handle of the instance to destroy.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyInstance(VkInstance instance, VkAllocationCallbacks pAllocator) {
		nvkDestroyInstance(instance, memAddressSafe(pAllocator));
	}

	// --- [ vkEnumeratePhysicalDevices ] ---

	/**
	 * Unsafe version of: {@link #vkEnumeratePhysicalDevices EnumeratePhysicalDevices}
	 *
	 * @param pPhysicalDeviceCount a pointer to an integer related to the number of physical devices available or queried, as described below.
	 */
	public static int nvkEnumeratePhysicalDevices(VkInstance instance, long pPhysicalDeviceCount, long pPhysicalDevices) {
		long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDevices;
		return callPPPI(__functionAddress, instance.address(), pPhysicalDeviceCount, pPhysicalDevices);
	}

	/**
	 * Enumerates the physical devices accessible to a Vulkan instance.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To retrieve a list of physical device objects representing the physical devices installed in the system, call:</p>
	 * 
	 * <pre><code>VkResult vkEnumeratePhysicalDevices(
    VkInstance                                  instance,
    uint32_t*                                   pPhysicalDeviceCount,
    VkPhysicalDevice*                           pPhysicalDevices);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If {@code pPhysicalDevices} is {@code NULL}, then the number of physical devices available is returned in {@code pPhysicalDeviceCount}. Otherwise, {@code pPhysicalDeviceCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPhysicalDevices} array, and on return the variable is overwritten with the number of structures actually written to {@code pPhysicalDevices}. If {@code pPhysicalDeviceCount} is less than the number of physical devices available, at most {@code pPhysicalDeviceCount} structures will be written. If {@code pPhysicalDeviceCount} is smaller than the number of physical devices available, {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available physical devices were returned.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pPhysicalDeviceCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPhysicalDeviceCount} is not 0, and {@code pPhysicalDevices} is not {@code NULL}, {@code pPhysicalDevices} <b>must</b> be a pointer to an array of {@code pPhysicalDeviceCount} {@code VkPhysicalDevice} handles</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_INCOMPLETE INCOMPLETE}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param instance             a handle to a Vulkan instance previously created with {@link #vkCreateInstance CreateInstance}.
	 * @param pPhysicalDeviceCount a pointer to an integer related to the number of physical devices available or queried, as described below.
	 * @param pPhysicalDevices     either {@code NULL} or a pointer to an array of {@code VkPhysicalDevice} handles.
	 */
	public static int vkEnumeratePhysicalDevices(VkInstance instance, IntBuffer pPhysicalDeviceCount, PointerBuffer pPhysicalDevices) {
		if ( CHECKS ) {
			checkBuffer(pPhysicalDeviceCount, 1);
			checkBufferSafe(pPhysicalDevices, pPhysicalDeviceCount.get(pPhysicalDeviceCount.position()));
		}
		return nvkEnumeratePhysicalDevices(instance, memAddress(pPhysicalDeviceCount), memAddressSafe(pPhysicalDevices));
	}

	// --- [ vkGetPhysicalDeviceFeatures ] ---

	/** Unsafe version of: {@link #vkGetPhysicalDeviceFeatures GetPhysicalDeviceFeatures} */
	public static void nvkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, long pFeatures) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFeatures;
		callPPV(__functionAddress, physicalDevice.address(), pFeatures);
	}

	/**
	 * Reports capabilities of a physical device.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query supported features, call:</p>
	 * 
	 * <pre><code>void vkGetPhysicalDeviceFeatures(
    VkPhysicalDevice                            physicalDevice,
    VkPhysicalDeviceFeatures*                   pFeatures);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pFeatures} <b>must</b> be a pointer to a {@link VkPhysicalDeviceFeatures} structure</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPhysicalDeviceFeatures}</p>
	 *
	 * @param physicalDevice the physical device from which to query the supported features.
	 * @param pFeatures      a pointer to a {@link VkPhysicalDeviceFeatures} structure in which the physical device features are returned. For each feature, a value of {@link #VK_TRUE TRUE} indicates that the feature is supported on this physical device, and {@link #VK_FALSE FALSE} indicates that the feature is not supported.
	 */
	public static void vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures pFeatures) {
		nvkGetPhysicalDeviceFeatures(physicalDevice, pFeatures.address());
	}

	// --- [ vkGetPhysicalDeviceFormatProperties ] ---

	/** Unsafe version of: {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} */
	public static void nvkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, int format, long pFormatProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFormatProperties;
		callPPV(__functionAddress, physicalDevice.address(), format, pFormatProperties);
	}

	/**
	 * Lists physical device's format capabilities.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query supported format features which are properties of the physical device, call:</p>
	 * 
	 * <pre><code>void vkGetPhysicalDeviceFormatProperties(
    VkPhysicalDevice                            physicalDevice,
    VkFormat                                    format,
    VkFormatProperties*                         pFormatProperties);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
	 * <li>{@code pFormatProperties} <b>must</b> be a pointer to a {@link VkFormatProperties} structure</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkFormatProperties}</p>
	 *
	 * @param physicalDevice    the physical device from which to query the format properties.
	 * @param format            the format whose properties are queried.
	 * @param pFormatProperties a pointer to a {@link VkFormatProperties} structure in which physical device properties for {@code format} are returned.
	 */
	public static void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, int format, VkFormatProperties pFormatProperties) {
		nvkGetPhysicalDeviceFormatProperties(physicalDevice, format, pFormatProperties.address());
	}

	// --- [ vkGetPhysicalDeviceImageFormatProperties ] ---

	/** Unsafe version of: {@link #vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} */
	public static int nvkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, long pImageFormatProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceImageFormatProperties;
		return callPPI(__functionAddress, physicalDevice.address(), format, type, tiling, usage, flags, pImageFormatProperties);
	}

	/**
	 * Lists physical device's image format capabilities.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query additional capabilities specific to image types, call:</p>
	 * 
	 * <pre><code>VkResult vkGetPhysicalDeviceImageFormatProperties(
    VkPhysicalDevice                            physicalDevice,
    VkFormat                                    format,
    VkImageType                                 type,
    VkImageTiling                               tiling,
    VkImageUsageFlags                           usage,
    VkImageCreateFlags                          flags,
    VkImageFormatProperties*                    pImageFormatProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} parameters correspond to parameters that would be consumed by {@link #vkCreateImage CreateImage}.</p>
	 * 
	 * <p>If {@code format} is not a supported image format, or if the combination of {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} is not supported for images, then {@link #vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} returns {@link #VK_ERROR_FORMAT_NOT_SUPPORTED ERROR_FORMAT_NOT_SUPPORTED}.</p>
	 * 
	 * <p>The limitations on an image format that are reported by {@link #vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} have the following property: if {@code usage1} and {@code usage2} of type {@code VkImageUsageFlags} are such that the bits set in {@code usage1} are a subset of the bits set in {@code usage2}, and {@code flags1} and {@code flags2} of type {@code VkImageCreateFlags} are such that the bits set in {@code flags1} are a subset of the bits set in {@code flags2}, then the limitations for {@code usage1} and {@code flags1} <b>must</b> be no more strict than the limitations for {@code usage2} and {@code flags2}, for all values of {@code format}, {@code type}, and {@code tiling}.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
	 * <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
	 * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
	 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
	 * <li>{@code usage} <b>must</b> not be 0</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
	 * <li>{@code pImageFormatProperties} <b>must</b> be a pointer to a {@link VkImageFormatProperties} structure</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_FORMAT_NOT_SUPPORTED ERROR_FORMAT_NOT_SUPPORTED}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkImageFormatProperties}</p>
	 *
	 * @param physicalDevice         the physical device from which to query the image capabilities.
	 * @param format                 the image format, corresponding to {@link VkImageCreateInfo}{@code ::format}.
	 * @param type                   the image type, corresponding to {@link VkImageCreateInfo}{@code ::imageType}.
	 * @param tiling                 the image tiling, corresponding to {@link VkImageCreateInfo}{@code ::tiling}.
	 * @param usage                  the intended usage of the image, corresponding to {@link VkImageCreateInfo}{@code ::usage}.
	 * @param flags                  a bitmask describing additional parameters of the image, corresponding to {@link VkImageCreateInfo}{@code ::flags}.
	 * @param pImageFormatProperties points to an instance of the {@link VkImageFormatProperties} structure in which capabilities are returned.
	 */
	public static int vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, VkImageFormatProperties pImageFormatProperties) {
		return nvkGetPhysicalDeviceImageFormatProperties(physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties.address());
	}

	// --- [ vkGetPhysicalDeviceProperties ] ---

	/** Unsafe version of: {@link #vkGetPhysicalDeviceProperties GetPhysicalDeviceProperties} */
	public static void nvkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, long pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceProperties;
		callPPV(__functionAddress, physicalDevice.address(), pProperties);
	}

	/**
	 * Returns properties of a physical device.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query general properties of physical devices once enumerated, call:</p>
	 * 
	 * <pre><code>void vkGetPhysicalDeviceProperties(
    VkPhysicalDevice                            physicalDevice,
    VkPhysicalDeviceProperties*                 pProperties);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pProperties} <b>must</b> be a pointer to a {@link VkPhysicalDeviceProperties} structure</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPhysicalDeviceProperties}</p>
	 *
	 * @param physicalDevice the handle to the physical device whose properties will be queried.
	 * @param pProperties    points to an instance of the {@link VkPhysicalDeviceProperties} structure, that will be filled with returned information.
	 */
	public static void vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties pProperties) {
		nvkGetPhysicalDeviceProperties(physicalDevice, pProperties.address());
	}

	// --- [ vkGetPhysicalDeviceQueueFamilyProperties ] ---

	/**
	 * Unsafe version of: {@link #vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}
	 *
	 * @param pQueueFamilyPropertyCount a pointer to an integer related to the number of queue families available or queried, as described below.
	 */
	public static void nvkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties;
		callPPPV(__functionAddress, physicalDevice.address(), pQueueFamilyPropertyCount, pQueueFamilyProperties);
	}

	/**
	 * Reports properties of the queues of the specified physical device.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query properties of queues available on a physical device, call:</p>
	 * 
	 * <pre><code>void vkGetPhysicalDeviceQueueFamilyProperties(
    VkPhysicalDevice                            physicalDevice,
    uint32_t*                                   pQueueFamilyPropertyCount,
    VkQueueFamilyProperties*                    pQueueFamilyProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If {@code pQueueFamilyProperties} is {@code NULL}, then the number of queue families available is returned in {@code pQueueFamilyPropertyCount}. Otherwise, {@code pQueueFamilyPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pQueueFamilyProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pQueueFamilyProperties}. If {@code pQueueFamilyPropertyCount} is less than the number of queue families available, at most {@code pQueueFamilyPropertyCount} structures will be written.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pQueueFamilyPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pQueueFamilyPropertyCount} is not 0, and {@code pQueueFamilyProperties} is not {@code NULL}, {@code pQueueFamilyProperties} <b>must</b> be a pointer to an array of {@code pQueueFamilyPropertyCount} {@link VkQueueFamilyProperties} structures</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkQueueFamilyProperties}</p>
	 *
	 * @param physicalDevice            the handle to the physical device whose properties will be queried.
	 * @param pQueueFamilyPropertyCount a pointer to an integer related to the number of queue families available or queried, as described below.
	 * @param pQueueFamilyProperties    either {@code NULL} or a pointer to an array of {@link VkQueueFamilyProperties} structures.
	 */
	public static void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, IntBuffer pQueueFamilyPropertyCount, VkQueueFamilyProperties.Buffer pQueueFamilyProperties) {
		if ( CHECKS ) {
			checkBuffer(pQueueFamilyPropertyCount, 1);
			checkBufferSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount.get(pQueueFamilyPropertyCount.position()));
		}
		nvkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, memAddress(pQueueFamilyPropertyCount), memAddressSafe(pQueueFamilyProperties));
	}

	// --- [ vkGetPhysicalDeviceMemoryProperties ] ---

	/** Unsafe version of: {@link #vkGetPhysicalDeviceMemoryProperties GetPhysicalDeviceMemoryProperties} */
	public static void nvkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, long pMemoryProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceMemoryProperties;
		callPPV(__functionAddress, physicalDevice.address(), pMemoryProperties);
	}

	/**
	 * Reports memory information for the specified physical device.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query memory properties, call:</p>
	 * 
	 * <pre><code>void vkGetPhysicalDeviceMemoryProperties(
    VkPhysicalDevice                            physicalDevice,
    VkPhysicalDeviceMemoryProperties*           pMemoryProperties);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pMemoryProperties} <b>must</b> be a pointer to a {@link VkPhysicalDeviceMemoryProperties} structure</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPhysicalDeviceMemoryProperties}</p>
	 *
	 * @param physicalDevice    the handle to the device to query.
	 * @param pMemoryProperties points to an instance of {@link VkPhysicalDeviceMemoryProperties} structure in which the properties are returned.
	 */
	public static void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties pMemoryProperties) {
		nvkGetPhysicalDeviceMemoryProperties(physicalDevice, pMemoryProperties.address());
	}

	// --- [ vkGetInstanceProcAddr ] ---

	/** Unsafe version of: {@link #vkGetInstanceProcAddr GetInstanceProcAddr} */
	public static long nvkGetInstanceProcAddr(VkInstance instance, long pName) {
		long __functionAddress = instance.getCapabilities().vkGetInstanceProcAddr;
		return callPPP(__functionAddress, instance.address(), pName);
	}

	/**
	 * Return a function pointer for a command.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>Vulkan commands are not necessarily exposed statically on a platform. Function pointers for all Vulkan commands <b>can</b> be obtained with the command:</p>
	 * 
	 * <pre><code>PFN_vkVoidFunction vkGetInstanceProcAddr(
    VkInstance                                  instance,
    const char*                                 pName);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkGetInstanceProcAddr GetInstanceProcAddr} itself is obtained in a platform- and loader- specific manner. Typically, the loader library will export this command as a function symbol, so applications <b>can</b> link against the loader library, or load it dynamically and look up the symbol using platform-specific APIs. Loaders are encouraged to export function symbols for all other core Vulkan commands as well; if this is done, then applications that use only the core Vulkan commands have no need to use {@link #vkGetInstanceProcAddr GetInstanceProcAddr}.</p>
	 * 
	 * <p>The table below defines the various use cases for {@link #vkGetInstanceProcAddr GetInstanceProcAddr} and expected return value ("fp" is function pointer) for each case.</p>
	 * 
	 * <p>The returned function pointer is of type {@code PFN_vkVoidFunction}, and must be cast to the type of the command being queried.</p>
	 * 
	 * <h6>vkGetInstanceProcAddr behavior</h6>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>{@code instance}</th><th>{@code pName}</th><th>return value</th></tr></thead>
	 * <tbody>
	 * <tr><td>*</td><td>{@code NULL}</td><td>undefined</td></tr>
	 * <tr><td>invalid instance</td><td>*</td><td>undefined</td></tr>
	 * <tr><td>{@code NULL}</td><td>{@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}</td><td>fp</td></tr>
	 * <tr><td>{@code NULL}</td><td>{@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties}</td><td>fp</td></tr>
	 * <tr><td>{@code NULL}</td><td>{@link #vkCreateInstance CreateInstance}</td><td>fp</td></tr>
	 * <tr><td>{@code NULL}</td><td>* (any {@code pName} not covered above)</td><td>{@code NULL}</td></tr>
	 * <tr><td>instance</td><td>core Vulkan command</td><td>fp<sup>1</sup></td></tr>
	 * <tr><td>instance</td><td>enabled instance extension commands for {@code instance}</td><td>fp<sup>1</sup></td></tr>
	 * <tr><td>instance</td><td>available device extension<sup>2</sup> commands for {@code instance}</td><td>fp<sup>1</sup></td></tr>
	 * <tr><td>instance</td><td>* (any {@code pName} not covered above)</td><td>{@code NULL}</td></tr>
	 * </tbody>
	 * </table>
	 * 
	 * <dl>
	 * <dt>1</dt>
	 * <dd>The returned function pointer <b>must</b> only be called with a dispatchable object (the first parameter) that is {@code instance} or a child of {@code instance}. e.g. {@code VkInstance}, {@code VkPhysicalDevice}, {@code VkDevice}, {@code VkQueue}, or {@code VkCommandBuffer}.</dd>
	 * <dt>2</dt>
	 * <dd>An “available extension” is an extension function supported by any of the loader, driver or layer.</dd>
	 * </dl>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>If {@code instance} is not {@code NULL}, {@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pName} <b>must</b> be a null-terminated string</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code PFN_vkVoidFunction}</p>
	 *
	 * @param instance the instance that the function pointer will be compatible with, or {@code NULL} for commands not dependent on any instance.
	 * @param pName    the name of the command to obtain.
	 */
	public static long vkGetInstanceProcAddr(VkInstance instance, ByteBuffer pName) {
		if ( CHECKS )
			checkNT1(pName);
		return nvkGetInstanceProcAddr(instance, memAddress(pName));
	}

	/**
	 * Return a function pointer for a command.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>Vulkan commands are not necessarily exposed statically on a platform. Function pointers for all Vulkan commands <b>can</b> be obtained with the command:</p>
	 * 
	 * <pre><code>PFN_vkVoidFunction vkGetInstanceProcAddr(
    VkInstance                                  instance,
    const char*                                 pName);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkGetInstanceProcAddr GetInstanceProcAddr} itself is obtained in a platform- and loader- specific manner. Typically, the loader library will export this command as a function symbol, so applications <b>can</b> link against the loader library, or load it dynamically and look up the symbol using platform-specific APIs. Loaders are encouraged to export function symbols for all other core Vulkan commands as well; if this is done, then applications that use only the core Vulkan commands have no need to use {@link #vkGetInstanceProcAddr GetInstanceProcAddr}.</p>
	 * 
	 * <p>The table below defines the various use cases for {@link #vkGetInstanceProcAddr GetInstanceProcAddr} and expected return value ("fp" is function pointer) for each case.</p>
	 * 
	 * <p>The returned function pointer is of type {@code PFN_vkVoidFunction}, and must be cast to the type of the command being queried.</p>
	 * 
	 * <h6>vkGetInstanceProcAddr behavior</h6>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>{@code instance}</th><th>{@code pName}</th><th>return value</th></tr></thead>
	 * <tbody>
	 * <tr><td>*</td><td>{@code NULL}</td><td>undefined</td></tr>
	 * <tr><td>invalid instance</td><td>*</td><td>undefined</td></tr>
	 * <tr><td>{@code NULL}</td><td>{@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}</td><td>fp</td></tr>
	 * <tr><td>{@code NULL}</td><td>{@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties}</td><td>fp</td></tr>
	 * <tr><td>{@code NULL}</td><td>{@link #vkCreateInstance CreateInstance}</td><td>fp</td></tr>
	 * <tr><td>{@code NULL}</td><td>* (any {@code pName} not covered above)</td><td>{@code NULL}</td></tr>
	 * <tr><td>instance</td><td>core Vulkan command</td><td>fp<sup>1</sup></td></tr>
	 * <tr><td>instance</td><td>enabled instance extension commands for {@code instance}</td><td>fp<sup>1</sup></td></tr>
	 * <tr><td>instance</td><td>available device extension<sup>2</sup> commands for {@code instance}</td><td>fp<sup>1</sup></td></tr>
	 * <tr><td>instance</td><td>* (any {@code pName} not covered above)</td><td>{@code NULL}</td></tr>
	 * </tbody>
	 * </table>
	 * 
	 * <dl>
	 * <dt>1</dt>
	 * <dd>The returned function pointer <b>must</b> only be called with a dispatchable object (the first parameter) that is {@code instance} or a child of {@code instance}. e.g. {@code VkInstance}, {@code VkPhysicalDevice}, {@code VkDevice}, {@code VkQueue}, or {@code VkCommandBuffer}.</dd>
	 * <dt>2</dt>
	 * <dd>An “available extension” is an extension function supported by any of the loader, driver or layer.</dd>
	 * </dl>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>If {@code instance} is not {@code NULL}, {@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pName} <b>must</b> be a null-terminated string</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code PFN_vkVoidFunction}</p>
	 *
	 * @param instance the instance that the function pointer will be compatible with, or {@code NULL} for commands not dependent on any instance.
	 * @param pName    the name of the command to obtain.
	 */
	public static long vkGetInstanceProcAddr(VkInstance instance, CharSequence pName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pNameEncoded = stack.ASCII(pName);
			return nvkGetInstanceProcAddr(instance, memAddress(pNameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ vkGetDeviceProcAddr ] ---

	/** Unsafe version of: {@link #vkGetDeviceProcAddr GetDeviceProcAddr} */
	public static long nvkGetDeviceProcAddr(VkDevice device, long pName) {
		long __functionAddress = device.getCapabilities().vkGetDeviceProcAddr;
		return callPPP(__functionAddress, device.address(), pName);
	}

	/**
	 * Return a function pointer for a command.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>In order to support systems with multiple Vulkan implementations comprising heterogeneous collections of hardware and software, the function pointers returned by {@link #vkGetInstanceProcAddr GetInstanceProcAddr} <b>may</b> point to dispatch code, which calls a different real implementation for different {@code VkDevice} objects (and objects created from them). The overhead of this internal dispatch <b>can</b> be avoided by obtaining device-specific function pointers for any commands that use a device or device-child object as their dispatchable object. Such function pointers <b>can</b> be obtained with the command:</p>
	 * 
	 * <pre><code>PFN_vkVoidFunction vkGetDeviceProcAddr(
    VkDevice                                    device,
    const char*                                 pName);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The returned function pointer is of type {@code PFN_vkVoidFunction}, and must be cast to the type of the command being queried.</p>
	 * 
	 * <h6>vkGetDeviceProcAddr behavior</h6>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>{@code device}</th><th>{@code pName}</th><th>return value</th></tr></thead>
	 * <tbody>
	 * <tr><td>{@code NULL}</td><td>*</td><td>undefined</td></tr>
	 * <tr><td>invalid device</td><td>*</td><td>undefined</td></tr>
	 * <tr><td>device</td><td>{@code NULL}</td><td>undefined</td></tr>
	 * <tr><td>device</td><td>core Vulkan command</td><td>fp<sup>1</sup></td></tr>
	 * <tr><td>device</td><td>enabled extension commands</td><td>fp<sup>1</sup></td></tr>
	 * <tr><td>device</td><td>* (any {@code pName} not covered above)</td><td>{@code NULL}</td></tr>
	 * </tbody>
	 * </table>
	 * 
	 * <dl>
	 * <dt>1</dt>
	 * <dd>The returned function pointer <b>must</b> only be called with a dispatchable object (the first parameter) that is {@code device} or a child of {@code device}. e.g. {@code VkDevice}, {@code VkQueue}, or {@code VkCommandBuffer}.</dd>
	 * </dl>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pName} <b>must</b> be a null-terminated string</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code PFN_vkVoidFunction}</p>
	 *
	 * @param device 
	 * @param pName  
	 */
	public static long vkGetDeviceProcAddr(VkDevice device, ByteBuffer pName) {
		if ( CHECKS )
			checkNT1(pName);
		return nvkGetDeviceProcAddr(device, memAddress(pName));
	}

	/**
	 * Return a function pointer for a command.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>In order to support systems with multiple Vulkan implementations comprising heterogeneous collections of hardware and software, the function pointers returned by {@link #vkGetInstanceProcAddr GetInstanceProcAddr} <b>may</b> point to dispatch code, which calls a different real implementation for different {@code VkDevice} objects (and objects created from them). The overhead of this internal dispatch <b>can</b> be avoided by obtaining device-specific function pointers for any commands that use a device or device-child object as their dispatchable object. Such function pointers <b>can</b> be obtained with the command:</p>
	 * 
	 * <pre><code>PFN_vkVoidFunction vkGetDeviceProcAddr(
    VkDevice                                    device,
    const char*                                 pName);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The returned function pointer is of type {@code PFN_vkVoidFunction}, and must be cast to the type of the command being queried.</p>
	 * 
	 * <h6>vkGetDeviceProcAddr behavior</h6>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>{@code device}</th><th>{@code pName}</th><th>return value</th></tr></thead>
	 * <tbody>
	 * <tr><td>{@code NULL}</td><td>*</td><td>undefined</td></tr>
	 * <tr><td>invalid device</td><td>*</td><td>undefined</td></tr>
	 * <tr><td>device</td><td>{@code NULL}</td><td>undefined</td></tr>
	 * <tr><td>device</td><td>core Vulkan command</td><td>fp<sup>1</sup></td></tr>
	 * <tr><td>device</td><td>enabled extension commands</td><td>fp<sup>1</sup></td></tr>
	 * <tr><td>device</td><td>* (any {@code pName} not covered above)</td><td>{@code NULL}</td></tr>
	 * </tbody>
	 * </table>
	 * 
	 * <dl>
	 * <dt>1</dt>
	 * <dd>The returned function pointer <b>must</b> only be called with a dispatchable object (the first parameter) that is {@code device} or a child of {@code device}. e.g. {@code VkDevice}, {@code VkQueue}, or {@code VkCommandBuffer}.</dd>
	 * </dl>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pName} <b>must</b> be a null-terminated string</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code PFN_vkVoidFunction}</p>
	 *
	 * @param device 
	 * @param pName  
	 */
	public static long vkGetDeviceProcAddr(VkDevice device, CharSequence pName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pNameEncoded = stack.ASCII(pName);
			return nvkGetDeviceProcAddr(device, memAddress(pNameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ vkCreateDevice ] ---

	/** Unsafe version of: {@link #vkCreateDevice CreateDevice} */
	public static int nvkCreateDevice(VkPhysicalDevice physicalDevice, long pCreateInfo, long pAllocator, long pDevice) {
		long __functionAddress = physicalDevice.getCapabilities().vkCreateDevice;
		if ( CHECKS ) {
			VkDeviceCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, physicalDevice.address(), pCreateInfo, pAllocator, pDevice);
	}

	/**
	 * Create a new device instance.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>A logical device is created as a <em>connection</em> to a physical device. To create a logical device, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateDevice(
    VkPhysicalDevice                            physicalDevice,
    const VkDeviceCreateInfo*                   pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkDevice*                                   pDevice);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Multiple logical devices <b>can</b> be created from the same physical device. Logical device creation <b>may</b> fail due to lack of device-specific resources (in addition to the other errors). If that occurs, {@link #vkCreateDevice CreateDevice} will return {@link #VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkDeviceCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pDevice} <b>must</b> be a pointer to a {@code VkDevice} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
	 * <li>{@link #VK_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}</li>
	 * <li>{@link #VK_ERROR_FEATURE_NOT_PRESENT ERROR_FEATURE_NOT_PRESENT}</li>
	 * <li>{@link #VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkDeviceCreateInfo}</p>
	 *
	 * @param physicalDevice <b>must</b> be one of the device handles returned from a call to {@link #vkEnumeratePhysicalDevices EnumeratePhysicalDevices} (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#devsandqueues-physical-device-enumeration">Physical Device Enumeration</a>).
	 * @param pCreateInfo    a pointer to a {@link VkDeviceCreateInfo} structure containing information about how to create the device.
	 * @param pAllocator     controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pDevice        points to a handle in which the created {@code VkDevice} is returned.
	 */
	public static int vkCreateDevice(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, PointerBuffer pDevice) {
		if ( CHECKS )
			checkBuffer(pDevice, 1);
		return nvkCreateDevice(physicalDevice, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pDevice));
	}

	// --- [ vkDestroyDevice ] ---

	/** Unsafe version of: {@link #vkDestroyDevice DestroyDevice} */
	public static void nvkDestroyDevice(VkDevice device, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyDevice;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPPV(__functionAddress, device.address(), pAllocator);
	}

	/**
	 * Destroy a logical device.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a device, call:</p>
	 * 
	 * <pre><code>void vkDestroyDevice(
    VkDevice                                    device,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>To ensure that no work is active on the device, {@link #vkDeviceWaitIdle DeviceWaitIdle} <b>can</b> be used to gate the destruction of the device. Prior to destroying a device, an application is responsible for destroying/freeing any Vulkan objects that were created using that device as the first parameter of the corresponding ftext:vkCreate* or ftext:vkAllocate* command.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>The lifetime of each of these objects is bound by the lifetime of the {@code VkDevice} object. Therefore, to avoid resource leaks, it is critical that an application explicitly free all of these resources prior to calling {@link #vkDestroyDevice DestroyDevice}.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All child objects created on {@code device} <b>must</b> have been destroyed prior to destroying {@code device}</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code device} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code device} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>If {@code device} is not {@code NULL}, {@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code device} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the logical device to destroy.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyDevice(VkDevice device, VkAllocationCallbacks pAllocator) {
		nvkDestroyDevice(device, memAddressSafe(pAllocator));
	}

	// --- [ vkEnumerateInstanceExtensionProperties ] ---

	/**
	 * Unsafe version of: {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}
	 *
	 * @param pPropertyCount a pointer to an integer related to the number of extension properties available or queried, as described below.
	 */
	public static int nvkEnumerateInstanceExtensionProperties(long pLayerName, long pPropertyCount, long pProperties) {
		long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceExtensionProperties;
		return callPPPI(__functionAddress, pLayerName, pPropertyCount, pProperties);
	}

	/**
	 * Returns up to requested number of global extension properties.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query the available instance extensions, call:</p>
	 * 
	 * <pre><code>VkResult vkEnumerateInstanceExtensionProperties(
    const char*                                 pLayerName,
    uint32_t*                                   pPropertyCount,
    VkExtensionProperties*                      pProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>When {@code pLayerName} parameter is NULL, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When {@code pLayerName} is the name of a layer, the instance extensions provided by that layer are returned.</p>
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of extensions properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of extension properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of extensions available, {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available properties were returned.</p>
	 * 
	 * <p>Because the list of available layers may change externally between calls to {@code vkEnumerateInstanceExtensionProperties}, two calls may retrieve different results if a {@code pLayerName} is available in one call but not in another. The extensions supported by a layer may also change between two calls, e.g. if the layer implementation is replaced by a different version between those calls.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code pLayerName} is not {@code NULL}, it <b>must</b> be the name of a layer returned by {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated string</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} {@link VkExtensionProperties} structures</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_INCOMPLETE INCOMPLETE}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_LAYER_NOT_PRESENT ERROR_LAYER_NOT_PRESENT}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkExtensionProperties}</p>
	 *
	 * @param pLayerName     either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from.
	 * @param pPropertyCount a pointer to an integer related to the number of extension properties available or queried, as described below.
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkExtensionProperties} structures.
	 */
	public static int vkEnumerateInstanceExtensionProperties(ByteBuffer pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkNT1Safe(pLayerName);
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateInstanceExtensionProperties(memAddressSafe(pLayerName), memAddress(pPropertyCount), memAddressSafe(pProperties));
	}

	/**
	 * Returns up to requested number of global extension properties.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query the available instance extensions, call:</p>
	 * 
	 * <pre><code>VkResult vkEnumerateInstanceExtensionProperties(
    const char*                                 pLayerName,
    uint32_t*                                   pPropertyCount,
    VkExtensionProperties*                      pProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>When {@code pLayerName} parameter is NULL, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When {@code pLayerName} is the name of a layer, the instance extensions provided by that layer are returned.</p>
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of extensions properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of extension properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of extensions available, {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available properties were returned.</p>
	 * 
	 * <p>Because the list of available layers may change externally between calls to {@code vkEnumerateInstanceExtensionProperties}, two calls may retrieve different results if a {@code pLayerName} is available in one call but not in another. The extensions supported by a layer may also change between two calls, e.g. if the layer implementation is replaced by a different version between those calls.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code pLayerName} is not {@code NULL}, it <b>must</b> be the name of a layer returned by {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated string</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} {@link VkExtensionProperties} structures</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_INCOMPLETE INCOMPLETE}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_LAYER_NOT_PRESENT ERROR_LAYER_NOT_PRESENT}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkExtensionProperties}</p>
	 *
	 * @param pLayerName     either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from.
	 * @param pPropertyCount a pointer to an integer related to the number of extension properties available or queried, as described below.
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkExtensionProperties} structures.
	 */
	public static int vkEnumerateInstanceExtensionProperties(CharSequence pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pLayerNameEncoded = stack.UTF8(pLayerName);
			return nvkEnumerateInstanceExtensionProperties(memAddressSafe(pLayerNameEncoded), memAddress(pPropertyCount), memAddressSafe(pProperties));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ vkEnumerateDeviceExtensionProperties ] ---

	/**
	 * Unsafe version of: {@link #vkEnumerateDeviceExtensionProperties EnumerateDeviceExtensionProperties}
	 *
	 * @param pPropertyCount a pointer to an integer related to the number of extension properties available or queried, and is treated in the same fashion as the {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}{@code ::pPropertyCount} parameter.
	 */
	public static int nvkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, long pLayerName, long pPropertyCount, long pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceExtensionProperties;
		return callPPPPI(__functionAddress, physicalDevice.address(), pLayerName, pPropertyCount, pProperties);
	}

	/**
	 * Returns properties of available physical device extensions.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query the extensions available to a given physical device, call:</p>
	 * 
	 * <pre><code>VkResult vkEnumerateDeviceExtensionProperties(
    VkPhysicalDevice                            physicalDevice,
    const char*                                 pLayerName,
    uint32_t*                                   pPropertyCount,
    VkExtensionProperties*                      pProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>When {@code pLayerName} parameter is NULL, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When {@code pLayerName} is the name of a layer, the device extensions provided by that layer are returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code pLayerName} is not {@code NULL}, it <b>must</b> be the name of a layer returned by {@link #vkEnumerateDeviceLayerProperties EnumerateDeviceLayerProperties}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated string</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} {@link VkExtensionProperties} structures</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_INCOMPLETE INCOMPLETE}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_LAYER_NOT_PRESENT ERROR_LAYER_NOT_PRESENT}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkExtensionProperties}</p>
	 *
	 * @param physicalDevice the physical device that will be queried.
	 * @param pLayerName     either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from.
	 * @param pPropertyCount a pointer to an integer related to the number of extension properties available or queried, and is treated in the same fashion as the {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}{@code ::pPropertyCount} parameter.
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkExtensionProperties} structures.
	 */
	public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, ByteBuffer pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkNT1Safe(pLayerName);
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateDeviceExtensionProperties(physicalDevice, memAddressSafe(pLayerName), memAddress(pPropertyCount), memAddressSafe(pProperties));
	}

	/**
	 * Returns properties of available physical device extensions.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query the extensions available to a given physical device, call:</p>
	 * 
	 * <pre><code>VkResult vkEnumerateDeviceExtensionProperties(
    VkPhysicalDevice                            physicalDevice,
    const char*                                 pLayerName,
    uint32_t*                                   pPropertyCount,
    VkExtensionProperties*                      pProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>When {@code pLayerName} parameter is NULL, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When {@code pLayerName} is the name of a layer, the device extensions provided by that layer are returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code pLayerName} is not {@code NULL}, it <b>must</b> be the name of a layer returned by {@link #vkEnumerateDeviceLayerProperties EnumerateDeviceLayerProperties}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated string</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} {@link VkExtensionProperties} structures</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_INCOMPLETE INCOMPLETE}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_LAYER_NOT_PRESENT ERROR_LAYER_NOT_PRESENT}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkExtensionProperties}</p>
	 *
	 * @param physicalDevice the physical device that will be queried.
	 * @param pLayerName     either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from.
	 * @param pPropertyCount a pointer to an integer related to the number of extension properties available or queried, and is treated in the same fashion as the {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}{@code ::pPropertyCount} parameter.
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkExtensionProperties} structures.
	 */
	public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, CharSequence pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pLayerNameEncoded = stack.UTF8(pLayerName);
			return nvkEnumerateDeviceExtensionProperties(physicalDevice, memAddressSafe(pLayerNameEncoded), memAddress(pPropertyCount), memAddressSafe(pProperties));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ vkEnumerateInstanceLayerProperties ] ---

	/**
	 * Unsafe version of: {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties}
	 *
	 * @param pPropertyCount a pointer to an integer related to the number of layer properties available or queried, as described below.
	 */
	public static int nvkEnumerateInstanceLayerProperties(long pPropertyCount, long pProperties) {
		long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceLayerProperties;
		return callPPI(__functionAddress, pPropertyCount, pProperties);
	}

	/**
	 * Returns up to requested number of global layer properties.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query the available layers, call:</p>
	 * 
	 * <pre><code>VkResult vkEnumerateInstanceLayerProperties(
    uint32_t*                                   pPropertyCount,
    VkLayerProperties*                          pProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of layer properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of layer properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of layers available, {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available layer properties were returned.</p>
	 * 
	 * <p>The list of available layers may change at any time due to actions outside of the Vulkan implementation, so two calls to {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties} with the same parameters <b>may</b> return different results, or retrieve different {@code pPropertyCount} values or {@code pProperties} contents. Once an instance has been created, the layers enabled for that instance will continue to be enabled and valid for the lifetime of that instance, even if some of them become unavailable for future instances.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} {@link VkLayerProperties} structures</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_INCOMPLETE INCOMPLETE}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkLayerProperties}</p>
	 *
	 * @param pPropertyCount a pointer to an integer related to the number of layer properties available or queried, as described below.
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkLayerProperties} structures.
	 */
	public static int vkEnumerateInstanceLayerProperties(IntBuffer pPropertyCount, VkLayerProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateInstanceLayerProperties(memAddress(pPropertyCount), memAddressSafe(pProperties));
	}

	// --- [ vkEnumerateDeviceLayerProperties ] ---

	/**
	 * Unsafe version of: {@link #vkEnumerateDeviceLayerProperties EnumerateDeviceLayerProperties}
	 *
	 * @param pPropertyCount a pointer to an integer related to the number of layer properties available or queried.
	 */
	public static int nvkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceLayerProperties;
		return callPPPI(__functionAddress, physicalDevice.address(), pPropertyCount, pProperties);
	}

	/**
	 * Returns properties of available physical device layers.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To enumerate device layers, call:</p>
	 * 
	 * <pre><code>VkResult vkEnumerateDeviceLayerProperties(
    VkPhysicalDevice                            physicalDevice,
    uint32_t*                                   pPropertyCount,
    VkLayerProperties*                          pProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of layer properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of layer properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of layers available, {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available layer properties were returned.</p>
	 * 
	 * <p>The list of layers enumerated by {@link #vkEnumerateDeviceLayerProperties EnumerateDeviceLayerProperties} <b>must</b> be exactly the sequence of layers enabled for the instance. The members of {@link VkLayerProperties} for each enumerated layer <b>must</b> be the same as the properties when the layer was enumerated by {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties}.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} {@link VkLayerProperties} structures</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_INCOMPLETE INCOMPLETE}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkLayerProperties}</p>
	 *
	 * @param physicalDevice 
	 * @param pPropertyCount a pointer to an integer related to the number of layer properties available or queried.
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkLayerProperties} structures.
	 */
	public static int vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, IntBuffer pPropertyCount, VkLayerProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateDeviceLayerProperties(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
	}

	// --- [ vkGetDeviceQueue ] ---

	/** Unsafe version of: {@link #vkGetDeviceQueue GetDeviceQueue} */
	public static void nvkGetDeviceQueue(VkDevice device, int queueFamilyIndex, int queueIndex, long pQueue) {
		long __functionAddress = device.getCapabilities().vkGetDeviceQueue;
		callPPV(__functionAddress, device.address(), queueFamilyIndex, queueIndex, pQueue);
	}

	/**
	 * Get a queue handle from a device.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To retrieve a handle to a VkQueue object, call:</p>
	 * 
	 * <pre><code>void vkGetDeviceQueue(
    VkDevice                                    device,
    uint32_t                                    queueFamilyIndex,
    uint32_t                                    queueIndex,
    VkQueue*                                    pQueue);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code queueFamilyIndex} <b>must</b> be one of the queue family indices specified when {@code device} was created, via the {@link VkDeviceQueueCreateInfo} structure</li>
	 * <li>{@code queueIndex} <b>must</b> be less than the number of queues created for the specified queue family index when {@code device} was created, via the {@code queueCount} member of the {@link VkDeviceQueueCreateInfo} structure</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pQueue} <b>must</b> be a pointer to a {@code VkQueue} handle</li>
	 * </ul>
	 *
	 * @param device           the logical device that owns the queue.
	 * @param queueFamilyIndex the index of the queue family to which the queue belongs.
	 * @param queueIndex       the index within this queue family of the queue to retrieve.
	 * @param pQueue           a pointer to a {@code VkQueue} object that will be filled with the handle for the requested queue.
	 */
	public static void vkGetDeviceQueue(VkDevice device, int queueFamilyIndex, int queueIndex, PointerBuffer pQueue) {
		if ( CHECKS )
			checkBuffer(pQueue, 1);
		nvkGetDeviceQueue(device, queueFamilyIndex, queueIndex, memAddress(pQueue));
	}

	// --- [ vkQueueSubmit ] ---

	/**
	 * Unsafe version of: {@link #vkQueueSubmit QueueSubmit}
	 *
	 * @param submitCount the number of elements in the {@code pSubmits} array.
	 */
	public static int nvkQueueSubmit(VkQueue queue, int submitCount, long pSubmits, long fence) {
		long __functionAddress = queue.getCapabilities().vkQueueSubmit;
		if ( CHECKS )
			if ( pSubmits != NULL ) VkSubmitInfo.validate(pSubmits, submitCount);
		return callPPJI(__functionAddress, queue.address(), submitCount, pSubmits, fence);
	}

	/**
	 * Submits a sequence of semaphores or command buffers to a queue.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To submit command buffers to a queue, call:</p>
	 * 
	 * <pre><code>VkResult vkQueueSubmit(
    VkQueue                                     queue,
    uint32_t                                    submitCount,
    const VkSubmitInfo*                         pSubmits,
    VkFence                                     fence);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Submission can be a high overhead operation, and applications <b>should</b> attempt to batch work together into as few calls to {@link #vkQueueSubmit QueueSubmit} as possible.</p>
	 * </div>
	 * 
	 * <p>{@link #vkQueueSubmit QueueSubmit} is a <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#devsandqueues-submission">queue submission command</a>, with each batch defined by an element of {@code pSubmits} as an instance of the {@link VkSubmitInfo} structure.</p>
	 * 
	 * <p>Fence and semaphore operations submitted with {@link #vkQueueSubmit QueueSubmit} have additional ordering constraints compared to other submission commands, with dependencies involving previous and subsequent queue operations. Information about these additional constraints can be found in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-semaphores"> semaphore</a> and <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-fences"> fence</a> sections of <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization"> the synchronization chapter</a>.</p>
	 * 
	 * <p>Details on the interaction of {@code pWaitDstStageMask} with synchronization are described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-semaphores-waiting"> semaphore wait operation</a> section of <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization"> the synchronization chapter</a>.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be unsignaled</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * <li>If {@code submitCount} is not 0, {@code pSubmits} <b>must</b> be a pointer to an array of {@code submitCount} valid {@link VkSubmitInfo} structures</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>Both of {@code fence}, and {@code queue} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pSubmits}[].pWaitSemaphores[] <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pSubmits}[].pSignalSemaphores[] <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>-</td><td>-</td><td>Any</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkSubmitInfo}</p>
	 *
	 * @param queue    the queue that the command buffers will be submitted to.
	 * @param pSubmits a pointer to an array of {@link VkSubmitInfo} structures, each specifying a command buffer submission batch.
	 * @param fence    an optional handle to a fence to be signaled. If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, it defines a <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-fences-signaling">fence signal operation</a>.
	 */
	public static int vkQueueSubmit(VkQueue queue, VkSubmitInfo.Buffer pSubmits, long fence) {
		return nvkQueueSubmit(queue, remainingSafe(pSubmits), memAddressSafe(pSubmits), fence);
	}

	/**
	 * Submits a sequence of semaphores or command buffers to a queue.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To submit command buffers to a queue, call:</p>
	 * 
	 * <pre><code>VkResult vkQueueSubmit(
    VkQueue                                     queue,
    uint32_t                                    submitCount,
    const VkSubmitInfo*                         pSubmits,
    VkFence                                     fence);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Submission can be a high overhead operation, and applications <b>should</b> attempt to batch work together into as few calls to {@link #vkQueueSubmit QueueSubmit} as possible.</p>
	 * </div>
	 * 
	 * <p>{@link #vkQueueSubmit QueueSubmit} is a <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#devsandqueues-submission">queue submission command</a>, with each batch defined by an element of {@code pSubmits} as an instance of the {@link VkSubmitInfo} structure.</p>
	 * 
	 * <p>Fence and semaphore operations submitted with {@link #vkQueueSubmit QueueSubmit} have additional ordering constraints compared to other submission commands, with dependencies involving previous and subsequent queue operations. Information about these additional constraints can be found in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-semaphores"> semaphore</a> and <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-fences"> fence</a> sections of <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization"> the synchronization chapter</a>.</p>
	 * 
	 * <p>Details on the interaction of {@code pWaitDstStageMask} with synchronization are described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-semaphores-waiting"> semaphore wait operation</a> section of <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization"> the synchronization chapter</a>.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be unsignaled</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * <li>If {@code submitCount} is not 0, {@code pSubmits} <b>must</b> be a pointer to an array of {@code submitCount} valid {@link VkSubmitInfo} structures</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>Both of {@code fence}, and {@code queue} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pSubmits}[].pWaitSemaphores[] <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pSubmits}[].pSignalSemaphores[] <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>-</td><td>-</td><td>Any</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkSubmitInfo}</p>
	 *
	 * @param queue the queue that the command buffers will be submitted to.
	 * @param fence an optional handle to a fence to be signaled. If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, it defines a <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-fences-signaling">fence signal operation</a>.
	 */
	public static int vkQueueSubmit(VkQueue queue, VkSubmitInfo pSubmit, long fence) {
		return nvkQueueSubmit(queue, 1, pSubmit.address(), fence);
	}

	// --- [ vkQueueWaitIdle ] ---

	/**
	 * Wait for a queue to become idle.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To wait on the host for the completion of outstanding queue operations for a given queue, call:</p>
	 * 
	 * <pre><code>VkResult vkQueueWaitIdle(
    VkQueue                                     queue);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkQueueWaitIdle QueueWaitIdle} is equivalent to submitting a fence to a queue and waiting with an infinite timeout for that fence to signal.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>-</td><td>-</td><td>Any</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param queue the queue on which to wait.
	 */
	public static int vkQueueWaitIdle(VkQueue queue) {
		long __functionAddress = queue.getCapabilities().vkQueueWaitIdle;
		return callPI(__functionAddress, queue.address());
	}

	// --- [ vkDeviceWaitIdle ] ---

	/**
	 * Wait for a device to become idle.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To wait on the host for the completion of outstanding queue operations for all queues on a given logical device, call:</p>
	 * 
	 * <pre><code>VkResult vkDeviceWaitIdle(
    VkDevice                                    device);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkDeviceWaitIdle DeviceWaitIdle} is equivalent to calling {@link #vkQueueWaitIdle QueueWaitIdle} for all queues owned by {@code device}.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to all {@code VkQueue} objects created from {@code device} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device the logical device to idle.
	 */
	public static int vkDeviceWaitIdle(VkDevice device) {
		long __functionAddress = device.getCapabilities().vkDeviceWaitIdle;
		return callPI(__functionAddress, device.address());
	}

	// --- [ vkAllocateMemory ] ---

	/** Unsafe version of: {@link #vkAllocateMemory AllocateMemory} */
	public static int nvkAllocateMemory(VkDevice device, long pAllocateInfo, long pAllocator, long pMemory) {
		long __functionAddress = device.getCapabilities().vkAllocateMemory;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pAllocateInfo, pAllocator, pMemory);
	}

	/**
	 * Allocate GPU memory.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To allocate memory objects, call:</p>
	 * 
	 * <pre><code>VkResult vkAllocateMemory(
    VkDevice                                    device,
    const VkMemoryAllocateInfo*                 pAllocateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkDeviceMemory*                             pMemory);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Allocations returned by {@link #vkAllocateMemory AllocateMemory} are guaranteed to meet any alignment requirement by the implementation. For example, if an implementation requires 128 byte alignment for images and 64 byte alignment for buffers, the device memory returned through this mechanism would be 128-byte aligned. This ensures that applications <b>can</b> correctly suballocate objects of different types (with potentially different alignment requirements) in the same memory object.</p>
	 * 
	 * <p>When memory is allocated, its contents are undefined.</p>
	 * 
	 * <p>There is an implementation-dependent maximum number of memory allocations which <b>can</b> be simultaneously created on a device. This is specified by the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-limits-maxMemoryAllocationCount">{@code maxMemoryAllocationCount}</a> member of the {@link VkPhysicalDeviceLimits} structure. If {@code maxMemoryAllocationCount} is exceeded, {@link #vkAllocateMemory AllocateMemory} will return {@link #VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Some platforms <b>may</b> have a limit on the maximum size of a single allocation. For example, certain systems <b>may</b> fail to create allocations with a size greater than or equal to 4GB. Such a limit is implementation-dependent, and if such a failure occurs then the error {@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY} <b>should</b> be returned.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The number of currently valid memory objects, allocated from {@code device}, <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxMemoryAllocationCount}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pAllocateInfo} <b>must</b> be a pointer to a valid {@link VkMemoryAllocateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pMemory} <b>must</b> be a pointer to a {@code VkDeviceMemory} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkMemoryAllocateInfo}</p>
	 *
	 * @param device        the logical device that owns the memory.
	 * @param pAllocateInfo a pointer to an instance of the {@link VkMemoryAllocateInfo} structure describing parameters of the allocation. A successful returned allocation <b>must</b> use the requested parameters&#8201;&#8212;&#8201;no substitution is permitted by the implementation.
	 * @param pAllocator    controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pMemory       a pointer to a {@code VkDeviceMemory} handle in which information about the allocated memory is returned.
	 */
	public static int vkAllocateMemory(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, LongBuffer pMemory) {
		if ( CHECKS )
			checkBuffer(pMemory, 1);
		return nvkAllocateMemory(device, pAllocateInfo.address(), memAddressSafe(pAllocator), memAddress(pMemory));
	}

	// --- [ vkFreeMemory ] ---

	/** Unsafe version of: {@link #vkFreeMemory FreeMemory} */
	public static void nvkFreeMemory(VkDevice device, long memory, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkFreeMemory;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), memory, pAllocator);
	}

	/**
	 * Free GPU memory.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To free a memory object, call:</p>
	 * 
	 * <pre><code>void vkFreeMemory(
    VkDevice                                    device,
    VkDeviceMemory                              memory,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Before freeing a memory object, an application <b>must</b> ensure the memory object is no longer in use by the device--for example by command buffers queued for execution. The memory <b>can</b> remain bound to images or buffers at the time the memory object is freed, but any further use of them (on host or device) for anything other than destroying those objects will result in undefined behavior. If there are still any bound images or buffers, the memory <b>may</b> not be immediately released by the implementation, but <b>must</b> be released by the time all bound images and buffers have been destroyed. Once memory is released, it is returned to the heap from which it was allocated.</p>
	 * 
	 * <p>How memory objects are bound to Images and Buffers is described in detail in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#resources-association"> Resource Memory Association</a> section.</p>
	 * 
	 * <p>If a memory object is mapped at the time it is freed, it is implicitly unmapped.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code memory} (via images or buffers) <b>must</b> have completed execution</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code memory} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code memory} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the logical device that owns the memory.
	 * @param memory     the {@code VkDeviceMemory} object to be freed.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkFreeMemory(VkDevice device, long memory, VkAllocationCallbacks pAllocator) {
		nvkFreeMemory(device, memory, memAddressSafe(pAllocator));
	}

	// --- [ vkMapMemory ] ---

	/** Unsafe version of: {@link #vkMapMemory MapMemory} */
	public static int nvkMapMemory(VkDevice device, long memory, long offset, long size, int flags, long ppData) {
		long __functionAddress = device.getCapabilities().vkMapMemory;
		return callPJJJPI(__functionAddress, device.address(), memory, offset, size, flags, ppData);
	}

	/**
	 * Map a memory object into application address space.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To retrieve a host virtual address pointer to a region of a mappable memory object, call:</p>
	 * 
	 * <pre><code>VkResult vkMapMemory(
    VkDevice                                    device,
    VkDeviceMemory                              memory,
    VkDeviceSize                                offset,
    VkDeviceSize                                size,
    VkMemoryMapFlags                            flags,
    void**                                      ppData);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>It is an application error to call {@link #vkMapMemory MapMemory} on a memory object that is already mapped.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>{@link #vkMapMemory MapMemory} will fail if the implementation is unable to allocate an appropriately sized contiguous virtual address range, e.g. due to virtual address space fragmentation or platform limits. In such cases, {@link #vkMapMemory MapMemory} <b>must</b> return VK_ERROR_MEMORY_MAP_FAILED. The application <b>can</b> improve the likelihood of success by reducing the size of the mapped range and/or removing unneeded mappings using fname:VkUnmapMemory.</p>
	 * </div>
	 * 
	 * <p>{@link #vkMapMemory MapMemory} does not check whether the device memory is currently in use before returning the host-accessible pointer. The application <b>must</b> guarantee that any previously submitted command that writes to this range has completed before the host reads from or writes to that range, and that any previously submitted command that reads from that range has completed before the host writes to that region (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-fences-devicewrites"> here</a> for details on fulfilling such a guarantee). If the device memory was allocated without the {@link #VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT} set, these guarantees <b>must</b> be made for an extended range: the application <b>must</b> round down the start of the range to the nearest multiple of {@link VkPhysicalDeviceLimits}{@code ::nonCoherentAtomSize}, and round the end of the range up to the nearest multiple of {@link VkPhysicalDeviceLimits}{@code ::nonCoherentAtomSize}.</p>
	 * 
	 * <p>While a range of device memory is mapped for host access, the application is responsible for synchronizing both device and host access to that memory range.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>It is important for the application developer to become meticulously familiar with all of the mechanisms described in the chapter on <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization"> Synchronization and Cache Control</a> as they are crucial to maintaining memory access ordering.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code memory} <b>must</b> not currently be mapped</li>
	 * <li>{@code offset} <b>must</b> be less than the size of {@code memory}</li>
	 * <li>If {@code size} is not equal to {@link #VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be greater than 0</li>
	 * <li>If {@code size} is not equal to {@link #VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be less than or equal to the size of the {@code memory} minus {@code offset}</li>
	 * <li>{@code memory} <b>must</b> have been created with a memory type that reports {@link #VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code flags} <b>must</b> be 0</li>
	 * <li>{@code ppData} <b>must</b> be a pointer to a pointer</li>
	 * <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_MEMORY_MAP_FAILED ERROR_MEMORY_MAP_FAILED}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device the logical device that owns the memory.
	 * @param memory the {@code VkDeviceMemory} object to be mapped.
	 * @param offset a zero-based byte offset from the beginning of the memory object.
	 * @param size   the size of the memory range to map, or {@link #VK_WHOLE_SIZE WHOLE_SIZE} to map from {@code offset} to the end of the allocation.
	 * @param flags  reserved for future use.
	 * @param ppData points to a pointer in which is returned a host-accessible pointer to the beginning of the mapped range. This pointer minus {@code offset} <b>must</b> be aligned to at least {@link VkPhysicalDeviceLimits}{@code ::minMemoryMapAlignment}.
	 */
	public static int vkMapMemory(VkDevice device, long memory, long offset, long size, int flags, PointerBuffer ppData) {
		if ( CHECKS )
			checkBuffer(ppData, 1);
		return nvkMapMemory(device, memory, offset, size, flags, memAddress(ppData));
	}

	// --- [ vkUnmapMemory ] ---

	/**
	 * Unmap a previously mapped memory object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To unmap a memory object once host access to it is no longer needed by the application, call:</p>
	 * 
	 * <pre><code>void vkUnmapMemory(
    VkDevice                                    device,
    VkDeviceMemory                              memory);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code memory} <b>must</b> currently be mapped</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device the logical device that owns the memory.
	 * @param memory the memory object to be unmapped.
	 */
	public static void vkUnmapMemory(VkDevice device, long memory) {
		long __functionAddress = device.getCapabilities().vkUnmapMemory;
		callPJV(__functionAddress, device.address(), memory);
	}

	// --- [ vkFlushMappedMemoryRanges ] ---

	/**
	 * Unsafe version of: {@link #vkFlushMappedMemoryRanges FlushMappedMemoryRanges}
	 *
	 * @param memoryRangeCount the length of the {@code pMemoryRanges} array.
	 */
	public static int nvkFlushMappedMemoryRanges(VkDevice device, int memoryRangeCount, long pMemoryRanges) {
		long __functionAddress = device.getCapabilities().vkFlushMappedMemoryRanges;
		return callPPI(__functionAddress, device.address(), memoryRangeCount, pMemoryRanges);
	}

	/**
	 * Flush mapped memory ranges.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To flush ranges of non-coherent memory from the host caches, call:</p>
	 * 
	 * <pre><code>VkResult vkFlushMappedMemoryRanges(
    VkDevice                                    device,
    uint32_t                                    memoryRangeCount,
    const VkMappedMemoryRange*                  pMemoryRanges);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkFlushMappedMemoryRanges FlushMappedMemoryRanges} <b>must</b> be used to guarantee that host writes to non-coherent memory are visible to the device. It <b>must</b> be called after the host writes to non-coherent memory have completed and before command buffers that will read or write any of those memory locations are submitted to a queue.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pMemoryRanges} <b>must</b> be a pointer to an array of {@code memoryRangeCount} valid {@link VkMappedMemoryRange} structures</li>
	 * <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkMappedMemoryRange}</p>
	 *
	 * @param device        the logical device that owns the memory ranges.
	 * @param pMemoryRanges a pointer to an array of {@link VkMappedMemoryRange} structures describing the memory ranges to flush.
	 */
	public static int vkFlushMappedMemoryRanges(VkDevice device, VkMappedMemoryRange.Buffer pMemoryRanges) {
		return nvkFlushMappedMemoryRanges(device, pMemoryRanges.remaining(), pMemoryRanges.address());
	}

	/**
	 * Flush mapped memory ranges.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To flush ranges of non-coherent memory from the host caches, call:</p>
	 * 
	 * <pre><code>VkResult vkFlushMappedMemoryRanges(
    VkDevice                                    device,
    uint32_t                                    memoryRangeCount,
    const VkMappedMemoryRange*                  pMemoryRanges);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkFlushMappedMemoryRanges FlushMappedMemoryRanges} <b>must</b> be used to guarantee that host writes to non-coherent memory are visible to the device. It <b>must</b> be called after the host writes to non-coherent memory have completed and before command buffers that will read or write any of those memory locations are submitted to a queue.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pMemoryRanges} <b>must</b> be a pointer to an array of {@code memoryRangeCount} valid {@link VkMappedMemoryRange} structures</li>
	 * <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkMappedMemoryRange}</p>
	 *
	 * @param device the logical device that owns the memory ranges.
	 */
	public static int vkFlushMappedMemoryRanges(VkDevice device, VkMappedMemoryRange pMemoryRange) {
		return nvkFlushMappedMemoryRanges(device, 1, pMemoryRange.address());
	}

	// --- [ vkInvalidateMappedMemoryRanges ] ---

	/**
	 * Unsafe version of: {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges}
	 *
	 * @param memoryRangeCount the length of the {@code pMemoryRanges} array.
	 */
	public static int nvkInvalidateMappedMemoryRanges(VkDevice device, int memoryRangeCount, long pMemoryRanges) {
		long __functionAddress = device.getCapabilities().vkInvalidateMappedMemoryRanges;
		return callPPI(__functionAddress, device.address(), memoryRangeCount, pMemoryRanges);
	}

	/**
	 * Invalidate ranges of mapped memory objects.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To invalidate ranges of non-coherent memory from the host caches, call:</p>
	 * 
	 * <pre><code>VkResult vkInvalidateMappedMemoryRanges(
    VkDevice                                    device,
    uint32_t                                    memoryRangeCount,
    const VkMappedMemoryRange*                  pMemoryRanges);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} <b>must</b> be used to guarantee that device writes to non-coherent memory are visible to the host. It <b>must</b> be called after command buffers that execute and flush (via memory barriers) the device writes have completed, and before the host will read or write any of those locations. If a range of non-coherent memory is written by the host and then invalidated without first being flushed, its contents are undefined.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pMemoryRanges} <b>must</b> be a pointer to an array of {@code memoryRangeCount} valid {@link VkMappedMemoryRange} structures</li>
	 * <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkMappedMemoryRange}</p>
	 *
	 * @param device        the logical device that owns the memory ranges.
	 * @param pMemoryRanges a pointer to an array of {@link VkMappedMemoryRange} structures describing the memory ranges to invalidate.
	 */
	public static int vkInvalidateMappedMemoryRanges(VkDevice device, VkMappedMemoryRange.Buffer pMemoryRanges) {
		return nvkInvalidateMappedMemoryRanges(device, pMemoryRanges.remaining(), pMemoryRanges.address());
	}

	/**
	 * Invalidate ranges of mapped memory objects.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To invalidate ranges of non-coherent memory from the host caches, call:</p>
	 * 
	 * <pre><code>VkResult vkInvalidateMappedMemoryRanges(
    VkDevice                                    device,
    uint32_t                                    memoryRangeCount,
    const VkMappedMemoryRange*                  pMemoryRanges);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} <b>must</b> be used to guarantee that device writes to non-coherent memory are visible to the host. It <b>must</b> be called after command buffers that execute and flush (via memory barriers) the device writes have completed, and before the host will read or write any of those locations. If a range of non-coherent memory is written by the host and then invalidated without first being flushed, its contents are undefined.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pMemoryRanges} <b>must</b> be a pointer to an array of {@code memoryRangeCount} valid {@link VkMappedMemoryRange} structures</li>
	 * <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkMappedMemoryRange}</p>
	 *
	 * @param device the logical device that owns the memory ranges.
	 */
	public static int vkInvalidateMappedMemoryRanges(VkDevice device, VkMappedMemoryRange pMemoryRange) {
		return nvkInvalidateMappedMemoryRanges(device, 1, pMemoryRange.address());
	}

	// --- [ vkGetDeviceMemoryCommitment ] ---

	/** Unsafe version of: {@link #vkGetDeviceMemoryCommitment GetDeviceMemoryCommitment} */
	public static void nvkGetDeviceMemoryCommitment(VkDevice device, long memory, long pCommittedMemoryInBytes) {
		long __functionAddress = device.getCapabilities().vkGetDeviceMemoryCommitment;
		callPJPV(__functionAddress, device.address(), memory, pCommittedMemoryInBytes);
	}

	/**
	 * Query the current commitment for a VkDeviceMemory.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To determine the amount of lazily-allocated memory that is currently committed for a memory object, call:</p>
	 * 
	 * <pre><code>void vkGetDeviceMemoryCommitment(
    VkDevice                                    device,
    VkDeviceMemory                              memory,
    VkDeviceSize*                               pCommittedMemoryInBytes);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The implementation <b>may</b> update the commitment at any time, and the value returned by this query <b>may</b> be out of date.</p>
	 * 
	 * <p>The implementation guarantees to allocate any committed memory from the heapIndex indicated by the memory type that the memory object was created with.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code memory} <b>must</b> have been created with a memory type that reports {@link #VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code pCommittedMemoryInBytes} <b>must</b> be a pointer to a {@code VkDeviceSize} value</li>
	 * <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 *
	 * @param device                  the logical device that owns the memory.
	 * @param memory                  the memory object being queried.
	 * @param pCommittedMemoryInBytes a pointer to a {@code VkDeviceSize} value in which the number of bytes currently committed is returned, on success.
	 */
	public static void vkGetDeviceMemoryCommitment(VkDevice device, long memory, LongBuffer pCommittedMemoryInBytes) {
		if ( CHECKS )
			checkBuffer(pCommittedMemoryInBytes, 1);
		nvkGetDeviceMemoryCommitment(device, memory, memAddress(pCommittedMemoryInBytes));
	}

	// --- [ vkBindBufferMemory ] ---

	/**
	 * Bind device memory to a buffer object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To attach memory to a buffer object, call:</p>
	 * 
	 * <pre><code>VkResult vkBindBufferMemory(
    VkDevice                                    device,
    VkBuffer                                    buffer,
    VkDeviceMemory                              memory,
    VkDeviceSize                                memoryOffset);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code buffer} <b>must</b> not already be backed by a memory object</li>
	 * <li>{@code buffer} <b>must</b> not have been created with any sparse memory binding flags</li>
	 * <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
	 * <li>If {@code buffer} was created with the {@link #VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT} or {@link #VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT}, {@code memoryOffset} <b>must</b> be a multiple of {@link VkPhysicalDeviceLimits}{@code ::minTexelBufferOffsetAlignment}</li>
	 * <li>If {@code buffer} was created with the {@link #VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT BUFFER_USAGE_UNIFORM_BUFFER_BIT}, {@code memoryOffset} <b>must</b> be a multiple of {@link VkPhysicalDeviceLimits}{@code ::minUniformBufferOffsetAlignment}</li>
	 * <li>If {@code buffer} was created with the {@link #VK_BUFFER_USAGE_STORAGE_BUFFER_BIT BUFFER_USAGE_STORAGE_BUFFER_BIT}, {@code memoryOffset} <b>must</b> be a multiple of {@link VkPhysicalDeviceLimits}{@code ::minStorageBufferOffsetAlignment}</li>
	 * <li>{@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the {@link VkMemoryRequirements} structure returned from a call to {@link #vkGetBufferMemoryRequirements GetBufferMemoryRequirements} with {@code buffer}</li>
	 * <li>{@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the {@link VkMemoryRequirements} structure returned from a call to {@link #vkGetBufferMemoryRequirements GetBufferMemoryRequirements} with {@code buffer}</li>
	 * <li>The {@code size} member of the {@link VkMemoryRequirements} structure returned from a call to {@link #vkGetBufferMemoryRequirements GetBufferMemoryRequirements} with {@code buffer} <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
	 * <li>If {@code buffer} was created with {@link VkDedicatedAllocationBufferCreateInfoNV}{@code ::dedicatedAllocation} equal to {@link #VK_TRUE TRUE}, {@code memory} <b>must</b> have been created with {@link VkDedicatedAllocationMemoryAllocateInfoNV}{@code ::buffer} equal to {@code buffer} and {@code memoryOffset} <b>must</b> be zero</li>
	 * <li>If {@code buffer} was not created with {@link VkDedicatedAllocationBufferCreateInfoNV}{@code ::dedicatedAllocation} equal to {@link #VK_TRUE TRUE}, {@code memory} <b>must</b> not have been allocated dedicated for a specific buffer or image</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code buffer} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code buffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device       the logical device that owns the buffer and memory.
	 * @param buffer       the buffer.
	 * @param memory       a {@code VkDeviceMemory} object describing the device memory to attach.
	 * @param memoryOffset the start offset of the region of {@code memory} which is to be bound to the buffer. The number of bytes returned in the {@link VkMemoryRequirements}{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified buffer.
	 */
	public static int vkBindBufferMemory(VkDevice device, long buffer, long memory, long memoryOffset) {
		long __functionAddress = device.getCapabilities().vkBindBufferMemory;
		return callPJJJI(__functionAddress, device.address(), buffer, memory, memoryOffset);
	}

	// --- [ vkBindImageMemory ] ---

	/**
	 * Bind device memory to an image object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To attach memory to an image object, call:</p>
	 * 
	 * <pre><code>VkResult vkBindImageMemory(
    VkDevice                                    device,
    VkImage                                     image,
    VkDeviceMemory                              memory,
    VkDeviceSize                                memoryOffset);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code image} <b>must</b> not already be backed by a memory object</li>
	 * <li>{@code image} <b>must</b> not have been created with any sparse memory binding flags</li>
	 * <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
	 * <li>{@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the {@link VkMemoryRequirements} structure returned from a call to {@link #vkGetImageMemoryRequirements GetImageMemoryRequirements} with {@code image}</li>
	 * <li>{@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the {@link VkMemoryRequirements} structure returned from a call to {@link #vkGetImageMemoryRequirements GetImageMemoryRequirements} with {@code image}</li>
	 * <li>The {@code size} member of the {@link VkMemoryRequirements} structure returned from a call to {@link #vkGetImageMemoryRequirements GetImageMemoryRequirements} with {@code image} <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
	 * <li>If {@code image} was created with {@link VkDedicatedAllocationImageCreateInfoNV}{@code ::dedicatedAllocation} equal to {@link #VK_TRUE TRUE}, {@code memory} <b>must</b> have been created with {@link VkDedicatedAllocationMemoryAllocateInfoNV}{@code ::image} equal to {@code image} and {@code memoryOffset} <b>must</b> be zero</li>
	 * <li>If {@code image} was not created with {@link VkDedicatedAllocationImageCreateInfoNV}{@code ::dedicatedAllocation} equal to {@link #VK_TRUE TRUE}, {@code memory} <b>must</b> not have been allocated dedicated for a specific buffer or image</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code image} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device       the logical device that owns the image and memory.
	 * @param image        the image.
	 * @param memory       the a {@code VkDeviceMemory} object describing the device memory to attach.
	 * @param memoryOffset the start offset of the region of {@code memory} which is to be bound to the image. The number of bytes returned in the {@link VkMemoryRequirements}{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified image.
	 */
	public static int vkBindImageMemory(VkDevice device, long image, long memory, long memoryOffset) {
		long __functionAddress = device.getCapabilities().vkBindImageMemory;
		return callPJJJI(__functionAddress, device.address(), image, memory, memoryOffset);
	}

	// --- [ vkGetBufferMemoryRequirements ] ---

	/** Unsafe version of: {@link #vkGetBufferMemoryRequirements GetBufferMemoryRequirements} */
	public static void nvkGetBufferMemoryRequirements(VkDevice device, long buffer, long pMemoryRequirements) {
		long __functionAddress = device.getCapabilities().vkGetBufferMemoryRequirements;
		callPJPV(__functionAddress, device.address(), buffer, pMemoryRequirements);
	}

	/**
	 * Returns the memory requirements for specified Vulkan object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To determine the memory requirements for a buffer resource, call:</p>
	 * 
	 * <pre><code>void vkGetBufferMemoryRequirements(
    VkDevice                                    device,
    VkBuffer                                    buffer,
    VkMemoryRequirements*                       pMemoryRequirements);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pMemoryRequirements} <b>must</b> be a pointer to a {@link VkMemoryRequirements} structure</li>
	 * <li>{@code buffer} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkMemoryRequirements}</p>
	 *
	 * @param device              the logical device that owns the buffer.
	 * @param buffer              the buffer to query.
	 * @param pMemoryRequirements points to an instance of the {@link VkMemoryRequirements} structure in which the memory requirements of the buffer object are returned.
	 */
	public static void vkGetBufferMemoryRequirements(VkDevice device, long buffer, VkMemoryRequirements pMemoryRequirements) {
		nvkGetBufferMemoryRequirements(device, buffer, pMemoryRequirements.address());
	}

	// --- [ vkGetImageMemoryRequirements ] ---

	/** Unsafe version of: {@link #vkGetImageMemoryRequirements GetImageMemoryRequirements} */
	public static void nvkGetImageMemoryRequirements(VkDevice device, long image, long pMemoryRequirements) {
		long __functionAddress = device.getCapabilities().vkGetImageMemoryRequirements;
		callPJPV(__functionAddress, device.address(), image, pMemoryRequirements);
	}

	/**
	 * Returns the memory requirements for specified Vulkan object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To determine the memory requirements for an image resource, call:</p>
	 * 
	 * <pre><code>void vkGetImageMemoryRequirements(
    VkDevice                                    device,
    VkImage                                     image,
    VkMemoryRequirements*                       pMemoryRequirements);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code pMemoryRequirements} <b>must</b> be a pointer to a {@link VkMemoryRequirements} structure</li>
	 * <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkMemoryRequirements}</p>
	 *
	 * @param device              the logical device that owns the image.
	 * @param image               the image to query.
	 * @param pMemoryRequirements points to an instance of the {@link VkMemoryRequirements} structure in which the memory requirements of the image object are returned.
	 */
	public static void vkGetImageMemoryRequirements(VkDevice device, long image, VkMemoryRequirements pMemoryRequirements) {
		nvkGetImageMemoryRequirements(device, image, pMemoryRequirements.address());
	}

	// --- [ vkGetImageSparseMemoryRequirements ] ---

	/**
	 * Unsafe version of: {@link #vkGetImageSparseMemoryRequirements GetImageSparseMemoryRequirements}
	 *
	 * @param pSparseMemoryRequirementCount a pointer to an integer related to the number of sparse memory requirements available or queried, as described below.
	 */
	public static void nvkGetImageSparseMemoryRequirements(VkDevice device, long image, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
		long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements;
		callPJPPV(__functionAddress, device.address(), image, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
	}

	/**
	 * Query the memory requirements for a sparse image.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query sparse memory requirements for an image, call:</p>
	 * 
	 * <pre><code>void vkGetImageSparseMemoryRequirements(
    VkDevice                                    device,
    VkImage                                     image,
    uint32_t*                                   pSparseMemoryRequirementCount,
    VkSparseImageMemoryRequirements*            pSparseMemoryRequirements);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If {@code pSparseMemoryRequirements} is {@code NULL}, then the number of sparse memory requirements available is returned in {@code pSparseMemoryRequirementCount}. Otherwise, {@code pSparseMemoryRequirementCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSparseMemoryRequirements} array, and on return the variable is overwritten with the number of structures actually written to {@code pSparseMemoryRequirements}. If {@code pSparseMemoryRequirementCount} is less than the number of sparse memory requirements available, at most {@code pSparseMemoryRequirementCount} structures will be written.</p>
	 * 
	 * <p>If the image was not created with {@link #VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} then {@code pSparseMemoryRequirementCount} will be set to zero and {@code pSparseMemoryRequirements} will not be written to.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>It is legal for an implementation to report a larger value in {@link VkMemoryRequirements}{@code ::size} than would be obtained by adding together memory sizes for all {@link VkSparseImageMemoryRequirements} returned by {@link #vkGetImageSparseMemoryRequirements GetImageSparseMemoryRequirements}. This <b>may</b> occur when the hardware requires unused padding in the address range describing the resource.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code pSparseMemoryRequirementCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pSparseMemoryRequirementCount} is not 0, and {@code pSparseMemoryRequirements} is not {@code NULL}, {@code pSparseMemoryRequirements} <b>must</b> be a pointer to an array of {@code pSparseMemoryRequirementCount} {@link VkSparseImageMemoryRequirements} structures</li>
	 * <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkSparseImageMemoryRequirements}</p>
	 *
	 * @param device                        the logical device that owns the image.
	 * @param image                         the {@code VkImage} object to get the memory requirements for.
	 * @param pSparseMemoryRequirementCount a pointer to an integer related to the number of sparse memory requirements available or queried, as described below.
	 * @param pSparseMemoryRequirements     either {@code NULL} or a pointer to an array of {@link VkSparseImageMemoryRequirements} structures.
	 */
	public static void vkGetImageSparseMemoryRequirements(VkDevice device, long image, IntBuffer pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements.Buffer pSparseMemoryRequirements) {
		if ( CHECKS ) {
			checkBuffer(pSparseMemoryRequirementCount, 1);
			checkBufferSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
		}
		nvkGetImageSparseMemoryRequirements(device, image, memAddress(pSparseMemoryRequirementCount), memAddressSafe(pSparseMemoryRequirements));
	}

	// --- [ vkGetPhysicalDeviceSparseImageFormatProperties ] ---

	/**
	 * Unsafe version of: {@link #vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties}
	 *
	 * @param pPropertyCount a pointer to an integer related to the number of sparse format properties available or queried, as described below.
	 */
	public static void nvkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, long pPropertyCount, long pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties;
		callPPPV(__functionAddress, physicalDevice.address(), format, type, samples, usage, tiling, pPropertyCount, pProperties);
	}

	/**
	 * Retrieve properties of an image format applied to sparse images.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>{@link #vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties} returns an array of {@link VkSparseImageFormatProperties}. Each element will describe properties for one set of image aspects that are bound simultaneously in the image. This is usually one element for each aspect in the image, but for interleaved depth/stencil images there is only one element describing the combined aspects.</p>
	 * 
	 * <pre><code>void vkGetPhysicalDeviceSparseImageFormatProperties(
    VkPhysicalDevice                            physicalDevice,
    VkFormat                                    format,
    VkImageType                                 type,
    VkSampleCountFlagBits                       samples,
    VkImageUsageFlags                           usage,
    VkImageTiling                               tiling,
    uint32_t*                                   pPropertyCount,
    VkSparseImageFormatProperties*              pProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of sparse format properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of sparse format properties available, at most {@code pPropertyCount} structures will be written.</p>
	 * 
	 * <p>If {@link #VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} is not supported for the given arguments, {@code pPropertyCount} will be set to zero upon return, and no data will be written to {@code pProperties}.</p>
	 * 
	 * <p>Multiple aspects are returned for depth/stencil images that are implemented as separate planes by the implementation. The depth and stencil data planes each have unique {@link VkSparseImageFormatProperties} data.</p>
	 * 
	 * <p>Depth/stencil images with depth and stencil data interleaved into a single plane will return a single {@link VkSparseImageFormatProperties} structure with the {@code aspectMask} set to {@link #VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} | {@link #VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code samples} <b>must</b> be a bit value that is set in {@link VkImageFormatProperties}{@code ::sampleCounts} returned by {@link #vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code type}, {@code tiling}, and {@code usage} equal to those in this command and {@code flags} equal to the value that is set in {@link VkImageCreateInfo}{@code ::flags} when the image is created</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
	 * <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
	 * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
	 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
	 * <li>{@code usage} <b>must</b> not be 0</li>
	 * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} {@link VkSparseImageFormatProperties} structures</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkSparseImageFormatProperties}</p>
	 *
	 * @param physicalDevice the physical device from which to query the sparse image capabilities.
	 * @param format         the image format.
	 * @param type           the dimensionality of image.
	 * @param samples        the number of samples per pixel as defined in {@code VkSampleCountFlagBits}.
	 * @param usage          a bitmask describing the intended usage of the image.
	 * @param tiling         the tiling arrangement of the data elements in memory.
	 * @param pPropertyCount a pointer to an integer related to the number of sparse format properties available or queried, as described below.
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkSparseImageFormatProperties} structures.
	 */
	public static void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, IntBuffer pPropertyCount, VkSparseImageFormatProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		nvkGetPhysicalDeviceSparseImageFormatProperties(physicalDevice, format, type, samples, usage, tiling, memAddress(pPropertyCount), memAddressSafe(pProperties));
	}

	// --- [ vkQueueBindSparse ] ---

	/**
	 * Unsafe version of: {@link #vkQueueBindSparse QueueBindSparse}
	 *
	 * @param bindInfoCount the number of elements in the {@code pBindInfo} array.
	 */
	public static int nvkQueueBindSparse(VkQueue queue, int bindInfoCount, long pBindInfo, long fence) {
		long __functionAddress = queue.getCapabilities().vkQueueBindSparse;
		if ( CHECKS )
			if ( pBindInfo != NULL ) VkBindSparseInfo.validate(pBindInfo, bindInfoCount);
		return callPPJI(__functionAddress, queue.address(), bindInfoCount, pBindInfo, fence);
	}

	/**
	 * Bind device memory to a sparse resource object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To submit sparse binding operations to a queue, call:</p>
	 * 
	 * <pre><code>VkResult vkQueueBindSparse(
    VkQueue                                     queue,
    uint32_t                                    bindInfoCount,
    const VkBindSparseInfo*                     pBindInfo,
    VkFence                                     fence);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkQueueBindSparse QueueBindSparse} is a <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#devsandqueues-submission">queue submission command</a>, with each batch defined by an element of {@code pBindInfo} as an instance of the {@link VkBindSparseInfo} structure.</p>
	 * 
	 * <p>Within a batch, a given range of a resource <b>must</b> not be bound more than once. Across batches, if a range is to be bound to one allocation and offset and then to another allocation and offset, then the application <b>must</b> guarantee (usually using semaphores) that the binding operations are executed in the correct order, as well as to order binding operations against the execution of command buffer submissions.</p>
	 * 
	 * <p>As no operation to {@link #vkQueueBindSparse QueueBindSparse} causes any pipeline stage to access memory, synchronization primitives used in this command effectively only define execution dependencies.</p>
	 * 
	 * <p>Additional information about fence and semaphore operation is described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization"> the synchronization chapter</a>.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code fence} <b>must</b> be unsignaled</li>
	 * <li>{@code fence} <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * <li>If {@code bindInfoCount} is not 0, {@code pBindInfo} <b>must</b> be a pointer to an array of {@code bindInfoCount} valid {@link VkBindSparseInfo} structures</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>The {@code queue} <b>must</b> support sparse binding operations</li>
	 * <li>Both of {@code fence}, and {@code queue} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pBindInfo}[].pWaitSemaphores[] <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pBindInfo}[].pSignalSemaphores[] <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pBindInfo}[].pBufferBinds[].buffer <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pBindInfo}[].pImageOpaqueBinds[].image <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pBindInfo}[].pImageBinds[].image <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>-</td><td>-</td><td>SPARSE_BINDING</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkBindSparseInfo}</p>
	 *
	 * @param queue     the queue that the sparse binding operations will be submitted to.
	 * @param pBindInfo an array of {@link VkBindSparseInfo} structures, each specifying a sparse binding submission batch.
	 * @param fence     an optional handle to a fence to be signaled. If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, it defines a <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-fences-signaling">fence signal operation</a>.
	 */
	public static int vkQueueBindSparse(VkQueue queue, VkBindSparseInfo.Buffer pBindInfo, long fence) {
		return nvkQueueBindSparse(queue, remainingSafe(pBindInfo), memAddressSafe(pBindInfo), fence);
	}

	/**
	 * Bind device memory to a sparse resource object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To submit sparse binding operations to a queue, call:</p>
	 * 
	 * <pre><code>VkResult vkQueueBindSparse(
    VkQueue                                     queue,
    uint32_t                                    bindInfoCount,
    const VkBindSparseInfo*                     pBindInfo,
    VkFence                                     fence);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkQueueBindSparse QueueBindSparse} is a <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#devsandqueues-submission">queue submission command</a>, with each batch defined by an element of {@code pBindInfo} as an instance of the {@link VkBindSparseInfo} structure.</p>
	 * 
	 * <p>Within a batch, a given range of a resource <b>must</b> not be bound more than once. Across batches, if a range is to be bound to one allocation and offset and then to another allocation and offset, then the application <b>must</b> guarantee (usually using semaphores) that the binding operations are executed in the correct order, as well as to order binding operations against the execution of command buffer submissions.</p>
	 * 
	 * <p>As no operation to {@link #vkQueueBindSparse QueueBindSparse} causes any pipeline stage to access memory, synchronization primitives used in this command effectively only define execution dependencies.</p>
	 * 
	 * <p>Additional information about fence and semaphore operation is described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization"> the synchronization chapter</a>.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code fence} <b>must</b> be unsignaled</li>
	 * <li>{@code fence} <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * <li>If {@code bindInfoCount} is not 0, {@code pBindInfo} <b>must</b> be a pointer to an array of {@code bindInfoCount} valid {@link VkBindSparseInfo} structures</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>The {@code queue} <b>must</b> support sparse binding operations</li>
	 * <li>Both of {@code fence}, and {@code queue} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pBindInfo}[].pWaitSemaphores[] <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pBindInfo}[].pSignalSemaphores[] <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pBindInfo}[].pBufferBinds[].buffer <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pBindInfo}[].pImageOpaqueBinds[].image <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pBindInfo}[].pImageBinds[].image <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>-</td><td>-</td><td>SPARSE_BINDING</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkBindSparseInfo}</p>
	 *
	 * @param queue     the queue that the sparse binding operations will be submitted to.
	 * @param pBindInfo an array of {@link VkBindSparseInfo} structures, each specifying a sparse binding submission batch.
	 * @param fence     an optional handle to a fence to be signaled. If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, it defines a <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-fences-signaling">fence signal operation</a>.
	 */
	public static int vkQueueBindSparse(VkQueue queue, VkBindSparseInfo pBindInfo, long fence) {
		return nvkQueueBindSparse(queue, 1, pBindInfo.address(), fence);
	}

	// --- [ vkCreateFence ] ---

	/** Unsafe version of: {@link #vkCreateFence CreateFence} */
	public static int nvkCreateFence(VkDevice device, long pCreateInfo, long pAllocator, long pFence) {
		long __functionAddress = device.getCapabilities().vkCreateFence;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pFence);
	}

	/**
	 * Create a new fence object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a new fence object, use the command</p>
	 * 
	 * <pre><code>VkResult vkCreateFence(
    VkDevice                                    device,
    const VkFenceCreateInfo*                    pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkFence*                                    pFence);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkFenceCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pFence} <b>must</b> be a pointer to a {@code VkFence} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkFenceCreateInfo}</p>
	 *
	 * @param device      the logical device that creates the fence.
	 * @param pCreateInfo points to a {@link VkFenceCreateInfo} structure specifying the state of the fence object.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pFence      points to a handle in which the resulting fence object is returned.
	 */
	public static int vkCreateFence(VkDevice device, VkFenceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pFence) {
		if ( CHECKS )
			checkBuffer(pFence, 1);
		return nvkCreateFence(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pFence));
	}

	// --- [ vkDestroyFence ] ---

	/** Unsafe version of: {@link #vkDestroyFence DestroyFence} */
	public static void nvkDestroyFence(VkDevice device, long fence, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyFence;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), fence, pAllocator);
	}

	/**
	 * Destroy a fence object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a fence, call:</p>
	 * 
	 * <pre><code>void vkDestroyFence(
    VkDevice                                    device,
    VkFence                                     fence,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code fence} <b>must</b> not be associated with any queue command that has not yet completed execution on that queue</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code fence} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code fence} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code fence} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the logical device that destroys the fence.
	 * @param fence      the handle of the fence to destroy.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyFence(VkDevice device, long fence, VkAllocationCallbacks pAllocator) {
		nvkDestroyFence(device, fence, memAddressSafe(pAllocator));
	}

	// --- [ vkResetFences ] ---

	/**
	 * Unsafe version of: {@link #vkResetFences ResetFences}
	 *
	 * @param fenceCount the number of fences to reset.
	 */
	public static int nvkResetFences(VkDevice device, int fenceCount, long pFences) {
		long __functionAddress = device.getCapabilities().vkResetFences;
		return callPPI(__functionAddress, device.address(), fenceCount, pFences);
	}

	/**
	 * Resets one or more fence objects.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To reset the status of one or more fences to the unsignaled state, use the command:</p>
	 * 
	 * <pre><code>VkResult vkResetFences(
    VkDevice                                    device,
    uint32_t                                    fenceCount,
    const VkFence*                              pFences);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If a fence is already in the unsignaled state, then resetting it has no effect.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>Any given element of {@code pFences} <b>must</b> not currently be associated with any queue command that has not yet completed execution on that queue</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pFences} <b>must</b> be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
	 * <li>{@code fenceCount} <b>must</b> be greater than 0</li>
	 * <li>Each element of {@code pFences} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to each member of {@code pFences} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device  the logical device that owns the fences.
	 * @param pFences a pointer to an array of {@code fenceCount} fence handles to reset.
	 */
	public static int vkResetFences(VkDevice device, LongBuffer pFences) {
		return nvkResetFences(device, pFences.remaining(), memAddress(pFences));
	}

	/**
	 * Resets one or more fence objects.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To reset the status of one or more fences to the unsignaled state, use the command:</p>
	 * 
	 * <pre><code>VkResult vkResetFences(
    VkDevice                                    device,
    uint32_t                                    fenceCount,
    const VkFence*                              pFences);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If a fence is already in the unsignaled state, then resetting it has no effect.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>Any given element of {@code pFences} <b>must</b> not currently be associated with any queue command that has not yet completed execution on that queue</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pFences} <b>must</b> be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
	 * <li>{@code fenceCount} <b>must</b> be greater than 0</li>
	 * <li>Each element of {@code pFences} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to each member of {@code pFences} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device the logical device that owns the fences.
	 */
	public static int vkResetFences(VkDevice device, long pFence) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer pFences = stack.longs(pFence);
			return nvkResetFences(device, 1, memAddress(pFences));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ vkGetFenceStatus ] ---

	/**
	 * Return the status of a fence.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query the status of a fence from the host, use the command</p>
	 * 
	 * <pre><code>VkResult vkGetFenceStatus(
    VkDevice                                    device,
    VkFence                                     fence);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Upon success, {@link #vkGetFenceStatus GetFenceStatus} returns the status of the fence, which is one of:</p>
	 * 
	 * <ul>
	 * <li>{@link #VK_SUCCESS SUCCESS} indicates that the fence is signaled.</li>
	 * <li>{@link #VK_NOT_READY NOT_READY} indicates that the fence is unsignaled.</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>{@code fence} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_NOT_READY NOT_READY}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device the logical device that owns the fence.
	 * @param fence  the handle of the fence to query.
	 */
	public static int vkGetFenceStatus(VkDevice device, long fence) {
		long __functionAddress = device.getCapabilities().vkGetFenceStatus;
		return callPJI(__functionAddress, device.address(), fence);
	}

	// --- [ vkWaitForFences ] ---

	/**
	 * Unsafe version of: {@link #vkWaitForFences WaitForFences}
	 *
	 * @param fenceCount the number of fences to wait on.
	 */
	public static int nvkWaitForFences(VkDevice device, int fenceCount, long pFences, int waitAll, long timeout) {
		long __functionAddress = device.getCapabilities().vkWaitForFences;
		return callPPJI(__functionAddress, device.address(), fenceCount, pFences, waitAll, timeout);
	}

	/**
	 * Wait for one or more fences to become signaled.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To cause the host to wait until any one or all of a group of fences is signaled, use the command:</p>
	 * 
	 * <pre><code>VkResult vkWaitForFences(
    VkDevice                                    device,
    uint32_t                                    fenceCount,
    const VkFence*                              pFences,
    VkBool32                                    waitAll,
    uint64_t                                    timeout);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If the condition is satisfied when {@link #vkWaitForFences WaitForFences} is called, then {@link #vkWaitForFences WaitForFences} returns immediately. If the condition is not satisfied at the time {@link #vkWaitForFences WaitForFences} is called, then {@link #vkWaitForFences WaitForFences} will block and wait up to {@code timeout} nanoseconds for the condition to become satisfied.</p>
	 * 
	 * <p>If {@code timeout} is zero, then {@link #vkWaitForFences WaitForFences} does not wait, but simply returns the current state of the fences. {@link #VK_TIMEOUT TIMEOUT} will be returned in this case if the condition is not satisfied, even though no actual wait was performed.</p>
	 * 
	 * <p>If the specified timeout period expires before the condition is satisfied, {@link #vkWaitForFences WaitForFences} returns {@link #VK_TIMEOUT TIMEOUT}. If the condition is satisfied before {@code timeout} nanoseconds has expired, {@link #vkWaitForFences WaitForFences} returns {@link #VK_SUCCESS SUCCESS}.</p>
	 * 
	 * <p>{@link #vkWaitForFences WaitForFences} defines the second half of a memory dependency with the host, for each fence being waited on. The memory dependency defined by signaling a fence and waiting on the host does not guarantee that the results of memory accesses will be visible to the host, or that the memory is available. To provide that guarantee, the application <b>must</b> insert a memory barrier between the device writes and the end of the submission that will signal the fence, with {@code dstAccessMask} having the {@link #VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT} bit set, with {@code dstStageMask} having the {@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT} bit set, and with the appropriate {@code srcStageMask} and {@code srcAccessMask} members set to guarantee completion of the writes. If the memory was allocated without the {@link #VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT} set, then {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} <b>must</b> be called after the fence is signaled in order to ensure the writes are visible to the host, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-device-hostaccess">Host Access to Device Memory Objects</a>.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pFences} <b>must</b> be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
	 * <li>{@code fenceCount} <b>must</b> be greater than 0</li>
	 * <li>Each element of {@code pFences} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_TIMEOUT TIMEOUT}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device  the logical device that owns the fences.
	 * @param pFences a pointer to an array of {@code fenceCount} fence handles.
	 * @param waitAll the condition that <b>must</b> be satisfied to successfully unblock the wait. If {@code waitAll} is {@link #VK_TRUE TRUE}, then the condition is that all fences in {@code pFences} are signaled. Otherwise, the condition is that at least one fence in {@code pFences} is signaled.
	 * @param timeout the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.
	 */
	public static int vkWaitForFences(VkDevice device, LongBuffer pFences, boolean waitAll, long timeout) {
		return nvkWaitForFences(device, pFences.remaining(), memAddress(pFences), waitAll ? 1 : 0, timeout);
	}

	/**
	 * Wait for one or more fences to become signaled.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To cause the host to wait until any one or all of a group of fences is signaled, use the command:</p>
	 * 
	 * <pre><code>VkResult vkWaitForFences(
    VkDevice                                    device,
    uint32_t                                    fenceCount,
    const VkFence*                              pFences,
    VkBool32                                    waitAll,
    uint64_t                                    timeout);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If the condition is satisfied when {@link #vkWaitForFences WaitForFences} is called, then {@link #vkWaitForFences WaitForFences} returns immediately. If the condition is not satisfied at the time {@link #vkWaitForFences WaitForFences} is called, then {@link #vkWaitForFences WaitForFences} will block and wait up to {@code timeout} nanoseconds for the condition to become satisfied.</p>
	 * 
	 * <p>If {@code timeout} is zero, then {@link #vkWaitForFences WaitForFences} does not wait, but simply returns the current state of the fences. {@link #VK_TIMEOUT TIMEOUT} will be returned in this case if the condition is not satisfied, even though no actual wait was performed.</p>
	 * 
	 * <p>If the specified timeout period expires before the condition is satisfied, {@link #vkWaitForFences WaitForFences} returns {@link #VK_TIMEOUT TIMEOUT}. If the condition is satisfied before {@code timeout} nanoseconds has expired, {@link #vkWaitForFences WaitForFences} returns {@link #VK_SUCCESS SUCCESS}.</p>
	 * 
	 * <p>{@link #vkWaitForFences WaitForFences} defines the second half of a memory dependency with the host, for each fence being waited on. The memory dependency defined by signaling a fence and waiting on the host does not guarantee that the results of memory accesses will be visible to the host, or that the memory is available. To provide that guarantee, the application <b>must</b> insert a memory barrier between the device writes and the end of the submission that will signal the fence, with {@code dstAccessMask} having the {@link #VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT} bit set, with {@code dstStageMask} having the {@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT} bit set, and with the appropriate {@code srcStageMask} and {@code srcAccessMask} members set to guarantee completion of the writes. If the memory was allocated without the {@link #VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT} set, then {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} <b>must</b> be called after the fence is signaled in order to ensure the writes are visible to the host, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-device-hostaccess">Host Access to Device Memory Objects</a>.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pFences} <b>must</b> be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
	 * <li>{@code fenceCount} <b>must</b> be greater than 0</li>
	 * <li>Each element of {@code pFences} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_TIMEOUT TIMEOUT}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device  the logical device that owns the fences.
	 * @param waitAll the condition that <b>must</b> be satisfied to successfully unblock the wait. If {@code waitAll} is {@link #VK_TRUE TRUE}, then the condition is that all fences in {@code pFences} are signaled. Otherwise, the condition is that at least one fence in {@code pFences} is signaled.
	 * @param timeout the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.
	 */
	public static int vkWaitForFences(VkDevice device, long pFence, boolean waitAll, long timeout) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer pFences = stack.longs(pFence);
			return nvkWaitForFences(device, 1, memAddress(pFences), waitAll ? 1 : 0, timeout);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ vkCreateSemaphore ] ---

	/** Unsafe version of: {@link #vkCreateSemaphore CreateSemaphore} */
	public static int nvkCreateSemaphore(VkDevice device, long pCreateInfo, long pAllocator, long pSemaphore) {
		long __functionAddress = device.getCapabilities().vkCreateSemaphore;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pSemaphore);
	}

	/**
	 * Create a new queue semaphore object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a new semaphore object, use the command</p>
	 * 
	 * <pre><code>VkResult vkCreateSemaphore(
    VkDevice                                    device,
    const VkSemaphoreCreateInfo*                pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkSemaphore*                                pSemaphore);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkSemaphoreCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSemaphore} <b>must</b> be a pointer to a {@code VkSemaphore} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkSemaphoreCreateInfo}</p>
	 *
	 * @param device      the logical device that creates the semaphore.
	 * @param pCreateInfo points to a {@link VkSemaphoreCreateInfo} structure specifying the state of the semaphore object.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pSemaphore  points to a handle in which the resulting semaphore object is returned. The semaphore is created in the unsignaled state.
	 */
	public static int vkCreateSemaphore(VkDevice device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSemaphore) {
		if ( CHECKS )
			checkBuffer(pSemaphore, 1);
		return nvkCreateSemaphore(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSemaphore));
	}

	// --- [ vkDestroySemaphore ] ---

	/** Unsafe version of: {@link #vkDestroySemaphore DestroySemaphore} */
	public static void nvkDestroySemaphore(VkDevice device, long semaphore, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroySemaphore;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), semaphore, pAllocator);
	}

	/**
	 * Destroy a semaphore object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a semaphore, call:</p>
	 * 
	 * <pre><code>void vkDestroySemaphore(
    VkDevice                                    device,
    VkSemaphore                                 semaphore,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code semaphore} <b>must</b> not be associated with any queue command that has not yet completed execution on that queue</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code semaphore} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code semaphore} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code semaphore} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code semaphore} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the logical device that destroys the semaphore.
	 * @param semaphore  the handle of the semaphore to destroy.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroySemaphore(VkDevice device, long semaphore, VkAllocationCallbacks pAllocator) {
		nvkDestroySemaphore(device, semaphore, memAddressSafe(pAllocator));
	}

	// --- [ vkCreateEvent ] ---

	/** Unsafe version of: {@link #vkCreateEvent CreateEvent} */
	public static int nvkCreateEvent(VkDevice device, long pCreateInfo, long pAllocator, long pEvent) {
		long __functionAddress = device.getCapabilities().vkCreateEvent;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pEvent);
	}

	/**
	 * Create a new event object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create an event, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateEvent(
    VkDevice                                    device,
    const VkEventCreateInfo*                    pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkEvent*                                    pEvent);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>When created, the event object is in the unsignaled state.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkEventCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pEvent} <b>must</b> be a pointer to a {@code VkEvent} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkEventCreateInfo}</p>
	 *
	 * @param device      the logical device that creates the event.
	 * @param pCreateInfo a pointer to an instance of the {@link VkEventCreateInfo} structure which contains information about how the event is to be created.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pEvent      points to a handle in which the resulting event object is returned.
	 */
	public static int vkCreateEvent(VkDevice device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pEvent) {
		if ( CHECKS )
			checkBuffer(pEvent, 1);
		return nvkCreateEvent(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pEvent));
	}

	// --- [ vkDestroyEvent ] ---

	/** Unsafe version of: {@link #vkDestroyEvent DestroyEvent} */
	public static void nvkDestroyEvent(VkDevice device, long event, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyEvent;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), event, pAllocator);
	}

	/**
	 * Destroy an event object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy an event, call:</p>
	 * 
	 * <pre><code>void vkDestroyEvent(
    VkDevice                                    device,
    VkEvent                                     event,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code event} <b>must</b> have completed execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code event} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code event} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code event} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code event} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code event} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the logical device that destroys the event.
	 * @param event      the handle of the event to destroy.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyEvent(VkDevice device, long event, VkAllocationCallbacks pAllocator) {
		nvkDestroyEvent(device, event, memAddressSafe(pAllocator));
	}

	// --- [ vkGetEventStatus ] ---

	/**
	 * Retrieve the status of an event object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query the state of an event from the host, call:</p>
	 * 
	 * <pre><code>VkResult vkGetEventStatus(
    VkDevice                                    device,
    VkEvent                                     event);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Upon success, {@link #vkGetEventStatus GetEventStatus} returns the state of the event object with the following return codes:</p>
	 * 
	 * <h6>Event Object Status Codes</h6>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Status</th><th>Meaning</th></tr></thead>
	 * <tbody>
	 * <tr><td>{@link #VK_EVENT_SET EVENT_SET}</td><td>The event specified by {@code event} is signaled.</td></tr>
	 * <tr><td>{@link #VK_EVENT_RESET EVENT_RESET}</td><td>The event specified by {@code event} is unsignaled.</td></tr>
	 * </tbody>
	 * </table>
	 * 
	 * <p>If a {@link #vkCmdSetEvent CmdSetEvent} or {@link #vkCmdResetEvent CmdResetEvent} command is pending execution, then the value returned by this command <b>may</b> immediately be out of date.</p>
	 * 
	 * <p>The state of an event <b>can</b> be updated by the host. The state of the event is immediately changed, and subsequent calls to {@link #vkGetEventStatus GetEventStatus} will return the new state. If an event is already in the requested state, then updating it to the same state has no effect.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
	 * <li>{@code event} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_EVENT_SET EVENT_SET}</li>
	 * <li>{@link #VK_EVENT_RESET EVENT_RESET}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device the logical device that owns the event.
	 * @param event  the handle of the event to query.
	 */
	public static int vkGetEventStatus(VkDevice device, long event) {
		long __functionAddress = device.getCapabilities().vkGetEventStatus;
		return callPJI(__functionAddress, device.address(), event);
	}

	// --- [ vkSetEvent ] ---

	/**
	 * Set an event to signaled state.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To set the state of an event to signaled from the host, call:</p>
	 * 
	 * <pre><code>VkResult vkSetEvent(
    VkDevice                                    device,
    VkEvent                                     event);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
	 * <li>{@code event} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code event} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device the logical device that owns the event.
	 * @param event  the event to set.
	 */
	public static int vkSetEvent(VkDevice device, long event) {
		long __functionAddress = device.getCapabilities().vkSetEvent;
		return callPJI(__functionAddress, device.address(), event);
	}

	// --- [ vkResetEvent ] ---

	/**
	 * Reset an event to non-signaled state.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To set the state of an event to unsignaled from the host, call:</p>
	 * 
	 * <pre><code>VkResult vkResetEvent(
    VkDevice                                    device,
    VkEvent                                     event);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code event} <b>must</b> not be waited on by a {@link #vkCmdWaitEvents CmdWaitEvents} command that is currently executing</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
	 * <li>{@code event} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code event} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device the logical device that owns the event.
	 * @param event  the event to reset.
	 */
	public static int vkResetEvent(VkDevice device, long event) {
		long __functionAddress = device.getCapabilities().vkResetEvent;
		return callPJI(__functionAddress, device.address(), event);
	}

	// --- [ vkCreateQueryPool ] ---

	/** Unsafe version of: {@link #vkCreateQueryPool CreateQueryPool} */
	public static int nvkCreateQueryPool(VkDevice device, long pCreateInfo, long pAllocator, long pQueryPool) {
		long __functionAddress = device.getCapabilities().vkCreateQueryPool;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pQueryPool);
	}

	/**
	 * Create a new query pool object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a query pool, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateQueryPool(
    VkDevice                                    device,
    const VkQueryPoolCreateInfo*                pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkQueryPool*                                pQueryPool);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkQueryPoolCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pQueryPool} <b>must</b> be a pointer to a {@code VkQueryPool} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkQueryPoolCreateInfo}</p>
	 *
	 * @param device      the logical device that creates the query pool.
	 * @param pCreateInfo a pointer to an instance of the {@link VkQueryPoolCreateInfo} structure containing the number and type of queries to be managed by the pool.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pQueryPool  a pointer to a {@code VkQueryPool} handle in which the resulting query pool object is returned.
	 */
	public static int vkCreateQueryPool(VkDevice device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pQueryPool) {
		if ( CHECKS )
			checkBuffer(pQueryPool, 1);
		return nvkCreateQueryPool(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pQueryPool));
	}

	// --- [ vkDestroyQueryPool ] ---

	/** Unsafe version of: {@link #vkDestroyQueryPool DestroyQueryPool} */
	public static void nvkDestroyQueryPool(VkDevice device, long queryPool, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyQueryPool;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), queryPool, pAllocator);
	}

	/**
	 * Destroy a query pool object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a query pool, call:</p>
	 * 
	 * <pre><code>void vkDestroyQueryPool(
    VkDevice                                    device,
    VkQueryPool                                 queryPool,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code queryPool} <b>must</b> have completed execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code queryPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code queryPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code queryPool} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code queryPool} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code queryPool} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the logical device that destroys the query pool.
	 * @param queryPool  the query pool to destroy.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyQueryPool(VkDevice device, long queryPool, VkAllocationCallbacks pAllocator) {
		nvkDestroyQueryPool(device, queryPool, memAddressSafe(pAllocator));
	}

	// --- [ vkGetQueryPoolResults ] ---

	/**
	 * Unsafe version of: {@link #vkGetQueryPoolResults GetQueryPoolResults}
	 *
	 * @param dataSize the size in bytes of the buffer pointed to by {@code pData}.
	 */
	public static int nvkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, long dataSize, long pData, long stride, int flags) {
		long __functionAddress = device.getCapabilities().vkGetQueryPoolResults;
		return callPJPPJI(__functionAddress, device.address(), queryPool, firstQuery, queryCount, dataSize, pData, stride, flags);
	}

	/**
	 * Copy results of queries in a query pool to a host memory region.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To retrieve status and results for a set of queries, call:</p>
	 * 
	 * <pre><code>VkResult vkGetQueryPoolResults(
    VkDevice                                    device,
    VkQueryPool                                 queryPool,
    uint32_t                                    firstQuery,
    uint32_t                                    queryCount,
    size_t                                      dataSize,
    void*                                       pData,
    VkDeviceSize                                stride,
    VkQueryResultFlags                          flags);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If no bits are set in {@code flags}, and all requested queries are in the available state, results are written as an array of 32-bit unsigned integer values. The behavior when not all queries are available, is described <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-wait-bit-not-set"> below</a>.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is not set and the result overflows a 32-bit value, the value <b>may</b> either wrap or saturate. Similarly, if {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is set and the result overflows a 64-bit value, the value <b>may</b> either wrap or saturate.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is set, Vulkan will wait for each query to be in the available state before retrieving the numerical results for that query. In this case, {@link #vkGetQueryPoolResults GetQueryPoolResults} is guaranteed to succeed and return {@link #VK_SUCCESS SUCCESS} if the queries become available in a finite time (i.e. if they have been issued and not reset). If queries will never finish (e.g. due to being reset but not issued), then {@link #vkGetQueryPoolResults GetQueryPoolResults} <b>may</b> not return in finite time.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} and {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} are both not set then no result values are written to {@code pData} for queries that are in the unavailable state at the time of the call, and {@link #vkGetQueryPoolResults GetQueryPoolResults} returns {@link #VK_NOT_READY NOT_READY}. However, availability state is still written to {@code pData} for those queries if {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is set.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>must</b> take care to ensure that use of the {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} bit has the desired effect.</p>
	 * 
	 * <p>For example, if a query has been used previously and a command buffer records the commands {@link #vkCmdResetQueryPool CmdResetQueryPool}, {@link #vkCmdBeginQuery CmdBeginQuery}, and {@link #vkCmdEndQuery CmdEndQuery} for that query, then the query will remain in the available state until the {@link #vkCmdResetQueryPool CmdResetQueryPool} command executes on a queue. Applications <b>can</b> use fences or events to ensure that a query has already been reset before checking for its results or availability status. Otherwise, a stale value could be returned from a previous use of the query.</p>
	 * 
	 * <p>The above also applies when {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is used in combination with {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT}. In this case, the returned availability status <b>may</b> reflect the result of a previous use of the query unless the {@link #vkCmdResetQueryPool CmdResetQueryPool} command has been executed since the last use of the query.</p>
	 * </div>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>can</b> double-buffer query pool usage, with a pool per frame, and reset queries at the end of the frame in which they are read.</p>
	 * </div>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} is set, {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is not set, and the query's status is unavailable, an intermediate result value between zero and the final result value is written to {@code pData} for that query.</p>
	 * 
	 * <p>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} <b>must</b> not be used if the pool's {@code queryType} is {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is set, the final integer value written for each query is non-zero if the query's status was available or zero if the status was unavailable. When {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is used, implementations <b>must</b> guarantee that if they return a non-zero availability value then the numerical results <b>must</b> be valid, assuming the results are not reset by a subsequent command.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Satisfying this guarantee <b>may</b> require careful ordering by the application, e.g. to read the availability status before reading the results.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is not set in {@code flags} then {@code pData} and {@code stride} <b>must</b> be multiples of 4</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is set in {@code flags} then {@code pData} and {@code stride} <b>must</b> be multiples of 8</li>
	 * <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
	 * <li>{@code dataSize} <b>must</b> be large enough to contain the result of each query, as described <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-memorylayout">here</a></li>
	 * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}, {@code flags} <b>must</b> not contain {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryResultFlagBits} values</li>
	 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
	 * <li>{@code queryPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_NOT_READY NOT_READY}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device     the logical device that owns the query pool.
	 * @param queryPool  the query pool managing the queries containing the desired results.
	 * @param firstQuery the initial query index.
	 * @param queryCount the number of queries. {@code firstQuery} and {@code queryCount} together define a range of queries.
	 * @param pData      a pointer to a user-allocated buffer where the results will be written
	 * @param stride     the stride in bytes between results for individual queries within {@code pData}.
	 * @param flags      a bitmask of {@code VkQueryResultFlagBits} specifying how and when results are returned. Bits which <b>can</b> be set include:
	 *                   
	 *                   <pre><code>typedef enum VkQueryResultFlagBits {
    VK_QUERY_RESULT_64_BIT = 0x00000001,
    VK_QUERY_RESULT_WAIT_BIT = 0x00000002,
    VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 0x00000004,
    VK_QUERY_RESULT_PARTIAL_BIT = 0x00000008,
} VkQueryResultFlagBits;</code></pre>
	 *                   
	 *                   <ul>
	 *                   <li>{@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} indicates the results will be written as an array of 64-bit unsigned integer values. If this bit is not set, the results will be written as an array of 32-bit unsigned integer values.</li>
	 *                   <li>{@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} indicates that Vulkan will wait for each query&#8217;s status to become available before retrieving its results.</li>
	 *                   <li>{@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} indicates that the availability status accompanies the results.</li>
	 *                   <li>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} indicates that returning partial results is acceptable.</li>
	 *                   </ul>
	 */
	public static int vkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, ByteBuffer pData, long stride, int flags) {
		return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, pData.remaining(), memAddress(pData), stride, flags);
	}

	/**
	 * Copy results of queries in a query pool to a host memory region.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To retrieve status and results for a set of queries, call:</p>
	 * 
	 * <pre><code>VkResult vkGetQueryPoolResults(
    VkDevice                                    device,
    VkQueryPool                                 queryPool,
    uint32_t                                    firstQuery,
    uint32_t                                    queryCount,
    size_t                                      dataSize,
    void*                                       pData,
    VkDeviceSize                                stride,
    VkQueryResultFlags                          flags);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If no bits are set in {@code flags}, and all requested queries are in the available state, results are written as an array of 32-bit unsigned integer values. The behavior when not all queries are available, is described <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-wait-bit-not-set"> below</a>.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is not set and the result overflows a 32-bit value, the value <b>may</b> either wrap or saturate. Similarly, if {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is set and the result overflows a 64-bit value, the value <b>may</b> either wrap or saturate.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is set, Vulkan will wait for each query to be in the available state before retrieving the numerical results for that query. In this case, {@link #vkGetQueryPoolResults GetQueryPoolResults} is guaranteed to succeed and return {@link #VK_SUCCESS SUCCESS} if the queries become available in a finite time (i.e. if they have been issued and not reset). If queries will never finish (e.g. due to being reset but not issued), then {@link #vkGetQueryPoolResults GetQueryPoolResults} <b>may</b> not return in finite time.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} and {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} are both not set then no result values are written to {@code pData} for queries that are in the unavailable state at the time of the call, and {@link #vkGetQueryPoolResults GetQueryPoolResults} returns {@link #VK_NOT_READY NOT_READY}. However, availability state is still written to {@code pData} for those queries if {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is set.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>must</b> take care to ensure that use of the {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} bit has the desired effect.</p>
	 * 
	 * <p>For example, if a query has been used previously and a command buffer records the commands {@link #vkCmdResetQueryPool CmdResetQueryPool}, {@link #vkCmdBeginQuery CmdBeginQuery}, and {@link #vkCmdEndQuery CmdEndQuery} for that query, then the query will remain in the available state until the {@link #vkCmdResetQueryPool CmdResetQueryPool} command executes on a queue. Applications <b>can</b> use fences or events to ensure that a query has already been reset before checking for its results or availability status. Otherwise, a stale value could be returned from a previous use of the query.</p>
	 * 
	 * <p>The above also applies when {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is used in combination with {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT}. In this case, the returned availability status <b>may</b> reflect the result of a previous use of the query unless the {@link #vkCmdResetQueryPool CmdResetQueryPool} command has been executed since the last use of the query.</p>
	 * </div>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>can</b> double-buffer query pool usage, with a pool per frame, and reset queries at the end of the frame in which they are read.</p>
	 * </div>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} is set, {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is not set, and the query's status is unavailable, an intermediate result value between zero and the final result value is written to {@code pData} for that query.</p>
	 * 
	 * <p>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} <b>must</b> not be used if the pool's {@code queryType} is {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is set, the final integer value written for each query is non-zero if the query's status was available or zero if the status was unavailable. When {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is used, implementations <b>must</b> guarantee that if they return a non-zero availability value then the numerical results <b>must</b> be valid, assuming the results are not reset by a subsequent command.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Satisfying this guarantee <b>may</b> require careful ordering by the application, e.g. to read the availability status before reading the results.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is not set in {@code flags} then {@code pData} and {@code stride} <b>must</b> be multiples of 4</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is set in {@code flags} then {@code pData} and {@code stride} <b>must</b> be multiples of 8</li>
	 * <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
	 * <li>{@code dataSize} <b>must</b> be large enough to contain the result of each query, as described <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-memorylayout">here</a></li>
	 * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}, {@code flags} <b>must</b> not contain {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryResultFlagBits} values</li>
	 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
	 * <li>{@code queryPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_NOT_READY NOT_READY}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device     the logical device that owns the query pool.
	 * @param queryPool  the query pool managing the queries containing the desired results.
	 * @param firstQuery the initial query index.
	 * @param queryCount the number of queries. {@code firstQuery} and {@code queryCount} together define a range of queries.
	 * @param pData      a pointer to a user-allocated buffer where the results will be written
	 * @param stride     the stride in bytes between results for individual queries within {@code pData}.
	 * @param flags      a bitmask of {@code VkQueryResultFlagBits} specifying how and when results are returned. Bits which <b>can</b> be set include:
	 *                   
	 *                   <pre><code>typedef enum VkQueryResultFlagBits {
    VK_QUERY_RESULT_64_BIT = 0x00000001,
    VK_QUERY_RESULT_WAIT_BIT = 0x00000002,
    VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 0x00000004,
    VK_QUERY_RESULT_PARTIAL_BIT = 0x00000008,
} VkQueryResultFlagBits;</code></pre>
	 *                   
	 *                   <ul>
	 *                   <li>{@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} indicates the results will be written as an array of 64-bit unsigned integer values. If this bit is not set, the results will be written as an array of 32-bit unsigned integer values.</li>
	 *                   <li>{@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} indicates that Vulkan will wait for each query&#8217;s status to become available before retrieving its results.</li>
	 *                   <li>{@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} indicates that the availability status accompanies the results.</li>
	 *                   <li>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} indicates that returning partial results is acceptable.</li>
	 *                   </ul>
	 */
	public static int vkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, IntBuffer pData, long stride, int flags) {
		return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, pData.remaining() << 2, memAddress(pData), stride, flags);
	}

	/**
	 * Copy results of queries in a query pool to a host memory region.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To retrieve status and results for a set of queries, call:</p>
	 * 
	 * <pre><code>VkResult vkGetQueryPoolResults(
    VkDevice                                    device,
    VkQueryPool                                 queryPool,
    uint32_t                                    firstQuery,
    uint32_t                                    queryCount,
    size_t                                      dataSize,
    void*                                       pData,
    VkDeviceSize                                stride,
    VkQueryResultFlags                          flags);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If no bits are set in {@code flags}, and all requested queries are in the available state, results are written as an array of 32-bit unsigned integer values. The behavior when not all queries are available, is described <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-wait-bit-not-set"> below</a>.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is not set and the result overflows a 32-bit value, the value <b>may</b> either wrap or saturate. Similarly, if {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is set and the result overflows a 64-bit value, the value <b>may</b> either wrap or saturate.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is set, Vulkan will wait for each query to be in the available state before retrieving the numerical results for that query. In this case, {@link #vkGetQueryPoolResults GetQueryPoolResults} is guaranteed to succeed and return {@link #VK_SUCCESS SUCCESS} if the queries become available in a finite time (i.e. if they have been issued and not reset). If queries will never finish (e.g. due to being reset but not issued), then {@link #vkGetQueryPoolResults GetQueryPoolResults} <b>may</b> not return in finite time.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} and {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} are both not set then no result values are written to {@code pData} for queries that are in the unavailable state at the time of the call, and {@link #vkGetQueryPoolResults GetQueryPoolResults} returns {@link #VK_NOT_READY NOT_READY}. However, availability state is still written to {@code pData} for those queries if {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is set.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>must</b> take care to ensure that use of the {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} bit has the desired effect.</p>
	 * 
	 * <p>For example, if a query has been used previously and a command buffer records the commands {@link #vkCmdResetQueryPool CmdResetQueryPool}, {@link #vkCmdBeginQuery CmdBeginQuery}, and {@link #vkCmdEndQuery CmdEndQuery} for that query, then the query will remain in the available state until the {@link #vkCmdResetQueryPool CmdResetQueryPool} command executes on a queue. Applications <b>can</b> use fences or events to ensure that a query has already been reset before checking for its results or availability status. Otherwise, a stale value could be returned from a previous use of the query.</p>
	 * 
	 * <p>The above also applies when {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is used in combination with {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT}. In this case, the returned availability status <b>may</b> reflect the result of a previous use of the query unless the {@link #vkCmdResetQueryPool CmdResetQueryPool} command has been executed since the last use of the query.</p>
	 * </div>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>can</b> double-buffer query pool usage, with a pool per frame, and reset queries at the end of the frame in which they are read.</p>
	 * </div>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} is set, {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is not set, and the query's status is unavailable, an intermediate result value between zero and the final result value is written to {@code pData} for that query.</p>
	 * 
	 * <p>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} <b>must</b> not be used if the pool's {@code queryType} is {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is set, the final integer value written for each query is non-zero if the query's status was available or zero if the status was unavailable. When {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is used, implementations <b>must</b> guarantee that if they return a non-zero availability value then the numerical results <b>must</b> be valid, assuming the results are not reset by a subsequent command.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Satisfying this guarantee <b>may</b> require careful ordering by the application, e.g. to read the availability status before reading the results.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is not set in {@code flags} then {@code pData} and {@code stride} <b>must</b> be multiples of 4</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is set in {@code flags} then {@code pData} and {@code stride} <b>must</b> be multiples of 8</li>
	 * <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
	 * <li>{@code dataSize} <b>must</b> be large enough to contain the result of each query, as described <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-memorylayout">here</a></li>
	 * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}, {@code flags} <b>must</b> not contain {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryResultFlagBits} values</li>
	 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
	 * <li>{@code queryPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_NOT_READY NOT_READY}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device     the logical device that owns the query pool.
	 * @param queryPool  the query pool managing the queries containing the desired results.
	 * @param firstQuery the initial query index.
	 * @param queryCount the number of queries. {@code firstQuery} and {@code queryCount} together define a range of queries.
	 * @param pData      a pointer to a user-allocated buffer where the results will be written
	 * @param stride     the stride in bytes between results for individual queries within {@code pData}.
	 * @param flags      a bitmask of {@code VkQueryResultFlagBits} specifying how and when results are returned. Bits which <b>can</b> be set include:
	 *                   
	 *                   <pre><code>typedef enum VkQueryResultFlagBits {
    VK_QUERY_RESULT_64_BIT = 0x00000001,
    VK_QUERY_RESULT_WAIT_BIT = 0x00000002,
    VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 0x00000004,
    VK_QUERY_RESULT_PARTIAL_BIT = 0x00000008,
} VkQueryResultFlagBits;</code></pre>
	 *                   
	 *                   <ul>
	 *                   <li>{@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} indicates the results will be written as an array of 64-bit unsigned integer values. If this bit is not set, the results will be written as an array of 32-bit unsigned integer values.</li>
	 *                   <li>{@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} indicates that Vulkan will wait for each query&#8217;s status to become available before retrieving its results.</li>
	 *                   <li>{@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} indicates that the availability status accompanies the results.</li>
	 *                   <li>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} indicates that returning partial results is acceptable.</li>
	 *                   </ul>
	 */
	public static int vkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, LongBuffer pData, long stride, int flags) {
		return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, pData.remaining() << 3, memAddress(pData), stride, flags);
	}

	// --- [ vkCreateBuffer ] ---

	/** Unsafe version of: {@link #vkCreateBuffer CreateBuffer} */
	public static int nvkCreateBuffer(VkDevice device, long pCreateInfo, long pAllocator, long pBuffer) {
		long __functionAddress = device.getCapabilities().vkCreateBuffer;
		if ( CHECKS ) {
			VkBufferCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pBuffer);
	}

	/**
	 * Create a new buffer object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create buffers, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateBuffer(
    VkDevice                                    device,
    const VkBufferCreateInfo*                   pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkBuffer*                                   pBuffer);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If the {@code flags} member of {@code pCreateInfo} includes {@link #VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT}, creating this {@code VkBuffer} <b>must</b> not cause the total required sparse memory for all currently valid sparse resources on the device to exceed {@link VkPhysicalDeviceLimits}{@code ::sparseAddressSpaceSize}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkBufferCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pBuffer} <b>must</b> be a pointer to a {@code VkBuffer} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkBufferCreateInfo}</p>
	 *
	 * @param device      the logical device that creates the buffer object.
	 * @param pCreateInfo a pointer to an instance of the {@link VkBufferCreateInfo} structure containing parameters affecting creation of the buffer.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pBuffer     points to a {@code VkBuffer} handle in which the resulting buffer object is returned.
	 */
	public static int vkCreateBuffer(VkDevice device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pBuffer) {
		if ( CHECKS )
			checkBuffer(pBuffer, 1);
		return nvkCreateBuffer(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pBuffer));
	}

	// --- [ vkDestroyBuffer ] ---

	/** Unsafe version of: {@link #vkDestroyBuffer DestroyBuffer} */
	public static void nvkDestroyBuffer(VkDevice device, long buffer, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyBuffer;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), buffer, pAllocator);
	}

	/**
	 * Destroy a buffer object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a buffer, call:</p>
	 * 
	 * <pre><code>void vkDestroyBuffer(
    VkDevice                                    device,
    VkBuffer                                    buffer,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code buffer}, either directly or via a {@code VkBufferView}, <b>must</b> have completed execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code buffer} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code buffer} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code buffer} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code buffer} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code buffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the logical device that destroys the buffer.
	 * @param buffer     the buffer to destroy.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyBuffer(VkDevice device, long buffer, VkAllocationCallbacks pAllocator) {
		nvkDestroyBuffer(device, buffer, memAddressSafe(pAllocator));
	}

	// --- [ vkCreateBufferView ] ---

	/** Unsafe version of: {@link #vkCreateBufferView CreateBufferView} */
	public static int nvkCreateBufferView(VkDevice device, long pCreateInfo, long pAllocator, long pView) {
		long __functionAddress = device.getCapabilities().vkCreateBufferView;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pView);
	}

	/**
	 * Create a new buffer view object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a buffer view, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateBufferView(
    VkDevice                                    device,
    const VkBufferViewCreateInfo*               pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkBufferView*                               pView);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkBufferViewCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pView} <b>must</b> be a pointer to a {@code VkBufferView} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkBufferViewCreateInfo}</p>
	 *
	 * @param device      the logical device that creates the buffer view.
	 * @param pCreateInfo a pointer to an instance of the {@link VkBufferViewCreateInfo} structure containing parameters to be used to create the buffer.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pView       points to a {@code VkBufferView} handle in which the resulting buffer view object is returned.
	 */
	public static int vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pView) {
		if ( CHECKS )
			checkBuffer(pView, 1);
		return nvkCreateBufferView(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pView));
	}

	// --- [ vkDestroyBufferView ] ---

	/** Unsafe version of: {@link #vkDestroyBufferView DestroyBufferView} */
	public static void nvkDestroyBufferView(VkDevice device, long bufferView, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyBufferView;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), bufferView, pAllocator);
	}

	/**
	 * Destroy a buffer view object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a buffer view, call:</p>
	 * 
	 * <pre><code>void vkDestroyBufferView(
    VkDevice                                    device,
    VkBufferView                                bufferView,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code bufferView} <b>must</b> have completed execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code bufferView} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code bufferView} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code bufferView} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code bufferView} <b>must</b> be a valid {@code VkBufferView} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code bufferView} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code bufferView} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the logical device that destroys the buffer view.
	 * @param bufferView the buffer view to destroy.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyBufferView(VkDevice device, long bufferView, VkAllocationCallbacks pAllocator) {
		nvkDestroyBufferView(device, bufferView, memAddressSafe(pAllocator));
	}

	// --- [ vkCreateImage ] ---

	/** Unsafe version of: {@link #vkCreateImage CreateImage} */
	public static int nvkCreateImage(VkDevice device, long pCreateInfo, long pAllocator, long pImage) {
		long __functionAddress = device.getCapabilities().vkCreateImage;
		if ( CHECKS ) {
			VkImageCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pImage);
	}

	/**
	 * Create a new image object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create images, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateImage(
    VkDevice                                    device,
    const VkImageCreateInfo*                    pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkImage*                                    pImage);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If the {@code flags} member of {@code pCreateInfo} includes {@link #VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, creating this {@code VkImage} <b>must</b> not cause the total required sparse memory for all currently valid sparse resources on the device to exceed {@link VkPhysicalDeviceLimits}{@code ::sparseAddressSpaceSize}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkImageCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pImage} <b>must</b> be a pointer to a {@code VkImage} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkImageCreateInfo}</p>
	 *
	 * @param device      the logical device that creates the image.
	 * @param pCreateInfo a pointer to an instance of the {@link VkImageCreateInfo} structure containing parameters to be used to create the image.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pImage      points to a {@code VkImage} handle in which the resulting image object is returned.
	 */
	public static int vkCreateImage(VkDevice device, VkImageCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pImage) {
		if ( CHECKS )
			checkBuffer(pImage, 1);
		return nvkCreateImage(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pImage));
	}

	// --- [ vkDestroyImage ] ---

	/** Unsafe version of: {@link #vkDestroyImage DestroyImage} */
	public static void nvkDestroyImage(VkDevice device, long image, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyImage;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), image, pAllocator);
	}

	/**
	 * Destroy an image object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy an image, call:</p>
	 * 
	 * <pre><code>void vkDestroyImage(
    VkDevice                                    device,
    VkImage                                     image,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code image}, either directly or via a {@code VkImageView}, <b>must</b> have completed execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code image} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code image} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code image} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code image} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code image} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the logical device that destroys the image.
	 * @param image      the image to destroy.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyImage(VkDevice device, long image, VkAllocationCallbacks pAllocator) {
		nvkDestroyImage(device, image, memAddressSafe(pAllocator));
	}

	// --- [ vkGetImageSubresourceLayout ] ---

	/** Unsafe version of: {@link #vkGetImageSubresourceLayout GetImageSubresourceLayout} */
	public static void nvkGetImageSubresourceLayout(VkDevice device, long image, long pSubresource, long pLayout) {
		long __functionAddress = device.getCapabilities().vkGetImageSubresourceLayout;
		callPJPPV(__functionAddress, device.address(), image, pSubresource, pLayout);
	}

	/**
	 * Retrieve information about an image subresource.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query the host access layout of an image subresource, for an image created with linear tiling, call:</p>
	 * 
	 * <pre><code>void vkGetImageSubresourceLayout(
    VkDevice                                    device,
    VkImage                                     image,
    const VkImageSubresource*                   pSubresource,
    VkSubresourceLayout*                        pLayout);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkGetImageSubresourceLayout GetImageSubresourceLayout} is invariant for the lifetime of a single image.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code image} <b>must</b> have been created with {@code tiling} equal to {@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}</li>
	 * <li>The {@code aspectMask} member of {@code pSubresource} <b>must</b> only have a single bit set</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code pSubresource} <b>must</b> be a pointer to a valid {@link VkImageSubresource} structure</li>
	 * <li>{@code pLayout} <b>must</b> be a pointer to a {@link VkSubresourceLayout} structure</li>
	 * <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkImageSubresource}, {@link VkSubresourceLayout}</p>
	 *
	 * @param device       the logical device that owns the image.
	 * @param image        the image whose layout is being queried.
	 * @param pSubresource a pointer to a {@link VkImageSubresource} structure selecting a specific image for the image subresource.
	 * @param pLayout      points to a {@link VkSubresourceLayout} structure in which the layout is returned.
	 */
	public static void vkGetImageSubresourceLayout(VkDevice device, long image, VkImageSubresource pSubresource, VkSubresourceLayout pLayout) {
		nvkGetImageSubresourceLayout(device, image, pSubresource.address(), pLayout.address());
	}

	// --- [ vkCreateImageView ] ---

	/** Unsafe version of: {@link #vkCreateImageView CreateImageView} */
	public static int nvkCreateImageView(VkDevice device, long pCreateInfo, long pAllocator, long pView) {
		long __functionAddress = device.getCapabilities().vkCreateImageView;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pView);
	}

	/**
	 * Create an image view from an existing image.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create an image view, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateImageView(
    VkDevice                                    device,
    const VkImageViewCreateInfo*                pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkImageView*                                pView);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Some of the image creation parameters are inherited by the view. The remaining parameters are contained in the {@code pCreateInfo}.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkImageViewCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pView} <b>must</b> be a pointer to a {@code VkImageView} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkImageViewCreateInfo}</p>
	 *
	 * @param device      the logical device that creates the image view.
	 * @param pCreateInfo a pointer to an instance of the {@link VkImageViewCreateInfo} structure containing parameters to be used to create the image view.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pView       points to a {@code VkImageView} handle in which the resulting image view object is returned.
	 */
	public static int vkCreateImageView(VkDevice device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pView) {
		if ( CHECKS )
			checkBuffer(pView, 1);
		return nvkCreateImageView(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pView));
	}

	// --- [ vkDestroyImageView ] ---

	/** Unsafe version of: {@link #vkDestroyImageView DestroyImageView} */
	public static void nvkDestroyImageView(VkDevice device, long imageView, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyImageView;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), imageView, pAllocator);
	}

	/**
	 * Destroy an image view object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy an image view, call:</p>
	 * 
	 * <pre><code>void vkDestroyImageView(
    VkDevice                                    device,
    VkImageView                                 imageView,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code imageView} <b>must</b> have completed execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code imageView} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code imageView} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code imageView} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code imageView} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code imageView} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the logical device that destroys the image view.
	 * @param imageView  the image view to destroy.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyImageView(VkDevice device, long imageView, VkAllocationCallbacks pAllocator) {
		nvkDestroyImageView(device, imageView, memAddressSafe(pAllocator));
	}

	// --- [ vkCreateShaderModule ] ---

	/** Unsafe version of: {@link #vkCreateShaderModule CreateShaderModule} */
	public static int nvkCreateShaderModule(VkDevice device, long pCreateInfo, long pAllocator, long pShaderModule) {
		long __functionAddress = device.getCapabilities().vkCreateShaderModule;
		if ( CHECKS ) {
			VkShaderModuleCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pShaderModule);
	}

	/**
	 * Creates a new shader module object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a shader module, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateShaderModule(
    VkDevice                                    device,
    const VkShaderModuleCreateInfo*             pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkShaderModule*                             pShaderModule);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Once a shader module has been created, any entry points it contains <b>can</b> be used in pipeline shader stages as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#pipelines-compute">Compute Pipelines</a> and <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#pipelines-graphics">Graphics Pipelines</a>.</p>
	 * 
	 * <p>If the shader stage fails to compile {@link NVGLSLShader#VK_ERROR_INVALID_SHADER_NV ERROR_INVALID_SHADER_NV} will be generated and the compile log will be reported back to the application by {@code VK_EXT_debug_report} if enabled.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkShaderModuleCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pShaderModule} <b>must</b> be a pointer to a {@code VkShaderModule} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link NVGLSLShader#VK_ERROR_INVALID_SHADER_NV ERROR_INVALID_SHADER_NV}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkShaderModuleCreateInfo}</p>
	 *
	 * @param device        the logical device that creates the shader module.
	 * @param pCreateInfo   parameter is a pointer to an instance of the {@link VkShaderModuleCreateInfo} structure.
	 * @param pAllocator    controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pShaderModule points to a {@code VkShaderModule} handle in which the resulting shader module object is returned.
	 */
	public static int vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pShaderModule) {
		if ( CHECKS )
			checkBuffer(pShaderModule, 1);
		return nvkCreateShaderModule(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pShaderModule));
	}

	// --- [ vkDestroyShaderModule ] ---

	/** Unsafe version of: {@link #vkDestroyShaderModule DestroyShaderModule} */
	public static void nvkDestroyShaderModule(VkDevice device, long shaderModule, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyShaderModule;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), shaderModule, pAllocator);
	}

	/**
	 * Destroy a shader module module.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a shader module, call:</p>
	 * 
	 * <pre><code>void vkDestroyShaderModule(
    VkDevice                                    device,
    VkShaderModule                              shaderModule,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>A shader module <b>can</b> be destroyed while pipelines created using its shaders are still in use.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code shaderModule} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code shaderModule} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code shaderModule} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code shaderModule} <b>must</b> be a valid {@code VkShaderModule} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code shaderModule} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code shaderModule} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device       the logical device that destroys the shader module.
	 * @param shaderModule the handle of the shader module to destroy.
	 * @param pAllocator   controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyShaderModule(VkDevice device, long shaderModule, VkAllocationCallbacks pAllocator) {
		nvkDestroyShaderModule(device, shaderModule, memAddressSafe(pAllocator));
	}

	// --- [ vkCreatePipelineCache ] ---

	/** Unsafe version of: {@link #vkCreatePipelineCache CreatePipelineCache} */
	public static int nvkCreatePipelineCache(VkDevice device, long pCreateInfo, long pAllocator, long pPipelineCache) {
		long __functionAddress = device.getCapabilities().vkCreatePipelineCache;
		if ( CHECKS ) {
			VkPipelineCacheCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pPipelineCache);
	}

	/**
	 * Creates a new pipeline cache.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create pipeline cache objects, call:</p>
	 * 
	 * <pre><code>VkResult vkCreatePipelineCache(
    VkDevice                                    device,
    const VkPipelineCacheCreateInfo*            pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkPipelineCache*                            pPipelineCache);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>can</b> track and manage the total host memory size of a pipeline cache object using the {@code pAllocator}. Applications <b>can</b> limit the amount of data retrieved from a pipeline cache object in {@link #vkGetPipelineCacheData GetPipelineCacheData}. Implementations <b>should</b> not internally limit the total number of entries added to a pipeline cache object or the total host memory consumed.</p>
	 * </div>
	 * 
	 * <p>Once created, a pipeline cache <b>can</b> be passed to the {@link #vkCreateGraphicsPipelines CreateGraphicsPipelines} and {@link #vkCreateComputePipelines CreateComputePipelines} commands. If the pipeline cache passed into these commands is not {@link #VK_NULL_HANDLE NULL_HANDLE}, the implementation will query it for possible reuse opportunities and update it with new content. The use of the pipeline cache object in these commands is internally synchronized, and the same pipeline cache object <b>can</b> be used in multiple threads simultaneously.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Implementations <b>should</b> make every effort to limit any critical sections to the actual accesses to the cache, which is expected to be significantly shorter than the duration of the {@link #vkCreateGraphicsPipelines CreateGraphicsPipelines} and {@link #vkCreateComputePipelines CreateComputePipelines} commands.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkPipelineCacheCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pPipelineCache} <b>must</b> be a pointer to a {@code VkPipelineCache} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkPipelineCacheCreateInfo}</p>
	 *
	 * @param device         the logical device that creates the pipeline cache object.
	 * @param pCreateInfo    a pointer to a {@link VkPipelineCacheCreateInfo} structure that contains the initial parameters for the pipeline cache object.
	 * @param pAllocator     controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pPipelineCache a pointer to a {@code VkPipelineCache} handle in which the resulting pipeline cache object is returned.
	 */
	public static int vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pPipelineCache) {
		if ( CHECKS )
			checkBuffer(pPipelineCache, 1);
		return nvkCreatePipelineCache(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pPipelineCache));
	}

	// --- [ vkDestroyPipelineCache ] ---

	/** Unsafe version of: {@link #vkDestroyPipelineCache DestroyPipelineCache} */
	public static void nvkDestroyPipelineCache(VkDevice device, long pipelineCache, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyPipelineCache;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), pipelineCache, pAllocator);
	}

	/**
	 * Destroy a pipeline cache object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a pipeline cache, call:</p>
	 * 
	 * <pre><code>void vkDestroyPipelineCache(
    VkDevice                                    device,
    VkPipelineCache                             pipelineCache,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code pipelineCache} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code pipelineCache} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipelineCache} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pipelineCache} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device        the logical device that destroys the pipeline cache object.
	 * @param pipelineCache the handle of the pipeline cache to destroy.
	 * @param pAllocator    controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyPipelineCache(VkDevice device, long pipelineCache, VkAllocationCallbacks pAllocator) {
		nvkDestroyPipelineCache(device, pipelineCache, memAddressSafe(pAllocator));
	}

	// --- [ vkGetPipelineCacheData ] ---

	/**
	 * Unsafe version of: {@link #vkGetPipelineCacheData GetPipelineCacheData}
	 *
	 * @param pDataSize a pointer to a value related to the amount of data in the pipeline cache, as described below.
	 */
	public static int nvkGetPipelineCacheData(VkDevice device, long pipelineCache, long pDataSize, long pData) {
		long __functionAddress = device.getCapabilities().vkGetPipelineCacheData;
		return callPJPPI(__functionAddress, device.address(), pipelineCache, pDataSize, pData);
	}

	/**
	 * Get the data store from a pipeline cache.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>Data <b>can</b> be retrieved from a pipeline cache object using the command:</p>
	 * 
	 * <pre><code>VkResult vkGetPipelineCacheData(
    VkDevice                                    device,
    VkPipelineCache                             pipelineCache,
    size_t*                                     pDataSize,
    void*                                       pData);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If {@code pData} is {@code NULL}, then the maximum size of the data that <b>can</b> be retrieved from the pipeline cache, in bytes, is returned in {@code pDataSize}. Otherwise, {@code pDataSize} <b>must</b> point to a variable set by the user to the size of the buffer, in bytes, pointed to by {@code pData}, and on return the variable is overwritten with the amount of data actually written to {@code pData}.</p>
	 * 
	 * <p>If {@code pDataSize} is less than the maximum size that <b>can</b> be retrieved by the pipeline cache, at most {@code pDataSize} bytes will be written to {@code pData}, and {@link #vkGetPipelineCacheData GetPipelineCacheData} will return {@link #VK_INCOMPLETE INCOMPLETE}. Any data written to {@code pData} is valid and <b>can</b> be provided as the {@code pInitialData} member of the {@link VkPipelineCacheCreateInfo} structure passed to {@link #vkCreatePipelineCache CreatePipelineCache}.</p>
	 * 
	 * <p>Two calls to {@link #vkGetPipelineCacheData GetPipelineCacheData} with the same parameters <b>must</b> retrieve the same data unless a command that modifies the contents of the cache is called between them.</p>
	 * 
	 * <p>Applications <b>can</b> store the data retrieved from the pipeline cache, and use these data, possibly in a future run of the application, to populate new pipeline cache objects. The results of pipeline compiles, however, <b>may</b> depend on the vendor ID, device ID, driver version, and other details of the device. To enable applications to detect when previously retrieved data is incompatible with the device, the initial bytes written to {@code pData} <b>must</b> be a header consisting of the following members:</p>
	 * 
	 * <h6>Layout for pipeline cache header version ename:VK_PIPELINE_CACHE_HEADER_VERSION_ONE</h6>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Offset</th><th>Size</th><th>Meaning</th></tr></thead>
	 * <tbody>
	 * <tr><td>0</td><td>4</td><td>length in bytes of the entire pipeline cache header written as a stream of bytes, with the least significant byte first</td></tr>
	 * <tr><td>4</td><td>4</td><td>a {@code VkPipelineCacheHeaderVersion} value written as a stream of bytes, with the least significant byte first</td></tr>
	 * <tr><td>8</td><td>4</td><td>a vendor ID equal to {@link VkPhysicalDeviceProperties}{@code ::vendorID} written as a stream of bytes, with the least significant byte first</td></tr>
	 * <tr><td>12</td><td>4</td><td>a device ID equal to {@link VkPhysicalDeviceProperties}{@code ::deviceID} written as a stream of bytes, with the least significant byte first</td></tr>
	 * <tr><td>16</td><td>{@link #VK_UUID_SIZE UUID_SIZE}</td><td>a pipeline cache ID equal to {@link VkPhysicalDeviceProperties}{@code ::pipelineCacheUUID}</td></tr>
	 * </tbody>
	 * </table>
	 * 
	 * <p>The first four bytes encode the length of the entire pipeline header, in bytes. This value includes all fields in the header including the pipeline cache version field and the size of the length field.</p>
	 * 
	 * <p>The next four bytes encode the pipeline cache version. This field is interpreted as a {@code VkPipelineCacheHeaderVersion} value, and <b>must</b> have one of the following values:</p>
	 * 
	 * <pre><code>typedef enum VkPipelineCacheHeaderVersion {
    VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1,
} VkPipelineCacheHeaderVersion;</code></pre>
	 * 
	 * <p>A consumer of the pipeline cache <b>should</b> use the cache version to interpret the remainder of the cache header.</p>
	 * 
	 * <p>If {@code pDataSize} is less than what is necessary to store this header, nothing will be written to {@code pData} and zero will be written to {@code pDataSize}.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>{@code pDataSize} <b>must</b> be a pointer to a {@code size_t} value</li>
	 * <li>If the value referenced by {@code pDataSize} is not 0, and {@code pData} is not {@code NULL}, {@code pData} <b>must</b> be a pointer to an array of {@code pDataSize} bytes</li>
	 * <li>{@code pipelineCache} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_INCOMPLETE INCOMPLETE}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device        the logical device that owns the pipeline cache.
	 * @param pipelineCache the pipeline cache to retrieve data from.
	 * @param pDataSize     a pointer to a value related to the amount of data in the pipeline cache, as described below.
	 * @param pData         either {@code NULL} or a pointer to a buffer.
	 */
	public static int vkGetPipelineCacheData(VkDevice device, long pipelineCache, PointerBuffer pDataSize, ByteBuffer pData) {
		if ( CHECKS ) {
			checkBuffer(pDataSize, 1);
			checkBufferSafe(pData, pDataSize.get(pDataSize.position()));
		}
		return nvkGetPipelineCacheData(device, pipelineCache, memAddress(pDataSize), memAddressSafe(pData));
	}

	// --- [ vkMergePipelineCaches ] ---

	/**
	 * Unsafe version of: {@link #vkMergePipelineCaches MergePipelineCaches}
	 *
	 * @param srcCacheCount the length of the {@code pSrcCaches} array.
	 */
	public static int nvkMergePipelineCaches(VkDevice device, long dstCache, int srcCacheCount, long pSrcCaches) {
		long __functionAddress = device.getCapabilities().vkMergePipelineCaches;
		return callPJPI(__functionAddress, device.address(), dstCache, srcCacheCount, pSrcCaches);
	}

	/**
	 * Combine the data stores of pipeline caches.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>Pipeline cache objects <b>can</b> be merged using the command:</p>
	 * 
	 * <pre><code>VkResult vkMergePipelineCaches(
    VkDevice                                    device,
    VkPipelineCache                             dstCache,
    uint32_t                                    srcCacheCount,
    const VkPipelineCache*                      pSrcCaches);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>The details of the merge operation are implementation dependent, but implementations <b>should</b> merge the contents of the specified pipelines and prune duplicate entries.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code dstCache} <b>must</b> not appear in the list of source caches</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code dstCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>{@code pSrcCaches} <b>must</b> be a pointer to an array of {@code srcCacheCount} valid {@code VkPipelineCache} handles</li>
	 * <li>{@code srcCacheCount} <b>must</b> be greater than 0</li>
	 * <li>{@code dstCache} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * <li>Each element of {@code pSrcCaches} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code dstCache} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device     the logical device that owns the pipeline cache objects.
	 * @param dstCache   the handle of the pipeline cache to merge results into.
	 * @param pSrcCaches an array of pipeline cache handles, which will be merged into {@code dstCache}. The previous contents of {@code dstCache} are included after the merge.
	 */
	public static int vkMergePipelineCaches(VkDevice device, long dstCache, LongBuffer pSrcCaches) {
		return nvkMergePipelineCaches(device, dstCache, pSrcCaches.remaining(), memAddress(pSrcCaches));
	}

	// --- [ vkCreateGraphicsPipelines ] ---

	/**
	 * Unsafe version of: {@link #vkCreateGraphicsPipelines CreateGraphicsPipelines}
	 *
	 * @param createInfoCount the length of the {@code pCreateInfos} and {@code pPipelines} arrays.
	 */
	public static int nvkCreateGraphicsPipelines(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
		long __functionAddress = device.getCapabilities().vkCreateGraphicsPipelines;
		if ( CHECKS ) {
			VkGraphicsPipelineCreateInfo.validate(pCreateInfos, createInfoCount);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPJPPPI(__functionAddress, device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);
	}

	/**
	 * Create graphics pipelines.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create graphics pipelines, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateGraphicsPipelines(
    VkDevice                                    device,
    VkPipelineCache                             pipelineCache,
    uint32_t                                    createInfoCount,
    const VkGraphicsPipelineCreateInfo*         pCreateInfos,
    const VkAllocationCallbacks*                pAllocator,
    VkPipeline*                                 pPipelines);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The {@link VkGraphicsPipelineCreateInfo} structure includes an array of shader create info structures containing all the desired active shader stages, as well as creation info to define all relevant fixed-function stages, and a pipeline layout.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If the {@code flags} member of any given element of {@code pCreateInfos} contains the {@link #VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and the {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into {@code pCreateInfos} that corresponds to that element</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipelineCache} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>{@code pCreateInfos} <b>must</b> be a pointer to an array of {@code createInfoCount} valid {@link VkGraphicsPipelineCreateInfo} structures</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pPipelines} <b>must</b> be a pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
	 * <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
	 * <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link NVGLSLShader#VK_ERROR_INVALID_SHADER_NV ERROR_INVALID_SHADER_NV}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkGraphicsPipelineCreateInfo}</p>
	 *
	 * @param device        the logical device that creates the graphics pipelines.
	 * @param pipelineCache either {@link #VK_NULL_HANDLE NULL_HANDLE}, indicating that pipeline caching is disabled; or the handle of a valid <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#pipelines-cache">pipeline cache</a> object, in which case use of that cache is enabled for the duration of the command.
	 * @param pCreateInfos  an array of {@link VkGraphicsPipelineCreateInfo} structures.
	 * @param pAllocator    controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pPipelines    a pointer to an array in which the resulting graphics pipeline objects are returned.
	 */
	public static int vkCreateGraphicsPipelines(VkDevice device, long pipelineCache, VkGraphicsPipelineCreateInfo.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, LongBuffer pPipelines) {
		if ( CHECKS )
			checkBuffer(pPipelines, pCreateInfos.remaining());
		return nvkCreateGraphicsPipelines(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pPipelines));
	}

	// --- [ vkCreateComputePipelines ] ---

	/**
	 * Unsafe version of: {@link #vkCreateComputePipelines CreateComputePipelines}
	 *
	 * @param createInfoCount the length of the {@code pCreateInfos} and {@code pPipelines} arrays.
	 */
	public static int nvkCreateComputePipelines(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
		long __functionAddress = device.getCapabilities().vkCreateComputePipelines;
		if ( CHECKS ) {
			VkComputePipelineCreateInfo.validate(pCreateInfos, createInfoCount);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPJPPPI(__functionAddress, device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);
	}

	/**
	 * Creates a new compute pipeline object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create compute pipelines, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateComputePipelines(
    VkDevice                                    device,
    VkPipelineCache                             pipelineCache,
    uint32_t                                    createInfoCount,
    const VkComputePipelineCreateInfo*          pCreateInfos,
    const VkAllocationCallbacks*                pAllocator,
    VkPipeline*                                 pPipelines);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If the {@code flags} member of any given element of {@code pCreateInfos} contains the {@link #VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and the {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into {@code pCreateInfos} that corresponds to that element</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipelineCache} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>{@code pCreateInfos} <b>must</b> be a pointer to an array of {@code createInfoCount} valid {@link VkComputePipelineCreateInfo} structures</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pPipelines} <b>must</b> be a pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
	 * <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
	 * <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link NVGLSLShader#VK_ERROR_INVALID_SHADER_NV ERROR_INVALID_SHADER_NV}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkComputePipelineCreateInfo}</p>
	 *
	 * @param device        the logical device that creates the compute pipelines.
	 * @param pipelineCache either {@link #VK_NULL_HANDLE NULL_HANDLE}, indicating that pipeline caching is disabled; or the handle of a valid <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#pipelines-cache">pipeline cache</a> object, in which case use of that cache is enabled for the duration of the command.
	 * @param pCreateInfos  an array of {@link VkComputePipelineCreateInfo} structures.
	 * @param pAllocator    controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pPipelines    a pointer to an array in which the resulting compute pipeline objects are returned.
	 */
	public static int vkCreateComputePipelines(VkDevice device, long pipelineCache, VkComputePipelineCreateInfo.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, LongBuffer pPipelines) {
		if ( CHECKS )
			checkBuffer(pPipelines, pCreateInfos.remaining());
		return nvkCreateComputePipelines(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pPipelines));
	}

	// --- [ vkDestroyPipeline ] ---

	/** Unsafe version of: {@link #vkDestroyPipeline DestroyPipeline} */
	public static void nvkDestroyPipeline(VkDevice device, long pipeline, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyPipeline;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), pipeline, pAllocator);
	}

	/**
	 * Destroy a pipeline object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a graphics or compute pipeline, call:</p>
	 * 
	 * <pre><code>void vkDestroyPipeline(
    VkDevice                                    device,
    VkPipeline                                  pipeline,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code pipeline} <b>must</b> have completed execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code pipeline} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code pipeline} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipeline} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code pipeline} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pipeline} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the logical device that destroys the pipeline.
	 * @param pipeline   the handle of the pipeline to destroy.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyPipeline(VkDevice device, long pipeline, VkAllocationCallbacks pAllocator) {
		nvkDestroyPipeline(device, pipeline, memAddressSafe(pAllocator));
	}

	// --- [ vkCreatePipelineLayout ] ---

	/** Unsafe version of: {@link #vkCreatePipelineLayout CreatePipelineLayout} */
	public static int nvkCreatePipelineLayout(VkDevice device, long pCreateInfo, long pAllocator, long pPipelineLayout) {
		long __functionAddress = device.getCapabilities().vkCreatePipelineLayout;
		if ( CHECKS ) {
			VkPipelineLayoutCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pPipelineLayout);
	}

	/**
	 * Creates a new pipeline layout object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a pipeline layout, call:</p>
	 * 
	 * <pre><code>VkResult vkCreatePipelineLayout(
    VkDevice                                    device,
    const VkPipelineLayoutCreateInfo*           pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkPipelineLayout*                           pPipelineLayout);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkPipelineLayoutCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pPipelineLayout} <b>must</b> be a pointer to a {@code VkPipelineLayout} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkPipelineLayoutCreateInfo}</p>
	 *
	 * @param device          the logical device that creates the pipeline layout.
	 * @param pCreateInfo     a pointer to an instance of the {@link VkPipelineLayoutCreateInfo} structure specifying the state of the pipeline layout object.
	 * @param pAllocator      controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pPipelineLayout points to a {@code VkPipelineLayout} handle in which the resulting pipeline layout object is returned.
	 */
	public static int vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pPipelineLayout) {
		if ( CHECKS )
			checkBuffer(pPipelineLayout, 1);
		return nvkCreatePipelineLayout(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pPipelineLayout));
	}

	// --- [ vkDestroyPipelineLayout ] ---

	/** Unsafe version of: {@link #vkDestroyPipelineLayout DestroyPipelineLayout} */
	public static void nvkDestroyPipelineLayout(VkDevice device, long pipelineLayout, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyPipelineLayout;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), pipelineLayout, pAllocator);
	}

	/**
	 * Destroy a pipeline layout object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a pipeline layout, call:</p>
	 * 
	 * <pre><code>void vkDestroyPipelineLayout(
    VkDevice                                    device,
    VkPipelineLayout                            pipelineLayout,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code pipelineLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code pipelineLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipelineLayout} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code pipelineLayout} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pipelineLayout} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device         the logical device that destroys the pipeline layout.
	 * @param pipelineLayout the pipeline layout to destroy.
	 * @param pAllocator     controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyPipelineLayout(VkDevice device, long pipelineLayout, VkAllocationCallbacks pAllocator) {
		nvkDestroyPipelineLayout(device, pipelineLayout, memAddressSafe(pAllocator));
	}

	// --- [ vkCreateSampler ] ---

	/** Unsafe version of: {@link #vkCreateSampler CreateSampler} */
	public static int nvkCreateSampler(VkDevice device, long pCreateInfo, long pAllocator, long pSampler) {
		long __functionAddress = device.getCapabilities().vkCreateSampler;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pSampler);
	}

	/**
	 * Create a new sampler object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a sampler object, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateSampler(
    VkDevice                                    device,
    const VkSamplerCreateInfo*                  pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkSampler*                                  pSampler);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkSamplerCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSampler} <b>must</b> be a pointer to a {@code VkSampler} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkSamplerCreateInfo}</p>
	 *
	 * @param device      the logical device that creates the sampler.
	 * @param pCreateInfo a pointer to an instance of the {@link VkSamplerCreateInfo} structure specifying the state of the sampler object.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pSampler    points to a {@code VkSampler} handle in which the resulting sampler object is returned.
	 */
	public static int vkCreateSampler(VkDevice device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSampler) {
		if ( CHECKS )
			checkBuffer(pSampler, 1);
		return nvkCreateSampler(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSampler));
	}

	// --- [ vkDestroySampler ] ---

	/** Unsafe version of: {@link #vkDestroySampler DestroySampler} */
	public static void nvkDestroySampler(VkDevice device, long sampler, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroySampler;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), sampler, pAllocator);
	}

	/**
	 * Destroy a sampler object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a sampler, call:</p>
	 * 
	 * <pre><code>void vkDestroySampler(
    VkDevice                                    device,
    VkSampler                                   sampler,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code sampler} <b>must</b> have completed execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code sampler} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code sampler} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code sampler} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code sampler} <b>must</b> be a valid {@code VkSampler} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code sampler} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code sampler} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the logical device that destroys the sampler.
	 * @param sampler    the sampler to destroy.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroySampler(VkDevice device, long sampler, VkAllocationCallbacks pAllocator) {
		nvkDestroySampler(device, sampler, memAddressSafe(pAllocator));
	}

	// --- [ vkCreateDescriptorSetLayout ] ---

	/** Unsafe version of: {@link #vkCreateDescriptorSetLayout CreateDescriptorSetLayout} */
	public static int nvkCreateDescriptorSetLayout(VkDevice device, long pCreateInfo, long pAllocator, long pSetLayout) {
		long __functionAddress = device.getCapabilities().vkCreateDescriptorSetLayout;
		if ( CHECKS ) {
			VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pSetLayout);
	}

	/**
	 * Create a new descriptor set layout.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create descriptor set layout objects, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateDescriptorSetLayout(
    VkDevice                                    device,
    const VkDescriptorSetLayoutCreateInfo*      pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkDescriptorSetLayout*                      pSetLayout);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkDescriptorSetLayoutCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSetLayout} <b>must</b> be a pointer to a {@code VkDescriptorSetLayout} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkDescriptorSetLayoutCreateInfo}</p>
	 *
	 * @param device      the logical device that creates the descriptor set layout.
	 * @param pCreateInfo a pointer to an instance of the {@link VkDescriptorSetLayoutCreateInfo} structure specifying the state of the descriptor set layout object.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pSetLayout  points to a {@code VkDescriptorSetLayout} handle in which the resulting descriptor set layout object is returned.
	 */
	public static int vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSetLayout) {
		if ( CHECKS )
			checkBuffer(pSetLayout, 1);
		return nvkCreateDescriptorSetLayout(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSetLayout));
	}

	// --- [ vkDestroyDescriptorSetLayout ] ---

	/** Unsafe version of: {@link #vkDestroyDescriptorSetLayout DestroyDescriptorSetLayout} */
	public static void nvkDestroyDescriptorSetLayout(VkDevice device, long descriptorSetLayout, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyDescriptorSetLayout;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), descriptorSetLayout, pAllocator);
	}

	/**
	 * Destroy a descriptor set layout object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a descriptor set layout, call:</p>
	 * 
	 * <pre><code>void vkDestroyDescriptorSetLayout(
    VkDevice                                    device,
    VkDescriptorSetLayout                       descriptorSetLayout,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code descriptorSetLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code descriptorSetLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code descriptorSetLayout} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code descriptorSetLayout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code descriptorSetLayout} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code descriptorSetLayout} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device              the logical device that destroys the descriptor set layout.
	 * @param descriptorSetLayout the descriptor set layout to destroy.
	 * @param pAllocator          controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyDescriptorSetLayout(VkDevice device, long descriptorSetLayout, VkAllocationCallbacks pAllocator) {
		nvkDestroyDescriptorSetLayout(device, descriptorSetLayout, memAddressSafe(pAllocator));
	}

	// --- [ vkCreateDescriptorPool ] ---

	/** Unsafe version of: {@link #vkCreateDescriptorPool CreateDescriptorPool} */
	public static int nvkCreateDescriptorPool(VkDevice device, long pCreateInfo, long pAllocator, long pDescriptorPool) {
		long __functionAddress = device.getCapabilities().vkCreateDescriptorPool;
		if ( CHECKS ) {
			VkDescriptorPoolCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pDescriptorPool);
	}

	/**
	 * Creates a descriptor pool object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a descriptor pool object, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateDescriptorPool(
    VkDevice                                    device,
    const VkDescriptorPoolCreateInfo*           pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkDescriptorPool*                           pDescriptorPool);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@code pAllocator} controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation"> Memory Allocation</a> chapter.</p>
	 * 
	 * <p>The created descriptor pool is returned in {@code pDescriptorPool}.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkDescriptorPoolCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pDescriptorPool} <b>must</b> be a pointer to a {@code VkDescriptorPool} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkDescriptorPoolCreateInfo}</p>
	 *
	 * @param device          the logical device that creates the descriptor pool.
	 * @param pCreateInfo     a pointer to an instance of the {@link VkDescriptorPoolCreateInfo} structure specifying the state of the descriptor pool object.
	 * @param pAllocator      controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pDescriptorPool points to a {@code VkDescriptorPool} handle in which the resulting descriptor pool object is returned.
	 */
	public static int vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pDescriptorPool) {
		if ( CHECKS )
			checkBuffer(pDescriptorPool, 1);
		return nvkCreateDescriptorPool(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pDescriptorPool));
	}

	// --- [ vkDestroyDescriptorPool ] ---

	/** Unsafe version of: {@link #vkDestroyDescriptorPool DestroyDescriptorPool} */
	public static void nvkDestroyDescriptorPool(VkDevice device, long descriptorPool, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyDescriptorPool;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), descriptorPool, pAllocator);
	}

	/**
	 * Destroy a descriptor pool object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a descriptor pool, call:</p>
	 * 
	 * <pre><code>void vkDestroyDescriptorPool(
    VkDevice                                    device,
    VkDescriptorPool                            descriptorPool,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>When a pool is destroyed, all descriptor sets allocated from the pool are implicitly freed and become invalid. Descriptor sets allocated from a given pool do not need to be freed before destroying that descriptor pool.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code descriptorPool} (via any allocated descriptor sets) <b>must</b> have completed execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code descriptorPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code descriptorPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code descriptorPool} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code descriptorPool} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device         the logical device that destroys the descriptor pool.
	 * @param descriptorPool the descriptor pool to destroy.
	 * @param pAllocator     controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyDescriptorPool(VkDevice device, long descriptorPool, VkAllocationCallbacks pAllocator) {
		nvkDestroyDescriptorPool(device, descriptorPool, memAddressSafe(pAllocator));
	}

	// --- [ vkResetDescriptorPool ] ---

	/**
	 * Resets a descriptor pool object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To return all descriptor sets allocated from a given pool to the pool, rather than freeing individual descriptor sets, call:</p>
	 * 
	 * <pre><code>VkResult vkResetDescriptorPool(
    VkDevice                                    device,
    VkDescriptorPool                            descriptorPool,
    VkDescriptorPoolResetFlags                  flags);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Resetting a descriptor pool recycles all of the resources from all of the descriptor sets allocated from the descriptor pool back to the descriptor pool, and the descriptor sets are implicitly freed.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All uses of {@code descriptorPool} (via any allocated descriptor sets) <b>must</b> have completed execution</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
	 * <li>{@code flags} <b>must</b> be 0</li>
	 * <li>{@code descriptorPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
	 * <li>Host access to any {@code VkDescriptorSet} objects allocated from {@code descriptorPool} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device         the logical device that owns the descriptor pool.
	 * @param descriptorPool the descriptor pool to be reset.
	 * @param flags          reserved for future use.
	 */
	public static int vkResetDescriptorPool(VkDevice device, long descriptorPool, int flags) {
		long __functionAddress = device.getCapabilities().vkResetDescriptorPool;
		return callPJI(__functionAddress, device.address(), descriptorPool, flags);
	}

	// --- [ vkAllocateDescriptorSets ] ---

	/** Unsafe version of: {@link #vkAllocateDescriptorSets AllocateDescriptorSets} */
	public static int nvkAllocateDescriptorSets(VkDevice device, long pAllocateInfo, long pDescriptorSets) {
		long __functionAddress = device.getCapabilities().vkAllocateDescriptorSets;
		if ( CHECKS )
			VkDescriptorSetAllocateInfo.validate(pAllocateInfo);
		return callPPPI(__functionAddress, device.address(), pAllocateInfo, pDescriptorSets);
	}

	/**
	 * Allocate one or more descriptor sets.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To allocate descriptor sets from a descriptor pool, call:</p>
	 * 
	 * <pre><code>VkResult vkAllocateDescriptorSets(
    VkDevice                                    device,
    const VkDescriptorSetAllocateInfo*          pAllocateInfo,
    VkDescriptorSet*                            pDescriptorSets);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The allocated descriptor sets are returned in {@code pDescriptorSets}.</p>
	 * 
	 * <p>When a descriptor set is allocated, the initial state is largely uninitialized and all descriptors are undefined. However, the descriptor set <b>can</b> be bound in a command buffer without causing errors or exceptions. All entries that are statically used by a pipeline in a drawing or dispatching command <b>must</b> have been populated before the descriptor set is bound for use by that command. Entries that are not statically used by a pipeline <b>can</b> have uninitialized descriptors or descriptors of resources that have been destroyed, and executing a draw or dispatch with such a descriptor set bound does not cause undefined behavior. This means applications need not populate unused entries with dummy descriptors.</p>
	 * 
	 * <p>If an allocation fails due to fragmentation, an indeterminate error is returned with an unspecified error code. Any returned error other than {@link #VK_ERROR_FRAGMENTED_POOL ERROR_FRAGMENTED_POOL} does not imply its usual meaning: applications <b>should</b> assume that the allocation failed due to fragmentation, and create a new descriptor pool.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>should</b> check for a negative return value when allocating new descriptor sets, assume that any error effectively means {@link #VK_ERROR_FRAGMENTED_POOL ERROR_FRAGMENTED_POOL}, and try to create a new descriptor pool. If {@link #VK_ERROR_FRAGMENTED_POOL ERROR_FRAGMENTED_POOL} is the actual return value, it adds certainty to that decision.</p>
	 * 
	 * <p>The reason for this is that {@link #VK_ERROR_FRAGMENTED_POOL ERROR_FRAGMENTED_POOL} was only added in a later revision of the 1.0 specification, and so drivers <b>may</b> return other errors if they were written against earlier revisions. To ensure full compatibility with earlier patch revisions, these other errors are allowed.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pAllocateInfo} <b>must</b> be a pointer to a valid {@link VkDescriptorSetAllocateInfo} structure</li>
	 * <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code pAllocateInfo}::descriptorSetCount {@code VkDescriptorSet} handles</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pAllocateInfo}::descriptorPool <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link #VK_ERROR_FRAGMENTED_POOL ERROR_FRAGMENTED_POOL}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkDescriptorSetAllocateInfo}</p>
	 *
	 * @param device          the logical device that owns the descriptor pool.
	 * @param pAllocateInfo   a pointer to an instance of the {@link VkDescriptorSetAllocateInfo} structure describing parameters of the allocation.
	 * @param pDescriptorSets a pointer to an array of {@code VkDescriptorSet} handles in which the resulting descriptor set objects are returned. The array <b>must</b> be at least the length specified by the {@code descriptorSetCount} member of {@code pAllocateInfo}.
	 */
	public static int vkAllocateDescriptorSets(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, LongBuffer pDescriptorSets) {
		if ( CHECKS )
			checkBuffer(pDescriptorSets, pAllocateInfo.descriptorSetCount());
		return nvkAllocateDescriptorSets(device, pAllocateInfo.address(), memAddress(pDescriptorSets));
	}

	// --- [ vkFreeDescriptorSets ] ---

	/**
	 * Unsafe version of: {@link #vkFreeDescriptorSets FreeDescriptorSets}
	 *
	 * @param descriptorSetCount the number of elements in the {@code pDescriptorSets} array.
	 */
	public static int nvkFreeDescriptorSets(VkDevice device, long descriptorPool, int descriptorSetCount, long pDescriptorSets) {
		long __functionAddress = device.getCapabilities().vkFreeDescriptorSets;
		return callPJPI(__functionAddress, device.address(), descriptorPool, descriptorSetCount, pDescriptorSets);
	}

	/**
	 * Free one or more descriptor sets.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To free allocated descriptor sets, call:</p>
	 * 
	 * <pre><code>VkResult vkFreeDescriptorSets(
    VkDevice                                    device,
    VkDescriptorPool                            descriptorPool,
    uint32_t                                    descriptorSetCount,
    const VkDescriptorSet*                      pDescriptorSets);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>After a successful call to {@link #vkFreeDescriptorSets FreeDescriptorSets}, all descriptor sets in {@code pDescriptorSets} are invalid.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to any element of {@code pDescriptorSets} <b>must</b> have completed execution</li>
	 * <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code descriptorSetCount} {@code VkDescriptorSet} handles, each element of which <b>must</b> either be a valid handle or {@link #VK_NULL_HANDLE NULL_HANDLE}</li>
	 * <li>Each valid handle in {@code pDescriptorSets} <b>must</b> have been allocated from {@code descriptorPool}</li>
	 * <li>{@code descriptorPool} <b>must</b> have been created with the {@link #VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT} flag</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
	 * <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
	 * <li>{@code descriptorPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * <li>Each element of {@code pDescriptorSets} that is a valid handle <b>must</b> have been created, allocated, or retrieved from {@code descriptorPool}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
	 * <li>Host access to each member of {@code pDescriptorSets} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device          the logical device that owns the descriptor pool.
	 * @param descriptorPool  the descriptor pool from which the descriptor sets were allocated.
	 * @param pDescriptorSets an array of handles to {@code VkDescriptorSet} objects.
	 */
	public static int vkFreeDescriptorSets(VkDevice device, long descriptorPool, LongBuffer pDescriptorSets) {
		return nvkFreeDescriptorSets(device, descriptorPool, pDescriptorSets.remaining(), memAddress(pDescriptorSets));
	}

	/**
	 * Free one or more descriptor sets.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To free allocated descriptor sets, call:</p>
	 * 
	 * <pre><code>VkResult vkFreeDescriptorSets(
    VkDevice                                    device,
    VkDescriptorPool                            descriptorPool,
    uint32_t                                    descriptorSetCount,
    const VkDescriptorSet*                      pDescriptorSets);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>After a successful call to {@link #vkFreeDescriptorSets FreeDescriptorSets}, all descriptor sets in {@code pDescriptorSets} are invalid.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to any element of {@code pDescriptorSets} <b>must</b> have completed execution</li>
	 * <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code descriptorSetCount} {@code VkDescriptorSet} handles, each element of which <b>must</b> either be a valid handle or {@link #VK_NULL_HANDLE NULL_HANDLE}</li>
	 * <li>Each valid handle in {@code pDescriptorSets} <b>must</b> have been allocated from {@code descriptorPool}</li>
	 * <li>{@code descriptorPool} <b>must</b> have been created with the {@link #VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT} flag</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
	 * <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
	 * <li>{@code descriptorPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * <li>Each element of {@code pDescriptorSets} that is a valid handle <b>must</b> have been created, allocated, or retrieved from {@code descriptorPool}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
	 * <li>Host access to each member of {@code pDescriptorSets} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device         the logical device that owns the descriptor pool.
	 * @param descriptorPool the descriptor pool from which the descriptor sets were allocated.
	 */
	public static int vkFreeDescriptorSets(VkDevice device, long descriptorPool, long pDescriptorSet) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer pDescriptorSets = stack.longs(pDescriptorSet);
			return nvkFreeDescriptorSets(device, descriptorPool, 1, memAddress(pDescriptorSets));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ vkUpdateDescriptorSets ] ---

	/**
	 * Unsafe version of: {@link #vkUpdateDescriptorSets UpdateDescriptorSets}
	 *
	 * @param descriptorWriteCount the number of elements in the {@code pDescriptorWrites} array.
	 * @param descriptorCopyCount  the number of elements in the {@code pDescriptorCopies} array.
	 */
	public static void nvkUpdateDescriptorSets(VkDevice device, int descriptorWriteCount, long pDescriptorWrites, int descriptorCopyCount, long pDescriptorCopies) {
		long __functionAddress = device.getCapabilities().vkUpdateDescriptorSets;
		if ( CHECKS )
			if ( pDescriptorWrites != NULL ) VkWriteDescriptorSet.validate(pDescriptorWrites, descriptorWriteCount);
		callPPPV(__functionAddress, device.address(), descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies);
	}

	/**
	 * Update the contents of a descriptor set object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>Once allocated, descriptor sets <b>can</b> be updated with a combination of write and copy operations. To update descriptor sets, call:</p>
	 * 
	 * <pre><code>void vkUpdateDescriptorSets(
    VkDevice                                    device,
    uint32_t                                    descriptorWriteCount,
    const VkWriteDescriptorSet*                 pDescriptorWrites,
    uint32_t                                    descriptorCopyCount,
    const VkCopyDescriptorSet*                  pDescriptorCopies);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The operations described by {@code pDescriptorWrites} are performed first, followed by the operations described by {@code pDescriptorCopies}. Within each array, the operations are performed in the order they appear in the array.</p>
	 * 
	 * <p>Each element in the {@code pDescriptorWrites} array describes an operation updating the descriptor set using descriptors for resources specified in the structure.</p>
	 * 
	 * <p>Each element in the {@code pDescriptorCopies} array is a {@link VkCopyDescriptorSet} structure describing an operation copying descriptors between sets.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code descriptorWriteCount} is not 0, {@code pDescriptorWrites} <b>must</b> be a pointer to an array of {@code descriptorWriteCount} valid {@link VkWriteDescriptorSet} structures</li>
	 * <li>If {@code descriptorCopyCount} is not 0, {@code pDescriptorCopies} <b>must</b> be a pointer to an array of {@code descriptorCopyCount} valid {@link VkCopyDescriptorSet} structures</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pDescriptorWrites}[].dstSet <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pDescriptorCopies}[].dstSet <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkCopyDescriptorSet}, {@link VkWriteDescriptorSet}</p>
	 *
	 * @param device            the logical device that updates the descriptor sets.
	 * @param pDescriptorWrites a pointer to an array of {@link VkWriteDescriptorSet} structures describing the descriptor sets to write to.
	 * @param pDescriptorCopies a pointer to an array of {@link VkCopyDescriptorSet} structures describing the descriptor sets to copy between.
	 */
	public static void vkUpdateDescriptorSets(VkDevice device, VkWriteDescriptorSet.Buffer pDescriptorWrites, VkCopyDescriptorSet.Buffer pDescriptorCopies) {
		nvkUpdateDescriptorSets(device, remainingSafe(pDescriptorWrites), memAddressSafe(pDescriptorWrites), remainingSafe(pDescriptorCopies), memAddressSafe(pDescriptorCopies));
	}

	// --- [ vkCreateFramebuffer ] ---

	/** Unsafe version of: {@link #vkCreateFramebuffer CreateFramebuffer} */
	public static int nvkCreateFramebuffer(VkDevice device, long pCreateInfo, long pAllocator, long pFramebuffer) {
		long __functionAddress = device.getCapabilities().vkCreateFramebuffer;
		if ( CHECKS ) {
			VkFramebufferCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pFramebuffer);
	}

	/**
	 * Create a new framebuffer object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a framebuffer, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateFramebuffer(
    VkDevice                                    device,
    const VkFramebufferCreateInfo*              pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkFramebuffer*                              pFramebuffer);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkFramebufferCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pFramebuffer} <b>must</b> be a pointer to a {@code VkFramebuffer} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkFramebufferCreateInfo}</p>
	 *
	 * @param device       the logical device that creates the framebuffer.
	 * @param pCreateInfo  points to a {@link VkFramebufferCreateInfo} structure which describes additional information about framebuffer creation.
	 * @param pAllocator   controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pFramebuffer points to a {@code VkFramebuffer} handle in which the resulting framebuffer object is returned.
	 */
	public static int vkCreateFramebuffer(VkDevice device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pFramebuffer) {
		if ( CHECKS )
			checkBuffer(pFramebuffer, 1);
		return nvkCreateFramebuffer(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pFramebuffer));
	}

	// --- [ vkDestroyFramebuffer ] ---

	/** Unsafe version of: {@link #vkDestroyFramebuffer DestroyFramebuffer} */
	public static void nvkDestroyFramebuffer(VkDevice device, long framebuffer, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyFramebuffer;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), framebuffer, pAllocator);
	}

	/**
	 * Destroy a framebuffer object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a framebuffer, call:</p>
	 * 
	 * <pre><code>void vkDestroyFramebuffer(
    VkDevice                                    device,
    VkFramebuffer                               framebuffer,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code framebuffer} <b>must</b> have completed execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code framebuffer} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code framebuffer} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code framebuffer} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code framebuffer} <b>must</b> be a valid {@code VkFramebuffer} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code framebuffer} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code framebuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device      the logical device that destroys the framebuffer.
	 * @param framebuffer the handle of the framebuffer to destroy.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyFramebuffer(VkDevice device, long framebuffer, VkAllocationCallbacks pAllocator) {
		nvkDestroyFramebuffer(device, framebuffer, memAddressSafe(pAllocator));
	}

	// --- [ vkCreateRenderPass ] ---

	/** Unsafe version of: {@link #vkCreateRenderPass CreateRenderPass} */
	public static int nvkCreateRenderPass(VkDevice device, long pCreateInfo, long pAllocator, long pRenderPass) {
		long __functionAddress = device.getCapabilities().vkCreateRenderPass;
		if ( CHECKS ) {
			VkRenderPassCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pRenderPass);
	}

	/**
	 * Create a new render pass object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a render pass, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateRenderPass(
    VkDevice                                    device,
    const VkRenderPassCreateInfo*               pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkRenderPass*                               pRenderPass);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkRenderPassCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pRenderPass} <b>must</b> be a pointer to a {@code VkRenderPass} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkRenderPassCreateInfo}</p>
	 *
	 * @param device      the logical device that creates the render pass.
	 * @param pCreateInfo a pointer to an instance of the {@link VkRenderPassCreateInfo} structure that describes the parameters of the render pass.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pRenderPass points to a {@code VkRenderPass} handle in which the resulting render pass object is returned.
	 */
	public static int vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pRenderPass) {
		if ( CHECKS )
			checkBuffer(pRenderPass, 1);
		return nvkCreateRenderPass(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pRenderPass));
	}

	// --- [ vkDestroyRenderPass ] ---

	/** Unsafe version of: {@link #vkDestroyRenderPass DestroyRenderPass} */
	public static void nvkDestroyRenderPass(VkDevice device, long renderPass, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyRenderPass;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), renderPass, pAllocator);
	}

	/**
	 * Destroy a render pass object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a render pass, call:</p>
	 * 
	 * <pre><code>void vkDestroyRenderPass(
    VkDevice                                    device,
    VkRenderPass                                renderPass,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code renderPass} <b>must</b> have completed execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code renderPass} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code renderPass} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code renderPass} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code renderPass} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code renderPass} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the logical device that destroys the render pass.
	 * @param renderPass the handle of the render pass to destroy.
	 * @param pAllocator controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyRenderPass(VkDevice device, long renderPass, VkAllocationCallbacks pAllocator) {
		nvkDestroyRenderPass(device, renderPass, memAddressSafe(pAllocator));
	}

	// --- [ vkGetRenderAreaGranularity ] ---

	/** Unsafe version of: {@link #vkGetRenderAreaGranularity GetRenderAreaGranularity} */
	public static void nvkGetRenderAreaGranularity(VkDevice device, long renderPass, long pGranularity) {
		long __functionAddress = device.getCapabilities().vkGetRenderAreaGranularity;
		callPJPV(__functionAddress, device.address(), renderPass, pGranularity);
	}

	/**
	 * Returns the granularity for optimal render area.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query the render area granularity, call:</p>
	 * 
	 * <pre><code>void vkGetRenderAreaGranularity(
    VkDevice                                    device,
    VkRenderPass                                renderPass,
    VkExtent2D*                                 pGranularity);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The conditions leading to an optimal {@code renderArea} are:</p>
	 * 
	 * <ul>
	 * <li>the {@code offset.x} member in {@code renderArea} is a multiple of the {@code width} member of the returned {@link VkExtent2D} (the horizontal granularity).</li>
	 * <li>the {@code offset.y} member in {@code renderArea} is a multiple of the {@code height} of the returned {@link VkExtent2D} (the vertical granularity).</li>
	 * <li>either the {@code offset.width} member in {@code renderArea} is a multiple of the horizontal granularity or {@code offset.x}+{@code offset.width} is equal to the {@code width} of the {@code framebuffer} in the {@link VkRenderPassBeginInfo}.</li>
	 * <li>either the {@code offset.height} member in {@code renderArea} is a multiple of the vertical granularity or {@code offset.y}+{@code offset.height} is equal to the {@code height} of the {@code framebuffer} in the {@link VkRenderPassBeginInfo}.</li>
	 * </ul>
	 * 
	 * <p>Subpass dependencies are not affected by the render area, and apply to the entire image subresources attached to the framebuffer. Similarly, pipeline barriers are valid even if their effect extends outside the render area.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
	 * <li>{@code pGranularity} <b>must</b> be a pointer to a {@link VkExtent2D} structure</li>
	 * <li>{@code renderPass} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkExtent2D}</p>
	 *
	 * @param device       the logical device that owns the render pass.
	 * @param renderPass   a handle to a render pass.
	 * @param pGranularity points to a {@link VkExtent2D} structure in which the granularity is returned.
	 */
	public static void vkGetRenderAreaGranularity(VkDevice device, long renderPass, VkExtent2D pGranularity) {
		nvkGetRenderAreaGranularity(device, renderPass, pGranularity.address());
	}

	// --- [ vkCreateCommandPool ] ---

	/** Unsafe version of: {@link #vkCreateCommandPool CreateCommandPool} */
	public static int nvkCreateCommandPool(VkDevice device, long pCreateInfo, long pAllocator, long pCommandPool) {
		long __functionAddress = device.getCapabilities().vkCreateCommandPool;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pCommandPool);
	}

	/**
	 * Create a new command pool object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a command pool, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateCommandPool(
    VkDevice                                    device,
    const VkCommandPoolCreateInfo*              pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkCommandPool*                              pCommandPool);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkCommandPoolCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pCommandPool} <b>must</b> be a pointer to a {@code VkCommandPool} handle</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkCommandPoolCreateInfo}</p>
	 *
	 * @param device       the logical device that creates the command pool.
	 * @param pCreateInfo  contains information used to create the command pool.
	 * @param pAllocator   controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pCommandPool points to a {@code VkCommandPool} handle in which the created pool is returned.
	 */
	public static int vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pCommandPool) {
		if ( CHECKS )
			checkBuffer(pCommandPool, 1);
		return nvkCreateCommandPool(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pCommandPool));
	}

	// --- [ vkDestroyCommandPool ] ---

	/** Unsafe version of: {@link #vkDestroyCommandPool DestroyCommandPool} */
	public static void nvkDestroyCommandPool(VkDevice device, long commandPool, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyCommandPool;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), commandPool, pAllocator);
	}

	/**
	 * Destroy a command pool object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a command pool, call:</p>
	 * 
	 * <pre><code>void vkDestroyCommandPool(
    VkDevice                                    device,
    VkCommandPool                               commandPool,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>When a pool is destroyed, all command buffers allocated from the pool are implicitly freed and become invalid. Command buffers allocated from a given pool do not need to be freed before destroying that command pool.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All {@code VkCommandBuffer} objects allocated from {@code commandPool} <b>must</b> not be pending execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code commandPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code commandPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code commandPool} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code commandPool} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device      the logical device that destroys the command pool.
	 * @param commandPool the handle of the command pool to destroy.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyCommandPool(VkDevice device, long commandPool, VkAllocationCallbacks pAllocator) {
		nvkDestroyCommandPool(device, commandPool, memAddressSafe(pAllocator));
	}

	// --- [ vkResetCommandPool ] ---

	/**
	 * Reset a command pool.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To reset a command pool, call:</p>
	 * 
	 * <pre><code>VkResult vkResetCommandPool(
    VkDevice                                    device,
    VkCommandPool                               commandPool,
    VkCommandPoolResetFlags                     flags);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Resetting a command pool recycles all of the resources from all of the command buffers allocated from the command pool back to the command pool. All command buffers that have been allocated from the command pool are put in the initial state.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All {@code VkCommandBuffer} objects allocated from {@code commandPool} <b>must</b> not currently be pending execution</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandPoolResetFlagBits} values</li>
	 * <li>{@code commandPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device      the logical device that owns the command pool.
	 * @param commandPool the command pool to reset.
	 * @param flags       contains additional flags controlling the behavior of the reset. Bits which <b>can</b> be set include:
	 *                    
	 *                    <pre><code>typedef enum VkCommandPoolResetFlagBits {
    VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 0x00000001,
} VkCommandPoolResetFlagBits;</code></pre>
	 *                    
	 *                    <p>If {@code flags} includes {@link #VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT}, resetting a command pool recycles all of the resources from the command pool back to the system.</p>
	 */
	public static int vkResetCommandPool(VkDevice device, long commandPool, int flags) {
		long __functionAddress = device.getCapabilities().vkResetCommandPool;
		return callPJI(__functionAddress, device.address(), commandPool, flags);
	}

	// --- [ vkAllocateCommandBuffers ] ---

	/** Unsafe version of: {@link #vkAllocateCommandBuffers AllocateCommandBuffers} */
	public static int nvkAllocateCommandBuffers(VkDevice device, long pAllocateInfo, long pCommandBuffers) {
		long __functionAddress = device.getCapabilities().vkAllocateCommandBuffers;
		return callPPPI(__functionAddress, device.address(), pAllocateInfo, pCommandBuffers);
	}

	/**
	 * Allocate command buffers from an existing command pool.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To allocate command buffers, call:</p>
	 * 
	 * <pre><code>VkResult vkAllocateCommandBuffers(
    VkDevice                                    device,
    const VkCommandBufferAllocateInfo*          pAllocateInfo,
    VkCommandBuffer*                            pCommandBuffers);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pAllocateInfo} <b>must</b> be a pointer to a valid {@link VkCommandBufferAllocateInfo} structure</li>
	 * <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code pAllocateInfo}::commandBufferCount {@code VkCommandBuffer} handles</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pAllocateInfo}::commandPool <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkCommandBufferAllocateInfo}</p>
	 *
	 * @param device          the logical device that owns the command pool.
	 * @param pAllocateInfo   a pointer to an instance of the {@link VkCommandBufferAllocateInfo} structure describing parameters of the allocation.
	 * @param pCommandBuffers a pointer to an array of {@code VkCommandBuffer} handles in which the resulting command buffer objects are returned. The array <b>must</b> be at least the length specified by the {@code commandBufferCount} member of {@code pAllocateInfo}. Each allocated command buffer begins in the initial state.
	 */
	public static int vkAllocateCommandBuffers(VkDevice device, VkCommandBufferAllocateInfo pAllocateInfo, PointerBuffer pCommandBuffers) {
		if ( CHECKS )
			checkBuffer(pCommandBuffers, pAllocateInfo.commandBufferCount());
		return nvkAllocateCommandBuffers(device, pAllocateInfo.address(), memAddress(pCommandBuffers));
	}

	// --- [ vkFreeCommandBuffers ] ---

	/**
	 * Unsafe version of: {@link #vkFreeCommandBuffers FreeCommandBuffers}
	 *
	 * @param commandBufferCount the length of the {@code pCommandBuffers} array.
	 */
	public static void nvkFreeCommandBuffers(VkDevice device, long commandPool, int commandBufferCount, long pCommandBuffers) {
		long __functionAddress = device.getCapabilities().vkFreeCommandBuffers;
		callPJPV(__functionAddress, device.address(), commandPool, commandBufferCount, pCommandBuffers);
	}

	/**
	 * Free command buffers.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To free command buffers, call:</p>
	 * 
	 * <pre><code>void vkFreeCommandBuffers(
    VkDevice                                    device,
    VkCommandPool                               commandPool,
    uint32_t                                    commandBufferCount,
    const VkCommandBuffer*                      pCommandBuffers);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All elements of {@code pCommandBuffers} <b>must</b> not be pending execution</li>
	 * <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} {@code VkCommandBuffer} handles, each element of which <b>must</b> either be a valid handle or {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
	 * <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
	 * <li>{@code commandPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * <li>Each element of {@code pCommandBuffers} that is a valid handle <b>must</b> have been created, allocated, or retrieved from {@code commandPool}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
	 * <li>Host access to each member of {@code pCommandBuffers} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device          the logical device that owns the command pool.
	 * @param commandPool     the handle of the command pool that the command buffers were allocated from.
	 * @param pCommandBuffers an array of handles of command buffers to free.
	 */
	public static void vkFreeCommandBuffers(VkDevice device, long commandPool, PointerBuffer pCommandBuffers) {
		nvkFreeCommandBuffers(device, commandPool, pCommandBuffers.remaining(), memAddress(pCommandBuffers));
	}

	/**
	 * Free command buffers.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To free command buffers, call:</p>
	 * 
	 * <pre><code>void vkFreeCommandBuffers(
    VkDevice                                    device,
    VkCommandPool                               commandPool,
    uint32_t                                    commandBufferCount,
    const VkCommandBuffer*                      pCommandBuffers);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All elements of {@code pCommandBuffers} <b>must</b> not be pending execution</li>
	 * <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} {@code VkCommandBuffer} handles, each element of which <b>must</b> either be a valid handle or {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
	 * <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
	 * <li>{@code commandPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * <li>Each element of {@code pCommandBuffers} that is a valid handle <b>must</b> have been created, allocated, or retrieved from {@code commandPool}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
	 * <li>Host access to each member of {@code pCommandBuffers} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device      the logical device that owns the command pool.
	 * @param commandPool the handle of the command pool that the command buffers were allocated from.
	 */
	public static void vkFreeCommandBuffers(VkDevice device, long commandPool, VkCommandBuffer pCommandBuffer) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			PointerBuffer pCommandBuffers = stack.pointers(pCommandBuffer);
			nvkFreeCommandBuffers(device, commandPool, 1, memAddress(pCommandBuffers));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ vkBeginCommandBuffer ] ---

	/** Unsafe version of: {@link #vkBeginCommandBuffer BeginCommandBuffer} */
	public static int nvkBeginCommandBuffer(VkCommandBuffer commandBuffer, long pBeginInfo) {
		long __functionAddress = commandBuffer.getCapabilities().vkBeginCommandBuffer;
		return callPPI(__functionAddress, commandBuffer.address(), pBeginInfo);
	}

	/**
	 * Start recording a command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To begin recording a command buffer, call:</p>
	 * 
	 * <pre><code>VkResult vkBeginCommandBuffer(
    VkCommandBuffer                             commandBuffer,
    const VkCommandBufferBeginInfo*             pBeginInfo);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> not be in the recording state</li>
	 * <li>{@code commandBuffer} <b>must</b> not currently be pending execution</li>
	 * <li>If {@code commandBuffer} was allocated from a {@code VkCommandPool} which did not have the {@link #VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT} flag set, {@code commandBuffer} <b>must</b> be in the initial state</li>
	 * <li>If {@code commandBuffer} is a secondary command buffer, the {@code pInheritanceInfo} member of {@code pBeginInfo} <b>must</b> be a valid {@link VkCommandBufferInheritanceInfo} structure</li>
	 * <li>If {@code commandBuffer} is a secondary command buffer and either the {@code occlusionQueryEnable} member of the {@code pInheritanceInfo} member of {@code pBeginInfo} is {@link #VK_FALSE FALSE}, or the precise occlusion queries feature is not enabled, the {@code queryFlags} member of the {@code pInheritanceInfo} member {@code pBeginInfo} <b>must</b> not contain {@link #VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pBeginInfo} <b>must</b> be a pointer to a valid {@link VkCommandBufferBeginInfo} structure</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkCommandBufferBeginInfo}</p>
	 *
	 * @param commandBuffer the handle of the command buffer which is to be put in the recording state.
	 * @param pBeginInfo    an instance of the {@link VkCommandBufferBeginInfo} structure, which defines additional information about how the command buffer begins recording.
	 */
	public static int vkBeginCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo pBeginInfo) {
		return nvkBeginCommandBuffer(commandBuffer, pBeginInfo.address());
	}

	// --- [ vkEndCommandBuffer ] ---

	/**
	 * Finish recording a command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To complete recording of a command buffer, call:</p>
	 * 
	 * <pre><code>VkResult vkEndCommandBuffer(
    VkCommandBuffer                             commandBuffer);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If there was an error during recording, the application will be notified by an unsuccessful return code returned by {@link #vkEndCommandBuffer EndCommandBuffer}. If the application wishes to further use the command buffer, the command buffer <b>must</b> be reset.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>If {@code commandBuffer} is a primary command buffer, there <b>must</b> not be an active render pass instance</li>
	 * <li>All queries made <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a> during the recording of {@code commandBuffer} <b>must</b> have been made inactive</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param commandBuffer the command buffer to complete recording. The command buffer <b>must</b> have been in the recording state, and is moved to the executable state.
	 */
	public static int vkEndCommandBuffer(VkCommandBuffer commandBuffer) {
		long __functionAddress = commandBuffer.getCapabilities().vkEndCommandBuffer;
		return callPI(__functionAddress, commandBuffer.address());
	}

	// --- [ vkResetCommandBuffer ] ---

	/**
	 * Reset a command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To reset command buffers, call:</p>
	 * 
	 * <pre><code>VkResult vkResetCommandBuffer(
    VkCommandBuffer                             commandBuffer,
    VkCommandBufferResetFlags                   flags);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> not currently be pending execution</li>
	 * <li>{@code commandBuffer} <b>must</b> have been allocated from a pool that was created with the {@link #VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandBufferResetFlagBits} values</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link #VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param commandBuffer the command buffer to reset. The command buffer <b>can</b> be in any state, and is put in the initial state.
	 * @param flags         a bitmask controlling the reset operation. Bits which <b>can</b> be set include:
	 *                      
	 *                      <pre><code>typedef enum VkCommandBufferResetFlagBits {
    VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 0x00000001,
} VkCommandBufferResetFlagBits;</code></pre>
	 *                      
	 *                      <p>If {@code flags} includes {@link #VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT}, then most or all memory resources currently owned by the command buffer <b>should</b> be returned to the parent command pool. If this flag is not set, then the command buffer <b>may</b> hold onto memory resources and reuse them when recording commands.</p>
	 */
	public static int vkResetCommandBuffer(VkCommandBuffer commandBuffer, int flags) {
		long __functionAddress = commandBuffer.getCapabilities().vkResetCommandBuffer;
		return callPI(__functionAddress, commandBuffer.address(), flags);
	}

	// --- [ vkCmdBindPipeline ] ---

	/**
	 * Bind a pipeline object to a command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>Once a pipeline has been created, it <b>can</b> be bound to the command buffer using the command:</p>
	 * 
	 * <pre><code>void vkCmdBindPipeline(
    VkCommandBuffer                             commandBuffer,
    VkPipelineBindPoint                         pipelineBindPoint,
    VkPipeline                                  pipeline);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Once bound, a pipeline binding affects subsequent graphics or compute commands in the command buffer until a different pipeline is bound to the bind point. The pipeline bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} controls the behavior of {@link #vkCmdDispatch CmdDispatch} and {@link #vkCmdDispatchIndirect CmdDispatchIndirect}. The pipeline bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} controls the behavior of {@link #vkCmdDraw CmdDraw}, {@link #vkCmdDrawIndexed CmdDrawIndexed}, {@link #vkCmdDrawIndirect CmdDrawIndirect}, and {@link #vkCmdDrawIndexedIndirect CmdDrawIndexedIndirect}. No other commands are affected by the pipeline state.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code pipelineBindPoint} is {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
	 * <li>If {@code pipelineBindPoint} is {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>If {@code pipelineBindPoint} is {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, {@code pipeline} <b>must</b> be a compute pipeline</li>
	 * <li>If {@code pipelineBindPoint} is {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, {@code pipeline} <b>must</b> be a graphics pipeline</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-variableMultisampleRate">variable multisample rate</a> feature is not supported, {@code pipeline} is a graphics pipeline, the current subpass has no attachments, and this is not the first call to this function with a graphics pipeline after transitioning to the current subpass, then the sample count specified by this pipeline <b>must</b> match that set in the previous pipeline</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
	 * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>Both of {@code commandBuffer}, and {@code pipeline} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer     the command buffer that the pipeline will be bound to.
	 * @param pipelineBindPoint specifies the bind point, and <b>must</b> have one of the values
	 *                          
	 *                          <pre><code>typedef enum VkPipelineBindPoint {
    VK_PIPELINE_BIND_POINT_GRAPHICS = 0,
    VK_PIPELINE_BIND_POINT_COMPUTE = 1,
} VkPipelineBindPoint;</code></pre>
	 *                          
	 *                          <p>specifying whether {@code pipeline} will be bound as a compute ({@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}) or graphics ({@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}) pipeline. There are separate bind points for each of graphics and compute, so binding one does not disturb the other.</p>
	 * @param pipeline          the pipeline to be bound.
	 */
	public static void vkCmdBindPipeline(VkCommandBuffer commandBuffer, int pipelineBindPoint, long pipeline) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBindPipeline;
		callPJV(__functionAddress, commandBuffer.address(), pipelineBindPoint, pipeline);
	}

	// --- [ vkCmdSetViewport ] ---

	/**
	 * Unsafe version of: {@link #vkCmdSetViewport CmdSetViewport}
	 *
	 * @param viewportCount the number of viewports whose parameters are updated by the command.
	 */
	public static void nvkCmdSetViewport(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pViewports) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewport;
		callPPV(__functionAddress, commandBuffer.address(), firstViewport, viewportCount, pViewports);
	}

	/**
	 * Set the viewport on a command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>If the bound pipeline state object was not created with the {@link #VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT} dynamic state enabled, viewport transformation parameters are specified using the {@code pViewports} member of {@link VkPipelineViewportStateCreateInfo} in the pipeline state object. If the pipeline state object was created with the {@link #VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT} dynamic state enabled, the viewport transformation parameters are dynamically set and changed with the command:</p>
	 * 
	 * <pre><code>void vkCmdSetViewport(
    VkCommandBuffer                             commandBuffer,
    uint32_t                                    firstViewport,
    uint32_t                                    viewportCount,
    const VkViewport*                           pViewports);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The viewport parameters taken from element <code>i</code> of {@code pViewports} replace the current state for the viewport index <code>firstViewport {plus} i</code>, for <code>i</code> in <code>[0, viewportCount)</code>.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The currently bound graphics pipeline <b>must</b> have been created with the {@link #VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT} dynamic state enabled</li>
	 * <li>{@code firstViewport} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxViewports}</li>
	 * <li>The sum of {@code firstViewport} and {@code viewportCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
	 * <li>{@code pViewports} <b>must</b> be a pointer to an array of {@code viewportCount} valid {@link VkViewport} structures</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>{@code viewportCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkViewport}</p>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param firstViewport the index of the first viewport whose parameters are updated by the command.
	 * @param pViewports    a pointer to an array of {@link VkViewport} structures specifying viewport parameters.
	 */
	public static void vkCmdSetViewport(VkCommandBuffer commandBuffer, int firstViewport, VkViewport.Buffer pViewports) {
		nvkCmdSetViewport(commandBuffer, firstViewport, pViewports.remaining(), pViewports.address());
	}

	// --- [ vkCmdSetScissor ] ---

	/**
	 * Unsafe version of: {@link #vkCmdSetScissor CmdSetScissor}
	 *
	 * @param scissorCount the number of scissors whose rectangles are updated by the command.
	 */
	public static void nvkCmdSetScissor(VkCommandBuffer commandBuffer, int firstScissor, int scissorCount, long pScissors) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetScissor;
		callPPV(__functionAddress, commandBuffer.address(), firstScissor, scissorCount, pScissors);
	}

	/**
	 * Set the dynamic scissor rectangles on a command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>The scissor test determines if a fragment's framebuffer coordinates <code>(x<sub>f</sub>,y<sub>f</sub>)</code> lie within the scissor rectangle corresponding to the viewport index (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#vertexpostproc-viewport">Controlling the Viewport</a>) used by the primitive that generated the fragment. If the pipeline state object is created without {@link #VK_DYNAMIC_STATE_SCISSOR DYNAMIC_STATE_SCISSOR} enabled then the scissor rectangles are set by the {@link VkPipelineViewportStateCreateInfo} state of the pipeline state object. Otherwise, to dynamically set the scissor rectangles call:</p>
	 * 
	 * <pre><code>void vkCmdSetScissor(
    VkCommandBuffer                             commandBuffer,
    uint32_t                                    firstScissor,
    uint32_t                                    scissorCount,
    const VkRect2D*                             pScissors);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The scissor rectangles taken from element <code>i</code> of {@code pScissors} replace the current state for the scissor index <code>firstScissor + i</code>, for <code>i</code> in <code>[0, scissorCount)</code>.</p>
	 * 
	 * <p>Each scissor rectangle is described by a {@link VkRect2D} structure, with the {@code offset.x} and {@code offset.y} values determining the upper left corner of the scissor rectangle, and the {@code extent.width} and {@code extent.height} values determining the size in pixels.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The currently bound graphics pipeline <b>must</b> have been created with the {@link #VK_DYNAMIC_STATE_SCISSOR DYNAMIC_STATE_SCISSOR} dynamic state enabled</li>
	 * <li>{@code firstScissor} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxViewports}</li>
	 * <li>The sum of {@code firstScissor} and {@code scissorCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
	 * <li>The {@code x} and {@code y} members of {@code offset} <b>must</b> be greater than or equal to 0</li>
	 * <li>Evaluation of ({@code offset.x} + {@code extent.width}) <b>must</b> not cause a signed integer addition overflow</li>
	 * <li>Evaluation of ({@code offset.y} + {@code extent.height}) <b>must</b> not cause a signed integer addition overflow</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pScissors} <b>must</b> be a pointer to an array of {@code scissorCount} {@link VkRect2D} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>{@code scissorCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkRect2D}</p>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param firstScissor  the index of the first scissor whose state is updated by the command.
	 * @param pScissors     a pointer to an array of {@link VkRect2D} structures defining scissor rectangles.
	 */
	public static void vkCmdSetScissor(VkCommandBuffer commandBuffer, int firstScissor, VkRect2D.Buffer pScissors) {
		nvkCmdSetScissor(commandBuffer, firstScissor, pScissors.remaining(), pScissors.address());
	}

	// --- [ vkCmdSetLineWidth ] ---

	/**
	 * Set the dynamic line width state.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>The line width is set by the {@code lineWidth} property of {@link VkPipelineRasterizationStateCreateInfo} in the currently active pipeline if the pipeline was not created with {@link #VK_DYNAMIC_STATE_LINE_WIDTH DYNAMIC_STATE_LINE_WIDTH} enabled. Otherwise, the line width is set by calling {@link #vkCmdSetLineWidth CmdSetLineWidth}:</p>
	 * 
	 * <pre><code>void vkCmdSetLineWidth(
    VkCommandBuffer                             commandBuffer,
    float                                       lineWidth);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The currently bound graphics pipeline <b>must</b> have been created with the {@link #VK_DYNAMIC_STATE_LINE_WIDTH DYNAMIC_STATE_LINE_WIDTH} dynamic state enabled</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-wideLines">wide lines</a> feature is not enabled, {@code lineWidth} <b>must</b> be {@code 1.0}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param lineWidth     the width of rasterized line segments.
	 */
	public static void vkCmdSetLineWidth(VkCommandBuffer commandBuffer, float lineWidth) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineWidth;
		callPV(__functionAddress, commandBuffer.address(), lineWidth);
	}

	// --- [ vkCmdSetDepthBias ] ---

	/**
	 * Set the depth bias dynamic state.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>The depth values of all fragments generated by the rasterization of a polygon <b>can</b> be offset by a single value that is computed for that polygon. This behavior is controlled by the {@code depthBiasEnable}, {@code depthBiasConstantFactor}, {@code depthBiasClamp}, and {@code depthBiasSlopeFactor} members of {@link VkPipelineRasterizationStateCreateInfo}, or by the corresponding parameters to the {@link #vkCmdSetDepthBias CmdSetDepthBias} command if depth bias state is dynamic.</p>
	 * 
	 * <pre><code>void vkCmdSetDepthBias(
    VkCommandBuffer                             commandBuffer,
    float                                       depthBiasConstantFactor,
    float                                       depthBiasClamp,
    float                                       depthBiasSlopeFactor);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If {@code depthBiasEnable} is {@link #VK_FALSE FALSE}, no depth bias is applied and the fragment's depth values are unchanged.</p>
	 * 
	 * <p>{@code depthBiasSlopeFactor} scales the maximum depth slope of the polygon, and {@code depthBiasConstantFactor} scales an implementation-dependent constant that relates to the usable resolution of the depth buffer. The resulting values are summed to produce the depth bias value which is then clamped to a minimum or maximum value specified by {@code depthBiasClamp}. {@code depthBiasSlopeFactor}, {@code depthBiasConstantFactor}, and {@code depthBiasClamp} <b>can</b> each be positive, negative, or zero.</p>
	 * 
	 * <p>The maximum depth slope <code>m</code> of a triangle is</p>
	 * 
	 * <pre><code>      m = sqrt((&part;z<sub>f</sub> / &part;x<sub>f</sub>)<sup>2</sup> + (&part;z<sub>f</sub> / &part;y<sub>f</sub>)<sup>2</sup>)</code></pre>
	 * 
	 * <p>where <code>(x<sub>f</sub>, y<sub>f</sub>, z<sub>f</sub>)</code> is a point on the triangle. <code>m</code> <b>may</b> be approximated as</p>
	 * 
	 * <pre><code>      m = max(abs(&part;z<sub>f</sub> / &part;x<sub>f</sub>), abs(&part;z<sub>f</sub> / &part;y<sub>f</sub>))</code></pre>
	 * 
	 * <p>The minimum resolvable difference <code>r</code> is an implementation-dependent parameter that depends on the depth buffer representation. It is the smallest difference in framebuffer coordinate <code>z</code> values that is guaranteed to remain distinct throughout polygon rasterization and in the depth buffer. All pairs of fragments generated by the rasterization of two polygons with otherwise identical vertices, but <code>z<sub>f</sub></code> values that differ by <code>r</code>, will have distinct depth values.</p>
	 * 
	 * <p>For fixed-point depth buffer representations, <code>r</code> is constant throughout the range of the entire depth buffer. For floating-point depth buffers, there is no single minimum resolvable difference. In this case, the minimum resolvable difference for a given polygon is dependent on the maximum exponent, <code>e</code>, in the range of <code>z</code> values spanned by the primitive. If <code>n</code> is the number of bits in the floating-point mantissa, the minimum resolvable difference, <code>r</code>, for the given primitive is defined as</p>
	 * 
	 * <dl>
	 * <dd><code>r = 2<sup>e-n</sup></code></dd>
	 * </dl>
	 * 
	 * <p>If no depth buffer is present, <code>r</code> is undefined.</p>
	 * 
	 * <p>The bias value <code>o</code> for a polygon is</p>
	 * 
	 * <pre><code>        m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor                     depthBiasClamp = 0 or NaN
o = min(m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor, depthBiasClamp)    depthBiasClamp &gt; 0
    max(m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor, depthBiasClamp)    depthBiasClamp &lt; 0</code></pre>
	 * 
	 * <p><code>m</code> is computed as described above. If the depth buffer uses a fixed-point representation, <code>m</code> is a function of depth values in the range <code>[0,1]</code>, and <code>o</code> is applied to depth values in the same range.</p>
	 * 
	 * <p>For fixed-point depth buffers, fragment depth values are always limited to the range <code>[0,1]</code> by clamping after depth bias addition is performed. Fragment depth values are clamped even when the depth buffer uses a floating-point representation.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The currently bound graphics pipeline <b>must</b> have been created with the {@link #VK_DYNAMIC_STATE_DEPTH_BIAS DYNAMIC_STATE_DEPTH_BIAS} dynamic state enabled</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-depthBiasClamp">depth bias clamping</a> feature is not enabled, {@code depthBiasClamp} <b>must</b> be {@code 0.0}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer           the command buffer into which the command will be recorded.
	 * @param depthBiasConstantFactor a scalar factor controlling the constant depth value added to each fragment.
	 * @param depthBiasClamp          the maximum (or minimum) depth bias of a fragment.
	 * @param depthBiasSlopeFactor    a scalar factor applied to a fragment&#8217;s slope in depth bias calculations.
	 */
	public static void vkCmdSetDepthBias(VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBias;
		callPV(__functionAddress, commandBuffer.address(), depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor);
	}

	// --- [ vkCmdSetBlendConstants ] ---

	/** Unsafe version of: {@link #vkCmdSetBlendConstants CmdSetBlendConstants} */
	public static void nvkCmdSetBlendConstants(VkCommandBuffer commandBuffer, long blendConstants) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetBlendConstants;
		callPPV(__functionAddress, commandBuffer.address(), blendConstants);
	}

	/**
	 * Set the values of blend constants.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>Otherwise, to dynamically set and change the blend constant, call:</p>
	 * 
	 * <pre><code>void vkCmdSetBlendConstants(
    VkCommandBuffer                             commandBuffer,
    const float                                 blendConstants[4]);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The currently bound graphics pipeline <b>must</b> have been created with the {@link #VK_DYNAMIC_STATE_BLEND_CONSTANTS DYNAMIC_STATE_BLEND_CONSTANTS} dynamic state enabled</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded.
	 * @param blendConstants an array of four values specifying the R, G, B, and A components of the blend constant color used in blending, depending on the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#framebuffer-blendfactors">blend factor</a>.
	 */
	public static void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, FloatBuffer blendConstants) {
		if ( CHECKS )
			checkBuffer(blendConstants, 4);
		nvkCmdSetBlendConstants(commandBuffer, memAddress(blendConstants));
	}

	// --- [ vkCmdSetDepthBounds ] ---

	/**
	 * Set the depth bounds test values for a command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>The depth bounds test conditionally disables coverage of a sample based on the outcome of a comparison between the value <code>z<sub>a</sub></code> in the depth attachment at location <code>(x<sub>f</sub>,y<sub>f</sub>)</code> (for the appropriate sample) and a range of values. The test is enabled or disabled by the {@code depthBoundsTestEnable} member of {@link VkPipelineDepthStencilStateCreateInfo}: If the pipeline state object is created without the {@link #VK_DYNAMIC_STATE_DEPTH_BOUNDS DYNAMIC_STATE_DEPTH_BOUNDS} dynamic state enabled then the range of values used in the depth bounds test are defined by the {@code minDepthBounds} and {@code maxDepthBounds} members of the {@link VkPipelineDepthStencilStateCreateInfo} structure. Otherwise, to dynamically set the depth bounds range values call:</p>
	 * 
	 * <pre><code>void vkCmdSetDepthBounds(
    VkCommandBuffer                             commandBuffer,
    float                                       minDepthBounds,
    float                                       maxDepthBounds);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The currently bound graphics pipeline <b>must</b> have been created with the {@link #VK_DYNAMIC_STATE_DEPTH_BOUNDS DYNAMIC_STATE_DEPTH_BOUNDS} dynamic state enabled</li>
	 * <li>{@code minDepthBounds} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
	 * <li>{@code maxDepthBounds} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded.
	 * @param minDepthBounds the lower bound of the range of depth values used in the depth bounds test.
	 * @param maxDepthBounds the upper bound of the range.
	 */
	public static void vkCmdSetDepthBounds(VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBounds;
		callPV(__functionAddress, commandBuffer.address(), minDepthBounds, maxDepthBounds);
	}

	// --- [ vkCmdSetStencilCompareMask ] ---

	/**
	 * Set the stencil compare mask dynamic state.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>If the pipeline state object is created with the {@link #VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK DYNAMIC_STATE_STENCIL_COMPARE_MASK} dynamic state enabled, then to dynamically set the stencil compare mask call:</p>
	 * 
	 * <pre><code>void vkCmdSetStencilCompareMask(
    VkCommandBuffer                             commandBuffer,
    VkStencilFaceFlags                          faceMask,
    uint32_t                                    compareMask);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The currently bound graphics pipeline <b>must</b> have been created with the {@link #VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK DYNAMIC_STATE_STENCIL_COMPARE_MASK} dynamic state enabled</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
	 * <li>{@code faceMask} <b>must</b> not be 0</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param faceMask      a bitmask specifying the set of stencil state for which to update the compare mask. Bits which <b>can</b> be set include:
	 *                      
	 *                      <pre><code>typedef enum VkStencilFaceFlagBits {
    VK_STENCIL_FACE_FRONT_BIT = 0x00000001,
    VK_STENCIL_FACE_BACK_BIT = 0x00000002,
    VK_STENCIL_FRONT_AND_BACK = 0x00000003,
} VkStencilFaceFlagBits;</code></pre>
	 *                      
	 *                      <ul>
	 *                      <li>{@link #VK_STENCIL_FACE_FRONT_BIT STENCIL_FACE_FRONT_BIT} indicates that only the front set of stencil state is updated.</li>
	 *                      <li>{@link #VK_STENCIL_FACE_BACK_BIT STENCIL_FACE_BACK_BIT} indicates that only the back set of stencil state is updated.</li>
	 *                      <li>{@link #VK_STENCIL_FRONT_AND_BACK STENCIL_FRONT_AND_BACK} is the combination of {@link #VK_STENCIL_FACE_FRONT_BIT STENCIL_FACE_FRONT_BIT} and {@link #VK_STENCIL_FACE_BACK_BIT STENCIL_FACE_BACK_BIT} and indicates that both sets of stencil state are updated.</li>
	 *                      </ul>
	 * @param compareMask   the new value to use as the stencil compare mask.
	 */
	public static void vkCmdSetStencilCompareMask(VkCommandBuffer commandBuffer, int faceMask, int compareMask) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilCompareMask;
		callPV(__functionAddress, commandBuffer.address(), faceMask, compareMask);
	}

	// --- [ vkCmdSetStencilWriteMask ] ---

	/**
	 * Set the stencil write mask dynamic state.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>If the pipeline state object is created with the {@link #VK_DYNAMIC_STATE_STENCIL_WRITE_MASK DYNAMIC_STATE_STENCIL_WRITE_MASK} dynamic state enabled, then to dynamically set the stencil write mask call:</p>
	 * 
	 * <pre><code>void vkCmdSetStencilWriteMask(
    VkCommandBuffer                             commandBuffer,
    VkStencilFaceFlags                          faceMask,
    uint32_t                                    writeMask);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The currently bound graphics pipeline <b>must</b> have been created with the {@link #VK_DYNAMIC_STATE_STENCIL_WRITE_MASK DYNAMIC_STATE_STENCIL_WRITE_MASK} dynamic state enabled</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
	 * <li>{@code faceMask} <b>must</b> not be 0</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param faceMask      a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the write mask, as described above for {@link #vkCmdSetStencilCompareMask CmdSetStencilCompareMask}.
	 * @param writeMask     the new value to use as the stencil write mask.
	 */
	public static void vkCmdSetStencilWriteMask(VkCommandBuffer commandBuffer, int faceMask, int writeMask) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilWriteMask;
		callPV(__functionAddress, commandBuffer.address(), faceMask, writeMask);
	}

	// --- [ vkCmdSetStencilReference ] ---

	/**
	 * Set the stencil reference dynamic state.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>If the pipeline state object is created with the {@link #VK_DYNAMIC_STATE_STENCIL_REFERENCE DYNAMIC_STATE_STENCIL_REFERENCE} dynamic state enabled, then to dynamically set the stencil reference value call:</p>
	 * 
	 * <pre><code>void vkCmdSetStencilReference(
    VkCommandBuffer                             commandBuffer,
    VkStencilFaceFlags                          faceMask,
    uint32_t                                    reference);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The currently bound graphics pipeline <b>must</b> have been created with the {@link #VK_DYNAMIC_STATE_STENCIL_REFERENCE DYNAMIC_STATE_STENCIL_REFERENCE} dynamic state enabled</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
	 * <li>{@code faceMask} <b>must</b> not be 0</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param faceMask      a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the reference value, as described above for {@link #vkCmdSetStencilCompareMask CmdSetStencilCompareMask}.
	 * @param reference     the new value to use as the stencil reference value.
	 */
	public static void vkCmdSetStencilReference(VkCommandBuffer commandBuffer, int faceMask, int reference) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilReference;
		callPV(__functionAddress, commandBuffer.address(), faceMask, reference);
	}

	// --- [ vkCmdBindDescriptorSets ] ---

	/**
	 * Unsafe version of: {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}
	 *
	 * @param descriptorSetCount the number of elements in the {@code pDescriptorSets} array.
	 * @param dynamicOffsetCount the number of dynamic offsets in the {@code pDynamicOffsets} array.
	 */
	public static void nvkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, int descriptorSetCount, long pDescriptorSets, int dynamicOffsetCount, long pDynamicOffsets) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets;
		callPJPPV(__functionAddress, commandBuffer.address(), pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets);
	}

	/**
	 * Binds descriptor sets to a command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To bind one or more descriptor sets to a command buffer, call:</p>
	 * 
	 * <pre><code>void vkCmdBindDescriptorSets(
    VkCommandBuffer                             commandBuffer,
    VkPipelineBindPoint                         pipelineBindPoint,
    VkPipelineLayout                            layout,
    uint32_t                                    firstSet,
    uint32_t                                    descriptorSetCount,
    const VkDescriptorSet*                      pDescriptorSets,
    uint32_t                                    dynamicOffsetCount,
    const uint32_t*                             pDynamicOffsets);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkCmdBindDescriptorSets CmdBindDescriptorSets} causes the sets numbered [{@code firstSet}.. {@code firstSet}+{@code descriptorSetCount}-1] to use the bindings stored in {@code pDescriptorSets}[0..{@code descriptorSetCount}-1] for subsequent rendering commands (either compute or graphics, according to the {@code pipelineBindPoint}). Any bindings that were previously applied via these sets are no longer valid.</p>
	 * 
	 * <p>Once bound, a descriptor set affects rendering of subsequent graphics or compute commands in the command buffer until a different set is bound to the same set number, or else until the set is disturbed as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility"> Pipeline Layout Compatibility</a>.</p>
	 * 
	 * <p>A compatible descriptor set <b>must</b> be bound for all set numbers that any shaders in a pipeline access, at the time that a draw or dispatch command is recorded to execute using that pipeline. However, if none of the shaders in a pipeline statically use any bindings with a particular set number, then no descriptor set need be bound for that set number, even if the pipeline layout includes a non-trivial descriptor set layout for that set number.</p>
	 * 
	 * <p>If any of the sets being bound include dynamic uniform or storage buffers, then {@code pDynamicOffsets} includes one element for each array element in each dynamic descriptor type binding in each set. Values are taken from {@code pDynamicOffsets} in an order such that all entries for set N come before set N+1; within a set, entries are ordered by the binding numbers in the descriptor set layouts; and within a binding array, elements are in order. {@code dynamicOffsetCount} <b>must</b> equal the total number of dynamic descriptors in the sets being bound.</p>
	 * 
	 * <p>The effective offset used for dynamic uniform and storage buffer bindings is the sum of the relative offset taken from {@code pDynamicOffsets}, and the base address of the buffer plus base offset in the descriptor set. The length of the dynamic uniform and storage buffer bindings is the buffer range as specified in the descriptor set.</p>
	 * 
	 * <p>Each of the {@code pDescriptorSets} <b>must</b> be compatible with the pipeline layout specified by {@code layout}. The layout used to program the bindings <b>must</b> also be compatible with the pipeline used in subsequent graphics or compute commands, as defined in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility"> Pipeline Layout Compatibility</a> section.</p>
	 * 
	 * <p>The descriptor set contents bound by a call to {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets} <b>may</b> be consumed during host execution of the command, or during shader execution of the resulting draws, or any time in between. Thus, the contents <b>must</b> not be altered (overwritten by an update command, or freed) between when the command is recorded and when the command completes executing on the queue. The contents of {@code pDynamicOffsets} are consumed immediately during execution of {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}. Once all pending uses have completed, it is legal to update and reuse a descriptor set.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>Any given element of {@code pDescriptorSets} <b>must</b> have been allocated with a {@code VkDescriptorSetLayout} that matches (is the same as, or defined identically to) the {@code VkDescriptorSetLayout} at set <em>n</em> in {@code layout}, where <em>n</em> is the sum of {@code firstSet} and the index into {@code pDescriptorSets}</li>
	 * <li>{@code dynamicOffsetCount} <b>must</b> be equal to the total number of dynamic descriptors in {@code pDescriptorSets}</li>
	 * <li>The sum of {@code firstSet} and {@code descriptorSetCount} <b>must</b> be less than or equal to {@link VkPipelineLayoutCreateInfo}{@code ::setLayoutCount} provided when {@code layout} was created</li>
	 * <li>{@code pipelineBindPoint} <b>must</b> be supported by the {@code commandBuffer}&#8217;s parent {@code VkCommandPool}&#8217;s queue family</li>
	 * <li>Any given element of {@code pDynamicOffsets} <b>must</b> satisfy the required alignment for the corresponding descriptor binding&#8217;s descriptor type</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
	 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code descriptorSetCount} valid {@code VkDescriptorSet} handles</li>
	 * <li>If {@code dynamicOffsetCount} is not 0, {@code pDynamicOffsets} <b>must</b> be a pointer to an array of {@code dynamicOffsetCount} {@code uint32_t} values</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code layout}, and the elements of {@code pDescriptorSets} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer     the command buffer that the descriptor sets will be bound to.
	 * @param pipelineBindPoint a {@code VkPipelineBindPoint} indicating whether the descriptors will be used by graphics pipelines or compute pipelines. There is a separate set of bind points for each of graphics and compute, so binding one does not disturb the other.
	 * @param layout            a {@code VkPipelineLayout} object used to program the bindings.
	 * @param firstSet          the set number of the first descriptor set to be bound.
	 * @param pDescriptorSets   an array of handles to {@code VkDescriptorSet} objects describing the descriptor sets to write to.
	 * @param pDynamicOffsets   a pointer to an array of {@code uint32_t} values specifying dynamic offsets.
	 */
	public static void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, LongBuffer pDescriptorSets, IntBuffer pDynamicOffsets) {
		nvkCmdBindDescriptorSets(commandBuffer, pipelineBindPoint, layout, firstSet, pDescriptorSets.remaining(), memAddress(pDescriptorSets), remainingSafe(pDynamicOffsets), memAddressSafe(pDynamicOffsets));
	}

	// --- [ vkCmdBindIndexBuffer ] ---

	/**
	 * Bind an index buffer to a command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To bind an index buffer to a command buffer, call:</p>
	 * 
	 * <pre><code>void vkCmdBindIndexBuffer(
    VkCommandBuffer                             commandBuffer,
    VkBuffer                                    buffer,
    VkDeviceSize                                offset,
    VkIndexType                                 indexType);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
	 * <li>The sum of {@code offset} and the address of the range of {@code VkDeviceMemory} object that is backing {@code buffer}, <b>must</b> be a multiple of the type indicated by {@code indexType}</li>
	 * <li>{@code buffer} <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_INDEX_BUFFER_BIT BUFFER_USAGE_INDEX_BUFFER_BIT} flag</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded.
	 * @param buffer        the buffer being bound.
	 * @param offset        the starting offset in bytes within {@code buffer} used in index buffer address calculations.
	 * @param indexType     selects whether indices are treated as 16 bits or 32 bits. Possible values include:
	 *                      
	 *                      <pre><code>typedef enum VkIndexType {
    VK_INDEX_TYPE_UINT16 = 0,
    VK_INDEX_TYPE_UINT32 = 1,
} VkIndexType;</code></pre>
	 */
	public static void vkCmdBindIndexBuffer(VkCommandBuffer commandBuffer, long buffer, long offset, int indexType) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBindIndexBuffer;
		callPJJV(__functionAddress, commandBuffer.address(), buffer, offset, indexType);
	}

	// --- [ vkCmdBindVertexBuffers ] ---

	/**
	 * Unsafe version of: {@link #vkCmdBindVertexBuffers CmdBindVertexBuffers}
	 *
	 * @param bindingCount the number of vertex input bindings whose state is updated by the command.
	 */
	public static void nvkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers;
		callPPPV(__functionAddress, commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets);
	}

	/**
	 * Bind vertex buffers to a command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To bind vertex buffers to a command buffer for use in subsequent draw commands, call:</p>
	 * 
	 * <pre><code>void vkCmdBindVertexBuffers(
    VkCommandBuffer                             commandBuffer,
    uint32_t                                    firstBinding,
    uint32_t                                    bindingCount,
    const VkBuffer*                             pBuffers,
    const VkDeviceSize*                         pOffsets);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The values taken from elements <code>i</code> of {@code pBuffers} and {@code pOffsets} replace the current state for the vertex input binding <code>firstBinding + i</code>, for <code>i</code> in <code>[0, bindingCount)</code>. The vertex input binding is updated to start at the offset indicated by {@code pOffsets}[i] from the start of the buffer {@code pBuffers}[i]. All vertex input attributes that use each of these bindings will use these updated addresses in their address calculations for subsequent draw commands.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code firstBinding} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
	 * <li>The sum of {@code firstBinding} and {@code bindingCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
	 * <li>All elements of {@code pOffsets} <b>must</b> be less than the size of the corresponding element in {@code pBuffers}</li>
	 * <li>All elements of {@code pBuffers} <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_VERTEX_BUFFER_BIT BUFFER_USAGE_VERTEX_BUFFER_BIT} flag</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pBuffers} <b>must</b> be a pointer to an array of {@code bindingCount} valid {@code VkBuffer} handles</li>
	 * <li>{@code pOffsets} <b>must</b> be a pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>{@code bindingCount} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and the elements of {@code pBuffers} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded.
	 * @param firstBinding  the index of the first vertex input binding whose state is updated by the command.
	 * @param pBuffers      a pointer to an array of buffer handles.
	 * @param pOffsets      a pointer to an array of buffer offsets.
	 */
	public static void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, int firstBinding, LongBuffer pBuffers, LongBuffer pOffsets) {
		if ( CHECKS )
			checkBuffer(pOffsets, pBuffers.remaining());
		nvkCmdBindVertexBuffers(commandBuffer, firstBinding, pBuffers.remaining(), memAddress(pBuffers), memAddress(pOffsets));
	}

	// --- [ vkCmdDraw ] ---

	/**
	 * Draw primitives.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To record a non-indexed draw, call:</p>
	 * 
	 * <pre><code>void vkCmdDraw(
    VkCommandBuffer                             commandBuffer,
    uint32_t                                    vertexCount,
    uint32_t                                    instanceCount,
    uint32_t                                    firstVertex,
    uint32_t                                    firstInstance);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>When the command is executed, primitives are assembled using the current primitive topology and {@code vertexCount} consecutive vertex indices with the first {@code vertexIndex} value equal to {@code firstVertex}. The primitives are drawn {@code instanceCount} times with {@code instanceIndex} starting with {@code firstInstance} and increasing sequentially for each instance. The assembled primitives execute the currently bound graphics pipeline.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The current render pass <b>must</b> be <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
	 * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
	 * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a descriptor set <b>must</b> have been bound to <em>n</em> at {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
	 * <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a push constant value <b>must</b> have been set for {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
	 * <li>Descriptors in each bound descriptor set, specified via {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via {@link #vkCmdBindPipeline CmdBindPipeline}</li>
	 * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
	 * <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#fxvertex-input">the “Vertex Input Description” section</a></li>
	 * <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
	 * <li>If the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} requires any dynamic state, that state <b>must</b> have been set on the current command buffer</li>
	 * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link #VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link #VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
	 * <li>Any {@code VkImageView} being sampled with {@link #VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>Any {@code VkImageView} being sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command <b>must</b> be of a format which supports cubic filtering, as specified by the {@link IMGFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>Any {@code VkImageView} being sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command <b>must</b> not have a {@code VkImageViewType} of {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded.
	 * @param vertexCount   the number of vertices to draw.
	 * @param instanceCount the number of instances to draw.
	 * @param firstVertex   the index of the first vertex to draw.
	 * @param firstInstance the instance ID of the first instance to draw.
	 */
	public static void vkCmdDraw(VkCommandBuffer commandBuffer, int vertexCount, int instanceCount, int firstVertex, int firstInstance) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDraw;
		callPV(__functionAddress, commandBuffer.address(), vertexCount, instanceCount, firstVertex, firstInstance);
	}

	// --- [ vkCmdDrawIndexed ] ---

	/**
	 * Issue an indexed draw into a command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To record an indexed draw, call:</p>
	 * 
	 * <pre><code>void vkCmdDrawIndexed(
    VkCommandBuffer                             commandBuffer,
    uint32_t                                    indexCount,
    uint32_t                                    instanceCount,
    uint32_t                                    firstIndex,
    int32_t                                     vertexOffset,
    uint32_t                                    firstInstance);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>When the command is executed, primitives are assembled using the current primitive topology and {@code indexCount} vertices whose indices are retrieved from the index buffer. The index buffer is treated as an array of tightly packed unsigned integers of size defined by the {@link #vkCmdBindIndexBuffer CmdBindIndexBuffer}{@code ::indexType} parameter with which the buffer was bound.</p>
	 * 
	 * <p>The first vertex index is at an offset of {@code firstIndex} * {@code indexSize} + {@code offset} within the currently bound index buffer, where {@code offset} is the offset specified by {@link #vkCmdBindIndexBuffer CmdBindIndexBuffer} and {@code indexSize} is the byte size of the type specified by {@code indexType}. Subsequent index values are retrieved from consecutive locations in the index buffer. Indices are first compared to the primitive restart value, then zero extended to 32 bits (if the {@code indexType} is {@link #VK_INDEX_TYPE_UINT16 INDEX_TYPE_UINT16}) and have {@code vertexOffset} added to them, before being supplied as the {@code vertexIndex} value.</p>
	 * 
	 * <p>The primitives are drawn {@code instanceCount} times with {@code instanceIndex} starting with {@code firstInstance} and increasing sequentially for each instance. The assembled primitives execute the currently bound graphics pipeline.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The current render pass <b>must</b> be <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
	 * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
	 * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a descriptor set <b>must</b> have been bound to <em>n</em> at {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
	 * <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a push constant value <b>must</b> have been set for {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
	 * <li>Descriptors in each bound descriptor set, specified via {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via {@link #vkCmdBindPipeline CmdBindPipeline}</li>
	 * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
	 * <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#fxvertex-input">the “Vertex Input Description” section</a></li>
	 * <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
	 * <li>If the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} requires any dynamic state, that state <b>must</b> have been set on the current command buffer</li>
	 * <li>({@code indexSize} * ({@code firstIndex} + {@code indexCount}) + {@code offset}) <b>must</b> be less than or equal to the size of the currently bound index buffer, with indexSize being based on the type specified by {@code indexType}, where the index buffer, {@code indexType}, and {@code offset} are specified via {@link #vkCmdBindIndexBuffer CmdBindIndexBuffer}</li>
	 * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link #VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link #VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
	 * <li>Any {@code VkImageView} being sampled with {@link #VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>Any {@code VkImageView} being sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command <b>must</b> be of a format which supports cubic filtering, as specified by the {@link IMGFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>Any {@code VkImageView} being sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command <b>must</b> not have a {@code VkImageViewType} of {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded.
	 * @param indexCount    the number of vertices to draw.
	 * @param instanceCount the number of instances to draw.
	 * @param firstIndex    the base index within the index buffer.
	 * @param vertexOffset  the value added to the vertex index before indexing into the vertex buffer.
	 * @param firstInstance the instance ID of the first instance to draw.
	 */
	public static void vkCmdDrawIndexed(VkCommandBuffer commandBuffer, int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndexed;
		callPV(__functionAddress, commandBuffer.address(), indexCount, instanceCount, firstIndex, vertexOffset, firstInstance);
	}

	// --- [ vkCmdDrawIndirect ] ---

	/**
	 * Issue an indirect draw into a command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To record a non-indexed indirect draw, call:</p>
	 * 
	 * <pre><code>void vkCmdDrawIndirect(
    VkCommandBuffer                             commandBuffer,
    VkBuffer                                    buffer,
    VkDeviceSize                                offset,
    uint32_t                                    drawCount,
    uint32_t                                    stride);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkCmdDrawIndirect CmdDrawIndirect} behaves similarly to {@link #vkCmdDraw CmdDraw} except that the parameters are read by the device from a buffer during execution. {@code drawCount} draws are executed by the command, with parameters taken from {@code buffer} starting at {@code offset} and increasing by {@code stride} bytes for each successive draw. The parameters of each draw are encoded in an array of {@link VkDrawIndirectCommand} structures. If {@code drawCount} is less than or equal to one, {@code stride} is ignored.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>If {@code drawCount} is greater than 1, {@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to sizeof({@link VkDrawIndirectCommand})</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-multiDrawIndirect">multi-draw indirect</a> feature is not enabled, {@code drawCount} <b>must</b> be 0 or 1</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, all the {@code firstInstance} members of the {@link VkDrawIndirectCommand} structures accessed by this command <b>must</b> be 0</li>
	 * <li>The current render pass <b>must</b> be <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
	 * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
	 * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a descriptor set <b>must</b> have been bound to <em>n</em> at {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
	 * <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a push constant value <b>must</b> have been set for {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
	 * <li>Descriptors in each bound descriptor set, specified via {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via {@link #vkCmdBindPipeline CmdBindPipeline}</li>
	 * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
	 * <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
	 * <li>If the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} requires any dynamic state, that state <b>must</b> have been set on the current command buffer</li>
	 * <li>If {@code drawCount} is equal to 1, <code>(offset &#x002b; sizeof({@link VkDrawIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
	 * <li>If {@code drawCount} is greater than 1, <code>(stride &#x00d7; (drawCount - 1) + offset &#x002b; sizeof({@link VkDrawIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
	 * <li>{@code drawCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDrawIndirectCount}</li>
	 * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link #VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link #VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
	 * <li>Any {@code VkImageView} being sampled with {@link #VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>Any {@code VkImageView} being sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command <b>must</b> be of a format which supports cubic filtering, as specified by the {@link IMGFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>Any {@code VkImageView} being sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command <b>must</b> not have a {@code VkImageViewType} of {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded.
	 * @param buffer        the buffer containing draw parameters.
	 * @param offset        the byte offset into {@code buffer} where parameters begin.
	 * @param drawCount     the number of draws to execute, and <b>can</b> be zero.
	 * @param stride        the byte stride between successive sets of draw parameters.
	 */
	public static void vkCmdDrawIndirect(VkCommandBuffer commandBuffer, long buffer, long offset, int drawCount, int stride) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirect;
		callPJJV(__functionAddress, commandBuffer.address(), buffer, offset, drawCount, stride);
	}

	// --- [ vkCmdDrawIndexedIndirect ] ---

	/**
	 * Perform an indexed indirect draw.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To record an indexed indirect draw, call:</p>
	 * 
	 * <pre><code>void vkCmdDrawIndexedIndirect(
    VkCommandBuffer                             commandBuffer,
    VkBuffer                                    buffer,
    VkDeviceSize                                offset,
    uint32_t                                    drawCount,
    uint32_t                                    stride);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkCmdDrawIndexedIndirect CmdDrawIndexedIndirect} behaves similarly to {@link #vkCmdDrawIndexed CmdDrawIndexed} except that the parameters are read by the device from a buffer during execution. {@code drawCount} draws are executed by the command, with parameters taken from {@code buffer} starting at {@code offset} and increasing by {@code stride} bytes for each successive draw. The parameters of each draw are encoded in an array of {@link VkDrawIndexedIndirectCommand} structures. If {@code drawCount} is less than or equal to one, {@code stride} is ignored.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>If {@code drawCount} is greater than 1, {@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to sizeof({@link VkDrawIndexedIndirectCommand})</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-multiDrawIndirect">multi-draw indirect</a> feature is not enabled, {@code drawCount} <b>must</b> be 0 or 1</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, all the {@code firstInstance} members of the {@link VkDrawIndexedIndirectCommand} structures accessed by this command <b>must</b> be 0</li>
	 * <li>The current render pass <b>must</b> be <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
	 * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
	 * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a descriptor set <b>must</b> have been bound to <em>n</em> at {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
	 * <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a push constant value <b>must</b> have been set for {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
	 * <li>Descriptors in each bound descriptor set, specified via {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via {@link #vkCmdBindPipeline CmdBindPipeline}</li>
	 * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
	 * <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
	 * <li>If the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} requires any dynamic state, that state <b>must</b> have been set on the current command buffer</li>
	 * <li>If {@code drawCount} is equal to 1, <code>(offset &#x002b; sizeof({@link VkDrawIndexedIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
	 * <li>If {@code drawCount} is greater than 1, <code>(stride &#x00d7; (drawCount - 1) + offset &#x002b; sizeof({@link VkDrawIndexedIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
	 * <li>{@code drawCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDrawIndirectCount}</li>
	 * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link #VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link #VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
	 * <li>Any {@code VkImageView} being sampled with {@link #VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>Any {@code VkImageView} being sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command <b>must</b> be of a format which supports cubic filtering, as specified by the {@link IMGFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>Any {@code VkImageView} being sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command <b>must</b> not have a {@code VkImageViewType} of {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded.
	 * @param buffer        the buffer containing draw parameters.
	 * @param offset        the byte offset into {@code buffer} where parameters begin.
	 * @param drawCount     the number of draws to execute, and <b>can</b> be zero.
	 * @param stride        the byte stride between successive sets of draw parameters.
	 */
	public static void vkCmdDrawIndexedIndirect(VkCommandBuffer commandBuffer, long buffer, long offset, int drawCount, int stride) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndexedIndirect;
		callPJJV(__functionAddress, commandBuffer.address(), buffer, offset, drawCount, stride);
	}

	// --- [ vkCmdDispatch ] ---

	/**
	 * Dispatch compute work items.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To record a dispatch, call:</p>
	 * 
	 * <pre><code>void vkCmdDispatch(
    VkCommandBuffer                             commandBuffer,
    uint32_t                                    x,
    uint32_t                                    y,
    uint32_t                                    z);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>When the command is executed, a global workgroup consisting of <code>x {times} y {times} z</code> local workgroups is assembled.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code x} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[0]</li>
	 * <li>{@code y} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[1]</li>
	 * <li>{@code z} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[2]</li>
	 * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, a descriptor set <b>must</b> have been bound to <em>n</em> at {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
	 * <li>Descriptors in each bound descriptor set, specified via {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via {@link #vkCmdBindPipeline CmdBindPipeline}</li>
	 * <li>A valid compute pipeline <b>must</b> be bound to the current command buffer with {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}</li>
	 * <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, a push constant value <b>must</b> have been set for {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, with a {@code VkPipelineLayout} that is compatible for push constants with the one used to create the current {@code VkPipeline}, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link #VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link #VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
	 * <li>Any {@code VkImageView} being sampled with {@link #VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>Any {@code VkImageView} being sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command <b>must</b> be of a format which supports cubic filtering, as specified by the {@link IMGFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>Any {@code VkImageView} being sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command <b>must</b> not have a {@code VkImageViewType} of {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param x             the number of local workgroups to dispatch in the X dimension.
	 * @param y             the number of local workgroups to dispatch in the Y dimension.
	 * @param z             the number of local workgroups to dispatch in the Z dimension.
	 */
	public static void vkCmdDispatch(VkCommandBuffer commandBuffer, int x, int y, int z) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatch;
		callPV(__functionAddress, commandBuffer.address(), x, y, z);
	}

	// --- [ vkCmdDispatchIndirect ] ---

	/**
	 * Dispatch compute work items using indirect parameters.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To record an indirect command dispatch, call:</p>
	 * 
	 * <pre><code>void vkCmdDispatchIndirect(
    VkCommandBuffer                             commandBuffer,
    VkBuffer                                    buffer,
    VkDeviceSize                                offset);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkCmdDispatchIndirect CmdDispatchIndirect} behaves similarly to {@link #vkCmdDispatch CmdDispatch} except that the parameters are read by the device from a buffer during execution. The parameters of the dispatch are encoded in a {@link VkDispatchIndirectCommand} structure taken from {@code buffer} starting at {@code offset}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, a descriptor set <b>must</b> have been bound to <em>n</em> at {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
	 * <li>Descriptors in each bound descriptor set, specified via {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via {@link #vkCmdBindPipeline CmdBindPipeline}</li>
	 * <li>A valid compute pipeline <b>must</b> be bound to the current command buffer with {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}</li>
	 * <li>{@code buffer} <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>The sum of {@code offset} and the size of {@link VkDispatchIndirectCommand} <b>must</b> be less than or equal to the size of {@code buffer}</li>
	 * <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, a push constant value <b>must</b> have been set for {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, with a {@code VkPipelineLayout} that is compatible for push constants with the one used to create the current {@code VkPipeline}, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link #VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link #VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
	 * <li>Any {@code VkImageView} being sampled with {@link #VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>Any {@code VkImageView} being sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command <b>must</b> be of a format which supports cubic filtering, as specified by the {@link IMGFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>Any {@code VkImageView} being sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command <b>must</b> not have a {@code VkImageViewType} of {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param buffer        the buffer containing dispatch parameters.
	 * @param offset        the byte offset into {@code buffer} where parameters begin.
	 */
	public static void vkCmdDispatchIndirect(VkCommandBuffer commandBuffer, long buffer, long offset) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchIndirect;
		callPJJV(__functionAddress, commandBuffer.address(), buffer, offset);
	}

	// --- [ vkCmdCopyBuffer ] ---

	/**
	 * Unsafe version of: {@link #vkCmdCopyBuffer CmdCopyBuffer}
	 *
	 * @param regionCount the number of regions to copy.
	 */
	public static void nvkCmdCopyBuffer(VkCommandBuffer commandBuffer, long srcBuffer, long dstBuffer, int regionCount, long pRegions) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBuffer;
		callPJJPV(__functionAddress, commandBuffer.address(), srcBuffer, dstBuffer, regionCount, pRegions);
	}

	/**
	 * Copy data between buffer regions.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To copy data between buffer objects, call:</p>
	 * 
	 * <pre><code>void vkCmdCopyBuffer(
    VkCommandBuffer                             commandBuffer,
    VkBuffer                                    srcBuffer,
    VkBuffer                                    dstBuffer,
    uint32_t                                    regionCount,
    const VkBufferCopy*                         pRegions);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Each region in {@code pRegions} is copied from the source buffer to the same region of the destination buffer. {@code srcBuffer} and {@code dstBuffer} <b>can</b> be the same buffer or alias the same memory, but the result is undefined if the copy regions overlap in memory.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The {@code size} member of a given element of {@code pRegions} <b>must</b> be greater than 0</li>
	 * <li>The {@code srcOffset} member of a given element of {@code pRegions} <b>must</b> be less than the size of {@code srcBuffer}</li>
	 * <li>The {@code dstOffset} member of a given element of {@code pRegions} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>The {@code size} member of a given element of {@code pRegions} <b>must</b> be less than or equal to the size of {@code srcBuffer} minus {@code srcOffset}</li>
	 * <li>The {@code size} member of a given element of {@code pRegions} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
	 * <li>The union of the source regions, and the union of the destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
	 * <li>{@code srcBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_SRC_BIT BUFFER_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} {@link VkBufferCopy} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code dstBuffer}, and {@code srcBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>TRANSFER GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkBufferCopy}</p>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param srcBuffer     the source buffer.
	 * @param dstBuffer     the destination buffer.
	 * @param pRegions      a pointer to an array of {@link VkBufferCopy} structures specifying the regions to copy.
	 */
	public static void vkCmdCopyBuffer(VkCommandBuffer commandBuffer, long srcBuffer, long dstBuffer, VkBufferCopy.Buffer pRegions) {
		nvkCmdCopyBuffer(commandBuffer, srcBuffer, dstBuffer, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdCopyImage ] ---

	/**
	 * Unsafe version of: {@link #vkCmdCopyImage CmdCopyImage}
	 *
	 * @param regionCount the number of regions to copy.
	 */
	public static void nvkCmdCopyImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImage;
		callPJJPV(__functionAddress, commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
	}

	/**
	 * Copy data between images.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To copy data between image objects, call:</p>
	 * 
	 * <pre><code>void vkCmdCopyImage(
    VkCommandBuffer                             commandBuffer,
    VkImage                                     srcImage,
    VkImageLayout                               srcImageLayout,
    VkImage                                     dstImage,
    VkImageLayout                               dstImageLayout,
    uint32_t                                    regionCount,
    const VkImageCopy*                          pRegions);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Each region in {@code pRegions} is copied from the source image to the same region of the destination image. {@code srcImage} and {@code dstImage} <b>can</b> be the same image or alias the same memory.</p>
	 * 
	 * <p>Copies are done layer by layer starting with {@code baseArrayLayer} member of {@code srcSubresource} for the source and {@code dstSubresource} for the destination. {@code layerCount} layers are copied to the destination image.</p>
	 * 
	 * <p>The formats of {@code srcImage} and {@code dstImage} <b>must</b> be compatible. Formats are considered compatible if their element size is the same between both formats. For example, {@link #VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM} is compatible with {@link #VK_FORMAT_R32_UINT FORMAT_R32_UINT} because both texels are 4 bytes in size. Depth/stencil formats <b>must</b> match exactly.</p>
	 * 
	 * <p>{@link #vkCmdCopyImage CmdCopyImage} allows copying between size-compatible compressed and uncompressed internal formats. Formats are size-compatible if the element size of the uncompressed format is equal to the element size (compressed texel block size) of the compressed format. Such a copy does not perform on-the-fly compression or decompression. When copying from an uncompressed format to a compressed format, each texel of uncompressed data of the source image is copied as a raw value to the corresponding compressed texel block of the destination image. When copying from a compressed format to an uncompressed format, each compressed texel block of the source image is copied as a raw value to the corresponding texel of uncompressed data in the destination image. Thus, for example, it is legal to copy between a 128-bit uncompressed format and a compressed format which has a 128-bit sized compressed texel block representing 4x4 texels (using 8 bits per texel), or between a 64-bit uncompressed format and a compressed format which has a 64-bit sized compressed texel block representing 4x4 texels (using 4 bits per texel).</p>
	 * 
	 * <p>When copying between compressed and uncompressed formats the {@code extent} members represent the texel dimensions of the source image and not the destination. When copying from a compressed image to an uncompressed image the image texel dimensions written to the uncompressed image will be source extent divided by the compressed texel block dimensions. When copying from an uncompressed image to a compressed image the image texel dimensions written to the compressed image will be the source extent multiplied by the compressed texel block dimensions. In both cases the number of bytes read and the number of bytes written will be identical.</p>
	 * 
	 * <p>Copying to or from block-compressed images is typically done in multiples of the compressed texel block size. For this reason the {@code extent} <b>must</b> be a multiple of the compressed texel block dimension. There is one exception to this rule which is required: to handle compressed images created with dimensions that are not a multiple of the compressed texel block dimensions: if the {@code srcImage} is compressed, then:</p>
	 * 
	 * <ul>
	 * <li>If {@code extent.width} is not a multiple of the compressed texel block width, then <code>(extent.width + srcOffset.x)</code> <b>must</b> equal the image subresource width.</li>
	 * <li>If {@code extent.height} is not a multiple of the compressed texel block height, then <code>(extent.height + srcOffset.y)</code> <b>must</b> equal the image subresource height.</li>
	 * <li>If {@code extent.depth} is not a multiple of the compressed texel block depth, then <code>(extent.depth + srcOffset.z)</code> <b>must</b> equal the image subresource depth.</li>
	 * </ul>
	 * 
	 * <p>Similarly, if the {@code dstImage} is compressed, then:</p>
	 * 
	 * <ul>
	 * <li>If {@code extent.width} is not a multiple of the compressed texel block width, then <code>(extent.width + dstOffset.x)</code> <b>must</b> equal the image subresource width.</li>
	 * <li>If {@code extent.height} is not a multiple of the compressed texel block height, then <code>(extent.height + dstOffset.y)</code> <b>must</b> equal the image subresource height.</li>
	 * <li>If {@code extent.depth} is not a multiple of the compressed texel block depth, then <code>(extent.depth + dstOffset.z)</code> <b>must</b> equal the image subresource depth.</li>
	 * </ul>
	 * 
	 * <p>This allows the last compressed texel block of the image in each non-multiple dimension to be included as a source or destination of the copy.</p>
	 * 
	 * <p>{@link #vkCmdCopyImage CmdCopyImage} <b>can</b> be used to copy image data between multisample images, but both images <b>must</b> have the same number of samples.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
	 * <li>{@code srcImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The {@code VkFormat} of each of {@code srcImage} and {@code dstImage} <b>must</b> be compatible, as defined <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#copies-images-format-compatibility">below</a></li>
	 * <li>The sample count of {@code srcImage} and {@code dstImage} <b>must</b> match</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid {@link VkImageCopy} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>TRANSFER GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkImageCopy}</p>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded.
	 * @param srcImage       the source image.
	 * @param srcImageLayout the current layout of the source image subresource.
	 * @param dstImage       the destination image.
	 * @param dstImageLayout the current layout of the destination image subresource.
	 * @param pRegions       a pointer to an array of {@link VkImageCopy} structures specifying the regions to copy.
	 */
	public static void vkCmdCopyImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageCopy.Buffer pRegions) {
		nvkCmdCopyImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdBlitImage ] ---

	/**
	 * Unsafe version of: {@link #vkCmdBlitImage CmdBlitImage}
	 *
	 * @param regionCount the number of regions to blit.
	 */
	public static void nvkCmdBlitImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions, int filter) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBlitImage;
		callPJJPV(__functionAddress, commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter);
	}

	/**
	 * Copy regions of an image, potentially performing format conversion,.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To copy regions of a source image into a destination image, potentially performing format conversion, arbitrary scaling, and filtering, call:</p>
	 * 
	 * <pre><code>void vkCmdBlitImage(
    VkCommandBuffer                             commandBuffer,
    VkImage                                     srcImage,
    VkImageLayout                               srcImageLayout,
    VkImage                                     dstImage,
    VkImageLayout                               dstImageLayout,
    uint32_t                                    regionCount,
    const VkImageBlit*                          pRegions,
    VkFilter                                    filter);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkCmdBlitImage CmdBlitImage} <b>must</b> not be used for multisampled source or destination images. Use {@link #vkCmdResolveImage CmdResolveImage} for this purpose.</p>
	 * 
	 * <p>As the sizes of the source and destination extents <b>can</b> differ in any dimension, texels in the source extent are scaled and filtered to the destination extent. Scaling occurs via the following operations:</p>
	 * 
	 * <ul>
	 * <li>For each destination texel, the integer coordinate of that texel is converted to an unnormalized texture coordinate, using the effective inverse of the equations described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#textures-unnormalized-to-integer">unnormalized to integer conversion</a>:
	 * 
	 * <dl>
	 * <dd><code>u<sub>base</sub> = i + &#x00bd;</code></dd>
	 * <dd><code>v<sub>base</sub> = j + &#x00bd;</code></dd>
	 * <dd><code>w<sub>base</sub> = k + &#x00bd;</code></dd>
	 * </dl>
	 * </li>
	 * <li>These base coordinates are then offset by the first destination offset:
	 * 
	 * <dl>
	 * <dd><code>u<sub>offset</sub> = u<sub>base</sub> - x<sub>dst0</sub></code></dd>
	 * <dd><code>v<sub>offset</sub> = v<sub>base</sub> - y<sub>dst0</sub></code></dd>
	 * <dd><code>w<sub>offset</sub> = w<sub>base</sub> - z<sub>dst0</sub></code></dd>
	 * <dd><code>a<sub>offset</sub> = a - baseArrayCount<sub>dst</sub></code></dd>
	 * </dl>
	 * </li>
	 * <li>The scale is determined from the source and destination regions, and applied to the offset coordinates:
	 * 
	 * <dl>
	 * <dd><code>scale_u = (x<sub>src1</sub> - x<sub>src0</sub>) / (x<sub>dst1</sub> - x<sub>dst0</sub>)</code></dd>
	 * <dd><code>scale_v = (y<sub>src1</sub> - y<sub>src0</sub>) / (y<sub>dst1</sub> - y<sub>dst0</sub>)</code></dd>
	 * <dd><code>scale_w = (z<sub>src1</sub> - z<sub>src0</sub>) / (z<sub>dst1</sub> - z<sub>dst0</sub>)</code></dd>
	 * <dd><code>u<sub>scaled</sub> = u<sub>offset</sub> * scale<sub>u</sub></code></dd>
	 * <dd><code>v<sub>scaled</sub> = v<sub>offset</sub> * scale<sub>v</sub></code></dd>
	 * <dd><code>w<sub>scaled</sub> = w<sub>offset</sub> * scale<sub>w</sub></code></dd>
	 * </dl>
	 * </li>
	 * <li>Finally the source offset is added to the scaled coordinates, to determine the final unnormalized coordinates used to sample from {@code srcImage}:
	 * 
	 * <dl>
	 * <dd><code>u = u<sub>scaled</sub> + x<sub>src0</sub></code></dd>
	 * <dd><code>v = v<sub>scaled</sub> + y<sub>src0</sub></code></dd>
	 * <dd><code>w = w<sub>scaled</sub> + z<sub>src0</sub></code></dd>
	 * <dd><code>q = mipLevel</code></dd>
	 * <dd><code>a = a<sub>offset</sub> + baseArrayCount<sub>src</sub></code></dd>
	 * </dl>
	 * </li>
	 * </ul>
	 * 
	 * <p>These coordinates are used to sample from the source image, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#textures"> Image Operations chapter</a>, with the filter mode equal to that of {@code filter}, a mipmap mode of {@link #VK_SAMPLER_MIPMAP_MODE_NEAREST SAMPLER_MIPMAP_MODE_NEAREST} and an address mode of {@link #VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}. Implementations <b>must</b> clamp at the edge of the source image, and <b>may</b> additionally clamp to the edge of the source region.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Due to allowable rounding errors in the generation of the source texture coordinates, it is not always possible to guarantee exactly which source texels will be sampled for a given blit. As rounding errors are implementation dependent, the exact results of a blitting operation are also implementation dependent.</p>
	 * </div>
	 * 
	 * <p>Blits are done layer by layer starting with the {@code baseArrayLayer} member of {@code srcSubresource} for the source and {@code dstSubresource} for the destination. {@code layerCount} layers are blitted to the destination image.</p>
	 * 
	 * <p>3D textures are blitted slice by slice. Slices in the source region bounded by {@code srcOffsets}[0].{@code z} and {@code srcOffsets}[1].{@code z} are copied to slices in the destination region bounded by {@code dstOffsets}[0].{@code z} and {@code dstOffsets}[1].{@code z}. For each destination slice, a source z coordinate is linearly interpolated between {@code srcOffsets}[0].{@code z} and {@code srcOffsets}[1].{@code z}. If the {@code filter} parameter is {@link #VK_FILTER_LINEAR FILTER_LINEAR} then the value sampled from the source image is taken by doing linear filtering using the interpolated z coordinate. If {@code filter} parameter is {@link #VK_FILTER_NEAREST FILTER_NEAREST} then value sampled from the source image is taken from the single nearest slice (with undefined rounding mode).</p>
	 * 
	 * <p>The following filtering and conversion rules apply:</p>
	 * 
	 * <ul>
	 * <li>Integer formats <b>can</b> only be converted to other integer formats with the same signedness.</li>
	 * <li>No format conversion is supported between depth/stencil images. The formats <b>must</b> match.</li>
	 * <li>Format conversions on unorm, snorm, unscaled and packed float formats of the copied aspect of the image are performed by first converting the pixels to float values.</li>
	 * <li>For sRGB source formats, nonlinear RGB values are converted to linear representation prior to filtering.</li>
	 * <li>After filtering, the float values are first clamped and then cast to the destination image format. In case of sRGB destination format, linear RGB values are converted to nonlinear representation before writing the pixel to the image.</li>
	 * </ul>
	 * 
	 * <p>Signed and unsigned integers are converted by first clamping to the representable range of the destination format, then casting the value.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory with any texel that <b>may</b> be sampled during the blit operation</li>
	 * <li>{@code srcImage} <b>must</b> use a format that supports {@link #VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT}, which is indicated by {@link VkFormatProperties}{@code ::linearTilingFeatures} (for linear tiled images) or {@link VkFormatProperties}{@code ::optimalTilingFeatures} (for optimally tiled images) - as returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>{@code srcImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstImage} <b>must</b> use a format that supports {@link #VK_FORMAT_FEATURE_BLIT_DST_BIT FORMAT_FEATURE_BLIT_DST_BIT}, which is indicated by {@link VkFormatProperties}{@code ::linearTilingFeatures} (for linear tiled images) or {@link VkFormatProperties}{@code ::optimalTilingFeatures} (for optimally tiled images) - as returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>{@code dstImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The sample count of {@code srcImage} and {@code dstImage} <b>must</b> both be equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>If either of {@code srcImage} or {@code dstImage} was created with a signed integer {@code VkFormat}, the other <b>must</b> also have been created with a signed integer {@code VkFormat}</li>
	 * <li>If either of {@code srcImage} or {@code dstImage} was created with an unsigned integer {@code VkFormat}, the other <b>must</b> also have been created with an unsigned integer {@code VkFormat}</li>
	 * <li>If either of {@code srcImage} or {@code dstImage} was created with a depth/stencil format, the other <b>must</b> have exactly the same format</li>
	 * <li>If {@code srcImage} was created with a depth/stencil format, {@code filter} <b>must</b> be {@link #VK_FILTER_NEAREST FILTER_NEAREST}</li>
	 * <li>{@code srcImage} <b>must</b> have been created with a {@code samples} value of {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code dstImage} <b>must</b> have been created with a {@code samples} value of {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>If {@code filter} is {@link #VK_FILTER_LINEAR FILTER_LINEAR}, {@code srcImage} <b>must</b> be of a format which supports linear filtering, as specified by the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>If {@code filter} is {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG}, {@code srcImage} <b>must</b> be of a format which supports cubic filtering, as specified by the {@link IMGFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>If {@code filter} is {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG}, {@code srcImage} <b>must</b> have a {@code VkImageType} of {@link #VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid {@link VkImageBlit} structures</li>
	 * <li>{@code filter} <b>must</b> be a valid {@code VkFilter} value</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkImageBlit}</p>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded.
	 * @param srcImage       the source image.
	 * @param srcImageLayout the layout of the source image subresources for the blit.
	 * @param dstImage       the destination image.
	 * @param dstImageLayout the layout of the destination image subresources for the blit.
	 * @param pRegions       a pointer to an array of {@link VkImageBlit} structures specifying the regions to blit.
	 * @param filter         a {@code VkFilter} specifying the filter to apply if the blits require scaling.
	 */
	public static void vkCmdBlitImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageBlit.Buffer pRegions, int filter) {
		nvkCmdBlitImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address(), filter);
	}

	// --- [ vkCmdCopyBufferToImage ] ---

	/**
	 * Unsafe version of: {@link #vkCmdCopyBufferToImage CmdCopyBufferToImage}
	 *
	 * @param regionCount the number of regions to copy.
	 */
	public static void nvkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBufferToImage;
		callPJJPV(__functionAddress, commandBuffer.address(), srcBuffer, dstImage, dstImageLayout, regionCount, pRegions);
	}

	/**
	 * Copy data from a buffer into an image.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To copy data from a buffer object to an image object, call:</p>
	 * 
	 * <pre><code>void vkCmdCopyBufferToImage(
    VkCommandBuffer                             commandBuffer,
    VkBuffer                                    srcBuffer,
    VkImage                                     dstImage,
    VkImageLayout                               dstImageLayout,
    uint32_t                                    regionCount,
    const VkBufferImageCopy*                    pRegions);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Each region in {@code pRegions} is copied from the specified region of the source buffer to the specified region of the destination image.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The buffer region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcBuffer}</li>
	 * <li>The image region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
	 * <li>{@code srcBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_SRC_BIT BUFFER_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code dstImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstImage} <b>must</b> have a sample count equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid {@link VkBufferImageCopy} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code dstImage}, and {@code srcBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>TRANSFER GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkBufferImageCopy}</p>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded.
	 * @param srcBuffer      the source buffer.
	 * @param dstImage       the destination image.
	 * @param dstImageLayout the layout of the destination image subresources for the copy.
	 * @param pRegions       a pointer to an array of {@link VkBufferImageCopy} structures specifying the regions to copy.
	 */
	public static void vkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, VkBufferImageCopy.Buffer pRegions) {
		nvkCmdCopyBufferToImage(commandBuffer, srcBuffer, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdCopyImageToBuffer ] ---

	/**
	 * Unsafe version of: {@link #vkCmdCopyImageToBuffer CmdCopyImageToBuffer}
	 *
	 * @param regionCount the number of regions to copy.
	 */
	public static void nvkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, int regionCount, long pRegions) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImageToBuffer;
		callPJJPV(__functionAddress, commandBuffer.address(), srcImage, srcImageLayout, dstBuffer, regionCount, pRegions);
	}

	/**
	 * Copy image data into a buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To copy data from an image object to a buffer object, call:</p>
	 * 
	 * <pre><code>void vkCmdCopyImageToBuffer(
    VkCommandBuffer                             commandBuffer,
    VkImage                                     srcImage,
    VkImageLayout                               srcImageLayout,
    VkBuffer                                    dstBuffer,
    uint32_t                                    regionCount,
    const VkBufferImageCopy*                    pRegions);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Each region in {@code pRegions} is copied from the specified region of the source image to the specified region of the destination buffer.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The image region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The buffer region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstBuffer}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
	 * <li>{@code srcImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code srcImage} <b>must</b> have a sample count equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid {@link VkBufferImageCopy} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code dstBuffer}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>TRANSFER GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkBufferImageCopy}</p>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded.
	 * @param srcImage       the source image.
	 * @param srcImageLayout the layout of the source image subresources for the copy.
	 * @param dstBuffer      the destination buffer.
	 * @param pRegions       a pointer to an array of {@link VkBufferImageCopy} structures specifying the regions to copy.
	 */
	public static void vkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, VkBufferImageCopy.Buffer pRegions) {
		nvkCmdCopyImageToBuffer(commandBuffer, srcImage, srcImageLayout, dstBuffer, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdUpdateBuffer ] ---

	/**
	 * Unsafe version of: {@link #vkCmdUpdateBuffer CmdUpdateBuffer}
	 *
	 * @param dataSize the number of bytes to update, and <b>must</b> be a multiple of 4.
	 */
	public static void nvkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long dataSize, long pData) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
		callPJJJPV(__functionAddress, commandBuffer.address(), dstBuffer, dstOffset, dataSize, pData);
	}

	/**
	 * Update a buffer's contents from host memory.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To update buffer data inline in a command buffer, call:</p>
	 * 
	 * <pre><code>void vkCmdUpdateBuffer(
    VkCommandBuffer                             commandBuffer,
    VkBuffer                                    dstBuffer,
    VkDeviceSize                                dstOffset,
    VkDeviceSize                                dataSize,
    const void*                                 pData);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@code dataSize} <b>must</b> be less than or equal to 65536 bytes. For larger updates, applications <b>can</b> use buffer to buffer <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#copies-buffers">copies</a>.</p>
	 * 
	 * <p>The source data is copied from the user pointer to the command buffer when the command is called.</p>
	 * 
	 * <p>{@link #vkCmdUpdateBuffer CmdUpdateBuffer} is only allowed outside of a render pass. This command is treated as “transfer” operation, for the purposes of synchronization barriers. The {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} <b>must</b> be specified in {@code usage} of {@link VkBufferCreateInfo} in order for the buffer to be compatible with {@link #vkCmdUpdateBuffer CmdUpdateBuffer}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to 65536</li>
	 * <li>{@code dataSize} <b>must</b> be a multiple of 4</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>TRANSFER GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param dstBuffer     a handle to the buffer to be updated.
	 * @param dstOffset     the byte offset into the buffer to start updating, and <b>must</b> be a multiple of 4.
	 * @param pData         a pointer to the source data for the buffer update, and <b>must</b> be at least {@code dataSize} bytes in size.
	 */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, ByteBuffer pData) {
		nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, pData.remaining(), memAddress(pData));
	}

	/**
	 * Update a buffer's contents from host memory.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To update buffer data inline in a command buffer, call:</p>
	 * 
	 * <pre><code>void vkCmdUpdateBuffer(
    VkCommandBuffer                             commandBuffer,
    VkBuffer                                    dstBuffer,
    VkDeviceSize                                dstOffset,
    VkDeviceSize                                dataSize,
    const void*                                 pData);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@code dataSize} <b>must</b> be less than or equal to 65536 bytes. For larger updates, applications <b>can</b> use buffer to buffer <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#copies-buffers">copies</a>.</p>
	 * 
	 * <p>The source data is copied from the user pointer to the command buffer when the command is called.</p>
	 * 
	 * <p>{@link #vkCmdUpdateBuffer CmdUpdateBuffer} is only allowed outside of a render pass. This command is treated as “transfer” operation, for the purposes of synchronization barriers. The {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} <b>must</b> be specified in {@code usage} of {@link VkBufferCreateInfo} in order for the buffer to be compatible with {@link #vkCmdUpdateBuffer CmdUpdateBuffer}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to 65536</li>
	 * <li>{@code dataSize} <b>must</b> be a multiple of 4</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>TRANSFER GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param dstBuffer     a handle to the buffer to be updated.
	 * @param dstOffset     the byte offset into the buffer to start updating, and <b>must</b> be a multiple of 4.
	 * @param pData         a pointer to the source data for the buffer update, and <b>must</b> be at least {@code dataSize} bytes in size.
	 */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, ShortBuffer pData) {
		nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, pData.remaining() << 1, memAddress(pData));
	}

	/**
	 * Update a buffer's contents from host memory.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To update buffer data inline in a command buffer, call:</p>
	 * 
	 * <pre><code>void vkCmdUpdateBuffer(
    VkCommandBuffer                             commandBuffer,
    VkBuffer                                    dstBuffer,
    VkDeviceSize                                dstOffset,
    VkDeviceSize                                dataSize,
    const void*                                 pData);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@code dataSize} <b>must</b> be less than or equal to 65536 bytes. For larger updates, applications <b>can</b> use buffer to buffer <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#copies-buffers">copies</a>.</p>
	 * 
	 * <p>The source data is copied from the user pointer to the command buffer when the command is called.</p>
	 * 
	 * <p>{@link #vkCmdUpdateBuffer CmdUpdateBuffer} is only allowed outside of a render pass. This command is treated as “transfer” operation, for the purposes of synchronization barriers. The {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} <b>must</b> be specified in {@code usage} of {@link VkBufferCreateInfo} in order for the buffer to be compatible with {@link #vkCmdUpdateBuffer CmdUpdateBuffer}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to 65536</li>
	 * <li>{@code dataSize} <b>must</b> be a multiple of 4</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>TRANSFER GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param dstBuffer     a handle to the buffer to be updated.
	 * @param dstOffset     the byte offset into the buffer to start updating, and <b>must</b> be a multiple of 4.
	 * @param pData         a pointer to the source data for the buffer update, and <b>must</b> be at least {@code dataSize} bytes in size.
	 */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, IntBuffer pData) {
		nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, pData.remaining() << 2, memAddress(pData));
	}

	/**
	 * Update a buffer's contents from host memory.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To update buffer data inline in a command buffer, call:</p>
	 * 
	 * <pre><code>void vkCmdUpdateBuffer(
    VkCommandBuffer                             commandBuffer,
    VkBuffer                                    dstBuffer,
    VkDeviceSize                                dstOffset,
    VkDeviceSize                                dataSize,
    const void*                                 pData);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@code dataSize} <b>must</b> be less than or equal to 65536 bytes. For larger updates, applications <b>can</b> use buffer to buffer <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#copies-buffers">copies</a>.</p>
	 * 
	 * <p>The source data is copied from the user pointer to the command buffer when the command is called.</p>
	 * 
	 * <p>{@link #vkCmdUpdateBuffer CmdUpdateBuffer} is only allowed outside of a render pass. This command is treated as “transfer” operation, for the purposes of synchronization barriers. The {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} <b>must</b> be specified in {@code usage} of {@link VkBufferCreateInfo} in order for the buffer to be compatible with {@link #vkCmdUpdateBuffer CmdUpdateBuffer}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to 65536</li>
	 * <li>{@code dataSize} <b>must</b> be a multiple of 4</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>TRANSFER GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param dstBuffer     a handle to the buffer to be updated.
	 * @param dstOffset     the byte offset into the buffer to start updating, and <b>must</b> be a multiple of 4.
	 * @param pData         a pointer to the source data for the buffer update, and <b>must</b> be at least {@code dataSize} bytes in size.
	 */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, LongBuffer pData) {
		nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, pData.remaining() << 3, memAddress(pData));
	}

	/**
	 * Update a buffer's contents from host memory.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To update buffer data inline in a command buffer, call:</p>
	 * 
	 * <pre><code>void vkCmdUpdateBuffer(
    VkCommandBuffer                             commandBuffer,
    VkBuffer                                    dstBuffer,
    VkDeviceSize                                dstOffset,
    VkDeviceSize                                dataSize,
    const void*                                 pData);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@code dataSize} <b>must</b> be less than or equal to 65536 bytes. For larger updates, applications <b>can</b> use buffer to buffer <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#copies-buffers">copies</a>.</p>
	 * 
	 * <p>The source data is copied from the user pointer to the command buffer when the command is called.</p>
	 * 
	 * <p>{@link #vkCmdUpdateBuffer CmdUpdateBuffer} is only allowed outside of a render pass. This command is treated as “transfer” operation, for the purposes of synchronization barriers. The {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} <b>must</b> be specified in {@code usage} of {@link VkBufferCreateInfo} in order for the buffer to be compatible with {@link #vkCmdUpdateBuffer CmdUpdateBuffer}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to 65536</li>
	 * <li>{@code dataSize} <b>must</b> be a multiple of 4</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>TRANSFER GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param dstBuffer     a handle to the buffer to be updated.
	 * @param dstOffset     the byte offset into the buffer to start updating, and <b>must</b> be a multiple of 4.
	 * @param pData         a pointer to the source data for the buffer update, and <b>must</b> be at least {@code dataSize} bytes in size.
	 */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, FloatBuffer pData) {
		nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, pData.remaining() << 2, memAddress(pData));
	}

	/**
	 * Update a buffer's contents from host memory.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To update buffer data inline in a command buffer, call:</p>
	 * 
	 * <pre><code>void vkCmdUpdateBuffer(
    VkCommandBuffer                             commandBuffer,
    VkBuffer                                    dstBuffer,
    VkDeviceSize                                dstOffset,
    VkDeviceSize                                dataSize,
    const void*                                 pData);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@code dataSize} <b>must</b> be less than or equal to 65536 bytes. For larger updates, applications <b>can</b> use buffer to buffer <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#copies-buffers">copies</a>.</p>
	 * 
	 * <p>The source data is copied from the user pointer to the command buffer when the command is called.</p>
	 * 
	 * <p>{@link #vkCmdUpdateBuffer CmdUpdateBuffer} is only allowed outside of a render pass. This command is treated as “transfer” operation, for the purposes of synchronization barriers. The {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} <b>must</b> be specified in {@code usage} of {@link VkBufferCreateInfo} in order for the buffer to be compatible with {@link #vkCmdUpdateBuffer CmdUpdateBuffer}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to 65536</li>
	 * <li>{@code dataSize} <b>must</b> be a multiple of 4</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>TRANSFER GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param dstBuffer     a handle to the buffer to be updated.
	 * @param dstOffset     the byte offset into the buffer to start updating, and <b>must</b> be a multiple of 4.
	 * @param pData         a pointer to the source data for the buffer update, and <b>must</b> be at least {@code dataSize} bytes in size.
	 */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, DoubleBuffer pData) {
		nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, pData.remaining() << 3, memAddress(pData));
	}

	// --- [ vkCmdFillBuffer ] ---

	/**
	 * Fill a region of a buffer with a fixed value.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To clear buffer data, call:</p>
	 * 
	 * <pre><code>void vkCmdFillBuffer(
    VkCommandBuffer                             commandBuffer,
    VkBuffer                                    dstBuffer,
    VkDeviceSize                                dstOffset,
    VkDeviceSize                                size,
    uint32_t                                    data);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkCmdFillBuffer CmdFillBuffer} is treated as “transfer” operation for the purposes of synchronization barriers. The {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} <b>must</b> be specified in {@code usage} of {@link VkBufferCreateInfo} in order for the buffer to be compatible with {@link #vkCmdFillBuffer CmdFillBuffer}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
	 * <li>If {@code size} is not equal to {@link #VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be greater than 0</li>
	 * <li>If {@code size} is not equal to {@link #VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
	 * <li>If {@code size} is not equal to {@link #VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be a multiple of 4</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param dstBuffer     the buffer to be filled.
	 * @param dstOffset     the byte offset into the buffer at which to start filling, and <b>must</b> be a multiple of 4.
	 * @param size          the number of bytes to fill, and <b>must</b> be either a multiple of 4, or {@link #VK_WHOLE_SIZE WHOLE_SIZE} to fill the range from {@code offset} to the end of the buffer. If {@link #VK_WHOLE_SIZE WHOLE_SIZE} is used and the remaining size of the buffer is not a multiple of 4, then the nearest smaller multiple is used.
	 * @param data          the 4-byte word written repeatedly to the buffer to fill {@code size} bytes of data. The data word is written to memory according to the host endianness.
	 */
	public static void vkCmdFillBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long size, int data) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdFillBuffer;
		callPJJJV(__functionAddress, commandBuffer.address(), dstBuffer, dstOffset, size, data);
	}

	// --- [ vkCmdClearColorImage ] ---

	/**
	 * Unsafe version of: {@link #vkCmdClearColorImage CmdClearColorImage}
	 *
	 * @param rangeCount the number of image subresource range structures in {@code pRanges}.
	 */
	public static void nvkCmdClearColorImage(VkCommandBuffer commandBuffer, long image, int imageLayout, long pColor, int rangeCount, long pRanges) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdClearColorImage;
		callPJPPV(__functionAddress, commandBuffer.address(), image, imageLayout, pColor, rangeCount, pRanges);
	}

	/**
	 * Clear regions of a color image.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To clear one or more subranges of a color image, call:</p>
	 * 
	 * <pre><code>void vkCmdClearColorImage(
    VkCommandBuffer                             commandBuffer,
    VkImage                                     image,
    VkImageLayout                               imageLayout,
    const VkClearColorValue*                    pColor,
    uint32_t                                    rangeCount,
    const VkImageSubresourceRange*              pRanges);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Each specified range in {@code pRanges} is cleared to the value specified by {@code pColor}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code image} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code imageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The image range of any given element of {@code pRanges} <b>must</b> be an image subresource range that is contained within {@code image}</li>
	 * <li>{@code image} <b>must</b> not have a compressed or depth/stencil format</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pColor} <b>must</b> be a pointer to a valid {@link VkClearColorValue} union</li>
	 * <li>{@code pRanges} <b>must</b> be a pointer to an array of {@code rangeCount} valid {@link VkImageSubresourceRange} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code rangeCount} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code image} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkClearColorValue}, {@link VkImageSubresourceRange}</p>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param image         the image to be cleared.
	 * @param imageLayout   specifies the current layout of the image subresource ranges to be cleared, and <b>must</b> be {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL} or {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}.
	 * @param pColor        a pointer to a {@link VkClearColorValue} structure that contains the values the image subresource ranges will be cleared to (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#clears-values">the “Clear Values” section</a> below).
	 * @param pRanges       points to an array of {@link VkImageSubresourceRange} structures that describe a range of mipmap levels, array layers, and aspects to be cleared, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#resources-image-views">Image Views</a>. The {@code aspectMask} of all image subresource ranges <b>must</b> only include {@link #VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}.
	 */
	public static void vkCmdClearColorImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearColorValue pColor, VkImageSubresourceRange.Buffer pRanges) {
		nvkCmdClearColorImage(commandBuffer, image, imageLayout, pColor.address(), pRanges.remaining(), pRanges.address());
	}

	/**
	 * Clear regions of a color image.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To clear one or more subranges of a color image, call:</p>
	 * 
	 * <pre><code>void vkCmdClearColorImage(
    VkCommandBuffer                             commandBuffer,
    VkImage                                     image,
    VkImageLayout                               imageLayout,
    const VkClearColorValue*                    pColor,
    uint32_t                                    rangeCount,
    const VkImageSubresourceRange*              pRanges);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Each specified range in {@code pRanges} is cleared to the value specified by {@code pColor}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code image} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code imageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The image range of any given element of {@code pRanges} <b>must</b> be an image subresource range that is contained within {@code image}</li>
	 * <li>{@code image} <b>must</b> not have a compressed or depth/stencil format</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pColor} <b>must</b> be a pointer to a valid {@link VkClearColorValue} union</li>
	 * <li>{@code pRanges} <b>must</b> be a pointer to an array of {@code rangeCount} valid {@link VkImageSubresourceRange} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code rangeCount} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code image} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkClearColorValue}, {@link VkImageSubresourceRange}</p>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param image         the image to be cleared.
	 * @param imageLayout   specifies the current layout of the image subresource ranges to be cleared, and <b>must</b> be {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL} or {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}.
	 * @param pColor        a pointer to a {@link VkClearColorValue} structure that contains the values the image subresource ranges will be cleared to (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#clears-values">the “Clear Values” section</a> below).
	 */
	public static void vkCmdClearColorImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearColorValue pColor, VkImageSubresourceRange pRange) {
		nvkCmdClearColorImage(commandBuffer, image, imageLayout, pColor.address(), 1, pRange.address());
	}

	// --- [ vkCmdClearDepthStencilImage ] ---

	/**
	 * Unsafe version of: {@link #vkCmdClearDepthStencilImage CmdClearDepthStencilImage}
	 *
	 * @param rangeCount the number of image subresource range structures in {@code pRanges}.
	 */
	public static void nvkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, long image, int imageLayout, long pDepthStencil, int rangeCount, long pRanges) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdClearDepthStencilImage;
		callPJPPV(__functionAddress, commandBuffer.address(), image, imageLayout, pDepthStencil, rangeCount, pRanges);
	}

	/**
	 * Fill regions of a combined depth-stencil image.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To clear one or more subranges of a depth/stencil image, call:</p>
	 * 
	 * <pre><code>void vkCmdClearDepthStencilImage(
    VkCommandBuffer                             commandBuffer,
    VkImage                                     image,
    VkImageLayout                               imageLayout,
    const VkClearDepthStencilValue*             pDepthStencil,
    uint32_t                                    rangeCount,
    const VkImageSubresourceRange*              pRanges);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code image} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code imageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The image range of any given element of {@code pRanges} <b>must</b> be an image subresource range that is contained within {@code image}</li>
	 * <li>{@code image} <b>must</b> have a depth/stencil format</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pDepthStencil} <b>must</b> be a pointer to a valid {@link VkClearDepthStencilValue} structure</li>
	 * <li>{@code pRanges} <b>must</b> be a pointer to an array of {@code rangeCount} valid {@link VkImageSubresourceRange} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code rangeCount} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code image} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkClearDepthStencilValue}, {@link VkImageSubresourceRange}</p>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param image         the image to be cleared.
	 * @param imageLayout   specifies the current layout of the image subresource ranges to be cleared, and <b>must</b> be {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL} or {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}.
	 * @param pDepthStencil a pointer to a {@link VkClearDepthStencilValue} structure that contains the values the depth and stencil image subresource ranges will be cleared to (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#clears-values">the “Clear Values” section</a> below).
	 * @param pRanges       points to an array of {@link VkImageSubresourceRange} structures that describe a range of mipmap levels, array layers, and aspects to be cleared, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#resources-image-views">Image Views</a>. The {@code aspectMask} of each image subresource range in {@code pRanges} <b>can</b> include {@link #VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} if the image format has a depth component, and {@link #VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT} if the image format has a stencil component. {@code pDepthStencil} is a pointer to a {@link VkClearDepthStencilValue} structure that contains the values the image subresource ranges will be cleared to (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#clears-values">the “Clear Values” section</a> below).
	 */
	public static void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearDepthStencilValue pDepthStencil, VkImageSubresourceRange.Buffer pRanges) {
		nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), pRanges.remaining(), pRanges.address());
	}

	/**
	 * Fill regions of a combined depth-stencil image.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To clear one or more subranges of a depth/stencil image, call:</p>
	 * 
	 * <pre><code>void vkCmdClearDepthStencilImage(
    VkCommandBuffer                             commandBuffer,
    VkImage                                     image,
    VkImageLayout                               imageLayout,
    const VkClearDepthStencilValue*             pDepthStencil,
    uint32_t                                    rangeCount,
    const VkImageSubresourceRange*              pRanges);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code image} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code imageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The image range of any given element of {@code pRanges} <b>must</b> be an image subresource range that is contained within {@code image}</li>
	 * <li>{@code image} <b>must</b> have a depth/stencil format</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pDepthStencil} <b>must</b> be a pointer to a valid {@link VkClearDepthStencilValue} structure</li>
	 * <li>{@code pRanges} <b>must</b> be a pointer to an array of {@code rangeCount} valid {@link VkImageSubresourceRange} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code rangeCount} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code image} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkClearDepthStencilValue}, {@link VkImageSubresourceRange}</p>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param image         the image to be cleared.
	 * @param imageLayout   specifies the current layout of the image subresource ranges to be cleared, and <b>must</b> be {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL} or {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}.
	 * @param pDepthStencil a pointer to a {@link VkClearDepthStencilValue} structure that contains the values the depth and stencil image subresource ranges will be cleared to (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#clears-values">the “Clear Values” section</a> below).
	 */
	public static void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearDepthStencilValue pDepthStencil, VkImageSubresourceRange pRange) {
		nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), 1, pRange.address());
	}

	// --- [ vkCmdClearAttachments ] ---

	/**
	 * Unsafe version of: {@link #vkCmdClearAttachments CmdClearAttachments}
	 *
	 * @param attachmentCount the number of entries in the {@code pAttachments} array.
	 * @param rectCount       the number of entries in the {@code pRects} array.
	 */
	public static void nvkCmdClearAttachments(VkCommandBuffer commandBuffer, int attachmentCount, long pAttachments, int rectCount, long pRects) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdClearAttachments;
		callPPPV(__functionAddress, commandBuffer.address(), attachmentCount, pAttachments, rectCount, pRects);
	}

	/**
	 * Clear regions within currently bound framebuffer attachments.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To clear one or more regions of color and depth/stencil attachments inside a render pass instance, call:</p>
	 * 
	 * <pre><code>void vkCmdClearAttachments(
    VkCommandBuffer                             commandBuffer,
    uint32_t                                    attachmentCount,
    const VkClearAttachment*                    pAttachments,
    uint32_t                                    rectCount,
    const VkClearRect*                          pRects);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkCmdClearAttachments CmdClearAttachments} <b>can</b> clear multiple regions of each attachment used in the current subpass of a render pass instance. This command <b>must</b> be called only inside a render pass instance, and implicitly selects the images to clear based on the current framebuffer attachments and the command parameters.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If the {@code aspectMask} member of any given element of {@code pAttachments} contains {@link #VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}, the {@code colorAttachment} member of those elements <b>must</b> refer to a valid color attachment in the current subpass</li>
	 * <li>The rectangular region specified by a given element of {@code pRects} <b>must</b> be contained within the render area of the current render pass instance</li>
	 * <li>The layers specified by a given element of {@code pRects} <b>must</b> be contained within every attachment that {@code pAttachments} refers to</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pAttachments} <b>must</b> be a pointer to an array of {@code attachmentCount} valid {@link VkClearAttachment} structures</li>
	 * <li>{@code pRects} <b>must</b> be a pointer to an array of {@code rectCount} {@link VkClearRect} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
	 * <li>{@code rectCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkClearAttachment}, {@link VkClearRect}</p>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param pAttachments  a pointer to an array of {@link VkClearAttachment} structures defining the attachments to clear and the clear values to use.
	 * @param pRects        points to an array of {@link VkClearRect} structures defining regions within each selected attachment to clear.
	 */
	public static void vkCmdClearAttachments(VkCommandBuffer commandBuffer, VkClearAttachment.Buffer pAttachments, VkClearRect.Buffer pRects) {
		nvkCmdClearAttachments(commandBuffer, pAttachments.remaining(), pAttachments.address(), pRects.remaining(), pRects.address());
	}

	// --- [ vkCmdResolveImage ] ---

	/**
	 * Unsafe version of: {@link #vkCmdResolveImage CmdResolveImage}
	 *
	 * @param regionCount the number of regions to resolve.
	 */
	public static void nvkCmdResolveImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdResolveImage;
		callPJJPV(__functionAddress, commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
	}

	/**
	 * Resolve regions of an image.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To resolve a multisample image to a non-multisample image, call:</p>
	 * 
	 * <pre><code>void vkCmdResolveImage(
    VkCommandBuffer                             commandBuffer,
    VkImage                                     srcImage,
    VkImageLayout                               srcImageLayout,
    VkImage                                     dstImage,
    VkImageLayout                               dstImageLayout,
    uint32_t                                    regionCount,
    const VkImageResolve*                       pRegions);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>During the resolve the samples corresponding to each pixel location in the source are converted to a single sample before being written to the destination. If the source formats are floating-point or normalized types, the sample values for each pixel are resolved in an implementation-dependent manner. If the source formats are integer types, a single sample's value is selected for each pixel.</p>
	 * 
	 * <p>{@code srcOffset} and {@code dstOffset} select the initial x, y, and z offsets in texels of the sub-regions of the source and destination image data. {@code extent} is the size in texels of the source image to resolve in {@code width}, {@code height} and {@code depth}.</p>
	 * 
	 * <p>Resolves are done layer by layer starting with {@code baseArrayLayer} member of {@code srcSubresource} for the source and {@code dstSubresource} for the destination. {@code layerCount} layers are resolved to the destination image.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
	 * <li>{@code srcImage} <b>must</b> have a sample count equal to any valid sample count value other than {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code dstImage} <b>must</b> have a sample count equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>If {@code dstImage} was created with {@code tiling} equal to {@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, {@code dstImage} <b>must</b> have been created with a {@code format} that supports being a color attachment, as specified by the {@link #VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>If {@code dstImage} was created with {@code tiling} equal to {@link #VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code dstImage} <b>must</b> have been created with a {@code format} that supports being a color attachment, as specified by the {@link #VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid {@link VkImageResolve} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkImageResolve}</p>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded.
	 * @param srcImage       the source image.
	 * @param srcImageLayout the layout of the source image subresources for the resolve.
	 * @param dstImage       the destination image.
	 * @param dstImageLayout the layout of the destination image subresources for the resolve.
	 * @param pRegions       a pointer to an array of {@link VkImageResolve} structures specifying the regions to resolve.
	 */
	public static void vkCmdResolveImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageResolve.Buffer pRegions) {
		nvkCmdResolveImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
	}

	/**
	 * Resolve regions of an image.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To resolve a multisample image to a non-multisample image, call:</p>
	 * 
	 * <pre><code>void vkCmdResolveImage(
    VkCommandBuffer                             commandBuffer,
    VkImage                                     srcImage,
    VkImageLayout                               srcImageLayout,
    VkImage                                     dstImage,
    VkImageLayout                               dstImageLayout,
    uint32_t                                    regionCount,
    const VkImageResolve*                       pRegions);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>During the resolve the samples corresponding to each pixel location in the source are converted to a single sample before being written to the destination. If the source formats are floating-point or normalized types, the sample values for each pixel are resolved in an implementation-dependent manner. If the source formats are integer types, a single sample's value is selected for each pixel.</p>
	 * 
	 * <p>{@code srcOffset} and {@code dstOffset} select the initial x, y, and z offsets in texels of the sub-regions of the source and destination image data. {@code extent} is the size in texels of the source image to resolve in {@code width}, {@code height} and {@code depth}.</p>
	 * 
	 * <p>Resolves are done layer by layer starting with {@code baseArrayLayer} member of {@code srcSubresource} for the source and {@code dstSubresource} for the destination. {@code layerCount} layers are resolved to the destination image.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
	 * <li>{@code srcImage} <b>must</b> have a sample count equal to any valid sample count value other than {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code dstImage} <b>must</b> have a sample count equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>If {@code dstImage} was created with {@code tiling} equal to {@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, {@code dstImage} <b>must</b> have been created with a {@code format} that supports being a color attachment, as specified by the {@link #VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>If {@code dstImage} was created with {@code tiling} equal to {@link #VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code dstImage} <b>must</b> have been created with a {@code format} that supports being a color attachment, as specified by the {@link #VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid {@link VkImageResolve} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkImageResolve}</p>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded.
	 * @param srcImage       the source image.
	 * @param srcImageLayout the layout of the source image subresources for the resolve.
	 * @param dstImage       the destination image.
	 * @param dstImageLayout the layout of the destination image subresources for the resolve.
	 */
	public static void vkCmdResolveImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageResolve pRegion) {
		nvkCmdResolveImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, 1, pRegion.address());
	}

	// --- [ vkCmdSetEvent ] ---

	/**
	 * Set an event object to signaled state.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>The state of an event <b>can</b> also be updated on the device by commands inserted in command buffers. To set the state of an event to signaled from a device, call:</p>
	 * 
	 * <pre><code>void vkCmdSetEvent(
    VkCommandBuffer                             commandBuffer,
    VkEvent                                     event,
    VkPipelineStageFlags                        stageMask);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
	 * <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code stageMask} <b>must</b> not be 0</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Both of {@code commandBuffer}, and {@code event} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded.
	 * @param event         the event that will be signaled.
	 * @param stageMask     specifies the pipeline stage at which the state of {@code event} is updated as described below.
	 */
	public static void vkCmdSetEvent(VkCommandBuffer commandBuffer, long event, int stageMask) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetEvent;
		callPJV(__functionAddress, commandBuffer.address(), event, stageMask);
	}

	// --- [ vkCmdResetEvent ] ---

	/**
	 * Reset an event object to non-signaled state.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To set the state of an event to unsignaled from a device, call:</p>
	 * 
	 * <pre><code>void vkCmdResetEvent(
    VkCommandBuffer                             commandBuffer,
    VkEvent                                     event,
    VkPipelineStageFlags                        stageMask);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>When this command executes, {@code event} <b>must</b> not be waited on by a {@link #vkCmdWaitEvents CmdWaitEvents} command that is currently executing</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
	 * <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code stageMask} <b>must</b> not be 0</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Both of {@code commandBuffer}, and {@code event} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded.
	 * @param event         the event that will be reset.
	 * @param stageMask     specifies the pipeline stage at which the state of {@code event} is updated as described below.
	 */
	public static void vkCmdResetEvent(VkCommandBuffer commandBuffer, long event, int stageMask) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdResetEvent;
		callPJV(__functionAddress, commandBuffer.address(), event, stageMask);
	}

	// --- [ vkCmdWaitEvents ] ---

	/**
	 * Unsafe version of: {@link #vkCmdWaitEvents CmdWaitEvents}
	 *
	 * @param eventCount the length of the {@code pEvents} array.
	 */
	public static void nvkCmdWaitEvents(VkCommandBuffer commandBuffer, int eventCount, long pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents;
		callPPPPPV(__functionAddress, commandBuffer.address(), eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
	}

	/**
	 * Wait for one or more events and insert a set of memory.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To wait for one or more events to enter the signaled state on a device, call:</p>
	 * 
	 * <pre><code>void vkCmdWaitEvents(
    VkCommandBuffer                             commandBuffer,
    uint32_t                                    eventCount,
    const VkEvent*                              pEvents,
    VkPipelineStageFlags                        srcStageMask,
    VkPipelineStageFlags                        dstStageMask,
    uint32_t                                    memoryBarrierCount,
    const VkMemoryBarrier*                      pMemoryBarriers,
    uint32_t                                    bufferMemoryBarrierCount,
    const VkBufferMemoryBarrier*                pBufferMemoryBarriers,
    uint32_t                                    imageMemoryBarrierCount,
    const VkImageMemoryBarrier*                 pImageMemoryBarriers);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkCmdWaitEvents CmdWaitEvents} waits for events set by either {@link #vkSetEvent SetEvent} or {@link #vkCmdSetEvent CmdSetEvent} to become signaled. Logically, it has three phases:</p>
	 * 
	 * <ul>
	 * <li>Wait at the pipeline stages specified by {@code dstStageMask} (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-pipeline-stage-flags">the “Pipeline Stage Flags” section</a>) until the {@code eventCount} event objects specified by {@code pEvents} become signaled. Implementations <b>may</b> wait for each event object to become signaled in sequence (starting with the first event object in {@code pEvents}, and ending with the last), or wait for all of the event objects to become signaled at the same time.</li>
	 * <li>Execute the memory barriers specified by {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers} (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-memory-barriers">the “Memory Barriers” section</a>).</li>
	 * <li>Resume execution of pipeline stages specified by {@code dstStageMask}</li>
	 * </ul>
	 * 
	 * <p>Implementations <b>may</b> not execute commands in a pipelined manner, so {@link #vkCmdWaitEvents CmdWaitEvents} <b>may</b> not observe the results of a subsequent {@link #vkCmdSetEvent CmdSetEvent} or {@link #vkCmdResetEvent CmdResetEvent} command, even if the stages in {@code dstStageMask} occur after the stages in {@code srcStageMask}.</p>
	 * 
	 * <p>Commands that update the state of events in different pipeline stages <b>may</b> execute out of order, unless the ordering is enforced by execution dependencies.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>should</b> be careful to avoid race conditions when using events. For example, an event <b>should</b> only be reset if no {@link #vkCmdWaitEvents CmdWaitEvents} command is executing that waits upon that event.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code srcStageMask} <b>must</b> be the bitwise OR of the {@code stageMask} parameter used in previous calls to {@link #vkCmdSetEvent CmdSetEvent} with any of the members of {@code pEvents} and {@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT} if any of the members of {@code pEvents} was set using {@link #vkSetEvent SetEvent}</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>If {@code pEvents} includes one or more events that will be signaled by {@link #vkSetEvent SetEvent} after {@code commandBuffer} has been submitted to a queue, then {@link #vkCmdWaitEvents CmdWaitEvents} <b>must</b> not be called inside a render pass instance</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pEvents} <b>must</b> be a pointer to an array of {@code eventCount} valid {@code VkEvent} handles</li>
	 * <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code srcStageMask} <b>must</b> not be 0</li>
	 * <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code dstStageMask} <b>must</b> not be 0</li>
	 * <li>If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} <b>must</b> be a pointer to an array of {@code memoryBarrierCount} valid {@link VkMemoryBarrier} structures</li>
	 * <li>If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} <b>must</b> be a pointer to an array of {@code bufferMemoryBarrierCount} valid {@link VkBufferMemoryBarrier} structures</li>
	 * <li>If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} <b>must</b> be a pointer to an array of {@code imageMemoryBarrierCount} valid {@link VkImageMemoryBarrier} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>{@code eventCount} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and the elements of {@code pEvents} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkBufferMemoryBarrier}, {@link VkImageMemoryBarrier}, {@link VkMemoryBarrier}</p>
	 *
	 * @param commandBuffer         the command buffer into which the command is recorded.
	 * @param pEvents               an array of event object handles to wait on.
	 * @param srcStageMask          (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-pipeline-stage-flags">the “Pipeline Stage Flags” section</a>) is the bitwise OR of the pipeline stages used to signal the event object handles in {@code pEvents}.
	 * @param dstStageMask          the pipeline stages at which the wait will occur.
	 * @param pMemoryBarriers       a pointer to an array of {@code memoryBarrierCount} {@link VkMemoryBarrier} structures.
	 * @param pBufferMemoryBarriers a pointer to an array of {@code bufferMemoryBarrierCount} {@link VkBufferMemoryBarrier} structures.
	 * @param pImageMemoryBarriers  a pointer to an array of {@code imageMemoryBarrierCount} {@link VkImageMemoryBarrier} structures. See <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-memory-barriers">the “Memory Barriers” section</a> for more details about memory barriers.
	 */
	public static void vkCmdWaitEvents(VkCommandBuffer commandBuffer, LongBuffer pEvents, int srcStageMask, int dstStageMask, VkMemoryBarrier.Buffer pMemoryBarriers, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
		nvkCmdWaitEvents(commandBuffer, pEvents.remaining(), memAddress(pEvents), srcStageMask, dstStageMask, remainingSafe(pMemoryBarriers), memAddressSafe(pMemoryBarriers), remainingSafe(pBufferMemoryBarriers), memAddressSafe(pBufferMemoryBarriers), remainingSafe(pImageMemoryBarriers), memAddressSafe(pImageMemoryBarriers));
	}

	// --- [ vkCmdPipelineBarrier ] ---

	/**
	 * Unsafe version of: {@link #vkCmdPipelineBarrier CmdPipelineBarrier}
	 *
	 * @param memoryBarrierCount       the length of the {@code pMemoryBarriers} array.
	 * @param bufferMemoryBarrierCount the length of the {@code pBufferMemoryBarriers} array.
	 * @param imageMemoryBarrierCount  the length of the {@code pImageMemoryBarriers} array.
	 */
	public static void nvkCmdPipelineBarrier(VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPipelineBarrier;
		callPPPPV(__functionAddress, commandBuffer.address(), srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
	}

	/**
	 * Insert a set of execution and memory barriers.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To record a pipeline barrier, call:</p>
	 * 
	 * <pre><code>void vkCmdPipelineBarrier(
    VkCommandBuffer                             commandBuffer,
    VkPipelineStageFlags                        srcStageMask,
    VkPipelineStageFlags                        dstStageMask,
    VkDependencyFlags                           dependencyFlags,
    uint32_t                                    memoryBarrierCount,
    const VkMemoryBarrier*                      pMemoryBarriers,
    uint32_t                                    bufferMemoryBarrierCount,
    const VkBufferMemoryBarrier*                pBufferMemoryBarriers,
    uint32_t                                    imageMemoryBarrierCount,
    const VkImageMemoryBarrier*                 pImageMemoryBarriers);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Each element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers} arrays specifies two halves of a memory dependency, as defined above. Specifics of each type of memory barrier and the memory access types are defined further in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-memory-barriers">Memory Barriers</a>.</p>
	 * 
	 * <p>If {@link #vkCmdPipelineBarrier CmdPipelineBarrier} is called outside a render pass instance, then the first set of commands is all prior commands submitted to the queue and recorded in the command buffer and the second set of commands is all subsequent commands recorded in the command buffer and submitted to the queue. If {@link #vkCmdPipelineBarrier CmdPipelineBarrier} is called inside a render pass instance, then the first set of commands is all prior commands in the same subpass and the second set of commands is all subsequent commands in the same subpass.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>If {@link #vkCmdPipelineBarrier CmdPipelineBarrier} is called within a render pass instance, the render pass <b>must</b> have been created with a {@link VkSubpassDependency} instance in {@code pDependencies} that expresses a dependency from the current subpass to itself. Additionally:
	 * 
	 * <ul>
	 * <li>{@code srcStageMask} <b>must</b> contain a subset of the bit values in the {@code srcStageMask} member of that instance of {@link VkSubpassDependency}</li>
	 * <li>{@code dstStageMask} <b>must</b> contain a subset of the bit values in the {@code dstStageMask} member of that instance of {@link VkSubpassDependency}</li>
	 * <li>The {@code srcAccessMask} of any element of {@code pMemoryBarriers} or {@code pImageMemoryBarriers} <b>must</b> contain a subset of the bit values the {@code srcAccessMask} member of that instance of {@link VkSubpassDependency}</li>
	 * <li>The {@code dstAccessMask} of any element of {@code pMemoryBarriers} or {@code pImageMemoryBarriers} <b>must</b> contain a subset of the bit values the {@code dstAccessMask} member of that instance of {@link VkSubpassDependency}</li>
	 * <li>{@code dependencyFlags} <b>must</b> be equal to the {@code dependencyFlags} member of that instance of {@link VkSubpassDependency}</li>
	 * </ul>
	 * </li>
	 * <li>If {@link #vkCmdPipelineBarrier CmdPipelineBarrier} is called within a render pass instance, {@code bufferMemoryBarrierCount} <b>must</b> be 0</li>
	 * <li>If {@link #vkCmdPipelineBarrier CmdPipelineBarrier} is called within a render pass instance, the {@code image} member of any element of {@code pImageMemoryBarriers} <b>must</b> be equal to one of the elements of {@code pAttachments} that the current {@code framebuffer} was created with, that is also referred to by one of the elements of the {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment} members of the {@link VkSubpassDescription} instance that the current subpass was created with</li>
	 * <li>If {@link #vkCmdPipelineBarrier CmdPipelineBarrier} is called within a render pass instance, the {@code oldLayout} and {@code newLayout} members of any element of {@code pImageMemoryBarriers} <b>must</b> be equal to the {@code layout} member of an element of the {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment} members of the {@link VkSubpassDescription} instance that the current subpass was created with, that refers to the same {@code image}</li>
	 * <li>If {@link #vkCmdPipelineBarrier CmdPipelineBarrier} is called within a render pass instance, the {@code oldLayout} and {@code newLayout} members of an element of {@code pImageMemoryBarriers} <b>must</b> be equal</li>
	 * <li>If {@link #vkCmdPipelineBarrier CmdPipelineBarrier} is called within a render pass instance, the {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} members of any element of {@code pImageMemoryBarriers} <b>must</b> be {@link #VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code srcStageMask} <b>must</b> not be 0</li>
	 * <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code dstStageMask} <b>must</b> not be 0</li>
	 * <li>{@code dependencyFlags} <b>must</b> be a valid combination of {@code VkDependencyFlagBits} values</li>
	 * <li>If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} <b>must</b> be a pointer to an array of {@code memoryBarrierCount} valid {@link VkMemoryBarrier} structures</li>
	 * <li>If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} <b>must</b> be a pointer to an array of {@code bufferMemoryBarrierCount} valid {@link VkBufferMemoryBarrier} structures</li>
	 * <li>If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} <b>must</b> be a pointer to an array of {@code imageMemoryBarrierCount} valid {@link VkImageMemoryBarrier} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>TRANSFER GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkBufferMemoryBarrier}, {@link VkImageMemoryBarrier}, {@link VkMemoryBarrier}</p>
	 *
	 * @param commandBuffer         the command buffer into which the command is recorded.
	 * @param srcStageMask          a bitmask of {@code VkPipelineStageFlagBits} specifying a set of source pipeline stages (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-pipeline-stage-flags">the “Pipeline Stage Flags” section</a>).
	 * @param dstStageMask          a bitmask specifying a set of destination pipeline stages.
The pipeline barrier specifies an execution dependency such that all work performed by the set of pipeline stages included in {@code srcStageMask} of the first set of commands completes before any work performed by the set of pipeline stages included in {@code dstStageMask} of the second set of commands begins.
	 * @param dependencyFlags       a bitmask of {@code VkDependencyFlagBits}. The execution dependency is by-region if the mask includes {@link #VK_DEPENDENCY_BY_REGION_BIT DEPENDENCY_BY_REGION_BIT}.
	 * @param pMemoryBarriers       a pointer to an array of {@link VkMemoryBarrier} structures.
	 * @param pBufferMemoryBarriers a pointer to an array of {@link VkBufferMemoryBarrier} structures.
	 * @param pImageMemoryBarriers  a pointer to an array of {@link VkImageMemoryBarrier} structures.
	 */
	public static void vkCmdPipelineBarrier(VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, VkMemoryBarrier.Buffer pMemoryBarriers, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
		nvkCmdPipelineBarrier(commandBuffer, srcStageMask, dstStageMask, dependencyFlags, remainingSafe(pMemoryBarriers), memAddressSafe(pMemoryBarriers), remainingSafe(pBufferMemoryBarriers), memAddressSafe(pBufferMemoryBarriers), remainingSafe(pImageMemoryBarriers), memAddressSafe(pImageMemoryBarriers));
	}

	// --- [ vkCmdBeginQuery ] ---

	/**
	 * Begin a query.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To begin a query, call:</p>
	 * 
	 * <pre><code>void vkCmdBeginQuery(
    VkCommandBuffer                             commandBuffer,
    VkQueryPool                                 queryPool,
    uint32_t                                    query,
    VkQueryControlFlags                         flags);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If the {@code queryType} of the pool is {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} and {@code flags} contains {@link #VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT}, an implementation <b>must</b> return a result that matches the actual number of samples passed. This is described in more detail in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-occlusion">Occlusion Queries</a>.</p>
	 * 
	 * <p>After beginning a query, that query is considered <em>active</em> within the command buffer it was called in until that same query is ended. Queries active in a primary command buffer when secondary command buffers are executed are considered active for those secondary command buffers.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The query identified by {@code queryPool} and {@code query} <b>must</b> currently not be <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a></li>
	 * <li>The query identified by {@code queryPool} and {@code query} <b>must</b> be unavailable</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-occlusionQueryPrecise">precise occlusion queries</a> feature is not enabled, or the {@code queryType} used to create {@code queryPool} was not {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION}, {@code flags} <b>must</b> not contain {@link #VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT}</li>
	 * <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} that differs from that of any other queries that have been made <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a>, and are currently still active within {@code commandBuffer}</li>
	 * <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
	 * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION}, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} and any of the {@code pipelineStatistics} indicate graphics operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} and any of the {@code pipelineStatistics} indicate compute operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryControlFlagBits} values</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which this command will be recorded.
	 * @param queryPool     the query pool that will manage the results of the query.
	 * @param query         the query index within the query pool that will contain the results.
	 * @param flags         a bitmask indicating constraints on the types of queries that <b>can</b> be performed. Bits which <b>can</b> be set include:
	 */
	public static void vkCmdBeginQuery(VkCommandBuffer commandBuffer, long queryPool, int query, int flags) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginQuery;
		callPJV(__functionAddress, commandBuffer.address(), queryPool, query, flags);
	}

	// --- [ vkCmdEndQuery ] ---

	/**
	 * Ends a query.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To end a query after the set of desired draw or dispatch commands is executed, call:</p>
	 * 
	 * <pre><code>void vkCmdEndQuery(
    VkCommandBuffer                             commandBuffer,
    VkQueryPool                                 queryPool,
    uint32_t                                    query);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>As queries operate asynchronously, ending a query does not immediately set the query's status to available. A query is considered <em>finished</em> when the final results of the query are ready to be retrieved by {@link #vkGetQueryPoolResults GetQueryPoolResults} and {@link #vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults}, and this is when the query's status is set to available.</p>
	 * 
	 * <p>Once a query is ended the query <b>must</b> finish in finite time, unless the state of the query is changed using other commands, e.g. by issuing a reset of the query.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The query identified by {@code queryPool} and {@code query} <b>must</b> currently be <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a></li>
	 * <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which this command will be recorded.
	 * @param queryPool     the query pool that is managing the results of the query.
	 * @param query         the query index within the query pool where the result is stored.
	 */
	public static void vkCmdEndQuery(VkCommandBuffer commandBuffer, long queryPool, int query) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdEndQuery;
		callPJV(__functionAddress, commandBuffer.address(), queryPool, query);
	}

	// --- [ vkCmdResetQueryPool ] ---

	/**
	 * Reset queries in a query pool.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To reset a range of queries in a query pool, call:</p>
	 * 
	 * <pre><code>void vkCmdResetQueryPool(
    VkCommandBuffer                             commandBuffer,
    VkQueryPool                                 queryPool,
    uint32_t                                    firstQuery,
    uint32_t                                    queryCount);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>When executed on a queue, this command sets the status of query indices <code>[firstQuery, firstQuery + queryCount - 1]</code> to unavailable.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
	 * <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which this command will be recorded.
	 * @param queryPool     the handle of the query pool managing the queries being reset.
	 * @param firstQuery    the initial query index to reset.
	 * @param queryCount    the number of queries to reset.
	 */
	public static void vkCmdResetQueryPool(VkCommandBuffer commandBuffer, long queryPool, int firstQuery, int queryCount) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdResetQueryPool;
		callPJV(__functionAddress, commandBuffer.address(), queryPool, firstQuery, queryCount);
	}

	// --- [ vkCmdWriteTimestamp ] ---

	/**
	 * Write a device timestamp into a query object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To request a timestamp, call:</p>
	 * 
	 * <pre><code>void vkCmdWriteTimestamp(
    VkCommandBuffer                             commandBuffer,
    VkPipelineStageFlagBits                     pipelineStage,
    VkQueryPool                                 queryPool,
    uint32_t                                    query);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkCmdWriteTimestamp CmdWriteTimestamp} latches the value of the timer when all previous commands have completed executing as far as the specified pipeline stage, and writes the timestamp value to memory. When the timestamp value is written, the availability status of the query is set to available.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>If an implementation is unable to detect completion and latch the timer at any specific stage of the pipeline, it <b>may</b> instead do so at any logically later stage.</p>
	 * </div>
	 * 
	 * <p>{@link #vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults} <b>can</b> then be called to copy the timestamp value from the query pool into buffer memory, with ordering and synchronization behavior equivalent to how other queries operate. Timestamp values <b>can</b> also be retrieved from the query pool using {@link #vkGetQueryPoolResults GetQueryPoolResults}. As with other queries, the query <b>must</b> be reset using {@link #vkCmdResetQueryPool CmdResetQueryPool} before requesting the timestamp value be written to it.</p>
	 * 
	 * <p>While {@link #vkCmdWriteTimestamp CmdWriteTimestamp} <b>can</b> be called inside or outside of a render pass instance, {@link #vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults} <b>must</b> only be called outside of a render pass instance.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The query identified by {@code queryPool} and {@code query} <b>must</b> be <em>unavailable</em></li>
	 * <li>The command pool&#8217;s queue family <b>must</b> support a non-zero {@code timestampValidBits}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pipelineStage} <b>must</b> be a valid {@code VkPipelineStageFlagBits} value</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded.
	 * @param pipelineStage one of the {@code VkPipelineStageFlagBits}, specifying a stage of the pipeline.
	 * @param queryPool     the query pool that will manage the timestamp.
	 * @param query         the query within the query pool that will contain the timestamp.
	 */
	public static void vkCmdWriteTimestamp(VkCommandBuffer commandBuffer, int pipelineStage, long queryPool, int query) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteTimestamp;
		callPJV(__functionAddress, commandBuffer.address(), pipelineStage, queryPool, query);
	}

	// --- [ vkCmdCopyQueryPoolResults ] ---

	/**
	 * Copy the results of queries in a query pool to a buffer object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To copy query statuses and numerical results directly to buffer memory, call:</p>
	 * 
	 * <pre><code>void vkCmdCopyQueryPoolResults(
    VkCommandBuffer                             commandBuffer,
    VkQueryPool                                 queryPool,
    uint32_t                                    firstQuery,
    uint32_t                                    queryCount,
    VkBuffer                                    dstBuffer,
    VkDeviceSize                                dstOffset,
    VkDeviceSize                                stride,
    VkQueryResultFlags                          flags);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults} is guaranteed to see the effect of previous uses of {@link #vkCmdResetQueryPool CmdResetQueryPool} in the same queue, without any additional synchronization. Thus, the results will always reflect the most recent use of the query.</p>
	 * 
	 * <p>{@code flags} has the same possible values described above for the {@code flags} parameter of {@link #vkGetQueryPoolResults GetQueryPoolResults}, but the different style of execution causes some subtle behavioral differences. Because {@link #vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults} executes in order with respect to other query commands, there is less ambiguity about which use of a query is being requested.</p>
	 * 
	 * <p>If no bits are set in {@code flags}, results for all requested queries in the available state are written as 32-bit unsigned integer values, and nothing is written for queries in the unavailable state.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is set, the results are written as an array of 64-bit unsigned integer values as described for {@link #vkGetQueryPoolResults GetQueryPoolResults}.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is set, the implementation will wait for each query's status to be in the available state before retrieving the numerical results for that query. This is guaranteed to reflect the most recent use of the query on the same queue, assuming that the query is not being simultaneously used by other queues. If the query does not become available in a finite amount of time (e.g. due to not issuing a query since the last reset), a {@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST} error <b>may</b> occur.</p>
	 * 
	 * <p>Similarly, if {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is set and {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is not set, the availability is guaranteed to reflect the most recent use of the query on the same queue, assuming that the query is not being simultaneously used by other queues. As with {@link #vkGetQueryPoolResults GetQueryPoolResults}, implementations <b>must</b> guarantee that if they return a non-zero availability value, then the numerical results are valid.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} is set, {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is not set, and the query's status is unavailable, an intermediate result value between zero and the final result value is written for that query.</p>
	 * 
	 * <p>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} <b>must</b> not be used if the pool's {@code queryType} is {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}.</p>
	 * 
	 * <p>{@link #vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults} is considered to be a transfer operation, and its writes to buffer memory <b>must</b> be synchronized using {@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT} and {@link #VK_ACCESS_TRANSFER_WRITE_BIT ACCESS_TRANSFER_WRITE_BIT} before using the results.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
	 * <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is not set in {@code flags} then {@code dstOffset} and {@code stride} <b>must</b> be multiples of 4</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is set in {@code flags} then {@code dstOffset} and {@code stride} <b>must</b> be multiples of 8</li>
	 * <li>{@code dstBuffer} <b>must</b> have enough storage, from {@code dstOffset}, to contain the result of each query, as described <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-memorylayout">here</a></li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}, {@code flags} <b>must</b> not contain {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryResultFlagBits} values</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Each of {@code commandBuffer}, {@code dstBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which this command will be recorded.
	 * @param queryPool     the query pool managing the queries containing the desired results.
	 * @param firstQuery    the initial query index.
	 * @param queryCount    the number of queries. {@code firstQuery} and {@code queryCount} together define a range of queries.
	 * @param dstBuffer     a {@code VkBuffer} object that will receive the results of the copy command.
	 * @param dstOffset     an offset into {@code dstBuffer}.
	 * @param stride        the stride in bytes between results for individual queries within {@code dstBuffer}. The required size of the backing memory for {@code dstBuffer} is determined as described above for {@link #vkGetQueryPoolResults GetQueryPoolResults}.
	 * @param flags         a bitmask of {@code VkQueryResultFlagBits} specifying how and when results are returned.
	 */
	public static void vkCmdCopyQueryPoolResults(VkCommandBuffer commandBuffer, long queryPool, int firstQuery, int queryCount, long dstBuffer, long dstOffset, long stride, int flags) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyQueryPoolResults;
		callPJJJJV(__functionAddress, commandBuffer.address(), queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags);
	}

	// --- [ vkCmdPushConstants ] ---

	/**
	 * Unsafe version of: {@link #vkCmdPushConstants CmdPushConstants}
	 *
	 * @param size the size of the push constant range to update, in units of bytes.
	 */
	public static void nvkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, int size, long pValues) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
		callPJPV(__functionAddress, commandBuffer.address(), layout, stageFlags, offset, size, pValues);
	}

	/**
	 * Update the values of push constants.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To update push constants, call:</p>
	 * 
	 * <pre><code>void vkCmdPushConstants(
    VkCommandBuffer                             commandBuffer,
    VkPipelineLayout                            layout,
    VkShaderStageFlags                          stageFlags,
    uint32_t                                    offset,
    uint32_t                                    size,
    const void*                                 pValues);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code stageFlags} <b>must</b> match exactly the shader stages used in {@code layout} for the range specified by {@code offset} and {@code size}</li>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code size} <b>must</b> be a multiple of 4</li>
	 * <li>{@code offset} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize}</li>
	 * <li>{@code size} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize} minus {@code offset}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
	 * <li>{@code stageFlags} <b>must</b> not be 0</li>
	 * <li>{@code pValues} <b>must</b> be a pointer to an array of {@code size} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>{@code size} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer in which the push constant update will be recorded.
	 * @param layout        the pipeline layout used to program the push constant updates.
	 * @param stageFlags    a bitmask of {@code VkShaderStageFlagBits} specifying the shader stages that will use the push constants in the updated range.
	 * @param offset        the start offset of the push constant range to update, in units of bytes.
	 * @param pValues       an array of {@code size} bytes containing the new push constant values.
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, ByteBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining(), memAddress(pValues));
	}

	/**
	 * Update the values of push constants.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To update push constants, call:</p>
	 * 
	 * <pre><code>void vkCmdPushConstants(
    VkCommandBuffer                             commandBuffer,
    VkPipelineLayout                            layout,
    VkShaderStageFlags                          stageFlags,
    uint32_t                                    offset,
    uint32_t                                    size,
    const void*                                 pValues);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code stageFlags} <b>must</b> match exactly the shader stages used in {@code layout} for the range specified by {@code offset} and {@code size}</li>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code size} <b>must</b> be a multiple of 4</li>
	 * <li>{@code offset} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize}</li>
	 * <li>{@code size} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize} minus {@code offset}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
	 * <li>{@code stageFlags} <b>must</b> not be 0</li>
	 * <li>{@code pValues} <b>must</b> be a pointer to an array of {@code size} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>{@code size} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer in which the push constant update will be recorded.
	 * @param layout        the pipeline layout used to program the push constant updates.
	 * @param stageFlags    a bitmask of {@code VkShaderStageFlagBits} specifying the shader stages that will use the push constants in the updated range.
	 * @param offset        the start offset of the push constant range to update, in units of bytes.
	 * @param pValues       an array of {@code size} bytes containing the new push constant values.
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, ShortBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 1, memAddress(pValues));
	}

	/**
	 * Update the values of push constants.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To update push constants, call:</p>
	 * 
	 * <pre><code>void vkCmdPushConstants(
    VkCommandBuffer                             commandBuffer,
    VkPipelineLayout                            layout,
    VkShaderStageFlags                          stageFlags,
    uint32_t                                    offset,
    uint32_t                                    size,
    const void*                                 pValues);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code stageFlags} <b>must</b> match exactly the shader stages used in {@code layout} for the range specified by {@code offset} and {@code size}</li>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code size} <b>must</b> be a multiple of 4</li>
	 * <li>{@code offset} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize}</li>
	 * <li>{@code size} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize} minus {@code offset}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
	 * <li>{@code stageFlags} <b>must</b> not be 0</li>
	 * <li>{@code pValues} <b>must</b> be a pointer to an array of {@code size} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>{@code size} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer in which the push constant update will be recorded.
	 * @param layout        the pipeline layout used to program the push constant updates.
	 * @param stageFlags    a bitmask of {@code VkShaderStageFlagBits} specifying the shader stages that will use the push constants in the updated range.
	 * @param offset        the start offset of the push constant range to update, in units of bytes.
	 * @param pValues       an array of {@code size} bytes containing the new push constant values.
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, IntBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 2, memAddress(pValues));
	}

	/**
	 * Update the values of push constants.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To update push constants, call:</p>
	 * 
	 * <pre><code>void vkCmdPushConstants(
    VkCommandBuffer                             commandBuffer,
    VkPipelineLayout                            layout,
    VkShaderStageFlags                          stageFlags,
    uint32_t                                    offset,
    uint32_t                                    size,
    const void*                                 pValues);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code stageFlags} <b>must</b> match exactly the shader stages used in {@code layout} for the range specified by {@code offset} and {@code size}</li>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code size} <b>must</b> be a multiple of 4</li>
	 * <li>{@code offset} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize}</li>
	 * <li>{@code size} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize} minus {@code offset}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
	 * <li>{@code stageFlags} <b>must</b> not be 0</li>
	 * <li>{@code pValues} <b>must</b> be a pointer to an array of {@code size} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>{@code size} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer in which the push constant update will be recorded.
	 * @param layout        the pipeline layout used to program the push constant updates.
	 * @param stageFlags    a bitmask of {@code VkShaderStageFlagBits} specifying the shader stages that will use the push constants in the updated range.
	 * @param offset        the start offset of the push constant range to update, in units of bytes.
	 * @param pValues       an array of {@code size} bytes containing the new push constant values.
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, LongBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 3, memAddress(pValues));
	}

	/**
	 * Update the values of push constants.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To update push constants, call:</p>
	 * 
	 * <pre><code>void vkCmdPushConstants(
    VkCommandBuffer                             commandBuffer,
    VkPipelineLayout                            layout,
    VkShaderStageFlags                          stageFlags,
    uint32_t                                    offset,
    uint32_t                                    size,
    const void*                                 pValues);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code stageFlags} <b>must</b> match exactly the shader stages used in {@code layout} for the range specified by {@code offset} and {@code size}</li>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code size} <b>must</b> be a multiple of 4</li>
	 * <li>{@code offset} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize}</li>
	 * <li>{@code size} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize} minus {@code offset}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
	 * <li>{@code stageFlags} <b>must</b> not be 0</li>
	 * <li>{@code pValues} <b>must</b> be a pointer to an array of {@code size} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>{@code size} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer in which the push constant update will be recorded.
	 * @param layout        the pipeline layout used to program the push constant updates.
	 * @param stageFlags    a bitmask of {@code VkShaderStageFlagBits} specifying the shader stages that will use the push constants in the updated range.
	 * @param offset        the start offset of the push constant range to update, in units of bytes.
	 * @param pValues       an array of {@code size} bytes containing the new push constant values.
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, FloatBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 2, memAddress(pValues));
	}

	/**
	 * Update the values of push constants.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To update push constants, call:</p>
	 * 
	 * <pre><code>void vkCmdPushConstants(
    VkCommandBuffer                             commandBuffer,
    VkPipelineLayout                            layout,
    VkShaderStageFlags                          stageFlags,
    uint32_t                                    offset,
    uint32_t                                    size,
    const void*                                 pValues);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code stageFlags} <b>must</b> match exactly the shader stages used in {@code layout} for the range specified by {@code offset} and {@code size}</li>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code size} <b>must</b> be a multiple of 4</li>
	 * <li>{@code offset} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize}</li>
	 * <li>{@code size} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize} minus {@code offset}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
	 * <li>{@code stageFlags} <b>must</b> not be 0</li>
	 * <li>{@code pValues} <b>must</b> be a pointer to an array of {@code size} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>{@code size} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer in which the push constant update will be recorded.
	 * @param layout        the pipeline layout used to program the push constant updates.
	 * @param stageFlags    a bitmask of {@code VkShaderStageFlagBits} specifying the shader stages that will use the push constants in the updated range.
	 * @param offset        the start offset of the push constant range to update, in units of bytes.
	 * @param pValues       an array of {@code size} bytes containing the new push constant values.
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, DoubleBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 3, memAddress(pValues));
	}

	// --- [ vkCmdBeginRenderPass ] ---

	/** Unsafe version of: {@link #vkCmdBeginRenderPass CmdBeginRenderPass} */
	public static void nvkCmdBeginRenderPass(VkCommandBuffer commandBuffer, long pRenderPassBegin, int contents) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRenderPass;
		if ( CHECKS )
			VkRenderPassBeginInfo.validate(pRenderPassBegin);
		callPPV(__functionAddress, commandBuffer.address(), pRenderPassBegin, contents);
	}

	/**
	 * Begin a new render pass.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To begin a render pass instance, call:</p>
	 * 
	 * <pre><code>void vkCmdBeginRenderPass(
    VkCommandBuffer                             commandBuffer,
    const VkRenderPassBeginInfo*                pRenderPassBegin,
    VkSubpassContents                           contents);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>After beginning a render pass instance, the command buffer is ready to record the commands for the first subpass of that render pass.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link #VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL} then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} set</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link #VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL} then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} set</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link #VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} or {@link #VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} set</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} set</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} set</li>
	 * <li>If any of the {@code initialLayout} members of the {@link VkAttachmentDescription} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is not {@link #VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, then each such {@code initialLayout} <b>must</b> be equal to the current layout of the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pRenderPassBegin} <b>must</b> be a pointer to a valid {@link VkRenderPassBeginInfo} structure</li>
	 * <li>{@code contents} <b>must</b> be a valid {@code VkSubpassContents} value</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary</td><td>Outside</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkRenderPassBeginInfo}</p>
	 *
	 * @param commandBuffer    the command buffer in which to record the command.
	 * @param pRenderPassBegin a pointer to a {@link VkRenderPassBeginInfo} structure (defined below) which indicates the render pass to begin an instance of, and the framebuffer the instance uses.
	 * @param contents         specifies how the commands in the first subpass will be provided, and is one of the values:
	 *                         
	 *                         <pre><code>typedef enum VkSubpassContents {
    VK_SUBPASS_CONTENTS_INLINE = 0,
    VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1,
} VkSubpassContents;</code></pre>
	 *                         
	 *                         <p>If {@code contents} is {@link #VK_SUBPASS_CONTENTS_INLINE SUBPASS_CONTENTS_INLINE}, the contents of the subpass will be recorded inline in the primary command buffer, and secondary command buffers <b>must</b> not be executed within the subpass. If {@code contents} is {@link #VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS}, the contents are recorded in secondary command buffers that will be called from the primary command buffer, and {@link #vkCmdExecuteCommands CmdExecuteCommands} is the only valid command on the command buffer until {@link #vkCmdNextSubpass CmdNextSubpass} or {@link #vkCmdEndRenderPass CmdEndRenderPass}.</p>
	 */
	public static void vkCmdBeginRenderPass(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo pRenderPassBegin, int contents) {
		nvkCmdBeginRenderPass(commandBuffer, pRenderPassBegin.address(), contents);
	}

	// --- [ vkCmdNextSubpass ] ---

	/**
	 * Transition to the next subpass of a render pass.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To transition to the next subpass in the render pass instance after recording the commands for a subpass, call:</p>
	 * 
	 * <pre><code>void vkCmdNextSubpass(
    VkCommandBuffer                             commandBuffer,
    VkSubpassContents                           contents);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The subpass index for a render pass begins at zero when {@link #vkCmdBeginRenderPass CmdBeginRenderPass} is recorded, and increments each time {@link #vkCmdNextSubpass CmdNextSubpass} is recorded.</p>
	 * 
	 * <p>Moving to the next subpass automatically performs any multisample resolve operations in the subpass being ended. End-of-subpass multisample resolves are treated as color attachment writes for the purposes of synchronization. That is, they are considered to execute in the {@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT} pipeline stage and their writes are synchronized with {@link #VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT ACCESS_COLOR_ATTACHMENT_WRITE_BIT}. Synchronization between rendering within a subpass and any resolve operations at the end of the subpass occurs automatically, without need for explicit dependencies or pipeline barriers. However, if the resolve attachment is also used in a different subpass, an explicit dependency is needed.</p>
	 * 
	 * <p>After transitioning to the next subpass, the application <b>can</b> record the commands for that subpass.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The current subpass index <b>must</b> be less than the number of subpasses in the render pass minus one</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code contents} <b>must</b> be a valid {@code VkSubpassContents} value</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary</td><td>Inside</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer in which to record the command.
	 * @param contents      specifies how the commands in the next subpass will be provided, in the same fashion as the corresponding parameter of {@link #vkCmdBeginRenderPass CmdBeginRenderPass}.
	 */
	public static void vkCmdNextSubpass(VkCommandBuffer commandBuffer, int contents) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdNextSubpass;
		callPV(__functionAddress, commandBuffer.address(), contents);
	}

	// --- [ vkCmdEndRenderPass ] ---

	/**
	 * End the current render pass.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To record a command to end a render pass instance after recording the commands for the last subpass, call:</p>
	 * 
	 * <pre><code>void vkCmdEndRenderPass(
    VkCommandBuffer                             commandBuffer);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Ending a render pass instance performs any multisample resolve operations on the final subpass.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The current subpass index <b>must</b> be equal to the number of subpasses in the render pass minus one</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary</td><td>Inside</td><td>GRAPHICS</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer in which to end the current render pass instance.
	 */
	public static void vkCmdEndRenderPass(VkCommandBuffer commandBuffer) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRenderPass;
		callPV(__functionAddress, commandBuffer.address());
	}

	// --- [ vkCmdExecuteCommands ] ---

	/**
	 * Unsafe version of: {@link #vkCmdExecuteCommands CmdExecuteCommands}
	 *
	 * @param commandBufferCount the length of the {@code pCommandBuffers} array.
	 */
	public static void nvkCmdExecuteCommands(VkCommandBuffer commandBuffer, int commandBufferCount, long pCommandBuffers) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdExecuteCommands;
		callPPV(__functionAddress, commandBuffer.address(), commandBufferCount, pCommandBuffers);
	}

	/**
	 * Execute a secondary command buffer from a primary command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>A secondary command buffer <b>must</b> not be directly submitted to a queue. Instead, secondary command buffers are recorded to execute as part of a primary command buffer with the command:</p>
	 * 
	 * <pre><code>void vkCmdExecuteCommands(
    VkCommandBuffer                             commandBuffer,
    uint32_t                                    commandBufferCount,
    const VkCommandBuffer*                      pCommandBuffers);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Once {@link #vkCmdExecuteCommands CmdExecuteCommands} has been called, any prior executions of the secondary command buffers specified by {@code pCommandBuffers} in any other primary command buffer become invalidated, unless those secondary command buffers were recorded with {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> have been allocated with a {@code level} of {@link #VK_COMMAND_BUFFER_LEVEL_PRIMARY COMMAND_BUFFER_LEVEL_PRIMARY}</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> have been allocated with a {@code level} of {@link #VK_COMMAND_BUFFER_LEVEL_SECONDARY COMMAND_BUFFER_LEVEL_SECONDARY}</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> not be already pending execution in {@code commandBuffer}, or appear twice in {@code pCommandBuffers}, unless it was recorded with the {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} flag</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> not be already pending execution in any other {@code VkCommandBuffer}, unless it was recorded with the {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} flag</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> be in the executable state</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> have been allocated from a {@code VkCommandPool} that was created for the same queue family as the {@code VkCommandPool} from which {@code commandBuffer} was allocated</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, that render pass instance <b>must</b> have been begun with the {@code contents} parameter of {@link #vkCmdBeginRenderPass CmdBeginRenderPass} set to {@link #VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS}</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with the {@link #VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with {@link VkCommandBufferInheritanceInfo}{@code ::subpass} set to the index of the subpass which the given command buffer will be executed in</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with a render pass that is compatible with the current render pass - see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#renderpass-compatibility">the “Render Pass Compatibility” section</a></li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, and any given element of {@code pCommandBuffers} was recorded with {@link VkCommandBufferInheritanceInfo}{@code ::framebuffer} not equal to {@link #VK_NULL_HANDLE NULL_HANDLE}, that {@code VkFramebuffer} <b>must</b> match the {@code VkFramebuffer} used in the current render pass instance</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is not being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> not have been recorded with the {@link #VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-inheritedQueries">inherited queries</a> feature is not enabled, {@code commandBuffer} <b>must</b> not have any queries <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a></li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} query <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a>, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with {@link VkCommandBufferInheritanceInfo}{@code ::occlusionQueryEnable} set to {@link #VK_TRUE TRUE}</li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} query <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a>, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with {@link VkCommandBufferInheritanceInfo}{@code ::queryFlags} having all bits set that are set for the query</li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} query <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a>, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with {@link VkCommandBufferInheritanceInfo}{@code ::pipelineStatistics} having all bits set that are set in the {@code VkQueryPool} the query uses</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> not begin any query types that are <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a> in {@code commandBuffer}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} valid {@code VkCommandBuffer} handles</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
	 * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
	 * <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and the elements of {@code pCommandBuffers} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary</td><td>Both</td><td>TRANSFER GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer   a handle to a primary command buffer that the secondary command buffers are executed in.
	 * @param pCommandBuffers an array of secondary command buffer handles, which are recorded to execute in the primary command buffer in the order they are listed in the array.
	 */
	public static void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, PointerBuffer pCommandBuffers) {
		nvkCmdExecuteCommands(commandBuffer, pCommandBuffers.remaining(), memAddress(pCommandBuffers));
	}

	/**
	 * Execute a secondary command buffer from a primary command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>A secondary command buffer <b>must</b> not be directly submitted to a queue. Instead, secondary command buffers are recorded to execute as part of a primary command buffer with the command:</p>
	 * 
	 * <pre><code>void vkCmdExecuteCommands(
    VkCommandBuffer                             commandBuffer,
    uint32_t                                    commandBufferCount,
    const VkCommandBuffer*                      pCommandBuffers);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Once {@link #vkCmdExecuteCommands CmdExecuteCommands} has been called, any prior executions of the secondary command buffers specified by {@code pCommandBuffers} in any other primary command buffer become invalidated, unless those secondary command buffers were recorded with {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> have been allocated with a {@code level} of {@link #VK_COMMAND_BUFFER_LEVEL_PRIMARY COMMAND_BUFFER_LEVEL_PRIMARY}</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> have been allocated with a {@code level} of {@link #VK_COMMAND_BUFFER_LEVEL_SECONDARY COMMAND_BUFFER_LEVEL_SECONDARY}</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> not be already pending execution in {@code commandBuffer}, or appear twice in {@code pCommandBuffers}, unless it was recorded with the {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} flag</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> not be already pending execution in any other {@code VkCommandBuffer}, unless it was recorded with the {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} flag</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> be in the executable state</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> have been allocated from a {@code VkCommandPool} that was created for the same queue family as the {@code VkCommandPool} from which {@code commandBuffer} was allocated</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, that render pass instance <b>must</b> have been begun with the {@code contents} parameter of {@link #vkCmdBeginRenderPass CmdBeginRenderPass} set to {@link #VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS}</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with the {@link #VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with {@link VkCommandBufferInheritanceInfo}{@code ::subpass} set to the index of the subpass which the given command buffer will be executed in</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with a render pass that is compatible with the current render pass - see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#renderpass-compatibility">the “Render Pass Compatibility” section</a></li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, and any given element of {@code pCommandBuffers} was recorded with {@link VkCommandBufferInheritanceInfo}{@code ::framebuffer} not equal to {@link #VK_NULL_HANDLE NULL_HANDLE}, that {@code VkFramebuffer} <b>must</b> match the {@code VkFramebuffer} used in the current render pass instance</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is not being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> not have been recorded with the {@link #VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}</li>
	 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-inheritedQueries">inherited queries</a> feature is not enabled, {@code commandBuffer} <b>must</b> not have any queries <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a></li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} query <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a>, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with {@link VkCommandBufferInheritanceInfo}{@code ::occlusionQueryEnable} set to {@link #VK_TRUE TRUE}</li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} query <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a>, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with {@link VkCommandBufferInheritanceInfo}{@code ::queryFlags} having all bits set that are set for the query</li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} query <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a>, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with {@link VkCommandBufferInheritanceInfo}{@code ::pipelineStatistics} having all bits set that are set in the {@code VkQueryPool} the query uses</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> not begin any query types that are <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-operation-active">active</a> in {@code commandBuffer}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} valid {@code VkCommandBuffer} handles</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
	 * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
	 * <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
	 * <li>Both of {@code commandBuffer}, and the elements of {@code pCommandBuffers} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary</td><td>Both</td><td>TRANSFER GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer a handle to a primary command buffer that the secondary command buffers are executed in.
	 */
	public static void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, VkCommandBuffer pCommandBuffer) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			PointerBuffer pCommandBuffers = stack.pointers(pCommandBuffer);
			nvkCmdExecuteCommands(commandBuffer, 1, memAddress(pCommandBuffers));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ VK_MAKE_VERSION ] ---

	/**
	 * Constructs an API version number.
	 * 
	 * <p>This macro <b>can</b> be used when constructing the {@link VkApplicationInfo}{@code ::pname:apiVersion} parameter passed to {@link #vkCreateInstance CreateInstance}.</p>
	 *
	 * @param major the major version number
	 * @param minor the minor version number
	 * @param patch the patch version number
	 */
	public static int VK_MAKE_VERSION(int major, int minor, int patch) {
		return (major << 22) | (minor << 12) | patch;
	}

	// --- [ VK_VERSION_MAJOR ] ---

	/**
	 * Extracts the API major version number from a packed version number.
	 *
	 * @param version the Vulkan API version
	 */
	public static int VK_VERSION_MAJOR(int version) {
		return version >> 22;
	}

	// --- [ VK_VERSION_MINOR ] ---

	/**
	 * Extracts the API minor version number from a packed version number.
	 *
	 * @param version the Vulkan API version
	 */
	public static int VK_VERSION_MINOR(int version) {
		return (version >> 12) & 0x3FF;
	}

	// --- [ VK_VERSION_PATCH ] ---

	/**
	 * Extracts the API patch version number from a packed version number.
	 *
	 * @param version the Vulkan API version
	 */
	public static int VK_VERSION_PATCH(int version) {
		return version & 0xFFF;
	}

	/** Array version of: {@link #vkEnumeratePhysicalDevices EnumeratePhysicalDevices} */
	public static int vkEnumeratePhysicalDevices(VkInstance instance, int[] pPhysicalDeviceCount, PointerBuffer pPhysicalDevices) {
		long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDevices;
		if ( CHECKS ) {
			checkBuffer(pPhysicalDeviceCount, 1);
			checkBufferSafe(pPhysicalDevices, pPhysicalDeviceCount[0]);
		}
		return callPPPI(__functionAddress, instance.address(), pPhysicalDeviceCount, memAddressSafe(pPhysicalDevices));
	}

	/** Array version of: {@link #vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} */
	public static void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, int[] pQueueFamilyPropertyCount, VkQueueFamilyProperties.Buffer pQueueFamilyProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties;
		if ( CHECKS ) {
			checkBuffer(pQueueFamilyPropertyCount, 1);
			checkBufferSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount[0]);
		}
		callPPPV(__functionAddress, physicalDevice.address(), pQueueFamilyPropertyCount, memAddressSafe(pQueueFamilyProperties));
	}

	/** Array version of: {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties} */
	public static int vkEnumerateInstanceExtensionProperties(ByteBuffer pLayerName, int[] pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceExtensionProperties;
		if ( CHECKS ) {
			checkNT1Safe(pLayerName);
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount[0]);
		}
		return callPPPI(__functionAddress, memAddressSafe(pLayerName), pPropertyCount, memAddressSafe(pProperties));
	}

	/** Array version of: {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties} */
	public static int vkEnumerateInstanceExtensionProperties(CharSequence pLayerName, int[] pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceExtensionProperties;
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount[0]);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pLayerNameEncoded = stack.UTF8(pLayerName);
			return callPPPI(__functionAddress, memAddressSafe(pLayerNameEncoded), pPropertyCount, memAddressSafe(pProperties));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #vkEnumerateDeviceExtensionProperties EnumerateDeviceExtensionProperties} */
	public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, ByteBuffer pLayerName, int[] pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceExtensionProperties;
		if ( CHECKS ) {
			checkNT1Safe(pLayerName);
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount[0]);
		}
		return callPPPPI(__functionAddress, physicalDevice.address(), memAddressSafe(pLayerName), pPropertyCount, memAddressSafe(pProperties));
	}

	/** Array version of: {@link #vkEnumerateDeviceExtensionProperties EnumerateDeviceExtensionProperties} */
	public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, CharSequence pLayerName, int[] pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceExtensionProperties;
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount[0]);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pLayerNameEncoded = stack.UTF8(pLayerName);
			return callPPPPI(__functionAddress, physicalDevice.address(), memAddressSafe(pLayerNameEncoded), pPropertyCount, memAddressSafe(pProperties));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties} */
	public static int vkEnumerateInstanceLayerProperties(int[] pPropertyCount, VkLayerProperties.Buffer pProperties) {
		long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceLayerProperties;
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount[0]);
		}
		return callPPI(__functionAddress, pPropertyCount, memAddressSafe(pProperties));
	}

	/** Array version of: {@link #vkEnumerateDeviceLayerProperties EnumerateDeviceLayerProperties} */
	public static int vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, int[] pPropertyCount, VkLayerProperties.Buffer pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceLayerProperties;
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount[0]);
		}
		return callPPPI(__functionAddress, physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties));
	}

	/** Array version of: {@link #vkAllocateMemory AllocateMemory} */
	public static int vkAllocateMemory(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, long[] pMemory) {
		long __functionAddress = device.getCapabilities().vkAllocateMemory;
		if ( CHECKS ) {
			checkBuffer(pMemory, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pAllocateInfo.address(), memAddressSafe(pAllocator), pMemory);
	}

	/** Array version of: {@link #vkGetDeviceMemoryCommitment GetDeviceMemoryCommitment} */
	public static void vkGetDeviceMemoryCommitment(VkDevice device, long memory, long[] pCommittedMemoryInBytes) {
		long __functionAddress = device.getCapabilities().vkGetDeviceMemoryCommitment;
		if ( CHECKS )
			checkBuffer(pCommittedMemoryInBytes, 1);
		callPJPV(__functionAddress, device.address(), memory, pCommittedMemoryInBytes);
	}

	/** Array version of: {@link #vkGetImageSparseMemoryRequirements GetImageSparseMemoryRequirements} */
	public static void vkGetImageSparseMemoryRequirements(VkDevice device, long image, int[] pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements.Buffer pSparseMemoryRequirements) {
		long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements;
		if ( CHECKS ) {
			checkBuffer(pSparseMemoryRequirementCount, 1);
			checkBufferSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
		}
		callPJPPV(__functionAddress, device.address(), image, pSparseMemoryRequirementCount, memAddressSafe(pSparseMemoryRequirements));
	}

	/** Array version of: {@link #vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties} */
	public static void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, int[] pPropertyCount, VkSparseImageFormatProperties.Buffer pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties;
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			checkBufferSafe(pProperties, pPropertyCount[0]);
		}
		callPPPV(__functionAddress, physicalDevice.address(), format, type, samples, usage, tiling, pPropertyCount, memAddressSafe(pProperties));
	}

	/** Array version of: {@link #vkCreateFence CreateFence} */
	public static int vkCreateFence(VkDevice device, VkFenceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pFence) {
		long __functionAddress = device.getCapabilities().vkCreateFence;
		if ( CHECKS ) {
			checkBuffer(pFence, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pFence);
	}

	/** Array version of: {@link #vkResetFences ResetFences} */
	public static int vkResetFences(VkDevice device, long[] pFences) {
		long __functionAddress = device.getCapabilities().vkResetFences;
		return callPPI(__functionAddress, device.address(), pFences.length, pFences);
	}

	/** Array version of: {@link #vkWaitForFences WaitForFences} */
	public static int vkWaitForFences(VkDevice device, long[] pFences, boolean waitAll, long timeout) {
		long __functionAddress = device.getCapabilities().vkWaitForFences;
		return callPPJI(__functionAddress, device.address(), pFences.length, pFences, waitAll ? 1 : 0, timeout);
	}

	/** Array version of: {@link #vkCreateSemaphore CreateSemaphore} */
	public static int vkCreateSemaphore(VkDevice device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pSemaphore) {
		long __functionAddress = device.getCapabilities().vkCreateSemaphore;
		if ( CHECKS ) {
			checkBuffer(pSemaphore, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSemaphore);
	}

	/** Array version of: {@link #vkCreateEvent CreateEvent} */
	public static int vkCreateEvent(VkDevice device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pEvent) {
		long __functionAddress = device.getCapabilities().vkCreateEvent;
		if ( CHECKS ) {
			checkBuffer(pEvent, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pEvent);
	}

	/** Array version of: {@link #vkCreateQueryPool CreateQueryPool} */
	public static int vkCreateQueryPool(VkDevice device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pQueryPool) {
		long __functionAddress = device.getCapabilities().vkCreateQueryPool;
		if ( CHECKS ) {
			checkBuffer(pQueryPool, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pQueryPool);
	}

	/** Array version of: {@link #vkGetQueryPoolResults GetQueryPoolResults} */
	public static int vkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, int[] pData, long stride, int flags) {
		long __functionAddress = device.getCapabilities().vkGetQueryPoolResults;
		return callPJPPJI(__functionAddress, device.address(), queryPool, firstQuery, queryCount, (long)(pData.length << 2), pData, stride, flags);
	}

	/** Array version of: {@link #vkGetQueryPoolResults GetQueryPoolResults} */
	public static int vkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, long[] pData, long stride, int flags) {
		long __functionAddress = device.getCapabilities().vkGetQueryPoolResults;
		return callPJPPJI(__functionAddress, device.address(), queryPool, firstQuery, queryCount, (long)(pData.length << 3), pData, stride, flags);
	}

	/** Array version of: {@link #vkCreateBuffer CreateBuffer} */
	public static int vkCreateBuffer(VkDevice device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pBuffer) {
		long __functionAddress = device.getCapabilities().vkCreateBuffer;
		if ( CHECKS ) {
			checkBuffer(pBuffer, 1);
			VkBufferCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pBuffer);
	}

	/** Array version of: {@link #vkCreateBufferView CreateBufferView} */
	public static int vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pView) {
		long __functionAddress = device.getCapabilities().vkCreateBufferView;
		if ( CHECKS ) {
			checkBuffer(pView, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pView);
	}

	/** Array version of: {@link #vkCreateImage CreateImage} */
	public static int vkCreateImage(VkDevice device, VkImageCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pImage) {
		long __functionAddress = device.getCapabilities().vkCreateImage;
		if ( CHECKS ) {
			checkBuffer(pImage, 1);
			VkImageCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pImage);
	}

	/** Array version of: {@link #vkCreateImageView CreateImageView} */
	public static int vkCreateImageView(VkDevice device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pView) {
		long __functionAddress = device.getCapabilities().vkCreateImageView;
		if ( CHECKS ) {
			checkBuffer(pView, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pView);
	}

	/** Array version of: {@link #vkCreateShaderModule CreateShaderModule} */
	public static int vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pShaderModule) {
		long __functionAddress = device.getCapabilities().vkCreateShaderModule;
		if ( CHECKS ) {
			checkBuffer(pShaderModule, 1);
			VkShaderModuleCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pShaderModule);
	}

	/** Array version of: {@link #vkCreatePipelineCache CreatePipelineCache} */
	public static int vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pPipelineCache) {
		long __functionAddress = device.getCapabilities().vkCreatePipelineCache;
		if ( CHECKS ) {
			checkBuffer(pPipelineCache, 1);
			VkPipelineCacheCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pPipelineCache);
	}

	/** Array version of: {@link #vkMergePipelineCaches MergePipelineCaches} */
	public static int vkMergePipelineCaches(VkDevice device, long dstCache, long[] pSrcCaches) {
		long __functionAddress = device.getCapabilities().vkMergePipelineCaches;
		return callPJPI(__functionAddress, device.address(), dstCache, pSrcCaches.length, pSrcCaches);
	}

	/** Array version of: {@link #vkCreateGraphicsPipelines CreateGraphicsPipelines} */
	public static int vkCreateGraphicsPipelines(VkDevice device, long pipelineCache, VkGraphicsPipelineCreateInfo.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, long[] pPipelines) {
		long __functionAddress = device.getCapabilities().vkCreateGraphicsPipelines;
		if ( CHECKS ) {
			checkBuffer(pPipelines, pCreateInfos.remaining());
			VkGraphicsPipelineCreateInfo.validate(pCreateInfos.address(), pCreateInfos.remaining());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPJPPPI(__functionAddress, device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pPipelines);
	}

	/** Array version of: {@link #vkCreateComputePipelines CreateComputePipelines} */
	public static int vkCreateComputePipelines(VkDevice device, long pipelineCache, VkComputePipelineCreateInfo.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, long[] pPipelines) {
		long __functionAddress = device.getCapabilities().vkCreateComputePipelines;
		if ( CHECKS ) {
			checkBuffer(pPipelines, pCreateInfos.remaining());
			VkComputePipelineCreateInfo.validate(pCreateInfos.address(), pCreateInfos.remaining());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPJPPPI(__functionAddress, device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pPipelines);
	}

	/** Array version of: {@link #vkCreatePipelineLayout CreatePipelineLayout} */
	public static int vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pPipelineLayout) {
		long __functionAddress = device.getCapabilities().vkCreatePipelineLayout;
		if ( CHECKS ) {
			checkBuffer(pPipelineLayout, 1);
			VkPipelineLayoutCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pPipelineLayout);
	}

	/** Array version of: {@link #vkCreateSampler CreateSampler} */
	public static int vkCreateSampler(VkDevice device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pSampler) {
		long __functionAddress = device.getCapabilities().vkCreateSampler;
		if ( CHECKS ) {
			checkBuffer(pSampler, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSampler);
	}

	/** Array version of: {@link #vkCreateDescriptorSetLayout CreateDescriptorSetLayout} */
	public static int vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pSetLayout) {
		long __functionAddress = device.getCapabilities().vkCreateDescriptorSetLayout;
		if ( CHECKS ) {
			checkBuffer(pSetLayout, 1);
			VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSetLayout);
	}

	/** Array version of: {@link #vkCreateDescriptorPool CreateDescriptorPool} */
	public static int vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pDescriptorPool) {
		long __functionAddress = device.getCapabilities().vkCreateDescriptorPool;
		if ( CHECKS ) {
			checkBuffer(pDescriptorPool, 1);
			VkDescriptorPoolCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pDescriptorPool);
	}

	/** Array version of: {@link #vkAllocateDescriptorSets AllocateDescriptorSets} */
	public static int vkAllocateDescriptorSets(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, long[] pDescriptorSets) {
		long __functionAddress = device.getCapabilities().vkAllocateDescriptorSets;
		if ( CHECKS ) {
			checkBuffer(pDescriptorSets, pAllocateInfo.descriptorSetCount());
			VkDescriptorSetAllocateInfo.validate(pAllocateInfo.address());
		}
		return callPPPI(__functionAddress, device.address(), pAllocateInfo.address(), pDescriptorSets);
	}

	/** Array version of: {@link #vkFreeDescriptorSets FreeDescriptorSets} */
	public static int vkFreeDescriptorSets(VkDevice device, long descriptorPool, long[] pDescriptorSets) {
		long __functionAddress = device.getCapabilities().vkFreeDescriptorSets;
		return callPJPI(__functionAddress, device.address(), descriptorPool, pDescriptorSets.length, pDescriptorSets);
	}

	/** Array version of: {@link #vkCreateFramebuffer CreateFramebuffer} */
	public static int vkCreateFramebuffer(VkDevice device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pFramebuffer) {
		long __functionAddress = device.getCapabilities().vkCreateFramebuffer;
		if ( CHECKS ) {
			checkBuffer(pFramebuffer, 1);
			VkFramebufferCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pFramebuffer);
	}

	/** Array version of: {@link #vkCreateRenderPass CreateRenderPass} */
	public static int vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pRenderPass) {
		long __functionAddress = device.getCapabilities().vkCreateRenderPass;
		if ( CHECKS ) {
			checkBuffer(pRenderPass, 1);
			VkRenderPassCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pRenderPass);
	}

	/** Array version of: {@link #vkCreateCommandPool CreateCommandPool} */
	public static int vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pCommandPool) {
		long __functionAddress = device.getCapabilities().vkCreateCommandPool;
		if ( CHECKS ) {
			checkBuffer(pCommandPool, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pCommandPool);
	}

	/** Array version of: {@link #vkCmdSetBlendConstants CmdSetBlendConstants} */
	public static void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, float[] blendConstants) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetBlendConstants;
		if ( CHECKS )
			checkBuffer(blendConstants, 4);
		callPPV(__functionAddress, commandBuffer.address(), blendConstants);
	}

	/** Array version of: {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets} */
	public static void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, long[] pDescriptorSets, int[] pDynamicOffsets) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets;
		callPJPPV(__functionAddress, commandBuffer.address(), pipelineBindPoint, layout, firstSet, pDescriptorSets.length, pDescriptorSets, lengthSafe(pDynamicOffsets), pDynamicOffsets);
	}

	/** Array version of: {@link #vkCmdBindVertexBuffers CmdBindVertexBuffers} */
	public static void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, int firstBinding, long[] pBuffers, long[] pOffsets) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers;
		if ( CHECKS )
			checkBuffer(pOffsets, pBuffers.length);
		callPPPV(__functionAddress, commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets);
	}

	/** Array version of: {@link #vkCmdUpdateBuffer CmdUpdateBuffer} */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, short[] pData) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
		callPJJJPV(__functionAddress, commandBuffer.address(), dstBuffer, dstOffset, (long)(pData.length << 1), pData);
	}

	/** Array version of: {@link #vkCmdUpdateBuffer CmdUpdateBuffer} */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, int[] pData) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
		callPJJJPV(__functionAddress, commandBuffer.address(), dstBuffer, dstOffset, (long)(pData.length << 2), pData);
	}

	/** Array version of: {@link #vkCmdUpdateBuffer CmdUpdateBuffer} */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long[] pData) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
		callPJJJPV(__functionAddress, commandBuffer.address(), dstBuffer, dstOffset, (long)(pData.length << 3), pData);
	}

	/** Array version of: {@link #vkCmdUpdateBuffer CmdUpdateBuffer} */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, float[] pData) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
		callPJJJPV(__functionAddress, commandBuffer.address(), dstBuffer, dstOffset, (long)(pData.length << 2), pData);
	}

	/** Array version of: {@link #vkCmdUpdateBuffer CmdUpdateBuffer} */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, double[] pData) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
		callPJJJPV(__functionAddress, commandBuffer.address(), dstBuffer, dstOffset, (long)(pData.length << 3), pData);
	}

	/** Array version of: {@link #vkCmdWaitEvents CmdWaitEvents} */
	public static void vkCmdWaitEvents(VkCommandBuffer commandBuffer, long[] pEvents, int srcStageMask, int dstStageMask, VkMemoryBarrier.Buffer pMemoryBarriers, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents;
		callPPPPPV(__functionAddress, commandBuffer.address(), pEvents.length, pEvents, srcStageMask, dstStageMask, remainingSafe(pMemoryBarriers), memAddressSafe(pMemoryBarriers), remainingSafe(pBufferMemoryBarriers), memAddressSafe(pBufferMemoryBarriers), remainingSafe(pImageMemoryBarriers), memAddressSafe(pImageMemoryBarriers));
	}

	/** Array version of: {@link #vkCmdPushConstants CmdPushConstants} */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, short[] pValues) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
		callPJPV(__functionAddress, commandBuffer.address(), layout, stageFlags, offset, pValues.length << 1, pValues);
	}

	/** Array version of: {@link #vkCmdPushConstants CmdPushConstants} */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, int[] pValues) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
		callPJPV(__functionAddress, commandBuffer.address(), layout, stageFlags, offset, pValues.length << 2, pValues);
	}

	/** Array version of: {@link #vkCmdPushConstants CmdPushConstants} */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, long[] pValues) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
		callPJPV(__functionAddress, commandBuffer.address(), layout, stageFlags, offset, pValues.length << 3, pValues);
	}

	/** Array version of: {@link #vkCmdPushConstants CmdPushConstants} */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, float[] pValues) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
		callPJPV(__functionAddress, commandBuffer.address(), layout, stageFlags, offset, pValues.length << 2, pValues);
	}

	/** Array version of: {@link #vkCmdPushConstants CmdPushConstants} */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, double[] pValues) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
		callPJPV(__functionAddress, commandBuffer.address(), layout, stageFlags, offset, pValues.length << 3, pValues);
	}

}