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
 * The {@code VK_KHR_surface} extension is an instance extension. It introduces {@code VkSurfaceKHR} objects, which abstract native platform surface or
 * window objects for use with Vulkan. It also provides a way to determine whether a queue family in a physical device supports presenting to particular
 * surface.
 * 
 * <p>Separate extensions for each each platform provide the mechanisms for creating {@code VkSurfaceKHRs}, but once created they may be used in this and
 * other platform-independent extensions, in particular the {@code VK_KHR_swapchain} extension.</p>
 */
public class KHRSurface {

	/** The extension specification version. */
	public static final int VK_KHR_SURFACE_SPEC_VERSION = 25;

	/** The extension name. */
	public static final String VK_KHR_SURFACE_EXTENSION_NAME = "VK_KHR_surface";

	/** A surface is no longer available. */
	public static final int VK_ERROR_SURFACE_LOST_KHR = -1000000000;

	/** The requested window is already connected to a VkSurfaceKHR, or to some other non-Vulkan API. */
	public static final int VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = -1000000001;

	/** The presentation engine supports the sRGB colorspace. */
	public static final int VK_COLOR_SPACE_SRGB_NONLINEAR_KHR = 0;

	/**
	 * The presentation engine does not wait for a vertical blanking period to update the current image, meaning this mode <b>may</b> result in visible tearing.
	 * No internal queuing of presentation requests is needed, as the requests are applied immediately.
	 */
	public static final int VK_PRESENT_MODE_IMMEDIATE_KHR = 0;

	/**
	 * The presentation engine waits for the next vertical blanking period to update the current image. Tearing <b>cannot</b> be observed. An internal
	 * single-entry queue is used to hold pending presentation requests. If the queue is full when a new presentation request is received, the new request
	 * replaces the existing entry, and any images associated with the prior entry become available for re-use by the application. One request is removed
	 * from the queue and processed during each vertical blanking period in which the queue is non-empty.
	 */
	public static final int VK_PRESENT_MODE_MAILBOX_KHR = 1;

	/**
	 * The presentation engine waits for the next vertical blanking period to update the current image. Tearing <b>cannot</b> be observed. An internal queue
	 * containing {@code (numSwapchainImages - 1)} entries, where {@code numSwapchainImages} is the number of presentable images in the swapchain, is used
	 * to hold pending presentation requests. New requests are appended to the end of the queue, and one request is removed from the beginning of the
	 * queue and processed during each vertical blanking period in which the queue is non-empty. This is the only value of {@code presentMode} that is
	 * required to be supported.
	 */
	public static final int VK_PRESENT_MODE_FIFO_KHR = 2;

	/**
	 * The presentation engine waits for the next vertical blanking period to update the current image. If a vertical blanking period has already passed
	 * since the last update of the current image then the presentation engine does not wait for another vertical blanking period for the update, meaning
	 * this mode <b>may</b> result in visible tearing in this case. An internal queue containing {@code numSwapchainImages − 1} entries, where
	 * {@code numSwapchainImages} is the number of presentable images in the swapchain, is used to hold pending presentation requests. New requests are
	 * appended to the end of the queue, and one request is removed from the beginning of the queue and processed during or after each vertical blanking
	 * period in which the queue is non-empty.
	 */
	public static final int VK_PRESENT_MODE_FIFO_RELAXED_KHR = 3;

	/** The image content is presented without being transformed. */
	public static final int VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR = 0x1;

	/** The image content is rotated 90 degrees clockwise. */
	public static final int VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR = 0x2;

	/** The image content is rotated 180 degrees clockwise. */
	public static final int VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR = 0x4;

	/** The image content is rotated 270 degrees clockwise. */
	public static final int VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR = 0x8;

	/** The image content is mirrored horizontally. */
	public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR = 0x10;

	/** The image content is mirrored horizontally, then rotated 90 degrees clockwise. */
	public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR = 0x20;

	/** The image content is mirrored horizontally, then rotated 180 degrees clockwise. */
	public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = 0x40;

	/** The image content is mirrored horizontally, then rotated 270 degrees clockwise. */
	public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = 0x80;

	/** The presentation transform is not specified, and is instead determined by platform-specific considerations and mechanisms outside Vulkan. */
	public static final int VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR = 0x100;

	/**
	 * The alpha channel, if it exists, of the images is ignored in the compositing process. Instead, the image is treated as if it has a constant alpha
	 * of 1.0.
	 */
	public static final int VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = 0x1;

	/**
	 * The alpha channel, if it exists, of the images is respected in the compositing process. The non-alpha channels of the image are expected to already
	 * be multiplied by the alpha channel by the application.
	 */
	public static final int VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = 0x2;

	/**
	 * The alpha channel, if it exists, of the images is respected in the compositing process. The non-alpha channels of the image are not expected to
	 * already be multiplied by the alpha channel by the application; instead, the compositor will multiply the non-alpha channels of the image by the
	 * alpha channel during compositing.
	 */
	public static final int VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = 0x4;

	/**
	 * The way in which the presentation engine treats the alpha channel in the images is unknown to the Vulkan API. Instead, the application is
	 * responsible for setting the composite alpha blending mode using native window system commands. If the application does not set the blending mode
	 * using native window system commands, then a platform-specific default will be used.
	 */
	public static final int VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = 0x8;

	protected KHRSurface() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilities caps) {
		return checkFunctions(
			caps.vkDestroySurfaceKHR, caps.vkGetPhysicalDeviceSurfaceSupportKHR, caps.vkGetPhysicalDeviceSurfaceCapabilitiesKHR, 
			caps.vkGetPhysicalDeviceSurfaceFormatsKHR, caps.vkGetPhysicalDeviceSurfacePresentModesKHR
		);
	}

	// --- [ vkDestroySurfaceKHR ] ---

	/**
	 * Destroys a {@code VkSurfaceKHR} object.
	 * 
	 * <p>Several WSI functions return {@link #VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR} if the surface becomes no longer available. After such an error, the surface (and any child
	 * swapchain, if one exists) <b>should</b> be destroyed, as there is no way to restore them to a not-lost state. Applications <b>may</b> attempt to create a new
	 * {@code VkSurfaceKHR} using the same native platform window object, but whether such re-creation will succeed is platform-dependent and <b>may</b> depend on
	 * the reason the surface became unavailable. A lost surface does not otherwise cause devices to be lost.</p>
	 * 
	 * <p>Destroying a {@code VkSurfaceKHR} merely severs the connection between Vulkan and the native surface, and doesn’t imply destroying the native surface,
	 * closing a window, or similar behavior.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>If {@code surface} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code surface} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code instance}</li>
	 * <li>All {@code VkSwapchainKHR} objects created for {@code surface} <b>must</b> have been destroyed prior to destroying {@code surface}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code surface} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code surface} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param instance   the instance used to create the surface
	 * @param surface    the surface to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroySurfaceKHR(VkInstance instance, long surface, long pAllocator) {
		long __functionAddress = instance.getCapabilities().vkDestroySurfaceKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, instance.address(), surface, pAllocator);
	}

	/**
	 * Destroys a {@code VkSurfaceKHR} object.
	 * 
	 * <p>Several WSI functions return {@link #VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR} if the surface becomes no longer available. After such an error, the surface (and any child
	 * swapchain, if one exists) <b>should</b> be destroyed, as there is no way to restore them to a not-lost state. Applications <b>may</b> attempt to create a new
	 * {@code VkSurfaceKHR} using the same native platform window object, but whether such re-creation will succeed is platform-dependent and <b>may</b> depend on
	 * the reason the surface became unavailable. A lost surface does not otherwise cause devices to be lost.</p>
	 * 
	 * <p>Destroying a {@code VkSurfaceKHR} merely severs the connection between Vulkan and the native surface, and doesn’t imply destroying the native surface,
	 * closing a window, or similar behavior.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>If {@code surface} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>If {@code surface} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code instance}</li>
	 * <li>All {@code VkSwapchainKHR} objects created for {@code surface} <b>must</b> have been destroyed prior to destroying {@code surface}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code surface} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code surface} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param instance   the instance used to create the surface
	 * @param surface    the surface to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroySurfaceKHR(VkInstance instance, long surface, VkAllocationCallbacks pAllocator) {
		nvkDestroySurfaceKHR(instance, surface, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetPhysicalDeviceSurfaceSupportKHR ] ---

	/**
	 * Determines whether a queue family of a physical device supports presentation to a given surface.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
	 * <li>{@code pSupported} <b>must</b> be a pointer to a {@code VkBool32} value</li>
	 * <li>Each of {@code physicalDevice} and {@code surface} <b>must</b> have been created, allocated or retrieved from the same {@code VkInstance}</li>
	 * <li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} for the given
	 * {@code physicalDevice}</li>
	 * </ul>
	 *
	 * @param physicalDevice   the physical device
	 * @param queueFamilyIndex the queue family
	 * @param surface          the surface
	 * @param pSupported       a pointer to a {@code VkBool32}, which is set to {@link VK10#VK_TRUE TRUE} to indicate support, and {@link VK10#VK_FALSE FALSE} otherwise
	 */
	public static int nvkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long surface, long pSupported) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceSupportKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJPI(__functionAddress, physicalDevice.address(), queueFamilyIndex, surface, pSupported);
	}

	/**
	 * Determines whether a queue family of a physical device supports presentation to a given surface.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
	 * <li>{@code pSupported} <b>must</b> be a pointer to a {@code VkBool32} value</li>
	 * <li>Each of {@code physicalDevice} and {@code surface} <b>must</b> have been created, allocated or retrieved from the same {@code VkInstance}</li>
	 * <li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} for the given
	 * {@code physicalDevice}</li>
	 * </ul>
	 *
	 * @param physicalDevice   the physical device
	 * @param queueFamilyIndex the queue family
	 * @param surface          the surface
	 * @param pSupported       a pointer to a {@code VkBool32}, which is set to {@link VK10#VK_TRUE TRUE} to indicate support, and {@link VK10#VK_FALSE FALSE} otherwise
	 */
	public static int vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long surface, IntBuffer pSupported) {
		if ( CHECKS )
			checkBuffer(pSupported, 1);
		return nvkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, queueFamilyIndex, surface, memAddress(pSupported));
	}

	// --- [ vkGetPhysicalDeviceSurfaceCapabilitiesKHR ] ---

	/**
	 * Queries the basic capabilities of a surface, needed in order to create a swapchain.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
	 * <li>{@code pSurfaceCapabilities} <b>must</b> be a pointer to a {@link VkSurfaceCapabilitiesKHR} structure</li>
	 * <li>Each of {@code physicalDevice} and {@code surface} <b>must</b> have been created, allocated or retrieved from the same {@code VkInstance}</li>
	 * </ul>
	 *
	 * @param physicalDevice       the physical device that will be associated with the swapchain to be created
	 * @param surface              the surface that will be associated with the swapchain
	 * @param pSurfaceCapabilities a pointer to an instance of the {@link VkSurfaceCapabilitiesKHR} structure that will be filled with information
	 */
	public static int nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, long surface, long pSurfaceCapabilities) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceCapabilitiesKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJPI(__functionAddress, physicalDevice.address(), surface, pSurfaceCapabilities);
	}

	/**
	 * Queries the basic capabilities of a surface, needed in order to create a swapchain.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
	 * <li>{@code pSurfaceCapabilities} <b>must</b> be a pointer to a {@link VkSurfaceCapabilitiesKHR} structure</li>
	 * <li>Each of {@code physicalDevice} and {@code surface} <b>must</b> have been created, allocated or retrieved from the same {@code VkInstance}</li>
	 * </ul>
	 *
	 * @param physicalDevice       the physical device that will be associated with the swapchain to be created
	 * @param surface              the surface that will be associated with the swapchain
	 * @param pSurfaceCapabilities a pointer to an instance of the {@link VkSurfaceCapabilitiesKHR} structure that will be filled with information
	 */
	public static int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, long surface, VkSurfaceCapabilitiesKHR pSurfaceCapabilities) {
		return nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice, surface, pSurfaceCapabilities.address());
	}

	// --- [ vkGetPhysicalDeviceSurfaceFormatsKHR ] ---

	/**
	 * Queries the supported swapchain format-colorspace pairs for a surface.
	 * 
	 * <p>If {@code pSurfaceFormats} is {@code NULL}, then the number of format pairs supported for the given surface is returned in {@code pSurfaceFormatCount}.
	 * Otherwise, {@code pSurfaceFormatCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSurfaceFormats} array, and on
	 * return the variable is overwritten with the number of structures actually written to {@code pSurfaceFormats}. If the value of
	 * {@code pSurfaceFormatCount} is less than the number of queue families supported, at most {@code pSurfaceFormatCount} structures will be written. If
	 * {@code pSurfaceFormatCount} is smaller than the number of format pairs supported for the given {@code surface}, {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned
	 * instead of {@link VK10#VK_SUCCESS SUCCESS} to indicate that not all the available values were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
	 * <li>{@code pSurfaceFormatCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pSurfaceFormatCount} is not 0, and {@code pSurfaceFormats} is not {@code NULL}, {@code pSurfaceFormats} <b>must</b> be a
	 * pointer to an array of {@code pSurfaceFormatCount} {@link VkSurfaceFormatKHR} structures</li>
	 * <li>Each of {@code physicalDevice} and {@code surface} <b>must</b> have been created, allocated or retrieved from the same {@code VkInstance}</li>
	 * </ul>
	 *
	 * @param physicalDevice      the physical device that will be associated with the swapchain to be created
	 * @param surface             the surface that will be associated with the swapchain
	 * @param pSurfaceFormatCount a pointer to an integer related to the number of format pairs available or queried
	 * @param pSurfaceFormats     either {@code NULL} or a pointer to an array of {@link VkSurfaceFormatKHR} structures
	 */
	public static int nvkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, long surface, long pSurfaceFormatCount, long pSurfaceFormats) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormatsKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJPPI(__functionAddress, physicalDevice.address(), surface, pSurfaceFormatCount, pSurfaceFormats);
	}

	/**
	 * Queries the supported swapchain format-colorspace pairs for a surface.
	 * 
	 * <p>If {@code pSurfaceFormats} is {@code NULL}, then the number of format pairs supported for the given surface is returned in {@code pSurfaceFormatCount}.
	 * Otherwise, {@code pSurfaceFormatCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSurfaceFormats} array, and on
	 * return the variable is overwritten with the number of structures actually written to {@code pSurfaceFormats}. If the value of
	 * {@code pSurfaceFormatCount} is less than the number of queue families supported, at most {@code pSurfaceFormatCount} structures will be written. If
	 * {@code pSurfaceFormatCount} is smaller than the number of format pairs supported for the given {@code surface}, {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned
	 * instead of {@link VK10#VK_SUCCESS SUCCESS} to indicate that not all the available values were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
	 * <li>{@code pSurfaceFormatCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pSurfaceFormatCount} is not 0, and {@code pSurfaceFormats} is not {@code NULL}, {@code pSurfaceFormats} <b>must</b> be a
	 * pointer to an array of {@code pSurfaceFormatCount} {@link VkSurfaceFormatKHR} structures</li>
	 * <li>Each of {@code physicalDevice} and {@code surface} <b>must</b> have been created, allocated or retrieved from the same {@code VkInstance}</li>
	 * </ul>
	 *
	 * @param physicalDevice      the physical device that will be associated with the swapchain to be created
	 * @param surface             the surface that will be associated with the swapchain
	 * @param pSurfaceFormatCount a pointer to an integer related to the number of format pairs available or queried
	 * @param pSurfaceFormats     either {@code NULL} or a pointer to an array of {@link VkSurfaceFormatKHR} structures
	 */
	public static int vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, long surface, IntBuffer pSurfaceFormatCount, VkSurfaceFormatKHR.Buffer pSurfaceFormats) {
		if ( CHECKS )
			if ( pSurfaceFormats != null ) checkBuffer(pSurfaceFormats, pSurfaceFormatCount.get(pSurfaceFormatCount.position()));
		return nvkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, memAddress(pSurfaceFormatCount), pSurfaceFormats == null ? NULL : pSurfaceFormats.address());
	}

	// --- [ vkGetPhysicalDeviceSurfacePresentModesKHR ] ---

	/**
	 * Queries the supported presentation modes for a surface.
	 * 
	 * <p>If {@code pPresentModes} is {@code NULL}, then the number of presentation modes supported for the given surface is returned in {@code pPresentModeCount}.
	 * Otherwise, {@code pPresentModeCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPresentModes} array, and on
	 * return the variable is overwritten with the number of structures actually written to {@code pPresentModes}. If the value of {@code pPresentModeCount}
	 * is less than the number of presentation modes supported, at most {@code pPresentModeCount} structures will be written. If {@code pPresentModeCount} is
	 * smaller than the number of presentation modes supported for the given {@code surfac}e, {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS} to
	 * indicate that not all the available values were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
	 * <li>{@code pPresentModeCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPresentModeCount} is not 0, and {@code pPresentModes} is not {@code NULL}, {@code pPresentModes} <b>must</b> be a pointer to
	 * an array of {@code pPresentModeCount} {@code VkPresentModeKHR} values</li>
	 * <li>Each of {@code physicalDevice} and {@code surface} <b>must</b> have been created, allocated or retrieved from the same {@code VkInstance}</li>
	 * </ul>
	 *
	 * @param physicalDevice    the physical device that will be associated with the swapchain to be created
	 * @param surface           the surface that will be associated with the swapchain
	 * @param pPresentModeCount a pointer to an integer related to the number of format pairs available or queried
	 * @param pPresentModes     either {@code NULL} or a pointer to an array of {@code VkPresentModeKHR} values
	 */
	public static int nvkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, long surface, long pPresentModeCount, long pPresentModes) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModesKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJPPI(__functionAddress, physicalDevice.address(), surface, pPresentModeCount, pPresentModes);
	}

	/**
	 * Queries the supported presentation modes for a surface.
	 * 
	 * <p>If {@code pPresentModes} is {@code NULL}, then the number of presentation modes supported for the given surface is returned in {@code pPresentModeCount}.
	 * Otherwise, {@code pPresentModeCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPresentModes} array, and on
	 * return the variable is overwritten with the number of structures actually written to {@code pPresentModes}. If the value of {@code pPresentModeCount}
	 * is less than the number of presentation modes supported, at most {@code pPresentModeCount} structures will be written. If {@code pPresentModeCount} is
	 * smaller than the number of presentation modes supported for the given {@code surfac}e, {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS} to
	 * indicate that not all the available values were returned.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
	 * <li>{@code pPresentModeCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPresentModeCount} is not 0, and {@code pPresentModes} is not {@code NULL}, {@code pPresentModes} <b>must</b> be a pointer to
	 * an array of {@code pPresentModeCount} {@code VkPresentModeKHR} values</li>
	 * <li>Each of {@code physicalDevice} and {@code surface} <b>must</b> have been created, allocated or retrieved from the same {@code VkInstance}</li>
	 * </ul>
	 *
	 * @param physicalDevice    the physical device that will be associated with the swapchain to be created
	 * @param surface           the surface that will be associated with the swapchain
	 * @param pPresentModeCount a pointer to an integer related to the number of format pairs available or queried
	 * @param pPresentModes     either {@code NULL} or a pointer to an array of {@code VkPresentModeKHR} values
	 */
	public static int vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, long surface, IntBuffer pPresentModeCount, IntBuffer pPresentModes) {
		if ( CHECKS )
			if ( pPresentModes != null ) checkBuffer(pPresentModes, pPresentModeCount.get(pPresentModeCount.position()));
		return nvkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice, surface, memAddress(pPresentModeCount), memAddressSafe(pPresentModes));
	}

	/** Array version of: {@link #vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR} */
	public static int vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long surface, int[] pSupported) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceSupportKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pSupported, 1);
		}
		return callPJPI(__functionAddress, physicalDevice.address(), queueFamilyIndex, surface, pSupported);
	}

	/** Array version of: {@link #vkGetPhysicalDeviceSurfaceFormatsKHR GetPhysicalDeviceSurfaceFormatsKHR} */
	public static int vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, long surface, int[] pSurfaceFormatCount, VkSurfaceFormatKHR.Buffer pSurfaceFormats) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormatsKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pSurfaceFormats != null ) checkBuffer(pSurfaceFormats, pSurfaceFormatCount[0]);
		}
		return callPJPPI(__functionAddress, physicalDevice.address(), surface, pSurfaceFormatCount, pSurfaceFormats == null ? NULL : pSurfaceFormats.address());
	}

	/** Array version of: {@link #vkGetPhysicalDeviceSurfacePresentModesKHR GetPhysicalDeviceSurfacePresentModesKHR} */
	public static int vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, long surface, int[] pPresentModeCount, int[] pPresentModes) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModesKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pPresentModes != null ) checkBuffer(pPresentModes, pPresentModeCount[0]);
		}
		return callPJPPI(__functionAddress, physicalDevice.address(), surface, pPresentModeCount, pPresentModes);
	}

}