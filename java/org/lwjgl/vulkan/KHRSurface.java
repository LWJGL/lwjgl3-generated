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
	public static final int VK_COLORSPACE_SRGB_NONLINEAR_KHR = 0;

	/** VkColorSpaceKHR */
	public static final int
		VK_COLORSPACE_BEGIN_RANGE = VK_COLORSPACE_SRGB_NONLINEAR_KHR,
		VK_COLORSPACE_END_RANGE   = VK_COLORSPACE_SRGB_NONLINEAR_KHR,
		VK_COLORSPACE_RANGE_SIZE  = (VK_COLORSPACE_SRGB_NONLINEAR_KHR - VK_COLORSPACE_SRGB_NONLINEAR_KHR + 1),
		VK_COLORSPACE_MAX_ENUM    = 0x7FFFFFFF;

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

	/** VkPresentModeKHR */
	public static final int
		VK_PRESENT_MODE_FIFO_RELAXED_KHR = 3,
		VK_PRESENT_MODE_BEGIN_RANGE      = VK_PRESENT_MODE_IMMEDIATE_KHR,
		VK_PRESENT_MODE_END_RANGE        = VK_PRESENT_MODE_FIFO_RELAXED_KHR,
		VK_PRESENT_MODE_RANGE_SIZE       = (VK_PRESENT_MODE_FIFO_RELAXED_KHR - VK_PRESENT_MODE_IMMEDIATE_KHR + 1),
		VK_PRESENT_MODE_MAX_ENUM         = 0x7FFFFFFF;

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

	/** Function address. */
	public final long
		DestroySurfaceKHR,
		GetPhysicalDeviceSurfaceSupportKHR,
		GetPhysicalDeviceSurfaceCapabilitiesKHR,
		GetPhysicalDeviceSurfaceFormatsKHR,
		GetPhysicalDeviceSurfacePresentModesKHR;

	protected KHRSurface() {
		throw new UnsupportedOperationException();
	}

	public KHRSurface(FunctionProvider provider) {
		DestroySurfaceKHR = provider.getFunctionAddress("vkDestroySurfaceKHR");
		GetPhysicalDeviceSurfaceSupportKHR = provider.getFunctionAddress("vkGetPhysicalDeviceSurfaceSupportKHR");
		GetPhysicalDeviceSurfaceCapabilitiesKHR = provider.getFunctionAddress("vkGetPhysicalDeviceSurfaceCapabilitiesKHR");
		GetPhysicalDeviceSurfaceFormatsKHR = provider.getFunctionAddress("vkGetPhysicalDeviceSurfaceFormatsKHR");
		GetPhysicalDeviceSurfacePresentModesKHR = provider.getFunctionAddress("vkGetPhysicalDeviceSurfacePresentModesKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRSurface} instance from the specified dispatchable handle. */
	public static KHRSurface getInstance(DispatchableHandle handle) {
		return getInstance(handle.getCapabilities());
	}

	/** Returns the {@link KHRSurface} instance of the specified {@link VKCapabilities}. */
	public static KHRSurface getInstance(VKCapabilities caps) {
		return checkFunctionality(caps.__KHRSurface);
	}

	static KHRSurface create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("VK_KHR_surface") )
			return null;

		return VK.checkExtension("VK_KHR_surface", create(provider));
	}

	static KHRSurface create(FunctionProvider provider) {
		KHRSurface funcs = new KHRSurface(provider);

		boolean supported = checkFunctions(
			funcs.DestroySurfaceKHR, funcs.GetPhysicalDeviceSurfaceSupportKHR, funcs.GetPhysicalDeviceSurfaceCapabilitiesKHR, 
			funcs.GetPhysicalDeviceSurfaceFormatsKHR, funcs.GetPhysicalDeviceSurfacePresentModesKHR
		);

		return supported ? funcs : null;
	}

	// --- [ vkDestroySurfaceKHR ] ---

	/** Unsafe version of {@link #vkDestroySurfaceKHR DestroySurfaceKHR} */
	public static void nvkDestroySurfaceKHR(VkInstance instance, long surface, long pAllocator) {
		long __functionAddress = getInstance(instance).DestroySurfaceKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, instance.address(), surface, pAllocator);
	}

	/**
	 * Destroys a {@code VkSurfaceKHR} object.
	 *
	 * @param instance   the instance used to create the surface
	 * @param surface    the handle of the surface to destroy
	 * @param pAllocator the allocator used for host memory allocated for the surface object
	 */
	public static void vkDestroySurfaceKHR(VkInstance instance, long surface, VkAllocationCallbacks pAllocator) {
		nvkDestroySurfaceKHR(instance, surface, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetPhysicalDeviceSurfaceSupportKHR ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR} */
	public static int nvkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long surface, long pSupported) {
		long __functionAddress = getInstance(physicalDevice).GetPhysicalDeviceSurfaceSupportKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPIJPI(__functionAddress, physicalDevice.address(), queueFamilyIndex, surface, pSupported);
	}

	/**
	 * Queries if presentation is supported.
	 *
	 * @param physicalDevice   a valid physical device
	 * @param queueFamilyIndex a queue family
	 * @param surface          the surface to query
	 * @param pSupported       indicates is presentation is supported
	 */
	public static int vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long surface, ByteBuffer pSupported) {
		if ( CHECKS )
			checkBuffer(pSupported, 1 << 2);
		return nvkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, queueFamilyIndex, surface, memAddress(pSupported));
	}

	/** Alternative version of: {@link #vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR} */
	public static int vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long surface, IntBuffer pSupported) {
		if ( CHECKS )
			checkBuffer(pSupported, 1);
		return nvkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, queueFamilyIndex, surface, memAddress(pSupported));
	}

	// --- [ vkGetPhysicalDeviceSurfaceCapabilitiesKHR ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR} */
	public static int nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, long surface, long pSurfaceCapabilities) {
		long __functionAddress = getInstance(physicalDevice).GetPhysicalDeviceSurfaceCapabilitiesKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJPI(__functionAddress, physicalDevice.address(), surface, pSurfaceCapabilities);
	}

	/**
	 * Gets surface capabilities.
	 *
	 * @param physicalDevice       a valid physical device
	 * @param surface              the surface to query
	 * @param pSurfaceCapabilities a pointer to an instance of {@link VkSurfaceCapabilitiesKHR} that will be filled
	 */
	public static int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, long surface, VkSurfaceCapabilitiesKHR pSurfaceCapabilities) {
		return nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice, surface, pSurfaceCapabilities.address());
	}

	// --- [ vkGetPhysicalDeviceSurfaceFormatsKHR ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceSurfaceFormatsKHR GetPhysicalDeviceSurfaceFormatsKHR} */
	public static int nvkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, long surface, long pSurfaceFormatCount, long pSurfaceFormats) {
		long __functionAddress = getInstance(physicalDevice).GetPhysicalDeviceSurfaceFormatsKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJPPI(__functionAddress, physicalDevice.address(), surface, pSurfaceFormatCount, pSurfaceFormats);
	}

	/**
	 * Gets color formats supported by surface.
	 *
	 * @param physicalDevice      a valid physical device
	 * @param surface             the surface to query
	 * @param pSurfaceFormatCount the number of elements in the array pointed by {@code pSurfaceFormats}
	 * @param pSurfaceFormats     a pointer to an array of {@link VkSurfaceFormatKHR}
	 */
	public static int vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, long surface, ByteBuffer pSurfaceFormatCount, VkSurfaceFormatKHR.Buffer pSurfaceFormats) {
		if ( CHECKS )
			if ( pSurfaceFormats != null ) checkBuffer(pSurfaceFormats, pSurfaceFormatCount.getInt(pSurfaceFormatCount.position()));
		return nvkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, memAddress(pSurfaceFormatCount), pSurfaceFormats == null ? NULL : pSurfaceFormats.address());
	}

	/** Alternative version of: {@link #vkGetPhysicalDeviceSurfaceFormatsKHR GetPhysicalDeviceSurfaceFormatsKHR} */
	public static int vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, long surface, IntBuffer pSurfaceFormatCount, VkSurfaceFormatKHR.Buffer pSurfaceFormats) {
		if ( CHECKS )
			if ( pSurfaceFormats != null ) checkBuffer(pSurfaceFormats, pSurfaceFormatCount.get(pSurfaceFormatCount.position()));
		return nvkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, memAddress(pSurfaceFormatCount), pSurfaceFormats == null ? NULL : pSurfaceFormats.address());
	}

	// --- [ vkGetPhysicalDeviceSurfacePresentModesKHR ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceSurfacePresentModesKHR GetPhysicalDeviceSurfacePresentModesKHR} */
	public static int nvkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, long surface, long pPresentModeCount, long pPresentModes) {
		long __functionAddress = getInstance(physicalDevice).GetPhysicalDeviceSurfacePresentModesKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJPPI(__functionAddress, physicalDevice.address(), surface, pPresentModeCount, pPresentModes);
	}

	/**
	 * Gets supported presentation modes.
	 *
	 * @param physicalDevice    a valid physical device
	 * @param surface           the surface to query
	 * @param pPresentModeCount the number of elements in the array pointed by {@code pPresentModes}
	 * @param pPresentModes     a pointer to an array of {@code VkPresentModeKHR}
	 */
	public static int vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, long surface, ByteBuffer pPresentModeCount, ByteBuffer pPresentModes) {
		if ( CHECKS )
			if ( pPresentModes != null ) checkBuffer(pPresentModes, pPresentModeCount.getInt(pPresentModeCount.position()) << 2);
		return nvkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice, surface, memAddress(pPresentModeCount), memAddressSafe(pPresentModes));
	}

	/** Alternative version of: {@link #vkGetPhysicalDeviceSurfacePresentModesKHR GetPhysicalDeviceSurfacePresentModesKHR} */
	public static int vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, long surface, IntBuffer pPresentModeCount, IntBuffer pPresentModes) {
		if ( CHECKS )
			if ( pPresentModes != null ) checkBuffer(pPresentModes, pPresentModeCount.get(pPresentModeCount.position()));
		return nvkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice, surface, memAddress(pPresentModeCount), memAddressSafe(pPresentModes));
	}

}