/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to <sys/ioctl.h>. */
public final class SysIOctl {

	static { LWJGLUtil.initialize(); }

	private SysIOctl() {}

	// --- [ ioctl ] ---

	/** JNI method for {@link #ioctl} */
	@JavadocExclude
	public static native int nioctl(int fd, int request, long arg);

	/**
	 * Manipulates the underlying device parameters of special files.  In particular, many operating characteristics of character special files (e.g.,
	 * terminals) may be controlled with {@code ioctl()} requests.
	 *
	 * @param fd      an open file descriptor
	 * @param request a device-dependent request code
	 * @param arg     
	 */
	public static int ioctl(int fd, int request, long arg) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(arg);
		return nioctl(fd, request, arg);
	}

}