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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/get_texture_sub_image.txt">ARB_get_texture_sub_image</a> extension.
 * 
 * <p>This extension adds a new function to get sub-regions of texture images.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}. Promoted to core in {@link GL45 OpenGL 4.5}.</p>
 */
public final class ARBGetTextureSubImage {

	/** Function address. */
	@JavadocExclude
	public final long
		GetTextureSubImage,
		GetCompressedTextureSubImage;

	@JavadocExclude
	public ARBGetTextureSubImage(FunctionProvider provider) {
		GetTextureSubImage = provider.getFunctionAddress("glGetTextureSubImage");
		GetCompressedTextureSubImage = provider.getFunctionAddress("glGetCompressedTextureSubImage");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBGetTextureSubImage} instance for the current context. */
	public static ARBGetTextureSubImage getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBGetTextureSubImage);
	}

	static ARBGetTextureSubImage create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_get_texture_sub_image") ) return null;

		ARBGetTextureSubImage funcs = new ARBGetTextureSubImage(provider);

		boolean supported = checkFunctions(
			funcs.GetTextureSubImage, funcs.GetCompressedTextureSubImage
		);

		return GL.checkExtension("GL_ARB_get_texture_sub_image", funcs, supported);
	}

	// --- [ glGetTextureSubImage ] ---

	/** Unsafe version of {@link #glGetTextureSubImage GetTextureSubImage} */
	@JavadocExclude
	public static void nglGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixels) {
		long __functionAddress = getInstance().GetTextureSubImage;
		GL45.nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels, __functionAddress);
	}

	/**
	 * Obtains sub-regions of a texture image from a texture object.
	 *
	 * @param texture the source texture object name
	 * @param level   the level-of-detail number
	 * @param xoffset the x-position of the subregion
	 * @param yoffset the y-position of the subregion
	 * @param zoffset the z-position of the subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param depth   the subregion depth
	 * @param format  the pixel format. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the pixel type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param bufSize the size of the buffer to receive the retrieved pixel data
	 * @param pixels  the buffer in which to place the returned data
	 */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pixels, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glGetTextureSubImage GetTextureSubImage} */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glGetTextureSubImage GetTextureSubImage} */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 1, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glGetTextureSubImage GetTextureSubImage} */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glGetTextureSubImage GetTextureSubImage} */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glGetTextureSubImage GetTextureSubImage} */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 3, memAddress(pixels));
	}

	// --- [ glGetCompressedTextureSubImage ] ---

	/** Unsafe version of {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage} */
	@JavadocExclude
	public static void nglGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixels) {
		long __functionAddress = getInstance().GetCompressedTextureSubImage;
		GL45.nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels, __functionAddress);
	}

	/**
	 * Obtains a sub-region of a compressed texture image.
	 *
	 * @param texture the source texture object name
	 * @param level   the level-of-detail number
	 * @param xoffset the x-position of the subregion
	 * @param yoffset the y-position of the subregion
	 * @param zoffset the z-position of the subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param depth   the subregion depth
	 * @param bufSize the size of the buffer to receive the retrieved pixel data
	 * @param pixels  the buffer in which to place the returned data
	 */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pixels, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage} */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage} */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 1, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage} */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 2, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage} */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 2, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage} */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 3, memAddress(pixels));
	}

}