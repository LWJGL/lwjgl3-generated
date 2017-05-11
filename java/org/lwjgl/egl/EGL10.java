/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core EGL 1.0 functionality. */
public class EGL10 {

    /**  */
    public static final int
        EGL_ALPHA_SIZE              = 0x3021,
        EGL_BAD_ACCESS              = 0x3002,
        EGL_BAD_ALLOC               = 0x3003,
        EGL_BAD_ATTRIBUTE           = 0x3004,
        EGL_BAD_CONFIG              = 0x3005,
        EGL_BAD_CONTEXT             = 0x3006,
        EGL_BAD_CURRENT_SURFACE     = 0x3007,
        EGL_BAD_DISPLAY             = 0x3008,
        EGL_BAD_MATCH               = 0x3009,
        EGL_BAD_NATIVE_PIXMAP       = 0x300A,
        EGL_BAD_NATIVE_WINDOW       = 0x300B,
        EGL_BAD_PARAMETER           = 0x300C,
        EGL_BAD_SURFACE             = 0x300D,
        EGL_BLUE_SIZE               = 0x3022,
        EGL_BUFFER_SIZE             = 0x3020,
        EGL_CONFIG_CAVEAT           = 0x3027,
        EGL_CONFIG_ID               = 0x3028,
        EGL_CORE_NATIVE_ENGINE      = 0x305B,
        EGL_DEPTH_SIZE              = 0x3025,
        EGL_DONT_CARE               = -1,
        EGL_DRAW                    = 0x3059,
        EGL_EXTENSIONS              = 0x3055,
        EGL_FALSE                   = 0,
        EGL_GREEN_SIZE              = 0x3023,
        EGL_HEIGHT                  = 0x3056,
        EGL_LARGEST_PBUFFER         = 0x3058,
        EGL_LEVEL                   = 0x3029,
        EGL_MAX_PBUFFER_HEIGHT      = 0x302A,
        EGL_MAX_PBUFFER_PIXELS      = 0x302B,
        EGL_MAX_PBUFFER_WIDTH       = 0x302C,
        EGL_NATIVE_RENDERABLE       = 0x302D,
        EGL_NATIVE_VISUAL_ID        = 0x302E,
        EGL_NATIVE_VISUAL_TYPE      = 0x302F,
        EGL_NONE                    = 0x3038,
        EGL_NON_CONFORMANT_CONFIG   = 0x3051,
        EGL_NOT_INITIALIZED         = 0x3001,
        EGL_PBUFFER_BIT             = 0x1,
        EGL_PIXMAP_BIT              = 0x2,
        EGL_READ                    = 0x305A,
        EGL_RED_SIZE                = 0x3024,
        EGL_SAMPLES                 = 0x3031,
        EGL_SAMPLE_BUFFERS          = 0x3032,
        EGL_SLOW_CONFIG             = 0x3050,
        EGL_STENCIL_SIZE            = 0x3026,
        EGL_SUCCESS                 = 0x3000,
        EGL_SURFACE_TYPE            = 0x3033,
        EGL_TRANSPARENT_BLUE_VALUE  = 0x3035,
        EGL_TRANSPARENT_GREEN_VALUE = 0x3036,
        EGL_TRANSPARENT_RED_VALUE   = 0x3037,
        EGL_TRANSPARENT_RGB         = 0x3052,
        EGL_TRANSPARENT_TYPE        = 0x3034,
        EGL_TRUE                    = 1,
        EGL_VENDOR                  = 0x3053,
        EGL_VERSION                 = 0x3054,
        EGL_WIDTH                   = 0x3057,
        EGL_WINDOW_BIT              = 0x4;

    /** Null values. */
    public static final long
        EGL_NO_CONTEXT = 0x0L,
        EGL_NO_DISPLAY = 0x0L,
        EGL_NO_SURFACE = 0x0L;

    protected EGL10() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(EGLCapabilities caps) {
        return checkFunctions(
            caps.eglChooseConfig, caps.eglCopyBuffers, caps.eglCreateContext, caps.eglCreatePbufferSurface, caps.eglCreatePixmapSurface, 
            caps.eglCreateWindowSurface, caps.eglDestroyContext, caps.eglDestroySurface, caps.eglGetConfigAttrib, caps.eglGetConfigs, caps.eglGetCurrentDisplay, 
            caps.eglGetCurrentSurface, caps.eglGetDisplay, caps.eglGetError, caps.eglGetProcAddress, caps.eglInitialize, caps.eglMakeCurrent, 
            caps.eglQueryContext, caps.eglQueryString, caps.eglQuerySurface, caps.eglSwapBuffers, caps.eglTerminate, caps.eglWaitGL, caps.eglWaitNative
        );
    }

    // --- [ eglChooseConfig ] ---

    public static int neglChooseConfig(long dpy, long attrib_list, long configs, int config_size, long num_config) {
        long __functionAddress = EGL.getCapabilities().eglChooseConfig;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPPI(__functionAddress, dpy, attrib_list, configs, config_size, num_config);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglChooseConfig.xhtml">Reference Page</a> */
    public static boolean eglChooseConfig(long dpy, IntBuffer attrib_list, PointerBuffer configs, IntBuffer num_config) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_config, 1);
        }
        return neglChooseConfig(dpy, memAddressSafe(attrib_list), memAddressSafe(configs), remainingSafe(configs), memAddress(num_config)) != 0;
    }

    // --- [ eglCopyBuffers ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCopyBuffers.xhtml">Reference Page</a> */
    public static boolean eglCopyBuffers(long dpy, long surface, long target) {
        long __functionAddress = EGL.getCapabilities().eglCopyBuffers;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
            check(target);
        }
        return callPPPI(__functionAddress, dpy, surface, target) != 0;
    }

    // --- [ eglCreateContext ] ---

    public static long neglCreateContext(long dpy, long config, long share_context, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateContext;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
        }
        return callPPPPP(__functionAddress, dpy, config, share_context, attrib_list);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreateContext.xhtml">Reference Page</a> */
    public static long eglCreateContext(long dpy, long config, long share_context, IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateContext(dpy, config, share_context, memAddressSafe(attrib_list));
    }

    // --- [ eglCreatePbufferSurface ] ---

    public static long neglCreatePbufferSurface(long dpy, long config, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePbufferSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
        }
        return callPPPP(__functionAddress, dpy, config, attrib_list);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreatePbufferSurface.xhtml">Reference Page</a> */
    public static long eglCreatePbufferSurface(long dpy, long config, IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreatePbufferSurface(dpy, config, memAddressSafe(attrib_list));
    }

    // --- [ eglCreatePixmapSurface ] ---

    public static long neglCreatePixmapSurface(long dpy, long config, long pixmap, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePixmapSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(pixmap);
        }
        return callPPPPP(__functionAddress, dpy, config, pixmap, attrib_list);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreatePixmapSurface.xhtml">Reference Page</a> */
    public static long eglCreatePixmapSurface(long dpy, long config, long pixmap, IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreatePixmapSurface(dpy, config, pixmap, memAddressSafe(attrib_list));
    }

    // --- [ eglCreateWindowSurface ] ---

    public static long neglCreateWindowSurface(long dpy, long config, long win, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateWindowSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(win);
        }
        return callPPPPP(__functionAddress, dpy, config, win, attrib_list);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreateWindowSurface.xhtml">Reference Page</a> */
    public static long eglCreateWindowSurface(long dpy, long config, long win, IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateWindowSurface(dpy, config, win, memAddressSafe(attrib_list));
    }

    // --- [ eglDestroyContext ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglDestroyContext.xhtml">Reference Page</a> */
    public static boolean eglDestroyContext(long dpy, long ctx) {
        long __functionAddress = EGL.getCapabilities().eglDestroyContext;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(ctx);
        }
        return callPPI(__functionAddress, dpy, ctx) != 0;
    }

    // --- [ eglDestroySurface ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglDestroySurface.xhtml">Reference Page</a> */
    public static boolean eglDestroySurface(long dpy, long surface) {
        long __functionAddress = EGL.getCapabilities().eglDestroySurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPI(__functionAddress, dpy, surface) != 0;
    }

    // --- [ eglGetConfigAttrib ] ---

    public static int neglGetConfigAttrib(long dpy, long config, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglGetConfigAttrib;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
        }
        return callPPPI(__functionAddress, dpy, config, attribute, value);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetConfigAttrib.xhtml">Reference Page</a> */
    public static boolean eglGetConfigAttrib(long dpy, long config, int attribute, IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglGetConfigAttrib(dpy, config, attribute, memAddress(value)) != 0;
    }

    // --- [ eglGetConfigs ] ---

    public static int neglGetConfigs(long dpy, long configs, int config_size, long num_config) {
        long __functionAddress = EGL.getCapabilities().eglGetConfigs;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPI(__functionAddress, dpy, configs, config_size, num_config);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetConfigs.xhtml">Reference Page</a> */
    public static boolean eglGetConfigs(long dpy, PointerBuffer configs, IntBuffer num_config) {
        if (CHECKS) {
            check(num_config, 1);
        }
        return neglGetConfigs(dpy, memAddressSafe(configs), remainingSafe(configs), memAddress(num_config)) != 0;
    }

    // --- [ eglGetCurrentDisplay ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetCurrentDisplay.xhtml">Reference Page</a> */
    public static long eglGetCurrentDisplay() {
        long __functionAddress = EGL.getCapabilities().eglGetCurrentDisplay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    // --- [ eglGetCurrentSurface ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetCurrentSurface.xhtml">Reference Page</a> */
    public static long eglGetCurrentSurface(int readdraw) {
        long __functionAddress = EGL.getCapabilities().eglGetCurrentSurface;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress, readdraw);
    }

    // --- [ eglGetDisplay ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetDisplay.xhtml">Reference Page</a> */
    public static long eglGetDisplay(long display_id) {
        long __functionAddress = EGL.getCapabilities().eglGetDisplay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(__functionAddress, display_id);
    }

    // --- [ eglGetError ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetError.xhtml">Reference Page</a> */
    public static int eglGetError() {
        long __functionAddress = EGL.getCapabilities().eglGetError;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ eglGetProcAddress ] ---

    public static long neglGetProcAddress(long procname) {
        long __functionAddress = EGL.getCapabilities().eglGetProcAddress;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(__functionAddress, procname);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetProcAddress.xhtml">Reference Page</a> */
    public static long eglGetProcAddress(ByteBuffer procname) {
        if (CHECKS) {
            checkNT1(procname);
        }
        return neglGetProcAddress(memAddress(procname));
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetProcAddress.xhtml">Reference Page</a> */
    public static long eglGetProcAddress(CharSequence procname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer procnameEncoded = stack.ASCII(procname);
            return neglGetProcAddress(memAddress(procnameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ eglInitialize ] ---

    public static int neglInitialize(long dpy, long major, long minor) {
        long __functionAddress = EGL.getCapabilities().eglInitialize;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPI(__functionAddress, dpy, major, minor);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglInitialize.xhtml">Reference Page</a> */
    public static boolean eglInitialize(long dpy, IntBuffer major, IntBuffer minor) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
        }
        return neglInitialize(dpy, memAddress(major), memAddress(minor)) != 0;
    }

    // --- [ eglMakeCurrent ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglMakeCurrent.xhtml">Reference Page</a> */
    public static boolean eglMakeCurrent(long dpy, long draw, long read, long ctx) {
        long __functionAddress = EGL.getCapabilities().eglMakeCurrent;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(draw);
            check(read);
            check(ctx);
        }
        return callPPPPI(__functionAddress, dpy, draw, read, ctx) != 0;
    }

    // --- [ eglQueryContext ] ---

    public static int neglQueryContext(long dpy, long ctx, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryContext;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(ctx);
        }
        return callPPPI(__functionAddress, dpy, ctx, attribute, value);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglQueryContext.xhtml">Reference Page</a> */
    public static boolean eglQueryContext(long dpy, long ctx, int attribute, IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryContext(dpy, ctx, attribute, memAddress(value)) != 0;
    }

    // --- [ eglQueryString ] ---

    public static long neglQueryString(long dpy, int name) {
        long __functionAddress = EGL.getCapabilities().eglQueryString;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(__functionAddress, dpy, name);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglQueryString.xhtml">Reference Page</a> */
    public static String eglQueryString(long dpy, int name) {
        long __result = neglQueryString(dpy, name);
        return memASCII(__result);
    }

    // --- [ eglQuerySurface ] ---

    public static int neglQuerySurface(long dpy, long surface, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQuerySurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(__functionAddress, dpy, surface, attribute, value);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglQuerySurface.xhtml">Reference Page</a> */
    public static boolean eglQuerySurface(long dpy, long surface, int attribute, IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQuerySurface(dpy, surface, attribute, memAddress(value)) != 0;
    }

    // --- [ eglSwapBuffers ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglSwapBuffers.xhtml">Reference Page</a> */
    public static boolean eglSwapBuffers(long dpy, long surface) {
        long __functionAddress = EGL.getCapabilities().eglSwapBuffers;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPI(__functionAddress, dpy, surface) != 0;
    }

    // --- [ eglTerminate ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglTerminate.xhtml">Reference Page</a> */
    public static boolean eglTerminate(long dpy) {
        long __functionAddress = EGL.getCapabilities().eglTerminate;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPI(__functionAddress, dpy) != 0;
    }

    // --- [ eglWaitGL ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglWaitGL.xhtml">Reference Page</a> */
    public static boolean eglWaitGL() {
        long __functionAddress = EGL.getCapabilities().eglWaitGL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress) != 0;
    }

    // --- [ eglWaitNative ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglWaitNative.xhtml">Reference Page</a> */
    public static boolean eglWaitNative(int engine) {
        long __functionAddress = EGL.getCapabilities().eglWaitNative;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress, engine) != 0;
    }

    /**
     * <p><a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglChooseConfig.xhtml">Reference Page</a></p>
     * 
     * Array version of: {@link #eglChooseConfig ChooseConfig}
     */
    public static boolean eglChooseConfig(long dpy, int[] attrib_list, PointerBuffer configs, int[] num_config) {
        long __functionAddress = EGL.getCapabilities().eglChooseConfig;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_config, 1);
        }
        return callPPPPI(__functionAddress, dpy, attrib_list, memAddressSafe(configs), remainingSafe(configs), num_config) != 0;
    }

    /**
     * <p><a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreateContext.xhtml">Reference Page</a></p>
     * 
     * Array version of: {@link #eglCreateContext CreateContext}
     */
    public static long eglCreateContext(long dpy, long config, long share_context, int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateContext;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPP(__functionAddress, dpy, config, share_context, attrib_list);
    }

    /**
     * <p><a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreatePbufferSurface.xhtml">Reference Page</a></p>
     * 
     * Array version of: {@link #eglCreatePbufferSurface CreatePbufferSurface}
     */
    public static long eglCreatePbufferSurface(long dpy, long config, int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePbufferSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPP(__functionAddress, dpy, config, attrib_list);
    }

    /**
     * <p><a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreatePixmapSurface.xhtml">Reference Page</a></p>
     * 
     * Array version of: {@link #eglCreatePixmapSurface CreatePixmapSurface}
     */
    public static long eglCreatePixmapSurface(long dpy, long config, long pixmap, int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePixmapSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(pixmap);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPP(__functionAddress, dpy, config, pixmap, attrib_list);
    }

    /**
     * <p><a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreateWindowSurface.xhtml">Reference Page</a></p>
     * 
     * Array version of: {@link #eglCreateWindowSurface CreateWindowSurface}
     */
    public static long eglCreateWindowSurface(long dpy, long config, long win, int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateWindowSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(win);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPP(__functionAddress, dpy, config, win, attrib_list);
    }

    /**
     * <p><a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetConfigAttrib.xhtml">Reference Page</a></p>
     * 
     * Array version of: {@link #eglGetConfigAttrib GetConfigAttrib}
     */
    public static boolean eglGetConfigAttrib(long dpy, long config, int attribute, int[] value) {
        long __functionAddress = EGL.getCapabilities().eglGetConfigAttrib;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(value, 1);
        }
        return callPPPI(__functionAddress, dpy, config, attribute, value) != 0;
    }

    /**
     * <p><a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetConfigs.xhtml">Reference Page</a></p>
     * 
     * Array version of: {@link #eglGetConfigs GetConfigs}
     */
    public static boolean eglGetConfigs(long dpy, PointerBuffer configs, int[] num_config) {
        long __functionAddress = EGL.getCapabilities().eglGetConfigs;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(num_config, 1);
        }
        return callPPPI(__functionAddress, dpy, memAddressSafe(configs), remainingSafe(configs), num_config) != 0;
    }

    /**
     * <p><a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglInitialize.xhtml">Reference Page</a></p>
     * 
     * Array version of: {@link #eglInitialize Initialize}
     */
    public static boolean eglInitialize(long dpy, int[] major, int[] minor) {
        long __functionAddress = EGL.getCapabilities().eglInitialize;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(major, 1);
            check(minor, 1);
        }
        return callPPPI(__functionAddress, dpy, major, minor) != 0;
    }

    /**
     * <p><a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglQueryContext.xhtml">Reference Page</a></p>
     * 
     * Array version of: {@link #eglQueryContext QueryContext}
     */
    public static boolean eglQueryContext(long dpy, long ctx, int attribute, int[] value) {
        long __functionAddress = EGL.getCapabilities().eglQueryContext;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(ctx);
            check(value, 1);
        }
        return callPPPI(__functionAddress, dpy, ctx, attribute, value) != 0;
    }

    /**
     * <p><a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglQuerySurface.xhtml">Reference Page</a></p>
     * 
     * Array version of: {@link #eglQuerySurface QuerySurface}
     */
    public static boolean eglQuerySurface(long dpy, long surface, int attribute, int[] value) {
        long __functionAddress = EGL.getCapabilities().eglQuerySurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
            check(value, 1);
        }
        return callPPPI(__functionAddress, dpy, surface, attribute, value) != 0;
    }

}