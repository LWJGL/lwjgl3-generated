/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * {@code VK_KHR_maintenance1} adds a collection of minor features that were intentionally left out or overlooked from the original Vulkan 1.0 release.
 * 
 * <p>The new features are as follows:</p>
 * 
 * <ul>
 * <li>Allow 2D and 2D array image views to be created from 3D images, which can then be used as color framebuffer attachments. This allows applications to render to slices of a 3D image.</li>
 * <li>Support {@link VK10#vkCmdCopyImage CmdCopyImage} between 2D array layers and 3D slices. This extension allows copying from layers of a 2D array image to slices of a 3D image and vice versa.</li>
 * <li>Allow negative height to be specified in the {@link VkViewport}{@code ::height} field to perform y-inversion of the clip-space to framebuffer-space transform. This allows apps to avoid having to use {@code gl_Position.y = -gl_Position.y} in shaders also targeting other APIs.</li>
 * <li>Allow implementations to express support for doing just transfers and clears of image formats that they otherwise support no other format features for. This is done by adding new format feature flags {@link #VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR} and {@link #VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR FORMAT_FEATURE_TRANSFER_DST_BIT_KHR}.</li>
 * <li>Support {@link VK10#vkCmdFillBuffer CmdFillBuffer} on transfer-only queues. Previously {@link VK10#vkCmdFillBuffer CmdFillBuffer} was defined to only work on command buffers allocated from command pools which support graphics or compute queues. It is now allowed on queues that just support transfer operations.</li>
 * <li>Fix the inconsistency of how error conditions are returned between the {@link VK10#vkCreateGraphicsPipelines CreateGraphicsPipelines} and {@link VK10#vkCreateComputePipelines CreateComputePipelines} functions and the {@link VK10#vkAllocateDescriptorSets AllocateDescriptorSets} and {@link VK10#vkAllocateCommandBuffers AllocateCommandBuffers} functions.</li>
 * <li>Add new {@link #VK_ERROR_OUT_OF_POOL_MEMORY_KHR ERROR_OUT_OF_POOL_MEMORY_KHR} error so implementations can give a more precise reason for {@link VK10#vkAllocateDescriptorSets AllocateDescriptorSets} failures.</li>
 * <li>Add a new command {@link #vkTrimCommandPoolKHR TrimCommandPoolKHR} which gives the implementation an opportunity to release any unused command pool memory back to the system.</li>
 * </ul>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_maintenance1}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>70</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell @pdaniell</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-10-26</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Dan Ginsburg, Valve</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Jesse Hall, Google</li>
 * <li>John Kessenich, Google</li>
 * <li>Michael Worcester, Imagination Technologies</li>
 * <li>Neil Henning, Codeplay Software Ltd.</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Slawomir Grajewski, Intel</li>
 * <li>Tobias Hector, Imagination Technologies</li>
 * <li>Tom Olson, ARM</li>
 * </ul></dd>
 * </dl>
 */
public class KHRMaintenance1 {

    /** The extension specification version. */
    public static final int VK_KHR_MAINTENANCE1_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_MAINTENANCE1_EXTENSION_NAME = "VK_KHR_maintenance1";

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY_KHR = -1000069000;

    /**
     * Extends {@code VkFormatFeatureFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR FORMAT_FEATURE_TRANSFER_DST_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR = 0x4000,
        VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR = 0x8000;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR = 0x20;

    protected KHRMaintenance1() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesDevice caps) {
        return checkFunctions(
            caps.vkTrimCommandPoolKHR
        );
    }

    // --- [ vkTrimCommandPoolKHR ] ---

    /**
     * Trim a command pool.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To trim a command pool, call:</p>
     * 
     * <code><pre>
     * void vkTrimCommandPoolKHR(
     *     VkDevice                                    device,
     *     VkCommandPool                               commandPool,
     *     VkCommandPoolTrimFlagsKHR                   flags);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>Trimming a command pool recycles unused memory from the command pool back to the system. Command buffers allocated from the pool are not affected by the command.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This command provides applications with some control over the internal memory allocations used by command pools.</p>
     * 
     * <p>Unused memory normally arises from command buffers that have been recorded and later reset, such that they are no longer using the memory. On reset, a command buffer can return memory to its command pool, but the only way to release memory from a command pool to the system requires calling {@link VK10#vkResetCommandPool ResetCommandPool}, which cannot be executed while any command buffers from that pool are still in use. Subsequent recording operations into command buffers will re-use this memory but since total memory requirements fluctuate over time, unused memory can accumulate.</p>
     * 
     * <p>In this situation, trimming a command pool <b>may</b> be useful to return unused memory back to the system, returning the total outstanding memory allocated by the pool back to a more "{@code average}" value.</p>
     * 
     * <p>Implementations utilize many internal allocation strategies that make it impossible to guarantee that all unused memory is released back to the system. For instance, an implementation of a command pool <b>may</b> involve allocating memory in bulk from the system and sub-allocating from that memory. In such an implementation any live command buffer that holds a reference to a bulk allocation would prevent that allocation from being freed, even if only a small proportion of the bulk allocation is in use.</p>
     * 
     * <p>In most cases trimming will result in a reduction in allocated but unused memory, but it does not guarantee the "{@code ideal}" behaviour.</p>
     * 
     * <p>Trimming <b>may</b> be an expensive operation, and <b>should</b> not be called frequently. Trimming <b>should</b> be treated as a way to relieve memory pressure after application-known points when there exists enough unused memory that the cost of trimming is "{@code worth}" it.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
     * <li>{@code flags} <b>must</b> be 0</li>
     * <li>{@code commandPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
     * </ul>
     *
     * @param device      the logical device that owns the command pool.
     * @param commandPool the command pool to trim.
     * @param flags       reserved for future use.
     */
    public static void vkTrimCommandPoolKHR(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkCommandPoolTrimFlagsKHR") int flags) {
        long __functionAddress = device.getCapabilities().vkTrimCommandPoolKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(__functionAddress, device.address(), commandPool, flags);
    }

}