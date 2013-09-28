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

/** The core OpenGL 4.1 functionality. */
public final class GL41 {

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_SHADER_COMPILER                  = 0x8DFA,
		GL_SHADER_BINARY_FORMATS            = 0x8DF8,
		GL_NUM_SHADER_BINARY_FORMATS        = 0x8DF9,
		GL_MAX_VERTEX_UNIFORM_VECTORS       = 0x8DFB,
		GL_MAX_VARYING_VECTORS              = 0x8DFC,
		GL_MAX_FRAGMENT_UNIFORM_VECTORS     = 0x8DFD,
		GL_IMPLEMENTATION_COLOR_READ_TYPE   = 0x8B9A,
		GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;

	/** Accepted by the {@code type} parameter of VertexAttribPointer. */
	public static final int
		GL_FIXED = 0x140C;

	/** Accepted by the {@code precisiontype} parameter of GetShaderPrecisionFormat. */
	public static final int
		GL_LOW_FLOAT    = 0x8DF0,
		GL_MEDIUM_FLOAT = 0x8DF1,
		GL_HIGH_FLOAT   = 0x8DF2,
		GL_LOW_INT      = 0x8DF3,
		GL_MEDIUM_INT   = 0x8DF4,
		GL_HIGH_INT     = 0x8DF5;

	/** Accepted by the {@code format} parameter of most commands taking sized internal formats. */
	public static final int
		GL_RGB565 = 0x8D62;

	/** Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv. */
	public static final int
		GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int
		GL_PROGRAM_BINARY_LENGTH = 0x8741;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev. */
	public static final int
		GL_NUM_PROGRAM_BINARY_FORMATS = 0x87FE,
		GL_PROGRAM_BINARY_FORMATS     = 0x87FF;

	/** Accepted by {@code stages} parameter to UseProgramStages. */
	public static final int
		GL_VERTEX_SHADER_BIT          = 0x1,
		GL_FRAGMENT_SHADER_BIT        = 0x2,
		GL_GEOMETRY_SHADER_BIT        = 0x4,
		GL_TESS_CONTROL_SHADER_BIT    = 0x8,
		GL_TESS_EVALUATION_SHADER_BIT = 0x10,
		GL_ALL_SHADER_BITS            = 0xFFFFFFFF;

	/** Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv. */
	public static final int
		GL_PROGRAM_SEPARABLE = 0x8258;

	/** Accepted by {@code type} parameter to GetProgramPipelineiv. */
	public static final int
		GL_ACTIVE_PROGRAM = 0x8259;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_PROGRAM_PIPELINE_BINDING = 0x825A;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev and GetInteger64v. */
	public static final int
		GL_MAX_VIEWPORTS                   = 0x825B,
		GL_VIEWPORT_SUBPIXEL_BITS          = 0x825C,
		GL_VIEWPORT_BOUNDS_RANGE           = 0x825D,
		GL_LAYER_PROVOKING_VERTEX          = 0x825E,
		GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 0x825F;

	/** Returned in the {@code data} parameter from a Get query with a {@code pname} of LAYER_PROVOKING_VERTEX or VIEWPORT_INDEX_PROVOKING_VERTEX. */
	public static final int
		GL_FIRST_VERTEX_CONVENTION = 0x8E4D,
		GL_LAST_VERTEX_CONVENTION  = 0x8E4E,
		GL_PROVOKING_VERTEX        = 0x8E4F,
		GL_UNDEFINED_VERTEX        = 0x8260;

	private GL41() {}

	// --- [ glShaderBinary ] ---

	/** JNI method for {@link #glShaderBinary glShaderBinary} */
	public static native void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glShaderBinary.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Loads pre-compiled shader binaries.
	 *
	 * @param count        the number of shader object handles contained in {@code shaders}
	 * @param shaders      an array of shader handles into which to load pre-compiled shader binaries
	 * @param binaryformat the format of the shader binaries contained in {@code binary}
	 * @param binary       an array of bytes containing pre-compiled binary shader code
	 * @param length       the length of the array whose address is given in binary
	 */
	public static void glShaderBinary(int count, ByteBuffer shaders, int binaryformat, ByteBuffer binary, int length) {
		long __functionAddress = getInstance().glShaderBinary;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(shaders, count << 2);
			checkBuffer(binary, length);
		}
		nglShaderBinary(count, memAddress(shaders), binaryformat, memAddress(binary), length, __functionAddress);
	}

	/** Alternative version of: {@link #glShaderBinary glShaderBinary} */
	public static void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary) {
		long __functionAddress = getInstance().glShaderBinary;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglShaderBinary(shaders.remaining(), memAddress(shaders), binaryformat, memAddress(binary), binary.remaining(), __functionAddress);
	}

	// --- [ glGetShaderPrecisionFormat ] ---

	/** JNI method for {@link #glGetShaderPrecisionFormat glGetShaderPrecisionFormat} */
	public static native void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetShaderPrecisionFormat.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves the range and precision for numeric formats supported by the shader compiler.
	 *
	 * @param shadertype    the type of shader whose precision to query. One of:<p/>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}
	 * @param precisiontype the numeric format whose precision and range to query
	 * @param range         the address of array of two integers into which encodings of the implementation's numeric range are returned
	 * @param precision     the address of an integer into which the numeric precision of the implementation is written
	 */
	public static void glGetShaderPrecisionFormat(int shadertype, int precisiontype, ByteBuffer range, ByteBuffer precision) {
		long __functionAddress = getInstance().glGetShaderPrecisionFormat;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(range, 2 << 2);
			checkBuffer(precision, 1 << 2);
		}
		nglGetShaderPrecisionFormat(shadertype, precisiontype, memAddress(range), memAddress(precision), __functionAddress);
	}

	/** Alternative version of: {@link #glGetShaderPrecisionFormat glGetShaderPrecisionFormat} */
	public static void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision) {
		long __functionAddress = getInstance().glGetShaderPrecisionFormat;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(range, 2);
			checkBuffer(precision, 1);
		}
		nglGetShaderPrecisionFormat(shadertype, precisiontype, memAddress(range), memAddress(precision), __functionAddress);
	}

	/** Single return value version of: {@link #glGetShaderPrecisionFormat glGetShaderPrecisionFormat} */
	public static int glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range) {
		long __functionAddress = getInstance().glGetShaderPrecisionFormat;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(range, 2);
		}
		APIBuffer __buffer = apiBuffer();
		int precision = __buffer.intParam();
		nglGetShaderPrecisionFormat(shadertype, precisiontype, memAddress(range), __buffer.address() + precision, __functionAddress);
		return __buffer.intValue(precision);
	}

	// --- [ glDepthRangef ] ---

	/** JNI method for {@link #glDepthRangef glDepthRangef} */
	public static native void nglDepthRangef(float zNear, float zFar, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/DepthRange.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies mapping of depth values from normalized device coordinates to window coordinates
	 *
	 * @param zNear the mapping of the near clipping plane to window coordinates. The initial value is 0.0f.
	 * @param zFar  the mapping of the far clipping plane to window coordinates. The initial value is 1.0f.
	 */
	public static void glDepthRangef(float zNear, float zFar) {
		long __functionAddress = getInstance().glDepthRangef;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDepthRangef(zNear, zFar, __functionAddress);
	}

	// --- [ glClearDepthf ] ---

	/** JNI method for {@link #glClearDepthf glClearDepthf} */
	public static native void nglClearDepthf(float depth, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glClearDepthf.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the clear value for the depth buffer
	 *
	 * @param depth the depth value used when the depth buffer is cleared. The initial value is 1.0f.
	 */
	public static void glClearDepthf(float depth) {
		long __functionAddress = getInstance().glClearDepthf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClearDepthf(depth, __functionAddress);
	}

	// --- [ glGetProgramBinary ] ---

	/** JNI method for {@link #glGetProgramBinary glGetProgramBinary} */
	public static native void nglGetProgramBinary(int program, int bufSize, long length, long binaryFormat, long binary, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetProgramBinary.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns a binary representation of a program object's compiled and linked executable source.
	 *
	 * @param program      the name of a program object whose binary representation to retrieve
	 * @param bufSize      the size of the buffer whose address is given by {@code binary}
	 * @param length       the address of a variable to receive the number of bytes written into {@code binary}
	 * @param binaryFormat a variable to receive a token indicating the format of the binary data returned by the GL
	 * @param binary       an array into which the GL will return {@code program}'s binary representation
	 */
	public static void glGetProgramBinary(int program, int bufSize, ByteBuffer length, ByteBuffer binaryFormat, ByteBuffer binary) {
		long __functionAddress = getInstance().glGetProgramBinary;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(binary, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
			checkBuffer(binaryFormat, 1 << 2);
		}
		nglGetProgramBinary(program, bufSize, memAddressSafe(length), memAddress(binaryFormat), memAddress(binary), __functionAddress);
	}

	/** Alternative version of: {@link #glGetProgramBinary glGetProgramBinary} */
	public static void glGetProgramBinary(int program, IntBuffer length, IntBuffer binaryFormat, ByteBuffer binary) {
		long __functionAddress = getInstance().glGetProgramBinary;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(binaryFormat, 1);
		}
		nglGetProgramBinary(program, binary.remaining(), memAddressSafe(length), memAddress(binaryFormat), memAddress(binary), __functionAddress);
	}

	/** Buffer return version of: {@link #glGetProgramBinary glGetProgramBinary} */
	public static ByteBuffer glGetProgramBinary(int program, int bufSize, IntBuffer binaryFormat) {
		long __functionAddress = getInstance().glGetProgramBinary;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(binaryFormat, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int binary = __buffer.bufferParam(bufSize);
		nglGetProgramBinary(program, bufSize, __buffer.address() + length, memAddress(binaryFormat), __buffer.address() + binary, __functionAddress);
		return memByteBuffer(__buffer.address() + binary, __buffer.intValue(length));
	}

	/** Buffer return (w/ implicit max length) version of: {@link #glGetProgramBinary glGetProgramBinary} */
	public static ByteBuffer glGetProgramBinary(int program, IntBuffer binaryFormat) {
		long __functionAddress = getInstance().glGetProgramBinary;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(binaryFormat, 1);
		}
		int bufSize = GL20.glGetProgrami(program, GL_PROGRAM_BINARY_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int binary = __buffer.bufferParam(bufSize);
		nglGetProgramBinary(program, bufSize, __buffer.address() + length, memAddress(binaryFormat), __buffer.address() + binary, __functionAddress);
		return memByteBuffer(__buffer.address() + binary, __buffer.intValue(length));
	}

	// --- [ glProgramBinary ] ---

	/** JNI method for {@link #glProgramBinary glProgramBinary} */
	public static native void nglProgramBinary(int program, int binaryFormat, long binary, int length, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramBinary.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Loads a program object with a program binary.
	 *
	 * @param program      the name of a program object into which to load a program binary
	 * @param binaryFormat the format of the binary data in binary
	 * @param binary       an array containing the binary to be loaded into {@code program}
	 * @param length       the number of bytes contained in {@code binary}
	 */
	public static void glProgramBinary(int program, int binaryFormat, ByteBuffer binary, int length) {
		long __functionAddress = getInstance().glProgramBinary;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(binary, length);
		}
		nglProgramBinary(program, binaryFormat, memAddress(binary), length, __functionAddress);
	}

	/** Alternative version of: {@link #glProgramBinary glProgramBinary} */
	public static void glProgramBinary(int program, int binaryFormat, ByteBuffer binary) {
		long __functionAddress = getInstance().glProgramBinary;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramBinary(program, binaryFormat, memAddress(binary), binary.remaining(), __functionAddress);
	}

	// --- [ glProgramParameteri ] ---

	/** JNI method for {@link #glProgramParameteri glProgramParameteri} */
	public static native void nglProgramParameteri(int program, int pname, int value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the integer value of a program object parameter.
	 *
	 * @param program the name of a program object whose parameter to modify
	 * @param pname   the name of the parameter to modify. One of:<p/>{@link #GL_PROGRAM_BINARY_RETRIEVABLE_HINT PROGRAM_BINARY_RETRIEVABLE_HINT}, {@link #GL_PROGRAM_SEPARABLE PROGRAM_SEPARABLE}
	 * @param value   the new value of the parameter specified by {@code pname} for {@code program}
	 */
	public static void glProgramParameteri(int program, int pname, int value) {
		long __functionAddress = getInstance().glProgramParameteri;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramParameteri(program, pname, value, __functionAddress);
	}

	// --- [ glUseProgramStages ] ---

	/** JNI method for {@link #glUseProgramStages glUseProgramStages} */
	public static native void nglUseProgramStages(int pipeline, int stages, int program, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUseProgramStages.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds stages of a program object to a program pipeline.
	 *
	 * @param pipeline the program pipeline object to which to bind stages from {@code program}
	 * @param stages   a set of program stages to bind to the program pipeline object
	 * @param program  the program object containing the shader executables to use in {@code pipeline}
	 */
	public static void glUseProgramStages(int pipeline, int stages, int program) {
		long __functionAddress = getInstance().glUseProgramStages;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUseProgramStages(pipeline, stages, program, __functionAddress);
	}

	// --- [ glActiveShaderProgram ] ---

	/** JNI method for {@link #glActiveShaderProgram glActiveShaderProgram} */
	public static native void nglActiveShaderProgram(int pipeline, int program, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glActiveShaderProgram.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the active program object for a program pipeline object.
	 *
	 * @param pipeline the program pipeline object to set the active program object for
	 * @param program  the program object to set as the active program pipeline object {@code pipeline}
	 */
	public static void glActiveShaderProgram(int pipeline, int program) {
		long __functionAddress = getInstance().glActiveShaderProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglActiveShaderProgram(pipeline, program, __functionAddress);
	}

	// --- [ glCreateShaderProgramv ] ---

	/** JNI method for {@link #glCreateShaderProgram(int, int, ByteBuffer) glCreateShaderProgram} */
	public static native int nglCreateShaderProgramv(int type, int count, long strings, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCreateShaderProgram.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Creates a stand-alone program from an array of null-terminated source code strings.
	 * <p/>
	 * {@code glCreateShaderProgram} is equivalent (assuming no errors are generated) to:
	 * <pre>{@code
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
	 * }}</pre>
	 * The program object created by glCreateShaderProgram has its GL_PROGRAM_SEPARABLE status set to GL_TRUE.
	 *
	 * @param type    the type of shader to create
	 * @param count   the number of source code strings in the array {@code strings}
	 * @param strings an array of pointers to source code strings from which to create the program object
	 */
	public static int glCreateShaderProgram(int type, int count, ByteBuffer strings) {
		long __functionAddress = getInstance().glCreateShaderProgramv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglCreateShaderProgramv(type, count, memAddress(strings), __functionAddress);
	}

	/** Alternative version of: {@link #glCreateShaderProgram(int, int, ByteBuffer) glCreateShaderProgram} */
	public static int glCreateShaderProgram(int type, int count, PointerBuffer strings) {
		long __functionAddress = getInstance().glCreateShaderProgramv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglCreateShaderProgramv(type, count, memAddress(strings), __functionAddress);
	}

	/** Array version of: {@link #glCreateShaderProgram(int, int, ByteBuffer) glCreateShaderProgram} */
	public static int glCreateShaderProgram(int type, CharSequence... strings) {
		long __functionAddress = getInstance().glCreateShaderProgramv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int stringsAddress = __buffer.bufferParam(strings.length << POINTER_SHIFT);
		ByteBuffer[] stringsBuffers = new ByteBuffer[strings.length];
		for ( int i = 0; i < strings.length; i++ )
			__buffer.pointerParam(stringsAddress, i, memAddress(stringsBuffers[i] = memEncodeUTF8(strings[i], true)));
		return nglCreateShaderProgramv(type, strings.length, __buffer.address() + stringsAddress, __functionAddress);
	}

	/** Single string version of: {@link #glCreateShaderProgram(int, int, ByteBuffer) glCreateShaderProgram} */
	public static int glCreateShaderProgram(int type, CharSequence string) {
		long __functionAddress = getInstance().glCreateShaderProgramv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		ByteBuffer stringBuffers = memEncodeUTF8(string, true);
		int stringsAddress = __buffer.pointerParam(memAddress(stringBuffers));
		return nglCreateShaderProgramv(type, 1, __buffer.address() + stringsAddress, __functionAddress);
	}

	// --- [ glBindProgramPipeline ] ---

	/** JNI method for {@link #glBindProgramPipeline glBindProgramPipeline} */
	public static native void nglBindProgramPipeline(int pipeline, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindProgramPipeline.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds a program pipeline to the current context.
	 *
	 * @param pipeline the name of the pipeline object to bind to the context
	 */
	public static void glBindProgramPipeline(int pipeline) {
		long __functionAddress = getInstance().glBindProgramPipeline;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindProgramPipeline(pipeline, __functionAddress);
	}

	// --- [ glDeleteProgramPipelines ] ---

	/** JNI method for {@link #glDeleteProgramPipelines glDeleteProgramPipelines} */
	public static native void nglDeleteProgramPipelines(int n, long pipelines, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDeleteProgramPipelines.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Deletes program pipeline objects.
	 *
	 * @param n         the number of program pipeline objects to delete
	 * @param pipelines an array of names of program pipeline objects to delete
	 */
	public static void glDeleteProgramPipelines(int n, ByteBuffer pipelines) {
		long __functionAddress = getInstance().glDeleteProgramPipelines;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pipelines, n << 2);
		}
		nglDeleteProgramPipelines(n, memAddress(pipelines), __functionAddress);
	}

	/** Alternative version of: {@link #glDeleteProgramPipelines glDeleteProgramPipelines} */
	public static void glDeleteProgramPipelines(IntBuffer pipelines) {
		long __functionAddress = getInstance().glDeleteProgramPipelines;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDeleteProgramPipelines(pipelines.remaining(), memAddress(pipelines), __functionAddress);
	}

	/** Single value version of: {@link #glDeleteProgramPipelines glDeleteProgramPipelines} */
	public static void glDeleteProgramPipelines(int pipeline) {
		long __functionAddress = getInstance().glDeleteProgramPipelines;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int pipelines = __buffer.intParam(pipeline);
		nglDeleteProgramPipelines(1, __buffer.address() + pipelines, __functionAddress);
	}

	// --- [ glGenProgramPipelines ] ---

	/** JNI method for {@link #glGenProgramPipelines glGenProgramPipelines} */
	public static native void nglGenProgramPipelines(int n, long pipelines, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGenProgramPipelines.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Reserves program pipeline object names.
	 *
	 * @param n         the number of program pipeline object names to reserve
	 * @param pipelines an array of into which the reserved names will be written
	 */
	public static void glGenProgramPipelines(int n, ByteBuffer pipelines) {
		long __functionAddress = getInstance().glGenProgramPipelines;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pipelines, n << 2);
		}
		nglGenProgramPipelines(n, memAddress(pipelines), __functionAddress);
	}

	/** Alternative version of: {@link #glGenProgramPipelines glGenProgramPipelines} */
	public static void glGenProgramPipelines(IntBuffer pipelines) {
		long __functionAddress = getInstance().glGenProgramPipelines;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGenProgramPipelines(pipelines.remaining(), memAddress(pipelines), __functionAddress);
	}

	/** Single return value version of: {@link #glGenProgramPipelines glGenProgramPipelines} */
	public static int glGenProgramPipelines() {
		long __functionAddress = getInstance().glGenProgramPipelines;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int pipelines = __buffer.intParam();
		nglGenProgramPipelines(1, __buffer.address() + pipelines, __functionAddress);
		return __buffer.intValue(pipelines);
	}

	// --- [ glIsProgramPipeline ] ---

	/** JNI method for {@link #glIsProgramPipeline glIsProgramPipeline} */
	public static native boolean nglIsProgramPipeline(int pipeline, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glIsProgramPipeline.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Determines if a name corresponds to a program pipeline object.
	 *
	 * @param pipeline a value that may be the name of a program pipeline object
	 */
	public static boolean glIsProgramPipeline(int pipeline) {
		long __functionAddress = getInstance().glIsProgramPipeline;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsProgramPipeline(pipeline, __functionAddress);
	}

	// --- [ glGetProgramPipelineiv ] ---

	/** JNI method for {@link #glGetProgramPipelinei(int, int, ByteBuffer) glGetProgramPipelinei} */
	public static native void nglGetProgramPipelineiv(int pipeline, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetProgramPipeline.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves properties of a program pipeline object.
	 *
	 * @param pipeline the name of a program pipeline object whose parameter retrieve
	 * @param pname    the name of the parameter to retrieve. One of:<p/>{@link #GL_ACTIVE_PROGRAM ACTIVE_PROGRAM}, {@link GL20#GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}, {@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param params   a variable into which will be written the value or values of {@code pname} for {@code pipeline}
	 */
	public static void glGetProgramPipelinei(int pipeline, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetProgramPipelineiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetProgramPipelineiv(pipeline, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetProgramPipelinei(int, int, ByteBuffer) glGetProgramPipelinei} */
	public static void glGetProgramPipeline(int pipeline, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetProgramPipelineiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetProgramPipelineiv(pipeline, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetProgramPipelinei(int, int, ByteBuffer) glGetProgramPipelinei} */
	public static int glGetProgramPipelinei(int pipeline, int pname) {
		long __functionAddress = getInstance().glGetProgramPipelineiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetProgramPipelineiv(pipeline, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glProgramUniform1i ] ---

	/** JNI method for {@link #glProgramUniform1i glProgramUniform1i} */
	public static native void nglProgramUniform1i(int program, int location, int x, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of an int uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1i(int program, int location, int x) {
		long __functionAddress = getInstance().glProgramUniform1i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1i(program, location, x, __functionAddress);
	}

	// --- [ glProgramUniform2i ] ---

	/** JNI method for {@link #glProgramUniform2i glProgramUniform2i} */
	public static native void nglProgramUniform2i(int program, int location, int x, int y, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of an ivec2 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2i(int program, int location, int x, int y) {
		long __functionAddress = getInstance().glProgramUniform2i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2i(program, location, x, y, __functionAddress);
	}

	// --- [ glProgramUniform3i ] ---

	/** JNI method for {@link #glProgramUniform3i glProgramUniform3i} */
	public static native void nglProgramUniform3i(int program, int location, int x, int y, int z, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of an ivec3 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glProgramUniform3i(int program, int location, int x, int y, int z) {
		long __functionAddress = getInstance().glProgramUniform3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3i(program, location, x, y, z, __functionAddress);
	}

	// --- [ glProgramUniform4i ] ---

	/** JNI method for {@link #glProgramUniform4i glProgramUniform4i} */
	public static native void nglProgramUniform4i(int program, int location, int x, int y, int z, int w, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
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
		long __functionAddress = getInstance().glProgramUniform4i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4i(program, location, x, y, z, w, __functionAddress);
	}

	// --- [ glProgramUniform1ui ] ---

	/** JNI method for {@link #glProgramUniform1ui glProgramUniform1ui} */
	public static native void nglProgramUniform1ui(int program, int location, int x, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a uint uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1ui(int program, int location, int x) {
		long __functionAddress = getInstance().glProgramUniform1ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1ui(program, location, x, __functionAddress);
	}

	// --- [ glProgramUniform2ui ] ---

	/** JNI method for {@link #glProgramUniform2ui glProgramUniform2ui} */
	public static native void nglProgramUniform2ui(int program, int location, int x, int y, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a uvec2 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2ui(int program, int location, int x, int y) {
		long __functionAddress = getInstance().glProgramUniform2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2ui(program, location, x, y, __functionAddress);
	}

	// --- [ glProgramUniform3ui ] ---

	/** JNI method for {@link #glProgramUniform3ui glProgramUniform3ui} */
	public static native void nglProgramUniform3ui(int program, int location, int x, int y, int z, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a uvec3 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glProgramUniform3ui(int program, int location, int x, int y, int z) {
		long __functionAddress = getInstance().glProgramUniform3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3ui(program, location, x, y, z, __functionAddress);
	}

	// --- [ glProgramUniform4ui ] ---

	/** JNI method for {@link #glProgramUniform4ui glProgramUniform4ui} */
	public static native void nglProgramUniform4ui(int program, int location, int x, int y, int z, int w, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
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
		long __functionAddress = getInstance().glProgramUniform4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4ui(program, location, x, y, z, w, __functionAddress);
	}

	// --- [ glProgramUniform1f ] ---

	/** JNI method for {@link #glProgramUniform1f glProgramUniform1f} */
	public static native void nglProgramUniform1f(int program, int location, float x, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a float uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1f(int program, int location, float x) {
		long __functionAddress = getInstance().glProgramUniform1f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1f(program, location, x, __functionAddress);
	}

	// --- [ glProgramUniform2f ] ---

	/** JNI method for {@link #glProgramUniform2f glProgramUniform2f} */
	public static native void nglProgramUniform2f(int program, int location, float x, float y, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a vec2 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2f(int program, int location, float x, float y) {
		long __functionAddress = getInstance().glProgramUniform2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2f(program, location, x, y, __functionAddress);
	}

	// --- [ glProgramUniform3f ] ---

	/** JNI method for {@link #glProgramUniform3f glProgramUniform3f} */
	public static native void nglProgramUniform3f(int program, int location, float x, float y, float z, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a vec3 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glProgramUniform3f(int program, int location, float x, float y, float z) {
		long __functionAddress = getInstance().glProgramUniform3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3f(program, location, x, y, z, __functionAddress);
	}

	// --- [ glProgramUniform4f ] ---

	/** JNI method for {@link #glProgramUniform4f glProgramUniform4f} */
	public static native void nglProgramUniform4f(int program, int location, float x, float y, float z, float w, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
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
		long __functionAddress = getInstance().glProgramUniform4f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4f(program, location, x, y, z, w, __functionAddress);
	}

	// --- [ glProgramUniform1d ] ---

	/** JNI method for {@link #glProgramUniform1d glProgramUniform1d} */
	public static native void nglProgramUniform1d(int program, int location, double x, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a double uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1d(int program, int location, double x) {
		long __functionAddress = getInstance().glProgramUniform1d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1d(program, location, x, __functionAddress);
	}

	// --- [ glProgramUniform2d ] ---

	/** JNI method for {@link #glProgramUniform2d glProgramUniform2d} */
	public static native void nglProgramUniform2d(int program, int location, double x, double y, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a dvec2 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2d(int program, int location, double x, double y) {
		long __functionAddress = getInstance().glProgramUniform2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2d(program, location, x, y, __functionAddress);
	}

	// --- [ glProgramUniform3d ] ---

	/** JNI method for {@link #glProgramUniform3d glProgramUniform3d} */
	public static native void nglProgramUniform3d(int program, int location, double x, double y, double z, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a dvec3 uniform variable for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glProgramUniform3d(int program, int location, double x, double y, double z) {
		long __functionAddress = getInstance().glProgramUniform3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3d(program, location, x, y, z, __functionAddress);
	}

	// --- [ glProgramUniform4d ] ---

	/** JNI method for {@link #glProgramUniform4d glProgramUniform4d} */
	public static native void nglProgramUniform4d(int program, int location, double x, double y, double z, double w, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
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
		long __functionAddress = getInstance().glProgramUniform4d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4d(program, location, x, y, z, w, __functionAddress);
	}

	// --- [ glProgramUniform1iv ] ---

	/** JNI method for {@link #glProgramUniform1i(int, int, int, ByteBuffer) glProgramUniform1i} */
	public static native void nglProgramUniform1iv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single float uniform variable or a float uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform1i(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform1iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, count << 2);
		}
		nglProgramUniform1iv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform1i(int, int, int, ByteBuffer) glProgramUniform1i} */
	public static void glProgramUniform1(int program, int location, IntBuffer value) {
		long __functionAddress = getInstance().glProgramUniform1iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1iv(program, location, value.remaining(), memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform2iv ] ---

	/** JNI method for {@link #glProgramUniform2i(int, int, int, ByteBuffer) glProgramUniform2i} */
	public static native void nglProgramUniform2iv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single ivec2 uniform variable or a ivec2 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform2i(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 1) << 2);
		}
		nglProgramUniform2iv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform2i(int, int, int, ByteBuffer) glProgramUniform2i} */
	public static void glProgramUniform2(int program, int location, IntBuffer value) {
		long __functionAddress = getInstance().glProgramUniform2iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2iv(program, location, value.remaining() >> 1, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform3iv ] ---

	/** JNI method for {@link #glProgramUniform3i(int, int, int, ByteBuffer) glProgramUniform3i} */
	public static native void nglProgramUniform3iv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single ivec3 uniform variable or a ivec3 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform3i(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 9) << 2);
		}
		nglProgramUniform3iv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform3i(int, int, int, ByteBuffer) glProgramUniform3i} */
	public static void glProgramUniform3(int program, int location, IntBuffer value) {
		long __functionAddress = getInstance().glProgramUniform3iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3iv(program, location, value.remaining() / 9, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform4iv ] ---

	/** JNI method for {@link #glProgramUniform4i(int, int, int, ByteBuffer) glProgramUniform4i} */
	public static native void nglProgramUniform4iv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single ivec4 uniform variable or a ivec4 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform4i(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 2) << 2);
		}
		nglProgramUniform4iv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform4i(int, int, int, ByteBuffer) glProgramUniform4i} */
	public static void glProgramUniform4(int program, int location, IntBuffer value) {
		long __functionAddress = getInstance().glProgramUniform4iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4iv(program, location, value.remaining() >> 2, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform1uiv ] ---

	/** JNI method for {@link #glProgramUniform1ui(int, int, int, ByteBuffer) glProgramUniform1ui} */
	public static native void nglProgramUniform1uiv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single uint uniform variable or a uint uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform1ui(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform1uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, count << 2);
		}
		nglProgramUniform1uiv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform1ui(int, int, int, ByteBuffer) glProgramUniform1ui} */
	public static void glProgramUniform1u(int program, int location, IntBuffer value) {
		long __functionAddress = getInstance().glProgramUniform1uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1uiv(program, location, value.remaining(), memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform2uiv ] ---

	/** JNI method for {@link #glProgramUniform2ui(int, int, int, ByteBuffer) glProgramUniform2ui} */
	public static native void nglProgramUniform2uiv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single uvec2 uniform variable or a uvec2 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform2ui(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform2uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 1) << 2);
		}
		nglProgramUniform2uiv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform2ui(int, int, int, ByteBuffer) glProgramUniform2ui} */
	public static void glProgramUniform2u(int program, int location, IntBuffer value) {
		long __functionAddress = getInstance().glProgramUniform2uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2uiv(program, location, value.remaining() >> 1, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform3uiv ] ---

	/** JNI method for {@link #glProgramUniform3ui(int, int, int, ByteBuffer) glProgramUniform3ui} */
	public static native void nglProgramUniform3uiv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single uvec3 uniform variable or a uvec3 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform3ui(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 9) << 2);
		}
		nglProgramUniform3uiv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform3ui(int, int, int, ByteBuffer) glProgramUniform3ui} */
	public static void glProgramUniform3u(int program, int location, IntBuffer value) {
		long __functionAddress = getInstance().glProgramUniform3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3uiv(program, location, value.remaining() / 9, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform4uiv ] ---

	/** JNI method for {@link #glProgramUniform4ui(int, int, int, ByteBuffer) glProgramUniform4ui} */
	public static native void nglProgramUniform4uiv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single uvec4 uniform variable or a uvec4 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform4ui(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 2) << 2);
		}
		nglProgramUniform4uiv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform4ui(int, int, int, ByteBuffer) glProgramUniform4ui} */
	public static void glProgramUniform4u(int program, int location, IntBuffer value) {
		long __functionAddress = getInstance().glProgramUniform4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4uiv(program, location, value.remaining() >> 2, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform1fv ] ---

	/** JNI method for {@link #glProgramUniform1f(int, int, int, ByteBuffer) glProgramUniform1f} */
	public static native void nglProgramUniform1fv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single float uniform variable or a float uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform1f(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform1fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, count << 2);
		}
		nglProgramUniform1fv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform1f(int, int, int, ByteBuffer) glProgramUniform1f} */
	public static void glProgramUniform1(int program, int location, FloatBuffer value) {
		long __functionAddress = getInstance().glProgramUniform1fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1fv(program, location, value.remaining(), memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform2fv ] ---

	/** JNI method for {@link #glProgramUniform2f(int, int, int, ByteBuffer) glProgramUniform2f} */
	public static native void nglProgramUniform2fv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single vec2 uniform variable or a vec2 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform2f(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 1) << 2);
		}
		nglProgramUniform2fv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform2f(int, int, int, ByteBuffer) glProgramUniform2f} */
	public static void glProgramUniform2(int program, int location, FloatBuffer value) {
		long __functionAddress = getInstance().glProgramUniform2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2fv(program, location, value.remaining() >> 1, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform3fv ] ---

	/** JNI method for {@link #glProgramUniform3f(int, int, int, ByteBuffer) glProgramUniform3f} */
	public static native void nglProgramUniform3fv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single vec3 uniform variable or a vec3 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform3f(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 9) << 2);
		}
		nglProgramUniform3fv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform3f(int, int, int, ByteBuffer) glProgramUniform3f} */
	public static void glProgramUniform3(int program, int location, FloatBuffer value) {
		long __functionAddress = getInstance().glProgramUniform3fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3fv(program, location, value.remaining() / 9, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform4fv ] ---

	/** JNI method for {@link #glProgramUniform4f(int, int, int, ByteBuffer) glProgramUniform4f} */
	public static native void nglProgramUniform4fv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single vec4 uniform variable or a vec4 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform4f(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 2) << 2);
		}
		nglProgramUniform4fv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform4f(int, int, int, ByteBuffer) glProgramUniform4f} */
	public static void glProgramUniform4(int program, int location, FloatBuffer value) {
		long __functionAddress = getInstance().glProgramUniform4fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4fv(program, location, value.remaining() >> 2, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform1dv ] ---

	/** JNI method for {@link #glProgramUniform1d(int, int, int, ByteBuffer) glProgramUniform1d} */
	public static native void nglProgramUniform1dv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single double uniform variable or a double uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform1d(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform1dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, count << 3);
		}
		nglProgramUniform1dv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform1d(int, int, int, ByteBuffer) glProgramUniform1d} */
	public static void glProgramUniform1(int program, int location, DoubleBuffer value) {
		long __functionAddress = getInstance().glProgramUniform1dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1dv(program, location, value.remaining(), memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform2dv ] ---

	/** JNI method for {@link #glProgramUniform2d(int, int, int, ByteBuffer) glProgramUniform2d} */
	public static native void nglProgramUniform2dv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform2d(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 1) << 3);
		}
		nglProgramUniform2dv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform2d(int, int, int, ByteBuffer) glProgramUniform2d} */
	public static void glProgramUniform2(int program, int location, DoubleBuffer value) {
		long __functionAddress = getInstance().glProgramUniform2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2dv(program, location, value.remaining() >> 1, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform3dv ] ---

	/** JNI method for {@link #glProgramUniform3d(int, int, int, ByteBuffer) glProgramUniform3d} */
	public static native void nglProgramUniform3dv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform3d(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 9) << 3);
		}
		nglProgramUniform3dv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform3d(int, int, int, ByteBuffer) glProgramUniform3d} */
	public static void glProgramUniform3(int program, int location, DoubleBuffer value) {
		long __functionAddress = getInstance().glProgramUniform3dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3dv(program, location, value.remaining() / 9, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniform4dv ] ---

	/** JNI method for {@link #glProgramUniform4d(int, int, int, ByteBuffer) glProgramUniform4d} */
	public static native void nglProgramUniform4dv(int program, int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dvec4 uniform variable or a dvec4 uniform variable array for a specified program object.
	 *
	 * @param program  the handle of the program containing the uniform variable to be modified
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform4d(int program, int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniform4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 2) << 3);
		}
		nglProgramUniform4dv(program, location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniform4d(int, int, int, ByteBuffer) glProgramUniform4d} */
	public static void glProgramUniform4(int program, int location, DoubleBuffer value) {
		long __functionAddress = getInstance().glProgramUniform4dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4dv(program, location, value.remaining() >> 2, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix2fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix2f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix2f} */
	public static native void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat2 uniform variable or a mat2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2f(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 2) << 2);
		}
		nglProgramUniformMatrix2fv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix2f} */
	public static void glProgramUniformMatrix2(int program, int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix2fv(program, location, value.remaining() >> 2, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix3fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix3f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix3f} */
	public static native void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat3 uniform variable or a mat3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3f(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 9) << 2);
		}
		nglProgramUniformMatrix3fv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix3f} */
	public static void glProgramUniformMatrix3(int program, int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix3fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix3fv(program, location, value.remaining() / 9, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix4fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix4f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix4f} */
	public static native void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat4 uniform variable or a mat4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4f(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 4) << 2);
		}
		nglProgramUniformMatrix4fv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix4f} */
	public static void glProgramUniformMatrix4(int program, int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix4fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix4fv(program, location, value.remaining() >> 4, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix2dv ] ---

	/** JNI method for {@link #glProgramUniformMatrix2d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix2d} */
	public static native void nglProgramUniformMatrix2dv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat2 uniform variable or a dmat2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2d(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 2) << 3);
		}
		nglProgramUniformMatrix2dv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix2d} */
	public static void glProgramUniformMatrix2(int program, int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix2dv(program, location, value.remaining() >> 2, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix3dv ] ---

	/** JNI method for {@link #glProgramUniformMatrix3d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix3d} */
	public static native void nglProgramUniformMatrix3dv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat3 uniform variable or a dmat3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3d(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 9) << 3);
		}
		nglProgramUniformMatrix3dv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix3d} */
	public static void glProgramUniformMatrix3(int program, int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix3dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix3dv(program, location, value.remaining() / 9, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix4dv ] ---

	/** JNI method for {@link #glProgramUniformMatrix4d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix4d} */
	public static native void nglProgramUniformMatrix4dv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat4 uniform variable or a dmat4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4d(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 4) << 3);
		}
		nglProgramUniformMatrix4dv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix4d} */
	public static void glProgramUniformMatrix4(int program, int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix4dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix4dv(program, location, value.remaining() >> 4, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix2x3fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix2x3f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix2x3f} */
	public static native void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat2x3 uniform variable or a mat2x3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x3f(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix2x3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 6) << 2);
		}
		nglProgramUniformMatrix2x3fv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x3f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix2x3f} */
	public static void glProgramUniformMatrix2x3(int program, int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix2x3fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix2x3fv(program, location, value.remaining() / 6, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix3x2fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix3x2f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix3x2f} */
	public static native void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat3x2 uniform variable or a mat3x2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x2f(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix3x2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 6) << 2);
		}
		nglProgramUniformMatrix3x2fv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x2f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix3x2f} */
	public static void glProgramUniformMatrix3x2(int program, int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix3x2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix3x2fv(program, location, value.remaining() / 6, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix2x4fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix2x4f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix2x4f} */
	public static native void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat2x4 uniform variable or a mat2x4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x4f(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix2x4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 3) << 2);
		}
		nglProgramUniformMatrix2x4fv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x4f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix2x4f} */
	public static void glProgramUniformMatrix2x4(int program, int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix2x4fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix2x4fv(program, location, value.remaining() >> 3, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix4x2fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix4x2f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix4x2f} */
	public static native void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat4x2 uniform variable or a mat4x2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x2f(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix4x2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 3) << 2);
		}
		nglProgramUniformMatrix4x2fv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x2f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix4x2f} */
	public static void glProgramUniformMatrix4x2(int program, int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix4x2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix4x2fv(program, location, value.remaining() >> 3, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix3x4fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix3x4f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix3x4f} */
	public static native void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat3x4 uniform variable or a mat3x4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x4f(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix3x4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 12) << 2);
		}
		nglProgramUniformMatrix3x4fv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x4f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix3x4f} */
	public static void glProgramUniformMatrix3x4(int program, int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix3x4fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix3x4fv(program, location, value.remaining() / 12, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix4x3fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix4x3f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix4x3f} */
	public static native void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat4x3 uniform variable or a mat4x3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x3f(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix4x3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 12) << 2);
		}
		nglProgramUniformMatrix4x3fv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x3f(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix4x3f} */
	public static void glProgramUniformMatrix4x3(int program, int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix4x3fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix4x3fv(program, location, value.remaining() / 12, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix2x3dv ] ---

	/** JNI method for {@link #glProgramUniformMatrix2x3d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix2x3d} */
	public static native void nglProgramUniformMatrix2x3dv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat2x3 uniform variable or a dmat2x3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x3d(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix2x3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 6) << 3);
		}
		nglProgramUniformMatrix2x3dv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x3d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix2x3d} */
	public static void glProgramUniformMatrix2x3(int program, int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix2x3dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix2x3dv(program, location, value.remaining() / 6, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix3x2dv ] ---

	/** JNI method for {@link #glProgramUniformMatrix3x2d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix3x2d} */
	public static native void nglProgramUniformMatrix3x2dv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat3x2 uniform variable or a dmat3x2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x2d(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix3x2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 6) << 3);
		}
		nglProgramUniformMatrix3x2dv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x2d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix3x2d} */
	public static void glProgramUniformMatrix3x2(int program, int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix3x2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix3x2dv(program, location, value.remaining() / 6, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix2x4dv ] ---

	/** JNI method for {@link #glProgramUniformMatrix2x4d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix2x4d} */
	public static native void nglProgramUniformMatrix2x4dv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat2x4 uniform variable or a dmat2x4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x4d(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix2x4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 3) << 3);
		}
		nglProgramUniformMatrix2x4dv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x4d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix2x4d} */
	public static void glProgramUniformMatrix2x4(int program, int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix2x4dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix2x4dv(program, location, value.remaining() >> 3, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix4x2dv ] ---

	/** JNI method for {@link #glProgramUniformMatrix4x2d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix4x2d} */
	public static native void nglProgramUniformMatrix4x2dv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x2d(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix4x2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 3) << 3);
		}
		nglProgramUniformMatrix4x2dv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x2d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix4x2d} */
	public static void glProgramUniformMatrix4x2(int program, int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix4x2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix4x2dv(program, location, value.remaining() >> 3, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix3x4dv ] ---

	/** JNI method for {@link #glProgramUniformMatrix3x4d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix3x4d} */
	public static native void nglProgramUniformMatrix3x4dv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat3x4 uniform variable or a dmat3x4 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x4d(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix3x4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 12) << 3);
		}
		nglProgramUniformMatrix3x4dv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x4d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix3x4d} */
	public static void glProgramUniformMatrix3x4(int program, int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix3x4dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix3x4dv(program, location, value.remaining() / 12, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glProgramUniformMatrix4x3dv ] ---

	/** JNI method for {@link #glProgramUniformMatrix4x3d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix4x3d} */
	public static native void nglProgramUniformMatrix4x3dv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProgramUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.
	 *
	 * @param program   the handle of the program containing the uniform variable to be modified
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x3d(int program, int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix4x3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 12) << 3);
		}
		nglProgramUniformMatrix4x3dv(program, location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x3d(int, int, int, boolean, ByteBuffer) glProgramUniformMatrix4x3d} */
	public static void glProgramUniformMatrix4x3(int program, int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glProgramUniformMatrix4x3dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix4x3dv(program, location, value.remaining() / 12, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glValidateProgramPipeline ] ---

	/** JNI method for {@link #glValidateProgramPipeline glValidateProgramPipeline} */
	public static native void nglValidateProgramPipeline(int pipeline, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glValidateProgramPipeline.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Validates a program pipeline object against current GL state.
	 *
	 * @param pipeline the name of a program pipeline object to validate
	 */
	public static void glValidateProgramPipeline(int pipeline) {
		long __functionAddress = getInstance().glValidateProgramPipeline;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglValidateProgramPipeline(pipeline, __functionAddress);
	}

	// --- [ glGetProgramPipelineInfoLog ] ---

	/** JNI method for {@link #glGetProgramPipelineInfoLog glGetProgramPipelineInfoLog} */
	public static native void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetProgramPipelineInfoLog.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves the info log string from a program pipeline object.
	 *
	 * @param pipeline the name of a program pipeline object from which to retrieve the info log
	 * @param bufSize  the maximum number of characters, including the null terminator, that may be written into {@code infoLog}
	 * @param length   a variable into which will be written the number of characters written into {@code infoLog}
	 * @param infoLog  an array of characters into which will be written the info log for {@code pipeline}
	 */
	public static void glGetProgramPipelineInfoLog(int pipeline, int bufSize, ByteBuffer length, ByteBuffer infoLog) {
		long __functionAddress = getInstance().glGetProgramPipelineInfoLog;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(infoLog, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramPipelineInfoLog(pipeline, bufSize, memAddressSafe(length), memAddress(infoLog), __functionAddress);
	}

	/** Alternative version of: {@link #glGetProgramPipelineInfoLog glGetProgramPipelineInfoLog} */
	public static void glGetProgramPipelineInfoLog(int pipeline, IntBuffer length, ByteBuffer infoLog) {
		long __functionAddress = getInstance().glGetProgramPipelineInfoLog;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		nglGetProgramPipelineInfoLog(pipeline, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog), __functionAddress);
	}

	/** String return version of: {@link #glGetProgramPipelineInfoLog glGetProgramPipelineInfoLog} */
	public static String glGetProgramPipelineInfoLog(int pipeline, int bufSize) {
		long __functionAddress = getInstance().glGetProgramPipelineInfoLog;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(bufSize);
		nglGetProgramPipelineInfoLog(pipeline, bufSize, __buffer.address() + length, __buffer.address() + infoLog, __functionAddress);
		return memDecodeUTF8(memByteBuffer(__buffer.address() + infoLog, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetProgramPipelineInfoLog glGetProgramPipelineInfoLog} */
	public static String glGetProgramPipelineInfoLog(int pipeline) {
		long __functionAddress = getInstance().glGetProgramPipelineInfoLog;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		int bufSize = glGetProgramPipelinei(pipeline, GL20.GL_INFO_LOG_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(bufSize);
		nglGetProgramPipelineInfoLog(pipeline, bufSize, __buffer.address() + length, __buffer.address() + infoLog, __functionAddress);
		return memDecodeUTF8(memByteBuffer(__buffer.address() + infoLog, __buffer.intValue(length)));
	}

	// --- [ glVertexAttribL1d ] ---

	/** JNI method for {@link #glVertexAttribL1d glVertexAttribL1d} */
	public static native void nglVertexAttribL1d(int index, double x, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0 and w to 1.0.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 */
	public static void glVertexAttribL1d(int index, double x) {
		long __functionAddress = getInstance().glVertexAttribL1d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribL1d(index, x, __functionAddress);
	}

	// --- [ glVertexAttribL2d ] ---

	/** JNI method for {@link #glVertexAttribL2d glVertexAttribL2d} */
	public static native void nglVertexAttribL2d(int index, double x, double y, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0 and w to 1.0.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 */
	public static void glVertexAttribL2d(int index, double x, double y) {
		long __functionAddress = getInstance().glVertexAttribL2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribL2d(index, x, y, __functionAddress);
	}

	// --- [ glVertexAttribL3d ] ---

	/** JNI method for {@link #glVertexAttribL3d glVertexAttribL3d} */
	public static native void nglVertexAttribL3d(int index, double x, double y, double z, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 */
	public static void glVertexAttribL3d(int index, double x, double y, double z) {
		long __functionAddress = getInstance().glVertexAttribL3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribL3d(index, x, y, z, __functionAddress);
	}

	// --- [ glVertexAttribL4d ] ---

	/** JNI method for {@link #glVertexAttribL4d glVertexAttribL4d} */
	public static native void nglVertexAttribL4d(int index, double x, double y, double z, double w, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a generic vertex attribute.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 * @param w     the vertex attribute w component
	 */
	public static void glVertexAttribL4d(int index, double x, double y, double z, double w) {
		long __functionAddress = getInstance().glVertexAttribL4d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribL4d(index, x, y, z, w, __functionAddress);
	}

	// --- [ glVertexAttribL1dv ] ---

	/** JNI method for {@link #glVertexAttribL1d(int, ByteBuffer) glVertexAttribL1d} */
	public static native void nglVertexAttribL1dv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribL1d glVertexAttribL1d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttribL1d(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribL1dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 3);
		}
		nglVertexAttribL1dv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribL1d(int, ByteBuffer) glVertexAttribL1d} */
	public static void glVertexAttribL1(int index, DoubleBuffer v) {
		long __functionAddress = getInstance().glVertexAttribL1dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglVertexAttribL1dv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribL2dv ] ---

	/** JNI method for {@link #glVertexAttribL2d(int, ByteBuffer) glVertexAttribL2d} */
	public static native void nglVertexAttribL2dv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribL2d glVertexAttribL2d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttribL2d(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribL2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 3);
		}
		nglVertexAttribL2dv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribL2d(int, ByteBuffer) glVertexAttribL2d} */
	public static void glVertexAttribL2(int index, DoubleBuffer v) {
		long __functionAddress = getInstance().glVertexAttribL2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglVertexAttribL2dv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribL3dv ] ---

	/** JNI method for {@link #glVertexAttribL3d(int, ByteBuffer) glVertexAttribL3d} */
	public static native void nglVertexAttribL3dv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribL3d glVertexAttribL3d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttribL3d(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribL3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 3);
		}
		nglVertexAttribL3dv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribL3d(int, ByteBuffer) glVertexAttribL3d} */
	public static void glVertexAttribL3(int index, DoubleBuffer v) {
		long __functionAddress = getInstance().glVertexAttribL3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglVertexAttribL3dv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribL4dv ] ---

	/** JNI method for {@link #glVertexAttribL4d(int, ByteBuffer) glVertexAttribL4d} */
	public static native void nglVertexAttribL4dv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribL4d glVertexAttribL4d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttribL4d(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribL4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 3);
		}
		nglVertexAttribL4dv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribL4d(int, ByteBuffer) glVertexAttribL4d} */
	public static void glVertexAttribL4(int index, DoubleBuffer v) {
		long __functionAddress = getInstance().glVertexAttribL4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttribL4dv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribLPointer ] ---

	/** JNI method for {@link #glVertexAttribLPointer glVertexAttribLPointer} */
	public static native void nglVertexAttribLPointer(int index, int size, int type, int stride, long pointer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribPointer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the location and organization of a 64-bit vertex attribute array.
	 *
	 * @param index   the index of the generic vertex attribute to be modified
	 * @param size    the number of values per vertex that are stored in the array. The initial value is 4. Must be:<p/>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type    the data type of each component in the array. Must be:<p/>{@link GL11#GL_DOUBLE DOUBLE}
	 * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                the array. The initial value is 0.
	 * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                currently bound to the GL15#ARRAY_BUFFER target. The initial value is 0.
	 */
	public static void glVertexAttribLPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().glVertexAttribLPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglVertexAttribLPointer(index, size, type, stride, memAddress(pointer), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glVertexAttribLPointer glVertexAttribLPointer} */
	public static void glVertexAttribLPointer(int index, int size, int type, int stride, long pointerOffset) {
		long __functionAddress = getInstance().glVertexAttribLPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		}
		nglVertexAttribLPointer(index, size, type, stride, pointerOffset, __functionAddress);
	}

	/** GL_DOUBLE version of: {@link #glVertexAttribLPointer glVertexAttribLPointer} */
	public static void glVertexAttribLPointer(int index, int size, int stride, DoubleBuffer pointer) {
		long __functionAddress = getInstance().glVertexAttribLPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglVertexAttribLPointer(index, size, GL11.GL_DOUBLE, stride, memAddress(pointer), __functionAddress);
	}

	// --- [ glGetVertexAttribLdv ] ---

	/** JNI method for {@link #glGetVertexAttribLd(int, int, ByteBuffer) glGetVertexAttribLd} */
	public static native void nglGetVertexAttribLdv(int index, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetVertexAttrib.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Double version of {@link GL20#glGetVertexAttribi GetVertexAttribi}.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params the requested data
	 */
	public static void glGetVertexAttribLd(int index, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetVertexAttribLdv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetVertexAttribLdv(index, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetVertexAttribLd(int, int, ByteBuffer) glGetVertexAttribLd} */
	public static void glGetVertexAttribL(int index, int pname, DoubleBuffer params) {
		long __functionAddress = getInstance().glGetVertexAttribLdv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetVertexAttribLdv(index, pname, memAddress(params), __functionAddress);
	}

	// --- [ glViewportArrayv ] ---

	/** JNI method for {@link #glViewportArray(int, int, ByteBuffer) glViewportArray} */
	public static native void nglViewportArrayv(int first, int count, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glViewportArray.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets multiple viewports.
	 *
	 * @param first the first viewport to set
	 * @param count the number of viewports to set
	 * @param v     an array containing the viewport parameters
	 */
	public static void glViewportArray(int first, int count, ByteBuffer v) {
		long __functionAddress = getInstance().glViewportArrayv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, (count << 2) << 2);
		}
		nglViewportArrayv(first, count, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glViewportArray(int, int, ByteBuffer) glViewportArray} */
	public static void glViewportArray(int first, FloatBuffer v) {
		long __functionAddress = getInstance().glViewportArrayv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglViewportArrayv(first, v.remaining() >> 2, memAddress(v), __functionAddress);
	}

	// --- [ glViewportIndexedf ] ---

	/** JNI method for {@link #glViewportIndexedf glViewportIndexedf} */
	public static native void nglViewportIndexedf(int index, float x, float y, float w, float h, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glViewportIndexed.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets a specified viewport.
	 *
	 * @param index the viewport to set
	 * @param x     the left viewport coordinate
	 * @param y     the bottom viewport coordinate
	 * @param w     the viewport width
	 * @param h     the viewport height
	 */
	public static void glViewportIndexedf(int index, float x, float y, float w, float h) {
		long __functionAddress = getInstance().glViewportIndexedf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglViewportIndexedf(index, x, y, w, h, __functionAddress);
	}

	// --- [ glViewportIndexedfv ] ---

	/** JNI method for {@link #glViewportIndexedf(int, ByteBuffer) glViewportIndexedf} */
	public static native void nglViewportIndexedfv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glViewportIndexed.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glViewportIndexedf glViewportIndexedf}.
	 *
	 * @param index the viewport to set
	 * @param v     the viewport parameters
	 */
	public static void glViewportIndexedf(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glViewportIndexedfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglViewportIndexedfv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glViewportIndexedf(int, ByteBuffer) glViewportIndexedf} */
	public static void glViewportIndexed(int index, FloatBuffer v) {
		long __functionAddress = getInstance().glViewportIndexedfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglViewportIndexedfv(index, memAddress(v), __functionAddress);
	}

	// --- [ glScissorArrayv ] ---

	/** JNI method for {@link #glScissorArray(int, int, ByteBuffer) glScissorArray} */
	public static native void nglScissorArrayv(int first, int count, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glScissorArray.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Defines the scissor box for multiple viewports.
	 *
	 * @param first the index of the first viewport whose scissor box to modify
	 * @param count the number of scissor boxes to modify
	 * @param v     an array containing the left, bottom, width and height of each scissor box, in that order
	 */
	public static void glScissorArray(int first, int count, ByteBuffer v) {
		long __functionAddress = getInstance().glScissorArrayv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, (count << 2) << 2);
		}
		nglScissorArrayv(first, count, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glScissorArray(int, int, ByteBuffer) glScissorArray} */
	public static void glScissorArray(int first, IntBuffer v) {
		long __functionAddress = getInstance().glScissorArrayv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglScissorArrayv(first, v.remaining() >> 2, memAddress(v), __functionAddress);
	}

	// --- [ glScissorIndexed ] ---

	/** JNI method for {@link #glScissorIndexed glScissorIndexed} */
	public static native void nglScissorIndexed(int index, int left, int bottom, int width, int height, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glScissorIndexed.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Defines the scissor box for a specific viewport.
	 *
	 * @param index  the index of the viewport whose scissor box to modify
	 * @param left   the left scissor box coordinate
	 * @param bottom the bottom scissor box coordinate
	 * @param width  the scissor box width
	 * @param height the scissor box height
	 */
	public static void glScissorIndexed(int index, int left, int bottom, int width, int height) {
		long __functionAddress = getInstance().glScissorIndexed;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglScissorIndexed(index, left, bottom, width, height, __functionAddress);
	}

	// --- [ glScissorIndexedv ] ---

	/** JNI method for {@link #glScissorIndexed(int, ByteBuffer) glScissorIndexed} */
	public static native void nglScissorIndexedv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glScissorIndexed.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glScissorIndexed glScissorIndexed}.
	 *
	 * @param index the index of the viewport whose scissor box to modify
	 * @param v     an array containing the left, bottom, width and height of each scissor box, in that order
	 */
	public static void glScissorIndexed(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glScissorIndexedv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglScissorIndexedv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glScissorIndexed(int, ByteBuffer) glScissorIndexed} */
	public static void glScissorIndexed(int index, IntBuffer v) {
		long __functionAddress = getInstance().glScissorIndexedv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglScissorIndexedv(index, memAddress(v), __functionAddress);
	}

	// --- [ glDepthRangeArrayv ] ---

	/** JNI method for {@link #glDepthRangeArray(int, int, ByteBuffer) glDepthRangeArray} */
	public static native void nglDepthRangeArrayv(int first, int count, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDepthRangeArray.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies mapping of depth values from normalized device coordinates to window coordinates for a specified set of viewports.
	 *
	 * @param first the index of the first viewport whose depth range to update
	 * @param count the number of viewports whose depth range to update
	 * @param v     n array containing the near and far values for the depth range of each modified viewport
	 */
	public static void glDepthRangeArray(int first, int count, ByteBuffer v) {
		long __functionAddress = getInstance().glDepthRangeArrayv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, (count << 1) << 3);
		}
		nglDepthRangeArrayv(first, count, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glDepthRangeArray(int, int, ByteBuffer) glDepthRangeArray} */
	public static void glDepthRangeArray(int first, DoubleBuffer v) {
		long __functionAddress = getInstance().glDepthRangeArrayv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDepthRangeArrayv(first, v.remaining() >> 1, memAddress(v), __functionAddress);
	}

	// --- [ glDepthRangeIndexed ] ---

	/** JNI method for {@link #glDepthRangeIndexed glDepthRangeIndexed} */
	public static native void nglDepthRangeIndexed(int index, double zNear, double zFar, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDepthRangeIndexed.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies mapping of depth values from normalized device coordinates to window coordinates for a specified viewport.
	 *
	 * @param index the index of the viewport whose depth range to update
	 * @param zNear the mapping of the near clipping plane to window coordinates. The initial value is 0.
	 * @param zFar  the mapping of the far clipping plane to window coordinates. The initial value is 1.
	 */
	public static void glDepthRangeIndexed(int index, double zNear, double zFar) {
		long __functionAddress = getInstance().glDepthRangeIndexed;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDepthRangeIndexed(index, zNear, zFar, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	@JavadocExclude
	public static Functions getInstance() {
		return GL.getCapabilities().__GL41;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL41") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glShaderBinary) &&
			GL.isFunctionSupported(funcs.glGetShaderPrecisionFormat) &&
			GL.isFunctionSupported(funcs.glDepthRangef) &&
			GL.isFunctionSupported(funcs.glClearDepthf) &&
			GL.isFunctionSupported(funcs.glGetProgramBinary) &&
			GL.isFunctionSupported(funcs.glProgramBinary) &&
			GL.isFunctionSupported(funcs.glProgramParameteri) &&
			GL.isFunctionSupported(funcs.glUseProgramStages) &&
			GL.isFunctionSupported(funcs.glActiveShaderProgram) &&
			GL.isFunctionSupported(funcs.glCreateShaderProgramv) &&
			GL.isFunctionSupported(funcs.glBindProgramPipeline) &&
			GL.isFunctionSupported(funcs.glDeleteProgramPipelines) &&
			GL.isFunctionSupported(funcs.glGenProgramPipelines) &&
			GL.isFunctionSupported(funcs.glIsProgramPipeline) &&
			GL.isFunctionSupported(funcs.glGetProgramPipelineiv) &&
			GL.isFunctionSupported(funcs.glProgramUniform1i) &&
			GL.isFunctionSupported(funcs.glProgramUniform2i) &&
			GL.isFunctionSupported(funcs.glProgramUniform3i) &&
			GL.isFunctionSupported(funcs.glProgramUniform4i) &&
			GL.isFunctionSupported(funcs.glProgramUniform1ui) &&
			GL.isFunctionSupported(funcs.glProgramUniform2ui) &&
			GL.isFunctionSupported(funcs.glProgramUniform3ui) &&
			GL.isFunctionSupported(funcs.glProgramUniform4ui) &&
			GL.isFunctionSupported(funcs.glProgramUniform1f) &&
			GL.isFunctionSupported(funcs.glProgramUniform2f) &&
			GL.isFunctionSupported(funcs.glProgramUniform3f) &&
			GL.isFunctionSupported(funcs.glProgramUniform4f) &&
			GL.isFunctionSupported(funcs.glProgramUniform1d) &&
			GL.isFunctionSupported(funcs.glProgramUniform2d) &&
			GL.isFunctionSupported(funcs.glProgramUniform3d) &&
			GL.isFunctionSupported(funcs.glProgramUniform4d) &&
			GL.isFunctionSupported(funcs.glProgramUniform1iv) &&
			GL.isFunctionSupported(funcs.glProgramUniform2iv) &&
			GL.isFunctionSupported(funcs.glProgramUniform3iv) &&
			GL.isFunctionSupported(funcs.glProgramUniform4iv) &&
			GL.isFunctionSupported(funcs.glProgramUniform1uiv) &&
			GL.isFunctionSupported(funcs.glProgramUniform2uiv) &&
			GL.isFunctionSupported(funcs.glProgramUniform3uiv) &&
			GL.isFunctionSupported(funcs.glProgramUniform4uiv) &&
			GL.isFunctionSupported(funcs.glProgramUniform1fv) &&
			GL.isFunctionSupported(funcs.glProgramUniform2fv) &&
			GL.isFunctionSupported(funcs.glProgramUniform3fv) &&
			GL.isFunctionSupported(funcs.glProgramUniform4fv) &&
			GL.isFunctionSupported(funcs.glProgramUniform1dv) &&
			GL.isFunctionSupported(funcs.glProgramUniform2dv) &&
			GL.isFunctionSupported(funcs.glProgramUniform3dv) &&
			GL.isFunctionSupported(funcs.glProgramUniform4dv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix2fv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix3fv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix4fv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix2dv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix3dv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix4dv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix2x3fv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix3x2fv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix2x4fv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix4x2fv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix3x4fv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix4x3fv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix2x3dv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix3x2dv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix2x4dv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix4x2dv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix3x4dv) &&
			GL.isFunctionSupported(funcs.glProgramUniformMatrix4x3dv) &&
			GL.isFunctionSupported(funcs.glValidateProgramPipeline) &&
			GL.isFunctionSupported(funcs.glGetProgramPipelineInfoLog) &&
			GL.isFunctionSupported(funcs.glVertexAttribL1d) &&
			GL.isFunctionSupported(funcs.glVertexAttribL2d) &&
			GL.isFunctionSupported(funcs.glVertexAttribL3d) &&
			GL.isFunctionSupported(funcs.glVertexAttribL4d) &&
			GL.isFunctionSupported(funcs.glVertexAttribL1dv) &&
			GL.isFunctionSupported(funcs.glVertexAttribL2dv) &&
			GL.isFunctionSupported(funcs.glVertexAttribL3dv) &&
			GL.isFunctionSupported(funcs.glVertexAttribL4dv) &&
			GL.isFunctionSupported(funcs.glVertexAttribLPointer) &&
			GL.isFunctionSupported(funcs.glGetVertexAttribLdv) &&
			GL.isFunctionSupported(funcs.glViewportArrayv) &&
			GL.isFunctionSupported(funcs.glViewportIndexedf) &&
			GL.isFunctionSupported(funcs.glViewportIndexedfv) &&
			GL.isFunctionSupported(funcs.glScissorArrayv) &&
			GL.isFunctionSupported(funcs.glScissorIndexed) &&
			GL.isFunctionSupported(funcs.glScissorIndexedv) &&
			GL.isFunctionSupported(funcs.glDepthRangeArrayv) &&
			GL.isFunctionSupported(funcs.glDepthRangeIndexed);

		return GL.checkExtension("OpenGL41", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GL41}. */
	@JavadocExclude
	public static final class Functions implements FunctionMap {

		public final long
			glShaderBinary,
			glGetShaderPrecisionFormat,
			glDepthRangef,
			glClearDepthf,
			glGetProgramBinary,
			glProgramBinary,
			glProgramParameteri,
			glUseProgramStages,
			glActiveShaderProgram,
			glCreateShaderProgramv,
			glBindProgramPipeline,
			glDeleteProgramPipelines,
			glGenProgramPipelines,
			glIsProgramPipeline,
			glGetProgramPipelineiv,
			glProgramUniform1i,
			glProgramUniform2i,
			glProgramUniform3i,
			glProgramUniform4i,
			glProgramUniform1ui,
			glProgramUniform2ui,
			glProgramUniform3ui,
			glProgramUniform4ui,
			glProgramUniform1f,
			glProgramUniform2f,
			glProgramUniform3f,
			glProgramUniform4f,
			glProgramUniform1d,
			glProgramUniform2d,
			glProgramUniform3d,
			glProgramUniform4d,
			glProgramUniform1iv,
			glProgramUniform2iv,
			glProgramUniform3iv,
			glProgramUniform4iv,
			glProgramUniform1uiv,
			glProgramUniform2uiv,
			glProgramUniform3uiv,
			glProgramUniform4uiv,
			glProgramUniform1fv,
			glProgramUniform2fv,
			glProgramUniform3fv,
			glProgramUniform4fv,
			glProgramUniform1dv,
			glProgramUniform2dv,
			glProgramUniform3dv,
			glProgramUniform4dv,
			glProgramUniformMatrix2fv,
			glProgramUniformMatrix3fv,
			glProgramUniformMatrix4fv,
			glProgramUniformMatrix2dv,
			glProgramUniformMatrix3dv,
			glProgramUniformMatrix4dv,
			glProgramUniformMatrix2x3fv,
			glProgramUniformMatrix3x2fv,
			glProgramUniformMatrix2x4fv,
			glProgramUniformMatrix4x2fv,
			glProgramUniformMatrix3x4fv,
			glProgramUniformMatrix4x3fv,
			glProgramUniformMatrix2x3dv,
			glProgramUniformMatrix3x2dv,
			glProgramUniformMatrix2x4dv,
			glProgramUniformMatrix4x2dv,
			glProgramUniformMatrix3x4dv,
			glProgramUniformMatrix4x3dv,
			glValidateProgramPipeline,
			glGetProgramPipelineInfoLog,
			glVertexAttribL1d,
			glVertexAttribL2d,
			glVertexAttribL3d,
			glVertexAttribL4d,
			glVertexAttribL1dv,
			glVertexAttribL2dv,
			glVertexAttribL3dv,
			glVertexAttribL4dv,
			glVertexAttribLPointer,
			glGetVertexAttribLdv,
			glViewportArrayv,
			glViewportIndexedf,
			glViewportIndexedfv,
			glScissorArrayv,
			glScissorIndexed,
			glScissorIndexedv,
			glDepthRangeArrayv,
			glDepthRangeIndexed;

		public Functions(FunctionProvider provider) {
			glShaderBinary = provider.getFunctionAddress("glShaderBinary");
			glGetShaderPrecisionFormat = provider.getFunctionAddress("glGetShaderPrecisionFormat");
			glDepthRangef = provider.getFunctionAddress("glDepthRangef");
			glClearDepthf = provider.getFunctionAddress("glClearDepthf");
			glGetProgramBinary = provider.getFunctionAddress("glGetProgramBinary");
			glProgramBinary = provider.getFunctionAddress("glProgramBinary");
			glProgramParameteri = provider.getFunctionAddress("glProgramParameteri");
			glUseProgramStages = provider.getFunctionAddress("glUseProgramStages");
			glActiveShaderProgram = provider.getFunctionAddress("glActiveShaderProgram");
			glCreateShaderProgramv = provider.getFunctionAddress("glCreateShaderProgramv");
			glBindProgramPipeline = provider.getFunctionAddress("glBindProgramPipeline");
			glDeleteProgramPipelines = provider.getFunctionAddress("glDeleteProgramPipelines");
			glGenProgramPipelines = provider.getFunctionAddress("glGenProgramPipelines");
			glIsProgramPipeline = provider.getFunctionAddress("glIsProgramPipeline");
			glGetProgramPipelineiv = provider.getFunctionAddress("glGetProgramPipelineiv");
			glProgramUniform1i = provider.getFunctionAddress("glProgramUniform1i");
			glProgramUniform2i = provider.getFunctionAddress("glProgramUniform2i");
			glProgramUniform3i = provider.getFunctionAddress("glProgramUniform3i");
			glProgramUniform4i = provider.getFunctionAddress("glProgramUniform4i");
			glProgramUniform1ui = provider.getFunctionAddress("glProgramUniform1ui");
			glProgramUniform2ui = provider.getFunctionAddress("glProgramUniform2ui");
			glProgramUniform3ui = provider.getFunctionAddress("glProgramUniform3ui");
			glProgramUniform4ui = provider.getFunctionAddress("glProgramUniform4ui");
			glProgramUniform1f = provider.getFunctionAddress("glProgramUniform1f");
			glProgramUniform2f = provider.getFunctionAddress("glProgramUniform2f");
			glProgramUniform3f = provider.getFunctionAddress("glProgramUniform3f");
			glProgramUniform4f = provider.getFunctionAddress("glProgramUniform4f");
			glProgramUniform1d = provider.getFunctionAddress("glProgramUniform1d");
			glProgramUniform2d = provider.getFunctionAddress("glProgramUniform2d");
			glProgramUniform3d = provider.getFunctionAddress("glProgramUniform3d");
			glProgramUniform4d = provider.getFunctionAddress("glProgramUniform4d");
			glProgramUniform1iv = provider.getFunctionAddress("glProgramUniform1iv");
			glProgramUniform2iv = provider.getFunctionAddress("glProgramUniform2iv");
			glProgramUniform3iv = provider.getFunctionAddress("glProgramUniform3iv");
			glProgramUniform4iv = provider.getFunctionAddress("glProgramUniform4iv");
			glProgramUniform1uiv = provider.getFunctionAddress("glProgramUniform1uiv");
			glProgramUniform2uiv = provider.getFunctionAddress("glProgramUniform2uiv");
			glProgramUniform3uiv = provider.getFunctionAddress("glProgramUniform3uiv");
			glProgramUniform4uiv = provider.getFunctionAddress("glProgramUniform4uiv");
			glProgramUniform1fv = provider.getFunctionAddress("glProgramUniform1fv");
			glProgramUniform2fv = provider.getFunctionAddress("glProgramUniform2fv");
			glProgramUniform3fv = provider.getFunctionAddress("glProgramUniform3fv");
			glProgramUniform4fv = provider.getFunctionAddress("glProgramUniform4fv");
			glProgramUniform1dv = provider.getFunctionAddress("glProgramUniform1dv");
			glProgramUniform2dv = provider.getFunctionAddress("glProgramUniform2dv");
			glProgramUniform3dv = provider.getFunctionAddress("glProgramUniform3dv");
			glProgramUniform4dv = provider.getFunctionAddress("glProgramUniform4dv");
			glProgramUniformMatrix2fv = provider.getFunctionAddress("glProgramUniformMatrix2fv");
			glProgramUniformMatrix3fv = provider.getFunctionAddress("glProgramUniformMatrix3fv");
			glProgramUniformMatrix4fv = provider.getFunctionAddress("glProgramUniformMatrix4fv");
			glProgramUniformMatrix2dv = provider.getFunctionAddress("glProgramUniformMatrix2dv");
			glProgramUniformMatrix3dv = provider.getFunctionAddress("glProgramUniformMatrix3dv");
			glProgramUniformMatrix4dv = provider.getFunctionAddress("glProgramUniformMatrix4dv");
			glProgramUniformMatrix2x3fv = provider.getFunctionAddress("glProgramUniformMatrix2x3fv");
			glProgramUniformMatrix3x2fv = provider.getFunctionAddress("glProgramUniformMatrix3x2fv");
			glProgramUniformMatrix2x4fv = provider.getFunctionAddress("glProgramUniformMatrix2x4fv");
			glProgramUniformMatrix4x2fv = provider.getFunctionAddress("glProgramUniformMatrix4x2fv");
			glProgramUniformMatrix3x4fv = provider.getFunctionAddress("glProgramUniformMatrix3x4fv");
			glProgramUniformMatrix4x3fv = provider.getFunctionAddress("glProgramUniformMatrix4x3fv");
			glProgramUniformMatrix2x3dv = provider.getFunctionAddress("glProgramUniformMatrix2x3dv");
			glProgramUniformMatrix3x2dv = provider.getFunctionAddress("glProgramUniformMatrix3x2dv");
			glProgramUniformMatrix2x4dv = provider.getFunctionAddress("glProgramUniformMatrix2x4dv");
			glProgramUniformMatrix4x2dv = provider.getFunctionAddress("glProgramUniformMatrix4x2dv");
			glProgramUniformMatrix3x4dv = provider.getFunctionAddress("glProgramUniformMatrix3x4dv");
			glProgramUniformMatrix4x3dv = provider.getFunctionAddress("glProgramUniformMatrix4x3dv");
			glValidateProgramPipeline = provider.getFunctionAddress("glValidateProgramPipeline");
			glGetProgramPipelineInfoLog = provider.getFunctionAddress("glGetProgramPipelineInfoLog");
			glVertexAttribL1d = provider.getFunctionAddress("glVertexAttribL1d");
			glVertexAttribL2d = provider.getFunctionAddress("glVertexAttribL2d");
			glVertexAttribL3d = provider.getFunctionAddress("glVertexAttribL3d");
			glVertexAttribL4d = provider.getFunctionAddress("glVertexAttribL4d");
			glVertexAttribL1dv = provider.getFunctionAddress("glVertexAttribL1dv");
			glVertexAttribL2dv = provider.getFunctionAddress("glVertexAttribL2dv");
			glVertexAttribL3dv = provider.getFunctionAddress("glVertexAttribL3dv");
			glVertexAttribL4dv = provider.getFunctionAddress("glVertexAttribL4dv");
			glVertexAttribLPointer = provider.getFunctionAddress("glVertexAttribLPointer");
			glGetVertexAttribLdv = provider.getFunctionAddress("glGetVertexAttribLdv");
			glViewportArrayv = provider.getFunctionAddress("glViewportArrayv");
			glViewportIndexedf = provider.getFunctionAddress("glViewportIndexedf");
			glViewportIndexedfv = provider.getFunctionAddress("glViewportIndexedfv");
			glScissorArrayv = provider.getFunctionAddress("glScissorArrayv");
			glScissorIndexed = provider.getFunctionAddress("glScissorIndexed");
			glScissorIndexedv = provider.getFunctionAddress("glScissorIndexedv");
			glDepthRangeArrayv = provider.getFunctionAddress("glDepthRangeArrayv");
			glDepthRangeIndexed = provider.getFunctionAddress("glDepthRangeIndexed");
		}

	}

}