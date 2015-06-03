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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/copy_image.txt">ARB_copy_image</a> extension.
 * 
 * <p>This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
 * otherwise configure the rendering pipeline.</p>
 * 
 * <p>This is accomplised by adding a new entry-point {@link #glCopyImageSubData CopyImageSubData}, which takes a named source and destination.</p>
 * 
 * <p>CopyImageSubData does not perform general-purpose conversions such as scaling, resizing, blending, color-space, or format conversions. It should be
 * considered to operate in a manner similar to a CPU {@code memcpy}, but using the GPU for the copy.</p>
 * 
 * <p>CopyImageSubData supports copies between images with different internal formats, if the formats are compatible for TextureViews.</p>
 * 
 * <p>CopyImageSubData also supports copying between compressed and uncompressed images if the compressed block / uncompressed texel sizes are the same.</p>
 * 
 * <p>Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public final class ARBCopyImage {

	/** Function address. */
	@JavadocExclude
	public final long CopyImageSubData;

	@JavadocExclude
	public ARBCopyImage(FunctionProvider provider) {
		CopyImageSubData = provider.getFunctionAddress("glCopyImageSubData");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBCopyImage} instance for the current context. */
	public static ARBCopyImage getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBCopyImage);
	}

	static ARBCopyImage create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_copy_image") ) return null;

		ARBCopyImage funcs = new ARBCopyImage(provider);

		boolean supported = checkFunctions(
			funcs.CopyImageSubData
		);

		return GL.checkExtension("GL_ARB_copy_image", funcs, supported);
	}

	// --- [ glCopyImageSubData ] ---

	/**
	 * Performs a raw data copy between two images.
	 *
	 * @param srcName   the name of a texture or renderbuffer object from which to copy
	 * @param srcTarget the target representing the namespace of the source name {@code srcName}
	 * @param srcLevel  the mipmap level to read from the source
	 * @param srcX      the X coordinate of the left edge of the souce region to copy
	 * @param srcY      the Y coordinate of the top edge of the souce region to copy
	 * @param srcZ      the Z coordinate of the near edge of the souce region to copy
	 * @param dstName   the name of a texture or renderbuffer object to which to copy
	 * @param dstTarget the target representing the namespace of the destination name {@code dstName}
	 * @param dstLevel  the mipmap level to write to the source
	 * @param dstX      the X coordinate of the left edge of the destination region
	 * @param dstY      the Y coordinate of the top edge of the destination region
	 * @param dstZ      the Z coordinate of the near edge of the destination region
	 * @param srcWidth  the width of the region to be copied
	 * @param srcHeight the height of the region to be copied
	 * @param srcDepth  the depth of the region to be copied
	 */
	public static void glCopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
		long __functionAddress = getInstance().CopyImageSubData;
		GL43.nglCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth, __functionAddress);
	}

}