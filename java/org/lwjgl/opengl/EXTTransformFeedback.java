/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_transform_feedback.txt">EXT_transform_feedback</a> extension.
 * 
 * <p>This extension provides a new mode to the GL, called transform feedback, which records selected vertex attributes for each primitive processed by the
 * GL. The selected attributes are written into buffer objects, and can be written with each attribute in a separate buffer object or with all attributes
 * interleaved into a single buffer object. If a geometry shader is active, the primitives recorded are those emitted by the geometry shader. Otherwise,
 * transform feedback captures primitives whose vertices are transformed by a vertex shader. In either case, the primitives captured are those generated
 * prior to clipping. Transform feedback mode captures the values of specified varying variables emitted from GLSL vertex or geometry shaders.</p>
 * 
 * <p>The vertex data recorded in transform feedback mode is stored into buffer objects as an array of vertex attributes. The regular representation and the
 * use of buffer objects allows the recorded data to be processed directly by the GL without requiring CPU intervention to copy data. In particular,
 * transform feedback data can be used for vertex arrays (via vertex buffer objects), as the source for pixel data (via pixel buffer objects), as shader
 * constant data (via the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_parameter_buffer_object.txt">NV_parameter_buffer_object</a> or {@link EXTBindableUniform EXT_bindable_uniform} extensions), or via any other extension that
 * makes use of buffer objects.</p>
 * 
 * <p>This extension introduces new query object support to allow transform feedback mode to operate asynchronously. Query objects allow applications to
 * determine when transform feedback results are complete, as well as the number of primitives processed and written back to buffer objects while in
 * transform feedback mode. This extension also provides a new rasterizer discard enable, which allows applications to use transform feedback to capture
 * vertex attributes without rendering anything.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} or {@link ARBShaderObjects ARB_shader_objects}. Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public class EXTTransformFeedback {

    /**
     * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
     * BindBufferRangeEXT, BindBufferOffsetEXT and BindBufferBaseEXT.
     */
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_EXT = 0x8C8E;

    /** Accepted by the {@code param} parameter of GetIntegerIndexedvEXT and GetBooleanIndexedvEXT. */
    public static final int
        GL_TRANSFORM_FEEDBACK_BUFFER_START_EXT = 0x8C84,
        GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT  = 0x8C85;

    /**
     * Accepted by the {@code param} parameter of GetIntegerIndexedvEXT and GetBooleanIndexedvEXT, and by the {@code pname} parameter of GetBooleanv,
     * GetDoublev, GetIntegerv, and GetFloatv.
     */
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT = 0x8C8F;

    /** Accepted by the {@code bufferMode} parameter of TransformFeedbackVaryingsEXT. */
    public static final int
        GL_INTERLEAVED_ATTRIBS_EXT = 0x8C8C,
        GL_SEPARATE_ATTRIBS_EXT    = 0x8C8D;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
    public static final int
        GL_PRIMITIVES_GENERATED_EXT                  = 0x8C87,
        GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT = 0x8C88;

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    public static final int GL_RASTERIZER_DISCARD_EXT = 0x8C89;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    public static final int
        GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT = 0x8C8A,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT       = 0x8C8B,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT    = 0x8C80;

    /** Accepted by the {@code pname} parameter of GetProgramiv. */
    public static final int
        GL_TRANSFORM_FEEDBACK_VARYINGS_EXT           = 0x8C83,
        GL_TRANSFORM_FEEDBACK_BUFFER_MODE_EXT        = 0x8C7F,
        GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT = 0x8C76;

    static { GL.initialize(); }

    protected EXTTransformFeedback() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps) {
        return checkFunctions(
            caps.glBindBufferRangeEXT, caps.glBindBufferOffsetEXT, caps.glBindBufferBaseEXT, caps.glBeginTransformFeedbackEXT, caps.glEndTransformFeedbackEXT, 
            caps.glTransformFeedbackVaryingsEXT, caps.glGetTransformFeedbackVaryingEXT, caps.glGetIntegerIndexedvEXT, caps.glGetBooleanIndexedvEXT
        );
    }

    // --- [ glBindBufferRangeEXT ] ---

    public static native void glBindBufferRangeEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

    // --- [ glBindBufferOffsetEXT ] ---

    public static native void glBindBufferOffsetEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset);

    // --- [ glBindBufferBaseEXT ] ---

    public static native void glBindBufferBaseEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer);

    // --- [ glBeginTransformFeedbackEXT ] ---

    public static native void glBeginTransformFeedbackEXT(@NativeType("GLenum") int primitiveMode);

    // --- [ glEndTransformFeedbackEXT ] ---

    public static native void glEndTransformFeedbackEXT();

    // --- [ glTransformFeedbackVaryingsEXT ] ---

    public static native void nglTransformFeedbackVaryingsEXT(int program, int count, long varyings, int bufferMode);

    public static void glTransformFeedbackVaryingsEXT(@NativeType("GLuint") int program, @NativeType("const GLchar * const *") PointerBuffer varyings, @NativeType("GLenum") int bufferMode) {
        nglTransformFeedbackVaryingsEXT(program, varyings.remaining(), memAddress(varyings), bufferMode);
    }

    public static void glTransformFeedbackVaryingsEXT(@NativeType("GLuint") int program, @NativeType("const GLchar * const *") CharSequence[] varyings, @NativeType("GLenum") int bufferMode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long varyingsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, varyings);
            nglTransformFeedbackVaryingsEXT(program, varyings.length, varyingsAddress, bufferMode);
            org.lwjgl.system.APIUtil.apiArrayFree(varyingsAddress, varyings.length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void glTransformFeedbackVaryingsEXT(@NativeType("GLuint") int program, @NativeType("const GLchar * const *") CharSequence varying, @NativeType("GLenum") int bufferMode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long varyingsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, varying);
            nglTransformFeedbackVaryingsEXT(program, 1, varyingsAddress, bufferMode);
            org.lwjgl.system.APIUtil.apiArrayFree(varyingsAddress, 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTransformFeedbackVaryingEXT ] ---

    public static native void nglGetTransformFeedbackVaryingEXT(int program, int index, int bufSize, long length, long size, long type, long name);

    public static void glGetTransformFeedbackVaryingEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        nglGetTransformFeedbackVaryingEXT(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
    }

    @NativeType("void")
    public static String glGetTransformFeedbackVaryingEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        if (CHECKS) {
            check(size, 1);
            check(type, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(bufSize);
            nglGetTransformFeedbackVaryingEXT(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("void")
    public static String glGetTransformFeedbackVaryingEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetTransformFeedbackVaryingEXT(program, index, GL.getCapabilities().OpenGL20
            ? GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT)
            : ARBShaderObjects.glGetObjectParameteriARB(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT), size, type);
    }

    // --- [ glGetIntegerIndexedvEXT ] ---

    public static native void nglGetIntegerIndexedvEXT(int param, int index, long values);

    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int param, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nglGetIntegerIndexedvEXT(param, index, memAddress(values));
    }

    @NativeType("void")
    public static int glGetIntegerIndexedEXT(@NativeType("GLenum") int param, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer values = stack.callocInt(1);
            nglGetIntegerIndexedvEXT(param, index, memAddress(values));
            return values.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetBooleanIndexedvEXT ] ---

    public static native void nglGetBooleanIndexedvEXT(int param, int index, long values);

    public static void glGetBooleanIndexedvEXT(@NativeType("GLenum") int param, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nglGetBooleanIndexedvEXT(param, index, memAddress(values));
    }

    @NativeType("void")
    public static boolean glGetBooleanIndexedEXT(@NativeType("GLenum") int param, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer values = stack.calloc(1);
            nglGetBooleanIndexedvEXT(param, index, memAddress(values));
            return values.get(0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glGetTransformFeedbackVaryingEXT GetTransformFeedbackVaryingEXT} */
    public static void glGetTransformFeedbackVaryingEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLsizei *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetTransformFeedbackVaryingEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(__functionAddress, program, index, name.remaining(), length, size, type, memAddress(name));
    }

    /** Array version of: {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int param, @NativeType("GLuint") int index, @NativeType("GLint *") int[] values) {
        long __functionAddress = GL.getICD().glGetIntegerIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        callPV(__functionAddress, param, index, values);
    }

}