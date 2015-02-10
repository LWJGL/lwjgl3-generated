/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** Native bindings to <fcntl.h>. */
public final class Fcntl {

	/** {@link #open} flags. */
	public static final int
		O_ACCMODE   = 0x3,
		O_RDONLY    = 0x0,
		O_WRONLY    = 0x1,
		O_RDWR      = 0x2,
		O_CREAT     = 0x100,
		O_EXCL      = 0x200,
		O_NOCTTY    = 0x400,
		O_TRUNC     = 0x1000,
		O_APPEND    = 0x2000,
		O_NONBLOCK  = 0x4000,
		O_DSYNC     = 0x10000,
		FASYNC      = 0x20000,
		O_DIRECT    = 0x40000,
		O_LARGEFILE = 0x100000,
		O_DIRECTORY = 0x200000,
		O_NOFOLLOW  = 0x400000,
		O_NOATIME   = 0x1000000,
		O_CLOEXEC   = 0x2000000;

	static { LWJGLUtil.initialize(); }

	private Fcntl() {}

	// --- [ open ] ---

	/** JNI method for {@link #open} */
	@JavadocExclude
	public static native int nopen(long pathname, int flags);

	/**
	 * Given a pathname for a file, {@code open()} returns a file descriptor, a small, nonnegative integer for use in subsequent system calls. The file
	 * descriptor returned by a successful call will be the lowest-numbered file descriptor not currently open for the process.
	 *
	 * @param pathname the file path
	 * @param flags    the flags bitfield
	 */
	public static int open(ByteBuffer pathname, int flags) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(pathname);
		return nopen(memAddress(pathname), flags);
	}

	/** CharSequence version of: {@link #open} */
	public static int open(CharSequence pathname, int flags) {
		APIBuffer __buffer = apiBuffer();
		int pathnameEncoded = __buffer.stringParamASCII(pathname, true);
		return nopen(__buffer.address(pathnameEncoded), flags);
	}

}