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
 * <dd>VK_KHX_external_memory_fd</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>75</dd>
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
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd>James Jones (jajones 'at' nvidia.com)</dd>
 * </dl>
 * 
 * <p>An application may wish to reference device memory in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension enables an application to export POSIX file descriptor handles from Vulkan memory objects and to import Vulkan memory objects from POSIX file descriptor handles exported from other Vulkan memory objects or from similar resources in other APIs.</p>
 */
public class KHXExternalMemoryFd {

	/** The extension specification version. */
	public static final int VK_KHX_EXTERNAL_MEMORY_FD_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_KHX_EXTERNAL_MEMORY_FD_EXTENSION_NAME = "VK_KHX_external_memory_fd";

	/**
	 * Extends {@code VkStructureType}.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHX STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHX}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHX STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHX}</li>
	 * </ul>
	 */
	public static final int
		VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHX = 1000074000,
		VK_STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHX  = 1000074001;

	protected KHXExternalMemoryFd() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilitiesDevice caps) {
		return checkFunctions(
			caps.vkGetMemoryFdKHX, caps.vkGetMemoryFdPropertiesKHX
		);
	}

	// --- [ vkGetMemoryFdKHX ] ---

	/** Unsafe version of: {@link #vkGetMemoryFdKHX GetMemoryFdKHX} */
	public static int nvkGetMemoryFdKHX(VkDevice device, long memory, int handleType, long pFd) {
		long __functionAddress = device.getCapabilities().vkGetMemoryFdKHX;
		if ( CHECKS )
			check(__functionAddress);
		return callPJPI(__functionAddress, device.address(), memory, handleType, pFd);
	}

	/**
	 * Get a POSIX file descriptor for a memory object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To export a POSIX file descriptor representing the underlying resources of a Vulkan device memory object, call:</p>
	 * 
	 * <pre><code>VkResult vkGetMemoryFdKHX(
    VkDevice                                    device,
    VkDeviceMemory                              memory,
    VkExternalMemoryHandleTypeFlagBitsKHX       handleType,
    int*                                        pFd);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>The properties of the file descriptor returned depend on the value of {@code handleType}. See {@code VkExternalMemoryHandleTypeFlagBitsKHX} for a description of the properties of the defined external memory handle types.</p>
	 * 
	 * <p>Each call to {@link #vkGetMemoryFdKHX GetMemoryFdKHX} <b>must</b> create a new file descriptor and transfer ownership of it to the application. To avoid leaking resources, the application <b>must</b> release ownership of the file descriptor using the fname:close system call when it is no longer needed, or by importing a Vulkan memory object from it.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code handleType} <b>must</b> have been included in {@link VkExportMemoryAllocateInfoKHX}{@code ::handleTypes} when {@code memory} was created.</li>
	 * <li>{@code handleType} <b>must</b> be defined as a POSIX file descriptor handle.</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
	 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHX} value</li>
	 * <li>{@code pFd} <b>must</b> be a pointer to a {@code int} value</li>
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
	 * @param pFd        will return a file descriptor representing the underlying resources of the device memory object.
	 */
	public static int vkGetMemoryFdKHX(VkDevice device, long memory, int handleType, IntBuffer pFd) {
		if ( CHECKS )
			check(pFd, 1);
		return nvkGetMemoryFdKHX(device, memory, handleType, memAddress(pFd));
	}

	// --- [ vkGetMemoryFdPropertiesKHX ] ---

	/** Unsafe version of: {@link #vkGetMemoryFdPropertiesKHX GetMemoryFdPropertiesKHX} */
	public static int nvkGetMemoryFdPropertiesKHX(VkDevice device, int handleType, int fd, long pMemoryFdProperties) {
		long __functionAddress = device.getCapabilities().vkGetMemoryFdPropertiesKHX;
		if ( CHECKS )
			check(__functionAddress);
		return callPPI(__functionAddress, device.address(), handleType, fd, pMemoryFdProperties);
	}

	/**
	 * Get Properties of External Memory File Descriptors.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>POSIX file descriptor memory handles compatible with Vulkan <b>may</b> also be created by non-Vulkan APIs using methods beyond the scope of this specification. To determine the correct parameters to use when importing such handles, call:</p>
	 * 
	 * <pre><code>VkResult vkGetMemoryFdPropertiesKHX(
    VkDevice                                    device,
    VkExternalMemoryHandleTypeFlagBitsKHX       handleType,
    int                                         fd,
    VkMemoryFdPropertiesKHX*                    pMemoryFdProperties);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code fd} <b>must</b> be an external memory handle created outside of the Vulkan API.</li>
	 * <li>{@code handleType} <b>must</b> not be one of the handle types defined as opaque.</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHX} value</li>
	 * <li>{@code pMemoryFdProperties} <b>must</b> be a pointer to a {@link VkMemoryFdPropertiesKHX} structure</li>
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
	 * <p>{@link VkMemoryFdPropertiesKHX}</p>
	 *
	 * @param device              the logical device that will be importing {@code fd}.
	 * @param handleType          the type of the handle {@code fd}.
	 * @param fd                  the handle which will be imported.
	 * @param pMemoryFdProperties will return properties of the handle {@code fd}.
	 */
	public static int vkGetMemoryFdPropertiesKHX(VkDevice device, int handleType, int fd, VkMemoryFdPropertiesKHX pMemoryFdProperties) {
		return nvkGetMemoryFdPropertiesKHX(device, handleType, fd, pMemoryFdProperties.address());
	}

	/** Array version of: {@link #vkGetMemoryFdKHX GetMemoryFdKHX} */
	public static int vkGetMemoryFdKHX(VkDevice device, long memory, int handleType, int[] pFd) {
		long __functionAddress = device.getCapabilities().vkGetMemoryFdKHX;
		if ( CHECKS ) {
			check(__functionAddress);
			check(pFd, 1);
		}
		return callPJPI(__functionAddress, device.address(), memory, handleType, pFd);
	}

}