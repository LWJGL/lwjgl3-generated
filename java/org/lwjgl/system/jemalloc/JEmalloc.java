/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

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
public final class JEmalloc {

	/** Function address. */
	@JavadocExclude
	public final long
		malloc_message,
		malloc,
		calloc,
		posix_memalign,
		aligned_alloc,
		realloc,
		free,
		mallocx,
		rallocx,
		xallocx,
		sallocx,
		dallocx,
		sdallocx,
		nallocx,
		mallctl,
		mallctlnametomib,
		mallctlbymib,
		malloc_stats_print,
		malloc_usable_size;

	@JavadocExclude
	public JEmalloc(FunctionProvider provider) {
		malloc_message = checkFunctionAddress(provider.getFunctionAddress("je_malloc_message"));
		malloc = checkFunctionAddress(provider.getFunctionAddress("je_malloc"));
		calloc = checkFunctionAddress(provider.getFunctionAddress("je_calloc"));
		posix_memalign = checkFunctionAddress(provider.getFunctionAddress("je_posix_memalign"));
		aligned_alloc = checkFunctionAddress(provider.getFunctionAddress("je_aligned_alloc"));
		realloc = checkFunctionAddress(provider.getFunctionAddress("je_realloc"));
		free = checkFunctionAddress(provider.getFunctionAddress("je_free"));
		mallocx = checkFunctionAddress(provider.getFunctionAddress("je_mallocx"));
		rallocx = checkFunctionAddress(provider.getFunctionAddress("je_rallocx"));
		xallocx = checkFunctionAddress(provider.getFunctionAddress("je_xallocx"));
		sallocx = checkFunctionAddress(provider.getFunctionAddress("je_sallocx"));
		dallocx = checkFunctionAddress(provider.getFunctionAddress("je_dallocx"));
		sdallocx = checkFunctionAddress(provider.getFunctionAddress("je_sdallocx"));
		nallocx = checkFunctionAddress(provider.getFunctionAddress("je_nallocx"));
		mallctl = checkFunctionAddress(provider.getFunctionAddress("je_mallctl"));
		mallctlnametomib = checkFunctionAddress(provider.getFunctionAddress("je_mallctlnametomib"));
		mallctlbymib = checkFunctionAddress(provider.getFunctionAddress("je_mallctlbymib"));
		malloc_stats_print = checkFunctionAddress(provider.getFunctionAddress("je_malloc_stats_print"));
		malloc_usable_size = checkFunctionAddress(provider.getFunctionAddress("je_malloc_usable_size"));
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link JEmalloc} instance. */
	public static JEmalloc getInstance() {
		return LibJEmalloc.__JEmalloc;
	}

	// --- [ je_malloc_message ] ---

	/** Returns the {@code je_malloc_message} variable. */
	public static PointerBuffer je_malloc_message() {
		long __result = getInstance().malloc_message;
		return memPointerBuffer(__result, 1);
	}

	// --- [ je_malloc ] ---

	/** Unsafe version of {@link #je_malloc malloc} */
	@JavadocExclude
	public static long nje_malloc(long size) {
		long __functionAddress = getInstance().malloc;
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

	/** Unsafe version of {@link #je_calloc calloc} */
	@JavadocExclude
	public static long nje_calloc(long num, long size) {
		long __functionAddress = getInstance().calloc;
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

	/** Unsafe version of {@link #je_posix_memalign posix_memalign} */
	@JavadocExclude
	public static int nje_posix_memalign(long memptr, long alignment, long size) {
		long __functionAddress = getInstance().posix_memalign;
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
	public static int je_posix_memalign(ByteBuffer memptr, long alignment, long size) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(memptr, 1 << POINTER_SHIFT);
		return nje_posix_memalign(memAddress(memptr), alignment, size);
	}

	/** Alternative version of: {@link #je_posix_memalign posix_memalign} */
	public static int je_posix_memalign(PointerBuffer memptr, long alignment, long size) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(memptr, 1);
		return nje_posix_memalign(memAddress(memptr), alignment, size);
	}

	// --- [ je_aligned_alloc ] ---

	/** Unsafe version of {@link #je_aligned_alloc aligned_alloc} */
	@JavadocExclude
	public static long nje_aligned_alloc(long alignment, long size) {
		long __functionAddress = getInstance().aligned_alloc;
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

	/** Unsafe version of {@link #je_realloc realloc} */
	@JavadocExclude
	public static long nje_realloc(long ptr, long size) {
		long __functionAddress = getInstance().realloc;
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

	/** Unsafe version of {@link #je_free free} */
	@JavadocExclude
	public static void nje_free(long ptr) {
		long __functionAddress = getInstance().free;
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

	// --- [ je_mallocx ] ---

	/** Unsafe version of {@link #je_mallocx mallocx} */
	@JavadocExclude
	public static long nje_mallocx(long size, int flags) {
		long __functionAddress = getInstance().mallocx;
		return invokePIP(__functionAddress, size, flags);
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

	/** Unsafe version of {@link #je_rallocx rallocx} */
	@JavadocExclude
	public static long nje_rallocx(long ptr, long size, int flags) {
		long __functionAddress = getInstance().rallocx;
		return invokePPIP(__functionAddress, ptr, size, flags);
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

	/** Unsafe version of {@link #je_xallocx xallocx} */
	@JavadocExclude
	public static long nje_xallocx(long ptr, long size, long extra, int flags) {
		long __functionAddress = getInstance().xallocx;
		return invokePPPIP(__functionAddress, ptr, size, extra, flags);
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

	/** Unsafe version of {@link #je_sallocx sallocx} */
	@JavadocExclude
	public static long nje_sallocx(long ptr, int flags) {
		long __functionAddress = getInstance().sallocx;
		return invokePIP(__functionAddress, ptr, flags);
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

	/** Unsafe version of {@link #je_dallocx dallocx} */
	@JavadocExclude
	public static void nje_dallocx(long ptr, int flags) {
		long __functionAddress = getInstance().dallocx;
		invokePIV(__functionAddress, ptr, flags);
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

	// --- [ je_sdallocx ] ---

	/** Unsafe version of {@link #je_sdallocx sdallocx} */
	@JavadocExclude
	public static void nje_sdallocx(long ptr, long size, int flags) {
		long __functionAddress = getInstance().sdallocx;
		invokePPIV(__functionAddress, ptr, size, flags);
	}

	/**
	 * Sized version of {@link #je_dallocx dallocx}. The primary optimization over {@code dallocx()} is the removal of a metadata read, which often suffers an L1 cache miss.
	 *
	 * @param ptr   the allocated memory to deallocate
	 * @param size  the number of bytes in {@code ptr}
	 * @param flags a bitfield of zero or more of the {@code MALLOCX} macros in {@link JEmacros}
	 */
	public static void je_sdallocx(ByteBuffer ptr, long size, int flags) {
		nje_sdallocx(memAddress(ptr), size, flags);
	}

	// --- [ je_nallocx ] ---

	/** Unsafe version of {@link #je_nallocx nallocx} */
	@JavadocExclude
	public static long nje_nallocx(long size, int flags) {
		long __functionAddress = getInstance().nallocx;
		return invokePIP(__functionAddress, size, flags);
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

	/** Unsafe version of {@link #je_mallctl mallctl} */
	@JavadocExclude
	public static int nje_mallctl(long name, long oldp, long oldlenp, long newp, long newlen) {
		long __functionAddress = getInstance().mallctl;
		return invokePPPPPI(__functionAddress, name, oldp, oldlenp, newp, newlen);
	}

	/**
	 * Provides a general interface for introspecting the memory allocator, as well as setting modifiable parameters and triggering actions. The
	 * period-separated {@code name} argument specifies a location in a tree-structured namespace; see the
	 * <a href="http://www.canonware.com/download/jemalloc/jemalloc-latest/doc/{@link jemalloc.html#mallctl_namespace}">MALLCTL NAMESPACE</a> section for
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
	public static int je_mallctl(ByteBuffer name, ByteBuffer oldp, ByteBuffer oldlenp, ByteBuffer newp, long newlen) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(name);
			if ( oldlenp != null ) checkBuffer(oldlenp, 1 << POINTER_SHIFT);
			if ( newp != null ) checkBuffer(newp, newlen);
		}
		return nje_mallctl(memAddress(name), memAddressSafe(oldp), memAddressSafe(oldlenp), memAddressSafe(newp), newlen);
	}

	/** Alternative version of: {@link #je_mallctl mallctl} */
	public static int je_mallctl(ByteBuffer name, ByteBuffer oldp, PointerBuffer oldlenp, ByteBuffer newp) {
		if ( LWJGLUtil.CHECKS )
			if ( oldlenp != null ) checkBuffer(oldlenp, 1);
		return nje_mallctl(memAddress(name), memAddressSafe(oldp), memAddressSafe(oldlenp), memAddressSafe(newp), newp == null ? 0 : newp.remaining());
	}

	/** CharSequence version of: {@link #je_mallctl mallctl} */
	public static int je_mallctl(CharSequence name, ByteBuffer oldp, PointerBuffer oldlenp, ByteBuffer newp) {
		if ( LWJGLUtil.CHECKS )
			if ( oldlenp != null ) checkBuffer(oldlenp, 1);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nje_mallctl(__buffer.address(nameEncoded), memAddressSafe(oldp), memAddressSafe(oldlenp), memAddressSafe(newp), newp == null ? 0 : newp.remaining());
	}

	// --- [ je_mallctlnametomib ] ---

	/** Unsafe version of {@link #je_mallctlnametomib mallctlnametomib} */
	@JavadocExclude
	public static int nje_mallctlnametomib(long name, long mibp, long miblenp) {
		long __functionAddress = getInstance().mallctlnametomib;
		return invokePPPI(__functionAddress, name, mibp, miblenp);
	}

	/**
	 * Provides a way to avoid repeated name lookups for applications that repeatedly query the same portion of the namespace, by translating a name to a
	 * “Management Information Base” (MIB) that can be passed repeatedly to {@link #je_mallctlbymib mallctlbymib}. Upon successful return from {@code mallctlnametomib()},
	 * {@code mibp} contains an array of {@code *miblenp} integers, where {@code *miblenp} is the lesser of the number of components in name and the input
	 * value of {@code *miblenp}. Thus it is possible to pass a {@code *miblenp} that is smaller than the number of period-separated name components, which
	 * results in a partial MIB that can be used as the basis for constructing a complete MIB. For name components that are integers (e.g. the 2 in
	 * "arenas.bin.2.size"), the corresponding MIB component will always be that integer. Therefore, it is legitimate to construct code like the following:
	 * <pre><code style="font-family: monospace">
	 * unsigned nbins, i;
	 * size_t mib[4];
	 * size_t len, miblen;
	 * 
	 * len = sizeof(nbins);
	 * mallctl("arenas.nbins", &nbins, &len, NULL, 0);
	 * 
	 * miblen = 4;
	 * mallctlnametomib("arenas.bin.0.size", mib, &miblen);
	 * for (i = 0; i < nbins; i++) {
	 * 	size_t bin_size;
	 * 
	 * 	mib[2] = i;
	 * 	len = sizeof(bin_size);
	 * 	mallctlbymib(mib, miblen, &bin_size, &len, NULL, 0);
	 * 	// Do something with bin_size...
	 * }</code></pre>
	 *
	 * @param name    the namespace location
	 * @param mibp    an array of integers
	 * @param miblenp the number of components in {@code mibp}
	 */
	public static int je_mallctlnametomib(ByteBuffer name, ByteBuffer mibp, ByteBuffer miblenp) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(name);
			checkBuffer(miblenp, 1 << POINTER_SHIFT);
			checkBuffer(mibp, (PointerBuffer.get(miblenp, miblenp.position())) << POINTER_SHIFT);
		}
		return nje_mallctlnametomib(memAddress(name), memAddress(mibp), memAddress(miblenp));
	}

	/** Alternative version of: {@link #je_mallctlnametomib mallctlnametomib} */
	public static int je_mallctlnametomib(ByteBuffer name, PointerBuffer mibp, PointerBuffer miblenp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(miblenp, 1);
			checkBuffer(mibp, miblenp.get(miblenp.position()));
		}
		return nje_mallctlnametomib(memAddress(name), memAddress(mibp), memAddress(miblenp));
	}

	/** CharSequence version of: {@link #je_mallctlnametomib mallctlnametomib} */
	public static int je_mallctlnametomib(CharSequence name, PointerBuffer mibp, PointerBuffer miblenp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(miblenp, 1);
			checkBuffer(mibp, miblenp.get(miblenp.position()));
		}
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nje_mallctlnametomib(__buffer.address(nameEncoded), memAddress(mibp), memAddress(miblenp));
	}

	// --- [ je_mallctlbymib ] ---

	/** Unsafe version of {@link #je_mallctlbymib mallctlbymib} */
	@JavadocExclude
	public static int nje_mallctlbymib(long mib, long miblen, long oldp, long oldlenp, long newp, long newlen) {
		long __functionAddress = getInstance().mallctlbymib;
		return invokePPPPPPI(__functionAddress, mib, miblen, oldp, oldlenp, newp, newlen);
	}

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
	public static int je_mallctlbymib(ByteBuffer mib, long miblen, ByteBuffer oldp, ByteBuffer oldlenp, ByteBuffer newp, long newlen) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(mib, miblen << POINTER_SHIFT);
			if ( oldlenp != null ) checkBuffer(oldlenp, 1 << POINTER_SHIFT);
			if ( newp != null ) checkBuffer(newp, newlen);
		}
		return nje_mallctlbymib(memAddress(mib), miblen, memAddressSafe(oldp), memAddressSafe(oldlenp), memAddressSafe(newp), newlen);
	}

	/** Alternative version of: {@link #je_mallctlbymib mallctlbymib} */
	public static int je_mallctlbymib(PointerBuffer mib, ByteBuffer oldp, PointerBuffer oldlenp, ByteBuffer newp) {
		if ( LWJGLUtil.CHECKS )
			if ( oldlenp != null ) checkBuffer(oldlenp, 1);
		return nje_mallctlbymib(memAddress(mib), mib.remaining(), memAddressSafe(oldp), memAddressSafe(oldlenp), memAddressSafe(newp), newp == null ? 0 : newp.remaining());
	}

	// --- [ je_malloc_stats_print ] ---

	/** Unsafe version of {@link #je_malloc_stats_print malloc_stats_print} */
	@JavadocExclude
	public static void nje_malloc_stats_print(long write_cb, long je_cbopaque, long opts) {
		long __functionAddress = getInstance().malloc_stats_print;
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
	public static void je_malloc_stats_print(MallocMessageCallback write_cb, ByteBuffer je_cbopaque, ByteBuffer opts) {
		if ( LWJGLUtil.CHECKS )
			if ( opts != null ) checkNT1(opts);
		nje_malloc_stats_print(write_cb == null ? NULL : write_cb.address(), memAddressSafe(je_cbopaque), memAddressSafe(opts));
	}

	/** CharSequence version of: {@link #je_malloc_stats_print malloc_stats_print} */
	public static void je_malloc_stats_print(MallocMessageCallback write_cb, ByteBuffer je_cbopaque, CharSequence opts) {
		APIBuffer __buffer = apiBuffer();
		int optsEncoded = __buffer.stringParamASCII(opts, true);
		nje_malloc_stats_print(write_cb == null ? NULL : write_cb.address(), memAddressSafe(je_cbopaque), __buffer.addressSafe(opts, optsEncoded));
	}

	// --- [ je_malloc_usable_size ] ---

	/** Unsafe version of {@link #je_malloc_usable_size malloc_usable_size} */
	@JavadocExclude
	public static long nje_malloc_usable_size(long ptr) {
		long __functionAddress = getInstance().malloc_usable_size;
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

}