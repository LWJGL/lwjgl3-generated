/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_EXT_direct_mode_display</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>89</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-12-13</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0.37 of the Vulkan API.</li>
 * <li>Requires VK_KHR_display</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Pierre Boudier, NVIDIA</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Damien Leone, NVIDIA</li>
 * <li>Pierre-Loup Griffais, Valve</li>
 * <li>Liam Middlebrook, NVIDIA</li>
 * </ul></dd>
 * <dt><b>Contacts</b></dt>
 * <dd><ul>
 * <li>James Jones, NVIDIA (jajones 'at' nvidia.com)</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>This is extension, along with related platform exentions, allows applications to take exclusive control of displays associated with a native windowing system. This is especially useful for virtual reality applications that wish to hide HMDs (head mounted displays) from the native platform's display management system, desktop, and/or other applications.</p>
 */
public class EXTDirectModeDisplay {

    /** The extension specification version. */
    public static final int VK_EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME = "VK_EXT_direct_mode_display";

    protected EXTDirectModeDisplay() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesInstance caps) {
        return checkFunctions(
            caps.vkReleaseDisplayEXT
        );
    }

    // --- [ vkReleaseDisplayEXT ] ---

    /**
     * Release access to an acquired VkDisplayKHR.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To release a previously acquired display, call:</p>
     * 
     * <pre><code>VkResult vkReleaseDisplayEXT(
    VkPhysicalDevice                            physicalDevice,
    VkDisplayKHR                                display);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
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
     * @param display        The display to release control of.
     */
    public static int vkReleaseDisplayEXT(VkPhysicalDevice physicalDevice, long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkReleaseDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(__functionAddress, physicalDevice.address(), display);
    }

}