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

/** The core OpenGL 4.3 functionality. */
public final class GL43 {

	/** No. of supported Shading Language Versions. Accepted by the {@code pname} parameter of GetIntegerv. */
	public static final int
		GL_NUM_SHADING_LANGUAGE_VERSIONS = 0x82E9;

	/** Vertex attrib array has unconverted doubles. Accepted by the {@code pname} parameter of GetVertexAttribiv. */
	public static final int
		GL_VERTEX_ATTRIB_ARRAY_LONG = 0x874E;

	/** Accepted by the {@code internalformat} parameter of CompressedTexImage2D. */
	public static final int
		GL_COMPRESSED_RGB8_ETC2                      = 0x9274,
		GL_COMPRESSED_SRGB8_ETC2                     = 0x9275,
		GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2  = 0x9276,
		GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277,
		GL_COMPRESSED_RGBA8_ETC2_EAC                 = 0x9278,
		GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC          = 0x9279,
		GL_COMPRESSED_R11_EAC                        = 0x9270,
		GL_COMPRESSED_SIGNED_R11_EAC                 = 0x9271,
		GL_COMPRESSED_RG11_EAC                       = 0x9272,
		GL_COMPRESSED_SIGNED_RG11_EAC                = 0x9273;

	/** Accepted by the {@code target} parameter of Enable and Disable. */
	public static final int
		GL_PRIMITIVE_RESTART_FIXED_INDEX = 0x8D69;

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, GetQueryIndexediv and GetQueryiv. */
	public static final int
		GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;

	/** Accepted by the {@code value} parameter of the GetInteger* functions. */
	public static final int
		GL_MAX_ELEMENT_INDEX = 0x8D6B;

	/** Accepted by the {@code pname} parameters of GetTexParameterfv and  GetTexParameteriv. */
	public static final int
		GL_TEXTURE_IMMUTABLE_LEVELS = 0x82DF;

	/** Accepted by the {@code type} parameter of CreateShader and returned in the {@code params} parameter by GetShaderiv. */
	public static final int
		GL_COMPUTE_SHADER = 0x91B9;

	/** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v. */
	public static final int
		GL_MAX_COMPUTE_UNIFORM_BLOCKS              = 0x91BB,
		GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS         = 0x91BC,
		GL_MAX_COMPUTE_IMAGE_UNIFORMS              = 0x91BD,
		GL_MAX_COMPUTE_SHARED_MEMORY_SIZE          = 0x8262,
		GL_MAX_COMPUTE_UNIFORM_COMPONENTS          = 0x8263,
		GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS      = 0x8264,
		GL_MAX_COMPUTE_ATOMIC_COUNTERS             = 0x8265,
		GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 0x8266,
		GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS      = 0x90EB;

	/** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetFloati_v, GetDoublei_v and GetInteger64i_v. */
	public static final int
		GL_MAX_COMPUTE_WORK_GROUP_COUNT = 0x91BE,
		GL_MAX_COMPUTE_WORK_GROUP_SIZE  = 0x91BF;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int
		GL_COMPUTE_WORK_GROUP_SIZE = 0x8267;

	/** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv. */
	public static final int
		GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 0x90EC;

	/** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv. */
	public static final int
		GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 0x90ED;

	/** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv. */
	public static final int
		GL_DISPATCH_INDIRECT_BUFFER = 0x90EE;

	/** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_DISPATCH_INDIRECT_BUFFER_BINDING = 0x90EF;

	/** Accepted by the {@code stages} parameter of UseProgramStages. */
	public static final int
		GL_COMPUTE_SHADER_BIT = 0x20;

	/** Tokens accepted by the {@code target} parameters of Enable, Disable, and  IsEnabled. */
	public static final int
		GL_DEBUG_OUTPUT             = 0x92E0,
		GL_DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;

	/** Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS. */
	public static final int
		GL_CONTEXT_FLAG_DEBUG_BIT = 0x2;

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
		GL_SAMPLER          = 0x82E6,
		GL_DISPLAY_LIST     = 0x82E7;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v. */
	public static final int
		GL_MAX_UNIFORM_LOCATIONS = 0x826E;

	/**
	 * Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv, NamedFramebufferParameteriEXT, and
	 * GetNamedFramebufferParameterivEXT.
	 */
	public static final int
		GL_FRAMEBUFFER_DEFAULT_WIDTH                  = 0x9310,
		GL_FRAMEBUFFER_DEFAULT_HEIGHT                 = 0x9311,
		GL_FRAMEBUFFER_DEFAULT_LAYERS                 = 0x9312,
		GL_FRAMEBUFFER_DEFAULT_SAMPLES                = 0x9313,
		GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;

	/** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_FRAMEBUFFER_WIDTH   = 0x9315,
		GL_MAX_FRAMEBUFFER_HEIGHT  = 0x9316,
		GL_MAX_FRAMEBUFFER_LAYERS  = 0x9317,
		GL_MAX_FRAMEBUFFER_SAMPLES = 0x9318;

	/** Accepted by the {@code target} parameter of GetInternalformativ and GetInternalformati64v. */
	public static final int
		GL_TEXTURE_1D                   = 0xDE0,
		GL_TEXTURE_1D_ARRAY             = 0x8C18,
		GL_TEXTURE_2D                   = 0xDE1,
		GL_TEXTURE_2D_ARRAY             = 0x8C1A,
		GL_TEXTURE_3D                   = 0x806F,
		GL_TEXTURE_CUBE_MAP             = 0x8513,
		GL_TEXTURE_CUBE_MAP_ARRAY       = 0x9009,
		GL_TEXTURE_RECTANGLE            = 0x84F5,
		GL_TEXTURE_BUFFER               = 0x8C2A,
		GL_RENDERBUFFER                 = 0x8D41,
		GL_TEXTURE_2D_MULTISAMPLE       = 0x9100,
		GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;

	/** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v. */
	public static final int
		GL_SAMPLES                                = 0x80A9,
		GL_NUM_SAMPLE_COUNTS                      = 0x9380,
		GL_INTERNALFORMAT_SUPPORTED               = 0x826F,
		GL_INTERNALFORMAT_PREFERRED               = 0x8270,
		GL_INTERNALFORMAT_RED_SIZE                = 0x8271,
		GL_INTERNALFORMAT_GREEN_SIZE              = 0x8272,
		GL_INTERNALFORMAT_BLUE_SIZE               = 0x8273,
		GL_INTERNALFORMAT_ALPHA_SIZE              = 0x8274,
		GL_INTERNALFORMAT_DEPTH_SIZE              = 0x8275,
		GL_INTERNALFORMAT_STENCIL_SIZE            = 0x8276,
		GL_INTERNALFORMAT_SHARED_SIZE             = 0x8277,
		GL_INTERNALFORMAT_RED_TYPE                = 0x8278,
		GL_INTERNALFORMAT_GREEN_TYPE              = 0x8279,
		GL_INTERNALFORMAT_BLUE_TYPE               = 0x827A,
		GL_INTERNALFORMAT_ALPHA_TYPE              = 0x827B,
		GL_INTERNALFORMAT_DEPTH_TYPE              = 0x827C,
		GL_INTERNALFORMAT_STENCIL_TYPE            = 0x827D,
		GL_MAX_WIDTH                              = 0x827E,
		GL_MAX_HEIGHT                             = 0x827F,
		GL_MAX_DEPTH                              = 0x8280,
		GL_MAX_LAYERS                             = 0x8281,
		GL_MAX_COMBINED_DIMENSIONS                = 0x8282,
		GL_COLOR_COMPONENTS                       = 0x8283,
		GL_DEPTH_COMPONENTS                       = 0x8284,
		GL_STENCIL_COMPONENTS                     = 0x8285,
		GL_COLOR_RENDERABLE                       = 0x8286,
		GL_DEPTH_RENDERABLE                       = 0x8287,
		GL_STENCIL_RENDERABLE                     = 0x8288,
		GL_FRAMEBUFFER_RENDERABLE                 = 0x8289,
		GL_FRAMEBUFFER_RENDERABLE_LAYERED         = 0x828A,
		GL_FRAMEBUFFER_BLEND                      = 0x828B,
		GL_READ_PIXELS                            = 0x828C,
		GL_READ_PIXELS_FORMAT                     = 0x828D,
		GL_READ_PIXELS_TYPE                       = 0x828E,
		GL_TEXTURE_IMAGE_FORMAT                   = 0x828F,
		GL_TEXTURE_IMAGE_TYPE                     = 0x8290,
		GL_GET_TEXTURE_IMAGE_FORMAT               = 0x8291,
		GL_GET_TEXTURE_IMAGE_TYPE                 = 0x8292,
		GL_MIPMAP                                 = 0x8293,
		GL_MANUAL_GENERATE_MIPMAP                 = 0x8294,
		GL_AUTO_GENERATE_MIPMAP                   = 0x8295,
		GL_COLOR_ENCODING                         = 0x8296,
		GL_SRGB_READ                              = 0x8297,
		GL_SRGB_WRITE                             = 0x8298,
		GL_SRGB_DECODE_ARB                        = 0x8299,
		GL_FILTER                                 = 0x829A,
		GL_VERTEX_TEXTURE                         = 0x829B,
		GL_TESS_CONTROL_TEXTURE                   = 0x829C,
		GL_TESS_EVALUATION_TEXTURE                = 0x829D,
		GL_GEOMETRY_TEXTURE                       = 0x829E,
		GL_FRAGMENT_TEXTURE                       = 0x829F,
		GL_COMPUTE_TEXTURE                        = 0x82A0,
		GL_TEXTURE_SHADOW                         = 0x82A1,
		GL_TEXTURE_GATHER                         = 0x82A2,
		GL_TEXTURE_GATHER_SHADOW                  = 0x82A3,
		GL_SHADER_IMAGE_LOAD                      = 0x82A4,
		GL_SHADER_IMAGE_STORE                     = 0x82A5,
		GL_SHADER_IMAGE_ATOMIC                    = 0x82A6,
		GL_IMAGE_TEXEL_SIZE                       = 0x82A7,
		GL_IMAGE_COMPATIBILITY_CLASS              = 0x82A8,
		GL_IMAGE_PIXEL_FORMAT                     = 0x82A9,
		GL_IMAGE_PIXEL_TYPE                       = 0x82AA,
		GL_IMAGE_FORMAT_COMPATIBILITY_TYPE        = 0x90C7,
		GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST    = 0x82AC,
		GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST  = 0x82AD,
		GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE   = 0x82AE,
		GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE = 0x82AF,
		GL_TEXTURE_COMPRESSED                     = 0x86A1,
		GL_TEXTURE_COMPRESSED_BLOCK_WIDTH         = 0x82B1,
		GL_TEXTURE_COMPRESSED_BLOCK_HEIGHT        = 0x82B2,
		GL_TEXTURE_COMPRESSED_BLOCK_SIZE          = 0x82B3,
		GL_CLEAR_BUFFER                           = 0x82B4,
		GL_TEXTURE_VIEW                           = 0x82B5,
		GL_VIEW_COMPATIBILITY_CLASS               = 0x82B6;

	/** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v. */
	public static final int
		GL_FULL_SUPPORT              = 0x82B7,
		GL_CAVEAT_SUPPORT            = 0x82B8,
		GL_IMAGE_CLASS_4_X_32        = 0x82B9,
		GL_IMAGE_CLASS_2_X_32        = 0x82BA,
		GL_IMAGE_CLASS_1_X_32        = 0x82BB,
		GL_IMAGE_CLASS_4_X_16        = 0x82BC,
		GL_IMAGE_CLASS_2_X_16        = 0x82BD,
		GL_IMAGE_CLASS_1_X_16        = 0x82BE,
		GL_IMAGE_CLASS_4_X_8         = 0x82BF,
		GL_IMAGE_CLASS_2_X_8         = 0x82C0,
		GL_IMAGE_CLASS_1_X_8         = 0x82C1,
		GL_IMAGE_CLASS_11_11_10      = 0x82C2,
		GL_IMAGE_CLASS_10_10_10_2    = 0x82C3,
		GL_VIEW_CLASS_128_BITS       = 0x82C4,
		GL_VIEW_CLASS_96_BITS        = 0x82C5,
		GL_VIEW_CLASS_64_BITS        = 0x82C6,
		GL_VIEW_CLASS_48_BITS        = 0x82C7,
		GL_VIEW_CLASS_32_BITS        = 0x82C8,
		GL_VIEW_CLASS_24_BITS        = 0x82C9,
		GL_VIEW_CLASS_16_BITS        = 0x82CA,
		GL_VIEW_CLASS_8_BITS         = 0x82CB,
		GL_VIEW_CLASS_S3TC_DXT1_RGB  = 0x82CC,
		GL_VIEW_CLASS_S3TC_DXT1_RGBA = 0x82CD,
		GL_VIEW_CLASS_S3TC_DXT3_RGBA = 0x82CE,
		GL_VIEW_CLASS_S3TC_DXT5_RGBA = 0x82CF,
		GL_VIEW_CLASS_RGTC1_RED      = 0x82D0,
		GL_VIEW_CLASS_RGTC2_RG       = 0x82D1,
		GL_VIEW_CLASS_BPTC_UNORM     = 0x82D2,
		GL_VIEW_CLASS_BPTC_FLOAT     = 0x82D3;

	/**
	 * Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv,
	 * GetProgramResourceLocation, and GetProgramResourceLocationIndex.
	 */
	public static final int
		GL_UNIFORM                            = 0x92E1,
		GL_UNIFORM_BLOCK                      = 0x92E2,
		GL_PROGRAM_INPUT                      = 0x92E3,
		GL_PROGRAM_OUTPUT                     = 0x92E4,
		GL_BUFFER_VARIABLE                    = 0x92E5,
		GL_SHADER_STORAGE_BLOCK               = 0x92E6,
		GL_VERTEX_SUBROUTINE                  = 0x92E8,
		GL_TESS_CONTROL_SUBROUTINE            = 0x92E9,
		GL_TESS_EVALUATION_SUBROUTINE         = 0x92EA,
		GL_GEOMETRY_SUBROUTINE                = 0x92EB,
		GL_FRAGMENT_SUBROUTINE                = 0x92EC,
		GL_COMPUTE_SUBROUTINE                 = 0x92ED,
		GL_VERTEX_SUBROUTINE_UNIFORM          = 0x92EE,
		GL_TESS_CONTROL_SUBROUTINE_UNIFORM    = 0x92EF,
		GL_TESS_EVALUATION_SUBROUTINE_UNIFORM = 0x92F0,
		GL_GEOMETRY_SUBROUTINE_UNIFORM        = 0x92F1,
		GL_FRAGMENT_SUBROUTINE_UNIFORM        = 0x92F2,
		GL_COMPUTE_SUBROUTINE_UNIFORM         = 0x92F3,
		GL_TRANSFORM_FEEDBACK_VARYING         = 0x92F4;

	/** Accepted by the {@code pname} parameter of GetProgramInterfaceiv. */
	public static final int
		GL_ACTIVE_RESOURCES               = 0x92F5,
		GL_MAX_NAME_LENGTH                = 0x92F6,
		GL_MAX_NUM_ACTIVE_VARIABLES       = 0x92F7,
		GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 0x92F8;

	/** Accepted in the {@code props} array of GetProgramResourceiv. */
	public static final int
		GL_NAME_LENGTH                          = 0x92F9,
		GL_TYPE                                 = 0x92FA,
		GL_ARRAY_SIZE                           = 0x92FB,
		GL_OFFSET                               = 0x92FC,
		GL_BLOCK_INDEX                          = 0x92FD,
		GL_ARRAY_STRIDE                         = 0x92FE,
		GL_MATRIX_STRIDE                        = 0x92FF,
		GL_IS_ROW_MAJOR                         = 0x9300,
		GL_ATOMIC_COUNTER_BUFFER_INDEX          = 0x9301,
		GL_BUFFER_BINDING                       = 0x9302,
		GL_BUFFER_DATA_SIZE                     = 0x9303,
		GL_NUM_ACTIVE_VARIABLES                 = 0x9304,
		GL_ACTIVE_VARIABLES                     = 0x9305,
		GL_REFERENCED_BY_VERTEX_SHADER          = 0x9306,
		GL_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x9307,
		GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308,
		GL_REFERENCED_BY_GEOMETRY_SHADER        = 0x9309,
		GL_REFERENCED_BY_FRAGMENT_SHADER        = 0x930A,
		GL_REFERENCED_BY_COMPUTE_SHADER         = 0x930B,
		GL_TOP_LEVEL_ARRAY_SIZE                 = 0x930C,
		GL_TOP_LEVEL_ARRAY_STRIDE               = 0x930D,
		GL_LOCATION                             = 0x930E,
		GL_LOCATION_INDEX                       = 0x930F,
		GL_IS_PER_PATCH                         = 0x92E7;

	/** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv. */
	public static final int
		GL_SHADER_STORAGE_BUFFER = 0x90D2;

	/**
	 * Accepted by the {@code pname} parameter of GetIntegerv, GetIntegeri_v, GetBooleanv, GetInteger64v, GetFloatv, GetDoublev, GetBooleani_v, GetIntegeri_v,
	 * GetFloati_v, GetDoublei_v, and GetInteger64i_v.
	 */
	public static final int
		GL_SHADER_STORAGE_BUFFER_BINDING = 0x90D3;

	/** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v. */
	public static final int
		GL_SHADER_STORAGE_BUFFER_START = 0x90D4,
		GL_SHADER_STORAGE_BUFFER_SIZE  = 0x90D5;

	/** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS          = 0x90D6,
		GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS        = 0x90D7,
		GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS    = 0x90D8,
		GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 0x90D9,
		GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS        = 0x90DA,
		GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS         = 0x90DB,
		GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS        = 0x90DC,
		GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS        = 0x90DD,
		GL_MAX_SHADER_STORAGE_BLOCK_SIZE             = 0x90DE,
		GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT    = 0x90DF;

	/** Accepted in the {@code barriers} bitfield in glMemoryBarrier. */
	public static final int
		GL_SHADER_STORAGE_BARRIER_BIT = 0x2000;

	/** Alias for the existing token MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS. */
	public static final int
		GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 0x8F39;

	/** Accepted by the {@code pname} parameter of TexParameter* and GetTexParameter*. */
	public static final int
		GL_DEPTH_STENCIL_TEXTURE_MODE = 0x90EA;

	/** Accepted by the {@code pname} parameter of GetTexLevelParameter. */
	public static final int
		GL_TEXTURE_BUFFER_OFFSET = 0x919D,
		GL_TEXTURE_BUFFER_SIZE   = 0x919E;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;

	/** Accepted by the {@code pname} parameters of GetTexParameterfv and  GetTexParameteriv. */
	public static final int
		GL_TEXTURE_VIEW_MIN_LEVEL  = 0x82DB,
		GL_TEXTURE_VIEW_NUM_LEVELS = 0x82DC,
		GL_TEXTURE_VIEW_MIN_LAYER  = 0x82DD,
		GL_TEXTURE_VIEW_NUM_LAYERS = 0x82DE;

	/** Accepted by the {@code pname} parameter of GetVertexAttrib*v. */
	public static final int
		GL_VERTEX_ATTRIB_BINDING         = 0x82D4,
		GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D5;

	/** Accepted by the {@code target} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v. */
	public static final int
		GL_VERTEX_BINDING_DIVISOR = 0x82D6,
		GL_VERTEX_BINDING_OFFSET  = 0x82D7,
		GL_VERTEX_BINDING_STRIDE  = 0x82D8;

	/** Accepted by the {@code pname} parameter of GetIntegerv, .... */
	public static final int
		GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9,
		GL_MAX_VERTEX_ATTRIB_BINDINGS        = 0x82DA;

	/** Function address. */
	@JavadocExclude
	public final long
		ClearBufferData,
		ClearBufferSubData,
		DispatchCompute,
		DispatchComputeIndirect,
		CopyImageSubData,
		DebugMessageControl,
		DebugMessageInsert,
		DebugMessageCallback,
		GetDebugMessageLog,
		PushDebugGroup,
		ObjectLabel,
		GetObjectLabel,
		ObjectPtrLabel,
		GetObjectPtrLabel,
		FramebufferParameteri,
		GetFramebufferParameteriv,
		GetInternalformati64v,
		InvalidateTexSubImage,
		InvalidateTexImage,
		InvalidateBufferSubData,
		InvalidateBufferData,
		InvalidateFramebuffer,
		InvalidateSubFramebuffer,
		MultiDrawArraysIndirect,
		MultiDrawElementsIndirect,
		GetProgramInterfaceiv,
		GetProgramResourceIndex,
		GetProgramResourceName,
		GetProgramResourceiv,
		GetProgramResourceLocation,
		GetProgramResourceLocationIndex,
		ShaderStorageBlockBinding,
		TexBufferRange,
		TexStorage2DMultisample,
		TexStorage3DMultisample,
		TextureView,
		BindVertexBuffer,
		VertexAttribFormat,
		VertexAttribIFormat,
		VertexAttribLFormat,
		VertexAttribBinding,
		VertexBindingDivisor;

	long refDEBUGPROC;

	@JavadocExclude
	public GL43(FunctionProvider provider) {
		ClearBufferData = provider.getFunctionAddress("glClearBufferData");
		ClearBufferSubData = provider.getFunctionAddress("glClearBufferSubData");
		DispatchCompute = provider.getFunctionAddress("glDispatchCompute");
		DispatchComputeIndirect = provider.getFunctionAddress("glDispatchComputeIndirect");
		CopyImageSubData = provider.getFunctionAddress("glCopyImageSubData");
		DebugMessageControl = provider.getFunctionAddress("glDebugMessageControl");
		DebugMessageInsert = provider.getFunctionAddress("glDebugMessageInsert");
		DebugMessageCallback = provider.getFunctionAddress("glDebugMessageCallback");
		GetDebugMessageLog = provider.getFunctionAddress("glGetDebugMessageLog");
		PushDebugGroup = provider.getFunctionAddress("glPushDebugGroup");
		ObjectLabel = provider.getFunctionAddress("glObjectLabel");
		GetObjectLabel = provider.getFunctionAddress("glGetObjectLabel");
		ObjectPtrLabel = provider.getFunctionAddress("glObjectPtrLabel");
		GetObjectPtrLabel = provider.getFunctionAddress("glGetObjectPtrLabel");
		FramebufferParameteri = provider.getFunctionAddress("glFramebufferParameteri");
		GetFramebufferParameteriv = provider.getFunctionAddress("glGetFramebufferParameteriv");
		GetInternalformati64v = provider.getFunctionAddress("glGetInternalformati64v");
		InvalidateTexSubImage = provider.getFunctionAddress("glInvalidateTexSubImage");
		InvalidateTexImage = provider.getFunctionAddress("glInvalidateTexImage");
		InvalidateBufferSubData = provider.getFunctionAddress("glInvalidateBufferSubData");
		InvalidateBufferData = provider.getFunctionAddress("glInvalidateBufferData");
		InvalidateFramebuffer = provider.getFunctionAddress("glInvalidateFramebuffer");
		InvalidateSubFramebuffer = provider.getFunctionAddress("glInvalidateSubFramebuffer");
		MultiDrawArraysIndirect = provider.getFunctionAddress("glMultiDrawArraysIndirect");
		MultiDrawElementsIndirect = provider.getFunctionAddress("glMultiDrawElementsIndirect");
		GetProgramInterfaceiv = provider.getFunctionAddress("glGetProgramInterfaceiv");
		GetProgramResourceIndex = provider.getFunctionAddress("glGetProgramResourceIndex");
		GetProgramResourceName = provider.getFunctionAddress("glGetProgramResourceName");
		GetProgramResourceiv = provider.getFunctionAddress("glGetProgramResourceiv");
		GetProgramResourceLocation = provider.getFunctionAddress("glGetProgramResourceLocation");
		GetProgramResourceLocationIndex = provider.getFunctionAddress("glGetProgramResourceLocationIndex");
		ShaderStorageBlockBinding = provider.getFunctionAddress("glShaderStorageBlockBinding");
		TexBufferRange = provider.getFunctionAddress("glTexBufferRange");
		TexStorage2DMultisample = provider.getFunctionAddress("glTexStorage2DMultisample");
		TexStorage3DMultisample = provider.getFunctionAddress("glTexStorage3DMultisample");
		TextureView = provider.getFunctionAddress("glTextureView");
		BindVertexBuffer = provider.getFunctionAddress("glBindVertexBuffer");
		VertexAttribFormat = provider.getFunctionAddress("glVertexAttribFormat");
		VertexAttribIFormat = provider.getFunctionAddress("glVertexAttribIFormat");
		VertexAttribLFormat = provider.getFunctionAddress("glVertexAttribLFormat");
		VertexAttribBinding = provider.getFunctionAddress("glVertexAttribBinding");
		VertexBindingDivisor = provider.getFunctionAddress("glVertexBindingDivisor");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL43} instance for the current context. */
	public static GL43 getInstance() {
		return GL.getCapabilities().__GL43;
	}

	static GL43 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL43") ) return null;

		GL43 funcs = new GL43(provider);

		boolean supported = checkFunctions(
			funcs.ClearBufferData, funcs.ClearBufferSubData, funcs.DispatchCompute, funcs.DispatchComputeIndirect, funcs.CopyImageSubData, 
			funcs.DebugMessageControl, funcs.DebugMessageInsert, funcs.DebugMessageCallback, funcs.GetDebugMessageLog, funcs.PushDebugGroup, funcs.ObjectLabel, 
			funcs.GetObjectLabel, funcs.ObjectPtrLabel, funcs.GetObjectPtrLabel, funcs.FramebufferParameteri, funcs.GetFramebufferParameteriv, 
			funcs.GetInternalformati64v, funcs.InvalidateTexSubImage, funcs.InvalidateTexImage, funcs.InvalidateBufferSubData, funcs.InvalidateBufferData, 
			funcs.InvalidateFramebuffer, funcs.InvalidateSubFramebuffer, funcs.MultiDrawArraysIndirect, funcs.MultiDrawElementsIndirect, 
			funcs.GetProgramInterfaceiv, funcs.GetProgramResourceIndex, funcs.GetProgramResourceName, funcs.GetProgramResourceiv, 
			funcs.GetProgramResourceLocation, funcs.GetProgramResourceLocationIndex, funcs.ShaderStorageBlockBinding, funcs.TexBufferRange, 
			funcs.TexStorage2DMultisample, funcs.TexStorage3DMultisample, funcs.TextureView, funcs.BindVertexBuffer, funcs.VertexAttribFormat, 
			funcs.VertexAttribIFormat, funcs.VertexAttribLFormat, funcs.VertexAttribBinding, funcs.VertexBindingDivisor
		);

		return GL.checkExtension("OpenGL43", funcs, supported);
	}

	// --- [ glClearBufferData ] ---

	/** JNI method for {@link #glClearBufferData ClearBufferData} */
	@JavadocExclude
	public static native void nglClearBufferData(int target, int internalformat, int format, int type, long data, long __functionAddress);

	/** Unsafe version of {@link #glClearBufferData ClearBufferData} */
	@JavadocExclude
	public static void nglClearBufferData(int target, int internalformat, int format, int type, long data) {
		long __functionAddress = getInstance().ClearBufferData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClearBufferData(target, internalformat, format, type, data, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glClearBufferData.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Fills a buffer object's data store with a fixed value.
	 *
	 * @param target         the target of the operation. One of:<p/>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<p/>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param data           a memory location storing the data to be replicated into the buffer's data store
	 */
	public static void glClearBufferData(int target, int internalformat, int format, int type, ByteBuffer data) {
		nglClearBufferData(target, internalformat, format, type, memAddress(data));
	}

	/** ShortBuffer version of: {@link #glClearBufferData ClearBufferData} */
	public static void glClearBufferData(int target, int internalformat, int format, int type, ShortBuffer data) {
		nglClearBufferData(target, internalformat, format, type, memAddress(data));
	}

	/** IntBuffer version of: {@link #glClearBufferData ClearBufferData} */
	public static void glClearBufferData(int target, int internalformat, int format, int type, IntBuffer data) {
		nglClearBufferData(target, internalformat, format, type, memAddress(data));
	}

	/** FloatBuffer version of: {@link #glClearBufferData ClearBufferData} */
	public static void glClearBufferData(int target, int internalformat, int format, int type, FloatBuffer data) {
		nglClearBufferData(target, internalformat, format, type, memAddress(data));
	}

	// --- [ glClearBufferSubData ] ---

	/** JNI method for {@link #glClearBufferSubData ClearBufferSubData} */
	@JavadocExclude
	public static native void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data, long __functionAddress);

	/** Unsafe version of {@link #glClearBufferSubData ClearBufferSubData} */
	@JavadocExclude
	public static void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data) {
		long __functionAddress = getInstance().ClearBufferSubData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClearBufferSubData(target, internalformat, offset, size, format, type, data, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glClearBufferSubData.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Fills all or part of buffer object's data store with a fixed value.
	 *
	 * @param target         the target of the operation. One of:<p/>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param offset         the offset, in basic machine units into the buffer object's data store at which to start filling
	 * @param size           the size, in basic machine units of the range of the data store to fill
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<p/>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param data           a memory location storing the data to be replicated into the buffer's data store
	 */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, ByteBuffer data) {
		nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddress(data));
	}

	/** ShortBuffer version of: {@link #glClearBufferSubData ClearBufferSubData} */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, ShortBuffer data) {
		nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddress(data));
	}

	/** IntBuffer version of: {@link #glClearBufferSubData ClearBufferSubData} */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, IntBuffer data) {
		nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddress(data));
	}

	/** FloatBuffer version of: {@link #glClearBufferSubData ClearBufferSubData} */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, FloatBuffer data) {
		nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddress(data));
	}

	// --- [ glDispatchCompute ] ---

	/** JNI method for {@link #glDispatchCompute DispatchCompute} */
	@JavadocExclude
	public static native void nglDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDispatchCompute.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Launches one or more compute work groups.
	 *
	 * @param num_groups_x the number of work groups to be launched in the X dimension
	 * @param num_groups_y the number of work groups to be launched in the Y dimension
	 * @param num_groups_z the number of work groups to be launched in the Z dimension
	 */
	public static void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
		long __functionAddress = getInstance().DispatchCompute;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDispatchCompute(num_groups_x, num_groups_y, num_groups_z, __functionAddress);
	}

	// --- [ glDispatchComputeIndirect ] ---

	/** JNI method for {@link #glDispatchComputeIndirect DispatchComputeIndirect} */
	@JavadocExclude
	public static native void nglDispatchComputeIndirect(long indirect, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDispatchComputeIndirect.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Launches one or more compute work groups using parameters stored in a buffer.
	 * <p/>
	 * The parameters addressed by indirect are packed a structure, which takes the form (in C):
	 * <pre><code>
	 * typedef struct {
	 * 	uint num_groups_x;
	 * 	uint num_groups_y;
	 * 	uint num_groups_z;
	 * } DispatchIndirectCommand;</code></pre>
	 * <p/>
	 * A call to {@code glDispatchComputeIndirect} is equivalent, assuming no errors are generated, to:
	 * <pre><code>
	 * cmd = (const DispatchIndirectCommand *)indirect;
	 * glDispatchCompute(cmd->num_groups_x, cmd->num_groups_y, cmd->num_groups_z);</code></pre>
	 *
	 * @param indirect the offset into the buffer object currently bound to the {@link #GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER} buffer target at which the dispatch parameters are
	 *                 stored.
	 */
	public static void glDispatchComputeIndirect(long indirect) {
		long __functionAddress = getInstance().DispatchComputeIndirect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL43.GL_DISPATCH_INDIRECT_BUFFER_BINDING, true);
		}
		nglDispatchComputeIndirect(indirect, __functionAddress);
	}

	// --- [ glCopyImageSubData ] ---

	/** JNI method for {@link #glCopyImageSubData CopyImageSubData} */
	@JavadocExclude
	public static native void nglCopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCopyImageSubData.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Performs a raw data copy between two images.
	 *
	 * @param srcName   the name of a texture or renderbuffer object from which to copy
	 * @param srcTarget the target representing the namespace of the source name {@code srcName}
	 * @param srcLevel  the mipmap level to read from the source
	 * @param srcX      the X coordinate of the left edge of the souce region to copy
	 * @param srcY      the Y coordinate of the top edge of the souce region to copy
	 * @param srcZ      the Z coordinate of the near edge of the souce region to copy
	 * @param dstName   the name of a texture or renderbuffer object to which to copy
	 * @param dstTarget the target representing the namespace of the destination name {@code dstName}
	 * @param dstLevel  the mipmap level to write to the source
	 * @param dstX      the X coordinate of the left edge of the destination region
	 * @param dstY      the Y coordinate of the top edge of the destination region
	 * @param dstZ      the Z coordinate of the near edge of the destination region
	 * @param srcWidth  the width of the region to be copied
	 * @param srcHeight the height of the region to be copied
	 * @param srcDepth  the depth of the region to be copied
	 */
	public static void glCopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
		long __functionAddress = getInstance().CopyImageSubData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth, __functionAddress);
	}

	// --- [ glDebugMessageControl ] ---

	/** JNI method for {@link #glDebugMessageControl DebugMessageControl} */
	@JavadocExclude
	public static native void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled, long __functionAddress);

	/** Unsafe version of {@link #glDebugMessageControl DebugMessageControl} */
	@JavadocExclude
	public static void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled) {
		long __functionAddress = getInstance().DebugMessageControl;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDebugMessageControl(source, type, severity, count, ids, enabled, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDebugMessageControl.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Controls the reporting of debug messages in a debug context.
	 *
	 * @param source   the source of debug messages to enable or disable. One of:<p/>{@link #GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}, {@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}, {@link #GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}, {@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}, {@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}, {@link #GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}
	 * @param type     the type of debug messages to enable or disable. One of:<p/>{@link #GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}, {@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}, {@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}, {@link #GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}, {@link #GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}, {@link #GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}, {@link #GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}
	 * @param severity the severity of debug messages to enable or disable. One of:<p/>{@link #GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}, {@link #GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}, {@link #GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}, {@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}
	 * @param count    the length of the array {@code ids}
	 * @param ids      an array of unsigned integers containing the ids of the messages to enable or disable
	 * @param enabled  whether the selected messages should be enabled or disabled
	 */
	public static void glDebugMessageControl(int source, int type, int severity, int count, ByteBuffer ids, boolean enabled) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, count << 2);
		nglDebugMessageControl(source, type, severity, count, memAddress(ids), enabled);
	}

	/** Alternative version of: {@link #glDebugMessageControl DebugMessageControl} */
	public static void glDebugMessageControl(int source, int type, int severity, IntBuffer ids, boolean enabled) {
		nglDebugMessageControl(source, type, severity, ids.remaining(), memAddress(ids), enabled);
	}

	/** Single value version of: {@link #glDebugMessageControl DebugMessageControl} */
	public static void glDebugMessageControl(int source, int type, int severity, int id, boolean enabled) {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam(id);
		nglDebugMessageControl(source, type, severity, 1, __buffer.address() + ids, enabled);
	}

	// --- [ glDebugMessageInsert ] ---

	/** JNI method for {@link #glDebugMessageInsert DebugMessageInsert} */
	@JavadocExclude
	public static native void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message, long __functionAddress);

	/** Unsafe version of {@link #glDebugMessageInsert DebugMessageInsert} */
	@JavadocExclude
	public static void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message) {
		long __functionAddress = getInstance().DebugMessageInsert;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDebugMessageInsert(source, type, id, severity, length, message, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDebugMessageInsert.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Injects an application-supplied message into the debug message queue.
	 *
	 * @param source   the source of the debug message to insert. One of:<p/>{@link #GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}, {@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}, {@link #GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}, {@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}, {@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}, {@link #GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}
	 * @param type     the type of the debug message insert. One of:<p/>{@link #GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}, {@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}, {@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}, {@link #GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}, {@link #GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}, {@link #GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}, {@link #GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}
	 * @param id       the user-supplied identifier of the message to insert. One of:<p/>{@link #GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}, {@link #GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}, {@link #GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}, {@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}
	 * @param severity the severity of the debug messages to insert
	 * @param length   the length of the string contained in the character array whose address is given by {@code message}
	 * @param message  a character array containing the message to insert
	 */
	public static void glDebugMessageInsert(int source, int type, int id, int severity, int length, ByteBuffer message) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(message, length);
			checkNT1(message);
		}
		nglDebugMessageInsert(source, type, id, severity, length, memAddress(message));
	}

	/** Alternative version of: {@link #glDebugMessageInsert DebugMessageInsert} */
	public static void glDebugMessageInsert(int source, int type, int id, int severity, ByteBuffer message) {
		nglDebugMessageInsert(source, type, id, severity, message.remaining(), memAddress(message));
	}

	/** CharSequence version of: {@link #glDebugMessageInsert DebugMessageInsert} */
	public static void glDebugMessageInsert(int source, int type, int id, int severity, CharSequence message) {
		nglDebugMessageInsert(source, type, id, severity, message.length(), memAddress(memEncodeUTF8(message)));
	}

	// --- [ glDebugMessageCallback ] ---

	/** JNI method for {@link #glDebugMessageCallback DebugMessageCallback} */
	@JavadocExclude
	public static native void nglDebugMessageCallback(long callback, long userParam, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDebugMessageCallback.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies a callback to receive debugging messages from the GL.
	 *
	 * @param callback  a callback function that will be called when a debug message is generated
	 * @param userParam a user supplied pointer that will be passed on each invocation of {@code callback}
	 */
	public static void glDebugMessageCallback(long callback, long userParam) {
		GL43 __instance = getInstance();
		long __functionAddress = __instance.DebugMessageCallback;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDebugMessageCallback(callback, userParam, __functionAddress);
	}

	/** Alternative version of: {@link #glDebugMessageCallback DebugMessageCallback} */
	public static void glDebugMessageCallback(DEBUGPROC callback) {
		GL43 __instance = getInstance();
		long __functionAddress = __instance.DebugMessageCallback;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDebugMessageCallback(callback == null ? NULL : DEBUGPROC.Util.CALLBACK, DEBUGPROC.Util.register(__instance, callback), __functionAddress);
	}

	// --- [ glGetDebugMessageLog ] ---

	/** JNI method for {@link #glGetDebugMessageLog GetDebugMessageLog} */
	@JavadocExclude
	public static native int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog, long __functionAddress);

	/** Unsafe version of {@link #glGetDebugMessageLog GetDebugMessageLog} */
	@JavadocExclude
	public static int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog) {
		long __functionAddress = getInstance().GetDebugMessageLog;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetDebugMessageLog.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves messages from the debug message log.
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
	public static int glGetDebugMessageLog(int count, int bufsize, ByteBuffer sources, ByteBuffer types, ByteBuffer ids, ByteBuffer severities, ByteBuffer lengths, ByteBuffer messageLog) {
		if ( LWJGLUtil.CHECKS ) {
			if ( messageLog != null ) checkBuffer(messageLog, bufsize);
			if ( sources != null ) checkBuffer(sources, count << 2);
			if ( types != null ) checkBuffer(types, count << 2);
			if ( ids != null ) checkBuffer(ids, count << 2);
			if ( severities != null ) checkBuffer(severities, count << 2);
			if ( lengths != null ) checkBuffer(lengths, count << 2);
		}
		return nglGetDebugMessageLog(count, bufsize, memAddressSafe(sources), memAddressSafe(types), memAddressSafe(ids), memAddressSafe(severities), memAddressSafe(lengths), memAddressSafe(messageLog));
	}

	/** Alternative version of: {@link #glGetDebugMessageLog GetDebugMessageLog} */
	public static int glGetDebugMessageLog(int count, IntBuffer sources, IntBuffer types, IntBuffer ids, IntBuffer severities, IntBuffer lengths, ByteBuffer messageLog) {
		if ( LWJGLUtil.CHECKS ) {
			if ( sources != null ) checkBuffer(sources, count);
			if ( types != null ) checkBuffer(types, count);
			if ( ids != null ) checkBuffer(ids, count);
			if ( severities != null ) checkBuffer(severities, count);
			if ( lengths != null ) checkBuffer(lengths, count);
		}
		return nglGetDebugMessageLog(count, messageLog == null ? 0 : messageLog.remaining(), memAddressSafe(sources), memAddressSafe(types), memAddressSafe(ids), memAddressSafe(severities), memAddressSafe(lengths), memAddressSafe(messageLog));
	}

	/** CharSequence version of: {@link #glGetDebugMessageLog GetDebugMessageLog} */
	public static int glGetDebugMessageLog(int count, IntBuffer sources, IntBuffer types, IntBuffer ids, IntBuffer severities, IntBuffer lengths, CharSequence messageLog) {
		if ( LWJGLUtil.CHECKS ) {
			if ( sources != null ) checkBuffer(sources, count);
			if ( types != null ) checkBuffer(types, count);
			if ( ids != null ) checkBuffer(ids, count);
			if ( severities != null ) checkBuffer(severities, count);
			if ( lengths != null ) checkBuffer(lengths, count);
		}
		return nglGetDebugMessageLog(count, messageLog == null ? 0 : messageLog.length(), memAddressSafe(sources), memAddressSafe(types), memAddressSafe(ids), memAddressSafe(severities), memAddressSafe(lengths), memAddressSafe(memEncodeUTF8(messageLog)));
	}

	// --- [ glPushDebugGroup ] ---

	/** JNI method for {@link #glPushDebugGroup PushDebugGroup} */
	@JavadocExclude
	public static native void nglPushDebugGroup(int source, int id, int length, long message, long __functionAddress);

	/** Unsafe version of {@link #glPushDebugGroup PushDebugGroup} */
	@JavadocExclude
	public static void nglPushDebugGroup(int source, int id, int length, long message) {
		long __functionAddress = getInstance().PushDebugGroup;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPushDebugGroup(source, id, length, message, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glPushDebugGroup.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pushes a named debug group into the command stream.
	 *
	 * @param source  the source of the debug message. One of:<p/>{@link #GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}, {@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}, {@link #GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}, {@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}, {@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}, {@link #GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}
	 * @param id      the identifier of the message
	 * @param length  the length of the message to be sent to the debug output stream
	 * @param message a string containing the message to be sent to the debug output stream
	 */
	public static void glPushDebugGroup(int source, int id, int length, ByteBuffer message) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(message, length);
			checkNT1(message);
		}
		nglPushDebugGroup(source, id, length, memAddress(message));
	}

	/** Alternative version of: {@link #glPushDebugGroup PushDebugGroup} */
	public static void glPushDebugGroup(int source, int id, ByteBuffer message) {
		nglPushDebugGroup(source, id, message.remaining(), memAddress(message));
	}

	/** CharSequence version of: {@link #glPushDebugGroup PushDebugGroup} */
	public static void glPushDebugGroup(int source, int id, CharSequence message) {
		nglPushDebugGroup(source, id, message.length(), memAddress(memEncodeUTF8(message)));
	}

	// --- [ glObjectLabel ] ---

	/** JNI method for {@link #glObjectLabel ObjectLabel} */
	@JavadocExclude
	public static native void nglObjectLabel(int identifier, int name, int length, long label, long __functionAddress);

	/** Unsafe version of {@link #glObjectLabel ObjectLabel} */
	@JavadocExclude
	public static void nglObjectLabel(int identifier, int name, int length, long label) {
		long __functionAddress = getInstance().ObjectLabel;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglObjectLabel(identifier, name, length, label, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glObjectLabel.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Labels a named object identified within a namespace.
	 *
	 * @param identifier the namespace from which the name of the object is allocated. One of:<p/>{@link #GL_BUFFER BUFFER}, {@link #GL_SHADER SHADER}, {@link #GL_PROGRAM PROGRAM}, {@link #GL_QUERY QUERY}, {@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}, {@link #GL_SAMPLER SAMPLER}, {@link #GL_DISPLAY_LIST DISPLAY_LIST}, {@link GL11#GL_VERTEX_ARRAY VERTEX_ARRAY}, {@link GL11#GL_TEXTURE TEXTURE}, {@link GL30#GL_RENDERBUFFER RENDERBUFFER}, {@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}, {@link GL40#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}
	 * @param name       the name of the object to label
	 * @param length     the length of the label to be used for the object
	 * @param label      a string containing the label to assign to the object
	 */
	public static void glObjectLabel(int identifier, int name, int length, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(label, length);
			checkNT1(label);
		}
		nglObjectLabel(identifier, name, length, memAddress(label));
	}

	/** Alternative version of: {@link #glObjectLabel ObjectLabel} */
	public static void glObjectLabel(int identifier, int name, ByteBuffer label) {
		nglObjectLabel(identifier, name, label.remaining(), memAddress(label));
	}

	/** CharSequence version of: {@link #glObjectLabel ObjectLabel} */
	public static void glObjectLabel(int identifier, int name, CharSequence label) {
		nglObjectLabel(identifier, name, label.length(), memAddress(memEncodeUTF8(label)));
	}

	// --- [ glGetObjectLabel ] ---

	/** JNI method for {@link #glGetObjectLabel GetObjectLabel} */
	@JavadocExclude
	public static native void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label, long __functionAddress);

	/** Unsafe version of {@link #glGetObjectLabel GetObjectLabel} */
	@JavadocExclude
	public static void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label) {
		long __functionAddress = getInstance().GetObjectLabel;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetObjectLabel(identifier, name, bufSize, length, label, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetObjectLabel.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves the label of a named object identified within a namespace.
	 *
	 * @param identifier the namespace from which the name of the object is allocated. One of:<p/>{@link #GL_BUFFER BUFFER}, {@link #GL_SHADER SHADER}, {@link #GL_PROGRAM PROGRAM}, {@link #GL_QUERY QUERY}, {@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}, {@link #GL_SAMPLER SAMPLER}, {@link #GL_DISPLAY_LIST DISPLAY_LIST}, {@link GL11#GL_VERTEX_ARRAY VERTEX_ARRAY}, {@link GL11#GL_TEXTURE TEXTURE}, {@link GL30#GL_RENDERBUFFER RENDERBUFFER}, {@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}, {@link GL40#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}
	 * @param name       the name of the object whose label to retrieve
	 * @param bufSize    the length of the buffer whose address is in {@code label}
	 * @param length     the address of a variable to receive the length of the object label
	 * @param label      a string that will receive the object label
	 */
	public static void glGetObjectLabel(int identifier, int name, int bufSize, ByteBuffer length, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(label, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetObjectLabel(identifier, name, bufSize, memAddressSafe(length), memAddress(label));
	}

	/** Alternative version of: {@link #glGetObjectLabel GetObjectLabel} */
	public static void glGetObjectLabel(int identifier, int name, IntBuffer length, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetObjectLabel(identifier, name, label.remaining(), memAddressSafe(length), memAddress(label));
	}

	/** String return version of: {@link #glGetObjectLabel GetObjectLabel} */
	public static String glGetObjectLabel(int identifier, int name, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int label = __buffer.bufferParam(bufSize);
		nglGetObjectLabel(identifier, name, bufSize, __buffer.address() + length, __buffer.address() + label);
		return memDecodeUTF8(memByteBuffer(__buffer.address() + label, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetObjectLabel GetObjectLabel} */
	public static String glGetObjectLabel(int identifier, int name) {
		int bufSize = GL11.glGetInteger(GL_MAX_LABEL_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int label = __buffer.bufferParam(bufSize);
		nglGetObjectLabel(identifier, name, bufSize, __buffer.address() + length, __buffer.address() + label);
		return memDecodeUTF8(memByteBuffer(__buffer.address() + label, __buffer.intValue(length)));
	}

	// --- [ glObjectPtrLabel ] ---

	/** JNI method for {@link #glObjectPtrLabel ObjectPtrLabel} */
	@JavadocExclude
	public static native void nglObjectPtrLabel(long ptr, int length, long label, long __functionAddress);

	/** Unsafe version of {@link #glObjectPtrLabel ObjectPtrLabel} */
	@JavadocExclude
	public static void nglObjectPtrLabel(long ptr, int length, long label) {
		long __functionAddress = getInstance().ObjectPtrLabel;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglObjectPtrLabel(ptr, length, label, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glObjectPtrLabel.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Labels a sync object identified by a pointer.
	 *
	 * @param ptr    a pointer identifying a sync object
	 * @param length the length of the label to be used for the object
	 * @param label  a string containing the label to assign to the object
	 */
	public static void glObjectPtrLabel(long ptr, int length, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(ptr);
			checkBuffer(label, length);
			checkNT1(label);
		}
		nglObjectPtrLabel(ptr, length, memAddress(label));
	}

	/** Alternative version of: {@link #glObjectPtrLabel ObjectPtrLabel} */
	public static void glObjectPtrLabel(long ptr, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(ptr);
		nglObjectPtrLabel(ptr, label.remaining(), memAddress(label));
	}

	/** CharSequence version of: {@link #glObjectPtrLabel ObjectPtrLabel} */
	public static void glObjectPtrLabel(long ptr, CharSequence label) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(ptr);
		nglObjectPtrLabel(ptr, label.length(), memAddress(memEncodeUTF8(label)));
	}

	// --- [ glGetObjectPtrLabel ] ---

	/** JNI method for {@link #glGetObjectPtrLabel GetObjectPtrLabel} */
	@JavadocExclude
	public static native void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label, long __functionAddress);

	/** Unsafe version of {@link #glGetObjectPtrLabel GetObjectPtrLabel} */
	@JavadocExclude
	public static void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label) {
		long __functionAddress = getInstance().GetObjectPtrLabel;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetObjectPtrLabel(ptr, bufSize, length, label, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetObjectPtrLabel.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves the label of a sync object identified by a pointer.
	 *
	 * @param ptr     the name of the sync object whose label to retrieve
	 * @param bufSize the length of the buffer whose address is in {@code label}
	 * @param length  a variable to receive the length of the object label
	 * @param label   a string that will receive the object label
	 */
	public static void glGetObjectPtrLabel(long ptr, int bufSize, ByteBuffer length, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(ptr);
			checkBuffer(label, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetObjectPtrLabel(ptr, bufSize, memAddressSafe(length), memAddress(label));
	}

	/** Alternative version of: {@link #glGetObjectPtrLabel GetObjectPtrLabel} */
	public static void glGetObjectPtrLabel(long ptr, IntBuffer length, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(ptr);
			if ( length != null ) checkBuffer(length, 1);
		}
		nglGetObjectPtrLabel(ptr, label.remaining(), memAddressSafe(length), memAddress(label));
	}

	/** String return version of: {@link #glGetObjectPtrLabel GetObjectPtrLabel} */
	public static String glGetObjectPtrLabel(long ptr, int bufSize) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(ptr);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int label = __buffer.bufferParam(bufSize);
		nglGetObjectPtrLabel(ptr, bufSize, __buffer.address() + length, __buffer.address() + label);
		return memDecodeUTF8(memByteBuffer(__buffer.address() + label, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetObjectPtrLabel GetObjectPtrLabel} */
	public static String glGetObjectPtrLabel(long ptr) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(ptr);
		int bufSize = GL11.glGetInteger(GL_MAX_LABEL_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int label = __buffer.bufferParam(bufSize);
		nglGetObjectPtrLabel(ptr, bufSize, __buffer.address() + length, __buffer.address() + label);
		return memDecodeUTF8(memByteBuffer(__buffer.address() + label, __buffer.intValue(length)));
	}

	// --- [ glFramebufferParameteri ] ---

	/** JNI method for {@link #glFramebufferParameteri FramebufferParameteri} */
	@JavadocExclude
	public static native void nglFramebufferParameteri(int target, int pname, int param, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glFramebufferParameteri.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets a named parameter of a framebuffer.
	 *
	 * @param target target of the operation. One of:<p/>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}, {@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}
	 * @param pname  a token indicating the parameter to be modified. One of:<p/>{@link #GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}, {@link #GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}, {@link #GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}, {@link #GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}, {@link #GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}
	 * @param param  the new value for the parameter named {@code pname}
	 */
	public static void glFramebufferParameteri(int target, int pname, int param) {
		long __functionAddress = getInstance().FramebufferParameteri;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFramebufferParameteri(target, pname, param, __functionAddress);
	}

	// --- [ glGetFramebufferParameteriv ] ---

	/** JNI method for {@link #glGetFramebufferParameteri(int, int, ByteBuffer) glGetFramebufferParameteri} */
	@JavadocExclude
	public static native void nglGetFramebufferParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetFramebufferParameteri(int, int, ByteBuffer) glGetFramebufferParameteri} */
	@JavadocExclude
	public static void nglGetFramebufferParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetFramebufferParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetFramebufferParameteriv(target, pname, params, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetFramebufferParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves a named parameter from a framebuffer.
	 *
	 * @param target target of the operation. One of:<p/>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}, {@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}
	 * @param pname  a token indicating the parameter to be retrieved. One of:<p/>{@link #GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}, {@link #GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}, {@link #GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}, {@link #GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}, {@link #GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}
	 * @param params a variable to receive the value of the parameter named {@code pname}
	 */
	public static void glGetFramebufferParameteri(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetFramebufferParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetFramebufferParameteri(int, int, ByteBuffer) glGetFramebufferParameteri} */
	public static void glGetFramebufferParameter(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetFramebufferParameteriv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetFramebufferParameteri(int, int, ByteBuffer) glGetFramebufferParameteri} */
	public static int glGetFramebufferParameteri(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetFramebufferParameteriv(target, pname, __buffer.address() + params);
		return __buffer.intValue(params);
	}

	// --- [ glGetInternalformati64v ] ---

	/** JNI method for {@link #glGetInternalformati64(int, int, int, int, ByteBuffer) glGetInternalformati64} */
	@JavadocExclude
	public static native void nglGetInternalformati64v(int target, int internalformat, int pname, int bufSize, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetInternalformati64(int, int, int, int, ByteBuffer) glGetInternalformati64} */
	@JavadocExclude
	public static void nglGetInternalformati64v(int target, int internalformat, int pname, int bufSize, long params) {
		long __functionAddress = getInstance().GetInternalformati64v;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetInternalformati64v(target, internalformat, pname, bufSize, params, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetInternalformat.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves information about implementation-dependent support for internal formats.
	 *
	 * @param target         the usage of the internal format. One of:<p/>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL30#GL_RENDERBUFFER RENDERBUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param internalformat the internal format about which to retrieve information
	 * @param pname          the type of information to query
	 * @param bufSize        the maximum number of values that may be written to params by the function
	 * @param params         a variable into which to write the retrieved information
	 */
	public static void glGetInternalformati64(int target, int internalformat, int pname, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 3);
		nglGetInternalformati64v(target, internalformat, pname, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetInternalformati64(int, int, int, int, ByteBuffer) glGetInternalformati64} */
	public static void glGetInternalformat(int target, int internalformat, int pname, LongBuffer params) {
		nglGetInternalformati64v(target, internalformat, pname, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetInternalformati64(int, int, int, int, ByteBuffer) glGetInternalformati64} */
	public static long glGetInternalformati64(int target, int internalformat, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetInternalformati64v(target, internalformat, pname, 1, __buffer.address() + params);
		return __buffer.longValue(params);
	}

	// --- [ glInvalidateTexSubImage ] ---

	/** JNI method for {@link #glInvalidateTexSubImage InvalidateTexSubImage} */
	@JavadocExclude
	public static native void nglInvalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glInvalidateTexSubImage.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Invalidates a region of a texture image.
	 *
	 * @param texture the name of a texture object a subregion of which to invalidate
	 * @param level   the level of detail of the texture object within which the region resides
	 * @param xoffset the X offset of the region to be invalidated
	 * @param yoffset the Y offset of the region to be invalidated
	 * @param zoffset the Z offset of the region to be invalidated
	 * @param width   the width of the region to be invalidated
	 * @param height  the height of the region to be invalidated
	 * @param depth   the depth of the region to be invalidated
	 */
	public static void glInvalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth) {
		long __functionAddress = getInstance().InvalidateTexSubImage;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, __functionAddress);
	}

	// --- [ glInvalidateTexImage ] ---

	/** JNI method for {@link #glInvalidateTexImage InvalidateTexImage} */
	@JavadocExclude
	public static native void nglInvalidateTexImage(int texture, int level, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glInvalidateTexImage.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Invalidates the entirety of a texture image.
	 *
	 * @param texture the name of a texture object to invalidate
	 * @param level   the level of detail of the texture object to invalidate
	 */
	public static void glInvalidateTexImage(int texture, int level) {
		long __functionAddress = getInstance().InvalidateTexImage;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglInvalidateTexImage(texture, level, __functionAddress);
	}

	// --- [ glInvalidateBufferSubData ] ---

	/** JNI method for {@link #glInvalidateBufferSubData InvalidateBufferSubData} */
	@JavadocExclude
	public static native void nglInvalidateBufferSubData(int buffer, long offset, long length, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glInvalidateBufferSubData.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Invalidates a region of a buffer object's data store.
	 *
	 * @param buffer the name of a buffer object, a subrange of whose data store to invalidate
	 * @param offset the offset within the buffer's data store of the start of the range to be invalidated
	 * @param length the length of the range within the buffer's data store to be invalidated
	 */
	public static void glInvalidateBufferSubData(int buffer, long offset, long length) {
		long __functionAddress = getInstance().InvalidateBufferSubData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglInvalidateBufferSubData(buffer, offset, length, __functionAddress);
	}

	// --- [ glInvalidateBufferData ] ---

	/** JNI method for {@link #glInvalidateBufferData InvalidateBufferData} */
	@JavadocExclude
	public static native void nglInvalidateBufferData(int buffer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glInvalidateBufferData.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Invalidates the content of a buffer object's data store.
	 *
	 * @param buffer the name of a buffer object whose data store to invalidate
	 */
	public static void glInvalidateBufferData(int buffer) {
		long __functionAddress = getInstance().InvalidateBufferData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglInvalidateBufferData(buffer, __functionAddress);
	}

	// --- [ glInvalidateFramebuffer ] ---

	/** JNI method for {@link #glInvalidateFramebuffer InvalidateFramebuffer} */
	@JavadocExclude
	public static native void nglInvalidateFramebuffer(int target, int numAttachments, long attachments, long __functionAddress);

	/** Unsafe version of {@link #glInvalidateFramebuffer InvalidateFramebuffer} */
	@JavadocExclude
	public static void nglInvalidateFramebuffer(int target, int numAttachments, long attachments) {
		long __functionAddress = getInstance().InvalidateFramebuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglInvalidateFramebuffer(target, numAttachments, attachments, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glInvalidateFramebuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Invalidate the content some or all of a framebuffer object's attachments.
	 *
	 * @param target         the target to which the framebuffer is attached. One of:<p/>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}, {@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}
	 * @param numAttachments the number of entries in the {@code attachments} array
	 * @param attachments    the address of an array identifying the attachments to be invalidated
	 */
	public static void glInvalidateFramebuffer(int target, int numAttachments, ByteBuffer attachments) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(attachments, numAttachments << 2);
		nglInvalidateFramebuffer(target, numAttachments, memAddress(attachments));
	}

	/** Alternative version of: {@link #glInvalidateFramebuffer InvalidateFramebuffer} */
	public static void glInvalidateFramebuffer(int target, IntBuffer attachments) {
		nglInvalidateFramebuffer(target, attachments.remaining(), memAddress(attachments));
	}

	/** Single value version of: {@link #glInvalidateFramebuffer InvalidateFramebuffer} */
	public static void glInvalidateFramebuffer(int target, int attachment) {
		APIBuffer __buffer = apiBuffer();
		int attachments = __buffer.intParam(attachment);
		nglInvalidateFramebuffer(target, 1, __buffer.address() + attachments);
	}

	// --- [ glInvalidateSubFramebuffer ] ---

	/** JNI method for {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer} */
	@JavadocExclude
	public static native void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height, long __functionAddress);

	/** Unsafe version of {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer} */
	@JavadocExclude
	public static void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height) {
		long __functionAddress = getInstance().InvalidateSubFramebuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glInvalidateSubFramebuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Invalidates the content of a region of some or all of a framebuffer object's attachments.
	 *
	 * @param target         the target to which the framebuffer is attached. One of:<p/>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}, {@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}
	 * @param numAttachments the number of entries in the {@code attachments} array
	 * @param attachments    an array identifying the attachments to be invalidated
	 * @param x              the X offset of the region to be invalidated
	 * @param y              the Y offset of the region to be invalidated
	 * @param width          the width of the region to be invalidated
	 * @param height         the height of the region to be invalidated
	 */
	public static void glInvalidateSubFramebuffer(int target, int numAttachments, ByteBuffer attachments, int x, int y, int width, int height) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(attachments, numAttachments << 2);
		nglInvalidateSubFramebuffer(target, numAttachments, memAddress(attachments), x, y, width, height);
	}

	/** Alternative version of: {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer} */
	public static void glInvalidateSubFramebuffer(int target, IntBuffer attachments, int x, int y, int width, int height) {
		nglInvalidateSubFramebuffer(target, attachments.remaining(), memAddress(attachments), x, y, width, height);
	}

	/** Single value version of: {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer} */
	public static void glInvalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height) {
		APIBuffer __buffer = apiBuffer();
		int attachments = __buffer.intParam(attachment);
		nglInvalidateSubFramebuffer(target, 1, __buffer.address() + attachments, x, y, width, height);
	}

	// --- [ glMultiDrawArraysIndirect ] ---

	/** JNI method for {@link #glMultiDrawArraysIndirect MultiDrawArraysIndirect} */
	@JavadocExclude
	public static native void nglMultiDrawArraysIndirect(int mode, long indirect, int primcount, int stride, long __functionAddress);

	/** Unsafe version of {@link #glMultiDrawArraysIndirect MultiDrawArraysIndirect} */
	@JavadocExclude
	public static void nglMultiDrawArraysIndirect(int mode, long indirect, int primcount, int stride) {
		long __functionAddress = getInstance().MultiDrawArraysIndirect;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiDrawArraysIndirect(mode, indirect, primcount, stride, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glMultiDrawArraysIndirect.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Renders multiple sets of primitives from array data, taking parameters from memory.
	 * <p/>
	 * The parameters addressed by {@code indirect} are packed into an array of structures, each element of which takes the form (in C):
	 * <pre><code>
	 * typedef struct {
	 * 	uint count;
	 * 	uint primCount;
	 * 	uint first;
	 * 	uint baseInstance;
	 * } DrawArraysIndirectCommand;</code></pre>
	 * <p/>
	 * A single call to {@code glMultiDrawArraysIndirect} is equivalent, assuming no errors are generated to:
	 * <pre><code>
	 * const ubyte *ptr = (const ubyte *)indirect;
	 * for ( i = 0; i < primcount; i++ ) {
	 * 	DrawArraysIndirect(mode, (DrawArraysIndirectCommand*)ptr);
	 * 	if ( stride == 0 )
	 * 		ptr += sizeof(DrawArraysIndirectCommand);
	 * 	else
	 * 		ptr += stride;
	 * }</code></pre>
	 *
	 * @param mode      what kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param indirect  an array of structures containing the draw parameters
	 * @param primcount the number of elements in the array of draw parameter structures
	 * @param stride    the distance in basic machine units between elements of the draw parameter array
	 */
	public static void glMultiDrawArraysIndirect(int mode, ByteBuffer indirect, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indirect, primcount * (stride == 0 ? (4 * 4) : stride));
		nglMultiDrawArraysIndirect(mode, memAddress(indirect), primcount, stride);
	}

	// --- [ glMultiDrawElementsIndirect ] ---

	/** JNI method for {@link #glMultiDrawElementsIndirect MultiDrawElementsIndirect} */
	@JavadocExclude
	public static native void nglMultiDrawElementsIndirect(int mode, int type, long indirect, int primcount, int stride, long __functionAddress);

	/** Unsafe version of {@link #glMultiDrawElementsIndirect MultiDrawElementsIndirect} */
	@JavadocExclude
	public static void nglMultiDrawElementsIndirect(int mode, int type, long indirect, int primcount, int stride) {
		long __functionAddress = getInstance().MultiDrawElementsIndirect;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiDrawElementsIndirect(mode, type, indirect, primcount, stride, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glMultiDrawElementsIndirect.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Renders multiple indexed primitives from array data, taking parameters from memory.
	 * <p/>
	 * The parameters addressed by indirect are packed into a structure that takes the form (in C):
	 * <pre><code>
	 * typedef struct {
	 * 	uint count;
	 * 	uint primCount;
	 * 	uint firstIndex;
	 * 	uint baseVertex;
	 * 	uint baseInstance;
	 * } DrawElementsIndirectCommand;</code></pre>
	 * <p/>
	 * A single call to {@code glMultiDrawElementsIndirect} is equivalent, assuming no errors are generated to:
	 * <pre><code>
	 * const ubyte *ptr = (const ubyte *)indirect;
	 * for ( i = 0; i < primcount; i++ ) {
	 * 	DrawElementsIndirect(mode, type, (DrawElementsIndirectCommand *)ptr);
	 * 	if ( stride == 0 )
	 * 		ptr += sizeof(DrawElementsIndirectCommand);
	 * 	else
	 * 		ptr += stride;
	 * }</code></pre>
	 *
	 * @param mode      what kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param type      the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indirect  a structure containing an array of draw parameters
	 * @param primcount the number of elements in the array addressed by {@code indirect}
	 * @param stride    the distance in basic machine units between elements of the draw parameter array
	 */
	public static void glMultiDrawElementsIndirect(int mode, int type, ByteBuffer indirect, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indirect, primcount * (stride == 0 ? (5 * 4) : stride));
		nglMultiDrawElementsIndirect(mode, type, memAddress(indirect), primcount, stride);
	}

	// --- [ glGetProgramInterfaceiv ] ---

	/** JNI method for {@link #glGetProgramInterfacei(int, int, int, ByteBuffer) glGetProgramInterfacei} */
	@JavadocExclude
	public static native void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramInterfacei(int, int, int, ByteBuffer) glGetProgramInterfacei} */
	@JavadocExclude
	public static void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
		long __functionAddress = getInstance().GetProgramInterfaceiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetProgramInterfaceiv(program, programInterface, pname, params, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetProgramInterface.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries a property of an interface in a program.
	 *
	 * @param program          the name of a program object whose interface to query
	 * @param programInterface a token identifying the interface within {@code program} to query. One of:<p/>{@link #GL_UNIFORM UNIFORM}, {@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}, {@link #GL_PROGRAM_INPUT PROGRAM_INPUT}, {@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}, {@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}, {@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}, {@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}, {@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}, {@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}, {@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}, {@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}, {@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}, {@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}, {@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}, {@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}, {@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}, {@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}, {@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}, {@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}
	 * @param pname            the name of the parameter within {@code programInterface} to query. One of:<p/>{@link #GL_ACTIVE_RESOURCES ACTIVE_RESOURCES}, {@link #GL_MAX_NAME_LENGTH MAX_NAME_LENGTH}, {@link #GL_MAX_NUM_ACTIVE_VARIABLES MAX_NUM_ACTIVE_VARIABLES}, {@link #GL_MAX_NUM_COMPATIBLE_SUBROUTINES MAX_NUM_COMPATIBLE_SUBROUTINES}
	 * @param params           a variable to retrieve the value of {@code pname} for the program interface
	 */
	public static void glGetProgramInterfacei(int program, int programInterface, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetProgramInterfacei(int, int, int, ByteBuffer) glGetProgramInterfacei} */
	public static void glGetProgramInterface(int program, int programInterface, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetProgramInterfacei(int, int, int, ByteBuffer) glGetProgramInterfacei} */
	public static int glGetProgramInterfacei(int program, int programInterface, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetProgramInterfaceiv(program, programInterface, pname, __buffer.address() + params);
		return __buffer.intValue(params);
	}

	// --- [ glGetProgramResourceIndex ] ---

	/** JNI method for {@link #glGetProgramResourceIndex GetProgramResourceIndex} */
	@JavadocExclude
	public static native int nglGetProgramResourceIndex(int program, int programInterface, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourceIndex GetProgramResourceIndex} */
	@JavadocExclude
	public static int nglGetProgramResourceIndex(int program, int programInterface, long name) {
		long __functionAddress = getInstance().GetProgramResourceIndex;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGetProgramResourceIndex(program, programInterface, name, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetProgramResourceIndex.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries the index of a named resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {Wcode name}. One of:<p/>{@link #GL_UNIFORM UNIFORM}, {@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}, {@link #GL_PROGRAM_INPUT PROGRAM_INPUT}, {@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}, {@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}, {@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}, {@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}, {@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}, {@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}, {@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}, {@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}, {@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}, {@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}, {@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}, {@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}, {@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}, {@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}, {@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}, {@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}
	 * @param name             the name of the resource to query the index of
	 */
	public static int glGetProgramResourceIndex(int program, int programInterface, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetProgramResourceIndex(program, programInterface, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetProgramResourceIndex GetProgramResourceIndex} */
	public static int glGetProgramResourceIndex(int program, int programInterface, CharSequence name) {
		return nglGetProgramResourceIndex(program, programInterface, memAddress(memEncodeUTF8(name)));
	}

	// --- [ glGetProgramResourceName ] ---

	/** JNI method for {@link #glGetProgramResourceName GetProgramResourceName} */
	@JavadocExclude
	public static native void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourceName GetProgramResourceName} */
	@JavadocExclude
	public static void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
		long __functionAddress = getInstance().GetProgramResourceName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetProgramResourceName(program, programInterface, index, bufSize, length, name, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetProgramResourceName.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries the name of an indexed resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the indexed resource. One of:<p/>{@link #GL_UNIFORM UNIFORM}, {@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}, {@link #GL_PROGRAM_INPUT PROGRAM_INPUT}, {@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}, {@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}, {@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}, {@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}, {@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}, {@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}, {@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}, {@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}, {@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}, {@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}, {@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}, {@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}, {@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}, {@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}, {@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}, {@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}
	 * @param index            the index of the resource within {@code programInterface} of {@code program}
	 * @param bufSize          the size of the character array whose address is given by {@code name}
	 * @param length           a variable which will receive the length of the resource name
	 * @param name             a character array into which will be written the name of the resource
	 */
	public static void glGetProgramResourceName(int program, int programInterface, int index, int bufSize, ByteBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramResourceName(program, programInterface, index, bufSize, memAddressSafe(length), memAddress(name));
	}

	/** Alternative version of: {@link #glGetProgramResourceName GetProgramResourceName} */
	public static void glGetProgramResourceName(int program, int programInterface, int index, IntBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramResourceName(program, programInterface, index, name.remaining(), memAddressSafe(length), memAddress(name));
	}

	/** String return version of: {@link #glGetProgramResourceName GetProgramResourceName} */
	public static String glGetProgramResourceName(int program, int programInterface, int index, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetProgramResourceName(program, programInterface, index, bufSize, __buffer.address() + length, __buffer.address() + name);
		return memDecodeASCII(memByteBuffer(__buffer.address() + name, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetProgramResourceName GetProgramResourceName} */
	public static String glGetProgramResourceName(int program, int programInterface, int index) {
		int bufSize = glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetProgramResourceName(program, programInterface, index, bufSize, __buffer.address() + length, __buffer.address() + name);
		return memDecodeASCII(memByteBuffer(__buffer.address() + name, __buffer.intValue(length)));
	}

	// --- [ glGetProgramResourceiv ] ---

	/** JNI method for {@link #glGetProgramResourcei(int, int, int, int, ByteBuffer, int, ByteBuffer, ByteBuffer) glGetProgramResourcei} */
	@JavadocExclude
	public static native void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourcei(int, int, int, int, ByteBuffer, int, ByteBuffer, ByteBuffer) glGetProgramResourcei} */
	@JavadocExclude
	public static void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
		long __functionAddress = getInstance().GetProgramResourceiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetProgramResource.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves values for multiple properties of a single active resource within a program object.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. One of:<p/>{@link #GL_UNIFORM UNIFORM}, {@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}, {@link #GL_PROGRAM_INPUT PROGRAM_INPUT}, {@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}, {@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}, {@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}, {@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}, {@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}, {@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}, {@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}, {@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}, {@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}, {@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}, {@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}, {@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}, {@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}, {@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}, {@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}, {@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}
	 * @param index            the active resource index
	 * @param propCount        the number of properties in {@code props}
	 * @param props            an array that will receive the active resource properties
	 * @param bufSize          the size of the integer array whose address is given by {@code params}
	 * @param length           a variable which will receive the number of values returned
	 * @param params           an array that will receive the property values
	 */
	public static void glGetProgramResourcei(int program, int programInterface, int index, int propCount, ByteBuffer props, int bufSize, ByteBuffer length, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(props, propCount << 2);
			checkBuffer(params, bufSize << 2);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramResourceiv(program, programInterface, index, propCount, memAddress(props), bufSize, memAddressSafe(length), memAddress(params));
	}

	/** Alternative version of: {@link #glGetProgramResourcei(int, int, int, int, ByteBuffer, int, ByteBuffer, ByteBuffer) glGetProgramResourcei} */
	public static void glGetProgramResource(int program, int programInterface, int index, IntBuffer props, IntBuffer length, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramResourceiv(program, programInterface, index, props.remaining(), memAddress(props), params.remaining(), memAddressSafe(length), memAddress(params));
	}

	/** Buffer return version of: {@link #glGetProgramResourcei(int, int, int, int, ByteBuffer, int, ByteBuffer, ByteBuffer) glGetProgramResourcei} */
	public static ByteBuffer glGetProgramResourcei(int program, int programInterface, int index, IntBuffer props, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int params = __buffer.bufferParam(bufSize);
		nglGetProgramResourceiv(program, programInterface, index, props.remaining(), memAddress(props), bufSize, __buffer.address() + length, __buffer.address() + params);
		return memByteBuffer(__buffer.address() + params, __buffer.intValue(length));
	}

	// --- [ glGetProgramResourceLocation ] ---

	/** JNI method for {@link #glGetProgramResourceLocation GetProgramResourceLocation} */
	@JavadocExclude
	public static native int nglGetProgramResourceLocation(int program, int programInterface, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourceLocation GetProgramResourceLocation} */
	@JavadocExclude
	public static int nglGetProgramResourceLocation(int program, int programInterface, long name) {
		long __functionAddress = getInstance().GetProgramResourceLocation;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGetProgramResourceLocation(program, programInterface, name, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetProgramResourceLocation.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries the location of a named resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}
	 * @param name             the name of the resource to query the location of
	 */
	public static int glGetProgramResourceLocation(int program, int programInterface, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetProgramResourceLocation(program, programInterface, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetProgramResourceLocation GetProgramResourceLocation} */
	public static int glGetProgramResourceLocation(int program, int programInterface, CharSequence name) {
		return nglGetProgramResourceLocation(program, programInterface, memAddress(memEncodeASCII(name)));
	}

	// --- [ glGetProgramResourceLocationIndex ] ---

	/** JNI method for {@link #glGetProgramResourceLocationIndex GetProgramResourceLocationIndex} */
	@JavadocExclude
	public static native int nglGetProgramResourceLocationIndex(int program, int programInterface, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourceLocationIndex GetProgramResourceLocationIndex} */
	@JavadocExclude
	public static int nglGetProgramResourceLocationIndex(int program, int programInterface, long name) {
		long __functionAddress = getInstance().GetProgramResourceLocationIndex;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGetProgramResourceLocationIndex(program, programInterface, name, __functionAddress);
	}

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetProgramResourceLocationIndex.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries the fragment color index of a named variable within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. Must be:<p/>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}
	 * @param name             the name of the resource to query the location of
	 */
	public static int glGetProgramResourceLocationIndex(int program, int programInterface, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetProgramResourceLocationIndex(program, programInterface, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetProgramResourceLocationIndex GetProgramResourceLocationIndex} */
	public static int glGetProgramResourceLocationIndex(int program, int programInterface, CharSequence name) {
		return nglGetProgramResourceLocationIndex(program, programInterface, memAddress(memEncodeASCII(name)));
	}

	// --- [ glShaderStorageBlockBinding ] ---

	/** JNI method for {@link #glShaderStorageBlockBinding ShaderStorageBlockBinding} */
	@JavadocExclude
	public static native void nglShaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glShaderStorageBlockBinding.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Changes an active shader storage block binding.
	 *
	 * @param program             the name of the program containing the block whose binding to change
	 * @param storageBlockIndex   the index storage block within the program
	 * @param storageBlockBinding the index storage block binding to associate with the specified storage block
	 */
	public static void glShaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding) {
		long __functionAddress = getInstance().ShaderStorageBlockBinding;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding, __functionAddress);
	}

	// --- [ glTexBufferRange ] ---

	/** JNI method for {@link #glTexBufferRange TexBufferRange} */
	@JavadocExclude
	public static native void nglTexBufferRange(int target, int internalformat, int buffer, long offset, long size, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexBufferRange.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds a range of a buffer's data store to a buffer texture.
	 *
	 * @param target         the target of the operation. Must be:<p/>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}
	 * @param internalformat the internal format of the data in the store belonging to {@code buffer}
	 * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
	 * @param offset         the offset of the start of the range of the buffer's data store to attach
	 * @param size           the size of the range of the buffer's data store to attach
	 */
	public static void glTexBufferRange(int target, int internalformat, int buffer, long offset, long size) {
		long __functionAddress = getInstance().TexBufferRange;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexBufferRange(target, internalformat, buffer, offset, size, __functionAddress);
	}

	// --- [ glTexStorage2DMultisample ] ---

	/** JNI method for {@link #glTexStorage2DMultisample TexStorage2DMultisample} */
	@JavadocExclude
	public static native void nglTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexStorage2DMultisample.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies storage for a two-dimensional multisample texture.
	 *
	 * @param target               the target of the operation. One of:<p/>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}
	 * @param samples              the number of samples in the texture
	 * @param internalformat       the sized internal format to be used to store texture image data
	 * @param width                the width of the texture, in texels
	 * @param height               the height of the texture, in texels
	 * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
	 *                             depend on the internal format or size of the image
	 */
	public static void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
		long __functionAddress = getInstance().TexStorage2DMultisample;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations, __functionAddress);
	}

	// --- [ glTexStorage3DMultisample ] ---

	/** JNI method for {@link #glTexStorage3DMultisample TexStorage3DMultisample} */
	@JavadocExclude
	public static native void nglTexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexStorage3DMultisample.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies storage for a two-dimensional multisample array texture.
	 *
	 * @param target               the target of the operation. One of:<p/>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}, {@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}
	 * @param samples              the number of samples in the texture
	 * @param internalformat       the sized internal format to be used to store texture image data
	 * @param width                the width of the texture, in texels
	 * @param height               the height of the texture, in texels
	 * @param depth                the depth of the texture, in texels
	 * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
	 *                             depend on the internal format or size of the image
	 */
	public static void glTexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
		long __functionAddress = getInstance().TexStorage3DMultisample;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations, __functionAddress);
	}

	// --- [ glTextureView ] ---

	/** JNI method for {@link #glTextureView TextureView} */
	@JavadocExclude
	public static native void nglTextureView(int texture, int target, int origtexture, int internalformat, int minlevel, int numlevels, int minlayer, int numlayers, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTextureView.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Initializes a texture as a data alias of another texture's data store.
	 *
	 * @param texture        the texture object to be initialized as a view
	 * @param target         the target to be used for the newly initialized texture
	 * @param origtexture    the name of a texture object of which to make a view
	 * @param internalformat the internal format for the newly created view
	 * @param minlevel       the  lowest level of detail of the view
	 * @param numlevels      the number of levels of detail to include in the view
	 * @param minlayer       the index of the first layer to include in the view
	 * @param numlayers      the number of layers to include in the view
	 */
	public static void glTextureView(int texture, int target, int origtexture, int internalformat, int minlevel, int numlevels, int minlayer, int numlayers) {
		long __functionAddress = getInstance().TextureView;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers, __functionAddress);
	}

	// --- [ glBindVertexBuffer ] ---

	/** JNI method for {@link #glBindVertexBuffer BindVertexBuffer} */
	@JavadocExclude
	public static native void nglBindVertexBuffer(int bindingindex, int buffer, long offset, int stride, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindVertexBuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds a buffer to a vertex buffer bind point.
	 *
	 * @param bindingindex the index of the vertex buffer binding point to which to bind the buffer
	 * @param buffer       the name of an existing buffer to bind to the vertex buffer binding point
	 * @param offset       the offset of the first element of the buffer
	 * @param stride       the distance between elements within the buffer
	 */
	public static void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
		long __functionAddress = getInstance().BindVertexBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindVertexBuffer(bindingindex, buffer, offset, stride, __functionAddress);
	}

	// --- [ glVertexAttribFormat ] ---

	/** JNI method for {@link #glVertexAttribFormat VertexAttribFormat} */
	@JavadocExclude
	public static native void nglVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribFormat.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the organization of data in vertex arrays.
	 *
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. Must be:<p/>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param normalized     if true then integer data is normalized to the range [-1, 1] or [0, 1] if it is signed or unsigned, respectively. If false then integer data is
	 *                       directly converted to floating point.
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
		long __functionAddress = getInstance().VertexAttribFormat;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribFormat(attribindex, size, type, normalized, relativeoffset, __functionAddress);
	}

	// --- [ glVertexAttribIFormat ] ---

	/** JNI method for {@link #glVertexAttribIFormat VertexAttribIFormat} */
	@JavadocExclude
	public static native void nglVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribIFormat.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the organization of pure integer data in vertex arrays.
	 *
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. Must be:<p/>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = getInstance().VertexAttribIFormat;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribIFormat(attribindex, size, type, relativeoffset, __functionAddress);
	}

	// --- [ glVertexAttribLFormat ] ---

	/** JNI method for {@link #glVertexAttribLFormat VertexAttribLFormat} */
	@JavadocExclude
	public static native void nglVertexAttribLFormat(int attribindex, int size, int type, int relativeoffset, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribLFormat.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the organization of 64-bit double data in vertex arrays.
	 *
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. Must be:<p/>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexAttribLFormat(int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = getInstance().VertexAttribLFormat;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribLFormat(attribindex, size, type, relativeoffset, __functionAddress);
	}

	// --- [ glVertexAttribBinding ] ---

	/** JNI method for {@link #glVertexAttribBinding VertexAttribBinding} */
	@JavadocExclude
	public static native void nglVertexAttribBinding(int attribindex, int bindingindex, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribBinding.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Associate a vertex attribute and a vertex buffer binding.
	 *
	 * @param attribindex  the index of the attribute to associate with a vertex buffer binding
	 * @param bindingindex the index of the vertex buffer binding with which to associate the generic vertex attribute
	 */
	public static void glVertexAttribBinding(int attribindex, int bindingindex) {
		long __functionAddress = getInstance().VertexAttribBinding;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribBinding(attribindex, bindingindex, __functionAddress);
	}

	// --- [ glVertexBindingDivisor ] ---

	/** JNI method for {@link #glVertexBindingDivisor VertexBindingDivisor} */
	@JavadocExclude
	public static native void nglVertexBindingDivisor(int index, int divisor, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexBindingDivisor.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Modifies the rate at which generic vertex attributes advance during instanced rendering.
	 *
	 * @param index   the index of the generic vertex attribute
	 * @param divisor the number of instances that will pass between updates of the generic attribute at slot {@code index}
	 */
	public static void glVertexBindingDivisor(int index, int divisor) {
		long __functionAddress = getInstance().VertexBindingDivisor;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexBindingDivisor(index, divisor, __functionAddress);
	}

}