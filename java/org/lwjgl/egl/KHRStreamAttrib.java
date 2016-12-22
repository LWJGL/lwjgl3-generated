/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** See {@link KHRStream KHR_stream}. */
public class KHRStreamAttrib {

	protected KHRStreamAttrib() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglCreateStreamAttribKHR, caps.eglSetStreamAttribKHR, caps.eglQueryStreamAttribKHR, caps.eglStreamConsumerAcquireAttribKHR, 
			caps.eglStreamConsumerReleaseAttribKHR
		);
	}

	// --- [ eglCreateStreamAttribKHR ] ---

	public static long neglCreateStreamAttribKHR(long dpy, long attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglCreateStreamAttribKHR;
		if ( CHECKS ) {
			check(__functionAddress);
			check(dpy);
		}
		return callPPP(__functionAddress, dpy, attrib_list);
	}

	public static long eglCreateStreamAttribKHR(long dpy, PointerBuffer attrib_list) {
		if ( CHECKS )
			checkNTSafe(attrib_list, EGL10.EGL_NONE);
		return neglCreateStreamAttribKHR(dpy, memAddressSafe(attrib_list));
	}

	// --- [ eglSetStreamAttribKHR ] ---

	public static boolean eglSetStreamAttribKHR(long dpy, long stream, int attribute, long value) {
		long __functionAddress = EGL.getCapabilities().eglSetStreamAttribKHR;
		if ( CHECKS ) {
			check(__functionAddress);
			check(dpy);
			check(stream);
		}
		return callPPPI(__functionAddress, dpy, stream, attribute, value) != 0;
	}

	// --- [ eglQueryStreamAttribKHR ] ---

	public static int neglQueryStreamAttribKHR(long dpy, long stream, int attribute, long value) {
		long __functionAddress = EGL.getCapabilities().eglQueryStreamAttribKHR;
		if ( CHECKS ) {
			check(__functionAddress);
			check(dpy);
			check(stream);
		}
		return callPPPI(__functionAddress, dpy, stream, attribute, value);
	}

	public static boolean eglQueryStreamAttribKHR(long dpy, long stream, int attribute, PointerBuffer value) {
		if ( CHECKS )
			check(value, 1);
		return neglQueryStreamAttribKHR(dpy, stream, attribute, memAddress(value)) != 0;
	}

	// --- [ eglStreamConsumerAcquireAttribKHR ] ---

	public static int neglStreamConsumerAcquireAttribKHR(long dpy, long stream, long attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglStreamConsumerAcquireAttribKHR;
		if ( CHECKS ) {
			check(__functionAddress);
			check(dpy);
			check(stream);
		}
		return callPPPI(__functionAddress, dpy, stream, attrib_list);
	}

	public static boolean eglStreamConsumerAcquireAttribKHR(long dpy, long stream, PointerBuffer attrib_list) {
		if ( CHECKS )
			checkNTSafe(attrib_list, EGL10.EGL_NONE);
		return neglStreamConsumerAcquireAttribKHR(dpy, stream, memAddressSafe(attrib_list)) != 0;
	}

	// --- [ eglStreamConsumerReleaseAttribKHR ] ---

	public static int neglStreamConsumerReleaseAttribKHR(long dpy, long stream, long attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglStreamConsumerReleaseAttribKHR;
		if ( CHECKS ) {
			check(__functionAddress);
			check(dpy);
			check(stream);
		}
		return callPPPI(__functionAddress, dpy, stream, attrib_list);
	}

	public static boolean eglStreamConsumerReleaseAttribKHR(long dpy, long stream, PointerBuffer attrib_list) {
		if ( CHECKS )
			checkNTSafe(attrib_list, EGL10.EGL_NONE);
		return neglStreamConsumerReleaseAttribKHR(dpy, stream, memAddressSafe(attrib_list)) != 0;
	}

}