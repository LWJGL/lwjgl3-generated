/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system;

import static org.lwjgl.system.Checks.*;

/** Memory access utilities. */
class MemoryAccessJNI {

	static { Library.initialize(); }

	protected MemoryAccessJNI() {
		throw new UnsupportedOperationException();
	}

	// --- [ malloc ] ---

	private static native long malloc();

	/** Returns the address of the stdlib malloc function. */
	static final long malloc = malloc();

	// --- [ calloc ] ---

	private static native long calloc();

	/** Returns the address of the stdlib calloc function. */
	static final long calloc = calloc();

	// --- [ realloc ] ---

	private static native long realloc();

	/** Returns the address of the stdlib realloc function. */
	static final long realloc = realloc();

	// --- [ free ] ---

	private static native long free();

	/** Returns the address of the stdlib free function. */
	static final long free = free();

	// --- [ aligned_alloc ] ---

	private static native long aligned_alloc();

	/** Returns the address of the stdlib aligned_alloc function. */
	static final long aligned_alloc = aligned_alloc();

	// --- [ aligned_free ] ---

	private static native long aligned_free();

	/** Returns the address of the stdlib aligned_free function. */
	static final long aligned_free = aligned_free();

	// --- [ getByte ] ---

	/**
	 * Reads a byte value from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static native byte ngetByte(long ptr);

	/**
	 * Reads a byte value from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static byte getByte(long ptr) {
		if ( CHECKS )
			checkPointer(ptr);
		return ngetByte(ptr);
	}

	// --- [ getShort ] ---

	/**
	 * Reads a short value from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static native short ngetShort(long ptr);

	/**
	 * Reads a short value from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static short getShort(long ptr) {
		if ( CHECKS )
			checkPointer(ptr);
		return ngetShort(ptr);
	}

	// --- [ getInt ] ---

	/**
	 * Reads an int value from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static native int ngetInt(long ptr);

	/**
	 * Reads an int value from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static int getInt(long ptr) {
		if ( CHECKS )
			checkPointer(ptr);
		return ngetInt(ptr);
	}

	// --- [ getLong ] ---

	/**
	 * Reads a long value from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static native long ngetLong(long ptr);

	/**
	 * Reads a long value from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static long getLong(long ptr) {
		if ( CHECKS )
			checkPointer(ptr);
		return ngetLong(ptr);
	}

	// --- [ getFloat ] ---

	/**
	 * Reads a float value from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static native float ngetFloat(long ptr);

	/**
	 * Reads a float value from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static float getFloat(long ptr) {
		if ( CHECKS )
			checkPointer(ptr);
		return ngetFloat(ptr);
	}

	// --- [ getDouble ] ---

	/**
	 * Reads a double value from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static native double ngetDouble(long ptr);

	/**
	 * Reads a double value from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static double getDouble(long ptr) {
		if ( CHECKS )
			checkPointer(ptr);
		return ngetDouble(ptr);
	}

	// --- [ getAddress ] ---

	/**
	 * Reads a pointer address from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static native long ngetAddress(long ptr);

	/**
	 * Reads a pointer address from the specified memory address.
	 *
	 * @param ptr the memory address to read
	 */
	static long getAddress(long ptr) {
		if ( CHECKS )
			checkPointer(ptr);
		return ngetAddress(ptr);
	}

	// --- [ putByte ] ---

	/**
	 * Writes a byte value to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static native void nputByte(long ptr, byte value);

	/**
	 * Writes a byte value to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static void putByte(long ptr, byte value) {
		if ( CHECKS )
			checkPointer(ptr);
		nputByte(ptr, value);
	}

	// --- [ putShort ] ---

	/**
	 * Writes a short value to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static native void nputShort(long ptr, short value);

	/**
	 * Writes a short value to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static void putShort(long ptr, short value) {
		if ( CHECKS )
			checkPointer(ptr);
		nputShort(ptr, value);
	}

	// --- [ putInt ] ---

	/**
	 * Writes an int value to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static native void nputInt(long ptr, int value);

	/**
	 * Writes an int value to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static void putInt(long ptr, int value) {
		if ( CHECKS )
			checkPointer(ptr);
		nputInt(ptr, value);
	}

	// --- [ putLong ] ---

	/**
	 * Writes a long value to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static native void nputLong(long ptr, long value);

	/**
	 * Writes a long value to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static void putLong(long ptr, long value) {
		if ( CHECKS )
			checkPointer(ptr);
		nputLong(ptr, value);
	}

	// --- [ putFloat ] ---

	/**
	 * Writes a float value to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static native void nputFloat(long ptr, float value);

	/**
	 * Writes a float value to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static void putFloat(long ptr, float value) {
		if ( CHECKS )
			checkPointer(ptr);
		nputFloat(ptr, value);
	}

	// --- [ putDouble ] ---

	/**
	 * Writes a double value to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static native void nputDouble(long ptr, double value);

	/**
	 * Writes a double value to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static void putDouble(long ptr, double value) {
		if ( CHECKS )
			checkPointer(ptr);
		nputDouble(ptr, value);
	}

	// --- [ putAddress ] ---

	/**
	 * Writes a pointer address to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static native void nputAddress(long ptr, long value);

	/**
	 * Writes a pointer address to the specified memory address.
	 *
	 * @param ptr   the memory address to write
	 * @param value the value to write
	 */
	static void putAddress(long ptr, long value) {
		if ( CHECKS )
			checkPointer(ptr);
		nputAddress(ptr, value);
	}

}