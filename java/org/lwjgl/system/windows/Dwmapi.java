/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Optional functionality loaded dynamically from <strong>dwmapi.dll</strong>.
 * 
 * <p>Features must be detected on a function-by-function basis. A function pointer will have a {@code NULL} (0L) value when the corresponding
 * function is not supported in the Windows version we're running.</p>
 */
public final class Dwmapi {

	/** Function address. */
	@JavadocExclude
	public final long DwmIsCompositionEnabledAddress;

	@JavadocExclude
	public Dwmapi(FunctionProvider provider) {
		DwmIsCompositionEnabledAddress = provider.getFunctionAddress("DwmIsCompositionEnabled");
	}

	// --- [ DwmIsCompositionEnabled ] ---

	/** JNI method for {@link #DwmIsCompositionEnabled} */
	@JavadocExclude
	public static native int nDwmIsCompositionEnabled(long enabled, long __functionAddress);

	/**
	 * Sets the current process as dots per inch (dpi) aware.
	 *
	 * @param enabled           a pointer to a value that, when this function returns successfully, receives {@code TRUE} if DWM composition is enabled; otherwise, {@code FALSE}.
	 * @param __functionAddress the DLL function address
	 */
	public static int DwmIsCompositionEnabled(ByteBuffer enabled, long __functionAddress) {
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nDwmIsCompositionEnabled(memAddress(enabled), __functionAddress);
	}

	/** Alternative version of: {@link #DwmIsCompositionEnabled} */
	public static int DwmIsCompositionEnabled(IntBuffer enabled, long __functionAddress) {
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nDwmIsCompositionEnabled(memAddress(enabled), __functionAddress);
	}

}