/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to jemalloc.
 * 
 * <p>jemalloc is a general purpose malloc implementation that emphasizes fragmentation avoidance and scalable concurrency support. jemalloc first came into
 * use as the FreeBSD libc allocator in 2005, and since then it has found its way into numerous applications that rely on its predictable behavior. In
 * 2010 jemalloc development efforts broadened to include developer support features such as heap profiling, Valgrind integration, and extensive
 * monitoring/tuning hooks. Modern jemalloc releases continue to be integrated back into FreeBSD, and therefore versatility remains critical. Ongoing
 * development efforts trend toward making jemalloc among the best allocators for a broad range of demanding applications, and eliminating/mitigating
 * weaknesses that have practical repercussions for real world applications.</p>
 */
public class JEmalloc {

	protected JEmalloc() {
		throw new UnsupportedOperationException();
	}

	private static final SharedLibrary JEMALLOC = Library.loadNative(Configuration.JEMALLOC_LIBRARY_NAME.get(System.getProperty("os.arch").contains("64") ? "jemalloc" : "jemalloc32"));

	/** Contains the function pointers loaded from the jemalloc {@link SharedLibrary}. */
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			malloc_message     = apiGetFunctionAddress(JEMALLOC, "je_malloc_message"),
			malloc             = apiGetFunctionAddress(JEMALLOC, "je_malloc"),
			calloc             = apiGetFunctionAddress(JEMALLOC, "je_calloc"),
			posix_memalign     = apiGetFunctionAddress(JEMALLOC, "je_posix_memalign"),
			aligned_alloc      = apiGetFunctionAddress(JEMALLOC, "je_aligned_alloc"),
			realloc            = apiGetFunctionAddress(JEMALLOC, "je_realloc"),
			free               = apiGetFunctionAddress(JEMALLOC, "je_free"),
			mallocx            = apiGetFunctionAddress(JEMALLOC, "je_mallocx"),
			rallocx            = apiGetFunctionAddress(JEMALLOC, "je_rallocx"),
			xallocx            = apiGetFunctionAddress(JEMALLOC, "je_xallocx"),
			sallocx            = apiGetFunctionAddress(JEMALLOC, "je_sallocx"),
			dallocx            = apiGetFunctionAddress(JEMALLOC, "je_dallocx"),
			sdallocx           = apiGetFunctionAddress(JEMALLOC, "je_sdallocx"),
			nallocx            = apiGetFunctionAddress(JEMALLOC, "je_nallocx"),
			mallctl            = apiGetFunctionAddress(JEMALLOC, "je_mallctl"),
			mallctlnametomib   = apiGetFunctionAddress(JEMALLOC, "je_mallctlnametomib"),
			mallctlbymib       = apiGetFunctionAddress(JEMALLOC, "je_mallctlbymib"),
			malloc_stats_print = apiGetFunctionAddress(JEMALLOC, "je_malloc_stats_print"),
			malloc_usable_size = apiGetFunctionAddress(JEMALLOC, "je_malloc_usable_size");

	}

	/** Returns the jemalloc {@link SharedLibrary}. */
	public static SharedLibrary getLibrary() {
		return JEMALLOC;
	}

	// --- [ je_malloc_message ] ---

	/** Returns the {@code je_malloc_message} variable. */
	public static PointerBuffer je_malloc_message() {
		long __result = Functions.malloc_message;
		return memPointerBuffer(__result, 1);
	}

	// --- [ je_malloc ] ---

	/**
	 * Allocates {@code size} bytes of uninitialized memory. The allocated space is suitably aligned (after possible pointer coercion) for storage of any type
	 * of object.
	 *
	 * @param size the number of bytes to allocate
	 */
	public static long nje_malloc(long size) {
		long __functionAddress = Functions.malloc;
		return invokePP(__functionAddress, size);
	}

	/**
	 * Allocates {@code size} bytes of uninitialized memory. The allocated space is suitably aligned (after possible pointer coercion) for storage of any type
	 * of object.
	 *
	 * @param size the number of bytes to allocate
	 */
	public static ByteBuffer je_malloc(long size) {
		long __result = nje_malloc(size);
		return memByteBuffer(__result, (int)size);
	}

	// --- [ je_calloc ] ---

	/**
	 * Allocates space for {@code num} objects, each {@code size} bytes in length. The result is identical to calling {@link #je_malloc malloc} with an argument of
	 * {@code num * size}, with the exception that the allocated memory is explicitly initialized to zero bytes.
	 *
	 * @param num  the number of objects to allocate
	 * @param size the size of each object, in bytes
	 */
	public static long nje_calloc(long num, long size) {
		long __functionAddress = Functions.calloc;
		return invokePPP(__functionAddress, num, size);
	}

	/**
	 * Allocates space for {@code num} objects, each {@code size} bytes in length. The result is identical to calling {@link #je_malloc malloc} with an argument of
	 * {@code num * size}, with the exception that the allocated memory is explicitly initialized to zero bytes.
	 *
	 * @param num  the number of objects to allocate
	 * @param size the size of each object, in bytes
	 */
	public static ByteBuffer je_calloc(long num, long size) {
		long __result = nje_calloc(num, size);
		return memByteBuffer(__result, (int)num * (int)size);
	}

	// --- [ je_posix_memalign ] ---

	/**
	 * Allocates {@code size} bytes of memory such that the allocation's base address is an even multiple of {@code alignment}, and returns the allocation in
	 * the value pointed to by {@code memptr}. The requested alignment must be a power of 2 at least as large as {@code sizeof(void *)}.
	 *
	 * @param memptr    returns the allocated memory
	 * @param alignment the allocation alignment, in bytes
	 * @param size      the number of bytes to allocate
	 */
	public static int nje_posix_memalign(long memptr, long alignment, long size) {
		long __functionAddress = Functions.posix_memalign;
		return invokePPPI(__functionAddress, memptr, alignment, size);
	}

	/**
	 * Allocates {@code size} bytes of memory such that the allocation's base address is an even multiple of {@code alignment}, and returns the allocation in
	 * the value pointed to by {@code memptr}. The requested alignment must be a power of 2 at least as large as {@code sizeof(void *)}.
	 *
	 * @param memptr    returns the allocated memory
	 * @param alignment the allocation alignment, in bytes
	 * @param size      the number of bytes to allocate
	 */
	public static int je_posix_memalign(PointerBuffer memptr, long alignment, long size) {
		if ( CHECKS )
			checkBuffer(memptr, 1);
		return nje_posix_memalign(memAddress(memptr), alignment, size);
	}

	// --- [ je_aligned_alloc ] ---

	/**
	 * Allocates {@code size} bytes of memory such that the allocation's base address is an even multiple of {@code alignment}. The requested alignment must
	 * be a power of 2. Behavior is undefined if {@code size} is not an integral multiple of {@code alignment}.
	 *
	 * @param alignment the allocation alignment, in bytes
	 * @param size      the number of bytes to allocate
	 */
	public static long nje_aligned_alloc(long alignment, long size) {
		long __functionAddress = Functions.aligned_alloc;
		return invokePPP(__functionAddress, alignment, size);
	}

	/**
	 * Allocates {@code size} bytes of memory such that the allocation's base address is an even multiple of {@code alignment}. The requested alignment must
	 * be a power of 2. Behavior is undefined if {@code size} is not an integral multiple of {@code alignment}.
	 *
	 * @param alignment the allocation alignment, in bytes
	 * @param size      the number of bytes to allocate
	 */
	public static ByteBuffer je_aligned_alloc(long alignment, long size) {
		long __result = nje_aligned_alloc(alignment, size);
		return memByteBuffer(__result, (int)size);
	}

	// --- [ je_realloc ] ---

	/**
	 * Changes the size of the previously allocated memory referenced by {@code ptr} to {@code size} bytes. The contents of the memory are unchanged up to the
	 * lesser of the new and old sizes. If the new size is larger, the contents of the newly allocated portion of the memory are undefined. Upon success, the
	 * memory referenced by {@code ptr} is freed and a pointer to the newly allocated memory is returned. Note that realloc() may move the memory allocation,
	 * resulting in a different return value than {@code ptr}. If {@code ptr} is {@code NULL}, the realloc() function behaves identically to malloc() for the
	 * specified size.
	 *
	 * @param ptr  the previously allocated memory or {@code NULL}
	 * @param size the number of bytes to allocate
	 */
	public static long nje_realloc(long ptr, long size) {
		long __functionAddress = Functions.realloc;
		return invokePPP(__functionAddress, ptr, size);
	}

	/**
	 * Changes the size of the previously allocated memory referenced by {@code ptr} to {@code size} bytes. The contents of the memory are unchanged up to the
	 * lesser of the new and old sizes. If the new size is larger, the contents of the newly allocated portion of the memory are undefined. Upon success, the
	 * memory referenced by {@code ptr} is freed and a pointer to the newly allocated memory is returned. Note that realloc() may move the memory allocation,
	 * resulting in a different return value than {@code ptr}. If {@code ptr} is {@code NULL}, the realloc() function behaves identically to malloc() for the
	 * specified size.
	 *
	 * @param ptr  the previously allocated memory or {@code NULL}
	 * @param size the number of bytes to allocate
	 */
	public static ByteBuffer je_realloc(ByteBuffer ptr, long size) {
		long __result = nje_realloc(memAddressSafe(ptr), size);
		return memByteBuffer(__result, (int)size);
	}

	// --- [ je_free ] ---

	/**
	 * Causes the allocated memory referenced by {@code ptr} to be made available for future allocations. If {@code ptr} is {@code NULL}, no action occurs.
	 *
	 * @param ptr the allocated memory to free
	 */
	public static void nje_free(long ptr) {
		long __functionAddress = Functions.free;
		invokePV(__functionAddress, ptr);
	}

	/**
	 * Causes the allocated memory referenced by {@code ptr} to be made available for future allocations. If {@code ptr} is {@code NULL}, no action occurs.
	 *
	 * @param ptr the allocated memory to free
	 */
	public static void je_free(ByteBuffer ptr) {
		nje_free(memAddressSafe(ptr));
	}

	/** ShortBuffer version of: {@link #je_free free} */
	public static void je_free(ShortBuffer ptr) {
		nje_free(memAddressSafe(ptr));
	}

	/** IntBuffer version of: {@link #je_free free} */
	public static void je_free(IntBuffer ptr) {
		nje_free(memAddressSafe(ptr));
	}

	/** LongBuffer version of: {@link #je_free free} */
	public static void je_free(LongBuffer ptr) {
		nje_free(memAddressSafe(ptr));
	}

	/** FloatBuffer version of: {@link #je_free free} */
	public static void je_free(FloatBuffer ptr) {
		nje_free(memAddressSafe(ptr));
	}

	/** DoubleBuffer version of: {@link #je_free free} */
	public static void je_free(DoubleBuffer ptr) {
		nje_free(memAddressSafe(ptr));
	}

	/** PointerBuffer version of: {@link #je_free free} */
	public static void je_free(PointerBuffer ptr) {
		nje_free(memAddressSafe(ptr));
	}

	// --- [ je_mallocx ] ---

	/**
	 * Allocates at least {@code size} bytes of memory, and returns a pointer to the base address of the allocation. Behavior is undefined if {@code size} is
	 * 0, or if request size overflows due to size class and/or alignment constraints.
	 *
	 * @param size  the number of bytes to allocate
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static long nje_mallocx(long size, int flags) {
		long __functionAddress = Functions.mallocx;
		return invokePP(__functionAddress, size, flags);
	}

	/**
	 * Allocates at least {@code size} bytes of memory, and returns a pointer to the base address of the allocation. Behavior is undefined if {@code size} is
	 * 0, or if request size overflows due to size class and/or alignment constraints.
	 *
	 * @param size  the number of bytes to allocate
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static ByteBuffer je_mallocx(long size, int flags) {
		long __result = nje_mallocx(size, flags);
		return memByteBuffer(__result, (int)size);
	}

	// --- [ je_rallocx ] ---

	/**
	 * Resizes the allocation at {@code ptr} to be at least {@code size} bytes, and returns a pointer to the base address of the resulting allocation, which
	 * may or may not have moved from its original location. Behavior is undefined if {@code size} is 0, or if request size overflows due to size class and/or
	 * alignment constraints.
	 *
	 * @param ptr   the previously allocated memory or {@code NULL}
	 * @param size  the number of bytes to allocate
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static long nje_rallocx(long ptr, long size, int flags) {
		long __functionAddress = Functions.rallocx;
		return invokePPP(__functionAddress, ptr, size, flags);
	}

	/**
	 * Resizes the allocation at {@code ptr} to be at least {@code size} bytes, and returns a pointer to the base address of the resulting allocation, which
	 * may or may not have moved from its original location. Behavior is undefined if {@code size} is 0, or if request size overflows due to size class and/or
	 * alignment constraints.
	 *
	 * @param ptr   the previously allocated memory or {@code NULL}
	 * @param size  the number of bytes to allocate
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static ByteBuffer je_rallocx(ByteBuffer ptr, long size, int flags) {
		long __result = nje_rallocx(memAddressSafe(ptr), size, flags);
		return memByteBuffer(__result, (int)size);
	}

	// --- [ je_xallocx ] ---

	/**
	 * Resizes the allocation at {@code ptr} in place to be at least size bytes, and returns the real size of the allocation. If {@code extra} is non-zero, an
	 * attempt is made to resize the allocation to be at least {@code (size + extra)} bytes, though inability to allocate the extra byte(s) will not by itself
	 * result in failure to resize. Behavior is undefined if {@code size} is 0, or if {@code (size + extra > SIZE_T_MAX)}.
	 *
	 * @param ptr   the previously allocated memory or {@code NULL}
	 * @param size  the number of bytes to allocate
	 * @param extra the number of extra bytes to allocate
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static long nje_xallocx(long ptr, long size, long extra, int flags) {
		long __functionAddress = Functions.xallocx;
		return invokePPPP(__functionAddress, ptr, size, extra, flags);
	}

	/**
	 * Resizes the allocation at {@code ptr} in place to be at least size bytes, and returns the real size of the allocation. If {@code extra} is non-zero, an
	 * attempt is made to resize the allocation to be at least {@code (size + extra)} bytes, though inability to allocate the extra byte(s) will not by itself
	 * result in failure to resize. Behavior is undefined if {@code size} is 0, or if {@code (size + extra > SIZE_T_MAX)}.
	 *
	 * @param ptr   the previously allocated memory or {@code NULL}
	 * @param size  the number of bytes to allocate
	 * @param extra the number of extra bytes to allocate
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static long je_xallocx(ByteBuffer ptr, long size, long extra, int flags) {
		return nje_xallocx(memAddressSafe(ptr), size, extra, flags);
	}

	// --- [ je_sallocx ] ---

	/**
	 * Returns the real size of the allocation at {@code ptr}.
	 *
	 * @param ptr   the allocated memory to query
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static long nje_sallocx(long ptr, int flags) {
		long __functionAddress = Functions.sallocx;
		return invokePP(__functionAddress, ptr, flags);
	}

	/**
	 * Returns the real size of the allocation at {@code ptr}.
	 *
	 * @param ptr   the allocated memory to query
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static long je_sallocx(ByteBuffer ptr, int flags) {
		return nje_sallocx(memAddress(ptr), flags);
	}

	// --- [ je_dallocx ] ---

	/**
	 * Causes the memory referenced by {@code ptr} to be made available for future allocations.
	 *
	 * @param ptr   the allocated memory to deallocate
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static void nje_dallocx(long ptr, int flags) {
		long __functionAddress = Functions.dallocx;
		invokePV(__functionAddress, ptr, flags);
	}

	/**
	 * Causes the memory referenced by {@code ptr} to be made available for future allocations.
	 *
	 * @param ptr   the allocated memory to deallocate
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static void je_dallocx(ByteBuffer ptr, int flags) {
		nje_dallocx(memAddress(ptr), flags);
	}

	/** ShortBuffer version of: {@link #je_dallocx dallocx} */
	public static void je_dallocx(ShortBuffer ptr, int flags) {
		nje_dallocx(memAddress(ptr), flags);
	}

	/** IntBuffer version of: {@link #je_dallocx dallocx} */
	public static void je_dallocx(IntBuffer ptr, int flags) {
		nje_dallocx(memAddress(ptr), flags);
	}

	/** LongBuffer version of: {@link #je_dallocx dallocx} */
	public static void je_dallocx(LongBuffer ptr, int flags) {
		nje_dallocx(memAddress(ptr), flags);
	}

	/** FloatBuffer version of: {@link #je_dallocx dallocx} */
	public static void je_dallocx(FloatBuffer ptr, int flags) {
		nje_dallocx(memAddress(ptr), flags);
	}

	/** DoubleBuffer version of: {@link #je_dallocx dallocx} */
	public static void je_dallocx(DoubleBuffer ptr, int flags) {
		nje_dallocx(memAddress(ptr), flags);
	}

	/** PointerBuffer version of: {@link #je_dallocx dallocx} */
	public static void je_dallocx(PointerBuffer ptr, int flags) {
		nje_dallocx(memAddress(ptr), flags);
	}

	// --- [ je_sdallocx ] ---

	/**
	 * Sized version of {@link #je_dallocx dallocx}. The primary optimization over {@code dallocx()} is the removal of a metadata read, which often suffers an L1 cache miss.
	 *
	 * @param ptr   the allocated memory to deallocate
	 * @param size  the number of bytes in {@code ptr}
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static void nje_sdallocx(long ptr, long size, int flags) {
		long __functionAddress = Functions.sdallocx;
		invokePPV(__functionAddress, ptr, size, flags);
	}

	/**
	 * Sized version of {@link #je_dallocx dallocx}. The primary optimization over {@code dallocx()} is the removal of a metadata read, which often suffers an L1 cache miss.
	 *
	 * @param ptr   the allocated memory to deallocate
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static void je_sdallocx(ByteBuffer ptr, int flags) {
		nje_sdallocx(memAddress(ptr), (long)ptr.remaining(), flags);
	}

	/** ShortBuffer version of: {@link #je_sdallocx sdallocx} */
	public static void je_sdallocx(ShortBuffer ptr, int flags) {
		nje_sdallocx(memAddress(ptr), ptr.remaining() << 1, flags);
	}

	/** IntBuffer version of: {@link #je_sdallocx sdallocx} */
	public static void je_sdallocx(IntBuffer ptr, int flags) {
		nje_sdallocx(memAddress(ptr), ptr.remaining() << 2, flags);
	}

	/** LongBuffer version of: {@link #je_sdallocx sdallocx} */
	public static void je_sdallocx(LongBuffer ptr, int flags) {
		nje_sdallocx(memAddress(ptr), ptr.remaining() << 3, flags);
	}

	/** FloatBuffer version of: {@link #je_sdallocx sdallocx} */
	public static void je_sdallocx(FloatBuffer ptr, int flags) {
		nje_sdallocx(memAddress(ptr), ptr.remaining() << 2, flags);
	}

	/** DoubleBuffer version of: {@link #je_sdallocx sdallocx} */
	public static void je_sdallocx(DoubleBuffer ptr, int flags) {
		nje_sdallocx(memAddress(ptr), ptr.remaining() << 3, flags);
	}

	/** PointerBuffer version of: {@link #je_sdallocx sdallocx} */
	public static void je_sdallocx(PointerBuffer ptr, int flags) {
		nje_sdallocx(memAddress(ptr), ptr.remaining() << POINTER_SHIFT, flags);
	}

	// --- [ je_nallocx ] ---

	/**
	 * Allocates no memory, but it performs the same size computation as the {@link #je_mallocx mallocx} function, and returns the real size of the allocation that would
	 * result from the equivalent {@code mallocx()} function call. Behavior is undefined if {@code size} is 0, or if request size overflows due to size class
	 * and/or alignment constraints.
	 *
	 * @param size  the number of bytes to allocate
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static long nje_nallocx(long size, int flags) {
		long __functionAddress = Functions.nallocx;
		return invokePP(__functionAddress, size, flags);
	}

	/**
	 * Allocates no memory, but it performs the same size computation as the {@link #je_mallocx mallocx} function, and returns the real size of the allocation that would
	 * result from the equivalent {@code mallocx()} function call. Behavior is undefined if {@code size} is 0, or if request size overflows due to size class
	 * and/or alignment constraints.
	 *
	 * @param size  the number of bytes to allocate
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static ByteBuffer je_nallocx(long size, int flags) {
		long __result = nje_nallocx(size, flags);
		return memByteBuffer(__result, (int)size);
	}

	// --- [ je_mallctl ] ---

	/**
	 * Provides a general interface for introspecting the memory allocator, as well as setting modifiable parameters and triggering actions. The
	 * period-separated {@code name} argument specifies a location in a tree-structured namespace; see the
	 * <a href="http://www.canonware.com/download/jemalloc/jemalloc-latest/doc/jemalloc.html#mallctl_namespace">MALLCTL NAMESPACE</a> section for
	 * documentation on the tree contents. To read a value, pass a pointer via {@code oldp} to adequate space to contain the value, and a pointer to its
	 * length via {@code oldlenp}; otherwise pass {@code NULL} and {@code NULL}. Similarly, to write a value, pass a pointer to the value via {@code newp}, and its length
	 * via {@code newlen}; otherwise pass {@code NULL} and {@code 0}.
	 *
	 * @param name    the namespace location
	 * @param oldp    returns a value
	 * @param oldlenp returns the value length
	 * @param newp    the new value
	 * @param newlen  the new value length
	 */
	public static int nje_mallctl(long name, long oldp, long oldlenp, long newp, long newlen) {
		long __functionAddress = Functions.mallctl;
		return invokePPPPPI(__functionAddress, name, oldp, oldlenp, newp, newlen);
	}

	/**
	 * Provides a general interface for introspecting the memory allocator, as well as setting modifiable parameters and triggering actions. The
	 * period-separated {@code name} argument specifies a location in a tree-structured namespace; see the
	 * <a href="http://www.canonware.com/download/jemalloc/jemalloc-latest/doc/jemalloc.html#mallctl_namespace">MALLCTL NAMESPACE</a> section for
	 * documentation on the tree contents. To read a value, pass a pointer via {@code oldp} to adequate space to contain the value, and a pointer to its
	 * length via {@code oldlenp}; otherwise pass {@code NULL} and {@code NULL}. Similarly, to write a value, pass a pointer to the value via {@code newp}, and its length
	 * via {@code newlen}; otherwise pass {@code NULL} and {@code 0}.
	 *
	 * @param name    the namespace location
	 * @param oldp    returns a value
	 * @param oldlenp returns the value length
	 * @param newp    the new value
	 */
	public static int je_mallctl(ByteBuffer name, ByteBuffer oldp, PointerBuffer oldlenp, ByteBuffer newp) {
		if ( CHECKS ) {
			checkNT1(name);
			if ( oldlenp != null ) checkBuffer(oldlenp, 1);
		}
		return nje_mallctl(memAddress(name), memAddressSafe(oldp), memAddressSafe(oldlenp), memAddressSafe(newp), (long)(newp == null ? 0 : newp.remaining()));
	}

	/**
	 * Provides a general interface for introspecting the memory allocator, as well as setting modifiable parameters and triggering actions. The
	 * period-separated {@code name} argument specifies a location in a tree-structured namespace; see the
	 * <a href="http://www.canonware.com/download/jemalloc/jemalloc-latest/doc/jemalloc.html#mallctl_namespace">MALLCTL NAMESPACE</a> section for
	 * documentation on the tree contents. To read a value, pass a pointer via {@code oldp} to adequate space to contain the value, and a pointer to its
	 * length via {@code oldlenp}; otherwise pass {@code NULL} and {@code NULL}. Similarly, to write a value, pass a pointer to the value via {@code newp}, and its length
	 * via {@code newlen}; otherwise pass {@code NULL} and {@code 0}.
	 *
	 * @param name    the namespace location
	 * @param oldp    returns a value
	 * @param oldlenp returns the value length
	 * @param newp    the new value
	 */
	public static int je_mallctl(CharSequence name, ByteBuffer oldp, PointerBuffer oldlenp, ByteBuffer newp) {
		if ( CHECKS )
			if ( oldlenp != null ) checkBuffer(oldlenp, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nje_mallctl(memAddress(nameEncoded), memAddressSafe(oldp), memAddressSafe(oldlenp), memAddressSafe(newp), (long)(newp == null ? 0 : newp.remaining()));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ je_mallctlnametomib ] ---

	/**
	 * Provides a way to avoid repeated name lookups for applications that repeatedly query the same portion of the namespace, by translating a name to a
	 * “Management Information Base” (MIB) that can be passed repeatedly to {@link #je_mallctlbymib mallctlbymib}. Upon successful return from {@code mallctlnametomib()},
	 * {@code mibp} contains an array of {@code *miblenp} integers, where {@code *miblenp} is the lesser of the number of components in name and the input
	 * value of {@code *miblenp}. Thus it is possible to pass a {@code *miblenp} that is smaller than the number of period-separated name components, which
	 * results in a partial MIB that can be used as the basis for constructing a complete MIB. For name components that are integers (e.g. the 2 in
	 * "arenas.bin.2.size"), the corresponding MIB component will always be that integer. Therefore, it is legitimate to construct code like the following:
	 * 
	 * <pre><code>unsigned nbins, i;
size_t mib[4];
size_t len, miblen;

len = sizeof(nbins);
mallctl("arenas.nbins", &nbins, &len, NULL, 0);

miblen = 4;
mallctlnametomib("arenas.bin.0.size", mib, &miblen);
for (i = 0; i < nbins; i++) {
    size_t bin_size;

    mib[2] = i;
    len = sizeof(bin_size);
    mallctlbymib(mib, miblen, &bin_size, &len, NULL, 0);
    // Do something with bin_size...
}</code></pre>
	 *
	 * @param name    the namespace location
	 * @param mibp    an array of integers
	 * @param miblenp the number of components in {@code mibp}
	 */
	public static int nje_mallctlnametomib(long name, long mibp, long miblenp) {
		long __functionAddress = Functions.mallctlnametomib;
		return invokePPPI(__functionAddress, name, mibp, miblenp);
	}

	/**
	 * Provides a way to avoid repeated name lookups for applications that repeatedly query the same portion of the namespace, by translating a name to a
	 * “Management Information Base” (MIB) that can be passed repeatedly to {@link #je_mallctlbymib mallctlbymib}. Upon successful return from {@code mallctlnametomib()},
	 * {@code mibp} contains an array of {@code *miblenp} integers, where {@code *miblenp} is the lesser of the number of components in name and the input
	 * value of {@code *miblenp}. Thus it is possible to pass a {@code *miblenp} that is smaller than the number of period-separated name components, which
	 * results in a partial MIB that can be used as the basis for constructing a complete MIB. For name components that are integers (e.g. the 2 in
	 * "arenas.bin.2.size"), the corresponding MIB component will always be that integer. Therefore, it is legitimate to construct code like the following:
	 * 
	 * <pre><code>unsigned nbins, i;
size_t mib[4];
size_t len, miblen;

len = sizeof(nbins);
mallctl("arenas.nbins", &nbins, &len, NULL, 0);

miblen = 4;
mallctlnametomib("arenas.bin.0.size", mib, &miblen);
for (i = 0; i < nbins; i++) {
    size_t bin_size;

    mib[2] = i;
    len = sizeof(bin_size);
    mallctlbymib(mib, miblen, &bin_size, &len, NULL, 0);
    // Do something with bin_size...
}</code></pre>
	 *
	 * @param name    the namespace location
	 * @param mibp    an array of integers
	 * @param miblenp the number of components in {@code mibp}
	 */
	public static int je_mallctlnametomib(ByteBuffer name, PointerBuffer mibp, PointerBuffer miblenp) {
		if ( CHECKS ) {
			checkNT1(name);
			checkBuffer(miblenp, 1);
			checkBuffer(mibp, miblenp.get(miblenp.position()));
		}
		return nje_mallctlnametomib(memAddress(name), memAddress(mibp), memAddress(miblenp));
	}

	/**
	 * Provides a way to avoid repeated name lookups for applications that repeatedly query the same portion of the namespace, by translating a name to a
	 * “Management Information Base” (MIB) that can be passed repeatedly to {@link #je_mallctlbymib mallctlbymib}. Upon successful return from {@code mallctlnametomib()},
	 * {@code mibp} contains an array of {@code *miblenp} integers, where {@code *miblenp} is the lesser of the number of components in name and the input
	 * value of {@code *miblenp}. Thus it is possible to pass a {@code *miblenp} that is smaller than the number of period-separated name components, which
	 * results in a partial MIB that can be used as the basis for constructing a complete MIB. For name components that are integers (e.g. the 2 in
	 * "arenas.bin.2.size"), the corresponding MIB component will always be that integer. Therefore, it is legitimate to construct code like the following:
	 * 
	 * <pre><code>unsigned nbins, i;
size_t mib[4];
size_t len, miblen;

len = sizeof(nbins);
mallctl("arenas.nbins", &nbins, &len, NULL, 0);

miblen = 4;
mallctlnametomib("arenas.bin.0.size", mib, &miblen);
for (i = 0; i < nbins; i++) {
    size_t bin_size;

    mib[2] = i;
    len = sizeof(bin_size);
    mallctlbymib(mib, miblen, &bin_size, &len, NULL, 0);
    // Do something with bin_size...
}</code></pre>
	 *
	 * @param name    the namespace location
	 * @param mibp    an array of integers
	 * @param miblenp the number of components in {@code mibp}
	 */
	public static int je_mallctlnametomib(CharSequence name, PointerBuffer mibp, PointerBuffer miblenp) {
		if ( CHECKS ) {
			checkBuffer(miblenp, 1);
			checkBuffer(mibp, miblenp.get(miblenp.position()));
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nje_mallctlnametomib(memAddress(nameEncoded), memAddress(mibp), memAddress(miblenp));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ je_mallctlbymib ] ---

	/**
	 * Similar to {@link #je_mallctl mallctl}, but uses MIBs instead of names. See {@link #je_mallctlnametomib mallctlnametomib} for details.
	 *
	 * @param mib     a MIB
	 * @param miblen  the number of elements in {@code mib}
	 * @param oldp    returns a value
	 * @param oldlenp returns the value length
	 * @param newp    the new value
	 * @param newlen  the new value length
	 */
	public static int nje_mallctlbymib(long mib, long miblen, long oldp, long oldlenp, long newp, long newlen) {
		long __functionAddress = Functions.mallctlbymib;
		return invokePPPPPPI(__functionAddress, mib, miblen, oldp, oldlenp, newp, newlen);
	}

	/**
	 * Similar to {@link #je_mallctl mallctl}, but uses MIBs instead of names. See {@link #je_mallctlnametomib mallctlnametomib} for details.
	 *
	 * @param mib     a MIB
	 * @param oldp    returns a value
	 * @param oldlenp returns the value length
	 * @param newp    the new value
	 */
	public static int je_mallctlbymib(PointerBuffer mib, ByteBuffer oldp, PointerBuffer oldlenp, ByteBuffer newp) {
		if ( CHECKS )
			if ( oldlenp != null ) checkBuffer(oldlenp, 1);
		return nje_mallctlbymib(memAddress(mib), (long)mib.remaining(), memAddressSafe(oldp), memAddressSafe(oldlenp), memAddressSafe(newp), (long)(newp == null ? 0 : newp.remaining()));
	}

	// --- [ je_malloc_stats_print ] ---

	/**
	 * Writes human-readable summary statistics via the {@code write_cb} callback function pointer and {@code cbopaque} data passed to {@code write_cb}, or
	 * {@code malloc_message()} if {@code write_cb} is {@code NULL}. This function can be called repeatedly. General information that never changes during execution
	 * can be omitted by specifying "g" as a character within the {@code opts} string. Note that {@code malloc_message()} uses the {@code mallctl*()}
	 * functions internally, so inconsistent statistics can be reported if multiple threads use these functions simultaneously. If {@code --enable-stats} is
	 * specified during configuration, “m” and “a” can be specified to omit merged arena and per arena statistics, respectively; “b” and “l” can be specified to
	 * omit per size class statistics for bins and large objects, respectively. Unrecognized characters are silently ignored. Note that thread caching may
	 * prevent some statistics from being completely up to date, since extra locking would be required to merge counters that track thread cache operations.
	 *
	 * @param write_cb    the print callback, or {@code NULL} to use {@code malloc_message()}
	 * @param je_cbopaque an opaque pointer that will be passed to {@code write_cb}
	 * @param opts        an options string
	 */
	public static void nje_malloc_stats_print(long write_cb, long je_cbopaque, long opts) {
		long __functionAddress = Functions.malloc_stats_print;
		invokePPPV(__functionAddress, write_cb, je_cbopaque, opts);
	}

	/**
	 * Writes human-readable summary statistics via the {@code write_cb} callback function pointer and {@code cbopaque} data passed to {@code write_cb}, or
	 * {@code malloc_message()} if {@code write_cb} is {@code NULL}. This function can be called repeatedly. General information that never changes during execution
	 * can be omitted by specifying "g" as a character within the {@code opts} string. Note that {@code malloc_message()} uses the {@code mallctl*()}
	 * functions internally, so inconsistent statistics can be reported if multiple threads use these functions simultaneously. If {@code --enable-stats} is
	 * specified during configuration, “m” and “a” can be specified to omit merged arena and per arena statistics, respectively; “b” and “l” can be specified to
	 * omit per size class statistics for bins and large objects, respectively. Unrecognized characters are silently ignored. Note that thread caching may
	 * prevent some statistics from being completely up to date, since extra locking would be required to merge counters that track thread cache operations.
	 *
	 * @param write_cb    the print callback, or {@code NULL} to use {@code malloc_message()}
	 * @param je_cbopaque an opaque pointer that will be passed to {@code write_cb}
	 * @param opts        an options string
	 */
	public static void je_malloc_stats_print(MallocMessageCallbackI write_cb, ByteBuffer je_cbopaque, ByteBuffer opts) {
		if ( CHECKS )
			if ( opts != null ) checkNT1(opts);
		nje_malloc_stats_print(write_cb == null ? NULL : write_cb.address(), memAddressSafe(je_cbopaque), memAddressSafe(opts));
	}

	/**
	 * Writes human-readable summary statistics via the {@code write_cb} callback function pointer and {@code cbopaque} data passed to {@code write_cb}, or
	 * {@code malloc_message()} if {@code write_cb} is {@code NULL}. This function can be called repeatedly. General information that never changes during execution
	 * can be omitted by specifying "g" as a character within the {@code opts} string. Note that {@code malloc_message()} uses the {@code mallctl*()}
	 * functions internally, so inconsistent statistics can be reported if multiple threads use these functions simultaneously. If {@code --enable-stats} is
	 * specified during configuration, “m” and “a” can be specified to omit merged arena and per arena statistics, respectively; “b” and “l” can be specified to
	 * omit per size class statistics for bins and large objects, respectively. Unrecognized characters are silently ignored. Note that thread caching may
	 * prevent some statistics from being completely up to date, since extra locking would be required to merge counters that track thread cache operations.
	 *
	 * @param write_cb    the print callback, or {@code NULL} to use {@code malloc_message()}
	 * @param je_cbopaque an opaque pointer that will be passed to {@code write_cb}
	 * @param opts        an options string
	 */
	public static void je_malloc_stats_print(MallocMessageCallbackI write_cb, ByteBuffer je_cbopaque, CharSequence opts) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer optsEncoded = stack.ASCII(opts);
			nje_malloc_stats_print(write_cb == null ? NULL : write_cb.address(), memAddressSafe(je_cbopaque), memAddressSafe(optsEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ je_malloc_usable_size ] ---

	/**
	 * Returns the usable size of the allocation pointed to by {@code ptr}. The return value may be larger than the size that was requested during allocation.
	 * The {@code malloc_usable_size()} function is not a mechanism for in-place {@link #je_realloc realloc}; rather it is provided solely as a tool for introspection
	 * purposes. Any discrepancy between the requested allocation size and the size reported by {@code malloc_usable_size()} should not be depended on, since
	 * such behavior is entirely implementation-dependent.
	 *
	 * @param ptr the allocated memory to query
	 */
	public static long nje_malloc_usable_size(long ptr) {
		long __functionAddress = Functions.malloc_usable_size;
		return invokePP(__functionAddress, ptr);
	}

	/**
	 * Returns the usable size of the allocation pointed to by {@code ptr}. The return value may be larger than the size that was requested during allocation.
	 * The {@code malloc_usable_size()} function is not a mechanism for in-place {@link #je_realloc realloc}; rather it is provided solely as a tool for introspection
	 * purposes. Any discrepancy between the requested allocation size and the size reported by {@code malloc_usable_size()} should not be depended on, since
	 * such behavior is entirely implementation-dependent.
	 *
	 * @param ptr the allocated memory to query
	 */
	public static long je_malloc_usable_size(ByteBuffer ptr) {
		return nje_malloc_usable_size(memAddress(ptr));
	}

	/** short[] version of: {@link #je_free free} */
	public static void je_free(short[] ptr) {
		long __functionAddress = Functions.free;
		invokePV(__functionAddress, ptr);
	}

	/** int[] version of: {@link #je_free free} */
	public static void je_free(int[] ptr) {
		long __functionAddress = Functions.free;
		invokePV(__functionAddress, ptr);
	}

	/** long[] version of: {@link #je_free free} */
	public static void je_free(long[] ptr) {
		long __functionAddress = Functions.free;
		invokePV(__functionAddress, ptr);
	}

	/** float[] version of: {@link #je_free free} */
	public static void je_free(float[] ptr) {
		long __functionAddress = Functions.free;
		invokePV(__functionAddress, ptr);
	}

	/** double[] version of: {@link #je_free free} */
	public static void je_free(double[] ptr) {
		long __functionAddress = Functions.free;
		invokePV(__functionAddress, ptr);
	}

	/** short[] version of: {@link #je_dallocx dallocx} */
	public static void je_dallocx(short[] ptr, int flags) {
		long __functionAddress = Functions.dallocx;
		invokePV(__functionAddress, ptr, flags);
	}

	/** int[] version of: {@link #je_dallocx dallocx} */
	public static void je_dallocx(int[] ptr, int flags) {
		long __functionAddress = Functions.dallocx;
		invokePV(__functionAddress, ptr, flags);
	}

	/** long[] version of: {@link #je_dallocx dallocx} */
	public static void je_dallocx(long[] ptr, int flags) {
		long __functionAddress = Functions.dallocx;
		invokePV(__functionAddress, ptr, flags);
	}

	/** float[] version of: {@link #je_dallocx dallocx} */
	public static void je_dallocx(float[] ptr, int flags) {
		long __functionAddress = Functions.dallocx;
		invokePV(__functionAddress, ptr, flags);
	}

	/** double[] version of: {@link #je_dallocx dallocx} */
	public static void je_dallocx(double[] ptr, int flags) {
		long __functionAddress = Functions.dallocx;
		invokePV(__functionAddress, ptr, flags);
	}

	/** short[] version of: {@link #je_sdallocx sdallocx} */
	public static void je_sdallocx(short[] ptr, int flags) {
		long __functionAddress = Functions.sdallocx;
		invokePPV(__functionAddress, ptr, (long)(ptr.length << 1), flags);
	}

	/** int[] version of: {@link #je_sdallocx sdallocx} */
	public static void je_sdallocx(int[] ptr, int flags) {
		long __functionAddress = Functions.sdallocx;
		invokePPV(__functionAddress, ptr, (long)(ptr.length << 2), flags);
	}

	/** long[] version of: {@link #je_sdallocx sdallocx} */
	public static void je_sdallocx(long[] ptr, int flags) {
		long __functionAddress = Functions.sdallocx;
		invokePPV(__functionAddress, ptr, (long)(ptr.length << 3), flags);
	}

	/** float[] version of: {@link #je_sdallocx sdallocx} */
	public static void je_sdallocx(float[] ptr, int flags) {
		long __functionAddress = Functions.sdallocx;
		invokePPV(__functionAddress, ptr, (long)(ptr.length << 2), flags);
	}

	/** double[] version of: {@link #je_sdallocx sdallocx} */
	public static void je_sdallocx(double[] ptr, int flags) {
		long __functionAddress = Functions.sdallocx;
		invokePPV(__functionAddress, ptr, (long)(ptr.length << 3), flags);
	}

}