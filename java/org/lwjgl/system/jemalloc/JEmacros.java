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
import static org.lwjgl.system.MemoryUtil.*;

/** Macros for jemalloc. */
public final class JEmacros {

	static { LWJGLUtil.initialize(); }

	private JEmacros() {}

	// --- [ JEMALLOC_VERSION ] ---

	/** JNI method for {@link #JEMALLOC_VERSION} */
	@JavadocExclude
	public static native long nJEMALLOC_VERSION();

	/** Returns the version string. */
	public static String JEMALLOC_VERSION() {
		long __result = nJEMALLOC_VERSION();
		return memDecodeASCII(__result);
	}

	// --- [ JEMALLOC_VERSION_MAJOR ] ---

	/** Returns the major version. */
	public static native int JEMALLOC_VERSION_MAJOR();

	// --- [ JEMALLOC_VERSION_MINOR ] ---

	/** Returns the minor version. */
	public static native int JEMALLOC_VERSION_MINOR();

	// --- [ JEMALLOC_VERSION_BUGFIX ] ---

	/** Returns the bugfix version. */
	public static native int JEMALLOC_VERSION_BUGFIX();

	// --- [ JEMALLOC_VERSION_NREV ] ---

	/** Returns the revision number. */
	public static native int JEMALLOC_VERSION_NREV();

	// --- [ JEMALLOC_VERSION_GID ] ---

	/** JNI method for {@link #JEMALLOC_VERSION_GID} */
	@JavadocExclude
	public static native long nJEMALLOC_VERSION_GID();

	/** Returns the globally unique identifier (git commit hash). */
	public static String JEMALLOC_VERSION_GID() {
		long __result = nJEMALLOC_VERSION_GID();
		return memDecodeASCII(__result);
	}

	// --- [ MALLOCX_LG_ALIGN ] ---

	/**
	 * Align the memory allocation to start at an address that is a multiple of {@code (1 << la)}. This macro does not validate that {@code la} is within the
	 * valid range.
	 *
	 * @param la the alignment shift
	 */
	public static native int MALLOCX_LG_ALIGN(int la);

	// --- [ MALLOCX_ALIGN ] ---

	/**
	 * Align the memory allocation to start at an address that is a multiple of {@code a}, where {@code a} is a power of two. This macro does not validate
	 * that {@code a} is a power of 2.
	 *
	 * @param a the alignment
	 */
	public static native int MALLOCX_ALIGN(long a);

	// --- [ MALLOCX_ZERO ] ---

	/**
	 * Initialize newly allocated memory to contain zero bytes. In the growing reallocation case, the real size prior to reallocation defines the boundary
	 * between untouched bytes and those that are initialized to contain zero bytes. If this macro is absent, newly allocated memory is uninitialized.
	 */
	public static native int MALLOCX_ZERO();

	// --- [ MALLOCX_TCACHE ] ---

	/**
	 * Use the thread-specific cache (tcache) specified by the identifier {@code tc}, which must have been acquired via the {@code tcache.create} mallctl.
	 * This macro does not validate that {@code tc} specifies a valid identifier.
	 *
	 * @param tc the thread-specific cache
	 */
	public static native int MALLOCX_TCACHE(int tc);

	// --- [ MALLOCX_TCACHE_NONE ] ---

	/**
	 * Do not use a thread-specific cache (tcache).  Unless {@link #MALLOCX_TCACHE} or {@code MALLOCX_TCACHE_NONE} is specified, an automatically managed tcache
	 * will be used under many circumstances. This macro cannot be used in the same {@code flags} argument as {@code MALLOCX_TCACHE(tc)}.
	 */
	public static native int MALLOCX_TCACHE_NONE();

	// --- [ MALLOCX_ARENA ] ---

	/**
	 * Use the arena specified by the index {@code a} (and by necessity bypass the thread cache). This macro has no effect for huge regions, nor for regions
	 * that were allocated via an arena other than the one specified. This macro does not validate that {@code a} specifies an arena index in the valid range.
	 *
	 * @param a the arena index
	 */
	public static native int MALLOCX_ARENA(int a);

}