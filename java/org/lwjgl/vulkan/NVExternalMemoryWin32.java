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

/** Applications may wish to export memory to other Vulkan instances or other APIs, or import memory from other Vulkan instances or other APIs to enable Vulkan workloads to be split up across application module, process, or API boundaries. This extension enables win32 applications to export win32 handles from Vulkan memory objects such that the underlying resources can be referenced outside the Vulkan instance that created them, and import win32 handles created in the Direct3D API to Vulkan memory objects. */
public class NVExternalMemoryWin32 {

	/** The extension specification version. */
	public static final int VK_NV_EXTERNAL_MEMORY_WIN32_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_NV_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME = "VK_NV_external_memory_win32";

	/**
	 * Extends {@code VkStructureType}.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV}</li>
	 * </ul>
	 */
	public static final int
		VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV = 1000057000,
		VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV = 1000057001;

	protected NVExternalMemoryWin32() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilities caps) {
		return checkFunctions(
			caps.vkGetMemoryWin32HandleNV
		);
	}

	// --- [ vkGetMemoryWin32HandleNV ] ---

	/** Unsafe version of: {@link #vkGetMemoryWin32HandleNV GetMemoryWin32HandleNV} */
	public static int nvkGetMemoryWin32HandleNV(VkDevice device, long memory, int handleType, long pHandle) {
		long __functionAddress = device.getCapabilities().vkGetMemoryWin32HandleNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJPI(__functionAddress, device.address(), memory, handleType, pHandle);
	}

	/**
	 * retrieve Win32 handle to a device memory object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To retrieve the handle corresponding to a device memory object created with {@link VkExportMemoryAllocateInfoNV}{@code ::handleTypes} set to include {@link NVExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV} or {@link NVExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV}, call:</p>
	 * 
	 * <pre><code>VkResult vkGetMemoryWin32HandleNV(
    VkDevice                                    device,
    VkDeviceMemory                              memory,
    VkExternalMemoryHandleTypeFlagsNV           handleType,
    HANDLE*                                     pHandle);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code handleType} <b>must</b> be a flag specified in {@link VkExportMemoryAllocateInfoNV}{@code ::handleTypes} when allocating {@code memory}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code handleType} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
	 * <li>{@code handleType} <b>must</b> not be 0</li>
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
	 * @param device     the logical device that owns the memory.
	 * @param memory     the {@code VkDeviceMemory} object.
	 * @param handleType a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} containing a single bit specifying the type of handle requested.
	 * @param pHandle    
	 */
	public static int vkGetMemoryWin32HandleNV(VkDevice device, long memory, int handleType, PointerBuffer pHandle) {
		return nvkGetMemoryWin32HandleNV(device, memory, handleType, memAddress(pHandle));
	}

}