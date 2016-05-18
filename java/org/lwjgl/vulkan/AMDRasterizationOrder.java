/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension introduces the possibility for the application to control the order of primitive rasterization. In unextended Vulkan, the following
 * stages are guaranteed to execute in <b>API order</b>:
 * 
 * <ul>
 * <li>depth bounds test</li>
 * <li>stencil test, stencil op, and stencil write</li>
 * <li>depth test and depth write</li>
 * <li>occlusion queries</li>
 * <li>blending, logic op, and color write</li>
 * </ul>
 * 
 * <p>This extension enables applications to opt into a relaxed, implementation defined primitive rasterization order that may allow better parallel
 * processing of primitives and thus enabling higher primitive throughput. It is applicable in cases where the primitive rasterization order is known to
 * not affect the output of the rendering or any differences caused by a different rasterization order are not a concern from the point of view of the
 * application's purpose.</p>
 * 
 * <p>A few examples of cases when using the relaxed primitive rasterization order would not have an effect on the final rendering:</p>
 * 
 * <ul>
 * <li>If the primitives rendered are known to not overlap in framebuffer space.</li>
 * <li>If depth testing is used with a comparison operator of {@link VK10#VK_COMPARE_OP_LESS COMPARE_OP_LESS}, {@link VK10#VK_COMPARE_OP_LESS_OR_EQUAL COMPARE_OP_LESS_OR_EQUAL}, {@link VK10#VK_COMPARE_OP_GREATER COMPARE_OP_GREATER}, or
 * {@link VK10#VK_COMPARE_OP_GREATER_OR_EQUAL COMPARE_OP_GREATER_OR_EQUAL}, and the primitives rendered are known to not overlap in clip space.</li>
 * <li>If depth testing is not used and blending is enabled for all attachments with a commutative blend operator.</li>
 * </ul>
 */
public final class AMDRasterizationOrder {

	/** The extension specification version. */
	public static final int VK_AMD_RASTERIZATION_ORDER_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_AMD_RASTERIZATION_ORDER_EXTENSION_NAME = "VK_AMD_rasterization_order";

	/** VkStructureType */
	public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD = 1000018000;

	/** indicates that primitive rasterization <b>must</b> follow API order */
	public static final int VK_RASTERIZATION_ORDER_STRICT_AMD = 0;

	/** indicates that primitive rasterization <b>may</b> not follow API order */
	public static final int VK_RASTERIZATION_ORDER_RELAXED_AMD = 1;

	private AMDRasterizationOrder() {}

}