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

/** The core OpenGL ES 3.0 functionality. */
public final class GLES30 {

	/**  */
	public static final int
		GL_READ_BUFFER                                   = 0xC02,
		GL_UNPACK_ROW_LENGTH                             = 0xCF2,
		GL_UNPACK_SKIP_ROWS                              = 0xCF3,
		GL_UNPACK_SKIP_PIXELS                            = 0xCF4,
		GL_PACK_ROW_LENGTH                               = 0xD02,
		GL_PACK_SKIP_ROWS                                = 0xD03,
		GL_PACK_SKIP_PIXELS                              = 0xD04,
		GL_COLOR                                         = 0x1800,
		GL_DEPTH                                         = 0x1801,
		GL_STENCIL                                       = 0x1802,
		GL_RED                                           = 0x1903,
		GL_RGB8                                          = 0x8051,
		GL_RGBA8                                         = 0x8058,
		GL_RGB10_A2                                      = 0x8059,
		GL_TEXTURE_BINDING_3D                            = 0x806A,
		GL_UNPACK_SKIP_IMAGES                            = 0x806D,
		GL_UNPACK_IMAGE_HEIGHT                           = 0x806E,
		GL_TEXTURE_3D                                    = 0x806F,
		GL_TEXTURE_WRAP_R                                = 0x8072,
		GL_MAX_3D_TEXTURE_SIZE                           = 0x8073,
		GL_UNSIGNED_INT_2_10_10_10_REV                   = 0x8368,
		GL_MAX_ELEMENTS_VERTICES                         = 0x80E8,
		GL_MAX_ELEMENTS_INDICES                          = 0x80E9,
		GL_TEXTURE_MIN_LOD                               = 0x813A,
		GL_TEXTURE_MAX_LOD                               = 0x813B,
		GL_TEXTURE_BASE_LEVEL                            = 0x813C,
		GL_TEXTURE_MAX_LEVEL                             = 0x813D,
		GL_MIN                                           = 0x8007,
		GL_MAX                                           = 0x8008,
		GL_DEPTH_COMPONENT24                             = 0x81A6,
		GL_MAX_TEXTURE_LOD_BIAS                          = 0x84FD,
		GL_TEXTURE_COMPARE_MODE                          = 0x884C,
		GL_TEXTURE_COMPARE_FUNC                          = 0x884D,
		GL_CURRENT_QUERY                                 = 0x8865,
		GL_QUERY_RESULT                                  = 0x8866,
		GL_QUERY_RESULT_AVAILABLE                        = 0x8867,
		GL_BUFFER_MAPPED                                 = 0x88BC,
		GL_BUFFER_MAP_POINTER                            = 0x88BD,
		GL_STREAM_READ                                   = 0x88E1,
		GL_STREAM_COPY                                   = 0x88E2,
		GL_STATIC_READ                                   = 0x88E5,
		GL_STATIC_COPY                                   = 0x88E6,
		GL_DYNAMIC_READ                                  = 0x88E9,
		GL_DYNAMIC_COPY                                  = 0x88EA,
		GL_MAX_DRAW_BUFFERS                              = 0x8824,
		GL_DRAW_BUFFER0                                  = 0x8825,
		GL_DRAW_BUFFER1                                  = 0x8826,
		GL_DRAW_BUFFER2                                  = 0x8827,
		GL_DRAW_BUFFER3                                  = 0x8828,
		GL_DRAW_BUFFER4                                  = 0x8829,
		GL_DRAW_BUFFER5                                  = 0x882A,
		GL_DRAW_BUFFER6                                  = 0x882B,
		GL_DRAW_BUFFER7                                  = 0x882C,
		GL_DRAW_BUFFER8                                  = 0x882D,
		GL_DRAW_BUFFER9                                  = 0x882E,
		GL_DRAW_BUFFER10                                 = 0x882F,
		GL_DRAW_BUFFER11                                 = 0x8830,
		GL_DRAW_BUFFER12                                 = 0x8831,
		GL_DRAW_BUFFER13                                 = 0x8832,
		GL_DRAW_BUFFER14                                 = 0x8833,
		GL_DRAW_BUFFER15                                 = 0x8834,
		GL_MAX_FRAGMENT_UNIFORM_COMPONENTS               = 0x8B49,
		GL_MAX_VERTEX_UNIFORM_COMPONENTS                 = 0x8B4A,
		GL_SAMPLER_3D                                    = 0x8B5F,
		GL_SAMPLER_2D_SHADOW                             = 0x8B62,
		GL_FRAGMENT_SHADER_DERIVATIVE_HINT               = 0x8B8B,
		GL_PIXEL_PACK_BUFFER                             = 0x88EB,
		GL_PIXEL_UNPACK_BUFFER                           = 0x88EC,
		GL_PIXEL_PACK_BUFFER_BINDING                     = 0x88ED,
		GL_PIXEL_UNPACK_BUFFER_BINDING                   = 0x88EF,
		GL_FLOAT_MAT2x3                                  = 0x8B65,
		GL_FLOAT_MAT2x4                                  = 0x8B66,
		GL_FLOAT_MAT3x2                                  = 0x8B67,
		GL_FLOAT_MAT3x4                                  = 0x8B68,
		GL_FLOAT_MAT4x2                                  = 0x8B69,
		GL_FLOAT_MAT4x3                                  = 0x8B6A,
		GL_SRGB                                          = 0x8C40,
		GL_SRGB8                                         = 0x8C41,
		GL_SRGB8_ALPHA8                                  = 0x8C43,
		GL_COMPARE_REF_TO_TEXTURE                        = 0x884E,
		GL_MAJOR_VERSION                                 = 0x821B,
		GL_MINOR_VERSION                                 = 0x821C,
		GL_NUM_EXTENSIONS                                = 0x821D,
		GL_RGBA32F                                       = 0x8814,
		GL_RGB32F                                        = 0x8815,
		GL_RGBA16F                                       = 0x881A,
		GL_RGB16F                                        = 0x881B,
		GL_VERTEX_ATTRIB_ARRAY_INTEGER                   = 0x88FD,
		GL_MAX_ARRAY_TEXTURE_LAYERS                      = 0x88FF,
		GL_MIN_PROGRAM_TEXEL_OFFSET                      = 0x8904,
		GL_MAX_PROGRAM_TEXEL_OFFSET                      = 0x8905,
		GL_MAX_VARYING_COMPONENTS                        = 0x8B4B,
		GL_TEXTURE_2D_ARRAY                              = 0x8C1A,
		GL_TEXTURE_BINDING_2D_ARRAY                      = 0x8C1D,
		GL_R11F_G11F_B10F                                = 0x8C3A,
		GL_UNSIGNED_INT_10F_11F_11F_REV                  = 0x8C3B,
		GL_RGB9_E5                                       = 0x8C3D,
		GL_UNSIGNED_INT_5_9_9_9_REV                      = 0x8C3E,
		GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH         = 0x8C76,
		GL_TRANSFORM_FEEDBACK_BUFFER_MODE                = 0x8C7F,
		GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS    = 0x8C80,
		GL_TRANSFORM_FEEDBACK_VARYINGS                   = 0x8C83,
		GL_TRANSFORM_FEEDBACK_BUFFER_START               = 0x8C84,
		GL_TRANSFORM_FEEDBACK_BUFFER_SIZE                = 0x8C85,
		GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN         = 0x8C88,
		GL_RASTERIZER_DISCARD                            = 0x8C89,
		GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A,
		GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS       = 0x8C8B,
		GL_INTERLEAVED_ATTRIBS                           = 0x8C8C,
		GL_SEPARATE_ATTRIBS                              = 0x8C8D,
		GL_TRANSFORM_FEEDBACK_BUFFER                     = 0x8C8E,
		GL_TRANSFORM_FEEDBACK_BUFFER_BINDING             = 0x8C8F,
		GL_RGBA32UI                                      = 0x8D70,
		GL_RGB32UI                                       = 0x8D71,
		GL_RGBA16UI                                      = 0x8D76,
		GL_RGB16UI                                       = 0x8D77,
		GL_RGBA8UI                                       = 0x8D7C,
		GL_RGB8UI                                        = 0x8D7D,
		GL_RGBA32I                                       = 0x8D82,
		GL_RGB32I                                        = 0x8D83,
		GL_RGBA16I                                       = 0x8D88,
		GL_RGB16I                                        = 0x8D89,
		GL_RGBA8I                                        = 0x8D8E,
		GL_RGB8I                                         = 0x8D8F,
		GL_RED_INTEGER                                   = 0x8D94,
		GL_RGB_INTEGER                                   = 0x8D98,
		GL_RGBA_INTEGER                                  = 0x8D99,
		GL_SAMPLER_2D_ARRAY                              = 0x8DC1,
		GL_SAMPLER_2D_ARRAY_SHADOW                       = 0x8DC4,
		GL_SAMPLER_CUBE_SHADOW                           = 0x8DC5,
		GL_UNSIGNED_INT_VEC2                             = 0x8DC6,
		GL_UNSIGNED_INT_VEC3                             = 0x8DC7,
		GL_UNSIGNED_INT_VEC4                             = 0x8DC8,
		GL_INT_SAMPLER_2D                                = 0x8DCA,
		GL_INT_SAMPLER_3D                                = 0x8DCB,
		GL_INT_SAMPLER_CUBE                              = 0x8DCC,
		GL_INT_SAMPLER_2D_ARRAY                          = 0x8DCF,
		GL_UNSIGNED_INT_SAMPLER_2D                       = 0x8DD2,
		GL_UNSIGNED_INT_SAMPLER_3D                       = 0x8DD3,
		GL_UNSIGNED_INT_SAMPLER_CUBE                     = 0x8DD4,
		GL_UNSIGNED_INT_SAMPLER_2D_ARRAY                 = 0x8DD7,
		GL_BUFFER_ACCESS_FLAGS                           = 0x911F,
		GL_BUFFER_MAP_LENGTH                             = 0x9120,
		GL_BUFFER_MAP_OFFSET                             = 0x9121,
		GL_DEPTH_COMPONENT32F                            = 0x8CAC,
		GL_DEPTH32F_STENCIL8                             = 0x8CAD,
		GL_FLOAT_32_UNSIGNED_INT_24_8_REV                = 0x8DAD,
		GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING         = 0x8210,
		GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE         = 0x8211,
		GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE               = 0x8212,
		GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE             = 0x8213,
		GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE              = 0x8214,
		GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE             = 0x8215,
		GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE             = 0x8216,
		GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE           = 0x8217,
		GL_FRAMEBUFFER_DEFAULT                           = 0x8218,
		GL_FRAMEBUFFER_UNDEFINED                         = 0x8219,
		GL_DEPTH_STENCIL_ATTACHMENT                      = 0x821A,
		GL_DEPTH_STENCIL                                 = 0x84F9,
		GL_UNSIGNED_INT_24_8                             = 0x84FA,
		GL_DEPTH24_STENCIL8                              = 0x88F0,
		GL_UNSIGNED_NORMALIZED                           = 0x8C17,
		GL_DRAW_FRAMEBUFFER_BINDING                      = 0x8CA6,
		GL_READ_FRAMEBUFFER                              = 0x8CA8,
		GL_DRAW_FRAMEBUFFER                              = 0x8CA9,
		GL_READ_FRAMEBUFFER_BINDING                      = 0x8CAA,
		GL_RENDERBUFFER_SAMPLES                          = 0x8CAB,
		GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER          = 0x8CD4,
		GL_MAX_COLOR_ATTACHMENTS                         = 0x8CDF,
		GL_COLOR_ATTACHMENT1                             = 0x8CE1,
		GL_COLOR_ATTACHMENT2                             = 0x8CE2,
		GL_COLOR_ATTACHMENT3                             = 0x8CE3,
		GL_COLOR_ATTACHMENT4                             = 0x8CE4,
		GL_COLOR_ATTACHMENT5                             = 0x8CE5,
		GL_COLOR_ATTACHMENT6                             = 0x8CE6,
		GL_COLOR_ATTACHMENT7                             = 0x8CE7,
		GL_COLOR_ATTACHMENT8                             = 0x8CE8,
		GL_COLOR_ATTACHMENT9                             = 0x8CE9,
		GL_COLOR_ATTACHMENT10                            = 0x8CEA,
		GL_COLOR_ATTACHMENT11                            = 0x8CEB,
		GL_COLOR_ATTACHMENT12                            = 0x8CEC,
		GL_COLOR_ATTACHMENT13                            = 0x8CED,
		GL_COLOR_ATTACHMENT14                            = 0x8CEE,
		GL_COLOR_ATTACHMENT15                            = 0x8CEF,
		GL_COLOR_ATTACHMENT16                            = 0x8CF0,
		GL_COLOR_ATTACHMENT17                            = 0x8CF1,
		GL_COLOR_ATTACHMENT18                            = 0x8CF2,
		GL_COLOR_ATTACHMENT19                            = 0x8CF3,
		GL_COLOR_ATTACHMENT20                            = 0x8CF4,
		GL_COLOR_ATTACHMENT21                            = 0x8CF5,
		GL_COLOR_ATTACHMENT22                            = 0x8CF6,
		GL_COLOR_ATTACHMENT23                            = 0x8CF7,
		GL_COLOR_ATTACHMENT24                            = 0x8CF8,
		GL_COLOR_ATTACHMENT25                            = 0x8CF9,
		GL_COLOR_ATTACHMENT26                            = 0x8CFA,
		GL_COLOR_ATTACHMENT27                            = 0x8CFB,
		GL_COLOR_ATTACHMENT28                            = 0x8CFC,
		GL_COLOR_ATTACHMENT29                            = 0x8CFD,
		GL_COLOR_ATTACHMENT30                            = 0x8CFE,
		GL_COLOR_ATTACHMENT31                            = 0x8CFF,
		GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE            = 0x8D56,
		GL_MAX_SAMPLES                                   = 0x8D57,
		GL_HALF_FLOAT                                    = 0x140B,
		GL_MAP_READ_BIT                                  = 0x1,
		GL_MAP_WRITE_BIT                                 = 0x2,
		GL_MAP_INVALIDATE_RANGE_BIT                      = 0x4,
		GL_MAP_INVALIDATE_BUFFER_BIT                     = 0x8,
		GL_MAP_FLUSH_EXPLICIT_BIT                        = 0x10,
		GL_MAP_UNSYNCHRONIZED_BIT                        = 0x20,
		GL_RG                                            = 0x8227,
		GL_RG_INTEGER                                    = 0x8228,
		GL_R8                                            = 0x8229,
		GL_RG8                                           = 0x822B,
		GL_R16F                                          = 0x822D,
		GL_R32F                                          = 0x822E,
		GL_RG16F                                         = 0x822F,
		GL_RG32F                                         = 0x8230,
		GL_R8I                                           = 0x8231,
		GL_R8UI                                          = 0x8232,
		GL_R16I                                          = 0x8233,
		GL_R16UI                                         = 0x8234,
		GL_R32I                                          = 0x8235,
		GL_R32UI                                         = 0x8236,
		GL_RG8I                                          = 0x8237,
		GL_RG8UI                                         = 0x8238,
		GL_RG16I                                         = 0x8239,
		GL_RG16UI                                        = 0x823A,
		GL_RG32I                                         = 0x823B,
		GL_RG32UI                                        = 0x823C,
		GL_VERTEX_ARRAY_BINDING                          = 0x85B5,
		GL_R8_SNORM                                      = 0x8F94,
		GL_RG8_SNORM                                     = 0x8F95,
		GL_RGB8_SNORM                                    = 0x8F96,
		GL_RGBA8_SNORM                                   = 0x8F97,
		GL_SIGNED_NORMALIZED                             = 0x8F9C,
		GL_PRIMITIVE_RESTART_FIXED_INDEX                 = 0x8D69,
		GL_COPY_READ_BUFFER                              = 0x8F36,
		GL_COPY_WRITE_BUFFER                             = 0x8F37,
		GL_COPY_READ_BUFFER_BINDING                      = 0x8F36,
		GL_COPY_WRITE_BUFFER_BINDING                     = 0x8F37,
		GL_UNIFORM_BUFFER                                = 0x8A11,
		GL_UNIFORM_BUFFER_BINDING                        = 0x8A28,
		GL_UNIFORM_BUFFER_START                          = 0x8A29,
		GL_UNIFORM_BUFFER_SIZE                           = 0x8A2A,
		GL_MAX_VERTEX_UNIFORM_BLOCKS                     = 0x8A2B,
		GL_MAX_FRAGMENT_UNIFORM_BLOCKS                   = 0x8A2D,
		GL_MAX_COMBINED_UNIFORM_BLOCKS                   = 0x8A2E,
		GL_MAX_UNIFORM_BUFFER_BINDINGS                   = 0x8A2F,
		GL_MAX_UNIFORM_BLOCK_SIZE                        = 0x8A30,
		GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS        = 0x8A31,
		GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS      = 0x8A33,
		GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT               = 0x8A34,
		GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH          = 0x8A35,
		GL_ACTIVE_UNIFORM_BLOCKS                         = 0x8A36,
		GL_UNIFORM_TYPE                                  = 0x8A37,
		GL_UNIFORM_SIZE                                  = 0x8A38,
		GL_UNIFORM_NAME_LENGTH                           = 0x8A39,
		GL_UNIFORM_BLOCK_INDEX                           = 0x8A3A,
		GL_UNIFORM_OFFSET                                = 0x8A3B,
		GL_UNIFORM_ARRAY_STRIDE                          = 0x8A3C,
		GL_UNIFORM_MATRIX_STRIDE                         = 0x8A3D,
		GL_UNIFORM_IS_ROW_MAJOR                          = 0x8A3E,
		GL_UNIFORM_BLOCK_BINDING                         = 0x8A3F,
		GL_UNIFORM_BLOCK_DATA_SIZE                       = 0x8A40,
		GL_UNIFORM_BLOCK_NAME_LENGTH                     = 0x8A41,
		GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS                 = 0x8A42,
		GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES          = 0x8A43,
		GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER     = 0x8A44,
		GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER   = 0x8A46,
		GL_INVALID_INDEX                                 = 0xFFFFFFFF,
		GL_MAX_VERTEX_OUTPUT_COMPONENTS                  = 0x9122,
		GL_MAX_FRAGMENT_INPUT_COMPONENTS                 = 0x9125,
		GL_MAX_SERVER_WAIT_TIMEOUT                       = 0x9111,
		GL_OBJECT_TYPE                                   = 0x9112,
		GL_SYNC_CONDITION                                = 0x9113,
		GL_SYNC_STATUS                                   = 0x9114,
		GL_SYNC_FLAGS                                    = 0x9115,
		GL_SYNC_FENCE                                    = 0x9116,
		GL_SYNC_GPU_COMMANDS_COMPLETE                    = 0x9117,
		GL_UNSIGNALED                                    = 0x9118,
		GL_SIGNALED                                      = 0x9119,
		GL_ALREADY_SIGNALED                              = 0x911A,
		GL_TIMEOUT_EXPIRED                               = 0x911B,
		GL_CONDITION_SATISFIED                           = 0x911C,
		GL_WAIT_FAILED                                   = 0x911D,
		GL_SYNC_FLUSH_COMMANDS_BIT                       = 0x1,
		GL_VERTEX_ATTRIB_ARRAY_DIVISOR                   = 0x88FE,
		GL_ANY_SAMPLES_PASSED                            = 0x8C2F,
		GL_ANY_SAMPLES_PASSED_CONSERVATIVE               = 0x8D6A,
		GL_SAMPLER_BINDING                               = 0x8919,
		GL_RGB10_A2UI                                    = 0x906F,
		GL_TEXTURE_SWIZZLE_R                             = 0x8E42,
		GL_TEXTURE_SWIZZLE_G                             = 0x8E43,
		GL_TEXTURE_SWIZZLE_B                             = 0x8E44,
		GL_TEXTURE_SWIZZLE_A                             = 0x8E45,
		GL_GREEN                                         = 0x1904,
		GL_BLUE                                          = 0x1905,
		GL_INT_2_10_10_10_REV                            = 0x8D9F,
		GL_TRANSFORM_FEEDBACK                            = 0x8E22,
		GL_TRANSFORM_FEEDBACK_PAUSED                     = 0x8E23,
		GL_TRANSFORM_FEEDBACK_ACTIVE                     = 0x8E24,
		GL_TRANSFORM_FEEDBACK_BINDING                    = 0x8E25,
		GL_PROGRAM_BINARY_RETRIEVABLE_HINT               = 0x8257,
		GL_PROGRAM_BINARY_LENGTH                         = 0x8741,
		GL_NUM_PROGRAM_BINARY_FORMATS                    = 0x87FE,
		GL_PROGRAM_BINARY_FORMATS                        = 0x87FF,
		GL_COMPRESSED_R11_EAC                            = 0x9270,
		GL_COMPRESSED_SIGNED_R11_EAC                     = 0x9271,
		GL_COMPRESSED_RG11_EAC                           = 0x9272,
		GL_COMPRESSED_SIGNED_RG11_EAC                    = 0x9273,
		GL_COMPRESSED_RGB8_ETC2                          = 0x9274,
		GL_COMPRESSED_SRGB8_ETC2                         = 0x9275,
		GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2      = 0x9276,
		GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2     = 0x9277,
		GL_COMPRESSED_RGBA8_ETC2_EAC                     = 0x9278,
		GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC              = 0x9279,
		GL_TEXTURE_IMMUTABLE_FORMAT                      = 0x912F,
		GL_MAX_ELEMENT_INDEX                             = 0x8D6B,
		GL_NUM_SAMPLE_COUNTS                             = 0x9380,
		GL_TEXTURE_IMMUTABLE_LEVELS                      = 0x82DF;

	/**  */
	public static final long GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFL;

	/** Function address. */
	@JavadocExclude
	public final long
		ReadBuffer,
		DrawRangeElements,
		TexImage3D,
		TexSubImage3D,
		CopyTexSubImage3D,
		CompressedTexImage3D,
		CompressedTexSubImage3D,
		GenQueries,
		DeleteQueries,
		IsQuery,
		BeginQuery,
		EndQuery,
		GetQueryiv,
		GetQueryObjectuiv,
		UnmapBuffer,
		GetBufferPointerv,
		DrawBuffers,
		UniformMatrix2x3fv,
		UniformMatrix3x2fv,
		UniformMatrix2x4fv,
		UniformMatrix4x2fv,
		UniformMatrix3x4fv,
		UniformMatrix4x3fv,
		BlitFramebuffer,
		RenderbufferStorageMultisample,
		FramebufferTextureLayer,
		MapBufferRange,
		FlushMappedBufferRange,
		BindVertexArray,
		DeleteVertexArrays,
		GenVertexArrays,
		IsVertexArray,
		GetIntegeri_v,
		BeginTransformFeedback,
		EndTransformFeedback,
		BindBufferRange,
		BindBufferBase,
		TransformFeedbackVaryings,
		GetTransformFeedbackVarying,
		VertexAttribIPointer,
		GetVertexAttribIiv,
		GetVertexAttribIuiv,
		VertexAttribI4i,
		VertexAttribI4ui,
		VertexAttribI4iv,
		VertexAttribI4uiv,
		GetUniformuiv,
		GetFragDataLocation,
		Uniform1ui,
		Uniform2ui,
		Uniform3ui,
		Uniform4ui,
		Uniform1uiv,
		Uniform2uiv,
		Uniform3uiv,
		Uniform4uiv,
		ClearBufferiv,
		ClearBufferuiv,
		ClearBufferfv,
		ClearBufferfi,
		GetStringi,
		CopyBufferSubData,
		GetUniformIndices,
		GetActiveUniformsiv,
		GetUniformBlockIndex,
		GetActiveUniformBlockiv,
		GetActiveUniformBlockName,
		UniformBlockBinding,
		DrawArraysInstanced,
		DrawElementsInstanced,
		FenceSync,
		IsSync,
		DeleteSync,
		ClientWaitSync,
		WaitSync,
		GetInteger64v,
		GetSynciv,
		GetInteger64i_v,
		GetBufferParameteri64v,
		GenSamplers,
		DeleteSamplers,
		IsSampler,
		BindSampler,
		SamplerParameteri,
		SamplerParameteriv,
		SamplerParameterf,
		SamplerParameterfv,
		GetSamplerParameteriv,
		GetSamplerParameterfv,
		VertexAttribDivisor,
		BindTransformFeedback,
		DeleteTransformFeedbacks,
		GenTransformFeedbacks,
		IsTransformFeedback,
		PauseTransformFeedback,
		ResumeTransformFeedback,
		GetProgramBinary,
		ProgramBinary,
		ProgramParameteri,
		InvalidateFramebuffer,
		InvalidateSubFramebuffer,
		TexStorage2D,
		TexStorage3D,
		GetInternalformativ;

	@JavadocExclude
	public GLES30(FunctionProvider provider) {
		ReadBuffer = provider.getFunctionAddress("glReadBuffer");
		DrawRangeElements = provider.getFunctionAddress("glDrawRangeElements");
		TexImage3D = provider.getFunctionAddress("glTexImage3D");
		TexSubImage3D = provider.getFunctionAddress("glTexSubImage3D");
		CopyTexSubImage3D = provider.getFunctionAddress("glCopyTexSubImage3D");
		CompressedTexImage3D = provider.getFunctionAddress("glCompressedTexImage3D");
		CompressedTexSubImage3D = provider.getFunctionAddress("glCompressedTexSubImage3D");
		GenQueries = provider.getFunctionAddress("glGenQueries");
		DeleteQueries = provider.getFunctionAddress("glDeleteQueries");
		IsQuery = provider.getFunctionAddress("glIsQuery");
		BeginQuery = provider.getFunctionAddress("glBeginQuery");
		EndQuery = provider.getFunctionAddress("glEndQuery");
		GetQueryiv = provider.getFunctionAddress("glGetQueryiv");
		GetQueryObjectuiv = provider.getFunctionAddress("glGetQueryObjectuiv");
		UnmapBuffer = provider.getFunctionAddress("glUnmapBuffer");
		GetBufferPointerv = provider.getFunctionAddress("glGetBufferPointerv");
		DrawBuffers = provider.getFunctionAddress("glDrawBuffers");
		UniformMatrix2x3fv = provider.getFunctionAddress("glUniformMatrix2x3fv");
		UniformMatrix3x2fv = provider.getFunctionAddress("glUniformMatrix3x2fv");
		UniformMatrix2x4fv = provider.getFunctionAddress("glUniformMatrix2x4fv");
		UniformMatrix4x2fv = provider.getFunctionAddress("glUniformMatrix4x2fv");
		UniformMatrix3x4fv = provider.getFunctionAddress("glUniformMatrix3x4fv");
		UniformMatrix4x3fv = provider.getFunctionAddress("glUniformMatrix4x3fv");
		BlitFramebuffer = provider.getFunctionAddress("glBlitFramebuffer");
		RenderbufferStorageMultisample = provider.getFunctionAddress("glRenderbufferStorageMultisample");
		FramebufferTextureLayer = provider.getFunctionAddress("glFramebufferTextureLayer");
		MapBufferRange = provider.getFunctionAddress("glMapBufferRange");
		FlushMappedBufferRange = provider.getFunctionAddress("glFlushMappedBufferRange");
		BindVertexArray = provider.getFunctionAddress("glBindVertexArray");
		DeleteVertexArrays = provider.getFunctionAddress("glDeleteVertexArrays");
		GenVertexArrays = provider.getFunctionAddress("glGenVertexArrays");
		IsVertexArray = provider.getFunctionAddress("glIsVertexArray");
		GetIntegeri_v = provider.getFunctionAddress("glGetIntegeri_v");
		BeginTransformFeedback = provider.getFunctionAddress("glBeginTransformFeedback");
		EndTransformFeedback = provider.getFunctionAddress("glEndTransformFeedback");
		BindBufferRange = provider.getFunctionAddress("glBindBufferRange");
		BindBufferBase = provider.getFunctionAddress("glBindBufferBase");
		TransformFeedbackVaryings = provider.getFunctionAddress("glTransformFeedbackVaryings");
		GetTransformFeedbackVarying = provider.getFunctionAddress("glGetTransformFeedbackVarying");
		VertexAttribIPointer = provider.getFunctionAddress("glVertexAttribIPointer");
		GetVertexAttribIiv = provider.getFunctionAddress("glGetVertexAttribIiv");
		GetVertexAttribIuiv = provider.getFunctionAddress("glGetVertexAttribIuiv");
		VertexAttribI4i = provider.getFunctionAddress("glVertexAttribI4i");
		VertexAttribI4ui = provider.getFunctionAddress("glVertexAttribI4ui");
		VertexAttribI4iv = provider.getFunctionAddress("glVertexAttribI4iv");
		VertexAttribI4uiv = provider.getFunctionAddress("glVertexAttribI4uiv");
		GetUniformuiv = provider.getFunctionAddress("glGetUniformuiv");
		GetFragDataLocation = provider.getFunctionAddress("glGetFragDataLocation");
		Uniform1ui = provider.getFunctionAddress("glUniform1ui");
		Uniform2ui = provider.getFunctionAddress("glUniform2ui");
		Uniform3ui = provider.getFunctionAddress("glUniform3ui");
		Uniform4ui = provider.getFunctionAddress("glUniform4ui");
		Uniform1uiv = provider.getFunctionAddress("glUniform1uiv");
		Uniform2uiv = provider.getFunctionAddress("glUniform2uiv");
		Uniform3uiv = provider.getFunctionAddress("glUniform3uiv");
		Uniform4uiv = provider.getFunctionAddress("glUniform4uiv");
		ClearBufferiv = provider.getFunctionAddress("glClearBufferiv");
		ClearBufferuiv = provider.getFunctionAddress("glClearBufferuiv");
		ClearBufferfv = provider.getFunctionAddress("glClearBufferfv");
		ClearBufferfi = provider.getFunctionAddress("glClearBufferfi");
		GetStringi = provider.getFunctionAddress("glGetStringi");
		CopyBufferSubData = provider.getFunctionAddress("glCopyBufferSubData");
		GetUniformIndices = provider.getFunctionAddress("glGetUniformIndices");
		GetActiveUniformsiv = provider.getFunctionAddress("glGetActiveUniformsiv");
		GetUniformBlockIndex = provider.getFunctionAddress("glGetUniformBlockIndex");
		GetActiveUniformBlockiv = provider.getFunctionAddress("glGetActiveUniformBlockiv");
		GetActiveUniformBlockName = provider.getFunctionAddress("glGetActiveUniformBlockName");
		UniformBlockBinding = provider.getFunctionAddress("glUniformBlockBinding");
		DrawArraysInstanced = provider.getFunctionAddress("glDrawArraysInstanced");
		DrawElementsInstanced = provider.getFunctionAddress("glDrawElementsInstanced");
		FenceSync = provider.getFunctionAddress("glFenceSync");
		IsSync = provider.getFunctionAddress("glIsSync");
		DeleteSync = provider.getFunctionAddress("glDeleteSync");
		ClientWaitSync = provider.getFunctionAddress("glClientWaitSync");
		WaitSync = provider.getFunctionAddress("glWaitSync");
		GetInteger64v = provider.getFunctionAddress("glGetInteger64v");
		GetSynciv = provider.getFunctionAddress("glGetSynciv");
		GetInteger64i_v = provider.getFunctionAddress("glGetInteger64i_v");
		GetBufferParameteri64v = provider.getFunctionAddress("glGetBufferParameteri64v");
		GenSamplers = provider.getFunctionAddress("glGenSamplers");
		DeleteSamplers = provider.getFunctionAddress("glDeleteSamplers");
		IsSampler = provider.getFunctionAddress("glIsSampler");
		BindSampler = provider.getFunctionAddress("glBindSampler");
		SamplerParameteri = provider.getFunctionAddress("glSamplerParameteri");
		SamplerParameteriv = provider.getFunctionAddress("glSamplerParameteriv");
		SamplerParameterf = provider.getFunctionAddress("glSamplerParameterf");
		SamplerParameterfv = provider.getFunctionAddress("glSamplerParameterfv");
		GetSamplerParameteriv = provider.getFunctionAddress("glGetSamplerParameteriv");
		GetSamplerParameterfv = provider.getFunctionAddress("glGetSamplerParameterfv");
		VertexAttribDivisor = provider.getFunctionAddress("glVertexAttribDivisor");
		BindTransformFeedback = provider.getFunctionAddress("glBindTransformFeedback");
		DeleteTransformFeedbacks = provider.getFunctionAddress("glDeleteTransformFeedbacks");
		GenTransformFeedbacks = provider.getFunctionAddress("glGenTransformFeedbacks");
		IsTransformFeedback = provider.getFunctionAddress("glIsTransformFeedback");
		PauseTransformFeedback = provider.getFunctionAddress("glPauseTransformFeedback");
		ResumeTransformFeedback = provider.getFunctionAddress("glResumeTransformFeedback");
		GetProgramBinary = provider.getFunctionAddress("glGetProgramBinary");
		ProgramBinary = provider.getFunctionAddress("glProgramBinary");
		ProgramParameteri = provider.getFunctionAddress("glProgramParameteri");
		InvalidateFramebuffer = provider.getFunctionAddress("glInvalidateFramebuffer");
		InvalidateSubFramebuffer = provider.getFunctionAddress("glInvalidateSubFramebuffer");
		TexStorage2D = provider.getFunctionAddress("glTexStorage2D");
		TexStorage3D = provider.getFunctionAddress("glTexStorage3D");
		GetInternalformativ = provider.getFunctionAddress("glGetInternalformativ");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLES30} instance for the current context. */
	public static GLES30 getInstance() {
		return checkFunctionality(GLES.getCapabilities().__GLES30);
	}

	static GLES30 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLES30") ) return null;

		GLES30 funcs = new GLES30(provider);
		boolean supported = checkFunctions(
			funcs.ReadBuffer, funcs.DrawRangeElements, funcs.TexImage3D, funcs.TexSubImage3D, funcs.CopyTexSubImage3D, funcs.CompressedTexImage3D, 
			funcs.CompressedTexSubImage3D, funcs.GenQueries, funcs.DeleteQueries, funcs.IsQuery, funcs.BeginQuery, funcs.EndQuery, funcs.GetQueryiv, 
			funcs.GetQueryObjectuiv, funcs.UnmapBuffer, funcs.GetBufferPointerv, funcs.DrawBuffers, funcs.UniformMatrix2x3fv, funcs.UniformMatrix3x2fv, 
			funcs.UniformMatrix2x4fv, funcs.UniformMatrix4x2fv, funcs.UniformMatrix3x4fv, funcs.UniformMatrix4x3fv, funcs.BlitFramebuffer, 
			funcs.RenderbufferStorageMultisample, funcs.FramebufferTextureLayer, funcs.MapBufferRange, funcs.FlushMappedBufferRange, funcs.BindVertexArray, 
			funcs.DeleteVertexArrays, funcs.GenVertexArrays, funcs.IsVertexArray, funcs.GetIntegeri_v, funcs.BeginTransformFeedback, funcs.EndTransformFeedback, 
			funcs.BindBufferRange, funcs.BindBufferBase, funcs.TransformFeedbackVaryings, funcs.GetTransformFeedbackVarying, funcs.VertexAttribIPointer, 
			funcs.GetVertexAttribIiv, funcs.GetVertexAttribIuiv, funcs.VertexAttribI4i, funcs.VertexAttribI4ui, funcs.VertexAttribI4iv, funcs.VertexAttribI4uiv, 
			funcs.GetUniformuiv, funcs.GetFragDataLocation, funcs.Uniform1ui, funcs.Uniform2ui, funcs.Uniform3ui, funcs.Uniform4ui, funcs.Uniform1uiv, 
			funcs.Uniform2uiv, funcs.Uniform3uiv, funcs.Uniform4uiv, funcs.ClearBufferiv, funcs.ClearBufferuiv, funcs.ClearBufferfv, funcs.ClearBufferfi, 
			funcs.GetStringi, funcs.CopyBufferSubData, funcs.GetUniformIndices, funcs.GetActiveUniformsiv, funcs.GetUniformBlockIndex, 
			funcs.GetActiveUniformBlockiv, funcs.GetActiveUniformBlockName, funcs.UniformBlockBinding, funcs.DrawArraysInstanced, funcs.DrawElementsInstanced, 
			funcs.FenceSync, funcs.IsSync, funcs.DeleteSync, funcs.ClientWaitSync, funcs.WaitSync, funcs.GetInteger64v, funcs.GetSynciv, funcs.GetInteger64i_v, 
			funcs.GetBufferParameteri64v, funcs.GenSamplers, funcs.DeleteSamplers, funcs.IsSampler, funcs.BindSampler, funcs.SamplerParameteri, 
			funcs.SamplerParameteriv, funcs.SamplerParameterf, funcs.SamplerParameterfv, funcs.GetSamplerParameteriv, funcs.GetSamplerParameterfv, 
			funcs.VertexAttribDivisor, funcs.BindTransformFeedback, funcs.DeleteTransformFeedbacks, funcs.GenTransformFeedbacks, funcs.IsTransformFeedback, 
			funcs.PauseTransformFeedback, funcs.ResumeTransformFeedback, funcs.GetProgramBinary, funcs.ProgramBinary, funcs.ProgramParameteri, 
			funcs.InvalidateFramebuffer, funcs.InvalidateSubFramebuffer, funcs.TexStorage2D, funcs.TexStorage3D, funcs.GetInternalformativ
		);

		return GLES.checkExtension("GLES30", funcs, supported);
	}

	// --- [ glReadBuffer ] ---

	public static void glReadBuffer(int src) {
		long __functionAddress = getInstance().ReadBuffer;
		callIV(__functionAddress, src);
	}

	// --- [ glDrawRangeElements ] ---

	/** Unsafe version of {@link #glDrawRangeElements DrawRangeElements} */
	@JavadocExclude
	public static void nglDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
		long __functionAddress = getInstance().DrawRangeElements;
		callIIIIIPV(__functionAddress, mode, start, end, count, type, indices);
	}

	public static void glDrawRangeElements(int mode, int start, int end, int count, int type, ByteBuffer indices) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, count << GLESChecks.typeToByteShift(type));
		nglDrawRangeElements(mode, start, end, count, type, memAddress(indices));
	}

	/** Buffer object offset version of: {@link #glDrawRangeElements DrawRangeElements} */
	public static void glDrawRangeElements(int mode, int start, int end, int count, int type, long indicesOffset) {
		nglDrawRangeElements(mode, start, end, count, type, indicesOffset);
	}

	/** Alternative version of: {@link #glDrawRangeElements DrawRangeElements} */
	public static void glDrawRangeElements(int mode, int start, int end, int type, ByteBuffer indices) {
		nglDrawRangeElements(mode, start, end, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices));
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawRangeElements DrawRangeElements} */
	public static void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices) {
		nglDrawRangeElements(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices));
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawRangeElements DrawRangeElements} */
	public static void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices) {
		nglDrawRangeElements(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices));
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawRangeElements DrawRangeElements} */
	public static void glDrawRangeElements(int mode, int start, int end, IntBuffer indices) {
		nglDrawRangeElements(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices));
	}

	// --- [ glTexImage3D ] ---

	/** Unsafe version of {@link #glTexImage3D TexImage3D} */
	@JavadocExclude
	public static void nglTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().TexImage3D;
		callIIIIIIIIIPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** Buffer object offset version of: {@link #glTexImage3D TexImage3D} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixelsOffset) {
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTexImage3D TexImage3D} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glTexImage3D TexImage3D} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glTexImage3D TexImage3D} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glTexSubImage3D ] ---

	/** Unsafe version of {@link #glTexSubImage3D TexSubImage3D} */
	@JavadocExclude
	public static void nglTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		long __functionAddress = getInstance().TexSubImage3D;
		callIIIIIIIIIIPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glTexSubImage3D TexSubImage3D} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixelsOffset) {
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTexSubImage3D TexSubImage3D} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTexSubImage3D TexSubImage3D} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTexSubImage3D TexSubImage3D} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	// --- [ glCopyTexSubImage3D ] ---

	public static void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().CopyTexSubImage3D;
		callIIIIIIIIIV(__functionAddress, target, level, xoffset, yoffset, zoffset, x, y, width, height);
	}

	// --- [ glCompressedTexImage3D ] ---

	/** Unsafe version of {@link #glCompressedTexImage3D CompressedTexImage3D} */
	@JavadocExclude
	public static void nglCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTexImage3D;
		callIIIIIIIIPV(__functionAddress, target, level, internalformat, width, height, depth, border, imageSize, data);
	}

	public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			if ( data != null ) checkBuffer(data, imageSize);
		nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, memAddressSafe(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTexImage3D CompressedTexImage3D} */
	public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long dataOffset) {
		nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTexImage3D CompressedTexImage3D} */
	public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
		nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, data == null ? 0 : data.remaining(), memAddressSafe(data));
	}

	// --- [ glCompressedTexSubImage3D ] ---

	/** Unsafe version of {@link #glCompressedTexSubImage3D CompressedTexSubImage3D} */
	@JavadocExclude
	public static void nglCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTexSubImage3D;
		callIIIIIIIIIIPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, imageSize);
		nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTexSubImage3D CompressedTexSubImage3D} */
	public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long dataOffset) {
		nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTexSubImage3D CompressedTexSubImage3D} */
	public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
		nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
	}

	// --- [ glGenQueries ] ---

	/** Unsafe version of {@link #glGenQueries GenQueries} */
	@JavadocExclude
	public static void nglGenQueries(int n, long ids) {
		long __functionAddress = getInstance().GenQueries;
		callIPV(__functionAddress, n, ids);
	}

	public static void glGenQueries(int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, n << 2);
		nglGenQueries(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glGenQueries GenQueries} */
	public static void glGenQueries(IntBuffer ids) {
		nglGenQueries(ids.remaining(), memAddress(ids));
	}

	/** Single return value version of: {@link #glGenQueries GenQueries} */
	public static int glGenQueries() {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam();
		nglGenQueries(1, __buffer.address(ids));
		return __buffer.intValue(ids);
	}

	// --- [ glDeleteQueries ] ---

	/** Unsafe version of {@link #glDeleteQueries DeleteQueries} */
	@JavadocExclude
	public static void nglDeleteQueries(int n, long ids) {
		long __functionAddress = getInstance().DeleteQueries;
		callIPV(__functionAddress, n, ids);
	}

	public static void glDeleteQueries(int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, n << 2);
		nglDeleteQueries(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glDeleteQueries DeleteQueries} */
	public static void glDeleteQueries(IntBuffer ids) {
		nglDeleteQueries(ids.remaining(), memAddress(ids));
	}

	/** Single value version of: {@link #glDeleteQueries DeleteQueries} */
	public static void glDeleteQueries(int id) {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam(id);
		nglDeleteQueries(1, __buffer.address(ids));
	}

	// --- [ glIsQuery ] ---

	public static boolean glIsQuery(int id) {
		long __functionAddress = getInstance().IsQuery;
		return callIZ(__functionAddress, id);
	}

	// --- [ glBeginQuery ] ---

	public static void glBeginQuery(int target, int id) {
		long __functionAddress = getInstance().BeginQuery;
		callIIV(__functionAddress, target, id);
	}

	// --- [ glEndQuery ] ---

	public static void glEndQuery(int target) {
		long __functionAddress = getInstance().EndQuery;
		callIV(__functionAddress, target);
	}

	// --- [ glGetQueryiv ] ---

	/** Unsafe version of {@link #glGetQueryiv GetQueryiv} */
	@JavadocExclude
	public static void nglGetQueryiv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetQueryiv;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetQueryiv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetQueryiv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryiv GetQueryiv} */
	public static void glGetQueryiv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryiv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryiv GetQueryiv} */
	public static int glGetQueryi(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryiv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetQueryObjectuiv ] ---

	/** Unsafe version of {@link #glGetQueryObjectuiv GetQueryObjectuiv} */
	@JavadocExclude
	public static void nglGetQueryObjectuiv(int id, int pname, long params) {
		long __functionAddress = getInstance().GetQueryObjectuiv;
		callIIPV(__functionAddress, id, pname, params);
	}

	public static void glGetQueryObjectuiv(int id, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetQueryObjectuiv(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjectuiv GetQueryObjectuiv} */
	public static void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectuiv(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjectuiv GetQueryObjectuiv} */
	public static int glGetQueryObjectui(int id, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryObjectuiv(id, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glUnmapBuffer ] ---

	public static boolean glUnmapBuffer(int target) {
		long __functionAddress = getInstance().UnmapBuffer;
		return callIZ(__functionAddress, target);
	}

	// --- [ glGetBufferPointerv ] ---

	/** Unsafe version of {@link #glGetBufferPointerv GetBufferPointerv} */
	@JavadocExclude
	public static void nglGetBufferPointerv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetBufferPointerv;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetBufferPointerv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << POINTER_SHIFT);
		nglGetBufferPointerv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetBufferPointerv GetBufferPointerv} */
	public static void glGetBufferPointerv(int target, int pname, PointerBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetBufferPointerv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetBufferPointerv GetBufferPointerv} */
	public static long glGetBufferPointer(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.pointerParam();
		nglGetBufferPointerv(target, pname, __buffer.address(params));
		return __buffer.pointerValue(params);
	}

	// --- [ glDrawBuffers ] ---

	/** Unsafe version of {@link #glDrawBuffers DrawBuffers} */
	@JavadocExclude
	public static void nglDrawBuffers(int n, long bufs) {
		long __functionAddress = getInstance().DrawBuffers;
		callIPV(__functionAddress, n, bufs);
	}

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

	// --- [ glUniformMatrix2x3fv ] ---

	/** Unsafe version of {@link #glUniformMatrix2x3fv UniformMatrix2x3fv} */
	@JavadocExclude
	public static void nglUniformMatrix2x3fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2x3fv;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix2x3fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglUniformMatrix2x3fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2x3fv UniformMatrix2x3fv} */
	public static void glUniformMatrix2x3fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix2x3fv(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x2fv ] ---

	/** Unsafe version of {@link #glUniformMatrix3x2fv UniformMatrix3x2fv} */
	@JavadocExclude
	public static void nglUniformMatrix3x2fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3x2fv;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix3x2fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglUniformMatrix3x2fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3x2fv UniformMatrix3x2fv} */
	public static void glUniformMatrix3x2fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix3x2fv(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix2x4fv ] ---

	/** Unsafe version of {@link #glUniformMatrix2x4fv UniformMatrix2x4fv} */
	@JavadocExclude
	public static void nglUniformMatrix2x4fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2x4fv;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix2x4fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglUniformMatrix2x4fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2x4fv UniformMatrix2x4fv} */
	public static void glUniformMatrix2x4fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix2x4fv(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x2fv ] ---

	/** Unsafe version of {@link #glUniformMatrix4x2fv UniformMatrix4x2fv} */
	@JavadocExclude
	public static void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4x2fv;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix4x2fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglUniformMatrix4x2fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4x2fv UniformMatrix4x2fv} */
	public static void glUniformMatrix4x2fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4x2fv(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x4fv ] ---

	/** Unsafe version of {@link #glUniformMatrix3x4fv UniformMatrix3x4fv} */
	@JavadocExclude
	public static void nglUniformMatrix3x4fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3x4fv;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix3x4fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglUniformMatrix3x4fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3x4fv UniformMatrix3x4fv} */
	public static void glUniformMatrix3x4fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix3x4fv(location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x3fv ] ---

	/** Unsafe version of {@link #glUniformMatrix4x3fv UniformMatrix4x3fv} */
	@JavadocExclude
	public static void nglUniformMatrix4x3fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4x3fv;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix4x3fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglUniformMatrix4x3fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4x3fv UniformMatrix4x3fv} */
	public static void glUniformMatrix4x3fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4x3fv(location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glBlitFramebuffer ] ---

	public static void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = getInstance().BlitFramebuffer;
		callIIIIIIIIIIV(__functionAddress, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}

	// --- [ glRenderbufferStorageMultisample ] ---

	public static void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
		long __functionAddress = getInstance().RenderbufferStorageMultisample;
		callIIIIIV(__functionAddress, target, samples, internalformat, width, height);
	}

	// --- [ glFramebufferTextureLayer ] ---

	public static void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
		long __functionAddress = getInstance().FramebufferTextureLayer;
		callIIIIIV(__functionAddress, target, attachment, texture, level, layer);
	}

	// --- [ glMapBufferRange ] ---

	/** Unsafe version of {@link #glMapBufferRange MapBufferRange} */
	@JavadocExclude
	public static long nglMapBufferRange(int target, long offset, long length, int access) {
		long __functionAddress = getInstance().MapBufferRange;
		return callIPPIP(__functionAddress, target, offset, length, access);
	}

	public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access) {
		long __result = nglMapBufferRange(target, offset, length, access);
		return memByteBuffer(__result, (int)length);
	}

	/** Alternative version of: {@link #glMapBufferRange MapBufferRange} */
	public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer) {
		long __result = nglMapBufferRange(target, offset, length, access);
		return old_buffer == null ? memByteBuffer(__result, (int)length) : memSetupBuffer(old_buffer, __result, (int)length);
	}

	// --- [ glFlushMappedBufferRange ] ---

	public static void glFlushMappedBufferRange(int target, long offset, long length) {
		long __functionAddress = getInstance().FlushMappedBufferRange;
		callIPPV(__functionAddress, target, offset, length);
	}

	// --- [ glBindVertexArray ] ---

	public static void glBindVertexArray(int array) {
		long __functionAddress = getInstance().BindVertexArray;
		callIV(__functionAddress, array);
	}

	// --- [ glDeleteVertexArrays ] ---

	/** Unsafe version of {@link #glDeleteVertexArrays DeleteVertexArrays} */
	@JavadocExclude
	public static void nglDeleteVertexArrays(int n, long arrays) {
		long __functionAddress = getInstance().DeleteVertexArrays;
		callIPV(__functionAddress, n, arrays);
	}

	public static void glDeleteVertexArrays(int n, ByteBuffer arrays) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(arrays, n << 2);
		nglDeleteVertexArrays(n, memAddress(arrays));
	}

	/** Alternative version of: {@link #glDeleteVertexArrays DeleteVertexArrays} */
	public static void glDeleteVertexArrays(IntBuffer arrays) {
		nglDeleteVertexArrays(arrays.remaining(), memAddress(arrays));
	}

	/** Single value version of: {@link #glDeleteVertexArrays DeleteVertexArrays} */
	public static void glDeleteVertexArrays(int array) {
		APIBuffer __buffer = apiBuffer();
		int arrays = __buffer.intParam(array);
		nglDeleteVertexArrays(1, __buffer.address(arrays));
	}

	// --- [ glGenVertexArrays ] ---

	/** Unsafe version of {@link #glGenVertexArrays GenVertexArrays} */
	@JavadocExclude
	public static void nglGenVertexArrays(int n, long arrays) {
		long __functionAddress = getInstance().GenVertexArrays;
		callIPV(__functionAddress, n, arrays);
	}

	public static void glGenVertexArrays(int n, ByteBuffer arrays) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(arrays, n << 2);
		nglGenVertexArrays(n, memAddress(arrays));
	}

	/** Alternative version of: {@link #glGenVertexArrays GenVertexArrays} */
	public static void glGenVertexArrays(IntBuffer arrays) {
		nglGenVertexArrays(arrays.remaining(), memAddress(arrays));
	}

	/** Single return value version of: {@link #glGenVertexArrays GenVertexArrays} */
	public static int glGenVertexArrays() {
		APIBuffer __buffer = apiBuffer();
		int arrays = __buffer.intParam();
		nglGenVertexArrays(1, __buffer.address(arrays));
		return __buffer.intValue(arrays);
	}

	// --- [ glIsVertexArray ] ---

	public static boolean glIsVertexArray(int array) {
		long __functionAddress = getInstance().IsVertexArray;
		return callIZ(__functionAddress, array);
	}

	// --- [ glGetIntegeri_v ] ---

	/** Unsafe version of {@link #glGetIntegeri_v GetIntegeri_v} */
	@JavadocExclude
	public static void nglGetIntegeri_v(int target, int index, long data) {
		long __functionAddress = getInstance().GetIntegeri_v;
		callIIPV(__functionAddress, target, index, data);
	}

	public static void glGetIntegeri_v(int target, int index, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1 << 2);
		nglGetIntegeri_v(target, index, memAddress(data));
	}

	/** Alternative version of: {@link #glGetIntegeri_v GetIntegeri_v} */
	public static void glGetIntegeri_v(int target, int index, IntBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetIntegeri_v(target, index, memAddress(data));
	}

	/** Single return value version of: {@link #glGetIntegeri_v GetIntegeri_v} */
	public static int glGetIntegeri(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetIntegeri_v(target, index, __buffer.address(data));
		return __buffer.intValue(data);
	}

	// --- [ glBeginTransformFeedback ] ---

	public static void glBeginTransformFeedback(int primitiveMode) {
		long __functionAddress = getInstance().BeginTransformFeedback;
		callIV(__functionAddress, primitiveMode);
	}

	// --- [ glEndTransformFeedback ] ---

	public static void glEndTransformFeedback() {
		long __functionAddress = getInstance().EndTransformFeedback;
		callV(__functionAddress);
	}

	// --- [ glBindBufferRange ] ---

	public static void glBindBufferRange(int target, int index, int buffer, long offset, long size) {
		long __functionAddress = getInstance().BindBufferRange;
		callIIIPPV(__functionAddress, target, index, buffer, offset, size);
	}

	// --- [ glBindBufferBase ] ---

	public static void glBindBufferBase(int target, int index, int buffer) {
		long __functionAddress = getInstance().BindBufferBase;
		callIIIV(__functionAddress, target, index, buffer);
	}

	// --- [ glTransformFeedbackVaryings ] ---

	/** Unsafe version of {@link #glTransformFeedbackVaryings TransformFeedbackVaryings} */
	@JavadocExclude
	public static void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode) {
		long __functionAddress = getInstance().TransformFeedbackVaryings;
		callIIPIV(__functionAddress, program, count, varyings, bufferMode);
	}

	public static void glTransformFeedbackVaryings(int program, int count, ByteBuffer varyings, int bufferMode) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(varyings, count << POINTER_SHIFT);
		nglTransformFeedbackVaryings(program, count, memAddress(varyings), bufferMode);
	}

	/** Alternative version of: {@link #glTransformFeedbackVaryings TransformFeedbackVaryings} */
	public static void glTransformFeedbackVaryings(int program, PointerBuffer varyings, int bufferMode) {
		nglTransformFeedbackVaryings(program, varyings.remaining(), memAddress(varyings), bufferMode);
	}

	/** Array version of: {@link #glTransformFeedbackVaryings TransformFeedbackVaryings} */
	public static void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode) {
		APIBuffer __buffer = apiBuffer();
		int varyingsAddress = __buffer.pointerArrayParam(APIBuffer.stringArrayASCII(true, varyings));
		try {
			nglTransformFeedbackVaryings(program, varyings.length, __buffer.address(varyingsAddress), bufferMode);
		} finally {
			__buffer.pointerArrayFree(varyingsAddress, varyings.length);
		}
	}

	/** Single varying version of: {@link #glTransformFeedbackVaryings TransformFeedbackVaryings} */
	public static void glTransformFeedbackVaryings(int program, CharSequence varying, int bufferMode) {
		APIBuffer __buffer = apiBuffer();
		int varyingsAddress = __buffer.pointerArrayParam(APIBuffer.stringArrayASCII(true, varying));
		try {
			nglTransformFeedbackVaryings(program, 1, __buffer.address(varyingsAddress), bufferMode);
		} finally {
			__buffer.pointerArrayFree(varyingsAddress, 1);
		}
	}

	// --- [ glGetTransformFeedbackVarying ] ---

	/** Unsafe version of {@link #glGetTransformFeedbackVarying GetTransformFeedbackVarying} */
	@JavadocExclude
	public static void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name) {
		long __functionAddress = getInstance().GetTransformFeedbackVarying;
		callIIIPPPPV(__functionAddress, program, index, bufSize, length, size, type, name);
	}

	public static void glGetTransformFeedbackVarying(int program, int index, int bufSize, ByteBuffer length, ByteBuffer size, ByteBuffer type, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
			checkBuffer(size, 1 << 2);
			checkBuffer(type, 1 << 2);
		}
		nglGetTransformFeedbackVarying(program, index, bufSize, memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** Alternative version of: {@link #glGetTransformFeedbackVarying GetTransformFeedbackVarying} */
	public static void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetTransformFeedbackVarying(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** String return version of: {@link #glGetTransformFeedbackVarying GetTransformFeedbackVarying} */
	public static String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetTransformFeedbackVarying(program, index, bufSize, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(__buffer.buffer(), __buffer.intValue(length), name);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetTransformFeedbackVarying GetTransformFeedbackVarying} */
	public static String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type) {
		int bufSize = GLES20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH);
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetTransformFeedbackVarying(program, index, bufSize, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(__buffer.buffer(), __buffer.intValue(length), name);
	}

	// --- [ glVertexAttribIPointer ] ---

	/** Unsafe version of {@link #glVertexAttribIPointer VertexAttribIPointer} */
	@JavadocExclude
	public static void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
		long __functionAddress = getInstance().VertexAttribIPointer;
		callIIIIPV(__functionAddress, index, size, type, stride, pointer);
	}

	public static void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glVertexAttribIPointer VertexAttribIPointer} */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, long pointerOffset) {
		nglVertexAttribIPointer(index, size, type, stride, pointerOffset);
	}

	/** ShortBuffer version of: {@link #glVertexAttribIPointer VertexAttribIPointer} */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer) {
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
	}

	/** IntBuffer version of: {@link #glVertexAttribIPointer VertexAttribIPointer} */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer) {
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
	}

	// --- [ glGetVertexAttribIiv ] ---

	/** Unsafe version of {@link #glGetVertexAttribIiv GetVertexAttribIiv} */
	@JavadocExclude
	public static void nglGetVertexAttribIiv(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribIiv;
		callIIPV(__functionAddress, index, pname, params);
	}

	public static void glGetVertexAttribIiv(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetVertexAttribIiv(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribIiv GetVertexAttribIiv} */
	public static void glGetVertexAttribIiv(int index, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetVertexAttribIiv(index, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetVertexAttribIiv GetVertexAttribIiv} */
	public static int glGetVertexAttribIi(int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetVertexAttribIiv(index, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetVertexAttribIuiv ] ---

	/** Unsafe version of {@link #glGetVertexAttribIuiv GetVertexAttribIuiv} */
	@JavadocExclude
	public static void nglGetVertexAttribIuiv(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribIuiv;
		callIIPV(__functionAddress, index, pname, params);
	}

	public static void glGetVertexAttribIuiv(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetVertexAttribIuiv(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribIuiv GetVertexAttribIuiv} */
	public static void glGetVertexAttribIuiv(int index, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetVertexAttribIuiv(index, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetVertexAttribIuiv GetVertexAttribIuiv} */
	public static int glGetVertexAttribIui(int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetVertexAttribIuiv(index, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glVertexAttribI4i ] ---

	public static void glVertexAttribI4i(int index, int x, int y, int z, int w) {
		long __functionAddress = getInstance().VertexAttribI4i;
		callIIIIIV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribI4ui ] ---

	public static void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
		long __functionAddress = getInstance().VertexAttribI4ui;
		callIIIIIV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribI4iv ] ---

	/** Unsafe version of {@link #glVertexAttribI4iv VertexAttribI4iv} */
	@JavadocExclude
	public static void nglVertexAttribI4iv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4iv;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttribI4iv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttribI4iv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI4iv VertexAttribI4iv} */
	public static void glVertexAttribI4iv(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4iv(index, memAddress(v));
	}

	// --- [ glVertexAttribI4uiv ] ---

	/** Unsafe version of {@link #glVertexAttribI4uiv VertexAttribI4uiv} */
	@JavadocExclude
	public static void nglVertexAttribI4uiv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4uiv;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttribI4uiv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttribI4uiv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI4uiv VertexAttribI4uiv} */
	public static void glVertexAttribI4uiv(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4uiv(index, memAddress(v));
	}

	// --- [ glGetUniformuiv ] ---

	/** Unsafe version of {@link #glGetUniformuiv GetUniformuiv} */
	@JavadocExclude
	public static void nglGetUniformuiv(int program, int location, long params) {
		long __functionAddress = getInstance().GetUniformuiv;
		callIIPV(__functionAddress, program, location, params);
	}

	public static void glGetUniformuiv(int program, int location, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetUniformuiv(program, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformuiv GetUniformuiv} */
	public static void glGetUniformuiv(int program, int location, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetUniformuiv(program, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformuiv GetUniformuiv} */
	public static int glGetUniformui(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetUniformuiv(program, location, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetFragDataLocation ] ---

	/** Unsafe version of {@link #glGetFragDataLocation GetFragDataLocation} */
	@JavadocExclude
	public static int nglGetFragDataLocation(int program, long name) {
		long __functionAddress = getInstance().GetFragDataLocation;
		return callIPI(__functionAddress, program, name);
	}

	public static int glGetFragDataLocation(int program, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetFragDataLocation(program, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetFragDataLocation GetFragDataLocation} */
	public static int glGetFragDataLocation(int program, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetFragDataLocation(program, __buffer.address(nameEncoded));
	}

	// --- [ glUniform1ui ] ---

	public static void glUniform1ui(int location, int v0) {
		long __functionAddress = getInstance().Uniform1ui;
		callIIV(__functionAddress, location, v0);
	}

	// --- [ glUniform2ui ] ---

	public static void glUniform2ui(int location, int v0, int v1) {
		long __functionAddress = getInstance().Uniform2ui;
		callIIIV(__functionAddress, location, v0, v1);
	}

	// --- [ glUniform3ui ] ---

	public static void glUniform3ui(int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().Uniform3ui;
		callIIIIV(__functionAddress, location, v0, v1, v2);
	}

	// --- [ glUniform4ui ] ---

	public static void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().Uniform4ui;
		callIIIIIV(__functionAddress, location, v0, v1, v2, v3);
	}

	// --- [ glUniform1uiv ] ---

	/** Unsafe version of {@link #glUniform1uiv Uniform1uiv} */
	@JavadocExclude
	public static void nglUniform1uiv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform1uiv;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform1uiv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglUniform1uiv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1uiv Uniform1uiv} */
	public static void glUniform1uiv(int location, IntBuffer value) {
		nglUniform1uiv(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2uiv ] ---

	/** Unsafe version of {@link #glUniform2uiv Uniform2uiv} */
	@JavadocExclude
	public static void nglUniform2uiv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform2uiv;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform2uiv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglUniform2uiv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2uiv Uniform2uiv} */
	public static void glUniform2uiv(int location, IntBuffer value) {
		nglUniform2uiv(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3uiv ] ---

	/** Unsafe version of {@link #glUniform3uiv Uniform3uiv} */
	@JavadocExclude
	public static void nglUniform3uiv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform3uiv;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform3uiv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglUniform3uiv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3uiv Uniform3uiv} */
	public static void glUniform3uiv(int location, IntBuffer value) {
		nglUniform3uiv(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4uiv ] ---

	/** Unsafe version of {@link #glUniform4uiv Uniform4uiv} */
	@JavadocExclude
	public static void nglUniform4uiv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform4uiv;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform4uiv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglUniform4uiv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4uiv Uniform4uiv} */
	public static void glUniform4uiv(int location, IntBuffer value) {
		nglUniform4uiv(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glClearBufferiv ] ---

	/** Unsafe version of {@link #glClearBufferiv ClearBufferiv} */
	@JavadocExclude
	public static void nglClearBufferiv(int buffer, int drawbuffer, long value) {
		long __functionAddress = getInstance().ClearBufferiv;
		callIIPV(__functionAddress, buffer, drawbuffer, value);
	}

	public static void glClearBufferiv(int buffer, int drawbuffer, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglClearBufferiv(buffer, drawbuffer, memAddress(value));
	}

	/** Alternative version of: {@link #glClearBufferiv ClearBufferiv} */
	public static void glClearBufferiv(int buffer, int drawbuffer, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglClearBufferiv(buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearBufferuiv ] ---

	/** Unsafe version of {@link #glClearBufferuiv ClearBufferuiv} */
	@JavadocExclude
	public static void nglClearBufferuiv(int buffer, int drawbuffer, long value) {
		long __functionAddress = getInstance().ClearBufferuiv;
		callIIPV(__functionAddress, buffer, drawbuffer, value);
	}

	public static void glClearBufferuiv(int buffer, int drawbuffer, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglClearBufferuiv(buffer, drawbuffer, memAddress(value));
	}

	/** Alternative version of: {@link #glClearBufferuiv ClearBufferuiv} */
	public static void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglClearBufferuiv(buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearBufferfv ] ---

	/** Unsafe version of {@link #glClearBufferfv ClearBufferfv} */
	@JavadocExclude
	public static void nglClearBufferfv(int buffer, int drawbuffer, long value) {
		long __functionAddress = getInstance().ClearBufferfv;
		callIIPV(__functionAddress, buffer, drawbuffer, value);
	}

	public static void glClearBufferfv(int buffer, int drawbuffer, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglClearBufferfv(buffer, drawbuffer, memAddress(value));
	}

	/** Alternative version of: {@link #glClearBufferfv ClearBufferfv} */
	public static void glClearBufferfv(int buffer, int drawbuffer, FloatBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglClearBufferfv(buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearBufferfi ] ---

	public static void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
		long __functionAddress = getInstance().ClearBufferfi;
		callIIFIV(__functionAddress, buffer, drawbuffer, depth, stencil);
	}

	// --- [ glGetStringi ] ---

	/** Unsafe version of {@link #glGetStringi GetStringi} */
	@JavadocExclude
	public static long nglGetStringi(int name, int index) {
		long __functionAddress = getInstance().GetStringi;
		return callIIP(__functionAddress, name, index);
	}

	public static String glGetStringi(int name, int index) {
		long __result = nglGetStringi(name, index);
		return memDecodeUTF8(__result);
	}

	// --- [ glCopyBufferSubData ] ---

	public static void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
		long __functionAddress = getInstance().CopyBufferSubData;
		callIIPPPV(__functionAddress, readTarget, writeTarget, readOffset, writeOffset, size);
	}

	// --- [ glGetUniformIndices ] ---

	/** Unsafe version of {@link #glGetUniformIndices GetUniformIndices} */
	@JavadocExclude
	public static void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices) {
		long __functionAddress = getInstance().GetUniformIndices;
		callIIPPV(__functionAddress, program, uniformCount, uniformNames, uniformIndices);
	}

	public static void glGetUniformIndices(int program, int uniformCount, ByteBuffer uniformNames, ByteBuffer uniformIndices) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(uniformNames, uniformCount << POINTER_SHIFT);
			checkBuffer(uniformIndices, uniformCount << 2);
		}
		nglGetUniformIndices(program, uniformCount, memAddress(uniformNames), memAddress(uniformIndices));
	}

	/** Alternative version of: {@link #glGetUniformIndices GetUniformIndices} */
	public static void glGetUniformIndices(int program, PointerBuffer uniformNames, IntBuffer uniformIndices) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(uniformIndices, uniformNames.remaining());
		nglGetUniformIndices(program, uniformNames.remaining(), memAddress(uniformNames), memAddress(uniformIndices));
	}

	// --- [ glGetActiveUniformsiv ] ---

	/** Unsafe version of {@link #glGetActiveUniformsiv GetActiveUniformsiv} */
	@JavadocExclude
	public static void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params) {
		long __functionAddress = getInstance().GetActiveUniformsiv;
		callIIPIPV(__functionAddress, program, uniformCount, uniformIndices, pname, params);
	}

	public static void glGetActiveUniformsiv(int program, int uniformCount, ByteBuffer uniformIndices, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(uniformIndices, uniformCount << 2);
			checkBuffer(params, uniformCount << 2);
		}
		nglGetActiveUniformsiv(program, uniformCount, memAddress(uniformIndices), pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetActiveUniformsiv GetActiveUniformsiv} */
	public static void glGetActiveUniformsiv(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, uniformIndices.remaining());
		nglGetActiveUniformsiv(program, uniformIndices.remaining(), memAddress(uniformIndices), pname, memAddress(params));
	}

	// --- [ glGetUniformBlockIndex ] ---

	/** Unsafe version of {@link #glGetUniformBlockIndex GetUniformBlockIndex} */
	@JavadocExclude
	public static int nglGetUniformBlockIndex(int program, long uniformBlockName) {
		long __functionAddress = getInstance().GetUniformBlockIndex;
		return callIPI(__functionAddress, program, uniformBlockName);
	}

	public static int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(uniformBlockName);
		return nglGetUniformBlockIndex(program, memAddress(uniformBlockName));
	}

	/** CharSequence version of: {@link #glGetUniformBlockIndex GetUniformBlockIndex} */
	public static int glGetUniformBlockIndex(int program, CharSequence uniformBlockName) {
		APIBuffer __buffer = apiBuffer();
		int uniformBlockNameEncoded = __buffer.stringParamASCII(uniformBlockName, true);
		return nglGetUniformBlockIndex(program, __buffer.address(uniformBlockNameEncoded));
	}

	// --- [ glGetActiveUniformBlockiv ] ---

	/** Unsafe version of {@link #glGetActiveUniformBlockiv GetActiveUniformBlockiv} */
	@JavadocExclude
	public static void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params) {
		long __functionAddress = getInstance().GetActiveUniformBlockiv;
		callIIIPV(__functionAddress, program, uniformBlockIndex, pname, params);
	}

	public static void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetActiveUniformBlockiv GetActiveUniformBlockiv} */
	public static void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetActiveUniformBlockiv GetActiveUniformBlockiv} */
	public static int glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetActiveUniformBlockName ] ---

	/** Unsafe version of {@link #glGetActiveUniformBlockName GetActiveUniformBlockName} */
	@JavadocExclude
	public static void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName) {
		long __functionAddress = getInstance().GetActiveUniformBlockName;
		callIIIPPV(__functionAddress, program, uniformBlockIndex, bufSize, length, uniformBlockName);
	}

	public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, ByteBuffer length, ByteBuffer uniformBlockName) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(uniformBlockName, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, memAddressSafe(length), memAddress(uniformBlockName));
	}

	/** Alternative version of: {@link #glGetActiveUniformBlockName GetActiveUniformBlockName} */
	public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetActiveUniformBlockName(program, uniformBlockIndex, uniformBlockName.remaining(), memAddressSafe(length), memAddress(uniformBlockName));
	}

	/** String return version of: {@link #glGetActiveUniformBlockName GetActiveUniformBlockName} */
	public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int uniformBlockName = __buffer.bufferParam(bufSize);
		nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, __buffer.address(length), __buffer.address(uniformBlockName));
		return memDecodeASCII(__buffer.buffer(), __buffer.intValue(length), uniformBlockName);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveUniformBlockName GetActiveUniformBlockName} */
	public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
		int bufSize = glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int uniformBlockName = __buffer.bufferParam(bufSize);
		nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, __buffer.address(length), __buffer.address(uniformBlockName));
		return memDecodeASCII(__buffer.buffer(), __buffer.intValue(length), uniformBlockName);
	}

	// --- [ glUniformBlockBinding ] ---

	public static void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
		long __functionAddress = getInstance().UniformBlockBinding;
		callIIIV(__functionAddress, program, uniformBlockIndex, uniformBlockBinding);
	}

	// --- [ glDrawArraysInstanced ] ---

	public static void glDrawArraysInstanced(int mode, int first, int count, int instancecount) {
		long __functionAddress = getInstance().DrawArraysInstanced;
		callIIIIV(__functionAddress, mode, first, count, instancecount);
	}

	// --- [ glDrawElementsInstanced ] ---

	/** Unsafe version of {@link #glDrawElementsInstanced DrawElementsInstanced} */
	@JavadocExclude
	public static void nglDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount) {
		long __functionAddress = getInstance().DrawElementsInstanced;
		callIIIPIV(__functionAddress, mode, count, type, indices, instancecount);
	}

	public static void glDrawElementsInstanced(int mode, int count, int type, ByteBuffer indices, int instancecount) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, count << GLESChecks.typeToByteShift(type));
		nglDrawElementsInstanced(mode, count, type, memAddress(indices), instancecount);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstanced DrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, int count, int type, long indicesOffset, int instancecount) {
		nglDrawElementsInstanced(mode, count, type, indicesOffset, instancecount);
	}

	/** Alternative version of: {@link #glDrawElementsInstanced DrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, int type, ByteBuffer indices, int instancecount) {
		nglDrawElementsInstanced(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstanced DrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, ByteBuffer indices, int instancecount) {
		nglDrawElementsInstanced(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstanced DrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, ShortBuffer indices, int instancecount) {
		nglDrawElementsInstanced(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstanced DrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, IntBuffer indices, int instancecount) {
		nglDrawElementsInstanced(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount);
	}

	// --- [ glFenceSync ] ---

	public static long glFenceSync(int condition, int flags) {
		long __functionAddress = getInstance().FenceSync;
		return callIIP(__functionAddress, condition, flags);
	}

	// --- [ glIsSync ] ---

	public static boolean glIsSync(long sync) {
		long __functionAddress = getInstance().IsSync;
		if ( LWJGLUtil.CHECKS )
			checkPointer(sync);
		return callPZ(__functionAddress, sync);
	}

	// --- [ glDeleteSync ] ---

	public static void glDeleteSync(long sync) {
		long __functionAddress = getInstance().DeleteSync;
		if ( LWJGLUtil.CHECKS )
			checkPointer(sync);
		callPV(__functionAddress, sync);
	}

	// --- [ glClientWaitSync ] ---

	public static int glClientWaitSync(long sync, int flags, long timeout) {
		long __functionAddress = getInstance().ClientWaitSync;
		if ( LWJGLUtil.CHECKS )
			checkPointer(sync);
		return callPIJI(__functionAddress, sync, flags, timeout);
	}

	// --- [ glWaitSync ] ---

	public static void glWaitSync(long sync, int flags, long timeout) {
		long __functionAddress = getInstance().WaitSync;
		if ( LWJGLUtil.CHECKS )
			checkPointer(sync);
		callPIJV(__functionAddress, sync, flags, timeout);
	}

	// --- [ glGetInteger64v ] ---

	/** Unsafe version of {@link #glGetInteger64v GetInteger64v} */
	@JavadocExclude
	public static void nglGetInteger64v(int pname, long data) {
		long __functionAddress = getInstance().GetInteger64v;
		callIPV(__functionAddress, pname, data);
	}

	public static void glGetInteger64v(int pname, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1 << 3);
		nglGetInteger64v(pname, memAddress(data));
	}

	/** Alternative version of: {@link #glGetInteger64v GetInteger64v} */
	public static void glGetInteger64v(int pname, LongBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetInteger64v(pname, memAddress(data));
	}

	/** Single return value version of: {@link #glGetInteger64v GetInteger64v} */
	public static long glGetInteger64(int pname) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.longParam();
		nglGetInteger64v(pname, __buffer.address(data));
		return __buffer.longValue(data);
	}

	// --- [ glGetSynciv ] ---

	/** Unsafe version of {@link #glGetSynciv GetSynciv} */
	@JavadocExclude
	public static void nglGetSynciv(long sync, int pname, int bufSize, long length, long values) {
		long __functionAddress = getInstance().GetSynciv;
		if ( LWJGLUtil.CHECKS )
			checkPointer(sync);
		callPIIPPV(__functionAddress, sync, pname, bufSize, length, values);
	}

	public static void glGetSynciv(long sync, int pname, int bufSize, ByteBuffer length, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(values, bufSize << 2);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetSynciv(sync, pname, bufSize, memAddressSafe(length), memAddress(values));
	}

	/** Alternative version of: {@link #glGetSynciv GetSynciv} */
	public static void glGetSynciv(long sync, int pname, IntBuffer length, IntBuffer values) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetSynciv(sync, pname, values.remaining(), memAddressSafe(length), memAddress(values));
	}

	/** Single return value version of: {@link #glGetSynciv GetSynciv} */
	public static int glGetSynci(long sync, int pname, IntBuffer length) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		APIBuffer __buffer = apiBuffer();
		int values = __buffer.intParam();
		nglGetSynciv(sync, pname, 1, memAddressSafe(length), __buffer.address(values));
		return __buffer.intValue(values);
	}

	// --- [ glGetInteger64i_v ] ---

	/** Unsafe version of {@link #glGetInteger64i_v GetInteger64i_v} */
	@JavadocExclude
	public static void nglGetInteger64i_v(int target, int index, long data) {
		long __functionAddress = getInstance().GetInteger64i_v;
		callIIPV(__functionAddress, target, index, data);
	}

	public static void glGetInteger64i_v(int target, int index, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1 << 3);
		nglGetInteger64i_v(target, index, memAddress(data));
	}

	/** Alternative version of: {@link #glGetInteger64i_v GetInteger64i_v} */
	public static void glGetInteger64i_v(int target, int index, LongBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetInteger64i_v(target, index, memAddress(data));
	}

	/** Single return value version of: {@link #glGetInteger64i_v GetInteger64i_v} */
	public static long glGetInteger64i(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.longParam();
		nglGetInteger64i_v(target, index, __buffer.address(data));
		return __buffer.longValue(data);
	}

	// --- [ glGetBufferParameteri64v ] ---

	/** Unsafe version of {@link #glGetBufferParameteri64v GetBufferParameteri64v} */
	@JavadocExclude
	public static void nglGetBufferParameteri64v(int target, int pname, long params) {
		long __functionAddress = getInstance().GetBufferParameteri64v;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetBufferParameteri64v(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetBufferParameteri64v(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetBufferParameteri64v GetBufferParameteri64v} */
	public static void glGetBufferParameteri64v(int target, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetBufferParameteri64v(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetBufferParameteri64v GetBufferParameteri64v} */
	public static long glGetBufferParameteri64(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetBufferParameteri64v(target, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGenSamplers ] ---

	/** Unsafe version of {@link #glGenSamplers GenSamplers} */
	@JavadocExclude
	public static void nglGenSamplers(int count, long samplers) {
		long __functionAddress = getInstance().GenSamplers;
		callIPV(__functionAddress, count, samplers);
	}

	public static void glGenSamplers(int count, ByteBuffer samplers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(samplers, count << 2);
		nglGenSamplers(count, memAddress(samplers));
	}

	/** Alternative version of: {@link #glGenSamplers GenSamplers} */
	public static void glGenSamplers(IntBuffer samplers) {
		nglGenSamplers(samplers.remaining(), memAddress(samplers));
	}

	/** Single return value version of: {@link #glGenSamplers GenSamplers} */
	public static int glGenSamplers() {
		APIBuffer __buffer = apiBuffer();
		int samplers = __buffer.intParam();
		nglGenSamplers(1, __buffer.address(samplers));
		return __buffer.intValue(samplers);
	}

	// --- [ glDeleteSamplers ] ---

	/** Unsafe version of {@link #glDeleteSamplers DeleteSamplers} */
	@JavadocExclude
	public static void nglDeleteSamplers(int count, long samplers) {
		long __functionAddress = getInstance().DeleteSamplers;
		callIPV(__functionAddress, count, samplers);
	}

	public static void glDeleteSamplers(int count, ByteBuffer samplers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(samplers, count << 2);
		nglDeleteSamplers(count, memAddress(samplers));
	}

	/** Alternative version of: {@link #glDeleteSamplers DeleteSamplers} */
	public static void glDeleteSamplers(IntBuffer samplers) {
		nglDeleteSamplers(samplers.remaining(), memAddress(samplers));
	}

	/** Single value version of: {@link #glDeleteSamplers DeleteSamplers} */
	public static void glDeleteSamplers(int sampler) {
		APIBuffer __buffer = apiBuffer();
		int samplers = __buffer.intParam(sampler);
		nglDeleteSamplers(1, __buffer.address(samplers));
	}

	// --- [ glIsSampler ] ---

	public static boolean glIsSampler(int sampler) {
		long __functionAddress = getInstance().IsSampler;
		return callIZ(__functionAddress, sampler);
	}

	// --- [ glBindSampler ] ---

	public static void glBindSampler(int unit, int sampler) {
		long __functionAddress = getInstance().BindSampler;
		callIIV(__functionAddress, unit, sampler);
	}

	// --- [ glSamplerParameteri ] ---

	public static void glSamplerParameteri(int sampler, int pname, int param) {
		long __functionAddress = getInstance().SamplerParameteri;
		callIIIV(__functionAddress, sampler, pname, param);
	}

	// --- [ glSamplerParameteriv ] ---

	/** Unsafe version of {@link #glSamplerParameteriv SamplerParameteriv} */
	@JavadocExclude
	public static void nglSamplerParameteriv(int sampler, int pname, long param) {
		long __functionAddress = getInstance().SamplerParameteriv;
		callIIPV(__functionAddress, sampler, pname, param);
	}

	public static void glSamplerParameteriv(int sampler, int pname, ByteBuffer param) {
		nglSamplerParameteriv(sampler, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glSamplerParameteriv SamplerParameteriv} */
	public static void glSamplerParameteriv(int sampler, int pname, IntBuffer param) {
		nglSamplerParameteriv(sampler, pname, memAddress(param));
	}

	// --- [ glSamplerParameterf ] ---

	public static void glSamplerParameterf(int sampler, int pname, float param) {
		long __functionAddress = getInstance().SamplerParameterf;
		callIIFV(__functionAddress, sampler, pname, param);
	}

	// --- [ glSamplerParameterfv ] ---

	/** Unsafe version of {@link #glSamplerParameterfv SamplerParameterfv} */
	@JavadocExclude
	public static void nglSamplerParameterfv(int sampler, int pname, long param) {
		long __functionAddress = getInstance().SamplerParameterfv;
		callIIPV(__functionAddress, sampler, pname, param);
	}

	public static void glSamplerParameterfv(int sampler, int pname, ByteBuffer param) {
		nglSamplerParameterfv(sampler, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glSamplerParameterfv SamplerParameterfv} */
	public static void glSamplerParameterfv(int sampler, int pname, FloatBuffer param) {
		nglSamplerParameterfv(sampler, pname, memAddress(param));
	}

	// --- [ glGetSamplerParameteriv ] ---

	/** Unsafe version of {@link #glGetSamplerParameteriv GetSamplerParameteriv} */
	@JavadocExclude
	public static void nglGetSamplerParameteriv(int sampler, int pname, long params) {
		long __functionAddress = getInstance().GetSamplerParameteriv;
		callIIPV(__functionAddress, sampler, pname, params);
	}

	public static void glGetSamplerParameteriv(int sampler, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetSamplerParameteriv(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv} */
	public static void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameteriv(sampler, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv} */
	public static int glGetSamplerParameteri(int sampler, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetSamplerParameteriv(sampler, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetSamplerParameterfv ] ---

	/** Unsafe version of {@link #glGetSamplerParameterfv GetSamplerParameterfv} */
	@JavadocExclude
	public static void nglGetSamplerParameterfv(int sampler, int pname, long params) {
		long __functionAddress = getInstance().GetSamplerParameterfv;
		callIIPV(__functionAddress, sampler, pname, params);
	}

	public static void glGetSamplerParameterfv(int sampler, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetSamplerParameterfv(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv} */
	public static void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterfv(sampler, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv} */
	public static float glGetSamplerParameterf(int sampler, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetSamplerParameterfv(sampler, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glVertexAttribDivisor ] ---

	public static void glVertexAttribDivisor(int index, int divisor) {
		long __functionAddress = getInstance().VertexAttribDivisor;
		callIIV(__functionAddress, index, divisor);
	}

	// --- [ glBindTransformFeedback ] ---

	public static void glBindTransformFeedback(int target, int id) {
		long __functionAddress = getInstance().BindTransformFeedback;
		callIIV(__functionAddress, target, id);
	}

	// --- [ glDeleteTransformFeedbacks ] ---

	/** Unsafe version of {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks} */
	@JavadocExclude
	public static void nglDeleteTransformFeedbacks(int n, long ids) {
		long __functionAddress = getInstance().DeleteTransformFeedbacks;
		callIPV(__functionAddress, n, ids);
	}

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

	/** Unsafe version of {@link #glGenTransformFeedbacks GenTransformFeedbacks} */
	@JavadocExclude
	public static void nglGenTransformFeedbacks(int n, long ids) {
		long __functionAddress = getInstance().GenTransformFeedbacks;
		callIPV(__functionAddress, n, ids);
	}

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

	public static boolean glIsTransformFeedback(int id) {
		long __functionAddress = getInstance().IsTransformFeedback;
		return callIZ(__functionAddress, id);
	}

	// --- [ glPauseTransformFeedback ] ---

	public static void glPauseTransformFeedback() {
		long __functionAddress = getInstance().PauseTransformFeedback;
		callV(__functionAddress);
	}

	// --- [ glResumeTransformFeedback ] ---

	public static void glResumeTransformFeedback() {
		long __functionAddress = getInstance().ResumeTransformFeedback;
		callV(__functionAddress);
	}

	// --- [ glGetProgramBinary ] ---

	/** Unsafe version of {@link #glGetProgramBinary GetProgramBinary} */
	@JavadocExclude
	public static void nglGetProgramBinary(int program, int bufSize, long length, long binaryFormat, long binary) {
		long __functionAddress = getInstance().GetProgramBinary;
		callIIPPPV(__functionAddress, program, bufSize, length, binaryFormat, binary);
	}

	public static void glGetProgramBinary(int program, int bufSize, ByteBuffer length, ByteBuffer binaryFormat, ByteBuffer binary) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(binary, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
			checkBuffer(binaryFormat, 1 << 2);
		}
		nglGetProgramBinary(program, bufSize, memAddressSafe(length), memAddress(binaryFormat), memAddress(binary));
	}

	/** Alternative version of: {@link #glGetProgramBinary GetProgramBinary} */
	public static void glGetProgramBinary(int program, IntBuffer length, IntBuffer binaryFormat, ByteBuffer binary) {
		if ( LWJGLUtil.CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(binaryFormat, 1);
		}
		nglGetProgramBinary(program, binary.remaining(), memAddressSafe(length), memAddress(binaryFormat), memAddress(binary));
	}

	/** Buffer return version of: {@link #glGetProgramBinary GetProgramBinary} */
	public static ByteBuffer glGetProgramBinary(int program, int bufSize, IntBuffer binaryFormat) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(binaryFormat, 1);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		ByteBuffer binary = BufferUtils.createByteBuffer(bufSize);
		nglGetProgramBinary(program, bufSize, __buffer.address(length), memAddress(binaryFormat), memAddress(binary));
		binary.limit(__buffer.intValue(length));
		return binary;
	}

	/** Buffer return (w/ implicit max length) version of: {@link #glGetProgramBinary GetProgramBinary} */
	public static ByteBuffer glGetProgramBinary(int program, IntBuffer binaryFormat) {
		int bufSize = GLES20.glGetProgrami(program, GL_PROGRAM_BINARY_LENGTH);
		if ( LWJGLUtil.CHECKS )
			checkBuffer(binaryFormat, 1);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		ByteBuffer binary = BufferUtils.createByteBuffer(bufSize);
		nglGetProgramBinary(program, bufSize, __buffer.address(length), memAddress(binaryFormat), memAddress(binary));
		binary.limit(__buffer.intValue(length));
		return binary;
	}

	// --- [ glProgramBinary ] ---

	/** Unsafe version of {@link #glProgramBinary ProgramBinary} */
	@JavadocExclude
	public static void nglProgramBinary(int program, int binaryFormat, long binary, int length) {
		long __functionAddress = getInstance().ProgramBinary;
		callIIPIV(__functionAddress, program, binaryFormat, binary, length);
	}

	public static void glProgramBinary(int program, int binaryFormat, ByteBuffer binary, int length) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(binary, length);
		nglProgramBinary(program, binaryFormat, memAddress(binary), length);
	}

	/** Alternative version of: {@link #glProgramBinary ProgramBinary} */
	public static void glProgramBinary(int program, int binaryFormat, ByteBuffer binary) {
		nglProgramBinary(program, binaryFormat, memAddress(binary), binary.remaining());
	}

	// --- [ glProgramParameteri ] ---

	public static void glProgramParameteri(int program, int pname, int value) {
		long __functionAddress = getInstance().ProgramParameteri;
		callIIIV(__functionAddress, program, pname, value);
	}

	// --- [ glInvalidateFramebuffer ] ---

	/** Unsafe version of {@link #glInvalidateFramebuffer InvalidateFramebuffer} */
	@JavadocExclude
	public static void nglInvalidateFramebuffer(int target, int numAttachments, long attachments) {
		long __functionAddress = getInstance().InvalidateFramebuffer;
		callIIPV(__functionAddress, target, numAttachments, attachments);
	}

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
		nglInvalidateFramebuffer(target, 1, __buffer.address(attachments));
	}

	// --- [ glInvalidateSubFramebuffer ] ---

	/** Unsafe version of {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer} */
	@JavadocExclude
	public static void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height) {
		long __functionAddress = getInstance().InvalidateSubFramebuffer;
		callIIPIIIIV(__functionAddress, target, numAttachments, attachments, x, y, width, height);
	}

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
		nglInvalidateSubFramebuffer(target, 1, __buffer.address(attachments), x, y, width, height);
	}

	// --- [ glTexStorage2D ] ---

	public static void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
		long __functionAddress = getInstance().TexStorage2D;
		callIIIIIV(__functionAddress, target, levels, internalformat, width, height);
	}

	// --- [ glTexStorage3D ] ---

	public static void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
		long __functionAddress = getInstance().TexStorage3D;
		callIIIIIIV(__functionAddress, target, levels, internalformat, width, height, depth);
	}

	// --- [ glGetInternalformativ ] ---

	/** Unsafe version of {@link #glGetInternalformativ GetInternalformativ} */
	@JavadocExclude
	public static void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params) {
		long __functionAddress = getInstance().GetInternalformativ;
		callIIIIPV(__functionAddress, target, internalformat, pname, bufSize, params);
	}

	public static void glGetInternalformativ(int target, int internalformat, int pname, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetInternalformativ(target, internalformat, pname, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetInternalformativ GetInternalformativ} */
	public static void glGetInternalformativ(int target, int internalformat, int pname, IntBuffer params) {
		nglGetInternalformativ(target, internalformat, pname, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetInternalformativ GetInternalformativ} */
	public static int glGetInternalformati(int target, int internalformat, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetInternalformativ(target, internalformat, pname, 1, __buffer.address(params));
		return __buffer.intValue(params);
	}

}