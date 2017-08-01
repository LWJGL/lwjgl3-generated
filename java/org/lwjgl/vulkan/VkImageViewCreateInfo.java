/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created image view.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code image} was created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, {@code format} <b>can</b> be different from the image's format, but if they are not equal they <b>must</b> be <em>compatible</em>. Image format compatibility is defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-formats-compatibility-classes">Format Compatibility Classes</a> section. Views of compatible formats will have the same mapping between texel coordinates and memory locations irrespective of the {@code format}, with only the interpretation of the bit pattern changing.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Values intended to be used with one view format <b>may</b> not be exactly preserved when written or read through a different format. For example, an integer value that happens to have the bit pattern of a floating point denorm or NaN <b>may</b> be flushed or canonicalized when written or read through a view with a floating point format. Similarly, a value written through a signed normalized format that has a bit pattern exactly equal to</p><code>-2<sup>b</sup></code>
 * 
 * <p><b>may</b> be changed to</p><code>-2<sup>b</sup> {plus} 1</code>
 * 
 * <p>as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#fundamentals-fixedfpconv">Conversion from Normalized Fixed-Point to Floating-Point</a>.</p>
 * </div>
 * 
 * <h6>Image and image view parameter compatibility requirements</h6>
 * 
 * <table class="lwjgl">
 * <thead><tr><th>Dim, Arrayed, MS</th><th>Image parameters</th><th>View parameters</th></tr></thead>
 * <tbody>
 * <tr><td></td><td>{@code imageType} = ci.{@code imageType} {@code width} = ci.{@code extent.width} {@code height} = ci.{@code extent.height} {@code depth} = ci.{@code extent.depth} {@code arrayLayers} = ci.{@code arrayLayers} {@code samples} = ci.{@code samples} {@code flags} = ci.{@code flags} where ci is the {@link VkImageCreateInfo} used to create {@code image}.</td><td>{@code baseArrayLayer}, {@code layerCount}, and {@code levelCount} are members of the {@code subresourceRange} member.</td></tr>
 * <tr><td>1D, 0, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} {@code width} ≥ 1 {@code height} = 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} = 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_1D IMAGE_VIEW_TYPE_1D} {@code baseArrayLayer} ≥ 0 {@code layerCount} = 1</td></tr>
 * <tr><td>1D, 1, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} {@code width} ≥ 1 {@code height} = 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} = 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY} {@code baseArrayLayer} ≥ 0 {@code layerCount} ≥ 1</td></tr>
 * <tr><td>2D, 0, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} = 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} {@code baseArrayLayer} ≥ 0 {@code layerCount} = 1</td></tr>
 * <tr><td>2D, 1, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} = 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} {@code baseArrayLayer} ≥ 0 {@code layerCount} ≥ 1</td></tr>
 * <tr><td>2D, 0, 1</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} &gt; 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} {@code baseArrayLayer} ≥ 0 {@code layerCount} = 1</td></tr>
 * <tr><td>2D, 1, 1</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} &gt; 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} {@code baseArrayLayer} ≥ 0 {@code layerCount} ≥ 1</td></tr>
 * <tr><td>CUBE, 0, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} {@code width} ≥ 1 {@code height} = {@code width} {@code depth} = 1 {@code arrayLayers} ≥ 6 {@code samples} = 1 {@code flags} includes {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE} {@code baseArrayLayer} ≥ 0 {@code layerCount} = 6</td></tr>
 * <tr><td>CUBE, 1, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} {@code width} ≥ 1 {@code height} = width {@code depth} = 1 <em>N</em> ≥ 1 {@code arrayLayers} ≥ 6 × <em>N</em> {@code samples} = 1 {@code flags} includes {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY} {@code baseArrayLayer} ≥ 0 {@code layerCount} = 6 × <em>N</em>, <em>N</em> ≥ 1</td></tr>
 * <tr><td>3D, 0, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} ≥ 1 {@code arrayLayers} = 1 {@code samples} = 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D} {@code baseArrayLayer} = 0 {@code layerCount} = 1</td></tr>
 * <tr><td>3D, 0, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} ≥ 1 {@code arrayLayers} = 1 {@code samples} = 1 {@code flags} includes {@link #IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT} {@code flags} does not include {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}, and {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} {@code levelCount} = 1 {@code baseArrayLayer} ≥ 0 {@code layerCount} = 1</td></tr>
 * <tr><td>3D, 0, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} ≥ 1 {@code arrayLayers} = 1 {@code samples} = 1 {@code flags} includes {@link #IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT} {@code flags} does not include {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}, and {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} {@code levelCount} = 1 {@code baseArrayLayer} ≥ 0 {@code layerCount} ≥ 1</td></tr>
 * </tbody>
 * </table>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code image} was not created with {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT} then {@code viewType} <b>must</b> not be {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-imageCubeArray">image cubemap arrays</a> feature is not enabled, {@code viewType} <b>must</b> not be {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} but without {@link KHRMaintenance1#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR} set then {@code viewType} <b>must</b> not be {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, {@code format} <b>must</b> be format that has at least one supported feature bit present in the value of {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}</li>
 * <li>{@code image} <b>must</b> have been created with a {@code usage} value containing at least one of {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and {@code usage} contains {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, {@code format} <b>must</b> be supported for sampled images, as specified by the {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and {@code usage} contains {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, {@code format} <b>must</b> be supported for storage images, as specified by the {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and {@code usage} contains {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@code format} <b>must</b> be supported for color attachments, as specified by the {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and {@code usage} contains {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@code format} <b>must</b> be supported for depth/stencil attachments, as specified by the {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code format} <b>must</b> be format that has at least one supported feature bit present in the value of {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL} and {@code usage} contains {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, {@code format} <b>must</b> be supported for sampled images, as specified by the {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT} flag in {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL} and {@code usage} contains {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, {@code format} <b>must</b> be supported for storage images, as specified by the {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT} flag in {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL} and {@code usage} contains {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@code format} <b>must</b> be supported for color attachments, as specified by the {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL} and {@code usage} contains {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@code format} <b>must</b> be supported for depth/stencil attachments, as specified by the {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT} flag in {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with the same value of {@code format}</li>
 * <li>{@code subresourceRange}{@code ::baseMipLevel} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange}{@code ::levelCount} is not {@link VK10#VK_REMAINING_MIP_LEVELS REMAINING_MIP_LEVELS}, {@code subresourceRange}{@code ::levelCount} <b>must</b> be non-zero and<code>subresourceRange::baseMipLevel + subresourceRange::levelCount</code>
 * 
 * <p><b>must</b> be less than or equal to the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</p></li>
 * <li>If {@code image} is not a 3D image created with {@link KHRMaintenance1#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR} set, or {@code viewType} is not {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}, {@code subresourceRange}{@code ::baseArrayLayer} <b>must</b> be less than the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange}{@code ::layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, {@code image} is not a 3D image created with {@link KHRMaintenance1#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR} set, or {@code viewType} is not {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}, {@code subresourceRange}{@code ::layerCount} <b>must</b> be non-zero and<code>subresourceRange::baseArrayLayer subresourceRange::layerCount</code>
 * 
 * <p><b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</p></li>
 * <li>If {@code image} is a 3D image created with {@link KHRMaintenance1#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR} set, and {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}, {@code subresourceRange}{@code ::baseArrayLayer} <b>must</b> be less than the {@code extent.depth} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange}{@code ::layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, {@code image} is a 3D image created with {@link KHRMaintenance1#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR} set, and {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}, {@code subresourceRange}{@code ::layerCount} <b>must</b> be non-zero and<code>subresourceRange::baseArrayLayer subresourceRange::layerCount</code>
 * 
 * <p><b>must</b> be less than or equal to the {@code extent.depth} specified in {@link VkImageCreateInfo} when {@code image} was created</p></li>
 * <li>If {@code image} was created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, {@code format} <b>must</b> be compatible with the {@code format} used to create {@code image}, as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-formats-compatibility-classes">Format Compatibility Classes</a></li>
 * <li>If {@code image} was not created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, {@code format} <b>must</b> be identical to the {@code format} used to create {@code image}</li>
 * <li>If {@code image} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code subresourceRange} and {@code viewType} <b>must</b> be compatible with the image, as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#resources-image-views-compatibility">compatibility table</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code viewType} <b>must</b> be a valid {@code VkImageViewType} value</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code components} <b>must</b> be a valid {@link VkComponentMapping} structure</li>
 * <li>{@code subresourceRange} <b>must</b> be a valid {@link VkImageSubresourceRange} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkComponentMapping}, {@link VkImageSubresourceRange}, {@link VK10#vkCreateImageView CreateImageView}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code image} &ndash; a {@code VkImage} on which the view will be created.</li>
 * <li>{@code viewType} &ndash; an {@code VkImageViewType} value specifying the type of the image view.</li>
 * <li>{@code format} &ndash; a {@code VkFormat} describing the format and type used to interpret data elements in the image.</li>
 * <li>{@code components} &ndash; a {@link VkComponentMapping} specifies a remapping of color components (or of depth or stencil components after they have been converted into color components).</li>
 * <li>{@code subresourceRange} &ndash; a {@link VkImageSubresourceRange} selecting the set of mipmap levels and array layers to be accessible to the view.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkImageViewCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkImageViewCreateFlags flags;
 *     VkImage image;
 *     VkImageViewType viewType;
 *     VkFormat format;
 *     {@link VkComponentMapping VkComponentMapping} components;
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} subresourceRange;
 * }</pre></code>
 */
public class VkImageViewCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        IMAGE,
        VIEWTYPE,
        FORMAT,
        COMPONENTS,
        SUBRESOURCERANGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF),
            __member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        IMAGE = layout.offsetof(3);
        VIEWTYPE = layout.offsetof(4);
        FORMAT = layout.offsetof(5);
        COMPONENTS = layout.offsetof(6);
        SUBRESOURCERANGE = layout.offsetof(7);
    }

    VkImageViewCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkImageViewCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageViewCreateInfo(ByteBuffer container) {
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
    @NativeType("VkImageViewCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code image} field. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** Returns the value of the {@code viewType} field. */
    @NativeType("VkImageViewType")
    public int viewType() { return nviewType(address()); }
    /** Returns the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** Returns a {@link VkComponentMapping} view of the {@code components} field. */
    public VkComponentMapping components() { return ncomponents(address()); }
    /** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
    public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageViewCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageViewCreateInfo pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkImageViewCreateInfo flags(@NativeType("VkImageViewCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    public VkImageViewCreateInfo image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@code viewType} field. */
    public VkImageViewCreateInfo viewType(@NativeType("VkImageViewType") int value) { nviewType(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkImageViewCreateInfo format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
    public VkImageViewCreateInfo components(VkComponentMapping value) { ncomponents(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
    public VkImageViewCreateInfo subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageViewCreateInfo set(
        int sType,
        long pNext,
        int flags,
        long image,
        int viewType,
        int format,
        VkComponentMapping components,
        VkImageSubresourceRange subresourceRange
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        image(image);
        viewType(viewType);
        format(format);
        components(components);
        subresourceRange(subresourceRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageViewCreateInfo set(VkImageViewCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkImageViewCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageViewCreateInfo malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkImageViewCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageViewCreateInfo calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkImageViewCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkImageViewCreateInfo create() {
        return new VkImageViewCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkImageViewCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkImageViewCreateInfo create(long address) {
        return address == NULL ? null : new VkImageViewCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkImageViewCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImageViewCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageViewCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImageViewCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageViewCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewCreateInfo mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewCreateInfo callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageViewCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageViewCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkImageViewCreateInfo.FLAGS); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + VkImageViewCreateInfo.IMAGE); }
    /** Unsafe version of {@link #viewType}. */
    public static int nviewType(long struct) { return memGetInt(struct + VkImageViewCreateInfo.VIEWTYPE); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkImageViewCreateInfo.FORMAT); }
    /** Unsafe version of {@link #components}. */
    public static VkComponentMapping ncomponents(long struct) { return VkComponentMapping.create(struct + VkImageViewCreateInfo.COMPONENTS); }
    /** Unsafe version of {@link #subresourceRange}. */
    public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkImageViewCreateInfo.SUBRESOURCERANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutLong(struct + VkImageViewCreateInfo.IMAGE, value); }
    /** Unsafe version of {@link #viewType(int) viewType}. */
    public static void nviewType(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.VIEWTYPE, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.FORMAT, value); }
    /** Unsafe version of {@link #components(VkComponentMapping) components}. */
    public static void ncomponents(long struct, VkComponentMapping value) { memCopy(value.address(), struct + VkImageViewCreateInfo.COMPONENTS, VkComponentMapping.SIZEOF); }
    /** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkImageViewCreateInfo.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkImageViewCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkImageViewCreateInfo, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkImageViewCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageViewCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkImageViewCreateInfo newInstance(long address) {
            return new VkImageViewCreateInfo(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkImageViewCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkImageViewCreateFlags")
        public int flags() { return VkImageViewCreateInfo.nflags(address()); }
        /** Returns the value of the {@code image} field. */
        @NativeType("VkImage")
        public long image() { return VkImageViewCreateInfo.nimage(address()); }
        /** Returns the value of the {@code viewType} field. */
        @NativeType("VkImageViewType")
        public int viewType() { return VkImageViewCreateInfo.nviewType(address()); }
        /** Returns the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkImageViewCreateInfo.nformat(address()); }
        /** Returns a {@link VkComponentMapping} view of the {@code components} field. */
        public VkComponentMapping components() { return VkImageViewCreateInfo.ncomponents(address()); }
        /** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
        public VkImageSubresourceRange subresourceRange() { return VkImageViewCreateInfo.nsubresourceRange(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageViewCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageViewCreateInfo.Buffer pNext(@NativeType("const void *") long value) { VkImageViewCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkImageViewCreateInfo.Buffer flags(@NativeType("VkImageViewCreateFlags") int value) { VkImageViewCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        public VkImageViewCreateInfo.Buffer image(@NativeType("VkImage") long value) { VkImageViewCreateInfo.nimage(address(), value); return this; }
        /** Sets the specified value to the {@code viewType} field. */
        public VkImageViewCreateInfo.Buffer viewType(@NativeType("VkImageViewType") int value) { VkImageViewCreateInfo.nviewType(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkImageViewCreateInfo.Buffer format(@NativeType("VkFormat") int value) { VkImageViewCreateInfo.nformat(address(), value); return this; }
        /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
        public VkImageViewCreateInfo.Buffer components(VkComponentMapping value) { VkImageViewCreateInfo.ncomponents(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
        public VkImageViewCreateInfo.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageViewCreateInfo.nsubresourceRange(address(), value); return this; }

    }

}