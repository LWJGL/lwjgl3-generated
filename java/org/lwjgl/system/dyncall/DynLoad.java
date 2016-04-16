/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.dyncall;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to \"dynload.h\".
 * 
 * <p>The dynload library provides an interface to load foreign dynamic libraries and access to their symbols.</p>
 */
public class DynLoad {

	static { Library.initialize(); }

	protected DynLoad() {
		throw new UnsupportedOperationException();
	}

	// --- [ dlLoadLibrary ] ---

	/**
	 * Loads a dynamic library at {@code libpath} and returns a handle to it.
	 *
	 * @param libpath the dynamic library path
	 */
	public static native long ndlLoadLibrary(long libpath);

	/**
	 * Loads a dynamic library at {@code libpath} and returns a handle to it.
	 *
	 * @param libpath the dynamic library path
	 */
	public static long dlLoadLibrary(ByteBuffer libpath) {
		if ( CHECKS )
			checkNT1(libpath);
		return ndlLoadLibrary(memAddress(libpath));
	}

	/**
	 * Loads a dynamic library at {@code libpath} and returns a handle to it.
	 *
	 * @param libpath the dynamic library path
	 */
	public static long dlLoadLibrary(CharSequence libpath) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer libpathEncoded = stack.ASCII(libpath);
			return ndlLoadLibrary(memAddress(libpathEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ dlFreeLibrary ] ---

	/**
	 * Frees a loaded library.
	 *
	 * @param pLib the dynamic library to free
	 */
	public static native void ndlFreeLibrary(long pLib);

	/**
	 * Frees a loaded library.
	 *
	 * @param pLib the dynamic library to free
	 */
	public static void dlFreeLibrary(long pLib) {
		if ( CHECKS )
			checkPointer(pLib);
		ndlFreeLibrary(pLib);
	}

	// --- [ dlFindSymbol ] ---

	/**
	 * Returns a pointer to a symbol with name {@code pSymbolName} in the library with handle {@code pLib}, or returns a null pointer if the symbol cannot be
	 * found.
	 *
	 * @param pLib        the dynamic library
	 * @param pSymbolName the symbol name
	 */
	public static native long ndlFindSymbol(long pLib, long pSymbolName);

	/**
	 * Returns a pointer to a symbol with name {@code pSymbolName} in the library with handle {@code pLib}, or returns a null pointer if the symbol cannot be
	 * found.
	 *
	 * @param pLib        the dynamic library
	 * @param pSymbolName the symbol name
	 */
	public static long dlFindSymbol(long pLib, ByteBuffer pSymbolName) {
		if ( CHECKS ) {
			checkPointer(pLib);
			checkNT1(pSymbolName);
		}
		return ndlFindSymbol(pLib, memAddress(pSymbolName));
	}

	/**
	 * Returns a pointer to a symbol with name {@code pSymbolName} in the library with handle {@code pLib}, or returns a null pointer if the symbol cannot be
	 * found.
	 *
	 * @param pLib        the dynamic library
	 * @param pSymbolName the symbol name
	 */
	public static long dlFindSymbol(long pLib, CharSequence pSymbolName) {
		if ( CHECKS )
			checkPointer(pLib);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pSymbolNameEncoded = stack.ASCII(pSymbolName);
			return ndlFindSymbol(pLib, memAddress(pSymbolNameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ dlSymsInit ] ---

	/**
	 * Creates a new {@code DLSyms} object.
	 *
	 * @param libPath the dynamic library path
	 */
	public static native long ndlSymsInit(long libPath);

	/**
	 * Creates a new {@code DLSyms} object.
	 *
	 * @param libPath the dynamic library path
	 */
	public static long dlSymsInit(ByteBuffer libPath) {
		if ( CHECKS )
			checkNT1(libPath);
		return ndlSymsInit(memAddress(libPath));
	}

	/**
	 * Creates a new {@code DLSyms} object.
	 *
	 * @param libPath the dynamic library path
	 */
	public static long dlSymsInit(CharSequence libPath) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer libPathEncoded = stack.ASCII(libPath);
			return ndlSymsInit(memAddress(libPathEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ dlSymsCleanup ] ---

	/**
	 * Frees the specified {@code DLSyms} object.
	 *
	 * @param pSyms the {@code DLSyms} object to free
	 */
	public static native void ndlSymsCleanup(long pSyms);

	/**
	 * Frees the specified {@code DLSyms} object.
	 *
	 * @param pSyms the {@code DLSyms} object to free
	 */
	public static void dlSymsCleanup(long pSyms) {
		if ( CHECKS )
			checkPointer(pSyms);
		ndlSymsCleanup(pSyms);
	}

	// --- [ dlSymsCount ] ---

	/**
	 * Returns the number of symbols exported by the specified library.
	 *
	 * @param pSyms a {@code DLSyms} object
	 */
	public static native int ndlSymsCount(long pSyms);

	/**
	 * Returns the number of symbols exported by the specified library.
	 *
	 * @param pSyms a {@code DLSyms} object
	 */
	public static int dlSymsCount(long pSyms) {
		if ( CHECKS )
			checkPointer(pSyms);
		return ndlSymsCount(pSyms);
	}

	// --- [ dlSymsName ] ---

	/**
	 * Returns the symbol name exported by the specified library at the specified index.
	 *
	 * @param pSyms a {@code DLSyms} object
	 * @param index 
	 */
	public static native long ndlSymsName(long pSyms, int index);

	/**
	 * Returns the symbol name exported by the specified library at the specified index.
	 *
	 * @param pSyms a {@code DLSyms} object
	 * @param index 
	 */
	public static String dlSymsName(long pSyms, int index) {
		if ( CHECKS )
			checkPointer(pSyms);
		long __result = ndlSymsName(pSyms, index);
		return memASCII(__result);
	}

	// --- [ dlSymsNameFromValue ] ---

	/**
	 * Returns the symbol name exported by the specified library at the specified address.
	 *
	 * @param pSyms a {@code DLSyms} object
	 * @param value the symbol address
	 */
	public static native long ndlSymsNameFromValue(long pSyms, long value);

	/**
	 * Returns the symbol name exported by the specified library at the specified address.
	 *
	 * @param pSyms a {@code DLSyms} object
	 * @param value the symbol address
	 */
	public static String dlSymsNameFromValue(long pSyms, long value) {
		if ( CHECKS ) {
			checkPointer(pSyms);
			checkPointer(value);
		}
		long __result = ndlSymsNameFromValue(pSyms, value);
		return memASCII(__result);
	}

}