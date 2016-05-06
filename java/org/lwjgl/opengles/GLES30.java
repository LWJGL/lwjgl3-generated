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

/** The core OpenGL ES 3.0 functionality. */
public class GLES30 {

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

	protected GLES30() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glReadBuffer, caps.glDrawRangeElements, caps.glTexImage3D, caps.glTexSubImage3D, caps.glCopyTexSubImage3D, caps.glCompressedTexImage3D, 
			caps.glCompressedTexSubImage3D, caps.glGenQueries, caps.glDeleteQueries, caps.glIsQuery, caps.glBeginQuery, caps.glEndQuery, caps.glGetQueryiv, 
			caps.glGetQueryObjectuiv, caps.glUnmapBuffer, caps.glGetBufferPointerv, caps.glDrawBuffers, caps.glUniformMatrix2x3fv, caps.glUniformMatrix3x2fv, 
			caps.glUniformMatrix2x4fv, caps.glUniformMatrix4x2fv, caps.glUniformMatrix3x4fv, caps.glUniformMatrix4x3fv, caps.glBlitFramebuffer, 
			caps.glRenderbufferStorageMultisample, caps.glFramebufferTextureLayer, caps.glMapBufferRange, caps.glFlushMappedBufferRange, caps.glBindVertexArray, 
			caps.glDeleteVertexArrays, caps.glGenVertexArrays, caps.glIsVertexArray, caps.glGetIntegeri_v, caps.glBeginTransformFeedback, 
			caps.glEndTransformFeedback, caps.glBindBufferRange, caps.glBindBufferBase, caps.glTransformFeedbackVaryings, caps.glGetTransformFeedbackVarying, 
			caps.glVertexAttribIPointer, caps.glGetVertexAttribIiv, caps.glGetVertexAttribIuiv, caps.glVertexAttribI4i, caps.glVertexAttribI4ui, 
			caps.glVertexAttribI4iv, caps.glVertexAttribI4uiv, caps.glGetUniformuiv, caps.glGetFragDataLocation, caps.glUniform1ui, caps.glUniform2ui, 
			caps.glUniform3ui, caps.glUniform4ui, caps.glUniform1uiv, caps.glUniform2uiv, caps.glUniform3uiv, caps.glUniform4uiv, caps.glClearBufferiv, 
			caps.glClearBufferuiv, caps.glClearBufferfv, caps.glClearBufferfi, caps.glGetStringi, caps.glCopyBufferSubData, caps.glGetUniformIndices, 
			caps.glGetActiveUniformsiv, caps.glGetUniformBlockIndex, caps.glGetActiveUniformBlockiv, caps.glGetActiveUniformBlockName, 
			caps.glUniformBlockBinding, caps.glDrawArraysInstanced, caps.glDrawElementsInstanced, caps.glFenceSync, caps.glIsSync, caps.glDeleteSync, 
			caps.glClientWaitSync, caps.glWaitSync, caps.glGetInteger64v, caps.glGetSynciv, caps.glGetInteger64i_v, caps.glGetBufferParameteri64v, 
			caps.glGenSamplers, caps.glDeleteSamplers, caps.glIsSampler, caps.glBindSampler, caps.glSamplerParameteri, caps.glSamplerParameteriv, 
			caps.glSamplerParameterf, caps.glSamplerParameterfv, caps.glGetSamplerParameteriv, caps.glGetSamplerParameterfv, caps.glVertexAttribDivisor, 
			caps.glBindTransformFeedback, caps.glDeleteTransformFeedbacks, caps.glGenTransformFeedbacks, caps.glIsTransformFeedback, 
			caps.glPauseTransformFeedback, caps.glResumeTransformFeedback, caps.glGetProgramBinary, caps.glProgramBinary, caps.glProgramParameteri, 
			caps.glInvalidateFramebuffer, caps.glInvalidateSubFramebuffer, caps.glTexStorage2D, caps.glTexStorage3D, caps.glGetInternalformativ
		);
	}

	// --- [ glReadBuffer ] ---

	public static void glReadBuffer(int src) {
		long __functionAddress = GLES.getCapabilities().glReadBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, src);
	}

	// --- [ glDrawRangeElements ] ---

	public static void nglDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
		long __functionAddress = GLES.getCapabilities().glDrawRangeElements;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, start, end, count, type, indices);
	}

	public static void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawRangeElements(mode, start, end, count, type, indices);
	}

	public static void glDrawRangeElements(int mode, int start, int end, int type, ByteBuffer indices) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElements(mode, start, end, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices));
	}

	public static void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElements(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices));
	}

	public static void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElements(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices));
	}

	public static void glDrawRangeElements(int mode, int start, int end, IntBuffer indices) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElements(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices));
	}

	// --- [ glTexImage3D ] ---

	public static void nglTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage3D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	/** ShortBuffer version of: {@link #glTexImage3D TexImage3D} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glTexImage3D TexImage3D} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glTexImage3D TexImage3D} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glTexSubImage3D ] ---

	public static void nglTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage3D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** ShortBuffer version of: {@link #glTexSubImage3D TexSubImage3D} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTexSubImage3D TexSubImage3D} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTexSubImage3D TexSubImage3D} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	// --- [ glCopyTexSubImage3D ] ---

	public static void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		long __functionAddress = GLES.getCapabilities().glCopyTexSubImage3D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, level, xoffset, yoffset, zoffset, x, y, width, height);
	}

	// --- [ glCompressedTexImage3D ] ---

	public static void nglCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		long __functionAddress = GLES.getCapabilities().glCompressedTexImage3D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, imageSize, data);
	}

	public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
	}

	public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, data == null ? 0 : data.remaining(), memAddressSafe(data));
	}

	// --- [ glCompressedTexSubImage3D ] ---

	public static void nglCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		long __functionAddress = GLES.getCapabilities().glCompressedTexSubImage3D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
	}

	// --- [ glGenQueries ] ---

	public static void nglGenQueries(int n, long ids) {
		long __functionAddress = GLES.getCapabilities().glGenQueries;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, ids);
	}

	public static void glGenQueries(IntBuffer ids) {
		nglGenQueries(ids.remaining(), memAddress(ids));
	}

	public static int glGenQueries() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer ids = stack.callocInt(1);
			nglGenQueries(1, memAddress(ids));
			return ids.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDeleteQueries ] ---

	public static void nglDeleteQueries(int n, long ids) {
		long __functionAddress = GLES.getCapabilities().glDeleteQueries;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, ids);
	}

	public static void glDeleteQueries(IntBuffer ids) {
		nglDeleteQueries(ids.remaining(), memAddress(ids));
	}

	public static void glDeleteQueries(int id) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer ids = stack.ints(id);
			nglDeleteQueries(1, memAddress(ids));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsQuery ] ---

	public static boolean glIsQuery(int id) {
		long __functionAddress = GLES.getCapabilities().glIsQuery;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, id);
	}

	// --- [ glBeginQuery ] ---

	public static void glBeginQuery(int target, int id) {
		long __functionAddress = GLES.getCapabilities().glBeginQuery;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, id);
	}

	// --- [ glEndQuery ] ---

	public static void glEndQuery(int target) {
		long __functionAddress = GLES.getCapabilities().glEndQuery;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target);
	}

	// --- [ glGetQueryiv ] ---

	public static void nglGetQueryiv(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glGetQueryiv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryiv(target, pname, memAddress(params));
	}

	public static int glGetQueryi(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetQueryiv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetQueryObjectuiv ] ---

	public static void nglGetQueryObjectuiv(int id, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryObjectuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, id, pname, params);
	}

	public static void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectuiv(id, pname, memAddress(params));
	}

	public static int glGetQueryObjectui(int id, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetQueryObjectuiv(id, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glUnmapBuffer ] ---

	public static boolean glUnmapBuffer(int target) {
		long __functionAddress = GLES.getCapabilities().glUnmapBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, target);
	}

	// --- [ glGetBufferPointerv ] ---

	public static void nglGetBufferPointerv(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetBufferPointerv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glGetBufferPointerv(int target, int pname, PointerBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetBufferPointerv(target, pname, memAddress(params));
	}

	public static long glGetBufferPointer(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			PointerBuffer params = stack.callocPointer(1);
			nglGetBufferPointerv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDrawBuffers ] ---

	public static void nglDrawBuffers(int n, long bufs) {
		long __functionAddress = GLES.getCapabilities().glDrawBuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, bufs);
	}

	public static void glDrawBuffers(IntBuffer bufs) {
		nglDrawBuffers(bufs.remaining(), memAddress(bufs));
	}

	public static void glDrawBuffers(int buf) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer bufs = stack.ints(buf);
			nglDrawBuffers(1, memAddress(bufs));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glUniformMatrix2x3fv ] ---

	public static void nglUniformMatrix2x3fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix2x3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix2x3fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix2x3fv(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x2fv ] ---

	public static void nglUniformMatrix3x2fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix3x2fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix3x2fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix3x2fv(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix2x4fv ] ---

	public static void nglUniformMatrix2x4fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix2x4fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix2x4fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix2x4fv(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x2fv ] ---

	public static void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix4x2fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix4x2fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4x2fv(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x4fv ] ---

	public static void nglUniformMatrix3x4fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix3x4fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix3x4fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix3x4fv(location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x3fv ] ---

	public static void nglUniformMatrix4x3fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix4x3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix4x3fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4x3fv(location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glBlitFramebuffer ] ---

	public static void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = GLES.getCapabilities().glBlitFramebuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}

	// --- [ glRenderbufferStorageMultisample ] ---

	public static void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
		long __functionAddress = GLES.getCapabilities().glRenderbufferStorageMultisample;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, samples, internalformat, width, height);
	}

	// --- [ glFramebufferTextureLayer ] ---

	public static void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
		long __functionAddress = GLES.getCapabilities().glFramebufferTextureLayer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, attachment, texture, level, layer);
	}

	// --- [ glMapBufferRange ] ---

	public static long nglMapBufferRange(int target, long offset, long length, int access) {
		long __functionAddress = GLES.getCapabilities().glMapBufferRange;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPP(__functionAddress, target, offset, length, access);
	}

	public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access) {
		long __result = nglMapBufferRange(target, offset, length, access);
		return memByteBuffer(__result, (int)length);
	}

	public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer) {
		long __result = nglMapBufferRange(target, offset, length, access);
		return old_buffer == null ? memByteBuffer(__result, (int)length) : memSetupBuffer(old_buffer, __result, (int)length);
	}

	// --- [ glFlushMappedBufferRange ] ---

	public static void glFlushMappedBufferRange(int target, long offset, long length) {
		long __functionAddress = GLES.getCapabilities().glFlushMappedBufferRange;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, target, offset, length);
	}

	// --- [ glBindVertexArray ] ---

	public static void glBindVertexArray(int array) {
		long __functionAddress = GLES.getCapabilities().glBindVertexArray;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, array);
	}

	// --- [ glDeleteVertexArrays ] ---

	public static void nglDeleteVertexArrays(int n, long arrays) {
		long __functionAddress = GLES.getCapabilities().glDeleteVertexArrays;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, arrays);
	}

	public static void glDeleteVertexArrays(IntBuffer arrays) {
		nglDeleteVertexArrays(arrays.remaining(), memAddress(arrays));
	}

	public static void glDeleteVertexArrays(int array) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer arrays = stack.ints(array);
			nglDeleteVertexArrays(1, memAddress(arrays));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenVertexArrays ] ---

	public static void nglGenVertexArrays(int n, long arrays) {
		long __functionAddress = GLES.getCapabilities().glGenVertexArrays;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, arrays);
	}

	public static void glGenVertexArrays(IntBuffer arrays) {
		nglGenVertexArrays(arrays.remaining(), memAddress(arrays));
	}

	public static int glGenVertexArrays() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer arrays = stack.callocInt(1);
			nglGenVertexArrays(1, memAddress(arrays));
			return arrays.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsVertexArray ] ---

	public static boolean glIsVertexArray(int array) {
		long __functionAddress = GLES.getCapabilities().glIsVertexArray;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, array);
	}

	// --- [ glGetIntegeri_v ] ---

	public static void nglGetIntegeri_v(int target, int index, long data) {
		long __functionAddress = GLES.getCapabilities().glGetIntegeri_v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, data);
	}

	public static void glGetIntegeri_v(int target, int index, IntBuffer data) {
		if ( CHECKS )
			checkBuffer(data, 1);
		nglGetIntegeri_v(target, index, memAddress(data));
	}

	public static int glGetIntegeri(int target, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer data = stack.callocInt(1);
			nglGetIntegeri_v(target, index, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glBeginTransformFeedback ] ---

	public static void glBeginTransformFeedback(int primitiveMode) {
		long __functionAddress = GLES.getCapabilities().glBeginTransformFeedback;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, primitiveMode);
	}

	// --- [ glEndTransformFeedback ] ---

	public static void glEndTransformFeedback() {
		long __functionAddress = GLES.getCapabilities().glEndTransformFeedback;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

	// --- [ glBindBufferRange ] ---

	public static void glBindBufferRange(int target, int index, int buffer, long offset, long size) {
		long __functionAddress = GLES.getCapabilities().glBindBufferRange;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, target, index, buffer, offset, size);
	}

	// --- [ glBindBufferBase ] ---

	public static void glBindBufferBase(int target, int index, int buffer) {
		long __functionAddress = GLES.getCapabilities().glBindBufferBase;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index, buffer);
	}

	// --- [ glTransformFeedbackVaryings ] ---

	public static void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode) {
		long __functionAddress = GLES.getCapabilities().glTransformFeedbackVaryings;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, count, varyings, bufferMode);
	}

	public static void glTransformFeedbackVaryings(int program, PointerBuffer varyings, int bufferMode) {
		nglTransformFeedbackVaryings(program, varyings.remaining(), memAddress(varyings), bufferMode);
	}

	public static void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long varyingsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, varyings);
			nglTransformFeedbackVaryings(program, varyings.length, varyingsAddress, bufferMode);
			org.lwjgl.system.APIUtil.apiArrayFree(varyingsAddress, varyings.length);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	public static void glTransformFeedbackVaryings(int program, CharSequence varying, int bufferMode) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long varyingsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, varying);
			nglTransformFeedbackVaryings(program, 1, varyingsAddress, bufferMode);
			org.lwjgl.system.APIUtil.apiArrayFree(varyingsAddress, 1);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTransformFeedbackVarying ] ---

	public static void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name) {
		long __functionAddress = GLES.getCapabilities().glGetTransformFeedbackVarying;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPPV(__functionAddress, program, index, bufSize, length, size, type, name);
	}

	public static void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		if ( CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetTransformFeedbackVarying(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	public static String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
		if ( CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufSize);
			nglGetTransformFeedbackVarying(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	public static String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type) {
		int bufSize = GLES20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH);
		if ( CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufSize);
			nglGetTransformFeedbackVarying(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glVertexAttribIPointer ] ---

	public static void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribIPointer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, size, type, stride, pointer);
	}

	public static void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
	}

	public static void glVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ARRAY_BUFFER_BINDING, true);
		nglVertexAttribIPointer(index, size, type, stride, pointer);
	}

	/** ShortBuffer version of: {@link #glVertexAttribIPointer VertexAttribIPointer} */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
	}

	/** IntBuffer version of: {@link #glVertexAttribIPointer VertexAttribIPointer} */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
	}

	// --- [ glGetVertexAttribIiv ] ---

	public static void nglGetVertexAttribIiv(int index, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetVertexAttribIiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

	public static void glGetVertexAttribIiv(int index, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetVertexAttribIiv(index, pname, memAddress(params));
	}

	public static int glGetVertexAttribIi(int index, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetVertexAttribIiv(index, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetVertexAttribIuiv ] ---

	public static void nglGetVertexAttribIuiv(int index, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetVertexAttribIuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

	public static void glGetVertexAttribIuiv(int index, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetVertexAttribIuiv(index, pname, memAddress(params));
	}

	public static int glGetVertexAttribIui(int index, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetVertexAttribIuiv(index, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glVertexAttribI4i ] ---

	public static void glVertexAttribI4i(int index, int x, int y, int z, int w) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribI4i;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribI4ui ] ---

	public static void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribI4ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribI4iv ] ---

	public static void nglVertexAttribI4iv(int index, long v) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribI4iv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	public static void glVertexAttribI4iv(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4iv(index, memAddress(v));
	}

	// --- [ glVertexAttribI4uiv ] ---

	public static void nglVertexAttribI4uiv(int index, long v) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribI4uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	public static void glVertexAttribI4uiv(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4uiv(index, memAddress(v));
	}

	// --- [ glGetUniformuiv ] ---

	public static void nglGetUniformuiv(int program, int location, long params) {
		long __functionAddress = GLES.getCapabilities().glGetUniformuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params);
	}

	public static void glGetUniformuiv(int program, int location, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetUniformuiv(program, location, memAddress(params));
	}

	public static int glGetUniformui(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetUniformuiv(program, location, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetFragDataLocation ] ---

	public static int nglGetFragDataLocation(int program, long name) {
		long __functionAddress = GLES.getCapabilities().glGetFragDataLocation;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, program, name);
	}

	public static int glGetFragDataLocation(int program, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetFragDataLocation(program, memAddress(name));
	}

	public static int glGetFragDataLocation(int program, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetFragDataLocation(program, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glUniform1ui ] ---

	public static void glUniform1ui(int location, int v0) {
		long __functionAddress = GLES.getCapabilities().glUniform1ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, location, v0);
	}

	// --- [ glUniform2ui ] ---

	public static void glUniform2ui(int location, int v0, int v1) {
		long __functionAddress = GLES.getCapabilities().glUniform2ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, location, v0, v1);
	}

	// --- [ glUniform3ui ] ---

	public static void glUniform3ui(int location, int v0, int v1, int v2) {
		long __functionAddress = GLES.getCapabilities().glUniform3ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, location, v0, v1, v2);
	}

	// --- [ glUniform4ui ] ---

	public static void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = GLES.getCapabilities().glUniform4ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, location, v0, v1, v2, v3);
	}

	// --- [ glUniform1uiv ] ---

	public static void nglUniform1uiv(int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glUniform1uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform1uiv(int location, IntBuffer value) {
		nglUniform1uiv(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2uiv ] ---

	public static void nglUniform2uiv(int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glUniform2uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform2uiv(int location, IntBuffer value) {
		nglUniform2uiv(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3uiv ] ---

	public static void nglUniform3uiv(int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glUniform3uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform3uiv(int location, IntBuffer value) {
		nglUniform3uiv(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4uiv ] ---

	public static void nglUniform4uiv(int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glUniform4uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform4uiv(int location, IntBuffer value) {
		nglUniform4uiv(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glClearBufferiv ] ---

	public static void nglClearBufferiv(int buffer, int drawbuffer, long value) {
		long __functionAddress = GLES.getCapabilities().glClearBufferiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, drawbuffer, value);
	}

	public static void glClearBufferiv(int buffer, int drawbuffer, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglClearBufferiv(buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearBufferuiv ] ---

	public static void nglClearBufferuiv(int buffer, int drawbuffer, long value) {
		long __functionAddress = GLES.getCapabilities().glClearBufferuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, drawbuffer, value);
	}

	public static void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglClearBufferuiv(buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearBufferfv ] ---

	public static void nglClearBufferfv(int buffer, int drawbuffer, long value) {
		long __functionAddress = GLES.getCapabilities().glClearBufferfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, drawbuffer, value);
	}

	public static void glClearBufferfv(int buffer, int drawbuffer, FloatBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglClearBufferfv(buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearBufferfi ] ---

	public static void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
		long __functionAddress = GLES.getCapabilities().glClearBufferfi;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buffer, drawbuffer, depth, stencil);
	}

	// --- [ glGetStringi ] ---

	public static long nglGetStringi(int name, int index) {
		long __functionAddress = GLES.getCapabilities().glGetStringi;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callP(__functionAddress, name, index);
	}

	public static String glGetStringi(int name, int index) {
		long __result = nglGetStringi(name, index);
		return memUTF8(__result);
	}

	// --- [ glCopyBufferSubData ] ---

	public static void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
		long __functionAddress = GLES.getCapabilities().glCopyBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, readTarget, writeTarget, readOffset, writeOffset, size);
	}

	// --- [ glGetUniformIndices ] ---

	public static void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices) {
		long __functionAddress = GLES.getCapabilities().glGetUniformIndices;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, program, uniformCount, uniformNames, uniformIndices);
	}

	public static void glGetUniformIndices(int program, PointerBuffer uniformNames, IntBuffer uniformIndices) {
		if ( CHECKS )
			checkBuffer(uniformIndices, uniformNames.remaining());
		nglGetUniformIndices(program, uniformNames.remaining(), memAddress(uniformNames), memAddress(uniformIndices));
	}

	// --- [ glGetActiveUniformsiv ] ---

	public static void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetActiveUniformsiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, program, uniformCount, uniformIndices, pname, params);
	}

	public static void glGetActiveUniformsiv(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, uniformIndices.remaining());
		nglGetActiveUniformsiv(program, uniformIndices.remaining(), memAddress(uniformIndices), pname, memAddress(params));
	}

	// --- [ glGetUniformBlockIndex ] ---

	public static int nglGetUniformBlockIndex(int program, long uniformBlockName) {
		long __functionAddress = GLES.getCapabilities().glGetUniformBlockIndex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, program, uniformBlockName);
	}

	public static int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
		if ( CHECKS )
			checkNT1(uniformBlockName);
		return nglGetUniformBlockIndex(program, memAddress(uniformBlockName));
	}

	public static int glGetUniformBlockIndex(int program, CharSequence uniformBlockName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer uniformBlockNameEncoded = stack.ASCII(uniformBlockName);
			return nglGetUniformBlockIndex(program, memAddress(uniformBlockNameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetActiveUniformBlockiv ] ---

	public static void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetActiveUniformBlockiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, uniformBlockIndex, pname, params);
	}

	public static void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params));
	}

	public static int glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetActiveUniformBlockName ] ---

	public static void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName) {
		long __functionAddress = GLES.getCapabilities().glGetActiveUniformBlockName;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, program, uniformBlockIndex, bufSize, length, uniformBlockName);
	}

	public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetActiveUniformBlockName(program, uniformBlockIndex, uniformBlockName.remaining(), memAddressSafe(length), memAddress(uniformBlockName));
	}

	public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer uniformBlockName = stack.malloc(bufSize);
			nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, memAddress(length), memAddress(uniformBlockName));
			return memASCII(uniformBlockName, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
		int bufSize = glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer uniformBlockName = stack.malloc(bufSize);
			nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, memAddress(length), memAddress(uniformBlockName));
			return memASCII(uniformBlockName, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glUniformBlockBinding ] ---

	public static void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
		long __functionAddress = GLES.getCapabilities().glUniformBlockBinding;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, uniformBlockIndex, uniformBlockBinding);
	}

	// --- [ glDrawArraysInstanced ] ---

	public static void glDrawArraysInstanced(int mode, int first, int count, int instancecount) {
		long __functionAddress = GLES.getCapabilities().glDrawArraysInstanced;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, mode, first, count, instancecount);
	}

	// --- [ glDrawElementsInstanced ] ---

	public static void nglDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount) {
		long __functionAddress = GLES.getCapabilities().glDrawElementsInstanced;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, count, type, indices, instancecount);
	}

	public static void glDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstanced(mode, count, type, indices, instancecount);
	}

	public static void glDrawElementsInstanced(int mode, int type, ByteBuffer indices, int instancecount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstanced(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount);
	}

	public static void glDrawElementsInstanced(int mode, ByteBuffer indices, int instancecount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstanced(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount);
	}

	public static void glDrawElementsInstanced(int mode, ShortBuffer indices, int instancecount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstanced(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount);
	}

	public static void glDrawElementsInstanced(int mode, IntBuffer indices, int instancecount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstanced(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount);
	}

	// --- [ glFenceSync ] ---

	public static long glFenceSync(int condition, int flags) {
		long __functionAddress = GLES.getCapabilities().glFenceSync;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callP(__functionAddress, condition, flags);
	}

	// --- [ glIsSync ] ---

	public static boolean glIsSync(long sync) {
		long __functionAddress = GLES.getCapabilities().glIsSync;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return callPZ(__functionAddress, sync);
	}

	// --- [ glDeleteSync ] ---

	public static void glDeleteSync(long sync) {
		long __functionAddress = GLES.getCapabilities().glDeleteSync;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		callPV(__functionAddress, sync);
	}

	// --- [ glClientWaitSync ] ---

	public static int glClientWaitSync(long sync, int flags, long timeout) {
		long __functionAddress = GLES.getCapabilities().glClientWaitSync;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return callPJI(__functionAddress, sync, flags, timeout);
	}

	// --- [ glWaitSync ] ---

	public static void glWaitSync(long sync, int flags, long timeout) {
		long __functionAddress = GLES.getCapabilities().glWaitSync;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		callPJV(__functionAddress, sync, flags, timeout);
	}

	// --- [ glGetInteger64v ] ---

	public static void nglGetInteger64v(int pname, long data) {
		long __functionAddress = GLES.getCapabilities().glGetInteger64v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pname, data);
	}

	public static void glGetInteger64v(int pname, LongBuffer data) {
		if ( CHECKS )
			checkBuffer(data, 1);
		nglGetInteger64v(pname, memAddress(data));
	}

	public static long glGetInteger64(int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer data = stack.callocLong(1);
			nglGetInteger64v(pname, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetSynciv ] ---

	public static void nglGetSynciv(long sync, int pname, int bufSize, long length, long values) {
		long __functionAddress = GLES.getCapabilities().glGetSynciv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		callPPPV(__functionAddress, sync, pname, bufSize, length, values);
	}

	public static void glGetSynciv(long sync, int pname, IntBuffer length, IntBuffer values) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetSynciv(sync, pname, values.remaining(), memAddressSafe(length), memAddress(values));
	}

	public static int glGetSynci(long sync, int pname, IntBuffer length) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer values = stack.callocInt(1);
			nglGetSynciv(sync, pname, 1, memAddressSafe(length), memAddress(values));
			return values.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetInteger64i_v ] ---

	public static void nglGetInteger64i_v(int target, int index, long data) {
		long __functionAddress = GLES.getCapabilities().glGetInteger64i_v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, data);
	}

	public static void glGetInteger64i_v(int target, int index, LongBuffer data) {
		if ( CHECKS )
			checkBuffer(data, 1);
		nglGetInteger64i_v(target, index, memAddress(data));
	}

	public static long glGetInteger64i(int target, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer data = stack.callocLong(1);
			nglGetInteger64i_v(target, index, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetBufferParameteri64v ] ---

	public static void nglGetBufferParameteri64v(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetBufferParameteri64v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glGetBufferParameteri64v(int target, int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetBufferParameteri64v(target, pname, memAddress(params));
	}

	public static long glGetBufferParameteri64(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetBufferParameteri64v(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenSamplers ] ---

	public static void nglGenSamplers(int count, long samplers) {
		long __functionAddress = GLES.getCapabilities().glGenSamplers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, count, samplers);
	}

	public static void glGenSamplers(IntBuffer samplers) {
		nglGenSamplers(samplers.remaining(), memAddress(samplers));
	}

	public static int glGenSamplers() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer samplers = stack.callocInt(1);
			nglGenSamplers(1, memAddress(samplers));
			return samplers.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDeleteSamplers ] ---

	public static void nglDeleteSamplers(int count, long samplers) {
		long __functionAddress = GLES.getCapabilities().glDeleteSamplers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, count, samplers);
	}

	public static void glDeleteSamplers(IntBuffer samplers) {
		nglDeleteSamplers(samplers.remaining(), memAddress(samplers));
	}

	public static void glDeleteSamplers(int sampler) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer samplers = stack.ints(sampler);
			nglDeleteSamplers(1, memAddress(samplers));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsSampler ] ---

	public static boolean glIsSampler(int sampler) {
		long __functionAddress = GLES.getCapabilities().glIsSampler;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, sampler);
	}

	// --- [ glBindSampler ] ---

	public static void glBindSampler(int unit, int sampler) {
		long __functionAddress = GLES.getCapabilities().glBindSampler;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, unit, sampler);
	}

	// --- [ glSamplerParameteri ] ---

	public static void glSamplerParameteri(int sampler, int pname, int param) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameteri;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, sampler, pname, param);
	}

	// --- [ glSamplerParameteriv ] ---

	public static void nglSamplerParameteriv(int sampler, int pname, long param) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, param);
	}

	public static void glSamplerParameteriv(int sampler, int pname, IntBuffer param) {
		nglSamplerParameteriv(sampler, pname, memAddress(param));
	}

	// --- [ glSamplerParameterf ] ---

	public static void glSamplerParameterf(int sampler, int pname, float param) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameterf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, sampler, pname, param);
	}

	// --- [ glSamplerParameterfv ] ---

	public static void nglSamplerParameterfv(int sampler, int pname, long param) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, param);
	}

	public static void glSamplerParameterfv(int sampler, int pname, FloatBuffer param) {
		nglSamplerParameterfv(sampler, pname, memAddress(param));
	}

	// --- [ glGetSamplerParameteriv ] ---

	public static void nglGetSamplerParameteriv(int sampler, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetSamplerParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	public static void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameteriv(sampler, pname, memAddress(params));
	}

	public static int glGetSamplerParameteri(int sampler, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetSamplerParameteriv(sampler, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetSamplerParameterfv ] ---

	public static void nglGetSamplerParameterfv(int sampler, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetSamplerParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	public static void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterfv(sampler, pname, memAddress(params));
	}

	public static float glGetSamplerParameterf(int sampler, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetSamplerParameterfv(sampler, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glVertexAttribDivisor ] ---

	public static void glVertexAttribDivisor(int index, int divisor) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribDivisor;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, divisor);
	}

	// --- [ glBindTransformFeedback ] ---

	public static void glBindTransformFeedback(int target, int id) {
		long __functionAddress = GLES.getCapabilities().glBindTransformFeedback;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, id);
	}

	// --- [ glDeleteTransformFeedbacks ] ---

	public static void nglDeleteTransformFeedbacks(int n, long ids) {
		long __functionAddress = GLES.getCapabilities().glDeleteTransformFeedbacks;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, ids);
	}

	public static void glDeleteTransformFeedbacks(IntBuffer ids) {
		nglDeleteTransformFeedbacks(ids.remaining(), memAddress(ids));
	}

	public static void glDeleteTransformFeedbacks(int id) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer ids = stack.ints(id);
			nglDeleteTransformFeedbacks(1, memAddress(ids));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenTransformFeedbacks ] ---

	public static void nglGenTransformFeedbacks(int n, long ids) {
		long __functionAddress = GLES.getCapabilities().glGenTransformFeedbacks;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, ids);
	}

	public static void glGenTransformFeedbacks(IntBuffer ids) {
		nglGenTransformFeedbacks(ids.remaining(), memAddress(ids));
	}

	public static int glGenTransformFeedbacks() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer ids = stack.callocInt(1);
			nglGenTransformFeedbacks(1, memAddress(ids));
			return ids.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsTransformFeedback ] ---

	public static boolean glIsTransformFeedback(int id) {
		long __functionAddress = GLES.getCapabilities().glIsTransformFeedback;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, id);
	}

	// --- [ glPauseTransformFeedback ] ---

	public static void glPauseTransformFeedback() {
		long __functionAddress = GLES.getCapabilities().glPauseTransformFeedback;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

	// --- [ glResumeTransformFeedback ] ---

	public static void glResumeTransformFeedback() {
		long __functionAddress = GLES.getCapabilities().glResumeTransformFeedback;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

	// --- [ glGetProgramBinary ] ---

	public static void nglGetProgramBinary(int program, int bufSize, long length, long binaryFormat, long binary) {
		long __functionAddress = GLES.getCapabilities().glGetProgramBinary;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, program, bufSize, length, binaryFormat, binary);
	}

	public static void glGetProgramBinary(int program, IntBuffer length, IntBuffer binaryFormat, ByteBuffer binary) {
		if ( CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(binaryFormat, 1);
		}
		nglGetProgramBinary(program, binary.remaining(), memAddressSafe(length), memAddress(binaryFormat), memAddress(binary));
	}

	// --- [ glProgramBinary ] ---

	public static void nglProgramBinary(int program, int binaryFormat, long binary, int length) {
		long __functionAddress = GLES.getCapabilities().glProgramBinary;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, binaryFormat, binary, length);
	}

	public static void glProgramBinary(int program, int binaryFormat, ByteBuffer binary) {
		nglProgramBinary(program, binaryFormat, memAddress(binary), binary.remaining());
	}

	// --- [ glProgramParameteri ] ---

	public static void glProgramParameteri(int program, int pname, int value) {
		long __functionAddress = GLES.getCapabilities().glProgramParameteri;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, pname, value);
	}

	// --- [ glInvalidateFramebuffer ] ---

	public static void nglInvalidateFramebuffer(int target, int numAttachments, long attachments) {
		long __functionAddress = GLES.getCapabilities().glInvalidateFramebuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, numAttachments, attachments);
	}

	public static void glInvalidateFramebuffer(int target, IntBuffer attachments) {
		nglInvalidateFramebuffer(target, attachments.remaining(), memAddress(attachments));
	}

	public static void glInvalidateFramebuffer(int target, int attachment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer attachments = stack.ints(attachment);
			nglInvalidateFramebuffer(target, 1, memAddress(attachments));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glInvalidateSubFramebuffer ] ---

	public static void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height) {
		long __functionAddress = GLES.getCapabilities().glInvalidateSubFramebuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, numAttachments, attachments, x, y, width, height);
	}

	public static void glInvalidateSubFramebuffer(int target, IntBuffer attachments, int x, int y, int width, int height) {
		nglInvalidateSubFramebuffer(target, attachments.remaining(), memAddress(attachments), x, y, width, height);
	}

	public static void glInvalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer attachments = stack.ints(attachment);
			nglInvalidateSubFramebuffer(target, 1, memAddress(attachments), x, y, width, height);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glTexStorage2D ] ---

	public static void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
		long __functionAddress = GLES.getCapabilities().glTexStorage2D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, levels, internalformat, width, height);
	}

	// --- [ glTexStorage3D ] ---

	public static void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
		long __functionAddress = GLES.getCapabilities().glTexStorage3D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, levels, internalformat, width, height, depth);
	}

	// --- [ glGetInternalformativ ] ---

	public static void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params) {
		long __functionAddress = GLES.getCapabilities().glGetInternalformativ;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, internalformat, pname, bufSize, params);
	}

	public static void glGetInternalformativ(int target, int internalformat, int pname, IntBuffer params) {
		nglGetInternalformativ(target, internalformat, pname, params.remaining(), memAddress(params));
	}

	public static int glGetInternalformati(int target, int internalformat, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetInternalformativ(target, internalformat, pname, 1, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** short[] version of: {@link #glTexImage3D TexImage3D} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, short[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	/** int[] version of: {@link #glTexImage3D TexImage3D} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	/** float[] version of: {@link #glTexImage3D TexImage3D} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, float[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	/** short[] version of: {@link #glTexSubImage3D TexSubImage3D} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** int[] version of: {@link #glTexSubImage3D TexSubImage3D} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** float[] version of: {@link #glTexSubImage3D TexSubImage3D} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** Array version of: {@link #glGenQueries GenQueries} */
	public static void glGenQueries(int[] ids) {
		long __functionAddress = GLES.getCapabilities().glGenQueries;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/** Array version of: {@link #glDeleteQueries DeleteQueries} */
	public static void glDeleteQueries(int[] ids) {
		long __functionAddress = GLES.getCapabilities().glDeleteQueries;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/** Array version of: {@link #glGetQueryiv GetQueryiv} */
	public static void glGetQueryiv(int target, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetQueryObjectuiv GetQueryObjectuiv} */
	public static void glGetQueryObjectuiv(int id, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryObjectuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, id, pname, params);
	}

	/** Array version of: {@link #glDrawBuffers DrawBuffers} */
	public static void glDrawBuffers(int[] bufs) {
		long __functionAddress = GLES.getCapabilities().glDrawBuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, bufs.length, bufs);
	}

	/** Array version of: {@link #glUniformMatrix2x3fv UniformMatrix2x3fv} */
	public static void glUniformMatrix2x3fv(int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix2x3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length / 6, transpose, value);
	}

	/** Array version of: {@link #glUniformMatrix3x2fv UniformMatrix3x2fv} */
	public static void glUniformMatrix3x2fv(int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix3x2fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length / 6, transpose, value);
	}

	/** Array version of: {@link #glUniformMatrix2x4fv UniformMatrix2x4fv} */
	public static void glUniformMatrix2x4fv(int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix2x4fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 3, transpose, value);
	}

	/** Array version of: {@link #glUniformMatrix4x2fv UniformMatrix4x2fv} */
	public static void glUniformMatrix4x2fv(int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix4x2fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 3, transpose, value);
	}

	/** Array version of: {@link #glUniformMatrix3x4fv UniformMatrix3x4fv} */
	public static void glUniformMatrix3x4fv(int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix3x4fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length / 12, transpose, value);
	}

	/** Array version of: {@link #glUniformMatrix4x3fv UniformMatrix4x3fv} */
	public static void glUniformMatrix4x3fv(int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix4x3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length / 12, transpose, value);
	}

	/** Array version of: {@link #glDeleteVertexArrays DeleteVertexArrays} */
	public static void glDeleteVertexArrays(int[] arrays) {
		long __functionAddress = GLES.getCapabilities().glDeleteVertexArrays;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, arrays.length, arrays);
	}

	/** Array version of: {@link #glGenVertexArrays GenVertexArrays} */
	public static void glGenVertexArrays(int[] arrays) {
		long __functionAddress = GLES.getCapabilities().glGenVertexArrays;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, arrays.length, arrays);
	}

	/** Array version of: {@link #glGetIntegeri_v GetIntegeri_v} */
	public static void glGetIntegeri_v(int target, int index, int[] data) {
		long __functionAddress = GLES.getCapabilities().glGetIntegeri_v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1);
		}
		callPV(__functionAddress, target, index, data);
	}

	/** Array version of: {@link #glGetTransformFeedbackVarying GetTransformFeedbackVarying} */
	public static void glGetTransformFeedbackVarying(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
		long __functionAddress = GLES.getCapabilities().glGetTransformFeedbackVarying;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		callPPPPV(__functionAddress, program, index, name.remaining(), length, size, type, memAddress(name));
	}

	/** short[] version of: {@link #glVertexAttribIPointer VertexAttribIPointer} */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, short[] pointer) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribIPointer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES20.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, index, size, type, stride, pointer);
	}

	/** int[] version of: {@link #glVertexAttribIPointer VertexAttribIPointer} */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, int[] pointer) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribIPointer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLESChecks.ensureBufferObject(GLES20.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, index, size, type, stride, pointer);
	}

	/** Array version of: {@link #glGetVertexAttribIiv GetVertexAttribIiv} */
	public static void glGetVertexAttribIiv(int index, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetVertexAttribIiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, index, pname, params);
	}

	/** Array version of: {@link #glGetVertexAttribIuiv GetVertexAttribIuiv} */
	public static void glGetVertexAttribIuiv(int index, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetVertexAttribIuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, index, pname, params);
	}

	/** Array version of: {@link #glVertexAttribI4iv VertexAttribI4iv} */
	public static void glVertexAttribI4iv(int index, int[] v) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribI4iv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribI4uiv VertexAttribI4uiv} */
	public static void glVertexAttribI4uiv(int index, int[] v) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribI4uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glGetUniformuiv GetUniformuiv} */
	public static void glGetUniformuiv(int program, int location, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetUniformuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, program, location, params);
	}

	/** Array version of: {@link #glUniform1uiv Uniform1uiv} */
	public static void glUniform1uiv(int location, int[] value) {
		long __functionAddress = GLES.getCapabilities().glUniform1uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length, value);
	}

	/** Array version of: {@link #glUniform2uiv Uniform2uiv} */
	public static void glUniform2uiv(int location, int[] value) {
		long __functionAddress = GLES.getCapabilities().glUniform2uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glUniform3uiv Uniform3uiv} */
	public static void glUniform3uiv(int location, int[] value) {
		long __functionAddress = GLES.getCapabilities().glUniform3uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length / 3, value);
	}

	/** Array version of: {@link #glUniform4uiv Uniform4uiv} */
	public static void glUniform4uiv(int location, int[] value) {
		long __functionAddress = GLES.getCapabilities().glUniform4uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glClearBufferiv ClearBufferiv} */
	public static void glClearBufferiv(int buffer, int drawbuffer, int[] value) {
		long __functionAddress = GLES.getCapabilities().glClearBufferiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, buffer, drawbuffer, value);
	}

	/** Array version of: {@link #glClearBufferuiv ClearBufferuiv} */
	public static void glClearBufferuiv(int buffer, int drawbuffer, int[] value) {
		long __functionAddress = GLES.getCapabilities().glClearBufferuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, buffer, drawbuffer, value);
	}

	/** Array version of: {@link #glClearBufferfv ClearBufferfv} */
	public static void glClearBufferfv(int buffer, int drawbuffer, float[] value) {
		long __functionAddress = GLES.getCapabilities().glClearBufferfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, buffer, drawbuffer, value);
	}

	/** Array version of: {@link #glGetUniformIndices GetUniformIndices} */
	public static void glGetUniformIndices(int program, PointerBuffer uniformNames, int[] uniformIndices) {
		long __functionAddress = GLES.getCapabilities().glGetUniformIndices;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(uniformIndices, uniformNames.remaining());
		}
		callPPV(__functionAddress, program, uniformNames.remaining(), memAddress(uniformNames), uniformIndices);
	}

	/** Array version of: {@link #glGetActiveUniformsiv GetActiveUniformsiv} */
	public static void glGetActiveUniformsiv(int program, int[] uniformIndices, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetActiveUniformsiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, uniformIndices.length);
		}
		callPPV(__functionAddress, program, uniformIndices.length, uniformIndices, pname, params);
	}

	/** Array version of: {@link #glGetActiveUniformBlockiv GetActiveUniformBlockiv} */
	public static void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetActiveUniformBlockiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, program, uniformBlockIndex, pname, params);
	}

	/** Array version of: {@link #glGetActiveUniformBlockName GetActiveUniformBlockName} */
	public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int[] length, ByteBuffer uniformBlockName) {
		long __functionAddress = GLES.getCapabilities().glGetActiveUniformBlockName;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPV(__functionAddress, program, uniformBlockIndex, uniformBlockName.remaining(), length, memAddress(uniformBlockName));
	}

	/** Array version of: {@link #glGetInteger64v GetInteger64v} */
	public static void glGetInteger64v(int pname, long[] data) {
		long __functionAddress = GLES.getCapabilities().glGetInteger64v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1);
		}
		callPV(__functionAddress, pname, data);
	}

	/** Array version of: {@link #glGetSynciv GetSynciv} */
	public static void glGetSynciv(long sync, int pname, int[] length, int[] values) {
		long __functionAddress = GLES.getCapabilities().glGetSynciv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPPV(__functionAddress, sync, pname, values.length, length, values);
	}

	/** Array version of: {@link #glGetInteger64i_v GetInteger64i_v} */
	public static void glGetInteger64i_v(int target, int index, long[] data) {
		long __functionAddress = GLES.getCapabilities().glGetInteger64i_v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1);
		}
		callPV(__functionAddress, target, index, data);
	}

	/** Array version of: {@link #glGetBufferParameteri64v GetBufferParameteri64v} */
	public static void glGetBufferParameteri64v(int target, int pname, long[] params) {
		long __functionAddress = GLES.getCapabilities().glGetBufferParameteri64v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGenSamplers GenSamplers} */
	public static void glGenSamplers(int[] samplers) {
		long __functionAddress = GLES.getCapabilities().glGenSamplers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, samplers.length, samplers);
	}

	/** Array version of: {@link #glDeleteSamplers DeleteSamplers} */
	public static void glDeleteSamplers(int[] samplers) {
		long __functionAddress = GLES.getCapabilities().glDeleteSamplers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, samplers.length, samplers);
	}

	/** Array version of: {@link #glSamplerParameteriv SamplerParameteriv} */
	public static void glSamplerParameteriv(int sampler, int pname, int[] param) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, param);
	}

	/** Array version of: {@link #glSamplerParameterfv SamplerParameterfv} */
	public static void glSamplerParameterfv(int sampler, int pname, float[] param) {
		long __functionAddress = GLES.getCapabilities().glSamplerParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, param);
	}

	/** Array version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv} */
	public static void glGetSamplerParameteriv(int sampler, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetSamplerParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv} */
	public static void glGetSamplerParameterfv(int sampler, int pname, float[] params) {
		long __functionAddress = GLES.getCapabilities().glGetSamplerParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks} */
	public static void glDeleteTransformFeedbacks(int[] ids) {
		long __functionAddress = GLES.getCapabilities().glDeleteTransformFeedbacks;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/** Array version of: {@link #glGenTransformFeedbacks GenTransformFeedbacks} */
	public static void glGenTransformFeedbacks(int[] ids) {
		long __functionAddress = GLES.getCapabilities().glGenTransformFeedbacks;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/** Array version of: {@link #glGetProgramBinary GetProgramBinary} */
	public static void glGetProgramBinary(int program, int[] length, int[] binaryFormat, ByteBuffer binary) {
		long __functionAddress = GLES.getCapabilities().glGetProgramBinary;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(binaryFormat, 1);
		}
		callPPPV(__functionAddress, program, binary.remaining(), length, binaryFormat, memAddress(binary));
	}

	/** Array version of: {@link #glInvalidateFramebuffer InvalidateFramebuffer} */
	public static void glInvalidateFramebuffer(int target, int[] attachments) {
		long __functionAddress = GLES.getCapabilities().glInvalidateFramebuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, attachments.length, attachments);
	}

	/** Array version of: {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer} */
	public static void glInvalidateSubFramebuffer(int target, int[] attachments, int x, int y, int width, int height) {
		long __functionAddress = GLES.getCapabilities().glInvalidateSubFramebuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, attachments.length, attachments, x, y, width, height);
	}

	/** Array version of: {@link #glGetInternalformativ GetInternalformativ} */
	public static void glGetInternalformativ(int target, int internalformat, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetInternalformativ;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, internalformat, pname, params.length, params);
	}

}