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
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_KHX_external_semaphore_fd</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>80</dd>
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
 * <li>Jesse Hall, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>Carsten Rohde, NVIDIA</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd>James Jones (jajones 'at' nvidia.com)</dd>
 * </dl>
 * 
 * <p>An application using external memory may wish to synchronize access to that memory using semaphores. This extension enables an application to export semaphore state to and import semaphore state from POSIX file descriptors.</p>
 */
public class KHXExternalSemaphoreFd {

	/** The extension specification version. */
	public static final int VK_KHX_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_KHX_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME = "VK_KHX_external_semaphore_fd";

	/** Extends {@code VkStructureType}. */
	public static final int VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHX = 1000079000;

	protected KHXExternalSemaphoreFd() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilitiesDevice caps) {
		return checkFunctions(
			caps.vkImportSemaphoreFdKHX, caps.vkGetSemaphoreFdKHX
		);
	}

	// --- [ vkImportSemaphoreFdKHX ] ---

	/** Unsafe version of: {@link #vkImportSemaphoreFdKHX ImportSemaphoreFdKHX} */
	public static int nvkImportSemaphoreFdKHX(VkDevice device, long pImportSemaphoreFdInfo) {
		long __functionAddress = device.getCapabilities().vkImportSemaphoreFdKHX;
		if ( CHECKS )
			check(__functionAddress);
		return callPPI(__functionAddress, device.address(), pImportSemaphoreFdInfo);
	}

	/**
	 * Import a semaphore from a POSIX file descriptor.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To import semaphore state from a POSIX file descriptor, call:</p>
	 * 
	 * <pre><code>VkResult vkImportSemaphoreFdKHX(
    VkDevice                                    device,
    const VkImportSemaphoreFdInfoKHX*           pImportSemaphoreFdInfo);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Importing semaphore state from a file descriptor transfers ownership of the file descriptor from the application to the Vulkan implementation. The application <b>must</b> not perform any operations on the file descriptor after a successful import.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code semaphore} <b>must</b> not be associated with any queue command that has not yet completed execution on that queue</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pImportSemaphoreFdInfo} <b>must</b> be a pointer to a valid {@link VkImportSemaphoreFdInfoKHX} structure</li>
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
	 * <p>{@link VkImportSemaphoreFdInfoKHX}</p>
	 *
	 * @param device                 the logical device that created the semaphore.
	 * @param pImportSemaphoreFdInfo points to a {@link VkImportSemaphoreFdInfoKHX} structure specifying the semaphore and import parameters.
	 */
	public static int vkImportSemaphoreFdKHX(VkDevice device, VkImportSemaphoreFdInfoKHX pImportSemaphoreFdInfo) {
		return nvkImportSemaphoreFdKHX(device, pImportSemaphoreFdInfo.address());
	}

	// --- [ vkGetSemaphoreFdKHX ] ---

	/** Unsafe version of: {@link #vkGetSemaphoreFdKHX GetSemaphoreFdKHX} */
	public static int nvkGetSemaphoreFdKHX(VkDevice device, long semaphore, int handleType, long pFd) {
		long __functionAddress = device.getCapabilities().vkGetSemaphoreFdKHX;
		if ( CHECKS )
			check(__functionAddress);
		return callPJPI(__functionAddress, device.address(), semaphore, handleType, pFd);
	}

	/**
	 * Get a POSIX file descriptor handle for a semaphore.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To export a POSIX file descriptor representing the state of a semaphore, call:</p>
	 * 
	 * <pre><code>VkResult vkGetSemaphoreFdKHX(
    VkDevice                                    device,
    VkSemaphore                                 semaphore,
    VkExternalSemaphoreHandleTypeFlagBitsKHX    handleType,
    int*                                        pFd);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The properties of the file descriptor returned depend on the value of {@code handleType}. See {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} for a description of the properties of the defined external semaphore handle types.</p>
	 * 
	 * <p>Each call to {@link #vkGetSemaphoreFdKHX GetSemaphoreFdKHX} <b>must</b> create a new file descriptor and transfer ownership of it to the application. To avoid leaking resources, the application <b>must</b> release ownership of the file descriptor using the fname:close system call when it is no longer needed, or by importing Vulkan semaphore state from it.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code handleType} <b>must</b> have been included in {@link VkExportSemaphoreCreateInfoKHX}{@code ::handleTypes} when {@code semaphore}&#8217;s current state was created.</li>
	 * <li>{@code semaphore} <b>must</b> not currently have its state replaced by imported semaphore state as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-semaphores-importing">Importing Semaphore State</a> unless that imported semaphore state&#8217;s handle type was included in {@link VkExternalSemaphorePropertiesKHX}{@code ::exportFromImportedHandleTypes}.</li>
	 * <li>If {@code handleType} refers to a handle type with temporary import semantics, as defined below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-semaphores-importing">Importing Semaphore State</a>, there <b>must</b> be no queue waiting on {@code semaphore}.</li>
	 * <li>If {@code handleType} refers to a handle type with temporary import semantics, {@code semaphore} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-semaphores-signaling">semaphore signal operation</a> pending execution.</li>
	 * <li>{@code handleType} <b>must</b> be defined as a POSIX file descriptor handle.</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
	 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} value</li>
	 * <li>{@code pFd} <b>must</b> be a pointer to a {@code int} value</li>
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
	 * @param pFd        will return the file descriptor representing the semaphore state.
	 */
	public static int vkGetSemaphoreFdKHX(VkDevice device, long semaphore, int handleType, IntBuffer pFd) {
		if ( CHECKS )
			check(pFd, 1);
		return nvkGetSemaphoreFdKHX(device, semaphore, handleType, memAddress(pFd));
	}

	/** Array version of: {@link #vkGetSemaphoreFdKHX GetSemaphoreFdKHX} */
	public static int vkGetSemaphoreFdKHX(VkDevice device, long semaphore, int handleType, int[] pFd) {
		long __functionAddress = device.getCapabilities().vkGetSemaphoreFdKHX;
		if ( CHECKS ) {
			check(__functionAddress);
			check(pFd, 1);
		}
		return callPJPI(__functionAddress, device.address(), semaphore, handleType, pFd);
	}

}