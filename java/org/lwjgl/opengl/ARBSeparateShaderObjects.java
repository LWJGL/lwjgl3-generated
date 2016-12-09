/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/separate_shader_objects.txt">ARB_separate_shader_objects</a> extension.
 * 
 * <p>Conventional GLSL requires multiple shader stages (vertex, fragment, geometry, tessellation control, and tessellation evaluation) to be linked into a
 * single monolithic program object to specify a GLSL shader for each stage.</p>
 * 
 * <p>While GLSL's monolithic approach has some advantages for optimizing shaders as a unit that span multiple stages, all existing GPU hardware supports the
 * more flexible mix-and-match approach.</p>
 * 
 * <p>Shaders written for HLSL9, Cg, the prior OpenGL assembly program extensions, and game console favor a more flexible "mix-and-match" approach to
 * specifying shaders independently for these different shader stages. Many developers build their shader content around the mix-and-match approach where
 * they can use a single vertex shader with multiple fragment shaders (or vice versa).</p>
 * 
 * <p>This extension adopts a "mix-and-match" shader stage model for GLSL allowing multiple different GLSL program objects to be bound at once each to an
 * individual rendering pipeline stage independently of other stage bindings. This allows program objects to contain only the shader stages that best suit
 * the applications needs.</p>
 * 
 * <p>This extension introduces the program pipeline object that serves as a container for the program bound to any particular rendering stage. It can be
 * bound, unbound, and rebound to simply save and restore the complete shader stage to program object bindings. Like framebuffer and vertex array objects,
 * program pipeline objects are "container" objects that are not shared between contexts.</p>
 * 
 * <p>To bind a program object to a specific shader stage or set of stages, {@link #glUseProgramStages UseProgramStages} is used. The {@link #GL_VERTEX_SHADER_BIT VERTEX_SHADER_BIT}, {@link #GL_GEOMETRY_SHADER_BIT GEOMETRY_SHADER_BIT},
 * {@link #GL_FRAGMENT_SHADER_BIT FRAGMENT_SHADER_BIT}, {@link #GL_TESS_CONTROL_SHADER_BIT TESS_CONTROL_SHADER_BIT}, and {@link #GL_TESS_EVALUATION_SHADER_BIT TESS_EVALUATION_SHADER_BIT} tokens refer to the conventional vertex, geometry, fragment,
 * tessellation control and tessellation evaluation stages respectively. {@link #glActiveShaderProgram ActiveShaderProgram} specifies the program that Uniform* commands will update.</p>
 * 
 * <p>While {@link #glActiveShaderProgram ActiveShaderProgram} allows the use of conventional Uniform* commands to update uniform variable values for separable program objects, this
 * extension provides a preferrable interface in a set of ProgramUniform* commands that update the same uniform variables but take a parameter indicating
 * the program object to be updated, rather than updating the currently active program object. These commands mirror those introduced in
 * <a href="http://www.opengl.org/registry/specs/EXT/direct_state_access.txt">EXT_direct_state_access</a>.</p>
 * 
 * <p>While {@link #glActiveShaderProgram ActiveShaderProgram} provides a selector for setting and querying uniform values of a program object, the glProgramUniform* commands provide a
 * selector-free way to modify uniforms of a GLSL program object without an explicit bind. This selector-free model reduces API overhead and provides a
 * cleaner interface for applications.</p>
 * 
 * <p>Separate linking creates the possibility that certain output varyings of a shader may go unread by the subsequent shader inputting varyings. In this
 * case, the output varyings are simply ignored. It is also possible input varyings from a shader may not be written as output varyings of a preceding
 * shader. In this case, the unwritten input varying values are undefined.</p>
 * 
 * <p>This extension builds on the proof-of-concept provided by <a href="http://www.opengl.org/registry/specs/EXT/separate_shader_objects.txt">EXT_separate_shader_objects</a> which demonstrated that separate shader
 * objects can work for GLSL. EXT_separate_shader_objects was a response to repeated requests for this functionality from 3D developers.</p>
 * 
 * <p>This ARB version addresses several "loose ends" in the prior EXT extension. In particular, it allows user-defined varyings with explicitly defined
 * locations or implicitly assigned locations.</p>
 * 
 * <p>This ARB extension extends the GLSL language's use of layout qualifiers to provide cross-stage interfacing.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} or {@link ARBShaderObjects ARB_shader_objects}. Promoted to core in {@link GL41 OpenGL 4.1}.</p>
 */
public class ARBSeparateShaderObjects {

	/** Accepted by {@code stages} parameter to UseProgramStages. */
	public static final int
		GL_VERTEX_SHADER_BIT          = 0x1,
		GL_FRAGMENT_SHADER_BIT        = 0x2,
		GL_GEOMETRY_SHADER_BIT        = 0x4,
		GL_TESS_CONTROL_SHADER_BIT    = 0x8,
		GL_TESS_EVALUATION_SHADER_BIT = 0x10,
		GL_ALL_SHADER_BITS            = 0xFFFFFFFF;

	/** Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv. */
	public static final int GL_PROGRAM_SEPARABLE = 0x8258;

	/** Accepted by {@code type} parameter to GetProgramPipelineiv. */
	public static final int GL_ACTIVE_PROGRAM = 0x8259;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int GL_PROGRAM_PIPELINE_BINDING = 0x825A;

	static { GL.initialize(); }

	protected ARBSeparateShaderObjects() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glUseProgramStages, caps.glActiveShaderProgram, caps.glCreateShaderProgramv, caps.glBindProgramPipeline, caps.glDeleteProgramPipelines, 
			caps.glGenProgramPipelines, caps.glIsProgramPipeline, caps.glProgramParameteri, caps.glGetProgramPipelineiv, caps.glProgramUniform1i, 
			caps.glProgramUniform2i, caps.glProgramUniform3i, caps.glProgramUniform4i, caps.glProgramUniform1ui, caps.glProgramUniform2ui, 
			caps.glProgramUniform3ui, caps.glProgramUniform4ui, caps.glProgramUniform1f, caps.glProgramUniform2f, caps.glProgramUniform3f, 
			caps.glProgramUniform4f, caps.glProgramUniform1d, caps.glProgramUniform2d, caps.glProgramUniform3d, caps.glProgramUniform4d, 
			caps.glProgramUniform1iv, caps.glProgramUniform2iv, caps.glProgramUniform3iv, caps.glProgramUniform4iv, caps.glProgramUniform1uiv, 
			caps.glProgramUniform2uiv, caps.glProgramUniform3uiv, caps.glProgramUniform4uiv, caps.glProgramUniform1fv, caps.glProgramUniform2fv, 
			caps.glProgramUniform3fv, caps.glProgramUniform4fv, caps.glProgramUniform1dv, caps.glProgramUniform2dv, caps.glProgramUniform3dv, 
			caps.glProgramUniform4dv, caps.glProgramUniformMatrix2fv, caps.glProgramUniformMatrix3fv, caps.glProgramUniformMatrix4fv, 
			caps.glProgramUniformMatrix2dv, caps.glProgramUniformMatrix3dv, caps.glProgramUniformMatrix4dv, caps.glProgramUniformMatrix2x3fv, 
			caps.glProgramUniformMatrix3x2fv, caps.glProgramUniformMatrix2x4fv, caps.glProgramUniformMatrix4x2fv, caps.glProgramUniformMatrix3x4fv, 
			caps.glProgramUniformMatrix4x3fv, caps.glProgramUniformMatrix2x3dv, caps.glProgramUniformMatrix3x2dv, caps.glProgramUniformMatrix2x4dv, 
			caps.glProgramUniformMatrix4x2dv, caps.glProgramUniformMatrix3x4dv, caps.glProgramUniformMatrix4x3dv, caps.glValidateProgramPipeline, 
			caps.glGetProgramPipelineInfoLog
		);
	}

	// --- [ glUseProgramStages ] ---

	/** Unsafe version of: {@link #glUseProgramStages UseProgramStages} */
	public static native void nglUseProgramStages(int pipeline, int stages, int program);

	/**
	 * Binds stages of a program object to a program pipeline.
	 *
	 * @param pipeline the program pipeline object to which to bind stages from {@code program}
	 * @param stages   a set of program stages to bind to the program pipeline object
	 * @param program  the program object containing the shader executables to use in {@code pipeline}
	 */
	public static void glUseProgramStages(int pipeline, int stages, int program) {
		nglUseProgramStages(pipeline, stages, program);
	}

	// --- [ glActiveShaderProgram ] ---

	/** Unsafe version of: {@link #glActiveShaderProgram ActiveShaderProgram} */
	public static native void nglActiveShaderProgram(int pipeline, int program);

	/**
	 * Sets the active program object for a program pipeline object.
	 *
	 * @param pipeline the program pipeline object to set the active program object for
	 * @param program  the program object to set as the active program pipeline object {@code pipeline}
	 */
	public static void glActiveShaderProgram(int pipeline, int program) {
		nglActiveShaderProgram(pipeline, program);
	}

	// --- [ glCreateShaderProgramv ] ---

	/**
	 * Unsafe version of: {@link #glCreateShaderProgramv CreateShaderProgramv}
	 *
	 * @param count the number of source code strings in the array {@code strings}
	 */
	public static native int nglCreateShaderProgramv(int type, int count, long strings);

	/**
	 * Creates a stand-alone program from an array of null-terminated source code strings.
	 * 
	 * <p>{@code glCreateShaderProgram} is equivalent (assuming no errors are generated) to:</p>
	 * 
	 * <pre><code>const GLuint shader = glCreateShader(type);
if (shader) {
    glShaderSource(shader, count, strings, NULL);
    glCompileShader(shader);
    const GLuint program = glCreateProgram();
    if (program) {
        GLint compiled = GL_FALSE;
        glGetShaderiv(shader, GL_COMPILE_STATUS, &compiled);
        glProgramParameteri(program, GL_PROGRAM_SEPARABLE, GL_TRUE);
        if (compiled) {
            glAttachShader(program, shader);
            glLinkProgram(program);
            glDetachShader(program, shader);
        }
        // append-shader-info-log-to-program-info-log
    }
    glDeleteShader(shader);
    return program;
} else {
    return 0;
}</code></pre>
	 * 
	 * <p>The program object created by glCreateShaderProgram has its GL_PROGRAM_SEPARABLE status set to GL_TRUE.</p>
	 *
	 * @param type    the type of shader to create
	 * @param strings an array of pointers to source code strings from which to create the program object
	 */
	public static int glCreateShaderProgramv(int type, PointerBuffer strings) {
		return nglCreateShaderProgramv(type, strings.remaining(), memAddress(strings));
	}

	/**
	 * Creates a stand-alone program from an array of null-terminated source code strings.
	 * 
	 * <p>{@code glCreateShaderProgram} is equivalent (assuming no errors are generated) to:</p>
	 * 
	 * <pre><code>const GLuint shader = glCreateShader(type);
if (shader) {
    glShaderSource(shader, count, strings, NULL);
    glCompileShader(shader);
    const GLuint program = glCreateProgram();
    if (program) {
        GLint compiled = GL_FALSE;
        glGetShaderiv(shader, GL_COMPILE_STATUS, &compiled);
        glProgramParameteri(program, GL_PROGRAM_SEPARABLE, GL_TRUE);
        if (compiled) {
            glAttachShader(program, shader);
            glLinkProgram(program);
            glDetachShader(program, shader);
        }
        // append-shader-info-log-to-program-info-log
    }
    glDeleteShader(shader);
    return program;
} else {
    return 0;
}</code></pre>
	 * 
	 * <p>The program object created by glCreateShaderProgram has its GL_PROGRAM_SEPARABLE status set to GL_TRUE.</p>
	 *
	 * @param type    the type of shader to create
	 * @param strings an array of pointers to source code strings from which to create the program object
	 */
	public static int glCreateShaderProgramv(int type, CharSequence... strings) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long stringsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memUTF8, strings);
			int __result = nglCreateShaderProgramv(type, strings.length, stringsAddress);
			org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, strings.length);
			return __result;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * Creates a stand-alone program from an array of null-terminated source code strings.
	 * 
	 * <p>{@code glCreateShaderProgram} is equivalent (assuming no errors are generated) to:</p>
	 * 
	 * <pre><code>const GLuint shader = glCreateShader(type);
if (shader) {
    glShaderSource(shader, count, strings, NULL);
    glCompileShader(shader);
    const GLuint program = glCreateProgram();
    if (program) {
        GLint compiled = GL_FALSE;
        glGetShaderiv(shader, GL_COMPILE_STATUS, &compiled);
        glProgramParameteri(program, GL_PROGRAM_SEPARABLE, GL_TRUE);
        if (compiled) {
            glAttachShader(program, shader);
            glLinkProgram(program);
            glDetachShader(program, shader);
        }
        // append-shader-info-log-to-program-info-log
    }
    glDeleteShader(shader);
    return program;
} else {
    return 0;
}</code></pre>
	 * 
	 * <p>The program object created by glCreateShaderProgram has its GL_PROGRAM_SEPARABLE status set to GL_TRUE.</p>
	 *
	 * @param type the type of shader to create
	 */
	public static int glCreateShaderProgramv(int type, CharSequence string) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long stringsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memUTF8, string);
			int __result = nglCreateShaderProgramv(type, 1, stringsAddress);
			org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, 1);
			return __result;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glBindProgramPipeline ] ---

	/** Unsafe version of: {@link #glBindProgramPipeline BindProgramPipeline} */
	public static native void nglBindProgramPipeline(int pipeline);

	/**
	 * Binds a program pipeline to the current context.
	 *
	 * @param pipeline the name of the pipeline object to bind to the context
	 */
	public static void glBindProgramPipeline(int pipeline) {
		nglBindProgramPipeline(pipeline);
	}

	// --- [ glDeleteProgramPipelines ] ---

	/**
	 * Unsafe version of: {@link #glDeleteProgramPipelines DeleteProgramPipelines}
	 *
	 * @param n the number of program pipeline objects to delete
	 */
	public static native void nglDeleteProgramPipelines(int n, long pipelines);

	/**
	 * Deletes program pipeline objects.
	 *
	 * @param pipelines an array of names of program pipeline objects to delete
	 */
	public static void glDeleteProgramPipelines(IntBuffer pipelines) {
		nglDeleteProgramPipelines(pipelines.remaining(), memAddress(pipelines));
	}

	/** Deletes program pipeline objects. */
	public static void glDeleteProgramPipelines(int pipeline) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer pipelines = stack.ints(pipeline);
			nglDeleteProgramPipelines(1, memAddress(pipelines));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenProgramPipelines ] ---

	/**
	 * Unsafe version of: {@link #glGenProgramPipelines GenProgramPipelines}
	 *
	 * @param n the number of program pipeline object names to reserve
	 */
	public static native void nglGenProgramPipelines(int n, long pipelines);

	/**
	 * Reserves program pipeline object names.
	 *
	 * @param pipelines an array of into which the reserved names will be written
	 */
	public static void glGenProgramPipelines(IntBuffer pipelines) {
		nglGenProgramPipelines(pipelines.remaining(), memAddress(pipelines));
	}

	/** Reserves program pipeline object names. */
	public static int glGenProgramPipelines() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer pipelines = stack.callocInt(1);
			nglGenProgramPipelines(1, memAddress(pipelines));
			return pipelines.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsProgramPipeline ] ---

	/** Unsafe version of: {@link #glIsProgramPipeline IsProgramPipeline} */
	public static native boolean nglIsProgramPipeline(int pipeline);

	/**
	 * Determines if a name corresponds to a program pipeline object.
	 *
	 * @param pipeline a value that may be the name of a program pipeline object
	 */
	public static boolean glIsProgramPipeline(int pipeline) {
		return nglIsProgramPipeline(pipeline);
	}

	// --- [ glProgramParameteri ] ---

	/** Unsafe version of: {@link #glProgramParameteri ProgramParameteri} */
	public static native void nglProgramParameteri(int program, int pname, int value);

	/**
	 * Specifies the integer value of a program object parameter.
	 *
	 * @param program the name of a program object whose parameter to modify
	 * @param pname   the name of the parameter to modify. One of:<br><table><tr><td>{@link GL41#GL_PROGRAM_BINARY_RETRIEVABLE_HINT PROGRAM_BINARY_RETRIEVABLE_HINT}</td><td>{@link GL41#GL_PROGRAM_SEPARABLE PROGRAM_SEPARABLE}</td></tr></table>
	 * @param value   the new value of the parameter specified by {@code pname} for {@code program}
	 */
	public static void glProgramParameteri(int program, int pname, int value) {
		nglProgramParameteri(program, pname, value);
	}

	// --- [ glGetProgramPipelineiv ] ---

	/** Unsafe version of: {@link #glGetProgramPipelineiv GetProgramPipelineiv} */
	public static native void nglGetProgramPipelineiv(int pipeline, int pname, long params);

	/**
	 * Retrieves properties of a program pipeline object.
	 *
	 * @param pipeline the name of a program pipeline object whose parameter retrieve
	 * @param pname    the name of the parameter to retrieve. One of:<br><table><tr><td>{@link GL41#GL_ACTIVE_PROGRAM ACTIVE_PROGRAM}</td><td>{@link GL20#GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param params   a variable into which will be written the value or values of {@code pname} for {@code pipeline}
	 */
	public static void glGetProgramPipelineiv(int pipeline, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetProgramPipelineiv(pipeline, pname, memAddress(params));
	}

	/**
	 * Retrieves properties of a program pipeline object.
	 *
	 * @param pipeline the name of a program pipeline object whose parameter retrieve
	 * @param pname    the name of the parameter to retrieve. One of:<br><table><tr><td>{@link GL41#GL_ACTIVE_PROGRAM ACTIVE_PROGRAM}</td><td>{@link GL20#GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 */
	public static int glGetProgramPipelinei(int pipeline, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetProgramPipelineiv(pipeline, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glProgramUniform1i ] ---

	/** Unsafe version of: {@link #glProgramUniform1i ProgramUniform1i} */
	public static native void nglProgramUniform1i(int program, int location, int x);

	/**
	 * Specifies the value of an int uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1i(int program, int location, int x) {
		nglProgramUniform1i(program, location, x);
	}

	// --- [ glProgramUniform2i ] ---

	/** Unsafe version of: {@link #glProgramUniform2i ProgramUniform2i} */
	public static native void nglProgramUniform2i(int program, int location, int x, int y);

	/**
	 * Specifies the value of an ivec2 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2i(int program, int location, int x, int y) {
		nglProgramUniform2i(program, location, x, y);
	}

	// --- [ glProgramUniform3i ] ---

	/** Unsafe version of: {@link #glProgramUniform3i ProgramUniform3i} */
	public static native void nglProgramUniform3i(int program, int location, int x, int y, int z);

	/**
	 * Specifies the value of an ivec3 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glProgramUniform3i(int program, int location, int x, int y, int z) {
		nglProgramUniform3i(program, location, x, y, z);
	}

	// --- [ glProgramUniform4i ] ---

	/** Unsafe version of: {@link #glProgramUniform4i ProgramUniform4i} */
	public static native void nglProgramUniform4i(int program, int location, int x, int y, int z, int w);

	/**
	 * Specifies the value of an ivec4 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 * @param w        the uniform w value
	 */
	public static void glProgramUniform4i(int program, int location, int x, int y, int z, int w) {
		nglProgramUniform4i(program, location, x, y, z, w);
	}

	// --- [ glProgramUniform1ui ] ---

	/** Unsafe version of: {@link #glProgramUniform1ui ProgramUniform1ui} */
	public static native void nglProgramUniform1ui(int program, int location, int x);

	/**
	 * Specifies the value of a uint uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1ui(int program, int location, int x) {
		nglProgramUniform1ui(program, location, x);
	}

	// --- [ glProgramUniform2ui ] ---

	/** Unsafe version of: {@link #glProgramUniform2ui ProgramUniform2ui} */
	public static native void nglProgramUniform2ui(int program, int location, int x, int y);

	/**
	 * Specifies the value of a uvec2 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2ui(int program, int location, int x, int y) {
		nglProgramUniform2ui(program, location, x, y);
	}

	// --- [ glProgramUniform3ui ] ---

	/** Unsafe version of: {@link #glProgramUniform3ui ProgramUniform3ui} */
	public static native void nglProgramUniform3ui(int program, int location, int x, int y, int z);

	/**
	 * Specifies the value of a uvec3 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glProgramUniform3ui(int program, int location, int x, int y, int z) {
		nglProgramUniform3ui(program, location, x, y, z);
	}

	// --- [ glProgramUniform4ui ] ---

	/** Unsafe version of: {@link #glProgramUniform4ui ProgramUniform4ui} */
	public static native void nglProgramUniform4ui(int program, int location, int x, int y, int z, int w);

	/**
	 * Specifies the value of a uvec4 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 * @param w        the uniform w value
	 */
	public static void glProgramUniform4ui(int program, int location, int x, int y, int z, int w) {
		nglProgramUniform4ui(program, location, x, y, z, w);
	}

	// --- [ glProgramUniform1f ] ---

	/** Unsafe version of: {@link #glProgramUniform1f ProgramUniform1f} */
	public static native void nglProgramUniform1f(int program, int location, float x);

	/**
	 * Specifies the value of a float uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1f(int program, int location, float x) {
		nglProgramUniform1f(program, location, x);
	}

	// --- [ glProgramUniform2f ] ---

	/** Unsafe version of: {@link #glProgramUniform2f ProgramUniform2f} */
	public static native void nglProgramUniform2f(int program, int location, float x, float y);

	/**
	 * Specifies the value of a vec2 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2f(int program, int location, float x, float y) {
		nglProgramUniform2f(program, location, x, y);
	}

	// --- [ glProgramUniform3f ] ---

	/** Unsafe version of: {@link #glProgramUniform3f ProgramUniform3f} */
	public static native void nglProgramUniform3f(int program, int location, float x, float y, float z);

	/**
	 * Specifies the value of a vec3 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glProgramUniform3f(int program, int location, float x, float y, float z) {
		nglProgramUniform3f(program, location, x, y, z);
	}

	// --- [ glProgramUniform4f ] ---

	/** Unsafe version of: {@link #glProgramUniform4f ProgramUniform4f} */
	public static native void nglProgramUniform4f(int program, int location, float x, float y, float z, float w);

	/**
	 * Specifies the value of a vec4 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 * @param w        the uniform w value
	 */
	public static void glProgramUniform4f(int program, int location, float x, float y, float z, float w) {
		nglProgramUniform4f(program, location, x, y, z, w);
	}

	// --- [ glProgramUniform1d ] ---

	/** Unsafe version of: {@link #glProgramUniform1d ProgramUniform1d} */
	public static native void nglProgramUniform1d(int program, int location, double x);

	/**
	 * Specifies the value of a double uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1d(int program, int location, double x) {
		nglProgramUniform1d(program, location, x);
	}

	// --- [ glProgramUniform2d ] ---

	/** Unsafe version of: {@link #glProgramUniform2d ProgramUniform2d} */
	public static native void nglProgramUniform2d(int program, int location, double x, double y);

	/**
	 * Specifies the value of a dvec2 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2d(int program, int location, double x, double y) {
		nglProgramUniform2d(program, location, x, y);
	}

	// --- [ glProgramUniform3d ] ---

	/** Unsafe version of: {@link #glProgramUniform3d ProgramUniform3d} */
	public static native void nglProgramUniform3d(int program, int location, double x, double y, double z);

	/**
	 * Specifies the value of a dvec3 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glProgramUniform3d(int program, int location, double x, double y, double z) {
		nglProgramUniform3d(program, location, x, y, z);
	}

	// --- [ glProgramUniform4d ] ---

	/** Unsafe version of: {@link #glProgramUniform4d ProgramUniform4d} */
	public static native void nglProgramUniform4d(int program, int location, double x, double y, double z, double w);

	/**
	 * Specifies the value of a dvec4 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 * @param w        the uniform w value
	 */
	public static void glProgramUniform4d(int program, int location, double x, double y, double z, double w) {
		nglProgramUniform4d(program, location, x, y, z, w);
	}

	// --- [ glProgramUniform1iv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform1iv ProgramUniform1iv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform1iv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single float uniform variable or a float uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform1iv(int program, int location, IntBuffer value) {
		nglProgramUniform1iv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2iv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform2iv ProgramUniform2iv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform2iv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single ivec2 uniform variable or an ivec2 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform2iv(int program, int location, IntBuffer value) {
		nglProgramUniform2iv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3iv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform3iv ProgramUniform3iv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform3iv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single ivec3 uniform variable or an ivec3 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform3iv(int program, int location, IntBuffer value) {
		nglProgramUniform3iv(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4iv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform4iv ProgramUniform4iv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform4iv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single ivec4 uniform variable or an ivec4 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform4iv(int program, int location, IntBuffer value) {
		nglProgramUniform4iv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1uiv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform1uiv ProgramUniform1uiv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform1uiv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single uint uniform variable or a uint uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform1uiv(int program, int location, IntBuffer value) {
		nglProgramUniform1uiv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2uiv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform2uiv ProgramUniform2uiv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform2uiv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single uvec2 uniform variable or a uvec2 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform2uiv(int program, int location, IntBuffer value) {
		nglProgramUniform2uiv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3uiv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform3uiv ProgramUniform3uiv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform3uiv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single uvec3 uniform variable or a uvec3 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform3uiv(int program, int location, IntBuffer value) {
		nglProgramUniform3uiv(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4uiv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform4uiv ProgramUniform4uiv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform4uiv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single uvec4 uniform variable or a uvec4 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform4uiv(int program, int location, IntBuffer value) {
		nglProgramUniform4uiv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1fv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform1fv ProgramUniform1fv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform1fv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single float uniform variable or a float uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform1fv(int program, int location, FloatBuffer value) {
		nglProgramUniform1fv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2fv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform2fv ProgramUniform2fv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform2fv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single vec2 uniform variable or a vec2 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform2fv(int program, int location, FloatBuffer value) {
		nglProgramUniform2fv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3fv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform3fv ProgramUniform3fv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform3fv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single vec3 uniform variable or a vec3 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform3fv(int program, int location, FloatBuffer value) {
		nglProgramUniform3fv(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4fv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform4fv ProgramUniform4fv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform4fv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single vec4 uniform variable or a vec4 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform4fv(int program, int location, FloatBuffer value) {
		nglProgramUniform4fv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1dv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform1dv ProgramUniform1dv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform1dv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single double uniform variable or a double uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform1dv(int program, int location, DoubleBuffer value) {
		nglProgramUniform1dv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2dv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform2dv ProgramUniform2dv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform2dv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform2dv(int program, int location, DoubleBuffer value) {
		nglProgramUniform2dv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3dv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform3dv ProgramUniform3dv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform3dv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform3dv(int program, int location, DoubleBuffer value) {
		nglProgramUniform3dv(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4dv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniform4dv ProgramUniform4dv}
	 *
	 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 */
	public static native void nglProgramUniform4dv(int program, int location, int count, long value);

	/**
	 * Specifies the value of a single dvec4 uniform variable or a dvec4 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform4dv(int program, int location, DoubleBuffer value) {
		nglProgramUniform4dv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2fv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix2fv ProgramUniformMatrix2fv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single mat2 uniform variable or a mat2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2fv(program, location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3fv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix3fv ProgramUniformMatrix3fv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single mat3 uniform variable or a mat3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3fv(program, location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4fv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix4fv ProgramUniformMatrix4fv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single mat4 uniform variable or a mat4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4fv(program, location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2dv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix2dv ProgramUniformMatrix2dv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix2dv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single dmat2 uniform variable or a dmat2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix2dv(program, location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3dv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix3dv ProgramUniformMatrix3dv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix3dv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single dmat3 uniform variable or a dmat3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix3dv(program, location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4dv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix4dv ProgramUniformMatrix4dv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix4dv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single dmat4 uniform variable or a dmat4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix4dv(program, location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x3fv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix2x3fv ProgramUniformMatrix2x3fv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single mat2x3 uniform variable or a mat2x3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x3fv(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x2fv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix3x2fv ProgramUniformMatrix3x2fv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single mat3x2 uniform variable or a mat3x2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x2fv(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x4fv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix2x4fv ProgramUniformMatrix2x4fv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single mat2x4 uniform variable or a mat2x4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x4fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x2fv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix4x2fv ProgramUniformMatrix4x2fv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single mat4x2 uniform variable or a mat4x2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x2fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x4fv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix3x4fv ProgramUniformMatrix3x4fv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single mat3x4 uniform variable or a mat3x4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x4fv(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x3fv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix4x3fv ProgramUniformMatrix4x3fv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single mat4x3 uniform variable or a mat4x3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x3fv(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x3dv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix2x3dv ProgramUniformMatrix2x3dv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix2x3dv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single dmat2x3 uniform variable or a dmat2x3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x3dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix2x3dv(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x2dv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix3x2dv ProgramUniformMatrix3x2dv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix3x2dv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single dmat3x2 uniform variable or a dmat3x2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x2dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix3x2dv(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x4dv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix2x4dv ProgramUniformMatrix2x4dv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix2x4dv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single dmat2x4 uniform variable or a dmat2x4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x4dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix2x4dv(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x2dv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix4x2dv ProgramUniformMatrix4x2dv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix4x2dv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x2dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix4x2dv(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x4dv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix3x4dv ProgramUniformMatrix3x4dv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix3x4dv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single dmat3x4 uniform variable or a dmat3x4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x4dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix3x4dv(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x3dv ] ---

	/**
	 * Unsafe version of: {@link #glProgramUniformMatrix4x3dv ProgramUniformMatrix4x3dv}
	 *
	 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 */
	public static native void nglProgramUniformMatrix4x3dv(int program, int location, int count, boolean transpose, long value);

	/**
	 * Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x3dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix4x3dv(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glValidateProgramPipeline ] ---

	/** Unsafe version of: {@link #glValidateProgramPipeline ValidateProgramPipeline} */
	public static native void nglValidateProgramPipeline(int pipeline);

	/**
	 * Validates a program pipeline object against current GL state.
	 *
	 * @param pipeline the name of a program pipeline object to validate
	 */
	public static void glValidateProgramPipeline(int pipeline) {
		nglValidateProgramPipeline(pipeline);
	}

	// --- [ glGetProgramPipelineInfoLog ] ---

	/**
	 * Unsafe version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog}
	 *
	 * @param bufSize the maximum number of characters, including the null terminator, that may be written into {@code infoLog}
	 */
	public static native void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog);

	/**
	 * Retrieves the info log string from a program pipeline object.
	 *
	 * @param pipeline the name of a program pipeline object from which to retrieve the info log
	 * @param length   a variable into which will be written the number of characters written into {@code infoLog}
	 * @param infoLog  an array of characters into which will be written the info log for {@code pipeline}
	 */
	public static void glGetProgramPipelineInfoLog(int pipeline, IntBuffer length, ByteBuffer infoLog) {
		if ( CHECKS )
			checkSafe(length, 1);
		nglGetProgramPipelineInfoLog(pipeline, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
	}

	/**
	 * Retrieves the info log string from a program pipeline object.
	 *
	 * @param pipeline the name of a program pipeline object from which to retrieve the info log
	 * @param bufSize  the maximum number of characters, including the null terminator, that may be written into {@code infoLog}
	 */
	public static String glGetProgramPipelineInfoLog(int pipeline, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		ByteBuffer infoLog = memAlloc(bufSize);
		try {
			IntBuffer length = stack.ints(0);
			nglGetProgramPipelineInfoLog(pipeline, bufSize, memAddress(length), memAddress(infoLog));
			return memUTF8(infoLog, length.get(0));
		} finally {
			memFree(infoLog);
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * Retrieves the info log string from a program pipeline object.
	 *
	 * @param pipeline the name of a program pipeline object from which to retrieve the info log
	 */
	public static String glGetProgramPipelineInfoLog(int pipeline) {
		int bufSize = glGetProgramPipelinei(pipeline, GL20.GL_INFO_LOG_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		ByteBuffer infoLog = memAlloc(bufSize);
		try {
			IntBuffer length = stack.ints(0);
			nglGetProgramPipelineInfoLog(pipeline, bufSize, memAddress(length), memAddress(infoLog));
			return memUTF8(infoLog, length.get(0));
		} finally {
			memFree(infoLog);
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glDeleteProgramPipelines DeleteProgramPipelines} */
	public static void glDeleteProgramPipelines(int[] pipelines) {
		long __functionAddress = GL.getICD().glDeleteProgramPipelines;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, pipelines.length, pipelines);
	}

	/** Array version of: {@link #glGenProgramPipelines GenProgramPipelines} */
	public static void glGenProgramPipelines(int[] pipelines) {
		long __functionAddress = GL.getICD().glGenProgramPipelines;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, pipelines.length, pipelines);
	}

	/** Array version of: {@link #glGetProgramPipelineiv GetProgramPipelineiv} */
	public static void glGetProgramPipelineiv(int pipeline, int pname, int[] params) {
		long __functionAddress = GL.getICD().glGetProgramPipelineiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, pipeline, pname, params);
	}

	/** Array version of: {@link #glProgramUniform1iv ProgramUniform1iv} */
	public static void glProgramUniform1iv(int program, int location, int[] value) {
		long __functionAddress = GL.getICD().glProgramUniform1iv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform2iv ProgramUniform2iv} */
	public static void glProgramUniform2iv(int program, int location, int[] value) {
		long __functionAddress = GL.getICD().glProgramUniform2iv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform3iv ProgramUniform3iv} */
	public static void glProgramUniform3iv(int program, int location, int[] value) {
		long __functionAddress = GL.getICD().glProgramUniform3iv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform4iv ProgramUniform4iv} */
	public static void glProgramUniform4iv(int program, int location, int[] value) {
		long __functionAddress = GL.getICD().glProgramUniform4iv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glProgramUniform1uiv ProgramUniform1uiv} */
	public static void glProgramUniform1uiv(int program, int location, int[] value) {
		long __functionAddress = GL.getICD().glProgramUniform1uiv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform2uiv ProgramUniform2uiv} */
	public static void glProgramUniform2uiv(int program, int location, int[] value) {
		long __functionAddress = GL.getICD().glProgramUniform2uiv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform3uiv ProgramUniform3uiv} */
	public static void glProgramUniform3uiv(int program, int location, int[] value) {
		long __functionAddress = GL.getICD().glProgramUniform3uiv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform4uiv ProgramUniform4uiv} */
	public static void glProgramUniform4uiv(int program, int location, int[] value) {
		long __functionAddress = GL.getICD().glProgramUniform4uiv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glProgramUniform1fv ProgramUniform1fv} */
	public static void glProgramUniform1fv(int program, int location, float[] value) {
		long __functionAddress = GL.getICD().glProgramUniform1fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform2fv ProgramUniform2fv} */
	public static void glProgramUniform2fv(int program, int location, float[] value) {
		long __functionAddress = GL.getICD().glProgramUniform2fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform3fv ProgramUniform3fv} */
	public static void glProgramUniform3fv(int program, int location, float[] value) {
		long __functionAddress = GL.getICD().glProgramUniform3fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform4fv ProgramUniform4fv} */
	public static void glProgramUniform4fv(int program, int location, float[] value) {
		long __functionAddress = GL.getICD().glProgramUniform4fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glProgramUniform1dv ProgramUniform1dv} */
	public static void glProgramUniform1dv(int program, int location, double[] value) {
		long __functionAddress = GL.getICD().glProgramUniform1dv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform2dv ProgramUniform2dv} */
	public static void glProgramUniform2dv(int program, int location, double[] value) {
		long __functionAddress = GL.getICD().glProgramUniform2dv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform3dv ProgramUniform3dv} */
	public static void glProgramUniform3dv(int program, int location, double[] value) {
		long __functionAddress = GL.getICD().glProgramUniform3dv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform4dv ProgramUniform4dv} */
	public static void glProgramUniform4dv(int program, int location, double[] value) {
		long __functionAddress = GL.getICD().glProgramUniform4dv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix2fv ProgramUniformMatrix2fv} */
	public static void glProgramUniformMatrix2fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix2fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix3fv ProgramUniformMatrix3fv} */
	public static void glProgramUniformMatrix3fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix3fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 9, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix4fv ProgramUniformMatrix4fv} */
	public static void glProgramUniformMatrix4fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix4fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 4, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix2dv ProgramUniformMatrix2dv} */
	public static void glProgramUniformMatrix2dv(int program, int location, boolean transpose, double[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix2dv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix3dv ProgramUniformMatrix3dv} */
	public static void glProgramUniformMatrix3dv(int program, int location, boolean transpose, double[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix3dv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 9, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix4dv ProgramUniformMatrix4dv} */
	public static void glProgramUniformMatrix4dv(int program, int location, boolean transpose, double[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix4dv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 4, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix2x3fv ProgramUniformMatrix2x3fv} */
	public static void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix2x3fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 6, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix3x2fv ProgramUniformMatrix3x2fv} */
	public static void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix3x2fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 6, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix2x4fv ProgramUniformMatrix2x4fv} */
	public static void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix2x4fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix4x2fv ProgramUniformMatrix4x2fv} */
	public static void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix4x2fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix3x4fv ProgramUniformMatrix3x4fv} */
	public static void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix3x4fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 12, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix4x3fv ProgramUniformMatrix4x3fv} */
	public static void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix4x3fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 12, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix2x3dv ProgramUniformMatrix2x3dv} */
	public static void glProgramUniformMatrix2x3dv(int program, int location, boolean transpose, double[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix2x3dv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 6, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix3x2dv ProgramUniformMatrix3x2dv} */
	public static void glProgramUniformMatrix3x2dv(int program, int location, boolean transpose, double[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix3x2dv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 6, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix2x4dv ProgramUniformMatrix2x4dv} */
	public static void glProgramUniformMatrix2x4dv(int program, int location, boolean transpose, double[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix2x4dv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix4x2dv ProgramUniformMatrix4x2dv} */
	public static void glProgramUniformMatrix4x2dv(int program, int location, boolean transpose, double[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix4x2dv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix3x4dv ProgramUniformMatrix3x4dv} */
	public static void glProgramUniformMatrix3x4dv(int program, int location, boolean transpose, double[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix3x4dv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 12, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix4x3dv ProgramUniformMatrix4x3dv} */
	public static void glProgramUniformMatrix4x3dv(int program, int location, boolean transpose, double[] value) {
		long __functionAddress = GL.getICD().glProgramUniformMatrix4x3dv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 12, transpose, value);
	}

	/** Array version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog} */
	public static void glGetProgramPipelineInfoLog(int pipeline, int[] length, ByteBuffer infoLog) {
		long __functionAddress = GL.getICD().glGetProgramPipelineInfoLog;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(length, 1);
		}
		callPPV(__functionAddress, pipeline, infoLog.remaining(), length, memAddress(infoLog));
	}

}