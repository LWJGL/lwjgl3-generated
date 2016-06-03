/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * When the {@code VK_AMD_shader_trinary_minmax} device extension is enabled the application <b>can</b> pass a SPIR-V module to {@link VK10#vkCreateShaderModule CreateShaderModule} that uses
 * the {@code SPV_AMD_shader_trinary_minmax} SPIR-V extension.
 * 
 * <p>This extension is written to provide the functionality of the {@code AMD_shader_trinary_minmax}, OpenGL Shading Language Specification extension, for
 * SPIR-V.</p>
 * 
 * <p>This extension introduces nine new trinary extended instructions to SPIR-V. These functions allow the minimum, maximum or median of three inputs to be
 * found with a single function call. These operations may be useful for sorting and filtering operations, for example. By explicitly performing a trinary
 * operation with a single built-in function, shader compilers and optimizers may be able to generate better instruction sequences to perform sorting and
 * to other multi-input functions.</p>
 * 
 * <p>This extension adds the following extended instructions:</p>
 * 
 * <ul>
 * <li>FMin3AMD</li>
 * <li>UMin3AMD</li>
 * <li>SMin3AMD</li>
 * <li>FMax3AMD</li>
 * <li>UMax3AMD</li>
 * <li>SMax3AMD</li>
 * <li>FMid3AMD</li>
 * <li>UMid3AMD</li>
 * <li>SMid3AMD</li>
 * </ul>
 */
public final class AMDShaderTrinaryMinmax {

	/** The extension specification version. */
	public static final int VK_AMD_SHADER_TRINARY_MINMAX_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_AMD_SHADER_TRINARY_MINMAX_EXTENSION_NAME = "VK_AMD_shader_trinary_minmax";

	private AMDShaderTrinaryMinmax() {}

}