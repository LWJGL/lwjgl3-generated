/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * An application may wish to reference device memory in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension enables an application to export Windows handles from Vulkan memory objects and to import Vulkan memory objects from Windows handles exported from other Vulkan memory objects or from similar resources in other APIs.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_KHX_external_memory_win32</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>74</dd>
 * <dt><b>Status</b></dt>
 * <dd>Draft</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-10-21</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>Requires VK_KHR_external_memory.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>Carsten Rohde, NVIDIA</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd>James Jones (jajones 'at' nvidia.com)</dd>
 * </dl>
 */
public class KHXExternalMemoryWin32 {

    /** The extension specification version. */
    public static final int VK_KHX_EXTERNAL_MEMORY_WIN32_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHX_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME = "VK_KHX_external_memory_win32";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHX STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHX STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHX STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHX}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHX = 1000073000,
        VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHX = 1000073001,
        VK_STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHX  = 1000073002;

    protected KHXExternalMemoryWin32() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesDevice caps) {
        return checkFunctions(
            caps.vkGetMemoryWin32HandleKHX, caps.vkGetMemoryWin32HandlePropertiesKHX
        );
    }

    // --- [ vkGetMemoryWin32HandleKHX ] ---

    /** Unsafe version of: {@link #vkGetMemoryWin32HandleKHX GetMemoryWin32HandleKHX} */
    public static int nvkGetMemoryWin32HandleKHX(VkDevice device, long memory, int handleType, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetMemoryWin32HandleKHX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(__functionAddress, device.address(), memory, handleType, pHandle);
    }

    /**
     * Get a Windows HANDLE for a memory object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To export a Windows handle representing the underlying resources of a Vulkan device memory object, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetMemoryWin32HandleKHX(
     *     VkDevice                                    device,
     *     VkDeviceMemory                              memory,
     *     VkExternalMemoryHandleTypeFlagBitsKHX       handleType,
     *     HANDLE*                                     pHandle);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>The properties of the handle returned depend on the value of {@code handleType}. See {@code VkExternalMemoryHandleTypeFlagBitsKHX} for a description of the properties of the defined external memory handle types.</p>
     * 
     * <p>For handle types defined as NT handles, the handles returned by {@link #vkGetMemoryWin32HandleKHX GetMemoryWin32HandleKHX} are owned by the application. To avoid leaking resources, the application <b>must</b> release ownership of them using the fname:CloseHandle system call when they are no longer needed.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code handleType} <b>must</b> have been included in {@link VkExportMemoryAllocateInfoKHX}{@code ::handleTypes} when {@code memory} was created.</li>
     * <li>If {@code handleType} is defined as an NT handle, {@link #vkGetMemoryWin32HandleKHX GetMemoryWin32HandleKHX} <b>must</b> be called no more than once for each valid unique combination of {@code memory} and {@code handleType}.</li>
     * <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
     * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHX} value</li>
     * <li>{@code pHandle} <b>must</b> be a pointer to a {@code HANDLE} value</li>
     * <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <li>{@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device     the logical device that created {@code memory}.
     * @param memory     the memory object from which the handle will be exported.
     * @param handleType the type of handle requested.
     * @param pHandle    will return the Windows handle representing the underlying resources of the device memory object.
     */
    public static int vkGetMemoryWin32HandleKHX(VkDevice device, long memory, int handleType, PointerBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return nvkGetMemoryWin32HandleKHX(device, memory, handleType, memAddress(pHandle));
    }

    // --- [ vkGetMemoryWin32HandlePropertiesKHX ] ---

    /** Unsafe version of: {@link #vkGetMemoryWin32HandlePropertiesKHX GetMemoryWin32HandlePropertiesKHX} */
    public static int nvkGetMemoryWin32HandlePropertiesKHX(VkDevice device, int handleType, long handle, long pMemoryWin32HandleProperties) {
        long __functionAddress = device.getCapabilities().vkGetMemoryWin32HandlePropertiesKHX;
        if (CHECKS) {
            check(__functionAddress);
            check(handle);
        }
        return callPPPI(__functionAddress, device.address(), handleType, handle, pMemoryWin32HandleProperties);
    }

    /**
     * Get Properties of External Memory Win32 Handles.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Windows memory handles compatible with Vulkan <b>may</b> also be created by non-Vulkan APIs using methods beyond the scope of this specification. To determine the correct parameters to use when importing such handles, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetMemoryWin32HandlePropertiesKHX(
     *     VkDevice                                    device,
     *     VkExternalMemoryHandleTypeFlagBitsKHX       handleType,
     *     HANDLE                                      handle,
     *     VkMemoryWin32HandlePropertiesKHX*           pMemoryWin32HandleProperties);</pre></code>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code handle} <b>must</b> be an external memory handle created outside of the Vulkan API.</li>
     * <li>{@code handleType} <b>must</b> not be one of the handle types defined as opaque.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHX} value</li>
     * <li>{@code pMemoryWin32HandleProperties} <b>must</b> be a pointer to a {@link VkMemoryWin32HandlePropertiesKHX} structure</li>
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
     * <li>{@link KHXExternalMemory#VK_ERROR_INVALID_EXTERNAL_HANDLE_KHX ERROR_INVALID_EXTERNAL_HANDLE_KHX}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMemoryWin32HandlePropertiesKHX}</p>
     *
     * @param device                       the logical device that will be importing {@code handle}.
     * @param handleType                   the type of the handle {@code handle}.
     * @param handle                       the handle which will be imported.
     * @param pMemoryWin32HandleProperties will return properties of {@code handle}.
     */
    public static int vkGetMemoryWin32HandlePropertiesKHX(VkDevice device, int handleType, long handle, VkMemoryWin32HandlePropertiesKHX pMemoryWin32HandleProperties) {
        return nvkGetMemoryWin32HandlePropertiesKHX(device, handleType, handle, pMemoryWin32HandleProperties.address());
    }

}