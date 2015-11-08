/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to WinBase.h. */
public class WinBase {

	/** BOOL return values. */
	public static final int
		FALSE = 0x0,
		TRUE  = 0x1;

	static { Library.initialize(); }

	@JavadocExclude
	protected WinBase() {
		throw new UnsupportedOperationException();
	}

	// --- [ GetLastError ] ---

	/**
	 * Retrieves the calling thread's last-error code value. The last-error code is maintained on a per-thread basis. Multiple threads do not overwrite each
	 * other's last-error code.
	 * 
	 * <p><b>LWJGL note</b>: This function cannot be used after another JNI call to a Windows function, because the last error resets before that call returns.
	 * For this reason, LWJGL stores the last error in thread-local storage, you can use {@link #getLastError} to access it.</p>
	 */
	public static native int GetLastError();

	// --- [ getLastError ] ---

	/**
	 * Retrieves the calling thread's last-error code value. The last-error code is maintained on a per-thread basis. Multiple threads do not overwrite each
	 * other's last-error code.
	 * 
	 * <p><b>LWJGL note</b>: This method has a meaningful value only after another LWJGL JNI call. It does not call {@code GetLastError()} from WinBase.h, it
	 * returns the thread-local error code stored by a previous JNI call.</p>
	 */
	public static native int getLastError();

	// --- [ GetModuleHandle ] ---

	/** JNI method for {@link #GetModuleHandle} */
	@JavadocExclude
	public static native long nGetModuleHandle(long moduleName);

	/**
	 * Retrieves a module handle for the specified module. The module must have been loaded by the calling process.
	 *
	 * @param moduleName the name of the loaded module (either a .dll or .exe file). If the file name extension is omitted, the default library extension .dll is appended.
	 *                   The file name string can include a trailing point character (.) to indicate that the module name has no extension. The string does not have to
	 *                   specify a path. When specifying a path, be sure to use backslashes (\), not forward slashes (/). The name is compared (case independently) to the
	 *                   names of modules currently mapped into the address space of the calling process.
	 *                   
	 *                   <p>If this parameter is {@code NULL}, {@code GetModuleHandle} returns a handle to the file used to create the calling process (.exe file).</p>
	 */
	public static long GetModuleHandle(ByteBuffer moduleName) {
		if ( CHECKS )
			if ( moduleName != null ) checkNT2(moduleName);
		return nGetModuleHandle(memAddressSafe(moduleName));
	}

	/** CharSequence version of: {@link #GetModuleHandle} */
	public static long GetModuleHandle(CharSequence moduleName) {
		APIBuffer __buffer = apiBuffer();
		int moduleNameEncoded = __buffer.stringParamUTF16(moduleName, true);
		return nGetModuleHandle(__buffer.addressSafe(moduleName, moduleNameEncoded));
	}

	// --- [ LoadLibrary ] ---

	/** JNI method for {@link #LoadLibrary} */
	@JavadocExclude
	public static native long nLoadLibrary(long name);

	/**
	 * Loads the specified module into the address space of the calling process. The specified module may cause other modules to be loaded.
	 *
	 * @param name the name of the module. This can be either a library module (a .dll file) or an executable module (an .exe file). The name specified is the file
	 *             name of the module and is not related to the name stored in the library module itself, as specified by the LIBRARY keyword in the module-definition
	 *             (.def) file.
	 *             
	 *             <p>If the string specifies a full path, the function searches only that path for the module.</p>
	 *             
	 *             <p>If the string specifies a relative path or a module name without a path, the function uses a standard search strategy to find the module.</p>
	 *             
	 *             <p>If the function cannot find the module, the function fails. When specifying a path, be sure to use backslashes (\), not forward slashes (/).</p>
	 *             
	 *             <p>If the string specifies a module name without a path and the file name extension is omitted, the function appends the default library extension .dll
	 *             to the module name. To prevent the function from appending.dll to the module name, include a trailing point character (.) in the module name string.</p>
	 */
	public static long LoadLibrary(ByteBuffer name) {
		if ( CHECKS )
			checkNT2(name);
		return nLoadLibrary(memAddress(name));
	}

	/** CharSequence version of: {@link #LoadLibrary} */
	public static long LoadLibrary(CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF16(name, true);
		return nLoadLibrary(__buffer.address(nameEncoded));
	}

	// --- [ GetProcAddress ] ---

	/** JNI method for {@link #GetProcAddress} */
	@JavadocExclude
	public static native long nGetProcAddress(long handle, long name);

	/**
	 * Retrieves the address of an exported function or variable from the specified dynamic-link library (DLL).
	 *
	 * @param handle a handle to the DLL module that contains the function or variable
	 * @param name   the function or variable name, or the function's ordinal value. If this parameter is an ordinal value, it must be in the low-order word; the
	 *               high-order word must be zero.
	 */
	public static long GetProcAddress(long handle, ByteBuffer name) {
		if ( CHECKS ) {
			checkPointer(handle);
			checkNT1(name);
		}
		return nGetProcAddress(handle, memAddress(name));
	}

	/** CharSequence version of: {@link #GetProcAddress} */
	public static long GetProcAddress(long handle, CharSequence name) {
		if ( CHECKS )
			checkPointer(handle);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nGetProcAddress(handle, __buffer.address(nameEncoded));
	}

	// --- [ FreeLibrary ] ---

	/** JNI method for {@link #FreeLibrary} */
	@JavadocExclude
	public static native int nFreeLibrary(long handle);

	/**
	 * Frees the loaded dynamic-link library (DLL) module and, if necessary, decrements its reference count. When the reference count reaches zero, the module
	 * is unloaded from the address space of the calling process and the handle is no longer valid.
	 *
	 * @param handle a handle to the loaded library module
	 */
	public static int FreeLibrary(long handle) {
		if ( CHECKS )
			checkPointer(handle);
		return nFreeLibrary(handle);
	}

}