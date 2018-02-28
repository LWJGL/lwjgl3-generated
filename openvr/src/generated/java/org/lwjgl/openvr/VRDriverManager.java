/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRDriverManager {

    protected VRDriverManager() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRDriverManager_GetDriverCount ] ---

    @NativeType("uint32_t")
    public static int VRDriverManager_GetDriverCount() {
        long __functionAddress = OpenVR.VRDriverManager.GetDriverCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRDriverManager_GetDriverName ] ---

    /** Unsafe version of: {@link #VRDriverManager_GetDriverName GetDriverName} */
    public static int nVRDriverManager_GetDriverName(int nDriver, long pchValue, int unBufferSize) {
        long __functionAddress = OpenVR.VRDriverManager.GetDriverName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(__functionAddress, nDriver, pchValue, unBufferSize);
    }

    /**
     * @param nDriver  
     * @param pchValue 
     *
     * @return the length of the number of bytes necessary to hold this string including the trailing null
     */
    @NativeType("uint32_t")
    public static int VRDriverManager_GetDriverName(@NativeType("DriverId_t") int nDriver, @Nullable @NativeType("char *") ByteBuffer pchValue) {
        return nVRDriverManager_GetDriverName(nDriver, memAddressSafe(pchValue), remainingSafe(pchValue));
    }

    /**
     * @param nDriver      
     * @param unBufferSize 
     *
     * @return the length of the number of bytes necessary to hold this string including the trailing null
     */
    @NativeType("uint32_t")
    public static String VRDriverManager_GetDriverName(@NativeType("DriverId_t") int nDriver, @NativeType("uint32_t") int unBufferSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchValue = stack.malloc(unBufferSize);
            int __result = nVRDriverManager_GetDriverName(nDriver, memAddress(pchValue), unBufferSize);
            return memASCII(pchValue, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRDriverManager_GetDriverHandle ] ---

    /** Unsafe version of: {@link #VRDriverManager_GetDriverHandle GetDriverHandle} */
    public static long nVRDriverManager_GetDriverHandle(long pchDriverName) {
        long __functionAddress = OpenVR.VRDriverManager.GetDriverHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJ(__functionAddress, pchDriverName);
    }

    /**
     * Returns the property container handle for the specified driver.
     *
     * @param pchDriverName the driver name
     */
    @NativeType("DriverHandle_t")
    public static long VRDriverManager_GetDriverHandle(@NativeType("char *") ByteBuffer pchDriverName) {
        if (CHECKS) {
            checkNT1(pchDriverName);
        }
        return nVRDriverManager_GetDriverHandle(memAddress(pchDriverName));
    }

    /**
     * Returns the property container handle for the specified driver.
     *
     * @param pchDriverName the driver name
     */
    @NativeType("DriverHandle_t")
    public static long VRDriverManager_GetDriverHandle(@NativeType("char *") CharSequence pchDriverName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchDriverNameEncoded = stack.ASCII(pchDriverName);
            return nVRDriverManager_GetDriverHandle(memAddress(pchDriverNameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}