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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkAttachmentDescription.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkAttachmentDescription">Vulkan Specification</a>
 * 
 * <p>Describes properties of an attachment.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkAttachmentDescriptionFlagBits} values</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>{@code loadOp} <b>must</b> be a valid {@code VkAttachmentLoadOp} value</li>
 * <li>{@code storeOp} <b>must</b> be a valid {@code VkAttachmentStoreOp} value</li>
 * <li>{@code stencilLoadOp} <b>must</b> be a valid {@code VkAttachmentLoadOp} value</li>
 * <li>{@code stencilStoreOp} <b>must</b> be a valid {@code VkAttachmentStoreOp} value</li>
 * <li>{@code initialLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code finalLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code flags} &ndash; a bitfield of {@code VkAttachmentDescriptionFlagBits} describing additional properties of the attachment. One or more of:<br><table><tr><td>{@link VK10#VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT}</td></tr></table></li>
 * <li>{@code format} &ndash; a {@code VkFormat} value specifying the format of the image that will be used for the attachment. One of:<br><table><tr><td>{@link VK10#VK_FORMAT_A1R5G5B5_UNORM_PACK16 FORMAT_A1R5G5B5_UNORM_PACK16}</td><td>{@link VK10#VK_FORMAT_A2B10G10R10_SINT_PACK32 FORMAT_A2B10G10R10_SINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A2B10G10R10_SNORM_PACK32 FORMAT_A2B10G10R10_SNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A2B10G10R10_SSCALED_PACK32 FORMAT_A2B10G10R10_SSCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A2B10G10R10_UINT_PACK32 FORMAT_A2B10G10R10_UINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A2B10G10R10_UNORM_PACK32 FORMAT_A2B10G10R10_UNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A2B10G10R10_USCALED_PACK32 FORMAT_A2B10G10R10_USCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A2R10G10B10_SINT_PACK32 FORMAT_A2R10G10B10_SINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A2R10G10B10_SNORM_PACK32 FORMAT_A2R10G10B10_SNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A2R10G10B10_SSCALED_PACK32 FORMAT_A2R10G10B10_SSCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A2R10G10B10_UINT_PACK32 FORMAT_A2R10G10B10_UINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A2R10G10B10_UNORM_PACK32 FORMAT_A2R10G10B10_UNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A2R10G10B10_USCALED_PACK32 FORMAT_A2R10G10B10_USCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_SINT_PACK32 FORMAT_A8B8G8R8_SINT_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_SNORM_PACK32 FORMAT_A8B8G8R8_SNORM_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A8B8G8R8_SRGB_PACK32 FORMAT_A8B8G8R8_SRGB_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_SSCALED_PACK32 FORMAT_A8B8G8R8_SSCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_UINT_PACK32 FORMAT_A8B8G8R8_UINT_PACK32}</td></tr><tr><td>{@link VK10#VK_FORMAT_A8B8G8R8_UNORM_PACK32 FORMAT_A8B8G8R8_UNORM_PACK32}</td><td>{@link VK10#VK_FORMAT_A8B8G8R8_USCALED_PACK32 FORMAT_A8B8G8R8_USCALED_PACK32}</td><td>{@link VK10#VK_FORMAT_ASTC_10x10_SRGB_BLOCK FORMAT_ASTC_10x10_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_10x10_UNORM_BLOCK FORMAT_ASTC_10x10_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_10x5_SRGB_BLOCK FORMAT_ASTC_10x5_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_10x5_UNORM_BLOCK FORMAT_ASTC_10x5_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_10x6_SRGB_BLOCK FORMAT_ASTC_10x6_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_10x6_UNORM_BLOCK FORMAT_ASTC_10x6_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_10x8_SRGB_BLOCK FORMAT_ASTC_10x8_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_10x8_UNORM_BLOCK FORMAT_ASTC_10x8_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_12x10_SRGB_BLOCK FORMAT_ASTC_12x10_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_12x10_UNORM_BLOCK FORMAT_ASTC_12x10_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_12x12_SRGB_BLOCK FORMAT_ASTC_12x12_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_12x12_UNORM_BLOCK FORMAT_ASTC_12x12_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_4x4_SRGB_BLOCK FORMAT_ASTC_4x4_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_4x4_UNORM_BLOCK FORMAT_ASTC_4x4_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_5x4_SRGB_BLOCK FORMAT_ASTC_5x4_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_5x4_UNORM_BLOCK FORMAT_ASTC_5x4_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_5x5_SRGB_BLOCK FORMAT_ASTC_5x5_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_5x5_UNORM_BLOCK FORMAT_ASTC_5x5_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_6x5_SRGB_BLOCK FORMAT_ASTC_6x5_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_6x5_UNORM_BLOCK FORMAT_ASTC_6x5_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_6x6_SRGB_BLOCK FORMAT_ASTC_6x6_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_6x6_UNORM_BLOCK FORMAT_ASTC_6x6_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_8x5_SRGB_BLOCK FORMAT_ASTC_8x5_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_8x5_UNORM_BLOCK FORMAT_ASTC_8x5_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_8x6_SRGB_BLOCK FORMAT_ASTC_8x6_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ASTC_8x6_UNORM_BLOCK FORMAT_ASTC_8x6_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_8x8_SRGB_BLOCK FORMAT_ASTC_8x8_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ASTC_8x8_UNORM_BLOCK FORMAT_ASTC_8x8_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_B10G11R11_UFLOAT_PACK32 FORMAT_B10G11R11_UFLOAT_PACK32}</td><td>{@link VK10#VK_FORMAT_B4G4R4A4_UNORM_PACK16 FORMAT_B4G4R4A4_UNORM_PACK16}</td><td>{@link VK10#VK_FORMAT_B5G5R5A1_UNORM_PACK16 FORMAT_B5G5R5A1_UNORM_PACK16}</td></tr><tr><td>{@link VK10#VK_FORMAT_B5G6R5_UNORM_PACK16 FORMAT_B5G6R5_UNORM_PACK16}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_SINT FORMAT_B8G8R8A8_SINT}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_SNORM FORMAT_B8G8R8A8_SNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_B8G8R8A8_SRGB FORMAT_B8G8R8A8_SRGB}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_SSCALED FORMAT_B8G8R8A8_SSCALED}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_UINT FORMAT_B8G8R8A8_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_B8G8R8A8_UNORM FORMAT_B8G8R8A8_UNORM}</td><td>{@link VK10#VK_FORMAT_B8G8R8A8_USCALED FORMAT_B8G8R8A8_USCALED}</td><td>{@link VK10#VK_FORMAT_B8G8R8_SINT FORMAT_B8G8R8_SINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_B8G8R8_SNORM FORMAT_B8G8R8_SNORM}</td><td>{@link VK10#VK_FORMAT_B8G8R8_SRGB FORMAT_B8G8R8_SRGB}</td><td>{@link VK10#VK_FORMAT_B8G8R8_SSCALED FORMAT_B8G8R8_SSCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_B8G8R8_UINT FORMAT_B8G8R8_UINT}</td><td>{@link VK10#VK_FORMAT_B8G8R8_UNORM FORMAT_B8G8R8_UNORM}</td><td>{@link VK10#VK_FORMAT_B8G8R8_USCALED FORMAT_B8G8R8_USCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC1_RGBA_SRGB_BLOCK FORMAT_BC1_RGBA_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC1_RGBA_UNORM_BLOCK FORMAT_BC1_RGBA_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC1_RGB_SRGB_BLOCK FORMAT_BC1_RGB_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC1_RGB_UNORM_BLOCK FORMAT_BC1_RGB_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC2_SRGB_BLOCK FORMAT_BC2_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC2_UNORM_BLOCK FORMAT_BC2_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC3_SRGB_BLOCK FORMAT_BC3_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC3_UNORM_BLOCK FORMAT_BC3_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC4_SNORM_BLOCK FORMAT_BC4_SNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC4_UNORM_BLOCK FORMAT_BC4_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC5_SNORM_BLOCK FORMAT_BC5_SNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC5_UNORM_BLOCK FORMAT_BC5_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC6H_SFLOAT_BLOCK FORMAT_BC6H_SFLOAT_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC6H_UFLOAT_BLOCK FORMAT_BC6H_UFLOAT_BLOCK}</td><td>{@link VK10#VK_FORMAT_BC7_SRGB_BLOCK FORMAT_BC7_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_BC7_UNORM_BLOCK FORMAT_BC7_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_D16_UNORM FORMAT_D16_UNORM}</td><td>{@link VK10#VK_FORMAT_D16_UNORM_S8_UINT FORMAT_D16_UNORM_S8_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_D24_UNORM_S8_UINT FORMAT_D24_UNORM_S8_UINT}</td><td>{@link VK10#VK_FORMAT_D32_SFLOAT FORMAT_D32_SFLOAT}</td><td>{@link VK10#VK_FORMAT_D32_SFLOAT_S8_UINT FORMAT_D32_SFLOAT_S8_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 FORMAT_E5B9G9R9_UFLOAT_PACK32}</td><td>{@link VK10#VK_FORMAT_EAC_R11G11_SNORM_BLOCK FORMAT_EAC_R11G11_SNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_EAC_R11G11_UNORM_BLOCK FORMAT_EAC_R11G11_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_EAC_R11_SNORM_BLOCK FORMAT_EAC_R11_SNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_EAC_R11_UNORM_BLOCK FORMAT_EAC_R11_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK}</td></tr><tr><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK FORMAT_ETC2_R8G8B8_SRGB_BLOCK}</td><td>{@link VK10#VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK FORMAT_ETC2_R8G8B8_UNORM_BLOCK}</td><td>{@link VK10#VK_FORMAT_FEATURE_BLIT_DST_BIT FORMAT_FEATURE_BLIT_DST_BIT}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}</td><td>{@link IMGFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT}</td><td>{@link VK10#VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT}</td></tr><tr><td>{@link VK10#VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT FORMAT_FEATURE_VERTEX_BUFFER_BIT}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_SFLOAT FORMAT_R16G16B16A16_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_SINT FORMAT_R16G16B16A16_SINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16B16A16_SNORM FORMAT_R16G16B16A16_SNORM}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_SSCALED FORMAT_R16G16B16A16_SSCALED}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_UINT FORMAT_R16G16B16A16_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16B16A16_UNORM FORMAT_R16G16B16A16_UNORM}</td><td>{@link VK10#VK_FORMAT_R16G16B16A16_USCALED FORMAT_R16G16B16A16_USCALED}</td><td>{@link VK10#VK_FORMAT_R16G16B16_SFLOAT FORMAT_R16G16B16_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16B16_SINT FORMAT_R16G16B16_SINT}</td><td>{@link VK10#VK_FORMAT_R16G16B16_SNORM FORMAT_R16G16B16_SNORM}</td><td>{@link VK10#VK_FORMAT_R16G16B16_SSCALED FORMAT_R16G16B16_SSCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16B16_UINT FORMAT_R16G16B16_UINT}</td><td>{@link VK10#VK_FORMAT_R16G16B16_UNORM FORMAT_R16G16B16_UNORM}</td><td>{@link VK10#VK_FORMAT_R16G16B16_USCALED FORMAT_R16G16B16_USCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16_SFLOAT FORMAT_R16G16_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R16G16_SINT FORMAT_R16G16_SINT}</td><td>{@link VK10#VK_FORMAT_R16G16_SNORM FORMAT_R16G16_SNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16_SSCALED FORMAT_R16G16_SSCALED}</td><td>{@link VK10#VK_FORMAT_R16G16_UINT FORMAT_R16G16_UINT}</td><td>{@link VK10#VK_FORMAT_R16G16_UNORM FORMAT_R16G16_UNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16G16_USCALED FORMAT_R16G16_USCALED}</td><td>{@link VK10#VK_FORMAT_R16_SFLOAT FORMAT_R16_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R16_SINT FORMAT_R16_SINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16_SNORM FORMAT_R16_SNORM}</td><td>{@link VK10#VK_FORMAT_R16_SSCALED FORMAT_R16_SSCALED}</td><td>{@link VK10#VK_FORMAT_R16_UINT FORMAT_R16_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R16_UNORM FORMAT_R16_UNORM}</td><td>{@link VK10#VK_FORMAT_R16_USCALED FORMAT_R16_USCALED}</td><td>{@link VK10#VK_FORMAT_R32G32B32A32_SFLOAT FORMAT_R32G32B32A32_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R32G32B32A32_SINT FORMAT_R32G32B32A32_SINT}</td><td>{@link VK10#VK_FORMAT_R32G32B32A32_UINT FORMAT_R32G32B32A32_UINT}</td><td>{@link VK10#VK_FORMAT_R32G32B32_SFLOAT FORMAT_R32G32B32_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R32G32B32_SINT FORMAT_R32G32B32_SINT}</td><td>{@link VK10#VK_FORMAT_R32G32B32_UINT FORMAT_R32G32B32_UINT}</td><td>{@link VK10#VK_FORMAT_R32G32_SFLOAT FORMAT_R32G32_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R32G32_SINT FORMAT_R32G32_SINT}</td><td>{@link VK10#VK_FORMAT_R32G32_UINT FORMAT_R32G32_UINT}</td><td>{@link VK10#VK_FORMAT_R32_SFLOAT FORMAT_R32_SFLOAT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R32_SINT FORMAT_R32_SINT}</td><td>{@link VK10#VK_FORMAT_R32_UINT FORMAT_R32_UINT}</td><td>{@link VK10#VK_FORMAT_R4G4B4A4_UNORM_PACK16 FORMAT_R4G4B4A4_UNORM_PACK16}</td></tr><tr><td>{@link VK10#VK_FORMAT_R4G4_UNORM_PACK8 FORMAT_R4G4_UNORM_PACK8}</td><td>{@link VK10#VK_FORMAT_R5G5B5A1_UNORM_PACK16 FORMAT_R5G5B5A1_UNORM_PACK16}</td><td>{@link VK10#VK_FORMAT_R5G6B5_UNORM_PACK16 FORMAT_R5G6B5_UNORM_PACK16}</td></tr><tr><td>{@link VK10#VK_FORMAT_R64G64B64A64_SFLOAT FORMAT_R64G64B64A64_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R64G64B64A64_SINT FORMAT_R64G64B64A64_SINT}</td><td>{@link VK10#VK_FORMAT_R64G64B64A64_UINT FORMAT_R64G64B64A64_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R64G64B64_SFLOAT FORMAT_R64G64B64_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R64G64B64_SINT FORMAT_R64G64B64_SINT}</td><td>{@link VK10#VK_FORMAT_R64G64B64_UINT FORMAT_R64G64B64_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R64G64_SFLOAT FORMAT_R64G64_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R64G64_SINT FORMAT_R64G64_SINT}</td><td>{@link VK10#VK_FORMAT_R64G64_UINT FORMAT_R64G64_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R64_SFLOAT FORMAT_R64_SFLOAT}</td><td>{@link VK10#VK_FORMAT_R64_SINT FORMAT_R64_SINT}</td><td>{@link VK10#VK_FORMAT_R64_UINT FORMAT_R64_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8A8_SINT FORMAT_R8G8B8A8_SINT}</td><td>{@link VK10#VK_FORMAT_R8G8B8A8_SNORM FORMAT_R8G8B8A8_SNORM}</td><td>{@link VK10#VK_FORMAT_R8G8B8A8_SRGB FORMAT_R8G8B8A8_SRGB}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8A8_SSCALED FORMAT_R8G8B8A8_SSCALED}</td><td>{@link VK10#VK_FORMAT_R8G8B8A8_UINT FORMAT_R8G8B8A8_UINT}</td><td>{@link VK10#VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8A8_USCALED FORMAT_R8G8B8A8_USCALED}</td><td>{@link VK10#VK_FORMAT_R8G8B8_SINT FORMAT_R8G8B8_SINT}</td><td>{@link VK10#VK_FORMAT_R8G8B8_SNORM FORMAT_R8G8B8_SNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8_SRGB FORMAT_R8G8B8_SRGB}</td><td>{@link VK10#VK_FORMAT_R8G8B8_SSCALED FORMAT_R8G8B8_SSCALED}</td><td>{@link VK10#VK_FORMAT_R8G8B8_UINT FORMAT_R8G8B8_UINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8B8_UNORM FORMAT_R8G8B8_UNORM}</td><td>{@link VK10#VK_FORMAT_R8G8B8_USCALED FORMAT_R8G8B8_USCALED}</td><td>{@link VK10#VK_FORMAT_R8G8_SINT FORMAT_R8G8_SINT}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8_SNORM FORMAT_R8G8_SNORM}</td><td>{@link VK10#VK_FORMAT_R8G8_SRGB FORMAT_R8G8_SRGB}</td><td>{@link VK10#VK_FORMAT_R8G8_SSCALED FORMAT_R8G8_SSCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8G8_UINT FORMAT_R8G8_UINT}</td><td>{@link VK10#VK_FORMAT_R8G8_UNORM FORMAT_R8G8_UNORM}</td><td>{@link VK10#VK_FORMAT_R8G8_USCALED FORMAT_R8G8_USCALED}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8_SINT FORMAT_R8_SINT}</td><td>{@link VK10#VK_FORMAT_R8_SNORM FORMAT_R8_SNORM}</td><td>{@link VK10#VK_FORMAT_R8_SRGB FORMAT_R8_SRGB}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8_SSCALED FORMAT_R8_SSCALED}</td><td>{@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}</td><td>{@link VK10#VK_FORMAT_R8_UNORM FORMAT_R8_UNORM}</td></tr><tr><td>{@link VK10#VK_FORMAT_R8_USCALED FORMAT_R8_USCALED}</td><td>{@link VK10#VK_FORMAT_S8_UINT FORMAT_S8_UINT}</td><td>{@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</td></tr><tr><td>{@link VK10#VK_FORMAT_X8_D24_UNORM_PACK32 FORMAT_X8_D24_UNORM_PACK32}</td></tr></table></li>
 * <li>{@code samples} &ndash; the number of samples of the image as defined in {@code VkSampleCountFlagBits}. One of:<br><table><tr><td>{@link VK10#VK_SAMPLE_COUNT_16_BIT SAMPLE_COUNT_16_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_2_BIT SAMPLE_COUNT_2_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_32_BIT SAMPLE_COUNT_32_BIT}</td></tr><tr><td>{@link VK10#VK_SAMPLE_COUNT_4_BIT SAMPLE_COUNT_4_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_64_BIT SAMPLE_COUNT_64_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_8_BIT SAMPLE_COUNT_8_BIT}</td></tr></table></li>
 * <li>{@code loadOp} &ndash; specifies how the contents of color and depth components of the attachment are treated at the beginning of the subpass where it is first used. One of:<br><table><tr><td>{@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}</td><td>{@link VK10#VK_ATTACHMENT_LOAD_OP_DONT_CARE ATTACHMENT_LOAD_OP_DONT_CARE}</td><td>{@link VK10#VK_ATTACHMENT_LOAD_OP_LOAD ATTACHMENT_LOAD_OP_LOAD}</td></tr></table></li>
 * <li>{@code storeOp} &ndash; specifies how the contents of color and depth components of the attachment are treated at the end of the subpass where it is last used. One of:<br><table><tr><td>{@link VK10#VK_ATTACHMENT_STORE_OP_DONT_CARE ATTACHMENT_STORE_OP_DONT_CARE}</td><td>{@link VK10#VK_ATTACHMENT_STORE_OP_STORE ATTACHMENT_STORE_OP_STORE}</td></tr></table></li>
 * <li>{@code stencilLoadOp} &ndash; 
 * specifies how the contents of stencil components of the attachment are treated at the beginning of the subpass where it is first used, and must be one
 * of the same values allowed for {@code loadOp}</li>
 * <li>{@code stencilStoreOp} &ndash; 
 * specifies how the contents of stencil components of the attachment are treated at the end of the last subpass where it is used, and must be one of the
 * same values allowed for {@code storeOp}</li>
 * <li>{@code initialLayout} &ndash; the layout the attachment image subresource will be in when a render pass instance begins. One of:<br><table><tr><td>{@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</td><td>{@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}</td></tr></table></li>
 * <li>{@code finalLayout} &ndash; 
 * the layout the attachment image subresource will be transitioned to when a render pass instance ends. During a render pass instance, an attachment can
 * use a different layout in each subpass, if desired.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkAttachmentDescription {
    VkAttachmentDescriptionFlags flags;
    VkFormat format;
    VkSampleCountFlagBits samples;
    VkAttachmentLoadOp loadOp;
    VkAttachmentStoreOp storeOp;
    VkAttachmentLoadOp stencilLoadOp;
    VkAttachmentStoreOp stencilStoreOp;
    VkImageLayout initialLayout;
    VkImageLayout finalLayout;
}</code></pre>
 */
public class VkAttachmentDescription extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		FLAGS,
		FORMAT,
		SAMPLES,
		LOADOP,
		STOREOP,
		STENCILLOADOP,
		STENCILSTOREOP,
		INITIALLAYOUT,
		FINALLAYOUT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		FLAGS = layout.offsetof(0);
		FORMAT = layout.offsetof(1);
		SAMPLES = layout.offsetof(2);
		LOADOP = layout.offsetof(3);
		STOREOP = layout.offsetof(4);
		STENCILLOADOP = layout.offsetof(5);
		STENCILSTOREOP = layout.offsetof(6);
		INITIALLAYOUT = layout.offsetof(7);
		FINALLAYOUT = layout.offsetof(8);
	}

	VkAttachmentDescription(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkAttachmentDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkAttachmentDescription(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code format} field. */
	public int format() { return nformat(address()); }
	/** Returns the value of the {@code samples} field. */
	public int samples() { return nsamples(address()); }
	/** Returns the value of the {@code loadOp} field. */
	public int loadOp() { return nloadOp(address()); }
	/** Returns the value of the {@code storeOp} field. */
	public int storeOp() { return nstoreOp(address()); }
	/** Returns the value of the {@code stencilLoadOp} field. */
	public int stencilLoadOp() { return nstencilLoadOp(address()); }
	/** Returns the value of the {@code stencilStoreOp} field. */
	public int stencilStoreOp() { return nstencilStoreOp(address()); }
	/** Returns the value of the {@code initialLayout} field. */
	public int initialLayout() { return ninitialLayout(address()); }
	/** Returns the value of the {@code finalLayout} field. */
	public int finalLayout() { return nfinalLayout(address()); }

	/** Sets the specified value to the {@code flags} field. */
	public VkAttachmentDescription flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code format} field. */
	public VkAttachmentDescription format(int value) { nformat(address(), value); return this; }
	/** Sets the specified value to the {@code samples} field. */
	public VkAttachmentDescription samples(int value) { nsamples(address(), value); return this; }
	/** Sets the specified value to the {@code loadOp} field. */
	public VkAttachmentDescription loadOp(int value) { nloadOp(address(), value); return this; }
	/** Sets the specified value to the {@code storeOp} field. */
	public VkAttachmentDescription storeOp(int value) { nstoreOp(address(), value); return this; }
	/** Sets the specified value to the {@code stencilLoadOp} field. */
	public VkAttachmentDescription stencilLoadOp(int value) { nstencilLoadOp(address(), value); return this; }
	/** Sets the specified value to the {@code stencilStoreOp} field. */
	public VkAttachmentDescription stencilStoreOp(int value) { nstencilStoreOp(address(), value); return this; }
	/** Sets the specified value to the {@code initialLayout} field. */
	public VkAttachmentDescription initialLayout(int value) { ninitialLayout(address(), value); return this; }
	/** Sets the specified value to the {@code finalLayout} field. */
	public VkAttachmentDescription finalLayout(int value) { nfinalLayout(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkAttachmentDescription set(
		int flags,
		int format,
		int samples,
		int loadOp,
		int storeOp,
		int stencilLoadOp,
		int stencilStoreOp,
		int initialLayout,
		int finalLayout
	) {
		flags(flags);
		format(format);
		samples(samples);
		loadOp(loadOp);
		storeOp(storeOp);
		stencilLoadOp(stencilLoadOp);
		stencilStoreOp(stencilStoreOp);
		initialLayout(initialLayout);
		finalLayout(finalLayout);

		return this;
	}

	/** Unsafe version of {@link #set(VkAttachmentDescription) set}. */
	public VkAttachmentDescription nset(long struct) {
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
	public VkAttachmentDescription set(VkAttachmentDescription src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkAttachmentDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkAttachmentDescription malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkAttachmentDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkAttachmentDescription calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkAttachmentDescription} instance allocated with {@link BufferUtils}. */
	public static VkAttachmentDescription create() {
		return new VkAttachmentDescription(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkAttachmentDescription} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkAttachmentDescription create(long address) {
		return address == NULL ? null : new VkAttachmentDescription(address, null);
	}

	/**
	 * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkAttachmentDescription.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkAttachmentDescription} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkAttachmentDescription mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkAttachmentDescription} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkAttachmentDescription callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkAttachmentDescription} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkAttachmentDescription mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkAttachmentDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkAttachmentDescription callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkAttachmentDescription.FLAGS); }
	/** Unsafe version of {@link #format}. */
	public static int nformat(long struct) { return memGetInt(struct + VkAttachmentDescription.FORMAT); }
	/** Unsafe version of {@link #samples}. */
	public static int nsamples(long struct) { return memGetInt(struct + VkAttachmentDescription.SAMPLES); }
	/** Unsafe version of {@link #loadOp}. */
	public static int nloadOp(long struct) { return memGetInt(struct + VkAttachmentDescription.LOADOP); }
	/** Unsafe version of {@link #storeOp}. */
	public static int nstoreOp(long struct) { return memGetInt(struct + VkAttachmentDescription.STOREOP); }
	/** Unsafe version of {@link #stencilLoadOp}. */
	public static int nstencilLoadOp(long struct) { return memGetInt(struct + VkAttachmentDescription.STENCILLOADOP); }
	/** Unsafe version of {@link #stencilStoreOp}. */
	public static int nstencilStoreOp(long struct) { return memGetInt(struct + VkAttachmentDescription.STENCILSTOREOP); }
	/** Unsafe version of {@link #initialLayout}. */
	public static int ninitialLayout(long struct) { return memGetInt(struct + VkAttachmentDescription.INITIALLAYOUT); }
	/** Unsafe version of {@link #finalLayout}. */
	public static int nfinalLayout(long struct) { return memGetInt(struct + VkAttachmentDescription.FINALLAYOUT); }

	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkAttachmentDescription.FLAGS, value); }
	/** Unsafe version of {@link #format(int) format}. */
	public static void nformat(long struct, int value) { memPutInt(struct + VkAttachmentDescription.FORMAT, value); }
	/** Unsafe version of {@link #samples(int) samples}. */
	public static void nsamples(long struct, int value) { memPutInt(struct + VkAttachmentDescription.SAMPLES, value); }
	/** Unsafe version of {@link #loadOp(int) loadOp}. */
	public static void nloadOp(long struct, int value) { memPutInt(struct + VkAttachmentDescription.LOADOP, value); }
	/** Unsafe version of {@link #storeOp(int) storeOp}. */
	public static void nstoreOp(long struct, int value) { memPutInt(struct + VkAttachmentDescription.STOREOP, value); }
	/** Unsafe version of {@link #stencilLoadOp(int) stencilLoadOp}. */
	public static void nstencilLoadOp(long struct, int value) { memPutInt(struct + VkAttachmentDescription.STENCILLOADOP, value); }
	/** Unsafe version of {@link #stencilStoreOp(int) stencilStoreOp}. */
	public static void nstencilStoreOp(long struct, int value) { memPutInt(struct + VkAttachmentDescription.STENCILSTOREOP, value); }
	/** Unsafe version of {@link #initialLayout(int) initialLayout}. */
	public static void ninitialLayout(long struct, int value) { memPutInt(struct + VkAttachmentDescription.INITIALLAYOUT, value); }
	/** Unsafe version of {@link #finalLayout(int) finalLayout}. */
	public static void nfinalLayout(long struct, int value) { memPutInt(struct + VkAttachmentDescription.FINALLAYOUT, value); }

	// -----------------------------------

	/** An array of {@link VkAttachmentDescription} structs. */
	public static final class Buffer extends StructBuffer<VkAttachmentDescription, Buffer> {

		/**
		 * Creates a new {@link VkAttachmentDescription.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkAttachmentDescription#SIZEOF}, and its mark will be undefined.
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
		protected VkAttachmentDescription newInstance(long address) {
			return new VkAttachmentDescription(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkAttachmentDescription.nflags(address()); }
		/** Returns the value of the {@code format} field. */
		public int format() { return VkAttachmentDescription.nformat(address()); }
		/** Returns the value of the {@code samples} field. */
		public int samples() { return VkAttachmentDescription.nsamples(address()); }
		/** Returns the value of the {@code loadOp} field. */
		public int loadOp() { return VkAttachmentDescription.nloadOp(address()); }
		/** Returns the value of the {@code storeOp} field. */
		public int storeOp() { return VkAttachmentDescription.nstoreOp(address()); }
		/** Returns the value of the {@code stencilLoadOp} field. */
		public int stencilLoadOp() { return VkAttachmentDescription.nstencilLoadOp(address()); }
		/** Returns the value of the {@code stencilStoreOp} field. */
		public int stencilStoreOp() { return VkAttachmentDescription.nstencilStoreOp(address()); }
		/** Returns the value of the {@code initialLayout} field. */
		public int initialLayout() { return VkAttachmentDescription.ninitialLayout(address()); }
		/** Returns the value of the {@code finalLayout} field. */
		public int finalLayout() { return VkAttachmentDescription.nfinalLayout(address()); }

		/** Sets the specified value to the {@code flags} field. */
		public VkAttachmentDescription.Buffer flags(int value) { VkAttachmentDescription.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code format} field. */
		public VkAttachmentDescription.Buffer format(int value) { VkAttachmentDescription.nformat(address(), value); return this; }
		/** Sets the specified value to the {@code samples} field. */
		public VkAttachmentDescription.Buffer samples(int value) { VkAttachmentDescription.nsamples(address(), value); return this; }
		/** Sets the specified value to the {@code loadOp} field. */
		public VkAttachmentDescription.Buffer loadOp(int value) { VkAttachmentDescription.nloadOp(address(), value); return this; }
		/** Sets the specified value to the {@code storeOp} field. */
		public VkAttachmentDescription.Buffer storeOp(int value) { VkAttachmentDescription.nstoreOp(address(), value); return this; }
		/** Sets the specified value to the {@code stencilLoadOp} field. */
		public VkAttachmentDescription.Buffer stencilLoadOp(int value) { VkAttachmentDescription.nstencilLoadOp(address(), value); return this; }
		/** Sets the specified value to the {@code stencilStoreOp} field. */
		public VkAttachmentDescription.Buffer stencilStoreOp(int value) { VkAttachmentDescription.nstencilStoreOp(address(), value); return this; }
		/** Sets the specified value to the {@code initialLayout} field. */
		public VkAttachmentDescription.Buffer initialLayout(int value) { VkAttachmentDescription.ninitialLayout(address(), value); return this; }
		/** Sets the specified value to the {@code finalLayout} field. */
		public VkAttachmentDescription.Buffer finalLayout(int value) { VkAttachmentDescription.nfinalLayout(address(), value); return this; }

	}

}