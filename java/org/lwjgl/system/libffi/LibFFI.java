/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libffi;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

import static org.lwjgl.system.libffi.LibFFIConstants.*;

/**
 * Native bindings to the <a href="https://sourceware.org/libffi">libffi</a> library.
 * 
 * <p>The foreign function interface provides a mechanism by which a function can generate a call to another function at runtime without requiring knowledge
 * of the called function's interface at compile time. This enables use of native libraries that LWJGL does not provide bindings for.</p>
 * 
 * <p>libffi assumes that you have a pointer to the function you wish to call and that you know the number and types of arguments to pass it, as well as the
 * return type of the function.</p>
 * 
 * <p>The first thing you must do is create an {@link FFICIF} object that matches the signature of the function you wish to call. This is a separate step
 * because it is common to make multiple calls using a single {@link FFICIF}. The {@code cif} in {@code ffi_cif} stands for Call InterFace. To prepare a
 * call interface object, use the function {@link #ffi_prep_cif prep_cif}. To call a function using an initialized {@code ffi_cif}, use the {@link #ffi_call call} function.</p>
 * 
 * <p><strong>LWJGL note</strong>: The closure and raw APIs are not exposed.</p>
 */
public class LibFFI {

	/** Types used to create custom {@link FFICIF}. */
	public static final short
		FFI_TYPE_VOID       = 0,
		FFI_TYPE_INT        = 1,
		FFI_TYPE_FLOAT      = 2,
		FFI_TYPE_DOUBLE     = 3,
		FFI_TYPE_LONGDOUBLE = FFI_TYPE_DOUBLE(),
		FFI_TYPE_UINT8      = 5,
		FFI_TYPE_SINT8      = 6,
		FFI_TYPE_UINT16     = 7,
		FFI_TYPE_SINT16     = 8,
		FFI_TYPE_UINT32     = 9,
		FFI_TYPE_SINT32     = 10,
		FFI_TYPE_UINT64     = 11,
		FFI_TYPE_SINT64     = 12,
		FFI_TYPE_STRUCT     = 13,
		FFI_TYPE_POINTER    = 14;

	/** ABI enumeration. */
	public static final int
		FFI_SYSV        = 0x1,
		FFI_WIN64       = 0x1,
		FFI_UNIX64      = 0x2,
		FFI_STDCALL     = Platform.get() == Platform.WINDOWS ? 0x2 : 0x5,
		FFI_THISCALL    = 0x3,
		FFI_FASTCALL    = 0x4,
		FFI_MS_CDECL    = 0x5,
		FFI_DEFAULT_ABI = FFI_DEFAULT_ABI();

	/** Status codes. */
	public static final int
		FFI_OK          = 0,
		FFI_BAD_TYPEDEF = 1,
		FFI_BAD_ABI     = 2;

	/** Data types. These are the addresses of libffi's predefined {@link FFIType} structs. */
	public static final FFIType
		ffi_type_void       = ffi_type_void(),
		ffi_type_uint8      = ffi_type_uint8(),
		ffi_type_sint8      = ffi_type_sint8(),
		ffi_type_uint16     = ffi_type_uint16(),
		ffi_type_sint16     = ffi_type_sint16(),
		ffi_type_uint32     = ffi_type_uint32(),
		ffi_type_sint32     = ffi_type_sint32(),
		ffi_type_uint64     = ffi_type_uint64(),
		ffi_type_sint64     = ffi_type_sint64(),
		ffi_type_uchar      = ffi_type_uchar(),
		ffi_type_schar      = ffi_type_schar(),
		ffi_type_sshort     = ffi_type_sshort(),
		ffi_type_ushort     = ffi_type_ushort(),
		ffi_type_uint       = ffi_type_uint(),
		ffi_type_sint       = ffi_type_sint(),
		ffi_type_ulong      = ffi_type_ulong(),
		ffi_type_slong      = ffi_type_slong(),
		ffi_type_float      = ffi_type_float(),
		ffi_type_double     = ffi_type_double(),
		ffi_type_longdouble = ffi_type_longdouble(),
		ffi_type_pointer    = ffi_type_pointer();

	static { Library.initialize(); }

	protected LibFFI() {
		throw new UnsupportedOperationException();
	}

	// --- [ ffi_prep_cif ] ---

	/**
	 * Prepares an {@link FFICIF} structure for use with {@link #ffi_call call}.
	 *
	 * @param cif    the {@link FFICIF} structure to prepare
	 * @param abi    the ABI to use; normally {@link #FFI_DEFAULT_ABI DEFAULT_ABI} is what you want. One of:<br><table><tr><td>{@link #FFI_SYSV SYSV}</td><td>{@link #FFI_WIN64 WIN64}</td><td>{@link #FFI_UNIX64 UNIX64}</td><td>{@link #FFI_STDCALL STDCALL}</td><td>{@link #FFI_THISCALL THISCALL}</td><td>{@link #FFI_FASTCALL FASTCALL}</td><td>{@link #FFI_MS_CDECL MS_CDECL}</td><td>{@link #FFI_DEFAULT_ABI DEFAULT_ABI}</td></tr></table>
	 * @param nargs  the number of arguments that this function accepts
	 * @param rtype  a pointer to an {@link FFIType} structure that describes the data type, size and alignment of the return value
	 * @param atypes an array of {@code nargs} pointers to {@link FFIType} structures that describe the data type, size and alignment of each argument
	 *
	 * @return Upon successful completion, {@code ffi_prep_cif} returns {@link #FFI_OK OK}. It will return {@link #FFI_BAD_TYPEDEF BAD_TYPEDEF} if {@code cif} is {@code NULL} or
	 *         {@code atypes} or {@code rtype} is malformed. If {@code abi} does not refer to a valid ABI, {@link #FFI_BAD_ABI BAD_ABI} will be returned.
	 */
	public static native int nffi_prep_cif(long cif, int abi, int nargs, long rtype, long atypes);

	/**
	 * Prepares an {@link FFICIF} structure for use with {@link #ffi_call call}.
	 *
	 * @param cif    the {@link FFICIF} structure to prepare
	 * @param abi    the ABI to use; normally {@link #FFI_DEFAULT_ABI DEFAULT_ABI} is what you want. One of:<br><table><tr><td>{@link #FFI_SYSV SYSV}</td><td>{@link #FFI_WIN64 WIN64}</td><td>{@link #FFI_UNIX64 UNIX64}</td><td>{@link #FFI_STDCALL STDCALL}</td><td>{@link #FFI_THISCALL THISCALL}</td><td>{@link #FFI_FASTCALL FASTCALL}</td><td>{@link #FFI_MS_CDECL MS_CDECL}</td><td>{@link #FFI_DEFAULT_ABI DEFAULT_ABI}</td></tr></table>
	 * @param rtype  a pointer to an {@link FFIType} structure that describes the data type, size and alignment of the return value
	 * @param atypes an array of {@code nargs} pointers to {@link FFIType} structures that describe the data type, size and alignment of each argument
	 *
	 * @return Upon successful completion, {@code ffi_prep_cif} returns {@link #FFI_OK OK}. It will return {@link #FFI_BAD_TYPEDEF BAD_TYPEDEF} if {@code cif} is {@code NULL} or
	 *         {@code atypes} or {@code rtype} is malformed. If {@code abi} does not refer to a valid ABI, {@link #FFI_BAD_ABI BAD_ABI} will be returned.
	 */
	public static int ffi_prep_cif(FFICIF cif, int abi, FFIType rtype, PointerBuffer atypes) {
		return nffi_prep_cif(cif.address(), abi, atypes == null ? 0 : atypes.remaining(), rtype.address(), memAddressSafe(atypes));
	}

	// --- [ ffi_prep_cif_var ] ---

	/**
	 * Prepares an {@link FFICIF} structure for use with {@link #ffi_call call} for variadic functions.
	 * 
	 * <p>Note that, different cif's must be prepped for calls to the same function when different numbers of arguments are passed.</p>
	 * 
	 * <p>Also note that a call to {@code ffi_prep_cif_var} with {@code nfixedargs == ntotalargs} is NOT equivalent to a call to {@link #ffi_prep_cif prep_cif}.</p>
	 *
	 * @param cif        the {@link FFICIF} structure to prepare
	 * @param abi        the calling convention to use. One of:<br><table><tr><td>{@link #FFI_SYSV SYSV}</td><td>{@link #FFI_WIN64 WIN64}</td><td>{@link #FFI_UNIX64 UNIX64}</td><td>{@link #FFI_STDCALL STDCALL}</td><td>{@link #FFI_THISCALL THISCALL}</td><td>{@link #FFI_FASTCALL FASTCALL}</td><td>{@link #FFI_MS_CDECL MS_CDECL}</td><td>{@link #FFI_DEFAULT_ABI DEFAULT_ABI}</td></tr></table>
	 * @param nfixedargs the number of fixed arguments, prior to any variadic arguments. It must be greater than zero.
	 * @param ntotalargs the total number of arguments, including variadic and fixed arguments
	 * @param rtype      a pointer to an {@link FFIType} structure that describes the data type, size and alignment of the return value
	 * @param atypes     an array of {@code ntotalargs} pointers to {@link FFIType} structures that describe the data type, size and alignment of each argument
	 *
	 * @return Upon successful completion, {@code ffi_prep_cif} returns {@link #FFI_OK OK}. It will return {@link #FFI_BAD_TYPEDEF BAD_TYPEDEF} if {@code cif} is {@code NULL} or
	 *         {@code atypes} or {@code rtype} is malformed. If {@code abi} does not refer to a valid ABI, {@link #FFI_BAD_ABI BAD_ABI} will be returned.
	 */
	public static native int nffi_prep_cif_var(long cif, int abi, int nfixedargs, int ntotalargs, long rtype, long atypes);

	/**
	 * Prepares an {@link FFICIF} structure for use with {@link #ffi_call call} for variadic functions.
	 * 
	 * <p>Note that, different cif's must be prepped for calls to the same function when different numbers of arguments are passed.</p>
	 * 
	 * <p>Also note that a call to {@code ffi_prep_cif_var} with {@code nfixedargs == ntotalargs} is NOT equivalent to a call to {@link #ffi_prep_cif prep_cif}.</p>
	 *
	 * @param cif        the {@link FFICIF} structure to prepare
	 * @param abi        the calling convention to use. One of:<br><table><tr><td>{@link #FFI_SYSV SYSV}</td><td>{@link #FFI_WIN64 WIN64}</td><td>{@link #FFI_UNIX64 UNIX64}</td><td>{@link #FFI_STDCALL STDCALL}</td><td>{@link #FFI_THISCALL THISCALL}</td><td>{@link #FFI_FASTCALL FASTCALL}</td><td>{@link #FFI_MS_CDECL MS_CDECL}</td><td>{@link #FFI_DEFAULT_ABI DEFAULT_ABI}</td></tr></table>
	 * @param nfixedargs the number of fixed arguments, prior to any variadic arguments. It must be greater than zero.
	 * @param rtype      a pointer to an {@link FFIType} structure that describes the data type, size and alignment of the return value
	 * @param atypes     an array of {@code ntotalargs} pointers to {@link FFIType} structures that describe the data type, size and alignment of each argument
	 *
	 * @return Upon successful completion, {@code ffi_prep_cif} returns {@link #FFI_OK OK}. It will return {@link #FFI_BAD_TYPEDEF BAD_TYPEDEF} if {@code cif} is {@code NULL} or
	 *         {@code atypes} or {@code rtype} is malformed. If {@code abi} does not refer to a valid ABI, {@link #FFI_BAD_ABI BAD_ABI} will be returned.
	 */
	public static int ffi_prep_cif_var(FFICIF cif, int abi, int nfixedargs, FFIType rtype, PointerBuffer atypes) {
		return nffi_prep_cif_var(cif.address(), abi, nfixedargs, atypes.remaining(), rtype.address(), memAddress(atypes));
	}

	// --- [ ffi_call ] ---

	/**
	 * Provides a simple mechanism for invoking a function without requiring knowledge of the function's interface at compile time.
	 *
	 * @param cif    a {@link FFICIF} structure. It must be initialized with {@link #ffi_prep_cif prep_cif} or {@link #ffi_prep_cif_var prep_cif_var} before it is used with {@code ffi_call}.
	 * @param fn     the function to call
	 * @param rvalue a pointer to storage in which to place the returned value. The storage must be sizeof(ffi_arg) or larger for non-floating point types. For
	 *               smaller-sized return value types, the ffi_arg or ffi_sarg integral type must be used to hold the return value.
	 * @param avalue an array of pointers from which the argument values are retrieved
	 */
	public static native void nffi_call(long cif, long fn, long rvalue, long avalue);

	/**
	 * Provides a simple mechanism for invoking a function without requiring knowledge of the function's interface at compile time.
	 *
	 * @param cif    a {@link FFICIF} structure. It must be initialized with {@link #ffi_prep_cif prep_cif} or {@link #ffi_prep_cif_var prep_cif_var} before it is used with {@code ffi_call}.
	 * @param fn     the function to call
	 * @param rvalue a pointer to storage in which to place the returned value. The storage must be sizeof(ffi_arg) or larger for non-floating point types. For
	 *               smaller-sized return value types, the ffi_arg or ffi_sarg integral type must be used to hold the return value.
	 * @param avalue an array of pointers from which the argument values are retrieved
	 */
	public static void ffi_call(FFICIF cif, long fn, ByteBuffer rvalue, PointerBuffer avalue) {
		if ( CHECKS )
			checkPointer(fn);
		nffi_call(cif.address(), fn, memAddressSafe(rvalue), memAddressSafe(avalue));
	}

	// --- [ ffi_closure_alloc ] ---

	/**
	 * Allocates an {@link FFIClosure} structure.
	 *
	 * @param size the number of bytes to allocate. Must be:<br><table><tr><td>{@link FFIClosure#SIZEOF}</td></tr></table>
	 * @param code a buffer in which to place the returned executable address
	 *
	 * @return a pointer to the writable address
	 */
	public static native long nffi_closure_alloc(long size, long code);

	/**
	 * Allocates an {@link FFIClosure} structure.
	 *
	 * @param size the number of bytes to allocate. Must be:<br><table><tr><td>{@link FFIClosure#SIZEOF}</td></tr></table>
	 * @param code a buffer in which to place the returned executable address
	 *
	 * @return a pointer to the writable address
	 */
	public static ByteBuffer ffi_closure_alloc(long size, PointerBuffer code) {
		if ( CHECKS )
			checkBuffer(code, 1);
		long __result = nffi_closure_alloc(size, memAddress(code));
		return memByteBuffer(__result, (int)size);
	}

	// --- [ ffi_closure_free ] ---

	/**
	 * Frees memory allocated using {@link #ffi_closure_alloc closure_alloc}.
	 *
	 * @param writable the address of an {@link FFIClosure} structure
	 */
	public static native void nffi_closure_free(long writable);

	/**
	 * Frees memory allocated using {@link #ffi_closure_alloc closure_alloc}.
	 *
	 * @param writable the address of an {@link FFIClosure} structure
	 */
	public static void ffi_closure_free(ByteBuffer writable) {
		nffi_closure_free(memAddress(writable));
	}

	// --- [ ffi_prep_closure_loc ] ---

	/**
	 * 
	 *
	 * @param closure   the address of an {@link FFIClosure} object; this is the writable address returned by {@link #ffi_closure_alloc closure_alloc}.
	 * @param cif       the {@link FFICIF} describing the function parameters
	 * @param fun       the function which will be called when the closure is invoked
	 * @param user_data an arbitrary datum that is passed, uninterpreted, to your closure function
	 * @param codeloc   the executable address returned by {@link #ffi_closure_alloc closure_alloc}.
	 */
	public static native int nffi_prep_closure_loc(long closure, long cif, long fun, long user_data, long codeloc);

	/**
	 * 
	 *
	 * @param closure   the address of an {@link FFIClosure} object; this is the writable address returned by {@link #ffi_closure_alloc closure_alloc}.
	 * @param cif       the {@link FFICIF} describing the function parameters
	 * @param fun       the function which will be called when the closure is invoked
	 * @param user_data an arbitrary datum that is passed, uninterpreted, to your closure function
	 * @param codeloc   the executable address returned by {@link #ffi_closure_alloc closure_alloc}.
	 */
	public static int ffi_prep_closure_loc(FFIClosure closure, FFICIF cif, long fun, long user_data, long codeloc) {
		if ( CHECKS ) {
			checkPointer(fun);
			checkPointer(codeloc);
		}
		return nffi_prep_closure_loc(closure.address(), cif.address(), fun, user_data, codeloc);
	}

}