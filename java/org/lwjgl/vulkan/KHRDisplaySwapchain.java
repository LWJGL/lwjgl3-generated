/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

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

	/** Function address. */
	public final long CreateSharedSwapchainsKHR;

	protected KHRDisplaySwapchain() {
		throw new UnsupportedOperationException();
	}

	public KHRDisplaySwapchain(FunctionProvider provider) {
		CreateSharedSwapchainsKHR = provider.getFunctionAddress("vkCreateSharedSwapchainsKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRDisplaySwapchain} instance from the specified dispatchable handle. */
	public static KHRDisplaySwapchain getInstance(DispatchableHandle handle) {
		return getInstance(handle.getCapabilities());
	}

	/** Returns the {@link KHRDisplaySwapchain} instance of the specified {@link VKCapabilities}. */
	public static KHRDisplaySwapchain getInstance(VKCapabilities caps) {
		return checkFunctionality(caps.__KHRDisplaySwapchain);
	}

	static KHRDisplaySwapchain create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("VK_KHR_display_swapchain") )
			return null;

		return VK.checkExtension("VK_KHR_display_swapchain", create(provider));
	}

	static KHRDisplaySwapchain create(FunctionProvider provider) {
		KHRDisplaySwapchain funcs = new KHRDisplaySwapchain(provider);

		boolean supported = checkFunctions(
			funcs.CreateSharedSwapchainsKHR
		);

		return supported ? funcs : null;
	}

	// --- [ vkCreateSharedSwapchainsKHR ] ---

	/** Unsafe version of {@link #vkCreateSharedSwapchainsKHR CreateSharedSwapchainsKHR} */
	public static int nvkCreateSharedSwapchainsKHR(VkDevice device, int swapchainCount, long pCreateInfos, long pAllocator, long pSwapchains) {
		long __functionAddress = getInstance(device).CreateSharedSwapchainsKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkSwapchainCreateInfoKHR.validate(pCreateInfos, swapchainCount);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPIPPPI(__functionAddress, device.address(), swapchainCount, pCreateInfos, pAllocator, pSwapchains);
	}

	/**
	 * Creates multiple swapchains that share presentable images.
	 *
	 * @param device         the {@code VkDevice} assocated with swapchain
	 * @param swapchainCount the count of the array of swapchain create info
	 * @param pCreateInfos   a pointer to an array of {@link VkSwapchainCreateInfoKHR} structures containing the parameters affecting the creation of the swapchain objects
	 * @param pAllocator     the allocator used for host memory allocated for the swapchain objects
	 * @param pSwapchains    the array of created swapchains
	 */
	public static int vkCreateSharedSwapchainsKHR(VkDevice device, int swapchainCount, VkSwapchainCreateInfoKHR.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, ByteBuffer pSwapchains) {
		if ( CHECKS ) {
			checkBuffer(pCreateInfos, swapchainCount);
			checkBuffer(pSwapchains, swapchainCount << 3);
		}
		return nvkCreateSharedSwapchainsKHR(device, swapchainCount, pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSwapchains));
	}

	/** Alternative version of: {@link #vkCreateSharedSwapchainsKHR CreateSharedSwapchainsKHR} */
	public static int vkCreateSharedSwapchainsKHR(VkDevice device, VkSwapchainCreateInfoKHR.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, LongBuffer pSwapchains) {
		if ( CHECKS )
			checkBuffer(pSwapchains, pCreateInfos.remaining());
		return nvkCreateSharedSwapchainsKHR(device, pCreateInfos.remaining(), pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSwapchains));
	}

}