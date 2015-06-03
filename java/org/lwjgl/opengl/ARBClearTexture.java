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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/clear_texture.txt">ARB_clear_texture</a> extension.
 * 
 * <p>Texture objects are fundamental to the operation of OpenGL. They are used as a source for texture sampling and destination for rendering as well as
 * being accessed in shaders for image load/store operations. It is also possible to invalidate the contents of a texture. It is currently only possible to
 * set texture image data to known values by uploading some or all of a image array from application memory or by attaching it to a framebuffer object and
 * using {@link GL11#glClear Clear} or the {@link GL30 OpenGL 3.0} ClearBuffer commands.</p>
 * 
 * <p>Both uploading initial texture data and clearing by attaching to a framebuffer have potential disadvantages when one simply wants to initialize texture
 * data to a known value. Uploading initial data requires the application to allocate a (potentially large) chunk of memory and transferring that to the
 * GL. This can be a costly operation both in terms of memory bandwidth and power usage. Alternatively, attaching a texture level to a framebuffer to clear
 * it may not be possible if the texture format isn't supported for rendering, or even if it is, attaching the image to a framebuffer object may cause the
 * texture to be allocated in certain types of memory, which it may otherwise not need to be placed in.</p>
 * 
 * <p>This extension solves these problems by providing a mechanism whereby the contents of a texture image array can be set to known values by using the
 * {@link #glClearTexImage ClearTexImage} or {@link #glClearTexSubImage ClearTexSubImage} commands. These commands can also be useful for initializing an image that will be used for atomic shader
 * operations.</p>
 * 
 * <p>Requires {@link GL13 OpenGL 1.3}. Promoted to core in {@link GL44 OpenGL 4.4}.</p>
 */
public final class ARBClearTexture {

	/** Accepted by the {@code pname} parameter for {@link GL42#glGetInternalformati GetInternalformati} and {@link GL43#glGetInternalformati64 GetInternalformati64}. */
	public static final int GL_CLEAR_TEXTURE = 0x9365;

	/** Function address. */
	@JavadocExclude
	public final long
		ClearTexSubImage,
		ClearTexImage;

	@JavadocExclude
	public ARBClearTexture(FunctionProvider provider) {
		ClearTexSubImage = provider.getFunctionAddress("glClearTexSubImage");
		ClearTexImage = provider.getFunctionAddress("glClearTexImage");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBClearTexture} instance for the current context. */
	public static ARBClearTexture getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBClearTexture);
	}

	static ARBClearTexture create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_clear_texture") ) return null;

		ARBClearTexture funcs = new ARBClearTexture(provider);

		boolean supported = checkFunctions(
			funcs.ClearTexSubImage, funcs.ClearTexImage
		);

		return GL.checkExtension("GL_ARB_clear_texture", funcs, supported);
	}

	// --- [ glClearTexSubImage ] ---

	/** Unsafe version of {@link #glClearTexSubImage ClearTexSubImage} */
	@JavadocExclude
	public static void nglClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long data) {
		long __functionAddress = getInstance().ClearTexSubImage;
		GL44.nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data, __functionAddress);
	}

	/**
	 * Fills all or part of a texture image with a constant value.
	 * 
	 * <p>Arguments {@code xoffset}, {@code yoffset}, and {@code zoffset} specify the lower left texel coordinates of a {@code width}-wide by {@code height}-high
	 * by {@code depth}-deep rectangular subregion of the texel array and are interpreted as they are in {@link GL12#glTexSubImage3D TexSubImage3D}.</p>
	 * 
	 * <p>For 1D array textures, {@code yoffset} is interpreted as the first layer to be cleared and {@code height} is the number of layers to clear. For 2D array
	 * textures, {@code zoffset} is interpreted as the first layer to be cleared and {@code depth} is the number of layers to clear. Cube map textures are
	 * treated as an array of six slices in the z-dimension, where the value of {@code zoffset} is interpreted as specifying the cube map face for the
	 * corresponding {@code layer} and {@code depth} is the number of faces to clear. For cube map array textures, {@code zoffset} is the first layer-face to
	 * clear, and {@code depth} is the number of layer-faces to clear. Each layer-face is translated into an array layer and a cube map face.</p>
	 * 
	 * <p>Negative values of {@code xoffset}, {@code yoffset}, and {@code zoffset} correspond to the coordinates of border texels.</p>
	 *
	 * @param texture the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
	 *                the texture image has a compressed internal format
	 * @param level   the texture level to clear
	 * @param xoffset the x coordinate of the texel subregion
	 * @param yoffset the y coordinate of the texel subregion
	 * @param zoffset the z coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param depth   the subregion depth
	 * @param format  the format of the source data. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the type of the source data. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param data    an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is {@code NULL},
	 *                then the pointer is ignored and the sub-range of the texture image is filled with zeros.
	 */
	public static void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer data) {
		nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
	}

	/** ShortBuffer version of: {@link #glClearTexSubImage ClearTexSubImage} */
	public static void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer data) {
		nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
	}

	/** IntBuffer version of: {@link #glClearTexSubImage ClearTexSubImage} */
	public static void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer data) {
		nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
	}

	/** FloatBuffer version of: {@link #glClearTexSubImage ClearTexSubImage} */
	public static void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer data) {
		nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
	}

	/** DoubleBuffer version of: {@link #glClearTexSubImage ClearTexSubImage} */
	public static void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer data) {
		nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
	}

	// --- [ glClearTexImage ] ---

	/** Unsafe version of {@link #glClearTexImage ClearTexImage} */
	@JavadocExclude
	public static void nglClearTexImage(int texture, int level, int format, int type, long data) {
		long __functionAddress = getInstance().ClearTexImage;
		GL44.nglClearTexImage(texture, level, format, type, data, __functionAddress);
	}

	/**
	 * Is equivalent to calling {@link #glClearTexSubImage ClearTexSubImage} with {@code xoffset}, {@code yoffset}, and {@code zoffset} equal to -{@code b} and {@code width},
	 * {@code height}, and {@code depth} equal to the dimensions of the texture image plus {@code 2xb} (or zero and one for dimensions the texture doesn't
	 * have).
	 *
	 * @param texture the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
	 *                the texture image has a compressed internal format
	 * @param level   the texture level to clear
	 * @param format  the format of the source data. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the type of the source data. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param data    an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is {@code NULL},
	 *                then the pointer is ignored and the sub-range of the texture image is filled with zeros.
	 */
	public static void glClearTexImage(int texture, int level, int format, int type, ByteBuffer data) {
		nglClearTexImage(texture, level, format, type, memAddressSafe(data));
	}

	/** ShortBuffer version of: {@link #glClearTexImage ClearTexImage} */
	public static void glClearTexImage(int texture, int level, int format, int type, ShortBuffer data) {
		nglClearTexImage(texture, level, format, type, memAddressSafe(data));
	}

	/** IntBuffer version of: {@link #glClearTexImage ClearTexImage} */
	public static void glClearTexImage(int texture, int level, int format, int type, IntBuffer data) {
		nglClearTexImage(texture, level, format, type, memAddressSafe(data));
	}

	/** FloatBuffer version of: {@link #glClearTexImage ClearTexImage} */
	public static void glClearTexImage(int texture, int level, int format, int type, FloatBuffer data) {
		nglClearTexImage(texture, level, format, type, memAddressSafe(data));
	}

	/** DoubleBuffer version of: {@link #glClearTexImage ClearTexImage} */
	public static void glClearTexImage(int texture, int level, int format, int type, DoubleBuffer data) {
		nglClearTexImage(texture, level, format, type, memAddressSafe(data));
	}

}