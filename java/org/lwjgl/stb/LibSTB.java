/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

/** Initializes the stb shared library. */
final class LibSTB {

	static {
		Library.loadSystem("lwjgl_stb");
		MemoryUtil.setupAllocator("lwjgl_stb");
	}

	private LibSTB() {
	}

	static void initialize() {
		// intentionally empty to trigger static initializer
	}

}
