/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to GLX 1.2. */
public class GLX12 {

	protected GLX12() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLXCapabilities caps) {
		return checkFunctions(
			caps.glXGetCurrentDisplay
		);
	}

	// --- [ glXGetCurrentDisplay ] ---

	/** Returns the display associated with the current context and drawable. */
	public static long glXGetCurrentDisplay() {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetCurrentDisplay;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callP(__functionAddress);
	}

}