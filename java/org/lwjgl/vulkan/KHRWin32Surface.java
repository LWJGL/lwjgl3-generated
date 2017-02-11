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
 * <dd>VK_KHR_win32_surface</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>10</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2015-11-28</dd>
 * <dt><b>Revision</b></dt>
 * <dd>5</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>This extension requires VK_KHR_surface.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Patrick Doane, Blizzard</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Ian Elliott, LunarG</li>
 * <li>Courtney Goeltzenleuchter, LunarG</li>
 * <li>Jesse Hall, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Antoine Labour, Google</li>
 * <li>Jon Leech, Khronos</li>
 * <li>David Mao, AMD</li>
 * <li>Norbert Nopper, Freescale</li>
 * <li>Alon Or-bach, Samsung</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Graham Sellers, AMD</li>
 * <li>Ray Smith, ARM</li>
 * <li>Jeff Vigil, Qualcomm</li>
 * <li>Chia-I Wu, LunarG</li>
 * </ul></dd>
 * <dt><b>Contacts</b></dt>
 * <dd><ul>
 * <li>Jesse Hall, Google</li>
 * <li>Ian Elliott, LunarG</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>The {@code VK_KHR_win32_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@code VK_KHR_surface} extension) that refers to a Win32 {@code HWND}, as well as a query to determine support for rendering to the windows desktop.</p>
 */
public class KHRWin32Surface {

	/** The extension specification version. */
	public static final int VK_KHR_WIN32_SURFACE_SPEC_VERSION = 5;

	/** The extension name. */
	public static final String VK_KHR_WIN32_SURFACE_EXTENSION_NAME = "VK_KHR_win32_surface";

	/** Extends {@code VkStructureType}. */
	public static final int VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR = 1000009000;

	protected KHRWin32Surface() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilitiesInstance caps) {
		return checkFunctions(
			caps.vkCreateWin32SurfaceKHR, caps.vkGetPhysicalDeviceWin32PresentationSupportKHR
		);
	}

	// --- [ vkCreateWin32SurfaceKHR ] ---

	/** Unsafe version of: {@link #vkCreateWin32SurfaceKHR CreateWin32SurfaceKHR} */
	public static int nvkCreateWin32SurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
		long __functionAddress = instance.getCapabilities().vkCreateWin32SurfaceKHR;
		if ( CHECKS ) {
			check(__functionAddress);
			VkWin32SurfaceCreateInfoKHR.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, instance.address(), pCreateInfo, pAllocator, pSurface);
	}

	/**
	 * Create a {@code VkSurfaceKHR} object for an Win32 native window.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a {@code VkSurfaceKHR} object for a Win32 window, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateWin32SurfaceKHR(
    VkInstance                                  instance,
    const VkWin32SurfaceCreateInfoKHR*          pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkSurfaceKHR*                               pSurface);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkWin32SurfaceCreateInfoKHR} structure</li>
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
	 * <p>{@link VkAllocationCallbacks}, {@link VkWin32SurfaceCreateInfoKHR}</p>
	 *
	 * @param instance    the instance to associate the surface with.
	 * @param pCreateInfo a pointer to an instance of the {@link VkWin32SurfaceCreateInfoKHR} structure containing parameters affecting the creation of the surface object.
	 * @param pAllocator  the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a>).
	 * @param pSurface    points to a {@code VkSurfaceKHR} handle in which the created surface object is returned.
	 */
	public static int vkCreateWin32SurfaceKHR(VkInstance instance, VkWin32SurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSurface) {
		if ( CHECKS )
			check(pSurface, 1);
		return nvkCreateWin32SurfaceKHR(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSurface));
	}

	// --- [ vkGetPhysicalDeviceWin32PresentationSupportKHR ] ---

	/**
	 * query queue family support for presentation on a Win32 display.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To determine whether a queue family of a physical device supports presentation to the Microsoft Windows desktop, call:</p>
	 * 
	 * <pre><code>VkBool32 vkGetPhysicalDeviceWin32PresentationSupportKHR(
    VkPhysicalDevice                            physicalDevice,
    uint32_t                                    queueFamilyIndex);</code></pre>
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
	 * </ul>
	 *
	 * @param physicalDevice   the physical device.
	 * @param queueFamilyIndex the queue family index.
	 */
	public static boolean vkGetPhysicalDeviceWin32PresentationSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceWin32PresentationSupportKHR;
		if ( CHECKS )
			check(__functionAddress);
		return callPI(__functionAddress, physicalDevice.address(), queueFamilyIndex) != 0;
	}

	/** Array version of: {@link #vkCreateWin32SurfaceKHR CreateWin32SurfaceKHR} */
	public static int vkCreateWin32SurfaceKHR(VkInstance instance, VkWin32SurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, long[] pSurface) {
		long __functionAddress = instance.getCapabilities().vkCreateWin32SurfaceKHR;
		if ( CHECKS ) {
			check(__functionAddress);
			check(pSurface, 1);
			VkWin32SurfaceCreateInfoKHR.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSurface);
	}

}