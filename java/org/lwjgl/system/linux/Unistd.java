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

/** Native bindings to <unistd.h>. */
public final class Unistd {

	static { LWJGLUtil.initialize(); }

	private Unistd() {}

	// --- [ close ] ---

	/**
	 * Closes a file descriptor, so that it no longer refers to any file and may be reused.  Any record locks held on the file it was associated with, and
	 * owned by the process, are removed (regardless of the file descriptor that was used to obtain the lock).
	 *
	 * @param fd the file descriptor to close
	 */
	public static native int close(int fd);

	// --- [ read ] ---

	/** JNI method for {@link #read} */
	@JavadocExclude
	public static native long nread(int fd, long buf, long count);

	/**
	 * Attempts to read up to {@code count} bytes from file descriptor {@code fd} into the buffer starting at {@code buf}.
	 *
	 * @param fd    the file descriptor to read
	 * @param buf   the buffer
	 * @param count the number of bytes to read
	 */
	public static long read(int fd, ByteBuffer buf, long count) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buf, count);
		return nread(fd, memAddress(buf), count);
	}

	/** Alternative version of: {@link #read} */
	public static long read(int fd, ByteBuffer buf) {
		return nread(fd, memAddress(buf), buf.remaining());
	}

}