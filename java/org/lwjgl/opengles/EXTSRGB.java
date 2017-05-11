/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_sRGB.txt">EXT_sRGB</a> extension.
 * 
 * <p>The sRGB color space is based on typical (non-linear) response of the human eye. It has been standardized by the International Electrotechnical
 * Commission (IEC) as IEC 61966-2-1. The transfer function of sRGB roughly corresponds to a power function with a gamma of 2.2.</p>
 * 
 * <h3>FRAMEBUFFERS</h3>
 * 
 * <p>OpenGL assumes framebuffer color components are stored in a linear color space. In particular, framebuffer blending is a linear operation.</p>
 * 
 * <p>This extension adds a framebuffer capability for sRGB framebuffer update and blending. When blending is disabled but the new sRGB updated mode is
 * enabled (assume the framebuffer supports the capability), high-precision linear color component values for red, green, and blue generated by fragment
 * coloring are encoded for sRGB prior to being written into the framebuffer. When blending is enabled along with the new sRGB update mode, red, green,
 * and blue framebuffer color components are treated as sRGB values that are converted to linear color values, blended with the high- precision color
 * values generated by fragment coloring, and then the blend result is encoded for sRGB just prior to being written into the framebuffer.</p>
 * 
 * <h3>TEXTURES</h3>
 * 
 * <p>Conventional texture formats assume a linear color space. So for a conventional internal texture format such as GL_RGB8, the 256 discrete values for
 * each 8-bit color component map linearly and uniformly to the [0,1] range.</p>
 */
public final class EXTSRGB {

    /**
     * Accepted by the {@code format} and {@code internalformat} parameter of TexImage2D, and TexImage3DOES. These are also accepted by {@code format}
     * parameter of TexSubImage2D and TexSubImage3DOES.
     */
    public static final int
        GL_SRGB_EXT       = 0x8C40,
        GL_SRGB_ALPHA_EXT = 0x8C42;

    /** Accepted by the {@code internalformat} parameter of RenderbufferStorage. */
    public static final int GL_SRGB8_ALPHA8_EXT = 0x8C43;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT = 0x8210;

    private EXTSRGB() {}

}