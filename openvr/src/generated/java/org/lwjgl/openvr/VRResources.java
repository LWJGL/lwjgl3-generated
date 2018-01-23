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

/** Shared Resource Methods. */
public class VRResources {

    protected VRResources() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRResources_LoadSharedResource ] ---

    /** Unsafe version of: {@link #VRResources_LoadSharedResource LoadSharedResource} */
    public static int nVRResources_LoadSharedResource(long pchResourceName, long pchBuffer, int unBufferLen) {
        long __functionAddress = OpenVR.VRResources.LoadSharedResource;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, pchResourceName, pchBuffer, unBufferLen);
    }

    /**
     * Loads the specified resource into the provided buffer if large enough.
     *
     * @param pchResourceName 
     * @param pchBuffer       
     *
     * @return the size in bytes of the buffer required to hold the specified resource
     */
    @NativeType("uint32_t")
    public static int VRResources_LoadSharedResource(@NativeType("const char *") ByteBuffer pchResourceName, @Nullable @NativeType("char *") ByteBuffer pchBuffer) {
        if (CHECKS) {
            checkNT1(pchResourceName);
        }
        return nVRResources_LoadSharedResource(memAddress(pchResourceName), memAddressSafe(pchBuffer), remainingSafe(pchBuffer));
    }

    /**
     * Loads the specified resource into the provided buffer if large enough.
     *
     * @param pchResourceName 
     * @param pchBuffer       
     *
     * @return the size in bytes of the buffer required to hold the specified resource
     */
    @NativeType("uint32_t")
    public static int VRResources_LoadSharedResource(@NativeType("const char *") CharSequence pchResourceName, @Nullable @NativeType("char *") ByteBuffer pchBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchResourceNameEncoded = stack.ASCII(pchResourceName);
            return nVRResources_LoadSharedResource(memAddress(pchResourceNameEncoded), memAddressSafe(pchBuffer), remainingSafe(pchBuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Loads the specified resource into the provided buffer if large enough.
     *
     * @param pchResourceName 
     * @param unBufferLen     
     *
     * @return the size in bytes of the buffer required to hold the specified resource
     */
    @NativeType("uint32_t")
    public static String VRResources_LoadSharedResource(@NativeType("const char *") CharSequence pchResourceName, @NativeType("uint32_t") int unBufferLen) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchResourceNameEncoded = stack.ASCII(pchResourceName);
            ByteBuffer pchBuffer = stack.malloc(unBufferLen);
            int __result = nVRResources_LoadSharedResource(memAddress(pchResourceNameEncoded), memAddress(pchBuffer), unBufferLen);
            return memASCII(pchBuffer, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRResources_GetResourceFullPath ] ---

    /** Unsafe version of: {@link #VRResources_GetResourceFullPath GetResourceFullPath} */
    public static int nVRResources_GetResourceFullPath(long pchResourceName, long pchResourceTypeDirectory, long pchPathBuffer, int unBufferLen) {
        long __functionAddress = OpenVR.VRResources.GetResourceFullPath;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, pchResourceName, pchResourceTypeDirectory, pchPathBuffer, unBufferLen);
    }

    /**
     * Provides the full path to the specified resource. Resource names can include named directories for drivers and other things, and this resolves all of
     * those and returns the actual physical path. {@code pchResourceTypeDirectory} is the subdirectory of resources to look in.
     *
     * @param pchResourceName          
     * @param pchResourceTypeDirectory 
     * @param pchPathBuffer            
     */
    @NativeType("uint32_t")
    public static int VRResources_GetResourceFullPath(@NativeType("const char *") ByteBuffer pchResourceName, @NativeType("const char *") ByteBuffer pchResourceTypeDirectory, @Nullable @NativeType("char *") ByteBuffer pchPathBuffer) {
        if (CHECKS) {
            checkNT1(pchResourceName);
            checkNT1(pchResourceTypeDirectory);
        }
        return nVRResources_GetResourceFullPath(memAddress(pchResourceName), memAddress(pchResourceTypeDirectory), memAddressSafe(pchPathBuffer), remainingSafe(pchPathBuffer));
    }

    /**
     * Provides the full path to the specified resource. Resource names can include named directories for drivers and other things, and this resolves all of
     * those and returns the actual physical path. {@code pchResourceTypeDirectory} is the subdirectory of resources to look in.
     *
     * @param pchResourceName          
     * @param pchResourceTypeDirectory 
     * @param pchPathBuffer            
     */
    @NativeType("uint32_t")
    public static int VRResources_GetResourceFullPath(@NativeType("const char *") CharSequence pchResourceName, @NativeType("const char *") CharSequence pchResourceTypeDirectory, @Nullable @NativeType("char *") ByteBuffer pchPathBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchResourceNameEncoded = stack.ASCII(pchResourceName);
            ByteBuffer pchResourceTypeDirectoryEncoded = stack.ASCII(pchResourceTypeDirectory);
            return nVRResources_GetResourceFullPath(memAddress(pchResourceNameEncoded), memAddress(pchResourceTypeDirectoryEncoded), memAddressSafe(pchPathBuffer), remainingSafe(pchPathBuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Provides the full path to the specified resource. Resource names can include named directories for drivers and other things, and this resolves all of
     * those and returns the actual physical path. {@code pchResourceTypeDirectory} is the subdirectory of resources to look in.
     *
     * @param pchResourceName          
     * @param pchResourceTypeDirectory 
     * @param unBufferLen              
     */
    @NativeType("uint32_t")
    public static String VRResources_GetResourceFullPath(@NativeType("const char *") CharSequence pchResourceName, @NativeType("const char *") CharSequence pchResourceTypeDirectory, @NativeType("uint32_t") int unBufferLen) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchResourceNameEncoded = stack.ASCII(pchResourceName);
            ByteBuffer pchResourceTypeDirectoryEncoded = stack.ASCII(pchResourceTypeDirectory);
            ByteBuffer pchPathBuffer = stack.malloc(unBufferLen);
            int __result = nVRResources_GetResourceFullPath(memAddress(pchResourceNameEncoded), memAddress(pchResourceTypeDirectoryEncoded), memAddress(pchPathBuffer), unBufferLen);
            return memASCII(pchPathBuffer, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}