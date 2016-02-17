/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * The {@code VK_KHR_win32_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the
 * {@code VK_KHR_surface} extension) that refers to a Win32 {@code HWND}, as well as a query to determine support for rendering to the windows desktop.
 */
public class KHRWin32Surface {

	/** The extension specification version. */
	public static final int VK_KHR_WIN32_SURFACE_SPEC_VERSION = 0x5;

	/** The extension name. */
	public static final String VK_KHR_WIN32_SURFACE_EXTENSION_NAME = "VK_KHR_win32_surface";

	/** VkStructureType */
	public static final int VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR = 1000009000;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateWin32SurfaceKHR,
		GetPhysicalDeviceWin32PresentationSupportKHR;

	@JavadocExclude
	protected KHRWin32Surface() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public KHRWin32Surface(FunctionProvider provider) {
		CreateWin32SurfaceKHR = checkFunctionAddress(provider.getFunctionAddress("vkCreateWin32SurfaceKHR"));
		GetPhysicalDeviceWin32PresentationSupportKHR = checkFunctionAddress(provider.getFunctionAddress("vkGetPhysicalDeviceWin32PresentationSupportKHR"));
	}

	// --- [ Function Addresses ] ---

	private static final KHRWin32Surface instance = new KHRWin32Surface(getLibrary());

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return VK10.getLibrary();
	}

	/** Returns the {@link KHRWin32Surface} instance. */
	public static KHRWin32Surface getInstance() {
		return instance;
	}

	// --- [ vkCreateWin32SurfaceKHR ] ---

	/** Unsafe version of {@link #vkCreateWin32SurfaceKHR CreateWin32SurfaceKHR} */
	@JavadocExclude
	public static int nvkCreateWin32SurfaceKHR(long instance, long pCreateInfo, long pAllocator, long pSurface) {
		long __functionAddress = getInstance().CreateWin32SurfaceKHR;
		if ( CHECKS )
			checkPointer(instance);
		return callPPPPI(__functionAddress, instance, pCreateInfo, pAllocator, pSurface);
	}

	/**
	 * Creates a {@code VkSurfaceKHR} object for a Win32 window.
	 *
	 * @param instance    the {@code VkInstance} to associate the surface
	 * @param pCreateInfo a pointer to an instance of the {@link VkWin32SurfaceCreateInfoKHR} structure containing the parameters affecting the creation of the surface object
	 * @param pAllocator  the allocator used for host memory allocated for the surface object
	 * @param pSurface    the resulting surface object handle is returned in {@code pSurface}
	 */
	public static int vkCreateWin32SurfaceKHR(long instance, VkWin32SurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pSurface) {
		if ( CHECKS )
			checkBuffer(pSurface, 1 << POINTER_SHIFT);
		return nvkCreateWin32SurfaceKHR(instance, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSurface));
	}

	/** Alternative version of: {@link #vkCreateWin32SurfaceKHR CreateWin32SurfaceKHR} */
	public static int vkCreateWin32SurfaceKHR(long instance, VkWin32SurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, PointerBuffer pSurface) {
		if ( CHECKS )
			checkBuffer(pSurface, 1);
		return nvkCreateWin32SurfaceKHR(instance, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSurface));
	}

	// --- [ vkGetPhysicalDeviceWin32PresentationSupportKHR ] ---

	/**
	 * Queries physical device for presentation to Windows desktop.
	 *
	 * @param physicalDevice   a physical device handle
	 * @param queueFamilyIndex index to a queue family
	 */
	public static int vkGetPhysicalDeviceWin32PresentationSupportKHR(long physicalDevice, int queueFamilyIndex) {
		long __functionAddress = getInstance().GetPhysicalDeviceWin32PresentationSupportKHR;
		if ( CHECKS )
			checkPointer(physicalDevice);
		return callPII(__functionAddress, physicalDevice, queueFamilyIndex);
	}

}