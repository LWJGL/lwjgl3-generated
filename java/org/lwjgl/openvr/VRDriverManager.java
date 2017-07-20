/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

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
    public static int VRDriverManager_GetDriverName(int nDriver, ByteBuffer pchValue) {
        return nVRDriverManager_GetDriverName(nDriver, memAddressSafe(pchValue), remainingSafe(pchValue));
    }

    /**
     * @param nDriver      
     * @param unBufferSize 
     *
     * @return the length of the number of bytes necessary to hold this string including the trailing null
     */
    public static String VRDriverManager_GetDriverName(int nDriver, int unBufferSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchValue = stack.malloc(unBufferSize);
            int __result = nVRDriverManager_GetDriverName(nDriver, memAddress(pchValue), unBufferSize);
            return memASCII(pchValue, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}