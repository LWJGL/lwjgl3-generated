/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/copy_image.txt">WGL_NV_copy_image</a> extension.
 * 
 * <p>This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
 * otherwise configure the rendering pipeline. The WGL version allows copying between images in different contexts, even if those contexts are in
 * different sharelists or even on different physical devices.</p>
 */
public final class WGLNVCopyImage {

	/** Function address. */
	@JavadocExclude
	public final long CopyImageSubDataNV;

	@JavadocExclude
	public WGLNVCopyImage(FunctionProvider provider) {
		CopyImageSubDataNV = provider.getFunctionAddress("wglCopyImageSubDataNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link WGLNVCopyImage} instance for the current context. */
	public static WGLNVCopyImage getInstance() {
		return checkFunctionality(GL.getCapabilities().__WGLNVCopyImage);
	}

	static WGLNVCopyImage create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_NV_copy_image") ) return null;

		WGLNVCopyImage funcs = new WGLNVCopyImage(provider);

		boolean supported = checkFunctions(
			funcs.CopyImageSubDataNV
		);

		return GL.checkExtension("WGL_NV_copy_image", funcs, supported);
	}

	// --- [ wglCopyImageSubDataNV ] ---

	/** JNI method for {@link #wglCopyImageSubDataNV CopyImageSubDataNV} */
	@JavadocExclude
	public static native int nwglCopyImageSubDataNV(long srcRC, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, long dstRC, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int width, int height, int depth, long __functionAddress);

	/**
	 * Behaves identically to the core function {@link NVCopyImage#glCopyImageSubDataNV}, except that the {@code srcRC} and {@code dstRC} parameters specify
	 * the contexts in which to look up the source and destination objects, respectively. A value of zero indicates that the currently bound context should be
	 * used instead.
	 *
	 * @param srcRC     the source OpenGL context
	 * @param srcName   the source object
	 * @param srcTarget the source object target
	 * @param srcLevel  the source level-of-detail number
	 * @param srcX      the source texel x coordinate
	 * @param srcY      the source texel y coordinate
	 * @param srcZ      the source texel z coordinate
	 * @param dstRC     the destination OpenGL context
	 * @param dstName   the destination object
	 * @param dstTarget the destination object target
	 * @param dstLevel  the destination level-of-detail number
	 * @param dstX      the destination texel x coordinate
	 * @param dstY      the destination texel y coordinate
	 * @param dstZ      the destination texel z coordinate
	 * @param width     the number of texels to copy in the x-dimension
	 * @param height    the number of texels to copy in the y-dimension
	 * @param depth     the number of texels to copy in the z-dimension
	 */
	public static int wglCopyImageSubDataNV(long srcRC, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, long dstRC, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int width, int height, int depth) {
		long __functionAddress = getInstance().CopyImageSubDataNV;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(srcRC);
			checkPointer(dstRC);
		}
		return nwglCopyImageSubDataNV(srcRC, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstRC, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth, __functionAddress);
	}

}