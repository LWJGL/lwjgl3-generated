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
 * This extension provides versions of {@link VK10#vkBindBufferMemory BindBufferMemory} and {@link VK10#vkBindImageMemory BindImageMemory} that allow multiple bindings to be performed at once, and are extensible.
 * 
 * <p>This extension also introduces {@link #VK_IMAGE_CREATE_ALIAS_BIT_KHR IMAGE_CREATE_ALIAS_BIT_KHR}, which allows "{@code identical}" images that alias the same memory to interpret the contents consistently, even across image layout changes.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_bind_memory2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>158</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector @tobias</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-05-19</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Tobias Hector, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public class KHRBindMemory2 {

    /** The extension specification version. */
    public static final int VK_KHR_BIND_MEMORY_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_BIND_MEMORY_2_EXTENSION_NAME = "VK_KHR_bind_memory2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR = 1000157000,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR  = 1000157001;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_ALIAS_BIT_KHR = 0x400;

    protected KHRBindMemory2() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesDevice caps) {
        return checkFunctions(
            caps.vkBindBufferMemory2KHR, caps.vkBindImageMemory2KHR
        );
    }

    // --- [ vkBindBufferMemory2KHR ] ---

    /**
     * Unsafe version of: {@link #vkBindBufferMemory2KHR BindBufferMemory2KHR}
     *
     * @param bindInfoCount the number of elements in {@code pBindInfos}.
     */
    public static int nvkBindBufferMemory2KHR(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindBufferMemory2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, device.address(), bindInfoCount, pBindInfos);
    }

    /**
     * Bind device memory to buffer objects.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To attach memory to buffer objects for one or more buffers at a time, call:</p>
     * 
     * <code><pre>
     * VkResult vkBindBufferMemory2KHR(
     *     VkDevice                                    device,
     *     uint32_t                                    bindInfoCount,
     *     const VkBindBufferMemoryInfoKHR*            pBindInfos);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>On some implementations, it <b>may</b> be more efficient to batch memory bindings into a single command.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pBindInfos} <b>must</b> be a valid pointer to an array of {@code bindInfoCount} valid {@link VkBindBufferMemoryInfoKHR} structures</li>
     * <li>{@code bindInfoCount} <b>must</b> be greater than 0</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBindBufferMemoryInfoKHR}</p>
     *
     * @param device     the logical device that owns the buffers and memory.
     * @param pBindInfos a pointer to an array of structures of type {@link VkBindBufferMemoryInfoKHR}, describing buffers and memory to bind.
     */
    @NativeType("VkResult")
    public static int vkBindBufferMemory2KHR(VkDevice device, @NativeType("const VkBindBufferMemoryInfoKHR *") VkBindBufferMemoryInfoKHR.Buffer pBindInfos) {
        return nvkBindBufferMemory2KHR(device, pBindInfos.remaining(), pBindInfos.address());
    }

    // --- [ vkBindImageMemory2KHR ] ---

    /**
     * Unsafe version of: {@link #vkBindImageMemory2KHR BindImageMemory2KHR}
     *
     * @param bindInfoCount the number of elements in {@code pBindInfos}.
     */
    public static int nvkBindImageMemory2KHR(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindImageMemory2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, device.address(), bindInfoCount, pBindInfos);
    }

    /**
     * Bind device memory to image objects.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To attach memory to image objects for one or more images at a time, call:</p>
     * 
     * <code><pre>
     * VkResult vkBindImageMemory2KHR(
     *     VkDevice                                    device,
     *     uint32_t                                    bindInfoCount,
     *     const VkBindImageMemoryInfoKHR*             pBindInfos);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>On some implementations, it <b>may</b> be more efficient to batch memory bindings into a single command.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pBindInfos} <b>must</b> be a valid pointer to an array of {@code bindInfoCount} valid {@link VkBindImageMemoryInfoKHR} structures</li>
     * <li>{@code bindInfoCount} <b>must</b> be greater than 0</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBindImageMemoryInfoKHR}</p>
     *
     * @param device     the logical device that owns the images and memory.
     * @param pBindInfos a pointer to an array of structures of type {@link VkBindImageMemoryInfoKHR}, describing images and memory to bind.
     */
    @NativeType("VkResult")
    public static int vkBindImageMemory2KHR(VkDevice device, @NativeType("const VkBindImageMemoryInfoKHR *") VkBindImageMemoryInfoKHR.Buffer pBindInfos) {
        return nvkBindImageMemory2KHR(device, pBindInfos.remaining(), pBindInfos.address());
    }

}