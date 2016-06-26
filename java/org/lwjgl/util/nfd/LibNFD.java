/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.nfd;

import org.lwjgl.system.*;

/** Initializes the nfd shared library. */
final class LibNFD {

	static {
		Library.loadSystem("lwjgl_nfd");
		MemoryUtil.setupAllocator("lwjgl_nfd");
	}

	private LibNFD() {
	}

	static void initialize() {
		// intentionally empty to trigger static initializer
	}

}
