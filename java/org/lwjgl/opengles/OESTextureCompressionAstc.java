/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_compression_astc.txt">OES_texture_compression_astc</a> extension.
 * 
 * <p>Adaptive Scalable Texture Compression (ASTC) is a new texture compression technology that offers unprecendented flexibility, while producing better or
 * comparable results than existing texture compressions at all bit rates. It includes support for 2D and 3D textures, with low and high dynamic range, at
 * bitrates from below 1 bit/pixel up to 8 bits/pixel in fine steps.</p>
 * 
 * <p>The goal of this extension is to support the full profile of the ASTC texture compression specification.</p>
 * 
 * <p>ASTC-compressed textures are handled in OpenGL ES and OpenGL by adding new supported formats to the existing mechanisms for handling compressed
 * textures.</p>
 */
public final class OESTextureCompressionAstc {

	/**
	 * Accepted by the {@code internalformat} parameter of CompressedTexImage2D, CompressedTexSubImage2D, TexStorage2D, TextureStorage2D, TexStorage3D, and
	 * TextureStorage3D.
	 */
	public static final int
		GL_COMPRESSED_RGBA_ASTC_4x4_KHR           = 0x93B0,
		GL_COMPRESSED_RGBA_ASTC_5x4_KHR           = 0x93B1,
		GL_COMPRESSED_RGBA_ASTC_5x5_KHR           = 0x93B2,
		GL_COMPRESSED_RGBA_ASTC_6x5_KHR           = 0x93B3,
		GL_COMPRESSED_RGBA_ASTC_6x6_KHR           = 0x93B4,
		GL_COMPRESSED_RGBA_ASTC_8x5_KHR           = 0x93B5,
		GL_COMPRESSED_RGBA_ASTC_8x6_KHR           = 0x93B6,
		GL_COMPRESSED_RGBA_ASTC_8x8_KHR           = 0x93B7,
		GL_COMPRESSED_RGBA_ASTC_10x5_KHR          = 0x93B8,
		GL_COMPRESSED_RGBA_ASTC_10x6_KHR          = 0x93B9,
		GL_COMPRESSED_RGBA_ASTC_10x8_KHR          = 0x93BA,
		GL_COMPRESSED_RGBA_ASTC_10x10_KHR         = 0x93BB,
		GL_COMPRESSED_RGBA_ASTC_12x10_KHR         = 0x93BC,
		GL_COMPRESSED_RGBA_ASTC_12x12_KHR         = 0x93BD,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR   = 0x93D0,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR   = 0x93D1,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR   = 0x93D2,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR   = 0x93D3,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR   = 0x93D4,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR   = 0x93D5,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR   = 0x93D6,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR   = 0x93D7,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR  = 0x93D8,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR  = 0x93D9,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR  = 0x93DA,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR = 0x93DB,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR = 0x93DC,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR = 0x93DD;

	/** Accepted by the {@code internalformat} parameter of CompressedTexImage3D, CompressedTexSubImage3D, TexStorage3D, and TextureStorage3D. */
	public static final int
		GL_COMPRESSED_RGBA_ASTC_3x3x3_OES         = 0x93C0,
		GL_COMPRESSED_RGBA_ASTC_4x3x3_OES         = 0x93C1,
		GL_COMPRESSED_RGBA_ASTC_4x4x3_OES         = 0x93C2,
		GL_COMPRESSED_RGBA_ASTC_4x4x4_OES         = 0x93C3,
		GL_COMPRESSED_RGBA_ASTC_5x4x4_OES         = 0x93C4,
		GL_COMPRESSED_RGBA_ASTC_5x5x4_OES         = 0x93C5,
		GL_COMPRESSED_RGBA_ASTC_5x5x5_OES         = 0x93C6,
		GL_COMPRESSED_RGBA_ASTC_6x5x5_OES         = 0x93C7,
		GL_COMPRESSED_RGBA_ASTC_6x6x5_OES         = 0x93C8,
		GL_COMPRESSED_RGBA_ASTC_6x6x6_OES         = 0x93C9,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_3x3x3_OES = 0x93E0,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x3x3_OES = 0x93E1,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4x3_OES = 0x93E2,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4x4_OES = 0x93E3,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4x4_OES = 0x93E4,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5x4_OES = 0x93E5,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5x5_OES = 0x93E6,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5x5_OES = 0x93E7,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6x5_OES = 0x93E8,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6x6_OES = 0x93E9;

	private OESTextureCompressionAstc() {}

}