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
	public static final int VK_KHR_SWAPCHAIN_SPEC_VERSION = 67;

	/** The extension name. */
	public static final String VK_KHR_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_swapchain";

	/** VkStructureType */
	public static final int
		VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR = 1000001000,
		VK_STRUCTURE_TYPE_PRESENT_INFO_KHR          = 1000001001;

	/**
	 * <b>must</b> only be used for presenting a swapchain image for display. A swapchain’s image <b>must</b> be transitioned to this layout before calling
	 * {@link #vkQueuePresentKHR QueuePresentKHR}, and <b>must</b> be transitioned away from this layout after calling {@link #vkAcquireNextImageKHR AcquireNextImageKHR}.
	 */
	public static final int VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = 1000001002;

	/** A swapchain no longer matches the surface properties exactly, but <b>can</b> still be used to present to the surface successfully. */
	public static final int VK_SUBOPTIMAL_KHR = 1000001003;

	/**
	 * A surface has changed in such a way that it is no longer compatible with the swapchain, and further presentation requests using the swapchain will
	 * fail. Applications <b>must</b> query the new surface properties and recreate their swapchain if they wish to continue presenting to the surface.
	 */
	public static final int VK_ERROR_OUT_OF_DATE_KHR = -1000001004;

	protected KHRSwapchain() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilities caps) {
		return checkFunctions(
			caps.vkCreateSwapchainKHR, caps.vkDestroySwapchainKHR, caps.vkGetSwapchainImagesKHR, caps.vkAcquireNextImageKHR, caps.vkQueuePresentKHR
		);
	}

	// --- [ vkCreateSwapchainKHR ] ---

	/** Unsafe version of {@link #vkCreateSwapchainKHR CreateSwapchainKHR} */
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
	 * Creates a swapchain.
	 * 
	 * <p>A {@code VkSwapchainKHR} object (a.k.a. swapchain) provides the ability to present rendering results to a surface. A swapchain is an abstraction for an
	 * array of presentable images that are associated with a surface. The swapchain images are represented by {@code VkImage} objects created by the
	 * platform. One image (which <b>can</b> be an array image for multiview/stereoscopic-3D surfaces) is displayed at a time, but multiple images <b>can</b> be queued
	 * for presentation. An application renders to the image, and then queues the image for presentation to the surface. A native window <b>cannot</b> be associated
	 * with more than one swapchain at a time. Further, swapchains <b>cannot</b> be created for native windows that have a non-Vulkan graphics API surface
	 * associated with them.</p>
	 * 
	 * <p>The presentation engine is an abstraction for the platform’s compositor or hardware/software display engine.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>Some implementations may use the device’s graphics queue or dedicated presentation hardware to perform presentation.</p>
	 * </div>
	 * 
	 * <p>The presentable images of a swapchain are always owned by either the application or the presentation engine, and never both simultaneously.
	 * Applications <b>must not</b> access the presentable image when they do not own the image.</p>
	 * 
	 * <h5>Valid Usage</h5>
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
	 * <li>Host access to {@code pCreateInfo}.surface <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pCreateInfo}.oldSwapchain <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>If {@code vkCreateSwapchainKHR} succeeds, it will return a handle to a swapchain that contains an array of at least {@code minImageCount} presentable
	 * images.</p>
	 * 
	 * <p>When a swapchain is created, all its associated presentable images are owned by the presentation engine targeted by the swapchain. The presentation
	 * engine controls the order in which presentable images are available for use by the application.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>This allows the platform to handle situations which require out-of-order return of images after presentation. At the same time, it allows the
	 * application to generate command buffers referencing all of the images in the swapchain at initialization time, rather than in its main loop.</p>
	 * </div>
	 * 
	 * <p>The {@code VkSurfaceKHR} associated with a swapchain <b>must not</b> be destroyed until after the swapchain is destroyed.</p>
	 * 
	 * <p>Like core functions, several WSI fuctions, including {@code vkCreateSwapchainKHR} return {@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST} if the logical device was lost. As with
	 * most core objects, {@code VkSwapchainKHR} is a child of the device and is affected by the lost state; it <b>must</b> be destroyed before destroying the
	 * {@code VkDevice}. However, {@code VkSurfaceKHR} is not a child of any {@code VkDevice} and is not otherwise affected by the lost device. After
	 * successfully recreating a {@code VkDevice}, the same {@code VkSurfaceKHR} <b>can</b> be used to create a new {@code VkSwapchainKHR}, provided the previous one
	 * was destroyed.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>After a lost device event, the {@code VkPhysicalDevice} <b>may</b> also be lost. If other {@code VkPhysicalDevice} are available, they <b>can</b> be used
	 * together with the same {@code VkSurfaceKHR} to create the new {@code VkSwapchainKHR}, however the application <b>must</b> query the surface capabilities
	 * again, because they <b>may</b> differ on a per-physical device basis.</p>
	 * </div>
	 *
	 * @param device      the device to create the swapchain for
	 * @param pCreateInfo a pointer to an instance of the {@link VkSwapchainCreateInfoKHR} structure specifying the parameters of the created swapchain
	 * @param pAllocator  controls host memory allocation
	 * @param pSwapchain  a pointer to a {@code VkSwapchainKHR} handle in which the created swapchain object will be returned
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
	public static void nvkDestroySwapchainKHR(VkDevice device, long swapchain, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroySwapchainKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), swapchain, pAllocator);
	}

	/**
	 * Destroys a swapchain object.
	 * 
	 * <p>{@code swapchain} and all associated {@code VkImage} handles are destroyed, and <b>must not</b> be owned or used any more by the application. The memory of
	 * each {@code VkImage} will only be freed after that image is no longer used by the platform. For example, if one image of the swapchain is being
	 * displayed in a window, the memory for that image may not be freed until the window is destroyed, or another swapchain is created for the window.
	 * Destroying the swapchain does not invalidate the parent {@code VkSurfaceKHR}, and a new swapchain can be created with it.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>If {@code swapchain} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>Each of {@code swapchain} and {@code device} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
	 * {@code VkInstance}</li>
	 * <li>All uses of presentable images acquired from {@code swapchain} and owned by the application <b>must</b> have completed execution</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code swapchain} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code swapchain} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device     the {@code VkDevice} associated with the swapchain
	 * @param swapchain  the swapchain to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroySwapchainKHR(VkDevice device, long swapchain, VkAllocationCallbacks pAllocator) {
		nvkDestroySwapchainKHR(device, swapchain, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetSwapchainImagesKHR ] ---

	/** Unsafe version of {@link #vkGetSwapchainImagesKHR GetSwapchainImagesKHR} */
	public static int nvkGetSwapchainImagesKHR(VkDevice device, long swapchain, long pSwapchainImageCount, long pSwapchainImages) {
		long __functionAddress = device.getCapabilities().vkGetSwapchainImagesKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJPPI(__functionAddress, device.address(), swapchain, pSwapchainImageCount, pSwapchainImages);
	}

	/**
	 * Obtains the array of presentable images associated with a swapchain.
	 * 
	 * <p>If {@code pSwapchainImages} is {@code NULL}, then the number of presentable images for swapchain is returned in {@code pSwapchainImageCount}. Otherwise,
	 * {@code pSwapchainImageCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSwapchainImages} array, and on return
	 * the variable is overwritten with the number of structures actually written to {@code pSwapchainImages}. If the value of {@code pSwapchainImageCount} is
	 * less than the number of presentable images for swapchain, at most {@code pSwapchainImageCount} structures will be written.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
	 * <li>{@code pSwapchainImageCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pSwapchainImageCount} is not 0, and {@code pSwapchainImages} is not {@code NULL}, {@code pSwapchainImages} <b>must</b> be a
	 * pointer to an array of {@code pSwapchainImageCount} {@code VkImage} handles</li>
	 * <li>Each of {@code swapchain} and {@code device} <b>must</b> have been created, allocated or retrieved from the same {@code VkInstance}</li>
	 * </ul>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>By knowing all presentable images used in the swapchain, the application <b>can</b> create command buffers that reference these images prior to entering
	 * its main rendering loop.</p>
	 * </div>
	 * 
	 * <p>The implementation will have already allocated and bound the memory backing the {@code VkImages} returned by {@code vkGetSwapchainImagesKHR}. The
	 * memory for each image will not alias with the memory for other images or with any {@code VkDeviceMemory} object. As such, performing any operation
	 * affecting the binding of memory to a presentable image results in undefined behavior. All presentable images are initially in the
	 * {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} layout, thus before using presentable images, the application must transition them to a valid layout for the intended use.</p>
	 * 
	 * <p>Further, the lifetime of presentable images is controlled by the implementation so destroying a presentable image with {@link VK10#vkDestroyImage DestroyImage} results in
	 * undefined behavior. See {@link #vkDestroySwapchainKHR DestroySwapchainKHR} for further details on the lifetime of presentable images.</p>
	 *
	 * @param device               the device associated with {@code swapchain}
	 * @param swapchain            the swapchain to query
	 * @param pSwapchainImageCount a pointer to an integer related to the number of format pairs available or queried
	 * @param pSwapchainImages     either {@code NULL} or a pointer to an array of {@code VkSwapchainImageKHR} structures
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
	public static int nvkAcquireNextImageKHR(VkDevice device, long swapchain, long timeout, long semaphore, long fence, long pImageIndex) {
		long __functionAddress = device.getCapabilities().vkAcquireNextImageKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJJJJPI(__functionAddress, device.address(), swapchain, timeout, semaphore, fence, pImageIndex);
	}

	/**
	 * Retrieves the index of the next available presentable image.
	 * 
	 * <p>If {@code timeout} is 0, {@code vkAcquireNextImageKHR} will not block, but will either succeed or return an error. If {@code timeout} is
	 * {@code UINT64_MAX}, the function will not return until the presentation engine will be able to release ownership of the image within finite time. For
	 * example, if the presentation engine owns only the image currently being displayed and no other images are presented, {@code vkAcquireNextImageKHR} <b>may</b>
	 * block indefinitely. Other values for {@code timeout} will cause the function to return when an image becomes available, or when the specified number of
	 * nanoseconds have passed (in which case it will return an error).</p>
	 * 
	 * <p>The presentation engine controls the order in which presentable images are made available to the application. This allows the platform to handle
	 * special situations, and not always give ownership of images in the same order as it previously did. If the swapchain has enough presentable images,
	 * applications <b>can</b> acquire ownership of multiple images before presenting any, and then present them in a different order in which they were acquired.</p>
	 * 
	 * <p>{@code vkAcquireNextImageKHR} <b>may</b> not block, and applications <b>cannot</b> rely on blocking in order to meter their rendering speed.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>For example, if an error occurs, {@code vkAcquireNextImageKHR} <b>may</b> return even though no image is available. As another example, some presentation
	 * engines are able to enqueue an unbounded number of presentation and acquire next image operations such that {@code vkAcquireNextImageKHR} never
	 * needs to wait for completion of outstanding present operations before returning.</p>
	 * </div>
	 * 
	 * <p>The availability of presentable images is influenced by factors such as the implementation of the presentation engine, the {@code VkPresentModeKHR}
	 * being used, the number of images in the swapchain, the number of images that the application owns at any given time, and the performance of the
	 * application. The value of {@link VkSurfaceCapabilitiesKHR}{@code ::minImageCount} indicates how many images <b>must</b> be in the swapchain in order for
	 * {@code vkAcquireNextImageKHR} to return an image in finite time if the application currently doesn’t own an image.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>For example, if the {@code minImageCount} member of {@link VkSurfaceCapabilitiesKHR} is 2, and the application wishes to use
	 * {@link KHRSurface#VK_PRESENT_MODE_FIFO_KHR PRESENT_MODE_FIFO_KHR} and maintain ownership of up to 3 presentable images simultaneously, it <b>must</b> request a minimum image count of 4
	 * when creating the swapchain. That will allow a presentable image to always become available in finite time (e.g. the image currently being
	 * displayed) as long as the number of images the application owns prior to the {@code vkAcquireNextImageKHR} call is less than 3. If we modify this
	 * example, so that the application creates a swapchain on the same surface, but with 5 images and a presentMode of
	 * {@link KHRSurface#VK_PRESENT_MODE_MAILBOX_KHR PRESENT_MODE_MAILBOX_KHR}, a presentable image will always be available in zero time (i.e. {@code vkAcquireNextImageKHR} will never
	 * block).</p>
	 * </div>
	 * 
	 * <p>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the semaphore <b>must</b> be unsignaled and not have any uncompleted signal or wait operations pending. It will
	 * become signaled when the presentation engine has released ownership of the image, and the device may modify its contents. Queue operations that access
	 * the image contents <b>must</b> wait until the semaphore signals; typically applications <b>should</b> include the semaphore in the {@code pWaitSemaphores} list for
	 * the queue submission that transitions the image away from the {@link #VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR} layout. Use of the semaphore allows rendering operations to
	 * be recorded and submitted before the presentation engine releases ownership.</p>
	 * 
	 * <p>If {@code fence} is not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the fence <b>must</b> be unsignaled and not have any uncompleted signal operations pending. It will become
	 * signaled when the presentation engine has released ownership of the image. Applications <b>can</b> use this to meter their frame generation work to match the
	 * presentation rate.</p>
	 * 
	 * <p>{@code semaphore} and {@code fence} <b>may</b> already be signaled when {@code vkAcquireNextImageKHR} returns, if the image is being acquired for the first
	 * time, or if the presentation engine has already released its ownership.</p>
	 * 
	 * <p>A successful call to {@code vkAcquireNextImageKHR} counts as a signal operation on semaphore for the purposes of queue forward-progress requirements.
	 * The semaphore is guaranteed to signal, so a wait operation <b>can</b> be queued for the semaphore without risk of deadlock.</p>
	 * 
	 * <p>The {@link VK10#vkCmdWaitEvents CmdWaitEvents} or {@link VK10#vkCmdPipelineBarrier CmdPipelineBarrier} used to transition the image away from {@link #VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR} layout <b>must</b> have
	 * {@code dstStageMask} and {@code dstAccessMask} parameters set based on the next use of the image. The {@code srcAccessMask} <b>must</b> include
	 * {@link VK10#VK_ACCESS_MEMORY_READ_BIT ACCESS_MEMORY_READ_BIT} to ensure that all prior reads by the presentation engine are complete before the image layout transition occurs. The
	 * application <b>must</b> use implicit ordering guarantees and execution dependencies to prevent the image transition from occurring before the semaphore
	 * passed to {@code vkAcquireNextImageKHR} has signaled.</p>
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>When the swapchain image will be written by some stage {@code S}, the recommended idiom for ensuring the semaphore signals before the transition
	 * occurs is:</p>
	 * 
	 * <ul>
	 * <li>The batch that contains the transition includes the image-acquire semaphore in the list of semaphores to wait for, with a wait stage mask that
	 * includes {@code S}.</li>
	 * <li>The pipeline barrier that performs the transition includes {@code S} in both the {@code srcStageMask} and {@code dstStageMask}.</li>
	 * </ul>
	 * 
	 * <p>This causes the pipeline barrer to wait at {@code S} until the semaphore signals before performing the transition and memory barrier, while
	 * allowing earlier pipeline stages of subsequent commands to proceed.</p>
	 * </div>
	 * 
	 * <p>After a successful return, the image indicated by {@code pImageIndex} will still be in the {@link #VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR} layout if it was previously
	 * presented, or in the {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} layout if this is the first time it has been acquired.</p>
	 * 
	 * <p>The possible return values for {@code vkAcquireNextImageKHR} depend on the timeout provided:</p>
	 * 
	 * <ul>
	 * <li>{@link VK10#VK_SUCCESS SUCCESS} is returned if an image became available.</li>
	 * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR} if the surface becomes no longer available.</li>
	 * <li>{@link VK10#VK_NOT_READY NOT_READY} is returned if {@code timeout} is zero and no image was available.</li>
	 * <li>{@link VK10#VK_TIMEOUT TIMEOUT} is returned if {@code timeout} is greater than zero and less than {@code UINT64_MAX}, and no image became available within the time
	 * allowed.</li>
	 * <li>{@link #VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR} is returned if an image became available, and the swapchain no longer matches the surface properties exactly, but can still be used
	 * to present to the surface successfully.
	 * 
	 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
	 * 
	 * <p>This may happen, for example, if the platform surface has been resized but the platform is able to scale the presented images to the new size to
	 * produce valid surface updates. It is up to applications to decide whether they prefer to continue using the current swapchain indefinitely or
	 * temporarily in this state, or to re-create the swapchain to better match the platform surface properties.</p>
	 * </div></li>
	 * <li>{@link #VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR} is returned if the surface has changed in such a way that it is no longer compatible with the swapchain, and further
	 * presentation requests using the swapchain will fail. Applications <b>must</b> query the new surface properties and recreate their swapchain if they wish
	 * to continue presenting to the surface.</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
	 * <li>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
	 * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
	 * <li>{@code pImageIndex} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If {@code semaphore} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>If {@code fence} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code device}</li>
	 * <li>Each of {@code swapchain}, {@code device}, {@code semaphore} and {@code fence} that are valid handles <b>must</b> have been created, allocated or
	 * retrieved from the same {@code VkInstance}</li>
	 * <li>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> be unsignalled</li>
	 * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> be unsignalled and <b>must not</b> be associated with any other queue command that has not yet completed
	 * execution on that queue</li>
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
	 * <p>If the native surface and presented image sizes no longer match, presentation may not succeed. If presentation does succeed, parts of the native
	 * surface <b>may</b> be undefined, parts of the presented image <b>may</b> have been clipped before presentation, and/or the image <b>may</b> have been scaled (uniformly
	 * or not uniformly) before presentation. It is the application’s responsibility to detect surface size changes and react appropriately. If presentation
	 * does not succeed because of a mismatch in the surface and presented image sizes, a {@link #VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR} error will be returned.</p>
	 * 
	 * <p>Before an application <b>can</b> present an image, the image’s layout <b>must</b> be transitioned to the {@link #VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR} layout. The
	 * {@link VK10#vkCmdWaitEvents CmdWaitEvents} or {@link VK10#vkCmdPipelineBarrier CmdPipelineBarrier} that perform the transition <b>must</b> have {@code srcStageMask} and {@code srcAccessMask} parameters set
	 * based on the preceding use of the image. The {@code dstAccessMask} <b>must</b> include {@link VK10#VK_ACCESS_MEMORY_READ_BIT ACCESS_MEMORY_READ_BIT} indicating all prior accesses indicated in
	 * {@code srcAccessMask} from stages in {@code srcStageMask} are to be made available to reads by the presentation engine. Any value of
	 * {@code dstStageMask} is valid, but should be set to {@link VK10#VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT} to avoid delaying subsequent commands that don’t access the
	 * image.</p>
	 *
	 * @param device      the device assocated with {@code swapchain}
	 * @param swapchain   the swapchain from which an image is being acquired
	 * @param timeout     indicates how long the function waits, in nanoseconds, if no image is available
	 * @param semaphore   is {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a semaphore to signal
	 * @param fence       is {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a fence to signal
	 * @param pImageIndex a pointer to a {@code uint32_t} that is set to the index of the next image to use (i.e. an index into the array of images returned by
	 *                    {@link #vkGetSwapchainImagesKHR GetSwapchainImagesKHR}).
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
	public static int nvkQueuePresentKHR(VkQueue queue, long pPresentInfo) {
		long __functionAddress = queue.getCapabilities().vkQueuePresentKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkPresentInfoKHR.validate(pPresentInfo);
		}
		return callPPI(__functionAddress, queue.address(), pPresentInfo);
	}

	/**
	 * Queues an image for presentation.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
	 * <li>{@code pPresentInfo} <b>must</b> be a pointer to a valid {@link VkPresentInfoKHR} structure</li>
	 * <li>Any given element of {@code pSwapchains} member of {@code pPresentInfo} <b>must</b> be a swapchain that is created for a surface for which presentation
	 * is supported from {@code queue} as determined using a call to {@link KHRSurface#vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pPresentInfo}.pWaitSemaphores[] <b>must</b> be externally synchronized</li>
	 * <li>Host access to {@code pPresentInfo}.pSwapchains[] <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <p>When the application calls {@code vkQueuePresentKHR}, it releases ownership of the images referenced by {@code imageIndices} to the presentation
	 * engine. The presented images <b>must not</b> be used again until the application regains control of them using {@link #vkAcquireNextImageKHR AcquireNextImageKHR} (and waiting until the
	 * returned semaphore is signaled or fence is completed).</p>
	 * 
	 * <p>The transfer of ownership to the presentation engine happens in issue order with other queue operations, but semaphores have to be used to ensure that
	 * prior rendering and other commands in the specified queue complete before the presentation operation. The presentation operation itself does not delay
	 * processing of subsequent commands on the queue, however, presentation requests sent to a particular queue are always performed in order. Exact
	 * presentation timing is controled by the semantics of the presentation engine and native platform in use.</p>
	 * 
	 * <p>The result codes {@link #VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR} and {@link #VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR} have the same meaning when returned by {@code vkQueuePresentKHR} as they do when returned
	 * by {@link #vkAcquireNextImageKHR AcquireNextImageKHR}. If multiple swapchains are presented, the result code is determined applying the following rules in order:</p>
	 * 
	 * <ul>
	 * <li>If the device is lost, {@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST} is returned.</li>
	 * <li>If any of the target surfaces are no longer available the error {@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR} is returned.</li>
	 * <li>If any of the presents would have a result of {@link #VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR} if issued separately then {@link #VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR} is returned.</li>
	 * <li>If any of the presents would have a result of {@link #VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR} if issued separately then {@link #VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR} is returned.</li>
	 * <li>Otherwise {@link VK10#VK_SUCCESS SUCCESS} is returned.</li>
	 * </ul>
	 * 
	 * <p>Presentation is a read-only operation that will not affect the content of the presentable images. Upon reacquiring the image and transitioning it away
	 * from the {@link #VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR} layout, the contents will be the same as they were prior to transitioning the image to the present source layout
	 * and presenting it. However, if a mechanism other than Vulkan is used to modify the platform window associated with the swapchain, the content of all
	 * presentable images in the swapchain becomes undefined.</p>
	 *
	 * @param queue        a queue that is capable of presentation to the target surface’s platform on the same device as the image’s swapchain
	 * @param pPresentInfo a pointer to an instance of the {@link VkPresentInfoKHR} structure specifying the parameters of the presentation
	 */
	public static int vkQueuePresentKHR(VkQueue queue, VkPresentInfoKHR pPresentInfo) {
		return nvkQueuePresentKHR(queue, pPresentInfo.address());
	}

}