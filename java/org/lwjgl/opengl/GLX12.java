/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to GLX 1.2. */
public class GLX12 {

	/** Function address. */
	@JavadocExclude
	public final long GetCurrentDisplay;

	@JavadocExclude
	protected GLX12() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GLX12(FunctionProvider provider) {
		GetCurrentDisplay = provider.getFunctionAddress("glXGetCurrentDisplay");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLX12} instance of the current context. */
	public static GLX12 getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link GLX12} instance of the specified {@link GLCapabilities}. */
	public static GLX12 getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__GLX12);
	}

	static GLX12 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX12") ) return null;

		GLX12 funcs = new GLX12(provider);

		boolean supported = checkFunctions(
			funcs.GetCurrentDisplay
		);

		return GL.checkExtension("GLX12", funcs, supported);
	}

	// --- [ glXGetCurrentDisplay ] ---

	/** Returns the display associated with the current context and drawable. */
	public static long glXGetCurrentDisplay() {
		long __functionAddress = getInstance().GetCurrentDisplay;
		return callP(__functionAddress);
	}

}