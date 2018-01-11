/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds a new rasterization mode called conservative rasterization. There are two modes of conservative rasterization; overestimation and underestimation.
 * 
 * <p>When overestimation is enabled, if any part of the primitive, including its edges, covers any part of the rectangular pixel area, including its sides, then a fragment is generated with all coverage samples turned on. This extension allows for some variation in implementations by accounting for differences in overestimation, where the generating primitive size is increased at each of its edges by some sub-pixel amount to further increase conservative pixel coverage. Implementations can allow the application to specify an extra overestimation beyond the base overestimation the implementation already does. It also allows implementations to either cull degenerate primitives or rasterize them.</p>
 * 
 * <p>When underestimation is enabled, fragments are only generated if the rectangular pixel area is fully covered by the generating primitive. If supported by the implementation, when a pixel rectangle is fully covered the fragment shader input variable builtin called FullyCoveredEXT is set to true. The shader variable works in either overestimation or underestimation mode.</p>
 * 
 * <p>Implementations can process degenerate triangles and lines by either discarding them or generating conservative fragments for them. Degenerate triangles are those that end up with zero area after the rasterizer quantizes them to the fixed-point pixel grid. Degenerate lines are those with zero length after quantization.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_conservative_rasterization}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>102</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell @pdaniell</li>
 * </ul></dd>
 * <dt><b>Last Modified Data</b></dt>
 * <dd>2017-08-28</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Slawomir Grajewski, Intel</li>
 * <li>Stu Smith, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTConservativeRasterization {

    /** The extension specification version. */
    public static final int VK_EXT_CONSERVATIVE_RASTERIZATION_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_CONSERVATIVE_RASTERIZATION_EXTENSION_NAME = "VK_EXT_conservative_rasterization";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT = 1000101000,
        VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT = 1000101001;

    /**
     * VkConservativeRasterizationModeEXT - Specify the conservative rasterization mode
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT} specifies that conservative rasterization is disabled and rasterization proceeds as normal.</li>
     * <li>{@link #VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT} specifies that conservative rasterization is enabled in overestimation mode.</li>
     * <li>{@link #VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT} specifies that conservative rasterization is enabled in underestimation mode.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineRasterizationConservativeStateCreateInfoEXT}</p>
     */
    public static final int
        VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT      = 0,
        VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT  = 1,
        VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT = 2;

    private EXTConservativeRasterization() {}

}