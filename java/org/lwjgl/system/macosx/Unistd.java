/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to <unistd.h>. */
public class Unistd {

	static { Library.initialize(); }

	@JavadocExclude
	protected Unistd() {
		throw new UnsupportedOperationException();
	}

	// --- [ getpid ] ---

	/** Returns the process ID of the calling process. */
	public static native long getpid();

}