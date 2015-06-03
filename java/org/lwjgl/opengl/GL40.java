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
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * The core OpenGL 4.0 functionality. OpenGL 4.0 implementations support revision 4.00 of the OpenGL Shading Language.
 * 
 * <p>Extensions promoted to core in this release:
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_query_lod.txt">ARB_texture_query_lod</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/draw_buffers_blend.txt">ARB_draw_buffers_blend</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/draw_indirect.txt">ARB_draw_indirect</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/gpu_shader5.txt">ARB_gpu_shader5</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/gpu_shader_fp64.txt">ARB_gpu_shader_fp64</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/sample_shading.txt">ARB_sample_shading</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/shader_subroutine.txt">ARB_shader_subroutine</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/tessellation_shader.txt">ARB_tessellation_shader</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_buffer_object_rgb32.txt">ARB_texture_buffer_object_rgb32</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_cube_map_array.txt">ARB_texture_cube_map_array</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_gather.txt">ARB_texture_gather</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/transform_feedback2.txt">ARB_transform_feedback2</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/transform_feedback3.txt">ARB_transform_feedback3</a></li>
 * </ul></p>
 */
public final class GL40 {

	/**
	 * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
	 * MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, and CopyBufferSubData.
	 */
	public static final int GL_DRAW_INDIRECT_BUFFER = 0x8F3F;

	/** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev. */
	public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int GL_GEOMETRY_SHADER_INVOCATIONS = 0x887F;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v. */
	public static final int
		GL_MAX_GEOMETRY_SHADER_INVOCATIONS    = 0x8E5A,
		GL_MIN_FRAGMENT_INTERPOLATION_OFFSET  = 0x8E5B,
		GL_MAX_FRAGMENT_INTERPOLATION_OFFSET  = 0x8E5C,
		GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 0x8E5D;

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

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int GL_SAMPLE_SHADING = 0x8C36;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int GL_MIN_SAMPLE_SHADING_VALUE = 0x8C37;

	/** Accepted by the {@code pname} parameter of GetProgramStageiv. */
	public static final int
		GL_ACTIVE_SUBROUTINES                   = 0x8DE5,
		GL_ACTIVE_SUBROUTINE_UNIFORMS           = 0x8DE6,
		GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS  = 0x8E47,
		GL_ACTIVE_SUBROUTINE_MAX_LENGTH         = 0x8E48,
		GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 0x8E49;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v. */
	public static final int
		GL_MAX_SUBROUTINES                  = 0x8DE7,
		GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 0x8DE8;

	/** Accepted by the {@code pname} parameter of GetActiveSubroutineUniformiv. */
	public static final int
		GL_NUM_COMPATIBLE_SUBROUTINES = 0x8E4A,
		GL_COMPATIBLE_SUBROUTINES     = 0x8E4B;

	/** Accepted by the {@code mode} parameter of Begin and all vertex array functions that implicitly call Begin. */
	public static final int GL_PATCHES = 0xE;

	/** Accepted by the {@code pname} parameter of PatchParameteri, GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v. */
	public static final int GL_PATCH_VERTICES = 0x8E72;

	/** Accepted by the {@code pname} parameter of PatchParameterfv, GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv, and GetInteger64v. */
	public static final int
		GL_PATCH_DEFAULT_INNER_LEVEL = 0x8E73,
		GL_PATCH_DEFAULT_OUTER_LEVEL = 0x8E74;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int
		GL_TESS_CONTROL_OUTPUT_VERTICES = 0x8E75,
		GL_TESS_GEN_MODE                = 0x8E76,
		GL_TESS_GEN_SPACING             = 0x8E77,
		GL_TESS_GEN_VERTEX_ORDER        = 0x8E78,
		GL_TESS_GEN_POINT_MODE          = 0x8E79;

	/** Returned by GetProgramiv when {@code pname} is TESS_GEN_MODE. */
	public static final int GL_ISOLINES = 0x8E7A;

	/** Returned by GetProgramiv when {@code pname} is TESS_GEN_SPACING. */
	public static final int
		GL_FRACTIONAL_ODD  = 0x8E7B,
		GL_FRACTIONAL_EVEN = 0x8E7C;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v. */
	public static final int
		GL_MAX_PATCH_VERTICES                              = 0x8E7D,
		GL_MAX_TESS_GEN_LEVEL                              = 0x8E7E,
		GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS             = 0x8E7F,
		GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS          = 0x8E80,
		GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS            = 0x8E81,
		GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS         = 0x8E82,
		GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS              = 0x8E83,
		GL_MAX_TESS_PATCH_COMPONENTS                       = 0x8E84,
		GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS        = 0x8E85,
		GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS           = 0x8E86,
		GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS                 = 0x8E89,
		GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS              = 0x8E8A,
		GL_MAX_TESS_CONTROL_INPUT_COMPONENTS               = 0x886C,
		GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS            = 0x886D,
		GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS    = 0x8E1E,
		GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E1F;

	/** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv. */
	public static final int
		GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x84F0,
		GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x84F1;

	/** Accepted by the {@code type} parameter of CreateShader and returned by the {@code params} parameter of GetShaderiv. */
	public static final int
		GL_TESS_EVALUATION_SHADER = 0x8E87,
		GL_TESS_CONTROL_SHADER    = 0x8E88;

	/** Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, BindTexture, and GenerateMipmap. */
	public static final int GL_TEXTURE_CUBE_MAP_ARRAY = 0x9009;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
	public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;

	/** Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CompressedTeximage3D, CompressedTexSubImage3D and CopyTexSubImage3D. */
	public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY = 0x900B;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int
		GL_SAMPLER_CUBE_MAP_ARRAY              = 0x900C,
		GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW       = 0x900D,
		GL_INT_SAMPLER_CUBE_MAP_ARRAY          = 0x900E,
		GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900F;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET     = 0x8E5E,
		GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET     = 0x8E5F,
		GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS = 0x8F9F;

	/** Accepted by the {@code target} parameter of BindTransformFeedback. */
	public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23,
		GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24,
		GL_TRANSFORM_FEEDBACK_BINDING       = 0x8E25;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70,
		GL_MAX_VERTEX_STREAMS             = 0x8E71;

	/** Function address. */
	@JavadocExclude
	public final long
		BlendEquationi,
		BlendEquationSeparatei,
		BlendFunci,
		BlendFuncSeparatei,
		DrawArraysIndirect,
		DrawElementsIndirect,
		Uniform1d,
		Uniform2d,
		Uniform3d,
		Uniform4d,
		Uniform1dv,
		Uniform2dv,
		Uniform3dv,
		Uniform4dv,
		UniformMatrix2dv,
		UniformMatrix3dv,
		UniformMatrix4dv,
		UniformMatrix2x3dv,
		UniformMatrix2x4dv,
		UniformMatrix3x2dv,
		UniformMatrix3x4dv,
		UniformMatrix4x2dv,
		UniformMatrix4x3dv,
		GetUniformdv,
		MinSampleShading,
		GetSubroutineUniformLocation,
		GetSubroutineIndex,
		GetActiveSubroutineUniformiv,
		GetActiveSubroutineUniformName,
		GetActiveSubroutineName,
		UniformSubroutinesuiv,
		GetUniformSubroutineuiv,
		GetProgramStageiv,
		PatchParameteri,
		PatchParameterfv,
		BindTransformFeedback,
		DeleteTransformFeedbacks,
		GenTransformFeedbacks,
		IsTransformFeedback,
		PauseTransformFeedback,
		ResumeTransformFeedback,
		DrawTransformFeedback,
		DrawTransformFeedbackStream,
		BeginQueryIndexed,
		EndQueryIndexed,
		GetQueryIndexediv;

	@JavadocExclude
	public GL40(FunctionProvider provider) {
		BlendEquationi = provider.getFunctionAddress("glBlendEquationi");
		BlendEquationSeparatei = provider.getFunctionAddress("glBlendEquationSeparatei");
		BlendFunci = provider.getFunctionAddress("glBlendFunci");
		BlendFuncSeparatei = provider.getFunctionAddress("glBlendFuncSeparatei");
		DrawArraysIndirect = provider.getFunctionAddress("glDrawArraysIndirect");
		DrawElementsIndirect = provider.getFunctionAddress("glDrawElementsIndirect");
		Uniform1d = provider.getFunctionAddress("glUniform1d");
		Uniform2d = provider.getFunctionAddress("glUniform2d");
		Uniform3d = provider.getFunctionAddress("glUniform3d");
		Uniform4d = provider.getFunctionAddress("glUniform4d");
		Uniform1dv = provider.getFunctionAddress("glUniform1dv");
		Uniform2dv = provider.getFunctionAddress("glUniform2dv");
		Uniform3dv = provider.getFunctionAddress("glUniform3dv");
		Uniform4dv = provider.getFunctionAddress("glUniform4dv");
		UniformMatrix2dv = provider.getFunctionAddress("glUniformMatrix2dv");
		UniformMatrix3dv = provider.getFunctionAddress("glUniformMatrix3dv");
		UniformMatrix4dv = provider.getFunctionAddress("glUniformMatrix4dv");
		UniformMatrix2x3dv = provider.getFunctionAddress("glUniformMatrix2x3dv");
		UniformMatrix2x4dv = provider.getFunctionAddress("glUniformMatrix2x4dv");
		UniformMatrix3x2dv = provider.getFunctionAddress("glUniformMatrix3x2dv");
		UniformMatrix3x4dv = provider.getFunctionAddress("glUniformMatrix3x4dv");
		UniformMatrix4x2dv = provider.getFunctionAddress("glUniformMatrix4x2dv");
		UniformMatrix4x3dv = provider.getFunctionAddress("glUniformMatrix4x3dv");
		GetUniformdv = provider.getFunctionAddress("glGetUniformdv");
		MinSampleShading = provider.getFunctionAddress("glMinSampleShading");
		GetSubroutineUniformLocation = provider.getFunctionAddress("glGetSubroutineUniformLocation");
		GetSubroutineIndex = provider.getFunctionAddress("glGetSubroutineIndex");
		GetActiveSubroutineUniformiv = provider.getFunctionAddress("glGetActiveSubroutineUniformiv");
		GetActiveSubroutineUniformName = provider.getFunctionAddress("glGetActiveSubroutineUniformName");
		GetActiveSubroutineName = provider.getFunctionAddress("glGetActiveSubroutineName");
		UniformSubroutinesuiv = provider.getFunctionAddress("glUniformSubroutinesuiv");
		GetUniformSubroutineuiv = provider.getFunctionAddress("glGetUniformSubroutineuiv");
		GetProgramStageiv = provider.getFunctionAddress("glGetProgramStageiv");
		PatchParameteri = provider.getFunctionAddress("glPatchParameteri");
		PatchParameterfv = provider.getFunctionAddress("glPatchParameterfv");
		BindTransformFeedback = provider.getFunctionAddress("glBindTransformFeedback");
		DeleteTransformFeedbacks = provider.getFunctionAddress("glDeleteTransformFeedbacks");
		GenTransformFeedbacks = provider.getFunctionAddress("glGenTransformFeedbacks");
		IsTransformFeedback = provider.getFunctionAddress("glIsTransformFeedback");
		PauseTransformFeedback = provider.getFunctionAddress("glPauseTransformFeedback");
		ResumeTransformFeedback = provider.getFunctionAddress("glResumeTransformFeedback");
		DrawTransformFeedback = provider.getFunctionAddress("glDrawTransformFeedback");
		DrawTransformFeedbackStream = provider.getFunctionAddress("glDrawTransformFeedbackStream");
		BeginQueryIndexed = provider.getFunctionAddress("glBeginQueryIndexed");
		EndQueryIndexed = provider.getFunctionAddress("glEndQueryIndexed");
		GetQueryIndexediv = provider.getFunctionAddress("glGetQueryIndexediv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL40} instance for the current context. */
	public static GL40 getInstance() {
		return checkFunctionality(GL.getCapabilities().__GL40);
	}

	static GL40 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL40") ) return null;

		GL40 funcs = new GL40(provider);

		boolean supported = checkFunctions(
			funcs.BlendEquationi, funcs.BlendEquationSeparatei, funcs.BlendFunci, funcs.BlendFuncSeparatei, funcs.DrawArraysIndirect, 
			funcs.DrawElementsIndirect, funcs.Uniform1d, funcs.Uniform2d, funcs.Uniform3d, funcs.Uniform4d, funcs.Uniform1dv, funcs.Uniform2dv, 
			funcs.Uniform3dv, funcs.Uniform4dv, funcs.UniformMatrix2dv, funcs.UniformMatrix3dv, funcs.UniformMatrix4dv, funcs.UniformMatrix2x3dv, 
			funcs.UniformMatrix2x4dv, funcs.UniformMatrix3x2dv, funcs.UniformMatrix3x4dv, funcs.UniformMatrix4x2dv, funcs.UniformMatrix4x3dv, 
			funcs.GetUniformdv, funcs.MinSampleShading, funcs.GetSubroutineUniformLocation, funcs.GetSubroutineIndex, funcs.GetActiveSubroutineUniformiv, 
			funcs.GetActiveSubroutineUniformName, funcs.GetActiveSubroutineName, funcs.UniformSubroutinesuiv, funcs.GetUniformSubroutineuiv, 
			funcs.GetProgramStageiv, funcs.PatchParameteri, funcs.PatchParameterfv, funcs.BindTransformFeedback, funcs.DeleteTransformFeedbacks, 
			funcs.GenTransformFeedbacks, funcs.IsTransformFeedback, funcs.PauseTransformFeedback, funcs.ResumeTransformFeedback, funcs.DrawTransformFeedback, 
			funcs.DrawTransformFeedbackStream, funcs.BeginQueryIndexed, funcs.EndQueryIndexed, funcs.GetQueryIndexediv
		);

		return GL.checkExtension("OpenGL40", funcs, supported);
	}

	// --- [ glBlendEquationi ] ---

	/** JNI method for {@link #glBlendEquationi BlendEquationi} */
	@JavadocExclude
	public static native void nglBlendEquationi(int buf, int mode, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBlendEquation.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the equation used for both the RGB blend equation and the Alpha blend equation for the specified draw buffer.
	 *
	 * @param buf  the index of the draw buffer for which to set the blend equation
	 * @param mode how source and destination colors are combined. One of:<br>{@link GL14#GL_FUNC_ADD FUNC_ADD}, {@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}, {@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link GL14#GL_MIN MIN}, {@link GL14#GL_MAX MAX}
	 */
	public static void glBlendEquationi(int buf, int mode) {
		long __functionAddress = getInstance().BlendEquationi;
		nglBlendEquationi(buf, mode, __functionAddress);
	}

	// --- [ glBlendEquationSeparatei ] ---

	/** JNI method for {@link #glBlendEquationSeparatei BlendEquationSeparatei} */
	@JavadocExclude
	public static native void nglBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBlendEquationSeparate.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the RGB blend equation and the alpha blend equation separately for the specified draw buffer.
	 *
	 * @param buf       the index of the draw buffer for which to set the blend equations
	 * @param modeRGB   the RGB blend equation, how the red, green, and blue components of the source and destination colors are combined. One of:<br>{@link GL14#GL_FUNC_ADD FUNC_ADD}, {@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}, {@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link GL14#GL_MIN MIN}, {@link GL14#GL_MAX MAX}
	 * @param modeAlpha the alpha blend equation, how the alpha component of the source and destination colors are combined. One of:<br>{@link GL14#GL_FUNC_ADD FUNC_ADD}, {@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}, {@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link GL14#GL_MIN MIN}, {@link GL14#GL_MAX MAX}
	 */
	public static void glBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
		long __functionAddress = getInstance().BlendEquationSeparatei;
		nglBlendEquationSeparatei(buf, modeRGB, modeAlpha, __functionAddress);
	}

	// --- [ glBlendFunci ] ---

	/** JNI method for {@link #glBlendFunci BlendFunci} */
	@JavadocExclude
	public static native void nglBlendFunci(int buf, int sfactor, int dfactor, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBlendFunci.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies pixel arithmetic for the specified draw buffer.
	 *
	 * @param buf     the index of the draw buffer for which to set the blend function
	 * @param sfactor how the red, green, blue, and alpha source blending factors are computed
	 * @param dfactor how the red, green, blue, and alpha destination blending factors are computed
	 */
	public static void glBlendFunci(int buf, int sfactor, int dfactor) {
		long __functionAddress = getInstance().BlendFunci;
		nglBlendFunci(buf, sfactor, dfactor, __functionAddress);
	}

	// --- [ glBlendFuncSeparatei ] ---

	/** JNI method for {@link #glBlendFuncSeparatei BlendFuncSeparatei} */
	@JavadocExclude
	public static native void nglBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBlendFuncSeparatei.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies pixel arithmetic for RGB and alpha components separately for the specified draw buffer.
	 *
	 * @param buf      the index of the draw buffer for which to set the blend functions
	 * @param srcRGB   how the red, green, and blue blending factors are computed
	 * @param dstRGB   how the red, green, and blue destination blending factors are computed
	 * @param srcAlpha how the alpha source blending factor is computed
	 * @param dstAlpha how the alpha destination blending factor is computed
	 */
	public static void glBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
		long __functionAddress = getInstance().BlendFuncSeparatei;
		nglBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha, __functionAddress);
	}

	// --- [ glDrawArraysIndirect ] ---

	/** JNI method for {@link #glDrawArraysIndirect DrawArraysIndirect} */
	@JavadocExclude
	public static native void nglDrawArraysIndirect(int mode, long indirect, long __functionAddress);

	/** Unsafe version of {@link #glDrawArraysIndirect DrawArraysIndirect} */
	@JavadocExclude
	public static void nglDrawArraysIndirect(int mode, long indirect) {
		long __functionAddress = getInstance().DrawArraysIndirect;
		nglDrawArraysIndirect(mode, indirect, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawArraysIndirect.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives from array data, taking parameters from memory.
	 * 
	 * <p>{@code glDrawArraysIndirect} behaves similarly to {@link GL42#glDrawArraysInstancedBaseInstance DrawArraysInstancedBaseInstance}, except that the parameters to
	 * glDrawArraysInstancedBaseInstance are stored in memory at the address given by {@code indirect}.</p>
	 * 
	 * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):
	 * <pre><code style="font-family: monospace">
	 * typedef struct {
	 * 	uint count;
	 * 	uint primCount;
	 * 	uint first;
	 * 	uint baseInstance; // must be 0 unless OpenGL 4.2 is supported
	 * } DrawArraysIndirectCommand;
	 * 
	 * const DrawArraysIndirectCommand *cmd = (const DrawArraysIndirectCommand *)indirect;
	 * glDrawArraysInstancedBaseInstance(mode, cmd->first, cmd->count, cmd->primCount, cmd->baseInstance);</code></pre></p>
	 *
	 * @param mode     what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link #GL_PATCHES PATCHES}
	 * @param indirect a structure containing the draw parameters
	 */
	public static void glDrawArraysIndirect(int mode, ByteBuffer indirect) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirect, 4 * 4);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglDrawArraysIndirect(mode, memAddress(indirect));
	}

	/** Buffer object offset version of: {@link #glDrawArraysIndirect DrawArraysIndirect} */
	public static void glDrawArraysIndirect(int mode, long indirectOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, true);
		nglDrawArraysIndirect(mode, indirectOffset);
	}

	/** IntBuffer version of: {@link #glDrawArraysIndirect DrawArraysIndirect} */
	public static void glDrawArraysIndirect(int mode, IntBuffer indirect) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirect, (4 * 4) >> 2);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglDrawArraysIndirect(mode, memAddress(indirect));
	}

	// --- [ glDrawElementsIndirect ] ---

	/** JNI method for {@link #glDrawElementsIndirect DrawElementsIndirect} */
	@JavadocExclude
	public static native void nglDrawElementsIndirect(int mode, int type, long indirect, long __functionAddress);

	/** Unsafe version of {@link #glDrawElementsIndirect DrawElementsIndirect} */
	@JavadocExclude
	public static void nglDrawElementsIndirect(int mode, int type, long indirect) {
		long __functionAddress = getInstance().DrawElementsIndirect;
		nglDrawElementsIndirect(mode, type, indirect, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsIndirect.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders indexed primitives from array data, taking parameters from memory.
	 * 
	 * <p>{@code glDrawElementsIndirect} behaves similarly to {@link GL42#glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance}, execpt that the parameters to
	 * glDrawElementsInstancedBaseVertexBaseInstance are stored in memory at the address given by {@code indirect}.</p>
	 * 
	 * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):
	 * <pre><code style="font-family: monospace">
	 * typedef struct {
	 * 	uint count;
	 * 	uint primCount;
	 * 	uint firstIndex;
	 * 	uint baseVertex;
	 * 	uint baseInstance;
	 * } DrawElementsIndirectCommand;</code></pre></p>
	 * 
	 * <p>{@code glDrawElementsIndirect} is equivalent to:
	 * <pre><code style="font-family: monospace">
	 * void glDrawElementsIndirect(GLenum mode, GLenum type, const void *indirect) {
	 * 	const DrawElementsIndirectCommand *cmd  = (const DrawElementsIndirectCommand *)indirect;
	 * 	glDrawElementsInstancedBaseVertexBaseInstance(
	 * 		mode,
	 * 		cmd->count,
	 * 		type,
	 * 		cmd->firstIndex + size-of-type,
	 * 		cmd->primCount,
	 * 		cmd->baseVertex,
	 * 		cmd->baseInstance
	 * 	);
	 * }</code></pre></p>
	 *
	 * @param mode     what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link #GL_PATCHES PATCHES}
	 * @param type     the type of data in the buffer bound to the {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER} binding. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indirect the address of a structure containing the draw parameters
	 */
	public static void glDrawElementsIndirect(int mode, int type, ByteBuffer indirect) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirect, 5 * 4);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglDrawElementsIndirect(mode, type, memAddress(indirect));
	}

	/** Buffer object offset version of: {@link #glDrawElementsIndirect DrawElementsIndirect} */
	public static void glDrawElementsIndirect(int mode, int type, long indirectOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, true);
		nglDrawElementsIndirect(mode, type, indirectOffset);
	}

	/** IntBuffer version of: {@link #glDrawElementsIndirect DrawElementsIndirect} */
	public static void glDrawElementsIndirect(int mode, int type, IntBuffer indirect) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirect, (5 * 4) >> 2);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglDrawElementsIndirect(mode, type, memAddress(indirect));
	}

	// --- [ glUniform1d ] ---

	/** JNI method for {@link #glUniform1d Uniform1d} */
	@JavadocExclude
	public static native void nglUniform1d(int location, double x, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform1d.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a double uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glUniform1d(int location, double x) {
		long __functionAddress = getInstance().Uniform1d;
		nglUniform1d(location, x, __functionAddress);
	}

	// --- [ glUniform2d ] ---

	/** JNI method for {@link #glUniform2d Uniform2d} */
	@JavadocExclude
	public static native void nglUniform2d(int location, double x, double y, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform2d.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a dvec2 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glUniform2d(int location, double x, double y) {
		long __functionAddress = getInstance().Uniform2d;
		nglUniform2d(location, x, y, __functionAddress);
	}

	// --- [ glUniform3d ] ---

	/** JNI method for {@link #glUniform3d Uniform3d} */
	@JavadocExclude
	public static native void nglUniform3d(int location, double x, double y, double z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform3d.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a dvec3 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glUniform3d(int location, double x, double y, double z) {
		long __functionAddress = getInstance().Uniform3d;
		nglUniform3d(location, x, y, z, __functionAddress);
	}

	// --- [ glUniform4d ] ---

	/** JNI method for {@link #glUniform4d Uniform4d} */
	@JavadocExclude
	public static native void nglUniform4d(int location, double x, double y, double z, double w, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform4d.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a dvec4 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 * @param w        the uniform w value
	 */
	public static void glUniform4d(int location, double x, double y, double z, double w) {
		long __functionAddress = getInstance().Uniform4d;
		nglUniform4d(location, x, y, z, w, __functionAddress);
	}

	// --- [ glUniform1dv ] ---

	/** JNI method for {@link #glUniform1dv Uniform1dv} */
	@JavadocExclude
	public static native void nglUniform1dv(int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniform1dv Uniform1dv} */
	@JavadocExclude
	public static void nglUniform1dv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform1dv;
		nglUniform1dv(location, count, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform1.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single double uniform variable or a double uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform1dv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglUniform1dv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1dv Uniform1dv} */
	public static void glUniform1dv(int location, DoubleBuffer value) {
		nglUniform1dv(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2dv ] ---

	/** JNI method for {@link #glUniform2dv Uniform2dv} */
	@JavadocExclude
	public static native void nglUniform2dv(int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniform2dv Uniform2dv} */
	@JavadocExclude
	public static void nglUniform2dv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform2dv;
		nglUniform2dv(location, count, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform2dv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 3);
		nglUniform2dv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2dv Uniform2dv} */
	public static void glUniform2dv(int location, DoubleBuffer value) {
		nglUniform2dv(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3dv ] ---

	/** JNI method for {@link #glUniform3dv Uniform3dv} */
	@JavadocExclude
	public static native void nglUniform3dv(int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniform3dv Uniform3dv} */
	@JavadocExclude
	public static void nglUniform3dv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform3dv;
		nglUniform3dv(location, count, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform3dv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 3);
		nglUniform3dv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3dv Uniform3dv} */
	public static void glUniform3dv(int location, DoubleBuffer value) {
		nglUniform3dv(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4dv ] ---

	/** JNI method for {@link #glUniform4dv Uniform4dv} */
	@JavadocExclude
	public static native void nglUniform4dv(int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniform4dv Uniform4dv} */
	@JavadocExclude
	public static void nglUniform4dv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform4dv;
		nglUniform4dv(location, count, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single dvec4 uniform variable or a dvec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform4dv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglUniform4dv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4dv Uniform4dv} */
	public static void glUniform4dv(int location, DoubleBuffer value) {
		nglUniform4dv(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glUniformMatrix2dv ] ---

	/** JNI method for {@link #glUniformMatrix2dv UniformMatrix2dv} */
	@JavadocExclude
	public static native void nglUniformMatrix2dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix2dv UniformMatrix2dv} */
	@JavadocExclude
	public static void nglUniformMatrix2dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2dv;
		nglUniformMatrix2dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single dmat2 uniform variable or a dmat2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix2dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglUniformMatrix2dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2dv UniformMatrix2dv} */
	public static void glUniformMatrix2dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix2dv(location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3dv ] ---

	/** JNI method for {@link #glUniformMatrix3dv UniformMatrix3dv} */
	@JavadocExclude
	public static native void nglUniformMatrix3dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix3dv UniformMatrix3dv} */
	@JavadocExclude
	public static void nglUniformMatrix3dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3dv;
		nglUniformMatrix3dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single dmat3 uniform variable or a dmat3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix3dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 9) << 3);
		nglUniformMatrix3dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3dv UniformMatrix3dv} */
	public static void glUniformMatrix3dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix3dv(location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4dv ] ---

	/** JNI method for {@link #glUniformMatrix4dv UniformMatrix4dv} */
	@JavadocExclude
	public static native void nglUniformMatrix4dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix4dv UniformMatrix4dv} */
	@JavadocExclude
	public static void nglUniformMatrix4dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4dv;
		nglUniformMatrix4dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single dmat4 uniform variable or a dmat4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix4dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 4) << 3);
		nglUniformMatrix4dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4dv UniformMatrix4dv} */
	public static void glUniformMatrix4dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix4dv(location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix2x3dv ] ---

	/** JNI method for {@link #glUniformMatrix2x3dv UniformMatrix2x3dv} */
	@JavadocExclude
	public static native void nglUniformMatrix2x3dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix2x3dv UniformMatrix2x3dv} */
	@JavadocExclude
	public static void nglUniformMatrix2x3dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2x3dv;
		nglUniformMatrix2x3dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix2x3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single dmat2x3 uniform variable or a dmat2x3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix2x3dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 3);
		nglUniformMatrix2x3dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2x3dv UniformMatrix2x3dv} */
	public static void glUniformMatrix2x3dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix2x3dv(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix2x4dv ] ---

	/** JNI method for {@link #glUniformMatrix2x4dv UniformMatrix2x4dv} */
	@JavadocExclude
	public static native void nglUniformMatrix2x4dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix2x4dv UniformMatrix2x4dv} */
	@JavadocExclude
	public static void nglUniformMatrix2x4dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2x4dv;
		nglUniformMatrix2x4dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix2x4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single dmat2x4 uniform variable or a dmat2x4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix2x4dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 3);
		nglUniformMatrix2x4dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2x4dv UniformMatrix2x4dv} */
	public static void glUniformMatrix2x4dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix2x4dv(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x2dv ] ---

	/** JNI method for {@link #glUniformMatrix3x2dv UniformMatrix3x2dv} */
	@JavadocExclude
	public static native void nglUniformMatrix3x2dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix3x2dv UniformMatrix3x2dv} */
	@JavadocExclude
	public static void nglUniformMatrix3x2dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3x2dv;
		nglUniformMatrix3x2dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix3x2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single dmat3x2 uniform variable or a dmat3x2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix3x2dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 3);
		nglUniformMatrix3x2dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3x2dv UniformMatrix3x2dv} */
	public static void glUniformMatrix3x2dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix3x2dv(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x4dv ] ---

	/** JNI method for {@link #glUniformMatrix3x4dv UniformMatrix3x4dv} */
	@JavadocExclude
	public static native void nglUniformMatrix3x4dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix3x4dv UniformMatrix3x4dv} */
	@JavadocExclude
	public static void nglUniformMatrix3x4dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3x4dv;
		nglUniformMatrix3x4dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix3x4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single dmat3x4 uniform variable or a dmat3x4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix3x4dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 3);
		nglUniformMatrix3x4dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3x4dv UniformMatrix3x4dv} */
	public static void glUniformMatrix3x4dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix3x4dv(location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x2dv ] ---

	/** JNI method for {@link #glUniformMatrix4x2dv UniformMatrix4x2dv} */
	@JavadocExclude
	public static native void nglUniformMatrix4x2dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix4x2dv UniformMatrix4x2dv} */
	@JavadocExclude
	public static void nglUniformMatrix4x2dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4x2dv;
		nglUniformMatrix4x2dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix4x2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix4x2dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 3);
		nglUniformMatrix4x2dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4x2dv UniformMatrix4x2dv} */
	public static void glUniformMatrix4x2dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix4x2dv(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x3dv ] ---

	/** JNI method for {@link #glUniformMatrix4x3dv UniformMatrix4x3dv} */
	@JavadocExclude
	public static native void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix4x3dv UniformMatrix4x3dv} */
	@JavadocExclude
	public static void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4x3dv;
		nglUniformMatrix4x3dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix4x3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix4x3dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 3);
		nglUniformMatrix4x3dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4x3dv UniformMatrix4x3dv} */
	public static void glUniformMatrix4x3dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix4x3dv(location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glGetUniformdv ] ---

	/** JNI method for {@link #glGetUniformdv GetUniformdv} */
	@JavadocExclude
	public static native void nglGetUniformdv(int program, int location, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetUniformdv GetUniformdv} */
	@JavadocExclude
	public static void nglGetUniformdv(int program, int location, long params) {
		long __functionAddress = getInstance().GetUniformdv;
		nglGetUniformdv(program, location, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the double value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetUniformdv(int program, int location, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetUniformdv(program, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformdv GetUniformdv} */
	public static void glGetUniformdv(int program, int location, DoubleBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetUniformdv(program, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformdv GetUniformdv} */
	public static double glGetUniformd(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.doubleParam();
		nglGetUniformdv(program, location, __buffer.address(params));
		return __buffer.doubleValue(params);
	}

	// --- [ glMinSampleShading ] ---

	/** JNI method for {@link #glMinSampleShading MinSampleShading} */
	@JavadocExclude
	public static native void nglMinSampleShading(float value, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMinSampleShading.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the minimum rate at which sample shading takes place.
	 *
	 * @param value the rate at which samples are shaded within each covered pixel
	 */
	public static void glMinSampleShading(float value) {
		long __functionAddress = getInstance().MinSampleShading;
		nglMinSampleShading(value, __functionAddress);
	}

	// --- [ glGetSubroutineUniformLocation ] ---

	/** JNI method for {@link #glGetSubroutineUniformLocation GetSubroutineUniformLocation} */
	@JavadocExclude
	public static native int nglGetSubroutineUniformLocation(int program, int shadertype, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetSubroutineUniformLocation GetSubroutineUniformLocation} */
	@JavadocExclude
	public static int nglGetSubroutineUniformLocation(int program, int shadertype, long name) {
		long __functionAddress = getInstance().GetSubroutineUniformLocation;
		return nglGetSubroutineUniformLocation(program, shadertype, name, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSubroutineUniformLocation.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves the location of a subroutine uniform of a given shader stage within a program.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param name       the name of the subroutine uniform whose index to query.
	 */
	public static int glGetSubroutineUniformLocation(int program, int shadertype, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetSubroutineUniformLocation(program, shadertype, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetSubroutineUniformLocation GetSubroutineUniformLocation} */
	public static int glGetSubroutineUniformLocation(int program, int shadertype, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetSubroutineUniformLocation(program, shadertype, __buffer.address(nameEncoded));
	}

	// --- [ glGetSubroutineIndex ] ---

	/** JNI method for {@link #glGetSubroutineIndex GetSubroutineIndex} */
	@JavadocExclude
	public static native int nglGetSubroutineIndex(int program, int shadertype, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetSubroutineIndex GetSubroutineIndex} */
	@JavadocExclude
	public static int nglGetSubroutineIndex(int program, int shadertype, long name) {
		long __functionAddress = getInstance().GetSubroutineIndex;
		return nglGetSubroutineIndex(program, shadertype, name, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSubroutineIndex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves the index of a subroutine function of a given shader stage within a program.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for subroutine function index. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param name       the name of the subroutine function whose index to query
	 */
	public static int glGetSubroutineIndex(int program, int shadertype, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetSubroutineIndex(program, shadertype, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetSubroutineIndex GetSubroutineIndex} */
	public static int glGetSubroutineIndex(int program, int shadertype, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetSubroutineIndex(program, shadertype, __buffer.address(nameEncoded));
	}

	// --- [ glGetActiveSubroutineUniformiv ] ---

	/** JNI method for {@link #glGetActiveSubroutineUniformiv GetActiveSubroutineUniformiv} */
	@JavadocExclude
	public static native void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values, long __functionAddress);

	/** Unsafe version of {@link #glGetActiveSubroutineUniformiv GetActiveSubroutineUniformiv} */
	@JavadocExclude
	public static void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values) {
		long __functionAddress = getInstance().GetActiveSubroutineUniformiv;
		nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, values, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetActiveSubroutineUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries a property of an active shader subroutine uniform.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param index      the index of the shader subroutine uniform
	 * @param pname      the parameter of the shader subroutine uniform to query. One of:<br>{@link #GL_NUM_COMPATIBLE_SUBROUTINES NUM_COMPATIBLE_SUBROUTINES}, {@link #GL_COMPATIBLE_SUBROUTINES COMPATIBLE_SUBROUTINES}, {@link GL31#GL_UNIFORM_SIZE UNIFORM_SIZE}, {@link GL31#GL_UNIFORM_NAME_LENGTH UNIFORM_NAME_LENGTH}
	 * @param values     the address of a buffer into which the queried value or values will be placed
	 */
	public static void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1 << 2);
		nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, memAddress(values));
	}

	/** Alternative version of: {@link #glGetActiveSubroutineUniformiv GetActiveSubroutineUniformiv} */
	public static void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, IntBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1);
		nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, memAddress(values));
	}

	/** Single return value version of: {@link #glGetActiveSubroutineUniformiv GetActiveSubroutineUniformiv} */
	public static int glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int values = __buffer.intParam();
		nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, __buffer.address(values));
		return __buffer.intValue(values);
	}

	// --- [ glGetActiveSubroutineUniformName ] ---

	/** JNI method for {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName} */
	@JavadocExclude
	public static native void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName} */
	@JavadocExclude
	public static void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name) {
		long __functionAddress = getInstance().GetActiveSubroutineUniformName;
		nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, length, name, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetActiveSubroutineUniformName.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the name of an active shader subroutine uniform.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param index      the index of the shader subroutine uniform
	 * @param bufsize    the size of the buffer whose address is given in {@code name}
	 * @param length     the address of a variable into which is written the number of characters copied into {@code name}
	 * @param name       the address of a buffer that will receive the name of the specified shader subroutine uniform
	 */
	public static void glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, ByteBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, bufsize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, memAddressSafe(length), memAddress(name));
	}

	/** Alternative version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName} */
	public static void glGetActiveSubroutineUniformName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetActiveSubroutineUniformName(program, shadertype, index, name.remaining(), memAddressSafe(length), memAddress(name));
	}

	/** String return version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName} */
	public static String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufsize);
		nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName} */
	public static String glGetActiveSubroutineUniformName(int program, int shadertype, int index) {
		int bufsize = glGetActiveSubroutineUniformi(program, shadertype, index, GL31.GL_UNIFORM_NAME_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufsize);
		nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	// --- [ glGetActiveSubroutineName ] ---

	/** JNI method for {@link #glGetActiveSubroutineName GetActiveSubroutineName} */
	@JavadocExclude
	public static native void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetActiveSubroutineName GetActiveSubroutineName} */
	@JavadocExclude
	public static void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name) {
		long __functionAddress = getInstance().GetActiveSubroutineName;
		nglGetActiveSubroutineName(program, shadertype, index, bufsize, length, name, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetActiveSubroutineName.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the name of an active shader subroutine.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query the subroutine name. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param index      the index of the shader subroutine uniform
	 * @param bufsize    the size of the buffer whose address is given in {@code name}
	 * @param length     a variable which is to receive the length of the shader subroutine uniform name
	 * @param name       an array into which the name of the shader subroutine uniform will be written
	 */
	public static void glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, ByteBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, bufsize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetActiveSubroutineName(program, shadertype, index, bufsize, memAddressSafe(length), memAddress(name));
	}

	/** Alternative version of: {@link #glGetActiveSubroutineName GetActiveSubroutineName} */
	public static void glGetActiveSubroutineName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetActiveSubroutineName(program, shadertype, index, name.remaining(), memAddressSafe(length), memAddress(name));
	}

	/** String return version of: {@link #glGetActiveSubroutineName GetActiveSubroutineName} */
	public static String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufsize);
		nglGetActiveSubroutineName(program, shadertype, index, bufsize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveSubroutineName GetActiveSubroutineName} */
	public static String glGetActiveSubroutineName(int program, int shadertype, int index) {
		int bufsize = glGetProgramStagei(program, shadertype, GL_ACTIVE_SUBROUTINE_MAX_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufsize);
		nglGetActiveSubroutineName(program, shadertype, index, bufsize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	// --- [ glUniformSubroutinesuiv ] ---

	/** JNI method for {@link #glUniformSubroutinesuiv UniformSubroutinesuiv} */
	@JavadocExclude
	public static native void nglUniformSubroutinesuiv(int shadertype, int count, long indices, long __functionAddress);

	/** Unsafe version of {@link #glUniformSubroutinesuiv UniformSubroutinesuiv} */
	@JavadocExclude
	public static void nglUniformSubroutinesuiv(int shadertype, int count, long indices) {
		long __functionAddress = getInstance().UniformSubroutinesuiv;
		nglUniformSubroutinesuiv(shadertype, count, indices, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformSubroutines.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Loads active subroutine uniforms.
	 *
	 * @param shadertype the shader stage to update. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param count      the number of uniform indices stored in {@code indices}
	 * @param indices    an array holding the indices to load into the shader subroutine variables
	 */
	public static void glUniformSubroutinesuiv(int shadertype, int count, ByteBuffer indices) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, count << 2);
		nglUniformSubroutinesuiv(shadertype, count, memAddress(indices));
	}

	/** Alternative version of: {@link #glUniformSubroutinesuiv UniformSubroutinesuiv} */
	public static void glUniformSubroutinesuiv(int shadertype, IntBuffer indices) {
		nglUniformSubroutinesuiv(shadertype, indices.remaining(), memAddress(indices));
	}

	/** Single value version of: {@link #glUniformSubroutinesuiv UniformSubroutinesuiv} */
	public static void glUniformSubroutinesui(int shadertype, int index) {
		APIBuffer __buffer = apiBuffer();
		int indices = __buffer.intParam(index);
		nglUniformSubroutinesuiv(shadertype, 1, __buffer.address(indices));
	}

	// --- [ glGetUniformSubroutineuiv ] ---

	/** JNI method for {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv} */
	@JavadocExclude
	public static native void nglGetUniformSubroutineuiv(int shadertype, int location, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv} */
	@JavadocExclude
	public static void nglGetUniformSubroutineuiv(int shadertype, int location, long params) {
		long __functionAddress = getInstance().GetUniformSubroutineuiv;
		nglGetUniformSubroutineuiv(shadertype, location, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetUniformSubroutine.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves the value of a subroutine uniform of a given shader stage of the current program.
	 *
	 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param location   the location of the subroutine uniform
	 * @param params     a variable to receive the value or values of the subroutine uniform
	 */
	public static void glGetUniformSubroutineuiv(int shadertype, int location, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetUniformSubroutineuiv(shadertype, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv} */
	public static void glGetUniformSubroutineuiv(int shadertype, int location, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetUniformSubroutineuiv(shadertype, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv} */
	public static int glGetUniformSubroutineui(int shadertype, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetUniformSubroutineuiv(shadertype, location, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetProgramStageiv ] ---

	/** JNI method for {@link #glGetProgramStageiv GetProgramStageiv} */
	@JavadocExclude
	public static native void nglGetProgramStageiv(int program, int shadertype, int pname, long values, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramStageiv GetProgramStageiv} */
	@JavadocExclude
	public static void nglGetProgramStageiv(int program, int shadertype, int pname, long values) {
		long __functionAddress = getInstance().GetProgramStageiv;
		nglGetProgramStageiv(program, shadertype, pname, values, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetProgramStage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves properties of a program object corresponding to a specified shader stage.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param pname      the parameter of the shader to query. One of:<br>{@link #GL_ACTIVE_SUBROUTINES ACTIVE_SUBROUTINES}, {@link #GL_ACTIVE_SUBROUTINE_UNIFORMS ACTIVE_SUBROUTINE_UNIFORMS}, {@link #GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS}, {@link #GL_ACTIVE_SUBROUTINE_MAX_LENGTH ACTIVE_SUBROUTINE_MAX_LENGTH}, {@link #GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH}
	 * @param values     a variable into which the queried value or values will be placed
	 */
	public static void glGetProgramStageiv(int program, int shadertype, int pname, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1 << 2);
		nglGetProgramStageiv(program, shadertype, pname, memAddress(values));
	}

	/** Alternative version of: {@link #glGetProgramStageiv GetProgramStageiv} */
	public static void glGetProgramStageiv(int program, int shadertype, int pname, IntBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1);
		nglGetProgramStageiv(program, shadertype, pname, memAddress(values));
	}

	/** Single return value version of: {@link #glGetProgramStageiv GetProgramStageiv} */
	public static int glGetProgramStagei(int program, int shadertype, int pname) {
		APIBuffer __buffer = apiBuffer();
		int values = __buffer.intParam();
		nglGetProgramStageiv(program, shadertype, pname, __buffer.address(values));
		return __buffer.intValue(values);
	}

	// --- [ glPatchParameteri ] ---

	/** JNI method for {@link #glPatchParameteri PatchParameteri} */
	@JavadocExclude
	public static native void nglPatchParameteri(int pname, int value, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPatchParameteri.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the integer value of the specified parameter for patch primitives.
	 *
	 * @param pname the name of the parameter to set. Must be:<br>{@link #GL_PATCH_VERTICES PATCH_VERTICES}
	 * @param value the new value for the parameter given by {@code pname}
	 */
	public static void glPatchParameteri(int pname, int value) {
		long __functionAddress = getInstance().PatchParameteri;
		nglPatchParameteri(pname, value, __functionAddress);
	}

	// --- [ glPatchParameterfv ] ---

	/** JNI method for {@link #glPatchParameterfv PatchParameterfv} */
	@JavadocExclude
	public static native void nglPatchParameterfv(int pname, long values, long __functionAddress);

	/** Unsafe version of {@link #glPatchParameterfv PatchParameterfv} */
	@JavadocExclude
	public static void nglPatchParameterfv(int pname, long values) {
		long __functionAddress = getInstance().PatchParameterfv;
		nglPatchParameterfv(pname, values, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPatchParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies an array of float values for the specified parameter for patch primitives.
	 *
	 * @param pname  the name of the parameter to set. One of:<br>{@link #GL_PATCH_DEFAULT_OUTER_LEVEL PATCH_DEFAULT_OUTER_LEVEL}, {@link #GL_PATCH_DEFAULT_INNER_LEVEL PATCH_DEFAULT_INNER_LEVEL}
	 * @param values an array containing the new values for the parameter given by {@code pname}
	 */
	public static void glPatchParameterfv(int pname, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			if ( LWJGLUtil.DEBUG )
				checkBuffer(values, GL11.glGetInteger(GL_PATCH_VERTICES) << 2);
		nglPatchParameterfv(pname, memAddress(values));
	}

	/** Alternative version of: {@link #glPatchParameterfv PatchParameterfv} */
	public static void glPatchParameterfv(int pname, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			if ( LWJGLUtil.DEBUG )
				checkBuffer(values, GL11.glGetInteger(GL_PATCH_VERTICES));
		nglPatchParameterfv(pname, memAddress(values));
	}

	// --- [ glBindTransformFeedback ] ---

	/** JNI method for {@link #glBindTransformFeedback BindTransformFeedback} */
	@JavadocExclude
	public static native void nglBindTransformFeedback(int target, int id, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a transform feedback object.
	 *
	 * @param target the target to which to bind the transform feedback object {@code id}. Must be:<br>{@link #GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}
	 * @param id     the name of a transform feedback object
	 */
	public static void glBindTransformFeedback(int target, int id) {
		long __functionAddress = getInstance().BindTransformFeedback;
		nglBindTransformFeedback(target, id, __functionAddress);
	}

	// --- [ glDeleteTransformFeedbacks ] ---

	/** JNI method for {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks} */
	@JavadocExclude
	public static native void nglDeleteTransformFeedbacks(int n, long ids, long __functionAddress);

	/** Unsafe version of {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks} */
	@JavadocExclude
	public static void nglDeleteTransformFeedbacks(int n, long ids) {
		long __functionAddress = getInstance().DeleteTransformFeedbacks;
		nglDeleteTransformFeedbacks(n, ids, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteTransformFeedbacks.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes transform feedback objects.
	 *
	 * @param n   the number of transform feedback objects to delete
	 * @param ids an array of names of transform feedback objects to delete
	 */
	public static void glDeleteTransformFeedbacks(int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, n << 2);
		nglDeleteTransformFeedbacks(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks} */
	public static void glDeleteTransformFeedbacks(IntBuffer ids) {
		nglDeleteTransformFeedbacks(ids.remaining(), memAddress(ids));
	}

	/** Single value version of: {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks} */
	public static void glDeleteTransformFeedbacks(int id) {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam(id);
		nglDeleteTransformFeedbacks(1, __buffer.address(ids));
	}

	// --- [ glGenTransformFeedbacks ] ---

	/** JNI method for {@link #glGenTransformFeedbacks GenTransformFeedbacks} */
	@JavadocExclude
	public static native void nglGenTransformFeedbacks(int n, long ids, long __functionAddress);

	/** Unsafe version of {@link #glGenTransformFeedbacks GenTransformFeedbacks} */
	@JavadocExclude
	public static void nglGenTransformFeedbacks(int n, long ids) {
		long __functionAddress = getInstance().GenTransformFeedbacks;
		nglGenTransformFeedbacks(n, ids, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenTransformFeedbacks.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Reserves transform feedback object names.
	 *
	 * @param n   the number of transform feedback object names to reserve
	 * @param ids an array of into which the reserved names will be written
	 */
	public static void glGenTransformFeedbacks(int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, n << 2);
		nglGenTransformFeedbacks(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glGenTransformFeedbacks GenTransformFeedbacks} */
	public static void glGenTransformFeedbacks(IntBuffer ids) {
		nglGenTransformFeedbacks(ids.remaining(), memAddress(ids));
	}

	/** Single return value version of: {@link #glGenTransformFeedbacks GenTransformFeedbacks} */
	public static int glGenTransformFeedbacks() {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam();
		nglGenTransformFeedbacks(1, __buffer.address(ids));
		return __buffer.intValue(ids);
	}

	// --- [ glIsTransformFeedback ] ---

	/** JNI method for {@link #glIsTransformFeedback IsTransformFeedback} */
	@JavadocExclude
	public static native boolean nglIsTransformFeedback(int id, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Determines if a name corresponds to a transform feedback object.
	 *
	 * @param id a value that may be the name of a transform feedback object
	 */
	public static boolean glIsTransformFeedback(int id) {
		long __functionAddress = getInstance().IsTransformFeedback;
		return nglIsTransformFeedback(id, __functionAddress);
	}

	// --- [ glPauseTransformFeedback ] ---

	/** JNI method for {@link #glPauseTransformFeedback PauseTransformFeedback} */
	@JavadocExclude
	public static native void nglPauseTransformFeedback(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPauseTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pauses transform feedback operations for the currently bound transform feedback object.
	 * 
	 * <p>When transform feedback operations are paused, transform feedback is still considered active and changing most transform feedback state related to the
	 * object results in an error. However, a new transform feedback object may be bound while transform feedback is paused. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION}
	 * is generated by PauseTransformFeedback if the currently bound transform feedback is not active or is paused.</p>
	 * 
	 * <p>When transform feedback is active and not paused, all geometric primitives generated must be compatible with the value of {@code primitiveMode} passed
	 * to {@link GL30#glBeginTransformFeedback BeginTransformFeedback}. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by {@link GL11#glBegin Begin} or any operation that implicitly calls {@link GL11#glBegin Begin}
	 * (such as {@link GL11#glDrawElements DrawElements}) if {@code mode} is not one of the allowed modes. If a geometry shader is active, its output primitive type is used instead
	 * of the {@code mode} parameter passed to {@link GL11#glBegin Begin} for the purposes of this error check. Any primitive type may be used while transform feedback is
	 * paused.</p>
	 */
	public static void glPauseTransformFeedback() {
		long __functionAddress = getInstance().PauseTransformFeedback;
		nglPauseTransformFeedback(__functionAddress);
	}

	// --- [ glResumeTransformFeedback ] ---

	/** JNI method for {@link #glResumeTransformFeedback ResumeTransformFeedback} */
	@JavadocExclude
	public static native void nglResumeTransformFeedback(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glResumeTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Resumes transform feedback operations for the currently bound transform feedback object.
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by {@link #glResumeTransformFeedback ResumeTransformFeedback} if the currently bound transform feedback is not active or is not paused.</p>
	 */
	public static void glResumeTransformFeedback() {
		long __functionAddress = getInstance().ResumeTransformFeedback;
		nglResumeTransformFeedback(__functionAddress);
	}

	// --- [ glDrawTransformFeedback ] ---

	/** JNI method for {@link #glDrawTransformFeedback DrawTransformFeedback} */
	@JavadocExclude
	public static native void nglDrawTransformFeedback(int mode, int id, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Render primitives using a count derived from a transform feedback object.
	 *
	 * @param mode what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link #GL_PATCHES PATCHES}
	 * @param id   the name of a transform feedback object from which to retrieve a primitive count
	 */
	public static void glDrawTransformFeedback(int mode, int id) {
		long __functionAddress = getInstance().DrawTransformFeedback;
		nglDrawTransformFeedback(mode, id, __functionAddress);
	}

	// --- [ glDrawTransformFeedbackStream ] ---

	/** JNI method for {@link #glDrawTransformFeedbackStream DrawTransformFeedbackStream} */
	@JavadocExclude
	public static native void nglDrawTransformFeedbackStream(int mode, int id, int stream, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawTransformFeedbackStream.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives using a count derived from a specifed stream of a transform feedback object.
	 *
	 * @param mode   what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link #GL_PATCHES PATCHES}
	 * @param id     the name of a transform feedback object from which to retrieve a primitive count
	 * @param stream the index of the transform feedback stream from which to retrieve a primitive count
	 */
	public static void glDrawTransformFeedbackStream(int mode, int id, int stream) {
		long __functionAddress = getInstance().DrawTransformFeedbackStream;
		nglDrawTransformFeedbackStream(mode, id, stream, __functionAddress);
	}

	// --- [ glBeginQueryIndexed ] ---

	/** JNI method for {@link #glBeginQueryIndexed BeginQueryIndexed} */
	@JavadocExclude
	public static native void nglBeginQueryIndexed(int target, int index, int id, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBeginQueryIndexed.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Begins a query object on an indexed target
	 *
	 * @param target the target type of query object established between {@code glBeginQueryIndexed} and the subsequent {@link #glEndQueryIndexed EndQueryIndexed}. One of:<br>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param index  the index of the query target upon which to begin the query
	 * @param id     the name of a query object
	 */
	public static void glBeginQueryIndexed(int target, int index, int id) {
		long __functionAddress = getInstance().BeginQueryIndexed;
		nglBeginQueryIndexed(target, index, id, __functionAddress);
	}

	// --- [ glEndQueryIndexed ] ---

	/** JNI method for {@link #glEndQueryIndexed EndQueryIndexed} */
	@JavadocExclude
	public static native void nglEndQueryIndexed(int target, int index, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBeginQueryIndexed.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Ends a query object on an indexed target
	 *
	 * @param target the target type of query object to be concluded. One of:<br>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param index  the index of the query target upon which to end the query
	 */
	public static void glEndQueryIndexed(int target, int index) {
		long __functionAddress = getInstance().EndQueryIndexed;
		nglEndQueryIndexed(target, index, __functionAddress);
	}

	// --- [ glGetQueryIndexediv ] ---

	/** JNI method for {@link #glGetQueryIndexediv GetQueryIndexediv} */
	@JavadocExclude
	public static native void nglGetQueryIndexediv(int target, int index, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetQueryIndexediv GetQueryIndexediv} */
	@JavadocExclude
	public static void nglGetQueryIndexediv(int target, int index, int pname, long params) {
		long __functionAddress = getInstance().GetQueryIndexediv;
		nglGetQueryIndexediv(target, index, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryIndexed.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns parameters of an indexed query object target.
	 *
	 * @param target a query object target. One of:<br>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param index  the index of the query object target
	 * @param pname  the symbolic name of a query object target parameter
	 * @param params the requested data
	 */
	public static void glGetQueryIndexediv(int target, int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetQueryIndexediv(target, index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryIndexediv GetQueryIndexediv} */
	public static void glGetQueryIndexediv(int target, int index, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryIndexediv(target, index, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryIndexediv GetQueryIndexediv} */
	public static int glGetQueryIndexedi(int target, int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryIndexediv(target, index, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

}