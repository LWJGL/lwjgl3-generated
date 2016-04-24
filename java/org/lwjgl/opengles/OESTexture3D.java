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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_3D.txt">OES_texture_3D</a> extension.
 * 
 * <p>This extension adds support for 3D textures. The OpenGL ES 2.0 texture wrap modes and mip-mapping is supported for power of two 3D textures. Mip-
 * mapping and texture wrap modes other than CLAMP_TO_EDGE are not supported for non-power of two 3D textures.</p>
 * 
 * <p>The OES_texture_npot extension, if supported, will enable mip-mapping and other wrap modes for non-power of two 3D textures.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class OESTexture3D {

	/**
	 * Accepted by the {@code target} parameter of TexImage3DOES, TexSubImage3DOES, CopyTexSubImage3DOES, CompressedTexImage3DOES and
	 * CompressedTexSubImage3DOES, GetTexParameteriv, and GetTexParameterfv.
	 */
	public static final int GL_TEXTURE_3D_OES = 0x806F;

	/** Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv. */
	public static final int GL_TEXTURE_WRAP_R_OES = 0x8072;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int
		GL_MAX_3D_TEXTURE_SIZE_OES = 0x8073,
		GL_TEXTURE_BINDING_3D_OES  = 0x806A;

	protected OESTexture3D() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glTexImage3DOES, caps.glTexSubImage3DOES, caps.glCopyTexSubImage3DOES, caps.glCompressedTexImage3DOES, caps.glCompressedTexSubImage3DOES, 
			caps.glFramebufferTexture3DOES
		);
	}

	// --- [ glTexImage3DOES ] ---

	public static void nglTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage3DOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	/** ShortBuffer version of: {@link #glTexImage3DOES TexImage3DOES} */
	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glTexImage3DOES TexImage3DOES} */
	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glTexImage3DOES TexImage3DOES} */
	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** DoubleBuffer version of: {@link #glTexImage3DOES TexImage3DOES} */
	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glTexSubImage3DOES ] ---

	public static void nglTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage3DOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** ShortBuffer version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	// --- [ glCopyTexSubImage3DOES ] ---

	public static void glCopyTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		long __functionAddress = GLES.getCapabilities().glCopyTexSubImage3DOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, level, xoffset, yoffset, zoffset, x, y, width, height);
	}

	// --- [ glCompressedTexImage3DOES ] ---

	public static void nglCompressedTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		long __functionAddress = GLES.getCapabilities().glCompressedTexImage3DOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, imageSize, data);
	}

	public static void glCompressedTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexImage3DOES(target, level, internalformat, width, height, depth, border, imageSize, data);
	}

	public static void glCompressedTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexImage3DOES(target, level, internalformat, width, height, depth, border, data == null ? 0 : data.remaining(), memAddressSafe(data));
	}

	// --- [ glCompressedTexSubImage3DOES ] ---

	public static void nglCompressedTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		long __functionAddress = GLES.getCapabilities().glCompressedTexSubImage3DOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	public static void glCompressedTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	public static void glCompressedTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
	}

	// --- [ glFramebufferTexture3DOES ] ---

	public static void glFramebufferTexture3DOES(int target, int attachment, int textarget, int texture, int level, int zoffset) {
		long __functionAddress = GLES.getCapabilities().glFramebufferTexture3DOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, attachment, textarget, texture, level, zoffset);
	}

	/** short[] version of: {@link #glTexImage3DOES TexImage3DOES} */
	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, short[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage3DOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	/** int[] version of: {@link #glTexImage3DOES TexImage3DOES} */
	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage3DOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	/** float[] version of: {@link #glTexImage3DOES TexImage3DOES} */
	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, float[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage3DOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	/** double[] version of: {@link #glTexImage3DOES TexImage3DOES} */
	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, double[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage3DOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	/** short[] version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage3DOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** int[] version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage3DOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** float[] version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage3DOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** double[] version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage3DOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

}