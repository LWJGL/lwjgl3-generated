/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

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
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class OESTexture3D {

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

	/** Function address. */
	@JavadocExclude
	public final long
		TexImage3DOES,
		TexSubImage3DOES,
		CopyTexSubImage3DOES,
		CompressedTexImage3DOES,
		CompressedTexSubImage3DOES,
		FramebufferTexture3DOES;

	@JavadocExclude
	public OESTexture3D(FunctionProvider provider) {
		TexImage3DOES = provider.getFunctionAddress("glTexImage3DOES");
		TexSubImage3DOES = provider.getFunctionAddress("glTexSubImage3DOES");
		CopyTexSubImage3DOES = provider.getFunctionAddress("glCopyTexSubImage3DOES");
		CompressedTexImage3DOES = provider.getFunctionAddress("glCompressedTexImage3DOES");
		CompressedTexSubImage3DOES = provider.getFunctionAddress("glCompressedTexSubImage3DOES");
		FramebufferTexture3DOES = provider.getFunctionAddress("glFramebufferTexture3DOES");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OESTexture3D} instance for the current context. */
	public static OESTexture3D getInstance() {
		return checkFunctionality(GLES.getCapabilities().__OESTexture3D);
	}

	static OESTexture3D create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OES_texture_3D") ) return null;

		OESTexture3D funcs = new OESTexture3D(provider);
		boolean supported = checkFunctions(
			funcs.TexImage3DOES, funcs.TexSubImage3DOES, funcs.CopyTexSubImage3DOES, funcs.CompressedTexImage3DOES, funcs.CompressedTexSubImage3DOES, 
			funcs.FramebufferTexture3DOES
		);

		return GLES.checkExtension("GL_OES_texture_3D", funcs, supported);
	}

	// --- [ glTexImage3DOES ] ---

	/** Unsafe version of {@link #glTexImage3DOES TexImage3DOES} */
	@JavadocExclude
	public static void nglTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().TexImage3DOES;
		callIIIIIIIIIPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
		nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** Buffer object offset version of: {@link #glTexImage3DOES TexImage3DOES} */
	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixelsOffset) {
		nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTexImage3DOES TexImage3DOES} */
	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
		nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glTexImage3DOES TexImage3DOES} */
	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
		nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glTexImage3DOES TexImage3DOES} */
	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
		nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** DoubleBuffer version of: {@link #glTexImage3DOES TexImage3DOES} */
	public static void glTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) {
		nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glTexSubImage3DOES ] ---

	/** Unsafe version of {@link #glTexSubImage3DOES TexSubImage3DOES} */
	@JavadocExclude
	public static void nglTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		long __functionAddress = getInstance().TexSubImage3DOES;
		callIIIIIIIIIIPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
		nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixelsOffset) {
		nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
	public static void glTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
		nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	// --- [ glCopyTexSubImage3DOES ] ---

	public static void glCopyTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().CopyTexSubImage3DOES;
		callIIIIIIIIIV(__functionAddress, target, level, xoffset, yoffset, zoffset, x, y, width, height);
	}

	// --- [ glCompressedTexImage3DOES ] ---

	/** Unsafe version of {@link #glCompressedTexImage3DOES CompressedTexImage3DOES} */
	@JavadocExclude
	public static void nglCompressedTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTexImage3DOES;
		callIIIIIIIIPV(__functionAddress, target, level, internalformat, width, height, depth, border, imageSize, data);
	}

	public static void glCompressedTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			if ( data != null ) checkBuffer(data, imageSize);
		nglCompressedTexImage3DOES(target, level, internalformat, width, height, depth, border, imageSize, memAddressSafe(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTexImage3DOES CompressedTexImage3DOES} */
	public static void glCompressedTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long dataOffset) {
		nglCompressedTexImage3DOES(target, level, internalformat, width, height, depth, border, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTexImage3DOES CompressedTexImage3DOES} */
	public static void glCompressedTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
		nglCompressedTexImage3DOES(target, level, internalformat, width, height, depth, border, data == null ? 0 : data.remaining(), memAddressSafe(data));
	}

	// --- [ glCompressedTexSubImage3DOES ] ---

	/** Unsafe version of {@link #glCompressedTexSubImage3DOES CompressedTexSubImage3DOES} */
	@JavadocExclude
	public static void nglCompressedTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTexSubImage3DOES;
		callIIIIIIIIIIPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	public static void glCompressedTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, imageSize);
		nglCompressedTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTexSubImage3DOES CompressedTexSubImage3DOES} */
	public static void glCompressedTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long dataOffset) {
		nglCompressedTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTexSubImage3DOES CompressedTexSubImage3DOES} */
	public static void glCompressedTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
		nglCompressedTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
	}

	// --- [ glFramebufferTexture3DOES ] ---

	public static void glFramebufferTexture3DOES(int target, int attachment, int textarget, int texture, int level, int zoffset) {
		long __functionAddress = getInstance().FramebufferTexture3DOES;
		callIIIIIIV(__functionAddress, target, attachment, textarget, texture, level, zoffset);
	}

}