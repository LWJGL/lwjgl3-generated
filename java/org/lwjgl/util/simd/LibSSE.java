/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.simd;

import org.lwjgl.system.*;

/** Initializes the sse shared library. */
final class LibSSE {

	static {
		Library.loadSystem("lwjgl_sse");
	}

	private LibSSE() {
	}

	static void initialize() {
		// intentionally empty to trigger static initializer
	}

}
