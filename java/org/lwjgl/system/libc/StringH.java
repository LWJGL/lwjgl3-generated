/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libc;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to string.h. */
public class StringH {

	static { Library.initialize(); }

	protected StringH() {
		throw new UnsupportedOperationException();
	}

	// --- [ strerror ] ---

	/**
	 * Maps the error number in {@code errnum} to a locale-dependent error message string and returns a pointer to it.
	 *
	 * @param errnum the error number
	 */
	public static native long nstrerror(int errnum);

	/**
	 * Maps the error number in {@code errnum} to a locale-dependent error message string and returns a pointer to it.
	 *
	 * @param errnum the error number
	 */
	public static String strerror(int errnum) {
		long __result = nstrerror(errnum);
		return memASCII(__result);
	}

}