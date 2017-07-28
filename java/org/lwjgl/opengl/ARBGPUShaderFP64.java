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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.opengl.org/registry/specs/ARB/gpu_shader_fp64.txt">ARB_gpu_shader_fp64</a> extension.
 * 
 * <p>This extension allows GLSL shaders to use double-precision floating-point data types, including vectors and matrices of doubles. Doubles may be used as
 * inputs, outputs, and uniforms.</p>
 * 
 * <p>The shading language supports various arithmetic and comparison operators on double-precision scalar, vector, and matrix types, and provides a set of
 * built-in functions including:</p>
 * 
 * <ul>
 * <li>square roots and inverse square roots;</li>
 * <li>fused floating-point multiply-add operations;</li>
 * <li>splitting a floating-point number into a significand and exponent (frexp), or building a floating-point number from a significand and exponent
 * (ldexp);</li>
 * <li>absolute value, sign tests, various functions to round to an integer value, modulus, minimum, maximum, clamping, blending two values, step
 * functions, and testing for infinity and NaN values;</li>
 * <li>packing and unpacking doubles into a pair of 32-bit unsigned integers;</li>
 * <li>matrix component-wise multiplication, and computation of outer products, transposes, determinants, and inverses; and</li>
 * <li>vector relational functions.</li>
 * </ul>
 * 
 * <p>Double-precision versions of angle, trigonometry, and exponential functions are not supported.</p>
 * 
 * <p>Implicit conversions are supported from integer and single-precision floating-point values to doubles, and this extension uses the relaxed function
 * overloading rules specified by the ARB_gpu_shader5 extension to resolve ambiguities.</p>
 * 
 * <p>This extension provides API functions for specifying double-precision uniforms in the default uniform block, including functions similar to the uniform
 * functions added by <a target="_blank" href="http://www.opengl.org/registry/specs/EXT/direct_state_access.txt">EXT_direct_state_access</a> (if supported).</p>
 * 
 * <p>This extension provides an "LF" suffix for specifying double-precision constants. Floating-point constants without a suffix in GLSL are treated as
 * single-precision values for backward compatibility with versions not supporting doubles; similar constants are treated as double-precision values in the
 * "C" programming language.</p>
 * 
 * <p>This extension does not support interpolation of double-precision values; doubles used as fragment shader inputs must be qualified as "flat".
 * Additionally, this extension does not allow vertex attributes with 64-bit components. That support is added separately by
 * <a target="_blank" href="http://www.opengl.org/registry/specs/EXT/vertex_attrib_64bit.txt">EXT_vertex_attrib_64bit</a>.</p>
 * 
 * <p>Requires {@link GL32 GL32} and GLSL 1.50. Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public class ARBGPUShaderFP64 {

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying. */
    public static final int
        GL_DOUBLE_VEC2   = 0x8FFC,
        GL_DOUBLE_VEC3   = 0x8FFD,
        GL_DOUBLE_VEC4   = 0x8FFE,
        GL_DOUBLE_MAT2   = 0x8F46,
        GL_DOUBLE_MAT3   = 0x8F47,
        GL_DOUBLE_MAT4   = 0x8F48,
        GL_DOUBLE_MAT2x3 = 0x8F49,
        GL_DOUBLE_MAT2x4 = 0x8F4A,
        GL_DOUBLE_MAT3x2 = 0x8F4B,
        GL_DOUBLE_MAT3x4 = 0x8F4C,
        GL_DOUBLE_MAT4x2 = 0x8F4D,
        GL_DOUBLE_MAT4x3 = 0x8F4E;

    static { GL.initialize(); }

    protected ARBGPUShaderFP64() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps, java.util.Set<String> ext) {
        return checkFunctions(
            caps.glUniform1d, caps.glUniform2d, caps.glUniform3d, caps.glUniform4d, caps.glUniform1dv, caps.glUniform2dv, caps.glUniform3dv, caps.glUniform4dv, 
            caps.glUniformMatrix2dv, caps.glUniformMatrix3dv, caps.glUniformMatrix4dv, caps.glUniformMatrix2x3dv, caps.glUniformMatrix2x4dv, 
            caps.glUniformMatrix3x2dv, caps.glUniformMatrix3x4dv, caps.glUniformMatrix4x2dv, caps.glUniformMatrix4x3dv, caps.glGetUniformdv
        );
    }

    // --- [ glUniform1d ] ---

    /**
     * Specifies the value of a double uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     */
    public static native void glUniform1d(@NativeType("GLint") int location, @NativeType("GLdouble") double x);

    // --- [ glUniform2d ] ---

    /**
     * Specifies the value of a dvec2 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     */
    public static native void glUniform2d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    // --- [ glUniform3d ] ---

    /**
     * Specifies the value of a dvec3 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     */
    public static native void glUniform3d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glUniform4d ] ---

    /**
     * Specifies the value of a dvec4 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     * @param w        the uniform w value
     */
    public static native void glUniform4d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glUniform1dv ] ---

    /**
     * Unsafe version of: {@link #glUniform1dv Uniform1dv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform1dv(int location, int count, long value);

    /**
     * Specifies the value of a single double uniform variable or a double uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glUniform1dv(@NativeType("GLint") int location, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglUniform1dv(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2dv ] ---

    /**
     * Unsafe version of: {@link #glUniform2dv Uniform2dv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform2dv(int location, int count, long value);

    /**
     * Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glUniform2dv(@NativeType("GLint") int location, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglUniform2dv(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3dv ] ---

    /**
     * Unsafe version of: {@link #glUniform3dv Uniform3dv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform3dv(int location, int count, long value);

    /**
     * Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glUniform3dv(@NativeType("GLint") int location, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglUniform3dv(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4dv ] ---

    /**
     * Unsafe version of: {@link #glUniform4dv Uniform4dv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform4dv(int location, int count, long value);

    /**
     * Specifies the value of a single dvec4 uniform variable or a dvec4 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glUniform4dv(@NativeType("GLint") int location, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglUniform4dv(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniformMatrix2dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix2dv UniformMatrix2dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix2dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat2 uniform variable or a dmat2 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glUniformMatrix2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglUniformMatrix2dv(location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix3dv UniformMatrix3dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix3dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat3 uniform variable or a dmat3 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glUniformMatrix3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglUniformMatrix3dv(location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix4dv UniformMatrix4dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix4dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat4 uniform variable or a dmat4 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glUniformMatrix4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglUniformMatrix4dv(location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix2x3dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix2x3dv UniformMatrix2x3dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix2x3dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat2x3 uniform variable or a dmat2x3 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glUniformMatrix2x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglUniformMatrix2x3dv(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix2x4dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix2x4dv UniformMatrix2x4dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix2x4dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat2x4 uniform variable or a dmat2x4 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glUniformMatrix2x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglUniformMatrix2x4dv(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x2dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix3x2dv UniformMatrix3x2dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix3x2dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat3x2 uniform variable or a dmat3x2 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glUniformMatrix3x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglUniformMatrix3x2dv(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x4dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix3x4dv UniformMatrix3x4dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix3x4dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat3x4 uniform variable or a dmat3x4 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glUniformMatrix3x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglUniformMatrix3x4dv(location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x2dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix4x2dv UniformMatrix4x2dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix4x2dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glUniformMatrix4x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglUniformMatrix4x2dv(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x3dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix4x3dv UniformMatrix4x3dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glUniformMatrix4x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglUniformMatrix4x3dv(location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glGetUniformdv ] ---

    /** Unsafe version of: {@link #glGetUniformdv GetUniformdv} */
    public static native void nglGetUniformdv(int program, int location, long params);

    /**
     * Returns the double value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   the value of the specified uniform variable
     */
    public static void glGetUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformdv(program, location, memAddress(params));
    }

    /**
     * Returns the double value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     */
    @NativeType("void")
    public static double glGetUniformd(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetUniformdv(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glProgramUniform1dEXT ] ---

    /**
     * DSA version of {@link #glUniform1d Uniform1d}.
     *
     * @param program  the program object to update
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     */
    public static native void glProgramUniform1dEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x);

    // --- [ glProgramUniform2dEXT ] ---

    /**
     * DSA version of {@link #glUniform2d Uniform2d}.
     *
     * @param program  the program object to update
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     */
    public static native void glProgramUniform2dEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    // --- [ glProgramUniform3dEXT ] ---

    /**
     * DSA version of {@link #glUniform3d Uniform3d}.
     *
     * @param program  the program object to update
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     */
    public static native void glProgramUniform3dEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glProgramUniform4dEXT ] ---

    /**
     * DSA version of {@link #glUniform4d Uniform4d}.
     *
     * @param program  the program object to update
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     * @param w        the uniform w value
     */
    public static native void glProgramUniform4dEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glProgramUniform1dvEXT ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform1dvEXT ProgramUniform1dvEXT}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglProgramUniform1dvEXT(int program, int location, int count, long value);

    /**
     * DSA version of {@link #glUniform1dv Uniform1dv}.
     *
     * @param program  the program object to update
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform1dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglProgramUniform1dvEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2dvEXT ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform2dvEXT ProgramUniform2dvEXT}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglProgramUniform2dvEXT(int program, int location, int count, long value);

    /**
     * DSA version of {@link #glUniform2dv Uniform2dv}.
     *
     * @param program  the program object to update
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglProgramUniform2dvEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3dvEXT ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform3dvEXT ProgramUniform3dvEXT}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglProgramUniform3dvEXT(int program, int location, int count, long value);

    /**
     * DSA version of {@link #glUniform3dv Uniform3dv}.
     *
     * @param program  the program object to update
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglProgramUniform3dvEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4dvEXT ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform4dvEXT ProgramUniform4dvEXT}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglProgramUniform4dvEXT(int program, int location, int count, long value);

    /**
     * DSA version of {@link #glUniform4dv Uniform4dv}.
     *
     * @param program  the program object to update
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglProgramUniform4dvEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2dvEXT ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix2dvEXT ProgramUniformMatrix2dvEXT}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglProgramUniformMatrix2dvEXT(int program, int location, int count, boolean transpose, long value);

    /**
     * DSA version of {@link #glUniformMatrix2dv UniformMatrix2dv}.
     *
     * @param program   the program object to update
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglProgramUniformMatrix2dvEXT(program, location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3dvEXT ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix3dvEXT ProgramUniformMatrix3dvEXT}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglProgramUniformMatrix3dvEXT(int program, int location, int count, boolean transpose, long value);

    /**
     * DSA version of {@link #glUniformMatrix3dv UniformMatrix3dv}.
     *
     * @param program   the program object to update
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglProgramUniformMatrix3dvEXT(program, location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4dvEXT ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix4dvEXT ProgramUniformMatrix4dvEXT}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglProgramUniformMatrix4dvEXT(int program, int location, int count, boolean transpose, long value);

    /**
     * DSA version of {@link #glUniformMatrix4dv UniformMatrix4dv}.
     *
     * @param program   the program object to update
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglProgramUniformMatrix4dvEXT(program, location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x3dvEXT ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix2x3dvEXT ProgramUniformMatrix2x3dvEXT}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglProgramUniformMatrix2x3dvEXT(int program, int location, int count, boolean transpose, long value);

    /**
     * DSA version of {@link #glUniformMatrix2x3dv UniformMatrix2x3dv}.
     *
     * @param program   the program object to update
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix2x3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglProgramUniformMatrix2x3dvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x4dvEXT ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix2x4dvEXT ProgramUniformMatrix2x4dvEXT}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglProgramUniformMatrix2x4dvEXT(int program, int location, int count, boolean transpose, long value);

    /**
     * DSA version of {@link #glUniformMatrix2x4dv UniformMatrix2x4dv}.
     *
     * @param program   the program object to update
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix2x4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglProgramUniformMatrix2x4dvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x2dvEXT ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix3x2dvEXT ProgramUniformMatrix3x2dvEXT}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglProgramUniformMatrix3x2dvEXT(int program, int location, int count, boolean transpose, long value);

    /**
     * DSA version of {@link #glUniformMatrix3x2dv UniformMatrix3x2dv}.
     *
     * @param program   the program object to update
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix3x2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglProgramUniformMatrix3x2dvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x4dvEXT ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix3x4dvEXT ProgramUniformMatrix3x4dvEXT}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglProgramUniformMatrix3x4dvEXT(int program, int location, int count, boolean transpose, long value);

    /**
     * DSA version of {@link #glUniformMatrix3x4dv UniformMatrix3x4dv}.
     *
     * @param program   the program object to update
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix3x4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglProgramUniformMatrix3x4dvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x2dvEXT ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix4x2dvEXT ProgramUniformMatrix4x2dvEXT}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglProgramUniformMatrix4x2dvEXT(int program, int location, int count, boolean transpose, long value);

    /**
     * DSA version of {@link #glUniformMatrix4x2dv UniformMatrix4x2dv}.
     *
     * @param program   the program object to update
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix4x2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglProgramUniformMatrix4x2dvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x3dvEXT ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix4x3dvEXT ProgramUniformMatrix4x3dvEXT}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglProgramUniformMatrix4x3dvEXT(int program, int location, int count, boolean transpose, long value);

    /**
     * DSA version of {@link #glUniformMatrix4x3dv UniformMatrix4x3dv}.
     *
     * @param program   the program object to update
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix4x3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") DoubleBuffer value) {
        nglProgramUniformMatrix4x3dvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    /** Array version of: {@link #glUniform1dv Uniform1dv} */
    public static void glUniform1dv(@NativeType("GLint") int location, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glUniform1dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length, value);
    }

    /** Array version of: {@link #glUniform2dv Uniform2dv} */
    public static void glUniform2dv(@NativeType("GLint") int location, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glUniform2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length >> 1, value);
    }

    /** Array version of: {@link #glUniform3dv Uniform3dv} */
    public static void glUniform3dv(@NativeType("GLint") int location, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glUniform3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length / 3, value);
    }

    /** Array version of: {@link #glUniform4dv Uniform4dv} */
    public static void glUniform4dv(@NativeType("GLint") int location, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glUniform4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length >> 2, value);
    }

    /** Array version of: {@link #glUniformMatrix2dv UniformMatrix2dv} */
    public static void glUniformMatrix2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length >> 2, transpose, value);
    }

    /** Array version of: {@link #glUniformMatrix3dv UniformMatrix3dv} */
    public static void glUniformMatrix3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length / 9, transpose, value);
    }

    /** Array version of: {@link #glUniformMatrix4dv UniformMatrix4dv} */
    public static void glUniformMatrix4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length >> 4, transpose, value);
    }

    /** Array version of: {@link #glUniformMatrix2x3dv UniformMatrix2x3dv} */
    public static void glUniformMatrix2x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2x3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length / 6, transpose, value);
    }

    /** Array version of: {@link #glUniformMatrix2x4dv UniformMatrix2x4dv} */
    public static void glUniformMatrix2x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2x4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length >> 3, transpose, value);
    }

    /** Array version of: {@link #glUniformMatrix3x2dv UniformMatrix3x2dv} */
    public static void glUniformMatrix3x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3x2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length / 6, transpose, value);
    }

    /** Array version of: {@link #glUniformMatrix3x4dv UniformMatrix3x4dv} */
    public static void glUniformMatrix3x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3x4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length / 12, transpose, value);
    }

    /** Array version of: {@link #glUniformMatrix4x2dv UniformMatrix4x2dv} */
    public static void glUniformMatrix4x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4x2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length >> 3, transpose, value);
    }

    /** Array version of: {@link #glUniformMatrix4x3dv UniformMatrix4x3dv} */
    public static void glUniformMatrix4x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4x3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length / 12, transpose, value);
    }

    /** Array version of: {@link #glGetUniformdv GetUniformdv} */
    public static void glGetUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetUniformdv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, program, location, params);
    }

    /** Array version of: {@link #glProgramUniform1dvEXT ProgramUniform1dvEXT} */
    public static void glProgramUniform1dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length, value);
    }

    /** Array version of: {@link #glProgramUniform2dvEXT ProgramUniform2dvEXT} */
    public static void glProgramUniform2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 1, value);
    }

    /** Array version of: {@link #glProgramUniform3dvEXT ProgramUniform3dvEXT} */
    public static void glProgramUniform3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 3, value);
    }

    /** Array version of: {@link #glProgramUniform4dvEXT ProgramUniform4dvEXT} */
    public static void glProgramUniform4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 2, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix2dvEXT ProgramUniformMatrix2dvEXT} */
    public static void glProgramUniformMatrix2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 2, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix3dvEXT ProgramUniformMatrix3dvEXT} */
    public static void glProgramUniformMatrix3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 9, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix4dvEXT ProgramUniformMatrix4dvEXT} */
    public static void glProgramUniformMatrix4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 4, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix2x3dvEXT ProgramUniformMatrix2x3dvEXT} */
    public static void glProgramUniformMatrix2x3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 6, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix2x4dvEXT ProgramUniformMatrix2x4dvEXT} */
    public static void glProgramUniformMatrix2x4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix3x2dvEXT ProgramUniformMatrix3x2dvEXT} */
    public static void glProgramUniformMatrix3x2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 6, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix3x4dvEXT ProgramUniformMatrix3x4dvEXT} */
    public static void glProgramUniformMatrix3x4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 12, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix4x2dvEXT ProgramUniformMatrix4x2dvEXT} */
    public static void glProgramUniformMatrix4x2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix4x3dvEXT ProgramUniformMatrix4x3dvEXT} */
    public static void glProgramUniformMatrix4x3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("const GLdouble *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 12, transpose, value);
    }

}