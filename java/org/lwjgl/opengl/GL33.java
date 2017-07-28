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
 * The core OpenGL 3.3 functionality. OpenGL 3.3 implementations support revision 3.30 of the OpenGL Shading Language.
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a target="_blank" href="http://www.opengl.org/registry/specs/ARB/shader_bit_encoding.txt">ARB_shader_bit_encoding</a></li>
 * <li><a target="_blank" href="http://www.opengl.org/registry/specs/ARB/blend_func_extended.txt">ARB_blend_func_extended</a></li>
 * <li><a target="_blank" href="http://www.opengl.org/registry/specs/ARB/explicit_attrib_location.txt">ARB_explicit_attrib_location</a></li>
 * <li><a target="_blank" href="http://www.opengl.org/registry/specs/ARB/occlusion_query2.txt">ARB_occlusion_query2</a></li>
 * <li><a target="_blank" href="http://www.opengl.org/registry/specs/ARB/sampler_objects.txt">ARB_sampler_objects</a></li>
 * <li><a target="_blank" href="http://www.opengl.org/registry/specs/ARB/texture_rgb10_a2ui.txt">ARB_texture_rgb10_a2ui</a></li>
 * <li><a target="_blank" href="http://www.opengl.org/registry/specs/ARB/texture_swizzle.txt">ARB_texture_swizzle</a></li>
 * <li><a target="_blank" href="http://www.opengl.org/registry/specs/ARB/timer_query.txt">ARB_timer_query</a></li>
 * <li><a target="_blank" href="http://www.opengl.org/registry/specs/ARB/instanced_arrays.txt">ARB_instanced_arrays</a></li>
 * <li><a target="_blank" href="http://www.opengl.org/registry/specs/ARB/vertex_type_2_10_10_10_rev.txt">ARB_vertex_type_2_10_10_10_rev</a></li>
 * </ul>
 */
public class GL33 {

    /**
     * Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunci, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and
     * {@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparatei.
     */
    public static final int
        GL_SRC1_COLOR           = 0x88F9,
        GL_ONE_MINUS_SRC1_COLOR = 0x88FA,
        GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev. */
    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
    public static final int GL_ANY_SAMPLES_PASSED = 0x8C2F;

    /** Accepted by the {@code value} parameter of the GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev functions. */
    public static final int GL_SAMPLER_BINDING = 0x8919;

    /**
     * Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, RenderbufferStorage and
     * RenderbufferStorageMultisample.
     */
    public static final int GL_RGB10_A2UI = 0x906F;

    /** Accepted by the {@code pname} parameters of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv. */
    public static final int
        GL_TEXTURE_SWIZZLE_R = 0x8E42,
        GL_TEXTURE_SWIZZLE_G = 0x8E43,
        GL_TEXTURE_SWIZZLE_B = 0x8E44,
        GL_TEXTURE_SWIZZLE_A = 0x8E45;

    /** Accepted by the {@code pname} parameters of TexParameteriv,  TexParameterfv, GetTexParameterfv, and GetTexParameteriv. */
    public static final int GL_TEXTURE_SWIZZLE_RGBA = 0x8E46;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
    public static final int GL_TIME_ELAPSED = 0x88BF;

    /**
     * Accepted by the {@code target} parameter of GetQueryiv and QueryCounter. Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv,
     * GetInteger64v, GetFloatv, and GetDoublev.
     */
    public static final int GL_TIMESTAMP = 0x8E28;

    /** Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, and GetVertexAttribiv. */
    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;

    /**
     * Accepted by the {@code type} parameter of VertexAttribPointer, VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, TexCoordPointer,
     * VertexAttribP{1234}ui, VertexP*, TexCoordP*, MultiTexCoordP*, NormalP3ui, ColorP*, SecondaryColorP* and VertexAttribP*.
     */
    public static final int GL_INT_2_10_10_10_REV = 0x8D9F;

    static { GL.initialize(); }

    protected GL33() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps, boolean fc) {
        return (fc || checkFunctions(
            caps.glVertexP2ui, caps.glVertexP3ui, caps.glVertexP4ui, caps.glVertexP2uiv, caps.glVertexP3uiv, caps.glVertexP4uiv, caps.glTexCoordP1ui, 
            caps.glTexCoordP2ui, caps.glTexCoordP3ui, caps.glTexCoordP4ui, caps.glTexCoordP1uiv, caps.glTexCoordP2uiv, caps.glTexCoordP3uiv, 
            caps.glTexCoordP4uiv, caps.glMultiTexCoordP1ui, caps.glMultiTexCoordP2ui, caps.glMultiTexCoordP3ui, caps.glMultiTexCoordP4ui, 
            caps.glMultiTexCoordP1uiv, caps.glMultiTexCoordP2uiv, caps.glMultiTexCoordP3uiv, caps.glMultiTexCoordP4uiv, caps.glNormalP3ui, caps.glNormalP3uiv, 
            caps.glColorP3ui, caps.glColorP4ui, caps.glColorP3uiv, caps.glColorP4uiv, caps.glSecondaryColorP3ui, caps.glSecondaryColorP3uiv
        )) && checkFunctions(
            caps.glBindFragDataLocationIndexed, caps.glGetFragDataIndex, caps.glGenSamplers, caps.glDeleteSamplers, caps.glIsSampler, caps.glBindSampler, 
            caps.glSamplerParameteri, caps.glSamplerParameterf, caps.glSamplerParameteriv, caps.glSamplerParameterfv, caps.glSamplerParameterIiv, 
            caps.glSamplerParameterIuiv, caps.glGetSamplerParameteriv, caps.glGetSamplerParameterfv, caps.glGetSamplerParameterIiv, 
            caps.glGetSamplerParameterIuiv, caps.glQueryCounter, caps.glGetQueryObjecti64v, caps.glGetQueryObjectui64v, caps.glVertexAttribDivisor, 
            caps.glVertexAttribP1ui, caps.glVertexAttribP2ui, caps.glVertexAttribP3ui, caps.glVertexAttribP4ui, caps.glVertexAttribP1uiv, 
            caps.glVertexAttribP2uiv, caps.glVertexAttribP3uiv, caps.glVertexAttribP4uiv
        );
    }

    // --- [ glBindFragDataLocationIndexed ] ---

    /** Unsafe version of: {@link #glBindFragDataLocationIndexed BindFragDataLocationIndexed} */
    public static native void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBindFragDataLocationIndexed">Reference Page</a></p>
     * 
     * Binds a user-defined varying out variable to a fragment shader color number and index.
     *
     * @param program     the name of the program containing varying out variable whose binding to modify
     * @param colorNumber the color number to bind the user-defined varying out variable to
     * @param index       the index of the color input to bind the user-defined varying out variable to
     * @param name        the name of the user-defined varying out variable whose binding to modify
     */
    public static void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("const GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindFragDataLocationIndexed(program, colorNumber, index, memAddress(name));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBindFragDataLocationIndexed">Reference Page</a></p>
     * 
     * Binds a user-defined varying out variable to a fragment shader color number and index.
     *
     * @param program     the name of the program containing varying out variable whose binding to modify
     * @param colorNumber the color number to bind the user-defined varying out variable to
     * @param index       the index of the color input to bind the user-defined varying out variable to
     * @param name        the name of the user-defined varying out variable whose binding to modify
     */
    public static void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("const GLchar *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer nameEncoded = stack.ASCII(name);
            nglBindFragDataLocationIndexed(program, colorNumber, index, memAddress(nameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFragDataIndex ] ---

    /** Unsafe version of: {@link #glGetFragDataIndex GetFragDataIndex} */
    public static native int nglGetFragDataIndex(int program, long name);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetFragDataIndex">Reference Page</a></p>
     * 
     * Queries the bindings of color indices to user-defined varying out variables.
     *
     * @param program the name of the program containing varying out variable whose binding to query
     * @param name    the name of the user-defined varying out variable whose index to query
     */
    @NativeType("GLint")
    public static int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("const GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetFragDataIndex(program, memAddress(name));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetFragDataIndex">Reference Page</a></p>
     * 
     * Queries the bindings of color indices to user-defined varying out variables.
     *
     * @param program the name of the program containing varying out variable whose binding to query
     * @param name    the name of the user-defined varying out variable whose index to query
     */
    @NativeType("GLint")
    public static int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("const GLchar *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer nameEncoded = stack.ASCII(name);
            return nglGetFragDataIndex(program, memAddress(nameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenSamplers ] ---

    /**
     * Unsafe version of: {@link #glGenSamplers GenSamplers}
     *
     * @param count the number of sampler object names to generate
     */
    public static native void nglGenSamplers(int count, long samplers);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGenSamplers">Reference Page</a></p>
     * 
     * Generates sampler object names.
     *
     * @param samplers a buffer in which the generated sampler object names are stored
     */
    public static void glGenSamplers(@NativeType("GLuint *") IntBuffer samplers) {
        nglGenSamplers(samplers.remaining(), memAddress(samplers));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGenSamplers">Reference Page</a></p>
     * 
     * Generates sampler object names.
     */
    @NativeType("void")
    public static int glGenSamplers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer samplers = stack.callocInt(1);
            nglGenSamplers(1, memAddress(samplers));
            return samplers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteSamplers ] ---

    /**
     * Unsafe version of: {@link #glDeleteSamplers DeleteSamplers}
     *
     * @param count the number of sampler objects to be deleted
     */
    public static native void nglDeleteSamplers(int count, long samplers);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glDeleteSamplers">Reference Page</a></p>
     * 
     * Deletes named sampler objects.
     *
     * @param samplers an array of sampler objects to be deleted
     */
    public static void glDeleteSamplers(@NativeType("const GLuint *") IntBuffer samplers) {
        nglDeleteSamplers(samplers.remaining(), memAddress(samplers));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glDeleteSamplers">Reference Page</a></p>
     * 
     * Deletes named sampler objects.
     */
    public static void glDeleteSamplers(@NativeType("const GLuint *") int sampler) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer samplers = stack.ints(sampler);
            nglDeleteSamplers(1, memAddress(samplers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsSampler ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glIsSampler">Reference Page</a></p>
     * 
     * Determines if a name corresponds to a sampler object.
     *
     * @param sampler a value that may be the name of a sampler object
     */
    @NativeType("GLboolean")
    public static native boolean glIsSampler(@NativeType("GLuint") int sampler);

    // --- [ glBindSampler ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBindSampler">Reference Page</a></p>
     * 
     * Binds a named sampler to a texturing target.
     *
     * @param unit    the index of the texture unit to which the sampler is bound
     * @param sampler the name of a sampler
     */
    public static native void glBindSampler(@NativeType("GLuint") int unit, @NativeType("GLuint") int sampler);

    // --- [ glSamplerParameteri ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glSamplerParameteri">Reference Page</a></p>
     * 
     * Set the integer value of a sampler parameter.
     *
     * @param sampler the sampler object whose parameter to modify
     * @param pname   the symbolic name of a single-valued sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr></table>
     * @param param   the value of {@code pname}
     */
    public static native void glSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glSamplerParameterf ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glSamplerParameterf">Reference Page</a></p>
     * 
     * Float version of {@link #glSamplerParameteri SamplerParameteri}.
     *
     * @param sampler the sampler object whose parameter to modify
     * @param pname   the symbolic name of a single-valued sampler parameter
     * @param param   the value of {@code pname}
     */
    public static native void glSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glSamplerParameteriv ] ---

    /** Unsafe version of: {@link #glSamplerParameteriv SamplerParameteriv} */
    public static native void nglSamplerParameteriv(int sampler, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glSamplerParameter">Reference Page</a></p>
     * 
     * Pointer version of {@link #glSamplerParameteri SamplerParameteri}.
     *
     * @param sampler the sampler object whose parameter to modify
     * @param pname   the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr></table>
     * @param params  an array where the value or values of {@code pname} are stored
     */
    public static void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("const GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameteriv(sampler, pname, memAddress(params));
    }

    // --- [ glSamplerParameterfv ] ---

    /** Unsafe version of: {@link #glSamplerParameterfv SamplerParameterfv} */
    public static native void nglSamplerParameterfv(int sampler, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glSamplerParameter">Reference Page</a></p>
     * 
     * Float version of {@link #glSamplerParameteriv SamplerParameteriv}.
     *
     * @param sampler the sampler object whose parameter to modify
     * @param pname   the symbolic name of a sampler parameter
     * @param params  an array where the value or values of {@code pname} are stored
     */
    public static void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("const GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterfv(sampler, pname, memAddress(params));
    }

    // --- [ glSamplerParameterIiv ] ---

    /** Unsafe version of: {@link #glSamplerParameterIiv SamplerParameterIiv} */
    public static native void nglSamplerParameterIiv(int sampler, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glSamplerParameter">Reference Page</a></p>
     * 
     * Pure integer version of {@link #glSamplerParameteriv SamplerParameteriv}.
     *
     * @param sampler the sampler object whose parameter to modify
     * @param pname   the symbolic name of a sampler parameter
     * @param params  an array where the value or values of {@code pname} are stored
     */
    public static void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("const GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIiv(sampler, pname, memAddress(params));
    }

    // --- [ glSamplerParameterIuiv ] ---

    /** Unsafe version of: {@link #glSamplerParameterIuiv SamplerParameterIuiv} */
    public static native void nglSamplerParameterIuiv(int sampler, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glSamplerParameter">Reference Page</a></p>
     * 
     * Unsigned pure integer version of {@link #glSamplerParameteriv SamplerParameteriv}.
     *
     * @param sampler the sampler object whose parameter to modify
     * @param pname   the symbolic name of a sampler parameter
     * @param params  an array where the value or values of {@code pname} are stored
     */
    public static void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("const GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIuiv(sampler, pname, memAddress(params));
    }

    // --- [ glGetSamplerParameteriv ] ---

    /** Unsafe version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv} */
    public static native void nglGetSamplerParameteriv(int sampler, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetSamplerParameter">Reference Page</a></p>
     * 
     * Return the integer value(s) of a sampler parameter.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>,</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td></tr></table>
     * @param params  the sampler parameters
     */
    public static void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameteriv(sampler, pname, memAddress(params));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetSamplerParameter">Reference Page</a></p>
     * 
     * Return the integer value(s) of a sampler parameter.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>,</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameteriv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterfv ] ---

    /** Unsafe version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv} */
    public static native void nglGetSamplerParameterfv(int sampler, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetSamplerParameter">Reference Page</a></p>
     * 
     * Float version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter
     * @param params  the sampler parameters
     */
    public static void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterfv(sampler, pname, memAddress(params));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetSamplerParameter">Reference Page</a></p>
     * 
     * Float version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter
     */
    @NativeType("void")
    public static float glGetSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetSamplerParameterfv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterIiv ] ---

    /** Unsafe version of: {@link #glGetSamplerParameterIiv GetSamplerParameterIiv} */
    public static native void nglGetSamplerParameterIiv(int sampler, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetSamplerParameter">Reference Page</a></p>
     * 
     * Pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter
     * @param params  the sampler parameters
     */
    public static void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetSamplerParameter">Reference Page</a></p>
     * 
     * Pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter
     */
    @NativeType("void")
    public static int glGetSamplerParameterIi(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterIuiv ] ---

    /** Unsafe version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv} */
    public static native void nglGetSamplerParameterIuiv(int sampler, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetSamplerParameter">Reference Page</a></p>
     * 
     * Unsigned pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter
     * @param params  the sampler parameters
     */
    public static void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetSamplerParameter">Reference Page</a></p>
     * 
     * Unsigned pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter
     */
    @NativeType("void")
    public static int glGetSamplerParameterIui(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glQueryCounter ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glQueryCounter">Reference Page</a></p>
     * 
     * Records the GL time into a query object after all previous commands have reached the GL server but have not yet necessarily executed.
     *
     * @param id     the name of a query object into which to record the GL time
     * @param target the counter to query. Must be:<br><table><tr><td>{@link #GL_TIMESTAMP TIMESTAMP}</td></tr></table>
     */
    public static native void glQueryCounter(@NativeType("GLuint") int id, @NativeType("GLenum") int target);

    // --- [ glGetQueryObjecti64v ] ---

    /** Unsafe version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v} */
    public static native void nglGetQueryObjecti64v(int id, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQueryObject">Reference Page</a></p>
     * 
     * Returns the 64bit integer value of query object parameter.
     *
     * @param id     the name of a query object
     * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
     * @param params the requested data
     */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjecti64v(id, pname, memAddress(params));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQueryObject">Reference Page</a></p>
     * 
     * Returns the 64bit integer value of query object parameter.
     *
     * @param id    the name of a query object
     * @param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
     */
    @NativeType("void")
    public static long glGetQueryObjecti64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjecti64v(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectui64v ] ---

    /** Unsafe version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v} */
    public static native void nglGetQueryObjectui64v(int id, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQueryObject">Reference Page</a></p>
     * 
     * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
     *
     * @param id     the name of a query object
     * @param pname  the symbolic name of a query object parameter
     * @param params the requested data
     */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectui64v(id, pname, memAddress(params));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQueryObject">Reference Page</a></p>
     * 
     * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
     *
     * @param id    the name of a query object
     * @param pname the symbolic name of a query object parameter
     */
    @NativeType("void")
    public static long glGetQueryObjectui64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjectui64v(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glVertexAttribDivisor ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glVertexAttribDivisor">Reference Page</a></p>
     * 
     * Modifies the rate at which generic vertex attributes advance during instanced rendering.
     *
     * @param index   the index of the generic vertex attribute
     * @param divisor the number of instances that will pass between updates of the generic attribute at slot {@code index}
     */
    public static native void glVertexAttribDivisor(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor);

    // --- [ glVertexP2ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL11#glVertex2f Vertex2f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     */
    public static native void glVertexP2ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value);

    // --- [ glVertexP3ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL11#glVertex3f Vertex3f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     */
    public static native void glVertexP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value);

    // --- [ glVertexP4ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL11#glVertex4f Vertex4f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     */
    public static native void glVertexP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value);

    // --- [ glVertexP2uiv ] ---

    /** Unsafe version of: {@link #glVertexP2uiv VertexP2uiv} */
    public static native void nglVertexP2uiv(int type, long value);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glVertexP2ui VertexP2ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     */
    public static void glVertexP2uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexP2uiv(type, memAddress(value));
    }

    // --- [ glVertexP3uiv ] ---

    /** Unsafe version of: {@link #glVertexP3uiv VertexP3uiv} */
    public static native void nglVertexP3uiv(int type, long value);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glVertexP3ui VertexP3ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     */
    public static void glVertexP3uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexP3uiv(type, memAddress(value));
    }

    // --- [ glVertexP4uiv ] ---

    /** Unsafe version of: {@link #glVertexP4uiv VertexP4uiv} */
    public static native void nglVertexP4uiv(int type, long value);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glVertexP4ui VertexP4ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     */
    public static void glVertexP4uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexP4uiv(type, memAddress(value));
    }

    // --- [ glTexCoordP1ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL11#glTexCoord1f TexCoord1f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static native void glTexCoordP1ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glTexCoordP2ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL11#glTexCoord2f TexCoord2f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static native void glTexCoordP2ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glTexCoordP3ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL11#glTexCoord3f TexCoord3f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static native void glTexCoordP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glTexCoordP4ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL11#glTexCoord4f TexCoord4f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static native void glTexCoordP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glTexCoordP1uiv ] ---

    /** Unsafe version of: {@link #glTexCoordP1uiv TexCoordP1uiv} */
    public static native void nglTexCoordP1uiv(int type, long coords);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glTexCoordP1ui TexCoordP1ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glTexCoordP1uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglTexCoordP1uiv(type, memAddress(coords));
    }

    // --- [ glTexCoordP2uiv ] ---

    /** Unsafe version of: {@link #glTexCoordP2uiv TexCoordP2uiv} */
    public static native void nglTexCoordP2uiv(int type, long coords);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glTexCoordP2ui TexCoordP2ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glTexCoordP2uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglTexCoordP2uiv(type, memAddress(coords));
    }

    // --- [ glTexCoordP3uiv ] ---

    /** Unsafe version of: {@link #glTexCoordP3uiv TexCoordP3uiv} */
    public static native void nglTexCoordP3uiv(int type, long coords);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glTexCoordP3ui TexCoordP3ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glTexCoordP3uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglTexCoordP3uiv(type, memAddress(coords));
    }

    // --- [ glTexCoordP4uiv ] ---

    /** Unsafe version of: {@link #glTexCoordP4uiv TexCoordP4uiv} */
    public static native void nglTexCoordP4uiv(int type, long coords);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glTexCoordP4ui TexCoordP4ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glTexCoordP4uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglTexCoordP4uiv(type, memAddress(coords));
    }

    // --- [ glMultiTexCoordP1ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL13#glMultiTexCoord1f MultiTexCoord1f}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
     * @param coords  the packed value
     */
    public static native void glMultiTexCoordP1ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glMultiTexCoordP2ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL13#glMultiTexCoord2f MultiTexCoord2f}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
     * @param coords  the packed value
     */
    public static native void glMultiTexCoordP2ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glMultiTexCoordP3ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL13#glMultiTexCoord3f MultiTexCoord3f}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
     * @param coords  the packed value
     */
    public static native void glMultiTexCoordP3ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glMultiTexCoordP4ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL13#glMultiTexCoord4f MultiTexCoord4f}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
     * @param coords  the packed value
     */
    public static native void glMultiTexCoordP4ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glMultiTexCoordP1uiv ] ---

    /** Unsafe version of: {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv} */
    public static native void nglMultiTexCoordP1uiv(int texture, int type, long coords);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glMultiTexCoordP1ui MultiTexCoordP1ui}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords  the packed value
     */
    public static void glMultiTexCoordP1uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglMultiTexCoordP1uiv(texture, type, memAddress(coords));
    }

    // --- [ glMultiTexCoordP2uiv ] ---

    /** Unsafe version of: {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv} */
    public static native void nglMultiTexCoordP2uiv(int texture, int type, long coords);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glMultiTexCoordP2ui MultiTexCoordP2ui}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords  the packed value
     */
    public static void glMultiTexCoordP2uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglMultiTexCoordP2uiv(texture, type, memAddress(coords));
    }

    // --- [ glMultiTexCoordP3uiv ] ---

    /** Unsafe version of: {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv} */
    public static native void nglMultiTexCoordP3uiv(int texture, int type, long coords);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glMultiTexCoordP3ui MultiTexCoordP3ui}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords  the packed value
     */
    public static void glMultiTexCoordP3uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglMultiTexCoordP3uiv(texture, type, memAddress(coords));
    }

    // --- [ glMultiTexCoordP4uiv ] ---

    /** Unsafe version of: {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv} */
    public static native void nglMultiTexCoordP4uiv(int texture, int type, long coords);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glMultiTexCoordP4ui MultiTexCoordP4ui}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords  the packed value
     */
    public static void glMultiTexCoordP4uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglMultiTexCoordP4uiv(texture, type, memAddress(coords));
    }

    // --- [ glNormalP3ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL11#glNormal3f Normal3f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static native void glNormalP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glNormalP3uiv ] ---

    /** Unsafe version of: {@link #glNormalP3uiv NormalP3uiv} */
    public static native void nglNormalP3uiv(int type, long coords);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version {@link #glNormalP3ui NormalP3ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glNormalP3uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglNormalP3uiv(type, memAddress(coords));
    }

    // --- [ glColorP3ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL11#glColor3f Color3f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     */
    public static native void glColorP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color);

    // --- [ glColorP4ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL11#glColor4f Color4f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     */
    public static native void glColorP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color);

    // --- [ glColorP3uiv ] ---

    /** Unsafe version of: {@link #glColorP3uiv ColorP3uiv} */
    public static native void nglColorP3uiv(int type, long color);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glColorP3ui ColorP3ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     */
    public static void glColorP3uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer color) {
        if (CHECKS) {
            check(color, 1);
        }
        nglColorP3uiv(type, memAddress(color));
    }

    // --- [ glColorP4uiv ] ---

    /** Unsafe version of: {@link #glColorP4uiv ColorP4uiv} */
    public static native void nglColorP4uiv(int type, long color);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glColorP4ui ColorP4ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     */
    public static void glColorP4uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer color) {
        if (CHECKS) {
            check(color, 1);
        }
        nglColorP4uiv(type, memAddress(color));
    }

    // --- [ glSecondaryColorP3ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Packed component version of {@link GL14#glSecondaryColor3f SecondaryColor3f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     */
    public static native void glSecondaryColorP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color);

    // --- [ glSecondaryColorP3uiv ] ---

    /** Unsafe version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv} */
    public static native void nglSecondaryColorP3uiv(int type, long color);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Pointer version of {@link #glSecondaryColorP3ui SecondaryColorP3ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     */
    public static void glSecondaryColorP3uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") IntBuffer color) {
        if (CHECKS) {
            check(color, 1);
        }
        nglSecondaryColorP3uiv(type, memAddress(color));
    }

    // --- [ glVertexAttribP1ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a></p>
     * 
     * Packed component version of {@link GL20#glVertexAttrib1f VertexAttrib1f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static native void glVertexAttribP1ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value);

    // --- [ glVertexAttribP2ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a></p>
     * 
     * Packed component version of {@link GL20#glVertexAttrib2f VertexAttrib2f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static native void glVertexAttribP2ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value);

    // --- [ glVertexAttribP3ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a></p>
     * 
     * Packed component version of {@link GL20#glVertexAttrib3f VertexAttrib3f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static native void glVertexAttribP3ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value);

    // --- [ glVertexAttribP4ui ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a></p>
     * 
     * Packed component version of {@link GL20#glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static native void glVertexAttribP4ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value);

    // --- [ glVertexAttribP1uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv} */
    public static native void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a></p>
     * 
     * Pointer version of {@link #glVertexAttribP1ui VertexAttribP1ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("const GLuint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexAttribP1uiv(index, type, normalized, memAddress(value));
    }

    // --- [ glVertexAttribP2uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv} */
    public static native void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a></p>
     * 
     * Pointer version of {@link #glVertexAttribP2ui VertexAttribP2ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("const GLuint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexAttribP2uiv(index, type, normalized, memAddress(value));
    }

    // --- [ glVertexAttribP3uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv} */
    public static native void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a></p>
     * 
     * Pointer version of {@link #glVertexAttribP3ui VertexAttribP3ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("const GLuint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexAttribP3uiv(index, type, normalized, memAddress(value));
    }

    // --- [ glVertexAttribP4uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv} */
    public static native void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a></p>
     * 
     * Pointer version of {@link #glVertexAttribP4ui VertexAttribP4ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("const GLuint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexAttribP4uiv(index, type, normalized, memAddress(value));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGenSamplers">Reference Page</a></p>
     * 
     * Array version of: {@link #glGenSamplers GenSamplers}
     */
    public static void glGenSamplers(@NativeType("GLuint *") int[] samplers) {
        long __functionAddress = GL.getICD().glGenSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, samplers.length, samplers);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glDeleteSamplers">Reference Page</a></p>
     * 
     * Array version of: {@link #glDeleteSamplers DeleteSamplers}
     */
    public static void glDeleteSamplers(@NativeType("const GLuint *") int[] samplers) {
        long __functionAddress = GL.getICD().glDeleteSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, samplers.length, samplers);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glSamplerParameter">Reference Page</a></p>
     * 
     * Array version of: {@link #glSamplerParameteriv SamplerParameteriv}
     */
    public static void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("const GLint *") int[] params) {
        long __functionAddress = GL.getICD().glSamplerParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, sampler, pname, params);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glSamplerParameter">Reference Page</a></p>
     * 
     * Array version of: {@link #glSamplerParameterfv SamplerParameterfv}
     */
    public static void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("const GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glSamplerParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, sampler, pname, params);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glSamplerParameter">Reference Page</a></p>
     * 
     * Array version of: {@link #glSamplerParameterIiv SamplerParameterIiv}
     */
    public static void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("const GLint *") int[] params) {
        long __functionAddress = GL.getICD().glSamplerParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, sampler, pname, params);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glSamplerParameter">Reference Page</a></p>
     * 
     * Array version of: {@link #glSamplerParameterIuiv SamplerParameterIuiv}
     */
    public static void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("const GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glSamplerParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, sampler, pname, params);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetSamplerParameter">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv}
     */
    public static void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetSamplerParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, sampler, pname, params);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetSamplerParameter">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv}
     */
    public static void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetSamplerParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, sampler, pname, params);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetSamplerParameter">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetSamplerParameterIiv GetSamplerParameterIiv}
     */
    public static void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetSamplerParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, sampler, pname, params);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetSamplerParameter">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv}
     */
    public static void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetSamplerParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, sampler, pname, params);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQueryObject">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v}
     */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjecti64v;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, id, pname, params);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQueryObject">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v}
     */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjectui64v;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, id, pname, params);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glVertexP2uiv VertexP2uiv}
     */
    public static void glVertexP2uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") int[] value) {
        long __functionAddress = GL.getICD().glVertexP2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(__functionAddress, type, value);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glVertexP3uiv VertexP3uiv}
     */
    public static void glVertexP3uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") int[] value) {
        long __functionAddress = GL.getICD().glVertexP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(__functionAddress, type, value);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glVertexP4uiv VertexP4uiv}
     */
    public static void glVertexP4uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") int[] value) {
        long __functionAddress = GL.getICD().glVertexP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(__functionAddress, type, value);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glTexCoordP1uiv TexCoordP1uiv}
     */
    public static void glTexCoordP1uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") int[] coords) {
        long __functionAddress = GL.getICD().glTexCoordP1uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(__functionAddress, type, coords);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glTexCoordP2uiv TexCoordP2uiv}
     */
    public static void glTexCoordP2uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") int[] coords) {
        long __functionAddress = GL.getICD().glTexCoordP2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(__functionAddress, type, coords);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glTexCoordP3uiv TexCoordP3uiv}
     */
    public static void glTexCoordP3uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") int[] coords) {
        long __functionAddress = GL.getICD().glTexCoordP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(__functionAddress, type, coords);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glTexCoordP4uiv TexCoordP4uiv}
     */
    public static void glTexCoordP4uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") int[] coords) {
        long __functionAddress = GL.getICD().glTexCoordP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(__functionAddress, type, coords);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv}
     */
    public static void glMultiTexCoordP1uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("const GLuint *") int[] coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP1uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(__functionAddress, texture, type, coords);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv}
     */
    public static void glMultiTexCoordP2uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("const GLuint *") int[] coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(__functionAddress, texture, type, coords);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv}
     */
    public static void glMultiTexCoordP3uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("const GLuint *") int[] coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(__functionAddress, texture, type, coords);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv}
     */
    public static void glMultiTexCoordP4uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("const GLuint *") int[] coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(__functionAddress, texture, type, coords);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glNormalP3uiv NormalP3uiv}
     */
    public static void glNormalP3uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") int[] coords) {
        long __functionAddress = GL.getICD().glNormalP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(__functionAddress, type, coords);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glColorP3uiv ColorP3uiv}
     */
    public static void glColorP3uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") int[] color) {
        long __functionAddress = GL.getICD().glColorP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(color, 1);
        }
        callPV(__functionAddress, type, color);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glColorP4uiv ColorP4uiv}
     */
    public static void glColorP4uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") int[] color) {
        long __functionAddress = GL.getICD().glColorP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(color, 1);
        }
        callPV(__functionAddress, type, color);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
     * 
     * Array version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv}
     */
    public static void glSecondaryColorP3uiv(@NativeType("GLenum") int type, @NativeType("const GLuint *") int[] color) {
        long __functionAddress = GL.getICD().glSecondaryColorP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(color, 1);
        }
        callPV(__functionAddress, type, color);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a></p>
     * 
     * Array version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv}
     */
    public static void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("const GLuint *") int[] value) {
        long __functionAddress = GL.getICD().glVertexAttribP1uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(__functionAddress, index, type, normalized, value);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a></p>
     * 
     * Array version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv}
     */
    public static void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("const GLuint *") int[] value) {
        long __functionAddress = GL.getICD().glVertexAttribP2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(__functionAddress, index, type, normalized, value);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a></p>
     * 
     * Array version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv}
     */
    public static void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("const GLuint *") int[] value) {
        long __functionAddress = GL.getICD().glVertexAttribP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(__functionAddress, index, type, normalized, value);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a></p>
     * 
     * Array version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv}
     */
    public static void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("const GLuint *") int[] value) {
        long __functionAddress = GL.getICD().glVertexAttribP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(__functionAddress, index, type, normalized, value);
    }

}