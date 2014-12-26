/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to <unistd.h>. */
public final class Unistd {

	static { LWJGLUtil.initialize(); }

	private Unistd() {}

	// --- [ getpid ] ---

	/** Returns the process ID of the calling process. */
	public static native long getpid();

}