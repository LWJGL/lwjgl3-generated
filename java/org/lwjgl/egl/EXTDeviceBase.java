/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
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
public class EXTDeviceBase {

	/**  */
	public static final int
		EGL_BAD_DEVICE_EXT = 0x322B,
		EGL_DEVICE_EXT     = 0x322C;

	/**  */
	public static final long EGL_NO_DEVICE_EXT = 0x0L;

	protected EXTDeviceBase() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglQueryDeviceAttribEXT, caps.eglQueryDeviceStringEXT, caps.eglQueryDisplayAttribEXT, caps.eglQueryDevicesEXT
		);
	}

	// --- [ eglQueryDeviceAttribEXT ] ---

	public static int neglQueryDeviceAttribEXT(long device, int attribute, long value) {
		long __functionAddress = EGL.getCapabilities().eglQueryDeviceAttribEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		return callPPI(__functionAddress, device, attribute, value);
	}

	public static boolean eglQueryDeviceAttribEXT(long device, int attribute, PointerBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return neglQueryDeviceAttribEXT(device, attribute, memAddress(value)) != 0;
	}

	// --- [ eglQueryDeviceStringEXT ] ---

	public static long neglQueryDeviceStringEXT(long device, int name) {
		long __functionAddress = EGL.getCapabilities().eglQueryDeviceStringEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		return callPP(__functionAddress, device, name);
	}

	public static String eglQueryDeviceStringEXT(long device, int name) {
		long __result = neglQueryDeviceStringEXT(device, name);
		return memASCII(__result);
	}

	// --- [ eglQueryDisplayAttribEXT ] ---

	public static int neglQueryDisplayAttribEXT(long dpy, int attribute, long value) {
		long __functionAddress = EGL.getCapabilities().eglQueryDisplayAttribEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
		}
		return callPPI(__functionAddress, dpy, attribute, value);
	}

	public static boolean eglQueryDisplayAttribEXT(long dpy, int attribute, PointerBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return neglQueryDisplayAttribEXT(dpy, attribute, memAddress(value)) != 0;
	}

	// --- [ eglQueryDevicesEXT ] ---

	public static int neglQueryDevicesEXT(int max_devices, long devices, long num_devices) {
		long __functionAddress = EGL.getCapabilities().eglQueryDevicesEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPI(__functionAddress, max_devices, devices, num_devices);
	}

	public static boolean eglQueryDevicesEXT(PointerBuffer devices, IntBuffer num_devices) {
		if ( CHECKS )
			checkBuffer(num_devices, 1);
		return neglQueryDevicesEXT(devices == null ? 0 : devices.remaining(), memAddressSafe(devices), memAddress(num_devices)) != 0;
	}

	/** Array version of: {@link #eglQueryDevicesEXT QueryDevicesEXT} */
	public static boolean eglQueryDevicesEXT(PointerBuffer devices, int[] num_devices) {
		long __functionAddress = EGL.getCapabilities().eglQueryDevicesEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(num_devices, 1);
		}
		return callPPI(__functionAddress, devices == null ? 0 : devices.remaining(), memAddressSafe(devices), num_devices) != 0;
	}

}