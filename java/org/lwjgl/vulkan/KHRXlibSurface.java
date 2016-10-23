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

/** The {@code VK_KHR_xlib_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@code VK_KHR_surface} extension) that refers to an X11 {@code Window}, using the Xlib client-side library, as well as a query to determine support for rendering via Xlib. */
public class KHRXlibSurface {

	/** The extension specification version. */
	public static final int VK_KHR_XLIB_SURFACE_SPEC_VERSION = 6;

	/** The extension name. */
	public static final String VK_KHR_XLIB_SURFACE_EXTENSION_NAME = "VK_KHR_xlib_surface";

	/** Extends {@code VkStructureType}. */
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

	/** Unsafe version of: {@link #vkCreateXlibSurfaceKHR CreateXlibSurfaceKHR} */
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
	 * Create a {@code VkSurfaceKHR} object for an X11 window, using the Xlib client-side library.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a {@code VkSurfaceKHR} object for an X11 window, using the Xlib client-side library, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateXlibSurfaceKHR(
    VkInstance                                  instance,
    const VkXlibSurfaceCreateInfoKHR*           pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkSurfaceKHR*                               pSurface);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkXlibSurfaceCreateInfoKHR} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSurface} <b>must</b> be a pointer to a {@code VkSurfaceKHR} handle</li>
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
	 * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkXlibSurfaceCreateInfoKHR}</p>
	 *
	 * @param instance    the instance to associate the surface with.
	 * @param pCreateInfo a pointer to an instance of the {@link VkXlibSurfaceCreateInfoKHR} structure containing the parameters affecting the creation of the surface object.
	 * @param pAllocator  the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a>).
	 * @param pSurface    points to a {@code VkSurfaceKHR} handle in which the created surface object is returned.
	 */
	public static int vkCreateXlibSurfaceKHR(VkInstance instance, VkXlibSurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSurface) {
		if ( CHECKS )
			checkBuffer(pSurface, 1);
		return nvkCreateXlibSurfaceKHR(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSurface));
	}

	// --- [ vkGetPhysicalDeviceXlibPresentationSupportKHR ] ---

	/**
	 * Query physical device for presentation to X11 server using Xlib.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To determine whether a queue family of a physical device supports presentation to an X11 server, using the Xlib client-side library, call:</p>
	 * 
	 * <pre><code>VkBool32 vkGetPhysicalDeviceXlibPresentationSupportKHR(
    VkPhysicalDevice                            physicalDevice,
    uint32_t                                    queueFamilyIndex,
    Display*                                    dpy,
    VisualID                                    visualID);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>This platform-specific function <b>can</b> be called prior to creating a surface.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} for the given {@code physicalDevice}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code dpy} <b>must</b> be a pointer to a {@code Display} value</li>
	 * </ul>
	 *
	 * @param physicalDevice   the physical device.
	 * @param queueFamilyIndex the queue family index.
	 * @param dpy              a pointer to an Xlib {@code Display} connection to the server.
	 * @param visualID         
	 */
	public static boolean vkGetPhysicalDeviceXlibPresentationSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long dpy, long visualID) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceXlibPresentationSupportKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
		}
		return callPPPI(__functionAddress, physicalDevice.address(), queueFamilyIndex, dpy, visualID) != 0;
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
		return callPPPPI(__functionAddress, instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSurface);
	}

}