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
 * An application may wish to reference device fences in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension provides a set of capability queries and handle definitions that allow an application to determine what types of "{@code external}" fence handles an implementation supports for a given set of use cases.
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_external_fence_capabilities}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>113</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jesse Hall @jessehall</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-05-08</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.1 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jesse Hall, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>Cass Everitt, Oculus</li>
 * <li>Contributors to {@link KHRExternalSemaphoreCapabilities VK_KHR_external_semaphore_capabilities}</li>
 * </ul></dd>
 * </dl>
 */
public class KHRExternalFenceCapabilities {

    /** The extension specification version. */
    public static final int VK_KHR_EXTERNAL_FENCE_CAPABILITIES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_fence_capabilities";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES_KHR STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR = 1000112000,
        VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES_KHR           = 1000112001;

    /** VK_LUID_SIZE_KHR */
    public static final int VK_LUID_SIZE_KHR = 8;

    /**
     * Extends {@code VkExternalFenceHandleTypeFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR}</li>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR}</li>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR}</li>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR        = 0x1,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR     = 0x2,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = 0x4,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR          = 0x8;

    /**
     * Extends {@code VkExternalFenceFeatureFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR}</li>
     * <li>{@link #VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR = 0x1,
        VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR = 0x2;

    protected KHRExternalFenceCapabilities() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsInstance(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_external_fence_capabilities") && VK.checkExtension("VK_KHR_external_fence_capabilities",
               VK.isSupported(provider, "vkGetPhysicalDeviceExternalFencePropertiesKHR", caps)
        );
    }

    // --- [ vkGetPhysicalDeviceExternalFencePropertiesKHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceExternalFencePropertiesKHR GetPhysicalDeviceExternalFencePropertiesKHR} */
    public static void nvkGetPhysicalDeviceExternalFencePropertiesKHR(VkPhysicalDevice physicalDevice, long pExternalFenceInfo, long pExternalFenceProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalFencePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, physicalDevice.address(), pExternalFenceInfo, pExternalFenceProperties);
    }

    /**
     * See {@link VK11#vkGetPhysicalDeviceExternalFenceProperties GetPhysicalDeviceExternalFenceProperties}.
     *
     * @param physicalDevice           the physical device from which to query the fence capabilities.
     * @param pExternalFenceInfo       points to an instance of the {@link VkPhysicalDeviceExternalFenceInfo} structure, describing the parameters that would be consumed by {@link VK10#vkCreateFence CreateFence}.
     * @param pExternalFenceProperties points to an instance of the {@link VkExternalFenceProperties} structure in which capabilities are returned.
     */
    public static void vkGetPhysicalDeviceExternalFencePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalFenceInfo const *") VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, @NativeType("VkExternalFenceProperties *") VkExternalFenceProperties pExternalFenceProperties) {
        nvkGetPhysicalDeviceExternalFencePropertiesKHR(physicalDevice, pExternalFenceInfo.address(), pExternalFenceProperties.address());
    }

}