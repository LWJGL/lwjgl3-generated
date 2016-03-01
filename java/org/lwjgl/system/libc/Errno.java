/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libc;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to errno.h. */
public class Errno {

	/** Operation not permitted */
	public static final int EPERM = 0x1;

	/** No such file or directory */
	public static final int ENOENT = 0x2;

	/** No such process */
	public static final int ESRCH = 0x3;

	/** Interrupted function */
	public static final int EINTR = 0x4;

	/** I/O error */
	public static final int EIO = 0x5;

	/** No such device or address */
	public static final int ENXIO = 0x6;

	/** Argument list too long */
	public static final int E2BIG = 0x7;

	/** Exec format error */
	public static final int ENOEXEC = 0x8;

	/** Bad file number */
	public static final int EBADF = 0x9;

	/** No spawned processes */
	public static final int ECHILD = 0xA;

	/** No more processes or not enough memory or maximum nesting level reached */
	public static final int EAGAIN = 0xB;

	/** Not enough memory */
	public static final int ENOMEM = 0xC;

	/** Permission denied */
	public static final int EACCES = 0xD;

	/** Bad address */
	public static final int EFAULT = 0xE;

	/** Device or resource busy */
	public static final int EBUSY = 0x10;

	/** File exists */
	public static final int EEXIST = 0x11;

	/** Cross-device link */
	public static final int EXDEV = 0x12;

	/** No such device */
	public static final int ENODEV = 0x13;

	/** Not a directory */
	public static final int ENOTDIR = 0x14;

	/** Is a directory */
	public static final int EISDIR = 0x15;

	/** Invalid argument */
	public static final int EINVAL = 0x16;

	/** Too many files open in system */
	public static final int ENFILE = 0x17;

	/** Too many open files */
	public static final int EMFILE = 0x18;

	/** Inappropriate I/O control operation */
	public static final int ENOTTY = 0x19;

	/** File too large */
	public static final int EFBIG = 0x1B;

	/** No space left on device */
	public static final int ENOSPC = 0x1C;

	/** Invalid seek */
	public static final int ESPIPE = 0x1D;

	/** Read-only file system */
	public static final int EROFS = 0x1E;

	/** Too many links */
	public static final int EMLINK = 0x1F;

	/** Broken pipe */
	public static final int EPIPE = 0x20;

	/** Math argument */
	public static final int EDOM = 0x21;

	/** Result too large */
	public static final int ERANGE = 0x22;

	/** Resource deadlock would occur */
	public static final int EDEADLK = 0x24;

	/** Same as EDEADLK for compatibility with older Microsoft C versions */
	public static final int EDEADLOCK = 0x24;

	/** Filename too long */
	public static final int ENAMETOOLONG = 0x26;

	/** No locks available */
	public static final int ENOLCK = 0x27;

	/** Function not supported */
	public static final int ENOSYS = 0x28;

	/** Directory not empty */
	public static final int ENOTEMPTY = 0x29;

	/** Illegal byte sequence */
	public static final int EILSEQ = 0x2A;

	/** String was truncated */
	public static final int STRUNCATE = 0x50;

	static { Library.initialize(); }

	protected Errno() {
		throw new UnsupportedOperationException();
	}

	// --- [ errno ] ---

	/**
	 * Returns the integer variable {@code errno}, which is set by system calls and some library functions in the event of an error to indicate what went
	 * wrong. Its value is significant only when the return value of the call indicated an error (i.e., -1 from most system calls; -1 or {@code NULL} from most
	 * library functions); a function that succeeds is allowed to change errno.
	 * 
	 * <p><b>LWJGL note</b>: This function cannot be used after another JNI call to a function, because the last error resets before that call returns. For this
	 * reason, LWJGL stores the last error in thread-local storage, you can use {@link #getErrno} to access it.</p>
	 */
	public static native int errno();

	// --- [ getErrno ] ---

	/**
	 * Returns the integer variable {@code errno}, which is set by system calls and some library functions in the event of an error to indicate what went
	 * wrong. Its value is significant only when the return value of the call indicated an error (i.e., -1 from most system calls; -1 or {@code NULL} from most
	 * library functions); a function that succeeds is allowed to change errno.
	 * 
	 * <p><b>LWJGL note</b>: This method has a meaningful value only after another LWJGL JNI call. It does not return {@code errno} from errno.h, but the
	 * thread-local error code stored by a previous JNI call.</p>
	 */
	public static native int getErrno();

}