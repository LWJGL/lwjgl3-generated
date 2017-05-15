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
 * This extension provides instance-level commands to enumerate groups of physical devices, and to create a logical device from a subset of one of those groups. Such a logical device can then be used with new features in the VK_KHX_device_group extension.
 * 
 * <h5>Examples</h5>
 * 
 * <code><pre>
 *     VkDeviceCreateInfo devCreateInfo = { VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO };
 *     // (not shown) fill out devCreateInfo as usual.
 *     uint32_t deviceGroupCount = 0;
 *     VkPhysicalDeviceGroupPropertiesKHX *props = NULL;
 * 
 *     // Query the number of device groups
 *     vkEnumeratePhysicalDeviceGroupsKHX(g_vkInstance, &deviceGroupCount, NULL);
 * 
 *     // Allocate and initialize structures to query the device groups
 *     props = (VkPhysicalDeviceGroupPropertiesKHX *)malloc(deviceGroupCount*sizeof(VkPhysicalDeviceGroupPropertiesKHX));
 *     for (i = 0; i < deviceGroupCount; ++i) {
 *         props[i].sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHX;
 *         props[i].pNext = NULL;
 *     }
 *     vkEnumeratePhysicalDeviceGroupsKHX(g_vkInstance, &deviceGroupCount, props);
 * 
 *     // If the first device group has more than one physical device. create
 *     // a logical device using all of the physical devices.
 *     VkDeviceGroupDeviceCreateInfoKHX deviceGroupInfo = { VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHX };
 *     if (props[0].physicalDeviceCount > 1) {
 *         deviceGroupInfo.physicalDeviceCount = props[0].physicalDeviceCount;
 *         deviceGroupInfo.pPhysicalDevices = props[0].physicalDevices;
 *         devCreateInfo.pNext = &deviceGroupInfo;
 *     }
 * 
 *     vkCreateDevice(props[0].physicalDevices[0], &devCreateInfo, NULL, &g_vkDevice);
 *     free(props);</pre></code>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_KHX_device_group_creation</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>71</dd>
 * <dt><b>Status</b></dt>
 * <dd>Draft.</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-10-19</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * <dt><b>Contacts</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz (jbolz 'at' nvidia.com)</li>
 * </ul></dd>
 * </dl>
 */
public class KHXDeviceGroupCreation {

    /** The extension specification version. */
    public static final int VK_KHX_DEVICE_GROUP_CREATION_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHX_DEVICE_GROUP_CREATION_EXTENSION_NAME = "VK_KHX_device_group_creation";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHX STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHX STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHX}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHX = 1000070000,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHX  = 1000070001;

    /** VK_MAX_DEVICE_GROUP_SIZE_KHX */
    public static final int VK_MAX_DEVICE_GROUP_SIZE_KHX = 32;

    /** Extends {@code VkMemoryHeapFlagBits}. */
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX = 0x2;

    protected KHXDeviceGroupCreation() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesInstance caps) {
        return checkFunctions(
            caps.vkEnumeratePhysicalDeviceGroupsKHX
        );
    }

    // --- [ vkEnumeratePhysicalDeviceGroupsKHX ] ---

    /**
     * Unsafe version of: {@link #vkEnumeratePhysicalDeviceGroupsKHX EnumeratePhysicalDeviceGroupsKHX}
     *
     * @param pPhysicalDeviceGroupCount a pointer to an integer related to the number of device groups available or queried, as described below.
     */
    public static int nvkEnumeratePhysicalDeviceGroupsKHX(VkInstance instance, long pPhysicalDeviceGroupCount, long pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroupsKHX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, instance.address(), pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties);
    }

    /**
     * Enumerates groups of physical devices that can be used to create a single logical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To retrieve a list of the device groups present in the system, call:</p>
     * 
     * <code><pre>
     * VkResult vkEnumeratePhysicalDeviceGroupsKHX(
     *     VkInstance                                  instance,
     *     uint32_t*                                   pPhysicalDeviceGroupCount,
     *     VkPhysicalDeviceGroupPropertiesKHX*         pPhysicalDeviceGroupProperties);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pPhysicalDeviceGroupProperties} is {@code NULL}, then the number of device groups available is returned in {@code pPhysicalDeviceGroupCount}. Otherwise, {@code pPhysicalDeviceGroupCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPhysicalDeviceGroupProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pPhysicalDeviceGroupProperties}. If {@code pPhysicalDeviceGroupCount} is less than the number of device groups available, at most {@code pPhysicalDeviceGroupCount} structures will be written. If {@code pPhysicalDeviceGroupCount} is smaller than the number of device groups available, {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available device groups were returned.</p>
     * 
     * <p>Every physical device <b>must</b> be in exactly one device group.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code pPhysicalDeviceGroupCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pPhysicalDeviceGroupCount} is not 0, and {@code pPhysicalDeviceGroupProperties} is not {@code NULL}, {@code pPhysicalDeviceGroupProperties} <b>must</b> be a pointer to an array of {@code pPhysicalDeviceGroupCount} {@link VkPhysicalDeviceGroupPropertiesKHX} structures</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceGroupPropertiesKHX}</p>
     *
     * @param instance                       a handle to a Vulkan instance previously created with {@link VK10#vkCreateInstance CreateInstance}.
     * @param pPhysicalDeviceGroupCount      a pointer to an integer related to the number of device groups available or queried, as described below.
     * @param pPhysicalDeviceGroupProperties either {@code NULL} or a pointer to an array of {@link VkPhysicalDeviceGroupPropertiesKHX} structures.
     */
    public static int vkEnumeratePhysicalDeviceGroupsKHX(VkInstance instance, IntBuffer pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupPropertiesKHX.Buffer pPhysicalDeviceGroupProperties) {
        if (CHECKS) {
            check(pPhysicalDeviceGroupCount, 1);
            checkSafe(pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount.get(pPhysicalDeviceGroupCount.position()));
        }
        return nvkEnumeratePhysicalDeviceGroupsKHX(instance, memAddress(pPhysicalDeviceGroupCount), memAddressSafe(pPhysicalDeviceGroupProperties));
    }

    /** Array version of: {@link #vkEnumeratePhysicalDeviceGroupsKHX EnumeratePhysicalDeviceGroupsKHX} */
    public static int vkEnumeratePhysicalDeviceGroupsKHX(VkInstance instance, int[] pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupPropertiesKHX.Buffer pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroupsKHX;
        if (CHECKS) {
            check(__functionAddress);
            check(pPhysicalDeviceGroupCount, 1);
            checkSafe(pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount[0]);
        }
        return callPPPI(__functionAddress, instance.address(), pPhysicalDeviceGroupCount, memAddressSafe(pPhysicalDeviceGroupProperties));
    }

}