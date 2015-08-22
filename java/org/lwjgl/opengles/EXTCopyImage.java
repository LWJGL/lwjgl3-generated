/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

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
 * <p>Requires {@link GLES30 GLES E.S}.</p>
 */
public final class EXTCopyImage {

	/** Function address. */
	@JavadocExclude
	public final long CopyImageSubDataEXT;

	@JavadocExclude
	public EXTCopyImage(FunctionProvider provider) {
		CopyImageSubDataEXT = provider.getFunctionAddress("glCopyImageSubDataEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTCopyImage} instance for the current context. */
	public static EXTCopyImage getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTCopyImage);
	}

	static EXTCopyImage create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_copy_image") ) return null;

		EXTCopyImage funcs = new EXTCopyImage(provider);
		boolean supported = checkFunctions(
			funcs.CopyImageSubDataEXT
		);

		return GLES.checkExtension("GL_EXT_copy_image", funcs, supported);
	}

	// --- [ glCopyImageSubDataEXT ] ---

	public static void glCopyImageSubDataEXT(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
		long __functionAddress = getInstance().CopyImageSubDataEXT;
		callIIIIIIIIIIIIIIIV(__functionAddress, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
	}

}