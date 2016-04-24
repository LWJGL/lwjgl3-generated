/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_texture_array.txt">NV_texture_array</a> extension.
 * 
 * <p>This extension introduces the notion of two-dimensional array textures. An array texture is a collection of two-dimensional images of identical size
 * and format, arranged in layers. Array textures are specified using TexImage3DNV, where the depth is used to indicate the number of layers in the image.</p>
 * 
 * <p>An array texture is accessed as a single unit in a programmable shader, using a single coordinate vector. A single layer is selected, using the "p"
 * texture coordinate, and that layer is then accessed as though it were a two-dimensional texture. The layer coordinate is provided as an unnormalized
 * floating-point value in the range {@code [0,<n>-1]}, where {@code <n>} is the number of layers in the array texture. Texture lookups do not filter
 * between layers, though such filtering can be achieved using programmable shaders. When mipmapping is used, each level of an array texture has the same
 * number of layers as the base level; the number of layers is not reduced as the image size decreases.</p>
 * 
 * <p>Single layers of array textures can be rendered to by binding them to a framebuffer object using the FramebufferTextureLayerNV function.</p>
 */
public class NVTextureArray {

	/**
	 * Accepted by the {@code target} parameter of TexImage3DNV, TexSubImage3DNV, CopyTexSubImage3DNV, CompressedTexImage3DNV, CompressedTexSubImage3DNV,
	 * TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmap, and BindTexture.
	 */
	public static final int GL_TEXTURE_2D_ARRAY_NV = 0x8C1A;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv and GetFloatv. */
	public static final int
		GL_TEXTURE_BINDING_2D_ARRAY_NV = 0x8C1D,
		GL_MAX_ARRAY_TEXTURE_LAYERS_NV = 0x88FF;

	/** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_NV = 0x8CD4;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int GL_SAMPLER_2D_ARRAY_NV = 0x8DC1;

	/** Accepted by the {@code pname} parameter of PixelStorei, GetBooleanv, GetIntegerv and GetFloatv. */
	public static final int
		GL_UNPACK_SKIP_IMAGES_NV  = 0x806D,
		GL_UNPACK_IMAGE_HEIGHT_NV = 0x806E;

	protected NVTextureArray() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glTexImage3DNV, caps.glTexSubImage3DNV, caps.glCopyTexSubImage3DNV, caps.glCompressedTexImage3DNV, caps.glCompressedTexSubImage3DNV, 
			caps.glFramebufferTextureLayerNV
		);
	}

	// --- [ glTexImage3DNV ] ---

	public static void nglTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, long pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage3DNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, internalFormat, width, height, depth, border, format, type, pixels);
	}

	public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, long pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, pixels);
	}

	/** ShortBuffer version of: {@link #glTexImage3DNV TexImage3DNV} */
	public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glTexImage3DNV TexImage3DNV} */
	public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glTexImage3DNV TexImage3DNV} */
	public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glTexSubImage3DNV ] ---

	public static void nglTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage3DNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** ShortBuffer version of: {@link #glTexSubImage3DNV TexSubImage3DNV} */
	public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTexSubImage3DNV TexSubImage3DNV} */
	public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTexSubImage3DNV TexSubImage3DNV} */
	public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	// --- [ glCopyTexSubImage3DNV ] ---

	public static void glCopyTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		long __functionAddress = GLES.getCapabilities().glCopyTexSubImage3DNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, level, xoffset, yoffset, zoffset, x, y, width, height);
	}

	// --- [ glCompressedTexImage3DNV ] ---

	public static void nglCompressedTexImage3DNV(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		long __functionAddress = GLES.getCapabilities().glCompressedTexImage3DNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, imageSize, data);
	}

	public static void glCompressedTexImage3DNV(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, ByteBuffer data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexImage3DNV(target, level, internalformat, width, height, depth, border, imageSize, memAddressSafe(data));
	}

	public static void glCompressedTexImage3DNV(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexImage3DNV(target, level, internalformat, width, height, depth, border, imageSize, data);
	}

	// --- [ glCompressedTexSubImage3DNV ] ---

	public static void nglCompressedTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		long __functionAddress = GLES.getCapabilities().glCompressedTexSubImage3DNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	public static void glCompressedTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, ByteBuffer data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, memAddress(data));
	}

	public static void glCompressedTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	// --- [ glFramebufferTextureLayerNV ] ---

	public static void glFramebufferTextureLayerNV(int target, int attachment, int texture, int level, int layer) {
		long __functionAddress = GLES.getCapabilities().glFramebufferTextureLayerNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, attachment, texture, level, layer);
	}

	/** short[] version of: {@link #glTexImage3DNV TexImage3DNV} */
	public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, short[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage3DNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, internalFormat, width, height, depth, border, format, type, pixels);
	}

	/** int[] version of: {@link #glTexImage3DNV TexImage3DNV} */
	public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, int[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage3DNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, internalFormat, width, height, depth, border, format, type, pixels);
	}

	/** float[] version of: {@link #glTexImage3DNV TexImage3DNV} */
	public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, float[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage3DNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, internalFormat, width, height, depth, border, format, type, pixels);
	}

	/** short[] version of: {@link #glTexSubImage3DNV TexSubImage3DNV} */
	public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage3DNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** int[] version of: {@link #glTexSubImage3DNV TexSubImage3DNV} */
	public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage3DNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** float[] version of: {@link #glTexSubImage3DNV TexSubImage3DNV} */
	public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage3DNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

}