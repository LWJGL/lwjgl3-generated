/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_copy_image.txt">EXT_copy_image</a> extension.
 * 
 * <p>This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
 * otherwise configure the rendering pipeline.</p>
 * 
 * <p>This is accomplised by adding a new entry-point CopyImageSubData, which takes a named source and destination.</p>
 * 
 * <p>CopyImageSubData does not perform general-purpose conversions such as scaling, resizing, blending, color-space, or format conversions. It should be
 * considered to operate in a manner similar to a CPU memcpy, but using the GPU for the copy.</p>
 * 
 * <p>CopyImageSubData supports copies between images with different internal formats, if the formats are compatible as described in this extension.</p>
 * 
 * <p>CopyImageSubData also supports copying between compressed and uncompressed images if the compressed block / uncompressed texel sizes are the same.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public class EXTCopyImage {

	static { GLES.initialize(); }

	protected EXTCopyImage() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glCopyImageSubDataEXT
		);
	}

	// --- [ glCopyImageSubDataEXT ] ---

	public static native void nglCopyImageSubDataEXT(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth);

	public static void glCopyImageSubDataEXT(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
		nglCopyImageSubDataEXT(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
	}

}