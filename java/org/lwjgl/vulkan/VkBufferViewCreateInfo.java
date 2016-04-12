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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkBufferViewCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkBufferViewCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how a buffer view should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
 * <li>{@code offset} <b>must</b> be a multiple of {@link VkPhysicalDeviceLimits}{@code ::minTexelBufferOffsetAlignment}</li>
 * <li>If {@code range} is not equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}:</li>
 * <li>{@code range} <b>must</b> be greater than 0</li>
 * <li>{@code range} <b>must</b> be a multiple of the element size of {@code format}</li>
 * <li>{@code range} divided by the size of an element of {@code format}, <b>must</b> be less than or equal to
 * {@link VkPhysicalDeviceLimits}{@code ::maxTexelBufferElements}</li>
 * <li>the sum of {@code offset} and {@code range} <b>must</b> be less than or equal to the size of {@code buffer}</li>
 * <li>{@code buffer} <b>must</b> have been created with a {@code usage} value containing at least one of {@link VK10#VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT} or
 * {@link VK10#VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT}</li>
 * <li>If {@code buffer} was created with {@code usage} containing {@link VK10#VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT}, {@code format} <b>must</b> be supported for uniform
 * texel buffers, as specified by the {@link VK10#VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT} flag in {@link VkFormatProperties}{@code ::bufferFeatures} returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * <li>If {@code buffer} was created with {@code usage} containing {@link VK10#VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT}, {@code format} <b>must</b> be supported for storage
 * texel buffers, as specified by the {@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT} flag in {@link VkFormatProperties}{@code ::bufferFeatures} returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code buffer} &ndash; a {@code VkBuffer} on which the view will be created</li>
 * <li>{@code format} &ndash; a {@code VkFormat} describing the format of the data elements in the buffer. One of:<br><table><tr><td>{@link VK10#VK_FORMAT_A1R5G5B5_UNORM_PACK16 FORMAT_A1R5G5B5_UNORM_PACK16}</td><td>{@link VK10#VK_FORMAT_A2B10G10R10_SINT_PACK32 FORMAT_A2B10G10R10_SINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A2B10G10R10_SNORM_PACK32 FORMAT_A2B10G10R10_SNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A2B10G10R10_SSCALED_PACK32 FORMAT_A2B10G10R10_SSCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A2B10G10R10_UINT_PACK32 FORMAT_A2B10G10R10_UINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A2B10G10R10_UNORM_PACK32 FORMAT_A2B10G10R10_UNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A2B10G10R10_USCALED_PACK32 FORMAT_A2B10G10R10_USCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A2R10G10B10_SINT_PACK32 FORMAT_A2R10G10B10_SINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A2R10G10B10_SNORM_PACK32 FORMAT_A2R10G10B10_SNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A2R10G10B10_SSCALED_PACK32 FORMAT_A2R10G10B10_SSCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A2R10G10B10_UINT_PACK32 FORMAT_A2R10G10B10_UINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A2R10G10B10_UNORM_PACK32 FORMAT_A2R10G10B10_UNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A2R10G10B10_USCALED_PACK32 FORMAT_A2R10G10B10_USCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_SINT_PACK32 FORMAT_A8B8G8R8_SINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_SNORM_PACK32 FORMAT_A8B8G8R8_SNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A8B8G8R8_SRGB_PACK32 FORMAT_A8B8G8R8_SRGB_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_SSCALED_PACK32 FORMAT_A8B8G8R8_SSCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_UINT_PACK32 FORMAT_A8B8G8R8_UINT_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A8B8G8R8_UNORM_PACK32 FORMAT_A8B8G8R8_UNORM_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_USCALED_PACK32 FORMAT_A8B8G8R8_USCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_ASTC_10x10_SRGB_BLOCK FORMAT_ASTC_10x10_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_10x10_UNORM_BLOCK FORMAT_ASTC_10x10_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_10x5_SRGB_BLOCK FORMAT_ASTC_10x5_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_10x5_UNORM_BLOCK FORMAT_ASTC_10x5_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_10x6_SRGB_BLOCK FORMAT_ASTC_10x6_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_10x6_UNORM_BLOCK FORMAT_ASTC_10x6_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_10x8_SRGB_BLOCK FORMAT_ASTC_10x8_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_10x8_UNORM_BLOCK FORMAT_ASTC_10x8_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_12x10_SRGB_BLOCK FORMAT_ASTC_12x10_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_12x10_UNORM_BLOCK FORMAT_ASTC_12x10_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_12x12_SRGB_BLOCK FORMAT_ASTC_12x12_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_12x12_UNORM_BLOCK FORMAT_ASTC_12x12_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_4x4_SRGB_BLOCK FORMAT_ASTC_4x4_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_4x4_UNORM_BLOCK FORMAT_ASTC_4x4_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_5x4_SRGB_BLOCK FORMAT_ASTC_5x4_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_5x4_UNORM_BLOCK FORMAT_ASTC_5x4_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_5x5_SRGB_BLOCK FORMAT_ASTC_5x5_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_5x5_UNORM_BLOCK FORMAT_ASTC_5x5_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_6x5_SRGB_BLOCK FORMAT_ASTC_6x5_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_6x5_UNORM_BLOCK FORMAT_ASTC_6x5_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_6x6_SRGB_BLOCK FORMAT_ASTC_6x6_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_6x6_UNORM_BLOCK FORMAT_ASTC_6x6_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_8x5_SRGB_BLOCK FORMAT_ASTC_8x5_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_8x5_UNORM_BLOCK FORMAT_ASTC_8x5_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_8x6_SRGB_BLOCK FORMAT_ASTC_8x6_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_8x6_UNORM_BLOCK FORMAT_ASTC_8x6_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_8x8_SRGB_BLOCK FORMAT_ASTC_8x8_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_8x8_UNORM_BLOCK FORMAT_ASTC_8x8_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_B10G11R11_UFLOAT_PACK32 FORMAT_B10G11R11_UFLOAT_PACK32}</td><td>{@link VK10#VK_FORMAT_B4G4R4A4_UNORM_PACK16 FORMAT_B4G4R4A4_UNORM_PACK16}</td><td>{@link VK10#VK_FORMAT_B5G5R5A1_UNORM_PACK16 FORMAT_B5G5R5A1_UNORM_PACK16}</td></tr><tr><td>{@link VK10#VK_FORMAT_B5G6R5_UNORM_PACK16 FORMAT_B5G6R5_UNORM_PACK16}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_SINT FORMAT_B8G8R8A8_SINT}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_SNORM FORMAT_B8G8R8A8_SNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_B8G8R8A8_SRGB FORMAT_B8G8R8A8_SRGB}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_SSCALED FORMAT_B8G8R8A8_SSCALED}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_UINT FORMAT_B8G8R8A8_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_B8G8R8A8_UNORM FORMAT_B8G8R8A8_UNORM}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_USCALED FORMAT_B8G8R8A8_USCALED}</td><td>{@link VK10#VK_FORMAT_B8G8R8_SINT FORMAT_B8G8R8_SINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_B8G8R8_SNORM FORMAT_B8G8R8_SNORM}</td><td>{@link VK10#VK_FORMAT_B8G8R8_SRGB FORMAT_B8G8R8_SRGB}</td><td>{@link VK10#VK_FORMAT_B8G8R8_SSCALED FORMAT_B8G8R8_SSCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_B8G8R8_UINT FORMAT_B8G8R8_UINT}</td><td>{@link VK10#VK_FORMAT_B8G8R8_UNORM FORMAT_B8G8R8_UNORM}</td><td>{@link VK10#VK_FORMAT_B8G8R8_USCALED FORMAT_B8G8R8_USCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC1_RGBA_SRGB_BLOCK FORMAT_BC1_RGBA_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC1_RGBA_UNORM_BLOCK FORMAT_BC1_RGBA_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC1_RGB_SRGB_BLOCK FORMAT_BC1_RGB_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC1_RGB_UNORM_BLOCK FORMAT_BC1_RGB_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC2_SRGB_BLOCK FORMAT_BC2_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC2_UNORM_BLOCK FORMAT_BC2_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC3_SRGB_BLOCK FORMAT_BC3_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC3_UNORM_BLOCK FORMAT_BC3_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC4_SNORM_BLOCK FORMAT_BC4_SNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC4_UNORM_BLOCK FORMAT_BC4_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC5_SNORM_BLOCK FORMAT_BC5_SNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC5_UNORM_BLOCK FORMAT_BC5_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC6H_SFLOAT_BLOCK FORMAT_BC6H_SFLOAT_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC6H_UFLOAT_BLOCK FORMAT_BC6H_UFLOAT_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC7_SRGB_BLOCK FORMAT_BC7_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC7_UNORM_BLOCK FORMAT_BC7_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_D16_UNORM FORMAT_D16_UNORM}</td><td>{@link VK10#VK_FORMAT_D16_UNORM_S8_UINT FORMAT_D16_UNORM_S8_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_D24_UNORM_S8_UINT FORMAT_D24_UNORM_S8_UINT}</td><td>{@link VK10#VK_FORMAT_D32_SFLOAT FORMAT_D32_SFLOAT}</td><td>{@link VK10#VK_FORMAT_D32_SFLOAT_S8_UINT FORMAT_D32_SFLOAT_S8_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 FORMAT_E5B9G9R9_UFLOAT_PACK32}</td><td>{@link VK10#VK_FORMAT_EAC_R11G11_SNORM_BLOCK FORMAT_EAC_R11G11_SNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_EAC_R11G11_UNORM_BLOCK FORMAT_EAC_R11G11_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_EAC_R11_SNORM_BLOCK FORMAT_EAC_R11_SNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_EAC_R11_UNORM_BLOCK FORMAT_EAC_R11_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK FORMAT_ETC2_R8G8B8_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK FORMAT_ETC2_R8G8B8_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_FEATURE_BLIT_DST_BIT FORMAT_FEATURE_BLIT_DST_BIT}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}</td><td>{@link IMGFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT FORMAT_FEATURE_VERTEX_BUFFER_BIT}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_SFLOAT FORMAT_R16G16B16A16_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_SINT FORMAT_R16G16B16A16_SINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16B16A16_SNORM FORMAT_R16G16B16A16_SNORM}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_SSCALED FORMAT_R16G16B16A16_SSCALED}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_UINT FORMAT_R16G16B16A16_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16B16A16_UNORM FORMAT_R16G16B16A16_UNORM}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_USCALED FORMAT_R16G16B16A16_USCALED}</td><td>{@link VK10#VK_FORMAT_R16G16B16_SFLOAT FORMAT_R16G16B16_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16B16_SINT FORMAT_R16G16B16_SINT}</td><td>{@link VK10#VK_FORMAT_R16G16B16_SNORM FORMAT_R16G16B16_SNORM}</td><td>{@link VK10#VK_FORMAT_R16G16B16_SSCALED FORMAT_R16G16B16_SSCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16B16_UINT FORMAT_R16G16B16_UINT}</td><td>{@link VK10#VK_FORMAT_R16G16B16_UNORM FORMAT_R16G16B16_UNORM}</td><td>{@link VK10#VK_FORMAT_R16G16B16_USCALED FORMAT_R16G16B16_USCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16_SFLOAT FORMAT_R16G16_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R16G16_SINT FORMAT_R16G16_SINT}</td><td>{@link VK10#VK_FORMAT_R16G16_SNORM FORMAT_R16G16_SNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16_SSCALED FORMAT_R16G16_SSCALED}</td><td>{@link VK10#VK_FORMAT_R16G16_UINT FORMAT_R16G16_UINT}</td><td>{@link VK10#VK_FORMAT_R16G16_UNORM FORMAT_R16G16_UNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16_USCALED FORMAT_R16G16_USCALED}</td><td>{@link VK10#VK_FORMAT_R16_SFLOAT FORMAT_R16_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R16_SINT FORMAT_R16_SINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16_SNORM FORMAT_R16_SNORM}</td><td>{@link VK10#VK_FORMAT_R16_SSCALED FORMAT_R16_SSCALED}</td><td>{@link VK10#VK_FORMAT_R16_UINT FORMAT_R16_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16_UNORM FORMAT_R16_UNORM}</td><td>{@link VK10#VK_FORMAT_R16_USCALED FORMAT_R16_USCALED}</td><td>{@link VK10#VK_FORMAT_R32G32B32A32_SFLOAT FORMAT_R32G32B32A32_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R32G32B32A32_SINT FORMAT_R32G32B32A32_SINT}</td><td>{@link VK10#VK_FORMAT_R32G32B32A32_UINT FORMAT_R32G32B32A32_UINT}</td><td>{@link VK10#VK_FORMAT_R32G32B32_SFLOAT FORMAT_R32G32B32_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R32G32B32_SINT FORMAT_R32G32B32_SINT}</td><td>{@link VK10#VK_FORMAT_R32G32B32_UINT FORMAT_R32G32B32_UINT}</td><td>{@link VK10#VK_FORMAT_R32G32_SFLOAT FORMAT_R32G32_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R32G32_SINT FORMAT_R32G32_SINT}</td><td>{@link VK10#VK_FORMAT_R32G32_UINT FORMAT_R32G32_UINT}</td><td>{@link VK10#VK_FORMAT_R32_SFLOAT FORMAT_R32_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R32_SINT FORMAT_R32_SINT}</td><td>{@link VK10#VK_FORMAT_R32_UINT FORMAT_R32_UINT}</td><td>{@link VK10#VK_FORMAT_R4G4B4A4_UNORM_PACK16 FORMAT_R4G4B4A4_UNORM_PACK16}</td></tr><tr><td>{@link VK10#VK_FORMAT_R4G4_UNORM_PACK8 FORMAT_R4G4_UNORM_PACK8}</td><td>{@link VK10#VK_FORMAT_R5G5B5A1_UNORM_PACK16 FORMAT_R5G5B5A1_UNORM_PACK16}</td><td>{@link VK10#VK_FORMAT_R5G6B5_UNORM_PACK16 FORMAT_R5G6B5_UNORM_PACK16}</td></tr><tr><td>{@link VK10#VK_FORMAT_R64G64B64A64_SFLOAT FORMAT_R64G64B64A64_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R64G64B64A64_SINT FORMAT_R64G64B64A64_SINT}</td><td>{@link VK10#VK_FORMAT_R64G64B64A64_UINT FORMAT_R64G64B64A64_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R64G64B64_SFLOAT FORMAT_R64G64B64_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R64G64B64_SINT FORMAT_R64G64B64_SINT}</td><td>{@link VK10#VK_FORMAT_R64G64B64_UINT FORMAT_R64G64B64_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R64G64_SFLOAT FORMAT_R64G64_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R64G64_SINT FORMAT_R64G64_SINT}</td><td>{@link VK10#VK_FORMAT_R64G64_UINT FORMAT_R64G64_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R64_SFLOAT FORMAT_R64_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R64_SINT FORMAT_R64_SINT}</td><td>{@link VK10#VK_FORMAT_R64_UINT FORMAT_R64_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8A8_SINT FORMAT_R8G8B8A8_SINT}</td><td>{@link VK10#VK_FORMAT_R8G8B8A8_SNORM FORMAT_R8G8B8A8_SNORM}</td><td>{@link VK10#VK_FORMAT_R8G8B8A8_SRGB FORMAT_R8G8B8A8_SRGB}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8A8_SSCALED FORMAT_R8G8B8A8_SSCALED}</td><td>{@link VK10#VK_FORMAT_R8G8B8A8_UINT FORMAT_R8G8B8A8_UINT}</td><td>{@link VK10#VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8A8_USCALED FORMAT_R8G8B8A8_USCALED}</td><td>{@link VK10#VK_FORMAT_R8G8B8_SINT FORMAT_R8G8B8_SINT}</td><td>{@link VK10#VK_FORMAT_R8G8B8_SNORM FORMAT_R8G8B8_SNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8_SRGB FORMAT_R8G8B8_SRGB}</td><td>{@link VK10#VK_FORMAT_R8G8B8_SSCALED FORMAT_R8G8B8_SSCALED}</td><td>{@link VK10#VK_FORMAT_R8G8B8_UINT FORMAT_R8G8B8_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8_UNORM FORMAT_R8G8B8_UNORM}</td><td>{@link VK10#VK_FORMAT_R8G8B8_USCALED FORMAT_R8G8B8_USCALED}</td><td>{@link VK10#VK_FORMAT_R8G8_SINT FORMAT_R8G8_SINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8_SNORM FORMAT_R8G8_SNORM}</td><td>{@link VK10#VK_FORMAT_R8G8_SRGB FORMAT_R8G8_SRGB}</td><td>{@link VK10#VK_FORMAT_R8G8_SSCALED FORMAT_R8G8_SSCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8_UINT FORMAT_R8G8_UINT}</td><td>{@link VK10#VK_FORMAT_R8G8_UNORM FORMAT_R8G8_UNORM}</td><td>{@link VK10#VK_FORMAT_R8G8_USCALED FORMAT_R8G8_USCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8_SINT FORMAT_R8_SINT}</td><td>{@link VK10#VK_FORMAT_R8_SNORM FORMAT_R8_SNORM}</td><td>{@link VK10#VK_FORMAT_R8_SRGB FORMAT_R8_SRGB}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8_SSCALED FORMAT_R8_SSCALED}</td><td>{@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}</td><td>{@link VK10#VK_FORMAT_R8_UNORM FORMAT_R8_UNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8_USCALED FORMAT_R8_USCALED}</td><td>{@link VK10#VK_FORMAT_S8_UINT FORMAT_S8_UINT}</td><td>{@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</td></tr><tr><td>{@link VK10#VK_FORMAT_X8_D24_UNORM_PACK32 FORMAT_X8_D24_UNORM_PACK32}</td></tr></table></li>
 * <li>{@code offset} &ndash; an offset in bytes from the base address of the buffer</li>
 * <li>{@code range} &ndash; a size in bytes of the buffer view</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkBufferViewCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkBufferViewCreateFlags flags;
    VkBuffer buffer;
    VkFormat format;
    VkDeviceSize offset;
    VkDeviceSize range;
}</code></pre>
 */
public class VkBufferViewCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		BUFFER,
		FORMAT,
		OFFSET,
		RANGE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(8),
			__member(4),
			__member(8),
			__member(8)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		BUFFER = layout.offsetof(3);
		FORMAT = layout.offsetof(4);
		OFFSET = layout.offsetof(5);
		RANGE = layout.offsetof(6);
	}

	VkBufferViewCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkBufferViewCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkBufferViewCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code buffer} field. */
	public long buffer() { return nbuffer(address()); }
	/** Returns the value of the {@code format} field. */
	public int format() { return nformat(address()); }
	/** Returns the value of the {@code offset} field. */
	public long offset() { return noffset(address()); }
	/** Returns the value of the {@code range} field. */
	public long range() { return nrange(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkBufferViewCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkBufferViewCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkBufferViewCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code buffer} field. */
	public VkBufferViewCreateInfo buffer(long value) { nbuffer(address(), value); return this; }
	/** Sets the specified value to the {@code format} field. */
	public VkBufferViewCreateInfo format(int value) { nformat(address(), value); return this; }
	/** Sets the specified value to the {@code offset} field. */
	public VkBufferViewCreateInfo offset(long value) { noffset(address(), value); return this; }
	/** Sets the specified value to the {@code range} field. */
	public VkBufferViewCreateInfo range(long value) { nrange(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkBufferViewCreateInfo set(
		int sType,
		long pNext,
		int flags,
		long buffer,
		int format,
		long offset,
		long range
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		buffer(buffer);
		format(format);
		offset(offset);
		range(range);

		return this;
	}

	/** Unsafe version of {@link #set(VkBufferViewCreateInfo) set}. */
	public VkBufferViewCreateInfo nset(long struct) {
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
	public VkBufferViewCreateInfo set(VkBufferViewCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkBufferViewCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkBufferViewCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkBufferViewCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkBufferViewCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkBufferViewCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkBufferViewCreateInfo create() {
		return new VkBufferViewCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkBufferViewCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkBufferViewCreateInfo create(long address) {
		return address == NULL ? null : new VkBufferViewCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkBufferViewCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkBufferViewCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkBufferViewCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkBufferViewCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkBufferViewCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkBufferViewCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkBufferViewCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkBufferViewCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkBufferViewCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkBufferViewCreateInfo.FLAGS); }
	/** Unsafe version of {@link #buffer}. */
	public static long nbuffer(long struct) { return memGetLong(struct + VkBufferViewCreateInfo.BUFFER); }
	/** Unsafe version of {@link #format}. */
	public static int nformat(long struct) { return memGetInt(struct + VkBufferViewCreateInfo.FORMAT); }
	/** Unsafe version of {@link #offset}. */
	public static long noffset(long struct) { return memGetLong(struct + VkBufferViewCreateInfo.OFFSET); }
	/** Unsafe version of {@link #range}. */
	public static long nrange(long struct) { return memGetLong(struct + VkBufferViewCreateInfo.RANGE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkBufferViewCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferViewCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkBufferViewCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #buffer(long) buffer}. */
	public static void nbuffer(long struct, long value) { memPutLong(struct + VkBufferViewCreateInfo.BUFFER, value); }
	/** Unsafe version of {@link #format(int) format}. */
	public static void nformat(long struct, int value) { memPutInt(struct + VkBufferViewCreateInfo.FORMAT, value); }
	/** Unsafe version of {@link #offset(long) offset}. */
	public static void noffset(long struct, long value) { memPutLong(struct + VkBufferViewCreateInfo.OFFSET, value); }
	/** Unsafe version of {@link #range(long) range}. */
	public static void nrange(long struct, long value) { memPutLong(struct + VkBufferViewCreateInfo.RANGE, value); }

	// -----------------------------------

	/** An array of {@link VkBufferViewCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkBufferViewCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkBufferViewCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkBufferViewCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkBufferViewCreateInfo newInstance(long address) {
			return new VkBufferViewCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkBufferViewCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkBufferViewCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkBufferViewCreateInfo.nflags(address()); }
		/** Returns the value of the {@code buffer} field. */
		public long buffer() { return VkBufferViewCreateInfo.nbuffer(address()); }
		/** Returns the value of the {@code format} field. */
		public int format() { return VkBufferViewCreateInfo.nformat(address()); }
		/** Returns the value of the {@code offset} field. */
		public long offset() { return VkBufferViewCreateInfo.noffset(address()); }
		/** Returns the value of the {@code range} field. */
		public long range() { return VkBufferViewCreateInfo.nrange(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkBufferViewCreateInfo.Buffer sType(int value) { VkBufferViewCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkBufferViewCreateInfo.Buffer pNext(long value) { VkBufferViewCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkBufferViewCreateInfo.Buffer flags(int value) { VkBufferViewCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code buffer} field. */
		public VkBufferViewCreateInfo.Buffer buffer(long value) { VkBufferViewCreateInfo.nbuffer(address(), value); return this; }
		/** Sets the specified value to the {@code format} field. */
		public VkBufferViewCreateInfo.Buffer format(int value) { VkBufferViewCreateInfo.nformat(address(), value); return this; }
		/** Sets the specified value to the {@code offset} field. */
		public VkBufferViewCreateInfo.Buffer offset(long value) { VkBufferViewCreateInfo.noffset(address(), value); return this; }
		/** Sets the specified value to the {@code range} field. */
		public VkBufferViewCreateInfo.Buffer range(long value) { VkBufferViewCreateInfo.nrange(address(), value); return this; }

	}

}