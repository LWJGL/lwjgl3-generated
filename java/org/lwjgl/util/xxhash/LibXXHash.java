/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.xxhash;

import org.lwjgl.system.*;

/** Initializes the xxhash shared library. */
final class LibXXHash {

	static {
		Library.loadSystem("lwjgl_xxhash");
		MemoryUtil.setupAllocator("lwjgl_xxhash");
	}

	private LibXXHash() {
	}

	static void initialize() {
		// intentionally empty to trigger static initializer
	}

}
