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

/**
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_KHR_get_physical_device_properties2</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>60</dd>
 * <dt><b>Status</b></dt>
 * <dd>Complete.</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-11-02</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Ian Elliott, Google</li>
 * </ul></dd>
 * <dt><b>Contacts</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz (jbolz 'at' nvidia.com)</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>This extension provides new entry points to query device features, device properties, and format properties in a way that can be easily extended by other extensions, without introducing any further entry points. The Vulkan 1.0 feature/limit/formatproperty structures do not include {@code sType}/{@code pNext} members. This extension wraps them in new structures with {@code sType}/{@code pNext} members, so an application can query a chain of feature/limit/formatproperty structures by constructing the chain and letting the implementation fill them in. A new command is added for each ftext:vkGetPhysicalDevice* command in core Vulkan 1.0. The new feature structure (and a chain of extension structures) can also be passed in to device creation to enable features.</p>
 * 
 * <p>This extension also allows applications to use the physical-device components of device extensions before {@link VK10#vkCreateDevice CreateDevice} is called.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <pre><code>    // Get features with a hypothetical future extension.
    VkHypotheticalExtensionFeaturesKHR hypotheticalFeatures =
    {
        VK_STRUCTURE_TYPE_HYPOTHETICAL_FEATURES_KHR,                            // sType
        NULL,                                                                   // pNext
    };

    VkPhysicalDeviceFeatures2KHR features =
    {
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR,                       // sType
        &hypotheticalFeatures,                                                  // pNext
    };

    // After this call, features and hypotheticalFeatures have been filled out.
    vkGetPhysicalDeviceFeatures2KHR(physicalDevice, &features);

    // Properties/limits can be chained and queried similarly.

    // Enable some features:
    VkHypotheticalExtensionFeaturesKHR enabledHypotheticalFeatures =
    {
        VK_STRUCTURE_TYPE_HYPOTHETICAL_FEATURES_KHR,                            // sType
        NULL,                                                                   // pNext
    };

    VkPhysicalDeviceFeatures2KHR enabledFeatures =
    {
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR,                       // sType
        &enabledHypotheticalFeatures,                                           // pNext
    };

    enabledFeatures.features.xyz = VK_TRUE;
    enabledHypotheticalFeatures.abc = VK_TRUE;

    VkDeviceCreateInfo deviceCreateInfo =
    {
        VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO,                                   // sType
        &enabledFeatures,                                                       // pNext
        ...
        NULL,                                                                   // pEnabledFeatures
    }

    VkDevice device;
    vkCreateDevice(physicalDevice, &deviceCreateInfo, NULL, &device);</code></pre>
 */
public class KHRGetPhysicalDeviceProperties2 {

	/** The extension specification version. */
	public static final int VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME = "VK_KHR_get_physical_device_properties2";

	/**
	 * Extends {@code VkStructureType}.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2_KHR}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2_KHR STRUCTURE_TYPE_FORMAT_PROPERTIES_2_KHR}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2_KHR STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2_KHR}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR}</li>
	 * </ul>
	 */
	public static final int
		VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR                 = 1000059000,
		VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2_KHR               = 1000059001,
		VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2_KHR                        = 1000059002,
		VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR                  = 1000059003,
		VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR        = 1000059004,
		VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2_KHR                  = 1000059005,
		VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR        = 1000059006,
		VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR           = 1000059007,
		VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR = 1000059008;

	protected KHRGetPhysicalDeviceProperties2() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilitiesInstance caps) {
		return checkFunctions(
			caps.vkGetPhysicalDeviceFeatures2KHR, caps.vkGetPhysicalDeviceProperties2KHR, caps.vkGetPhysicalDeviceFormatProperties2KHR, 
			caps.vkGetPhysicalDeviceImageFormatProperties2KHR, caps.vkGetPhysicalDeviceQueueFamilyProperties2KHR, caps.vkGetPhysicalDeviceMemoryProperties2KHR, 
			caps.vkGetPhysicalDeviceSparseImageFormatProperties2KHR
		);
	}

	// --- [ vkGetPhysicalDeviceFeatures2KHR ] ---

	/** Unsafe version of: {@link #vkGetPhysicalDeviceFeatures2KHR GetPhysicalDeviceFeatures2KHR} */
	public static void nvkGetPhysicalDeviceFeatures2KHR(VkPhysicalDevice physicalDevice, long pFeatures) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFeatures2KHR;
		if ( CHECKS )
			check(__functionAddress);
		callPPV(__functionAddress, physicalDevice.address(), pFeatures);
	}

	/**
	 * Reports capabilities of a physical device.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query supported features defined by the core or extensions, call:</p>
	 * 
	 * <pre><code>void vkGetPhysicalDeviceFeatures2KHR(
    VkPhysicalDevice                            physicalDevice,
    VkPhysicalDeviceFeatures2KHR*               pFeatures);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Each structure in {@code pFeatures} and its {@code pNext} chain contain members corresponding to fine-grained features. {@link #vkGetPhysicalDeviceFeatures2KHR GetPhysicalDeviceFeatures2KHR} writes each member to a boolean value indicating whether that feature is supported.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pFeatures} <b>must</b> be a pointer to a {@link VkPhysicalDeviceFeatures2KHR} structure</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPhysicalDeviceFeatures2KHR}</p>
	 *
	 * @param physicalDevice the physical device from which to query the supported features.
	 * @param pFeatures      a pointer to a {@link VkPhysicalDeviceFeatures2KHR} structure in which the physical device features are returned.
	 */
	public static void vkGetPhysicalDeviceFeatures2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2KHR pFeatures) {
		nvkGetPhysicalDeviceFeatures2KHR(physicalDevice, pFeatures.address());
	}

	// --- [ vkGetPhysicalDeviceProperties2KHR ] ---

	/** Unsafe version of: {@link #vkGetPhysicalDeviceProperties2KHR GetPhysicalDeviceProperties2KHR} */
	public static void nvkGetPhysicalDeviceProperties2KHR(VkPhysicalDevice physicalDevice, long pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceProperties2KHR;
		if ( CHECKS )
			check(__functionAddress);
		callPPV(__functionAddress, physicalDevice.address(), pProperties);
	}

	/**
	 * Returns properties of a physical device.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query general properties of physical devices once enumerated, call:</p>
	 * 
	 * <pre><code>void vkGetPhysicalDeviceProperties2KHR(
    VkPhysicalDevice                            physicalDevice,
    VkPhysicalDeviceProperties2KHR*             pProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>Each structure in {@code pProperties} and its {@code pNext} chain contain members corresponding to properties or implementation-dependent limits. {@link #vkGetPhysicalDeviceProperties2KHR GetPhysicalDeviceProperties2KHR} writes each member to a value indicating the value of that property or limit.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pProperties} <b>must</b> be a pointer to a {@link VkPhysicalDeviceProperties2KHR} structure</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPhysicalDeviceProperties2KHR}</p>
	 *
	 * @param physicalDevice the handle to the physical device whose properties will be queried.
	 * @param pProperties    points to an instance of the {@link VkPhysicalDeviceProperties2KHR} structure, that will be filled with returned information.
	 */
	public static void vkGetPhysicalDeviceProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2KHR pProperties) {
		nvkGetPhysicalDeviceProperties2KHR(physicalDevice, pProperties.address());
	}

	// --- [ vkGetPhysicalDeviceFormatProperties2KHR ] ---

	/** Unsafe version of: {@link #vkGetPhysicalDeviceFormatProperties2KHR GetPhysicalDeviceFormatProperties2KHR} */
	public static void nvkGetPhysicalDeviceFormatProperties2KHR(VkPhysicalDevice physicalDevice, int format, long pFormatProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFormatProperties2KHR;
		if ( CHECKS )
			check(__functionAddress);
		callPPV(__functionAddress, physicalDevice.address(), format, pFormatProperties);
	}

	/**
	 * Lists physical device's format capabilities.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query supported format features which are properties of the physical device, call:</p>
	 * 
	 * <pre><code>void vkGetPhysicalDeviceFormatProperties2KHR(
    VkPhysicalDevice                            physicalDevice,
    VkFormat                                    format,
    VkFormatProperties2KHR*                     pFormatProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkGetPhysicalDeviceFormatProperties2KHR GetPhysicalDeviceFormatProperties2KHR} behaves similarly to {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}, with the ability to return extended information in a {@code pNext} chain of output structures.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
	 * <li>{@code pFormatProperties} <b>must</b> be a pointer to a {@link VkFormatProperties2KHR} structure</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkFormatProperties2KHR}</p>
	 *
	 * @param physicalDevice    the physical device from which to query the format properties.
	 * @param format            the format whose properties are queried.
	 * @param pFormatProperties a pointer to a {@link VkFormatProperties2KHR} structure in which physical device properties for {@code format} are returned.
	 */
	public static void vkGetPhysicalDeviceFormatProperties2KHR(VkPhysicalDevice physicalDevice, int format, VkFormatProperties2KHR pFormatProperties) {
		nvkGetPhysicalDeviceFormatProperties2KHR(physicalDevice, format, pFormatProperties.address());
	}

	// --- [ vkGetPhysicalDeviceImageFormatProperties2KHR ] ---

	/** Unsafe version of: {@link #vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR} */
	public static int nvkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, long pImageFormatInfo, long pImageFormatProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceImageFormatProperties2KHR;
		if ( CHECKS )
			check(__functionAddress);
		return callPPPI(__functionAddress, physicalDevice.address(), pImageFormatInfo, pImageFormatProperties);
	}

	/**
	 * Lists physical device's image format capabilities.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query additional capabilities specific to image types, call:</p>
	 * 
	 * <pre><code>VkResult vkGetPhysicalDeviceImageFormatProperties2KHR(
    VkPhysicalDevice                            physicalDevice,
    const VkPhysicalDeviceImageFormatInfo2KHR*  pImageFormatInfo,
    VkImageFormatProperties2KHR*                pImageFormatProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR} behaves similarly to {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}, with the ability to return extended information in a {@code pNext} chain of output structures.</p>
	 * 
	 * <p>If the loader implementation emulates {@link #vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR} on a device that does not support the extension, and the query involves a structure the loader does not support, {@link #vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR} returns {@link VK10#VK_ERROR_FORMAT_NOT_SUPPORTED ERROR_FORMAT_NOT_SUPPORTED}.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pImageFormatInfo} <b>must</b> be a pointer to a valid {@link VkPhysicalDeviceImageFormatInfo2KHR} structure</li>
	 * <li>{@code pImageFormatProperties} <b>must</b> be a pointer to a {@link VkImageFormatProperties2KHR} structure</li>
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
	 * <li>{@link VK10#VK_ERROR_FORMAT_NOT_SUPPORTED ERROR_FORMAT_NOT_SUPPORTED}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkImageFormatProperties2KHR}, {@link VkPhysicalDeviceImageFormatInfo2KHR}</p>
	 *
	 * @param physicalDevice         the physical device from which to query the image capabilities.
	 * @param pImageFormatInfo       points to an instance of the {@link VkPhysicalDeviceImageFormatInfo2KHR} structure, describing the parameters that would be consumed by {@link VK10#vkCreateImage CreateImage}.
	 * @param pImageFormatProperties points to an instance of the {@link VkImageFormatProperties2KHR} structure in which capabilities are returned.
	 */
	public static int vkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2KHR pImageFormatInfo, VkImageFormatProperties2KHR pImageFormatProperties) {
		return nvkGetPhysicalDeviceImageFormatProperties2KHR(physicalDevice, pImageFormatInfo.address(), pImageFormatProperties.address());
	}

	// --- [ vkGetPhysicalDeviceQueueFamilyProperties2KHR ] ---

	/**
	 * Unsafe version of: {@link #vkGetPhysicalDeviceQueueFamilyProperties2KHR GetPhysicalDeviceQueueFamilyProperties2KHR}
	 *
	 * @param pQueueFamilyPropertyCount a pointer to an integer related to the number of queue families available or queried, as described in {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}.
	 */
	public static void nvkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties2KHR;
		if ( CHECKS )
			check(__functionAddress);
		callPPPV(__functionAddress, physicalDevice.address(), pQueueFamilyPropertyCount, pQueueFamilyProperties);
	}

	/**
	 * Reports properties of the queues of the specified physical device.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query properties of queues available on a physical device, call:</p>
	 * 
	 * <pre><code>void vkGetPhysicalDeviceQueueFamilyProperties2KHR(
    VkPhysicalDevice                            physicalDevice,
    uint32_t*                                   pQueueFamilyPropertyCount,
    VkQueueFamilyProperties2KHR*                pQueueFamilyProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkGetPhysicalDeviceQueueFamilyProperties2KHR GetPhysicalDeviceQueueFamilyProperties2KHR} behaves similarly to {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}, with the ability to return extended information in a {@code pNext} chain of output structures.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pQueueFamilyPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pQueueFamilyPropertyCount} is not 0, and {@code pQueueFamilyProperties} is not {@code NULL}, {@code pQueueFamilyProperties} <b>must</b> be a pointer to an array of {@code pQueueFamilyPropertyCount} {@link VkQueueFamilyProperties2KHR} structures</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkQueueFamilyProperties2KHR}</p>
	 *
	 * @param physicalDevice            the handle to the physical device whose properties will be queried.
	 * @param pQueueFamilyPropertyCount a pointer to an integer related to the number of queue families available or queried, as described in {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}.
	 * @param pQueueFamilyProperties    either {@code NULL} or a pointer to an array of {@link VkQueueFamilyProperties2KHR} structures.
	 */
	public static void vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, IntBuffer pQueueFamilyPropertyCount, VkQueueFamilyProperties2KHR.Buffer pQueueFamilyProperties) {
		if ( CHECKS ) {
			check(pQueueFamilyPropertyCount, 1);
			checkSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount.get(pQueueFamilyPropertyCount.position()));
		}
		nvkGetPhysicalDeviceQueueFamilyProperties2KHR(physicalDevice, memAddress(pQueueFamilyPropertyCount), memAddressSafe(pQueueFamilyProperties));
	}

	// --- [ vkGetPhysicalDeviceMemoryProperties2KHR ] ---

	/** Unsafe version of: {@link #vkGetPhysicalDeviceMemoryProperties2KHR GetPhysicalDeviceMemoryProperties2KHR} */
	public static void nvkGetPhysicalDeviceMemoryProperties2KHR(VkPhysicalDevice physicalDevice, long pMemoryProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceMemoryProperties2KHR;
		if ( CHECKS )
			check(__functionAddress);
		callPPV(__functionAddress, physicalDevice.address(), pMemoryProperties);
	}

	/**
	 * Reports memory information for the specified physical device.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query memory properties, call:</p>
	 * 
	 * <pre><code>void vkGetPhysicalDeviceMemoryProperties2KHR(
    VkPhysicalDevice                            physicalDevice,
    VkPhysicalDeviceMemoryProperties2KHR*       pMemoryProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkGetPhysicalDeviceMemoryProperties2KHR GetPhysicalDeviceMemoryProperties2KHR} behaves similarly to {@link VK10#vkGetPhysicalDeviceMemoryProperties GetPhysicalDeviceMemoryProperties}, with the ability to return extended information in a {@code pNext} chain of output structures.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pMemoryProperties} <b>must</b> be a pointer to a {@link VkPhysicalDeviceMemoryProperties2KHR} structure</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPhysicalDeviceMemoryProperties2KHR}</p>
	 *
	 * @param physicalDevice    the handle to the device to query.
	 * @param pMemoryProperties points to an instance of {@link VkPhysicalDeviceMemoryProperties2KHR} structure in which the properties are returned.
	 */
	public static void vkGetPhysicalDeviceMemoryProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2KHR pMemoryProperties) {
		nvkGetPhysicalDeviceMemoryProperties2KHR(physicalDevice, pMemoryProperties.address());
	}

	// --- [ vkGetPhysicalDeviceSparseImageFormatProperties2KHR ] ---

	/**
	 * Unsafe version of: {@link #vkGetPhysicalDeviceSparseImageFormatProperties2KHR GetPhysicalDeviceSparseImageFormatProperties2KHR}
	 *
	 * @param pPropertyCount a pointer to an integer related to the number of sparse format properties available or queried, as described below.
	 */
	public static void nvkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, long pFormatInfo, long pPropertyCount, long pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties2KHR;
		if ( CHECKS )
			check(__functionAddress);
		callPPPPV(__functionAddress, physicalDevice.address(), pFormatInfo, pPropertyCount, pProperties);
	}

	/**
	 * Retrieve properties of an image format applied to sparse images.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>{@link #vkGetPhysicalDeviceSparseImageFormatProperties2KHR GetPhysicalDeviceSparseImageFormatProperties2KHR} returns an array of {@link VkSparseImageFormatProperties2KHR}. Each element will describe properties for one set of image aspects that are bound simultaneously in the image. This is usually one element for each aspect in the image, but for interleaved depth/stencil images there is only one element describing the combined aspects.</p>
	 * 
	 * <pre><code>void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(
    VkPhysicalDevice                            physicalDevice,
    const VkPhysicalDeviceSparseImageFormatInfo2KHR* pFormatInfo,
    uint32_t*                                   pPropertyCount,
    VkSparseImageFormatProperties2KHR*          pProperties);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>{@link #vkGetPhysicalDeviceSparseImageFormatProperties2KHR GetPhysicalDeviceSparseImageFormatProperties2KHR} behaves identically to {@link VK10#vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties}, with the ability to return extended information by adding extension structures to its {@code pNext} chain.</p>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pFormatInfo} <b>must</b> be a pointer to a valid {@link VkPhysicalDeviceSparseImageFormatInfo2KHR} structure</li>
	 * <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
	 * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} {@link VkSparseImageFormatProperties2KHR} structures</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkPhysicalDeviceSparseImageFormatInfo2KHR}, {@link VkSparseImageFormatProperties2KHR}</p>
	 *
	 * @param physicalDevice the physical device from which to query the sparse image capabilities.
	 * @param pFormatInfo    a pointer to a structure of type {@link VkPhysicalDeviceSparseImageFormatInfo2KHR} containing input parameters to the command.
	 * @param pPropertyCount a pointer to an integer related to the number of sparse format properties available or queried, as described below.
	 * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkSparseImageFormatProperties2KHR} structures.
	 */
	public static void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2KHR pFormatInfo, IntBuffer pPropertyCount, VkSparseImageFormatProperties2KHR.Buffer pProperties) {
		if ( CHECKS ) {
			check(pPropertyCount, 1);
			checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
		}
		nvkGetPhysicalDeviceSparseImageFormatProperties2KHR(physicalDevice, pFormatInfo.address(), memAddress(pPropertyCount), memAddressSafe(pProperties));
	}

	/** Array version of: {@link #vkGetPhysicalDeviceQueueFamilyProperties2KHR GetPhysicalDeviceQueueFamilyProperties2KHR} */
	public static void vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, int[] pQueueFamilyPropertyCount, VkQueueFamilyProperties2KHR.Buffer pQueueFamilyProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties2KHR;
		if ( CHECKS ) {
			check(__functionAddress);
			check(pQueueFamilyPropertyCount, 1);
			checkSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount[0]);
		}
		callPPPV(__functionAddress, physicalDevice.address(), pQueueFamilyPropertyCount, memAddressSafe(pQueueFamilyProperties));
	}

	/** Array version of: {@link #vkGetPhysicalDeviceSparseImageFormatProperties2KHR GetPhysicalDeviceSparseImageFormatProperties2KHR} */
	public static void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2KHR pFormatInfo, int[] pPropertyCount, VkSparseImageFormatProperties2KHR.Buffer pProperties) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties2KHR;
		if ( CHECKS ) {
			check(__functionAddress);
			check(pPropertyCount, 1);
			checkSafe(pProperties, pPropertyCount[0]);
		}
		callPPPPV(__functionAddress, physicalDevice.address(), pFormatInfo.address(), pPropertyCount, memAddressSafe(pProperties));
	}

}