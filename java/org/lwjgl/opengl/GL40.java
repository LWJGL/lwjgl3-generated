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

/** The core OpenGL 4.0 functionality. */
public final class GL40 {

	/**
	 * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
	 * MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, and CopyBufferSubData.
	 */
	public static final int
		GL_DRAW_INDIRECT_BUFFER = 0x8F3F;

	/** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev. */
	public static final int
		GL_DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int
		GL_GEOMETRY_SHADER_INVOCATIONS = 0x887F;

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
	public static final int
		GL_SAMPLE_SHADING = 0x8C36;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_MIN_SAMPLE_SHADING_VALUE = 0x8C37;

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
	public static final int
		GL_PATCHES = 0xE;

	/** Accepted by the {@code pname} parameter of PatchParameteri, GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v. */
	public static final int
		GL_PATCH_VERTICES = 0x8E72;

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
	public static final int
		GL_ISOLINES = 0x8E7A;

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
	public static final int
		GL_TEXTURE_CUBE_MAP_ARRAY = 0x9009;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
	public static final int
		GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;

	/** Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CompressedTeximage3D, CompressedTexSubImage3D and CopyTexSubImage3D. */
	public static final int
		GL_PROXY_TEXTURE_CUBE_MAP_ARRAY = 0x900B;

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
	public static final int
		GL_TRANSFORM_FEEDBACK = 0x8E22;

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
		glBlendEquationi,
		glBlendEquationSeparatei,
		glBlendFunci,
		glBlendFuncSeparatei,
		glDrawArraysIndirect,
		glDrawElementsIndirect,
		glUniform1d,
		glUniform2d,
		glUniform3d,
		glUniform4d,
		glUniform1dv,
		glUniform2dv,
		glUniform3dv,
		glUniform4dv,
		glUniformMatrix2dv,
		glUniformMatrix3dv,
		glUniformMatrix4dv,
		glUniformMatrix2x3dv,
		glUniformMatrix2x4dv,
		glUniformMatrix3x2dv,
		glUniformMatrix3x4dv,
		glUniformMatrix4x2dv,
		glUniformMatrix4x3dv,
		glGetUniformdv,
		glMinSampleShading,
		glGetSubroutineUniformLocation,
		glGetSubroutineIndex,
		glGetActiveSubroutineUniformiv,
		glGetActiveSubroutineUniformName,
		glGetActiveSubroutineName,
		glUniformSubroutinesuiv,
		glGetUniformSubroutineuiv,
		glGetProgramStageiv,
		glPatchParameteri,
		glPatchParameterfv,
		glBindTransformFeedback,
		glDeleteTransformFeedbacks,
		glGenTransformFeedbacks,
		glIsTransformFeedback,
		glDrawTransformFeedback,
		glDrawTransformFeedbackStream,
		glBeginQueryIndexed,
		glEndQueryIndexed,
		glGetQueryIndexediv;

	@JavadocExclude
	public GL40(FunctionProvider provider) {
		glBlendEquationi = provider.getFunctionAddress("glBlendEquationi");
		glBlendEquationSeparatei = provider.getFunctionAddress("glBlendEquationSeparatei");
		glBlendFunci = provider.getFunctionAddress("glBlendFunci");
		glBlendFuncSeparatei = provider.getFunctionAddress("glBlendFuncSeparatei");
		glDrawArraysIndirect = provider.getFunctionAddress("glDrawArraysIndirect");
		glDrawElementsIndirect = provider.getFunctionAddress("glDrawElementsIndirect");
		glUniform1d = provider.getFunctionAddress("glUniform1d");
		glUniform2d = provider.getFunctionAddress("glUniform2d");
		glUniform3d = provider.getFunctionAddress("glUniform3d");
		glUniform4d = provider.getFunctionAddress("glUniform4d");
		glUniform1dv = provider.getFunctionAddress("glUniform1dv");
		glUniform2dv = provider.getFunctionAddress("glUniform2dv");
		glUniform3dv = provider.getFunctionAddress("glUniform3dv");
		glUniform4dv = provider.getFunctionAddress("glUniform4dv");
		glUniformMatrix2dv = provider.getFunctionAddress("glUniformMatrix2dv");
		glUniformMatrix3dv = provider.getFunctionAddress("glUniformMatrix3dv");
		glUniformMatrix4dv = provider.getFunctionAddress("glUniformMatrix4dv");
		glUniformMatrix2x3dv = provider.getFunctionAddress("glUniformMatrix2x3dv");
		glUniformMatrix2x4dv = provider.getFunctionAddress("glUniformMatrix2x4dv");
		glUniformMatrix3x2dv = provider.getFunctionAddress("glUniformMatrix3x2dv");
		glUniformMatrix3x4dv = provider.getFunctionAddress("glUniformMatrix3x4dv");
		glUniformMatrix4x2dv = provider.getFunctionAddress("glUniformMatrix4x2dv");
		glUniformMatrix4x3dv = provider.getFunctionAddress("glUniformMatrix4x3dv");
		glGetUniformdv = provider.getFunctionAddress("glGetUniformdv");
		glMinSampleShading = provider.getFunctionAddress("glMinSampleShading");
		glGetSubroutineUniformLocation = provider.getFunctionAddress("glGetSubroutineUniformLocation");
		glGetSubroutineIndex = provider.getFunctionAddress("glGetSubroutineIndex");
		glGetActiveSubroutineUniformiv = provider.getFunctionAddress("glGetActiveSubroutineUniformiv");
		glGetActiveSubroutineUniformName = provider.getFunctionAddress("glGetActiveSubroutineUniformName");
		glGetActiveSubroutineName = provider.getFunctionAddress("glGetActiveSubroutineName");
		glUniformSubroutinesuiv = provider.getFunctionAddress("glUniformSubroutinesuiv");
		glGetUniformSubroutineuiv = provider.getFunctionAddress("glGetUniformSubroutineuiv");
		glGetProgramStageiv = provider.getFunctionAddress("glGetProgramStageiv");
		glPatchParameteri = provider.getFunctionAddress("glPatchParameteri");
		glPatchParameterfv = provider.getFunctionAddress("glPatchParameterfv");
		glBindTransformFeedback = provider.getFunctionAddress("glBindTransformFeedback");
		glDeleteTransformFeedbacks = provider.getFunctionAddress("glDeleteTransformFeedbacks");
		glGenTransformFeedbacks = provider.getFunctionAddress("glGenTransformFeedbacks");
		glIsTransformFeedback = provider.getFunctionAddress("glIsTransformFeedback");
		glDrawTransformFeedback = provider.getFunctionAddress("glDrawTransformFeedback");
		glDrawTransformFeedbackStream = provider.getFunctionAddress("glDrawTransformFeedbackStream");
		glBeginQueryIndexed = provider.getFunctionAddress("glBeginQueryIndexed");
		glEndQueryIndexed = provider.getFunctionAddress("glEndQueryIndexed");
		glGetQueryIndexediv = provider.getFunctionAddress("glGetQueryIndexediv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL40} instance for the current context. */
	public static GL40 getInstance() {
		return GL.getCapabilities().__GL40;
	}

	static GL40 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL40") ) return null;

		GL40 funcs = new GL40(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glBlendEquationi) &&
			GL.isFunctionSupported(funcs.glBlendEquationSeparatei) &&
			GL.isFunctionSupported(funcs.glBlendFunci) &&
			GL.isFunctionSupported(funcs.glBlendFuncSeparatei) &&
			GL.isFunctionSupported(funcs.glDrawArraysIndirect) &&
			GL.isFunctionSupported(funcs.glDrawElementsIndirect) &&
			GL.isFunctionSupported(funcs.glUniform1d) &&
			GL.isFunctionSupported(funcs.glUniform2d) &&
			GL.isFunctionSupported(funcs.glUniform3d) &&
			GL.isFunctionSupported(funcs.glUniform4d) &&
			GL.isFunctionSupported(funcs.glUniform1dv) &&
			GL.isFunctionSupported(funcs.glUniform2dv) &&
			GL.isFunctionSupported(funcs.glUniform3dv) &&
			GL.isFunctionSupported(funcs.glUniform4dv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix2dv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix3dv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix4dv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix2x3dv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix2x4dv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix3x2dv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix3x4dv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix4x2dv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix4x3dv) &&
			GL.isFunctionSupported(funcs.glGetUniformdv) &&
			GL.isFunctionSupported(funcs.glMinSampleShading) &&
			GL.isFunctionSupported(funcs.glGetSubroutineUniformLocation) &&
			GL.isFunctionSupported(funcs.glGetSubroutineIndex) &&
			GL.isFunctionSupported(funcs.glGetActiveSubroutineUniformiv) &&
			GL.isFunctionSupported(funcs.glGetActiveSubroutineUniformName) &&
			GL.isFunctionSupported(funcs.glGetActiveSubroutineName) &&
			GL.isFunctionSupported(funcs.glUniformSubroutinesuiv) &&
			GL.isFunctionSupported(funcs.glGetUniformSubroutineuiv) &&
			GL.isFunctionSupported(funcs.glGetProgramStageiv) &&
			GL.isFunctionSupported(funcs.glPatchParameteri) &&
			GL.isFunctionSupported(funcs.glPatchParameterfv) &&
			GL.isFunctionSupported(funcs.glBindTransformFeedback) &&
			GL.isFunctionSupported(funcs.glDeleteTransformFeedbacks) &&
			GL.isFunctionSupported(funcs.glGenTransformFeedbacks) &&
			GL.isFunctionSupported(funcs.glIsTransformFeedback) &&
			GL.isFunctionSupported(funcs.glDrawTransformFeedback) &&
			GL.isFunctionSupported(funcs.glDrawTransformFeedbackStream) &&
			GL.isFunctionSupported(funcs.glBeginQueryIndexed) &&
			GL.isFunctionSupported(funcs.glEndQueryIndexed) &&
			GL.isFunctionSupported(funcs.glGetQueryIndexediv);

		return GL.checkExtension("OpenGL40", funcs, supported);
	}

	// --- [ glBlendEquationi ] ---

	/** JNI method for {@link #glBlendEquationi glBlendEquationi} */
	@JavadocExclude
	public static native void nglBlendEquationi(int buf, int mode, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBlendEquation.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the equation used for both the RGB blend equation and the Alpha blend equation for the given draw buffer.
	 *
	 * @param buf  the index of the draw buffer for which to set the blend equation
	 * @param mode how source and destination colors are combined. One of:<p/>{@link GL14#GL_FUNC_ADD FUNC_ADD}, {@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}, {@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link GL14#GL_MIN MIN}, {@link GL14#GL_MAX MAX}
	 */
	public static void glBlendEquationi(int buf, int mode) {
		long __functionAddress = getInstance().glBlendEquationi;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBlendEquationi(buf, mode, __functionAddress);
	}

	// --- [ glBlendEquationSeparatei ] ---

	/** JNI method for {@link #glBlendEquationSeparatei glBlendEquationSeparatei} */
	@JavadocExclude
	public static native void nglBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBlendEquationSeparate.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the RGB blend equation and the alpha blend equation separately for the given draw buffer.
	 *
	 * @param buf       the index of the draw buffer for which to set the blend equations
	 * @param modeRGB   the RGB blend equation, how the red, green, and blue components of the source and destination colors are combined. One of:<p/>{@link GL14#GL_FUNC_ADD FUNC_ADD}, {@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}, {@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link GL14#GL_MIN MIN}, {@link GL14#GL_MAX MAX}
	 * @param modeAlpha the alpha blend equation, how the alpha component of the source and destination colors are combined. One of:<p/>{@link GL14#GL_FUNC_ADD FUNC_ADD}, {@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}, {@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link GL14#GL_MIN MIN}, {@link GL14#GL_MAX MAX}
	 */
	public static void glBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
		long __functionAddress = getInstance().glBlendEquationSeparatei;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBlendEquationSeparatei(buf, modeRGB, modeAlpha, __functionAddress);
	}

	// --- [ glBlendFunci ] ---

	/** JNI method for {@link #glBlendFunci glBlendFunci} */
	@JavadocExclude
	public static native void nglBlendFunci(int buf, int sfactor, int dfactor, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBlendFunci.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies pixel arithmetic for the given draw buffer.
	 *
	 * @param buf     the index of the draw buffer for which to set the blend function
	 * @param sfactor how the red, green, blue, and alpha source blending factors are computed
	 * @param dfactor how the red, green, blue, and alpha destination blending factors are computed
	 */
	public static void glBlendFunci(int buf, int sfactor, int dfactor) {
		long __functionAddress = getInstance().glBlendFunci;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBlendFunci(buf, sfactor, dfactor, __functionAddress);
	}

	// --- [ glBlendFuncSeparatei ] ---

	/** JNI method for {@link #glBlendFuncSeparatei glBlendFuncSeparatei} */
	@JavadocExclude
	public static native void nglBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBlendFuncSeparatei.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifiues pixel arithmetic for RGB and alpha components separately for the given draw buffer.
	 *
	 * @param buf      the index of the draw buffer for which to set the blend functions
	 * @param srcRGB   how the red, green, and blue blending factors are computed
	 * @param dstRGB   how the red, green, and blue destination blending factors are computed
	 * @param srcAlpha how the alpha source blending factor is computed
	 * @param dstAlpha how the alpha destination blending factor is computed
	 */
	public static void glBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
		long __functionAddress = getInstance().glBlendFuncSeparatei;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha, __functionAddress);
	}

	// --- [ glDrawArraysIndirect ] ---

	/** JNI method for {@link #glDrawArraysIndirect glDrawArraysIndirect} */
	@JavadocExclude
	public static native void nglDrawArraysIndirect(int mode, long indirect, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawArraysIndirect.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Renders primitives from array data, taking parameters from memory.
	 * <p/>
	 * {@code glDrawArraysIndirect} behaves similarly to {@link GL42#glDrawArraysInstancedBaseInstance DrawArraysInstancedBaseInstance}, except that the parameters to
	 * glDrawArraysInstancedBaseInstance are stored in memory at the address given by {@code indirect}.
	 * <p/>
	 * The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):
	 * <pre>{@code
	 * typedef struct {
	 * 	uint count;
	 * 	uint primCount;
	 * 	uint first;
	 * 	uint baseInstance; // must be 0 unless OpenGL 4.2 is supported
	 * } DrawArraysIndirectCommand;
	 * 	
	 * const DrawArraysIndirectCommand *cmd = (const DrawArraysIndirectCommand *)indirect;
	 * glDrawArraysInstancedBaseInstance(mode, cmd->first, cmd->count, cmd->primCount, cmd->baseInstance);}</pre>
	 *
	 * @param mode     what kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param indirect a structure containing the draw parameters
	 */
	public static void glDrawArraysIndirect(int mode, ByteBuffer indirect) {
		long __functionAddress = getInstance().glDrawArraysIndirect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indirect, 4 * 4);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglDrawArraysIndirect(mode, memAddress(indirect), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glDrawArraysIndirect glDrawArraysIndirect} */
	public static void glDrawArraysIndirect(int mode, long indirectOffset) {
		long __functionAddress = getInstance().glDrawArraysIndirect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, true);
		}
		nglDrawArraysIndirect(mode, indirectOffset, __functionAddress);
	}

	/** IntBuffer version of: {@link #glDrawArraysIndirect glDrawArraysIndirect} */
	public static void glDrawArraysIndirect(int mode, IntBuffer indirect) {
		long __functionAddress = getInstance().glDrawArraysIndirect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indirect, (4 * 4) >> 2);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglDrawArraysIndirect(mode, memAddress(indirect), __functionAddress);
	}

	// --- [ glDrawElementsIndirect ] ---

	/** JNI method for {@link #glDrawElementsIndirect glDrawElementsIndirect} */
	@JavadocExclude
	public static native void nglDrawElementsIndirect(int mode, int type, long indirect, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawElementsIndirect.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Renders indexed primitives from array data, taking parameters from memory.
	 * <p/>
	 * {@code glDrawElementsIndirect} behaves similarly to {@link GL42#glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance}, execpt that the parameters to
	 * glDrawElementsInstancedBaseVertexBaseInstance are stored in memory at the address given by {@code indirect}.
	 * <p/>
	 * The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):
	 * <pre>{@code
	 * typedef struct {
	 * 	uint count;
	 * 	uint primCount;
	 * 	uint firstIndex;
	 * 	uint baseVertex;
	 * 	uint baseInstance;
	 * } DrawElementsIndirectCommand;}</pre>
	 * <p/>
	 * {@code glDrawElementsIndirect} is equivalent to:
	 * <pre>{@code
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
	 * }}</pre>
	 *
	 * @param mode     what kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param type     the type of data in the buffer bound to the {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER} binding. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indirect the address of a structure containing the draw parameters
	 */
	public static void glDrawElementsIndirect(int mode, int type, ByteBuffer indirect) {
		long __functionAddress = getInstance().glDrawElementsIndirect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indirect, 5 * 4);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglDrawElementsIndirect(mode, type, memAddress(indirect), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glDrawElementsIndirect glDrawElementsIndirect} */
	public static void glDrawElementsIndirect(int mode, int type, long indirectOffset) {
		long __functionAddress = getInstance().glDrawElementsIndirect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, true);
		}
		nglDrawElementsIndirect(mode, type, indirectOffset, __functionAddress);
	}

	/** IntBuffer version of: {@link #glDrawElementsIndirect glDrawElementsIndirect} */
	public static void glDrawElementsIndirect(int mode, int type, IntBuffer indirect) {
		long __functionAddress = getInstance().glDrawElementsIndirect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indirect, (5 * 4) >> 2);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglDrawElementsIndirect(mode, type, memAddress(indirect), __functionAddress);
	}

	// --- [ glUniform1d ] ---

	/** JNI method for {@link #glUniform1d glUniform1d} */
	@JavadocExclude
	public static native void nglUniform1d(int location, double x, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform1d.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a double uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glUniform1d(int location, double x) {
		long __functionAddress = getInstance().glUniform1d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform1d(location, x, __functionAddress);
	}

	// --- [ glUniform2d ] ---

	/** JNI method for {@link #glUniform2d glUniform2d} */
	@JavadocExclude
	public static native void nglUniform2d(int location, double x, double y, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform2d.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a dvec2 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glUniform2d(int location, double x, double y) {
		long __functionAddress = getInstance().glUniform2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform2d(location, x, y, __functionAddress);
	}

	// --- [ glUniform3d ] ---

	/** JNI method for {@link #glUniform3d glUniform3d} */
	@JavadocExclude
	public static native void nglUniform3d(int location, double x, double y, double z, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform3d.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a dvec3 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glUniform3d(int location, double x, double y, double z) {
		long __functionAddress = getInstance().glUniform3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform3d(location, x, y, z, __functionAddress);
	}

	// --- [ glUniform4d ] ---

	/** JNI method for {@link #glUniform4d glUniform4d} */
	@JavadocExclude
	public static native void nglUniform4d(int location, double x, double y, double z, double w, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform4d.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a dvec4 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 * @param w        the uniform w value
	 */
	public static void glUniform4d(int location, double x, double y, double z, double w) {
		long __functionAddress = getInstance().glUniform4d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform4d(location, x, y, z, w, __functionAddress);
	}

	// --- [ glUniform1dv ] ---

	/** JNI method for {@link #glUniform1d(int, int, ByteBuffer) glUniform1d} */
	@JavadocExclude
	public static native void nglUniform1dv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform1.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single double uniform variable or a double uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform1d(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform1dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, count << 3);
		}
		nglUniform1dv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform1d(int, int, ByteBuffer) glUniform1d} */
	public static void glUniform1(int location, DoubleBuffer value) {
		long __functionAddress = getInstance().glUniform1dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform1dv(location, value.remaining(), memAddress(value), __functionAddress);
	}

	// --- [ glUniform2dv ] ---

	/** JNI method for {@link #glUniform2d(int, int, ByteBuffer) glUniform2d} */
	@JavadocExclude
	public static native void nglUniform2dv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform2d(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 1) << 3);
		}
		nglUniform2dv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform2d(int, int, ByteBuffer) glUniform2d} */
	public static void glUniform2(int location, DoubleBuffer value) {
		long __functionAddress = getInstance().glUniform2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform2dv(location, value.remaining() >> 1, memAddress(value), __functionAddress);
	}

	// --- [ glUniform3dv ] ---

	/** JNI method for {@link #glUniform3d(int, int, ByteBuffer) glUniform3d} */
	@JavadocExclude
	public static native void nglUniform3dv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform3d(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 3) << 3);
		}
		nglUniform3dv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform3d(int, int, ByteBuffer) glUniform3d} */
	public static void glUniform3(int location, DoubleBuffer value) {
		long __functionAddress = getInstance().glUniform3dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform3dv(location, value.remaining() / 3, memAddress(value), __functionAddress);
	}

	// --- [ glUniform4dv ] ---

	/** JNI method for {@link #glUniform4d(int, int, ByteBuffer) glUniform4d} */
	@JavadocExclude
	public static native void nglUniform4dv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dvec4 uniform variable or a dvec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform4d(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 2) << 3);
		}
		nglUniform4dv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform4d(int, int, ByteBuffer) glUniform4d} */
	public static void glUniform4(int location, DoubleBuffer value) {
		long __functionAddress = getInstance().glUniform4dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform4dv(location, value.remaining() >> 2, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix2dv ] ---

	/** JNI method for {@link #glUniformMatrix2d(int, int, boolean, ByteBuffer) glUniformMatrix2d} */
	@JavadocExclude
	public static native void nglUniformMatrix2dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat2 uniform variable or a dmat2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix2d(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 2) << 3);
		}
		nglUniformMatrix2dv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix2d(int, int, boolean, ByteBuffer) glUniformMatrix2d} */
	public static void glUniformMatrix2(int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix2dv(location, value.remaining() >> 2, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix3dv ] ---

	/** JNI method for {@link #glUniformMatrix3d(int, int, boolean, ByteBuffer) glUniformMatrix3d} */
	@JavadocExclude
	public static native void nglUniformMatrix3dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat3 uniform variable or a dmat3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix3d(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 9) << 3);
		}
		nglUniformMatrix3dv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix3d(int, int, boolean, ByteBuffer) glUniformMatrix3d} */
	public static void glUniformMatrix3(int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix3dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix3dv(location, value.remaining() / 9, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix4dv ] ---

	/** JNI method for {@link #glUniformMatrix4d(int, int, boolean, ByteBuffer) glUniformMatrix4d} */
	@JavadocExclude
	public static native void nglUniformMatrix4dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat4 uniform variable or a dmat4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix4d(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 4) << 3);
		}
		nglUniformMatrix4dv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix4d(int, int, boolean, ByteBuffer) glUniformMatrix4d} */
	public static void glUniformMatrix4(int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix4dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix4dv(location, value.remaining() >> 4, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix2x3dv ] ---

	/** JNI method for {@link #glUniformMatrix2x3d(int, int, boolean, ByteBuffer) glUniformMatrix2x3d} */
	@JavadocExclude
	public static native void nglUniformMatrix2x3dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix2x3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat2x3 uniform variable or a dmat2x3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix2x3d(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix2x3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 6) << 3);
		}
		nglUniformMatrix2x3dv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix2x3d(int, int, boolean, ByteBuffer) glUniformMatrix2x3d} */
	public static void glUniformMatrix2x3(int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix2x3dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix2x3dv(location, value.remaining() / 6, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix2x4dv ] ---

	/** JNI method for {@link #glUniformMatrix2x4d(int, int, boolean, ByteBuffer) glUniformMatrix2x4d} */
	@JavadocExclude
	public static native void nglUniformMatrix2x4dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix2x4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat2x4 uniform variable or a dmat2x4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix2x4d(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix2x4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 3) << 3);
		}
		nglUniformMatrix2x4dv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix2x4d(int, int, boolean, ByteBuffer) glUniformMatrix2x4d} */
	public static void glUniformMatrix2x4(int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix2x4dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix2x4dv(location, value.remaining() >> 3, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix3x2dv ] ---

	/** JNI method for {@link #glUniformMatrix3x2d(int, int, boolean, ByteBuffer) glUniformMatrix3x2d} */
	@JavadocExclude
	public static native void nglUniformMatrix3x2dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix3x2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat3x2 uniform variable or a dmat3x2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix3x2d(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix3x2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 6) << 3);
		}
		nglUniformMatrix3x2dv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix3x2d(int, int, boolean, ByteBuffer) glUniformMatrix3x2d} */
	public static void glUniformMatrix3x2(int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix3x2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix3x2dv(location, value.remaining() / 6, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix3x4dv ] ---

	/** JNI method for {@link #glUniformMatrix3x4d(int, int, boolean, ByteBuffer) glUniformMatrix3x4d} */
	@JavadocExclude
	public static native void nglUniformMatrix3x4dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix3x4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat3x4 uniform variable or a dmat3x4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix3x4d(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix3x4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 12) << 3);
		}
		nglUniformMatrix3x4dv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix3x4d(int, int, boolean, ByteBuffer) glUniformMatrix3x4d} */
	public static void glUniformMatrix3x4(int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix3x4dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix3x4dv(location, value.remaining() / 12, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix4x2dv ] ---

	/** JNI method for {@link #glUniformMatrix4x2d(int, int, boolean, ByteBuffer) glUniformMatrix4x2d} */
	@JavadocExclude
	public static native void nglUniformMatrix4x2dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix4x2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix4x2d(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix4x2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 3) << 3);
		}
		nglUniformMatrix4x2dv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix4x2d(int, int, boolean, ByteBuffer) glUniformMatrix4x2d} */
	public static void glUniformMatrix4x2(int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix4x2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix4x2dv(location, value.remaining() >> 3, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix4x3dv ] ---

	/** JNI method for {@link #glUniformMatrix4x3d(int, int, boolean, ByteBuffer) glUniformMatrix4x3d} */
	@JavadocExclude
	public static native void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix4x3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix4x3d(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix4x3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 12) << 3);
		}
		nglUniformMatrix4x3dv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix4x3d(int, int, boolean, ByteBuffer) glUniformMatrix4x3d} */
	public static void glUniformMatrix4x3(int location, boolean transpose, DoubleBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix4x3dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix4x3dv(location, value.remaining() / 12, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glGetUniformdv ] ---

	/** JNI method for {@link #glGetUniformd(int, int, ByteBuffer) glGetUniformd} */
	@JavadocExclude
	public static native void nglGetUniformdv(int program, int location, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the double value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetUniformd(int program, int location, ByteBuffer params) {
		long __functionAddress = getInstance().glGetUniformdv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 3);
		}
		nglGetUniformdv(program, location, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetUniformd(int, int, ByteBuffer) glGetUniformd} */
	public static void glGetUniform(int program, int location, DoubleBuffer params) {
		long __functionAddress = getInstance().glGetUniformdv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetUniformdv(program, location, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetUniformd(int, int, ByteBuffer) glGetUniformd} */
	public static double glGetUniformd(int program, int location) {
		long __functionAddress = getInstance().glGetUniformdv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.doubleParam();
		nglGetUniformdv(program, location, __buffer.address() + params, __functionAddress);
		return __buffer.doubleValue(params);
	}

	// --- [ glMinSampleShading ] ---

	/** JNI method for {@link #glMinSampleShading glMinSampleShading} */
	@JavadocExclude
	public static native void nglMinSampleShading(float value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glMinSampleShading.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the minimum rate at which sample shading takes place.
	 *
	 * @param value the rate at which samples are shaded within each covered pixel
	 */
	public static void glMinSampleShading(float value) {
		long __functionAddress = getInstance().glMinSampleShading;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMinSampleShading(value, __functionAddress);
	}

	// --- [ glGetSubroutineUniformLocation ] ---

	/** JNI method for {@link #glGetSubroutineUniformLocation glGetSubroutineUniformLocation} */
	@JavadocExclude
	public static native int nglGetSubroutineUniformLocation(int program, int shadertype, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetSubroutineUniformLocation.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves the location of a subroutine uniform of a given shader stage within a program.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<p/>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param name       the name of the subroutine uniform whose index to query.
	 */
	public static int glGetSubroutineUniformLocation(int program, int shadertype, ByteBuffer name) {
		long __functionAddress = getInstance().glGetSubroutineUniformLocation;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(name);
		}
		return nglGetSubroutineUniformLocation(program, shadertype, memAddress(name), __functionAddress);
	}

	/** CharSequence version of: {@link #glGetSubroutineUniformLocation glGetSubroutineUniformLocation} */
	public static int glGetSubroutineUniformLocation(int program, int shadertype, CharSequence name) {
		long __functionAddress = getInstance().glGetSubroutineUniformLocation;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGetSubroutineUniformLocation(program, shadertype, memAddress(memEncodeASCII(name)), __functionAddress);
	}

	// --- [ glGetSubroutineIndex ] ---

	/** JNI method for {@link #glGetSubroutineIndex glGetSubroutineIndex} */
	@JavadocExclude
	public static native int nglGetSubroutineIndex(int program, int shadertype, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetSubroutineIndex.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves the index of a subroutine function of a given shader stage within a program.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for subroutine function index. One of:<p/>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param name       the name of the subroutine function whose index to query
	 */
	public static int glGetSubroutineIndex(int program, int shadertype, ByteBuffer name) {
		long __functionAddress = getInstance().glGetSubroutineIndex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(name);
		}
		return nglGetSubroutineIndex(program, shadertype, memAddress(name), __functionAddress);
	}

	/** CharSequence version of: {@link #glGetSubroutineIndex glGetSubroutineIndex} */
	public static int glGetSubroutineIndex(int program, int shadertype, CharSequence name) {
		long __functionAddress = getInstance().glGetSubroutineIndex;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGetSubroutineIndex(program, shadertype, memAddress(memEncodeASCII(name)), __functionAddress);
	}

	// --- [ glGetActiveSubroutineUniformiv ] ---

	/** JNI method for {@link #glGetActiveSubroutineUniformi(int, int, int, int, ByteBuffer) glGetActiveSubroutineUniformi} */
	@JavadocExclude
	public static native void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetActiveSubroutineUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries a property of an active shader subroutine uniform.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<p/>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param index      the index of the shader subroutine uniform
	 * @param pname      the parameter of the shader subroutine uniform to query. One of:<p/>{@link #GL_NUM_COMPATIBLE_SUBROUTINES NUM_COMPATIBLE_SUBROUTINES}, {@link #GL_COMPATIBLE_SUBROUTINES COMPATIBLE_SUBROUTINES}, {@link GL31#GL_UNIFORM_SIZE UNIFORM_SIZE}, {@link GL31#GL_UNIFORM_NAME_LENGTH UNIFORM_NAME_LENGTH}
	 * @param values     the address of a buffer into which the queried value or values will be placed
	 */
	public static void glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname, ByteBuffer values) {
		long __functionAddress = getInstance().glGetActiveSubroutineUniformiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #glGetActiveSubroutineUniformi(int, int, int, int, ByteBuffer) glGetActiveSubroutineUniformi} */
	public static void glGetActiveSubroutineUniform(int program, int shadertype, int index, int pname, IntBuffer values) {
		long __functionAddress = getInstance().glGetActiveSubroutineUniformiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, memAddress(values), __functionAddress);
	}

	/** Single return value version of: {@link #glGetActiveSubroutineUniformi(int, int, int, int, ByteBuffer) glGetActiveSubroutineUniformi} */
	public static int glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname) {
		long __functionAddress = getInstance().glGetActiveSubroutineUniformiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int values = __buffer.intParam();
		nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, __buffer.address() + values, __functionAddress);
		return __buffer.intValue(values);
	}

	// --- [ glGetActiveSubroutineUniformName ] ---

	/** JNI method for {@link #glGetActiveSubroutineUniformName glGetActiveSubroutineUniformName} */
	@JavadocExclude
	public static native void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetActiveSubroutineUniformName.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries the name of an active shader subroutine uniform.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<p/>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param index      the index of the shader subroutine uniform
	 * @param bufsize    the size of the buffer whose address is given in {@code name}
	 * @param length     the address of a variable into which is written the number of characters copied into {@code name}
	 * @param name       the address of a buffer that will receive the name of the specified shader subroutine uniform
	 */
	public static void glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, ByteBuffer length, ByteBuffer name) {
		long __functionAddress = getInstance().glGetActiveSubroutineUniformName;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(name, bufsize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, memAddressSafe(length), memAddress(name), __functionAddress);
	}

	/** Alternative version of: {@link #glGetActiveSubroutineUniformName glGetActiveSubroutineUniformName} */
	public static void glGetActiveSubroutineUniformName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
		long __functionAddress = getInstance().glGetActiveSubroutineUniformName;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		nglGetActiveSubroutineUniformName(program, shadertype, index, name.remaining(), memAddressSafe(length), memAddress(name), __functionAddress);
	}

	/** String return version of: {@link #glGetActiveSubroutineUniformName glGetActiveSubroutineUniformName} */
	public static String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize) {
		long __functionAddress = getInstance().glGetActiveSubroutineUniformName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufsize);
		nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, __buffer.address() + length, __buffer.address() + name, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + name, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveSubroutineUniformName glGetActiveSubroutineUniformName} */
	public static String glGetActiveSubroutineUniformName(int program, int shadertype, int index) {
		long __functionAddress = getInstance().glGetActiveSubroutineUniformName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		int bufsize = glGetActiveSubroutineUniformi(program, shadertype, index, GL31.GL_UNIFORM_NAME_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufsize);
		nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, __buffer.address() + length, __buffer.address() + name, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + name, __buffer.intValue(length)));
	}

	// --- [ glGetActiveSubroutineName ] ---

	/** JNI method for {@link #glGetActiveSubroutineName glGetActiveSubroutineName} */
	@JavadocExclude
	public static native void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetActiveSubroutineName.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries the name of an active shader subroutine.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query the subroutine name. One of:<p/>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param index      the index of the shader subroutine uniform
	 * @param bufsize    the size of the buffer whose address is given in {@code name}
	 * @param length     a variable which is to receive the length of the shader subroutine uniform name
	 * @param name       an array into which the name of the shader subroutine uniform will be written
	 */
	public static void glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, ByteBuffer length, ByteBuffer name) {
		long __functionAddress = getInstance().glGetActiveSubroutineName;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(name, bufsize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetActiveSubroutineName(program, shadertype, index, bufsize, memAddressSafe(length), memAddress(name), __functionAddress);
	}

	/** Alternative version of: {@link #glGetActiveSubroutineName glGetActiveSubroutineName} */
	public static void glGetActiveSubroutineName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
		long __functionAddress = getInstance().glGetActiveSubroutineName;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		nglGetActiveSubroutineName(program, shadertype, index, name.remaining(), memAddressSafe(length), memAddress(name), __functionAddress);
	}

	/** String return version of: {@link #glGetActiveSubroutineName glGetActiveSubroutineName} */
	public static String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize) {
		long __functionAddress = getInstance().glGetActiveSubroutineName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufsize);
		nglGetActiveSubroutineName(program, shadertype, index, bufsize, __buffer.address() + length, __buffer.address() + name, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + name, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveSubroutineName glGetActiveSubroutineName} */
	public static String glGetActiveSubroutineName(int program, int shadertype, int index) {
		long __functionAddress = getInstance().glGetActiveSubroutineName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		int bufsize = glGetProgramStagei(program, shadertype, GL_ACTIVE_SUBROUTINE_MAX_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufsize);
		nglGetActiveSubroutineName(program, shadertype, index, bufsize, __buffer.address() + length, __buffer.address() + name, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + name, __buffer.intValue(length)));
	}

	// --- [ glUniformSubroutinesuiv ] ---

	/** JNI method for {@link #glUniformSubroutinesui(int, int, ByteBuffer) glUniformSubroutinesui} */
	@JavadocExclude
	public static native void nglUniformSubroutinesuiv(int shadertype, int count, long indices, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformSubroutines.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Loads active subroutine uniforms.
	 *
	 * @param shadertype the shader stage to update. One of:<p/>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param count      the number of uniform indices stored in {@code indices}
	 * @param indices    an array holding the indices to load into the shader subroutine variables
	 */
	public static void glUniformSubroutinesui(int shadertype, int count, ByteBuffer indices) {
		long __functionAddress = getInstance().glUniformSubroutinesuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, count << 2);
		}
		nglUniformSubroutinesuiv(shadertype, count, memAddress(indices), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformSubroutinesui(int, int, ByteBuffer) glUniformSubroutinesui} */
	public static void glUniformSubroutinesu(int shadertype, IntBuffer indices) {
		long __functionAddress = getInstance().glUniformSubroutinesuiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformSubroutinesuiv(shadertype, indices.remaining(), memAddress(indices), __functionAddress);
	}

	/** Single value version of: {@link #glUniformSubroutinesui(int, int, ByteBuffer) glUniformSubroutinesui} */
	public static void glUniformSubroutinesui(int shadertype, int index) {
		long __functionAddress = getInstance().glUniformSubroutinesuiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int indices = __buffer.intParam(index);
		nglUniformSubroutinesuiv(shadertype, 1, __buffer.address() + indices, __functionAddress);
	}

	// --- [ glGetUniformSubroutineuiv ] ---

	/** JNI method for {@link #glGetUniformSubroutineui(int, int, ByteBuffer) glGetUniformSubroutineui} */
	@JavadocExclude
	public static native void nglGetUniformSubroutineuiv(int shadertype, int location, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetUniformSubroutine.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves the value of a subroutine uniform of a given shader stage of the current program.
	 *
	 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<p/>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param location   the location of the subroutine uniform
	 * @param params     a variable to receive the value or values of the subroutine uniform
	 */
	public static void glGetUniformSubroutineui(int shadertype, int location, ByteBuffer params) {
		long __functionAddress = getInstance().glGetUniformSubroutineuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetUniformSubroutineuiv(shadertype, location, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetUniformSubroutineui(int, int, ByteBuffer) glGetUniformSubroutineui} */
	public static void glGetUniformSubroutineu(int shadertype, int location, IntBuffer params) {
		long __functionAddress = getInstance().glGetUniformSubroutineuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetUniformSubroutineuiv(shadertype, location, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetUniformSubroutineui(int, int, ByteBuffer) glGetUniformSubroutineui} */
	public static int glGetUniformSubroutineui(int shadertype, int location) {
		long __functionAddress = getInstance().glGetUniformSubroutineuiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetUniformSubroutineuiv(shadertype, location, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetProgramStageiv ] ---

	/** JNI method for {@link #glGetProgramStagei(int, int, int, ByteBuffer) glGetProgramStagei} */
	@JavadocExclude
	public static native void nglGetProgramStageiv(int program, int shadertype, int pname, long values, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetProgramStage.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves properties of a program object corresponding to a specified shader stage.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<p/>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param pname      the parameter of the shader to query. One of:<p/>{@link #GL_ACTIVE_SUBROUTINES ACTIVE_SUBROUTINES}, {@link #GL_ACTIVE_SUBROUTINE_UNIFORMS ACTIVE_SUBROUTINE_UNIFORMS}, {@link #GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS}, {@link #GL_ACTIVE_SUBROUTINE_MAX_LENGTH ACTIVE_SUBROUTINE_MAX_LENGTH}, {@link #GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH}
	 * @param values     a variable into which the queried value or values will be placed
	 */
	public static void glGetProgramStagei(int program, int shadertype, int pname, ByteBuffer values) {
		long __functionAddress = getInstance().glGetProgramStageiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nglGetProgramStageiv(program, shadertype, pname, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #glGetProgramStagei(int, int, int, ByteBuffer) glGetProgramStagei} */
	public static void glGetProgramStage(int program, int shadertype, int pname, IntBuffer values) {
		long __functionAddress = getInstance().glGetProgramStageiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nglGetProgramStageiv(program, shadertype, pname, memAddress(values), __functionAddress);
	}

	/** Single return value version of: {@link #glGetProgramStagei(int, int, int, ByteBuffer) glGetProgramStagei} */
	public static int glGetProgramStagei(int program, int shadertype, int pname) {
		long __functionAddress = getInstance().glGetProgramStageiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int values = __buffer.intParam();
		nglGetProgramStageiv(program, shadertype, pname, __buffer.address() + values, __functionAddress);
		return __buffer.intValue(values);
	}

	// --- [ glPatchParameteri ] ---

	/** JNI method for {@link #glPatchParameteri glPatchParameteri} */
	@JavadocExclude
	public static native void nglPatchParameteri(int pname, int value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glPatchParameteri.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the integer value of the given parameter for patch primitives.
	 *
	 * @param pname the name of the parameter to set. Must be:<p/>{@link #GL_PATCH_VERTICES PATCH_VERTICES}
	 * @param value the new value for the parameter given by {@code pname}
	 */
	public static void glPatchParameteri(int pname, int value) {
		long __functionAddress = getInstance().glPatchParameteri;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPatchParameteri(pname, value, __functionAddress);
	}

	// --- [ glPatchParameterfv ] ---

	/** JNI method for {@link #glPatchParameterf(int, ByteBuffer) glPatchParameterf} */
	@JavadocExclude
	public static native void nglPatchParameterfv(int pname, long values, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glPatchParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies an array of float values for the given parameter for patch primitives.
	 *
	 * @param pname  the name of the parameter to set. One of:<p/>{@link #GL_PATCH_DEFAULT_OUTER_LEVEL PATCH_DEFAULT_OUTER_LEVEL}, {@link #GL_PATCH_DEFAULT_INNER_LEVEL PATCH_DEFAULT_INNER_LEVEL}
	 * @param values an array containing the new values for the parameter given by {@code pname}
	 */
	public static void glPatchParameterf(int pname, ByteBuffer values) {
		long __functionAddress = getInstance().glPatchParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(values, GL11.glGetInteger(GL_PATCH_VERTICES) << 2);
		}
		nglPatchParameterfv(pname, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #glPatchParameterf(int, ByteBuffer) glPatchParameterf} */
	public static void glPatchParameter(int pname, FloatBuffer values) {
		long __functionAddress = getInstance().glPatchParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(values, GL11.glGetInteger(GL_PATCH_VERTICES));
		}
		nglPatchParameterfv(pname, memAddress(values), __functionAddress);
	}

	// --- [ glBindTransformFeedback ] ---

	/** JNI method for {@link #glBindTransformFeedback glBindTransformFeedback} */
	@JavadocExclude
	public static native void nglBindTransformFeedback(int target, int id, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindTransformFeedback.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds a transform feedback object.
	 *
	 * @param target the target to which to bind the transform feedback object {@code id}. Must be:<p/>{@link #GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}
	 * @param id     the name of a transform feedback object
	 */
	public static void glBindTransformFeedback(int target, int id) {
		long __functionAddress = getInstance().glBindTransformFeedback;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindTransformFeedback(target, id, __functionAddress);
	}

	// --- [ glDeleteTransformFeedbacks ] ---

	/** JNI method for {@link #glDeleteTransformFeedbacks glDeleteTransformFeedbacks} */
	@JavadocExclude
	public static native void nglDeleteTransformFeedbacks(int n, long ids, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDeleteTransformFeedbacks.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Deletes transform feedback objects.
	 *
	 * @param n   the number of transform feedback objects to delete
	 * @param ids an array of names of transform feedback objects to delete
	 */
	public static void glDeleteTransformFeedbacks(int n, ByteBuffer ids) {
		long __functionAddress = getInstance().glDeleteTransformFeedbacks;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(ids, n << 2);
		}
		nglDeleteTransformFeedbacks(n, memAddress(ids), __functionAddress);
	}

	/** Alternative version of: {@link #glDeleteTransformFeedbacks glDeleteTransformFeedbacks} */
	public static void glDeleteTransformFeedbacks(IntBuffer ids) {
		long __functionAddress = getInstance().glDeleteTransformFeedbacks;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDeleteTransformFeedbacks(ids.remaining(), memAddress(ids), __functionAddress);
	}

	/** Single value version of: {@link #glDeleteTransformFeedbacks glDeleteTransformFeedbacks} */
	public static void glDeleteTransformFeedbacks(int id) {
		long __functionAddress = getInstance().glDeleteTransformFeedbacks;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam(id);
		nglDeleteTransformFeedbacks(1, __buffer.address() + ids, __functionAddress);
	}

	// --- [ glGenTransformFeedbacks ] ---

	/** JNI method for {@link #glGenTransformFeedbacks glGenTransformFeedbacks} */
	@JavadocExclude
	public static native void nglGenTransformFeedbacks(int n, long ids, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGenTransformFeedbacks.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Reserves transform feedback object names.
	 *
	 * @param n   the number of transform feedback object names to reserve
	 * @param ids an array of into which the reserved names will be written
	 */
	public static void glGenTransformFeedbacks(int n, ByteBuffer ids) {
		long __functionAddress = getInstance().glGenTransformFeedbacks;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(ids, n << 2);
		}
		nglGenTransformFeedbacks(n, memAddress(ids), __functionAddress);
	}

	/** Alternative version of: {@link #glGenTransformFeedbacks glGenTransformFeedbacks} */
	public static void glGenTransformFeedbacks(IntBuffer ids) {
		long __functionAddress = getInstance().glGenTransformFeedbacks;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGenTransformFeedbacks(ids.remaining(), memAddress(ids), __functionAddress);
	}

	/** Single return value version of: {@link #glGenTransformFeedbacks glGenTransformFeedbacks} */
	public static int glGenTransformFeedbacks() {
		long __functionAddress = getInstance().glGenTransformFeedbacks;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam();
		nglGenTransformFeedbacks(1, __buffer.address() + ids, __functionAddress);
		return __buffer.intValue(ids);
	}

	// --- [ glIsTransformFeedback ] ---

	/** JNI method for {@link #glIsTransformFeedback glIsTransformFeedback} */
	@JavadocExclude
	public static native boolean nglIsTransformFeedback(int id, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glIsTransformFeedback.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Determines if a name corresponds to a transform feedback object.
	 *
	 * @param id a value that may be the name of a transform feedback object
	 */
	public static boolean glIsTransformFeedback(int id) {
		long __functionAddress = getInstance().glIsTransformFeedback;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsTransformFeedback(id, __functionAddress);
	}

	// --- [ glDrawTransformFeedback ] ---

	/** JNI method for {@link #glDrawTransformFeedback glDrawTransformFeedback} */
	@JavadocExclude
	public static native void nglDrawTransformFeedback(int mode, int id, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawTransformFeedback.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Render primitives using a count derived from a transform feedback object.
	 *
	 * @param mode what kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param id   the name of a transform feedback object from which to retrieve a primitive count
	 */
	public static void glDrawTransformFeedback(int mode, int id) {
		long __functionAddress = getInstance().glDrawTransformFeedback;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDrawTransformFeedback(mode, id, __functionAddress);
	}

	// --- [ glDrawTransformFeedbackStream ] ---

	/** JNI method for {@link #glDrawTransformFeedbackStream glDrawTransformFeedbackStream} */
	@JavadocExclude
	public static native void nglDrawTransformFeedbackStream(int mode, int id, int stream, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawTransformFeedbackStream.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Renders primitives using a count derived from a specifed stream of a transform feedback object.
	 *
	 * @param mode   what kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param id     the name of a transform feedback object from which to retrieve a primitive count
	 * @param stream the index of the transform feedback stream from which to retrieve a primitive count
	 */
	public static void glDrawTransformFeedbackStream(int mode, int id, int stream) {
		long __functionAddress = getInstance().glDrawTransformFeedbackStream;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDrawTransformFeedbackStream(mode, id, stream, __functionAddress);
	}

	// --- [ glBeginQueryIndexed ] ---

	/** JNI method for {@link #glBeginQueryIndexed glBeginQueryIndexed} */
	@JavadocExclude
	public static native void nglBeginQueryIndexed(int target, int index, int id, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBeginQueryIndexed.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Begins a query object on an indexed target
	 *
	 * @param target the target type of query object established between {@code glBeginQueryIndexed} and the subsequent {@link #glEndQueryIndexed EndQueryIndexed}. One of:<p/>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param index  the index of the query target upon which to begin the query
	 * @param id     the name of a query object
	 */
	public static void glBeginQueryIndexed(int target, int index, int id) {
		long __functionAddress = getInstance().glBeginQueryIndexed;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBeginQueryIndexed(target, index, id, __functionAddress);
	}

	// --- [ glEndQueryIndexed ] ---

	/** JNI method for {@link #glEndQueryIndexed glEndQueryIndexed} */
	@JavadocExclude
	public static native void nglEndQueryIndexed(int target, int index, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBeginQueryIndexed.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Ends a query object on an indexed target
	 *
	 * @param target the target type of query object to be concluded. One of:<p/>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param index  the index of the query target upon which to end the query
	 */
	public static void glEndQueryIndexed(int target, int index) {
		long __functionAddress = getInstance().glEndQueryIndexed;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEndQueryIndexed(target, index, __functionAddress);
	}

	// --- [ glGetQueryIndexediv ] ---

	/** JNI method for {@link #glGetQueryIndexedi(int, int, int, ByteBuffer) glGetQueryIndexedi} */
	@JavadocExclude
	public static native void nglGetQueryIndexediv(int target, int index, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetQueryIndexed.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns parameters of an indexed query object target.
	 *
	 * @param target a query object target. One of:<p/>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param index  the index of the query object target
	 * @param pname  the symbolic name of a query object target parameter
	 * @param params the requested data
	 */
	public static void glGetQueryIndexedi(int target, int index, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetQueryIndexediv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetQueryIndexediv(target, index, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetQueryIndexedi(int, int, int, ByteBuffer) glGetQueryIndexedi} */
	public static void glGetQueryIndexed(int target, int index, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetQueryIndexediv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetQueryIndexediv(target, index, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetQueryIndexedi(int, int, int, ByteBuffer) glGetQueryIndexedi} */
	public static int glGetQueryIndexedi(int target, int index, int pname) {
		long __functionAddress = getInstance().glGetQueryIndexediv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryIndexediv(target, index, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

}