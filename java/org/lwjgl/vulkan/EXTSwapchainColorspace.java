/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_EXT_swapchain_colorspace</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>105</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-01-13</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>This extension requires VK_KHR_surface</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Courtney Goeltzenleuchter, Google</li>
 * </ul></dd>
 * <dt><b>Contacts</b></dt>
 * <dd><ul>
 * <li>Courtney Goeltzenleuchter, Google</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>This extension defines enums for {@code VkColorSpaceKHR} that correspond to the following color spaces::</p>
 * 
 * <h6>Color Spaces and Attributes</h6>
 * 
 * <table class="lwjgl">
 * <thead><tr><th>Name</th><th>Red Primary</th><th>Green Primary</th><th>Blue Primary</th><th>White-point</th><th>OETF</th></tr></thead>
 * <tbody>
 * <tr><td>DCI-P3</td><td>0.680, 0.320</td><td>0.265, 0.690</td><td>0.150, 0.060</td><td>0.3127, 0.3290 (D65)</td><td>Gamma 2.6</td></tr>
 * <tr><td>Display-P3</td><td>0.680, 0.320</td><td>0.265, 0.690</td><td>0.150, 0.060</td><td>0.3127, 0.3290 (D65)</td><td>sRGB</td></tr>
 * <tr><td>BT709</td><td>0.640, 0.330</td><td>0.300, 0.600</td><td>0.150, 0.060</td><td>0.3127, 0.3290 (D65)</td><td>SMPTE 170M</td></tr>
 * <tr><td>sRGB</td><td>0.640, 0.330</td><td>0.300, 0.600</td><td>0.150, 0.060</td><td>0.3127, 0.3290 (D65)</td><td>sRGB</td></tr>
 * <tr><td>scRGB</td><td>0.640, 0.330</td><td>0.300, 0.600</td><td>0.150, 0.060</td><td>0.3127, 0.3290 (D65)</td><td>scRGB</td></tr>
 * <tr><td>BT2020</td><td>0.708, 0.292</td><td>0.170, 0.797</td><td>0.131, 0.046</td><td>0.3127, 0.3290 (D65)</td><td>SMPTE 170M</td></tr>
 * <tr><td>AdobeRGB</td><td>0.640, 0.330</td><td>0.210, 0.710</td><td>0.150, 0.060</td><td>0.3127, 0.3290 (D65)</td><td>Gamma 2.2</td></tr>
 * </tbody>
 * </table>
 * 
 * <p>For Opto-Electrical Transfer Function (OETF), unless otherwise specified, the values of <code>L</code> and <code>E</code> are defined as:</p>
 * 
 * <p><code>L</code> - luminance of image <code>0 {leq} L {leq} 1</code> for conventional colorimetry</p>
 * 
 * <p><code>E</code> - corresponding electrical signal (value stored in memory)</p>
 * 
 * <h5>sRGB OETF</h5>
 * 
 * <pre><code>E =  1.055 &times; L<sup>1/2.4</sup> - 0.055 for 0.0031308 &le; L &le; 1
    12.92  &times; L for 0 &le; L &lt 0.0031308</code></pre>
 * 
 * <h5>scRGB OETF</h5>
 * 
 * <pre><code>     1.055 &times;  L<sup>1/2.4</sup> - 0.055 for 0.0031308 &le; L &le; 7.5913
E = 12.92  &times;  L for 0 &le; L &lt 0.0031308
    -E     &times; -L for L &lt; 0</code></pre>
 * 
 * <p><code>L</code> - luminance of image is within <code>[-0.6038, 7.5913]</code>.</p>
 * 
 * <p><code>E</code> can be negative and/or > 1. That is how scRGB specifies colors outside the standard sRGB gamut.</p>
 * 
 * <h5>SMPTE 170M OETF</h5>
 * 
 * <pre><code>E = 1.099 &times; L<sup>0.45</sup> - 0.099 for 0.018 &le; L &le; 1
    4.5   &times; L for 0 &le; L &lt; 0.018</code></pre>
 * 
 * <h5>Display Gamma 2.2 OETF</h5>
 * 
 * <p>E = L<sup>1 / 2.2</sup></p>
 * 
 * <h5>Display Gamma 2.6 OETF</h5>
 * 
 * <p>E = L<sup>1 / 2.6</sup></p>
 * 
 * <p>An implementation supporting this extension indicates support for these color spaces via {@link VkSurfaceFormatKHR} structures returned from {@link KHRSurface#vkGetPhysicalDeviceSurfaceFormatsKHR GetPhysicalDeviceSurfaceFormatsKHR}.</p>
 * 
 * <p>Specifying the supported surface color space when calling {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR} will create a swapchain using that color space.</p>
 * 
 * <p>Vulkan requires that all implementations support the sRGB OETF and EOTF when using an SRGB pixel format. Other transfer functions, such as SMPTE 170M, must not: be performed by the implementation, but <b>can</b> be performed by the application shader.</p>
 */
public final class EXTSwapchainColorspace {

	/** The extension specification version. */
	public static final int VK_SWAPCHAIN_COLOR_SPACE_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME = "VK_EXT_swapchain_colorspace";

	/**
	 * Extends {@code VkColorSpaceKHR}.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_COLOR_SPACE_DISPLAY_P3_LINEAR_EXT COLOR_SPACE_DISPLAY_P3_LINEAR_EXT}</li>
	 * <li>{@link #VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT}</li>
	 * <li>{@link #VK_COLOR_SPACE_SCRGB_LINEAR_EXT COLOR_SPACE_SCRGB_LINEAR_EXT}</li>
	 * <li>{@link #VK_COLOR_SPACE_SCRGB_NONLINEAR_EXT COLOR_SPACE_SCRGB_NONLINEAR_EXT}</li>
	 * <li>{@link #VK_COLOR_SPACE_DCI_P3_LINEAR_EXT COLOR_SPACE_DCI_P3_LINEAR_EXT}</li>
	 * <li>{@link #VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT COLOR_SPACE_DCI_P3_NONLINEAR_EXT}</li>
	 * <li>{@link #VK_COLOR_SPACE_BT709_LINEAR_EXT COLOR_SPACE_BT709_LINEAR_EXT}</li>
	 * <li>{@link #VK_COLOR_SPACE_BT709_NONLINEAR_EXT COLOR_SPACE_BT709_NONLINEAR_EXT}</li>
	 * <li>{@link #VK_COLOR_SPACE_BT2020_LINEAR_EXT COLOR_SPACE_BT2020_LINEAR_EXT}</li>
	 * <li>{@link #VK_COLOR_SPACE_BT2020_NONLINEAR_EXT COLOR_SPACE_BT2020_NONLINEAR_EXT}</li>
	 * <li>{@link #VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT COLOR_SPACE_ADOBERGB_LINEAR_EXT}</li>
	 * <li>{@link #VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT COLOR_SPACE_ADOBERGB_NONLINEAR_EXT}</li>
	 * </ul>
	 */
	public static final int
		VK_COLOR_SPACE_DISPLAY_P3_LINEAR_EXT    = 1000104001,
		VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT = 1000104002,
		VK_COLOR_SPACE_SCRGB_LINEAR_EXT         = 1000104003,
		VK_COLOR_SPACE_SCRGB_NONLINEAR_EXT      = 1000104004,
		VK_COLOR_SPACE_DCI_P3_LINEAR_EXT        = 1000104005,
		VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT     = 1000104006,
		VK_COLOR_SPACE_BT709_LINEAR_EXT         = 1000104007,
		VK_COLOR_SPACE_BT709_NONLINEAR_EXT      = 1000104008,
		VK_COLOR_SPACE_BT2020_LINEAR_EXT        = 1000104009,
		VK_COLOR_SPACE_BT2020_NONLINEAR_EXT     = 1000104010,
		VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT      = 1000104011,
		VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT   = 1000104012;

	private EXTSwapchainColorspace() {}

}