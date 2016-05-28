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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core Vulkan 1.0 functionality. */
public class VK10 {

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
	 * bug, and <b>may</b> have an impact on the behavior of existing functionality. Differences in this version number <b>should not</b> affect either full compatibility
	 * or backwards compatibility between two versions, or add additional interfaces to the API.</p>
	 * 
	 * <p>A difference in minor version numbers indicates that some amount of new functionality has been added. This will usually include new interfaces in the
	 * header, and <b>may</b> also include behavior changes and bug fixes. Functionality <b>may</b> be deprecated in a minor revision, but will not be removed. When a new
	 * minor version is introduced, the patch version is reset to 0, and each minor revision maintains its own set of patch versions. Differences in this
	 * version <b>should not</b> affect backwards compatibility, but will affect full compatibility.</p>
	 * 
	 * <p>A difference in major version numbers indicates a large set of changes to the API, potentially including new functionality and header interfaces,
	 * behavioral changes, removal of deprecated features, modification or outright replacement of any feature, and is thus very likely to break any and all
	 * compatibility. Differences in this version will typically require significant modification to an application in order for it to function.</p>
	 */
	public static final int VK_API_VERSION_1_0 = VKUtil.VK_MAKE_VERSION(1, 0, 0);

	/**
	 * The reserved handle {@code VK_NULL_HANDLE} <b>can</b> be passed in place of valid object handles when explicitly called out in the specification. Any command
	 * that creates an object successfully <b>must not</b> return {@code VK_NULL_HANDLE}. It is valid to pass {@code VK_NULL_HANDLE} to any {@code vkDestroy*} or
	 * {@code vkFree*} command, which will silently ignore these values.
	 */
	public static final long VK_NULL_HANDLE = 0x0L;

	/**  */
	public static final float VK_LOD_CLAMP_NONE = 1000.0f;

	/** Boolean constants. */
	public static final int
		VK_TRUE  = 1,
		VK_FALSE = 0;

	/** Struct member limits. */
	public static final int
		VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = 256,
		VK_UUID_SIZE                     = 16,
		VK_MAX_MEMORY_TYPES              = 32,
		VK_MAX_MEMORY_HEAPS              = 16,
		VK_MAX_EXTENSION_NAME_SIZE       = 256,
		VK_MAX_DESCRIPTION_SIZE          = 256;

	/** Special values. */
	public static final int
		VK_REMAINING_MIP_LEVELS   = (~0),
		VK_REMAINING_ARRAY_LAYERS = (~0),
		VK_ATTACHMENT_UNUSED      = (~0),
		VK_QUEUE_FAMILY_IGNORED   = (~0),
		VK_SUBPASS_EXTERNAL       = (~0);

	/** Special size value. */
	public static final long VK_WHOLE_SIZE = (~0L);

	/** VkPipelineCacheHeaderVersion */
	public static final int VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1;

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
		VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO                 = 48;

	/** The allocation is scoped to the duration of the Vulkan command. */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = 0;

	/** The allocation is scoped to the lifetime of the Vulkan object that is being created or used. */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = 1;

	/** The allocation is scoped to the lifetime of a {@code VkPipelineCache} object. */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_CACHE = 2;

	/** The allocation is scoped to the lifetime of the Vulkan device. */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = 3;

	/** The allocation is scoped to the lifetime of the Vulkan instance. */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4;

	/** The allocation is intended for execution by the host. */
	public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0;

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

	/** A four-component, block compressed format where each 4x4 block consists of 128-bits of encoded unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
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

	/** A four-component, ASTC compressed format where each 4x4 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_4x4_SRGB_BLOCK = 158;

	/** A four-component, ASTC compressed format where each 5x4 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_5x4_UNORM_BLOCK = 159;

	/** A four-component, ASTC compressed format where each 5x4 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_5x4_SRGB_BLOCK = 160;

	/** A four-component, ASTC compressed format where each 5x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_5x5_UNORM_BLOCK = 161;

	/** A four-component, ASTC compressed format where each 5x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_5x5_SRGB_BLOCK = 162;

	/** A four-component, ASTC compressed format where each 6x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_6x5_UNORM_BLOCK = 163;

	/** A four-component, ASTC compressed format where each 6x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_6x5_SRGB_BLOCK = 164;

	/** A four-component, ASTC compressed format where each 6x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_6x6_UNORM_BLOCK = 165;

	/** A four-component, ASTC compressed format where each 6x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_6x6_SRGB_BLOCK = 166;

	/** A four-component, ASTC compressed format where each 8x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_8x5_UNORM_BLOCK = 167;

	/** A four-component, ASTC compressed format where each 8x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_8x5_SRGB_BLOCK = 168;

	/** A four-component, ASTC compressed format where each 8x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_8x6_UNORM_BLOCK = 169;

	/** A four-component, ASTC compressed format where each 8x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_8x6_SRGB_BLOCK = 170;

	/** A four-component, ASTC compressed format where each 8x8 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_8x8_UNORM_BLOCK = 171;

	/** A four-component, ASTC compressed format where each 8x8 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_8x8_SRGB_BLOCK = 172;

	/** A four-component, ASTC compressed format where each 10x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_10x5_UNORM_BLOCK = 173;

	/** A four-component, ASTC compressed format where each 10x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_10x5_SRGB_BLOCK = 174;

	/** A four-component, ASTC compressed format where each 10x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_10x6_UNORM_BLOCK = 175;

	/** A four-component, ASTC compressed format where each 10x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_10x6_SRGB_BLOCK = 176;

	/** A four-component, ASTC compressed format where each 10x8 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_10x8_UNORM_BLOCK = 177;

	/** A four-component, ASTC compressed format where each 10x8 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_10x8_SRGB_BLOCK = 178;

	/** A four-component, ASTC compressed format where each 10x10 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_10x10_UNORM_BLOCK = 179;

	/** A four-component, ASTC compressed format where each 10x10 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_10x10_SRGB_BLOCK = 180;

	/** A four-component, ASTC compressed format where each 12x10 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_12x10_UNORM_BLOCK = 181;

	/** A four-component, ASTC compressed format where each 12x10 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_12x10_SRGB_BLOCK = 182;

	/** A four-component, ASTC compressed format where each 12x12 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data. */
	public static final int VK_FORMAT_ASTC_12x12_UNORM_BLOCK = 183;

	/** A four-component, ASTC compressed format where each 12x12 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding applied to the RGB components. */
	public static final int VK_FORMAT_ASTC_12x12_SRGB_BLOCK = 184;

	/** One-dimensional image */
	public static final int VK_IMAGE_TYPE_1D = 0;

	/** Two-dimensional image */
	public static final int VK_IMAGE_TYPE_2D = 1;

	/** Three-dimensional image */
	public static final int VK_IMAGE_TYPE_3D = 2;

	/** Specifies optimal tiling (texels are laid out in an implementation-dependent arrangement, for more optimal memory access). */
	public static final int VK_IMAGE_TILING_OPTIMAL = 0;

	/** Specifies linear tiling (texels are laid out in memory in row-major order, possibly with some padding on each row). */
	public static final int VK_IMAGE_TILING_LINEAR = 1;

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

	/** Occlusion query. */
	public static final int VK_QUERY_TYPE_OCCLUSION = 0;

	/** Pipeline statistics query */
	public static final int VK_QUERY_TYPE_PIPELINE_STATISTICS = 1;

	/** Timestamp query. */
	public static final int VK_QUERY_TYPE_TIMESTAMP = 2;

	/** Specifies that access to any range or image subresource of the object will be exclusive to a single queue family at a time. */
	public static final int VK_SHARING_MODE_EXCLUSIVE = 0;

	/** Specifies that concurrent access to any range or image subresource of the object from multiple queue families is supported. */
	public static final int VK_SHARING_MODE_CONCURRENT = 1;

	/**
	 * Supports no device access. This layout <b>must</b> only be used as an {@code initialLayout} or as the {@code oldLayout} in an image transition. When
	 * transitioning out of this layout, the contents of the memory are not guaranteed to be preserved.
	 */
	public static final int VK_IMAGE_LAYOUT_UNDEFINED = 0;

	/** Supports all types of device access. */
	public static final int VK_IMAGE_LAYOUT_GENERAL = 1;

	/**
	 * <b>must</b> only be used as a color or resolve attachment in a {@code VkFramebuffer}. This layout is valid only for image subresources of images created
	 * with the {@link #VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} usage bit enabled.
	 */
	public static final int VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL = 2;

	/**
	 * <b>must</b> only be used as a depth/stencil attachment in a {@code VkFramebuffer}. This layout is valid only for image subresources of images created
	 * with the {@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} usage bit enabled.
	 */
	public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = 3;

	/**
	 * <b>must</b> only be used as a read-only depth/stencil attachment in a {@code VkFramebuffer} and/or as a read-only image in a shader (which <b>can</b> be read as
	 * a sampled image, combined image/sampler and/or input attachment). This layout is valid only for image subresources of images created with both the
	 * {@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} usage bit enabled.
	 */
	public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL = 4;

	/**
	 * <b>must</b> only be used as a read-only image in a shader (which <b>can</b> be read as a sampled image, combined image/sampler and/or input attachment). This
	 * layout is valid only for image subresources of images created with the {@link #VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} or {@link #VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} usage bit enabled.
	 */
	public static final int VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL = 5;

	/**
	 * <b>must</b> only be used as a source image of a transfer command (see the definition of {@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}). This layout is valid only for
	 * image subresources of images created with the {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage bit enabled.
	 */
	public static final int VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL = 6;

	/**
	 * <b>must</b> only be used as a destination image of a transfer command. This layout is valid only for image subresources of images created with the
	 * {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage bit enabled.
	 */
	public static final int VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL = 7;

	/**
	 * Supports no device access. This layout <b>must</b> only be used as an {@code initialLayout} or as the {@code oldLayout} in an image transition. When
	 * transitioning out of this layout, the contents of the memory are preserved. This layout is intended to be used as the initial layout for an image
	 * whose contents are written by the host, and hence the data <b>can</b> be written to memory immediately, without first executing a layout transition.
	 * Currently, {@link #VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED} is only useful with {@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} images because there is not a standard layout defined for
	 * {@link #VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL} images.
	 */
	public static final int VK_IMAGE_LAYOUT_PREINITIALIZED = 8;

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

	/** Indicates that vertex attribute addressing is a function of the vertex index. */
	public static final int VK_VERTEX_INPUT_RATE_VERTEX = 0;

	/** Indicates that vertex attribute addressing is a function of the instance index. */
	public static final int VK_VERTEX_INPUT_RATE_INSTANCE = 1;

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

	/** Causes polygons to render using the polygon rasterization rules. */
	public static final int VK_POLYGON_MODE_FILL = 0;

	/** Causes polygon edges to be drawn as line segments. */
	public static final int VK_POLYGON_MODE_LINE = 1;

	/** The vertices of polygons are treated, for rasterization purposes, as if they had been drawn as points. */
	public static final int VK_POLYGON_MODE_POINT = 2;

	/** A triangle with positive area is considered front-facing. */
	public static final int VK_FRONT_FACE_COUNTER_CLOCKWISE = 0;

	/** A triangle with negative area is considered front-facing. */
	public static final int VK_FRONT_FACE_CLOCKWISE = 1;

	/** The test never passes. */
	public static final int VK_COMPARE_OP_NEVER = 0;

	/** The test passes when <b>R</b> &lt; <b>S</b>. */
	public static final int VK_COMPARE_OP_LESS = 1;

	/** The test passes when R = S */
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

	/**
	 * Indicates that the {@code pViewports} state in {@link VkPipelineViewportStateCreateInfo} will be ignored and <b>must</b> be set dynamically with
	 * {@link #vkCmdSetViewport CmdSetViewport} before any draw commands. The number of viewports used by a pipeline is still specified by the {@code viewportCount} member of
	 * {@code VkPipelineViewportStateCreateInfo}.
	 */
	public static final int VK_DYNAMIC_STATE_VIEWPORT = 0;

	/**
	 * Indicates that the {@code pScissors} state in {@link VkPipelineViewportStateCreateInfo} will be ignored and <b>must</b> be set dynamically with
	 * {@link #vkCmdSetScissor CmdSetScissor} before any draw commands. The number of scissor rectangles used by a pipeline is still specified by the {@code scissorCount}
	 * member of {@code VkPipelineViewportStateCreateInfo}.
	 */
	public static final int VK_DYNAMIC_STATE_SCISSOR = 1;

	/**
	 * Indicates that the {@code lineWidth} state in {@link VkPipelineRasterizationStateCreateInfo} will be ignored and <b>must</b> be set dynamically with
	 * {@link #vkCmdSetLineWidth CmdSetLineWidth} before any draw commands that generate line primitives for the rasterizer.
	 */
	public static final int VK_DYNAMIC_STATE_LINE_WIDTH = 2;

	/**
	 * Indicates that the {@code depthBiasConstantFactor}, {@code depthBiasClamp} and {@code depthBiasSlopeFactor} states in
	 * {@link VkPipelineRasterizationStateCreateInfo} will be ignored and <b>must</b> be set dynamically with {@link #vkCmdSetDepthBias CmdSetDepthBias} before any draws are performed with
	 * {@code depthBiasEnable} in {@code VkPipelineRasterizationStateCreateInfo} set to {@link #VK_TRUE TRUE}.
	 */
	public static final int VK_DYNAMIC_STATE_DEPTH_BIAS = 3;

	/**
	 * Indicates that the {@code blendConstants} state in {@link VkPipelineColorBlendStateCreateInfo} will be ignored and <b>must</b> be set dynamically with
	 * {@link #vkCmdSetBlendConstants CmdSetBlendConstants} before any draws are performed with a pipeline state with {@code VkPipelineColorBlendAttachmentState} member
	 * {@code blendEnable} set to {@link #VK_TRUE TRUE} and any of the blend functions using a constant blend color.
	 */
	public static final int VK_DYNAMIC_STATE_BLEND_CONSTANTS = 4;

	/**
	 * Indicates that the {@code minDepthBounds} and {@code maxDepthBounds} states of {@link VkPipelineDepthStencilStateCreateInfo} will be ignored and <b>must</b> be
	 * set dynamically with {@link #vkCmdSetDepthBounds CmdSetDepthBounds} before any draws are performed with a pipeline state with {@code VkPipelineDepthStencilStateCreateInfo}
	 * member {@code depthBoundsTestEnable} set to {@link #VK_TRUE TRUE}.
	 */
	public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS = 5;

	/**
	 * Indicates that the {@code compareMask} state in {@link VkPipelineDepthStencilStateCreateInfo} for both front and back will be ignored and <b>must</b> be set
	 * dynamically with {@link #vkCmdSetStencilCompareMask CmdSetStencilCompareMask} before any draws are performed with a pipeline state with
	 * {@code VkPipelineDepthStencilStateCreateInfo} member {@code stencilTestEnable} set to {@link #VK_TRUE TRUE}.
	 */
	public static final int VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = 6;

	/**
	 * Indicates that the {@code writeMask} state in {@link VkPipelineDepthStencilStateCreateInfo} for both front and back will be ignored and <b>must</b> be set
	 * dynamically with {@link #vkCmdSetStencilWriteMask CmdSetStencilWriteMask} before any draws are performed with a pipeline state with {@code VkPipelineDepthStencilStateCreateInfo}
	 * member {@code stencilTestEnable} set to {@link #VK_TRUE TRUE}.
	 */
	public static final int VK_DYNAMIC_STATE_STENCIL_WRITE_MASK = 7;

	/**
	 * Indicates that the reference state in {@link VkPipelineDepthStencilStateCreateInfo} for both front and back will be ignored and <b>must</b> be set dynamically
	 * with {@link #vkCmdSetStencilReference CmdSetStencilReference} before any draws are performed with a pipeline state with {@code VkPipelineDepthStencilStateCreateInfo} member
	 * {@code stencilTestEnable} set to {@link #VK_TRUE TRUE}.
	 */
	public static final int VK_DYNAMIC_STATE_STENCIL_REFERENCE = 8;

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

	/** Indicates that the repeat wrap mode will be used. */
	public static final int VK_SAMPLER_ADDRESS_MODE_REPEAT = 0;

	/** Indicates that the mirrored repeat wrap mode will be used. */
	public static final int VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1;

	/** Indicates that the clamp to edge wrap mode will be used. */
	public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = 2;

	/** Indicates that the clamp to border wrap mode will be used. */
	public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3;

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
		VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT       = 10;

	/** Means the contents within the render area will be preserved. */
	public static final int VK_ATTACHMENT_LOAD_OP_LOAD = 0;

	/** Means the contents within the render area will be cleared to a uniform value, which is specified when a render pass instance is begun. */
	public static final int VK_ATTACHMENT_LOAD_OP_CLEAR = 1;

	/** Means the contents within the area need not be preserved; the contents of the attachment will be undefined inside the render area. */
	public static final int VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2;

	/**
	 * Means the contents within the render area are written to memory and will be available for reading after the render pass instance completes once the
	 * writes have been synchronized with {@link #VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT ACCESS_COLOR_ATTACHMENT_WRITE_BIT} (for color attachments) or {@link #VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT} (for
	 * depth/stencil attachments).
	 */
	public static final int VK_ATTACHMENT_STORE_OP_STORE = 0;

	/**
	 * Means the contents within the render area are not needed after rendering, and <b>may</b> be discarded; the contents of the attachment will be undefined
	 * inside the render area.
	 */
	public static final int VK_ATTACHMENT_STORE_OP_DONT_CARE = 1;

	/** VkPipelineBindPoint */
	public static final int
		VK_PIPELINE_BIND_POINT_GRAPHICS = 0,
		VK_PIPELINE_BIND_POINT_COMPUTE  = 1;

	/** VkCommandBufferLevel */
	public static final int
		VK_COMMAND_BUFFER_LEVEL_PRIMARY   = 0,
		VK_COMMAND_BUFFER_LEVEL_SECONDARY = 1;

	/** VkIndexType */
	public static final int
		VK_INDEX_TYPE_UINT16 = 0,
		VK_INDEX_TYPE_UINT32 = 1;

	/**
	 * The contents of the subpass will be recorded inline in the primary command buffer, and secondary command buffers <b>must not</b> be executed within the
	 * subpass.
	 */
	public static final int VK_SUBPASS_CONTENTS_INLINE = 0;

	/**
	 * The contents are recorded in secondary command buffers that will be called from the primary command buffer, and {@link #vkCmdExecuteCommands CmdExecuteCommands} is the only
	 * valid command on the command buffer until {@link #vkCmdNextSubpass CmdNextSubpass} or {@link #vkCmdEndRenderPass CmdEndRenderPass}.
	 */
	public static final int VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1;

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

	/** {@code VkImageView} <b>can</b> be used as a framebuffer depth/stencil attachment and as an input attachment. */
	public static final int VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x200;

	/** {@code VkImage} <b>can</b> be used as {@code srcImage} for the {@link #vkCmdBlitImage CmdBlitImage} command. */
	public static final int VK_FORMAT_FEATURE_BLIT_SRC_BIT = 0x400;

	/** {@code VkImage} <b>can</b> be used as {@code dstImage} for the {@link #vkCmdBlitImage CmdBlitImage} command. */
	public static final int VK_FORMAT_FEATURE_BLIT_DST_BIT = 0x800;

	/**
	 * If {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT} is also set, {@code VkImageView} <b>can</b> be used with a sampler that has either of {@code magFilter} or
	 * {@code minFilter} set to {@link #VK_FILTER_LINEAR FILTER_LINEAR}, or {@code mipmapMode} set to {@link #VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR}. If {@link #VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT} is also set,
	 * {@code VkImage} can be used as the {@code srcImage} to {@link #vkCmdBlitImage CmdBlitImage} with a {@code filter} of {@link #VK_FILTER_LINEAR FILTER_LINEAR}. This bit <b>must</b> only be exposed for
	 * formats that also support the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT} or {@link #VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT}.
	 * 
	 * <p>If the format being queried is a depth/stencil format, this bit only indicates that the depth aspect (not the stencil aspect) supports linear
	 * filtering, and that linear filtering of the depth aspect is supported whether depth compare is enabled in the sampler or not. If this bit is not
	 * present, linear filtering with depth compare disabled is unsupported and linear filtering with depth compare enabled is supported, but <b>may</b> compute
	 * the filtered value in an implementation-dependent manner which differs from the normal rules of linear filtering. The resulting value <b>must</b> be in
	 * the range {@code [0,1]} and <b>should</b> be proportional to, or a weighted average of, the number of comparison passes or failures.</p>
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

	/**
	 * Indicates that the image <b>can</b> be partially backed using sparse memory binding. Images created with this flag <b>must</b> also be created with the
	 * {@link #VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT} flag.
	 */
	public static final int VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = 0x2;

	/**
	 * Indicates that the image will be backed using sparse memory binding with memory ranges that might also simultaneously be backing another image (or
	 * another portion of the same image). Images created with this flag <b>must</b> also be created with the {@link #VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT} flag.
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
	 * at least one queue family <b>must</b> support this bit.
	 */
	public static final int VK_QUEUE_SPARSE_BINDING_BIT = 0x8;

	/**
	 * If set, memory allocated with this type is the most efficient for device access. This property will only be set for memory types belonging to heaps
	 * with the {@link #VK_MEMORY_HEAP_DEVICE_LOCAL_BIT MEMORY_HEAP_DEVICE_LOCAL_BIT} set.
	 */
	public static final int VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 0x1;

	/** If set, memory allocated with this type <b>can</b> be mapped using {@link #vkMapMemory MapMemory} so that it <b>can</b> be accessed on the host. */
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
	 * If set, the memory type only allows device access to the memory. Memory types <b>must</b> not have both {@link #VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT} and
	 * {@link #VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} set. Additionally, the object's backing memory <b>may</b> be provided by the implementation lazily.
	 */
	public static final int VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 0x10;

	/**
	 * Means the heap corresponds to device local memory. Device local memory <b>may</b> have different performance characteristics than host local memory, and
	 * <b>may</b> support different memory property flags.
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
	 * primitives <b>may</b> contribute to the count.
	 */
	public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT = 0x1;

	/**
	 * If set, queries managed by the pool will count the number of primitives processed by the input assembly stage. If primitive restart is enabled,
	 * restarting the primitive topology has no effect on the count. Incomplete primitives <b>may</b> be counted.
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
	 * for a particular input primitive is implementation-dependent but <b>must</b> satisfy the following conditions:
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
	 * shader is invoked. Implementations <b>may</b> skip the execution of certain compute shader invocations or execute additional compute shader invocations
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

	/**
	 * Indicates that the buffer <b>can</b> be partially backed using sparse memory binding. Buffers created with this flag <b>must</b> also be created with the
	 * {@link #VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT} flag.
	 */
	public static final int VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 0x2;

	/**
	 * Iindicates that the buffer will be backed using sparse memory binding with memory ranges that might also simultaneously be backing another buffer
	 * (or another portion of the same buffer). Buffers created with this flag <b>must</b> also be created with the {@link #VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT} flag.
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
	 * If set, then descriptor sets <b>can</b> return their individual allocations to the pool, i.e. all of {@link #vkAllocateDescriptorSets AllocateDescriptorSets}, {@link #vkFreeDescriptorSets FreeDescriptorSets}, and
	 * {@link #vkResetDescriptorPool ResetDescriptorPool} are allowed. Otherwise, descriptor sets allocated from the pool <b>must</b> not be individually freed back to the pool, i.e. only
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
	 * <li>Attachments using distinct image views that correspond to the same image subresource of an image.</li>
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
	 * <p>If a set of attachments alias each other, then all except the first to be used in the render pass <b>must</b> use an initialLayout of
	 * {@link #VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, since the earlier uses of the other aliases make their contents undefined. Once an alias has been used and a different
	 * alias has been used after it, the first alias <b>must not</b> be used in any later subpasses. However, an application <b>can</b> assign the same image view to
	 * multiple aliasing attachment indices, which allows that image view to be used multiple times even if other aliases are used in between. Once an
	 * attachment needs the {@code ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} bit, there <b>should</b> be no additional cost of introducing additional aliases, and
	 * using these additional aliases <b>may</b> allow more efficient clearing of the attachments on multiple uses via {@link #VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>The exact set of attachment indices that alias with each other is not known until a framebuffer is created using the render pass, so the above
	 * conditions <b>cannot</b> be validated at render pass creation time.</p>
	 * </div>
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
	 * Indicates that the access is a read via a non-specific unit attached to the memory. This unit <b>may</b> be external to the Vulkan device or otherwise not
	 * part of the core Vulkan pipeline. When included in {@code dstAccessMask}, all writes using access types in {@code srcAccessMask} performed by
	 * pipeline stages in {@code srcStageMask} <b>must</b> be visible in memory.
	 */
	public static final int VK_ACCESS_MEMORY_READ_BIT = 0x8000;

	/**
	 * Indicates that the access is a write via a non-specific unit attached to the memory. This unit <b>may</b> be external to the Vulkan device or otherwise
	 * not part of the core Vulkan pipeline. When included in {@code srcAccessMask}, all access types in {@code dstAccessMask} from pipeline stages in
	 * {@code dstStageMask} will observe the side effects of commands that executed before the barrier. When included in {@code dstAccessMask} all writes
	 * using access types in {@code srcAccessMask} performed by pipeline stages in {@code srcStageMask} <b>must</b> be visible in memory.
	 */
	public static final int VK_ACCESS_MEMORY_WRITE_BIT = 0x10000;

	/** If set, then the dependency is by-region. */
	public static final int VK_DEPENDENCY_BY_REGION_BIT = 0x1;

	/**
	 * Indicates that command buffers allocated from the pool will be short-lived, meaning that they will be reset or freed in a relatively short
	 * timeframe. This flag <b>may</b> be used by the implementation to control memory allocation behavior within the pool.
	 */
	public static final int VK_COMMAND_POOL_CREATE_TRANSIENT_BIT = 0x1;

	/**
	 * Controls whether command buffers allocated from the pool <b>can</b> be individually reset. If this flag is set, individual command buffers allocated from
	 * the pool <b>can</b> be reset either explicitly, by calling {@link #vkResetCommandBuffer ResetCommandBuffer}, or implicitly, by calling {@link #vkBeginCommandBuffer BeginCommandBuffer} on an executable
	 * command buffer. If this flag is not set, then {@link #vkResetCommandBuffer ResetCommandBuffer} and {@link #vkBeginCommandBuffer BeginCommandBuffer} (on an executable command buffer) <b>must</b> not be called
	 * on the command buffers allocated from the pool, and they <b>can</b> only be reset in bulk by calling {@link #vkResetCommandPool ResetCommandPool}.
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
	 * If set, then most or all memory resources currently owned by the command buffer <b>should</b> be returned to the parent command pool. If this flag is not
	 * set, then the command buffer <b>may</b> hold onto memory resources and reuse them when recording commands.
	 */
	public static final int VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 0x1;

	/** Indicates that only the front set of stencil state is updated. */
	public static final int VK_STENCIL_FACE_FRONT_BIT = 0x1;

	/** Indicates that only the back set of stencil state is updated. */
	public static final int VK_STENCIL_FACE_BACK_BIT = 0x2;

	/** Is the combination of {@link #VK_STENCIL_FACE_FRONT_BIT STENCIL_FACE_FRONT_BIT} and {@link #VK_STENCIL_FACE_BACK_BIT STENCIL_FACE_BACK_BIT} and indicates that both sets of stencil state are updated. */
	public static final int VK_STENCIL_FRONT_AND_BACK = 0x3;

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

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateInstance.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new Vulkan instance.
	 * 
	 * <p>There is no global state in Vulkan and all per-application state is stored in a {@code VkInstance} object. Creating a {@code VkInstance} object
	 * initializes the Vulkan library and allows the application to pass information about itself to the implementation.</p>
	 * 
	 * <p>{@code vkCreateInstance} creates the instance, then enables and initializes global layers and extensions requested by the application. If an extension
	 * is provided by a layer, both the layer and extension <b>must</b> be specified at {@code vkCreateInstance} time.</p>
	 * 
	 * <h5>Valid Usage</h5>
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
	public static int nvkCreateInstance(long pCreateInfo, long pAllocator, long pInstance) {
		long __functionAddress = VK.getGlobalCommands().vkCreateInstance;
		if ( CHECKS ) {
			VkInstanceCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPI(__functionAddress, pCreateInfo, pAllocator, pInstance);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateInstance.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new Vulkan instance.
	 * 
	 * <p>There is no global state in Vulkan and all per-application state is stored in a {@code VkInstance} object. Creating a {@code VkInstance} object
	 * initializes the Vulkan library and allows the application to pass information about itself to the implementation.</p>
	 * 
	 * <p>{@code vkCreateInstance} creates the instance, then enables and initializes global layers and extensions requested by the application. If an extension
	 * is provided by a layer, both the layer and extension <b>must</b> be specified at {@code vkCreateInstance} time.</p>
	 * 
	 * <h5>Valid Usage</h5>
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
	public static int vkCreateInstance(VkInstanceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, PointerBuffer pInstance) {
		if ( CHECKS )
			checkBuffer(pInstance, 1);
		return nvkCreateInstance(pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pInstance));
	}

	// --- [ vkDestroyInstance ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyInstance.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys an instance of Vulkan.
	 * 
	 * <p>After destruction of the instance, all devices (logical and physical) and any objects created by those devices become invalid and <b>should not</b> be
	 * accessed. However, objects allocated directly or indirectly through the instance are not destroyed automatically and so <b>may</b> be leaked. Applications
	 * <b>should</b> destroy all objects created through instance before destroying the instance itself.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code instance} is not {@code NULL}, {@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>All child objects created using {@code instance} <b>must</b> have been destroyed prior to destroying {@code instance}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code instance} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code instance} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code instance} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param instance   the handle of the instance to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroyInstance(VkInstance instance, long pAllocator) {
		long __functionAddress = instance.getCapabilities().vkDestroyInstance;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPPV(__functionAddress, instance.address(), pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyInstance.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys an instance of Vulkan.
	 * 
	 * <p>After destruction of the instance, all devices (logical and physical) and any objects created by those devices become invalid and <b>should not</b> be
	 * accessed. However, objects allocated directly or indirectly through the instance are not destroyed automatically and so <b>may</b> be leaked. Applications
	 * <b>should</b> destroy all objects created through instance before destroying the instance itself.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code instance} is not {@code NULL}, {@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>All child objects created using {@code instance} <b>must</b> have been destroyed prior to destroying {@code instance}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code instance} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code instance} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code instance} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param instance   the handle of the instance to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroyInstance(VkInstance instance, VkAllocationCallbacks pAllocator) {
		nvkDestroyInstance(instance, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkEnumeratePhysicalDevices ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumeratePhysicalDevices.html">Khronos Reference Page</a></p>
	 * 
	 * Retrieves a list of physical device objects representing the physical devices installed in the system.
	 * 
	 * <p>If {@code pPhysicalDevices} is {@code NULL}, then the number of physical devices available is returned in {@code pPhysicalDeviceCount}. Otherwise,
	 * {@code pPhysicalDeviceCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPhysicalDevices} array, and on return
	 * the variable is overwritten with the number of structures actually written to {@code pPhysicalDevices}. If {@code pPhysicalDeviceCount} is less than
	 * the number of physical devices available, at most {@code pPhysicalDeviceCount} structures will be written. If {@code pPhysicalDeviceCount} is smaller
	 * than the number of physical devices available, {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available physical
	 * devices were returned.</p>
	 * 
	 * <p>Once enumerated, general properties of the physical devices are queried by calling {@link #vkGetPhysicalDeviceProperties GetPhysicalDeviceProperties}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pPhysicalDeviceCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPhysicalDeviceCount} is not 0, and {@code pPhysicalDevices} is not {@code NULL}, {@code pPhysicalDevices} <b>must</b> be a
	 * pointer to an array of {@code pPhysicalDeviceCount} {@code VkPhysicalDevice} handles</li>
	 * </ul>
	 *
	 * @param instance             a handle to a Vulkan instance previously created with {@link #vkCreateInstance CreateInstance}
	 * @param pPhysicalDeviceCount a pointer to an integer related to the number of physical devices available or queried
	 * @param pPhysicalDevices     either {@code NULL} or a pointer to an array of {@code VkPhysicalDevice} handles
	 */
	public static int nvkEnumeratePhysicalDevices(VkInstance instance, long pPhysicalDeviceCount, long pPhysicalDevices) {
		long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDevices;
		return callPPPI(__functionAddress, instance.address(), pPhysicalDeviceCount, pPhysicalDevices);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumeratePhysicalDevices.html">Khronos Reference Page</a></p>
	 * 
	 * Retrieves a list of physical device objects representing the physical devices installed in the system.
	 * 
	 * <p>If {@code pPhysicalDevices} is {@code NULL}, then the number of physical devices available is returned in {@code pPhysicalDeviceCount}. Otherwise,
	 * {@code pPhysicalDeviceCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPhysicalDevices} array, and on return
	 * the variable is overwritten with the number of structures actually written to {@code pPhysicalDevices}. If {@code pPhysicalDeviceCount} is less than
	 * the number of physical devices available, at most {@code pPhysicalDeviceCount} structures will be written. If {@code pPhysicalDeviceCount} is smaller
	 * than the number of physical devices available, {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available physical
	 * devices were returned.</p>
	 * 
	 * <p>Once enumerated, general properties of the physical devices are queried by calling {@link #vkGetPhysicalDeviceProperties GetPhysicalDeviceProperties}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pPhysicalDeviceCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPhysicalDeviceCount} is not 0, and {@code pPhysicalDevices} is not {@code NULL}, {@code pPhysicalDevices} <b>must</b> be a
	 * pointer to an array of {@code pPhysicalDeviceCount} {@code VkPhysicalDevice} handles</li>
	 * </ul>
	 *
	 * @param instance             a handle to a Vulkan instance previously created with {@link #vkCreateInstance CreateInstance}
	 * @param pPhysicalDeviceCount a pointer to an integer related to the number of physical devices available or queried
	 * @param pPhysicalDevices     either {@code NULL} or a pointer to an array of {@code VkPhysicalDevice} handles
	 */
	public static int vkEnumeratePhysicalDevices(VkInstance instance, IntBuffer pPhysicalDeviceCount, PointerBuffer pPhysicalDevices) {
		if ( CHECKS ) {
			checkBuffer(pPhysicalDeviceCount, 1);
			if ( pPhysicalDevices != null ) checkBuffer(pPhysicalDevices, pPhysicalDeviceCount.get(pPhysicalDeviceCount.position()));
		}
		return nvkEnumeratePhysicalDevices(instance, memAddress(pPhysicalDeviceCount), memAddressSafe(pPhysicalDevices));
	}

	// --- [ vkGetPhysicalDeviceFeatures ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceFeatures.html">Khronos Reference Page</a></p>
	 * 
	 * Reports capabilities of a physical device.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pFeatures} <b>must</b> be a pointer to a {@link VkPhysicalDeviceFeatures} structure</li>
	 * </ul>
	 *
	 * @param physicalDevice the handle to the physical device whose properties will be queried
	 * @param pFeatures      points to an instance of the {@link VkPhysicalDeviceProperties} structure, that will be filled with returned information
	 */
	public static void nvkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, long pFeatures) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFeatures;
		callPPV(__functionAddress, physicalDevice.address(), pFeatures);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceFeatures.html">Khronos Reference Page</a></p>
	 * 
	 * Reports capabilities of a physical device.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pFeatures} <b>must</b> be a pointer to a {@link VkPhysicalDeviceFeatures} structure</li>
	 * </ul>
	 *
	 * @param physicalDevice the handle to the physical device whose properties will be queried
	 * @param pFeatures      points to an instance of the {@link VkPhysicalDeviceProperties} structure, that will be filled with returned information
	 */
	public static void vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures pFeatures) {
		nvkGetPhysicalDeviceFeatures(physicalDevice, pFeatures.address());
	}

	// --- [ vkGetPhysicalDeviceFormatProperties ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceFormatProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Lists physical device’s format capabilities.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
	 * <li>{@code pFormatProperties} <b>must</b> be a pointer to a {@link VkFormatProperties} structure</li>
	 * </ul>
	 *
	 * @param physicalDevice    the physical device from which to query the format properties
	 * @param format            the format whose properties are queried
	 * @param pFormatProperties a pointer to a {@link VkFormatProperties} structure in which physical device properties for format are returned
	 */
	public static void nvkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, int format, long pFormatProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFormatProperties;
		callPPV(__functionAddress, physicalDevice.address(), format, pFormatProperties);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceFormatProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Lists physical device’s format capabilities.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
	 * <li>{@code pFormatProperties} <b>must</b> be a pointer to a {@link VkFormatProperties} structure</li>
	 * </ul>
	 *
	 * @param physicalDevice    the physical device from which to query the format properties
	 * @param format            the format whose properties are queried
	 * @param pFormatProperties a pointer to a {@link VkFormatProperties} structure in which physical device properties for format are returned
	 */
	public static void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, int format, VkFormatProperties pFormatProperties) {
		nvkGetPhysicalDeviceFormatProperties(physicalDevice, format, pFormatProperties.address());
	}

	// --- [ vkGetPhysicalDeviceImageFormatProperties ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceImageFormatProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Lists physical device's image format capabilities.
	 * 
	 * <p>In addition to the minimum capabilities, implementations <b>may</b> support additional capabilities for certain types of images. For example, larger
	 * dimensions or additional sample counts for certain image types, or additional capabilities for linear tiling format images.</p>
	 * 
	 * <p>The {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} parameters correspond to parameters that would be consumed by
	 * {@link #vkCreateImage CreateImage}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
	 * <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
	 * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
	 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
	 * <li>{@code usage} <b>must not</b> be 0</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
	 * <li>{@code pImageFormatProperties} <b>must</b> be a pointer to a {@link VkImageFormatProperties} structure</li>
	 * </ul>
	 *
	 * @param physicalDevice         the physical device from which to query the image capabilities
	 * @param format                 the image format, corresponding to {@code VkImageCreateInfo.format}
	 * @param type                   the image type, corresponding to {@code VkImageCreateInfo.imageType}. One of:<br><table><tr><td>{@link #VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}</td><td>{@link #VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</td><td>{@link #VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</td></tr></table>
	 * @param tiling                 the image tiling, corresponding to {@code VkImageCreateInfo.tiling}. One of:<br><table><tr><td>{@link #VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}</td><td>{@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}</td></tr></table>
	 * @param usage                  the intended usage of the image, corresponding to {@code VkImageCreateInfo.usage}. One or more of:<br><table><tr><td>{@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT}</td><td>{@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}</td></tr><tr><td>{@link #VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}</td><td>{@link #VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}</td></tr><tr><td>{@link #VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</td><td>{@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</td></tr><tr><td>{@link #VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}</td><td>{@link #VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</td></tr></table>
	 * @param flags                  a bitfield describing additional parameters of the image, corresponding to {@code VkImageCreateInfo.flags}. One or more of:<br><table><tr><td>{@link #VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}</td><td>{@link #VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</td></tr><tr><td>{@link #VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}</td><td>{@link #VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT}</td></tr><tr><td>{@link #VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}</td></tr></table>
	 * @param pImageFormatProperties points to an instance of the {@link VkImageFormatProperties} structure in which capabilities are returned
	 */
	public static int nvkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, long pImageFormatProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceImageFormatProperties;
		return callPPI(__functionAddress, physicalDevice.address(), format, type, tiling, usage, flags, pImageFormatProperties);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceImageFormatProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Lists physical device's image format capabilities.
	 * 
	 * <p>In addition to the minimum capabilities, implementations <b>may</b> support additional capabilities for certain types of images. For example, larger
	 * dimensions or additional sample counts for certain image types, or additional capabilities for linear tiling format images.</p>
	 * 
	 * <p>The {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} parameters correspond to parameters that would be consumed by
	 * {@link #vkCreateImage CreateImage}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
	 * <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
	 * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
	 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
	 * <li>{@code usage} <b>must not</b> be 0</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
	 * <li>{@code pImageFormatProperties} <b>must</b> be a pointer to a {@link VkImageFormatProperties} structure</li>
	 * </ul>
	 *
	 * @param physicalDevice         the physical device from which to query the image capabilities
	 * @param format                 the image format, corresponding to {@code VkImageCreateInfo.format}
	 * @param type                   the image type, corresponding to {@code VkImageCreateInfo.imageType}. One of:<br><table><tr><td>{@link #VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}</td><td>{@link #VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</td><td>{@link #VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</td></tr></table>
	 * @param tiling                 the image tiling, corresponding to {@code VkImageCreateInfo.tiling}. One of:<br><table><tr><td>{@link #VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}</td><td>{@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}</td></tr></table>
	 * @param usage                  the intended usage of the image, corresponding to {@code VkImageCreateInfo.usage}. One or more of:<br><table><tr><td>{@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT}</td><td>{@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}</td></tr><tr><td>{@link #VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}</td><td>{@link #VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}</td></tr><tr><td>{@link #VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</td><td>{@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</td></tr><tr><td>{@link #VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}</td><td>{@link #VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</td></tr></table>
	 * @param flags                  a bitfield describing additional parameters of the image, corresponding to {@code VkImageCreateInfo.flags}. One or more of:<br><table><tr><td>{@link #VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}</td><td>{@link #VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</td></tr><tr><td>{@link #VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}</td><td>{@link #VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT}</td></tr><tr><td>{@link #VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}</td></tr></table>
	 * @param pImageFormatProperties points to an instance of the {@link VkImageFormatProperties} structure in which capabilities are returned
	 */
	public static int vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, VkImageFormatProperties pImageFormatProperties) {
		return nvkGetPhysicalDeviceImageFormatProperties(physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties.address());
	}

	// --- [ vkGetPhysicalDeviceProperties ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Returns properties of a physical device.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pProperties} <b>must</b> be a pointer to a {@link VkPhysicalDeviceProperties} structure</li>
	 * </ul>
	 *
	 * @param physicalDevice the handle to the physical device whose properties will be queried
	 * @param pProperties    points to an instance of the {@link VkPhysicalDeviceProperties} structure, that will be filled with returned information
	 */
	public static void nvkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, long pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceProperties;
		callPPV(__functionAddress, physicalDevice.address(), pProperties);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Returns properties of a physical device.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pProperties} <b>must</b> be a pointer to a {@link VkPhysicalDeviceProperties} structure</li>
	 * </ul>
	 *
	 * @param physicalDevice the handle to the physical device whose properties will be queried
	 * @param pProperties    points to an instance of the {@link VkPhysicalDeviceProperties} structure, that will be filled with returned information
	 */
	public static void vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties pProperties) {
		nvkGetPhysicalDeviceProperties(physicalDevice, pProperties.address());
	}

	// --- [ vkGetPhysicalDeviceQueueFamilyProperties ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceQueueFamilyProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Reports properties of the queues of the specified physical device.
	 * 
	 * <p>If {@code pQueueFamilyProperties} is {@code NULL}, then the number of queue families available is returned in {@code pQueueFamilyPropertyCount}. Otherwise,
	 * {@code pQueueFamilyPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pQueueFamilyProperties} array, and
	 * on return the variable is overwritten with the number of structures actually written to {@code pQueueFamilyProperties}. If the value of
	 * {@code pQueueFamilyPropertyCount} is less than the number of queue families available, at most {@code pQueueFamilyPropertyCount} structures will be
	 * written.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pQueueFamilyPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pQueueFamilyPropertyCount} is not 0, and {@code pQueueFamilyProperties} is not {@code NULL},
	 * {@code pQueueFamilyProperties} <b>must</b> be a pointer to an array of {@code pQueueFamilyPropertyCount} {@link VkQueueFamilyProperties} structures</li>
	 * </ul>
	 *
	 * @param physicalDevice            the handle to the physical device whose properties will be queried
	 * @param pQueueFamilyPropertyCount a pointer to an integer related to the number of queue families available or queried
	 * @param pQueueFamilyProperties    either {@code NULL} or a pointer to an array of {@link VkQueueFamilyProperties} structures
	 */
	public static void nvkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties;
		callPPPV(__functionAddress, physicalDevice.address(), pQueueFamilyPropertyCount, pQueueFamilyProperties);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceQueueFamilyProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Reports properties of the queues of the specified physical device.
	 * 
	 * <p>If {@code pQueueFamilyProperties} is {@code NULL}, then the number of queue families available is returned in {@code pQueueFamilyPropertyCount}. Otherwise,
	 * {@code pQueueFamilyPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pQueueFamilyProperties} array, and
	 * on return the variable is overwritten with the number of structures actually written to {@code pQueueFamilyProperties}. If the value of
	 * {@code pQueueFamilyPropertyCount} is less than the number of queue families available, at most {@code pQueueFamilyPropertyCount} structures will be
	 * written.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pQueueFamilyPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pQueueFamilyPropertyCount} is not 0, and {@code pQueueFamilyProperties} is not {@code NULL},
	 * {@code pQueueFamilyProperties} <b>must</b> be a pointer to an array of {@code pQueueFamilyPropertyCount} {@link VkQueueFamilyProperties} structures</li>
	 * </ul>
	 *
	 * @param physicalDevice            the handle to the physical device whose properties will be queried
	 * @param pQueueFamilyPropertyCount a pointer to an integer related to the number of queue families available or queried
	 * @param pQueueFamilyProperties    either {@code NULL} or a pointer to an array of {@link VkQueueFamilyProperties} structures
	 */
	public static void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, IntBuffer pQueueFamilyPropertyCount, VkQueueFamilyProperties.Buffer pQueueFamilyProperties) {
		if ( CHECKS ) {
			checkBuffer(pQueueFamilyPropertyCount, 1);
			if ( pQueueFamilyProperties != null ) checkBuffer(pQueueFamilyProperties, pQueueFamilyPropertyCount.get(pQueueFamilyPropertyCount.position()));
		}
		nvkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, memAddress(pQueueFamilyPropertyCount), pQueueFamilyProperties == null ? NULL : pQueueFamilyProperties.address());
	}

	// --- [ vkGetPhysicalDeviceMemoryProperties ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceMemoryProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Reports memory information for the specified physical device.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pMemoryProperties} <b>must</b> be a pointer to a {@link VkPhysicalDeviceMemoryProperties} structure</li>
	 * </ul>
	 *
	 * @param physicalDevice    the handle to the device to query
	 * @param pMemoryProperties points to an instance of {@link VkPhysicalDeviceMemoryProperties} structure in which the properties are returned
	 */
	public static void nvkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, long pMemoryProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceMemoryProperties;
		callPPV(__functionAddress, physicalDevice.address(), pMemoryProperties);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceMemoryProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Reports memory information for the specified physical device.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pMemoryProperties} <b>must</b> be a pointer to a {@link VkPhysicalDeviceMemoryProperties} structure</li>
	 * </ul>
	 *
	 * @param physicalDevice    the handle to the device to query
	 * @param pMemoryProperties points to an instance of {@link VkPhysicalDeviceMemoryProperties} structure in which the properties are returned
	 */
	public static void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties pMemoryProperties) {
		nvkGetPhysicalDeviceMemoryProperties(physicalDevice, pMemoryProperties.address());
	}

	// --- [ vkGetInstanceProcAddr ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetInstanceProcAddr.html">Khronos Reference Page</a></p>
	 * 
	 * Returns a function pointer for a command.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code instance} is not {@code NULL}, {@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pName} <b>must</b> be a null-terminated string</li>
	 * <li>If {@code instance} is {@code NULL}, {@code pName} <b>must</b> be one of: {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}, {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties} or
	 * {@link #vkCreateInstance CreateInstance}</li>
	 * <li>If {@code instance} is not {@code NULL}, {@code pName} <b>must</b> be the name of a core command or a command from an enabled extension, other than:
	 * {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}, {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties} or {@link #vkCreateInstance CreateInstance}</li>
	 * </ul>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>LWJGL Note</h5>
	 * 
	 * <p>LWJGL requires a non-{@code NULL} {@code instance} argument when calling this method. If {@code NULL} must be used, do the following:</p>
	 * 
	 * <pre><code>long GetInstanceProcAddr = VK.getFunctionProvider().getFunctionAddress("vkGetInstanceProcAddr");
long command = JNI.callPPP(GetInstanceProcAddr, NULL, pName);</code></pre>
	 * </div>
	 *
	 * @param instance the instance that the function pointer will be compatible with
	 * @param pName    the name of the command to obtain
	 */
	public static long nvkGetInstanceProcAddr(VkInstance instance, long pName) {
		long __functionAddress = instance.getCapabilities().vkGetInstanceProcAddr;
		return callPPP(__functionAddress, instance.address(), pName);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetInstanceProcAddr.html">Khronos Reference Page</a></p>
	 * 
	 * Returns a function pointer for a command.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code instance} is not {@code NULL}, {@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pName} <b>must</b> be a null-terminated string</li>
	 * <li>If {@code instance} is {@code NULL}, {@code pName} <b>must</b> be one of: {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}, {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties} or
	 * {@link #vkCreateInstance CreateInstance}</li>
	 * <li>If {@code instance} is not {@code NULL}, {@code pName} <b>must</b> be the name of a core command or a command from an enabled extension, other than:
	 * {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}, {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties} or {@link #vkCreateInstance CreateInstance}</li>
	 * </ul>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>LWJGL Note</h5>
	 * 
	 * <p>LWJGL requires a non-{@code NULL} {@code instance} argument when calling this method. If {@code NULL} must be used, do the following:</p>
	 * 
	 * <pre><code>long GetInstanceProcAddr = VK.getFunctionProvider().getFunctionAddress("vkGetInstanceProcAddr");
long command = JNI.callPPP(GetInstanceProcAddr, NULL, pName);</code></pre>
	 * </div>
	 *
	 * @param instance the instance that the function pointer will be compatible with
	 * @param pName    the name of the command to obtain
	 */
	public static long vkGetInstanceProcAddr(VkInstance instance, ByteBuffer pName) {
		if ( CHECKS )
			checkNT1(pName);
		return nvkGetInstanceProcAddr(instance, memAddress(pName));
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetInstanceProcAddr.html">Khronos Reference Page</a></p>
	 * 
	 * Returns a function pointer for a command.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code instance} is not {@code NULL}, {@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pName} <b>must</b> be a null-terminated string</li>
	 * <li>If {@code instance} is {@code NULL}, {@code pName} <b>must</b> be one of: {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}, {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties} or
	 * {@link #vkCreateInstance CreateInstance}</li>
	 * <li>If {@code instance} is not {@code NULL}, {@code pName} <b>must</b> be the name of a core command or a command from an enabled extension, other than:
	 * {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}, {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties} or {@link #vkCreateInstance CreateInstance}</li>
	 * </ul>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>LWJGL Note</h5>
	 * 
	 * <p>LWJGL requires a non-{@code NULL} {@code instance} argument when calling this method. If {@code NULL} must be used, do the following:</p>
	 * 
	 * <pre><code>long GetInstanceProcAddr = VK.getFunctionProvider().getFunctionAddress("vkGetInstanceProcAddr");
long command = JNI.callPPP(GetInstanceProcAddr, NULL, pName);</code></pre>
	 * </div>
	 *
	 * @param instance the instance that the function pointer will be compatible with
	 * @param pName    the name of the command to obtain
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

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetDeviceProcAddr.html">Khronos Reference Page</a></p>
	 * 
	 * Returns a device-specific function pointer for a command.
	 * 
	 * <p>In order to support systems with multiple Vulkan implementations comprising heterogeneous collections of hardware and software, the function pointers
	 * returned by {@link #vkGetInstanceProcAddr GetInstanceProcAddr} <b>may</b> point to dispatch code, which calls a different real implementation for different {@code VkDevice} objects (and
	 * objects created from them). The overhead of this internal dispatch <b>can</b> be avoided by obtaining device-specific function pointers for any commands that
	 * use a device or device-child object as their dispatchable object.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pName} <b>must</b> be a null-terminated string</li>
	 * <li>{@code pName} <b>must</b> be the name of a supported command that has a first parameter of type {@code VkDevice}, {@code VkQueue} or
	 * {@code VkCommandBuffer}, either in the core API or an enabled extension</li>
	 * </ul>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>LWJGL Note</h5>
	 * 
	 * <p>The function pointers used by LWJGL for commands that have a first parameter of type {@link VkDevice}, {@link VkQueue} or {@link VkCommandBuffer}, have been acquired
	 * using this command.</p>
	 * </div>
	 *
	 * @param device the logical device that provides the function pointer
	 * @param pName  the name of any Vulkan command whose first parameter is one of
	 *               
	 *               <ul>
	 *               <li>{@link VkDevice}</li>
	 *               <li>{@link VkQueue}</li>
	 *               <li>{@link VkCommandBuffer}</li>
	 *               </ul>
	 *               
	 *               <p>If {@code pName} is not the name of one of these Vulkan commands, and is not the name of an extension command belonging to an extension enabled for
	 *               device, then {@code vkGetDeviceProcAddr} will return {@code NULL}.</p>
	 */
	public static long nvkGetDeviceProcAddr(VkDevice device, long pName) {
		long __functionAddress = device.getCapabilities().vkGetDeviceProcAddr;
		return callPPP(__functionAddress, device.address(), pName);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetDeviceProcAddr.html">Khronos Reference Page</a></p>
	 * 
	 * Returns a device-specific function pointer for a command.
	 * 
	 * <p>In order to support systems with multiple Vulkan implementations comprising heterogeneous collections of hardware and software, the function pointers
	 * returned by {@link #vkGetInstanceProcAddr GetInstanceProcAddr} <b>may</b> point to dispatch code, which calls a different real implementation for different {@code VkDevice} objects (and
	 * objects created from them). The overhead of this internal dispatch <b>can</b> be avoided by obtaining device-specific function pointers for any commands that
	 * use a device or device-child object as their dispatchable object.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pName} <b>must</b> be a null-terminated string</li>
	 * <li>{@code pName} <b>must</b> be the name of a supported command that has a first parameter of type {@code VkDevice}, {@code VkQueue} or
	 * {@code VkCommandBuffer}, either in the core API or an enabled extension</li>
	 * </ul>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>LWJGL Note</h5>
	 * 
	 * <p>The function pointers used by LWJGL for commands that have a first parameter of type {@link VkDevice}, {@link VkQueue} or {@link VkCommandBuffer}, have been acquired
	 * using this command.</p>
	 * </div>
	 *
	 * @param device the logical device that provides the function pointer
	 * @param pName  the name of any Vulkan command whose first parameter is one of
	 *               
	 *               <ul>
	 *               <li>{@link VkDevice}</li>
	 *               <li>{@link VkQueue}</li>
	 *               <li>{@link VkCommandBuffer}</li>
	 *               </ul>
	 *               
	 *               <p>If {@code pName} is not the name of one of these Vulkan commands, and is not the name of an extension command belonging to an extension enabled for
	 *               device, then {@code vkGetDeviceProcAddr} will return {@code NULL}.</p>
	 */
	public static long vkGetDeviceProcAddr(VkDevice device, ByteBuffer pName) {
		if ( CHECKS )
			checkNT1(pName);
		return nvkGetDeviceProcAddr(device, memAddress(pName));
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetDeviceProcAddr.html">Khronos Reference Page</a></p>
	 * 
	 * Returns a device-specific function pointer for a command.
	 * 
	 * <p>In order to support systems with multiple Vulkan implementations comprising heterogeneous collections of hardware and software, the function pointers
	 * returned by {@link #vkGetInstanceProcAddr GetInstanceProcAddr} <b>may</b> point to dispatch code, which calls a different real implementation for different {@code VkDevice} objects (and
	 * objects created from them). The overhead of this internal dispatch <b>can</b> be avoided by obtaining device-specific function pointers for any commands that
	 * use a device or device-child object as their dispatchable object.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pName} <b>must</b> be a null-terminated string</li>
	 * <li>{@code pName} <b>must</b> be the name of a supported command that has a first parameter of type {@code VkDevice}, {@code VkQueue} or
	 * {@code VkCommandBuffer}, either in the core API or an enabled extension</li>
	 * </ul>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>LWJGL Note</h5>
	 * 
	 * <p>The function pointers used by LWJGL for commands that have a first parameter of type {@link VkDevice}, {@link VkQueue} or {@link VkCommandBuffer}, have been acquired
	 * using this command.</p>
	 * </div>
	 *
	 * @param device the logical device that provides the function pointer
	 * @param pName  the name of any Vulkan command whose first parameter is one of
	 *               
	 *               <ul>
	 *               <li>{@link VkDevice}</li>
	 *               <li>{@link VkQueue}</li>
	 *               <li>{@link VkCommandBuffer}</li>
	 *               </ul>
	 *               
	 *               <p>If {@code pName} is not the name of one of these Vulkan commands, and is not the name of an extension command belonging to an extension enabled for
	 *               device, then {@code vkGetDeviceProcAddr} will return {@code NULL}.</p>
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

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateDevice.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new logical device instance.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkDeviceCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pDevice} <b>must</b> be a pointer to a {@code VkDevice} handle</li>
	 * </ul>
	 *
	 * @param physicalDevice <b>must</b> be one of the device handles returned from a call to {@link #vkEnumeratePhysicalDevices EnumeratePhysicalDevices}
	 * @param pCreateInfo    a pointer to a {@link VkDeviceCreateInfo} structure containing information about how to create the device
	 * @param pAllocator     controls host memory allocation
	 * @param pDevice        points to a handle in which the created {@code VkDevice} is returned
	 */
	public static int nvkCreateDevice(VkPhysicalDevice physicalDevice, long pCreateInfo, long pAllocator, long pDevice) {
		long __functionAddress = physicalDevice.getCapabilities().vkCreateDevice;
		if ( CHECKS ) {
			VkDeviceCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, physicalDevice.address(), pCreateInfo, pAllocator, pDevice);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateDevice.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new logical device instance.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkDeviceCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pDevice} <b>must</b> be a pointer to a {@code VkDevice} handle</li>
	 * </ul>
	 *
	 * @param physicalDevice <b>must</b> be one of the device handles returned from a call to {@link #vkEnumeratePhysicalDevices EnumeratePhysicalDevices}
	 * @param pCreateInfo    a pointer to a {@link VkDeviceCreateInfo} structure containing information about how to create the device
	 * @param pAllocator     controls host memory allocation
	 * @param pDevice        points to a handle in which the created {@code VkDevice} is returned
	 */
	public static int vkCreateDevice(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, PointerBuffer pDevice) {
		if ( CHECKS )
			checkBuffer(pDevice, 1);
		return nvkCreateDevice(physicalDevice, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pDevice));
	}

	// --- [ vkDestroyDevice ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyDevice.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a logical device.
	 * 
	 * <p>To ensure that no work is active on the device, {@link #vkDeviceWaitIdle DeviceWaitIdle} <b>can</b> be used to gate the destruction of the device. Prior to destroying a device, an
	 * application is responsible for destroying/freeing any Vulkan objects that were created using that device as the first parameter of the corresponding
	 * {@code vkCreate*} or {@code vkAllocate*} command.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>The lifetime of each of these objects is bound by the lifetime of the {@code VkDevice} object. Therefore, to avoid resource leaks, it is critical
	 * that an application explicitly free all of these resources prior to calling {@code vkDestroyDevice}.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code device} is not {@code NULL}, {@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>All child objects created on {@code device} <b>must</b> have been destroyed prior to destroying {@code device}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code device} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code device} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code device} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroyDevice(VkDevice device, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyDevice;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPPV(__functionAddress, device.address(), pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyDevice.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a logical device.
	 * 
	 * <p>To ensure that no work is active on the device, {@link #vkDeviceWaitIdle DeviceWaitIdle} <b>can</b> be used to gate the destruction of the device. Prior to destroying a device, an
	 * application is responsible for destroying/freeing any Vulkan objects that were created using that device as the first parameter of the corresponding
	 * {@code vkCreate*} or {@code vkAllocate*} command.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>The lifetime of each of these objects is bound by the lifetime of the {@code VkDevice} object. Therefore, to avoid resource leaks, it is critical
	 * that an application explicitly free all of these resources prior to calling {@code vkDestroyDevice}.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code device} is not {@code NULL}, {@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>All child objects created on {@code device} <b>must</b> have been destroyed prior to destroying {@code device}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code device} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code device} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code device} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroyDevice(VkDevice device, VkAllocationCallbacks pAllocator) {
		nvkDestroyDevice(device, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkEnumerateInstanceExtensionProperties ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateInstanceExtensionProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the available instance extensions.
	 * 
	 * <p>Extensions <b>may</b> define new Vulkan commands, structures, and enumerants. For compilation purposes, the interfaces defined by registered extensions,
	 * including new structures and enumerants as well as function pointer types for new commands, are defined in the Khronos-supplied vulkan.h together with
	 * the core API. However, commands defined by extensions may not be available for static linking - in which case function pointers to these commands
	 * <b>should</b> be queried at runtime. Extensions <b>may</b> be provided by layers as well as by a Vulkan implementation.</p>
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of extensions properties available is returned in {@code pPropertyCount}. Otherwise,
	 * {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable
	 * is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of
	 * extension properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of
	 * extensions available, {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available properties were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated string</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an
	 * array of {@code pPropertyCount} {@link VkExtensionProperties} structures</li>
	 * <li>If {@code pLayerName} is not {@code NULL}, it <b>must</b> be the name of a layer returned by {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties}</li>
	 * </ul>
	 * 
	 * <p>When {@code pLayerName} parameter is {@code NULL}, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When
	 * {@code pLayerName} is the name of a layer, the instance extensions provided by that layer are returned.</p>
	 * 
	 * <p>To enable an instance extension, the name of the extension <b>should</b> be added to the {@code ppEnabledExtensionNames} member of {@link VkInstanceCreateInfo} when
	 * creating a {@code VkInstance}.</p>
	 *
	 * @param pLayerName     either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from
	 * @param pPropertyCount a pointer to an integer related to the number of extension properties available or queried
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkExtensionProperties} structures
	 */
	public static int nvkEnumerateInstanceExtensionProperties(long pLayerName, long pPropertyCount, long pProperties) {
		long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceExtensionProperties;
		return callPPPI(__functionAddress, pLayerName, pPropertyCount, pProperties);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateInstanceExtensionProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the available instance extensions.
	 * 
	 * <p>Extensions <b>may</b> define new Vulkan commands, structures, and enumerants. For compilation purposes, the interfaces defined by registered extensions,
	 * including new structures and enumerants as well as function pointer types for new commands, are defined in the Khronos-supplied vulkan.h together with
	 * the core API. However, commands defined by extensions may not be available for static linking - in which case function pointers to these commands
	 * <b>should</b> be queried at runtime. Extensions <b>may</b> be provided by layers as well as by a Vulkan implementation.</p>
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of extensions properties available is returned in {@code pPropertyCount}. Otherwise,
	 * {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable
	 * is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of
	 * extension properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of
	 * extensions available, {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available properties were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated string</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an
	 * array of {@code pPropertyCount} {@link VkExtensionProperties} structures</li>
	 * <li>If {@code pLayerName} is not {@code NULL}, it <b>must</b> be the name of a layer returned by {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties}</li>
	 * </ul>
	 * 
	 * <p>When {@code pLayerName} parameter is {@code NULL}, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When
	 * {@code pLayerName} is the name of a layer, the instance extensions provided by that layer are returned.</p>
	 * 
	 * <p>To enable an instance extension, the name of the extension <b>should</b> be added to the {@code ppEnabledExtensionNames} member of {@link VkInstanceCreateInfo} when
	 * creating a {@code VkInstance}.</p>
	 *
	 * @param pLayerName     either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from
	 * @param pPropertyCount a pointer to an integer related to the number of extension properties available or queried
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkExtensionProperties} structures
	 */
	public static int vkEnumerateInstanceExtensionProperties(ByteBuffer pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			if ( pLayerName != null ) checkNT1(pLayerName);
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateInstanceExtensionProperties(memAddressSafe(pLayerName), memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateInstanceExtensionProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the available instance extensions.
	 * 
	 * <p>Extensions <b>may</b> define new Vulkan commands, structures, and enumerants. For compilation purposes, the interfaces defined by registered extensions,
	 * including new structures and enumerants as well as function pointer types for new commands, are defined in the Khronos-supplied vulkan.h together with
	 * the core API. However, commands defined by extensions may not be available for static linking - in which case function pointers to these commands
	 * <b>should</b> be queried at runtime. Extensions <b>may</b> be provided by layers as well as by a Vulkan implementation.</p>
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of extensions properties available is returned in {@code pPropertyCount}. Otherwise,
	 * {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable
	 * is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of
	 * extension properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of
	 * extensions available, {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available properties were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated string</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an
	 * array of {@code pPropertyCount} {@link VkExtensionProperties} structures</li>
	 * <li>If {@code pLayerName} is not {@code NULL}, it <b>must</b> be the name of a layer returned by {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties}</li>
	 * </ul>
	 * 
	 * <p>When {@code pLayerName} parameter is {@code NULL}, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When
	 * {@code pLayerName} is the name of a layer, the instance extensions provided by that layer are returned.</p>
	 * 
	 * <p>To enable an instance extension, the name of the extension <b>should</b> be added to the {@code ppEnabledExtensionNames} member of {@link VkInstanceCreateInfo} when
	 * creating a {@code VkInstance}.</p>
	 *
	 * @param pLayerName     either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from
	 * @param pPropertyCount a pointer to an integer related to the number of extension properties available or queried
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkExtensionProperties} structures
	 */
	public static int vkEnumerateInstanceExtensionProperties(CharSequence pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pLayerNameEncoded = stack.UTF8(pLayerName);
			return nvkEnumerateInstanceExtensionProperties(memAddressSafe(pLayerNameEncoded), memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ vkEnumerateDeviceExtensionProperties ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateDeviceExtensionProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the extensions available to a given physical device.
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of extensions properties available is returned in {@code pPropertyCount}. Otherwise,
	 * {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable
	 * is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of extension
	 * properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of extensions
	 * available, {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available properties were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated string</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an
	 * array of {@code pPropertyCount} {@link VkExtensionProperties} structures</li>
	 * <li>If {@code pLayerName} is not {@code NULL}, it <b>must</b> be the name of a layer returned by {@link #vkEnumerateDeviceLayerProperties EnumerateDeviceLayerProperties}</li>
	 * </ul>
	 * 
	 * <p>When {@code pLayerName} parameter is {@code NULL}, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When
	 * {@code pLayerName} is the name of a layer, the device extensions provided by that layer are returned.</p>
	 * 
	 * <p>To enable a device layer, the name of the layer <b>should</b> be added to the {@code ppEnabledExtensionNames} member of {@link VkDeviceCreateInfo} when creating a
	 * {@code VkDevice}.</p>
	 *
	 * @param physicalDevice the physical device that will be queried
	 * @param pLayerName     either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from
	 * @param pPropertyCount a pointer to an integer related to the number of extension properties available or queried
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkExtensionProperties} structures
	 */
	public static int nvkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, long pLayerName, long pPropertyCount, long pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceExtensionProperties;
		return callPPPPI(__functionAddress, physicalDevice.address(), pLayerName, pPropertyCount, pProperties);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateDeviceExtensionProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the extensions available to a given physical device.
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of extensions properties available is returned in {@code pPropertyCount}. Otherwise,
	 * {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable
	 * is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of extension
	 * properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of extensions
	 * available, {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available properties were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated string</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an
	 * array of {@code pPropertyCount} {@link VkExtensionProperties} structures</li>
	 * <li>If {@code pLayerName} is not {@code NULL}, it <b>must</b> be the name of a layer returned by {@link #vkEnumerateDeviceLayerProperties EnumerateDeviceLayerProperties}</li>
	 * </ul>
	 * 
	 * <p>When {@code pLayerName} parameter is {@code NULL}, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When
	 * {@code pLayerName} is the name of a layer, the device extensions provided by that layer are returned.</p>
	 * 
	 * <p>To enable a device layer, the name of the layer <b>should</b> be added to the {@code ppEnabledExtensionNames} member of {@link VkDeviceCreateInfo} when creating a
	 * {@code VkDevice}.</p>
	 *
	 * @param physicalDevice the physical device that will be queried
	 * @param pLayerName     either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from
	 * @param pPropertyCount a pointer to an integer related to the number of extension properties available or queried
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkExtensionProperties} structures
	 */
	public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, ByteBuffer pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			if ( pLayerName != null ) checkNT1(pLayerName);
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateDeviceExtensionProperties(physicalDevice, memAddressSafe(pLayerName), memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateDeviceExtensionProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the extensions available to a given physical device.
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of extensions properties available is returned in {@code pPropertyCount}. Otherwise,
	 * {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable
	 * is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of extension
	 * properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of extensions
	 * available, {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available properties were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated string</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an
	 * array of {@code pPropertyCount} {@link VkExtensionProperties} structures</li>
	 * <li>If {@code pLayerName} is not {@code NULL}, it <b>must</b> be the name of a layer returned by {@link #vkEnumerateDeviceLayerProperties EnumerateDeviceLayerProperties}</li>
	 * </ul>
	 * 
	 * <p>When {@code pLayerName} parameter is {@code NULL}, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When
	 * {@code pLayerName} is the name of a layer, the device extensions provided by that layer are returned.</p>
	 * 
	 * <p>To enable a device layer, the name of the layer <b>should</b> be added to the {@code ppEnabledExtensionNames} member of {@link VkDeviceCreateInfo} when creating a
	 * {@code VkDevice}.</p>
	 *
	 * @param physicalDevice the physical device that will be queried
	 * @param pLayerName     either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from
	 * @param pPropertyCount a pointer to an integer related to the number of extension properties available or queried
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkExtensionProperties} structures
	 */
	public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, CharSequence pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pLayerNameEncoded = stack.UTF8(pLayerName);
			return nvkEnumerateDeviceExtensionProperties(physicalDevice, memAddressSafe(pLayerNameEncoded), memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ vkEnumerateInstanceLayerProperties ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateInstanceLayerProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the available instance layers.
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of layer properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount}
	 * <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with
	 * the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of layer properties available, at
	 * most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of layers available, {@link #VK_INCOMPLETE INCOMPLETE} will be
	 * returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available layer properties were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an
	 * array of {@code pPropertyCount} {@link VkLayerProperties} structures</li>
	 * </ul>
	 * 
	 * <p>To enable an instance layer, the name of the layer <b>should</b> be added to the {@code ppEnabledLayerNames} member of {@link VkInstanceCreateInfo} when creating a
	 * {@code VkInstance}.</p>
	 * 
	 * <p>When a layer is enabled, it inserts itself into the call chain for Vulkan commands the layer is interested in. A common use of layers is to validate
	 * application behavior during development. For example, the implementation will not check that Vulkan enums used by the application fall within allowed
	 * ranges. Instead, a validation layer would do those checks and flag issues. This avoids a performance penalty during production use of the application
	 * because those layers would not be enabled in production.</p>
	 *
	 * @param pPropertyCount a pointer to an integer related to the number of layer properties available or queried
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkLayerProperties} structures
	 */
	public static int nvkEnumerateInstanceLayerProperties(long pPropertyCount, long pProperties) {
		long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceLayerProperties;
		return callPPI(__functionAddress, pPropertyCount, pProperties);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateInstanceLayerProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the available instance layers.
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of layer properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount}
	 * <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with
	 * the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of layer properties available, at
	 * most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of layers available, {@link #VK_INCOMPLETE INCOMPLETE} will be
	 * returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available layer properties were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an
	 * array of {@code pPropertyCount} {@link VkLayerProperties} structures</li>
	 * </ul>
	 * 
	 * <p>To enable an instance layer, the name of the layer <b>should</b> be added to the {@code ppEnabledLayerNames} member of {@link VkInstanceCreateInfo} when creating a
	 * {@code VkInstance}.</p>
	 * 
	 * <p>When a layer is enabled, it inserts itself into the call chain for Vulkan commands the layer is interested in. A common use of layers is to validate
	 * application behavior during development. For example, the implementation will not check that Vulkan enums used by the application fall within allowed
	 * ranges. Instead, a validation layer would do those checks and flag issues. This avoids a performance penalty during production use of the application
	 * because those layers would not be enabled in production.</p>
	 *
	 * @param pPropertyCount a pointer to an integer related to the number of layer properties available or queried
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkLayerProperties} structures
	 */
	public static int vkEnumerateInstanceLayerProperties(IntBuffer pPropertyCount, VkLayerProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateInstanceLayerProperties(memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	// --- [ vkEnumerateDeviceLayerProperties ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateDeviceLayerProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the available device layers.
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of layer properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount}
	 * <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with
	 * the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of layer properties
	 * available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of layers available,
	 * {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available layer properties were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an
	 * array of {@code pPropertyCount} {@link VkLayerProperties} structures</li>
	 * </ul>
	 * 
	 * <p>To enable a device layer, the name of the layer <b>should</b> be added to the {@code ppEnabledLayerNames} member of {@link VkDeviceCreateInfo} when creating a
	 * {@code VkDevice}.</p>
	 * 
	 * <p>Loader implementations <b>may</b> provide mechanisms outside the Vulkan API for enabling specific layers. Layers enabled through such a mechanism are
	 * implicitly enabled, while layers enabled by including the layer name in the {@code ppEnabledLayerNames} member of {@link VkDeviceCreateInfo} are explicitly
	 * enabled. Except where otherwise specified, implicitly enabled and explicitly enabled layers differ only in the way they are enabled. Explicitly
	 * enabling a layer that is implicitly enabled has no additional effect.</p>
	 *
	 * @param physicalDevice the physical device that will be queried
	 * @param pPropertyCount a pointer to an integer related to the number of layer properties available or queried
	 * @param pProperties    either {@code NULL} or a pointer to an array of VkLayerProperties structures
	 */
	public static int nvkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceLayerProperties;
		return callPPPI(__functionAddress, physicalDevice.address(), pPropertyCount, pProperties);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateDeviceLayerProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the available device layers.
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of layer properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount}
	 * <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with
	 * the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of layer properties
	 * available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of layers available,
	 * {@link #VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link #VK_SUCCESS SUCCESS}, to indicate that not all the available layer properties were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an
	 * array of {@code pPropertyCount} {@link VkLayerProperties} structures</li>
	 * </ul>
	 * 
	 * <p>To enable a device layer, the name of the layer <b>should</b> be added to the {@code ppEnabledLayerNames} member of {@link VkDeviceCreateInfo} when creating a
	 * {@code VkDevice}.</p>
	 * 
	 * <p>Loader implementations <b>may</b> provide mechanisms outside the Vulkan API for enabling specific layers. Layers enabled through such a mechanism are
	 * implicitly enabled, while layers enabled by including the layer name in the {@code ppEnabledLayerNames} member of {@link VkDeviceCreateInfo} are explicitly
	 * enabled. Except where otherwise specified, implicitly enabled and explicitly enabled layers differ only in the way they are enabled. Explicitly
	 * enabling a layer that is implicitly enabled has no additional effect.</p>
	 *
	 * @param physicalDevice the physical device that will be queried
	 * @param pPropertyCount a pointer to an integer related to the number of layer properties available or queried
	 * @param pProperties    either {@code NULL} or a pointer to an array of VkLayerProperties structures
	 */
	public static int vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, IntBuffer pPropertyCount, VkLayerProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateDeviceLayerProperties(physicalDevice, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	// --- [ vkGetDeviceQueue ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetDeviceQueue.html">Khronos Reference Page</a></p>
	 * 
	 * Retrieves a handle to a {@code VkQueue} object.
	 * 
	 * <p>The queue family index is used in multiple places in Vulkan in order to tie operations to a specific family of queues.</p>
	 * 
	 * <p>When retrieving a handle to the queue via {@code vkGetDeviceQueue}, the queue family index is used to select which queue family to retrieve the
	 * {@code VkQueue} handle from.</p>
	 * 
	 * <p>When creating a {@code VkCommandPool} object (see Command Pools), a queue family index is specified in the {@link VkCommandPoolCreateInfo} structure. Command
	 * buffers from this pool <b>can</b> only be submitted on queues corresponding to this queue family.</p>
	 * 
	 * <p>When creating {@code VkImage} and {@code VkBuffer} resources, a set of queue families is included in the {@link VkImageCreateInfo} and {@link VkBufferCreateInfo}
	 * structures to specify the queue families that <b>can</b> access the resource.</p>
	 * 
	 * <p>When inserting a {@link VkBufferMemoryBarrier} or {@link VkImageMemoryBarrier} a source and destination queue family index is specified to allow the ownership of a
	 * buffer or image to be transferred from one queue family to another.</p>
	 * 
	 * <p>Each queue is assigned a priority, as set in the {@link VkDeviceQueueCreateInfo} structures when creating the device. The priority of each queue is a
	 * normalized floating point value between 0.0 and 1.0, which is then translated to a discrete priority level by the implementation. Higher values
	 * indicate a higher priority, with 0.0 being the lowest priority and 1.0 being the highest.</p>
	 * 
	 * <p>Within the same device, queues with higher priority <b>may</b> be allotted more processing time than queues with lower priority. The implementation makes no
	 * guarantees with regards to ordering or scheduling among queues with the same priority, other than the constraints defined by explicit scheduling
	 * primitives. The implementation make no guarantees with regards to queues across different devices.</p>
	 * 
	 * <p>An implementation <b>may</b> allow a higher-priority queue to starve a lower-priority queue on the same {@code VkDevice} until the higher-priority queue has
	 * no further commands to execute. The relationship of queue priorities <b>must not</b> cause queues on one {@code VkDevice} to starve queues on another
	 * {@code VkDevice}.</p>
	 * 
	 * <p>No specific guarantees are made about higher priority queues receiving more processing time or better quality of service than lower priority queues.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pQueue} <b>must</b> be a pointer to a {@code VkQueue} handle</li>
	 * <li>{@code queueFamilyIndex} <b>must</b> be one of the queue family indices specified when {@code device} was created, via the {@link VkDeviceQueueCreateInfo}
	 * structure</li>
	 * <li>{@code queueIndex} <b>must</b> be less than the number of queues created for the specified queue family index when {@code device} was created, via the
	 * {@code queueCount} member of the {@link VkDeviceQueueCreateInfo} structure</li>
	 * </ul>
	 *
	 * @param device           the logical device that owns the queue
	 * @param queueFamilyIndex the index of the queue family to which the queue belongs
	 * @param queueIndex       the index within this queue family of the queue to retrieve
	 * @param pQueue           a pointer to a {@code VkQueue} object that will be filled with the handle for the requested queue
	 */
	public static void nvkGetDeviceQueue(VkDevice device, int queueFamilyIndex, int queueIndex, long pQueue) {
		long __functionAddress = device.getCapabilities().vkGetDeviceQueue;
		callPPV(__functionAddress, device.address(), queueFamilyIndex, queueIndex, pQueue);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetDeviceQueue.html">Khronos Reference Page</a></p>
	 * 
	 * Retrieves a handle to a {@code VkQueue} object.
	 * 
	 * <p>The queue family index is used in multiple places in Vulkan in order to tie operations to a specific family of queues.</p>
	 * 
	 * <p>When retrieving a handle to the queue via {@code vkGetDeviceQueue}, the queue family index is used to select which queue family to retrieve the
	 * {@code VkQueue} handle from.</p>
	 * 
	 * <p>When creating a {@code VkCommandPool} object (see Command Pools), a queue family index is specified in the {@link VkCommandPoolCreateInfo} structure. Command
	 * buffers from this pool <b>can</b> only be submitted on queues corresponding to this queue family.</p>
	 * 
	 * <p>When creating {@code VkImage} and {@code VkBuffer} resources, a set of queue families is included in the {@link VkImageCreateInfo} and {@link VkBufferCreateInfo}
	 * structures to specify the queue families that <b>can</b> access the resource.</p>
	 * 
	 * <p>When inserting a {@link VkBufferMemoryBarrier} or {@link VkImageMemoryBarrier} a source and destination queue family index is specified to allow the ownership of a
	 * buffer or image to be transferred from one queue family to another.</p>
	 * 
	 * <p>Each queue is assigned a priority, as set in the {@link VkDeviceQueueCreateInfo} structures when creating the device. The priority of each queue is a
	 * normalized floating point value between 0.0 and 1.0, which is then translated to a discrete priority level by the implementation. Higher values
	 * indicate a higher priority, with 0.0 being the lowest priority and 1.0 being the highest.</p>
	 * 
	 * <p>Within the same device, queues with higher priority <b>may</b> be allotted more processing time than queues with lower priority. The implementation makes no
	 * guarantees with regards to ordering or scheduling among queues with the same priority, other than the constraints defined by explicit scheduling
	 * primitives. The implementation make no guarantees with regards to queues across different devices.</p>
	 * 
	 * <p>An implementation <b>may</b> allow a higher-priority queue to starve a lower-priority queue on the same {@code VkDevice} until the higher-priority queue has
	 * no further commands to execute. The relationship of queue priorities <b>must not</b> cause queues on one {@code VkDevice} to starve queues on another
	 * {@code VkDevice}.</p>
	 * 
	 * <p>No specific guarantees are made about higher priority queues receiving more processing time or better quality of service than lower priority queues.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pQueue} <b>must</b> be a pointer to a {@code VkQueue} handle</li>
	 * <li>{@code queueFamilyIndex} <b>must</b> be one of the queue family indices specified when {@code device} was created, via the {@link VkDeviceQueueCreateInfo}
	 * structure</li>
	 * <li>{@code queueIndex} <b>must</b> be less than the number of queues created for the specified queue family index when {@code device} was created, via the
	 * {@code queueCount} member of the {@link VkDeviceQueueCreateInfo} structure</li>
	 * </ul>
	 *
	 * @param device           the logical device that owns the queue
	 * @param queueFamilyIndex the index of the queue family to which the queue belongs
	 * @param queueIndex       the index within this queue family of the queue to retrieve
	 * @param pQueue           a pointer to a {@code VkQueue} object that will be filled with the handle for the requested queue
	 */
	public static void vkGetDeviceQueue(VkDevice device, int queueFamilyIndex, int queueIndex, PointerBuffer pQueue) {
		if ( CHECKS )
			checkBuffer(pQueue, 1);
		nvkGetDeviceQueue(device, queueFamilyIndex, queueIndex, memAddress(pQueue));
	}

	// --- [ vkQueueSubmit ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkQueueSubmit.html">Khronos Reference Page</a></p>
	 * 
	 * Submits a sequence of semaphores or command buffers to a queue.
	 * 
	 * <p>Each call to {@code vkQueueSubmit} submits zero or more batches of work to the queue for execution. {@code submitCount} is used to specify the number
	 * of batches to submit. Each batch includes zero or more semaphores to wait upon, and a corresponding set of stages that will wait for the semaphore to
	 * be signaled before executing any work, followed by a number of command buffers that will be executed, and finally, zero or more semaphores that will
	 * be signaled after command buffer execution completes. Each batch is represented as an instance of the {@link VkSubmitInfo} structure stored in an array, the
	 * address of which is passed in {@code pSubmits}.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>The exact definition of a submission is platform-specific, but is considered a relatively expensive operation. In general, applications <b>should</b>
	 * attempt to batch work together into as few calls to {@code vkQueueSubmit} as possible.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * <li>If {@code submitCount} is not 0, {@code pSubmits} <b>must</b> be a pointer to an array of {@code submitCount} valid {@link VkSubmitInfo} structures</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>Each of {@code queue} and {@code fence} that are valid handles <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be unsignaled</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must not</b> be associated with any other queue command that has not yet completed execution on
	 * that queue</li>
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
	 * @param queue       the handle of the queue that the command buffers will be submitted to
	 * @param submitCount the number of elements in the {@code pSubmits} array
	 * @param pSubmits    a pointer to an array of {@link VkSubmitInfo} structures which describe the work to submit. All work described by {@code pSubmits} <b>must</b> be submitted to
	 *                    the queue before the command returns.
	 * @param fence       an optional handle to a fence. If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, the fence is signaled when execution of all command buffers specified in the
	 *                    {@link VkSubmitInfo}{@code ::pCommandBuffers} members of {@code pSubmits} is complete, providing certain implicit ordering guarantees. If
	 *                    {@code submitCount} is zero but {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, the fence will still be submitted to the queue and will become signaled when all
	 *                    work previously submitted to the queue has completed.
	 */
	public static int nvkQueueSubmit(VkQueue queue, int submitCount, long pSubmits, long fence) {
		long __functionAddress = queue.getCapabilities().vkQueueSubmit;
		if ( CHECKS )
			if ( pSubmits != NULL ) VkSubmitInfo.validate(pSubmits, submitCount);
		return callPPJI(__functionAddress, queue.address(), submitCount, pSubmits, fence);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkQueueSubmit.html">Khronos Reference Page</a></p>
	 * 
	 * Submits a sequence of semaphores or command buffers to a queue.
	 * 
	 * <p>Each call to {@code vkQueueSubmit} submits zero or more batches of work to the queue for execution. {@code submitCount} is used to specify the number
	 * of batches to submit. Each batch includes zero or more semaphores to wait upon, and a corresponding set of stages that will wait for the semaphore to
	 * be signaled before executing any work, followed by a number of command buffers that will be executed, and finally, zero or more semaphores that will
	 * be signaled after command buffer execution completes. Each batch is represented as an instance of the {@link VkSubmitInfo} structure stored in an array, the
	 * address of which is passed in {@code pSubmits}.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>The exact definition of a submission is platform-specific, but is considered a relatively expensive operation. In general, applications <b>should</b>
	 * attempt to batch work together into as few calls to {@code vkQueueSubmit} as possible.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * <li>If {@code submitCount} is not 0, {@code pSubmits} <b>must</b> be a pointer to an array of {@code submitCount} valid {@link VkSubmitInfo} structures</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>Each of {@code queue} and {@code fence} that are valid handles <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be unsignaled</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must not</b> be associated with any other queue command that has not yet completed execution on
	 * that queue</li>
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
	 * @param queue    the handle of the queue that the command buffers will be submitted to
	 * @param pSubmits a pointer to an array of {@link VkSubmitInfo} structures which describe the work to submit. All work described by {@code pSubmits} <b>must</b> be submitted to
	 *                 the queue before the command returns.
	 * @param fence    an optional handle to a fence. If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, the fence is signaled when execution of all command buffers specified in the
	 *                 {@link VkSubmitInfo}{@code ::pCommandBuffers} members of {@code pSubmits} is complete, providing certain implicit ordering guarantees. If
	 *                 {@code submitCount} is zero but {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, the fence will still be submitted to the queue and will become signaled when all
	 *                 work previously submitted to the queue has completed.
	 */
	public static int vkQueueSubmit(VkQueue queue, VkSubmitInfo.Buffer pSubmits, long fence) {
		return nvkQueueSubmit(queue, pSubmits == null ? 0 : pSubmits.remaining(), pSubmits == null ? NULL : pSubmits.address(), fence);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkQueueSubmit.html">Khronos Reference Page</a></p>
	 * 
	 * Submits a sequence of semaphores or command buffers to a queue.
	 * 
	 * <p>Each call to {@code vkQueueSubmit} submits zero or more batches of work to the queue for execution. {@code submitCount} is used to specify the number
	 * of batches to submit. Each batch includes zero or more semaphores to wait upon, and a corresponding set of stages that will wait for the semaphore to
	 * be signaled before executing any work, followed by a number of command buffers that will be executed, and finally, zero or more semaphores that will
	 * be signaled after command buffer execution completes. Each batch is represented as an instance of the {@link VkSubmitInfo} structure stored in an array, the
	 * address of which is passed in {@code pSubmits}.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>The exact definition of a submission is platform-specific, but is considered a relatively expensive operation. In general, applications <b>should</b>
	 * attempt to batch work together into as few calls to {@code vkQueueSubmit} as possible.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * <li>If {@code submitCount} is not 0, {@code pSubmits} <b>must</b> be a pointer to an array of {@code submitCount} valid {@link VkSubmitInfo} structures</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>Each of {@code queue} and {@code fence} that are valid handles <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be unsignaled</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must not</b> be associated with any other queue command that has not yet completed execution on
	 * that queue</li>
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
	 * @param queue the handle of the queue that the command buffers will be submitted to
	 * @param fence an optional handle to a fence. If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, the fence is signaled when execution of all command buffers specified in the
	 *              {@link VkSubmitInfo}{@code ::pCommandBuffers} members of {@code pSubmits} is complete, providing certain implicit ordering guarantees. If
	 *              {@code submitCount} is zero but {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, the fence will still be submitted to the queue and will become signaled when all
	 *              work previously submitted to the queue has completed.
	 */
	public static int vkQueueSubmit(VkQueue queue, VkSubmitInfo pSubmit, long fence) {
		return nvkQueueSubmit(queue, 1, pSubmit.address(), fence);
	}

	// --- [ vkQueueWaitIdle ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkQueueWaitIdle.html">Khronos Reference Page</a></p>
	 * 
	 * Waits on the completion of all work within a single queue.
	 * 
	 * <p>{@code vkQueueWaitIdle} will block until all command buffers and sparse binding operations in the queue have completed.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * </ul>
	 *
	 * @param queue the queue on which to wait
	 */
	public static int vkQueueWaitIdle(VkQueue queue) {
		long __functionAddress = queue.getCapabilities().vkQueueWaitIdle;
		return callPI(__functionAddress, queue.address());
	}

	// --- [ vkDeviceWaitIdle ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDeviceWaitIdle.html">Khronos Reference Page</a></p>
	 * 
	 * Waits for a device to become idle.
	 * 
	 * <p>A device is active while any of its queues have work to process. Once all device queues are idle, the device is idle.</p>
	 * 
	 * <h5>Valid Usage</h5>
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
	 * @param device the logical device to idle
	 */
	public static int vkDeviceWaitIdle(VkDevice device) {
		long __functionAddress = device.getCapabilities().vkDeviceWaitIdle;
		return callPI(__functionAddress, device.address());
	}

	// --- [ vkAllocateMemory ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkAllocateMemory.html">Khronos Reference Page</a></p>
	 * 
	 * Allocates device memory.
	 * 
	 * <p>Allocations returned by {@code vkAllocateMemory} are guaranteed to meet any alignment requirement by the implementation. For example, if an
	 * implementation requires 128 byte alignment for images and 64 byte alignment for buffers, the device memory returned through this mechanism would be
	 * 128-byte aligned. This ensures that applications <b>can</b> correctly suballocate objects of different types (with potentially different alignment
	 * requirements) in the same memory object.</p>
	 * 
	 * <p>When memory is allocated, its contents are undefined.</p>
	 * 
	 * <p>There is an implementation-dependent maximum number of memory allocations which <b>can</b> be simultaneously created on a device. This is specified by the
	 * {@code maxMemoryAllocationCount} member of the {@link VkPhysicalDeviceLimits} structure. If {@code maxMemoryAllocationCount} is exceeded,
	 * {@code vkAllocateMemory} will return {@link #VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Some platforms <b>may</b> have a limit on the maximum size of a single allocation. For example, certain systems <b>may</b> fail to create allocations with a size
	 * greater than or equal to 4GB. Such a limit is implementation-dependent, and if such a failure occurs then the error {@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}
	 * <b>should</b> be returned.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pAllocateInfo} <b>must</b> be a pointer to a valid {@link VkMemoryAllocateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pMemory} <b>must</b> be a pointer to a {@code VkDeviceMemory} handle</li>
	 * <li>The number of currently valid memory objects, allocated from {@code device}, <b>must</b> be less than
	 * {@link VkPhysicalDeviceLimits}{@code ::maxMemoryAllocationCount}</li>
	 * </ul>
	 *
	 * @param device        the logical device that owns the memory
	 * @param pAllocateInfo a pointer to an instance of the {@link VkMemoryAllocateInfo} structure describing parameters of the allocation. A successful returned allocation <b>must</b>
	 *                      use the requested parameters -- no substitution is permitted by the implementation.
	 * @param pAllocator    controls host memory allocation
	 * @param pMemory       a pointer to a {@code VkDeviceMemory} handle in which information about the allocated memory is returned
	 */
	public static int nvkAllocateMemory(VkDevice device, long pAllocateInfo, long pAllocator, long pMemory) {
		long __functionAddress = device.getCapabilities().vkAllocateMemory;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pAllocateInfo, pAllocator, pMemory);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkAllocateMemory.html">Khronos Reference Page</a></p>
	 * 
	 * Allocates device memory.
	 * 
	 * <p>Allocations returned by {@code vkAllocateMemory} are guaranteed to meet any alignment requirement by the implementation. For example, if an
	 * implementation requires 128 byte alignment for images and 64 byte alignment for buffers, the device memory returned through this mechanism would be
	 * 128-byte aligned. This ensures that applications <b>can</b> correctly suballocate objects of different types (with potentially different alignment
	 * requirements) in the same memory object.</p>
	 * 
	 * <p>When memory is allocated, its contents are undefined.</p>
	 * 
	 * <p>There is an implementation-dependent maximum number of memory allocations which <b>can</b> be simultaneously created on a device. This is specified by the
	 * {@code maxMemoryAllocationCount} member of the {@link VkPhysicalDeviceLimits} structure. If {@code maxMemoryAllocationCount} is exceeded,
	 * {@code vkAllocateMemory} will return {@link #VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Some platforms <b>may</b> have a limit on the maximum size of a single allocation. For example, certain systems <b>may</b> fail to create allocations with a size
	 * greater than or equal to 4GB. Such a limit is implementation-dependent, and if such a failure occurs then the error {@link #VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}
	 * <b>should</b> be returned.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pAllocateInfo} <b>must</b> be a pointer to a valid {@link VkMemoryAllocateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pMemory} <b>must</b> be a pointer to a {@code VkDeviceMemory} handle</li>
	 * <li>The number of currently valid memory objects, allocated from {@code device}, <b>must</b> be less than
	 * {@link VkPhysicalDeviceLimits}{@code ::maxMemoryAllocationCount}</li>
	 * </ul>
	 *
	 * @param device        the logical device that owns the memory
	 * @param pAllocateInfo a pointer to an instance of the {@link VkMemoryAllocateInfo} structure describing parameters of the allocation. A successful returned allocation <b>must</b>
	 *                      use the requested parameters -- no substitution is permitted by the implementation.
	 * @param pAllocator    controls host memory allocation
	 * @param pMemory       a pointer to a {@code VkDeviceMemory} handle in which information about the allocated memory is returned
	 */
	public static int vkAllocateMemory(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, LongBuffer pMemory) {
		if ( CHECKS )
			checkBuffer(pMemory, 1);
		return nvkAllocateMemory(device, pAllocateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pMemory));
	}

	// --- [ vkFreeMemory ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkFreeMemory.html">Khronos Reference Page</a></p>
	 * 
	 * Frees a memory object.
	 * 
	 * <p>Before freeing a memory object, an application <b>must</b> ensure the memory object is no longer in use by the device — for example by command buffers queued
	 * for execution. The memory <b>can</b> remain bound to images or buffers at the time the memory object is freed, but any further use of them (on host or
	 * device) for anything other than destroying those objects will result in undefined behavior. If there are still any bound images or buffers, the memory
	 * <b>may</b> not be immediately released by the implementation, but <b>must</b> be released by the time all bound images and buffers have been destroyed. Once memory
	 * is released, it is returned to the heap from which it was allocated.</p>
	 * 
	 * <p>If a memory object is mapped at the time it is freed, it is implicitly unmapped.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code memory} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code memory} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code memory} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code memory} (via images or buffers) <b>must</b> have completed execution</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that owns the memory
	 * @param memory     the {@code VkDeviceMemory} object to be freed
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkFreeMemory(VkDevice device, long memory, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkFreeMemory;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), memory, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkFreeMemory.html">Khronos Reference Page</a></p>
	 * 
	 * Frees a memory object.
	 * 
	 * <p>Before freeing a memory object, an application <b>must</b> ensure the memory object is no longer in use by the device — for example by command buffers queued
	 * for execution. The memory <b>can</b> remain bound to images or buffers at the time the memory object is freed, but any further use of them (on host or
	 * device) for anything other than destroying those objects will result in undefined behavior. If there are still any bound images or buffers, the memory
	 * <b>may</b> not be immediately released by the implementation, but <b>must</b> be released by the time all bound images and buffers have been destroyed. Once memory
	 * is released, it is returned to the heap from which it was allocated.</p>
	 * 
	 * <p>If a memory object is mapped at the time it is freed, it is implicitly unmapped.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code memory} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code memory} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code memory} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code memory} (via images or buffers) <b>must</b> have completed execution</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that owns the memory
	 * @param memory     the {@code VkDeviceMemory} object to be freed
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkFreeMemory(VkDevice device, long memory, VkAllocationCallbacks pAllocator) {
		nvkFreeMemory(device, memory, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkMapMemory ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkMapMemory.html">Khronos Reference Page</a></p>
	 * 
	 * Retrieves a host virtual address pointer to a region of a mappable memory object.
	 * 
	 * <p>Memory objects created with {@link #vkAllocateMemory AllocateMemory} are not directly host accessible. Memory objects created with the memory property
	 * {@link #VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} are considered mappable. Memory objects <b>must</b> be mappable in order to be successfully mapped on the host.</p>
	 * 
	 * <p>It is an application error to call {@code vkMapMemory} on a memory object that is already mapped.</p>
	 * 
	 * <p>{@code vkMapMemory} does not check whether the device memory is currently in use before returning the host-accessible pointer. The application <b>must</b>
	 * guarantee that any previously submitted command that writes to this range has completed before the host reads from or writes to that range, and that
	 * any previously submitted command that reads from that range has completed before the host writes to that region. If the device memory was allocated
	 * without the {@link #VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT} set, these guarantees <b>must</b> be made for an extended range: the application <b>must</b> round down the start of
	 * the range to the nearest multiple of {@link VkPhysicalDeviceLimits}{@code ::nonCoherentAtomSize}, and round the end of the range up to the nearest multiple
	 * of {@code VkPhysicalDeviceLimits::nonCoherentAtomSize}.</p>
	 * 
	 * <p>While a range of device memory is mapped for host access, the application is responsible for synchronizing both device and host access to that memory
	 * range.</p>
	 * 
	 * <p>Host-visible memory types that advertise the {@link #VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT} property still require memory barriers between host and device in order
	 * to be coherent, but do not require additional cache management operations ({@link #vkFlushMappedMemoryRanges FlushMappedMemoryRanges} or {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges}) to achieve
	 * coherency. For host writes to be seen by subsequent command buffer operations, a pipeline barrier from a source of {@link #VK_ACCESS_HOST_WRITE_BIT ACCESS_HOST_WRITE_BIT} and
	 * {@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT} to a destination of the relevant device pipeline stages and access types <b>must</b> be performed. Note that such a barrier is
	 * performed implicitly upon each command buffer submission, so an explicit barrier is only rarely needed (e.g. if a command buffer waits upon an event
	 * signaled by the host, where the host wrote some data after submission). For device writes to be seen by subsequent host reads, a pipeline barrier is
	 * required to make the writes visible.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code flags} <b>must</b> be 0</li>
	 * <li>{@code ppData} <b>must</b> be a pointer to a pointer</li>
	 * <li>{@code memory} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code memory} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>{@code memory} <b>must not</b> currently be mapped</li>
	 * <li>{@code offset} <b>must</b> be less than the size of {@code memory}</li>
	 * <li>If {@code size} is not equal to {@link #VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be greater than 0</li>
	 * <li>If {@code size} is not equal to {@link #VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be less than or equal to the size of the {@code memory} minus {@code offset}</li>
	 * <li>{@code memory} <b>must</b> have been created with a memory type that reports {@link #VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device the logical device that owns the memory
	 * @param memory the {@code VkDeviceMemory} object to be mapped
	 * @param offset a zero-based byte offset from the beginning of the memory object
	 * @param size   he size of the memory range to map, or {@link #VK_WHOLE_SIZE WHOLE_SIZE} to map from offset to the end of the allocation
	 * @param flags  reserved for future use, and <b>must</b> be zero
	 * @param ppData points to a pointer in which is returned a host-accessible pointer to the beginning of the mapped range. This pointer minus offset <b>must</b> be aligned
	 *               to at least {@link VkPhysicalDeviceLimits}{@code ::minMemoryMapAlignment}.
	 */
	public static int nvkMapMemory(VkDevice device, long memory, long offset, long size, int flags, long ppData) {
		long __functionAddress = device.getCapabilities().vkMapMemory;
		return callPJJJPI(__functionAddress, device.address(), memory, offset, size, flags, ppData);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkMapMemory.html">Khronos Reference Page</a></p>
	 * 
	 * Retrieves a host virtual address pointer to a region of a mappable memory object.
	 * 
	 * <p>Memory objects created with {@link #vkAllocateMemory AllocateMemory} are not directly host accessible. Memory objects created with the memory property
	 * {@link #VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} are considered mappable. Memory objects <b>must</b> be mappable in order to be successfully mapped on the host.</p>
	 * 
	 * <p>It is an application error to call {@code vkMapMemory} on a memory object that is already mapped.</p>
	 * 
	 * <p>{@code vkMapMemory} does not check whether the device memory is currently in use before returning the host-accessible pointer. The application <b>must</b>
	 * guarantee that any previously submitted command that writes to this range has completed before the host reads from or writes to that range, and that
	 * any previously submitted command that reads from that range has completed before the host writes to that region. If the device memory was allocated
	 * without the {@link #VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT} set, these guarantees <b>must</b> be made for an extended range: the application <b>must</b> round down the start of
	 * the range to the nearest multiple of {@link VkPhysicalDeviceLimits}{@code ::nonCoherentAtomSize}, and round the end of the range up to the nearest multiple
	 * of {@code VkPhysicalDeviceLimits::nonCoherentAtomSize}.</p>
	 * 
	 * <p>While a range of device memory is mapped for host access, the application is responsible for synchronizing both device and host access to that memory
	 * range.</p>
	 * 
	 * <p>Host-visible memory types that advertise the {@link #VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT} property still require memory barriers between host and device in order
	 * to be coherent, but do not require additional cache management operations ({@link #vkFlushMappedMemoryRanges FlushMappedMemoryRanges} or {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges}) to achieve
	 * coherency. For host writes to be seen by subsequent command buffer operations, a pipeline barrier from a source of {@link #VK_ACCESS_HOST_WRITE_BIT ACCESS_HOST_WRITE_BIT} and
	 * {@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT} to a destination of the relevant device pipeline stages and access types <b>must</b> be performed. Note that such a barrier is
	 * performed implicitly upon each command buffer submission, so an explicit barrier is only rarely needed (e.g. if a command buffer waits upon an event
	 * signaled by the host, where the host wrote some data after submission). For device writes to be seen by subsequent host reads, a pipeline barrier is
	 * required to make the writes visible.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code flags} <b>must</b> be 0</li>
	 * <li>{@code ppData} <b>must</b> be a pointer to a pointer</li>
	 * <li>{@code memory} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code memory} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>{@code memory} <b>must not</b> currently be mapped</li>
	 * <li>{@code offset} <b>must</b> be less than the size of {@code memory}</li>
	 * <li>If {@code size} is not equal to {@link #VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be greater than 0</li>
	 * <li>If {@code size} is not equal to {@link #VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be less than or equal to the size of the {@code memory} minus {@code offset}</li>
	 * <li>{@code memory} <b>must</b> have been created with a memory type that reports {@link #VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device the logical device that owns the memory
	 * @param memory the {@code VkDeviceMemory} object to be mapped
	 * @param offset a zero-based byte offset from the beginning of the memory object
	 * @param size   he size of the memory range to map, or {@link #VK_WHOLE_SIZE WHOLE_SIZE} to map from offset to the end of the allocation
	 * @param flags  reserved for future use, and <b>must</b> be zero
	 * @param ppData points to a pointer in which is returned a host-accessible pointer to the beginning of the mapped range. This pointer minus offset <b>must</b> be aligned
	 *               to at least {@link VkPhysicalDeviceLimits}{@code ::minMemoryMapAlignment}.
	 */
	public static int vkMapMemory(VkDevice device, long memory, long offset, long size, int flags, PointerBuffer ppData) {
		if ( CHECKS )
			checkBuffer(ppData, 1);
		return nvkMapMemory(device, memory, offset, size, flags, memAddress(ppData));
	}

	// --- [ vkUnmapMemory ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkUnmapMemory.html">Khronos Reference Page</a></p>
	 * 
	 * Unmaps a previously mapped memory object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code memory} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code memory} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>{@code memory} <b>must</b> currently be mapped</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device the logical device that owns the memory
	 * @param memory the memory object to be unmapped
	 */
	public static void vkUnmapMemory(VkDevice device, long memory) {
		long __functionAddress = device.getCapabilities().vkUnmapMemory;
		callPJV(__functionAddress, device.address(), memory);
	}

	// --- [ vkFlushMappedMemoryRanges ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkFlushMappedMemoryRanges.html">Khronos Reference Page</a></p>
	 * 
	 * Flushes ranges of non-coherent memory from the host caches.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pMemoryRanges} <b>must</b> be a pointer to an array of {@code memoryRangeCount} valid {@link VkMappedMemoryRange} structures</li>
	 * <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <p>{@code vkFlushMappedMemoryRanges} <b>must</b> be used to guarantee that host writes to non-coherent memory are visible to the device. It <b>must</b> be called
	 * after the host writes to non-coherent memory have completed and before command buffers that will read or write any of those memory locations are
	 * submitted to a queue.</p>
	 *
	 * @param device           the logical device that owns the memory ranges
	 * @param memoryRangeCount the length of the {@code pMemoryRanges} array
	 * @param pMemoryRanges    a pointer to an array of {@link VkMappedMemoryRange} structures describing the memory ranges to flush
	 */
	public static int nvkFlushMappedMemoryRanges(VkDevice device, int memoryRangeCount, long pMemoryRanges) {
		long __functionAddress = device.getCapabilities().vkFlushMappedMemoryRanges;
		return callPPI(__functionAddress, device.address(), memoryRangeCount, pMemoryRanges);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkFlushMappedMemoryRanges.html">Khronos Reference Page</a></p>
	 * 
	 * Flushes ranges of non-coherent memory from the host caches.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pMemoryRanges} <b>must</b> be a pointer to an array of {@code memoryRangeCount} valid {@link VkMappedMemoryRange} structures</li>
	 * <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <p>{@code vkFlushMappedMemoryRanges} <b>must</b> be used to guarantee that host writes to non-coherent memory are visible to the device. It <b>must</b> be called
	 * after the host writes to non-coherent memory have completed and before command buffers that will read or write any of those memory locations are
	 * submitted to a queue.</p>
	 *
	 * @param device        the logical device that owns the memory ranges
	 * @param pMemoryRanges a pointer to an array of {@link VkMappedMemoryRange} structures describing the memory ranges to flush
	 */
	public static int vkFlushMappedMemoryRanges(VkDevice device, VkMappedMemoryRange.Buffer pMemoryRanges) {
		return nvkFlushMappedMemoryRanges(device, pMemoryRanges.remaining(), pMemoryRanges.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkFlushMappedMemoryRanges.html">Khronos Reference Page</a></p>
	 * 
	 * Flushes ranges of non-coherent memory from the host caches.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pMemoryRanges} <b>must</b> be a pointer to an array of {@code memoryRangeCount} valid {@link VkMappedMemoryRange} structures</li>
	 * <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <p>{@code vkFlushMappedMemoryRanges} <b>must</b> be used to guarantee that host writes to non-coherent memory are visible to the device. It <b>must</b> be called
	 * after the host writes to non-coherent memory have completed and before command buffers that will read or write any of those memory locations are
	 * submitted to a queue.</p>
	 *
	 * @param device the logical device that owns the memory ranges
	 */
	public static int vkFlushMappedMemoryRanges(VkDevice device, VkMappedMemoryRange pMemoryRange) {
		return nvkFlushMappedMemoryRanges(device, 1, pMemoryRange.address());
	}

	// --- [ vkInvalidateMappedMemoryRanges ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkInvalidateMappedMemoryRanges.html">Khronos Reference Page</a></p>
	 * 
	 * Invalidates ranges of mapped memory objects.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pMemoryRanges} <b>must</b> be a pointer to an array of {@code memoryRangeCount} valid {@link VkMappedMemoryRange} structures</li>
	 * <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <p>{@code vkInvalidateMappedMemoryRanges} <b>must</b> be used to guarantee that device writes to non-coherent memory are visible to the host. It <b>must</b> be called
	 * after command buffers that execute and flush (via memory barriers) the device writes have completed, and before the host will read or write any of
	 * those locations. If a range of non-coherent memory is written by the host and then invalidated without first being flushed, its contents are undefined.</p>
	 *
	 * @param device           the logical device that owns the memory ranges
	 * @param memoryRangeCount the length of the {@code pMemoryRanges} array
	 * @param pMemoryRanges    a pointer to an array of {@link VkMappedMemoryRange} structures describing the memory ranges to invalidate
	 */
	public static int nvkInvalidateMappedMemoryRanges(VkDevice device, int memoryRangeCount, long pMemoryRanges) {
		long __functionAddress = device.getCapabilities().vkInvalidateMappedMemoryRanges;
		return callPPI(__functionAddress, device.address(), memoryRangeCount, pMemoryRanges);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkInvalidateMappedMemoryRanges.html">Khronos Reference Page</a></p>
	 * 
	 * Invalidates ranges of mapped memory objects.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pMemoryRanges} <b>must</b> be a pointer to an array of {@code memoryRangeCount} valid {@link VkMappedMemoryRange} structures</li>
	 * <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <p>{@code vkInvalidateMappedMemoryRanges} <b>must</b> be used to guarantee that device writes to non-coherent memory are visible to the host. It <b>must</b> be called
	 * after command buffers that execute and flush (via memory barriers) the device writes have completed, and before the host will read or write any of
	 * those locations. If a range of non-coherent memory is written by the host and then invalidated without first being flushed, its contents are undefined.</p>
	 *
	 * @param device        the logical device that owns the memory ranges
	 * @param pMemoryRanges a pointer to an array of {@link VkMappedMemoryRange} structures describing the memory ranges to invalidate
	 */
	public static int vkInvalidateMappedMemoryRanges(VkDevice device, VkMappedMemoryRange.Buffer pMemoryRanges) {
		return nvkInvalidateMappedMemoryRanges(device, pMemoryRanges.remaining(), pMemoryRanges.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkInvalidateMappedMemoryRanges.html">Khronos Reference Page</a></p>
	 * 
	 * Invalidates ranges of mapped memory objects.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pMemoryRanges} <b>must</b> be a pointer to an array of {@code memoryRangeCount} valid {@link VkMappedMemoryRange} structures</li>
	 * <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <p>{@code vkInvalidateMappedMemoryRanges} <b>must</b> be used to guarantee that device writes to non-coherent memory are visible to the host. It <b>must</b> be called
	 * after command buffers that execute and flush (via memory barriers) the device writes have completed, and before the host will read or write any of
	 * those locations. If a range of non-coherent memory is written by the host and then invalidated without first being flushed, its contents are undefined.</p>
	 *
	 * @param device the logical device that owns the memory ranges
	 */
	public static int vkInvalidateMappedMemoryRanges(VkDevice device, VkMappedMemoryRange pMemoryRange) {
		return nvkInvalidateMappedMemoryRanges(device, 1, pMemoryRange.address());
	}

	// --- [ vkGetDeviceMemoryCommitment ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetDeviceMemoryCommitment.html">Khronos Reference Page</a></p>
	 * 
	 * Determines the amount of lazily-allocated memory that is currently committed for a memory object.
	 * 
	 * <p>If the memory object is allocated from a heap with the {@link #VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT} bit set, that object’s backing memory <b>may</b> be provided by
	 * the implementation lazily. The actual committed size of the memory <b>may</b> initially be as small as zero (or as large as the requested size), and
	 * monotonically increases as additional memory is needed.</p>
	 * 
	 * <p>A memory type with this flag set is only allowed to be bound to a {@code VkImage} whose usage flags include {@link #VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Using lazily allocated memory objects for framebuffer attachments that are not needed once a render pass instance has completed <b>may</b> allow some
	 * implementations to never allocate memory for such attachments.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code pCommittedMemoryInBytes} <b>must</b> be a pointer to a {@code VkDeviceSize} value</li>
	 * <li>{@code memory} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code memory} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>{@code memory} <b>must</b> have been created with a memory type that reports {@link #VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT}</li>
	 * </ul>
	 * 
	 * <p>The implementation <b>may</b> update the commitment at any time, and the value returned by this query <b>may</b> be out of date.</p>
	 * 
	 * <p>The implementation guarantees to allocate any committed memory from the {@code heapIndex} indicated by the memory type that the memory object was
	 * created with.</p>
	 *
	 * @param device                  the logical device that owns the memory
	 * @param memory                  the memory object being queried
	 * @param pCommittedMemoryInBytes a pointer to a {@code VkDeviceSize} value in which the number of bytes currently committed is returned, on success
	 */
	public static void nvkGetDeviceMemoryCommitment(VkDevice device, long memory, long pCommittedMemoryInBytes) {
		long __functionAddress = device.getCapabilities().vkGetDeviceMemoryCommitment;
		callPJPV(__functionAddress, device.address(), memory, pCommittedMemoryInBytes);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetDeviceMemoryCommitment.html">Khronos Reference Page</a></p>
	 * 
	 * Determines the amount of lazily-allocated memory that is currently committed for a memory object.
	 * 
	 * <p>If the memory object is allocated from a heap with the {@link #VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT} bit set, that object’s backing memory <b>may</b> be provided by
	 * the implementation lazily. The actual committed size of the memory <b>may</b> initially be as small as zero (or as large as the requested size), and
	 * monotonically increases as additional memory is needed.</p>
	 * 
	 * <p>A memory type with this flag set is only allowed to be bound to a {@code VkImage} whose usage flags include {@link #VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Using lazily allocated memory objects for framebuffer attachments that are not needed once a render pass instance has completed <b>may</b> allow some
	 * implementations to never allocate memory for such attachments.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code pCommittedMemoryInBytes} <b>must</b> be a pointer to a {@code VkDeviceSize} value</li>
	 * <li>{@code memory} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code memory} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>{@code memory} <b>must</b> have been created with a memory type that reports {@link #VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT}</li>
	 * </ul>
	 * 
	 * <p>The implementation <b>may</b> update the commitment at any time, and the value returned by this query <b>may</b> be out of date.</p>
	 * 
	 * <p>The implementation guarantees to allocate any committed memory from the {@code heapIndex} indicated by the memory type that the memory object was
	 * created with.</p>
	 *
	 * @param device                  the logical device that owns the memory
	 * @param memory                  the memory object being queried
	 * @param pCommittedMemoryInBytes a pointer to a {@code VkDeviceSize} value in which the number of bytes currently committed is returned, on success
	 */
	public static void vkGetDeviceMemoryCommitment(VkDevice device, long memory, LongBuffer pCommittedMemoryInBytes) {
		if ( CHECKS )
			checkBuffer(pCommittedMemoryInBytes, 1);
		nvkGetDeviceMemoryCommitment(device, memory, memAddress(pCommittedMemoryInBytes));
	}

	// --- [ vkBindBufferMemory ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkBindBufferMemory.html">Khronos Reference Page</a></p>
	 * 
	 * Attaches memory to a buffer object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code buffer} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>{@code memory} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device}, {@code buffer} and {@code memory} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>{@code buffer} <b>must not</b> already be backed by a memory object</li>
	 * <li>{@code buffer} <b>must not</b> have been created with any sparse memory binding flags</li>
	 * <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
	 * <li>If {@code buffer} was created with the {@link #VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT} or {@link #VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT}, {@code memoryOffset} <b>must</b>
	 * be a multiple of {@link VkPhysicalDeviceLimits}{@code ::minTexelBufferOffsetAlignment}</li>
	 * <li>If {@code buffer} was created with the {@link #VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT BUFFER_USAGE_UNIFORM_BUFFER_BIT}, {@code memoryOffset} <b>must</b> be a multiple of
	 * {@link VkPhysicalDeviceLimits}{@code ::minUniformBufferOffsetAlignment}</li>
	 * <li>If {@code buffer} was created with the {@link #VK_BUFFER_USAGE_STORAGE_BUFFER_BIT BUFFER_USAGE_STORAGE_BUFFER_BIT}, {@code memoryOffset} <b>must</b> be a multiple of
	 * {@link VkPhysicalDeviceLimits}{@code ::minStorageBufferOffsetAlignment}</li>
	 * <li>{@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the {@link VkMemoryRequirements}
	 * structure returned from a call to {@link #vkGetBufferMemoryRequirements GetBufferMemoryRequirements} with {@code buffer}</li>
	 * <li>The size of {@code buffer} <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
	 * <li>{@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the {@link VkMemoryRequirements} structure returned from a call to
	 * {@link #vkGetBufferMemoryRequirements GetBufferMemoryRequirements} with {@code buffer}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code buffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device       the logical device that owns the buffer and memory
	 * @param buffer       the buffer
	 * @param memory       a {@code VkDeviceMemory} object describing the device memory to attach
	 * @param memoryOffset the start offset of the region of {@code memory} which is to be bound to the buffer. The number of bytes returned in the
	 *                     {@link VkMemoryRequirements}{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified buffer.
	 */
	public static int vkBindBufferMemory(VkDevice device, long buffer, long memory, long memoryOffset) {
		long __functionAddress = device.getCapabilities().vkBindBufferMemory;
		return callPJJJI(__functionAddress, device.address(), buffer, memory, memoryOffset);
	}

	// --- [ vkBindImageMemory ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkBindImageMemory.html">Khronos Reference Page</a></p>
	 * 
	 * Attaches memory to an image object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code image} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>{@code memory} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device}, {@code image} and {@code memory} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>{@code image} <b>must not</b> already be backed by a memory object</li>
	 * <li>{@code image} <b>must not</b> have been created with any sparse memory binding flags</li>
	 * <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
	 * <li>{@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the {@link VkMemoryRequirements}
	 * structure returned from a call to {@link #vkGetImageMemoryRequirements GetImageMemoryRequirements} with {@code image}</li>
	 * <li>{@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the {@link VkMemoryRequirements} structure returned from a call to
	 * {@link #vkGetImageMemoryRequirements GetImageMemoryRequirements} with {@code image}</li>
	 * <li>The {@code size} member of the {@link VkMemoryRequirements} structure returned from a call to {@link #vkGetImageMemoryRequirements GetImageMemoryRequirements} with {@code image} <b>must</b> be
	 * less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code image} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device       the logical device that owns the image and memory
	 * @param image        the image
	 * @param memory       a {@code VkDeviceMemory} object describing the device memory to attach
	 * @param memoryOffset the start offset of the region of {@code memory} which is to be bound to the image. The number of bytes returned in the
	 *                     {@link VkMemoryRequirements}{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified image.
	 */
	public static int vkBindImageMemory(VkDevice device, long image, long memory, long memoryOffset) {
		long __functionAddress = device.getCapabilities().vkBindImageMemory;
		return callPJJJI(__functionAddress, device.address(), image, memory, memoryOffset);
	}

	// --- [ vkGetBufferMemoryRequirements ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetBufferMemoryRequirements.html">Khronos Reference Page</a></p>
	 * 
	 * Determines the memory requirements for a non-sparse buffer resource.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pMemoryRequirements} <b>must</b> be a pointer to a {@link VkMemoryRequirements} structure</li>
	 * <li>{@code buffer} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code buffer} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 *
	 * @param device              the logical device that owns the buffer
	 * @param buffer              the buffer to query
	 * @param pMemoryRequirements points to an instance of the {@link VkMemoryRequirements} structure in which the memory requirements of the buffer object are returned
	 */
	public static void nvkGetBufferMemoryRequirements(VkDevice device, long buffer, long pMemoryRequirements) {
		long __functionAddress = device.getCapabilities().vkGetBufferMemoryRequirements;
		callPJPV(__functionAddress, device.address(), buffer, pMemoryRequirements);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetBufferMemoryRequirements.html">Khronos Reference Page</a></p>
	 * 
	 * Determines the memory requirements for a non-sparse buffer resource.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pMemoryRequirements} <b>must</b> be a pointer to a {@link VkMemoryRequirements} structure</li>
	 * <li>{@code buffer} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code buffer} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 *
	 * @param device              the logical device that owns the buffer
	 * @param buffer              the buffer to query
	 * @param pMemoryRequirements points to an instance of the {@link VkMemoryRequirements} structure in which the memory requirements of the buffer object are returned
	 */
	public static void vkGetBufferMemoryRequirements(VkDevice device, long buffer, VkMemoryRequirements pMemoryRequirements) {
		nvkGetBufferMemoryRequirements(device, buffer, pMemoryRequirements.address());
	}

	// --- [ vkGetImageMemoryRequirements ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetImageMemoryRequirements.html">Khronos Reference Page</a></p>
	 * 
	 * Determines the memory requirements for a non-sparse image resource.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code pMemoryRequirements} <b>must</b> be a pointer to a {@link VkMemoryRequirements} structure</li>
	 * <li>{@code image} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code image} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 *
	 * @param device              the logical device that owns the image
	 * @param image               the image to query
	 * @param pMemoryRequirements points to an instance of the {@link VkMemoryRequirements} structure in which the memory requirements of the image object are returned
	 */
	public static void nvkGetImageMemoryRequirements(VkDevice device, long image, long pMemoryRequirements) {
		long __functionAddress = device.getCapabilities().vkGetImageMemoryRequirements;
		callPJPV(__functionAddress, device.address(), image, pMemoryRequirements);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetImageMemoryRequirements.html">Khronos Reference Page</a></p>
	 * 
	 * Determines the memory requirements for a non-sparse image resource.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code pMemoryRequirements} <b>must</b> be a pointer to a {@link VkMemoryRequirements} structure</li>
	 * <li>{@code image} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code image} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 *
	 * @param device              the logical device that owns the image
	 * @param image               the image to query
	 * @param pMemoryRequirements points to an instance of the {@link VkMemoryRequirements} structure in which the memory requirements of the image object are returned
	 */
	public static void vkGetImageMemoryRequirements(VkDevice device, long image, VkMemoryRequirements pMemoryRequirements) {
		nvkGetImageMemoryRequirements(device, image, pMemoryRequirements.address());
	}

	// --- [ vkGetImageSparseMemoryRequirements ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetImageSparseMemoryRequirements.html">Khronos Reference Page</a></p>
	 * 
	 * Query sparse memory requirements for an image.
	 * 
	 * <p>If {@code pSparseMemoryRequirements} is {@code NULL}, then the number of sparse memory requirements available is returned in
	 * {@code pSparseMemoryRequirementCount}. Otherwise, {@code pSparseMemoryRequirementCount} <b>must</b> point to a variable set by the user to the number of
	 * elements in the {@code pSparseMemoryRequirements} array, and on return the variable is overwritten with the number of structures actually written to
	 * {@code pSparseMemoryRequirements}. If the value of {@code pSparseMemoryRequirementCount} is less than the number of sparse memory requirements
	 * available, at most {@code pSparseMemoryRequirementCount} structures will be written.</p>
	 * 
	 * <p>If the image was not created with {@link #VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} then {@code pSparseMemoryRequirementCount} will be set to zero and
	 * {@code pSparseMemoryRequirements} will not be written to.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>It is legal for an implementation to report a larger value in {@link VkMemoryRequirements}{@code ::size} than would be obtained by adding together memory
	 * sizes for all {@link VkSparseImageMemoryRequirements} returned by {@code vkGetImageSparseMemoryRequirements}. This <b>may</b> occur when the hardware requires
	 * unused padding in the address range describing the resource.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code pSparseMemoryRequirementCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pSparseMemoryRequirementCount} is not 0, and {@code pSparseMemoryRequirements} is not {@code NULL},
	 * {@code pSparseMemoryRequirements} <b>must</b> be a pointer to an array of {@code pSparseMemoryRequirementCount} {@link VkSparseImageMemoryRequirements}
	 * structures</li>
	 * <li>{@code image} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code image} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 *
	 * @param device                        the logical device that owns the image
	 * @param image                         the {@code VkImage} object to get the memory requirements for
	 * @param pSparseMemoryRequirementCount a pointer to an integer related to the number of sparse memory requirements available or queried
	 * @param pSparseMemoryRequirements     either {@code NULL} or a pointer to an array of {@link VkSparseImageMemoryRequirements} structures
	 */
	public static void nvkGetImageSparseMemoryRequirements(VkDevice device, long image, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
		long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements;
		callPJPPV(__functionAddress, device.address(), image, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetImageSparseMemoryRequirements.html">Khronos Reference Page</a></p>
	 * 
	 * Query sparse memory requirements for an image.
	 * 
	 * <p>If {@code pSparseMemoryRequirements} is {@code NULL}, then the number of sparse memory requirements available is returned in
	 * {@code pSparseMemoryRequirementCount}. Otherwise, {@code pSparseMemoryRequirementCount} <b>must</b> point to a variable set by the user to the number of
	 * elements in the {@code pSparseMemoryRequirements} array, and on return the variable is overwritten with the number of structures actually written to
	 * {@code pSparseMemoryRequirements}. If the value of {@code pSparseMemoryRequirementCount} is less than the number of sparse memory requirements
	 * available, at most {@code pSparseMemoryRequirementCount} structures will be written.</p>
	 * 
	 * <p>If the image was not created with {@link #VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} then {@code pSparseMemoryRequirementCount} will be set to zero and
	 * {@code pSparseMemoryRequirements} will not be written to.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>It is legal for an implementation to report a larger value in {@link VkMemoryRequirements}{@code ::size} than would be obtained by adding together memory
	 * sizes for all {@link VkSparseImageMemoryRequirements} returned by {@code vkGetImageSparseMemoryRequirements}. This <b>may</b> occur when the hardware requires
	 * unused padding in the address range describing the resource.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code pSparseMemoryRequirementCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pSparseMemoryRequirementCount} is not 0, and {@code pSparseMemoryRequirements} is not {@code NULL},
	 * {@code pSparseMemoryRequirements} <b>must</b> be a pointer to an array of {@code pSparseMemoryRequirementCount} {@link VkSparseImageMemoryRequirements}
	 * structures</li>
	 * <li>{@code image} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code image} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 *
	 * @param device                        the logical device that owns the image
	 * @param image                         the {@code VkImage} object to get the memory requirements for
	 * @param pSparseMemoryRequirementCount a pointer to an integer related to the number of sparse memory requirements available or queried
	 * @param pSparseMemoryRequirements     either {@code NULL} or a pointer to an array of {@link VkSparseImageMemoryRequirements} structures
	 */
	public static void vkGetImageSparseMemoryRequirements(VkDevice device, long image, IntBuffer pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements.Buffer pSparseMemoryRequirements) {
		if ( CHECKS ) {
			checkBuffer(pSparseMemoryRequirementCount, 1);
			if ( pSparseMemoryRequirements != null ) checkBuffer(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
		}
		nvkGetImageSparseMemoryRequirements(device, image, memAddress(pSparseMemoryRequirementCount), pSparseMemoryRequirements == null ? NULL : pSparseMemoryRequirements.address());
	}

	// --- [ vkGetPhysicalDeviceSparseImageFormatProperties ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceSparseImageFormatProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Retrieves properties of an image format applied to sparse images.
	 * 
	 * <p>Given that certain aspects of sparse image support, including the sparse image block size, <b>may</b> be implementation-dependent,
	 * {@code vkGetPhysicalDeviceSparseImageFormatProperties} <b>can</b> be used to query for sparse image format properties prior to resource creation. This command
	 * is used to check whether a given set of sparse image parameters is supported and what the sparse block shape will be.</p>
	 * 
	 * <p>{@code vkGetPhysicalDeviceSparseImageFormatProperties} returns an array of {@link VkSparseImageFormatProperties}. Each element will describe properties for
	 * one set of image aspects that are bound simultaneously in the image. This is usually one element for each aspect in the image, but for interleaved
	 * depth/stencil images there is only one element describing the combined aspects.</p>
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of sparse format properties available is returned in {@code pPropertyCount}. Otherwise,
	 * {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable
	 * is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of sparse
	 * format properties available, at most {@code pPropertyCount} structures will be written.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
	 * <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
	 * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
	 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
	 * <li>{@code usage} <b>must not</b> be 0</li>
	 * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an
	 * array of {@code pPropertyCount} {@link VkSparseImageFormatProperties} structures</li>
	 * <li>If {@code format} is an integer format, samples <b>must</b> be one of the bit flags specified in
	 * {@link VkPhysicalDeviceLimits}{@code ::sampledImageIntegerSampleCounts}</li>
	 * <li>If {@code format} is a non-integer color format, samples <b>must</b> be one of the bit flags specified in
	 * {@link VkPhysicalDeviceLimits}{@code ::sampledImageColorSampleCounts}</li>
	 * <li>If {@code format} is a depth format, samples <b>must</b> be one of the bit flags specified in
	 * {@link VkPhysicalDeviceLimits}{@code ::sampledImageDepthSampleCounts}</li>
	 * <li>If {@code format} is a stencil format, samples <b>must</b> be one of the bit flags specified in
	 * {@link VkPhysicalDeviceLimits}{@code ::sampledImageStencilSampleCounts}</li>
	 * <li>If {@code usage} includes {@link #VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, samples <b>must</b> be one of the bit flags specified in
	 * {@link VkPhysicalDeviceLimits}{@code ::storageImageSampleCounts}</li>
	 * </ul>
	 * 
	 * <p>If {@link #VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} is not supported for the given arguments, {@code pPropertyCount} will be set to zero upon return, and no data
	 * will be written to {@code pProperties}.</p>
	 * 
	 * <p>Multiple aspects are returned for depth/stencil images that are implemented as separate planes by the implementation. The depth and stencil data planes
	 * each have unique {@link VkSparseImageFormatProperties} data.</p>
	 * 
	 * <p>Depth/stencil images with depth and stencil data interleaved into a single plane will return a single {@link VkSparseImageFormatProperties} structure with
	 * the {@code aspectMask} set to <code>{@link #VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} | {@link #VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</code>.</p>
	 *
	 * @param physicalDevice the physical device from which to query the sparse image capabilities
	 * @param format         the image format
	 * @param type           the dimensionality of image. One of:<br><table><tr><td>{@link #VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}</td><td>{@link #VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</td><td>{@link #VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</td></tr></table>
	 * @param samples        the number of samples per pixel as defined in {@code VkSampleCountFlagBits}. One of:<br><table><tr><td>{@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</td><td>{@link #VK_SAMPLE_COUNT_2_BIT SAMPLE_COUNT_2_BIT}</td><td>{@link #VK_SAMPLE_COUNT_4_BIT SAMPLE_COUNT_4_BIT}</td><td>{@link #VK_SAMPLE_COUNT_8_BIT SAMPLE_COUNT_8_BIT}</td></tr><tr><td>{@link #VK_SAMPLE_COUNT_16_BIT SAMPLE_COUNT_16_BIT}</td><td>{@link #VK_SAMPLE_COUNT_32_BIT SAMPLE_COUNT_32_BIT}</td><td>{@link #VK_SAMPLE_COUNT_64_BIT SAMPLE_COUNT_64_BIT}</td></tr></table>
	 * @param usage          a bitfield describing the intended usage of the image. One or more of:<br><table><tr><td>{@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT}</td><td>{@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}</td></tr><tr><td>{@link #VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}</td><td>{@link #VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}</td></tr><tr><td>{@link #VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</td><td>{@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</td></tr><tr><td>{@link #VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}</td><td>{@link #VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</td></tr></table>
	 * @param tiling         the tiling arrangement of the data elements in memory. One of:<br><table><tr><td>{@link #VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}</td><td>{@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}</td></tr></table>
	 * @param pPropertyCount a pointer to an integer related to the number of sparse format properties available or queried
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkSparseImageFormatProperties} structures
	 */
	public static void nvkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, long pPropertyCount, long pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties;
		callPPPV(__functionAddress, physicalDevice.address(), format, type, samples, usage, tiling, pPropertyCount, pProperties);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceSparseImageFormatProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Retrieves properties of an image format applied to sparse images.
	 * 
	 * <p>Given that certain aspects of sparse image support, including the sparse image block size, <b>may</b> be implementation-dependent,
	 * {@code vkGetPhysicalDeviceSparseImageFormatProperties} <b>can</b> be used to query for sparse image format properties prior to resource creation. This command
	 * is used to check whether a given set of sparse image parameters is supported and what the sparse block shape will be.</p>
	 * 
	 * <p>{@code vkGetPhysicalDeviceSparseImageFormatProperties} returns an array of {@link VkSparseImageFormatProperties}. Each element will describe properties for
	 * one set of image aspects that are bound simultaneously in the image. This is usually one element for each aspect in the image, but for interleaved
	 * depth/stencil images there is only one element describing the combined aspects.</p>
	 * 
	 * <p>If {@code pProperties} is {@code NULL}, then the number of sparse format properties available is returned in {@code pPropertyCount}. Otherwise,
	 * {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable
	 * is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of sparse
	 * format properties available, at most {@code pPropertyCount} structures will be written.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
	 * <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
	 * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
	 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
	 * <li>{@code usage} <b>must not</b> be 0</li>
	 * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an
	 * array of {@code pPropertyCount} {@link VkSparseImageFormatProperties} structures</li>
	 * <li>If {@code format} is an integer format, samples <b>must</b> be one of the bit flags specified in
	 * {@link VkPhysicalDeviceLimits}{@code ::sampledImageIntegerSampleCounts}</li>
	 * <li>If {@code format} is a non-integer color format, samples <b>must</b> be one of the bit flags specified in
	 * {@link VkPhysicalDeviceLimits}{@code ::sampledImageColorSampleCounts}</li>
	 * <li>If {@code format} is a depth format, samples <b>must</b> be one of the bit flags specified in
	 * {@link VkPhysicalDeviceLimits}{@code ::sampledImageDepthSampleCounts}</li>
	 * <li>If {@code format} is a stencil format, samples <b>must</b> be one of the bit flags specified in
	 * {@link VkPhysicalDeviceLimits}{@code ::sampledImageStencilSampleCounts}</li>
	 * <li>If {@code usage} includes {@link #VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, samples <b>must</b> be one of the bit flags specified in
	 * {@link VkPhysicalDeviceLimits}{@code ::storageImageSampleCounts}</li>
	 * </ul>
	 * 
	 * <p>If {@link #VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} is not supported for the given arguments, {@code pPropertyCount} will be set to zero upon return, and no data
	 * will be written to {@code pProperties}.</p>
	 * 
	 * <p>Multiple aspects are returned for depth/stencil images that are implemented as separate planes by the implementation. The depth and stencil data planes
	 * each have unique {@link VkSparseImageFormatProperties} data.</p>
	 * 
	 * <p>Depth/stencil images with depth and stencil data interleaved into a single plane will return a single {@link VkSparseImageFormatProperties} structure with
	 * the {@code aspectMask} set to <code>{@link #VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} | {@link #VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</code>.</p>
	 *
	 * @param physicalDevice the physical device from which to query the sparse image capabilities
	 * @param format         the image format
	 * @param type           the dimensionality of image. One of:<br><table><tr><td>{@link #VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}</td><td>{@link #VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</td><td>{@link #VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</td></tr></table>
	 * @param samples        the number of samples per pixel as defined in {@code VkSampleCountFlagBits}. One of:<br><table><tr><td>{@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</td><td>{@link #VK_SAMPLE_COUNT_2_BIT SAMPLE_COUNT_2_BIT}</td><td>{@link #VK_SAMPLE_COUNT_4_BIT SAMPLE_COUNT_4_BIT}</td><td>{@link #VK_SAMPLE_COUNT_8_BIT SAMPLE_COUNT_8_BIT}</td></tr><tr><td>{@link #VK_SAMPLE_COUNT_16_BIT SAMPLE_COUNT_16_BIT}</td><td>{@link #VK_SAMPLE_COUNT_32_BIT SAMPLE_COUNT_32_BIT}</td><td>{@link #VK_SAMPLE_COUNT_64_BIT SAMPLE_COUNT_64_BIT}</td></tr></table>
	 * @param usage          a bitfield describing the intended usage of the image. One or more of:<br><table><tr><td>{@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT}</td><td>{@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}</td></tr><tr><td>{@link #VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}</td><td>{@link #VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}</td></tr><tr><td>{@link #VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</td><td>{@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</td></tr><tr><td>{@link #VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}</td><td>{@link #VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</td></tr></table>
	 * @param tiling         the tiling arrangement of the data elements in memory. One of:<br><table><tr><td>{@link #VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}</td><td>{@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}</td></tr></table>
	 * @param pPropertyCount a pointer to an integer related to the number of sparse format properties available or queried
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkSparseImageFormatProperties} structures
	 */
	public static void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, IntBuffer pPropertyCount, VkSparseImageFormatProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		nvkGetPhysicalDeviceSparseImageFormatProperties(physicalDevice, format, type, samples, usage, tiling, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	// --- [ vkQueueBindSparse ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkQueueBindSparse.html">Khronos Reference Page</a></p>
	 * 
	 * Submits sparse binding operations to a queue for execution.
	 * 
	 * <p>Each batch of sparse binding operations is represented by a list of {@link VkSparseBufferMemoryBindInfo}, {@link VkSparseImageOpaqueMemoryBindInfo}, and
	 * {@link VkSparseImageMemoryBindInfo} structures (encapsulated in a {@link VkBindSparseInfo} structure), each preceded by a list of semaphores upon which to wait
	 * before beginning execution of the operations, and followed by a second list of semaphores to signal upon completion of the operations.</p>
	 * 
	 * <p>When all sparse binding operations in {@code pBindInfo} have completed execution, the status of fence is set to signaled, providing certain implicit
	 * ordering guarantees.</p>
	 * 
	 * <p>Within a batch, a given range of a resource <b>must not</b> be bound more than once. Across batches, if a range is to be bound to one allocation and offset
	 * and then to another allocation and offset, then the application <b>must</b> guarantee (usually using semaphores) that the binding operations are executed in
	 * the correct order, as well as to order binding operations against the execution of command buffer submissions.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * <li>If {@code bindInfoCount} is not 0, {@code pBindInfo} <b>must</b> be a pointer to an array of {@code bindInfoCount} valid {@link VkBindSparseInfo} structures</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>The {@code queue} <b>must</b> support sparse binding operations</li>
	 * <li>Each of {@code queue} and {@code fence} that are valid handles <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code fence} <b>must</b> be unsignaled</li>
	 * <li>{@code fence} <b>must not</b> be associated with any other queue command that has not yet completed execution on that queue</li>
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
	 * @param queue         the queue to submit the sparse binding operation to
	 * @param bindInfoCount the size of the array pointed to by {@code pBindInfo}
	 * @param pBindInfo     an array of {@link VkBindSparseInfo} structures each specifying the parameters of a sparse binding operation batch
	 * @param fence         if not {@link #VK_NULL_HANDLE NULL_HANDLE}, is a fence to be signaled once the sparse binding operation completes
	 */
	public static int nvkQueueBindSparse(VkQueue queue, int bindInfoCount, long pBindInfo, long fence) {
		long __functionAddress = queue.getCapabilities().vkQueueBindSparse;
		if ( CHECKS )
			VkBindSparseInfo.validate(pBindInfo, bindInfoCount);
		return callPPJI(__functionAddress, queue.address(), bindInfoCount, pBindInfo, fence);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkQueueBindSparse.html">Khronos Reference Page</a></p>
	 * 
	 * Submits sparse binding operations to a queue for execution.
	 * 
	 * <p>Each batch of sparse binding operations is represented by a list of {@link VkSparseBufferMemoryBindInfo}, {@link VkSparseImageOpaqueMemoryBindInfo}, and
	 * {@link VkSparseImageMemoryBindInfo} structures (encapsulated in a {@link VkBindSparseInfo} structure), each preceded by a list of semaphores upon which to wait
	 * before beginning execution of the operations, and followed by a second list of semaphores to signal upon completion of the operations.</p>
	 * 
	 * <p>When all sparse binding operations in {@code pBindInfo} have completed execution, the status of fence is set to signaled, providing certain implicit
	 * ordering guarantees.</p>
	 * 
	 * <p>Within a batch, a given range of a resource <b>must not</b> be bound more than once. Across batches, if a range is to be bound to one allocation and offset
	 * and then to another allocation and offset, then the application <b>must</b> guarantee (usually using semaphores) that the binding operations are executed in
	 * the correct order, as well as to order binding operations against the execution of command buffer submissions.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * <li>If {@code bindInfoCount} is not 0, {@code pBindInfo} <b>must</b> be a pointer to an array of {@code bindInfoCount} valid {@link VkBindSparseInfo} structures</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>The {@code queue} <b>must</b> support sparse binding operations</li>
	 * <li>Each of {@code queue} and {@code fence} that are valid handles <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code fence} <b>must</b> be unsignaled</li>
	 * <li>{@code fence} <b>must not</b> be associated with any other queue command that has not yet completed execution on that queue</li>
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
	 * @param queue     the queue to submit the sparse binding operation to
	 * @param pBindInfo an array of {@link VkBindSparseInfo} structures each specifying the parameters of a sparse binding operation batch
	 * @param fence     if not {@link #VK_NULL_HANDLE NULL_HANDLE}, is a fence to be signaled once the sparse binding operation completes
	 */
	public static int vkQueueBindSparse(VkQueue queue, VkBindSparseInfo.Buffer pBindInfo, long fence) {
		return nvkQueueBindSparse(queue, pBindInfo.remaining(), pBindInfo.address(), fence);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkQueueBindSparse.html">Khronos Reference Page</a></p>
	 * 
	 * Submits sparse binding operations to a queue for execution.
	 * 
	 * <p>Each batch of sparse binding operations is represented by a list of {@link VkSparseBufferMemoryBindInfo}, {@link VkSparseImageOpaqueMemoryBindInfo}, and
	 * {@link VkSparseImageMemoryBindInfo} structures (encapsulated in a {@link VkBindSparseInfo} structure), each preceded by a list of semaphores upon which to wait
	 * before beginning execution of the operations, and followed by a second list of semaphores to signal upon completion of the operations.</p>
	 * 
	 * <p>When all sparse binding operations in {@code pBindInfo} have completed execution, the status of fence is set to signaled, providing certain implicit
	 * ordering guarantees.</p>
	 * 
	 * <p>Within a batch, a given range of a resource <b>must not</b> be bound more than once. Across batches, if a range is to be bound to one allocation and offset
	 * and then to another allocation and offset, then the application <b>must</b> guarantee (usually using semaphores) that the binding operations are executed in
	 * the correct order, as well as to order binding operations against the execution of command buffer submissions.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * <li>If {@code bindInfoCount} is not 0, {@code pBindInfo} <b>must</b> be a pointer to an array of {@code bindInfoCount} valid {@link VkBindSparseInfo} structures</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>The {@code queue} <b>must</b> support sparse binding operations</li>
	 * <li>Each of {@code queue} and {@code fence} that are valid handles <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code fence} <b>must</b> be unsignaled</li>
	 * <li>{@code fence} <b>must not</b> be associated with any other queue command that has not yet completed execution on that queue</li>
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
	 * @param queue     the queue to submit the sparse binding operation to
	 * @param pBindInfo an array of {@link VkBindSparseInfo} structures each specifying the parameters of a sparse binding operation batch
	 * @param fence     if not {@link #VK_NULL_HANDLE NULL_HANDLE}, is a fence to be signaled once the sparse binding operation completes
	 */
	public static int vkQueueBindSparse(VkQueue queue, VkBindSparseInfo pBindInfo, long fence) {
		return nvkQueueBindSparse(queue, 1, pBindInfo.address(), fence);
	}

	// --- [ vkCreateFence ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateFence.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new fence object.
	 * 
	 * <p>Fences <b>can</b> be used by the host to determine completion of execution of submissions to queues performed with {@link #vkQueueSubmit QueueSubmit} and {@link #vkQueueBindSparse QueueBindSparse}.</p>
	 * 
	 * <p>A fence’s status is always either signaled or unsignaled. The host <b>can</b> poll the status of a single fence, or wait for any or all of a group of fences
	 * to become signaled.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkFenceCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pFence} <b>must</b> be a pointer to a {@code VkFence} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the fence
	 * @param pCreateInfo points to a {@link VkFenceCreateInfo} structure specifying the state of the fence object
	 * @param pAllocator  controls host memory allocation
	 * @param pFence      points to a handle in which the resulting fence object is returned
	 */
	public static int nvkCreateFence(VkDevice device, long pCreateInfo, long pAllocator, long pFence) {
		long __functionAddress = device.getCapabilities().vkCreateFence;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pFence);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateFence.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new fence object.
	 * 
	 * <p>Fences <b>can</b> be used by the host to determine completion of execution of submissions to queues performed with {@link #vkQueueSubmit QueueSubmit} and {@link #vkQueueBindSparse QueueBindSparse}.</p>
	 * 
	 * <p>A fence’s status is always either signaled or unsignaled. The host <b>can</b> poll the status of a single fence, or wait for any or all of a group of fences
	 * to become signaled.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkFenceCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pFence} <b>must</b> be a pointer to a {@code VkFence} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the fence
	 * @param pCreateInfo points to a {@link VkFenceCreateInfo} structure specifying the state of the fence object
	 * @param pAllocator  controls host memory allocation
	 * @param pFence      points to a handle in which the resulting fence object is returned
	 */
	public static int vkCreateFence(VkDevice device, VkFenceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pFence) {
		if ( CHECKS )
			checkBuffer(pFence, 1);
		return nvkCreateFence(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pFence));
	}

	// --- [ vkDestroyFence ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyFence.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a fence object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code fence} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code fence} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>{@code fence} <b>must not</b> be associated with any queue command that has not yet completed execution on that queue</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code fence} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code fence} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the fence
	 * @param fence      the handle of the fence to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroyFence(VkDevice device, long fence, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyFence;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), fence, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyFence.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a fence object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code fence} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code fence} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code fence} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>{@code fence} <b>must not</b> be associated with any queue command that has not yet completed execution on that queue</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code fence} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code fence} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the fence
	 * @param fence      the handle of the fence to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroyFence(VkDevice device, long fence, VkAllocationCallbacks pAllocator) {
		nvkDestroyFence(device, fence, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkResetFences ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkResetFences.html">Khronos Reference Page</a></p>
	 * 
	 * Resets the status of one or more fences to the unsignaled state.
	 * 
	 * <p>If a fence is already in the unsignaled state, then resetting it has no effect.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pFences} <b>must</b> be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
	 * <li>{@code fenceCount} <b>must</b> be greater than 0</li>
	 * <li>Each element of {@code pFences} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and the elements of {@code pFences} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>Any given element of {@code pFences} <b>must not</b> currently be associated with any queue command that has not yet completed execution on that queue</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to each member of {@code pFences} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that owns the fences
	 * @param fenceCount the number of fences to reset
	 * @param pFences    a pointer to an array of {@code fenceCount} fence handles to reset
	 */
	public static int nvkResetFences(VkDevice device, int fenceCount, long pFences) {
		long __functionAddress = device.getCapabilities().vkResetFences;
		return callPPI(__functionAddress, device.address(), fenceCount, pFences);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkResetFences.html">Khronos Reference Page</a></p>
	 * 
	 * Resets the status of one or more fences to the unsignaled state.
	 * 
	 * <p>If a fence is already in the unsignaled state, then resetting it has no effect.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pFences} <b>must</b> be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
	 * <li>{@code fenceCount} <b>must</b> be greater than 0</li>
	 * <li>Each element of {@code pFences} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and the elements of {@code pFences} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>Any given element of {@code pFences} <b>must not</b> currently be associated with any queue command that has not yet completed execution on that queue</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to each member of {@code pFences} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device  the logical device that owns the fences
	 * @param pFences a pointer to an array of {@code fenceCount} fence handles to reset
	 */
	public static int vkResetFences(VkDevice device, LongBuffer pFences) {
		return nvkResetFences(device, pFences.remaining(), memAddress(pFences));
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkResetFences.html">Khronos Reference Page</a></p>
	 * 
	 * Resets the status of one or more fences to the unsignaled state.
	 * 
	 * <p>If a fence is already in the unsignaled state, then resetting it has no effect.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pFences} <b>must</b> be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
	 * <li>{@code fenceCount} <b>must</b> be greater than 0</li>
	 * <li>Each element of {@code pFences} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and the elements of {@code pFences} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>Any given element of {@code pFences} <b>must not</b> currently be associated with any queue command that has not yet completed execution on that queue</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to each member of {@code pFences} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device the logical device that owns the fences
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
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetFenceStatus.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the status of a fence from the host.
	 * 
	 * <p>Upon success, {@code vkGetFenceStatus} returns the status of the fence, which is one of:</p>
	 * 
	 * <ul>
	 * <li>{@link #VK_SUCCESS SUCCESS} indicates that the fence is signaled.</li>
	 * <li>{@link #VK_NOT_READY NOT_READY} indicates that the fence is unsignaled.</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>{@code fence} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code fence} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 *
	 * @param device the logical device that owns the fence
	 * @param fence  the handle of the fence to query
	 */
	public static int vkGetFenceStatus(VkDevice device, long fence) {
		long __functionAddress = device.getCapabilities().vkGetFenceStatus;
		return callPJI(__functionAddress, device.address(), fence);
	}

	// --- [ vkWaitForFences ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkWaitForFences.html">Khronos Reference Page</a></p>
	 * 
	 * Causes the host to wait until any one or all of a group of fences is signaled.
	 * 
	 * <p>If the condition is satisfied when {@code vkWaitForFences} is called, then {@code vkWaitForFences} returns immediately. If the condition is not
	 * satisfied at the time {@code vkWaitForFences} is called, then {@code vkWaitForFences} will block and wait up to timeout nanoseconds for the condition
	 * to become satisfied.</p>
	 * 
	 * <p>If {@code timeout} is zero, then {@code vkWaitForFences} does not wait, but simply returns the current state of the fences. {@link #VK_TIMEOUT TIMEOUT} will be returned
	 * in this case if the condition is not satisfied, even though no actual wait was performed.</p>
	 * 
	 * <p>If the specified {@code timeout} period expires before the condition is satisfied, {@code vkWaitForFences} returns {@link #VK_TIMEOUT TIMEOUT}. If the condition is
	 * satisfied before timeout nanoseconds has expired, {@code vkWaitForFences} returns {@link #VK_SUCCESS SUCCESS}.</p>
	 * 
	 * <p>Fences become signaled when the device completes executing the work that was submitted to a queue accompanied by the fence. But this alone is not
	 * sufficient for the host to be guaranteed to see the results of device writes to memory. To provide that guarantee, the application <b>must</b> insert a
	 * memory barrier between the device writes and the end of the submission that will signal the fence, with {@code dstAccessMask} having the
	 * {@link #VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT} bit set, with {@code dstStageMask} having the {@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT} bit set, and with the appropriate {@code srcStageMask} and
	 * {@code srcAccessMask} members set to guarantee completion of the writes. If the memory was allocated without the {@link #VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}
	 * set, then {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} <b>must</b> be called after the fence is signaled in order to ensure the writes are visible to the host.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pFences} <b>must</b> be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
	 * <li>{@code fenceCount} <b>must</b> be greater than 0</li>
	 * <li>Each element of {@code pFences} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and the elements of {@code pFences} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 *
	 * @param device     the logical device that owns the fences
	 * @param fenceCount the number of fences to wait on
	 * @param pFences    a pointer to an array of {@code fenceCount} fence handles
	 * @param waitAll    the condition that <b>must</b> be satisfied to successfully unblock the wait. If {@code waitAll} is {@link #VK_TRUE TRUE}, then the condition is that all fences in
	 *                   {@code pFences} are signaled. Otherwise, the condition is that at least one fence in {@code pFences} is signaled.
	 * @param timeout    the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent
	 *                   timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.
	 */
	public static int nvkWaitForFences(VkDevice device, int fenceCount, long pFences, int waitAll, long timeout) {
		long __functionAddress = device.getCapabilities().vkWaitForFences;
		return callPPJI(__functionAddress, device.address(), fenceCount, pFences, waitAll, timeout);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkWaitForFences.html">Khronos Reference Page</a></p>
	 * 
	 * Causes the host to wait until any one or all of a group of fences is signaled.
	 * 
	 * <p>If the condition is satisfied when {@code vkWaitForFences} is called, then {@code vkWaitForFences} returns immediately. If the condition is not
	 * satisfied at the time {@code vkWaitForFences} is called, then {@code vkWaitForFences} will block and wait up to timeout nanoseconds for the condition
	 * to become satisfied.</p>
	 * 
	 * <p>If {@code timeout} is zero, then {@code vkWaitForFences} does not wait, but simply returns the current state of the fences. {@link #VK_TIMEOUT TIMEOUT} will be returned
	 * in this case if the condition is not satisfied, even though no actual wait was performed.</p>
	 * 
	 * <p>If the specified {@code timeout} period expires before the condition is satisfied, {@code vkWaitForFences} returns {@link #VK_TIMEOUT TIMEOUT}. If the condition is
	 * satisfied before timeout nanoseconds has expired, {@code vkWaitForFences} returns {@link #VK_SUCCESS SUCCESS}.</p>
	 * 
	 * <p>Fences become signaled when the device completes executing the work that was submitted to a queue accompanied by the fence. But this alone is not
	 * sufficient for the host to be guaranteed to see the results of device writes to memory. To provide that guarantee, the application <b>must</b> insert a
	 * memory barrier between the device writes and the end of the submission that will signal the fence, with {@code dstAccessMask} having the
	 * {@link #VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT} bit set, with {@code dstStageMask} having the {@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT} bit set, and with the appropriate {@code srcStageMask} and
	 * {@code srcAccessMask} members set to guarantee completion of the writes. If the memory was allocated without the {@link #VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}
	 * set, then {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} <b>must</b> be called after the fence is signaled in order to ensure the writes are visible to the host.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pFences} <b>must</b> be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
	 * <li>{@code fenceCount} <b>must</b> be greater than 0</li>
	 * <li>Each element of {@code pFences} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and the elements of {@code pFences} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 *
	 * @param device  the logical device that owns the fences
	 * @param pFences a pointer to an array of {@code fenceCount} fence handles
	 * @param waitAll the condition that <b>must</b> be satisfied to successfully unblock the wait. If {@code waitAll} is {@link #VK_TRUE TRUE}, then the condition is that all fences in
	 *                {@code pFences} are signaled. Otherwise, the condition is that at least one fence in {@code pFences} is signaled.
	 * @param timeout the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent
	 *                timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.
	 */
	public static int vkWaitForFences(VkDevice device, LongBuffer pFences, int waitAll, long timeout) {
		return nvkWaitForFences(device, pFences.remaining(), memAddress(pFences), waitAll, timeout);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkWaitForFences.html">Khronos Reference Page</a></p>
	 * 
	 * Causes the host to wait until any one or all of a group of fences is signaled.
	 * 
	 * <p>If the condition is satisfied when {@code vkWaitForFences} is called, then {@code vkWaitForFences} returns immediately. If the condition is not
	 * satisfied at the time {@code vkWaitForFences} is called, then {@code vkWaitForFences} will block and wait up to timeout nanoseconds for the condition
	 * to become satisfied.</p>
	 * 
	 * <p>If {@code timeout} is zero, then {@code vkWaitForFences} does not wait, but simply returns the current state of the fences. {@link #VK_TIMEOUT TIMEOUT} will be returned
	 * in this case if the condition is not satisfied, even though no actual wait was performed.</p>
	 * 
	 * <p>If the specified {@code timeout} period expires before the condition is satisfied, {@code vkWaitForFences} returns {@link #VK_TIMEOUT TIMEOUT}. If the condition is
	 * satisfied before timeout nanoseconds has expired, {@code vkWaitForFences} returns {@link #VK_SUCCESS SUCCESS}.</p>
	 * 
	 * <p>Fences become signaled when the device completes executing the work that was submitted to a queue accompanied by the fence. But this alone is not
	 * sufficient for the host to be guaranteed to see the results of device writes to memory. To provide that guarantee, the application <b>must</b> insert a
	 * memory barrier between the device writes and the end of the submission that will signal the fence, with {@code dstAccessMask} having the
	 * {@link #VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT} bit set, with {@code dstStageMask} having the {@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT} bit set, and with the appropriate {@code srcStageMask} and
	 * {@code srcAccessMask} members set to guarantee completion of the writes. If the memory was allocated without the {@link #VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}
	 * set, then {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} <b>must</b> be called after the fence is signaled in order to ensure the writes are visible to the host.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pFences} <b>must</b> be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
	 * <li>{@code fenceCount} <b>must</b> be greater than 0</li>
	 * <li>Each element of {@code pFences} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and the elements of {@code pFences} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 *
	 * @param device  the logical device that owns the fences
	 * @param waitAll the condition that <b>must</b> be satisfied to successfully unblock the wait. If {@code waitAll} is {@link #VK_TRUE TRUE}, then the condition is that all fences in
	 *                {@code pFences} are signaled. Otherwise, the condition is that at least one fence in {@code pFences} is signaled.
	 * @param timeout the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent
	 *                timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.
	 */
	public static int vkWaitForFences(VkDevice device, long pFence, int waitAll, long timeout) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer pFences = stack.longs(pFence);
			return nvkWaitForFences(device, 1, memAddress(pFences), waitAll, timeout);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ vkCreateSemaphore ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateSemaphore.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new queue semaphore object.
	 * 
	 * <p>Semaphores are used to coordinate operations between queues and between queue submissions within a single queue. An application might associate
	 * semaphores with resources or groups of resources to marshal ownership of shared data. A semaphore’s status is always either <em>signaled</em> or
	 * <em>unsignaled</em>. Semaphores are signaled by queues and <b>can</b> also be waited on in the same or different queues until they are signaled.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkSemaphoreCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSemaphore} <b>must</b> be a pointer to a {@code VkSemaphore} handle</li>
	 * </ul>
	 * 
	 * <p>To signal a semaphore from a queue, include it in an element of the array of {@link VkSubmitInfo} structures passed through the {@code pSubmits} parameter to
	 * a call to {@link #vkQueueSubmit QueueSubmit}, or in an element of the array of {@link VkBindSparseInfo} structures passed through the {@code pBindInfo} parameter to a call to
	 * {@link #vkQueueBindSparse QueueBindSparse}.</p>
	 * 
	 * <p>Semaphores included in the {@code pSignalSemaphores} array of one of the elements of a queue submission are signaled once queue execution reaches the
	 * signal operation, and all previous work in the queue completes. Any operations waiting on that semaphore in other queues will be released once it is
	 * signaled.</p>
	 * 
	 * <p>Similarly, to wait on a semaphore from a queue, include it in the {@code pWaitSemaphores} array of one of the elements of a batch in a queue
	 * submission. When queue execution reaches the wait operation, will stall execution of subsequently submitted operations until the semaphore reaches the
	 * signaled state due to a signaling operation. Once the semaphore is signaled, the subsequent operations will be permitted to execute and the status of
	 * the semaphore will be reset to the unsignaled state.</p>
	 * 
	 * <p>In the case of {@code VkSubmitInfo}, command buffers wait at specific pipeline stages, rather than delaying the entire command buffer’s execution, with the
	 * pipeline stages determined by the value of the corresponding element of the {@code pWaitDstStageMask} member of {@code VkSubmitInfo}. Execution of work
	 * by those stages in subsequent commands is stalled until the corresponding semaphore reaches the signaled state. Subsequent sparse binding operations
	 * wait for the semaphore to become signaled, regardless of the values of {@code pWaitDstStageMask}.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>A common scenario for using {@code pWaitDstStageMask} with values other than {@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT} is when synchronizing a window system
	 * presentation operation against subsequent command buffers which render the next frame. In this case, an image that was being presented <b>must not</b> be
	 * overwritten until the presentation operation completes, but other pipeline stages <b>can</b> execute without waiting. A mask of
	 * {@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT} prevents subsequent color attachment writes from executing until the semaphore signals. Some
	 * implementations <b>may</b> be able to execute transfer operations and/or vertex processing work before the semaphore is signaled.</p>
	 * 
	 * <p>If an image layout transition needs to be performed on a swapchain image before it is used in a framebuffer, that <b>can</b> be performed as the first
	 * operation submitted to the queue after acquiring the image, and <b>should not</b> prevent other work from overlapping with the presentation operation.
	 * For example, a {@link VkImageMemoryBarrier} could use:</p>
	 * 
	 * <ul>
	 * <li><code>srcStageMask = {@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</code></li>
	 * <li><code>srcAccessMask = {@link #VK_ACCESS_MEMORY_READ_BIT ACCESS_MEMORY_READ_BIT}</code></li>
	 * <li><code>dstStageMask = {@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</code></li>
	 * <li><code>dstAccessMask = {@link #VK_ACCESS_COLOR_ATTACHMENT_READ_BIT ACCESS_COLOR_ATTACHMENT_READ_BIT} | {@link #VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT ACCESS_COLOR_ATTACHMENT_WRITE_BIT}.</code></li>
	 * <li><code>oldLayout = {@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}</code></li>
	 * <li><code>newLayout = {@link #VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</code></li>
	 * </ul>
	 * 
	 * <p>Alternately, {@code oldLayout} <b>can</b> be {@link #VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, if the image’s contents need not be preserved.</p>
	 * 
	 * <p>This barrier accomplishes a dependency chain between previous presentation operations and subsequent color attachment output operations, with the
	 * layout transition performed in between, and does not introduce a dependency between previous work and any vertex processing stages. More precisely,
	 * the semaphore signals after the presentation operation completes, then the semaphore wait stalls the {@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}
	 * stage, then there is a dependency from that same stage to itself with the layout transition performed in between.</p>
	 * </div>
	 * 
	 * <p>When a queue signals or waits upon a semaphore, certain implicit ordering guarantees are provided.</p>
	 * 
	 * <p>Semaphore operations <b>may</b> not make the side effects of commands visible to the host.</p>
	 *
	 * @param device      the logical device that creates the semaphore
	 * @param pCreateInfo points to a {@link VkSemaphoreCreateInfo} structure specifying the state of the semaphore object
	 * @param pAllocator  controls host memory allocation
	 * @param pSemaphore  points to a handle in which the resulting semaphore object is returned. The semaphore is created in the unsignaled state.
	 */
	public static int nvkCreateSemaphore(VkDevice device, long pCreateInfo, long pAllocator, long pSemaphore) {
		long __functionAddress = device.getCapabilities().vkCreateSemaphore;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pSemaphore);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateSemaphore.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new queue semaphore object.
	 * 
	 * <p>Semaphores are used to coordinate operations between queues and between queue submissions within a single queue. An application might associate
	 * semaphores with resources or groups of resources to marshal ownership of shared data. A semaphore’s status is always either <em>signaled</em> or
	 * <em>unsignaled</em>. Semaphores are signaled by queues and <b>can</b> also be waited on in the same or different queues until they are signaled.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkSemaphoreCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSemaphore} <b>must</b> be a pointer to a {@code VkSemaphore} handle</li>
	 * </ul>
	 * 
	 * <p>To signal a semaphore from a queue, include it in an element of the array of {@link VkSubmitInfo} structures passed through the {@code pSubmits} parameter to
	 * a call to {@link #vkQueueSubmit QueueSubmit}, or in an element of the array of {@link VkBindSparseInfo} structures passed through the {@code pBindInfo} parameter to a call to
	 * {@link #vkQueueBindSparse QueueBindSparse}.</p>
	 * 
	 * <p>Semaphores included in the {@code pSignalSemaphores} array of one of the elements of a queue submission are signaled once queue execution reaches the
	 * signal operation, and all previous work in the queue completes. Any operations waiting on that semaphore in other queues will be released once it is
	 * signaled.</p>
	 * 
	 * <p>Similarly, to wait on a semaphore from a queue, include it in the {@code pWaitSemaphores} array of one of the elements of a batch in a queue
	 * submission. When queue execution reaches the wait operation, will stall execution of subsequently submitted operations until the semaphore reaches the
	 * signaled state due to a signaling operation. Once the semaphore is signaled, the subsequent operations will be permitted to execute and the status of
	 * the semaphore will be reset to the unsignaled state.</p>
	 * 
	 * <p>In the case of {@code VkSubmitInfo}, command buffers wait at specific pipeline stages, rather than delaying the entire command buffer’s execution, with the
	 * pipeline stages determined by the value of the corresponding element of the {@code pWaitDstStageMask} member of {@code VkSubmitInfo}. Execution of work
	 * by those stages in subsequent commands is stalled until the corresponding semaphore reaches the signaled state. Subsequent sparse binding operations
	 * wait for the semaphore to become signaled, regardless of the values of {@code pWaitDstStageMask}.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>A common scenario for using {@code pWaitDstStageMask} with values other than {@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT} is when synchronizing a window system
	 * presentation operation against subsequent command buffers which render the next frame. In this case, an image that was being presented <b>must not</b> be
	 * overwritten until the presentation operation completes, but other pipeline stages <b>can</b> execute without waiting. A mask of
	 * {@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT} prevents subsequent color attachment writes from executing until the semaphore signals. Some
	 * implementations <b>may</b> be able to execute transfer operations and/or vertex processing work before the semaphore is signaled.</p>
	 * 
	 * <p>If an image layout transition needs to be performed on a swapchain image before it is used in a framebuffer, that <b>can</b> be performed as the first
	 * operation submitted to the queue after acquiring the image, and <b>should not</b> prevent other work from overlapping with the presentation operation.
	 * For example, a {@link VkImageMemoryBarrier} could use:</p>
	 * 
	 * <ul>
	 * <li><code>srcStageMask = {@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</code></li>
	 * <li><code>srcAccessMask = {@link #VK_ACCESS_MEMORY_READ_BIT ACCESS_MEMORY_READ_BIT}</code></li>
	 * <li><code>dstStageMask = {@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</code></li>
	 * <li><code>dstAccessMask = {@link #VK_ACCESS_COLOR_ATTACHMENT_READ_BIT ACCESS_COLOR_ATTACHMENT_READ_BIT} | {@link #VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT ACCESS_COLOR_ATTACHMENT_WRITE_BIT}.</code></li>
	 * <li><code>oldLayout = {@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}</code></li>
	 * <li><code>newLayout = {@link #VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</code></li>
	 * </ul>
	 * 
	 * <p>Alternately, {@code oldLayout} <b>can</b> be {@link #VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, if the image’s contents need not be preserved.</p>
	 * 
	 * <p>This barrier accomplishes a dependency chain between previous presentation operations and subsequent color attachment output operations, with the
	 * layout transition performed in between, and does not introduce a dependency between previous work and any vertex processing stages. More precisely,
	 * the semaphore signals after the presentation operation completes, then the semaphore wait stalls the {@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}
	 * stage, then there is a dependency from that same stage to itself with the layout transition performed in between.</p>
	 * </div>
	 * 
	 * <p>When a queue signals or waits upon a semaphore, certain implicit ordering guarantees are provided.</p>
	 * 
	 * <p>Semaphore operations <b>may</b> not make the side effects of commands visible to the host.</p>
	 *
	 * @param device      the logical device that creates the semaphore
	 * @param pCreateInfo points to a {@link VkSemaphoreCreateInfo} structure specifying the state of the semaphore object
	 * @param pAllocator  controls host memory allocation
	 * @param pSemaphore  points to a handle in which the resulting semaphore object is returned. The semaphore is created in the unsignaled state.
	 */
	public static int vkCreateSemaphore(VkDevice device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSemaphore) {
		if ( CHECKS )
			checkBuffer(pSemaphore, 1);
		return nvkCreateSemaphore(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSemaphore));
	}

	// --- [ vkDestroySemaphore ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroySemaphore.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a semaphore object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code semaphore} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code semaphore} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code semaphore} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>{@code semaphore} <b>must not</b> be associated with any queue command that has not yet completed execution on that queue</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code semaphore} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code semaphore} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the semaphore
	 * @param semaphore  the handle of the semaphore to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroySemaphore(VkDevice device, long semaphore, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroySemaphore;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), semaphore, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroySemaphore.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a semaphore object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code semaphore} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code semaphore} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code semaphore} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>{@code semaphore} <b>must not</b> be associated with any queue command that has not yet completed execution on that queue</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code semaphore} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code semaphore} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the semaphore
	 * @param semaphore  the handle of the semaphore to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroySemaphore(VkDevice device, long semaphore, VkAllocationCallbacks pAllocator) {
		nvkDestroySemaphore(device, semaphore, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateEvent ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateEvent.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new event object.
	 * 
	 * <p>Events represent a fine-grained synchronization primitive that <b>can</b> be used to gauge progress through a sequence of commands executed on a queue by
	 * Vulkan. An event is initially in the unsignaled state. It <b>can</b> be signaled by a device, using commands inserted into the command buffer, or by the
	 * host. It <b>can</b> also be reset to the unsignaled state by a device or the host. The host <b>can</b> query the state of an event. A device <b>can</b> wait for one or
	 * more events to become signaled.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkEventCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pEvent} <b>must</b> be a pointer to a {@code VkEvent} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the event
	 * @param pCreateInfo a pointer to an instance of the {@link VkEventCreateInfo} structure which contains information about how the event is to be created
	 * @param pAllocator  controls host memory allocation
	 * @param pEvent      points to a handle in which the resulting event object is returned
	 */
	public static int nvkCreateEvent(VkDevice device, long pCreateInfo, long pAllocator, long pEvent) {
		long __functionAddress = device.getCapabilities().vkCreateEvent;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pEvent);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateEvent.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new event object.
	 * 
	 * <p>Events represent a fine-grained synchronization primitive that <b>can</b> be used to gauge progress through a sequence of commands executed on a queue by
	 * Vulkan. An event is initially in the unsignaled state. It <b>can</b> be signaled by a device, using commands inserted into the command buffer, or by the
	 * host. It <b>can</b> also be reset to the unsignaled state by a device or the host. The host <b>can</b> query the state of an event. A device <b>can</b> wait for one or
	 * more events to become signaled.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkEventCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pEvent} <b>must</b> be a pointer to a {@code VkEvent} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the event
	 * @param pCreateInfo a pointer to an instance of the {@link VkEventCreateInfo} structure which contains information about how the event is to be created
	 * @param pAllocator  controls host memory allocation
	 * @param pEvent      points to a handle in which the resulting event object is returned
	 */
	public static int vkCreateEvent(VkDevice device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pEvent) {
		if ( CHECKS )
			checkBuffer(pEvent, 1);
		return nvkCreateEvent(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pEvent));
	}

	// --- [ vkDestroyEvent ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyEvent.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys an event object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code event} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code event} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code event} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code event} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code event} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code event} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code event} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the event
	 * @param event      the handle of the event to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroyEvent(VkDevice device, long event, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyEvent;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), event, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyEvent.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys an event object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code event} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code event} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code event} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code event} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code event} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code event} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code event} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the event
	 * @param event      the handle of the event to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroyEvent(VkDevice device, long event, VkAllocationCallbacks pAllocator) {
		nvkDestroyEvent(device, event, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetEventStatus ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetEventStatus.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the state of an event from the host.
	 * 
	 * <p>Upon success, {@code vkGetEventStatus} returns the state of the event object with the following return codes:</p>
	 * 
	 * <ul>
	 * <li>{@link #VK_EVENT_SET EVENT_SET} - The event specified by event is signaled.</li>
	 * <li>{@link #VK_EVENT_RESET EVENT_RESET} - The event specified by event is unsignaled.</li>
	 * </ul>
	 * 
	 * <p>The state of an event <b>can</b> be updated by the host. The state of the event is immediately changed, and subsequent calls to {@code vkGetEventStatus} will
	 * return the new state. If an event is already in the requested state, then updating it to the same state has no effect.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
	 * <li>{@code event} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code event} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 *
	 * @param device the logical device that owns the event
	 * @param event  the handle of the event to query
	 */
	public static int vkGetEventStatus(VkDevice device, long event) {
		long __functionAddress = device.getCapabilities().vkGetEventStatus;
		return callPJI(__functionAddress, device.address(), event);
	}

	// --- [ vkSetEvent ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkSetEvent.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the state of an event to signaled from the host.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
	 * <li>{@code event} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code event} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code event} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device the logical device that owns the event
	 * @param event  the event to set
	 */
	public static int vkSetEvent(VkDevice device, long event) {
		long __functionAddress = device.getCapabilities().vkSetEvent;
		return callPJI(__functionAddress, device.address(), event);
	}

	// --- [ vkResetEvent ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkResetEvent.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the state of an event to unsignaled from the host.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
	 * <li>{@code event} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code event} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>{@code event} <b>must not</b> be waited on by a {@link #vkCmdWaitEvents CmdWaitEvents} command that is currently executing</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code event} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device the logical device that owns the event
	 * @param event  the event to reset
	 */
	public static int vkResetEvent(VkDevice device, long event) {
		long __functionAddress = device.getCapabilities().vkResetEvent;
		return callPJI(__functionAddress, device.address(), event);
	}

	// --- [ vkCreateQueryPool ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateQueryPool.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new query pool object.
	 * 
	 * <p>Queries are managed using query pool objects. Each query pool is a collection of a specific number of queries of a particular type.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkQueryPoolCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pQueryPool} <b>must</b> be a pointer to a {@code VkQueryPool} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the query pool
	 * @param pCreateInfo pointer to an instance of the {@link VkQueryPoolCreateInfo} structure containing the number and type of queries to be managed by the pool
	 * @param pAllocator  controls host memory allocation
	 * @param pQueryPool  a pointer to a {@code VkQueryPool} handle in which the resulting query pool object is returned
	 */
	public static int nvkCreateQueryPool(VkDevice device, long pCreateInfo, long pAllocator, long pQueryPool) {
		long __functionAddress = device.getCapabilities().vkCreateQueryPool;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pQueryPool);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateQueryPool.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new query pool object.
	 * 
	 * <p>Queries are managed using query pool objects. Each query pool is a collection of a specific number of queries of a particular type.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkQueryPoolCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pQueryPool} <b>must</b> be a pointer to a {@code VkQueryPool} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the query pool
	 * @param pCreateInfo pointer to an instance of the {@link VkQueryPoolCreateInfo} structure containing the number and type of queries to be managed by the pool
	 * @param pAllocator  controls host memory allocation
	 * @param pQueryPool  a pointer to a {@code VkQueryPool} handle in which the resulting query pool object is returned
	 */
	public static int vkCreateQueryPool(VkDevice device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pQueryPool) {
		if ( CHECKS )
			checkBuffer(pQueryPool, 1);
		return nvkCreateQueryPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pQueryPool));
	}

	// --- [ vkDestroyQueryPool ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyQueryPool.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a query pool object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code queryPool} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code queryPool} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code queryPool} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code queryPool} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code queryPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code queryPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code queryPool} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the query pool
	 * @param queryPool  the query pool to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroyQueryPool(VkDevice device, long queryPool, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyQueryPool;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), queryPool, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyQueryPool.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a query pool object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code queryPool} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code queryPool} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code queryPool} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code queryPool} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code queryPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code queryPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code queryPool} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the query pool
	 * @param queryPool  the query pool to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroyQueryPool(VkDevice device, long queryPool, VkAllocationCallbacks pAllocator) {
		nvkDestroyQueryPool(device, queryPool, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetQueryPoolResults ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetQueryPoolResults.html">Khronos Reference Page</a></p>
	 * 
	 * Retrieves status and results for a set of queries.
	 * 
	 * <p>If no bits are set in {@code flags}, and all requested queries are in the available state, results are written as an array of 32-bit unsigned integer
	 * values. The behavior when not all queries are available, is described below.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is not set and the result overflows a 32-bit value, the value <b>may</b> either wrap or saturate. Similarly, if {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT}
	 * is set and the result overflows a 64-bit value, the value <b>may</b> either wrap or saturate.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is set, Vulkan will wait for each query to be in the available state before retrieving the numerical results for that query.
	 * In this case, {@code vkGetQueryPoolResults} is guaranteed to succeed and return {@link #VK_SUCCESS SUCCESS} if the queries become available in a finite time (i.e. if they
	 * have been issued and not reset). If queries will never finish (e.g. due to being reset but not issued), then {@code vkGetQueryPoolResults} <b>may</b> not
	 * return in finite time.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} and {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} are both not set then no result values are written to {@code pData} for queries that are in the
	 * unavailable state at the time of the call, and {@code vkGetQueryPoolResults} returns {@link #VK_NOT_READY NOT_READY}. However, availability state is still written to
	 * {@code pData} for those queries if {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is set.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>must</b> take care to ensure that use of the {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} bit has the desired effect.</p>
	 * 
	 * <p>For example, if a query has been used previously and a command buffer records the commands {@link #vkCmdResetQueryPool CmdResetQueryPool}, {@link #vkCmdBeginQuery CmdBeginQuery}, and
	 * {@link #vkCmdEndQuery CmdEndQuery} for that query, then the query will remain in the available state until the {@code vkCmdResetQueryPool} command executes on a queue.
	 * Applications <b>can</b> use fences or events to ensure that an query has already been reset before checking for its results or availability status.
	 * Otherwise, a stale value could be returned from a previous use of the query.</p>
	 * 
	 * <p>The above also applies when {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is used in combination with {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT}. In this case, the returned
	 * availability status <b>may</b> reflect the result of a previous use of the query unless the {@code vkCmdResetQueryPool} command has been executed since
	 * the last use of the query.</p>
	 * </div>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>can</b> double-buffer query pool usage, with a pool per frame, and reset queries at the end of the frame in which they are read.</p>
	 * </div>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} is set, {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is not set, and the query’s status is unavailable, an intermediate result value between
	 * zero and the final result value is written to {@code pData} for that query.</p>
	 * 
	 * <p>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} <b>must not</b> be used if the pool’s {@code queryType} is {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is set, the final integer value written for each query is non-zero if the query’s status was available or zero
	 * if the status was unavailable. When {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is used, implementations <b>must</b> guarantee that if they return a non-zero
	 * availability value then the numerical results <b>must</b> be valid, assuming the results are not reset by a subsequent command.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Satisfying this guarantee <b>may</b> require careful ordering by the application, e.g. to read the availability status before reading the results.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryResultFlagBits} values</li>
	 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
	 * <li>{@code queryPool} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code queryPool} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is not set in {@code flags} then {@code pData} and {@code stride} <b>must</b> be multiples of 4</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is set in {@code flags} then {@code pData} and {@code stride} <b>must</b> be multiples of 8</li>
	 * <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
	 * <li>{@code dataSize} <b>must</b> be large enough to contain the result of each query, as described here</li>
	 * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}, {@code flags} <b>must not</b> contain {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT}</li>
	 * </ul>
	 *
	 * @param device     the logical device that owns the query pool
	 * @param queryPool  the query pool managing the queries containing the desired results
	 * @param firstQuery the initial query index
	 * @param queryCount the number of queries. {@code firstQuery} and {@code queryCount} together define a range of queries
	 * @param dataSize   the size in bytes of the buffer pointed to by {@code pData}
	 * @param pData      a pointer to a user-allocated buffer where the results will be written
	 * @param stride     the stride in bytes between results for individual queries within {@code pData}.
	 * @param flags      a bitmask of {@code VkQueryResultFlagBits} specifying how and when results are returned. One or more of:<br><table><tr><td>{@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT}</td><td>{@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT}</td><td>{@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT}</td></tr><tr><td>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT}</td></tr></table>
	 */
	public static int nvkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, long dataSize, long pData, long stride, int flags) {
		long __functionAddress = device.getCapabilities().vkGetQueryPoolResults;
		return callPJPPJI(__functionAddress, device.address(), queryPool, firstQuery, queryCount, dataSize, pData, stride, flags);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetQueryPoolResults.html">Khronos Reference Page</a></p>
	 * 
	 * Retrieves status and results for a set of queries.
	 * 
	 * <p>If no bits are set in {@code flags}, and all requested queries are in the available state, results are written as an array of 32-bit unsigned integer
	 * values. The behavior when not all queries are available, is described below.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is not set and the result overflows a 32-bit value, the value <b>may</b> either wrap or saturate. Similarly, if {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT}
	 * is set and the result overflows a 64-bit value, the value <b>may</b> either wrap or saturate.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is set, Vulkan will wait for each query to be in the available state before retrieving the numerical results for that query.
	 * In this case, {@code vkGetQueryPoolResults} is guaranteed to succeed and return {@link #VK_SUCCESS SUCCESS} if the queries become available in a finite time (i.e. if they
	 * have been issued and not reset). If queries will never finish (e.g. due to being reset but not issued), then {@code vkGetQueryPoolResults} <b>may</b> not
	 * return in finite time.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} and {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} are both not set then no result values are written to {@code pData} for queries that are in the
	 * unavailable state at the time of the call, and {@code vkGetQueryPoolResults} returns {@link #VK_NOT_READY NOT_READY}. However, availability state is still written to
	 * {@code pData} for those queries if {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is set.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>must</b> take care to ensure that use of the {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} bit has the desired effect.</p>
	 * 
	 * <p>For example, if a query has been used previously and a command buffer records the commands {@link #vkCmdResetQueryPool CmdResetQueryPool}, {@link #vkCmdBeginQuery CmdBeginQuery}, and
	 * {@link #vkCmdEndQuery CmdEndQuery} for that query, then the query will remain in the available state until the {@code vkCmdResetQueryPool} command executes on a queue.
	 * Applications <b>can</b> use fences or events to ensure that an query has already been reset before checking for its results or availability status.
	 * Otherwise, a stale value could be returned from a previous use of the query.</p>
	 * 
	 * <p>The above also applies when {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is used in combination with {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT}. In this case, the returned
	 * availability status <b>may</b> reflect the result of a previous use of the query unless the {@code vkCmdResetQueryPool} command has been executed since
	 * the last use of the query.</p>
	 * </div>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>can</b> double-buffer query pool usage, with a pool per frame, and reset queries at the end of the frame in which they are read.</p>
	 * </div>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} is set, {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is not set, and the query’s status is unavailable, an intermediate result value between
	 * zero and the final result value is written to {@code pData} for that query.</p>
	 * 
	 * <p>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} <b>must not</b> be used if the pool’s {@code queryType} is {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is set, the final integer value written for each query is non-zero if the query’s status was available or zero
	 * if the status was unavailable. When {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is used, implementations <b>must</b> guarantee that if they return a non-zero
	 * availability value then the numerical results <b>must</b> be valid, assuming the results are not reset by a subsequent command.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Satisfying this guarantee <b>may</b> require careful ordering by the application, e.g. to read the availability status before reading the results.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryResultFlagBits} values</li>
	 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
	 * <li>{@code queryPool} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code queryPool} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is not set in {@code flags} then {@code pData} and {@code stride} <b>must</b> be multiples of 4</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is set in {@code flags} then {@code pData} and {@code stride} <b>must</b> be multiples of 8</li>
	 * <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
	 * <li>{@code dataSize} <b>must</b> be large enough to contain the result of each query, as described here</li>
	 * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}, {@code flags} <b>must not</b> contain {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT}</li>
	 * </ul>
	 *
	 * @param device     the logical device that owns the query pool
	 * @param queryPool  the query pool managing the queries containing the desired results
	 * @param firstQuery the initial query index
	 * @param queryCount the number of queries. {@code firstQuery} and {@code queryCount} together define a range of queries
	 * @param pData      a pointer to a user-allocated buffer where the results will be written
	 * @param stride     the stride in bytes between results for individual queries within {@code pData}.
	 * @param flags      a bitmask of {@code VkQueryResultFlagBits} specifying how and when results are returned. One or more of:<br><table><tr><td>{@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT}</td><td>{@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT}</td><td>{@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT}</td></tr><tr><td>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT}</td></tr></table>
	 */
	public static int vkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, ByteBuffer pData, long stride, int flags) {
		return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, (long)pData.remaining(), memAddress(pData), stride, flags);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetQueryPoolResults.html">Khronos Reference Page</a></p>
	 * 
	 * IntBuffer version of: {@link #vkGetQueryPoolResults GetQueryPoolResults}
	 */
	public static int vkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, IntBuffer pData, long stride, int flags) {
		return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, pData.remaining() << 2, memAddress(pData), stride, flags);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetQueryPoolResults.html">Khronos Reference Page</a></p>
	 * 
	 * LongBuffer version of: {@link #vkGetQueryPoolResults GetQueryPoolResults}
	 */
	public static int vkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, LongBuffer pData, long stride, int flags) {
		return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, pData.remaining() << 3, memAddress(pData), stride, flags);
	}

	// --- [ vkCreateBuffer ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new buffer object.
	 * 
	 * <p>Buffers represent linear arrays of data which are used for various purposes by binding them to the graphics pipeline via descriptor sets or via certain
	 * commands, or by directly specifying them as parameters to certain commands.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkBufferCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pBuffer} <b>must</b> be a pointer to a {@code VkBuffer} handle</li>
	 * <li>If the {@code flags} member of {@code pCreateInfo} includes {@link #VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT}, creating this {@code VkBuffer} <b>must not</b> cause the
	 * total required sparse memory for all currently valid sparse resources on the device to exceed
	 * {@link VkPhysicalDeviceLimits}{@code ::sparseAddressSpaceSize}</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the buffer object
	 * @param pCreateInfo a pointer to an instance of the {@link VkBufferCreateInfo} structure containing parameters affecting creation of the buffer
	 * @param pAllocator  controls host memory allocation
	 * @param pBuffer     points to a {@code VkBuffer} handle in which the resulting buffer object is returned
	 */
	public static int nvkCreateBuffer(VkDevice device, long pCreateInfo, long pAllocator, long pBuffer) {
		long __functionAddress = device.getCapabilities().vkCreateBuffer;
		if ( CHECKS ) {
			VkBufferCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pBuffer);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new buffer object.
	 * 
	 * <p>Buffers represent linear arrays of data which are used for various purposes by binding them to the graphics pipeline via descriptor sets or via certain
	 * commands, or by directly specifying them as parameters to certain commands.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkBufferCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pBuffer} <b>must</b> be a pointer to a {@code VkBuffer} handle</li>
	 * <li>If the {@code flags} member of {@code pCreateInfo} includes {@link #VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT}, creating this {@code VkBuffer} <b>must not</b> cause the
	 * total required sparse memory for all currently valid sparse resources on the device to exceed
	 * {@link VkPhysicalDeviceLimits}{@code ::sparseAddressSpaceSize}</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the buffer object
	 * @param pCreateInfo a pointer to an instance of the {@link VkBufferCreateInfo} structure containing parameters affecting creation of the buffer
	 * @param pAllocator  controls host memory allocation
	 * @param pBuffer     points to a {@code VkBuffer} handle in which the resulting buffer object is returned
	 */
	public static int vkCreateBuffer(VkDevice device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pBuffer) {
		if ( CHECKS )
			checkBuffer(pBuffer, 1);
		return nvkCreateBuffer(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pBuffer));
	}

	// --- [ vkDestroyBuffer ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a buffer object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code buffer} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code buffer} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code buffer} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code buffer}, either directly or via a {@code VkBufferView}, <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code buffer} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code buffer} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code buffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the buffer
	 * @param buffer     the buffer to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroyBuffer(VkDevice device, long buffer, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyBuffer;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), buffer, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a buffer object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code buffer} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code buffer} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code buffer} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code buffer}, either directly or via a {@code VkBufferView}, <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code buffer} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code buffer} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code buffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the buffer
	 * @param buffer     the buffer to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroyBuffer(VkDevice device, long buffer, VkAllocationCallbacks pAllocator) {
		nvkDestroyBuffer(device, buffer, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateBufferView ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateBufferView.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new buffer view object.
	 * 
	 * <p>A buffer view represents a contiguous range of a buffer and a specific format to be used to interpret the data. Buffer views are used to enable shaders
	 * to access buffer contents interpreted as formatted data. In order to create a valid buffer view, the buffer <b>must</b> have been created with at least one of
	 * the following usage flags:</p>
	 * 
	 * <ul>
	 * <li>{@link #VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT}</li>
	 * <li>{@link #VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkBufferViewCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pView} <b>must</b> be a pointer to a {@code VkBufferView} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the buffer view
	 * @param pCreateInfo a pointer to an instance of the {@link VkBufferViewCreateInfo} structure containing parameters to be used to create the buffer
	 * @param pAllocator  controls host memory allocation
	 * @param pView       points to a {@code VkBufferView} handle in which the resulting buffer view object is returned
	 */
	public static int nvkCreateBufferView(VkDevice device, long pCreateInfo, long pAllocator, long pView) {
		long __functionAddress = device.getCapabilities().vkCreateBufferView;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pView);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateBufferView.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new buffer view object.
	 * 
	 * <p>A buffer view represents a contiguous range of a buffer and a specific format to be used to interpret the data. Buffer views are used to enable shaders
	 * to access buffer contents interpreted as formatted data. In order to create a valid buffer view, the buffer <b>must</b> have been created with at least one of
	 * the following usage flags:</p>
	 * 
	 * <ul>
	 * <li>{@link #VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT}</li>
	 * <li>{@link #VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkBufferViewCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pView} <b>must</b> be a pointer to a {@code VkBufferView} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the buffer view
	 * @param pCreateInfo a pointer to an instance of the {@link VkBufferViewCreateInfo} structure containing parameters to be used to create the buffer
	 * @param pAllocator  controls host memory allocation
	 * @param pView       points to a {@code VkBufferView} handle in which the resulting buffer view object is returned
	 */
	public static int vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pView) {
		if ( CHECKS )
			checkBuffer(pView, 1);
		return nvkCreateBufferView(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pView));
	}

	// --- [ vkDestroyBufferView ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyBufferView.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a buffer view object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code bufferView} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code bufferView} <b>must</b> be a valid {@code VkBufferView} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code bufferView} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code bufferView} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code bufferView} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code bufferView} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code bufferView} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code bufferView} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the buffer view
	 * @param bufferView the buffer view to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroyBufferView(VkDevice device, long bufferView, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyBufferView;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), bufferView, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyBufferView.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a buffer view object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code bufferView} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code bufferView} <b>must</b> be a valid {@code VkBufferView} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code bufferView} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code bufferView} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code bufferView} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code bufferView} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code bufferView} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code bufferView} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the buffer view
	 * @param bufferView the buffer view to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroyBufferView(VkDevice device, long bufferView, VkAllocationCallbacks pAllocator) {
		nvkDestroyBufferView(device, bufferView, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateImage ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateImage.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new image object.
	 * 
	 * <p>Images represent multidimensional - up to 3 - arrays of data which <b>can</b> be used for various purposes (e.g. attachments, textures), by binding them to
	 * the graphics pipeline via descriptor sets, or by directly specifying them as parameters to certain commands.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkImageCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pImage} <b>must</b> be a pointer to a {@code VkImage} handle</li>
	 * <li>If the {@code flags} member of {@code pCreateInfo} includes {@link #VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, creating this {@code VkImage} <b>must not</b> cause the
	 * total required sparse memory for all currently valid sparse resources on the device to exceed
	 * {@link VkPhysicalDeviceLimits}{@code ::sparseAddressSpaceSize}</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the image
	 * @param pCreateInfo a pointer to an instance of the {@link VkImageCreateInfo} structure containing parameters to be used to create the image
	 * @param pAllocator  controls host memory allocation
	 * @param pImage      points to a {@code VkImage} handle in which the resulting image object is returned
	 */
	public static int nvkCreateImage(VkDevice device, long pCreateInfo, long pAllocator, long pImage) {
		long __functionAddress = device.getCapabilities().vkCreateImage;
		if ( CHECKS ) {
			VkImageCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pImage);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateImage.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new image object.
	 * 
	 * <p>Images represent multidimensional - up to 3 - arrays of data which <b>can</b> be used for various purposes (e.g. attachments, textures), by binding them to
	 * the graphics pipeline via descriptor sets, or by directly specifying them as parameters to certain commands.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkImageCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pImage} <b>must</b> be a pointer to a {@code VkImage} handle</li>
	 * <li>If the {@code flags} member of {@code pCreateInfo} includes {@link #VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, creating this {@code VkImage} <b>must not</b> cause the
	 * total required sparse memory for all currently valid sparse resources on the device to exceed
	 * {@link VkPhysicalDeviceLimits}{@code ::sparseAddressSpaceSize}</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the image
	 * @param pCreateInfo a pointer to an instance of the {@link VkImageCreateInfo} structure containing parameters to be used to create the image
	 * @param pAllocator  controls host memory allocation
	 * @param pImage      points to a {@code VkImage} handle in which the resulting image object is returned
	 */
	public static int vkCreateImage(VkDevice device, VkImageCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pImage) {
		if ( CHECKS )
			checkBuffer(pImage, 1);
		return nvkCreateImage(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pImage));
	}

	// --- [ vkDestroyImage ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyImage.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys an image object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code image} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code image} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code image} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code image}, either directly or via a {@code VkImageView}, <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code image} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code image} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code image} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the image
	 * @param image      the image to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroyImage(VkDevice device, long image, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyImage;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), image, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyImage.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys an image object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code image} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code image} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code image} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code image}, either directly or via a {@code VkImageView}, <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code image} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code image} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code image} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the image
	 * @param image      the image to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroyImage(VkDevice device, long image, VkAllocationCallbacks pAllocator) {
		nvkDestroyImage(device, image, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetImageSubresourceLayout ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetImageSubresourceLayout.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the layout of an image subresource (mipLevel/arrayLayer) of an image created with linear tiling.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code pSubresource} <b>must</b> be a pointer to a valid {@link VkImageSubresource} structure</li>
	 * <li>{@code pLayout} <b>must</b> be a pointer to a {@link VkSubresourceLayout} structure</li>
	 * <li>{@code image} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code image} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>{@code image} <b>must</b> have been created with {@code tiling} equal to {@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}</li>
	 * <li>The {@code aspectMask} member of {@code pSubresource} <b>must</b> only have a single bit set</li>
	 * </ul>
	 *
	 * @param device       the logical device that owns the image
	 * @param image        the image whose layout is being queried
	 * @param pSubresource a pointer to a {@link VkImageSubresource} structure selecting a specific image for the image subresource
	 * @param pLayout      points to a {@link VkSubresourceLayout} structure in which the layout is returned
	 */
	public static void nvkGetImageSubresourceLayout(VkDevice device, long image, long pSubresource, long pLayout) {
		long __functionAddress = device.getCapabilities().vkGetImageSubresourceLayout;
		callPJPPV(__functionAddress, device.address(), image, pSubresource, pLayout);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetImageSubresourceLayout.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the layout of an image subresource (mipLevel/arrayLayer) of an image created with linear tiling.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code pSubresource} <b>must</b> be a pointer to a valid {@link VkImageSubresource} structure</li>
	 * <li>{@code pLayout} <b>must</b> be a pointer to a {@link VkSubresourceLayout} structure</li>
	 * <li>{@code image} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code image} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>{@code image} <b>must</b> have been created with {@code tiling} equal to {@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}</li>
	 * <li>The {@code aspectMask} member of {@code pSubresource} <b>must</b> only have a single bit set</li>
	 * </ul>
	 *
	 * @param device       the logical device that owns the image
	 * @param image        the image whose layout is being queried
	 * @param pSubresource a pointer to a {@link VkImageSubresource} structure selecting a specific image for the image subresource
	 * @param pLayout      points to a {@link VkSubresourceLayout} structure in which the layout is returned
	 */
	public static void vkGetImageSubresourceLayout(VkDevice device, long image, VkImageSubresource pSubresource, VkSubresourceLayout pLayout) {
		nvkGetImageSubresourceLayout(device, image, pSubresource.address(), pLayout.address());
	}

	// --- [ vkCreateImageView ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateImageView.html">Khronos Reference Page</a></p>
	 * 
	 * Creates an image view from an existing image.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkImageViewCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pView} <b>must</b> be a pointer to a {@code VkImageView} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the image view
	 * @param pCreateInfo a pointer to an instance of the {@link VkImageViewCreateInfo} structure containing parameters to be used to create the image view
	 * @param pAllocator  controls host memory allocation
	 * @param pView       points to a {@code VkImageView} handle in which the resulting image view object is returned
	 */
	public static int nvkCreateImageView(VkDevice device, long pCreateInfo, long pAllocator, long pView) {
		long __functionAddress = device.getCapabilities().vkCreateImageView;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pView);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateImageView.html">Khronos Reference Page</a></p>
	 * 
	 * Creates an image view from an existing image.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkImageViewCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pView} <b>must</b> be a pointer to a {@code VkImageView} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the image view
	 * @param pCreateInfo a pointer to an instance of the {@link VkImageViewCreateInfo} structure containing parameters to be used to create the image view
	 * @param pAllocator  controls host memory allocation
	 * @param pView       points to a {@code VkImageView} handle in which the resulting image view object is returned
	 */
	public static int vkCreateImageView(VkDevice device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pView) {
		if ( CHECKS )
			checkBuffer(pView, 1);
		return nvkCreateImageView(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pView));
	}

	// --- [ vkDestroyImageView ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyImageView.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys an image view object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code imageView} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code imageView} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code imageView} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code imageView} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code imageView} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code imageView} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code imageView} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the image view
	 * @param imageView  the image view to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroyImageView(VkDevice device, long imageView, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyImageView;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), imageView, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyImageView.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys an image view object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code imageView} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code imageView} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code imageView} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code imageView} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code imageView} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code imageView} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code imageView} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the image view
	 * @param imageView  the image view to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroyImageView(VkDevice device, long imageView, VkAllocationCallbacks pAllocator) {
		nvkDestroyImageView(device, imageView, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateShaderModule ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateShaderModule.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new shader module object.
	 * 
	 * <p>Shader modules contain shader code and one or more entry points. Shaders are selected from a shader module by specifying an entry point as part of
	 * pipeline creation. The stages of a pipeline <b>can</b> use shaders that come from different modules. The shader code defining a shader module <b>must</b> be in the
	 * SPIR-V format.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkShaderModuleCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pShaderModule} <b>must</b> be a pointer to a {@code VkShaderModule} handle</li>
	 * </ul>
	 *
	 * @param device        the logical device that creates the shader module
	 * @param pCreateInfo   a pointer to an instance of the {@link VkShaderModuleCreateInfo} structure
	 * @param pAllocator    controls host memory allocation
	 * @param pShaderModule points to a {@code VkShaderModule} handle in which the resulting render pass object is returned
	 */
	public static int nvkCreateShaderModule(VkDevice device, long pCreateInfo, long pAllocator, long pShaderModule) {
		long __functionAddress = device.getCapabilities().vkCreateShaderModule;
		if ( CHECKS ) {
			VkShaderModuleCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pShaderModule);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateShaderModule.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new shader module object.
	 * 
	 * <p>Shader modules contain shader code and one or more entry points. Shaders are selected from a shader module by specifying an entry point as part of
	 * pipeline creation. The stages of a pipeline <b>can</b> use shaders that come from different modules. The shader code defining a shader module <b>must</b> be in the
	 * SPIR-V format.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkShaderModuleCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pShaderModule} <b>must</b> be a pointer to a {@code VkShaderModule} handle</li>
	 * </ul>
	 *
	 * @param device        the logical device that creates the shader module
	 * @param pCreateInfo   a pointer to an instance of the {@link VkShaderModuleCreateInfo} structure
	 * @param pAllocator    controls host memory allocation
	 * @param pShaderModule points to a {@code VkShaderModule} handle in which the resulting render pass object is returned
	 */
	public static int vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pShaderModule) {
		if ( CHECKS )
			checkBuffer(pShaderModule, 1);
		return nvkCreateShaderModule(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pShaderModule));
	}

	// --- [ vkDestroyShaderModule ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyShaderModule.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a shader module object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code shaderModule} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code shaderModule} <b>must</b> be a valid {@code VkShaderModule} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code shaderModule} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code shaderModule} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code shaderModule} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code shaderModule} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code shaderModule} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device       the logical device that destroys the shader module
	 * @param shaderModule the handle of the shader module to destroy
	 * @param pAllocator   controls host memory allocation
	 */
	public static void nvkDestroyShaderModule(VkDevice device, long shaderModule, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyShaderModule;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), shaderModule, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyShaderModule.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a shader module object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code shaderModule} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code shaderModule} <b>must</b> be a valid {@code VkShaderModule} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code shaderModule} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code shaderModule} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code shaderModule} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code shaderModule} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code shaderModule} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device       the logical device that destroys the shader module
	 * @param shaderModule the handle of the shader module to destroy
	 * @param pAllocator   controls host memory allocation
	 */
	public static void vkDestroyShaderModule(VkDevice device, long shaderModule, VkAllocationCallbacks pAllocator) {
		nvkDestroyShaderModule(device, shaderModule, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreatePipelineCache ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreatePipelineCache.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new pipeline cache object.
	 * 
	 * <p>Pipeline cache objects allow the result of pipeline construction to be reused between pipelines and between runs of an application. Reuse between
	 * pipelines is achieved by passing the same pipeline cache object when creating multiple related pipelines. Reuse across runs of an application is
	 * achieved by retrieving pipeline cache contents in one run of an application, saving the contents, and using them to preinitialize a pipeline cache on a
	 * subsequent run. The contents of the pipeline cache objects are managed by the implementation. Applications <b>can</b> manage the host memory consumed by a
	 * pipeline cache object and control the amount of data retrieved from a pipeline cache object.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>can</b> track and manage the total host memory size of a pipeline cache object using the {@code pAllocator}. Applications <b>can</b> limit the
	 * amount of data retrieved from a pipeline cache object in {@link #vkGetPipelineCacheData GetPipelineCacheData}. Implementations <b>should not</b> internally limit the total number of
	 * entries added to a pipeline cache object or the total host memory consumed.</p>
	 * </div>
	 * 
	 * <p>Once created, a pipeline cache <b>can</b> be passed to the {@link #vkCreateGraphicsPipelines CreateGraphicsPipelines} and {@link #vkCreateComputePipelines CreateComputePipelines} commands. If the pipeline cache passed
	 * into these commands is not {@link #VK_NULL_HANDLE NULL_HANDLE}, the implementation will query it for possible reuse opportunities and update it with new content. The use of
	 * the pipeline cache object in these commands is internally synchronized, and the same pipeline cache object <b>can</b> be used in multiple threads
	 * simultaneously.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Implementations <b>should</b> make every effort to limit any critical sections to the actual accesses to the cache, which is expected to be significantly
	 * shorter than the duration of the {@code vkCreateGraphicsPipelines} and {@code vkCreateComputePipelines} commands.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkPipelineCacheCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pPipelineCache} <b>must</b> be a pointer to a {@code VkPipelineCache} handle</li>
	 * </ul>
	 *
	 * @param device         the logical device that creates the pipeline cache object
	 * @param pCreateInfo    a pointer to a {@link VkPipelineCacheCreateInfo} structure that contains the initial parameters for the pipeline cache object
	 * @param pAllocator     controls host memory allocation
	 * @param pPipelineCache a pointer to a {@code VkPipelineCache} handle in which the resulting pipeline cache object is returned
	 */
	public static int nvkCreatePipelineCache(VkDevice device, long pCreateInfo, long pAllocator, long pPipelineCache) {
		long __functionAddress = device.getCapabilities().vkCreatePipelineCache;
		if ( CHECKS ) {
			VkPipelineCacheCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pPipelineCache);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreatePipelineCache.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new pipeline cache object.
	 * 
	 * <p>Pipeline cache objects allow the result of pipeline construction to be reused between pipelines and between runs of an application. Reuse between
	 * pipelines is achieved by passing the same pipeline cache object when creating multiple related pipelines. Reuse across runs of an application is
	 * achieved by retrieving pipeline cache contents in one run of an application, saving the contents, and using them to preinitialize a pipeline cache on a
	 * subsequent run. The contents of the pipeline cache objects are managed by the implementation. Applications <b>can</b> manage the host memory consumed by a
	 * pipeline cache object and control the amount of data retrieved from a pipeline cache object.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>can</b> track and manage the total host memory size of a pipeline cache object using the {@code pAllocator}. Applications <b>can</b> limit the
	 * amount of data retrieved from a pipeline cache object in {@link #vkGetPipelineCacheData GetPipelineCacheData}. Implementations <b>should not</b> internally limit the total number of
	 * entries added to a pipeline cache object or the total host memory consumed.</p>
	 * </div>
	 * 
	 * <p>Once created, a pipeline cache <b>can</b> be passed to the {@link #vkCreateGraphicsPipelines CreateGraphicsPipelines} and {@link #vkCreateComputePipelines CreateComputePipelines} commands. If the pipeline cache passed
	 * into these commands is not {@link #VK_NULL_HANDLE NULL_HANDLE}, the implementation will query it for possible reuse opportunities and update it with new content. The use of
	 * the pipeline cache object in these commands is internally synchronized, and the same pipeline cache object <b>can</b> be used in multiple threads
	 * simultaneously.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Implementations <b>should</b> make every effort to limit any critical sections to the actual accesses to the cache, which is expected to be significantly
	 * shorter than the duration of the {@code vkCreateGraphicsPipelines} and {@code vkCreateComputePipelines} commands.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkPipelineCacheCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pPipelineCache} <b>must</b> be a pointer to a {@code VkPipelineCache} handle</li>
	 * </ul>
	 *
	 * @param device         the logical device that creates the pipeline cache object
	 * @param pCreateInfo    a pointer to a {@link VkPipelineCacheCreateInfo} structure that contains the initial parameters for the pipeline cache object
	 * @param pAllocator     controls host memory allocation
	 * @param pPipelineCache a pointer to a {@code VkPipelineCache} handle in which the resulting pipeline cache object is returned
	 */
	public static int vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pPipelineCache) {
		if ( CHECKS )
			checkBuffer(pPipelineCache, 1);
		return nvkCreatePipelineCache(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelineCache));
	}

	// --- [ vkDestroyPipelineCache ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyPipelineCache.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a pipeline cache object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipelineCache} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code pipelineCache} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code pipelineCache} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code pipelineCache} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pipelineCache} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device        
	 * @param pipelineCache 
	 * @param pAllocator    controls host memory allocation
	 */
	public static void nvkDestroyPipelineCache(VkDevice device, long pipelineCache, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyPipelineCache;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), pipelineCache, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyPipelineCache.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a pipeline cache object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipelineCache} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code pipelineCache} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code pipelineCache} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code pipelineCache} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pipelineCache} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device        
	 * @param pipelineCache 
	 * @param pAllocator    controls host memory allocation
	 */
	public static void vkDestroyPipelineCache(VkDevice device, long pipelineCache, VkAllocationCallbacks pAllocator) {
		nvkDestroyPipelineCache(device, pipelineCache, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetPipelineCacheData ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPipelineCacheData.html">Khronos Reference Page</a></p>
	 * 
	 * Retrieves data from a pipeline cache object.
	 * 
	 * <p>If {@code pData} is {@code NULL}, then the maximum size of the data that <b>can</b> be retrieved from the pipeline cache, in bytes, is returned in {@code pDataSize}.
	 * Otherwise, {@code pDataSize} <b>must</b> point to a variable set by the user to the size of the buffer, in bytes, pointed to by {@code pData}, and on return
	 * the variable is overwritten with the amount of data actually written to {@code pData}.</p>
	 * 
	 * <p>If {@code dataSize} is less than the maximum size that <b>can</b> be retrieved by the pipeline cache, at most {@code pDataSize} bytes will be written to
	 * {@code pData}, and {@code vkGetPipelineCacheData} will return {@link #VK_INCOMPLETE INCOMPLETE}. Any data written to {@code pData} is valid and <b>can</b> be provided as the
	 * {@code pInitialData} member of the {@link VkPipelineCacheCreateInfo} structure passed to {@link #vkCreatePipelineCache CreatePipelineCache}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>{@code pDataSize} <b>must</b> be a pointer to a {@code size_t} value</li>
	 * <li>If the value referenced by {@code pDataSize} is not 0, and {@code pData} is not {@code NULL}, {@code pData} <b>must</b> be a pointer to an array of
	 * {@code pDataSize} bytes</li>
	 * <li>{@code pipelineCache} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code pipelineCache} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 * 
	 * <p>Applications <b>can</b> store the data retrieved from the pipeline cache, and use these data, possibly in a future run of the application, to populate new
	 * pipeline cache objects. The results of pipeline compiles, however, <b>may</b> depend on the vendor ID, device ID, driver version, and other details of the
	 * device. To enable applications to detect when previously retrieved data is incompatible with the device, the initial bytes written to {@code pData}
	 * <b>must</b> be a header consisting of the following members:</p>
	 * 
	 * <table class=lwjgl>
	 * <tr><th>Offset</th><th>Size</th><th>Meaning</th></tr>
	 * <tr><td>0</td><td>4</td><td>length in bytes of the entire pipeline cache header written as a stream of bytes, with the least significant byte first</td></tr>
	 * <tr><td>4</td><td>4</td><td>a {@code VkPipelineCacheHeaderVersion} value written as a stream of bytes, with the least significant byte first</td></tr>
	 * <tr><td>8</td><td>4</td><td>a vendor ID equal to {@link VkPhysicalDeviceProperties}{@code ::vendorID} written as a stream of bytes, with the least significant byte first</td></tr>
	 * <tr><td>12</td><td>4</td><td>a device ID equal to {@code VkPhysicalDeviceProperties::deviceID} written as a stream of bytes, with the least significant byte first</td></tr>
	 * <tr><td>16</td><td>{@link #VK_UUID_SIZE UUID_SIZE}</td><td>a pipeline cache ID equal to {@code VkPhysicalDeviceProperties::pipelineCacheUUID}</td></tr>
	 * </table>
	 * 
	 * <p>The first four bytes encode the length of the entire pipeline header, in bytes. This value includes all fields in the header including the pipeline
	 * cache version field and the size of the length field.</p>
	 * 
	 * <p>The next four bytes encode the pipeline cache version. This field is interpreted as an {@code VkPipelineCacheHeaderVersion} value, and <b>must</b> have one of
	 * the following values:</p>
	 * 
	 * <pre><code>typedef enum VkPipelineCacheHeaderVersion {
    VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1,
} VkPipelineCacheHeaderVersion;</code></pre>
	 * 
	 * <p>A consumer of the pipeline cache <b>should</b> use the cache version to interpret the remainder of the cache header.</p>
	 * 
	 * <p>If {@code dataSize} is less than what is necessary to store this header, nothing will be written to {@code pData} and zero will be written to
	 * {@code dataSize}.</p>
	 *
	 * @param device        the logical device that owns the pipeline cache
	 * @param pipelineCache the pipeline cache to retrieve data from
	 * @param pDataSize     a pointer to a value related to the amount of data in the pipeline cache
	 * @param pData         either {@code NULL} or a pointer to a buffer
	 */
	public static int nvkGetPipelineCacheData(VkDevice device, long pipelineCache, long pDataSize, long pData) {
		long __functionAddress = device.getCapabilities().vkGetPipelineCacheData;
		return callPJPPI(__functionAddress, device.address(), pipelineCache, pDataSize, pData);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPipelineCacheData.html">Khronos Reference Page</a></p>
	 * 
	 * Retrieves data from a pipeline cache object.
	 * 
	 * <p>If {@code pData} is {@code NULL}, then the maximum size of the data that <b>can</b> be retrieved from the pipeline cache, in bytes, is returned in {@code pDataSize}.
	 * Otherwise, {@code pDataSize} <b>must</b> point to a variable set by the user to the size of the buffer, in bytes, pointed to by {@code pData}, and on return
	 * the variable is overwritten with the amount of data actually written to {@code pData}.</p>
	 * 
	 * <p>If {@code dataSize} is less than the maximum size that <b>can</b> be retrieved by the pipeline cache, at most {@code pDataSize} bytes will be written to
	 * {@code pData}, and {@code vkGetPipelineCacheData} will return {@link #VK_INCOMPLETE INCOMPLETE}. Any data written to {@code pData} is valid and <b>can</b> be provided as the
	 * {@code pInitialData} member of the {@link VkPipelineCacheCreateInfo} structure passed to {@link #vkCreatePipelineCache CreatePipelineCache}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>{@code pDataSize} <b>must</b> be a pointer to a {@code size_t} value</li>
	 * <li>If the value referenced by {@code pDataSize} is not 0, and {@code pData} is not {@code NULL}, {@code pData} <b>must</b> be a pointer to an array of
	 * {@code pDataSize} bytes</li>
	 * <li>{@code pipelineCache} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code pipelineCache} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 * 
	 * <p>Applications <b>can</b> store the data retrieved from the pipeline cache, and use these data, possibly in a future run of the application, to populate new
	 * pipeline cache objects. The results of pipeline compiles, however, <b>may</b> depend on the vendor ID, device ID, driver version, and other details of the
	 * device. To enable applications to detect when previously retrieved data is incompatible with the device, the initial bytes written to {@code pData}
	 * <b>must</b> be a header consisting of the following members:</p>
	 * 
	 * <table class=lwjgl>
	 * <tr><th>Offset</th><th>Size</th><th>Meaning</th></tr>
	 * <tr><td>0</td><td>4</td><td>length in bytes of the entire pipeline cache header written as a stream of bytes, with the least significant byte first</td></tr>
	 * <tr><td>4</td><td>4</td><td>a {@code VkPipelineCacheHeaderVersion} value written as a stream of bytes, with the least significant byte first</td></tr>
	 * <tr><td>8</td><td>4</td><td>a vendor ID equal to {@link VkPhysicalDeviceProperties}{@code ::vendorID} written as a stream of bytes, with the least significant byte first</td></tr>
	 * <tr><td>12</td><td>4</td><td>a device ID equal to {@code VkPhysicalDeviceProperties::deviceID} written as a stream of bytes, with the least significant byte first</td></tr>
	 * <tr><td>16</td><td>{@link #VK_UUID_SIZE UUID_SIZE}</td><td>a pipeline cache ID equal to {@code VkPhysicalDeviceProperties::pipelineCacheUUID}</td></tr>
	 * </table>
	 * 
	 * <p>The first four bytes encode the length of the entire pipeline header, in bytes. This value includes all fields in the header including the pipeline
	 * cache version field and the size of the length field.</p>
	 * 
	 * <p>The next four bytes encode the pipeline cache version. This field is interpreted as an {@code VkPipelineCacheHeaderVersion} value, and <b>must</b> have one of
	 * the following values:</p>
	 * 
	 * <pre><code>typedef enum VkPipelineCacheHeaderVersion {
    VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1,
} VkPipelineCacheHeaderVersion;</code></pre>
	 * 
	 * <p>A consumer of the pipeline cache <b>should</b> use the cache version to interpret the remainder of the cache header.</p>
	 * 
	 * <p>If {@code dataSize} is less than what is necessary to store this header, nothing will be written to {@code pData} and zero will be written to
	 * {@code dataSize}.</p>
	 *
	 * @param device        the logical device that owns the pipeline cache
	 * @param pipelineCache the pipeline cache to retrieve data from
	 * @param pDataSize     a pointer to a value related to the amount of data in the pipeline cache
	 * @param pData         either {@code NULL} or a pointer to a buffer
	 */
	public static int vkGetPipelineCacheData(VkDevice device, long pipelineCache, PointerBuffer pDataSize, ByteBuffer pData) {
		if ( CHECKS ) {
			checkBuffer(pDataSize, 1);
			if ( pData != null ) checkBuffer(pData, pDataSize.get(pDataSize.position()));
		}
		return nvkGetPipelineCacheData(device, pipelineCache, memAddress(pDataSize), memAddressSafe(pData));
	}

	// --- [ vkMergePipelineCaches ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkMergePipelineCaches.html">Khronos Reference Page</a></p>
	 * 
	 * Merges pipeline cache objects.
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>The details of the merge operation are implementation dependent, but implementations <b>should</b> merge the contents of the specified pipelines and prune
	 * duplicate entries.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code dstCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>{@code pSrcCaches} <b>must</b> be a pointer to an array of {@code srcCacheCount} valid {@code VkPipelineCache} handles</li>
	 * <li>{@code srcCacheCount} <b>must</b> be greater than 0</li>
	 * <li>{@code dstCache} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each element of {@code pSrcCaches} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device}, {@code dstCache} and the elements of {@code pSrcCaches} <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>{@code dstCache} <b>must not</b> appear in the list of source caches</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code dstCache} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device        the logical device that owns the pipeline cache objects
	 * @param dstCache      the handle of the pipeline cache to merge results into
	 * @param srcCacheCount the length of the {@code pSrcCaches} array
	 * @param pSrcCaches    an array of pipeline cache handles, which will be merged into {@code dstCache}. The previous contents of {@code dstCache} are included after the
	 *                      merge.
	 */
	public static int nvkMergePipelineCaches(VkDevice device, long dstCache, int srcCacheCount, long pSrcCaches) {
		long __functionAddress = device.getCapabilities().vkMergePipelineCaches;
		return callPJPI(__functionAddress, device.address(), dstCache, srcCacheCount, pSrcCaches);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkMergePipelineCaches.html">Khronos Reference Page</a></p>
	 * 
	 * Merges pipeline cache objects.
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>The details of the merge operation are implementation dependent, but implementations <b>should</b> merge the contents of the specified pipelines and prune
	 * duplicate entries.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code dstCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>{@code pSrcCaches} <b>must</b> be a pointer to an array of {@code srcCacheCount} valid {@code VkPipelineCache} handles</li>
	 * <li>{@code srcCacheCount} <b>must</b> be greater than 0</li>
	 * <li>{@code dstCache} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each element of {@code pSrcCaches} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device}, {@code dstCache} and the elements of {@code pSrcCaches} <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>{@code dstCache} <b>must not</b> appear in the list of source caches</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code dstCache} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that owns the pipeline cache objects
	 * @param dstCache   the handle of the pipeline cache to merge results into
	 * @param pSrcCaches an array of pipeline cache handles, which will be merged into {@code dstCache}. The previous contents of {@code dstCache} are included after the
	 *                   merge.
	 */
	public static int vkMergePipelineCaches(VkDevice device, long dstCache, LongBuffer pSrcCaches) {
		return nvkMergePipelineCaches(device, dstCache, pSrcCaches.remaining(), memAddress(pSrcCaches));
	}

	// --- [ vkCreateGraphicsPipelines ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateGraphicsPipelines.html">Khronos Reference Page</a></p>
	 * 
	 * Creates graphics pipelines.
	 * 
	 * <p>Graphics pipelines consist of multiple shader stages, multiple fixed-function pipeline stages, and a pipeline layout.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipelineCache} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>{@code pCreateInfos} <b>must</b> be a pointer to an array of {@code createInfoCount} valid {@link VkGraphicsPipelineCreateInfo} structures</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pPipelines} <b>must</b> be a pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
	 * <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
	 * <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code pipelineCache} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>If the {@code flags} member of any given element of {@code pCreateInfos} contains the {@link #VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and the
	 * {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into
	 * {@code pCreateInfos} that corresponds to that element</li>
	 * </ul>
	 *
	 * @param device          the logical device that creates the graphics pipelines
	 * @param pipelineCache   either {@link #VK_NULL_HANDLE NULL_HANDLE}, indicating that pipeline caching is disabled; or the handle of a valid pipeline cache object, in which case use of that cache
	 *                        is enabled for the duration of the command
	 * @param createInfoCount the length of the {@code pCreateInfos} and {@code pPipelines} arrays.
	 * @param pCreateInfos    an array of {@link VkGraphicsPipelineCreateInfo} structures
	 * @param pAllocator      controls host memory allocation
	 * @param pPipelines      a pointer to an array in which the resulting graphics pipeline objects are returned
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
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateGraphicsPipelines.html">Khronos Reference Page</a></p>
	 * 
	 * Creates graphics pipelines.
	 * 
	 * <p>Graphics pipelines consist of multiple shader stages, multiple fixed-function pipeline stages, and a pipeline layout.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipelineCache} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>{@code pCreateInfos} <b>must</b> be a pointer to an array of {@code createInfoCount} valid {@link VkGraphicsPipelineCreateInfo} structures</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pPipelines} <b>must</b> be a pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
	 * <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
	 * <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code pipelineCache} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>If the {@code flags} member of any given element of {@code pCreateInfos} contains the {@link #VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and the
	 * {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into
	 * {@code pCreateInfos} that corresponds to that element</li>
	 * </ul>
	 *
	 * @param device        the logical device that creates the graphics pipelines
	 * @param pipelineCache either {@link #VK_NULL_HANDLE NULL_HANDLE}, indicating that pipeline caching is disabled; or the handle of a valid pipeline cache object, in which case use of that cache
	 *                      is enabled for the duration of the command
	 * @param pCreateInfos  an array of {@link VkGraphicsPipelineCreateInfo} structures
	 * @param pAllocator    controls host memory allocation
	 * @param pPipelines    a pointer to an array in which the resulting graphics pipeline objects are returned
	 */
	public static int vkCreateGraphicsPipelines(VkDevice device, long pipelineCache, VkGraphicsPipelineCreateInfo.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, LongBuffer pPipelines) {
		if ( CHECKS )
			checkBuffer(pPipelines, pCreateInfos.remaining());
		return nvkCreateGraphicsPipelines(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelines));
	}

	// --- [ vkCreateComputePipelines ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateComputePipelines.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new compute pipeline object.
	 * 
	 * <p>Compute pipelines consist of a single static compute shader stage and the pipeline layout.</p>
	 * 
	 * <p>The compute pipeline encapsulates a compute shader and is created by calling {@code vkCreateComputePipelines} with {@code module} and {@code pName}
	 * selecting an entry point from a shader module, where that entry point defines a valid compute shader, in the {@link VkPipelineShaderStageCreateInfo}
	 * structure contained within the {@link VkComputePipelineCreateInfo} structure.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipelineCache} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>{@code pCreateInfos} <b>must</b> be a pointer to an array of {@code createInfoCount} valid {@link VkComputePipelineCreateInfo} structures</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pPipelines} <b>must</b> be a pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
	 * <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
	 * <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code pipelineCache} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>If the {@code flags} member of any given element of {@code pCreateInfos} contains the {@link #VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and the
	 * {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into
	 * {@code pCreateInfos} that corresponds to that element</li>
	 * </ul>
	 *
	 * @param device          the logical device that creates the compute pipelines
	 * @param pipelineCache   either {@link #VK_NULL_HANDLE NULL_HANDLE}, indicating that pipeline caching is disabled; or the handle of a valid pipeline cache object, in which case use of that cache
	 *                        is enabled for the duration of the command
	 * @param createInfoCount the length of the {@code pCreateInfos} and {@code pPipelines} arrays
	 * @param pCreateInfos    an array of {@link VkComputePipelineCreateInfo} structures
	 * @param pAllocator      controls host memory allocation
	 * @param pPipelines      a pointer to an array in which the resulting compute pipeline objects are returned
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
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateComputePipelines.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new compute pipeline object.
	 * 
	 * <p>Compute pipelines consist of a single static compute shader stage and the pipeline layout.</p>
	 * 
	 * <p>The compute pipeline encapsulates a compute shader and is created by calling {@code vkCreateComputePipelines} with {@code module} and {@code pName}
	 * selecting an entry point from a shader module, where that entry point defines a valid compute shader, in the {@link VkPipelineShaderStageCreateInfo}
	 * structure contained within the {@link VkComputePipelineCreateInfo} structure.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipelineCache} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
	 * <li>{@code pCreateInfos} <b>must</b> be a pointer to an array of {@code createInfoCount} valid {@link VkComputePipelineCreateInfo} structures</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pPipelines} <b>must</b> be a pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
	 * <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
	 * <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code pipelineCache} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>If the {@code flags} member of any given element of {@code pCreateInfos} contains the {@link #VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and the
	 * {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into
	 * {@code pCreateInfos} that corresponds to that element</li>
	 * </ul>
	 *
	 * @param device        the logical device that creates the compute pipelines
	 * @param pipelineCache either {@link #VK_NULL_HANDLE NULL_HANDLE}, indicating that pipeline caching is disabled; or the handle of a valid pipeline cache object, in which case use of that cache
	 *                      is enabled for the duration of the command
	 * @param pCreateInfos  an array of {@link VkComputePipelineCreateInfo} structures
	 * @param pAllocator    controls host memory allocation
	 * @param pPipelines    a pointer to an array in which the resulting compute pipeline objects are returned
	 */
	public static int vkCreateComputePipelines(VkDevice device, long pipelineCache, VkComputePipelineCreateInfo.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, LongBuffer pPipelines) {
		if ( CHECKS )
			checkBuffer(pPipelines, pCreateInfos.remaining());
		return nvkCreateComputePipelines(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelines));
	}

	// --- [ vkDestroyPipeline ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyPipeline.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a graphics or compute pipeline object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipeline} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code pipeline} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code pipeline} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code pipeline} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code pipeline} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code pipeline} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pipeline} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the pipeline
	 * @param pipeline   the handle of the pipeline to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroyPipeline(VkDevice device, long pipeline, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyPipeline;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), pipeline, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyPipeline.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a graphics or compute pipeline object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipeline} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code pipeline} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code pipeline} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code pipeline} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code pipeline} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code pipeline} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pipeline} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the pipeline
	 * @param pipeline   the handle of the pipeline to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroyPipeline(VkDevice device, long pipeline, VkAllocationCallbacks pAllocator) {
		nvkDestroyPipeline(device, pipeline, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreatePipelineLayout ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreatePipelineLayout.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new pipeline layout object.
	 * 
	 * <p>Access to descriptor sets from a pipeline is accomplished through a pipeline layout. Zero or more descriptor set layouts and zero or more push constant
	 * ranges are combined to form a pipeline layout object which describes the complete set of resources that <b>can</b> be accessed by a pipeline. The pipeline
	 * layout represents a sequence of descriptor sets with each having a specific layout. This sequence of layouts is used to determine the interface between
	 * shader stages and shader resources. Each pipeline is created using a pipeline layout.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkPipelineLayoutCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pPipelineLayout} <b>must</b> be a pointer to a {@code VkPipelineLayout} handle</li>
	 * </ul>
	 * 
	 * <p>Once created, pipeline layouts are used as part of pipeline creation, as part of binding descriptor sets, and as part of setting push constants.
	 * Pipeline creation accepts a pipeline layout as input, and the layout <b>may</b> be used to map (set, binding, arrayElement) tuples to hardware resources or
	 * memory locations within a descriptor set. The assignment of hardware resources depends only on the bindings defined in the descriptor sets that
	 * comprise the pipeline layout, and not on any shader source.</p>
	 * 
	 * <p>All resource variables statically used in all shaders in a pipeline <b>must</b> be declared with a (set, binding, arrayElement) that exists in the
	 * corresponding descriptor set layout and is of an appropriate descriptor type and includes the set of shader stages it is used by in {@code stageFlags}.
	 * The pipeline layout <b>can</b> include entries that are not used by a particular pipeline, or that are dead-code eliminated from any of the shaders. The
	 * pipeline layout allows the application to provide a consistent set of bindings across multiple pipeline compiles, which enables those pipelines to be
	 * compiled in a way that the implementation <b>may</b> cheaply switch pipelines without reprogramming the bindings.</p>
	 * 
	 * <p>Similarly, the push constant block declared in each shader (if present) <b>must</b> only place variables at offsets that are each included in a push constant
	 * range with {@code stageFlags} including the bit corresponding to the shader stage that uses it. The pipeline layout <b>can</b> include ranges or portions of
	 * ranges that are not used by a particular pipeline, or for which the variables have been dead-code eliminated from any of the shaders.</p>
	 * 
	 * <p>There is a limit on the total number of resources of each type that <b>can</b> be included in bindings in all descriptor set layouts in a pipeline layout as
	 * shown in the table below. The “Total Resources Available” column gives the limit on the number of each type of resource that <b>can</b> be included in
	 * bindings in all descriptor sets in the pipeline layout. Some resource types count against multiple limits. Additionally, there are limits on the total
	 * number of each type of resource that <b>can</b> be used in any pipeline stage.</p>
	 * 
	 * <table class=lwjgl>
	 * <tr><th>Total Resources Available</th><th>Resource Types</th></tr>
	 * <tr><td rowspan=2>maxDescriptorSetSamplers</td><td>sampler</td></tr>
	 * <tr><td>combined image sampler</td></tr>
	 * <tr><td rowspan=3>maxDescriptorSetSampledImages</td><td>sampled image</td></tr>
	 * <tr><td>combined image sampler</td></tr>
	 * <tr><td>uniform texel buffer</td></tr>
	 * <tr><td rowspan=2>maxDescriptorSetStorageImages</td><td>storage image</td></tr>
	 * <tr><td>storage texel buffer</td></tr>
	 * <tr><td rowspan=2>maxDescriptorSetUniformBuffers</td><td>uniform buffer</td></tr>
	 * <tr><td>uniform buffer dynamic</td></tr>
	 * <tr><td>maxDescriptorSetUniformBuffersDynamic</td><td>uniform buffer dynamic</td></tr>
	 * <tr><td rowspan=2>maxDescriptorSetStorageBuffers</td><td>storage buffer</td></tr>
	 * <tr><td>storage buffer dynamic</td></tr>
	 * <tr><td>maxDescriptorSetStorageBuffersDynamic</td><td>storage buffer dynamic</td></tr>
	 * <tr><td>maxDescriptorSetInputAttachments</td><td>input attachment</td></tr>
	 * </table>
	 * 
	 * <h5>Pipeline Layout Compatibility</h5>
	 * 
	 * <p>Two pipeline layouts are defined to be “compatible for push constants” if they were created with identical push constant ranges. Two pipeline layouts
	 * are defined to be “compatible for set N” if they were created with matching (the same, or identically defined) descriptor set layouts for sets zero
	 * through N, and if they were created with identical push constant ranges.</p>
	 * 
	 * <p>When binding a descriptor set  to set number N, if the previously bound descriptor sets for sets zero through N-1 were all bound using compatible
	 * pipeline layouts, then performing this binding does not disturb any of the lower numbered sets. If, additionally, the previous bound descriptor set for
	 * set N was bound using a pipeline layout compatible for set N, then the bindings in sets numbered greater than N are also not disturbed.</p>
	 * 
	 * <p>Similarly, when binding a pipeline, the pipeline <b>can</b> correctly access any previously bound descriptor sets which were bound with compatible pipeline
	 * layouts, as long as all lower numbered sets were also bound with compatible layouts.</p>
	 * 
	 * <p>Layout compatibility means that descriptor sets <b>can</b> be bound to a command buffer for use by any pipeline created with a compatible pipeline layout,
	 * and without having bound a particular pipeline first. It also means that descriptor sets <b>can</b> remain valid across a pipeline change, and the same
	 * resources will be accessible to the newly bound pipeline.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Implementor’s Note</h5>
	 * 
	 * <p>A consequence of layout compatibility is that when the implementation compiles a pipeline layout and assigns hardware units to resources, the
	 * mechanism to assign hardware units for set N <b>should</b> only be a function of sets [0..N].</p>
	 * </div>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Place the least frequently changing descriptor sets near the start of the pipeline layout, and place the descriptor sets representing the most
	 * frequently changing resources near the end. When pipelines are switched, only the descriptor set bindings that have been invalidated will need to
	 * be updated and the remainder of the descriptor set bindings will remain in place.</p>
	 * </div>
	 * 
	 * <p>The maximum number of descriptor sets that <b>can</b> be bound to a pipeline layout is queried from physical device properties (see
	 * {@link VkPhysicalDeviceLimits}{@code ::maxBoundDescriptorSets}).</p>
	 *
	 * @param device          the logical device that creates the pipeline layout
	 * @param pCreateInfo     a pointer to an instance of the {@link VkPipelineLayoutCreateInfo} structure specifying the state of the pipeline layout object
	 * @param pAllocator      controls host memory allocation
	 * @param pPipelineLayout points to a {@code VkPipelineLayout} handle in which the resulting pipeline layout object is returned
	 */
	public static int nvkCreatePipelineLayout(VkDevice device, long pCreateInfo, long pAllocator, long pPipelineLayout) {
		long __functionAddress = device.getCapabilities().vkCreatePipelineLayout;
		if ( CHECKS ) {
			VkPipelineLayoutCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pPipelineLayout);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreatePipelineLayout.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new pipeline layout object.
	 * 
	 * <p>Access to descriptor sets from a pipeline is accomplished through a pipeline layout. Zero or more descriptor set layouts and zero or more push constant
	 * ranges are combined to form a pipeline layout object which describes the complete set of resources that <b>can</b> be accessed by a pipeline. The pipeline
	 * layout represents a sequence of descriptor sets with each having a specific layout. This sequence of layouts is used to determine the interface between
	 * shader stages and shader resources. Each pipeline is created using a pipeline layout.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkPipelineLayoutCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pPipelineLayout} <b>must</b> be a pointer to a {@code VkPipelineLayout} handle</li>
	 * </ul>
	 * 
	 * <p>Once created, pipeline layouts are used as part of pipeline creation, as part of binding descriptor sets, and as part of setting push constants.
	 * Pipeline creation accepts a pipeline layout as input, and the layout <b>may</b> be used to map (set, binding, arrayElement) tuples to hardware resources or
	 * memory locations within a descriptor set. The assignment of hardware resources depends only on the bindings defined in the descriptor sets that
	 * comprise the pipeline layout, and not on any shader source.</p>
	 * 
	 * <p>All resource variables statically used in all shaders in a pipeline <b>must</b> be declared with a (set, binding, arrayElement) that exists in the
	 * corresponding descriptor set layout and is of an appropriate descriptor type and includes the set of shader stages it is used by in {@code stageFlags}.
	 * The pipeline layout <b>can</b> include entries that are not used by a particular pipeline, or that are dead-code eliminated from any of the shaders. The
	 * pipeline layout allows the application to provide a consistent set of bindings across multiple pipeline compiles, which enables those pipelines to be
	 * compiled in a way that the implementation <b>may</b> cheaply switch pipelines without reprogramming the bindings.</p>
	 * 
	 * <p>Similarly, the push constant block declared in each shader (if present) <b>must</b> only place variables at offsets that are each included in a push constant
	 * range with {@code stageFlags} including the bit corresponding to the shader stage that uses it. The pipeline layout <b>can</b> include ranges or portions of
	 * ranges that are not used by a particular pipeline, or for which the variables have been dead-code eliminated from any of the shaders.</p>
	 * 
	 * <p>There is a limit on the total number of resources of each type that <b>can</b> be included in bindings in all descriptor set layouts in a pipeline layout as
	 * shown in the table below. The “Total Resources Available” column gives the limit on the number of each type of resource that <b>can</b> be included in
	 * bindings in all descriptor sets in the pipeline layout. Some resource types count against multiple limits. Additionally, there are limits on the total
	 * number of each type of resource that <b>can</b> be used in any pipeline stage.</p>
	 * 
	 * <table class=lwjgl>
	 * <tr><th>Total Resources Available</th><th>Resource Types</th></tr>
	 * <tr><td rowspan=2>maxDescriptorSetSamplers</td><td>sampler</td></tr>
	 * <tr><td>combined image sampler</td></tr>
	 * <tr><td rowspan=3>maxDescriptorSetSampledImages</td><td>sampled image</td></tr>
	 * <tr><td>combined image sampler</td></tr>
	 * <tr><td>uniform texel buffer</td></tr>
	 * <tr><td rowspan=2>maxDescriptorSetStorageImages</td><td>storage image</td></tr>
	 * <tr><td>storage texel buffer</td></tr>
	 * <tr><td rowspan=2>maxDescriptorSetUniformBuffers</td><td>uniform buffer</td></tr>
	 * <tr><td>uniform buffer dynamic</td></tr>
	 * <tr><td>maxDescriptorSetUniformBuffersDynamic</td><td>uniform buffer dynamic</td></tr>
	 * <tr><td rowspan=2>maxDescriptorSetStorageBuffers</td><td>storage buffer</td></tr>
	 * <tr><td>storage buffer dynamic</td></tr>
	 * <tr><td>maxDescriptorSetStorageBuffersDynamic</td><td>storage buffer dynamic</td></tr>
	 * <tr><td>maxDescriptorSetInputAttachments</td><td>input attachment</td></tr>
	 * </table>
	 * 
	 * <h5>Pipeline Layout Compatibility</h5>
	 * 
	 * <p>Two pipeline layouts are defined to be “compatible for push constants” if they were created with identical push constant ranges. Two pipeline layouts
	 * are defined to be “compatible for set N” if they were created with matching (the same, or identically defined) descriptor set layouts for sets zero
	 * through N, and if they were created with identical push constant ranges.</p>
	 * 
	 * <p>When binding a descriptor set  to set number N, if the previously bound descriptor sets for sets zero through N-1 were all bound using compatible
	 * pipeline layouts, then performing this binding does not disturb any of the lower numbered sets. If, additionally, the previous bound descriptor set for
	 * set N was bound using a pipeline layout compatible for set N, then the bindings in sets numbered greater than N are also not disturbed.</p>
	 * 
	 * <p>Similarly, when binding a pipeline, the pipeline <b>can</b> correctly access any previously bound descriptor sets which were bound with compatible pipeline
	 * layouts, as long as all lower numbered sets were also bound with compatible layouts.</p>
	 * 
	 * <p>Layout compatibility means that descriptor sets <b>can</b> be bound to a command buffer for use by any pipeline created with a compatible pipeline layout,
	 * and without having bound a particular pipeline first. It also means that descriptor sets <b>can</b> remain valid across a pipeline change, and the same
	 * resources will be accessible to the newly bound pipeline.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Implementor’s Note</h5>
	 * 
	 * <p>A consequence of layout compatibility is that when the implementation compiles a pipeline layout and assigns hardware units to resources, the
	 * mechanism to assign hardware units for set N <b>should</b> only be a function of sets [0..N].</p>
	 * </div>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Place the least frequently changing descriptor sets near the start of the pipeline layout, and place the descriptor sets representing the most
	 * frequently changing resources near the end. When pipelines are switched, only the descriptor set bindings that have been invalidated will need to
	 * be updated and the remainder of the descriptor set bindings will remain in place.</p>
	 * </div>
	 * 
	 * <p>The maximum number of descriptor sets that <b>can</b> be bound to a pipeline layout is queried from physical device properties (see
	 * {@link VkPhysicalDeviceLimits}{@code ::maxBoundDescriptorSets}).</p>
	 *
	 * @param device          the logical device that creates the pipeline layout
	 * @param pCreateInfo     a pointer to an instance of the {@link VkPipelineLayoutCreateInfo} structure specifying the state of the pipeline layout object
	 * @param pAllocator      controls host memory allocation
	 * @param pPipelineLayout points to a {@code VkPipelineLayout} handle in which the resulting pipeline layout object is returned
	 */
	public static int vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pPipelineLayout) {
		if ( CHECKS )
			checkBuffer(pPipelineLayout, 1);
		return nvkCreatePipelineLayout(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelineLayout));
	}

	// --- [ vkDestroyPipelineLayout ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyPipelineLayout.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a pipeline layout object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipelineLayout} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code pipelineLayout} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code pipelineLayout} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code pipelineLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code pipelineLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pipelineLayout} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device         the logical device that destroys the pipeline layout
	 * @param pipelineLayout the pipeline layout to destroy
	 * @param pAllocator     controls host memory allocation
	 */
	public static void nvkDestroyPipelineLayout(VkDevice device, long pipelineLayout, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyPipelineLayout;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), pipelineLayout, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyPipelineLayout.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a pipeline layout object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code pipelineLayout} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code pipelineLayout} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code pipelineLayout} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code pipelineLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code pipelineLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pipelineLayout} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device         the logical device that destroys the pipeline layout
	 * @param pipelineLayout the pipeline layout to destroy
	 * @param pAllocator     controls host memory allocation
	 */
	public static void vkDestroyPipelineLayout(VkDevice device, long pipelineLayout, VkAllocationCallbacks pAllocator) {
		nvkDestroyPipelineLayout(device, pipelineLayout, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateSampler ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateSampler.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new sampler object.
	 * 
	 * <p>{@code VkSampler} objects encapsulate the state of an image sampler which is used by the implementation to read image data and apply filtering and
	 * other transformations for the shader.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkSamplerCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSampler} <b>must</b> be a pointer to a {@code VkSampler} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the sampler
	 * @param pCreateInfo a pointer to an instance of the {@link VkSamplerCreateInfo} structure specifying the state of the sampler object
	 * @param pAllocator  controls host memory allocation
	 * @param pSampler    points to a {@code VkSampler} handle in which the resulting sampler object is returned
	 */
	public static int nvkCreateSampler(VkDevice device, long pCreateInfo, long pAllocator, long pSampler) {
		long __functionAddress = device.getCapabilities().vkCreateSampler;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pSampler);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateSampler.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new sampler object.
	 * 
	 * <p>{@code VkSampler} objects encapsulate the state of an image sampler which is used by the implementation to read image data and apply filtering and
	 * other transformations for the shader.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkSamplerCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSampler} <b>must</b> be a pointer to a {@code VkSampler} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the sampler
	 * @param pCreateInfo a pointer to an instance of the {@link VkSamplerCreateInfo} structure specifying the state of the sampler object
	 * @param pAllocator  controls host memory allocation
	 * @param pSampler    points to a {@code VkSampler} handle in which the resulting sampler object is returned
	 */
	public static int vkCreateSampler(VkDevice device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSampler) {
		if ( CHECKS )
			checkBuffer(pSampler, 1);
		return nvkCreateSampler(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSampler));
	}

	// --- [ vkDestroySampler ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroySampler.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a sampler object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code sampler} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code sampler} <b>must</b> be a valid {@code VkSampler} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code sampler} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code sampler} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code sampler} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code sampler} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code sampler} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code sampler} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the sampler
	 * @param sampler    the sampler to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroySampler(VkDevice device, long sampler, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroySampler;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), sampler, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroySampler.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a sampler object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code sampler} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code sampler} <b>must</b> be a valid {@code VkSampler} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code sampler} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code sampler} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code sampler} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code sampler} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code sampler} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code sampler} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the sampler
	 * @param sampler    the sampler to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroySampler(VkDevice device, long sampler, VkAllocationCallbacks pAllocator) {
		nvkDestroySampler(device, sampler, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateDescriptorSetLayout ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateDescriptorSetLayout.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new descriptor set layout object.
	 * 
	 * <p>A descriptor set layout object is defined by an array of zero or more descriptor bindings. Each individual descriptor binding is specified by a
	 * descriptor type, a count (array size) of the number of descriptors in the binding, a set of shader stages that <b>can</b> access the binding, and (if using
	 * immutable samplers) an array of sampler descriptors.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkDescriptorSetLayoutCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSetLayout} <b>must</b> be a pointer to a {@code VkDescriptorSetLayout} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the descriptor set layout
	 * @param pCreateInfo a pointer to an instance of the {@link VkDescriptorSetLayoutCreateInfo} structure specifying the state of the descriptor set layout object
	 * @param pAllocator  controls host memory allocation
	 * @param pSetLayout  points to a {@code VkDescriptorSetLayout} handle in which the resulting descriptor set layout object is returned
	 */
	public static int nvkCreateDescriptorSetLayout(VkDevice device, long pCreateInfo, long pAllocator, long pSetLayout) {
		long __functionAddress = device.getCapabilities().vkCreateDescriptorSetLayout;
		if ( CHECKS ) {
			VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pSetLayout);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateDescriptorSetLayout.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new descriptor set layout object.
	 * 
	 * <p>A descriptor set layout object is defined by an array of zero or more descriptor bindings. Each individual descriptor binding is specified by a
	 * descriptor type, a count (array size) of the number of descriptors in the binding, a set of shader stages that <b>can</b> access the binding, and (if using
	 * immutable samplers) an array of sampler descriptors.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkDescriptorSetLayoutCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSetLayout} <b>must</b> be a pointer to a {@code VkDescriptorSetLayout} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the descriptor set layout
	 * @param pCreateInfo a pointer to an instance of the {@link VkDescriptorSetLayoutCreateInfo} structure specifying the state of the descriptor set layout object
	 * @param pAllocator  controls host memory allocation
	 * @param pSetLayout  points to a {@code VkDescriptorSetLayout} handle in which the resulting descriptor set layout object is returned
	 */
	public static int vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSetLayout) {
		if ( CHECKS )
			checkBuffer(pSetLayout, 1);
		return nvkCreateDescriptorSetLayout(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSetLayout));
	}

	// --- [ vkDestroyDescriptorSetLayout ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyDescriptorSetLayout.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a descriptor set layout object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code descriptorSetLayout} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code descriptorSetLayout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code descriptorSetLayout} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code descriptorSetLayout} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code descriptorSetLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code descriptorSetLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code descriptorSetLayout} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device              the logical device that destroys the descriptor set layout
	 * @param descriptorSetLayout the descriptor set layout to destroy
	 * @param pAllocator          controls host memory allocation
	 */
	public static void nvkDestroyDescriptorSetLayout(VkDevice device, long descriptorSetLayout, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyDescriptorSetLayout;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), descriptorSetLayout, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyDescriptorSetLayout.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a descriptor set layout object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code descriptorSetLayout} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code descriptorSetLayout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code descriptorSetLayout} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code descriptorSetLayout} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code descriptorSetLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code descriptorSetLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code descriptorSetLayout} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device              the logical device that destroys the descriptor set layout
	 * @param descriptorSetLayout the descriptor set layout to destroy
	 * @param pAllocator          controls host memory allocation
	 */
	public static void vkDestroyDescriptorSetLayout(VkDevice device, long descriptorSetLayout, VkAllocationCallbacks pAllocator) {
		nvkDestroyDescriptorSetLayout(device, descriptorSetLayout, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateDescriptorPool ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateDescriptorPool.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a descriptor pool object.
	 * 
	 * <p>Descriptor sets are allocated from descriptor pool objects. A descriptor pool maintains a pool of descriptors, from which sets are allocated.
	 * Descriptor pools are externally synchronized, meaning that the application <b>must not</b> allocate and/or free descriptor sets from the same pool in multiple
	 * threads simultaneously.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkDescriptorPoolCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pDescriptorPool} <b>must</b> be a pointer to a {@code VkDescriptorPool} handle</li>
	 * </ul>
	 *
	 * @param device          the logical device that creates the descriptor pool
	 * @param pCreateInfo     a pointer to an instance of the {@link VkDescriptorPoolCreateInfo} structure specifying the state of the descriptor pool object
	 * @param pAllocator      controls host memory allocation
	 * @param pDescriptorPool points to a {@code VkDescriptorPool} handle in which the resulting descriptor pool object is returned
	 */
	public static int nvkCreateDescriptorPool(VkDevice device, long pCreateInfo, long pAllocator, long pDescriptorPool) {
		long __functionAddress = device.getCapabilities().vkCreateDescriptorPool;
		if ( CHECKS ) {
			VkDescriptorPoolCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pDescriptorPool);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateDescriptorPool.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a descriptor pool object.
	 * 
	 * <p>Descriptor sets are allocated from descriptor pool objects. A descriptor pool maintains a pool of descriptors, from which sets are allocated.
	 * Descriptor pools are externally synchronized, meaning that the application <b>must not</b> allocate and/or free descriptor sets from the same pool in multiple
	 * threads simultaneously.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkDescriptorPoolCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pDescriptorPool} <b>must</b> be a pointer to a {@code VkDescriptorPool} handle</li>
	 * </ul>
	 *
	 * @param device          the logical device that creates the descriptor pool
	 * @param pCreateInfo     a pointer to an instance of the {@link VkDescriptorPoolCreateInfo} structure specifying the state of the descriptor pool object
	 * @param pAllocator      controls host memory allocation
	 * @param pDescriptorPool points to a {@code VkDescriptorPool} handle in which the resulting descriptor pool object is returned
	 */
	public static int vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pDescriptorPool) {
		if ( CHECKS )
			checkBuffer(pDescriptorPool, 1);
		return nvkCreateDescriptorPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pDescriptorPool));
	}

	// --- [ vkDestroyDescriptorPool ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyDescriptorPool.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a descriptor pool object.
	 * 
	 * <p>When a pool is destroyed, all descriptor sets allocated from the pool are implicitly freed and become invalid. Descriptor sets allocated from a given
	 * pool do not need to be freed before destroying that descriptor pool.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code descriptorPool} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code descriptorPool} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code descriptorPool} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code descriptorPool} (via any allocated descriptor sets) <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code descriptorPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code descriptorPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device         the logical device that destroys the descriptor pool
	 * @param descriptorPool the descriptor pool to destroy
	 * @param pAllocator     controls host memory allocation
	 */
	public static void nvkDestroyDescriptorPool(VkDevice device, long descriptorPool, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyDescriptorPool;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), descriptorPool, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyDescriptorPool.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a descriptor pool object.
	 * 
	 * <p>When a pool is destroyed, all descriptor sets allocated from the pool are implicitly freed and become invalid. Descriptor sets allocated from a given
	 * pool do not need to be freed before destroying that descriptor pool.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code descriptorPool} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code descriptorPool} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code descriptorPool} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code descriptorPool} (via any allocated descriptor sets) <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code descriptorPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code descriptorPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device         the logical device that destroys the descriptor pool
	 * @param descriptorPool the descriptor pool to destroy
	 * @param pAllocator     controls host memory allocation
	 */
	public static void vkDestroyDescriptorPool(VkDevice device, long descriptorPool, VkAllocationCallbacks pAllocator) {
		nvkDestroyDescriptorPool(device, descriptorPool, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkResetDescriptorPool ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkResetDescriptorPool.html">Khronos Reference Page</a></p>
	 * 
	 * Resets a descriptor pool object.
	 * 
	 * <p>Rather than freeing individual descriptor sets, all descriptor sets allocated from a given pool <b>can</b> be returned to the pool by calling this function.</p>
	 * 
	 * <p>Resetting a descriptor pool recycles all of the resources from all of the descriptor sets allocated from the descriptor pool back to the descriptor
	 * pool, and the descriptor sets are implicitly freed.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
	 * <li>{@code flags} <b>must</b> be 0</li>
	 * <li>{@code descriptorPool} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code descriptorPool} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>All uses of {@code descriptorPool} (via any allocated descriptor sets) <b>must</b> have completed execution</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
	 * <li>Host access to any {@code VkDescriptorSet} objects allocated from {@code descriptorPool} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device         the logical device that owns the descriptor pool
	 * @param descriptorPool the descriptor pool to be reset
	 * @param flags          is currently unused and <b>must</b> be zero
	 */
	public static int vkResetDescriptorPool(VkDevice device, long descriptorPool, int flags) {
		long __functionAddress = device.getCapabilities().vkResetDescriptorPool;
		return callPJI(__functionAddress, device.address(), descriptorPool, flags);
	}

	// --- [ vkAllocateDescriptorSets ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkAllocateDescriptorSets.html">Khronos Reference Page</a></p>
	 * 
	 * Allocates descriptor sets from a descriptor pool.
	 * 
	 * <p>When a descriptor set is allocated, the initial state is largely uninitialized and all descriptors are undefined. However, the descriptor set <b>can</b> be
	 * bound in a command buffer without causing errors or exceptions. All entries that are statically used by a pipeline in a drawing or dispatching command
	 * <b>must</b> have been populated before the descriptor set is bound for use by that command. Entries that are not statically used by a pipeline <b>can</b> have
	 * uninitialized descriptors or descriptors of resources that have been destroyed, and executing a draw or dispatch with such a descriptor set bound does
	 * not cause undefined behavior. This means applications need not populate unused entries with dummy descriptors.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pAllocateInfo} <b>must</b> be a pointer to a valid {@link VkDescriptorSetAllocateInfo} structure</li>
	 * <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code pAllocateInfo}->descriptorSetCount {@code VkDescriptorSet} handles</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pAllocateInfo}->descriptorPool <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device          the logical device that owns the descriptor pool
	 * @param pAllocateInfo   a pointer to an instance of the {@link VkDescriptorSetAllocateInfo} structure describing parameters of the allocation
	 * @param pDescriptorSets a pointer to an array of {@code VkDescriptorSet} handles in which the resulting descriptor set objects are returned. The array <b>must</b> be at least the
	 *                        length specified by the {@code descriptorSetCount} member of {@code pAllocateInfo}.
	 */
	public static int nvkAllocateDescriptorSets(VkDevice device, long pAllocateInfo, long pDescriptorSets) {
		long __functionAddress = device.getCapabilities().vkAllocateDescriptorSets;
		if ( CHECKS )
			VkDescriptorSetAllocateInfo.validate(pAllocateInfo);
		return callPPPI(__functionAddress, device.address(), pAllocateInfo, pDescriptorSets);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkAllocateDescriptorSets.html">Khronos Reference Page</a></p>
	 * 
	 * Allocates descriptor sets from a descriptor pool.
	 * 
	 * <p>When a descriptor set is allocated, the initial state is largely uninitialized and all descriptors are undefined. However, the descriptor set <b>can</b> be
	 * bound in a command buffer without causing errors or exceptions. All entries that are statically used by a pipeline in a drawing or dispatching command
	 * <b>must</b> have been populated before the descriptor set is bound for use by that command. Entries that are not statically used by a pipeline <b>can</b> have
	 * uninitialized descriptors or descriptors of resources that have been destroyed, and executing a draw or dispatch with such a descriptor set bound does
	 * not cause undefined behavior. This means applications need not populate unused entries with dummy descriptors.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pAllocateInfo} <b>must</b> be a pointer to a valid {@link VkDescriptorSetAllocateInfo} structure</li>
	 * <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code pAllocateInfo}->descriptorSetCount {@code VkDescriptorSet} handles</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pAllocateInfo}->descriptorPool <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device          the logical device that owns the descriptor pool
	 * @param pAllocateInfo   a pointer to an instance of the {@link VkDescriptorSetAllocateInfo} structure describing parameters of the allocation
	 * @param pDescriptorSets a pointer to an array of {@code VkDescriptorSet} handles in which the resulting descriptor set objects are returned. The array <b>must</b> be at least the
	 *                        length specified by the {@code descriptorSetCount} member of {@code pAllocateInfo}.
	 */
	public static int vkAllocateDescriptorSets(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, LongBuffer pDescriptorSets) {
		if ( CHECKS )
			checkBuffer(pDescriptorSets, pAllocateInfo.descriptorSetCount());
		return nvkAllocateDescriptorSets(device, pAllocateInfo.address(), memAddress(pDescriptorSets));
	}

	// --- [ vkFreeDescriptorSets ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkFreeDescriptorSets.html">Khronos Reference Page</a></p>
	 * 
	 * Frees one or more descriptor sets.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
	 * <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
	 * <li>{@code descriptorPool} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each element of {@code pDescriptorSets} that is a valid handle <b>must</b> have been created, allocated or retrieved from {@code descriptorPool}</li>
	 * <li>Each of {@code device}, {@code descriptorPool} and the elements of {@code pDescriptorSets} that are valid handles <b>must</b> have been created,
	 * allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to any element of {@code pDescriptorSets} <b>must</b> have completed execution</li>
	 * <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code descriptorSetCount} {@code VkDescriptorSet} handles, each element of which <b>must</b>
	 * either be a valid handle or {@link #VK_NULL_HANDLE NULL_HANDLE}</li>
	 * <li>{@code descriptorPool} <b>must</b> have been created with the {@link #VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT} flag</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
	 * <li>Host access to each member of {@code pDescriptorSets} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device             the logical device that owns the descriptor pool
	 * @param descriptorPool     the descriptor pool from which the descriptor sets were allocated
	 * @param descriptorSetCount the number of elements in the {@code pDescriptorSets} array
	 * @param pDescriptorSets    an array of handles to {@code VkDescriptorSet} objects. All elements of {@code pDescriptorSets} <b>must</b> have been allocated from
	 *                           {@code descriptorPool}.
	 */
	public static int nvkFreeDescriptorSets(VkDevice device, long descriptorPool, int descriptorSetCount, long pDescriptorSets) {
		long __functionAddress = device.getCapabilities().vkFreeDescriptorSets;
		return callPJPI(__functionAddress, device.address(), descriptorPool, descriptorSetCount, pDescriptorSets);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkFreeDescriptorSets.html">Khronos Reference Page</a></p>
	 * 
	 * Frees one or more descriptor sets.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
	 * <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
	 * <li>{@code descriptorPool} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each element of {@code pDescriptorSets} that is a valid handle <b>must</b> have been created, allocated or retrieved from {@code descriptorPool}</li>
	 * <li>Each of {@code device}, {@code descriptorPool} and the elements of {@code pDescriptorSets} that are valid handles <b>must</b> have been created,
	 * allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to any element of {@code pDescriptorSets} <b>must</b> have completed execution</li>
	 * <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code descriptorSetCount} {@code VkDescriptorSet} handles, each element of which <b>must</b>
	 * either be a valid handle or {@link #VK_NULL_HANDLE NULL_HANDLE}</li>
	 * <li>{@code descriptorPool} <b>must</b> have been created with the {@link #VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT} flag</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
	 * <li>Host access to each member of {@code pDescriptorSets} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device          the logical device that owns the descriptor pool
	 * @param descriptorPool  the descriptor pool from which the descriptor sets were allocated
	 * @param pDescriptorSets an array of handles to {@code VkDescriptorSet} objects. All elements of {@code pDescriptorSets} <b>must</b> have been allocated from
	 *                        {@code descriptorPool}.
	 */
	public static int vkFreeDescriptorSets(VkDevice device, long descriptorPool, LongBuffer pDescriptorSets) {
		return nvkFreeDescriptorSets(device, descriptorPool, pDescriptorSets.remaining(), memAddress(pDescriptorSets));
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkFreeDescriptorSets.html">Khronos Reference Page</a></p>
	 * 
	 * Frees one or more descriptor sets.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
	 * <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
	 * <li>{@code descriptorPool} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each element of {@code pDescriptorSets} that is a valid handle <b>must</b> have been created, allocated or retrieved from {@code descriptorPool}</li>
	 * <li>Each of {@code device}, {@code descriptorPool} and the elements of {@code pDescriptorSets} that are valid handles <b>must</b> have been created,
	 * allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to any element of {@code pDescriptorSets} <b>must</b> have completed execution</li>
	 * <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code descriptorSetCount} {@code VkDescriptorSet} handles, each element of which <b>must</b>
	 * either be a valid handle or {@link #VK_NULL_HANDLE NULL_HANDLE}</li>
	 * <li>{@code descriptorPool} <b>must</b> have been created with the {@link #VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT} flag</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
	 * <li>Host access to each member of {@code pDescriptorSets} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device         the logical device that owns the descriptor pool
	 * @param descriptorPool the descriptor pool from which the descriptor sets were allocated
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
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkUpdateDescriptorSets.html">Khronos Reference Page</a></p>
	 * 
	 * Updates the contents of a descriptor set object.
	 * 
	 * <p>Once allocated, descriptor sets <b>can</b> be updated with a combination of write and copy operations.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code descriptorWriteCount} is not 0, {@code pDescriptorWrites} <b>must</b> be a pointer to an array of {@code descriptorWriteCount} valid
	 * {@link VkWriteDescriptorSet} structures</li>
	 * <li>If {@code descriptorCopyCount} is not 0, {@code pDescriptorCopies} <b>must</b> be a pointer to an array of {@code descriptorCopyCount} valid
	 * {@link VkCopyDescriptorSet} structures</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pDescriptorWrites}[].dstSet <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pDescriptorCopies}[].dstSet <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device               the logical device that updates the descriptor sets
	 * @param descriptorWriteCount the number of elements in the {@code pDescriptorWrites} array
	 * @param pDescriptorWrites    a pointer to an array of {@link VkWriteDescriptorSet} structures describing the descriptor sets to write to
	 * @param descriptorCopyCount  the number of elements in the {@code pDescriptorCopies} array
	 * @param pDescriptorCopies    a pointer to an array of {@link VkCopyDescriptorSet} structures describing the descriptor sets to copy between
	 */
	public static void nvkUpdateDescriptorSets(VkDevice device, int descriptorWriteCount, long pDescriptorWrites, int descriptorCopyCount, long pDescriptorCopies) {
		long __functionAddress = device.getCapabilities().vkUpdateDescriptorSets;
		if ( CHECKS )
			if ( pDescriptorWrites != NULL ) VkWriteDescriptorSet.validate(pDescriptorWrites, descriptorWriteCount);
		callPPPV(__functionAddress, device.address(), descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkUpdateDescriptorSets.html">Khronos Reference Page</a></p>
	 * 
	 * Updates the contents of a descriptor set object.
	 * 
	 * <p>Once allocated, descriptor sets <b>can</b> be updated with a combination of write and copy operations.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code descriptorWriteCount} is not 0, {@code pDescriptorWrites} <b>must</b> be a pointer to an array of {@code descriptorWriteCount} valid
	 * {@link VkWriteDescriptorSet} structures</li>
	 * <li>If {@code descriptorCopyCount} is not 0, {@code pDescriptorCopies} <b>must</b> be a pointer to an array of {@code descriptorCopyCount} valid
	 * {@link VkCopyDescriptorSet} structures</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pDescriptorWrites}[].dstSet <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pDescriptorCopies}[].dstSet <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device            the logical device that updates the descriptor sets
	 * @param pDescriptorWrites a pointer to an array of {@link VkWriteDescriptorSet} structures describing the descriptor sets to write to
	 * @param pDescriptorCopies a pointer to an array of {@link VkCopyDescriptorSet} structures describing the descriptor sets to copy between
	 */
	public static void vkUpdateDescriptorSets(VkDevice device, VkWriteDescriptorSet.Buffer pDescriptorWrites, VkCopyDescriptorSet.Buffer pDescriptorCopies) {
		nvkUpdateDescriptorSets(device, pDescriptorWrites == null ? 0 : pDescriptorWrites.remaining(), pDescriptorWrites == null ? NULL : pDescriptorWrites.address(), pDescriptorCopies == null ? 0 : pDescriptorCopies.remaining(), pDescriptorCopies == null ? NULL : pDescriptorCopies.address());
	}

	// --- [ vkCreateFramebuffer ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateFramebuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new framebuffer object.
	 * 
	 * <p>Render passes operate in conjunction with framebuffers, which represent a collection of specific memory attachments that a render pass instance uses.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkFramebufferCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pFramebuffer} <b>must</b> be a pointer to a {@code VkFramebuffer} handle</li>
	 * </ul>
	 *
	 * @param device       the logical device that creates the framebuffer
	 * @param pCreateInfo  points to a {@link VkFramebufferCreateInfo} structure which describes additional information about framebuffer creation
	 * @param pAllocator   controls host memory allocation
	 * @param pFramebuffer points to a {@code VkFramebuffer} handle in which the resulting framebuffer object is returned
	 */
	public static int nvkCreateFramebuffer(VkDevice device, long pCreateInfo, long pAllocator, long pFramebuffer) {
		long __functionAddress = device.getCapabilities().vkCreateFramebuffer;
		if ( CHECKS ) {
			VkFramebufferCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pFramebuffer);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateFramebuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new framebuffer object.
	 * 
	 * <p>Render passes operate in conjunction with framebuffers, which represent a collection of specific memory attachments that a render pass instance uses.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkFramebufferCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pFramebuffer} <b>must</b> be a pointer to a {@code VkFramebuffer} handle</li>
	 * </ul>
	 *
	 * @param device       the logical device that creates the framebuffer
	 * @param pCreateInfo  points to a {@link VkFramebufferCreateInfo} structure which describes additional information about framebuffer creation
	 * @param pAllocator   controls host memory allocation
	 * @param pFramebuffer points to a {@code VkFramebuffer} handle in which the resulting framebuffer object is returned
	 */
	public static int vkCreateFramebuffer(VkDevice device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pFramebuffer) {
		if ( CHECKS )
			checkBuffer(pFramebuffer, 1);
		return nvkCreateFramebuffer(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pFramebuffer));
	}

	// --- [ vkDestroyFramebuffer ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyFramebuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a framebuffer object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code framebuffer} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code framebuffer} <b>must</b> be a valid {@code VkFramebuffer} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code framebuffer} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code framebuffer} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code framebuffer} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code framebuffer} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code framebuffer} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code framebuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device      the logical device that destroys the framebuffer
	 * @param framebuffer the handle of the framebuffer to destroy
	 * @param pAllocator  controls host memory allocation
	 */
	public static void nvkDestroyFramebuffer(VkDevice device, long framebuffer, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyFramebuffer;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), framebuffer, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyFramebuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a framebuffer object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code framebuffer} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code framebuffer} <b>must</b> be a valid {@code VkFramebuffer} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code framebuffer} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code framebuffer} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code framebuffer} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code framebuffer} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code framebuffer} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code framebuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device      the logical device that destroys the framebuffer
	 * @param framebuffer the handle of the framebuffer to destroy
	 * @param pAllocator  controls host memory allocation
	 */
	public static void vkDestroyFramebuffer(VkDevice device, long framebuffer, VkAllocationCallbacks pAllocator) {
		nvkDestroyFramebuffer(device, framebuffer, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateRenderPass ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateRenderPass.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new render pass object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkRenderPassCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pRenderPass} <b>must</b> be a pointer to a {@code VkRenderPass} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the render pass
	 * @param pCreateInfo a pointer to an instance of the {@link VkRenderPassCreateInfo} structure that describes the parameters of the render pass
	 * @param pAllocator  controls host memory allocation
	 * @param pRenderPass points to a {@code VkRenderPass} handle in which the resulting render pass object is returned
	 */
	public static int nvkCreateRenderPass(VkDevice device, long pCreateInfo, long pAllocator, long pRenderPass) {
		long __functionAddress = device.getCapabilities().vkCreateRenderPass;
		if ( CHECKS ) {
			VkRenderPassCreateInfo.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pRenderPass);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateRenderPass.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new render pass object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkRenderPassCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pRenderPass} <b>must</b> be a pointer to a {@code VkRenderPass} handle</li>
	 * </ul>
	 *
	 * @param device      the logical device that creates the render pass
	 * @param pCreateInfo a pointer to an instance of the {@link VkRenderPassCreateInfo} structure that describes the parameters of the render pass
	 * @param pAllocator  controls host memory allocation
	 * @param pRenderPass points to a {@code VkRenderPass} handle in which the resulting render pass object is returned
	 */
	public static int vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pRenderPass) {
		if ( CHECKS )
			checkBuffer(pRenderPass, 1);
		return nvkCreateRenderPass(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pRenderPass));
	}

	// --- [ vkDestroyRenderPass ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyRenderPass.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a render pass object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code renderPass} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code renderPass} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code renderPass} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code renderPass} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code renderPass} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code renderPass} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code renderPass} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the render pass
	 * @param renderPass the handle of the render pass to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroyRenderPass(VkDevice device, long renderPass, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyRenderPass;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), renderPass, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyRenderPass.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a render pass object.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code renderPass} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code renderPass} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code renderPass} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All submitted commands that refer to {@code renderPass} <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code renderPass} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code renderPass} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code renderPass} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the logical device that destroys the render pass
	 * @param renderPass the handle of the render pass to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroyRenderPass(VkDevice device, long renderPass, VkAllocationCallbacks pAllocator) {
		nvkDestroyRenderPass(device, renderPass, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetRenderAreaGranularity ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetRenderAreaGranularity.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the granularity for optimal render area.
	 * 
	 * <p>The conditions leading to an optimal {@code renderArea} are:</p>
	 * 
	 * <ul>
	 * <li>the {@code offset.x} member in {@code renderArea} is a multiple of the width member of the returned {@link VkExtent2D} (the horizontal granularity).</li>
	 * <li>the {@code offset.y} member in {@code renderArea} is a multiple of the height of the returned {@link VkExtent2D} (the vertical granularity).</li>
	 * <li>either the {@code offset.width} member in {@code renderArea} is a multiple of the horizontal granularity or {@code offset.x+offset.width} is equal
	 * to the width of the framebuffer in the {@link VkRenderPassBeginInfo}.</li>
	 * <li>either the {@code offset.height} member in {@code renderArea} is a multiple of the vertical granularity or {@code offset.y+offset.height} is equal
	 * to the height of the framebuffer in the {@link VkRenderPassBeginInfo}.</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
	 * <li>{@code pGranularity} <b>must</b> be a pointer to a {@link VkExtent2D} structure</li>
	 * <li>{@code renderPass} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code renderPass} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 *
	 * @param device       the logical device that owns the render pass
	 * @param renderPass   a handle to a render pass
	 * @param pGranularity points to a {@link VkExtent2D} structure in which the granularity is returned
	 */
	public static void nvkGetRenderAreaGranularity(VkDevice device, long renderPass, long pGranularity) {
		long __functionAddress = device.getCapabilities().vkGetRenderAreaGranularity;
		callPJPV(__functionAddress, device.address(), renderPass, pGranularity);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetRenderAreaGranularity.html">Khronos Reference Page</a></p>
	 * 
	 * Queries the granularity for optimal render area.
	 * 
	 * <p>The conditions leading to an optimal {@code renderArea} are:</p>
	 * 
	 * <ul>
	 * <li>the {@code offset.x} member in {@code renderArea} is a multiple of the width member of the returned {@link VkExtent2D} (the horizontal granularity).</li>
	 * <li>the {@code offset.y} member in {@code renderArea} is a multiple of the height of the returned {@link VkExtent2D} (the vertical granularity).</li>
	 * <li>either the {@code offset.width} member in {@code renderArea} is a multiple of the horizontal granularity or {@code offset.x+offset.width} is equal
	 * to the width of the framebuffer in the {@link VkRenderPassBeginInfo}.</li>
	 * <li>either the {@code offset.height} member in {@code renderArea} is a multiple of the vertical granularity or {@code offset.y+offset.height} is equal
	 * to the height of the framebuffer in the {@link VkRenderPassBeginInfo}.</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
	 * <li>{@code pGranularity} <b>must</b> be a pointer to a {@link VkExtent2D} structure</li>
	 * <li>{@code renderPass} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code renderPass} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * </ul>
	 *
	 * @param device       the logical device that owns the render pass
	 * @param renderPass   a handle to a render pass
	 * @param pGranularity points to a {@link VkExtent2D} structure in which the granularity is returned
	 */
	public static void vkGetRenderAreaGranularity(VkDevice device, long renderPass, VkExtent2D pGranularity) {
		nvkGetRenderAreaGranularity(device, renderPass, pGranularity.address());
	}

	// --- [ vkCreateCommandPool ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateCommandPool.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new command pool object.
	 * 
	 * <p>Command pools are opaque objects that command buffer memory is allocated from, and which allow the implementation to amortize the cost of resource
	 * creation across multiple command buffers. Command pools are application-synchronized, meaning that a command pool <b>must not</b> be used concurrently in
	 * multiple threads. That includes use via recording commands on any command buffers allocated from the pool, as well as operations that allocate, free,
	 * and reset command buffers or the pool itself.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkCommandPoolCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pCommandPool} <b>must</b> be a pointer to a {@code VkCommandPool} handle</li>
	 * </ul>
	 *
	 * @param device       the logical device that creates the command pool
	 * @param pCreateInfo  contains information used to create the command pool
	 * @param pAllocator   controls host memory allocation
	 * @param pCommandPool points to an {@code VkCommandPool} handle in which the created pool is returned
	 */
	public static int nvkCreateCommandPool(VkDevice device, long pCreateInfo, long pAllocator, long pCommandPool) {
		long __functionAddress = device.getCapabilities().vkCreateCommandPool;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pCommandPool);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateCommandPool.html">Khronos Reference Page</a></p>
	 * 
	 * Creates a new command pool object.
	 * 
	 * <p>Command pools are opaque objects that command buffer memory is allocated from, and which allow the implementation to amortize the cost of resource
	 * creation across multiple command buffers. Command pools are application-synchronized, meaning that a command pool <b>must not</b> be used concurrently in
	 * multiple threads. That includes use via recording commands on any command buffers allocated from the pool, as well as operations that allocate, free,
	 * and reset command buffers or the pool itself.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkCommandPoolCreateInfo} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pCommandPool} <b>must</b> be a pointer to a {@code VkCommandPool} handle</li>
	 * </ul>
	 *
	 * @param device       the logical device that creates the command pool
	 * @param pCreateInfo  contains information used to create the command pool
	 * @param pAllocator   controls host memory allocation
	 * @param pCommandPool points to an {@code VkCommandPool} handle in which the created pool is returned
	 */
	public static int vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pCommandPool) {
		if ( CHECKS )
			checkBuffer(pCommandPool, 1);
		return nvkCreateCommandPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pCommandPool));
	}

	// --- [ vkDestroyCommandPool ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyCommandPool.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a command pool object.
	 * 
	 * <p>When a pool is destroyed, all command buffers allocated from the pool are implicitly freed and become invalid. Command buffers allocated from a given
	 * pool do not need to be freed before destroying that command pool.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code commandPool} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code commandPool} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code commandPool} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All {@code VkCommandBuffer} objects allocated from {@code commandPool} <b>must not</b> be pending execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code commandPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code commandPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device      the logical device that destroys the command pool
	 * @param commandPool the handle of the command pool to destroy
	 * @param pAllocator  controls host memory allocation
	 */
	public static void nvkDestroyCommandPool(VkDevice device, long commandPool, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyCommandPool;
		if ( CHECKS )
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		callPJPV(__functionAddress, device.address(), commandPool, pAllocator);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkDestroyCommandPool.html">Khronos Reference Page</a></p>
	 * 
	 * Destroys a command pool object.
	 * 
	 * <p>When a pool is destroyed, all command buffers allocated from the pool are implicitly freed and become invalid. Command buffers allocated from a given
	 * pool do not need to be freed before destroying that command pool.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code commandPool} is not {@link #VK_NULL_HANDLE NULL_HANDLE}, {@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code commandPool} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code commandPool} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkPhysicalDevice}</li>
	 * <li>All {@code VkCommandBuffer} objects allocated from {@code commandPool} <b>must not</b> be pending execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code commandPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code commandPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device      the logical device that destroys the command pool
	 * @param commandPool the handle of the command pool to destroy
	 * @param pAllocator  controls host memory allocation
	 */
	public static void vkDestroyCommandPool(VkDevice device, long commandPool, VkAllocationCallbacks pAllocator) {
		nvkDestroyCommandPool(device, commandPool, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkResetCommandPool ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkResetCommandPool.html">Khronos Reference Page</a></p>
	 * 
	 * Resets a command pool.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandPoolResetFlagBits} values</li>
	 * <li>{@code commandPool} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code device} and {@code commandPool} <b>must</b> have been created, allocated or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>All {@code VkCommandBuffer} objects allocated from {@code commandPool} <b>must not</b> currently be pending execution</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device      the logical device that owns the command pool
	 * @param commandPool the command pool to reset
	 * @param flags       contains additional flags controlling the behavior of the reset. One or more of:<br><table><tr><td>{@link #VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT}</td></tr></table>
	 */
	public static int vkResetCommandPool(VkDevice device, long commandPool, int flags) {
		long __functionAddress = device.getCapabilities().vkResetCommandPool;
		return callPJI(__functionAddress, device.address(), commandPool, flags);
	}

	// --- [ vkAllocateCommandBuffers ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkAllocateCommandBuffers.html">Khronos Reference Page</a></p>
	 * 
	 * Allocates command buffers.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pAllocateInfo} <b>must</b> be a pointer to a valid {@link VkCommandBufferAllocateInfo} structure</li>
	 * <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code pAllocateInfo}->commandBufferCount {@code VkCommandBuffer} handles</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pAllocateInfo}->commandPool <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device          the logical device that owns the command pool
	 * @param pAllocateInfo   an instance of the {@link VkCommandBufferAllocateInfo} structure which defines additional information about creating the pool
	 * @param pCommandBuffers points to an array in which the allocated command buffers are returned. Each allocated command buffer begins in the initial state.
	 */
	public static int nvkAllocateCommandBuffers(VkDevice device, long pAllocateInfo, long pCommandBuffers) {
		long __functionAddress = device.getCapabilities().vkAllocateCommandBuffers;
		return callPPPI(__functionAddress, device.address(), pAllocateInfo, pCommandBuffers);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkAllocateCommandBuffers.html">Khronos Reference Page</a></p>
	 * 
	 * Allocates command buffers.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pAllocateInfo} <b>must</b> be a pointer to a valid {@link VkCommandBufferAllocateInfo} structure</li>
	 * <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code pAllocateInfo}->commandBufferCount {@code VkCommandBuffer} handles</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pAllocateInfo}->commandPool <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device          the logical device that owns the command pool
	 * @param pAllocateInfo   an instance of the {@link VkCommandBufferAllocateInfo} structure which defines additional information about creating the pool
	 * @param pCommandBuffers points to an array in which the allocated command buffers are returned. Each allocated command buffer begins in the initial state.
	 */
	public static int vkAllocateCommandBuffers(VkDevice device, VkCommandBufferAllocateInfo pAllocateInfo, PointerBuffer pCommandBuffers) {
		if ( CHECKS )
			checkBuffer(pCommandBuffers, pAllocateInfo.commandBufferCount());
		return nvkAllocateCommandBuffers(device, pAllocateInfo.address(), memAddress(pCommandBuffers));
	}

	// --- [ vkFreeCommandBuffers ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkFreeCommandBuffers.html">Khronos Reference Page</a></p>
	 * 
	 * Frees command buffers.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
	 * <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
	 * <li>{@code commandPool} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each element of {@code pCommandBuffers} that is a valid handle <b>must</b> have been created, allocated or retrieved from {@code commandPool}</li>
	 * <li>Each of {@code device}, {@code commandPool} and the elements of {@code pCommandBuffers} that are valid handles <b>must</b> have been created, allocated
	 * or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>All elements of {@code pCommandBuffers} <b>must not</b> be pending execution</li>
	 * <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} {@code VkCommandBuffer} handles, each element of which <b>must</b>
	 * either be a valid handle or {@link #VK_NULL_HANDLE NULL_HANDLE}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
	 * <li>Host access to each member of {@code pCommandBuffers} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device             the logical device that owns the command pool
	 * @param commandPool        the handle of the command pool that the command buffers were allocated from
	 * @param commandBufferCount the length of the {@code pCommandBuffers} array
	 * @param pCommandBuffers    an array of handles of command buffers to free
	 */
	public static void nvkFreeCommandBuffers(VkDevice device, long commandPool, int commandBufferCount, long pCommandBuffers) {
		long __functionAddress = device.getCapabilities().vkFreeCommandBuffers;
		callPJPV(__functionAddress, device.address(), commandPool, commandBufferCount, pCommandBuffers);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkFreeCommandBuffers.html">Khronos Reference Page</a></p>
	 * 
	 * Frees command buffers.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
	 * <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
	 * <li>{@code commandPool} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each element of {@code pCommandBuffers} that is a valid handle <b>must</b> have been created, allocated or retrieved from {@code commandPool}</li>
	 * <li>Each of {@code device}, {@code commandPool} and the elements of {@code pCommandBuffers} that are valid handles <b>must</b> have been created, allocated
	 * or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>All elements of {@code pCommandBuffers} <b>must not</b> be pending execution</li>
	 * <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} {@code VkCommandBuffer} handles, each element of which <b>must</b>
	 * either be a valid handle or {@link #VK_NULL_HANDLE NULL_HANDLE}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
	 * <li>Host access to each member of {@code pCommandBuffers} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device          the logical device that owns the command pool
	 * @param commandPool     the handle of the command pool that the command buffers were allocated from
	 * @param pCommandBuffers an array of handles of command buffers to free
	 */
	public static void vkFreeCommandBuffers(VkDevice device, long commandPool, PointerBuffer pCommandBuffers) {
		nvkFreeCommandBuffers(device, commandPool, pCommandBuffers.remaining(), memAddress(pCommandBuffers));
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkFreeCommandBuffers.html">Khronos Reference Page</a></p>
	 * 
	 * Frees command buffers.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
	 * <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
	 * <li>{@code commandPool} <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each element of {@code pCommandBuffers} that is a valid handle <b>must</b> have been created, allocated or retrieved from {@code commandPool}</li>
	 * <li>Each of {@code device}, {@code commandPool} and the elements of {@code pCommandBuffers} that are valid handles <b>must</b> have been created, allocated
	 * or retrieved from the same {@code VkPhysicalDevice}</li>
	 * <li>All elements of {@code pCommandBuffers} <b>must not</b> be pending execution</li>
	 * <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} {@code VkCommandBuffer} handles, each element of which <b>must</b>
	 * either be a valid handle or {@link #VK_NULL_HANDLE NULL_HANDLE}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
	 * <li>Host access to each member of {@code pCommandBuffers} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device      the logical device that owns the command pool
	 * @param commandPool the handle of the command pool that the command buffers were allocated from
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

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkBeginCommandBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Starts recording a command buffer.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pBeginInfo} <b>must</b> be a pointer to a valid {@link VkCommandBufferBeginInfo} structure</li>
	 * <li>{@code commandBuffer} <b>must not</b> be in the recording state</li>
	 * <li>{@code commandBuffer} <b>must not</b> currently be pending execution</li>
	 * <li>If {@code commandBuffer} was allocated from a {@code VkCommandPool} which did not have the {@link #VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT} flag set,
	 * {@code commandBuffer} <b>must</b> be in the initial state.</li>
	 * <li>If {@code commandBuffer} is a secondary command buffer, the {@code pInheritanceInfo} member of {@code pBeginInfo} <b>must</b> be a valid
	 * {@link VkCommandBufferInheritanceInfo} structure</li>
	 * <li>If {@code commandBuffer} is a secondary command buffer and either the {@code occlusionQueryEnable} member of the {@code pInheritanceInfo} member of
	 * {@code pBeginInfo} is {@link #VK_FALSE FALSE}, or the precise occlusion queries feature is not enabled, the {@code queryFlags} member of the
	 * {@code pInheritanceInfo} member {@code pBeginInfo} <b>must not</b> contain {@link #VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>A primary command buffer is considered to be pending execution from the time it is submitted via {@link #vkQueueSubmit QueueSubmit} until that submission completes.</p>
	 * 
	 * <p>A secondary command buffer is considered to be pending execution from the time its execution is recorded into a primary buffer (via
	 * {@link #vkCmdExecuteCommands CmdExecuteCommands}) until the final time that primary buffer’s submission to a queue completes. If, after the primary buffer completes, the
	 * secondary command buffer is recorded to execute on a different primary buffer, the first primary buffer <b>must not</b> be resubmitted until after it is reset
	 * with {@link #vkResetCommandBuffer ResetCommandBuffer} unless the secondary command buffer was recorded with {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}.</p>
	 * 
	 * <p>If {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} is not set on a secondary command buffer, that command buffer <b>must not</b> be used more than once in a given
	 * primary command buffer. Furthermore, if a secondary command buffer without {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} set is recorded to execute in a
	 * primary command buffer with {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} set, the primary command buffer <b>must not</b> be pending execution more than once at
	 * a time.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>On some implementations, not using the {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} bit enables command buffers to be patched in-place if needed,
	 * rather than creating a copy of the command buffer.</p>
	 * </div>
	 * 
	 * <p>If a command buffer is in the executable state and the command buffer was allocated from a command pool with the
	 * {@link #VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT} flag set, then {@code vkBeginCommandBuffer} implicitly resets the command buffer, behaving as if
	 * {@link #vkResetCommandBuffer ResetCommandBuffer} had been called with {@link #VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT} not set. It then puts the command buffer in the recording state.</p>
	 * 
	 * <p>Once recording starts, an application records a sequence of commands ({@code vkCmd*}) to set state in the command buffer, draw, dispatch, and other
	 * commands.</p>
	 *
	 * @param commandBuffer the handle of the command buffer which is to be put in the recording state
	 * @param pBeginInfo    an instance of the {@link VkCommandBufferBeginInfo} structure, which defines additional information about how the command buffer begins recording
	 */
	public static int nvkBeginCommandBuffer(VkCommandBuffer commandBuffer, long pBeginInfo) {
		long __functionAddress = commandBuffer.getCapabilities().vkBeginCommandBuffer;
		return callPPI(__functionAddress, commandBuffer.address(), pBeginInfo);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkBeginCommandBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Starts recording a command buffer.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pBeginInfo} <b>must</b> be a pointer to a valid {@link VkCommandBufferBeginInfo} structure</li>
	 * <li>{@code commandBuffer} <b>must not</b> be in the recording state</li>
	 * <li>{@code commandBuffer} <b>must not</b> currently be pending execution</li>
	 * <li>If {@code commandBuffer} was allocated from a {@code VkCommandPool} which did not have the {@link #VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT} flag set,
	 * {@code commandBuffer} <b>must</b> be in the initial state.</li>
	 * <li>If {@code commandBuffer} is a secondary command buffer, the {@code pInheritanceInfo} member of {@code pBeginInfo} <b>must</b> be a valid
	 * {@link VkCommandBufferInheritanceInfo} structure</li>
	 * <li>If {@code commandBuffer} is a secondary command buffer and either the {@code occlusionQueryEnable} member of the {@code pInheritanceInfo} member of
	 * {@code pBeginInfo} is {@link #VK_FALSE FALSE}, or the precise occlusion queries feature is not enabled, the {@code queryFlags} member of the
	 * {@code pInheritanceInfo} member {@code pBeginInfo} <b>must not</b> contain {@link #VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>A primary command buffer is considered to be pending execution from the time it is submitted via {@link #vkQueueSubmit QueueSubmit} until that submission completes.</p>
	 * 
	 * <p>A secondary command buffer is considered to be pending execution from the time its execution is recorded into a primary buffer (via
	 * {@link #vkCmdExecuteCommands CmdExecuteCommands}) until the final time that primary buffer’s submission to a queue completes. If, after the primary buffer completes, the
	 * secondary command buffer is recorded to execute on a different primary buffer, the first primary buffer <b>must not</b> be resubmitted until after it is reset
	 * with {@link #vkResetCommandBuffer ResetCommandBuffer} unless the secondary command buffer was recorded with {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}.</p>
	 * 
	 * <p>If {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} is not set on a secondary command buffer, that command buffer <b>must not</b> be used more than once in a given
	 * primary command buffer. Furthermore, if a secondary command buffer without {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} set is recorded to execute in a
	 * primary command buffer with {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} set, the primary command buffer <b>must not</b> be pending execution more than once at
	 * a time.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>On some implementations, not using the {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} bit enables command buffers to be patched in-place if needed,
	 * rather than creating a copy of the command buffer.</p>
	 * </div>
	 * 
	 * <p>If a command buffer is in the executable state and the command buffer was allocated from a command pool with the
	 * {@link #VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT} flag set, then {@code vkBeginCommandBuffer} implicitly resets the command buffer, behaving as if
	 * {@link #vkResetCommandBuffer ResetCommandBuffer} had been called with {@link #VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT} not set. It then puts the command buffer in the recording state.</p>
	 * 
	 * <p>Once recording starts, an application records a sequence of commands ({@code vkCmd*}) to set state in the command buffer, draw, dispatch, and other
	 * commands.</p>
	 *
	 * @param commandBuffer the handle of the command buffer which is to be put in the recording state
	 * @param pBeginInfo    an instance of the {@link VkCommandBufferBeginInfo} structure, which defines additional information about how the command buffer begins recording
	 */
	public static int vkBeginCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo pBeginInfo) {
		return nvkBeginCommandBuffer(commandBuffer, pBeginInfo.address());
	}

	// --- [ vkEndCommandBuffer ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEndCommandBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Completes recording a command buffer.
	 * 
	 * <p>If there was an error during recording, the application will be notified by an unsuccessful return code returned by {@code vkEndCommandBuffer}. If the
	 * application wishes to further use the command buffer, the command buffer <b>must</b> be reset.</p>
	 * 
	 * <p>When a command buffer is in the executable state, it <b>can</b> be submitted to a queue for execution.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>{@link #vkEndCommandBuffer EndCommandBuffer} <b>must not</b> be called inside a render pass instance</li>
	 * <li>All queries made active during the recording of {@code commandBuffer} <b>must</b> have been made inactive</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer to complete recording. The command buffer <b>must</b> have been in the recording state, and is moved to the executable state.
	 */
	public static int vkEndCommandBuffer(VkCommandBuffer commandBuffer) {
		long __functionAddress = commandBuffer.getCapabilities().vkEndCommandBuffer;
		return callPI(__functionAddress, commandBuffer.address());
	}

	// --- [ vkResetCommandBuffer ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkResetCommandBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Resets a command buffer.
	 * 
	 * <p>If {@code flags} includes {@link #VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT}, then most or all memory resources currently owned by the command buffer <b>should</b>
	 * be returned to the parent command pool. If this flag is not set, then the command buffer <b>may</b> hold onto memory resources and reuse them when recording
	 * commands.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandBufferResetFlagBits} values</li>
	 * <li>{@code commandBuffer} <b>must not</b> currently be pending execution</li>
	 * <li>{@code commandBuffer} <b>must</b> have been allocated from a pool that was created with the {@link #VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer to reset. The command buffer <b>can</b> be in any state, and is put in the initial state.
	 * @param flags         is of type {@code VkCommandBufferResetFlags}. One or more of:<br><table><tr><td>{@link #VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT}</td></tr></table>
	 */
	public static int vkResetCommandBuffer(VkCommandBuffer commandBuffer, int flags) {
		long __functionAddress = commandBuffer.getCapabilities().vkResetCommandBuffer;
		return callPI(__functionAddress, commandBuffer.address(), flags);
	}

	// --- [ vkCmdBindPipeline ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdBindPipeline.html">Khronos Reference Page</a></p>
	 * 
	 * Binds a pipeline object to a command buffer.
	 * 
	 * <p>Once bound, a pipeline binding affects subsequent graphics or compute commands in the command buffer until a different pipeline is bound to the bind
	 * point. The pipeline bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} controls the behavior of {@link #vkCmdDispatch CmdDispatch} and {@link #vkCmdDispatchIndirect CmdDispatchIndirect}. The pipeline bound to
	 * {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} controls the behavior of {@link #vkCmdDraw CmdDraw}, {@link #vkCmdDrawIndexed CmdDrawIndexed}, {@link #vkCmdDrawIndirect CmdDrawIndirect}, and {@link #vkCmdDrawIndexedIndirect CmdDrawIndexedIndirect}. No other
	 * commands are affected by the pipeline state.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
	 * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>Each of {@code commandBuffer} and {@code pipeline} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>If {@code pipelineBindPoint} is {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support
	 * compute operations</li>
	 * <li>If {@code pipelineBindPoint} is {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b>
	 * support graphics operations</li>
	 * <li>If {@code pipelineBindPoint} is {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, {@code pipeline} <b>must</b> be a compute pipeline</li>
	 * <li>If {@code pipelineBindPoint} is {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, {@code pipeline} <b>must</b> be a graphics pipeline</li>
	 * <li>If the variable multisample rate feature is not supported, {@code pipeline} is a graphics pipeline, the current subpass has no attachments, and
	 * this is not the first call to this function with a graphics pipeline after transitioning to the current subpass, then the sample count specified by
	 * this pipeline <b>must</b> match that set in the previous pipeline</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer     the command buffer that the pipeline will be bound to
	 * @param pipelineBindPoint the bind point. There are separate bind points for each of graphics and compute, so binding one does not disturb the other. One of:<br><table><tr><td>{@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</td><td>{@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}</td></tr></table>
	 * @param pipeline          the pipeline to be bound
	 */
	public static void vkCmdBindPipeline(VkCommandBuffer commandBuffer, int pipelineBindPoint, long pipeline) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBindPipeline;
		callPJV(__functionAddress, commandBuffer.address(), pipelineBindPoint, pipeline);
	}

	// --- [ vkCmdSetViewport ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetViewport.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the viewport on a command buffer.
	 * 
	 * <p>If the bound pipeline state object was not created with the {@link #VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT} dynamic state enabled, viewport transformation parameters are
	 * specified using the {@code pViewports} member of {@link VkPipelineViewportStateCreateInfo} in the pipeline state object. If the pipeline state object was
	 * created with the {@link #VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT} dynamic state enabled, the viewport transformation parameters are dynamically set and changed with this
	 * command.</p>
	 * 
	 * <p>The viewport parameters taken from element {@code i} of {@code pViewports} replace the current state for the viewport index
	 * {@code firstViewport + i}, for {@code i} in {@code [0,viewportCount)}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pViewports} <b>must</b> be a pointer to an array of {@code viewportCount} valid {@link VkViewport} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>{@code viewportCount} <b>must</b> be greater than 0</li>
	 * <li>{@code firstViewport} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxViewports}</li>
	 * <li>The sum of {@code firstViewport} and {@code viewportCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param firstViewport the index of the first viewport whose parameters are updated by the command
	 * @param viewportCount the number of viewports whose parameters are updated by the command
	 * @param pViewports    a pointer to an array of {@code VkViewport} structures specifying viewport parameters
	 */
	public static void nvkCmdSetViewport(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pViewports) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewport;
		callPPV(__functionAddress, commandBuffer.address(), firstViewport, viewportCount, pViewports);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetViewport.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the viewport on a command buffer.
	 * 
	 * <p>If the bound pipeline state object was not created with the {@link #VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT} dynamic state enabled, viewport transformation parameters are
	 * specified using the {@code pViewports} member of {@link VkPipelineViewportStateCreateInfo} in the pipeline state object. If the pipeline state object was
	 * created with the {@link #VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT} dynamic state enabled, the viewport transformation parameters are dynamically set and changed with this
	 * command.</p>
	 * 
	 * <p>The viewport parameters taken from element {@code i} of {@code pViewports} replace the current state for the viewport index
	 * {@code firstViewport + i}, for {@code i} in {@code [0,viewportCount)}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pViewports} <b>must</b> be a pointer to an array of {@code viewportCount} valid {@link VkViewport} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>{@code viewportCount} <b>must</b> be greater than 0</li>
	 * <li>{@code firstViewport} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxViewports}</li>
	 * <li>The sum of {@code firstViewport} and {@code viewportCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param firstViewport the index of the first viewport whose parameters are updated by the command
	 * @param pViewports    a pointer to an array of {@code VkViewport} structures specifying viewport parameters
	 */
	public static void vkCmdSetViewport(VkCommandBuffer commandBuffer, int firstViewport, VkViewport.Buffer pViewports) {
		nvkCmdSetViewport(commandBuffer, firstViewport, pViewports.remaining(), pViewports.address());
	}

	// --- [ vkCmdSetScissor ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetScissor.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the dynamic scissor rectangles on a command buffer.
	 * 
	 * <p>The scissor test determines if a fragment’s framebuffer coordinates <code>(x<sub>f</sub>,y<sub>f</sub>)</code> lie within the scissor rectangle
	 * corresponding to the viewport index used by the primitive that generated the fragment. If the pipeline state object is created without
	 * {@link #VK_DYNAMIC_STATE_SCISSOR DYNAMIC_STATE_SCISSOR} enabled then the scissor rectangles are set by the {@link VkPipelineViewportStateCreateInfo} state of the pipeline state object.
	 * Otherwise, use this command to dynamically set the scissor rectangles.</p>
	 * 
	 * <p>The scissor rectangles taken from element {@code i} of {@code pScissors} replace the current state for the scissor index {@code firstScissor + i}, for
	 * {@code i} in {@code [0,scissorCount)}.</p>
	 * 
	 * <p>Each scissor rectangle is described by a {@link VkRect2D} structure, with the {@code offset.x} and {@code offset.y} values determining the upper left corner
	 * of the scissor rectangle, and the {@code extent.width} and {@code extent.height} values determining the size in pixels.</p>
	 * 
	 * <p>If <code>offset.x &le; x<sub>f</sub> &lt; offset.x + extent.width</code>  and <code>offset.y &le; y<sub>f</sub> &lt; offset.y + extent.height</code> for
	 * the selected scissor rectangle, then the scissor test passes. Otherwise, the test fails and the fragment is discarded. For points, lines, and polygons,
	 * the scissor rectangle for a primitive is selected in the same manner as the viewport. The scissor rectangles only apply to drawing commands, not to
	 * other commands like clears or copies.</p>
	 * 
	 * <p>It is legal for {@code offset.x + extent.width} or {@code offset.y + extent.height} to exceed the dimensions of the framebuffer - the scissor test
	 * still applies as defined above. Rasterization does not produce fragments outside of the framebuffer, so such fragments never have the scissor test
	 * performed on them.</p>
	 * 
	 * <p>The scissor test is always performed. Applications <b>can</b> effectively disable the scissor test by specifying a scissor rectangle that encompasses the
	 * entire framebuffer.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pScissors} <b>must</b> be a pointer to an array of {@code scissorCount} {@link VkRect2D} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>{@code scissorCount} <b>must</b> be greater than 0</li>
	 * <li>{@code firstScissor} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxViewports}</li>
	 * <li>The sum of {@code firstScissor} and {@code scissorCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
	 * <li>The {@code x} and {@code y} members of {@code offset} <b>must</b> be greater than or equal to 0</li>
	 * <li>Evaluation of ({@code offset.x} + {@code extent.width}) <b>must not</b> cause a signed integer addition overflow</li>
	 * <li>Evaluation of ({@code offset.y} + {@code extent.height}) <b>must not</b> cause a signed integer addition overflow</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param firstScissor  the index of the first scissor whose state is updated by the command
	 * @param scissorCount  the number of scissors whose rectangles are updated by the command
	 * @param pScissors     a pointer to an array of {@link VkRect2D} structures defining scissor rectangles
	 */
	public static void nvkCmdSetScissor(VkCommandBuffer commandBuffer, int firstScissor, int scissorCount, long pScissors) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetScissor;
		callPPV(__functionAddress, commandBuffer.address(), firstScissor, scissorCount, pScissors);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetScissor.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the dynamic scissor rectangles on a command buffer.
	 * 
	 * <p>The scissor test determines if a fragment’s framebuffer coordinates <code>(x<sub>f</sub>,y<sub>f</sub>)</code> lie within the scissor rectangle
	 * corresponding to the viewport index used by the primitive that generated the fragment. If the pipeline state object is created without
	 * {@link #VK_DYNAMIC_STATE_SCISSOR DYNAMIC_STATE_SCISSOR} enabled then the scissor rectangles are set by the {@link VkPipelineViewportStateCreateInfo} state of the pipeline state object.
	 * Otherwise, use this command to dynamically set the scissor rectangles.</p>
	 * 
	 * <p>The scissor rectangles taken from element {@code i} of {@code pScissors} replace the current state for the scissor index {@code firstScissor + i}, for
	 * {@code i} in {@code [0,scissorCount)}.</p>
	 * 
	 * <p>Each scissor rectangle is described by a {@link VkRect2D} structure, with the {@code offset.x} and {@code offset.y} values determining the upper left corner
	 * of the scissor rectangle, and the {@code extent.width} and {@code extent.height} values determining the size in pixels.</p>
	 * 
	 * <p>If <code>offset.x &le; x<sub>f</sub> &lt; offset.x + extent.width</code>  and <code>offset.y &le; y<sub>f</sub> &lt; offset.y + extent.height</code> for
	 * the selected scissor rectangle, then the scissor test passes. Otherwise, the test fails and the fragment is discarded. For points, lines, and polygons,
	 * the scissor rectangle for a primitive is selected in the same manner as the viewport. The scissor rectangles only apply to drawing commands, not to
	 * other commands like clears or copies.</p>
	 * 
	 * <p>It is legal for {@code offset.x + extent.width} or {@code offset.y + extent.height} to exceed the dimensions of the framebuffer - the scissor test
	 * still applies as defined above. Rasterization does not produce fragments outside of the framebuffer, so such fragments never have the scissor test
	 * performed on them.</p>
	 * 
	 * <p>The scissor test is always performed. Applications <b>can</b> effectively disable the scissor test by specifying a scissor rectangle that encompasses the
	 * entire framebuffer.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pScissors} <b>must</b> be a pointer to an array of {@code scissorCount} {@link VkRect2D} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>{@code scissorCount} <b>must</b> be greater than 0</li>
	 * <li>{@code firstScissor} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxViewports}</li>
	 * <li>The sum of {@code firstScissor} and {@code scissorCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
	 * <li>The {@code x} and {@code y} members of {@code offset} <b>must</b> be greater than or equal to 0</li>
	 * <li>Evaluation of ({@code offset.x} + {@code extent.width}) <b>must not</b> cause a signed integer addition overflow</li>
	 * <li>Evaluation of ({@code offset.y} + {@code extent.height}) <b>must not</b> cause a signed integer addition overflow</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param firstScissor  the index of the first scissor whose state is updated by the command
	 * @param pScissors     a pointer to an array of {@link VkRect2D} structures defining scissor rectangles
	 */
	public static void vkCmdSetScissor(VkCommandBuffer commandBuffer, int firstScissor, VkRect2D.Buffer pScissors) {
		nvkCmdSetScissor(commandBuffer, firstScissor, pScissors.remaining(), pScissors.address());
	}

	// --- [ vkCmdSetLineWidth ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetLineWidth.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the dynamic line width state.
	 * 
	 * <p>A line is drawn by generating a set of fragments overlapping a rectangle centered on the line segment. Each line segment has an associated width that
	 * controls the width of that rectangle.</p>
	 * 
	 * <p>The line width is set by the {@code lineWidth} property of {@link VkPipelineRasterizationStateCreateInfo} in the currently active pipeline if the pipeline
	 * was not created with {@link #VK_DYNAMIC_STATE_LINE_WIDTH DYNAMIC_STATE_LINE_WIDTH} enabled. Otherwise, the line width is set by calling {@code vkCmdSetLineWidth}.</p>
	 * 
	 * <p>Not all line widths need be supported for line segment rasterization, but width 1.0 antialiased segments <b>must</b> be provided. The range and gradations are
	 * obtained from the {@code lineWidthRange} and {@code lineWidthGranularity} members of {@link VkPhysicalDeviceLimits}. If, for instance, the size range is from
	 * 0.1 to 2.0 and the gradation size is 0.1, then the size 0.1, 0.2, …, 1.9, 2.0 are supported. Additional line widths <b>may</b> also be supported. There is no
	 * requirement that these widths be equally spaced. If an unsupported width is requested, the nearest supported width is used instead.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>If the wide lines feature is not enabled, {@code lineWidth} <b>must</b> be {@code 1.0}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param lineWidth     the width of rasterized line segments
	 */
	public static void vkCmdSetLineWidth(VkCommandBuffer commandBuffer, float lineWidth) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineWidth;
		callPV(__functionAddress, commandBuffer.address(), lineWidth);
	}

	// --- [ vkCmdSetDepthBias ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetDepthBias.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the depth bias dynamic state.
	 * 
	 * <p>The depth values of all fragments generated by the rasterization of a polygon <b>can</b> be offset by a single value that is computed for that polygon. This
	 * behavior is controlled by the {@code depthBiasEnable}, {@code depthBiasConstantFactor}, {@code depthBiasClamp}, and {@code depthBiasSlopeFactor}
	 * members of {@link VkPipelineRasterizationStateCreateInfo}, or by the corresponding parameters to the {@code vkCmdSetDepthBias} command if depth bias state is
	 * dynamic.</p>
	 * 
	 * <p>If {@code depthBiasEnable} is {@link #VK_FALSE FALSE}, no depth bias is applied and the fragment’s depth values are unchanged.</p>
	 * 
	 * <p>{@code depthBiasSlopeFactor} scales the maximum depth slope of the polygon, and {@code depthBiasConstantFactor} scales an implementation-dependent
	 * constant that relates to the usable resolution of the depth buffer. The resulting values are summed to produce the depth bias value which is then
	 * clamped to a minimum or maximum value specified by {@code depthBiasClamp}. {@code depthBiasSlopeFactor}, {@code depthBiasConstantFactor}, and
	 * {@code depthBiasClamp} <b>can</b> each be positive, negative, or zero.</p>
	 * 
	 * <p>The maximum depth slope mm of a triangle is</p>
	 * 
	 * <pre><code>            m = sqrt((&part;z<sub>f</sub> / &part;x<sub>f</sub>)<sup>2</sup> + (&part;z<sub>f</sub> / &part;y<sub>f</sub>)<sup>2</sup>)</code></pre>
	 * 
	 * <p>where <code>(x<sub>f</sub>,y<sub>f</sub>,z<sub>f</sub>)</code> is a point on the triangle. {@code m} <b>may</b> be approximated as</p>
	 * 
	 * <pre><code>            m = max(abs(&part;z<sub>f</sub> / &part;x<sub>f</sub>), abs(&part;z<sub>f</sub> / &part;y<sub>f</sub>))</code></pre>
	 * 
	 * <p>The minimum resolvable difference {@code r} is an implementation-dependent parameter that depends on the depth buffer representation. It is the
	 * smallest difference in framebuffer coordinate {@code z} values that is guaranteed to remain distinct throughout polygon rasterization and in the depth
	 * buffer. All pairs of fragments generated by the rasterization of two polygons with otherwise identical vertices, but <code>z<sub>f</sub></code> values
	 * that differ by {@code r}, will have distinct depth values.</p>
	 * 
	 * <p>For fixed-point depth buffer representations, {@code r} is constant throughout the range of the entire depth buffer. For floating-point depth buffers,
	 * there is no single minimum resolvable difference. In this case, the minimum resolvable difference for a given polygon is dependent on the maximum
	 * exponent, {@code e}, in the range of {@code z} values spanned by the primitive. If {@code n} is the number of bits in the floating-point mantissa, the
	 * minimum resolvable difference, {@code r}, for the given primitive is defined as</p>
	 * 
	 * <pre><code>            r = 2<sup>e-n</sup></code></pre>
	 * 
	 * <p>If no depth buffer is present, {@code r} is undefined.</p>
	 * 
	 * <p>The bias value {@code o} for a polygon is</p>
	 * 
	 * <table>
	 * <tr><td rowspan=3><code>o =</code></td><td><code>m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor</code></td><td><code>when depthBiasClamp = 0 or NaN</code></td></tr>
	 * <tr><td><code>min(m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor, depthBiasClamp)</code></td><td><code>when depthBiasClamp &gt; 0</code></td></tr>
	 * <tr><td><code>max(m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor, depthBiasClamp)</code></td><td><code>when depthBiasClamp &lt; 0</code></td></tr>
	 * </table>
	 * 
	 * <p>{@code m} is computed as described above. If the depth buffer uses a fixed-point representation, {@code m} is a function of depth values in the range
	 * {@code [0,1]}, and {@code o} is applied to depth values in the same range.</p>
	 * 
	 * <p>For fixed-point depth buffers, fragment depth values are always limited to the range {@code [0,1]} by clamping after depth bias addition is performed.
	 * Fragment depth values are clamped even when the depth buffer uses a floating-point representation.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>If the depth bias clamping feature is not enabled, {@code depthBiasClamp} <b>must</b> be 0.0</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer           the command buffer into which the command will be recorded
	 * @param depthBiasConstantFactor a scalar factor controlling the constant depth value added to each fragment
	 * @param depthBiasClamp          the maximum (or minimum) depth bias of a fragment
	 * @param depthBiasSlopeFactor    a scalar factor applied to a fragment’s slope in depth bias calculations
	 */
	public static void vkCmdSetDepthBias(VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBias;
		callPV(__functionAddress, commandBuffer.address(), depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor);
	}

	// --- [ vkCmdSetBlendConstants ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetBlendConstants.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the values of blend constants.
	 * 
	 * <p>If the pipeline state object is created without the {@link #VK_DYNAMIC_STATE_BLEND_CONSTANTS DYNAMIC_STATE_BLEND_CONSTANTS} dynamic state enabled then the “blend constant”
	 * {@code (Rc,Gc,Bc,Ac)} is specified via the {@code blendConstants} member of {@link VkPipelineColorBlendStateCreateInfo}. Otherwise the blend constant is
	 * dynamically set and changed by calling this command,</p>
	 * 
	 * <h5>Valid Usage</h5>
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
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param blendConstants an array of four values specifying the R, G, B, and A components of the blend constant color used in blending, depending on the blend factor
	 */
	public static void nvkCmdSetBlendConstants(VkCommandBuffer commandBuffer, long blendConstants) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetBlendConstants;
		callPPV(__functionAddress, commandBuffer.address(), blendConstants);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetBlendConstants.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the values of blend constants.
	 * 
	 * <p>If the pipeline state object is created without the {@link #VK_DYNAMIC_STATE_BLEND_CONSTANTS DYNAMIC_STATE_BLEND_CONSTANTS} dynamic state enabled then the “blend constant”
	 * {@code (Rc,Gc,Bc,Ac)} is specified via the {@code blendConstants} member of {@link VkPipelineColorBlendStateCreateInfo}. Otherwise the blend constant is
	 * dynamically set and changed by calling this command,</p>
	 * 
	 * <h5>Valid Usage</h5>
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
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param blendConstants an array of four values specifying the R, G, B, and A components of the blend constant color used in blending, depending on the blend factor
	 */
	public static void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, FloatBuffer blendConstants) {
		if ( CHECKS )
			checkBuffer(blendConstants, 4);
		nvkCmdSetBlendConstants(commandBuffer, memAddress(blendConstants));
	}

	// --- [ vkCmdSetDepthBounds ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetDepthBounds.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the depth bounds test values for a command buffer.
	 * 
	 * <p>The depth bounds test conditionally disables coverage of a sample based on the outcome of a comparison between the value zaza in the depth attachment
	 * at location <code>(x<sub>f</sub>,y<sub>f</sub>)</code> (for the appropriate sample) and a range of values. The test is enabled or disabled by the
	 * {@code depthBoundsTestEnable} member of {@link VkPipelineDepthStencilStateCreateInfo}. If the pipeline state object is created without the
	 * {@link #VK_DYNAMIC_STATE_DEPTH_BOUNDS DYNAMIC_STATE_DEPTH_BOUNDS} dynamic state enabled then the range of values used in the depth bounds test are defined by the {@code minDepthBounds} and
	 * {@code maxDepthBounds} members of the {@link VkPipelineDepthStencilStateCreateInfo} structure. Otherwise, to dynamically set the depth bounds range values
	 * call this command.</p>
	 * 
	 * <p>If <code>minDepthBounds &le; za &le; maxDepthBounds</code>, then the depth bounds test passes. Otherwise, the test fails and the sample’s coverage bit is
	 * cleared in the fragment. If there is no depth framebuffer attachment or if the depth bounds test is disabled, it is as if the depth bounds test always
	 * passes.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>{@code minDepthBounds} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
	 * <li>{@code maxDepthBounds} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param minDepthBounds the lower bound of the range of depth values used in the depth bounds test
	 * @param maxDepthBounds the upper bound of the range
	 */
	public static void vkCmdSetDepthBounds(VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBounds;
		callPV(__functionAddress, commandBuffer.address(), minDepthBounds, maxDepthBounds);
	}

	// --- [ vkCmdSetStencilCompareMask ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetStencilCompareMask.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the stencil compare mask dynamic state.
	 * 
	 * <p>If the pipeline state object is created with the {@link #VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK DYNAMIC_STATE_STENCIL_COMPARE_MASK} dynamic state enabled, then to dynamically set the stencil compare
	 * mask call this command.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
	 * <li>{@code faceMask} <b>must not</b> be 0</li>
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
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param faceMask      a bitmask specifying the set of stencil state for which to update the compare mask. One or more of:<br><table><tr><td>{@link #VK_STENCIL_FACE_FRONT_BIT STENCIL_FACE_FRONT_BIT}</td><td>{@link #VK_STENCIL_FACE_BACK_BIT STENCIL_FACE_BACK_BIT}</td><td>{@link #VK_STENCIL_FRONT_AND_BACK STENCIL_FRONT_AND_BACK}</td></tr></table>
	 * @param compareMask   the new value to use as the stencil compare mask
	 */
	public static void vkCmdSetStencilCompareMask(VkCommandBuffer commandBuffer, int faceMask, int compareMask) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilCompareMask;
		callPV(__functionAddress, commandBuffer.address(), faceMask, compareMask);
	}

	// --- [ vkCmdSetStencilWriteMask ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetStencilWriteMask.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the stencil write mask dynamic state.
	 * 
	 * <p>If the pipeline state object is created with the {@link #VK_DYNAMIC_STATE_STENCIL_WRITE_MASK DYNAMIC_STATE_STENCIL_WRITE_MASK} dynamic state enabled, then to dynamically set the stencil write
	 * mask call this command.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
	 * <li>{@code faceMask} <b>must not</b> be 0</li>
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
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param faceMask      a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the write mask. One or more of:<br><table><tr><td>{@link #VK_STENCIL_FACE_FRONT_BIT STENCIL_FACE_FRONT_BIT}</td><td>{@link #VK_STENCIL_FACE_BACK_BIT STENCIL_FACE_BACK_BIT}</td><td>{@link #VK_STENCIL_FRONT_AND_BACK STENCIL_FRONT_AND_BACK}</td></tr></table>
	 * @param writeMask     the new value to use as the stencil write mask
	 */
	public static void vkCmdSetStencilWriteMask(VkCommandBuffer commandBuffer, int faceMask, int writeMask) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilWriteMask;
		callPV(__functionAddress, commandBuffer.address(), faceMask, writeMask);
	}

	// --- [ vkCmdSetStencilReference ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetStencilReference.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the stencil reference dynamic state.
	 * 
	 * <p>If the pipeline state object is created with the {@link #VK_DYNAMIC_STATE_STENCIL_REFERENCE DYNAMIC_STATE_STENCIL_REFERENCE} dynamic state enabled, then to dynamically set the stencil reference
	 * value call this command.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
	 * <li>{@code faceMask} <b>must not</b> be 0</li>
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
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param faceMask      a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the reference value. One or more of:<br><table><tr><td>{@link #VK_STENCIL_FACE_FRONT_BIT STENCIL_FACE_FRONT_BIT}</td><td>{@link #VK_STENCIL_FACE_BACK_BIT STENCIL_FACE_BACK_BIT}</td><td>{@link #VK_STENCIL_FRONT_AND_BACK STENCIL_FRONT_AND_BACK}</td></tr></table>
	 * @param reference     the new value to use as the stencil reference value
	 */
	public static void vkCmdSetStencilReference(VkCommandBuffer commandBuffer, int faceMask, int reference) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilReference;
		callPV(__functionAddress, commandBuffer.address(), faceMask, reference);
	}

	// --- [ vkCmdBindDescriptorSets ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdBindDescriptorSets.html">Khronos Reference Page</a></p>
	 * 
	 * Binds descriptor sets to a command buffer.
	 * 
	 * <p>If any of the sets being bound include dynamic uniform or storage buffers, then {@code pDynamicOffsets} includes one element for each array element in
	 * each dynamic descriptor type binding in each set.</p>
	 * 
	 * <p>{@code vkCmdBindDescriptorSets} causes the sets numbered {@code [firstSet.. firstSet+descriptorSetCount-1]} to use the bindings stored in
	 * {@code pDescriptorSets[0..descriptorSetCount-1]} for subsequent rendering commands (either compute or graphics, according to the
	 * {@code pipelineBindPoint}). Any bindings that were previously applied via these sets are no longer valid.</p>
	 * 
	 * <p>Once bound, a descriptor set affects rendering of subsequent graphics or compute commands in the command buffer until a different set is bound to the
	 * same set number, or else until the set is disturbed.</p>
	 * 
	 * <p>A compatible descriptor set <b>must</b> be bound for all set numbers that any shaders in a pipeline access, at the time that a draw or dispatch command is
	 * recorded to execute using that pipeline. However, if none of the shaders in a pipeline statically use any bindings with a particular set number, then
	 * no descriptor set need be bound for that set number, even if the pipeline layout includes a non-trivial descriptor set layout for that set number.</p>
	 * 
	 * <p>If any of the sets being bound include dynamic uniform or storage buffers, then {@code pDynamicOffsets} includes one element for each array element in
	 * each dynamic descriptor type binding in each set. Values are taken from {@code pDynamicOffsets} in an order such that all entries for set N come before
	 * set N+1; within a set, entries are ordered by the binding numbers in the decriptor set layouts; and within a binding array, elements are in order.
	 * {@code dynamicOffsetCount} <b>must</b> equal the total number of dynamic descriptors in the sets being bound.</p>
	 * 
	 * <p>The effective offset used for dynamic uniform and storage buffer bindings is the sum of the relative offset taken from {@code pDynamicOffsets}, and the
	 * base address of the buffer plus base offset in the descriptor set. The length of the dynamic uniform and storage buffer bindings is the buffer range as
	 * specified in the descriptor set.</p>
	 * 
	 * <p>Each of the {@code pDescriptorSets} <b>must</b> be compatible with the pipeline layout specified by {@code layout}. The layout used to program the bindings
	 * <b>must</b> also be compatible with the pipeline used in subsequent graphics or compute commands.</p>
	 * 
	 * <p>The descriptor set contents bound by a call to {@code vkCmdBindDescriptorSets} <b>may</b> be consumed during host execution of the command, or during shader
	 * execution of the resulting draws, or any time in between. Thus, the contents <b>must not</b> be altered (overwritten by an update command, or freed) between
	 * when the command is recorded and when the command completes executing on the queue. The contents of {@code pDynamicOffsets} are consumed immediately
	 * during execution of {@code vkCmdBindDescriptorSets}. Once all pending uses have completed, it is legal to update and reuse a descriptor set.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
	 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code descriptorSetCount} valid {@code VkDescriptorSet} handles</li>
	 * <li>If {@code dynamicOffsetCount} is not 0, {@code pDynamicOffsets} <b>must</b> be a pointer to an array of {@code dynamicOffsetCount} {@code uint32_t}
	 * values</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code layout} and the elements of {@code pDescriptorSets} <b>must</b> have been created, allocated or retrieved from the
	 * same {@code VkDevice}</li>
	 * <li>Any given element of {@code pDescriptorSets} <b>must</b> have been created with a {@code VkDescriptorSetLayout} that matches (is the same as, or defined
	 * identically to) the {@code VkDescriptorSetLayout} at set {@code n} in {@code layout}, where {@code n} is the sum of {@code firstSet} and the index
	 * into {@code pDescriptorSets}</li>
	 * <li>{@code dynamicOffsetCount} <b>must</b> be equal to the total number of dynamic descriptors in {@code pDescriptorSets}</li>
	 * <li>{@code pipelineBindPoint} <b>must</b> be supported by the {@code commandBuffer}'s parent {@code VkCommandPool}'s queue family</li>
	 * <li>Any given element of {@code pDynamicOffsets} <b>must</b> satisfy the required alignment for the corresponding descriptor binding's descriptor type</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer      the command buffer that the descriptor sets will be bound to
	 * @param pipelineBindPoint  a {@code VkPipelineBindPoint} indicating whether the descriptors will be used by graphics pipelines or compute pipelines. There is a separate set
	 *                           of bind points for each of graphics and compute, so binding one does not disturb the other. One of:<br><table><tr><td>{@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</td><td>{@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}</td></tr></table>
	 * @param layout             a {@code VkPipelineLayout} object used to program the bindings
	 * @param firstSet           the set number of the first descriptor set to be bound
	 * @param descriptorSetCount the number of elements in the {@code pDescriptorSets} array
	 * @param pDescriptorSets    a pointer to an array of {@code VkDescriptorSet} structures describing the descriptor sets to write to
	 * @param dynamicOffsetCount the number of dynamic offsets in the {@code pDynamicOffsets} array
	 * @param pDynamicOffsets    a pointer to an array of {@code uint32_t} values specifying dynamic offsets
	 */
	public static void nvkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, int descriptorSetCount, long pDescriptorSets, int dynamicOffsetCount, long pDynamicOffsets) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets;
		callPJPPV(__functionAddress, commandBuffer.address(), pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdBindDescriptorSets.html">Khronos Reference Page</a></p>
	 * 
	 * Binds descriptor sets to a command buffer.
	 * 
	 * <p>If any of the sets being bound include dynamic uniform or storage buffers, then {@code pDynamicOffsets} includes one element for each array element in
	 * each dynamic descriptor type binding in each set.</p>
	 * 
	 * <p>{@code vkCmdBindDescriptorSets} causes the sets numbered {@code [firstSet.. firstSet+descriptorSetCount-1]} to use the bindings stored in
	 * {@code pDescriptorSets[0..descriptorSetCount-1]} for subsequent rendering commands (either compute or graphics, according to the
	 * {@code pipelineBindPoint}). Any bindings that were previously applied via these sets are no longer valid.</p>
	 * 
	 * <p>Once bound, a descriptor set affects rendering of subsequent graphics or compute commands in the command buffer until a different set is bound to the
	 * same set number, or else until the set is disturbed.</p>
	 * 
	 * <p>A compatible descriptor set <b>must</b> be bound for all set numbers that any shaders in a pipeline access, at the time that a draw or dispatch command is
	 * recorded to execute using that pipeline. However, if none of the shaders in a pipeline statically use any bindings with a particular set number, then
	 * no descriptor set need be bound for that set number, even if the pipeline layout includes a non-trivial descriptor set layout for that set number.</p>
	 * 
	 * <p>If any of the sets being bound include dynamic uniform or storage buffers, then {@code pDynamicOffsets} includes one element for each array element in
	 * each dynamic descriptor type binding in each set. Values are taken from {@code pDynamicOffsets} in an order such that all entries for set N come before
	 * set N+1; within a set, entries are ordered by the binding numbers in the decriptor set layouts; and within a binding array, elements are in order.
	 * {@code dynamicOffsetCount} <b>must</b> equal the total number of dynamic descriptors in the sets being bound.</p>
	 * 
	 * <p>The effective offset used for dynamic uniform and storage buffer bindings is the sum of the relative offset taken from {@code pDynamicOffsets}, and the
	 * base address of the buffer plus base offset in the descriptor set. The length of the dynamic uniform and storage buffer bindings is the buffer range as
	 * specified in the descriptor set.</p>
	 * 
	 * <p>Each of the {@code pDescriptorSets} <b>must</b> be compatible with the pipeline layout specified by {@code layout}. The layout used to program the bindings
	 * <b>must</b> also be compatible with the pipeline used in subsequent graphics or compute commands.</p>
	 * 
	 * <p>The descriptor set contents bound by a call to {@code vkCmdBindDescriptorSets} <b>may</b> be consumed during host execution of the command, or during shader
	 * execution of the resulting draws, or any time in between. Thus, the contents <b>must not</b> be altered (overwritten by an update command, or freed) between
	 * when the command is recorded and when the command completes executing on the queue. The contents of {@code pDynamicOffsets} are consumed immediately
	 * during execution of {@code vkCmdBindDescriptorSets}. Once all pending uses have completed, it is legal to update and reuse a descriptor set.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
	 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code descriptorSetCount} valid {@code VkDescriptorSet} handles</li>
	 * <li>If {@code dynamicOffsetCount} is not 0, {@code pDynamicOffsets} <b>must</b> be a pointer to an array of {@code dynamicOffsetCount} {@code uint32_t}
	 * values</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code layout} and the elements of {@code pDescriptorSets} <b>must</b> have been created, allocated or retrieved from the
	 * same {@code VkDevice}</li>
	 * <li>Any given element of {@code pDescriptorSets} <b>must</b> have been created with a {@code VkDescriptorSetLayout} that matches (is the same as, or defined
	 * identically to) the {@code VkDescriptorSetLayout} at set {@code n} in {@code layout}, where {@code n} is the sum of {@code firstSet} and the index
	 * into {@code pDescriptorSets}</li>
	 * <li>{@code dynamicOffsetCount} <b>must</b> be equal to the total number of dynamic descriptors in {@code pDescriptorSets}</li>
	 * <li>{@code pipelineBindPoint} <b>must</b> be supported by the {@code commandBuffer}'s parent {@code VkCommandPool}'s queue family</li>
	 * <li>Any given element of {@code pDynamicOffsets} <b>must</b> satisfy the required alignment for the corresponding descriptor binding's descriptor type</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer     the command buffer that the descriptor sets will be bound to
	 * @param pipelineBindPoint a {@code VkPipelineBindPoint} indicating whether the descriptors will be used by graphics pipelines or compute pipelines. There is a separate set
	 *                          of bind points for each of graphics and compute, so binding one does not disturb the other. One of:<br><table><tr><td>{@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</td><td>{@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}</td></tr></table>
	 * @param layout            a {@code VkPipelineLayout} object used to program the bindings
	 * @param firstSet          the set number of the first descriptor set to be bound
	 * @param pDescriptorSets   a pointer to an array of {@code VkDescriptorSet} structures describing the descriptor sets to write to
	 * @param pDynamicOffsets   a pointer to an array of {@code uint32_t} values specifying dynamic offsets
	 */
	public static void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, LongBuffer pDescriptorSets, IntBuffer pDynamicOffsets) {
		nvkCmdBindDescriptorSets(commandBuffer, pipelineBindPoint, layout, firstSet, pDescriptorSets.remaining(), memAddress(pDescriptorSets), pDynamicOffsets == null ? 0 : pDynamicOffsets.remaining(), memAddressSafe(pDynamicOffsets));
	}

	// --- [ vkCmdBindIndexBuffer ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdBindIndexBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Binds an index buffer to a command buffer.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>Each of {@code commandBuffer} and {@code buffer} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
	 * <li>The sum of {@code offset}, and the address of the range of {@code VkDeviceMemory} object that's backing {@code buffer}, <b>must</b> be a multiple of the
	 * type indicated by {@code indexType}</li>
	 * <li>{@code buffer} <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_INDEX_BUFFER_BIT BUFFER_USAGE_INDEX_BUFFER_BIT} flag</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded
	 * @param buffer        the buffer being bound
	 * @param offset        the starting offset in bytes within {@code buffer} used in index buffer address calculations
	 * @param indexType     selects whether indices are treated as 16 bits or 32 bits. One of:<br><table><tr><td>{@link #VK_INDEX_TYPE_UINT16 INDEX_TYPE_UINT16}</td><td>{@link #VK_INDEX_TYPE_UINT32 INDEX_TYPE_UINT32}</td></tr></table>
	 */
	public static void vkCmdBindIndexBuffer(VkCommandBuffer commandBuffer, long buffer, long offset, int indexType) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBindIndexBuffer;
		callPJJV(__functionAddress, commandBuffer.address(), buffer, offset, indexType);
	}

	// --- [ vkCmdBindVertexBuffers ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdBindVertexBuffers.html">Khronos Reference Page</a></p>
	 * 
	 * Binds vertex buffers to a command buffer.
	 * 
	 * <p>The values taken from elements {@code i} of {@code pBuffers} and {@code pOffsets} replace the current state for the vertex input binding
	 * {@code firstBinding + i}, for {@code i} in {@code [0,bindingCount)}. The vertex input binding is updated to start at the offset indicated by
	 * {@code pOffsets[i]} from the start of the buffer {@code pBuffers[i]}. All vertex input attributes that use each of these bindings will use these
	 * updated addresses in their address calculations for subsequent draw commands.</p>
	 * 
	 * <p>The address of each attribute for each {@code vertexIndex} and {@code instanceIndex} is calculated as follows:</p>
	 * 
	 * <ul>
	 * <li>Let {@code attribDesc} be the member of {@link VkPipelineVertexInputStateCreateInfo}{@code ::pVertexAttributeDescriptions} with
	 * {@link VkVertexInputAttributeDescription}{@code ::location} equal to the vertex input attribute number.</li>
	 * <li>Let {@code bindingDesc} be the member of {@code VkPipelineVertexInputStateCreateInfo::pVertexBindingDescriptions} with
	 * {@code VkVertexInputAttributeDescription::binding} equal to {@code attribDesc.binding}.</li>
	 * <li>Let {@code vertexIndex} be the index of the vertex within the draw (a value between {@code firstVertex} and {@code firstVertex+vertexCount} for
	 * {@link #vkCmdDraw CmdDraw}, or a value taken from the index buffer for {@link #vkCmdDrawIndexed CmdDrawIndexed}), and let {@code instanceIndex} be the instance number of the draw (a
	 * value between {@code firstInstance} and {@code firstInstance+instanceCount}).</li>
	 * </ul>
	 * 
	 * <pre><code>bufferBindingAddress = buffer[binding].baseAddress + offset[binding];

if (bindingDesc.inputRate == VK_VERTEX_INPUT_RATE_VERTEX)
    vertexOffset = vertexIndex * bindingDesc.stride;
else
    vertexOffset = instanceIndex * bindingDesc.stride;

attribAddress = bufferBindingAddress + vertexOffset + attribDesc.offset;</code></pre>
	 * 
	 * <p>For each attribute, raw data is extracted starting at {@code attribAddress} and is converted from the {@code VkVertexInputAttributeDescription}’s
	 * format to either to floating-point, unsigned integer, or signed integer based on the base type of the format; the base type of the format <b>must</b> match
	 * the base type of the input variable in the shader. If format is a packed format, {@code attribAddress} <b>must</b> be a multiple of the size in bytes of the
	 * whole attribute data type. Otherwise, {@code attribAddress} <b>must</b> be a multiple of the size in bytes of the component type indicated by format. If the
	 * format does not include G, B, or A components, then those are filled with (0,0,1) as needed (using either 1.0f or integer 1 based on the format) for
	 * attributes that are not 64-bit data types. The number of components in the vertex shader input variable need not exactly match the number of components
	 * in the format. If the vertex shader has fewer components, the extra components are discarded.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pBuffers} <b>must</b> be a pointer to an array of {@code bindingCount} valid {@code VkBuffer} handles</li>
	 * <li>{@code pOffsets} <b>must</b> be a pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>{@code bindingCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer} and the elements of {@code pBuffers} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code firstBinding} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
	 * <li>The sum of {@code firstBinding} and {@code bindingCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
	 * <li>All elements of {@code pOffsets} <b>must</b> be less than the size of the corresponding element in {@code pBuffers}</li>
	 * <li>All elements of {@code pBuffers} <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_VERTEX_BUFFER_BIT BUFFER_USAGE_VERTEX_BUFFER_BIT} flag</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded
	 * @param firstBinding  the index of the first vertex input binding whose state is updated by the command
	 * @param bindingCount  the number of vertex input bindings whose state is updated by the command
	 * @param pBuffers      a pointer to an array of buffer handles
	 * @param pOffsets      a pointer to an array of buffer offsets
	 */
	public static void nvkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers;
		callPPPV(__functionAddress, commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdBindVertexBuffers.html">Khronos Reference Page</a></p>
	 * 
	 * Binds vertex buffers to a command buffer.
	 * 
	 * <p>The values taken from elements {@code i} of {@code pBuffers} and {@code pOffsets} replace the current state for the vertex input binding
	 * {@code firstBinding + i}, for {@code i} in {@code [0,bindingCount)}. The vertex input binding is updated to start at the offset indicated by
	 * {@code pOffsets[i]} from the start of the buffer {@code pBuffers[i]}. All vertex input attributes that use each of these bindings will use these
	 * updated addresses in their address calculations for subsequent draw commands.</p>
	 * 
	 * <p>The address of each attribute for each {@code vertexIndex} and {@code instanceIndex} is calculated as follows:</p>
	 * 
	 * <ul>
	 * <li>Let {@code attribDesc} be the member of {@link VkPipelineVertexInputStateCreateInfo}{@code ::pVertexAttributeDescriptions} with
	 * {@link VkVertexInputAttributeDescription}{@code ::location} equal to the vertex input attribute number.</li>
	 * <li>Let {@code bindingDesc} be the member of {@code VkPipelineVertexInputStateCreateInfo::pVertexBindingDescriptions} with
	 * {@code VkVertexInputAttributeDescription::binding} equal to {@code attribDesc.binding}.</li>
	 * <li>Let {@code vertexIndex} be the index of the vertex within the draw (a value between {@code firstVertex} and {@code firstVertex+vertexCount} for
	 * {@link #vkCmdDraw CmdDraw}, or a value taken from the index buffer for {@link #vkCmdDrawIndexed CmdDrawIndexed}), and let {@code instanceIndex} be the instance number of the draw (a
	 * value between {@code firstInstance} and {@code firstInstance+instanceCount}).</li>
	 * </ul>
	 * 
	 * <pre><code>bufferBindingAddress = buffer[binding].baseAddress + offset[binding];

if (bindingDesc.inputRate == VK_VERTEX_INPUT_RATE_VERTEX)
    vertexOffset = vertexIndex * bindingDesc.stride;
else
    vertexOffset = instanceIndex * bindingDesc.stride;

attribAddress = bufferBindingAddress + vertexOffset + attribDesc.offset;</code></pre>
	 * 
	 * <p>For each attribute, raw data is extracted starting at {@code attribAddress} and is converted from the {@code VkVertexInputAttributeDescription}’s
	 * format to either to floating-point, unsigned integer, or signed integer based on the base type of the format; the base type of the format <b>must</b> match
	 * the base type of the input variable in the shader. If format is a packed format, {@code attribAddress} <b>must</b> be a multiple of the size in bytes of the
	 * whole attribute data type. Otherwise, {@code attribAddress} <b>must</b> be a multiple of the size in bytes of the component type indicated by format. If the
	 * format does not include G, B, or A components, then those are filled with (0,0,1) as needed (using either 1.0f or integer 1 based on the format) for
	 * attributes that are not 64-bit data types. The number of components in the vertex shader input variable need not exactly match the number of components
	 * in the format. If the vertex shader has fewer components, the extra components are discarded.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pBuffers} <b>must</b> be a pointer to an array of {@code bindingCount} valid {@code VkBuffer} handles</li>
	 * <li>{@code pOffsets} <b>must</b> be a pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>{@code bindingCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer} and the elements of {@code pBuffers} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code firstBinding} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
	 * <li>The sum of {@code firstBinding} and {@code bindingCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
	 * <li>All elements of {@code pOffsets} <b>must</b> be less than the size of the corresponding element in {@code pBuffers}</li>
	 * <li>All elements of {@code pBuffers} <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_VERTEX_BUFFER_BIT BUFFER_USAGE_VERTEX_BUFFER_BIT} flag</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded
	 * @param firstBinding  the index of the first vertex input binding whose state is updated by the command
	 * @param pBuffers      a pointer to an array of buffer handles
	 * @param pOffsets      a pointer to an array of buffer offsets
	 */
	public static void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, int firstBinding, LongBuffer pBuffers, LongBuffer pOffsets) {
		if ( CHECKS )
			checkBuffer(pOffsets, pBuffers.remaining());
		nvkCmdBindVertexBuffers(commandBuffer, firstBinding, pBuffers.remaining(), memAddress(pBuffers), memAddress(pOffsets));
	}

	// --- [ vkCmdDraw ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdDraw.html">Khronos Reference Page</a></p>
	 * 
	 * Records a non-indexed draw.
	 * 
	 * <p>When the command is executed, primitives are assembled using the current primitive topology and {@code vertexCount consecutive} vertex indices with the
	 * first {@code vertexIndex value} equal to {@code firstVertex}. The primitives are drawn {@code instanceCount} times with {@code instanceIndex} starting
	 * with {@code firstInstance} and increasing sequentially for each instance. The assembled primitives execute the currently bound graphics pipeline.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * <li>For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a descriptor set <b>must</b>
	 * have been bound to {@code n} at {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
	 * {@code VkPipelineLayout} used to create the current {@code VkPipeline}</li>
	 * <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a push constant value
	 * <b>must</b> have been set for {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for push constants, with the
	 * {@code VkPipelineLayout} used to create the current {@code VkPipeline}</li>
	 * <li>Descriptors in each bound descriptor set, specified via {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the currently bound
	 * {@code VkPipeline} object, specified via {@link #vkCmdBindPipeline CmdBindPipeline}</li>
	 * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point's interface <b>must</b> have valid buffers bound</li>
	 * <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding</li>
	 * <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
	 * <li>If the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} requires any dynamic state, that state <b>must</b> have been set on the
	 * current command buffer</li>
	 * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses
	 * unnormalized coordinates, it <b>must not</b> be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D},
	 * {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link #VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link #VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses
	 * unnormalized coordinates, it <b>must not</b> be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
	 * {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses
	 * unnormalized coordinates, it <b>must not</b> be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
	 * includes a lod bias or any offset values, in any shader stage</li>
	 * <li>If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
	 * {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a uniform buffer, it <b>must not</b> access values outside of the range of that buffer specified in the currently
	 * bound descriptor set</li>
	 * <li>If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
	 * {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a storage buffer, it <b>must not</b> access values outside of the range of that buffer specified in the currently
	 * bound descriptor set</li>
	 * <li>Any {@code VkImageView} being sampled with {@link #VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command <b>must</b> be of a format which supports linear filtering, as
	 * specified by the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or
	 * {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded
	 * @param vertexCount   the number of vertices to draw
	 * @param instanceCount the number of instances to draw
	 * @param firstVertex   the index of the first vertex to draw
	 * @param firstInstance the instance ID of the first instance to draw
	 */
	public static void vkCmdDraw(VkCommandBuffer commandBuffer, int vertexCount, int instanceCount, int firstVertex, int firstInstance) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDraw;
		callPV(__functionAddress, commandBuffer.address(), vertexCount, instanceCount, firstVertex, firstInstance);
	}

	// --- [ vkCmdDrawIndexed ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdDrawIndexed.html">Khronos Reference Page</a></p>
	 * 
	 * Records an indexed draw call.
	 * 
	 * <p>When the command is executed, primitives are assembled using the current primitive topology and {@code indexCount} vertices whose indices are retrieved
	 * from the index buffer. The index buffer is treated as an array of tightly packed unsigned integers of size defined by the
	 * {@link #vkCmdBindIndexBuffer CmdBindIndexBuffer}{@code ::indexType} parameter with which the buffer was bound.</p>
	 * 
	 * <p>The first vertex index is at an offset of {@code firstIndex * indexSize + offset} within the currently bound index buffer, where offset is the offset
	 * specified by {@code vkCmdBindIndexBuffer} and {@code indexSize} is the byte size of the type specified by {@code indexType}. Subsequent index values
	 * are retrieved from consecutive locations in the index buffer. Indices are first compared to the primitive restart value, then zero extended to 32 bits
	 * (if the {@code indexType} is {@link #VK_INDEX_TYPE_UINT16 INDEX_TYPE_UINT16}) and have {@code vertexOffset} added to them, before being supplied as the {@code vertexIndex} value.</p>
	 * 
	 * <p>The primitives are drawn {@code instanceCount} times with {@code instanceIndex} starting with {@code firstInstance} and increasing sequentially for
	 * each instance. The assembled primitives execute the currently bound graphics pipeline.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * <li>For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a descriptor set <b>must</b>
	 * have been bound to {@code n} at {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
	 * {@code VkPipelineLayout} used to create the current {@code VkPipeline}</li>
	 * <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a push constant value
	 * <b>must</b> have been set for {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for push constants, with the
	 * {@code VkPipelineLayout} used to create the current {@code VkPipeline}</li>
	 * <li>Descriptors in each bound descriptor set, specified via {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the currently bound
	 * {@code VkPipeline} object, specified via {@link #vkCmdBindPipeline CmdBindPipeline}</li>
	 * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point's interface <b>must</b> have valid buffers bound</li>
	 * <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding</li>
	 * <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
	 * <li>If the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} requires any dynamic state, that state <b>must</b> have been set on the
	 * current command buffer</li>
	 * <li>({@code indexSize} * ({@code firstIndex} + {@code indexCount}) + {@code offset}) <b>must</b> be less than or equal to the size of the currently bound
	 * index buffer, with indexSize being based on the type specified by {@code indexType}, where the index buffer, {@code indexType}, and {@code offset}
	 * are specified via {@link #vkCmdBindIndexBuffer CmdBindIndexBuffer}</li>
	 * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses
	 * unnormalized coordinates, it <b>must not</b> be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D},
	 * {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link #VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link #VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses
	 * unnormalized coordinates, it <b>must not</b> be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
	 * {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses
	 * unnormalized coordinates, it <b>must not</b> be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
	 * includes a lod bias or any offset values, in any shader stage</li>
	 * <li>If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
	 * {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a uniform buffer, it <b>must not</b> access values outside of the range of that buffer specified in the currently
	 * bound descriptor set</li>
	 * <li>If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
	 * {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a storage buffer, it <b>must not</b> access values outside of the range of that buffer specified in the currently
	 * bound descriptor set</li>
	 * <li>Any {@code VkImageView} being sampled with {@link #VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command <b>must</b> be of a format which supports linear filtering, as
	 * specified by the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or
	 * {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded
	 * @param indexCount    the number of vertices to draw
	 * @param instanceCount the number of instances to draw
	 * @param firstIndex    the base index within the index buffer
	 * @param vertexOffset  the value added to the vertex index before indexing into the vertex buffer
	 * @param firstInstance the instance ID of the first instance to draw
	 */
	public static void vkCmdDrawIndexed(VkCommandBuffer commandBuffer, int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndexed;
		callPV(__functionAddress, commandBuffer.address(), indexCount, instanceCount, firstIndex, vertexOffset, firstInstance);
	}

	// --- [ vkCmdDrawIndirect ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdDrawIndirect.html">Khronos Reference Page</a></p>
	 * 
	 * Records a non-indexed indirect draw.
	 * 
	 * <p>{@code vkCmdDrawIndirect} behaves similarly to {@link #vkCmdDraw CmdDraw} except that the parameters are read by the device from a buffer during execution.
	 * {@code drawCount} draws are executed by the command, with parameters taken from buffer starting at {@code offset} and increasing by {@code stride}
	 * bytes for each successive draw. The parameters of each draw are encoded in an array of {@link VkDrawIndirectCommand} structures. If {@code drawCount} is less
	 * than or equal to one, {@code stride} is ignored.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * <li>Each of {@code commandBuffer} and {@code buffer} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>If {@code drawCount} is greater than 1, {@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to
	 * sizeof({@code VkDrawIndirectCommand})</li>
	 * <li>If the multi-draw indirect feature is not enabled, {@code drawCount} <b>must</b> be 0 or 1</li>
	 * <li>If the drawIndirectFirstInstance feature is not enabled, all the {@code firstInstance} members of the {@link VkDrawIndirectCommand} structures accessed
	 * by this command <b>must</b> be 0</li>
	 * <li>For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a descriptor set <b>must</b>
	 * have been bound to {@code n} at {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
	 * {@code VkPipelineLayout} used to create the current {@code VkPipeline}</li>
	 * <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a push constant value
	 * <b>must</b> have been set for {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for push constants, with the
	 * {@code VkPipelineLayout} used to create the current {@code VkPipeline}</li>
	 * <li>Descriptors in each bound descriptor set, specified via {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the currently bound
	 * {@code VkPipeline} object, specified via {@link #vkCmdBindPipeline CmdBindPipeline}</li>
	 * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point's interface <b>must</b> have valid buffers bound</li>
	 * <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
	 * <li>If the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} requires any dynamic state, that state <b>must</b> have been set on the
	 * current command buffer</li>
	 * <li>If {@code drawCount} is equal to 1, ({@code offset} + sizeof({@code VkDrawIndirectCommand})) <b>must</b> be less than or equal to the size of
	 * {@code buffer}</li>
	 * <li>If {@code drawCount} is greater than 1, ({@code stride} x ({@code drawCount} - 1) + {@code offset} + sizeof({@code VkDrawIndirectCommand})) <b>must</b>
	 * be less than or equal to the size of {@code buffer}</li>
	 * <li>{@code drawCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDrawIndirectCount}</li>
	 * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses
	 * unnormalized coordinates, it <b>must not</b> be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D},
	 * {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link #VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link #VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses
	 * unnormalized coordinates, it <b>must not</b> be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
	 * {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses
	 * unnormalized coordinates, it <b>must not</b> be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
	 * includes a lod bias or any offset values, in any shader stage</li>
	 * <li>If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
	 * {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a uniform buffer, it <b>must not</b> access values outside of the range of that buffer specified in the currently
	 * bound descriptor set</li>
	 * <li>If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
	 * {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a storage buffer, it <b>must not</b> access values outside of the range of that buffer specified in the currently
	 * bound descriptor set</li>
	 * <li>Any {@code VkImageView} being sampled with {@link #VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command <b>must</b> be of a format which supports linear filtering, as
	 * specified by the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or
	 * {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded
	 * @param buffer        the buffer containing draw parameters
	 * @param offset        the byte offset into buffer where parameters begin
	 * @param drawCount     the number of draws to execute, and <b>can</b> be zero
	 * @param stride        the byte stride between successive sets of draw parameters
	 */
	public static void vkCmdDrawIndirect(VkCommandBuffer commandBuffer, long buffer, long offset, int drawCount, int stride) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirect;
		callPJJV(__functionAddress, commandBuffer.address(), buffer, offset, drawCount, stride);
	}

	// --- [ vkCmdDrawIndexedIndirect ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdDrawIndexedIndirect.html">Khronos Reference Page</a></p>
	 * 
	 * Records an indexed indirect draw.
	 * 
	 * <p>{@code vkCmdDrawIndexedIndirect behaves} similarly to {@link #vkCmdDrawIndirect CmdDrawIndirect} except that the parameters are read by the device from a buffer during
	 * execution. {@code drawCount} draws are executed by the command, with parameters taken from buffer starting at {@code offset} and increasing by
	 * {@code stride} bytes for each successive draw. The parameters of each draw are encoded in an array of {@link VkDrawIndexedIndirectCommand} structures. If
	 * {@code drawCount} is less than or equal to one, {@code stride} is ignored.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * <li>Each of {@code commandBuffer} and {@code buffer} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>If {@code drawCount} is greater than 1, {@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to
	 * sizeof({@code VkDrawIndexedIndirectCommand})</li>
	 * <li>If the multi-draw indirect feature is not enabled, {@code drawCount} <b>must</b> be 0 or 1</li>
	 * <li>If the drawIndirectFirstInstance feature is not enabled, all the {@code firstInstance} members of the {@link VkDrawIndexedIndirectCommand} structures
	 * accessed by this command <b>must</b> be 0</li>
	 * <li>For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a descriptor set <b>must</b>
	 * have been bound to {@code n} at {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
	 * {@code VkPipelineLayout} used to create the current {@code VkPipeline}</li>
	 * <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a push constant value
	 * <b>must</b> have been set for {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for push constants, with the
	 * {@code VkPipelineLayout} used to create the current {@code VkPipeline}</li>
	 * <li>Descriptors in each bound descriptor set, specified via {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the currently bound
	 * {@code VkPipeline} object, specified via {@link #vkCmdBindPipeline CmdBindPipeline}</li>
	 * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point's interface <b>must</b> have valid buffers bound</li>
	 * <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
	 * <li>If the {@code VkPipeline} object currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} requires any dynamic state, that state <b>must</b> have been set on the
	 * current command buffer</li>
	 * <li>If {@code drawCount} is equal to 1, ({@code offset} + sizeof({@code VkDrawIndexedIndirectCommand})) <b>must</b> be less than or equal to the size of
	 * {@code buffer}</li>
	 * <li>If {@code drawCount} is greater than 1, ({@code stride} x ({@code drawCount} - 1) + {@code offset} + sizeof({@code VkDrawIndexedIndirectCommand}))
	 * <b>must</b> be less than or equal to the size of {@code buffer}</li>
	 * <li>{@code drawCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDrawIndirectCount}</li>
	 * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses
	 * unnormalized coordinates, it <b>must not</b> be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D},
	 * {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link #VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link #VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses
	 * unnormalized coordinates, it <b>must not</b> be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
	 * {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses
	 * unnormalized coordinates, it <b>must not</b> be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
	 * includes a lod bias or any offset values, in any shader stage</li>
	 * <li>If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
	 * {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a uniform buffer, it <b>must not</b> access values outside of the range of that buffer specified in the currently
	 * bound descriptor set</li>
	 * <li>If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
	 * {@link #VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a storage buffer, it <b>must not</b> access values outside of the range of that buffer specified in the currently
	 * bound descriptor set</li>
	 * <li>Any {@code VkImageView} being sampled with {@link #VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command <b>must</b> be of a format which supports linear filtering, as
	 * specified by the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or
	 * {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded
	 * @param buffer        the buffer containing draw parameters
	 * @param offset        the byte offset into buffer where parameters begin
	 * @param drawCount     the number of draws to execute, and <b>can</b> be zero
	 * @param stride        the byte stride between successive sets of draw parameters
	 */
	public static void vkCmdDrawIndexedIndirect(VkCommandBuffer commandBuffer, long buffer, long offset, int drawCount, int stride) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndexedIndirect;
		callPJJV(__functionAddress, commandBuffer.address(), buffer, offset, drawCount, stride);
	}

	// --- [ vkCmdDispatch ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdDispatch.html">Khronos Reference Page</a></p>
	 * 
	 * Records a dispatch.
	 * 
	 * <p>Dispatching commands (commands with “Dispatch” in the name) provoke work in a compute pipeline. Dispatching commands are recorded into a command buffer
	 * and when executed by a queue, will produce work which executes according to the currently bound compute pipeline. A compute pipeline <b>must</b> be bound to
	 * a command buffer before any dispatch commands are recorded in that command buffer.</p>
	 * 
	 * <p>When the command is executed, a global workgroup consisting of <code>x &times; y &times; z</code> local workgroups is assembled.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code x} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[0]</li>
	 * <li>{@code y} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[1]</li>
	 * <li>{@code z} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[2]</li>
	 * <li>For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, a descriptor set <b>must</b>
	 * have been bound to {@code n} at {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
	 * {@code VkPipelineLayout} used to create the current {@code VkPipeline}</li>
	 * <li>Descriptors in each bound descriptor set, specified via {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the currently bound
	 * {@code VkPipeline} object, specified via {@link #vkCmdBindPipeline CmdBindPipeline}</li>
	 * <li>A valid compute pipeline <b>must</b> be bound to the current command buffer with {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}</li>
	 * <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, a push constant value
	 * <b>must</b> have been set for {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, with a {@code VkPipelineLayout} that is compatible for push constants with the one used to
	 * create the current {@code VkPipeline}</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} uses
	 * unnormalized coordinates, it <b>must not</b> be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D},
	 * {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link #VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link #VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} uses
	 * unnormalized coordinates, it <b>must not</b> be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
	 * {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} uses
	 * unnormalized coordinates, it <b>must not</b> be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
	 * includes a lod bias or any offset values, in any shader stage</li>
	 * <li>If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
	 * {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} accesses a uniform buffer, it <b>must not</b> access values outside of the range of that buffer specified in the currently
	 * bound descriptor set</li>
	 * <li>If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
	 * {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} accesses a storage buffer, it <b>must not</b> access values outside of the range of that buffer specified in the currently
	 * bound descriptor set</li>
	 * <li>Any {@code VkImageView} being sampled with {@link #VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command <b>must</b> be of a format which supports linear filtering, as
	 * specified by the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or
	 * {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param x             the number of local workgroups to dispatch in the X dimension
	 * @param y             the number of local workgroups to dispatch in the Y dimension
	 * @param z             the number of local workgroups to dispatch in the Z dimension
	 */
	public static void vkCmdDispatch(VkCommandBuffer commandBuffer, int x, int y, int z) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatch;
		callPV(__functionAddress, commandBuffer.address(), x, y, z);
	}

	// --- [ vkCmdDispatchIndirect ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdDispatchIndirect.html">Khronos Reference Page</a></p>
	 * 
	 * Records an indirect dispatch.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Each of {@code commandBuffer} and {@code buffer} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, a descriptor set <b>must</b>
	 * have been bound to {@code n} at {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
	 * {@code VkPipelineLayout} used to create the current {@code VkPipeline}</li>
	 * <li>Descriptors in each bound descriptor set, specified via {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the currently bound
	 * {@code VkPipeline} object, specified via {@link #vkCmdBindPipeline CmdBindPipeline}</li>
	 * <li>A valid compute pipeline <b>must</b> be bound to the current command buffer with {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}</li>
	 * <li>{@code buffer} <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>The sum of {@code offset} and the size of {@code VkDispatchIndirectCommand} <b>must</b> be less than or equal to the size of {@code buffer}</li>
	 * <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, a push constant value
	 * <b>must</b> have been set for {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}, with a {@code VkPipelineLayout} that is compatible for push constants with the one used to
	 * create the current {@code VkPipeline}</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} uses
	 * unnormalized coordinates, it <b>must not</b> be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link #VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D},
	 * {@link #VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link #VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link #VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link #VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} uses
	 * unnormalized coordinates, it <b>must not</b> be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
	 * {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
	 * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} uses
	 * unnormalized coordinates, it <b>must not</b> be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
	 * includes a lod bias or any offset values, in any shader stage</li>
	 * <li>If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
	 * {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} accesses a uniform buffer, it <b>must not</b> access values outside of the range of that buffer specified in the currently
	 * bound descriptor set</li>
	 * <li>If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
	 * {@link #VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE} accesses a storage buffer, it <b>must not</b> access values outside of the range of that buffer specified in the currently
	 * bound descriptor set</li>
	 * <li>Any {@code VkImageView} being sampled with {@link #VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command <b>must</b> be of a format which supports linear filtering, as
	 * specified by the {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or
	 * {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param buffer        the buffer containing dispatch parameters
	 * @param offset        the byte offset into buffer where parameters begin
	 */
	public static void vkCmdDispatchIndirect(VkCommandBuffer commandBuffer, long buffer, long offset) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchIndirect;
		callPJJV(__functionAddress, commandBuffer.address(), buffer, offset);
	}

	// --- [ vkCmdCopyBuffer ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdCopyBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Copies data between buffer objects.
	 * 
	 * <p>Each region in {@code pRegions} is copied from the source buffer to the same region of the destination buffer. {@code srcBuffer} and {@code dstBuffer}
	 * <b>can</b> be the same buffer or alias the same memory, but the result is undefined if the copy regions overlap in memory.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} {@link VkBufferCopy} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code srcBuffer} and {@code dstBuffer} <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkDevice}</li>
	 * <li>The {@code size} member of a given element of {@code pRegions} <b>must</b> be greater than 0</li>
	 * <li>The {@code srcOffset} member of a given element of {@code pRegions} <b>must</b> be less than the size of {@code srcBuffer}</li>
	 * <li>The {@code dstOffset} member of a given element of {@code pRegions} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>The {@code size} member of a given element of {@code pRegions} <b>must</b> be less than or equal to the size of {@code srcBuffer} minus {@code srcOffset}</li>
	 * <li>The {@code size} member of a given element of {@code pRegions} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
	 * <li>The union of the source regions, and the union of the destination regions, specified by the elements of {@code pRegions}, <b>must not</b> overlap in
	 * memory</li>
	 * <li>{@code srcBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_SRC_BIT BUFFER_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param srcBuffer     the source buffer
	 * @param dstBuffer     the destination buffer
	 * @param regionCount   the number of regions to copy
	 * @param pRegions      a pointer to an array of {@link VkBufferCopy} structures specifying the regions to copy
	 */
	public static void nvkCmdCopyBuffer(VkCommandBuffer commandBuffer, long srcBuffer, long dstBuffer, int regionCount, long pRegions) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBuffer;
		callPJJPV(__functionAddress, commandBuffer.address(), srcBuffer, dstBuffer, regionCount, pRegions);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdCopyBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Copies data between buffer objects.
	 * 
	 * <p>Each region in {@code pRegions} is copied from the source buffer to the same region of the destination buffer. {@code srcBuffer} and {@code dstBuffer}
	 * <b>can</b> be the same buffer or alias the same memory, but the result is undefined if the copy regions overlap in memory.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} {@link VkBufferCopy} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code srcBuffer} and {@code dstBuffer} <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkDevice}</li>
	 * <li>The {@code size} member of a given element of {@code pRegions} <b>must</b> be greater than 0</li>
	 * <li>The {@code srcOffset} member of a given element of {@code pRegions} <b>must</b> be less than the size of {@code srcBuffer}</li>
	 * <li>The {@code dstOffset} member of a given element of {@code pRegions} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>The {@code size} member of a given element of {@code pRegions} <b>must</b> be less than or equal to the size of {@code srcBuffer} minus {@code srcOffset}</li>
	 * <li>The {@code size} member of a given element of {@code pRegions} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
	 * <li>The union of the source regions, and the union of the destination regions, specified by the elements of {@code pRegions}, <b>must not</b> overlap in
	 * memory</li>
	 * <li>{@code srcBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_SRC_BIT BUFFER_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param srcBuffer     the source buffer
	 * @param dstBuffer     the destination buffer
	 * @param pRegions      a pointer to an array of {@link VkBufferCopy} structures specifying the regions to copy
	 */
	public static void vkCmdCopyBuffer(VkCommandBuffer commandBuffer, long srcBuffer, long dstBuffer, VkBufferCopy.Buffer pRegions) {
		nvkCmdCopyBuffer(commandBuffer, srcBuffer, dstBuffer, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdCopyImage ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdCopyImage.html">Khronos Reference Page</a></p>
	 * 
	 * Copy data between image objects.
	 * 
	 * <p>{@code vkCmdCopyImage} performs image copies in a similar manner to a host {@code memcpy}. It does not perform general-purpose conversions such as
	 * scaling, resizing, blending, color-space conversion, or format conversions. Rather, it simply copies raw image data. {@code vkCmdCopyImage} <b>can</b> copy
	 * between images with different formats, provided the formats are compatible.</p>
	 * 
	 * <p>Each region in {@code pRegions} is copied from the source image to the same region of the destination image. {@code srcImage} and {@code dstImage} <b>can</b>
	 * be the same image or alias the same memory.</p>
	 * 
	 * <p>Copies are done layer by layer starting with {@code baseArrayLayer} member of {@code srcSubresource} for the source and {@code dstSubresource} for the
	 * destination. {@code layerCount} layers are copied to the destination image.</p>
	 * 
	 * <p>The formats of {@code srcImage} and {@code dstImage} <b>must</b> be compatible. Formats are considered compatible if their texel size in bytes is the same
	 * between both formats. For example, {@link #VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM} is compatible with {@link #VK_FORMAT_R32_UINT FORMAT_R32_UINT} because because both texels are 4 bytes in size.
	 * Depth/stencil formats <b>must</b> match exactly.</p>
	 * 
	 * <p>{@code vkCmdCopyImage} allows copying between size-compatible compressed and uncompressed internal formats. Formats are size-compatible if the texel
	 * size of the uncompressed format is equal to the block size in bytes of the compressed format. Such a copy does not perform on-the-fly compression or
	 * decompression. When copying from an uncompressed format to a compressed format, each texel of uncompressed data becomes a single block of compressed
	 * data. When copying from a compressed format to an uncompressed format, a block of compressed data becomes a single texel of uncompressed data. Thus,
	 * for example, it is legal to copy between a 128-bit uncompressed format and a compressed format which uses 8-bit/texel 4x4 blocks, or between a 64-bit
	 * uncompressed format and a compressed format which uses 4-bit/texel 4x4 blocks.</p>
	 * 
	 * <p>When copying between compressed and uncompressed formats the {@code extent} members represent the texel dimensions of the source image and not the
	 * destination. When copying from a compressed image to an uncompressed image the image texel dimensions written to the uncompressed image will be source
	 * extent divided by the block size. When copying from an uncompressed image to a compressed image the image texel dimensions written to the compressed
	 * image will be the source extent multiplied by the block size. In both cases the number of bytes read and the number of bytes written will be identical.</p>
	 * 
	 * <p>Copying to or from block-compressed images is typically done in multiples of the block. For this reason the {@code extent} <b>must</b> be a multiple of the
	 * block dimension. There is one exception to this rule which is required to handle compressed images created with dimensions that are not a multiple of
	 * the block dimensions. If the {@code srcImage is} compressed and if {@code extent.width} is not a multiple of the block width then
	 * {@code (extent.width + srcOffset.x)} <b>must</b> equal the image subresource width, if {@code extent.height} is not a multiple of the block height then
	 * {@code (extent.height + srcOffset.y)} <b>must</b> equal the image subresource height and if {@code extent.depth} is not a multiple of the block depth then
	 * {@code (extent.depth + srcOffset.z)} <b>must</b> equal the image subresource depth. Similarly if the {@code dstImage} is compressed and if
	 * {@code extent.width} is not a multiple of the block width then {@code (extent.width + dstOffset.x)} <b>must</b> equal the image subresource width, if
	 * {@code extent.height} is not a multiple of the block height then {@code (extent.height + dstOffset.y)} <b>must</b> equal the image subresource height and if
	 * {@code extent.depth} is not a multiple of the block depth then {@code (extent.depth + dstOffset.z)} <b>must</b> equal the image subresource depth. This
	 * allows the last block of the image in each non-multiple dimension to be included as a source or target of the copy.</p>
	 * 
	 * <p>{@code vkCmdCopyImage} <b>can</b> be used to copy image data between multisample images, but both images <b>must</b> have the same number of samples.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid {@link VkImageCopy} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code srcImage} and {@code dstImage} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must not</b> overlap in
	 * memory</li>
	 * <li>{@code srcImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The {@code VkFormat} of each of {@code srcImage} and {@code dstImage} <b>must</b> be compatible, as defined below</li>
	 * <li>The sample count of {@code srcImage} and {@code dstImage} <b>must</b> match</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param srcImage       the source image
	 * @param srcImageLayout the current layout of the source image subresource
	 * @param dstImage       the destination image
	 * @param dstImageLayout the current layout of the destination image subresource
	 * @param regionCount    the number of regions to copy
	 * @param pRegions       a pointer to an array of {@link VkImageCopy} structures specifying the regions to copy
	 */
	public static void nvkCmdCopyImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImage;
		callPJJPV(__functionAddress, commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdCopyImage.html">Khronos Reference Page</a></p>
	 * 
	 * Copy data between image objects.
	 * 
	 * <p>{@code vkCmdCopyImage} performs image copies in a similar manner to a host {@code memcpy}. It does not perform general-purpose conversions such as
	 * scaling, resizing, blending, color-space conversion, or format conversions. Rather, it simply copies raw image data. {@code vkCmdCopyImage} <b>can</b> copy
	 * between images with different formats, provided the formats are compatible.</p>
	 * 
	 * <p>Each region in {@code pRegions} is copied from the source image to the same region of the destination image. {@code srcImage} and {@code dstImage} <b>can</b>
	 * be the same image or alias the same memory.</p>
	 * 
	 * <p>Copies are done layer by layer starting with {@code baseArrayLayer} member of {@code srcSubresource} for the source and {@code dstSubresource} for the
	 * destination. {@code layerCount} layers are copied to the destination image.</p>
	 * 
	 * <p>The formats of {@code srcImage} and {@code dstImage} <b>must</b> be compatible. Formats are considered compatible if their texel size in bytes is the same
	 * between both formats. For example, {@link #VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM} is compatible with {@link #VK_FORMAT_R32_UINT FORMAT_R32_UINT} because because both texels are 4 bytes in size.
	 * Depth/stencil formats <b>must</b> match exactly.</p>
	 * 
	 * <p>{@code vkCmdCopyImage} allows copying between size-compatible compressed and uncompressed internal formats. Formats are size-compatible if the texel
	 * size of the uncompressed format is equal to the block size in bytes of the compressed format. Such a copy does not perform on-the-fly compression or
	 * decompression. When copying from an uncompressed format to a compressed format, each texel of uncompressed data becomes a single block of compressed
	 * data. When copying from a compressed format to an uncompressed format, a block of compressed data becomes a single texel of uncompressed data. Thus,
	 * for example, it is legal to copy between a 128-bit uncompressed format and a compressed format which uses 8-bit/texel 4x4 blocks, or between a 64-bit
	 * uncompressed format and a compressed format which uses 4-bit/texel 4x4 blocks.</p>
	 * 
	 * <p>When copying between compressed and uncompressed formats the {@code extent} members represent the texel dimensions of the source image and not the
	 * destination. When copying from a compressed image to an uncompressed image the image texel dimensions written to the uncompressed image will be source
	 * extent divided by the block size. When copying from an uncompressed image to a compressed image the image texel dimensions written to the compressed
	 * image will be the source extent multiplied by the block size. In both cases the number of bytes read and the number of bytes written will be identical.</p>
	 * 
	 * <p>Copying to or from block-compressed images is typically done in multiples of the block. For this reason the {@code extent} <b>must</b> be a multiple of the
	 * block dimension. There is one exception to this rule which is required to handle compressed images created with dimensions that are not a multiple of
	 * the block dimensions. If the {@code srcImage is} compressed and if {@code extent.width} is not a multiple of the block width then
	 * {@code (extent.width + srcOffset.x)} <b>must</b> equal the image subresource width, if {@code extent.height} is not a multiple of the block height then
	 * {@code (extent.height + srcOffset.y)} <b>must</b> equal the image subresource height and if {@code extent.depth} is not a multiple of the block depth then
	 * {@code (extent.depth + srcOffset.z)} <b>must</b> equal the image subresource depth. Similarly if the {@code dstImage} is compressed and if
	 * {@code extent.width} is not a multiple of the block width then {@code (extent.width + dstOffset.x)} <b>must</b> equal the image subresource width, if
	 * {@code extent.height} is not a multiple of the block height then {@code (extent.height + dstOffset.y)} <b>must</b> equal the image subresource height and if
	 * {@code extent.depth} is not a multiple of the block depth then {@code (extent.depth + dstOffset.z)} <b>must</b> equal the image subresource depth. This
	 * allows the last block of the image in each non-multiple dimension to be included as a source or target of the copy.</p>
	 * 
	 * <p>{@code vkCmdCopyImage} <b>can</b> be used to copy image data between multisample images, but both images <b>must</b> have the same number of samples.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid {@link VkImageCopy} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code srcImage} and {@code dstImage} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must not</b> overlap in
	 * memory</li>
	 * <li>{@code srcImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The {@code VkFormat} of each of {@code srcImage} and {@code dstImage} <b>must</b> be compatible, as defined below</li>
	 * <li>The sample count of {@code srcImage} and {@code dstImage} <b>must</b> match</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param srcImage       the source image
	 * @param srcImageLayout the current layout of the source image subresource
	 * @param dstImage       the destination image
	 * @param dstImageLayout the current layout of the destination image subresource
	 * @param pRegions       a pointer to an array of {@link VkImageCopy} structures specifying the regions to copy
	 */
	public static void vkCmdCopyImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageCopy.Buffer pRegions) {
		nvkCmdCopyImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdBlitImage ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdBlitImage.html">Khronos Reference Page</a></p>
	 * 
	 * Copies regions of a source image into a destination image, potentially performing format conversion, arbitrary scaling, and filtering.
	 * 
	 * <p>{@code vkCmdBlitImage} <b>must not</b> be used for multisampled source or destination images. Use {@link #vkCmdResolveImage CmdResolveImage} for this purpose.</p>
	 * 
	 * <h5>Valid Usage</h5>
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
	 * <li>Each of {@code commandBuffer}, {@code srcImage} and {@code dstImage} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must not</b> overlap in
	 * memory</li>
	 * <li>{@code srcImage} <b>must</b> use a format that supports {@link #VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT}, which is indicated by
	 * {@link VkFormatProperties}{@code ::linearTilingFeatures} (for linear tiled images) or {@link VkFormatProperties}{@code ::optimalTilingFeatures} (for optimally
	 * tiled images) - as returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>{@code srcImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstImage} <b>must</b> use a format that supports {@link #VK_FORMAT_FEATURE_BLIT_DST_BIT FORMAT_FEATURE_BLIT_DST_BIT}, which is indicated by
	 * {@link VkFormatProperties}{@code ::linearTilingFeatures} (for linear tiled images) or {@link VkFormatProperties}{@code ::optimalTilingFeatures} (for optimally
	 * tiled images) - as returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>{@code dstImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The sample count of {@code srcImage} and {@code dstImage} <b>must</b> both be equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>If either of {@code srcImage} or {@code dstImage} was created with a signed integer {@code VkFormat}, the other <b>must</b> also have been created with a
	 * signed integer {@code VkFormat}</li>
	 * <li>If either of {@code srcImage} or {@code dstImage} was created with an unsigned integer {@code VkFormat}, the other <b>must</b> also have been created
	 * with an unsigned integer {@code VkFormat}</li>
	 * <li>If either of {@code srcImage} or {@code dstImage} was created with a depth/stencil format, the other <b>must</b> have exactly the same format</li>
	 * <li>If {@code srcImage} was created with a depth/stencil format, {@code filter} <b>must</b> be {@link #VK_FILTER_NEAREST FILTER_NEAREST}</li>
	 * <li>If {@code filter} is {@link #VK_FILTER_LINEAR FILTER_LINEAR}, {@code srcImage} <b>must</b> be of a format which supports linear filtering, as specified by the
	 * {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or
	 * {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param srcImage       the source image
	 * @param srcImageLayout the layout of the source image subresources for the blit
	 * @param dstImage       the destination image
	 * @param dstImageLayout the layout of the destination image subresources for the blit
	 * @param regionCount    the number of regions to blit
	 * @param pRegions       a pointer to an array of {@link VkImageBlit} structures specifying the regions to blit
	 * @param filter         a {@code VkFilter} specifying the filter to apply if the blits require scaling
	 */
	public static void nvkCmdBlitImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions, int filter) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBlitImage;
		callPJJPV(__functionAddress, commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdBlitImage.html">Khronos Reference Page</a></p>
	 * 
	 * Copies regions of a source image into a destination image, potentially performing format conversion, arbitrary scaling, and filtering.
	 * 
	 * <p>{@code vkCmdBlitImage} <b>must not</b> be used for multisampled source or destination images. Use {@link #vkCmdResolveImage CmdResolveImage} for this purpose.</p>
	 * 
	 * <h5>Valid Usage</h5>
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
	 * <li>Each of {@code commandBuffer}, {@code srcImage} and {@code dstImage} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must not</b> overlap in
	 * memory</li>
	 * <li>{@code srcImage} <b>must</b> use a format that supports {@link #VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT}, which is indicated by
	 * {@link VkFormatProperties}{@code ::linearTilingFeatures} (for linear tiled images) or {@link VkFormatProperties}{@code ::optimalTilingFeatures} (for optimally
	 * tiled images) - as returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>{@code srcImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstImage} <b>must</b> use a format that supports {@link #VK_FORMAT_FEATURE_BLIT_DST_BIT FORMAT_FEATURE_BLIT_DST_BIT}, which is indicated by
	 * {@link VkFormatProperties}{@code ::linearTilingFeatures} (for linear tiled images) or {@link VkFormatProperties}{@code ::optimalTilingFeatures} (for optimally
	 * tiled images) - as returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>{@code dstImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The sample count of {@code srcImage} and {@code dstImage} <b>must</b> both be equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>If either of {@code srcImage} or {@code dstImage} was created with a signed integer {@code VkFormat}, the other <b>must</b> also have been created with a
	 * signed integer {@code VkFormat}</li>
	 * <li>If either of {@code srcImage} or {@code dstImage} was created with an unsigned integer {@code VkFormat}, the other <b>must</b> also have been created
	 * with an unsigned integer {@code VkFormat}</li>
	 * <li>If either of {@code srcImage} or {@code dstImage} was created with a depth/stencil format, the other <b>must</b> have exactly the same format</li>
	 * <li>If {@code srcImage} was created with a depth/stencil format, {@code filter} <b>must</b> be {@link #VK_FILTER_NEAREST FILTER_NEAREST}</li>
	 * <li>If {@code filter} is {@link #VK_FILTER_LINEAR FILTER_LINEAR}, {@code srcImage} <b>must</b> be of a format which supports linear filtering, as specified by the
	 * {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} (for a linear image) or
	 * {@link VkFormatProperties}{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param srcImage       the source image
	 * @param srcImageLayout the layout of the source image subresources for the blit
	 * @param dstImage       the destination image
	 * @param dstImageLayout the layout of the destination image subresources for the blit
	 * @param pRegions       a pointer to an array of {@link VkImageBlit} structures specifying the regions to blit
	 * @param filter         a {@code VkFilter} specifying the filter to apply if the blits require scaling
	 */
	public static void vkCmdBlitImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageBlit.Buffer pRegions, int filter) {
		nvkCmdBlitImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address(), filter);
	}

	// --- [ vkCmdCopyBufferToImage ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdCopyBufferToImage.html">Khronos Reference Page</a></p>
	 * 
	 * Copies data from a buffer object to an image object.
	 * 
	 * <p>Each region in {@code pRegions} is copied from the specified region of the source buffer to the specified region of the destination image.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid {@link VkBufferImageCopy} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code srcBuffer} and {@code dstImage} <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkDevice}</li>
	 * <li>The buffer region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcBuffer}</li>
	 * <li>The image region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must not</b> overlap in
	 * memory</li>
	 * <li>{@code srcBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_SRC_BIT BUFFER_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code dstImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstImage} <b>must</b> have a sample count equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param srcBuffer      the source buffer
	 * @param dstImage       the destination image
	 * @param dstImageLayout the layout of the destination image subresources for the copy
	 * @param regionCount    the number of regions to copy
	 * @param pRegions       a pointer to an array of {@link VkBufferImageCopy} structures specifying the regions to copy
	 */
	public static void nvkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBufferToImage;
		callPJJPV(__functionAddress, commandBuffer.address(), srcBuffer, dstImage, dstImageLayout, regionCount, pRegions);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdCopyBufferToImage.html">Khronos Reference Page</a></p>
	 * 
	 * Copies data from a buffer object to an image object.
	 * 
	 * <p>Each region in {@code pRegions} is copied from the specified region of the source buffer to the specified region of the destination image.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid {@link VkBufferImageCopy} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code srcBuffer} and {@code dstImage} <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkDevice}</li>
	 * <li>The buffer region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcBuffer}</li>
	 * <li>The image region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must not</b> overlap in
	 * memory</li>
	 * <li>{@code srcBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_SRC_BIT BUFFER_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code dstImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstImage} <b>must</b> have a sample count equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param srcBuffer      the source buffer
	 * @param dstImage       the destination image
	 * @param dstImageLayout the layout of the destination image subresources for the copy
	 * @param pRegions       a pointer to an array of {@link VkBufferImageCopy} structures specifying the regions to copy
	 */
	public static void vkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, VkBufferImageCopy.Buffer pRegions) {
		nvkCmdCopyBufferToImage(commandBuffer, srcBuffer, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdCopyImageToBuffer ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdCopyImageToBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Copies data from an image object to a buffer object.
	 * 
	 * <p>Each region in {@code pRegions} is copied from the specified region of the source image to the specified region of the destination buffer.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid {@link VkBufferImageCopy} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code srcImage} and {@code dstBuffer} <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkDevice}</li>
	 * <li>The image region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The buffer region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstBuffer}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must not</b> overlap in
	 * memory</li>
	 * <li>{@code srcImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code srcImage} <b>must</b> have a sample count equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param srcImage       the source image
	 * @param srcImageLayout the layout of the source image subresources for the copy
	 * @param dstBuffer      the destination buffer
	 * @param regionCount    the number of regions to copy
	 * @param pRegions       a pointer to an array of {@link VkBufferImageCopy} structures specifying the regions to copy
	 */
	public static void nvkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, int regionCount, long pRegions) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImageToBuffer;
		callPJJPV(__functionAddress, commandBuffer.address(), srcImage, srcImageLayout, dstBuffer, regionCount, pRegions);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdCopyImageToBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Copies data from an image object to a buffer object.
	 * 
	 * <p>Each region in {@code pRegions} is copied from the specified region of the source image to the specified region of the destination buffer.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid {@link VkBufferImageCopy} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer}, {@code srcImage} and {@code dstBuffer} <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkDevice}</li>
	 * <li>The image region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The buffer region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstBuffer}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must not</b> overlap in
	 * memory</li>
	 * <li>{@code srcImage} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage flag</li>
	 * <li>{@code srcImage} <b>must</b> have a sample count equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param srcImage       the source image
	 * @param srcImageLayout the layout of the source image subresources for the copy
	 * @param dstBuffer      the destination buffer
	 * @param pRegions       a pointer to an array of {@link VkBufferImageCopy} structures specifying the regions to copy
	 */
	public static void vkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, VkBufferImageCopy.Buffer pRegions) {
		nvkCmdCopyImageToBuffer(commandBuffer, srcImage, srcImageLayout, dstBuffer, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdUpdateBuffer ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdUpdateBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Updates buffer data inline in a command buffer.
	 * 
	 * <p>The source data is copied from the user pointer to the command buffer when the command is called.</p>
	 * 
	 * <p>{@code vkCmdUpdateBuffer} is only allowed outside of a render pass. This command is treated as “transfer” operation, for the purposes of
	 * synchronization barriers. The {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} <b>must</b> be specified in usage of {@link VkBufferCreateInfo} in order for the buffer to be
	 * compatible with {@code vkCmdUpdateBuffer}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize / 4} {@code uint32_t} values</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Each of {@code commandBuffer} and {@code dstBuffer} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
	 * <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to 65536</li>
	 * <li>{@code dataSize} <b>must</b> be a multiple of 4</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param dstBuffer     a handle to the buffer to be updated
	 * @param dstOffset     the byte offset into the buffer to start updating, and <b>must</b> be a multiple of 4
	 * @param dataSize      the number of bytes to update, and <b>must</b> be a multiple of 4
	 * @param pData         a pointer to the source data for the buffer update, and <b>must</b> be at least {@code dataSize} bytes in size
	 */
	public static void nvkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long dataSize, long pData) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
		callPJJJPV(__functionAddress, commandBuffer.address(), dstBuffer, dstOffset, dataSize, pData);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdUpdateBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Updates buffer data inline in a command buffer.
	 * 
	 * <p>The source data is copied from the user pointer to the command buffer when the command is called.</p>
	 * 
	 * <p>{@code vkCmdUpdateBuffer} is only allowed outside of a render pass. This command is treated as “transfer” operation, for the purposes of
	 * synchronization barriers. The {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} <b>must</b> be specified in usage of {@link VkBufferCreateInfo} in order for the buffer to be
	 * compatible with {@code vkCmdUpdateBuffer}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize / 4} {@code uint32_t} values</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Each of {@code commandBuffer} and {@code dstBuffer} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
	 * <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code dataSize} <b>must</b> be less than or equal to 65536</li>
	 * <li>{@code dataSize} <b>must</b> be a multiple of 4</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param dstBuffer     a handle to the buffer to be updated
	 * @param dstOffset     the byte offset into the buffer to start updating, and <b>must</b> be a multiple of 4
	 * @param pData         a pointer to the source data for the buffer update, and <b>must</b> be at least {@code dataSize} bytes in size
	 */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, IntBuffer pData) {
		nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, (long)pData.remaining(), memAddress(pData));
	}

	// --- [ vkCmdFillBuffer ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdFillBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Fills a region of a buffer with a fixed value.
	 * 
	 * <p>{@code vkCmdFillBuffer} is treated as “transfer” operation for the purposes of synchronization barriers. The {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} <b>must</b> be
	 * specified in usage of {@link VkBufferCreateInfo} in order for the buffer to be compatible with {@code vkCmdFillBuffer}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Each of {@code commandBuffer} and {@code dstBuffer} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
	 * <li>If {@code size} is not equal to {@link #VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be greater than 0</li>
	 * <li>If {@code size} is not equal to {@link #VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
	 * <li>If {@code size} is not equal to {@link #VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be a multiple of 4</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param dstBuffer     the buffer to be filled
	 * @param dstOffset     the byte offset into the buffer at which to start filling, and <b>must</b> be a multiple of 4
	 * @param size          the number of bytes to fill, and <b>must</b> be either a multiple of 4, or {@link #VK_WHOLE_SIZE WHOLE_SIZE} to fill the range from offset to the end of the buffer. If
	 *                      {@link #VK_WHOLE_SIZE WHOLE_SIZE} is used and the remaining size of the buffer is not a multiple of 4, then the nearest smaller multiple is used.
	 * @param data          the 4-byte word written repeatedly to the buffer to fill size bytes of data. The data word is written to memory according to the host endianness.
	 */
	public static void vkCmdFillBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long size, int data) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdFillBuffer;
		callPJJJV(__functionAddress, commandBuffer.address(), dstBuffer, dstOffset, size, data);
	}

	// --- [ vkCmdClearColorImage ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdClearColorImage.html">Khronos Reference Page</a></p>
	 * 
	 * Clears one or more subranges of a color image.
	 * 
	 * <p>Each specified range in {@code pRanges} is cleared to the value specified by {@code pColor}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pColor} <b>must</b> be a pointer to a valid {@code VkClearColorValue} union</li>
	 * <li>{@code pRanges} <b>must</b> be a pointer to an array of {@code rangeCount} valid {@link VkImageSubresourceRange} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code rangeCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer} and {@code image} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code image} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command
	 * is executed on a {@code VkDevice}</li>
	 * <li>{@code imageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The image range of any given element of {@code pRanges} <b>must</b> be an image subresource range that is contained within {@code image}</li>
	 * <li>{@code image} <b>must not</b> have a compressed or depth/stencil format</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param image         the image to be cleared
	 * @param imageLayout   the current layout of the image subresource ranges to be cleared. One of:<br><table><tr><td>{@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</td><td>{@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}</td></tr></table>
	 * @param pColor        a pointer to a {@link VkClearColorValue} structure that contains the values the image subresource ranges will be cleared to
	 * @param rangeCount    the number of image subresource range structures in {@code pRanges}
	 * @param pRanges       points to an array of {@link VkImageSubresourceRange} structures that describe a range of mipmap levels, array layers, and aspects to be cleared. The
	 *                      {@code aspectMask} of all image subresource ranges <b>must</b> only include {@link #VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}.
	 */
	public static void nvkCmdClearColorImage(VkCommandBuffer commandBuffer, long image, int imageLayout, long pColor, int rangeCount, long pRanges) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdClearColorImage;
		callPJPPV(__functionAddress, commandBuffer.address(), image, imageLayout, pColor, rangeCount, pRanges);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdClearColorImage.html">Khronos Reference Page</a></p>
	 * 
	 * Clears one or more subranges of a color image.
	 * 
	 * <p>Each specified range in {@code pRanges} is cleared to the value specified by {@code pColor}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pColor} <b>must</b> be a pointer to a valid {@code VkClearColorValue} union</li>
	 * <li>{@code pRanges} <b>must</b> be a pointer to an array of {@code rangeCount} valid {@link VkImageSubresourceRange} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code rangeCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer} and {@code image} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code image} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command
	 * is executed on a {@code VkDevice}</li>
	 * <li>{@code imageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The image range of any given element of {@code pRanges} <b>must</b> be an image subresource range that is contained within {@code image}</li>
	 * <li>{@code image} <b>must not</b> have a compressed or depth/stencil format</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param image         the image to be cleared
	 * @param imageLayout   the current layout of the image subresource ranges to be cleared. One of:<br><table><tr><td>{@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</td><td>{@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}</td></tr></table>
	 * @param pColor        a pointer to a {@link VkClearColorValue} structure that contains the values the image subresource ranges will be cleared to
	 * @param pRanges       points to an array of {@link VkImageSubresourceRange} structures that describe a range of mipmap levels, array layers, and aspects to be cleared. The
	 *                      {@code aspectMask} of all image subresource ranges <b>must</b> only include {@link #VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}.
	 */
	public static void vkCmdClearColorImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearColorValue pColor, VkImageSubresourceRange.Buffer pRanges) {
		nvkCmdClearColorImage(commandBuffer, image, imageLayout, pColor.address(), pRanges.remaining(), pRanges.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdClearColorImage.html">Khronos Reference Page</a></p>
	 * 
	 * Clears one or more subranges of a color image.
	 * 
	 * <p>Each specified range in {@code pRanges} is cleared to the value specified by {@code pColor}.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
	 * <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
	 * <li>{@code pColor} <b>must</b> be a pointer to a valid {@code VkClearColorValue} union</li>
	 * <li>{@code pRanges} <b>must</b> be a pointer to an array of {@code rangeCount} valid {@link VkImageSubresourceRange} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code rangeCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer} and {@code image} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code image} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command
	 * is executed on a {@code VkDevice}</li>
	 * <li>{@code imageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The image range of any given element of {@code pRanges} <b>must</b> be an image subresource range that is contained within {@code image}</li>
	 * <li>{@code image} <b>must not</b> have a compressed or depth/stencil format</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param image         the image to be cleared
	 * @param imageLayout   the current layout of the image subresource ranges to be cleared. One of:<br><table><tr><td>{@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</td><td>{@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}</td></tr></table>
	 * @param pColor        a pointer to a {@link VkClearColorValue} structure that contains the values the image subresource ranges will be cleared to
	 */
	public static void vkCmdClearColorImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearColorValue pColor, VkImageSubresourceRange pRange) {
		nvkCmdClearColorImage(commandBuffer, image, imageLayout, pColor.address(), 1, pRange.address());
	}

	// --- [ vkCmdClearDepthStencilImage ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdClearDepthStencilImage.html">Khronos Reference Page</a></p>
	 * 
	 * Clears one or more subranges of a depth/stencil image.
	 * 
	 * <h5>Valid Usage</h5>
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
	 * <li>Each of {@code commandBuffer} and {@code image} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code image} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command
	 * is executed on a {@code VkDevice}</li>
	 * <li>{@code imageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The image range of any given element of {@code pRanges} <b>must</b> be an image subresource range that is contained within {@code image}</li>
	 * <li>{@code image} <b>must</b> have a depth/stencil format</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param image         the image to be cleared
	 * @param imageLayout   the current layout of the image subresource ranges to be cleared. One of:<br><table><tr><td>{@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</td><td>{@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}</td></tr></table>
	 * @param pDepthStencil a pointer to a {@link VkClearDepthStencilValue} structure that contains the values the depth and stencil image subresource ranges will be cleared to
	 * @param rangeCount    the number of image subresource range structures in {@code pRanges}
	 * @param pRanges       points to an array of {@link VkImageSubresourceRange} structures that describe a range of mipmap levels, array layers, and aspects to be cleared. The
	 *                      {@code aspectMask} of each image subresource range in {@code pRanges} <b>can</b> include {@link #VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} if the image format has a depth component, and
	 *                      {@link #VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT} if the image format has a stencil component. {@code pDepthStencil} is a pointer to a {@link VkClearDepthStencilValue} structure
	 *                      that contains the values the image subresource ranges will be cleared to.
	 */
	public static void nvkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, long image, int imageLayout, long pDepthStencil, int rangeCount, long pRanges) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdClearDepthStencilImage;
		callPJPPV(__functionAddress, commandBuffer.address(), image, imageLayout, pDepthStencil, rangeCount, pRanges);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdClearDepthStencilImage.html">Khronos Reference Page</a></p>
	 * 
	 * Clears one or more subranges of a depth/stencil image.
	 * 
	 * <h5>Valid Usage</h5>
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
	 * <li>Each of {@code commandBuffer} and {@code image} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code image} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command
	 * is executed on a {@code VkDevice}</li>
	 * <li>{@code imageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The image range of any given element of {@code pRanges} <b>must</b> be an image subresource range that is contained within {@code image}</li>
	 * <li>{@code image} <b>must</b> have a depth/stencil format</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param image         the image to be cleared
	 * @param imageLayout   the current layout of the image subresource ranges to be cleared. One of:<br><table><tr><td>{@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</td><td>{@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}</td></tr></table>
	 * @param pDepthStencil a pointer to a {@link VkClearDepthStencilValue} structure that contains the values the depth and stencil image subresource ranges will be cleared to
	 * @param pRanges       points to an array of {@link VkImageSubresourceRange} structures that describe a range of mipmap levels, array layers, and aspects to be cleared. The
	 *                      {@code aspectMask} of each image subresource range in {@code pRanges} <b>can</b> include {@link #VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} if the image format has a depth component, and
	 *                      {@link #VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT} if the image format has a stencil component. {@code pDepthStencil} is a pointer to a {@link VkClearDepthStencilValue} structure
	 *                      that contains the values the image subresource ranges will be cleared to.
	 */
	public static void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearDepthStencilValue pDepthStencil, VkImageSubresourceRange.Buffer pRanges) {
		nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), pRanges.remaining(), pRanges.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdClearDepthStencilImage.html">Khronos Reference Page</a></p>
	 * 
	 * Clears one or more subranges of a depth/stencil image.
	 * 
	 * <h5>Valid Usage</h5>
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
	 * <li>Each of {@code commandBuffer} and {@code image} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code image} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command
	 * is executed on a {@code VkDevice}</li>
	 * <li>{@code imageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>The image range of any given element of {@code pRanges} <b>must</b> be an image subresource range that is contained within {@code image}</li>
	 * <li>{@code image} <b>must</b> have a depth/stencil format</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param image         the image to be cleared
	 * @param imageLayout   the current layout of the image subresource ranges to be cleared. One of:<br><table><tr><td>{@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</td><td>{@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}</td></tr></table>
	 * @param pDepthStencil a pointer to a {@link VkClearDepthStencilValue} structure that contains the values the depth and stencil image subresource ranges will be cleared to
	 */
	public static void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, long image, int imageLayout, VkClearDepthStencilValue pDepthStencil, VkImageSubresourceRange pRange) {
		nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), 1, pRange.address());
	}

	// --- [ vkCmdClearAttachments ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdClearAttachments.html">Khronos Reference Page</a></p>
	 * 
	 * Clears one or more regions of color and depth/stencil attachments inside a render pass instance.
	 * 
	 * <p>{@code vkCmdClearAttachments} <b>can</b> clear multiple regions of each attachment used in the current subpass of a render pass instance. This command <b>must</b>
	 * be called only inside a render pass instance, and implicitly selects the images to clear based on the current framebuffer attachments and the command
	 * parameters.</p>
	 * 
	 * <p>No memory barriers are needed between {@code vkCmdClearAttachments} and preceding or subsequent draw or attachment clear commands in the same subpass.</p>
	 * 
	 * <p>The {@code vkCmdClearAttachments} command is not affected by the bound pipeline state.</p>
	 * 
	 * <p>Attachments <b>can</b> also be cleared at the beginning of a render pass instance by setting {@code loadOp} (or {@code stencilLoadOp}) of
	 * {@link VkAttachmentDescription} to {@link #VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, as described for {@link #vkCreateRenderPass CreateRenderPass}.</p>
	 * 
	 * <h5>Valid Usage</h5>
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
	 * <li>If the {@code aspectMask} member of any given element of {@code pAttachments} contains {@link #VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}, the {@code colorAttachment} member
	 * of those elements <b>must</b> refer to a valid color attachment in the current subpass</li>
	 * <li>The rectangular region specified by a given element of {@code pRects} <b>must</b> be contained within the render area of the current render pass instance</li>
	 * <li>The layers specified by a given element of {@code pRects} <b>must</b> be contained within every attachment that {@code pAttachments} refers to</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer   the command buffer into which the command will be recorded
	 * @param attachmentCount the number of entries in the {@code pAttachments} array
	 * @param pAttachments    a pointer to an array of {@link VkClearAttachment} structures defining the attachments to clear and the clear values to use
	 * @param rectCount       the number of entries in the {@code pRects} array
	 * @param pRects          points to an array of {@link VkClearRect} structures defining regions within each selected attachment to clear
	 */
	public static void nvkCmdClearAttachments(VkCommandBuffer commandBuffer, int attachmentCount, long pAttachments, int rectCount, long pRects) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdClearAttachments;
		callPPPV(__functionAddress, commandBuffer.address(), attachmentCount, pAttachments, rectCount, pRects);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdClearAttachments.html">Khronos Reference Page</a></p>
	 * 
	 * Clears one or more regions of color and depth/stencil attachments inside a render pass instance.
	 * 
	 * <p>{@code vkCmdClearAttachments} <b>can</b> clear multiple regions of each attachment used in the current subpass of a render pass instance. This command <b>must</b>
	 * be called only inside a render pass instance, and implicitly selects the images to clear based on the current framebuffer attachments and the command
	 * parameters.</p>
	 * 
	 * <p>No memory barriers are needed between {@code vkCmdClearAttachments} and preceding or subsequent draw or attachment clear commands in the same subpass.</p>
	 * 
	 * <p>The {@code vkCmdClearAttachments} command is not affected by the bound pipeline state.</p>
	 * 
	 * <p>Attachments <b>can</b> also be cleared at the beginning of a render pass instance by setting {@code loadOp} (or {@code stencilLoadOp}) of
	 * {@link VkAttachmentDescription} to {@link #VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, as described for {@link #vkCreateRenderPass CreateRenderPass}.</p>
	 * 
	 * <h5>Valid Usage</h5>
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
	 * <li>If the {@code aspectMask} member of any given element of {@code pAttachments} contains {@link #VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}, the {@code colorAttachment} member
	 * of those elements <b>must</b> refer to a valid color attachment in the current subpass</li>
	 * <li>The rectangular region specified by a given element of {@code pRects} <b>must</b> be contained within the render area of the current render pass instance</li>
	 * <li>The layers specified by a given element of {@code pRects} <b>must</b> be contained within every attachment that {@code pAttachments} refers to</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param pAttachments  a pointer to an array of {@link VkClearAttachment} structures defining the attachments to clear and the clear values to use
	 * @param pRects        points to an array of {@link VkClearRect} structures defining regions within each selected attachment to clear
	 */
	public static void vkCmdClearAttachments(VkCommandBuffer commandBuffer, VkClearAttachment.Buffer pAttachments, VkClearRect.Buffer pRects) {
		nvkCmdClearAttachments(commandBuffer, pAttachments.remaining(), pAttachments.address(), pRects.remaining(), pRects.address());
	}

	// --- [ vkCmdResolveImage ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdResolveImage.html">Khronos Reference Page</a></p>
	 * 
	 * Resolves a multisample image to a non-multisample image.
	 * 
	 * <h5>Valid Usage</h5>
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
	 * <li>Each of {@code commandBuffer}, {@code srcImage} and {@code dstImage} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must not</b> overlap in
	 * memory</li>
	 * <li>{@code srcImage} <b>must</b> have a sample count equal to any valid sample count value other than {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code dstImage} <b>must</b> have a sample count equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>If {@code dstImage} was created with {@code tiling} equal to {@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, {@code dstImage} <b>must</b> have been created with a {@code format}
	 * that supports being a color attachment, as specified by the {@link #VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in
	 * {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>If {@code dstImage} was created with {@code tiling} equal to {@link #VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code dstImage} <b>must</b> have been created with a {@code format}
	 * that supports being a color attachment, as specified by the {@link #VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in
	 * {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param srcImage       the source image
	 * @param srcImageLayout the layout of the source image subresources for the resolve
	 * @param dstImage       the destination image
	 * @param dstImageLayout the layout of the destination image subresources for the resolve
	 * @param regionCount    the number of regions to resolve
	 * @param pRegions       a pointer to an array of {@link VkImageResolve} structures specifying the regions to resolve
	 */
	public static void nvkCmdResolveImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdResolveImage;
		callPJJPV(__functionAddress, commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdResolveImage.html">Khronos Reference Page</a></p>
	 * 
	 * Resolves a multisample image to a non-multisample image.
	 * 
	 * <h5>Valid Usage</h5>
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
	 * <li>Each of {@code commandBuffer}, {@code srcImage} and {@code dstImage} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must not</b> overlap in
	 * memory</li>
	 * <li>{@code srcImage} <b>must</b> have a sample count equal to any valid sample count value other than {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code dstImage} <b>must</b> have a sample count equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>If {@code dstImage} was created with {@code tiling} equal to {@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, {@code dstImage} <b>must</b> have been created with a {@code format}
	 * that supports being a color attachment, as specified by the {@link #VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in
	 * {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>If {@code dstImage} was created with {@code tiling} equal to {@link #VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code dstImage} <b>must</b> have been created with a {@code format}
	 * that supports being a color attachment, as specified by the {@link #VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in
	 * {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param srcImage       the source image
	 * @param srcImageLayout the layout of the source image subresources for the resolve
	 * @param dstImage       the destination image
	 * @param dstImageLayout the layout of the destination image subresources for the resolve
	 * @param pRegions       a pointer to an array of {@link VkImageResolve} structures specifying the regions to resolve
	 */
	public static void vkCmdResolveImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageResolve.Buffer pRegions) {
		nvkCmdResolveImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdResolveImage.html">Khronos Reference Page</a></p>
	 * 
	 * Resolves a multisample image to a non-multisample image.
	 * 
	 * <h5>Valid Usage</h5>
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
	 * <li>Each of {@code commandBuffer}, {@code srcImage} and {@code dstImage} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
	 * <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
	 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must not</b> overlap in
	 * memory</li>
	 * <li>{@code srcImage} <b>must</b> have a sample count equal to any valid sample count value other than {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code dstImage} <b>must</b> have a sample count equal to {@link #VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
	 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code srcImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this
	 * command is executed on a {@code VkDevice}</li>
	 * <li>{@code dstImageLayout} <b>must</b> be either of {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
	 * <li>If {@code dstImage} was created with {@code tiling} equal to {@link #VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, {@code dstImage} <b>must</b> have been created with a {@code format}
	 * that supports being a color attachment, as specified by the {@link #VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in
	 * {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * <li>If {@code dstImage} was created with {@code tiling} equal to {@link #VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code dstImage} <b>must</b> have been created with a {@code format}
	 * that supports being a color attachment, as specified by the {@link #VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in
	 * {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer  the command buffer into which the command will be recorded
	 * @param srcImage       the source image
	 * @param srcImageLayout the layout of the source image subresources for the resolve
	 * @param dstImage       the destination image
	 * @param dstImageLayout the layout of the destination image subresources for the resolve
	 */
	public static void vkCmdResolveImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageResolve pRegion) {
		nvkCmdResolveImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, 1, pRegion.address());
	}

	// --- [ vkCmdSetEvent ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetEvent.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the state of an event to signaled from a device.
	 * 
	 * <p>The status of event is updated once the pipeline stages specified by {@code stageMask} have completed executing prior commands. The command modifying
	 * the event is passed through the pipeline bound to the command buffer at time of execution.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
	 * <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code stageMask} <b>must not</b> be 0</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Each of {@code commandBuffer} and {@code event} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>If the geometry shaders feature is not enabled, {@code stageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the tessellation shaders feature is not enabled, {@code stageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or
	 * {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded
	 * @param event         the event that will be signaled
	 * @param stageMask     the pipeline stage at which the state of {@code event} is updated. One or more of:<br><table><tr><td>{@link #VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT PIPELINE_STAGE_TOP_OF_PIPE_BIT}</td><td>{@link #VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT PIPELINE_STAGE_DRAW_INDIRECT_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_VERTEX_INPUT_BIT PIPELINE_STAGE_VERTEX_INPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT PIPELINE_STAGE_FRAGMENT_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT}</td><td>{@link #VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT PIPELINE_STAGE_COMPUTE_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}</td><td>{@link #VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT}</td></tr></table>
	 */
	public static void vkCmdSetEvent(VkCommandBuffer commandBuffer, long event, int stageMask) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetEvent;
		callPJV(__functionAddress, commandBuffer.address(), event, stageMask);
	}

	// --- [ vkCmdResetEvent ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdResetEvent.html">Khronos Reference Page</a></p>
	 * 
	 * Sets the state of an event to unsignaled from a device.
	 * 
	 * <p>The status of event is updated once the pipeline stages specified by {@code stageMask} have completed executing prior commands. The command modifying
	 * the event is passed through the pipeline bound to the command buffer at time of execution.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
	 * <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code stageMask} <b>must not</b> be 0</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Each of {@code commandBuffer} and {@code event} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>If the geometry shaders feature is not enabled, {@code stageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the tessellation shaders feature is not enabled, {@code stageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or
	 * {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>When this command executes, {@code event} <b>must not</b> be waited on by a {@link #vkCmdWaitEvents CmdWaitEvents} command that is currently executing</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded
	 * @param event         the event that will be reset
	 * @param stageMask     the pipeline stage at which the state of {@code event} is updated. One or more of:<br><table><tr><td>{@link #VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT PIPELINE_STAGE_TOP_OF_PIPE_BIT}</td><td>{@link #VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT PIPELINE_STAGE_DRAW_INDIRECT_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_VERTEX_INPUT_BIT PIPELINE_STAGE_VERTEX_INPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT PIPELINE_STAGE_FRAGMENT_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT}</td><td>{@link #VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT PIPELINE_STAGE_COMPUTE_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}</td><td>{@link #VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT}</td></tr></table>
	 */
	public static void vkCmdResetEvent(VkCommandBuffer commandBuffer, long event, int stageMask) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdResetEvent;
		callPJV(__functionAddress, commandBuffer.address(), event, stageMask);
	}

	// --- [ vkCmdWaitEvents ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdWaitEvents.html">Khronos Reference Page</a></p>
	 * 
	 * Waits for one or more events to enter the signaled state on a device.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pEvents} <b>must</b> be a pointer to an array of {@code eventCount} valid {@code VkEvent} handles</li>
	 * <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code srcStageMask} <b>must not</b> be 0</li>
	 * <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code dstStageMask} <b>must not</b> be 0</li>
	 * <li>If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} <b>must</b> be a pointer to an array of {@code memoryBarrierCount} valid
	 * {@link VkMemoryBarrier} structures</li>
	 * <li>If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} <b>must</b> be a pointer to an array of {@code bufferMemoryBarrierCount}
	 * valid {@link VkBufferMemoryBarrier} structures</li>
	 * <li>If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} <b>must</b> be a pointer to an array of {@code imageMemoryBarrierCount} valid
	 * {@link VkImageMemoryBarrier} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>{@code eventCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer} and the elements of {@code pEvents} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code srcStageMask} <b>must</b> be the bitwise OR of the {@code stageMask} parameter used in previous calls to {@link #vkCmdSetEvent CmdSetEvent} with any of the members of
	 * {@code pEvents} and {@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT} if any of the members of {@code pEvents} was set using {@link #vkSetEvent SetEvent}</li>
	 * <li>If the geometry shaders feature is not enabled, {@code srcStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the geometry shaders feature is not enabled, {@code dstStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the tessellation shaders feature is not enabled, {@code srcStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or
	 * {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>If the tessellation shaders feature is not enabled, {@code dstStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or
	 * {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>If {@code pEvents} includes one or more events that will be signaled by {@link #vkSetEvent SetEvent} after {@code commandBuffer} has been submitted to a queue, then
	 * {@link #vkCmdWaitEvents CmdWaitEvents} <b>must not</b> be called inside a render pass instance</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>{@code vkCmdWaitEvents} waits for events set by either {@link #vkSetEvent SetEvent} or {@link #vkCmdSetEvent CmdSetEvent} to become signaled. Logically, it has three phases:</p>
	 * 
	 * <ul>
	 * <li>Wait at the pipeline stages specified by {@code dstStageMask} until the {@code eventCount} event objects specified by {@code pEvents} become
	 * signaled. Implementations <b>may</b> wait for each event object to become signaled in sequence (starting with the first event object in {@code pEvents},
	 * and ending with the last), or wait for all of the event objects to become signaled at the same time.</li>
	 * <li>Execute the memory barriers specified by {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers}.</li>
	 * <li>Resume execution of pipeline stages specified by {@code dstStageMask}</li>
	 * </ul>
	 * 
	 * <p>Implementations may not execute commands in a pipelined manner, so {@code vkCmdWaitEvents} may not observe the results of a subsequent
	 * {@code vkCmdSetEvent} or {@code vkCmdResetEvent} command, even if the stages in {@code dstStageMask} occur after the stages in {@code srcStageMask}.</p>
	 * 
	 * <p>Commands that update the state of events in different pipeline stages <b>may</b> execute out of order, unless the ordering is enforced by execution
	 * dependencies.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>should</b> be careful to avoid race conditions when using events. For example, an event <b>should</b> only be reset if no
	 * {@code vkCmdWaitEvents} command is executing that waits upon that event.</p>
	 * </div>
	 * 
	 * <p>An act of setting or resetting an event in one queue <b>may</b> not affect or be visible to other queues. For cross-queue synchronization, semaphores <b>can</b> be
	 * used.</p>
	 *
	 * @param commandBuffer            the command buffer into which the command is recorded
	 * @param eventCount               the length of the {@code pEvents} array
	 * @param pEvents                  an array of event object handles to wait on
	 * @param srcStageMask             the bitwise OR of the pipeline stages used to signal the event object handles in {@code pEvents}. One or more of:<br><table><tr><td>{@link #VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT PIPELINE_STAGE_TOP_OF_PIPE_BIT}</td><td>{@link #VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT PIPELINE_STAGE_DRAW_INDIRECT_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_VERTEX_INPUT_BIT PIPELINE_STAGE_VERTEX_INPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT PIPELINE_STAGE_FRAGMENT_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT}</td><td>{@link #VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT PIPELINE_STAGE_COMPUTE_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}</td><td>{@link #VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT}</td></tr></table>
	 * @param dstStageMask             the pipeline stages at which the wait will occur. One or more of:<br><table><tr><td>{@link #VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT PIPELINE_STAGE_TOP_OF_PIPE_BIT}</td><td>{@link #VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT PIPELINE_STAGE_DRAW_INDIRECT_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_VERTEX_INPUT_BIT PIPELINE_STAGE_VERTEX_INPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT PIPELINE_STAGE_FRAGMENT_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT}</td><td>{@link #VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT PIPELINE_STAGE_COMPUTE_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}</td><td>{@link #VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT}</td></tr></table>
	 * @param memoryBarrierCount       the number of elements in the {@code pMemoryBarriers} array
	 * @param pMemoryBarriers          a pointer to an array of {@code memoryBarrierCount} {@link VkMemoryBarrier} structures
	 * @param bufferMemoryBarrierCount the number of elements in the {@code pBufferMemoryBarriers} array
	 * @param pBufferMemoryBarriers    a pointer to an array of {@code bufferMemoryBarrierCount} {@link VkBufferMemoryBarrier} structures
	 * @param imageMemoryBarrierCount  the number of elements in the {@code pImageMemoryBarriers} array
	 * @param pImageMemoryBarriers     a pointer to an array of {@code imageMemoryBarrierCount} {@link VkImageMemoryBarrier} structures
	 */
	public static void nvkCmdWaitEvents(VkCommandBuffer commandBuffer, int eventCount, long pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents;
		callPPPPPV(__functionAddress, commandBuffer.address(), eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdWaitEvents.html">Khronos Reference Page</a></p>
	 * 
	 * Waits for one or more events to enter the signaled state on a device.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pEvents} <b>must</b> be a pointer to an array of {@code eventCount} valid {@code VkEvent} handles</li>
	 * <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code srcStageMask} <b>must not</b> be 0</li>
	 * <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code dstStageMask} <b>must not</b> be 0</li>
	 * <li>If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} <b>must</b> be a pointer to an array of {@code memoryBarrierCount} valid
	 * {@link VkMemoryBarrier} structures</li>
	 * <li>If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} <b>must</b> be a pointer to an array of {@code bufferMemoryBarrierCount}
	 * valid {@link VkBufferMemoryBarrier} structures</li>
	 * <li>If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} <b>must</b> be a pointer to an array of {@code imageMemoryBarrierCount} valid
	 * {@link VkImageMemoryBarrier} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>{@code eventCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer} and the elements of {@code pEvents} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code srcStageMask} <b>must</b> be the bitwise OR of the {@code stageMask} parameter used in previous calls to {@link #vkCmdSetEvent CmdSetEvent} with any of the members of
	 * {@code pEvents} and {@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT} if any of the members of {@code pEvents} was set using {@link #vkSetEvent SetEvent}</li>
	 * <li>If the geometry shaders feature is not enabled, {@code srcStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the geometry shaders feature is not enabled, {@code dstStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the tessellation shaders feature is not enabled, {@code srcStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or
	 * {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>If the tessellation shaders feature is not enabled, {@code dstStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or
	 * {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>If {@code pEvents} includes one or more events that will be signaled by {@link #vkSetEvent SetEvent} after {@code commandBuffer} has been submitted to a queue, then
	 * {@link #vkCmdWaitEvents CmdWaitEvents} <b>must not</b> be called inside a render pass instance</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>{@code vkCmdWaitEvents} waits for events set by either {@link #vkSetEvent SetEvent} or {@link #vkCmdSetEvent CmdSetEvent} to become signaled. Logically, it has three phases:</p>
	 * 
	 * <ul>
	 * <li>Wait at the pipeline stages specified by {@code dstStageMask} until the {@code eventCount} event objects specified by {@code pEvents} become
	 * signaled. Implementations <b>may</b> wait for each event object to become signaled in sequence (starting with the first event object in {@code pEvents},
	 * and ending with the last), or wait for all of the event objects to become signaled at the same time.</li>
	 * <li>Execute the memory barriers specified by {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers}.</li>
	 * <li>Resume execution of pipeline stages specified by {@code dstStageMask}</li>
	 * </ul>
	 * 
	 * <p>Implementations may not execute commands in a pipelined manner, so {@code vkCmdWaitEvents} may not observe the results of a subsequent
	 * {@code vkCmdSetEvent} or {@code vkCmdResetEvent} command, even if the stages in {@code dstStageMask} occur after the stages in {@code srcStageMask}.</p>
	 * 
	 * <p>Commands that update the state of events in different pipeline stages <b>may</b> execute out of order, unless the ordering is enforced by execution
	 * dependencies.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Applications <b>should</b> be careful to avoid race conditions when using events. For example, an event <b>should</b> only be reset if no
	 * {@code vkCmdWaitEvents} command is executing that waits upon that event.</p>
	 * </div>
	 * 
	 * <p>An act of setting or resetting an event in one queue <b>may</b> not affect or be visible to other queues. For cross-queue synchronization, semaphores <b>can</b> be
	 * used.</p>
	 *
	 * @param commandBuffer         the command buffer into which the command is recorded
	 * @param pEvents               an array of event object handles to wait on
	 * @param srcStageMask          the bitwise OR of the pipeline stages used to signal the event object handles in {@code pEvents}. One or more of:<br><table><tr><td>{@link #VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT PIPELINE_STAGE_TOP_OF_PIPE_BIT}</td><td>{@link #VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT PIPELINE_STAGE_DRAW_INDIRECT_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_VERTEX_INPUT_BIT PIPELINE_STAGE_VERTEX_INPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT PIPELINE_STAGE_FRAGMENT_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT}</td><td>{@link #VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT PIPELINE_STAGE_COMPUTE_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}</td><td>{@link #VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT}</td></tr></table>
	 * @param dstStageMask          the pipeline stages at which the wait will occur. One or more of:<br><table><tr><td>{@link #VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT PIPELINE_STAGE_TOP_OF_PIPE_BIT}</td><td>{@link #VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT PIPELINE_STAGE_DRAW_INDIRECT_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_VERTEX_INPUT_BIT PIPELINE_STAGE_VERTEX_INPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT PIPELINE_STAGE_FRAGMENT_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT}</td><td>{@link #VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT PIPELINE_STAGE_COMPUTE_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}</td><td>{@link #VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT}</td></tr></table>
	 * @param pMemoryBarriers       a pointer to an array of {@code memoryBarrierCount} {@link VkMemoryBarrier} structures
	 * @param pBufferMemoryBarriers a pointer to an array of {@code bufferMemoryBarrierCount} {@link VkBufferMemoryBarrier} structures
	 * @param pImageMemoryBarriers  a pointer to an array of {@code imageMemoryBarrierCount} {@link VkImageMemoryBarrier} structures
	 */
	public static void vkCmdWaitEvents(VkCommandBuffer commandBuffer, LongBuffer pEvents, int srcStageMask, int dstStageMask, VkMemoryBarrier.Buffer pMemoryBarriers, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
		nvkCmdWaitEvents(commandBuffer, pEvents.remaining(), memAddress(pEvents), srcStageMask, dstStageMask, pMemoryBarriers == null ? 0 : pMemoryBarriers.remaining(), pMemoryBarriers == null ? NULL : pMemoryBarriers.address(), pBufferMemoryBarriers == null ? 0 : pBufferMemoryBarriers.remaining(), pBufferMemoryBarriers == null ? NULL : pBufferMemoryBarriers.address(), pImageMemoryBarriers == null ? 0 : pImageMemoryBarriers.remaining(), pImageMemoryBarriers == null ? NULL : pImageMemoryBarriers.address());
	}

	// --- [ vkCmdPipelineBarrier ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPipelineBarrier.html">Khronos Reference Page</a></p>
	 * 
	 * Records a pipeline barrier.
	 * 
	 * <p>A pipeline barrier inserts an execution dependency and a set of memory dependencies between a set of commands earlier in the command buffer and a set
	 * of commands later in the command buffer.</p>
	 * 
	 * <p>Each element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers} arrays specifies two halves of a memory
	 * dependency, as defined above. Specifics of each type of memory barrier and the memory access types are defined further in Memory Barriers.</p>
	 * 
	 * <p>If {@code vkCmdPipelineBarrier} is called outside a render pass instance, then the first set of commands is all prior commands submitted to the queue
	 * and recorded in the command buffer and the second set of commands is all subsequent commands recorded in the command buffer and submitted to the queue.
	 * If {@code vkCmdPipelineBarrier} is called inside a render pass instance, then the first set of commands is all prior commands in the same subpass and
	 * the second set of commands is all subsequent commands in the same subpass.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code srcStageMask} <b>must not</b> be 0</li>
	 * <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code dstStageMask} <b>must not</b> be 0</li>
	 * <li>{@code dependencyFlags} <b>must</b> be a valid combination of {@code VkDependencyFlagBits} values</li>
	 * <li>If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} <b>must</b> be a pointer to an array of {@code memoryBarrierCount} valid
	 * {@link VkMemoryBarrier} structures</li>
	 * <li>If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} <b>must</b> be a pointer to an array of {@code bufferMemoryBarrierCount}
	 * valid {@link VkBufferMemoryBarrier} structures</li>
	 * <li>If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} <b>must</b> be a pointer to an array of {@code imageMemoryBarrierCount} valid
	 * {@link VkImageMemoryBarrier} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>If the geometry shaders feature is not enabled, {@code srcStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the geometry shaders feature is not enabled, {@code dstStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the tessellation shaders feature is not enabled, {@code srcStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or
	 * {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>If the tessellation shaders feature is not enabled, {@code dstStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or
	 * {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>If {@link #vkCmdPipelineBarrier CmdPipelineBarrier} is called within a render pass instance, the render pass <b>must</b> declare at least one self-dependency from the current
	 * subpass to itself - see Subpass Self-dependency</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer            the command buffer into which the command is recorded
	 * @param srcStageMask             a bitmask of {@code VkPipelineStageFlagBits} specifying a set of source pipeline stages. One or more of:<br><table><tr><td>{@link #VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT PIPELINE_STAGE_TOP_OF_PIPE_BIT}</td><td>{@link #VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT PIPELINE_STAGE_DRAW_INDIRECT_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_VERTEX_INPUT_BIT PIPELINE_STAGE_VERTEX_INPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT PIPELINE_STAGE_FRAGMENT_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT}</td><td>{@link #VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT PIPELINE_STAGE_COMPUTE_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}</td><td>{@link #VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT}</td></tr></table>
	 * @param dstStageMask             a bitmask specifying a set of destination pipeline stages.
	 *                                 
	 *                                 <p>The pipeline barrier specifies an execution dependency such that all work performed by the set of pipeline stages included in {@code srcStageMask}
	 *                                 of the first set of commands completes before any work performed by the set of pipeline stages included in {@code dstStageMask} of the second set
	 *                                 of commands begins. One or more of:<br></p><table><tr><td>{@link #VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT PIPELINE_STAGE_TOP_OF_PIPE_BIT}</td><td>{@link #VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT PIPELINE_STAGE_DRAW_INDIRECT_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_VERTEX_INPUT_BIT PIPELINE_STAGE_VERTEX_INPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT PIPELINE_STAGE_FRAGMENT_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT}</td><td>{@link #VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT PIPELINE_STAGE_COMPUTE_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}</td><td>{@link #VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT}</td></tr></table>
	 * @param dependencyFlags          a bitmask of {@code VkDependencyFlagBits}. The execution dependency is by-region if the mask includes {@link #VK_DEPENDENCY_BY_REGION_BIT DEPENDENCY_BY_REGION_BIT}. One or more of:<br><table><tr><td>{@link #VK_DEPENDENCY_BY_REGION_BIT DEPENDENCY_BY_REGION_BIT}</td></tr></table>
	 * @param memoryBarrierCount       the length of the {@code pMemoryBarriers} array
	 * @param pMemoryBarriers          a pointer to an array of {@link VkMemoryBarrier} structures
	 * @param bufferMemoryBarrierCount the length of the {@code pBufferMemoryBarriers} array
	 * @param pBufferMemoryBarriers    a pointer to an array of {@link VkBufferMemoryBarrier} structures
	 * @param imageMemoryBarrierCount  the length of the {@code pImageMemoryBarriers} array
	 * @param pImageMemoryBarriers     a pointer to an array of {@link VkImageMemoryBarrier} structures
	 */
	public static void nvkCmdPipelineBarrier(VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPipelineBarrier;
		callPPPPV(__functionAddress, commandBuffer.address(), srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPipelineBarrier.html">Khronos Reference Page</a></p>
	 * 
	 * Records a pipeline barrier.
	 * 
	 * <p>A pipeline barrier inserts an execution dependency and a set of memory dependencies between a set of commands earlier in the command buffer and a set
	 * of commands later in the command buffer.</p>
	 * 
	 * <p>Each element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers} arrays specifies two halves of a memory
	 * dependency, as defined above. Specifics of each type of memory barrier and the memory access types are defined further in Memory Barriers.</p>
	 * 
	 * <p>If {@code vkCmdPipelineBarrier} is called outside a render pass instance, then the first set of commands is all prior commands submitted to the queue
	 * and recorded in the command buffer and the second set of commands is all subsequent commands recorded in the command buffer and submitted to the queue.
	 * If {@code vkCmdPipelineBarrier} is called inside a render pass instance, then the first set of commands is all prior commands in the same subpass and
	 * the second set of commands is all subsequent commands in the same subpass.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code srcStageMask} <b>must not</b> be 0</li>
	 * <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
	 * <li>{@code dstStageMask} <b>must not</b> be 0</li>
	 * <li>{@code dependencyFlags} <b>must</b> be a valid combination of {@code VkDependencyFlagBits} values</li>
	 * <li>If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} <b>must</b> be a pointer to an array of {@code memoryBarrierCount} valid
	 * {@link VkMemoryBarrier} structures</li>
	 * <li>If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} <b>must</b> be a pointer to an array of {@code bufferMemoryBarrierCount}
	 * valid {@link VkBufferMemoryBarrier} structures</li>
	 * <li>If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} <b>must</b> be a pointer to an array of {@code imageMemoryBarrierCount} valid
	 * {@link VkImageMemoryBarrier} structures</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>If the geometry shaders feature is not enabled, {@code srcStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the geometry shaders feature is not enabled, {@code dstStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
	 * <li>If the tessellation shaders feature is not enabled, {@code srcStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or
	 * {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>If the tessellation shaders feature is not enabled, {@code dstStageMask} <b>must not</b> contain {@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or
	 * {@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
	 * <li>If {@link #vkCmdPipelineBarrier CmdPipelineBarrier} is called within a render pass instance, the render pass <b>must</b> declare at least one self-dependency from the current
	 * subpass to itself - see Subpass Self-dependency</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer         the command buffer into which the command is recorded
	 * @param srcStageMask          a bitmask of {@code VkPipelineStageFlagBits} specifying a set of source pipeline stages. One or more of:<br><table><tr><td>{@link #VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT PIPELINE_STAGE_TOP_OF_PIPE_BIT}</td><td>{@link #VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT PIPELINE_STAGE_DRAW_INDIRECT_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_VERTEX_INPUT_BIT PIPELINE_STAGE_VERTEX_INPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT PIPELINE_STAGE_FRAGMENT_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT}</td><td>{@link #VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT PIPELINE_STAGE_COMPUTE_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}</td><td>{@link #VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT}</td></tr></table>
	 * @param dstStageMask          a bitmask specifying a set of destination pipeline stages.
	 *                              
	 *                              <p>The pipeline barrier specifies an execution dependency such that all work performed by the set of pipeline stages included in {@code srcStageMask}
	 *                              of the first set of commands completes before any work performed by the set of pipeline stages included in {@code dstStageMask} of the second set
	 *                              of commands begins. One or more of:<br></p><table><tr><td>{@link #VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT PIPELINE_STAGE_TOP_OF_PIPE_BIT}</td><td>{@link #VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT PIPELINE_STAGE_DRAW_INDIRECT_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_VERTEX_INPUT_BIT PIPELINE_STAGE_VERTEX_INPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT PIPELINE_STAGE_FRAGMENT_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT}</td><td>{@link #VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT PIPELINE_STAGE_COMPUTE_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}</td><td>{@link #VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT}</td></tr></table>
	 * @param dependencyFlags       a bitmask of {@code VkDependencyFlagBits}. The execution dependency is by-region if the mask includes {@link #VK_DEPENDENCY_BY_REGION_BIT DEPENDENCY_BY_REGION_BIT}. One or more of:<br><table><tr><td>{@link #VK_DEPENDENCY_BY_REGION_BIT DEPENDENCY_BY_REGION_BIT}</td></tr></table>
	 * @param pMemoryBarriers       a pointer to an array of {@link VkMemoryBarrier} structures
	 * @param pBufferMemoryBarriers a pointer to an array of {@link VkBufferMemoryBarrier} structures
	 * @param pImageMemoryBarriers  a pointer to an array of {@link VkImageMemoryBarrier} structures
	 */
	public static void vkCmdPipelineBarrier(VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, VkMemoryBarrier.Buffer pMemoryBarriers, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
		nvkCmdPipelineBarrier(commandBuffer, srcStageMask, dstStageMask, dependencyFlags, pMemoryBarriers == null ? 0 : pMemoryBarriers.remaining(), pMemoryBarriers == null ? NULL : pMemoryBarriers.address(), pBufferMemoryBarriers == null ? 0 : pBufferMemoryBarriers.remaining(), pBufferMemoryBarriers == null ? NULL : pBufferMemoryBarriers.address(), pImageMemoryBarriers == null ? 0 : pImageMemoryBarriers.remaining(), pImageMemoryBarriers == null ? NULL : pImageMemoryBarriers.address());
	}

	// --- [ vkCmdBeginQuery ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdBeginQuery.html">Khronos Reference Page</a></p>
	 * 
	 * Begins a query.
	 * 
	 * <p>Once queries are reset and ready for use, query commands <b>can</b> be issued to a command buffer. Occlusion queries and pipeline statistics queries count
	 * events - drawn samples and pipeline stage invocations, respectively - resulting from commands that are recorded between a {@code vkCmdBeginQuery}
	 * command and a {@link #vkCmdEndQuery CmdEndQuery} command within a specified command buffer, effectively scoping a set of drawing and/or compute commands. Timestamp queries
	 * write timestamps to a query pool.</p>
	 * 
	 * <p>A query <b>must</b> begin and end in the same command buffer, although if it is a primary command buffer, and the inherited queries feature is enabled, it
	 * <b>can</b> execute secondary command buffers during the query operation. For a secondary command buffer to be executed while a query is active, it <b>must</b> set
	 * the {@code occlusionQueryEnable}, {@code queryFlags}, and/or {@code pipelineStatistics} members of {@link VkCommandBufferBeginInfo} to conservative values. A
	 * query <b>must</b> either begin and end inside the same subpass of a render pass instance, or <b>must</b> both begin and end outside of a render pass instance (i.e.
	 * contain entire render pass instances).</p>
	 * 
	 * <p>If the {@code queryType} of the pool is {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} and flags contains {@link #VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT}, an implementation <b>must</b> return a result
	 * that matches the actual number of samples passed.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryControlFlagBits} values</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>Each of {@code commandBuffer} and {@code queryPool} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>The query identified by {@code queryPool} and {@code query} <b>must</b> currently not be active</li>
	 * <li>The query identified by {@code queryPool} and {@code query} <b>must</b> be unavailable</li>
	 * <li>If the precise occlusion queries feature is not enabled, or the {@code queryType} used to create {@code queryPool} was not {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION},
	 * {@code flags} <b>must not</b> contain {@link #VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT}</li>
	 * <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} that differs from that of any other queries that have been made active, and are
	 * currently still active within {@code commandBuffer}</li>
	 * <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
	 * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION}, the {@code VkCommandPool} that {@code commandBuffer} was
	 * created from <b>must</b> support graphics operations</li>
	 * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} and any of the {@code pipelineStatistics} indicate
	 * graphics operations, the {@code VkCommandPool} that {@code commandBuffer} was created from <b>must</b> support graphics operations</li>
	 * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} and any of the {@code pipelineStatistics} indicate
	 * compute operations, the {@code VkCommandPool} that {@code commandBuffer} was created from <b>must</b> support compute operations</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>After beginning a query, that query is considered active within the command buffer it was called in until that same query is ended. Queries active in a
	 * primary command buffer when secondary command buffers are executed are considered active for those secondary command buffers.</p>
	 *
	 * @param commandBuffer the command buffer into which this command will be recorded
	 * @param queryPool     the query pool that will manage the results of the query
	 * @param query         the query index within the query pool that will contain the results
	 * @param flags         a bitmask indicating constraints on the types of queries that <b>can</b> be performed. One or more of:<br><table><tr><td>{@link #VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT}</td></tr></table>
	 */
	public static void vkCmdBeginQuery(VkCommandBuffer commandBuffer, long queryPool, int query, int flags) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginQuery;
		callPJV(__functionAddress, commandBuffer.address(), queryPool, query, flags);
	}

	// --- [ vkCmdEndQuery ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdEndQuery.html">Khronos Reference Page</a></p>
	 * 
	 * Ends a query.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>Each of {@code commandBuffer} and {@code queryPool} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>The query identified by {@code queryPool} and {@code query} <b>must</b> currently be active</li>
	 * <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>As queries operate asynchronously, ending a query does not immediately set the query’s status to available. A query is considered finished when the
	 * final results of the query are ready to be retrieved by {@link #vkGetQueryPoolResults GetQueryPoolResults} and {@link #vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults}, and this is when the query’s status is
	 * set to available.</p>
	 * 
	 * <p>Once a query is ended the query <b>must</b> finish in finite time, unless the state of the query is changed using other commands, e.g. by issuing a reset of
	 * the query.</p>
	 * 
	 * <p>An application <b>can</b> retrieve results either by requesting they be written into application-provided memory, or by requesting they be copied into a
	 * {@code VkBuffer}. In either case, the layout in memory is defined as follows:</p>
	 * 
	 * <ul>
	 * <li>The first query’s result is written starting at the first byte requested by the command, and each subsequent query’s result begins stride bytes
	 * later.</li>
	 * <li>Each query’s result is a tightly packed array of unsigned integers, either 32- or 64-bits as requested by the command, storing the numerical
	 * results and, if requested, the availability status.</li>
	 * <li>If {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is used, the final element of each query’s result is an integer indicating whether the query’s result is
	 * available, with any non-zero value indicating that it is available.</li>
	 * <li>Occlusion queries write one integer value - the number of samples passed. Pipeline statistics queries write one integer value for each bit that is
	 * enabled in the {@code pipelineStatistics} when the pool is created, and the statistics values are written in bit order starting from the least
	 * significant bit. Timestamps write one integer value.</li>
	 * <li>If more than one query is retrieved and stride is not at least as large as the size of the array of integers corresponding to a single query, the
	 * values written to memory are undefined.</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which this command will be recorded
	 * @param queryPool     the query pool that is managing the results of the query
	 * @param query         the query index within the query pool where the result is stored
	 */
	public static void vkCmdEndQuery(VkCommandBuffer commandBuffer, long queryPool, int query) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdEndQuery;
		callPJV(__functionAddress, commandBuffer.address(), queryPool, query);
	}

	// --- [ vkCmdResetQueryPool ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdResetQueryPool.html">Khronos Reference Page</a></p>
	 * 
	 * Resets a range of queries in a query pool.
	 * 
	 * <p>When executed on a queue, this command sets the status of query indices {@code firstQuery}, {@code firstQuery + queryCount − 1} to unavailable.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Each of {@code commandBuffer} and {@code queryPool} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
	 * <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which this command will be recorded
	 * @param queryPool     the handle of the query pool managing the queries being reset
	 * @param firstQuery    the initial query index to reset
	 * @param queryCount    the number of queries to reset
	 */
	public static void vkCmdResetQueryPool(VkCommandBuffer commandBuffer, long queryPool, int firstQuery, int queryCount) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdResetQueryPool;
		callPJV(__functionAddress, commandBuffer.address(), queryPool, firstQuery, queryCount);
	}

	// --- [ vkCmdWriteTimestamp ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdWriteTimestamp.html">Khronos Reference Page</a></p>
	 * 
	 * Writes a device timestamp into a query object.
	 * 
	 * <p>Timestamps provide applications with a mechanism for timing the execution of commands. A timestamp is an integer value generated by the
	 * {@code VkPhysicalDevice}. Unlike other queries, timestamps do not operate over a range, and so do not use {@link #vkCmdBeginQuery CmdBeginQuery} or {@link #vkCmdEndQuery CmdEndQuery}. The
	 * mechanism is built around a set of commands that allow the application to tell the {@code VkPhysicalDevice} to write timestamp values to a query pool
	 * and then either read timestamp values on the host (using {@link #vkGetQueryPoolResults GetQueryPoolResults}) or copy timestamp values to a {@code VkBuffer} (using
	 * {@link #vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults}). The application <b>can</b> then compute differences between timestamps to determine execution time.</p>
	 * 
	 * <p>The number of valid bits in a timestamp value is determined by the {@link VkQueueFamilyProperties}{@code ::timestampValidBits} property of the queue on which
	 * the timestamp is written. Timestamps are supported on any queue which reports a non-zero value for {@code timestampValidBits} via
	 * {@link #vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}. If the {@code timestampComputeAndGraphics} limit is {@link #VK_TRUE TRUE}, timestamps are supported by every queue family
	 * that supports either graphics or compute operations (see {@link VkQueueFamilyProperties}).</p>
	 * 
	 * <p>The number of nanoseconds it takes for a timestamp value to be incremented by 1 <b>can</b> be obtained from {@link VkPhysicalDeviceLimits}{@code ::timestampPeriod}
	 * after a call to {@link #vkGetPhysicalDeviceProperties GetPhysicalDeviceProperties}.</p>
	 * 
	 * <p>{@code vkCmdWriteTimestamp} latches the value of the timer when all previous commands have completed executing as far as the specified pipeline stage,
	 * and writes the timestamp value to memory. When the timestamp value is written, the availability status of the query is set to available.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>If an implementation is unable to detect completion and latch the timer at any specific stage of the pipeline, it <b>may</b> instead do so at any
	 * logically later stage.</p>
	 * </div>
	 * 
	 * <p>{@link #vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults} <b>can</b> then be called to copy the timestamp value from the query pool into buffer memory, with ordering and synchronization
	 * behavior equivalent to how other queries operate. Timestamp values <b>can</b> also be retrieved from the query pool using {@link #vkGetQueryPoolResults GetQueryPoolResults}. As with
	 * other queries, the query <b>must</b> be reset using {@link #vkCmdResetQueryPool CmdResetQueryPool} before requesting the timestamp value be written to it.</p>
	 * 
	 * <p>While {@code vkCmdWriteTimestamp} <b>can</b> be called inside or outside of a render pass instance, {@link #vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults} <b>must</b> only be called outside of
	 * a render pass instance.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pipelineStage} <b>must</b> be a valid {@code VkPipelineStageFlagBits} value</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>Each of {@code commandBuffer} and {@code queryPool} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>The query identified by {@code queryPool} and {@code query} <b>must</b> be {@code unavailable}</li>
	 * <li>The command pool's queue family <b>must</b> support a non-zero {@code timestampValidBits}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command will be recorded
	 * @param pipelineStage one of the {@code VkPipelineStageFlagBits}, specifying a stage of the pipeline. One of:<br><table><tr><td>{@link #VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT PIPELINE_STAGE_TOP_OF_PIPE_BIT}</td><td>{@link #VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT PIPELINE_STAGE_DRAW_INDIRECT_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_VERTEX_INPUT_BIT PIPELINE_STAGE_VERTEX_INPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT PIPELINE_STAGE_FRAGMENT_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT}</td><td>{@link #VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}</td><td>{@link #VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT PIPELINE_STAGE_COMPUTE_SHADER_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</td><td>{@link #VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}</td><td>{@link #VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}</td></tr><tr><td>{@link #VK_PIPELINE_STAGE_ALL_COMMANDS_BIT PIPELINE_STAGE_ALL_COMMANDS_BIT}</td></tr></table>
	 * @param queryPool     the query pool that will manage the timestamp
	 * @param query         the query within the query pool that will contain the timestamp
	 */
	public static void vkCmdWriteTimestamp(VkCommandBuffer commandBuffer, int pipelineStage, long queryPool, int query) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteTimestamp;
		callPJV(__functionAddress, commandBuffer.address(), pipelineStage, queryPool, query);
	}

	// --- [ vkCmdCopyQueryPoolResults ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdCopyQueryPoolResults.html">Khronos Reference Page</a></p>
	 * 
	 * Copies query statuses and numerical results directly to buffer memory.
	 * 
	 * <p>{@code vkCmdCopyQueryPoolResults} is guaranteed to see the effect of previous uses of {@link #vkCmdResetQueryPool CmdResetQueryPool} in the same queue, without any additional
	 * synchronization. Thus, the results will always reflect the most recent use of the query.</p>
	 * 
	 * <p>{@code flags} has the same possible values described above for the flags parameter of {@link #vkGetQueryPoolResults GetQueryPoolResults}, but the different style of execution
	 * causes some subtle behavioral differences. Because {@code vkCmdCopyQueryPoolResults} executes in order with respect to other query commands, there is
	 * less ambiguity about which use of a query is being requested.</p>
	 * 
	 * <p>If no bits are set in flags, results for all requested queries in the available state are written as 32-bit unsigned integer values, and nothing is
	 * written for queries in the unavailable state.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is set, the results are written as an array of 64-bit unsigned integer values as described for {@code vkGetQueryPoolResults}.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is set, the implementation will wait for each query’s status to be in the available state before retrieving the numerical
	 * results for that query. This is guaranteed to reflect the most recent use of the query on the same queue, assuming that the query is not being
	 * simultaneously used by other queues. If the query does not become available in a finite amount of time (e.g. due to not issuing a query since the last
	 * reset), a {@link #VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST} error <b>may</b> occur.</p>
	 * 
	 * <p>Similarly, if {@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} is set and {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is not set, the availability is guaranteed to reflect the most
	 * recent use of the query on the same queue, assuming that the query is not being simultaneously used by other queues. As with
	 * {@code vkGetQueryPoolResults}, implementations <b>must</b> guarantee that if they return a non-zero availability value, then the numerical results are valid.</p>
	 * 
	 * <p>If {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} is set, {@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT} is not set, and the query’s status is unavailable, an intermediate result value between
	 * zero and the final result value is written for that query.</p>
	 * 
	 * <p>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT} <b>must not</b> be used if the pool’s {@code queryType} is {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}.</p>
	 * 
	 * <p>{@code vkCmdCopyQueryPoolResults} is considered to be a transfer operation, and its writes to buffer memory <b>must</b> be synchronized using
	 * {@link #VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT} and {@link #VK_ACCESS_TRANSFER_WRITE_BIT ACCESS_TRANSFER_WRITE_BIT} before using the results.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
	 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryResultFlagBits} values</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>Each of {@code commandBuffer}, {@code queryPool} and {@code dstBuffer} <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkDevice}</li>
	 * <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
	 * <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
	 * <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is not set in {@code flags} then {@code dstOffset} and {@code stride} <b>must</b> be multiples of 4</li>
	 * <li>If {@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT} is set in {@code flags} then {@code dstOffset} and {@code stride} <b>must</b> be multiples of 8</li>
	 * <li>{@code dstBuffer} <b>must</b> have enough storage, from {@code dstOffset}, to contain the result of each query, as described here</li>
	 * <li>{@code dstBuffer} <b>must</b> have been created with {@link #VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
	 * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}, {@code flags} <b>must not</b> contain {@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>Rendering operations such as clears, MSAA resolves, attachment load/store operations, and blits <b>may</b> count towards the results of queries. This
	 * behavior is implementation-dependent and <b>may</b> vary depending on the path used within an implementation. For example, some implementations have several
	 * types of clears, some of which <b>may</b> include vertices and some not.</p>
	 *
	 * @param commandBuffer the command buffer into which this command will be recorded
	 * @param queryPool     the query pool managing the queries containing the desired results
	 * @param firstQuery    the initial query index
	 * @param queryCount    the number of queries. {@code firstQuery} and {@code queryCount} together define a range of queries
	 * @param dstBuffer     a {@code VkBuffer} object that will receive the results of the copy command
	 * @param dstOffset     an offset into {@code dstBuffer}
	 * @param stride        the stride in bytes between results for individual queries within {@code dstBuffer}
	 * @param flags         a bitmask of {@code VkQueryResultFlagBits} specifying how and when results are returned. One or more of:<br><table><tr><td>{@link #VK_QUERY_RESULT_64_BIT QUERY_RESULT_64_BIT}</td><td>{@link #VK_QUERY_RESULT_WAIT_BIT QUERY_RESULT_WAIT_BIT}</td><td>{@link #VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT}</td></tr><tr><td>{@link #VK_QUERY_RESULT_PARTIAL_BIT QUERY_RESULT_PARTIAL_BIT}</td></tr></table>
	 */
	public static void vkCmdCopyQueryPoolResults(VkCommandBuffer commandBuffer, long queryPool, int firstQuery, int queryCount, long dstBuffer, long dstOffset, long stride, int flags) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyQueryPoolResults;
		callPJJJJV(__functionAddress, commandBuffer.address(), queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags);
	}

	// --- [ vkCmdPushConstants ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPushConstants.html">Khronos Reference Page</a></p>
	 * 
	 * Updates the values of push constants.
	 * 
	 * <p>The pipeline layout defines shader push constants which are updated via Vulkan commands rather than via writes to memory or copy commands.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Push constants represent a high speed path to modify constant data in pipelines that is expected to outperform memory-backed resource updates.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
	 * <li>{@code stageFlags} <b>must not</b> be 0</li>
	 * <li>{@code pValues} <b>must</b> be a pointer to an array of {@code size} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>{@code size} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer} and {@code layout} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code stageFlags} <b>must</b> match exactly the shader stages used in {@code layout} for the range specified by {@code offset} and {@code size}</li>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code size} <b>must</b> be a multiple of 4</li>
	 * <li>{@code offset} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize}</li>
	 * <li>{@code size} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize} minus {@code offset}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer in which the push constant update will be recorded
	 * @param layout        the pipeline layout used to program the push constant updates
	 * @param stageFlags    a bitmask of {@code VkShaderStageFlagBits} specifying the shader stages that will use the push constants in the updated range. One or more of:<br><table><tr><td>{@link #VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}</td><td>{@link #VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}</td></tr><tr><td>{@link #VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}</td><td>{@link #VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}</td></tr><tr><td>{@link #VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}</td><td>{@link #VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}</td></tr><tr><td>{@link #VK_SHADER_STAGE_ALL_GRAPHICS SHADER_STAGE_ALL_GRAPHICS}</td><td>{@link #VK_SHADER_STAGE_ALL SHADER_STAGE_ALL}</td></tr></table>
	 * @param offset        the start offset of the push constant range to update, in units of bytes
	 * @param size          the size of the push constant range to update, in units of bytes
	 * @param pValues       an array of {@code size} bytes containing the new push constant values
	 */
	public static void nvkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, int size, long pValues) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
		callPJPV(__functionAddress, commandBuffer.address(), layout, stageFlags, offset, size, pValues);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPushConstants.html">Khronos Reference Page</a></p>
	 * 
	 * Updates the values of push constants.
	 * 
	 * <p>The pipeline layout defines shader push constants which are updated via Vulkan commands rather than via writes to memory or copy commands.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Push constants represent a high speed path to modify constant data in pipelines that is expected to outperform memory-backed resource updates.</p>
	 * </div>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
	 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
	 * <li>{@code stageFlags} <b>must not</b> be 0</li>
	 * <li>{@code pValues} <b>must</b> be a pointer to an array of {@code size} bytes</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>{@code size} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer} and {@code layout} <b>must</b> have been created, allocated or retrieved from the same {@code VkDevice}</li>
	 * <li>{@code stageFlags} <b>must</b> match exactly the shader stages used in {@code layout} for the range specified by {@code offset} and {@code size}</li>
	 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
	 * <li>{@code size} <b>must</b> be a multiple of 4</li>
	 * <li>{@code offset} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize}</li>
	 * <li>{@code size} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize} minus {@code offset}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer in which the push constant update will be recorded
	 * @param layout        the pipeline layout used to program the push constant updates
	 * @param stageFlags    a bitmask of {@code VkShaderStageFlagBits} specifying the shader stages that will use the push constants in the updated range. One or more of:<br><table><tr><td>{@link #VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}</td><td>{@link #VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}</td></tr><tr><td>{@link #VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}</td><td>{@link #VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}</td></tr><tr><td>{@link #VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}</td><td>{@link #VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}</td></tr><tr><td>{@link #VK_SHADER_STAGE_ALL_GRAPHICS SHADER_STAGE_ALL_GRAPHICS}</td><td>{@link #VK_SHADER_STAGE_ALL SHADER_STAGE_ALL}</td></tr></table>
	 * @param offset        the start offset of the push constant range to update, in units of bytes
	 * @param pValues       an array of {@code size} bytes containing the new push constant values
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, ByteBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining(), memAddress(pValues));
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPushConstants.html">Khronos Reference Page</a></p>
	 * 
	 * ShortBuffer version of: {@link #vkCmdPushConstants CmdPushConstants}
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, ShortBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 1, memAddress(pValues));
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPushConstants.html">Khronos Reference Page</a></p>
	 * 
	 * IntBuffer version of: {@link #vkCmdPushConstants CmdPushConstants}
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, IntBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 2, memAddress(pValues));
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPushConstants.html">Khronos Reference Page</a></p>
	 * 
	 * LongBuffer version of: {@link #vkCmdPushConstants CmdPushConstants}
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, LongBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 3, memAddress(pValues));
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPushConstants.html">Khronos Reference Page</a></p>
	 * 
	 * FloatBuffer version of: {@link #vkCmdPushConstants CmdPushConstants}
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, FloatBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 2, memAddress(pValues));
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPushConstants.html">Khronos Reference Page</a></p>
	 * 
	 * DoubleBuffer version of: {@link #vkCmdPushConstants CmdPushConstants}
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, DoubleBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 3, memAddress(pValues));
	}

	// --- [ vkCmdBeginRenderPass ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdBeginRenderPass.html">Khronos Reference Page</a></p>
	 * 
	 * Begins a render pass instance.
	 * 
	 * <p>An application records the commands for a render pass instance one subpass at a time, by beginning a render pass instance, iterating over the subpasses
	 * to record commands for that subpass, and then ending the render pass instance.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pRenderPassBegin} <b>must</b> be a pointer to a valid {@link VkRenderPassBeginInfo} structure</li>
	 * <li>{@code contents} <b>must</b> be a valid {@code VkSubpassContents} value</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the
	 * {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
	 * is {@link #VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL} then the corresponding attachment image of the framebuffer specified in the {@code framebuffer} member of
	 * {@code pRenderPassBegin} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} set</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the
	 * {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
	 * is {@link #VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL} then the corresponding attachment image of the
	 * framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with
	 * {@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} set</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the
	 * {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
	 * is {@link #VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} then the corresponding attachment image of the framebuffer specified in the {@code framebuffer} member of
	 * {@code pRenderPassBegin} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} or {@link #VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} set</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the
	 * {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
	 * is {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} then the corresponding attachment image of the framebuffer specified in the {@code framebuffer} member of
	 * {@code pRenderPassBegin} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} set</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the
	 * {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
	 * is {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} then the corresponding attachment image of the framebuffer specified in the {@code framebuffer} member of
	 * {@code pRenderPassBegin} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} set</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer    the command buffer in which to record the command
	 * @param pRenderPassBegin a pointer to a {@link VkRenderPassBeginInfo} structure which indicates the render pass to begin an instance of, and the framebuffer the instance uses
	 * @param contents         specifies how the commands in the first subpass will be provided. One of:<br><table><tr><td>{@link #VK_SUBPASS_CONTENTS_INLINE SUBPASS_CONTENTS_INLINE}</td><td>{@link #VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS}</td></tr></table>
	 */
	public static void nvkCmdBeginRenderPass(VkCommandBuffer commandBuffer, long pRenderPassBegin, int contents) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRenderPass;
		if ( CHECKS )
			VkRenderPassBeginInfo.validate(pRenderPassBegin);
		callPPV(__functionAddress, commandBuffer.address(), pRenderPassBegin, contents);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdBeginRenderPass.html">Khronos Reference Page</a></p>
	 * 
	 * Begins a render pass instance.
	 * 
	 * <p>An application records the commands for a render pass instance one subpass at a time, by beginning a render pass instance, iterating over the subpasses
	 * to record commands for that subpass, and then ending the render pass instance.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pRenderPassBegin} <b>must</b> be a pointer to a valid {@link VkRenderPassBeginInfo} structure</li>
	 * <li>{@code contents} <b>must</b> be a valid {@code VkSubpassContents} value</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called outside of a render pass instance</li>
	 * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the
	 * {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
	 * is {@link #VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL} then the corresponding attachment image of the framebuffer specified in the {@code framebuffer} member of
	 * {@code pRenderPassBegin} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} set</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the
	 * {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
	 * is {@link #VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} or {@link #VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL} then the corresponding attachment image of the
	 * framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with
	 * {@link #VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} set</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the
	 * {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
	 * is {@link #VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} then the corresponding attachment image of the framebuffer specified in the {@code framebuffer} member of
	 * {@code pRenderPassBegin} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} or {@link #VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} set</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the
	 * {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
	 * is {@link #VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} then the corresponding attachment image of the framebuffer specified in the {@code framebuffer} member of
	 * {@code pRenderPassBegin} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} set</li>
	 * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the
	 * {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
	 * is {@link #VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} then the corresponding attachment image of the framebuffer specified in the {@code framebuffer} member of
	 * {@code pRenderPassBegin} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} set</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param commandBuffer    the command buffer in which to record the command
	 * @param pRenderPassBegin a pointer to a {@link VkRenderPassBeginInfo} structure which indicates the render pass to begin an instance of, and the framebuffer the instance uses
	 * @param contents         specifies how the commands in the first subpass will be provided. One of:<br><table><tr><td>{@link #VK_SUBPASS_CONTENTS_INLINE SUBPASS_CONTENTS_INLINE}</td><td>{@link #VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS}</td></tr></table>
	 */
	public static void vkCmdBeginRenderPass(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo pRenderPassBegin, int contents) {
		nvkCmdBeginRenderPass(commandBuffer, pRenderPassBegin.address(), contents);
	}

	// --- [ vkCmdNextSubpass ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdNextSubpass.html">Khronos Reference Page</a></p>
	 * 
	 * Transitions to the next subpass of a render pass.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code contents} <b>must</b> be a valid {@code VkSubpassContents} value</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
	 * <li>The current subpass index <b>must</b> be less than the number of subpasses in the render pass minus one</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>The subpass index for a render pass begins at zero when {@link #vkCmdBeginRenderPass CmdBeginRenderPass} is recorded, and increments each time {@code vkCmdNextSubpass} is
	 * recorded.</p>
	 * 
	 * <p>Moving to the next subpass automatically performs any multisample resolve operations in the subpass being ended. End-of-subpass multisample resolves
	 * are treated as color attachment writes for the purposes of synchronization. That is, they are considered to execute in the
	 * {@link #VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT} pipeline stage and their writes are synchronized with {@link #VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT ACCESS_COLOR_ATTACHMENT_WRITE_BIT}. Synchronization
	 * between rendering within a subpass and any resolve operations at the end of the subpass occurs automatically, without need for explicit dependencies or
	 * pipeline barriers. However, if the resolve attachment is also used in a different subpass, an explicit dependency is needed.</p>
	 * 
	 * <p>After transitioning to the next subpass, the application <b>can</b> record the commands for that subpass.</p>
	 *
	 * @param commandBuffer the command buffer in which to record the command
	 * @param contents      specifies how the commands in the next subpass will be provided. One of:<br><table><tr><td>{@link #VK_SUBPASS_CONTENTS_INLINE SUBPASS_CONTENTS_INLINE}</td><td>{@link #VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS}</td></tr></table>
	 */
	public static void vkCmdNextSubpass(VkCommandBuffer commandBuffer, int contents) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdNextSubpass;
		callPV(__functionAddress, commandBuffer.address(), contents);
	}

	// --- [ vkCmdEndRenderPass ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdEndRenderPass.html">Khronos Reference Page</a></p>
	 * 
	 * Ends a render pass instance.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
	 * <li>The current subpass index <b>must</b> be equal to the number of subpasses in the render pass minus one</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>Ending a render pass instance performs any multisample resolve operations on the final subpass.</p>
	 *
	 * @param commandBuffer the command buffer in which to end the current render pass instance
	 */
	public static void vkCmdEndRenderPass(VkCommandBuffer commandBuffer) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRenderPass;
		callPV(__functionAddress, commandBuffer.address());
	}

	// --- [ vkCmdExecuteCommands ] ---

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdExecuteCommands.html">Khronos Reference Page</a></p>
	 * 
	 * Executes a secondary command buffer from a primary command buffer.
	 * 
	 * <p>A secondary command buffer <b>must not</b> be directly submitted to a queue. Instead, secondary command buffers are recorded to execute as part of a primary
	 * command buffer with this command.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} valid {@code VkCommandBuffer} handles</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
	 * <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer} and the elements of {@code pCommandBuffers} <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkDevice}</li>
	 * <li>{@code commandBuffer} <b>must</b> have been created with a {@code level} of {@link #VK_COMMAND_BUFFER_LEVEL_PRIMARY COMMAND_BUFFER_LEVEL_PRIMARY}</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> have been created with a {@code level} of {@link #VK_COMMAND_BUFFER_LEVEL_SECONDARY COMMAND_BUFFER_LEVEL_SECONDARY}</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must not</b> be already pending execution in {@code commandBuffer}, or appear twice in
	 * {@code pCommandBuffers}, unless it was created with the {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} flag</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must not</b> be already pending execution in any other {@code VkCommandBuffer}, unless it was created with
	 * the {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} flag</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> be in the executable state</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, that render pass instance <b>must</b> have been begun with the {@code contents}
	 * parameter of {@link #vkCmdBeginRenderPass CmdBeginRenderPass} set to {@link #VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS}</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * the {@link #VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * {@link VkCommandBufferInheritanceInfo}{@code ::subpass} set to the index of the subpass which the given command buffer will be executed in</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * a render pass that is compatible with the current render pass</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, and any given element of {@code pCommandBuffers} was recorded with
	 * {@link VkCommandBufferInheritanceInfo}{@code ::framebuffer} not equal to {@link #VK_NULL_HANDLE NULL_HANDLE}, that {@code VkFramebuffer} <b>must</b> be compatible with the
	 * {@code VkFramebuffer} used in the current render pass instance</li>
	 * <li>If the inherited queries feature is not enabled, {@code commandBuffer} <b>must not</b> have any queries active</li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} query active, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * {@link VkCommandBufferInheritanceInfo}{@code ::occlusionQueryEnable} set to {@link #VK_TRUE TRUE}</li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} query active, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * {@link VkCommandBufferInheritanceInfo}{@code ::queryFlags} having all bits set that are set for the query</li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} query active, then each element of {@code pCommandBuffers} <b>must</b> have been recorded
	 * with {@link VkCommandBufferInheritanceInfo}{@code ::pipelineStatistics} having all bits set that are set in the {@code VkQueryPool} the query uses</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must not</b> begin any query types that are active in {@code commandBuffer}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>Once {@code vkCmdExecuteCommands} has been called, any prior executions of the secondary command buffers specified by {@code pCommandBuffers} in any
	 * other primary command buffer become invalidated, unless those secondary command buffers were recorded with {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}.</p>
	 *
	 * @param commandBuffer      a handle to a primary command buffer that the secondary command buffers are submitted to, and <b>must</b> be in the recording state
	 * @param commandBufferCount the length of the {@code pCommandBuffers} array
	 * @param pCommandBuffers    an array of secondary command buffer handles, which are recorded to execute in the primary command buffer in the order they are listed in the
	 *                           array
	 */
	public static void nvkCmdExecuteCommands(VkCommandBuffer commandBuffer, int commandBufferCount, long pCommandBuffers) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdExecuteCommands;
		callPPV(__functionAddress, commandBuffer.address(), commandBufferCount, pCommandBuffers);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdExecuteCommands.html">Khronos Reference Page</a></p>
	 * 
	 * Executes a secondary command buffer from a primary command buffer.
	 * 
	 * <p>A secondary command buffer <b>must not</b> be directly submitted to a queue. Instead, secondary command buffers are recorded to execute as part of a primary
	 * command buffer with this command.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} valid {@code VkCommandBuffer} handles</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
	 * <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer} and the elements of {@code pCommandBuffers} <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkDevice}</li>
	 * <li>{@code commandBuffer} <b>must</b> have been created with a {@code level} of {@link #VK_COMMAND_BUFFER_LEVEL_PRIMARY COMMAND_BUFFER_LEVEL_PRIMARY}</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> have been created with a {@code level} of {@link #VK_COMMAND_BUFFER_LEVEL_SECONDARY COMMAND_BUFFER_LEVEL_SECONDARY}</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must not</b> be already pending execution in {@code commandBuffer}, or appear twice in
	 * {@code pCommandBuffers}, unless it was created with the {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} flag</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must not</b> be already pending execution in any other {@code VkCommandBuffer}, unless it was created with
	 * the {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} flag</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> be in the executable state</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, that render pass instance <b>must</b> have been begun with the {@code contents}
	 * parameter of {@link #vkCmdBeginRenderPass CmdBeginRenderPass} set to {@link #VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS}</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * the {@link #VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * {@link VkCommandBufferInheritanceInfo}{@code ::subpass} set to the index of the subpass which the given command buffer will be executed in</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * a render pass that is compatible with the current render pass</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, and any given element of {@code pCommandBuffers} was recorded with
	 * {@link VkCommandBufferInheritanceInfo}{@code ::framebuffer} not equal to {@link #VK_NULL_HANDLE NULL_HANDLE}, that {@code VkFramebuffer} <b>must</b> be compatible with the
	 * {@code VkFramebuffer} used in the current render pass instance</li>
	 * <li>If the inherited queries feature is not enabled, {@code commandBuffer} <b>must not</b> have any queries active</li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} query active, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * {@link VkCommandBufferInheritanceInfo}{@code ::occlusionQueryEnable} set to {@link #VK_TRUE TRUE}</li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} query active, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * {@link VkCommandBufferInheritanceInfo}{@code ::queryFlags} having all bits set that are set for the query</li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} query active, then each element of {@code pCommandBuffers} <b>must</b> have been recorded
	 * with {@link VkCommandBufferInheritanceInfo}{@code ::pipelineStatistics} having all bits set that are set in the {@code VkQueryPool} the query uses</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must not</b> begin any query types that are active in {@code commandBuffer}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>Once {@code vkCmdExecuteCommands} has been called, any prior executions of the secondary command buffers specified by {@code pCommandBuffers} in any
	 * other primary command buffer become invalidated, unless those secondary command buffers were recorded with {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}.</p>
	 *
	 * @param commandBuffer   a handle to a primary command buffer that the secondary command buffers are submitted to, and <b>must</b> be in the recording state
	 * @param pCommandBuffers an array of secondary command buffer handles, which are recorded to execute in the primary command buffer in the order they are listed in the
	 *                        array
	 */
	public static void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, PointerBuffer pCommandBuffers) {
		nvkCmdExecuteCommands(commandBuffer, pCommandBuffers.remaining(), memAddress(pCommandBuffers));
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdExecuteCommands.html">Khronos Reference Page</a></p>
	 * 
	 * Executes a secondary command buffer from a primary command buffer.
	 * 
	 * <p>A secondary command buffer <b>must not</b> be directly submitted to a queue. Instead, secondary command buffers are recorded to execute as part of a primary
	 * command buffer with this command.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} valid {@code VkCommandBuffer} handles</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
	 * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
	 * <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
	 * <li>Each of {@code commandBuffer} and the elements of {@code pCommandBuffers} <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkDevice}</li>
	 * <li>{@code commandBuffer} <b>must</b> have been created with a {@code level} of {@link #VK_COMMAND_BUFFER_LEVEL_PRIMARY COMMAND_BUFFER_LEVEL_PRIMARY}</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> have been created with a {@code level} of {@link #VK_COMMAND_BUFFER_LEVEL_SECONDARY COMMAND_BUFFER_LEVEL_SECONDARY}</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must not</b> be already pending execution in {@code commandBuffer}, or appear twice in
	 * {@code pCommandBuffers}, unless it was created with the {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} flag</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must not</b> be already pending execution in any other {@code VkCommandBuffer}, unless it was created with
	 * the {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT} flag</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must</b> be in the executable state</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, that render pass instance <b>must</b> have been begun with the {@code contents}
	 * parameter of {@link #vkCmdBeginRenderPass CmdBeginRenderPass} set to {@link #VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS}</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * the {@link #VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * {@link VkCommandBufferInheritanceInfo}{@code ::subpass} set to the index of the subpass which the given command buffer will be executed in</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * a render pass that is compatible with the current render pass</li>
	 * <li>If {@link #vkCmdExecuteCommands CmdExecuteCommands} is being called within a render pass instance, and any given element of {@code pCommandBuffers} was recorded with
	 * {@link VkCommandBufferInheritanceInfo}{@code ::framebuffer} not equal to {@link #VK_NULL_HANDLE NULL_HANDLE}, that {@code VkFramebuffer} <b>must</b> be compatible with the
	 * {@code VkFramebuffer} used in the current render pass instance</li>
	 * <li>If the inherited queries feature is not enabled, {@code commandBuffer} <b>must not</b> have any queries active</li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} query active, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * {@link VkCommandBufferInheritanceInfo}{@code ::occlusionQueryEnable} set to {@link #VK_TRUE TRUE}</li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} query active, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with
	 * {@link VkCommandBufferInheritanceInfo}{@code ::queryFlags} having all bits set that are set for the query</li>
	 * <li>If {@code commandBuffer} has a {@link #VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} query active, then each element of {@code pCommandBuffers} <b>must</b> have been recorded
	 * with {@link VkCommandBufferInheritanceInfo}{@code ::pipelineStatistics} having all bits set that are set in the {@code VkQueryPool} the query uses</li>
	 * <li>Any given element of {@code pCommandBuffers} <b>must not</b> begin any query types that are active in {@code commandBuffer}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>Once {@code vkCmdExecuteCommands} has been called, any prior executions of the secondary command buffers specified by {@code pCommandBuffers} in any
	 * other primary command buffer become invalidated, unless those secondary command buffers were recorded with {@link #VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}.</p>
	 *
	 * @param commandBuffer a handle to a primary command buffer that the secondary command buffers are submitted to, and <b>must</b> be in the recording state
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

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumeratePhysicalDevices.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkEnumeratePhysicalDevices EnumeratePhysicalDevices}
	 */
	public static int vkEnumeratePhysicalDevices(VkInstance instance, int[] pPhysicalDeviceCount, PointerBuffer pPhysicalDevices) {
		long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDevices;
		if ( CHECKS ) {
			checkBuffer(pPhysicalDeviceCount, 1);
			if ( pPhysicalDevices != null ) checkBuffer(pPhysicalDevices, pPhysicalDeviceCount[0]);
		}
		return callPPPI(__functionAddress, instance.address(), pPhysicalDeviceCount, memAddressSafe(pPhysicalDevices));
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceQueueFamilyProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}
	 */
	public static void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, int[] pQueueFamilyPropertyCount, VkQueueFamilyProperties.Buffer pQueueFamilyProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties;
		if ( CHECKS ) {
			checkBuffer(pQueueFamilyPropertyCount, 1);
			if ( pQueueFamilyProperties != null ) checkBuffer(pQueueFamilyProperties, pQueueFamilyPropertyCount[0]);
		}
		callPPPV(__functionAddress, physicalDevice.address(), pQueueFamilyPropertyCount, pQueueFamilyProperties == null ? NULL : pQueueFamilyProperties.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateInstanceExtensionProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}
	 */
	public static int vkEnumerateInstanceExtensionProperties(ByteBuffer pLayerName, int[] pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceExtensionProperties;
		if ( CHECKS ) {
			if ( pLayerName != null ) checkNT1(pLayerName);
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount[0]);
		}
		return callPPPI(__functionAddress, memAddressSafe(pLayerName), pPropertyCount, pProperties == null ? NULL : pProperties.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateInstanceExtensionProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}
	 */
	public static int vkEnumerateInstanceExtensionProperties(CharSequence pLayerName, int[] pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceExtensionProperties;
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount[0]);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pLayerNameEncoded = stack.UTF8(pLayerName);
			return callPPPI(__functionAddress, memAddressSafe(pLayerNameEncoded), pPropertyCount, pProperties == null ? NULL : pProperties.address());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateDeviceExtensionProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkEnumerateDeviceExtensionProperties EnumerateDeviceExtensionProperties}
	 */
	public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, ByteBuffer pLayerName, int[] pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceExtensionProperties;
		if ( CHECKS ) {
			if ( pLayerName != null ) checkNT1(pLayerName);
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount[0]);
		}
		return callPPPPI(__functionAddress, physicalDevice.address(), memAddressSafe(pLayerName), pPropertyCount, pProperties == null ? NULL : pProperties.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateDeviceExtensionProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkEnumerateDeviceExtensionProperties EnumerateDeviceExtensionProperties}
	 */
	public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, CharSequence pLayerName, int[] pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceExtensionProperties;
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount[0]);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pLayerNameEncoded = stack.UTF8(pLayerName);
			return callPPPPI(__functionAddress, physicalDevice.address(), memAddressSafe(pLayerNameEncoded), pPropertyCount, pProperties == null ? NULL : pProperties.address());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateInstanceLayerProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties}
	 */
	public static int vkEnumerateInstanceLayerProperties(int[] pPropertyCount, VkLayerProperties.Buffer pProperties) {
		long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceLayerProperties;
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount[0]);
		}
		return callPPI(__functionAddress, pPropertyCount, pProperties == null ? NULL : pProperties.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkEnumerateDeviceLayerProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkEnumerateDeviceLayerProperties EnumerateDeviceLayerProperties}
	 */
	public static int vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, int[] pPropertyCount, VkLayerProperties.Buffer pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceLayerProperties;
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount[0]);
		}
		return callPPPI(__functionAddress, physicalDevice.address(), pPropertyCount, pProperties == null ? NULL : pProperties.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkAllocateMemory.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkAllocateMemory AllocateMemory}
	 */
	public static int vkAllocateMemory(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, long[] pMemory) {
		long __functionAddress = device.getCapabilities().vkAllocateMemory;
		if ( CHECKS ) {
			checkBuffer(pMemory, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pAllocateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pMemory);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetDeviceMemoryCommitment.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkGetDeviceMemoryCommitment GetDeviceMemoryCommitment}
	 */
	public static void vkGetDeviceMemoryCommitment(VkDevice device, long memory, long[] pCommittedMemoryInBytes) {
		long __functionAddress = device.getCapabilities().vkGetDeviceMemoryCommitment;
		if ( CHECKS )
			checkBuffer(pCommittedMemoryInBytes, 1);
		callPJPV(__functionAddress, device.address(), memory, pCommittedMemoryInBytes);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetImageSparseMemoryRequirements.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkGetImageSparseMemoryRequirements GetImageSparseMemoryRequirements}
	 */
	public static void vkGetImageSparseMemoryRequirements(VkDevice device, long image, int[] pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements.Buffer pSparseMemoryRequirements) {
		long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements;
		if ( CHECKS ) {
			checkBuffer(pSparseMemoryRequirementCount, 1);
			if ( pSparseMemoryRequirements != null ) checkBuffer(pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
		}
		callPJPPV(__functionAddress, device.address(), image, pSparseMemoryRequirementCount, pSparseMemoryRequirements == null ? NULL : pSparseMemoryRequirements.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetPhysicalDeviceSparseImageFormatProperties.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties}
	 */
	public static void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, int[] pPropertyCount, VkSparseImageFormatProperties.Buffer pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties;
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount[0]);
		}
		callPPPV(__functionAddress, physicalDevice.address(), format, type, samples, usage, tiling, pPropertyCount, pProperties == null ? NULL : pProperties.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateFence.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateFence CreateFence}
	 */
	public static int vkCreateFence(VkDevice device, VkFenceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pFence) {
		long __functionAddress = device.getCapabilities().vkCreateFence;
		if ( CHECKS ) {
			checkBuffer(pFence, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pFence);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkResetFences.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkResetFences ResetFences}
	 */
	public static int vkResetFences(VkDevice device, long[] pFences) {
		long __functionAddress = device.getCapabilities().vkResetFences;
		return callPPI(__functionAddress, device.address(), pFences.length, pFences);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkWaitForFences.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkWaitForFences WaitForFences}
	 */
	public static int vkWaitForFences(VkDevice device, long[] pFences, int waitAll, long timeout) {
		long __functionAddress = device.getCapabilities().vkWaitForFences;
		return callPPJI(__functionAddress, device.address(), pFences.length, pFences, waitAll, timeout);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateSemaphore.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateSemaphore CreateSemaphore}
	 */
	public static int vkCreateSemaphore(VkDevice device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pSemaphore) {
		long __functionAddress = device.getCapabilities().vkCreateSemaphore;
		if ( CHECKS ) {
			checkBuffer(pSemaphore, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pSemaphore);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateEvent.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateEvent CreateEvent}
	 */
	public static int vkCreateEvent(VkDevice device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pEvent) {
		long __functionAddress = device.getCapabilities().vkCreateEvent;
		if ( CHECKS ) {
			checkBuffer(pEvent, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pEvent);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateQueryPool.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateQueryPool CreateQueryPool}
	 */
	public static int vkCreateQueryPool(VkDevice device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pQueryPool) {
		long __functionAddress = device.getCapabilities().vkCreateQueryPool;
		if ( CHECKS ) {
			checkBuffer(pQueryPool, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pQueryPool);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetQueryPoolResults.html">Khronos Reference Page</a></p>
	 * 
	 * int[] version of: {@link #vkGetQueryPoolResults GetQueryPoolResults}
	 */
	public static int vkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, int[] pData, long stride, int flags) {
		long __functionAddress = device.getCapabilities().vkGetQueryPoolResults;
		return callPJPPJI(__functionAddress, device.address(), queryPool, firstQuery, queryCount, (long)(pData.length << 2), pData, stride, flags);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkGetQueryPoolResults.html">Khronos Reference Page</a></p>
	 * 
	 * long[] version of: {@link #vkGetQueryPoolResults GetQueryPoolResults}
	 */
	public static int vkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, long[] pData, long stride, int flags) {
		long __functionAddress = device.getCapabilities().vkGetQueryPoolResults;
		return callPJPPJI(__functionAddress, device.address(), queryPool, firstQuery, queryCount, (long)(pData.length << 3), pData, stride, flags);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateBuffer CreateBuffer}
	 */
	public static int vkCreateBuffer(VkDevice device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pBuffer) {
		long __functionAddress = device.getCapabilities().vkCreateBuffer;
		if ( CHECKS ) {
			checkBuffer(pBuffer, 1);
			VkBufferCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pBuffer);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateBufferView.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateBufferView CreateBufferView}
	 */
	public static int vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pView) {
		long __functionAddress = device.getCapabilities().vkCreateBufferView;
		if ( CHECKS ) {
			checkBuffer(pView, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pView);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateImage.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateImage CreateImage}
	 */
	public static int vkCreateImage(VkDevice device, VkImageCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pImage) {
		long __functionAddress = device.getCapabilities().vkCreateImage;
		if ( CHECKS ) {
			checkBuffer(pImage, 1);
			VkImageCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pImage);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateImageView.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateImageView CreateImageView}
	 */
	public static int vkCreateImageView(VkDevice device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pView) {
		long __functionAddress = device.getCapabilities().vkCreateImageView;
		if ( CHECKS ) {
			checkBuffer(pView, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pView);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateShaderModule.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateShaderModule CreateShaderModule}
	 */
	public static int vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pShaderModule) {
		long __functionAddress = device.getCapabilities().vkCreateShaderModule;
		if ( CHECKS ) {
			checkBuffer(pShaderModule, 1);
			VkShaderModuleCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pShaderModule);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreatePipelineCache.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreatePipelineCache CreatePipelineCache}
	 */
	public static int vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pPipelineCache) {
		long __functionAddress = device.getCapabilities().vkCreatePipelineCache;
		if ( CHECKS ) {
			checkBuffer(pPipelineCache, 1);
			VkPipelineCacheCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pPipelineCache);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkMergePipelineCaches.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkMergePipelineCaches MergePipelineCaches}
	 */
	public static int vkMergePipelineCaches(VkDevice device, long dstCache, long[] pSrcCaches) {
		long __functionAddress = device.getCapabilities().vkMergePipelineCaches;
		return callPJPI(__functionAddress, device.address(), dstCache, pSrcCaches.length, pSrcCaches);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateGraphicsPipelines.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateGraphicsPipelines CreateGraphicsPipelines}
	 */
	public static int vkCreateGraphicsPipelines(VkDevice device, long pipelineCache, VkGraphicsPipelineCreateInfo.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, long[] pPipelines) {
		long __functionAddress = device.getCapabilities().vkCreateGraphicsPipelines;
		if ( CHECKS ) {
			checkBuffer(pPipelines, pCreateInfos.remaining());
			VkGraphicsPipelineCreateInfo.validate(pCreateInfos.address(), pCreateInfos.remaining());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPJPPPI(__functionAddress, device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), pPipelines);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateComputePipelines.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateComputePipelines CreateComputePipelines}
	 */
	public static int vkCreateComputePipelines(VkDevice device, long pipelineCache, VkComputePipelineCreateInfo.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, long[] pPipelines) {
		long __functionAddress = device.getCapabilities().vkCreateComputePipelines;
		if ( CHECKS ) {
			checkBuffer(pPipelines, pCreateInfos.remaining());
			VkComputePipelineCreateInfo.validate(pCreateInfos.address(), pCreateInfos.remaining());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPJPPPI(__functionAddress, device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), pPipelines);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreatePipelineLayout.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreatePipelineLayout CreatePipelineLayout}
	 */
	public static int vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pPipelineLayout) {
		long __functionAddress = device.getCapabilities().vkCreatePipelineLayout;
		if ( CHECKS ) {
			checkBuffer(pPipelineLayout, 1);
			VkPipelineLayoutCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pPipelineLayout);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateSampler.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateSampler CreateSampler}
	 */
	public static int vkCreateSampler(VkDevice device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pSampler) {
		long __functionAddress = device.getCapabilities().vkCreateSampler;
		if ( CHECKS ) {
			checkBuffer(pSampler, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pSampler);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateDescriptorSetLayout.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateDescriptorSetLayout CreateDescriptorSetLayout}
	 */
	public static int vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pSetLayout) {
		long __functionAddress = device.getCapabilities().vkCreateDescriptorSetLayout;
		if ( CHECKS ) {
			checkBuffer(pSetLayout, 1);
			VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pSetLayout);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateDescriptorPool.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateDescriptorPool CreateDescriptorPool}
	 */
	public static int vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pDescriptorPool) {
		long __functionAddress = device.getCapabilities().vkCreateDescriptorPool;
		if ( CHECKS ) {
			checkBuffer(pDescriptorPool, 1);
			VkDescriptorPoolCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pDescriptorPool);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkAllocateDescriptorSets.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkAllocateDescriptorSets AllocateDescriptorSets}
	 */
	public static int vkAllocateDescriptorSets(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, long[] pDescriptorSets) {
		long __functionAddress = device.getCapabilities().vkAllocateDescriptorSets;
		if ( CHECKS ) {
			checkBuffer(pDescriptorSets, pAllocateInfo.descriptorSetCount());
			VkDescriptorSetAllocateInfo.validate(pAllocateInfo.address());
		}
		return callPPPI(__functionAddress, device.address(), pAllocateInfo.address(), pDescriptorSets);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkFreeDescriptorSets.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkFreeDescriptorSets FreeDescriptorSets}
	 */
	public static int vkFreeDescriptorSets(VkDevice device, long descriptorPool, long[] pDescriptorSets) {
		long __functionAddress = device.getCapabilities().vkFreeDescriptorSets;
		return callPJPI(__functionAddress, device.address(), descriptorPool, pDescriptorSets.length, pDescriptorSets);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateFramebuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateFramebuffer CreateFramebuffer}
	 */
	public static int vkCreateFramebuffer(VkDevice device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pFramebuffer) {
		long __functionAddress = device.getCapabilities().vkCreateFramebuffer;
		if ( CHECKS ) {
			checkBuffer(pFramebuffer, 1);
			VkFramebufferCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pFramebuffer);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateRenderPass.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateRenderPass CreateRenderPass}
	 */
	public static int vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pRenderPass) {
		long __functionAddress = device.getCapabilities().vkCreateRenderPass;
		if ( CHECKS ) {
			checkBuffer(pRenderPass, 1);
			VkRenderPassCreateInfo.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pRenderPass);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCreateCommandPool.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCreateCommandPool CreateCommandPool}
	 */
	public static int vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, long[] pCommandPool) {
		long __functionAddress = device.getCapabilities().vkCreateCommandPool;
		if ( CHECKS ) {
			checkBuffer(pCommandPool, 1);
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pCommandPool);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdSetBlendConstants.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCmdSetBlendConstants CmdSetBlendConstants}
	 */
	public static void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, float[] blendConstants) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdSetBlendConstants;
		if ( CHECKS )
			checkBuffer(blendConstants, 4);
		callPPV(__functionAddress, commandBuffer.address(), blendConstants);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdBindDescriptorSets.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets}
	 */
	public static void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, long[] pDescriptorSets, int[] pDynamicOffsets) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets;
		callPJPPV(__functionAddress, commandBuffer.address(), pipelineBindPoint, layout, firstSet, pDescriptorSets.length, pDescriptorSets, pDynamicOffsets == null ? 0 : pDynamicOffsets.length, pDynamicOffsets);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdBindVertexBuffers.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCmdBindVertexBuffers CmdBindVertexBuffers}
	 */
	public static void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, int firstBinding, long[] pBuffers, long[] pOffsets) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers;
		if ( CHECKS )
			checkBuffer(pOffsets, pBuffers.length);
		callPPPV(__functionAddress, commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdUpdateBuffer.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCmdUpdateBuffer CmdUpdateBuffer}
	 */
	public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, int[] pData) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
		callPJJJPV(__functionAddress, commandBuffer.address(), dstBuffer, dstOffset, (long)pData.length, pData);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdWaitEvents.html">Khronos Reference Page</a></p>
	 * 
	 * Array version of: {@link #vkCmdWaitEvents CmdWaitEvents}
	 */
	public static void vkCmdWaitEvents(VkCommandBuffer commandBuffer, long[] pEvents, int srcStageMask, int dstStageMask, VkMemoryBarrier.Buffer pMemoryBarriers, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents;
		callPPPPPV(__functionAddress, commandBuffer.address(), pEvents.length, pEvents, srcStageMask, dstStageMask, pMemoryBarriers == null ? 0 : pMemoryBarriers.remaining(), pMemoryBarriers == null ? NULL : pMemoryBarriers.address(), pBufferMemoryBarriers == null ? 0 : pBufferMemoryBarriers.remaining(), pBufferMemoryBarriers == null ? NULL : pBufferMemoryBarriers.address(), pImageMemoryBarriers == null ? 0 : pImageMemoryBarriers.remaining(), pImageMemoryBarriers == null ? NULL : pImageMemoryBarriers.address());
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPushConstants.html">Khronos Reference Page</a></p>
	 * 
	 * short[] version of: {@link #vkCmdPushConstants CmdPushConstants}
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, short[] pValues) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
		callPJPV(__functionAddress, commandBuffer.address(), layout, stageFlags, offset, pValues.length << 1, pValues);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPushConstants.html">Khronos Reference Page</a></p>
	 * 
	 * int[] version of: {@link #vkCmdPushConstants CmdPushConstants}
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, int[] pValues) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
		callPJPV(__functionAddress, commandBuffer.address(), layout, stageFlags, offset, pValues.length << 2, pValues);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPushConstants.html">Khronos Reference Page</a></p>
	 * 
	 * long[] version of: {@link #vkCmdPushConstants CmdPushConstants}
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, long[] pValues) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
		callPJPV(__functionAddress, commandBuffer.address(), layout, stageFlags, offset, pValues.length << 3, pValues);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPushConstants.html">Khronos Reference Page</a></p>
	 * 
	 * float[] version of: {@link #vkCmdPushConstants CmdPushConstants}
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, float[] pValues) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
		callPJPV(__functionAddress, commandBuffer.address(), layout, stageFlags, offset, pValues.length << 2, pValues);
	}

	/**
	 * <p><a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/vkCmdPushConstants.html">Khronos Reference Page</a></p>
	 * 
	 * double[] version of: {@link #vkCmdPushConstants CmdPushConstants}
	 */
	public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, double[] pValues) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
		callPJPV(__functionAddress, commandBuffer.address(), layout, stageFlags, offset, pValues.length << 3, pValues);
	}

}