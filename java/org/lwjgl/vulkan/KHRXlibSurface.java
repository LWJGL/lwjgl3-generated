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
 * The {@code VK_KHR_xlib_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the
 * {@code VK_KHR_surface} extension) that refers to an X11 window, using the Xlib client-side library, as well as a query to determine support for
 * rendering via Xlib.
 */
public class KHRXlibSurface {

	/** The extension specification version. */
	public static final int VK_KHR_XLIB_SURFACE_SPEC_VERSION = 0x6;

	/** The extension name. */
	public static final String VK_KHR_XLIB_SURFACE_EXTENSION_NAME = "VK_KHR_xlib_surface";

	/** VkStructureType */
	public static final int VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR = 1000004000;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateXlibSurfaceKHR,
		GetPhysicalDeviceXlibPresentationSupportKHR;

	@JavadocExclude
	protected KHRXlibSurface() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public KHRXlibSurface(FunctionProvider provider) {
		CreateXlibSurfaceKHR = checkFunctionAddress(provider.getFunctionAddress("vkCreateXlibSurfaceKHR"));
		GetPhysicalDeviceXlibPresentationSupportKHR = checkFunctionAddress(provider.getFunctionAddress("vkGetPhysicalDeviceXlibPresentationSupportKHR"));
	}

	// --- [ Function Addresses ] ---

	private static final KHRXlibSurface instance = new KHRXlibSurface(getLibrary());

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return VK10.getLibrary();
	}

	/** Returns the {@link KHRXlibSurface} instance. */
	public static KHRXlibSurface getInstance() {
		return instance;
	}

	// --- [ vkCreateXlibSurfaceKHR ] ---

	/** Unsafe version of {@link #vkCreateXlibSurfaceKHR CreateXlibSurfaceKHR} */
	@JavadocExclude
	public static int nvkCreateXlibSurfaceKHR(long instance, long pCreateInfo, long pAllocator, long pSurface) {
		long __functionAddress = getInstance().CreateXlibSurfaceKHR;
		if ( CHECKS )
			checkPointer(instance);
		return callPPPPI(__functionAddress, instance, pCreateInfo, pAllocator, pSurface);
	}

	/**
	 * Creates a {@code VkSurfaceKHR} object for an X11 window, using the Xlib client-side library.
	 *
	 * @param instance    the {@code VkInstance} to associate the surface.
	 * @param pCreateInfo a pointer to an instance of the {@link VkXlibSurfaceCreateInfoKHR} structure containing the parameters affecting the creation of the surface object
	 * @param pAllocator  the allocator used for host memory allocated for the surface object
	 * @param pSurface    the resulting surface object handle is returned in {@code pSurface}
	 */
	public static int vkCreateXlibSurfaceKHR(long instance, VkXlibSurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pSurface) {
		if ( CHECKS )
			checkBuffer(pSurface, 1 << 3);
		return nvkCreateXlibSurfaceKHR(instance, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSurface));
	}

	/** Alternative version of: {@link #vkCreateXlibSurfaceKHR CreateXlibSurfaceKHR} */
	public static int vkCreateXlibSurfaceKHR(long instance, VkXlibSurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pSurface) {
		if ( CHECKS )
			checkBuffer(pSurface, 1);
		return nvkCreateXlibSurfaceKHR(instance, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSurface));
	}

	// --- [ vkGetPhysicalDeviceXlibPresentationSupportKHR ] ---

	/**
	 * Queries physical device for presentation to X11 server using Xlib.
	 *
	 * @param physicalDevice   a physical device handle
	 * @param queueFamilyIndex index to a queue family
	 * @param dpy              pointer to an Xlib Display
	 * @param visualID         an X11 VisualID
	 */
	public static int vkGetPhysicalDeviceXlibPresentationSupportKHR(long physicalDevice, int queueFamilyIndex, long dpy, long visualID) {
		long __functionAddress = getInstance().GetPhysicalDeviceXlibPresentationSupportKHR;
		if ( CHECKS ) {
			checkPointer(physicalDevice);
			checkPointer(dpy);
		}
		return callPIPPI(__functionAddress, physicalDevice, queueFamilyIndex, dpy, visualID);
	}

}