/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_EXT_depth_range_unrestricted</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>14</dd>
 * <dt><b>Status</b></dt>
 * <dd>Draft</dd>
 * <dt><b>Last Modified Data</b></dt>
 * <dd>2017-06-22</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>This extension requires Vulkan 1.0.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell (pdaniell 'at' nvidia.com)</li>
 * </ul></dd>
 * <dt><b>Overview</b></dt>
 * <dd>This extension removes the {@link VkViewport} {@code minDepth} and {@code maxDepth} restrictions that the values must be between {@code 0.0} and {@code 1.0}, inclusive. It also removes the same restriction on {@link VkPipelineDepthStencilStateCreateInfo} {@code minDepthBounds} and {@code maxDepthBounds}. Finally it removes the restriction on the {@code depth} value in {@link VkClearDepthStencilValue}.</dd>
 * </dl>
 */
public final class EXTDepthRangeUnrestricted {

    /** The extension specification version. */
    public static final int VK_EXT_DEPTH_RANGE_UNRESTRICTED_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_DEPTH_RANGE_UNRESTRICTED_EXTENSION_NAME = "VK_EXT_depth_range_unrestricted";

    private EXTDepthRangeUnrestricted() {}

}