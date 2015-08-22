/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_separate_shader_objects.txt">EXT_separate_shader_objects</a> extension.
 * 
 * <p>This extension is a subset of ARB_separate_shader_objects appropriate for OpenGL ES, and also tacks on ARB_explicit_attrib_location functionality.</p>
 * 
 * <p>Conventional GLSL requires multiple shader stages (vertex and fragment) to be linked into a single monolithic program object to specify a GLSL shader
 * for each stage.</p>
 * 
 * <p>While GLSL's monolithic approach has some advantages for optimizing shaders as a unit that span multiple stages, GPU hardware supports a more flexible
 * mix-and-match approach to specifying shaders independently for these different shader stages. Many developers build their shader content around the
 * mix-and-match approach where they can use a single vertex shader with multiple fragment shaders (or vice versa).</p>
 * 
 * <p>This extension adopts a "mix-and-match" shader stage model for GLSL allowing multiple different GLSL program objects to be bound at once each to an
 * individual rendering pipeline stage independently of other stage bindings. This allows program objects to contain only the shader stages that best suit
 * the application's needs.</p>
 * 
 * <p>This extension introduces the program pipeline object that serves as a container for the program bound to any particular rendering stage. It can be
 * bound, unbound, and rebound to simply save and restore the complete shader stage to program object bindings. Like framebuffer and vertex array objects,
 * program pipeline objects are "container" objects that are not shared between contexts.</p>
 * 
 * <p>To bind a program object to a specific shader stage or set of stages, UseProgramStagesEXT is used. The VERTEX_SHADER_BIT_EXT and
 * FRAGMENT_SHADER_BIT_EXT tokens refer to the conventional vertex and fragment stages, respectively. ActiveShaderProgramEXT specifies the program that
 * Uniform* commands will update.</p>
 * 
 * <p>While ActiveShaderProgramEXT provides a selector for setting and querying uniform values of a program object with the conventional Uniform* commands,
 * the ProgramUniform* commands provide a selector-free way to modify uniforms of a GLSL program object without an explicit bind. This selector-free model
 * reduces API overhead and provides a cleaner interface for applications.</p>
 * 
 * <p>Separate linking creates the possibility that certain output varyings of a shader may go unread by the subsequent shader input varyings. In this case,
 * the output varyings are simply ignored. It is also possible input varyings from a shader may not be written as output varyings of a preceding shader.
 * In this case, the unwritten input varying values are undefined.</p>
 * 
 * <p>This extension also introduces a layout location qualifier to GLSL to pre- assign attribute and varying locations to shader variables. This allows
 * applications to globally assign a particular semantic meaning, such as diffuse color or vertex normal, to a particular attribute and/or varying
 * location without knowing how that variable will be named in any particular shader.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class EXTSeparateShaderObjects {

	/** Accepted by {@code stages} parameter to UseProgramStagesEXT. */
	public static final int
		GL_VERTEX_SHADER_BIT_EXT   = 0x1,
		GL_FRAGMENT_SHADER_BIT_EXT = 0x2,
		GL_ALL_SHADER_BITS_EXT     = 0xFFFFFFFF;

	/** Accepted by the {@code pname} parameter of ProgramParameteriEXT and GetProgramiv. */
	public static final int GL_PROGRAM_SEPARABLE_EXT = 0x8258;

	/** Accepted by {@code type} parameter to GetProgramPipelineivEXT. */
	public static final int GL_ACTIVE_PROGRAM_EXT = 0x8259;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int GL_PROGRAM_PIPELINE_BINDING_EXT = 0x825A;

	/** Function address. */
	@JavadocExclude
	public final long
		ActiveShaderProgramEXT,
		BindProgramPipelineEXT,
		CreateShaderProgramvEXT,
		DeleteProgramPipelinesEXT,
		GenProgramPipelinesEXT,
		GetProgramPipelineInfoLogEXT,
		GetProgramPipelineivEXT,
		IsProgramPipelineEXT,
		ProgramParameteriEXT,
		ProgramUniform1fEXT,
		ProgramUniform1fvEXT,
		ProgramUniform1iEXT,
		ProgramUniform1ivEXT,
		ProgramUniform2fEXT,
		ProgramUniform2fvEXT,
		ProgramUniform2iEXT,
		ProgramUniform2ivEXT,
		ProgramUniform3fEXT,
		ProgramUniform3fvEXT,
		ProgramUniform3iEXT,
		ProgramUniform3ivEXT,
		ProgramUniform4fEXT,
		ProgramUniform4fvEXT,
		ProgramUniform4iEXT,
		ProgramUniform4ivEXT,
		ProgramUniformMatrix2fvEXT,
		ProgramUniformMatrix3fvEXT,
		ProgramUniformMatrix4fvEXT,
		UseProgramStagesEXT,
		ValidateProgramPipelineEXT,
		ProgramUniform1uiEXT,
		ProgramUniform2uiEXT,
		ProgramUniform3uiEXT,
		ProgramUniform4uiEXT,
		ProgramUniform1uivEXT,
		ProgramUniform2uivEXT,
		ProgramUniform3uivEXT,
		ProgramUniform4uivEXT,
		ProgramUniformMatrix2x3fvEXT,
		ProgramUniformMatrix3x2fvEXT,
		ProgramUniformMatrix2x4fvEXT,
		ProgramUniformMatrix4x2fvEXT,
		ProgramUniformMatrix3x4fvEXT,
		ProgramUniformMatrix4x3fvEXT;

	@JavadocExclude
	public EXTSeparateShaderObjects(FunctionProvider provider) {
		ActiveShaderProgramEXT = provider.getFunctionAddress("glActiveShaderProgramEXT");
		BindProgramPipelineEXT = provider.getFunctionAddress("glBindProgramPipelineEXT");
		CreateShaderProgramvEXT = provider.getFunctionAddress("glCreateShaderProgramvEXT");
		DeleteProgramPipelinesEXT = provider.getFunctionAddress("glDeleteProgramPipelinesEXT");
		GenProgramPipelinesEXT = provider.getFunctionAddress("glGenProgramPipelinesEXT");
		GetProgramPipelineInfoLogEXT = provider.getFunctionAddress("glGetProgramPipelineInfoLogEXT");
		GetProgramPipelineivEXT = provider.getFunctionAddress("glGetProgramPipelineivEXT");
		IsProgramPipelineEXT = provider.getFunctionAddress("glIsProgramPipelineEXT");
		ProgramParameteriEXT = provider.getFunctionAddress("glProgramParameteriEXT");
		ProgramUniform1fEXT = provider.getFunctionAddress("glProgramUniform1fEXT");
		ProgramUniform1fvEXT = provider.getFunctionAddress("glProgramUniform1fvEXT");
		ProgramUniform1iEXT = provider.getFunctionAddress("glProgramUniform1iEXT");
		ProgramUniform1ivEXT = provider.getFunctionAddress("glProgramUniform1ivEXT");
		ProgramUniform2fEXT = provider.getFunctionAddress("glProgramUniform2fEXT");
		ProgramUniform2fvEXT = provider.getFunctionAddress("glProgramUniform2fvEXT");
		ProgramUniform2iEXT = provider.getFunctionAddress("glProgramUniform2iEXT");
		ProgramUniform2ivEXT = provider.getFunctionAddress("glProgramUniform2ivEXT");
		ProgramUniform3fEXT = provider.getFunctionAddress("glProgramUniform3fEXT");
		ProgramUniform3fvEXT = provider.getFunctionAddress("glProgramUniform3fvEXT");
		ProgramUniform3iEXT = provider.getFunctionAddress("glProgramUniform3iEXT");
		ProgramUniform3ivEXT = provider.getFunctionAddress("glProgramUniform3ivEXT");
		ProgramUniform4fEXT = provider.getFunctionAddress("glProgramUniform4fEXT");
		ProgramUniform4fvEXT = provider.getFunctionAddress("glProgramUniform4fvEXT");
		ProgramUniform4iEXT = provider.getFunctionAddress("glProgramUniform4iEXT");
		ProgramUniform4ivEXT = provider.getFunctionAddress("glProgramUniform4ivEXT");
		ProgramUniformMatrix2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2fvEXT");
		ProgramUniformMatrix3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3fvEXT");
		ProgramUniformMatrix4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4fvEXT");
		UseProgramStagesEXT = provider.getFunctionAddress("glUseProgramStagesEXT");
		ValidateProgramPipelineEXT = provider.getFunctionAddress("glValidateProgramPipelineEXT");
		ProgramUniform1uiEXT = provider.getFunctionAddress("glProgramUniform1uiEXT");
		ProgramUniform2uiEXT = provider.getFunctionAddress("glProgramUniform2uiEXT");
		ProgramUniform3uiEXT = provider.getFunctionAddress("glProgramUniform3uiEXT");
		ProgramUniform4uiEXT = provider.getFunctionAddress("glProgramUniform4uiEXT");
		ProgramUniform1uivEXT = provider.getFunctionAddress("glProgramUniform1uivEXT");
		ProgramUniform2uivEXT = provider.getFunctionAddress("glProgramUniform2uivEXT");
		ProgramUniform3uivEXT = provider.getFunctionAddress("glProgramUniform3uivEXT");
		ProgramUniform4uivEXT = provider.getFunctionAddress("glProgramUniform4uivEXT");
		ProgramUniformMatrix2x3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x3fvEXT");
		ProgramUniformMatrix3x2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x2fvEXT");
		ProgramUniformMatrix2x4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x4fvEXT");
		ProgramUniformMatrix4x2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x2fvEXT");
		ProgramUniformMatrix3x4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x4fvEXT");
		ProgramUniformMatrix4x3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x3fvEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTSeparateShaderObjects} instance for the current context. */
	public static EXTSeparateShaderObjects getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTSeparateShaderObjects);
	}

	static EXTSeparateShaderObjects create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_separate_shader_objects") ) return null;

		EXTSeparateShaderObjects funcs = new EXTSeparateShaderObjects(provider);
		boolean supported = checkFunctions(
			funcs.ActiveShaderProgramEXT, funcs.BindProgramPipelineEXT, funcs.CreateShaderProgramvEXT, funcs.DeleteProgramPipelinesEXT, 
			funcs.GenProgramPipelinesEXT, funcs.GetProgramPipelineInfoLogEXT, funcs.GetProgramPipelineivEXT, funcs.IsProgramPipelineEXT, 
			funcs.ProgramParameteriEXT, funcs.ProgramUniform1fEXT, funcs.ProgramUniform1fvEXT, funcs.ProgramUniform1iEXT, funcs.ProgramUniform1ivEXT, 
			funcs.ProgramUniform2fEXT, funcs.ProgramUniform2fvEXT, funcs.ProgramUniform2iEXT, funcs.ProgramUniform2ivEXT, funcs.ProgramUniform3fEXT, 
			funcs.ProgramUniform3fvEXT, funcs.ProgramUniform3iEXT, funcs.ProgramUniform3ivEXT, funcs.ProgramUniform4fEXT, funcs.ProgramUniform4fvEXT, 
			funcs.ProgramUniform4iEXT, funcs.ProgramUniform4ivEXT, funcs.ProgramUniformMatrix2fvEXT, funcs.ProgramUniformMatrix3fvEXT, 
			funcs.ProgramUniformMatrix4fvEXT, funcs.UseProgramStagesEXT, funcs.ValidateProgramPipelineEXT, funcs.ProgramUniform1uiEXT, 
			funcs.ProgramUniform2uiEXT, funcs.ProgramUniform3uiEXT, funcs.ProgramUniform4uiEXT, funcs.ProgramUniform1uivEXT, funcs.ProgramUniform2uivEXT, 
			funcs.ProgramUniform3uivEXT, funcs.ProgramUniform4uivEXT, funcs.ProgramUniformMatrix2x3fvEXT, funcs.ProgramUniformMatrix3x2fvEXT, 
			funcs.ProgramUniformMatrix2x4fvEXT, funcs.ProgramUniformMatrix4x2fvEXT, funcs.ProgramUniformMatrix3x4fvEXT, funcs.ProgramUniformMatrix4x3fvEXT
		);

		return GLES.checkExtension("GL_EXT_separate_shader_objects", funcs, supported);
	}

	// --- [ glActiveShaderProgramEXT ] ---

	public static void glActiveShaderProgramEXT(int pipeline, int program) {
		long __functionAddress = getInstance().ActiveShaderProgramEXT;
		callIIV(__functionAddress, pipeline, program);
	}

	// --- [ glBindProgramPipelineEXT ] ---

	public static void glBindProgramPipelineEXT(int pipeline) {
		long __functionAddress = getInstance().BindProgramPipelineEXT;
		callIV(__functionAddress, pipeline);
	}

	// --- [ glCreateShaderProgramvEXT ] ---

	/** Unsafe version of {@link #glCreateShaderProgramvEXT CreateShaderProgramvEXT} */
	@JavadocExclude
	public static int nglCreateShaderProgramvEXT(int type, int count, long strings) {
		long __functionAddress = getInstance().CreateShaderProgramvEXT;
		return callIIPI(__functionAddress, type, count, strings);
	}

	public static int glCreateShaderProgramvEXT(int type, int count, ByteBuffer strings) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(strings, count << POINTER_SHIFT);
		return nglCreateShaderProgramvEXT(type, count, memAddress(strings));
	}

	/** Alternative version of: {@link #glCreateShaderProgramvEXT CreateShaderProgramvEXT} */
	public static int glCreateShaderProgramvEXT(int type, PointerBuffer strings) {
		return nglCreateShaderProgramvEXT(type, strings.remaining(), memAddress(strings));
	}

	/** Array version of: {@link #glCreateShaderProgramvEXT CreateShaderProgramvEXT} */
	public static int glCreateShaderProgramvEXT(int type, CharSequence... strings) {
		APIBuffer __buffer = apiBuffer();
		int stringsAddress = __buffer.pointerArrayParam(APIBuffer.stringArrayUTF8(true, strings));
		try {
			return nglCreateShaderProgramvEXT(type, strings.length, __buffer.address(stringsAddress));
		} finally {
			__buffer.pointerArrayFree(stringsAddress, strings.length);
		}
	}

	/** Single string version of: {@link #glCreateShaderProgramvEXT CreateShaderProgramvEXT} */
	public static int glCreateShaderProgramvEXT(int type, CharSequence string) {
		APIBuffer __buffer = apiBuffer();
		int stringsAddress = __buffer.pointerArrayParam(APIBuffer.stringArrayUTF8(true, string));
		try {
			return nglCreateShaderProgramvEXT(type, 1, __buffer.address(stringsAddress));
		} finally {
			__buffer.pointerArrayFree(stringsAddress, 1);
		}
	}

	// --- [ glDeleteProgramPipelinesEXT ] ---

	/** Unsafe version of {@link #glDeleteProgramPipelinesEXT DeleteProgramPipelinesEXT} */
	@JavadocExclude
	public static void nglDeleteProgramPipelinesEXT(int n, long pipelines) {
		long __functionAddress = getInstance().DeleteProgramPipelinesEXT;
		callIPV(__functionAddress, n, pipelines);
	}

	public static void glDeleteProgramPipelinesEXT(int n, ByteBuffer pipelines) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pipelines, n << 2);
		nglDeleteProgramPipelinesEXT(n, memAddress(pipelines));
	}

	/** Alternative version of: {@link #glDeleteProgramPipelinesEXT DeleteProgramPipelinesEXT} */
	public static void glDeleteProgramPipelinesEXT(IntBuffer pipelines) {
		nglDeleteProgramPipelinesEXT(pipelines.remaining(), memAddress(pipelines));
	}

	/** Single value version of: {@link #glDeleteProgramPipelinesEXT DeleteProgramPipelinesEXT} */
	public static void glDeleteProgramPipelinesEXT(int pipeline) {
		APIBuffer __buffer = apiBuffer();
		int pipelines = __buffer.intParam(pipeline);
		nglDeleteProgramPipelinesEXT(1, __buffer.address(pipelines));
	}

	// --- [ glGenProgramPipelinesEXT ] ---

	/** Unsafe version of {@link #glGenProgramPipelinesEXT GenProgramPipelinesEXT} */
	@JavadocExclude
	public static void nglGenProgramPipelinesEXT(int n, long pipelines) {
		long __functionAddress = getInstance().GenProgramPipelinesEXT;
		callIPV(__functionAddress, n, pipelines);
	}

	public static void glGenProgramPipelinesEXT(int n, ByteBuffer pipelines) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pipelines, n << 2);
		nglGenProgramPipelinesEXT(n, memAddress(pipelines));
	}

	/** Alternative version of: {@link #glGenProgramPipelinesEXT GenProgramPipelinesEXT} */
	public static void glGenProgramPipelinesEXT(IntBuffer pipelines) {
		nglGenProgramPipelinesEXT(pipelines.remaining(), memAddress(pipelines));
	}

	/** Single return value version of: {@link #glGenProgramPipelinesEXT GenProgramPipelinesEXT} */
	public static int glGenProgramPipelinesEXT() {
		APIBuffer __buffer = apiBuffer();
		int pipelines = __buffer.intParam();
		nglGenProgramPipelinesEXT(1, __buffer.address(pipelines));
		return __buffer.intValue(pipelines);
	}

	// --- [ glGetProgramPipelineInfoLogEXT ] ---

	/** Unsafe version of {@link #glGetProgramPipelineInfoLogEXT GetProgramPipelineInfoLogEXT} */
	@JavadocExclude
	public static void nglGetProgramPipelineInfoLogEXT(int pipeline, int bufSize, long length, long infoLog) {
		long __functionAddress = getInstance().GetProgramPipelineInfoLogEXT;
		callIIPPV(__functionAddress, pipeline, bufSize, length, infoLog);
	}

	public static void glGetProgramPipelineInfoLogEXT(int pipeline, int bufSize, ByteBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(infoLog, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramPipelineInfoLogEXT(pipeline, bufSize, memAddressSafe(length), memAddress(infoLog));
	}

	/** Alternative version of: {@link #glGetProgramPipelineInfoLogEXT GetProgramPipelineInfoLogEXT} */
	public static void glGetProgramPipelineInfoLogEXT(int pipeline, IntBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramPipelineInfoLogEXT(pipeline, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
	}

	/** String return version of: {@link #glGetProgramPipelineInfoLogEXT GetProgramPipelineInfoLogEXT} */
	public static String glGetProgramPipelineInfoLogEXT(int pipeline, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(bufSize);
		nglGetProgramPipelineInfoLogEXT(pipeline, bufSize, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), infoLog);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetProgramPipelineInfoLogEXT GetProgramPipelineInfoLogEXT} */
	public static String glGetProgramPipelineInfoLogEXT(int pipeline) {
		int bufSize = glGetProgramPipelineiEXT(pipeline, GLES20.GL_INFO_LOG_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(bufSize);
		nglGetProgramPipelineInfoLogEXT(pipeline, bufSize, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), infoLog);
	}

	// --- [ glGetProgramPipelineivEXT ] ---

	/** Unsafe version of {@link #glGetProgramPipelineivEXT GetProgramPipelineivEXT} */
	@JavadocExclude
	public static void nglGetProgramPipelineivEXT(int pipeline, int pname, long params) {
		long __functionAddress = getInstance().GetProgramPipelineivEXT;
		callIIPV(__functionAddress, pipeline, pname, params);
	}

	public static void glGetProgramPipelineivEXT(int pipeline, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetProgramPipelineivEXT(pipeline, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetProgramPipelineivEXT GetProgramPipelineivEXT} */
	public static void glGetProgramPipelineivEXT(int pipeline, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetProgramPipelineivEXT(pipeline, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetProgramPipelineivEXT GetProgramPipelineivEXT} */
	public static int glGetProgramPipelineiEXT(int pipeline, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetProgramPipelineivEXT(pipeline, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glIsProgramPipelineEXT ] ---

	public static boolean glIsProgramPipelineEXT(int pipeline) {
		long __functionAddress = getInstance().IsProgramPipelineEXT;
		return callIZ(__functionAddress, pipeline);
	}

	// --- [ glProgramParameteriEXT ] ---

	public static void glProgramParameteriEXT(int program, int pname, int value) {
		long __functionAddress = getInstance().ProgramParameteriEXT;
		callIIIV(__functionAddress, program, pname, value);
	}

	// --- [ glProgramUniform1fEXT ] ---

	public static void glProgramUniform1fEXT(int program, int location, float v0) {
		long __functionAddress = getInstance().ProgramUniform1fEXT;
		callIIFV(__functionAddress, program, location, v0);
	}

	// --- [ glProgramUniform1fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniform1fvEXT ProgramUniform1fvEXT} */
	@JavadocExclude
	public static void nglProgramUniform1fvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1fvEXT;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform1fvEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglProgramUniform1fvEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1fvEXT ProgramUniform1fvEXT} */
	public static void glProgramUniform1fvEXT(int program, int location, FloatBuffer value) {
		nglProgramUniform1fvEXT(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform1iEXT ] ---

	public static void glProgramUniform1iEXT(int program, int location, int v0) {
		long __functionAddress = getInstance().ProgramUniform1iEXT;
		callIIIV(__functionAddress, program, location, v0);
	}

	// --- [ glProgramUniform1ivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform1ivEXT ProgramUniform1ivEXT} */
	@JavadocExclude
	public static void nglProgramUniform1ivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1ivEXT;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform1ivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglProgramUniform1ivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1ivEXT ProgramUniform1ivEXT} */
	public static void glProgramUniform1ivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform1ivEXT(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2fEXT ] ---

	public static void glProgramUniform2fEXT(int program, int location, float v0, float v1) {
		long __functionAddress = getInstance().ProgramUniform2fEXT;
		callIIFFV(__functionAddress, program, location, v0, v1);
	}

	// --- [ glProgramUniform2fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniform2fvEXT ProgramUniform2fvEXT} */
	@JavadocExclude
	public static void nglProgramUniform2fvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2fvEXT;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform2fvEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglProgramUniform2fvEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2fvEXT ProgramUniform2fvEXT} */
	public static void glProgramUniform2fvEXT(int program, int location, FloatBuffer value) {
		nglProgramUniform2fvEXT(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform2iEXT ] ---

	public static void glProgramUniform2iEXT(int program, int location, int v0, int v1) {
		long __functionAddress = getInstance().ProgramUniform2iEXT;
		callIIIIV(__functionAddress, program, location, v0, v1);
	}

	// --- [ glProgramUniform2ivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform2ivEXT ProgramUniform2ivEXT} */
	@JavadocExclude
	public static void nglProgramUniform2ivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2ivEXT;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform2ivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglProgramUniform2ivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2ivEXT ProgramUniform2ivEXT} */
	public static void glProgramUniform2ivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform2ivEXT(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3fEXT ] ---

	public static void glProgramUniform3fEXT(int program, int location, float v0, float v1, float v2) {
		long __functionAddress = getInstance().ProgramUniform3fEXT;
		callIIFFFV(__functionAddress, program, location, v0, v1, v2);
	}

	// --- [ glProgramUniform3fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniform3fvEXT ProgramUniform3fvEXT} */
	@JavadocExclude
	public static void nglProgramUniform3fvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3fvEXT;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform3fvEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglProgramUniform3fvEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3fvEXT ProgramUniform3fvEXT} */
	public static void glProgramUniform3fvEXT(int program, int location, FloatBuffer value) {
		nglProgramUniform3fvEXT(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform3iEXT ] ---

	public static void glProgramUniform3iEXT(int program, int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().ProgramUniform3iEXT;
		callIIIIIV(__functionAddress, program, location, v0, v1, v2);
	}

	// --- [ glProgramUniform3ivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform3ivEXT ProgramUniform3ivEXT} */
	@JavadocExclude
	public static void nglProgramUniform3ivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3ivEXT;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform3ivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglProgramUniform3ivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3ivEXT ProgramUniform3ivEXT} */
	public static void glProgramUniform3ivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform3ivEXT(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4fEXT ] ---

	public static void glProgramUniform4fEXT(int program, int location, float v0, float v1, float v2, float v3) {
		long __functionAddress = getInstance().ProgramUniform4fEXT;
		callIIFFFFV(__functionAddress, program, location, v0, v1, v2, v3);
	}

	// --- [ glProgramUniform4fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniform4fvEXT ProgramUniform4fvEXT} */
	@JavadocExclude
	public static void nglProgramUniform4fvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4fvEXT;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform4fvEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniform4fvEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4fvEXT ProgramUniform4fvEXT} */
	public static void glProgramUniform4fvEXT(int program, int location, FloatBuffer value) {
		nglProgramUniform4fvEXT(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform4iEXT ] ---

	public static void glProgramUniform4iEXT(int program, int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().ProgramUniform4iEXT;
		callIIIIIIV(__functionAddress, program, location, v0, v1, v2, v3);
	}

	// --- [ glProgramUniform4ivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform4ivEXT ProgramUniform4ivEXT} */
	@JavadocExclude
	public static void nglProgramUniform4ivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4ivEXT;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform4ivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniform4ivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4ivEXT ProgramUniform4ivEXT} */
	public static void glProgramUniform4ivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform4ivEXT(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix2fvEXT ProgramUniformMatrix2fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2fvEXT;
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniformMatrix2fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2fvEXT ProgramUniformMatrix2fvEXT} */
	public static void glProgramUniformMatrix2fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2fvEXT(program, location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix3fvEXT ProgramUniformMatrix3fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3fvEXT;
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 9) << 2);
		nglProgramUniformMatrix3fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3fvEXT ProgramUniformMatrix3fvEXT} */
	public static void glProgramUniformMatrix3fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3fvEXT(program, location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix4fvEXT ProgramUniformMatrix4fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4fvEXT;
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 4) << 2);
		nglProgramUniformMatrix4fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4fvEXT ProgramUniformMatrix4fvEXT} */
	public static void glProgramUniformMatrix4fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4fvEXT(program, location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glUseProgramStagesEXT ] ---

	public static void glUseProgramStagesEXT(int pipeline, int stages, int program) {
		long __functionAddress = getInstance().UseProgramStagesEXT;
		callIIIV(__functionAddress, pipeline, stages, program);
	}

	// --- [ glValidateProgramPipelineEXT ] ---

	public static void glValidateProgramPipelineEXT(int pipeline) {
		long __functionAddress = getInstance().ValidateProgramPipelineEXT;
		callIV(__functionAddress, pipeline);
	}

	// --- [ glProgramUniform1uiEXT ] ---

	public static void glProgramUniform1uiEXT(int program, int location, int v0) {
		long __functionAddress = getInstance().ProgramUniform1uiEXT;
		callIIIV(__functionAddress, program, location, v0);
	}

	// --- [ glProgramUniform2uiEXT ] ---

	public static void glProgramUniform2uiEXT(int program, int location, int v0, int v1) {
		long __functionAddress = getInstance().ProgramUniform2uiEXT;
		callIIIIV(__functionAddress, program, location, v0, v1);
	}

	// --- [ glProgramUniform3uiEXT ] ---

	public static void glProgramUniform3uiEXT(int program, int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().ProgramUniform3uiEXT;
		callIIIIIV(__functionAddress, program, location, v0, v1, v2);
	}

	// --- [ glProgramUniform4uiEXT ] ---

	public static void glProgramUniform4uiEXT(int program, int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().ProgramUniform4uiEXT;
		callIIIIIIV(__functionAddress, program, location, v0, v1, v2, v3);
	}

	// --- [ glProgramUniform1uivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform1uivEXT ProgramUniform1uivEXT} */
	@JavadocExclude
	public static void nglProgramUniform1uivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1uivEXT;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform1uivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglProgramUniform1uivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1uivEXT ProgramUniform1uivEXT} */
	public static void glProgramUniform1uivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform1uivEXT(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2uivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform2uivEXT ProgramUniform2uivEXT} */
	@JavadocExclude
	public static void nglProgramUniform2uivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2uivEXT;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform2uivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglProgramUniform2uivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2uivEXT ProgramUniform2uivEXT} */
	public static void glProgramUniform2uivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform2uivEXT(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3uivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform3uivEXT ProgramUniform3uivEXT} */
	@JavadocExclude
	public static void nglProgramUniform3uivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3uivEXT;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform3uivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglProgramUniform3uivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3uivEXT ProgramUniform3uivEXT} */
	public static void glProgramUniform3uivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform3uivEXT(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4uivEXT ] ---

	/** Unsafe version of {@link #glProgramUniform4uivEXT ProgramUniform4uivEXT} */
	@JavadocExclude
	public static void nglProgramUniform4uivEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4uivEXT;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform4uivEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniform4uivEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4uivEXT ProgramUniform4uivEXT} */
	public static void glProgramUniform4uivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform4uivEXT(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x3fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix2x3fvEXT ProgramUniformMatrix2x3fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x3fvEXT;
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglProgramUniformMatrix2x3fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x3fvEXT ProgramUniformMatrix2x3fvEXT} */
	public static void glProgramUniformMatrix2x3fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x3fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x2fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix3x2fvEXT ProgramUniformMatrix3x2fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x2fvEXT;
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglProgramUniformMatrix3x2fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x2fvEXT ProgramUniformMatrix3x2fvEXT} */
	public static void glProgramUniformMatrix3x2fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x2fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x4fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix2x4fvEXT ProgramUniformMatrix2x4fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x4fvEXT;
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglProgramUniformMatrix2x4fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x4fvEXT ProgramUniformMatrix2x4fvEXT} */
	public static void glProgramUniformMatrix2x4fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x4fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x2fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix4x2fvEXT ProgramUniformMatrix4x2fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x2fvEXT;
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglProgramUniformMatrix4x2fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x2fvEXT ProgramUniformMatrix4x2fvEXT} */
	public static void glProgramUniformMatrix4x2fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x2fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x4fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix3x4fvEXT ProgramUniformMatrix3x4fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x4fvEXT;
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglProgramUniformMatrix3x4fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x4fvEXT ProgramUniformMatrix3x4fvEXT} */
	public static void glProgramUniformMatrix3x4fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x4fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x3fvEXT ] ---

	/** Unsafe version of {@link #glProgramUniformMatrix4x3fvEXT ProgramUniformMatrix4x3fvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x3fvEXT;
		callIIIZPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglProgramUniformMatrix4x3fvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x3fvEXT ProgramUniformMatrix4x3fvEXT} */
	public static void glProgramUniformMatrix4x3fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x3fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

}