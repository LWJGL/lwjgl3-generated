/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to GLX 1.2. */
public final class GLX12 {

	/** Function address. */
	@JavadocExclude
	public final long GetCurrentDisplay;

	@JavadocExclude
	public GLX12(FunctionProvider provider) {
		GetCurrentDisplay = provider.getFunctionAddress("glXGetCurrentDisplay");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLX12} instance for the current context. */
	public static GLX12 getInstance() {
		return checkFunctionality(GL.getCapabilities().__GLX12);
	}

	static GLX12 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_12") ) return null;

		GLX12 funcs = new GLX12(provider);

		boolean supported = checkFunctions(
			funcs.GetCurrentDisplay
		);

		return GL.checkExtension("GLX_12", funcs, supported);
	}

	// --- [ glXGetCurrentDisplay ] ---

	/** JNI method for {@link #glXGetCurrentDisplay GetCurrentDisplay} */
	@JavadocExclude
	public static native long nglXGetCurrentDisplay(long __functionAddress);

	/** Returns the display associated with the current context and drawable. */
	public static long glXGetCurrentDisplay() {
		long __functionAddress = getInstance().GetCurrentDisplay;
		return nglXGetCurrentDisplay(__functionAddress);
	}

}