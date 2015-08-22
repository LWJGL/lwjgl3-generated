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
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/EXT/EGL_EXT_device_query.txt">EXT_device_query</a> extension.
 * 
 * <p>Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
 * windowing systems. This creates demand for a method to access native GPU or device objects directly rather than calling EGL or GL entry points.</p>
 * 
 * <p>This extension defines the method for an application to query native device objects from an EGL Display.</p>
 * 
 * <p>Requires {@link EGL15 EGL L.1} or an earlier verison of EGL with the <a href="https://www.khronos.org/registry/egl/extensions/EXT/EGL_EXT_client_extensions.txt">EXT_device_query</a> extension.</p>
 */
public final class EXTDeviceQuery {

	/**  */
	public static final int
		EGL_BAD_DEVICE_EXT = 0x322B,
		EGL_DEVICE_EXT     = 0x322C;

	/**  */
	public static final long EGL_NO_DEVICE_EXT = 0x0L;

	/** Function address. */
	@JavadocExclude
	public final long
		QueryDeviceAttribEXT,
		QueryDeviceStringEXT,
		QueryDisplayAttribEXT;

	@JavadocExclude
	public EXTDeviceQuery(FunctionProvider provider) {
		QueryDeviceAttribEXT = provider.getFunctionAddress("eglQueryDeviceAttribEXT");
		QueryDeviceStringEXT = provider.getFunctionAddress("eglQueryDeviceStringEXT");
		QueryDisplayAttribEXT = provider.getFunctionAddress("eglQueryDisplayAttribEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTDeviceQuery} instance. */
	public static EXTDeviceQuery getInstance() {
		return checkFunctionality(EGL.getCapabilities().__EXTDeviceQuery);
	}

	// --- [ eglQueryDeviceAttribEXT ] ---

	/** Unsafe version of {@link #eglQueryDeviceAttribEXT QueryDeviceAttribEXT} */
	@JavadocExclude
	public static boolean neglQueryDeviceAttribEXT(long device, int attribute, long value) {
		long __functionAddress = getInstance().QueryDeviceAttribEXT;
		if ( LWJGLUtil.CHECKS )
			checkPointer(device);
		return callPIPZ(__functionAddress, device, attribute, value);
	}

	public static boolean eglQueryDeviceAttribEXT(long device, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << POINTER_SHIFT);
		return neglQueryDeviceAttribEXT(device, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #eglQueryDeviceAttribEXT QueryDeviceAttribEXT} */
	public static boolean eglQueryDeviceAttribEXT(long device, int attribute, PointerBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return neglQueryDeviceAttribEXT(device, attribute, memAddress(value));
	}

	// --- [ eglQueryDeviceStringEXT ] ---

	/** Unsafe version of {@link #eglQueryDeviceStringEXT QueryDeviceStringEXT} */
	@JavadocExclude
	public static long neglQueryDeviceStringEXT(long device, int name) {
		long __functionAddress = getInstance().QueryDeviceStringEXT;
		if ( LWJGLUtil.CHECKS )
			checkPointer(device);
		return callPIP(__functionAddress, device, name);
	}

	public static String eglQueryDeviceStringEXT(long device, int name) {
		long __result = neglQueryDeviceStringEXT(device, name);
		return memDecodeASCII(__result);
	}

	// --- [ eglQueryDisplayAttribEXT ] ---

	/** Unsafe version of {@link #eglQueryDisplayAttribEXT QueryDisplayAttribEXT} */
	@JavadocExclude
	public static boolean neglQueryDisplayAttribEXT(long dpy, int attribute, long value) {
		long __functionAddress = getInstance().QueryDisplayAttribEXT;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dpy);
		return callPIPZ(__functionAddress, dpy, attribute, value);
	}

	public static boolean eglQueryDisplayAttribEXT(long dpy, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << POINTER_SHIFT);
		return neglQueryDisplayAttribEXT(dpy, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #eglQueryDisplayAttribEXT QueryDisplayAttribEXT} */
	public static boolean eglQueryDisplayAttribEXT(long dpy, int attribute, PointerBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return neglQueryDisplayAttribEXT(dpy, attribute, memAddress(value));
	}

}