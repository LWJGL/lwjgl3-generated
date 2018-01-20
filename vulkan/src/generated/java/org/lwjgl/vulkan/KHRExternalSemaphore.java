/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * An application using external memory may wish to synchronize access to that memory using semaphores. This extension enables an application to create semaphores from which non-Vulkan handles that reference the underlying synchronization primitive can be exported.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_external_semaphore}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>78</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRExternalSemaphoreCapabilities VK_KHR_external_semaphore_capabilities}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones @cubanismo</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-10-21</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jesse Hall, Google</li>
 * <li>Tobias Hector, Imagination Technologies</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>Matthew Netsch, Qualcomm Technologies, Inc.</li>
 * <li>Ray Smith, ARM</li>
 * <li>Chad Versace, Google</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRExternalSemaphore {

    /** The extension specification version. */
    public static final int VK_KHR_EXTERNAL_SEMAPHORE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_EXTENSION_NAME = "VK_KHR_external_semaphore";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO_KHR = 1000077000;

    /**
     * VkSemaphoreImportFlagBitsKHR - Bitmask specifying additional parameters of semaphore payload import
     * 
     * <h5>Description</h5>
     * 
     * <p>These bits have the following meanings:</p>
     * 
     * <ul>
     * <li>{@link #VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR} indicates that the semaphore payload will be imported only temporarily, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-semaphores-importing">Importing Semaphore Payloads</a>, regardless of the permanence of {@code handleType}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkSemaphoreImportFlagsKHR}</p>
     */
    public static final int VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR = 0x1;

    private KHRExternalSemaphore() {}

}