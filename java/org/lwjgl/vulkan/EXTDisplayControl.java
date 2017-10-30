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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension defines a set of utility functions for use with the {@code VK_KHR_display} and {@code VK_KHR_display_swapchain} extensions.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_display_control}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>92</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VK_EXT_display_surface_counter">{@code VK_EXT_display_surface_counter}</a></li>
 * <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VK_KHR_swapchain">{@code VK_KHR_swapchain}</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones @cubanismo</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-12-13</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Pierre Boudier, NVIDIA</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Damien Leone, NVIDIA</li>
 * <li>Pierre-Loup Griffais, Valve</li>
 * <li>Daniel Vetter, Intel</li>
 * </ul></dd>
 * </dl>
 */
public class EXTDisplayControl {

    /** The extension specification version. */
    public static final int VK_EXT_DISPLAY_CONTROL_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_DISPLAY_CONTROL_EXTENSION_NAME = "VK_EXT_display_control";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT            = 1000091000,
        VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT             = 1000091001,
        VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT            = 1000091002,
        VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT = 1000091003;

    /**
     * VkDisplayPowerStateEXT - Possible power states for a display
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DISPLAY_POWER_STATE_OFF_EXT DISPLAY_POWER_STATE_OFF_EXT} specifies that the display is powered down.</li>
     * <li>{@link #VK_DISPLAY_POWER_STATE_SUSPEND_EXT DISPLAY_POWER_STATE_SUSPEND_EXT} specifies that the display is put into a low power mode, from which it <b>may</b> be able to transition back to {@link #VK_DISPLAY_POWER_STATE_ON_EXT DISPLAY_POWER_STATE_ON_EXT} more quickly than if it were in {@link #VK_DISPLAY_POWER_STATE_OFF_EXT DISPLAY_POWER_STATE_OFF_EXT}. This state <b>may</b> be the same as {@link #VK_DISPLAY_POWER_STATE_OFF_EXT DISPLAY_POWER_STATE_OFF_EXT}.</li>
     * <li>{@link #VK_DISPLAY_POWER_STATE_ON_EXT DISPLAY_POWER_STATE_ON_EXT} specifies that the display is powered on.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDisplayPowerInfoEXT}</p>
     */
    public static final int
        VK_DISPLAY_POWER_STATE_OFF_EXT     = 0,
        VK_DISPLAY_POWER_STATE_SUSPEND_EXT = 1,
        VK_DISPLAY_POWER_STATE_ON_EXT      = 2;

    /**
     * VkDeviceEventTypeEXT - Events that can occur on a device object
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT} specifies that the fence is signaled when a display is plugged into or unplugged from the specified device. Applications <b>can</b> use this notification to determine when they need to re-enumerate the available displays on a device.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceEventInfoEXT}</p>
     */
    public static final int VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT = 0;

    /**
     * VkDisplayEventTypeEXT - Events that can occur on a display object
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT} specifies that the fence is signaled when the first pixel of the next display refresh cycle leaves the display engine for the display.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDisplayEventInfoEXT}</p>
     */
    public static final int VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = 0;

    protected EXTDisplayControl() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesDevice caps) {
        return checkFunctions(
            caps.vkDisplayPowerControlEXT, caps.vkRegisterDeviceEventEXT, caps.vkRegisterDisplayEventEXT, caps.vkGetSwapchainCounterEXT
        );
    }

    // --- [ vkDisplayPowerControlEXT ] ---

    /** Unsafe version of: {@link #vkDisplayPowerControlEXT DisplayPowerControlEXT} */
    public static int nvkDisplayPowerControlEXT(VkDevice device, long display, long pDisplayPowerInfo) {
        long __functionAddress = device.getCapabilities().vkDisplayPowerControlEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(__functionAddress, device.address(), display, pDisplayPowerInfo);
    }

    /**
     * Set the power state of a display.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To set the power state of a display, call:</p>
     * 
     * <code><pre>
     * VkResult vkDisplayPowerControlEXT(
     *     VkDevice                                    device,
     *     VkDisplayKHR                                display,
     *     const VkDisplayPowerInfoEXT*                pDisplayPowerInfo);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
     * <li>{@code pDisplayPowerInfo} <b>must</b> be a valid pointer to a valid {@link VkDisplayPowerInfoEXT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDisplayPowerInfoEXT}</p>
     *
     * @param device            a logical device associated with {@code display}.
     * @param display           the display whose power state is modified.
     * @param pDisplayPowerInfo an instance of {@link VkDisplayPowerInfoEXT} specifying the new power state of {@code display}.
     */
    @NativeType("VkResult")
    public static int vkDisplayPowerControlEXT(VkDevice device, @NativeType("VkDisplayKHR") long display, @NativeType("const VkDisplayPowerInfoEXT *") VkDisplayPowerInfoEXT pDisplayPowerInfo) {
        return nvkDisplayPowerControlEXT(device, display, pDisplayPowerInfo.address());
    }

    // --- [ vkRegisterDeviceEventEXT ] ---

    /** Unsafe version of: {@link #vkRegisterDeviceEventEXT RegisterDeviceEventEXT} */
    public static int nvkRegisterDeviceEventEXT(VkDevice device, long pDeviceEventInfo, long pAllocator, long pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDeviceEventEXT;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(__functionAddress, device.address(), pDeviceEventInfo, pAllocator, pFence);
    }

    /**
     * Signal a fence when a device event occurs.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a fence that will be signaled when an event occurs on a device, call:</p>
     * 
     * <code><pre>
     * VkResult vkRegisterDeviceEventEXT(
     *     VkDevice                                    device,
     *     const VkDeviceEventInfoEXT*                 pDeviceEventInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkFence*                                    pFence);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pDeviceEventInfo} <b>must</b> be a valid pointer to a valid {@link VkDeviceEventInfoEXT} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pFence} <b>must</b> be a valid pointer to a {@code VkFence} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkDeviceEventInfoEXT}</p>
     *
     * @param device           a logical device on which the event <b>may</b> occur.
     * @param pDeviceEventInfo a pointer to an instance of the {@link VkDeviceEventInfoEXT} structure describing the event of interest to the application.
     * @param pAllocator       controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pFence           points to a handle in which the resulting fence object is returned.
     */
    @NativeType("VkResult")
    public static int vkRegisterDeviceEventEXT(VkDevice device, @NativeType("const VkDeviceEventInfoEXT *") VkDeviceEventInfoEXT pDeviceEventInfo, @NativeType("const VkAllocationCallbacks *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") LongBuffer pFence) {
        if (CHECKS) {
            check(pFence, 1);
        }
        return nvkRegisterDeviceEventEXT(device, pDeviceEventInfo.address(), memAddressSafe(pAllocator), memAddress(pFence));
    }

    // --- [ vkRegisterDisplayEventEXT ] ---

    /** Unsafe version of: {@link #vkRegisterDisplayEventEXT RegisterDisplayEventEXT} */
    public static int nvkRegisterDisplayEventEXT(VkDevice device, long display, long pDisplayEventInfo, long pAllocator, long pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDisplayEventEXT;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPJPPPI(__functionAddress, device.address(), display, pDisplayEventInfo, pAllocator, pFence);
    }

    /**
     * Signal a fence when a display event occurs.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a fence that will be signaled when an event occurs on a VkDisplayKHR object, call:</p>
     * 
     * <code><pre>
     * VkResult vkRegisterDisplayEventEXT(
     *     VkDevice                                    device,
     *     VkDisplayKHR                                display,
     *     const VkDisplayEventInfoEXT*                pDisplayEventInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkFence*                                    pFence);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
     * <li>{@code pDisplayEventInfo} <b>must</b> be a valid pointer to a valid {@link VkDisplayEventInfoEXT} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pFence} <b>must</b> be a valid pointer to a {@code VkFence} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkDisplayEventInfoEXT}</p>
     *
     * @param device            a logical device associated with {@code display}
     * @param display           the display on which the event <b>may</b> occur.
     * @param pDisplayEventInfo a pointer to an instance of the {@link VkDisplayEventInfoEXT} structure describing the event of interest to the application.
     * @param pAllocator        controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pFence            points to a handle in which the resulting fence object is returned.
     */
    @NativeType("VkResult")
    public static int vkRegisterDisplayEventEXT(VkDevice device, @NativeType("VkDisplayKHR") long display, @NativeType("const VkDisplayEventInfoEXT *") VkDisplayEventInfoEXT pDisplayEventInfo, @NativeType("const VkAllocationCallbacks *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") LongBuffer pFence) {
        if (CHECKS) {
            check(pFence, 1);
        }
        return nvkRegisterDisplayEventEXT(device, display, pDisplayEventInfo.address(), memAddressSafe(pAllocator), memAddress(pFence));
    }

    // --- [ vkGetSwapchainCounterEXT ] ---

    /** Unsafe version of: {@link #vkGetSwapchainCounterEXT GetSwapchainCounterEXT} */
    public static int nvkGetSwapchainCounterEXT(VkDevice device, long swapchain, int counter, long pCounterValue) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainCounterEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(__functionAddress, device.address(), swapchain, counter, pCounterValue);
    }

    /**
     * Query the current value of a surface counter.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The requested counters become active when the first presentation command for the associated swapchain is processed by the presentation engine. To query the value of an active counter, use:</p>
     * 
     * <code><pre>
     * VkResult vkGetSwapchainCounterEXT(
     *     VkDevice                                    device,
     *     VkSwapchainKHR                              swapchain,
     *     VkSurfaceCounterFlagBitsEXT                 counter,
     *     uint64_t*                                   pCounterValue);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>If a counter is not available because the swapchain is out of date, the implementation <b>may</b> return {@link KHRSwapchain#VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>One or more present commands on {@code swapchain} <b>must</b> have been processed by the presentation engine.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
     * <li>{@code counter} <b>must</b> be a valid {@code VkSurfaceCounterFlagBitsEXT} value</li>
     * <li>{@code pCounterValue} <b>must</b> be a valid pointer to a {@code uint64_t} value</li>
     * <li>Both of {@code device}, and {@code swapchain} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * <li>{@link KHRSwapchain#VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device        the {@code VkDevice} associated with {@code swapchain}.
     * @param swapchain     the swapchain from which to query the counter value.
     * @param counter       the counter to query.
     * @param pCounterValue will return the current value of the counter.
     */
    @NativeType("VkResult")
    public static int vkGetSwapchainCounterEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSurfaceCounterFlagBitsEXT") int counter, @NativeType("uint64_t *") LongBuffer pCounterValue) {
        if (CHECKS) {
            check(pCounterValue, 1);
        }
        return nvkGetSwapchainCounterEXT(device, swapchain, counter, memAddress(pCounterValue));
    }

    /** Array version of: {@link #vkRegisterDeviceEventEXT RegisterDeviceEventEXT} */
    @NativeType("VkResult")
    public static int vkRegisterDeviceEventEXT(VkDevice device, @NativeType("const VkDeviceEventInfoEXT *") VkDeviceEventInfoEXT pDeviceEventInfo, @NativeType("const VkAllocationCallbacks *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") long[] pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDeviceEventEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pFence, 1);
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(__functionAddress, device.address(), pDeviceEventInfo.address(), memAddressSafe(pAllocator), pFence);
    }

    /** Array version of: {@link #vkRegisterDisplayEventEXT RegisterDisplayEventEXT} */
    @NativeType("VkResult")
    public static int vkRegisterDisplayEventEXT(VkDevice device, @NativeType("VkDisplayKHR") long display, @NativeType("const VkDisplayEventInfoEXT *") VkDisplayEventInfoEXT pDisplayEventInfo, @NativeType("const VkAllocationCallbacks *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") long[] pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDisplayEventEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pFence, 1);
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPJPPPI(__functionAddress, device.address(), display, pDisplayEventInfo.address(), memAddressSafe(pAllocator), pFence);
    }

    /** Array version of: {@link #vkGetSwapchainCounterEXT GetSwapchainCounterEXT} */
    @NativeType("VkResult")
    public static int vkGetSwapchainCounterEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSurfaceCounterFlagBitsEXT") int counter, @NativeType("uint64_t *") long[] pCounterValue) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainCounterEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pCounterValue, 1);
        }
        return callPJPI(__functionAddress, device.address(), swapchain, counter, pCounterValue);
    }

}