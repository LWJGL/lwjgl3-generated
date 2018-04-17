/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows instance-rate vertex attributes to be repeated for certain number of instances instead of advancing for every instance when instanced rendering is enabled.
 * 
 * <h5>Examples</h5>
 * 
 * <p>To create a vertex binding such that the first binding uses instanced rendering and the same attribute is used for every 4 draw instances, an application could use the following set of structures:</p>
 * 
 * <code><pre>
 *     const VkVertexInputBindingDivisorDescriptionEXT divisorDesc =
 *     {
 *         0,
 *         4
 *     };
 * 
 *     const VkPipelineVertexInputDivisorStateCreateInfoEXT divisorInfo =
 *     {
 *         VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT, // sType
 *         NULL,                                                             // pNext
 *         1,                                                                // vertexBindingDivisorCount
 *         &divisorDesc                                                      // pVertexBindingDivisors
 *     }
 * 
 *     const VkVertexInputBindingDescription binding =
 *     {
 *         0,                                                                // binding
 *         sizeof(Vertex),                                                   // stride
 *         VK_VERTEX_INPUT_RATE_INSTANCE                                     // inputRate
 *     };
 * 
 *     const VkPipelineVertexInputStateCreateInfo viInfo =
 *     {
 *         VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_CREATE_INFO,              // sType
 *         &divisorInfo,                                                     // pNext
 *         ...
 *     };
 *     //...</pre></code>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_vertex_attribute_divisor}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>191</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Vikram Kushwaha @vkushwaha</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-02-08</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Vikram Kushwaha, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTVertexAttributeDivisor {

    /** The extension specification version. */
    public static final int VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME = "VK_EXT_vertex_attribute_divisor";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT = 1000190000,
        VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT     = 1000190001;

    private EXTVertexAttributeDivisor() {}

}