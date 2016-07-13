/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.system.*;

/** Initializes the ovr shared library. */
final class LibOVR {

	static {
		String libName = Platform.mapLibraryNameBundled("lwjgl_ovr");
		Library.loadSystem(libName);
	}

	private LibOVR() {
	}

	static void initialize() {
		// intentionally empty to trigger static initializer
	}

}
