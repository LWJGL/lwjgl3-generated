/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyfd;

import org.lwjgl.system.*;

/** Initializes the tinyfd shared library. */
final class LibTinyFD {

	static {
		String libName = Platform.mapLibraryNameBundled("lwjgl_tinyfd");
		Library.loadSystem(libName);
	}

	private LibTinyFD() {
	}

	static void initialize() {
		// intentionally empty to trigger static initializer
	}

}
