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
 * <dd>VK_KHX_external_semaphore</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>78</dd>
 * <dt><b>Status</b></dt>
 * <dd>Draft</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-10-21</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>Requires VK_KHR_external_semaphore_capabilities.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd>James Jones (jajones 'at' nvidia.com)</dd>
 * </dl>
 */
public final class KHXExternalSemaphore {

    /** The extension specification version. */
    public static final int VK_KHX_EXTERNAL_SEMAPHORE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHX_EXTERNAL_SEMAPHORE_EXTENSION_NAME = "VK_KHX_external_semaphore";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO_KHX = 1000077000;

    private KHXExternalSemaphore() {}

}