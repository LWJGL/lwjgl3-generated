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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkImageCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkImageCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how an image should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
 * <li>{@code imageType} <b>must</b> be a valid {@code VkImageType} value</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code usage} <b>must not</b> be 0</li>
 * <li>{@code sharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
 * <li>{@code initialLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code pQueueFamilyIndices} <b>must</b> be a pointer to an array of {@code queueFamilyIndexCount}
 * {@code uint32_t} values</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code queueFamilyIndexCount} <b>must</b> be greater than 1</li>
 * <li>{@code format} <b>must not</b> be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
 * <li>The {@code width}, {@code height}, and {@code depth} members of {@code extent} <b>must</b> all be greater than 0</li>
 * <li>{@code mipLevels} <b>must</b> be greater than 0</li>
 * <li>{@code arrayLayers} <b>must</b> be greater than 0</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, {@code extent.width} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxImageDimension1D},
 * or {@link VkImageFormatProperties}{@code ::maxExtent}.width (as returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code type},
 * {@code tiling}, {@code usage} and {@code flags} equal to those in this structure) - whichever is higher</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code flags} does not contain {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}, {@code extent.width} and
 * {@code extent.height} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxImageDimension2D}, or
 * {@link VkImageFormatProperties}{@code ::maxExtent}.width/height (as returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format},
 * {@code type}, {@code tiling}, {@code usage} and {@code flags} equal to those in this structure) - whichever is higher</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code flags} contains {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}, {@code extent.width} and {@code extent.height}
 * <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxImageDimensionCube}, or
 * {@link VkImageFormatProperties}{@code ::maxExtent}.width/height (as returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format},
 * {@code type}, {@code tiling}, {@code usage} and {@code flags} equal to those in this structure) - whichever is higher</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code flags} contains {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}, {@code extent.width} and {@code extent.height}
 * <b>must</b> be equal</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, {@code extent.width}, {@code extent.height} and {@code extent.depth} <b>must</b> be less than or equal to
 * {@link VkPhysicalDeviceLimits}{@code ::maxImageDimension3D}, or {@link VkImageFormatProperties}{@code ::maxExtent}.width/height/depth (as returned by
 * {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code type}, {@code tiling}, {@code usage} and {@code flags} equal to those in this
 * structure) - whichever is higher</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, both {@code extent.height} and {@code extent.depth} <b>must</b> be 1</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, {@code extent.depth} <b>must</b> be 1</li>
 * <li>{@code mipLevels} <b>must</b> be less than or equal to <code>floor(log<sub>2</sub>(max(extent.width, extent.height, extent.depth))) + 1</code></li>
 * <li>If any of {@code extent.width}, {@code extent.height} or {@code extent.depth} are greater than the equivalently named members of
 * {@link VkPhysicalDeviceLimits}{@code ::maxImageDimension3D}, {@code mipLevels} <b>must</b> be less than or equal to
 * {@link VkImageFormatProperties}{@code ::maxMipLevels} (as returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code type},
 * {@code tiling}, {@code usage} and {@code flags} equal to those in this structure)</li>
 * <li>{@code arrayLayers} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxImageArrayLayers}, or
 * {@link VkImageFormatProperties}{@code ::maxArrayLayers} (as returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code type},
 * {@code tiling}, {@code usage} and {@code flags} equal to those in this structure) - whichever is higher</li>
 * <li>{@code samples} <b>must</b> be a bit value that is set in {@link VkPhysicalDeviceLimits}{@code ::sampleCounts} returned by {@link VK10#vkGetPhysicalDeviceProperties GetPhysicalDeviceProperties}, or
 * {@link VkImageFormatProperties}{@code ::sampleCounts} returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code type},
 * {@code tiling}, {@code usage} and {@code flags} equal to those in this structure</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT} or
 * {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}, {@code extent.width} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferWidth}</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT} or
 * {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}, {@code extent.height} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferHeight}</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@code samples} <b>must</b> be a bit value that is set in
 * {@link VkPhysicalDeviceLimits}{@code ::framebufferColorSampleCounts}</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, and {@code format} includes a depth aspect, {@code samples} <b>must</b> be a bit
 * value that is set in {@link VkPhysicalDeviceLimits}{@code ::framebufferDepthSampleCounts}</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, and {@code format} includes a stencil aspect, {@code samples} <b>must</b> be a bit
 * value that is set in {@link VkPhysicalDeviceLimits}{@code ::framebufferStencilSampleCounts}</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, and {@code format} includes a color aspect, {@code samples} <b>must</b> be a bit value that is set in
 * {@link VkPhysicalDeviceLimits}{@code ::sampledImageColorSampleCounts}</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, and {@code format} includes a depth aspect, {@code samples} <b>must</b> be a bit value that is set in
 * {@link VkPhysicalDeviceLimits}{@code ::sampledImageDepthSampleCounts}</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, and {@code format} is an integer format, {@code samples} <b>must</b> be a bit value that is set in
 * {@link VkPhysicalDeviceLimits}{@code ::sampledImageIntegerSampleCounts}</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, {@code samples} <b>must</b> be a bit value that is set in
 * {@link VkPhysicalDeviceLimits}{@code ::storageImageSampleCounts}</li>
 * <li>If the ETC2 texture compression feature is not enabled, {@code format} <b>must not</b> be {@link VK10#VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK FORMAT_ETC2_R8G8B8_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK FORMAT_ETC2_R8G8B8_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_EAC_R11_UNORM_BLOCK FORMAT_EAC_R11_UNORM_BLOCK}, {@link VK10#VK_FORMAT_EAC_R11_SNORM_BLOCK FORMAT_EAC_R11_SNORM_BLOCK}, {@link VK10#VK_FORMAT_EAC_R11G11_UNORM_BLOCK FORMAT_EAC_R11G11_UNORM_BLOCK}, or {@link VK10#VK_FORMAT_EAC_R11G11_SNORM_BLOCK FORMAT_EAC_R11G11_SNORM_BLOCK}</li>
 * <li>If the ASTC LDR texture compression feature is not enabled, {@code format} <b>must not</b> be {@link VK10#VK_FORMAT_ASTC_4x4_UNORM_BLOCK FORMAT_ASTC_4x4_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_4x4_SRGB_BLOCK FORMAT_ASTC_4x4_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_ASTC_5x4_UNORM_BLOCK FORMAT_ASTC_5x4_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_5x4_SRGB_BLOCK FORMAT_ASTC_5x4_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_5x5_UNORM_BLOCK FORMAT_ASTC_5x5_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_5x5_SRGB_BLOCK FORMAT_ASTC_5x5_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_6x5_UNORM_BLOCK FORMAT_ASTC_6x5_UNORM_BLOCK},
 * {@link VK10#VK_FORMAT_ASTC_6x5_SRGB_BLOCK FORMAT_ASTC_6x5_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_6x6_UNORM_BLOCK FORMAT_ASTC_6x6_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_6x6_SRGB_BLOCK FORMAT_ASTC_6x6_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_8x5_UNORM_BLOCK FORMAT_ASTC_8x5_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_8x5_SRGB_BLOCK FORMAT_ASTC_8x5_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_ASTC_8x6_UNORM_BLOCK FORMAT_ASTC_8x6_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_8x6_SRGB_BLOCK FORMAT_ASTC_8x6_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_8x8_UNORM_BLOCK FORMAT_ASTC_8x8_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_8x8_SRGB_BLOCK FORMAT_ASTC_8x8_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_ASTC_10x5_UNORM_BLOCK FORMAT_ASTC_10x5_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_10x5_SRGB_BLOCK FORMAT_ASTC_10x5_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_10x6_UNORM_BLOCK FORMAT_ASTC_10x6_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_10x6_SRGB_BLOCK FORMAT_ASTC_10x6_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_ASTC_10x8_UNORM_BLOCK FORMAT_ASTC_10x8_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_10x8_SRGB_BLOCK FORMAT_ASTC_10x8_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_10x10_UNORM_BLOCK FORMAT_ASTC_10x10_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_10x10_SRGB_BLOCK FORMAT_ASTC_10x10_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_ASTC_12x10_UNORM_BLOCK FORMAT_ASTC_12x10_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_12x10_SRGB_BLOCK FORMAT_ASTC_12x10_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_12x12_UNORM_BLOCK FORMAT_ASTC_12x12_UNORM_BLOCK}, or {@link VK10#VK_FORMAT_ASTC_12x12_SRGB_BLOCK FORMAT_ASTC_12x12_SRGB_BLOCK}</li>
 * <li>If the BC texture compression feature is not enabled, {@code format} <b>must not</b> be {@link VK10#VK_FORMAT_BC1_RGB_UNORM_BLOCK FORMAT_BC1_RGB_UNORM_BLOCK}, {@link VK10#VK_FORMAT_BC1_RGB_SRGB_BLOCK FORMAT_BC1_RGB_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_BC1_RGBA_UNORM_BLOCK FORMAT_BC1_RGBA_UNORM_BLOCK}, {@link VK10#VK_FORMAT_BC1_RGBA_SRGB_BLOCK FORMAT_BC1_RGBA_SRGB_BLOCK}, {@link VK10#VK_FORMAT_BC2_UNORM_BLOCK FORMAT_BC2_UNORM_BLOCK}, {@link VK10#VK_FORMAT_BC2_SRGB_BLOCK FORMAT_BC2_SRGB_BLOCK}, {@link VK10#VK_FORMAT_BC3_UNORM_BLOCK FORMAT_BC3_UNORM_BLOCK},
 * {@link VK10#VK_FORMAT_BC3_SRGB_BLOCK FORMAT_BC3_SRGB_BLOCK}, {@link VK10#VK_FORMAT_BC4_UNORM_BLOCK FORMAT_BC4_UNORM_BLOCK}, {@link VK10#VK_FORMAT_BC4_SNORM_BLOCK FORMAT_BC4_SNORM_BLOCK}, {@link VK10#VK_FORMAT_BC5_UNORM_BLOCK FORMAT_BC5_UNORM_BLOCK}, {@link VK10#VK_FORMAT_BC5_SNORM_BLOCK FORMAT_BC5_SNORM_BLOCK},
 * {@link VK10#VK_FORMAT_BC6H_UFLOAT_BLOCK FORMAT_BC6H_UFLOAT_BLOCK}, {@link VK10#VK_FORMAT_BC6H_SFLOAT_BLOCK FORMAT_BC6H_SFLOAT_BLOCK}, {@link VK10#VK_FORMAT_BC7_UNORM_BLOCK FORMAT_BC7_UNORM_BLOCK}, or {@link VK10#VK_FORMAT_BC7_SRGB_BLOCK FORMAT_BC7_SRGB_BLOCK}</li>
 * <li>If the multisampled storage images feature is not enabled, and {@code usage} contains {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, {@code samples} <b>must</b> be
 * {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If the sparse bindings feature is not enabled, {@code flags} <b>must not</b> contain {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}</li>
 * <li>If the sparse residency for 2D images feature is not enabled, and {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, {@code flags} <b>must not</b> contain
 * {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the sparse residency for 3D images feature is not enabled, and {@code imageType} is {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, {@code flags} <b>must not</b> contain
 * {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the sparse residency for images with 2 samples feature is not enabled, {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code samples} is
 * {@link VK10#VK_SAMPLE_COUNT_2_BIT SAMPLE_COUNT_2_BIT}, {@code flags} <b>must not</b> contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the sparse residency for images with 4 samples feature is not enabled, {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code samples} is
 * {@link VK10#VK_SAMPLE_COUNT_4_BIT SAMPLE_COUNT_4_BIT}, {@code flags} <b>must not</b> contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the sparse residency for images with 8 samples feature is not enabled, {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code samples} is
 * {@link VK10#VK_SAMPLE_COUNT_8_BIT SAMPLE_COUNT_8_BIT}, {@code flags} <b>must not</b> contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the sparse residency for images with 16 samples feature is not enabled, {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code samples} is
 * {@link VK10#VK_SAMPLE_COUNT_16_BIT SAMPLE_COUNT_16_BIT}, {@code flags} <b>must not</b> contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, and {@link VkFormatProperties}{@code ::linearTilingFeatures} (as returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}, {@code usage}
 * <b>must not</b> contain {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, and {@link VkFormatProperties}{@code ::linearTilingFeatures} (as returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT}, {@code usage}
 * <b>must not</b> contain {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, and {@link VkFormatProperties}{@code ::linearTilingFeatures} (as returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}, {@code usage}
 * <b>must not</b> contain {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, and {@link VkFormatProperties}{@code ::linearTilingFeatures} (as returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT},
 * {@code usage} <b>must not</b> contain {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, and {@link VkFormatProperties}{@code ::optimalTilingFeatures} (as returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}, {@code usage}
 * <b>must not</b> contain {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, and {@link VkFormatProperties}{@code ::optimalTilingFeatures} (as returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT}, {@code usage}
 * <b>must not</b> contain {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, and {@link VkFormatProperties}{@code ::optimalTilingFeatures} (as returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}, {@code usage}
 * <b>must not</b> contain {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, and {@link VkFormatProperties}{@code ::optimalTilingFeatures} (as returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT},
 * {@code usage} <b>must not</b> contain {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} contains {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} or {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}, it <b>must</b> also contain
 * {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; a {@code VkImageCreateFlagBits} bitfield describing additional parameters of the image. One or more of:<br><table><tr><td>{@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}</td><td>{@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT}</td></tr><tr><td>{@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}</td><td>{@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}</td></tr><tr><td>{@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</td></tr></table></li>
 * <li>{@code imageType} &ndash; the basic dimensionality of the image. One of:<br><table><tr><td>{@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}</td><td>{@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</td><td>{@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</td></tr></table></li>
 * <li>{@code format} &ndash; a {@code VkFormat} describing the format and type of the data elements that will be contained in the image</li>
 * <li>{@code extent} &ndash; a {@link VkExtent3D} describing the number of data elements in each dimension of the base level</li>
 * <li>{@code mipLevels} &ndash; the number of levels of detail available for minified sampling of the image</li>
 * <li>{@code arrayLayers} &ndash; the number of layers in the image</li>
 * <li>{@code samples} &ndash; the number of sub-data element samples in the image as defined in {@code VkSampleCountFlagBits}. One or more of:<br><table><tr><td>{@link VK10#VK_SAMPLE_COUNT_16_BIT SAMPLE_COUNT_16_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_2_BIT SAMPLE_COUNT_2_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_32_BIT SAMPLE_COUNT_32_BIT}</td></tr><tr><td>{@link VK10#VK_SAMPLE_COUNT_4_BIT SAMPLE_COUNT_4_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_64_BIT SAMPLE_COUNT_64_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_8_BIT SAMPLE_COUNT_8_BIT}</td></tr></table></li>
 * <li>{@code tiling} &ndash; the tiling arrangement of the data elements in memory. One of:<br><table><tr><td>{@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}</td><td>{@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}</td></tr></table></li>
 * <li>{@code usage} &ndash; a bitfield describing the intended usage of the image. One or more of:<br><table><tr><td>{@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</td><td>{@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</td></tr><tr><td>{@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</td><td>{@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}</td></tr><tr><td>{@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}</td><td>{@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}</td></tr><tr><td>{@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT}</td><td>{@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}</td></tr></table></li>
 * <li>{@code sharingMode} &ndash; the sharing mode of the image when it will be accessed by multiple queue families. One of:<br><table><tr><td>{@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}</td><td>{@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE}</td></tr></table></li>
 * <li>{@code queueFamilyIndexCount} &ndash; the number of entries in the {@code pQueueFamilyIndices} array</li>
 * <li>{@code pQueueFamilyIndices} &ndash; a list of queue families that will access this image (ignored if {@code sharingMode} is not {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT})</li>
 * <li>{@code initialLayout} &ndash; selects the initial {@code VkImageLayout} state of all image subresources of the image. One of:<br><table><tr><td>{@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</td><td>{@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkImageCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkImageCreateFlags flags;
    VkImageType imageType;
    VkFormat format;
    {@link VkExtent3D VkExtent3D} extent;
    uint32_t mipLevels;
    uint32_t arrayLayers;
    VkSampleCountFlagBits samples;
    VkImageTiling tiling;
    VkImageUsageFlags usage;
    VkSharingMode sharingMode;
    uint32_t queueFamilyIndexCount;
    const uint32_t * pQueueFamilyIndices;
    VkImageLayout initialLayout;
}</code></pre>
 */
public class VkImageCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		IMAGETYPE,
		FORMAT,
		EXTENT,
		MIPLEVELS,
		ARRAYLAYERS,
		SAMPLES,
		TILING,
		USAGE,
		SHARINGMODE,
		QUEUEFAMILYINDEXCOUNT,
		PQUEUEFAMILYINDICES,
		INITIALLAYOUT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		IMAGETYPE = layout.offsetof(3);
		FORMAT = layout.offsetof(4);
		EXTENT = layout.offsetof(5);
		MIPLEVELS = layout.offsetof(6);
		ARRAYLAYERS = layout.offsetof(7);
		SAMPLES = layout.offsetof(8);
		TILING = layout.offsetof(9);
		USAGE = layout.offsetof(10);
		SHARINGMODE = layout.offsetof(11);
		QUEUEFAMILYINDEXCOUNT = layout.offsetof(12);
		PQUEUEFAMILYINDICES = layout.offsetof(13);
		INITIALLAYOUT = layout.offsetof(14);
	}

	VkImageCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImageCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImageCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code imageType} field. */
	public int imageType() { return nimageType(address()); }
	/** Returns the value of the {@code format} field. */
	public int format() { return nformat(address()); }
	/** Returns a {@link VkExtent3D} view of the {@code extent} field. */
	public VkExtent3D extent() { return nextent(address()); }
	/** Returns the value of the {@code mipLevels} field. */
	public int mipLevels() { return nmipLevels(address()); }
	/** Returns the value of the {@code arrayLayers} field. */
	public int arrayLayers() { return narrayLayers(address()); }
	/** Returns the value of the {@code samples} field. */
	public int samples() { return nsamples(address()); }
	/** Returns the value of the {@code tiling} field. */
	public int tiling() { return ntiling(address()); }
	/** Returns the value of the {@code usage} field. */
	public int usage() { return nusage(address()); }
	/** Returns the value of the {@code sharingMode} field. */
	public int sharingMode() { return nsharingMode(address()); }
	/** Returns the value of the {@code queueFamilyIndexCount} field. */
	public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
	public IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }
	/** Returns the value of the {@code initialLayout} field. */
	public int initialLayout() { return ninitialLayout(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkImageCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkImageCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkImageCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code imageType} field. */
	public VkImageCreateInfo imageType(int value) { nimageType(address(), value); return this; }
	/** Sets the specified value to the {@code format} field. */
	public VkImageCreateInfo format(int value) { nformat(address(), value); return this; }
	/** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
	public VkImageCreateInfo extent(VkExtent3D value) { nextent(address(), value); return this; }
	/** Sets the specified value to the {@code mipLevels} field. */
	public VkImageCreateInfo mipLevels(int value) { nmipLevels(address(), value); return this; }
	/** Sets the specified value to the {@code arrayLayers} field. */
	public VkImageCreateInfo arrayLayers(int value) { narrayLayers(address(), value); return this; }
	/** Sets the specified value to the {@code samples} field. */
	public VkImageCreateInfo samples(int value) { nsamples(address(), value); return this; }
	/** Sets the specified value to the {@code tiling} field. */
	public VkImageCreateInfo tiling(int value) { ntiling(address(), value); return this; }
	/** Sets the specified value to the {@code usage} field. */
	public VkImageCreateInfo usage(int value) { nusage(address(), value); return this; }
	/** Sets the specified value to the {@code sharingMode} field. */
	public VkImageCreateInfo sharingMode(int value) { nsharingMode(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
	public VkImageCreateInfo pQueueFamilyIndices(IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }
	/** Sets the specified value to the {@code initialLayout} field. */
	public VkImageCreateInfo initialLayout(int value) { ninitialLayout(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkImageCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int imageType,
		int format,
		VkExtent3D extent,
		int mipLevels,
		int arrayLayers,
		int samples,
		int tiling,
		int usage,
		int sharingMode,
		IntBuffer pQueueFamilyIndices,
		int initialLayout
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		imageType(imageType);
		format(format);
		extent(extent);
		mipLevels(mipLevels);
		arrayLayers(arrayLayers);
		samples(samples);
		tiling(tiling);
		usage(usage);
		sharingMode(sharingMode);
		pQueueFamilyIndices(pQueueFamilyIndices);
		initialLayout(initialLayout);

		return this;
	}

	/** Unsafe version of {@link #set(VkImageCreateInfo) set}. */
	public VkImageCreateInfo nset(long struct) {
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
	public VkImageCreateInfo set(VkImageCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkImageCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkImageCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImageCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkImageCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImageCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkImageCreateInfo create() {
		return new VkImageCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImageCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImageCreateInfo create(long address) {
		return address == NULL ? null : new VkImageCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImageCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkImageCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkImageCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkImageCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkImageCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkImageCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImageCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImageCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImageCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkImageCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkImageCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkImageCreateInfo.FLAGS); }
	/** Unsafe version of {@link #imageType}. */
	public static int nimageType(long struct) { return memGetInt(struct + VkImageCreateInfo.IMAGETYPE); }
	/** Unsafe version of {@link #format}. */
	public static int nformat(long struct) { return memGetInt(struct + VkImageCreateInfo.FORMAT); }
	/** Unsafe version of {@link #extent}. */
	public static VkExtent3D nextent(long struct) { return VkExtent3D.create(struct + VkImageCreateInfo.EXTENT); }
	/** Unsafe version of {@link #mipLevels}. */
	public static int nmipLevels(long struct) { return memGetInt(struct + VkImageCreateInfo.MIPLEVELS); }
	/** Unsafe version of {@link #arrayLayers}. */
	public static int narrayLayers(long struct) { return memGetInt(struct + VkImageCreateInfo.ARRAYLAYERS); }
	/** Unsafe version of {@link #samples}. */
	public static int nsamples(long struct) { return memGetInt(struct + VkImageCreateInfo.SAMPLES); }
	/** Unsafe version of {@link #tiling}. */
	public static int ntiling(long struct) { return memGetInt(struct + VkImageCreateInfo.TILING); }
	/** Unsafe version of {@link #usage}. */
	public static int nusage(long struct) { return memGetInt(struct + VkImageCreateInfo.USAGE); }
	/** Unsafe version of {@link #sharingMode}. */
	public static int nsharingMode(long struct) { return memGetInt(struct + VkImageCreateInfo.SHARINGMODE); }
	/** Unsafe version of {@link #queueFamilyIndexCount}. */
	public static int nqueueFamilyIndexCount(long struct) { return memGetInt(struct + VkImageCreateInfo.QUEUEFAMILYINDEXCOUNT); }
	/** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
	public static IntBuffer npQueueFamilyIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkImageCreateInfo.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }
	/** Unsafe version of {@link #initialLayout}. */
	public static int ninitialLayout(long struct) { return memGetInt(struct + VkImageCreateInfo.INITIALLAYOUT); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkImageCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkImageCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkImageCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #imageType(int) imageType}. */
	public static void nimageType(long struct, int value) { memPutInt(struct + VkImageCreateInfo.IMAGETYPE, value); }
	/** Unsafe version of {@link #format(int) format}. */
	public static void nformat(long struct, int value) { memPutInt(struct + VkImageCreateInfo.FORMAT, value); }
	/** Unsafe version of {@link #extent(VkExtent3D) extent}. */
	public static void nextent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkImageCreateInfo.EXTENT, VkExtent3D.SIZEOF); }
	/** Unsafe version of {@link #mipLevels(int) mipLevels}. */
	public static void nmipLevels(long struct, int value) { memPutInt(struct + VkImageCreateInfo.MIPLEVELS, value); }
	/** Unsafe version of {@link #arrayLayers(int) arrayLayers}. */
	public static void narrayLayers(long struct, int value) { memPutInt(struct + VkImageCreateInfo.ARRAYLAYERS, value); }
	/** Unsafe version of {@link #samples(int) samples}. */
	public static void nsamples(long struct, int value) { memPutInt(struct + VkImageCreateInfo.SAMPLES, value); }
	/** Unsafe version of {@link #tiling(int) tiling}. */
	public static void ntiling(long struct, int value) { memPutInt(struct + VkImageCreateInfo.TILING, value); }
	/** Unsafe version of {@link #usage(int) usage}. */
	public static void nusage(long struct, int value) { memPutInt(struct + VkImageCreateInfo.USAGE, value); }
	/** Unsafe version of {@link #sharingMode(int) sharingMode}. */
	public static void nsharingMode(long struct, int value) { memPutInt(struct + VkImageCreateInfo.SHARINGMODE, value); }
	/** Sets the specified value to the {@code queueFamilyIndexCount} field of the specified {@code struct}. */
	public static void nqueueFamilyIndexCount(long struct, int value) { memPutInt(struct + VkImageCreateInfo.QUEUEFAMILYINDEXCOUNT, value); }
	/** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
	public static void npQueueFamilyIndices(long struct, IntBuffer value) { memPutAddress(struct + VkImageCreateInfo.PQUEUEFAMILYINDICES, memAddressSafe(value)); nqueueFamilyIndexCount(struct, value == null ? 0 : value.remaining()); }
	/** Unsafe version of {@link #initialLayout(int) initialLayout}. */
	public static void ninitialLayout(long struct, int value) { memPutInt(struct + VkImageCreateInfo.INITIALLAYOUT, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( nqueueFamilyIndexCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkImageCreateInfo.PQUEUEFAMILYINDICES));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link VkImageCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkImageCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkImageCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImageCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkImageCreateInfo newInstance(long address) {
			return new VkImageCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkImageCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkImageCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkImageCreateInfo.nflags(address()); }
		/** Returns the value of the {@code imageType} field. */
		public int imageType() { return VkImageCreateInfo.nimageType(address()); }
		/** Returns the value of the {@code format} field. */
		public int format() { return VkImageCreateInfo.nformat(address()); }
		/** Returns a {@link VkExtent3D} view of the {@code extent} field. */
		public VkExtent3D extent() { return VkImageCreateInfo.nextent(address()); }
		/** Returns the value of the {@code mipLevels} field. */
		public int mipLevels() { return VkImageCreateInfo.nmipLevels(address()); }
		/** Returns the value of the {@code arrayLayers} field. */
		public int arrayLayers() { return VkImageCreateInfo.narrayLayers(address()); }
		/** Returns the value of the {@code samples} field. */
		public int samples() { return VkImageCreateInfo.nsamples(address()); }
		/** Returns the value of the {@code tiling} field. */
		public int tiling() { return VkImageCreateInfo.ntiling(address()); }
		/** Returns the value of the {@code usage} field. */
		public int usage() { return VkImageCreateInfo.nusage(address()); }
		/** Returns the value of the {@code sharingMode} field. */
		public int sharingMode() { return VkImageCreateInfo.nsharingMode(address()); }
		/** Returns the value of the {@code queueFamilyIndexCount} field. */
		public int queueFamilyIndexCount() { return VkImageCreateInfo.nqueueFamilyIndexCount(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
		public IntBuffer pQueueFamilyIndices() { return VkImageCreateInfo.npQueueFamilyIndices(address()); }
		/** Returns the value of the {@code initialLayout} field. */
		public int initialLayout() { return VkImageCreateInfo.ninitialLayout(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkImageCreateInfo.Buffer sType(int value) { VkImageCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkImageCreateInfo.Buffer pNext(long value) { VkImageCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkImageCreateInfo.Buffer flags(int value) { VkImageCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code imageType} field. */
		public VkImageCreateInfo.Buffer imageType(int value) { VkImageCreateInfo.nimageType(address(), value); return this; }
		/** Sets the specified value to the {@code format} field. */
		public VkImageCreateInfo.Buffer format(int value) { VkImageCreateInfo.nformat(address(), value); return this; }
		/** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
		public VkImageCreateInfo.Buffer extent(VkExtent3D value) { VkImageCreateInfo.nextent(address(), value); return this; }
		/** Sets the specified value to the {@code mipLevels} field. */
		public VkImageCreateInfo.Buffer mipLevels(int value) { VkImageCreateInfo.nmipLevels(address(), value); return this; }
		/** Sets the specified value to the {@code arrayLayers} field. */
		public VkImageCreateInfo.Buffer arrayLayers(int value) { VkImageCreateInfo.narrayLayers(address(), value); return this; }
		/** Sets the specified value to the {@code samples} field. */
		public VkImageCreateInfo.Buffer samples(int value) { VkImageCreateInfo.nsamples(address(), value); return this; }
		/** Sets the specified value to the {@code tiling} field. */
		public VkImageCreateInfo.Buffer tiling(int value) { VkImageCreateInfo.ntiling(address(), value); return this; }
		/** Sets the specified value to the {@code usage} field. */
		public VkImageCreateInfo.Buffer usage(int value) { VkImageCreateInfo.nusage(address(), value); return this; }
		/** Sets the specified value to the {@code sharingMode} field. */
		public VkImageCreateInfo.Buffer sharingMode(int value) { VkImageCreateInfo.nsharingMode(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
		public VkImageCreateInfo.Buffer pQueueFamilyIndices(IntBuffer value) { VkImageCreateInfo.npQueueFamilyIndices(address(), value); return this; }
		/** Sets the specified value to the {@code initialLayout} field. */
		public VkImageCreateInfo.Buffer initialLayout(int value) { VkImageCreateInfo.ninitialLayout(address(), value); return this; }

	}

}