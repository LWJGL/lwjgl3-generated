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

/** The core OpenGL 2.0 functionality. */
public final class GL20 {

	/** Accepted by the {@code name} parameter of GetString. */
	public static final int
		GL_SHADING_LANGUAGE_VERSION = 0x8B8C;

	/** Accepted by the {@code pname} parameter of GetInteger. */
	public static final int
		GL_CURRENT_PROGRAM = 0x8B8D;

	/** Accepted by the {@code pname} parameter of GetShaderiv. */
	public static final int
		GL_SHADER_TYPE                 = 0x8B4F,
		GL_DELETE_STATUS               = 0x8B80,
		GL_COMPILE_STATUS              = 0x8B81,
		GL_LINK_STATUS                 = 0x8B82,
		GL_VALIDATE_STATUS             = 0x8B83,
		GL_INFO_LOG_LENGTH             = 0x8B84,
		GL_ATTACHED_SHADERS            = 0x8B85,
		GL_ACTIVE_UNIFORMS             = 0x8B86,
		GL_ACTIVE_UNIFORM_MAX_LENGTH   = 0x8B87,
		GL_ACTIVE_ATTRIBUTES           = 0x8B89,
		GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A,
		GL_SHADER_SOURCE_LENGTH        = 0x8B88;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int
		GL_FLOAT_VEC2        = 0x8B50,
		GL_FLOAT_VEC3        = 0x8B51,
		GL_FLOAT_VEC4        = 0x8B52,
		GL_INT_VEC2          = 0x8B53,
		GL_INT_VEC3          = 0x8B54,
		GL_INT_VEC4          = 0x8B55,
		GL_BOOL              = 0x8B56,
		GL_BOOL_VEC2         = 0x8B57,
		GL_BOOL_VEC3         = 0x8B58,
		GL_BOOL_VEC4         = 0x8B59,
		GL_FLOAT_MAT2        = 0x8B5A,
		GL_FLOAT_MAT3        = 0x8B5B,
		GL_FLOAT_MAT4        = 0x8B5C,
		GL_SAMPLER_1D        = 0x8B5D,
		GL_SAMPLER_2D        = 0x8B5E,
		GL_SAMPLER_3D        = 0x8B5F,
		GL_SAMPLER_CUBE      = 0x8B60,
		GL_SAMPLER_1D_SHADOW = 0x8B61,
		GL_SAMPLER_2D_SHADOW = 0x8B62;

	/** Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv. */
	public static final int
		GL_VERTEX_SHADER = 0x8B31;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_VERTEX_UNIFORM_COMPONENTS    = 0x8B4A,
		GL_MAX_VARYING_FLOATS               = 0x8B4B,
		GL_MAX_VERTEX_ATTRIBS               = 0x8869,
		GL_MAX_TEXTURE_IMAGE_UNITS          = 0x8872,
		GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS   = 0x8B4C,
		GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D,
		GL_MAX_TEXTURE_COORDS               = 0x8871;

	/**
	 * Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int
		GL_VERTEX_PROGRAM_POINT_SIZE = 0x8642,
		GL_VERTEX_PROGRAM_TWO_SIDE   = 0x8643;

	/** Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}v. */
	public static final int
		GL_VERTEX_ATTRIB_ARRAY_ENABLED    = 0x8622,
		GL_VERTEX_ATTRIB_ARRAY_SIZE       = 0x8623,
		GL_VERTEX_ATTRIB_ARRAY_STRIDE     = 0x8624,
		GL_VERTEX_ATTRIB_ARRAY_TYPE       = 0x8625,
		GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A,
		GL_CURRENT_VERTEX_ATTRIB          = 0x8626;

	/** Accepted by the {@code pname} parameter of GetVertexAttribPointerv. */
	public static final int
		GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;

	/** Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv. */
	public static final int
		GL_FRAGMENT_SHADER = 0x8B30;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;

	/** Accepted by the {@code target} parameter of Hint and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;

	/** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_DRAW_BUFFERS = 0x8824,
		GL_DRAW_BUFFER0     = 0x8825,
		GL_DRAW_BUFFER1     = 0x8826,
		GL_DRAW_BUFFER2     = 0x8827,
		GL_DRAW_BUFFER3     = 0x8828,
		GL_DRAW_BUFFER4     = 0x8829,
		GL_DRAW_BUFFER5     = 0x882A,
		GL_DRAW_BUFFER6     = 0x882B,
		GL_DRAW_BUFFER7     = 0x882C,
		GL_DRAW_BUFFER8     = 0x882D,
		GL_DRAW_BUFFER9     = 0x882E,
		GL_DRAW_BUFFER10    = 0x882F,
		GL_DRAW_BUFFER11    = 0x8830,
		GL_DRAW_BUFFER12    = 0x8831,
		GL_DRAW_BUFFER13    = 0x8832,
		GL_DRAW_BUFFER14    = 0x8833,
		GL_DRAW_BUFFER15    = 0x8834;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of TexEnvi, TexEnviv, TexEnvf, TexEnvfv, GetTexEnviv, and GetTexEnvfv.
	 */
	public static final int
		GL_POINT_SPRITE = 0x8861;

	/**
	 * When the {@code target} parameter of TexEnvf, TexEnvfv, TexEnvi, TexEnviv, GetTexEnvfv, or GetTexEnviv is POINT_SPRITE, then the value of
	 * {@code pname} may be.
	 */
	public static final int
		GL_COORD_REPLACE = 0x8862;

	/** Accepted by the {@code pname} parameter of PointParameter{if}v. */
	public static final int
		GL_POINT_SPRITE_COORD_ORIGIN = 0x8CA0;

	/** Accepted by the {@code param} parameter of PointParameter{if}v. */
	public static final int
		GL_LOWER_LEFT = 0x8CA1,
		GL_UPPER_LEFT = 0x8CA2;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_BLEND_EQUATION_RGB   = 0x8009,
		GL_BLEND_EQUATION_ALPHA = 0x883D;

	/** Accepted by the {@code pname} parameter of GetIntegerv. */
	public static final int
		GL_STENCIL_BACK_FUNC_ATI            = 0x8800,
		GL_STENCIL_BACK_FAIL_ATI            = 0x8801,
		GL_STENCIL_BACK_PASS_DEPTH_FAIL_ATI = 0x8802,
		GL_STENCIL_BACK_PASS_DEPTH_PASS_ATI = 0x8803,
		GL_STENCIL_BACK_REF                 = 0x8CA3,
		GL_STENCIL_BACK_VALUE_MASK          = 0x8CA4,
		GL_STENCIL_BACK_WRITEMASK           = 0x8CA5;

	private GL20() {}

	// --- [ glCreateProgram ] ---

	/** JNI method for {@link #glCreateProgram glCreateProgram} */
	public static native int nglCreateProgram(long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCreateProgram.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Creates a program object.
	 */
	public static int glCreateProgram() {
		long __functionAddress = getInstance().glCreateProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglCreateProgram(__functionAddress);
	}

	// --- [ glDeleteProgram ] ---

	/** JNI method for {@link #glDeleteProgram glDeleteProgram} */
	public static native void nglDeleteProgram(int program, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDeleteProgram.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Deletes a program object.
	 *
	 * @param program the program object to be deleted
	 */
	public static void glDeleteProgram(int program) {
		long __functionAddress = getInstance().glDeleteProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDeleteProgram(program, __functionAddress);
	}

	// --- [ glCreateShader ] ---

	/** JNI method for {@link #glCreateShader glCreateShader} */
	public static native int nglCreateShader(int type, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCreateShader.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Creates a shader object.
	 *
	 * @param type the type of shader to be created. One of:<p/>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 */
	public static int glCreateShader(int type) {
		long __functionAddress = getInstance().glCreateShader;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglCreateShader(type, __functionAddress);
	}

	// --- [ glDeleteShader ] ---

	/** JNI method for {@link #glDeleteShader glDeleteShader} */
	public static native void nglDeleteShader(int shader, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDeleteShader.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Deletes a shader object.
	 *
	 * @param shader the shader object to be deleted
	 */
	public static void glDeleteShader(int shader) {
		long __functionAddress = getInstance().glDeleteShader;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDeleteShader(shader, __functionAddress);
	}

	// --- [ glAttachShader ] ---

	/** JNI method for {@link #glAttachShader glAttachShader} */
	public static native void nglAttachShader(int program, int shader, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glAttachShader.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Attaches a shader object to a program object.
	 * <p/>
	 * In order to create a complete shader program, there must be a way to specify the list of things that will be linked together. Program objects provide
	 * this mechanism. Shaders that are to be linked together in a program object must first be attached to that program object. glAttachShader attaches the
	 * shader object specified by shader to the program object specified by program. This indicates that shader will be included in link operations that will
	 * be performed on program.
	 * <p/>
	 * All operations that can be performed on a shader object are valid whether or not the shader object is attached to a program object. It is permissible to
	 * attach a shader object to a program object before source code has been loaded into the shader object or before the shader object has been compiled. It
	 * is permissible to attach multiple shader objects of the same type because each may contain a portion of the complete shader. It is also permissible to
	 * attach a shader object to more than one program object. If a shader object is deleted while it is attached to a program object, it will be flagged for
	 * deletion, and deletion will not occur until glDetachShader is called to detach it from all program objects to which it is attached.
	 *
	 * @param program the program object to which a shader object will be attached
	 * @param shader  the shader object that is to be attached
	 */
	public static void glAttachShader(int program, int shader) {
		long __functionAddress = getInstance().glAttachShader;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglAttachShader(program, shader, __functionAddress);
	}

	// --- [ glDetachShader ] ---

	/** JNI method for {@link #glDetachShader glDetachShader} */
	public static native void nglDetachShader(int program, int shader, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDetachShader.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Detaches a shader object from a program object to which it is attached.
	 *
	 * @param program the program object from which to detach the shader object
	 * @param shader  the shader object to be detached
	 */
	public static void glDetachShader(int program, int shader) {
		long __functionAddress = getInstance().glDetachShader;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDetachShader(program, shader, __functionAddress);
	}

	// --- [ glShaderSource ] ---

	/** JNI method for {@link #glShaderSource glShaderSource} */
	public static native void nglShaderSource(int shader, int count, long strings, long length, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glShaderSource.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the source code in {@code shader} to the source code in the array of strings specified by {@code strings}. Any source code previously stored in the
	 * shader object is completely replaced. The number of strings in the array is specified by {@code count}. If {@code length} is NULL, each string is
	 * assumed to be null terminated. If {@code length} is a value other than NULL, it points to an array containing a string length for each of the
	 * corresponding elements of {@code strings}. Each element in the length array may contain the length of the corresponding string (the null character is not
	 * counted as part of the string length) or a value less than 0 to indicate that the string is null terminated. The source code strings are not scanned or
	 * parsed at this time; they are simply copied into the specified shader object.
	 *
	 * @param shader  the handle of the shader object whose source code is to be replaced
	 * @param count   the number of elements in the string and length arrays
	 * @param strings an array of pointers to strings containing the source code to be loaded into the shader
	 * @param length  an array of string lengths
	 */
	public static void glShaderSource(int shader, int count, ByteBuffer strings, ByteBuffer length) {
		long __functionAddress = getInstance().glShaderSource;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(strings, count << POINTER_SHIFT);
			if ( length != null ) checkBuffer(length, count << 2);
		}
		nglShaderSource(shader, count, memAddress(strings), memAddressSafe(length), __functionAddress);
	}

	/** Alternative version of: {@link #glShaderSource glShaderSource} */
	public static void glShaderSource(int shader, PointerBuffer strings, IntBuffer length) {
		long __functionAddress = getInstance().glShaderSource;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, strings.remaining());
		}
		nglShaderSource(shader, strings.remaining(), memAddress(strings), memAddressSafe(length), __functionAddress);
	}

	/** Array version of: {@link #glShaderSource glShaderSource} */
	public static void glShaderSource(int shader, CharSequence... strings) {
		long __functionAddress = getInstance().glShaderSource;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int stringsLengths = __buffer.bufferParam(strings.length << 2);
		for ( int i = 0; i < strings.length; i++ )
			__buffer.intParam(stringsLengths, i, strings[i].length());
		int stringsAddress = __buffer.bufferParam(strings.length << POINTER_SHIFT);
		ByteBuffer[] stringsBuffers = new ByteBuffer[strings.length];
		for ( int i = 0; i < strings.length; i++ )
			__buffer.pointerParam(stringsAddress, i, memAddress(stringsBuffers[i] = memEncodeUTF8(strings[i], false)));
		nglShaderSource(shader, strings.length, __buffer.address() + stringsAddress, __buffer.address() + stringsLengths, __functionAddress);
	}

	/** Single string version of: {@link #glShaderSource glShaderSource} */
	public static void glShaderSource(int shader, CharSequence string) {
		long __functionAddress = getInstance().glShaderSource;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int stringsLengths = __buffer.intParam(string.length());
		ByteBuffer stringBuffers = memEncodeUTF8(string, false);
		int stringsAddress = __buffer.pointerParam(memAddress(stringBuffers));
		nglShaderSource(shader, 1, __buffer.address() + stringsAddress, __buffer.address() + stringsLengths, __functionAddress);
	}

	// --- [ glCompileShader ] ---

	/** JNI method for {@link #glCompileShader glCompileShader} */
	public static native void nglCompileShader(int shader, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCompileShader.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Compiles a shader object.
	 *
	 * @param shader the shader object to be compiled
	 */
	public static void glCompileShader(int shader) {
		long __functionAddress = getInstance().glCompileShader;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCompileShader(shader, __functionAddress);
	}

	// --- [ glLinkProgram ] ---

	/** JNI method for {@link #glLinkProgram glLinkProgram} */
	public static native void nglLinkProgram(int program, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glLinkProgram.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Links a program object.
	 *
	 * @param program the handle of the program object to be linked
	 */
	public static void glLinkProgram(int program) {
		long __functionAddress = getInstance().glLinkProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLinkProgram(program, __functionAddress);
	}

	// --- [ glUseProgram ] ---

	/** JNI method for {@link #glUseProgram glUseProgram} */
	public static native void nglUseProgram(int program, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUseProgram.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Installs a program object as part of current rendering state.
	 *
	 * @param program the handle of the program object whose executables are to be used as part of current rendering state
	 */
	public static void glUseProgram(int program) {
		long __functionAddress = getInstance().glUseProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUseProgram(program, __functionAddress);
	}

	// --- [ glValidateProgram ] ---

	/** JNI method for {@link #glValidateProgram glValidateProgram} */
	public static native void nglValidateProgram(int program, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glValidateProgram.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Validates a program object.
	 *
	 * @param program the handle of the program object to be validated
	 */
	public static void glValidateProgram(int program) {
		long __functionAddress = getInstance().glValidateProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglValidateProgram(program, __functionAddress);
	}

	// --- [ glUniform1f ] ---

	/** JNI method for {@link #glUniform1f glUniform1f} */
	public static native void nglUniform1f(int location, float v0, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform1f.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a float uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform value
	 */
	public static void glUniform1f(int location, float v0) {
		long __functionAddress = getInstance().glUniform1f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform1f(location, v0, __functionAddress);
	}

	// --- [ glUniform2f ] ---

	/** JNI method for {@link #glUniform2f glUniform2f} */
	public static native void nglUniform2f(int location, float v0, float v1, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform2f.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a vec2 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 */
	public static void glUniform2f(int location, float v0, float v1) {
		long __functionAddress = getInstance().glUniform2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform2f(location, v0, v1, __functionAddress);
	}

	// --- [ glUniform3f ] ---

	/** JNI method for {@link #glUniform3f glUniform3f} */
	public static native void nglUniform3f(int location, float v0, float v1, float v2, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform3f.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a vec3 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 */
	public static void glUniform3f(int location, float v0, float v1, float v2) {
		long __functionAddress = getInstance().glUniform3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform3f(location, v0, v1, v2, __functionAddress);
	}

	// --- [ glUniform4f ] ---

	/** JNI method for {@link #glUniform4f glUniform4f} */
	public static native void nglUniform4f(int location, float v0, float v1, float v2, float v3, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform4f.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a vec4 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 * @param v3       the uniform w value
	 */
	public static void glUniform4f(int location, float v0, float v1, float v2, float v3) {
		long __functionAddress = getInstance().glUniform4f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform4f(location, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glUniform1i ] ---

	/** JNI method for {@link #glUniform1i glUniform1i} */
	public static native void nglUniform1i(int location, int v0, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform1i.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of an int uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform value
	 */
	public static void glUniform1i(int location, int v0) {
		long __functionAddress = getInstance().glUniform1i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform1i(location, v0, __functionAddress);
	}

	// --- [ glUniform2i ] ---

	/** JNI method for {@link #glUniform2i glUniform2i} */
	public static native void nglUniform2i(int location, int v0, int v1, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform2i.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a ivec2 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 */
	public static void glUniform2i(int location, int v0, int v1) {
		long __functionAddress = getInstance().glUniform2i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform2i(location, v0, v1, __functionAddress);
	}

	// --- [ glUniform3i ] ---

	/** JNI method for {@link #glUniform3i glUniform3i} */
	public static native void nglUniform3i(int location, int v0, int v1, int v2, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform3i.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a ivec3 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 */
	public static void glUniform3i(int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().glUniform3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform3i(location, v0, v1, v2, __functionAddress);
	}

	// --- [ glUniform4i ] ---

	/** JNI method for {@link #glUniform4i glUniform4i} */
	public static native void nglUniform4i(int location, int v0, int v1, int v2, int v3, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform4i.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a ivec4 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 * @param v3       the uniform w value
	 */
	public static void glUniform4i(int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().glUniform4i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform4i(location, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glUniform1fv ] ---

	/** JNI method for {@link #glUniform1f(int, int, ByteBuffer) glUniform1f} */
	public static native void nglUniform1fv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform1.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single float uniform variable or a float uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform1f(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform1fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, count << 2);
		}
		nglUniform1fv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform1f(int, int, ByteBuffer) glUniform1f} */
	public static void glUniform1(int location, FloatBuffer value) {
		long __functionAddress = getInstance().glUniform1fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform1fv(location, value.remaining(), memAddress(value), __functionAddress);
	}

	// --- [ glUniform2fv ] ---

	/** JNI method for {@link #glUniform2f(int, int, ByteBuffer) glUniform2f} */
	public static native void nglUniform2fv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single vec2 uniform variable or a vec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform2f(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 1) << 2);
		}
		nglUniform2fv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform2f(int, int, ByteBuffer) glUniform2f} */
	public static void glUniform2(int location, FloatBuffer value) {
		long __functionAddress = getInstance().glUniform2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform2fv(location, value.remaining() >> 1, memAddress(value), __functionAddress);
	}

	// --- [ glUniform3fv ] ---

	/** JNI method for {@link #glUniform3f(int, int, ByteBuffer) glUniform3f} */
	public static native void nglUniform3fv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single vec3 uniform variable or a vec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform3f(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 3) << 2);
		}
		nglUniform3fv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform3f(int, int, ByteBuffer) glUniform3f} */
	public static void glUniform3(int location, FloatBuffer value) {
		long __functionAddress = getInstance().glUniform3fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform3fv(location, value.remaining() / 3, memAddress(value), __functionAddress);
	}

	// --- [ glUniform4fv ] ---

	/** JNI method for {@link #glUniform4f(int, int, ByteBuffer) glUniform4f} */
	public static native void nglUniform4fv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single vec4 uniform variable or a vec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform4f(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 2) << 2);
		}
		nglUniform4fv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform4f(int, int, ByteBuffer) glUniform4f} */
	public static void glUniform4(int location, FloatBuffer value) {
		long __functionAddress = getInstance().glUniform4fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform4fv(location, value.remaining() >> 2, memAddress(value), __functionAddress);
	}

	// --- [ glUniform1iv ] ---

	/** JNI method for {@link #glUniform1i(int, int, ByteBuffer) glUniform1i} */
	public static native void nglUniform1iv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform1.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single int uniform variable or a int uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform1i(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform1iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, count << 2);
		}
		nglUniform1iv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform1i(int, int, ByteBuffer) glUniform1i} */
	public static void glUniform1(int location, IntBuffer value) {
		long __functionAddress = getInstance().glUniform1iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform1iv(location, value.remaining(), memAddress(value), __functionAddress);
	}

	// --- [ glUniform2iv ] ---

	/** JNI method for {@link #glUniform2i(int, int, ByteBuffer) glUniform2i} */
	public static native void nglUniform2iv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single ivec2 uniform variable or a ivec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform2i(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 1) << 2);
		}
		nglUniform2iv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform2i(int, int, ByteBuffer) glUniform2i} */
	public static void glUniform2(int location, IntBuffer value) {
		long __functionAddress = getInstance().glUniform2iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform2iv(location, value.remaining() >> 1, memAddress(value), __functionAddress);
	}

	// --- [ glUniform3iv ] ---

	/** JNI method for {@link #glUniform3i(int, int, ByteBuffer) glUniform3i} */
	public static native void nglUniform3iv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single ivec3 uniform variable or a ivec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform3i(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 3) << 2);
		}
		nglUniform3iv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform3i(int, int, ByteBuffer) glUniform3i} */
	public static void glUniform3(int location, IntBuffer value) {
		long __functionAddress = getInstance().glUniform3iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform3iv(location, value.remaining() / 3, memAddress(value), __functionAddress);
	}

	// --- [ glUniform4iv ] ---

	/** JNI method for {@link #glUniform4i(int, int, ByteBuffer) glUniform4i} */
	public static native void nglUniform4iv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single ivec4 uniform variable or a ivec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform4i(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 2) << 2);
		}
		nglUniform4iv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform4i(int, int, ByteBuffer) glUniform4i} */
	public static void glUniform4(int location, IntBuffer value) {
		long __functionAddress = getInstance().glUniform4iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform4iv(location, value.remaining() >> 2, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix2fv ] ---

	/** JNI method for {@link #glUniformMatrix2f(int, int, boolean, ByteBuffer) glUniformMatrix2f} */
	public static native void nglUniformMatrix2fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat2 uniform variable or a mat2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix2f(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 2) << 2);
		}
		nglUniformMatrix2fv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix2f(int, int, boolean, ByteBuffer) glUniformMatrix2f} */
	public static void glUniformMatrix2(int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix2fv(location, value.remaining() >> 2, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix3fv ] ---

	/** JNI method for {@link #glUniformMatrix3f(int, int, boolean, ByteBuffer) glUniformMatrix3f} */
	public static native void nglUniformMatrix3fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat3 uniform variable or a mat3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix3f(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 9) << 2);
		}
		nglUniformMatrix3fv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix3f(int, int, boolean, ByteBuffer) glUniformMatrix3f} */
	public static void glUniformMatrix3(int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix3fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix3fv(location, value.remaining() / 9, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix4fv ] ---

	/** JNI method for {@link #glUniformMatrix4f(int, int, boolean, ByteBuffer) glUniformMatrix4f} */
	public static native void nglUniformMatrix4fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat4 uniform variable or a mat4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix4f(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 4) << 2);
		}
		nglUniformMatrix4fv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix4f(int, int, boolean, ByteBuffer) glUniformMatrix4f} */
	public static void glUniformMatrix4(int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix4fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix4fv(location, value.remaining() >> 4, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glGetShaderiv ] ---

	/** JNI method for {@link #glGetShaderi(int, int, ByteBuffer) glGetShaderi} */
	public static native void nglGetShaderiv(int shader, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetShader.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns a parameter from a shader object.
	 *
	 * @param shader the shader object to be queried
	 * @param pname  the object parameter. One of:<p/>{@link #GL_SHADER_TYPE SHADER_TYPE}, {@link #GL_DELETE_STATUS DELETE_STATUS}, {@link #GL_COMPILE_STATUS COMPILE_STATUS}, {@link #GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}, {@link #GL_SHADER_SOURCE_LENGTH SHADER_SOURCE_LENGTH}
	 * @param params the requested object parameter
	 */
	public static void glGetShaderi(int shader, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetShaderiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetShaderiv(shader, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetShaderi(int, int, ByteBuffer) glGetShaderi} */
	public static void glGetShader(int shader, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetShaderiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetShaderiv(shader, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetShaderi(int, int, ByteBuffer) glGetShaderi} */
	public static int glGetShaderi(int shader, int pname) {
		long __functionAddress = getInstance().glGetShaderiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetShaderiv(shader, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetProgramiv ] ---

	/** JNI method for {@link #glGetProgrami(int, int, ByteBuffer) glGetProgrami} */
	public static native void nglGetProgramiv(int program, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetProgram.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns a parameter from a program object.
	 *
	 * @param program the program object to be queried
	 * @param pname   the object parameter. One of:<p/>{@link #GL_DELETE_STATUS DELETE_STATUS}, {@link #GL_LINK_STATUS LINK_STATUS}, {@link #GL_VALIDATE_STATUS VALIDATE_STATUS}, {@link #GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}, {@link #GL_ATTACHED_SHADERS ATTACHED_SHADERS}, {@link #GL_ACTIVE_ATTRIBUTES ACTIVE_ATTRIBUTES}, {@link #GL_ACTIVE_ATTRIBUTE_MAX_LENGTH ACTIVE_ATTRIBUTE_MAX_LENGTH}, {@link #GL_ACTIVE_UNIFORMS ACTIVE_UNIFORMS}, {@link #GL_ACTIVE_UNIFORM_MAX_LENGTH ACTIVE_UNIFORM_MAX_LENGTH}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_MODE TRANSFORM_FEEDBACK_BUFFER_MODE}, {@link GL30#GL_TRANSFORM_FEEDBACK_VARYINGS TRANSFORM_FEEDBACK_VARYINGS}, {@link GL30#GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH}, {@link GL31#GL_ACTIVE_UNIFORM_BLOCKS ACTIVE_UNIFORM_BLOCKS}, {@link GL31#GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH}, {@link GL32#GL_GEOMETRY_VERTICES_OUT GEOMETRY_VERTICES_OUT}, {@link GL32#GL_GEOMETRY_INPUT_TYPE GEOMETRY_INPUT_TYPE}, {@link GL32#GL_GEOMETRY_OUTPUT_TYPE GEOMETRY_OUTPUT_TYPE}, {@link GL41#GL_PROGRAM_BINARY_LENGTH PROGRAM_BINARY_LENGTH}, {@link GL42#GL_ACTIVE_ATOMIC_COUNTER_BUFFERS ACTIVE_ATOMIC_COUNTER_BUFFERS}, {@link GL43#GL_COMPUTE_WORK_GROUP_SIZE COMPUTE_WORK_GROUP_SIZE}
	 * @param params  the requested object parameter
	 */
	public static void glGetProgrami(int program, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetProgramiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetProgramiv(program, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetProgrami(int, int, ByteBuffer) glGetProgrami} */
	public static void glGetProgram(int program, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetProgramiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetProgramiv(program, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetProgrami(int, int, ByteBuffer) glGetProgrami} */
	public static int glGetProgrami(int program, int pname) {
		long __functionAddress = getInstance().glGetProgramiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetProgramiv(program, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetShaderInfoLog ] ---

	/** JNI method for {@link #glGetShaderInfoLog glGetShaderInfoLog} */
	public static native void nglGetShaderInfoLog(int shader, int maxLength, long length, long infoLog, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetShaderInfoLog.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the information log for a shader object.
	 *
	 * @param shader    the shader object whose information log is to be queried
	 * @param maxLength the size of the character buffer for storing the returned information log
	 * @param length    the length of the string returned in {@code infoLog} (excluding the null terminator)
	 * @param infoLog   an array of characters that is used to return the information log
	 */
	public static void glGetShaderInfoLog(int shader, int maxLength, ByteBuffer length, ByteBuffer infoLog) {
		long __functionAddress = getInstance().glGetShaderInfoLog;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(infoLog, maxLength);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetShaderInfoLog(shader, maxLength, memAddressSafe(length), memAddress(infoLog), __functionAddress);
	}

	/** Alternative version of: {@link #glGetShaderInfoLog glGetShaderInfoLog} */
	public static void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog) {
		long __functionAddress = getInstance().glGetShaderInfoLog;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		nglGetShaderInfoLog(shader, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog), __functionAddress);
	}

	/** String return version of: {@link #glGetShaderInfoLog glGetShaderInfoLog} */
	public static String glGetShaderInfoLog(int shader, int maxLength) {
		long __functionAddress = getInstance().glGetShaderInfoLog;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(maxLength);
		nglGetShaderInfoLog(shader, maxLength, __buffer.address() + length, __buffer.address() + infoLog, __functionAddress);
		return memDecodeUTF8(memByteBuffer(__buffer.address() + infoLog, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetShaderInfoLog glGetShaderInfoLog} */
	public static String glGetShaderInfoLog(int shader) {
		long __functionAddress = getInstance().glGetShaderInfoLog;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		int maxLength = glGetShaderi(shader, GL_INFO_LOG_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(maxLength);
		nglGetShaderInfoLog(shader, maxLength, __buffer.address() + length, __buffer.address() + infoLog, __functionAddress);
		return memDecodeUTF8(memByteBuffer(__buffer.address() + infoLog, __buffer.intValue(length)));
	}

	// --- [ glGetProgramInfoLog ] ---

	/** JNI method for {@link #glGetProgramInfoLog glGetProgramInfoLog} */
	public static native void nglGetProgramInfoLog(int program, int maxLength, long length, long infoLog, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetProgramInfoLog.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the information log for a program object.
	 *
	 * @param program   the program object whose information log is to be queried
	 * @param maxLength the size of the character buffer for storing the returned information log
	 * @param length    the length of the string returned in {@code infoLog} (excluding the null terminator)
	 * @param infoLog   an array of characters that is used to return the information log
	 */
	public static void glGetProgramInfoLog(int program, int maxLength, ByteBuffer length, ByteBuffer infoLog) {
		long __functionAddress = getInstance().glGetProgramInfoLog;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(infoLog, maxLength);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramInfoLog(program, maxLength, memAddressSafe(length), memAddress(infoLog), __functionAddress);
	}

	/** Alternative version of: {@link #glGetProgramInfoLog glGetProgramInfoLog} */
	public static void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
		long __functionAddress = getInstance().glGetProgramInfoLog;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		nglGetProgramInfoLog(program, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog), __functionAddress);
	}

	/** String return version of: {@link #glGetProgramInfoLog glGetProgramInfoLog} */
	public static String glGetProgramInfoLog(int program, int maxLength) {
		long __functionAddress = getInstance().glGetProgramInfoLog;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(maxLength);
		nglGetProgramInfoLog(program, maxLength, __buffer.address() + length, __buffer.address() + infoLog, __functionAddress);
		return memDecodeUTF8(memByteBuffer(__buffer.address() + infoLog, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetProgramInfoLog glGetProgramInfoLog} */
	public static String glGetProgramInfoLog(int program) {
		long __functionAddress = getInstance().glGetProgramInfoLog;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		int maxLength = glGetProgrami(program, GL_INFO_LOG_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(maxLength);
		nglGetProgramInfoLog(program, maxLength, __buffer.address() + length, __buffer.address() + infoLog, __functionAddress);
		return memDecodeUTF8(memByteBuffer(__buffer.address() + infoLog, __buffer.intValue(length)));
	}

	// --- [ glGetAttachedShaders ] ---

	/** JNI method for {@link #glGetAttachedShaders glGetAttachedShaders} */
	public static native void nglGetAttachedShaders(int program, int maxCount, long count, long shaders, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetAttachedShaders.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the handles of the shader objects attached to a program object.
	 *
	 * @param program  the program object to be queried
	 * @param maxCount the size of the array for storing the returned object names
	 * @param count    the number of names actually returned in {@code shaders}
	 * @param shaders  an array that is used to return the names of attached shader objects
	 */
	public static void glGetAttachedShaders(int program, int maxCount, ByteBuffer count, ByteBuffer shaders) {
		long __functionAddress = getInstance().glGetAttachedShaders;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(shaders, maxCount << 2);
			if ( count != null ) checkBuffer(count, 1 << 2);
		}
		nglGetAttachedShaders(program, maxCount, memAddressSafe(count), memAddress(shaders), __functionAddress);
	}

	/** Alternative version of: {@link #glGetAttachedShaders glGetAttachedShaders} */
	public static void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders) {
		long __functionAddress = getInstance().glGetAttachedShaders;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( count != null ) checkBuffer(count, 1);
		}
		nglGetAttachedShaders(program, shaders.remaining(), memAddressSafe(count), memAddress(shaders), __functionAddress);
	}

	// --- [ glGetUniformLocation ] ---

	/** JNI method for {@link #glGetUniformLocation glGetUniformLocation} */
	public static native int nglGetUniformLocation(int program, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetUniformLocation.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the location of a uniform variable.
	 *
	 * @param program the program object to be queried
	 * @param name    a null terminated string containing the name of the uniform variable whose location is to be queried
	 */
	public static int glGetUniformLocation(int program, ByteBuffer name) {
		long __functionAddress = getInstance().glGetUniformLocation;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(name);
		}
		return nglGetUniformLocation(program, memAddress(name), __functionAddress);
	}

	/** CharSequence version of: {@link #glGetUniformLocation glGetUniformLocation} */
	public static int glGetUniformLocation(int program, CharSequence name) {
		long __functionAddress = getInstance().glGetUniformLocation;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGetUniformLocation(program, memAddress(memEncodeASCII(name)), __functionAddress);
	}

	// --- [ glGetActiveUniform ] ---

	/** JNI method for {@link #glGetActiveUniform glGetActiveUniform} */
	public static native void nglGetActiveUniform(int program, int index, int maxLength, long length, long size, long type, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetActiveUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns information about an active uniform variable for the specified program object.
	 *
	 * @param program   the program object to be queried
	 * @param index     the index of the uniform variable to be queried
	 * @param maxLength the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}
	 * @param length    the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than NULL is passed
	 * @param size      the size of the uniform variable
	 * @param type      the data type of the uniform variable
	 * @param name      a null terminated string containing the name of the uniform variable
	 */
	public static void glGetActiveUniform(int program, int index, int maxLength, ByteBuffer length, ByteBuffer size, ByteBuffer type, ByteBuffer name) {
		long __functionAddress = getInstance().glGetActiveUniform;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(name, maxLength);
			if ( length != null ) checkBuffer(length, 1 << 2);
			checkBuffer(size, 1 << 2);
			checkBuffer(type, 1 << 2);
		}
		nglGetActiveUniform(program, index, maxLength, memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name), __functionAddress);
	}

	/** Alternative version of: {@link #glGetActiveUniform glGetActiveUniform} */
	public static void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		long __functionAddress = getInstance().glGetActiveUniform;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetActiveUniform(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name), __functionAddress);
	}

	/** String return version of: {@link #glGetActiveUniform glGetActiveUniform} */
	public static String glGetActiveUniform(int program, int index, int maxLength, IntBuffer size, IntBuffer type) {
		long __functionAddress = getInstance().glGetActiveUniform;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int name = __buffer.bufferParam(maxLength);
		int length = __buffer.intParam();
		nglGetActiveUniform(program, index, maxLength, __buffer.address() + length, memAddress(size), memAddress(type), __buffer.address() + name, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + name, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveUniform glGetActiveUniform} */
	public static String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type) {
		long __functionAddress = getInstance().glGetActiveUniform;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		int maxLength = glGetProgrami(program, GL_ACTIVE_UNIFORM_MAX_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int name = __buffer.bufferParam(maxLength);
		int length = __buffer.intParam();
		nglGetActiveUniform(program, index, maxLength, __buffer.address() + length, memAddress(size), memAddress(type), __buffer.address() + name, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + name, __buffer.intValue(length)));
	}

	// --- [ glGetUniformfv ] ---

	/** JNI method for {@link #glGetUniformf(int, int, ByteBuffer) glGetUniformf} */
	public static native void nglGetUniformfv(int program, int location, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the float value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetUniformf(int program, int location, ByteBuffer params) {
		long __functionAddress = getInstance().glGetUniformfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetUniformfv(program, location, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetUniformf(int, int, ByteBuffer) glGetUniformf} */
	public static void glGetUniform(int program, int location, FloatBuffer params) {
		long __functionAddress = getInstance().glGetUniformfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetUniformfv(program, location, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetUniformf(int, int, ByteBuffer) glGetUniformf} */
	public static float glGetUniformf(int program, int location) {
		long __functionAddress = getInstance().glGetUniformfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetUniformfv(program, location, __buffer.address() + params, __functionAddress);
		return __buffer.floatValue(params);
	}

	// --- [ glGetUniformiv ] ---

	/** JNI method for {@link #glGetUniformi(int, int, ByteBuffer) glGetUniformi} */
	public static native void nglGetUniformiv(int program, int location, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the int value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetUniformi(int program, int location, ByteBuffer params) {
		long __functionAddress = getInstance().glGetUniformiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetUniformiv(program, location, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetUniformi(int, int, ByteBuffer) glGetUniformi} */
	public static void glGetUniform(int program, int location, IntBuffer params) {
		long __functionAddress = getInstance().glGetUniformiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetUniformiv(program, location, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetUniformi(int, int, ByteBuffer) glGetUniformi} */
	public static int glGetUniformi(int program, int location) {
		long __functionAddress = getInstance().glGetUniformiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetUniformiv(program, location, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetShaderSource ] ---

	/** JNI method for {@link #glGetShaderSource glGetShaderSource} */
	public static native void nglGetShaderSource(int shader, int maxLength, long length, long source, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetShaderSource.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the source code string from a shader object.
	 *
	 * @param shader    the shader object to be queried
	 * @param maxLength the size of the character buffer for storing the returned source code string
	 * @param length    the length of the string returned in source (excluding the null terminator)
	 * @param source    an array of characters that is used to return the source code string
	 */
	public static void glGetShaderSource(int shader, int maxLength, ByteBuffer length, ByteBuffer source) {
		long __functionAddress = getInstance().glGetShaderSource;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(source, maxLength);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetShaderSource(shader, maxLength, memAddressSafe(length), memAddress(source), __functionAddress);
	}

	/** Alternative version of: {@link #glGetShaderSource glGetShaderSource} */
	public static void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source) {
		long __functionAddress = getInstance().glGetShaderSource;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		nglGetShaderSource(shader, source.remaining(), memAddressSafe(length), memAddress(source), __functionAddress);
	}

	/** String return version of: {@link #glGetShaderSource glGetShaderSource} */
	public static String glGetShaderSource(int shader, int maxLength) {
		long __functionAddress = getInstance().glGetShaderSource;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int source = __buffer.bufferParam(maxLength);
		int length = __buffer.intParam();
		nglGetShaderSource(shader, maxLength, __buffer.address() + length, __buffer.address() + source, __functionAddress);
		return memDecodeUTF8(memByteBuffer(__buffer.address() + source, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetShaderSource glGetShaderSource} */
	public static String glGetShaderSource(int shader) {
		long __functionAddress = getInstance().glGetShaderSource;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		int maxLength = glGetShaderi(shader, GL_SHADER_SOURCE_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int source = __buffer.bufferParam(maxLength);
		int length = __buffer.intParam();
		nglGetShaderSource(shader, maxLength, __buffer.address() + length, __buffer.address() + source, __functionAddress);
		return memDecodeUTF8(memByteBuffer(__buffer.address() + source, __buffer.intValue(length)));
	}

	// --- [ glVertexAttrib1f ] ---

	/** JNI method for {@link #glVertexAttrib1f glVertexAttrib1f} */
	public static native void nglVertexAttrib1f(int index, float v0, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib1f.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0f and w to 1.0f.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1f(int index, float v0) {
		long __functionAddress = getInstance().glVertexAttrib1f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib1f(index, v0, __functionAddress);
	}

	// --- [ glVertexAttrib1s ] ---

	/** JNI method for {@link #glVertexAttrib1s glVertexAttrib1s} */
	public static native void nglVertexAttrib1s(int index, short v0, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib1s.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Short version of {@link #glVertexAttrib1f glVertexAttrib1f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1s(int index, short v0) {
		long __functionAddress = getInstance().glVertexAttrib1s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib1s(index, v0, __functionAddress);
	}

	// --- [ glVertexAttrib1d ] ---

	/** JNI method for {@link #glVertexAttrib1d glVertexAttrib1d} */
	public static native void nglVertexAttrib1d(int index, double v0, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib1d.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Double version of {@link #glVertexAttrib1f glVertexAttrib1f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1d(int index, double v0) {
		long __functionAddress = getInstance().glVertexAttrib1d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib1d(index, v0, __functionAddress);
	}

	// --- [ glVertexAttrib2f ] ---

	/** JNI method for {@link #glVertexAttrib2f glVertexAttrib2f} */
	public static native void nglVertexAttrib2f(int index, float v0, float v1, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib2f.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0f and w to 1.0f.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 */
	public static void glVertexAttrib2f(int index, float v0, float v1) {
		long __functionAddress = getInstance().glVertexAttrib2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib2f(index, v0, v1, __functionAddress);
	}

	// --- [ glVertexAttrib2s ] ---

	/** JNI method for {@link #glVertexAttrib2s glVertexAttrib2s} */
	public static native void nglVertexAttrib2s(int index, short v0, short v1, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib2s.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Short version of {@link #glVertexAttrib2f glVertexAttrib2f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 */
	public static void glVertexAttrib2s(int index, short v0, short v1) {
		long __functionAddress = getInstance().glVertexAttrib2s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib2s(index, v0, v1, __functionAddress);
	}

	// --- [ glVertexAttrib2d ] ---

	/** JNI method for {@link #glVertexAttrib2d glVertexAttrib2d} */
	public static native void nglVertexAttrib2d(int index, double v0, double v1, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib2d.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Double version of {@link #glVertexAttrib2f glVertexAttrib2f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 */
	public static void glVertexAttrib2d(int index, double v0, double v1) {
		long __functionAddress = getInstance().glVertexAttrib2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib2d(index, v0, v1, __functionAddress);
	}

	// --- [ glVertexAttrib3f ] ---

	/** JNI method for {@link #glVertexAttrib3f glVertexAttrib3f} */
	public static native void nglVertexAttrib3f(int index, float v0, float v1, float v2, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib3f.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0f.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 */
	public static void glVertexAttrib3f(int index, float v0, float v1, float v2) {
		long __functionAddress = getInstance().glVertexAttrib3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib3f(index, v0, v1, v2, __functionAddress);
	}

	// --- [ glVertexAttrib3s ] ---

	/** JNI method for {@link #glVertexAttrib3s glVertexAttrib3s} */
	public static native void nglVertexAttrib3s(int index, short v0, short v1, short v2, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib3s.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Short version of {@link #glVertexAttrib3f glVertexAttrib3f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 */
	public static void glVertexAttrib3s(int index, short v0, short v1, short v2) {
		long __functionAddress = getInstance().glVertexAttrib3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib3s(index, v0, v1, v2, __functionAddress);
	}

	// --- [ glVertexAttrib3d ] ---

	/** JNI method for {@link #glVertexAttrib3d glVertexAttrib3d} */
	public static native void nglVertexAttrib3d(int index, double v0, double v1, double v2, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib3d.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Double version of {@link #glVertexAttrib3f glVertexAttrib3f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 */
	public static void glVertexAttrib3d(int index, double v0, double v1, double v2) {
		long __functionAddress = getInstance().glVertexAttrib3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib3d(index, v0, v1, v2, __functionAddress);
	}

	// --- [ glVertexAttrib4f ] ---

	/** JNI method for {@link #glVertexAttrib4f glVertexAttrib4f} */
	public static native void nglVertexAttrib4f(int index, float v0, float v1, float v2, float v3, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4f.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a generic vertex attribute.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 * @param v3    the vertex attribute w component
	 */
	public static void glVertexAttrib4f(int index, float v0, float v1, float v2, float v3) {
		long __functionAddress = getInstance().glVertexAttrib4f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib4f(index, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glVertexAttrib4s ] ---

	/** JNI method for {@link #glVertexAttrib4s glVertexAttrib4s} */
	public static native void nglVertexAttrib4s(int index, short v0, short v1, short v2, short v3, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4s.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Short version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 * @param v3    the vertex attribute w component
	 */
	public static void glVertexAttrib4s(int index, short v0, short v1, short v2, short v3) {
		long __functionAddress = getInstance().glVertexAttrib4s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib4s(index, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glVertexAttrib4d ] ---

	/** JNI method for {@link #glVertexAttrib4d glVertexAttrib4d} */
	public static native void nglVertexAttrib4d(int index, double v0, double v1, double v2, double v3, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4d.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Double version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 * @param v3    the vertex attribute w component
	 */
	public static void glVertexAttrib4d(int index, double v0, double v1, double v2, double v3) {
		long __functionAddress = getInstance().glVertexAttrib4d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib4d(index, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glVertexAttrib4Nub ] ---

	/** JNI method for {@link #glVertexAttrib4Nub glVertexAttrib4Nub} */
	public static native void nglVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4Nub.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Normalized unsigned byte version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 * @param w     the vertex attribute w component
	 */
	public static void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
		long __functionAddress = getInstance().glVertexAttrib4Nub;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib4Nub(index, x, y, z, w, __functionAddress);
	}

	// --- [ glVertexAttrib1fv ] ---

	/** JNI method for {@link #glVertexAttrib1f(int, ByteBuffer) glVertexAttrib1f} */
	public static native void nglVertexAttrib1fv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib1.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttrib1f glVertexAttrib1f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib1f(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib1fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 2);
		}
		nglVertexAttrib1fv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib1f(int, ByteBuffer) glVertexAttrib1f} */
	public static void glVertexAttrib1(int index, FloatBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib1fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglVertexAttrib1fv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib1sv ] ---

	/** JNI method for {@link #glVertexAttrib1s(int, ByteBuffer) glVertexAttrib1s} */
	public static native void nglVertexAttrib1sv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib1.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttrib1s glVertexAttrib1s}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib1s(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib1sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 1);
		}
		nglVertexAttrib1sv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib1s(int, ByteBuffer) glVertexAttrib1s} */
	public static void glVertexAttrib1(int index, ShortBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib1sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglVertexAttrib1sv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib1dv ] ---

	/** JNI method for {@link #glVertexAttrib1d(int, ByteBuffer) glVertexAttrib1d} */
	public static native void nglVertexAttrib1dv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib1.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttrib1d glVertexAttrib1d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib1d(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib1dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 3);
		}
		nglVertexAttrib1dv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib1d(int, ByteBuffer) glVertexAttrib1d} */
	public static void glVertexAttrib1(int index, DoubleBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib1dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglVertexAttrib1dv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib2fv ] ---

	/** JNI method for {@link #glVertexAttrib2f(int, ByteBuffer) glVertexAttrib2f} */
	public static native void nglVertexAttrib2fv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttrib2f glVertexAttrib2f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib2f(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 2);
		}
		nglVertexAttrib2fv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib2f(int, ByteBuffer) glVertexAttrib2f} */
	public static void glVertexAttrib2(int index, FloatBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglVertexAttrib2fv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib2sv ] ---

	/** JNI method for {@link #glVertexAttrib2s(int, ByteBuffer) glVertexAttrib2s} */
	public static native void nglVertexAttrib2sv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttrib2s glVertexAttrib2s}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib2s(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib2sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 1);
		}
		nglVertexAttrib2sv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib2s(int, ByteBuffer) glVertexAttrib2s} */
	public static void glVertexAttrib2(int index, ShortBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib2sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglVertexAttrib2sv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib2dv ] ---

	/** JNI method for {@link #glVertexAttrib2d(int, ByteBuffer) glVertexAttrib2d} */
	public static native void nglVertexAttrib2dv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttrib2d glVertexAttrib2d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib2d(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 3);
		}
		nglVertexAttrib2dv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib2d(int, ByteBuffer) glVertexAttrib2d} */
	public static void glVertexAttrib2(int index, DoubleBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglVertexAttrib2dv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib3fv ] ---

	/** JNI method for {@link #glVertexAttrib3f(int, ByteBuffer) glVertexAttrib3f} */
	public static native void nglVertexAttrib3fv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttrib3f glVertexAttrib3f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib3f(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglVertexAttrib3fv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib3f(int, ByteBuffer) glVertexAttrib3f} */
	public static void glVertexAttrib3(int index, FloatBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglVertexAttrib3fv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib3sv ] ---

	/** JNI method for {@link #glVertexAttrib3s(int, ByteBuffer) glVertexAttrib3s} */
	public static native void nglVertexAttrib3sv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttrib3s glVertexAttrib3s}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib3s(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 1);
		}
		nglVertexAttrib3sv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib3s(int, ByteBuffer) glVertexAttrib3s} */
	public static void glVertexAttrib3(int index, ShortBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglVertexAttrib3sv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib3dv ] ---

	/** JNI method for {@link #glVertexAttrib3d(int, ByteBuffer) glVertexAttrib3d} */
	public static native void nglVertexAttrib3dv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttrib3d glVertexAttrib3d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib3d(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 3);
		}
		nglVertexAttrib3dv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib3d(int, ByteBuffer) glVertexAttrib3d} */
	public static void glVertexAttrib3(int index, DoubleBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglVertexAttrib3dv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4fv ] ---

	/** JNI method for {@link #glVertexAttrib4f(int, ByteBuffer) glVertexAttrib4f} */
	public static native void nglVertexAttrib4fv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4f(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglVertexAttrib4fv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib4f(int, ByteBuffer) glVertexAttrib4f} */
	public static void glVertexAttrib4(int index, FloatBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4fv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4sv ] ---

	/** JNI method for {@link #glVertexAttrib4s(int, ByteBuffer) glVertexAttrib4s} */
	public static native void nglVertexAttrib4sv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttrib4s glVertexAttrib4s}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4s(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 1);
		}
		nglVertexAttrib4sv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib4s(int, ByteBuffer) glVertexAttrib4s} */
	public static void glVertexAttrib4(int index, ShortBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4sv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4dv ] ---

	/** JNI method for {@link #glVertexAttrib4d(int, ByteBuffer) glVertexAttrib4d} */
	public static native void nglVertexAttrib4dv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttrib4d glVertexAttrib4d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4d(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 3);
		}
		nglVertexAttrib4dv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib4d(int, ByteBuffer) glVertexAttrib4d} */
	public static void glVertexAttrib4(int index, DoubleBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4dv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4iv ] ---

	/** JNI method for {@link #glVertexAttrib4i(int, ByteBuffer) glVertexAttrib4i} */
	public static native void nglVertexAttrib4iv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Integer pointer version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4i(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglVertexAttrib4iv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib4i(int, ByteBuffer) glVertexAttrib4i} */
	public static void glVertexAttrib4(int index, IntBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4iv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4bv ] ---

	/** JNI method for {@link #glVertexAttrib4b(int, ByteBuffer) glVertexAttrib4b} */
	public static native void nglVertexAttrib4bv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4b.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Byte pointer version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4b(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4bv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4bv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4ubv ] ---

	/** JNI method for {@link #glVertexAttrib4ub(int, ByteBuffer) glVertexAttrib4ub} */
	public static native void nglVertexAttrib4ubv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4ub.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttrib4Nub glVertexAttrib4Nub}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4ub(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4ubv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4ubv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4usv ] ---

	/** JNI method for {@link #glVertexAttrib4us(int, ByteBuffer) glVertexAttrib4us} */
	public static native void nglVertexAttrib4usv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Unsigned short pointer version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4us(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4usv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 1);
		}
		nglVertexAttrib4usv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib4us(int, ByteBuffer) glVertexAttrib4us} */
	public static void glVertexAttrib4u(int index, ShortBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4usv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4usv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4uiv ] ---

	/** JNI method for {@link #glVertexAttrib4ui(int, ByteBuffer) glVertexAttrib4ui} */
	public static native void nglVertexAttrib4uiv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Unsigned int pointer version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4ui(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglVertexAttrib4uiv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib4ui(int, ByteBuffer) glVertexAttrib4ui} */
	public static void glVertexAttrib4u(int index, IntBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4uiv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4Nbv ] ---

	/** JNI method for {@link #glVertexAttrib4Nb(int, ByteBuffer) glVertexAttrib4Nb} */
	public static native void nglVertexAttrib4Nbv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4Nb.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Normalized byte pointer version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4Nb(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4Nbv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4Nbv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4Nsv ] ---

	/** JNI method for {@link #glVertexAttrib4Ns(int, ByteBuffer) glVertexAttrib4Ns} */
	public static native void nglVertexAttrib4Nsv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4N.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Normalized short pointer version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4Ns(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4Nsv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 1);
		}
		nglVertexAttrib4Nsv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib4Ns(int, ByteBuffer) glVertexAttrib4Ns} */
	public static void glVertexAttrib4N(int index, ShortBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4Nsv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4Nsv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4Niv ] ---

	/** JNI method for {@link #glVertexAttrib4Ni(int, ByteBuffer) glVertexAttrib4Ni} */
	public static native void nglVertexAttrib4Niv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4N.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Normalized int pointer version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4Ni(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4Niv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglVertexAttrib4Niv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib4Ni(int, ByteBuffer) glVertexAttrib4Ni} */
	public static void glVertexAttrib4N(int index, IntBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4Niv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4Niv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4Nubv ] ---

	/** JNI method for {@link #glVertexAttrib4Nub(int, ByteBuffer) glVertexAttrib4Nub} */
	public static native void nglVertexAttrib4Nubv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4Nub.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Normalized unsigned byte pointer version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4Nub(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4Nubv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4Nubv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4Nusv ] ---

	/** JNI method for {@link #glVertexAttrib4Nus(int, ByteBuffer) glVertexAttrib4Nus} */
	public static native void nglVertexAttrib4Nusv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4N.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Normalized unsigned short pointer version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4Nus(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4Nusv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 1);
		}
		nglVertexAttrib4Nusv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib4Nus(int, ByteBuffer) glVertexAttrib4Nus} */
	public static void glVertexAttrib4Nu(int index, ShortBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4Nusv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4Nusv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttrib4Nuiv ] ---

	/** JNI method for {@link #glVertexAttrib4Nui(int, ByteBuffer) glVertexAttrib4Nui} */
	public static native void nglVertexAttrib4Nuiv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttrib4N.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Normalized unsigned int pointer version of {@link #glVertexAttrib4f glVertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4Nui(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4Nuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglVertexAttrib4Nuiv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttrib4Nui(int, ByteBuffer) glVertexAttrib4Nui} */
	public static void glVertexAttrib4Nu(int index, IntBuffer v) {
		long __functionAddress = getInstance().glVertexAttrib4Nuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttrib4Nuiv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribPointer ] ---

	/** JNI method for {@link #glVertexAttribPointer glVertexAttribPointer} */
	public static native void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribPointer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the location and organization of a vertex attribute array.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param size       the number of values per vertex that are stored in the array. The initial value is 4. Must be:<p/>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<p/>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL11#GL_DOUBLE DOUBLE}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL41#GL_FIXED FIXED}
	 * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
	 * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                   the array. The initial value is 0.
	 * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                   currently bound to the GL15#ARRAY_BUFFER target. The initial value is 0.
	 */
	public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().glVertexAttribPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glVertexAttribPointer glVertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointerOffset) {
		long __functionAddress = getInstance().glVertexAttribPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		}
		nglVertexAttribPointer(index, size, type, normalized, stride, pointerOffset, __functionAddress);
	}

	/** GL_SHORT version of: {@link #glVertexAttribPointer glVertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, ShortBuffer pointer) {
		long __functionAddress = getInstance().glVertexAttribPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglVertexAttribPointer(index, size, GL11.GL_SHORT, normalized, stride, memAddress(pointer), __functionAddress);
	}

	/** GL_INT version of: {@link #glVertexAttribPointer glVertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, IntBuffer pointer) {
		long __functionAddress = getInstance().glVertexAttribPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglVertexAttribPointer(index, size, GL11.GL_INT, normalized, stride, memAddress(pointer), __functionAddress);
	}

	/** GL_FLOAT version of: {@link #glVertexAttribPointer glVertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, FloatBuffer pointer) {
		long __functionAddress = getInstance().glVertexAttribPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglVertexAttribPointer(index, size, GL11.GL_FLOAT, normalized, stride, memAddress(pointer), __functionAddress);
	}

	/** GL_DOUBLE version of: {@link #glVertexAttribPointer glVertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, DoubleBuffer pointer) {
		long __functionAddress = getInstance().glVertexAttribPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglVertexAttribPointer(index, size, GL11.GL_DOUBLE, normalized, stride, memAddress(pointer), __functionAddress);
	}

	// --- [ glEnableVertexAttribArray ] ---

	/** JNI method for {@link #glEnableVertexAttribArray glEnableVertexAttribArray} */
	public static native void nglEnableVertexAttribArray(int index, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glEnableVertexAttribArray.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Enables a generic vertex attribute array.
	 *
	 * @param index the index of the generic vertex attribute to be enabled
	 */
	public static void glEnableVertexAttribArray(int index) {
		long __functionAddress = getInstance().glEnableVertexAttribArray;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEnableVertexAttribArray(index, __functionAddress);
	}

	// --- [ glDisableVertexAttribArray ] ---

	/** JNI method for {@link #glDisableVertexAttribArray glDisableVertexAttribArray} */
	public static native void nglDisableVertexAttribArray(int index, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glEnableVertexAttribArray.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Disables a generic vertex attribute array.
	 *
	 * @param index the index of the generic vertex attribute to be disabled
	 */
	public static void glDisableVertexAttribArray(int index) {
		long __functionAddress = getInstance().glDisableVertexAttribArray;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDisableVertexAttribArray(index, __functionAddress);
	}

	// --- [ glBindAttribLocation ] ---

	/** JNI method for {@link #glBindAttribLocation glBindAttribLocation} */
	public static native void nglBindAttribLocation(int program, int index, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindAttribLocation.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Associates a generic vertex attribute index with a named attribute variable.
	 *
	 * @param program the handle of the program object in which the association is to be made
	 * @param index   the index of the generic vertex attribute to be bound
	 * @param name    a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound
	 */
	public static void glBindAttribLocation(int program, int index, ByteBuffer name) {
		long __functionAddress = getInstance().glBindAttribLocation;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(name);
		}
		nglBindAttribLocation(program, index, memAddress(name), __functionAddress);
	}

	/** CharSequence version of: {@link #glBindAttribLocation glBindAttribLocation} */
	public static void glBindAttribLocation(int program, int index, CharSequence name) {
		long __functionAddress = getInstance().glBindAttribLocation;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindAttribLocation(program, index, memAddress(memEncodeASCII(name)), __functionAddress);
	}

	// --- [ glGetActiveAttrib ] ---

	/** JNI method for {@link #glGetActiveAttrib glGetActiveAttrib} */
	public static native void nglGetActiveAttrib(int program, int index, int maxLength, long length, long size, long type, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetActiveAttrib.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns information about an active attribute variable for the specified program object.
	 *
	 * @param program   the program object to be queried
	 * @param index     the index of the attribute variable to be queried
	 * @param maxLength the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}
	 * @param length    the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than NULL is passed
	 * @param size      the size of the attribute variable
	 * @param type      the data type of the attribute variable
	 * @param name      a null terminated string containing the name of the attribute variable
	 */
	public static void glGetActiveAttrib(int program, int index, int maxLength, ByteBuffer length, ByteBuffer size, ByteBuffer type, ByteBuffer name) {
		long __functionAddress = getInstance().glGetActiveAttrib;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(name, maxLength);
		}
		nglGetActiveAttrib(program, index, maxLength, memAddress(length), memAddress(size), memAddress(type), memAddress(name), __functionAddress);
	}

	/** Alternative version of: {@link #glGetActiveAttrib glGetActiveAttrib} */
	public static void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		long __functionAddress = getInstance().glGetActiveAttrib;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetActiveAttrib(program, index, name.remaining(), memAddress(length), memAddress(size), memAddress(type), memAddress(name), __functionAddress);
	}

	/** String return version of: {@link #glGetActiveAttrib glGetActiveAttrib} */
	public static String glGetActiveAttrib(int program, int index, int maxLength, IntBuffer size, IntBuffer type) {
		long __functionAddress = getInstance().glGetActiveAttrib;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int name = __buffer.bufferParam(maxLength);
		int length = __buffer.intParam();
		nglGetActiveAttrib(program, index, maxLength, __buffer.address() + length, memAddress(size), memAddress(type), __buffer.address() + name, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + name, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveAttrib glGetActiveAttrib} */
	public static String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type) {
		long __functionAddress = getInstance().glGetActiveAttrib;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		int maxLength = glGetProgrami(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int name = __buffer.bufferParam(maxLength);
		int length = __buffer.intParam();
		nglGetActiveAttrib(program, index, maxLength, __buffer.address() + length, memAddress(size), memAddress(type), __buffer.address() + name, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + name, __buffer.intValue(length)));
	}

	// --- [ glGetAttribLocation ] ---

	/** JNI method for {@link #glGetAttribLocation glGetAttribLocation} */
	public static native int nglGetAttribLocation(int program, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetAttribLocation.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the location of an attribute variable.
	 *
	 * @param program the program object to be queried
	 * @param name    a null terminated string containing the name of the attribute variable whose location is to be queried
	 */
	public static int glGetAttribLocation(int program, ByteBuffer name) {
		long __functionAddress = getInstance().glGetAttribLocation;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(name);
		}
		return nglGetAttribLocation(program, memAddress(name), __functionAddress);
	}

	/** CharSequence version of: {@link #glGetAttribLocation glGetAttribLocation} */
	public static int glGetAttribLocation(int program, CharSequence name) {
		long __functionAddress = getInstance().glGetAttribLocation;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGetAttribLocation(program, memAddress(memEncodeASCII(name)), __functionAddress);
	}

	// --- [ glGetVertexAttribiv ] ---

	/** JNI method for {@link #glGetVertexAttribi(int, int, ByteBuffer) glGetVertexAttribi} */
	public static native void nglGetVertexAttribiv(int index, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetVertexAttrib.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the integer value of a generic vertex attribute parameter.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried. One of:<p/>{@link GL15#GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING VERTEX_ATTRIB_ARRAY_BUFFER_BINDING}, org.lwjgl.generator.ConstantBlock$Links@19788380, {@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}, {@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribi(int index, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetVertexAttribiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetVertexAttribiv(index, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetVertexAttribi(int, int, ByteBuffer) glGetVertexAttribi} */
	public static void glGetVertexAttrib(int index, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetVertexAttribiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetVertexAttribiv(index, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetVertexAttribi(int, int, ByteBuffer) glGetVertexAttribi} */
	public static int glGetVertexAttribi(int index, int pname) {
		long __functionAddress = getInstance().glGetVertexAttribiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetVertexAttribiv(index, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetVertexAttribfv ] ---

	/** JNI method for {@link #glGetVertexAttribf(int, int, ByteBuffer) glGetVertexAttribf} */
	public static native void nglGetVertexAttribfv(int index, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetVertexAttrib.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Float version of {@link #glGetVertexAttribi(int, int, ByteBuffer) glGetVertexAttribi}.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribf(int index, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetVertexAttribfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglGetVertexAttribfv(index, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetVertexAttribf(int, int, ByteBuffer) glGetVertexAttribf} */
	public static void glGetVertexAttrib(int index, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glGetVertexAttribfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglGetVertexAttribfv(index, pname, memAddress(params), __functionAddress);
	}

	// --- [ glGetVertexAttribdv ] ---

	/** JNI method for {@link #glGetVertexAttribd(int, int, ByteBuffer) glGetVertexAttribd} */
	public static native void nglGetVertexAttribdv(int index, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetVertexAttrib.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Double version of {@link #glGetVertexAttribi(int, int, ByteBuffer) glGetVertexAttribi}.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribd(int index, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetVertexAttribdv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 3);
		}
		nglGetVertexAttribdv(index, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetVertexAttribd(int, int, ByteBuffer) glGetVertexAttribd} */
	public static void glGetVertexAttrib(int index, int pname, DoubleBuffer params) {
		long __functionAddress = getInstance().glGetVertexAttribdv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglGetVertexAttribdv(index, pname, memAddress(params), __functionAddress);
	}

	// --- [ glGetVertexAttribPointerv ] ---

	/** JNI method for {@link #glGetVertexAttribPointer(int, int, ByteBuffer) glGetVertexAttribPointer} */
	public static native void nglGetVertexAttribPointerv(int index, int pname, long pointer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetVertexAttribPointer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the address of the specified generic vertex attribute pointer.
	 *
	 * @param index   the generic vertex attribute parameter to be queried
	 * @param pname   the symbolic name of the generic vertex attribute parameter to be returned. Must be:<p/>{@link #GL_VERTEX_ATTRIB_ARRAY_POINTER VERTEX_ATTRIB_ARRAY_POINTER}
	 * @param pointer the pointer value
	 */
	public static void glGetVertexAttribPointer(int index, int pname, ByteBuffer pointer) {
		long __functionAddress = getInstance().glGetVertexAttribPointerv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pointer, 1 << POINTER_SHIFT);
		}
		nglGetVertexAttribPointerv(index, pname, memAddress(pointer), __functionAddress);
	}

	/** Alternative version of: {@link #glGetVertexAttribPointer(int, int, ByteBuffer) glGetVertexAttribPointer} */
	public static void glGetVertexAttribPointer(int index, int pname, PointerBuffer pointer) {
		long __functionAddress = getInstance().glGetVertexAttribPointerv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pointer, 1);
		}
		nglGetVertexAttribPointerv(index, pname, memAddress(pointer), __functionAddress);
	}

	/** Single return value version of: {@link #glGetVertexAttribPointer(int, int, ByteBuffer) glGetVertexAttribPointer} */
	public static long glGetVertexAttribPointer(int index, int pname) {
		long __functionAddress = getInstance().glGetVertexAttribPointerv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int pointer = __buffer.pointerParam();
		nglGetVertexAttribPointerv(index, pname, __buffer.address() + pointer, __functionAddress);
		return __buffer.pointerValue(pointer);
	}

	// --- [ glDrawBuffers ] ---

	/** JNI method for {@link #glDrawBuffers glDrawBuffers} */
	public static native void nglDrawBuffers(int n, long bufs, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawBuffers.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies a list of color buffers to be drawn into.
	 *
	 * @param n    the number of buffers in {@code bufs}
	 * @param bufs an array of symbolic constants specifying the buffers into which fragment colors or data values will be written. One of:<p/>{@link GL11#GL_NONE NONE}, {@link GL11#GL_FRONT_LEFT FRONT_LEFT}, {@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}, {@link GL11#GL_BACK_LEFT BACK_LEFT}, {@link GL11#GL_BACK_RIGHT BACK_RIGHT}, {@link GL11#GL_AUX0 AUX0}, {@link GL11#GL_AUX1 AUX1}, {@link GL11#GL_AUX2 AUX2}, {@link GL11#GL_AUX3 AUX3}, {@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, GL30.GL_COLOR_ATTACHMENT[1-15]
	 */
	public static void glDrawBuffers(int n, ByteBuffer bufs) {
		long __functionAddress = getInstance().glDrawBuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(bufs, n << 2);
		}
		nglDrawBuffers(n, memAddress(bufs), __functionAddress);
	}

	/** Alternative version of: {@link #glDrawBuffers glDrawBuffers} */
	public static void glDrawBuffers(IntBuffer bufs) {
		long __functionAddress = getInstance().glDrawBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDrawBuffers(bufs.remaining(), memAddress(bufs), __functionAddress);
	}

	/** Single value version of: {@link #glDrawBuffers glDrawBuffers} */
	public static void glDrawBuffers(int buf) {
		long __functionAddress = getInstance().glDrawBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int bufs = __buffer.intParam(buf);
		nglDrawBuffers(1, __buffer.address() + bufs, __functionAddress);
	}

	// --- [ glBlendEquationSeparate ] ---

	/** JNI method for {@link #glBlendEquationSeparate glBlendEquationSeparate} */
	public static native void nglBlendEquationSeparate(int modeRGB, int modeAlpha, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBlendEquationSeparate.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the RGB blend equation and the alpha blend equation separately.
	 *
	 * @param modeRGB   the RGB blend equation, how the red, green, and blue components of the source and destination colors are combined. One of:<p/>{@link GL14#GL_FUNC_ADD FUNC_ADD}, {@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}, {@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link GL14#GL_MIN MIN}, {@link GL14#GL_MAX MAX}
	 * @param modeAlpha the alpha blend equation, how the alpha component of the source and destination colors are combined
	 */
	public static void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
		long __functionAddress = getInstance().glBlendEquationSeparate;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBlendEquationSeparate(modeRGB, modeAlpha, __functionAddress);
	}

	// --- [ glStencilOpSeparate ] ---

	/** JNI method for {@link #glStencilOpSeparate glStencilOpSeparate} */
	public static native void nglStencilOpSeparate(int face, int sfail, int dpfail, int dppass, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glStencilOpSeparate.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets front and/or back stencil test actions.
	 *
	 * @param face   whether front and/or back stencil state is updated. One of:<p/>{@link GL11#GL_FRONT FRONT}, {@link GL11#GL_BACK BACK}, {@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}
	 * @param sfail  the action to take when the stencil test fails. The initial value is GL_KEEP. One of:<p/>{@link GL11#GL_KEEP KEEP}, {@link GL11#GL_ZERO ZERO}, {@link GL11#GL_REPLACE REPLACE}, {@link GL11#GL_INCR INCR}, {@link GL14#GL_INCR_WRAP INCR_WRAP}, {@link GL11#GL_DECR DECR}, {@link GL14#GL_DECR_WRAP DECR_WRAP}, {@link GL11#GL_INVERT INVERT}
	 * @param dpfail the stencil action when the stencil test passes, but the depth test fails. The initial value is GL_KEEP
	 * @param dppass the stencil action when both the stencil test and the depth test pass, or when the stencil test passes and either there is no depth buffer or depth
	 *               testing is not enabled. The initial value is GL_KEEP
	 */
	public static void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
		long __functionAddress = getInstance().glStencilOpSeparate;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglStencilOpSeparate(face, sfail, dpfail, dppass, __functionAddress);
	}

	// --- [ glStencilFuncSeparate ] ---

	/** JNI method for {@link #glStencilFuncSeparate glStencilFuncSeparate} */
	public static native void nglStencilFuncSeparate(int face, int func, int ref, int mask, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glStencilFuncSeparate.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets front and/or back function and reference value for stencil testing.
	 *
	 * @param face whether front and/or back stencil state is updated. One of:<p/>{@link GL11#GL_FRONT FRONT}, {@link GL11#GL_BACK BACK}, {@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}
	 * @param func the test function. The initial value is GL_ALWAYS. One of:<p/>{@link GL11#GL_NEVER NEVER}, {@link GL11#GL_LESS LESS}, {@link GL11#GL_LEQUAL LEQUAL}, {@link GL11#GL_GREATER GREATER}, {@link GL11#GL_GEQUAL GEQUAL}, {@link GL11#GL_EQUAL EQUAL}, {@link GL11#GL_NOTEQUAL NOTEQUAL}, {@link GL11#GL_ALWAYS ALWAYS}
	 * @param ref  the reference value for the stencil test. {@code ref} is clamped to the range [0, 2n &ndash; 1], where {@code n} is the number of bitplanes in the stencil
	 *             buffer. The initial value is 0.
	 * @param mask a mask that is ANDed with both the reference value and the stored stencil value when the test is done. The initial value is all 1's.
	 */
	public static void glStencilFuncSeparate(int face, int func, int ref, int mask) {
		long __functionAddress = getInstance().glStencilFuncSeparate;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglStencilFuncSeparate(face, func, ref, mask, __functionAddress);
	}

	// --- [ glStencilMaskSeparate ] ---

	/** JNI method for {@link #glStencilMaskSeparate glStencilMaskSeparate} */
	public static native void nglStencilMaskSeparate(int face, int mask, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glStencilMaskSeparate.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Controls the front and/or back writing of individual bits in the stencil planes.
	 *
	 * @param face whether front and/or back stencil writemask is updated. One of:<p/>{@link GL11#GL_FRONT FRONT}, {@link GL11#GL_BACK BACK}, {@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}
	 * @param mask a bit mask to enable and disable writing of individual bits in the stencil planes. Initially, the mask is all 1's.
	 */
	public static void glStencilMaskSeparate(int face, int mask) {
		long __functionAddress = getInstance().glStencilMaskSeparate;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglStencilMaskSeparate(face, mask, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GL20;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL20") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glCreateProgram) &&
			GL.isFunctionSupported(funcs.glDeleteProgram) &&
			GL.isFunctionSupported(funcs.glCreateShader) &&
			GL.isFunctionSupported(funcs.glDeleteShader) &&
			GL.isFunctionSupported(funcs.glAttachShader) &&
			GL.isFunctionSupported(funcs.glDetachShader) &&
			GL.isFunctionSupported(funcs.glShaderSource) &&
			GL.isFunctionSupported(funcs.glCompileShader) &&
			GL.isFunctionSupported(funcs.glLinkProgram) &&
			GL.isFunctionSupported(funcs.glUseProgram) &&
			GL.isFunctionSupported(funcs.glValidateProgram) &&
			GL.isFunctionSupported(funcs.glUniform1f) &&
			GL.isFunctionSupported(funcs.glUniform2f) &&
			GL.isFunctionSupported(funcs.glUniform3f) &&
			GL.isFunctionSupported(funcs.glUniform4f) &&
			GL.isFunctionSupported(funcs.glUniform1i) &&
			GL.isFunctionSupported(funcs.glUniform2i) &&
			GL.isFunctionSupported(funcs.glUniform3i) &&
			GL.isFunctionSupported(funcs.glUniform4i) &&
			GL.isFunctionSupported(funcs.glUniform1fv) &&
			GL.isFunctionSupported(funcs.glUniform2fv) &&
			GL.isFunctionSupported(funcs.glUniform3fv) &&
			GL.isFunctionSupported(funcs.glUniform4fv) &&
			GL.isFunctionSupported(funcs.glUniform1iv) &&
			GL.isFunctionSupported(funcs.glUniform2iv) &&
			GL.isFunctionSupported(funcs.glUniform3iv) &&
			GL.isFunctionSupported(funcs.glUniform4iv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix2fv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix3fv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix4fv) &&
			GL.isFunctionSupported(funcs.glGetShaderiv) &&
			GL.isFunctionSupported(funcs.glGetProgramiv) &&
			GL.isFunctionSupported(funcs.glGetShaderInfoLog) &&
			GL.isFunctionSupported(funcs.glGetProgramInfoLog) &&
			GL.isFunctionSupported(funcs.glGetAttachedShaders) &&
			GL.isFunctionSupported(funcs.glGetUniformLocation) &&
			GL.isFunctionSupported(funcs.glGetActiveUniform) &&
			GL.isFunctionSupported(funcs.glGetUniformfv) &&
			GL.isFunctionSupported(funcs.glGetUniformiv) &&
			GL.isFunctionSupported(funcs.glGetShaderSource) &&
			GL.isFunctionSupported(funcs.glVertexAttrib1f) &&
			GL.isFunctionSupported(funcs.glVertexAttrib1s) &&
			GL.isFunctionSupported(funcs.glVertexAttrib1d) &&
			GL.isFunctionSupported(funcs.glVertexAttrib2f) &&
			GL.isFunctionSupported(funcs.glVertexAttrib2s) &&
			GL.isFunctionSupported(funcs.glVertexAttrib2d) &&
			GL.isFunctionSupported(funcs.glVertexAttrib3f) &&
			GL.isFunctionSupported(funcs.glVertexAttrib3s) &&
			GL.isFunctionSupported(funcs.glVertexAttrib3d) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4f) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4s) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4d) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4Nub) &&
			GL.isFunctionSupported(funcs.glVertexAttrib1fv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib1sv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib1dv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib2fv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib2sv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib2dv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib3fv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib3sv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib3dv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4fv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4sv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4dv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4iv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4bv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4ubv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4usv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4uiv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4Nbv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4Nsv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4Niv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4Nubv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4Nusv) &&
			GL.isFunctionSupported(funcs.glVertexAttrib4Nuiv) &&
			GL.isFunctionSupported(funcs.glVertexAttribPointer) &&
			GL.isFunctionSupported(funcs.glEnableVertexAttribArray) &&
			GL.isFunctionSupported(funcs.glDisableVertexAttribArray) &&
			GL.isFunctionSupported(funcs.glBindAttribLocation) &&
			GL.isFunctionSupported(funcs.glGetActiveAttrib) &&
			GL.isFunctionSupported(funcs.glGetAttribLocation) &&
			GL.isFunctionSupported(funcs.glGetVertexAttribiv) &&
			GL.isFunctionSupported(funcs.glGetVertexAttribfv) &&
			GL.isFunctionSupported(funcs.glGetVertexAttribdv) &&
			GL.isFunctionSupported(funcs.glGetVertexAttribPointerv) &&
			GL.isFunctionSupported(funcs.glDrawBuffers) &&
			GL.isFunctionSupported(funcs.glBlendEquationSeparate) &&
			GL.isFunctionSupported(funcs.glStencilOpSeparate) &&
			GL.isFunctionSupported(funcs.glStencilFuncSeparate) &&
			GL.isFunctionSupported(funcs.glStencilMaskSeparate);

		return GL.checkExtension("OpenGL20", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GL20}. */
	public static final class Functions implements FunctionMap {

		public final long
			glCreateProgram,
			glDeleteProgram,
			glCreateShader,
			glDeleteShader,
			glAttachShader,
			glDetachShader,
			glShaderSource,
			glCompileShader,
			glLinkProgram,
			glUseProgram,
			glValidateProgram,
			glUniform1f,
			glUniform2f,
			glUniform3f,
			glUniform4f,
			glUniform1i,
			glUniform2i,
			glUniform3i,
			glUniform4i,
			glUniform1fv,
			glUniform2fv,
			glUniform3fv,
			glUniform4fv,
			glUniform1iv,
			glUniform2iv,
			glUniform3iv,
			glUniform4iv,
			glUniformMatrix2fv,
			glUniformMatrix3fv,
			glUniformMatrix4fv,
			glGetShaderiv,
			glGetProgramiv,
			glGetShaderInfoLog,
			glGetProgramInfoLog,
			glGetAttachedShaders,
			glGetUniformLocation,
			glGetActiveUniform,
			glGetUniformfv,
			glGetUniformiv,
			glGetShaderSource,
			glVertexAttrib1f,
			glVertexAttrib1s,
			glVertexAttrib1d,
			glVertexAttrib2f,
			glVertexAttrib2s,
			glVertexAttrib2d,
			glVertexAttrib3f,
			glVertexAttrib3s,
			glVertexAttrib3d,
			glVertexAttrib4f,
			glVertexAttrib4s,
			glVertexAttrib4d,
			glVertexAttrib4Nub,
			glVertexAttrib1fv,
			glVertexAttrib1sv,
			glVertexAttrib1dv,
			glVertexAttrib2fv,
			glVertexAttrib2sv,
			glVertexAttrib2dv,
			glVertexAttrib3fv,
			glVertexAttrib3sv,
			glVertexAttrib3dv,
			glVertexAttrib4fv,
			glVertexAttrib4sv,
			glVertexAttrib4dv,
			glVertexAttrib4iv,
			glVertexAttrib4bv,
			glVertexAttrib4ubv,
			glVertexAttrib4usv,
			glVertexAttrib4uiv,
			glVertexAttrib4Nbv,
			glVertexAttrib4Nsv,
			glVertexAttrib4Niv,
			glVertexAttrib4Nubv,
			glVertexAttrib4Nusv,
			glVertexAttrib4Nuiv,
			glVertexAttribPointer,
			glEnableVertexAttribArray,
			glDisableVertexAttribArray,
			glBindAttribLocation,
			glGetActiveAttrib,
			glGetAttribLocation,
			glGetVertexAttribiv,
			glGetVertexAttribfv,
			glGetVertexAttribdv,
			glGetVertexAttribPointerv,
			glDrawBuffers,
			glBlendEquationSeparate,
			glStencilOpSeparate,
			glStencilFuncSeparate,
			glStencilMaskSeparate;

		public Functions(FunctionProvider provider) {
			glCreateProgram = provider.getFunctionAddress("glCreateProgram");
			glDeleteProgram = provider.getFunctionAddress("glDeleteProgram");
			glCreateShader = provider.getFunctionAddress("glCreateShader");
			glDeleteShader = provider.getFunctionAddress("glDeleteShader");
			glAttachShader = provider.getFunctionAddress("glAttachShader");
			glDetachShader = provider.getFunctionAddress("glDetachShader");
			glShaderSource = provider.getFunctionAddress("glShaderSource");
			glCompileShader = provider.getFunctionAddress("glCompileShader");
			glLinkProgram = provider.getFunctionAddress("glLinkProgram");
			glUseProgram = provider.getFunctionAddress("glUseProgram");
			glValidateProgram = provider.getFunctionAddress("glValidateProgram");
			glUniform1f = provider.getFunctionAddress("glUniform1f");
			glUniform2f = provider.getFunctionAddress("glUniform2f");
			glUniform3f = provider.getFunctionAddress("glUniform3f");
			glUniform4f = provider.getFunctionAddress("glUniform4f");
			glUniform1i = provider.getFunctionAddress("glUniform1i");
			glUniform2i = provider.getFunctionAddress("glUniform2i");
			glUniform3i = provider.getFunctionAddress("glUniform3i");
			glUniform4i = provider.getFunctionAddress("glUniform4i");
			glUniform1fv = provider.getFunctionAddress("glUniform1fv");
			glUniform2fv = provider.getFunctionAddress("glUniform2fv");
			glUniform3fv = provider.getFunctionAddress("glUniform3fv");
			glUniform4fv = provider.getFunctionAddress("glUniform4fv");
			glUniform1iv = provider.getFunctionAddress("glUniform1iv");
			glUniform2iv = provider.getFunctionAddress("glUniform2iv");
			glUniform3iv = provider.getFunctionAddress("glUniform3iv");
			glUniform4iv = provider.getFunctionAddress("glUniform4iv");
			glUniformMatrix2fv = provider.getFunctionAddress("glUniformMatrix2fv");
			glUniformMatrix3fv = provider.getFunctionAddress("glUniformMatrix3fv");
			glUniformMatrix4fv = provider.getFunctionAddress("glUniformMatrix4fv");
			glGetShaderiv = provider.getFunctionAddress("glGetShaderiv");
			glGetProgramiv = provider.getFunctionAddress("glGetProgramiv");
			glGetShaderInfoLog = provider.getFunctionAddress("glGetShaderInfoLog");
			glGetProgramInfoLog = provider.getFunctionAddress("glGetProgramInfoLog");
			glGetAttachedShaders = provider.getFunctionAddress("glGetAttachedShaders");
			glGetUniformLocation = provider.getFunctionAddress("glGetUniformLocation");
			glGetActiveUniform = provider.getFunctionAddress("glGetActiveUniform");
			glGetUniformfv = provider.getFunctionAddress("glGetUniformfv");
			glGetUniformiv = provider.getFunctionAddress("glGetUniformiv");
			glGetShaderSource = provider.getFunctionAddress("glGetShaderSource");
			glVertexAttrib1f = provider.getFunctionAddress("glVertexAttrib1f");
			glVertexAttrib1s = provider.getFunctionAddress("glVertexAttrib1s");
			glVertexAttrib1d = provider.getFunctionAddress("glVertexAttrib1d");
			glVertexAttrib2f = provider.getFunctionAddress("glVertexAttrib2f");
			glVertexAttrib2s = provider.getFunctionAddress("glVertexAttrib2s");
			glVertexAttrib2d = provider.getFunctionAddress("glVertexAttrib2d");
			glVertexAttrib3f = provider.getFunctionAddress("glVertexAttrib3f");
			glVertexAttrib3s = provider.getFunctionAddress("glVertexAttrib3s");
			glVertexAttrib3d = provider.getFunctionAddress("glVertexAttrib3d");
			glVertexAttrib4f = provider.getFunctionAddress("glVertexAttrib4f");
			glVertexAttrib4s = provider.getFunctionAddress("glVertexAttrib4s");
			glVertexAttrib4d = provider.getFunctionAddress("glVertexAttrib4d");
			glVertexAttrib4Nub = provider.getFunctionAddress("glVertexAttrib4Nub");
			glVertexAttrib1fv = provider.getFunctionAddress("glVertexAttrib1fv");
			glVertexAttrib1sv = provider.getFunctionAddress("glVertexAttrib1sv");
			glVertexAttrib1dv = provider.getFunctionAddress("glVertexAttrib1dv");
			glVertexAttrib2fv = provider.getFunctionAddress("glVertexAttrib2fv");
			glVertexAttrib2sv = provider.getFunctionAddress("glVertexAttrib2sv");
			glVertexAttrib2dv = provider.getFunctionAddress("glVertexAttrib2dv");
			glVertexAttrib3fv = provider.getFunctionAddress("glVertexAttrib3fv");
			glVertexAttrib3sv = provider.getFunctionAddress("glVertexAttrib3sv");
			glVertexAttrib3dv = provider.getFunctionAddress("glVertexAttrib3dv");
			glVertexAttrib4fv = provider.getFunctionAddress("glVertexAttrib4fv");
			glVertexAttrib4sv = provider.getFunctionAddress("glVertexAttrib4sv");
			glVertexAttrib4dv = provider.getFunctionAddress("glVertexAttrib4dv");
			glVertexAttrib4iv = provider.getFunctionAddress("glVertexAttrib4iv");
			glVertexAttrib4bv = provider.getFunctionAddress("glVertexAttrib4bv");
			glVertexAttrib4ubv = provider.getFunctionAddress("glVertexAttrib4ubv");
			glVertexAttrib4usv = provider.getFunctionAddress("glVertexAttrib4usv");
			glVertexAttrib4uiv = provider.getFunctionAddress("glVertexAttrib4uiv");
			glVertexAttrib4Nbv = provider.getFunctionAddress("glVertexAttrib4Nbv");
			glVertexAttrib4Nsv = provider.getFunctionAddress("glVertexAttrib4Nsv");
			glVertexAttrib4Niv = provider.getFunctionAddress("glVertexAttrib4Niv");
			glVertexAttrib4Nubv = provider.getFunctionAddress("glVertexAttrib4Nubv");
			glVertexAttrib4Nusv = provider.getFunctionAddress("glVertexAttrib4Nusv");
			glVertexAttrib4Nuiv = provider.getFunctionAddress("glVertexAttrib4Nuiv");
			glVertexAttribPointer = provider.getFunctionAddress("glVertexAttribPointer");
			glEnableVertexAttribArray = provider.getFunctionAddress("glEnableVertexAttribArray");
			glDisableVertexAttribArray = provider.getFunctionAddress("glDisableVertexAttribArray");
			glBindAttribLocation = provider.getFunctionAddress("glBindAttribLocation");
			glGetActiveAttrib = provider.getFunctionAddress("glGetActiveAttrib");
			glGetAttribLocation = provider.getFunctionAddress("glGetAttribLocation");
			glGetVertexAttribiv = provider.getFunctionAddress("glGetVertexAttribiv");
			glGetVertexAttribfv = provider.getFunctionAddress("glGetVertexAttribfv");
			glGetVertexAttribdv = provider.getFunctionAddress("glGetVertexAttribdv");
			glGetVertexAttribPointerv = provider.getFunctionAddress("glGetVertexAttribPointerv");
			glDrawBuffers = provider.getFunctionAddress("glDrawBuffers");
			glBlendEquationSeparate = provider.getFunctionAddress("glBlendEquationSeparate");
			glStencilOpSeparate = provider.getFunctionAddress("glStencilOpSeparate");
			glStencilFuncSeparate = provider.getFunctionAddress("glStencilFuncSeparate");
			glStencilMaskSeparate = provider.getFunctionAddress("glStencilMaskSeparate");
		}

	}

}