/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Optional functionality loaded dynamically from <strong>user32.dll</strong>.
 * <p/>
 * Features must be detected on a function-by-function basis. The pointers in the {@link Functions} instance will have a zero (0L) value when a particular
 * function is not supported in the Windows version we're running.
 */
public final class User32 {

	private User32() {}

	// --- [ SetProcessDPIAware ] ---

	/** JNI method for {@link #SetProcessDPIAware} */
	public static native int nSetProcessDPIAware(long __functionAddress);

	/**
	 * Sets the current process as dots per inch (dpi) aware.
	 *
	 * @param __functionAddress the DLL function address
	 */
	public static int SetProcessDPIAware(long __functionAddress) {
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nSetProcessDPIAware(__functionAddress);
	}

	/** The {@link FunctionMap} class for {@code User32}. */
	public static final class Functions implements FunctionMap {

		public final long SetProcessDPIAware;

		public Functions(FunctionProvider provider) {
			SetProcessDPIAware = provider.getFunctionAddress("SetProcessDPIAware");
		}

	}

}