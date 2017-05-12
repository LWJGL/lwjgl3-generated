/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The {@code VK_KHR_surface} extension is an instance extension. It introduces {@code VkSurfaceKHR} objects, which abstract native platform surface or window objects for use with Vulkan. It also provides a way to determine whether a queue family in a physical device supports presenting to particular surface.
 * 
 * <p>Separate extensions for each each platform provide the mechanisms for creating {@code VkSurfaceKHR} objects, but once created they may be used in this and other platform-independent extensions, in particular the {@code VK_KHR_swapchain} extension.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The example code for the {@code VK_KHR_surface} and {@code VK_KHR_swapchain} extensions was removed from the appendix after revision 1.0.29. This WSI example code was ported to the cube demo that is shipped with the official Khronos SDK, and is being kept up-to-date in that location (see: https://github.com/KhronosGroup/Vulkan-LoaderAndValidationLayers/blob/master/demos/cube.c).</p>
 * </div>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_KHR_surface</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>1</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-08-25</dd>
 * <dt><b>Revision</b></dt>
 * <dd>25</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Patrick Doane, Blizzard</li>
 * <li>Ian Elliott, LunarG</li>
 * <li>Jesse Hall, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>David Mao, AMD</li>
 * <li>Norbert Nopper, Freescale</li>
 * <li>Alon Or-bach, Samsung</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Graham Sellers, AMD</li>
 * <li>Jeff Vigil, Qualcomm</li>
 * <li>Chia-I Wu, LunarG</li>
 * <li>Jason Ekstrand, Intel</li>
 * </ul></dd>
 * <dt><b>Contacts</b></dt>
 * <dd><ul>
 * <li>James Jones, NVIDIA</li>
 * <li>Ian Elliott, LunarG</li>
 * </ul></dd>
 * </dl>
 */
public class KHRSurface {

    /** The extension specification version. */
    public static final int VK_KHR_SURFACE_SPEC_VERSION = 25;

    /** The extension name. */
    public static final String VK_KHR_SURFACE_EXTENSION_NAME = "VK_KHR_surface";

    /**
     * Extends {@code VkResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * <li>{@link #VK_ERROR_NATIVE_WINDOW_IN_USE_KHR ERROR_NATIVE_WINDOW_IN_USE_KHR}</li>
     * </ul>
     */
    public static final int
        VK_ERROR_SURFACE_LOST_KHR         = -1000000000,
        VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = -1000000001;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_SURFACE_KHR = 1000000000;

    /**
     * VkSurfaceTransformFlagBitsKHR - presentation transforms supported on a device
     * 
     * <h5>Description</h5>
     * 
     * <p>These values are described as follows:</p>
     * 
     * <ul>
     * <li>{@link #VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR SURFACE_TRANSFORM_IDENTITY_BIT_KHR}: The image content is presented without being transformed.</li>
     * <li>{@link #VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR SURFACE_TRANSFORM_ROTATE_90_BIT_KHR}: The image content is rotated 90 degrees clockwise.</li>
     * <li>{@link #VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR SURFACE_TRANSFORM_ROTATE_180_BIT_KHR}: The image content is rotated 180 degrees clockwise.</li>
     * <li>{@link #VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR SURFACE_TRANSFORM_ROTATE_270_BIT_KHR}: The image content is rotated 270 degrees clockwise.</li>
     * <li>{@link #VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR}: The image content is mirrored horizontally.</li>
     * <li>{@link #VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR}: The image content is mirrored horizontally, then rotated 90 degrees clockwise.</li>
     * <li>{@link #VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR}: The image content is mirrored horizontally, then rotated 180 degrees clockwise.</li>
     * <li>{@link #VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR}: The image content is mirrored horizontally, then rotated 270 degrees clockwise.</li>
     * <li>{@link #VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR SURFACE_TRANSFORM_INHERIT_BIT_KHR}: The presentation transform is not specified, and is instead determined by platform-specific considerations and mechanisms outside Vulkan.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDisplaySurfaceCreateInfoKHR}, {@link VkSurfaceCapabilities2EXT}, {@link VkSurfaceCapabilitiesKHR}, {@code VkSurfaceTransformFlagsKHR}, {@link VkSwapchainCreateInfoKHR}</p>
     */
    public static final int
        VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR                     = 0x1,
        VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR                    = 0x2,
        VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR                   = 0x4,
        VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR                   = 0x8,
        VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR            = 0x10,
        VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR  = 0x20,
        VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = 0x40,
        VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = 0x80,
        VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR                      = 0x100;

    /**
     * VkCompositeAlphaFlagBitsKHR - alpha compositing modes supported on a device
     * 
     * <h5>Description</h5>
     * 
     * <p>These values are described as follows:</p>
     * 
     * <ul>
     * <li>{@link #VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR COMPOSITE_ALPHA_OPAQUE_BIT_KHR}: The alpha channel, if it exists, of the images is ignored in the compositing process. Instead, the image is treated as if it has a constant alpha of 1.0.</li>
     * <li>{@link #VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR}: The alpha channel, if it exists, of the images is respected in the compositing process. The non-alpha channels of the image are expected to already be multiplied by the alpha channel by the application.</li>
     * <li>{@link #VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR}: The alpha channel, if it exists, of the images is respected in the compositing process. The non-alpha channels of the image are not expected to already be multiplied by the alpha channel by the application; instead, the compositor will multiply the non-alpha channels of the image by the alpha channel during compositing.</li>
     * <li>{@link #VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR COMPOSITE_ALPHA_INHERIT_BIT_KHR}: The way in which the presentation engine treats the alpha channel in the images is unknown to the Vulkan API. Instead, the application is responsible for setting the composite alpha blending mode using native window system commands. If the application does not set the blending mode using native window system commands, then a platform-specific default will be used.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkCompositeAlphaFlagsKHR}, {@link VkSwapchainCreateInfoKHR}</p>
     */
    public static final int
        VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR          = 0x1,
        VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR  = 0x2,
        VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = 0x4,
        VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR         = 0x8;

    /**
     * VkColorSpaceKHR - supported color space of the presentation engine
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_COLOR_SPACE_SRGB_NONLINEAR_KHR COLOR_SPACE_SRGB_NONLINEAR_KHR}: The presentation engine supports the sRGB color space.</li>
     * <li>{@link EXTSwapchainColorspace#VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT} - supports the Display-P3 color space and applies an sRGB-like OETF (defined below).</li>
     * <li>{@link EXTSwapchainColorspace#VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT} - supports the extended sRGB color space and applies a linear OETF.</li>
     * <li>{@link EXTSwapchainColorspace#VK_COLOR_SPACE_DCI_P3_LINEAR_EXT COLOR_SPACE_DCI_P3_LINEAR_EXT} - supports the DCI-P3 color space and applies a linear OETF.</li>
     * <li>{@link EXTSwapchainColorspace#VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT COLOR_SPACE_DCI_P3_NONLINEAR_EXT} - supports the DCI-P3 color space and applies the Gamma 2.6 OETF.</li>
     * <li>{@link EXTSwapchainColorspace#VK_COLOR_SPACE_BT709_LINEAR_EXT COLOR_SPACE_BT709_LINEAR_EXT} - supports the BT709 color space and applies a linear OETF.</li>
     * <li>{@link EXTSwapchainColorspace#VK_COLOR_SPACE_BT709_NONLINEAR_EXT COLOR_SPACE_BT709_NONLINEAR_EXT} - supports the BT709 color space and applies the SMPTE 170M OETF.</li>
     * <li>{@link EXTSwapchainColorspace#VK_COLOR_SPACE_BT2020_LINEAR_EXT COLOR_SPACE_BT2020_LINEAR_EXT} - supports the BT2020 color space and applies a linear OETF.</li>
     * <li>{@link EXTSwapchainColorspace#VK_COLOR_SPACE_HDR10_ST2084_EXT COLOR_SPACE_HDR10_ST2084_EXT} - supports HDR10 (BT2020 color) space and applies the SMPTE ST2084 Perceptual Quantizer (PQ) OETF.</li>
     * <li>{@link EXTSwapchainColorspace#VK_COLOR_SPACE_DOLBYVISION_EXT COLOR_SPACE_DOLBYVISION_EXT} - supports Dolby Vision (BT2020 color space), proprietary encoding, and applies the SMPTE ST2084 OETF.</li>
     * <li>{@link EXTSwapchainColorspace#VK_COLOR_SPACE_HDR10_HLG_EXT COLOR_SPACE_HDR10_HLG_EXT} - supports HDR10 (BT2020 color space) and applies the Hybrid Log Gamma (HLG) OETF.</li>
     * <li>{@link EXTSwapchainColorspace#VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT COLOR_SPACE_ADOBERGB_LINEAR_EXT} - supports the AdobeRGB color space and applies a linear OETF.</li>
     * <li>{@link EXTSwapchainColorspace#VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT COLOR_SPACE_ADOBERGB_NONLINEAR_EXT} - supports the AdobeRGB color space and applies the Gamma 2.2 OETF.</li>
     * <li>{@link EXTSwapchainColorspace#VK_COLOR_SPACE_PASS_THROUGH_EXT COLOR_SPACE_PASS_THROUGH_EXT} - color components used "as is". Intended to allow application to supply data for color spaces not described here.</li>
     * </ul>
     * 
     * <p>The color components of Non-linear color space swap chain images have had the appropriate transfer function applied. Vulkan requires that all implementations support the sRGB OETF and EOTF transfer functions when using an SRGB pixel format. Other transfer functions, such as SMPTE 170M or SMPTE2084, <b>must</b> not be performed by the implementation, but <b>can</b> be performed by the application shader. This extension defines enums for {@code VkColorSpaceKHR} that correspond to the following color spaces::</p>
     * 
     * <h6>Color Spaces and Attributes</h6>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Name</th><th>Red Primary</th><th>Green Primary</th><th>Blue Primary</th><th>White-point</th><th>OETF</th></tr></thead>
     * <tbody>
     * <tr><td>DCI-P3</td><td>0.680, 0.320</td><td>0.265, 0.690</td><td>0.150, 0.060</td><td>0.3127, 0.3290 (D65)</td><td>Gamma 2.6</td></tr>
     * <tr><td>Display-P3</td><td>0.680, 0.320</td><td>0.265, 0.690</td><td>0.150, 0.060</td><td>0.3127, 0.3290 (D65)</td><td>Display-P3</td></tr>
     * <tr><td>BT709</td><td>0.640, 0.330</td><td>0.300, 0.600</td><td>0.150, 0.060</td><td>0.3127, 0.3290 (D65)</td><td>SMPTE 170M</td></tr>
     * <tr><td>sRGB</td><td>0.640, 0.330</td><td>0.300, 0.600</td><td>0.150, 0.060</td><td>0.3127, 0.3290 (D65)</td><td>sRGB</td></tr>
     * <tr><td>extended sRGB</td><td>0.640, 0.330</td><td>0.300, 0.600</td><td>0.150, 0.060</td><td>0.3127, 0.3290 (D65)</td><td>extended sRGB</td></tr>
     * <tr><td>HDR10_ST2084</td><td>0.708, 0.292</td><td>0.170, 0.797</td><td>0.131, 0.046</td><td>0.3127, 0.3290 (D65)</td><td>ST2084</td></tr>
     * <tr><td>DOLBYVISION</td><td>0.708, 0.292</td><td>0.170, 0.797</td><td>0.131, 0.046</td><td>0.3127, 0.3290 (D65)</td><td>ST2084</td></tr>
     * <tr><td>HDR10_HLG</td><td>0.708, 0.292</td><td>0.170, 0.797</td><td>0.131, 0.046</td><td>0.3127, 0.3290 (D65)</td><td>HLG</td></tr>
     * <tr><td>AdobeRGB</td><td>0.640, 0.330</td><td>0.210, 0.710</td><td>0.150, 0.060</td><td>0.3127, 0.3290 (D65)</td><td>AdobeRGB</td></tr>
     * </tbody>
     * </table>
     * 
     * <p>For Opto-Electrical Transfer Function (OETF), unless otherwise specified, the values of <code>L</code> and <code>E</code> are defined as:</p>
     * 
     * <p><code>L</code> - linear luminance of image 0 &le L &le; 1 for conventional colorimetry</p>
     * 
     * <p><code>E</code> - corresponding electrical signal (value stored in memory)</p>
     * 
     * <h5>sRGB OETF</h5>
     * 
     * <pre><code>E =  1.055 &times; L<sup>1/2.4</sup> - 0.055 for 0.0031308 &le; L &le; 1
    12.92  &times; L for 0 &le; L &lt 0.0031308</code></pre>
     * 
     * <h5>Display-P3 EOTF</h5>
     * 
     * <pre><code>E = (a &times; L + b)<sup>2.4</sup> for 0.039 &le; L &le; 1
    b &times; L for 0 &le; L &lt; 0.039</code></pre>
     * 
     * <pre><code>a = 0.948</code></pre>
     * 
     * <p>+</p><pre><code>b = 0.052</code></pre>
     * 
     * <p>+</p><pre><code>c = 0.077</code></pre>
     * 
     * <p>+</p>
     * 
     * <h5>Display-P3 OETF</h5>
     * 
     * <pre><code>E =  1.055 &times; L<sup>1/2.4</sup> - 0.055 for 0.0030186 &le; L &le; 1
    12.92  &times; L for 0 &le; L &lt 0.0030186</code></pre>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>For most uses, the sRGB OETF is equivalent.</p>
     * </div>
     * 
     * <h5>Extended sRGB OETF</h5>
     * 
     * <pre><code>     1.055 &times;  L<sup>1/2.4</sup> - 0.055 for 0.0031308 &le; L &le; 7.5913
E = 12.92  &times;  L for 0 &le; L &lt 0.0031308
    -f(-L) for L &lt; 0</code></pre>
     * 
     * <p><code>L</code> - luminance of image is within <code>[-0.6038, 7.5913]</code>.</p>
     * 
     * <p><code>E</code> can be negative and/or > 1. That is how extended sRGB specifies colors outside the standard sRGB gamut. This means extended sRGB needs a floating point pixel format to cover the intended color range.</p>
     * 
     * <h5>SMPTE 170M OETF</h5>
     * 
     * <pre><code>E = α &times; L^<sup>0.45</sup> - (1 - α) for β &le; L &le; 1
    4.5 &times; L for 0 &le; L &lt; β</code></pre>
     * 
     * <pre><code>α = 1.099 and β = 0.018 for 10-bits and less per sample system (the values given in Rec.709)</code></pre>
     * 
     * <p>+</p><pre><code>α = 1.0993 and β = 0.0181 for 12-bits per sample system</code></pre>
     * 
     * <h5>SMPTE ST2084 OETF (Inverse-EOTF)</h5>
     * 
     * <pre><code>E = ((c_<sub>1</sub> + c_<sub>2</sub> &times; L^<sup>m_<sub>1</sub></sup>) / (1 + c_<sub>3</sub> &times; L^<sup>m_<sub>1</sub></sup>))^<sup>m_<sub>2</sub></sup></code></pre>
     * 
     * <p>where:</p>
     * 
     * <pre><code>m<sub>1</sub> = 2610 / 4096 &times; 1/4 = 0.1593017578125</code></pre>
     * 
     * <p>+</p><pre><code>m<sub>2</sub> = 2523 / 4096 &times; 128 = 78.84375</code></pre>
     * 
     * <p>+</p><pre><code>c<sub>1</sub> = 3424 / 4096 = 0.8359375 = c3 - c2 + 1</code></pre>
     * 
     * <p>+</p><pre><code>c<sub>2</sub> = 2413 / 4096 &times; 32 = 18.8515625</code></pre>
     * 
     * <p>+</p><pre><code>c<sub>3</sub> = 2392 / 4096 &times; 32 = 18.6875</code></pre>
     * 
     * <p>+</p>
     * 
     * <h5>Hybrid Log Gamma (HLG)</h5>
     * 
     * <pre><code>E = r &times; sqrt(L) for 0 &le; L &le; 1
    a &times; ln(L - b) + c for 1 &lt L</code></pre>
     * 
     * <pre><code>L - is the signal normalized by the reference white level</code></pre>
     * 
     * <p>+</p><pre><code>r - is the reference white level and has a signal value of 0.5</code></pre>
     * 
     * <p>+</p><pre><code>a = 0.17883277 and b = 0.28466892, and c = 0.55991073</code></pre>
     * 
     * <h5>AdobeRGB OETF</h5>
     * 
     * <pre><code>E = L^<sup>1 / 2.19921875</sup></code></pre>
     * 
     * <h5>Gamma 2.6 OETF</h5>
     * 
     * <pre><code>E = L^<sup>1 / 2.6</sup></code></pre>
     * 
     * <p>An implementation supporting this extension indicates support for these color spaces via {@link VkSurfaceFormatKHR} structures returned from {@link #vkGetPhysicalDeviceSurfaceFormatsKHR GetPhysicalDeviceSurfaceFormatsKHR}.</p>
     * 
     * <p>Specifying the supported surface color space when calling {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR} will create a swapchain using that color space.</p>
     * 
     * <p>Vulkan requires that all implementations support the sRGB Opto-Electrical Transfer Function (OETF) and Electro-optical transfer function (EOTF) when using an SRGB pixel format. Other transfer functions, such as SMPTE 170M, <b>must</b> not be performed by the implementation, but <b>can</b> be performed by the application shader.</p>
     * 
     * <p>If {@code pSurfaceFormats} includes an entry whose value for {@code colorSpace} is {@link #VK_COLOR_SPACE_SRGB_NONLINEAR_KHR COLOR_SPACE_SRGB_NONLINEAR_KHR} and whose value for {@code format} is a UNORM (or SRGB) format and the corresponding SRGB (or UNORM) format is a color renderable format for {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, then {@code pSurfaceFormats} <b>must</b> also contain an entry with the same value for {@code colorSpace} and {@code format} equal to the corresponding SRGB (or UNORM) format.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>If {@code pSurfaceFormats} includes just one entry, whose value for {@code format} is {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, {@code surface} has no preferred format. In this case, the application <b>can</b> use any valid {@code VkFormat} value.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>In the initial release of the {@code VK_KHR_surface} and {@code VK_KHR_swapchain} extensions, the token {@link #VK_COLORSPACE_SRGB_NONLINEAR_KHR COLORSPACE_SRGB_NONLINEAR_KHR} was used. Starting in the May 13, 2016 updates to the extension branches, matching release 1.0.13 of the core API specification, {@link #VK_COLOR_SPACE_SRGB_NONLINEAR_KHR COLOR_SPACE_SRGB_NONLINEAR_KHR} is used instead for consistency with Vulkan naming rules. The older enum is still available for backwards compatibility.</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSurfaceFormatKHR}, {@link VkSwapchainCreateInfoKHR}</p>
     */
    public static final int VK_COLOR_SPACE_SRGB_NONLINEAR_KHR = 0;

    /**
     * VkPresentModeKHR - presentation mode supported for a surface
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PRESENT_MODE_IMMEDIATE_KHR PRESENT_MODE_IMMEDIATE_KHR}: The presentation engine does not wait for a vertical blanking period to update the current image, meaning this mode <b>may</b> result in visible tearing. No internal queuing of presentation requests is needed, as the requests are applied immediately.</li>
     * <li>{@link #VK_PRESENT_MODE_MAILBOX_KHR PRESENT_MODE_MAILBOX_KHR}: The presentation engine waits for the next vertical blanking period to update the current image. Tearing <b>cannot</b> be observed. An internal single-entry queue is used to hold pending presentation requests. If the queue is full when a new presentation request is received, the new request replaces the existing entry, and any images associated with the prior entry become available for re-use by the application. One request is removed from the queue and processed during each vertical blanking period in which the queue is non-empty.</li>
     * <li>{@link #VK_PRESENT_MODE_FIFO_KHR PRESENT_MODE_FIFO_KHR}: The presentation engine waits for the next vertical blanking period to update the current image. Tearing <b>cannot</b> be observed. An internal queue is used to hold pending presentation requests. New requests are appended to the end of the queue, and one request is removed from the beginning of the queue and processed during each vertical blanking period in which the queue is non-empty. This is the only value of {@code presentMode} that is required: to be supported.</li>
     * <li>{@link #VK_PRESENT_MODE_FIFO_RELAXED_KHR PRESENT_MODE_FIFO_RELAXED_KHR}: The presentation engine generally waits for the next vertical blanking period to update the current image. If a vertical blanking period has already passed since the last update of the current image then the presentation engine does not wait for another vertical blanking period for the update, meaning this mode <b>may</b> result in visible tearing in this case. This mode is useful for reducing visual stutter with an application that will mostly present a new image before the next vertical blanking period, but may occasionally be late, and present a new image just after the next vertical blanking period. An internal queue is used to hold pending presentation requests. New requests are appended to the end of the queue, and one request is removed from the beginning of the queue and processed during or after each vertical blanking period in which the queue is non-empty.</li>
     * <li>{@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR}: The presentation engine and application have concurrent access to a single image, which is referred to as a <em>shared presentable image</em>. The presentation engine is only required to update the current image after a new presentation request is received. Therefore the application <b>must</b> make a presentation request whenever an update is required. However, the presentation engine <b>may</b> update the current image at any point, meaning this mode <b>may</b> result in visible tearing.</li>
     * <li>{@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR}: The presentation engine and application have concurrent access to a single image, which is referred to as a <em>shared presentable image</em>. The presentation engine periodically updates the current image on its regular refresh cycle. The application is only required to make one initial presentation request, after which the presentation engine <b>must</b> update the current image without any need for further presentation requests. The application <b>can</b> indicate the image contents have been updated by making a presentation request, but this does not guarantee the timing of when it will be updated. This mode <b>may</b> result in visible tearing if rendering to the image is not timed correctly.</li>
     * </ul>
     * 
     * <p>The supported {@code VkImageUsageFlagBits} of the presentable images of a swapchain created for a surface <b>may</b> differ depending on the presentation mode, and can be determined as per the table below:</p>
     * 
     * <h6>Presentable image usage queries</h6>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Presentation mode</th><th>Image usage flags</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #VK_PRESENT_MODE_IMMEDIATE_KHR PRESENT_MODE_IMMEDIATE_KHR}</td><td>{@link VkSurfaceCapabilitiesKHR}{@code ::supportedUsageFlags}</td></tr>
     * <tr><td>{@link #VK_PRESENT_MODE_MAILBOX_KHR PRESENT_MODE_MAILBOX_KHR}</td><td>{@link VkSurfaceCapabilitiesKHR}{@code ::supportedUsageFlags}</td></tr>
     * <tr><td>{@link #VK_PRESENT_MODE_FIFO_KHR PRESENT_MODE_FIFO_KHR}</td><td>{@link VkSurfaceCapabilitiesKHR}{@code ::supportedUsageFlags}</td></tr>
     * <tr><td>{@link #VK_PRESENT_MODE_FIFO_RELAXED_KHR PRESENT_MODE_FIFO_RELAXED_KHR}</td><td>{@link VkSurfaceCapabilitiesKHR}{@code ::supportedUsageFlags}</td></tr>
     * <tr><td>{@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR}</td><td>{@link VkSharedPresentSurfaceCapabilitiesKHR}{@code ::sharedPresentSupportedUsageFlags}</td></tr>
     * <tr><td>{@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR}</td><td>{@link VkSharedPresentSurfaceCapabilitiesKHR}{@code ::sharedPresentSupportedUsageFlags}</td></tr>
     * </tbody>
     * </table>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>For reference, the mode indicated by {@link #VK_PRESENT_MODE_FIFO_KHR PRESENT_MODE_FIFO_KHR} is equivalent to the behavior of {wgl|glX|egl}SwapBuffers with a swap interval of 1, while the mode indicated by {@link #VK_PRESENT_MODE_FIFO_RELAXED_KHR PRESENT_MODE_FIFO_RELAXED_KHR} is equivalent to the behavior of {wgl|glX}SwapBuffers with a swap interval of -1 (from the {WGL|GLX}_EXT_swap_control_tear extensions).</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSwapchainCreateInfoKHR}, {@link #vkGetPhysicalDeviceSurfacePresentModesKHR GetPhysicalDeviceSurfacePresentModesKHR}</p>
     */
    public static final int
        VK_PRESENT_MODE_IMMEDIATE_KHR    = 0,
        VK_PRESENT_MODE_MAILBOX_KHR      = 1,
        VK_PRESENT_MODE_FIFO_KHR         = 2,
        VK_PRESENT_MODE_FIFO_RELAXED_KHR = 3;

    protected KHRSurface() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesInstance caps) {
        return checkFunctions(
            caps.vkDestroySurfaceKHR, caps.vkGetPhysicalDeviceSurfaceSupportKHR, caps.vkGetPhysicalDeviceSurfaceCapabilitiesKHR, 
            caps.vkGetPhysicalDeviceSurfaceFormatsKHR, caps.vkGetPhysicalDeviceSurfacePresentModesKHR
        );
    }

    // --- [ vkDestroySurfaceKHR ] ---

    /** Unsafe version of: {@link #vkDestroySurfaceKHR DestroySurfaceKHR} */
    public static void nvkDestroySurfaceKHR(VkInstance instance, long surface, long pAllocator) {
        long __functionAddress = instance.getCapabilities().vkDestroySurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        callPJPV(__functionAddress, instance.address(), surface, pAllocator);
    }

    /**
     * Destroy a VkSurfaceKHR object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a {@code VkSurfaceKHR} object, call:</p>
     * 
     * <pre><code>void vkDestroySurfaceKHR(
    VkInstance                                  instance,
    VkSurfaceKHR                                surface,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Destroying a {@code VkSurfaceKHR} merely severs the connection between Vulkan and the native surface, and does not imply destroying the native surface, closing a window, or similar behavior.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All {@code VkSwapchainKHR} objects created for {@code surface} <b>must</b> have been destroyed prior to destroying {@code surface}</li>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code surface} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code surface} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>If {@code surface} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code surface} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code instance}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param instance   the instance used to create the surface.
     * @param surface    the surface to destroy.
     * @param pAllocator the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a>).
     */
    public static void vkDestroySurfaceKHR(VkInstance instance, long surface, VkAllocationCallbacks pAllocator) {
        nvkDestroySurfaceKHR(instance, surface, memAddressSafe(pAllocator));
    }

    // --- [ vkGetPhysicalDeviceSurfaceSupportKHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR} */
    public static int nvkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long surface, long pSupported) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceSupportKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(__functionAddress, physicalDevice.address(), queueFamilyIndex, surface, pSupported);
    }

    /**
     * Query if presentation is supported.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine whether a queue family of a physical device supports presentation to a given surface, call:</p>
     * 
     * <pre><code>VkResult vkGetPhysicalDeviceSurfaceSupportKHR(
    VkPhysicalDevice                            physicalDevice,
    uint32_t                                    queueFamilyIndex,
    VkSurfaceKHR                                surface,
    VkBool32*                                   pSupported);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} for the given {@code physicalDevice}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>{@code pSupported} <b>must</b> be a pointer to a {@code VkBool32} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link #VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     *
     * @param physicalDevice   the physical device.
     * @param queueFamilyIndex the queue family.
     * @param surface          the surface.
     * @param pSupported       a pointer to a {@code VkBool32}, which is set to {@link VK10#VK_TRUE TRUE} to indicate support, and {@link VK10#VK_FALSE FALSE} otherwise.
     */
    public static int vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long surface, IntBuffer pSupported) {
        if (CHECKS) {
            check(pSupported, 1);
        }
        return nvkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, queueFamilyIndex, surface, memAddress(pSupported));
    }

    // --- [ vkGetPhysicalDeviceSurfaceCapabilitiesKHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR} */
    public static int nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, long surface, long pSurfaceCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceCapabilitiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(__functionAddress, physicalDevice.address(), surface, pSurfaceCapabilities);
    }

    /**
     * Query surface capabilities.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the basic capabilities of a surface, needed in order to create a swapchain, call:</p>
     * 
     * <pre><code>VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
    VkPhysicalDevice                            physicalDevice,
    VkSurfaceKHR                                surface,
    VkSurfaceCapabilitiesKHR*                   pSurfaceCapabilities);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>{@code pSurfaceCapabilities} <b>must</b> be a pointer to a {@link VkSurfaceCapabilitiesKHR} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link #VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSurfaceCapabilitiesKHR}</p>
     *
     * @param physicalDevice       the physical device that will be associated with the swapchain to be created, as described for {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param surface              the surface that will be associated with the swapchain.
     * @param pSurfaceCapabilities a pointer to an instance of the {@link VkSurfaceCapabilitiesKHR} structure in which the capabilities are returned.
     */
    public static int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, long surface, VkSurfaceCapabilitiesKHR pSurfaceCapabilities) {
        return nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice, surface, pSurfaceCapabilities.address());
    }

    // --- [ vkGetPhysicalDeviceSurfaceFormatsKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceSurfaceFormatsKHR GetPhysicalDeviceSurfaceFormatsKHR}
     *
     * @param pSurfaceFormatCount a pointer to an integer related to the number of format pairs available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, long surface, long pSurfaceFormatCount, long pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormatsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(__functionAddress, physicalDevice.address(), surface, pSurfaceFormatCount, pSurfaceFormats);
    }

    /**
     * Query color formats supported by surface.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the supported swapchain format-color space pairs for a surface, call:</p>
     * 
     * <pre><code>VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(
    VkPhysicalDevice                            physicalDevice,
    VkSurfaceKHR                                surface,
    uint32_t*                                   pSurfaceFormatCount,
    VkSurfaceFormatKHR*                         pSurfaceFormats);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pSurfaceFormats} is {@code NULL}, then the number of format pairs supported for the given {@code surface} is returned in {@code pSurfaceFormatCount}. The number of format pairs supported will be greater than or equal to 1. Otherwise, {@code pSurfaceFormatCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSurfaceFormats} array, and on return the variable is overwritten with the number of structures actually written to {@code pSurfaceFormats}. If the value of {@code pSurfaceFormatCount} is less than the number of format pairs supported, at most {@code pSurfaceFormatCount} structures will be written. If {@code pSurfaceFormatCount} is smaller than the number of format pairs supported for the given {@code surface}, {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS} to indicate that not all the available values were returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>{@code pSurfaceFormatCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pSurfaceFormatCount} is not 0, and {@code pSurfaceFormats} is not {@code NULL}, {@code pSurfaceFormats} <b>must</b> be a pointer to an array of {@code pSurfaceFormatCount} {@link VkSurfaceFormatKHR} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link #VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSurfaceFormatKHR}</p>
     *
     * @param physicalDevice      the physical device that will be associated with the swapchain to be created, as described for {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param surface             the surface that will be associated with the swapchain.
     * @param pSurfaceFormatCount a pointer to an integer related to the number of format pairs available or queried, as described below.
     * @param pSurfaceFormats     either {@code NULL} or a pointer to an array of {@link VkSurfaceFormatKHR} structures.
     */
    public static int vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, long surface, IntBuffer pSurfaceFormatCount, VkSurfaceFormatKHR.Buffer pSurfaceFormats) {
        if (CHECKS) {
            check(pSurfaceFormatCount, 1);
            checkSafe(pSurfaceFormats, pSurfaceFormatCount.get(pSurfaceFormatCount.position()));
        }
        return nvkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, memAddress(pSurfaceFormatCount), memAddressSafe(pSurfaceFormats));
    }

    // --- [ vkGetPhysicalDeviceSurfacePresentModesKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceSurfacePresentModesKHR GetPhysicalDeviceSurfacePresentModesKHR}
     *
     * @param pPresentModeCount a pointer to an integer related to the number of presentation modes available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, long surface, long pPresentModeCount, long pPresentModes) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(__functionAddress, physicalDevice.address(), surface, pPresentModeCount, pPresentModes);
    }

    /**
     * Query supported presentation modes.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the supported presentation modes for a surface, call:</p>
     * 
     * <pre><code>VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(
    VkPhysicalDevice                            physicalDevice,
    VkSurfaceKHR                                surface,
    uint32_t*                                   pPresentModeCount,
    VkPresentModeKHR*                           pPresentModes);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pPresentModes} is {@code NULL}, then the number of presentation modes supported for the given {@code surface} is returned in {@code pPresentModeCount}. Otherwise, {@code pPresentModeCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPresentModes} array, and on return the variable is overwritten with the number of values actually written to {@code pPresentModes}. If the value of {@code pPresentModeCount} is less than the number of presentation modes supported, at most {@code pPresentModeCount} values will be written. If {@code pPresentModeCount} is smaller than the number of presentation modes supported for the given {@code surface}, {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS} to indicate that not all the available values were returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>{@code pPresentModeCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pPresentModeCount} is not 0, and {@code pPresentModes} is not {@code NULL}, {@code pPresentModes} <b>must</b> be a pointer to an array of {@code pPresentModeCount} {@code VkPresentModeKHR} values</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link #VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     *
     * @param physicalDevice    the physical device that will be associated with the swapchain to be created, as described for {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param surface           the surface that will be associated with the swapchain.
     * @param pPresentModeCount a pointer to an integer related to the number of presentation modes available or queried, as described below.
     * @param pPresentModes     either {@code NULL} or a pointer to an array of {@code VkPresentModeKHR} values.
     */
    public static int vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, long surface, IntBuffer pPresentModeCount, IntBuffer pPresentModes) {
        if (CHECKS) {
            check(pPresentModeCount, 1);
            checkSafe(pPresentModes, pPresentModeCount.get(pPresentModeCount.position()));
        }
        return nvkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice, surface, memAddress(pPresentModeCount), memAddressSafe(pPresentModes));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR} */
    public static int vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long surface, int[] pSupported) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceSupportKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSupported, 1);
        }
        return callPJPI(__functionAddress, physicalDevice.address(), queueFamilyIndex, surface, pSupported);
    }

    /** Array version of: {@link #vkGetPhysicalDeviceSurfaceFormatsKHR GetPhysicalDeviceSurfaceFormatsKHR} */
    public static int vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, long surface, int[] pSurfaceFormatCount, VkSurfaceFormatKHR.Buffer pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormatsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurfaceFormatCount, 1);
            checkSafe(pSurfaceFormats, pSurfaceFormatCount[0]);
        }
        return callPJPPI(__functionAddress, physicalDevice.address(), surface, pSurfaceFormatCount, memAddressSafe(pSurfaceFormats));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceSurfacePresentModesKHR GetPhysicalDeviceSurfacePresentModesKHR} */
    public static int vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, long surface, int[] pPresentModeCount, int[] pPresentModes) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPresentModeCount, 1);
            checkSafe(pPresentModes, pPresentModeCount[0]);
        }
        return callPJPPI(__functionAddress, physicalDevice.address(), surface, pPresentModeCount, pPresentModes);
    }

}