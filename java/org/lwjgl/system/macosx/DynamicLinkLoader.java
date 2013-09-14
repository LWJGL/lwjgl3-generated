/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to <dlfcn.h>. */
public final class DynamicLinkLoader {

	/** The {@code mode} argument to {@link #dlopen} contains one of the following: */
	public static final int
		RTLD_LAZY     = 0x1,
		RTLD_NOW      = 0x2,
		RTLD_LOCAL    = 0x4,
		RTLD_GLOBAL   = 0x8,
		RTLD_NOLOAD   = 0x10,
		RTLD_NODELETE = 0x80,
		RTLD_FIRST    = 0x100;

	private DynamicLinkLoader() {}

	// --- [ dlopen ] ---

	/** JNI method for {@link #dlopen} */
	public static native long ndlopen(long path, int mode);

	/**
	 * Loads and links a dynamic library or bundle.
	 *
	 * @param path path to the image to open
	 * @param mode specifies when the loaded image’s external symbols are bound to their definitions in dependent libraries (lazy or at load time) and the visibility
	 *             of the image's exported symbols (global or local). The value of this parameter is made up by ORing one binding behavior value with one visibility
	 *             specification value. One of:<p/>{@link #RTLD_LAZY}, {@link #RTLD_NOW}, {@link #RTLD_LOCAL}, {@link #RTLD_GLOBAL}, {@link #RTLD_NOLOAD}, {@link #RTLD_NODELETE}, {@link #RTLD_FIRST}
	 */
	public static long dlopen(ByteBuffer path, int mode) {
		if ( LWJGLUtil.CHECKS )
			if ( path != null ) checkNT1(path);
		return ndlopen(memAddressSafe(path), mode);
	}

	/** CharSequence version of: {@link #dlopen} */
	public static long dlopen(CharSequence path, int mode) {
		return ndlopen(memAddressSafe(memEncodeASCII(path)), mode);
	}

	// --- [ dlerror ] ---

	/** JNI method for {@link #dlerror} */
	public static native long ndlerror();

	/**
	 * Returns a human readable string describing the most recent error that occurred from {@link #dlopen}, {@link #dlsym} or {@link #dlclose} since the last
	 * call to {@code dlerror()}. It returns {@code NULL} if no errors have occurred since initialization or since it was last called.
	 */
	public static String dlerror() {
		long __result = ndlerror();
		return memDecodeASCII(memByteBufferNT1(__result));
	}

	// --- [ dlsym ] ---

	/** JNI method for {@link #dlsym} */
	public static native long ndlsym(long handle, long name);

	/**
	 * Returns the address of a symbol.
	 *
	 * @param handle a handle obtained by a call to {@link #dlopen}, or a special handle. If the handle was obtained by a call to {@link #dlopen}, it must not have been
	 *               closed with a call to {@link #dlclose}. These are the possible special-handle values: RTLD_DEFAULT, and RTLD_NEXT.
	 * @param name   the null-terminated character string containing the C name of the symbol being sought
	 */
	public static long dlsym(long handle, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(handle);
			checkNT1(name);
		}
		return ndlsym(handle, memAddress(name));
	}

	/** CharSequence version of: {@link #dlsym} */
	public static long dlsym(long handle, CharSequence name) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(handle);
		return ndlsym(handle, memAddress(memEncodeASCII(name)));
	}

	// --- [ dlclose ] ---

	/** JNI method for {@link #dlclose} */
	public static native int ndlclose(long handle);

	/**
	 * Closes a dynamic library or bundle.
	 * <p/>
	 * This function decreases the reference count of the image referenced by handle. When the reference count for handle becomes 0, the termination routines
	 * in the image are called, and the image is removed from the address space of the current process. After that point, handle is rendered invalid.
	 *
	 * @param handle a handle obtained through a call to {@link #dlopen}.
	 */
	public static int dlclose(long handle) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(handle);
		return ndlclose(handle);
	}

}