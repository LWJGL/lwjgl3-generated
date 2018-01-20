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
 * An application may wish to reference device semaphores in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension provides a set of capability queries and handle definitions that allow an application to determine what types of "{@code external}" semaphore handles an implementation supports for a given set of use cases.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_external_semaphore_capabilities}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>77</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones @cubanismo</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-10-20</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jesse Hall, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class KHRExternalSemaphoreCapabilities {

    /** The extension specification version. */
    public static final int VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_semaphore_capabilities";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHR STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHR = 1000076000,
        VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHR           = 1000076001;

    /** VK_LUID_SIZE_KHR */
    public static final int VK_LUID_SIZE_KHR = 8;

    /**
     * VkExternalSemaphoreHandleTypeFlagBitsKHR - Bitmask of valid external semaphore handle types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR} specifies a POSIX file descriptor handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the POSIX system calls {@code dup}, {@code dup2}, {@code close}, and the non-standard system call {@code dup3}. Additionally, it <b>must</b> be transportable over a socket using an {@code SCM_RIGHTS} control message. It owns a reference to the underlying synchronization primitive represented by its Vulkan semaphore object.</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR} specifies an NT handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the functions {@code DuplicateHandle}, {@code CloseHandle}, {@code CompareObjectHandles}, {@code GetHandleInformation}, and {@code SetHandleInformation}. It owns a reference to the underlying synchronization primitive represented by its Vulkan semaphore object.</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR} specifies a global share handle that has only limited valid usage outside of Vulkan and other compatible APIs. It is not compatible with any native APIs. It does not own a reference to the underlying synchronization primitive represented its Vulkan semaphore object, and will therefore become invalid when all Vulkan semaphore objects associated with it are destroyed.</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR} specifies an NT handle returned by {@code ID3D12Device}::{@code CreateSharedHandle} referring to a Direct3D 12 fence. It owns a reference to the underlying synchronization primitive associated with the Direct3D fence.</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR} specifies a POSIX file descriptor handle to a Linux Sync File or Android Fence object. It can be used with any native API accepting a valid sync file or fence as input. It owns a reference to the underlying synchronization primitive associated with the file descriptor. Implementations which support importing this handle type <b>must</b> accept any type of sync or fence FD supported by the native system they are running on.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Handles of type {@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR} generated by the implementation may represent either Linux Sync Files or Android Fences at the implementation's discretion. Applications <b>should</b> only use operations defined for both types of file descriptors, unless they know via means external to Vulkan the type of the file descriptor, or are prepared to deal with the system-defined operation failures resulting from using the wrong type.</p>
     * </div>
     * 
     * <p>Some external semaphore handle types can only be shared within the same underlying physical device and/or the same driver version, as defined in the following table:</p>
     * 
     * <h6>External semaphore handle types compatibility</h6>
     * 
     * <table class="lwjgl">
     * <tbody>
     * <tr><td>Handle type</td><td>{@link VkPhysicalDeviceIDPropertiesKHR}{@code ::driverUUID}</td><td>{@link VkPhysicalDeviceIDPropertiesKHR}{@code ::deviceUUID}</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR}</td><td>No restriction</td><td>No restriction</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalSemaphoreHandleTypeFlagsKHR}, {@link VkImportSemaphoreFdInfoKHR}, {@link VkImportSemaphoreWin32HandleInfoKHR}, {@link VkPhysicalDeviceExternalSemaphoreInfoKHR}, {@link VkSemaphoreGetFdInfoKHR}, {@link VkSemaphoreGetWin32HandleInfoKHR}</p>
     */
    public static final int
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR        = 0x1,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR     = 0x2,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = 0x4,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR      = 0x8,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR          = 0x10;

    /**
     * VkExternalSemaphoreFeatureFlagBitsKHR - Bitfield describing features of an external semaphore handle type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR} specifies that handles of this type <b>can</b> be exported from Vulkan semaphore objects.</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR} specifies that handles of this type <b>can</b> be imported as Vulkan semaphore objects.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalSemaphoreFeatureFlagsKHR}</p>
     */
    public static final int
        VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR = 0x1,
        VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR = 0x2;

    protected KHRExternalSemaphoreCapabilities() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesInstance caps) {
        return checkFunctions(
            caps.vkGetPhysicalDeviceExternalSemaphorePropertiesKHR
        );
    }

    // --- [ vkGetPhysicalDeviceExternalSemaphorePropertiesKHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceExternalSemaphorePropertiesKHR GetPhysicalDeviceExternalSemaphorePropertiesKHR} */
    public static void nvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkPhysicalDevice physicalDevice, long pExternalSemaphoreInfo, long pExternalSemaphoreProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalSemaphorePropertiesKHR;
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
     * <p>Semaphores <b>may</b> support import and export of their <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-semaphores-payloads">payload</a> to external handles. To query the external handle types supported by semaphores, call:</p>
     * 
     * <code><pre>
     * void vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceExternalSemaphoreInfoKHR* pExternalSemaphoreInfo,
     *     VkExternalSemaphorePropertiesKHR*           pExternalSemaphoreProperties);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pExternalSemaphoreInfo} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceExternalSemaphoreInfoKHR} structure</li>
     * <li>{@code pExternalSemaphoreProperties} <b>must</b> be a valid pointer to a {@link VkExternalSemaphorePropertiesKHR} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExternalSemaphorePropertiesKHR}, {@link VkPhysicalDeviceExternalSemaphoreInfoKHR}</p>
     *
     * @param physicalDevice               the physical device from which to query the semaphore capabilities.
     * @param pExternalSemaphoreInfo       points to an instance of the {@link VkPhysicalDeviceExternalSemaphoreInfoKHR} structure, describing the parameters that would be consumed by {@link VK10#vkCreateSemaphore CreateSemaphore}.
     * @param pExternalSemaphoreProperties points to an instance of the {@link VkExternalSemaphorePropertiesKHR} structure in which capabilities are returned.
     */
    public static void vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("const VkPhysicalDeviceExternalSemaphoreInfoKHR *") VkPhysicalDeviceExternalSemaphoreInfoKHR pExternalSemaphoreInfo, @NativeType("VkExternalSemaphorePropertiesKHR *") VkExternalSemaphorePropertiesKHR pExternalSemaphoreProperties) {
        nvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(physicalDevice, pExternalSemaphoreInfo.address(), pExternalSemaphoreProperties.address());
    }

}