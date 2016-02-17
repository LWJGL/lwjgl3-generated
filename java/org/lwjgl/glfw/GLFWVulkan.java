/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

import org.lwjgl.vulkan.*;

/** Native bindings to the GLFW library's Vulkan functions. */
public class GLFWVulkan {

	/** Function address. */
	@JavadocExclude
	public final long
		GetInstanceProcAddress,
		GetPhysicalDevicePresentationSupport,
		CreateWindowSurface;

	@JavadocExclude
	protected GLFWVulkan() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GLFWVulkan(FunctionProvider provider) {
		GetInstanceProcAddress = checkFunctionAddress(provider.getFunctionAddress("glfwGetInstanceProcAddress"));
		GetPhysicalDevicePresentationSupport = checkFunctionAddress(provider.getFunctionAddress("glfwGetPhysicalDevicePresentationSupport"));
		CreateWindowSurface = checkFunctionAddress(provider.getFunctionAddress("glfwCreateWindowSurface"));
	}

	// --- [ Function Addresses ] ---

	private static final GLFWVulkan instance = new GLFWVulkan(getLibrary());

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return GLFW.getLibrary();
	}

	/** Returns the {@link GLFWVulkan} instance. */
	public static GLFWVulkan getInstance() {
		return instance;
	}

	// --- [ glfwGetInstanceProcAddress ] ---

	/** Unsafe version of {@link #glfwGetInstanceProcAddress GetInstanceProcAddress} */
	@JavadocExclude
	public static long nglfwGetInstanceProcAddress(long instance, long procname) {
		long __functionAddress = getInstance().GetInstanceProcAddress;
		return invokePPP(__functionAddress, instance, procname);
	}

	/**
	 * Returns the address of the specified Vulkan core or extension function for the specified instance. If instance is set to {@code NULL} it can return any
	 * function exported from the Vulkan loader, including at least the following functions:
	 * 
	 * <ul>
	 * <li>{@link VK10#vkEnumerateInstanceExtensionProperties}</li>
	 * <li>{@link VK10#vkEnumerateInstanceLayerProperties}</li>
	 * <li>{@link VK10#vkCreateInstance}</li>
	 * <li>{@link VK10#vkGetInstanceProcAddr}</li>
	 * </ul>
	 * 
	 * <p>If Vulkan is not available on the machine, this function returns {@code NULL} and generates a {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE} error. Call {@link GLFW#glfwVulkanSupported VulkanSupported} to
	 * check whether Vulkan is available.</p>
	 * 
	 * <p>This function is equivalent to calling {@link VK10#vkGetInstanceProcAddr} with a platform-specific query of the Vulkan loader as a fallback.</p>
	 * 
	 * <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED} and {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE}.</p>
	 * 
	 * <p>The returned function pointer is valid until the library is terminated.</p>
	 * 
	 * <p>This function may be called from any thread.</p>
	 *
	 * @param instance the Vulkan instance to query, or {@code NULL} to retrieve functions related to instance creation
	 * @param procname the ASCII encoded name of the function
	 *
	 * @return the address of the function, or {@code NULL} if an error occurred
	 *
	 * @since version 3.2
	 */
	public static long glfwGetInstanceProcAddress(long instance, ByteBuffer procname) {
		if ( CHECKS )
			checkNT1(procname);
		return nglfwGetInstanceProcAddress(instance, memAddress(procname));
	}

	/** CharSequence version of: {@link #glfwGetInstanceProcAddress GetInstanceProcAddress} */
	public static long glfwGetInstanceProcAddress(long instance, CharSequence procname) {
		APIBuffer __buffer = apiBuffer();
		int procnameEncoded = __buffer.stringParamASCII(procname, true);
		return nglfwGetInstanceProcAddress(instance, __buffer.address(procnameEncoded));
	}

	// --- [ glfwGetPhysicalDevicePresentationSupport ] ---

	/**
	 * Returns whether the specified queue family of the specified physical device supports presentation to the platform GLFW was built for.
	 * 
	 * <p>If Vulkan or the required window surface creation instance extensions are not available on the machine, or if the specified instance was not
	 * created with the required extensions, this function returns {@link GLFW#GLFW_FALSE FALSE} and generates a {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE} error. Call {@link GLFW#glfwVulkanSupported VulkanSupported} to
	 * check whether Vulkan is available and {@link GLFW#glfwGetRequiredInstanceExtensions GetRequiredInstanceExtensions} to check what instance extensions are required.</p>
	 * 
	 * <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}, {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE} and {@link GLFW#GLFW_PLATFORM_ERROR PLATFORM_ERROR}.</p>
	 * 
	 * <p>This function may be called from any thread. For synchronization details of Vulkan objects, see the Vulkan specification.</p>
	 *
	 * @param instance    the instance that the physical device belongs to
	 * @param device      the physical device that the queue family belongs to
	 * @param queuefamily the index of the queue family to query
	 *
	 * @return {@link GLFW#GLFW_TRUE TRUE} if the queue family supports presentation, or {@link GLFW#GLFW_FALSE FALSE} otherwise
	 *
	 * @since version 3.2
	 */
	public static int glfwGetPhysicalDevicePresentationSupport(long instance, long device, int queuefamily) {
		long __functionAddress = getInstance().GetPhysicalDevicePresentationSupport;
		if ( CHECKS ) {
			checkPointer(instance);
			checkPointer(device);
		}
		return invokePPII(__functionAddress, instance, device, queuefamily);
	}

	// --- [ glfwCreateWindowSurface ] ---

	/** Unsafe version of {@link #glfwCreateWindowSurface CreateWindowSurface} */
	@JavadocExclude
	public static int nglfwCreateWindowSurface(long instance, long window, long allocator, long surface) {
		long __functionAddress = getInstance().CreateWindowSurface;
		if ( CHECKS ) {
			checkPointer(instance);
			checkPointer(window);
		}
		return invokePPPPI(__functionAddress, instance, window, allocator, surface);
	}

	/**
	 * Creates a Vulkan surface for the specified window.
	 * 
	 * <p>If the Vulkan loader was not found at initialization, this function returns {@link VK10#VK_ERROR_INITIALIZATION_FAILED} and generates a
	 * {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE} error. Call {@link GLFW#glfwVulkanSupported VulkanSupported} to check whether the Vulkan loader was found.</p>
	 * 
	 * <p>If the required window surface creation instance extensions are not available or if the specified instance was not created with these extensions
	 * enabled, this function returns {@link VK10#VK_ERROR_EXTENSION_NOT_PRESENT} and generates a {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE} error. Call
	 * {@link GLFW#glfwGetRequiredInstanceExtensions GetRequiredInstanceExtensions} to check what instance extensions are required.</p>
	 * 
	 * <p>The window surface must be destroyed before the specified Vulkan instance. It is the responsibility of the caller to destroy the window surface.
	 * GLFW does not destroy it for you. Call {@link VK10#vkDestroySurfaceKHR} to destroy the surface.</p>
	 * 
	 * <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}, {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE} and {@link GLFW#GLFW_PLATFORM_ERROR PLATFORM_ERROR}.</p>
	 * 
	 * <p>If an error occurs before the creation call is made, GLFW returns the Vulkan error code most appropriate for the error. Appropriate use of
	 * {@link GLFW#glfwVulkanSupported VulkanSupported} and {@link GLFW#glfwGetRequiredInstanceExtensions GetRequiredInstanceExtensions} should eliminate almost all occurrences of these errors.</p>
	 * 
	 * <p>This function may be called from any thread. For synchronization details of Vulkan objects, see the Vulkan specification.</p>
	 *
	 * @param instance  the Vulkan instance to create the surface in
	 * @param window    the window to create the surface for
	 * @param allocator the allocator to use, or {@code NULL} to use the default allocator.
	 * @param surface   where to store the handle of the surface. This is set to {@code VK_NULL_HANDLE} if an error occurred.
	 *
	 * @return {@link VK10#VK_SUCCESS} if successful, or a Vulkan error code if an error occurred
	 *
	 * @since version 3.2
	 */
	public static int glfwCreateWindowSurface(long instance, long window, VkAllocationCallbacks allocator, ByteBuffer surface) {
		if ( CHECKS )
			checkBuffer(surface, 1 << POINTER_SHIFT);
		return nglfwCreateWindowSurface(instance, window, allocator == null ? NULL : allocator.address(), memAddress(surface));
	}

	/** Alternative version of: {@link #glfwCreateWindowSurface CreateWindowSurface} */
	public static int glfwCreateWindowSurface(long instance, long window, VkAllocationCallbacks allocator, PointerBuffer surface) {
		if ( CHECKS )
			checkBuffer(surface, 1);
		return nglfwCreateWindowSurface(instance, window, allocator == null ? NULL : allocator.address(), memAddress(surface));
	}

}