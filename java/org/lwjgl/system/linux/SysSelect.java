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

/** Native bindings to <sys/select.h>. */
public final class SysSelect {

	static { LWJGLUtil.initialize(); }

	private SysSelect() {}

	// --- [ FD_CLR ] ---

	/** JNI method for {@link #FD_CLR} */
	@JavadocExclude
	public static native void nFD_CLR(int fd, long set);

	/**
	 * Removes a file descriptor from the set.
	 *
	 * @param fd  the file descriptor to remove
	 * @param set the file descriptor set from which to remvoe
	 */
	public static void FD_CLR(int fd, long set) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(set);
		nFD_CLR(fd, set);
	}

	// --- [ FD_ISSET ] ---

	/** JNI method for {@link #FD_ISSET} */
	@JavadocExclude
	public static native int nFD_ISSET(int fd, long set);

	/**
	 * Tests to see if a file descriptor is part of the set.
	 *
	 * @param fd  the file descriptor to test
	 * @param set the file descriptor set to test
	 */
	public static int FD_ISSET(int fd, long set) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(set);
		return nFD_ISSET(fd, set);
	}

	// --- [ FD_SET ] ---

	/** JNI method for {@link #FD_SET} */
	@JavadocExclude
	public static native void nFD_SET(int fd, long set);

	/**
	 * Adds a file descriptor to the set.
	 *
	 * @param fd  the file descriptor to add
	 * @param set the file descriptor set to which to add
	 */
	public static void FD_SET(int fd, long set) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(set);
		nFD_SET(fd, set);
	}

	// --- [ FD_ZERO ] ---

	/** JNI method for {@link #FD_ZERO} */
	@JavadocExclude
	public static native void nFD_ZERO(long set);

	/**
	 * Clears a file descriptor set.
	 *
	 * @param set the file descriptor set to clear
	 */
	public static void FD_ZERO(long set) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(set);
		nFD_ZERO(set);
	}

	// --- [ select ] ---

	/** JNI method for {@link #select} */
	@JavadocExclude
	public static native int nselect(int nfds, long readfds, long writefds, long exceptfds, long timeout);

	/**
	 * Allows a program to monitor multiple file descriptors, waiting until one or more of the file descriptors become "ready" for some class of I/O operation
	 * (e.g., input possible). A file descriptor is considered ready if it is possible to perform the corresponding I/O operation (e.g., read(2)) without
	 * blocking.
	 *
	 * @param nfds      the highest-numbered file descriptor in any of the three sets, plus 1
	 * @param readfds   the set of file descriptors to watch for reads
	 * @param writefds  the set of file descriptors to watch for writes
	 * @param exceptfds the set of file descriptors to watch for exceptions
	 * @param timeout   an upper bound on the amount of time elapsed before {@code select()} returns. If both fields of the {@link timeval} structure are zero, then
	 *                  {@code select()} returns immediately. (This is useful for polling.) If {@code timeout} is {@code NULL} (no timeout), {@code select()} can block
	 *                  indefinitely.
	 */
	public static int select(int nfds, long readfds, long writefds, long exceptfds, ByteBuffer timeout) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(readfds);
			checkPointer(writefds);
			checkPointer(exceptfds);
			if ( timeout != null ) checkBuffer(timeout, timeval.SIZEOF);
		}
		return nselect(nfds, readfds, writefds, exceptfds, memAddressSafe(timeout));
	}

}