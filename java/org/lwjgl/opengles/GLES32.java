/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
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

/** The core OpenGL ES 3.2 functionality. */
public class GLES32 {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetFloatv, GetIntegerv, and GetInteger64v. */
	public static final int
		GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB       = 0x9381,
		GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB = 0x9382;

	/** Accepted by the {@code mode} parameter of BlendEquation and BlendEquationi. */
	public static final int
		GL_MULTIPLY       = 0x9294,
		GL_SCREEN         = 0x9295,
		GL_OVERLAY        = 0x9296,
		GL_DARKEN         = 0x9297,
		GL_LIGHTEN        = 0x9298,
		GL_COLORDODGE     = 0x9299,
		GL_COLORBURN      = 0x929A,
		GL_HARDLIGHT      = 0x929B,
		GL_SOFTLIGHT      = 0x929C,
		GL_DIFFERENCE     = 0x929E,
		GL_EXCLUSION      = 0x92A0,
		GL_HSL_HUE        = 0x92AD,
		GL_HSL_SATURATION = 0x92AE,
		GL_HSL_COLOR      = 0x92AF,
		GL_HSL_LUMINOSITY = 0x92B0;

	/** Tokens accepted by the {@code target} parameters of Enable, Disable, and  IsEnabled. */
	public static final int
		GL_DEBUG_OUTPUT             = 0x92E0,
		GL_DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;

	/** Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS. */
	public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 0x2;

	/** Tokens accepted by the {@code value} parameters of GetBooleanv, GetIntegerv,  GetFloatv, GetDoublev and GetInteger64v. */
	public static final int
		GL_MAX_DEBUG_MESSAGE_LENGTH         = 0x9143,
		GL_MAX_DEBUG_LOGGED_MESSAGES        = 0x9144,
		GL_DEBUG_LOGGED_MESSAGES            = 0x9145,
		GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243,
		GL_MAX_DEBUG_GROUP_STACK_DEPTH      = 0x826C,
		GL_DEBUG_GROUP_STACK_DEPTH          = 0x826D,
		GL_MAX_LABEL_LENGTH                 = 0x82E8;

	/** Tokens accepted by the {@code pname} parameter of GetPointerv. */
	public static final int
		GL_DEBUG_CALLBACK_FUNCTION   = 0x8244,
		GL_DEBUG_CALLBACK_USER_PARAM = 0x8245;

	/**
	 * Tokens accepted or provided by the {@code source} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code sources} parameter
	 * of GetDebugMessageLog.
	 */
	public static final int
		GL_DEBUG_SOURCE_API             = 0x8246,
		GL_DEBUG_SOURCE_WINDOW_SYSTEM   = 0x8247,
		GL_DEBUG_SOURCE_SHADER_COMPILER = 0x8248,
		GL_DEBUG_SOURCE_THIRD_PARTY     = 0x8249,
		GL_DEBUG_SOURCE_APPLICATION     = 0x824A,
		GL_DEBUG_SOURCE_OTHER           = 0x824B;

	/**
	 * Tokens accepted or provided by the {@code type} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code types} parameter of
	 * GetDebugMessageLog.
	 */
	public static final int
		GL_DEBUG_TYPE_ERROR               = 0x824C,
		GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D,
		GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR  = 0x824E,
		GL_DEBUG_TYPE_PORTABILITY         = 0x824F,
		GL_DEBUG_TYPE_PERFORMANCE         = 0x8250,
		GL_DEBUG_TYPE_OTHER               = 0x8251,
		GL_DEBUG_TYPE_MARKER              = 0x8268;

	/** Tokens accepted or provided by the {@code type} parameters of DebugMessageControl and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog. */
	public static final int
		GL_DEBUG_TYPE_PUSH_GROUP = 0x8269,
		GL_DEBUG_TYPE_POP_GROUP  = 0x826A;

	/**
	 * Tokens accepted or provided by the {@code severity} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC callback functions, and the
	 * {@code severities} parameter of GetDebugMessageLog.
	 */
	public static final int
		GL_DEBUG_SEVERITY_HIGH         = 0x9146,
		GL_DEBUG_SEVERITY_MEDIUM       = 0x9147,
		GL_DEBUG_SEVERITY_LOW          = 0x9148,
		GL_DEBUG_SEVERITY_NOTIFICATION = 0x826B;

	/** Returned by GetError. */
	public static final int
		GL_STACK_UNDERFLOW = 0x504,
		GL_STACK_OVERFLOW  = 0x503;

	/** Tokens accepted or provided by the {@code identifier} parameters of ObjectLabel and GetObjectLabel. */
	public static final int
		GL_BUFFER           = 0x82E0,
		GL_SHADER           = 0x82E1,
		GL_PROGRAM          = 0x82E2,
		GL_QUERY            = 0x82E3,
		GL_PROGRAM_PIPELINE = 0x82E4,
		GL_SAMPLER          = 0x82E6;

	/**
	 * Accepted by the {@code type} parameter of CreateShader and CreateShaderProgramv, by the {@code pname} parameter of GetProgramPipelineiv and returned in
	 * the {@code params} parameter of GetShaderiv when {@code pname} is SHADER_TYPE.
	 */
	public static final int GL_GEOMETRY_SHADER = 0x8DD9;

	/** Accepted by the {@code stages} parameter of UseProgramStages. */
	public static final int GL_GEOMETRY_SHADER_BIT = 0x4;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int
		GL_GEOMETRY_LINKED_VERTICES_OUT = 0x8916,
		GL_GEOMETRY_LINKED_INPUT_TYPE   = 0x8917,
		GL_GEOMETRY_LINKED_OUTPUT_TYPE  = 0x8918,
		GL_GEOMETRY_SHADER_INVOCATIONS  = 0x887F;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v. */
	public static final int
		GL_LAYER_PROVOKING_VERTEX                   = 0x825E,
		GL_MAX_GEOMETRY_UNIFORM_COMPONENTS          = 0x8DDF,
		GL_MAX_GEOMETRY_UNIFORM_BLOCKS              = 0x8A2C,
		GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32,
		GL_MAX_GEOMETRY_INPUT_COMPONENTS            = 0x9123,
		GL_MAX_GEOMETRY_OUTPUT_COMPONENTS           = 0x9124,
		GL_MAX_GEOMETRY_OUTPUT_VERTICES             = 0x8DE0,
		GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS     = 0x8DE1,
		GL_MAX_GEOMETRY_SHADER_INVOCATIONS          = 0x8E5A,
		GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS         = 0x8C29,
		GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS      = 0x92CF,
		GL_MAX_GEOMETRY_ATOMIC_COUNTERS             = 0x92D5,
		GL_MAX_GEOMETRY_IMAGE_UNIFORMS              = 0x90CD,
		GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS       = 0x90D7;

	/** Returned in the {@code data} parameter from a Get query with a {@code pname} of LAYER_PROVOKING_VERTEX. */
	public static final int
		GL_FIRST_VERTEX_CONVENTION = 0x8E4D,
		GL_LAST_VERTEX_CONVENTION  = 0x8E4E,
		GL_UNDEFINED_VERTEX        = 0x8260;

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, GetQueryiv, and GetQueryObjectuiv. */
	public static final int GL_PRIMITIVES_GENERATED = 0x8C87;

	/** Accepted by the {@code mode} parameter of DrawArrays, DrawElements, and other commands which draw primitives. */
	public static final int
		GL_LINES_ADJACENCY          = 0xA,
		GL_LINE_STRIP_ADJACENCY     = 0xB,
		GL_TRIANGLES_ADJACENCY      = 0xC,
		GL_TRIANGLE_STRIP_ADJACENCY = 0xD;

	/** Accepted by the {@code pname} parameter of FramebufferParameteri, and GetFramebufferParameteriv. */
	public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS = 0x9312;

	/** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, and GetFloatv. */
	public static final int GL_MAX_FRAMEBUFFER_LAYERS = 0x9317;

	/** Returned by CheckFramebufferStatus. */
	public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;

	/** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
	public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;

	/** Accepted by the {@code props} parameter of GetProgramResourceiv. */
	public static final int GL_REFERENCED_BY_GEOMETRY_SHADER = 0x9309;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetFloatv, GetIntegerv, and GetInteger64v. */
	public static final int GL_PRIMITIVE_BOUNDING_BOX_ARB = 0x92BE;

	/** Returned by {@link #glGetGraphicsResetStatus GetGraphicsResetStatus}. */
	public static final int
		GL_NO_ERROR               = 0x0,
		GL_GUILTY_CONTEXT_RESET   = 0x8253,
		GL_INNOCENT_CONTEXT_RESET = 0x8254,
		GL_UNKNOWN_CONTEXT_RESET  = 0x8255;

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int
		GL_CONTEXT_ROBUST_ACCESS       = 0x90F3,
		GL_RESET_NOTIFICATION_STRATEGY = 0x8256;

	/** Returned by GetIntegerv and related simple queries when {@code value} is {@link #GL_RESET_NOTIFICATION_STRATEGY RESET_NOTIFICATION_STRATEGY}. */
	public static final int
		GL_LOSE_CONTEXT_ON_RESET = 0x8252,
		GL_NO_RESET_NOTIFICATION = 0x8261;

	/** Returned by {@link GLES20#glGetError GetError}. */
	public static final int GL_CONTEXT_LOST = 0x507;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetInteger64v.
	 */
	public static final int GL_SAMPLE_SHADING = 0x8C36;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, and GetFloatv. */
	public static final int GL_MIN_SAMPLE_SHADING_VALUE = 0x8C37;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v. */
	public static final int
		GL_MIN_FRAGMENT_INTERPOLATION_OFFSET  = 0x8E5B,
		GL_MAX_FRAGMENT_INTERPOLATION_OFFSET  = 0x8E5C,
		GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 0x8E5D;

	/** Accepted by the {@code mode} parameter of DrawArrays, DrawElements, and other commands which draw primitives. */
	public static final int GL_PATCHES = 0xE;

	/** Accepted by the {@code pname} parameter of PatchParameteri, GetBooleanv, GetFloatv, GetIntegerv, and GetInteger64v. */
	public static final int GL_PATCH_VERTICES = 0x8E72;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int
		GL_TESS_CONTROL_OUTPUT_VERTICES = 0x8E75,
		GL_TESS_GEN_MODE                = 0x8E76,
		GL_TESS_GEN_SPACING             = 0x8E77,
		GL_TESS_GEN_VERTEX_ORDER        = 0x8E78,
		GL_TESS_GEN_POINT_MODE          = 0x8E79;

	/** Returned by GetProgramiv when {@code pname} is TESS_GEN_MODE. */
	public static final int
		GL_ISOLINES = 0x8E7A,
		GL_QUADS    = 0x7;

	/** Returned by GetProgramiv when {@code pname} is TESS_GEN_SPACING. */
	public static final int
		GL_FRACTIONAL_ODD  = 0x8E7B,
		GL_FRACTIONAL_EVEN = 0x8E7C;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetFloatv, GetIntegerv, and GetInteger64v. */
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
		GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E1F,
		GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS         = 0x92CD,
		GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS      = 0x92CE,
		GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS                = 0x92D3,
		GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS             = 0x92D4,
		GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS                 = 0x90CB,
		GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS              = 0x90CC,
		GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS          = 0x90D8,
		GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS       = 0x90D9,
		GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED         = 0x8221;

	/** Accepted by the {@code props} parameter of GetProgramResourceiv. */
	public static final int
		GL_IS_PER_PATCH                         = 0x92E7,
		GL_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x9307,
		GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308;

	/**
	 * Accepted by the {@code type} parameter of CreateShader, by the {@code pname} parameter of GetProgramPipelineiv, and returned by the {@code params}
	 * parameter of GetShaderiv.
	 */
	public static final int
		GL_TESS_EVALUATION_SHADER = 0x8E87,
		GL_TESS_CONTROL_SHADER    = 0x8E88;

	/** Accepted by the {@code stages} parameter of UseProgramStages. */
	public static final int
		GL_TESS_CONTROL_SHADER_BIT    = 0x8,
		GL_TESS_EVALUATION_SHADER_BIT = 0x10;

	/**
	 * Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, SamplerParameteriv, SamplerParameterfv, TexParameterIiv,
	 * TexParameterIuiv, SamplerParameterIiv, SamplerParameterIuiv, GetTexParameteriv, GetTexParameterfv, GetTexParameterIiv,
	 * GetTexParameterIuiv, GetSamplerParameteriv, GetSamplerParameterfv, GetSamplerParameterIiv, and GetSamplerParameterIuiv.
	 */
	public static final int GL_TEXTURE_BORDER_COLOR = 0x1004;

	/**
	 * Accepted by the {@code param} parameter of TexParameteri, TexParameterf, SamplerParameteri and SamplerParameterf, and by the {@code params} parameter of
	 * TexParameteriv, TexParameterfv, TexParameterIiv, TexParameterIuiv, SamplerParameterIiv, SamplerParameterIuiv and returned by the
	 * {@code params} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIiv, GetTexParameterIuiv, GetSamplerParameteriv,
	 * GetSamplerParameterfv, GetSamplerParameterIiv, and GetSamplerParameterIuiv when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T,
	 * or TEXTURE_WRAP_R.
	 */
	public static final int GL_CLAMP_TO_BORDER = 0x812D;

	/**
	 * Accepted by the {@code target} parameter of BindBuffer, BufferData, BufferSubData, MapBufferRange, BindTexture, UnmapBuffer, GetBufferParameteriv,
	 * GetBufferPointerv, TexBuffer, and TexBufferRange.
	 */
	public static final int GL_TEXTURE_BUFFER = 0x8C2A;

	/** Accepted by the {@code pname} parameters of GetBooleanv, GetFloatv, and GetIntegerv. */
	public static final int GL_TEXTURE_BUFFER_BINDING = 0x8C2A;

	/**
	 * (note that this token name is an alias for TEXTURE_BUFFER, and is used for naming consistency with queries for the buffers bound to other buffer
	 * binding points). MAX_TEXTURE_BUFFER_SIZE 0x8C2B TEXTURE_BINDING_BUFFER 0x8C2C TEXTURE_BUFFER_OFFSET_ALIGNMENT 0x919F Returned in the
	 * {@code type} parameter of GetActiveUniform, the {@code params} parameter of GetActiveUniformsiv, and the {@code params} parameter of
	 * GetProgramResourceiv when the TYPE property is queried on the UNIFORM interface.
	 */
	public static final int
		GL_SAMPLER_BUFFER              = 0x8DC2,
		GL_INT_SAMPLER_BUFFER          = 0x8DD0,
		GL_UNSIGNED_INT_SAMPLER_BUFFER = 0x8DD8,
		GL_IMAGE_BUFFER                = 0x9051,
		GL_INT_IMAGE_BUFFER            = 0x905C,
		GL_UNSIGNED_INT_IMAGE_BUFFER   = 0x9067;

	/** Accepted by the {@code pname} parameter of GetTexLevelParameter. */
	public static final int
		GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D,
		GL_TEXTURE_BUFFER_OFFSET             = 0x919D,
		GL_TEXTURE_BUFFER_SIZE               = 0x919E;

	/**
	 * Accepted by the {@code internalformat} parameter of CompressedTexImage2D, CompressedTexSubImage2D, TexStorage2D, TextureStorage2D, TexStorage3D, and
	 * TextureStorage3D.
	 */
	public static final int
		GL_COMPRESSED_RGBA_ASTC_4x4           = 0x93B0,
		GL_COMPRESSED_RGBA_ASTC_5x4           = 0x93B1,
		GL_COMPRESSED_RGBA_ASTC_5x5           = 0x93B2,
		GL_COMPRESSED_RGBA_ASTC_6x5           = 0x93B3,
		GL_COMPRESSED_RGBA_ASTC_6x6           = 0x93B4,
		GL_COMPRESSED_RGBA_ASTC_8x5           = 0x93B5,
		GL_COMPRESSED_RGBA_ASTC_8x6           = 0x93B6,
		GL_COMPRESSED_RGBA_ASTC_8x8           = 0x93B7,
		GL_COMPRESSED_RGBA_ASTC_10x5          = 0x93B8,
		GL_COMPRESSED_RGBA_ASTC_10x6          = 0x93B9,
		GL_COMPRESSED_RGBA_ASTC_10x8          = 0x93BA,
		GL_COMPRESSED_RGBA_ASTC_10x10         = 0x93BB,
		GL_COMPRESSED_RGBA_ASTC_12x10         = 0x93BC,
		GL_COMPRESSED_RGBA_ASTC_12x12         = 0x93BD,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4   = 0x93D0,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4   = 0x93D1,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5   = 0x93D2,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5   = 0x93D3,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6   = 0x93D4,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5   = 0x93D5,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6   = 0x93D6,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8   = 0x93D7,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5  = 0x93D8,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6  = 0x93D9,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8  = 0x93DA,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10 = 0x93DB,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10 = 0x93DC,
		GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12 = 0x93DD;

	/**
	 * Accepted by the {@code target} parameter of TexParameter{if}, TexParameter{if}v, TexParameterI{i ui}v, BindTexture, GenerateMipmap, TexImage3D,
	 * TexSubImage3D, TexStorage3D, GetTexParameter{if}v, GetTexParameter{i ui}v, GetTexLevelParameter{if}v, CompressedTexImage3D, CompressedTexSubImage3D
	 * and CopyTexSubImage3D.
	 */
	public static final int GL_TEXTURE_CUBE_MAP_ARRAY = 0x9009;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv and GetFloatv. */
	public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;

	/** Returned by the {@code type} parameter of GetActiveUniform, and by the {@code params} parameter of GetProgramResourceiv when {@code props} is TYPE. */
	public static final int
		GL_SAMPLER_CUBE_MAP_ARRAY              = 0x900C,
		GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW       = 0x900D,
		GL_INT_SAMPLER_CUBE_MAP_ARRAY          = 0x900E,
		GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900F,
		GL_IMAGE_CUBE_MAP_ARRAY                = 0x9054,
		GL_INT_IMAGE_CUBE_MAP_ARRAY            = 0x905F,
		GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY   = 0x906A;

	/**
	 * Accepted by the {@code target} parameter of BindTexture, TexStorage3DMultisample, GetInternalformativ, TexParameter{if}*, GetTexParameter{if}v and
	 * GetTexLevelParameter{if}v. Also, the texture object indicated by the {@code texture} argument to FramebufferTextureLayer can be
	 * TEXTURE_2D_MULTISAMPLE_ARRAY.
	 */
	public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int
		GL_SAMPLER_2D_MULTISAMPLE_ARRAY              = 0x910B,
		GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY          = 0x910C,
		GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;

	protected GLES32() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glBlendBarrier, caps.glCopyImageSubData, caps.glDebugMessageControl, caps.glDebugMessageInsert, caps.glDebugMessageCallback, 
			caps.glGetDebugMessageLog, caps.glGetPointerv, caps.glPushDebugGroup, caps.glPopDebugGroup, caps.glObjectLabel, caps.glGetObjectLabel, 
			caps.glObjectPtrLabel, caps.glGetObjectPtrLabel, caps.glEnablei, caps.glDisablei, caps.glBlendEquationi, caps.glBlendEquationSeparatei, 
			caps.glBlendFunci, caps.glBlendFuncSeparatei, caps.glColorMaski, caps.glIsEnabledi, caps.glDrawElementsBaseVertex, 
			caps.glDrawRangeElementsBaseVertex, caps.glDrawElementsInstancedBaseVertex, caps.glFramebufferTexture, caps.glPrimitiveBoundingBox, 
			caps.glGetGraphicsResetStatus, caps.glReadnPixels, caps.glGetnUniformfv, caps.glGetnUniformiv, caps.glGetnUniformuiv, caps.glMinSampleShading, 
			caps.glPatchParameteri, caps.glTexParameterIiv, caps.glTexParameterIuiv, caps.glGetTexParameterIiv, caps.glGetTexParameterIuiv, 
			caps.glSamplerParameterIiv, caps.glSamplerParameterIuiv, caps.glGetSamplerParameterIiv, caps.glGetSamplerParameterIuiv, caps.glTexBuffer, 
			caps.glTexBufferRange, caps.glTexStorage3DMultisample
		);
	}

	// --- [ glBlendBarrier ] ---

	/**
	 * Specifies a boundary between passes when using advanced blend equations.
	 * 
	 * <p>When using advanced blending equations, applications should split their rendering into a collection of blending passes, none of which touch an
	 * individual sample in the framebuffer more than once. The results of blending are undefined if the sample being blended has been touched previously in
	 * the same pass. Any command that causes the value of a sample to be modified using the framebuffer is considered to touch the sample, including clears,
	 * blended or unblended primitives, and {@link GLES30#glBlitFramebuffer BlitFramebuffer} copies.</p>
	 */
	public static void glBlendBarrier() {
		long __functionAddress = GLES.getCapabilities().glBlendBarrier;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

	// --- [ glCopyImageSubData ] ---

	public static void glCopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
		long __functionAddress = GLES.getCapabilities().glCopyImageSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
	}

	// --- [ glDebugMessageControl ] ---

	/**
	 * Controls the volume of debug output in the active debug group, by disabling specific or groups of messages.
	 * 
	 * <p>If {@code enabled} is {@link GLES20#GL_TRUE TRUE}, the referenced subset of messages will be enabled. If {@link GLES20#GL_FALSE FALSE}, then those messages will be disabled.</p>
	 * 
	 * <p>This command can reference different subsets of messages by first considering the set of all messages, and filtering out messages based on the following
	 * ways:</p>
	 * 
	 * <ul>
	 * <li>If {@code source}, {@code type}, or {@code severity} is {@link GLES20#GL_DONT_CARE DONT_CARE}, the messages from all sources, of all types, or of all severities are
	 * referenced respectively.</li>
	 * <li>When values other than {@link GLES20#GL_DONT_CARE DONT_CARE} are specified, all messages whose source, type, or severity match the specified {@code source}, {@code type},
	 * or {@code severity} respectively will be referenced.</li>
	 * <li>If {@code count} is greater than zero, then {@code ids} is an array of {@code count} message IDs for the specified combination of {@code source} and
	 * {@code type}. In this case, if {@code source} or {@code type} is {@link GLES20#GL_DONT_CARE DONT_CARE}, or {@code severity} is not {@link GLES20#GL_DONT_CARE DONT_CARE}, the error
	 * {@link GLES20#GL_INVALID_OPERATION INVALID_OPERATION} is generated.</li>
	 * </ul>
	 * 
	 * <p>Unrecognized message IDs in {@code ids} are ignored. If {@code count} is zero, the value if {@code ids} is ignored.</p>
	 * 
	 * <p>Although messages are grouped into an implicit hierarchy by their sources and types, there is no explicit per-source, per-type or per-severity enabled
	 * state. Instead, the enabled state is stored individually for each message. There is no difference between disabling all messages from one source in a
	 * single call, and individually disabling all messages from that source using their types and IDs.</p>
	 * 
	 * <p>If the {@link #GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled the GL operates the same as if messages of every {@code source}, {@code type} or {@code severity} are
	 * disabled.</p>
	 *
	 * @param source   the source of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}</td><td>{@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}</td><td>{@link #GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}</td></tr><tr><td>{@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td><td>{@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link #GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}</td></tr></table>
	 * @param type     the type of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}</td><td>{@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}</td><td>{@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}</td><td>{@link #GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}</td><td>{@link #GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}</td></tr></table>
	 * @param severity the severity of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}</td><td>{@link #GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}</td><td>{@link #GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}</td></tr><tr><td>{@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}</td></tr></table>
	 * @param count    the length of the array {@code ids}
	 * @param ids      an array of unsigned integers containing the ids of the messages to enable or disable
	 * @param enabled  whether the selected messages should be enabled or disabled
	 */
	public static void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled) {
		long __functionAddress = GLES.getCapabilities().glDebugMessageControl;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, source, type, severity, count, ids, enabled);
	}

	/**
	 * Controls the volume of debug output in the active debug group, by disabling specific or groups of messages.
	 * 
	 * <p>If {@code enabled} is {@link GLES20#GL_TRUE TRUE}, the referenced subset of messages will be enabled. If {@link GLES20#GL_FALSE FALSE}, then those messages will be disabled.</p>
	 * 
	 * <p>This command can reference different subsets of messages by first considering the set of all messages, and filtering out messages based on the following
	 * ways:</p>
	 * 
	 * <ul>
	 * <li>If {@code source}, {@code type}, or {@code severity} is {@link GLES20#GL_DONT_CARE DONT_CARE}, the messages from all sources, of all types, or of all severities are
	 * referenced respectively.</li>
	 * <li>When values other than {@link GLES20#GL_DONT_CARE DONT_CARE} are specified, all messages whose source, type, or severity match the specified {@code source}, {@code type},
	 * or {@code severity} respectively will be referenced.</li>
	 * <li>If {@code count} is greater than zero, then {@code ids} is an array of {@code count} message IDs for the specified combination of {@code source} and
	 * {@code type}. In this case, if {@code source} or {@code type} is {@link GLES20#GL_DONT_CARE DONT_CARE}, or {@code severity} is not {@link GLES20#GL_DONT_CARE DONT_CARE}, the error
	 * {@link GLES20#GL_INVALID_OPERATION INVALID_OPERATION} is generated.</li>
	 * </ul>
	 * 
	 * <p>Unrecognized message IDs in {@code ids} are ignored. If {@code count} is zero, the value if {@code ids} is ignored.</p>
	 * 
	 * <p>Although messages are grouped into an implicit hierarchy by their sources and types, there is no explicit per-source, per-type or per-severity enabled
	 * state. Instead, the enabled state is stored individually for each message. There is no difference between disabling all messages from one source in a
	 * single call, and individually disabling all messages from that source using their types and IDs.</p>
	 * 
	 * <p>If the {@link #GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled the GL operates the same as if messages of every {@code source}, {@code type} or {@code severity} are
	 * disabled.</p>
	 *
	 * @param source   the source of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}</td><td>{@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}</td><td>{@link #GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}</td></tr><tr><td>{@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td><td>{@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link #GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}</td></tr></table>
	 * @param type     the type of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}</td><td>{@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}</td><td>{@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}</td><td>{@link #GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}</td><td>{@link #GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}</td></tr></table>
	 * @param severity the severity of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}</td><td>{@link #GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}</td><td>{@link #GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}</td></tr><tr><td>{@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}</td></tr></table>
	 * @param ids      an array of unsigned integers containing the ids of the messages to enable or disable
	 * @param enabled  whether the selected messages should be enabled or disabled
	 */
	public static void glDebugMessageControl(int source, int type, int severity, IntBuffer ids, boolean enabled) {
		nglDebugMessageControl(source, type, severity, ids.remaining(), memAddress(ids), enabled);
	}

	/**
	 * Controls the volume of debug output in the active debug group, by disabling specific or groups of messages.
	 * 
	 * <p>If {@code enabled} is {@link GLES20#GL_TRUE TRUE}, the referenced subset of messages will be enabled. If {@link GLES20#GL_FALSE FALSE}, then those messages will be disabled.</p>
	 * 
	 * <p>This command can reference different subsets of messages by first considering the set of all messages, and filtering out messages based on the following
	 * ways:</p>
	 * 
	 * <ul>
	 * <li>If {@code source}, {@code type}, or {@code severity} is {@link GLES20#GL_DONT_CARE DONT_CARE}, the messages from all sources, of all types, or of all severities are
	 * referenced respectively.</li>
	 * <li>When values other than {@link GLES20#GL_DONT_CARE DONT_CARE} are specified, all messages whose source, type, or severity match the specified {@code source}, {@code type},
	 * or {@code severity} respectively will be referenced.</li>
	 * <li>If {@code count} is greater than zero, then {@code ids} is an array of {@code count} message IDs for the specified combination of {@code source} and
	 * {@code type}. In this case, if {@code source} or {@code type} is {@link GLES20#GL_DONT_CARE DONT_CARE}, or {@code severity} is not {@link GLES20#GL_DONT_CARE DONT_CARE}, the error
	 * {@link GLES20#GL_INVALID_OPERATION INVALID_OPERATION} is generated.</li>
	 * </ul>
	 * 
	 * <p>Unrecognized message IDs in {@code ids} are ignored. If {@code count} is zero, the value if {@code ids} is ignored.</p>
	 * 
	 * <p>Although messages are grouped into an implicit hierarchy by their sources and types, there is no explicit per-source, per-type or per-severity enabled
	 * state. Instead, the enabled state is stored individually for each message. There is no difference between disabling all messages from one source in a
	 * single call, and individually disabling all messages from that source using their types and IDs.</p>
	 * 
	 * <p>If the {@link #GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled the GL operates the same as if messages of every {@code source}, {@code type} or {@code severity} are
	 * disabled.</p>
	 *
	 * @param source   the source of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}</td><td>{@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}</td><td>{@link #GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}</td></tr><tr><td>{@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td><td>{@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link #GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}</td></tr></table>
	 * @param type     the type of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}</td><td>{@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}</td><td>{@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}</td><td>{@link #GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}</td><td>{@link #GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}</td></tr></table>
	 * @param severity the severity of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}</td><td>{@link #GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}</td><td>{@link #GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}</td></tr><tr><td>{@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}</td></tr></table>
	 * @param enabled  whether the selected messages should be enabled or disabled
	 */
	public static void glDebugMessageControl(int source, int type, int severity, int id, boolean enabled) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer ids = stack.ints(id);
			nglDebugMessageControl(source, type, severity, 1, memAddress(ids), enabled);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDebugMessageInsert ] ---

	/**
	 * This function can be called by applications and third-party libraries to generate their own messages, such as ones containing timestamp information or
	 * signals about specific render system events.
	 * 
	 * <p>The value of {@code id} specifies the ID for the message and {@code severity} indicates its severity level as defined by the caller. The string
	 * {@code buf} contains the string representation of the message. The parameter {@code length} contains the number of characters in {@code buf}. If
	 * {@code length} is negative, it is implied that {@code buf} contains a null terminated string. The error {@link GLES20#GL_INVALID_VALUE INVALID_VALUE} will be generated if the
	 * number of characters in {@code buf}, excluding the null terminator when {@code length} is negative, is not less than the value of
	 * {@link #GL_MAX_DEBUG_MESSAGE_LENGTH MAX_DEBUG_MESSAGE_LENGTH}.</p>
	 * 
	 * <p>If the {@link #GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled calls to DebugMessageInsert are discarded and do not generate an error.</p>
	 *
	 * @param source   the source of the debug message to insert. One of:<br><table><tr><td>{@link #GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}</td><td>{@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}</td><td>{@link #GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}</td></tr><tr><td>{@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td><td>{@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link #GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}</td></tr></table>
	 * @param type     the type of the debug message insert. One of:<br><table><tr><td>{@link #GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}</td><td>{@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}</td><td>{@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}</td><td>{@link #GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}</td><td>{@link #GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}</td></tr></table>
	 * @param id       the user-supplied identifier of the message to insert. One of:<br><table><tr><td>{@link #GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}</td><td>{@link #GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}</td><td>{@link #GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}</td></tr><tr><td>{@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}</td></tr></table>
	 * @param severity the severity of the debug messages to insert
	 * @param length   the length of the string contained in the character array whose address is given by {@code message}
	 * @param message  a character array containing the message to insert
	 */
	public static void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message) {
		long __functionAddress = GLES.getCapabilities().glDebugMessageInsert;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, source, type, id, severity, length, message);
	}

	/**
	 * This function can be called by applications and third-party libraries to generate their own messages, such as ones containing timestamp information or
	 * signals about specific render system events.
	 * 
	 * <p>The value of {@code id} specifies the ID for the message and {@code severity} indicates its severity level as defined by the caller. The string
	 * {@code buf} contains the string representation of the message. The parameter {@code length} contains the number of characters in {@code buf}. If
	 * {@code length} is negative, it is implied that {@code buf} contains a null terminated string. The error {@link GLES20#GL_INVALID_VALUE INVALID_VALUE} will be generated if the
	 * number of characters in {@code buf}, excluding the null terminator when {@code length} is negative, is not less than the value of
	 * {@link #GL_MAX_DEBUG_MESSAGE_LENGTH MAX_DEBUG_MESSAGE_LENGTH}.</p>
	 * 
	 * <p>If the {@link #GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled calls to DebugMessageInsert are discarded and do not generate an error.</p>
	 *
	 * @param source   the source of the debug message to insert. One of:<br><table><tr><td>{@link #GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}</td><td>{@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}</td><td>{@link #GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}</td></tr><tr><td>{@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td><td>{@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link #GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}</td></tr></table>
	 * @param type     the type of the debug message insert. One of:<br><table><tr><td>{@link #GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}</td><td>{@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}</td><td>{@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}</td><td>{@link #GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}</td><td>{@link #GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}</td></tr></table>
	 * @param id       the user-supplied identifier of the message to insert. One of:<br><table><tr><td>{@link #GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}</td><td>{@link #GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}</td><td>{@link #GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}</td></tr><tr><td>{@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}</td></tr></table>
	 * @param severity the severity of the debug messages to insert
	 * @param message  a character array containing the message to insert
	 */
	public static void glDebugMessageInsert(int source, int type, int id, int severity, ByteBuffer message) {
		nglDebugMessageInsert(source, type, id, severity, message.remaining(), memAddress(message));
	}

	/**
	 * This function can be called by applications and third-party libraries to generate their own messages, such as ones containing timestamp information or
	 * signals about specific render system events.
	 * 
	 * <p>The value of {@code id} specifies the ID for the message and {@code severity} indicates its severity level as defined by the caller. The string
	 * {@code buf} contains the string representation of the message. The parameter {@code length} contains the number of characters in {@code buf}. If
	 * {@code length} is negative, it is implied that {@code buf} contains a null terminated string. The error {@link GLES20#GL_INVALID_VALUE INVALID_VALUE} will be generated if the
	 * number of characters in {@code buf}, excluding the null terminator when {@code length} is negative, is not less than the value of
	 * {@link #GL_MAX_DEBUG_MESSAGE_LENGTH MAX_DEBUG_MESSAGE_LENGTH}.</p>
	 * 
	 * <p>If the {@link #GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled calls to DebugMessageInsert are discarded and do not generate an error.</p>
	 *
	 * @param source   the source of the debug message to insert. One of:<br><table><tr><td>{@link #GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}</td><td>{@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}</td><td>{@link #GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}</td></tr><tr><td>{@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td><td>{@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link #GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}</td></tr></table>
	 * @param type     the type of the debug message insert. One of:<br><table><tr><td>{@link #GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}</td><td>{@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}</td><td>{@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}</td><td>{@link #GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}</td><td>{@link #GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}</td></tr></table>
	 * @param id       the user-supplied identifier of the message to insert. One of:<br><table><tr><td>{@link #GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}</td><td>{@link #GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}</td><td>{@link #GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}</td></tr><tr><td>{@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}</td></tr></table>
	 * @param severity the severity of the debug messages to insert
	 * @param message  a character array containing the message to insert
	 */
	public static void glDebugMessageInsert(int source, int type, int id, int severity, CharSequence message) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer messageEncoded = stack.UTF8(message, false);
			int messageEncodedLen = messageEncoded.capacity();
			nglDebugMessageInsert(source, type, id, severity, messageEncodedLen, memAddress(messageEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDebugMessageCallback ] ---

	/**
	 * Specifies a callback to receive debugging messages from the GL.
	 * 
	 * <p>The function's prototype must follow the type definition of DEBUGPROC including its platform-dependent calling convention. Anything else will result in
	 * undefined behavior. Only one debug callback can be specified for the current context, and further calls overwrite the previous callback. Specifying
	 * {@code NULL} as the value of {@code callback} clears the current callback and disables message output through callbacks. Applications can provide
	 * user-specified data through the pointer {@code userParam}. The context will store this pointer and will include it as one of the parameters in each call
	 * to the callback function.</p>
	 * 
	 * <p>If the application has specified a callback function for receiving debug output, the implementation will call that function whenever any enabled message
	 * is generated.  The source, type, ID, and severity of the message are specified by the DEBUGPROC parameters {@code source}, {@code type}, {@code id}, and
	 * {@code severity}, respectively. The string representation of the message is stored in {@code message} and its length (excluding the null-terminator) is
	 * stored in {@code length}. The parameter {@code userParam} is the user-specified parameter that was given when calling DebugMessageCallback.</p>
	 * 
	 * <p>Applications can query the current callback function and the current user-specified parameter by obtaining the values of {@link #GL_DEBUG_CALLBACK_FUNCTION DEBUG_CALLBACK_FUNCTION}
	 * and {@link #GL_DEBUG_CALLBACK_USER_PARAM DEBUG_CALLBACK_USER_PARAM}, respectively.</p>
	 * 
	 * <p>Applications that specify a callback function must be aware of certain special conditions when executing code inside a callback when it is called by the
	 * GL, regardless of the debug source.</p>
	 * 
	 * <p>The memory for {@code message} is owned and managed by the GL, and should only be considered valid for the duration of the function call.</p>
	 * 
	 * <p>The behavior of calling any GL or window system function from within the callback function is undefined and may lead to program termination.</p>
	 * 
	 * <p>Care must also be taken in securing debug callbacks for use with asynchronous debug output by multi-threaded GL implementations.</p>
	 * 
	 * <p>If the {@link #GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled then the GL will not call the callback function.</p>
	 *
	 * @param callback  a callback function that will be called when a debug message is generated
	 * @param userParam a user supplied pointer that will be passed on each invocation of {@code callback}
	 */
	public static void nglDebugMessageCallback(long callback, long userParam) {
		long __functionAddress = GLES.getCapabilities().glDebugMessageCallback;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, callback, userParam);
	}

	/**
	 * Specifies a callback to receive debugging messages from the GL.
	 * 
	 * <p>The function's prototype must follow the type definition of DEBUGPROC including its platform-dependent calling convention. Anything else will result in
	 * undefined behavior. Only one debug callback can be specified for the current context, and further calls overwrite the previous callback. Specifying
	 * {@code NULL} as the value of {@code callback} clears the current callback and disables message output through callbacks. Applications can provide
	 * user-specified data through the pointer {@code userParam}. The context will store this pointer and will include it as one of the parameters in each call
	 * to the callback function.</p>
	 * 
	 * <p>If the application has specified a callback function for receiving debug output, the implementation will call that function whenever any enabled message
	 * is generated.  The source, type, ID, and severity of the message are specified by the DEBUGPROC parameters {@code source}, {@code type}, {@code id}, and
	 * {@code severity}, respectively. The string representation of the message is stored in {@code message} and its length (excluding the null-terminator) is
	 * stored in {@code length}. The parameter {@code userParam} is the user-specified parameter that was given when calling DebugMessageCallback.</p>
	 * 
	 * <p>Applications can query the current callback function and the current user-specified parameter by obtaining the values of {@link #GL_DEBUG_CALLBACK_FUNCTION DEBUG_CALLBACK_FUNCTION}
	 * and {@link #GL_DEBUG_CALLBACK_USER_PARAM DEBUG_CALLBACK_USER_PARAM}, respectively.</p>
	 * 
	 * <p>Applications that specify a callback function must be aware of certain special conditions when executing code inside a callback when it is called by the
	 * GL, regardless of the debug source.</p>
	 * 
	 * <p>The memory for {@code message} is owned and managed by the GL, and should only be considered valid for the duration of the function call.</p>
	 * 
	 * <p>The behavior of calling any GL or window system function from within the callback function is undefined and may lead to program termination.</p>
	 * 
	 * <p>Care must also be taken in securing debug callbacks for use with asynchronous debug output by multi-threaded GL implementations.</p>
	 * 
	 * <p>If the {@link #GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled then the GL will not call the callback function.</p>
	 *
	 * @param callback  a callback function that will be called when a debug message is generated
	 * @param userParam a user supplied pointer that will be passed on each invocation of {@code callback}
	 */
	public static void glDebugMessageCallback(GLDebugMessageCallbackI callback, long userParam) {
		nglDebugMessageCallback(callback == null ? NULL : callback.address(), userParam);
	}

	// --- [ glGetDebugMessageLog ] ---

	/**
	 * Retrieves messages from the debug message log.
	 * 
	 * <p>This function fetches a maximum of {@code count} messages from the message log, and will return the number of messages successfully fetched.</p>
	 * 
	 * <p>Messages will be fetched from the log in order of oldest to newest. Those messages that were fetched will be removed from the log.</p>
	 * 
	 * <p>The sources, types, severities, IDs, and string lengths of fetched messages will be stored in the application-provided arrays {@code sources},
	 * {@code types}, {@code severities}, {@code ids}, and {@code lengths}, respectively. The application is responsible for allocating enough space for each
	 * array to hold up to {@code count} elements. The string representations of all fetched messages are stored in the {@code messageLog} array. If multiple
	 * messages are fetched, their strings are concatenated into the same {@code messageLog} array and will be separated by single null terminators. The last
	 * string in the array will also be null-terminated. The maximum size of {@code messageLog}, including the space used by all null terminators, is given by
	 * {@code bufSize}. If {@code bufSize} is less than zero and {@code messageLog} is not {@code NULL}, an {@link GLES20#GL_INVALID_VALUE INVALID_VALUE} error will be generated. If a message's
	 * string, including its null terminator, can not fully fit within the {@code messageLog} array's remaining space, then that message and any subsequent
	 * messages will not be fetched and will remain in the log. The string lengths stored in the array {@code lengths} include the space for the null terminator of each string.</p>
	 * 
	 * <p>Any or all of the arrays {@code sources}, {@code types}, {@code ids}, {@code severities}, {@code lengths} and {@code messageLog} can also be null
	 * pointers, which causes the attributes for such arrays to be discarded when messages are fetched, however those messages will still be removed from the
	 * log. Thus to simply delete up to {@code count} messages from the message log while ignoring their attributes, the application can call the function with
	 * null pointers for all attribute arrays.</p>
	 * 
	 * <p>If the context was created without the {@link #GL_CONTEXT_FLAG_DEBUG_BIT CONTEXT_FLAG_DEBUG_BIT}, then the GL can opt to never add messages to the message log so GetDebugMessageLog will
	 * always return zero.</p>
	 *
	 * @param count      the number of debug messages to retrieve from the log
	 * @param bufsize    the size of the buffer whose address is given by {@code messageLog}
	 * @param sources    an array of variables to receive the sources of the retrieved messages
	 * @param types      an array of variables to receive the types of the retrieved messages
	 * @param ids        an array of unsigned integers to receive the ids of the retrieved messages
	 * @param severities an array of variables to receive the severites of the retrieved messages
	 * @param lengths    an array of variables to receive the lengths of the received messages
	 * @param messageLog an array of characters that will receive the messages
	 */
	public static int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog) {
		long __functionAddress = GLES.getCapabilities().glGetDebugMessageLog;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPPPPPI(__functionAddress, count, bufsize, sources, types, ids, severities, lengths, messageLog);
	}

	/**
	 * Retrieves messages from the debug message log.
	 * 
	 * <p>This function fetches a maximum of {@code count} messages from the message log, and will return the number of messages successfully fetched.</p>
	 * 
	 * <p>Messages will be fetched from the log in order of oldest to newest. Those messages that were fetched will be removed from the log.</p>
	 * 
	 * <p>The sources, types, severities, IDs, and string lengths of fetched messages will be stored in the application-provided arrays {@code sources},
	 * {@code types}, {@code severities}, {@code ids}, and {@code lengths}, respectively. The application is responsible for allocating enough space for each
	 * array to hold up to {@code count} elements. The string representations of all fetched messages are stored in the {@code messageLog} array. If multiple
	 * messages are fetched, their strings are concatenated into the same {@code messageLog} array and will be separated by single null terminators. The last
	 * string in the array will also be null-terminated. The maximum size of {@code messageLog}, including the space used by all null terminators, is given by
	 * {@code bufSize}. If {@code bufSize} is less than zero and {@code messageLog} is not {@code NULL}, an {@link GLES20#GL_INVALID_VALUE INVALID_VALUE} error will be generated. If a message's
	 * string, including its null terminator, can not fully fit within the {@code messageLog} array's remaining space, then that message and any subsequent
	 * messages will not be fetched and will remain in the log. The string lengths stored in the array {@code lengths} include the space for the null terminator of each string.</p>
	 * 
	 * <p>Any or all of the arrays {@code sources}, {@code types}, {@code ids}, {@code severities}, {@code lengths} and {@code messageLog} can also be null
	 * pointers, which causes the attributes for such arrays to be discarded when messages are fetched, however those messages will still be removed from the
	 * log. Thus to simply delete up to {@code count} messages from the message log while ignoring their attributes, the application can call the function with
	 * null pointers for all attribute arrays.</p>
	 * 
	 * <p>If the context was created without the {@link #GL_CONTEXT_FLAG_DEBUG_BIT CONTEXT_FLAG_DEBUG_BIT}, then the GL can opt to never add messages to the message log so GetDebugMessageLog will
	 * always return zero.</p>
	 *
	 * @param count      the number of debug messages to retrieve from the log
	 * @param sources    an array of variables to receive the sources of the retrieved messages
	 * @param types      an array of variables to receive the types of the retrieved messages
	 * @param ids        an array of unsigned integers to receive the ids of the retrieved messages
	 * @param severities an array of variables to receive the severites of the retrieved messages
	 * @param lengths    an array of variables to receive the lengths of the received messages
	 * @param messageLog an array of characters that will receive the messages
	 */
	public static int glGetDebugMessageLog(int count, IntBuffer sources, IntBuffer types, IntBuffer ids, IntBuffer severities, IntBuffer lengths, ByteBuffer messageLog) {
		if ( CHECKS ) {
			if ( sources != null ) checkBuffer(sources, count);
			if ( types != null ) checkBuffer(types, count);
			if ( ids != null ) checkBuffer(ids, count);
			if ( severities != null ) checkBuffer(severities, count);
			if ( lengths != null ) checkBuffer(lengths, count);
		}
		return nglGetDebugMessageLog(count, messageLog == null ? 0 : messageLog.remaining(), memAddressSafe(sources), memAddressSafe(types), memAddressSafe(ids), memAddressSafe(severities), memAddressSafe(lengths), memAddressSafe(messageLog));
	}

	// --- [ glGetPointerv ] ---

	public static void nglGetPointerv(int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetPointerv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pname, params);
	}

	public static void glGetPointerv(int pname, PointerBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetPointerv(pname, memAddress(params));
	}

	public static long glGetPointer(int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			PointerBuffer params = stack.callocPointer(1);
			nglGetPointerv(pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glPushDebugGroup ] ---

	/**
	 * Pushes a debug group described by the string {@code message} into the command stream. The value of {@code id} specifies the ID of messages generated.
	 * The parameter {@code length} contains the number of characters in {@code message}. If {@code length} is negative, it is implied that {@code message}
	 * contains a null terminated string. The message has the specified {@code source} and {@code id}, {@code type} {@link #GL_DEBUG_TYPE_PUSH_GROUP DEBUG_TYPE_PUSH_GROUP}, and
	 * {@code severity} {@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}. The GL will put a new debug group on top of the debug group stack which inherits the control of the
	 * volume of debug output of the debug group previously residing on the top of the debug group stack. Because debug groups are strictly hierarchical, any
	 * additional control of the debug output volume will only apply within the active debug group and the debug groups pushed on top of the active debug
	 * group.
	 * 
	 * <p>An {@link GLES20#GL_INVALID_ENUM INVALID_ENUM} error is generated if the value of {@code source} is neither {@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION} nor {@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}. An
	 * {@link GLES20#GL_INVALID_VALUE INVALID_VALUE} error is generated if {@code length} is negative and the number of characters in {@code message}, excluding the null-terminator,
	 * is not less than the value of {@link #GL_MAX_DEBUG_MESSAGE_LENGTH MAX_DEBUG_MESSAGE_LENGTH}.</p>
	 *
	 * @param source  the source of the debug message. One of:<br><table><tr><td>{@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td></tr></table>
	 * @param id      the identifier of the message
	 * @param length  the length of the message to be sent to the debug output stream
	 * @param message a string containing the message to be sent to the debug output stream
	 */
	public static void nglPushDebugGroup(int source, int id, int length, long message) {
		long __functionAddress = GLES.getCapabilities().glPushDebugGroup;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, source, id, length, message);
	}

	/**
	 * Pushes a debug group described by the string {@code message} into the command stream. The value of {@code id} specifies the ID of messages generated.
	 * The parameter {@code length} contains the number of characters in {@code message}. If {@code length} is negative, it is implied that {@code message}
	 * contains a null terminated string. The message has the specified {@code source} and {@code id}, {@code type} {@link #GL_DEBUG_TYPE_PUSH_GROUP DEBUG_TYPE_PUSH_GROUP}, and
	 * {@code severity} {@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}. The GL will put a new debug group on top of the debug group stack which inherits the control of the
	 * volume of debug output of the debug group previously residing on the top of the debug group stack. Because debug groups are strictly hierarchical, any
	 * additional control of the debug output volume will only apply within the active debug group and the debug groups pushed on top of the active debug
	 * group.
	 * 
	 * <p>An {@link GLES20#GL_INVALID_ENUM INVALID_ENUM} error is generated if the value of {@code source} is neither {@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION} nor {@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}. An
	 * {@link GLES20#GL_INVALID_VALUE INVALID_VALUE} error is generated if {@code length} is negative and the number of characters in {@code message}, excluding the null-terminator,
	 * is not less than the value of {@link #GL_MAX_DEBUG_MESSAGE_LENGTH MAX_DEBUG_MESSAGE_LENGTH}.</p>
	 *
	 * @param source  the source of the debug message. One of:<br><table><tr><td>{@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td></tr></table>
	 * @param id      the identifier of the message
	 * @param message a string containing the message to be sent to the debug output stream
	 */
	public static void glPushDebugGroup(int source, int id, ByteBuffer message) {
		nglPushDebugGroup(source, id, message.remaining(), memAddress(message));
	}

	/**
	 * Pushes a debug group described by the string {@code message} into the command stream. The value of {@code id} specifies the ID of messages generated.
	 * The parameter {@code length} contains the number of characters in {@code message}. If {@code length} is negative, it is implied that {@code message}
	 * contains a null terminated string. The message has the specified {@code source} and {@code id}, {@code type} {@link #GL_DEBUG_TYPE_PUSH_GROUP DEBUG_TYPE_PUSH_GROUP}, and
	 * {@code severity} {@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}. The GL will put a new debug group on top of the debug group stack which inherits the control of the
	 * volume of debug output of the debug group previously residing on the top of the debug group stack. Because debug groups are strictly hierarchical, any
	 * additional control of the debug output volume will only apply within the active debug group and the debug groups pushed on top of the active debug
	 * group.
	 * 
	 * <p>An {@link GLES20#GL_INVALID_ENUM INVALID_ENUM} error is generated if the value of {@code source} is neither {@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION} nor {@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}. An
	 * {@link GLES20#GL_INVALID_VALUE INVALID_VALUE} error is generated if {@code length} is negative and the number of characters in {@code message}, excluding the null-terminator,
	 * is not less than the value of {@link #GL_MAX_DEBUG_MESSAGE_LENGTH MAX_DEBUG_MESSAGE_LENGTH}.</p>
	 *
	 * @param source  the source of the debug message. One of:<br><table><tr><td>{@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td></tr></table>
	 * @param id      the identifier of the message
	 * @param message a string containing the message to be sent to the debug output stream
	 */
	public static void glPushDebugGroup(int source, int id, CharSequence message) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer messageEncoded = stack.UTF8(message, false);
			int messageEncodedLen = messageEncoded.capacity();
			nglPushDebugGroup(source, id, messageEncodedLen, memAddress(messageEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glPopDebugGroup ] ---

	/**
	 * Pops the active debug group. When a debug group is popped, the GL will also generate a debug output message describing its cause based on the
	 * {@code message} string, the source {@code source}, and an ID {@code id} submitted to the associated {@link #glPushDebugGroup PushDebugGroup} command.
	 * {@link #GL_DEBUG_TYPE_PUSH_GROUP DEBUG_TYPE_PUSH_GROUP} and {@link #GL_DEBUG_TYPE_POP_GROUP DEBUG_TYPE_POP_GROUP} share a single namespace for message {@code id}. {@code severity} has the value
	 * {@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}. The {@code type} has the value {@link #GL_DEBUG_TYPE_POP_GROUP DEBUG_TYPE_POP_GROUP}. Popping a debug group restores the debug output volume
	 * control of the parent debug group.
	 * 
	 * <p>Attempting to pop the default debug group off the stack generates a {@link #GL_STACK_UNDERFLOW STACK_UNDERFLOW} error; pushing a debug group onto a stack containing
	 * {@link #GL_MAX_DEBUG_GROUP_STACK_DEPTH MAX_DEBUG_GROUP_STACK_DEPTH} minus one elements will generate a {@link #GL_STACK_OVERFLOW STACK_OVERFLOW} error.</p>
	 */
	public static void glPopDebugGroup() {
		long __functionAddress = GLES.getCapabilities().glPopDebugGroup;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

	// --- [ glObjectLabel ] ---

	/**
	 * Labels a named object identified within a namespace.
	 *
	 * @param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link #GL_BUFFER BUFFER}</td><td>{@link #GL_SHADER SHADER}</td><td>{@link #GL_PROGRAM PROGRAM}</td><td>{@link #GL_QUERY QUERY}</td><td>{@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link #GL_SAMPLER SAMPLER}</td><td>{@link GLES20#GL_TEXTURE TEXTURE}</td><td>{@link GLES20#GL_RENDERBUFFER RENDERBUFFER}</td></tr><tr><td>{@link GLES20#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GLES30#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
	 * @param name       the name of the object to label
	 * @param length     the length of the label to be used for the object
	 * @param label      a string containing the label to assign to the object
	 */
	public static void nglObjectLabel(int identifier, int name, int length, long label) {
		long __functionAddress = GLES.getCapabilities().glObjectLabel;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, identifier, name, length, label);
	}

	/**
	 * Labels a named object identified within a namespace.
	 *
	 * @param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link #GL_BUFFER BUFFER}</td><td>{@link #GL_SHADER SHADER}</td><td>{@link #GL_PROGRAM PROGRAM}</td><td>{@link #GL_QUERY QUERY}</td><td>{@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link #GL_SAMPLER SAMPLER}</td><td>{@link GLES20#GL_TEXTURE TEXTURE}</td><td>{@link GLES20#GL_RENDERBUFFER RENDERBUFFER}</td></tr><tr><td>{@link GLES20#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GLES30#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
	 * @param name       the name of the object to label
	 * @param label      a string containing the label to assign to the object
	 */
	public static void glObjectLabel(int identifier, int name, ByteBuffer label) {
		nglObjectLabel(identifier, name, label.remaining(), memAddress(label));
	}

	/**
	 * Labels a named object identified within a namespace.
	 *
	 * @param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link #GL_BUFFER BUFFER}</td><td>{@link #GL_SHADER SHADER}</td><td>{@link #GL_PROGRAM PROGRAM}</td><td>{@link #GL_QUERY QUERY}</td><td>{@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link #GL_SAMPLER SAMPLER}</td><td>{@link GLES20#GL_TEXTURE TEXTURE}</td><td>{@link GLES20#GL_RENDERBUFFER RENDERBUFFER}</td></tr><tr><td>{@link GLES20#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GLES30#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
	 * @param name       the name of the object to label
	 * @param label      a string containing the label to assign to the object
	 */
	public static void glObjectLabel(int identifier, int name, CharSequence label) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer labelEncoded = stack.UTF8(label, false);
			int labelEncodedLen = labelEncoded.capacity();
			nglObjectLabel(identifier, name, labelEncodedLen, memAddress(labelEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetObjectLabel ] ---

	/**
	 * Retrieves the label of a named object identified within a namespace.
	 *
	 * @param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link #GL_BUFFER BUFFER}</td><td>{@link #GL_SHADER SHADER}</td><td>{@link #GL_PROGRAM PROGRAM}</td><td>{@link #GL_QUERY QUERY}</td><td>{@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link #GL_SAMPLER SAMPLER}</td><td>{@link GLES20#GL_TEXTURE TEXTURE}</td><td>{@link GLES20#GL_RENDERBUFFER RENDERBUFFER}</td></tr><tr><td>{@link GLES20#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GLES30#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
	 * @param name       the name of the object whose label to retrieve
	 * @param bufSize    the length of the buffer whose address is in {@code label}
	 * @param length     the address of a variable to receive the length of the object label
	 * @param label      a string that will receive the object label
	 */
	public static void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label) {
		long __functionAddress = GLES.getCapabilities().glGetObjectLabel;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, identifier, name, bufSize, length, label);
	}

	/**
	 * Retrieves the label of a named object identified within a namespace.
	 *
	 * @param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link #GL_BUFFER BUFFER}</td><td>{@link #GL_SHADER SHADER}</td><td>{@link #GL_PROGRAM PROGRAM}</td><td>{@link #GL_QUERY QUERY}</td><td>{@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link #GL_SAMPLER SAMPLER}</td><td>{@link GLES20#GL_TEXTURE TEXTURE}</td><td>{@link GLES20#GL_RENDERBUFFER RENDERBUFFER}</td></tr><tr><td>{@link GLES20#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GLES30#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
	 * @param name       the name of the object whose label to retrieve
	 * @param length     the address of a variable to receive the length of the object label
	 * @param label      a string that will receive the object label
	 */
	public static void glGetObjectLabel(int identifier, int name, IntBuffer length, ByteBuffer label) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetObjectLabel(identifier, name, label.remaining(), memAddressSafe(length), memAddress(label));
	}

	/**
	 * Retrieves the label of a named object identified within a namespace.
	 *
	 * @param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link #GL_BUFFER BUFFER}</td><td>{@link #GL_SHADER SHADER}</td><td>{@link #GL_PROGRAM PROGRAM}</td><td>{@link #GL_QUERY QUERY}</td><td>{@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link #GL_SAMPLER SAMPLER}</td><td>{@link GLES20#GL_TEXTURE TEXTURE}</td><td>{@link GLES20#GL_RENDERBUFFER RENDERBUFFER}</td></tr><tr><td>{@link GLES20#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GLES30#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
	 * @param name       the name of the object whose label to retrieve
	 * @param bufSize    the length of the buffer whose address is in {@code label}
	 */
	public static String glGetObjectLabel(int identifier, int name, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer label = stack.malloc(bufSize);
			nglGetObjectLabel(identifier, name, bufSize, memAddress(length), memAddress(label));
			return memUTF8(label, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * Retrieves the label of a named object identified within a namespace.
	 *
	 * @param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link #GL_BUFFER BUFFER}</td><td>{@link #GL_SHADER SHADER}</td><td>{@link #GL_PROGRAM PROGRAM}</td><td>{@link #GL_QUERY QUERY}</td><td>{@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link #GL_SAMPLER SAMPLER}</td><td>{@link GLES20#GL_TEXTURE TEXTURE}</td><td>{@link GLES20#GL_RENDERBUFFER RENDERBUFFER}</td></tr><tr><td>{@link GLES20#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GLES30#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
	 * @param name       the name of the object whose label to retrieve
	 */
	public static String glGetObjectLabel(int identifier, int name) {
		int bufSize = GLES20.glGetInteger(GL_MAX_LABEL_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer label = stack.malloc(bufSize);
			nglGetObjectLabel(identifier, name, bufSize, memAddress(length), memAddress(label));
			return memUTF8(label, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glObjectPtrLabel ] ---

	/**
	 * Labels a sync object identified by a pointer.
	 *
	 * @param ptr    a pointer identifying a sync object
	 * @param length the length of the label to be used for the object
	 * @param label  a string containing the label to assign to the object
	 */
	public static void nglObjectPtrLabel(long ptr, int length, long label) {
		long __functionAddress = GLES.getCapabilities().glObjectPtrLabel;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(ptr);
		}
		callPPV(__functionAddress, ptr, length, label);
	}

	/**
	 * Labels a sync object identified by a pointer.
	 *
	 * @param ptr   a pointer identifying a sync object
	 * @param label a string containing the label to assign to the object
	 */
	public static void glObjectPtrLabel(long ptr, ByteBuffer label) {
		nglObjectPtrLabel(ptr, label.remaining(), memAddress(label));
	}

	/**
	 * Labels a sync object identified by a pointer.
	 *
	 * @param ptr   a pointer identifying a sync object
	 * @param label a string containing the label to assign to the object
	 */
	public static void glObjectPtrLabel(long ptr, CharSequence label) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer labelEncoded = stack.UTF8(label, false);
			int labelEncodedLen = labelEncoded.capacity();
			nglObjectPtrLabel(ptr, labelEncodedLen, memAddress(labelEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetObjectPtrLabel ] ---

	/**
	 * Retrieves the label of a sync object identified by a pointer.
	 *
	 * @param ptr     the name of the sync object whose label to retrieve
	 * @param bufSize the length of the buffer whose address is in {@code label}
	 * @param length  a variable to receive the length of the object label
	 * @param label   a string that will receive the object label
	 */
	public static void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label) {
		long __functionAddress = GLES.getCapabilities().glGetObjectPtrLabel;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(ptr);
		}
		callPPPV(__functionAddress, ptr, bufSize, length, label);
	}

	/**
	 * Retrieves the label of a sync object identified by a pointer.
	 *
	 * @param ptr    the name of the sync object whose label to retrieve
	 * @param length a variable to receive the length of the object label
	 * @param label  a string that will receive the object label
	 */
	public static void glGetObjectPtrLabel(long ptr, IntBuffer length, ByteBuffer label) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetObjectPtrLabel(ptr, label.remaining(), memAddressSafe(length), memAddress(label));
	}

	/**
	 * Retrieves the label of a sync object identified by a pointer.
	 *
	 * @param ptr     the name of the sync object whose label to retrieve
	 * @param bufSize the length of the buffer whose address is in {@code label}
	 */
	public static String glGetObjectPtrLabel(long ptr, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer label = stack.malloc(bufSize);
			nglGetObjectPtrLabel(ptr, bufSize, memAddress(length), memAddress(label));
			return memUTF8(label, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * Retrieves the label of a sync object identified by a pointer.
	 *
	 * @param ptr the name of the sync object whose label to retrieve
	 */
	public static String glGetObjectPtrLabel(long ptr) {
		int bufSize = GLES20.glGetInteger(GL_MAX_LABEL_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer label = stack.malloc(bufSize);
			nglGetObjectPtrLabel(ptr, bufSize, memAddress(length), memAddress(label));
			return memUTF8(label, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glEnablei ] ---

	public static void glEnablei(int target, int index) {
		long __functionAddress = GLES.getCapabilities().glEnablei;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index);
	}

	// --- [ glDisablei ] ---

	public static void glDisablei(int target, int index) {
		long __functionAddress = GLES.getCapabilities().glDisablei;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index);
	}

	// --- [ glBlendEquationi ] ---

	public static void glBlendEquationi(int buf, int mode) {
		long __functionAddress = GLES.getCapabilities().glBlendEquationi;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, mode);
	}

	// --- [ glBlendEquationSeparatei ] ---

	public static void glBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
		long __functionAddress = GLES.getCapabilities().glBlendEquationSeparatei;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, modeRGB, modeAlpha);
	}

	// --- [ glBlendFunci ] ---

	public static void glBlendFunci(int buf, int src, int dst) {
		long __functionAddress = GLES.getCapabilities().glBlendFunci;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, src, dst);
	}

	// --- [ glBlendFuncSeparatei ] ---

	public static void glBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
		long __functionAddress = GLES.getCapabilities().glBlendFuncSeparatei;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
	}

	// --- [ glColorMaski ] ---

	public static void glColorMaski(int index, boolean r, boolean g, boolean b, boolean a) {
		long __functionAddress = GLES.getCapabilities().glColorMaski;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, r, g, b, a);
	}

	// --- [ glIsEnabledi ] ---

	public static boolean glIsEnabledi(int target, int index) {
		long __functionAddress = GLES.getCapabilities().glIsEnabledi;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, target, index);
	}

	// --- [ glDrawElementsBaseVertex ] ---

	public static void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
		long __functionAddress = GLES.getCapabilities().glDrawElementsBaseVertex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, count, type, indices, basevertex);
	}

	public static void glDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsBaseVertex(mode, count, type, indices, basevertex);
	}

	public static void glDrawElementsBaseVertex(int mode, int type, ByteBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertex(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
	}

	public static void glDrawElementsBaseVertex(int mode, ByteBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertex(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
	}

	public static void glDrawElementsBaseVertex(int mode, ShortBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertex(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
	}

	public static void glDrawElementsBaseVertex(int mode, IntBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertex(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), basevertex);
	}

	// --- [ glDrawRangeElementsBaseVertex ] ---

	public static void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
		long __functionAddress = GLES.getCapabilities().glDrawRangeElementsBaseVertex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, start, end, count, type, indices, basevertex);
	}

	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
	}

	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int type, ByteBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
	}

	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ByteBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
	}

	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ShortBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
	}

	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, IntBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), basevertex);
	}

	// --- [ glDrawElementsInstancedBaseVertex ] ---

	public static void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int instancecount, int basevertex) {
		long __functionAddress = GLES.getCapabilities().glDrawElementsInstancedBaseVertex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, count, type, indices, instancecount, basevertex);
	}

	public static void glDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int instancecount, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstancedBaseVertex(mode, count, type, indices, instancecount, basevertex);
	}

	public static void glDrawElementsInstancedBaseVertex(int mode, int type, ByteBuffer indices, int instancecount, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount, basevertex);
	}

	public static void glDrawElementsInstancedBaseVertex(int mode, ByteBuffer indices, int instancecount, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount, basevertex);
	}

	public static void glDrawElementsInstancedBaseVertex(int mode, ShortBuffer indices, int instancecount, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount, basevertex);
	}

	public static void glDrawElementsInstancedBaseVertex(int mode, IntBuffer indices, int instancecount, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount, basevertex);
	}

	// --- [ glFramebufferTexture ] ---

	public static void glFramebufferTexture(int target, int attachment, int texture, int level) {
		long __functionAddress = GLES.getCapabilities().glFramebufferTexture;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, attachment, texture, level);
	}

	// --- [ glPrimitiveBoundingBox ] ---

	/**
	 * Specifies the primitive bounding box.
	 * 
	 * <p>Implementations may be able to optimize performance if the application provides bounds of primitives that will be generated by the tessellation
	 * primitive generator or the geometry shader prior to executing those stages. If the provided bounds are incorrect and primitives extend beyond them, the
	 * rasterizer may or may not generate fragments for the portions of primitives outside the bounds.</p>
	 *
	 * @param minX the minimum x clip space coordinate
	 * @param minY the minimum y clip space coordinate
	 * @param minZ the minimum z clip space coordinate
	 * @param minW the minimum w clip space coordinate
	 * @param maxX the maximum x clip space coordinate
	 * @param maxY the maximum y clip space coordinate
	 * @param maxZ the maximum z clip space coordinate
	 * @param maxW the maximum w clip space coordinate
	 */
	public static void glPrimitiveBoundingBox(float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW) {
		long __functionAddress = GLES.getCapabilities().glPrimitiveBoundingBox;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
	}

	// --- [ glGetGraphicsResetStatus ] ---

	/**
	 * Indicates if the GL context has been in a reset state at any point since the last call to GetGraphicsResetStatus:
	 * 
	 * <ul>
	 * <li>{@link GLES20#GL_NO_ERROR NO_ERROR} indicates that the GL context has not been in a reset state since the last call.</li>
	 * <li>{@link #GL_GUILTY_CONTEXT_RESET GUILTY_CONTEXT_RESET} indicates that a reset has been detected that is attributable to the current GL context.</li>
	 * <li>{@link #GL_INNOCENT_CONTEXT_RESET INNOCENT_CONTEXT_RESET} indicates a reset has been detected that is not attributable to the current GL context.</li>
	 * <li>{@link #GL_UNKNOWN_CONTEXT_RESET UNKNOWN_CONTEXT_RESET} indicates a detected graphics reset whose cause is unknown.</li>
	 * </ul>
	 * 
	 * <p>If a reset status other than NO_ERROR is returned and subsequent calls return NO_ERROR, the context reset was encountered and completed. If a reset
	 * status is repeatedly returned, the context may be in the process of resetting.</p>
	 * 
	 * <p>Reset notification behavior is determined at context creation time, and may be queried by calling GetIntegerv with the symbolic constant
	 * {@link #GL_RESET_NOTIFICATION_STRATEGY RESET_NOTIFICATION_STRATEGY}.</p>
	 * 
	 * <p>If the reset notification behavior is {@link #GL_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION}, then the implementation will never deliver notification of reset events, and
	 * GetGraphicsResetStatus will always return NO_ERROR.</p>
	 * 
	 * <p>If the behavior is {@link #GL_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET}, a graphics reset will result in a lost context and require creating a new context as described
	 * above. In this case GetGraphicsResetStatus will return an appropriate value from those described above.</p>
	 * 
	 * <p>If a graphics reset notification occurs in a context, a notification must also occur in all other contexts which share objects with that context.</p>
	 * 
	 * <p>After a graphics reset has occurred on a context, subsequent GL commands on that context (or any context which shares with that context) will generate a
	 * {@link #GL_CONTEXT_LOST CONTEXT_LOST} error. Such commands will not have side effects (in particular, they will not modify memory passed by pointer for query results,
	 * and may not block indefinitely or cause termination of the application. Exceptions to this behavior include:</p>
	 * 
	 * <ul>
	 * <li>{@link GLES20#glGetError GetError} and GetGraphicsResetStatus behave normally following a graphics reset, so that the application can determine a reset has
	 * occurred, and when it is safe to destroy and recreate the context.</li>
	 * <li>Any commands which might cause a polling application to block indefinitely will generate a CONTEXT_LOST error, but will also return a value
	 * indicating completion to the application.</li>
	 * </ul>
	 */
	public static int glGetGraphicsResetStatus() {
		long __functionAddress = GLES.getCapabilities().glGetGraphicsResetStatus;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callI(__functionAddress);
	}

	// --- [ glReadnPixels ] ---

	/**
	 * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
	 *
	 * @param x       the left pixel coordinate
	 * @param y       the lower pixel coordinate
	 * @param width   the number of pixels to read in the x-dimension
	 * @param height  the number of pixels to read in the y-dimension
	 * @param format  the pixel format
	 * @param type    the pixel type
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param pixels  a buffer in which to place the returned pixel data
	 */
	public static void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
		long __functionAddress = GLES.getCapabilities().glReadnPixels;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, x, y, width, height, format, type, bufSize, pixels);
	}

	/**
	 * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
	 *
	 * @param x       the left pixel coordinate
	 * @param y       the lower pixel coordinate
	 * @param width   the number of pixels to read in the x-dimension
	 * @param height  the number of pixels to read in the y-dimension
	 * @param format  the pixel format
	 * @param type    the pixel type
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param pixels  a buffer in which to place the returned pixel data
	 */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglReadnPixels(x, y, width, height, format, type, bufSize, pixels);
	}

	/**
	 * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
	 *
	 * @param x      the left pixel coordinate
	 * @param y      the lower pixel coordinate
	 * @param width  the number of pixels to read in the x-dimension
	 * @param height the number of pixels to read in the y-dimension
	 * @param format the pixel format
	 * @param type   the pixel type
	 * @param pixels a buffer in which to place the returned pixel data
	 */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining(), memAddress(pixels));
	}

	/** ShortBuffer version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 1, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	// --- [ glGetnUniformfv ] ---

	/**
	 * Returns the value or values of a uniform of the default uniform block.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param bufSize  the maximum number of bytes to write to {@code params}
	 * @param params   the buffer in which to place the returned data
	 */
	public static void nglGetnUniformfv(int program, int location, int bufSize, long params) {
		long __functionAddress = GLES.getCapabilities().glGetnUniformfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * Returns the value or values of a uniform of the default uniform block.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param params   the buffer in which to place the returned data
	 */
	public static void glGetnUniformfv(int program, int location, FloatBuffer params) {
		nglGetnUniformfv(program, location, params.remaining(), memAddress(params));
	}

	/**
	 * Returns the value or values of a uniform of the default uniform block.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 */
	public static float glGetnUniformf(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetnUniformfv(program, location, 1, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetnUniformiv ] ---

	/**
	 * Integer version of {@link #glGetnUniformfv GetnUniformfv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param bufSize  the maximum number of bytes to write to {@code params}
	 * @param params   the buffer in which to place the returned data
	 */
	public static void nglGetnUniformiv(int program, int location, int bufSize, long params) {
		long __functionAddress = GLES.getCapabilities().glGetnUniformiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * Integer version of {@link #glGetnUniformfv GetnUniformfv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param params   the buffer in which to place the returned data
	 */
	public static void glGetnUniformiv(int program, int location, FloatBuffer params) {
		nglGetnUniformiv(program, location, params.remaining(), memAddress(params));
	}

	/**
	 * Integer version of {@link #glGetnUniformfv GetnUniformfv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 */
	public static float glGetnUniformi(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetnUniformiv(program, location, 1, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetnUniformuiv ] ---

	/**
	 * Unsigned version of {@link #glGetnUniformiv GetnUniformiv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param bufSize  the maximum number of bytes to write to {@code params}
	 * @param params   the buffer in which to place the returned data
	 */
	public static void nglGetnUniformuiv(int program, int location, int bufSize, long params) {
		long __functionAddress = GLES.getCapabilities().glGetnUniformuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * Unsigned version of {@link #glGetnUniformiv GetnUniformiv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param params   the buffer in which to place the returned data
	 */
	public static void glGetnUniformuiv(int program, int location, FloatBuffer params) {
		nglGetnUniformuiv(program, location, params.remaining(), memAddress(params));
	}

	/**
	 * Unsigned version of {@link #glGetnUniformiv GetnUniformiv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 */
	public static float glGetnUniformui(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetnUniformuiv(program, location, 1, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glMinSampleShading ] ---

	public static void glMinSampleShading(float value) {
		long __functionAddress = GLES.getCapabilities().glMinSampleShading;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, value);
	}

	// --- [ glPatchParameteri ] ---

	public static void glPatchParameteri(int pname, int value) {
		long __functionAddress = GLES.getCapabilities().glPatchParameteri;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, pname, value);
	}

	// --- [ glTexParameterIiv ] ---

	public static void nglTexParameterIiv(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glTexParameterIiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glTexParameterIiv(int target, int pname, IntBuffer params) {
		nglTexParameterIiv(target, pname, memAddress(params));
	}

	public static void glTexParameterIi(int target, int pname, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.ints(param);
			nglTexParameterIiv(target, pname, memAddress(params));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glTexParameterIuiv ] ---

	public static void nglTexParameterIuiv(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glTexParameterIuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glTexParameterIuiv(int target, int pname, IntBuffer params) {
		nglTexParameterIuiv(target, pname, memAddress(params));
	}

	public static void glTexParameterIui(int target, int pname, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.ints(param);
			nglTexParameterIuiv(target, pname, memAddress(params));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexParameterIiv ] ---

	public static void nglGetTexParameterIiv(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetTexParameterIiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glGetTexParameterIiv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterIiv(target, pname, memAddress(params));
	}

	public static int glGetTexParameterIi(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetTexParameterIiv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexParameterIuiv ] ---

	public static void nglGetTexParameterIuiv(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetTexParameterIuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glGetTexParameterIuiv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterIuiv(target, pname, memAddress(params));
	}

	public static int glGetTexParameterIui(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetTexParameterIuiv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glSamplerParameterIiv ] ---

	public static void nglSamplerParameterIiv(int sampler, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameterIiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	public static void glSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
		nglSamplerParameterIiv(sampler, pname, memAddress(params));
	}

	public static void glSamplerParameterIi(int sampler, int pname, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.ints(param);
			nglSamplerParameterIiv(sampler, pname, memAddress(params));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glSamplerParameterIuiv ] ---

	public static void nglSamplerParameterIuiv(int sampler, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameterIuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	public static void glSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
		nglSamplerParameterIuiv(sampler, pname, memAddress(params));
	}

	public static void glSamplerParameterIui(int sampler, int pname, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.ints(param);
			nglSamplerParameterIuiv(sampler, pname, memAddress(params));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetSamplerParameterIiv ] ---

	public static void nglGetSamplerParameterIiv(int sampler, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetSamplerParameterIiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	public static void glGetSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
	}

	public static int glGetSamplerParameterIi(int sampler, int pname) {
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

	public static void nglGetSamplerParameterIuiv(int sampler, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetSamplerParameterIuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	public static void glGetSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
	}

	public static int glGetSamplerParameterIui(int sampler, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glTexBuffer ] ---

	public static void glTexBuffer(int target, int internalformat, int buffer) {
		long __functionAddress = GLES.getCapabilities().glTexBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, internalformat, buffer);
	}

	// --- [ glTexBufferRange ] ---

	public static void glTexBufferRange(int target, int internalformat, int buffer, long offset, long size) {
		long __functionAddress = GLES.getCapabilities().glTexBufferRange;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, target, internalformat, buffer, offset, size);
	}

	// --- [ glTexStorage3DMultisample ] ---

	public static void glTexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
		long __functionAddress = GLES.getCapabilities().glTexStorage3DMultisample;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, samples, internalformat, width, height, depth, fixedsamplelocations);
	}

	/** Array version of: {@link #glDebugMessageControl DebugMessageControl} */
	public static void glDebugMessageControl(int source, int type, int severity, int[] ids, boolean enabled) {
		long __functionAddress = GLES.getCapabilities().glDebugMessageControl;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, source, type, severity, ids.length, ids, enabled);
	}

	/** Array version of: {@link #glGetDebugMessageLog GetDebugMessageLog} */
	public static int glGetDebugMessageLog(int count, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, ByteBuffer messageLog) {
		long __functionAddress = GLES.getCapabilities().glGetDebugMessageLog;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( sources != null ) checkBuffer(sources, count);
			if ( types != null ) checkBuffer(types, count);
			if ( ids != null ) checkBuffer(ids, count);
			if ( severities != null ) checkBuffer(severities, count);
			if ( lengths != null ) checkBuffer(lengths, count);
		}
		return callPPPPPPI(__functionAddress, count, messageLog == null ? 0 : messageLog.remaining(), sources, types, ids, severities, lengths, memAddressSafe(messageLog));
	}

	/** Array version of: {@link #glGetObjectLabel GetObjectLabel} */
	public static void glGetObjectLabel(int identifier, int name, int[] length, ByteBuffer label) {
		long __functionAddress = GLES.getCapabilities().glGetObjectLabel;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPV(__functionAddress, identifier, name, label.remaining(), length, memAddress(label));
	}

	/** Array version of: {@link #glGetObjectPtrLabel GetObjectPtrLabel} */
	public static void glGetObjectPtrLabel(long ptr, int[] length, ByteBuffer label) {
		long __functionAddress = GLES.getCapabilities().glGetObjectPtrLabel;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(ptr);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPPV(__functionAddress, ptr, label.remaining(), length, memAddress(label));
	}

	/** short[] version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
		long __functionAddress = GLES.getCapabilities().glReadnPixels;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, x, y, width, height, format, type, pixels.length << 1, pixels);
	}

	/** int[] version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
		long __functionAddress = GLES.getCapabilities().glReadnPixels;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, x, y, width, height, format, type, pixels.length << 2, pixels);
	}

	/** float[] version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
		long __functionAddress = GLES.getCapabilities().glReadnPixels;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, x, y, width, height, format, type, pixels.length << 2, pixels);
	}

	/** Array version of: {@link #glGetnUniformfv GetnUniformfv} */
	public static void glGetnUniformfv(int program, int location, float[] params) {
		long __functionAddress = GLES.getCapabilities().glGetnUniformfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params.length, params);
	}

	/** Array version of: {@link #glGetnUniformiv GetnUniformiv} */
	public static void glGetnUniformiv(int program, int location, float[] params) {
		long __functionAddress = GLES.getCapabilities().glGetnUniformiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params.length, params);
	}

	/** Array version of: {@link #glGetnUniformuiv GetnUniformuiv} */
	public static void glGetnUniformuiv(int program, int location, float[] params) {
		long __functionAddress = GLES.getCapabilities().glGetnUniformuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params.length, params);
	}

	/** Array version of: {@link #glTexParameterIiv TexParameterIiv} */
	public static void glTexParameterIiv(int target, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glTexParameterIiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glTexParameterIuiv TexParameterIuiv} */
	public static void glTexParameterIuiv(int target, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glTexParameterIuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetTexParameterIiv GetTexParameterIiv} */
	public static void glGetTexParameterIiv(int target, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetTexParameterIiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetTexParameterIuiv GetTexParameterIuiv} */
	public static void glGetTexParameterIuiv(int target, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetTexParameterIuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glSamplerParameterIiv SamplerParameterIiv} */
	public static void glSamplerParameterIiv(int sampler, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameterIiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glSamplerParameterIuiv SamplerParameterIuiv} */
	public static void glSamplerParameterIuiv(int sampler, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameterIuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glGetSamplerParameterIiv GetSamplerParameterIiv} */
	public static void glGetSamplerParameterIiv(int sampler, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetSamplerParameterIiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv} */
	public static void glGetSamplerParameterIuiv(int sampler, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetSamplerParameterIuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

}