/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The {@code VK_KHR_swapchain} extension is the device-level companion to the {@link KHRSurface VK_KHR_surface} extension. It introduces {@code VkSwapchainKHR} objects, which provide the ability to present rendering results to a surface.
 * 
 * <h5>Examples</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The example code for the {@link KHRSurface VK_KHR_surface} and {@code VK_KHR_swapchain} extensions was removed from the appendix after revision 1.0.29. This WSI example code was ported to the cube demo that is shipped with the official Khronos SDK, and is being kept up-to-date in that location (see: https://github.com/KhronosGroup/Vulkan-LoaderAndValidationLayers/blob/master/demos/cube.c).</p>
 * </div>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_swapchain}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>2</dd>
 * <dt><b>Revision</b></dt>
 * <dd>70</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRSurface VK_KHR_surface}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones @cubanismo,Ian Elliott mailto:ianelliott@google.com[ianelliott@google.com]</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-10-06</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Interacts with Vulkan 1.1</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Patrick Doane, Blizzard</li>
 * <li>Ian Elliott, LunarG</li>
 * <li>Jesse Hall, Google</li>
 * <li>Mathias Heyer, NVIDIA</li>
 * <li>James Jones, NVIDIA</li>
 * <li>David Mao, AMD</li>
 * <li>Norbert Nopper, Freescale</li>
 * <li>Alon Or-bach, Samsung</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Graham Sellers, AMD</li>
 * <li>Jeff Vigil, Qualcomm</li>
 * <li>Chia-I Wu, LunarG</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Matthaeus G. Chajdas, AMD</li>
 * <li>Ray Smith, ARM</li>
 * </ul></dd>
 * </dl>
 */
public class KHRSwapchain {

    /** The extension specification version. */
    public static final int VK_KHR_SWAPCHAIN_SPEC_VERSION = 70;

    /** The extension name. */
    public static final String VK_KHR_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_swapchain";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PRESENT_INFO_KHR STRUCTURE_TYPE_PRESENT_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR = 1000001000,
        VK_STRUCTURE_TYPE_PRESENT_INFO_KHR          = 1000001001;

    /** Extends {@code VkImageLayout}. */
    public static final int VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = 1000001002;

    /**
     * Extends {@code VkResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR}</li>
     * <li>{@link #VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}</li>
     * </ul>
     */
    public static final int
        VK_SUBOPTIMAL_KHR        = 1000001003,
        VK_ERROR_OUT_OF_DATE_KHR = -1000001004;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_SWAPCHAIN_KHR = 1000001000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR  = 1000001007,
        VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR        = 1000001008,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR   = 1000001009,
        VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR            = 1000001010,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR          = 1000001011,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR = 1000001012;

    /**
     * Extends {@code VkSwapchainCreateFlagBitsKHR}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR}</li>
     * <li>{@link #VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR SWAPCHAIN_CREATE_PROTECTED_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x1,
        VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR                   = 0x2;

    /**
     * VkDeviceGroupPresentModeFlagBitsKHR - Bitmask specifying supported device group present modes
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR} specifies that any physical device with a presentation engine <b>can</b> present its own swapchain images.</li>
     * <li>{@link #VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR} specifies that any physical device with a presentation engine <b>can</b> present swapchain images from any physical device in its {@code presentMask}.</li>
     * <li>{@link #VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR} specifies that any physical device with a presentation engine <b>can</b> present the sum of swapchain images from any physical devices in its {@code presentMask}.</li>
     * <li>{@link #VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR} specifies that multiple physical devices with a presentation engine <b>can</b> each present their own swapchain images.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceGroupPresentInfoKHR}, {@code VkDeviceGroupPresentModeFlagsKHR}</p>
     */
    public static final int
        VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR              = 0x1,
        VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR             = 0x2,
        VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR                = 0x4,
        VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR = 0x8;

    protected KHRSwapchain() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsInstance(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_swapchain") && VK.checkExtension("VK_KHR_swapchain",
               VK.isSupported(provider, "vkGetPhysicalDevicePresentRectanglesKHR", caps, ext.contains("Vulkan11"))
        );
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_swapchain") && VK.checkExtension("VK_KHR_swapchain",
               VK.isSupported(provider, "vkCreateSwapchainKHR", caps)
            && VK.isSupported(provider, "vkDestroySwapchainKHR", caps)
            && VK.isSupported(provider, "vkGetSwapchainImagesKHR", caps)
            && VK.isSupported(provider, "vkAcquireNextImageKHR", caps)
            && VK.isSupported(provider, "vkQueuePresentKHR", caps)
            && VK.isSupported(provider, "vkGetDeviceGroupPresentCapabilitiesKHR", caps, ext.contains("Vulkan11"))
            && VK.isSupported(provider, "vkGetDeviceGroupSurfacePresentModesKHR", caps, ext.contains("Vulkan11"))
            && VK.isSupported(provider, "vkAcquireNextImage2KHR", caps, ext.contains("Vulkan11"))
        );
    }

    // --- [ vkCreateSwapchainKHR ] ---

    /** Unsafe version of: {@link #vkCreateSwapchainKHR CreateSwapchainKHR} */
    public static int nvkCreateSwapchainKHR(VkDevice device, long pCreateInfo, long pAllocator, long pSwapchain) {
        long __functionAddress = device.getCapabilities().vkCreateSwapchainKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkSwapchainCreateInfoKHR.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pSwapchain);
    }

    /**
     * Create a swapchain.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a swapchain, call:</p>
     * 
     * <code><pre>
     * VkResult vkCreateSwapchainKHR(
     *     VkDevice                                    device,
     *     const VkSwapchainCreateInfoKHR*             pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSwapchainKHR*                             pSwapchain);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkSwapchainCreateInfoKHR} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pSwapchain} <b>must</b> be a valid pointer to a {@code VkSwapchainKHR} handle</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code pCreateInfo.surface} <b>must</b> be externally synchronized</li>
     * <li>Host access to {@code pCreateInfo.oldSwapchain} <b>must</b> be externally synchronized</li>
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
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * <li>{@link KHRSurface#VK_ERROR_NATIVE_WINDOW_IN_USE_KHR ERROR_NATIVE_WINDOW_IN_USE_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkSwapchainCreateInfoKHR}</p>
     *
     * @param device      the device to create the swapchain for.
     * @param pCreateInfo a pointer to an instance of the {@link VkSwapchainCreateInfoKHR} structure specifying the parameters of the created swapchain.
     * @param pAllocator  the allocator used for host memory allocated for the swapchain object when there is no more specific allocator available (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a>).
     * @param pSwapchain  a pointer to a {@code VkSwapchainKHR} handle in which the created swapchain object will be returned.
     */
    @NativeType("VkResult")
    public static int vkCreateSwapchainKHR(VkDevice device, @NativeType("VkSwapchainCreateInfoKHR const *") VkSwapchainCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSwapchainKHR *") LongBuffer pSwapchain) {
        if (CHECKS) {
            check(pSwapchain, 1);
        }
        return nvkCreateSwapchainKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSwapchain));
    }

    // --- [ vkDestroySwapchainKHR ] ---

    /** Unsafe version of: {@link #vkDestroySwapchainKHR DestroySwapchainKHR} */
    public static void nvkDestroySwapchainKHR(VkDevice device, long swapchain, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroySwapchainKHR;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        callPJPV(__functionAddress, device.address(), swapchain, pAllocator);
    }

    /**
     * Destroy a swapchain object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a swapchain object call:</p>
     * 
     * <code><pre>
     * void vkDestroySwapchainKHR(
     *     VkDevice                                    device,
     *     VkSwapchainKHR                              swapchain,
     *     const VkAllocationCallbacks*                pAllocator);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>The application <b>must</b> not destroy a swapchain until after completion of all outstanding operations on images that were acquired from the swapchain. {@code swapchain} and all associated {@code VkImage} handles are destroyed, and <b>must</b> not be acquired or used any more by the application. The memory of each {@code VkImage} will only be freed after that image is no longer used by the presentation engine. For example, if one image of the swapchain is being displayed in a window, the memory for that image <b>may</b> not be freed until the window is destroyed, or another swapchain is created for the window. Destroying the swapchain does not invalidate the parent {@code VkSurfaceKHR}, and a new swapchain <b>can</b> be created with it.</p>
     * 
     * <p>When a swapchain associated with a display surface is destroyed, if the image most recently presented to the display surface is from the swapchain being destroyed, then either any display resources modified by presenting images from any swapchain associated with the display surface <b>must</b> be reverted by the implementation to their state prior to the first present performed on one of these swapchains, or such resources <b>must</b> be left in their current state.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All uses of presentable images acquired from {@code swapchain} <b>must</b> have completed execution</li>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code swapchain} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code swapchain} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code swapchain} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>Both of {@code device}, and {@code swapchain} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device     the {@code VkDevice} associated with {@code swapchain}.
     * @param swapchain  the swapchain to destroy.
     * @param pAllocator the allocator used for host memory allocated for the swapchain object when there is no more specific allocator available (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a>).
     */
    public static void vkDestroySwapchainKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroySwapchainKHR(device, swapchain, memAddressSafe(pAllocator));
    }

    // --- [ vkGetSwapchainImagesKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetSwapchainImagesKHR GetSwapchainImagesKHR}
     *
     * @param pSwapchainImageCount a pointer to an integer related to the number of presentable images available or queried, as described below.
     */
    public static int nvkGetSwapchainImagesKHR(VkDevice device, long swapchain, long pSwapchainImageCount, long pSwapchainImages) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainImagesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(__functionAddress, device.address(), swapchain, pSwapchainImageCount, pSwapchainImages);
    }

    /**
     * Obtain the array of presentable images associated with a swapchain.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To obtain the array of presentable images associated with a swapchain, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetSwapchainImagesKHR(
     *     VkDevice                                    device,
     *     VkSwapchainKHR                              swapchain,
     *     uint32_t*                                   pSwapchainImageCount,
     *     VkImage*                                    pSwapchainImages);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pSwapchainImages} is {@code NULL}, then the number of presentable images for {@code swapchain} is returned in {@code pSwapchainImageCount}. Otherwise, {@code pSwapchainImageCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSwapchainImages} array, and on return the variable is overwritten with the number of structures actually written to {@code pSwapchainImages}. If the value of {@code pSwapchainImageCount} is less than the number of presentable images for {@code swapchain}, at most {@code pSwapchainImageCount} structures will be written. If {@code pSwapchainImageCount} is smaller than the number of presentable images for {@code swapchain}, {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS} to indicate that not all the available values were returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
     * <li>{@code pSwapchainImageCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pSwapchainImageCount} is not 0, and {@code pSwapchainImages} is not {@code NULL}, {@code pSwapchainImages} <b>must</b> be a valid pointer to an array of {@code pSwapchainImageCount} {@code VkImage} handles</li>
     * <li>Both of {@code device}, and {@code swapchain} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device               the device associated with {@code swapchain}.
     * @param swapchain            the swapchain to query.
     * @param pSwapchainImageCount a pointer to an integer related to the number of presentable images available or queried, as described below.
     * @param pSwapchainImages     either {@code NULL} or a pointer to an array of {@code VkImage} handles.
     */
    @NativeType("VkResult")
    public static int vkGetSwapchainImagesKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t *") IntBuffer pSwapchainImageCount, @Nullable @NativeType("VkImage *") LongBuffer pSwapchainImages) {
        if (CHECKS) {
            check(pSwapchainImageCount, 1);
            checkSafe(pSwapchainImages, pSwapchainImageCount.get(pSwapchainImageCount.position()));
        }
        return nvkGetSwapchainImagesKHR(device, swapchain, memAddress(pSwapchainImageCount), memAddressSafe(pSwapchainImages));
    }

    // --- [ vkAcquireNextImageKHR ] ---

    /** Unsafe version of: {@link #vkAcquireNextImageKHR AcquireNextImageKHR} */
    public static int nvkAcquireNextImageKHR(VkDevice device, long swapchain, long timeout, long semaphore, long fence, long pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImageKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJJJPI(__functionAddress, device.address(), swapchain, timeout, semaphore, fence, pImageIndex);
    }

    /**
     * Retrieve the index of the next available presentable image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To acquire an available presentable image to use, and retrieve the index of that image, call:</p>
     * 
     * <code><pre>
     * VkResult vkAcquireNextImageKHR(
     *     VkDevice                                    device,
     *     VkSwapchainKHR                              swapchain,
     *     uint64_t                                    timeout,
     *     VkSemaphore                                 semaphore,
     *     VkFence                                     fence,
     *     uint32_t*                                   pImageIndex);</pre></code>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code swapchain} <b>must</b> not be in the retired state</li>
     * <li>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> be unsignaled</li>
     * <li>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> not have any uncompleted signal or wait operations pending</li>
     * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> be unsignaled and <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
     * <li>{@code semaphore} and {@code fence} <b>must</b> not both be equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If the number of currently acquired images is greater than the difference between the number of images in {@code swapchain} and the value of {@link VkSurfaceCapabilitiesKHR}{@code ::minImageCount} as returned by a call to {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR} with the {@code surface} used to create {@code swapchain}, {@code timeout} <b>must</b> not be {@code UINT64_MAX}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
     * <li>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
     * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
     * <li>{@code pImageIndex} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If {@code semaphore} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * <li>If {@code fence} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * <li>Both of {@code device}, and {@code swapchain} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
     * <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
     * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_TIMEOUT TIMEOUT}</li>
     * <li>{@link VK10#VK_NOT_READY NOT_READY}</li>
     * <li>{@link #VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * <li>{@link #VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}</li>
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device      the device associated with {@code swapchain}.
     * @param swapchain   the non-retired swapchain from which an image is being acquired.
     * @param timeout     specifies how long the function waits, in nanoseconds, if no image is available.
     * @param semaphore   {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a semaphore to signal.
     * @param fence       {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a fence to signal.
     * @param pImageIndex a pointer to a {@code uint32_t} that is set to the index of the next image to use (i.e. an index into the array of images returned by {@link #vkGetSwapchainImagesKHR GetSwapchainImagesKHR}).
     */
    @NativeType("VkResult")
    public static int vkAcquireNextImageKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint64_t") long timeout, @NativeType("VkSemaphore") long semaphore, @NativeType("VkFence") long fence, @NativeType("uint32_t *") IntBuffer pImageIndex) {
        if (CHECKS) {
            check(pImageIndex, 1);
        }
        return nvkAcquireNextImageKHR(device, swapchain, timeout, semaphore, fence, memAddress(pImageIndex));
    }

    // --- [ vkQueuePresentKHR ] ---

    /** Unsafe version of: {@link #vkQueuePresentKHR QueuePresentKHR} */
    public static int nvkQueuePresentKHR(VkQueue queue, long pPresentInfo) {
        long __functionAddress = queue.getCapabilities().vkQueuePresentKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkPresentInfoKHR.validate(pPresentInfo);
        }
        return callPPI(__functionAddress, queue.address(), pPresentInfo);
    }

    /**
     * Queue an image for presentation.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>After queueing all rendering commands and transitioning the image to the correct layout, to queue an image for presentation, call:</p>
     * 
     * <code><pre>
     * VkResult vkQueuePresentKHR(
     *     VkQueue                                     queue,
     *     const VkPresentInfoKHR*                     pPresentInfo);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>There is no requirement for an application to present images in the same order that they were acquired - applications can arbitrarily present any image that is currently acquired.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Each element of {@code pSwapchains} member of {@code pPresentInfo} <b>must</b> be a swapchain that is created for a surface for which presentation is supported from {@code queue} as determined using a call to {@link KHRSurface#vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR}</li>
     * <li>If more than one member of {@code pSwapchains} was created from a display surface, all display surfaces referenced that refer to the same display <b>must</b> use the same display mode</li>
     * <li>When a semaphore unsignal operation defined by the elements of the {@code pWaitSemaphores} member of {@code pPresentInfo} executes on {@code queue}, no other queue <b>must</b> be waiting on the same semaphore.</li>
     * <li>All elements of the {@code pWaitSemaphores} member of {@code pPresentInfo} <b>must</b> be semaphores that are signaled, or have <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-semaphores-signaling">semaphore signal operations</a> previously submitted for execution.</li>
     * </ul>
     * 
     * <p>Any writes to memory backing the images referenced by the {@code pImageIndices} and {@code pSwapchains} members of {@code pPresentInfo}, that are available before {@link #vkQueuePresentKHR QueuePresentKHR} is executed, are automatically made visible to the read access performed by the presentation engine. This automatic visibility operation for an image happens-after the semaphore signal operation, and happens-before the presentation engine accesses the image.</p>
     * 
     * <p>Queueing an image for presentation defines a set of <em>queue operations</em>, including waiting on the semaphores and submitting a presentation request to the presentation engine. However, the scope of this set of queue operations does not include the actual processing of the image by the presentation engine.</p>
     * 
     * <p>If {@link #vkQueuePresentKHR QueuePresentKHR} fails to enqueue the corresponding set of queue operations, it <b>may</b> return {@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY} or {@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}. If it does, the implementation <b>must</b> ensure that the state and contents of any resources or synchronization primitives referenced is unaffected by the call or its failure.</p>
     * 
     * <p>If {@link #vkQueuePresentKHR QueuePresentKHR} fails in such a way that the implementation is unable to make that guarantee, the implementation <b>must</b> return {@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}.</p>
     * 
     * <p>However, if the presentation request is rejected by the presentation engine with an error {@link #VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR} or {@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}, the set of queue operations are still considered to be enqueued and thus any semaphore to be waited on gets unsignaled when the corresponding queue operation is complete.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
     * <li>{@code pPresentInfo} <b>must</b> be a valid pointer to a valid {@link VkPresentInfoKHR} structure</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
     * <li>Host access to {@code pPresentInfo.pWaitSemaphores}[] <b>must</b> be externally synchronized</li>
     * <li>Host access to {@code pPresentInfo.pSwapchains}[] <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>-</td><td>-</td><td>Any</td><td>-</td></tr></tbody>
     * </table>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link #VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * <li>{@link #VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}</li>
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPresentInfoKHR}</p>
     *
     * @param queue        a queue that is capable of presentation to the target surface&#8217;s platform on the same device as the image&#8217;s swapchain.
     * @param pPresentInfo a pointer to an instance of the {@link VkPresentInfoKHR} structure specifying the parameters of the presentation.
     */
    @NativeType("VkResult")
    public static int vkQueuePresentKHR(VkQueue queue, @NativeType("VkPresentInfoKHR const *") VkPresentInfoKHR pPresentInfo) {
        return nvkQueuePresentKHR(queue, pPresentInfo.address());
    }

    // --- [ vkGetDeviceGroupPresentCapabilitiesKHR ] ---

    /** Unsafe version of: {@link #vkGetDeviceGroupPresentCapabilitiesKHR GetDeviceGroupPresentCapabilitiesKHR} */
    public static int nvkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, long pDeviceGroupPresentCapabilities) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPresentCapabilitiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, device.address(), pDeviceGroupPresentCapabilities);
    }

    /**
     * Query present capabilities from other physical devices.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A logical device that represents multiple physical devices <b>may</b> support presenting from images on more than one physical device, or combining images from multiple physical devices.</p>
     * 
     * <p>To query these capabilities, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetDeviceGroupPresentCapabilitiesKHR(
     *     VkDevice                                    device,
     *     VkDeviceGroupPresentCapabilitiesKHR*        pDeviceGroupPresentCapabilities);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pDeviceGroupPresentCapabilities} <b>must</b> be a valid pointer to a {@link VkDeviceGroupPresentCapabilitiesKHR} structure</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceGroupPresentCapabilitiesKHR}</p>
     *
     * @param device                          the logical device.
     * @param pDeviceGroupPresentCapabilities a pointer to a structure of type {@link VkDeviceGroupPresentCapabilitiesKHR} that is filled with the logical device&#8217;s capabilities.
     */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, @NativeType("VkDeviceGroupPresentCapabilitiesKHR *") VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities) {
        return nvkGetDeviceGroupPresentCapabilitiesKHR(device, pDeviceGroupPresentCapabilities.address());
    }

    // --- [ vkGetDeviceGroupSurfacePresentModesKHR ] ---

    /** Unsafe version of: {@link #vkGetDeviceGroupSurfacePresentModesKHR GetDeviceGroupSurfacePresentModesKHR} */
    public static int nvkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, long surface, long pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(__functionAddress, device.address(), surface, pModes);
    }

    /**
     * Query present capabilities for a surface.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Some surfaces <b>may</b> not be capable of using all the device group present modes.</p>
     * 
     * <p>To query the supported device group present modes for a particular surface, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetDeviceGroupSurfacePresentModesKHR(
     *     VkDevice                                    device,
     *     VkSurfaceKHR                                surface,
     *     VkDeviceGroupPresentModeFlagsKHR*           pModes);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>The modes returned by this command are not invariant, and <b>may</b> change in response to the surface being moved, resized, or occluded. These modes <b>must</b> be a subset of the modes returned by {@link #vkGetDeviceGroupPresentCapabilitiesKHR GetDeviceGroupPresentCapabilitiesKHR}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>{@code pModes} <b>must</b> be a valid pointer to a {@code VkDeviceGroupPresentModeFlagsKHR} value</li>
     * <li>Both of {@code device}, and {@code surface} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
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
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device  the logical device.
     * @param surface the surface.
     * @param pModes  a pointer to a value of type {@code VkDeviceGroupPresentModeFlagsKHR} that is filled with the supported device group present modes for the surface.
     */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") IntBuffer pModes) {
        if (CHECKS) {
            check(pModes, 1);
        }
        return nvkGetDeviceGroupSurfacePresentModesKHR(device, surface, memAddress(pModes));
    }

    // --- [ vkGetPhysicalDevicePresentRectanglesKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDevicePresentRectanglesKHR GetPhysicalDevicePresentRectanglesKHR}
     *
     * @param pRectCount a pointer to an integer related to the number of rectangles available or queried, as described below.
     */
    public static int nvkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, long surface, long pRectCount, long pRects) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDevicePresentRectanglesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(__functionAddress, physicalDevice.address(), surface, pRectCount, pRects);
    }

    /**
     * Query present rectangles for a surface on a physical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>When using {@link #VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR}, the application <b>may</b> need to know which regions of the surface are used when presenting locally on each physical device. Presentation of swapchain images to this surface need only have valid contents in the regions returned by this command.</p>
     * 
     * <p>To query a set of rectangles used in presentation on the physical device, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetPhysicalDevicePresentRectanglesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkSurfaceKHR                                surface,
     *     uint32_t*                                   pRectCount,
     *     VkRect2D*                                   pRects);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pRects} is {@code NULL}, then the number of rectangles used when presenting the given {@code surface} is returned in {@code pRectCount}. Otherwise, {@code pRectCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pRects} array, and on return the variable is overwritten with the number of structures actually written to {@code pRects}. If the value of {@code pRectCount} is less than the number of rectangles, at most {@code pRectCount} structures will be written. If {@code pRectCount} is smaller than the number of rectangles used for the given {@code surface}, {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS} to indicate that not all the available values were returned.</p>
     * 
     * <p>The values returned by this command are not invariant, and <b>may</b> change in response to the surface being moved, resized, or occluded.</p>
     * 
     * <p>The rectangles returned by this command <b>must</b> not overlap.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>{@code pRectCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pRectCount} is not 0, and {@code pRects} is not {@code NULL}, {@code pRects} <b>must</b> be a valid pointer to an array of {@code pRectCount} {@link VkRect2D} structures</li>
     * <li>Both of {@code physicalDevice}, and {@code surface} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRect2D}</p>
     *
     * @param physicalDevice the physical device.
     * @param surface        the surface.
     * @param pRectCount     a pointer to an integer related to the number of rectangles available or queried, as described below.
     * @param pRects         either {@code NULL} or a pointer to an array of {@link VkRect2D} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") IntBuffer pRectCount, @Nullable @NativeType("VkRect2D *") VkRect2D.Buffer pRects) {
        if (CHECKS) {
            check(pRectCount, 1);
            checkSafe(pRects, pRectCount.get(pRectCount.position()));
        }
        return nvkGetPhysicalDevicePresentRectanglesKHR(physicalDevice, surface, memAddress(pRectCount), memAddressSafe(pRects));
    }

    // --- [ vkAcquireNextImage2KHR ] ---

    /** Unsafe version of: {@link #vkAcquireNextImage2KHR AcquireNextImage2KHR} */
    public static int nvkAcquireNextImage2KHR(VkDevice device, long pAcquireInfo, long pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, device.address(), pAcquireInfo, pImageIndex);
    }

    /**
     * Retrieve the index of the next available presentable image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To acquire an available presentable image to use, and retrieve the index of that image, call:</p>
     * 
     * <code><pre>
     * VkResult vkAcquireNextImage2KHR(
     *     VkDevice                                    device,
     *     const VkAcquireNextImageInfoKHR*            pAcquireInfo,
     *     uint32_t*                                   pImageIndex);</pre></code>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If the number of currently acquired images is greater than the difference between the number of images in the {@code swapchain} member of {@code pAcquireInfo} and the value of {@link VkSurfaceCapabilitiesKHR}{@code ::minImageCount} as returned by a call to {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR} with the {@code surface} used to create {@code swapchain}, the {@code timeout} member of {@code pAcquireInfo} <b>must</b> not be {@code UINT64_MAX}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pAcquireInfo} <b>must</b> be a valid pointer to a valid {@link VkAcquireNextImageInfoKHR} structure</li>
     * <li>{@code pImageIndex} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_TIMEOUT TIMEOUT}</li>
     * <li>{@link VK10#VK_NOT_READY NOT_READY}</li>
     * <li>{@link #VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * <li>{@link #VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}</li>
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAcquireNextImageInfoKHR}</p>
     *
     * @param device       the device associated with {@code swapchain}.
     * @param pAcquireInfo a pointer to a structure of type {@link VkAcquireNextImageInfoKHR} containing parameters of the acquire.
     * @param pImageIndex  a pointer to a {@code uint32_t} that is set to the index of the next image to use.
     */
    @NativeType("VkResult")
    public static int vkAcquireNextImage2KHR(VkDevice device, @NativeType("VkAcquireNextImageInfoKHR const *") VkAcquireNextImageInfoKHR pAcquireInfo, @NativeType("uint32_t *") IntBuffer pImageIndex) {
        if (CHECKS) {
            check(pImageIndex, 1);
        }
        return nvkAcquireNextImage2KHR(device, pAcquireInfo.address(), memAddress(pImageIndex));
    }

    /** Array version of: {@link #vkCreateSwapchainKHR CreateSwapchainKHR} */
    @NativeType("VkResult")
    public static int vkCreateSwapchainKHR(VkDevice device, @NativeType("VkSwapchainCreateInfoKHR const *") VkSwapchainCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSwapchainKHR *") long[] pSwapchain) {
        long __functionAddress = device.getCapabilities().vkCreateSwapchainKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSwapchain, 1);
            VkSwapchainCreateInfoKHR.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSwapchain);
    }

    /** Array version of: {@link #vkGetSwapchainImagesKHR GetSwapchainImagesKHR} */
    @NativeType("VkResult")
    public static int vkGetSwapchainImagesKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t *") int[] pSwapchainImageCount, @Nullable @NativeType("VkImage *") long[] pSwapchainImages) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainImagesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSwapchainImageCount, 1);
            checkSafe(pSwapchainImages, pSwapchainImageCount[0]);
        }
        return callPJPPI(__functionAddress, device.address(), swapchain, pSwapchainImageCount, pSwapchainImages);
    }

    /** Array version of: {@link #vkAcquireNextImageKHR AcquireNextImageKHR} */
    @NativeType("VkResult")
    public static int vkAcquireNextImageKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint64_t") long timeout, @NativeType("VkSemaphore") long semaphore, @NativeType("VkFence") long fence, @NativeType("uint32_t *") int[] pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pImageIndex, 1);
        }
        return callPJJJJPI(__functionAddress, device.address(), swapchain, timeout, semaphore, fence, pImageIndex);
    }

    /** Array version of: {@link #vkGetDeviceGroupSurfacePresentModesKHR GetDeviceGroupSurfacePresentModesKHR} */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") int[] pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pModes, 1);
        }
        return callPJPI(__functionAddress, device.address(), surface, pModes);
    }

    /** Array version of: {@link #vkGetPhysicalDevicePresentRectanglesKHR GetPhysicalDevicePresentRectanglesKHR} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") int[] pRectCount, @Nullable @NativeType("VkRect2D *") VkRect2D.Buffer pRects) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDevicePresentRectanglesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pRectCount, 1);
            checkSafe(pRects, pRectCount[0]);
        }
        return callPJPPI(__functionAddress, physicalDevice.address(), surface, pRectCount, memAddressSafe(pRects));
    }

    /** Array version of: {@link #vkAcquireNextImage2KHR AcquireNextImage2KHR} */
    @NativeType("VkResult")
    public static int vkAcquireNextImage2KHR(VkDevice device, @NativeType("VkAcquireNextImageInfoKHR const *") VkAcquireNextImageInfoKHR pAcquireInfo, @NativeType("uint32_t *") int[] pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pImageIndex, 1);
        }
        return callPPPI(__functionAddress, device.address(), pAcquireInfo.address(), pImageIndex);
    }

}