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
	public static final int VK_API_VERSION = (((1) << 22) | ((0) << 12) | (3));

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
	public static final int VK_PIPELINE_CACHE_HEADER_VERSION_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 0x1;

	/**  */
	public static final int VK_PIPELINE_CACHE_HEADER_VERSION_BEGIN_RANGE = VK_PIPELINE_CACHE_HEADER_VERSION_ONE;

	/**  */
	public static final int VK_PIPELINE_CACHE_HEADER_VERSION_END_RANGE = VK_PIPELINE_CACHE_HEADER_VERSION_ONE;

	/**  */
	public static final int VK_PIPELINE_CACHE_HEADER_VERSION_RANGE_SIZE = VK_PIPELINE_CACHE_HEADER_VERSION_ONE - VK_PIPELINE_CACHE_HEADER_VERSION_ONE + 1;

	/** VkResult */
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
		VK_RESULT_BEGIN_RANGE          = VK_ERROR_FORMAT_NOT_SUPPORTED,
		VK_RESULT_END_RANGE            = VK_INCOMPLETE,
		VK_RESULT_RANGE_SIZE           = VK_INCOMPLETE - VK_ERROR_FORMAT_NOT_SUPPORTED + 1,
		VK_RESULT_MAX_ENUM             = 0x7FFFFFFF;

	/**  */
	public static final int VK_STRUCTURE_TYPE_APPLICATION_INFO = 0x0;

	/**  */
	public static final int VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO = 0x1;

	/**  */
	public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO = 0x2;

	/**  */
	public static final int VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO = 0x3;

	/**  */
	public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO = 0x4;

	/**  */
	public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO = 0x5;

	/**  */
	public static final int VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE = 0x6;

	/**  */
	public static final int VK_STRUCTURE_TYPE_BIND_SPARSE_INFO = 0x7;

	/**  */
	public static final int VK_STRUCTURE_TYPE_FENCE_CREATE_INFO = 0x8;

	/**  */
	public static final int VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO = 0x9;

	/**  */
	public static final int VK_STRUCTURE_TYPE_EVENT_CREATE_INFO = 0xA;

	/**  */
	public static final int VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO = 0xB;

	/**  */
	public static final int VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO = 0xC;

	/**  */
	public static final int VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO = 0xD;

	/**  */
	public static final int VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO = 0xE;

	/**  */
	public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO = 0xF;

	/**  */
	public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO = 0x10;

	/**  */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO = 0x11;

	/**  */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO = 0x12;

	/**  */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO = 0x13;

	/**  */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO = 0x14;

	/**  */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO = 0x15;

	/**  */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO = 0x16;

	/**  */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO = 0x17;

	/**  */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO = 0x18;

	/**  */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO = 0x19;

	/**  */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO = 0x1A;

	/**  */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO = 0x1B;

	/**  */
	public static final int VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO = 0x1C;

	/**  */
	public static final int VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO = 0x1D;

	/**  */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO = 0x1E;

	/**  */
	public static final int VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO = 0x1F;

	/**  */
	public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO = 0x20;

	/**  */
	public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO = 0x21;

	/**  */
	public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO = 0x22;

	/**  */
	public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET = 0x23;

	/**  */
	public static final int VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET = 0x24;

	/**  */
	public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO = 0x25;

	/**  */
	public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO = 0x26;

	/**  */
	public static final int VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO = 0x27;

	/**  */
	public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO = 0x28;

	/**  */
	public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO = 0x29;

	/**  */
	public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO = 0x2A;

	/**  */
	public static final int VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO = 0x2B;

	/**  */
	public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER = 0x2C;

	/**  */
	public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER = 0x2D;

	/**  */
	public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER = 0x2E;

	/**  */
	public static final int VK_STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO = 0x2F;

	/**  */
	public static final int VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO = 0x30;

	/**  */
	public static final int VK_STRUCTURE_TYPE_BEGIN_RANGE = VK_STRUCTURE_TYPE_APPLICATION_INFO;

	/**  */
	public static final int VK_STRUCTURE_TYPE_END_RANGE = VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO;

	/**  */
	public static final int VK_STRUCTURE_TYPE_RANGE_SIZE = VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO - VK_STRUCTURE_TYPE_APPLICATION_INFO + 1;

	/**  */
	public static final int VK_STRUCTURE_TYPE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = 0x0;

	/**  */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = 0x1;

	/**  */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_CACHE = 0x2;

	/**  */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = 0x3;

	/**  */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 0x4;

	/**  */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_BEGIN_RANGE = VK_SYSTEM_ALLOCATION_SCOPE_COMMAND;

	/**  */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_END_RANGE = VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE;

	/**  */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_RANGE_SIZE = VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE - VK_SYSTEM_ALLOCATION_SCOPE_COMMAND + 1;

	/**  */
	public static final int VK_SYSTEM_ALLOCATION_SCOPE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0x0;

	/**  */
	public static final int VK_INTERNAL_ALLOCATION_TYPE_BEGIN_RANGE = VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE;

	/**  */
	public static final int VK_INTERNAL_ALLOCATION_TYPE_END_RANGE = VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE;

	/**  */
	public static final int VK_INTERNAL_ALLOCATION_TYPE_RANGE_SIZE = VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE - VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE + 1;

	/**  */
	public static final int VK_INTERNAL_ALLOCATION_TYPE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_FORMAT_UNDEFINED = 0x0;

	/**  */
	public static final int VK_FORMAT_R4G4_UNORM_PACK8 = 0x1;

	/**  */
	public static final int VK_FORMAT_R4G4B4A4_UNORM_PACK16 = 0x2;

	/**  */
	public static final int VK_FORMAT_B4G4R4A4_UNORM_PACK16 = 0x3;

	/**  */
	public static final int VK_FORMAT_R5G6B5_UNORM_PACK16 = 0x4;

	/**  */
	public static final int VK_FORMAT_B5G6R5_UNORM_PACK16 = 0x5;

	/**  */
	public static final int VK_FORMAT_R5G5B5A1_UNORM_PACK16 = 0x6;

	/**  */
	public static final int VK_FORMAT_B5G5R5A1_UNORM_PACK16 = 0x7;

	/**  */
	public static final int VK_FORMAT_A1R5G5B5_UNORM_PACK16 = 0x8;

	/**  */
	public static final int VK_FORMAT_R8_UNORM = 0x9;

	/**  */
	public static final int VK_FORMAT_R8_SNORM = 0xA;

	/**  */
	public static final int VK_FORMAT_R8_USCALED = 0xB;

	/**  */
	public static final int VK_FORMAT_R8_SSCALED = 0xC;

	/**  */
	public static final int VK_FORMAT_R8_UINT = 0xD;

	/**  */
	public static final int VK_FORMAT_R8_SINT = 0xE;

	/**  */
	public static final int VK_FORMAT_R8_SRGB = 0xF;

	/**  */
	public static final int VK_FORMAT_R8G8_UNORM = 0x10;

	/**  */
	public static final int VK_FORMAT_R8G8_SNORM = 0x11;

	/**  */
	public static final int VK_FORMAT_R8G8_USCALED = 0x12;

	/**  */
	public static final int VK_FORMAT_R8G8_SSCALED = 0x13;

	/**  */
	public static final int VK_FORMAT_R8G8_UINT = 0x14;

	/**  */
	public static final int VK_FORMAT_R8G8_SINT = 0x15;

	/**  */
	public static final int VK_FORMAT_R8G8_SRGB = 0x16;

	/**  */
	public static final int VK_FORMAT_R8G8B8_UNORM = 0x17;

	/**  */
	public static final int VK_FORMAT_R8G8B8_SNORM = 0x18;

	/**  */
	public static final int VK_FORMAT_R8G8B8_USCALED = 0x19;

	/**  */
	public static final int VK_FORMAT_R8G8B8_SSCALED = 0x1A;

	/**  */
	public static final int VK_FORMAT_R8G8B8_UINT = 0x1B;

	/**  */
	public static final int VK_FORMAT_R8G8B8_SINT = 0x1C;

	/**  */
	public static final int VK_FORMAT_R8G8B8_SRGB = 0x1D;

	/**  */
	public static final int VK_FORMAT_B8G8R8_UNORM = 0x1E;

	/**  */
	public static final int VK_FORMAT_B8G8R8_SNORM = 0x1F;

	/**  */
	public static final int VK_FORMAT_B8G8R8_USCALED = 0x20;

	/**  */
	public static final int VK_FORMAT_B8G8R8_SSCALED = 0x21;

	/**  */
	public static final int VK_FORMAT_B8G8R8_UINT = 0x22;

	/**  */
	public static final int VK_FORMAT_B8G8R8_SINT = 0x23;

	/**  */
	public static final int VK_FORMAT_B8G8R8_SRGB = 0x24;

	/**  */
	public static final int VK_FORMAT_R8G8B8A8_UNORM = 0x25;

	/**  */
	public static final int VK_FORMAT_R8G8B8A8_SNORM = 0x26;

	/**  */
	public static final int VK_FORMAT_R8G8B8A8_USCALED = 0x27;

	/**  */
	public static final int VK_FORMAT_R8G8B8A8_SSCALED = 0x28;

	/**  */
	public static final int VK_FORMAT_R8G8B8A8_UINT = 0x29;

	/**  */
	public static final int VK_FORMAT_R8G8B8A8_SINT = 0x2A;

	/**  */
	public static final int VK_FORMAT_R8G8B8A8_SRGB = 0x2B;

	/**  */
	public static final int VK_FORMAT_B8G8R8A8_UNORM = 0x2C;

	/**  */
	public static final int VK_FORMAT_B8G8R8A8_SNORM = 0x2D;

	/**  */
	public static final int VK_FORMAT_B8G8R8A8_USCALED = 0x2E;

	/**  */
	public static final int VK_FORMAT_B8G8R8A8_SSCALED = 0x2F;

	/**  */
	public static final int VK_FORMAT_B8G8R8A8_UINT = 0x30;

	/**  */
	public static final int VK_FORMAT_B8G8R8A8_SINT = 0x31;

	/**  */
	public static final int VK_FORMAT_B8G8R8A8_SRGB = 0x32;

	/**  */
	public static final int VK_FORMAT_A8B8G8R8_UNORM_PACK32 = 0x33;

	/**  */
	public static final int VK_FORMAT_A8B8G8R8_SNORM_PACK32 = 0x34;

	/**  */
	public static final int VK_FORMAT_A8B8G8R8_USCALED_PACK32 = 0x35;

	/**  */
	public static final int VK_FORMAT_A8B8G8R8_SSCALED_PACK32 = 0x36;

	/**  */
	public static final int VK_FORMAT_A8B8G8R8_UINT_PACK32 = 0x37;

	/**  */
	public static final int VK_FORMAT_A8B8G8R8_SINT_PACK32 = 0x38;

	/**  */
	public static final int VK_FORMAT_A8B8G8R8_SRGB_PACK32 = 0x39;

	/**  */
	public static final int VK_FORMAT_A2R10G10B10_UNORM_PACK32 = 0x3A;

	/**  */
	public static final int VK_FORMAT_A2R10G10B10_SNORM_PACK32 = 0x3B;

	/**  */
	public static final int VK_FORMAT_A2R10G10B10_USCALED_PACK32 = 0x3C;

	/**  */
	public static final int VK_FORMAT_A2R10G10B10_SSCALED_PACK32 = 0x3D;

	/**  */
	public static final int VK_FORMAT_A2R10G10B10_UINT_PACK32 = 0x3E;

	/**  */
	public static final int VK_FORMAT_A2R10G10B10_SINT_PACK32 = 0x3F;

	/**  */
	public static final int VK_FORMAT_A2B10G10R10_UNORM_PACK32 = 0x40;

	/**  */
	public static final int VK_FORMAT_A2B10G10R10_SNORM_PACK32 = 0x41;

	/**  */
	public static final int VK_FORMAT_A2B10G10R10_USCALED_PACK32 = 0x42;

	/**  */
	public static final int VK_FORMAT_A2B10G10R10_SSCALED_PACK32 = 0x43;

	/**  */
	public static final int VK_FORMAT_A2B10G10R10_UINT_PACK32 = 0x44;

	/**  */
	public static final int VK_FORMAT_A2B10G10R10_SINT_PACK32 = 0x45;

	/**  */
	public static final int VK_FORMAT_R16_UNORM = 0x46;

	/**  */
	public static final int VK_FORMAT_R16_SNORM = 0x47;

	/**  */
	public static final int VK_FORMAT_R16_USCALED = 0x48;

	/**  */
	public static final int VK_FORMAT_R16_SSCALED = 0x49;

	/**  */
	public static final int VK_FORMAT_R16_UINT = 0x4A;

	/**  */
	public static final int VK_FORMAT_R16_SINT = 0x4B;

	/**  */
	public static final int VK_FORMAT_R16_SFLOAT = 0x4C;

	/**  */
	public static final int VK_FORMAT_R16G16_UNORM = 0x4D;

	/**  */
	public static final int VK_FORMAT_R16G16_SNORM = 0x4E;

	/**  */
	public static final int VK_FORMAT_R16G16_USCALED = 0x4F;

	/**  */
	public static final int VK_FORMAT_R16G16_SSCALED = 0x50;

	/**  */
	public static final int VK_FORMAT_R16G16_UINT = 0x51;

	/**  */
	public static final int VK_FORMAT_R16G16_SINT = 0x52;

	/**  */
	public static final int VK_FORMAT_R16G16_SFLOAT = 0x53;

	/**  */
	public static final int VK_FORMAT_R16G16B16_UNORM = 0x54;

	/**  */
	public static final int VK_FORMAT_R16G16B16_SNORM = 0x55;

	/**  */
	public static final int VK_FORMAT_R16G16B16_USCALED = 0x56;

	/**  */
	public static final int VK_FORMAT_R16G16B16_SSCALED = 0x57;

	/**  */
	public static final int VK_FORMAT_R16G16B16_UINT = 0x58;

	/**  */
	public static final int VK_FORMAT_R16G16B16_SINT = 0x59;

	/**  */
	public static final int VK_FORMAT_R16G16B16_SFLOAT = 0x5A;

	/**  */
	public static final int VK_FORMAT_R16G16B16A16_UNORM = 0x5B;

	/**  */
	public static final int VK_FORMAT_R16G16B16A16_SNORM = 0x5C;

	/**  */
	public static final int VK_FORMAT_R16G16B16A16_USCALED = 0x5D;

	/**  */
	public static final int VK_FORMAT_R16G16B16A16_SSCALED = 0x5E;

	/**  */
	public static final int VK_FORMAT_R16G16B16A16_UINT = 0x5F;

	/**  */
	public static final int VK_FORMAT_R16G16B16A16_SINT = 0x60;

	/**  */
	public static final int VK_FORMAT_R16G16B16A16_SFLOAT = 0x61;

	/**  */
	public static final int VK_FORMAT_R32_UINT = 0x62;

	/**  */
	public static final int VK_FORMAT_R32_SINT = 0x63;

	/**  */
	public static final int VK_FORMAT_R32_SFLOAT = 0x64;

	/**  */
	public static final int VK_FORMAT_R32G32_UINT = 0x65;

	/**  */
	public static final int VK_FORMAT_R32G32_SINT = 0x66;

	/**  */
	public static final int VK_FORMAT_R32G32_SFLOAT = 0x67;

	/**  */
	public static final int VK_FORMAT_R32G32B32_UINT = 0x68;

	/**  */
	public static final int VK_FORMAT_R32G32B32_SINT = 0x69;

	/**  */
	public static final int VK_FORMAT_R32G32B32_SFLOAT = 0x6A;

	/**  */
	public static final int VK_FORMAT_R32G32B32A32_UINT = 0x6B;

	/**  */
	public static final int VK_FORMAT_R32G32B32A32_SINT = 0x6C;

	/**  */
	public static final int VK_FORMAT_R32G32B32A32_SFLOAT = 0x6D;

	/**  */
	public static final int VK_FORMAT_R64_UINT = 0x6E;

	/**  */
	public static final int VK_FORMAT_R64_SINT = 0x6F;

	/**  */
	public static final int VK_FORMAT_R64_SFLOAT = 0x70;

	/**  */
	public static final int VK_FORMAT_R64G64_UINT = 0x71;

	/**  */
	public static final int VK_FORMAT_R64G64_SINT = 0x72;

	/**  */
	public static final int VK_FORMAT_R64G64_SFLOAT = 0x73;

	/**  */
	public static final int VK_FORMAT_R64G64B64_UINT = 0x74;

	/**  */
	public static final int VK_FORMAT_R64G64B64_SINT = 0x75;

	/**  */
	public static final int VK_FORMAT_R64G64B64_SFLOAT = 0x76;

	/**  */
	public static final int VK_FORMAT_R64G64B64A64_UINT = 0x77;

	/**  */
	public static final int VK_FORMAT_R64G64B64A64_SINT = 0x78;

	/**  */
	public static final int VK_FORMAT_R64G64B64A64_SFLOAT = 0x79;

	/**  */
	public static final int VK_FORMAT_B10G11R11_UFLOAT_PACK32 = 0x7A;

	/**  */
	public static final int VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 = 0x7B;

	/**  */
	public static final int VK_FORMAT_D16_UNORM = 0x7C;

	/**  */
	public static final int VK_FORMAT_X8_D24_UNORM_PACK32 = 0x7D;

	/**  */
	public static final int VK_FORMAT_D32_SFLOAT = 0x7E;

	/**  */
	public static final int VK_FORMAT_S8_UINT = 0x7F;

	/**  */
	public static final int VK_FORMAT_D16_UNORM_S8_UINT = 0x80;

	/**  */
	public static final int VK_FORMAT_D24_UNORM_S8_UINT = 0x81;

	/**  */
	public static final int VK_FORMAT_D32_SFLOAT_S8_UINT = 0x82;

	/**  */
	public static final int VK_FORMAT_BC1_RGB_UNORM_BLOCK = 0x83;

	/**  */
	public static final int VK_FORMAT_BC1_RGB_SRGB_BLOCK = 0x84;

	/**  */
	public static final int VK_FORMAT_BC1_RGBA_UNORM_BLOCK = 0x85;

	/**  */
	public static final int VK_FORMAT_BC1_RGBA_SRGB_BLOCK = 0x86;

	/**  */
	public static final int VK_FORMAT_BC2_UNORM_BLOCK = 0x87;

	/**  */
	public static final int VK_FORMAT_BC2_SRGB_BLOCK = 0x88;

	/**  */
	public static final int VK_FORMAT_BC3_UNORM_BLOCK = 0x89;

	/**  */
	public static final int VK_FORMAT_BC3_SRGB_BLOCK = 0x8A;

	/**  */
	public static final int VK_FORMAT_BC4_UNORM_BLOCK = 0x8B;

	/**  */
	public static final int VK_FORMAT_BC4_SNORM_BLOCK = 0x8C;

	/**  */
	public static final int VK_FORMAT_BC5_UNORM_BLOCK = 0x8D;

	/**  */
	public static final int VK_FORMAT_BC5_SNORM_BLOCK = 0x8E;

	/**  */
	public static final int VK_FORMAT_BC6H_UFLOAT_BLOCK = 0x8F;

	/**  */
	public static final int VK_FORMAT_BC6H_SFLOAT_BLOCK = 0x90;

	/**  */
	public static final int VK_FORMAT_BC7_UNORM_BLOCK = 0x91;

	/**  */
	public static final int VK_FORMAT_BC7_SRGB_BLOCK = 0x92;

	/**  */
	public static final int VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK = 0x93;

	/**  */
	public static final int VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK = 0x94;

	/**  */
	public static final int VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK = 0x95;

	/**  */
	public static final int VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK = 0x96;

	/**  */
	public static final int VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK = 0x97;

	/**  */
	public static final int VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK = 0x98;

	/**  */
	public static final int VK_FORMAT_EAC_R11_UNORM_BLOCK = 0x99;

	/**  */
	public static final int VK_FORMAT_EAC_R11_SNORM_BLOCK = 0x9A;

	/**  */
	public static final int VK_FORMAT_EAC_R11G11_UNORM_BLOCK = 0x9B;

	/**  */
	public static final int VK_FORMAT_EAC_R11G11_SNORM_BLOCK = 0x9C;

	/**  */
	public static final int VK_FORMAT_ASTC_4x4_UNORM_BLOCK = 0x9D;

	/**  */
	public static final int VK_FORMAT_ASTC_4x4_SRGB_BLOCK = 0x9E;

	/**  */
	public static final int VK_FORMAT_ASTC_5x4_UNORM_BLOCK = 0x9F;

	/**  */
	public static final int VK_FORMAT_ASTC_5x4_SRGB_BLOCK = 0xA0;

	/**  */
	public static final int VK_FORMAT_ASTC_5x5_UNORM_BLOCK = 0xA1;

	/**  */
	public static final int VK_FORMAT_ASTC_5x5_SRGB_BLOCK = 0xA2;

	/**  */
	public static final int VK_FORMAT_ASTC_6x5_UNORM_BLOCK = 0xA3;

	/**  */
	public static final int VK_FORMAT_ASTC_6x5_SRGB_BLOCK = 0xA4;

	/**  */
	public static final int VK_FORMAT_ASTC_6x6_UNORM_BLOCK = 0xA5;

	/**  */
	public static final int VK_FORMAT_ASTC_6x6_SRGB_BLOCK = 0xA6;

	/**  */
	public static final int VK_FORMAT_ASTC_8x5_UNORM_BLOCK = 0xA7;

	/**  */
	public static final int VK_FORMAT_ASTC_8x5_SRGB_BLOCK = 0xA8;

	/**  */
	public static final int VK_FORMAT_ASTC_8x6_UNORM_BLOCK = 0xA9;

	/**  */
	public static final int VK_FORMAT_ASTC_8x6_SRGB_BLOCK = 0xAA;

	/**  */
	public static final int VK_FORMAT_ASTC_8x8_UNORM_BLOCK = 0xAB;

	/**  */
	public static final int VK_FORMAT_ASTC_8x8_SRGB_BLOCK = 0xAC;

	/**  */
	public static final int VK_FORMAT_ASTC_10x5_UNORM_BLOCK = 0xAD;

	/**  */
	public static final int VK_FORMAT_ASTC_10x5_SRGB_BLOCK = 0xAE;

	/**  */
	public static final int VK_FORMAT_ASTC_10x6_UNORM_BLOCK = 0xAF;

	/**  */
	public static final int VK_FORMAT_ASTC_10x6_SRGB_BLOCK = 0xB0;

	/**  */
	public static final int VK_FORMAT_ASTC_10x8_UNORM_BLOCK = 0xB1;

	/**  */
	public static final int VK_FORMAT_ASTC_10x8_SRGB_BLOCK = 0xB2;

	/**  */
	public static final int VK_FORMAT_ASTC_10x10_UNORM_BLOCK = 0xB3;

	/**  */
	public static final int VK_FORMAT_ASTC_10x10_SRGB_BLOCK = 0xB4;

	/**  */
	public static final int VK_FORMAT_ASTC_12x10_UNORM_BLOCK = 0xB5;

	/**  */
	public static final int VK_FORMAT_ASTC_12x10_SRGB_BLOCK = 0xB6;

	/**  */
	public static final int VK_FORMAT_ASTC_12x12_UNORM_BLOCK = 0xB7;

	/**  */
	public static final int VK_FORMAT_ASTC_12x12_SRGB_BLOCK = 0xB8;

	/**  */
	public static final int VK_FORMAT_BEGIN_RANGE = VK_FORMAT_UNDEFINED;

	/**  */
	public static final int VK_FORMAT_END_RANGE = VK_FORMAT_ASTC_12x12_SRGB_BLOCK;

	/**  */
	public static final int VK_FORMAT_RANGE_SIZE = VK_FORMAT_ASTC_12x12_SRGB_BLOCK - VK_FORMAT_UNDEFINED + 1;

	/**  */
	public static final int VK_FORMAT_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_IMAGE_TYPE_1D = 0x0;

	/**  */
	public static final int VK_IMAGE_TYPE_2D = 0x1;

	/**  */
	public static final int VK_IMAGE_TYPE_3D = 0x2;

	/**  */
	public static final int VK_IMAGE_TYPE_BEGIN_RANGE = VK_IMAGE_TYPE_1D;

	/**  */
	public static final int VK_IMAGE_TYPE_END_RANGE = VK_IMAGE_TYPE_3D;

	/**  */
	public static final int VK_IMAGE_TYPE_RANGE_SIZE = VK_IMAGE_TYPE_3D - VK_IMAGE_TYPE_1D + 1;

	/**  */
	public static final int VK_IMAGE_TYPE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_IMAGE_TILING_OPTIMAL = 0x0;

	/**  */
	public static final int VK_IMAGE_TILING_LINEAR = 0x1;

	/**  */
	public static final int VK_IMAGE_TILING_BEGIN_RANGE = VK_IMAGE_TILING_OPTIMAL;

	/**  */
	public static final int VK_IMAGE_TILING_END_RANGE = VK_IMAGE_TILING_LINEAR;

	/**  */
	public static final int VK_IMAGE_TILING_RANGE_SIZE = VK_IMAGE_TILING_LINEAR - VK_IMAGE_TILING_OPTIMAL + 1;

	/**  */
	public static final int VK_IMAGE_TILING_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0x0;

	/**  */
	public static final int VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 0x1;

	/**  */
	public static final int VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 0x2;

	/**  */
	public static final int VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 0x3;

	/**  */
	public static final int VK_PHYSICAL_DEVICE_TYPE_CPU = 0x4;

	/**  */
	public static final int VK_PHYSICAL_DEVICE_TYPE_BEGIN_RANGE = VK_PHYSICAL_DEVICE_TYPE_OTHER;

	/**  */
	public static final int VK_PHYSICAL_DEVICE_TYPE_END_RANGE = VK_PHYSICAL_DEVICE_TYPE_CPU;

	/**  */
	public static final int VK_PHYSICAL_DEVICE_TYPE_RANGE_SIZE = VK_PHYSICAL_DEVICE_TYPE_CPU - VK_PHYSICAL_DEVICE_TYPE_OTHER + 1;

	/**  */
	public static final int VK_PHYSICAL_DEVICE_TYPE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_QUERY_TYPE_OCCLUSION = 0x0;

	/**  */
	public static final int VK_QUERY_TYPE_PIPELINE_STATISTICS = 0x1;

	/**  */
	public static final int VK_QUERY_TYPE_TIMESTAMP = 0x2;

	/**  */
	public static final int VK_QUERY_TYPE_BEGIN_RANGE = VK_QUERY_TYPE_OCCLUSION;

	/**  */
	public static final int VK_QUERY_TYPE_END_RANGE = VK_QUERY_TYPE_TIMESTAMP;

	/**  */
	public static final int VK_QUERY_TYPE_RANGE_SIZE = VK_QUERY_TYPE_TIMESTAMP - VK_QUERY_TYPE_OCCLUSION + 1;

	/**  */
	public static final int VK_QUERY_TYPE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_SHARING_MODE_EXCLUSIVE = 0x0;

	/**  */
	public static final int VK_SHARING_MODE_CONCURRENT = 0x1;

	/**  */
	public static final int VK_SHARING_MODE_BEGIN_RANGE = VK_SHARING_MODE_EXCLUSIVE;

	/**  */
	public static final int VK_SHARING_MODE_END_RANGE = VK_SHARING_MODE_CONCURRENT;

	/**  */
	public static final int VK_SHARING_MODE_RANGE_SIZE = VK_SHARING_MODE_CONCURRENT - VK_SHARING_MODE_EXCLUSIVE + 1;

	/**  */
	public static final int VK_SHARING_MODE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_IMAGE_LAYOUT_UNDEFINED = 0x0;

	/**  */
	public static final int VK_IMAGE_LAYOUT_GENERAL = 0x1;

	/**  */
	public static final int VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL = 0x2;

	/**  */
	public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = 0x3;

	/**  */
	public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL = 0x4;

	/**  */
	public static final int VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL = 0x5;

	/**  */
	public static final int VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL = 0x6;

	/**  */
	public static final int VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL = 0x7;

	/**  */
	public static final int VK_IMAGE_LAYOUT_PREINITIALIZED = 0x8;

	/**  */
	public static final int VK_IMAGE_LAYOUT_BEGIN_RANGE = VK_IMAGE_LAYOUT_UNDEFINED;

	/**  */
	public static final int VK_IMAGE_LAYOUT_END_RANGE = VK_IMAGE_LAYOUT_PREINITIALIZED;

	/**  */
	public static final int VK_IMAGE_LAYOUT_RANGE_SIZE = VK_IMAGE_LAYOUT_PREINITIALIZED - VK_IMAGE_LAYOUT_UNDEFINED + 1;

	/**  */
	public static final int VK_IMAGE_LAYOUT_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_IMAGE_VIEW_TYPE_1D = 0x0;

	/**  */
	public static final int VK_IMAGE_VIEW_TYPE_2D = 0x1;

	/**  */
	public static final int VK_IMAGE_VIEW_TYPE_3D = 0x2;

	/**  */
	public static final int VK_IMAGE_VIEW_TYPE_CUBE = 0x3;

	/**  */
	public static final int VK_IMAGE_VIEW_TYPE_1D_ARRAY = 0x4;

	/**  */
	public static final int VK_IMAGE_VIEW_TYPE_2D_ARRAY = 0x5;

	/**  */
	public static final int VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 0x6;

	/**  */
	public static final int VK_IMAGE_VIEW_TYPE_BEGIN_RANGE = VK_IMAGE_VIEW_TYPE_1D;

	/**  */
	public static final int VK_IMAGE_VIEW_TYPE_END_RANGE = VK_IMAGE_VIEW_TYPE_CUBE_ARRAY;

	/**  */
	public static final int VK_IMAGE_VIEW_TYPE_RANGE_SIZE = VK_IMAGE_VIEW_TYPE_CUBE_ARRAY - VK_IMAGE_VIEW_TYPE_1D + 1;

	/**  */
	public static final int VK_IMAGE_VIEW_TYPE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_COMPONENT_SWIZZLE_IDENTITY = 0x0;

	/**  */
	public static final int VK_COMPONENT_SWIZZLE_ZERO = 0x1;

	/**  */
	public static final int VK_COMPONENT_SWIZZLE_ONE = 0x2;

	/**  */
	public static final int VK_COMPONENT_SWIZZLE_R = 0x3;

	/**  */
	public static final int VK_COMPONENT_SWIZZLE_G = 0x4;

	/**  */
	public static final int VK_COMPONENT_SWIZZLE_B = 0x5;

	/**  */
	public static final int VK_COMPONENT_SWIZZLE_A = 0x6;

	/**  */
	public static final int VK_COMPONENT_SWIZZLE_BEGIN_RANGE = VK_COMPONENT_SWIZZLE_IDENTITY;

	/**  */
	public static final int VK_COMPONENT_SWIZZLE_END_RANGE = VK_COMPONENT_SWIZZLE_A;

	/**  */
	public static final int VK_COMPONENT_SWIZZLE_RANGE_SIZE = VK_COMPONENT_SWIZZLE_A - VK_COMPONENT_SWIZZLE_IDENTITY + 1;

	/**  */
	public static final int VK_COMPONENT_SWIZZLE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_VERTEX_INPUT_RATE_VERTEX = 0x0;

	/**  */
	public static final int VK_VERTEX_INPUT_RATE_INSTANCE = 0x1;

	/**  */
	public static final int VK_VERTEX_INPUT_RATE_BEGIN_RANGE = VK_VERTEX_INPUT_RATE_VERTEX;

	/**  */
	public static final int VK_VERTEX_INPUT_RATE_END_RANGE = VK_VERTEX_INPUT_RATE_INSTANCE;

	/**  */
	public static final int VK_VERTEX_INPUT_RATE_RANGE_SIZE = VK_VERTEX_INPUT_RATE_INSTANCE - VK_VERTEX_INPUT_RATE_VERTEX + 1;

	/**  */
	public static final int VK_VERTEX_INPUT_RATE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_POINT_LIST = 0x0;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST = 0x1;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP = 0x2;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = 0x3;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = 0x4;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN = 0x5;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY = 0x6;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY = 0x7;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY = 0x8;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = 0x9;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_PATCH_LIST = 0xA;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_BEGIN_RANGE = VK_PRIMITIVE_TOPOLOGY_POINT_LIST;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_END_RANGE = VK_PRIMITIVE_TOPOLOGY_PATCH_LIST;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_RANGE_SIZE = VK_PRIMITIVE_TOPOLOGY_PATCH_LIST - VK_PRIMITIVE_TOPOLOGY_POINT_LIST + 1;

	/**  */
	public static final int VK_PRIMITIVE_TOPOLOGY_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_POLYGON_MODE_FILL = 0x0;

	/**  */
	public static final int VK_POLYGON_MODE_LINE = 0x1;

	/**  */
	public static final int VK_POLYGON_MODE_POINT = 0x2;

	/**  */
	public static final int VK_POLYGON_MODE_BEGIN_RANGE = VK_POLYGON_MODE_FILL;

	/**  */
	public static final int VK_POLYGON_MODE_END_RANGE = VK_POLYGON_MODE_POINT;

	/**  */
	public static final int VK_POLYGON_MODE_RANGE_SIZE = VK_POLYGON_MODE_POINT - VK_POLYGON_MODE_FILL + 1;

	/**  */
	public static final int VK_POLYGON_MODE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_FRONT_FACE_COUNTER_CLOCKWISE = 0x0;

	/**  */
	public static final int VK_FRONT_FACE_CLOCKWISE = 0x1;

	/**  */
	public static final int VK_FRONT_FACE_BEGIN_RANGE = VK_FRONT_FACE_COUNTER_CLOCKWISE;

	/**  */
	public static final int VK_FRONT_FACE_END_RANGE = VK_FRONT_FACE_CLOCKWISE;

	/**  */
	public static final int VK_FRONT_FACE_RANGE_SIZE = VK_FRONT_FACE_CLOCKWISE - VK_FRONT_FACE_COUNTER_CLOCKWISE + 1;

	/**  */
	public static final int VK_FRONT_FACE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_COMPARE_OP_NEVER = 0x0;

	/**  */
	public static final int VK_COMPARE_OP_LESS = 0x1;

	/**  */
	public static final int VK_COMPARE_OP_EQUAL = 0x2;

	/**  */
	public static final int VK_COMPARE_OP_LESS_OR_EQUAL = 0x3;

	/**  */
	public static final int VK_COMPARE_OP_GREATER = 0x4;

	/**  */
	public static final int VK_COMPARE_OP_NOT_EQUAL = 0x5;

	/**  */
	public static final int VK_COMPARE_OP_GREATER_OR_EQUAL = 0x6;

	/**  */
	public static final int VK_COMPARE_OP_ALWAYS = 0x7;

	/**  */
	public static final int VK_COMPARE_OP_BEGIN_RANGE = VK_COMPARE_OP_NEVER;

	/**  */
	public static final int VK_COMPARE_OP_END_RANGE = VK_COMPARE_OP_ALWAYS;

	/**  */
	public static final int VK_COMPARE_OP_RANGE_SIZE = VK_COMPARE_OP_ALWAYS - VK_COMPARE_OP_NEVER + 1;

	/**  */
	public static final int VK_COMPARE_OP_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_STENCIL_OP_KEEP = 0x0;

	/**  */
	public static final int VK_STENCIL_OP_ZERO = 0x1;

	/**  */
	public static final int VK_STENCIL_OP_REPLACE = 0x2;

	/**  */
	public static final int VK_STENCIL_OP_INCREMENT_AND_CLAMP = 0x3;

	/**  */
	public static final int VK_STENCIL_OP_DECREMENT_AND_CLAMP = 0x4;

	/**  */
	public static final int VK_STENCIL_OP_INVERT = 0x5;

	/**  */
	public static final int VK_STENCIL_OP_INCREMENT_AND_WRAP = 0x6;

	/**  */
	public static final int VK_STENCIL_OP_DECREMENT_AND_WRAP = 0x7;

	/**  */
	public static final int VK_STENCIL_OP_BEGIN_RANGE = VK_STENCIL_OP_KEEP;

	/**  */
	public static final int VK_STENCIL_OP_END_RANGE = VK_STENCIL_OP_DECREMENT_AND_WRAP;

	/**  */
	public static final int VK_STENCIL_OP_RANGE_SIZE = VK_STENCIL_OP_DECREMENT_AND_WRAP - VK_STENCIL_OP_KEEP + 1;

	/**  */
	public static final int VK_STENCIL_OP_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_LOGIC_OP_CLEAR = 0x0;

	/**  */
	public static final int VK_LOGIC_OP_AND = 0x1;

	/**  */
	public static final int VK_LOGIC_OP_AND_REVERSE = 0x2;

	/**  */
	public static final int VK_LOGIC_OP_COPY = 0x3;

	/**  */
	public static final int VK_LOGIC_OP_AND_INVERTED = 0x4;

	/**  */
	public static final int VK_LOGIC_OP_NO_OP = 0x5;

	/**  */
	public static final int VK_LOGIC_OP_XOR = 0x6;

	/**  */
	public static final int VK_LOGIC_OP_OR = 0x7;

	/**  */
	public static final int VK_LOGIC_OP_NOR = 0x8;

	/**  */
	public static final int VK_LOGIC_OP_EQUIVALENT = 0x9;

	/**  */
	public static final int VK_LOGIC_OP_INVERT = 0xA;

	/**  */
	public static final int VK_LOGIC_OP_OR_REVERSE = 0xB;

	/**  */
	public static final int VK_LOGIC_OP_COPY_INVERTED = 0xC;

	/**  */
	public static final int VK_LOGIC_OP_OR_INVERTED = 0xD;

	/**  */
	public static final int VK_LOGIC_OP_NAND = 0xE;

	/**  */
	public static final int VK_LOGIC_OP_SET = 0xF;

	/**  */
	public static final int VK_LOGIC_OP_BEGIN_RANGE = VK_LOGIC_OP_CLEAR;

	/**  */
	public static final int VK_LOGIC_OP_END_RANGE = VK_LOGIC_OP_SET;

	/**  */
	public static final int VK_LOGIC_OP_RANGE_SIZE = VK_LOGIC_OP_SET - VK_LOGIC_OP_CLEAR + 1;

	/**  */
	public static final int VK_LOGIC_OP_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_BLEND_FACTOR_ZERO = 0x0;

	/**  */
	public static final int VK_BLEND_FACTOR_ONE = 0x1;

	/**  */
	public static final int VK_BLEND_FACTOR_SRC_COLOR = 0x2;

	/**  */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR = 0x3;

	/**  */
	public static final int VK_BLEND_FACTOR_DST_COLOR = 0x4;

	/**  */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR = 0x5;

	/**  */
	public static final int VK_BLEND_FACTOR_SRC_ALPHA = 0x6;

	/**  */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = 0x7;

	/**  */
	public static final int VK_BLEND_FACTOR_DST_ALPHA = 0x8;

	/**  */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA = 0x9;

	/**  */
	public static final int VK_BLEND_FACTOR_CONSTANT_COLOR = 0xA;

	/**  */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = 0xB;

	/**  */
	public static final int VK_BLEND_FACTOR_CONSTANT_ALPHA = 0xC;

	/**  */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = 0xD;

	/**  */
	public static final int VK_BLEND_FACTOR_SRC_ALPHA_SATURATE = 0xE;

	/**  */
	public static final int VK_BLEND_FACTOR_SRC1_COLOR = 0xF;

	/**  */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR = 0x10;

	/**  */
	public static final int VK_BLEND_FACTOR_SRC1_ALPHA = 0x11;

	/**  */
	public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = 0x12;

	/**  */
	public static final int VK_BLEND_FACTOR_BEGIN_RANGE = VK_BLEND_FACTOR_ZERO;

	/**  */
	public static final int VK_BLEND_FACTOR_END_RANGE = VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA;

	/**  */
	public static final int VK_BLEND_FACTOR_RANGE_SIZE = VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA - VK_BLEND_FACTOR_ZERO + 1;

	/**  */
	public static final int VK_BLEND_FACTOR_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_BLEND_OP_ADD = 0x0;

	/**  */
	public static final int VK_BLEND_OP_SUBTRACT = 0x1;

	/**  */
	public static final int VK_BLEND_OP_REVERSE_SUBTRACT = 0x2;

	/**  */
	public static final int VK_BLEND_OP_MIN = 0x3;

	/**  */
	public static final int VK_BLEND_OP_MAX = 0x4;

	/**  */
	public static final int VK_BLEND_OP_BEGIN_RANGE = VK_BLEND_OP_ADD;

	/**  */
	public static final int VK_BLEND_OP_END_RANGE = VK_BLEND_OP_MAX;

	/**  */
	public static final int VK_BLEND_OP_RANGE_SIZE = VK_BLEND_OP_MAX - VK_BLEND_OP_ADD + 1;

	/**  */
	public static final int VK_BLEND_OP_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_DYNAMIC_STATE_VIEWPORT = 0x0;

	/**  */
	public static final int VK_DYNAMIC_STATE_SCISSOR = 0x1;

	/**  */
	public static final int VK_DYNAMIC_STATE_LINE_WIDTH = 0x2;

	/**  */
	public static final int VK_DYNAMIC_STATE_DEPTH_BIAS = 0x3;

	/**  */
	public static final int VK_DYNAMIC_STATE_BLEND_CONSTANTS = 0x4;

	/**  */
	public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS = 0x5;

	/**  */
	public static final int VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = 0x6;

	/**  */
	public static final int VK_DYNAMIC_STATE_STENCIL_WRITE_MASK = 0x7;

	/**  */
	public static final int VK_DYNAMIC_STATE_STENCIL_REFERENCE = 0x8;

	/**  */
	public static final int VK_DYNAMIC_STATE_BEGIN_RANGE = VK_DYNAMIC_STATE_VIEWPORT;

	/**  */
	public static final int VK_DYNAMIC_STATE_END_RANGE = VK_DYNAMIC_STATE_STENCIL_REFERENCE;

	/**  */
	public static final int VK_DYNAMIC_STATE_RANGE_SIZE = VK_DYNAMIC_STATE_STENCIL_REFERENCE - VK_DYNAMIC_STATE_VIEWPORT + 1;

	/**  */
	public static final int VK_DYNAMIC_STATE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_FILTER_NEAREST = 0x0;

	/**  */
	public static final int VK_FILTER_LINEAR = 0x1;

	/**  */
	public static final int VK_FILTER_BEGIN_RANGE = VK_FILTER_NEAREST;

	/**  */
	public static final int VK_FILTER_END_RANGE = VK_FILTER_LINEAR;

	/**  */
	public static final int VK_FILTER_RANGE_SIZE = VK_FILTER_LINEAR - VK_FILTER_NEAREST + 1;

	/**  */
	public static final int VK_FILTER_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_SAMPLER_MIPMAP_MODE_NEAREST = 0x0;

	/**  */
	public static final int VK_SAMPLER_MIPMAP_MODE_LINEAR = 0x1;

	/**  */
	public static final int VK_SAMPLER_MIPMAP_MODE_BEGIN_RANGE = VK_SAMPLER_MIPMAP_MODE_NEAREST;

	/**  */
	public static final int VK_SAMPLER_MIPMAP_MODE_END_RANGE = VK_SAMPLER_MIPMAP_MODE_LINEAR;

	/**  */
	public static final int VK_SAMPLER_MIPMAP_MODE_RANGE_SIZE = VK_SAMPLER_MIPMAP_MODE_LINEAR - VK_SAMPLER_MIPMAP_MODE_NEAREST + 1;

	/**  */
	public static final int VK_SAMPLER_MIPMAP_MODE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_SAMPLER_ADDRESS_MODE_REPEAT = 0x0;

	/**  */
	public static final int VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 0x1;

	/**  */
	public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = 0x2;

	/**  */
	public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 0x3;

	/**  */
	public static final int VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = 0x4;

	/**  */
	public static final int VK_SAMPLER_ADDRESS_MODE_BEGIN_RANGE = VK_SAMPLER_ADDRESS_MODE_REPEAT;

	/**  */
	public static final int VK_SAMPLER_ADDRESS_MODE_END_RANGE = VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE;

	/**  */
	public static final int VK_SAMPLER_ADDRESS_MODE_RANGE_SIZE = VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE - VK_SAMPLER_ADDRESS_MODE_REPEAT + 1;

	/**  */
	public static final int VK_SAMPLER_ADDRESS_MODE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = 0x0;

	/**  */
	public static final int VK_BORDER_COLOR_INT_TRANSPARENT_BLACK = 0x1;

	/**  */
	public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK = 0x2;

	/**  */
	public static final int VK_BORDER_COLOR_INT_OPAQUE_BLACK = 0x3;

	/**  */
	public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE = 0x4;

	/**  */
	public static final int VK_BORDER_COLOR_INT_OPAQUE_WHITE = 0x5;

	/**  */
	public static final int VK_BORDER_COLOR_BEGIN_RANGE = VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK;

	/**  */
	public static final int VK_BORDER_COLOR_END_RANGE = VK_BORDER_COLOR_INT_OPAQUE_WHITE;

	/**  */
	public static final int VK_BORDER_COLOR_RANGE_SIZE = VK_BORDER_COLOR_INT_OPAQUE_WHITE - VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK + 1;

	/**  */
	public static final int VK_BORDER_COLOR_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_SAMPLER = 0x0;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER = 0x1;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE = 0x2;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_STORAGE_IMAGE = 0x3;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER = 0x4;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER = 0x5;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER = 0x6;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER = 0x7;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC = 0x8;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC = 0x9;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT = 0xA;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_BEGIN_RANGE = VK_DESCRIPTOR_TYPE_SAMPLER;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_END_RANGE = VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_RANGE_SIZE = VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT - VK_DESCRIPTOR_TYPE_SAMPLER + 1;

	/**  */
	public static final int VK_DESCRIPTOR_TYPE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_ATTACHMENT_LOAD_OP_LOAD = 0x0;

	/**  */
	public static final int VK_ATTACHMENT_LOAD_OP_CLEAR = 0x1;

	/**  */
	public static final int VK_ATTACHMENT_LOAD_OP_DONT_CARE = 0x2;

	/**  */
	public static final int VK_ATTACHMENT_LOAD_OP_BEGIN_RANGE = VK_ATTACHMENT_LOAD_OP_LOAD;

	/**  */
	public static final int VK_ATTACHMENT_LOAD_OP_END_RANGE = VK_ATTACHMENT_LOAD_OP_DONT_CARE;

	/**  */
	public static final int VK_ATTACHMENT_LOAD_OP_RANGE_SIZE = VK_ATTACHMENT_LOAD_OP_DONT_CARE - VK_ATTACHMENT_LOAD_OP_LOAD + 1;

	/**  */
	public static final int VK_ATTACHMENT_LOAD_OP_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_ATTACHMENT_STORE_OP_STORE = 0x0;

	/**  */
	public static final int VK_ATTACHMENT_STORE_OP_DONT_CARE = 0x1;

	/**  */
	public static final int VK_ATTACHMENT_STORE_OP_BEGIN_RANGE = VK_ATTACHMENT_STORE_OP_STORE;

	/**  */
	public static final int VK_ATTACHMENT_STORE_OP_END_RANGE = VK_ATTACHMENT_STORE_OP_DONT_CARE;

	/**  */
	public static final int VK_ATTACHMENT_STORE_OP_RANGE_SIZE = VK_ATTACHMENT_STORE_OP_DONT_CARE - VK_ATTACHMENT_STORE_OP_STORE + 1;

	/**  */
	public static final int VK_ATTACHMENT_STORE_OP_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_PIPELINE_BIND_POINT_GRAPHICS = 0x0;

	/**  */
	public static final int VK_PIPELINE_BIND_POINT_COMPUTE = 0x1;

	/**  */
	public static final int VK_PIPELINE_BIND_POINT_BEGIN_RANGE = VK_PIPELINE_BIND_POINT_GRAPHICS;

	/**  */
	public static final int VK_PIPELINE_BIND_POINT_END_RANGE = VK_PIPELINE_BIND_POINT_COMPUTE;

	/**  */
	public static final int VK_PIPELINE_BIND_POINT_RANGE_SIZE = VK_PIPELINE_BIND_POINT_COMPUTE - VK_PIPELINE_BIND_POINT_GRAPHICS + 1;

	/**  */
	public static final int VK_PIPELINE_BIND_POINT_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_COMMAND_BUFFER_LEVEL_PRIMARY = 0x0;

	/**  */
	public static final int VK_COMMAND_BUFFER_LEVEL_SECONDARY = 0x1;

	/**  */
	public static final int VK_COMMAND_BUFFER_LEVEL_BEGIN_RANGE = VK_COMMAND_BUFFER_LEVEL_PRIMARY;

	/**  */
	public static final int VK_COMMAND_BUFFER_LEVEL_END_RANGE = VK_COMMAND_BUFFER_LEVEL_SECONDARY;

	/**  */
	public static final int VK_COMMAND_BUFFER_LEVEL_RANGE_SIZE = VK_COMMAND_BUFFER_LEVEL_SECONDARY - VK_COMMAND_BUFFER_LEVEL_PRIMARY + 1;

	/**  */
	public static final int VK_COMMAND_BUFFER_LEVEL_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_INDEX_TYPE_UINT16 = 0x0;

	/**  */
	public static final int VK_INDEX_TYPE_UINT32 = 0x1;

	/**  */
	public static final int VK_INDEX_TYPE_BEGIN_RANGE = VK_INDEX_TYPE_UINT16;

	/**  */
	public static final int VK_INDEX_TYPE_END_RANGE = VK_INDEX_TYPE_UINT32;

	/**  */
	public static final int VK_INDEX_TYPE_RANGE_SIZE = VK_INDEX_TYPE_UINT32 - VK_INDEX_TYPE_UINT16 + 1;

	/**  */
	public static final int VK_INDEX_TYPE_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_SUBPASS_CONTENTS_INLINE = 0x0;

	/**  */
	public static final int VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 0x1;

	/**  */
	public static final int VK_SUBPASS_CONTENTS_BEGIN_RANGE = VK_SUBPASS_CONTENTS_INLINE;

	/**  */
	public static final int VK_SUBPASS_CONTENTS_END_RANGE = VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS;

	/**  */
	public static final int VK_SUBPASS_CONTENTS_RANGE_SIZE = VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS - VK_SUBPASS_CONTENTS_INLINE + 1;

	/**  */
	public static final int VK_SUBPASS_CONTENTS_MAX_ENUM = 0x7FFFFFFF;

	/**  */
	public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = 0x1;

	/**  */
	public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = 0x2;

	/**  */
	public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = 0x4;

	/**  */
	public static final int VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = 0x8;

	/**  */
	public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = 0x10;

	/**  */
	public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 0x20;

	/**  */
	public static final int VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = 0x40;

	/**  */
	public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = 0x80;

	/**  */
	public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = 0x100;

	/**  */
	public static final int VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x200;

	/**  */
	public static final int VK_FORMAT_FEATURE_BLIT_SRC_BIT = 0x400;

	/**  */
	public static final int VK_FORMAT_FEATURE_BLIT_DST_BIT = 0x800;

	/**  */
	public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 0x1000;

	/**  */
	public static final int VK_IMAGE_USAGE_TRANSFER_SRC_BIT = 0x1;

	/**  */
	public static final int VK_IMAGE_USAGE_TRANSFER_DST_BIT = 0x2;

	/**  */
	public static final int VK_IMAGE_USAGE_SAMPLED_BIT = 0x4;

	/**  */
	public static final int VK_IMAGE_USAGE_STORAGE_BIT = 0x8;

	/**  */
	public static final int VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT = 0x10;

	/**  */
	public static final int VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x20;

	/**  */
	public static final int VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT = 0x40;

	/**  */
	public static final int VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT = 0x80;

	/**  */
	public static final int VK_IMAGE_CREATE_SPARSE_BINDING_BIT = 0x1;

	/**  */
	public static final int VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = 0x2;

	/**  */
	public static final int VK_IMAGE_CREATE_SPARSE_ALIASED_BIT = 0x4;

	/**  */
	public static final int VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT = 0x8;

	/**  */
	public static final int VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT = 0x10;

	/**  */
	public static final int VK_SAMPLE_COUNT_1_BIT = 0x1;

	/**  */
	public static final int VK_SAMPLE_COUNT_2_BIT = 0x2;

	/**  */
	public static final int VK_SAMPLE_COUNT_4_BIT = 0x4;

	/**  */
	public static final int VK_SAMPLE_COUNT_8_BIT = 0x8;

	/**  */
	public static final int VK_SAMPLE_COUNT_16_BIT = 0x10;

	/**  */
	public static final int VK_SAMPLE_COUNT_32_BIT = 0x20;

	/**  */
	public static final int VK_SAMPLE_COUNT_64_BIT = 0x40;

	/**  */
	public static final int VK_QUEUE_GRAPHICS_BIT = 0x1;

	/**  */
	public static final int VK_QUEUE_COMPUTE_BIT = 0x2;

	/**  */
	public static final int VK_QUEUE_TRANSFER_BIT = 0x4;

	/**  */
	public static final int VK_QUEUE_SPARSE_BINDING_BIT = 0x8;

	/**  */
	public static final int VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 0x1;

	/**  */
	public static final int VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 0x2;

	/**  */
	public static final int VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 0x4;

	/**  */
	public static final int VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 0x8;

	/**  */
	public static final int VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 0x10;

	/**  */
	public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 0x1;

	/**  */
	public static final int VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT = 0x1;

	/**  */
	public static final int VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT = 0x2;

	/**  */
	public static final int VK_PIPELINE_STAGE_VERTEX_INPUT_BIT = 0x4;

	/**  */
	public static final int VK_PIPELINE_STAGE_VERTEX_SHADER_BIT = 0x8;

	/**  */
	public static final int VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT = 0x10;

	/**  */
	public static final int VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = 0x20;

	/**  */
	public static final int VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT = 0x40;

	/**  */
	public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT = 0x80;

	/**  */
	public static final int VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT = 0x100;

	/**  */
	public static final int VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT = 0x200;

	/**  */
	public static final int VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT = 0x400;

	/**  */
	public static final int VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT = 0x800;

	/**  */
	public static final int VK_PIPELINE_STAGE_TRANSFER_BIT = 0x1000;

	/**  */
	public static final int VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT = 0x2000;

	/**  */
	public static final int VK_PIPELINE_STAGE_HOST_BIT = 0x4000;

	/**  */
	public static final int VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT = 0x8000;

	/**  */
	public static final int VK_PIPELINE_STAGE_ALL_COMMANDS_BIT = 0x10000;

	/**  */
	public static final int VK_IMAGE_ASPECT_COLOR_BIT = 0x1;

	/**  */
	public static final int VK_IMAGE_ASPECT_DEPTH_BIT = 0x2;

	/**  */
	public static final int VK_IMAGE_ASPECT_STENCIL_BIT = 0x4;

	/**  */
	public static final int VK_IMAGE_ASPECT_METADATA_BIT = 0x8;

	/**  */
	public static final int VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT = 0x1;

	/**  */
	public static final int VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT = 0x2;

	/**  */
	public static final int VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = 0x4;

	/**  */
	public static final int VK_SPARSE_MEMORY_BIND_METADATA_BIT = 0x1;

	/**  */
	public static final int VK_FENCE_CREATE_SIGNALED_BIT = 0x1;

	/**  */
	public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT = 0x1;

	/**  */
	public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT = 0x2;

	/**  */
	public static final int VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT = 0x4;

	/**  */
	public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT = 0x8;

	/**  */
	public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT = 0x10;

	/**  */
	public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT = 0x20;

	/**  */
	public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT = 0x40;

	/**  */
	public static final int VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT = 0x80;

	/**  */
	public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT = 0x100;

	/**  */
	public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT = 0x200;

	/**  */
	public static final int VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT = 0x400;

	/**  */
	public static final int VK_QUERY_RESULT_64_BIT = 0x1;

	/**  */
	public static final int VK_QUERY_RESULT_WAIT_BIT = 0x2;

	/**  */
	public static final int VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 0x4;

	/**  */
	public static final int VK_QUERY_RESULT_PARTIAL_BIT = 0x8;

	/**  */
	public static final int VK_BUFFER_CREATE_SPARSE_BINDING_BIT = 0x1;

	/**  */
	public static final int VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 0x2;

	/**  */
	public static final int VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = 0x4;

	/**  */
	public static final int VK_BUFFER_USAGE_TRANSFER_SRC_BIT = 0x1;

	/**  */
	public static final int VK_BUFFER_USAGE_TRANSFER_DST_BIT = 0x2;

	/**  */
	public static final int VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = 0x4;

	/**  */
	public static final int VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = 0x8;

	/**  */
	public static final int VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT = 0x10;

	/**  */
	public static final int VK_BUFFER_USAGE_STORAGE_BUFFER_BIT = 0x20;

	/**  */
	public static final int VK_BUFFER_USAGE_INDEX_BUFFER_BIT = 0x40;

	/**  */
	public static final int VK_BUFFER_USAGE_VERTEX_BUFFER_BIT = 0x80;

	/**  */
	public static final int VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT = 0x100;

	/**  */
	public static final int VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = 0x1;

	/**  */
	public static final int VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT = 0x2;

	/**  */
	public static final int VK_PIPELINE_CREATE_DERIVATIVE_BIT = 0x4;

	/**  */
	public static final int VK_SHADER_STAGE_VERTEX_BIT = 0x1;

	/**  */
	public static final int VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT = 0x2;

	/**  */
	public static final int VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = 0x4;

	/**  */
	public static final int VK_SHADER_STAGE_GEOMETRY_BIT = 0x8;

	/**  */
	public static final int VK_SHADER_STAGE_FRAGMENT_BIT = 0x10;

	/**  */
	public static final int VK_SHADER_STAGE_COMPUTE_BIT = 0x20;

	/**  */
	public static final int VK_SHADER_STAGE_ALL_GRAPHICS = 0x1F;

	/**  */
	public static final int VK_SHADER_STAGE_ALL = 0x7FFFFFFF;

	/**  */
	public static final int VK_CULL_MODE_NONE = 0x0;

	/**  */
	public static final int VK_CULL_MODE_FRONT_BIT = 0x1;

	/**  */
	public static final int VK_CULL_MODE_BACK_BIT = 0x2;

	/**  */
	public static final int VK_CULL_MODE_FRONT_AND_BACK = 0x3;

	/**  */
	public static final int VK_COLOR_COMPONENT_R_BIT = 0x1;

	/**  */
	public static final int VK_COLOR_COMPONENT_G_BIT = 0x2;

	/**  */
	public static final int VK_COLOR_COMPONENT_B_BIT = 0x4;

	/**  */
	public static final int VK_COLOR_COMPONENT_A_BIT = 0x8;

	/**  */
	public static final int VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = 0x1;

	/**  */
	public static final int VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = 0x1;

	/**  */
	public static final int VK_ACCESS_INDIRECT_COMMAND_READ_BIT = 0x1;

	/**  */
	public static final int VK_ACCESS_INDEX_READ_BIT = 0x2;

	/**  */
	public static final int VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT = 0x4;

	/**  */
	public static final int VK_ACCESS_UNIFORM_READ_BIT = 0x8;

	/**  */
	public static final int VK_ACCESS_INPUT_ATTACHMENT_READ_BIT = 0x10;

	/**  */
	public static final int VK_ACCESS_SHADER_READ_BIT = 0x20;

	/**  */
	public static final int VK_ACCESS_SHADER_WRITE_BIT = 0x40;

	/**  */
	public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_BIT = 0x80;

	/**  */
	public static final int VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT = 0x100;

	/**  */
	public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 0x200;

	/**  */
	public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 0x400;

	/**  */
	public static final int VK_ACCESS_TRANSFER_READ_BIT = 0x800;

	/**  */
	public static final int VK_ACCESS_TRANSFER_WRITE_BIT = 0x1000;

	/**  */
	public static final int VK_ACCESS_HOST_READ_BIT = 0x2000;

	/**  */
	public static final int VK_ACCESS_HOST_WRITE_BIT = 0x4000;

	/**  */
	public static final int VK_ACCESS_MEMORY_READ_BIT = 0x8000;

	/**  */
	public static final int VK_ACCESS_MEMORY_WRITE_BIT = 0x10000;

	/**  */
	public static final int VK_DEPENDENCY_BY_REGION_BIT = 0x1;

	/**  */
	public static final int VK_COMMAND_POOL_CREATE_TRANSIENT_BIT = 0x1;

	/**  */
	public static final int VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = 0x2;

	/**  */
	public static final int VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 0x1;

	/**  */
	public static final int VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = 0x1;

	/**  */
	public static final int VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = 0x2;

	/**  */
	public static final int VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = 0x4;

	/**  */
	public static final int VK_QUERY_CONTROL_PRECISE_BIT = 0x1;

	/**  */
	public static final int VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 0x1;

	/**  */
	public static final int VK_STENCIL_FACE_FRONT_BIT = 0x1;

	/**  */
	public static final int VK_STENCIL_FACE_BACK_BIT = 0x2;

	/**  */
	public static final int VK_STENCIL_FRONT_AND_BACK = 0x3;

	/** Function address. */
	@JavadocExclude
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

	@JavadocExclude
	protected VK10() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public VK10(FunctionProvider provider) {
		CreateInstance = checkFunctionAddress(provider.getFunctionAddress("vkCreateInstance"));
		DestroyInstance = checkFunctionAddress(provider.getFunctionAddress("vkDestroyInstance"));
		EnumeratePhysicalDevices = checkFunctionAddress(provider.getFunctionAddress("vkEnumeratePhysicalDevices"));
		GetPhysicalDeviceFeatures = checkFunctionAddress(provider.getFunctionAddress("vkGetPhysicalDeviceFeatures"));
		GetPhysicalDeviceFormatProperties = checkFunctionAddress(provider.getFunctionAddress("vkGetPhysicalDeviceFormatProperties"));
		GetPhysicalDeviceImageFormatProperties = checkFunctionAddress(provider.getFunctionAddress("vkGetPhysicalDeviceImageFormatProperties"));
		GetPhysicalDeviceProperties = checkFunctionAddress(provider.getFunctionAddress("vkGetPhysicalDeviceProperties"));
		GetPhysicalDeviceQueueFamilyProperties = checkFunctionAddress(provider.getFunctionAddress("vkGetPhysicalDeviceQueueFamilyProperties"));
		GetPhysicalDeviceMemoryProperties = checkFunctionAddress(provider.getFunctionAddress("vkGetPhysicalDeviceMemoryProperties"));
		GetInstanceProcAddr = checkFunctionAddress(provider.getFunctionAddress("vkGetInstanceProcAddr"));
		GetDeviceProcAddr = checkFunctionAddress(provider.getFunctionAddress("vkGetDeviceProcAddr"));
		CreateDevice = checkFunctionAddress(provider.getFunctionAddress("vkCreateDevice"));
		DestroyDevice = checkFunctionAddress(provider.getFunctionAddress("vkDestroyDevice"));
		EnumerateInstanceExtensionProperties = checkFunctionAddress(provider.getFunctionAddress("vkEnumerateInstanceExtensionProperties"));
		EnumerateDeviceExtensionProperties = checkFunctionAddress(provider.getFunctionAddress("vkEnumerateDeviceExtensionProperties"));
		EnumerateInstanceLayerProperties = checkFunctionAddress(provider.getFunctionAddress("vkEnumerateInstanceLayerProperties"));
		EnumerateDeviceLayerProperties = checkFunctionAddress(provider.getFunctionAddress("vkEnumerateDeviceLayerProperties"));
		GetDeviceQueue = checkFunctionAddress(provider.getFunctionAddress("vkGetDeviceQueue"));
		QueueSubmit = checkFunctionAddress(provider.getFunctionAddress("vkQueueSubmit"));
		QueueWaitIdle = checkFunctionAddress(provider.getFunctionAddress("vkQueueWaitIdle"));
		DeviceWaitIdle = checkFunctionAddress(provider.getFunctionAddress("vkDeviceWaitIdle"));
		AllocateMemory = checkFunctionAddress(provider.getFunctionAddress("vkAllocateMemory"));
		FreeMemory = checkFunctionAddress(provider.getFunctionAddress("vkFreeMemory"));
		MapMemory = checkFunctionAddress(provider.getFunctionAddress("vkMapMemory"));
		UnmapMemory = checkFunctionAddress(provider.getFunctionAddress("vkUnmapMemory"));
		FlushMappedMemoryRanges = checkFunctionAddress(provider.getFunctionAddress("vkFlushMappedMemoryRanges"));
		InvalidateMappedMemoryRanges = checkFunctionAddress(provider.getFunctionAddress("vkInvalidateMappedMemoryRanges"));
		GetDeviceMemoryCommitment = checkFunctionAddress(provider.getFunctionAddress("vkGetDeviceMemoryCommitment"));
		BindBufferMemory = checkFunctionAddress(provider.getFunctionAddress("vkBindBufferMemory"));
		BindImageMemory = checkFunctionAddress(provider.getFunctionAddress("vkBindImageMemory"));
		GetBufferMemoryRequirements = checkFunctionAddress(provider.getFunctionAddress("vkGetBufferMemoryRequirements"));
		GetImageMemoryRequirements = checkFunctionAddress(provider.getFunctionAddress("vkGetImageMemoryRequirements"));
		GetImageSparseMemoryRequirements = checkFunctionAddress(provider.getFunctionAddress("vkGetImageSparseMemoryRequirements"));
		GetPhysicalDeviceSparseImageFormatProperties = checkFunctionAddress(provider.getFunctionAddress("vkGetPhysicalDeviceSparseImageFormatProperties"));
		QueueBindSparse = checkFunctionAddress(provider.getFunctionAddress("vkQueueBindSparse"));
		CreateFence = checkFunctionAddress(provider.getFunctionAddress("vkCreateFence"));
		DestroyFence = checkFunctionAddress(provider.getFunctionAddress("vkDestroyFence"));
		ResetFences = checkFunctionAddress(provider.getFunctionAddress("vkResetFences"));
		GetFenceStatus = checkFunctionAddress(provider.getFunctionAddress("vkGetFenceStatus"));
		WaitForFences = checkFunctionAddress(provider.getFunctionAddress("vkWaitForFences"));
		CreateSemaphore = checkFunctionAddress(provider.getFunctionAddress("vkCreateSemaphore"));
		DestroySemaphore = checkFunctionAddress(provider.getFunctionAddress("vkDestroySemaphore"));
		CreateEvent = checkFunctionAddress(provider.getFunctionAddress("vkCreateEvent"));
		DestroyEvent = checkFunctionAddress(provider.getFunctionAddress("vkDestroyEvent"));
		GetEventStatus = checkFunctionAddress(provider.getFunctionAddress("vkGetEventStatus"));
		SetEvent = checkFunctionAddress(provider.getFunctionAddress("vkSetEvent"));
		ResetEvent = checkFunctionAddress(provider.getFunctionAddress("vkResetEvent"));
		CreateQueryPool = checkFunctionAddress(provider.getFunctionAddress("vkCreateQueryPool"));
		DestroyQueryPool = checkFunctionAddress(provider.getFunctionAddress("vkDestroyQueryPool"));
		GetQueryPoolResults = checkFunctionAddress(provider.getFunctionAddress("vkGetQueryPoolResults"));
		CreateBuffer = checkFunctionAddress(provider.getFunctionAddress("vkCreateBuffer"));
		DestroyBuffer = checkFunctionAddress(provider.getFunctionAddress("vkDestroyBuffer"));
		CreateBufferView = checkFunctionAddress(provider.getFunctionAddress("vkCreateBufferView"));
		DestroyBufferView = checkFunctionAddress(provider.getFunctionAddress("vkDestroyBufferView"));
		CreateImage = checkFunctionAddress(provider.getFunctionAddress("vkCreateImage"));
		DestroyImage = checkFunctionAddress(provider.getFunctionAddress("vkDestroyImage"));
		GetImageSubresourceLayout = checkFunctionAddress(provider.getFunctionAddress("vkGetImageSubresourceLayout"));
		CreateImageView = checkFunctionAddress(provider.getFunctionAddress("vkCreateImageView"));
		DestroyImageView = checkFunctionAddress(provider.getFunctionAddress("vkDestroyImageView"));
		CreateShaderModule = checkFunctionAddress(provider.getFunctionAddress("vkCreateShaderModule"));
		DestroyShaderModule = checkFunctionAddress(provider.getFunctionAddress("vkDestroyShaderModule"));
		CreatePipelineCache = checkFunctionAddress(provider.getFunctionAddress("vkCreatePipelineCache"));
		DestroyPipelineCache = checkFunctionAddress(provider.getFunctionAddress("vkDestroyPipelineCache"));
		GetPipelineCacheData = checkFunctionAddress(provider.getFunctionAddress("vkGetPipelineCacheData"));
		MergePipelineCaches = checkFunctionAddress(provider.getFunctionAddress("vkMergePipelineCaches"));
		CreateGraphicsPipelines = checkFunctionAddress(provider.getFunctionAddress("vkCreateGraphicsPipelines"));
		CreateComputePipelines = checkFunctionAddress(provider.getFunctionAddress("vkCreateComputePipelines"));
		DestroyPipeline = checkFunctionAddress(provider.getFunctionAddress("vkDestroyPipeline"));
		CreatePipelineLayout = checkFunctionAddress(provider.getFunctionAddress("vkCreatePipelineLayout"));
		DestroyPipelineLayout = checkFunctionAddress(provider.getFunctionAddress("vkDestroyPipelineLayout"));
		CreateSampler = checkFunctionAddress(provider.getFunctionAddress("vkCreateSampler"));
		DestroySampler = checkFunctionAddress(provider.getFunctionAddress("vkDestroySampler"));
		CreateDescriptorSetLayout = checkFunctionAddress(provider.getFunctionAddress("vkCreateDescriptorSetLayout"));
		DestroyDescriptorSetLayout = checkFunctionAddress(provider.getFunctionAddress("vkDestroyDescriptorSetLayout"));
		CreateDescriptorPool = checkFunctionAddress(provider.getFunctionAddress("vkCreateDescriptorPool"));
		DestroyDescriptorPool = checkFunctionAddress(provider.getFunctionAddress("vkDestroyDescriptorPool"));
		ResetDescriptorPool = checkFunctionAddress(provider.getFunctionAddress("vkResetDescriptorPool"));
		AllocateDescriptorSets = checkFunctionAddress(provider.getFunctionAddress("vkAllocateDescriptorSets"));
		FreeDescriptorSets = checkFunctionAddress(provider.getFunctionAddress("vkFreeDescriptorSets"));
		UpdateDescriptorSets = checkFunctionAddress(provider.getFunctionAddress("vkUpdateDescriptorSets"));
		CreateFramebuffer = checkFunctionAddress(provider.getFunctionAddress("vkCreateFramebuffer"));
		DestroyFramebuffer = checkFunctionAddress(provider.getFunctionAddress("vkDestroyFramebuffer"));
		CreateRenderPass = checkFunctionAddress(provider.getFunctionAddress("vkCreateRenderPass"));
		DestroyRenderPass = checkFunctionAddress(provider.getFunctionAddress("vkDestroyRenderPass"));
		GetRenderAreaGranularity = checkFunctionAddress(provider.getFunctionAddress("vkGetRenderAreaGranularity"));
		CreateCommandPool = checkFunctionAddress(provider.getFunctionAddress("vkCreateCommandPool"));
		DestroyCommandPool = checkFunctionAddress(provider.getFunctionAddress("vkDestroyCommandPool"));
		ResetCommandPool = checkFunctionAddress(provider.getFunctionAddress("vkResetCommandPool"));
		AllocateCommandBuffers = checkFunctionAddress(provider.getFunctionAddress("vkAllocateCommandBuffers"));
		FreeCommandBuffers = checkFunctionAddress(provider.getFunctionAddress("vkFreeCommandBuffers"));
		BeginCommandBuffer = checkFunctionAddress(provider.getFunctionAddress("vkBeginCommandBuffer"));
		EndCommandBuffer = checkFunctionAddress(provider.getFunctionAddress("vkEndCommandBuffer"));
		ResetCommandBuffer = checkFunctionAddress(provider.getFunctionAddress("vkResetCommandBuffer"));
		CmdBindPipeline = checkFunctionAddress(provider.getFunctionAddress("vkCmdBindPipeline"));
		CmdSetViewport = checkFunctionAddress(provider.getFunctionAddress("vkCmdSetViewport"));
		CmdSetScissor = checkFunctionAddress(provider.getFunctionAddress("vkCmdSetScissor"));
		CmdSetLineWidth = checkFunctionAddress(provider.getFunctionAddress("vkCmdSetLineWidth"));
		CmdSetDepthBias = checkFunctionAddress(provider.getFunctionAddress("vkCmdSetDepthBias"));
		CmdSetDepthBounds = checkFunctionAddress(provider.getFunctionAddress("vkCmdSetDepthBounds"));
		CmdSetStencilCompareMask = checkFunctionAddress(provider.getFunctionAddress("vkCmdSetStencilCompareMask"));
		CmdSetStencilWriteMask = checkFunctionAddress(provider.getFunctionAddress("vkCmdSetStencilWriteMask"));
		CmdSetStencilReference = checkFunctionAddress(provider.getFunctionAddress("vkCmdSetStencilReference"));
		CmdBindDescriptorSets = checkFunctionAddress(provider.getFunctionAddress("vkCmdBindDescriptorSets"));
		CmdBindIndexBuffer = checkFunctionAddress(provider.getFunctionAddress("vkCmdBindIndexBuffer"));
		CmdBindVertexBuffers = checkFunctionAddress(provider.getFunctionAddress("vkCmdBindVertexBuffers"));
		CmdDraw = checkFunctionAddress(provider.getFunctionAddress("vkCmdDraw"));
		CmdDrawIndexed = checkFunctionAddress(provider.getFunctionAddress("vkCmdDrawIndexed"));
		CmdDrawIndirect = checkFunctionAddress(provider.getFunctionAddress("vkCmdDrawIndirect"));
		CmdDrawIndexedIndirect = checkFunctionAddress(provider.getFunctionAddress("vkCmdDrawIndexedIndirect"));
		CmdDispatch = checkFunctionAddress(provider.getFunctionAddress("vkCmdDispatch"));
		CmdDispatchIndirect = checkFunctionAddress(provider.getFunctionAddress("vkCmdDispatchIndirect"));
		CmdCopyBuffer = checkFunctionAddress(provider.getFunctionAddress("vkCmdCopyBuffer"));
		CmdCopyImage = checkFunctionAddress(provider.getFunctionAddress("vkCmdCopyImage"));
		CmdBlitImage = checkFunctionAddress(provider.getFunctionAddress("vkCmdBlitImage"));
		CmdCopyBufferToImage = checkFunctionAddress(provider.getFunctionAddress("vkCmdCopyBufferToImage"));
		CmdCopyImageToBuffer = checkFunctionAddress(provider.getFunctionAddress("vkCmdCopyImageToBuffer"));
		CmdUpdateBuffer = checkFunctionAddress(provider.getFunctionAddress("vkCmdUpdateBuffer"));
		CmdFillBuffer = checkFunctionAddress(provider.getFunctionAddress("vkCmdFillBuffer"));
		CmdClearColorImage = checkFunctionAddress(provider.getFunctionAddress("vkCmdClearColorImage"));
		CmdClearDepthStencilImage = checkFunctionAddress(provider.getFunctionAddress("vkCmdClearDepthStencilImage"));
		CmdClearAttachments = checkFunctionAddress(provider.getFunctionAddress("vkCmdClearAttachments"));
		CmdResolveImage = checkFunctionAddress(provider.getFunctionAddress("vkCmdResolveImage"));
		CmdSetEvent = checkFunctionAddress(provider.getFunctionAddress("vkCmdSetEvent"));
		CmdResetEvent = checkFunctionAddress(provider.getFunctionAddress("vkCmdResetEvent"));
		CmdWaitEvents = checkFunctionAddress(provider.getFunctionAddress("vkCmdWaitEvents"));
		CmdPipelineBarrier = checkFunctionAddress(provider.getFunctionAddress("vkCmdPipelineBarrier"));
		CmdBeginQuery = checkFunctionAddress(provider.getFunctionAddress("vkCmdBeginQuery"));
		CmdEndQuery = checkFunctionAddress(provider.getFunctionAddress("vkCmdEndQuery"));
		CmdResetQueryPool = checkFunctionAddress(provider.getFunctionAddress("vkCmdResetQueryPool"));
		CmdWriteTimestamp = checkFunctionAddress(provider.getFunctionAddress("vkCmdWriteTimestamp"));
		CmdCopyQueryPoolResults = checkFunctionAddress(provider.getFunctionAddress("vkCmdCopyQueryPoolResults"));
		CmdPushConstants = checkFunctionAddress(provider.getFunctionAddress("vkCmdPushConstants"));
		CmdBeginRenderPass = checkFunctionAddress(provider.getFunctionAddress("vkCmdBeginRenderPass"));
		CmdNextSubpass = checkFunctionAddress(provider.getFunctionAddress("vkCmdNextSubpass"));
		CmdEndRenderPass = checkFunctionAddress(provider.getFunctionAddress("vkCmdEndRenderPass"));
		CmdExecuteCommands = checkFunctionAddress(provider.getFunctionAddress("vkCmdExecuteCommands"));
	}

	// --- [ Function Addresses ] ---

	private static final SharedLibrary VULKAN;

	private static final VK10 instance;

	static {
		VULKAN = Library.loadNative(Configuration.LIBRARY_NAME_VULKAN.get(
			Platform.get() == Platform.WINDOWS ? "vulkan-1" : (Platform.get() == Platform.LINUX ? "libvulkan.so.1" : "unsupported")
		));
		instance = new VK10(VULKAN);
	}

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return VULKAN;
	}

	/** Returns the {@link VK10} instance. */
	public static VK10 getInstance() {
		return instance;
	}

	// --- [ vkCreateInstance ] ---

	/** Unsafe version of {@link #vkCreateInstance CreateInstance} */
	@JavadocExclude
	public static int nvkCreateInstance(long pCreateInfo, long pAllocator, long pInstance) {
		long __functionAddress = getInstance().CreateInstance;
		return callPPPI(__functionAddress, pCreateInfo, pAllocator, pInstance);
	}

	/**
	 * Creates a new Vulkan instance.
	 *
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pInstance   
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
	@JavadocExclude
	public static void nvkDestroyInstance(long instance, long pAllocator) {
		long __functionAddress = getInstance().DestroyInstance;
		if ( CHECKS )
			checkPointer(instance);
		callPPV(__functionAddress, instance, pAllocator);
	}

	/**
	 * Destroys an instance of Vulkan.
	 *
	 * @param instance   
	 * @param pAllocator 
	 */
	public static void vkDestroyInstance(long instance, VkAllocationCallbacks pAllocator) {
		nvkDestroyInstance(instance, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkEnumeratePhysicalDevices ] ---

	/** Unsafe version of {@link #vkEnumeratePhysicalDevices EnumeratePhysicalDevices} */
	@JavadocExclude
	public static int nvkEnumeratePhysicalDevices(long instance, long pPhysicalDeviceCount, long pPhysicalDevices) {
		long __functionAddress = getInstance().EnumeratePhysicalDevices;
		if ( CHECKS )
			checkPointer(instance);
		return callPPPI(__functionAddress, instance, pPhysicalDeviceCount, pPhysicalDevices);
	}

	/**
	 * Enumerates the physical devices accessible to a Vulkan instance.
	 *
	 * @param instance             
	 * @param pPhysicalDeviceCount 
	 * @param pPhysicalDevices     
	 */
	public static int vkEnumeratePhysicalDevices(long instance, ByteBuffer pPhysicalDeviceCount, ByteBuffer pPhysicalDevices) {
		if ( CHECKS ) {
			checkBuffer(pPhysicalDeviceCount, 1 << 2);
			if ( pPhysicalDevices != null ) checkBuffer(pPhysicalDevices, pPhysicalDeviceCount.getInt(pPhysicalDeviceCount.position()) << POINTER_SHIFT);
		}
		return nvkEnumeratePhysicalDevices(instance, memAddress(pPhysicalDeviceCount), memAddressSafe(pPhysicalDevices));
	}

	/** Alternative version of: {@link #vkEnumeratePhysicalDevices EnumeratePhysicalDevices} */
	public static int vkEnumeratePhysicalDevices(long instance, IntBuffer pPhysicalDeviceCount, PointerBuffer pPhysicalDevices) {
		if ( CHECKS ) {
			checkBuffer(pPhysicalDeviceCount, 1);
			if ( pPhysicalDevices != null ) checkBuffer(pPhysicalDevices, pPhysicalDeviceCount.get(pPhysicalDeviceCount.position()));
		}
		return nvkEnumeratePhysicalDevices(instance, memAddress(pPhysicalDeviceCount), memAddressSafe(pPhysicalDevices));
	}

	// --- [ vkGetPhysicalDeviceFeatures ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceFeatures GetPhysicalDeviceFeatures} */
	@JavadocExclude
	public static void nvkGetPhysicalDeviceFeatures(long physicalDevice, long pFeatures) {
		long __functionAddress = getInstance().GetPhysicalDeviceFeatures;
		if ( CHECKS )
			checkPointer(physicalDevice);
		callPPV(__functionAddress, physicalDevice, pFeatures);
	}

	/**
	 * Reports capabilities of a physical device.
	 *
	 * @param physicalDevice 
	 * @param pFeatures      
	 */
	public static void vkGetPhysicalDeviceFeatures(long physicalDevice, VkPhysicalDeviceFeatures pFeatures) {
		nvkGetPhysicalDeviceFeatures(physicalDevice, pFeatures.address());
	}

	// --- [ vkGetPhysicalDeviceFormatProperties ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} */
	@JavadocExclude
	public static void nvkGetPhysicalDeviceFormatProperties(long physicalDevice, int format, long pFormatProperties) {
		long __functionAddress = getInstance().GetPhysicalDeviceFormatProperties;
		if ( CHECKS )
			checkPointer(physicalDevice);
		callPIPV(__functionAddress, physicalDevice, format, pFormatProperties);
	}

	/**
	 * Lists physical device’s format capabilities.
	 *
	 * @param physicalDevice    
	 * @param format            
	 * @param pFormatProperties 
	 */
	public static void vkGetPhysicalDeviceFormatProperties(long physicalDevice, int format, VkFormatProperties pFormatProperties) {
		nvkGetPhysicalDeviceFormatProperties(physicalDevice, format, pFormatProperties.address());
	}

	// --- [ vkGetPhysicalDeviceImageFormatProperties ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} */
	@JavadocExclude
	public static int nvkGetPhysicalDeviceImageFormatProperties(long physicalDevice, int format, int type, int tiling, int usage, int flags, long pImageFormatProperties) {
		long __functionAddress = getInstance().GetPhysicalDeviceImageFormatProperties;
		if ( CHECKS )
			checkPointer(physicalDevice);
		return callPIIIIIPI(__functionAddress, physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties);
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
	public static int vkGetPhysicalDeviceImageFormatProperties(long physicalDevice, int format, int type, int tiling, int usage, int flags, VkImageFormatProperties pImageFormatProperties) {
		return nvkGetPhysicalDeviceImageFormatProperties(physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties.address());
	}

	// --- [ vkGetPhysicalDeviceProperties ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceProperties GetPhysicalDeviceProperties} */
	@JavadocExclude
	public static void nvkGetPhysicalDeviceProperties(long physicalDevice, long pProperties) {
		long __functionAddress = getInstance().GetPhysicalDeviceProperties;
		if ( CHECKS )
			checkPointer(physicalDevice);
		callPPV(__functionAddress, physicalDevice, pProperties);
	}

	/**
	 * Returns properties of a physical device.
	 *
	 * @param physicalDevice 
	 * @param pProperties    
	 */
	public static void vkGetPhysicalDeviceProperties(long physicalDevice, VkPhysicalDeviceProperties pProperties) {
		nvkGetPhysicalDeviceProperties(physicalDevice, pProperties.address());
	}

	// --- [ vkGetPhysicalDeviceQueueFamilyProperties ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} */
	@JavadocExclude
	public static void nvkGetPhysicalDeviceQueueFamilyProperties(long physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties) {
		long __functionAddress = getInstance().GetPhysicalDeviceQueueFamilyProperties;
		if ( CHECKS )
			checkPointer(physicalDevice);
		callPPPV(__functionAddress, physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties);
	}

	/**
	 * Reports properties of the queues of the specified physical device.
	 *
	 * @param physicalDevice            
	 * @param pQueueFamilyPropertyCount 
	 * @param pQueueFamilyProperties    
	 */
	public static void vkGetPhysicalDeviceQueueFamilyProperties(long physicalDevice, ByteBuffer pQueueFamilyPropertyCount, VkQueueFamilyProperties.Buffer pQueueFamilyProperties) {
		if ( CHECKS ) {
			checkBuffer(pQueueFamilyPropertyCount, 1 << 2);
			if ( pQueueFamilyProperties != null ) checkBuffer(pQueueFamilyProperties, pQueueFamilyPropertyCount.getInt(pQueueFamilyPropertyCount.position()));
		}
		nvkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, memAddress(pQueueFamilyPropertyCount), pQueueFamilyProperties == null ? NULL : pQueueFamilyProperties.address());
	}

	/** Alternative version of: {@link #vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} */
	public static void vkGetPhysicalDeviceQueueFamilyProperties(long physicalDevice, IntBuffer pQueueFamilyPropertyCount, VkQueueFamilyProperties.Buffer pQueueFamilyProperties) {
		if ( CHECKS ) {
			checkBuffer(pQueueFamilyPropertyCount, 1);
			if ( pQueueFamilyProperties != null ) checkBuffer(pQueueFamilyProperties, pQueueFamilyPropertyCount.get(pQueueFamilyPropertyCount.position()));
		}
		nvkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, memAddress(pQueueFamilyPropertyCount), pQueueFamilyProperties == null ? NULL : pQueueFamilyProperties.address());
	}

	// --- [ vkGetPhysicalDeviceMemoryProperties ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceMemoryProperties GetPhysicalDeviceMemoryProperties} */
	@JavadocExclude
	public static void nvkGetPhysicalDeviceMemoryProperties(long physicalDevice, long pMemoryProperties) {
		long __functionAddress = getInstance().GetPhysicalDeviceMemoryProperties;
		if ( CHECKS )
			checkPointer(physicalDevice);
		callPPV(__functionAddress, physicalDevice, pMemoryProperties);
	}

	/**
	 * Reports memory information for the specified physical device.
	 *
	 * @param physicalDevice    
	 * @param pMemoryProperties 
	 */
	public static void vkGetPhysicalDeviceMemoryProperties(long physicalDevice, VkPhysicalDeviceMemoryProperties pMemoryProperties) {
		nvkGetPhysicalDeviceMemoryProperties(physicalDevice, pMemoryProperties.address());
	}

	// --- [ vkGetInstanceProcAddr ] ---

	/** Unsafe version of {@link #vkGetInstanceProcAddr GetInstanceProcAddr} */
	@JavadocExclude
	public static long nvkGetInstanceProcAddr(long instance, long pName) {
		long __functionAddress = getInstance().GetInstanceProcAddr;
		if ( CHECKS )
			checkPointer(instance);
		return callPPP(__functionAddress, instance, pName);
	}

	/**
	 * Returns a function pointer for a command.
	 *
	 * @param instance 
	 * @param pName    
	 */
	public static long vkGetInstanceProcAddr(long instance, ByteBuffer pName) {
		if ( CHECKS )
			checkNT1(pName);
		return nvkGetInstanceProcAddr(instance, memAddress(pName));
	}

	/** CharSequence version of: {@link #vkGetInstanceProcAddr GetInstanceProcAddr} */
	public static long vkGetInstanceProcAddr(long instance, CharSequence pName) {
		APIBuffer __buffer = apiBuffer();
		int pNameEncoded = __buffer.stringParamASCII(pName, true);
		return nvkGetInstanceProcAddr(instance, __buffer.address(pNameEncoded));
	}

	// --- [ vkGetDeviceProcAddr ] ---

	/** Unsafe version of {@link #vkGetDeviceProcAddr GetDeviceProcAddr} */
	@JavadocExclude
	public static long nvkGetDeviceProcAddr(long device, long pName) {
		long __functionAddress = getInstance().GetDeviceProcAddr;
		if ( CHECKS )
			checkPointer(device);
		return callPPP(__functionAddress, device, pName);
	}

	/**
	 * Returns a function pointer for a command.
	 *
	 * @param device 
	 * @param pName  
	 */
	public static long vkGetDeviceProcAddr(long device, ByteBuffer pName) {
		if ( CHECKS )
			checkNT1(pName);
		return nvkGetDeviceProcAddr(device, memAddress(pName));
	}

	/** CharSequence version of: {@link #vkGetDeviceProcAddr GetDeviceProcAddr} */
	public static long vkGetDeviceProcAddr(long device, CharSequence pName) {
		APIBuffer __buffer = apiBuffer();
		int pNameEncoded = __buffer.stringParamASCII(pName, true);
		return nvkGetDeviceProcAddr(device, __buffer.address(pNameEncoded));
	}

	// --- [ vkCreateDevice ] ---

	/** Unsafe version of {@link #vkCreateDevice CreateDevice} */
	@JavadocExclude
	public static int nvkCreateDevice(long physicalDevice, long pCreateInfo, long pAllocator, long pDevice) {
		long __functionAddress = getInstance().CreateDevice;
		if ( CHECKS )
			checkPointer(physicalDevice);
		return callPPPPI(__functionAddress, physicalDevice, pCreateInfo, pAllocator, pDevice);
	}

	/**
	 * Creates a new device instance.
	 *
	 * @param physicalDevice 
	 * @param pCreateInfo    
	 * @param pAllocator     
	 * @param pDevice        
	 */
	public static int vkCreateDevice(long physicalDevice, VkDeviceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pDevice) {
		if ( CHECKS )
			checkBuffer(pDevice, 1 << POINTER_SHIFT);
		return nvkCreateDevice(physicalDevice, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pDevice));
	}

	/** Alternative version of: {@link #vkCreateDevice CreateDevice} */
	public static int vkCreateDevice(long physicalDevice, VkDeviceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, PointerBuffer pDevice) {
		if ( CHECKS )
			checkBuffer(pDevice, 1);
		return nvkCreateDevice(physicalDevice, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pDevice));
	}

	// --- [ vkDestroyDevice ] ---

	/** Unsafe version of {@link #vkDestroyDevice DestroyDevice} */
	@JavadocExclude
	public static void nvkDestroyDevice(long device, long pAllocator) {
		long __functionAddress = getInstance().DestroyDevice;
		callPPV(__functionAddress, device, pAllocator);
	}

	/**
	 * Destroys a logical device.
	 *
	 * @param device     
	 * @param pAllocator 
	 */
	public static void vkDestroyDevice(long device, VkAllocationCallbacks pAllocator) {
		nvkDestroyDevice(device, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkEnumerateInstanceExtensionProperties ] ---

	/** Unsafe version of {@link #vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties} */
	@JavadocExclude
	public static int nvkEnumerateInstanceExtensionProperties(long pLayerName, long pPropertyCount, long pProperties) {
		long __functionAddress = getInstance().EnumerateInstanceExtensionProperties;
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
	@JavadocExclude
	public static int nvkEnumerateDeviceExtensionProperties(long physicalDevice, long pLayerName, long pPropertyCount, long pProperties) {
		long __functionAddress = getInstance().EnumerateDeviceExtensionProperties;
		if ( CHECKS )
			checkPointer(physicalDevice);
		return callPPPPI(__functionAddress, physicalDevice, pLayerName, pPropertyCount, pProperties);
	}

	/**
	 * Returns properties of available physical device extensions.
	 *
	 * @param physicalDevice the physical device to query
	 * @param pLayerName     optional layer name to query
	 * @param pPropertyCount count indicating number of {@code VkExtensionProperties} pointed to by {@code pProperties}
	 * @param pProperties    pointer to an array of {@code VkExtensionProperties}
	 */
	public static int vkEnumerateDeviceExtensionProperties(long physicalDevice, ByteBuffer pLayerName, ByteBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			if ( pLayerName != null ) checkNT1(pLayerName);
			checkBuffer(pPropertyCount, 1 << 2);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.getInt(pPropertyCount.position()));
		}
		return nvkEnumerateDeviceExtensionProperties(physicalDevice, memAddressSafe(pLayerName), memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** Alternative version of: {@link #vkEnumerateDeviceExtensionProperties EnumerateDeviceExtensionProperties} */
	public static int vkEnumerateDeviceExtensionProperties(long physicalDevice, ByteBuffer pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateDeviceExtensionProperties(physicalDevice, memAddressSafe(pLayerName), memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** CharSequence version of: {@link #vkEnumerateDeviceExtensionProperties EnumerateDeviceExtensionProperties} */
	public static int vkEnumerateDeviceExtensionProperties(long physicalDevice, CharSequence pLayerName, IntBuffer pPropertyCount, VkExtensionProperties.Buffer pProperties) {
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
	@JavadocExclude
	public static int nvkEnumerateInstanceLayerProperties(long pPropertyCount, long pProperties) {
		long __functionAddress = getInstance().EnumerateInstanceLayerProperties;
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
	@JavadocExclude
	public static int nvkEnumerateDeviceLayerProperties(long physicalDevice, long pPropertyCount, long pProperties) {
		long __functionAddress = getInstance().EnumerateDeviceLayerProperties;
		if ( CHECKS )
			checkPointer(physicalDevice);
		return callPPPI(__functionAddress, physicalDevice, pPropertyCount, pProperties);
	}

	/**
	 * Returns properties of available physical device layers.
	 *
	 * @param physicalDevice the physical device to query
	 * @param pPropertyCount count indicating number of {@code VkLayerProperties} pointed to by {@code pProperties}
	 * @param pProperties    pointer to an array of {@code VkLayerProperties}
	 */
	public static int vkEnumerateDeviceLayerProperties(long physicalDevice, ByteBuffer pPropertyCount, VkLayerProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1 << 2);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.getInt(pPropertyCount.position()));
		}
		return nvkEnumerateDeviceLayerProperties(physicalDevice, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** Alternative version of: {@link #vkEnumerateDeviceLayerProperties EnumerateDeviceLayerProperties} */
	public static int vkEnumerateDeviceLayerProperties(long physicalDevice, IntBuffer pPropertyCount, VkLayerProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkEnumerateDeviceLayerProperties(physicalDevice, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	// --- [ vkGetDeviceQueue ] ---

	/** Unsafe version of {@link #vkGetDeviceQueue GetDeviceQueue} */
	@JavadocExclude
	public static void nvkGetDeviceQueue(long device, int queueFamilyIndex, int queueIndex, long pQueue) {
		long __functionAddress = getInstance().GetDeviceQueue;
		if ( CHECKS )
			checkPointer(device);
		callPIIPV(__functionAddress, device, queueFamilyIndex, queueIndex, pQueue);
	}

	/**
	 * Gets a queue handle from a device.
	 *
	 * @param device           
	 * @param queueFamilyIndex 
	 * @param queueIndex       
	 * @param pQueue           
	 */
	public static void vkGetDeviceQueue(long device, int queueFamilyIndex, int queueIndex, ByteBuffer pQueue) {
		if ( CHECKS )
			checkBuffer(pQueue, 1 << POINTER_SHIFT);
		nvkGetDeviceQueue(device, queueFamilyIndex, queueIndex, memAddress(pQueue));
	}

	/** Alternative version of: {@link #vkGetDeviceQueue GetDeviceQueue} */
	public static void vkGetDeviceQueue(long device, int queueFamilyIndex, int queueIndex, PointerBuffer pQueue) {
		if ( CHECKS )
			checkBuffer(pQueue, 1);
		nvkGetDeviceQueue(device, queueFamilyIndex, queueIndex, memAddress(pQueue));
	}

	// --- [ vkQueueSubmit ] ---

	/** Unsafe version of {@link #vkQueueSubmit QueueSubmit} */
	@JavadocExclude
	public static int nvkQueueSubmit(long queue, int submitCount, long pSubmits, long fence) {
		long __functionAddress = getInstance().QueueSubmit;
		if ( CHECKS )
			checkPointer(queue);
		return callPIPJI(__functionAddress, queue, submitCount, pSubmits, fence);
	}

	/**
	 * Submits a sequence of semaphores or command buffers to a queue.
	 *
	 * @param queue       
	 * @param submitCount 
	 * @param pSubmits    
	 * @param fence       
	 */
	public static int vkQueueSubmit(long queue, int submitCount, VkSubmitInfo.Buffer pSubmits, long fence) {
		if ( CHECKS )
			if ( pSubmits != null ) checkBuffer(pSubmits, submitCount);
		return nvkQueueSubmit(queue, submitCount, pSubmits == null ? NULL : pSubmits.address(), fence);
	}

	/** Alternative version of: {@link #vkQueueSubmit QueueSubmit} */
	public static int vkQueueSubmit(long queue, VkSubmitInfo.Buffer pSubmits, long fence) {
		return nvkQueueSubmit(queue, pSubmits == null ? 0 : pSubmits.remaining(), pSubmits == null ? NULL : pSubmits.address(), fence);
	}

	/** Single value version of: {@link #vkQueueSubmit QueueSubmit} */
	public static int vkQueueSubmit(long queue, VkSubmitInfo pSubmit, long fence) {
		return nvkQueueSubmit(queue, 1, pSubmit.address(), fence);
	}

	// --- [ vkQueueWaitIdle ] ---

	/**
	 * Waits for a queue to become idle.
	 *
	 * @param queue 
	 */
	public static int vkQueueWaitIdle(long queue) {
		long __functionAddress = getInstance().QueueWaitIdle;
		if ( CHECKS )
			checkPointer(queue);
		return callPI(__functionAddress, queue);
	}

	// --- [ vkDeviceWaitIdle ] ---

	/**
	 * Waits for a device to become idle.
	 *
	 * @param device 
	 */
	public static int vkDeviceWaitIdle(long device) {
		long __functionAddress = getInstance().DeviceWaitIdle;
		if ( CHECKS )
			checkPointer(device);
		return callPI(__functionAddress, device);
	}

	// --- [ vkAllocateMemory ] ---

	/** Unsafe version of {@link #vkAllocateMemory AllocateMemory} */
	@JavadocExclude
	public static int nvkAllocateMemory(long device, long pAllocateInfo, long pAllocator, long pMemory) {
		long __functionAddress = getInstance().AllocateMemory;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pAllocateInfo, pAllocator, pMemory);
	}

	/**
	 * Alocates GPU memory.
	 *
	 * @param device        
	 * @param pAllocateInfo 
	 * @param pAllocator    
	 * @param pMemory       
	 */
	public static int vkAllocateMemory(long device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pMemory) {
		if ( CHECKS )
			checkBuffer(pMemory, 1 << 3);
		return nvkAllocateMemory(device, pAllocateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pMemory));
	}

	/** Alternative version of: {@link #vkAllocateMemory AllocateMemory} */
	public static int vkAllocateMemory(long device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, LongBuffer pMemory) {
		if ( CHECKS )
			checkBuffer(pMemory, 1);
		return nvkAllocateMemory(device, pAllocateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pMemory));
	}

	// --- [ vkFreeMemory ] ---

	/** Unsafe version of {@link #vkFreeMemory FreeMemory} */
	@JavadocExclude
	public static void nvkFreeMemory(long device, long memory, long pAllocator) {
		long __functionAddress = getInstance().FreeMemory;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, memory, pAllocator);
	}

	/**
	 * Frees GPU memory.
	 *
	 * @param device     
	 * @param memory     
	 * @param pAllocator 
	 */
	public static void vkFreeMemory(long device, long memory, VkAllocationCallbacks pAllocator) {
		nvkFreeMemory(device, memory, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkMapMemory ] ---

	/** Unsafe version of {@link #vkMapMemory MapMemory} */
	@JavadocExclude
	public static int nvkMapMemory(long device, long memory, long offset, long size, int flags, long ppData) {
		long __functionAddress = getInstance().MapMemory;
		if ( CHECKS )
			checkPointer(device);
		return callPJJJIPI(__functionAddress, device, memory, offset, size, flags, ppData);
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
	public static int vkMapMemory(long device, long memory, long offset, long size, int flags, ByteBuffer ppData) {
		if ( CHECKS )
			checkBuffer(ppData, 1 << POINTER_SHIFT);
		return nvkMapMemory(device, memory, offset, size, flags, memAddress(ppData));
	}

	/** Alternative version of: {@link #vkMapMemory MapMemory} */
	public static int vkMapMemory(long device, long memory, long offset, long size, int flags, PointerBuffer ppData) {
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
	public static void vkUnmapMemory(long device, long memory) {
		long __functionAddress = getInstance().UnmapMemory;
		if ( CHECKS )
			checkPointer(device);
		callPJV(__functionAddress, device, memory);
	}

	// --- [ vkFlushMappedMemoryRanges ] ---

	/** Unsafe version of {@link #vkFlushMappedMemoryRanges FlushMappedMemoryRanges} */
	@JavadocExclude
	public static int nvkFlushMappedMemoryRanges(long device, int memoryRangeCount, long pMemoryRanges) {
		long __functionAddress = getInstance().FlushMappedMemoryRanges;
		if ( CHECKS )
			checkPointer(device);
		return callPIPI(__functionAddress, device, memoryRangeCount, pMemoryRanges);
	}

	/**
	 * Flushes mapped memory ranges.
	 *
	 * @param device           
	 * @param memoryRangeCount 
	 * @param pMemoryRanges    
	 */
	public static int vkFlushMappedMemoryRanges(long device, int memoryRangeCount, VkMappedMemoryRange.Buffer pMemoryRanges) {
		if ( CHECKS )
			checkBuffer(pMemoryRanges, memoryRangeCount);
		return nvkFlushMappedMemoryRanges(device, memoryRangeCount, pMemoryRanges.address());
	}

	/** Alternative version of: {@link #vkFlushMappedMemoryRanges FlushMappedMemoryRanges} */
	public static int vkFlushMappedMemoryRanges(long device, VkMappedMemoryRange.Buffer pMemoryRanges) {
		return nvkFlushMappedMemoryRanges(device, pMemoryRanges.remaining(), pMemoryRanges.address());
	}

	/** Single value version of: {@link #vkFlushMappedMemoryRanges FlushMappedMemoryRanges} */
	public static int vkFlushMappedMemoryRanges(long device, VkMappedMemoryRange pMemoryRange) {
		return nvkFlushMappedMemoryRanges(device, 1, pMemoryRange.address());
	}

	// --- [ vkInvalidateMappedMemoryRanges ] ---

	/** Unsafe version of {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} */
	@JavadocExclude
	public static int nvkInvalidateMappedMemoryRanges(long device, int memoryRangeCount, long pMemoryRanges) {
		long __functionAddress = getInstance().InvalidateMappedMemoryRanges;
		if ( CHECKS )
			checkPointer(device);
		return callPIPI(__functionAddress, device, memoryRangeCount, pMemoryRanges);
	}

	/**
	 * Invalidates ranges of mapped memory objects.
	 *
	 * @param device           
	 * @param memoryRangeCount 
	 * @param pMemoryRanges    
	 */
	public static int vkInvalidateMappedMemoryRanges(long device, int memoryRangeCount, VkMappedMemoryRange.Buffer pMemoryRanges) {
		if ( CHECKS )
			checkBuffer(pMemoryRanges, memoryRangeCount);
		return nvkInvalidateMappedMemoryRanges(device, memoryRangeCount, pMemoryRanges.address());
	}

	/** Alternative version of: {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} */
	public static int vkInvalidateMappedMemoryRanges(long device, VkMappedMemoryRange.Buffer pMemoryRanges) {
		return nvkInvalidateMappedMemoryRanges(device, pMemoryRanges.remaining(), pMemoryRanges.address());
	}

	/** Single value version of: {@link #vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges} */
	public static int vkInvalidateMappedMemoryRanges(long device, VkMappedMemoryRange pMemoryRange) {
		return nvkInvalidateMappedMemoryRanges(device, 1, pMemoryRange.address());
	}

	// --- [ vkGetDeviceMemoryCommitment ] ---

	/** Unsafe version of {@link #vkGetDeviceMemoryCommitment GetDeviceMemoryCommitment} */
	@JavadocExclude
	public static void nvkGetDeviceMemoryCommitment(long device, long memory, long pCommittedMemoryInBytes) {
		long __functionAddress = getInstance().GetDeviceMemoryCommitment;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, memory, pCommittedMemoryInBytes);
	}

	/**
	 * Queries the current commitment for a {@code VkDeviceMemory}.
	 *
	 * @param device                  
	 * @param memory                  
	 * @param pCommittedMemoryInBytes 
	 */
	public static void vkGetDeviceMemoryCommitment(long device, long memory, ByteBuffer pCommittedMemoryInBytes) {
		if ( CHECKS )
			checkBuffer(pCommittedMemoryInBytes, 1 << 3);
		nvkGetDeviceMemoryCommitment(device, memory, memAddress(pCommittedMemoryInBytes));
	}

	/** Alternative version of: {@link #vkGetDeviceMemoryCommitment GetDeviceMemoryCommitment} */
	public static void vkGetDeviceMemoryCommitment(long device, long memory, LongBuffer pCommittedMemoryInBytes) {
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
	public static int vkBindBufferMemory(long device, long buffer, long memory, long memoryOffset) {
		long __functionAddress = getInstance().BindBufferMemory;
		if ( CHECKS )
			checkPointer(device);
		return callPJJJI(__functionAddress, device, buffer, memory, memoryOffset);
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
	public static int vkBindImageMemory(long device, long image, long memory, long memoryOffset) {
		long __functionAddress = getInstance().BindImageMemory;
		if ( CHECKS )
			checkPointer(device);
		return callPJJJI(__functionAddress, device, image, memory, memoryOffset);
	}

	// --- [ vkGetBufferMemoryRequirements ] ---

	/** Unsafe version of {@link #vkGetBufferMemoryRequirements GetBufferMemoryRequirements} */
	@JavadocExclude
	public static void nvkGetBufferMemoryRequirements(long device, long buffer, long pMemoryRequirements) {
		long __functionAddress = getInstance().GetBufferMemoryRequirements;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, buffer, pMemoryRequirements);
	}

	/**
	 * Returns the memory requirements for specified Vulkan object.
	 *
	 * @param device              
	 * @param buffer              
	 * @param pMemoryRequirements 
	 */
	public static void vkGetBufferMemoryRequirements(long device, long buffer, VkMemoryRequirements pMemoryRequirements) {
		nvkGetBufferMemoryRequirements(device, buffer, pMemoryRequirements.address());
	}

	// --- [ vkGetImageMemoryRequirements ] ---

	/** Unsafe version of {@link #vkGetImageMemoryRequirements GetImageMemoryRequirements} */
	@JavadocExclude
	public static void nvkGetImageMemoryRequirements(long device, long image, long pMemoryRequirements) {
		long __functionAddress = getInstance().GetImageMemoryRequirements;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, image, pMemoryRequirements);
	}

	/**
	 * Returns the memory requirements for specified Vulkan object.
	 *
	 * @param device              
	 * @param image               
	 * @param pMemoryRequirements 
	 */
	public static void vkGetImageMemoryRequirements(long device, long image, VkMemoryRequirements pMemoryRequirements) {
		nvkGetImageMemoryRequirements(device, image, pMemoryRequirements.address());
	}

	// --- [ vkGetImageSparseMemoryRequirements ] ---

	/** Unsafe version of {@link #vkGetImageSparseMemoryRequirements GetImageSparseMemoryRequirements} */
	@JavadocExclude
	public static void nvkGetImageSparseMemoryRequirements(long device, long image, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
		long __functionAddress = getInstance().GetImageSparseMemoryRequirements;
		if ( CHECKS )
			checkPointer(device);
		callPJPPV(__functionAddress, device, image, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
	}

	/**
	 * Queries the memory requirements for a sparse image.
	 *
	 * @param device                        
	 * @param image                         
	 * @param pSparseMemoryRequirementCount 
	 * @param pSparseMemoryRequirements     
	 */
	public static void vkGetImageSparseMemoryRequirements(long device, long image, ByteBuffer pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements.Buffer pSparseMemoryRequirements) {
		if ( CHECKS ) {
			checkBuffer(pSparseMemoryRequirementCount, 1 << 2);
			if ( pSparseMemoryRequirements != null ) checkBuffer(pSparseMemoryRequirements, pSparseMemoryRequirementCount.getInt(pSparseMemoryRequirementCount.position()));
		}
		nvkGetImageSparseMemoryRequirements(device, image, memAddress(pSparseMemoryRequirementCount), pSparseMemoryRequirements == null ? NULL : pSparseMemoryRequirements.address());
	}

	/** Alternative version of: {@link #vkGetImageSparseMemoryRequirements GetImageSparseMemoryRequirements} */
	public static void vkGetImageSparseMemoryRequirements(long device, long image, IntBuffer pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements.Buffer pSparseMemoryRequirements) {
		if ( CHECKS ) {
			checkBuffer(pSparseMemoryRequirementCount, 1);
			if ( pSparseMemoryRequirements != null ) checkBuffer(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
		}
		nvkGetImageSparseMemoryRequirements(device, image, memAddress(pSparseMemoryRequirementCount), pSparseMemoryRequirements == null ? NULL : pSparseMemoryRequirements.address());
	}

	// --- [ vkGetPhysicalDeviceSparseImageFormatProperties ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties} */
	@JavadocExclude
	public static void nvkGetPhysicalDeviceSparseImageFormatProperties(long physicalDevice, int format, int type, int samples, int usage, int tiling, long pPropertyCount, long pProperties) {
		long __functionAddress = getInstance().GetPhysicalDeviceSparseImageFormatProperties;
		if ( CHECKS )
			checkPointer(physicalDevice);
		callPIIIIIPPV(__functionAddress, physicalDevice, format, type, samples, usage, tiling, pPropertyCount, pProperties);
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
	public static void vkGetPhysicalDeviceSparseImageFormatProperties(long physicalDevice, int format, int type, int samples, int usage, int tiling, ByteBuffer pPropertyCount, VkSparseImageFormatProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1 << 2);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.getInt(pPropertyCount.position()));
		}
		nvkGetPhysicalDeviceSparseImageFormatProperties(physicalDevice, format, type, samples, usage, tiling, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** Alternative version of: {@link #vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties} */
	public static void vkGetPhysicalDeviceSparseImageFormatProperties(long physicalDevice, int format, int type, int samples, int usage, int tiling, IntBuffer pPropertyCount, VkSparseImageFormatProperties.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		nvkGetPhysicalDeviceSparseImageFormatProperties(physicalDevice, format, type, samples, usage, tiling, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	// --- [ vkQueueBindSparse ] ---

	/** Unsafe version of {@link #vkQueueBindSparse QueueBindSparse} */
	@JavadocExclude
	public static int nvkQueueBindSparse(long queue, int bindInfoCount, long pBindInfo, long fence) {
		long __functionAddress = getInstance().QueueBindSparse;
		if ( CHECKS )
			checkPointer(queue);
		return callPIPJI(__functionAddress, queue, bindInfoCount, pBindInfo, fence);
	}

	/**
	 * Binds device memory to a sparse resource object.
	 *
	 * @param queue         
	 * @param bindInfoCount 
	 * @param pBindInfo     
	 * @param fence         
	 */
	public static int vkQueueBindSparse(long queue, int bindInfoCount, VkBindSparseInfo.Buffer pBindInfo, long fence) {
		if ( CHECKS )
			checkBuffer(pBindInfo, bindInfoCount);
		return nvkQueueBindSparse(queue, bindInfoCount, pBindInfo.address(), fence);
	}

	/** Alternative version of: {@link #vkQueueBindSparse QueueBindSparse} */
	public static int vkQueueBindSparse(long queue, VkBindSparseInfo.Buffer pBindInfo, long fence) {
		return nvkQueueBindSparse(queue, pBindInfo.remaining(), pBindInfo.address(), fence);
	}

	/** Single value version of: {@link #vkQueueBindSparse QueueBindSparse} */
	public static int vkQueueBindSparse(long queue, VkBindSparseInfo pBindInfo, long fence) {
		return nvkQueueBindSparse(queue, 1, pBindInfo.address(), fence);
	}

	// --- [ vkCreateFence ] ---

	/** Unsafe version of {@link #vkCreateFence CreateFence} */
	@JavadocExclude
	public static int nvkCreateFence(long device, long pCreateInfo, long pAllocator, long pFence) {
		long __functionAddress = getInstance().CreateFence;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pFence);
	}

	/**
	 * Creates a new fence object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pFence      
	 */
	public static int vkCreateFence(long device, VkFenceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pFence) {
		if ( CHECKS )
			checkBuffer(pFence, 1 << 3);
		return nvkCreateFence(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pFence));
	}

	/** Alternative version of: {@link #vkCreateFence CreateFence} */
	public static int vkCreateFence(long device, VkFenceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pFence) {
		if ( CHECKS )
			checkBuffer(pFence, 1);
		return nvkCreateFence(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pFence));
	}

	// --- [ vkDestroyFence ] ---

	/** Unsafe version of {@link #vkDestroyFence DestroyFence} */
	@JavadocExclude
	public static void nvkDestroyFence(long device, long fence, long pAllocator) {
		long __functionAddress = getInstance().DestroyFence;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, fence, pAllocator);
	}

	/**
	 * Destroys a fence object.
	 *
	 * @param device     
	 * @param fence      
	 * @param pAllocator 
	 */
	public static void vkDestroyFence(long device, long fence, VkAllocationCallbacks pAllocator) {
		nvkDestroyFence(device, fence, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkResetFences ] ---

	/** Unsafe version of {@link #vkResetFences ResetFences} */
	@JavadocExclude
	public static int nvkResetFences(long device, int fenceCount, long pFences) {
		long __functionAddress = getInstance().ResetFences;
		if ( CHECKS )
			checkPointer(device);
		return callPIPI(__functionAddress, device, fenceCount, pFences);
	}

	/**
	 * Resets one or more fence objects.
	 *
	 * @param device     
	 * @param fenceCount 
	 * @param pFences    
	 */
	public static int vkResetFences(long device, int fenceCount, ByteBuffer pFences) {
		if ( CHECKS )
			checkBuffer(pFences, fenceCount << 3);
		return nvkResetFences(device, fenceCount, memAddress(pFences));
	}

	/** Alternative version of: {@link #vkResetFences ResetFences} */
	public static int vkResetFences(long device, LongBuffer pFences) {
		return nvkResetFences(device, pFences.remaining(), memAddress(pFences));
	}

	/** Single value version of: {@link #vkResetFences ResetFences} */
	public static int vkResetFences(long device, long pFence) {
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
	public static int vkGetFenceStatus(long device, long fence) {
		long __functionAddress = getInstance().GetFenceStatus;
		if ( CHECKS )
			checkPointer(device);
		return callPJI(__functionAddress, device, fence);
	}

	// --- [ vkWaitForFences ] ---

	/** Unsafe version of {@link #vkWaitForFences WaitForFences} */
	@JavadocExclude
	public static int nvkWaitForFences(long device, int fenceCount, long pFences, int waitAll, long timeout) {
		long __functionAddress = getInstance().WaitForFences;
		if ( CHECKS )
			checkPointer(device);
		return callPIPIJI(__functionAddress, device, fenceCount, pFences, waitAll, timeout);
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
	public static int vkWaitForFences(long device, int fenceCount, ByteBuffer pFences, int waitAll, long timeout) {
		if ( CHECKS )
			checkBuffer(pFences, fenceCount << 3);
		return nvkWaitForFences(device, fenceCount, memAddress(pFences), waitAll, timeout);
	}

	/** Alternative version of: {@link #vkWaitForFences WaitForFences} */
	public static int vkWaitForFences(long device, LongBuffer pFences, int waitAll, long timeout) {
		return nvkWaitForFences(device, pFences.remaining(), memAddress(pFences), waitAll, timeout);
	}

	/** Single value version of: {@link #vkWaitForFences WaitForFences} */
	public static int vkWaitForFences(long device, long pFence, int waitAll, long timeout) {
		APIBuffer __buffer = apiBuffer();
		int pFences = __buffer.longParam(pFence);
		return nvkWaitForFences(device, 1, __buffer.address(pFences), waitAll, timeout);
	}

	// --- [ vkCreateSemaphore ] ---

	/** Unsafe version of {@link #vkCreateSemaphore CreateSemaphore} */
	@JavadocExclude
	public static int nvkCreateSemaphore(long device, long pCreateInfo, long pAllocator, long pSemaphore) {
		long __functionAddress = getInstance().CreateSemaphore;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pSemaphore);
	}

	/**
	 * Creates a new queue semaphore object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pSemaphore  
	 */
	public static int vkCreateSemaphore(long device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pSemaphore) {
		if ( CHECKS )
			checkBuffer(pSemaphore, 1 << 3);
		return nvkCreateSemaphore(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSemaphore));
	}

	/** Alternative version of: {@link #vkCreateSemaphore CreateSemaphore} */
	public static int vkCreateSemaphore(long device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSemaphore) {
		if ( CHECKS )
			checkBuffer(pSemaphore, 1);
		return nvkCreateSemaphore(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSemaphore));
	}

	// --- [ vkDestroySemaphore ] ---

	/** Unsafe version of {@link #vkDestroySemaphore DestroySemaphore} */
	@JavadocExclude
	public static void nvkDestroySemaphore(long device, long semaphore, long pAllocator) {
		long __functionAddress = getInstance().DestroySemaphore;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, semaphore, pAllocator);
	}

	/**
	 * Destroys a semaphore object.
	 *
	 * @param device     
	 * @param semaphore  
	 * @param pAllocator 
	 */
	public static void vkDestroySemaphore(long device, long semaphore, VkAllocationCallbacks pAllocator) {
		nvkDestroySemaphore(device, semaphore, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateEvent ] ---

	/** Unsafe version of {@link #vkCreateEvent CreateEvent} */
	@JavadocExclude
	public static int nvkCreateEvent(long device, long pCreateInfo, long pAllocator, long pEvent) {
		long __functionAddress = getInstance().CreateEvent;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pEvent);
	}

	/**
	 * Creates a new event object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pEvent      
	 */
	public static int vkCreateEvent(long device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pEvent) {
		if ( CHECKS )
			checkBuffer(pEvent, 1 << 3);
		return nvkCreateEvent(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pEvent));
	}

	/** Alternative version of: {@link #vkCreateEvent CreateEvent} */
	public static int vkCreateEvent(long device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pEvent) {
		if ( CHECKS )
			checkBuffer(pEvent, 1);
		return nvkCreateEvent(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pEvent));
	}

	// --- [ vkDestroyEvent ] ---

	/** Unsafe version of {@link #vkDestroyEvent DestroyEvent} */
	@JavadocExclude
	public static void nvkDestroyEvent(long device, long event, long pAllocator) {
		long __functionAddress = getInstance().DestroyEvent;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, event, pAllocator);
	}

	/**
	 * Destroys an event object.
	 *
	 * @param device     
	 * @param event      
	 * @param pAllocator 
	 */
	public static void vkDestroyEvent(long device, long event, VkAllocationCallbacks pAllocator) {
		nvkDestroyEvent(device, event, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetEventStatus ] ---

	/**
	 * Retrieves the status of an event object.
	 *
	 * @param device 
	 * @param event  
	 */
	public static int vkGetEventStatus(long device, long event) {
		long __functionAddress = getInstance().GetEventStatus;
		if ( CHECKS )
			checkPointer(device);
		return callPJI(__functionAddress, device, event);
	}

	// --- [ vkSetEvent ] ---

	/**
	 * Sets an event to signaled state.
	 *
	 * @param device 
	 * @param event  
	 */
	public static int vkSetEvent(long device, long event) {
		long __functionAddress = getInstance().SetEvent;
		if ( CHECKS )
			checkPointer(device);
		return callPJI(__functionAddress, device, event);
	}

	// --- [ vkResetEvent ] ---

	/**
	 * Resets an event to non-signaled state.
	 *
	 * @param device 
	 * @param event  
	 */
	public static int vkResetEvent(long device, long event) {
		long __functionAddress = getInstance().ResetEvent;
		if ( CHECKS )
			checkPointer(device);
		return callPJI(__functionAddress, device, event);
	}

	// --- [ vkCreateQueryPool ] ---

	/** Unsafe version of {@link #vkCreateQueryPool CreateQueryPool} */
	@JavadocExclude
	public static int nvkCreateQueryPool(long device, long pCreateInfo, long pAllocator, long pQueryPool) {
		long __functionAddress = getInstance().CreateQueryPool;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pQueryPool);
	}

	/**
	 * Creates a new query pool object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pQueryPool  
	 */
	public static int vkCreateQueryPool(long device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pQueryPool) {
		if ( CHECKS )
			checkBuffer(pQueryPool, 1 << 3);
		return nvkCreateQueryPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pQueryPool));
	}

	/** Alternative version of: {@link #vkCreateQueryPool CreateQueryPool} */
	public static int vkCreateQueryPool(long device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pQueryPool) {
		if ( CHECKS )
			checkBuffer(pQueryPool, 1);
		return nvkCreateQueryPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pQueryPool));
	}

	// --- [ vkDestroyQueryPool ] ---

	/** Unsafe version of {@link #vkDestroyQueryPool DestroyQueryPool} */
	@JavadocExclude
	public static void nvkDestroyQueryPool(long device, long queryPool, long pAllocator) {
		long __functionAddress = getInstance().DestroyQueryPool;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, queryPool, pAllocator);
	}

	/**
	 * Destroys a query pool object.
	 *
	 * @param device     
	 * @param queryPool  
	 * @param pAllocator 
	 */
	public static void vkDestroyQueryPool(long device, long queryPool, VkAllocationCallbacks pAllocator) {
		nvkDestroyQueryPool(device, queryPool, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetQueryPoolResults ] ---

	/** Unsafe version of {@link #vkGetQueryPoolResults GetQueryPoolResults} */
	@JavadocExclude
	public static int nvkGetQueryPoolResults(long device, long queryPool, int firstQuery, int queryCount, long dataSize, long pData, long stride, int flags) {
		long __functionAddress = getInstance().GetQueryPoolResults;
		if ( CHECKS )
			checkPointer(device);
		return callPJIIPPJII(__functionAddress, device, queryPool, firstQuery, queryCount, dataSize, pData, stride, flags);
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
	public static int vkGetQueryPoolResults(long device, long queryPool, int firstQuery, int queryCount, long dataSize, ByteBuffer pData, long stride, int flags) {
		if ( CHECKS )
			checkBuffer(pData, dataSize);
		return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, dataSize, memAddress(pData), stride, flags);
	}

	/** Alternative version of: {@link #vkGetQueryPoolResults GetQueryPoolResults} */
	public static int vkGetQueryPoolResults(long device, long queryPool, int firstQuery, int queryCount, ByteBuffer pData, long stride, int flags) {
		return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, pData.remaining(), memAddress(pData), stride, flags);
	}

	// --- [ vkCreateBuffer ] ---

	/** Unsafe version of {@link #vkCreateBuffer CreateBuffer} */
	@JavadocExclude
	public static int nvkCreateBuffer(long device, long pCreateInfo, long pAllocator, long pBuffer) {
		long __functionAddress = getInstance().CreateBuffer;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pBuffer);
	}

	/**
	 * Creates a new buffer object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pBuffer     
	 */
	public static int vkCreateBuffer(long device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pBuffer) {
		if ( CHECKS )
			checkBuffer(pBuffer, 1 << 3);
		return nvkCreateBuffer(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pBuffer));
	}

	/** Alternative version of: {@link #vkCreateBuffer CreateBuffer} */
	public static int vkCreateBuffer(long device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pBuffer) {
		if ( CHECKS )
			checkBuffer(pBuffer, 1);
		return nvkCreateBuffer(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pBuffer));
	}

	// --- [ vkDestroyBuffer ] ---

	/** Unsafe version of {@link #vkDestroyBuffer DestroyBuffer} */
	@JavadocExclude
	public static void nvkDestroyBuffer(long device, long buffer, long pAllocator) {
		long __functionAddress = getInstance().DestroyBuffer;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, buffer, pAllocator);
	}

	/**
	 * Destroys a buffer object.
	 *
	 * @param device     
	 * @param buffer     
	 * @param pAllocator 
	 */
	public static void vkDestroyBuffer(long device, long buffer, VkAllocationCallbacks pAllocator) {
		nvkDestroyBuffer(device, buffer, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateBufferView ] ---

	/** Unsafe version of {@link #vkCreateBufferView CreateBufferView} */
	@JavadocExclude
	public static int nvkCreateBufferView(long device, long pCreateInfo, long pAllocator, long pView) {
		long __functionAddress = getInstance().CreateBufferView;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pView);
	}

	/**
	 * Creates a new buffer view object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pView       
	 */
	public static int vkCreateBufferView(long device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pView) {
		if ( CHECKS )
			checkBuffer(pView, 1 << 3);
		return nvkCreateBufferView(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pView));
	}

	/** Alternative version of: {@link #vkCreateBufferView CreateBufferView} */
	public static int vkCreateBufferView(long device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pView) {
		if ( CHECKS )
			checkBuffer(pView, 1);
		return nvkCreateBufferView(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pView));
	}

	// --- [ vkDestroyBufferView ] ---

	/** Unsafe version of {@link #vkDestroyBufferView DestroyBufferView} */
	@JavadocExclude
	public static void nvkDestroyBufferView(long device, long bufferView, long pAllocator) {
		long __functionAddress = getInstance().DestroyBufferView;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, bufferView, pAllocator);
	}

	/**
	 * Destroys a buffer view object.
	 *
	 * @param device     
	 * @param bufferView 
	 * @param pAllocator 
	 */
	public static void vkDestroyBufferView(long device, long bufferView, VkAllocationCallbacks pAllocator) {
		nvkDestroyBufferView(device, bufferView, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateImage ] ---

	/** Unsafe version of {@link #vkCreateImage CreateImage} */
	@JavadocExclude
	public static int nvkCreateImage(long device, long pCreateInfo, long pAllocator, long pImage) {
		long __functionAddress = getInstance().CreateImage;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pImage);
	}

	/**
	 * Creates a new image object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pImage      
	 */
	public static int vkCreateImage(long device, VkImageCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pImage) {
		if ( CHECKS )
			checkBuffer(pImage, 1 << 3);
		return nvkCreateImage(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pImage));
	}

	/** Alternative version of: {@link #vkCreateImage CreateImage} */
	public static int vkCreateImage(long device, VkImageCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pImage) {
		if ( CHECKS )
			checkBuffer(pImage, 1);
		return nvkCreateImage(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pImage));
	}

	// --- [ vkDestroyImage ] ---

	/** Unsafe version of {@link #vkDestroyImage DestroyImage} */
	@JavadocExclude
	public static void nvkDestroyImage(long device, long image, long pAllocator) {
		long __functionAddress = getInstance().DestroyImage;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, image, pAllocator);
	}

	/**
	 * Destroys an image object.
	 *
	 * @param device     
	 * @param image      
	 * @param pAllocator 
	 */
	public static void vkDestroyImage(long device, long image, VkAllocationCallbacks pAllocator) {
		nvkDestroyImage(device, image, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetImageSubresourceLayout ] ---

	/** Unsafe version of {@link #vkGetImageSubresourceLayout GetImageSubresourceLayout} */
	@JavadocExclude
	public static void nvkGetImageSubresourceLayout(long device, long image, long pSubresource, long pLayout) {
		long __functionAddress = getInstance().GetImageSubresourceLayout;
		if ( CHECKS )
			checkPointer(device);
		callPJPPV(__functionAddress, device, image, pSubresource, pLayout);
	}

	/**
	 * Retrieves information about an image subresource.
	 *
	 * @param device       
	 * @param image        
	 * @param pSubresource 
	 * @param pLayout      
	 */
	public static void vkGetImageSubresourceLayout(long device, long image, VkImageSubresource pSubresource, VkSubresourceLayout.Buffer pLayout) {
		if ( CHECKS )
			checkBuffer(pLayout, 1);
		nvkGetImageSubresourceLayout(device, image, pSubresource.address(), pLayout.address());
	}

	// --- [ vkCreateImageView ] ---

	/** Unsafe version of {@link #vkCreateImageView CreateImageView} */
	@JavadocExclude
	public static int nvkCreateImageView(long device, long pCreateInfo, long pAllocator, long pView) {
		long __functionAddress = getInstance().CreateImageView;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pView);
	}

	/**
	 * Creates an image view from an existing image.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pView       
	 */
	public static int vkCreateImageView(long device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pView) {
		if ( CHECKS )
			checkBuffer(pView, 1 << 3);
		return nvkCreateImageView(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pView));
	}

	/** Alternative version of: {@link #vkCreateImageView CreateImageView} */
	public static int vkCreateImageView(long device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pView) {
		if ( CHECKS )
			checkBuffer(pView, 1);
		return nvkCreateImageView(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pView));
	}

	// --- [ vkDestroyImageView ] ---

	/** Unsafe version of {@link #vkDestroyImageView DestroyImageView} */
	@JavadocExclude
	public static void nvkDestroyImageView(long device, long imageView, long pAllocator) {
		long __functionAddress = getInstance().DestroyImageView;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, imageView, pAllocator);
	}

	/**
	 * Destroys an image view object.
	 *
	 * @param device     
	 * @param imageView  
	 * @param pAllocator 
	 */
	public static void vkDestroyImageView(long device, long imageView, VkAllocationCallbacks pAllocator) {
		nvkDestroyImageView(device, imageView, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateShaderModule ] ---

	/** Unsafe version of {@link #vkCreateShaderModule CreateShaderModule} */
	@JavadocExclude
	public static int nvkCreateShaderModule(long device, long pCreateInfo, long pAllocator, long pShaderModule) {
		long __functionAddress = getInstance().CreateShaderModule;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pShaderModule);
	}

	/**
	 * Creates a new shader module object.
	 *
	 * @param device        
	 * @param pCreateInfo   
	 * @param pAllocator    
	 * @param pShaderModule 
	 */
	public static int vkCreateShaderModule(long device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pShaderModule) {
		if ( CHECKS )
			checkBuffer(pShaderModule, 1 << 3);
		return nvkCreateShaderModule(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pShaderModule));
	}

	/** Alternative version of: {@link #vkCreateShaderModule CreateShaderModule} */
	public static int vkCreateShaderModule(long device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pShaderModule) {
		if ( CHECKS )
			checkBuffer(pShaderModule, 1);
		return nvkCreateShaderModule(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pShaderModule));
	}

	// --- [ vkDestroyShaderModule ] ---

	/** Unsafe version of {@link #vkDestroyShaderModule DestroyShaderModule} */
	@JavadocExclude
	public static void nvkDestroyShaderModule(long device, long shaderModule, long pAllocator) {
		long __functionAddress = getInstance().DestroyShaderModule;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, shaderModule, pAllocator);
	}

	/**
	 * Destroys a shader module module.
	 *
	 * @param device       
	 * @param shaderModule 
	 * @param pAllocator   
	 */
	public static void vkDestroyShaderModule(long device, long shaderModule, VkAllocationCallbacks pAllocator) {
		nvkDestroyShaderModule(device, shaderModule, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreatePipelineCache ] ---

	/** Unsafe version of {@link #vkCreatePipelineCache CreatePipelineCache} */
	@JavadocExclude
	public static int nvkCreatePipelineCache(long device, long pCreateInfo, long pAllocator, long pPipelineCache) {
		long __functionAddress = getInstance().CreatePipelineCache;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pPipelineCache);
	}

	/**
	 * Creates a new pipeline cache.
	 *
	 * @param device         
	 * @param pCreateInfo    
	 * @param pAllocator     
	 * @param pPipelineCache 
	 */
	public static int vkCreatePipelineCache(long device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pPipelineCache) {
		if ( CHECKS )
			checkBuffer(pPipelineCache, 1 << 3);
		return nvkCreatePipelineCache(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelineCache));
	}

	/** Alternative version of: {@link #vkCreatePipelineCache CreatePipelineCache} */
	public static int vkCreatePipelineCache(long device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pPipelineCache) {
		if ( CHECKS )
			checkBuffer(pPipelineCache, 1);
		return nvkCreatePipelineCache(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelineCache));
	}

	// --- [ vkDestroyPipelineCache ] ---

	/** Unsafe version of {@link #vkDestroyPipelineCache DestroyPipelineCache} */
	@JavadocExclude
	public static void nvkDestroyPipelineCache(long device, long pipelineCache, long pAllocator) {
		long __functionAddress = getInstance().DestroyPipelineCache;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, pipelineCache, pAllocator);
	}

	/**
	 * Destroys a pipeline cache object.
	 *
	 * @param device        
	 * @param pipelineCache 
	 * @param pAllocator    
	 */
	public static void vkDestroyPipelineCache(long device, long pipelineCache, VkAllocationCallbacks pAllocator) {
		nvkDestroyPipelineCache(device, pipelineCache, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetPipelineCacheData ] ---

	/** Unsafe version of {@link #vkGetPipelineCacheData GetPipelineCacheData} */
	@JavadocExclude
	public static int nvkGetPipelineCacheData(long device, long pipelineCache, long pDataSize, long pData) {
		long __functionAddress = getInstance().GetPipelineCacheData;
		if ( CHECKS )
			checkPointer(device);
		return callPJPPI(__functionAddress, device, pipelineCache, pDataSize, pData);
	}

	/**
	 * Gets the data store from a pipeline cache.
	 *
	 * @param device        
	 * @param pipelineCache 
	 * @param pDataSize     
	 * @param pData         
	 */
	public static int vkGetPipelineCacheData(long device, long pipelineCache, ByteBuffer pDataSize, ByteBuffer pData) {
		if ( CHECKS ) {
			checkBuffer(pDataSize, 1 << POINTER_SHIFT);
			if ( pData != null ) checkBuffer(pData, PointerBuffer.get(pDataSize, pDataSize.position()));
		}
		return nvkGetPipelineCacheData(device, pipelineCache, memAddress(pDataSize), memAddressSafe(pData));
	}

	/** Alternative version of: {@link #vkGetPipelineCacheData GetPipelineCacheData} */
	public static int vkGetPipelineCacheData(long device, long pipelineCache, PointerBuffer pDataSize, ByteBuffer pData) {
		if ( CHECKS ) {
			checkBuffer(pDataSize, 1);
			if ( pData != null ) checkBuffer(pData, pDataSize.get(pDataSize.position()));
		}
		return nvkGetPipelineCacheData(device, pipelineCache, memAddress(pDataSize), memAddressSafe(pData));
	}

	// --- [ vkMergePipelineCaches ] ---

	/** Unsafe version of {@link #vkMergePipelineCaches MergePipelineCaches} */
	@JavadocExclude
	public static int nvkMergePipelineCaches(long device, long dstCache, int srcCacheCount, long pSrcCaches) {
		long __functionAddress = getInstance().MergePipelineCaches;
		if ( CHECKS )
			checkPointer(device);
		return callPJIPI(__functionAddress, device, dstCache, srcCacheCount, pSrcCaches);
	}

	/**
	 * Combines the data stores of pipeline caches.
	 *
	 * @param device        
	 * @param dstCache      
	 * @param srcCacheCount 
	 * @param pSrcCaches    
	 */
	public static int vkMergePipelineCaches(long device, long dstCache, int srcCacheCount, ByteBuffer pSrcCaches) {
		if ( CHECKS )
			checkBuffer(pSrcCaches, srcCacheCount << 3);
		return nvkMergePipelineCaches(device, dstCache, srcCacheCount, memAddress(pSrcCaches));
	}

	/** Alternative version of: {@link #vkMergePipelineCaches MergePipelineCaches} */
	public static int vkMergePipelineCaches(long device, long dstCache, LongBuffer pSrcCaches) {
		return nvkMergePipelineCaches(device, dstCache, pSrcCaches.remaining(), memAddress(pSrcCaches));
	}

	// --- [ vkCreateGraphicsPipelines ] ---

	/** Unsafe version of {@link #vkCreateGraphicsPipelines CreateGraphicsPipelines} */
	@JavadocExclude
	public static int nvkCreateGraphicsPipelines(long device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
		long __functionAddress = getInstance().CreateGraphicsPipelines;
		if ( CHECKS )
			checkPointer(device);
		return callPJIPPPI(__functionAddress, device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);
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
	public static int vkCreateGraphicsPipelines(long device, long pipelineCache, int createInfoCount, VkGraphicsPipelineCreateInfo.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, ByteBuffer pPipelines) {
		if ( CHECKS ) {
			checkBuffer(pCreateInfos, createInfoCount);
			checkBuffer(pPipelines, createInfoCount << 3);
		}
		return nvkCreateGraphicsPipelines(device, pipelineCache, createInfoCount, pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelines));
	}

	/** Alternative version of: {@link #vkCreateGraphicsPipelines CreateGraphicsPipelines} */
	public static int vkCreateGraphicsPipelines(long device, long pipelineCache, VkGraphicsPipelineCreateInfo.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, LongBuffer pPipelines) {
		if ( CHECKS )
			checkBuffer(pPipelines, pCreateInfos.remaining());
		return nvkCreateGraphicsPipelines(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelines));
	}

	// --- [ vkCreateComputePipelines ] ---

	/** Unsafe version of {@link #vkCreateComputePipelines CreateComputePipelines} */
	@JavadocExclude
	public static int nvkCreateComputePipelines(long device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
		long __functionAddress = getInstance().CreateComputePipelines;
		if ( CHECKS )
			checkPointer(device);
		return callPJIPPPI(__functionAddress, device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);
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
	public static int vkCreateComputePipelines(long device, long pipelineCache, int createInfoCount, VkComputePipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, ByteBuffer pPipelines) {
		if ( CHECKS )
			checkBuffer(pPipelines, 1 << 3);
		return nvkCreateComputePipelines(device, pipelineCache, createInfoCount, pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelines));
	}

	/** Alternative version of: {@link #vkCreateComputePipelines CreateComputePipelines} */
	public static int vkCreateComputePipelines(long device, long pipelineCache, int createInfoCount, VkComputePipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, LongBuffer pPipelines) {
		if ( CHECKS )
			checkBuffer(pPipelines, 1);
		return nvkCreateComputePipelines(device, pipelineCache, createInfoCount, pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelines));
	}

	// --- [ vkDestroyPipeline ] ---

	/** Unsafe version of {@link #vkDestroyPipeline DestroyPipeline} */
	@JavadocExclude
	public static void nvkDestroyPipeline(long device, long pipeline, long pAllocator) {
		long __functionAddress = getInstance().DestroyPipeline;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, pipeline, pAllocator);
	}

	/**
	 * Destroys a pipeline object.
	 *
	 * @param device     
	 * @param pipeline   
	 * @param pAllocator 
	 */
	public static void vkDestroyPipeline(long device, long pipeline, VkAllocationCallbacks pAllocator) {
		nvkDestroyPipeline(device, pipeline, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreatePipelineLayout ] ---

	/** Unsafe version of {@link #vkCreatePipelineLayout CreatePipelineLayout} */
	@JavadocExclude
	public static int nvkCreatePipelineLayout(long device, long pCreateInfo, long pAllocator, long pPipelineLayout) {
		long __functionAddress = getInstance().CreatePipelineLayout;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pPipelineLayout);
	}

	/**
	 * Creates a new pipeline layout object.
	 *
	 * @param device          
	 * @param pCreateInfo     
	 * @param pAllocator      
	 * @param pPipelineLayout 
	 */
	public static int vkCreatePipelineLayout(long device, VkPipelineLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pPipelineLayout) {
		if ( CHECKS )
			checkBuffer(pPipelineLayout, 1 << 3);
		return nvkCreatePipelineLayout(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelineLayout));
	}

	/** Alternative version of: {@link #vkCreatePipelineLayout CreatePipelineLayout} */
	public static int vkCreatePipelineLayout(long device, VkPipelineLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pPipelineLayout) {
		if ( CHECKS )
			checkBuffer(pPipelineLayout, 1);
		return nvkCreatePipelineLayout(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pPipelineLayout));
	}

	// --- [ vkDestroyPipelineLayout ] ---

	/** Unsafe version of {@link #vkDestroyPipelineLayout DestroyPipelineLayout} */
	@JavadocExclude
	public static void nvkDestroyPipelineLayout(long device, long pipelineLayout, long pAllocator) {
		long __functionAddress = getInstance().DestroyPipelineLayout;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, pipelineLayout, pAllocator);
	}

	/**
	 * Destroys a pipeline layout object.
	 *
	 * @param device         
	 * @param pipelineLayout 
	 * @param pAllocator     
	 */
	public static void vkDestroyPipelineLayout(long device, long pipelineLayout, VkAllocationCallbacks pAllocator) {
		nvkDestroyPipelineLayout(device, pipelineLayout, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateSampler ] ---

	/** Unsafe version of {@link #vkCreateSampler CreateSampler} */
	@JavadocExclude
	public static int nvkCreateSampler(long device, long pCreateInfo, long pAllocator, long pSampler) {
		long __functionAddress = getInstance().CreateSampler;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pSampler);
	}

	/**
	 * Creates a new sampler object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pSampler    
	 */
	public static int vkCreateSampler(long device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pSampler) {
		if ( CHECKS )
			checkBuffer(pSampler, 1 << 3);
		return nvkCreateSampler(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSampler));
	}

	/** Alternative version of: {@link #vkCreateSampler CreateSampler} */
	public static int vkCreateSampler(long device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSampler) {
		if ( CHECKS )
			checkBuffer(pSampler, 1);
		return nvkCreateSampler(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSampler));
	}

	// --- [ vkDestroySampler ] ---

	/** Unsafe version of {@link #vkDestroySampler DestroySampler} */
	@JavadocExclude
	public static void nvkDestroySampler(long device, long sampler, long pAllocator) {
		long __functionAddress = getInstance().DestroySampler;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, sampler, pAllocator);
	}

	/**
	 * Destroys a sampler object.
	 *
	 * @param device     
	 * @param sampler    
	 * @param pAllocator 
	 */
	public static void vkDestroySampler(long device, long sampler, VkAllocationCallbacks pAllocator) {
		nvkDestroySampler(device, sampler, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateDescriptorSetLayout ] ---

	/** Unsafe version of {@link #vkCreateDescriptorSetLayout CreateDescriptorSetLayout} */
	@JavadocExclude
	public static int nvkCreateDescriptorSetLayout(long device, long pCreateInfo, long pAllocator, long pSetLayout) {
		long __functionAddress = getInstance().CreateDescriptorSetLayout;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pSetLayout);
	}

	/**
	 * Creates a new descriptor set layout.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pSetLayout  
	 */
	public static int vkCreateDescriptorSetLayout(long device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pSetLayout) {
		if ( CHECKS )
			checkBuffer(pSetLayout, 1 << 3);
		return nvkCreateDescriptorSetLayout(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSetLayout));
	}

	/** Alternative version of: {@link #vkCreateDescriptorSetLayout CreateDescriptorSetLayout} */
	public static int vkCreateDescriptorSetLayout(long device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSetLayout) {
		if ( CHECKS )
			checkBuffer(pSetLayout, 1);
		return nvkCreateDescriptorSetLayout(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSetLayout));
	}

	// --- [ vkDestroyDescriptorSetLayout ] ---

	/** Unsafe version of {@link #vkDestroyDescriptorSetLayout DestroyDescriptorSetLayout} */
	@JavadocExclude
	public static void nvkDestroyDescriptorSetLayout(long device, long descriptorSetLayout, long pAllocator) {
		long __functionAddress = getInstance().DestroyDescriptorSetLayout;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, descriptorSetLayout, pAllocator);
	}

	/**
	 * Destroys a descriptor set layout object.
	 *
	 * @param device              
	 * @param descriptorSetLayout 
	 * @param pAllocator          
	 */
	public static void vkDestroyDescriptorSetLayout(long device, long descriptorSetLayout, VkAllocationCallbacks pAllocator) {
		nvkDestroyDescriptorSetLayout(device, descriptorSetLayout, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateDescriptorPool ] ---

	/** Unsafe version of {@link #vkCreateDescriptorPool CreateDescriptorPool} */
	@JavadocExclude
	public static int nvkCreateDescriptorPool(long device, long pCreateInfo, long pAllocator, long pDescriptorPool) {
		long __functionAddress = getInstance().CreateDescriptorPool;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pDescriptorPool);
	}

	/**
	 * Creates a descriptor pool object.
	 *
	 * @param device          
	 * @param pCreateInfo     
	 * @param pAllocator      
	 * @param pDescriptorPool 
	 */
	public static int vkCreateDescriptorPool(long device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pDescriptorPool) {
		if ( CHECKS )
			checkBuffer(pDescriptorPool, 1 << 3);
		return nvkCreateDescriptorPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pDescriptorPool));
	}

	/** Alternative version of: {@link #vkCreateDescriptorPool CreateDescriptorPool} */
	public static int vkCreateDescriptorPool(long device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pDescriptorPool) {
		if ( CHECKS )
			checkBuffer(pDescriptorPool, 1);
		return nvkCreateDescriptorPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pDescriptorPool));
	}

	// --- [ vkDestroyDescriptorPool ] ---

	/** Unsafe version of {@link #vkDestroyDescriptorPool DestroyDescriptorPool} */
	@JavadocExclude
	public static void nvkDestroyDescriptorPool(long device, long descriptorPool, long pAllocator) {
		long __functionAddress = getInstance().DestroyDescriptorPool;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, descriptorPool, pAllocator);
	}

	/**
	 * Destroys a descriptor pool object.
	 *
	 * @param device         
	 * @param descriptorPool 
	 * @param pAllocator     
	 */
	public static void vkDestroyDescriptorPool(long device, long descriptorPool, VkAllocationCallbacks pAllocator) {
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
	public static int vkResetDescriptorPool(long device, long descriptorPool, int flags) {
		long __functionAddress = getInstance().ResetDescriptorPool;
		if ( CHECKS )
			checkPointer(device);
		return callPJII(__functionAddress, device, descriptorPool, flags);
	}

	// --- [ vkAllocateDescriptorSets ] ---

	/** Unsafe version of {@link #vkAllocateDescriptorSets AllocateDescriptorSets} */
	@JavadocExclude
	public static int nvkAllocateDescriptorSets(long device, long pAllocateInfo, long pDescriptorSets) {
		long __functionAddress = getInstance().AllocateDescriptorSets;
		if ( CHECKS )
			checkPointer(device);
		return callPPPI(__functionAddress, device, pAllocateInfo, pDescriptorSets);
	}

	public static int vkAllocateDescriptorSets(long device, VkDescriptorSetAllocateInfo pAllocateInfo, ByteBuffer pDescriptorSets) {
		if ( CHECKS )
			checkBuffer(pDescriptorSets, 1 << 3);
		return nvkAllocateDescriptorSets(device, pAllocateInfo.address(), memAddress(pDescriptorSets));
	}

	/** Alternative version of: {@link #vkAllocateDescriptorSets AllocateDescriptorSets} */
	public static int vkAllocateDescriptorSets(long device, VkDescriptorSetAllocateInfo pAllocateInfo, LongBuffer pDescriptorSets) {
		if ( CHECKS )
			checkBuffer(pDescriptorSets, 1);
		return nvkAllocateDescriptorSets(device, pAllocateInfo.address(), memAddress(pDescriptorSets));
	}

	// --- [ vkFreeDescriptorSets ] ---

	/** Unsafe version of {@link #vkFreeDescriptorSets FreeDescriptorSets} */
	@JavadocExclude
	public static int nvkFreeDescriptorSets(long device, long descriptorPool, int descriptorSetCount, long pDescriptorSets) {
		long __functionAddress = getInstance().FreeDescriptorSets;
		if ( CHECKS )
			checkPointer(device);
		return callPJIPI(__functionAddress, device, descriptorPool, descriptorSetCount, pDescriptorSets);
	}

	/**
	 * Frees one or more descriptor sets.
	 *
	 * @param device             
	 * @param descriptorPool     
	 * @param descriptorSetCount 
	 * @param pDescriptorSets    
	 */
	public static int vkFreeDescriptorSets(long device, long descriptorPool, int descriptorSetCount, ByteBuffer pDescriptorSets) {
		if ( CHECKS )
			checkBuffer(pDescriptorSets, descriptorSetCount << 3);
		return nvkFreeDescriptorSets(device, descriptorPool, descriptorSetCount, memAddress(pDescriptorSets));
	}

	/** Alternative version of: {@link #vkFreeDescriptorSets FreeDescriptorSets} */
	public static int vkFreeDescriptorSets(long device, long descriptorPool, LongBuffer pDescriptorSets) {
		return nvkFreeDescriptorSets(device, descriptorPool, pDescriptorSets.remaining(), memAddress(pDescriptorSets));
	}

	/** Single value version of: {@link #vkFreeDescriptorSets FreeDescriptorSets} */
	public static int vkFreeDescriptorSets(long device, long descriptorPool, long pDescriptorSet) {
		APIBuffer __buffer = apiBuffer();
		int pDescriptorSets = __buffer.longParam(pDescriptorSet);
		return nvkFreeDescriptorSets(device, descriptorPool, 1, __buffer.address(pDescriptorSets));
	}

	// --- [ vkUpdateDescriptorSets ] ---

	/** Unsafe version of {@link #vkUpdateDescriptorSets UpdateDescriptorSets} */
	@JavadocExclude
	public static void nvkUpdateDescriptorSets(long device, int descriptorWriteCount, long pDescriptorWrites, int descriptorCopyCount, long pDescriptorCopies) {
		long __functionAddress = getInstance().UpdateDescriptorSets;
		if ( CHECKS )
			checkPointer(device);
		callPIPIPV(__functionAddress, device, descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies);
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
	public static void vkUpdateDescriptorSets(long device, int descriptorWriteCount, VkWriteDescriptorSet.Buffer pDescriptorWrites, int descriptorCopyCount, VkCopyDescriptorSet.Buffer pDescriptorCopies) {
		if ( CHECKS ) {
			checkBuffer(pDescriptorWrites, descriptorWriteCount);
			checkBuffer(pDescriptorCopies, descriptorCopyCount);
		}
		nvkUpdateDescriptorSets(device, descriptorWriteCount, pDescriptorWrites.address(), descriptorCopyCount, pDescriptorCopies.address());
	}

	/** Alternative version of: {@link #vkUpdateDescriptorSets UpdateDescriptorSets} */
	public static void vkUpdateDescriptorSets(long device, VkWriteDescriptorSet.Buffer pDescriptorWrites, VkCopyDescriptorSet.Buffer pDescriptorCopies) {
		nvkUpdateDescriptorSets(device, pDescriptorWrites.remaining(), pDescriptorWrites.address(), pDescriptorCopies.remaining(), pDescriptorCopies.address());
	}

	// --- [ vkCreateFramebuffer ] ---

	/** Unsafe version of {@link #vkCreateFramebuffer CreateFramebuffer} */
	@JavadocExclude
	public static int nvkCreateFramebuffer(long device, long pCreateInfo, long pAllocator, long pFramebuffer) {
		long __functionAddress = getInstance().CreateFramebuffer;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pFramebuffer);
	}

	/**
	 * Create a new framebuffer object.
	 *
	 * @param device       
	 * @param pCreateInfo  
	 * @param pAllocator   
	 * @param pFramebuffer 
	 */
	public static int vkCreateFramebuffer(long device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pFramebuffer) {
		if ( CHECKS )
			checkBuffer(pFramebuffer, 1 << 3);
		return nvkCreateFramebuffer(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pFramebuffer));
	}

	/** Alternative version of: {@link #vkCreateFramebuffer CreateFramebuffer} */
	public static int vkCreateFramebuffer(long device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pFramebuffer) {
		if ( CHECKS )
			checkBuffer(pFramebuffer, 1);
		return nvkCreateFramebuffer(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pFramebuffer));
	}

	// --- [ vkDestroyFramebuffer ] ---

	/** Unsafe version of {@link #vkDestroyFramebuffer DestroyFramebuffer} */
	@JavadocExclude
	public static void nvkDestroyFramebuffer(long device, long framebuffer, long pAllocator) {
		long __functionAddress = getInstance().DestroyFramebuffer;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, framebuffer, pAllocator);
	}

	/**
	 * Destroys a framebuffer object.
	 *
	 * @param device      
	 * @param framebuffer 
	 * @param pAllocator  
	 */
	public static void vkDestroyFramebuffer(long device, long framebuffer, VkAllocationCallbacks pAllocator) {
		nvkDestroyFramebuffer(device, framebuffer, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkCreateRenderPass ] ---

	/** Unsafe version of {@link #vkCreateRenderPass CreateRenderPass} */
	@JavadocExclude
	public static int nvkCreateRenderPass(long device, long pCreateInfo, long pAllocator, long pRenderPass) {
		long __functionAddress = getInstance().CreateRenderPass;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pRenderPass);
	}

	/**
	 * Creates a new render pass object.
	 *
	 * @param device      
	 * @param pCreateInfo 
	 * @param pAllocator  
	 * @param pRenderPass 
	 */
	public static int vkCreateRenderPass(long device, VkRenderPassCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pRenderPass) {
		if ( CHECKS )
			checkBuffer(pRenderPass, 1 << 3);
		return nvkCreateRenderPass(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pRenderPass));
	}

	/** Alternative version of: {@link #vkCreateRenderPass CreateRenderPass} */
	public static int vkCreateRenderPass(long device, VkRenderPassCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pRenderPass) {
		if ( CHECKS )
			checkBuffer(pRenderPass, 1);
		return nvkCreateRenderPass(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pRenderPass));
	}

	// --- [ vkDestroyRenderPass ] ---

	/** Unsafe version of {@link #vkDestroyRenderPass DestroyRenderPass} */
	@JavadocExclude
	public static void nvkDestroyRenderPass(long device, long renderPass, long pAllocator) {
		long __functionAddress = getInstance().DestroyRenderPass;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, renderPass, pAllocator);
	}

	/**
	 * Destroys a render pass object.
	 *
	 * @param device     
	 * @param renderPass 
	 * @param pAllocator 
	 */
	public static void vkDestroyRenderPass(long device, long renderPass, VkAllocationCallbacks pAllocator) {
		nvkDestroyRenderPass(device, renderPass, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetRenderAreaGranularity ] ---

	/** Unsafe version of {@link #vkGetRenderAreaGranularity GetRenderAreaGranularity} */
	@JavadocExclude
	public static void nvkGetRenderAreaGranularity(long device, long renderPass, long pGranularity) {
		long __functionAddress = getInstance().GetRenderAreaGranularity;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, renderPass, pGranularity);
	}

	/**
	 * Returns the granularity for optimal render area.
	 *
	 * @param device       
	 * @param renderPass   
	 * @param pGranularity 
	 */
	public static void vkGetRenderAreaGranularity(long device, long renderPass, VkExtent2D pGranularity) {
		nvkGetRenderAreaGranularity(device, renderPass, pGranularity.address());
	}

	// --- [ vkCreateCommandPool ] ---

	/** Unsafe version of {@link #vkCreateCommandPool CreateCommandPool} */
	@JavadocExclude
	public static int nvkCreateCommandPool(long device, long pCreateInfo, long pAllocator, long pCommandPool) {
		long __functionAddress = getInstance().CreateCommandPool;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pCommandPool);
	}

	/**
	 * Creates a new command pool object.
	 *
	 * @param device       
	 * @param pCreateInfo  
	 * @param pAllocator   
	 * @param pCommandPool 
	 */
	public static int vkCreateCommandPool(long device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pCommandPool) {
		if ( CHECKS )
			checkBuffer(pCommandPool, 1 << 3);
		return nvkCreateCommandPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pCommandPool));
	}

	/** Alternative version of: {@link #vkCreateCommandPool CreateCommandPool} */
	public static int vkCreateCommandPool(long device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pCommandPool) {
		if ( CHECKS )
			checkBuffer(pCommandPool, 1);
		return nvkCreateCommandPool(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pCommandPool));
	}

	// --- [ vkDestroyCommandPool ] ---

	/** Unsafe version of {@link #vkDestroyCommandPool DestroyCommandPool} */
	@JavadocExclude
	public static void nvkDestroyCommandPool(long device, long commandPool, long pAllocator) {
		long __functionAddress = getInstance().DestroyCommandPool;
		if ( CHECKS )
			checkPointer(device);
		callPJPV(__functionAddress, device, commandPool, pAllocator);
	}

	/**
	 * Destroys a command pool object.
	 *
	 * @param device      
	 * @param commandPool 
	 * @param pAllocator  
	 */
	public static void vkDestroyCommandPool(long device, long commandPool, VkAllocationCallbacks pAllocator) {
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
	public static int vkResetCommandPool(long device, long commandPool, int flags) {
		long __functionAddress = getInstance().ResetCommandPool;
		if ( CHECKS )
			checkPointer(device);
		return callPJII(__functionAddress, device, commandPool, flags);
	}

	// --- [ vkAllocateCommandBuffers ] ---

	/** Unsafe version of {@link #vkAllocateCommandBuffers AllocateCommandBuffers} */
	@JavadocExclude
	public static int nvkAllocateCommandBuffers(long device, long pAllocateInfo, long pCommandBuffers) {
		long __functionAddress = getInstance().AllocateCommandBuffers;
		if ( CHECKS )
			checkPointer(device);
		return callPPPI(__functionAddress, device, pAllocateInfo, pCommandBuffers);
	}

	public static int vkAllocateCommandBuffers(long device, VkCommandBufferAllocateInfo pAllocateInfo, ByteBuffer pCommandBuffers) {
		if ( CHECKS )
			checkBuffer(pCommandBuffers, 1 << POINTER_SHIFT);
		return nvkAllocateCommandBuffers(device, pAllocateInfo.address(), memAddress(pCommandBuffers));
	}

	/** Alternative version of: {@link #vkAllocateCommandBuffers AllocateCommandBuffers} */
	public static int vkAllocateCommandBuffers(long device, VkCommandBufferAllocateInfo pAllocateInfo, PointerBuffer pCommandBuffers) {
		if ( CHECKS )
			checkBuffer(pCommandBuffers, 1);
		return nvkAllocateCommandBuffers(device, pAllocateInfo.address(), memAddress(pCommandBuffers));
	}

	// --- [ vkFreeCommandBuffers ] ---

	/** Unsafe version of {@link #vkFreeCommandBuffers FreeCommandBuffers} */
	@JavadocExclude
	public static void nvkFreeCommandBuffers(long device, long commandPool, int commandBufferCount, long pCommandBuffers) {
		long __functionAddress = getInstance().FreeCommandBuffers;
		if ( CHECKS )
			checkPointer(device);
		callPJIPV(__functionAddress, device, commandPool, commandBufferCount, pCommandBuffers);
	}

	/**
	 * Frees command buffers.
	 *
	 * @param device             
	 * @param commandPool        
	 * @param commandBufferCount 
	 * @param pCommandBuffers    
	 */
	public static void vkFreeCommandBuffers(long device, long commandPool, int commandBufferCount, ByteBuffer pCommandBuffers) {
		if ( CHECKS )
			checkBuffer(pCommandBuffers, commandBufferCount << POINTER_SHIFT);
		nvkFreeCommandBuffers(device, commandPool, commandBufferCount, memAddress(pCommandBuffers));
	}

	/** Alternative version of: {@link #vkFreeCommandBuffers FreeCommandBuffers} */
	public static void vkFreeCommandBuffers(long device, long commandPool, PointerBuffer pCommandBuffers) {
		nvkFreeCommandBuffers(device, commandPool, pCommandBuffers.remaining(), memAddress(pCommandBuffers));
	}

	/** Single value version of: {@link #vkFreeCommandBuffers FreeCommandBuffers} */
	public static void vkFreeCommandBuffers(long device, long commandPool, long pCommandBuffer) {
		APIBuffer __buffer = apiBuffer();
		int pCommandBuffers = __buffer.pointerParam(pCommandBuffer);
		nvkFreeCommandBuffers(device, commandPool, 1, __buffer.address(pCommandBuffers));
	}

	// --- [ vkBeginCommandBuffer ] ---

	/** Unsafe version of {@link #vkBeginCommandBuffer BeginCommandBuffer} */
	@JavadocExclude
	public static int nvkBeginCommandBuffer(long commandBuffer, long pBeginInfo) {
		long __functionAddress = getInstance().BeginCommandBuffer;
		if ( CHECKS )
			checkPointer(commandBuffer);
		return callPPI(__functionAddress, commandBuffer, pBeginInfo);
	}

	/**
	 * Starts recording a command buffer.
	 *
	 * @param commandBuffer 
	 * @param pBeginInfo    
	 */
	public static int vkBeginCommandBuffer(long commandBuffer, VkCommandBufferBeginInfo pBeginInfo) {
		return nvkBeginCommandBuffer(commandBuffer, pBeginInfo.address());
	}

	// --- [ vkEndCommandBuffer ] ---

	/**
	 * Finishes recording a command buffer.
	 *
	 * @param commandBuffer 
	 */
	public static int vkEndCommandBuffer(long commandBuffer) {
		long __functionAddress = getInstance().EndCommandBuffer;
		if ( CHECKS )
			checkPointer(commandBuffer);
		return callPI(__functionAddress, commandBuffer);
	}

	// --- [ vkResetCommandBuffer ] ---

	/**
	 * Resets a command buffer.
	 *
	 * @param commandBuffer 
	 * @param flags         
	 */
	public static int vkResetCommandBuffer(long commandBuffer, int flags) {
		long __functionAddress = getInstance().ResetCommandBuffer;
		if ( CHECKS )
			checkPointer(commandBuffer);
		return callPII(__functionAddress, commandBuffer, flags);
	}

	// --- [ vkCmdBindPipeline ] ---

	/**
	 * Binds a pipeline object to a command buffer.
	 *
	 * @param commandBuffer     
	 * @param pipelineBindPoint 
	 * @param pipeline          
	 */
	public static void vkCmdBindPipeline(long commandBuffer, int pipelineBindPoint, long pipeline) {
		long __functionAddress = getInstance().CmdBindPipeline;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIJV(__functionAddress, commandBuffer, pipelineBindPoint, pipeline);
	}

	// --- [ vkCmdSetViewport ] ---

	/** Unsafe version of {@link #vkCmdSetViewport CmdSetViewport} */
	@JavadocExclude
	public static void nvkCmdSetViewport(long commandBuffer, int firstViewport, int viewportCount, long pViewports) {
		long __functionAddress = getInstance().CmdSetViewport;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIIPV(__functionAddress, commandBuffer, firstViewport, viewportCount, pViewports);
	}

	/**
	 * Sets the viewport on a command buffer.
	 *
	 * @param commandBuffer 
	 * @param firstViewport 
	 * @param viewportCount 
	 * @param pViewports    
	 */
	public static void vkCmdSetViewport(long commandBuffer, int firstViewport, int viewportCount, VkViewport.Buffer pViewports) {
		if ( CHECKS )
			checkBuffer(pViewports, viewportCount);
		nvkCmdSetViewport(commandBuffer, firstViewport, viewportCount, pViewports.address());
	}

	/** Alternative version of: {@link #vkCmdSetViewport CmdSetViewport} */
	public static void vkCmdSetViewport(long commandBuffer, int firstViewport, VkViewport.Buffer pViewports) {
		nvkCmdSetViewport(commandBuffer, firstViewport, pViewports.remaining(), pViewports.address());
	}

	// --- [ vkCmdSetScissor ] ---

	/** Unsafe version of {@link #vkCmdSetScissor CmdSetScissor} */
	@JavadocExclude
	public static void nvkCmdSetScissor(long commandBuffer, int firstScissor, int scissorCount, long pScissors) {
		long __functionAddress = getInstance().CmdSetScissor;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIIPV(__functionAddress, commandBuffer, firstScissor, scissorCount, pScissors);
	}

	/**
	 * Set the dynamic scissor rectangles on a command buffer.
	 *
	 * @param commandBuffer 
	 * @param firstScissor  
	 * @param scissorCount  
	 * @param pScissors     
	 */
	public static void vkCmdSetScissor(long commandBuffer, int firstScissor, int scissorCount, VkRect2D.Buffer pScissors) {
		if ( CHECKS )
			checkBuffer(pScissors, scissorCount);
		nvkCmdSetScissor(commandBuffer, firstScissor, scissorCount, pScissors.address());
	}

	/** Alternative version of: {@link #vkCmdSetScissor CmdSetScissor} */
	public static void vkCmdSetScissor(long commandBuffer, int firstScissor, VkRect2D.Buffer pScissors) {
		nvkCmdSetScissor(commandBuffer, firstScissor, pScissors.remaining(), pScissors.address());
	}

	// --- [ vkCmdSetLineWidth ] ---

	/**
	 * Set the dynamic line width state.
	 *
	 * @param commandBuffer 
	 * @param lineWidth     
	 */
	public static void vkCmdSetLineWidth(long commandBuffer, float lineWidth) {
		long __functionAddress = getInstance().CmdSetLineWidth;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPFV(__functionAddress, commandBuffer, lineWidth);
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
	public static void vkCmdSetDepthBias(long commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
		long __functionAddress = getInstance().CmdSetDepthBias;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPFFFV(__functionAddress, commandBuffer, depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor);
	}

	// --- [ vkCmdSetDepthBounds ] ---

	/**
	 * Sets the depth bounds test values for a command buffer.
	 *
	 * @param commandBuffer  
	 * @param minDepthBounds 
	 * @param maxDepthBounds 
	 */
	public static void vkCmdSetDepthBounds(long commandBuffer, float minDepthBounds, float maxDepthBounds) {
		long __functionAddress = getInstance().CmdSetDepthBounds;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPFFV(__functionAddress, commandBuffer, minDepthBounds, maxDepthBounds);
	}

	// --- [ vkCmdSetStencilCompareMask ] ---

	/**
	 * Sets the stencil compare mask dynamic state.
	 *
	 * @param commandBuffer 
	 * @param faceMask      
	 * @param compareMask   
	 */
	public static void vkCmdSetStencilCompareMask(long commandBuffer, int faceMask, int compareMask) {
		long __functionAddress = getInstance().CmdSetStencilCompareMask;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIIV(__functionAddress, commandBuffer, faceMask, compareMask);
	}

	// --- [ vkCmdSetStencilWriteMask ] ---

	/**
	 * Sets the stencil write mask dynamic state.
	 *
	 * @param commandBuffer 
	 * @param faceMask      
	 * @param writeMask     
	 */
	public static void vkCmdSetStencilWriteMask(long commandBuffer, int faceMask, int writeMask) {
		long __functionAddress = getInstance().CmdSetStencilWriteMask;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIIV(__functionAddress, commandBuffer, faceMask, writeMask);
	}

	// --- [ vkCmdSetStencilReference ] ---

	/**
	 * Sets the stencil reference dynamic state.
	 *
	 * @param commandBuffer 
	 * @param faceMask      
	 * @param reference     
	 */
	public static void vkCmdSetStencilReference(long commandBuffer, int faceMask, int reference) {
		long __functionAddress = getInstance().CmdSetStencilReference;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIIV(__functionAddress, commandBuffer, faceMask, reference);
	}

	// --- [ vkCmdBindDescriptorSets ] ---

	/** Unsafe version of {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets} */
	@JavadocExclude
	public static void nvkCmdBindDescriptorSets(long commandBuffer, int pipelineBindPoint, long layout, int firstSet, int descriptorSetCount, long pDescriptorSets, int dynamicOffsetCount, long pDynamicOffsets) {
		long __functionAddress = getInstance().CmdBindDescriptorSets;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIJIIPIPV(__functionAddress, commandBuffer, pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets);
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
	public static void vkCmdBindDescriptorSets(long commandBuffer, int pipelineBindPoint, long layout, int firstSet, int descriptorSetCount, ByteBuffer pDescriptorSets, int dynamicOffsetCount, ByteBuffer pDynamicOffsets) {
		if ( CHECKS ) {
			checkBuffer(pDescriptorSets, descriptorSetCount << 3);
			checkBuffer(pDynamicOffsets, dynamicOffsetCount << 2);
		}
		nvkCmdBindDescriptorSets(commandBuffer, pipelineBindPoint, layout, firstSet, descriptorSetCount, memAddress(pDescriptorSets), dynamicOffsetCount, memAddress(pDynamicOffsets));
	}

	/** Alternative version of: {@link #vkCmdBindDescriptorSets CmdBindDescriptorSets} */
	public static void vkCmdBindDescriptorSets(long commandBuffer, int pipelineBindPoint, long layout, int firstSet, LongBuffer pDescriptorSets, IntBuffer pDynamicOffsets) {
		nvkCmdBindDescriptorSets(commandBuffer, pipelineBindPoint, layout, firstSet, pDescriptorSets.remaining(), memAddress(pDescriptorSets), pDynamicOffsets.remaining(), memAddress(pDynamicOffsets));
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
	public static void vkCmdBindIndexBuffer(long commandBuffer, long buffer, long offset, int indexType) {
		long __functionAddress = getInstance().CmdBindIndexBuffer;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJJIV(__functionAddress, commandBuffer, buffer, offset, indexType);
	}

	// --- [ vkCmdBindVertexBuffers ] ---

	/** Unsafe version of {@link #vkCmdBindVertexBuffers CmdBindVertexBuffers} */
	@JavadocExclude
	public static void nvkCmdBindVertexBuffers(long commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets) {
		long __functionAddress = getInstance().CmdBindVertexBuffers;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIIPPV(__functionAddress, commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets);
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
	public static void vkCmdBindVertexBuffers(long commandBuffer, int firstBinding, int bindingCount, ByteBuffer pBuffers, ByteBuffer pOffsets) {
		if ( CHECKS ) {
			checkBuffer(pBuffers, bindingCount << 3);
			checkBuffer(pOffsets, bindingCount << 3);
		}
		nvkCmdBindVertexBuffers(commandBuffer, firstBinding, bindingCount, memAddress(pBuffers), memAddress(pOffsets));
	}

	/** Alternative version of: {@link #vkCmdBindVertexBuffers CmdBindVertexBuffers} */
	public static void vkCmdBindVertexBuffers(long commandBuffer, int firstBinding, LongBuffer pBuffers, LongBuffer pOffsets) {
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
	public static void vkCmdDraw(long commandBuffer, int vertexCount, int instanceCount, int firstVertex, int firstInstance) {
		long __functionAddress = getInstance().CmdDraw;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIIIIV(__functionAddress, commandBuffer, vertexCount, instanceCount, firstVertex, firstInstance);
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
	public static void vkCmdDrawIndexed(long commandBuffer, int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance) {
		long __functionAddress = getInstance().CmdDrawIndexed;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIIIIIV(__functionAddress, commandBuffer, indexCount, instanceCount, firstIndex, vertexOffset, firstInstance);
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
	public static void vkCmdDrawIndirect(long commandBuffer, long buffer, long offset, int drawCount, int stride) {
		long __functionAddress = getInstance().CmdDrawIndirect;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJJIIV(__functionAddress, commandBuffer, buffer, offset, drawCount, stride);
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
	public static void vkCmdDrawIndexedIndirect(long commandBuffer, long buffer, long offset, int drawCount, int stride) {
		long __functionAddress = getInstance().CmdDrawIndexedIndirect;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJJIIV(__functionAddress, commandBuffer, buffer, offset, drawCount, stride);
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
	public static void vkCmdDispatch(long commandBuffer, int x, int y, int z) {
		long __functionAddress = getInstance().CmdDispatch;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIIIV(__functionAddress, commandBuffer, x, y, z);
	}

	// --- [ vkCmdDispatchIndirect ] ---

	/**
	 * Dispatches compute work items using indirect parameters.
	 *
	 * @param commandBuffer 
	 * @param buffer        
	 * @param offset        
	 */
	public static void vkCmdDispatchIndirect(long commandBuffer, long buffer, long offset) {
		long __functionAddress = getInstance().CmdDispatchIndirect;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJJV(__functionAddress, commandBuffer, buffer, offset);
	}

	// --- [ vkCmdCopyBuffer ] ---

	/** Unsafe version of {@link #vkCmdCopyBuffer CmdCopyBuffer} */
	@JavadocExclude
	public static void nvkCmdCopyBuffer(long commandBuffer, long srcBuffer, long dstBuffer, int regionCount, long pRegions) {
		long __functionAddress = getInstance().CmdCopyBuffer;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJJIPV(__functionAddress, commandBuffer, srcBuffer, dstBuffer, regionCount, pRegions);
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
	public static void vkCmdCopyBuffer(long commandBuffer, long srcBuffer, long dstBuffer, int regionCount, VkBufferCopy.Buffer pRegions) {
		if ( CHECKS )
			checkBuffer(pRegions, regionCount);
		nvkCmdCopyBuffer(commandBuffer, srcBuffer, dstBuffer, regionCount, pRegions.address());
	}

	/** Alternative version of: {@link #vkCmdCopyBuffer CmdCopyBuffer} */
	public static void vkCmdCopyBuffer(long commandBuffer, long srcBuffer, long dstBuffer, VkBufferCopy.Buffer pRegions) {
		nvkCmdCopyBuffer(commandBuffer, srcBuffer, dstBuffer, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdCopyImage ] ---

	/** Unsafe version of {@link #vkCmdCopyImage CmdCopyImage} */
	@JavadocExclude
	public static void nvkCmdCopyImage(long commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
		long __functionAddress = getInstance().CmdCopyImage;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJIJIIPV(__functionAddress, commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
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
	public static void vkCmdCopyImage(long commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, VkImageCopy.Buffer pRegions) {
		if ( CHECKS )
			checkBuffer(pRegions, regionCount);
		nvkCmdCopyImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions.address());
	}

	/** Alternative version of: {@link #vkCmdCopyImage CmdCopyImage} */
	public static void vkCmdCopyImage(long commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageCopy.Buffer pRegions) {
		nvkCmdCopyImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdBlitImage ] ---

	/** Unsafe version of {@link #vkCmdBlitImage CmdBlitImage} */
	@JavadocExclude
	public static void nvkCmdBlitImage(long commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions, int filter) {
		long __functionAddress = getInstance().CmdBlitImage;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJIJIIPIV(__functionAddress, commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter);
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
	public static void vkCmdBlitImage(long commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, VkImageBlit.Buffer pRegions, int filter) {
		if ( CHECKS )
			checkBuffer(pRegions, regionCount);
		nvkCmdBlitImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions.address(), filter);
	}

	/** Alternative version of: {@link #vkCmdBlitImage CmdBlitImage} */
	public static void vkCmdBlitImage(long commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageBlit.Buffer pRegions, int filter) {
		nvkCmdBlitImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address(), filter);
	}

	// --- [ vkCmdCopyBufferToImage ] ---

	/** Unsafe version of {@link #vkCmdCopyBufferToImage CmdCopyBufferToImage} */
	@JavadocExclude
	public static void nvkCmdCopyBufferToImage(long commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
		long __functionAddress = getInstance().CmdCopyBufferToImage;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJJIIPV(__functionAddress, commandBuffer, srcBuffer, dstImage, dstImageLayout, regionCount, pRegions);
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
	public static void vkCmdCopyBufferToImage(long commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, int regionCount, VkBufferImageCopy.Buffer pRegions) {
		if ( CHECKS )
			checkBuffer(pRegions, regionCount);
		nvkCmdCopyBufferToImage(commandBuffer, srcBuffer, dstImage, dstImageLayout, regionCount, pRegions.address());
	}

	/** Alternative version of: {@link #vkCmdCopyBufferToImage CmdCopyBufferToImage} */
	public static void vkCmdCopyBufferToImage(long commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, VkBufferImageCopy.Buffer pRegions) {
		nvkCmdCopyBufferToImage(commandBuffer, srcBuffer, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdCopyImageToBuffer ] ---

	/** Unsafe version of {@link #vkCmdCopyImageToBuffer CmdCopyImageToBuffer} */
	@JavadocExclude
	public static void nvkCmdCopyImageToBuffer(long commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, int regionCount, long pRegions) {
		long __functionAddress = getInstance().CmdCopyImageToBuffer;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJIJIPV(__functionAddress, commandBuffer, srcImage, srcImageLayout, dstBuffer, regionCount, pRegions);
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
	public static void vkCmdCopyImageToBuffer(long commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, int regionCount, VkBufferImageCopy.Buffer pRegions) {
		if ( CHECKS )
			checkBuffer(pRegions, regionCount);
		nvkCmdCopyImageToBuffer(commandBuffer, srcImage, srcImageLayout, dstBuffer, regionCount, pRegions.address());
	}

	/** Alternative version of: {@link #vkCmdCopyImageToBuffer CmdCopyImageToBuffer} */
	public static void vkCmdCopyImageToBuffer(long commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, VkBufferImageCopy.Buffer pRegions) {
		nvkCmdCopyImageToBuffer(commandBuffer, srcImage, srcImageLayout, dstBuffer, pRegions.remaining(), pRegions.address());
	}

	// --- [ vkCmdUpdateBuffer ] ---

	/** Unsafe version of {@link #vkCmdUpdateBuffer CmdUpdateBuffer} */
	@JavadocExclude
	public static void nvkCmdUpdateBuffer(long commandBuffer, long dstBuffer, long dstOffset, long dataSize, long pData) {
		long __functionAddress = getInstance().CmdUpdateBuffer;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJJJPV(__functionAddress, commandBuffer, dstBuffer, dstOffset, dataSize, pData);
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
	public static void vkCmdUpdateBuffer(long commandBuffer, long dstBuffer, long dstOffset, long dataSize, ByteBuffer pData) {
		if ( CHECKS )
			checkBuffer(pData, dataSize << 2);
		nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, dataSize, memAddress(pData));
	}

	/** Alternative version of: {@link #vkCmdUpdateBuffer CmdUpdateBuffer} */
	public static void vkCmdUpdateBuffer(long commandBuffer, long dstBuffer, long dstOffset, IntBuffer pData) {
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
	public static void vkCmdFillBuffer(long commandBuffer, long dstBuffer, long dstOffset, long size, int data) {
		long __functionAddress = getInstance().CmdFillBuffer;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJJJIV(__functionAddress, commandBuffer, dstBuffer, dstOffset, size, data);
	}

	// --- [ vkCmdClearColorImage ] ---

	/** Unsafe version of {@link #vkCmdClearColorImage CmdClearColorImage} */
	@JavadocExclude
	public static void nvkCmdClearColorImage(long commandBuffer, long image, int imageLayout, long pColor, int rangeCount, long pRanges) {
		long __functionAddress = getInstance().CmdClearColorImage;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJIPIPV(__functionAddress, commandBuffer, image, imageLayout, pColor, rangeCount, pRanges);
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
	public static void vkCmdClearColorImage(long commandBuffer, long image, int imageLayout, VkClearColorValue pColor, int rangeCount, VkImageSubresourceRange.Buffer pRanges) {
		if ( CHECKS )
			checkBuffer(pRanges, rangeCount);
		nvkCmdClearColorImage(commandBuffer, image, imageLayout, pColor.address(), rangeCount, pRanges.address());
	}

	/** Alternative version of: {@link #vkCmdClearColorImage CmdClearColorImage} */
	public static void vkCmdClearColorImage(long commandBuffer, long image, int imageLayout, VkClearColorValue pColor, VkImageSubresourceRange.Buffer pRanges) {
		nvkCmdClearColorImage(commandBuffer, image, imageLayout, pColor.address(), pRanges.remaining(), pRanges.address());
	}

	/** Single value version of: {@link #vkCmdClearColorImage CmdClearColorImage} */
	public static void vkCmdClearColorImage(long commandBuffer, long image, int imageLayout, VkClearColorValue pColor, VkImageSubresourceRange pRange) {
		nvkCmdClearColorImage(commandBuffer, image, imageLayout, pColor.address(), 1, pRange.address());
	}

	// --- [ vkCmdClearDepthStencilImage ] ---

	/** Unsafe version of {@link #vkCmdClearDepthStencilImage CmdClearDepthStencilImage} */
	@JavadocExclude
	public static void nvkCmdClearDepthStencilImage(long commandBuffer, long image, int imageLayout, long pDepthStencil, int rangeCount, long pRanges) {
		long __functionAddress = getInstance().CmdClearDepthStencilImage;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJIPIPV(__functionAddress, commandBuffer, image, imageLayout, pDepthStencil, rangeCount, pRanges);
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
	public static void vkCmdClearDepthStencilImage(long commandBuffer, long image, int imageLayout, VkClearDepthStencilValue pDepthStencil, int rangeCount, VkImageSubresourceRange.Buffer pRanges) {
		if ( CHECKS )
			checkBuffer(pRanges, rangeCount);
		nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), rangeCount, pRanges.address());
	}

	/** Alternative version of: {@link #vkCmdClearDepthStencilImage CmdClearDepthStencilImage} */
	public static void vkCmdClearDepthStencilImage(long commandBuffer, long image, int imageLayout, VkClearDepthStencilValue pDepthStencil, VkImageSubresourceRange.Buffer pRanges) {
		nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), pRanges.remaining(), pRanges.address());
	}

	/** Single value version of: {@link #vkCmdClearDepthStencilImage CmdClearDepthStencilImage} */
	public static void vkCmdClearDepthStencilImage(long commandBuffer, long image, int imageLayout, VkClearDepthStencilValue pDepthStencil, VkImageSubresourceRange pRange) {
		nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), 1, pRange.address());
	}

	// --- [ vkCmdClearAttachments ] ---

	/** Unsafe version of {@link #vkCmdClearAttachments CmdClearAttachments} */
	@JavadocExclude
	public static void nvkCmdClearAttachments(long commandBuffer, int attachmentCount, long pAttachments, int rectCount, long pRects) {
		long __functionAddress = getInstance().CmdClearAttachments;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIPIPV(__functionAddress, commandBuffer, attachmentCount, pAttachments, rectCount, pRects);
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
	public static void vkCmdClearAttachments(long commandBuffer, int attachmentCount, VkClearAttachment.Buffer pAttachments, int rectCount, VkClearRect.Buffer pRects) {
		if ( CHECKS ) {
			checkBuffer(pAttachments, attachmentCount);
			checkBuffer(pRects, rectCount);
		}
		nvkCmdClearAttachments(commandBuffer, attachmentCount, pAttachments.address(), rectCount, pRects.address());
	}

	/** Alternative version of: {@link #vkCmdClearAttachments CmdClearAttachments} */
	public static void vkCmdClearAttachments(long commandBuffer, VkClearAttachment.Buffer pAttachments, VkClearRect.Buffer pRects) {
		nvkCmdClearAttachments(commandBuffer, pAttachments.remaining(), pAttachments.address(), pRects.remaining(), pRects.address());
	}

	// --- [ vkCmdResolveImage ] ---

	/** Unsafe version of {@link #vkCmdResolveImage CmdResolveImage} */
	@JavadocExclude
	public static void nvkCmdResolveImage(long commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
		long __functionAddress = getInstance().CmdResolveImage;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJIJIIPV(__functionAddress, commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
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
	public static void vkCmdResolveImage(long commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, VkImageResolve.Buffer pRegions) {
		if ( CHECKS )
			checkBuffer(pRegions, regionCount);
		nvkCmdResolveImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions.address());
	}

	/** Alternative version of: {@link #vkCmdResolveImage CmdResolveImage} */
	public static void vkCmdResolveImage(long commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageResolve.Buffer pRegions) {
		nvkCmdResolveImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
	}

	/** Single value version of: {@link #vkCmdResolveImage CmdResolveImage} */
	public static void vkCmdResolveImage(long commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageResolve pRegion) {
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
	public static void vkCmdSetEvent(long commandBuffer, long event, int stageMask) {
		long __functionAddress = getInstance().CmdSetEvent;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJIV(__functionAddress, commandBuffer, event, stageMask);
	}

	// --- [ vkCmdResetEvent ] ---

	/**
	 * Resets an event object to non-signaled state.
	 *
	 * @param commandBuffer 
	 * @param event         
	 * @param stageMask     
	 */
	public static void vkCmdResetEvent(long commandBuffer, long event, int stageMask) {
		long __functionAddress = getInstance().CmdResetEvent;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJIV(__functionAddress, commandBuffer, event, stageMask);
	}

	// --- [ vkCmdWaitEvents ] ---

	/** Unsafe version of {@link #vkCmdWaitEvents CmdWaitEvents} */
	@JavadocExclude
	public static void nvkCmdWaitEvents(long commandBuffer, int eventCount, long pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers) {
		long __functionAddress = getInstance().CmdWaitEvents;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIPIIIPIPIPV(__functionAddress, commandBuffer, eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
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
	public static void vkCmdWaitEvents(long commandBuffer, int eventCount, ByteBuffer pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, VkMemoryBarrier.Buffer pMemoryBarriers, int bufferMemoryBarrierCount, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, int imageMemoryBarrierCount, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
		if ( CHECKS ) {
			checkBuffer(pEvents, eventCount << 3);
			if ( pMemoryBarriers != null ) checkBuffer(pMemoryBarriers, memoryBarrierCount);
			if ( pBufferMemoryBarriers != null ) checkBuffer(pBufferMemoryBarriers, bufferMemoryBarrierCount);
			if ( pImageMemoryBarriers != null ) checkBuffer(pImageMemoryBarriers, imageMemoryBarrierCount);
		}
		nvkCmdWaitEvents(commandBuffer, eventCount, memAddress(pEvents), srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers == null ? NULL : pMemoryBarriers.address(), bufferMemoryBarrierCount, pBufferMemoryBarriers == null ? NULL : pBufferMemoryBarriers.address(), imageMemoryBarrierCount, pImageMemoryBarriers == null ? NULL : pImageMemoryBarriers.address());
	}

	/** Alternative version of: {@link #vkCmdWaitEvents CmdWaitEvents} */
	public static void vkCmdWaitEvents(long commandBuffer, LongBuffer pEvents, int srcStageMask, int dstStageMask, VkMemoryBarrier.Buffer pMemoryBarriers, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
		nvkCmdWaitEvents(commandBuffer, pEvents.remaining(), memAddress(pEvents), srcStageMask, dstStageMask, pMemoryBarriers == null ? 0 : pMemoryBarriers.remaining(), pMemoryBarriers == null ? NULL : pMemoryBarriers.address(), pBufferMemoryBarriers == null ? 0 : pBufferMemoryBarriers.remaining(), pBufferMemoryBarriers == null ? NULL : pBufferMemoryBarriers.address(), pImageMemoryBarriers == null ? 0 : pImageMemoryBarriers.remaining(), pImageMemoryBarriers == null ? NULL : pImageMemoryBarriers.address());
	}

	// --- [ vkCmdPipelineBarrier ] ---

	/** Unsafe version of {@link #vkCmdPipelineBarrier CmdPipelineBarrier} */
	@JavadocExclude
	public static void nvkCmdPipelineBarrier(long commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers) {
		long __functionAddress = getInstance().CmdPipelineBarrier;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIIIIPIPIPV(__functionAddress, commandBuffer, srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
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
	public static void vkCmdPipelineBarrier(long commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, VkMemoryBarrier.Buffer pMemoryBarriers, int bufferMemoryBarrierCount, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, int imageMemoryBarrierCount, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
		if ( CHECKS ) {
			if ( pMemoryBarriers != null ) checkBuffer(pMemoryBarriers, memoryBarrierCount);
			if ( pBufferMemoryBarriers != null ) checkBuffer(pBufferMemoryBarriers, bufferMemoryBarrierCount);
			if ( pImageMemoryBarriers != null ) checkBuffer(pImageMemoryBarriers, imageMemoryBarrierCount);
		}
		nvkCmdPipelineBarrier(commandBuffer, srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers == null ? NULL : pMemoryBarriers.address(), bufferMemoryBarrierCount, pBufferMemoryBarriers == null ? NULL : pBufferMemoryBarriers.address(), imageMemoryBarrierCount, pImageMemoryBarriers == null ? NULL : pImageMemoryBarriers.address());
	}

	/** Alternative version of: {@link #vkCmdPipelineBarrier CmdPipelineBarrier} */
	public static void vkCmdPipelineBarrier(long commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, VkMemoryBarrier.Buffer pMemoryBarriers, VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
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
	public static void vkCmdBeginQuery(long commandBuffer, long queryPool, int query, int flags) {
		long __functionAddress = getInstance().CmdBeginQuery;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJIIV(__functionAddress, commandBuffer, queryPool, query, flags);
	}

	// --- [ vkCmdEndQuery ] ---

	/**
	 * Ends a query.
	 *
	 * @param commandBuffer 
	 * @param queryPool     
	 * @param query         
	 */
	public static void vkCmdEndQuery(long commandBuffer, long queryPool, int query) {
		long __functionAddress = getInstance().CmdEndQuery;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJIV(__functionAddress, commandBuffer, queryPool, query);
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
	public static void vkCmdResetQueryPool(long commandBuffer, long queryPool, int firstQuery, int queryCount) {
		long __functionAddress = getInstance().CmdResetQueryPool;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJIIV(__functionAddress, commandBuffer, queryPool, firstQuery, queryCount);
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
	public static void vkCmdWriteTimestamp(long commandBuffer, int pipelineStage, long queryPool, int query) {
		long __functionAddress = getInstance().CmdWriteTimestamp;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIJIV(__functionAddress, commandBuffer, pipelineStage, queryPool, query);
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
	public static void vkCmdCopyQueryPoolResults(long commandBuffer, long queryPool, int firstQuery, int queryCount, long dstBuffer, long dstOffset, long stride, int flags) {
		long __functionAddress = getInstance().CmdCopyQueryPoolResults;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJIIJJJIV(__functionAddress, commandBuffer, queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags);
	}

	// --- [ vkCmdPushConstants ] ---

	/** Unsafe version of {@link #vkCmdPushConstants CmdPushConstants} */
	@JavadocExclude
	public static void nvkCmdPushConstants(long commandBuffer, long layout, int stageFlags, int offset, int size, long pValues) {
		long __functionAddress = getInstance().CmdPushConstants;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPJIIIPV(__functionAddress, commandBuffer, layout, stageFlags, offset, size, pValues);
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
	public static void vkCmdPushConstants(long commandBuffer, long layout, int stageFlags, int offset, int size, ByteBuffer pValues) {
		if ( CHECKS )
			checkBuffer(pValues, size);
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, size, memAddress(pValues));
	}

	/** Alternative version of: {@link #vkCmdPushConstants CmdPushConstants} */
	public static void vkCmdPushConstants(long commandBuffer, long layout, int stageFlags, int offset, ByteBuffer pValues) {
		nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining(), memAddress(pValues));
	}

	// --- [ vkCmdBeginRenderPass ] ---

	/** Unsafe version of {@link #vkCmdBeginRenderPass CmdBeginRenderPass} */
	@JavadocExclude
	public static void nvkCmdBeginRenderPass(long commandBuffer, long pRenderPassBegin, int contents) {
		long __functionAddress = getInstance().CmdBeginRenderPass;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPPIV(__functionAddress, commandBuffer, pRenderPassBegin, contents);
	}

	/**
	 * Begins a new render pass.
	 *
	 * @param commandBuffer    
	 * @param pRenderPassBegin 
	 * @param contents         
	 */
	public static void vkCmdBeginRenderPass(long commandBuffer, VkRenderPassBeginInfo pRenderPassBegin, int contents) {
		nvkCmdBeginRenderPass(commandBuffer, pRenderPassBegin.address(), contents);
	}

	// --- [ vkCmdNextSubpass ] ---

	/**
	 * Transitions to the next subpass of a render pass.
	 *
	 * @param commandBuffer 
	 * @param contents      
	 */
	public static void vkCmdNextSubpass(long commandBuffer, int contents) {
		long __functionAddress = getInstance().CmdNextSubpass;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIV(__functionAddress, commandBuffer, contents);
	}

	// --- [ vkCmdEndRenderPass ] ---

	/**
	 * Ends the current render pass.
	 *
	 * @param commandBuffer 
	 */
	public static void vkCmdEndRenderPass(long commandBuffer) {
		long __functionAddress = getInstance().CmdEndRenderPass;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPV(__functionAddress, commandBuffer);
	}

	// --- [ vkCmdExecuteCommands ] ---

	/** Unsafe version of {@link #vkCmdExecuteCommands CmdExecuteCommands} */
	@JavadocExclude
	public static void nvkCmdExecuteCommands(long commandBuffer, int commandBufferCount, long pCommandBuffers) {
		long __functionAddress = getInstance().CmdExecuteCommands;
		if ( CHECKS )
			checkPointer(commandBuffer);
		callPIPV(__functionAddress, commandBuffer, commandBufferCount, pCommandBuffers);
	}

	/**
	 * Executes a secondary command buffer from a primary command buffer.
	 *
	 * @param commandBuffer      
	 * @param commandBufferCount 
	 * @param pCommandBuffers    
	 */
	public static void vkCmdExecuteCommands(long commandBuffer, int commandBufferCount, ByteBuffer pCommandBuffers) {
		if ( CHECKS )
			checkBuffer(pCommandBuffers, commandBufferCount << POINTER_SHIFT);
		nvkCmdExecuteCommands(commandBuffer, commandBufferCount, memAddress(pCommandBuffers));
	}

	/** Alternative version of: {@link #vkCmdExecuteCommands CmdExecuteCommands} */
	public static void vkCmdExecuteCommands(long commandBuffer, PointerBuffer pCommandBuffers) {
		nvkCmdExecuteCommands(commandBuffer, pCommandBuffers.remaining(), memAddress(pCommandBuffers));
	}

	/** Single value version of: {@link #vkCmdExecuteCommands CmdExecuteCommands} */
	public static void vkCmdExecuteCommands(long commandBuffer, long pCommandBuffer) {
		APIBuffer __buffer = apiBuffer();
		int pCommandBuffers = __buffer.pointerParam(pCommandBuffer);
		nvkCmdExecuteCommands(commandBuffer, 1, __buffer.address(pCommandBuffers));
	}

}