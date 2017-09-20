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
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters of a newly created image object.
 * 
 * <h5>Description</h5>
 * 
 * <p>Images created with {@code tiling} equal to {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} have further restrictions on their limits and capabilities compared to images created with {@code tiling} equal to {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}. Creation of images with tiling {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} <b>may</b> not be supported unless other parameters meet all of the constraints:</p>
 * 
 * <ul>
 * <li>{@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>{@code format} is not a depth/stencil format</li>
 * <li>{@code mipLevels} is 1</li>
 * <li>{@code arrayLayers} is 1</li>
 * <li>{@code samples} is {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>{@code usage} only includes {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} and/or {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}</li>
 * </ul>
 * 
 * <p>Implementations <b>may</b> support additional limits and capabilities beyond those listed above.</p>
 * 
 * <p>To query an implementation's specific capabilities for a given combination of {@code format}, {@code imageType}, {@code tiling}, {@code usage}, {@link VkExternalMemoryImageCreateInfoKHR}{@code ::handleTypes} and {@code flags}, call {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR}. The return value indicates whether that combination of image settings is supported. On success, the {@link VkImageFormatProperties} output parameter indicates the set of valid {@code samples} bits and the limits for {@code extent}, {@code mipLevels}, and {@code arrayLayers}.</p>
 * 
 * <p>To determine the set of valid {@code usage} bits for a given format, call {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>For images created without {@link KHRMaintenance2#VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR} a {@code usage} bit is valid if it is supported for the format the image is created with.</p>
 * 
 * <p>For images created with {@link KHRMaintenance2#VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR} a {@code usage} bit is valid if it is supported for at least one of the formats a {@code VkImageView} created from the image <b>can</b> have (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#resources-image-views">Image Views</a> for more detail).</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The combination of {@code format}, {@code imageType}, {@code tiling}, {@code usage}, and {@code flags} <b>must</b> be supported, as indicated by a {@link VK10#VK_SUCCESS SUCCESS} return value from {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} invoked with the same values passed to the corresponding parameters.</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code pQueueFamilyIndices} <b>must</b> be a pointer to an array of {@code queueFamilyIndexCount} {@code uint32_t} values</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code queueFamilyIndexCount} <b>must</b> be greater than 1</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, each element of {@code pQueueFamilyIndices} <b>must</b> be unique and <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by either {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} or {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceQueueFamilyProperties2KHR GetPhysicalDeviceQueueFamilyProperties2KHR} for the {@code physicalDevice} that was used to create {@code device}</li>
 * <li>{@code format} <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
 * <li>{@code extent}{@code ::width} <b>must</b> be greater than 0.</li>
 * <li>{@code extent}{@code ::height} <b>must</b> be greater than 0.</li>
 * <li>{@code extent}{@code ::depth} <b>must</b> be greater than 0.</li>
 * <li>{@code mipLevels} <b>must</b> be greater than 0</li>
 * <li>{@code arrayLayers} <b>must</b> be greater than 0</li>
 * <li>If {@code flags} contains {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}, {@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>If {@code flags} contains {@link KHRMaintenance1#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR}, {@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, {@code extent.width} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxImageDimension1D}, or {@link VkImageFormatProperties}{@code ::maxExtent}.width (as returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code imageType}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure) - whichever is higher</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code flags} does not contain {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}, {@code extent.width} and {@code extent.height} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxImageDimension2D}, or {@link VkImageFormatProperties}{@code ::maxExtent}.width/height (as returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code imageType}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure) - whichever is higher</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code flags} contains {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}, {@code extent.width} and {@code extent.height} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxImageDimensionCube}, or {@link VkImageFormatProperties}{@code ::maxExtent}.width/height (as returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code imageType}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure) - whichever is higher</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code flags} contains {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}, {@code extent.width} and {@code extent.height} <b>must</b> be equal and {@code arrayLayers} <b>must</b> be greater than or equal to 6</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, {@code extent.width}, {@code extent.height} and {@code extent.depth} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxImageDimension3D}, or {@link VkImageFormatProperties}{@code ::maxExtent}.width/height/depth (as returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code imageType}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure) - whichever is higher</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, both {@code extent.height} and {@code extent.depth} <b>must</b> be 1</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, {@code extent.depth} <b>must</b> be 1</li>
 * <li>{@code mipLevels} <b>must</b> be less than or equal to <code>⌊log<sub>2</sub>(max(extent.width, extent.height, extent.depth))⌋ + 1</code>.</li>
 * <li>If any of {@code extent.width}, {@code extent.height}, or {@code extent.depth} are greater than the equivalently named members of {@link VkPhysicalDeviceLimits}{@code ::maxImageDimension3D}, {@code mipLevels} <b>must</b> be less than or equal to {@link VkImageFormatProperties}{@code ::maxMipLevels} (as returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code imageType}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure)</li>
 * <li>{@code arrayLayers} <b>must</b> be less than or equal to {@link VkImageFormatProperties}{@code ::maxArrayLayers} (as returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code imageType}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure)</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, {@code arrayLayers} <b>must</b> be 1.</li>
 * <li>If {@code samples} is not {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}, {@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}, {@code tiling} <b>must</b> be {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, and {@code mipLevels} <b>must</b> be equal to 1</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}, then bits other than {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, and {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} <b>must</b> not be set</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}, or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}, {@code extent.width} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferWidth}</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}, or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}, {@code extent.height} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferHeight}</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}, {@code usage} <b>must</b> also contain at least one of {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}.</li>
 * <li>{@code samples} <b>must</b> be a bit value that is set in {@link VkImageFormatProperties}{@code ::sampleCounts} returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code imageType}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-shaderStorageImageMultisample">multisampled storage images</a> feature is not enabled, and {@code usage} contains {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, {@code samples} <b>must</b> be {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-sparseBinding">sparse bindings</a> feature is not enabled, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-sparseResidencyImage2D">sparse residency for 2D images</a> feature is not enabled, and {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-sparseResidencyImage3D">sparse residency for 3D images</a> feature is not enabled, and {@code imageType} is {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-sparseResidency2Samples">sparse residency for images with 2 samples</a> feature is not enabled, {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code samples} is {@link VK10#VK_SAMPLE_COUNT_2_BIT SAMPLE_COUNT_2_BIT}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-sparseResidency4Samples">sparse residency for images with 4 samples</a> feature is not enabled, {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code samples} is {@link VK10#VK_SAMPLE_COUNT_4_BIT SAMPLE_COUNT_4_BIT}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-sparseResidency8Samples">sparse residency for images with 8 samples</a> feature is not enabled, {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code samples} is {@link VK10#VK_SAMPLE_COUNT_8_BIT SAMPLE_COUNT_8_BIT}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-sparseResidency16Samples">sparse residency for images with 16 samples</a> feature is not enabled, {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code samples} is {@link VK10#VK_SAMPLE_COUNT_16_BIT SAMPLE_COUNT_16_BIT}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, {@code format} <b>must</b> be a format that has at least one supported feature bit present in the value of {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, and {@link VkFormatProperties}{@code ::linearTilingFeatures} (as returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}, {@code usage} <b>must</b> not contain {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, and {@link VkFormatProperties}{@code ::linearTilingFeatures} (as returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT}, {@code usage} <b>must</b> not contain {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, and {@link VkFormatProperties}{@code ::linearTilingFeatures} (as returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}, {@code usage} <b>must</b> not contain {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, and {@link VkFormatProperties}{@code ::linearTilingFeatures} (as returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@code usage} <b>must</b> not contain {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code format} <b>must</b> be a format that has at least one supported feature bit present in the value of {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, and {@link VkFormatProperties}{@code ::optimalTilingFeatures} (as returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}, {@code usage} <b>must</b> not contain {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, and {@link VkFormatProperties}{@code ::optimalTilingFeatures} (as returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT}, {@code usage} <b>must</b> not contain {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, and {@link VkFormatProperties}{@code ::optimalTilingFeatures} (as returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}, {@code usage} <b>must</b> not contain {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, and {@link VkFormatProperties}{@code ::optimalTilingFeatures} (as returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@code usage} <b>must</b> not contain {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} contains {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} or {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}, it <b>must</b> also contain {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}</li>
 * <li>If the {@code pNext} chain contains an instance of {@link VkExternalMemoryImageCreateInfoNV}, it <b>must</b> not contain an instance of {@link VkExternalMemoryImageCreateInfoKHR}.</li>
 * <li>If the {@code pNext} chain contains an instance of {@link VkExternalMemoryImageCreateInfoKHR}, its {@code handleTypes} member <b>must</b> only contain bits that are also in {@link VkExternalImageFormatPropertiesKHR}{@code ::externalMemoryProperties}{@code ::compatibleHandleTypes}, as returned by {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR} with {@code format}, {@code imageType}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure, and with an instance of {@link VkPhysicalDeviceExternalImageFormatInfoKHR} in the {@code pNext} chain, with a {@code handleType} equal to any one of the handle types specified in {@link VkExternalMemoryImageCreateInfoKHR}{@code ::handleTypes}</li>
 * <li>If the {@code pNext} chain contains an instance of {@link VkExternalMemoryImageCreateInfoNV}, its {@code handleTypes} member <b>must</b> only contain bits that are also in {@link VkExternalImageFormatPropertiesNV}{@code ::externalMemoryProperties}{@code ::compatibleHandleTypes}, as returned by {@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV} with {@code format}, {@code imageType}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure, and with {@code externalHandleType} equal to any one of the handle types specified in {@link VkExternalMemoryImageCreateInfoNV}{@code ::handleTypes}</li>
 * <li>If the logical device was created with {@link VkDeviceGroupDeviceCreateInfoKHX}{@code ::physicalDeviceCount} equal to 1, {@code flags} <b>must</b> not contain {@link KHXDeviceGroup#VK_IMAGE_CREATE_BIND_SFR_BIT_KHX IMAGE_CREATE_BIND_SFR_BIT_KHX}</li>
 * <li>If {@code flags} contains {@link KHXDeviceGroup#VK_IMAGE_CREATE_BIND_SFR_BIT_KHX IMAGE_CREATE_BIND_SFR_BIT_KHX}, then {@code mipLevels} <b>must</b> be one, {@code arrayLayers} <b>must</b> be one, {@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code tiling} <b>must</b> be {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}</li>
 * <li>If {@code flags} contains {@link KHRMaintenance2#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR}, then {@code format} <b>must</b> be a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#appendix-compressedtex-bc">block-compressed image format</a>, an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#appendix-compressedtex-etc2">ETC compressed image format</a>, or an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#appendix-compressedtex-astc">ASTC compressed image format</a>.</li>
 * <li>If {@code flags} contains {@link KHRMaintenance2#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR}, then {@code flags} <b>must</b> also contain {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT}.</li>
 * <li>{@code initialLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}.</li>
 * <li>If the {@code pNext} chain includes a {@link VkExternalMemoryImageCreateInfoKHR} or {@link VkExternalMemoryImageCreateInfoNV} structure whose {@code handleTypes} member is not 0, {@code initialLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}</li>
 * <li>If the image {@code format} is one of those listed in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-formats-requiring-sampler-ycbcr-conversion">the “Formats requiring sampler Y'C<sub>B</sub>C<sub>R</sub> conversion for {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT} image views” table</a>:
 * 
 * <ul>
 * <li>{@code mipLevels} <b>must</b> be 1</li>
 * <li>{@code samples} must be {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>{@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>{@code arrayLayers} <b>must</b> be 1</li>
 * </ul>
 * </li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code format} is a <em>multi-planar</em> format, and {@link VkFormatProperties}{@code ::optimalTilingFeatures} (as returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link KHRSamplerYcbcrConversion#VK_FORMAT_FEATURE_DISJOINT_BIT_KHR FORMAT_FEATURE_DISJOINT_BIT_KHR}, {@code flags} <b>must</b> not contain {@link KHRSamplerYcbcrConversion#VK_IMAGE_CREATE_DISJOINT_BIT_KHR IMAGE_CREATE_DISJOINT_BIT_KHR}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, {@code format} is a <em>multi-planar</em> format, and {@link VkFormatProperties}{@code ::linearTilingFeatures} (as returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}) does not include {@link KHRSamplerYcbcrConversion#VK_FORMAT_FEATURE_DISJOINT_BIT_KHR FORMAT_FEATURE_DISJOINT_BIT_KHR}, {@code flags} <b>must</b> not contain {@link KHRSamplerYcbcrConversion#VK_IMAGE_CREATE_DISJOINT_BIT_KHR IMAGE_CREATE_DISJOINT_BIT_KHR}</li>
 * <li>If {@code format} is not a <em>multi-planar</em> format, and {@code flags} does not include {@link KHRBindMemory2#VK_IMAGE_CREATE_ALIAS_BIT_KHR IMAGE_CREATE_ALIAS_BIT_KHR}, {@code flags} <b>must</b> not contain {@link KHRSamplerYcbcrConversion#VK_IMAGE_CREATE_DISJOINT_BIT_KHR IMAGE_CREATE_DISJOINT_BIT_KHR}</li>
 * <li>If {@code flags} contains {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} {@code format} <b>must</b> be a depth or depth/stencil format</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDedicatedAllocationImageCreateInfoNV}, {@link VkExternalMemoryImageCreateInfoKHR}, {@link VkExternalMemoryImageCreateInfoNV}, {@link VkImageFormatListCreateInfoKHR}, or {@link VkImageSwapchainCreateInfoKHX}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
 * <li>{@code imageType} <b>must</b> be a valid {@code VkImageType} value</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code usage} <b>must</b> not be 0</li>
 * <li>{@code sharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
 * <li>{@code initialLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent3D}, {@link VK10#vkCreateImage CreateImage}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkImageCreateFlagBits} describing additional parameters of the image.</li>
 * <li>{@code imageType} &ndash; a {@code VkImageType} value specifying the basic dimensionality of the image. Layers in array textures do not count as a dimension for the purposes of the image type.</li>
 * <li>{@code format} &ndash; a {@code VkFormat} describing the format and type of the data elements that will be contained in the image.</li>
 * <li>{@code extent} &ndash; a {@link VkExtent3D} describing the number of data elements in each dimension of the base level.</li>
 * <li>{@code mipLevels} &ndash; describes the number of levels of detail available for minified sampling of the image.</li>
 * <li>{@code arrayLayers} &ndash; the number of layers in the image.</li>
 * <li>{@code samples} &ndash; the number of sub-data element samples in the image as defined in {@code VkSampleCountFlagBits}. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#primsrast-multisampling">Multisampling</a>.</li>
 * <li>{@code tiling} &ndash; a {@code VkImageTiling} value specifying the tiling arrangement of the data elements in memory.</li>
 * <li>{@code usage} &ndash; a bitmask of {@code VkImageUsageFlagBits} describing the intended usage of the image.</li>
 * <li>{@code sharingMode} &ndash; a {@code VkSharingMode} value specifying the sharing mode of the image when it will be accessed by multiple queue families.</li>
 * <li>{@code queueFamilyIndexCount} &ndash; the number of entries in the {@code pQueueFamilyIndices} array.</li>
 * <li>{@code pQueueFamilyIndices} &ndash; a list of queue families that will access this image (ignored if {@code sharingMode} is not {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}).</li>
 * <li>{@code initialLayout} &ndash; a {@code VkImageLayout} value specifying the initial {@code VkImageLayout} of all image subresources of the image. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#resources-image-layouts">Image Layouts</a>.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkImageCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkImageCreateFlags flags;
 *     VkImageType imageType;
 *     VkFormat format;
 *     {@link VkExtent3D VkExtent3D} extent;
 *     uint32_t mipLevels;
 *     uint32_t arrayLayers;
 *     VkSampleCountFlagBits samples;
 *     VkImageTiling tiling;
 *     VkImageUsageFlags usage;
 *     VkSharingMode sharingMode;
 *     uint32_t queueFamilyIndexCount;
 *     const uint32_t * pQueueFamilyIndices;
 *     VkImageLayout initialLayout;
 * }</pre></code>
 */
public class VkImageCreateInfo extends Struct implements NativeResource {

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
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("const void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkImageCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code imageType} field. */
    @NativeType("VkImageType")
    public int imageType() { return nimageType(address()); }
    /** Returns the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** Returns a {@link VkExtent3D} view of the {@code extent} field. */
    public VkExtent3D extent() { return nextent(address()); }
    /** Returns the value of the {@code mipLevels} field. */
    @NativeType("uint32_t")
    public int mipLevels() { return nmipLevels(address()); }
    /** Returns the value of the {@code arrayLayers} field. */
    @NativeType("uint32_t")
    public int arrayLayers() { return narrayLayers(address()); }
    /** Returns the value of the {@code samples} field. */
    @NativeType("VkSampleCountFlagBits")
    public int samples() { return nsamples(address()); }
    /** Returns the value of the {@code tiling} field. */
    @NativeType("VkImageTiling")
    public int tiling() { return ntiling(address()); }
    /** Returns the value of the {@code usage} field. */
    @NativeType("VkImageUsageFlags")
    public int usage() { return nusage(address()); }
    /** Returns the value of the {@code sharingMode} field. */
    @NativeType("VkSharingMode")
    public int sharingMode() { return nsharingMode(address()); }
    /** Returns the value of the {@code queueFamilyIndexCount} field. */
    @NativeType("uint32_t")
    public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
    @NativeType("const uint32_t *")
    public IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }
    /** Returns the value of the {@code initialLayout} field. */
    @NativeType("VkImageLayout")
    public int initialLayout() { return ninitialLayout(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageCreateInfo pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkImageCreateInfo flags(@NativeType("VkImageCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code imageType} field. */
    public VkImageCreateInfo imageType(@NativeType("VkImageType") int value) { nimageType(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkImageCreateInfo format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
    public VkImageCreateInfo extent(VkExtent3D value) { nextent(address(), value); return this; }
    /** Sets the specified value to the {@code mipLevels} field. */
    public VkImageCreateInfo mipLevels(@NativeType("uint32_t") int value) { nmipLevels(address(), value); return this; }
    /** Sets the specified value to the {@code arrayLayers} field. */
    public VkImageCreateInfo arrayLayers(@NativeType("uint32_t") int value) { narrayLayers(address(), value); return this; }
    /** Sets the specified value to the {@code samples} field. */
    public VkImageCreateInfo samples(@NativeType("VkSampleCountFlagBits") int value) { nsamples(address(), value); return this; }
    /** Sets the specified value to the {@code tiling} field. */
    public VkImageCreateInfo tiling(@NativeType("VkImageTiling") int value) { ntiling(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public VkImageCreateInfo usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code sharingMode} field. */
    public VkImageCreateInfo sharingMode(@NativeType("VkSharingMode") int value) { nsharingMode(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
    public VkImageCreateInfo pQueueFamilyIndices(@NativeType("const uint32_t *") IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }
    /** Sets the specified value to the {@code initialLayout} field. */
    public VkImageCreateInfo initialLayout(@NativeType("VkImageLayout") int value) { ninitialLayout(address(), value); return this; }

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

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageCreateInfo set(VkImageCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
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
        return create(__malloc(capacity, SIZEOF), capacity);
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
        return new Buffer(__create(capacity, SIZEOF));
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
        if (nqueueFamilyIndexCount(struct) != 0) {
            check(memGetAddress(struct + VkImageCreateInfo.PQUEUEFAMILYINDICES));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkImageCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkImageCreateInfo, Buffer> implements NativeResource {

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
            return new VkImageCreateInfo(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkImageCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkImageCreateFlags")
        public int flags() { return VkImageCreateInfo.nflags(address()); }
        /** Returns the value of the {@code imageType} field. */
        @NativeType("VkImageType")
        public int imageType() { return VkImageCreateInfo.nimageType(address()); }
        /** Returns the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkImageCreateInfo.nformat(address()); }
        /** Returns a {@link VkExtent3D} view of the {@code extent} field. */
        public VkExtent3D extent() { return VkImageCreateInfo.nextent(address()); }
        /** Returns the value of the {@code mipLevels} field. */
        @NativeType("uint32_t")
        public int mipLevels() { return VkImageCreateInfo.nmipLevels(address()); }
        /** Returns the value of the {@code arrayLayers} field. */
        @NativeType("uint32_t")
        public int arrayLayers() { return VkImageCreateInfo.narrayLayers(address()); }
        /** Returns the value of the {@code samples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int samples() { return VkImageCreateInfo.nsamples(address()); }
        /** Returns the value of the {@code tiling} field. */
        @NativeType("VkImageTiling")
        public int tiling() { return VkImageCreateInfo.ntiling(address()); }
        /** Returns the value of the {@code usage} field. */
        @NativeType("VkImageUsageFlags")
        public int usage() { return VkImageCreateInfo.nusage(address()); }
        /** Returns the value of the {@code sharingMode} field. */
        @NativeType("VkSharingMode")
        public int sharingMode() { return VkImageCreateInfo.nsharingMode(address()); }
        /** Returns the value of the {@code queueFamilyIndexCount} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndexCount() { return VkImageCreateInfo.nqueueFamilyIndexCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
        @NativeType("const uint32_t *")
        public IntBuffer pQueueFamilyIndices() { return VkImageCreateInfo.npQueueFamilyIndices(address()); }
        /** Returns the value of the {@code initialLayout} field. */
        @NativeType("VkImageLayout")
        public int initialLayout() { return VkImageCreateInfo.ninitialLayout(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkImageCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageCreateInfo.Buffer pNext(@NativeType("const void *") long value) { VkImageCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkImageCreateInfo.Buffer flags(@NativeType("VkImageCreateFlags") int value) { VkImageCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code imageType} field. */
        public VkImageCreateInfo.Buffer imageType(@NativeType("VkImageType") int value) { VkImageCreateInfo.nimageType(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkImageCreateInfo.Buffer format(@NativeType("VkFormat") int value) { VkImageCreateInfo.nformat(address(), value); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
        public VkImageCreateInfo.Buffer extent(VkExtent3D value) { VkImageCreateInfo.nextent(address(), value); return this; }
        /** Sets the specified value to the {@code mipLevels} field. */
        public VkImageCreateInfo.Buffer mipLevels(@NativeType("uint32_t") int value) { VkImageCreateInfo.nmipLevels(address(), value); return this; }
        /** Sets the specified value to the {@code arrayLayers} field. */
        public VkImageCreateInfo.Buffer arrayLayers(@NativeType("uint32_t") int value) { VkImageCreateInfo.narrayLayers(address(), value); return this; }
        /** Sets the specified value to the {@code samples} field. */
        public VkImageCreateInfo.Buffer samples(@NativeType("VkSampleCountFlagBits") int value) { VkImageCreateInfo.nsamples(address(), value); return this; }
        /** Sets the specified value to the {@code tiling} field. */
        public VkImageCreateInfo.Buffer tiling(@NativeType("VkImageTiling") int value) { VkImageCreateInfo.ntiling(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public VkImageCreateInfo.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkImageCreateInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code sharingMode} field. */
        public VkImageCreateInfo.Buffer sharingMode(@NativeType("VkSharingMode") int value) { VkImageCreateInfo.nsharingMode(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
        public VkImageCreateInfo.Buffer pQueueFamilyIndices(@NativeType("const uint32_t *") IntBuffer value) { VkImageCreateInfo.npQueueFamilyIndices(address(), value); return this; }
        /** Sets the specified value to the {@code initialLayout} field. */
        public VkImageCreateInfo.Buffer initialLayout(@NativeType("VkImageLayout") int value) { VkImageCreateInfo.ninitialLayout(address(), value); return this; }

    }

}