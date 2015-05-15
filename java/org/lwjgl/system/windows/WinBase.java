/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** Native bindings to WinBase.h. */
public final class WinBase {

	/** BOOL return values. */
	public static final int
		FALSE = 0x0,
		TRUE  = 0x1;

	/** Global Memory flags. */
	public static final int
		GMEM_FIXED          = 0x0,
		GMEM_MOVEABLE       = 0x2,
		GMEM_NOCOMPACT      = 0x10,
		GMEM_NODISCARD      = 0x20,
		GMEM_ZEROINIT       = 0x40,
		GMEM_MODIFY         = 0x80,
		GMEM_DISCARDABLE    = 0x100,
		GMEM_NOT_BANKED     = 0x1000,
		GMEM_SHARE          = 0x2000,
		GMEM_DDESHARE       = 0x2000,
		GMEM_NOTIFY         = 0x4000,
		GMEM_LOWER          = GMEM_NOT_BANKED,
		GMEM_VALID_FLAGS    = 0x7F72,
		GMEM_INVALID_HANDLE = 0x8000,
		GHND                = GMEM_MOVEABLE | GMEM_ZEROINIT,
		GPTR                = GMEM_FIXED | GMEM_ZEROINIT;

	static { LWJGLUtil.initialize(); }

	private WinBase() {}

	// --- [ GetLastError ] ---

	/**
	 * Retrieves the calling thread's last-error code value. The last-error code is maintained on a per-thread basis. Multiple threads do not overwrite each
	 * other's last-error code.
	 */
	public static native int GetLastError();

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
		if ( LWJGLUtil.CHECKS )
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
		if ( LWJGLUtil.CHECKS )
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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(handle);
			checkNT1(name);
		}
		return nGetProcAddress(handle, memAddress(name));
	}

	/** CharSequence version of: {@link #GetProcAddress} */
	public static long GetProcAddress(long handle, CharSequence name) {
		if ( LWJGLUtil.CHECKS )
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
		if ( LWJGLUtil.CHECKS )
			checkPointer(handle);
		return nFreeLibrary(handle);
	}

	// --- [ QueryPerformanceFrequency ] ---

	/** JNI method for {@link #QueryPerformanceFrequency} */
	@JavadocExclude
	public static native int nQueryPerformanceFrequency(long frequency);

	/**
	 * Retrieves the frequency of the high-resolution performance counter, if one exists. The frequency cannot change while the system is running.
	 *
	 * @param frequency a pointer to a variable that receives the current performance-counter frequency, in counts per second. If the installed hardware does not support a
	 *                  high-resolution performance counter, this parameter can be zero.
	 */
	public static int QueryPerformanceFrequency(ByteBuffer frequency) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(frequency, LARGE_INTEGER.SIZEOF);
		return nQueryPerformanceFrequency(memAddress(frequency));
	}

	// --- [ QueryPerformanceCounter ] ---

	/** JNI method for {@link #QueryPerformanceCounter} */
	@JavadocExclude
	public static native int nQueryPerformanceCounter(long frequency);

	/**
	 * Retrieves the current value of the high-resolution performance counter.
	 * 
	 * <p>On a multiprocessor computer, it should not matter which processor is called. However, you can get different results on different processors due to bugs
	 * in the basic input/output system (BIOS) or the hardware abstraction layer (HAL). To specify processor affinity for a thread, use the
	 * {@link Kernel32#SetThreadAffinityMask} function.</p>
	 *
	 * @param frequency a pointer to a variable that receives the current performance-counter value, in counts.
	 */
	public static int QueryPerformanceCounter(ByteBuffer frequency) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(frequency, LARGE_INTEGER.SIZEOF);
		return nQueryPerformanceCounter(memAddress(frequency));
	}

	// --- [ GlobalAlloc ] ---

	/**
	 * Allocates the specified number of bytes from the heap.
	 *
	 * @param flags the memory allocation attributes. If zero is specified, the default is {@link #GMEM_FIXED}. One of:<br>{@link #GMEM_FIXED}, {@link #GMEM_MOVEABLE}, {@link #GMEM_NOCOMPACT}, {@link #GMEM_NODISCARD}, {@link #GMEM_ZEROINIT}, {@link #GMEM_MODIFY}, {@link #GMEM_DISCARDABLE}, {@link #GMEM_NOT_BANKED}, {@link #GMEM_SHARE}, {@link #GMEM_DDESHARE}, {@link #GMEM_NOTIFY}, {@link #GMEM_LOWER}, {@link #GMEM_VALID_FLAGS}, {@link #GMEM_INVALID_HANDLE}, {@link #GHND}, {@link #GPTR}
	 * @param bytes the number of bytes to allocate. If this parameter is zero and the {@code flags} parameter specifies {@link #GMEM_MOVEABLE}, the function returns a
	 *              handle to a memory object that is marked as discarded.
	 */
	public static native long GlobalAlloc(int flags, long bytes);

	// --- [ GlobalLock ] ---

	/** JNI method for {@link #GlobalLock} */
	@JavadocExclude
	public static native long nGlobalLock(long hMem);

	/**
	 * Locks a global memory object and returns a pointer to the first byte of the object's memory block.
	 *
	 * @param hMem a handle to the global memory object
	 */
	public static long GlobalLock(long hMem) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hMem);
		return nGlobalLock(hMem);
	}

	// --- [ GlobalUnlock ] ---

	/** JNI method for {@link #GlobalUnlock} */
	@JavadocExclude
	public static native int nGlobalUnlock(long hMem);

	/**
	 * Decrements the lock count associated with a memory object that was allocated with {@link #GMEM_MOVEABLE}. This function has no effect on memory objects
	 * allocated with {@link #GMEM_FIXED}.
	 *
	 * @param hMem a handle to the global memory object
	 */
	public static int GlobalUnlock(long hMem) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hMem);
		return nGlobalUnlock(hMem);
	}

	// --- [ GlobalFree ] ---

	/** JNI method for {@link #GlobalFree} */
	@JavadocExclude
	public static native long nGlobalFree(long hMem);

	/**
	 * Frees the specified global memory object and invalidates its handle.
	 *
	 * @param hMem a handle to the global memory object.
	 *
	 * @return {@code NULL} if the function succeeds. If the function fails, the return value is equal to a handle to the global memory object.
	 */
	public static long GlobalFree(long hMem) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hMem);
		return nGlobalFree(hMem);
	}

}