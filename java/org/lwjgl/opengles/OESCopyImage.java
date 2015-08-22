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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_copy_image.txt">OES_copy_image</a> extension.
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
public final class OESCopyImage {

	/** Function address. */
	@JavadocExclude
	public final long CopyImageSubDataOES;

	@JavadocExclude
	public OESCopyImage(FunctionProvider provider) {
		CopyImageSubDataOES = provider.getFunctionAddress("glCopyImageSubDataOES");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OESCopyImage} instance for the current context. */
	public static OESCopyImage getInstance() {
		return checkFunctionality(GLES.getCapabilities().__OESCopyImage);
	}

	static OESCopyImage create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OES_copy_image") ) return null;

		OESCopyImage funcs = new OESCopyImage(provider);
		boolean supported = checkFunctions(
			funcs.CopyImageSubDataOES
		);

		return GLES.checkExtension("GL_OES_copy_image", funcs, supported);
	}

	// --- [ glCopyImageSubDataOES ] ---

	public static void glCopyImageSubDataOES(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
		long __functionAddress = getInstance().CopyImageSubDataOES;
		callIIIIIIIIIIIIIIIV(__functionAddress, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
	}

}