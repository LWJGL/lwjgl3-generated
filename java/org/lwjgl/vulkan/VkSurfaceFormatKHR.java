/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkSurfaceFormatKHR.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkSurfaceFormatKHR">Vulkan Specification</a>
 * 
 * <p>Describes a surface format.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code colorSpace} <b>must</b> be a valid {@code VkColorSpaceKHR} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code format} &ndash; a {@code VkFormat} that is compatible with the surface. One of:<br><table><tr><td>{@link VK10#VK_FORMAT_A1R5G5B5_UNORM_PACK16 FORMAT_A1R5G5B5_UNORM_PACK16}</td><td>{@link VK10#VK_FORMAT_A2B10G10R10_SINT_PACK32 FORMAT_A2B10G10R10_SINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A2B10G10R10_SNORM_PACK32 FORMAT_A2B10G10R10_SNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A2B10G10R10_SSCALED_PACK32 FORMAT_A2B10G10R10_SSCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A2B10G10R10_UINT_PACK32 FORMAT_A2B10G10R10_UINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A2B10G10R10_UNORM_PACK32 FORMAT_A2B10G10R10_UNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A2B10G10R10_USCALED_PACK32 FORMAT_A2B10G10R10_USCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A2R10G10B10_SINT_PACK32 FORMAT_A2R10G10B10_SINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A2R10G10B10_SNORM_PACK32 FORMAT_A2R10G10B10_SNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A2R10G10B10_SSCALED_PACK32 FORMAT_A2R10G10B10_SSCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A2R10G10B10_UINT_PACK32 FORMAT_A2R10G10B10_UINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A2R10G10B10_UNORM_PACK32 FORMAT_A2R10G10B10_UNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A2R10G10B10_USCALED_PACK32 FORMAT_A2R10G10B10_USCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_SINT_PACK32 FORMAT_A8B8G8R8_SINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_SNORM_PACK32 FORMAT_A8B8G8R8_SNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A8B8G8R8_SRGB_PACK32 FORMAT_A8B8G8R8_SRGB_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_SSCALED_PACK32 FORMAT_A8B8G8R8_SSCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_UINT_PACK32 FORMAT_A8B8G8R8_UINT_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A8B8G8R8_UNORM_PACK32 FORMAT_A8B8G8R8_UNORM_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_USCALED_PACK32 FORMAT_A8B8G8R8_USCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_ASTC_10x10_SRGB_BLOCK FORMAT_ASTC_10x10_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_10x10_UNORM_BLOCK FORMAT_ASTC_10x10_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_10x5_SRGB_BLOCK FORMAT_ASTC_10x5_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_10x5_UNORM_BLOCK FORMAT_ASTC_10x5_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_10x6_SRGB_BLOCK FORMAT_ASTC_10x6_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_10x6_UNORM_BLOCK FORMAT_ASTC_10x6_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_10x8_SRGB_BLOCK FORMAT_ASTC_10x8_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_10x8_UNORM_BLOCK FORMAT_ASTC_10x8_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_12x10_SRGB_BLOCK FORMAT_ASTC_12x10_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_12x10_UNORM_BLOCK FORMAT_ASTC_12x10_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_12x12_SRGB_BLOCK FORMAT_ASTC_12x12_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_12x12_UNORM_BLOCK FORMAT_ASTC_12x12_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_4x4_SRGB_BLOCK FORMAT_ASTC_4x4_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_4x4_UNORM_BLOCK FORMAT_ASTC_4x4_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_5x4_SRGB_BLOCK FORMAT_ASTC_5x4_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_5x4_UNORM_BLOCK FORMAT_ASTC_5x4_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_5x5_SRGB_BLOCK FORMAT_ASTC_5x5_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_5x5_UNORM_BLOCK FORMAT_ASTC_5x5_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_6x5_SRGB_BLOCK FORMAT_ASTC_6x5_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_6x5_UNORM_BLOCK FORMAT_ASTC_6x5_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_6x6_SRGB_BLOCK FORMAT_ASTC_6x6_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_6x6_UNORM_BLOCK FORMAT_ASTC_6x6_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_8x5_SRGB_BLOCK FORMAT_ASTC_8x5_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_8x5_UNORM_BLOCK FORMAT_ASTC_8x5_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_8x6_SRGB_BLOCK FORMAT_ASTC_8x6_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_8x6_UNORM_BLOCK FORMAT_ASTC_8x6_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_8x8_SRGB_BLOCK FORMAT_ASTC_8x8_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_8x8_UNORM_BLOCK FORMAT_ASTC_8x8_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_B10G11R11_UFLOAT_PACK32 FORMAT_B10G11R11_UFLOAT_PACK32}</td><td>{@link VK10#VK_FORMAT_B4G4R4A4_UNORM_PACK16 FORMAT_B4G4R4A4_UNORM_PACK16}</td><td>{@link VK10#VK_FORMAT_B5G5R5A1_UNORM_PACK16 FORMAT_B5G5R5A1_UNORM_PACK16}</td></tr><tr><td>{@link VK10#VK_FORMAT_B5G6R5_UNORM_PACK16 FORMAT_B5G6R5_UNORM_PACK16}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_SINT FORMAT_B8G8R8A8_SINT}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_SNORM FORMAT_B8G8R8A8_SNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_B8G8R8A8_SRGB FORMAT_B8G8R8A8_SRGB}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_SSCALED FORMAT_B8G8R8A8_SSCALED}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_UINT FORMAT_B8G8R8A8_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_B8G8R8A8_UNORM FORMAT_B8G8R8A8_UNORM}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_USCALED FORMAT_B8G8R8A8_USCALED}</td><td>{@link VK10#VK_FORMAT_B8G8R8_SINT FORMAT_B8G8R8_SINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_B8G8R8_SNORM FORMAT_B8G8R8_SNORM}</td><td>{@link VK10#VK_FORMAT_B8G8R8_SRGB FORMAT_B8G8R8_SRGB}</td><td>{@link VK10#VK_FORMAT_B8G8R8_SSCALED FORMAT_B8G8R8_SSCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_B8G8R8_UINT FORMAT_B8G8R8_UINT}</td><td>{@link VK10#VK_FORMAT_B8G8R8_UNORM FORMAT_B8G8R8_UNORM}</td><td>{@link VK10#VK_FORMAT_B8G8R8_USCALED FORMAT_B8G8R8_USCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC1_RGBA_SRGB_BLOCK FORMAT_BC1_RGBA_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC1_RGBA_UNORM_BLOCK FORMAT_BC1_RGBA_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC1_RGB_SRGB_BLOCK FORMAT_BC1_RGB_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC1_RGB_UNORM_BLOCK FORMAT_BC1_RGB_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC2_SRGB_BLOCK FORMAT_BC2_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC2_UNORM_BLOCK FORMAT_BC2_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC3_SRGB_BLOCK FORMAT_BC3_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC3_UNORM_BLOCK FORMAT_BC3_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC4_SNORM_BLOCK FORMAT_BC4_SNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC4_UNORM_BLOCK FORMAT_BC4_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC5_SNORM_BLOCK FORMAT_BC5_SNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC5_UNORM_BLOCK FORMAT_BC5_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC6H_SFLOAT_BLOCK FORMAT_BC6H_SFLOAT_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC6H_UFLOAT_BLOCK FORMAT_BC6H_UFLOAT_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC7_SRGB_BLOCK FORMAT_BC7_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC7_UNORM_BLOCK FORMAT_BC7_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_D16_UNORM FORMAT_D16_UNORM}</td><td>{@link VK10#VK_FORMAT_D16_UNORM_S8_UINT FORMAT_D16_UNORM_S8_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_D24_UNORM_S8_UINT FORMAT_D24_UNORM_S8_UINT}</td><td>{@link VK10#VK_FORMAT_D32_SFLOAT FORMAT_D32_SFLOAT}</td><td>{@link VK10#VK_FORMAT_D32_SFLOAT_S8_UINT FORMAT_D32_SFLOAT_S8_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 FORMAT_E5B9G9R9_UFLOAT_PACK32}</td><td>{@link VK10#VK_FORMAT_EAC_R11G11_SNORM_BLOCK FORMAT_EAC_R11G11_SNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_EAC_R11G11_UNORM_BLOCK FORMAT_EAC_R11G11_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_EAC_R11_SNORM_BLOCK FORMAT_EAC_R11_SNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_EAC_R11_UNORM_BLOCK FORMAT_EAC_R11_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK FORMAT_ETC2_R8G8B8_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK FORMAT_ETC2_R8G8B8_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_FEATURE_BLIT_DST_BIT FORMAT_FEATURE_BLIT_DST_BIT}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}</td><td>{@link IMGFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT FORMAT_FEATURE_VERTEX_BUFFER_BIT}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_SFLOAT FORMAT_R16G16B16A16_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_SINT FORMAT_R16G16B16A16_SINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16B16A16_SNORM FORMAT_R16G16B16A16_SNORM}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_SSCALED FORMAT_R16G16B16A16_SSCALED}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_UINT FORMAT_R16G16B16A16_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16B16A16_UNORM FORMAT_R16G16B16A16_UNORM}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_USCALED FORMAT_R16G16B16A16_USCALED}</td><td>{@link VK10#VK_FORMAT_R16G16B16_SFLOAT FORMAT_R16G16B16_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16B16_SINT FORMAT_R16G16B16_SINT}</td><td>{@link VK10#VK_FORMAT_R16G16B16_SNORM FORMAT_R16G16B16_SNORM}</td><td>{@link VK10#VK_FORMAT_R16G16B16_SSCALED FORMAT_R16G16B16_SSCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16B16_UINT FORMAT_R16G16B16_UINT}</td><td>{@link VK10#VK_FORMAT_R16G16B16_UNORM FORMAT_R16G16B16_UNORM}</td><td>{@link VK10#VK_FORMAT_R16G16B16_USCALED FORMAT_R16G16B16_USCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16_SFLOAT FORMAT_R16G16_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R16G16_SINT FORMAT_R16G16_SINT}</td><td>{@link VK10#VK_FORMAT_R16G16_SNORM FORMAT_R16G16_SNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16_SSCALED FORMAT_R16G16_SSCALED}</td><td>{@link VK10#VK_FORMAT_R16G16_UINT FORMAT_R16G16_UINT}</td><td>{@link VK10#VK_FORMAT_R16G16_UNORM FORMAT_R16G16_UNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16_USCALED FORMAT_R16G16_USCALED}</td><td>{@link VK10#VK_FORMAT_R16_SFLOAT FORMAT_R16_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R16_SINT FORMAT_R16_SINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16_SNORM FORMAT_R16_SNORM}</td><td>{@link VK10#VK_FORMAT_R16_SSCALED FORMAT_R16_SSCALED}</td><td>{@link VK10#VK_FORMAT_R16_UINT FORMAT_R16_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16_UNORM FORMAT_R16_UNORM}</td><td>{@link VK10#VK_FORMAT_R16_USCALED FORMAT_R16_USCALED}</td><td>{@link VK10#VK_FORMAT_R32G32B32A32_SFLOAT FORMAT_R32G32B32A32_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R32G32B32A32_SINT FORMAT_R32G32B32A32_SINT}</td><td>{@link VK10#VK_FORMAT_R32G32B32A32_UINT FORMAT_R32G32B32A32_UINT}</td><td>{@link VK10#VK_FORMAT_R32G32B32_SFLOAT FORMAT_R32G32B32_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R32G32B32_SINT FORMAT_R32G32B32_SINT}</td><td>{@link VK10#VK_FORMAT_R32G32B32_UINT FORMAT_R32G32B32_UINT}</td><td>{@link VK10#VK_FORMAT_R32G32_SFLOAT FORMAT_R32G32_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R32G32_SINT FORMAT_R32G32_SINT}</td><td>{@link VK10#VK_FORMAT_R32G32_UINT FORMAT_R32G32_UINT}</td><td>{@link VK10#VK_FORMAT_R32_SFLOAT FORMAT_R32_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R32_SINT FORMAT_R32_SINT}</td><td>{@link VK10#VK_FORMAT_R32_UINT FORMAT_R32_UINT}</td><td>{@link VK10#VK_FORMAT_R4G4B4A4_UNORM_PACK16 FORMAT_R4G4B4A4_UNORM_PACK16}</td></tr><tr><td>{@link VK10#VK_FORMAT_R4G4_UNORM_PACK8 FORMAT_R4G4_UNORM_PACK8}</td><td>{@link VK10#VK_FORMAT_R5G5B5A1_UNORM_PACK16 FORMAT_R5G5B5A1_UNORM_PACK16}</td><td>{@link VK10#VK_FORMAT_R5G6B5_UNORM_PACK16 FORMAT_R5G6B5_UNORM_PACK16}</td></tr><tr><td>{@link VK10#VK_FORMAT_R64G64B64A64_SFLOAT FORMAT_R64G64B64A64_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R64G64B64A64_SINT FORMAT_R64G64B64A64_SINT}</td><td>{@link VK10#VK_FORMAT_R64G64B64A64_UINT FORMAT_R64G64B64A64_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R64G64B64_SFLOAT FORMAT_R64G64B64_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R64G64B64_SINT FORMAT_R64G64B64_SINT}</td><td>{@link VK10#VK_FORMAT_R64G64B64_UINT FORMAT_R64G64B64_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R64G64_SFLOAT FORMAT_R64G64_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R64G64_SINT FORMAT_R64G64_SINT}</td><td>{@link VK10#VK_FORMAT_R64G64_UINT FORMAT_R64G64_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R64_SFLOAT FORMAT_R64_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R64_SINT FORMAT_R64_SINT}</td><td>{@link VK10#VK_FORMAT_R64_UINT FORMAT_R64_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8A8_SINT FORMAT_R8G8B8A8_SINT}</td><td>{@link VK10#VK_FORMAT_R8G8B8A8_SNORM FORMAT_R8G8B8A8_SNORM}</td><td>{@link VK10#VK_FORMAT_R8G8B8A8_SRGB FORMAT_R8G8B8A8_SRGB}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8A8_SSCALED FORMAT_R8G8B8A8_SSCALED}</td><td>{@link VK10#VK_FORMAT_R8G8B8A8_UINT FORMAT_R8G8B8A8_UINT}</td><td>{@link VK10#VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8A8_USCALED FORMAT_R8G8B8A8_USCALED}</td><td>{@link VK10#VK_FORMAT_R8G8B8_SINT FORMAT_R8G8B8_SINT}</td><td>{@link VK10#VK_FORMAT_R8G8B8_SNORM FORMAT_R8G8B8_SNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8_SRGB FORMAT_R8G8B8_SRGB}</td><td>{@link VK10#VK_FORMAT_R8G8B8_SSCALED FORMAT_R8G8B8_SSCALED}</td><td>{@link VK10#VK_FORMAT_R8G8B8_UINT FORMAT_R8G8B8_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8_UNORM FORMAT_R8G8B8_UNORM}</td><td>{@link VK10#VK_FORMAT_R8G8B8_USCALED FORMAT_R8G8B8_USCALED}</td><td>{@link VK10#VK_FORMAT_R8G8_SINT FORMAT_R8G8_SINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8_SNORM FORMAT_R8G8_SNORM}</td><td>{@link VK10#VK_FORMAT_R8G8_SRGB FORMAT_R8G8_SRGB}</td><td>{@link VK10#VK_FORMAT_R8G8_SSCALED FORMAT_R8G8_SSCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8_UINT FORMAT_R8G8_UINT}</td><td>{@link VK10#VK_FORMAT_R8G8_UNORM FORMAT_R8G8_UNORM}</td><td>{@link VK10#VK_FORMAT_R8G8_USCALED FORMAT_R8G8_USCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8_SINT FORMAT_R8_SINT}</td><td>{@link VK10#VK_FORMAT_R8_SNORM FORMAT_R8_SNORM}</td><td>{@link VK10#VK_FORMAT_R8_SRGB FORMAT_R8_SRGB}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8_SSCALED FORMAT_R8_SSCALED}</td><td>{@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}</td><td>{@link VK10#VK_FORMAT_R8_UNORM FORMAT_R8_UNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8_USCALED FORMAT_R8_USCALED}</td><td>{@link VK10#VK_FORMAT_S8_UINT FORMAT_S8_UINT}</td><td>{@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</td></tr><tr><td>{@link VK10#VK_FORMAT_X8_D24_UNORM_PACK32 FORMAT_X8_D24_UNORM_PACK32}</td></tr></table></li>
 * <li>{@code colorSpace} &ndash; a presentation {@code VkColorSpaceKHR} that is compatible with the surface. Must be:<br><table><tr><td>{@link KHRSurface#VK_COLORSPACE_SRGB_NONLINEAR_KHR COLORSPACE_SRGB_NONLINEAR_KHR}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSurfaceFormatKHR {
    VkFormat format;
    VkColorSpaceKHR colorSpace;
}</code></pre>
 */
public class VkSurfaceFormatKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		FORMAT,
		COLORSPACE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		FORMAT = layout.offsetof(0);
		COLORSPACE = layout.offsetof(1);
	}

	VkSurfaceFormatKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSurfaceFormatKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSurfaceFormatKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code format} field. */
	public int format() { return nformat(address()); }
	/** Returns the value of the {@code colorSpace} field. */
	public int colorSpace() { return ncolorSpace(address()); }

	// -----------------------------------

	/** Returns a new {@link VkSurfaceFormatKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSurfaceFormatKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSurfaceFormatKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSurfaceFormatKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSurfaceFormatKHR} instance allocated with {@link BufferUtils}. */
	public static VkSurfaceFormatKHR create() {
		return new VkSurfaceFormatKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSurfaceFormatKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSurfaceFormatKHR create(long address) {
		return address == NULL ? null : new VkSurfaceFormatKHR(address, null);
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSurfaceFormatKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkSurfaceFormatKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkSurfaceFormatKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkSurfaceFormatKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkSurfaceFormatKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSurfaceFormatKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSurfaceFormatKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #format}. */
	public static int nformat(long struct) { return memGetInt(struct + VkSurfaceFormatKHR.FORMAT); }
	/** Unsafe version of {@link #colorSpace}. */
	public static int ncolorSpace(long struct) { return memGetInt(struct + VkSurfaceFormatKHR.COLORSPACE); }

	// -----------------------------------

	/** An array of {@link VkSurfaceFormatKHR} structs. */
	public static final class Buffer extends StructBuffer<VkSurfaceFormatKHR, Buffer> {

		/**
		 * Creates a new {@link VkSurfaceFormatKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSurfaceFormatKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkSurfaceFormatKHR newInstance(long address) {
			return new VkSurfaceFormatKHR(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code format} field. */
		public int format() { return VkSurfaceFormatKHR.nformat(address()); }
		/** Returns the value of the {@code colorSpace} field. */
		public int colorSpace() { return VkSurfaceFormatKHR.ncolorSpace(address()); }

	}

}