/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The {@code VK_KHR_win32_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the
 * {@code VK_KHR_surface} extension) that refers to a Win32 {@code HWND}, as well as a query to determine support for rendering to the windows desktop.
 */
public class KHRWin32Surface {

	/** The extension specification version. */
	public static final int VK_KHR_WIN32_SURFACE_SPEC_VERSION = 5;

	/** The extension name. */
	public static final String VK_KHR_WIN32_SURFACE_EXTENSION_NAME = "VK_KHR_win32_surface";

	/** VkStructureType */
	public static final int VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR = 1000009000;

	protected KHRWin32Surface() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilities caps) {
		return checkFunctions(
			caps.vkCreateWin32SurfaceKHR, caps.vkGetPhysicalDeviceWin32PresentationSupportKHR
		);
	}

	// --- [ vkCreateWin32SurfaceKHR ] ---

	/**
	 * Creates a {@code VkSurfaceKHR} object for a Win32 window.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkWin32SurfaceCreateInfoKHR} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSurface} <b>must</b> be a pointer to a {@code VkSurfaceKHR} handle</li>
	 * </ul>
	 * 
	 * <p>With Win32, {@code minImageExtent}, {@code maxImageExtent}, and {@code currentExtent} are the window size. Therefore, a swapchain’s {@code imageExtent}
	 * <b>must</b> match the window’s size.</p>
	 *
	 * @param instance    the instance to associate the surface with
	 * @param pCreateInfo a pointer to an instance of the {@link VkWin32SurfaceCreateInfoKHR} structure containing parameters affecting the creation of the surface object
	 * @param pAllocator  controls host memory allocation
	 * @param pSurface    points to a {@code VkSurfaceKHR} handle in which the created surface object is returned
	 */
	public static int nvkCreateWin32SurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
		long __functionAddress = instance.getCapabilities().vkCreateWin32SurfaceKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkWin32SurfaceCreateInfoKHR.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, instance.address(), pCreateInfo, pAllocator, pSurface);
	}

	/**
	 * Creates a {@code VkSurfaceKHR} object for a Win32 window.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkWin32SurfaceCreateInfoKHR} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSurface} <b>must</b> be a pointer to a {@code VkSurfaceKHR} handle</li>
	 * </ul>
	 * 
	 * <p>With Win32, {@code minImageExtent}, {@code maxImageExtent}, and {@code currentExtent} are the window size. Therefore, a swapchain’s {@code imageExtent}
	 * <b>must</b> match the window’s size.</p>
	 *
	 * @param instance    the instance to associate the surface with
	 * @param pCreateInfo a pointer to an instance of the {@link VkWin32SurfaceCreateInfoKHR} structure containing parameters affecting the creation of the surface object
	 * @param pAllocator  controls host memory allocation
	 * @param pSurface    points to a {@code VkSurfaceKHR} handle in which the created surface object is returned
	 */
	public static int vkCreateWin32SurfaceKHR(VkInstance instance, VkWin32SurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSurface) {
		if ( CHECKS )
			checkBuffer(pSurface, 1);
		return nvkCreateWin32SurfaceKHR(instance, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSurface));
	}

	// --- [ vkGetPhysicalDeviceWin32PresentationSupportKHR ] ---

	/**
	 * Determines whether a queue family of a physical device supports presentation to the Microsoft Windows desktop.
	 * 
	 * <p>This platform-specific function <b>can</b> be called prior to creating a surface.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} for the given
	 * {@code physicalDevice}</li>
	 * </ul>
	 *
	 * @param physicalDevice   the physical device
	 * @param queueFamilyIndex the queue family index
	 */
	public static int vkGetPhysicalDeviceWin32PresentationSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceWin32PresentationSupportKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, physicalDevice.address(), queueFamilyIndex);
	}

	/** Array version of: {@link #vkCreateWin32SurfaceKHR CreateWin32SurfaceKHR} */
	public static int vkCreateWin32SurfaceKHR(VkInstance instance, VkWin32SurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, long[] pSurface) {
		long __functionAddress = instance.getCapabilities().vkCreateWin32SurfaceKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pSurface, 1);
			VkWin32SurfaceCreateInfoKHR.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, instance.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pSurface);
	}

}