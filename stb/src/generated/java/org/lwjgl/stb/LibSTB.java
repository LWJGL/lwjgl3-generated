/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Initializes the stb shared library. */
final class LibSTB {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_stb");
        Library.loadSystem(System::load, System::loadLibrary, LibSTB.class, libName);

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

    private LibSTB() {
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
