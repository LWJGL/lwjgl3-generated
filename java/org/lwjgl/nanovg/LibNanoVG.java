/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Initializes the nanovg shared library. */
final class LibNanoVG {

	static {
		String libName = Platform.mapLibraryNameBundled("lwjgl_nanovg");
		Library.loadSystem(libName);

		MemoryAllocator allocator = getAllocator();
		setupMalloc(
			allocator.getMalloc(),
			allocator.getCalloc(),
			allocator.getRealloc(),
			allocator.getFree(),
			allocator.getAlignedAlloc(),
			allocator.getAlignedFree()
		);
	}

	private LibNanoVG() {
	}

	static void initialize() {
		// intentionally empty to trigger static initializer
	}

	private static native void setupMalloc(
		long malloc,
		long calloc,
		long realloc,
		long free,
		long aligned_alloc,
		long aligned_free
	);

}
