/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libc;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/** Native bindings to stdlib.h. */
public class Stdlib {

	static { Library.initialize(); }

	protected Stdlib() {
		throw new UnsupportedOperationException();
	}

	// --- [ malloc ] ---

	/**
	 * Allocates {@code size} bytes and returns a pointer to the allocated memory. The memory is not initialized. If {@code size} is 0, then malloc() returns
	 * either {@code NULL}, or a unique pointer value that can later be successfully passed to {@link #free}.
	 *
	 * @param size the number of bytes to allocate
	 */
	public static native long nmalloc(long size);

	/**
	 * Allocates {@code size} bytes and returns a pointer to the allocated memory. The memory is not initialized. If {@code size} is 0, then malloc() returns
	 * either {@code NULL}, or a unique pointer value that can later be successfully passed to {@link #free}.
	 *
	 * @param size the number of bytes to allocate
	 */
	public static ByteBuffer malloc(long size) {
		long __result = nmalloc(size);
		return memByteBuffer(__result, (int)size);
	}

	// --- [ calloc ] ---

	/**
	 * Allocates memory for an array of {@code nmemb} elements of {@code size} bytes each and returns a pointer to the allocated memory. The memory is set to
	 * zero. If {@code nmemb} or {@code size} is 0, then calloc() returns either {@code NULL}, or a unique pointer value that can later be successfully passed to
	 * {@link #free}.
	 *
	 * @param nmemb the number of elements to allocate
	 * @param size  the number of bytes to allocate per element
	 */
	public static native long ncalloc(long nmemb, long size);

	/**
	 * Allocates memory for an array of {@code nmemb} elements of {@code size} bytes each and returns a pointer to the allocated memory. The memory is set to
	 * zero. If {@code nmemb} or {@code size} is 0, then calloc() returns either {@code NULL}, or a unique pointer value that can later be successfully passed to
	 * {@link #free}.
	 *
	 * @param nmemb the number of elements to allocate
	 * @param size  the number of bytes to allocate per element
	 */
	public static ByteBuffer calloc(long nmemb, long size) {
		long __result = ncalloc(nmemb, size);
		return memByteBuffer(__result, (int)nmemb * (int)size);
	}

	// --- [ realloc ] ---

	/**
	 * Changes the size of the memory block pointed to by {@code ptr} to {@code size} bytes  The contents will be unchanged in the range from the start of the
	 * region up to the minimum of the old and new sizes. If the new size is larger than the old size, the added memory will not be initialized. If
	 * {@code ptr} is {@code NULL}, then the call is equivalent to {@code malloc(size)}, for all values of {@code size}; if {@code size} is equal to zero, and
	 * {@code ptr} is not {@code NULL}, then the call is equivalent to {@code free(ptr)}. Unless {@code ptr} is {@code NULL}, it must have been returned by an earlier call
	 * to {@link #malloc}, {@link #calloc} or {@link #realloc}. If the area pointed to was moved, a {@code free(ptr)} is done.
	 *
	 * @param ptr  the memory block to reallocate
	 * @param size the new memory block size, in bytes
	 */
	public static native long nrealloc(long ptr, long size);

	/**
	 * Changes the size of the memory block pointed to by {@code ptr} to {@code size} bytes  The contents will be unchanged in the range from the start of the
	 * region up to the minimum of the old and new sizes. If the new size is larger than the old size, the added memory will not be initialized. If
	 * {@code ptr} is {@code NULL}, then the call is equivalent to {@code malloc(size)}, for all values of {@code size}; if {@code size} is equal to zero, and
	 * {@code ptr} is not {@code NULL}, then the call is equivalent to {@code free(ptr)}. Unless {@code ptr} is {@code NULL}, it must have been returned by an earlier call
	 * to {@link #malloc}, {@link #calloc} or {@link #realloc}. If the area pointed to was moved, a {@code free(ptr)} is done.
	 *
	 * @param ptr  the memory block to reallocate
	 * @param size the new memory block size, in bytes
	 */
	public static ByteBuffer realloc(ByteBuffer ptr, long size) {
		long __result = nrealloc(memAddressSafe(ptr), size);
		return memByteBuffer(__result, (int)size);
	}

	// --- [ free ] ---

	/**
	 * Frees the memory space pointed to by {@code ptr}, which must have been returned by a previous call to {@link #malloc}, {@link #calloc}, or {@link #realloc}. Otherwise,
	 * or if {@code free(ptr)} has already been called before, undefined behavior occurs. If ptr is {@code NULL}, no operation is performed.
	 *
	 * @param ptr the memory space to free
	 */
	public static native void nfree(long ptr);

	/**
	 * Frees the memory space pointed to by {@code ptr}, which must have been returned by a previous call to {@link #malloc}, {@link #calloc}, or {@link #realloc}. Otherwise,
	 * or if {@code free(ptr)} has already been called before, undefined behavior occurs. If ptr is {@code NULL}, no operation is performed.
	 *
	 * @param ptr the memory space to free
	 */
	public static void free(ByteBuffer ptr) {
		nfree(memAddressSafe(ptr));
	}

	/** ShortBuffer version of: {@link #free} */
	public static void free(ShortBuffer ptr) {
		nfree(memAddressSafe(ptr));
	}

	/** IntBuffer version of: {@link #free} */
	public static void free(IntBuffer ptr) {
		nfree(memAddressSafe(ptr));
	}

	/** LongBuffer version of: {@link #free} */
	public static void free(LongBuffer ptr) {
		nfree(memAddressSafe(ptr));
	}

	/** FloatBuffer version of: {@link #free} */
	public static void free(FloatBuffer ptr) {
		nfree(memAddressSafe(ptr));
	}

	/** DoubleBuffer version of: {@link #free} */
	public static void free(DoubleBuffer ptr) {
		nfree(memAddressSafe(ptr));
	}

	/** PointerBuffer version of: {@link #free} */
	public static void free(PointerBuffer ptr) {
		nfree(memAddressSafe(ptr));
	}

	// --- [ aligned_alloc ] ---

	/**
	 * Allocates {@code size} bytes of uninitialized storage whose alignment is specified by {@code alignment}. The size parameter must be an integral multiple
	 * of alignment. Memory allocated with aligned_alloc() must be freed with {@link #aligned_free}.
	 *
	 * @param alignment the alignment. Must be a power of two value.
	 * @param size      the number of bytes to allocate. Must be a multiple of {@code alignment}.
	 */
	public static native long naligned_alloc(long alignment, long size);

	/**
	 * Allocates {@code size} bytes of uninitialized storage whose alignment is specified by {@code alignment}. The size parameter must be an integral multiple
	 * of alignment. Memory allocated with aligned_alloc() must be freed with {@link #aligned_free}.
	 *
	 * @param alignment the alignment. Must be a power of two value.
	 * @param size      the number of bytes to allocate. Must be a multiple of {@code alignment}.
	 */
	public static ByteBuffer aligned_alloc(long alignment, long size) {
		long __result = naligned_alloc(alignment, size);
		return memByteBuffer(__result, (int)size);
	}

	// --- [ aligned_free ] ---

	/**
	 * Frees a block of memory that was allocated with {@link #aligned_alloc}. If ptr is {@code NULL}, no operation is performed.
	 *
	 * @param ptr the aligned block of memory to free
	 */
	public static native void naligned_free(long ptr);

	/**
	 * Frees a block of memory that was allocated with {@link #aligned_alloc}. If ptr is {@code NULL}, no operation is performed.
	 *
	 * @param ptr the aligned block of memory to free
	 */
	public static void aligned_free(ByteBuffer ptr) {
		naligned_free(memAddressSafe(ptr));
	}

	/** ShortBuffer version of: {@link #aligned_free} */
	public static void aligned_free(ShortBuffer ptr) {
		naligned_free(memAddressSafe(ptr));
	}

	/** IntBuffer version of: {@link #aligned_free} */
	public static void aligned_free(IntBuffer ptr) {
		naligned_free(memAddressSafe(ptr));
	}

	/** LongBuffer version of: {@link #aligned_free} */
	public static void aligned_free(LongBuffer ptr) {
		naligned_free(memAddressSafe(ptr));
	}

	/** FloatBuffer version of: {@link #aligned_free} */
	public static void aligned_free(FloatBuffer ptr) {
		naligned_free(memAddressSafe(ptr));
	}

	/** DoubleBuffer version of: {@link #aligned_free} */
	public static void aligned_free(DoubleBuffer ptr) {
		naligned_free(memAddressSafe(ptr));
	}

	/** PointerBuffer version of: {@link #aligned_free} */
	public static void aligned_free(PointerBuffer ptr) {
		naligned_free(memAddressSafe(ptr));
	}

	/** short[] version of: {@link #free} */
	public static native void nfree(short[] ptr);

	/** short[] version of: {@link #free} */
	public static void free(short[] ptr) {
		nfree(ptr);
	}

	/** int[] version of: {@link #free} */
	public static native void nfree(int[] ptr);

	/** int[] version of: {@link #free} */
	public static void free(int[] ptr) {
		nfree(ptr);
	}

	/** long[] version of: {@link #free} */
	public static native void nfree(long[] ptr);

	/** long[] version of: {@link #free} */
	public static void free(long[] ptr) {
		nfree(ptr);
	}

	/** float[] version of: {@link #free} */
	public static native void nfree(float[] ptr);

	/** float[] version of: {@link #free} */
	public static void free(float[] ptr) {
		nfree(ptr);
	}

	/** double[] version of: {@link #free} */
	public static native void nfree(double[] ptr);

	/** double[] version of: {@link #free} */
	public static void free(double[] ptr) {
		nfree(ptr);
	}

	/** short[] version of: {@link #aligned_free} */
	public static native void naligned_free(short[] ptr);

	/** short[] version of: {@link #aligned_free} */
	public static void aligned_free(short[] ptr) {
		naligned_free(ptr);
	}

	/** int[] version of: {@link #aligned_free} */
	public static native void naligned_free(int[] ptr);

	/** int[] version of: {@link #aligned_free} */
	public static void aligned_free(int[] ptr) {
		naligned_free(ptr);
	}

	/** long[] version of: {@link #aligned_free} */
	public static native void naligned_free(long[] ptr);

	/** long[] version of: {@link #aligned_free} */
	public static void aligned_free(long[] ptr) {
		naligned_free(ptr);
	}

	/** float[] version of: {@link #aligned_free} */
	public static native void naligned_free(float[] ptr);

	/** float[] version of: {@link #aligned_free} */
	public static void aligned_free(float[] ptr) {
		naligned_free(ptr);
	}

	/** double[] version of: {@link #aligned_free} */
	public static native void naligned_free(double[] ptr);

	/** double[] version of: {@link #aligned_free} */
	public static void aligned_free(double[] ptr) {
		naligned_free(ptr);
	}

}