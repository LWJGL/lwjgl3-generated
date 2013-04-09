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

	private GLX12() {}

	// --- [ glXGetCurrentDisplay ] ---

	/** JNI method for {@link #glXGetCurrentDisplay} */
	public static native long nglXGetCurrentDisplay(long __functionAddress);

	/** Returns the display associated with the current context and drawable. */
	public static long glXGetCurrentDisplay() {
		long __functionAddress = getInstance().glXGetCurrentDisplay;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglXGetCurrentDisplay(__functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GLX12;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX12") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported =  GL.isFunctionSupported(funcs.glXGetCurrentDisplay);

		return GL.checkExtension("GLX12", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GLX12}. */
	public static final class Functions implements FunctionMap {

		public final long glXGetCurrentDisplay;

		public Functions(FunctionProvider provider) {
			glXGetCurrentDisplay = provider.getFunctionAddress("glXGetCurrentDisplay");
		}

	}

}