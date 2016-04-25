/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;


/**
 * Native bindings to libSystem, the MacOS system library.
 * 
 * <p>This class contains no functionality and is only responsible for loading the system library. Other libraries (contained in libSystem) reuse the library
 * handle loaded by this class.</p>
 */
public final class LibSystem {

	private LibSystem() {
		throw new UnsupportedOperationException();
	}

	private static final SharedLibrary SYSTEM = Library.loadNative("System");

	/** Contains the function pointers loaded from the System {@link SharedLibrary}. */
	/** Returns the System {@link SharedLibrary}. */
	public static SharedLibrary getLibrary() {
		return SYSTEM;
	}

}