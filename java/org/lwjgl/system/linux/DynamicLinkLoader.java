/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** Native bindings to <dlfcn.h>. */
public final class DynamicLinkLoader {

	/** The {@code mode} argument to {@link #dlopen} contains one of the following. */
	public static final int
		RTLD_LAZY         = 0x1,
		RTLD_NOW          = 0x2,
		RTLD_BINDING_MASK = 0x3,
		RTLD_NOLOAD       = 0x4,
		RTLD_DEEPBIND     = 0x8;

	/**
	 * If the following bit is set in the {@code mode} argument to {@link #dlopen}, the symbols of the loaded object and its dependencies are made visible as
	 * if the object were linked directly into the program.
	 */
	public static final int RTLD_GLOBAL = 0x100;

	/**
	 * Unix98 demands the following flag which is the inverse to {@link #RTLD_GLOBAL}. The implementation does this by default and so we can define the value
	 * to zero.
	 */
	public static final int RTLD_LOCAL = 0x0;

	/** Do not delete object when closed. */
	public static final int RTLD_NODELETE = 0x1000;

	static { LWJGLUtil.initialize(); }

	private DynamicLinkLoader() {}

	// --- [ dlopen ] ---

	/** JNI method for {@link #dlopen} */
	@JavadocExclude
	public static native long ndlopen(long filename, int mode);

	/**
	 * Loads the dynamic library file named by the null-terminated string {@code filename} and returns an opaque "handle" for the dynamic library. If
	 * {@code filename} is {@code NULL}, then the returned handle is for the main program.
	 *
	 * @param filename the name of the dynamic library to open, or {@code NULL}
	 * @param mode     a bitfield. One or more of:<br>{@link #RTLD_LAZY}, {@link #RTLD_NOW}, {@link #RTLD_BINDING_MASK}, {@link #RTLD_NOLOAD}, {@link #RTLD_DEEPBIND}, {@link #RTLD_GLOBAL}, {@link #RTLD_LOCAL}, {@link #RTLD_NODELETE}
	 */
	public static long dlopen(ByteBuffer filename, int mode) {
		if ( LWJGLUtil.CHECKS )
			if ( filename != null ) checkNT1(filename);
		return ndlopen(memAddressSafe(filename), mode);
	}

	/** CharSequence version of: {@link #dlopen} */
	public static long dlopen(CharSequence filename, int mode) {
		APIBuffer __buffer = apiBuffer();
		int filenameEncoded = __buffer.stringParamASCII(filename, true);
		return ndlopen(__buffer.addressSafe(filename, filenameEncoded), mode);
	}

	// --- [ dlerror ] ---

	/** JNI method for {@link #dlerror} */
	@JavadocExclude
	public static native long ndlerror();

	/**
	 * Returns a human readable string describing the most recent error that occurred from {@link #dlopen}, {@link #dlsym} or {@link #dlclose} since
	 * the last call to {@code dlerror()}. It returns {@code NULL} if no errors have occurred since initialization or since it was last called.
	 */
	public static String dlerror() {
		long __result = ndlerror();
		return memDecodeASCII(__result);
	}

	// --- [ dlsym ] ---

	/** JNI method for {@link #dlsym} */
	@JavadocExclude
	public static native long ndlsym(long handle, long name);

	/**
	 * Takes a "handle" of a dynamic library returned by {@link #dlopen} and the null-terminated symbol name, returning the address where that symbol is loaded
	 * into memory. If the symbol is not found, in the specified library or any of the libraries that were automatically loaded by {@link #dlopen} when that
	 * library was loaded, {@code dlsym()} returns {@code NULL}.
	 *
	 * @param handle the dynamic library handle
	 * @param name   the symbol name
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
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return ndlsym(handle, __buffer.address(nameEncoded));
	}

	// --- [ dlclose ] ---

	/** JNI method for {@link #dlclose} */
	@JavadocExclude
	public static native int ndlclose(long handle);

	/**
	 * Decrements the reference count on the dynamic library handle handle. If the reference count drops to zero and no other loaded libraries use symbols in
	 * it, then the dynamic library is unloaded.
	 *
	 * @param handle the dynamic library to close
	 */
	public static int dlclose(long handle) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(handle);
		return ndlclose(handle);
	}

}