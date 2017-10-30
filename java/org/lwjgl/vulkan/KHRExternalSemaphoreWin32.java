/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * An application using external memory may wish to synchronize access to that memory using semaphores. This extension enables an application to export semaphore payload to and import semaphore payload from Windows handles.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_external_semaphore_win32}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>79</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VK_KHR_external_semaphore">{@code VK_KHR_external_semaphore}</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones @cubanismo</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-10-21</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>Carsten Rohde, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class KHRExternalSemaphoreWin32 {

    /** The extension specification version. */
    public static final int VK_KHR_EXTERNAL_SEMAPHORE_WIN32_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME = "VK_KHR_external_semaphore_win32";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = 1000078000,
        VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = 1000078001,
        VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR            = 1000078002,
        VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR    = 1000078003;

    protected KHRExternalSemaphoreWin32() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesDevice caps) {
        return checkFunctions(
            caps.vkImportSemaphoreWin32HandleKHR, caps.vkGetSemaphoreWin32HandleKHR
        );
    }

    // --- [ vkImportSemaphoreWin32HandleKHR ] ---

    /** Unsafe version of: {@link #vkImportSemaphoreWin32HandleKHR ImportSemaphoreWin32HandleKHR} */
    public static int nvkImportSemaphoreWin32HandleKHR(VkDevice device, long pImportSemaphoreWin32HandleInfo) {
        long __functionAddress = device.getCapabilities().vkImportSemaphoreWin32HandleKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkImportSemaphoreWin32HandleInfoKHR.validate(pImportSemaphoreWin32HandleInfo);
        }
        return callPPI(__functionAddress, device.address(), pImportSemaphoreWin32HandleInfo);
    }

    /**
     * Import a semaphore from a Windows HANDLE.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To import a semaphore payload from a Windows handle, call:</p>
     * 
     * <code><pre>
     * VkResult vkImportSemaphoreWin32HandleKHR(
     *     VkDevice                                    device,
     *     const VkImportSemaphoreWin32HandleInfoKHR*  pImportSemaphoreWin32HandleInfo);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>Importing a semaphore payload from Windows handles does not transfer ownership of the handle to the Vulkan implementation. For handle types defined as NT handles, the application <b>must</b> release ownership using the fname:CloseHandle system call when the handle is no longer needed.</p>
     * 
     * <p>Applications <b>can</b> import the same semaphore payload into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pImportSemaphoreWin32HandleInfo} <b>must</b> be a valid pointer to a valid {@link VkImportSemaphoreWin32HandleInfoKHR} structure</li>
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
     * <li>{@link KHRExternalMemory#VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR ERROR_INVALID_EXTERNAL_HANDLE_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkImportSemaphoreWin32HandleInfoKHR}</p>
     *
     * @param device                          the logical device that created the semaphore.
     * @param pImportSemaphoreWin32HandleInfo points to a {@link VkImportSemaphoreWin32HandleInfoKHR} structure specifying the semaphore and import parameters.
     */
    @NativeType("VkResult")
    public static int vkImportSemaphoreWin32HandleKHR(VkDevice device, @NativeType("const VkImportSemaphoreWin32HandleInfoKHR *") VkImportSemaphoreWin32HandleInfoKHR pImportSemaphoreWin32HandleInfo) {
        return nvkImportSemaphoreWin32HandleKHR(device, pImportSemaphoreWin32HandleInfo.address());
    }

    // --- [ vkGetSemaphoreWin32HandleKHR ] ---

    /** Unsafe version of: {@link #vkGetSemaphoreWin32HandleKHR GetSemaphoreWin32HandleKHR} */
    public static int nvkGetSemaphoreWin32HandleKHR(VkDevice device, long pGetWin32HandleInfo, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreWin32HandleKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, device.address(), pGetWin32HandleInfo, pHandle);
    }

    /**
     * Get a Windows HANDLE for a semaphore.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To export a Windows handle representing the payload of a semaphore, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetSemaphoreWin32HandleKHR(
     *     VkDevice                                    device,
     *     const VkSemaphoreGetWin32HandleInfoKHR*     pGetWin32HandleInfo,
     *     HANDLE*                                     pHandle);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>For handle types defined as NT handles, the handles returned by {@link #vkGetSemaphoreWin32HandleKHR GetSemaphoreWin32HandleKHR} are owned by the application. To avoid leaking resources, the application <b>must</b> release ownership of them using the fname:CloseHandle system call when they are no longer needed.</p>
     * 
     * <p>Exporting a Windows handle from a semaphore <b>may</b> have side effects depending on the transference of the specified handle type, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-semaphores-importing">Importing Semaphore Payloads</a>.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pGetWin32HandleInfo} <b>must</b> be a valid pointer to a valid {@link VkSemaphoreGetWin32HandleInfoKHR} structure</li>
     * <li>{@code pHandle} <b>must</b> be a valid pointer to a {@code HANDLE} value</li>
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
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSemaphoreGetWin32HandleInfoKHR}</p>
     *
     * @param device              the logical device that created the semaphore being exported.
     * @param pGetWin32HandleInfo a pointer to an instance of the {@link VkSemaphoreGetWin32HandleInfoKHR} structure containing parameters of the export operation.
     * @param pHandle             will return the Windows handle representing the semaphore state.
     */
    @NativeType("VkResult")
    public static int vkGetSemaphoreWin32HandleKHR(VkDevice device, @NativeType("const VkSemaphoreGetWin32HandleInfoKHR *") VkSemaphoreGetWin32HandleInfoKHR pGetWin32HandleInfo, @NativeType("HANDLE *") PointerBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return nvkGetSemaphoreWin32HandleKHR(device, pGetWin32HandleInfo.address(), memAddress(pHandle));
    }

}