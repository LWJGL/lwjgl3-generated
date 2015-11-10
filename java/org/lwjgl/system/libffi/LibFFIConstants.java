/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libffi;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Defines methods that return platform-specific constant values that are used by {@link LibFFI}. */
class LibFFIConstants {

	static { Library.initialize(); }

	@JavadocExclude
	protected LibFFIConstants() {
		throw new UnsupportedOperationException();
	}

	// --- [ FFI_TYPE_DOUBLE ] ---

	/** Returns the {@link LibFFI#FFI_TYPE_DOUBLE} value. */
	static native short FFI_TYPE_DOUBLE();

	// --- [ FFI_DEFAULT_ABI ] ---

	/** Returns the {@link LibFFI#FFI_DEFAULT_ABI} value. */
	static native int FFI_DEFAULT_ABI();

	// --- [ ffi_type_void ] ---

	/** JNI method for {@link #ffi_type_void} */
	@JavadocExclude
	static native long nffi_type_void();

	/** Returns the address of the {@code ffi_type_void} struct. */
	static FFIType ffi_type_void() {
		long __result = nffi_type_void();
		return new FFIType(__result);
	}

	// --- [ ffi_type_uint8 ] ---

	/** JNI method for {@link #ffi_type_uint8} */
	@JavadocExclude
	static native long nffi_type_uint8();

	/** Returns the address of the {@code ffi_type_uint8} struct. */
	static FFIType ffi_type_uint8() {
		long __result = nffi_type_uint8();
		return new FFIType(__result);
	}

	// --- [ ffi_type_sint8 ] ---

	/** JNI method for {@link #ffi_type_sint8} */
	@JavadocExclude
	static native long nffi_type_sint8();

	/** Returns the address of the {@code ffi_type_sint8} struct. */
	static FFIType ffi_type_sint8() {
		long __result = nffi_type_sint8();
		return new FFIType(__result);
	}

	// --- [ ffi_type_uint16 ] ---

	/** JNI method for {@link #ffi_type_uint16} */
	@JavadocExclude
	static native long nffi_type_uint16();

	/** Returns the address of the {@code ffi_type_uint16} struct. */
	static FFIType ffi_type_uint16() {
		long __result = nffi_type_uint16();
		return new FFIType(__result);
	}

	// --- [ ffi_type_sint16 ] ---

	/** JNI method for {@link #ffi_type_sint16} */
	@JavadocExclude
	static native long nffi_type_sint16();

	/** Returns the address of the {@code ffi_type_sint16} struct. */
	static FFIType ffi_type_sint16() {
		long __result = nffi_type_sint16();
		return new FFIType(__result);
	}

	// --- [ ffi_type_uint32 ] ---

	/** JNI method for {@link #ffi_type_uint32} */
	@JavadocExclude
	static native long nffi_type_uint32();

	/** Returns the address of the {@code ffi_type_uint32} struct. */
	static FFIType ffi_type_uint32() {
		long __result = nffi_type_uint32();
		return new FFIType(__result);
	}

	// --- [ ffi_type_sint32 ] ---

	/** JNI method for {@link #ffi_type_sint32} */
	@JavadocExclude
	static native long nffi_type_sint32();

	/** Returns the address of the {@code ffi_type_sint32} struct. */
	static FFIType ffi_type_sint32() {
		long __result = nffi_type_sint32();
		return new FFIType(__result);
	}

	// --- [ ffi_type_uint64 ] ---

	/** JNI method for {@link #ffi_type_uint64} */
	@JavadocExclude
	static native long nffi_type_uint64();

	/** Returns the address of the {@code ffi_type_uint64} struct. */
	static FFIType ffi_type_uint64() {
		long __result = nffi_type_uint64();
		return new FFIType(__result);
	}

	// --- [ ffi_type_sint64 ] ---

	/** JNI method for {@link #ffi_type_sint64} */
	@JavadocExclude
	static native long nffi_type_sint64();

	/** Returns the address of the {@code ffi_type_sint64} struct. */
	static FFIType ffi_type_sint64() {
		long __result = nffi_type_sint64();
		return new FFIType(__result);
	}

	// --- [ ffi_type_uchar ] ---

	/** JNI method for {@link #ffi_type_uchar} */
	@JavadocExclude
	static native long nffi_type_uchar();

	/** Returns the address of the {@code ffi_type_uchar} struct. */
	static FFIType ffi_type_uchar() {
		long __result = nffi_type_uchar();
		return new FFIType(__result);
	}

	// --- [ ffi_type_schar ] ---

	/** JNI method for {@link #ffi_type_schar} */
	@JavadocExclude
	static native long nffi_type_schar();

	/** Returns the address of the {@code ffi_type_schar} struct. */
	static FFIType ffi_type_schar() {
		long __result = nffi_type_schar();
		return new FFIType(__result);
	}

	// --- [ ffi_type_ushort ] ---

	/** JNI method for {@link #ffi_type_ushort} */
	@JavadocExclude
	static native long nffi_type_ushort();

	/** Returns the address of the {@code ffi_type_ushort} struct. */
	static FFIType ffi_type_ushort() {
		long __result = nffi_type_ushort();
		return new FFIType(__result);
	}

	// --- [ ffi_type_sshort ] ---

	/** JNI method for {@link #ffi_type_sshort} */
	@JavadocExclude
	static native long nffi_type_sshort();

	/** Returns the address of the {@code ffi_type_sshort} struct. */
	static FFIType ffi_type_sshort() {
		long __result = nffi_type_sshort();
		return new FFIType(__result);
	}

	// --- [ ffi_type_uint ] ---

	/** JNI method for {@link #ffi_type_uint} */
	@JavadocExclude
	static native long nffi_type_uint();

	/** Returns the address of the {@code ffi_type_uint} struct. */
	static FFIType ffi_type_uint() {
		long __result = nffi_type_uint();
		return new FFIType(__result);
	}

	// --- [ ffi_type_sint ] ---

	/** JNI method for {@link #ffi_type_sint} */
	@JavadocExclude
	static native long nffi_type_sint();

	/** Returns the address of the {@code ffi_type_sint} struct. */
	static FFIType ffi_type_sint() {
		long __result = nffi_type_sint();
		return new FFIType(__result);
	}

	// --- [ ffi_type_ulong ] ---

	/** JNI method for {@link #ffi_type_ulong} */
	@JavadocExclude
	static native long nffi_type_ulong();

	/** Returns the address of the {@code ffi_type_ulong} struct. */
	static FFIType ffi_type_ulong() {
		long __result = nffi_type_ulong();
		return new FFIType(__result);
	}

	// --- [ ffi_type_slong ] ---

	/** JNI method for {@link #ffi_type_slong} */
	@JavadocExclude
	static native long nffi_type_slong();

	/** Returns the address of the {@code ffi_type_slong} struct. */
	static FFIType ffi_type_slong() {
		long __result = nffi_type_slong();
		return new FFIType(__result);
	}

	// --- [ ffi_type_float ] ---

	/** JNI method for {@link #ffi_type_float} */
	@JavadocExclude
	static native long nffi_type_float();

	/** Returns the address of the {@code ffi_type_float} struct. */
	static FFIType ffi_type_float() {
		long __result = nffi_type_float();
		return new FFIType(__result);
	}

	// --- [ ffi_type_double ] ---

	/** JNI method for {@link #ffi_type_double} */
	@JavadocExclude
	static native long nffi_type_double();

	/** Returns the address of the {@code ffi_type_double} struct. */
	static FFIType ffi_type_double() {
		long __result = nffi_type_double();
		return new FFIType(__result);
	}

	// --- [ ffi_type_longdouble ] ---

	/** JNI method for {@link #ffi_type_longdouble} */
	@JavadocExclude
	static native long nffi_type_longdouble();

	/** Returns the address of the {@code ffi_type_longdouble} struct. */
	static FFIType ffi_type_longdouble() {
		long __result = nffi_type_longdouble();
		return new FFIType(__result);
	}

	// --- [ ffi_type_pointer ] ---

	/** JNI method for {@link #ffi_type_pointer} */
	@JavadocExclude
	static native long nffi_type_pointer();

	/** Returns the address of the {@code ffi_type_pointer} struct. */
	static FFIType ffi_type_pointer() {
		long __result = nffi_type_pointer();
		return new FFIType(__result);
	}

}