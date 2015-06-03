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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/copy_image.txt">NV_copy_image</a> extension.
 * 
 * <p>This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
 * otherwise configure the rendering pipeline. The WGL and GLX versions allow copying between images in different contexts, even if those contexts are in
 * different sharelists or even on different physical devices.</p>
 */
public final class NVCopyImage {

	/** Function address. */
	@JavadocExclude
	public final long CopyImageSubDataNV;

	@JavadocExclude
	public NVCopyImage(FunctionProvider provider) {
		CopyImageSubDataNV = provider.getFunctionAddress("glCopyImageSubDataNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVCopyImage} instance for the current context. */
	public static NVCopyImage getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVCopyImage);
	}

	static NVCopyImage create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_copy_image") ) return null;

		NVCopyImage funcs = new NVCopyImage(provider);

		boolean supported = checkFunctions(
			funcs.CopyImageSubDataNV
		);

		return GL.checkExtension("GL_NV_copy_image", funcs, supported);
	}

	// --- [ glCopyImageSubDataNV ] ---

	/** JNI method for {@link #glCopyImageSubDataNV CopyImageSubDataNV} */
	@JavadocExclude
	public static native void nglCopyImageSubDataNV(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int width, int height, int depth, long __functionAddress);

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
		long __functionAddress = getInstance().CopyImageSubDataNV;
		nglCopyImageSubDataNV(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth, __functionAddress);
	}

}