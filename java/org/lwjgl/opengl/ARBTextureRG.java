/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/texture_rg.txt">ARB_texture_rg</a> extension.
 * <p/>
 * Historically one- and two- component textures have been specified in OpenGL using the intensity, luminance or luminance-alpha (I/L/LA) formats. With the
 * advent of programmable shaders and render-to-texture capabilites these legacy formats carry some historical artifacts which are no longer useful.
 * <p/>
 * For example, when sampling from such textures, the luminance values are replicated across the color components, and the intensity values are replicated
 * across both the color and alpha components. This is no longer necessary with programmable shaders.
 * <p/>
 * It is also desirable to be able to render to one- and two- component format textures using capabilities such as framebuffer objects (FBO), but rendering
 * to I/L/LA formats is under-specified (specifically how to map R/G/B/A values to I/L/A texture channels).
 * <p/>
 * This extension adds new base internal formats for the one-component {@link #GL_RED RED} and two-component {@link #GL_RG RG} (red green) texture formats as well as sized internal
 * formats for fixed-point, floating-point and pure integer texture formats. The new texure formats can be used for texturing as well as for rendering into
 * with framebuffer objects.
 * <p/>
 * Promoted to core in {@link GL30 OpenGL 3.0}.
 */
public final class ARBTextureRG {

	/** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D. */
	public static final int
		GL_R8             = 0x8229,
		GL_R16            = 0x822A,
		GL_RG8            = 0x822B,
		GL_RG16           = 0x822C,
		GL_R16F           = 0x822D,
		GL_R32F           = 0x822E,
		GL_RG16F          = 0x822F,
		GL_RG32F          = 0x8230,
		GL_R8I            = 0x8231,
		GL_R8UI           = 0x8232,
		GL_R16I           = 0x8233,
		GL_R16UI          = 0x8234,
		GL_R32I           = 0x8235,
		GL_R32UI          = 0x8236,
		GL_RG8I           = 0x8237,
		GL_RG8UI          = 0x8238,
		GL_RG16I          = 0x8239,
		GL_RG16UI         = 0x823A,
		GL_RG32I          = 0x823B,
		GL_RG32UI         = 0x823C,
		GL_RED            = 0x1903,
		GL_RG             = 0x8227,
		GL_COMPRESSED_RED = 0x8225,
		GL_COMPRESSED_RG  = 0x8226;

	/** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and ReadPixels. */
	public static final int
		GL_RG_INTEGER = 0x8228;

	private ARBTextureRG() {}

}