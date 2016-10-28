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

/** The {@code VK_KHR_swapchain} extension is the device-level companion to the {@code VK_KHR_surface} extension. It introduces {@code VkSwapchainKHR} objects, which provide the ability to present rendering results to a surface. */
public class KHRSwapchain {

	/** The extension specification version. */
	public static final int VK_KHR_SWAPCHAIN_SPEC_VERSION = 68;

	/** The extension name. */
	public static final String VK_KHR_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_swapchain";

	/**
	 * Extends {@code VkStructureType}.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PRESENT_INFO_KHR STRUCTURE_TYPE_PRESENT_INFO_KHR}</li>
	 * </ul>
	 */
	public static final int
		VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR = 1000001000,
		VK_STRUCTURE_TYPE_PRESENT_INFO_KHR          = 1000001001;

	/** Extends {@code VkImageLayout}. */
	public static final int VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = 1000001002;

	/**
	 * Extends {@code VkResult}.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}</li>
	 * </ul>
	 */
	public static final int
		VK_SUBOPTIMAL_KHR        = 1000001003,
		VK_ERROR_OUT_OF_DATE_KHR = -1000001004;

	protected KHRSwapchain() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilities caps) {
		return checkFunctions(
			caps.vkCreateSwapchainKHR, caps.vkDestroySwapchainKHR, caps.vkGetSwapchainImagesKHR, caps.vkAcquireNextImageKHR, caps.vkQueuePresentKHR
		);
	}

	// --- [ vkCreateSwapchainKHR ] ---

	/** Unsafe version of: {@link #vkCreateSwapchainKHR CreateSwapchainKHR} */
	public static int nvkCreateSwapchainKHR(VkDevice device, long pCreateInfo, long pAllocator, long pSwapchain) {
		long __functionAddress = device.getCapabilities().vkCreateSwapchainKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkSwapchainCreateInfoKHR.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pSwapchain);
	}

	/**
	 * Create a swapchain.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create a swapchain, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateSwapchainKHR(
    VkDevice                                    device,
    const VkSwapchainCreateInfoKHR*             pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkSwapchainKHR*                             pSwapchain);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkSwapchainCreateInfoKHR} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pSwapchain} <b>must</b> be a pointer to a {@code VkSwapchainKHR} handle</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pCreateInfo.surface} <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pCreateInfo.oldSwapchain} <b>must</b> be externally synchronized</li>
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
	 * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
	 * <li>{@link KHRSurface#VK_ERROR_NATIVE_WINDOW_IN_USE_KHR ERROR_NATIVE_WINDOW_IN_USE_KHR}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}, {@link VkSwapchainCreateInfoKHR}</p>
	 *
	 * @param device      the device to create the swapchain for.
	 * @param pCreateInfo a pointer to an instance of the {@link VkSwapchainCreateInfoKHR} structure specifying the parameters of the created swapchain.
	 * @param pAllocator  the allocator used for host memory allocated for the swapchain object when there is no more specific allocator available (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a>).
	 * @param pSwapchain  a pointer to a {@code VkSwapchainKHR} handle in which the created swapchain object will be returned.
	 */
	public static int vkCreateSwapchainKHR(VkDevice device, VkSwapchainCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSwapchain) {
		if ( CHECKS )
			checkBuffer(pSwapchain, 1);
		return nvkCreateSwapchainKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSwapchain));
	}

	// --- [ vkDestroySwapchainKHR ] ---

	/** Unsafe version of: {@link #vkDestroySwapchainKHR DestroySwapchainKHR} */
	public static void nvkDestroySwapchainKHR(VkDevice device, long swapchain, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroySwapchainKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), swapchain, pAllocator);
	}

	/**
	 * Destroy a swapchain object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy a swapchain object call:</p>
	 * 
	 * <pre><code>void vkDestroySwapchainKHR(
    VkDevice                                    device,
    VkSwapchainKHR                              swapchain,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@code swapchain} and all associated {@code VkImage} handles are destroyed, and <b>must</b> not be acquired or used any more by the application. The memory of each {@code VkImage} will only be freed after that image is no longer used by the platform. For example, if one image of the swapchain is being displayed in a window, the memory for that image <b>may</b> not be freed until the window is destroyed, or another swapchain is created for the window. Destroying the swapchain does not invalidate the parent {@code VkSurfaceKHR}, and a new swapchain <b>can</b> be created with it.</p>
	 * 
	 * <p>If a swapchain associated with a display surface is destroyed and there are no valid descendants of that swapchain, the implementation <b>must</b> either revert any display resources modified by presenting images with the swapchain to their state prior to the first present performed with the swapchain and its ancestors, or leave such resources in their current state.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All uses of presentable images acquired from {@code swapchain} <b>must</b> have completed execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code swapchain} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code swapchain} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code swapchain} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device     the {@code VkDevice} associated with {@code swapchain}.
	 * @param swapchain  the swapchain to destroy.
	 * @param pAllocator the allocator used for host memory allocated for the swapchain object when there is no more specific allocator available (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a>).
	 */
	public static void vkDestroySwapchainKHR(VkDevice device, long swapchain, VkAllocationCallbacks pAllocator) {
		nvkDestroySwapchainKHR(device, swapchain, memAddressSafe(pAllocator));
	}

	// --- [ vkGetSwapchainImagesKHR ] ---

	/**
	 * Unsafe version of: {@link #vkGetSwapchainImagesKHR GetSwapchainImagesKHR}
	 *
	 * @param pSwapchainImageCount a pointer to an integer related to the number of swapchain images available or queried, as described below.
	 */
	public static int nvkGetSwapchainImagesKHR(VkDevice device, long swapchain, long pSwapchainImageCount, long pSwapchainImages) {
		long __functionAddress = device.getCapabilities().vkGetSwapchainImagesKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJPPI(__functionAddress, device.address(), swapchain, pSwapchainImageCount, pSwapchainImages);
	}

	/**
	 * Obtain the array of presentable images associated with a swapchain.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To obtain the array of presentable images associated with a swapchain, call:</p>
	 * 
	 * <pre><code>VkResult vkGetSwapchainImagesKHR(
    VkDevice                                    device,
    VkSwapchainKHR                              swapchain,
    uint32_t*                                   pSwapchainImageCount,
    VkImage*                                    pSwapchainImages);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>If {@code pSwapchainImages} is {@code NULL}, then the number of presentable images for {@code swapchain} is returned in {@code pSwapchainImageCount}. Otherwise, {@code pSwapchainImageCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSwapchainImages} array, and on return the variable is overwritten with the number of structures actually written to {@code pSwapchainImages}. If the value of {@code pSwapchainImageCount} is less than the number of presentable images for {@code swapchain}, at most {@code pSwapchainImageCount} structures will be written. If {@code pSwapchainImageCount} is smaller than the number of presentable images for {@code swapchain}, {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS} to indicate that not all the available values were returned.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
	 * <li>{@code pSwapchainImageCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pSwapchainImageCount} is not 0, and {@code pSwapchainImages} is not {@code NULL}, {@code pSwapchainImages} <b>must</b> be a pointer to an array of {@code pSwapchainImageCount} {@code VkImage} handles</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
	 * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device               the device associated with {@code swapchain}.
	 * @param swapchain            the swapchain to query.
	 * @param pSwapchainImageCount a pointer to an integer related to the number of swapchain images available or queried, as described below.
	 * @param pSwapchainImages     either {@code NULL} or a pointer to an array of {@code VkImage} handles.
	 */
	public static int vkGetSwapchainImagesKHR(VkDevice device, long swapchain, IntBuffer pSwapchainImageCount, LongBuffer pSwapchainImages) {
		if ( CHECKS ) {
			checkBuffer(pSwapchainImageCount, 1);
			checkBufferSafe(pSwapchainImages, pSwapchainImageCount.get(pSwapchainImageCount.position()));
		}
		return nvkGetSwapchainImagesKHR(device, swapchain, memAddress(pSwapchainImageCount), memAddressSafe(pSwapchainImages));
	}

	// --- [ vkAcquireNextImageKHR ] ---

	/** Unsafe version of: {@link #vkAcquireNextImageKHR AcquireNextImageKHR} */
	public static int nvkAcquireNextImageKHR(VkDevice device, long swapchain, long timeout, long semaphore, long fence, long pImageIndex) {
		long __functionAddress = device.getCapabilities().vkAcquireNextImageKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJJJJPI(__functionAddress, device.address(), swapchain, timeout, semaphore, fence, pImageIndex);
	}

	/**
	 * Retrieve the index of the next available presentable image.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To acquire an available presentable image to use, and retrieve the index of that image, call:</p>
	 * 
	 * <pre><code>VkResult vkAcquireNextImageKHR(
    VkDevice                                    device,
    VkSwapchainKHR                              swapchain,
    uint64_t                                    timeout,
    VkSemaphore                                 semaphore,
    VkFence                                     fence,
    uint32_t*                                   pImageIndex);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> be unsignaled</li>
	 * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> be unsignaled and <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
	 * <li>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
	 * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>{@code pImageIndex} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If {@code semaphore} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * <li>If {@code fence} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
	 * <li>{@link VK10#VK_TIMEOUT TIMEOUT}</li>
	 * <li>{@link VK10#VK_NOT_READY NOT_READY}</li>
	 * <li>{@link #VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}</li>
	 * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
	 * </ul></dd>
	 * </dl>
	 *
	 * @param device      the device associated with {@code swapchain}.
	 * @param swapchain   the swapchain from which an image is being acquired.
	 * @param timeout     indicates how long the function waits, in nanoseconds, if no image is available.
	 * @param semaphore   {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a semaphore to signal.
	 * @param fence       {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a fence to signal.
	 * @param pImageIndex a pointer to a {@code uint32_t} that is set to the index of the next image to use (i.e. an index into the array of images returned by {@link #vkGetSwapchainImagesKHR GetSwapchainImagesKHR}).
	 */
	public static int vkAcquireNextImageKHR(VkDevice device, long swapchain, long timeout, long semaphore, long fence, IntBuffer pImageIndex) {
		if ( CHECKS )
			checkBuffer(pImageIndex, 1);
		return nvkAcquireNextImageKHR(device, swapchain, timeout, semaphore, fence, memAddress(pImageIndex));
	}

	// --- [ vkQueuePresentKHR ] ---

	/** Unsafe version of: {@link #vkQueuePresentKHR QueuePresentKHR} */
	public static int nvkQueuePresentKHR(VkQueue queue, long pPresentInfo) {
		long __functionAddress = queue.getCapabilities().vkQueuePresentKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkPresentInfoKHR.validate(pPresentInfo);
		}
		return callPPI(__functionAddress, queue.address(), pPresentInfo);
	}

	/**
	 * Queue an image for presentation.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>After queueing all rendering commands and transitioning the image to the correct layout, to queue an image for presentation, call:</p>
	 * 
	 * <pre><code>VkResult vkQueuePresentKHR(
    VkQueue                                     queue,
    const VkPresentInfoKHR*                     pPresentInfo);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>Any given element of {@code pSwapchains} member of {@code pPresentInfo} <b>must</b> be a swapchain that is created for a surface for which presentation is supported from {@code queue} as determined using a call to {@link KHRSurface#vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR}</li>
	 * <li>If more than one member of {@code pSwapchains} was created from a display surface, all display surfaces referenced that refer to the same display <b>must</b> use the same display mode</li>
	 * </ul>
	 * 
	 * <p>Any writes to memory backing the images referenced by the {@code pImageIndices} and {@code pSwapchains} members of {@code pPresentInfo}, that are available before flink:VkQueuePresentKHR is executed, are automatically made visible to the read access performed by the presentation engine. This automatic visibility operation for an image happens-after the semaphore signal operation, and happens-before the presentation engine accesses the image.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * <li>{@code pPresentInfo} <b>must</b> be a pointer to a valid {@link VkPresentInfoKHR} structure</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pPresentInfo.pWaitSemaphores}[] <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pPresentInfo.pSwapchains}[] <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>-</td><td>-</td><td>Any</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
	 * <li>{@link #VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
	 * <li>{@link #VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}</li>
	 * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPresentInfoKHR}</p>
	 *
	 * @param queue        a queue that is capable of presentation to the target surface&#8217;s platform on the same device as the image&#8217;s swapchain.
	 * @param pPresentInfo a pointer to an instance of the {@link VkPresentInfoKHR} structure specifying the parameters of the presentation.
	 */
	public static int vkQueuePresentKHR(VkQueue queue, VkPresentInfoKHR pPresentInfo) {
		return nvkQueuePresentKHR(queue, pPresentInfo.address());
	}

	/** Array version of: {@link #vkCreateSwapchainKHR CreateSwapchainKHR} */
	public static int vkCreateSwapchainKHR(VkDevice device, VkSwapchainCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, long[] pSwapchain) {
		long __functionAddress = device.getCapabilities().vkCreateSwapchainKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pSwapchain, 1);
			VkSwapchainCreateInfoKHR.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSwapchain);
	}

	/** Array version of: {@link #vkGetSwapchainImagesKHR GetSwapchainImagesKHR} */
	public static int vkGetSwapchainImagesKHR(VkDevice device, long swapchain, int[] pSwapchainImageCount, long[] pSwapchainImages) {
		long __functionAddress = device.getCapabilities().vkGetSwapchainImagesKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pSwapchainImageCount, 1);
			checkBufferSafe(pSwapchainImages, pSwapchainImageCount[0]);
		}
		return callPJPPI(__functionAddress, device.address(), swapchain, pSwapchainImageCount, pSwapchainImages);
	}

	/** Array version of: {@link #vkAcquireNextImageKHR AcquireNextImageKHR} */
	public static int vkAcquireNextImageKHR(VkDevice device, long swapchain, long timeout, long semaphore, long fence, int[] pImageIndex) {
		long __functionAddress = device.getCapabilities().vkAcquireNextImageKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pImageIndex, 1);
		}
		return callPJJJJPI(__functionAddress, device.address(), swapchain, timeout, semaphore, fence, pImageIndex);
	}

}