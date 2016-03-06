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

/** This extension provides the API to enumerate displays and available modes on a given device. */
public class KHRDisplay {

	/** The extension specification version. */
	public static final int VK_KHR_DISPLAY_SPEC_VERSION = 21;

	/** The extension name. */
	public static final String VK_KHR_DISPLAY_EXTENSION_NAME = "VK_KHR_display";

	/** VkStructureType */
	public static final int
		VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR    = 1000002000,
		VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR = 1000002001;

	/** The source image will be treated as opaque. */
	public static final int VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = 0x1;

	/** A global alpha value must be specified that will be applied to all pixels in the source image. */
	public static final int VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = 0x2;

	/**
	 * The alpha value will be determined by the alpha channel of the source image’s pixels. If the source format contains no alpha values, no blending
	 * will be applied. The source alpha values are not premultiplied into the source image’s other color channels.
	 */
	public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = 0x4;

	/**
	 * This is equivalent to {@link #VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR} except the source alpha values are assumed to be premultiplied into the source image’s
	 * other color channels.
	 */
	public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = 0x8;

	/** Function address. */
	public final long
		GetPhysicalDeviceDisplayPropertiesKHR,
		GetPhysicalDeviceDisplayPlanePropertiesKHR,
		GetDisplayPlaneSupportedDisplaysKHR,
		GetDisplayModePropertiesKHR,
		CreateDisplayModeKHR,
		GetDisplayPlaneCapabilitiesKHR,
		CreateDisplayPlaneSurfaceKHR;

	protected KHRDisplay() {
		throw new UnsupportedOperationException();
	}

	public KHRDisplay(FunctionProvider provider) {
		GetPhysicalDeviceDisplayPropertiesKHR = provider.getFunctionAddress("vkGetPhysicalDeviceDisplayPropertiesKHR");
		GetPhysicalDeviceDisplayPlanePropertiesKHR = provider.getFunctionAddress("vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
		GetDisplayPlaneSupportedDisplaysKHR = provider.getFunctionAddress("vkGetDisplayPlaneSupportedDisplaysKHR");
		GetDisplayModePropertiesKHR = provider.getFunctionAddress("vkGetDisplayModePropertiesKHR");
		CreateDisplayModeKHR = provider.getFunctionAddress("vkCreateDisplayModeKHR");
		GetDisplayPlaneCapabilitiesKHR = provider.getFunctionAddress("vkGetDisplayPlaneCapabilitiesKHR");
		CreateDisplayPlaneSurfaceKHR = provider.getFunctionAddress("vkCreateDisplayPlaneSurfaceKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRDisplay} instance from the specified dispatchable handle. */
	public static KHRDisplay getInstance(DispatchableHandle handle) {
		return getInstance(handle.getCapabilities());
	}

	/** Returns the {@link KHRDisplay} instance of the specified {@link VKCapabilities}. */
	public static KHRDisplay getInstance(VKCapabilities caps) {
		return checkFunctionality(caps.__KHRDisplay);
	}

	static KHRDisplay create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("VK_KHR_display") )
			return null;

		return VK.checkExtension("VK_KHR_display", create(provider));
	}

	static KHRDisplay create(FunctionProvider provider) {
		KHRDisplay funcs = new KHRDisplay(provider);

		boolean supported = checkFunctions(
			funcs.GetPhysicalDeviceDisplayPropertiesKHR, funcs.GetPhysicalDeviceDisplayPlanePropertiesKHR, funcs.GetDisplayPlaneSupportedDisplaysKHR, 
			funcs.GetDisplayModePropertiesKHR, funcs.CreateDisplayModeKHR, funcs.GetDisplayPlaneCapabilitiesKHR, funcs.CreateDisplayPlaneSurfaceKHR
		);

		return supported ? funcs : null;
	}

	// --- [ vkGetPhysicalDeviceDisplayPropertiesKHR ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceDisplayPropertiesKHR GetPhysicalDeviceDisplayPropertiesKHR} */
	public static int nvkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
		long __functionAddress = getInstance(physicalDevice).GetPhysicalDeviceDisplayPropertiesKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pProperties != NULL ) VkDisplayPropertiesKHR.validate(pProperties, (int)pPropertyCount);
		}
		return callPPPI(__functionAddress, physicalDevice.address(), pPropertyCount, pProperties);
	}

	/**
	 * Queries information about the available displays.
	 *
	 * @param physicalDevice a valid physical device
	 * @param pPropertyCount the number of entries in the array pointed to by {@code pProperties}
	 * @param pProperties    a pointer to an array of {@code pPropertyCount} {@link VkDisplayPropertiesKHR} structures
	 */
	public static int vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, ByteBuffer pPropertyCount, VkDisplayPropertiesKHR.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1 << 2);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.getInt(pPropertyCount.position()));
		}
		return nvkGetPhysicalDeviceDisplayPropertiesKHR(physicalDevice, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** Alternative version of: {@link #vkGetPhysicalDeviceDisplayPropertiesKHR GetPhysicalDeviceDisplayPropertiesKHR} */
	public static int vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, IntBuffer pPropertyCount, VkDisplayPropertiesKHR.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkGetPhysicalDeviceDisplayPropertiesKHR(physicalDevice, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	// --- [ vkGetPhysicalDeviceDisplayPlanePropertiesKHR ] ---

	/** Unsafe version of {@link #vkGetPhysicalDeviceDisplayPlanePropertiesKHR GetPhysicalDeviceDisplayPlanePropertiesKHR} */
	public static int nvkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
		long __functionAddress = getInstance(physicalDevice).GetPhysicalDeviceDisplayPlanePropertiesKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPPI(__functionAddress, physicalDevice.address(), pPropertyCount, pProperties);
	}

	/**
	 * Queries the plane properties.
	 *
	 * @param physicalDevice a valid physical device
	 * @param pPropertyCount the number of entries in the array pointed to by {@code pProperties}
	 * @param pProperties    a pointer to an array of {@code pPropertyCount} {@link VkDisplayPlanePropertiesKHR} structures.
	 */
	public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, ByteBuffer pPropertyCount, VkDisplayPlanePropertiesKHR.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1 << 2);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.getInt(pPropertyCount.position()));
		}
		return nvkGetPhysicalDeviceDisplayPlanePropertiesKHR(physicalDevice, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** Alternative version of: {@link #vkGetPhysicalDeviceDisplayPlanePropertiesKHR GetPhysicalDeviceDisplayPlanePropertiesKHR} */
	public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, IntBuffer pPropertyCount, VkDisplayPlanePropertiesKHR.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkGetPhysicalDeviceDisplayPlanePropertiesKHR(physicalDevice, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	// --- [ vkGetDisplayPlaneSupportedDisplaysKHR ] ---

	/** Unsafe version of {@link #vkGetDisplayPlaneSupportedDisplaysKHR GetDisplayPlaneSupportedDisplaysKHR} */
	public static int nvkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, int planeIndex, long pDisplayCount, long pDisplays) {
		long __functionAddress = getInstance(physicalDevice).GetDisplayPlaneSupportedDisplaysKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPIPPI(__functionAddress, physicalDevice.address(), planeIndex, pDisplayCount, pDisplays);
	}

	/**
	 * Gets list of displays a plane supports.
	 *
	 * @param physicalDevice a valid physical device
	 * @param planeIndex     the plane which the application wishes to use
	 * @param pDisplayCount  the number of entries in the array pointed to by {@code pDisplays}
	 * @param pDisplays      a pointer to an array of {@code pDisplayCount} {@code VkDisplayKHR} handles.
	 */
	public static int vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, int planeIndex, ByteBuffer pDisplayCount, ByteBuffer pDisplays) {
		if ( CHECKS ) {
			checkBuffer(pDisplayCount, 1 << 2);
			if ( pDisplays != null ) checkBuffer(pDisplays, pDisplayCount.getInt(pDisplayCount.position()) << 3);
		}
		return nvkGetDisplayPlaneSupportedDisplaysKHR(physicalDevice, planeIndex, memAddress(pDisplayCount), memAddressSafe(pDisplays));
	}

	/** Alternative version of: {@link #vkGetDisplayPlaneSupportedDisplaysKHR GetDisplayPlaneSupportedDisplaysKHR} */
	public static int vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, int planeIndex, IntBuffer pDisplayCount, LongBuffer pDisplays) {
		if ( CHECKS ) {
			checkBuffer(pDisplayCount, 1);
			if ( pDisplays != null ) checkBuffer(pDisplays, pDisplayCount.get(pDisplayCount.position()));
		}
		return nvkGetDisplayPlaneSupportedDisplaysKHR(physicalDevice, planeIndex, memAddress(pDisplayCount), memAddressSafe(pDisplays));
	}

	// --- [ vkGetDisplayModePropertiesKHR ] ---

	/** Unsafe version of {@link #vkGetDisplayModePropertiesKHR GetDisplayModePropertiesKHR} */
	public static int nvkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, long display, long pPropertyCount, long pProperties) {
		long __functionAddress = getInstance(physicalDevice).GetDisplayModePropertiesKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJPPI(__functionAddress, physicalDevice.address(), display, pPropertyCount, pProperties);
	}

	/**
	 * Gets the set of mode properties supported by the display.
	 *
	 * @param physicalDevice the physical device associated with the display
	 * @param display        a display present on the physical device
	 * @param pPropertyCount the number of entries in the array pointed to by {@code pProperties}
	 * @param pProperties    a pointer to an array of {@code pPropertyCount} {@link VkDisplayModePropertiesKHR} structures
	 */
	public static int vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, long display, ByteBuffer pPropertyCount, VkDisplayModePropertiesKHR.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1 << 2);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.getInt(pPropertyCount.position()));
		}
		return nvkGetDisplayModePropertiesKHR(physicalDevice, display, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	/** Alternative version of: {@link #vkGetDisplayModePropertiesKHR GetDisplayModePropertiesKHR} */
	public static int vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, long display, IntBuffer pPropertyCount, VkDisplayModePropertiesKHR.Buffer pProperties) {
		if ( CHECKS ) {
			checkBuffer(pPropertyCount, 1);
			if ( pProperties != null ) checkBuffer(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		return nvkGetDisplayModePropertiesKHR(physicalDevice, display, memAddress(pPropertyCount), pProperties == null ? NULL : pProperties.address());
	}

	// --- [ vkCreateDisplayModeKHR ] ---

	/** Unsafe version of {@link #vkCreateDisplayModeKHR CreateDisplayModeKHR} */
	public static int nvkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, long display, long pCreateInfo, long pAllocator, long pMode) {
		long __functionAddress = getInstance(physicalDevice).CreateDisplayModeKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPJPPPI(__functionAddress, physicalDevice.address(), display, pCreateInfo, pAllocator, pMode);
	}

	/**
	 * Creates a display mode.
	 *
	 * @param physicalDevice the physical device associated with display
	 * @param display        the display to create an additional mode
	 * @param pCreateInfo    a {@link VkDisplayModeCreateInfoKHR} structure describing the new mode to create
	 * @param pAllocator     the allocator used for host memory allocated for the mode object
	 * @param pMode          returns the handle of the mode created
	 */
	public static int vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, long display, VkDisplayModeCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pMode) {
		if ( CHECKS )
			checkBuffer(pMode, 1 << 3);
		return nvkCreateDisplayModeKHR(physicalDevice, display, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pMode));
	}

	/** Alternative version of: {@link #vkCreateDisplayModeKHR CreateDisplayModeKHR} */
	public static int vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, long display, VkDisplayModeCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pMode) {
		if ( CHECKS )
			checkBuffer(pMode, 1);
		return nvkCreateDisplayModeKHR(physicalDevice, display, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pMode));
	}

	// --- [ vkGetDisplayPlaneCapabilitiesKHR ] ---

	/** Unsafe version of {@link #vkGetDisplayPlaneCapabilitiesKHR GetDisplayPlaneCapabilitiesKHR} */
	public static int nvkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, long mode, int planeIndex, long pCapabilities) {
		long __functionAddress = getInstance(physicalDevice).GetDisplayPlaneCapabilitiesKHR;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPJIPI(__functionAddress, physicalDevice.address(), mode, planeIndex, pCapabilities);
	}

	/**
	 * Gets the capabilities of a mode and plane combination.
	 *
	 * @param physicalDevice the physical device associated with the display
	 * @param mode           the display mode the application intends to program when using the specified plane
	 * @param planeIndex     the plane which the application intends to use with the display
	 * @param pCapabilities  a pointer to a {@link VkDisplayPlaneCapabilitiesKHR} struct
	 */
	public static int vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, long mode, int planeIndex, VkDisplayPlaneCapabilitiesKHR pCapabilities) {
		return nvkGetDisplayPlaneCapabilitiesKHR(physicalDevice, mode, planeIndex, pCapabilities.address());
	}

	// --- [ vkCreateDisplayPlaneSurfaceKHR ] ---

	/** Unsafe version of {@link #vkCreateDisplayPlaneSurfaceKHR CreateDisplayPlaneSurfaceKHR} */
	public static int nvkCreateDisplayPlaneSurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
		long __functionAddress = getInstance(instance).CreateDisplayPlaneSurfaceKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, instance.address(), pCreateInfo, pAllocator, pSurface);
	}

	/**
	 * Creates a {@code VkSurfaceKHR} structure representing a display plane and mode.
	 *
	 * @param instance    the {@code VkInstance} to associate the surface
	 * @param pCreateInfo a pointer to an instance of the {@link VkDisplaySurfaceCreateInfoKHR} structure containing the parameters affecting the creation of the surface object
	 * @param pAllocator  the allocator used for host memory allocated for the surface object
	 * @param pSurface    the resulting surface object handle is returned in {@code pSurface}
	 */
	public static int vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, VkDisplaySurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pSurface) {
		if ( CHECKS )
			checkBuffer(pSurface, 1 << 3);
		return nvkCreateDisplayPlaneSurfaceKHR(instance, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSurface));
	}

	/** Alternative version of: {@link #vkCreateDisplayPlaneSurfaceKHR CreateDisplayPlaneSurfaceKHR} */
	public static int vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, VkDisplaySurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSurface) {
		if ( CHECKS )
			checkBuffer(pSurface, 1);
		return nvkCreateDisplayPlaneSurfaceKHR(instance, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSurface));
	}

}