/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * {@code VK_KHR_maintenance2} adds a collection of minor features that were intentionally left out or overlooked from the original Vulkan 1.0 release.
 * 
 * <p>The new features are as follows:</p>
 * 
 * <ul>
 * <li>Allow the application to specify which aspect of an input attachment might be read for a given subpass.</li>
 * <li>Allow implementations to express the clipping behavior of points.</li>
 * <li>Allow creating images with usage flags that may not be supported for the base image&#8217;s format, but are supported for image views of the image that have a different but compatible format.</li>
 * <li>Allow creating uncompressed image views of compressed images.</li>
 * <li>Allow the application to select between an upper-left and lower-left origin for the tessellation domain space.</li>
 * <li>Adds two new image layouts for depth stencil images to allow either the depth or stencil aspect to be read-only while the other aspect is writable.</li>
 * </ul>
 * 
 * <h5>Input Attachment Specification</h5>
 * 
 * <p>Input attachment specification allows an application to specify which aspect of a multi-aspect image (e.g. a combined depth stencil format) will be accessed via a subpassLoad operation.</p>
 * 
 * <p>On some implementations there <b>may</b> be a performance penalty if the implementation does not know (at {@link VK10#vkCreateRenderPass CreateRenderPass} time) which aspect(s) of multi-aspect images <b>can</b> be be accessed as input attachments.</p>
 * 
 * <h5>Input Attachment Specification Example</h5>
 * 
 * <p>Consider the case where a render pass has two subpasses and two attachments.</p>
 * 
 * <p>Attachment 0 has the format VK_FORMAT_D24_UNORM_S8_UINT, attachment 1 has some color format.</p>
 * 
 * <p>Subpass 0 writes to attachment 0, subpass 1 reads only the depth information from attachment 0 (using inputAttachmentRead) and writes to attachment 1.</p>
 * 
 * <code><pre>
 *     VkInputAttachmentAspectReferenceKHR references[] = {
 *         {
 *             .subpass = 1,
 *             .inputAttachment = 0,
 *             .aspectMask = VK_IMAGE_ASPECT_DEPTH_BIT
 *         }
 *     };
 * 
 *     VkRenderPassInputAttachmentAspectCreateInfoKHR specifyAspects = {
 *         .sType = VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR,
 *         .pNext = NULL,
 *         .aspectReferenceCount = 1,
 *         .pAspectReferences = references
 *     };
 * 
 * 
 *     VkRenderPassCreateInfo createInfo = {
 *         ...
 *         .pNext = &specifyAspects,
 *         ...
 *     }
 * 
 *     vkCreateRenderPass(...);</pre></code>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_maintenance2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>118</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Michael Worcester @michaelworcester</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-04-28</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Michael Worcester, Imagination Technologies</li>
 * <li>Stuart Smith, Imagination Technologies</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Neil Henning, Codeplay</li>
 * <li>Piers Daniell, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRMaintenance2 {

    /** The extension specification version. */
    public static final int VK_KHR_MAINTENANCE2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_MAINTENANCE2_EXTENSION_NAME = "VK_KHR_maintenance2";

    /**
     * Extends {@code VkImageCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR}</li>
     * <li>{@link #VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR = 0x80,
        VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR              = 0x100;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO_KHR STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR             = 1000117000,
        VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR       = 1000117001,
        VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO_KHR                          = 1000117002,
        VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR = 1000117003;

    /**
     * Extends {@code VkImageLayout}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR = 1000117000,
        VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR = 1000117001;

    /**
     * VkPointClippingBehaviorKHR - Enum specifying the point clipping behaviour
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR} specifies that the primitive is discarded if the vertex lies outside any clip plane, including the planes bounding the view volume.</li>
     * <li>{@link #VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR} specifies that the primitive is discarded only if the vertex lies outside any user clip plane.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDevicePointClippingPropertiesKHR}</p>
     */
    public static final int
        VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR       = 0,
        VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR = 1;

    /**
     * VkTessellationDomainOriginKHR - Enum describing tessellation domain origin
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR} indicates that the origin of the domain space is in the upper left corner, flipped vertically from what is shown in figure <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#img-tessellation-topology">img-tessellation-topology</a>.</li>
     * <li>{@link #VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR} indicates that the origin of the domain space is in the lower left corner, as shown in figure <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#img-tessellation-topology">img-tessellation-topology</a>.</li>
     * </ul>
     * 
     * <p>This enum affects how the {@code VertexOrderCw} and {@code VertexOrderCcw} tessellation execution modes are interpreted, since the winding is defined relative to the orientation of the domain.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineTessellationDomainOriginStateCreateInfoKHR}</p>
     */
    public static final int
        VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR = 0,
        VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR = 1;

    private KHRMaintenance2() {}

}