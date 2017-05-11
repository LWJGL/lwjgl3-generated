/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * This extension provides additional orthogonally aligned "discard rectangles" specified in framebuffer-space coordinates that restrict rasterization of all points, lines and triangles.
 * 
 * <p>From zero to an implementation-dependent limit (specified by {@code maxDiscardRectangles}) number of discard rectangles can be operational at once. When one or more discard rectangles are active, rasterized fragments can either survive if the fragment is within any of the operational discard rectangles ({@link #VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT} mode) or be rejected if the fragment is within any of the operational discard rectangles ({@link #VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT} mode).</p>
 * 
 * <p>These discard rectangles operate orthogonally to the existing scissor test functionality. If the VK_KHX_device_group extension is enabled the discard rectangles can be different for each physical device in the device group by specifying the device mask and setting discard rectangle dynamic state.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_EXT_discard_rectangles</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>100</dd>
 * <dt><b>Status</b></dt>
 * <dd>Complete</dd>
 * <dt><b>Last Modified Data</b></dt>
 * <dd>2016-12-22</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>This extension requires Vulkan 1.0.</li>
 * <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VK_KHR_get_physical_device_properties2">VK_KHR_get_physical_device_properties2</a>.</li>
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
 * </dl>
 */
public class EXTDiscardRectangles {

    /** The extension specification version. */
    public static final int VK_EXT_DISCARD_RECTANGLES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_DISCARD_RECTANGLES_EXTENSION_NAME = "VK_EXT_discard_rectangles";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT = 1000099000,
        VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT = 1000099001;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT = 1000099000;

    /**
     * VkDiscardRectangleModeEXT - (no short description available)
     * 
     * <h5>Description</h5>
     * 
     * <p>For more information, see:</p>
     * 
     * <ul>
     * <li>The See Also section for other reference pages using this type.</li>
     * <li>The Vulkan Specification.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineDiscardRectangleStateCreateInfoEXT}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT}</li>
     * <li>{@link #VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT = 0,
        VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT = 1;

    protected EXTDiscardRectangles() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesDevice caps) {
        return checkFunctions(
            caps.vkCmdSetDiscardRectangleEXT
        );
    }

    // --- [ vkCmdSetDiscardRectangleEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetDiscardRectangleEXT CmdSetDiscardRectangleEXT}
     *
     * @param discardRectangleCount the number of discard rectangles whose state are updated by the command.
     */
    public static void nvkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, int firstDiscardRectangle, int discardRectangleCount, long pDiscardRectangles) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDiscardRectangleEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, commandBuffer.address(), firstDiscardRectangle, discardRectangleCount, pDiscardRectangles);
    }

    /**
     * (no short description available).
     * 
     * <h5>C Specification</h5>
     * 
     * <p>If the bound pipeline state object was not created with the {@link #VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_EXT} dynamic state enabled, discard rectangles are specified using the {@code pDiscardRectangles} member of {@link VkPipelineDiscardRectangleStateCreateInfoEXT} linked to the pipeline state object. If the pipeline state object was created with the {@link #VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_EXT} dynamic state enabled, the discard rectangles are dynamically set and changed with the command:</p>
     * 
     * <pre><code>void vkCmdSetDiscardRectangleEXT(
    VkCommandBuffer                             commandBuffer,
    uint32_t                                    firstDiscardRectangle,
    uint32_t                                    discardRectangleCount,
    const VkRect2D*                             pDiscardRectangles);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The discard rectangle taken from element <code>i</code> of {@code pDiscardRectangles} replace the current state for the discard rectangle index <code>firstDiscardRectangle {plus} i</code>, for <code>i</code> in <code>[0, discardRectangleCount)</code>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The currently bound graphics pipeline <b>must</b> have been created with the {@link #VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_EXT} dynamic state enabled</li>
     * <li>{@code firstDiscardRectangle} <b>must</b> be less than {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT}.{@code maxDiscardRectangles}</li>
     * <li>The sum of {@code firstDiscardRectangle} and {@code discardRectangleCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT}{@code ::maxDiscardRectangles}, inclusive</li>
     * <li>{@code pDiscardRectangles} <b>must</b> be a pointer to an array of {@code discardRectangleCount} valid {@link VkRect2D} structures</li>
     * <li>The {@code x} and {@code y} members of {@code offset} in {@link VkRect2D} <b>must</b> be greater than or equal to 0</li>
     * <li>Evaluation of ({@code offset.x} + {@code extent.width}) in {@link VkRect2D} <b>must</b> not cause a signed integer addition overflow</li>
     * <li>Evaluation of ({@code offset.y} + {@code extent.height}) in {@link VkRect2D} <b>must</b> not cause a signed integer addition overflow</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pDiscardRectangles} <b>must</b> be a pointer to an array of {@code discardRectangleCount} {@link VkRect2D} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>{@code discardRectangleCount} <b>must</b> be greater than 0</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRect2D}</p>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param firstDiscardRectangle the index of the first discard rectangle whose state is updated by the command.
     * @param pDiscardRectangles    a pointer to an array of {@link VkRect2D} structures specifying discard rectangles.
     */
    public static void vkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, int firstDiscardRectangle, VkRect2D.Buffer pDiscardRectangles) {
        nvkCmdSetDiscardRectangleEXT(commandBuffer, firstDiscardRectangle, pDiscardRectangles.remaining(), pDiscardRectangles.address());
    }

}