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
 * This extension allows an application to take exclusive control on a display currently associated with an X11 screen. When control is acquired, the display will be deassociated from the X11 screen until control is released or the specified display connection is closed. Essentially, the X11 screen will behave as if the monitor has been unplugged until control is released.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_EXT_acquire_xlib_display</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>90</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-12-13</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0.37 of the Vulkan API.</li>
 * <li>Requires VK_KHR_display.</li>
 * <li>Requires VK_EXT_direct_mode_display.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Dave Airlie, Red Hat</li>
 * <li>Pierre Boudier, NVIDIA</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Damien Leone, NVIDIA</li>
 * <li>Pierre-Loup Griffais, Valve</li>
 * <li>Liam Middlebrook, NVIDIA</li>
 * <li>Daniel Vetter, Intel</li>
 * </ul></dd>
 * <dt><b>Contacts</b></dt>
 * <dd><ul>
 * <li>James Jones, NVIDIA (jajones 'at' nvidia.com)</li>
 * </ul></dd>
 * </dl>
 */
public class EXTAcquireXlibDisplay {

    /** The extension specification version. */
    public static final int VK_EXT_ACQUIRE_XLIB_DISPLAY_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_ACQUIRE_XLIB_DISPLAY_EXTENSION_NAME = "VK_EXT_acquire_xlib_display";

    protected EXTAcquireXlibDisplay() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesInstance caps) {
        return checkFunctions(
            caps.vkAcquireXlibDisplayEXT, caps.vkGetRandROutputDisplayEXT
        );
    }

    // --- [ vkAcquireXlibDisplayEXT ] ---

    /**
     * Acquire access to a VkDisplayKHR using Xlib.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To acquire permission to directly access a display in Vulkan from an X11 server, call:</p>
     * 
     * <code><pre>
     * VkResult vkAcquireXlibDisplayEXT(
     *     VkPhysicalDevice                            physicalDevice,
     *     Display*                                    dpy,
     *     VkDisplayKHR                                display);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>All permissions necessary to control the display are granted to the Vulkan instance associated with {@code physicalDevice} until the display is released or the X11 connection specified by {@code dpy} is terminated. Permission to access the display <b>may</b> be temporarily revoked during periods when the X11 server from which control was acquired itself looses access to {@code display}. During such periods, operations which require access to the display <b>must</b> fail with an approriate error code. If the X11 server associated with {@code dpy} does not own {@code display}, or if permission to access it has already been acquired by another entity, the call <b>must</b> return the error code VK_ERROR_INITIALIZATION_FAILED.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>One example of when an X11 server loses access to a display is when it loses ownership of its virtual terminal.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code dpy} <b>must</b> be a pointer to a {@code Display} value</li>
     * <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
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
     * @param physicalDevice The physical device the display is on.
     * @param dpy            A connection to the X11 server that currently owns {@code display}.
     * @param display        The display the caller wishes to control in Vulkan.
     */
    public static int vkAcquireXlibDisplayEXT(VkPhysicalDevice physicalDevice, long dpy, long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkAcquireXlibDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPJI(__functionAddress, physicalDevice.address(), dpy, display);
    }

    // --- [ vkGetRandROutputDisplayEXT ] ---

    /** Unsafe version of: {@link #vkGetRandROutputDisplayEXT GetRandROutputDisplayEXT} */
    public static int nvkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, long dpy, long rrOutput, long pDisplay) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetRandROutputDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPPI(__functionAddress, physicalDevice.address(), dpy, rrOutput, pDisplay);
    }

    /**
     * Query the VkDisplayKHR corresponding to an X11 RandR Output.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>When acquiring displays from an X11 server, an application may also wish to enumerate and identify them using a native handle rather than a {@code VkDisplayKHR} handle. To determine the {@code VkDisplayKHR} handle corresponding to an X11 RandR Output, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetRandROutputDisplayEXT(
     *     VkPhysicalDevice                            physicalDevice,
     *     Display*                                    dpy,
     *     RROutput                                    rrOutput,
     *     VkDisplayKHR*                               pDisplay);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>If there is no VkDisplayKHR corresponding to {@code rrOutput} on {@code physicalDevice}, {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> be returned in {@code pDisplay}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code dpy} <b>must</b> be a pointer to a {@code Display} value</li>
     * <li>{@code pDisplay} <b>must</b> be a pointer to a {@code VkDisplayKHR} handle</li>
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
     * @param physicalDevice The physical device to query the display handle on.
     * @param dpy            A connection to the X11 server from which {@code rrOutput} was queried.
     * @param rrOutput       An X11 RandR output ID.
     * @param pDisplay       The corresponding VkDisplayKHR handle will be returned here.
     */
    public static int vkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, long dpy, long rrOutput, LongBuffer pDisplay) {
        if (CHECKS) {
            check(pDisplay, 1);
        }
        return nvkGetRandROutputDisplayEXT(physicalDevice, dpy, rrOutput, memAddress(pDisplay));
    }

    /** Array version of: {@link #vkGetRandROutputDisplayEXT GetRandROutputDisplayEXT} */
    public static int vkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, long dpy, long rrOutput, long[] pDisplay) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetRandROutputDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(pDisplay, 1);
        }
        return callPPPPI(__functionAddress, physicalDevice.address(), dpy, rrOutput, pDisplay);
    }

}