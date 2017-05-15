/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension provides new entry points to query device surface capabilities in a way that can be easily extended by other extensions, without introducing any further entry points. This extension can be considered the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VK_KHR_surface">VK_KHR_surface</a> equivalent of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VK_KHR_get_physical_device_properties2"> VK_KHR_get_physical_device_properties2</a> extension.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_KHR_get_surface_capabilities2</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>120</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-02-27</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>This extension requires VK_KHR_surface.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ian Elliott, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Alon Or-bach, Samsung</li>
 * </ul></dd>
 * <dt><b>Contacts</b></dt>
 * <dd><ul>
 * <li>James Jones, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class KHRGetSurfaceCapabilities2 {

    /** The extension specification version. */
    public static final int VK_KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME = "VK_KHR_get_surface_capabilities2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR = 1000119000,
        VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR         = 1000119001,
        VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR               = 1000119002;

    protected KHRGetSurfaceCapabilities2() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesInstance caps) {
        return checkFunctions(
            caps.vkGetPhysicalDeviceSurfaceCapabilities2KHR, caps.vkGetPhysicalDeviceSurfaceFormats2KHR
        );
    }

    // --- [ vkGetPhysicalDeviceSurfaceCapabilities2KHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR} */
    public static int nvkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, long pSurfaceInfo, long pSurfaceCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceCapabilities2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, physicalDevice.address(), pSurfaceInfo, pSurfaceCapabilities);
    }

    /**
     * Reports capabilities of a surface on a physical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the basic capabilities of a surface defined by the core or extensions, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetPhysicalDeviceSurfaceCapabilities2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceSurfaceInfo2KHR*      pSurfaceInfo,
     *     VkSurfaceCapabilities2KHR*                  pSurfaceCapabilities);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR} behaves similarly to {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR}, with the ability to specify extended inputs via chained input structures, and to return extended information via chained output structures.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pSurfaceInfo} <b>must</b> be a pointer to a valid {@link VkPhysicalDeviceSurfaceInfo2KHR} structure</li>
     * <li>{@code pSurfaceCapabilities} <b>must</b> be a pointer to a {@link VkSurfaceCapabilities2KHR} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceSurfaceInfo2KHR}, {@link VkSurfaceCapabilities2KHR}</p>
     *
     * @param physicalDevice       the physical device that will be associated with the swapchain to be created, as described for {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param pSurfaceInfo         points to an instance of the {@link VkPhysicalDeviceSurfaceInfo2KHR} structure, describing the surface and other fixed parameters that would be consumed by {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param pSurfaceCapabilities points to an instance of the {@link VkSurfaceCapabilities2KHR} structure in which the capabilities are returned.
     */
    public static int vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkSurfaceCapabilities2KHR pSurfaceCapabilities) {
        return nvkGetPhysicalDeviceSurfaceCapabilities2KHR(physicalDevice, pSurfaceInfo.address(), pSurfaceCapabilities.address());
    }

    // --- [ vkGetPhysicalDeviceSurfaceFormats2KHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceSurfaceFormats2KHR GetPhysicalDeviceSurfaceFormats2KHR}
     *
     * @param pSurfaceFormatCount a pointer to an integer related to the number of format tuples available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, long pSurfaceInfo, long pSurfaceFormatCount, long pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormats2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(__functionAddress, physicalDevice.address(), pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats);
    }

    /**
     * Query color formats supported by surface.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the supported swapchain format tuples for a surface, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetPhysicalDeviceSurfaceFormats2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceSurfaceInfo2KHR*      pSurfaceInfo,
     *     uint32_t*                                   pSurfaceFormatCount,
     *     VkSurfaceFormat2KHR*                        pSurfaceFormats);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pSurfaceFormats} is {@code NULL}, then the number of format tuples supported for the given {@code surface} is returned in {@code pSurfaceFormatCount}. The number of format tuples supported will be greater than or equal to 1. Otherwise, {@code pSurfaceFormatCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSurfaceFormats} array, and on return the variable is overwritten with the number of structures actually written to {@code pSurfaceFormats}. If the value of {@code pSurfaceFormatCount} is less than the number of format tuples supported, at most {@code pSurfaceFormatCount} structures will be written. If {@code pSurfaceFormatCount} is smaller than the number of format tuples supported for the surface parameters described in {@code pSurfaceInfo}, {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS} to indicate that not all the available values were returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pSurfaceInfo} <b>must</b> be a pointer to a valid {@link VkPhysicalDeviceSurfaceInfo2KHR} structure</li>
     * <li>{@code pSurfaceFormatCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pSurfaceFormatCount} is not 0, and {@code pSurfaceFormats} is not {@code NULL}, {@code pSurfaceFormats} <b>must</b> be a pointer to an array of {@code pSurfaceFormatCount} {@link VkSurfaceFormat2KHR} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceSurfaceInfo2KHR}, {@link VkSurfaceFormat2KHR}</p>
     *
     * @param physicalDevice      the physical device that will be associated with the swapchain to be created, as described for {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param pSurfaceInfo        points to an instance of the {@link VkPhysicalDeviceSurfaceInfo2KHR} structure, describing the surface and other fixed parameters that would be consumed by {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param pSurfaceFormatCount a pointer to an integer related to the number of format tuples available or queried, as described below.
     * @param pSurfaceFormats     either {@code NULL} or a pointer to an array of {@link VkSurfaceFormat2KHR} structures.
     */
    public static int vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, IntBuffer pSurfaceFormatCount, VkSurfaceFormat2KHR.Buffer pSurfaceFormats) {
        if (CHECKS) {
            check(pSurfaceFormatCount, 1);
            checkSafe(pSurfaceFormats, pSurfaceFormatCount.get(pSurfaceFormatCount.position()));
        }
        return nvkGetPhysicalDeviceSurfaceFormats2KHR(physicalDevice, pSurfaceInfo.address(), memAddress(pSurfaceFormatCount), memAddressSafe(pSurfaceFormats));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceSurfaceFormats2KHR GetPhysicalDeviceSurfaceFormats2KHR} */
    public static int vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, int[] pSurfaceFormatCount, VkSurfaceFormat2KHR.Buffer pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormats2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurfaceFormatCount, 1);
            checkSafe(pSurfaceFormats, pSurfaceFormatCount[0]);
        }
        return callPPPPI(__functionAddress, physicalDevice.address(), pSurfaceInfo.address(), pSurfaceFormatCount, memAddressSafe(pSurfaceFormats));
    }

}