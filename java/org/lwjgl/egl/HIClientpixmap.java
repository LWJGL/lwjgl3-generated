/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/HI/EGL_HI_clientpixmap.txt">HI_clientpixmap</a> extension.
 * 
 * <p>This extension provides a mechanism for using memory allocated by the application as a color-buffer.</p>
 */
public final class HIClientpixmap {

	/**  */
	public static final int EGL_CLIENT_PIXMAP_POINTER_HI = 0x8F74;

	/** Function address. */
	@JavadocExclude
	public final long CreatePixmapSurfaceHI;

	@JavadocExclude
	public HIClientpixmap(FunctionProvider provider) {
		CreatePixmapSurfaceHI = provider.getFunctionAddress("eglCreatePixmapSurfaceHI");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link HIClientpixmap} instance. */
	public static HIClientpixmap getInstance() {
		return checkFunctionality(EGL.getCapabilities().__HIClientpixmap);
	}

	static HIClientpixmap create(FunctionProvider provider) {
		HIClientpixmap funcs = new HIClientpixmap(provider);

		boolean supported = checkFunctions(
			funcs.CreatePixmapSurfaceHI
		);

		return supported ? funcs : null;
	}

	// --- [ eglCreatePixmapSurfaceHI ] ---

	/** JNI method for {@link #eglCreatePixmapSurfaceHI CreatePixmapSurfaceHI} */
	@JavadocExclude
	public static native long neglCreatePixmapSurfaceHI(long dpy, long config, long pixmap, long __functionAddress);

	/** Unsafe version of {@link #eglCreatePixmapSurfaceHI CreatePixmapSurfaceHI} */
	@JavadocExclude
	public static long neglCreatePixmapSurfaceHI(long dpy, long config, long pixmap) {
		long __functionAddress = getInstance().CreatePixmapSurfaceHI;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(config);
		}
		return neglCreatePixmapSurfaceHI(dpy, config, pixmap, __functionAddress);
	}

	public static long eglCreatePixmapSurfaceHI(long dpy, long config, ByteBuffer pixmap) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pixmap, EGLClientPixmapHI.SIZEOF);
		return neglCreatePixmapSurfaceHI(dpy, config, memAddress(pixmap));
	}

}