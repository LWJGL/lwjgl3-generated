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
 * The {@code VK_KHR_xlib_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the
 * {@code VK_KHR_surface} extension) that refers to an X11 window, using the Xlib client-side library, as well as a query to determine support for
 * rendering via Xlib.
 */
public class KHRXlibSurface {

	/** The extension specification version. */
	public static final int VK_KHR_XLIB_SURFACE_SPEC_VERSION = 6;

	/** The extension name. */
	public static final String VK_KHR_XLIB_SURFACE_EXTENSION_NAME = "VK_KHR_xlib_surface";

	/** VkStructureType */
	public static final int VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR = 1000004000;

	protected KHRXlibSurface() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilities caps) {
		return checkFunctions(
			caps.vkCreateXlibSurfaceKHR, caps.vkGetPhysicalDeviceXlibPresentationSupportKHR
		);
	}

	// --- [ vkCreateXlibSurfaceKHR ] ---

	/**
	 * Creates a {@code VkSurfaceKHR} object for an X11 window, using the Xlib client-side library.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkXlibSurfaceCreateInfoKHR} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSurface} <b>must</b> be a pointer to a {@code VkSurfaceKHR} handle</li>
	 * </ul>
	 * 
	 * <p>With Xlib, {@code minImageExtent}, {@code maxImageExtent}, and {@code currentExtent} are the window size. Therefore, a swapchain’s {@code imageExtent}
	 * <b>must</b> match the window’s size.</p>
	 * 
	 * <p>Some Vulkan functions <b>may</b> send protocol over the specified Xlib Display connection when using a swapchain or presentable images created from a
	 * {@code VkSurface} referring to an Xlib window. Applications <b>must</b> therefore ensure the display connection is available to Vulkan for the duration of
	 * any functions that manipulate such swapchains or their presentable images, and any functions that build or queue command buffers that operate on such
	 * presentable images. Specifically, applications using Vulkan with Xlib-based swapchains <b>must</b></p>
	 * 
	 * <ul>
	 * <li>Call {@code XInitThreads()} before calling any other Xlib functions if they intend to use Vulkan in multiple threads, or use Vulkan and Xlib in
	 * separate threads.</li>
	 * <li>Avoid holding a server grab on a display connection while waiting for Vulkan operations to complete using a swapchain derived from a different
	 * display connection referring to the same X server instance. Failing to do so may result in deadlock.</li>
	 * </ul>
	 *
	 * @param instance    the instance to associate the surface with
	 * @param pCreateInfo a pointer to an instance of the {@link VkXlibSurfaceCreateInfoKHR} structure containing the parameters affecting the creation of the surface object
	 * @param pAllocator  controls host memory allocation
	 * @param pSurface    points to a {@code VkSurfaceKHR} handle in which the created surface object is returned
	 */
	public static int nvkCreateXlibSurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
		long __functionAddress = instance.getCapabilities().vkCreateXlibSurfaceKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkXlibSurfaceCreateInfoKHR.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, instance.address(), pCreateInfo, pAllocator, pSurface);
	}

	/**
	 * Creates a {@code VkSurfaceKHR} object for an X11 window, using the Xlib client-side library.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkXlibSurfaceCreateInfoKHR} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSurface} <b>must</b> be a pointer to a {@code VkSurfaceKHR} handle</li>
	 * </ul>
	 * 
	 * <p>With Xlib, {@code minImageExtent}, {@code maxImageExtent}, and {@code currentExtent} are the window size. Therefore, a swapchain’s {@code imageExtent}
	 * <b>must</b> match the window’s size.</p>
	 * 
	 * <p>Some Vulkan functions <b>may</b> send protocol over the specified Xlib Display connection when using a swapchain or presentable images created from a
	 * {@code VkSurface} referring to an Xlib window. Applications <b>must</b> therefore ensure the display connection is available to Vulkan for the duration of
	 * any functions that manipulate such swapchains or their presentable images, and any functions that build or queue command buffers that operate on such
	 * presentable images. Specifically, applications using Vulkan with Xlib-based swapchains <b>must</b></p>
	 * 
	 * <ul>
	 * <li>Call {@code XInitThreads()} before calling any other Xlib functions if they intend to use Vulkan in multiple threads, or use Vulkan and Xlib in
	 * separate threads.</li>
	 * <li>Avoid holding a server grab on a display connection while waiting for Vulkan operations to complete using a swapchain derived from a different
	 * display connection referring to the same X server instance. Failing to do so may result in deadlock.</li>
	 * </ul>
	 *
	 * @param instance    the instance to associate the surface with
	 * @param pCreateInfo a pointer to an instance of the {@link VkXlibSurfaceCreateInfoKHR} structure containing the parameters affecting the creation of the surface object
	 * @param pAllocator  controls host memory allocation
	 * @param pSurface    points to a {@code VkSurfaceKHR} handle in which the created surface object is returned
	 */
	public static int vkCreateXlibSurfaceKHR(VkInstance instance, VkXlibSurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSurface) {
		if ( CHECKS )
			checkBuffer(pSurface, 1);
		return nvkCreateXlibSurfaceKHR(instance, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSurface));
	}

	// --- [ vkGetPhysicalDeviceXlibPresentationSupportKHR ] ---

	/**
	 * Determines whether a queue family of a physical device supports presentation to an X11 server, using the Xlib client-side library.
	 * 
	 * <p>This platform-specific function <b>can</b> be called prior to creating a surface.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code dpy} <b>must</b> be a pointer to a {@code Display} value</li>
	 * <li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} for the given
	 * {@code physicalDevice}</li>
	 * </ul>
	 *
	 * @param physicalDevice   the physical device
	 * @param queueFamilyIndex the queue family index
	 * @param dpy              a pointer to an Xlib {@code Display} connection to the server
	 * @param visualID         an X11 visual (VisualID)
	 */
	public static int vkGetPhysicalDeviceXlibPresentationSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long dpy, long visualID) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceXlibPresentationSupportKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
		}
		return callPPPI(__functionAddress, physicalDevice.address(), queueFamilyIndex, dpy, visualID);
	}

	/** Array version of: {@link #vkCreateXlibSurfaceKHR CreateXlibSurfaceKHR} */
	public static int vkCreateXlibSurfaceKHR(VkInstance instance, VkXlibSurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, long[] pSurface) {
		long __functionAddress = instance.getCapabilities().vkCreateXlibSurfaceKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pSurface, 1);
			VkXlibSurfaceCreateInfoKHR.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, instance.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pSurface);
	}

}