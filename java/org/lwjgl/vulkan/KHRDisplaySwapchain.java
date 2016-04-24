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

/** This extension provides an API to create a swapchain directly on a device's display without any underlying window system. */
public class KHRDisplaySwapchain {

	/** The extension specification version. */
	public static final int VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION = 9;

	/** The extension name. */
	public static final String VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_display_swapchain";

	/** VkStructureType */
	public static final int VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR = 1000003000;

	/** The display used by a swapchain does not use the same presentable image layout, or is incompatible in a way that prevents sharing an image. */
	public static final int VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = -1000003001;

	protected KHRDisplaySwapchain() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilities caps) {
		return checkFunctions(
			caps.vkCreateSharedSwapchainsKHR
		);
	}

	// --- [ vkCreateSharedSwapchainsKHR ] ---

	/**
	 * Creates multiple swapchains that share presentable images.
	 * 
	 * <p>{@code vkCreateSharedSwapchains} is similar to {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}, except that it takes an array of {@link VkSwapchainCreateInfoKHR}
	 * structures, and returns an array of swapchain objects.</p>
	 * 
	 * <p>The swapchain creation parameters that affect the properties and number of presentable images <b>must</b> match between all the swapchains. If the displays
	 * used by any of the swapchains do not use the same presentable image layout or are incompatible in a way that prevents sharing images, swapchain
	 * creation will fail with the result code {@link #VK_ERROR_INCOMPATIBLE_DISPLAY_KHR ERROR_INCOMPATIBLE_DISPLAY_KHR}. If any error occurs, no swapchains will be created. Images presented to
	 * multiple swapchains <b>must</b> be re-acquired from all of them before transitioning away from {@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}. After destroying
	 * one or more of the swapchains, the remaining swapchains and the presentable images <b>can</b> continue to be used.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfos} <b>must</b> be a pointer to an array of {@code swapchainCount} valid {@link VkSwapchainCreateInfoKHR} structures</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSwapchains} <b>must</b> be a pointer to an array of {@code swapchainCount} {@code VkSwapchainKHR} handles</li>
	 * <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pCreateInfos}[].surface <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pCreateInfos}[].oldSwapchain <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device         the device to create the swapchains for
	 * @param swapchainCount the number of swapchains to create
	 * @param pCreateInfos   a pointer to an array of {@link VkSwapchainCreateInfoKHR} structures specifying the parameters of the created swapchains
	 * @param pAllocator     controls host memory allocation
	 * @param pSwapchains    a pointer to an array of {@code VkSwapchainKHR} handles in which the created swapchain objects will be returned
	 */
	public static int nvkCreateSharedSwapchainsKHR(VkDevice device, int swapchainCount, long pCreateInfos, long pAllocator, long pSwapchains) {
		long __functionAddress = device.getCapabilities().vkCreateSharedSwapchainsKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkSwapchainCreateInfoKHR.validate(pCreateInfos, swapchainCount);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), swapchainCount, pCreateInfos, pAllocator, pSwapchains);
	}

	/**
	 * Creates multiple swapchains that share presentable images.
	 * 
	 * <p>{@code vkCreateSharedSwapchains} is similar to {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}, except that it takes an array of {@link VkSwapchainCreateInfoKHR}
	 * structures, and returns an array of swapchain objects.</p>
	 * 
	 * <p>The swapchain creation parameters that affect the properties and number of presentable images <b>must</b> match between all the swapchains. If the displays
	 * used by any of the swapchains do not use the same presentable image layout or are incompatible in a way that prevents sharing images, swapchain
	 * creation will fail with the result code {@link #VK_ERROR_INCOMPATIBLE_DISPLAY_KHR ERROR_INCOMPATIBLE_DISPLAY_KHR}. If any error occurs, no swapchains will be created. Images presented to
	 * multiple swapchains <b>must</b> be re-acquired from all of them before transitioning away from {@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}. After destroying
	 * one or more of the swapchains, the remaining swapchains and the presentable images <b>can</b> continue to be used.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfos} <b>must</b> be a pointer to an array of {@code swapchainCount} valid {@link VkSwapchainCreateInfoKHR} structures</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSwapchains} <b>must</b> be a pointer to an array of {@code swapchainCount} {@code VkSwapchainKHR} handles</li>
	 * <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pCreateInfos}[].surface <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pCreateInfos}[].oldSwapchain <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device       the device to create the swapchains for
	 * @param pCreateInfos a pointer to an array of {@link VkSwapchainCreateInfoKHR} structures specifying the parameters of the created swapchains
	 * @param pAllocator   controls host memory allocation
	 * @param pSwapchains  a pointer to an array of {@code VkSwapchainKHR} handles in which the created swapchain objects will be returned
	 */
	public static int vkCreateSharedSwapchainsKHR(VkDevice device, VkSwapchainCreateInfoKHR.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, LongBuffer pSwapchains) {
		if ( CHECKS )
			checkBuffer(pSwapchains, pCreateInfos.remaining());
		return nvkCreateSharedSwapchainsKHR(device, pCreateInfos.remaining(), pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSwapchains));
	}

	/** Array version of: {@link #vkCreateSharedSwapchainsKHR CreateSharedSwapchainsKHR} */
	public static int vkCreateSharedSwapchainsKHR(VkDevice device, VkSwapchainCreateInfoKHR.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, long[] pSwapchains) {
		long __functionAddress = device.getCapabilities().vkCreateSharedSwapchainsKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pSwapchains, pCreateInfos.remaining());
			VkSwapchainCreateInfoKHR.validate(pCreateInfos.address(), pCreateInfos.remaining());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfos.remaining(), pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), pSwapchains);
	}

}