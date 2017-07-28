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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/gles/extensions/QCOM/QCOM_extended_get2.txt">QCOM_extended_get2</a> extension.
 * 
 * <p>This extension enables instrumenting the driver for debugging of OpenGL ES applications.</p>
 */
public class QCOMExtendedGet2 {

    static { GLES.initialize(); }

    protected QCOMExtendedGet2() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLESCapabilities caps) {
        return checkFunctions(
            caps.glExtGetShadersQCOM, caps.glExtGetProgramsQCOM, caps.glExtIsProgramBinaryQCOM, caps.glExtGetProgramBinarySourceQCOM
        );
    }

    // --- [ glExtGetShadersQCOM ] ---

    public static native void nglExtGetShadersQCOM(long shaders, int maxShaders, long numShaders);

    public static void glExtGetShadersQCOM(@NativeType("GLuint *") IntBuffer shaders, @NativeType("GLint *") IntBuffer numShaders) {
        if (CHECKS) {
            checkSafe(numShaders, 1);
        }
        nglExtGetShadersQCOM(memAddressSafe(shaders), remainingSafe(shaders), memAddressSafe(numShaders));
    }

    // --- [ glExtGetProgramsQCOM ] ---

    public static native void nglExtGetProgramsQCOM(long programs, int maxPrograms, long numPrograms);

    public static void glExtGetProgramsQCOM(@NativeType("GLuint *") IntBuffer programs, @NativeType("GLint *") IntBuffer numPrograms) {
        if (CHECKS) {
            checkSafe(numPrograms, 1);
        }
        nglExtGetProgramsQCOM(memAddressSafe(programs), remainingSafe(programs), memAddressSafe(numPrograms));
    }

    // --- [ glExtIsProgramBinaryQCOM ] ---

    @NativeType("GLboolean")
    public static native boolean glExtIsProgramBinaryQCOM(@NativeType("GLuint") int program);

    // --- [ glExtGetProgramBinarySourceQCOM ] ---

    public static native void nglExtGetProgramBinarySourceQCOM(int program, int shadertype, long source, long length);

    public static void glExtGetProgramBinarySourceQCOM(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar *") ByteBuffer source, @NativeType("GLint *") IntBuffer length) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglExtGetProgramBinarySourceQCOM(program, shadertype, memAddress(source), memAddressSafe(length));
    }

    /** Array version of: {@link #glExtGetShadersQCOM ExtGetShadersQCOM} */
    public static void glExtGetShadersQCOM(@NativeType("GLuint *") int[] shaders, @NativeType("GLint *") int[] numShaders) {
        long __functionAddress = GLES.getICD().glExtGetShadersQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numShaders, 1);
        }
        callPPV(__functionAddress, shaders, lengthSafe(shaders), numShaders);
    }

    /** Array version of: {@link #glExtGetProgramsQCOM ExtGetProgramsQCOM} */
    public static void glExtGetProgramsQCOM(@NativeType("GLuint *") int[] programs, @NativeType("GLint *") int[] numPrograms) {
        long __functionAddress = GLES.getICD().glExtGetProgramsQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numPrograms, 1);
        }
        callPPV(__functionAddress, programs, lengthSafe(programs), numPrograms);
    }

    /** Array version of: {@link #glExtGetProgramBinarySourceQCOM ExtGetProgramBinarySourceQCOM} */
    public static void glExtGetProgramBinarySourceQCOM(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar *") ByteBuffer source, @NativeType("GLint *") int[] length) {
        long __functionAddress = GLES.getICD().glExtGetProgramBinarySourceQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(__functionAddress, program, shadertype, memAddress(source), length);
    }

}