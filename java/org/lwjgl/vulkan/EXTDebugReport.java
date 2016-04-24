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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Due to the nature of the Vulkan interface, there is very little error information available to the developer/application. By enabling optional
 * validation layers and using the Debug Report extension a developer has much more detailed feedback on the application's use of Vulkan.
 * 
 * <p>This extension adds two entrypoints ({@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT}, {@link #vkDestroyDebugReportCallbackEXT DestroyDebugReportCallbackEXT}) and an extension structure that together define
 * a way for layers and the implementation to call back to the application for events of interest to the application.</p>
 * 
 * <p>Using the {@code VK_EXT_debug_report} extension allows an application to register multiple callbacks with the validation layers. Some callbacks may log
 * the information to a file, others may cause a debug break point or other application defined behavior. An application can register callbacks even when
 * no validation layers are enabled, but they will only be called for loader and, if implemented, driver events.</p>
 * 
 * <p>To capture issues found while creating an instance an application can link a {@link VkDebugReportCallbackCreateInfoEXT} structure to the {@code pNext}
 * element of the {@link VkInstanceCreateInfo} structure given to {@link VK10#vkCreateInstance CreateInstance}. This callback is only valid for the duration of the
 * {@code vkCreateInstance} call. Use {@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT} to create persistent callback objects.</p>
 */
public class EXTDebugReport {

	/** The extension specification version. */
	public static final int VK_EXT_DEBUG_REPORT_SPEC_VERSION = 2;

	/** The extension name. */
	public static final String VK_EXT_DEBUG_REPORT_EXTENSION_NAME = "VK_EXT_debug_report";

	/** VkStructureType */
	public static final int VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT = 1000011000;

	/** VkDebugReportObjectTypeEXT */
	public static final int
		VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT               = 0,
		VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT              = 1,
		VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT       = 2,
		VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT                = 3,
		VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT                 = 4,
		VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT             = 5,
		VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT        = 6,
		VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT                 = 7,
		VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT         = 8,
		VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT                = 9,
		VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT                 = 10,
		VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT                 = 11,
		VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT            = 12,
		VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT           = 13,
		VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT            = 14,
		VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT         = 15,
		VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT        = 16,
		VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT       = 17,
		VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT           = 18,
		VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT              = 19,
		VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = 20,
		VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT               = 21,
		VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT       = 22,
		VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT        = 23,
		VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT           = 24,
		VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT          = 25,
		VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT           = 26,
		VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT         = 27,
		VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT          = 28;

	/** VkDebugReportErrorEXT */
	public static final int
		VK_DEBUG_REPORT_ERROR_NONE_EXT         = 0,
		VK_DEBUG_REPORT_ERROR_CALLBACK_REF_EXT = 1;

	/** Indicates an informational message such as resource details that may be handy when debugging an application. */
	public static final int VK_DEBUG_REPORT_INFORMATION_BIT_EXT = 0x1;

	/**
	 * Indicates an unexpected use.
	 * 
	 * <p>E.g. Not destroying objects prior to destroying the containing object or potential inconsistencies between descriptor set layout and the layout in
	 * the corresponding shader, etc.</p>
	 */
	public static final int VK_DEBUG_REPORT_WARNING_BIT_EXT = 0x2;

	/**
	 * Indicates a potentially non-optimal use of Vulkan.
	 * 
	 * <p>E.g. using {@code vkCmdClearImage} when a RenderPass {@code load_op} would have worked.</p>
	 */
	public static final int VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 0x4;

	/** Indicates an error that may cause undefined results, including an application crash. */
	public static final int VK_DEBUG_REPORT_ERROR_BIT_EXT = 0x8;

	/** Indicates diagnostic information from the loader and layers. */
	public static final int VK_DEBUG_REPORT_DEBUG_BIT_EXT = 0x10;

	/** VkResult */
	public static final int VK_ERROR_VALIDATION_FAILED_EXT = -1000011001;

	protected EXTDebugReport() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilities caps) {
		return checkFunctions(
			caps.vkCreateDebugReportCallbackEXT, caps.vkDestroyDebugReportCallbackEXT, caps.vkDebugReportMessageEXT
		);
	}

	// --- [ vkCreateDebugReportCallbackEXT ] ---

	/**
	 * Registers a callback.
	 * 
	 * <p>For each {@code VkDebugReportCallbackEXT} that is created the flags determine when that function is called.</p>
	 * 
	 * <p>A callback will be made for issues that match any bit set in its flags. The callback will come directly from the component that detected the event,
	 * unless some other layer intercepts the calls for its own purposes (filter them in different way, log to system error log, etc.)</p>
	 * 
	 * <p>An application may receive multiple callbacks if multiple {@code VkDebugReportCallbackEXT} objects were created. A callback will always be executed in
	 * the same thread as the originating Vulkan call. A callback may be called from multiple threads simultaneously (if the application is making Vulkan
	 * calls from multiple threads).</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkDebugReportCallbackCreateInfoEXT} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pCallback} <b>must</b> be a pointer to a {@code VkDebugReportCallbackEXT} handle</li>
	 * </ul>
	 *
	 * @param instance    the instance the callback will be logged on
	 * @param pCreateInfo points to a {@link VkDebugReportCallbackCreateInfoEXT} structure which defines the conditions under which this callback will be called
	 * @param pAllocator  controls host memory allocation
	 * @param pCallback   a pointer to record the sname:VkDebugReportCallbackEXT object created
	 */
	public static int nvkCreateDebugReportCallbackEXT(VkInstance instance, long pCreateInfo, long pAllocator, long pCallback) {
		long __functionAddress = instance.getCapabilities().vkCreateDebugReportCallbackEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkDebugReportCallbackCreateInfoEXT.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, instance.address(), pCreateInfo, pAllocator, pCallback);
	}

	/**
	 * Registers a callback.
	 * 
	 * <p>For each {@code VkDebugReportCallbackEXT} that is created the flags determine when that function is called.</p>
	 * 
	 * <p>A callback will be made for issues that match any bit set in its flags. The callback will come directly from the component that detected the event,
	 * unless some other layer intercepts the calls for its own purposes (filter them in different way, log to system error log, etc.)</p>
	 * 
	 * <p>An application may receive multiple callbacks if multiple {@code VkDebugReportCallbackEXT} objects were created. A callback will always be executed in
	 * the same thread as the originating Vulkan call. A callback may be called from multiple threads simultaneously (if the application is making Vulkan
	 * calls from multiple threads).</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkDebugReportCallbackCreateInfoEXT} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pCallback} <b>must</b> be a pointer to a {@code VkDebugReportCallbackEXT} handle</li>
	 * </ul>
	 *
	 * @param instance    the instance the callback will be logged on
	 * @param pCreateInfo points to a {@link VkDebugReportCallbackCreateInfoEXT} structure which defines the conditions under which this callback will be called
	 * @param pAllocator  controls host memory allocation
	 * @param pCallback   a pointer to record the sname:VkDebugReportCallbackEXT object created
	 */
	public static int vkCreateDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pCallback) {
		if ( CHECKS )
			checkBuffer(pCallback, 1);
		return nvkCreateDebugReportCallbackEXT(instance, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pCallback));
	}

	// --- [ vkDestroyDebugReportCallbackEXT ] ---

	/**
	 * Destroys a {@code VkDebugReportCallbackEXT}.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code callback} <b>must</b> be a valid {@code VkDebugReportCallbackEXT} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code callback} <b>must</b> have been created, allocated or retrieved from {@code instance}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code instance} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code instance} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code callback} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param instance   the instance where the callback was created
	 * @param callback   the {@code VkDebugReportCallbackEXT} object to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void nvkDestroyDebugReportCallbackEXT(VkInstance instance, long callback, long pAllocator) {
		long __functionAddress = instance.getCapabilities().vkDestroyDebugReportCallbackEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, instance.address(), callback, pAllocator);
	}

	/**
	 * Destroys a {@code VkDebugReportCallbackEXT}.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code callback} <b>must</b> be a valid {@code VkDebugReportCallbackEXT} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code callback} <b>must</b> have been created, allocated or retrieved from {@code instance}</li>
	 * <li>If {@code VkAllocationCallbacks} were provided when {@code instance} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@code VkAllocationCallbacks} were provided when {@code instance} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code callback} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param instance   the instance where the callback was created
	 * @param callback   the {@code VkDebugReportCallbackEXT} object to destroy
	 * @param pAllocator controls host memory allocation
	 */
	public static void vkDestroyDebugReportCallbackEXT(VkInstance instance, long callback, VkAllocationCallbacks pAllocator) {
		nvkDestroyDebugReportCallbackEXT(instance, callback, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkDebugReportMessageEXT ] ---

	/**
	 * Injects a custom message into the debug stream.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDebugReportFlagBitsEXT} values</li>
	 * <li>{@code flags} <b>must not</b> be 0</li>
	 * <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
	 * <li>{@code pLayerPrefix} <b>must</b> be a pointer to a valid</li>
	 * <li>{@code pMessage} <b>must</b> be a pointer to a valid</li>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code flags} must be a combination of one or more of {@code VkDebugReportFlagBitsEXT}</li>
	 * <li>{@code objType} must be one of {@code VkDebugReportObjectTypeEXT}, {@link #VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT} if {@code object} is {@code NULL}</li>
	 * <li>{@code object} may be a {apiname} object</li>
	 * <li>{@code pLayerPrefix} <b>must</b> be a {@code NULL} terminated string.</li>
	 * <li>{@code pMsg} <b>must</b> be a {@code NULL} terminated string.</li>
	 * </ul>
	 * 
	 * <p>The call will propagate through the layers and cause a callback to the application. The parameters are passed on to the callback in addition to the
	 * {@code pUserData} value that was defined at the time the callback was registered.</p>
	 *
	 * @param instance     the instance the callback will be logged on
	 * @param flags        indicates the {@code VkDebugReportFlagBitsEXT} that triggered this callback. One of:<br><table><tr><td>{@link #VK_DEBUG_REPORT_INFORMATION_BIT_EXT DEBUG_REPORT_INFORMATION_BIT_EXT}</td><td>{@link #VK_DEBUG_REPORT_WARNING_BIT_EXT DEBUG_REPORT_WARNING_BIT_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT}</td><td>{@link #VK_DEBUG_REPORT_ERROR_BIT_EXT DEBUG_REPORT_ERROR_BIT_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_DEBUG_BIT_EXT DEBUG_REPORT_DEBUG_BIT_EXT}</td></tr></table>
	 * @param objectType   the type of object being used / created at the time the event was triggered. One of:<br><table><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT}</td></tr></table>
	 * @param object       the object where the issue was detected. {@code object} may be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} if there is no object associated with the event.
	 * @param location     a component (layer, driver, loader) defined value that indicates the "location" of the trigger. This is an optional value.
	 * @param messageCode  a layer defined value indicating what test triggered this callback
	 * @param pLayerPrefix abbreviation of the component making the callback
	 * @param pMessage     a null terminated string detailing the trigger conditions
	 */
	public static void nvkDebugReportMessageEXT(VkInstance instance, int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage) {
		long __functionAddress = instance.getCapabilities().vkDebugReportMessageEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPJPPPV(__functionAddress, instance.address(), flags, objectType, object, location, messageCode, pLayerPrefix, pMessage);
	}

	/**
	 * Injects a custom message into the debug stream.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDebugReportFlagBitsEXT} values</li>
	 * <li>{@code flags} <b>must not</b> be 0</li>
	 * <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
	 * <li>{@code pLayerPrefix} <b>must</b> be a pointer to a valid</li>
	 * <li>{@code pMessage} <b>must</b> be a pointer to a valid</li>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code flags} must be a combination of one or more of {@code VkDebugReportFlagBitsEXT}</li>
	 * <li>{@code objType} must be one of {@code VkDebugReportObjectTypeEXT}, {@link #VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT} if {@code object} is {@code NULL}</li>
	 * <li>{@code object} may be a {apiname} object</li>
	 * <li>{@code pLayerPrefix} <b>must</b> be a {@code NULL} terminated string.</li>
	 * <li>{@code pMsg} <b>must</b> be a {@code NULL} terminated string.</li>
	 * </ul>
	 * 
	 * <p>The call will propagate through the layers and cause a callback to the application. The parameters are passed on to the callback in addition to the
	 * {@code pUserData} value that was defined at the time the callback was registered.</p>
	 *
	 * @param instance     the instance the callback will be logged on
	 * @param flags        indicates the {@code VkDebugReportFlagBitsEXT} that triggered this callback. One of:<br><table><tr><td>{@link #VK_DEBUG_REPORT_INFORMATION_BIT_EXT DEBUG_REPORT_INFORMATION_BIT_EXT}</td><td>{@link #VK_DEBUG_REPORT_WARNING_BIT_EXT DEBUG_REPORT_WARNING_BIT_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT}</td><td>{@link #VK_DEBUG_REPORT_ERROR_BIT_EXT DEBUG_REPORT_ERROR_BIT_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_DEBUG_BIT_EXT DEBUG_REPORT_DEBUG_BIT_EXT}</td></tr></table>
	 * @param objectType   the type of object being used / created at the time the event was triggered. One of:<br><table><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT}</td></tr></table>
	 * @param object       the object where the issue was detected. {@code object} may be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} if there is no object associated with the event.
	 * @param location     a component (layer, driver, loader) defined value that indicates the "location" of the trigger. This is an optional value.
	 * @param messageCode  a layer defined value indicating what test triggered this callback
	 * @param pLayerPrefix abbreviation of the component making the callback
	 * @param pMessage     a null terminated string detailing the trigger conditions
	 */
	public static void vkDebugReportMessageEXT(VkInstance instance, int flags, int objectType, long object, long location, int messageCode, ByteBuffer pLayerPrefix, ByteBuffer pMessage) {
		if ( CHECKS ) {
			checkNT1(pLayerPrefix);
			checkNT1(pMessage);
		}
		nvkDebugReportMessageEXT(instance, flags, objectType, object, location, messageCode, memAddress(pLayerPrefix), memAddress(pMessage));
	}

	/**
	 * Injects a custom message into the debug stream.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDebugReportFlagBitsEXT} values</li>
	 * <li>{@code flags} <b>must not</b> be 0</li>
	 * <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
	 * <li>{@code pLayerPrefix} <b>must</b> be a pointer to a valid</li>
	 * <li>{@code pMessage} <b>must</b> be a pointer to a valid</li>
	 * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
	 * <li>{@code flags} must be a combination of one or more of {@code VkDebugReportFlagBitsEXT}</li>
	 * <li>{@code objType} must be one of {@code VkDebugReportObjectTypeEXT}, {@link #VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT} if {@code object} is {@code NULL}</li>
	 * <li>{@code object} may be a {apiname} object</li>
	 * <li>{@code pLayerPrefix} <b>must</b> be a {@code NULL} terminated string.</li>
	 * <li>{@code pMsg} <b>must</b> be a {@code NULL} terminated string.</li>
	 * </ul>
	 * 
	 * <p>The call will propagate through the layers and cause a callback to the application. The parameters are passed on to the callback in addition to the
	 * {@code pUserData} value that was defined at the time the callback was registered.</p>
	 *
	 * @param instance     the instance the callback will be logged on
	 * @param flags        indicates the {@code VkDebugReportFlagBitsEXT} that triggered this callback. One of:<br><table><tr><td>{@link #VK_DEBUG_REPORT_INFORMATION_BIT_EXT DEBUG_REPORT_INFORMATION_BIT_EXT}</td><td>{@link #VK_DEBUG_REPORT_WARNING_BIT_EXT DEBUG_REPORT_WARNING_BIT_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT}</td><td>{@link #VK_DEBUG_REPORT_ERROR_BIT_EXT DEBUG_REPORT_ERROR_BIT_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_DEBUG_BIT_EXT DEBUG_REPORT_DEBUG_BIT_EXT}</td></tr></table>
	 * @param objectType   the type of object being used / created at the time the event was triggered. One of:<br><table><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT}</td><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT}</td></tr><tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT}</td></tr></table>
	 * @param object       the object where the issue was detected. {@code object} may be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} if there is no object associated with the event.
	 * @param location     a component (layer, driver, loader) defined value that indicates the "location" of the trigger. This is an optional value.
	 * @param messageCode  a layer defined value indicating what test triggered this callback
	 * @param pLayerPrefix abbreviation of the component making the callback
	 * @param pMessage     a null terminated string detailing the trigger conditions
	 */
	public static void vkDebugReportMessageEXT(VkInstance instance, int flags, int objectType, long object, long location, int messageCode, CharSequence pLayerPrefix, CharSequence pMessage) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pLayerPrefixEncoded = stack.UTF8(pLayerPrefix);
			ByteBuffer pMessageEncoded = stack.UTF8(pMessage);
			nvkDebugReportMessageEXT(instance, flags, objectType, object, location, messageCode, memAddress(pLayerPrefixEncoded), memAddress(pMessageEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT} */
	public static int vkCreateDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, long[] pCallback) {
		long __functionAddress = instance.getCapabilities().vkCreateDebugReportCallbackEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pCallback, 1);
			VkDebugReportCallbackCreateInfoEXT.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, instance.address(), pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), pCallback);
	}

}