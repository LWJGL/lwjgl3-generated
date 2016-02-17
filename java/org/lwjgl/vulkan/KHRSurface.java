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
	public static final int VK_KHR_SURFACE_SPEC_VERSION = 0x19;

	/** The extension name. */
	public static final String VK_KHR_SURFACE_EXTENSION_NAME = "VK_KHR_surface";

	/** VkResult */
	public static final int
		VK_ERROR_SURFACE_LOST_KHR         = -1000000000,
		VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = -1000000001;

	/**  */
	public static final int VK_COLORSPACE_SRGB_NONLINEAR_KHR = 0x0;

	/**  */
	public static final int VK_COLORSPACE_BEGIN_RANGE = VK_COLORSPACE_SRGB_NONLINEAR_KHR;

	/**  */
	public static final int VK_COLORSPACE_END_RANGE = VK_COLORSPACE_SRGB_NONLINEAR_KHR;

	/**  */
	public static final int VK_COLORSPACE_RANGE_SIZE = (VK_COLORSPACE_SRGB_NONLINEAR_KHR - VK_COLORSPACE_SRGB_NONLINEAR_KHR + 1);

	/**  */
	public static final int VK_COLORSPACE_MAX_ENUM = 0x7FFFFFFF;

	/** VkPresentModeKHR */
	public static final int
		VK_PRESENT_MODE_IMMEDIATE_KHR    = 0x0,
		VK_PRESENT_MODE_MAILBOX_KHR      = 0x1,
		VK_PRESENT_MODE_FIFO_KHR         = 0x2,
		VK_PRESENT_MODE_FIFO_RELAXED_KHR = 0x3,
		VK_PRESENT_MODE_MAX_ENUM         = 0x7FFFFFFF;

	/**  */
	public static final int VK_PRESENT_MODE_BEGIN_RANGE = VK_PRESENT_MODE_IMMEDIATE_KHR;

	/**  */
	public static final int VK_PRESENT_MODE_END_RANGE = VK_PRESENT_MODE_FIFO_RELAXED_KHR;

	/**  */
	public static final int VK_PRESENT_MODE_RANGE_SIZE = (VK_PRESENT_MODE_FIFO_RELAXED_KHR - VK_PRESENT_MODE_IMMEDIATE_KHR + 1);

	/**  */
	public static final int VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR = 0x1;

	/**  */
	public static final int VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR = 0x2;

	/**  */
	public static final int VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR = 0x4;

	/**  */
	public static final int VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR = 0x8;

	/**  */
	public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR = 0x10;

	/**  */
	public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR = 0x20;

	/**  */
	public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = 0x40;

	/**  */
	public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = 0x80;

	/**  */
	public static final int VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR = 0x100;

	/**  */
	public static final int VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = 0x1;

	/**  */
	public static final int VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = 0x2;

	/**  */
	public static final int VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = 0x4;

	/**  */
	public static final int VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = 0x8;

	/** Function address. */
	@JavadocExclude
	public final long
		DestroySurfaceKHR,
		GetPhysicalDeviceSurfaceSupportKHR,
		GetPhysicalDeviceSurfaceCapabilitiesKHR,
		GetPhysicalDeviceSurfaceFormatsKHR,
		GetPhysicalDeviceSurfacePresentModesKHR;

	@JavadocExclude
	protected KHRSurface() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public KHRSurface(FunctionProvider provider) {
		DestroySurfaceKHR = checkFunctionAddress(provider.getFunctionAddress("vkDestroySurfaceKHR"));
		GetPhysicalDeviceSurfaceSupportKHR = checkFunctionAddress(provider.getFunctionAddress("vkGetPhysicalDeviceSurfaceSupportKHR"));
		GetPhysicalDeviceSurfaceCapabilitiesKHR = checkFunctionAddress(provider.getFunctionAddress("vkGetPhysicalDeviceSurfaceCapabilitiesKHR"));
		GetPhysicalDeviceSurfaceFormatsKHR = checkFunctionAddress(provider.getFunctionAddress("vkGetPhysicalDeviceSurfaceFormatsKHR"));
		GetPhysicalDeviceSurfacePresentModesKHR = checkFunctionAddress(provider.getFunctionAddress("vkGetPhysicalDeviceSurfacePresentModesKHR"));
	}

	// --- [ Function Addresses ] ---

	private static final KHRSurface instance = new KHRSurface(getLibrary());

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return VK10.getLibrary();
	}

	/** Returns the {@link KHRSurface} instance. */
	public static KHRSurface getInstance() {
		return instance;
	}

	// --- [ vkDestroySurfaceKHR ] ---

	/** Unsafe version of {@link #vkDestroySurfaceKHR DestroySurfaceKHR} */
	@JavadocExclude
	public static void nvkDestroySurfaceKHR(long instance, long surface, long pAllocator) {
		long __functionAddress = getInstance().DestroySurfaceKHR;
		if ( CHECKS ) {
			checkPointer(instance);
			checkPointer(surface);
		}
		callPPPV(__functionAddress, instance, surface, pAllocator);
	}

	/**
	 * Destroys a {@code VkSurfaceKHR} object.
	 *
	 * @param instance   the instance used to create the surface
	 * @param surface    the handle of the surface to destroy
	 * @param pAllocator the allocator used for host memory allocated for the surface object
	 */
	public static void vkDestroySurfaceKHR(long instance, long surface, VkAllocationCallbacks pAllocator) {
		nvkDestroySurfaceKHR(instance, surface, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkGetPhysicalDeviceSurfaceSupportKHR ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR} */
	@JavadocExclude
	public static int nvkGetPhysicalDeviceSurfaceSupportKHR(long physicalDevice, int queueFamilyIndex, long surface, long pSupported) {
		long __functionAddress = getInstance().GetPhysicalDeviceSurfaceSupportKHR;
		if ( CHECKS ) {
			checkPointer(physicalDevice);
			checkPointer(surface);
		}
		return callPIPPI(__functionAddress, physicalDevice, queueFamilyIndex, surface, pSupported);
	}

	/**
	 * Queries if presentation is supported.
	 *
	 * @param physicalDevice   a valid physical device
	 * @param queueFamilyIndex a queue family
	 * @param surface          the surface to query
	 * @param pSupported       indicates is presentation is supported
	 */
	public static int vkGetPhysicalDeviceSurfaceSupportKHR(long physicalDevice, int queueFamilyIndex, long surface, ByteBuffer pSupported) {
		if ( CHECKS )
			checkBuffer(pSupported, 1 << 2);
		return nvkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, queueFamilyIndex, surface, memAddress(pSupported));
	}

	/** Alternative version of: {@link #vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR} */
	public static int vkGetPhysicalDeviceSurfaceSupportKHR(long physicalDevice, int queueFamilyIndex, long surface, IntBuffer pSupported) {
		if ( CHECKS )
			checkBuffer(pSupported, 1);
		return nvkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, queueFamilyIndex, surface, memAddress(pSupported));
	}

	// --- [ vkGetPhysicalDeviceSurfaceCapabilitiesKHR ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR} */
	@JavadocExclude
	public static int nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(long physicalDevice, long surface, long pSurfaceCapabilities) {
		long __functionAddress = getInstance().GetPhysicalDeviceSurfaceCapabilitiesKHR;
		if ( CHECKS ) {
			checkPointer(physicalDevice);
			checkPointer(surface);
		}
		return callPPPI(__functionAddress, physicalDevice, surface, pSurfaceCapabilities);
	}

	/**
	 * Gets surface capabilities.
	 *
	 * @param physicalDevice       a valid physical device
	 * @param surface              the surface to query
	 * @param pSurfaceCapabilities a pointer to an instance of {@link VkSurfaceCapabilitiesKHR} that will be filled
	 */
	public static int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(long physicalDevice, long surface, VkSurfaceCapabilitiesKHR pSurfaceCapabilities) {
		return nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice, surface, pSurfaceCapabilities.address());
	}

	// --- [ vkGetPhysicalDeviceSurfaceFormatsKHR ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceSurfaceFormatsKHR GetPhysicalDeviceSurfaceFormatsKHR} */
	@JavadocExclude
	public static int nvkGetPhysicalDeviceSurfaceFormatsKHR(long physicalDevice, long surface, long pSurfaceFormatCount, long pSurfaceFormats) {
		long __functionAddress = getInstance().GetPhysicalDeviceSurfaceFormatsKHR;
		if ( CHECKS ) {
			checkPointer(physicalDevice);
			checkPointer(surface);
		}
		return callPPPPI(__functionAddress, physicalDevice, surface, pSurfaceFormatCount, pSurfaceFormats);
	}

	/**
	 * Gets color formats supported by surface.
	 *
	 * @param physicalDevice      a valid physical device
	 * @param surface             the surface to query
	 * @param pSurfaceFormatCount the number of elements in the array pointed by {@code pSurfaceFormats}
	 * @param pSurfaceFormats     a pointer to an array of {@link VkSurfaceFormatKHR}
	 */
	public static int vkGetPhysicalDeviceSurfaceFormatsKHR(long physicalDevice, long surface, ByteBuffer pSurfaceFormatCount, VkSurfaceFormatKHR.Buffer pSurfaceFormats) {
		if ( CHECKS )
			if ( pSurfaceFormats != null ) checkBuffer(pSurfaceFormats, pSurfaceFormatCount.getInt(pSurfaceFormatCount.position()));
		return nvkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, memAddress(pSurfaceFormatCount), pSurfaceFormats == null ? NULL : pSurfaceFormats.address());
	}

	/** Alternative version of: {@link #vkGetPhysicalDeviceSurfaceFormatsKHR GetPhysicalDeviceSurfaceFormatsKHR} */
	public static int vkGetPhysicalDeviceSurfaceFormatsKHR(long physicalDevice, long surface, IntBuffer pSurfaceFormatCount, VkSurfaceFormatKHR.Buffer pSurfaceFormats) {
		if ( CHECKS )
			if ( pSurfaceFormats != null ) checkBuffer(pSurfaceFormats, pSurfaceFormatCount.get(pSurfaceFormatCount.position()));
		return nvkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, memAddress(pSurfaceFormatCount), pSurfaceFormats == null ? NULL : pSurfaceFormats.address());
	}

	// --- [ vkGetPhysicalDeviceSurfacePresentModesKHR ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceSurfacePresentModesKHR GetPhysicalDeviceSurfacePresentModesKHR} */
	@JavadocExclude
	public static int nvkGetPhysicalDeviceSurfacePresentModesKHR(long physicalDevice, long surface, long pPresentModeCount, long pPresentModes) {
		long __functionAddress = getInstance().GetPhysicalDeviceSurfacePresentModesKHR;
		if ( CHECKS ) {
			checkPointer(physicalDevice);
			checkPointer(surface);
		}
		return callPPPPI(__functionAddress, physicalDevice, surface, pPresentModeCount, pPresentModes);
	}

	/**
	 * Gets supported presentation modes.
	 *
	 * @param physicalDevice    a valid physical device
	 * @param surface           the surface to query
	 * @param pPresentModeCount the number of elements in the array pointed by {@code pPresentModes}
	 * @param pPresentModes     a pointer to an array of {@code VkPresentModeKHR}
	 */
	public static int vkGetPhysicalDeviceSurfacePresentModesKHR(long physicalDevice, long surface, ByteBuffer pPresentModeCount, ByteBuffer pPresentModes) {
		if ( CHECKS )
			if ( pPresentModes != null ) checkBuffer(pPresentModes, pPresentModeCount.getInt(pPresentModeCount.position()) << 2);
		return nvkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice, surface, memAddress(pPresentModeCount), memAddressSafe(pPresentModes));
	}

	/** Alternative version of: {@link #vkGetPhysicalDeviceSurfacePresentModesKHR GetPhysicalDeviceSurfacePresentModesKHR} */
	public static int vkGetPhysicalDeviceSurfacePresentModesKHR(long physicalDevice, long surface, IntBuffer pPresentModeCount, IntBuffer pPresentModes) {
		if ( CHECKS )
			if ( pPresentModes != null ) checkBuffer(pPresentModes, pPresentModeCount.get(pPresentModeCount.position()));
		return nvkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice, surface, memAddress(pPresentModeCount), memAddressSafe(pPresentModes));
	}

}