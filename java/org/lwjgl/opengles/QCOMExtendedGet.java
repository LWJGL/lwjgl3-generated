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
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/QCOM/QCOM_extended_get.txt">QCOM_extended_get</a> extension.
 * This extension enables instrumenting the driver for debugging of OpenGL ES applications.
 */
public final class QCOMExtendedGet {

	/** Accepted by the {@code pname} parameter of ExtGetTexLevelParameterivQCOM. */
	public static final int
		GL_TEXTURE_WIDTH_QCOM           = 0x8BD2,
		GL_TEXTURE_HEIGHT_QCOM          = 0x8BD3,
		GL_TEXTURE_DEPTH_QCOM           = 0x8BD4,
		GL_TEXTURE_INTERNAL_FORMAT_QCOM = 0x8BD5,
		GL_TEXTURE_FORMAT_QCOM          = 0x8BD6,
		GL_TEXTURE_TYPE_QCOM            = 0x8BD7,
		GL_TEXTURE_IMAGE_VALID_QCOM     = 0x8BD8,
		GL_TEXTURE_NUM_LEVELS_QCOM      = 0x8BD9,
		GL_TEXTURE_TARGET_QCOM          = 0x8BDA,
		GL_TEXTURE_OBJECT_VALID_QCOM    = 0x8BDB;

	/** Accepted by the {@code pname} parameter of ExtTexObjectStateOverrideiQCOM. */
	public static final int GL_STATE_RESTORE = 0x8BDC;

	/** Function address. */
	@JavadocExclude
	public final long
		ExtGetTexturesQCOM,
		ExtGetBuffersQCOM,
		ExtGetRenderbuffersQCOM,
		ExtGetFramebuffersQCOM,
		ExtGetTexLevelParameterivQCOM,
		ExtTexObjectStateOverrideiQCOM,
		ExtGetTexSubImageQCOM,
		ExtGetBufferPointervQCOM;

	@JavadocExclude
	public QCOMExtendedGet(FunctionProvider provider) {
		ExtGetTexturesQCOM = provider.getFunctionAddress("glExtGetTexturesQCOM");
		ExtGetBuffersQCOM = provider.getFunctionAddress("glExtGetBuffersQCOM");
		ExtGetRenderbuffersQCOM = provider.getFunctionAddress("glExtGetRenderbuffersQCOM");
		ExtGetFramebuffersQCOM = provider.getFunctionAddress("glExtGetFramebuffersQCOM");
		ExtGetTexLevelParameterivQCOM = provider.getFunctionAddress("glExtGetTexLevelParameterivQCOM");
		ExtTexObjectStateOverrideiQCOM = provider.getFunctionAddress("glExtTexObjectStateOverrideiQCOM");
		ExtGetTexSubImageQCOM = provider.getFunctionAddress("glExtGetTexSubImageQCOM");
		ExtGetBufferPointervQCOM = provider.getFunctionAddress("glExtGetBufferPointervQCOM");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link QCOMExtendedGet} instance for the current context. */
	public static QCOMExtendedGet getInstance() {
		return checkFunctionality(GLES.getCapabilities().__QCOMExtendedGet);
	}

	static QCOMExtendedGet create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_QCOM_extended_get") ) return null;

		QCOMExtendedGet funcs = new QCOMExtendedGet(provider);
		boolean supported = checkFunctions(
			funcs.ExtGetTexturesQCOM, funcs.ExtGetBuffersQCOM, funcs.ExtGetRenderbuffersQCOM, funcs.ExtGetFramebuffersQCOM, funcs.ExtGetTexLevelParameterivQCOM, 
			funcs.ExtTexObjectStateOverrideiQCOM, funcs.ExtGetTexSubImageQCOM, funcs.ExtGetBufferPointervQCOM
		);

		return GLES.checkExtension("GL_QCOM_extended_get", funcs, supported);
	}

	// --- [ glExtGetTexturesQCOM ] ---

	/** Unsafe version of {@link #glExtGetTexturesQCOM ExtGetTexturesQCOM} */
	@JavadocExclude
	public static void nglExtGetTexturesQCOM(long textures, int maxTextures, long numTextures) {
		long __functionAddress = getInstance().ExtGetTexturesQCOM;
		callPIPV(__functionAddress, textures, maxTextures, numTextures);
	}

	public static void glExtGetTexturesQCOM(ByteBuffer textures, int maxTextures, ByteBuffer numTextures) {
		if ( LWJGLUtil.CHECKS ) {
			if ( textures != null ) checkBuffer(textures, maxTextures << 2);
			if ( numTextures != null ) checkBuffer(numTextures, 1 << 2);
		}
		nglExtGetTexturesQCOM(memAddressSafe(textures), maxTextures, memAddressSafe(numTextures));
	}

	/** Alternative version of: {@link #glExtGetTexturesQCOM ExtGetTexturesQCOM} */
	public static void glExtGetTexturesQCOM(IntBuffer textures, IntBuffer numTextures) {
		if ( LWJGLUtil.CHECKS )
			if ( numTextures != null ) checkBuffer(numTextures, 1);
		nglExtGetTexturesQCOM(memAddressSafe(textures), textures == null ? 0 : textures.remaining(), memAddressSafe(numTextures));
	}

	// --- [ glExtGetBuffersQCOM ] ---

	/** Unsafe version of {@link #glExtGetBuffersQCOM ExtGetBuffersQCOM} */
	@JavadocExclude
	public static void nglExtGetBuffersQCOM(long buffers, int maxBuffers, long numBuffers) {
		long __functionAddress = getInstance().ExtGetBuffersQCOM;
		callPIPV(__functionAddress, buffers, maxBuffers, numBuffers);
	}

	public static void glExtGetBuffersQCOM(ByteBuffer buffers, int maxBuffers, ByteBuffer numBuffers) {
		if ( LWJGLUtil.CHECKS ) {
			if ( buffers != null ) checkBuffer(buffers, maxBuffers << 2);
			if ( numBuffers != null ) checkBuffer(numBuffers, 1 << 2);
		}
		nglExtGetBuffersQCOM(memAddressSafe(buffers), maxBuffers, memAddressSafe(numBuffers));
	}

	/** Alternative version of: {@link #glExtGetBuffersQCOM ExtGetBuffersQCOM} */
	public static void glExtGetBuffersQCOM(IntBuffer buffers, IntBuffer numBuffers) {
		if ( LWJGLUtil.CHECKS )
			if ( numBuffers != null ) checkBuffer(numBuffers, 1);
		nglExtGetBuffersQCOM(memAddressSafe(buffers), buffers == null ? 0 : buffers.remaining(), memAddressSafe(numBuffers));
	}

	// --- [ glExtGetRenderbuffersQCOM ] ---

	/** Unsafe version of {@link #glExtGetRenderbuffersQCOM ExtGetRenderbuffersQCOM} */
	@JavadocExclude
	public static void nglExtGetRenderbuffersQCOM(long renderbuffers, int maxRenderbuffers, long numRenderbuffers) {
		long __functionAddress = getInstance().ExtGetRenderbuffersQCOM;
		callPIPV(__functionAddress, renderbuffers, maxRenderbuffers, numRenderbuffers);
	}

	public static void glExtGetRenderbuffersQCOM(ByteBuffer renderbuffers, int maxRenderbuffers, ByteBuffer numRenderbuffers) {
		if ( LWJGLUtil.CHECKS ) {
			if ( renderbuffers != null ) checkBuffer(renderbuffers, maxRenderbuffers << 2);
			if ( numRenderbuffers != null ) checkBuffer(numRenderbuffers, 1 << 2);
		}
		nglExtGetRenderbuffersQCOM(memAddressSafe(renderbuffers), maxRenderbuffers, memAddressSafe(numRenderbuffers));
	}

	/** Alternative version of: {@link #glExtGetRenderbuffersQCOM ExtGetRenderbuffersQCOM} */
	public static void glExtGetRenderbuffersQCOM(IntBuffer renderbuffers, IntBuffer numRenderbuffers) {
		if ( LWJGLUtil.CHECKS )
			if ( numRenderbuffers != null ) checkBuffer(numRenderbuffers, 1);
		nglExtGetRenderbuffersQCOM(memAddressSafe(renderbuffers), renderbuffers == null ? 0 : renderbuffers.remaining(), memAddressSafe(numRenderbuffers));
	}

	// --- [ glExtGetFramebuffersQCOM ] ---

	/** Unsafe version of {@link #glExtGetFramebuffersQCOM ExtGetFramebuffersQCOM} */
	@JavadocExclude
	public static void nglExtGetFramebuffersQCOM(long framebuffers, int maxFramebuffers, long numFramebuffers) {
		long __functionAddress = getInstance().ExtGetFramebuffersQCOM;
		callPIPV(__functionAddress, framebuffers, maxFramebuffers, numFramebuffers);
	}

	public static void glExtGetFramebuffersQCOM(ByteBuffer framebuffers, int maxFramebuffers, ByteBuffer numFramebuffers) {
		if ( LWJGLUtil.CHECKS ) {
			if ( framebuffers != null ) checkBuffer(framebuffers, maxFramebuffers << 2);
			if ( numFramebuffers != null ) checkBuffer(numFramebuffers, 1 << 2);
		}
		nglExtGetFramebuffersQCOM(memAddressSafe(framebuffers), maxFramebuffers, memAddressSafe(numFramebuffers));
	}

	/** Alternative version of: {@link #glExtGetFramebuffersQCOM ExtGetFramebuffersQCOM} */
	public static void glExtGetFramebuffersQCOM(IntBuffer framebuffers, IntBuffer numFramebuffers) {
		if ( LWJGLUtil.CHECKS )
			if ( numFramebuffers != null ) checkBuffer(numFramebuffers, 1);
		nglExtGetFramebuffersQCOM(memAddressSafe(framebuffers), framebuffers == null ? 0 : framebuffers.remaining(), memAddressSafe(numFramebuffers));
	}

	// --- [ glExtGetTexLevelParameterivQCOM ] ---

	/** Unsafe version of {@link #glExtGetTexLevelParameterivQCOM ExtGetTexLevelParameterivQCOM} */
	@JavadocExclude
	public static void nglExtGetTexLevelParameterivQCOM(int texture, int face, int level, int pname, long params) {
		long __functionAddress = getInstance().ExtGetTexLevelParameterivQCOM;
		callIIIIPV(__functionAddress, texture, face, level, pname, params);
	}

	public static void glExtGetTexLevelParameterivQCOM(int texture, int face, int level, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglExtGetTexLevelParameterivQCOM(texture, face, level, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glExtGetTexLevelParameterivQCOM ExtGetTexLevelParameterivQCOM} */
	public static void glExtGetTexLevelParameterivQCOM(int texture, int face, int level, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglExtGetTexLevelParameterivQCOM(texture, face, level, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glExtGetTexLevelParameterivQCOM ExtGetTexLevelParameterivQCOM} */
	public static int glExtGetTexLevelParameteriQCOM(int texture, int face, int level, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglExtGetTexLevelParameterivQCOM(texture, face, level, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glExtTexObjectStateOverrideiQCOM ] ---

	public static void glExtTexObjectStateOverrideiQCOM(int target, int pname, int param) {
		long __functionAddress = getInstance().ExtTexObjectStateOverrideiQCOM;
		callIIIV(__functionAddress, target, pname, param);
	}

	// --- [ glExtGetTexSubImageQCOM ] ---

	/** Unsafe version of {@link #glExtGetTexSubImageQCOM ExtGetTexSubImageQCOM} */
	@JavadocExclude
	public static void nglExtGetTexSubImageQCOM(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long texels) {
		long __functionAddress = getInstance().ExtGetTexSubImageQCOM;
		callIIIIIIIIIIPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, texels);
	}

	public static void glExtGetTexSubImageQCOM(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer texels) {
		nglExtGetTexSubImageQCOM(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(texels));
	}

	// --- [ glExtGetBufferPointervQCOM ] ---

	/** Unsafe version of {@link #glExtGetBufferPointervQCOM ExtGetBufferPointervQCOM} */
	@JavadocExclude
	public static void nglExtGetBufferPointervQCOM(int target, long params) {
		long __functionAddress = getInstance().ExtGetBufferPointervQCOM;
		callIPV(__functionAddress, target, params);
	}

	public static void glExtGetBufferPointervQCOM(int target, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << POINTER_SHIFT);
		nglExtGetBufferPointervQCOM(target, memAddress(params));
	}

	/** Alternative version of: {@link #glExtGetBufferPointervQCOM ExtGetBufferPointervQCOM} */
	public static void glExtGetBufferPointervQCOM(int target, PointerBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglExtGetBufferPointervQCOM(target, memAddress(params));
	}

	/** Single return value version of: {@link #glExtGetBufferPointervQCOM ExtGetBufferPointervQCOM} */
	public static long glExtGetBufferPointerQCOM(int target) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.pointerParam();
		nglExtGetBufferPointervQCOM(target, __buffer.address(params));
		return __buffer.pointerValue(params);
	}

}