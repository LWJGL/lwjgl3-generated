/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import org.lwjgl.system.*;

/** Initializes the par shared library. */
final class LibPar {

	static {
		Library.loadSystem("lwjgl_par");
		MemoryUtil.setupAllocator("lwjgl_par");
	}

	private LibPar() {
	}

	static void initialize() {
		// intentionally empty to trigger static initializer
	}

}
