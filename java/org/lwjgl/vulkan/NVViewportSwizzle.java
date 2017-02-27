/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_NV_viewport_swizzle</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>99</dd>
 * <dt><b>Status</b></dt>
 * <dd>Complete</dd>
 * <dt><b>Last Modified Data</b></dt>
 * <dd>2016-12-22</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>This extension requires Vulkan 1.0.</li>
 * <li>This extension requires {@code multiViewport} and {@code geometryShader} features to be useful.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell (pdaniell 'at' nvidia.com)</li>
 * </ul></dd>
 * <dt><b>Overview</b></dt>
 * <dd>This extension provides a new per-viewport swizzle that can modify the position of primitives sent to each viewport. New viewport swizzle state is added for each viewport, and a new position vector is computed for each vertex by selecting from and optionally negating any of the four components of the original position vector.
 * 
 * <p>This new viewport swizzle is useful for a number of algorithms, including single-pass cubemap rendering (broadcasting a primitive to multiple faces and reorienting the vertex position for each face) and voxel rasterization. The per-viewport component remapping and negation provided by the swizzle allows application code to re-orient three-dimensional geometry with a view along any of the X, Y, or Z axes. If a perspective projection and depth buffering is required, 1/W buffering should be used, as described in the single-pass cubemap rendering example in the "Issues" section below.</p></dd>
 * </dl>
 */
public final class NVViewportSwizzle {

	/** The extension specification version. */
	public static final int VK_NV_VIEWPORT_SWIZZLE_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_NV_VIEWPORT_SWIZZLE_EXTENSION_NAME = "VK_NV_viewport_swizzle";

	/** Extends {@code VkStructureType}. */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV = 1000098000;

	/**
	 * VkViewportCoordinateSwizzleNV - (no short description available)
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkViewportSwizzleNV}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV}</li>
	 * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV}</li>
	 * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV}</li>
	 * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV}</li>
	 * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV}</li>
	 * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV}</li>
	 * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV}</li>
	 * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV}</li>
	 * </ul>
	 */
	public static final int
		VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV = 0,
		VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV = 1,
		VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV = 2,
		VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV = 3,
		VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV = 4,
		VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV = 5,
		VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV = 6,
		VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV = 7;

	private NVViewportSwizzle() {}

}