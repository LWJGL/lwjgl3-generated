/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_EXT_display_surface_counter</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>91</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-12-13</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0.37 of the Vulkan API.</li>
 * <li>Requires VK_KHR_display</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Pierre Boudier, NVIDIA</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Damien Leone, NVIDIA</li>
 * <li>Pierre-Loup Griffais, Valve</li>
 * <li>Daniel Vetter, Intel</li>
 * </ul></dd>
 * <dt><b>Contacts</b></dt>
 * <dd><ul>
 * <li>James Jones, NVIDIA (jajones 'at' nvidia.com)</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>This is extension defines a vertical blanking period counter associated with display surfaces. It provides a mechanism to query support for such a counter from a {@code VkSurfaceKHR} object.</p>
 */
public class EXTDisplaySurfaceCounter {

	/** The extension specification version. */
	public static final int VK_EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME = "VK_EXT_display_surface_counter";

	/** Extends {@code VkStructureType}. */
	public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT = 1000090000;

	/**
	 * VkSurfaceCounterFlagBitsEXT - Surface-relative counter types
	 * 
	 * <h5>Description</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_SURFACE_COUNTER_VBLANK_EXT SURFACE_COUNTER_VBLANK_EXT} A counter incrementing once every time a vblank period occurs on the display associated with the surface.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkSurfaceCounterFlagsEXT}, {@link EXTDisplayControl#vkGetSwapchainCounterEXT GetSwapchainCounterEXT}</p>
	 */
	public static final int VK_SURFACE_COUNTER_VBLANK_EXT = 0x1;

	protected EXTDisplaySurfaceCounter() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilitiesInstance caps) {
		return checkFunctions(
			caps.vkGetPhysicalDeviceSurfaceCapabilities2EXT
		);
	}

	// --- [ vkGetPhysicalDeviceSurfaceCapabilities2EXT ] ---

	/** Unsafe version of: {@link #vkGetPhysicalDeviceSurfaceCapabilities2EXT GetPhysicalDeviceSurfaceCapabilities2EXT} */
	public static int nvkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, long surface, long pSurfaceCapabilities) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceCapabilities2EXT;
		if ( CHECKS )
			check(__functionAddress);
		return callPJPI(__functionAddress, physicalDevice.address(), surface, pSurfaceCapabilities);
	}

	/**
	 * Query surface capabilities.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query the basic capabilities of a surface, needed in order to create a swapchain, call:</p>
	 * 
	 * <pre><code>VkResult vkGetPhysicalDeviceSurfaceCapabilities2EXT(
    VkPhysicalDevice                            physicalDevice,
    VkSurfaceKHR                                surface,
    VkSurfaceCapabilities2EXT*                  pSurfaceCapabilities);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkGetPhysicalDeviceSurfaceCapabilities2EXT GetPhysicalDeviceSurfaceCapabilities2EXT} behaves similarly to {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR}, with the ability to return extended information via chained output structures.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
	 * <li>{@code pSurfaceCapabilities} <b>must</b> be a pointer to a {@link VkSurfaceCapabilities2EXT} structure</li>
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
	 * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkSurfaceCapabilities2EXT}</p>
	 *
	 * @param physicalDevice       the physical device that will be associated with the swapchain to be created, as described for {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
	 * @param surface              the surface that will be associated with the swapchain.
	 * @param pSurfaceCapabilities a pointer to an instance of the {@link VkSurfaceCapabilities2EXT} structure in which the capabilities are returned.
	 */
	public static int vkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, long surface, VkSurfaceCapabilities2EXT pSurfaceCapabilities) {
		return nvkGetPhysicalDeviceSurfaceCapabilities2EXT(physicalDevice, surface, pSurfaceCapabilities.address());
	}

}