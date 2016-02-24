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

/**
 * The {@code VK_KHR_swapchain} extension is the device-level companion to the {@code VK_KHR_surface} extension. It introduces {@code VkSwapchainKHR}
 * objects, which provide the ability to present rendering results to a surface.
 */
public class KHRSwapchain {

	/** The extension specification version. */
	public static final int VK_KHR_SWAPCHAIN_SPEC_VERSION = 0x43;

	/** The extension name. */
	public static final String VK_KHR_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_swapchain";

	/** VkStructureType */
	public static final int
		VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR = 1000001000,
		VK_STRUCTURE_TYPE_PRESENT_INFO_KHR          = 1000001001;

	/** VkImageLayout */
	public static final int VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = 1000001002;

	/** VkResult */
	public static final int
		VK_SUBOPTIMAL_KHR        = 1000001003,
		VK_ERROR_OUT_OF_DATE_KHR = -1000001004;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateSwapchainKHR,
		DestroySwapchainKHR,
		GetSwapchainImagesKHR,
		AcquireNextImageKHR,
		QueuePresentKHR;

	@JavadocExclude
	protected KHRSwapchain() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public KHRSwapchain(FunctionProvider provider) {
		CreateSwapchainKHR = provider.getFunctionAddress("vkCreateSwapchainKHR");
		DestroySwapchainKHR = provider.getFunctionAddress("vkDestroySwapchainKHR");
		GetSwapchainImagesKHR = provider.getFunctionAddress("vkGetSwapchainImagesKHR");
		AcquireNextImageKHR = provider.getFunctionAddress("vkAcquireNextImageKHR");
		QueuePresentKHR = provider.getFunctionAddress("vkQueuePresentKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRSwapchain} instance from the specified dispatchable handle. */
	public static KHRSwapchain getInstance(DispatchableHandle handle) {
		return getInstance(handle.getCapabilities());
	}

	/** Returns the {@link KHRSwapchain} instance of the specified {@link VKCapabilities}. */
	public static KHRSwapchain getInstance(VKCapabilities caps) {
		return checkFunctionality(caps.__KHRSwapchain);
	}

	static KHRSwapchain create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("VK_KHR_swapchain") )
			return null;

		return VK.checkExtension("VK_KHR_swapchain", create(provider));
	}

	static KHRSwapchain create(FunctionProvider provider) {
		KHRSwapchain funcs = new KHRSwapchain(provider);

		boolean supported = checkFunctions(
			funcs.CreateSwapchainKHR, funcs.DestroySwapchainKHR, funcs.GetSwapchainImagesKHR, funcs.AcquireNextImageKHR, funcs.QueuePresentKHR
		);

		return supported ? funcs : null;
	}

	// --- [ vkCreateSwapchainKHR ] ---

	/** Unsafe version of {@link #vkCreateSwapchainKHR CreateSwapchainKHR} */
	@JavadocExclude
	public static int nvkCreateSwapchainKHR(VkDevice device, long pCreateInfo, long pAllocator, long pSwapchain) {
		long __functionAddress = getInstance(device).CreateSwapchainKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pSwapchain);
	}

	/**
	 * Creates a swapchain.
	 *
	 * @param device      the VkDevice to associate the swapchain
	 * @param pCreateInfo a pointer to an instance of the {@link VkSwapchainCreateInfoKHR} structure containing the parameters affecting the creation of the swapchain object
	 * @param pAllocator  the allocator used for host memory allocated for the surface object
	 * @param pSwapchain  the resulting swapchain
	 */
	public static int vkCreateSwapchainKHR(VkDevice device, VkSwapchainCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pSwapchain) {
		if ( CHECKS )
			checkBuffer(pSwapchain, 1 << 3);
		return nvkCreateSwapchainKHR(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSwapchain));
	}

	/** Alternative version of: {@link #vkCreateSwapchainKHR CreateSwapchainKHR} */
	public static int vkCreateSwapchainKHR(VkDevice device, VkSwapchainCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSwapchain) {
		if ( CHECKS )
			checkBuffer(pSwapchain, 1);
		return nvkCreateSwapchainKHR(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSwapchain));
	}

	// --- [ vkDestroySwapchainKHR ] ---

	/** Unsafe version of {@link #vkDestroySwapchainKHR DestroySwapchainKHR} */
	@JavadocExclude
	public static void nvkDestroySwapchainKHR(VkDevice device, long swapchain, long pAllocator) {
		long __functionAddress = getInstance(device).DestroySwapchainKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJPV(__functionAddress, device.address(), swapchain, pAllocator);
	}

	/**
	 * Destroys a swapchain object.
	 *
	 * @param device     the {@code VkDevice} associated with the swapchain
	 * @param swapchain  the swapchain to destroy
	 * @param pAllocator the allocator used for host memory allocated for the swapchain object
	 */
	public static void vkDestroySwapchainKHR(VkDevice device, long swapchain, VkAllocationCallbacks pAllocator) {
		nvkDestroySwapchainKHR(device, swapchain, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetSwapchainImagesKHR ] ---

	/** Unsafe version of {@link #vkGetSwapchainImagesKHR GetSwapchainImagesKHR} */
	@JavadocExclude
	public static int nvkGetSwapchainImagesKHR(VkDevice device, long swapchain, long pSwapchainImageCount, long pSwapchainImages) {
		long __functionAddress = getInstance(device).GetSwapchainImagesKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJPPI(__functionAddress, device.address(), swapchain, pSwapchainImageCount, pSwapchainImages);
	}

	/**
	 * Obtains the array of presentable images associated with a swapchain.
	 *
	 * @param device               the {@code VkDevice} associated with swapchain
	 * @param swapchain            the swapchain
	 * @param pSwapchainImageCount the number of elements in the array pointed by {@code pSwapchainImages}
	 * @param pSwapchainImages     the returned array of images
	 */
	public static int vkGetSwapchainImagesKHR(VkDevice device, long swapchain, ByteBuffer pSwapchainImageCount, ByteBuffer pSwapchainImages) {
		if ( CHECKS ) {
			checkBuffer(pSwapchainImageCount, 1 << 2);
			if ( pSwapchainImages != null ) checkBuffer(pSwapchainImages, pSwapchainImageCount.getInt(pSwapchainImageCount.position()) << 3);
		}
		return nvkGetSwapchainImagesKHR(device, swapchain, memAddress(pSwapchainImageCount), memAddressSafe(pSwapchainImages));
	}

	/** Alternative version of: {@link #vkGetSwapchainImagesKHR GetSwapchainImagesKHR} */
	public static int vkGetSwapchainImagesKHR(VkDevice device, long swapchain, IntBuffer pSwapchainImageCount, LongBuffer pSwapchainImages) {
		if ( CHECKS ) {
			checkBuffer(pSwapchainImageCount, 1);
			if ( pSwapchainImages != null ) checkBuffer(pSwapchainImages, pSwapchainImageCount.get(pSwapchainImageCount.position()));
		}
		return nvkGetSwapchainImagesKHR(device, swapchain, memAddress(pSwapchainImageCount), memAddressSafe(pSwapchainImages));
	}

	// --- [ vkAcquireNextImageKHR ] ---

	/** Unsafe version of {@link #vkAcquireNextImageKHR AcquireNextImageKHR} */
	@JavadocExclude
	public static int nvkAcquireNextImageKHR(VkDevice device, long swapchain, long timeout, long semaphore, long fence, long pImageIndex) {
		long __functionAddress = getInstance(device).AcquireNextImageKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJJJJPI(__functionAddress, device.address(), swapchain, timeout, semaphore, fence, pImageIndex);
	}

	/**
	 * Retrieves the index of the next available presentable image.
	 *
	 * @param device      the {@code VkDevice} associated with the swapchain
	 * @param swapchain   the swapchain from which an image is being acquired
	 * @param timeout     indicates how long the function waits, in nanoseconds
	 * @param semaphore   a {@code VkSemaphore} that will become signaled when the presentation engine has released ownership of the image
	 * @param fence       a {@code VkFence} that will become signaled when the presentation engine has released ownership of the image
	 * @param pImageIndex a pointer to an integer that is set to the index of the next image to use
	 */
	public static int vkAcquireNextImageKHR(VkDevice device, long swapchain, long timeout, long semaphore, long fence, ByteBuffer pImageIndex) {
		if ( CHECKS )
			checkBuffer(pImageIndex, 1 << 2);
		return nvkAcquireNextImageKHR(device, swapchain, timeout, semaphore, fence, memAddress(pImageIndex));
	}

	/** Alternative version of: {@link #vkAcquireNextImageKHR AcquireNextImageKHR} */
	public static int vkAcquireNextImageKHR(VkDevice device, long swapchain, long timeout, long semaphore, long fence, IntBuffer pImageIndex) {
		if ( CHECKS )
			checkBuffer(pImageIndex, 1);
		return nvkAcquireNextImageKHR(device, swapchain, timeout, semaphore, fence, memAddress(pImageIndex));
	}

	// --- [ vkQueuePresentKHR ] ---

	/** Unsafe version of {@link #vkQueuePresentKHR QueuePresentKHR} */
	@JavadocExclude
	public static int nvkQueuePresentKHR(VkQueue queue, long pPresentInfo) {
		long __functionAddress = getInstance(queue).QueuePresentKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPI(__functionAddress, queue.address(), pPresentInfo);
	}

	/**
	 * Queues an image for presentation.
	 *
	 * @param queue        a {@code VkQueue} that is capable of presentation to the target surface
	 * @param pPresentInfo a pointer to a {@link VkPresentInfoKHR} structure specifying the parameters of the presentation
	 */
	public static int vkQueuePresentKHR(VkQueue queue, VkPresentInfoKHR pPresentInfo) {
		return nvkQueuePresentKHR(queue, pPresentInfo.address());
	}

}