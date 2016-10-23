/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/** {@code VK_IMG_filter_cubic} adds an additional, high quality cubic filtering mode to Vulkan, using a Catmull-Rom bicubic filter. Performing this kind of filtering can be done in a shader by using 16 samples and a number of instructions, but this can be inefficient. The cubic filter mode exposes an optimized high quality texture sampling using fixed texture sampling hardware. */
public final class IMGFilterCubic {

	/** The extension specification version. */
	public static final int VK_IMG_FILTER_CUBIC_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_IMG_FILTER_CUBIC_EXTENSION_NAME = "VK_IMG_filter_cubic";

	/** Extends {@code VkFilter}. */
	public static final int VK_FILTER_CUBIC_IMG = 1000015000;

	/** Extends {@code VkFormatFeatureFlagBits}. */
	public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG = 0x2000;

	private IMGFilterCubic() {}

}