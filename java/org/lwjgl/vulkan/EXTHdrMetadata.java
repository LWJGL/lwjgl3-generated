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
 * This extension defines two new structures and a function to assign SMPTE (the Society of Motion Picture and Television Engineers) 2086 metadata and CTA (Consumer Technology Assocation) 861.3 metadata to a swapchain. The metadata includes the color primaries, white point, and luminance range of the mastering display, which all together define the color volume that contains all the possible colors the mastering display can produce. The mastering display is the display where creative work is done and creative intent is established. To preserve such creative intent as much as possible and achieve consistent color reproduction on different viewing displays, it is useful for the display pipeline to know the color volume of the original mastering display where content was created or tuned. This avoids performing unnecessary mapping of colors that are not displayable on the original mastering display. The metadata also includes the maxContentLightLevel and maxFrameAverageLightLevel as defined by CTA 861.3.
 * 
 * <p>While the general purpose of the metadata is to assist in the transformation between different color volumes of different displays and help achieve better color reproduction, it is not in the scope of this extension to define how exactly the metadata should be used in such a process. It is up to the implementation to determine how to make use of the metadata.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_hdr_metadata}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>106</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VK_KHR_swapchain">{@code VK_KHR_swapchain}</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Courtney Goeltzenleuchter @courtneygo</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-03-04</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Courtney Goeltzenleuchter, Google</li>
 * </ul></dd>
 * </dl>
 */
public class EXTHdrMetadata {

    /** The extension specification version. */
    public static final int VK_EXT_HDR_METADATA_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_HDR_METADATA_EXTENSION_NAME = "VK_EXT_hdr_metadata";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_HDR_METADATA_EXT = 1000105000;

    protected EXTHdrMetadata() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesDevice caps) {
        return checkFunctions(
            caps.vkSetHdrMetadataEXT
        );
    }

    // --- [ vkSetHdrMetadataEXT ] ---

    /**
     * Unsafe version of: {@link #vkSetHdrMetadataEXT SetHdrMetadataEXT}
     *
     * @param swapchainCount the number of swapchains included in {@code pSwapchains}.
     */
    public static void nvkSetHdrMetadataEXT(VkDevice device, int swapchainCount, long pSwapchains, long pMetadata) {
        long __functionAddress = device.getCapabilities().vkSetHdrMetadataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, device.address(), swapchainCount, pSwapchains, pMetadata);
    }

    /**
     * function to set Hdr metadata.
     * 
     * <h5>C Specification</h5>
     * 
     * <code><pre>
     * void vkSetHdrMetadataEXT(
     *     VkDevice                                    device,
     *     uint32_t                                    swapchainCount,
     *     const VkSwapchainKHR*                       pSwapchains,
     *     const VkHdrMetadataEXT*                     pMetadata);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pSwapchains} <b>must</b> be a pointer to an array of {@code swapchainCount} valid {@code VkSwapchainKHR} handles</li>
     * <li>{@code pMetadata} <b>must</b> be a pointer to an array of {@code swapchainCount} valid {@link VkHdrMetadataEXT} structures</li>
     * <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
     * <li>Both of {@code device}, and the elements of {@code pSwapchains} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkHdrMetadataEXT}</p>
     *
     * @param device      the logical device where the swapchain(s) were created.
     * @param pSwapchains a pointer to the array of {@code swapchainCount} {@code VkSwapchainKHR} handles.
     * @param pMetadata   a pointer to the array of {@code swapchainCount} {@link VkHdrMetadataEXT} structures.
     */
    public static void vkSetHdrMetadataEXT(@NativeType("VkDevice") VkDevice device, @NativeType("const VkSwapchainKHR *") LongBuffer pSwapchains, @NativeType("const VkHdrMetadataEXT *") VkHdrMetadataEXT.Buffer pMetadata) {
        if (CHECKS) {
            check(pMetadata, pSwapchains.remaining());
        }
        nvkSetHdrMetadataEXT(device, pSwapchains.remaining(), memAddress(pSwapchains), pMetadata.address());
    }

    /** Array version of: {@link #vkSetHdrMetadataEXT SetHdrMetadataEXT} */
    public static void vkSetHdrMetadataEXT(@NativeType("VkDevice") VkDevice device, @NativeType("const VkSwapchainKHR *") long[] pSwapchains, @NativeType("const VkHdrMetadataEXT *") VkHdrMetadataEXT.Buffer pMetadata) {
        long __functionAddress = device.getCapabilities().vkSetHdrMetadataEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pMetadata, pSwapchains.length);
        }
        callPPPV(__functionAddress, device.address(), pSwapchains.length, pSwapchains, pMetadata.address());
    }

}