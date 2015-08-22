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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_stream_producer_eglsurface.txt">KHR_stream_producer_eglsurface</a> extension.
 * 
 * <p>This extension allows an EGLSurface to be created as a producer of images to an EGLStream. Each call to eglSwapBuffers posts a new image frame into the
 * EGLStream.</p>
 * 
 * <p>Requires {@link EGL12 EGL L.1}.</p>
 */
public final class KHRStreamProducerEGLSurface {

	/**  */
	public static final int EGL_STREAM_BIT_KHR = 0x800;

	/** Function address. */
	@JavadocExclude
	public final long CreateStreamProducerSurfaceKHR;

	@JavadocExclude
	public KHRStreamProducerEGLSurface(FunctionProvider provider) {
		CreateStreamProducerSurfaceKHR = provider.getFunctionAddress("eglCreateStreamProducerSurfaceKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRStreamProducerEGLSurface} instance. */
	public static KHRStreamProducerEGLSurface getInstance() {
		return checkFunctionality(EGL.getCapabilities().__KHRStreamProducerEGLSurface);
	}

	// --- [ eglCreateStreamProducerSurfaceKHR ] ---

	/** Unsafe version of {@link #eglCreateStreamProducerSurfaceKHR CreateStreamProducerSurfaceKHR} */
	@JavadocExclude
	public static long neglCreateStreamProducerSurfaceKHR(long dpy, long config, long stream, long attrib_list) {
		long __functionAddress = getInstance().CreateStreamProducerSurfaceKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(config);
			checkPointer(stream);
		}
		return callPPPPP(__functionAddress, dpy, config, stream, attrib_list);
	}

	public static long eglCreateStreamProducerSurfaceKHR(long dpy, long config, long stream, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglCreateStreamProducerSurfaceKHR(dpy, config, stream, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglCreateStreamProducerSurfaceKHR CreateStreamProducerSurfaceKHR} */
	public static long eglCreateStreamProducerSurfaceKHR(long dpy, long config, long stream, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateStreamProducerSurfaceKHR(dpy, config, stream, memAddressSafe(attrib_list));
	}

}