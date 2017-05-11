/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_EXT_debug_report</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>12</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-01-31</dd>
 * <dt><b>Revision</b></dt>
 * <dd>5</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0.27 of the Vulkan API.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Courtney Goeltzenleuchter, LunarG</li>
 * <li>Dan Ginsburg, Valve</li>
 * <li>Jon Ashburn, LunarG</li>
 * <li>Mark Lobodzinski, LunarG</li>
 * </ul></dd>
 * <dt><b>Contacts</b></dt>
 * <dd><ul>
 * <li>Courtney Goeltzenleuchter</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>Due to the nature of the Vulkan interface, there is very little error information available to the developer and application. By enabling optional validation layers and using the {@code VK_EXT_debug_report} extension, developers <b>can</b> obtain much more detailed feedback on the application's use of Vulkan. This extension define a way for layers and the implementation to call back to the application for events of interest to the application.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <p>{@code VK_EXT_debug_report} allows an application to register multiple callbacks with the validation layers. Some callbacks may log the information to a file, others may cause a debug break point or other application defined behavior. An application can register callbacks even when no validation layers are enabled, but they will only be called for loader and, if implemented, driver events.</p>
 * 
 * <p>To capture issues found while creating or destroying an instance an application can link a {@link VkDebugReportCallbackCreateInfoEXT} structure to the {@code pNext} element of the {@link VkInstanceCreateInfo} structure given to {@link VK10#vkCreateInstance CreateInstance}. This callback is only valid for the duration of the {@link VK10#vkCreateInstance CreateInstance} and the {@link VK10#vkDestroyInstance DestroyInstance} call. Use {@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT} to create persistent callback objects.</p>
 * 
 * <p>Example uses: Create three callback objects. One will log errors and warnings to the debug console using Windows {@code OutputDebugString}. The second will cause the debugger to break at that callback when an error happens and the third will log warnings to stdout.</p>
 * 
 * <pre><code>    VkResult res;
    VkDebugReportCallbackEXT cb1, cb2, cb3;

    VkDebugReportCallbackCreateInfoEXT callback1 = {
            VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT,    // sType
            NULL,                                                       // pNext
            VK_DEBUG_REPORT_ERROR_BIT_EXT |                             // flags
            VK_DEBUG_REPORT_WARNING_BIT_EXT,
            myOutputDebugString,                                        // pfnCallback
            NULL                                                        // pUserData
    };
    res = vkCreateDebugReportCallbackEXT(instance, &callback1, &cb1);
    if (res != VK_SUCCESS)
       // Do error handling for VK_ERROR_OUT_OF_MEMORY 

    callback.flags = VK_DEBUG_REPORT_ERROR_BIT_EXT;
    callback.pfnCallback = myDebugBreak;
    callback.pUserData = NULL;
    res = vkCreateDebugReportCallbackEXT(instance, &callback, &cb2);
    if (res != VK_SUCCESS)
       // Do error handling for VK_ERROR_OUT_OF_MEMORY 

    VkDebugReportCallbackCreateInfoEXT callback3 = {
            VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT,    // sType
            NULL,                                                       // pNext
            VK_DEBUG_REPORT_WARNING_BIT_EXT,                            // flags
            mystdOutLogger,                                             // pfnCallback
            NULL                                                        // pUserData
    };
    res = vkCreateDebugReportCallbackEXT(instance, &callback3, &cb3);
    if (res != VK_SUCCESS)
       // Do error handling for VK_ERROR_OUT_OF_MEMORY 

    ...

    // remove callbacks when cleaning up 
    vkDestroyDebugReportCallbackEXT(instance, cb1);
    vkDestroyDebugReportCallbackEXT(instance, cb2);
    vkDestroyDebugReportCallbackEXT(instance, cb3);</code></pre>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>In the initial release of the {@code VK_EXT_debug_report} extension, the token {@link #VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT} was used. Starting in version 2 of the extension branch, {@link #VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT} is used instead for consistency with Vulkan naming rules. The older enum is still available for backwards compatibility.</p>
 * </div>
 */
public class EXTDebugReport {

    /** The extension specification version. */
    public static final int VK_EXT_DEBUG_REPORT_SPEC_VERSION = 6;

    /** The extension name. */
    public static final String VK_EXT_DEBUG_REPORT_EXTENSION_NAME = "VK_EXT_debug_report";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT = 1000011000;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_VALIDATION_FAILED_EXT = -1000011001;

    /**
     * VkDebugReportObjectTypeEXT - Specify the type of an object handle
     * 
     * <h5>Description</h5>
     * 
     * <p>For more information, see:</p>
     * 
     * <ul>
     * <li>The reference page for {@link VkDebugReportCallbackEXT}, where this interface is defined.</li>
     * <li>The See Also section for other reference pages using this type.</li>
     * <li>The Vulkan Specification.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDebugMarkerObjectNameInfoEXT}, {@link VkDebugMarkerObjectTagInfoEXT}, {@link #vkDebugReportMessageEXT DebugReportMessageEXT}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT                      = 0,
        VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT                     = 1,
        VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT              = 2,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT                       = 3,
        VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT                        = 4,
        VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT                    = 5,
        VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT               = 6,
        VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT                        = 7,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT                = 8,
        VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT                       = 9,
        VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT                        = 10,
        VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT                        = 11,
        VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT                   = 12,
        VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT                  = 13,
        VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT                   = 14,
        VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT                = 15,
        VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT               = 16,
        VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT              = 17,
        VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT                  = 18,
        VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT                     = 19,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT        = 20,
        VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT                      = 21,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT              = 22,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT               = 23,
        VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT                  = 24,
        VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT                 = 25,
        VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT                  = 26,
        VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT                = 27,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT                 = 28,
        VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT                  = 29,
        VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT             = 30,
        VK_DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT             = 31,
        VK_DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT = 32;

    /**
     * VkDebugReportErrorEXT - Unknown VK_EXT_debug_report enumeration type
     * 
     * <h5>Description</h5>
     * 
     * <p>For more information, see:</p>
     * 
     * <ul>
     * <li>The See Also section for other reference pages using this type.</li>
     * <li>The Vulkan Specification.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>No cross-references are available</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEBUG_REPORT_ERROR_NONE_EXT DEBUG_REPORT_ERROR_NONE_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_ERROR_CALLBACK_REF_EXT DEBUG_REPORT_ERROR_CALLBACK_REF_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DEBUG_REPORT_ERROR_NONE_EXT         = 0,
        VK_DEBUG_REPORT_ERROR_CALLBACK_REF_EXT = 1;

    /**
     * VkDebugReportFlagBitsEXT - Bitmask specifying events which cause a debug report callback
     * 
     * <h5>Description</h5>
     * 
     * <p>For more information, see:</p>
     * 
     * <ul>
     * <li>The reference page for {@link VkDebugReportCallbackCreateInfoEXT}, where this interface is defined.</li>
     * <li>The See Also section for other reference pages using this type.</li>
     * <li>The Vulkan Specification.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkDebugReportFlagsEXT}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEBUG_REPORT_INFORMATION_BIT_EXT DEBUG_REPORT_INFORMATION_BIT_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_WARNING_BIT_EXT DEBUG_REPORT_WARNING_BIT_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_ERROR_BIT_EXT DEBUG_REPORT_ERROR_BIT_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_DEBUG_BIT_EXT DEBUG_REPORT_DEBUG_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DEBUG_REPORT_INFORMATION_BIT_EXT         = 0x1,
        VK_DEBUG_REPORT_WARNING_BIT_EXT             = 0x2,
        VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 0x4,
        VK_DEBUG_REPORT_ERROR_BIT_EXT               = 0x8,
        VK_DEBUG_REPORT_DEBUG_BIT_EXT               = 0x10;

    protected EXTDebugReport() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesInstance caps) {
        return checkFunctions(
            caps.vkCreateDebugReportCallbackEXT, caps.vkDestroyDebugReportCallbackEXT, caps.vkDebugReportMessageEXT
        );
    }

    // --- [ vkCreateDebugReportCallbackEXT ] ---

    /** Unsafe version of: {@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT} */
    public static int nvkCreateDebugReportCallbackEXT(VkInstance instance, long pCreateInfo, long pAllocator, long pCallback) {
        long __functionAddress = instance.getCapabilities().vkCreateDebugReportCallbackEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugReportCallbackCreateInfoEXT.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(__functionAddress, instance.address(), pCreateInfo, pAllocator, pCallback);
    }

    /**
     * Create a debug report callback object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Debug report callbacks give more detailed feedback on the application's use of Vulkan when events of interest occur.</p>
     * 
     * <p>To register a debug report callback, an application uses {@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT}.</p>
     * 
     * <pre><code>VkResult vkCreateDebugReportCallbackEXT(
    VkInstance                                  instance,
    const VkDebugReportCallbackCreateInfoEXT*   pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkDebugReportCallbackEXT*                   pCallback);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkDebugReportCallbackCreateInfoEXT} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pCallback} <b>must</b> be a pointer to a {@code VkDebugReportCallbackEXT} handle</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkDebugReportCallbackCreateInfoEXT}</p>
     *
     * @param instance    the instance the callback will be logged on.
     * @param pCreateInfo points to a {@link VkDebugReportCallbackCreateInfoEXT} structure which defines the conditions under which this callback will be called.
     * @param pAllocator  
     * @param pCallback   a pointer to record the {@code VkDebugReportCallbackEXT} object created.
     */
    public static int vkCreateDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pCallback) {
        if (CHECKS) {
            check(pCallback, 1);
        }
        return nvkCreateDebugReportCallbackEXT(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pCallback));
    }

    // --- [ vkDestroyDebugReportCallbackEXT ] ---

    /** Unsafe version of: {@link #vkDestroyDebugReportCallbackEXT DestroyDebugReportCallbackEXT} */
    public static void nvkDestroyDebugReportCallbackEXT(VkInstance instance, long callback, long pAllocator) {
        long __functionAddress = instance.getCapabilities().vkDestroyDebugReportCallbackEXT;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        callPJPV(__functionAddress, instance.address(), callback, pAllocator);
    }

    /**
     * Destroy a debug report callback object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a {@code VkDebugReportCallbackEXT} object, call:</p>
     * 
     * <pre><code>void vkDestroyDebugReportCallbackEXT(
    VkInstance                                  instance,
    VkDebugReportCallbackEXT                    callback,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code instance} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code instance} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code callback} <b>must</b> be a valid {@code VkDebugReportCallbackEXT} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code callback} <b>must</b> have been created, allocated, or retrieved from {@code instance}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code callback} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param instance   the instance where the callback was created.
     * @param callback   the {@code VkDebugReportCallbackEXT} object to destroy.
     * @param pAllocator 
     */
    public static void vkDestroyDebugReportCallbackEXT(VkInstance instance, long callback, VkAllocationCallbacks pAllocator) {
        nvkDestroyDebugReportCallbackEXT(instance, callback, memAddressSafe(pAllocator));
    }

    // --- [ vkDebugReportMessageEXT ] ---

    /** Unsafe version of: {@link #vkDebugReportMessageEXT DebugReportMessageEXT} */
    public static void nvkDebugReportMessageEXT(VkInstance instance, int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage) {
        long __functionAddress = instance.getCapabilities().vkDebugReportMessageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPPPV(__functionAddress, instance.address(), flags, objectType, object, location, messageCode, pLayerPrefix, pMessage);
    }

    /**
     * (no short description available).
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To inject its own messages into the debug stream, call:</p>
     * 
     * <pre><code>void vkDebugReportMessageEXT(
    VkInstance                                  instance,
    VkDebugReportFlagsEXT                       flags,
    VkDebugReportObjectTypeEXT                  objectType,
    uint64_t                                    object,
    size_t                                      location,
    int32_t                                     messageCode,
    const char*                                 pLayerPrefix,
    const char*                                 pMessage);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The call will propagate through the layers and cause a callback to the application. The parameters are passed on to the callback in addition to the {@code pUserData} value that was defined at the time the callback was registered.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code object} <b>must</b> be a Vulkan object or {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDebugReportFlagBitsEXT} values</li>
     * <li>{@code flags} <b>must</b> not be 0</li>
     * <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
     * <li>{@code pLayerPrefix} <b>must</b> be a null-terminated string</li>
     * <li>{@code pMessage} <b>must</b> be a null-terminated string</li>
     * </ul>
     *
     * @param instance     the instance the callback will be logged on.
     * @param flags        indicates the {@code VkDebugReportFlagBitsEXT} that triggered this callback.
     * @param objectType   a {@code VkDebugReportObjectTypeEXT} specifying the type of object being used or created at the time the event was triggered.
     * @param object       object where the issue was detected. {@code object} may be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} if there is no object associated with the event.
     * @param location     a component (layer, driver, loader) defined value that indicates the <em>location</em> of the trigger. This is an optional value.
     * @param messageCode  a layer-defined value indicating what test triggered this callback.
     * @param pLayerPrefix the abbreviation of the component making the callback.
     * @param pMessage     a null-terminated string detailing the trigger conditions.
     */
    public static void vkDebugReportMessageEXT(VkInstance instance, int flags, int objectType, long object, long location, int messageCode, ByteBuffer pLayerPrefix, ByteBuffer pMessage) {
        if (CHECKS) {
            checkNT1(pLayerPrefix);
            checkNT1(pMessage);
        }
        nvkDebugReportMessageEXT(instance, flags, objectType, object, location, messageCode, memAddress(pLayerPrefix), memAddress(pMessage));
    }

    /**
     * (no short description available).
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To inject its own messages into the debug stream, call:</p>
     * 
     * <pre><code>void vkDebugReportMessageEXT(
    VkInstance                                  instance,
    VkDebugReportFlagsEXT                       flags,
    VkDebugReportObjectTypeEXT                  objectType,
    uint64_t                                    object,
    size_t                                      location,
    int32_t                                     messageCode,
    const char*                                 pLayerPrefix,
    const char*                                 pMessage);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The call will propagate through the layers and cause a callback to the application. The parameters are passed on to the callback in addition to the {@code pUserData} value that was defined at the time the callback was registered.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code object} <b>must</b> be a Vulkan object or {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDebugReportFlagBitsEXT} values</li>
     * <li>{@code flags} <b>must</b> not be 0</li>
     * <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
     * <li>{@code pLayerPrefix} <b>must</b> be a null-terminated string</li>
     * <li>{@code pMessage} <b>must</b> be a null-terminated string</li>
     * </ul>
     *
     * @param instance     the instance the callback will be logged on.
     * @param flags        indicates the {@code VkDebugReportFlagBitsEXT} that triggered this callback.
     * @param objectType   a {@code VkDebugReportObjectTypeEXT} specifying the type of object being used or created at the time the event was triggered.
     * @param object       object where the issue was detected. {@code object} may be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} if there is no object associated with the event.
     * @param location     a component (layer, driver, loader) defined value that indicates the <em>location</em> of the trigger. This is an optional value.
     * @param messageCode  a layer-defined value indicating what test triggered this callback.
     * @param pLayerPrefix the abbreviation of the component making the callback.
     * @param pMessage     a null-terminated string detailing the trigger conditions.
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
        if (CHECKS) {
            check(__functionAddress);
            check(pCallback, 1);
            VkDebugReportCallbackCreateInfoEXT.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(__functionAddress, instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pCallback);
    }

}