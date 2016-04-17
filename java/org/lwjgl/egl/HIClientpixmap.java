/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/HI/EGL_HI_clientpixmap.txt">HI_clientpixmap</a> extension.
 * 
 * <p>This extension provides a mechanism for using memory allocated by the application as a color-buffer.</p>
 */
public class HIClientpixmap {

	/**  */
	public static final int EGL_CLIENT_PIXMAP_POINTER_HI = 0x8F74;

	protected HIClientpixmap() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglCreatePixmapSurfaceHI
		);
	}

	// --- [ eglCreatePixmapSurfaceHI ] ---

	public static long neglCreatePixmapSurfaceHI(long dpy, long config, long pixmap) {
		long __functionAddress = EGL.getCapabilities().eglCreatePixmapSurfaceHI;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(config);
			EGLClientPixmapHI.validate(pixmap);
		}
		return callPPPP(__functionAddress, dpy, config, pixmap);
	}

	public static long eglCreatePixmapSurfaceHI(long dpy, long config, EGLClientPixmapHI pixmap) {
		return neglCreatePixmapSurfaceHI(dpy, config, pixmap.address());
	}

}