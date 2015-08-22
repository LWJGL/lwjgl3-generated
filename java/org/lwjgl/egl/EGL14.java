/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The core EGL 1.4 functionality. */
public final class EGL14 {

	/**  */
	public static final int
		EGL_MULTISAMPLE_RESOLVE_BOX_BIT = 0x200,
		EGL_MULTISAMPLE_RESOLVE         = 0x3099,
		EGL_MULTISAMPLE_RESOLVE_DEFAULT = 0x309A,
		EGL_MULTISAMPLE_RESOLVE_BOX     = 0x309B,
		EGL_OPENGL_API                  = 0x30A2,
		EGL_OPENGL_BIT                  = 0x8,
		EGL_SWAP_BEHAVIOR_PRESERVED_BIT = 0x400;

	/**  */
	public static final long EGL_DEFAULT_DISPLAY = 0x0L;

	/** Function address. */
	@JavadocExclude
	public final long GetCurrentContext;

	@JavadocExclude
	public EGL14(FunctionProvider provider) {
		GetCurrentContext = provider.getFunctionAddress("eglGetCurrentContext");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EGL14} instance. */
	public static EGL14 getInstance() {
		return checkFunctionality(EGL.getCapabilities().__EGL14);
	}

	// --- [ eglGetCurrentContext ] ---

	public static long eglGetCurrentContext() {
		long __functionAddress = getInstance().GetCurrentContext;
		return callP(__functionAddress);
	}

}