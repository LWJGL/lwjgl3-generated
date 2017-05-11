/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_border_clamp.txt">OES_texture_border_clamp</a> extension.
 * 
 * <p>OpenGL ES provides only a single clamping wrap mode: CLAMP_TO_EDGE. However, the ability to clamp to a constant border color can be useful to quickly
 * detect texture coordinates that exceed their expected limits or to dummy out any such accesses with transparency or a neutral color in tiling or light
 * maps.</p>
 * 
 * <p>This extension defines an additional texture clamping algorithm. CLAMP_TO_BORDER_OES clamps texture coordinates at all mipmap levels such that NEAREST
 * and LINEAR filters of clamped coordinates return only the constant border color. This does not add the ability for textures to specify borders using
 * glTexImage2D, but only to clamp to a constant border value set using glTexParameter and glSamplerParameter.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class OESTextureBorderClamp {

    /**
     * Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, SamplerParameteriv, SamplerParameterfv, TexParameterIivOES,
     * TexParameterIuivOES, SamplerParameterIivOES, SamplerParameterIuivOES, GetTexParameteriv, GetTexParameterfv, GetTexParameterIivOES,
     * GetTexParameterIuivOES, GetSamplerParameteriv, GetSamplerParameterfv, GetSamplerParameterIivOES, and GetSamplerParameterIuivOES.
     */
    public static final int GL_TEXTURE_BORDER_COLOR_OES = 0x1004;

    /**
     * Accepted by the {@code param} parameter of TexParameteri, TexParameterf, SamplerParameteri and SamplerParameterf, and by the {@code params} parameter of
     * TexParameteriv, TexParameterfv, TexParameterIivOES, TexParameterIuivOES, SamplerParameterIivOES, SamplerParameterIuivOES and returned by the
     * {@code params} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIivOES, GetTexParameterIuivOES, GetSamplerParameteriv,
     * GetSamplerParameterfv, GetSamplerParameterIivOES, and GetSamplerParameterIuivOES when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T,
     * or TEXTURE_WRAP_R.
     */
    public static final int GL_CLAMP_TO_BORDER_OES = 0x812D;

    static { GLES.initialize(); }

    protected OESTextureBorderClamp() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLESCapabilities caps) {
        return checkFunctions(
            caps.glTexParameterIivOES, caps.glTexParameterIuivOES, caps.glGetTexParameterIivOES, caps.glGetTexParameterIuivOES, caps.glSamplerParameterIivOES, 
            caps.glSamplerParameterIuivOES, caps.glGetSamplerParameterIivOES, caps.glGetSamplerParameterIuivOES
        );
    }

    // --- [ glTexParameterIivOES ] ---

    public static native void nglTexParameterIivOES(int target, int pname, long params);

    public static void glTexParameterIivOES(int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIivOES(target, pname, memAddress(params));
    }

    public static void glTexParameterIiOES(int target, int pname, int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTexParameterIivOES(target, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTexParameterIuivOES ] ---

    public static native void nglTexParameterIuivOES(int target, int pname, long params);

    public static void glTexParameterIuivOES(int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIuivOES(target, pname, memAddress(params));
    }

    public static void glTexParameterIuiOES(int target, int pname, int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTexParameterIuivOES(target, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameterIivOES ] ---

    public static native void nglGetTexParameterIivOES(int target, int pname, long params);

    public static void glGetTexParameterIivOES(int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIivOES(target, pname, memAddress(params));
    }

    public static int glGetTexParameterIiOES(int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameterIivOES(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameterIuivOES ] ---

    public static native void nglGetTexParameterIuivOES(int target, int pname, long params);

    public static void glGetTexParameterIuivOES(int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIuivOES(target, pname, memAddress(params));
    }

    public static int glGetTexParameterIuiOES(int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameterIuivOES(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSamplerParameterIivOES ] ---

    public static native void nglSamplerParameterIivOES(int sampler, int pname, long params);

    public static void glSamplerParameterIivOES(int sampler, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIivOES(sampler, pname, memAddress(params));
    }

    public static void glSamplerParameterIiOES(int sampler, int pname, int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglSamplerParameterIivOES(sampler, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSamplerParameterIuivOES ] ---

    public static native void nglSamplerParameterIuivOES(int sampler, int pname, long params);

    public static void glSamplerParameterIuivOES(int sampler, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIuivOES(sampler, pname, memAddress(params));
    }

    public static void glSamplerParameterIuiOES(int sampler, int pname, int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglSamplerParameterIuivOES(sampler, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterIivOES ] ---

    public static native void nglGetSamplerParameterIivOES(int sampler, int pname, long params);

    public static void glGetSamplerParameterIivOES(int sampler, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIivOES(sampler, pname, memAddress(params));
    }

    public static int glGetSamplerParameterIiOES(int sampler, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIivOES(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterIuivOES ] ---

    public static native void nglGetSamplerParameterIuivOES(int sampler, int pname, long params);

    public static void glGetSamplerParameterIuivOES(int sampler, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIuivOES(sampler, pname, memAddress(params));
    }

    public static int glGetSamplerParameterIuiOES(int sampler, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIuivOES(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glTexParameterIivOES TexParameterIivOES} */
    public static void glTexParameterIivOES(int target, int pname, int[] params) {
        long __functionAddress = GLES.getICD().glTexParameterIivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, target, pname, params);
    }

    /** Array version of: {@link #glTexParameterIuivOES TexParameterIuivOES} */
    public static void glTexParameterIuivOES(int target, int pname, int[] params) {
        long __functionAddress = GLES.getICD().glTexParameterIuivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, target, pname, params);
    }

    /** Array version of: {@link #glGetTexParameterIivOES GetTexParameterIivOES} */
    public static void glGetTexParameterIivOES(int target, int pname, int[] params) {
        long __functionAddress = GLES.getICD().glGetTexParameterIivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, target, pname, params);
    }

    /** Array version of: {@link #glGetTexParameterIuivOES GetTexParameterIuivOES} */
    public static void glGetTexParameterIuivOES(int target, int pname, int[] params) {
        long __functionAddress = GLES.getICD().glGetTexParameterIuivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, target, pname, params);
    }

    /** Array version of: {@link #glSamplerParameterIivOES SamplerParameterIivOES} */
    public static void glSamplerParameterIivOES(int sampler, int pname, int[] params) {
        long __functionAddress = GLES.getICD().glSamplerParameterIivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, sampler, pname, params);
    }

    /** Array version of: {@link #glSamplerParameterIuivOES SamplerParameterIuivOES} */
    public static void glSamplerParameterIuivOES(int sampler, int pname, int[] params) {
        long __functionAddress = GLES.getICD().glSamplerParameterIuivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, sampler, pname, params);
    }

    /** Array version of: {@link #glGetSamplerParameterIivOES GetSamplerParameterIivOES} */
    public static void glGetSamplerParameterIivOES(int sampler, int pname, int[] params) {
        long __functionAddress = GLES.getICD().glGetSamplerParameterIivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, sampler, pname, params);
    }

    /** Array version of: {@link #glGetSamplerParameterIuivOES GetSamplerParameterIuivOES} */
    public static void glGetSamplerParameterIuivOES(int sampler, int pname, int[] params) {
        long __functionAddress = GLES.getICD().glGetSamplerParameterIuivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, sampler, pname, params);
    }

}