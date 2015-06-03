/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

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
public final class ARBSeparateShaderObjects {

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

	/** Function address. */
	@JavadocExclude
	public final long
		UseProgramStages,
		ActiveShaderProgram,
		CreateShaderProgramv,
		BindProgramPipeline,
		DeleteProgramPipelines,
		GenProgramPipelines,
		IsProgramPipeline,
		ProgramParameteri,
		GetProgramPipelineiv,
		ProgramUniform1i,
		ProgramUniform2i,
		ProgramUniform3i,
		ProgramUniform4i,
		ProgramUniform1ui,
		ProgramUniform2ui,
		ProgramUniform3ui,
		ProgramUniform4ui,
		ProgramUniform1f,
		ProgramUniform2f,
		ProgramUniform3f,
		ProgramUniform4f,
		ProgramUniform1d,
		ProgramUniform2d,
		ProgramUniform3d,
		ProgramUniform4d,
		ProgramUniform1iv,
		ProgramUniform2iv,
		ProgramUniform3iv,
		ProgramUniform4iv,
		ProgramUniform1uiv,
		ProgramUniform2uiv,
		ProgramUniform3uiv,
		ProgramUniform4uiv,
		ProgramUniform1fv,
		ProgramUniform2fv,
		ProgramUniform3fv,
		ProgramUniform4fv,
		ProgramUniform1dv,
		ProgramUniform2dv,
		ProgramUniform3dv,
		ProgramUniform4dv,
		ProgramUniformMatrix2fv,
		ProgramUniformMatrix3fv,
		ProgramUniformMatrix4fv,
		ProgramUniformMatrix2dv,
		ProgramUniformMatrix3dv,
		ProgramUniformMatrix4dv,
		ProgramUniformMatrix2x3fv,
		ProgramUniformMatrix3x2fv,
		ProgramUniformMatrix2x4fv,
		ProgramUniformMatrix4x2fv,
		ProgramUniformMatrix3x4fv,
		ProgramUniformMatrix4x3fv,
		ProgramUniformMatrix2x3dv,
		ProgramUniformMatrix3x2dv,
		ProgramUniformMatrix2x4dv,
		ProgramUniformMatrix4x2dv,
		ProgramUniformMatrix3x4dv,
		ProgramUniformMatrix4x3dv,
		ValidateProgramPipeline,
		GetProgramPipelineInfoLog;

	@JavadocExclude
	public ARBSeparateShaderObjects(FunctionProvider provider) {
		UseProgramStages = provider.getFunctionAddress("glUseProgramStages");
		ActiveShaderProgram = provider.getFunctionAddress("glActiveShaderProgram");
		CreateShaderProgramv = provider.getFunctionAddress("glCreateShaderProgramv");
		BindProgramPipeline = provider.getFunctionAddress("glBindProgramPipeline");
		DeleteProgramPipelines = provider.getFunctionAddress("glDeleteProgramPipelines");
		GenProgramPipelines = provider.getFunctionAddress("glGenProgramPipelines");
		IsProgramPipeline = provider.getFunctionAddress("glIsProgramPipeline");
		ProgramParameteri = provider.getFunctionAddress("glProgramParameteri");
		GetProgramPipelineiv = provider.getFunctionAddress("glGetProgramPipelineiv");
		ProgramUniform1i = provider.getFunctionAddress("glProgramUniform1i");
		ProgramUniform2i = provider.getFunctionAddress("glProgramUniform2i");
		ProgramUniform3i = provider.getFunctionAddress("glProgramUniform3i");
		ProgramUniform4i = provider.getFunctionAddress("glProgramUniform4i");
		ProgramUniform1ui = provider.getFunctionAddress("glProgramUniform1ui");
		ProgramUniform2ui = provider.getFunctionAddress("glProgramUniform2ui");
		ProgramUniform3ui = provider.getFunctionAddress("glProgramUniform3ui");
		ProgramUniform4ui = provider.getFunctionAddress("glProgramUniform4ui");
		ProgramUniform1f = provider.getFunctionAddress("glProgramUniform1f");
		ProgramUniform2f = provider.getFunctionAddress("glProgramUniform2f");
		ProgramUniform3f = provider.getFunctionAddress("glProgramUniform3f");
		ProgramUniform4f = provider.getFunctionAddress("glProgramUniform4f");
		ProgramUniform1d = provider.getFunctionAddress("glProgramUniform1d");
		ProgramUniform2d = provider.getFunctionAddress("glProgramUniform2d");
		ProgramUniform3d = provider.getFunctionAddress("glProgramUniform3d");
		ProgramUniform4d = provider.getFunctionAddress("glProgramUniform4d");
		ProgramUniform1iv = provider.getFunctionAddress("glProgramUniform1iv");
		ProgramUniform2iv = provider.getFunctionAddress("glProgramUniform2iv");
		ProgramUniform3iv = provider.getFunctionAddress("glProgramUniform3iv");
		ProgramUniform4iv = provider.getFunctionAddress("glProgramUniform4iv");
		ProgramUniform1uiv = provider.getFunctionAddress("glProgramUniform1uiv");
		ProgramUniform2uiv = provider.getFunctionAddress("glProgramUniform2uiv");
		ProgramUniform3uiv = provider.getFunctionAddress("glProgramUniform3uiv");
		ProgramUniform4uiv = provider.getFunctionAddress("glProgramUniform4uiv");
		ProgramUniform1fv = provider.getFunctionAddress("glProgramUniform1fv");
		ProgramUniform2fv = provider.getFunctionAddress("glProgramUniform2fv");
		ProgramUniform3fv = provider.getFunctionAddress("glProgramUniform3fv");
		ProgramUniform4fv = provider.getFunctionAddress("glProgramUniform4fv");
		ProgramUniform1dv = provider.getFunctionAddress("glProgramUniform1dv");
		ProgramUniform2dv = provider.getFunctionAddress("glProgramUniform2dv");
		ProgramUniform3dv = provider.getFunctionAddress("glProgramUniform3dv");
		ProgramUniform4dv = provider.getFunctionAddress("glProgramUniform4dv");
		ProgramUniformMatrix2fv = provider.getFunctionAddress("glProgramUniformMatrix2fv");
		ProgramUniformMatrix3fv = provider.getFunctionAddress("glProgramUniformMatrix3fv");
		ProgramUniformMatrix4fv = provider.getFunctionAddress("glProgramUniformMatrix4fv");
		ProgramUniformMatrix2dv = provider.getFunctionAddress("glProgramUniformMatrix2dv");
		ProgramUniformMatrix3dv = provider.getFunctionAddress("glProgramUniformMatrix3dv");
		ProgramUniformMatrix4dv = provider.getFunctionAddress("glProgramUniformMatrix4dv");
		ProgramUniformMatrix2x3fv = provider.getFunctionAddress("glProgramUniformMatrix2x3fv");
		ProgramUniformMatrix3x2fv = provider.getFunctionAddress("glProgramUniformMatrix3x2fv");
		ProgramUniformMatrix2x4fv = provider.getFunctionAddress("glProgramUniformMatrix2x4fv");
		ProgramUniformMatrix4x2fv = provider.getFunctionAddress("glProgramUniformMatrix4x2fv");
		ProgramUniformMatrix3x4fv = provider.getFunctionAddress("glProgramUniformMatrix3x4fv");
		ProgramUniformMatrix4x3fv = provider.getFunctionAddress("glProgramUniformMatrix4x3fv");
		ProgramUniformMatrix2x3dv = provider.getFunctionAddress("glProgramUniformMatrix2x3dv");
		ProgramUniformMatrix3x2dv = provider.getFunctionAddress("glProgramUniformMatrix3x2dv");
		ProgramUniformMatrix2x4dv = provider.getFunctionAddress("glProgramUniformMatrix2x4dv");
		ProgramUniformMatrix4x2dv = provider.getFunctionAddress("glProgramUniformMatrix4x2dv");
		ProgramUniformMatrix3x4dv = provider.getFunctionAddress("glProgramUniformMatrix3x4dv");
		ProgramUniformMatrix4x3dv = provider.getFunctionAddress("glProgramUniformMatrix4x3dv");
		ValidateProgramPipeline = provider.getFunctionAddress("glValidateProgramPipeline");
		GetProgramPipelineInfoLog = provider.getFunctionAddress("glGetProgramPipelineInfoLog");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBSeparateShaderObjects} instance for the current context. */
	public static ARBSeparateShaderObjects getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBSeparateShaderObjects);
	}

	static ARBSeparateShaderObjects create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_separate_shader_objects") ) return null;

		ARBSeparateShaderObjects funcs = new ARBSeparateShaderObjects(provider);

		boolean supported = checkFunctions(
			funcs.UseProgramStages, funcs.ActiveShaderProgram, funcs.CreateShaderProgramv, funcs.BindProgramPipeline, funcs.DeleteProgramPipelines, 
			funcs.GenProgramPipelines, funcs.IsProgramPipeline, funcs.ProgramParameteri, funcs.GetProgramPipelineiv, funcs.ProgramUniform1i, 
			funcs.ProgramUniform2i, funcs.ProgramUniform3i, funcs.ProgramUniform4i, funcs.ProgramUniform1ui, funcs.ProgramUniform2ui, funcs.ProgramUniform3ui, 
			funcs.ProgramUniform4ui, funcs.ProgramUniform1f, funcs.ProgramUniform2f, funcs.ProgramUniform3f, funcs.ProgramUniform4f, funcs.ProgramUniform1d, 
			funcs.ProgramUniform2d, funcs.ProgramUniform3d, funcs.ProgramUniform4d, funcs.ProgramUniform1iv, funcs.ProgramUniform2iv, funcs.ProgramUniform3iv, 
			funcs.ProgramUniform4iv, funcs.ProgramUniform1uiv, funcs.ProgramUniform2uiv, funcs.ProgramUniform3uiv, funcs.ProgramUniform4uiv, 
			funcs.ProgramUniform1fv, funcs.ProgramUniform2fv, funcs.ProgramUniform3fv, funcs.ProgramUniform4fv, funcs.ProgramUniform1dv, 
			funcs.ProgramUniform2dv, funcs.ProgramUniform3dv, funcs.ProgramUniform4dv, funcs.ProgramUniformMatrix2fv, funcs.ProgramUniformMatrix3fv, 
			funcs.ProgramUniformMatrix4fv, funcs.ProgramUniformMatrix2dv, funcs.ProgramUniformMatrix3dv, funcs.ProgramUniformMatrix4dv, 
			funcs.ProgramUniformMatrix2x3fv, funcs.ProgramUniformMatrix3x2fv, funcs.ProgramUniformMatrix2x4fv, funcs.ProgramUniformMatrix4x2fv, 
			funcs.ProgramUniformMatrix3x4fv, funcs.ProgramUniformMatrix4x3fv, funcs.ProgramUniformMatrix2x3dv, funcs.ProgramUniformMatrix3x2dv, 
			funcs.ProgramUniformMatrix2x4dv, funcs.ProgramUniformMatrix4x2dv, funcs.ProgramUniformMatrix3x4dv, funcs.ProgramUniformMatrix4x3dv, 
			funcs.ValidateProgramPipeline, funcs.GetProgramPipelineInfoLog
		);

		return GL.checkExtension("GL_ARB_separate_shader_objects", funcs, supported);
	}

	// --- [ glUseProgramStages ] ---

	/**
	 * Binds stages of a program object to a program pipeline.
	 *
	 * @param pipeline the program pipeline object to which to bind stages from {@code program}
	 * @param stages   a set of program stages to bind to the program pipeline object
	 * @param program  the program object containing the shader executables to use in {@code pipeline}
	 */
	public static void glUseProgramStages(int pipeline, int stages, int program) {
		long __functionAddress = getInstance().UseProgramStages;
		GL41.nglUseProgramStages(pipeline, stages, program, __functionAddress);
	}

	// --- [ glActiveShaderProgram ] ---

	/**
	 * Sets the active program object for a program pipeline object.
	 *
	 * @param pipeline the program pipeline object to set the active program object for
	 * @param program  the program object to set as the active program pipeline object {@code pipeline}
	 */
	public static void glActiveShaderProgram(int pipeline, int program) {
		long __functionAddress = getInstance().ActiveShaderProgram;
		GL41.nglActiveShaderProgram(pipeline, program, __functionAddress);
	}

	// --- [ glCreateShaderProgramv ] ---

	/** Unsafe version of {@link #glCreateShaderProgramv CreateShaderProgramv} */
	@JavadocExclude
	public static int nglCreateShaderProgramv(int type, int count, long strings) {
		long __functionAddress = getInstance().CreateShaderProgramv;
		return GL41.nglCreateShaderProgramv(type, count, strings, __functionAddress);
	}

	/**
	 * Creates a stand-alone program from an array of null-terminated source code strings.
	 * 
	 * <p>{@code glCreateShaderProgram} is equivalent (assuming no errors are generated) to:
	 * <pre><code style="font-family: monospace">
	 * const GLuint shader = glCreateShader(type);
	 * if (shader) {
	 * 	glShaderSource(shader, count, strings, NULL);
	 * 	glCompileShader(shader);
	 * 	const GLuint program = glCreateProgram();
	 * 	if (program) {
	 * 		GLint compiled = GL_FALSE;
	 * 		glGetShaderiv(shader, GL_COMPILE_STATUS, &compiled);
	 * 		glProgramParameteri(program, GL_PROGRAM_SEPARABLE, GL_TRUE);
	 * 		if (compiled) {
	 * 			glAttachShader(program, shader);
	 * 			glLinkProgram(program);
	 * 			glDetachShader(program, shader);
	 * 		}
	 * 		// append-shader-info-log-to-program-info-log
	 * 	}
	 * 	glDeleteShader(shader);
	 * 	return program;
	 * } else {
	 * 	return 0;
	 * }</code></pre>
	 * The program object created by glCreateShaderProgram has its GL_PROGRAM_SEPARABLE status set to GL_TRUE.</p>
	 *
	 * @param type    the type of shader to create
	 * @param count   the number of source code strings in the array {@code strings}
	 * @param strings an array of pointers to source code strings from which to create the program object
	 */
	public static int glCreateShaderProgramv(int type, int count, ByteBuffer strings) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(strings, count << POINTER_SHIFT);
		return nglCreateShaderProgramv(type, count, memAddress(strings));
	}

	/** Alternative version of: {@link #glCreateShaderProgramv CreateShaderProgramv} */
	public static int glCreateShaderProgramv(int type, PointerBuffer strings) {
		return nglCreateShaderProgramv(type, strings.remaining(), memAddress(strings));
	}

	/** Array version of: {@link #glCreateShaderProgramv CreateShaderProgramv} */
	public static int glCreateShaderProgramv(int type, CharSequence... strings) {
		APIBuffer __buffer = apiBuffer();
		int stringsAddress = __buffer.bufferParam(strings.length << POINTER_SHIFT);
		ByteBuffer[] stringsBuffers = new ByteBuffer[strings.length];
		for ( int i = 0; i < strings.length; i++ )
			__buffer.pointerParam(stringsAddress, i, memAddress(stringsBuffers[i] = memEncodeUTF8(strings[i], true)));
		return nglCreateShaderProgramv(type, strings.length, __buffer.address(stringsAddress));
	}

	/** Single string version of: {@link #glCreateShaderProgramv CreateShaderProgramv} */
	public static int glCreateShaderProgramv(int type, CharSequence string) {
		APIBuffer __buffer = apiBuffer();
		ByteBuffer stringBuffers = memEncodeUTF8(string, true);
		int stringsAddress = __buffer.pointerParam(memAddress(stringBuffers));
		return nglCreateShaderProgramv(type, 1, __buffer.address(stringsAddress));
	}

	// --- [ glBindProgramPipeline ] ---

	/**
	 * Binds a program pipeline to the current context.
	 *
	 * @param pipeline the name of the pipeline object to bind to the context
	 */
	public static void glBindProgramPipeline(int pipeline) {
		long __functionAddress = getInstance().BindProgramPipeline;
		GL41.nglBindProgramPipeline(pipeline, __functionAddress);
	}

	// --- [ glDeleteProgramPipelines ] ---

	/** Unsafe version of {@link #glDeleteProgramPipelines DeleteProgramPipelines} */
	@JavadocExclude
	public static void nglDeleteProgramPipelines(int n, long pipelines) {
		long __functionAddress = getInstance().DeleteProgramPipelines;
		GL41.nglDeleteProgramPipelines(n, pipelines, __functionAddress);
	}

	/**
	 * Deletes program pipeline objects.
	 *
	 * @param n         the number of program pipeline objects to delete
	 * @param pipelines an array of names of program pipeline objects to delete
	 */
	public static void glDeleteProgramPipelines(int n, ByteBuffer pipelines) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pipelines, n << 2);
		nglDeleteProgramPipelines(n, memAddress(pipelines));
	}

	/** Alternative version of: {@link #glDeleteProgramPipelines DeleteProgramPipelines} */
	public static void glDeleteProgramPipelines(IntBuffer pipelines) {
		nglDeleteProgramPipelines(pipelines.remaining(), memAddress(pipelines));
	}

	/** Single value version of: {@link #glDeleteProgramPipelines DeleteProgramPipelines} */
	public static void glDeleteProgramPipelines(int pipeline) {
		APIBuffer __buffer = apiBuffer();
		int pipelines = __buffer.intParam(pipeline);
		nglDeleteProgramPipelines(1, __buffer.address(pipelines));
	}

	// --- [ glGenProgramPipelines ] ---

	/** Unsafe version of {@link #glGenProgramPipelines GenProgramPipelines} */
	@JavadocExclude
	public static void nglGenProgramPipelines(int n, long pipelines) {
		long __functionAddress = getInstance().GenProgramPipelines;
		GL41.nglGenProgramPipelines(n, pipelines, __functionAddress);
	}

	/**
	 * Reserves program pipeline object names.
	 *
	 * @param n         the number of program pipeline object names to reserve
	 * @param pipelines an array of into which the reserved names will be written
	 */
	public static void glGenProgramPipelines(int n, ByteBuffer pipelines) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pipelines, n << 2);
		nglGenProgramPipelines(n, memAddress(pipelines));
	}

	/** Alternative version of: {@link #glGenProgramPipelines GenProgramPipelines} */
	public static void glGenProgramPipelines(IntBuffer pipelines) {
		nglGenProgramPipelines(pipelines.remaining(), memAddress(pipelines));
	}

	/** Single return value version of: {@link #glGenProgramPipelines GenProgramPipelines} */
	public static int glGenProgramPipelines() {
		APIBuffer __buffer = apiBuffer();
		int pipelines = __buffer.intParam();
		nglGenProgramPipelines(1, __buffer.address(pipelines));
		return __buffer.intValue(pipelines);
	}

	// --- [ glIsProgramPipeline ] ---

	/**
	 * Determines if a name corresponds to a program pipeline object.
	 *
	 * @param pipeline a value that may be the name of a program pipeline object
	 */
	public static boolean glIsProgramPipeline(int pipeline) {
		long __functionAddress = getInstance().IsProgramPipeline;
		return GL41.nglIsProgramPipeline(pipeline, __functionAddress);
	}

	// --- [ glProgramParameteri ] ---

	/**
	 * Specifies the integer value of a program object parameter.
	 *
	 * @param program the name of a program object whose parameter to modify
	 * @param pname   the name of the parameter to modify. One of:<br>{@link GL41#GL_PROGRAM_BINARY_RETRIEVABLE_HINT PROGRAM_BINARY_RETRIEVABLE_HINT}, {@link #GL_PROGRAM_SEPARABLE PROGRAM_SEPARABLE}
	 * @param value   the new value of the parameter specified by {@code pname} for {@code program}
	 */
	public static void glProgramParameteri(int program, int pname, int value) {
		long __functionAddress = getInstance().ProgramParameteri;
		GL41.nglProgramParameteri(program, pname, value, __functionAddress);
	}

	// --- [ glGetProgramPipelineiv ] ---

	/** Unsafe version of {@link #glGetProgramPipelineiv GetProgramPipelineiv} */
	@JavadocExclude
	public static void nglGetProgramPipelineiv(int pipeline, int pname, long params) {
		long __functionAddress = getInstance().GetProgramPipelineiv;
		GL41.nglGetProgramPipelineiv(pipeline, pname, params, __functionAddress);
	}

	/**
	 * Retrieves properties of a program pipeline object.
	 *
	 * @param pipeline the name of a program pipeline object whose parameter retrieve
	 * @param pname    the name of the parameter to retrieve. One of:<br>{@link #GL_ACTIVE_PROGRAM ACTIVE_PROGRAM}, {@link GL20#GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}, {@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param params   a variable into which will be written the value or values of {@code pname} for {@code pipeline}
	 */
	public static void glGetProgramPipelineiv(int pipeline, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetProgramPipelineiv(pipeline, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetProgramPipelineiv GetProgramPipelineiv} */
	public static void glGetProgramPipelineiv(int pipeline, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetProgramPipelineiv(pipeline, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetProgramPipelineiv GetProgramPipelineiv} */
	public static int glGetProgramPipelinei(int pipeline, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetProgramPipelineiv(pipeline, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glProgramUniform1i ] ---

	/**
	 * Specifies the value of an int uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1i(int program, int location, int x) {
		long __functionAddress = getInstance().ProgramUniform1i;
		GL41.nglProgramUniform1i(program, location, x, __functionAddress);
	}

	// --- [ glProgramUniform2i ] ---

	/**
	 * Specifies the value of an ivec2 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2i(int program, int location, int x, int y) {
		long __functionAddress = getInstance().ProgramUniform2i;
		GL41.nglProgramUniform2i(program, location, x, y, __functionAddress);
	}

	// --- [ glProgramUniform3i ] ---

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
		long __functionAddress = getInstance().ProgramUniform3i;
		GL41.nglProgramUniform3i(program, location, x, y, z, __functionAddress);
	}

	// --- [ glProgramUniform4i ] ---

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
		long __functionAddress = getInstance().ProgramUniform4i;
		GL41.nglProgramUniform4i(program, location, x, y, z, w, __functionAddress);
	}

	// --- [ glProgramUniform1ui ] ---

	/**
	 * Specifies the value of a uint uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1ui(int program, int location, int x) {
		long __functionAddress = getInstance().ProgramUniform1ui;
		GL41.nglProgramUniform1ui(program, location, x, __functionAddress);
	}

	// --- [ glProgramUniform2ui ] ---

	/**
	 * Specifies the value of a uvec2 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2ui(int program, int location, int x, int y) {
		long __functionAddress = getInstance().ProgramUniform2ui;
		GL41.nglProgramUniform2ui(program, location, x, y, __functionAddress);
	}

	// --- [ glProgramUniform3ui ] ---

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
		long __functionAddress = getInstance().ProgramUniform3ui;
		GL41.nglProgramUniform3ui(program, location, x, y, z, __functionAddress);
	}

	// --- [ glProgramUniform4ui ] ---

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
		long __functionAddress = getInstance().ProgramUniform4ui;
		GL41.nglProgramUniform4ui(program, location, x, y, z, w, __functionAddress);
	}

	// --- [ glProgramUniform1f ] ---

	/**
	 * Specifies the value of a float uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1f(int program, int location, float x) {
		long __functionAddress = getInstance().ProgramUniform1f;
		GL41.nglProgramUniform1f(program, location, x, __functionAddress);
	}

	// --- [ glProgramUniform2f ] ---

	/**
	 * Specifies the value of a vec2 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2f(int program, int location, float x, float y) {
		long __functionAddress = getInstance().ProgramUniform2f;
		GL41.nglProgramUniform2f(program, location, x, y, __functionAddress);
	}

	// --- [ glProgramUniform3f ] ---

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
		long __functionAddress = getInstance().ProgramUniform3f;
		GL41.nglProgramUniform3f(program, location, x, y, z, __functionAddress);
	}

	// --- [ glProgramUniform4f ] ---

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
		long __functionAddress = getInstance().ProgramUniform4f;
		GL41.nglProgramUniform4f(program, location, x, y, z, w, __functionAddress);
	}

	// --- [ glProgramUniform1d ] ---

	/**
	 * Specifies the value of a double uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1d(int program, int location, double x) {
		long __functionAddress = getInstance().ProgramUniform1d;
		GL41.nglProgramUniform1d(program, location, x, __functionAddress);
	}

	// --- [ glProgramUniform2d ] ---

	/**
	 * Specifies the value of a dvec2 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2d(int program, int location, double x, double y) {
		long __functionAddress = getInstance().ProgramUniform2d;
		GL41.nglProgramUniform2d(program, location, x, y, __functionAddress);
	}

	// --- [ glProgramUniform3d ] ---

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
		long __functionAddress = getInstance().ProgramUniform3d;
		GL41.nglProgramUniform3d(program, location, x, y, z, __functionAddress);
	}

	// --- [ glProgramUniform4d ] ---

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
		long __functionAddress = getInstance().ProgramUniform4d;
		GL41.nglProgramUniform4d(program, location, x, y, z, w, __functionAddress);
	}

	// --- [ glProgramUniform1iv ] ---

	/** Unsafe version of {@link #glProgramUniform1iv ProgramUniform1iv} */
	@JavadocExclude
	public static void nglProgramUniform1iv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1iv;
		GL41.nglProgramUniform1iv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single float uniform variable or a float uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform1iv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglProgramUniform1iv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1iv ProgramUniform1iv} */
	public static void glProgramUniform1iv(int program, int location, IntBuffer value) {
		nglProgramUniform1iv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2iv ] ---

	/** Unsafe version of {@link #glProgramUniform2iv ProgramUniform2iv} */
	@JavadocExclude
	public static void nglProgramUniform2iv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2iv;
		GL41.nglProgramUniform2iv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single ivec2 uniform variable or a ivec2 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform2iv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglProgramUniform2iv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2iv ProgramUniform2iv} */
	public static void glProgramUniform2iv(int program, int location, IntBuffer value) {
		nglProgramUniform2iv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3iv ] ---

	/** Unsafe version of {@link #glProgramUniform3iv ProgramUniform3iv} */
	@JavadocExclude
	public static void nglProgramUniform3iv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3iv;
		GL41.nglProgramUniform3iv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single ivec3 uniform variable or a ivec3 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform3iv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 9) << 2);
		nglProgramUniform3iv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3iv ProgramUniform3iv} */
	public static void glProgramUniform3iv(int program, int location, IntBuffer value) {
		nglProgramUniform3iv(program, location, value.remaining() / 9, memAddress(value));
	}

	// --- [ glProgramUniform4iv ] ---

	/** Unsafe version of {@link #glProgramUniform4iv ProgramUniform4iv} */
	@JavadocExclude
	public static void nglProgramUniform4iv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4iv;
		GL41.nglProgramUniform4iv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single ivec4 uniform variable or a ivec4 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform4iv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniform4iv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4iv ProgramUniform4iv} */
	public static void glProgramUniform4iv(int program, int location, IntBuffer value) {
		nglProgramUniform4iv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1uiv ] ---

	/** Unsafe version of {@link #glProgramUniform1uiv ProgramUniform1uiv} */
	@JavadocExclude
	public static void nglProgramUniform1uiv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1uiv;
		GL41.nglProgramUniform1uiv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single uint uniform variable or a uint uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform1uiv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglProgramUniform1uiv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1uiv ProgramUniform1uiv} */
	public static void glProgramUniform1uiv(int program, int location, IntBuffer value) {
		nglProgramUniform1uiv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2uiv ] ---

	/** Unsafe version of {@link #glProgramUniform2uiv ProgramUniform2uiv} */
	@JavadocExclude
	public static void nglProgramUniform2uiv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2uiv;
		GL41.nglProgramUniform2uiv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single uvec2 uniform variable or a uvec2 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform2uiv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglProgramUniform2uiv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2uiv ProgramUniform2uiv} */
	public static void glProgramUniform2uiv(int program, int location, IntBuffer value) {
		nglProgramUniform2uiv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3uiv ] ---

	/** Unsafe version of {@link #glProgramUniform3uiv ProgramUniform3uiv} */
	@JavadocExclude
	public static void nglProgramUniform3uiv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3uiv;
		GL41.nglProgramUniform3uiv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single uvec3 uniform variable or a uvec3 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform3uiv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 9) << 2);
		nglProgramUniform3uiv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3uiv ProgramUniform3uiv} */
	public static void glProgramUniform3uiv(int program, int location, IntBuffer value) {
		nglProgramUniform3uiv(program, location, value.remaining() / 9, memAddress(value));
	}

	// --- [ glProgramUniform4uiv ] ---

	/** Unsafe version of {@link #glProgramUniform4uiv ProgramUniform4uiv} */
	@JavadocExclude
	public static void nglProgramUniform4uiv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4uiv;
		GL41.nglProgramUniform4uiv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single uvec4 uniform variable or a uvec4 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform4uiv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniform4uiv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4uiv ProgramUniform4uiv} */
	public static void glProgramUniform4uiv(int program, int location, IntBuffer value) {
		nglProgramUniform4uiv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1fv ] ---

	/** Unsafe version of {@link #glProgramUniform1fv ProgramUniform1fv} */
	@JavadocExclude
	public static void nglProgramUniform1fv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1fv;
		GL41.nglProgramUniform1fv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single float uniform variable or a float uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform1fv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglProgramUniform1fv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1fv ProgramUniform1fv} */
	public static void glProgramUniform1fv(int program, int location, FloatBuffer value) {
		nglProgramUniform1fv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2fv ] ---

	/** Unsafe version of {@link #glProgramUniform2fv ProgramUniform2fv} */
	@JavadocExclude
	public static void nglProgramUniform2fv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2fv;
		GL41.nglProgramUniform2fv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single vec2 uniform variable or a vec2 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform2fv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglProgramUniform2fv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2fv ProgramUniform2fv} */
	public static void glProgramUniform2fv(int program, int location, FloatBuffer value) {
		nglProgramUniform2fv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3fv ] ---

	/** Unsafe version of {@link #glProgramUniform3fv ProgramUniform3fv} */
	@JavadocExclude
	public static void nglProgramUniform3fv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3fv;
		GL41.nglProgramUniform3fv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single vec3 uniform variable or a vec3 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform3fv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 9) << 2);
		nglProgramUniform3fv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3fv ProgramUniform3fv} */
	public static void glProgramUniform3fv(int program, int location, FloatBuffer value) {
		nglProgramUniform3fv(program, location, value.remaining() / 9, memAddress(value));
	}

	// --- [ glProgramUniform4fv ] ---

	/** Unsafe version of {@link #glProgramUniform4fv ProgramUniform4fv} */
	@JavadocExclude
	public static void nglProgramUniform4fv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4fv;
		GL41.nglProgramUniform4fv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single vec4 uniform variable or a vec4 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform4fv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniform4fv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4fv ProgramUniform4fv} */
	public static void glProgramUniform4fv(int program, int location, FloatBuffer value) {
		nglProgramUniform4fv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1dv ] ---

	/** Unsafe version of {@link #glProgramUniform1dv ProgramUniform1dv} */
	@JavadocExclude
	public static void nglProgramUniform1dv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1dv;
		GL41.nglProgramUniform1dv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single double uniform variable or a double uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform1dv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglProgramUniform1dv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1dv ProgramUniform1dv} */
	public static void glProgramUniform1dv(int program, int location, DoubleBuffer value) {
		nglProgramUniform1dv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2dv ] ---

	/** Unsafe version of {@link #glProgramUniform2dv ProgramUniform2dv} */
	@JavadocExclude
	public static void nglProgramUniform2dv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2dv;
		GL41.nglProgramUniform2dv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform2dv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 3);
		nglProgramUniform2dv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2dv ProgramUniform2dv} */
	public static void glProgramUniform2dv(int program, int location, DoubleBuffer value) {
		nglProgramUniform2dv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3dv ] ---

	/** Unsafe version of {@link #glProgramUniform3dv ProgramUniform3dv} */
	@JavadocExclude
	public static void nglProgramUniform3dv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3dv;
		GL41.nglProgramUniform3dv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform3dv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 9) << 3);
		nglProgramUniform3dv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3dv ProgramUniform3dv} */
	public static void glProgramUniform3dv(int program, int location, DoubleBuffer value) {
		nglProgramUniform3dv(program, location, value.remaining() / 9, memAddress(value));
	}

	// --- [ glProgramUniform4dv ] ---

	/** Unsafe version of {@link #glProgramUniform4dv ProgramUniform4dv} */
	@JavadocExclude
	public static void nglProgramUniform4dv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4dv;
		GL41.nglProgramUniform4dv(program, location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dvec4 uniform variable or a dvec4 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform4dv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglProgramUniform4dv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4dv ProgramUniform4dv} */
	public static void glProgramUniform4dv(int program, int location, DoubleBuffer value) {
		nglProgramUniform4dv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2fv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix2fv ProgramUniformMatrix2fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2fv;
		GL41.nglProgramUniformMatrix2fv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single mat2 uniform variable or a mat2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniformMatrix2fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2fv ProgramUniformMatrix2fv} */
	public static void glProgramUniformMatrix2fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2fv(program, location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3fv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix3fv ProgramUniformMatrix3fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3fv;
		GL41.nglProgramUniformMatrix3fv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single mat3 uniform variable or a mat3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 9) << 2);
		nglProgramUniformMatrix3fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3fv ProgramUniformMatrix3fv} */
	public static void glProgramUniformMatrix3fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3fv(program, location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4fv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix4fv ProgramUniformMatrix4fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4fv;
		GL41.nglProgramUniformMatrix4fv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single mat4 uniform variable or a mat4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 4) << 2);
		nglProgramUniformMatrix4fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4fv ProgramUniformMatrix4fv} */
	public static void glProgramUniformMatrix4fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4fv(program, location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2dv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix2dv ProgramUniformMatrix2dv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2dv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2dv;
		GL41.nglProgramUniformMatrix2dv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat2 uniform variable or a dmat2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2dv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglProgramUniformMatrix2dv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2dv ProgramUniformMatrix2dv} */
	public static void glProgramUniformMatrix2dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix2dv(program, location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3dv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix3dv ProgramUniformMatrix3dv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3dv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3dv;
		GL41.nglProgramUniformMatrix3dv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat3 uniform variable or a dmat3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3dv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 9) << 3);
		nglProgramUniformMatrix3dv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3dv ProgramUniformMatrix3dv} */
	public static void glProgramUniformMatrix3dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix3dv(program, location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4dv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix4dv ProgramUniformMatrix4dv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4dv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4dv;
		GL41.nglProgramUniformMatrix4dv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat4 uniform variable or a dmat4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4dv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 4) << 3);
		nglProgramUniformMatrix4dv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4dv ProgramUniformMatrix4dv} */
	public static void glProgramUniformMatrix4dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix4dv(program, location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x3fv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix2x3fv ProgramUniformMatrix2x3fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x3fv;
		GL41.nglProgramUniformMatrix2x3fv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single mat2x3 uniform variable or a mat2x3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglProgramUniformMatrix2x3fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x3fv ProgramUniformMatrix2x3fv} */
	public static void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x3fv(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x2fv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix3x2fv ProgramUniformMatrix3x2fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x2fv;
		GL41.nglProgramUniformMatrix3x2fv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single mat3x2 uniform variable or a mat3x2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglProgramUniformMatrix3x2fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x2fv ProgramUniformMatrix3x2fv} */
	public static void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x2fv(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x4fv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix2x4fv ProgramUniformMatrix2x4fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x4fv;
		GL41.nglProgramUniformMatrix2x4fv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single mat2x4 uniform variable or a mat2x4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglProgramUniformMatrix2x4fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x4fv ProgramUniformMatrix2x4fv} */
	public static void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x4fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x2fv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix4x2fv ProgramUniformMatrix4x2fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x2fv;
		GL41.nglProgramUniformMatrix4x2fv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single mat4x2 uniform variable or a mat4x2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglProgramUniformMatrix4x2fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x2fv ProgramUniformMatrix4x2fv} */
	public static void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x2fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x4fv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix3x4fv ProgramUniformMatrix3x4fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x4fv;
		GL41.nglProgramUniformMatrix3x4fv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single mat3x4 uniform variable or a mat3x4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglProgramUniformMatrix3x4fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x4fv ProgramUniformMatrix3x4fv} */
	public static void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x4fv(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x3fv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix4x3fv ProgramUniformMatrix4x3fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x3fv;
		GL41.nglProgramUniformMatrix4x3fv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single mat4x3 uniform variable or a mat4x3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglProgramUniformMatrix4x3fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x3fv ProgramUniformMatrix4x3fv} */
	public static void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x3fv(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x3dv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix2x3dv ProgramUniformMatrix2x3dv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x3dv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x3dv;
		GL41.nglProgramUniformMatrix2x3dv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat2x3 uniform variable or a dmat2x3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x3dv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 3);
		nglProgramUniformMatrix2x3dv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x3dv ProgramUniformMatrix2x3dv} */
	public static void glProgramUniformMatrix2x3dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix2x3dv(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x2dv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix3x2dv ProgramUniformMatrix3x2dv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x2dv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x2dv;
		GL41.nglProgramUniformMatrix3x2dv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat3x2 uniform variable or a dmat3x2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x2dv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 3);
		nglProgramUniformMatrix3x2dv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x2dv ProgramUniformMatrix3x2dv} */
	public static void glProgramUniformMatrix3x2dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix3x2dv(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x4dv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix2x4dv ProgramUniformMatrix2x4dv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x4dv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x4dv;
		GL41.nglProgramUniformMatrix2x4dv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat2x4 uniform variable or a dmat2x4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x4dv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 3);
		nglProgramUniformMatrix2x4dv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x4dv ProgramUniformMatrix2x4dv} */
	public static void glProgramUniformMatrix2x4dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix2x4dv(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x2dv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix4x2dv ProgramUniformMatrix4x2dv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x2dv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x2dv;
		GL41.nglProgramUniformMatrix4x2dv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x2dv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 3);
		nglProgramUniformMatrix4x2dv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x2dv ProgramUniformMatrix4x2dv} */
	public static void glProgramUniformMatrix4x2dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix4x2dv(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x4dv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix3x4dv ProgramUniformMatrix3x4dv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x4dv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x4dv;
		GL41.nglProgramUniformMatrix3x4dv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat3x4 uniform variable or a dmat3x4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x4dv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 3);
		nglProgramUniformMatrix3x4dv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x4dv ProgramUniformMatrix3x4dv} */
	public static void glProgramUniformMatrix3x4dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix3x4dv(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x3dv ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix4x3dv ProgramUniformMatrix4x3dv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x3dv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x3dv;
		GL41.nglProgramUniformMatrix4x3dv(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x3dv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 3);
		nglProgramUniformMatrix4x3dv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x3dv ProgramUniformMatrix4x3dv} */
	public static void glProgramUniformMatrix4x3dv(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix4x3dv(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glValidateProgramPipeline ] ---

	/**
	 * Validates a program pipeline object against current GL state.
	 *
	 * @param pipeline the name of a program pipeline object to validate
	 */
	public static void glValidateProgramPipeline(int pipeline) {
		long __functionAddress = getInstance().ValidateProgramPipeline;
		GL41.nglValidateProgramPipeline(pipeline, __functionAddress);
	}

	// --- [ glGetProgramPipelineInfoLog ] ---

	/** Unsafe version of {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog} */
	@JavadocExclude
	public static void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog) {
		long __functionAddress = getInstance().GetProgramPipelineInfoLog;
		GL41.nglGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog, __functionAddress);
	}

	/**
	 * Retrieves the info log string from a program pipeline object.
	 *
	 * @param pipeline the name of a program pipeline object from which to retrieve the info log
	 * @param bufSize  the maximum number of characters, including the null terminator, that may be written into {@code infoLog}
	 * @param length   a variable into which will be written the number of characters written into {@code infoLog}
	 * @param infoLog  an array of characters into which will be written the info log for {@code pipeline}
	 */
	public static void glGetProgramPipelineInfoLog(int pipeline, int bufSize, ByteBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(infoLog, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramPipelineInfoLog(pipeline, bufSize, memAddressSafe(length), memAddress(infoLog));
	}

	/** Alternative version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog} */
	public static void glGetProgramPipelineInfoLog(int pipeline, IntBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramPipelineInfoLog(pipeline, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
	}

	/** String return version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog} */
	public static String glGetProgramPipelineInfoLog(int pipeline, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(bufSize);
		nglGetProgramPipelineInfoLog(pipeline, bufSize, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(memByteBuffer(__buffer.address(infoLog), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog} */
	public static String glGetProgramPipelineInfoLog(int pipeline) {
		int bufSize = glGetProgramPipelinei(pipeline, GL20.GL_INFO_LOG_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(bufSize);
		nglGetProgramPipelineInfoLog(pipeline, bufSize, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(memByteBuffer(__buffer.address(infoLog), __buffer.intValue(length)));
	}

}