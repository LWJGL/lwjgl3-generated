/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.dyncall;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to \"dyncall.h\".
 * 
 * <p>The dyncall library encapsulates architecture-, OS- and compiler-specific function call semantics in a virtual "bind argument parameters from left to
 * right and then call" interface allowing programmers to call C functions in a completely dynamic manner.</p>
 * 
 * <p>In other words, instead of calling a function directly, the dyncall library provides a mechanism to push the function parameters manually and to issue
 * the call afterwards.</p>
 * 
 * <p>Since the idea behind this concept is similar to call dispatching mechanisms of virtual machines, the object that can be dynamically loaded with
 * arguments, and then used to actually invoke the call, is called {@code CallVM}. It is possible to change the calling convention used by the
 * {@code CallVM} at run-time. Due to the fact that nearly every platform comes with one or more distinct calling conventions, the dyncall library project
 * intends to be a portable and open-source approach to the variety of compiler-specific binary interfaces, platform specific subtleties, and so on...</p>
 */
public class DynCall {

	/** Supported calling convention modes. */
	public static final int
		DC_CALL_C_DEFAULT            = 0,
		DC_CALL_C_ELLIPSIS           = 100,
		DC_CALL_C_ELLIPSIS_VARARGS   = 101,
		DC_CALL_C_X86_CDECL          = 1,
		DC_CALL_C_X86_WIN32_STD      = 2,
		DC_CALL_C_X86_WIN32_FAST_MS  = 3,
		DC_CALL_C_X86_WIN32_FAST_GNU = 4,
		DC_CALL_C_X86_WIN32_THIS_MS  = 5,
		DC_CALL_C_X86_WIN32_THIS_GNU = 6,
		DC_CALL_C_X64_WIN64          = 7,
		DC_CALL_C_X64_SYSV           = 8,
		DC_CALL_C_PPC32_DARWIN       = 9,
		DC_CALL_C_PPC32_OSX          = DC_CALL_C_PPC32_DARWIN,
		DC_CALL_C_ARM_ARM_EABI       = 10,
		DC_CALL_C_ARM_THUMB_EABI     = 11,
		DC_CALL_C_ARM_ARMHF          = 30,
		DC_CALL_C_MIPS32_EABI        = 12,
		DC_CALL_C_PPC32_SYSV         = 13,
		DC_CALL_C_PPC32_LINUX        = DC_CALL_C_PPC32_SYSV,
		DC_CALL_C_ARM_ARM            = 14,
		DC_CALL_C_ARM_THUMB          = 15,
		DC_CALL_C_MIPS32_O32         = 16,
		DC_CALL_C_MIPS64_N32         = 17,
		DC_CALL_C_MIPS64_N64         = 18,
		DC_CALL_C_X86_PLAN9          = 19,
		DC_CALL_C_SPARC32            = 20,
		DC_CALL_C_SPARC64            = 21,
		DC_CALL_C_ARM64              = 22,
		DC_CALL_C_PPC64              = 23,
		DC_CALL_C_PPC64_LINUX        = DC_CALL_C_PPC64,
		DC_CALL_SYS_DEFAULT          = 200,
		DC_CALL_SYS_X86_INT80H_LINUX = 201,
		DC_CALL_SYS_X86_INT80H_BSD   = 202,
		DC_CALL_SYS_PPC32            = 210,
		DC_CALL_SYS_PPC64            = 211;

	/** Error codes. */
	public static final int
		DC_ERROR_NONE             = 0,
		DC_ERROR_UNSUPPORTED_MODE = -1;

	/** Boolean values. */
	public static final int
		DC_TRUE  = 1,
		DC_FALSE = 0;

	/** Signatures. */
	public static final char
		DC_SIGCHAR_VOID      = 'v',
		DC_SIGCHAR_BOOL      = 'B',
		DC_SIGCHAR_CHAR      = 'c',
		DC_SIGCHAR_UCHAR     = 'C',
		DC_SIGCHAR_SHORT     = 's',
		DC_SIGCHAR_USHORT    = 'S',
		DC_SIGCHAR_INT       = 'i',
		DC_SIGCHAR_UINT      = 'I',
		DC_SIGCHAR_LONG      = 'j',
		DC_SIGCHAR_ULONG     = 'J',
		DC_SIGCHAR_LONGLONG  = 'l',
		DC_SIGCHAR_ULONGLONG = 'L',
		DC_SIGCHAR_FLOAT     = 'f',
		DC_SIGCHAR_DOUBLE    = 'd',
		DC_SIGCHAR_POINTER   = 'p',
		DC_SIGCHAR_STRING    = 'Z',
		DC_SIGCHAR_STRUCT    = 'T',
		DC_SIGCHAR_ENDARG    = ')';

	static { Library.initialize(); }

	protected DynCall() {
		throw new UnsupportedOperationException();
	}

	// --- [ dcNewCallVM ] ---

	/**
	 * Creates a new {@code CallVM} object.
	 * 
	 * <p>Use {@link #dcFree Free} to destroy the {@code CallVM} object.</p>
	 *
	 * @param size the max size of the internal stack that will be allocated and used to bind arguments to
	 */
	public static native long dcNewCallVM(long size);

	// --- [ dcFree ] ---

	/**
	 * Frees a {@code CallVM} object.
	 *
	 * @param vm a {@code CallVM} instance
	 */
	public static native void ndcFree(long vm);

	/**
	 * Frees a {@code CallVM} object.
	 *
	 * @param vm a {@code CallVM} instance
	 */
	public static void dcFree(long vm) {
		if ( CHECKS )
			checkPointer(vm);
		ndcFree(vm);
	}

	// --- [ dcReset ] ---

	/**
	 * Resets the internal stack of arguments and prepares it for a new call. This function should be called after setting the call mode (using {@link #dcMode Mode}), but
	 * prior to binding arguments to the {@code CallVM}. Use it also when reusing a {@code CallVM}, as arguments don’t get flushed automatically after a
	 * function call invocation.
	 * 
	 * <p>Note: you should also call this function after initial creation of the a {@code CallVM} object, as {@link #dcNewCallVM NewCallVM} doesn’t do this, implicitly.</p>
	 *
	 * @param vm a {@code CallVM} instance
	 */
	public static native void ndcReset(long vm);

	/**
	 * Resets the internal stack of arguments and prepares it for a new call. This function should be called after setting the call mode (using {@link #dcMode Mode}), but
	 * prior to binding arguments to the {@code CallVM}. Use it also when reusing a {@code CallVM}, as arguments don’t get flushed automatically after a
	 * function call invocation.
	 * 
	 * <p>Note: you should also call this function after initial creation of the a {@code CallVM} object, as {@link #dcNewCallVM NewCallVM} doesn’t do this, implicitly.</p>
	 *
	 * @param vm a {@code CallVM} instance
	 */
	public static void dcReset(long vm) {
		if ( CHECKS )
			checkPointer(vm);
		ndcReset(vm);
	}

	// --- [ dcMode ] ---

	/**
	 * Sets the calling convention to use.
	 * 
	 * <p>{@link #DC_CALL_C_DEFAULT CALL_C_DEFAULT} is the default standard C call on the target platform. It uses the standard C calling convention. {@link #DC_CALL_C_ELLIPSIS CALL_C_ELLIPSIS} is used for C
	 * ellipsis calls which allow to build up a variable argument list. On many platforms, there is only one C calling convention. The X86 platform provides a
	 * rich family of different calling conventions.</p>
	 *
	 * @param vm   a {@code CallVM} instance
	 * @param mode the calling convention. One of:<br><table><tr><td>{@link #DC_CALL_C_DEFAULT CALL_C_DEFAULT}</td><td>{@link #DC_CALL_C_ELLIPSIS CALL_C_ELLIPSIS}</td><td>{@link #DC_CALL_C_ELLIPSIS_VARARGS CALL_C_ELLIPSIS_VARARGS}</td><td>{@link #DC_CALL_C_X86_CDECL CALL_C_X86_CDECL}</td></tr><tr><td>{@link #DC_CALL_C_X86_WIN32_STD CALL_C_X86_WIN32_STD}</td><td>{@link #DC_CALL_C_X86_WIN32_FAST_MS CALL_C_X86_WIN32_FAST_MS}</td><td>{@link #DC_CALL_C_X86_WIN32_FAST_GNU CALL_C_X86_WIN32_FAST_GNU}</td><td>{@link #DC_CALL_C_X86_WIN32_THIS_MS CALL_C_X86_WIN32_THIS_MS}</td></tr><tr><td>{@link #DC_CALL_C_X86_WIN32_THIS_GNU CALL_C_X86_WIN32_THIS_GNU}</td><td>{@link #DC_CALL_C_X64_WIN64 CALL_C_X64_WIN64}</td><td>{@link #DC_CALL_C_X64_SYSV CALL_C_X64_SYSV}</td><td>{@link #DC_CALL_C_PPC32_DARWIN CALL_C_PPC32_DARWIN}</td></tr><tr><td>{@link #DC_CALL_C_PPC32_OSX CALL_C_PPC32_OSX}</td><td>{@link #DC_CALL_C_ARM_ARM_EABI CALL_C_ARM_ARM_EABI}</td><td>{@link #DC_CALL_C_ARM_THUMB_EABI CALL_C_ARM_THUMB_EABI}</td><td>{@link #DC_CALL_C_ARM_ARMHF CALL_C_ARM_ARMHF}</td></tr><tr><td>{@link #DC_CALL_C_MIPS32_EABI CALL_C_MIPS32_EABI}</td><td>{@link #DC_CALL_C_PPC32_SYSV CALL_C_PPC32_SYSV}</td><td>{@link #DC_CALL_C_PPC32_LINUX CALL_C_PPC32_LINUX}</td><td>{@link #DC_CALL_C_ARM_ARM CALL_C_ARM_ARM}</td></tr><tr><td>{@link #DC_CALL_C_ARM_THUMB CALL_C_ARM_THUMB}</td><td>{@link #DC_CALL_C_MIPS32_O32 CALL_C_MIPS32_O32}</td><td>{@link #DC_CALL_C_MIPS64_N32 CALL_C_MIPS64_N32}</td><td>{@link #DC_CALL_C_MIPS64_N64 CALL_C_MIPS64_N64}</td></tr><tr><td>{@link #DC_CALL_C_X86_PLAN9 CALL_C_X86_PLAN9}</td><td>{@link #DC_CALL_C_SPARC32 CALL_C_SPARC32}</td><td>{@link #DC_CALL_C_SPARC64 CALL_C_SPARC64}</td><td>{@link #DC_CALL_C_ARM64 CALL_C_ARM64}</td></tr><tr><td>{@link #DC_CALL_C_PPC64 CALL_C_PPC64}</td><td>{@link #DC_CALL_C_PPC64_LINUX CALL_C_PPC64_LINUX}</td><td>{@link #DC_CALL_SYS_DEFAULT CALL_SYS_DEFAULT}</td><td>{@link #DC_CALL_SYS_X86_INT80H_LINUX CALL_SYS_X86_INT80H_LINUX}</td></tr><tr><td>{@link #DC_CALL_SYS_X86_INT80H_BSD CALL_SYS_X86_INT80H_BSD}</td><td>{@link #DC_CALL_SYS_PPC32 CALL_SYS_PPC32}</td><td>{@link #DC_CALL_SYS_PPC64 CALL_SYS_PPC64}</td></tr></table>
	 */
	public static native void ndcMode(long vm, int mode);

	/**
	 * Sets the calling convention to use.
	 * 
	 * <p>{@link #DC_CALL_C_DEFAULT CALL_C_DEFAULT} is the default standard C call on the target platform. It uses the standard C calling convention. {@link #DC_CALL_C_ELLIPSIS CALL_C_ELLIPSIS} is used for C
	 * ellipsis calls which allow to build up a variable argument list. On many platforms, there is only one C calling convention. The X86 platform provides a
	 * rich family of different calling conventions.</p>
	 *
	 * @param vm   a {@code CallVM} instance
	 * @param mode the calling convention. One of:<br><table><tr><td>{@link #DC_CALL_C_DEFAULT CALL_C_DEFAULT}</td><td>{@link #DC_CALL_C_ELLIPSIS CALL_C_ELLIPSIS}</td><td>{@link #DC_CALL_C_ELLIPSIS_VARARGS CALL_C_ELLIPSIS_VARARGS}</td><td>{@link #DC_CALL_C_X86_CDECL CALL_C_X86_CDECL}</td></tr><tr><td>{@link #DC_CALL_C_X86_WIN32_STD CALL_C_X86_WIN32_STD}</td><td>{@link #DC_CALL_C_X86_WIN32_FAST_MS CALL_C_X86_WIN32_FAST_MS}</td><td>{@link #DC_CALL_C_X86_WIN32_FAST_GNU CALL_C_X86_WIN32_FAST_GNU}</td><td>{@link #DC_CALL_C_X86_WIN32_THIS_MS CALL_C_X86_WIN32_THIS_MS}</td></tr><tr><td>{@link #DC_CALL_C_X86_WIN32_THIS_GNU CALL_C_X86_WIN32_THIS_GNU}</td><td>{@link #DC_CALL_C_X64_WIN64 CALL_C_X64_WIN64}</td><td>{@link #DC_CALL_C_X64_SYSV CALL_C_X64_SYSV}</td><td>{@link #DC_CALL_C_PPC32_DARWIN CALL_C_PPC32_DARWIN}</td></tr><tr><td>{@link #DC_CALL_C_PPC32_OSX CALL_C_PPC32_OSX}</td><td>{@link #DC_CALL_C_ARM_ARM_EABI CALL_C_ARM_ARM_EABI}</td><td>{@link #DC_CALL_C_ARM_THUMB_EABI CALL_C_ARM_THUMB_EABI}</td><td>{@link #DC_CALL_C_ARM_ARMHF CALL_C_ARM_ARMHF}</td></tr><tr><td>{@link #DC_CALL_C_MIPS32_EABI CALL_C_MIPS32_EABI}</td><td>{@link #DC_CALL_C_PPC32_SYSV CALL_C_PPC32_SYSV}</td><td>{@link #DC_CALL_C_PPC32_LINUX CALL_C_PPC32_LINUX}</td><td>{@link #DC_CALL_C_ARM_ARM CALL_C_ARM_ARM}</td></tr><tr><td>{@link #DC_CALL_C_ARM_THUMB CALL_C_ARM_THUMB}</td><td>{@link #DC_CALL_C_MIPS32_O32 CALL_C_MIPS32_O32}</td><td>{@link #DC_CALL_C_MIPS64_N32 CALL_C_MIPS64_N32}</td><td>{@link #DC_CALL_C_MIPS64_N64 CALL_C_MIPS64_N64}</td></tr><tr><td>{@link #DC_CALL_C_X86_PLAN9 CALL_C_X86_PLAN9}</td><td>{@link #DC_CALL_C_SPARC32 CALL_C_SPARC32}</td><td>{@link #DC_CALL_C_SPARC64 CALL_C_SPARC64}</td><td>{@link #DC_CALL_C_ARM64 CALL_C_ARM64}</td></tr><tr><td>{@link #DC_CALL_C_PPC64 CALL_C_PPC64}</td><td>{@link #DC_CALL_C_PPC64_LINUX CALL_C_PPC64_LINUX}</td><td>{@link #DC_CALL_SYS_DEFAULT CALL_SYS_DEFAULT}</td><td>{@link #DC_CALL_SYS_X86_INT80H_LINUX CALL_SYS_X86_INT80H_LINUX}</td></tr><tr><td>{@link #DC_CALL_SYS_X86_INT80H_BSD CALL_SYS_X86_INT80H_BSD}</td><td>{@link #DC_CALL_SYS_PPC32 CALL_SYS_PPC32}</td><td>{@link #DC_CALL_SYS_PPC64 CALL_SYS_PPC64}</td></tr></table>
	 */
	public static void dcMode(long vm, int mode) {
		if ( CHECKS )
			checkPointer(vm);
		ndcMode(vm, mode);
	}

	// --- [ dcArgBool ] ---

	/**
	 * Binds a {@code bool} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static native void ndcArgBool(long vm, int value);

	/**
	 * Binds a {@code bool} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static void dcArgBool(long vm, int value) {
		if ( CHECKS )
			checkPointer(vm);
		ndcArgBool(vm, value);
	}

	// --- [ dcArgChar ] ---

	/**
	 * Binds a {@code char} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static native void ndcArgChar(long vm, byte value);

	/**
	 * Binds a {@code char} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static void dcArgChar(long vm, byte value) {
		if ( CHECKS )
			checkPointer(vm);
		ndcArgChar(vm, value);
	}

	// --- [ dcArgShort ] ---

	/**
	 * Binds a {@code short} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static native void ndcArgShort(long vm, short value);

	/**
	 * Binds a {@code short} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static void dcArgShort(long vm, short value) {
		if ( CHECKS )
			checkPointer(vm);
		ndcArgShort(vm, value);
	}

	// --- [ dcArgInt ] ---

	/**
	 * Binds an {@code int} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static native void ndcArgInt(long vm, int value);

	/**
	 * Binds an {@code int} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static void dcArgInt(long vm, int value) {
		if ( CHECKS )
			checkPointer(vm);
		ndcArgInt(vm, value);
	}

	// --- [ dcArgLong ] ---

	/**
	 * Binds a {@code long} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static native void ndcArgLong(long vm, int value);

	/**
	 * Binds a {@code long} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static void dcArgLong(long vm, int value) {
		if ( CHECKS )
			checkPointer(vm);
		ndcArgLong(vm, value);
	}

	// --- [ dcArgLongLong ] ---

	/**
	 * Binds a {@code long long} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static native void ndcArgLongLong(long vm, long value);

	/**
	 * Binds a {@code long long} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static void dcArgLongLong(long vm, long value) {
		if ( CHECKS )
			checkPointer(vm);
		ndcArgLongLong(vm, value);
	}

	// --- [ dcArgFloat ] ---

	/**
	 * Binds a {@code float} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static native void ndcArgFloat(long vm, float value);

	/**
	 * Binds a {@code float} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static void dcArgFloat(long vm, float value) {
		if ( CHECKS )
			checkPointer(vm);
		ndcArgFloat(vm, value);
	}

	// --- [ dcArgDouble ] ---

	/**
	 * Binds a {@code double} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static native void ndcArgDouble(long vm, double value);

	/**
	 * Binds a {@code double} argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static void dcArgDouble(long vm, double value) {
		if ( CHECKS )
			checkPointer(vm);
		ndcArgDouble(vm, value);
	}

	// --- [ dcArgPointer ] ---

	/**
	 * Binds a pointer argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static native void ndcArgPointer(long vm, long value);

	/**
	 * Binds a pointer argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param value the argument value
	 */
	public static void dcArgPointer(long vm, long value) {
		if ( CHECKS )
			checkPointer(vm);
		ndcArgPointer(vm, value);
	}

	// --- [ dcArgStruct ] ---

	/**
	 * Binds a struct argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param s     
	 * @param value the argument value
	 */
	public static native void ndcArgStruct(long vm, long s, long value);

	/**
	 * Binds a struct argument.
	 *
	 * @param vm    a {@code CallVM} instance
	 * @param s     
	 * @param value the argument value
	 */
	public static void dcArgStruct(long vm, long s, long value) {
		if ( CHECKS ) {
			checkPointer(vm);
			checkPointer(s);
			checkPointer(value);
		}
		ndcArgStruct(vm, s, value);
	}

	// --- [ dcCallVoid ] ---

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static native void ndcCallVoid(long vm, long funcptr);

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static void dcCallVoid(long vm, long funcptr) {
		if ( CHECKS ) {
			checkPointer(vm);
			checkPointer(funcptr);
		}
		ndcCallVoid(vm, funcptr);
	}

	// --- [ dcCallBool ] ---

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static native int ndcCallBool(long vm, long funcptr);

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static int dcCallBool(long vm, long funcptr) {
		if ( CHECKS ) {
			checkPointer(vm);
			checkPointer(funcptr);
		}
		return ndcCallBool(vm, funcptr);
	}

	// --- [ dcCallChar ] ---

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static native byte ndcCallChar(long vm, long funcptr);

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static byte dcCallChar(long vm, long funcptr) {
		if ( CHECKS ) {
			checkPointer(vm);
			checkPointer(funcptr);
		}
		return ndcCallChar(vm, funcptr);
	}

	// --- [ dcCallShort ] ---

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static native short ndcCallShort(long vm, long funcptr);

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static short dcCallShort(long vm, long funcptr) {
		if ( CHECKS ) {
			checkPointer(vm);
			checkPointer(funcptr);
		}
		return ndcCallShort(vm, funcptr);
	}

	// --- [ dcCallInt ] ---

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static native int ndcCallInt(long vm, long funcptr);

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static int dcCallInt(long vm, long funcptr) {
		if ( CHECKS ) {
			checkPointer(vm);
			checkPointer(funcptr);
		}
		return ndcCallInt(vm, funcptr);
	}

	// --- [ dcCallLong ] ---

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static native int ndcCallLong(long vm, long funcptr);

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static int dcCallLong(long vm, long funcptr) {
		if ( CHECKS ) {
			checkPointer(vm);
			checkPointer(funcptr);
		}
		return ndcCallLong(vm, funcptr);
	}

	// --- [ dcCallLongLong ] ---

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static native long ndcCallLongLong(long vm, long funcptr);

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static long dcCallLongLong(long vm, long funcptr) {
		if ( CHECKS ) {
			checkPointer(vm);
			checkPointer(funcptr);
		}
		return ndcCallLongLong(vm, funcptr);
	}

	// --- [ dcCallFloat ] ---

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static native float ndcCallFloat(long vm, long funcptr);

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static float dcCallFloat(long vm, long funcptr) {
		if ( CHECKS ) {
			checkPointer(vm);
			checkPointer(funcptr);
		}
		return ndcCallFloat(vm, funcptr);
	}

	// --- [ dcCallDouble ] ---

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static native double ndcCallDouble(long vm, long funcptr);

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static double dcCallDouble(long vm, long funcptr) {
		if ( CHECKS ) {
			checkPointer(vm);
			checkPointer(funcptr);
		}
		return ndcCallDouble(vm, funcptr);
	}

	// --- [ dcCallPointer ] ---

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static native long ndcCallPointer(long vm, long funcptr);

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm      a {@code CallVM} instance
	 * @param funcptr the function pointer
	 */
	public static long dcCallPointer(long vm, long funcptr) {
		if ( CHECKS ) {
			checkPointer(vm);
			checkPointer(funcptr);
		}
		return ndcCallPointer(vm, funcptr);
	}

	// --- [ dcCallStruct ] ---

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm          a {@code CallVM} instance
	 * @param funcptr     the function pointer
	 * @param s           
	 * @param returnValue 
	 */
	public static native void ndcCallStruct(long vm, long funcptr, long s, long returnValue);

	/**
	 * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
	 * 
	 * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
	 * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
	 *
	 * @param vm          a {@code CallVM} instance
	 * @param funcptr     the function pointer
	 * @param s           
	 * @param returnValue 
	 */
	public static void dcCallStruct(long vm, long funcptr, long s, long returnValue) {
		if ( CHECKS ) {
			checkPointer(vm);
			checkPointer(funcptr);
			checkPointer(s);
			checkPointer(returnValue);
		}
		ndcCallStruct(vm, funcptr, s, returnValue);
	}

	// --- [ dcGetError ] ---

	/**
	 * Returns the most recent error state code.
	 *
	 * @param vm a {@code CallVM} instance
	 */
	public static native int ndcGetError(long vm);

	/**
	 * Returns the most recent error state code.
	 *
	 * @param vm a {@code CallVM} instance
	 */
	public static int dcGetError(long vm) {
		if ( CHECKS )
			checkPointer(vm);
		return ndcGetError(vm);
	}

	// --- [ dcNewStruct ] ---

	/**
	 * Creates a new struct type.
	 *
	 * @param fieldCount the number of fields
	 * @param alignment  a custom struct alignment, or 0 to calculate automatically
	 */
	public static native long dcNewStruct(long fieldCount, int alignment);

	// --- [ dcStructField ] ---

	/**
	 * Adds a field to the specified struct.
	 *
	 * @param s           the struct
	 * @param type        the field type
	 * @param alignment   a custom field alignment, or 0 to calculate automatically
	 * @param arrayLength 1 or a higher value if the field is an array
	 */
	public static native void ndcStructField(long s, int type, int alignment, long arrayLength);

	/**
	 * Adds a field to the specified struct.
	 *
	 * @param s           the struct
	 * @param type        the field type
	 * @param alignment   a custom field alignment, or 0 to calculate automatically
	 * @param arrayLength 1 or a higher value if the field is an array
	 */
	public static void dcStructField(long s, int type, int alignment, long arrayLength) {
		if ( CHECKS )
			checkPointer(s);
		ndcStructField(s, type, alignment, arrayLength);
	}

	// --- [ dcSubStruct ] ---

	/**
	 * Adds a nested struct to the specified struct
	 *
	 * @param s           the struct
	 * @param fieldCount  the number of fields in the nested struct
	 * @param alignment   a custom nested struct alignment, or 0 to calculate automatically
	 * @param arrayLength 1 or a higher value if the nested struct is an array
	 */
	public static native void ndcSubStruct(long s, long fieldCount, int alignment, long arrayLength);

	/**
	 * Adds a nested struct to the specified struct
	 *
	 * @param s           the struct
	 * @param fieldCount  the number of fields in the nested struct
	 * @param alignment   a custom nested struct alignment, or 0 to calculate automatically
	 * @param arrayLength 1 or a higher value if the nested struct is an array
	 */
	public static void dcSubStruct(long s, long fieldCount, int alignment, long arrayLength) {
		if ( CHECKS )
			checkPointer(s);
		ndcSubStruct(s, fieldCount, alignment, arrayLength);
	}

	// --- [ dcCloseStruct ] ---

	/**
	 * Completes the struct definition.
	 *
	 * @param s the struct to close
	 */
	public static native void ndcCloseStruct(long s);

	/**
	 * Completes the struct definition.
	 *
	 * @param s the struct to close
	 */
	public static void dcCloseStruct(long s) {
		if ( CHECKS )
			checkPointer(s);
		ndcCloseStruct(s);
	}

	// --- [ dcStructSize ] ---

	/**
	 * Returns the size, in bytes, of the specified struct.
	 *
	 * @param s the struct
	 */
	public static native long ndcStructSize(long s);

	/**
	 * Returns the size, in bytes, of the specified struct.
	 *
	 * @param s the struct
	 */
	public static long dcStructSize(long s) {
		if ( CHECKS )
			checkPointer(s);
		return ndcStructSize(s);
	}

	// --- [ dcStructAlignment ] ---

	/**
	 * Returns the alignment, in bytes, of the specified struct.
	 *
	 * @param s the struct
	 */
	public static native long ndcStructAlignment(long s);

	/**
	 * Returns the alignment, in bytes, of the specified struct.
	 *
	 * @param s the struct
	 */
	public static long dcStructAlignment(long s) {
		if ( CHECKS )
			checkPointer(s);
		return ndcStructAlignment(s);
	}

	// --- [ dcFreeStruct ] ---

	/**
	 * Frees the specified struct object.
	 *
	 * @param s the struct to free
	 */
	public static native void ndcFreeStruct(long s);

	/**
	 * Frees the specified struct object.
	 *
	 * @param s the struct to free
	 */
	public static void dcFreeStruct(long s) {
		if ( CHECKS )
			checkPointer(s);
		ndcFreeStruct(s);
	}

	// --- [ dcDefineStruct ] ---

	/**
	 * Creates a new struct type using a signature string.
	 *
	 * @param signature the struct signature
	 */
	public static native long ndcDefineStruct(long signature);

	/**
	 * Creates a new struct type using a signature string.
	 *
	 * @param signature the struct signature
	 */
	public static long dcDefineStruct(ByteBuffer signature) {
		return ndcDefineStruct(memAddress(signature));
	}

}