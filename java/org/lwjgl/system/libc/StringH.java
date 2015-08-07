/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libc;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to string.h. */
public final class StringH {

	static { LWJGLUtil.initialize(); }

	private StringH() {}

	// --- [ strerror ] ---

	/** JNI method for {@link #strerror} */
	@JavadocExclude
	public static native long nstrerror(int errnum);

	/**
	 * Maps the error number in {@code errnum} to a locale-dependent error message string and returns a pointer to it.
	 *
	 * @param errnum the error number
	 */
	public static String strerror(int errnum) {
		long __result = nstrerror(errnum);
		return memDecodeASCII(__result);
	}

}