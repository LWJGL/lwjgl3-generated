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
		CreateSwapchainKHR = checkFunctionAddress(provider.getFunctionAddress("vkCreateSwapchainKHR"));
		DestroySwapchainKHR = checkFunctionAddress(provider.getFunctionAddress("vkDestroySwapchainKHR"));
		GetSwapchainImagesKHR = checkFunctionAddress(provider.getFunctionAddress("vkGetSwapchainImagesKHR"));
		AcquireNextImageKHR = checkFunctionAddress(provider.getFunctionAddress("vkAcquireNextImageKHR"));
		QueuePresentKHR = checkFunctionAddress(provider.getFunctionAddress("vkQueuePresentKHR"));
	}

	// --- [ Function Addresses ] ---

	private static final KHRSwapchain instance = new KHRSwapchain(getLibrary());

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return VK10.getLibrary();
	}

	/** Returns the {@link KHRSwapchain} instance. */
	public static KHRSwapchain getInstance() {
		return instance;
	}

	// --- [ vkCreateSwapchainKHR ] ---

	/** Unsafe version of {@link #vkCreateSwapchainKHR CreateSwapchainKHR} */
	@JavadocExclude
	public static int nvkCreateSwapchainKHR(long device, long pCreateInfo, long pAllocator, long pSwapchain) {
		long __functionAddress = getInstance().CreateSwapchainKHR;
		if ( CHECKS )
			checkPointer(device);
		return callPPPPI(__functionAddress, device, pCreateInfo, pAllocator, pSwapchain);
	}

	/**
	 * Creates a swapchain.
	 *
	 * @param device      the VkDevice to associate the swapchain
	 * @param pCreateInfo a pointer to an instance of the {@link VkSwapchainCreateInfoKHR} structure containing the parameters affecting the creation of the swapchain object
	 * @param pAllocator  the allocator used for host memory allocated for the surface object
	 * @param pSwapchain  the resulting swapchain
	 */
	public static int vkCreateSwapchainKHR(long device, VkSwapchainCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pSwapchain) {
		if ( CHECKS )
			checkBuffer(pSwapchain, 1 << POINTER_SHIFT);
		return nvkCreateSwapchainKHR(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSwapchain));
	}

	/** Alternative version of: {@link #vkCreateSwapchainKHR CreateSwapchainKHR} */
	public static int vkCreateSwapchainKHR(long device, VkSwapchainCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, PointerBuffer pSwapchain) {
		if ( CHECKS )
			checkBuffer(pSwapchain, 1);
		return nvkCreateSwapchainKHR(device, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSwapchain));
	}

	// --- [ vkDestroySwapchainKHR ] ---

	/** Unsafe version of {@link #vkDestroySwapchainKHR DestroySwapchainKHR} */
	@JavadocExclude
	public static void nvkDestroySwapchainKHR(long device, long swapchain, long pAllocator) {
		long __functionAddress = getInstance().DestroySwapchainKHR;
		if ( CHECKS )
			checkPointer(device);
		callPPPV(__functionAddress, device, swapchain, pAllocator);
	}

	/**
	 * Destroys a swapchain object.
	 *
	 * @param device     the {@code VkDevice} associated with the swapchain
	 * @param swapchain  the swapchain to destroy
	 * @param pAllocator the allocator used for host memory allocated for the swapchain object
	 */
	public static void vkDestroySwapchainKHR(long device, long swapchain, VkAllocationCallbacks pAllocator) {
		nvkDestroySwapchainKHR(device, swapchain, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetSwapchainImagesKHR ] ---

	/** Unsafe version of {@link #vkGetSwapchainImagesKHR GetSwapchainImagesKHR} */
	@JavadocExclude
	public static int nvkGetSwapchainImagesKHR(long device, long swapchain, long pSwapchainImageCount, long pSwapchainImages) {
		long __functionAddress = getInstance().GetSwapchainImagesKHR;
		if ( CHECKS ) {
			checkPointer(device);
			checkPointer(swapchain);
		}
		return callPPPPI(__functionAddress, device, swapchain, pSwapchainImageCount, pSwapchainImages);
	}

	/**
	 * Obtains the array of presentable images associated with a swapchain.
	 *
	 * @param device               the {@code VkDevice} associated with swapchain
	 * @param swapchain            the swapchain
	 * @param pSwapchainImageCount the number of elements in the array pointed by {@code pSwapchainImages}
	 * @param pSwapchainImages     the returned array of images
	 */
	public static int vkGetSwapchainImagesKHR(long device, long swapchain, ByteBuffer pSwapchainImageCount, ByteBuffer pSwapchainImages) {
		if ( CHECKS ) {
			checkBuffer(pSwapchainImageCount, 1 << 2);
			if ( pSwapchainImages != null ) checkBuffer(pSwapchainImages, pSwapchainImageCount.getInt(pSwapchainImageCount.position()) << POINTER_SHIFT);
		}
		return nvkGetSwapchainImagesKHR(device, swapchain, memAddress(pSwapchainImageCount), memAddressSafe(pSwapchainImages));
	}

	/** Alternative version of: {@link #vkGetSwapchainImagesKHR GetSwapchainImagesKHR} */
	public static int vkGetSwapchainImagesKHR(long device, long swapchain, IntBuffer pSwapchainImageCount, PointerBuffer pSwapchainImages) {
		if ( CHECKS ) {
			checkBuffer(pSwapchainImageCount, 1);
			if ( pSwapchainImages != null ) checkBuffer(pSwapchainImages, pSwapchainImageCount.get(pSwapchainImageCount.position()));
		}
		return nvkGetSwapchainImagesKHR(device, swapchain, memAddress(pSwapchainImageCount), memAddressSafe(pSwapchainImages));
	}

	// --- [ vkAcquireNextImageKHR ] ---

	/** Unsafe version of {@link #vkAcquireNextImageKHR AcquireNextImageKHR} */
	@JavadocExclude
	public static int nvkAcquireNextImageKHR(long device, long swapchain, long timeout, long semaphore, long fence, long pImageIndex) {
		long __functionAddress = getInstance().AcquireNextImageKHR;
		if ( CHECKS ) {
			checkPointer(device);
			checkPointer(swapchain);
			checkPointer(semaphore);
			checkPointer(fence);
		}
		return callPPJPPPI(__functionAddress, device, swapchain, timeout, semaphore, fence, pImageIndex);
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
	public static int vkAcquireNextImageKHR(long device, long swapchain, long timeout, long semaphore, long fence, ByteBuffer pImageIndex) {
		if ( CHECKS )
			checkBuffer(pImageIndex, 1 << 2);
		return nvkAcquireNextImageKHR(device, swapchain, timeout, semaphore, fence, memAddress(pImageIndex));
	}

	/** Alternative version of: {@link #vkAcquireNextImageKHR AcquireNextImageKHR} */
	public static int vkAcquireNextImageKHR(long device, long swapchain, long timeout, long semaphore, long fence, IntBuffer pImageIndex) {
		if ( CHECKS )
			checkBuffer(pImageIndex, 1);
		return nvkAcquireNextImageKHR(device, swapchain, timeout, semaphore, fence, memAddress(pImageIndex));
	}

	// --- [ vkQueuePresentKHR ] ---

	/** Unsafe version of {@link #vkQueuePresentKHR QueuePresentKHR} */
	@JavadocExclude
	public static int nvkQueuePresentKHR(long queue, long pPresentInfo) {
		long __functionAddress = getInstance().QueuePresentKHR;
		if ( CHECKS )
			checkPointer(queue);
		return callPPI(__functionAddress, queue, pPresentInfo);
	}

	/**
	 * Queues an image for presentation.
	 *
	 * @param queue        a {@code VkQueue} that is capable of presentation to the target surface
	 * @param pPresentInfo a pointer to a {@link VkPresentInfoKHR} structure specifying the parameters of the presentation
	 */
	public static int vkQueuePresentKHR(long queue, VkPresentInfoKHR pPresentInfo) {
		return nvkQueuePresentKHR(queue, pPresentInfo.address());
	}

}