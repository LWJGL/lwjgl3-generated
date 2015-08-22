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
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/EXT/EGL_EXT_device_base.txt">EXT_device_base</a> extension.
 * 
 * <p>Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
 * windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
 * native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
 * solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
 * without the use of any underlying "native" APIs or functionality.</p>
 * 
 * <p>This extension defines the first step of this bootstrapping process: Device enumeration.</p>
 */
public final class EXTDeviceBase {

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
		QueryDisplayAttribEXT,
		QueryDevicesEXT;

	@JavadocExclude
	public EXTDeviceBase(FunctionProvider provider) {
		QueryDeviceAttribEXT = provider.getFunctionAddress("eglQueryDeviceAttribEXT");
		QueryDeviceStringEXT = provider.getFunctionAddress("eglQueryDeviceStringEXT");
		QueryDisplayAttribEXT = provider.getFunctionAddress("eglQueryDisplayAttribEXT");
		QueryDevicesEXT = provider.getFunctionAddress("eglQueryDevicesEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTDeviceBase} instance. */
	public static EXTDeviceBase getInstance() {
		return checkFunctionality(EGL.getCapabilities().__EXTDeviceBase);
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

	// --- [ eglQueryDevicesEXT ] ---

	/** Unsafe version of {@link #eglQueryDevicesEXT QueryDevicesEXT} */
	@JavadocExclude
	public static boolean neglQueryDevicesEXT(int max_devices, long devices, long num_devices) {
		long __functionAddress = getInstance().QueryDevicesEXT;
		return callIPPZ(__functionAddress, max_devices, devices, num_devices);
	}

	public static boolean eglQueryDevicesEXT(int max_devices, ByteBuffer devices, ByteBuffer num_devices) {
		if ( LWJGLUtil.CHECKS ) {
			if ( devices != null ) checkBuffer(devices, max_devices << POINTER_SHIFT);
			checkBuffer(num_devices, 1 << 2);
		}
		return neglQueryDevicesEXT(max_devices, memAddressSafe(devices), memAddress(num_devices));
	}

	/** Alternative version of: {@link #eglQueryDevicesEXT QueryDevicesEXT} */
	public static boolean eglQueryDevicesEXT(PointerBuffer devices, IntBuffer num_devices) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(num_devices, 1);
		return neglQueryDevicesEXT(devices == null ? 0 : devices.remaining(), memAddressSafe(devices), memAddress(num_devices));
	}

}