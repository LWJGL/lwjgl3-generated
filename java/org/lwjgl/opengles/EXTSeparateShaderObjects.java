/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

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
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class EXTSeparateShaderObjects {

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

	static { GLES.initialize(); }

	protected EXTSeparateShaderObjects() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glActiveShaderProgramEXT, caps.glBindProgramPipelineEXT, caps.glCreateShaderProgramvEXT, caps.glDeleteProgramPipelinesEXT, 
			caps.glGenProgramPipelinesEXT, caps.glGetProgramPipelineInfoLogEXT, caps.glGetProgramPipelineivEXT, caps.glIsProgramPipelineEXT, 
			caps.glProgramParameteriEXT, caps.glProgramUniform1fEXT, caps.glProgramUniform1fvEXT, caps.glProgramUniform1iEXT, caps.glProgramUniform1ivEXT, 
			caps.glProgramUniform2fEXT, caps.glProgramUniform2fvEXT, caps.glProgramUniform2iEXT, caps.glProgramUniform2ivEXT, caps.glProgramUniform3fEXT, 
			caps.glProgramUniform3fvEXT, caps.glProgramUniform3iEXT, caps.glProgramUniform3ivEXT, caps.glProgramUniform4fEXT, caps.glProgramUniform4fvEXT, 
			caps.glProgramUniform4iEXT, caps.glProgramUniform4ivEXT, caps.glProgramUniformMatrix2fvEXT, caps.glProgramUniformMatrix3fvEXT, 
			caps.glProgramUniformMatrix4fvEXT, caps.glUseProgramStagesEXT, caps.glValidateProgramPipelineEXT, caps.glProgramUniform1uiEXT, 
			caps.glProgramUniform2uiEXT, caps.glProgramUniform3uiEXT, caps.glProgramUniform4uiEXT, caps.glProgramUniform1uivEXT, caps.glProgramUniform2uivEXT, 
			caps.glProgramUniform3uivEXT, caps.glProgramUniform4uivEXT, caps.glProgramUniformMatrix2x3fvEXT, caps.glProgramUniformMatrix3x2fvEXT, 
			caps.glProgramUniformMatrix2x4fvEXT, caps.glProgramUniformMatrix4x2fvEXT, caps.glProgramUniformMatrix3x4fvEXT, caps.glProgramUniformMatrix4x3fvEXT
		);
	}

	// --- [ glActiveShaderProgramEXT ] ---

	public static native void nglActiveShaderProgramEXT(int pipeline, int program);

	public static void glActiveShaderProgramEXT(int pipeline, int program) {
		nglActiveShaderProgramEXT(pipeline, program);
	}

	// --- [ glBindProgramPipelineEXT ] ---

	public static native void nglBindProgramPipelineEXT(int pipeline);

	public static void glBindProgramPipelineEXT(int pipeline) {
		nglBindProgramPipelineEXT(pipeline);
	}

	// --- [ glCreateShaderProgramvEXT ] ---

	public static native int nglCreateShaderProgramvEXT(int type, int count, long strings);

	public static int glCreateShaderProgramvEXT(int type, PointerBuffer strings) {
		return nglCreateShaderProgramvEXT(type, strings.remaining(), memAddress(strings));
	}

	public static int glCreateShaderProgramvEXT(int type, CharSequence... strings) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long stringsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memUTF8, strings);
			int __result = nglCreateShaderProgramvEXT(type, strings.length, stringsAddress);
			org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, strings.length);
			return __result;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	public static int glCreateShaderProgramvEXT(int type, CharSequence string) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long stringsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memUTF8, string);
			int __result = nglCreateShaderProgramvEXT(type, 1, stringsAddress);
			org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, 1);
			return __result;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDeleteProgramPipelinesEXT ] ---

	public static native void nglDeleteProgramPipelinesEXT(int n, long pipelines);

	public static void glDeleteProgramPipelinesEXT(IntBuffer pipelines) {
		nglDeleteProgramPipelinesEXT(pipelines.remaining(), memAddress(pipelines));
	}

	public static void glDeleteProgramPipelinesEXT(int pipeline) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer pipelines = stack.ints(pipeline);
			nglDeleteProgramPipelinesEXT(1, memAddress(pipelines));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenProgramPipelinesEXT ] ---

	public static native void nglGenProgramPipelinesEXT(int n, long pipelines);

	public static void glGenProgramPipelinesEXT(IntBuffer pipelines) {
		nglGenProgramPipelinesEXT(pipelines.remaining(), memAddress(pipelines));
	}

	public static int glGenProgramPipelinesEXT() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer pipelines = stack.callocInt(1);
			nglGenProgramPipelinesEXT(1, memAddress(pipelines));
			return pipelines.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetProgramPipelineInfoLogEXT ] ---

	public static native void nglGetProgramPipelineInfoLogEXT(int pipeline, int bufSize, long length, long infoLog);

	public static void glGetProgramPipelineInfoLogEXT(int pipeline, IntBuffer length, ByteBuffer infoLog) {
		if ( CHECKS )
			checkSafe(length, 1);
		nglGetProgramPipelineInfoLogEXT(pipeline, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
	}

	public static String glGetProgramPipelineInfoLogEXT(int pipeline, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		ByteBuffer infoLog = memAlloc(bufSize);
		try {
			IntBuffer length = stack.ints(0);
			nglGetProgramPipelineInfoLogEXT(pipeline, bufSize, memAddress(length), memAddress(infoLog));
			return memUTF8(infoLog, length.get(0));
		} finally {
			memFree(infoLog);
			stack.setPointer(stackPointer);
		}
	}

	public static String glGetProgramPipelineInfoLogEXT(int pipeline) {
		return glGetProgramPipelineInfoLogEXT(pipeline, glGetProgramPipelineiEXT(pipeline, GLES20.GL_INFO_LOG_LENGTH));
	}

	// --- [ glGetProgramPipelineivEXT ] ---

	public static native void nglGetProgramPipelineivEXT(int pipeline, int pname, long params);

	public static void glGetProgramPipelineivEXT(int pipeline, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetProgramPipelineivEXT(pipeline, pname, memAddress(params));
	}

	public static int glGetProgramPipelineiEXT(int pipeline, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetProgramPipelineivEXT(pipeline, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsProgramPipelineEXT ] ---

	public static native boolean nglIsProgramPipelineEXT(int pipeline);

	public static boolean glIsProgramPipelineEXT(int pipeline) {
		return nglIsProgramPipelineEXT(pipeline);
	}

	// --- [ glProgramParameteriEXT ] ---

	public static native void nglProgramParameteriEXT(int program, int pname, int value);

	public static void glProgramParameteriEXT(int program, int pname, int value) {
		nglProgramParameteriEXT(program, pname, value);
	}

	// --- [ glProgramUniform1fEXT ] ---

	public static native void nglProgramUniform1fEXT(int program, int location, float v0);

	public static void glProgramUniform1fEXT(int program, int location, float v0) {
		nglProgramUniform1fEXT(program, location, v0);
	}

	// --- [ glProgramUniform1fvEXT ] ---

	public static native void nglProgramUniform1fvEXT(int program, int location, int count, long value);

	public static void glProgramUniform1fvEXT(int program, int location, FloatBuffer value) {
		nglProgramUniform1fvEXT(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform1iEXT ] ---

	public static native void nglProgramUniform1iEXT(int program, int location, int v0);

	public static void glProgramUniform1iEXT(int program, int location, int v0) {
		nglProgramUniform1iEXT(program, location, v0);
	}

	// --- [ glProgramUniform1ivEXT ] ---

	public static native void nglProgramUniform1ivEXT(int program, int location, int count, long value);

	public static void glProgramUniform1ivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform1ivEXT(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2fEXT ] ---

	public static native void nglProgramUniform2fEXT(int program, int location, float v0, float v1);

	public static void glProgramUniform2fEXT(int program, int location, float v0, float v1) {
		nglProgramUniform2fEXT(program, location, v0, v1);
	}

	// --- [ glProgramUniform2fvEXT ] ---

	public static native void nglProgramUniform2fvEXT(int program, int location, int count, long value);

	public static void glProgramUniform2fvEXT(int program, int location, FloatBuffer value) {
		nglProgramUniform2fvEXT(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform2iEXT ] ---

	public static native void nglProgramUniform2iEXT(int program, int location, int v0, int v1);

	public static void glProgramUniform2iEXT(int program, int location, int v0, int v1) {
		nglProgramUniform2iEXT(program, location, v0, v1);
	}

	// --- [ glProgramUniform2ivEXT ] ---

	public static native void nglProgramUniform2ivEXT(int program, int location, int count, long value);

	public static void glProgramUniform2ivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform2ivEXT(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3fEXT ] ---

	public static native void nglProgramUniform3fEXT(int program, int location, float v0, float v1, float v2);

	public static void glProgramUniform3fEXT(int program, int location, float v0, float v1, float v2) {
		nglProgramUniform3fEXT(program, location, v0, v1, v2);
	}

	// --- [ glProgramUniform3fvEXT ] ---

	public static native void nglProgramUniform3fvEXT(int program, int location, int count, long value);

	public static void glProgramUniform3fvEXT(int program, int location, FloatBuffer value) {
		nglProgramUniform3fvEXT(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform3iEXT ] ---

	public static native void nglProgramUniform3iEXT(int program, int location, int v0, int v1, int v2);

	public static void glProgramUniform3iEXT(int program, int location, int v0, int v1, int v2) {
		nglProgramUniform3iEXT(program, location, v0, v1, v2);
	}

	// --- [ glProgramUniform3ivEXT ] ---

	public static native void nglProgramUniform3ivEXT(int program, int location, int count, long value);

	public static void glProgramUniform3ivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform3ivEXT(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4fEXT ] ---

	public static native void nglProgramUniform4fEXT(int program, int location, float v0, float v1, float v2, float v3);

	public static void glProgramUniform4fEXT(int program, int location, float v0, float v1, float v2, float v3) {
		nglProgramUniform4fEXT(program, location, v0, v1, v2, v3);
	}

	// --- [ glProgramUniform4fvEXT ] ---

	public static native void nglProgramUniform4fvEXT(int program, int location, int count, long value);

	public static void glProgramUniform4fvEXT(int program, int location, FloatBuffer value) {
		nglProgramUniform4fvEXT(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform4iEXT ] ---

	public static native void nglProgramUniform4iEXT(int program, int location, int v0, int v1, int v2, int v3);

	public static void glProgramUniform4iEXT(int program, int location, int v0, int v1, int v2, int v3) {
		nglProgramUniform4iEXT(program, location, v0, v1, v2, v3);
	}

	// --- [ glProgramUniform4ivEXT ] ---

	public static native void nglProgramUniform4ivEXT(int program, int location, int count, long value);

	public static void glProgramUniform4ivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform4ivEXT(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2fvEXT ] ---

	public static native void nglProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, long value);

	public static void glProgramUniformMatrix2fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2fvEXT(program, location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3fvEXT ] ---

	public static native void nglProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, long value);

	public static void glProgramUniformMatrix3fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3fvEXT(program, location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4fvEXT ] ---

	public static native void nglProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, long value);

	public static void glProgramUniformMatrix4fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4fvEXT(program, location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glUseProgramStagesEXT ] ---

	public static native void nglUseProgramStagesEXT(int pipeline, int stages, int program);

	public static void glUseProgramStagesEXT(int pipeline, int stages, int program) {
		nglUseProgramStagesEXT(pipeline, stages, program);
	}

	// --- [ glValidateProgramPipelineEXT ] ---

	public static native void nglValidateProgramPipelineEXT(int pipeline);

	public static void glValidateProgramPipelineEXT(int pipeline) {
		nglValidateProgramPipelineEXT(pipeline);
	}

	// --- [ glProgramUniform1uiEXT ] ---

	public static native void nglProgramUniform1uiEXT(int program, int location, int v0);

	public static void glProgramUniform1uiEXT(int program, int location, int v0) {
		nglProgramUniform1uiEXT(program, location, v0);
	}

	// --- [ glProgramUniform2uiEXT ] ---

	public static native void nglProgramUniform2uiEXT(int program, int location, int v0, int v1);

	public static void glProgramUniform2uiEXT(int program, int location, int v0, int v1) {
		nglProgramUniform2uiEXT(program, location, v0, v1);
	}

	// --- [ glProgramUniform3uiEXT ] ---

	public static native void nglProgramUniform3uiEXT(int program, int location, int v0, int v1, int v2);

	public static void glProgramUniform3uiEXT(int program, int location, int v0, int v1, int v2) {
		nglProgramUniform3uiEXT(program, location, v0, v1, v2);
	}

	// --- [ glProgramUniform4uiEXT ] ---

	public static native void nglProgramUniform4uiEXT(int program, int location, int v0, int v1, int v2, int v3);

	public static void glProgramUniform4uiEXT(int program, int location, int v0, int v1, int v2, int v3) {
		nglProgramUniform4uiEXT(program, location, v0, v1, v2, v3);
	}

	// --- [ glProgramUniform1uivEXT ] ---

	public static native void nglProgramUniform1uivEXT(int program, int location, int count, long value);

	public static void glProgramUniform1uivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform1uivEXT(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2uivEXT ] ---

	public static native void nglProgramUniform2uivEXT(int program, int location, int count, long value);

	public static void glProgramUniform2uivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform2uivEXT(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3uivEXT ] ---

	public static native void nglProgramUniform3uivEXT(int program, int location, int count, long value);

	public static void glProgramUniform3uivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform3uivEXT(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4uivEXT ] ---

	public static native void nglProgramUniform4uivEXT(int program, int location, int count, long value);

	public static void glProgramUniform4uivEXT(int program, int location, IntBuffer value) {
		nglProgramUniform4uivEXT(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x3fvEXT ] ---

	public static native void nglProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, long value);

	public static void glProgramUniformMatrix2x3fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x3fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x2fvEXT ] ---

	public static native void nglProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, long value);

	public static void glProgramUniformMatrix3x2fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x2fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x4fvEXT ] ---

	public static native void nglProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, long value);

	public static void glProgramUniformMatrix2x4fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x4fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x2fvEXT ] ---

	public static native void nglProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, long value);

	public static void glProgramUniformMatrix4x2fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x2fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x4fvEXT ] ---

	public static native void nglProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, long value);

	public static void glProgramUniformMatrix3x4fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x4fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x3fvEXT ] ---

	public static native void nglProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, long value);

	public static void glProgramUniformMatrix4x3fvEXT(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x3fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	/** Array version of: {@link #glDeleteProgramPipelinesEXT DeleteProgramPipelinesEXT} */
	public static void glDeleteProgramPipelinesEXT(int[] pipelines) {
		long __functionAddress = GLES.getICD().glDeleteProgramPipelinesEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, pipelines.length, pipelines);
	}

	/** Array version of: {@link #glGenProgramPipelinesEXT GenProgramPipelinesEXT} */
	public static void glGenProgramPipelinesEXT(int[] pipelines) {
		long __functionAddress = GLES.getICD().glGenProgramPipelinesEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, pipelines.length, pipelines);
	}

	/** Array version of: {@link #glGetProgramPipelineInfoLogEXT GetProgramPipelineInfoLogEXT} */
	public static void glGetProgramPipelineInfoLogEXT(int pipeline, int[] length, ByteBuffer infoLog) {
		long __functionAddress = GLES.getICD().glGetProgramPipelineInfoLogEXT;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(length, 1);
		}
		callPPV(__functionAddress, pipeline, infoLog.remaining(), length, memAddress(infoLog));
	}

	/** Array version of: {@link #glGetProgramPipelineivEXT GetProgramPipelineivEXT} */
	public static void glGetProgramPipelineivEXT(int pipeline, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glGetProgramPipelineivEXT;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, pipeline, pname, params);
	}

	/** Array version of: {@link #glProgramUniform1fvEXT ProgramUniform1fvEXT} */
	public static void glProgramUniform1fvEXT(int program, int location, float[] value) {
		long __functionAddress = GLES.getICD().glProgramUniform1fvEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform1ivEXT ProgramUniform1ivEXT} */
	public static void glProgramUniform1ivEXT(int program, int location, int[] value) {
		long __functionAddress = GLES.getICD().glProgramUniform1ivEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform2fvEXT ProgramUniform2fvEXT} */
	public static void glProgramUniform2fvEXT(int program, int location, float[] value) {
		long __functionAddress = GLES.getICD().glProgramUniform2fvEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform2ivEXT ProgramUniform2ivEXT} */
	public static void glProgramUniform2ivEXT(int program, int location, int[] value) {
		long __functionAddress = GLES.getICD().glProgramUniform2ivEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform3fvEXT ProgramUniform3fvEXT} */
	public static void glProgramUniform3fvEXT(int program, int location, float[] value) {
		long __functionAddress = GLES.getICD().glProgramUniform3fvEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform3ivEXT ProgramUniform3ivEXT} */
	public static void glProgramUniform3ivEXT(int program, int location, int[] value) {
		long __functionAddress = GLES.getICD().glProgramUniform3ivEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform4fvEXT ProgramUniform4fvEXT} */
	public static void glProgramUniform4fvEXT(int program, int location, float[] value) {
		long __functionAddress = GLES.getICD().glProgramUniform4fvEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glProgramUniform4ivEXT ProgramUniform4ivEXT} */
	public static void glProgramUniform4ivEXT(int program, int location, int[] value) {
		long __functionAddress = GLES.getICD().glProgramUniform4ivEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix2fvEXT ProgramUniformMatrix2fvEXT} */
	public static void glProgramUniformMatrix2fvEXT(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glProgramUniformMatrix2fvEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix3fvEXT ProgramUniformMatrix3fvEXT} */
	public static void glProgramUniformMatrix3fvEXT(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glProgramUniformMatrix3fvEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 9, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix4fvEXT ProgramUniformMatrix4fvEXT} */
	public static void glProgramUniformMatrix4fvEXT(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glProgramUniformMatrix4fvEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 4, transpose, value);
	}

	/** Array version of: {@link #glProgramUniform1uivEXT ProgramUniform1uivEXT} */
	public static void glProgramUniform1uivEXT(int program, int location, int[] value) {
		long __functionAddress = GLES.getICD().glProgramUniform1uivEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform2uivEXT ProgramUniform2uivEXT} */
	public static void glProgramUniform2uivEXT(int program, int location, int[] value) {
		long __functionAddress = GLES.getICD().glProgramUniform2uivEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform3uivEXT ProgramUniform3uivEXT} */
	public static void glProgramUniform3uivEXT(int program, int location, int[] value) {
		long __functionAddress = GLES.getICD().glProgramUniform3uivEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform4uivEXT ProgramUniform4uivEXT} */
	public static void glProgramUniform4uivEXT(int program, int location, int[] value) {
		long __functionAddress = GLES.getICD().glProgramUniform4uivEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix2x3fvEXT ProgramUniformMatrix2x3fvEXT} */
	public static void glProgramUniformMatrix2x3fvEXT(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glProgramUniformMatrix2x3fvEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 6, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix3x2fvEXT ProgramUniformMatrix3x2fvEXT} */
	public static void glProgramUniformMatrix3x2fvEXT(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glProgramUniformMatrix3x2fvEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 6, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix2x4fvEXT ProgramUniformMatrix2x4fvEXT} */
	public static void glProgramUniformMatrix2x4fvEXT(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glProgramUniformMatrix2x4fvEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix4x2fvEXT ProgramUniformMatrix4x2fvEXT} */
	public static void glProgramUniformMatrix4x2fvEXT(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glProgramUniformMatrix4x2fvEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix3x4fvEXT ProgramUniformMatrix3x4fvEXT} */
	public static void glProgramUniformMatrix3x4fvEXT(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glProgramUniformMatrix3x4fvEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 12, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix4x3fvEXT ProgramUniformMatrix4x3fvEXT} */
	public static void glProgramUniformMatrix4x3fvEXT(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glProgramUniformMatrix4x3fvEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 12, transpose, value);
	}

}