/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/copy_image.txt">NV_copy_image</a> extension.
 * 
 * <p>This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
 * otherwise configure the rendering pipeline. The WGL and GLX versions allow copying between images in different contexts, even if those contexts are in
 * different sharelists or even on different physical devices.</p>
 */
public class NVCopyImage {

	protected NVCopyImage() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glCopyImageSubDataNV
		);
	}

	// --- [ glCopyImageSubDataNV ] ---

	/**
	 * Copies a region of texel data between two image objects. An image object may be either a texture or a renderbuffer.
	 *
	 * @param srcName   
	 * @param srcTarget 
	 * @param srcLevel  
	 * @param srcX      
	 * @param srcY      
	 * @param srcZ      
	 * @param dstName   
	 * @param dstTarget 
	 * @param dstLevel  
	 * @param dstX      
	 * @param dstY      
	 * @param dstZ      
	 * @param width     
	 * @param height    
	 * @param depth     
	 */
	public static void glCopyImageSubDataNV(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int width, int height, int depth) {
		long __functionAddress = GL.getCapabilities().glCopyImageSubDataNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth);
	}

}