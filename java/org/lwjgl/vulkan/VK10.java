/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/** The core Vulkan 1.0 functionality. */
public class VK10 {

	/** The Vulkan major version number. */
	public static final int VK_VERSION_MAJOR = 1;

	/** The Vulkan minor version number. */
	public static final int VK_VERSION_MINOR = 0;

	/** The Vulkan patch version number. */
	public static final int VK_VERSION_PATCH = 5;

	/**
	 * The Vulkan version number is used in several places in the API. In each such use, the API major version number, minor version number, and patch version
	 * number are packed into a 32-bit integer as follows:
	 * 
	 * <ul>
	 * <li>The major version number is a 10-bit integer packed into bits 31-22.</li>
	 * <li>The minor version number is a 10-bit integer packed into bits 21-12.</li>
	 * <li>The patch version number is a 12-bit integer packed into bits 11-0.</li>
	 * </ul>
	 * 
	 * <p>Differences in any of the Vulkan version numbers indicates a change to the API in some way, with each part of the version number indicating a different
	 * scope of changes.</p>
	 * 
	 * <p>A difference in patch version numbers indicates that some usually small aspect of the specification or header has been modified, typically to fix a
	 * bug, and may have an impact on the behavior of existing functionality. Differences in this version number should not affect either full compatibility
	 * or backwards compatibility between two versions, or add additional interfaces to the API.</p>
	 * 
	 * <p>A difference in minor version numbers indicates that some amount of new functionality has been added. This will usually include new interfaces in the
	 * header, and may also include behavior changes and bug fixes. Functionality may be deprecated in a minor revision, but will not be removed. When a new
	 * minor version is introduced, the patch version is reset to 0, and each minor revision maintains its own set of patch versions. Differences in this
	 * version should not affect backwards compatibility, but will affect full compatibility.</p>
	 * 
	 * <p>A difference in major version numbers indicates a large set of changes to the API, potentially including new functionality and header interfaces,
	 * behavioral changes, removal of deprecated features, modification or outright replacement of any feature, and is thus very likely to break any and all
	 * compatibility. Differences in this version will typically require significant modification to an application in order for it to function.</p>
	 */
	public static final int VK_API_VERSION = (VK_VERSION_MAJOR << 22) | (VK_VERSION_MINOR << 12) | VK_VERSION_PATCH;

	/**
	 * The reserved handle {@code VK_NULL_HANDLE} can be passed in place of valid object handles when explicitly called out in the specification. Any command
	 * that creates an object successfully must not return {@code VK_NULL_HANDLE}. It is valid to pass {@code VK_NULL_HANDLE} to any {@code vkDestroy*} or
	 * {@code vkFree*} command, which will silently ignore these values.
	 */
	public static final long VK_NULL_HANDLE = 0x0L;

	/**  */
	public static final float VK_LOD_CLAMP_NONE = 1000.0f;

	/**  */
	public static final int
		VK_TRUE                          = 1,
		VK_FALSE                         = 0,
		VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = 256,
		VK_UUID_SIZE                     = 16,
		VK_MAX_MEMORY_TYPES              = 32,
		VK_MAX_MEMORY_HEAPS              = 16,
		VK_MAX_EXTENSION_NAME_SIZE       = 256,
		VK_MAX_DESCRIPTION_SIZE          = 256;

	/**  */
	public static final int
		VK_REMAINING_MIP_LEVELS   = (~0),
		VK_REMAINING_ARRAY_LAYERS = (~0),
		VK_ATTACHMENT_UNUSED      = (~0),
		VK_QUEUE_FAMILY_IGNORED   = (~0),
		VK_SUBPASS_EXTERNAL       = (~0);

	/**  */
	public static final long VK_WHOLE_SIZE = (~0L);

	/** VkPipelineCacheHeaderVersion */
	public static final int
		VK_PIPELINE_CACHE_HEADER_VERSION_ONE         = 1,
		VK_PIPELINE_CACHE_HEADER_VERSION_BEGIN_RANGE = VK_PIPELINE_CACHE_HEADER_VERSION_ONE,
		VK_PIPELINE_CACHE_HEADER_VERSION_END_RANGE   = VK_PIPELINE_CACHE_HEADER_VERSION_ONE,
		VK_PIPELINE_CACHE_HEADER_VERSION_RANGE_SIZE  = VK_PIPELINE_CACHE_HEADER_VERSION_ONE - VK_PIPELINE_CACHE_HEADER_VERSION_ONE + 1,
		VK_PIPELINE_CACHE_HEADER_VERSION_MAX_ENUM    = 0x7FFFFFFF;

	/** Command successfully completed. */
	public static final int VK_SUCCESS = 0;

	/** A fence or query has not yet completed. */
	public static final int VK_NOT_READY = 1;

	/** A wait operation has not completed in the specified time. */
	public static final int VK_TIMEOUT = 2;

	/** An event is signaled. */
	public static final int VK_EVENT_SET = 3;

	/** An event is unsignaled. */
	public static final int VK_EVENT_RESET = 4;

	/** A return array was too small for the result. */
	public static final int VK_INCOMPLETE = 5;

	/** A host memory allocation has failed. */
	public static final int VK_ERROR_OUT_OF_HOST_MEMORY = -1;

	/** A device memory allocation has failed. */
	public static final int VK_ERROR_OUT_OF_DEVICE_MEMORY = -2;

	/** Initialization of an object could not be completed for implementation-specific reasons. */
	public static final int VK_ERROR_INITIALIZATION_FAILED = -3;

	/** The logical or physical device has been lost. */
	public static final int VK_ERROR_DEVICE_LOST = -4;

	/** Mapping of a memory object has failed. */
	public static final int VK_ERROR_MEMORY_MAP_FAILED = -5;

	/** A requested layer is not present or could not be loaded. */
	public static final int VK_ERROR_LAYER_NOT_PRESENT = -6;

	/** A requested extension is not supported. */
	public static final int VK_ERROR_EXTENSION_NOT_PRESENT = -7;

	/** A requested feature is not supported. */
	public static final int VK_ERROR_FEATURE_NOT_PRESENT = -8;

	/** The requested version of Vulkan is not supported by the driver or is otherwise incompatible for implementation-specific reasons. */
	public static final int VK_ERROR_INCOMPATIBLE_DRIVER = -9;

	/** Too many objects of the type have already been created. */
	public static final int VK_ERROR_TOO_MANY_OBJECTS = -10;

	/** A requested format is not supported on this device. */
	public static final int VK_ERROR_FORMAT_NOT_SUPPORTED = -11;

	/** VkResult */
	public static final int
		VK_RESULT_BEGIN_RANGE = VK_ERROR_FORMAT_NOT_SUPPORTED,
		VK_RESULT_END_RANGE   = VK_INCOMPLETE,
		VK_RESULT_RANGE_SIZE  = VK_INCOMPLETE - VK_ERROR_FORMAT_NOT_SUPPORTED + 1,
		VK_RESULT_MAX_ENUM    = 0x7FFFFFFF;

	/** VkStructureType */
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
		VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO                 = 48,
		VK_STRUCTURE_TYPE_BEGIN_RANGE                               = VK_STRUCTURE_TYPE_APPLICATION_INFO,
		VK_STRUCTURE_TYPE_END_RANGE                                 = VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO,
		VK_STRUCTURE_TYPE_RANGE_SIZE                                = VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO - VK_STRUCTURE_TYPE_APPLICATION_INFO + 1,
		VK_STRUCTURE_TYPE_MAX_ENUM                                  = 0x7FFFFFFF;

	/** The allocation is scoped to the lifetime of the Vulkan command. */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = 0;

	/** The allocation is scoped to the lifetime of the Vulkan object that is being created or used. */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = 1;

	/** The allocation is scoped to the lifetime of a {@code VkPipelineCache} object. */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_CACHE = 2;

	/** The allocation is scoped to the lifetime of the Vulkan device. */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = 3;

	/** The allocation is scoped to the lifetime of the Vulkan instance. */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4;

	/** VkSystemAllocationScope */
	public static final int
		VK_SYSTEM_ALLOCATION_SCOPE_BEGIN_RANGE = VK_SYSTEM_ALLOCATION_SCOPE_COMMAND,
		VK_SYSTEM_ALLOCATION_SCOPE_END_RANGE   = VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE,
		VK_SYSTEM_ALLOCATION_SCOPE_RANGE_SIZE  = VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE - VK_SYSTEM_ALLOCATION_SCOPE_COMMAND + 1,
		VK_SYSTEM_ALLOCATION_SCOPE_MAX_ENUM    = 0x7FFFFFFF;

	/** The allocation is intended for execution by the host. */
	public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0;

	/** VkInternalAllocationType */
	public static final int
		VK_INTERNAL_ALLOCATION_TYPE_BEGIN_RANGE = VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE,
		VK_INTERNAL_ALLOCATION_TYPE_END_RANGE   = VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE,
		VK_INTERNAL_ALLOCATION_TYPE_RANGE_SIZE  = VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE - VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE + 1,
		VK_INTERNAL_ALLOCATION_TYPE_MAX_ENUM    = 0x7FFFFFFF;

	/** The format is not specified. */
	public static final int VK_FORMAT_UNDEFINED = 0;

	/** A two-component, 8-bit packed unsigned normalized format that has a 4-bit R component in bits 4..7, and a 4-bit G component in bits 0..3. */
	public static final int VK_FORMAT_R4G4_UNORM_PACK8 = 1;

	/** A four-component, 16-bit packed unsigned normalized format that has a 4-bit R component in bits 12..15, a 4-bit G component in bits 8..11, a 4-bit B component in bits 4..7, and a 4-bit A component in bits 0..3. */
	public static final int VK_FORMAT_R4G4B4A4_UNORM_PACK16 = 2;

	/** A four-component, 16-bit packed unsigned normalized format that has a 4-bit B component in bits 12..15, a 4-bit G component in bits 8..11, a 4-bit R component in bits 4..7, and a 4-bit A component in bits 0..3. */
	public static final int VK_FORMAT_B4G4R4A4_UNORM_PACK16 = 3;

	/** A three-component, 16-bit packed unsigned normalized format that has a 5-bit R component in bits 11..15, a 6-bit G component in bits 5..10, and a 5-bit B component in bits 0..4. */
	public static final int VK_FORMAT_R5G6B5_UNORM_PACK16 = 4;

	/** A three-component, 16-bit packed unsigned normalized format that has a 5-bit B component in bits 11..15, a 6-bit G component in bits 5..10, and a 5-bit R component in bits 0..4. */
	public static final int VK_FORMAT_B5G6R5_UNORM_PACK16 = 5;

	/** A four-component, 16-bit packed unsigned normalized format that has a 5-bit R component in bits 11..15, a 5-bit G component in bits 6..10, a 5-bit B component in bits 1..5, and a 1-bit A component in bit 0. */
	public static final int VK_FORMAT_R5G5B5A1_UNORM_PACK16 = 6;

	/** A four-component, 16-bit packed unsigned normalized format that has a 5-bit B component in bits 11..15, a 5-bit G component in bits 6..10, a 5-bit R component in bits 1..5, and a 1-bit A component in bit 0. */
	public static final int VK_FORMAT_B5G5R5A1_UNORM_PACK16 = 7;

	/** A four-component, 16-bit packed unsigned normalized format that has a 1-bit A component in bit 15, a 5-bit R component in bits 10..14, a 5-bit G component in bits 5..9, and a 5-bit B component in bits 0..4. */
	public static final int VK_FORMAT_A1R5G5B5_UNORM_PACK16 = 8;

	/** A one-component, 8-bit unsigned normalized format that has a single 8-bit R component. */
	public static final int VK_FORMAT_R8_UNORM = 9;

	/** A one-component, 8-bit signed normalized format that has a single 8-bit R component. */
	public static final int VK_FORMAT_R8_SNORM = 10;

	/** A one-component, 8-bit unsigned scaled integer format that has a single 8-bit R component. */
	public static final int VK_FORMAT_R8_USCALED = 11;

	/** A one-component, 8-bit signed scaled integer format that has a single 8-bit R component. */
	public static final int VK_FORMAT_R8_SSCALED = 12;

	/** A one-component, 8-bit unsigned integer format that has a single 8-bit R component. */
	public static final int VK_FORMAT_R8_UINT = 13;

	/** A one-component, 8-bit signed integer format that has a single 8-bit R component. */
	public static final int VK_FORMAT_R8_SINT = 14;

	/** A one-component, 8-bit unsigned normalized format that has a single 8-bit R component stored with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_R8_SRGB = 15;

	/** A two-component, 16-bit unsigned normalized format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1. */
	public static final int VK_FORMAT_R8G8_UNORM = 16;

	/** A two-component, 16-bit signed normalized format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1. */
	public static final int VK_FORMAT_R8G8_SNORM = 17;

	/** A two-component, 16-bit unsigned scaled integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1. */
	public static final int VK_FORMAT_R8G8_USCALED = 18;

	/** A two-component, 16-bit signed scaled integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1. */
	public static final int VK_FORMAT_R8G8_SSCALED = 19;

	/** A two-component, 16-bit unsigned integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1. */
	public static final int VK_FORMAT_R8G8_UINT = 20;

	/** A two-component, 16-bit signed integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1. */
	public static final int VK_FORMAT_R8G8_SINT = 21;

	/** A two-component, 16-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, and an 8-bit G component stored with sRGB nonlinear encoding in byte 1. */
	public static final int VK_FORMAT_R8G8_SRGB = 22;

	/** A three-component, 24-bit unsigned normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2. */
	public static final int VK_FORMAT_R8G8B8_UNORM = 23;

	/** A three-component, 24-bit signed normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2. */
	public static final int VK_FORMAT_R8G8B8_SNORM = 24;

	/** A three-component, 24-bit unsigned scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2. */
	public static final int VK_FORMAT_R8G8B8_USCALED = 25;

	/** A three-component, 24-bit signed scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2. */
	public static final int VK_FORMAT_R8G8B8_SSCALED = 26;

	/** A three-component, 24-bit unsigned integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2. */
	public static final int VK_FORMAT_R8G8B8_UINT = 27;

	/** A three-component, 24-bit signed integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2. */
	public static final int VK_FORMAT_R8G8B8_SINT = 28;

	/** A three-component, 24-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, and an 8-bit B component stored with sRGB nonlinear encoding in byte 2. */
	public static final int VK_FORMAT_R8G8B8_SRGB = 29;

	/** A three-component, 24-bit unsigned normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2. */
	public static final int VK_FORMAT_B8G8R8_UNORM = 30;

	/** A three-component, 24-bit signed normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2. */
	public static final int VK_FORMAT_B8G8R8_SNORM = 31;

	/** A three-component, 24-bit unsigned scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2. */
	public static final int VK_FORMAT_B8G8R8_USCALED = 32;

	/** A three-component, 24-bit signed scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2. */
	public static final int VK_FORMAT_B8G8R8_SSCALED = 33;

	/** A three-component, 24-bit unsigned integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2. */
	public static final int VK_FORMAT_B8G8R8_UINT = 34;

	/** A three-component, 24-bit signed integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2. */
	public static final int VK_FORMAT_B8G8R8_SINT = 35;

	/** A three-component, 24-bit unsigned normalized format that has an 8-bit B component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, and an 8-bit R component stored with sRGB nonlinear encoding in byte 2. */
	public static final int VK_FORMAT_B8G8R8_SRGB = 36;

	/** A four-component, 32-bit unsigned normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_R8G8B8A8_UNORM = 37;

	/** A four-component, 32-bit signed normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_R8G8B8A8_SNORM = 38;

	/** A four-component, 32-bit unsigned scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_R8G8B8A8_USCALED = 39;

	/** A four-component, 32-bit signed scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_R8G8B8A8_SSCALED = 40;

	/** A four-component, 32-bit unsigned integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_R8G8B8A8_UINT = 41;

	/** A four-component, 32-bit signed integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_R8G8B8A8_SINT = 42;

	/** A four-component, 32-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, an 8-bit B component stored with sRGB nonlinear encoding in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_R8G8B8A8_SRGB = 43;

	/** A four-component, 32-bit unsigned normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_B8G8R8A8_UNORM = 44;

	/** A four-component, 32-bit signed normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_B8G8R8A8_SNORM = 45;

	/** A four-component, 32-bit unsigned scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_B8G8R8A8_USCALED = 46;

	/** A four-component, 32-bit signed scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_B8G8R8A8_SSCALED = 47;

	/** A four-component, 32-bit unsigned integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_B8G8R8A8_UINT = 48;

	/** A four-component, 32-bit signed integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_B8G8R8A8_SINT = 49;

	/** A four-component, 32-bit unsigned normalized format that has an 8-bit B component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, an 8-bit R component stored with sRGB nonlinear encoding in byte 2, and an 8-bit A component in byte 3. */
	public static final int VK_FORMAT_B8G8R8A8_SRGB = 50;

	/** A four-component, 32-bit packed unsigned normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7. */
	public static final int VK_FORMAT_A8B8G8R8_UNORM_PACK32 = 51;

	/** A four-component, 32-bit packed signed normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7. */
	public static final int VK_FORMAT_A8B8G8R8_SNORM_PACK32 = 52;

	/** A four-component, 32-bit packed unsigned scaled integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7. */
	public static final int VK_FORMAT_A8B8G8R8_USCALED_PACK32 = 53;

	/** A four-component, 32-bit packed signed scaled integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7. */
	public static final int VK_FORMAT_A8B8G8R8_SSCALED_PACK32 = 54;

	/** A four-component, 32-bit packed unsigned integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7. */
	public static final int VK_FORMAT_A8B8G8R8_UINT_PACK32 = 55;

	/** A four-component, 32-bit packed signed integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7. */
	public static final int VK_FORMAT_A8B8G8R8_SINT_PACK32 = 56;

	/** A four-component, 32-bit packed unsigned normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component stored with sRGB nonlinear encoding in bits 16..23, an 8-bit G component stored with sRGB nonlinear encoding in bits 8..15, and an 8-bit R component stored with sRGB nonlinear encoding in bits 0..7. */
	public static final int VK_FORMAT_A8B8G8R8_SRGB_PACK32 = 57;

	/** A four-component, 32-bit packed unsigned normalized format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9. */
	public static final int VK_FORMAT_A2R10G10B10_UNORM_PACK32 = 58;

	/** A four-component, 32-bit packed signed normalized format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9. */
	public static final int VK_FORMAT_A2R10G10B10_SNORM_PACK32 = 59;

	/** A four-component, 32-bit packed unsigned scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9. */
	public static final int VK_FORMAT_A2R10G10B10_USCALED_PACK32 = 60;

	/** A four-component, 32-bit packed signed scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9. */
	public static final int VK_FORMAT_A2R10G10B10_SSCALED_PACK32 = 61;

	/** A four-component, 32-bit packed unsigned integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9. */
	public static final int VK_FORMAT_A2R10G10B10_UINT_PACK32 = 62;

	/** A four-component, 32-bit packed signed integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9. */
	public static final int VK_FORMAT_A2R10G10B10_SINT_PACK32 = 63;

	/** A four-component, 32-bit packed unsigned normalized format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9. */
	public static final int VK_FORMAT_A2B10G10R10_UNORM_PACK32 = 64;

	/** A four-component, 32-bit packed signed normalized format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9. */
	public static final int VK_FORMAT_A2B10G10R10_SNORM_PACK32 = 65;

	/** A four-component, 32-bit packed unsigned scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9. */
	public static final int VK_FORMAT_A2B10G10R10_USCALED_PACK32 = 66;

	/** A four-component, 32-bit packed signed scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9. */
	public static final int VK_FORMAT_A2B10G10R10_SSCALED_PACK32 = 67;

	/** A four-component, 32-bit packed unsigned integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9. */
	public static final int VK_FORMAT_A2B10G10R10_UINT_PACK32 = 68;

	/** A four-component, 32-bit packed signed integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9. */
	public static final int VK_FORMAT_A2B10G10R10_SINT_PACK32 = 69;

	/** A one-component, 16-bit unsigned normalized format that has a single 16-bit R component. */
	public static final int VK_FORMAT_R16_UNORM = 70;

	/** A one-component, 16-bit signed normalized format that has a single 16-bit R component. */
	public static final int VK_FORMAT_R16_SNORM = 71;

	/** A one-component, 16-bit unsigned scaled integer format that has a single 16-bit R component. */
	public static final int VK_FORMAT_R16_USCALED = 72;

	/** A one-component, 16-bit signed scaled integer format that has a single 16-bit R component. */
	public static final int VK_FORMAT_R16_SSCALED = 73;

	/** A one-component, 16-bit unsigned integer format that has a single 16-bit R component. */
	public static final int VK_FORMAT_R16_UINT = 74;

	/** A one-component, 16-bit signed integer format that has a single 16-bit R component. */
	public static final int VK_FORMAT_R16_SINT = 75;

	/** A one-component, 16-bit signed floating-point format that has a single 16-bit R component. */
	public static final int VK_FORMAT_R16_SFLOAT = 76;

	/** A two-component, 32-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3. */
	public static final int VK_FORMAT_R16G16_UNORM = 77;

	/** A two-component, 32-bit signed normalized format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3. */
	public static final int VK_FORMAT_R16G16_SNORM = 78;

	/** A two-component, 32-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3. */
	public static final int VK_FORMAT_R16G16_USCALED = 79;

	/** A two-component, 32-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3. */
	public static final int VK_FORMAT_R16G16_SSCALED = 80;

	/** A two-component, 32-bit unsigned integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3. */
	public static final int VK_FORMAT_R16G16_UINT = 81;

	/** A two-component, 32-bit signed integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3. */
	public static final int VK_FORMAT_R16G16_SINT = 82;

	/** A two-component, 32-bit signed floating-point format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3. */
	public static final int VK_FORMAT_R16G16_SFLOAT = 83;

	/** A three-component, 48-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5. */
	public static final int VK_FORMAT_R16G16B16_UNORM = 84;

	/** A three-component, 48-bit signed normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5. */
	public static final int VK_FORMAT_R16G16B16_SNORM = 85;

	/** A three-component, 48-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5. */
	public static final int VK_FORMAT_R16G16B16_USCALED = 86;

	/** A three-component, 48-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5. */
	public static final int VK_FORMAT_R16G16B16_SSCALED = 87;

	/** A three-component, 48-bit unsigned integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5. */
	public static final int VK_FORMAT_R16G16B16_UINT = 88;

	/** A three-component, 48-bit signed integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5. */
	public static final int VK_FORMAT_R16G16B16_SINT = 89;

	/** A three-component, 48-bit signed floating-point format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5. */
	public static final int VK_FORMAT_R16G16B16_SFLOAT = 90;

	/** A four-component, 64-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7. */
	public static final int VK_FORMAT_R16G16B16A16_UNORM = 91;

	/** A four-component, 64-bit signed normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7. */
	public static final int VK_FORMAT_R16G16B16A16_SNORM = 92;

	/** A four-component, 64-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7. */
	public static final int VK_FORMAT_R16G16B16A16_USCALED = 93;

	/** A four-component, 64-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7. */
	public static final int VK_FORMAT_R16G16B16A16_SSCALED = 94;

	/** A four-component, 64-bit unsigned integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7. */
	public static final int VK_FORMAT_R16G16B16A16_UINT = 95;

	/** A four-component, 64-bit signed integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7. */
	public static final int VK_FORMAT_R16G16B16A16_SINT = 96;

	/** A four-component, 64-bit signed floating-point format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7. */
	public static final int VK_FORMAT_R16G16B16A16_SFLOAT = 97;

	/** A one-component, 32-bit unsigned integer format that has a single 32-bit R component. */
	public static final int VK_FORMAT_R32_UINT = 98;

	/** A one-component, 32-bit signed integer format that has a single 32-bit R component. */
	public static final int VK_FORMAT_R32_SINT = 99;

	/** A one-component, 32-bit signed floating-point format that has a single 32-bit R component. */
	public static final int VK_FORMAT_R32_SFLOAT = 100;

	/** A two-component, 64-bit unsigned integer format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7. */
	public static final int VK_FORMAT_R32G32_UINT = 101;

	/** A two-component, 64-bit signed integer format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7. */
	public static final int VK_FORMAT_R32G32_SINT = 102;

	/** A two-component, 64-bit signed floating-point format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7. */
	public static final int VK_FORMAT_R32G32_SFLOAT = 103;

	/** A three-component, 96-bit unsigned integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11. */
	public static final int VK_FORMAT_R32G32B32_UINT = 104;

	/** A three-component, 96-bit signed integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11. */
	public static final int VK_FORMAT_R32G32B32_SINT = 105;

	/** A three-component, 96-bit signed floating-point format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11. */
	public static final int VK_FORMAT_R32G32B32_SFLOAT = 106;

	/** A four-component, 128-bit unsigned integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15. */
	public static final int VK_FORMAT_R32G32B32A32_UINT = 107;

	/** A four-component, 128-bit signed integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15. */
	public static final int VK_FORMAT_R32G32B32A32_SINT = 108;

	/** A four-component, 128-bit signed floating-point format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15. */
	public static final int VK_FORMAT_R32G32B32A32_SFLOAT = 109;

	/** A one-component, 64-bit unsigned integer format that has a single 64-bit R component. */
	public static final int VK_FORMAT_R64_UINT = 110;

	/** A one-component, 64-bit signed integer format that has a single 64-bit R component. */
	public static final int VK_FORMAT_R64_SINT = 111;

	/** A one-component, 64-bit signed floating-point format that has a single 64-bit R component. */
	public static final int VK_FORMAT_R64_SFLOAT = 112;

	/** A two-component, 128-bit unsigned integer format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15. */
	public static final int VK_FORMAT_R64G64_UINT = 113;

	/** A two-component, 128-bit signed integer format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15. */
	public static final int VK_FORMAT_R64G64_SINT = 114;

	/** A two-component, 128-bit signed floating-point format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15. */
	public static final int VK_FORMAT_R64G64_SFLOAT = 115;

	/** A three-component, 192-bit unsigned integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23. */
	public static final int VK_FORMAT_R64G64B64_UINT = 116;

	/** A three-component, 192-bit signed integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23. */
	public static final int VK_FORMAT_R64G64B64_SINT = 117;

	/** A three-component, 192-bit signed floating-point format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23. */
	public static final int VK_FORMAT_R64G64B64_SFLOAT = 118;

	/** A four-component, 256-bit unsigned integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31. */
	public static final int VK_FORMAT_R64G64B64A64_UINT = 119;

	/** A four-component, 256-bit signed integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31. */
	public static final int VK_FORMAT_R64G64B64A64_SINT = 120;

	/** A four-component, 256-bit signed floating-point format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31. */
	public static final int VK_FORMAT_R64G64B64A64_SFLOAT = 121;

	/** A three-component, 32-bit packed unsigned floating-point format that has a 10-bit B component in bits 22..31, an 11-bit G component in bits 11..21, an 11-bit R component in bits 0..10. */
	public static final int VK_FORMAT_B10G11R11_UFLOAT_PACK32 = 122;

	/** A three-component, 32-bit packed unsigned floating-point format that has a 5-bit shared exponent in bits 27..31, a 9-bit B component mantissa in bits 18..26, a 9-bit G component mantissa in bits 9..17, and a 9-bit R component mantissa in bits 0..8. */
	public static final int VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 = 123;

	/** A one-component, 16-bit unsigned normalized format that has a single 16-bit depth component. */
	public static final int VK_FORMAT_D16_UNORM = 124;

	/** A two-component, 32-bit format that has 24 unsigned normalized bits in the depth component and, optionally:, 8 bits that are unused. */
	public static final int VK_FORMAT_X8_D24_UNORM_PACK32 = 125;

	/** A one-component, 32-bit signed floating-point format that has 32-bits in the depth component. */
	public static final int VK_FORMAT_D32_SFLOAT = 126;

	/** A one-component, 8-bit unsigned integer format that has 8-bits in the stencil component. */
	public static final int VK_FORMAT_S8_UINT = 127;

	/** A two-component, 24-bit format that has 16 unsigned normalized bits in the depth component and 8 unsigned integer bits in the stencil component. */
	public static final int VK_FORMAT_D16_UNORM_S8_UINT = 128;

	/** A two-component, 32-bit packed format that has 8 unsigned integer bits in the stencil component, and 24 unsigned normalized bits in the depth component. */
	public static final int VK_FORMAT_D24_UNORM_S8_UINT = 129;

	/** A two-component format that has 32 signed float bits in the depth component and 8 unsigned integer bits in the stencil component. There are optionally: 24-bits that are unused. */
	public static final int VK_FORMAT_D32_SFLOAT_S8_UINT = 130;

	/** A three-component, block compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data. This format has no alpha and is considered opaque. */
	public static final int VK_FORMAT_BC1_RGB_UNORM_BLOCK = 131;

	/** A three-component, block compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data with sRGB nonlinear encoding. This format has no alpha and is considered opaque. */
	public static final int VK_FORMAT_BC1_RGB_SRGB_BLOCK = 132;

	/** A four-component, block compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data, and provides 1 bit of alpha. */
	public static final int VK_FORMAT_BC1_RGBA_UNORM_BLOCK = 133;

	/** A four-component, block compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data with sRGB nonlinear encoding, and provides 1 bit of alpha. */
	public static final int VK_FORMAT_BC1_RGBA_SRGB_BLOCK = 134;

	/** A four-component, block compressed format where each 4x4 block consists of 64-bits of unsigned normalized alpha image data followed by 64-bits of encoded unsigned normalized RGB image data. */
	public static final int VK_FORMAT_BC2_UNORM_BLOCK = 135;

	/** A four-component, block compressed format where each 4x4 block consists of 64-bits of unsigned normalized alpha image data followed by 64-bits of encoded unsigned normalized RGB image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_BC2_SRGB_BLOCK = 136;

	/** A four-component, block compressed format where each 4x4 block consists of 64-bits of encoded alpha image data followed by 64-bits of encoded RGB image data. Both blocks are decoded as unsigned normalized values. */
	public static final int VK_FORMAT_BC3_UNORM_BLOCK = 137;

	/** A four-component, block compressed format where each 4x4 block consists of 64-bits of encoded alpha image data followed by 64-bits of encoded RGB image data with sRGB nonlinear encoding. Both blocks are decoded as unsigned normalized values. */
	public static final int VK_FORMAT_BC3_SRGB_BLOCK = 138;

	/** A one-component, block compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized red image data. */
	public static final int VK_FORMAT_BC4_UNORM_BLOCK = 139;

	/** A one-component, block compressed format where each 4x4 block consists of 64-bits of encoded signed normalized red image data. */
	public static final int VK_FORMAT_BC4_SNORM_BLOCK = 140;

	/** A two-component, block compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized red image data followed by 64-bits of encoded unsigned normalized green image data. */
	public static final int VK_FORMAT_BC5_UNORM_BLOCK = 141;

	/** A two-component, block compressed format where each 4x4 block consists of 64-bits of encoded signed normalized red image data followed by 64-bits of encoded signed normalized green image data. */
	public static final int VK_FORMAT_BC5_SNORM_BLOCK = 142;

	/** A three-component, block compressed format where each 4x4 block consists of 128-bits of encoded unsigned floating-point RGB image data. */
	public static final int VK_FORMAT_BC6H_UFLOAT_BLOCK = 143;

	/** A three-component, block compressed format where each 4x4 block consists of 128-bits of encoded signed floating-point RGB image data. */
	public static final int VK_FORMAT_BC6H_SFLOAT_BLOCK = 144;

	/** A four-component, block compressed format where each 4x4 block consists of 128-bits of encoded unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_BC7_UNORM_BLOCK = 145;

	/** A four-component, block compressed format where each 4x4 block consists of 128-bits of encoded unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_BC7_SRGB_BLOCK = 146;

	/** A three-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data. */
	public static final int VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK = 147;

	/** A three-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK = 148;

	/** A four-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data, and provides 1 bit of alpha. */
	public static final int VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK = 149;

	/** A four-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data with sRGB nonlinear encoding, and provides 1 bit of alpha. */
	public static final int VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK = 150;

	/** A four-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data, and 64-bits of encoded unsigned normalized alpha image data. */
	public static final int VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK = 151;

	/** A four-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data with sRGB nonlinear encoding, and 64-bits of encoded unsigned normalized alpha image data. */
	public static final int VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK = 152;

	/** A one-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized red image data. */
	public static final int VK_FORMAT_EAC_R11_UNORM_BLOCK = 153;

	/** A one-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded signed normalized red image data. */
	public static final int VK_FORMAT_EAC_R11_SNORM_BLOCK = 154;

	/** A two-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized red image data followed by 64-bits of encoded unsigned normalized green image data. */
	public static final int VK_FORMAT_EAC_R11G11_UNORM_BLOCK = 155;

	/** A two-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded signed normalized red image data followed by 64-bits of encoded signed normalized green image data. */
	public static final int VK_FORMAT_EAC_R11G11_SNORM_BLOCK = 156;

	/** A four-component, ASTC compressed format where each 4x4 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_4x4_UNORM_BLOCK = 157;

	/** A four-component, ASTC compressed format where each 4x4 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_4x4_SRGB_BLOCK = 158;

	/** A four-component, ASTC compressed format where each 5x4 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_5x4_UNORM_BLOCK = 159;

	/** A four-component, ASTC compressed format where each 5x4 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_5x4_SRGB_BLOCK = 160;

	/** A four-component, ASTC compressed format where each 5x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_5x5_UNORM_BLOCK = 161;

	/** A four-component, ASTC compressed format where each 5x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_5x5_SRGB_BLOCK = 162;

	/** A four-component, ASTC compressed format where each 6x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_6x5_UNORM_BLOCK = 163;

	/** A four-component, ASTC compressed format where each 6x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_6x5_SRGB_BLOCK = 164;

	/** A four-component, ASTC compressed format where each 6x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_6x6_UNORM_BLOCK = 165;

	/** A four-component, ASTC compressed format where each 6x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_6x6_SRGB_BLOCK = 166;

	/** A four-component, ASTC compressed format where each 8x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_8x5_UNORM_BLOCK = 167;

	/** A four-component, ASTC compressed format where each 8x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_8x5_SRGB_BLOCK = 168;

	/** A four-component, ASTC compressed format where each 8x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_8x6_UNORM_BLOCK = 169;

	/** A four-component, ASTC compressed format where each 8x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_8x6_SRGB_BLOCK = 170;

	/** A four-component, ASTC compressed format where each 8x8 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_8x8_UNORM_BLOCK = 171;

	/** A four-component, ASTC compressed format where each 8x8 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_8x8_SRGB_BLOCK = 172;

	/** A four-component, ASTC compressed format where each 10x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_10x5_UNORM_BLOCK = 173;

	/** A four-component, ASTC compressed format where each 10x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_10x5_SRGB_BLOCK = 174;

	/** A four-component, ASTC compressed format where each 10x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_10x6_UNORM_BLOCK = 175;

	/** A four-component, ASTC compressed format where each 10x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_10x6_SRGB_BLOCK = 176;

	/** A four-component, ASTC compressed format where each 10x8 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_10x8_UNORM_BLOCK = 177;

	/** A four-component, ASTC compressed format where each 10x8 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_10x8_SRGB_BLOCK = 178;

	/** A four-component, ASTC compressed format where each 10x10 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_10x10_UNORM_BLOCK = 179;

	/** A four-component, ASTC compressed format where each 10x10 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_10x10_SRGB_BLOCK = 180;

	/** A four-component, ASTC compressed format where each 12x10 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_12x10_UNORM_BLOCK = 181;

	/** A four-component, ASTC compressed format where each 12x10 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_12x10_SRGB_BLOCK = 182;

	/** A four-component, ASTC compressed format where each 12x12 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_12x12_UNORM_BLOCK = 183;

	/** A four-component, ASTC compressed format where each 12x12 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding. */
	public static final int VK_FORMAT_ASTC_12x12_SRGB_BLOCK = 184;

	/** VkFormat */
	public static final int
		VK_FORMAT_BEGIN_RANGE = VK_FORMAT_UNDEFINED,
		VK_FORMAT_END_RANGE   = VK_FORMAT_ASTC_12x12_SRGB_BLOCK,
		VK_FORMAT_RANGE_SIZE  = VK_FORMAT_ASTC_12x12_SRGB_BLOCK - VK_FORMAT_UNDEFINED + 1,
		VK_FORMAT_MAX_ENUM    = 0x7FFFFFFF;

	/** One-dimensional image */
	public static final int VK_IMAGE_TYPE_1D = 0;

	/** Two-dimensional image */
	public static final int VK_IMAGE_TYPE_2D = 1;

	/** Three-dimensional image */
	public static final int VK_IMAGE_TYPE_3D = 2;

	/** VkImageType */
	public static final int
		VK_IMAGE_TYPE_BEGIN_RANGE = VK_IMAGE_TYPE_1D,
		VK_IMAGE_TYPE_END_RANGE   = VK_IMAGE_TYPE_3D,
		VK_IMAGE_TYPE_RANGE_SIZE  = VK_IMAGE_TYPE_3D - VK_IMAGE_TYPE_1D + 1,
		VK_IMAGE_TYPE_MAX_ENUM    = 0x7FFFFFFF;

	/** Specifies optimal tiling (texels are laid out in an implementation-dependent arrangement, for more optimal memory access). */
	public static final int VK_IMAGE_TILING_OPTIMAL = 0;

	/** Specifies linear tiling (texels are laid out in memory in row-major order, possibly with some padding on each row). */
	public static final int VK_IMAGE_TILING_LINEAR = 1;

	/** VkImageTiling */
	public static final int
		VK_IMAGE_TILING_BEGIN_RANGE = VK_IMAGE_TILING_OPTIMAL,
		VK_IMAGE_TILING_END_RANGE   = VK_IMAGE_TILING_LINEAR,
		VK_IMAGE_TILING_RANGE_SIZE  = VK_IMAGE_TILING_LINEAR - VK_IMAGE_TILING_OPTIMAL + 1,
		VK_IMAGE_TILING_MAX_ENUM    = 0x7FFFFFFF;

	/** The device does not match any other available types. */
	public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0;

	/** The device is typically one embedded in or tightly coupled with the host. */
	public static final int VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1;

	/** The device is typically a separate processor connected to the host via an interlink. */
	public static final int VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 2;

	/** The device is typically a virtual node in a virtualization environment. */
	public static final int VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 3;

	/** The device is typically running on the same processors as the host. */
	public static final int VK_PHYSICAL_DEVICE_TYPE_CPU = 4;

	/** VkPhysicalDeviceType */
	public static final int
		VK_PHYSICAL_DEVICE_TYPE_BEGIN_RANGE = VK_PHYSICAL_DEVICE_TYPE_OTHER,
		VK_PHYSICAL_DEVICE_TYPE_END_RANGE   = VK_PHYSICAL_DEVICE_TYPE_CPU,
		VK_PHYSICAL_DEVICE_TYPE_RANGE_SIZE  = VK_PHYSICAL_DEVICE_TYPE_CPU - VK_PHYSICAL_DEVICE_TYPE_OTHER + 1,
		VK_PHYSICAL_DEVICE_TYPE_MAX_ENUM    = 0x7FFFFFFF;

	/** Occlusion query. */
	public static final int VK_QUERY_TYPE_OCCLUSION = 0;

	/** Pipeline statistics query */
	public static final int VK_QUERY_TYPE_PIPELINE_STATISTICS = 1;

	/** Timestamp query. */
	public static final int VK_QUERY_TYPE_TIMESTAMP = 2;

	/** VkQueryType */
	public static final int
		VK_QUERY_TYPE_BEGIN_RANGE = VK_QUERY_TYPE_OCCLUSION,
		VK_QUERY_TYPE_END_RANGE   = VK_QUERY_TYPE_TIMESTAMP,
		VK_QUERY_TYPE_RANGE_SIZE  = VK_QUERY_TYPE_TIMESTAMP - VK_QUERY_TYPE_OCCLUSION + 1,
		VK_QUERY_TYPE_MAX_ENUM    = 0x7FFFFFFF;

	/** Specifies that access to any range or subresource of the object will be exclusive to a single queue family at a time. */
	public static final int VK_SHARING_MODE_EXCLUSIVE = 0;

	/** Specifies that concurrent access to any range or subresource of the object from multiple queue families is supported. */
	public static final int VK_SHARING_MODE_CONCURRENT = 1;

	/** VkSharingMode */
	public static final int
		VK_SHARING_MODE_BEGIN_RANGE = VK_SHARING_MODE_EXCLUSIVE,
		VK_SHARING_MODE_END_RANGE   = VK_SHARING_MODE_CONCURRENT,
		VK_SHARING_MODE_RANGE_SIZE  = VK_SHARING_MODE_CONCURRENT - VK_SHARING_MODE_EXCLUSIVE + 1,
		VK_SHARING_MODE_MAX_ENUM    = 0x7FFFFFFF;

	/**
	 * Supports no device access. This layout must only be used as an {@code initialLayout} or as the {@code oldLayout} in an image transition. When
	 * transitioning out of this layout, the contents of the memory are not guaranteed to be preserved.
	 */
	public static final int VK_IMAGE_LAYOUT_UNDEFINED = 0;

	/** Supports all types of device access. */
	public static final int VK_IMAGE_LAYOUT_GENERAL = 1;

	/**
	 * <b>must</b> only be used as a color or resolve attachment in a {@code VkFramebuffer}. This layout is valid only for subresources of images created with
	 * the {@link #VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} usage bit enabled.
	 */
	public static final int VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL = 2;

	/**
	 * <b>must</b> only be used as a depth/stencil attachment in a {@code VkFramebuffer}. This layout is valid only for subresources of images created with the
	 * {@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} usage bit enabled.
	 */
	public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = 3;

	/**
	 * <b>must</b> only be used as a read-only depth/stencil attachment in a {@code VkFramebuffer} and/or as a read-only image in a shader (which can be read as
	 * a sampled image, combined image/sampler and/or input attachment). This layout is valid only for subresources of images created with both the
	 * {@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} usage bit enabled.
	 */
	public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL = 4;

	/**
	 * <b>must</b> only be used as a read-only image in a shader (which can be read as a sampled image, combined image/sampler and/or input attachment). This
	 * layout is valid only for subresources of images created with the {@link #VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} or {@link #VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} usage bit enabled.
	 */
	public static final int VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL = 5;

	/**
	 * <b>must</b> only be used as a source image of a transfer command (see the definition of {@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}). This layout is valid only for
	 * subresources of images created with the {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage bit enabled.
	 */
	public static final int VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL = 6;

	/**
	 * <b>must</b> only be used as a destination image of a transfer command. This layout is valid only for subresources of images created with the
	 * {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage bit enabled.
	 */
	public static final int VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL = 7;

	/**
	 * Supports no device access. This layout must only be used as an {@code initialLayout} or as the {@code oldLayout} in an image transition. When
	 * transitioning out of this layout, the contents of the memory are preserved. This layout is intended to be used as the initial layout for an image
	 * whose contents are written by the host, and hence the data can be written to memory immediately, without first executing a layout transition.
	 * Currently, {@link #VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED} is only useful with {@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} images because there is not a standard layout defined for
	 * {@link #VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL} images.
	 */
	public static final int VK_IMAGE_LAYOUT_PREINITIALIZED = 8;

	/** VkImageLayout */
	public static final int
		VK_IMAGE_LAYOUT_BEGIN_RANGE = VK_IMAGE_LAYOUT_UNDEFINED,
		VK_IMAGE_LAYOUT_END_RANGE   = VK_IMAGE_LAYOUT_PREINITIALIZED,
		VK_IMAGE_LAYOUT_RANGE_SIZE  = VK_IMAGE_LAYOUT_PREINITIALIZED - VK_IMAGE_LAYOUT_UNDEFINED + 1,
		VK_IMAGE_LAYOUT_MAX_ENUM    = 0x7FFFFFFF;

	/** One-dimensional image view. */
	public static final int VK_IMAGE_VIEW_TYPE_1D = 0;

	/** Two-dimensional image view. */
	public static final int VK_IMAGE_VIEW_TYPE_2D = 1;

	/** Three-dimensional image view. */
	public static final int VK_IMAGE_VIEW_TYPE_3D = 2;

	/** Cube map image view. */
	public static final int VK_IMAGE_VIEW_TYPE_CUBE = 3;

	/** One-dimensional array image view. */
	public static final int VK_IMAGE_VIEW_TYPE_1D_ARRAY = 4;

	/** Two-dimensional array image view. */
	public static final int VK_IMAGE_VIEW_TYPE_2D_ARRAY = 5;

	/** Cube map array image view. */
	public static final int VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 6;

	/** VkImageViewType */
	public static final int
		VK_IMAGE_VIEW_TYPE_BEGIN_RANGE = VK_IMAGE_VIEW_TYPE_1D,
		VK_IMAGE_VIEW_TYPE_END_RANGE   = VK_IMAGE_VIEW_TYPE_CUBE_ARRAY,
		VK_IMAGE_VIEW_TYPE_RANGE_SIZE  = VK_IMAGE_VIEW_TYPE_CUBE_ARRAY - VK_IMAGE_VIEW_TYPE_1D + 1,
		VK_IMAGE_VIEW_TYPE_MAX_ENUM    = 0x7FFFFFFF;

	/** The component is set to the identity swizzle. */
	public static final int VK_COMPONENT_SWIZZLE_IDENTITY = 0;

	/** The component is set to zero. */
	public static final int VK_COMPONENT_SWIZZLE_ZERO = 1;

	/**
	 * The component is set to either 1 or 1.0 depending on whether the type of the image view format is integer or floating-point respectively, as
	 * determined by the <b>Format Definition</b> section for each {@code VkFormat}.
	 */
	public static final int VK_COMPONENT_SWIZZLE_ONE = 2;

	/** The component is set to the value of the R component of the image. */
	public static final int VK_COMPONENT_SWIZZLE_R = 3;

	/** The component is set to the value of the G component of the image. */
	public static final int VK_COMPONENT_SWIZZLE_G = 4;

	/** The component is set to the value of the B component of the image. */
	public static final int VK_COMPONENT_SWIZZLE_B = 5;

	/** The component is set to the value of the A component of the image. */
	public static final int VK_COMPONENT_SWIZZLE_A = 6;

	/** VkComponentSwizzle */
	public static final int
		VK_COMPONENT_SWIZZLE_BEGIN_RANGE = VK_COMPONENT_SWIZZLE_IDENTITY,
		VK_COMPONENT_SWIZZLE_END_RANGE   = VK_COMPONENT_SWIZZLE_A,
		VK_COMPONENT_SWIZZLE_RANGE_SIZE  = VK_COMPONENT_SWIZZLE_A - VK_COMPONENT_SWIZZLE_IDENTITY + 1,
		VK_COMPONENT_SWIZZLE_MAX_ENUM    = 0x7FFFFFFF;

	/** Indicates that vertex attribute addressing is a function of the vertex index. */
	public static final int VK_VERTEX_INPUT_RATE_VERTEX = 0;

	/** Indicates that vertex attribute addressing is a function of the instance index. */
	public static final int VK_VERTEX_INPUT_RATE_INSTANCE = 1;

	/** VkVertexInputRate */
	public static final int
		VK_VERTEX_INPUT_RATE_BEGIN_RANGE = VK_VERTEX_INPUT_RATE_VERTEX,
		VK_VERTEX_INPUT_RATE_END_RANGE   = VK_VERTEX_INPUT_RATE_INSTANCE,
		VK_VERTEX_INPUT_RATE_RANGE_SIZE  = VK_VERTEX_INPUT_RATE_INSTANCE - VK_VERTEX_INPUT_RATE_VERTEX + 1,
		VK_VERTEX_INPUT_RATE_MAX_ENUM    = 0x7FFFFFFF;

	/** A series of individual points. Each vertex defines a separate point. */
	public static final int VK_PRIMITIVE_TOPOLOGY_POINT_LIST = 0;

	/**
	 * Individual line segments, each defined by a pair of vertices. The first two vertices define the first segment, with subsequent pairs of vertices
	 * each defining one more segment. If the number of vertices is odd, then the last vertex is ignored.
	 */
	public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST = 1;

	/**
	 * A series of one or more connected line segments. In this case, the first vertex specifies the first segment’s start point while the second vertex
	 * specifies the first segment’s endpoint and the second segment’s start point. In general, the i<sup>th</sup> vertex (for i &gt; 0) specifies the
	 * beginning of the i<sup>th</sup> segment and the end of the {@code i−1}<sup>st</sup>. The last vertex specifies the end of the last segment. If only
	 * one vertex is specified, then no primitive is generated.
	 */
	public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP = 2;

	/**
	 * Separate triangles. In this case, vertices {@code 3i}, {@code 3i + 1}, and {@code 3i + 2} (in that order) determine a triangle for each
	 * {@code i = 0,1,…,n − 1}, where there are {@code 3n + k} vertices drawn. {@code k} is either 0, 1, or 2; if {@code k} is not zero, the final
	 * {@code k} vertices are ignored.
	 */
	public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = 3;

	/**
	 * A triangle strip is a series of triangles connected along shared edges. In this case, the first three vertices define the first triangle, and their
	 * order is significant. Each subsequent vertex defines a new triangle using that point along with the last two vertices from the previous triangle.
	 * If fewer than three vertices are specified, no primitive is produced. The order of vertices in successive triangles changes, so that all triangle
	 * faces have the same orientation.
	 */
	public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = 4;

	/**
	 * A triangle fan. It is similar to a triangle strip, but changes the vertex replaced from the previous triangle, so that all triangles in the fan
	 * share a common vertex.
	 */
	public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN = 5;

	/**
	 * Lines with adjacency are independent line segments where each endpoint has a corresponding adjacent vertex that is accessible in a geometry shader.
	 * If a geometry shader is not active, the adjacent vertices are ignored.
	 * 
	 * <p>A line segment is drawn from the {@code 4i + 1}<sup>st</sup> vertex to the {@code 4i + 2}<sup>nd</sup> vertex for each {@code i = 0,1,…,n − 1},
	 * where there are {@code 4n + k} vertices. {@code k} is either 0, 1, 2, or 3; if {@code k} is not zero, the final {@code k} vertices are ignored. For
	 * line segment {@code i}, the {@code 4i}<sup>th</sup> and {@code 4i + 3}<sup>rd</sup> vertices are considered adjacent to the
	 * {@code 4i + 1}<sup>st</sup> and {@code 4i + 2}<sup>nd</sup> vertices, respectively.</p>
	 */
	public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY = 6;

	/**
	 * Line strips with adjacency are similar to line strips, except that each line segment has a pair of adjacent vertices that are accessible in a
	 * geometry shader. If a geometry shader is not active, the adjacent vertices are ignored.
	 * 
	 * <p>A line segment is drawn from the {@code i + 1}<sup>st</sup> vertex to the {@code i + 2}<sup>nd</sup> vertex for each {@code i = 0,1,…,n − 1}, where
	 * there are {@code n + 3} vertices. If there are fewer than four vertices, all vertices are ignored. For line segment {@code i}, the
	 * {@code i}<sup>th</sup> and {@code i + 3}<sup>rd</sup> vertex are considered adjacent to the {@code i + 1}<sup>st</sup> and
	 * {@code i + 2}<sup>nd</sup> vertices, respectively.</p>
	 */
	public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY = 7;

	/**
	 * Triangles with adjacency are similar to separate triangles except that each triangle edge has an adjacent vertex that is accessible in a geometry
	 * shader. If a geometry shader is not active, the adjacent vertices are ignored.
	 * 
	 * <p>The {@code 6i}<sup>th</sup>, {@code 6i + 2}<sup>nd</sup>, and {@code 6i + 4}<sup>th</sup> vertices (in that order) determine a triangle for each
	 * {@code i = 0,1,…,n − 1}, where there are {@code 6n + k} vertices. {@code k} is either 0, 1, 2, 3, 4, or 5; if {@code k} is non-zero, the final
	 * {@code k} vertices are ignored. For triangle {@code i}, the {@code 6i + 1}<sup>st</sup>, {@code 6i + 3}<sup>rd</sup>, and
	 * {@code 6i + 5}<sup>th</sup> vertices are considered adjacent to edges from the {@code 6i}<sup>th</sup> to the {@code 6i + 2}<sup>nd</sup>, from the
	 * {@code 6i + 2}<sup>nd</sup> to the {@code 6i + 4}<sup>th</sup>, and from the {@code 6i + 4}<sup>th</sup> to the {@code 6i}<sup>th</sup> vertices,
	 * respectively.</p>
	 */
	public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY = 8;

	/**
	 * Triangle strips with adjacency are similar to triangle strips except that each triangle edge has an adjacent vertex that is accessible in a
	 * geometry shader. If a geometry shader is not active, the adjacent vertices are ignored.
	 * 
	 * <p>In triangle strips with adjacency, {@code n} triangles are drawn where there are {@code 2(n + 2) + k} vertices. {@code k} is either 0 or 1; if
	 * {@code k} is 1, the final vertex is ignored. If there are fewer than 6 vertices, the entire primitive is ignored. The table below describes the
	 * vertices and order used to draw each triangle, and which vertices are considered adjacent to each edge of the triangle:</p>
	 * 
	 * <table class=lwjgl>
	 * <tr><th></th><th colspan=3>Primitive Vertices</th><th colspan=3>Adjacent Vertices</th></tr>
	 * <tr><td>Primitive</td><td>1<sup>st</sup></td><td>2<sup>nd</sup></td><td>3<sup>rd</sup></td><td>1/2</td><td>2/3</td><td>3/1</td></tr>
	 * <tr><td>only ( {@code i = 0} , {@code n = 1} )</td><td>0</td><td>2</td><td>4</td><td>1</td><td>5</td><td>3</td></tr>
	 * <tr><td>first ( {@code i = 0} )</td><td>0</td><td>2</td><td>4</td><td>1</td><td>6</td><td>3</td></tr>
	 * <tr><td>middle ( {@code i} odd)</td><td>2i+2</td><td>2i</td><td>2i+4</td><td>2i−2</td><td>2i+3</td><td>2i+6</td></tr>
	 * <tr><td>middle ( {@code i} even)</td><td>2i</td><td>2i+2</td><td>2i+4</td><td>2i−2</td><td>2i+6</td><td>2i+3</td></tr>
	 * <tr><td>last ( {@code i = n − 1} , {@code i} odd)</td><td>2i+2</td><td>2i</td><td>2i+4</td><td>2i−2</td><td>2i+3</td><td>2i+5</td></tr>
	 * <tr><td>last ( {@code i = n − 1} , {@code i} even)</td><td>2i</td><td>2i+2</td><td>2i+4</td><td>2i−2</td><td>2i+5</td><td>2i+3</td></tr>
	 * </table>
	 */
	public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = 9;

	/**
	 * Separate patches. A patch is an ordered collection of vertices used for primitive tessellation. The vertices comprising a patch have no implied
	 * geometric ordering, and are used by tessellation shaders and the fixed-function tessellator to generate new point, line, or triangle primitives.
	 * 
	 * <p>Each patch in the series has a fixed number of vertices, specified by the {@code patchControlPoints} member of the
	 * {@link VkPipelineTessellationStateCreateInfo} structure passed to {@link #vkCreateGraphicsPipelines CreateGraphicsPipelines}. Once assembled and vertex shaded, these patches are
	 * provided as input to the tessellation control shader stage.</p>
	 * 
	 * <p>If the number of vertices in a patch is given by {@code v}, the {@code vi}<sup>th</sup> through {@code vi + v − 1}<sup>st</sup> vertices (in that
	 * order) determine a patch for each {@code i = 0,1,…n − 1}, where there are {@code vn + k} vertices. {@code k} is in the range {@code [0,v − 1]} ; if
	 * {@code k} is not zero, the final {@code k} vertices are ignored.</p>
	 */
	public static final int VK_PRIMITIVE_TOPOLOGY_PATCH_LIST = 10;

	/** VkPrimitiveTopology */
	public static final int
		VK_PRIMITIVE_TOPOLOGY_BEGIN_RANGE = VK_PRIMITIVE_TOPOLOGY_POINT_LIST,
		VK_PRIMITIVE_TOPOLOGY_END_RANGE   = VK_PRIMITIVE_TOPOLOGY_PATCH_LIST,
		VK_PRIMITIVE_TOPOLOGY_RANGE_SIZE  = VK_PRIMITIVE_TOPOLOGY_PATCH_LIST - VK_PRIMITIVE_TOPOLOGY_POINT_LIST + 1,
		VK_PRIMITIVE_TOPOLOGY_MAX_ENUM    = 0x7FFFFFFF;

	/** Causes polygons to render using the polygon rasterization rules. */
	public static final int VK_POLYGON_MODE_FILL = 0;

	/** Causes polygon edges to be drawn as line segments. */
	public static final int VK_POLYGON_MODE_LINE = 1;

	/** The vertices of polygons are treated, for rasterization purposes, as if they had been drawn as points. */
	public static final int VK_POLYGON_MODE_POINT = 2;

	/** VkPolygonMode */
	public static final int
		VK_POLYGON_MODE_BEGIN_RANGE = VK_POLYGON_MODE_FILL,
		VK_POLYGON_MODE_END_RANGE   = VK_POLYGON_MODE_POINT,
		VK_POLYGON_MODE_RANGE_SIZE  = VK_POLYGON_MODE_POINT - VK_POLYGON_MODE_FILL + 1,
		VK_POLYGON_MODE_MAX_ENUM    = 0x7FFFFFFF;

	/** A triangle with positive area is considered front-facing. */
	public static final int VK_FRONT_FACE_COUNTER_CLOCKWISE = 0;

	/** A triangle with negative area is considered front-facing. */
	public static final int VK_FRONT_FACE_CLOCKWISE = 1;

	/** VkFrontFace */
	public static final int
		VK_FRONT_FACE_BEGIN_RANGE = VK_FRONT_FACE_COUNTER_CLOCKWISE,
		VK_FRONT_FACE_END_RANGE   = VK_FRONT_FACE_CLOCKWISE,
		VK_FRONT_FACE_RANGE_SIZE  = VK_FRONT_FACE_CLOCKWISE - VK_FRONT_FACE_COUNTER_CLOCKWISE + 1,
		VK_FRONT_FACE_MAX_ENUM    = 0x7FFFFFFF;

	/** The test never passes. */
	public static final int VK_COMPARE_OP_NEVER = 0;

	/** The test passes when <b>R</b> &lt; <b>S</b>. */
	public static final int VK_COMPARE_OP_LESS = 1;

	/** The test passes when R = S} */
	public static final int VK_COMPARE_OP_EQUAL = 2;

	/** The test passes when <b>R</b> &le; <b>S</b>. */
	public static final int VK_COMPARE_OP_LESS_OR_EQUAL = 3;

	/** The test passes when <b>R</b> &gt; <b>S</b>. */
	public static final int VK_COMPARE_OP_GREATER = 4;

	/** The test passes when <b>R</b> &ne; <b>S</b>. */
	public static final int VK_COMPARE_OP_NOT_EQUAL = 5;

	/** The test passes when <b>R</b> &ge; <b>S</b>. */
	public static final int VK_COMPARE_OP_GREATER_OR_EQUAL = 6;

	/** The test always passes. */
	public static final int VK_COMPARE_OP_ALWAYS = 7;

	/** VkCompareOp */
	public static final int
		VK_COMPARE_OP_BEGIN_RANGE = VK_COMPARE_OP_NEVER,
		VK_COMPARE_OP_END_RANGE   = VK_COMPARE_OP_ALWAYS,
		VK_COMPARE_OP_RANGE_SIZE  = VK_COMPARE_OP_ALWAYS - VK_COMPARE_OP_NEVER + 1,
		VK_COMPARE_OP_MAX_ENUM    = 0x7FFFFFFF;

	/** Keeps the current value. */
	public static final int VK_STENCIL_OP_KEEP = 0;

	/** Sets the value to 0. */
	public static final int VK_STENCIL_OP_ZERO = 1;

	/** Sets the value to {@code reference}. */
	public static final int VK_STENCIL_OP_REPLACE = 2;

	/** Increments the current value and clamps to the maximum representable unsigned value. */
	public static final int VK_STENCIL_OP_INCREMENT_AND_CLAMP = 3;

	/** Decrements the current value and clamps to 0. */
	public static final int VK_STENCIL_OP_DECREMENT_AND_CLAMP = 4;

	/** Bitwise-inverts the current value. */
	public static final int VK_STENCIL_OP_INVERT = 5;

	/** Increments the current value and wraps to 0 when the maximum value would have been exceeded. */
	public static final int VK_STENCIL_OP_INCREMENT_AND_WRAP = 6;

	/** Decrements the current value and wraps to the maximum possible value when the value would go below 0. */
	public static final int VK_STENCIL_OP_DECREMENT_AND_WRAP = 7;

	/** VkStencilOp */
	public static final int
		VK_STENCIL_OP_BEGIN_RANGE = VK_STENCIL_OP_KEEP,
		VK_STENCIL_OP_END_RANGE   = VK_STENCIL_OP_DECREMENT_AND_WRAP,
		VK_STENCIL_OP_RANGE_SIZE  = VK_STENCIL_OP_DECREMENT_AND_WRAP - VK_STENCIL_OP_KEEP + 1,
		VK_STENCIL_OP_MAX_ENUM    = 0x7FFFFFFF;

	/** {@code 0} */
	public static final int VK_LOGIC_OP_CLEAR = 0;

	/** {@code s∧d} */
	public static final int VK_LOGIC_OP_AND = 1;

	/** {@code s∧¬d} */
	public static final int VK_LOGIC_OP_AND_REVERSE = 2;

	/** {@code s} */
	public static final int VK_LOGIC_OP_COPY = 3;

	/** {@code ¬s∧d} */
	public static final int VK_LOGIC_OP_AND_INVERTED = 4;

	/** {@code d} */
	public static final int VK_LOGIC_OP_NO_OP = 5;

	/** {@code s⊕d} */
	public static final int VK_LOGIC_OP_XOR = 6;

	/** {@code s∨d} */
	public static final int VK_LOGIC_OP_OR = 7;

	/** {@code ¬(s∨d)} */
	public static final int VK_LOGIC_OP_NOR = 8;

	/** {@code ¬(s⊕d)} */
	public static final int VK_LOGIC_OP_EQUIVALENT = 9;

	/** {@code ¬d} */
	public static final int VK_LOGIC_OP_INVERT = 10;

	/** {@code s∨¬d} */
	public static final int VK_LOGIC_OP_OR_REVERSE = 11;

	/** {@code ¬s} */
	public static final int VK_LOGIC_OP_COPY_INVERTED = 12;

	/** {@code ¬s∨d} */
	public static final int VK_LOGIC_OP_OR_INVERTED = 13;

	/** {@code ¬(s∧d)} */
	public static final int VK_LOGIC_OP_NAND = 14;

	/** {@code all 1s} */
	public static final int VK_LOGIC_OP_SET = 15;

	/** VkLogicOp */
	public static final int
		VK_LOGIC_OP_BEGIN_RANGE = VK_LOGIC_OP_CLEAR,
		VK_LOGIC_OP_END_RANGE   = VK_LOGIC_OP_SET,
		VK_LOGIC_OP_RANGE_SIZE  = VK_LOGIC_OP_SET - VK_LOGIC_OP_CLEAR + 1,
		VK_LOGIC_OP_MAX_ENUM    = 0x7FFFFFFF;

	/** <code>(0, 0, 0, 0)</code> */
	public static final int VK_BLEND_FACTOR_ZERO = 0;

	/** <code>(1, 1, 1, 1)</code> */
	public static final int VK_BLEND_FACTOR_ONE = 1;

	/** <code>(R<sub>s0</sub>, G<sub>s0</sub>, B<sub>s0</sub>, A<sub>s0</sub>)</code> */
	public static final int VK_BLEND_FACTOR_SRC_COLOR = 2;

	/** <code>(1 − R<sub>s0</sub>, 1 − G<sub>s0</sub>, 1 − B<sub>s0</sub>, 1 − A<sub>s0</sub>)</code> */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR = 3;

	/** <code>(R<sub>d</sub>, G<sub>d</sub>, B<sub>d</sub>, A<sub>d</sub>)</code> */
	public static final int VK_BLEND_FACTOR_DST_COLOR = 4;

	/** <code>(1 − R<sub>d</sub>, 1 − G<sub>d</sub>, 1 − B<sub>d</sub>, 1 − A<sub>d</sub>)</code> */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR = 5;

	/** <code>(A<sub>s0</sub>, A<sub>s0</sub>, A<sub>s0</sub>, A<sub>s0</sub>)</code> */
	public static final int VK_BLEND_FACTOR_SRC_ALPHA = 6;

	/** <code>(1 − A<sub>s0</sub>, 1 − A<sub>s0</sub>, 1 − A<sub>s0</sub>, 1 − A<sub>s0</sub>)</code> */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = 7;

	/** <code>(A<sub>d</sub>, A<sub>d</sub>, A<sub>d</sub>, A<sub>d</sub>)</code> */
	public static final int VK_BLEND_FACTOR_DST_ALPHA = 8;

	/** <code>(1 − A<sub>d</sub>, 1 − A<sub>d</sub>, 1 − A<sub>d</sub>, 1 − A<sub>d</sub>)</code> */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA = 9;

	/** <code>(R<sub>c</sub>, G<sub>c</sub>, B<sub>c</sub>, A<sub>c</sub>)</code> */
	public static final int VK_BLEND_FACTOR_CONSTANT_COLOR = 10;

	/** <code>(1 − R<sub>c</sub>, 1 − G<sub>c</sub>, 1 − B<sub>c</sub>, 1 − A<sub>c</sub>)</code> */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = 11;

	/** <code>(A<sub>c</sub>, A<sub>c</sub>, A<sub>c</sub>, A<sub>c</sub>)</code> */
	public static final int VK_BLEND_FACTOR_CONSTANT_ALPHA = 12;

	/** <code>(1 − A<sub>c</sub>, 1 − A<sub>c</sub>, 1 − A<sub>c</sub>, 1 − A<sub>c</sub>)</code> */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = 13;

	/** <code>(f, f, f, 1) ; f = min(A<sub>s0</sub>, 1 − A<sub>d</sub>)</code> */
	public static final int VK_BLEND_FACTOR_SRC_ALPHA_SATURATE = 14;

	/** <code>(R<sub>s1</sub>, G<sub>s1</sub>, B<sub>s1</sub>, A<sub>s1</sub>)</code> */
	public static final int VK_BLEND_FACTOR_SRC1_COLOR = 15;

	/** <code>(1 − R<sub>s1</sub>, 1 − G<sub>s1</sub>, 1 − B<sub>s1</sub>, 1 − A<sub>s1</sub>)</code> */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR = 16;

	/** <code>(A<sub>s1</sub>, A<sub>s1</sub>, A<sub>s1</sub>, A<sub>s1</sub>)</code> */
	public static final int VK_BLEND_FACTOR_SRC1_ALPHA = 17;

	/** <code>(1 − A<sub>s1</sub>, 1 − A<sub>s1</sub>, 1 − A<sub>s1</sub>, 1 − A<sub>s1</sub>)</code> */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = 18;

	/** VkBlendFactor */
	public static final int
		VK_BLEND_FACTOR_BEGIN_RANGE = VK_BLEND_FACTOR_ZERO,
		VK_BLEND_FACTOR_END_RANGE   = VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA,
		VK_BLEND_FACTOR_RANGE_SIZE  = VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA - VK_BLEND_FACTOR_ZERO + 1,
		VK_BLEND_FACTOR_MAX_ENUM    = 0x7FFFFFFF;

	/**
	 * <pre><code>R = R<sub>s0</sub> × S<sub>r</sub> + R<sub>d</sub> × D<sub>r</sub>
G = G<sub>s0</sub> × S<sub>g</sub> + G<sub>d</sub> × D<sub>g</sub>
B = B<sub>s0</sub> × S<sub>b</sub> + B<sub>d</sub> × D<sub>b</sub>
A = A<sub>s0</sub> × S<sub>a</sub> + A<sub>d</sub> × D<sub>a</sub></code></pre>
	 */
	public static final int VK_BLEND_OP_ADD = 0;

	/**
	 * <pre><code>R = R<sub>s0</sub> × S<sub>r</sub> − R<sub>d</sub> × D<sub>r</sub>
G = G<sub>s0</sub> × S<sub>g</sub> − G<sub>d</sub> × D<sub>g</sub>
B = B<sub>s0</sub> × S<sub>b</sub> − B<sub>d</sub> × D<sub>b</sub>
A = A<sub>s0</sub> × S<sub>a</sub> − A<sub>d</sub> × D<sub>a</sub></code></pre>
	 */
	public static final int VK_BLEND_OP_SUBTRACT = 1;

	/**
	 * <pre><code>R = R<sub>d</sub> × D<sub>r</sub> − R<sub>s0</sub> × S<sub>r</sub>
G = G<sub>d</sub> × D<sub>g</sub> − G<sub>s0</sub> × S<sub>g</sub>
B = B<sub>d</sub> × D<sub>b</sub> − B<sub>s0</sub> × S<sub>b</sub>
A = A<sub>d</sub> × D<sub>a</sub> − A<sub>s0</sub> × S<sub>a</sub></code></pre>
	 */
	public static final int VK_BLEND_OP_REVERSE_SUBTRACT = 2;

	/**
	 * <pre><code>R = min(R<sub>s0</sub>, R<sub>d</sub>)
G = min(G<sub>s0</sub>, G<sub>d</sub>)
B = min(B<sub>s0</sub>, B<sub>d</sub>)
A = min(A<sub>s0</sub>, A<sub>d</sub>)</code></pre>
	 */
	public static final int VK_BLEND_OP_MIN = 3;

	/**
	 * <pre><code>R = max(R<sub>s0</sub>, R<sub>d</sub>)
G = max(G<sub>s0</sub>, G<sub>d</sub>)
B = max(B<sub>s0</sub>, B<sub>d</sub>)
A = max(A<sub>s0</sub>, A<sub>d</sub>)</code></pre>
	 */
	public static final int VK_BLEND_OP_MAX = 4;

	/** VkBlendOp */
	public static final int
		VK_BLEND_OP_BEGIN_RANGE = VK_BLEND_OP_ADD,
		VK_BLEND_OP_END_RANGE   = VK_BLEND_OP_MAX,
		VK_BLEND_OP_RANGE_SIZE  = VK_BLEND_OP_MAX - VK_BLEND_OP_ADD + 1,
		VK_BLEND_OP_MAX_ENUM    = 0x7FFFFFFF;

	/**
	 * Indicates that the {@code pViewports} state in {@link VkPipelineViewportStateCreateInfo} will be ignored and must be set dynamically with
	 * {@link #vkCmdSetViewport CmdSetViewport} before any draw commands. The number of viewports used by a pipeline is still specified by the {@code viewportCount} member of
	 * {@code VkPipelineViewportStateCreateInfo}.
	 */
	public static final int VK_DYNAMIC_STATE_VIEWPORT = 0;

	/**
	 * Indicates that the {@code pScissors} state in {@link VkPipelineViewportStateCreateInfo} will be ignored and must be set dynamically with {@link #vkCmdSetScissor CmdSetScissor}
	 * before any draw commands. The number of scissor rectangles used by a pipeline is still specified by the {@code scissorCount} member of
	 * {@code VkPipelineViewportStateCreateInfo}.
	 */
	public static final int VK_DYNAMIC_STATE_SCISSOR = 1;

	/**
	 * Indicates that the {@code lineWidth} state in {@link VkPipelineRasterizationStateCreateInfo} will be ignored and must be set dynamically with
	 * {@link #vkCmdSetLineWidth CmdSetLineWidth} before any draw commands that generate line primitives for the rasterizer.
	 */
	public static final int VK_DYNAMIC_STATE_LINE_WIDTH = 2;

	/**
	 * Indicates that the {@code depthBiasConstantFactor}, {@code depthBiasClamp} and {@code depthBiasSlopeFactor} states in
	 * {@link VkPipelineRasterizationStateCreateInfo} will be ignored and must be set dynamically with {@link #vkCmdSetDepthBias CmdSetDepthBias} before any draws are performed with
	 * {@code depthBiasEnable} in {@code VkPipelineRasterizationStateCreateInfo} set to {@link #VK_TRUE TRUE}.
	 */
	public static final int VK_DYNAMIC_STATE_DEPTH_BIAS = 3;

	/**
	 * Indicates that the {@code blendConstants} state in {@link VkPipelineColorBlendStateCreateInfo} will be ignored and must be set dynamically with
	 * {@link #vkCmdSetBlendConstants CmdSetBlendConstants} before any draws are performed with a pipeline state with {@code VkPipelineColorBlendAttachmentState} member
	 * {@code blendEnable} set to {@link #VK_TRUE TRUE} and any of the blend functions using a constant blend color.
	 */
	public static final int VK_DYNAMIC_STATE_BLEND_CONSTANTS = 4;

	/**
	 * Indicates that the {@code minDepthBounds} and {@code maxDepthBounds} states of {@link VkPipelineDepthStencilStateCreateInfo} will be ignored and must be
	 * set dynamically with {@link #vkCmdSetDepthBounds CmdSetDepthBounds} before any draws are performed with a pipeline state with {@code VkPipelineDepthStencilStateCreateInfo}
	 * member {@code depthBoundsTestEnable} set to {@link #VK_TRUE TRUE}.
	 */
	public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS = 5;

	/**
	 * Indicates that the {@code compareMask} state in {@link VkPipelineDepthStencilStateCreateInfo} for both front and back will be ignored and must be set
	 * dynamically with {@link #vkCmdSetStencilCompareMask CmdSetStencilCompareMask} before any draws are performed with a pipeline state with
	 * {@code VkPipelineDepthStencilStateCreateInfo} member {@code stencilTestEnable} set to {@link #VK_TRUE TRUE}.
	 */
	public static final int VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = 6;

	/**
	 * Indicates that the {@code writeMask} state in {@link VkPipelineDepthStencilStateCreateInfo} for both front and back will be ignored and must be set
	 * dynamically with {@link #vkCmdSetStencilWriteMask CmdSetStencilWriteMask} before any draws are performed with a pipeline state with {@code VkPipelineDepthStencilStateCreateInfo}
	 * member {@code stencilTestEnable} set to {@link #VK_TRUE TRUE}.
	 */
	public static final int VK_DYNAMIC_STATE_STENCIL_WRITE_MASK = 7;

	/**
	 * Indicates that the reference state in {@link VkPipelineDepthStencilStateCreateInfo} for both front and back will be ignored and must be set dynamically
	 * with {@link #vkCmdSetStencilReference CmdSetStencilReference} before any draws are performed with a pipeline state with {@code VkPipelineDepthStencilStateCreateInfo} member
	 * {@code stencilTestEnable} set to {@link #VK_TRUE TRUE}.
	 */
	public static final int VK_DYNAMIC_STATE_STENCIL_REFERENCE = 8;

	/** VkDynamicState */
	public static final int
		VK_DYNAMIC_STATE_BEGIN_RANGE = VK_DYNAMIC_STATE_VIEWPORT,
		VK_DYNAMIC_STATE_END_RANGE   = VK_DYNAMIC_STATE_STENCIL_REFERENCE,
		VK_DYNAMIC_STATE_RANGE_SIZE  = VK_DYNAMIC_STATE_STENCIL_REFERENCE - VK_DYNAMIC_STATE_VIEWPORT + 1,
		VK_DYNAMIC_STATE_MAX_ENUM    = 0x7FFFFFFF;

	/**
	 * Nearest filtering.
	 * 
	 * <p>Computes the integer texel coordinates that the unnormalized coordinates lie within:</p>
	 * 
	 * <pre><code>i = floor(u)
j = floor(v)
k = floor(w)</code></pre>
	 */
	public static final int VK_FILTER_NEAREST = 0;

	/**
	 * Linear filtering.
	 * 
	 * <p>Computes a set of neighboring coordinates which bound the unnormalized coordinates. The integer texel coordinates are combinations of
	 * <code>i<sub>0</sub></code> or <code>i<sub>1</sub></code>, <code>j<sub>0</sub></code> or <code>j<sub>1</sub></code>, <code>k<sub>0</sub></code> or
	 * <code>k<sub>1</sub></code>, as well as weights {@code α}, {@code β}, and {@code γ}.</p>
	 * 
	 * <pre><code>i<sub>0</sub> = floor(u - 0.5)      i<sub>1</sub> = i<sub>0</sub> + 1
j<sub>0</sub> = floor(v - 0.5)      j<sub>1</sub> = j<sub>0</sub> + 1
k<sub>0</sub> = floor(w - 0.5)      k<sub>1</sub> = k<sub>0</sub> + 1

α = frac(u - 0.5)
β = frac(v - 0.5)
γ = frac(w - 0.5)</code></pre>
	 */
	public static final int VK_FILTER_LINEAR = 1;

	/** VkFilter */
	public static final int
		VK_FILTER_BEGIN_RANGE = VK_FILTER_NEAREST,
		VK_FILTER_END_RANGE   = VK_FILTER_LINEAR,
		VK_FILTER_RANGE_SIZE  = VK_FILTER_LINEAR - VK_FILTER_NEAREST + 1,
		VK_FILTER_MAX_ENUM    = 0x7FFFFFFF;

	/**
	 * Texels are read from the image level {@code d}, where:
	 * 
	 * <table>
	 * <tr><td><code>d = level<sub>base</sub></code></td><td><code>when λ &le; 0.5</code></td></tr>
	 * <tr><td><code>d = nearest(λ)</code></td><td><code>when λ &gt; 0.5 && level<sub>base</sub> + λ &le; q + 0.5</code></td></tr>
	 * <tr><td><code>d = q</code></td><td><code>when λ &gt; 0.5 && level<sub>base</sub> + λ &gt; q + 0.5</code></td></tr>
	 * </table>
	 * 
	 * <p>and:</p>
	 * 
	 * <table>
	 * <tr><td><code>nearest(λ) = ceil(level<sub>base</sub> + λ + 0.5) - 1,</code></td><td>preferred</td></tr>
	 * <tr><td><code>nearest(λ) = floor(level<sub>base</sub> + λ + 0.5),</code></td><td>alternative</td></tr>
	 * </table>
	 * 
	 * <p>and where {@code q} is the {@code levelCount} from the {@code subresourceRange} of the image view.</p>
	 */
	public static final int VK_SAMPLER_MIPMAP_MODE_NEAREST = 0;

	/**
	 * Texels are read from image levels <code>d<sub>hi</sub></code> and <code>d<sub>lo</sub></code>, where:
	 * 
	 * <table>
	 * <tr><td><code>d<sub>hi</sub> = q</code></td><td><code>when level<sub>base</sub> + λ &ge; q</code></td></tr>
	 * <tr><td><code>d<sub>hi</sub> = floor(level<sub>base</sub> + λ)</code></td><td>otherwise</td></tr>
	 * </table>
	 * 
	 * <p>and:</p>
	 * 
	 * <table>
	 * <tr><td><code>d<sub>lo</sub> = q</code></td><td><code>when level<sub>base</sub> + λ &ge; q</code></td></tr>
	 * <tr><td><code>d<sub>lo</sub> = d<sub>hi</sub> + 1</code></td><td>otherwise</td></tr>
	 * </table>
	 * 
	 * <p><code>δ = frac(λ)</code> is the fractional value used for linear filtering between levels:</p>
	 */
	public static final int VK_SAMPLER_MIPMAP_MODE_LINEAR = 1;

	/** VkSamplerMipmapMode */
	public static final int
		VK_SAMPLER_MIPMAP_MODE_BEGIN_RANGE = VK_SAMPLER_MIPMAP_MODE_NEAREST,
		VK_SAMPLER_MIPMAP_MODE_END_RANGE   = VK_SAMPLER_MIPMAP_MODE_LINEAR,
		VK_SAMPLER_MIPMAP_MODE_RANGE_SIZE  = VK_SAMPLER_MIPMAP_MODE_LINEAR - VK_SAMPLER_MIPMAP_MODE_NEAREST + 1,
		VK_SAMPLER_MIPMAP_MODE_MAX_ENUM    = 0x7FFFFFFF;

	/** Indicates that the repeat wrap mode will be used. */
	public static final int VK_SAMPLER_ADDRESS_MODE_REPEAT = 0;

	/** Indicates that the mirrored repeat wrap mode will be used. */
	public static final int VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1;

	/** Indicates that the clamp to edge wrap mode will be used. */
	public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = 2;

	/** Indicates that the clamp to border wrap mode will be used. */
	public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3;

	/** VkSamplerAddressMode */
	public static final int
		VK_SAMPLER_ADDRESS_MODE_BEGIN_RANGE = VK_SAMPLER_ADDRESS_MODE_REPEAT,
		VK_SAMPLER_ADDRESS_MODE_END_RANGE   = VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER,
		VK_SAMPLER_ADDRESS_MODE_RANGE_SIZE  = VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER - VK_SAMPLER_ADDRESS_MODE_REPEAT + 1,
		VK_SAMPLER_ADDRESS_MODE_MAX_ENUM    = 0x7FFFFFFF;

	/** <code>(0.0, 0.0, 0.0, 0.0)</code> */
	public static final int VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = 0;

	/** <code>(0, 0, 0, 0)</code> */
	public static final int VK_BORDER_COLOR_INT_TRANSPARENT_BLACK = 1;

	/** <code>(0.0, 0.0, 0.0, 1.0)</code> */
	public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK = 2;

	/** <code>(0, 0, 0, 1)</code> */
	public static final int VK_BORDER_COLOR_INT_OPAQUE_BLACK = 3;

	/** <code>(1.0, 1.0, 1.0, 1.0)</code> */
	public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE = 4;

	/** <code>(1, 1, 1, 1)</code> */
	public static final int VK_BORDER_COLOR_INT_OPAQUE_WHITE = 5;

	/** VkBorderColor */
	public static final int
		VK_BORDER_COLOR_BEGIN_RANGE = VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK,
		VK_BORDER_COLOR_END_RANGE   = VK_BORDER_COLOR_INT_OPAQUE_WHITE,
		VK_BORDER_COLOR_RANGE_SIZE  = VK_BORDER_COLOR_INT_OPAQUE_WHITE - VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK + 1,
		VK_BORDER_COLOR_MAX_ENUM    = 0x7FFFFFFF;

	/** VkDescriptorType */
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
		VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT       = 10,
		VK_DESCRIPTOR_TYPE_BEGIN_RANGE            = VK_DESCRIPTOR_TYPE_SAMPLER,
		VK_DESCRIPTOR_TYPE_END_RANGE              = VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT,
		VK_DESCRIPTOR_TYPE_RANGE_SIZE             = VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT - VK_DESCRIPTOR_TYPE_SAMPLER + 1,
		VK_DESCRIPTOR_TYPE_MAX_ENUM               = 0x7FFFFFFF;

	/** Means the contents within the render area will be preserved. */
	public static final int VK_ATTACHMENT_LOAD_OP_LOAD = 0;

	/** Means the contents within the render area will be cleared to a uniform value, which is specified when a render pass instance is begun. */
	public static final int VK_ATTACHMENT_LOAD_OP_CLEAR = 1;

	/** Means the contents within the area need not be preserved; the contents of the attachment will be undefined inside the render area. */
	public static final int VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2;

	/** VkAttachmentLoadOp */
	public static final int
		VK_ATTACHMENT_LOAD_OP_BEGIN_RANGE = VK_ATTACHMENT_LOAD_OP_LOAD,
		VK_ATTACHMENT_LOAD_OP_END_RANGE   = VK_ATTACHMENT_LOAD_OP_DONT_CARE,
		VK_ATTACHMENT_LOAD_OP_RANGE_SIZE  = VK_ATTACHMENT_LOAD_OP_DONT_CARE - VK_ATTACHMENT_LOAD_OP_LOAD + 1,
		VK_ATTACHMENT_LOAD_OP_MAX_ENUM    = 0x7FFFFFFF;

	/**
	 * Means the contents within the render area are written to memory and will be available for reading after the render pass instance completes once the
	 * writes have been synchronized with {@link #VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT ACCESS_COLOR_ATTACHMENT_WRITE_BIT} (for color attachments) or {@link #VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT} (for
	 * depth/stencil attachments).
	 */
	public static final int VK_ATTACHMENT_STORE_OP_STORE = 0;

	/**
	 * Means the contents within the render area are not needed after rendering, and may be discarded; the contents of the attachment will be undefined
	 * inside the render area.
	 */
	public static final int VK_ATTACHMENT_STORE_OP_DONT_CARE = 1;

	/** VkAttachmentStoreOp */
	public static final int
		VK_ATTACHMENT_STORE_OP_BEGIN_RANGE = VK_ATTACHMENT_STORE_OP_STORE,
		VK_ATTACHMENT_STORE_OP_END_RANGE   = VK_ATTACHMENT_STORE_OP_DONT_CARE,
		VK_ATTACHMENT_STORE_OP_RANGE_SIZE  = VK_ATTACHMENT_STORE_OP_DONT_CARE - VK_ATTACHMENT_STORE_OP_STORE + 1,
		VK_ATTACHMENT_STORE_OP_MAX_ENUM    = 0x7FFFFFFF;

	/** VkPipelineBindPoint */
	public static final int
		VK_PIPELINE_BIND_POINT_GRAPHICS    = 0,
		VK_PIPELINE_BIND_POINT_COMPUTE     = 1,
		VK_PIPELINE_BIND_POINT_BEGIN_RANGE = VK_PIPELINE_BIND_POINT_GRAPHICS,
		VK_PIPELINE_BIND_POINT_END_RANGE   = VK_PIPELINE_BIND_POINT_COMPUTE,
		VK_PIPELINE_BIND_POINT_RANGE_SIZE  = VK_PIPELINE_BIND_POINT_COMPUTE - VK_PIPELINE_BIND_POINT_GRAPHICS + 1,
		VK_PIPELINE_BIND_POINT_MAX_ENUM    = 0x7FFFFFFF;

	/** VkCommandBufferLevel */
	public static final int
		VK_COMMAND_BUFFER_LEVEL_PRIMARY     = 0,
		VK_COMMAND_BUFFER_LEVEL_SECONDARY   = 1,
		VK_COMMAND_BUFFER_LEVEL_BEGIN_RANGE = VK_COMMAND_BUFFER_LEVEL_PRIMARY,
		VK_COMMAND_BUFFER_LEVEL_END_RANGE   = VK_COMMAND_BUFFER_LEVEL_SECONDARY,
		VK_COMMAND_BUFFER_LEVEL_RANGE_SIZE  = VK_COMMAND_BUFFER_LEVEL_SECONDARY - VK_COMMAND_BUFFER_LEVEL_PRIMARY + 1,
		VK_COMMAND_BUFFER_LEVEL_MAX_ENUM    = 0x7FFFFFFF;

	/** VkIndexType */
	public static final int
		VK_INDEX_TYPE_UINT16      = 0,
		VK_INDEX_TYPE_UINT32      = 1,
		VK_INDEX_TYPE_BEGIN_RANGE = VK_INDEX_TYPE_UINT16,
		VK_INDEX_TYPE_END_RANGE   = VK_INDEX_TYPE_UINT32,
		VK_INDEX_TYPE_RANGE_SIZE  = VK_INDEX_TYPE_UINT32 - VK_INDEX_TYPE_UINT16 + 1,
		VK_INDEX_TYPE_MAX_ENUM    = 0x7FFFFFFF;

	/**
	 * The contents of the subpass will be recorded inline in the primary command buffer, and secondary command buffers must not be executed within the
	 * subpass.
	 */
	public static final int VK_SUBPASS_CONTENTS_INLINE = 0;

	/**
	 * The contents are recorded in secondary command buffers that will be called from the primary command buffer, and {@link #vkCmdExecuteCommands CmdExecuteCommands} is the only
	 * valid command on the command buffer until {@link #vkCmdNextSubpass CmdNextSubpass} or {@link #vkCmdEndRenderPass CmdEndRenderPass}.
	 */
	public static final int VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1;

	/** VkSubpassContents */
	public static final int
		VK_SUBPASS_CONTENTS_BEGIN_RANGE = VK_SUBPASS_CONTENTS_INLINE,
		VK_SUBPASS_CONTENTS_END_RANGE   = VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS,
		VK_SUBPASS_CONTENTS_RANGE_SIZE  = VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS - VK_SUBPASS_CONTENTS_INLINE + 1,
		VK_SUBPASS_CONTENTS_MAX_ENUM    = 0x7FFFFFFF;

	/** {@code VkImageView} <b>can</b> be sampled from. */
	public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = 0x1;

	/** {@code VkImageView} <b>can</b> be used as storage image. */
	public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = 0x2;

	/** {@code VkImageView} <b>can</b> be used as storage image that supports atomic operations. */
	public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = 0x4;

	/** Format <b>can</b> be used to create a {@code VkBufferView} that <b>can</b> be bound to a {@link #VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} descriptor. */
	public static final int VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = 0x8;

	/** Format <b>can</b> be used to create a {@code VkBufferView} that <b>can</b> be bound to a {@link #VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} descriptor. */
	public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = 0x10;

	/** Atomic operations are supported on {@link #VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} with this format. */
	public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 0x20;

	/** Format <b>can</b> be used as a vertex attribute format ({@link VkVertexInputAttributeDescription}{@code .format}). */
	public static final int VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = 0x40;

	/** {@code VkImageView} <b>can</b> be used as a framebuffer color attachment and as an input attachment. */
	public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = 0x80;

	/** {@code VkImageView} <b>can</b> be used as a framebuffer color attachment that supports blending and as an input attachment. */
	public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = 0x100;

	/** {@code VkImageView} 4can be used as a framebuffer depth/stencil attachment and as an input attachment. */
	public static final int VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x200;

	/** {@code VkImage} <b>can</b> be used as {@code srcImage} for the {@link #vkCmdBlitImage CmdBlitImage} command. */
	public static final int VK_FORMAT_FEATURE_BLIT_SRC_BIT = 0x400;

	/** {@code VkImage} <b>can</b> be used as {@code dstImage} for the {@link #vkCmdBlitImage CmdBlitImage} command. */
	public static final int VK_FORMAT_FEATURE_BLIT_DST_BIT = 0x800;

	/**
	 * {@code VkImage} <b>can</b> be used with a sampler that has either of {@code magFilter} or {@code minFilter} set to {@link #VK_FILTER_LINEAR FILTER_LINEAR}, or {@code mipmapMode}
	 * set to {@link #VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR}. This bit <b>must</b> only be exposed for formats that also support the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}.
	 * 
	 * <p>If the format being queried is a depth/stencil format, this bit only indicates that the depth aspect (not the stencil aspect) supports linear
	 * filtering, and that linear filtering of the depth aspect is supported whether depth compare is enabled in the sampler or not. If this bit is not
	 * present, linear filtering with depth compare disabled is unsupported and linear filtering with depth compare enabled is supported, but <b>may</b> compute
	 * the filtered value in an implementation-dependent manner which differs from the normal rules of linear filtering. The resulting value <b>must</b> be in
	 * the range {@code [0,1]} and should be proportional to, or a weighted average of, the number of comparison passes or failures.</p>
	 */
	public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 0x1000;

	/** Indicates that the image <b>can</b> be used as the source of a transfer command. */
	public static final int VK_IMAGE_USAGE_TRANSFER_SRC_BIT = 0x1;

	/** Indicates that the image <b>can</b> be used as the destination of a transfer command. */
	public static final int VK_IMAGE_USAGE_TRANSFER_DST_BIT = 0x2;

	/**
	 * Indicates that the image <b>can</b> be used to create a {@code VkImageView} suitable for occupying a {@code VkDescriptorSet} slot either of type
	 * {@link #VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} or {@link #VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, and be sampled by a shader.
	 */
	public static final int VK_IMAGE_USAGE_SAMPLED_BIT = 0x4;

	/**
	 * Indicates that the image <b>can</b> be used to create a {@code VkImageView} suitable for occupying a {@code VkDescriptorSet} slot of type
	 * {@link #VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}.
	 */
	public static final int VK_IMAGE_USAGE_STORAGE_BIT = 0x8;

	/** Indicates that the image <b>can</b> be used to create a {@code VkImageView} suitable for use as a color or resolve attachment in a {@code VkFramebuffer}. */
	public static final int VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT = 0x10;

	/** Indicates that the image <b>can</b> be used to create a {@code VkImageView} suitable for use as a depth/stencil attachment in a {@code VkFramebuffer}. */
	public static final int VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x20;

	/**
	 * Indicates that the memory bound to this image will have been allocated with the {@link #VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT}. If this is set, then bits
	 * other than {@link #VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, and {@link #VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} <b>must not</b> be set.
	 */
	public static final int VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT = 0x40;

	/**
	 * Indicates that the image <b>can</b> be used to create a {@code VkImageView} suitable for occupying {@code VkDescriptorSet} slot of type
	 * {@link #VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}; be read from a shader as an input attachment; and be used as an input attachment in a framebuffer.
	 */
	public static final int VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT = 0x80;

	/** Indicates that the image will be backed using sparse memory binding. */
	public static final int VK_IMAGE_CREATE_SPARSE_BINDING_BIT = 0x1;

	/** Indicates that the image <b>can</b> be partially backed using sparse memory binding. */
	public static final int VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = 0x2;

	/**
	 * Indicates that the image will be backed using sparse memory binding with memory ranges that might also simultaneously be backing another image (or
	 * another portion of the same image). Sparse images created with this flag must also be created with the {@link #VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}.
	 */
	public static final int VK_IMAGE_CREATE_SPARSE_ALIASED_BIT = 0x4;

	/** Indicates that the image <b>can</b> be used to create a {@code VkImageView} with a different format from the image. */
	public static final int VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT = 0x8;

	/** Indicates that the image <b>can</b> be used to create a {@code VkImageView} of type {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}. */
	public static final int VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT = 0x10;

	/**
	 * 1 sample per pixel. Standard sample locations:
	 * 
	 * <pre><code>(0.5, 0.5)</code></pre>
	 */
	public static final int VK_SAMPLE_COUNT_1_BIT = 0x1;

	/**
	 * 2 samples per pixel. Standard sample locations:
	 * 
	 * <pre><code>(0.25, 0.25)
(0.75, 0.75)</code></pre>
	 */
	public static final int VK_SAMPLE_COUNT_2_BIT = 0x2;

	/**
	 * 4 samples per pixel. Standard sample locations:
	 * 
	 * <pre><code>(0.375, 0.125)
(0.875, 0.375)
(0.125, 0.625)
(0.625, 0.875)</code></pre>
	 */
	public static final int VK_SAMPLE_COUNT_4_BIT = 0x4;

	/**
	 * 8 samples per pixel. Standard sample locations:
	 * 
	 * <pre><code>(0.5625, 0.3125)
(0.4375, 0.6875)
(0.8125, 0.5625)
(0.3125, 0.1875)
(0.1875, 0.8125)
(0.0625, 0.4375)
(0.6875, 0.9375)
(0.9375, 0.0625)</code></pre>
	 */
	public static final int VK_SAMPLE_COUNT_8_BIT = 0x8;

	/**
	 * 16 samples per pixel. Standard sample locations:
	 * 
	 * <pre><code>(0.5625, 0.5625)
(0.4375, 0.3125)
(0.3125, 0.625)
(0.75, 0.4375)
(0.1875, 0.375)
(0.625, 0.8125)
(0.8125, 0.6875)
(0.6875, 0.1875)
(0.375, 0.875)
(0.5, 0.0625)
(0.25, 0.125)
(0.125, 0.75)
(0.0, 0.5)
(0.9375, 0.25)
(0.875, 0.9375)
(0.0625, 0.0)</code></pre>
	 */
	public static final int VK_SAMPLE_COUNT_16_BIT = 0x10;

	/** 32 samples per pixel. */
	public static final int VK_SAMPLE_COUNT_32_BIT = 0x20;

	/** 64 samples per pixel. */
	public static final int VK_SAMPLE_COUNT_64_BIT = 0x40;

	/** If set, then the queues in this queue family support graphics operations. */
	public static final int VK_QUEUE_GRAPHICS_BIT = 0x1;

	/** If set, then the queues in this queue family support compute operations. */
	public static final int VK_QUEUE_COMPUTE_BIT = 0x2;

	/** If set, then the queues in this queue family support transfer operations. */
	public static final int VK_QUEUE_TRANSFER_BIT = 0x4;

	/**
	 * If set, then the queues in this queue family support sparse memory management operations. If any of the sparse resource features are enabled, then
	 * at least one queue family must support this bit.
	 */
	public static final int VK_QUEUE_SPARSE_BINDING_BIT = 0x8;

	/**
	 * If set, memory allocated with this type is the most efficient for device access. This property will only be set for memory types belonging to heaps
	 * with the {@link #VK_MEMORY_HEAP_DEVICE_LOCAL_BIT MEMORY_HEAP_DEVICE_LOCAL_BIT} set.
	 */
	public static final int VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 0x1;

	/** If set, memory allocated with this type can be mapped using {@link #vkMapMemory MapMemory} so that it can be accessed on the host. */
	public static final int VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 0x2;

	/**
	 * If set, host cache management commands {@link #vkFlushMappedMemoryRanges FlushMappedMemoryRanges} and {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} are not needed to make host writes visible to
	 * the device or device writes visible to the host, respectively.
	 */
	public static final int VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 0x4;

	/**
	 * If set, memory allocated with this type is cached on the host. Host memory accesses to uncached memory are slower than to cached memory, however
	 * uncached memory is always host coherent.
	 */
	public static final int VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 0x8;

	/**
	 * If set, the memory type only allows device access to the memory. Memory types must not have both {@link #VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT} and
	 * {@link #VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} set. Additionally, the object's backing memory may be provided by the implementation lazily.
	 */
	public static final int VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 0x10;

	/**
	 * Means the heap corresponds to device local memory. Device local memory may have different performance characteristics than host local memory, and
	 * may support different memory property flags.
	 */
	public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 0x1;

	/** Stage of the pipeline where commands are initially received by the queue. */
	public static final int VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT = 0x1;

	/** Stage of the pipeline where Draw/DispatchIndirect data structures are consumed. */
	public static final int VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT = 0x2;

	/** Stage of the pipeline where vertex and index buffers are consumed. */
	public static final int VK_PIPELINE_STAGE_VERTEX_INPUT_BIT = 0x4;

	/** Vertex shader stage. */
	public static final int VK_PIPELINE_STAGE_VERTEX_SHADER_BIT = 0x8;

	/** Tessellation control shader stage. */
	public static final int VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT = 0x10;

	/** Tessellation evaluation shader stage. */
	public static final int VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = 0x20;

	/** Geometry shader stage. */
	public static final int VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT = 0x40;

	/** Fragment shader stage. */
	public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT = 0x80;

	/** Stage of the pipeline where early fragment tests (depth and stencil tests before fragment shading) are performed. */
	public static final int VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT = 0x100;

	/** Stage of the pipeline where late fragment tests (depth and stencil tests after fragment shading) are performed. */
	public static final int VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT = 0x200;

	/**
	 * Stage of the pipeline after blending where the final color values are output from the pipeline. This stage also includes resolve operations that
	 * occur at the end of a subpass. Note that this does not necessarily indicate that the values have been committed to memory.
	 */
	public static final int VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT = 0x400;

	/** Execution of a compute shader. */
	public static final int VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT = 0x800;

	/**
	 * Execution of copy commands. This includes the operations resulting from all transfer commands. The set of transfer commands comprises
	 * {@link #vkCmdCopyBuffer CmdCopyBuffer}, {@link #vkCmdCopyImage CmdCopyImage}, {@link #vkCmdBlitImage CmdBlitImage}, {@link #vkCmdCopyBufferToImage CmdCopyBufferToImage}, {@link #vkCmdCopyImageToBuffer CmdCopyImageToBuffer}, {@link #vkCmdUpdateBuffer CmdUpdateBuffer}, {@link #vkCmdFillBuffer CmdFillBuffer},
	 * {@link #vkCmdClearColorImage CmdClearColorImage}, {@link #vkCmdClearDepthStencilImage CmdClearDepthStencilImage}, {@link #vkCmdResolveImage CmdResolveImage}, and {@link #vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults}.
	 */
	public static final int VK_PIPELINE_STAGE_TRANSFER_BIT = 0x1000;

	/** Final stage in the pipeline where commands complete execution. */
	public static final int VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT = 0x2000;

	/** A pseudo-stage indicating execution on the host of reads/writes of device memory. */
	public static final int VK_PIPELINE_STAGE_HOST_BIT = 0x4000;

	/** Execution of all graphics pipeline stages. */
	public static final int VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT = 0x8000;

	/** Execution of all stages supported on the queue. */
	public static final int VK_PIPELINE_STAGE_ALL_COMMANDS_BIT = 0x10000;

	/** VkImageAspectFlagBits */
	public static final int
		VK_IMAGE_ASPECT_COLOR_BIT    = 0x1,
		VK_IMAGE_ASPECT_DEPTH_BIT    = 0x2,
		VK_IMAGE_ASPECT_STENCIL_BIT  = 0x4,
		VK_IMAGE_ASPECT_METADATA_BIT = 0x8;

	/** If set, the image uses a single mip tail region for all array layers. */
	public static final int VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT = 0x1;

	/** If set, the first mip level that is not an exact multiple of the sparse image block size begins the mip tail region. */
	public static final int VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT = 0x2;

	/**
	 * If set, the image uses a non-standard sparse block size, and the imageGranularity values do not match the standard block size for the given pixel
	 * format.
	 */
	public static final int VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = 0x4;

	/** Is used to indicate that the memory being bound is only for the metadata aspect. */
	public static final int VK_SPARSE_MEMORY_BIND_METADATA_BIT = 0x1;

	/** If set, then the fence object is created in the signaled state. Otherwise it is created in the unsignaled state. */
	public static final int VK_FENCE_CREATE_SIGNALED_BIT = 0x1;

	/**
	 * If set, queries managed by the pool will count the number of vertices processed by the input assembly stage. Vertices corresponding to incomplete
	 * primitives may contribute to the count.
	 */
	public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT = 0x1;

	/**
	 * If set, queries managed by the pool will count the number of primitives processed by the input assembly stage. If primitive restart is enabled,
	 * restarting the primitive topology has no effect on the count. Incomplete primitives may be counted.
	 */
	public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT = 0x2;

	/**
	 * If set, queries managed by the pool will count the number of vertex shader invocations. This counter’s value is incremented each time a vertex
	 * shader is invoked.
	 */
	public static final int VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT = 0x4;

	/**
	 * If set, queries managed by the pool will count the number of geometry shader invocations. This counter’s value is incremented each time a geometry
	 * shader is invoked. In the case of instanced geometry shaders, the geometry shader invocations count is incremented for each separate instanced
	 * invocation.
	 */
	public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT = 0x8;

	/**
	 * If set, queries managed by the pool will count the number of primitives generated by geometry shader invocations. The counter’s value is
	 * incremented each time the geometry shader emits a primitive. Restarting primitive topology using the SPIR-V instructions {@code OpEndPrimitive} or
	 * {@code OpEndStreamPrimitive} has no effect on the geometry shader output primitives count.
	 */
	public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT = 0x10;

	/**
	 * If set, queries managed by the pool will count the number of primitives processed by the Primitive Clipping stage of the pipeline. The counter’s
	 * value is incremented each time a primitive reaches the primitive clipping stage.
	 */
	public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT = 0x20;

	/**
	 * IF set, queries managed by the pool will count the number of primitives output by the Primitive Clipping stage of the pipeline. The counter’s value
	 * is incremented each time a primitive passes the primitive clipping stage. The actual number of primitives output by the primitive clipping stage
	 * for a particular input primitive is implementation-dependent but must satisfy the following conditions:
	 * 
	 * <ul>
	 * <li>If at least one vertex of the input primitive lies inside the clipping volume, the counter is incremented by one or more.</li>
	 * <li>Otherwise, the counter is incremented by zero or more.</li>
	 * </ul>
	 */
	public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT = 0x40;

	/**
	 * IF set, queries managed by the pool will count the number of fragment shader invocations. The counter’s value is incremented each time the fragment
	 * shader is invoked.
	 */
	public static final int VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT = 0x80;

	/**
	 * If set, queries managed by the pool will count the number of patches processed by the tessellation control shader. The counter’s value is
	 * incremented once for each patch for which a tessellation control shader is invoked.
	 */
	public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT = 0x100;

	/**
	 * If set, queries managed by the pool will count the number of invocations of the tessellation evaluation shader. The counter’s value is incremented
	 * each time the tessellation evaluation shader is invoked.
	 */
	public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT = 0x200;

	/**
	 * If set, queries managed by the pool will count the number of compute shader invocations. The counter’s value is incremented every time the compute
	 * shader is invoked. Implementations may skip the execution of certain compute shader invocations or execute additional compute shader invocations
	 * for implementation-dependent reasons as long as the results of rendering otherwise remain unchanged.
	 */
	public static final int VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT = 0x400;

	/**
	 * Indicates the results will be written as an array of 64-bit unsigned integer values. If this bit is not set, the results will be written as an
	 * array of 32-bit unsigned integer values.
	 */
	public static final int VK_QUERY_RESULT_64_BIT = 0x1;

	/** Indicates that Vulkan will wait for each query’s status to become available before retrieving its results. */
	public static final int VK_QUERY_RESULT_WAIT_BIT = 0x2;

	/** Indicates that the availability status accompanies the results. */
	public static final int VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 0x4;

	/** Indicates that returning partial results is acceptable. */
	public static final int VK_QUERY_RESULT_PARTIAL_BIT = 0x8;

	/** Indicates that the buffer will be backed using sparse memory binding. */
	public static final int VK_BUFFER_CREATE_SPARSE_BINDING_BIT = 0x1;

	/** Indicates that the buffer <b>can</b> be partially backed using sparse memory binding. */
	public static final int VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 0x2;

	/**
	 * Iindicates that the buffer will be backed using sparse memory binding with memory ranges that might also simultaneously be backing another buffer
	 * (or another portion of the same buffer).
	 */
	public static final int VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = 0x4;

	/** Indicates that the buffer <b>can</b> be used as the source of a transfer command. */
	public static final int VK_BUFFER_USAGE_TRANSFER_SRC_BIT = 0x1;

	/** Indicates that the buffer <b>can</b> be used as the destination of a transfer command. */
	public static final int VK_BUFFER_USAGE_TRANSFER_DST_BIT = 0x2;

	/**
	 * Indicates that the buffer <b>can</b> be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type
	 * {@link #VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}.
	 */
	public static final int VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = 0x4;

	/**
	 * Indicates that the buffer <b>can</b> be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type
	 * {@link #VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}.
	 */
	public static final int VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = 0x8;

	/**
	 * Indicates that the buffer <b>can</b> be used in a {@link VkDescriptorBufferInfo} suitable for occupying a {@code VkDescriptorSet} slot either of type
	 * {@link #VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link #VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}.
	 */
	public static final int VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT = 0x10;

	/**
	 * Indicates that the buffer <b>can</b> be used in a {@link VkDescriptorBufferInfo} suitable for occupying a {@code VkDescriptorSet} slot either of type
	 * {@link #VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link #VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}.
	 */
	public static final int VK_BUFFER_USAGE_STORAGE_BUFFER_BIT = 0x20;

	/** Indicates that the buffer is suitable for passing as the {@code buffer} parameter to {@link #vkCmdBindIndexBuffer CmdBindIndexBuffer}. */
	public static final int VK_BUFFER_USAGE_INDEX_BUFFER_BIT = 0x40;

	/** Indicates that the buffer is suitable for passing as an element of the {@code pBuffers} array to {@link #vkCmdBindVertexBuffers CmdBindVertexBuffers}. */
	public static final int VK_BUFFER_USAGE_VERTEX_BUFFER_BIT = 0x80;

	/**
	 * Indicates that the buffer is suitable for passing as the {@code buffer} parameter to {@link #vkCmdDrawIndirect CmdDrawIndirect}, {@link #vkCmdDrawIndexedIndirect CmdDrawIndexedIndirect}, or
	 * {@link #vkCmdDispatchIndirect CmdDispatchIndirect}.
	 */
	public static final int VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT = 0x100;

	/** Specifies that the created pipeline will not be optimized. Using this flag <b>may</b> reduce the time taken to create the pipeline. */
	public static final int VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = 0x1;

	/**
	 * Specifies that the pipeline to be created is allowed to be the parent of a pipeline that will be created in a subsequent call to
	 * {@link #vkCreateGraphicsPipelines CreateGraphicsPipelines}.
	 */
	public static final int VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT = 0x2;

	/** Specifies that the pipeline to be created will be a child of a previously created parent pipeline. */
	public static final int VK_PIPELINE_CREATE_DERIVATIVE_BIT = 0x4;

	/** VkShaderStageFlagBits */
	public static final int
		VK_SHADER_STAGE_VERTEX_BIT                  = 0x1,
		VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT    = 0x2,
		VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = 0x4,
		VK_SHADER_STAGE_GEOMETRY_BIT                = 0x8,
		VK_SHADER_STAGE_FRAGMENT_BIT                = 0x10,
		VK_SHADER_STAGE_COMPUTE_BIT                 = 0x20,
		VK_SHADER_STAGE_ALL_GRAPHICS                = 0x1F,
		VK_SHADER_STAGE_ALL                         = 0x7FFFFFFF;

	/** If set, no triangles are discarded. */
	public static final int VK_CULL_MODE_NONE = 0;

	/** If set, front-facing triangles are discarded. */
	public static final int VK_CULL_MODE_FRONT_BIT = 0x1;

	/** If set, back-facing triangles are discarded. */
	public static final int VK_CULL_MODE_BACK_BIT = 0x2;

	/** If set, all triangles are discarded. */
	public static final int VK_CULL_MODE_FRONT_AND_BACK = 0x3;

	/** If set, then the {@code R} value is written to color attachment for the appropriate sample, otherwise the value in memory is unmodified. */
	public static final int VK_COLOR_COMPONENT_R_BIT = 0x1;

	/** If set, then the {@code G} value is written to color attachment for the appropriate sample, otherwise the value in memory is unmodified. */
	public static final int VK_COLOR_COMPONENT_G_BIT = 0x2;

	/** If set, then the {@code B} value is written to color attachment for the appropriate sample, otherwise the value in memory is unmodified. */
	public static final int VK_COLOR_COMPONENT_B_BIT = 0x4;

	/** If set, then the {@code A} value is written to color attachment for the appropriate sample, otherwise the value in memory is unmodified. */
	public static final int VK_COLOR_COMPONENT_A_BIT = 0x8;

	/**
	 * If set, then descriptor sets can return their individual allocations to the pool, i.e. all of {@link #vkAllocateDescriptorSets AllocateDescriptorSets}, {@link #vkFreeDescriptorSets FreeDescriptorSets}, and
	 * {@link #vkResetDescriptorPool ResetDescriptorPool} are allowed. Otherwise, descriptor sets allocated from the pool must not be individually freed back to the pool, i.e. only
	 * {@link #vkAllocateDescriptorSets AllocateDescriptorSets} and {@link #vkResetDescriptorPool ResetDescriptorPool} are allowed.
	 */
	public static final int VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = 0x1;

	/**
	 * If set, then the attachment is treated as if it shares physical memory with another attachment in the same render pass. This information limits the
	 * ability of the implementation to reorder certain operations (like layout transitions and the {@code loadOp}) such that it is not improperly
	 * reordered against other uses of the same physical memory via a different attachment. This is described in more detail below.
	 * 
	 * <p>If a render pass uses multiple attachments that alias the same device memory, those attachments <b>must</b> each include the
	 * {@code ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} bit in their attachment description flags. Attachments aliasing the same memory occurs in multiple
	 * ways:</p>
	 * 
	 * <ul>
	 * <li>Multiple attachments being assigned the same image view as part of framebuffer creation.</li>
	 * <li>Attachments using distinct image views that correspond to the same subresource of an image.</li>
	 * <li>Attachments using views of distinct image subresources which are bound to overlapping memory.</li>
	 * </ul>
	 * 
	 * <p>Render passes <b>must</b> include subpass dependencies (either directly or via a subpass dependency chain) between any two subpasses that operate on the
	 * same attachment or aliasing attachments and those subpass dependencies <b>must</b> include execution and memory dependencies separating uses of the
	 * aliases, if at least one of those subpasses writes to one of the aliases. Those dependencies <b>must not</b> include the {@link #VK_DEPENDENCY_BY_REGION_BIT DEPENDENCY_BY_REGION_BIT} if the
	 * aliases are views of distinct image subresources which overlap in memory.</p>
	 * 
	 * <p>Multiple attachments that alias the same memory <b>must not</b> be used in a single subpass. A given attachment index <b>must not</b> be used multiple times in
	 * a single subpass, with one exception: two subpass attachments <b>can</b> use the same attachment index if at least one use is as an input attachment and
	 * neither use is as a resolve or preserve attachment. In other words, the same view <b>can</b> be used simultaneously as an input and color or
	 * depth/stencil attachment, but <b>must not</b> be used as multiple color or depth/stencil attachments nor as resolve or preserve attachments.</p>
	 * 
	 * <p>If a set of attachments alias each other, then all except the first to be used in the render pass must use an initialLayout of
	 * {@link #VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, since the earlier uses of the other aliases make their contents undefined. Once an alias has been used and a different
	 * alias has been used after it, the first alias <b>must not</b> be used in any later subpasses. However, an application can assign the same image view to
	 * multiple aliasing attachment indices, which allows that image view to be used multiple times even if other aliases are used in between. Once an
	 * attachment needs the {@code ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} bit, there should be no additional cost of introducing additional aliases, and
	 * using these additional aliases may allow more efficient clearing of the attachments on multiple uses via {@link #VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}.</p>
	 * 
	 * <h3>Note</h3>
	 * 
	 * <p>The exact set of attachment indices that alias with each other is not known until a framebuffer is created using the render pass, so the above
	 * conditions cannot be validated at render pass creation time.</p>
	 */
	public static final int VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = 0x1;

	/** Indicates that the access is an indirect command structure read as part of an indirect drawing command. */
	public static final int VK_ACCESS_INDIRECT_COMMAND_READ_BIT = 0x1;

	/** Indicates that the access is an index buffer read. */
	public static final int VK_ACCESS_INDEX_READ_BIT = 0x2;

	/** Indicates that the access is a read via the vertex input bindings. */
	public static final int VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT = 0x4;

	/** Indicates that the access is a read via a uniform buffer or dynamic uniform buffer descriptor. */
	public static final int VK_ACCESS_UNIFORM_READ_BIT = 0x8;

	/** Indicates that the access is a read via an input attachment descriptor. */
	public static final int VK_ACCESS_INPUT_ATTACHMENT_READ_BIT = 0x10;

	/** Indicates that the access is a read from a shader via any other descriptor type. */
	public static final int VK_ACCESS_SHADER_READ_BIT = 0x20;

	/** Indicates that the access is a write or atomic from a shader via the same descriptor types as in {@link #VK_ACCESS_SHADER_READ_BIT ACCESS_SHADER_READ_BIT}. */
	public static final int VK_ACCESS_SHADER_WRITE_BIT = 0x40;

	/** Indicates that the access is a read via a color attachment. */
	public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_BIT = 0x80;

	/** Indicates that the access is a write via a color or resolve attachment. */
	public static final int VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT = 0x100;

	/** Indicates that the access is a read via a depth/stencil attachment. */
	public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 0x200;

	/** Indicates that the access is a write via a depth/stencil attachment. */
	public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 0x400;

	/**
	 * Indicates that the access is a read from a transfer (copy, blit, resolve, etc.) operation. For the complete set of transfer operations, see
	 * {@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}.
	 */
	public static final int VK_ACCESS_TRANSFER_READ_BIT = 0x800;

	/**
	 * Indicates that the access is a write from a transfer (copy, blit, resolve, etc.) operation. For the complete set of transfer operations, see
	 * {@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}.
	 */
	public static final int VK_ACCESS_TRANSFER_WRITE_BIT = 0x1000;

	/** Indicates that the access is a read via the host. */
	public static final int VK_ACCESS_HOST_READ_BIT = 0x2000;

	/** Indicates that the access is a write via the host. */
	public static final int VK_ACCESS_HOST_WRITE_BIT = 0x4000;

	/**
	 * Indicates that the access is a read via a non-specific unit attached to the memory. This unit may be external to the Vulkan device or otherwise not
	 * part of the core Vulkan pipeline. When included in {@code dstAccessMask}, all writes using access types in {@code srcAccessMask} performed by
	 * pipeline stages in {@code srcStageMask} must be visible in memory.
	 */
	public static final int VK_ACCESS_MEMORY_READ_BIT = 0x8000;

	/**
	 * Indicates that the access is a write via a non-specific unit attached to the memory. This unit may be external to the Vulkan device or otherwise
	 * not part of the core Vulkan pipeline. When included in {@code srcAccessMask}, all access types in {@code dstAccessMask} from pipeline stages in
	 * {@code dstStageMask} will observe the side effects of commands that executed before the barrier. When included in {@code dstAccessMask} all writes
	 * using access types in {@code srcAccessMask} performed by pipeline stages in {@code srcStageMask} must be visible in memory.
	 */
	public static final int VK_ACCESS_MEMORY_WRITE_BIT = 0x10000;

	/** If set, then the dependency is by-region. */
	public static final int VK_DEPENDENCY_BY_REGION_BIT = 0x1;

	/**
	 * Indicates that command buffers allocated from the pool will be short-lived, meaning that they will be reset or freed in a relatively short
	 * timeframe. This flag may be used by the implementation to control memory allocation behavior within the pool.
	 */
	public static final int VK_COMMAND_POOL_CREATE_TRANSIENT_BIT = 0x1;

	/**
	 * Controls whether command buffers allocated from the pool <b>can</b> be individually reset. If this flag is set, individual command buffers allocated from
	 * the pool <b>can</b> be reset either explicitly, by calling {@link #vkResetCommandBuffer ResetCommandBuffer}, or implicitly, by calling {@link #vkBeginCommandBuffer BeginCommandBuffer} on an executable
	 * command buffer. If this flag is not set, then {@link #vkResetCommandBuffer ResetCommandBuffer} and {@link #vkBeginCommandBuffer BeginCommandBuffer} (on an executable command buffer) must not be called
	 * on the command buffers allocated from the pool, and they can only be reset in bulk by calling {@link #vkResetCommandPool ResetCommandPool}.
	 */
	public static final int VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = 0x2;

	/** If set, resetting a command pool recycles all of the resources from the command pool back to the system. */
	public static final int VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 0x1;

	/**
	 * Indicates that each recording of the command buffer will only be submitted once, and the command buffer will be reset and recorded again between
	 * each submission.
	 */
	public static final int VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = 0x1;

	/**
	 * Indicates that a secondary command buffer is considered to be entirely inside a render pass. If this is a primary command buffer, then this bit is
	 * ignored.
	 */
	public static final int VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = 0x2;

	/** Allows the command buffer to be resubmitted to a queue or recorded into a primary command buffer while it is pending execution. */
	public static final int VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = 0x4;

	/** If set, an implementation <b>must</b> return a result that matches the actual number of samples passed. */
	public static final int VK_QUERY_CONTROL_PRECISE_BIT = 0x1;

	/**
	 * If set, then most or all memory resources currently owned by the command buffer should be returned to the parent command pool. If this flag is not
	 * set, then the command buffer may hold onto memory resources and reuse them when recording commands.
	 */
	public static final int VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 0x1;

	/** Indicates that only the front set of stencil state is updated. */
	public static final int VK_STENCIL_FACE_FRONT_BIT = 0x1;

	/** Indicates that only the back set of stencil state is updated. */
	public static final int VK_STENCIL_FACE_BACK_BIT = 0x2;

	/** Is the combination of {@link #VK_STENCIL_FACE_FRONT_BIT STENCIL_FACE_FRONT_BIT} and {@link #VK_STENCIL_FACE_BACK_BIT STENCIL_FACE_BACK_BIT} and indicates that both sets of stencil state are updated. */
	public static final int VK_STENCIL_FRONT_AND_BACK = 0x3;

	/** Function address. */
	public final long
		CreateInstance,
		DestroyInstance,
		EnumeratePhysicalDevices,
		GetPhysicalDeviceFeatures,
		GetPhysicalDeviceFormatProperties,
		GetPhysicalDeviceImageFormatProperties,
		GetPhysicalDeviceProperties,
		GetPhysicalDeviceQueueFamilyProperties,
		GetPhysicalDeviceMemoryProperties,
		GetInstanceProcAddr,
		GetDeviceProcAddr,
		CreateDevice,
		DestroyDevice,
		EnumerateInstanceExtensionProperties,
		EnumerateDeviceExtensionProperties,
		EnumerateInstanceLayerProperties,
		EnumerateDeviceLayerProperties,
		GetDeviceQueue,
		QueueSubmit,
		QueueWaitIdle,
		DeviceWaitIdle,
		AllocateMemory,
		FreeMemory,
		MapMemory,
		UnmapMemory,
		FlushMappedMemoryRanges,
		InvalidateMappedMemoryRanges,
		GetDeviceMemoryCommitment,
		BindBufferMemory,
		BindImageMemory,
		GetBufferMemoryRequirements,
		GetImageMemoryRequirements,
		GetImageSparseMemoryRequirements,
		GetPhysicalDeviceSparseImageFormatProperties,
		QueueBindSparse,
		CreateFence,
		DestroyFence,
		ResetFences,
		GetFenceStatus,
		WaitForFences,
		CreateSemaphore,
		DestroySemaphore,
		CreateEvent,
		DestroyEvent,
		GetEventStatus,
		SetEvent,
		ResetEvent,
		CreateQueryPool,
		DestroyQueryPool,
		GetQueryPoolResults,
		CreateBuffer,
		DestroyBuffer,
		CreateBufferView,
		DestroyBufferView,
		CreateImage,
		DestroyImage,
		GetImageSubresourceLayout,
		CreateImageView,
		DestroyImageView,
		CreateShaderModule,
		DestroyShaderModule,
		CreatePipelineCache,
		DestroyPipelineCache,
		GetPipelineCacheData,
		MergePipelineCaches,
		CreateGraphicsPipelines,
		CreateComputePipelines,
		DestroyPipeline,
		CreatePipelineLayout,
		DestroyPipelineLayout,
		CreateSampler,
		DestroySampler,
		CreateDescriptorSetLayout,
		DestroyDescriptorSetLayout,
		CreateDescriptorPool,
		DestroyDescriptorPool,
		ResetDescriptorPool,
		AllocateDescriptorSets,
		FreeDescriptorSets,
		UpdateDescriptorSets,
		CreateFramebuffer,
		DestroyFramebuffer,
		CreateRenderPass,
		DestroyRenderPass,
		GetRenderAreaGranularity,
		CreateCommandPool,
		DestroyCommandPool,
		ResetCommandPool,
		AllocateCommandBuffers,
		FreeCommandBuffers,
		BeginCommandBuffer,
		EndCommandBuffer,
		ResetCommandBuffer,
		CmdBindPipeline,
		CmdSetViewport,
		CmdSetScissor,
		CmdSetLineWidth,
		CmdSetDepthBias,
		CmdSetBlendConstants,
		CmdSetDepthBounds,
		CmdSetStencilCompareMask,
		CmdSetStencilWriteMask,
		CmdSetStencilReference,
		CmdBindDescriptorSets,
		CmdBindIndexBuffer,
		CmdBindVertexBuffers,
		CmdDraw,
		CmdDrawIndexed,
		CmdDrawIndirect,
		CmdDrawIndexedIndirect,
		CmdDispatch,
		CmdDispatchIndirect,
		CmdCopyBuffer,
		CmdCopyImage,
		CmdBlitImage,
		CmdCopyBufferToImage,
		CmdCopyImageToBuffer,
		CmdUpdateBuffer,
		CmdFillBuffer,
		CmdClearColorImage,
		CmdClearDepthStencilImage,
		CmdClearAttachments,
		CmdResolveImage,
		CmdSetEvent,
		CmdResetEvent,
		CmdWaitEvents,
		CmdPipelineBarrier,
		CmdBeginQuery,
		CmdEndQuery,
		CmdResetQueryPool,
		CmdWriteTimestamp,
		CmdCopyQueryPoolResults,
		CmdPushConstants,
		CmdBeginRenderPass,
		CmdNextSubpass,
		CmdEndRenderPass,
		CmdExecuteCommands;

	protected VK10() {
		throw new UnsupportedOperationException();
	}

	public VK10(FunctionProvider provider) {
		CreateInstance = provider.getFunctionAddress("vkCreateInstance");
		DestroyInstance = provider.getFunctionAddress("vkDestroyInstance");
		EnumeratePhysicalDevices = provider.getFunctionAddress("vkEnumeratePhysicalDevices");
		GetPhysicalDeviceFeatures = provider.getFunctionAddress("vkGetPhysicalDeviceFeatures");
		GetPhysicalDeviceFormatProperties = provider.getFunctionAddress("vkGetPhysicalDeviceFormatProperties");
		GetPhysicalDeviceImageFormatProperties = provider.getFunctionAddress("vkGetPhysicalDeviceImageFormatProperties");
		GetPhysicalDeviceProperties = provider.getFunctionAddress("vkGetPhysicalDeviceProperties");
		GetPhysicalDeviceQueueFamilyProperties = provider.getFunctionAddress("vkGetPhysicalDeviceQueueFamilyProperties");
		GetPhysicalDeviceMemoryProperties = provider.getFunctionAddress("vkGetPhysicalDeviceMemoryProperties");
		GetInstanceProcAddr = provider.getFunctionAddress("vkGetInstanceProcAddr");
		GetDeviceProcAddr = provider.getFunctionAddress("vkGetDeviceProcAddr");
		CreateDevice = provider.getFunctionAddress("vkCreateDevice");
		DestroyDevice = provider.getFunctionAddress("vkDestroyDevice");
		EnumerateInstanceExtensionProperties = provider.getFunctionAddress("vkEnumerateInstanceExtensionProperties");
		EnumerateDeviceExtensionProperties = provider.getFunctionAddress("vkEnumerateDeviceExtensionProperties");
		EnumerateInstanceLayerProperties = provider.getFunctionAddress("vkEnumerateInstanceLayerProperties");
		EnumerateDeviceLayerProperties = provider.getFunctionAddress("vkEnumerateDeviceLayerProperties");
		GetDeviceQueue = provider.getFunctionAddress("vkGetDeviceQueue");
		QueueSubmit = provider.getFunctionAddress("vkQueueSubmit");
		QueueWaitIdle = provider.getFunctionAddress("vkQueueWaitIdle");
		DeviceWaitIdle = provider.getFunctionAddress("vkDeviceWaitIdle");
		AllocateMemory = provider.getFunctionAddress("vkAllocateMemory");
		FreeMemory = provider.getFunctionAddress("vkFreeMemory");
		MapMemory = provider.getFunctionAddress("vkMapMemory");
		UnmapMemory = provider.getFunctionAddress("vkUnmapMemory");
		FlushMappedMemoryRanges = provider.getFunctionAddress("vkFlushMappedMemoryRanges");
		InvalidateMappedMemoryRanges = provider.getFunctionAddress("vkInvalidateMappedMemoryRanges");
		GetDeviceMemoryCommitment = provider.getFunctionAddress("vkGetDeviceMemoryCommitment");
		BindBufferMemory = provider.getFunctionAddress("vkBindBufferMemory");
		BindImageMemory = provider.getFunctionAddress("vkBindImageMemory");
		GetBufferMemoryRequirements = provider.getFunctionAddress("vkGetBufferMemoryRequirements");
		GetImageMemoryRequirements = provider.getFunctionAddress("vkGetImageMemoryRequirements");
		GetImageSparseMemoryRequirements = provider.getFunctionAddress("vkGetImageSparseMemoryRequirements");
		GetPhysicalDeviceSparseImageFormatProperties = provider.getFunctionAddress("vkGetPhysicalDeviceSparseImageFormatProperties");
		QueueBindSparse = provider.getFunctionAddress("vkQueueBindSparse");
		CreateFence = provider.getFunctionAddress("vkCreateFence");
		DestroyFence = provider.getFunctionAddress("vkDestroyFence");
		ResetFences = provider.getFunctionAddress("vkResetFences");
		GetFenceStatus = provider.getFunctionAddress("vkGetFenceStatus");
		WaitForFences = provider.getFunctionAddress("vkWaitForFences");
		CreateSemaphore = provider.getFunctionAddress("vkCreateSemaphore");
		DestroySemaphore = provider.getFunctionAddress("vkDestroySemaphore");
		CreateEvent = provider.getFunctionAddress("vkCreateEvent");
		DestroyEvent = provider.getFunctionAddress("vkDestroyEvent");
		GetEventStatus = provider.getFunctionAddress("vkGetEventStatus");
		SetEvent = provider.getFunctionAddress("vkSetEvent");
		ResetEvent = provider.getFunctionAddress("vkResetEvent");
		CreateQueryPool = provider.getFunctionAddress("vkCreateQueryPool");
		DestroyQueryPool = provider.getFunctionAddress("vkDestroyQueryPool");
		GetQueryPoolResults = provider.getFunctionAddress("vkGetQueryPoolResults");
		CreateBuffer = provider.getFunctionAddress("vkCreateBuffer");
		DestroyBuffer = provider.getFunctionAddress("vkDestroyBuffer");
		CreateBufferView = provider.getFunctionAddress("vkCreateBufferView");
		DestroyBufferView = provider.getFunctionAddress("vkDestroyBufferView");
		CreateImage = provider.getFunctionAddress("vkCreateImage");
		DestroyImage = provider.getFunctionAddress("vkDestroyImage");
		GetImageSubresourceLayout = provider.getFunctionAddress("vkGetImageSubresourceLayout");
		CreateImageView = provider.getFunctionAddress("vkCreateImageView");
		DestroyImageView = provider.getFunctionAddress("vkDestroyImageView");
		CreateShaderModule = provider.getFunctionAddress("vkCreateShaderModule");
		DestroyShaderModule = provider.getFunctionAddress("vkDestroyShaderModule");
		CreatePipelineCache = provider.getFunctionAddress("vkCreatePipelineCache");
		DestroyPipelineCache = provider.getFunctionAddress("vkDestroyPipelineCache");
		GetPipelineCacheData = provider.getFunctionAddress("vkGetPipelineCacheData");
		MergePipelineCaches = provider.getFunctionAddress("vkMergePipelineCaches");
		CreateGraphicsPipelines = provider.getFunctionAddress("vkCreateGraphicsPipelines");
		CreateComputePipelines = provider.getFunctionAddress("vkCreateComputePipelines");
		DestroyPipeline = provider.getFunctionAddress("vkDestroyPipeline");
		CreatePipelineLayout = provider.getFunctionAddress("vkCreatePipelineLayout");
		DestroyPipelineLayout = provider.getFunctionAddress("vkDestroyPipelineLayout");
		CreateSampler = provider.getFunctionAddress("vkCreateSampler");
		DestroySampler = provider.getFunctionAddress("vkDestroySampler");
		CreateDescriptorSetLayout = provider.getFunctionAddress("vkCreateDescriptorSetLayout");
		DestroyDescriptorSetLayout = provider.getFunctionAddress("vkDestroyDescriptorSetLayout");
		CreateDescriptorPool = provider.getFunctionAddress("vkCreateDescriptorPool");
		DestroyDescriptorPool = provider.getFunctionAddress("vkDestroyDescriptorPool");
		ResetDescriptorPool = provider.getFunctionAddress("vkResetDescriptorPool");
		AllocateDescriptorSets = provider.getFunctionAddress("vkAllocateDescriptorSets");
		FreeDescriptorSets = provider.getFunctionAddress("vkFreeDescriptorSets");
		UpdateDescriptorSets = provider.getFunctionAddress("vkUpdateDescriptorSets");
		CreateFramebuffer = provider.getFunctionAddress("vkCreateFramebuffer");
		DestroyFramebuffer = provider.getFunctionAddress("vkDestroyFramebuffer");
		CreateRenderPass = provider.getFunctionAddress("vkCreateRenderPass");
		DestroyRenderPass = provider.getFunctionAddress("vkDestroyRenderPass");
		GetRenderAreaGranularity = provider.getFunctionAddress("vkGetRenderAreaGranularity");
		CreateCommandPool = provider.getFunctionAddress("vkCreateCommandPool");
		DestroyCommandPool = provider.getFunctionAddress("vkDestroyCommandPool");
		ResetCommandPool = provider.getFunctionAddress("vkResetCommandPool");
		AllocateCommandBuffers = provider.getFunctionAddress("vkAllocateCommandBuffers");
		FreeCommandBuffers = provider.getFunctionAddress("vkFreeCommandBuffers");
		BeginCommandBuffer = provider.getFunctionAddress("vkBeginCommandBuffer");
		EndCommandBuffer = provider.getFunctionAddress("vkEndCommandBuffer");
		ResetCommandBuffer = provider.getFunctionAddress("vkResetCommandBuffer");
		CmdBindPipeline = provider.getFunctionAddress("vkCmdBindPipeline");
		CmdSetViewport = provider.getFunctionAddress("vkCmdSetViewport");
		CmdSetScissor = provider.getFunctionAddress("vkCmdSetScissor");
		CmdSetLineWidth = provider.getFunctionAddress("vkCmdSetLineWidth");
		CmdSetDepthBias = provider.getFunctionAddress("vkCmdSetDepthBias");
		CmdSetBlendConstants = provider.getFunctionAddress("vkCmdSetBlendConstants");
		CmdSetDepthBounds = provider.getFunctionAddress("vkCmdSetDepthBounds");
		CmdSetStencilCompareMask = provider.getFunctionAddress("vkCmdSetStencilCompareMask");
		CmdSetStencilWriteMask = provider.getFunctionAddress("vkCmdSetStencilWriteMask");
		CmdSetStencilReference = provider.getFunctionAddress("vkCmdSetStencilReference");
		CmdBindDescriptorSets = provider.getFunctionAddress("vkCmdBindDescriptorSets");
		CmdBindIndexBuffer = provider.getFunctionAddress("vkCmdBindIndexBuffer");
		CmdBindVertexBuffers = provider.getFunctionAddress("vkCmdBindVertexBuffers");
		CmdDraw = provider.getFunctionAddress("vkCmdDraw");
		CmdDrawIndexed = provider.getFunctionAddress("vkCmdDrawIndexed");
		CmdDrawIndirect = provider.getFunctionAddress("vkCmdDrawIndirect");
		CmdDrawIndexedIndirect = provider.getFunctionAddress("vkCmdDrawIndexedIndirect");
		CmdDispatch = provider.getFunctionAddress("vkCmdDispatch");
		CmdDispatchIndirect = provider.getFunctionAddress("vkCmdDispatchIndirect");
		CmdCopyBuffer = provider.getFunctionAddress("vkCmdCopyBuffer");
		CmdCopyImage = provider.getFunctionAddress("vkCmdCopyImage");
		CmdBlitImage = provider.getFunctionAddress("vkCmdBlitImage");
		CmdCopyBufferToImage = provider.getFunctionAddress("vkCmdCopyBufferToImage");
		CmdCopyImageToBuffer = provider.getFunctionAddress("vkCmdCopyImageToBuffer");
		CmdUpdateBuffer = provider.getFunctionAddress("vkCmdUpdateBuffer");
		CmdFillBuffer = provider.getFunctionAddress("vkCmdFillBuffer");
		CmdClearColorImage = provider.getFunctionAddress("vkCmdClearColorImage");
		CmdClearDepthStencilImage = provider.getFunctionAddress("vkCmdClearDepthStencilImage");
		CmdClearAttachments = provider.getFunctionAddress("vkCmdClearAttachments");
		CmdResolveImage = provider.getFunctionAddress("vkCmdResolveImage");
		CmdSetEvent = provider.getFunctionAddress("vkCmdSetEvent");
		CmdResetEvent = provider.getFunctionAddress("vkCmdResetEvent");
		CmdWaitEvents = provider.getFunctionAddress("vkCmdWaitEvents");
		CmdPipelineBarrier = provider.getFunctionAddress("vkCmdPipelineBarrier");
		CmdBeginQuery = provider.getFunctionAddress("vkCmdBeginQuery");
		CmdEndQuery = provider.getFunctionAddress("vkCmdEndQuery");
		CmdResetQueryPool = provider.getFunctionAddress("vkCmdResetQueryPool");
		CmdWriteTimestamp = provider.getFunctionAddress("vkCmdWriteTimestamp");
		CmdCopyQueryPoolResults = provider.getFunctionAddress("vkCmdCopyQueryPoolResults");
		CmdPushConstants = provider.getFunctionAddress("vkCmdPushConstants");
		CmdBeginRenderPass = provider.getFunctionAddress("vkCmdBeginRenderPass");
		CmdNextSubpass = provider.getFunctionAddress("vkCmdNextSubpass");
		CmdEndRenderPass = provider.getFunctionAddress("vkCmdEndRenderPass");
		CmdExecuteCommands = provider.getFunctionAddress("vkCmdExecuteCommands");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link VK10} instance from the specified dispatchable handle. */
	public static VK10 getInstance(DispatchableHandle handle) {
		return getInstance(handle.getCapabilities());
	}

	/** Returns the {@link VK10} instance of the specified {@link VKCapabilities}. */
	public static VK10 getInstance(VKCapabilities caps) {
		return checkFunctionality(caps.__VK10);
	}

	static VK10 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("Vulkan10") )
			return null;

		return VK.checkExtension("Vulkan10", create(provider));
	}

	static VK10 create(FunctionProvider provider) {
		VK10 funcs = new VK10(provider);

		boolean supported = checkFunctions(
			funcs.CreateInstance, funcs.DestroyInstance, funcs.EnumeratePhysicalDevices, funcs.GetPhysicalDeviceFeatures, 
			funcs.GetPhysicalDeviceFormatProperties, funcs.GetPhysicalDeviceImageFormatProperties, funcs.GetPhysicalDeviceProperties, 
			funcs.GetPhysicalDeviceQueueFamilyProperties, funcs.GetPhysicalDeviceMemoryProperties, funcs.GetInstanceProcAddr, funcs.GetDeviceProcAddr, 
			funcs.CreateDevice, funcs.DestroyDevice, funcs.EnumerateInstanceExtensionProperties, funcs.EnumerateDeviceExtensionProperties, 
			funcs.EnumerateInstanceLayerProperties, funcs.EnumerateDeviceLayerProperties, funcs.GetDeviceQueue, funcs.QueueSubmit, funcs.QueueWaitIdle, 
			funcs.DeviceWaitIdle, funcs.AllocateMemory, funcs.FreeMemory, funcs.MapMemory, funcs.UnmapMemory, funcs.FlushMappedMemoryRanges, 
			funcs.InvalidateMappedMemoryRanges, funcs.GetDeviceMemoryCommitment, funcs.BindBufferMemory, funcs.BindImageMemory, 
			funcs.GetBufferMemoryRequirements, funcs.GetImageMemoryRequirements, funcs.GetImageSparseMemoryRequirements, 
			funcs.GetPhysicalDeviceSparseImageFormatProperties, funcs.QueueBindSparse, funcs.CreateFence, funcs.DestroyFence, funcs.ResetFences, 
			funcs.GetFenceStatus, funcs.WaitForFences, funcs.CreateSemaphore, funcs.DestroySemaphore, funcs.CreateEvent, funcs.DestroyEvent, 
			funcs.GetEventStatus, funcs.SetEvent, funcs.ResetEvent, funcs.CreateQueryPool, funcs.DestroyQueryPool, funcs.GetQueryPoolResults, 
			funcs.CreateBuffer, funcs.DestroyBuffer, funcs.CreateBufferView, funcs.DestroyBufferView, funcs.CreateImage, funcs.DestroyImage, 
			funcs.GetImageSubresourceLayout, funcs.CreateImageView, funcs.DestroyImageView, funcs.CreateShaderModule, funcs.DestroyShaderModule, 
			funcs.CreatePipelineCache, funcs.DestroyPipelineCache, funcs.GetPipelineCacheData, funcs.MergePipelineCaches, funcs.CreateGraphicsPipelines, 
			funcs.CreateComputePipelines, funcs.DestroyPipeline, funcs.CreatePipelineLayout, funcs.DestroyPipelineLayout, funcs.CreateSampler, 
			funcs.DestroySampler, funcs.CreateDescriptorSetLayout, funcs.DestroyDescriptorSetLayout, funcs.CreateDescriptorPool, funcs.DestroyDescriptorPool, 
			funcs.ResetDescriptorPool, funcs.AllocateDescriptorSets, funcs.FreeDescriptorSets, funcs.UpdateDescriptorSets, funcs.CreateFramebuffer, 
			funcs.DestroyFramebuffer, funcs.CreateRenderPass, funcs.DestroyRenderPass, funcs.GetRenderAreaGranularity, funcs.CreateCommandPool, 
			funcs.DestroyCommandPool, funcs.ResetCommandPool, funcs.AllocateCommandBuffers, funcs.FreeCommandBuffers, funcs.BeginCommandBuffer, 
			funcs.EndCommandBuffer, funcs.ResetCommandBuffer, funcs.CmdBindPipeline, funcs.CmdSetViewport, funcs.CmdSetScissor, funcs.CmdSetLineWidth, 
			funcs.CmdSetDepthBias, funcs.CmdSetBlendConstants, funcs.CmdSetDepthBounds, funcs.CmdSetStencilCompareMask, funcs.CmdSetStencilWriteMask, 
			funcs.CmdSetStencilReference, funcs.CmdBindDescriptorSets, funcs.CmdBindIndexBuffer, funcs.CmdBindVertexBuffers, funcs.CmdDraw, 
			funcs.CmdDrawIndexed, funcs.CmdDrawIndirect, funcs.CmdDrawIndexedIndirect, funcs.CmdDispatch, funcs.CmdDispatchIndirect, funcs.CmdCopyBuffer, 
			funcs.CmdCopyImage, funcs.CmdBlitImage, funcs.CmdCopyBufferToImage, funcs.CmdCopyImageToBuffer, funcs.CmdUpdateBuffer, funcs.CmdFillBuffer, 
			funcs.CmdClearColorImage, funcs.CmdClearDepthStencilImage, funcs.CmdClearAttachments, funcs.CmdResolveImage, funcs.CmdSetEvent, funcs.CmdResetEvent, 
			funcs.CmdWaitEvents, funcs.CmdPipelineBarrier, funcs.CmdBeginQuery, funcs.CmdEndQuery, funcs.CmdResetQueryPool, funcs.CmdWriteTimestamp, 
			funcs.CmdCopyQueryPoolResults, funcs.CmdPushConstants, funcs.CmdBeginRenderPass, funcs.CmdNextSubpass, funcs.CmdEndRenderPass, 
			funcs.CmdExecuteCommands
		);

		return supported ? funcs : null;
	}

	// --- [ vkCreateInstance ] ---

	/** Unsafe version of {@link #vkCreateInstance CreateInstance} */
	public static int nvkCreateInstance(long pCreateInfo, long pAllocator, long pInstance) {
		long __functionAddress = getInstance(VK.getGlobalCommands()).CreateInstance;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkInstanceCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPI(__functionAddress, pCreateInfo, pAllocator, pInstance);
	}

	/**
	 * Creates a new Vulkan instance.
	 * 
	 * <p>There is no global state in Vulkan and all per-application state is stored in a {@code VkInstance} object. Creating a {@code VkInstance} object
	 * initializes the Vulkan library and allows the application to pass information about itself to the implementation.</p>
	 * 
	 * <p>{@code vkCreateInstance} creates the instance, then enables and initializes global layers and extensions requested by the application. If an extension
	 * is provided by a layer, both the layer and extension <b>must</b> be specified at {@code vkCreateInstance} time.</p>
	 * 
	 * <h3>Valid Usage</h3>
	 * 
	 * <ul>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkInstanceCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pInstance} <b>must</b> be a pointer to a {@code VkInstance} handle</li>
	 * </ul>
	 *
	 * @param pCreateInfo points to an instance of {@link VkInstanceCreateInfo} controlling creation of the instance
	 * @param pAllocator  controls host memory allocation
	 * @param pInstance   a pointer to a {@code VkInstance} handle in which the resulting instance is returned
	 */
	public static int vkCreateInstance(VkInstanceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pInstance) {
		if ( CHECKS )
			checkBuffer(pInstance, 1 << POINTER_SHIFT);
		return nvkCreateInstance(pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pInstance));
	}

	/** Alternative version of: {@link #vkCreateInstance CreateInstance} */
	public static int vkCreateInstance(VkInstanceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, PointerBuffer pInstance) {
		if ( CHECKS )
			checkBuffer(pInstance, 1);
		return nvkCreateInstance(pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pInstance));
	}

	// --- [ vkDestroyInstance ] ---

	/** Unsafe version of {@link #vkDestroyInstance DestroyInstance} */
	public static void nvkDestroyInstance(VkInstance instance, long pAllocator) {
		long __functionAddress = getInstance(instance).DestroyInstance;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPPV(__functionAddress, instance.address(), pAllocator);
	}

	/**
	 * Destroys an instance of Vulkan.
	 * 
	 * <p>After destruction of the instance, all devices (logical and physical) and any objects created by those devices become invalid and should not be
	 * accessed. However, objects allocated directly or indirectly through the instance are not destroyed automatically and so may be leaked. Applications
	 * should destroy all objects created through instance before destroying the instance itself.</p>
	 * 
	 * <h3>Valid Usage</h3>
	 * 
	 * <ul>
	 * <li>If {@code instance} is not {@code NULL}, {@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>All child objects created using {@code instance} <b>must</b> have been destroyed prior to destroying {@code instance}</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when instance was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when instance was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <p>Host access to {@code instance} <b>must</b> be externally synchronized</p>
	 *
	 * @param instance   the handle of the instance to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroyInstance(VkInstance instance, VkAllocationCallbacks pAllocator) {
		nvkDestroyInstance(instance, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkEnumeratePhysicalDevices ] ---

	/** Unsafe version of {@link #vkEnumeratePhysicalDevices EnumeratePhysicalDevices} */
	public static int nvkEnumeratePhysicalDevices(VkInstance instance, long pPhysicalDeviceCount, long pPhysicalDevices) {
		long __functionAddress = getInstance(instance).EnumeratePhysicalDevices;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPPI(__functionAddress, instance.address(), pPhysicalDeviceCount, pPhysicalDevices);
	}

	/**
	 * Enumerates the physical devices accessible to a Vulkan instance.
	 *
	 * @param instance             
	 * @param pPhysicalDeviceCount 
	 * @param pPhysicalDevices     
	 */
	public static int vkEnumeratePhysicalDevices(VkInstance instance, ByteBuffer pPhysicalDeviceCount, ByteBuffer pPhysicalDevices) {
		if ( CHECKS ) {
			checkBuffer(pPhysicalDeviceCount, 1 << 2);
			if ( pPhysicalDevices != null ) checkBuffer(pPhysicalDevices, pPhysicalDeviceCount.getInt(pPhysicalDeviceCount.position()) << POINTER_SHIFT);
		}
		return nvkEnumeratePhysicalDevices(instance, memAddress(pPhysicalDeviceCount), memAddressSafe(pPhysicalDevices));
	}

	/** Alternative version of: {@link #vkEnumeratePhysicalDevices EnumeratePhysicalDevices} */
	public static int vkEnumeratePhysicalDevices(VkInstance instance, IntBuffer pPhysicalDeviceCount, PointerBuffer pPhysicalDevices) {
		if ( CHECKS ) {
			checkBuffer(pPhysicalDeviceCount, 1);
			if ( pPhysicalDevices != null ) checkBuffer(pPhysicalDevices, pPhysicalDeviceCount.get(pPhysicalDeviceCount.position()));
		}
		return nvkEnumeratePhysicalDevices(instance, memAddress(pPhysicalDeviceCount), memAddressSafe(pPhysicalDevices));
	}

	// --- [ vkGetPhysicalDeviceFeatures ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceFeatures GetPhysicalDeviceFeatures} */
	public static void nvkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, long pFeatures) {
		long __functionAddress = getInstance(physicalDevice).GetPhysicalDeviceFeatures;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, physicalDevice.address(), pFeatures);
	}

	/**
	 * Reports capabilities of a physical device.
	 *
	 * @param physicalDevice 
	 * @param pFeatures      
	 */
	public static void vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures pFeatures) {
		nvkGetPhysicalDeviceFeatures(physicalDevice, pFeatures.address());
	}

	// --- [ vkGetPhysicalDeviceFormatProperties ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} */
	public static void nvkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, int format, long pFormatProperties) {
		long __functionAddress = getInstance(physicalDevice).GetPhysicalDeviceFormatProperties;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIPV(__functionAddress, physicalDevice.address(), format, pFormatProperties);
	}

	/**
	 * Lists physical device’s format capabilities.
	 *
	 * @param physicalDevice    
	 * @param format            
	 * @param pFormatProperties 
	 */
	public static void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, int format, VkFormatProperties pFormatProperties) {
		nvkGetPhysicalDeviceFormatProperties(physicalDevice, format, pFormatProperties.address());
	}

	// --- [ vkGetPhysicalDeviceImageFormatProperties ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} */
	public static int nvkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, long pImageFormatProperties) {
		long __functionAddress = getInstance(physicalDevice).GetPhysicalDeviceImageFormatProperties;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPIIIIIPI(__functionAddress, physicalDevice.address(), format, type, tiling, usage, flags, pImageFormatProperties);
	}

	/**
	 * Lists physical device's image format capabilities.
	 *
	 * @param physicalDevice         
	 * @param format                 
	 * @param type                   
	 * @param tiling                 
	 * @param usage                  
	 * @param flags                  
	 * @param pImageFormatProperties 
	 */
	public static int vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, VkImageFormatProperties pImageFormatProperties) {
		return nvkGetPhysicalDeviceImageFormatProperties(physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties.address());
	}

	// --- [ vkGetPhysicalDeviceProperties ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceProperties GetPhysicalDeviceProperties} */
	public static void nvkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, long pProperties) {
		long __functionAddress = getInstance(physicalDevice).GetPhysicalDeviceProperties;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, physicalDevice.address(), pProperties);
	}

	/**
	 * Returns properties of a physical device.
	 *
	 * @param physicalDevice 
	 * @param pProperties    
	 */
	public static void vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties pProperties) {
		nvkGetPhysicalDeviceProperties(physicalDevice, pProperties.address());
	}

	// --- [ vkGetPhysicalDeviceQueueFamilyProperties ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} */
	public static void nvkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties) {
		long __functionAddress = getInstance(physicalDevice).GetPhysicalDeviceQueueFamilyProperties;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, physicalDevice.address(), pQueueFamilyPropertyCount, pQueueFamilyProperties);
	}

	/**
	 * Reports properties of the queues of the specified physical device.
	 *
	 * @param physicalDevice            
	 * @param pQueueFamilyPropertyCount 
	 * @param pQueueFamilyProperties    
	 */
	public static void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, ByteBuffer pQueueFamilyPropertyCount, VkQueueFamilyProperties.Buffer pQueueFamilyProperties) {
		if ( CHECKS ) {
			checkBuffer(pQueueFamilyPropertyCount, 1 << 2);
			if ( pQueueFamilyProperties != null ) checkBuffer(pQueueFamilyProperties, pQueueFamilyPropertyCount.getInt(pQueueFamilyPropertyCount.position()));
		}
		nvkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, memAddress(pQueueFamilyPropertyCount), pQueueFamilyProperties == null ? NULL : pQueueFamilyProperties.address());
	}

	/** Alternative version of: {@link #vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} */
	public static void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, IntBuffer pQueueFamilyPropertyCount, VkQueueFamilyProperties.Buffer pQueueFamilyProperties) {
		if ( CHECKS ) {
			checkBuffer(pQueueFamilyPropertyCount, 1);
			if ( pQueueFamilyProperties != null ) checkBuffer(pQueueFamilyProperties, pQueueFamilyPropertyCount.get(pQueueFamilyPropertyCount.position()));
		}
		nvkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, memAddress(pQueueFamilyPropertyCount), pQueueFamilyProperties == null ? NULL : pQueueFamilyProperties.address());
	}

	// --- [ vkGetPhysicalDeviceMemoryProperties ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceMemoryProperties GetPhysicalDeviceMemoryProperties} */
	public static void nvkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, long pMemoryProperties) {
		long __functionAddress = getInstance(physicalDevice).GetPhysicalDeviceMemoryProperties;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, physicalDevice.address(), pMemoryProperties);
	}

	/**
	 * Reports memory information for the specified physical device.
	 *
	 * @param physicalDevice    
	 * @param pMemoryProperties 
	 */
	public static void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties pMemoryProperties) {
		nvkGetPhysicalDeviceMemoryProperties(physicalDevice, pMemoryProperties.address());
	}

	// --- [ vkGetInstanceProcAddr ] ---

	/** Unsafe version of {@link #vkGetInstanceProcAddr GetInstanceProcAddr} */
	public static long nvkGetInstanceProcAddr(VkInstance instance, long pName) {
		long __functionAddress = getInstance(instance).GetInstanceProcAddr;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPP(__functionAddress, instance.address(), pName);
	}

	/**
	 * Returns a function pointer for a command.
	 *
	 * @param instance 
	 * @param pName    
	 */
	public static long vkGetInstanceProcAddr(VkInstance instance, ByteBuffer pName) {
		if ( CHECKS )
			checkNT1(pName);
		return nvkGetInstanceProcAddr(instance, memAddress(pName));
	}

	/** CharSequence version of: {@link #vkGetInstanceProcAddr GetInstanceProcAddr} */
	public static long vkGetInstanceProcAddr(VkInstance instance, CharSequence pName) {
		APIBuffer __buffer = apiBuffer();
		int pNameEncoded = __buffer.stringParamASCII(pName, true);
		return nvkGetInstanceProcAddr(instance, __buffer.address(pNameEncoded));
	}

	// --- [ vkGetDeviceProcAddr ] ---

	/** Unsafe version of {@link #vkGetDeviceProcAddr GetDeviceProcAddr} */
	public static long nvkGetDeviceProcAddr(VkDevice device, long pName) {
		long __functionAddress = getInstance(device).GetDeviceProcAddr;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPP(__functionAddress, device.address(), pName);
	}

	/**
	 * Returns a function pointer for a command.
	 *
	 * @param device 
	 * @param pName  
	 */
	public static long vkGetDeviceProcAddr(VkDevice device, ByteBuffer pName) {
		if ( CHECKS )
			checkNT1(pName);
		return nvkGetDeviceProcAddr(device, memAddress(pName));
	}

	/** CharSequence version of: {@link #vkGetDeviceProcAddr GetDeviceProcAddr} */
	public static long vkGetDeviceProcAddr(VkDevice device, CharSequence pName) {
		APIBuffer __buffer = apiBuffer();
		int pNameEncoded = __buffer.stringParamASCII(pName, true);
		return nvkGetDeviceProcAddr(device, __buffer.address(pNameEncoded));
	}

	// --- [ vkCreateDevice ] ---

	/** Unsafe version of {@link #vkCreateDevice CreateDevice} */
	public static int nvkCreateDevice(VkPhysicalDevice physicalDevice, long pCreateInfo, long pAllocator, long pDevice) {
		long __functionAddress = getInstance(physicalDevice).CreateDevice;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkDeviceCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, physicalDevice.address(), pCreateInfo, pAllocator, pDevice);
	}

	/**
	 * Creates a new device instance.
	 *
	 * @param physicalDevice 
	 * @param pCreateInfo    
	 * @param pAllocator     
	 * @param pDevice        
	 */
	public static int vkCreateDevice(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pDevice) {
		if ( CHECKS )
			checkBuffer(pDevice, 1 << POINTER_SHIFT);
		return nvkCreateDevice(physicalDevice, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pDevice));
	}

	/** Alternative version of: {@link #vkCreateDevice CreateDevice} */
	public static int vkCreateDevice(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, PointerBuffer pDevice) {
		if ( CHECKS )
			checkBuffer(pDevice, 1);
		return nvkCreateDevice(physicalDevice, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pDevice));
	}

	// --- [ vkDestroyDevice ] ---

	/** Unsafe version of {@link #vkDestroyDevice DestroyDevice} */
	public static void nvkDestroyDevice(VkDevice device, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyDevice;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPPV(__functionAddress, device.address(), pAllocator);
	}

	/**
	 * Destroys a logical device.
	 *
	 * @param device     
	 * @param pAllocator 
	 */
	public static void vkDestroyDevice(VkDevice device, VkAllocationCallbacks pAllocator) {
		nvkDestroyDevice(device, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkEnumerateInstanceExtensionProperties ] ---

	/** Unsafe version of {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties} */
	public static int nvkEnumerateInstanceExtensionProperties(long pLayerName, long pPropertyCount, long pProperties) {
		long __functionAddress = getInstance(VK.getGlobalCommands()).EnumerateInstanceExtensionProperties;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPPI(__functionAddress, pLayerName, pPropertyCount, pProperties);
	}

	/**
	 * Returns up to requested number of global extension properties.
	 *
	 * @param pLayerName     pointer to optional layer name. If not null, will only return extension properties for the requested layer.
	 * @param pPropertyCount pointer to count indicating space available on input and structures returned on output
	 * @param pProperties    pointer to a data structure to receive the results
	 */
	public static int vkEnumerateInstanceExtensionProperties(ByteBuffer pLayerName, ByteBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			if ( pLayerName != null ) checkNT1(pLayerName);
			checkBuffer(pPropertyCount, 1 << 2);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.getInt(pPropertyCount.position()));
		}
		return nvkEnumerateInstanceExtensionProperties(memAddressSafe(pLayerName), memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** Alternative version of: {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties} */
	public static int vkEnumerateInstanceExtensionProperties(ByteBuffer pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			if ( pLayerName != null ) checkNT1(pLayerName);
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateInstanceExtensionProperties(memAddressSafe(pLayerName), memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** CharSequence version of: {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties} */
	public static int vkEnumerateInstanceExtensionProperties(CharSequence pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		APIBuffer __buffer = apiBuffer();
		int pLayerNameEncoded = pLayerName == null ? 0 : __buffer.stringParamUTF8(pLayerName, true);
		return nvkEnumerateInstanceExtensionProperties(__buffer.addressSafe(pLayerName, pLayerNameEncoded), memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	// --- [ vkEnumerateDeviceExtensionProperties ] ---

	/** Unsafe version of {@link #vkEnumerateDeviceExtensionProperties EnumerateDeviceExtensionProperties} */
	public static int nvkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, long pLayerName, long pPropertyCount, long pProperties) {
		long __functionAddress = getInstance(physicalDevice).EnumerateDeviceExtensionProperties;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPPPI(__functionAddress, physicalDevice.address(), pLayerName, pPropertyCount, pProperties);
	}

	/**
	 * Returns properties of available physical device extensions.
	 *
	 * @param physicalDevice the physical device to query
	 * @param pLayerName     optional layer name to query
	 * @param pPropertyCount count indicating number of {@code VkExtensionProperties} pointed to by {@code pProperties}
	 * @param pProperties    pointer to an array of {@code VkExtensionProperties}
	 */
	public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, ByteBuffer pLayerName, ByteBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			if ( pLayerName != null ) checkNT1(pLayerName);
			checkBuffer(pPropertyCount, 1 << 2);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.getInt(pPropertyCount.position()));
		}
		return nvkEnumerateDeviceExtensionProperties(physicalDevice, memAddressSafe(pLayerName), memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** Alternative version of: {@link #vkEnumerateDeviceExtensionProperties EnumerateDeviceExtensionProperties} */
	public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, ByteBuffer pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			if ( pLayerName != null ) checkNT1(pLayerName);
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateDeviceExtensionProperties(physicalDevice, memAddressSafe(pLayerName), memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** CharSequence version of: {@link #vkEnumerateDeviceExtensionProperties EnumerateDeviceExtensionProperties} */
	public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, CharSequence pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		APIBuffer __buffer = apiBuffer();
		int pLayerNameEncoded = pLayerName == null ? 0 : __buffer.stringParamUTF8(pLayerName, true);
		return nvkEnumerateDeviceExtensionProperties(physicalDevice, __buffer.addressSafe(pLayerName, pLayerNameEncoded), memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	// --- [ vkEnumerateInstanceLayerProperties ] ---

	/** Unsafe version of {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties} */
	public static int nvkEnumerateInstanceLayerProperties(long pPropertyCount, long pProperties) {
		long __functionAddress = getInstance(VK.getGlobalCommands()).EnumerateInstanceLayerProperties;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPI(__functionAddress, pPropertyCount, pProperties);
	}

	/**
	 * Returns up to requested number of global layer properties.
	 *
	 * @param pPropertyCount pointer to count indicating space available on input and structures returned on output
	 * @param pProperties    pointer to a array to receive the results
	 */
	public static int vkEnumerateInstanceLayerProperties(ByteBuffer pPropertyCount, VkLayerProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1 << 2);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.getInt(pPropertyCount.position()));
		}
		return nvkEnumerateInstanceLayerProperties(memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** Alternative version of: {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties} */
	public static int vkEnumerateInstanceLayerProperties(IntBuffer pPropertyCount, VkLayerProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateInstanceLayerProperties(memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	// --- [ vkEnumerateDeviceLayerProperties ] ---

	/** Unsafe version of {@link #vkEnumerateDeviceLayerProperties EnumerateDeviceLayerProperties} */
	public static int nvkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
		long __functionAddress = getInstance(physicalDevice).EnumerateDeviceLayerProperties;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPPI(__functionAddress, physicalDevice.address(), pPropertyCount, pProperties);
	}

	/**
	 * Returns properties of available physical device layers.
	 *
	 * @param physicalDevice the physical device to query
	 * @param pPropertyCount count indicating number of {@code VkLayerProperties} pointed to by {@code pProperties}
	 * @param pProperties    pointer to an array of {@code VkLayerProperties}
	 */
	public static int vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, ByteBuffer pPropertyCount, VkLayerProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1 << 2);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.getInt(pPropertyCount.position()));
		}
		return nvkEnumerateDeviceLayerProperties(physicalDevice, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** Alternative version of: {@link #vkEnumerateDeviceLayerProperties EnumerateDeviceLayerProperties} */
	public static int vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, IntBuffer pPropertyCount, VkLayerProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateDeviceLayerProperties(physicalDevice, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	// --- [ vkGetDeviceQueue ] ---

	/** Unsafe version of {@link #vkGetDeviceQueue GetDeviceQueue} */
	public static void nvkGetDeviceQueue(VkDevice device, int queueFamilyIndex, int queueIndex, long pQueue) {
		long __functionAddress = getInstance(device).GetDeviceQueue;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIIPV(__functionAddress, device.address(), queueFamilyIndex, queueIndex, pQueue);
	}

	/**
	 * Gets a queue handle from a device.
	 *
	 * @param device           
	 * @param queueFamilyIndex 
	 * @param queueIndex       
	 * @param pQueue           
	 */
	public static void vkGetDeviceQueue(VkDevice device, int queueFamilyIndex, int queueIndex, ByteBuffer pQueue) {
		if ( CHECKS )
			checkBuffer(pQueue, 1 << POINTER_SHIFT);
		nvkGetDeviceQueue(device, queueFamilyIndex, queueIndex, memAddress(pQueue));
	}

	/** Alternative version of: {@link #vkGetDeviceQueue GetDeviceQueue} */
	public static void vkGetDeviceQueue(VkDevice device, int queueFamilyIndex, int queueIndex, PointerBuffer pQueue) {
		if ( CHECKS )
			checkBuffer(pQueue, 1);
		nvkGetDeviceQueue(device, queueFamilyIndex, queueIndex, memAddress(pQueue));
	}

	// --- [ vkQueueSubmit ] ---

	/** Unsafe version of {@link #vkQueueSubmit QueueSubmit} */
	public static int nvkQueueSubmit(VkQueue queue, int submitCount, long pSubmits, long fence) {
		long __functionAddress = getInstance(queue).QueueSubmit;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pSubmits != NULL ) VkSubmitInfo.validate(pSubmits, submitCount);
		}
		return callPIPJI(__functionAddress, queue.address(), submitCount, pSubmits, fence);
	}

	/**
	 * Submits a sequence of semaphores or command buffers to a queue.
	 *
	 * @param queue       
	 * @param submitCount 
	 * @param pSubmits    
	 * @param fence       
	 */
	public static int vkQueueSubmit(VkQueue queue, int submitCount, VkSubmitInfo.Buffer pSubmits, long fence) {
		if ( CHECKS )
			if ( pSubmits != null ) checkBuffer(pSubmits, submitCount);
		return nvkQueueSubmit(queue, submitCount, pSubmits == null ? NULL : pSubmits.address(), fence);
	}

	/** Alternative version of: {@link #vkQueueSubmit QueueSubmit} */
	public static int vkQueueSubmit(VkQueue queue, VkSubmitInfo.Buffer pSubmits, long fence) {
		return nvkQueueSubmit(queue, pSubmits == null ? 0 : pSubmits.remaining(), pSubmits == null ? NULL : pSubmits.address(), fence);
	}

	/** Single value version of: {@link #vkQueueSubmit QueueSubmit} */
	public static int vkQueueSubmit(VkQueue queue, VkSubmitInfo pSubmit, long fence) {
		return nvkQueueSubmit(queue, 1, pSubmit.address(), fence);
	}

	// --- [ vkQueueWaitIdle ] ---

	/**
	 * Waits for a queue to become idle.
	 *
	 * @param queue 
	 */
	public static int vkQueueWaitIdle(VkQueue queue) {
		long __functionAddress = getInstance(queue).QueueWaitIdle;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, queue.address());
	}

	// --- [ vkDeviceWaitIdle ] ---

	/**
	 * Waits for a device to become idle.
	 *
	 * @param device 
	 */
	public static int vkDeviceWaitIdle(VkDevice device) {
		long __functionAddress = getInstance(device).DeviceWaitIdle;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, device.address());
	}

	// --- [ vkAllocateMemory ] ---

	/** Unsafe version of {@link #vkAllocateMemory AllocateMemory} */
	public static int nvkAllocateMemory(VkDevice device, long pAllocateInfo, long pAllocator, long pMemory) {
		long __functionAddress = getInstance(device).AllocateMemory;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pAllocateInfo, pAllocator, pMemory);
	}

	/**
	 * Alocates GPU memory.
	 *
	 * @param device        
	 * @param pAllocateInfo 
	 * @param pAllocator    
	 * @param pMemory       
	 */
	public static int vkAllocateMemory(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pMemory) {
		if ( CHECKS )
			checkBuffer(pMemory, 1 << 3);
		return nvkAllocateMemory(device, pAllocateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pMemory));
	}

	/** Alternative version of: {@link #vkAllocateMemory AllocateMemory} */
	public static int vkAllocateMemory(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, LongBuffer pMemory) {
		if ( CHECKS )
			checkBuffer(pMemory, 1);
		return nvkAllocateMemory(device, pAllocateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pMemory));
	}

	// --- [ vkFreeMemory ] ---

	/** Unsafe version of {@link #vkFreeMemory FreeMemory} */
	public static void nvkFreeMemory(VkDevice device, long memory, long pAllocator) {
		long __functionAddress = getInstance(device).FreeMemory;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), memory, pAllocator);
	}

	/**
	 * Frees GPU memory.
	 *
	 * @param device     
	 * @param memory     
	 * @param pAllocator 
	 */
	public static void vkFreeMemory(VkDevice device, long memory, VkAllocationCallbacks pAllocator) {
		nvkFreeMemory(device, memory, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkMapMemory ] ---

	/** Unsafe version of {@link #vkMapMemory MapMemory} */
	public static int nvkMapMemory(VkDevice device, long memory, long offset, long size, int flags, long ppData) {
		long __functionAddress = getInstance(device).MapMemory;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJJJIPI(__functionAddress, device.address(), memory, offset, size, flags, ppData);
	}

	/**
	 * Maps a memory object into application address space.
	 *
	 * @param device 
	 * @param memory 
	 * @param offset 
	 * @param size   
	 * @param flags  
	 * @param ppData 
	 */
	public static int vkMapMemory(VkDevice device, long memory, long offset, long size, int flags, ByteBuffer ppData) {
		if ( CHECKS )
			checkBuffer(ppData, 1 << POINTER_SHIFT);
		return nvkMapMemory(device, memory, offset, size, flags, memAddress(ppData));
	}

	/** Alternative version of: {@link #vkMapMemory MapMemory} */
	public static int vkMapMemory(VkDevice device, long memory, long offset, long size, int flags, PointerBuffer ppData) {
		if ( CHECKS )
			checkBuffer(ppData, 1);
		return nvkMapMemory(device, memory, offset, size, flags, memAddress(ppData));
	}

	// --- [ vkUnmapMemory ] ---

	/**
	 * Unmaps a previously mapped memory object.
	 *
	 * @param device 
	 * @param memory 
	 */
	public static void vkUnmapMemory(VkDevice device, long memory) {
		long __functionAddress = getInstance(device).UnmapMemory;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJV(__functionAddress, device.address(), memory);
	}

	// --- [ vkFlushMappedMemoryRanges ] ---

	/** Unsafe version of {@link #vkFlushMappedMemoryRanges FlushMappedMemoryRanges} */
	public static int nvkFlushMappedMemoryRanges(VkDevice device, int memoryRangeCount, long pMemoryRanges) {
		long __functionAddress = getInstance(device).FlushMappedMemoryRanges;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPIPI(__functionAddress, device.address(), memoryRangeCount, pMemoryRanges);
	}

	/**
	 * Flushes mapped memory ranges.
	 *
	 * @param device           
	 * @param memoryRangeCount 
	 * @param pMemoryRanges    
	 */
	public static int vkFlushMappedMemoryRanges(VkDevice device, int memoryRangeCount, VkMappedMemoryRange.Buffer pMemoryRanges) {
		if ( CHECKS )
			checkBuffer(pMemoryRanges, memoryRangeCount);
		return nvkFlushMappedMemoryRanges(device, memoryRangeCount, pMemoryRanges.address());
	}

	/** Alternative version of: {@link #vkFlushMappedMemoryRanges FlushMappedMemoryRanges} */
	public static int vkFlushMappedMemoryRanges(VkDevice device, VkMappedMemoryRange.Buffer pMemoryRanges) {
		return nvkFlushMappedMemoryRanges(device, pMemoryRanges.remaining(), pMemoryRanges.address());
	}

	/** Single value version of: {@link #vkFlushMappedMemoryRanges FlushMappedMemoryRanges} */
	public static int vkFlushMappedMemoryRanges(VkDevice device, VkMappedMemoryRange pMemoryRange) {
		return nvkFlushMappedMemoryRanges(device, 1, pMemoryRange.address());
	}

	// --- [ vkInvalidateMappedMemoryRanges ] ---

	/** Unsafe version of {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} */
	public static int nvkInvalidateMappedMemoryRanges(VkDevice device, int memoryRangeCount, long pMemoryRanges) {
		long __functionAddress = getInstance(device).InvalidateMappedMemoryRanges;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPIPI(__functionAddress, device.address(), memoryRangeCount, pMemoryRanges);
	}

	/**
	 * Invalidates ranges of mapped memory objects.
	 *
	 * @param device           
	 * @param memoryRangeCount 
	 * @param pMemoryRanges    
	 */
	public static int vkInvalidateMappedMemoryRanges(VkDevice device, int memoryRangeCount, VkMappedMemoryRange.Buffer pMemoryRanges) {
		if ( CHECKS )
			checkBuffer(pMemoryRanges, memoryRangeCount);
		return nvkInvalidateMappedMemoryRanges(device, memoryRangeCount, pMemoryRanges.address());
	}

	/** Alternative version of: {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} */
	public static int vkInvalidateMappedMemoryRanges(VkDevice device, VkMappedMemoryRange.Buffer pMemoryRanges) {
		return nvkInvalidateMappedMemoryRanges(device, pMemoryRanges.remaining(), pMemoryRanges.address());
	}

	/** Single value version of: {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} */
	public static int vkInvalidateMappedMemoryRanges(VkDevice device, VkMappedMemoryRange pMemoryRange) {
		return nvkInvalidateMappedMemoryRanges(device, 1, pMemoryRange.address());
	}

	// --- [ vkGetDeviceMemoryCommitment ] ---

	/** Unsafe version of {@link #vkGetDeviceMemoryCommitment GetDeviceMemoryCommitment} */
	public static void nvkGetDeviceMemoryCommitment(VkDevice device, long memory, long pCommittedMemoryInBytes) {
		long __functionAddress = getInstance(device).GetDeviceMemoryCommitment;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJPV(__functionAddress, device.address(), memory, pCommittedMemoryInBytes);
	}

	/**
	 * Queries the current commitment for a {@code VkDeviceMemory}.
	 *
	 * @param device                  
	 * @param memory                  
	 * @param pCommittedMemoryInBytes 
	 */
	public static void vkGetDeviceMemoryCommitment(VkDevice device, long memory, ByteBuffer pCommittedMemoryInBytes) {
		if ( CHECKS )
			checkBuffer(pCommittedMemoryInBytes, 1 << 3);
		nvkGetDeviceMemoryCommitment(device, memory, memAddress(pCommittedMemoryInBytes));
	}

	/** Alternative version of: {@link #vkGetDeviceMemoryCommitment GetDeviceMemoryCommitment} */
	public static void vkGetDeviceMemoryCommitment(VkDevice device, long memory, LongBuffer pCommittedMemoryInBytes) {
		if ( CHECKS )
			checkBuffer(pCommittedMemoryInBytes, 1);
		nvkGetDeviceMemoryCommitment(device, memory, memAddress(pCommittedMemoryInBytes));
	}

	// --- [ vkBindBufferMemory ] ---

	/**
	 * Binds device memory to a buffer object.
	 *
	 * @param device       
	 * @param buffer       
	 * @param memory       
	 * @param memoryOffset 
	 */
	public static int vkBindBufferMemory(VkDevice device, long buffer, long memory, long memoryOffset) {
		long __functionAddress = getInstance(device).BindBufferMemory;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJJJI(__functionAddress, device.address(), buffer, memory, memoryOffset);
	}

	// --- [ vkBindImageMemory ] ---

	/**
	 * Binds device memory to an image object.
	 *
	 * @param device       
	 * @param image        
	 * @param memory       
	 * @param memoryOffset 
	 */
	public static int vkBindImageMemory(VkDevice device, long image, long memory, long memoryOffset) {
		long __functionAddress = getInstance(device).BindImageMemory;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJJJI(__functionAddress, device.address(), image, memory, memoryOffset);
	}

	// --- [ vkGetBufferMemoryRequirements ] ---

	/** Unsafe version of {@link #vkGetBufferMemoryRequirements GetBufferMemoryRequirements} */
	public static void nvkGetBufferMemoryRequirements(VkDevice device, long buffer, long pMemoryRequirements) {
		long __functionAddress = getInstance(device).GetBufferMemoryRequirements;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJPV(__functionAddress, device.address(), buffer, pMemoryRequirements);
	}

	/**
	 * Returns the memory requirements for specified Vulkan object.
	 *
	 * @param device              
	 * @param buffer              
	 * @param pMemoryRequirements 
	 */
	public static void vkGetBufferMemoryRequirements(VkDevice device, long buffer, VkMemoryRequirements pMemoryRequirements) {
		nvkGetBufferMemoryRequirements(device, buffer, pMemoryRequirements.address());
	}

	// --- [ vkGetImageMemoryRequirements ] ---

	/** Unsafe version of {@link #vkGetImageMemoryRequirements GetImageMemoryRequirements} */
	public static void nvkGetImageMemoryRequirements(VkDevice device, long image, long pMemoryRequirements) {
		long __functionAddress = getInstance(device).GetImageMemoryRequirements;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJPV(__functionAddress, device.address(), image, pMemoryRequirements);
	}

	/**
	 * Returns the memory requirements for specified Vulkan object.
	 *
	 * @param device              
	 * @param image               
	 * @param pMemoryRequirements 
	 */
	public static void vkGetImageMemoryRequirements(VkDevice device, long image, VkMemoryRequirements pMemoryRequirements) {
		nvkGetImageMemoryRequirements(device, image, pMemoryRequirements.address());
	}

	// --- [ vkGetImageSparseMemoryRequirements ] ---

	/** Unsafe version of {@link #vkGetImageSparseMemoryRequirements GetImageSparseMemoryRequirements} */
	public static void nvkGetImageSparseMemoryRequirements(VkDevice device, long image, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
		long __functionAddress = getInstance(device).GetImageSparseMemoryRequirements;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJPPV(__functionAddress, device.address(), image, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
	}

	/**
	 * Queries the memory requirements for a sparse image.
	 *
	 * @param device                        
	 * @param image                         
	 * @param pSparseMemoryRequirementCount 
	 * @param pSparseMemoryRequirements     
	 */
	public static void vkGetImageSparseMemoryRequirements(VkDevice device, long image, ByteBuffer pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements.Buffer pSparseMemoryRequirements) {
		if ( CHECKS ) {
			checkBuffer(pSparseMemoryRequirementCount, 1 << 2);
			if ( pSparseMemoryRequirements != null ) checkBuffer(pSparseMemoryRequirements, pSparseMemoryRequirementCount.getInt(pSparseMemoryRequirementCount.position()));
		}
		nvkGetImageSparseMemoryRequirements(device, image, memAddress(pSparseMemoryRequirementCount), pSparseMemoryRequirements == null ? NULL : pSparseMemoryRequirements.address());
	}

	/** Alternative version of: {@link #vkGetImageSparseMemoryRequirements GetImageSparseMemoryRequirements} */
	public static void vkGetImageSparseMemoryRequirements(VkDevice device, long image, IntBuffer pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements.Buffer pSparseMemoryRequirements) {
		if ( CHECKS ) {
			checkBuffer(pSparseMemoryRequirementCount, 1);
			if ( pSparseMemoryRequirements != null ) checkBuffer(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
		}
		nvkGetImageSparseMemoryRequirements(device, image, memAddress(pSparseMemoryRequirementCount), pSparseMemoryRequirements == null ? NULL : pSparseMemoryRequirements.address());
	}

	// --- [ vkGetPhysicalDeviceSparseImageFormatProperties ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties} */
	public static void nvkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, long pPropertyCount, long pProperties) {
		long __functionAddress = getInstance(physicalDevice).GetPhysicalDeviceSparseImageFormatProperties;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIIIIIPPV(__functionAddress, physicalDevice.address(), format, type, samples, usage, tiling, pPropertyCount, pProperties);
	}

	/**
	 * Retrieves properties of an image format applied to sparse images.
	 *
	 * @param physicalDevice 
	 * @param format         
	 * @param type           
	 * @param samples        
	 * @param usage          
	 * @param tiling         
	 * @param pPropertyCount 
	 * @param pProperties    
	 */
	public static void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, ByteBuffer pPropertyCount, VkSparseImageFormatProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1 << 2);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.getInt(pPropertyCount.position()));
		}
		nvkGetPhysicalDeviceSparseImageFormatProperties(physicalDevice, format, type, samples, usage, tiling, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** Alternative version of: {@link #vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties} */
	public static void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, IntBuffer pPropertyCount, VkSparseImageFormatProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		nvkGetPhysicalDeviceSparseImageFormatProperties(physicalDevice, format, type, samples, usage, tiling, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	// --- [ vkQueueBindSparse ] ---

	/** Unsafe version of {@link #vkQueueBindSparse QueueBindSparse} */
	public static int nvkQueueBindSparse(VkQueue queue, int bindInfoCount, long pBindInfo, long fence) {
		long __functionAddress = getInstance(queue).QueueBindSparse;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkBindSparseInfo.validate(pBindInfo, bindInfoCount);
		}
		return callPIPJI(__functionAddress, queue.address(), bindInfoCount, pBindInfo, fence);
	}

	/**
	 * Binds device memory to a sparse resource object.
	 *
	 * @param queue         
	 * @param bindInfoCount 
	 * @param pBindInfo     
	 * @param fence         
	 */
	public static int vkQueueBindSparse(VkQueue queue, int bindInfoCount, VkBindSparseInfo.Buffer pBindInfo, long fence) {
		if ( CHECKS )
			checkBuffer(pBindInfo, bindInfoCount);
		return nvkQueueBindSparse(queue, bindInfoCount, pBindInfo.address(), fence);
	}

	/** Alternative version of: {@link #vkQueueBindSparse QueueBindSparse} */
	public static int vkQueueBindSparse(VkQueue queue, VkBindSparseInfo.Buffer pBindInfo, long fence) {
		return nvkQueueBindSparse(queue, pBindInfo.remaining(), pBindInfo.address(), fence);
	}

	/** Single value version of: {@link #vkQueueBindSparse QueueBindSparse} */
	public static int vkQueueBindSparse(VkQueue queue, VkBindSparseInfo pBindInfo, long fence) {
		return nvkQueueBindSparse(queue, 1, pBindInfo.address(), fence);
	}

	// --- [ vkCreateFence ] ---

	/** Unsafe version of {@link #vkCreateFence CreateFence} */
	public static int nvkCreateFence(VkDevice device, long pCreateInfo, long pAllocator, long pFence) {
		long __functionAddress = getInstance(device).CreateFence;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pFence);
	}

	/**
	 * Creates a new fence object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pFence      
	 */
	public static int vkCreateFence(VkDevice device, VkFenceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pFence) {
		if ( CHECKS )
			checkBuffer(pFence, 1 << 3);
		return nvkCreateFence(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pFence));
	}

	/** Alternative version of: {@link #vkCreateFence CreateFence} */
	public static int vkCreateFence(VkDevice device, VkFenceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pFence) {
		if ( CHECKS )
			checkBuffer(pFence, 1);
		return nvkCreateFence(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pFence));
	}

	// --- [ vkDestroyFence ] ---

	/** Unsafe version of {@link #vkDestroyFence DestroyFence} */
	public static void nvkDestroyFence(VkDevice device, long fence, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyFence;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), fence, pAllocator);
	}

	/**
	 * Destroys a fence object.
	 *
	 * @param device     
	 * @param fence      
	 * @param pAllocator 
	 */
	public static void vkDestroyFence(VkDevice device, long fence, VkAllocationCallbacks pAllocator) {
		nvkDestroyFence(device, fence, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkResetFences ] ---

	/** Unsafe version of {@link #vkResetFences ResetFences} */
	public static int nvkResetFences(VkDevice device, int fenceCount, long pFences) {
		long __functionAddress = getInstance(device).ResetFences;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPIPI(__functionAddress, device.address(), fenceCount, pFences);
	}

	/**
	 * Resets one or more fence objects.
	 *
	 * @param device     
	 * @param fenceCount 
	 * @param pFences    
	 */
	public static int vkResetFences(VkDevice device, int fenceCount, ByteBuffer pFences) {
		if ( CHECKS )
			checkBuffer(pFences, fenceCount << 3);
		return nvkResetFences(device, fenceCount, memAddress(pFences));
	}

	/** Alternative version of: {@link #vkResetFences ResetFences} */
	public static int vkResetFences(VkDevice device, LongBuffer pFences) {
		return nvkResetFences(device, pFences.remaining(), memAddress(pFences));
	}

	/** Single value version of: {@link #vkResetFences ResetFences} */
	public static int vkResetFences(VkDevice device, long pFence) {
		APIBuffer __buffer = apiBuffer();
		int pFences = __buffer.longParam(pFence);
		return nvkResetFences(device, 1, __buffer.address(pFences));
	}

	// --- [ vkGetFenceStatus ] ---

	/**
	 * Returns the status of a fence.
	 *
	 * @param device 
	 * @param fence  
	 */
	public static int vkGetFenceStatus(VkDevice device, long fence) {
		long __functionAddress = getInstance(device).GetFenceStatus;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJI(__functionAddress, device.address(), fence);
	}

	// --- [ vkWaitForFences ] ---

	/** Unsafe version of {@link #vkWaitForFences WaitForFences} */
	public static int nvkWaitForFences(VkDevice device, int fenceCount, long pFences, int waitAll, long timeout) {
		long __functionAddress = getInstance(device).WaitForFences;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPIPIJI(__functionAddress, device.address(), fenceCount, pFences, waitAll, timeout);
	}

	/**
	 * Waits for one or more fences to become signaled.
	 *
	 * @param device     
	 * @param fenceCount 
	 * @param pFences    
	 * @param waitAll    
	 * @param timeout    
	 */
	public static int vkWaitForFences(VkDevice device, int fenceCount, ByteBuffer pFences, int waitAll, long timeout) {
		if ( CHECKS )
			checkBuffer(pFences, fenceCount << 3);
		return nvkWaitForFences(device, fenceCount, memAddress(pFences), waitAll, timeout);
	}

	/** Alternative version of: {@link #vkWaitForFences WaitForFences} */
	public static int vkWaitForFences(VkDevice device, LongBuffer pFences, int waitAll, long timeout) {
		return nvkWaitForFences(device, pFences.remaining(), memAddress(pFences), waitAll, timeout);
	}

	/** Single value version of: {@link #vkWaitForFences WaitForFences} */
	public static int vkWaitForFences(VkDevice device, long pFence, int waitAll, long timeout) {
		APIBuffer __buffer = apiBuffer();
		int pFences = __buffer.longParam(pFence);
		return nvkWaitForFences(device, 1, __buffer.address(pFences), waitAll, timeout);
	}

	// --- [ vkCreateSemaphore ] ---

	/** Unsafe version of {@link #vkCreateSemaphore CreateSemaphore} */
	public static int nvkCreateSemaphore(VkDevice device, long pCreateInfo, long pAllocator, long pSemaphore) {
		long __functionAddress = getInstance(device).CreateSemaphore;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pSemaphore);
	}

	/**
	 * Creates a new queue semaphore object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pSemaphore  
	 */
	public static int vkCreateSemaphore(VkDevice device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pSemaphore) {
		if ( CHECKS )
			checkBuffer(pSemaphore, 1 << 3);
		return nvkCreateSemaphore(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSemaphore));
	}

	/** Alternative version of: {@link #vkCreateSemaphore CreateSemaphore} */
	public static int vkCreateSemaphore(VkDevice device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSemaphore) {
		if ( CHECKS )
			checkBuffer(pSemaphore, 1);
		return nvkCreateSemaphore(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSemaphore));
	}

	// --- [ vkDestroySemaphore ] ---

	/** Unsafe version of {@link #vkDestroySemaphore DestroySemaphore} */
	public static void nvkDestroySemaphore(VkDevice device, long semaphore, long pAllocator) {
		long __functionAddress = getInstance(device).DestroySemaphore;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), semaphore, pAllocator);
	}

	/**
	 * Destroys a semaphore object.
	 *
	 * @param device     
	 * @param semaphore  
	 * @param pAllocator 
	 */
	public static void vkDestroySemaphore(VkDevice device, long semaphore, VkAllocationCallbacks pAllocator) {
		nvkDestroySemaphore(device, semaphore, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateEvent ] ---

	/** Unsafe version of {@link #vkCreateEvent CreateEvent} */
	public static int nvkCreateEvent(VkDevice device, long pCreateInfo, long pAllocator, long pEvent) {
		long __functionAddress = getInstance(device).CreateEvent;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pEvent);
	}

	/**
	 * Creates a new event object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pEvent      
	 */
	public static int vkCreateEvent(VkDevice device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pEvent) {
		if ( CHECKS )
			checkBuffer(pEvent, 1 << 3);
		return nvkCreateEvent(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pEvent));
	}

	/** Alternative version of: {@link #vkCreateEvent CreateEvent} */
	public static int vkCreateEvent(VkDevice device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pEvent) {
		if ( CHECKS )
			checkBuffer(pEvent, 1);
		return nvkCreateEvent(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pEvent));
	}

	// --- [ vkDestroyEvent ] ---

	/** Unsafe version of {@link #vkDestroyEvent DestroyEvent} */
	public static void nvkDestroyEvent(VkDevice device, long event, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyEvent;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), event, pAllocator);
	}

	/**
	 * Destroys an event object.
	 *
	 * @param device     
	 * @param event      
	 * @param pAllocator 
	 */
	public static void vkDestroyEvent(VkDevice device, long event, VkAllocationCallbacks pAllocator) {
		nvkDestroyEvent(device, event, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetEventStatus ] ---

	/**
	 * Retrieves the status of an event object.
	 *
	 * @param device 
	 * @param event  
	 */
	public static int vkGetEventStatus(VkDevice device, long event) {
		long __functionAddress = getInstance(device).GetEventStatus;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJI(__functionAddress, device.address(), event);
	}

	// --- [ vkSetEvent ] ---

	/**
	 * Sets an event to signaled state.
	 *
	 * @param device 
	 * @param event  
	 */
	public static int vkSetEvent(VkDevice device, long event) {
		long __functionAddress = getInstance(device).SetEvent;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJI(__functionAddress, device.address(), event);
	}

	// --- [ vkResetEvent ] ---

	/**
	 * Resets an event to non-signaled state.
	 *
	 * @param device 
	 * @param event  
	 */
	public static int vkResetEvent(VkDevice device, long event) {
		long __functionAddress = getInstance(device).ResetEvent;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJI(__functionAddress, device.address(), event);
	}

	// --- [ vkCreateQueryPool ] ---

	/** Unsafe version of {@link #vkCreateQueryPool CreateQueryPool} */
	public static int nvkCreateQueryPool(VkDevice device, long pCreateInfo, long pAllocator, long pQueryPool) {
		long __functionAddress = getInstance(device).CreateQueryPool;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pQueryPool);
	}

	/**
	 * Creates a new query pool object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pQueryPool  
	 */
	public static int vkCreateQueryPool(VkDevice device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pQueryPool) {
		if ( CHECKS )
			checkBuffer(pQueryPool, 1 << 3);
		return nvkCreateQueryPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pQueryPool));
	}

	/** Alternative version of: {@link #vkCreateQueryPool CreateQueryPool} */
	public static int vkCreateQueryPool(VkDevice device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pQueryPool) {
		if ( CHECKS )
			checkBuffer(pQueryPool, 1);
		return nvkCreateQueryPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pQueryPool));
	}

	// --- [ vkDestroyQueryPool ] ---

	/** Unsafe version of {@link #vkDestroyQueryPool DestroyQueryPool} */
	public static void nvkDestroyQueryPool(VkDevice device, long queryPool, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyQueryPool;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), queryPool, pAllocator);
	}

	/**
	 * Destroys a query pool object.
	 *
	 * @param device     
	 * @param queryPool  
	 * @param pAllocator 
	 */
	public static void vkDestroyQueryPool(VkDevice device, long queryPool, VkAllocationCallbacks pAllocator) {
		nvkDestroyQueryPool(device, queryPool, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetQueryPoolResults ] ---

	/** Unsafe version of {@link #vkGetQueryPoolResults GetQueryPoolResults} */
	public static int nvkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, long dataSize, long pData, long stride, int flags) {
		long __functionAddress = getInstance(device).GetQueryPoolResults;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJIIPPJII(__functionAddress, device.address(), queryPool, firstQuery, queryCount, dataSize, pData, stride, flags);
	}

	/**
	 * Copies results of queries in a query pool to a host memory region.
	 *
	 * @param device     
	 * @param queryPool  
	 * @param firstQuery 
	 * @param queryCount 
	 * @param dataSize   
	 * @param pData      
	 * @param stride     
	 * @param flags      
	 */
	public static int vkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, long dataSize, ByteBuffer pData, long stride, int flags) {
		if ( CHECKS )
			checkBuffer(pData, dataSize);
		return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, dataSize, memAddress(pData), stride, flags);
	}

	/** Alternative version of: {@link #vkGetQueryPoolResults GetQueryPoolResults} */
	public static int vkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, ByteBuffer pData, long stride, int flags) {
		return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, pData.remaining(), memAddress(pData), stride, flags);
	}

	// --- [ vkCreateBuffer ] ---

	/** Unsafe version of {@link #vkCreateBuffer CreateBuffer} */
	public static int nvkCreateBuffer(VkDevice device, long pCreateInfo, long pAllocator, long pBuffer) {
		long __functionAddress = getInstance(device).CreateBuffer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkBufferCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pBuffer);
	}

	/**
	 * Creates a new buffer object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pBuffer     
	 */
	public static int vkCreateBuffer(VkDevice device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pBuffer) {
		if ( CHECKS )
			checkBuffer(pBuffer, 1 << 3);
		return nvkCreateBuffer(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pBuffer));
	}

	/** Alternative version of: {@link #vkCreateBuffer CreateBuffer} */
	public static int vkCreateBuffer(VkDevice device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pBuffer) {
		if ( CHECKS )
			checkBuffer(pBuffer, 1);
		return nvkCreateBuffer(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pBuffer));
	}

	// --- [ vkDestroyBuffer ] ---

	/** Unsafe version of {@link #vkDestroyBuffer DestroyBuffer} */
	public static void nvkDestroyBuffer(VkDevice device, long buffer, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyBuffer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), buffer, pAllocator);
	}

	/**
	 * Destroys a buffer object.
	 *
	 * @param device     
	 * @param buffer     
	 * @param pAllocator 
	 */
	public static void vkDestroyBuffer(VkDevice device, long buffer, VkAllocationCallbacks pAllocator) {
		nvkDestroyBuffer(device, buffer, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateBufferView ] ---

	/** Unsafe version of {@link #vkCreateBufferView CreateBufferView} */
	public static int nvkCreateBufferView(VkDevice device, long pCreateInfo, long pAllocator, long pView) {
		long __functionAddress = getInstance(device).CreateBufferView;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pView);
	}

	/**
	 * Creates a new buffer view object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pView       
	 */
	public static int vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pView) {
		if ( CHECKS )
			checkBuffer(pView, 1 << 3);
		return nvkCreateBufferView(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pView));
	}

	/** Alternative version of: {@link #vkCreateBufferView CreateBufferView} */
	public static int vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pView) {
		if ( CHECKS )
			checkBuffer(pView, 1);
		return nvkCreateBufferView(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pView));
	}

	// --- [ vkDestroyBufferView ] ---

	/** Unsafe version of {@link #vkDestroyBufferView DestroyBufferView} */
	public static void nvkDestroyBufferView(VkDevice device, long bufferView, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyBufferView;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), bufferView, pAllocator);
	}

	/**
	 * Destroys a buffer view object.
	 *
	 * @param device     
	 * @param bufferView 
	 * @param pAllocator 
	 */
	public static void vkDestroyBufferView(VkDevice device, long bufferView, VkAllocationCallbacks pAllocator) {
		nvkDestroyBufferView(device, bufferView, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateImage ] ---

	/** Unsafe version of {@link #vkCreateImage CreateImage} */
	public static int nvkCreateImage(VkDevice device, long pCreateInfo, long pAllocator, long pImage) {
		long __functionAddress = getInstance(device).CreateImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkImageCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pImage);
	}

	/**
	 * Creates a new image object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pImage      
	 */
	public static int vkCreateImage(VkDevice device, VkImageCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pImage) {
		if ( CHECKS )
			checkBuffer(pImage, 1 << 3);
		return nvkCreateImage(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pImage));
	}

	/** Alternative version of: {@link #vkCreateImage CreateImage} */
	public static int vkCreateImage(VkDevice device, VkImageCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pImage) {
		if ( CHECKS )
			checkBuffer(pImage, 1);
		return nvkCreateImage(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pImage));
	}

	// --- [ vkDestroyImage ] ---

	/** Unsafe version of {@link #vkDestroyImage DestroyImage} */
	public static void nvkDestroyImage(VkDevice device, long image, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), image, pAllocator);
	}

	/**
	 * Destroys an image object.
	 *
	 * @param device     
	 * @param image      
	 * @param pAllocator 
	 */
	public static void vkDestroyImage(VkDevice device, long image, VkAllocationCallbacks pAllocator) {
		nvkDestroyImage(device, image, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetImageSubresourceLayout ] ---

	/** Unsafe version of {@link #vkGetImageSubresourceLayout GetImageSubresourceLayout} */
	public static void nvkGetImageSubresourceLayout(VkDevice device, long image, long pSubresource, long pLayout) {
		long __functionAddress = getInstance(device).GetImageSubresourceLayout;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJPPV(__functionAddress, device.address(), image, pSubresource, pLayout);
	}

	/**
	 * Retrieves information about an image subresource.
	 *
	 * @param device       
	 * @param image        
	 * @param pSubresource 
	 * @param pLayout      
	 */
	public static void vkGetImageSubresourceLayout(VkDevice device, long image, VkImageSubresource pSubresource, VkSubresourceLayout pLayout) {
		nvkGetImageSubresourceLayout(device, image, pSubresource.address(), pLayout.address());
	}

	// --- [ vkCreateImageView ] ---

	/** Unsafe version of {@link #vkCreateImageView CreateImageView} */
	public static int nvkCreateImageView(VkDevice device, long pCreateInfo, long pAllocator, long pView) {
		long __functionAddress = getInstance(device).CreateImageView;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pView);
	}

	/**
	 * Creates an image view from an existing image.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pView       
	 */
	public static int vkCreateImageView(VkDevice device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pView) {
		if ( CHECKS )
			checkBuffer(pView, 1 << 3);
		return nvkCreateImageView(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pView));
	}

	/** Alternative version of: {@link #vkCreateImageView CreateImageView} */
	public static int vkCreateImageView(VkDevice device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pView) {
		if ( CHECKS )
			checkBuffer(pView, 1);
		return nvkCreateImageView(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pView));
	}

	// --- [ vkDestroyImageView ] ---

	/** Unsafe version of {@link #vkDestroyImageView DestroyImageView} */
	public static void nvkDestroyImageView(VkDevice device, long imageView, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyImageView;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), imageView, pAllocator);
	}

	/**
	 * Destroys an image view object.
	 *
	 * @param device     
	 * @param imageView  
	 * @param pAllocator 
	 */
	public static void vkDestroyImageView(VkDevice device, long imageView, VkAllocationCallbacks pAllocator) {
		nvkDestroyImageView(device, imageView, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateShaderModule ] ---

	/** Unsafe version of {@link #vkCreateShaderModule CreateShaderModule} */
	public static int nvkCreateShaderModule(VkDevice device, long pCreateInfo, long pAllocator, long pShaderModule) {
		long __functionAddress = getInstance(device).CreateShaderModule;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkShaderModuleCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pShaderModule);
	}

	/**
	 * Creates a new shader module object.
	 *
	 * @param device        
	 * @param pCreateInfo   
	 * @param pAllocator    
	 * @param pShaderModule 
	 */
	public static int vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pShaderModule) {
		if ( CHECKS )
			checkBuffer(pShaderModule, 1 << 3);
		return nvkCreateShaderModule(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pShaderModule));
	}

	/** Alternative version of: {@link #vkCreateShaderModule CreateShaderModule} */
	public static int vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pShaderModule) {
		if ( CHECKS )
			checkBuffer(pShaderModule, 1);
		return nvkCreateShaderModule(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pShaderModule));
	}

	// --- [ vkDestroyShaderModule ] ---

	/** Unsafe version of {@link #vkDestroyShaderModule DestroyShaderModule} */
	public static void nvkDestroyShaderModule(VkDevice device, long shaderModule, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyShaderModule;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), shaderModule, pAllocator);
	}

	/**
	 * Destroys a shader module module.
	 *
	 * @param device       
	 * @param shaderModule 
	 * @param pAllocator   
	 */
	public static void vkDestroyShaderModule(VkDevice device, long shaderModule, VkAllocationCallbacks pAllocator) {
		nvkDestroyShaderModule(device, shaderModule, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreatePipelineCache ] ---

	/** Unsafe version of {@link #vkCreatePipelineCache CreatePipelineCache} */
	public static int nvkCreatePipelineCache(VkDevice device, long pCreateInfo, long pAllocator, long pPipelineCache) {
		long __functionAddress = getInstance(device).CreatePipelineCache;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkPipelineCacheCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pPipelineCache);
	}

	/**
	 * Creates a new pipeline cache.
	 *
	 * @param device         
	 * @param pCreateInfo    
	 * @param pAllocator     
	 * @param pPipelineCache 
	 */
	public static int vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pPipelineCache) {
		if ( CHECKS )
			checkBuffer(pPipelineCache, 1 << 3);
		return nvkCreatePipelineCache(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelineCache));
	}

	/** Alternative version of: {@link #vkCreatePipelineCache CreatePipelineCache} */
	public static int vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pPipelineCache) {
		if ( CHECKS )
			checkBuffer(pPipelineCache, 1);
		return nvkCreatePipelineCache(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelineCache));
	}

	// --- [ vkDestroyPipelineCache ] ---

	/** Unsafe version of {@link #vkDestroyPipelineCache DestroyPipelineCache} */
	public static void nvkDestroyPipelineCache(VkDevice device, long pipelineCache, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyPipelineCache;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), pipelineCache, pAllocator);
	}

	/**
	 * Destroys a pipeline cache object.
	 *
	 * @param device        
	 * @param pipelineCache 
	 * @param pAllocator    
	 */
	public static void vkDestroyPipelineCache(VkDevice device, long pipelineCache, VkAllocationCallbacks pAllocator) {
		nvkDestroyPipelineCache(device, pipelineCache, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetPipelineCacheData ] ---

	/** Unsafe version of {@link #vkGetPipelineCacheData GetPipelineCacheData} */
	public static int nvkGetPipelineCacheData(VkDevice device, long pipelineCache, long pDataSize, long pData) {
		long __functionAddress = getInstance(device).GetPipelineCacheData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJPPI(__functionAddress, device.address(), pipelineCache, pDataSize, pData);
	}

	/**
	 * Gets the data store from a pipeline cache.
	 *
	 * @param device        
	 * @param pipelineCache 
	 * @param pDataSize     
	 * @param pData         
	 */
	public static int vkGetPipelineCacheData(VkDevice device, long pipelineCache, ByteBuffer pDataSize, ByteBuffer pData) {
		if ( CHECKS ) {
			checkBuffer(pDataSize, 1 << POINTER_SHIFT);
			if ( pData != null ) checkBuffer(pData, PointerBuffer.get(pDataSize, pDataSize.position()));
		}
		return nvkGetPipelineCacheData(device, pipelineCache, memAddress(pDataSize), memAddressSafe(pData));
	}

	/** Alternative version of: {@link #vkGetPipelineCacheData GetPipelineCacheData} */
	public static int vkGetPipelineCacheData(VkDevice device, long pipelineCache, PointerBuffer pDataSize, ByteBuffer pData) {
		if ( CHECKS ) {
			checkBuffer(pDataSize, 1);
			if ( pData != null ) checkBuffer(pData, pDataSize.get(pDataSize.position()));
		}
		return nvkGetPipelineCacheData(device, pipelineCache, memAddress(pDataSize), memAddressSafe(pData));
	}

	// --- [ vkMergePipelineCaches ] ---

	/** Unsafe version of {@link #vkMergePipelineCaches MergePipelineCaches} */
	public static int nvkMergePipelineCaches(VkDevice device, long dstCache, int srcCacheCount, long pSrcCaches) {
		long __functionAddress = getInstance(device).MergePipelineCaches;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJIPI(__functionAddress, device.address(), dstCache, srcCacheCount, pSrcCaches);
	}

	/**
	 * Combines the data stores of pipeline caches.
	 *
	 * @param device        
	 * @param dstCache      
	 * @param srcCacheCount 
	 * @param pSrcCaches    
	 */
	public static int vkMergePipelineCaches(VkDevice device, long dstCache, int srcCacheCount, ByteBuffer pSrcCaches) {
		if ( CHECKS )
			checkBuffer(pSrcCaches, srcCacheCount << 3);
		return nvkMergePipelineCaches(device, dstCache, srcCacheCount, memAddress(pSrcCaches));
	}

	/** Alternative version of: {@link #vkMergePipelineCaches MergePipelineCaches} */
	public static int vkMergePipelineCaches(VkDevice device, long dstCache, LongBuffer pSrcCaches) {
		return nvkMergePipelineCaches(device, dstCache, pSrcCaches.remaining(), memAddress(pSrcCaches));
	}

	// --- [ vkCreateGraphicsPipelines ] ---

	/** Unsafe version of {@link #vkCreateGraphicsPipelines CreateGraphicsPipelines} */
	public static int nvkCreateGraphicsPipelines(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
		long __functionAddress = getInstance(device).CreateGraphicsPipelines;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkGraphicsPipelineCreateInfo.validate(pCreateInfos, createInfoCount);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPJIPPPI(__functionAddress, device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);
	}

	/**
	 * Creates graphics pipelines.
	 *
	 * @param device          
	 * @param pipelineCache   
	 * @param createInfoCount 
	 * @param pCreateInfos    
	 * @param pAllocator      
	 * @param pPipelines      
	 */
	public static int vkCreateGraphicsPipelines(VkDevice device, long pipelineCache, int createInfoCount, VkGraphicsPipelineCreateInfo.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, ByteBuffer pPipelines) {
		if ( CHECKS ) {
			checkBuffer(pCreateInfos, createInfoCount);
			checkBuffer(pPipelines, createInfoCount << 3);
		}
		return nvkCreateGraphicsPipelines(device, pipelineCache, createInfoCount, pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelines));
	}

	/** Alternative version of: {@link #vkCreateGraphicsPipelines CreateGraphicsPipelines} */
	public static int vkCreateGraphicsPipelines(VkDevice device, long pipelineCache, VkGraphicsPipelineCreateInfo.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, LongBuffer pPipelines) {
		if ( CHECKS )
			checkBuffer(pPipelines, pCreateInfos.remaining());
		return nvkCreateGraphicsPipelines(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelines));
	}

	// --- [ vkCreateComputePipelines ] ---

	/** Unsafe version of {@link #vkCreateComputePipelines CreateComputePipelines} */
	public static int nvkCreateComputePipelines(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
		long __functionAddress = getInstance(device).CreateComputePipelines;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkComputePipelineCreateInfo.validate(pCreateInfos);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPJIPPPI(__functionAddress, device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);
	}

	/**
	 * Creates a new compute pipeline object.
	 *
	 * @param device          
	 * @param pipelineCache   
	 * @param createInfoCount 
	 * @param pCreateInfos    
	 * @param pAllocator      
	 * @param pPipelines      
	 */
	public static int vkCreateComputePipelines(VkDevice device, long pipelineCache, int createInfoCount, VkComputePipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, ByteBuffer pPipelines) {
		if ( CHECKS )
			checkBuffer(pPipelines, 1 << 3);
		return nvkCreateComputePipelines(device, pipelineCache, createInfoCount, pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelines));
	}

	/** Alternative version of: {@link #vkCreateComputePipelines CreateComputePipelines} */
	public static int vkCreateComputePipelines(VkDevice device, long pipelineCache, int createInfoCount, VkComputePipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, LongBuffer pPipelines) {
		if ( CHECKS )
			checkBuffer(pPipelines, 1);
		return nvkCreateComputePipelines(device, pipelineCache, createInfoCount, pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelines));
	}

	// --- [ vkDestroyPipeline ] ---

	/** Unsafe version of {@link #vkDestroyPipeline DestroyPipeline} */
	public static void nvkDestroyPipeline(VkDevice device, long pipeline, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyPipeline;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), pipeline, pAllocator);
	}

	/**
	 * Destroys a pipeline object.
	 *
	 * @param device     
	 * @param pipeline   
	 * @param pAllocator 
	 */
	public static void vkDestroyPipeline(VkDevice device, long pipeline, VkAllocationCallbacks pAllocator) {
		nvkDestroyPipeline(device, pipeline, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreatePipelineLayout ] ---

	/** Unsafe version of {@link #vkCreatePipelineLayout CreatePipelineLayout} */
	public static int nvkCreatePipelineLayout(VkDevice device, long pCreateInfo, long pAllocator, long pPipelineLayout) {
		long __functionAddress = getInstance(device).CreatePipelineLayout;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkPipelineLayoutCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pPipelineLayout);
	}

	/**
	 * Creates a new pipeline layout object.
	 *
	 * @param device          
	 * @param pCreateInfo     
	 * @param pAllocator      
	 * @param pPipelineLayout 
	 */
	public static int vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pPipelineLayout) {
		if ( CHECKS )
			checkBuffer(pPipelineLayout, 1 << 3);
		return nvkCreatePipelineLayout(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelineLayout));
	}

	/** Alternative version of: {@link #vkCreatePipelineLayout CreatePipelineLayout} */
	public static int vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pPipelineLayout) {
		if ( CHECKS )
			checkBuffer(pPipelineLayout, 1);
		return nvkCreatePipelineLayout(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelineLayout));
	}

	// --- [ vkDestroyPipelineLayout ] ---

	/** Unsafe version of {@link #vkDestroyPipelineLayout DestroyPipelineLayout} */
	public static void nvkDestroyPipelineLayout(VkDevice device, long pipelineLayout, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyPipelineLayout;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), pipelineLayout, pAllocator);
	}

	/**
	 * Destroys a pipeline layout object.
	 *
	 * @param device         
	 * @param pipelineLayout 
	 * @param pAllocator     
	 */
	public static void vkDestroyPipelineLayout(VkDevice device, long pipelineLayout, VkAllocationCallbacks pAllocator) {
		nvkDestroyPipelineLayout(device, pipelineLayout, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateSampler ] ---

	/** Unsafe version of {@link #vkCreateSampler CreateSampler} */
	public static int nvkCreateSampler(VkDevice device, long pCreateInfo, long pAllocator, long pSampler) {
		long __functionAddress = getInstance(device).CreateSampler;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pSampler);
	}

	/**
	 * Creates a new sampler object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pSampler    
	 */
	public static int vkCreateSampler(VkDevice device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pSampler) {
		if ( CHECKS )
			checkBuffer(pSampler, 1 << 3);
		return nvkCreateSampler(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSampler));
	}

	/** Alternative version of: {@link #vkCreateSampler CreateSampler} */
	public static int vkCreateSampler(VkDevice device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSampler) {
		if ( CHECKS )
			checkBuffer(pSampler, 1);
		return nvkCreateSampler(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSampler));
	}

	// --- [ vkDestroySampler ] ---

	/** Unsafe version of {@link #vkDestroySampler DestroySampler} */
	public static void nvkDestroySampler(VkDevice device, long sampler, long pAllocator) {
		long __functionAddress = getInstance(device).DestroySampler;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), sampler, pAllocator);
	}

	/**
	 * Destroys a sampler object.
	 *
	 * @param device     
	 * @param sampler    
	 * @param pAllocator 
	 */
	public static void vkDestroySampler(VkDevice device, long sampler, VkAllocationCallbacks pAllocator) {
		nvkDestroySampler(device, sampler, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateDescriptorSetLayout ] ---

	/** Unsafe version of {@link #vkCreateDescriptorSetLayout CreateDescriptorSetLayout} */
	public static int nvkCreateDescriptorSetLayout(VkDevice device, long pCreateInfo, long pAllocator, long pSetLayout) {
		long __functionAddress = getInstance(device).CreateDescriptorSetLayout;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pSetLayout);
	}

	/**
	 * Creates a new descriptor set layout.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pSetLayout  
	 */
	public static int vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pSetLayout) {
		if ( CHECKS )
			checkBuffer(pSetLayout, 1 << 3);
		return nvkCreateDescriptorSetLayout(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSetLayout));
	}

	/** Alternative version of: {@link #vkCreateDescriptorSetLayout CreateDescriptorSetLayout} */
	public static int vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSetLayout) {
		if ( CHECKS )
			checkBuffer(pSetLayout, 1);
		return nvkCreateDescriptorSetLayout(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSetLayout));
	}

	// --- [ vkDestroyDescriptorSetLayout ] ---

	/** Unsafe version of {@link #vkDestroyDescriptorSetLayout DestroyDescriptorSetLayout} */
	public static void nvkDestroyDescriptorSetLayout(VkDevice device, long descriptorSetLayout, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyDescriptorSetLayout;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), descriptorSetLayout, pAllocator);
	}

	/**
	 * Destroys a descriptor set layout object.
	 *
	 * @param device              
	 * @param descriptorSetLayout 
	 * @param pAllocator          
	 */
	public static void vkDestroyDescriptorSetLayout(VkDevice device, long descriptorSetLayout, VkAllocationCallbacks pAllocator) {
		nvkDestroyDescriptorSetLayout(device, descriptorSetLayout, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateDescriptorPool ] ---

	/** Unsafe version of {@link #vkCreateDescriptorPool CreateDescriptorPool} */
	public static int nvkCreateDescriptorPool(VkDevice device, long pCreateInfo, long pAllocator, long pDescriptorPool) {
		long __functionAddress = getInstance(device).CreateDescriptorPool;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkDescriptorPoolCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pDescriptorPool);
	}

	/**
	 * Creates a descriptor pool object.
	 *
	 * @param device          
	 * @param pCreateInfo     
	 * @param pAllocator      
	 * @param pDescriptorPool 
	 */
	public static int vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pDescriptorPool) {
		if ( CHECKS )
			checkBuffer(pDescriptorPool, 1 << 3);
		return nvkCreateDescriptorPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pDescriptorPool));
	}

	/** Alternative version of: {@link #vkCreateDescriptorPool CreateDescriptorPool} */
	public static int vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pDescriptorPool) {
		if ( CHECKS )
			checkBuffer(pDescriptorPool, 1);
		return nvkCreateDescriptorPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pDescriptorPool));
	}

	// --- [ vkDestroyDescriptorPool ] ---

	/** Unsafe version of {@link #vkDestroyDescriptorPool DestroyDescriptorPool} */
	public static void nvkDestroyDescriptorPool(VkDevice device, long descriptorPool, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyDescriptorPool;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), descriptorPool, pAllocator);
	}

	/**
	 * Destroys a descriptor pool object.
	 *
	 * @param device         
	 * @param descriptorPool 
	 * @param pAllocator     
	 */
	public static void vkDestroyDescriptorPool(VkDevice device, long descriptorPool, VkAllocationCallbacks pAllocator) {
		nvkDestroyDescriptorPool(device, descriptorPool, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkResetDescriptorPool ] ---

	/**
	 * Resets a descriptor pool object.
	 *
	 * @param device         
	 * @param descriptorPool 
	 * @param flags          
	 */
	public static int vkResetDescriptorPool(VkDevice device, long descriptorPool, int flags) {
		long __functionAddress = getInstance(device).ResetDescriptorPool;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJII(__functionAddress, device.address(), descriptorPool, flags);
	}

	// --- [ vkAllocateDescriptorSets ] ---

	/** Unsafe version of {@link #vkAllocateDescriptorSets AllocateDescriptorSets} */
	public static int nvkAllocateDescriptorSets(VkDevice device, long pAllocateInfo, long pDescriptorSets) {
		long __functionAddress = getInstance(device).AllocateDescriptorSets;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkDescriptorSetAllocateInfo.validate(pAllocateInfo);
		}
		return callPPPI(__functionAddress, device.address(), pAllocateInfo, pDescriptorSets);
	}

	public static int vkAllocateDescriptorSets(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, ByteBuffer pDescriptorSets) {
		if ( CHECKS )
			checkBuffer(pDescriptorSets, 1 << 3);
		return nvkAllocateDescriptorSets(device, pAllocateInfo.address(), memAddress(pDescriptorSets));
	}

	/** Alternative version of: {@link #vkAllocateDescriptorSets AllocateDescriptorSets} */
	public static int vkAllocateDescriptorSets(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, LongBuffer pDescriptorSets) {
		if ( CHECKS )
			checkBuffer(pDescriptorSets, 1);
		return nvkAllocateDescriptorSets(device, pAllocateInfo.address(), memAddress(pDescriptorSets));
	}

	// --- [ vkFreeDescriptorSets ] ---

	/** Unsafe version of {@link #vkFreeDescriptorSets FreeDescriptorSets} */
	public static int nvkFreeDescriptorSets(VkDevice device, long descriptorPool, int descriptorSetCount, long pDescriptorSets) {
		long __functionAddress = getInstance(device).FreeDescriptorSets;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJIPI(__functionAddress, device.address(), descriptorPool, descriptorSetCount, pDescriptorSets);
	}

	/**
	 * Frees one or more descriptor sets.
	 *
	 * @param device             
	 * @param descriptorPool     
	 * @param descriptorSetCount 
	 * @param pDescriptorSets    
	 */
	public static int vkFreeDescriptorSets(VkDevice device, long descriptorPool, int descriptorSetCount, ByteBuffer pDescriptorSets) {
		if ( CHECKS )
			checkBuffer(pDescriptorSets, descriptorSetCount << 3);
		return nvkFreeDescriptorSets(device, descriptorPool, descriptorSetCount, memAddress(pDescriptorSets));
	}

	/** Alternative version of: {@link #vkFreeDescriptorSets FreeDescriptorSets} */
	public static int vkFreeDescriptorSets(VkDevice device, long descriptorPool, LongBuffer pDescriptorSets) {
		return nvkFreeDescriptorSets(device, descriptorPool, pDescriptorSets.remaining(), memAddress(pDescriptorSets));
	}

	/** Single value version of: {@link #vkFreeDescriptorSets FreeDescriptorSets} */
	public static int vkFreeDescriptorSets(VkDevice device, long descriptorPool, long pDescriptorSet) {
		APIBuffer __buffer = apiBuffer();
		int pDescriptorSets = __buffer.longParam(pDescriptorSet);
		return nvkFreeDescriptorSets(device, descriptorPool, 1, __buffer.address(pDescriptorSets));
	}

	// --- [ vkUpdateDescriptorSets ] ---

	/** Unsafe version of {@link #vkUpdateDescriptorSets UpdateDescriptorSets} */
	public static void nvkUpdateDescriptorSets(VkDevice device, int descriptorWriteCount, long pDescriptorWrites, int descriptorCopyCount, long pDescriptorCopies) {
		long __functionAddress = getInstance(device).UpdateDescriptorSets;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pDescriptorWrites != NULL ) VkWriteDescriptorSet.validate(pDescriptorWrites, descriptorWriteCount);
		}
		callPIPIPV(__functionAddress, device.address(), descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies);
	}

	/**
	 * Updates the contents of a descriptor set object.
	 *
	 * @param device               
	 * @param descriptorWriteCount 
	 * @param pDescriptorWrites    
	 * @param descriptorCopyCount  
	 * @param pDescriptorCopies    
	 */
	public static void vkUpdateDescriptorSets(VkDevice device, int descriptorWriteCount, VkWriteDescriptorSet.Buffer pDescriptorWrites, int descriptorCopyCount, VkCopyDescriptorSet.Buffer pDescriptorCopies) {
		if ( CHECKS ) {
			if ( pDescriptorWrites != null ) checkBuffer(pDescriptorWrites, descriptorWriteCount);
			if ( pDescriptorCopies != null ) checkBuffer(pDescriptorCopies, descriptorCopyCount);
		}
		nvkUpdateDescriptorSets(device, descriptorWriteCount, pDescriptorWrites == null ? NULL : pDescriptorWrites.address(), descriptorCopyCount, pDescriptorCopies == null ? NULL : pDescriptorCopies.address());
	}

	/** Alternative version of: {@link #vkUpdateDescriptorSets UpdateDescriptorSets} */
	public static void vkUpdateDescriptorSets(VkDevice device, VkWriteDescriptorSet.Buffer pDescriptorWrites, VkCopyDescriptorSet.Buffer pDescriptorCopies) {
		nvkUpdateDescriptorSets(device, pDescriptorWrites == null ? 0 : pDescriptorWrites.remaining(), pDescriptorWrites == null ? NULL : pDescriptorWrites.address(), pDescriptorCopies == null ? 0 : pDescriptorCopies.remaining(), pDescriptorCopies == null ? NULL : pDescriptorCopies.address());
	}

	// --- [ vkCreateFramebuffer ] ---

	/** Unsafe version of {@link #vkCreateFramebuffer CreateFramebuffer} */
	public static int nvkCreateFramebuffer(VkDevice device, long pCreateInfo, long pAllocator, long pFramebuffer) {
		long __functionAddress = getInstance(device).CreateFramebuffer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkFramebufferCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pFramebuffer);
	}

	/**
	 * Create a new framebuffer object.
	 *
	 * @param device       
	 * @param pCreateInfo  
	 * @param pAllocator   
	 * @param pFramebuffer 
	 */
	public static int vkCreateFramebuffer(VkDevice device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pFramebuffer) {
		if ( CHECKS )
			checkBuffer(pFramebuffer, 1 << 3);
		return nvkCreateFramebuffer(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pFramebuffer));
	}

	/** Alternative version of: {@link #vkCreateFramebuffer CreateFramebuffer} */
	public static int vkCreateFramebuffer(VkDevice device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pFramebuffer) {
		if ( CHECKS )
			checkBuffer(pFramebuffer, 1);
		return nvkCreateFramebuffer(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pFramebuffer));
	}

	// --- [ vkDestroyFramebuffer ] ---

	/** Unsafe version of {@link #vkDestroyFramebuffer DestroyFramebuffer} */
	public static void nvkDestroyFramebuffer(VkDevice device, long framebuffer, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyFramebuffer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), framebuffer, pAllocator);
	}

	/**
	 * Destroys a framebuffer object.
	 *
	 * @param device      
	 * @param framebuffer 
	 * @param pAllocator  
	 */
	public static void vkDestroyFramebuffer(VkDevice device, long framebuffer, VkAllocationCallbacks pAllocator) {
		nvkDestroyFramebuffer(device, framebuffer, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateRenderPass ] ---

	/** Unsafe version of {@link #vkCreateRenderPass CreateRenderPass} */
	public static int nvkCreateRenderPass(VkDevice device, long pCreateInfo, long pAllocator, long pRenderPass) {
		long __functionAddress = getInstance(device).CreateRenderPass;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkRenderPassCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pRenderPass);
	}

	/**
	 * Creates a new render pass object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pRenderPass 
	 */
	public static int vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pRenderPass) {
		if ( CHECKS )
			checkBuffer(pRenderPass, 1 << 3);
		return nvkCreateRenderPass(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pRenderPass));
	}

	/** Alternative version of: {@link #vkCreateRenderPass CreateRenderPass} */
	public static int vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pRenderPass) {
		if ( CHECKS )
			checkBuffer(pRenderPass, 1);
		return nvkCreateRenderPass(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pRenderPass));
	}

	// --- [ vkDestroyRenderPass ] ---

	/** Unsafe version of {@link #vkDestroyRenderPass DestroyRenderPass} */
	public static void nvkDestroyRenderPass(VkDevice device, long renderPass, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyRenderPass;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), renderPass, pAllocator);
	}

	/**
	 * Destroys a render pass object.
	 *
	 * @param device     
	 * @param renderPass 
	 * @param pAllocator 
	 */
	public static void vkDestroyRenderPass(VkDevice device, long renderPass, VkAllocationCallbacks pAllocator) {
		nvkDestroyRenderPass(device, renderPass, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetRenderAreaGranularity ] ---

	/** Unsafe version of {@link #vkGetRenderAreaGranularity GetRenderAreaGranularity} */
	public static void nvkGetRenderAreaGranularity(VkDevice device, long renderPass, long pGranularity) {
		long __functionAddress = getInstance(device).GetRenderAreaGranularity;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJPV(__functionAddress, device.address(), renderPass, pGranularity);
	}

	/**
	 * Returns the granularity for optimal render area.
	 *
	 * @param device       
	 * @param renderPass   
	 * @param pGranularity 
	 */
	public static void vkGetRenderAreaGranularity(VkDevice device, long renderPass, VkExtent2D pGranularity) {
		nvkGetRenderAreaGranularity(device, renderPass, pGranularity.address());
	}

	// --- [ vkCreateCommandPool ] ---

	/** Unsafe version of {@link #vkCreateCommandPool CreateCommandPool} */
	public static int nvkCreateCommandPool(VkDevice device, long pCreateInfo, long pAllocator, long pCommandPool) {
		long __functionAddress = getInstance(device).CreateCommandPool;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pCommandPool);
	}

	/**
	 * Creates a new command pool object.
	 *
	 * @param device       
	 * @param pCreateInfo  
	 * @param pAllocator   
	 * @param pCommandPool 
	 */
	public static int vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pCommandPool) {
		if ( CHECKS )
			checkBuffer(pCommandPool, 1 << 3);
		return nvkCreateCommandPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pCommandPool));
	}

	/** Alternative version of: {@link #vkCreateCommandPool CreateCommandPool} */
	public static int vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pCommandPool) {
		if ( CHECKS )
			checkBuffer(pCommandPool, 1);
		return nvkCreateCommandPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pCommandPool));
	}

	// --- [ vkDestroyCommandPool ] ---

	/** Unsafe version of {@link #vkDestroyCommandPool DestroyCommandPool} */
	public static void nvkDestroyCommandPool(VkDevice device, long commandPool, long pAllocator) {
		long __functionAddress = getInstance(device).DestroyCommandPool;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), commandPool, pAllocator);
	}

	/**
	 * Destroys a command pool object.
	 *
	 * @param device      
	 * @param commandPool 
	 * @param pAllocator  
	 */
	public static void vkDestroyCommandPool(VkDevice device, long commandPool, VkAllocationCallbacks pAllocator) {
		nvkDestroyCommandPool(device, commandPool, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkResetCommandPool ] ---

	/**
	 * Resets a command pool.
	 *
	 * @param device      
	 * @param commandPool 
	 * @param flags       
	 */
	public static int vkResetCommandPool(VkDevice device, long commandPool, int flags) {
		long __functionAddress = getInstance(device).ResetCommandPool;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJII(__functionAddress, device.address(), commandPool, flags);
	}

	// --- [ vkAllocateCommandBuffers ] ---

	/** Unsafe version of {@link #vkAllocateCommandBuffers AllocateCommandBuffers} */
	public static int nvkAllocateCommandBuffers(VkDevice device, long pAllocateInfo, long pCommandBuffers) {
		long __functionAddress = getInstance(device).AllocateCommandBuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPPI(__functionAddress, device.address(), pAllocateInfo, pCommandBuffers);
	}

	public static int vkAllocateCommandBuffers(VkDevice device, VkCommandBufferAllocateInfo pAllocateInfo, ByteBuffer pCommandBuffers) {
		if ( CHECKS )
			checkBuffer(pCommandBuffers, 1 << POINTER_SHIFT);
		return nvkAllocateCommandBuffers(device, pAllocateInfo.address(), memAddress(pCommandBuffers));
	}

	/** Alternative version of: {@link #vkAllocateCommandBuffers AllocateCommandBuffers} */
	public static int vkAllocateCommandBuffers(VkDevice device, VkCommandBufferAllocateInfo pAllocateInfo, PointerBuffer pCommandBuffers) {
		if ( CHECKS )
			checkBuffer(pCommandBuffers, 1);
		return nvkAllocateCommandBuffers(device, pAllocateInfo.address(), memAddress(pCommandBuffers));
	}

	// --- [ vkFreeCommandBuffers ] ---

	/** Unsafe version of {@link #vkFreeCommandBuffers FreeCommandBuffers} */
	public static void nvkFreeCommandBuffers(VkDevice device, long commandPool, int commandBufferCount, long pCommandBuffers) {
		long __functionAddress = getInstance(device).FreeCommandBuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIPV(__functionAddress, device.address(), commandPool, commandBufferCount, pCommandBuffers);
	}

	/**
	 * Frees command buffers.
	 *
	 * @param device             
	 * @param commandPool        
	 * @param commandBufferCount 
	 * @param pCommandBuffers    
	 */
	public static void vkFreeCommandBuffers(VkDevice device, long commandPool, int commandBufferCount, ByteBuffer pCommandBuffers) {
		if ( CHECKS )
			checkBuffer(pCommandBuffers, commandBufferCount << POINTER_SHIFT);
		nvkFreeCommandBuffers(device, commandPool, commandBufferCount, memAddress(pCommandBuffers));
	}

	/** Alternative version of: {@link #vkFreeCommandBuffers FreeCommandBuffers} */
	public static void vkFreeCommandBuffers(VkDevice device, long commandPool, PointerBuffer pCommandBuffers) {
		nvkFreeCommandBuffers(device, commandPool, pCommandBuffers.remaining(), memAddress(pCommandBuffers));
	}

	/** Single value version of: {@link #vkFreeCommandBuffers FreeCommandBuffers} */
	public static void vkFreeCommandBuffers(VkDevice device, long commandPool, VkCommandBuffer pCommandBuffer) {
		APIBuffer __buffer = apiBuffer();
		int pCommandBuffers = __buffer.pointerParam(pCommandBuffer);
		nvkFreeCommandBuffers(device, commandPool, 1, __buffer.address(pCommandBuffers));
	}

	// --- [ vkBeginCommandBuffer ] ---

	/** Unsafe version of {@link #vkBeginCommandBuffer BeginCommandBuffer} */
	public static int nvkBeginCommandBuffer(VkCommandBuffer commandBuffer, long pBeginInfo) {
		long __functionAddress = getInstance(commandBuffer).BeginCommandBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPI(__functionAddress, commandBuffer.address(), pBeginInfo);
	}

	/**
	 * Starts recording a command buffer.
	 *
	 * @param commandBuffer 
	 * @param pBeginInfo    
	 */
	public static int vkBeginCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo pBeginInfo) {
		return nvkBeginCommandBuffer(commandBuffer, pBeginInfo.address());
	}

	// --- [ vkEndCommandBuffer ] ---

	/**
	 * Finishes recording a command buffer.
	 *
	 * @param commandBuffer 
	 */
	public static int vkEndCommandBuffer(VkCommandBuffer commandBuffer) {
		long __functionAddress = getInstance(commandBuffer).EndCommandBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, commandBuffer.address());
	}

	// --- [ vkResetCommandBuffer ] ---

	/**
	 * Resets a command buffer.
	 *
	 * @param commandBuffer 
	 * @param flags         
	 */
	public static int vkResetCommandBuffer(VkCommandBuffer commandBuffer, int flags) {
		long __functionAddress = getInstance(commandBuffer).ResetCommandBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPII(__functionAddress, commandBuffer.address(), flags);
	}

	// --- [ vkCmdBindPipeline ] ---

	/**
	 * Binds a pipeline object to a command buffer.
	 *
	 * @param commandBuffer     
	 * @param pipelineBindPoint 
	 * @param pipeline          
	 */
	public static void vkCmdBindPipeline(VkCommandBuffer commandBuffer, int pipelineBindPoint, long pipeline) {
		long __functionAddress = getInstance(commandBuffer).CmdBindPipeline;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIJV(__functionAddress, commandBuffer.address(), pipelineBindPoint, pipeline);
	}

	// --- [ vkCmdSetViewport ] ---

	/** Unsafe version of {@link #vkCmdSetViewport CmdSetViewport} */
	public static void nvkCmdSetViewport(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pViewports) {
		long __functionAddress = getInstance(commandBuffer).CmdSetViewport;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIIPV(__functionAddress, commandBuffer.address(), firstViewport, viewportCount, pViewports);
	}

	/**
	 * Sets the viewport on a command buffer.
	 *
	 * @param commandBuffer 
	 * @param firstViewport 
	 * @param viewportCount 
	 * @param pViewports    
	 */
	public static void vkCmdSetViewport(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, VkViewport.Buffer pViewports) {
		if ( CHECKS )
			checkBuffer(pViewports, viewportCount);
		nvkCmdSetViewport(commandBuffer, firstViewport, viewportCount, pViewports.address());
	}

	/** Alternative version of: {@link #vkCmdSetViewport CmdSetViewport} */
	public static void vkCmdSetViewport(VkCommandBuffer commandBuffer, int firstViewport, VkViewport.Buffer pViewports) {
		nvkCmdSetViewport(commandBuffer, firstViewport, pViewports.remaining(), pViewports.address());
	}

	// --- [ vkCmdSetScissor ] ---

	/** Unsafe version of {@link #vkCmdSetScissor CmdSetScissor} */
	public static void nvkCmdSetScissor(VkCommandBuffer commandBuffer, int firstScissor, int scissorCount, long pScissors) {
		long __functionAddress = getInstance(commandBuffer).CmdSetScissor;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIIPV(__functionAddress, commandBuffer.address(), firstScissor, scissorCount, pScissors);
	}

	/**
	 * Set the dynamic scissor rectangles on a command buffer.
	 *
	 * @param commandBuffer 
	 * @param firstScissor  
	 * @param scissorCount  
	 * @param pScissors     
	 */
	public static void vkCmdSetScissor(VkCommandBuffer commandBuffer, int firstScissor, int scissorCount, VkRect2D.Buffer pScissors) {
		if ( CHECKS )
			checkBuffer(pScissors, scissorCount);
		nvkCmdSetScissor(commandBuffer, firstScissor, scissorCount, pScissors.address());
	}

	/** Alternative version of: {@link #vkCmdSetScissor CmdSetScissor} */
	public static void vkCmdSetScissor(VkCommandBuffer commandBuffer, int firstScissor, VkRect2D.Buffer pScissors) {
		nvkCmdSetScissor(commandBuffer, firstScissor, pScissors.remaining(), pScissors.address());
	}

	// --- [ vkCmdSetLineWidth ] ---

	/**
	 * Set the dynamic line width state.
	 *
	 * @param commandBuffer 
	 * @param lineWidth     
	 */
	public static void vkCmdSetLineWidth(VkCommandBuffer commandBuffer, float lineWidth) {
		long __functionAddress = getInstance(commandBuffer).CmdSetLineWidth;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPFV(__functionAddress, commandBuffer.address(), lineWidth);
	}

	// --- [ vkCmdSetDepthBias ] ---

	/**
	 * Sets the depth bias dynamic state.
	 *
	 * @param commandBuffer           
	 * @param depthBiasConstantFactor 
	 * @param depthBiasClamp          
	 * @param depthBiasSlopeFactor    
	 */
	public static void vkCmdSetDepthBias(VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
		long __functionAddress = getInstance(commandBuffer).CmdSetDepthBias;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPFFFV(__functionAddress, commandBuffer.address(), depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor);
	}

	// --- [ vkCmdSetBlendConstants ] ---

	/** Unsafe version of {@link #vkCmdSetBlendConstants CmdSetBlendConstants} */
	public static void nvkCmdSetBlendConstants(VkCommandBuffer commandBuffer, long blendConstants) {
		long __functionAddress = getInstance(commandBuffer).CmdSetBlendConstants;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, commandBuffer.address(), blendConstants);
	}

	/**
	 * Sets the values of blend constants.
	 *
	 * @param commandBuffer  
	 * @param blendConstants 
	 */
	public static void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, ByteBuffer blendConstants) {
		if ( CHECKS )
			checkBuffer(blendConstants, 4 << 2);
		nvkCmdSetBlendConstants(commandBuffer, memAddress(blendConstants));
	}

	/** Alternative version of: {@link #vkCmdSetBlendConstants CmdSetBlendConstants} */
	public static void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, FloatBuffer blendConstants) {
		if ( CHECKS )
			checkBuffer(blendConstants, 4);
		nvkCmdSetBlendConstants(commandBuffer, memAddress(blendConstants));
	}

	// --- [ vkCmdSetDepthBounds ] ---

	/**
	 * Sets the depth bounds test values for a command buffer.
	 *
	 * @param commandBuffer  
	 * @param minDepthBounds 
	 * @param maxDepthBounds 
	 */
	public static void vkCmdSetDepthBounds(VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds) {
		long __functionAddress = getInstance(commandBuffer).CmdSetDepthBounds;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPFFV(__functionAddress, commandBuffer.address(), minDepthBounds, maxDepthBounds);
	}

	// --- [ vkCmdSetStencilCompareMask ] ---

	/**
	 * Sets the stencil compare mask dynamic state.
	 *
	 * @param commandBuffer 
	 * @param faceMask      
	 * @param compareMask   
	 */
	public static void vkCmdSetStencilCompareMask(VkCommandBuffer commandBuffer, int faceMask, int compareMask) {
		long __functionAddress = getInstance(commandBuffer).CmdSetStencilCompareMask;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIIV(__functionAddress, commandBuffer.address(), faceMask, compareMask);
	}

	// --- [ vkCmdSetStencilWriteMask ] ---

	/**
	 * Sets the stencil write mask dynamic state.
	 *
	 * @param commandBuffer 
	 * @param faceMask      
	 * @param writeMask     
	 */
	public static void vkCmdSetStencilWriteMask(VkCommandBuffer commandBuffer, int faceMask, int writeMask) {
		long __functionAddress = getInstance(commandBuffer).CmdSetStencilWriteMask;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIIV(__functionAddress, commandBuffer.address(), faceMask, writeMask);
	}

	// --- [ vkCmdSetStencilReference ] ---

	/**
	 * Sets the stencil reference dynamic state.
	 *
	 * @param commandBuffer 
	 * @param faceMask      
	 * @param reference     
	 */
	public static void vkCmdSetStencilReference(VkCommandBuffer commandBuffer, int faceMask, int reference) {
		long __functionAddress = getInstance(commandBuffer).CmdSetStencilReference;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIIV(__functionAddress, commandBuffer.address(), faceMask, reference);
	}

	// --- [ vkCmdBindDescriptorSets ] ---

	/** Unsafe version of {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets} */
	public static void nvkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, int descriptorSetCount, long pDescriptorSets, int dynamicOffsetCount, long pDynamicOffsets) {
		long __functionAddress = getInstance(commandBuffer).CmdBindDescriptorSets;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIJIIPIPV(__functionAddress, commandBuffer.address(), pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets);
	}

	/**
	 * Binds descriptor sets to a command buffer.
	 *
	 * @param commandBuffer      
	 * @param pipelineBindPoint  
	 * @param layout             
	 * @param firstSet           
	 * @param descriptorSetCount 
	 * @param pDescriptorSets    
	 * @param dynamicOffsetCount 
	 * @param pDynamicOffsets    
	 */
	public static void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, int descriptorSetCount, ByteBuffer pDescriptorSets, int dynamicOffsetCount, ByteBuffer pDynamicOffsets) {
		if ( CHECKS ) {
			checkBuffer(pDescriptorSets, descriptorSetCount << 3);
			if ( pDynamicOffsets != null ) checkBuffer(pDynamicOffsets, dynamicOffsetCount << 2);
		}
		nvkCmdBindDescriptorSets(commandBuffer, pipelineBindPoint, layout, firstSet, descriptorSetCount, memAddress(pDescriptorSets), dynamicOffsetCount, memAddressSafe(pDynamicOffsets));
	}

	/** Alternative version of: {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets} */
	public static void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, LongBuffer pDescriptorSets, IntBuffer pDynamicOffsets) {
		nvkCmdBindDescriptorSets(commandBuffer, pipelineBindPoint, layout, firstSet, pDescriptorSets.remaining(), memAddress(pDescriptorSets), pDynamicOffsets == null ? 0 : pDynamicOffsets.remaining(), memAddressSafe(pDynamicOffsets));
	}

	// --- [ vkCmdBindIndexBuffer ] ---

	/**
	 * Binds an index buffer to a command buffer.
	 *
	 * @param commandBuffer 
	 * @param buffer        
	 * @param offset        
	 * @param indexType     
	 */
	public static void vkCmdBindIndexBuffer(VkCommandBuffer commandBuffer, long buffer, long offset, int indexType) {
		long __functionAddress = getInstance(commandBuffer).CmdBindIndexBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJJIV(__functionAddress, commandBuffer.address(), buffer, offset, indexType);
	}

	// --- [ vkCmdBindVertexBuffers ] ---

	/** Unsafe version of {@link #vkCmdBindVertexBuffers CmdBindVertexBuffers} */
	public static void nvkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets) {
		long __functionAddress = getInstance(commandBuffer).CmdBindVertexBuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIIPPV(__functionAddress, commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets);
	}

	/**
	 * Binds vertex buffers to a command buffer.
	 *
	 * @param commandBuffer 
	 * @param firstBinding  
	 * @param bindingCount  
	 * @param pBuffers      
	 * @param pOffsets      
	 */
	public static void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, ByteBuffer pBuffers, ByteBuffer pOffsets) {
		if ( CHECKS ) {
			checkBuffer(pBuffers, bindingCount << 3);
			checkBuffer(pOffsets, bindingCount << 3);
		}
		nvkCmdBindVertexBuffers(commandBuffer, firstBinding, bindingCount, memAddress(pBuffers), memAddress(pOffsets));
	}

	/** Alternative version of: {@link #vkCmdBindVertexBuffers CmdBindVertexBuffers} */
	public static void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, int firstBinding, LongBuffer pBuffers, LongBuffer pOffsets) {
		if ( CHECKS )
			checkBuffer(pOffsets, pBuffers.remaining());
		nvkCmdBindVertexBuffers(commandBuffer, firstBinding, pBuffers.remaining(), memAddress(pBuffers), memAddress(pOffsets));
	}

	// --- [ vkCmdDraw ] ---

	/**
	 * Draws primitives.
	 *
	 * @param commandBuffer 
	 * @param vertexCount   
	 * @param instanceCount 
	 * @param firstVertex   
	 * @param firstInstance 
	 */
	public static void vkCmdDraw(VkCommandBuffer commandBuffer, int vertexCount, int instanceCount, int firstVertex, int firstInstance) {
		long __functionAddress = getInstance(commandBuffer).CmdDraw;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIIIIV(__functionAddress, commandBuffer.address(), vertexCount, instanceCount, firstVertex, firstInstance);
	}

	// --- [ vkCmdDrawIndexed ] ---

	/**
	 * Issues an indexed draw into a command buffer.
	 *
	 * @param commandBuffer 
	 * @param indexCount    
	 * @param instanceCount 
	 * @param firstIndex    
	 * @param vertexOffset  
	 * @param firstInstance 
	 */
	public static void vkCmdDrawIndexed(VkCommandBuffer commandBuffer, int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance) {
		long __functionAddress = getInstance(commandBuffer).CmdDrawIndexed;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIIIIIV(__functionAddress, commandBuffer.address(), indexCount, instanceCount, firstIndex, vertexOffset, firstInstance);
	}

	// --- [ vkCmdDrawIndirect ] ---

	/**
	 * Issues an indirect draw into a command buffer.
	 *
	 * @param commandBuffer 
	 * @param buffer        
	 * @param offset        
	 * @param drawCount     
	 * @param stride        
	 */
	public static void vkCmdDrawIndirect(VkCommandBuffer commandBuffer, long buffer, long offset, int drawCount, int stride) {
		long __functionAddress = getInstance(commandBuffer).CmdDrawIndirect;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJJIIV(__functionAddress, commandBuffer.address(), buffer, offset, drawCount, stride);
	}

	// --- [ vkCmdDrawIndexedIndirect ] ---

	/**
	 * Performs an indexed indirect draw.
	 *
	 * @param commandBuffer 
	 * @param buffer        
	 * @param offset        
	 * @param drawCount     
	 * @param stride        
	 */
	public static void vkCmdDrawIndexedIndirect(VkCommandBuffer commandBuffer, long buffer, long offset, int drawCount, int stride) {
		long __functionAddress = getInstance(commandBuffer).CmdDrawIndexedIndirect;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJJIIV(__functionAddress, commandBuffer.address(), buffer, offset, drawCount, stride);
	}

	// --- [ vkCmdDispatch ] ---

	/**
	 * Dispatches compute work items.
	 *
	 * @param commandBuffer 
	 * @param x             
	 * @param y             
	 * @param z             
	 */
	public static void vkCmdDispatch(VkCommandBuffer commandBuffer, int x, int y, int z) {
		long __functionAddress = getInstance(commandBuffer).CmdDispatch;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIIIV(__functionAddress, commandBuffer.address(), x, y, z);
	}

	// --- [ vkCmdDispatchIndirect ] ---

	/**
	 * Dispatches compute work items using indirect parameters.
	 *
	 * @param commandBuffer 
	 * @param buffer        
	 * @param offset        
	 */
	public static void vkCmdDispatchIndirect(VkCommandBuffer commandBuffer, long buffer, long offset) {
		long __functionAddress = getInstance(commandBuffer).CmdDispatchIndirect;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJJV(__functionAddress, commandBuffer.address(), buffer, offset);
	}

	// --- [ vkCmdCopyBuffer ] ---

	/** Unsafe version of {@link #vkCmdCopyBuffer CmdCopyBuffer} */
	public static void nvkCmdCopyBuffer(VkCommandBuffer commandBuffer, long srcBuffer, long dstBuffer, int regionCount, long pRegions) {
		long __functionAddress = getInstance(commandBuffer).CmdCopyBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJJIPV(__functionAddress, commandBuffer.address(), srcBuffer, dstBuffer, regionCount, pRegions);
	}

	/**
	 * Copies data between buffer regions.
	 *
	 * @param commandBuffer 
	 * @param srcBuffer     
	 * @param dstBuffer     
	 * @param regionCount   
	 * @param pRegions      
	 */
	public static void vkCmdCopyBuffer(VkCommandBuffer commandBuffer, long srcBuffer, long dstBuffer, int regionCount, VkBufferCopy.Buffer pRegions) {
		if ( CHECKS )
			checkBuffer(pRegions, regionCount);
		nvkCmdCopyBuffer(commandBuffer, srcBuffer, dstBuffer, regionCount, pRegions.address());
	}

	/** Alternative version of: {@link #vkCmdCopyBuffer CmdCopyBuffer} */
	public static void vkCmdCopyBuffer(VkCommandBuffer commandBuffer, long srcBuffer, long dstBuffer, VkBufferCopy.Buffer pRegions) {
		nvkCmdCopyBuffer(commandBuffer, srcBuffer, dstBuffer, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdCopyImage ] ---

	/** Unsafe version of {@link #vkCmdCopyImage CmdCopyImage} */
	public static void nvkCmdCopyImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
		long __functionAddress = getInstance(commandBuffer).CmdCopyImage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIJIIPV(__functionAddress, commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
	}

	/**
	 * Copy data between images.
	 *
	 * @param commandBuffer  
	 * @param srcImage       
	 * @param srcImageLayout 
	 * @param dstImage       
	 * @param dstImageLayout 
	 * @param regionCount    
	 * @param pRegions       
	 */
	public static void vkCmdCopyImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, VkImageCopy.Buffer pRegions) {
		if ( CHECKS )
			checkBuffer(pRegions, regionCount);
		nvkCmdCopyImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions.address());
	}

	/** Alternative version of: {@link #vkCmdCopyImage CmdCopyImage} */
	public static void vkCmdCopyImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageCopy.Buffer pRegions) {
		nvkCmdCopyImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdBlitImage ] ---

	/** Unsafe version of {@link #vkCmdBlitImage CmdBlitImage} */
	public static void nvkCmdBlitImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions, int filter) {
		long __functionAddress = getInstance(commandBuffer).CmdBlitImage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIJIIPIV(__functionAddress, commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter);
	}

	/**
	 * Copies regions of an image, potentially performing format conversion, arbitrary scaling, and filtering (but does not allow MSAA resolve).
	 *
	 * @param commandBuffer  
	 * @param srcImage       
	 * @param srcImageLayout 
	 * @param dstImage       
	 * @param dstImageLayout 
	 * @param regionCount    
	 * @param pRegions       
	 * @param filter         
	 */
	public static void vkCmdBlitImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, VkImageBlit.Buffer pRegions, int filter) {
		if ( CHECKS )
			checkBuffer(pRegions, regionCount);
		nvkCmdBlitImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions.address(), filter);
	}

	/** Alternative version of: {@link #vkCmdBlitImage CmdBlitImage} */
	public static void vkCmdBlitImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageBlit.Buffer pRegions, int filter) {
		nvkCmdBlitImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address(), filter);
	}

	// --- [ vkCmdCopyBufferToImage ] ---

	/** Unsafe version of {@link #vkCmdCopyBufferToImage CmdCopyBufferToImage} */
	public static void nvkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
		long __functionAddress = getInstance(commandBuffer).CmdCopyBufferToImage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJJIIPV(__functionAddress, commandBuffer.address(), srcBuffer, dstImage, dstImageLayout, regionCount, pRegions);
	}

	/**
	 * Copy data from a buffer into an image.
	 *
	 * @param commandBuffer  
	 * @param srcBuffer      
	 * @param dstImage       
	 * @param dstImageLayout 
	 * @param regionCount    
	 * @param pRegions       
	 */
	public static void vkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, int regionCount, VkBufferImageCopy.Buffer pRegions) {
		if ( CHECKS )
			checkBuffer(pRegions, regionCount);
		nvkCmdCopyBufferToImage(commandBuffer, srcBuffer, dstImage, dstImageLayout, regionCount, pRegions.address());
	}

	/** Alternative version of: {@link #vkCmdCopyBufferToImage CmdCopyBufferToImage} */
	public static void vkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, VkBufferImageCopy.Buffer pRegions) {
		nvkCmdCopyBufferToImage(commandBuffer, srcBuffer, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdCopyImageToBuffer ] ---

	/** Unsafe version of {@link #vkCmdCopyImageToBuffer CmdCopyImageToBuffer} */
	public static void nvkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, int regionCount, long pRegions) {
		long __functionAddress = getInstance(commandBuffer).CmdCopyImageToBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIJIPV(__functionAddress, commandBuffer.address(), srcImage, srcImageLayout, dstBuffer, regionCount, pRegions);
	}

	/**
	 * Copy image data into a buffer.
	 *
	 * @param commandBuffer  
	 * @param srcImage       
	 * @param srcImageLayout 
	 * @param dstBuffer      
	 * @param regionCount    
	 * @param pRegions       
	 */
	public static void vkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, int regionCount, VkBufferImageCopy.Buffer pRegions) {
		if ( CHECKS )
			checkBuffer(pRegions, regionCount);
		nvkCmdCopyImageToBuffer(commandBuffer, srcImage, srcImageLayout, dstBuffer, regionCount, pRegions.address());
	}

	/** Alternative version of: {@link #vkCmdCopyImageToBuffer CmdCopyImageToBuffer} */
	public static void vkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, VkBufferImageCopy.Buffer pRegions) {
		nvkCmdCopyImageToBuffer(commandBuffer, srcImage, srcImageLayout, dstBuffer, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdUpdateBuffer ] ---

	/** Unsafe version of {@link #vkCmdUpdateBuffer CmdUpdateBuffer} */
	public static void nvkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long dataSize, long pData) {
		long __functionAddress = getInstance(commandBuffer).CmdUpdateBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJJJPV(__functionAddress, commandBuffer.address(), dstBuffer, dstOffset, dataSize, pData);
	}

	/**
	 * Updates a buffer's contents from host memory.
	 *
	 * @param commandBuffer 
	 * @param dstBuffer     
	 * @param dstOffset     
	 * @param dataSize      
	 * @param pData         
	 */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long dataSize, ByteBuffer pData) {
		if ( CHECKS )
			checkBuffer(pData, dataSize << 2);
		nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, dataSize, memAddress(pData));
	}

	/** Alternative version of: {@link #vkCmdUpdateBuffer CmdUpdateBuffer} */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, IntBuffer pData) {
		nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, pData.remaining(), memAddress(pData));
	}

	// --- [ vkCmdFillBuffer ] ---

	/**
	 * Fills a region of a buffer with a fixed value.
	 *
	 * @param commandBuffer 
	 * @param dstBuffer     
	 * @param dstOffset     
	 * @param size          
	 * @param data          
	 */
	public static void vkCmdFillBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long size, int data) {
		long __functionAddress = getInstance(commandBuffer).CmdFillBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJJJIV(__functionAddress, commandBuffer.address(), dstBuffer, dstOffset, size, data);
	}

	// --- [ vkCmdClearColorImage ] ---

	/** Unsafe version of {@link #vkCmdClearColorImage CmdClearColorImage} */
	public static void nvkCmdClearColorImage(VkCommandBuffer commandBuffer, long image, int imageLayout, long pColor, int rangeCount, long pRanges) {
		long __functionAddress = getInstance(commandBuffer).CmdClearColorImage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIPIPV(__functionAddress, commandBuffer.address(), image, imageLayout, pColor, rangeCount, pRanges);
	}

	/**
	 * Clears regions of a color image.
	 *
	 * @param commandBuffer 
	 * @param image         
	 * @param imageLayout   
	 * @param pColor        
	 * @param rangeCount    
	 * @param pRanges       
	 */
	public static void vkCmdClearColorImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearColorValue pColor, int rangeCount, VkImageSubresourceRange.Buffer pRanges) {
		if ( CHECKS )
			checkBuffer(pRanges, rangeCount);
		nvkCmdClearColorImage(commandBuffer, image, imageLayout, pColor.address(), rangeCount, pRanges.address());
	}

	/** Alternative version of: {@link #vkCmdClearColorImage CmdClearColorImage} */
	public static void vkCmdClearColorImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearColorValue pColor, VkImageSubresourceRange.Buffer pRanges) {
		nvkCmdClearColorImage(commandBuffer, image, imageLayout, pColor.address(), pRanges.remaining(), pRanges.address());
	}

	/** Single value version of: {@link #vkCmdClearColorImage CmdClearColorImage} */
	public static void vkCmdClearColorImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearColorValue pColor, VkImageSubresourceRange pRange) {
		nvkCmdClearColorImage(commandBuffer, image, imageLayout, pColor.address(), 1, pRange.address());
	}

	// --- [ vkCmdClearDepthStencilImage ] ---

	/** Unsafe version of {@link #vkCmdClearDepthStencilImage CmdClearDepthStencilImage} */
	public static void nvkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, long image, int imageLayout, long pDepthStencil, int rangeCount, long pRanges) {
		long __functionAddress = getInstance(commandBuffer).CmdClearDepthStencilImage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIPIPV(__functionAddress, commandBuffer.address(), image, imageLayout, pDepthStencil, rangeCount, pRanges);
	}

	/**
	 * Fills regions of a combined depth-stencil image.
	 *
	 * @param commandBuffer 
	 * @param image         
	 * @param imageLayout   
	 * @param pDepthStencil 
	 * @param rangeCount    
	 * @param pRanges       
	 */
	public static void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearDepthStencilValue pDepthStencil, int rangeCount, VkImageSubresourceRange.Buffer pRanges) {
		if ( CHECKS )
			checkBuffer(pRanges, rangeCount);
		nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), rangeCount, pRanges.address());
	}

	/** Alternative version of: {@link #vkCmdClearDepthStencilImage CmdClearDepthStencilImage} */
	public static void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearDepthStencilValue pDepthStencil, VkImageSubresourceRange.Buffer pRanges) {
		nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), pRanges.remaining(), pRanges.address());
	}

	/** Single value version of: {@link #vkCmdClearDepthStencilImage CmdClearDepthStencilImage} */
	public static void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearDepthStencilValue pDepthStencil, VkImageSubresourceRange pRange) {
		nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), 1, pRange.address());
	}

	// --- [ vkCmdClearAttachments ] ---

	/** Unsafe version of {@link #vkCmdClearAttachments CmdClearAttachments} */
	public static void nvkCmdClearAttachments(VkCommandBuffer commandBuffer, int attachmentCount, long pAttachments, int rectCount, long pRects) {
		long __functionAddress = getInstance(commandBuffer).CmdClearAttachments;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIPIPV(__functionAddress, commandBuffer.address(), attachmentCount, pAttachments, rectCount, pRects);
	}

	/**
	 * Clears regions within currently bound framebuffer attachments.
	 *
	 * @param commandBuffer   
	 * @param attachmentCount 
	 * @param pAttachments    
	 * @param rectCount       
	 * @param pRects          
	 */
	public static void vkCmdClearAttachments(VkCommandBuffer commandBuffer, int attachmentCount, VkClearAttachment.Buffer pAttachments, int rectCount, VkClearRect.Buffer pRects) {
		if ( CHECKS ) {
			checkBuffer(pAttachments, attachmentCount);
			checkBuffer(pRects, rectCount);
		}
		nvkCmdClearAttachments(commandBuffer, attachmentCount, pAttachments.address(), rectCount, pRects.address());
	}

	/** Alternative version of: {@link #vkCmdClearAttachments CmdClearAttachments} */
	public static void vkCmdClearAttachments(VkCommandBuffer commandBuffer, VkClearAttachment.Buffer pAttachments, VkClearRect.Buffer pRects) {
		nvkCmdClearAttachments(commandBuffer, pAttachments.remaining(), pAttachments.address(), pRects.remaining(), pRects.address());
	}

	// --- [ vkCmdResolveImage ] ---

	/** Unsafe version of {@link #vkCmdResolveImage CmdResolveImage} */
	public static void nvkCmdResolveImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
		long __functionAddress = getInstance(commandBuffer).CmdResolveImage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIJIIPV(__functionAddress, commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
	}

	/**
	 * Resolves regions of an image.
	 *
	 * @param commandBuffer  
	 * @param srcImage       
	 * @param srcImageLayout 
	 * @param dstImage       
	 * @param dstImageLayout 
	 * @param regionCount    
	 * @param pRegions       
	 */
	public static void vkCmdResolveImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, VkImageResolve.Buffer pRegions) {
		if ( CHECKS )
			checkBuffer(pRegions, regionCount);
		nvkCmdResolveImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions.address());
	}

	/** Alternative version of: {@link #vkCmdResolveImage CmdResolveImage} */
	public static void vkCmdResolveImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageResolve.Buffer pRegions) {
		nvkCmdResolveImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
	}

	/** Single value version of: {@link #vkCmdResolveImage CmdResolveImage} */
	public static void vkCmdResolveImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageResolve pRegion) {
		nvkCmdResolveImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, 1, pRegion.address());
	}

	// --- [ vkCmdSetEvent ] ---

	/**
	 * Sets an event object to signaled state.
	 *
	 * @param commandBuffer 
	 * @param event         
	 * @param stageMask     
	 */
	public static void vkCmdSetEvent(VkCommandBuffer commandBuffer, long event, int stageMask) {
		long __functionAddress = getInstance(commandBuffer).CmdSetEvent;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIV(__functionAddress, commandBuffer.address(), event, stageMask);
	}

	// --- [ vkCmdResetEvent ] ---

	/**
	 * Resets an event object to non-signaled state.
	 *
	 * @param commandBuffer 
	 * @param event         
	 * @param stageMask     
	 */
	public static void vkCmdResetEvent(VkCommandBuffer commandBuffer, long event, int stageMask) {
		long __functionAddress = getInstance(commandBuffer).CmdResetEvent;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIV(__functionAddress, commandBuffer.address(), event, stageMask);
	}

	// --- [ vkCmdWaitEvents ] ---

	/** Unsafe version of {@link #vkCmdWaitEvents CmdWaitEvents} */
	public static void nvkCmdWaitEvents(VkCommandBuffer commandBuffer, int eventCount, long pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers) {
		long __functionAddress = getInstance(commandBuffer).CmdWaitEvents;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIPIIIPIPIPV(__functionAddress, commandBuffer.address(), eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
	}

	/**
	 * Waits for one or more events and inserts a set of memory barriers.
	 *
	 * @param commandBuffer            
	 * @param eventCount               
	 * @param pEvents                  
	 * @param srcStageMask             
	 * @param dstStageMask             
	 * @param memoryBarrierCount       
	 * @param pMemoryBarriers          
	 * @param bufferMemoryBarrierCount 
	 * @param pBufferMemoryBarriers    
	 * @param imageMemoryBarrierCount  
	 * @param pImageMemoryBarriers     
	 */
	public static void vkCmdWaitEvents(VkCommandBuffer commandBuffer, int eventCount, ByteBuffer pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, VkMemoryBarrier.Buffer pMemoryBarriers, int bufferMemoryBarrierCount, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, int imageMemoryBarrierCount, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
		if ( CHECKS ) {
			checkBuffer(pEvents, eventCount << 3);
			if ( pMemoryBarriers != null ) checkBuffer(pMemoryBarriers, memoryBarrierCount);
			if ( pBufferMemoryBarriers != null ) checkBuffer(pBufferMemoryBarriers, bufferMemoryBarrierCount);
			if ( pImageMemoryBarriers != null ) checkBuffer(pImageMemoryBarriers, imageMemoryBarrierCount);
		}
		nvkCmdWaitEvents(commandBuffer, eventCount, memAddress(pEvents), srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers == null ? NULL : pMemoryBarriers.address(), bufferMemoryBarrierCount, pBufferMemoryBarriers == null ? NULL : pBufferMemoryBarriers.address(), imageMemoryBarrierCount, pImageMemoryBarriers == null ? NULL : pImageMemoryBarriers.address());
	}

	/** Alternative version of: {@link #vkCmdWaitEvents CmdWaitEvents} */
	public static void vkCmdWaitEvents(VkCommandBuffer commandBuffer, LongBuffer pEvents, int srcStageMask, int dstStageMask, VkMemoryBarrier.Buffer pMemoryBarriers, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
		nvkCmdWaitEvents(commandBuffer, pEvents.remaining(), memAddress(pEvents), srcStageMask, dstStageMask, pMemoryBarriers == null ? 0 : pMemoryBarriers.remaining(), pMemoryBarriers == null ? NULL : pMemoryBarriers.address(), pBufferMemoryBarriers == null ? 0 : pBufferMemoryBarriers.remaining(), pBufferMemoryBarriers == null ? NULL : pBufferMemoryBarriers.address(), pImageMemoryBarriers == null ? 0 : pImageMemoryBarriers.remaining(), pImageMemoryBarriers == null ? NULL : pImageMemoryBarriers.address());
	}

	// --- [ vkCmdPipelineBarrier ] ---

	/** Unsafe version of {@link #vkCmdPipelineBarrier CmdPipelineBarrier} */
	public static void nvkCmdPipelineBarrier(VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers) {
		long __functionAddress = getInstance(commandBuffer).CmdPipelineBarrier;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIIIIPIPIPV(__functionAddress, commandBuffer.address(), srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
	}

	/**
	 * Inserts a set of execution and memory barriers.
	 *
	 * @param commandBuffer            
	 * @param srcStageMask             
	 * @param dstStageMask             
	 * @param dependencyFlags          
	 * @param memoryBarrierCount       
	 * @param pMemoryBarriers          
	 * @param bufferMemoryBarrierCount 
	 * @param pBufferMemoryBarriers    
	 * @param imageMemoryBarrierCount  
	 * @param pImageMemoryBarriers     
	 */
	public static void vkCmdPipelineBarrier(VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, VkMemoryBarrier.Buffer pMemoryBarriers, int bufferMemoryBarrierCount, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, int imageMemoryBarrierCount, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
		if ( CHECKS ) {
			if ( pMemoryBarriers != null ) checkBuffer(pMemoryBarriers, memoryBarrierCount);
			if ( pBufferMemoryBarriers != null ) checkBuffer(pBufferMemoryBarriers, bufferMemoryBarrierCount);
			if ( pImageMemoryBarriers != null ) checkBuffer(pImageMemoryBarriers, imageMemoryBarrierCount);
		}
		nvkCmdPipelineBarrier(commandBuffer, srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers == null ? NULL : pMemoryBarriers.address(), bufferMemoryBarrierCount, pBufferMemoryBarriers == null ? NULL : pBufferMemoryBarriers.address(), imageMemoryBarrierCount, pImageMemoryBarriers == null ? NULL : pImageMemoryBarriers.address());
	}

	/** Alternative version of: {@link #vkCmdPipelineBarrier CmdPipelineBarrier} */
	public static void vkCmdPipelineBarrier(VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, VkMemoryBarrier.Buffer pMemoryBarriers, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
		nvkCmdPipelineBarrier(commandBuffer, srcStageMask, dstStageMask, dependencyFlags, pMemoryBarriers == null ? 0 : pMemoryBarriers.remaining(), pMemoryBarriers == null ? NULL : pMemoryBarriers.address(), pBufferMemoryBarriers == null ? 0 : pBufferMemoryBarriers.remaining(), pBufferMemoryBarriers == null ? NULL : pBufferMemoryBarriers.address(), pImageMemoryBarriers == null ? 0 : pImageMemoryBarriers.remaining(), pImageMemoryBarriers == null ? NULL : pImageMemoryBarriers.address());
	}

	// --- [ vkCmdBeginQuery ] ---

	/**
	 * Begins a query.
	 *
	 * @param commandBuffer 
	 * @param queryPool     
	 * @param query         
	 * @param flags         
	 */
	public static void vkCmdBeginQuery(VkCommandBuffer commandBuffer, long queryPool, int query, int flags) {
		long __functionAddress = getInstance(commandBuffer).CmdBeginQuery;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIIV(__functionAddress, commandBuffer.address(), queryPool, query, flags);
	}

	// --- [ vkCmdEndQuery ] ---

	/**
	 * Ends a query.
	 *
	 * @param commandBuffer 
	 * @param queryPool     
	 * @param query         
	 */
	public static void vkCmdEndQuery(VkCommandBuffer commandBuffer, long queryPool, int query) {
		long __functionAddress = getInstance(commandBuffer).CmdEndQuery;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIV(__functionAddress, commandBuffer.address(), queryPool, query);
	}

	// --- [ vkCmdResetQueryPool ] ---

	/**
	 * Resets queries in a query pool.
	 *
	 * @param commandBuffer 
	 * @param queryPool     
	 * @param firstQuery    
	 * @param queryCount    
	 */
	public static void vkCmdResetQueryPool(VkCommandBuffer commandBuffer, long queryPool, int firstQuery, int queryCount) {
		long __functionAddress = getInstance(commandBuffer).CmdResetQueryPool;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIIV(__functionAddress, commandBuffer.address(), queryPool, firstQuery, queryCount);
	}

	// --- [ vkCmdWriteTimestamp ] ---

	/**
	 * Writes a device timestamp into a query object.
	 *
	 * @param commandBuffer 
	 * @param pipelineStage 
	 * @param queryPool     
	 * @param query         
	 */
	public static void vkCmdWriteTimestamp(VkCommandBuffer commandBuffer, int pipelineStage, long queryPool, int query) {
		long __functionAddress = getInstance(commandBuffer).CmdWriteTimestamp;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIJIV(__functionAddress, commandBuffer.address(), pipelineStage, queryPool, query);
	}

	// --- [ vkCmdCopyQueryPoolResults ] ---

	/**
	 * Copies the results of queries in a query pool to a buffer object.
	 *
	 * @param commandBuffer 
	 * @param queryPool     
	 * @param firstQuery    
	 * @param queryCount    
	 * @param dstBuffer     
	 * @param dstOffset     
	 * @param stride        
	 * @param flags         
	 */
	public static void vkCmdCopyQueryPoolResults(VkCommandBuffer commandBuffer, long queryPool, int firstQuery, int queryCount, long dstBuffer, long dstOffset, long stride, int flags) {
		long __functionAddress = getInstance(commandBuffer).CmdCopyQueryPoolResults;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIIJJJIV(__functionAddress, commandBuffer.address(), queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags);
	}

	// --- [ vkCmdPushConstants ] ---

	/** Unsafe version of {@link #vkCmdPushConstants CmdPushConstants} */
	public static void nvkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, int size, long pValues) {
		long __functionAddress = getInstance(commandBuffer).CmdPushConstants;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJIIIPV(__functionAddress, commandBuffer.address(), layout, stageFlags, offset, size, pValues);
	}

	/**
	 * Updates the values of push constants.
	 *
	 * @param commandBuffer 
	 * @param layout        
	 * @param stageFlags    
	 * @param offset        
	 * @param size          
	 * @param pValues       
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, int size, ByteBuffer pValues) {
		if ( CHECKS )
			checkBuffer(pValues, size);
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, size, memAddress(pValues));
	}

	/** Alternative version of: {@link #vkCmdPushConstants CmdPushConstants} */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, ByteBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining(), memAddress(pValues));
	}

	// --- [ vkCmdBeginRenderPass ] ---

	/** Unsafe version of {@link #vkCmdBeginRenderPass CmdBeginRenderPass} */
	public static void nvkCmdBeginRenderPass(VkCommandBuffer commandBuffer, long pRenderPassBegin, int contents) {
		long __functionAddress = getInstance(commandBuffer).CmdBeginRenderPass;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkRenderPassBeginInfo.validate(pRenderPassBegin);
		}
		callPPIV(__functionAddress, commandBuffer.address(), pRenderPassBegin, contents);
	}

	/**
	 * Begins a new render pass.
	 *
	 * @param commandBuffer    
	 * @param pRenderPassBegin 
	 * @param contents         
	 */
	public static void vkCmdBeginRenderPass(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo pRenderPassBegin, int contents) {
		nvkCmdBeginRenderPass(commandBuffer, pRenderPassBegin.address(), contents);
	}

	// --- [ vkCmdNextSubpass ] ---

	/**
	 * Transitions to the next subpass of a render pass.
	 *
	 * @param commandBuffer 
	 * @param contents      
	 */
	public static void vkCmdNextSubpass(VkCommandBuffer commandBuffer, int contents) {
		long __functionAddress = getInstance(commandBuffer).CmdNextSubpass;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIV(__functionAddress, commandBuffer.address(), contents);
	}

	// --- [ vkCmdEndRenderPass ] ---

	/**
	 * Ends the current render pass.
	 *
	 * @param commandBuffer 
	 */
	public static void vkCmdEndRenderPass(VkCommandBuffer commandBuffer) {
		long __functionAddress = getInstance(commandBuffer).CmdEndRenderPass;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, commandBuffer.address());
	}

	// --- [ vkCmdExecuteCommands ] ---

	/** Unsafe version of {@link #vkCmdExecuteCommands CmdExecuteCommands} */
	public static void nvkCmdExecuteCommands(VkCommandBuffer commandBuffer, int commandBufferCount, long pCommandBuffers) {
		long __functionAddress = getInstance(commandBuffer).CmdExecuteCommands;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIPV(__functionAddress, commandBuffer.address(), commandBufferCount, pCommandBuffers);
	}

	/**
	 * Executes a secondary command buffer from a primary command buffer.
	 *
	 * @param commandBuffer      
	 * @param commandBufferCount 
	 * @param pCommandBuffers    
	 */
	public static void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, int commandBufferCount, ByteBuffer pCommandBuffers) {
		if ( CHECKS )
			checkBuffer(pCommandBuffers, commandBufferCount << POINTER_SHIFT);
		nvkCmdExecuteCommands(commandBuffer, commandBufferCount, memAddress(pCommandBuffers));
	}

	/** Alternative version of: {@link #vkCmdExecuteCommands CmdExecuteCommands} */
	public static void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, PointerBuffer pCommandBuffers) {
		nvkCmdExecuteCommands(commandBuffer, pCommandBuffers.remaining(), memAddress(pCommandBuffers));
	}

	/** Single value version of: {@link #vkCmdExecuteCommands CmdExecuteCommands} */
	public static void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, VkCommandBuffer pCommandBuffer) {
		APIBuffer __buffer = apiBuffer();
		int pCommandBuffers = __buffer.pointerParam(pCommandBuffer);
		nvkCmdExecuteCommands(commandBuffer, 1, __buffer.address(pCommandBuffers));
	}

}