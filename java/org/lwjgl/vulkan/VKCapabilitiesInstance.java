/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.vulkan.VK.*;

/** Defines the capabilities of a Vulkan {@code VkInstance}. */
public class VKCapabilitiesInstance {

    // VK10
    public final long
        vkDestroyInstance,
        vkEnumeratePhysicalDevices,
        vkGetPhysicalDeviceFeatures,
        vkGetPhysicalDeviceFormatProperties,
        vkGetPhysicalDeviceImageFormatProperties,
        vkGetPhysicalDeviceProperties,
        vkGetPhysicalDeviceQueueFamilyProperties,
        vkGetPhysicalDeviceMemoryProperties,
        vkCreateDevice,
        vkEnumerateDeviceExtensionProperties,
        vkEnumerateDeviceLayerProperties,
        vkGetPhysicalDeviceSparseImageFormatProperties;

    // EXT_acquire_xlib_display
    public final long
        vkAcquireXlibDisplayEXT,
        vkGetRandROutputDisplayEXT;

    // EXT_debug_report
    public final long
        vkCreateDebugReportCallbackEXT,
        vkDestroyDebugReportCallbackEXT,
        vkDebugReportMessageEXT;

    // EXT_direct_mode_display
    public final long
        vkReleaseDisplayEXT;

    // EXT_display_surface_counter
    public final long
        vkGetPhysicalDeviceSurfaceCapabilities2EXT;

    // EXT_sample_locations
    public final long
        vkGetPhysicalDeviceMultisamplePropertiesEXT;

    // KHR_display
    public final long
        vkGetPhysicalDeviceDisplayPropertiesKHR,
        vkGetPhysicalDeviceDisplayPlanePropertiesKHR,
        vkGetDisplayPlaneSupportedDisplaysKHR,
        vkGetDisplayModePropertiesKHR,
        vkCreateDisplayModeKHR,
        vkGetDisplayPlaneCapabilitiesKHR,
        vkCreateDisplayPlaneSurfaceKHR;

    // KHR_external_fence_capabilities
    public final long
        vkGetPhysicalDeviceExternalFencePropertiesKHR;

    // KHR_external_memory_capabilities
    public final long
        vkGetPhysicalDeviceExternalBufferPropertiesKHR;

    // KHR_external_semaphore_capabilities
    public final long
        vkGetPhysicalDeviceExternalSemaphorePropertiesKHR;

    // KHR_get_physical_device_properties2
    public final long
        vkGetPhysicalDeviceFeatures2KHR,
        vkGetPhysicalDeviceProperties2KHR,
        vkGetPhysicalDeviceFormatProperties2KHR,
        vkGetPhysicalDeviceImageFormatProperties2KHR,
        vkGetPhysicalDeviceQueueFamilyProperties2KHR,
        vkGetPhysicalDeviceMemoryProperties2KHR,
        vkGetPhysicalDeviceSparseImageFormatProperties2KHR;

    // KHR_get_surface_capabilities2
    public final long
        vkGetPhysicalDeviceSurfaceCapabilities2KHR,
        vkGetPhysicalDeviceSurfaceFormats2KHR;

    // KHR_surface
    public final long
        vkDestroySurfaceKHR,
        vkGetPhysicalDeviceSurfaceSupportKHR,
        vkGetPhysicalDeviceSurfaceCapabilitiesKHR,
        vkGetPhysicalDeviceSurfaceFormatsKHR,
        vkGetPhysicalDeviceSurfacePresentModesKHR;

    // KHR_win32_surface
    public final long
        vkCreateWin32SurfaceKHR,
        vkGetPhysicalDeviceWin32PresentationSupportKHR;

    // KHR_xlib_surface
    public final long
        vkCreateXlibSurfaceKHR,
        vkGetPhysicalDeviceXlibPresentationSupportKHR;

    // KHX_device_group
    public final long
        vkGetPhysicalDevicePresentRectanglesKHX;

    // KHX_device_group_creation
    public final long
        vkEnumeratePhysicalDeviceGroupsKHX;

    // MVK_ios_surface
    public final long
        vkCreateIOSSurfaceMVK;

    // MVK_macos_surface
    public final long
        vkCreateMacOSSurfaceMVK;

    // NV_external_memory_capabilities
    public final long
        vkGetPhysicalDeviceExternalImageFormatPropertiesNV;

    // NVX_device_generated_commands
    public final long
        vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX;

    /** The Vulkan API version number. */
    public final int apiVersion;

    /** When true, {@link VK10} is supported. */
    public final boolean Vulkan10;
    /** When true, {@link EXTAcquireXlibDisplay} is supported. */
    public final boolean VK_EXT_acquire_xlib_display;
    /** When true, {@link EXTDebugReport} is supported. */
    public final boolean VK_EXT_debug_report;
    /** When true, {@link EXTDirectModeDisplay} is supported. */
    public final boolean VK_EXT_direct_mode_display;
    /** When true, {@link EXTDisplaySurfaceCounter} is supported. */
    public final boolean VK_EXT_display_surface_counter;
    /** When true, {@link EXTSwapchainColorspace} is supported. */
    public final boolean VK_EXT_swapchain_colorspace;
    /** When true, {@link EXTValidationFlags} is supported. */
    public final boolean VK_EXT_validation_flags;
    /** When true, {@link KHRDisplay} is supported. */
    public final boolean VK_KHR_display;
    /** When true, {@link KHRExternalFenceCapabilities} is supported. */
    public final boolean VK_KHR_external_fence_capabilities;
    /** When true, {@link KHRExternalMemoryCapabilities} is supported. */
    public final boolean VK_KHR_external_memory_capabilities;
    /** When true, {@link KHRExternalSemaphoreCapabilities} is supported. */
    public final boolean VK_KHR_external_semaphore_capabilities;
    /** When true, {@link KHRGetPhysicalDeviceProperties2} is supported. */
    public final boolean VK_KHR_get_physical_device_properties2;
    /** When true, {@link KHRGetSurfaceCapabilities2} is supported. */
    public final boolean VK_KHR_get_surface_capabilities2;
    /** When true, {@link KHRSurface} is supported. */
    public final boolean VK_KHR_surface;
    /** When true, {@link KHRWin32Surface} is supported. */
    public final boolean VK_KHR_win32_surface;
    /** When true, {@link KHRXlibSurface} is supported. */
    public final boolean VK_KHR_xlib_surface;
    /** When true, {@link KHXDeviceGroupCreation} is supported. */
    public final boolean VK_KHX_device_group_creation;
    /** When true, {@link MVKIosSurface} is supported. */
    public final boolean VK_MVK_ios_surface;
    /** When true, {@link MVKMacosSurface} is supported. */
    public final boolean VK_MVK_macos_surface;
    /** When true, {@link NVExternalMemoryCapabilities} is supported. */
    public final boolean VK_NV_external_memory_capabilities;

    VKCapabilitiesInstance(FunctionProvider provider, int apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;

        boolean supported;

        {
            supported = ext.contains("Vulkan10");
            vkDestroyInstance = isSupported(provider, "vkDestroyInstance", supported);
            vkEnumeratePhysicalDevices = isSupported(provider, "vkEnumeratePhysicalDevices", supported);
            vkGetPhysicalDeviceFeatures = isSupported(provider, "vkGetPhysicalDeviceFeatures", supported);
            vkGetPhysicalDeviceFormatProperties = isSupported(provider, "vkGetPhysicalDeviceFormatProperties", supported);
            vkGetPhysicalDeviceImageFormatProperties = isSupported(provider, "vkGetPhysicalDeviceImageFormatProperties", supported);
            vkGetPhysicalDeviceProperties = isSupported(provider, "vkGetPhysicalDeviceProperties", supported);
            vkGetPhysicalDeviceQueueFamilyProperties = isSupported(provider, "vkGetPhysicalDeviceQueueFamilyProperties", supported);
            vkGetPhysicalDeviceMemoryProperties = isSupported(provider, "vkGetPhysicalDeviceMemoryProperties", supported);
            vkCreateDevice = isSupported(provider, "vkCreateDevice", supported);
            vkEnumerateDeviceExtensionProperties = isSupported(provider, "vkEnumerateDeviceExtensionProperties", supported);
            vkEnumerateDeviceLayerProperties = isSupported(provider, "vkEnumerateDeviceLayerProperties", supported);
            vkGetPhysicalDeviceSparseImageFormatProperties = isSupported(provider, "vkGetPhysicalDeviceSparseImageFormatProperties", supported);
            Vulkan10 = supported && VK.checkExtension("Vulkan10", VK10.isAvailable(this));
        }
        {
            supported = ext.contains("VK_EXT_acquire_xlib_display");
            vkAcquireXlibDisplayEXT = isSupported(provider, "vkAcquireXlibDisplayEXT", supported);
            vkGetRandROutputDisplayEXT = isSupported(provider, "vkGetRandROutputDisplayEXT", supported);
            VK_EXT_acquire_xlib_display = supported && VK.checkExtension("VK_EXT_acquire_xlib_display", EXTAcquireXlibDisplay.isAvailable(this));
        }
        {
            supported = ext.contains("VK_EXT_debug_report");
            vkCreateDebugReportCallbackEXT = isSupported(provider, "vkCreateDebugReportCallbackEXT", supported);
            vkDestroyDebugReportCallbackEXT = isSupported(provider, "vkDestroyDebugReportCallbackEXT", supported);
            vkDebugReportMessageEXT = isSupported(provider, "vkDebugReportMessageEXT", supported);
            VK_EXT_debug_report = supported && VK.checkExtension("VK_EXT_debug_report", EXTDebugReport.isAvailable(this));
        }
        {
            supported = ext.contains("VK_EXT_direct_mode_display");
            vkReleaseDisplayEXT = isSupported(provider, "vkReleaseDisplayEXT", supported);
            VK_EXT_direct_mode_display = supported && VK.checkExtension("VK_EXT_direct_mode_display", EXTDirectModeDisplay.isAvailable(this));
        }
        {
            supported = ext.contains("VK_EXT_display_surface_counter");
            vkGetPhysicalDeviceSurfaceCapabilities2EXT = isSupported(provider, "vkGetPhysicalDeviceSurfaceCapabilities2EXT", supported);
            VK_EXT_display_surface_counter = supported && VK.checkExtension("VK_EXT_display_surface_counter", EXTDisplaySurfaceCounter.isAvailable(this));
        }
        {
            vkGetPhysicalDeviceMultisamplePropertiesEXT = isSupported(provider, "vkGetPhysicalDeviceMultisamplePropertiesEXT", true);        }
        VK_EXT_swapchain_colorspace = ext.contains("VK_EXT_swapchain_colorspace");
        VK_EXT_validation_flags = ext.contains("VK_EXT_validation_flags");
        {
            supported = ext.contains("VK_KHR_display");
            vkGetPhysicalDeviceDisplayPropertiesKHR = isSupported(provider, "vkGetPhysicalDeviceDisplayPropertiesKHR", supported);
            vkGetPhysicalDeviceDisplayPlanePropertiesKHR = isSupported(provider, "vkGetPhysicalDeviceDisplayPlanePropertiesKHR", supported);
            vkGetDisplayPlaneSupportedDisplaysKHR = isSupported(provider, "vkGetDisplayPlaneSupportedDisplaysKHR", supported);
            vkGetDisplayModePropertiesKHR = isSupported(provider, "vkGetDisplayModePropertiesKHR", supported);
            vkCreateDisplayModeKHR = isSupported(provider, "vkCreateDisplayModeKHR", supported);
            vkGetDisplayPlaneCapabilitiesKHR = isSupported(provider, "vkGetDisplayPlaneCapabilitiesKHR", supported);
            vkCreateDisplayPlaneSurfaceKHR = isSupported(provider, "vkCreateDisplayPlaneSurfaceKHR", supported);
            VK_KHR_display = supported && VK.checkExtension("VK_KHR_display", KHRDisplay.isAvailable(this));
        }
        {
            supported = ext.contains("VK_KHR_external_fence_capabilities");
            vkGetPhysicalDeviceExternalFencePropertiesKHR = isSupported(provider, "vkGetPhysicalDeviceExternalFencePropertiesKHR", supported);
            VK_KHR_external_fence_capabilities = supported && VK.checkExtension("VK_KHR_external_fence_capabilities", KHRExternalFenceCapabilities.isAvailable(this));
        }
        {
            supported = ext.contains("VK_KHR_external_memory_capabilities");
            vkGetPhysicalDeviceExternalBufferPropertiesKHR = isSupported(provider, "vkGetPhysicalDeviceExternalBufferPropertiesKHR", supported);
            VK_KHR_external_memory_capabilities = supported && VK.checkExtension("VK_KHR_external_memory_capabilities", KHRExternalMemoryCapabilities.isAvailable(this));
        }
        {
            supported = ext.contains("VK_KHR_external_semaphore_capabilities");
            vkGetPhysicalDeviceExternalSemaphorePropertiesKHR = isSupported(provider, "vkGetPhysicalDeviceExternalSemaphorePropertiesKHR", supported);
            VK_KHR_external_semaphore_capabilities = supported && VK.checkExtension("VK_KHR_external_semaphore_capabilities", KHRExternalSemaphoreCapabilities.isAvailable(this));
        }
        {
            supported = ext.contains("VK_KHR_get_physical_device_properties2");
            vkGetPhysicalDeviceFeatures2KHR = isSupported(provider, "vkGetPhysicalDeviceFeatures2KHR", supported);
            vkGetPhysicalDeviceProperties2KHR = isSupported(provider, "vkGetPhysicalDeviceProperties2KHR", supported);
            vkGetPhysicalDeviceFormatProperties2KHR = isSupported(provider, "vkGetPhysicalDeviceFormatProperties2KHR", supported);
            vkGetPhysicalDeviceImageFormatProperties2KHR = isSupported(provider, "vkGetPhysicalDeviceImageFormatProperties2KHR", supported);
            vkGetPhysicalDeviceQueueFamilyProperties2KHR = isSupported(provider, "vkGetPhysicalDeviceQueueFamilyProperties2KHR", supported);
            vkGetPhysicalDeviceMemoryProperties2KHR = isSupported(provider, "vkGetPhysicalDeviceMemoryProperties2KHR", supported);
            vkGetPhysicalDeviceSparseImageFormatProperties2KHR = isSupported(provider, "vkGetPhysicalDeviceSparseImageFormatProperties2KHR", supported);
            VK_KHR_get_physical_device_properties2 = supported && VK.checkExtension("VK_KHR_get_physical_device_properties2", KHRGetPhysicalDeviceProperties2.isAvailable(this));
        }
        {
            supported = ext.contains("VK_KHR_get_surface_capabilities2");
            vkGetPhysicalDeviceSurfaceCapabilities2KHR = isSupported(provider, "vkGetPhysicalDeviceSurfaceCapabilities2KHR", supported);
            vkGetPhysicalDeviceSurfaceFormats2KHR = isSupported(provider, "vkGetPhysicalDeviceSurfaceFormats2KHR", supported);
            VK_KHR_get_surface_capabilities2 = supported && VK.checkExtension("VK_KHR_get_surface_capabilities2", KHRGetSurfaceCapabilities2.isAvailable(this));
        }
        {
            supported = ext.contains("VK_KHR_surface");
            vkDestroySurfaceKHR = isSupported(provider, "vkDestroySurfaceKHR", supported);
            vkGetPhysicalDeviceSurfaceSupportKHR = isSupported(provider, "vkGetPhysicalDeviceSurfaceSupportKHR", supported);
            vkGetPhysicalDeviceSurfaceCapabilitiesKHR = isSupported(provider, "vkGetPhysicalDeviceSurfaceCapabilitiesKHR", supported);
            vkGetPhysicalDeviceSurfaceFormatsKHR = isSupported(provider, "vkGetPhysicalDeviceSurfaceFormatsKHR", supported);
            vkGetPhysicalDeviceSurfacePresentModesKHR = isSupported(provider, "vkGetPhysicalDeviceSurfacePresentModesKHR", supported);
            VK_KHR_surface = supported && VK.checkExtension("VK_KHR_surface", KHRSurface.isAvailable(this));
        }
        {
            supported = ext.contains("VK_KHR_win32_surface");
            vkCreateWin32SurfaceKHR = isSupported(provider, "vkCreateWin32SurfaceKHR", supported);
            vkGetPhysicalDeviceWin32PresentationSupportKHR = isSupported(provider, "vkGetPhysicalDeviceWin32PresentationSupportKHR", supported);
            VK_KHR_win32_surface = supported && VK.checkExtension("VK_KHR_win32_surface", KHRWin32Surface.isAvailable(this));
        }
        {
            supported = ext.contains("VK_KHR_xlib_surface");
            vkCreateXlibSurfaceKHR = isSupported(provider, "vkCreateXlibSurfaceKHR", supported);
            vkGetPhysicalDeviceXlibPresentationSupportKHR = isSupported(provider, "vkGetPhysicalDeviceXlibPresentationSupportKHR", supported);
            VK_KHR_xlib_surface = supported && VK.checkExtension("VK_KHR_xlib_surface", KHRXlibSurface.isAvailable(this));
        }
        {
            vkGetPhysicalDevicePresentRectanglesKHX = isSupported(provider, "vkGetPhysicalDevicePresentRectanglesKHX", true);        }
        {
            supported = ext.contains("VK_KHX_device_group_creation");
            vkEnumeratePhysicalDeviceGroupsKHX = isSupported(provider, "vkEnumeratePhysicalDeviceGroupsKHX", supported);
            VK_KHX_device_group_creation = supported && VK.checkExtension("VK_KHX_device_group_creation", KHXDeviceGroupCreation.isAvailable(this));
        }
        {
            supported = ext.contains("VK_MVK_ios_surface");
            vkCreateIOSSurfaceMVK = isSupported(provider, "vkCreateIOSSurfaceMVK", supported);
            VK_MVK_ios_surface = supported && VK.checkExtension("VK_MVK_ios_surface", MVKIosSurface.isAvailable(this));
        }
        {
            supported = ext.contains("VK_MVK_macos_surface");
            vkCreateMacOSSurfaceMVK = isSupported(provider, "vkCreateMacOSSurfaceMVK", supported);
            VK_MVK_macos_surface = supported && VK.checkExtension("VK_MVK_macos_surface", MVKMacosSurface.isAvailable(this));
        }
        {
            supported = ext.contains("VK_NV_external_memory_capabilities");
            vkGetPhysicalDeviceExternalImageFormatPropertiesNV = isSupported(provider, "vkGetPhysicalDeviceExternalImageFormatPropertiesNV", supported);
            VK_NV_external_memory_capabilities = supported && VK.checkExtension("VK_NV_external_memory_capabilities", NVExternalMemoryCapabilities.isAvailable(this));
        }
        {
            vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX = isSupported(provider, "vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX", true);        }
    }

}
