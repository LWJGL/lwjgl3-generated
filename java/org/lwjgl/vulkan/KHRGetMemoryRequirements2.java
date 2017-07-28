/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension provides new entry points to query memory requirements of images and buffers in a way that can be easily extended by other extensions, without introducing any further entry points. The Vulkan 1.0 VkMemoryRequirements and VkSparseImageMemoryRequirements structures do not include an sType/pNext, this extension wraps them in new structures with sType/pNext so an application can query a chain of memory requirements structures by constructing the chain and letting the implementation fill them in. A new command is added for each ftext:vkGet*MemoryRequrements command in core Vulkan 1.0.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_KHR_get_memory_requirements2</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>147</dd>
 * <dt><b>Status</b></dt>
 * <dd>Complete.</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-03-23</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Jesse Hall, Google</li>
 * </ul></dd>
 * <dt><b>Contacts</b></dt>
 * <dd><ul>
 * <li>Jason Ekstrand (jason.ekstrand 'at' intel.com)</li>
 * </ul></dd>
 * </dl>
 */
public class KHRGetMemoryRequirements2 {

    /** The extension specification version. */
    public static final int VK_KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME = "VK_KHR_get_memory_requirements2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR       = 1000146000,
        VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR        = 1000146001,
        VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR = 1000146002,
        VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR                   = 1000146003,
        VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR      = 1000146004;

    protected KHRGetMemoryRequirements2() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesDevice caps) {
        return checkFunctions(
            caps.vkGetImageMemoryRequirements2KHR, caps.vkGetBufferMemoryRequirements2KHR, caps.vkGetImageSparseMemoryRequirements2KHR
        );
    }

    // --- [ vkGetImageMemoryRequirements2KHR ] ---

    /** Unsafe version of: {@link #vkGetImageMemoryRequirements2KHR GetImageMemoryRequirements2KHR} */
    public static void nvkGetImageMemoryRequirements2KHR(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageMemoryRequirements2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, device.address(), pInfo, pMemoryRequirements);
    }

    /**
     * Returns the memory requirements for specified Vulkan object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the memory requirements for an image resource, call:</p>
     * 
     * <code><pre>
     * void vkGetImageMemoryRequirements2KHR(
     *     VkDevice                                    device,
     *     const VkImageMemoryRequirementsInfo2KHR*    pInfo,
     *     VkMemoryRequirements2KHR*                   pMemoryRequirements);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a pointer to a valid {@link VkImageMemoryRequirementsInfo2KHR} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a pointer to a {@link VkMemoryRequirements2KHR} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkImageMemoryRequirementsInfo2KHR}, {@link VkMemoryRequirements2KHR}</p>
     *
     * @param device              the logical device that owns the image.
     * @param pInfo               a pointer to an instance of the {@link VkImageMemoryRequirementsInfo2KHR} structure containing parameters required for the memory requirements query.
     * @param pMemoryRequirements points to an instance of the {@link VkMemoryRequirements2KHR} structure in which the memory requirements of the image object are returned.
     */
    public static void vkGetImageMemoryRequirements2KHR(VkDevice device, @NativeType("const VkImageMemoryRequirementsInfo2KHR *") VkImageMemoryRequirementsInfo2KHR pInfo, @NativeType("VkMemoryRequirements2KHR *") VkMemoryRequirements2KHR pMemoryRequirements) {
        nvkGetImageMemoryRequirements2KHR(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetBufferMemoryRequirements2KHR ] ---

    /** Unsafe version of: {@link #vkGetBufferMemoryRequirements2KHR GetBufferMemoryRequirements2KHR} */
    public static void nvkGetBufferMemoryRequirements2KHR(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetBufferMemoryRequirements2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, device.address(), pInfo, pMemoryRequirements);
    }

    /**
     * Returns the memory requirements for specified Vulkan object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the memory requirements for a buffer resource, call:</p>
     * 
     * <code><pre>
     * void vkGetBufferMemoryRequirements2KHR(
     *     VkDevice                                    device,
     *     const VkBufferMemoryRequirementsInfo2KHR*   pInfo,
     *     VkMemoryRequirements2KHR*                   pMemoryRequirements);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a pointer to a valid {@link VkBufferMemoryRequirementsInfo2KHR} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a pointer to a {@link VkMemoryRequirements2KHR} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBufferMemoryRequirementsInfo2KHR}, {@link VkMemoryRequirements2KHR}</p>
     *
     * @param device              the logical device that owns the buffer.
     * @param pInfo               a pointer to an instance of the {@link VkBufferMemoryRequirementsInfo2KHR} structure containing parameters required for the memory requirements query.
     * @param pMemoryRequirements points to an instance of the {@link VkMemoryRequirements2KHR} structure in which the memory requirements of the buffer object are returned.
     */
    public static void vkGetBufferMemoryRequirements2KHR(VkDevice device, @NativeType("const VkBufferMemoryRequirementsInfo2KHR *") VkBufferMemoryRequirementsInfo2KHR pInfo, @NativeType("VkMemoryRequirements2KHR *") VkMemoryRequirements2KHR pMemoryRequirements) {
        nvkGetBufferMemoryRequirements2KHR(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetImageSparseMemoryRequirements2KHR ] ---

    public static void nvkGetImageSparseMemoryRequirements2KHR(VkDevice device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(__functionAddress, device.address(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
    }

    public static void vkGetImageSparseMemoryRequirements2KHR(VkDevice device, @NativeType("const VkImageSparseMemoryRequirementsInfo2KHR *") VkImageSparseMemoryRequirementsInfo2KHR pInfo, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2KHR *") VkSparseImageMemoryRequirements2KHR.Buffer pSparseMemoryRequirements) {
        if (CHECKS) {
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetImageSparseMemoryRequirements2KHR(device, pInfo.address(), memAddress(pSparseMemoryRequirementCount), memAddressSafe(pSparseMemoryRequirements));
    }

    /** Array version of: {@link #vkGetImageSparseMemoryRequirements2KHR GetImageSparseMemoryRequirements2KHR} */
    public static void vkGetImageSparseMemoryRequirements2KHR(VkDevice device, @NativeType("const VkImageSparseMemoryRequirementsInfo2KHR *") VkImageSparseMemoryRequirementsInfo2KHR pInfo, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2KHR *") VkSparseImageMemoryRequirements2KHR.Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
        }
        callPPPPV(__functionAddress, device.address(), pInfo.address(), pSparseMemoryRequirementCount, memAddressSafe(pSparseMemoryRequirements));
    }

}