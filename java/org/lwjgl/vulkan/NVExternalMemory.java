/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/** Applications may wish to export memory to other Vulkan instances or other APIs, or import memory from other Vulkan instances or other APIs to enable Vulkan workloads to be split up across application module, process, or API boundaries. This extension enables applications to create exportable Vulkan memory objects such that the underlying resources can be referenced outside the Vulkan instance that created them. */
public final class NVExternalMemory {

	/** The extension specification version. */
	public static final int VK_NV_EXTERNAL_MEMORY_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_NV_EXTERNAL_MEMORY_EXTENSION_NAME = "VK_NV_external_memory";

	/**
	 * Extends {@code VkStructureType}.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV}</li>
	 * </ul>
	 */
	public static final int
		VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV = 1000056000,
		VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV       = 1000056001;

	private NVExternalMemory() {}

}