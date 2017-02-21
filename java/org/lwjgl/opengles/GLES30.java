/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
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

	static { GLES.initialize(); }

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

	/** <a href="http://docs.gl/es3/glReadBuffer">Reference Page</a> */
	public static native void glReadBuffer(int src);

	// --- [ glDrawRangeElements ] ---

	public static native void nglDrawRangeElements(int mode, int start, int end, int count, int type, long indices);

	/** <a href="http://docs.gl/es3/glDrawRangeElements">Reference Page</a> */
	public static void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
		nglDrawRangeElements(mode, start, end, count, type, indices);
	}

	/** <a href="http://docs.gl/es3/glDrawRangeElements">Reference Page</a> */
	public static void glDrawRangeElements(int mode, int start, int end, int type, ByteBuffer indices) {
		nglDrawRangeElements(mode, start, end, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices));
	}

	/** <a href="http://docs.gl/es3/glDrawRangeElements">Reference Page</a> */
	public static void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices) {
		nglDrawRangeElements(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices));
	}

	/** <a href="http://docs.gl/es3/glDrawRangeElements">Reference Page</a> */
	public static void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices) {
		nglDrawRangeElements(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices));
	}

	/** <a href="http://docs.gl/es3/glDrawRangeElements">Reference Page</a> */
	public static void glDrawRangeElements(int mode, int start, int end, IntBuffer indices) {
		nglDrawRangeElements(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices));
	}

	// --- [ glTexImage3D ] ---

	public static native void nglTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels);

	/** <a href="http://docs.gl/es3/glTexImage3D">Reference Page</a> */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** <a href="http://docs.gl/es3/glTexImage3D">Reference Page</a> */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	/** <a href="http://docs.gl/es3/glTexImage3D">Reference Page</a> */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** <a href="http://docs.gl/es3/glTexImage3D">Reference Page</a> */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	/** <a href="http://docs.gl/es3/glTexImage3D">Reference Page</a> */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glTexSubImage3D ] ---

	public static native void nglTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

	/** <a href="http://docs.gl/es3/glTexSubImage3D">Reference Page</a> */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** <a href="http://docs.gl/es3/glTexSubImage3D">Reference Page</a> */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** <a href="http://docs.gl/es3/glTexSubImage3D">Reference Page</a> */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** <a href="http://docs.gl/es3/glTexSubImage3D">Reference Page</a> */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** <a href="http://docs.gl/es3/glTexSubImage3D">Reference Page</a> */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	// --- [ glCopyTexSubImage3D ] ---

	/** <a href="http://docs.gl/es3/glCopyTexSubImage3D">Reference Page</a> */
	public static native void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height);

	// --- [ glCompressedTexImage3D ] ---

	public static native void nglCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

	/** <a href="http://docs.gl/es3/glCompressedTexImage3D">Reference Page</a> */
	public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
	}

	/** <a href="http://docs.gl/es3/glCompressedTexImage3D">Reference Page</a> */
	public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
		nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, remainingSafe(data), memAddressSafe(data));
	}

	// --- [ glCompressedTexSubImage3D ] ---

	public static native void nglCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

	/** <a href="http://docs.gl/es3/glCompressedTexSubImage3D">Reference Page</a> */
	public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	/** <a href="http://docs.gl/es3/glCompressedTexSubImage3D">Reference Page</a> */
	public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
		nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
	}

	// --- [ glGenQueries ] ---

	public static native void nglGenQueries(int n, long ids);

	/** <a href="http://docs.gl/es3/glGenQueries">Reference Page</a> */
	public static void glGenQueries(IntBuffer ids) {
		nglGenQueries(ids.remaining(), memAddress(ids));
	}

	/** <a href="http://docs.gl/es3/glGenQueries">Reference Page</a> */
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

	public static native void nglDeleteQueries(int n, long ids);

	/** <a href="http://docs.gl/es3/glDeleteQueries">Reference Page</a> */
	public static void glDeleteQueries(IntBuffer ids) {
		nglDeleteQueries(ids.remaining(), memAddress(ids));
	}

	/** <a href="http://docs.gl/es3/glDeleteQueries">Reference Page</a> */
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

	/** <a href="http://docs.gl/es3/glIsQuery">Reference Page</a> */
	public static native boolean glIsQuery(int id);

	// --- [ glBeginQuery ] ---

	/** <a href="http://docs.gl/es3/glBeginQuery">Reference Page</a> */
	public static native void glBeginQuery(int target, int id);

	// --- [ glEndQuery ] ---

	/** <a href="http://docs.gl/es3/glEndQuery">Reference Page</a> */
	public static native void glEndQuery(int target);

	// --- [ glGetQueryiv ] ---

	public static native void nglGetQueryiv(int target, int pname, long params);

	/** <a href="http://docs.gl/es3/glGetQuery">Reference Page</a> */
	public static void glGetQueryiv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetQueryiv(target, pname, memAddress(params));
	}

	/** <a href="http://docs.gl/es3/glGetQuery">Reference Page</a> */
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

	public static native void nglGetQueryObjectuiv(int id, int pname, long params);

	/** <a href="http://docs.gl/es3/glGetQueryObject">Reference Page</a> */
	public static void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetQueryObjectuiv(id, pname, memAddress(params));
	}

	/** <a href="http://docs.gl/es3/glGetQueryObject">Reference Page</a> */
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

	/** <a href="http://docs.gl/es3/glUnmapBuffer">Reference Page</a> */
	public static native boolean glUnmapBuffer(int target);

	// --- [ glGetBufferPointerv ] ---

	public static native void nglGetBufferPointerv(int target, int pname, long params);

	/** <a href="http://docs.gl/es3/glGetBufferPointerv">Reference Page</a> */
	public static void glGetBufferPointerv(int target, int pname, PointerBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetBufferPointerv(target, pname, memAddress(params));
	}

	/** <a href="http://docs.gl/es3/glGetBufferPointerv">Reference Page</a> */
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

	public static native void nglDrawBuffers(int n, long bufs);

	/** <a href="http://docs.gl/es3/glDrawBuffers">Reference Page</a> */
	public static void glDrawBuffers(IntBuffer bufs) {
		nglDrawBuffers(bufs.remaining(), memAddress(bufs));
	}

	/** <a href="http://docs.gl/es3/glDrawBuffers">Reference Page</a> */
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

	public static native void nglUniformMatrix2x3fv(int location, int count, boolean transpose, long value);

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static void glUniformMatrix2x3fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix2x3fv(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x2fv ] ---

	public static native void nglUniformMatrix3x2fv(int location, int count, boolean transpose, long value);

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static void glUniformMatrix3x2fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix3x2fv(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix2x4fv ] ---

	public static native void nglUniformMatrix2x4fv(int location, int count, boolean transpose, long value);

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static void glUniformMatrix2x4fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix2x4fv(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x2fv ] ---

	public static native void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value);

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static void glUniformMatrix4x2fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4x2fv(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x4fv ] ---

	public static native void nglUniformMatrix3x4fv(int location, int count, boolean transpose, long value);

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static void glUniformMatrix3x4fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix3x4fv(location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x3fv ] ---

	public static native void nglUniformMatrix4x3fv(int location, int count, boolean transpose, long value);

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static void glUniformMatrix4x3fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4x3fv(location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glBlitFramebuffer ] ---

	/** <a href="http://docs.gl/es3/glBlitFramebuffer">Reference Page</a> */
	public static native void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter);

	// --- [ glRenderbufferStorageMultisample ] ---

	/** <a href="http://docs.gl/es3/glRenderbufferStorageMultisample">Reference Page</a> */
	public static native void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height);

	// --- [ glFramebufferTextureLayer ] ---

	/** <a href="http://docs.gl/es3/glFramebufferTextureLayer">Reference Page</a> */
	public static native void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer);

	// --- [ glMapBufferRange ] ---

	public static native long nglMapBufferRange(int target, long offset, long length, int access);

	/** <a href="http://docs.gl/es3/glMapBufferRange">Reference Page</a> */
	public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access) {
		long __result = nglMapBufferRange(target, offset, length, access);
		return memByteBuffer(__result, (int)length);
	}

	/** <a href="http://docs.gl/es3/glMapBufferRange">Reference Page</a> */
	public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer) {
		long __result = nglMapBufferRange(target, offset, length, access);
		return apiGetMappedBuffer(old_buffer, __result, (int)length);
	}

	// --- [ glFlushMappedBufferRange ] ---

	/** <a href="http://docs.gl/es3/glFlushMappedBufferRange">Reference Page</a> */
	public static native void glFlushMappedBufferRange(int target, long offset, long length);

	// --- [ glBindVertexArray ] ---

	/** <a href="http://docs.gl/es3/glBindVertexArray">Reference Page</a> */
	public static native void glBindVertexArray(int array);

	// --- [ glDeleteVertexArrays ] ---

	public static native void nglDeleteVertexArrays(int n, long arrays);

	/** <a href="http://docs.gl/es3/glDeleteVertexArrays">Reference Page</a> */
	public static void glDeleteVertexArrays(IntBuffer arrays) {
		nglDeleteVertexArrays(arrays.remaining(), memAddress(arrays));
	}

	/** <a href="http://docs.gl/es3/glDeleteVertexArrays">Reference Page</a> */
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

	public static native void nglGenVertexArrays(int n, long arrays);

	/** <a href="http://docs.gl/es3/glGenVertexArrays">Reference Page</a> */
	public static void glGenVertexArrays(IntBuffer arrays) {
		nglGenVertexArrays(arrays.remaining(), memAddress(arrays));
	}

	/** <a href="http://docs.gl/es3/glGenVertexArrays">Reference Page</a> */
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

	/** <a href="http://docs.gl/es3/glIsVertexArray">Reference Page</a> */
	public static native boolean glIsVertexArray(int array);

	// --- [ glGetIntegeri_v ] ---

	public static native void nglGetIntegeri_v(int target, int index, long data);

	/** <a href="http://docs.gl/es3/glGetIntegeri_v">Reference Page</a> */
	public static void glGetIntegeri_v(int target, int index, IntBuffer data) {
		if ( CHECKS )
			check(data, 1);
		nglGetIntegeri_v(target, index, memAddress(data));
	}

	/** <a href="http://docs.gl/es3/glGetIntegeri_v">Reference Page</a> */
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

	/** <a href="http://docs.gl/es3/glBeginTransformFeedback">Reference Page</a> */
	public static native void glBeginTransformFeedback(int primitiveMode);

	// --- [ glEndTransformFeedback ] ---

	/** <a href="http://docs.gl/es3/glEndTransformFeedback">Reference Page</a> */
	public static native void glEndTransformFeedback();

	// --- [ glBindBufferRange ] ---

	/** <a href="http://docs.gl/es3/glBindBufferRange">Reference Page</a> */
	public static native void glBindBufferRange(int target, int index, int buffer, long offset, long size);

	// --- [ glBindBufferBase ] ---

	/** <a href="http://docs.gl/es3/glBindBufferBase">Reference Page</a> */
	public static native void glBindBufferBase(int target, int index, int buffer);

	// --- [ glTransformFeedbackVaryings ] ---

	public static native void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode);

	/** <a href="http://docs.gl/es3/glTransformFeedbackVaryings">Reference Page</a> */
	public static void glTransformFeedbackVaryings(int program, PointerBuffer varyings, int bufferMode) {
		nglTransformFeedbackVaryings(program, varyings.remaining(), memAddress(varyings), bufferMode);
	}

	/** <a href="http://docs.gl/es3/glTransformFeedbackVaryings">Reference Page</a> */
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

	/** <a href="http://docs.gl/es3/glTransformFeedbackVaryings">Reference Page</a> */
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

	public static native void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name);

	/** <a href="http://docs.gl/es3/glGetTransformFeedbackVarying">Reference Page</a> */
	public static void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		if ( CHECKS ) {
			checkSafe(length, 1);
			check(size, 1);
			check(type, 1);
		}
		nglGetTransformFeedbackVarying(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** <a href="http://docs.gl/es3/glGetTransformFeedbackVarying">Reference Page</a> */
	public static String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
		if ( CHECKS ) {
			check(size, 1);
			check(type, 1);
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

	/** <a href="http://docs.gl/es3/glGetTransformFeedbackVarying">Reference Page</a> */
	public static String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type) {
		return glGetTransformFeedbackVarying(program, index, GLES20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH), size, type);
	}

	// --- [ glVertexAttribIPointer ] ---

	public static native void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer);

	/** <a href="http://docs.gl/es3/glVertexAttribIPointer">Reference Page</a> */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
	}

	/** <a href="http://docs.gl/es3/glVertexAttribIPointer">Reference Page</a> */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
		nglVertexAttribIPointer(index, size, type, stride, pointer);
	}

	/** <a href="http://docs.gl/es3/glVertexAttribIPointer">Reference Page</a> */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer) {
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
	}

	/** <a href="http://docs.gl/es3/glVertexAttribIPointer">Reference Page</a> */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer) {
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
	}

	// --- [ glGetVertexAttribIiv ] ---

	public static native void nglGetVertexAttribIiv(int index, int pname, long params);

	/** <a href="http://docs.gl/es3/glGetVertexAttrib">Reference Page</a> */
	public static void glGetVertexAttribIiv(int index, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetVertexAttribIiv(index, pname, memAddress(params));
	}

	/** <a href="http://docs.gl/es3/glGetVertexAttrib">Reference Page</a> */
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

	public static native void nglGetVertexAttribIuiv(int index, int pname, long params);

	/** <a href="http://docs.gl/es3/glGetVertexAttrib">Reference Page</a> */
	public static void glGetVertexAttribIuiv(int index, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetVertexAttribIuiv(index, pname, memAddress(params));
	}

	/** <a href="http://docs.gl/es3/glGetVertexAttrib">Reference Page</a> */
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

	/** <a href="http://docs.gl/es3/glVertexAttrib">Reference Page</a> */
	public static native void glVertexAttribI4i(int index, int x, int y, int z, int w);

	// --- [ glVertexAttribI4ui ] ---

	/** <a href="http://docs.gl/es3/glVertexAttrib">Reference Page</a> */
	public static native void glVertexAttribI4ui(int index, int x, int y, int z, int w);

	// --- [ glVertexAttribI4iv ] ---

	public static native void nglVertexAttribI4iv(int index, long v);

	/** <a href="http://docs.gl/es3/glVertexAttrib">Reference Page</a> */
	public static void glVertexAttribI4iv(int index, IntBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglVertexAttribI4iv(index, memAddress(v));
	}

	// --- [ glVertexAttribI4uiv ] ---

	public static native void nglVertexAttribI4uiv(int index, long v);

	/** <a href="http://docs.gl/es3/glVertexAttrib">Reference Page</a> */
	public static void glVertexAttribI4uiv(int index, IntBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglVertexAttribI4uiv(index, memAddress(v));
	}

	// --- [ glGetUniformuiv ] ---

	public static native void nglGetUniformuiv(int program, int location, long params);

	/** <a href="http://docs.gl/es3/glGetUniform">Reference Page</a> */
	public static void glGetUniformuiv(int program, int location, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetUniformuiv(program, location, memAddress(params));
	}

	/** <a href="http://docs.gl/es3/glGetUniform">Reference Page</a> */
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

	public static native int nglGetFragDataLocation(int program, long name);

	/** <a href="http://docs.gl/es3/glGetFragDataLocation">Reference Page</a> */
	public static int glGetFragDataLocation(int program, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetFragDataLocation(program, memAddress(name));
	}

	/** <a href="http://docs.gl/es3/glGetFragDataLocation">Reference Page</a> */
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

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static native void glUniform1ui(int location, int v0);

	// --- [ glUniform2ui ] ---

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static native void glUniform2ui(int location, int v0, int v1);

	// --- [ glUniform3ui ] ---

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static native void glUniform3ui(int location, int v0, int v1, int v2);

	// --- [ glUniform4ui ] ---

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static native void glUniform4ui(int location, int v0, int v1, int v2, int v3);

	// --- [ glUniform1uiv ] ---

	public static native void nglUniform1uiv(int location, int count, long value);

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static void glUniform1uiv(int location, IntBuffer value) {
		nglUniform1uiv(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2uiv ] ---

	public static native void nglUniform2uiv(int location, int count, long value);

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static void glUniform2uiv(int location, IntBuffer value) {
		nglUniform2uiv(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3uiv ] ---

	public static native void nglUniform3uiv(int location, int count, long value);

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static void glUniform3uiv(int location, IntBuffer value) {
		nglUniform3uiv(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4uiv ] ---

	public static native void nglUniform4uiv(int location, int count, long value);

	/** <a href="http://docs.gl/es3/glUniform">Reference Page</a> */
	public static void glUniform4uiv(int location, IntBuffer value) {
		nglUniform4uiv(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glClearBufferiv ] ---

	public static native void nglClearBufferiv(int buffer, int drawbuffer, long value);

	/** <a href="http://docs.gl/es3/glClearBuffer">Reference Page</a> */
	public static void glClearBufferiv(int buffer, int drawbuffer, IntBuffer value) {
		if ( CHECKS )
			check(value, 1);
		nglClearBufferiv(buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearBufferuiv ] ---

	public static native void nglClearBufferuiv(int buffer, int drawbuffer, long value);

	/** <a href="http://docs.gl/es3/glClearBuffer">Reference Page</a> */
	public static void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value) {
		if ( CHECKS )
			check(value, 1);
		nglClearBufferuiv(buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearBufferfv ] ---

	public static native void nglClearBufferfv(int buffer, int drawbuffer, long value);

	/** <a href="http://docs.gl/es3/glClearBuffer">Reference Page</a> */
	public static void glClearBufferfv(int buffer, int drawbuffer, FloatBuffer value) {
		if ( CHECKS )
			check(value, 1);
		nglClearBufferfv(buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearBufferfi ] ---

	/** <a href="http://docs.gl/es3/glClearBufferfi">Reference Page</a> */
	public static native void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil);

	// --- [ glGetStringi ] ---

	public static native long nglGetStringi(int name, int index);

	/** <a href="http://docs.gl/es3/glGetStringi">Reference Page</a> */
	public static String glGetStringi(int name, int index) {
		long __result = nglGetStringi(name, index);
		return memUTF8(__result);
	}

	// --- [ glCopyBufferSubData ] ---

	/** <a href="http://docs.gl/es3/glCopyBufferSubData">Reference Page</a> */
	public static native void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size);

	// --- [ glGetUniformIndices ] ---

	public static native void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices);

	/** <a href="http://docs.gl/es3/glGetUniformIndices">Reference Page</a> */
	public static void glGetUniformIndices(int program, PointerBuffer uniformNames, IntBuffer uniformIndices) {
		if ( CHECKS )
			check(uniformIndices, uniformNames.remaining());
		nglGetUniformIndices(program, uniformNames.remaining(), memAddress(uniformNames), memAddress(uniformIndices));
	}

	// --- [ glGetActiveUniformsiv ] ---

	public static native void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params);

	/** <a href="http://docs.gl/es3/glGetActiveUniforms">Reference Page</a> */
	public static void glGetActiveUniformsiv(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, uniformIndices.remaining());
		nglGetActiveUniformsiv(program, uniformIndices.remaining(), memAddress(uniformIndices), pname, memAddress(params));
	}

	// --- [ glGetUniformBlockIndex ] ---

	public static native int nglGetUniformBlockIndex(int program, long uniformBlockName);

	/** <a href="http://docs.gl/es3/glGetUniformBlockIndex">Reference Page</a> */
	public static int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
		if ( CHECKS )
			checkNT1(uniformBlockName);
		return nglGetUniformBlockIndex(program, memAddress(uniformBlockName));
	}

	/** <a href="http://docs.gl/es3/glGetUniformBlockIndex">Reference Page</a> */
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

	public static native void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params);

	/** <a href="http://docs.gl/es3/glGetActiveUniformBlock">Reference Page</a> */
	public static void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params));
	}

	/** <a href="http://docs.gl/es3/glGetActiveUniformBlock">Reference Page</a> */
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

	public static native void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName);

	/** <a href="http://docs.gl/es3/glGetActiveUniformBlockName">Reference Page</a> */
	public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName) {
		if ( CHECKS )
			checkSafe(length, 1);
		nglGetActiveUniformBlockName(program, uniformBlockIndex, uniformBlockName.remaining(), memAddressSafe(length), memAddress(uniformBlockName));
	}

	/** <a href="http://docs.gl/es3/glGetActiveUniformBlockName">Reference Page</a> */
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

	/** <a href="http://docs.gl/es3/glGetActiveUniformBlockName">Reference Page</a> */
	public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
		return glGetActiveUniformBlockName(program, uniformBlockIndex, glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH));
	}

	// --- [ glUniformBlockBinding ] ---

	/** <a href="http://docs.gl/es3/glUniformBlockBinding">Reference Page</a> */
	public static native void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding);

	// --- [ glDrawArraysInstanced ] ---

	/** <a href="http://docs.gl/es3/glDrawArraysInstanced">Reference Page</a> */
	public static native void glDrawArraysInstanced(int mode, int first, int count, int instancecount);

	// --- [ glDrawElementsInstanced ] ---

	public static native void nglDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount);

	/** <a href="http://docs.gl/es3/glDrawElementsInstanced">Reference Page</a> */
	public static void glDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount) {
		nglDrawElementsInstanced(mode, count, type, indices, instancecount);
	}

	/** <a href="http://docs.gl/es3/glDrawElementsInstanced">Reference Page</a> */
	public static void glDrawElementsInstanced(int mode, int type, ByteBuffer indices, int instancecount) {
		nglDrawElementsInstanced(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount);
	}

	/** <a href="http://docs.gl/es3/glDrawElementsInstanced">Reference Page</a> */
	public static void glDrawElementsInstanced(int mode, ByteBuffer indices, int instancecount) {
		nglDrawElementsInstanced(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount);
	}

	/** <a href="http://docs.gl/es3/glDrawElementsInstanced">Reference Page</a> */
	public static void glDrawElementsInstanced(int mode, ShortBuffer indices, int instancecount) {
		nglDrawElementsInstanced(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount);
	}

	/** <a href="http://docs.gl/es3/glDrawElementsInstanced">Reference Page</a> */
	public static void glDrawElementsInstanced(int mode, IntBuffer indices, int instancecount) {
		nglDrawElementsInstanced(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount);
	}

	// --- [ glFenceSync ] ---

	/** <a href="http://docs.gl/es3/glFenceSync">Reference Page</a> */
	public static native long glFenceSync(int condition, int flags);

	// --- [ glIsSync ] ---

	public static native boolean nglIsSync(long sync);

	/** <a href="http://docs.gl/es3/glIsSync">Reference Page</a> */
	public static boolean glIsSync(long sync) {
		if ( CHECKS )
			check(sync);
		return nglIsSync(sync);
	}

	// --- [ glDeleteSync ] ---

	public static native void nglDeleteSync(long sync);

	/** <a href="http://docs.gl/es3/glDeleteSync">Reference Page</a> */
	public static void glDeleteSync(long sync) {
		if ( CHECKS )
			check(sync);
		nglDeleteSync(sync);
	}

	// --- [ glClientWaitSync ] ---

	public static native int nglClientWaitSync(long sync, int flags, long timeout);

	/** <a href="http://docs.gl/es3/glClientWaitSync">Reference Page</a> */
	public static int glClientWaitSync(long sync, int flags, long timeout) {
		if ( CHECKS )
			check(sync);
		return nglClientWaitSync(sync, flags, timeout);
	}

	// --- [ glWaitSync ] ---

	public static native void nglWaitSync(long sync, int flags, long timeout);

	/** <a href="http://docs.gl/es3/glWaitSync">Reference Page</a> */
	public static void glWaitSync(long sync, int flags, long timeout) {
		if ( CHECKS )
			check(sync);
		nglWaitSync(sync, flags, timeout);
	}

	// --- [ glGetInteger64v ] ---

	public static native void nglGetInteger64v(int pname, long data);

	/** <a href="http://docs.gl/es3/glGetInteger64v">Reference Page</a> */
	public static void glGetInteger64v(int pname, LongBuffer data) {
		if ( CHECKS )
			check(data, 1);
		nglGetInteger64v(pname, memAddress(data));
	}

	/** <a href="http://docs.gl/es3/glGetInteger64v">Reference Page</a> */
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

	public static native void nglGetSynciv(long sync, int pname, int bufSize, long length, long values);

	/** <a href="http://docs.gl/es3/glGetSync">Reference Page</a> */
	public static void glGetSynciv(long sync, int pname, IntBuffer length, IntBuffer values) {
		if ( CHECKS ) {
			check(sync);
			checkSafe(length, 1);
		}
		nglGetSynciv(sync, pname, values.remaining(), memAddressSafe(length), memAddress(values));
	}

	/** <a href="http://docs.gl/es3/glGetSync">Reference Page</a> */
	public static int glGetSynci(long sync, int pname, IntBuffer length) {
		if ( CHECKS ) {
			check(sync);
			checkSafe(length, 1);
		}
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

	public static native void nglGetInteger64i_v(int target, int index, long data);

	/** <a href="http://docs.gl/es3/glGetInteger">Reference Page</a> */
	public static void glGetInteger64i_v(int target, int index, LongBuffer data) {
		if ( CHECKS )
			check(data, 1);
		nglGetInteger64i_v(target, index, memAddress(data));
	}

	/** <a href="http://docs.gl/es3/glGetInteger">Reference Page</a> */
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

	public static native void nglGetBufferParameteri64v(int target, int pname, long params);

	/** <a href="http://docs.gl/es3/glGetBufferParameter">Reference Page</a> */
	public static void glGetBufferParameteri64v(int target, int pname, LongBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetBufferParameteri64v(target, pname, memAddress(params));
	}

	/** <a href="http://docs.gl/es3/glGetBufferParameter">Reference Page</a> */
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

	public static native void nglGenSamplers(int count, long samplers);

	/** <a href="http://docs.gl/es3/glGenSamplers">Reference Page</a> */
	public static void glGenSamplers(IntBuffer samplers) {
		nglGenSamplers(samplers.remaining(), memAddress(samplers));
	}

	/** <a href="http://docs.gl/es3/glGenSamplers">Reference Page</a> */
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

	public static native void nglDeleteSamplers(int count, long samplers);

	/** <a href="http://docs.gl/es3/glDeleteSamplers">Reference Page</a> */
	public static void glDeleteSamplers(IntBuffer samplers) {
		nglDeleteSamplers(samplers.remaining(), memAddress(samplers));
	}

	/** <a href="http://docs.gl/es3/glDeleteSamplers">Reference Page</a> */
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

	/** <a href="http://docs.gl/es3/glIsSampler">Reference Page</a> */
	public static native boolean glIsSampler(int sampler);

	// --- [ glBindSampler ] ---

	/** <a href="http://docs.gl/es3/glBindSampler">Reference Page</a> */
	public static native void glBindSampler(int unit, int sampler);

	// --- [ glSamplerParameteri ] ---

	/** <a href="http://docs.gl/es3/glSamplerParameteri">Reference Page</a> */
	public static native void glSamplerParameteri(int sampler, int pname, int param);

	// --- [ glSamplerParameteriv ] ---

	public static native void nglSamplerParameteriv(int sampler, int pname, long param);

	/** <a href="http://docs.gl/es3/glSamplerParameter">Reference Page</a> */
	public static void glSamplerParameteriv(int sampler, int pname, IntBuffer param) {
		if ( CHECKS )
			check(param, 1);
		nglSamplerParameteriv(sampler, pname, memAddress(param));
	}

	// --- [ glSamplerParameterf ] ---

	/** <a href="http://docs.gl/es3/glSamplerParameterf">Reference Page</a> */
	public static native void glSamplerParameterf(int sampler, int pname, float param);

	// --- [ glSamplerParameterfv ] ---

	public static native void nglSamplerParameterfv(int sampler, int pname, long param);

	/** <a href="http://docs.gl/es3/glSamplerParameter">Reference Page</a> */
	public static void glSamplerParameterfv(int sampler, int pname, FloatBuffer param) {
		if ( CHECKS )
			check(param, 1);
		nglSamplerParameterfv(sampler, pname, memAddress(param));
	}

	// --- [ glGetSamplerParameteriv ] ---

	public static native void nglGetSamplerParameteriv(int sampler, int pname, long params);

	/** <a href="http://docs.gl/es3/glGetSamplerParameter">Reference Page</a> */
	public static void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetSamplerParameteriv(sampler, pname, memAddress(params));
	}

	/** <a href="http://docs.gl/es3/glGetSamplerParameter">Reference Page</a> */
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

	public static native void nglGetSamplerParameterfv(int sampler, int pname, long params);

	/** <a href="http://docs.gl/es3/glGetSamplerParameter">Reference Page</a> */
	public static void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetSamplerParameterfv(sampler, pname, memAddress(params));
	}

	/** <a href="http://docs.gl/es3/glGetSamplerParameter">Reference Page</a> */
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

	/** <a href="http://docs.gl/es3/glVertexAttribDivisor">Reference Page</a> */
	public static native void glVertexAttribDivisor(int index, int divisor);

	// --- [ glBindTransformFeedback ] ---

	/** <a href="http://docs.gl/es3/glBindTransformFeedback">Reference Page</a> */
	public static native void glBindTransformFeedback(int target, int id);

	// --- [ glDeleteTransformFeedbacks ] ---

	public static native void nglDeleteTransformFeedbacks(int n, long ids);

	/** <a href="http://docs.gl/es3/glDeleteTransformFeedbacks">Reference Page</a> */
	public static void glDeleteTransformFeedbacks(IntBuffer ids) {
		nglDeleteTransformFeedbacks(ids.remaining(), memAddress(ids));
	}

	/** <a href="http://docs.gl/es3/glDeleteTransformFeedbacks">Reference Page</a> */
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

	public static native void nglGenTransformFeedbacks(int n, long ids);

	/** <a href="http://docs.gl/es3/glGenTransformFeedbacks">Reference Page</a> */
	public static void glGenTransformFeedbacks(IntBuffer ids) {
		nglGenTransformFeedbacks(ids.remaining(), memAddress(ids));
	}

	/** <a href="http://docs.gl/es3/glGenTransformFeedbacks">Reference Page</a> */
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

	/** <a href="http://docs.gl/es3/glIsTransformFeedback">Reference Page</a> */
	public static native boolean glIsTransformFeedback(int id);

	// --- [ glPauseTransformFeedback ] ---

	/** <a href="http://docs.gl/es3/glPauseTransformFeedback">Reference Page</a> */
	public static native void glPauseTransformFeedback();

	// --- [ glResumeTransformFeedback ] ---

	/** <a href="http://docs.gl/es3/glResumeTransformFeedback">Reference Page</a> */
	public static native void glResumeTransformFeedback();

	// --- [ glGetProgramBinary ] ---

	public static native void nglGetProgramBinary(int program, int bufSize, long length, long binaryFormat, long binary);

	/** <a href="http://docs.gl/es3/glGetProgramBinary">Reference Page</a> */
	public static void glGetProgramBinary(int program, IntBuffer length, IntBuffer binaryFormat, ByteBuffer binary) {
		if ( CHECKS ) {
			checkSafe(length, 1);
			check(binaryFormat, 1);
		}
		nglGetProgramBinary(program, binary.remaining(), memAddressSafe(length), memAddress(binaryFormat), memAddress(binary));
	}

	// --- [ glProgramBinary ] ---

	public static native void nglProgramBinary(int program, int binaryFormat, long binary, int length);

	/** <a href="http://docs.gl/es3/glProgramBinary">Reference Page</a> */
	public static void glProgramBinary(int program, int binaryFormat, ByteBuffer binary) {
		nglProgramBinary(program, binaryFormat, memAddress(binary), binary.remaining());
	}

	// --- [ glProgramParameteri ] ---

	/** <a href="http://docs.gl/es3/glProgramParameteri">Reference Page</a> */
	public static native void glProgramParameteri(int program, int pname, int value);

	// --- [ glInvalidateFramebuffer ] ---

	public static native void nglInvalidateFramebuffer(int target, int numAttachments, long attachments);

	/** <a href="http://docs.gl/es3/glInvalidateFramebuffer">Reference Page</a> */
	public static void glInvalidateFramebuffer(int target, IntBuffer attachments) {
		nglInvalidateFramebuffer(target, attachments.remaining(), memAddress(attachments));
	}

	/** <a href="http://docs.gl/es3/glInvalidateFramebuffer">Reference Page</a> */
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

	public static native void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height);

	/** <a href="http://docs.gl/es3/glInvalidateSubFramebuffer">Reference Page</a> */
	public static void glInvalidateSubFramebuffer(int target, IntBuffer attachments, int x, int y, int width, int height) {
		nglInvalidateSubFramebuffer(target, attachments.remaining(), memAddress(attachments), x, y, width, height);
	}

	/** <a href="http://docs.gl/es3/glInvalidateSubFramebuffer">Reference Page</a> */
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

	/** <a href="http://docs.gl/es3/glTexStorage2D">Reference Page</a> */
	public static native void glTexStorage2D(int target, int levels, int internalformat, int width, int height);

	// --- [ glTexStorage3D ] ---

	/** <a href="http://docs.gl/es3/glTexStorage3D">Reference Page</a> */
	public static native void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth);

	// --- [ glGetInternalformativ ] ---

	public static native void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params);

	/** <a href="http://docs.gl/es3/glGetInternalformat">Reference Page</a> */
	public static void glGetInternalformativ(int target, int internalformat, int pname, IntBuffer params) {
		nglGetInternalformativ(target, internalformat, pname, params.remaining(), memAddress(params));
	}

	/** <a href="http://docs.gl/es3/glGetInternalformat">Reference Page</a> */
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

	/**
	 * <p><a href="http://docs.gl/es3/glTexImage3D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexImage3D TexImage3D}
	 */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, short[] pixels) {
		long __functionAddress = GLES.getICD().glTexImage3D;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glTexImage3D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexImage3D TexImage3D}
	 */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int[] pixels) {
		long __functionAddress = GLES.getICD().glTexImage3D;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glTexImage3D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexImage3D TexImage3D}
	 */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, float[] pixels) {
		long __functionAddress = GLES.getICD().glTexImage3D;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glTexSubImage3D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexSubImage3D TexSubImage3D}
	 */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
		long __functionAddress = GLES.getICD().glTexSubImage3D;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glTexSubImage3D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexSubImage3D TexSubImage3D}
	 */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
		long __functionAddress = GLES.getICD().glTexSubImage3D;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glTexSubImage3D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexSubImage3D TexSubImage3D}
	 */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
		long __functionAddress = GLES.getICD().glTexSubImage3D;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGenQueries">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGenQueries GenQueries}
	 */
	public static void glGenQueries(int[] ids) {
		long __functionAddress = GLES.getICD().glGenQueries;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glDeleteQueries">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glDeleteQueries DeleteQueries}
	 */
	public static void glDeleteQueries(int[] ids) {
		long __functionAddress = GLES.getICD().glDeleteQueries;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetQuery">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetQueryiv GetQueryiv}
	 */
	public static void glGetQueryiv(int target, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glGetQueryiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetQueryObject">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetQueryObjectuiv GetQueryObjectuiv}
	 */
	public static void glGetQueryObjectuiv(int id, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glGetQueryObjectuiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, id, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glDrawBuffers">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glDrawBuffers DrawBuffers}
	 */
	public static void glDrawBuffers(int[] bufs) {
		long __functionAddress = GLES.getICD().glDrawBuffers;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, bufs.length, bufs);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glUniform">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glUniformMatrix2x3fv UniformMatrix2x3fv}
	 */
	public static void glUniformMatrix2x3fv(int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glUniformMatrix2x3fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, location, value.length / 6, transpose, value);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glUniform">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glUniformMatrix3x2fv UniformMatrix3x2fv}
	 */
	public static void glUniformMatrix3x2fv(int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glUniformMatrix3x2fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, location, value.length / 6, transpose, value);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glUniform">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glUniformMatrix2x4fv UniformMatrix2x4fv}
	 */
	public static void glUniformMatrix2x4fv(int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glUniformMatrix2x4fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, location, value.length >> 3, transpose, value);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glUniform">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glUniformMatrix4x2fv UniformMatrix4x2fv}
	 */
	public static void glUniformMatrix4x2fv(int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glUniformMatrix4x2fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, location, value.length >> 3, transpose, value);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glUniform">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glUniformMatrix3x4fv UniformMatrix3x4fv}
	 */
	public static void glUniformMatrix3x4fv(int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glUniformMatrix3x4fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, location, value.length / 12, transpose, value);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glUniform">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glUniformMatrix4x3fv UniformMatrix4x3fv}
	 */
	public static void glUniformMatrix4x3fv(int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getICD().glUniformMatrix4x3fv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, location, value.length / 12, transpose, value);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glDeleteVertexArrays">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glDeleteVertexArrays DeleteVertexArrays}
	 */
	public static void glDeleteVertexArrays(int[] arrays) {
		long __functionAddress = GLES.getICD().glDeleteVertexArrays;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, arrays.length, arrays);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGenVertexArrays">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGenVertexArrays GenVertexArrays}
	 */
	public static void glGenVertexArrays(int[] arrays) {
		long __functionAddress = GLES.getICD().glGenVertexArrays;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, arrays.length, arrays);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetIntegeri_v">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetIntegeri_v GetIntegeri_v}
	 */
	public static void glGetIntegeri_v(int target, int index, int[] data) {
		long __functionAddress = GLES.getICD().glGetIntegeri_v;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 1);
		}
		callPV(__functionAddress, target, index, data);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetTransformFeedbackVarying">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetTransformFeedbackVarying GetTransformFeedbackVarying}
	 */
	public static void glGetTransformFeedbackVarying(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
		long __functionAddress = GLES.getICD().glGetTransformFeedbackVarying;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(length, 1);
			check(size, 1);
			check(type, 1);
		}
		callPPPPV(__functionAddress, program, index, name.remaining(), length, size, type, memAddress(name));
	}

	/**
	 * <p><a href="http://docs.gl/es3/glVertexAttribIPointer">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glVertexAttribIPointer VertexAttribIPointer}
	 */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, short[] pointer) {
		long __functionAddress = GLES.getICD().glVertexAttribIPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, index, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glVertexAttribIPointer">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glVertexAttribIPointer VertexAttribIPointer}
	 */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, int[] pointer) {
		long __functionAddress = GLES.getICD().glVertexAttribIPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, index, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetVertexAttrib">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetVertexAttribIiv GetVertexAttribIiv}
	 */
	public static void glGetVertexAttribIiv(int index, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glGetVertexAttribIiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, index, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetVertexAttrib">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetVertexAttribIuiv GetVertexAttribIuiv}
	 */
	public static void glGetVertexAttribIuiv(int index, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glGetVertexAttribIuiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, index, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glVertexAttrib">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glVertexAttribI4iv VertexAttribI4iv}
	 */
	public static void glVertexAttribI4iv(int index, int[] v) {
		long __functionAddress = GLES.getICD().glVertexAttribI4iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glVertexAttrib">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glVertexAttribI4uiv VertexAttribI4uiv}
	 */
	public static void glVertexAttribI4uiv(int index, int[] v) {
		long __functionAddress = GLES.getICD().glVertexAttribI4uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetUniform">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetUniformuiv GetUniformuiv}
	 */
	public static void glGetUniformuiv(int program, int location, int[] params) {
		long __functionAddress = GLES.getICD().glGetUniformuiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, program, location, params);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glUniform">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glUniform1uiv Uniform1uiv}
	 */
	public static void glUniform1uiv(int location, int[] value) {
		long __functionAddress = GLES.getICD().glUniform1uiv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, location, value.length, value);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glUniform">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glUniform2uiv Uniform2uiv}
	 */
	public static void glUniform2uiv(int location, int[] value) {
		long __functionAddress = GLES.getICD().glUniform2uiv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, location, value.length >> 1, value);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glUniform">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glUniform3uiv Uniform3uiv}
	 */
	public static void glUniform3uiv(int location, int[] value) {
		long __functionAddress = GLES.getICD().glUniform3uiv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, location, value.length / 3, value);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glUniform">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glUniform4uiv Uniform4uiv}
	 */
	public static void glUniform4uiv(int location, int[] value) {
		long __functionAddress = GLES.getICD().glUniform4uiv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, location, value.length >> 2, value);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glClearBuffer">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glClearBufferiv ClearBufferiv}
	 */
	public static void glClearBufferiv(int buffer, int drawbuffer, int[] value) {
		long __functionAddress = GLES.getICD().glClearBufferiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(value, 1);
		}
		callPV(__functionAddress, buffer, drawbuffer, value);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glClearBuffer">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glClearBufferuiv ClearBufferuiv}
	 */
	public static void glClearBufferuiv(int buffer, int drawbuffer, int[] value) {
		long __functionAddress = GLES.getICD().glClearBufferuiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(value, 1);
		}
		callPV(__functionAddress, buffer, drawbuffer, value);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glClearBuffer">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glClearBufferfv ClearBufferfv}
	 */
	public static void glClearBufferfv(int buffer, int drawbuffer, float[] value) {
		long __functionAddress = GLES.getICD().glClearBufferfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(value, 1);
		}
		callPV(__functionAddress, buffer, drawbuffer, value);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetUniformIndices">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetUniformIndices GetUniformIndices}
	 */
	public static void glGetUniformIndices(int program, PointerBuffer uniformNames, int[] uniformIndices) {
		long __functionAddress = GLES.getICD().glGetUniformIndices;
		if ( CHECKS ) {
			check(__functionAddress);
			check(uniformIndices, uniformNames.remaining());
		}
		callPPV(__functionAddress, program, uniformNames.remaining(), memAddress(uniformNames), uniformIndices);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetActiveUniforms">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetActiveUniformsiv GetActiveUniformsiv}
	 */
	public static void glGetActiveUniformsiv(int program, int[] uniformIndices, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glGetActiveUniformsiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, uniformIndices.length);
		}
		callPPV(__functionAddress, program, uniformIndices.length, uniformIndices, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetActiveUniformBlock">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetActiveUniformBlockiv GetActiveUniformBlockiv}
	 */
	public static void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glGetActiveUniformBlockiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, program, uniformBlockIndex, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetActiveUniformBlockName">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetActiveUniformBlockName GetActiveUniformBlockName}
	 */
	public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int[] length, ByteBuffer uniformBlockName) {
		long __functionAddress = GLES.getICD().glGetActiveUniformBlockName;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(length, 1);
		}
		callPPV(__functionAddress, program, uniformBlockIndex, uniformBlockName.remaining(), length, memAddress(uniformBlockName));
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetInteger64v">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetInteger64v GetInteger64v}
	 */
	public static void glGetInteger64v(int pname, long[] data) {
		long __functionAddress = GLES.getICD().glGetInteger64v;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 1);
		}
		callPV(__functionAddress, pname, data);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetSync">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetSynciv GetSynciv}
	 */
	public static void glGetSynciv(long sync, int pname, int[] length, int[] values) {
		long __functionAddress = GLES.getICD().glGetSynciv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(sync);
			checkSafe(length, 1);
		}
		callPPPV(__functionAddress, sync, pname, values.length, length, values);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetInteger">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetInteger64i_v GetInteger64i_v}
	 */
	public static void glGetInteger64i_v(int target, int index, long[] data) {
		long __functionAddress = GLES.getICD().glGetInteger64i_v;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 1);
		}
		callPV(__functionAddress, target, index, data);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetBufferParameter">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetBufferParameteri64v GetBufferParameteri64v}
	 */
	public static void glGetBufferParameteri64v(int target, int pname, long[] params) {
		long __functionAddress = GLES.getICD().glGetBufferParameteri64v;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGenSamplers">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGenSamplers GenSamplers}
	 */
	public static void glGenSamplers(int[] samplers) {
		long __functionAddress = GLES.getICD().glGenSamplers;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, samplers.length, samplers);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glDeleteSamplers">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glDeleteSamplers DeleteSamplers}
	 */
	public static void glDeleteSamplers(int[] samplers) {
		long __functionAddress = GLES.getICD().glDeleteSamplers;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, samplers.length, samplers);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glSamplerParameter">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glSamplerParameteriv SamplerParameteriv}
	 */
	public static void glSamplerParameteriv(int sampler, int pname, int[] param) {
		long __functionAddress = GLES.getICD().glSamplerParameteriv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(param, 1);
		}
		callPV(__functionAddress, sampler, pname, param);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glSamplerParameter">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glSamplerParameterfv SamplerParameterfv}
	 */
	public static void glSamplerParameterfv(int sampler, int pname, float[] param) {
		long __functionAddress = GLES.getICD().glSamplerParameterfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(param, 1);
		}
		callPV(__functionAddress, sampler, pname, param);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetSamplerParameter">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv}
	 */
	public static void glGetSamplerParameteriv(int sampler, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glGetSamplerParameteriv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetSamplerParameter">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv}
	 */
	public static void glGetSamplerParameterfv(int sampler, int pname, float[] params) {
		long __functionAddress = GLES.getICD().glGetSamplerParameterfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glDeleteTransformFeedbacks">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks}
	 */
	public static void glDeleteTransformFeedbacks(int[] ids) {
		long __functionAddress = GLES.getICD().glDeleteTransformFeedbacks;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGenTransformFeedbacks">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGenTransformFeedbacks GenTransformFeedbacks}
	 */
	public static void glGenTransformFeedbacks(int[] ids) {
		long __functionAddress = GLES.getICD().glGenTransformFeedbacks;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetProgramBinary">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetProgramBinary GetProgramBinary}
	 */
	public static void glGetProgramBinary(int program, int[] length, int[] binaryFormat, ByteBuffer binary) {
		long __functionAddress = GLES.getICD().glGetProgramBinary;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(length, 1);
			check(binaryFormat, 1);
		}
		callPPPV(__functionAddress, program, binary.remaining(), length, binaryFormat, memAddress(binary));
	}

	/**
	 * <p><a href="http://docs.gl/es3/glInvalidateFramebuffer">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glInvalidateFramebuffer InvalidateFramebuffer}
	 */
	public static void glInvalidateFramebuffer(int target, int[] attachments) {
		long __functionAddress = GLES.getICD().glInvalidateFramebuffer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, target, attachments.length, attachments);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glInvalidateSubFramebuffer">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer}
	 */
	public static void glInvalidateSubFramebuffer(int target, int[] attachments, int x, int y, int width, int height) {
		long __functionAddress = GLES.getICD().glInvalidateSubFramebuffer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, target, attachments.length, attachments, x, y, width, height);
	}

	/**
	 * <p><a href="http://docs.gl/es3/glGetInternalformat">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetInternalformativ GetInternalformativ}
	 */
	public static void glGetInternalformativ(int target, int internalformat, int pname, int[] params) {
		long __functionAddress = GLES.getICD().glGetInternalformativ;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, target, internalformat, pname, params.length, params);
	}

}