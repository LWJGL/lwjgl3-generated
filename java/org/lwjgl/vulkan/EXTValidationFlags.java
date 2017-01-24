/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_EXT_validation_flags</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>62</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-09-06</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0.25 of the Vulkan API.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Tobin Ehlis, Google</li>
 * <li>Courtney Goeltzenleuchter, Google</li>
 * </ul></dd>
 * <dt><b>Contacts</b></dt>
 * <dd><ul>
 * <li>Tobin Ehlis, Google (mailto:tobine@google.com[tobine@google.com])</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>This extension provides the {@link VkValidationFlagsEXT} struct that can be included in the {@code pNext} chain at {@link VK10#vkCreateInstance CreateInstance} time. The new struct contains an array of {@code VkValidationCheckEXT} values that will be disabled by the validation layers.</p>
 */
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