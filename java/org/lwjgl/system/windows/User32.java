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
 * 
 * <p>Features must be detected on a function-by-function basis. A function pointer will have a {@code NULL} (0L) value when the corresponding
 * function is not supported in the Windows version we're running.</p>
 */
public final class User32 {

	/** Function address. */
	@JavadocExclude
	public final long SetProcessDPIAwareAddress;

	@JavadocExclude
	public User32(FunctionProvider provider) {
		SetProcessDPIAwareAddress = provider.getFunctionAddress("SetProcessDPIAware");
	}

	// --- [ SetProcessDPIAware ] ---

	/** JNI method for {@link #SetProcessDPIAware} */
	@JavadocExclude
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

}