/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_image_base.txt">KHR_image_base</a> extension.
 * 
 * <p>This extension defines a new EGL resource type that is suitable for sharing 2D arrays of image data between client APIs, the EGLImage. Although the
 * intended purpose is sharing 2D image data, the underlying interface makes no assumptions about the format or purpose of the resource being shared,
 * leaving those decisions to the application and associated client APIs.</p>
 * 
 * <p>Requires {@link EGL12 EGL 1.2}.</p>
 */
public class KHRImageBase {

    /**  */
    public static final int EGL_IMAGE_PRESERVED_KHR = 0x30D2;

    /**  */
    public static final long EGL_NO_IMAGE_KHR = 0x0L;

    protected KHRImageBase() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(EGLCapabilities caps) {
        return checkFunctions(
            caps.eglCreateImageKHR, caps.eglDestroyImageKHR
        );
    }

    // --- [ eglCreateImageKHR ] ---

    public static long neglCreateImageKHR(long dpy, long ctx, int target, long buffer, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(ctx);
            check(buffer);
        }
        return callPPPPP(__functionAddress, dpy, ctx, target, buffer, attrib_list);
    }

    public static long eglCreateImageKHR(long dpy, long ctx, int target, long buffer, IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateImageKHR(dpy, ctx, target, buffer, memAddressSafe(attrib_list));
    }

    // --- [ eglDestroyImageKHR ] ---

    public static boolean eglDestroyImageKHR(long dpy, long image) {
        long __functionAddress = EGL.getCapabilities().eglDestroyImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
        }
        return callPPI(__functionAddress, dpy, image) != 0;
    }

    /** Array version of: {@link #eglCreateImageKHR CreateImageKHR} */
    public static long eglCreateImageKHR(long dpy, long ctx, int target, long buffer, int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(ctx);
            check(buffer);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPP(__functionAddress, dpy, ctx, target, buffer, attrib_list);
    }

}