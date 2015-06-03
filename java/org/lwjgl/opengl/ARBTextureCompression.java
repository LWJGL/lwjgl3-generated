/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/texture_compression.txt">ARB_texture_compression</a> extension.
 * 
 * <p>Compressing texture images can reduce texture memory utilization and improve performance when rendering textured primitives. This extension allows
 * OpenGL applications to use compressed texture images by providing:
 * <ol>
 * <li>A framework upon which extensions providing specific compressed image formats can be built.</li>
 * <li>A set of generic compressed internal formats that allow applications to specify that texture images should be stored in compressed form without
 * needing to code for specific compression formats.</li>
 * </ol>
 * An application can define compressed texture images by providing a texture image stored in a specific compressed image format. This extension does not
 * define any specific compressed image formats, but it does provide the mechanisms necessary to enable other extensions that do.</p>
 * 
 * <p>An application can also define compressed texture images by providing an uncompressed texture image but specifying a compressed internal format. In this
 * case, the GL will automatically compress the texture image using the appropriate image format. Compressed internal formats can either be specific (as
 * above) or generic. Generic compressed internal formats are not actual image formats, but are instead mapped into one of the specific compressed formats
 * provided by the GL (or to an uncompressed base internal format if no appropriate compressed format is available). Generic compressed internal formats
 * allow applications to use texture compression without needing to code to any particular compression algorithm. Generic compressed formats allow the use
 * of texture compression across a wide range of platforms with differing compression algorithms and also allow future GL implementations to substitute
 * improved compression methods transparently.</p>
 * 
 * <p>Promoted to core in {@link GL13 OpenGL 1.3}.</p>
 */
public final class ARBTextureCompression {

	/** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D. */
	public static final int
		GL_COMPRESSED_ALPHA_ARB           = 0x84E9,
		GL_COMPRESSED_LUMINANCE_ARB       = 0x84EA,
		GL_COMPRESSED_LUMINANCE_ALPHA_ARB = 0x84EB,
		GL_COMPRESSED_INTENSITY_ARB       = 0x84EC,
		GL_COMPRESSED_RGB_ARB             = 0x84ED,
		GL_COMPRESSED_RGBA_ARB            = 0x84EE;

	/** Accepted by the {@code target} parameter of Hint and the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev. */
	public static final int GL_TEXTURE_COMPRESSION_HINT_ARB = 0x84EF;

	/** Accepted by the {@code value} parameter of GetTexLevelParameter. */
	public static final int
		GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB = 0x86A0,
		GL_TEXTURE_COMPRESSED_ARB            = 0x86A1;

	/** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev. */
	public static final int
		GL_NUM_COMPRESSED_TEXTURE_FORMATS_ARB = 0x86A2,
		GL_COMPRESSED_TEXTURE_FORMATS_ARB     = 0x86A3;

	/** Function address. */
	@JavadocExclude
	public final long
		CompressedTexImage3DARB,
		CompressedTexImage2DARB,
		CompressedTexImage1DARB,
		CompressedTexSubImage3DARB,
		CompressedTexSubImage2DARB,
		CompressedTexSubImage1DARB,
		GetCompressedTexImageARB;

	@JavadocExclude
	public ARBTextureCompression(FunctionProvider provider) {
		CompressedTexImage3DARB = provider.getFunctionAddress("glCompressedTexImage3DARB");
		CompressedTexImage2DARB = provider.getFunctionAddress("glCompressedTexImage2DARB");
		CompressedTexImage1DARB = provider.getFunctionAddress("glCompressedTexImage1DARB");
		CompressedTexSubImage3DARB = provider.getFunctionAddress("glCompressedTexSubImage3DARB");
		CompressedTexSubImage2DARB = provider.getFunctionAddress("glCompressedTexSubImage2DARB");
		CompressedTexSubImage1DARB = provider.getFunctionAddress("glCompressedTexSubImage1DARB");
		GetCompressedTexImageARB = provider.getFunctionAddress("glGetCompressedTexImageARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBTextureCompression} instance for the current context. */
	public static ARBTextureCompression getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBTextureCompression);
	}

	static ARBTextureCompression create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_texture_compression") ) return null;

		ARBTextureCompression funcs = new ARBTextureCompression(provider);

		boolean supported = checkFunctions(
			funcs.CompressedTexImage3DARB, funcs.CompressedTexImage2DARB, funcs.CompressedTexImage1DARB, funcs.CompressedTexSubImage3DARB, 
			funcs.CompressedTexSubImage2DARB, funcs.CompressedTexSubImage1DARB, funcs.GetCompressedTexImageARB
		);

		return GL.checkExtension("GL_ARB_texture_compression", funcs, supported);
	}

	// --- [ glCompressedTexImage3DARB ] ---

	/** JNI method for {@link #glCompressedTexImage3DARB CompressedTexImage3DARB} */
	@JavadocExclude
	public static native void nglCompressedTexImage3DARB(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTexImage3DARB CompressedTexImage3DARB} */
	@JavadocExclude
	public static void nglCompressedTexImage3DARB(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTexImage3DARB;
		nglCompressedTexImage3DARB(target, level, internalformat, width, height, depth, border, imageSize, data, __functionAddress);
	}

	/**
	 * Specifies a three-dimensional texture image in a compressed format.
	 *
	 * @param target         the target texture. One of:<br>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}, {@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}, {@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}
	 * @param level          the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param internalformat the format of the compressed image data. One of:<br>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionASTCLDR}
	 * @param width          the width of the texture image
	 * @param height         the height of the texture image
	 * @param depth          the depth of the texture image
	 * @param border         must be 0
	 * @param imageSize      the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data           a pointer to the compressed image data
	 */
	public static void glCompressedTexImage3DARB(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTexImage3DARB(target, level, internalformat, width, height, depth, border, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTexImage3DARB CompressedTexImage3DARB} */
	public static void glCompressedTexImage3DARB(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexImage3DARB(target, level, internalformat, width, height, depth, border, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTexImage3DARB CompressedTexImage3DARB} */
	public static void glCompressedTexImage3DARB(int target, int level, int internalformat, int width, int height, int depth, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexImage3DARB(target, level, internalformat, width, height, depth, 0, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedTexImage2DARB ] ---

	/** JNI method for {@link #glCompressedTexImage2DARB CompressedTexImage2DARB} */
	@JavadocExclude
	public static native void nglCompressedTexImage2DARB(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTexImage2DARB CompressedTexImage2DARB} */
	@JavadocExclude
	public static void nglCompressedTexImage2DARB(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTexImage2DARB;
		nglCompressedTexImage2DARB(target, level, internalformat, width, height, border, imageSize, data, __functionAddress);
	}

	/**
	 * Specifies a two-dimensional texture image in a compressed format.
	 *
	 * @param target         the target texture. One of:<br>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link GL11#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}, {@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}, {@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}, {@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}
	 * @param level          the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param internalformat the format of the compressed image data. One of:<br>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionASTCLDR}
	 * @param width          the width of the texture image
	 * @param height         the height of the texture image
	 * @param border         must be 0
	 * @param imageSize      the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data           a pointer to the compressed image data
	 */
	public static void glCompressedTexImage2DARB(int target, int level, int internalformat, int width, int height, int border, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTexImage2DARB(target, level, internalformat, width, height, border, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTexImage2DARB CompressedTexImage2DARB} */
	public static void glCompressedTexImage2DARB(int target, int level, int internalformat, int width, int height, int border, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexImage2DARB(target, level, internalformat, width, height, border, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTexImage2DARB CompressedTexImage2DARB} */
	public static void glCompressedTexImage2DARB(int target, int level, int internalformat, int width, int height, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexImage2DARB(target, level, internalformat, width, height, 0, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedTexImage1DARB ] ---

	/** JNI method for {@link #glCompressedTexImage1DARB CompressedTexImage1DARB} */
	@JavadocExclude
	public static native void nglCompressedTexImage1DARB(int target, int level, int internalformat, int width, int border, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTexImage1DARB CompressedTexImage1DARB} */
	@JavadocExclude
	public static void nglCompressedTexImage1DARB(int target, int level, int internalformat, int width, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTexImage1DARB;
		nglCompressedTexImage1DARB(target, level, internalformat, width, border, imageSize, data, __functionAddress);
	}

	/**
	 * Specifies a one-dimensional texture image in a compressed format.
	 *
	 * @param target         the target texture. One of:<br>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}
	 * @param level          the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param internalformat the format of the compressed image data. One of:<br>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionASTCLDR}
	 * @param width          the width of the texture image
	 * @param border         must be 0
	 * @param imageSize      the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data           a pointer to the compressed image data
	 */
	public static void glCompressedTexImage1DARB(int target, int level, int internalformat, int width, int border, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTexImage1DARB(target, level, internalformat, width, border, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTexImage1DARB CompressedTexImage1DARB} */
	public static void glCompressedTexImage1DARB(int target, int level, int internalformat, int width, int border, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexImage1DARB(target, level, internalformat, width, border, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTexImage1DARB CompressedTexImage1DARB} */
	public static void glCompressedTexImage1DARB(int target, int level, int internalformat, int width, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexImage1DARB(target, level, internalformat, width, 0, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedTexSubImage3DARB ] ---

	/** JNI method for {@link #glCompressedTexSubImage3DARB CompressedTexSubImage3DARB} */
	@JavadocExclude
	public static native void nglCompressedTexSubImage3DARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTexSubImage3DARB CompressedTexSubImage3DARB} */
	@JavadocExclude
	public static void nglCompressedTexSubImage3DARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTexSubImage3DARB;
		nglCompressedTexSubImage3DARB(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data, __functionAddress);
	}

	/**
	 * Respecifies only a cubic subregion of an existing 3D texel array, with incoming data stored in a specific compressed image format.
	 *
	 * @param target    the target texture. One of:<br>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param yoffset   a texel offset in the y direction within the texture array
	 * @param zoffset   a texel offset in the z direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param height    the height of the texture subimage
	 * @param depth     the depth of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionASTCLDR}
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTexSubImage3DARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTexSubImage3DARB(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTexSubImage3DARB CompressedTexSubImage3DARB} */
	public static void glCompressedTexSubImage3DARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexSubImage3DARB(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTexSubImage3DARB CompressedTexSubImage3DARB} */
	public static void glCompressedTexSubImage3DARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexSubImage3DARB(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedTexSubImage2DARB ] ---

	/** JNI method for {@link #glCompressedTexSubImage2DARB CompressedTexSubImage2DARB} */
	@JavadocExclude
	public static native void nglCompressedTexSubImage2DARB(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTexSubImage2DARB CompressedTexSubImage2DARB} */
	@JavadocExclude
	public static void nglCompressedTexSubImage2DARB(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTexSubImage2DARB;
		nglCompressedTexSubImage2DARB(target, level, xoffset, yoffset, width, height, format, imageSize, data, __functionAddress);
	}

	/**
	 * Respecifies only a rectangular subregion of an existing 2D texel array, with incoming data stored in a specific compressed image format.
	 *
	 * @param target    the target texture. One of:<br>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param yoffset   a texel offset in the y direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param height    the height of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionASTCLDR}
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTexSubImage2DARB(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTexSubImage2DARB(target, level, xoffset, yoffset, width, height, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTexSubImage2DARB CompressedTexSubImage2DARB} */
	public static void glCompressedTexSubImage2DARB(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexSubImage2DARB(target, level, xoffset, yoffset, width, height, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTexSubImage2DARB CompressedTexSubImage2DARB} */
	public static void glCompressedTexSubImage2DARB(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexSubImage2DARB(target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedTexSubImage1DARB ] ---

	/** JNI method for {@link #glCompressedTexSubImage1DARB CompressedTexSubImage1DARB} */
	@JavadocExclude
	public static native void nglCompressedTexSubImage1DARB(int target, int level, int xoffset, int width, int format, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTexSubImage1DARB CompressedTexSubImage1DARB} */
	@JavadocExclude
	public static void nglCompressedTexSubImage1DARB(int target, int level, int xoffset, int width, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTexSubImage1DARB;
		nglCompressedTexSubImage1DARB(target, level, xoffset, width, format, imageSize, data, __functionAddress);
	}

	/**
	 * Respecifies only a subregion of an existing 1D texel array, with incoming data stored in a specific compressed image format.
	 *
	 * @param target    the target texture. Must be:<br>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionASTCLDR}
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTexSubImage1DARB(int target, int level, int xoffset, int width, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTexSubImage1DARB(target, level, xoffset, width, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTexSubImage1DARB CompressedTexSubImage1DARB} */
	public static void glCompressedTexSubImage1DARB(int target, int level, int xoffset, int width, int format, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexSubImage1DARB(target, level, xoffset, width, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTexSubImage1DARB CompressedTexSubImage1DARB} */
	public static void glCompressedTexSubImage1DARB(int target, int level, int xoffset, int width, int format, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexSubImage1DARB(target, level, xoffset, width, format, data.remaining(), memAddress(data));
	}

	// --- [ glGetCompressedTexImageARB ] ---

	/** JNI method for {@link #glGetCompressedTexImageARB GetCompressedTexImageARB} */
	@JavadocExclude
	public static native void nglGetCompressedTexImageARB(int target, int level, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glGetCompressedTexImageARB GetCompressedTexImageARB} */
	@JavadocExclude
	public static void nglGetCompressedTexImageARB(int target, int level, long pixels) {
		long __functionAddress = getInstance().GetCompressedTexImageARB;
		nglGetCompressedTexImageARB(target, level, pixels, __functionAddress);
	}

	/**
	 * Returns a compressed texture image.
	 *
	 * @param target the target texture. One of:<br>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}
	 * @param level  the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param pixels a buffer in which to return the compressed texture image
	 */
	public static void glGetCompressedTexImageARB(int target, int level, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS ) {
			if ( LWJGLUtil.DEBUG )
				checkBuffer(pixels, GL11.glGetTexLevelParameteri(target, level, GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB));
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetCompressedTexImageARB(target, level, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glGetCompressedTexImageARB GetCompressedTexImageARB} */
	public static void glGetCompressedTexImageARB(int target, int level, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetCompressedTexImageARB(target, level, pixelsOffset);
	}

}