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
     * VkExternalFenceHandleTypeFlagBitsKHR - Bitmask of valid external fence handle types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR} indicates a POSIX file descriptor handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the POSIX system calls {@code dup}, {@code dup2}, {@code close}, and the non-standard system call {@code dup3}. Additionally, it <b>must</b> be transportable over a socket using an {@code SCM_RIGHTS} control message. It owns a reference to the underlying synchronization primitive represented by its Vulkan fence object.</li>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR} indicates an NT handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the functions {@code DuplicateHandle}, {@code CloseHandle}, {@code CompareObjectHandles}, {@code GetHandleInformation}, and {@code SetHandleInformation}. It owns a reference to the underlying synchronization primitive represented by its Vulkan fence object.</li>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR} indicates a global share handle that has only limited valid usage outside of Vulkan and other compatible APIs. It is not compatible with any native APIs. It does not own a reference to the underlying synchronization primitive represented by its Vulkan fence object, and will therefore become invalid when all Vulkan fence objects associated with it are destroyed.</li>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR} indicates a POSIX file descriptor handle to a Linux Sync File or Android Fence. It can be used with any native API accepting a valid sync file or fence as input. It owns a reference to the underlying synchronization primitive associated with the file descriptor. Implementations which support importing this handle type <b>must</b> accept any type of sync or fence FD supported by the native system they are running on.</li>
     * </ul>
     * 
     * <p>Some external fence handle types can only be shared within the same underlying physical device and/or the same driver version, as defined in the following table:</p>
     * 
     * <h6>External fence handle types compatibility</h6>
     * 
     * <table class="lwjgl">
     * <tbody>
     * <tr><td>Handle type</td><td>{@link VkPhysicalDeviceIDPropertiesKHR}{@code ::driverUUID}</td><td>{@link VkPhysicalDeviceIDPropertiesKHR}{@code ::deviceUUID}</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR}</td><td>No restriction</td><td>No restriction</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalFenceHandleTypeFlagsKHR}, {@link VkFenceGetFdInfoKHR}, {@link VkFenceGetWin32HandleInfoKHR}, {@link VkImportFenceFdInfoKHR}, {@link VkImportFenceWin32HandleInfoKHR}, {@link VkPhysicalDeviceExternalFenceInfoKHR}</p>
     */
    public static final int
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR        = 0x1,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR     = 0x2,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = 0x4,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR          = 0x8;

    /**
     * VkExternalFenceFeatureFlagBitsKHR - Bitfield describing features of an external fence handle type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR} indicates handles of this type <b>can</b> be exported from Vulkan fence objects.</li>
     * <li>{@link #VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR} indicates handles of this type <b>can</b> be imported to Vulkan fence objects.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalFenceFeatureFlagsKHR}</p>
     */
    public static final int
        VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR = 0x1,
        VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR = 0x2;

    protected KHRExternalFenceCapabilities() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesInstance caps) {
        return checkFunctions(
            caps.vkGetPhysicalDeviceExternalFencePropertiesKHR
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
     * Function for querying external fence handle capabilities.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Fences <b>may</b> support import and export of their <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-fences-payloads">payload</a> to external handles. To query the external handle types supported by fences, call:</p>
     * 
     * <code><pre>
     * void vkGetPhysicalDeviceExternalFencePropertiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceExternalFenceInfoKHR* pExternalFenceInfo,
     *     VkExternalFencePropertiesKHR*               pExternalFenceProperties);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pExternalFenceInfo} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceExternalFenceInfoKHR} structure</li>
     * <li>{@code pExternalFenceProperties} <b>must</b> be a valid pointer to a {@link VkExternalFencePropertiesKHR} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExternalFencePropertiesKHR}, {@link VkPhysicalDeviceExternalFenceInfoKHR}</p>
     *
     * @param physicalDevice           the physical device from which to query the fence capabilities.
     * @param pExternalFenceInfo       points to an instance of the {@link VkPhysicalDeviceExternalFenceInfoKHR} structure, describing the parameters that would be consumed by {@link VK10#vkCreateFence CreateFence}.
     * @param pExternalFenceProperties points to an instance of the {@link VkExternalFencePropertiesKHR} structure in which capabilities are returned.
     */
    public static void vkGetPhysicalDeviceExternalFencePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("const VkPhysicalDeviceExternalFenceInfoKHR *") VkPhysicalDeviceExternalFenceInfoKHR pExternalFenceInfo, @NativeType("VkExternalFencePropertiesKHR *") VkExternalFencePropertiesKHR pExternalFenceProperties) {
        nvkGetPhysicalDeviceExternalFencePropertiesKHR(physicalDevice, pExternalFenceInfo.address(), pExternalFenceProperties.address());
    }

}