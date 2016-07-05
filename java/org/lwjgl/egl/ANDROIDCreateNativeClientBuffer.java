/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/ANDROID/EGL_ANDROID_create_native_client_buffer.txt">ANDROID_create_native_client_buffer</a> extension.
 * 
 * <p>This extension allows creating an {@code EGLClientBuffer} backed by an Android window buffer ({@code struct ANativeWindowBuffer}) which can be later
 * used to create an {@code EGLImage}.</p>
 */
public class ANDROIDCreateNativeClientBuffer {

	/** The usage bits of the buffer data. */
	public static final int EGL_NATIVE_BUFFER_USAGE_ANDROID = 0x3143;

	/**
	 * Indicates that the created buffer must have a hardware-protected path to external display sink. If a hardware-protected path is not available, then
	 * either don't composite only this buffer (preferred) to the external sink, or (less desirable) do not route the entire composition to the external sink.
	 */
	public static final int EGL_NATIVE_BUFFER_USAGE_PROTECTED_BIT_ANDROID = 0x1;

	/** The buffer will be used to create a renderbuffer. This flag must not be set if {@link #EGL_NATIVE_BUFFER_USAGE_TEXTURE_BIT_ANDROID NATIVE_BUFFER_USAGE_TEXTURE_BIT_ANDROID} is set. */
	public static final int EGL_NATIVE_BUFFER_USAGE_RENDERBUFFER_BIT_ANDROID = 0x2;

	/** The buffer will be used to create a texture. This flag must not be set if {@link #EGL_NATIVE_BUFFER_USAGE_RENDERBUFFER_BIT_ANDROID NATIVE_BUFFER_USAGE_RENDERBUFFER_BIT_ANDROID} is set. */
	public static final int EGL_NATIVE_BUFFER_USAGE_TEXTURE_BIT_ANDROID = 0x4;

	protected ANDROIDCreateNativeClientBuffer() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglCreateNativeClientBufferANDROID
		);
	}

	// --- [ eglCreateNativeClientBufferANDROID ] ---

	/**
	 * May be used to create an {@code EGLClientBuffer} backed by an {@code ANativeWindowBuffer} struct. EGL implementations must guarantee that the lifetime
	 * of the returned {@code EGLClientBuffer} is at least as long as the {@code EGLImage(s)} it is bound to; the {@code EGLClientBuffer} must be destroyed no
	 * earlier than when all of its associated {@code EGLImages} are destroyed by {@link KHRImageBase#eglDestroyImageKHR DestroyImageKHR}.
	 *
	 * @param attrib_list a list of attribute-value pairs which is used to specify the dimensions, format, and usage of the underlying buffer structure. If it is non-{@code NULL},
	 *                    the last attribute specified in the list must be {@link EGL10#EGL_NONE NONE}.
	 */
	public static long neglCreateNativeClientBufferANDROID(long attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglCreateNativeClientBufferANDROID;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPP(__functionAddress, attrib_list);
	}

	/**
	 * May be used to create an {@code EGLClientBuffer} backed by an {@code ANativeWindowBuffer} struct. EGL implementations must guarantee that the lifetime
	 * of the returned {@code EGLClientBuffer} is at least as long as the {@code EGLImage(s)} it is bound to; the {@code EGLClientBuffer} must be destroyed no
	 * earlier than when all of its associated {@code EGLImages} are destroyed by {@link KHRImageBase#eglDestroyImageKHR DestroyImageKHR}.
	 *
	 * @param attrib_list a list of attribute-value pairs which is used to specify the dimensions, format, and usage of the underlying buffer structure. If it is non-{@code NULL},
	 *                    the last attribute specified in the list must be {@link EGL10#EGL_NONE NONE}.
	 */
	public static long eglCreateNativeClientBufferANDROID(IntBuffer attrib_list) {
		if ( CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateNativeClientBufferANDROID(memAddressSafe(attrib_list));
	}

	/** Array version of: {@link #eglCreateNativeClientBufferANDROID CreateNativeClientBufferANDROID} */
	public static long eglCreateNativeClientBufferANDROID(int[] attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglCreateNativeClientBufferANDROID;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		}
		return callPP(__functionAddress, attrib_list);
	}

}