/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Remotery profiling for OpenGL. */
public class RemoteryMetal {

    static { LibRemotery.initialize(); }

    protected RemoteryMetal() {
        throw new UnsupportedOperationException();
    }

    // --- [ rmt_BindMetal ] ---

    public static native void nrmt_BindMetal(long command_buffer);

    public static void rmt_BindMetal(@NativeType("id") long command_buffer) {
        if (CHECKS) {
            check(command_buffer);
        }
        nrmt_BindMetal(command_buffer);
    }

    // --- [ rmt_UnbindMetal ] ---

    public static native void rmt_UnbindMetal();

    // --- [ rmt_BeginMetalSample ] ---

    public static native void nrmt_BeginMetalSample(long name, long hash_cache);

    public static void rmt_BeginMetalSample(@NativeType("rmtPStr") ByteBuffer name, @NativeType("rmtU32 *") IntBuffer hash_cache) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(hash_cache, 1);
        }
        nrmt_BeginMetalSample(memAddress(name), memAddressSafe(hash_cache));
    }

    public static void rmt_BeginMetalSample(@NativeType("rmtPStr") CharSequence name, @NativeType("rmtU32 *") IntBuffer hash_cache) {
        if (CHECKS) {
            checkSafe(hash_cache, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer nameEncoded = stack.ASCII(name);
            nrmt_BeginMetalSample(memAddress(nameEncoded), memAddressSafe(hash_cache));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ rmt_EndMetalSample ] ---

    public static native void rmt_EndMetalSample();

}