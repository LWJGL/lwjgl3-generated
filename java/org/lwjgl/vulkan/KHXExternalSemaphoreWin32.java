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
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_KHX_external_semaphore_win32</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>79</dd>
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
 * <li>Requires VK_KHR_external_semaphore_capabilities.</li>
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
 * 
 * <p>An application using external memory may wish to synchronize access to that memory using semaphores. This extension enables an application to export semaphore state to and import semaphore state from Windows handles.</p>
 */
public class KHXExternalSemaphoreWin32 {

	/** The extension specification version. */
	public static final int VK_KHX_EXTERNAL_SEMAPHORE_WIN32_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_KHX_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME = "VK_KHX_external_semaphore_win32";

	/**
	 * Extends {@code VkStructureType}.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHX STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHX}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHX STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHX}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHX STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHX}</li>
	 * </ul>
	 */
	public static final int
		VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHX = 1000078000,
		VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHX = 1000078001,
		VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHX            = 1000078002;

	protected KHXExternalSemaphoreWin32() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilitiesDevice caps) {
		return checkFunctions(
			caps.vkImportSemaphoreWin32HandleKHX, caps.vkGetSemaphoreWin32HandleKHX
		);
	}

	// --- [ vkImportSemaphoreWin32HandleKHX ] ---

	/** Unsafe version of: {@link #vkImportSemaphoreWin32HandleKHX ImportSemaphoreWin32HandleKHX} */
	public static int nvkImportSemaphoreWin32HandleKHX(VkDevice device, long pImportSemaphoreWin32HandleInfo) {
		long __functionAddress = device.getCapabilities().vkImportSemaphoreWin32HandleKHX;
		if ( CHECKS ) {
			check(__functionAddress);
			VkImportSemaphoreWin32HandleInfoKHX.validate(pImportSemaphoreWin32HandleInfo);
		}
		return callPPI(__functionAddress, device.address(), pImportSemaphoreWin32HandleInfo);
	}

	/**
	 * Import a semaphore from a Windows HANDLE.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To import semaphore state from a Windows handle, call:</p>
	 * 
	 * <pre><code>VkResult vkImportSemaphoreWin32HandleKHX(
    VkDevice                                    device,
    const VkImportSemaphoreWin32HandleInfoKHX*  pImportSemaphoreWin32HandleInfo);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Importing semaphore state from Windows handles does not transfer ownership of the handle to the Vulkan implementation. For handle types defined as NT handles, the application <b>must</b> release ownership using the fname:CloseHandle system call when the handle is no longer needed.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pImportSemaphoreWin32HandleInfo} <b>must</b> be a pointer to a valid {@link VkImportSemaphoreWin32HandleInfoKHX} structure</li>
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
	 * <li>{@link KHXExternalMemory#VK_ERROR_INVALID_EXTERNAL_HANDLE_KHX ERROR_INVALID_EXTERNAL_HANDLE_KHX}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkImportSemaphoreWin32HandleInfoKHX}</p>
	 *
	 * @param device                          the logical device that created the semaphore.
	 * @param pImportSemaphoreWin32HandleInfo points to a {@link VkImportSemaphoreWin32HandleInfoKHX} structure specifying the semaphore and import parameters.
	 */
	public static int vkImportSemaphoreWin32HandleKHX(VkDevice device, VkImportSemaphoreWin32HandleInfoKHX pImportSemaphoreWin32HandleInfo) {
		return nvkImportSemaphoreWin32HandleKHX(device, pImportSemaphoreWin32HandleInfo.address());
	}

	// --- [ vkGetSemaphoreWin32HandleKHX ] ---

	/** Unsafe version of: {@link #vkGetSemaphoreWin32HandleKHX GetSemaphoreWin32HandleKHX} */
	public static int nvkGetSemaphoreWin32HandleKHX(VkDevice device, long semaphore, int handleType, long pHandle) {
		long __functionAddress = device.getCapabilities().vkGetSemaphoreWin32HandleKHX;
		if ( CHECKS )
			check(__functionAddress);
		return callPJPI(__functionAddress, device.address(), semaphore, handleType, pHandle);
	}

	/**
	 * Get a Windows HANDLE for a semaphore.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To export a Windows handle representing the state of a semaphore, call:</p>
	 * 
	 * <pre><code>VkResult vkGetSemaphoreWin32HandleKHX(
    VkDevice                                    device,
    VkSemaphore                                 semaphore,
    VkExternalSemaphoreHandleTypeFlagBitsKHX    handleType,
    HANDLE*                                     pHandle);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The properties of the handle returned depend on the value of {@code handleType}. See {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} for a description of the properties of the defined external semaphore handle types.</p>
	 * 
	 * <p>For handle types defined as NT handles, the handles returned by {@link #vkGetSemaphoreWin32HandleKHX GetSemaphoreWin32HandleKHX} are owned by the application. To avoid leaking resources, the application <b>must</b> release ownership of them using the fname:CloseHandle system call when they are no longer needed.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code handleType} <b>must</b> have been included in {@link VkExportSemaphoreCreateInfoKHX}{@code ::handleTypes} when {@code semaphore}&#8217;s current state was created.</li>
	 * <li>If {@code handleType} is defined as an NT handle, {@link #vkGetSemaphoreWin32HandleKHX GetSemaphoreWin32HandleKHX} <b>must</b> be called no more than once for each valid unique combination of {@code semaphore} and {@code handleType}.</li>
	 * <li>{@code semaphore} <b>must</b> not currently have its state replaced by imported semaphore state as described below in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-semaphores-importing">Importing Semaphore State</a> unless that imported semaphore state&#8217;s handle type was included in {@link VkExternalSemaphorePropertiesKHX}{@code ::exportFromImportedHandleTypes}.</li>
	 * <li>If {@code handleType} refers to a handle type with temporary import semantics, as defined below in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-semaphores-importing">Importing Semaphore State</a>, there <b>must</b> be no queue waiting on {@code semaphore}.</li>
	 * <li>If {@code handleType} refers to a handle type with temporary import semantics, {@code semaphore} must be signaled, or have an associated <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-semaphores-signaling">semaphore signal operation</a> pending execution.</li>
	 * <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle.</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
	 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} value</li>
	 * <li>{@code pHandle} <b>must</b> be a pointer to a {@code HANDLE} value</li>
	 * <li>{@code semaphore} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
	 * @param device     the logical device that created {@code semaphore}.
	 * @param semaphore  the semaphore from which state will be exported.
	 * @param handleType the type of handle requested.
	 * @param pHandle    will return the Windows handle representing the semaphore state.
	 */
	public static int vkGetSemaphoreWin32HandleKHX(VkDevice device, long semaphore, int handleType, PointerBuffer pHandle) {
		if ( CHECKS )
			check(pHandle, 1);
		return nvkGetSemaphoreWin32HandleKHX(device, semaphore, handleType, memAddress(pHandle));
	}

}