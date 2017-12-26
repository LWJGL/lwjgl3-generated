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
 * An application may wish to reference device memory in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension enables an application to export POSIX file descriptor handles from Vulkan memory objects and to import Vulkan memory objects from POSIX file descriptor handles exported from other Vulkan memory objects or from similar resources in other APIs.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_external_memory_fd}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>75</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VK_KHR_external_memory">VK_KHR_external_memory</a></li>
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
 * </ul></dd>
 * </dl>
 */
public class KHRExternalMemoryFd {

    /** The extension specification version. */
    public static final int VK_KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME = "VK_KHR_external_memory_fd";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR = 1000074000,
        VK_STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR  = 1000074001,
        VK_STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR    = 1000074002;

    protected KHRExternalMemoryFd() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesDevice caps) {
        return checkFunctions(
            caps.vkGetMemoryFdKHR, caps.vkGetMemoryFdPropertiesKHR
        );
    }

    // --- [ vkGetMemoryFdKHR ] ---

    /** Unsafe version of: {@link #vkGetMemoryFdKHR GetMemoryFdKHR} */
    public static int nvkGetMemoryFdKHR(VkDevice device, long pGetFdInfo, long pFd) {
        long __functionAddress = device.getCapabilities().vkGetMemoryFdKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, device.address(), pGetFdInfo, pFd);
    }

    /**
     * Get a POSIX file descriptor for a memory object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To export a POSIX file descriptor representing the underlying resources of a Vulkan device memory object, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetMemoryFdKHR(
     *     VkDevice                                    device,
     *     const VkMemoryGetFdInfoKHR*                 pGetFdInfo,
     *     int*                                        pFd);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>Each call to {@link #vkGetMemoryFdKHR GetMemoryFdKHR} <b>must</b> create a new file descriptor and transfer ownership of it to the application. To avoid leaking resources, the application <b>must</b> release ownership of the file descriptor using the {@code close} system call when it is no longer needed, or by importing a Vulkan memory object from it. Where supported by the operating system, the implementation <b>must</b> set the file descriptor to be closed automatically when an {@code execve} system call is made.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pGetFdInfo} <b>must</b> be a valid pointer to a valid {@link VkMemoryGetFdInfoKHR} structure</li>
     * <li>{@code pFd} <b>must</b> be a valid pointer to a {@code int} value</li>
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
     * <p>{@link VkMemoryGetFdInfoKHR}</p>
     *
     * @param device     the logical device that created the device memory being exported.
     * @param pGetFdInfo a pointer to an instance of the {@link VkMemoryGetFdInfoKHR} structure containing parameters of the export operation.
     * @param pFd        will return a file descriptor representing the underlying resources of the device memory object.
     */
    @NativeType("VkResult")
    public static int vkGetMemoryFdKHR(VkDevice device, @NativeType("const VkMemoryGetFdInfoKHR *") VkMemoryGetFdInfoKHR pGetFdInfo, @NativeType("int *") IntBuffer pFd) {
        if (CHECKS) {
            check(pFd, 1);
        }
        return nvkGetMemoryFdKHR(device, pGetFdInfo.address(), memAddress(pFd));
    }

    // --- [ vkGetMemoryFdPropertiesKHR ] ---

    /** Unsafe version of: {@link #vkGetMemoryFdPropertiesKHR GetMemoryFdPropertiesKHR} */
    public static int nvkGetMemoryFdPropertiesKHR(VkDevice device, int handleType, int fd, long pMemoryFdProperties) {
        long __functionAddress = device.getCapabilities().vkGetMemoryFdPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, device.address(), handleType, fd, pMemoryFdProperties);
    }

    /**
     * Get Properties of External Memory File Descriptors.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>POSIX file descriptor memory handles compatible with Vulkan <b>may</b> also be created by non-Vulkan APIs using methods beyond the scope of this specification. To determine the correct parameters to use when importing such handles, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetMemoryFdPropertiesKHR(
     *     VkDevice                                    device,
     *     VkExternalMemoryHandleTypeFlagBitsKHR       handleType,
     *     int                                         fd,
     *     VkMemoryFdPropertiesKHR*                    pMemoryFdProperties);</pre></code>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code fd} <b>must</b> be an external memory handle created outside of the Vulkan API.</li>
     * <li>{@code handleType} <b>must</b> not be {@link KHRExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR}.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHR} value</li>
     * <li>{@code pMemoryFdProperties} <b>must</b> be a valid pointer to a {@link VkMemoryFdPropertiesKHR} structure</li>
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
     * <li>{@link KHRExternalMemory#VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR ERROR_INVALID_EXTERNAL_HANDLE_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMemoryFdPropertiesKHR}</p>
     *
     * @param device              the logical device that will be importing {@code fd}.
     * @param handleType          the type of the handle {@code fd}.
     * @param fd                  the handle which will be imported.
     * @param pMemoryFdProperties will return properties of the handle {@code fd}.
     */
    @NativeType("VkResult")
    public static int vkGetMemoryFdPropertiesKHR(VkDevice device, @NativeType("VkExternalMemoryHandleTypeFlagBitsKHR") int handleType, int fd, @NativeType("VkMemoryFdPropertiesKHR *") VkMemoryFdPropertiesKHR pMemoryFdProperties) {
        return nvkGetMemoryFdPropertiesKHR(device, handleType, fd, pMemoryFdProperties.address());
    }

    /** Array version of: {@link #vkGetMemoryFdKHR GetMemoryFdKHR} */
    @NativeType("VkResult")
    public static int vkGetMemoryFdKHR(VkDevice device, @NativeType("const VkMemoryGetFdInfoKHR *") VkMemoryGetFdInfoKHR pGetFdInfo, @NativeType("int *") int[] pFd) {
        long __functionAddress = device.getCapabilities().vkGetMemoryFdKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pFd, 1);
        }
        return callPPPI(__functionAddress, device.address(), pGetFdInfo.address(), pFd);
    }

}