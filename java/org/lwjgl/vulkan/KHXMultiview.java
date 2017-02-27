/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_KHX_multiview</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>54</dd>
 * <dt><b>Status</b></dt>
 * <dd>Draft.</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-10-28</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>Requires VK_KHR_get_physical_device_properties2.</li>
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
 * 
 * <p>This extension has the same goal as the OpenGL ES {@code GL_OVR_multiview} extension - it enables rendering to multiple "{@code views}" by recording a single set of commands to be executed with slightly different behavior for each view. It includes a concise way to declare a render pass with multiple views, and gives implementations freedom to render the views in the most efficient way possible.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <p>None.</p>
 */
public final class KHXMultiview {

	/** The extension specification version. */
	public static final int VK_KHX_MULTIVIEW_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_KHX_MULTIVIEW_EXTENSION_NAME = "VK_KHX_multiview";

	/**
	 * Extends {@code VkStructureType}.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHX STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHX}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHX STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHX}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHX STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHX}</li>
	 * </ul>
	 */
	public static final int
		VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHX    = 1000053000,
		VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHX   = 1000053001,
		VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHX = 1000053002;

	/** Extends {@code VkDependencyFlagBits}. */
	public static final int VK_DEPENDENCY_VIEW_LOCAL_BIT_KHX = 0x2;

	private KHXMultiview() {}

}