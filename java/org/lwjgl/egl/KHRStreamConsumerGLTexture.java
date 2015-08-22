/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_stream_consumer_gltexture.txt">KHR_stream_consumer_gltexture</a> extension.
 * 
 * <p>This extension allows an OpenGL(ES) texture to be connected to an EGLStream as its consumer. Image frames from the EGLStream can be 'latched' into the
 * texture as the contents of the texture. This is equivalent to copying the image into the texture, but on most implementations a copy is not needed so
 * this is faster.</p>
 * 
 * <p>Requires {@link EGL12 EGL L.1}.</p>
 */
public final class KHRStreamConsumerGLTexture {

	/**  */
	public static final int EGL_CONSUMER_ACQUIRE_TIMEOUT_USEC_KHR = 0x321E;

	/** Function address. */
	@JavadocExclude
	public final long
		StreamConsumerGLTextureExternalKHR,
		StreamConsumerAcquireKHR,
		StreamConsumerReleaseKHR;

	@JavadocExclude
	public KHRStreamConsumerGLTexture(FunctionProvider provider) {
		StreamConsumerGLTextureExternalKHR = provider.getFunctionAddress("eglStreamConsumerGLTextureExternalKHR");
		StreamConsumerAcquireKHR = provider.getFunctionAddress("eglStreamConsumerAcquireKHR");
		StreamConsumerReleaseKHR = provider.getFunctionAddress("eglStreamConsumerReleaseKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRStreamConsumerGLTexture} instance. */
	public static KHRStreamConsumerGLTexture getInstance() {
		return checkFunctionality(EGL.getCapabilities().__KHRStreamConsumerGLTexture);
	}

	// --- [ eglStreamConsumerGLTextureExternalKHR ] ---

	public static boolean eglStreamConsumerGLTextureExternalKHR(long dpy, long stream) {
		long __functionAddress = getInstance().StreamConsumerGLTextureExternalKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPZ(__functionAddress, dpy, stream);
	}

	// --- [ eglStreamConsumerAcquireKHR ] ---

	public static boolean eglStreamConsumerAcquireKHR(long dpy, long stream) {
		long __functionAddress = getInstance().StreamConsumerAcquireKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPZ(__functionAddress, dpy, stream);
	}

	// --- [ eglStreamConsumerReleaseKHR ] ---

	public static boolean eglStreamConsumerReleaseKHR(long dpy, long stream) {
		long __functionAddress = getInstance().StreamConsumerReleaseKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPZ(__functionAddress, dpy, stream);
	}

}