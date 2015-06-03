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
 * The core OpenGL 2.0 functionality.
 * 
 * <p>Extensions promoted to core in this release:
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/shader_objects.txt">ARB_shader_objects</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/vertex_shader.txt">ARB_vertex_shader</a> and <a href="http://www.opengl.org/registry/specs/ARB/fragment_shader.txt">ARB_fragment_shader</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/shading_language_100.txt">ARB_shading_language_100</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/draw_buffers.txt">ARB_draw_buffers</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_non_power_of_two.txt">ARB_texture_non_power_of_two</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/point_sprite.txt">ARB_point_sprite</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ATI/separate_stencil.txt">ATI_separate_stencil</a> and <a href="http://www.opengl.org/registry/specs/EXT/stencil_two_side.txt">EXT_stencil_two_side</a></li>
 * </ul></p>
 */
public final class GL20 {

	/** Accepted by the {@code name} parameter of GetString. */
	public static final int GL_SHADING_LANGUAGE_VERSION = 0x8B8C;

	/** Accepted by the {@code pname} parameter of GetInteger. */
	public static final int GL_CURRENT_PROGRAM = 0x8B8D;

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
	public static final int GL_VERTEX_SHADER = 0x8B31;

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
	public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;

	/** Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv. */
	public static final int GL_FRAGMENT_SHADER = 0x8B30;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;

	/** Accepted by the {@code target} parameter of Hint and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;

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
	public static final int GL_POINT_SPRITE = 0x8861;

	/**
	 * When the {@code target} parameter of TexEnvf, TexEnvfv, TexEnvi, TexEnviv, GetTexEnvfv, or GetTexEnviv is POINT_SPRITE, then the value of
	 * {@code pname} may be.
	 */
	public static final int GL_COORD_REPLACE = 0x8862;

	/** Accepted by the {@code pname} parameter of PointParameter{if}v. */
	public static final int GL_POINT_SPRITE_COORD_ORIGIN = 0x8CA0;

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

	/** Function address. */
	@JavadocExclude
	public final long
		CreateProgram,
		DeleteProgram,
		IsProgram,
		CreateShader,
		DeleteShader,
		IsShader,
		AttachShader,
		DetachShader,
		ShaderSource,
		CompileShader,
		LinkProgram,
		UseProgram,
		ValidateProgram,
		Uniform1f,
		Uniform2f,
		Uniform3f,
		Uniform4f,
		Uniform1i,
		Uniform2i,
		Uniform3i,
		Uniform4i,
		Uniform1fv,
		Uniform2fv,
		Uniform3fv,
		Uniform4fv,
		Uniform1iv,
		Uniform2iv,
		Uniform3iv,
		Uniform4iv,
		UniformMatrix2fv,
		UniformMatrix3fv,
		UniformMatrix4fv,
		GetShaderiv,
		GetProgramiv,
		GetShaderInfoLog,
		GetProgramInfoLog,
		GetAttachedShaders,
		GetUniformLocation,
		GetActiveUniform,
		GetUniformfv,
		GetUniformiv,
		GetShaderSource,
		VertexAttrib1f,
		VertexAttrib1s,
		VertexAttrib1d,
		VertexAttrib2f,
		VertexAttrib2s,
		VertexAttrib2d,
		VertexAttrib3f,
		VertexAttrib3s,
		VertexAttrib3d,
		VertexAttrib4f,
		VertexAttrib4s,
		VertexAttrib4d,
		VertexAttrib4Nub,
		VertexAttrib1fv,
		VertexAttrib1sv,
		VertexAttrib1dv,
		VertexAttrib2fv,
		VertexAttrib2sv,
		VertexAttrib2dv,
		VertexAttrib3fv,
		VertexAttrib3sv,
		VertexAttrib3dv,
		VertexAttrib4fv,
		VertexAttrib4sv,
		VertexAttrib4dv,
		VertexAttrib4iv,
		VertexAttrib4bv,
		VertexAttrib4ubv,
		VertexAttrib4usv,
		VertexAttrib4uiv,
		VertexAttrib4Nbv,
		VertexAttrib4Nsv,
		VertexAttrib4Niv,
		VertexAttrib4Nubv,
		VertexAttrib4Nusv,
		VertexAttrib4Nuiv,
		VertexAttribPointer,
		EnableVertexAttribArray,
		DisableVertexAttribArray,
		BindAttribLocation,
		GetActiveAttrib,
		GetAttribLocation,
		GetVertexAttribiv,
		GetVertexAttribfv,
		GetVertexAttribdv,
		GetVertexAttribPointerv,
		DrawBuffers,
		BlendEquationSeparate,
		StencilOpSeparate,
		StencilFuncSeparate,
		StencilMaskSeparate;

	@JavadocExclude
	public GL20(FunctionProvider provider) {
		CreateProgram = provider.getFunctionAddress("glCreateProgram");
		DeleteProgram = provider.getFunctionAddress("glDeleteProgram");
		IsProgram = provider.getFunctionAddress("glIsProgram");
		CreateShader = provider.getFunctionAddress("glCreateShader");
		DeleteShader = provider.getFunctionAddress("glDeleteShader");
		IsShader = provider.getFunctionAddress("glIsShader");
		AttachShader = provider.getFunctionAddress("glAttachShader");
		DetachShader = provider.getFunctionAddress("glDetachShader");
		ShaderSource = provider.getFunctionAddress("glShaderSource");
		CompileShader = provider.getFunctionAddress("glCompileShader");
		LinkProgram = provider.getFunctionAddress("glLinkProgram");
		UseProgram = provider.getFunctionAddress("glUseProgram");
		ValidateProgram = provider.getFunctionAddress("glValidateProgram");
		Uniform1f = provider.getFunctionAddress("glUniform1f");
		Uniform2f = provider.getFunctionAddress("glUniform2f");
		Uniform3f = provider.getFunctionAddress("glUniform3f");
		Uniform4f = provider.getFunctionAddress("glUniform4f");
		Uniform1i = provider.getFunctionAddress("glUniform1i");
		Uniform2i = provider.getFunctionAddress("glUniform2i");
		Uniform3i = provider.getFunctionAddress("glUniform3i");
		Uniform4i = provider.getFunctionAddress("glUniform4i");
		Uniform1fv = provider.getFunctionAddress("glUniform1fv");
		Uniform2fv = provider.getFunctionAddress("glUniform2fv");
		Uniform3fv = provider.getFunctionAddress("glUniform3fv");
		Uniform4fv = provider.getFunctionAddress("glUniform4fv");
		Uniform1iv = provider.getFunctionAddress("glUniform1iv");
		Uniform2iv = provider.getFunctionAddress("glUniform2iv");
		Uniform3iv = provider.getFunctionAddress("glUniform3iv");
		Uniform4iv = provider.getFunctionAddress("glUniform4iv");
		UniformMatrix2fv = provider.getFunctionAddress("glUniformMatrix2fv");
		UniformMatrix3fv = provider.getFunctionAddress("glUniformMatrix3fv");
		UniformMatrix4fv = provider.getFunctionAddress("glUniformMatrix4fv");
		GetShaderiv = provider.getFunctionAddress("glGetShaderiv");
		GetProgramiv = provider.getFunctionAddress("glGetProgramiv");
		GetShaderInfoLog = provider.getFunctionAddress("glGetShaderInfoLog");
		GetProgramInfoLog = provider.getFunctionAddress("glGetProgramInfoLog");
		GetAttachedShaders = provider.getFunctionAddress("glGetAttachedShaders");
		GetUniformLocation = provider.getFunctionAddress("glGetUniformLocation");
		GetActiveUniform = provider.getFunctionAddress("glGetActiveUniform");
		GetUniformfv = provider.getFunctionAddress("glGetUniformfv");
		GetUniformiv = provider.getFunctionAddress("glGetUniformiv");
		GetShaderSource = provider.getFunctionAddress("glGetShaderSource");
		VertexAttrib1f = provider.getFunctionAddress("glVertexAttrib1f");
		VertexAttrib1s = provider.getFunctionAddress("glVertexAttrib1s");
		VertexAttrib1d = provider.getFunctionAddress("glVertexAttrib1d");
		VertexAttrib2f = provider.getFunctionAddress("glVertexAttrib2f");
		VertexAttrib2s = provider.getFunctionAddress("glVertexAttrib2s");
		VertexAttrib2d = provider.getFunctionAddress("glVertexAttrib2d");
		VertexAttrib3f = provider.getFunctionAddress("glVertexAttrib3f");
		VertexAttrib3s = provider.getFunctionAddress("glVertexAttrib3s");
		VertexAttrib3d = provider.getFunctionAddress("glVertexAttrib3d");
		VertexAttrib4f = provider.getFunctionAddress("glVertexAttrib4f");
		VertexAttrib4s = provider.getFunctionAddress("glVertexAttrib4s");
		VertexAttrib4d = provider.getFunctionAddress("glVertexAttrib4d");
		VertexAttrib4Nub = provider.getFunctionAddress("glVertexAttrib4Nub");
		VertexAttrib1fv = provider.getFunctionAddress("glVertexAttrib1fv");
		VertexAttrib1sv = provider.getFunctionAddress("glVertexAttrib1sv");
		VertexAttrib1dv = provider.getFunctionAddress("glVertexAttrib1dv");
		VertexAttrib2fv = provider.getFunctionAddress("glVertexAttrib2fv");
		VertexAttrib2sv = provider.getFunctionAddress("glVertexAttrib2sv");
		VertexAttrib2dv = provider.getFunctionAddress("glVertexAttrib2dv");
		VertexAttrib3fv = provider.getFunctionAddress("glVertexAttrib3fv");
		VertexAttrib3sv = provider.getFunctionAddress("glVertexAttrib3sv");
		VertexAttrib3dv = provider.getFunctionAddress("glVertexAttrib3dv");
		VertexAttrib4fv = provider.getFunctionAddress("glVertexAttrib4fv");
		VertexAttrib4sv = provider.getFunctionAddress("glVertexAttrib4sv");
		VertexAttrib4dv = provider.getFunctionAddress("glVertexAttrib4dv");
		VertexAttrib4iv = provider.getFunctionAddress("glVertexAttrib4iv");
		VertexAttrib4bv = provider.getFunctionAddress("glVertexAttrib4bv");
		VertexAttrib4ubv = provider.getFunctionAddress("glVertexAttrib4ubv");
		VertexAttrib4usv = provider.getFunctionAddress("glVertexAttrib4usv");
		VertexAttrib4uiv = provider.getFunctionAddress("glVertexAttrib4uiv");
		VertexAttrib4Nbv = provider.getFunctionAddress("glVertexAttrib4Nbv");
		VertexAttrib4Nsv = provider.getFunctionAddress("glVertexAttrib4Nsv");
		VertexAttrib4Niv = provider.getFunctionAddress("glVertexAttrib4Niv");
		VertexAttrib4Nubv = provider.getFunctionAddress("glVertexAttrib4Nubv");
		VertexAttrib4Nusv = provider.getFunctionAddress("glVertexAttrib4Nusv");
		VertexAttrib4Nuiv = provider.getFunctionAddress("glVertexAttrib4Nuiv");
		VertexAttribPointer = provider.getFunctionAddress("glVertexAttribPointer");
		EnableVertexAttribArray = provider.getFunctionAddress("glEnableVertexAttribArray");
		DisableVertexAttribArray = provider.getFunctionAddress("glDisableVertexAttribArray");
		BindAttribLocation = provider.getFunctionAddress("glBindAttribLocation");
		GetActiveAttrib = provider.getFunctionAddress("glGetActiveAttrib");
		GetAttribLocation = provider.getFunctionAddress("glGetAttribLocation");
		GetVertexAttribiv = provider.getFunctionAddress("glGetVertexAttribiv");
		GetVertexAttribfv = provider.getFunctionAddress("glGetVertexAttribfv");
		GetVertexAttribdv = provider.getFunctionAddress("glGetVertexAttribdv");
		GetVertexAttribPointerv = provider.getFunctionAddress("glGetVertexAttribPointerv");
		DrawBuffers = provider.getFunctionAddress("glDrawBuffers");
		BlendEquationSeparate = provider.getFunctionAddress("glBlendEquationSeparate");
		StencilOpSeparate = provider.getFunctionAddress("glStencilOpSeparate");
		StencilFuncSeparate = provider.getFunctionAddress("glStencilFuncSeparate");
		StencilMaskSeparate = provider.getFunctionAddress("glStencilMaskSeparate");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL20} instance for the current context. */
	public static GL20 getInstance() {
		return checkFunctionality(GL.getCapabilities().__GL20);
	}

	static GL20 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL20") ) return null;

		GL20 funcs = new GL20(provider);

		boolean supported = checkFunctions(
			funcs.CreateProgram, funcs.DeleteProgram, funcs.IsProgram, funcs.CreateShader, funcs.DeleteShader, funcs.IsShader, funcs.AttachShader, 
			funcs.DetachShader, funcs.ShaderSource, funcs.CompileShader, funcs.LinkProgram, funcs.UseProgram, funcs.ValidateProgram, funcs.Uniform1f, 
			funcs.Uniform2f, funcs.Uniform3f, funcs.Uniform4f, funcs.Uniform1i, funcs.Uniform2i, funcs.Uniform3i, funcs.Uniform4i, funcs.Uniform1fv, 
			funcs.Uniform2fv, funcs.Uniform3fv, funcs.Uniform4fv, funcs.Uniform1iv, funcs.Uniform2iv, funcs.Uniform3iv, funcs.Uniform4iv, 
			funcs.UniformMatrix2fv, funcs.UniformMatrix3fv, funcs.UniformMatrix4fv, funcs.GetShaderiv, funcs.GetProgramiv, funcs.GetShaderInfoLog, 
			funcs.GetProgramInfoLog, funcs.GetAttachedShaders, funcs.GetUniformLocation, funcs.GetActiveUniform, funcs.GetUniformfv, funcs.GetUniformiv, 
			funcs.GetShaderSource, funcs.VertexAttrib1f, funcs.VertexAttrib1s, funcs.VertexAttrib1d, funcs.VertexAttrib2f, funcs.VertexAttrib2s, 
			funcs.VertexAttrib2d, funcs.VertexAttrib3f, funcs.VertexAttrib3s, funcs.VertexAttrib3d, funcs.VertexAttrib4f, funcs.VertexAttrib4s, 
			funcs.VertexAttrib4d, funcs.VertexAttrib4Nub, funcs.VertexAttrib1fv, funcs.VertexAttrib1sv, funcs.VertexAttrib1dv, funcs.VertexAttrib2fv, 
			funcs.VertexAttrib2sv, funcs.VertexAttrib2dv, funcs.VertexAttrib3fv, funcs.VertexAttrib3sv, funcs.VertexAttrib3dv, funcs.VertexAttrib4fv, 
			funcs.VertexAttrib4sv, funcs.VertexAttrib4dv, funcs.VertexAttrib4iv, funcs.VertexAttrib4bv, funcs.VertexAttrib4ubv, funcs.VertexAttrib4usv, 
			funcs.VertexAttrib4uiv, funcs.VertexAttrib4Nbv, funcs.VertexAttrib4Nsv, funcs.VertexAttrib4Niv, funcs.VertexAttrib4Nubv, funcs.VertexAttrib4Nusv, 
			funcs.VertexAttrib4Nuiv, funcs.VertexAttribPointer, funcs.EnableVertexAttribArray, funcs.DisableVertexAttribArray, funcs.BindAttribLocation, 
			funcs.GetActiveAttrib, funcs.GetAttribLocation, funcs.GetVertexAttribiv, funcs.GetVertexAttribfv, funcs.GetVertexAttribdv, 
			funcs.GetVertexAttribPointerv, funcs.DrawBuffers, funcs.BlendEquationSeparate, funcs.StencilOpSeparate, funcs.StencilFuncSeparate, 
			funcs.StencilMaskSeparate
		);

		return GL.checkExtension("OpenGL20", funcs, supported);
	}

	// --- [ glCreateProgram ] ---

	/** JNI method for {@link #glCreateProgram CreateProgram} */
	@JavadocExclude
	public static native int nglCreateProgram(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateProgram.xhtml">OpenGL SDK Reference</a></p>
	 * 
Creates a program object.
	 */
	public static int glCreateProgram() {
		long __functionAddress = getInstance().CreateProgram;
		return nglCreateProgram(__functionAddress);
	}

	// --- [ glDeleteProgram ] ---

	/** JNI method for {@link #glDeleteProgram DeleteProgram} */
	@JavadocExclude
	public static native void nglDeleteProgram(int program, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteProgram.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes a program object.
	 *
	 * @param program the program object to be deleted
	 */
	public static void glDeleteProgram(int program) {
		long __functionAddress = getInstance().DeleteProgram;
		nglDeleteProgram(program, __functionAddress);
	}

	// --- [ glIsProgram ] ---

	/** JNI method for {@link #glIsProgram IsProgram} */
	@JavadocExclude
	public static native boolean nglIsProgram(int program, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsProgram.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@link GL11#GL_TRUE TRUE} if {@code program} is the name of a program object. If {@code program} is zero, or a non-zero value that is not the name of a program
	 * object, IsProgram returns {@link GL11#GL_FALSE FALSE}. No error is generated if program is not a valid program object name.
	 *
	 * @param program the program object name to query
	 */
	public static boolean glIsProgram(int program) {
		long __functionAddress = getInstance().IsProgram;
		return nglIsProgram(program, __functionAddress);
	}

	// --- [ glCreateShader ] ---

	/** JNI method for {@link #glCreateShader CreateShader} */
	@JavadocExclude
	public static native int nglCreateShader(int type, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateShader.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Creates a shader object.
	 *
	 * @param type the type of shader to be created. One of:<br>{@link #GL_VERTEX_SHADER VERTEX_SHADER}, {@link #GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 */
	public static int glCreateShader(int type) {
		long __functionAddress = getInstance().CreateShader;
		return nglCreateShader(type, __functionAddress);
	}

	// --- [ glDeleteShader ] ---

	/** JNI method for {@link #glDeleteShader DeleteShader} */
	@JavadocExclude
	public static native void nglDeleteShader(int shader, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteShader.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes a shader object.
	 *
	 * @param shader the shader object to be deleted
	 */
	public static void glDeleteShader(int shader) {
		long __functionAddress = getInstance().DeleteShader;
		nglDeleteShader(shader, __functionAddress);
	}

	// --- [ glIsShader ] ---

	/** JNI method for {@link #glIsShader IsShader} */
	@JavadocExclude
	public static native boolean nglIsShader(int shader, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsShader.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@link GL11#GL_TRUE TRUE} if {@code shader} is the name of a shader object. If {@code shader} is zero, or a nonzero value that is not the name of a shader
	 * object, IsShader returns {@link GL11#GL_FALSE FALSE}. No error is generated if shader is not a valid shader object name.
	 *
	 * @param shader the shader object name to query
	 */
	public static boolean glIsShader(int shader) {
		long __functionAddress = getInstance().IsShader;
		return nglIsShader(shader, __functionAddress);
	}

	// --- [ glAttachShader ] ---

	/** JNI method for {@link #glAttachShader AttachShader} */
	@JavadocExclude
	public static native void nglAttachShader(int program, int shader, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glAttachShader.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Attaches a shader object to a program object.
	 * 
	 * <p>In order to create a complete shader program, there must be a way to specify the list of things that will be linked together. Program objects provide
	 * this mechanism. Shaders that are to be linked together in a program object must first be attached to that program object. glAttachShader attaches the
	 * shader object specified by shader to the program object specified by program. This indicates that shader will be included in link operations that will
	 * be performed on program.</p>
	 * 
	 * <p>All operations that can be performed on a shader object are valid whether or not the shader object is attached to a program object. It is permissible to
	 * attach a shader object to a program object before source code has been loaded into the shader object or before the shader object has been compiled. It
	 * is permissible to attach multiple shader objects of the same type because each may contain a portion of the complete shader. It is also permissible to
	 * attach a shader object to more than one program object. If a shader object is deleted while it is attached to a program object, it will be flagged for
	 * deletion, and deletion will not occur until glDetachShader is called to detach it from all program objects to which it is attached.</p>
	 *
	 * @param program the program object to which a shader object will be attached
	 * @param shader  the shader object that is to be attached
	 */
	public static void glAttachShader(int program, int shader) {
		long __functionAddress = getInstance().AttachShader;
		nglAttachShader(program, shader, __functionAddress);
	}

	// --- [ glDetachShader ] ---

	/** JNI method for {@link #glDetachShader DetachShader} */
	@JavadocExclude
	public static native void nglDetachShader(int program, int shader, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDetachShader.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Detaches a shader object from a program object to which it is attached.
	 *
	 * @param program the program object from which to detach the shader object
	 * @param shader  the shader object to be detached
	 */
	public static void glDetachShader(int program, int shader) {
		long __functionAddress = getInstance().DetachShader;
		nglDetachShader(program, shader, __functionAddress);
	}

	// --- [ glShaderSource ] ---

	/** JNI method for {@link #glShaderSource ShaderSource} */
	@JavadocExclude
	public static native void nglShaderSource(int shader, int count, long strings, long length, long __functionAddress);

	/** Unsafe version of {@link #glShaderSource ShaderSource} */
	@JavadocExclude
	public static void nglShaderSource(int shader, int count, long strings, long length) {
		long __functionAddress = getInstance().ShaderSource;
		nglShaderSource(shader, count, strings, length, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glShaderSource.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the source code in {@code shader} to the source code in the array of strings specified by {@code strings}. Any source code previously stored in the
	 * shader object is completely replaced. The number of strings in the array is specified by {@code count}. If {@code length} is NULL, each string is
	 * assumed to be null terminated. If {@code length} is a value other than NULL, it points to an array containing a string length for each of the
	 * corresponding elements of {@code strings}. Each element in the length array may contain the length of the corresponding string (the null character is not
	 * counted as part of the string length) or a value less than 0 to indicate that the string is null terminated. The source code strings are not scanned or
	 * parsed at this time; they are simply copied into the specified shader object.
	 *
	 * @param shader  the shader object whose source code is to be replaced
	 * @param count   the number of elements in the string and length arrays
	 * @param strings an array of pointers to strings containing the source code to be loaded into the shader
	 * @param length  an array of string lengths
	 */
	public static void glShaderSource(int shader, int count, ByteBuffer strings, ByteBuffer length) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(strings, count << POINTER_SHIFT);
			if ( length != null ) checkBuffer(length, count << 2);
		}
		nglShaderSource(shader, count, memAddress(strings), memAddressSafe(length));
	}

	/** Alternative version of: {@link #glShaderSource ShaderSource} */
	public static void glShaderSource(int shader, PointerBuffer strings, IntBuffer length) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, strings.remaining());
		nglShaderSource(shader, strings.remaining(), memAddress(strings), memAddressSafe(length));
	}

	/** Array version of: {@link #glShaderSource ShaderSource} */
	public static void glShaderSource(int shader, CharSequence... strings) {
		APIBuffer __buffer = apiBuffer();
		int stringsLengths = __buffer.bufferParam(strings.length << 2);
		for ( int i = 0; i < strings.length; i++ )
			__buffer.intParam(stringsLengths, i, strings[i].length());
		int stringsAddress = __buffer.bufferParam(strings.length << POINTER_SHIFT);
		ByteBuffer[] stringsBuffers = new ByteBuffer[strings.length];
		for ( int i = 0; i < strings.length; i++ )
			__buffer.pointerParam(stringsAddress, i, memAddress(stringsBuffers[i] = memEncodeUTF8(strings[i], false)));
		nglShaderSource(shader, strings.length, __buffer.address(stringsAddress), __buffer.address(stringsLengths));
	}

	/** Single string version of: {@link #glShaderSource ShaderSource} */
	public static void glShaderSource(int shader, CharSequence string) {
		APIBuffer __buffer = apiBuffer();
		int stringsLengths = __buffer.intParam(string.length());
		ByteBuffer stringBuffers = memEncodeUTF8(string, false);
		int stringsAddress = __buffer.pointerParam(memAddress(stringBuffers));
		nglShaderSource(shader, 1, __buffer.address(stringsAddress), __buffer.address(stringsLengths));
	}

	// --- [ glCompileShader ] ---

	/** JNI method for {@link #glCompileShader CompileShader} */
	@JavadocExclude
	public static native void nglCompileShader(int shader, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompileShader.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Compiles a shader object.
	 *
	 * @param shader the shader object to be compiled
	 */
	public static void glCompileShader(int shader) {
		long __functionAddress = getInstance().CompileShader;
		nglCompileShader(shader, __functionAddress);
	}

	// --- [ glLinkProgram ] ---

	/** JNI method for {@link #glLinkProgram LinkProgram} */
	@JavadocExclude
	public static native void nglLinkProgram(int program, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glLinkProgram.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Links a program object.
	 *
	 * @param program the program object to be linked
	 */
	public static void glLinkProgram(int program) {
		long __functionAddress = getInstance().LinkProgram;
		nglLinkProgram(program, __functionAddress);
	}

	// --- [ glUseProgram ] ---

	/** JNI method for {@link #glUseProgram UseProgram} */
	@JavadocExclude
	public static native void nglUseProgram(int program, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUseProgram.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Installs a program object as part of current rendering state.
	 *
	 * @param program the program object whose executables are to be used as part of current rendering state
	 */
	public static void glUseProgram(int program) {
		long __functionAddress = getInstance().UseProgram;
		nglUseProgram(program, __functionAddress);
	}

	// --- [ glValidateProgram ] ---

	/** JNI method for {@link #glValidateProgram ValidateProgram} */
	@JavadocExclude
	public static native void nglValidateProgram(int program, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glValidateProgram.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Validates a program object.
	 *
	 * @param program the program object to be validated
	 */
	public static void glValidateProgram(int program) {
		long __functionAddress = getInstance().ValidateProgram;
		nglValidateProgram(program, __functionAddress);
	}

	// --- [ glUniform1f ] ---

	/** JNI method for {@link #glUniform1f Uniform1f} */
	@JavadocExclude
	public static native void nglUniform1f(int location, float v0, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform1f.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a float uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform value
	 */
	public static void glUniform1f(int location, float v0) {
		long __functionAddress = getInstance().Uniform1f;
		nglUniform1f(location, v0, __functionAddress);
	}

	// --- [ glUniform2f ] ---

	/** JNI method for {@link #glUniform2f Uniform2f} */
	@JavadocExclude
	public static native void nglUniform2f(int location, float v0, float v1, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform2f.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a vec2 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 */
	public static void glUniform2f(int location, float v0, float v1) {
		long __functionAddress = getInstance().Uniform2f;
		nglUniform2f(location, v0, v1, __functionAddress);
	}

	// --- [ glUniform3f ] ---

	/** JNI method for {@link #glUniform3f Uniform3f} */
	@JavadocExclude
	public static native void nglUniform3f(int location, float v0, float v1, float v2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform3f.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a vec3 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 */
	public static void glUniform3f(int location, float v0, float v1, float v2) {
		long __functionAddress = getInstance().Uniform3f;
		nglUniform3f(location, v0, v1, v2, __functionAddress);
	}

	// --- [ glUniform4f ] ---

	/** JNI method for {@link #glUniform4f Uniform4f} */
	@JavadocExclude
	public static native void nglUniform4f(int location, float v0, float v1, float v2, float v3, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform4f.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a vec4 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 * @param v3       the uniform w value
	 */
	public static void glUniform4f(int location, float v0, float v1, float v2, float v3) {
		long __functionAddress = getInstance().Uniform4f;
		nglUniform4f(location, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glUniform1i ] ---

	/** JNI method for {@link #glUniform1i Uniform1i} */
	@JavadocExclude
	public static native void nglUniform1i(int location, int v0, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform1i.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of an int uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform value
	 */
	public static void glUniform1i(int location, int v0) {
		long __functionAddress = getInstance().Uniform1i;
		nglUniform1i(location, v0, __functionAddress);
	}

	// --- [ glUniform2i ] ---

	/** JNI method for {@link #glUniform2i Uniform2i} */
	@JavadocExclude
	public static native void nglUniform2i(int location, int v0, int v1, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform2i.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a ivec2 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 */
	public static void glUniform2i(int location, int v0, int v1) {
		long __functionAddress = getInstance().Uniform2i;
		nglUniform2i(location, v0, v1, __functionAddress);
	}

	// --- [ glUniform3i ] ---

	/** JNI method for {@link #glUniform3i Uniform3i} */
	@JavadocExclude
	public static native void nglUniform3i(int location, int v0, int v1, int v2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform3i.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a ivec3 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 */
	public static void glUniform3i(int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().Uniform3i;
		nglUniform3i(location, v0, v1, v2, __functionAddress);
	}

	// --- [ glUniform4i ] ---

	/** JNI method for {@link #glUniform4i Uniform4i} */
	@JavadocExclude
	public static native void nglUniform4i(int location, int v0, int v1, int v2, int v3, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform4i.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a ivec4 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 * @param v3       the uniform w value
	 */
	public static void glUniform4i(int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().Uniform4i;
		nglUniform4i(location, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glUniform1fv ] ---

	/** JNI method for {@link #glUniform1fv Uniform1fv} */
	@JavadocExclude
	public static native void nglUniform1fv(int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniform1fv Uniform1fv} */
	@JavadocExclude
	public static void nglUniform1fv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform1fv;
		nglUniform1fv(location, count, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform1.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single float uniform variable or a float uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform1fv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglUniform1fv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1fv Uniform1fv} */
	public static void glUniform1fv(int location, FloatBuffer value) {
		nglUniform1fv(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2fv ] ---

	/** JNI method for {@link #glUniform2fv Uniform2fv} */
	@JavadocExclude
	public static native void nglUniform2fv(int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniform2fv Uniform2fv} */
	@JavadocExclude
	public static void nglUniform2fv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform2fv;
		nglUniform2fv(location, count, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single vec2 uniform variable or a vec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform2fv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglUniform2fv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2fv Uniform2fv} */
	public static void glUniform2fv(int location, FloatBuffer value) {
		nglUniform2fv(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3fv ] ---

	/** JNI method for {@link #glUniform3fv Uniform3fv} */
	@JavadocExclude
	public static native void nglUniform3fv(int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniform3fv Uniform3fv} */
	@JavadocExclude
	public static void nglUniform3fv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform3fv;
		nglUniform3fv(location, count, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single vec3 uniform variable or a vec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform3fv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglUniform3fv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3fv Uniform3fv} */
	public static void glUniform3fv(int location, FloatBuffer value) {
		nglUniform3fv(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4fv ] ---

	/** JNI method for {@link #glUniform4fv Uniform4fv} */
	@JavadocExclude
	public static native void nglUniform4fv(int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniform4fv Uniform4fv} */
	@JavadocExclude
	public static void nglUniform4fv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform4fv;
		nglUniform4fv(location, count, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single vec4 uniform variable or a vec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform4fv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglUniform4fv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4fv Uniform4fv} */
	public static void glUniform4fv(int location, FloatBuffer value) {
		nglUniform4fv(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glUniform1iv ] ---

	/** JNI method for {@link #glUniform1iv Uniform1iv} */
	@JavadocExclude
	public static native void nglUniform1iv(int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniform1iv Uniform1iv} */
	@JavadocExclude
	public static void nglUniform1iv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform1iv;
		nglUniform1iv(location, count, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform1.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single int uniform variable or a int uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform1iv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglUniform1iv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1iv Uniform1iv} */
	public static void glUniform1iv(int location, IntBuffer value) {
		nglUniform1iv(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2iv ] ---

	/** JNI method for {@link #glUniform2iv Uniform2iv} */
	@JavadocExclude
	public static native void nglUniform2iv(int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniform2iv Uniform2iv} */
	@JavadocExclude
	public static void nglUniform2iv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform2iv;
		nglUniform2iv(location, count, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single ivec2 uniform variable or a ivec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform2iv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglUniform2iv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2iv Uniform2iv} */
	public static void glUniform2iv(int location, IntBuffer value) {
		nglUniform2iv(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3iv ] ---

	/** JNI method for {@link #glUniform3iv Uniform3iv} */
	@JavadocExclude
	public static native void nglUniform3iv(int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniform3iv Uniform3iv} */
	@JavadocExclude
	public static void nglUniform3iv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform3iv;
		nglUniform3iv(location, count, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single ivec3 uniform variable or a ivec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform3iv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglUniform3iv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3iv Uniform3iv} */
	public static void glUniform3iv(int location, IntBuffer value) {
		nglUniform3iv(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4iv ] ---

	/** JNI method for {@link #glUniform4iv Uniform4iv} */
	@JavadocExclude
	public static native void nglUniform4iv(int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniform4iv Uniform4iv} */
	@JavadocExclude
	public static void nglUniform4iv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform4iv;
		nglUniform4iv(location, count, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single ivec4 uniform variable or a ivec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform4iv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglUniform4iv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4iv Uniform4iv} */
	public static void glUniform4iv(int location, IntBuffer value) {
		nglUniform4iv(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glUniformMatrix2fv ] ---

	/** JNI method for {@link #glUniformMatrix2fv UniformMatrix2fv} */
	@JavadocExclude
	public static native void nglUniformMatrix2fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix2fv UniformMatrix2fv} */
	@JavadocExclude
	public static void nglUniformMatrix2fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2fv;
		nglUniformMatrix2fv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single mat2 uniform variable or a mat2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix2fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglUniformMatrix2fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2fv UniformMatrix2fv} */
	public static void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix2fv(location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3fv ] ---

	/** JNI method for {@link #glUniformMatrix3fv UniformMatrix3fv} */
	@JavadocExclude
	public static native void nglUniformMatrix3fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix3fv UniformMatrix3fv} */
	@JavadocExclude
	public static void nglUniformMatrix3fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3fv;
		nglUniformMatrix3fv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single mat3 uniform variable or a mat3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix3fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 9) << 2);
		nglUniformMatrix3fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3fv UniformMatrix3fv} */
	public static void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix3fv(location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4fv ] ---

	/** JNI method for {@link #glUniformMatrix4fv UniformMatrix4fv} */
	@JavadocExclude
	public static native void nglUniformMatrix4fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix4fv UniformMatrix4fv} */
	@JavadocExclude
	public static void nglUniformMatrix4fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4fv;
		nglUniformMatrix4fv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single mat4 uniform variable or a mat4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix4fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 4) << 2);
		nglUniformMatrix4fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4fv UniformMatrix4fv} */
	public static void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4fv(location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glGetShaderiv ] ---

	/** JNI method for {@link #glGetShaderiv GetShaderiv} */
	@JavadocExclude
	public static native void nglGetShaderiv(int shader, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetShaderiv GetShaderiv} */
	@JavadocExclude
	public static void nglGetShaderiv(int shader, int pname, long params) {
		long __functionAddress = getInstance().GetShaderiv;
		nglGetShaderiv(shader, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetShader.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns a parameter from a shader object.
	 *
	 * @param shader the shader object to be queried
	 * @param pname  the object parameter. One of:<br>{@link #GL_SHADER_TYPE SHADER_TYPE}, {@link #GL_DELETE_STATUS DELETE_STATUS}, {@link #GL_COMPILE_STATUS COMPILE_STATUS}, {@link #GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}, {@link #GL_SHADER_SOURCE_LENGTH SHADER_SOURCE_LENGTH}
	 * @param params the requested object parameter
	 */
	public static void glGetShaderiv(int shader, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetShaderiv(shader, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetShaderiv GetShaderiv} */
	public static void glGetShaderiv(int shader, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetShaderiv(shader, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetShaderiv GetShaderiv} */
	public static int glGetShaderi(int shader, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetShaderiv(shader, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetProgramiv ] ---

	/** JNI method for {@link #glGetProgramiv GetProgramiv} */
	@JavadocExclude
	public static native void nglGetProgramiv(int program, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramiv GetProgramiv} */
	@JavadocExclude
	public static void nglGetProgramiv(int program, int pname, long params) {
		long __functionAddress = getInstance().GetProgramiv;
		nglGetProgramiv(program, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetProgram.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns a parameter from a program object.
	 *
	 * @param program the program object to be queried
	 * @param pname   the object parameter. One of:<br>{@link #GL_DELETE_STATUS DELETE_STATUS}, {@link #GL_LINK_STATUS LINK_STATUS}, {@link #GL_VALIDATE_STATUS VALIDATE_STATUS}, {@link #GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}, {@link #GL_ATTACHED_SHADERS ATTACHED_SHADERS}, {@link #GL_ACTIVE_ATTRIBUTES ACTIVE_ATTRIBUTES}, {@link #GL_ACTIVE_ATTRIBUTE_MAX_LENGTH ACTIVE_ATTRIBUTE_MAX_LENGTH}, {@link #GL_ACTIVE_UNIFORMS ACTIVE_UNIFORMS}, {@link #GL_ACTIVE_UNIFORM_MAX_LENGTH ACTIVE_UNIFORM_MAX_LENGTH}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_MODE TRANSFORM_FEEDBACK_BUFFER_MODE}, {@link GL30#GL_TRANSFORM_FEEDBACK_VARYINGS TRANSFORM_FEEDBACK_VARYINGS}, {@link GL30#GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH}, {@link GL31#GL_ACTIVE_UNIFORM_BLOCKS ACTIVE_UNIFORM_BLOCKS}, {@link GL31#GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH}, {@link GL32#GL_GEOMETRY_VERTICES_OUT GEOMETRY_VERTICES_OUT}, {@link GL32#GL_GEOMETRY_INPUT_TYPE GEOMETRY_INPUT_TYPE}, {@link GL32#GL_GEOMETRY_OUTPUT_TYPE GEOMETRY_OUTPUT_TYPE}, {@link GL41#GL_PROGRAM_BINARY_LENGTH PROGRAM_BINARY_LENGTH}, {@link GL42#GL_ACTIVE_ATOMIC_COUNTER_BUFFERS ACTIVE_ATOMIC_COUNTER_BUFFERS}, {@link GL43#GL_COMPUTE_WORK_GROUP_SIZE COMPUTE_WORK_GROUP_SIZE}
	 * @param params  the requested object parameter
	 */
	public static void glGetProgramiv(int program, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetProgramiv(program, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetProgramiv GetProgramiv} */
	public static void glGetProgramiv(int program, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetProgramiv(program, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetProgramiv GetProgramiv} */
	public static int glGetProgrami(int program, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetProgramiv(program, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetShaderInfoLog ] ---

	/** JNI method for {@link #glGetShaderInfoLog GetShaderInfoLog} */
	@JavadocExclude
	public static native void nglGetShaderInfoLog(int shader, int maxLength, long length, long infoLog, long __functionAddress);

	/** Unsafe version of {@link #glGetShaderInfoLog GetShaderInfoLog} */
	@JavadocExclude
	public static void nglGetShaderInfoLog(int shader, int maxLength, long length, long infoLog) {
		long __functionAddress = getInstance().GetShaderInfoLog;
		nglGetShaderInfoLog(shader, maxLength, length, infoLog, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetShaderInfoLog.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the information log for a shader object.
	 *
	 * @param shader    the shader object whose information log is to be queried
	 * @param maxLength the size of the character buffer for storing the returned information log
	 * @param length    the length of the string returned in {@code infoLog} (excluding the null terminator)
	 * @param infoLog   an array of characters that is used to return the information log
	 */
	public static void glGetShaderInfoLog(int shader, int maxLength, ByteBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(infoLog, maxLength);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetShaderInfoLog(shader, maxLength, memAddressSafe(length), memAddress(infoLog));
	}

	/** Alternative version of: {@link #glGetShaderInfoLog GetShaderInfoLog} */
	public static void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetShaderInfoLog(shader, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
	}

	/** String return version of: {@link #glGetShaderInfoLog GetShaderInfoLog} */
	public static String glGetShaderInfoLog(int shader, int maxLength) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(maxLength);
		nglGetShaderInfoLog(shader, maxLength, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(memByteBuffer(__buffer.address(infoLog), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetShaderInfoLog GetShaderInfoLog} */
	public static String glGetShaderInfoLog(int shader) {
		int maxLength = glGetShaderi(shader, GL_INFO_LOG_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(maxLength);
		nglGetShaderInfoLog(shader, maxLength, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(memByteBuffer(__buffer.address(infoLog), __buffer.intValue(length)));
	}

	// --- [ glGetProgramInfoLog ] ---

	/** JNI method for {@link #glGetProgramInfoLog GetProgramInfoLog} */
	@JavadocExclude
	public static native void nglGetProgramInfoLog(int program, int maxLength, long length, long infoLog, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramInfoLog GetProgramInfoLog} */
	@JavadocExclude
	public static void nglGetProgramInfoLog(int program, int maxLength, long length, long infoLog) {
		long __functionAddress = getInstance().GetProgramInfoLog;
		nglGetProgramInfoLog(program, maxLength, length, infoLog, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetProgramInfoLog.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the information log for a program object.
	 *
	 * @param program   the program object whose information log is to be queried
	 * @param maxLength the size of the character buffer for storing the returned information log
	 * @param length    the length of the string returned in {@code infoLog} (excluding the null terminator)
	 * @param infoLog   an array of characters that is used to return the information log
	 */
	public static void glGetProgramInfoLog(int program, int maxLength, ByteBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(infoLog, maxLength);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramInfoLog(program, maxLength, memAddressSafe(length), memAddress(infoLog));
	}

	/** Alternative version of: {@link #glGetProgramInfoLog GetProgramInfoLog} */
	public static void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramInfoLog(program, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
	}

	/** String return version of: {@link #glGetProgramInfoLog GetProgramInfoLog} */
	public static String glGetProgramInfoLog(int program, int maxLength) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(maxLength);
		nglGetProgramInfoLog(program, maxLength, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(memByteBuffer(__buffer.address(infoLog), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetProgramInfoLog GetProgramInfoLog} */
	public static String glGetProgramInfoLog(int program) {
		int maxLength = glGetProgrami(program, GL_INFO_LOG_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(maxLength);
		nglGetProgramInfoLog(program, maxLength, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(memByteBuffer(__buffer.address(infoLog), __buffer.intValue(length)));
	}

	// --- [ glGetAttachedShaders ] ---

	/** JNI method for {@link #glGetAttachedShaders GetAttachedShaders} */
	@JavadocExclude
	public static native void nglGetAttachedShaders(int program, int maxCount, long count, long shaders, long __functionAddress);

	/** Unsafe version of {@link #glGetAttachedShaders GetAttachedShaders} */
	@JavadocExclude
	public static void nglGetAttachedShaders(int program, int maxCount, long count, long shaders) {
		long __functionAddress = getInstance().GetAttachedShaders;
		nglGetAttachedShaders(program, maxCount, count, shaders, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetAttachedShaders.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the shader objects attached to a program object.
	 *
	 * @param program  the program object to be queried
	 * @param maxCount the size of the array for storing the returned object names
	 * @param count    the number of names actually returned in {@code shaders}
	 * @param shaders  an array that is used to return the names of attached shader objects
	 */
	public static void glGetAttachedShaders(int program, int maxCount, ByteBuffer count, ByteBuffer shaders) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(shaders, maxCount << 2);
			if ( count != null ) checkBuffer(count, 1 << 2);
		}
		nglGetAttachedShaders(program, maxCount, memAddressSafe(count), memAddress(shaders));
	}

	/** Alternative version of: {@link #glGetAttachedShaders GetAttachedShaders} */
	public static void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders) {
		if ( LWJGLUtil.CHECKS )
			if ( count != null ) checkBuffer(count, 1);
		nglGetAttachedShaders(program, shaders.remaining(), memAddressSafe(count), memAddress(shaders));
	}

	/** Buffer return version of: {@link #glGetAttachedShaders GetAttachedShaders} */
	public static IntBuffer glGetAttachedShaders(int program, int maxCount) {
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		int shaders = __buffer.bufferParam(maxCount << 2);
		nglGetAttachedShaders(program, maxCount, __buffer.address(count), __buffer.address(shaders));
		return memIntBuffer(__buffer.address(shaders), __buffer.intValue(count));
	}

	/** Buffer return (w/ implicit max length) version of: {@link #glGetAttachedShaders GetAttachedShaders} */
	public static IntBuffer glGetAttachedShaders(int program) {
		int maxCount = glGetProgrami(program, GL_ATTACHED_SHADERS);
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		int shaders = __buffer.bufferParam(maxCount << 2);
		nglGetAttachedShaders(program, maxCount, __buffer.address(count), __buffer.address(shaders));
		return memIntBuffer(__buffer.address(shaders), __buffer.intValue(count));
	}

	// --- [ glGetUniformLocation ] ---

	/** JNI method for {@link #glGetUniformLocation GetUniformLocation} */
	@JavadocExclude
	public static native int nglGetUniformLocation(int program, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetUniformLocation GetUniformLocation} */
	@JavadocExclude
	public static int nglGetUniformLocation(int program, long name) {
		long __functionAddress = getInstance().GetUniformLocation;
		return nglGetUniformLocation(program, name, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetUniformLocation.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the location of a uniform variable.
	 *
	 * @param program the program object to be queried
	 * @param name    a null terminated string containing the name of the uniform variable whose location is to be queried
	 */
	public static int glGetUniformLocation(int program, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetUniformLocation(program, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetUniformLocation GetUniformLocation} */
	public static int glGetUniformLocation(int program, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetUniformLocation(program, __buffer.address(nameEncoded));
	}

	// --- [ glGetActiveUniform ] ---

	/** JNI method for {@link #glGetActiveUniform GetActiveUniform} */
	@JavadocExclude
	public static native void nglGetActiveUniform(int program, int index, int maxLength, long length, long size, long type, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetActiveUniform GetActiveUniform} */
	@JavadocExclude
	public static void nglGetActiveUniform(int program, int index, int maxLength, long length, long size, long type, long name) {
		long __functionAddress = getInstance().GetActiveUniform;
		nglGetActiveUniform(program, index, maxLength, length, size, type, name, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetActiveUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
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
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, maxLength);
			if ( length != null ) checkBuffer(length, 1 << 2);
			checkBuffer(size, 1 << 2);
			checkBuffer(type, 1 << 2);
		}
		nglGetActiveUniform(program, index, maxLength, memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** Alternative version of: {@link #glGetActiveUniform GetActiveUniform} */
	public static void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetActiveUniform(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** String return version of: {@link #glGetActiveUniform GetActiveUniform} */
	public static String glGetActiveUniform(int program, int index, int maxLength, IntBuffer size, IntBuffer type) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(maxLength);
		nglGetActiveUniform(program, index, maxLength, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveUniform GetActiveUniform} */
	public static String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		int maxLength = glGetProgrami(program, GL_ACTIVE_UNIFORM_MAX_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(maxLength);
		nglGetActiveUniform(program, index, maxLength, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	// --- [ glGetUniformfv ] ---

	/** JNI method for {@link #glGetUniformfv GetUniformfv} */
	@JavadocExclude
	public static native void nglGetUniformfv(int program, int location, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetUniformfv GetUniformfv} */
	@JavadocExclude
	public static void nglGetUniformfv(int program, int location, long params) {
		long __functionAddress = getInstance().GetUniformfv;
		nglGetUniformfv(program, location, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the float value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetUniformfv(int program, int location, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetUniformfv(program, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformfv GetUniformfv} */
	public static void glGetUniformfv(int program, int location, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetUniformfv(program, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformfv GetUniformfv} */
	public static float glGetUniformf(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetUniformfv(program, location, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetUniformiv ] ---

	/** JNI method for {@link #glGetUniformiv GetUniformiv} */
	@JavadocExclude
	public static native void nglGetUniformiv(int program, int location, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetUniformiv GetUniformiv} */
	@JavadocExclude
	public static void nglGetUniformiv(int program, int location, long params) {
		long __functionAddress = getInstance().GetUniformiv;
		nglGetUniformiv(program, location, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the int value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetUniformiv(int program, int location, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetUniformiv(program, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformiv GetUniformiv} */
	public static void glGetUniformiv(int program, int location, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetUniformiv(program, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformiv GetUniformiv} */
	public static int glGetUniformi(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetUniformiv(program, location, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetShaderSource ] ---

	/** JNI method for {@link #glGetShaderSource GetShaderSource} */
	@JavadocExclude
	public static native void nglGetShaderSource(int shader, int maxLength, long length, long source, long __functionAddress);

	/** Unsafe version of {@link #glGetShaderSource GetShaderSource} */
	@JavadocExclude
	public static void nglGetShaderSource(int shader, int maxLength, long length, long source) {
		long __functionAddress = getInstance().GetShaderSource;
		nglGetShaderSource(shader, maxLength, length, source, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetShaderSource.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the source code string from a shader object.
	 *
	 * @param shader    the shader object to be queried
	 * @param maxLength the size of the character buffer for storing the returned source code string
	 * @param length    the length of the string returned in source (excluding the null terminator)
	 * @param source    an array of characters that is used to return the source code string
	 */
	public static void glGetShaderSource(int shader, int maxLength, ByteBuffer length, ByteBuffer source) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(source, maxLength);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetShaderSource(shader, maxLength, memAddressSafe(length), memAddress(source));
	}

	/** Alternative version of: {@link #glGetShaderSource GetShaderSource} */
	public static void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetShaderSource(shader, source.remaining(), memAddressSafe(length), memAddress(source));
	}

	/** String return version of: {@link #glGetShaderSource GetShaderSource} */
	public static String glGetShaderSource(int shader, int maxLength) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int source = __buffer.bufferParam(maxLength);
		nglGetShaderSource(shader, maxLength, __buffer.address(length), __buffer.address(source));
		return memDecodeUTF8(memByteBuffer(__buffer.address(source), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetShaderSource GetShaderSource} */
	public static String glGetShaderSource(int shader) {
		int maxLength = glGetShaderi(shader, GL_SHADER_SOURCE_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int source = __buffer.bufferParam(maxLength);
		nglGetShaderSource(shader, maxLength, __buffer.address(length), __buffer.address(source));
		return memDecodeUTF8(memByteBuffer(__buffer.address(source), __buffer.intValue(length)));
	}

	// --- [ glVertexAttrib1f ] ---

	/** JNI method for {@link #glVertexAttrib1f VertexAttrib1f} */
	@JavadocExclude
	public static native void nglVertexAttrib1f(int index, float v0, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib1f.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0f and w to 1.0f.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1f(int index, float v0) {
		long __functionAddress = getInstance().VertexAttrib1f;
		nglVertexAttrib1f(index, v0, __functionAddress);
	}

	// --- [ glVertexAttrib1s ] ---

	/** JNI method for {@link #glVertexAttrib1s VertexAttrib1s} */
	@JavadocExclude
	public static native void nglVertexAttrib1s(int index, short v0, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib1s.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Short version of {@link #glVertexAttrib1f VertexAttrib1f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1s(int index, short v0) {
		long __functionAddress = getInstance().VertexAttrib1s;
		nglVertexAttrib1s(index, v0, __functionAddress);
	}

	// --- [ glVertexAttrib1d ] ---

	/** JNI method for {@link #glVertexAttrib1d VertexAttrib1d} */
	@JavadocExclude
	public static native void nglVertexAttrib1d(int index, double v0, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib1d.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Double version of {@link #glVertexAttrib1f VertexAttrib1f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1d(int index, double v0) {
		long __functionAddress = getInstance().VertexAttrib1d;
		nglVertexAttrib1d(index, v0, __functionAddress);
	}

	// --- [ glVertexAttrib2f ] ---

	/** JNI method for {@link #glVertexAttrib2f VertexAttrib2f} */
	@JavadocExclude
	public static native void nglVertexAttrib2f(int index, float v0, float v1, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib2f.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0f and w to 1.0f.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 */
	public static void glVertexAttrib2f(int index, float v0, float v1) {
		long __functionAddress = getInstance().VertexAttrib2f;
		nglVertexAttrib2f(index, v0, v1, __functionAddress);
	}

	// --- [ glVertexAttrib2s ] ---

	/** JNI method for {@link #glVertexAttrib2s VertexAttrib2s} */
	@JavadocExclude
	public static native void nglVertexAttrib2s(int index, short v0, short v1, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib2s.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Short version of {@link #glVertexAttrib2f VertexAttrib2f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 */
	public static void glVertexAttrib2s(int index, short v0, short v1) {
		long __functionAddress = getInstance().VertexAttrib2s;
		nglVertexAttrib2s(index, v0, v1, __functionAddress);
	}

	// --- [ glVertexAttrib2d ] ---

	/** JNI method for {@link #glVertexAttrib2d VertexAttrib2d} */
	@JavadocExclude
	public static native void nglVertexAttrib2d(int index, double v0, double v1, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib2d.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Double version of {@link #glVertexAttrib2f VertexAttrib2f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 */
	public static void glVertexAttrib2d(int index, double v0, double v1) {
		long __functionAddress = getInstance().VertexAttrib2d;
		nglVertexAttrib2d(index, v0, v1, __functionAddress);
	}

	// --- [ glVertexAttrib3f ] ---

	/** JNI method for {@link #glVertexAttrib3f VertexAttrib3f} */
	@JavadocExclude
	public static native void nglVertexAttrib3f(int index, float v0, float v1, float v2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib3f.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0f.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 */
	public static void glVertexAttrib3f(int index, float v0, float v1, float v2) {
		long __functionAddress = getInstance().VertexAttrib3f;
		nglVertexAttrib3f(index, v0, v1, v2, __functionAddress);
	}

	// --- [ glVertexAttrib3s ] ---

	/** JNI method for {@link #glVertexAttrib3s VertexAttrib3s} */
	@JavadocExclude
	public static native void nglVertexAttrib3s(int index, short v0, short v1, short v2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib3s.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Short version of {@link #glVertexAttrib3f VertexAttrib3f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 */
	public static void glVertexAttrib3s(int index, short v0, short v1, short v2) {
		long __functionAddress = getInstance().VertexAttrib3s;
		nglVertexAttrib3s(index, v0, v1, v2, __functionAddress);
	}

	// --- [ glVertexAttrib3d ] ---

	/** JNI method for {@link #glVertexAttrib3d VertexAttrib3d} */
	@JavadocExclude
	public static native void nglVertexAttrib3d(int index, double v0, double v1, double v2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib3d.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Double version of {@link #glVertexAttrib3f VertexAttrib3f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 */
	public static void glVertexAttrib3d(int index, double v0, double v1, double v2) {
		long __functionAddress = getInstance().VertexAttrib3d;
		nglVertexAttrib3d(index, v0, v1, v2, __functionAddress);
	}

	// --- [ glVertexAttrib4f ] ---

	/** JNI method for {@link #glVertexAttrib4f VertexAttrib4f} */
	@JavadocExclude
	public static native void nglVertexAttrib4f(int index, float v0, float v1, float v2, float v3, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4f.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a generic vertex attribute.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 * @param v3    the vertex attribute w component
	 */
	public static void glVertexAttrib4f(int index, float v0, float v1, float v2, float v3) {
		long __functionAddress = getInstance().VertexAttrib4f;
		nglVertexAttrib4f(index, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glVertexAttrib4s ] ---

	/** JNI method for {@link #glVertexAttrib4s VertexAttrib4s} */
	@JavadocExclude
	public static native void nglVertexAttrib4s(int index, short v0, short v1, short v2, short v3, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4s.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Short version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 * @param v3    the vertex attribute w component
	 */
	public static void glVertexAttrib4s(int index, short v0, short v1, short v2, short v3) {
		long __functionAddress = getInstance().VertexAttrib4s;
		nglVertexAttrib4s(index, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glVertexAttrib4d ] ---

	/** JNI method for {@link #glVertexAttrib4d VertexAttrib4d} */
	@JavadocExclude
	public static native void nglVertexAttrib4d(int index, double v0, double v1, double v2, double v3, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4d.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Double version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 * @param v3    the vertex attribute w component
	 */
	public static void glVertexAttrib4d(int index, double v0, double v1, double v2, double v3) {
		long __functionAddress = getInstance().VertexAttrib4d;
		nglVertexAttrib4d(index, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glVertexAttrib4Nub ] ---

	/** JNI method for {@link #glVertexAttrib4Nub VertexAttrib4Nub} */
	@JavadocExclude
	public static native void nglVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4Nub.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Normalized unsigned byte version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 * @param w     the vertex attribute w component
	 */
	public static void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
		long __functionAddress = getInstance().VertexAttrib4Nub;
		nglVertexAttrib4Nub(index, x, y, z, w, __functionAddress);
	}

	// --- [ glVertexAttrib1fv ] ---

	/** JNI method for {@link #glVertexAttrib1fv VertexAttrib1fv} */
	@JavadocExclude
	public static native void nglVertexAttrib1fv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib1fv VertexAttrib1fv} */
	@JavadocExclude
	public static void nglVertexAttrib1fv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib1fv;
		nglVertexAttrib1fv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib1.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttrib1f VertexAttrib1f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib1fv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 2);
		nglVertexAttrib1fv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib1fv VertexAttrib1fv} */
	public static void glVertexAttrib1fv(int index, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1fv(index, memAddress(v));
	}

	// --- [ glVertexAttrib1sv ] ---

	/** JNI method for {@link #glVertexAttrib1sv VertexAttrib1sv} */
	@JavadocExclude
	public static native void nglVertexAttrib1sv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib1sv VertexAttrib1sv} */
	@JavadocExclude
	public static void nglVertexAttrib1sv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib1sv;
		nglVertexAttrib1sv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib1.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttrib1s VertexAttrib1s}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib1sv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 1);
		nglVertexAttrib1sv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib1sv VertexAttrib1sv} */
	public static void glVertexAttrib1sv(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1sv(index, memAddress(v));
	}

	// --- [ glVertexAttrib1dv ] ---

	/** JNI method for {@link #glVertexAttrib1dv VertexAttrib1dv} */
	@JavadocExclude
	public static native void nglVertexAttrib1dv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib1dv VertexAttrib1dv} */
	@JavadocExclude
	public static void nglVertexAttrib1dv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib1dv;
		nglVertexAttrib1dv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib1.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttrib1d VertexAttrib1d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib1dv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 3);
		nglVertexAttrib1dv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib1dv VertexAttrib1dv} */
	public static void glVertexAttrib1dv(int index, DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1dv(index, memAddress(v));
	}

	// --- [ glVertexAttrib2fv ] ---

	/** JNI method for {@link #glVertexAttrib2fv VertexAttrib2fv} */
	@JavadocExclude
	public static native void nglVertexAttrib2fv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib2fv VertexAttrib2fv} */
	@JavadocExclude
	public static void nglVertexAttrib2fv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib2fv;
		nglVertexAttrib2fv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttrib2f VertexAttrib2f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib2fv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 2);
		nglVertexAttrib2fv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib2fv VertexAttrib2fv} */
	public static void glVertexAttrib2fv(int index, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2fv(index, memAddress(v));
	}

	// --- [ glVertexAttrib2sv ] ---

	/** JNI method for {@link #glVertexAttrib2sv VertexAttrib2sv} */
	@JavadocExclude
	public static native void nglVertexAttrib2sv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib2sv VertexAttrib2sv} */
	@JavadocExclude
	public static void nglVertexAttrib2sv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib2sv;
		nglVertexAttrib2sv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttrib2s VertexAttrib2s}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib2sv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 1);
		nglVertexAttrib2sv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib2sv VertexAttrib2sv} */
	public static void glVertexAttrib2sv(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2sv(index, memAddress(v));
	}

	// --- [ glVertexAttrib2dv ] ---

	/** JNI method for {@link #glVertexAttrib2dv VertexAttrib2dv} */
	@JavadocExclude
	public static native void nglVertexAttrib2dv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib2dv VertexAttrib2dv} */
	@JavadocExclude
	public static void nglVertexAttrib2dv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib2dv;
		nglVertexAttrib2dv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttrib2d VertexAttrib2d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib2dv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 3);
		nglVertexAttrib2dv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib2dv VertexAttrib2dv} */
	public static void glVertexAttrib2dv(int index, DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2dv(index, memAddress(v));
	}

	// --- [ glVertexAttrib3fv ] ---

	/** JNI method for {@link #glVertexAttrib3fv VertexAttrib3fv} */
	@JavadocExclude
	public static native void nglVertexAttrib3fv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib3fv VertexAttrib3fv} */
	@JavadocExclude
	public static void nglVertexAttrib3fv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib3fv;
		nglVertexAttrib3fv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttrib3f VertexAttrib3f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib3fv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglVertexAttrib3fv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib3fv VertexAttrib3fv} */
	public static void glVertexAttrib3fv(int index, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3fv(index, memAddress(v));
	}

	// --- [ glVertexAttrib3sv ] ---

	/** JNI method for {@link #glVertexAttrib3sv VertexAttrib3sv} */
	@JavadocExclude
	public static native void nglVertexAttrib3sv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib3sv VertexAttrib3sv} */
	@JavadocExclude
	public static void nglVertexAttrib3sv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib3sv;
		nglVertexAttrib3sv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttrib3s VertexAttrib3s}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib3sv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglVertexAttrib3sv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib3sv VertexAttrib3sv} */
	public static void glVertexAttrib3sv(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3sv(index, memAddress(v));
	}

	// --- [ glVertexAttrib3dv ] ---

	/** JNI method for {@link #glVertexAttrib3dv VertexAttrib3dv} */
	@JavadocExclude
	public static native void nglVertexAttrib3dv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib3dv VertexAttrib3dv} */
	@JavadocExclude
	public static void nglVertexAttrib3dv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib3dv;
		nglVertexAttrib3dv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttrib3d VertexAttrib3d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib3dv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 3);
		nglVertexAttrib3dv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib3dv VertexAttrib3dv} */
	public static void glVertexAttrib3dv(int index, DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3dv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4fv ] ---

	/** JNI method for {@link #glVertexAttrib4fv VertexAttrib4fv} */
	@JavadocExclude
	public static native void nglVertexAttrib4fv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4fv VertexAttrib4fv} */
	@JavadocExclude
	public static void nglVertexAttrib4fv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4fv;
		nglVertexAttrib4fv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4fv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttrib4fv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4fv VertexAttrib4fv} */
	public static void glVertexAttrib4fv(int index, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4fv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4sv ] ---

	/** JNI method for {@link #glVertexAttrib4sv VertexAttrib4sv} */
	@JavadocExclude
	public static native void nglVertexAttrib4sv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4sv VertexAttrib4sv} */
	@JavadocExclude
	public static void nglVertexAttrib4sv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4sv;
		nglVertexAttrib4sv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttrib4s VertexAttrib4s}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4sv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertexAttrib4sv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4sv VertexAttrib4sv} */
	public static void glVertexAttrib4sv(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4sv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4dv ] ---

	/** JNI method for {@link #glVertexAttrib4dv VertexAttrib4dv} */
	@JavadocExclude
	public static native void nglVertexAttrib4dv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4dv VertexAttrib4dv} */
	@JavadocExclude
	public static void nglVertexAttrib4dv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4dv;
		nglVertexAttrib4dv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttrib4d VertexAttrib4d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4dv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 3);
		nglVertexAttrib4dv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4dv VertexAttrib4dv} */
	public static void glVertexAttrib4dv(int index, DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4dv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4iv ] ---

	/** JNI method for {@link #glVertexAttrib4iv VertexAttrib4iv} */
	@JavadocExclude
	public static native void nglVertexAttrib4iv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4iv VertexAttrib4iv} */
	@JavadocExclude
	public static void nglVertexAttrib4iv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4iv;
		nglVertexAttrib4iv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Integer pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4iv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttrib4iv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4iv VertexAttrib4iv} */
	public static void glVertexAttrib4iv(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4iv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4bv ] ---

	/** JNI method for {@link #glVertexAttrib4bv VertexAttrib4bv} */
	@JavadocExclude
	public static native void nglVertexAttrib4bv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4bv VertexAttrib4bv} */
	@JavadocExclude
	public static void nglVertexAttrib4bv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4bv;
		nglVertexAttrib4bv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4b.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Byte pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4bv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4bv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4ubv ] ---

	/** JNI method for {@link #glVertexAttrib4ubv VertexAttrib4ubv} */
	@JavadocExclude
	public static native void nglVertexAttrib4ubv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4ubv VertexAttrib4ubv} */
	@JavadocExclude
	public static void nglVertexAttrib4ubv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4ubv;
		nglVertexAttrib4ubv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4ub.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttrib4Nub VertexAttrib4Nub}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4ubv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4ubv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4usv ] ---

	/** JNI method for {@link #glVertexAttrib4usv VertexAttrib4usv} */
	@JavadocExclude
	public static native void nglVertexAttrib4usv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4usv VertexAttrib4usv} */
	@JavadocExclude
	public static void nglVertexAttrib4usv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4usv;
		nglVertexAttrib4usv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4usv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertexAttrib4usv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4usv VertexAttrib4usv} */
	public static void glVertexAttrib4usv(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4usv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4uiv ] ---

	/** JNI method for {@link #glVertexAttrib4uiv VertexAttrib4uiv} */
	@JavadocExclude
	public static native void nglVertexAttrib4uiv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4uiv VertexAttrib4uiv} */
	@JavadocExclude
	public static void nglVertexAttrib4uiv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4uiv;
		nglVertexAttrib4uiv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned int pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4uiv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttrib4uiv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4uiv VertexAttrib4uiv} */
	public static void glVertexAttrib4uiv(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4uiv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4Nbv ] ---

	/** JNI method for {@link #glVertexAttrib4Nbv VertexAttrib4Nbv} */
	@JavadocExclude
	public static native void nglVertexAttrib4Nbv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4Nbv VertexAttrib4Nbv} */
	@JavadocExclude
	public static void nglVertexAttrib4Nbv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4Nbv;
		nglVertexAttrib4Nbv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4Nb.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Normalized byte pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4Nbv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4Nbv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4Nsv ] ---

	/** JNI method for {@link #glVertexAttrib4Nsv VertexAttrib4Nsv} */
	@JavadocExclude
	public static native void nglVertexAttrib4Nsv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4Nsv VertexAttrib4Nsv} */
	@JavadocExclude
	public static void nglVertexAttrib4Nsv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4Nsv;
		nglVertexAttrib4Nsv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4N.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Normalized short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4Nsv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertexAttrib4Nsv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4Nsv VertexAttrib4Nsv} */
	public static void glVertexAttrib4Nsv(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4Nsv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4Niv ] ---

	/** JNI method for {@link #glVertexAttrib4Niv VertexAttrib4Niv} */
	@JavadocExclude
	public static native void nglVertexAttrib4Niv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4Niv VertexAttrib4Niv} */
	@JavadocExclude
	public static void nglVertexAttrib4Niv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4Niv;
		nglVertexAttrib4Niv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4N.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Normalized int pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4Niv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttrib4Niv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4Niv VertexAttrib4Niv} */
	public static void glVertexAttrib4Niv(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4Niv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4Nubv ] ---

	/** JNI method for {@link #glVertexAttrib4Nubv VertexAttrib4Nubv} */
	@JavadocExclude
	public static native void nglVertexAttrib4Nubv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4Nubv VertexAttrib4Nubv} */
	@JavadocExclude
	public static void nglVertexAttrib4Nubv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4Nubv;
		nglVertexAttrib4Nubv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4Nub.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Normalized unsigned byte pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4Nubv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4Nubv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4Nusv ] ---

	/** JNI method for {@link #glVertexAttrib4Nusv VertexAttrib4Nusv} */
	@JavadocExclude
	public static native void nglVertexAttrib4Nusv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4Nusv VertexAttrib4Nusv} */
	@JavadocExclude
	public static void nglVertexAttrib4Nusv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4Nusv;
		nglVertexAttrib4Nusv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4N.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Normalized unsigned short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4Nusv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertexAttrib4Nusv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4Nusv VertexAttrib4Nusv} */
	public static void glVertexAttrib4Nusv(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4Nusv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4Nuiv ] ---

	/** JNI method for {@link #glVertexAttrib4Nuiv VertexAttrib4Nuiv} */
	@JavadocExclude
	public static native void nglVertexAttrib4Nuiv(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4Nuiv VertexAttrib4Nuiv} */
	@JavadocExclude
	public static void nglVertexAttrib4Nuiv(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4Nuiv;
		nglVertexAttrib4Nuiv(index, v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttrib4N.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Normalized unsigned int pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4Nuiv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttrib4Nuiv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4Nuiv VertexAttrib4Nuiv} */
	public static void glVertexAttrib4Nuiv(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4Nuiv(index, memAddress(v));
	}

	// --- [ glVertexAttribPointer ] ---

	/** JNI method for {@link #glVertexAttribPointer VertexAttribPointer} */
	@JavadocExclude
	public static native void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribPointer VertexAttribPointer} */
	@JavadocExclude
	public static void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
		long __functionAddress = getInstance().VertexAttribPointer;
		nglVertexAttribPointer(index, size, type, normalized, stride, pointer, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribPointer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the location and organization of a vertex attribute array.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL11#GL_DOUBLE DOUBLE}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL41#GL_FIXED FIXED}
	 * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
	 * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                   the array. The initial value is 0.
	 * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glVertexAttribPointer VertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglVertexAttribPointer(index, size, type, normalized, stride, pointerOffset);
	}

	/** GL_UNSIGNED_BYTE / GL_BYTE version of: {@link #glVertexAttribPointer VertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, boolean unsigned, boolean normalized, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointer(index, size, unsigned ? GL11.GL_UNSIGNED_BYTE : GL11.GL_BYTE, normalized, stride, memAddress(pointer));
	}

	/** GL_UNSIGNED_SHORT / GL_SHORT version of: {@link #glVertexAttribPointer VertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, boolean unsigned, boolean normalized, int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointer(index, size, unsigned ? GL11.GL_UNSIGNED_SHORT : GL11.GL_SHORT, normalized, stride, memAddress(pointer));
	}

	/** GL_INT version of: {@link #glVertexAttribPointer VertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, IntBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointer(index, size, GL11.GL_INT, normalized, stride, memAddress(pointer));
	}

	/** GL_FLOAT version of: {@link #glVertexAttribPointer VertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, FloatBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointer(index, size, GL11.GL_FLOAT, normalized, stride, memAddress(pointer));
	}

	/** GL_DOUBLE version of: {@link #glVertexAttribPointer VertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, DoubleBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointer(index, size, GL11.GL_DOUBLE, normalized, stride, memAddress(pointer));
	}

	// --- [ glEnableVertexAttribArray ] ---

	/** JNI method for {@link #glEnableVertexAttribArray EnableVertexAttribArray} */
	@JavadocExclude
	public static native void nglEnableVertexAttribArray(int index, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glEnableVertexAttribArray.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Enables a generic vertex attribute array.
	 *
	 * @param index the index of the generic vertex attribute to be enabled
	 */
	public static void glEnableVertexAttribArray(int index) {
		long __functionAddress = getInstance().EnableVertexAttribArray;
		nglEnableVertexAttribArray(index, __functionAddress);
	}

	// --- [ glDisableVertexAttribArray ] ---

	/** JNI method for {@link #glDisableVertexAttribArray DisableVertexAttribArray} */
	@JavadocExclude
	public static native void nglDisableVertexAttribArray(int index, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glEnableVertexAttribArray.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Disables a generic vertex attribute array.
	 *
	 * @param index the index of the generic vertex attribute to be disabled
	 */
	public static void glDisableVertexAttribArray(int index) {
		long __functionAddress = getInstance().DisableVertexAttribArray;
		nglDisableVertexAttribArray(index, __functionAddress);
	}

	// --- [ glBindAttribLocation ] ---

	/** JNI method for {@link #glBindAttribLocation BindAttribLocation} */
	@JavadocExclude
	public static native void nglBindAttribLocation(int program, int index, long name, long __functionAddress);

	/** Unsafe version of {@link #glBindAttribLocation BindAttribLocation} */
	@JavadocExclude
	public static void nglBindAttribLocation(int program, int index, long name) {
		long __functionAddress = getInstance().BindAttribLocation;
		nglBindAttribLocation(program, index, name, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindAttribLocation.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Associates a generic vertex attribute index with a named attribute variable.
	 *
	 * @param program the program object in which the association is to be made
	 * @param index   the index of the generic vertex attribute to be bound
	 * @param name    a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound
	 */
	public static void glBindAttribLocation(int program, int index, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		nglBindAttribLocation(program, index, memAddress(name));
	}

	/** CharSequence version of: {@link #glBindAttribLocation BindAttribLocation} */
	public static void glBindAttribLocation(int program, int index, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		nglBindAttribLocation(program, index, __buffer.address(nameEncoded));
	}

	// --- [ glGetActiveAttrib ] ---

	/** JNI method for {@link #glGetActiveAttrib GetActiveAttrib} */
	@JavadocExclude
	public static native void nglGetActiveAttrib(int program, int index, int maxLength, long length, long size, long type, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetActiveAttrib GetActiveAttrib} */
	@JavadocExclude
	public static void nglGetActiveAttrib(int program, int index, int maxLength, long length, long size, long type, long name) {
		long __functionAddress = getInstance().GetActiveAttrib;
		nglGetActiveAttrib(program, index, maxLength, length, size, type, name, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetActiveAttrib.xhtml">OpenGL SDK Reference</a></p>
	 * 
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
		if ( LWJGLUtil.CHECKS )
			checkBuffer(name, maxLength);
		nglGetActiveAttrib(program, index, maxLength, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** Alternative version of: {@link #glGetActiveAttrib GetActiveAttrib} */
	public static void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		nglGetActiveAttrib(program, index, name.remaining(), memAddress(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** String return version of: {@link #glGetActiveAttrib GetActiveAttrib} */
	public static String glGetActiveAttrib(int program, int index, int maxLength, IntBuffer size, IntBuffer type) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(maxLength);
		nglGetActiveAttrib(program, index, maxLength, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveAttrib GetActiveAttrib} */
	public static String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type) {
		int maxLength = glGetProgrami(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(maxLength);
		nglGetActiveAttrib(program, index, maxLength, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	// --- [ glGetAttribLocation ] ---

	/** JNI method for {@link #glGetAttribLocation GetAttribLocation} */
	@JavadocExclude
	public static native int nglGetAttribLocation(int program, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetAttribLocation GetAttribLocation} */
	@JavadocExclude
	public static int nglGetAttribLocation(int program, long name) {
		long __functionAddress = getInstance().GetAttribLocation;
		return nglGetAttribLocation(program, name, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetAttribLocation.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the location of an attribute variable.
	 *
	 * @param program the program object to be queried
	 * @param name    a null terminated string containing the name of the attribute variable whose location is to be queried
	 */
	public static int glGetAttribLocation(int program, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetAttribLocation(program, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetAttribLocation GetAttribLocation} */
	public static int glGetAttribLocation(int program, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetAttribLocation(program, __buffer.address(nameEncoded));
	}

	// --- [ glGetVertexAttribiv ] ---

	/** JNI method for {@link #glGetVertexAttribiv GetVertexAttribiv} */
	@JavadocExclude
	public static native void nglGetVertexAttribiv(int index, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexAttribiv GetVertexAttribiv} */
	@JavadocExclude
	public static void nglGetVertexAttribiv(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribiv;
		nglGetVertexAttribiv(index, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexAttrib.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the integer value of a generic vertex attribute parameter.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried. One of:<br>{@link GL15#GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING VERTEX_ATTRIB_ARRAY_BUFFER_BINDING}, {@link #GL_VERTEX_ATTRIB_ARRAY_ENABLED VERTEX_ATTRIB_ARRAY_ENABLED}, {@link #GL_VERTEX_ATTRIB_ARRAY_SIZE VERTEX_ATTRIB_ARRAY_SIZE}, {@link #GL_VERTEX_ATTRIB_ARRAY_STRIDE VERTEX_ATTRIB_ARRAY_STRIDE}, {@link #GL_VERTEX_ATTRIB_ARRAY_TYPE VERTEX_ATTRIB_ARRAY_TYPE}, {@link #GL_VERTEX_ATTRIB_ARRAY_NORMALIZED VERTEX_ATTRIB_ARRAY_NORMALIZED}, {@link #GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}, {@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}, {@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribiv(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetVertexAttribiv(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribiv GetVertexAttribiv} */
	public static void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetVertexAttribiv(index, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetVertexAttribiv GetVertexAttribiv} */
	public static int glGetVertexAttribi(int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetVertexAttribiv(index, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetVertexAttribfv ] ---

	/** JNI method for {@link #glGetVertexAttribfv GetVertexAttribfv} */
	@JavadocExclude
	public static native void nglGetVertexAttribfv(int index, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexAttribfv GetVertexAttribfv} */
	@JavadocExclude
	public static void nglGetVertexAttribfv(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribfv;
		nglGetVertexAttribfv(index, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexAttrib.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Float version of {@link #glGetVertexAttribiv GetVertexAttribiv}.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribfv(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetVertexAttribfv(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribfv GetVertexAttribfv} */
	public static void glGetVertexAttribfv(int index, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribfv(index, pname, memAddress(params));
	}

	// --- [ glGetVertexAttribdv ] ---

	/** JNI method for {@link #glGetVertexAttribdv GetVertexAttribdv} */
	@JavadocExclude
	public static native void nglGetVertexAttribdv(int index, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexAttribdv GetVertexAttribdv} */
	@JavadocExclude
	public static void nglGetVertexAttribdv(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribdv;
		nglGetVertexAttribdv(index, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexAttrib.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Double version of {@link #glGetVertexAttribiv GetVertexAttribiv}.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribdv(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 3);
		nglGetVertexAttribdv(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribdv GetVertexAttribdv} */
	public static void glGetVertexAttribdv(int index, int pname, DoubleBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribdv(index, pname, memAddress(params));
	}

	// --- [ glGetVertexAttribPointerv ] ---

	/** JNI method for {@link #glGetVertexAttribPointerv GetVertexAttribPointerv} */
	@JavadocExclude
	public static native void nglGetVertexAttribPointerv(int index, int pname, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexAttribPointerv GetVertexAttribPointerv} */
	@JavadocExclude
	public static void nglGetVertexAttribPointerv(int index, int pname, long pointer) {
		long __functionAddress = getInstance().GetVertexAttribPointerv;
		nglGetVertexAttribPointerv(index, pname, pointer, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexAttribPointer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the address of the specified generic vertex attribute pointer.
	 *
	 * @param index   the generic vertex attribute parameter to be queried
	 * @param pname   the symbolic name of the generic vertex attribute parameter to be returned. Must be:<br>{@link #GL_VERTEX_ATTRIB_ARRAY_POINTER VERTEX_ATTRIB_ARRAY_POINTER}
	 * @param pointer the pointer value
	 */
	public static void glGetVertexAttribPointerv(int index, int pname, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pointer, 1 << POINTER_SHIFT);
		nglGetVertexAttribPointerv(index, pname, memAddress(pointer));
	}

	/** Alternative version of: {@link #glGetVertexAttribPointerv GetVertexAttribPointerv} */
	public static void glGetVertexAttribPointerv(int index, int pname, PointerBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pointer, 1);
		nglGetVertexAttribPointerv(index, pname, memAddress(pointer));
	}

	/** Single return value version of: {@link #glGetVertexAttribPointerv GetVertexAttribPointerv} */
	public static long glGetVertexAttribPointer(int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int pointer = __buffer.pointerParam();
		nglGetVertexAttribPointerv(index, pname, __buffer.address(pointer));
		return __buffer.pointerValue(pointer);
	}

	// --- [ glDrawBuffers ] ---

	/** JNI method for {@link #glDrawBuffers DrawBuffers} */
	@JavadocExclude
	public static native void nglDrawBuffers(int n, long bufs, long __functionAddress);

	/** Unsafe version of {@link #glDrawBuffers DrawBuffers} */
	@JavadocExclude
	public static void nglDrawBuffers(int n, long bufs) {
		long __functionAddress = getInstance().DrawBuffers;
		nglDrawBuffers(n, bufs, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies a list of color buffers to be drawn into.
	 *
	 * @param n    the number of buffers in {@code bufs}
	 * @param bufs an array of symbolic constants specifying the buffers into which fragment colors or data values will be written. One of:<br>{@link GL11#GL_NONE NONE}, {@link GL11#GL_FRONT_LEFT FRONT_LEFT}, {@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}, {@link GL11#GL_BACK_LEFT BACK_LEFT}, {@link GL11#GL_BACK_RIGHT BACK_RIGHT}, {@link GL11#GL_AUX0 AUX0}, {@link GL11#GL_AUX1 AUX1}, {@link GL11#GL_AUX2 AUX2}, {@link GL11#GL_AUX3 AUX3}, {@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, GL30.GL_COLOR_ATTACHMENT[1-15]
	 */
	public static void glDrawBuffers(int n, ByteBuffer bufs) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(bufs, n << 2);
		nglDrawBuffers(n, memAddress(bufs));
	}

	/** Alternative version of: {@link #glDrawBuffers DrawBuffers} */
	public static void glDrawBuffers(IntBuffer bufs) {
		nglDrawBuffers(bufs.remaining(), memAddress(bufs));
	}

	/** Single value version of: {@link #glDrawBuffers DrawBuffers} */
	public static void glDrawBuffers(int buf) {
		APIBuffer __buffer = apiBuffer();
		int bufs = __buffer.intParam(buf);
		nglDrawBuffers(1, __buffer.address(bufs));
	}

	// --- [ glBlendEquationSeparate ] ---

	/** JNI method for {@link #glBlendEquationSeparate BlendEquationSeparate} */
	@JavadocExclude
	public static native void nglBlendEquationSeparate(int modeRGB, int modeAlpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBlendEquationSeparate.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the RGB blend equation and the alpha blend equation separately.
	 *
	 * @param modeRGB   the RGB blend equation, how the red, green, and blue components of the source and destination colors are combined. One of:<br>{@link GL14#GL_FUNC_ADD FUNC_ADD}, {@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}, {@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link GL14#GL_MIN MIN}, {@link GL14#GL_MAX MAX}
	 * @param modeAlpha the alpha blend equation, how the alpha component of the source and destination colors are combined
	 */
	public static void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
		long __functionAddress = getInstance().BlendEquationSeparate;
		nglBlendEquationSeparate(modeRGB, modeAlpha, __functionAddress);
	}

	// --- [ glStencilOpSeparate ] ---

	/** JNI method for {@link #glStencilOpSeparate StencilOpSeparate} */
	@JavadocExclude
	public static native void nglStencilOpSeparate(int face, int sfail, int dpfail, int dppass, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glStencilOpSeparate.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets front and/or back stencil test actions.
	 *
	 * @param face   whether front and/or back stencil state is updated. One of:<br>{@link GL11#GL_FRONT FRONT}, {@link GL11#GL_BACK BACK}, {@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}
	 * @param sfail  the action to take when the stencil test fails. The initial value is GL_KEEP. One of:<br>{@link GL11#GL_KEEP KEEP}, {@link GL11#GL_ZERO ZERO}, {@link GL11#GL_REPLACE REPLACE}, {@link GL11#GL_INCR INCR}, {@link GL14#GL_INCR_WRAP INCR_WRAP}, {@link GL11#GL_DECR DECR}, {@link GL14#GL_DECR_WRAP DECR_WRAP}, {@link GL11#GL_INVERT INVERT}
	 * @param dpfail the stencil action when the stencil test passes, but the depth test fails. The initial value is GL_KEEP
	 * @param dppass the stencil action when both the stencil test and the depth test pass, or when the stencil test passes and either there is no depth buffer or depth
	 *               testing is not enabled. The initial value is GL_KEEP
	 */
	public static void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
		long __functionAddress = getInstance().StencilOpSeparate;
		nglStencilOpSeparate(face, sfail, dpfail, dppass, __functionAddress);
	}

	// --- [ glStencilFuncSeparate ] ---

	/** JNI method for {@link #glStencilFuncSeparate StencilFuncSeparate} */
	@JavadocExclude
	public static native void nglStencilFuncSeparate(int face, int func, int ref, int mask, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glStencilFuncSeparate.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets front and/or back function and reference value for stencil testing.
	 *
	 * @param face whether front and/or back stencil state is updated. One of:<br>{@link GL11#GL_FRONT FRONT}, {@link GL11#GL_BACK BACK}, {@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}
	 * @param func the test function. The initial value is GL_ALWAYS. One of:<br>{@link GL11#GL_NEVER NEVER}, {@link GL11#GL_LESS LESS}, {@link GL11#GL_LEQUAL LEQUAL}, {@link GL11#GL_GREATER GREATER}, {@link GL11#GL_GEQUAL GEQUAL}, {@link GL11#GL_EQUAL EQUAL}, {@link GL11#GL_NOTEQUAL NOTEQUAL}, {@link GL11#GL_ALWAYS ALWAYS}
	 * @param ref  the reference value for the stencil test. {@code ref} is clamped to the range [0, 2n &ndash; 1], where {@code n} is the number of bitplanes in the stencil
	 *             buffer. The initial value is 0.
	 * @param mask a mask that is ANDed with both the reference value and the stored stencil value when the test is done. The initial value is all 1's.
	 */
	public static void glStencilFuncSeparate(int face, int func, int ref, int mask) {
		long __functionAddress = getInstance().StencilFuncSeparate;
		nglStencilFuncSeparate(face, func, ref, mask, __functionAddress);
	}

	// --- [ glStencilMaskSeparate ] ---

	/** JNI method for {@link #glStencilMaskSeparate StencilMaskSeparate} */
	@JavadocExclude
	public static native void nglStencilMaskSeparate(int face, int mask, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glStencilMaskSeparate.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Controls the front and/or back writing of individual bits in the stencil planes.
	 *
	 * @param face whether front and/or back stencil writemask is updated. One of:<br>{@link GL11#GL_FRONT FRONT}, {@link GL11#GL_BACK BACK}, {@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}
	 * @param mask a bit mask to enable and disable writing of individual bits in the stencil planes. Initially, the mask is all 1's.
	 */
	public static void glStencilMaskSeparate(int face, int mask) {
		long __functionAddress = getInstance().StencilMaskSeparate;
		nglStencilMaskSeparate(face, mask, __functionAddress);
	}

}