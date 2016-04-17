/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/NV/EGL_NV_system_time.txt">NV_system_time</a> extension.
 * 
 * <p>This extension exposes an alternative method of querying the system time from the driver instead of the operating system.</p>
 * 
 * <p>Requires {@link EGL12 EGL L.1}.</p>
 */
public class NVSystemTime {

	protected NVSystemTime() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglGetSystemTimeFrequencyNV, caps.eglGetSystemTimeNV
		);
	}

	// --- [ eglGetSystemTimeFrequencyNV ] ---

	public static long eglGetSystemTimeFrequencyNV() {
		long __functionAddress = EGL.getCapabilities().eglGetSystemTimeFrequencyNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callJ(__functionAddress);
	}

	// --- [ eglGetSystemTimeNV ] ---

	public static long eglGetSystemTimeNV() {
		long __functionAddress = EGL.getCapabilities().eglGetSystemTimeNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callJ(__functionAddress);
	}

}