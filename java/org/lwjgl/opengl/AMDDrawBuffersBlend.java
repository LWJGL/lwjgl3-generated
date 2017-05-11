/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.opengl.org/registry/specs/AMD/draw_buffers_blend.txt">AMD_draw_buffers_blend</a> extension.
 * 
 * <p>This extension builds upon the ARB_draw_buffers and EXT_draw_buffers2 extensions. In ARB_draw_buffers (part of OpenGL 2.0), separate values could be
 * written to each color buffer. This was further enhanced by EXT_draw_buffers2 by adding in the ability to enable blending and to set color write masks
 * independently per color output.</p>
 * 
 * <p>This extension provides the ability to set individual blend equations and blend functions for each color output.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} and <a target="_blank" href="http://www.opengl.org/registry/specs/EXT/draw_buffers2.txt">AMD_draw_buffers_blend</a>.</p>
 */
public class AMDDrawBuffersBlend {

    static { GL.initialize(); }

    protected AMDDrawBuffersBlend() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps) {
        return checkFunctions(
            caps.glBlendFuncIndexedAMD, caps.glBlendFuncSeparateIndexedAMD, caps.glBlendEquationIndexedAMD, caps.glBlendEquationSeparateIndexedAMD
        );
    }

    // --- [ glBlendFuncIndexedAMD ] ---

    public static native void glBlendFuncIndexedAMD(int buf, int src, int dst);

    // --- [ glBlendFuncSeparateIndexedAMD ] ---

    public static native void glBlendFuncSeparateIndexedAMD(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

    // --- [ glBlendEquationIndexedAMD ] ---

    public static native void glBlendEquationIndexedAMD(int buf, int mode);

    // --- [ glBlendEquationSeparateIndexedAMD ] ---

    public static native void glBlendEquationSeparateIndexedAMD(int buf, int modeRGB, int modeAlpha);

}