/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_KHX_external_semaphore_capabilities</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>77</dd>
 * <dt><b>Status</b></dt>
 * <dd>Draft</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-10-20</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>Requires VK_KHR_get_physical_device_properties2.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jesse Hall, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd>James Jones (jajones 'at' nvidia.com)</dd>
 * </dl>
 * 
 * <p>An application may wish to reference device semaphores in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension provides a set of capability queries and handle definitions that allow an application to determine what types of "{@code external}" semaphore handles an implementation supports for a given set of use cases.</p>
 */
public class KHXExternalSemaphoreCapabilities {

    /** The extension specification version. */
    public static final int VK_KHX_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHX_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME = "VK_KHX_external_semaphore_capabilities";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHX STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHX STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHX}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHX = 1000076000,
        VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHX           = 1000076001;

    /** VK_LUID_SIZE_KHX */
    public static final int VK_LUID_SIZE_KHX = 8;

    /**
     * VkExternalSemaphoreHandleTypeFlagBitsKHX - Bitmask of valid external semaphore handle types
     * 
     * <h5>Description</h5>
     * 
     * <p>For more information, see:</p>
     * 
     * <ul>
     * <li>The reference page for {@link VkPhysicalDeviceExternalSemaphoreInfoKHX}, where this interface is defined.</li>
     * <li>The See Also section for other reference pages using this type.</li>
     * <li>The Vulkan Specification.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalSemaphoreHandleTypeFlagsKHX}, {@link VkImportSemaphoreFdInfoKHX}, {@link VkPhysicalDeviceExternalSemaphoreInfoKHX}, {@link KHXExternalSemaphoreFd#vkGetSemaphoreFdKHX GetSemaphoreFdKHX}, {@link KHXExternalSemaphoreWin32#vkGetSemaphoreWin32HandleKHX GetSemaphoreWin32HandleKHX}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHX EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHX}</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX}</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX}</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHX EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHX}</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_FENCE_FD_BIT_KHX EXTERNAL_SEMAPHORE_HANDLE_TYPE_FENCE_FD_BIT_KHX}</li>
     * </ul>
     */
    public static final int
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHX        = 0x1,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX     = 0x2,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX = 0x4,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHX      = 0x8,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_FENCE_FD_BIT_KHX         = 0x10;

    /**
     * VkExternalSemaphoreFeatureFlagBitsKHX - Bitfield describing features of an external semaphore handle type
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
     * <p>{@code VkExternalSemaphoreFeatureFlagsKHX}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHX EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHX}</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHX EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHX}</li>
     * </ul>
     */
    public static final int
        VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHX = 0x1,
        VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHX = 0x2;

    protected KHXExternalSemaphoreCapabilities() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesInstance caps) {
        return checkFunctions(
            caps.vkGetPhysicalDeviceExternalSemaphorePropertiesKHX
        );
    }

    // --- [ vkGetPhysicalDeviceExternalSemaphorePropertiesKHX ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceExternalSemaphorePropertiesKHX GetPhysicalDeviceExternalSemaphorePropertiesKHX} */
    public static void nvkGetPhysicalDeviceExternalSemaphorePropertiesKHX(VkPhysicalDevice physicalDevice, long pExternalSemaphoreInfo, long pExternalSemaphoreProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalSemaphorePropertiesKHX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, physicalDevice.address(), pExternalSemaphoreInfo, pExternalSemaphoreProperties);
    }

    /**
     * Function for querying external semaphore handle capabilities.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Semaphores <b>may</b> support import and export of external semaphore handles. To query the external handle types supported by semaphores, call:</p>
     * 
     * <pre><code>void vkGetPhysicalDeviceExternalSemaphorePropertiesKHX(
    VkPhysicalDevice                            physicalDevice,
    const VkPhysicalDeviceExternalSemaphoreInfoKHX* pExternalSemaphoreInfo,
    VkExternalSemaphorePropertiesKHX*           pExternalSemaphoreProperties);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pExternalSemaphoreInfo} <b>must</b> be a pointer to a valid {@link VkPhysicalDeviceExternalSemaphoreInfoKHX} structure</li>
     * <li>{@code pExternalSemaphoreProperties} <b>must</b> be a pointer to a {@link VkExternalSemaphorePropertiesKHX} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExternalSemaphorePropertiesKHX}, {@link VkPhysicalDeviceExternalSemaphoreInfoKHX}</p>
     *
     * @param physicalDevice               the physical device from which to query the semaphore capabilities.
     * @param pExternalSemaphoreInfo       points to an instance of the {@link VkPhysicalDeviceExternalSemaphoreInfoKHX} structure, describing the parameters that would be consumed by {@link VK10#vkCreateSemaphore CreateSemaphore}.
     * @param pExternalSemaphoreProperties points to an instance of the {@link VkExternalSemaphorePropertiesKHX} structure in which capabilities are returned.
     */
    public static void vkGetPhysicalDeviceExternalSemaphorePropertiesKHX(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfoKHX pExternalSemaphoreInfo, VkExternalSemaphorePropertiesKHX pExternalSemaphoreProperties) {
        nvkGetPhysicalDeviceExternalSemaphorePropertiesKHX(physicalDevice, pExternalSemaphoreInfo.address(), pExternalSemaphoreProperties.address());
    }

}