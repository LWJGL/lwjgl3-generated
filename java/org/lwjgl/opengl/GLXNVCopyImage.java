/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

import org.lwjgl.system.linux.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/copy_image.txt">GLX_NV_copy_image</a> extension.
 * <p/>
 * This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
 * otherwise configure the rendering pipeline. The GLX version allows copying between images in different contexts, even if those contexts are in different
 * sharelists or even on different physical devices.
 */
public final class GLXNVCopyImage {

	private GLXNVCopyImage() {}

	// --- [ glXCopyImageSubDataNV ] ---

	/** JNI method for {@link #glXCopyImageSubDataNV} */
	public static native void nglXCopyImageSubDataNV(long display, long srcCtx, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, long dstCtx, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int width, int height, int depth, long __functionAddress);

	/**
	 * Behaves identically to the core function {@link NVCopyImage#glCopyImageSubDataNV}, except that the {@code srcCtx} and {@code dstCtx} parameters specify
	 * the contexts in which to look up the source and destination objects, respectively. A value of {@code NULL} for either context indicates that the value which is
	 * returned by {@link {@link GLX#glXGetCurrentContext}} should be used instead. Both contexts must share the same address space.
	 *
	 * @param display   the connection to the X server
	 * @param srcCtx    the source context
	 * @param srcName   
	 * @param srcTarget 
	 * @param srcLevel  
	 * @param srcX      
	 * @param srcY      
	 * @param srcZ      
	 * @param dstCtx    the destination context
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
	public static void glXCopyImageSubDataNV(long display, long srcCtx, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, long dstCtx, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int width, int height, int depth) {
		long __functionAddress = getInstance().glXCopyImageSubDataNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		nglXCopyImageSubDataNV(display, srcCtx, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstCtx, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GLXNVCopyImage;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_NV_copy_image") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported =  GL.isFunctionSupported(funcs.glXCopyImageSubDataNV);

		return GL.checkExtension("GLX_NV_copy_image", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GLXNVCopyImage}. */
	public static final class Functions implements FunctionMap {

		public final long glXCopyImageSubDataNV;

		public Functions(FunctionProvider provider) {
			glXCopyImageSubDataNV = provider.getFunctionAddress("glXCopyImageSubDataNV");
		}

	}

}