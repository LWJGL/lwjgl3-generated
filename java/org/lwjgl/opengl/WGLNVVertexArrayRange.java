/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class WGLNVVertexArrayRange {

    protected WGLNVVertexArrayRange() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(WGLCapabilities caps) {
        return checkFunctions(
            caps.wglAllocateMemoryNV, caps.wglFreeMemoryNV
        );
    }

    // --- [ wglAllocateMemoryNV ] ---

    public static long nwglAllocateMemoryNV(int size, float readfreq, float writefreq, float priority) {
        long __functionAddress = GL.getCapabilitiesWGL().wglAllocateMemoryNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress, size, readfreq, writefreq, priority);
    }

    @NativeType("void *")
    public static ByteBuffer wglAllocateMemoryNV(@NativeType("GLsizei") int size, @NativeType("GLfloat") float readfreq, @NativeType("GLfloat") float writefreq, @NativeType("GLfloat") float priority) {
        long __result = nwglAllocateMemoryNV(size, readfreq, writefreq, priority);
        return memByteBuffer(__result, size);
    }

    // --- [ wglFreeMemoryNV ] ---

    public static void nwglFreeMemoryNV(long pointer) {
        long __functionAddress = GL.getCapabilitiesWGL().wglFreeMemoryNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, pointer);
    }

    public static void wglFreeMemoryNV(@NativeType("void *") ByteBuffer pointer) {
        nwglFreeMemoryNV(memAddress(pointer));
    }

}