/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/** This extension provides the {@link VkValidationFlagsEXT} struct that can be included in the {@code pNext} chain at {@link VK10#vkCreateInstance CreateInstance} time. The new struct contains an array of {@code VkValidationCheckEXT} values that will be disabled by the validation layers. */
public final class EXTValidationFlags {

	/** The extension specification version. */
	public static final int VK_EXT_VALIDATION_FLAGS_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_EXT_VALIDATION_FLAGS_EXTENSION_NAME = "VK_EXT_validation_flags";

	/** Extends {@code VkStructureType}. */
	public static final int VK_STRUCTURE_TYPE_VALIDATION_FLAGS_EXT = 1000061000;

	/**
	 * VkValidationCheckEXT - Specify validation checks to disable
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkValidationFlagsEXT}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkValidationFlagsEXT}</p>
	 */
	public static final int VK_VALIDATION_CHECK_ALL_EXT = 0;

	private EXTValidationFlags() {}

}