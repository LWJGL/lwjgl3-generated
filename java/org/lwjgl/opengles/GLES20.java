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
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** The core OpenGL ES 2.0 functionality. */
public final class GLES20 {

	/**  */
	public static final int
		GL_DEPTH_BUFFER_BIT                             = 0x100,
		GL_STENCIL_BUFFER_BIT                           = 0x400,
		GL_COLOR_BUFFER_BIT                             = 0x4000,
		GL_FALSE                                        = 0x0,
		GL_TRUE                                         = 0x1,
		GL_POINTS                                       = 0x0,
		GL_LINES                                        = 0x1,
		GL_LINE_LOOP                                    = 0x2,
		GL_LINE_STRIP                                   = 0x3,
		GL_TRIANGLES                                    = 0x4,
		GL_TRIANGLE_STRIP                               = 0x5,
		GL_TRIANGLE_FAN                                 = 0x6,
		GL_ZERO                                         = 0x0,
		GL_ONE                                          = 0x1,
		GL_SRC_COLOR                                    = 0x300,
		GL_ONE_MINUS_SRC_COLOR                          = 0x301,
		GL_SRC_ALPHA                                    = 0x302,
		GL_ONE_MINUS_SRC_ALPHA                          = 0x303,
		GL_DST_ALPHA                                    = 0x304,
		GL_ONE_MINUS_DST_ALPHA                          = 0x305,
		GL_DST_COLOR                                    = 0x306,
		GL_ONE_MINUS_DST_COLOR                          = 0x307,
		GL_SRC_ALPHA_SATURATE                           = 0x308,
		GL_FUNC_ADD                                     = 0x8006,
		GL_BLEND_EQUATION                               = 0x8009,
		GL_BLEND_EQUATION_RGB                           = 0x8009,
		GL_BLEND_EQUATION_ALPHA                         = 0x883D,
		GL_FUNC_SUBTRACT                                = 0x800A,
		GL_FUNC_REVERSE_SUBTRACT                        = 0x800B,
		GL_BLEND_DST_RGB                                = 0x80C8,
		GL_BLEND_SRC_RGB                                = 0x80C9,
		GL_BLEND_DST_ALPHA                              = 0x80CA,
		GL_BLEND_SRC_ALPHA                              = 0x80CB,
		GL_CONSTANT_COLOR                               = 0x8001,
		GL_ONE_MINUS_CONSTANT_COLOR                     = 0x8002,
		GL_CONSTANT_ALPHA                               = 0x8003,
		GL_ONE_MINUS_CONSTANT_ALPHA                     = 0x8004,
		GL_BLEND_COLOR                                  = 0x8005,
		GL_ARRAY_BUFFER                                 = 0x8892,
		GL_ELEMENT_ARRAY_BUFFER                         = 0x8893,
		GL_ARRAY_BUFFER_BINDING                         = 0x8894,
		GL_ELEMENT_ARRAY_BUFFER_BINDING                 = 0x8895,
		GL_STREAM_DRAW                                  = 0x88E0,
		GL_STATIC_DRAW                                  = 0x88E4,
		GL_DYNAMIC_DRAW                                 = 0x88E8,
		GL_BUFFER_SIZE                                  = 0x8764,
		GL_BUFFER_USAGE                                 = 0x8765,
		GL_CURRENT_VERTEX_ATTRIB                        = 0x8626,
		GL_FRONT                                        = 0x404,
		GL_BACK                                         = 0x405,
		GL_FRONT_AND_BACK                               = 0x408,
		GL_TEXTURE_2D                                   = 0xDE1,
		GL_CULL_FACE                                    = 0xB44,
		GL_BLEND                                        = 0xBE2,
		GL_DITHER                                       = 0xBD0,
		GL_STENCIL_TEST                                 = 0xB90,
		GL_DEPTH_TEST                                   = 0xB71,
		GL_SCISSOR_TEST                                 = 0xC11,
		GL_POLYGON_OFFSET_FILL                          = 0x8037,
		GL_SAMPLE_ALPHA_TO_COVERAGE                     = 0x809E,
		GL_SAMPLE_COVERAGE                              = 0x80A0,
		GL_NO_ERROR                                     = 0x0,
		GL_INVALID_ENUM                                 = 0x500,
		GL_INVALID_VALUE                                = 0x501,
		GL_INVALID_OPERATION                            = 0x502,
		GL_OUT_OF_MEMORY                                = 0x505,
		GL_CW                                           = 0x900,
		GL_CCW                                          = 0x901,
		GL_LINE_WIDTH                                   = 0xB21,
		GL_ALIASED_POINT_SIZE_RANGE                     = 0x846D,
		GL_ALIASED_LINE_WIDTH_RANGE                     = 0x846E,
		GL_CULL_FACE_MODE                               = 0xB45,
		GL_FRONT_FACE                                   = 0xB46,
		GL_DEPTH_RANGE                                  = 0xB70,
		GL_DEPTH_WRITEMASK                              = 0xB72,
		GL_DEPTH_CLEAR_VALUE                            = 0xB73,
		GL_DEPTH_FUNC                                   = 0xB74,
		GL_STENCIL_CLEAR_VALUE                          = 0xB91,
		GL_STENCIL_FUNC                                 = 0xB92,
		GL_STENCIL_FAIL                                 = 0xB94,
		GL_STENCIL_PASS_DEPTH_FAIL                      = 0xB95,
		GL_STENCIL_PASS_DEPTH_PASS                      = 0xB96,
		GL_STENCIL_REF                                  = 0xB97,
		GL_STENCIL_VALUE_MASK                           = 0xB93,
		GL_STENCIL_WRITEMASK                            = 0xB98,
		GL_STENCIL_BACK_FUNC                            = 0x8800,
		GL_STENCIL_BACK_FAIL                            = 0x8801,
		GL_STENCIL_BACK_PASS_DEPTH_FAIL                 = 0x8802,
		GL_STENCIL_BACK_PASS_DEPTH_PASS                 = 0x8803,
		GL_STENCIL_BACK_REF                             = 0x8CA3,
		GL_STENCIL_BACK_VALUE_MASK                      = 0x8CA4,
		GL_STENCIL_BACK_WRITEMASK                       = 0x8CA5,
		GL_VIEWPORT                                     = 0xBA2,
		GL_SCISSOR_BOX                                  = 0xC10,
		GL_COLOR_CLEAR_VALUE                            = 0xC22,
		GL_COLOR_WRITEMASK                              = 0xC23,
		GL_UNPACK_ALIGNMENT                             = 0xCF5,
		GL_PACK_ALIGNMENT                               = 0xD05,
		GL_MAX_TEXTURE_SIZE                             = 0xD33,
		GL_MAX_VIEWPORT_DIMS                            = 0xD3A,
		GL_SUBPIXEL_BITS                                = 0xD50,
		GL_RED_BITS                                     = 0xD52,
		GL_GREEN_BITS                                   = 0xD53,
		GL_BLUE_BITS                                    = 0xD54,
		GL_ALPHA_BITS                                   = 0xD55,
		GL_DEPTH_BITS                                   = 0xD56,
		GL_STENCIL_BITS                                 = 0xD57,
		GL_POLYGON_OFFSET_UNITS                         = 0x2A00,
		GL_POLYGON_OFFSET_FACTOR                        = 0x8038,
		GL_TEXTURE_BINDING_2D                           = 0x8069,
		GL_SAMPLE_BUFFERS                               = 0x80A8,
		GL_SAMPLES                                      = 0x80A9,
		GL_SAMPLE_COVERAGE_VALUE                        = 0x80AA,
		GL_SAMPLE_COVERAGE_INVERT                       = 0x80AB,
		GL_NUM_COMPRESSED_TEXTURE_FORMATS               = 0x86A2,
		GL_COMPRESSED_TEXTURE_FORMATS                   = 0x86A3,
		GL_DONT_CARE                                    = 0x1100,
		GL_FASTEST                                      = 0x1101,
		GL_NICEST                                       = 0x1102,
		GL_GENERATE_MIPMAP_HINT                         = 0x8192,
		GL_BYTE                                         = 0x1400,
		GL_UNSIGNED_BYTE                                = 0x1401,
		GL_SHORT                                        = 0x1402,
		GL_UNSIGNED_SHORT                               = 0x1403,
		GL_INT                                          = 0x1404,
		GL_UNSIGNED_INT                                 = 0x1405,
		GL_FLOAT                                        = 0x1406,
		GL_FIXED                                        = 0x140C,
		GL_DEPTH_COMPONENT                              = 0x1902,
		GL_ALPHA                                        = 0x1906,
		GL_RGB                                          = 0x1907,
		GL_RGBA                                         = 0x1908,
		GL_LUMINANCE                                    = 0x1909,
		GL_LUMINANCE_ALPHA                              = 0x190A,
		GL_UNSIGNED_SHORT_4_4_4_4                       = 0x8033,
		GL_UNSIGNED_SHORT_5_5_5_1                       = 0x8034,
		GL_UNSIGNED_SHORT_5_6_5                         = 0x8363,
		GL_FRAGMENT_SHADER                              = 0x8B30,
		GL_VERTEX_SHADER                                = 0x8B31,
		GL_MAX_VERTEX_ATTRIBS                           = 0x8869,
		GL_MAX_VERTEX_UNIFORM_VECTORS                   = 0x8DFB,
		GL_MAX_VARYING_VECTORS                          = 0x8DFC,
		GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS             = 0x8B4D,
		GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS               = 0x8B4C,
		GL_MAX_TEXTURE_IMAGE_UNITS                      = 0x8872,
		GL_MAX_FRAGMENT_UNIFORM_VECTORS                 = 0x8DFD,
		GL_SHADER_TYPE                                  = 0x8B4F,
		GL_DELETE_STATUS                                = 0x8B80,
		GL_LINK_STATUS                                  = 0x8B82,
		GL_VALIDATE_STATUS                              = 0x8B83,
		GL_ATTACHED_SHADERS                             = 0x8B85,
		GL_ACTIVE_UNIFORMS                              = 0x8B86,
		GL_ACTIVE_UNIFORM_MAX_LENGTH                    = 0x8B87,
		GL_ACTIVE_ATTRIBUTES                            = 0x8B89,
		GL_ACTIVE_ATTRIBUTE_MAX_LENGTH                  = 0x8B8A,
		GL_SHADING_LANGUAGE_VERSION                     = 0x8B8C,
		GL_CURRENT_PROGRAM                              = 0x8B8D,
		GL_NEVER                                        = 0x200,
		GL_LESS                                         = 0x201,
		GL_EQUAL                                        = 0x202,
		GL_LEQUAL                                       = 0x203,
		GL_GREATER                                      = 0x204,
		GL_NOTEQUAL                                     = 0x205,
		GL_GEQUAL                                       = 0x206,
		GL_ALWAYS                                       = 0x207,
		GL_KEEP                                         = 0x1E00,
		GL_REPLACE                                      = 0x1E01,
		GL_INCR                                         = 0x1E02,
		GL_DECR                                         = 0x1E03,
		GL_INVERT                                       = 0x150A,
		GL_INCR_WRAP                                    = 0x8507,
		GL_DECR_WRAP                                    = 0x8508,
		GL_VENDOR                                       = 0x1F00,
		GL_RENDERER                                     = 0x1F01,
		GL_VERSION                                      = 0x1F02,
		GL_EXTENSIONS                                   = 0x1F03,
		GL_NEAREST                                      = 0x2600,
		GL_LINEAR                                       = 0x2601,
		GL_NEAREST_MIPMAP_NEAREST                       = 0x2700,
		GL_LINEAR_MIPMAP_NEAREST                        = 0x2701,
		GL_NEAREST_MIPMAP_LINEAR                        = 0x2702,
		GL_LINEAR_MIPMAP_LINEAR                         = 0x2703,
		GL_TEXTURE_MAG_FILTER                           = 0x2800,
		GL_TEXTURE_MIN_FILTER                           = 0x2801,
		GL_TEXTURE_WRAP_S                               = 0x2802,
		GL_TEXTURE_WRAP_T                               = 0x2803,
		GL_TEXTURE                                      = 0x1702,
		GL_TEXTURE_CUBE_MAP                             = 0x8513,
		GL_TEXTURE_BINDING_CUBE_MAP                     = 0x8514,
		GL_TEXTURE_CUBE_MAP_POSITIVE_X                  = 0x8515,
		GL_TEXTURE_CUBE_MAP_NEGATIVE_X                  = 0x8516,
		GL_TEXTURE_CUBE_MAP_POSITIVE_Y                  = 0x8517,
		GL_TEXTURE_CUBE_MAP_NEGATIVE_Y                  = 0x8518,
		GL_TEXTURE_CUBE_MAP_POSITIVE_Z                  = 0x8519,
		GL_TEXTURE_CUBE_MAP_NEGATIVE_Z                  = 0x851A,
		GL_MAX_CUBE_MAP_TEXTURE_SIZE                    = 0x851C,
		GL_TEXTURE0                                     = 0x84C0,
		GL_TEXTURE1                                     = 0x84C1,
		GL_TEXTURE2                                     = 0x84C2,
		GL_TEXTURE3                                     = 0x84C3,
		GL_TEXTURE4                                     = 0x84C4,
		GL_TEXTURE5                                     = 0x84C5,
		GL_TEXTURE6                                     = 0x84C6,
		GL_TEXTURE7                                     = 0x84C7,
		GL_TEXTURE8                                     = 0x84C8,
		GL_TEXTURE9                                     = 0x84C9,
		GL_TEXTURE10                                    = 0x84CA,
		GL_TEXTURE11                                    = 0x84CB,
		GL_TEXTURE12                                    = 0x84CC,
		GL_TEXTURE13                                    = 0x84CD,
		GL_TEXTURE14                                    = 0x84CE,
		GL_TEXTURE15                                    = 0x84CF,
		GL_TEXTURE16                                    = 0x84D0,
		GL_TEXTURE17                                    = 0x84D1,
		GL_TEXTURE18                                    = 0x84D2,
		GL_TEXTURE19                                    = 0x84D3,
		GL_TEXTURE20                                    = 0x84D4,
		GL_TEXTURE21                                    = 0x84D5,
		GL_TEXTURE22                                    = 0x84D6,
		GL_TEXTURE23                                    = 0x84D7,
		GL_TEXTURE24                                    = 0x84D8,
		GL_TEXTURE25                                    = 0x84D9,
		GL_TEXTURE26                                    = 0x84DA,
		GL_TEXTURE27                                    = 0x84DB,
		GL_TEXTURE28                                    = 0x84DC,
		GL_TEXTURE29                                    = 0x84DD,
		GL_TEXTURE30                                    = 0x84DE,
		GL_TEXTURE31                                    = 0x84DF,
		GL_ACTIVE_TEXTURE                               = 0x84E0,
		GL_REPEAT                                       = 0x2901,
		GL_CLAMP_TO_EDGE                                = 0x812F,
		GL_MIRRORED_REPEAT                              = 0x8370,
		GL_FLOAT_VEC2                                   = 0x8B50,
		GL_FLOAT_VEC3                                   = 0x8B51,
		GL_FLOAT_VEC4                                   = 0x8B52,
		GL_INT_VEC2                                     = 0x8B53,
		GL_INT_VEC3                                     = 0x8B54,
		GL_INT_VEC4                                     = 0x8B55,
		GL_BOOL                                         = 0x8B56,
		GL_BOOL_VEC2                                    = 0x8B57,
		GL_BOOL_VEC3                                    = 0x8B58,
		GL_BOOL_VEC4                                    = 0x8B59,
		GL_FLOAT_MAT2                                   = 0x8B5A,
		GL_FLOAT_MAT3                                   = 0x8B5B,
		GL_FLOAT_MAT4                                   = 0x8B5C,
		GL_SAMPLER_2D                                   = 0x8B5E,
		GL_SAMPLER_CUBE                                 = 0x8B60,
		GL_VERTEX_ATTRIB_ARRAY_ENABLED                  = 0x8622,
		GL_VERTEX_ATTRIB_ARRAY_SIZE                     = 0x8623,
		GL_VERTEX_ATTRIB_ARRAY_STRIDE                   = 0x8624,
		GL_VERTEX_ATTRIB_ARRAY_TYPE                     = 0x8625,
		GL_VERTEX_ATTRIB_ARRAY_NORMALIZED               = 0x886A,
		GL_VERTEX_ATTRIB_ARRAY_POINTER                  = 0x8645,
		GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING           = 0x889F,
		GL_IMPLEMENTATION_COLOR_READ_TYPE               = 0x8B9A,
		GL_IMPLEMENTATION_COLOR_READ_FORMAT             = 0x8B9B,
		GL_COMPILE_STATUS                               = 0x8B81,
		GL_INFO_LOG_LENGTH                              = 0x8B84,
		GL_SHADER_SOURCE_LENGTH                         = 0x8B88,
		GL_SHADER_COMPILER                              = 0x8DFA,
		GL_SHADER_BINARY_FORMATS                        = 0x8DF8,
		GL_NUM_SHADER_BINARY_FORMATS                    = 0x8DF9,
		GL_LOW_FLOAT                                    = 0x8DF0,
		GL_MEDIUM_FLOAT                                 = 0x8DF1,
		GL_HIGH_FLOAT                                   = 0x8DF2,
		GL_LOW_INT                                      = 0x8DF3,
		GL_MEDIUM_INT                                   = 0x8DF4,
		GL_HIGH_INT                                     = 0x8DF5,
		GL_FRAMEBUFFER                                  = 0x8D40,
		GL_RENDERBUFFER                                 = 0x8D41,
		GL_RGBA4                                        = 0x8056,
		GL_RGB5_A1                                      = 0x8057,
		GL_RGB565                                       = 0x8D62,
		GL_DEPTH_COMPONENT16                            = 0x81A5,
		GL_STENCIL_INDEX8                               = 0x8D48,
		GL_RENDERBUFFER_WIDTH                           = 0x8D42,
		GL_RENDERBUFFER_HEIGHT                          = 0x8D43,
		GL_RENDERBUFFER_INTERNAL_FORMAT                 = 0x8D44,
		GL_RENDERBUFFER_RED_SIZE                        = 0x8D50,
		GL_RENDERBUFFER_GREEN_SIZE                      = 0x8D51,
		GL_RENDERBUFFER_BLUE_SIZE                       = 0x8D52,
		GL_RENDERBUFFER_ALPHA_SIZE                      = 0x8D53,
		GL_RENDERBUFFER_DEPTH_SIZE                      = 0x8D54,
		GL_RENDERBUFFER_STENCIL_SIZE                    = 0x8D55,
		GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE           = 0x8CD0,
		GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME           = 0x8CD1,
		GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL         = 0x8CD2,
		GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3,
		GL_COLOR_ATTACHMENT0                            = 0x8CE0,
		GL_DEPTH_ATTACHMENT                             = 0x8D00,
		GL_STENCIL_ATTACHMENT                           = 0x8D20,
		GL_NONE                                         = 0x0,
		GL_FRAMEBUFFER_COMPLETE                         = 0x8CD5,
		GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT            = 0x8CD6,
		GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT    = 0x8CD7,
		GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS            = 0x8CD9,
		GL_FRAMEBUFFER_UNSUPPORTED                      = 0x8CDD,
		GL_FRAMEBUFFER_BINDING                          = 0x8CA6,
		GL_RENDERBUFFER_BINDING                         = 0x8CA7,
		GL_MAX_RENDERBUFFER_SIZE                        = 0x84E8,
		GL_INVALID_FRAMEBUFFER_OPERATION                = 0x506;

	/** Function address. */
	@JavadocExclude
	public final long
		ActiveTexture,
		AttachShader,
		BindAttribLocation,
		BindBuffer,
		BindFramebuffer,
		BindRenderbuffer,
		BindTexture,
		BlendColor,
		BlendEquation,
		BlendEquationSeparate,
		BlendFunc,
		BlendFuncSeparate,
		BufferData,
		BufferSubData,
		CheckFramebufferStatus,
		Clear,
		ClearColor,
		ClearDepthf,
		ClearStencil,
		ColorMask,
		CompileShader,
		CompressedTexImage2D,
		CompressedTexSubImage2D,
		CopyTexImage2D,
		CopyTexSubImage2D,
		CreateProgram,
		CreateShader,
		CullFace,
		DeleteBuffers,
		DeleteFramebuffers,
		DeleteProgram,
		DeleteRenderbuffers,
		DeleteShader,
		DeleteTextures,
		DepthFunc,
		DepthMask,
		DepthRangef,
		DetachShader,
		Disable,
		DisableVertexAttribArray,
		DrawArrays,
		DrawElements,
		Enable,
		EnableVertexAttribArray,
		Finish,
		Flush,
		FramebufferRenderbuffer,
		FramebufferTexture2D,
		FrontFace,
		GenBuffers,
		GenerateMipmap,
		GenFramebuffers,
		GenRenderbuffers,
		GenTextures,
		GetActiveAttrib,
		GetActiveUniform,
		GetAttachedShaders,
		GetAttribLocation,
		GetBooleanv,
		GetBufferParameteriv,
		GetError,
		GetFloatv,
		GetFramebufferAttachmentParameteriv,
		GetIntegerv,
		GetProgramiv,
		GetProgramInfoLog,
		GetRenderbufferParameteriv,
		GetShaderiv,
		GetShaderInfoLog,
		GetShaderPrecisionFormat,
		GetShaderSource,
		GetString,
		GetTexParameterfv,
		GetTexParameteriv,
		GetUniformfv,
		GetUniformiv,
		GetUniformLocation,
		GetVertexAttribfv,
		GetVertexAttribiv,
		GetVertexAttribPointerv,
		Hint,
		IsBuffer,
		IsEnabled,
		IsFramebuffer,
		IsProgram,
		IsRenderbuffer,
		IsShader,
		IsTexture,
		LineWidth,
		LinkProgram,
		PixelStorei,
		PolygonOffset,
		ReadPixels,
		ReleaseShaderCompiler,
		RenderbufferStorage,
		SampleCoverage,
		Scissor,
		ShaderBinary,
		ShaderSource,
		StencilFunc,
		StencilFuncSeparate,
		StencilMask,
		StencilMaskSeparate,
		StencilOp,
		StencilOpSeparate,
		TexImage2D,
		TexParameterf,
		TexParameterfv,
		TexParameteri,
		TexParameteriv,
		TexSubImage2D,
		Uniform1f,
		Uniform1fv,
		Uniform1i,
		Uniform1iv,
		Uniform2f,
		Uniform2fv,
		Uniform2i,
		Uniform2iv,
		Uniform3f,
		Uniform3fv,
		Uniform3i,
		Uniform3iv,
		Uniform4f,
		Uniform4fv,
		Uniform4i,
		Uniform4iv,
		UniformMatrix2fv,
		UniformMatrix3fv,
		UniformMatrix4fv,
		UseProgram,
		ValidateProgram,
		VertexAttrib1f,
		VertexAttrib1fv,
		VertexAttrib2f,
		VertexAttrib2fv,
		VertexAttrib3f,
		VertexAttrib3fv,
		VertexAttrib4f,
		VertexAttrib4fv,
		VertexAttribPointer,
		Viewport;

	@JavadocExclude
	public GLES20(FunctionProvider provider) {
		ActiveTexture = provider.getFunctionAddress("glActiveTexture");
		AttachShader = provider.getFunctionAddress("glAttachShader");
		BindAttribLocation = provider.getFunctionAddress("glBindAttribLocation");
		BindBuffer = provider.getFunctionAddress("glBindBuffer");
		BindFramebuffer = provider.getFunctionAddress("glBindFramebuffer");
		BindRenderbuffer = provider.getFunctionAddress("glBindRenderbuffer");
		BindTexture = provider.getFunctionAddress("glBindTexture");
		BlendColor = provider.getFunctionAddress("glBlendColor");
		BlendEquation = provider.getFunctionAddress("glBlendEquation");
		BlendEquationSeparate = provider.getFunctionAddress("glBlendEquationSeparate");
		BlendFunc = provider.getFunctionAddress("glBlendFunc");
		BlendFuncSeparate = provider.getFunctionAddress("glBlendFuncSeparate");
		BufferData = provider.getFunctionAddress("glBufferData");
		BufferSubData = provider.getFunctionAddress("glBufferSubData");
		CheckFramebufferStatus = provider.getFunctionAddress("glCheckFramebufferStatus");
		Clear = provider.getFunctionAddress("glClear");
		ClearColor = provider.getFunctionAddress("glClearColor");
		ClearDepthf = provider.getFunctionAddress("glClearDepthf");
		ClearStencil = provider.getFunctionAddress("glClearStencil");
		ColorMask = provider.getFunctionAddress("glColorMask");
		CompileShader = provider.getFunctionAddress("glCompileShader");
		CompressedTexImage2D = provider.getFunctionAddress("glCompressedTexImage2D");
		CompressedTexSubImage2D = provider.getFunctionAddress("glCompressedTexSubImage2D");
		CopyTexImage2D = provider.getFunctionAddress("glCopyTexImage2D");
		CopyTexSubImage2D = provider.getFunctionAddress("glCopyTexSubImage2D");
		CreateProgram = provider.getFunctionAddress("glCreateProgram");
		CreateShader = provider.getFunctionAddress("glCreateShader");
		CullFace = provider.getFunctionAddress("glCullFace");
		DeleteBuffers = provider.getFunctionAddress("glDeleteBuffers");
		DeleteFramebuffers = provider.getFunctionAddress("glDeleteFramebuffers");
		DeleteProgram = provider.getFunctionAddress("glDeleteProgram");
		DeleteRenderbuffers = provider.getFunctionAddress("glDeleteRenderbuffers");
		DeleteShader = provider.getFunctionAddress("glDeleteShader");
		DeleteTextures = provider.getFunctionAddress("glDeleteTextures");
		DepthFunc = provider.getFunctionAddress("glDepthFunc");
		DepthMask = provider.getFunctionAddress("glDepthMask");
		DepthRangef = provider.getFunctionAddress("glDepthRangef");
		DetachShader = provider.getFunctionAddress("glDetachShader");
		Disable = provider.getFunctionAddress("glDisable");
		DisableVertexAttribArray = provider.getFunctionAddress("glDisableVertexAttribArray");
		DrawArrays = provider.getFunctionAddress("glDrawArrays");
		DrawElements = provider.getFunctionAddress("glDrawElements");
		Enable = provider.getFunctionAddress("glEnable");
		EnableVertexAttribArray = provider.getFunctionAddress("glEnableVertexAttribArray");
		Finish = provider.getFunctionAddress("glFinish");
		Flush = provider.getFunctionAddress("glFlush");
		FramebufferRenderbuffer = provider.getFunctionAddress("glFramebufferRenderbuffer");
		FramebufferTexture2D = provider.getFunctionAddress("glFramebufferTexture2D");
		FrontFace = provider.getFunctionAddress("glFrontFace");
		GenBuffers = provider.getFunctionAddress("glGenBuffers");
		GenerateMipmap = provider.getFunctionAddress("glGenerateMipmap");
		GenFramebuffers = provider.getFunctionAddress("glGenFramebuffers");
		GenRenderbuffers = provider.getFunctionAddress("glGenRenderbuffers");
		GenTextures = provider.getFunctionAddress("glGenTextures");
		GetActiveAttrib = provider.getFunctionAddress("glGetActiveAttrib");
		GetActiveUniform = provider.getFunctionAddress("glGetActiveUniform");
		GetAttachedShaders = provider.getFunctionAddress("glGetAttachedShaders");
		GetAttribLocation = provider.getFunctionAddress("glGetAttribLocation");
		GetBooleanv = provider.getFunctionAddress("glGetBooleanv");
		GetBufferParameteriv = provider.getFunctionAddress("glGetBufferParameteriv");
		GetError = provider.getFunctionAddress("glGetError");
		GetFloatv = provider.getFunctionAddress("glGetFloatv");
		GetFramebufferAttachmentParameteriv = provider.getFunctionAddress("glGetFramebufferAttachmentParameteriv");
		GetIntegerv = provider.getFunctionAddress("glGetIntegerv");
		GetProgramiv = provider.getFunctionAddress("glGetProgramiv");
		GetProgramInfoLog = provider.getFunctionAddress("glGetProgramInfoLog");
		GetRenderbufferParameteriv = provider.getFunctionAddress("glGetRenderbufferParameteriv");
		GetShaderiv = provider.getFunctionAddress("glGetShaderiv");
		GetShaderInfoLog = provider.getFunctionAddress("glGetShaderInfoLog");
		GetShaderPrecisionFormat = provider.getFunctionAddress("glGetShaderPrecisionFormat");
		GetShaderSource = provider.getFunctionAddress("glGetShaderSource");
		GetString = provider.getFunctionAddress("glGetString");
		GetTexParameterfv = provider.getFunctionAddress("glGetTexParameterfv");
		GetTexParameteriv = provider.getFunctionAddress("glGetTexParameteriv");
		GetUniformfv = provider.getFunctionAddress("glGetUniformfv");
		GetUniformiv = provider.getFunctionAddress("glGetUniformiv");
		GetUniformLocation = provider.getFunctionAddress("glGetUniformLocation");
		GetVertexAttribfv = provider.getFunctionAddress("glGetVertexAttribfv");
		GetVertexAttribiv = provider.getFunctionAddress("glGetVertexAttribiv");
		GetVertexAttribPointerv = provider.getFunctionAddress("glGetVertexAttribPointerv");
		Hint = provider.getFunctionAddress("glHint");
		IsBuffer = provider.getFunctionAddress("glIsBuffer");
		IsEnabled = provider.getFunctionAddress("glIsEnabled");
		IsFramebuffer = provider.getFunctionAddress("glIsFramebuffer");
		IsProgram = provider.getFunctionAddress("glIsProgram");
		IsRenderbuffer = provider.getFunctionAddress("glIsRenderbuffer");
		IsShader = provider.getFunctionAddress("glIsShader");
		IsTexture = provider.getFunctionAddress("glIsTexture");
		LineWidth = provider.getFunctionAddress("glLineWidth");
		LinkProgram = provider.getFunctionAddress("glLinkProgram");
		PixelStorei = provider.getFunctionAddress("glPixelStorei");
		PolygonOffset = provider.getFunctionAddress("glPolygonOffset");
		ReadPixels = provider.getFunctionAddress("glReadPixels");
		ReleaseShaderCompiler = provider.getFunctionAddress("glReleaseShaderCompiler");
		RenderbufferStorage = provider.getFunctionAddress("glRenderbufferStorage");
		SampleCoverage = provider.getFunctionAddress("glSampleCoverage");
		Scissor = provider.getFunctionAddress("glScissor");
		ShaderBinary = provider.getFunctionAddress("glShaderBinary");
		ShaderSource = provider.getFunctionAddress("glShaderSource");
		StencilFunc = provider.getFunctionAddress("glStencilFunc");
		StencilFuncSeparate = provider.getFunctionAddress("glStencilFuncSeparate");
		StencilMask = provider.getFunctionAddress("glStencilMask");
		StencilMaskSeparate = provider.getFunctionAddress("glStencilMaskSeparate");
		StencilOp = provider.getFunctionAddress("glStencilOp");
		StencilOpSeparate = provider.getFunctionAddress("glStencilOpSeparate");
		TexImage2D = provider.getFunctionAddress("glTexImage2D");
		TexParameterf = provider.getFunctionAddress("glTexParameterf");
		TexParameterfv = provider.getFunctionAddress("glTexParameterfv");
		TexParameteri = provider.getFunctionAddress("glTexParameteri");
		TexParameteriv = provider.getFunctionAddress("glTexParameteriv");
		TexSubImage2D = provider.getFunctionAddress("glTexSubImage2D");
		Uniform1f = provider.getFunctionAddress("glUniform1f");
		Uniform1fv = provider.getFunctionAddress("glUniform1fv");
		Uniform1i = provider.getFunctionAddress("glUniform1i");
		Uniform1iv = provider.getFunctionAddress("glUniform1iv");
		Uniform2f = provider.getFunctionAddress("glUniform2f");
		Uniform2fv = provider.getFunctionAddress("glUniform2fv");
		Uniform2i = provider.getFunctionAddress("glUniform2i");
		Uniform2iv = provider.getFunctionAddress("glUniform2iv");
		Uniform3f = provider.getFunctionAddress("glUniform3f");
		Uniform3fv = provider.getFunctionAddress("glUniform3fv");
		Uniform3i = provider.getFunctionAddress("glUniform3i");
		Uniform3iv = provider.getFunctionAddress("glUniform3iv");
		Uniform4f = provider.getFunctionAddress("glUniform4f");
		Uniform4fv = provider.getFunctionAddress("glUniform4fv");
		Uniform4i = provider.getFunctionAddress("glUniform4i");
		Uniform4iv = provider.getFunctionAddress("glUniform4iv");
		UniformMatrix2fv = provider.getFunctionAddress("glUniformMatrix2fv");
		UniformMatrix3fv = provider.getFunctionAddress("glUniformMatrix3fv");
		UniformMatrix4fv = provider.getFunctionAddress("glUniformMatrix4fv");
		UseProgram = provider.getFunctionAddress("glUseProgram");
		ValidateProgram = provider.getFunctionAddress("glValidateProgram");
		VertexAttrib1f = provider.getFunctionAddress("glVertexAttrib1f");
		VertexAttrib1fv = provider.getFunctionAddress("glVertexAttrib1fv");
		VertexAttrib2f = provider.getFunctionAddress("glVertexAttrib2f");
		VertexAttrib2fv = provider.getFunctionAddress("glVertexAttrib2fv");
		VertexAttrib3f = provider.getFunctionAddress("glVertexAttrib3f");
		VertexAttrib3fv = provider.getFunctionAddress("glVertexAttrib3fv");
		VertexAttrib4f = provider.getFunctionAddress("glVertexAttrib4f");
		VertexAttrib4fv = provider.getFunctionAddress("glVertexAttrib4fv");
		VertexAttribPointer = provider.getFunctionAddress("glVertexAttribPointer");
		Viewport = provider.getFunctionAddress("glViewport");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLES20} instance for the current context. */
	public static GLES20 getInstance() {
		return checkFunctionality(GLES.getCapabilities().__GLES20);
	}

	static GLES20 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLES20") ) return null;

		GLES20 funcs = new GLES20(provider);
		boolean supported = checkFunctions(
			funcs.ActiveTexture, funcs.AttachShader, funcs.BindAttribLocation, funcs.BindBuffer, funcs.BindFramebuffer, funcs.BindRenderbuffer, 
			funcs.BindTexture, funcs.BlendColor, funcs.BlendEquation, funcs.BlendEquationSeparate, funcs.BlendFunc, funcs.BlendFuncSeparate, funcs.BufferData, 
			funcs.BufferSubData, funcs.CheckFramebufferStatus, funcs.Clear, funcs.ClearColor, funcs.ClearDepthf, funcs.ClearStencil, funcs.ColorMask, 
			funcs.CompileShader, funcs.CompressedTexImage2D, funcs.CompressedTexSubImage2D, funcs.CopyTexImage2D, funcs.CopyTexSubImage2D, funcs.CreateProgram, 
			funcs.CreateShader, funcs.CullFace, funcs.DeleteBuffers, funcs.DeleteFramebuffers, funcs.DeleteProgram, funcs.DeleteRenderbuffers, 
			funcs.DeleteShader, funcs.DeleteTextures, funcs.DepthFunc, funcs.DepthMask, funcs.DepthRangef, funcs.DetachShader, funcs.Disable, 
			funcs.DisableVertexAttribArray, funcs.DrawArrays, funcs.DrawElements, funcs.Enable, funcs.EnableVertexAttribArray, funcs.Finish, funcs.Flush, 
			funcs.FramebufferRenderbuffer, funcs.FramebufferTexture2D, funcs.FrontFace, funcs.GenBuffers, funcs.GenerateMipmap, funcs.GenFramebuffers, 
			funcs.GenRenderbuffers, funcs.GenTextures, funcs.GetActiveAttrib, funcs.GetActiveUniform, funcs.GetAttachedShaders, funcs.GetAttribLocation, 
			funcs.GetBooleanv, funcs.GetBufferParameteriv, funcs.GetError, funcs.GetFloatv, funcs.GetFramebufferAttachmentParameteriv, funcs.GetIntegerv, 
			funcs.GetProgramiv, funcs.GetProgramInfoLog, funcs.GetRenderbufferParameteriv, funcs.GetShaderiv, funcs.GetShaderInfoLog, 
			funcs.GetShaderPrecisionFormat, funcs.GetShaderSource, funcs.GetString, funcs.GetTexParameterfv, funcs.GetTexParameteriv, funcs.GetUniformfv, 
			funcs.GetUniformiv, funcs.GetUniformLocation, funcs.GetVertexAttribfv, funcs.GetVertexAttribiv, funcs.GetVertexAttribPointerv, funcs.Hint, 
			funcs.IsBuffer, funcs.IsEnabled, funcs.IsFramebuffer, funcs.IsProgram, funcs.IsRenderbuffer, funcs.IsShader, funcs.IsTexture, funcs.LineWidth, 
			funcs.LinkProgram, funcs.PixelStorei, funcs.PolygonOffset, funcs.ReadPixels, funcs.ReleaseShaderCompiler, funcs.RenderbufferStorage, 
			funcs.SampleCoverage, funcs.Scissor, funcs.ShaderBinary, funcs.ShaderSource, funcs.StencilFunc, funcs.StencilFuncSeparate, funcs.StencilMask, 
			funcs.StencilMaskSeparate, funcs.StencilOp, funcs.StencilOpSeparate, funcs.TexImage2D, funcs.TexParameterf, funcs.TexParameterfv, 
			funcs.TexParameteri, funcs.TexParameteriv, funcs.TexSubImage2D, funcs.Uniform1f, funcs.Uniform1fv, funcs.Uniform1i, funcs.Uniform1iv, 
			funcs.Uniform2f, funcs.Uniform2fv, funcs.Uniform2i, funcs.Uniform2iv, funcs.Uniform3f, funcs.Uniform3fv, funcs.Uniform3i, funcs.Uniform3iv, 
			funcs.Uniform4f, funcs.Uniform4fv, funcs.Uniform4i, funcs.Uniform4iv, funcs.UniformMatrix2fv, funcs.UniformMatrix3fv, funcs.UniformMatrix4fv, 
			funcs.UseProgram, funcs.ValidateProgram, funcs.VertexAttrib1f, funcs.VertexAttrib1fv, funcs.VertexAttrib2f, funcs.VertexAttrib2fv, 
			funcs.VertexAttrib3f, funcs.VertexAttrib3fv, funcs.VertexAttrib4f, funcs.VertexAttrib4fv, funcs.VertexAttribPointer, funcs.Viewport
		);

		return GLES.checkExtension("GLES20", funcs, supported);
	}

	// --- [ glActiveTexture ] ---

	/** JNI method for {@link #glActiveTexture ActiveTexture} */
	@JavadocExclude
	public static native void nglActiveTexture(int texture, long __functionAddress);

	public static void glActiveTexture(int texture) {
		long __functionAddress = getInstance().ActiveTexture;
		nglActiveTexture(texture, __functionAddress);
	}

	// --- [ glAttachShader ] ---

	/** JNI method for {@link #glAttachShader AttachShader} */
	@JavadocExclude
	public static native void nglAttachShader(int program, int shader, long __functionAddress);

	public static void glAttachShader(int program, int shader) {
		long __functionAddress = getInstance().AttachShader;
		nglAttachShader(program, shader, __functionAddress);
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

	// --- [ glBindBuffer ] ---

	/** JNI method for {@link #glBindBuffer BindBuffer} */
	@JavadocExclude
	public static native void nglBindBuffer(int target, int buffer, long __functionAddress);

	public static void glBindBuffer(int target, int buffer) {
		long __functionAddress = getInstance().BindBuffer;
		nglBindBuffer(target, buffer, __functionAddress);
	}

	// --- [ glBindFramebuffer ] ---

	/** JNI method for {@link #glBindFramebuffer BindFramebuffer} */
	@JavadocExclude
	public static native void nglBindFramebuffer(int target, int framebuffer, long __functionAddress);

	public static void glBindFramebuffer(int target, int framebuffer) {
		long __functionAddress = getInstance().BindFramebuffer;
		nglBindFramebuffer(target, framebuffer, __functionAddress);
	}

	// --- [ glBindRenderbuffer ] ---

	/** JNI method for {@link #glBindRenderbuffer BindRenderbuffer} */
	@JavadocExclude
	public static native void nglBindRenderbuffer(int target, int renderbuffer, long __functionAddress);

	public static void glBindRenderbuffer(int target, int renderbuffer) {
		long __functionAddress = getInstance().BindRenderbuffer;
		nglBindRenderbuffer(target, renderbuffer, __functionAddress);
	}

	// --- [ glBindTexture ] ---

	/** JNI method for {@link #glBindTexture BindTexture} */
	@JavadocExclude
	public static native void nglBindTexture(int target, int texture, long __functionAddress);

	public static void glBindTexture(int target, int texture) {
		long __functionAddress = getInstance().BindTexture;
		nglBindTexture(target, texture, __functionAddress);
	}

	// --- [ glBlendColor ] ---

	/** JNI method for {@link #glBlendColor BlendColor} */
	@JavadocExclude
	public static native void nglBlendColor(float red, float green, float blue, float alpha, long __functionAddress);

	public static void glBlendColor(float red, float green, float blue, float alpha) {
		long __functionAddress = getInstance().BlendColor;
		nglBlendColor(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glBlendEquation ] ---

	/** JNI method for {@link #glBlendEquation BlendEquation} */
	@JavadocExclude
	public static native void nglBlendEquation(int mode, long __functionAddress);

	public static void glBlendEquation(int mode) {
		long __functionAddress = getInstance().BlendEquation;
		nglBlendEquation(mode, __functionAddress);
	}

	// --- [ glBlendEquationSeparate ] ---

	/** JNI method for {@link #glBlendEquationSeparate BlendEquationSeparate} */
	@JavadocExclude
	public static native void nglBlendEquationSeparate(int modeRGB, int modeAlpha, long __functionAddress);

	public static void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
		long __functionAddress = getInstance().BlendEquationSeparate;
		nglBlendEquationSeparate(modeRGB, modeAlpha, __functionAddress);
	}

	// --- [ glBlendFunc ] ---

	/** JNI method for {@link #glBlendFunc BlendFunc} */
	@JavadocExclude
	public static native void nglBlendFunc(int sfactor, int dfactor, long __functionAddress);

	public static void glBlendFunc(int sfactor, int dfactor) {
		long __functionAddress = getInstance().BlendFunc;
		nglBlendFunc(sfactor, dfactor, __functionAddress);
	}

	// --- [ glBlendFuncSeparate ] ---

	/** JNI method for {@link #glBlendFuncSeparate BlendFuncSeparate} */
	@JavadocExclude
	public static native void nglBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha, long __functionAddress);

	public static void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		long __functionAddress = getInstance().BlendFuncSeparate;
		nglBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha, __functionAddress);
	}

	// --- [ glBufferData ] ---

	/** JNI method for {@link #glBufferData BufferData} */
	@JavadocExclude
	public static native void nglBufferData(int target, long size, long data, int usage, long __functionAddress);

	/** Unsafe version of {@link #glBufferData BufferData} */
	@JavadocExclude
	public static void nglBufferData(int target, long size, long data, int usage) {
		long __functionAddress = getInstance().BufferData;
		nglBufferData(target, size, data, usage, __functionAddress);
	}

	public static void glBufferData(int target, long size, ByteBuffer data, int usage) {
		if ( LWJGLUtil.CHECKS )
			if ( data != null ) checkBuffer(data, size);
		nglBufferData(target, size, memAddressSafe(data), usage);
	}

	/** Alternative version of: {@link #glBufferData BufferData} */
	public static void glBufferData(int target, long size, int usage) {
		nglBufferData(target, size, 0L, usage);
	}

	/** ByteBuffer version of: {@link #glBufferData BufferData} */
	public static void glBufferData(int target, ByteBuffer data, int usage) {
		nglBufferData(target, data.remaining(), memAddress(data), usage);
	}

	/** ShortBuffer version of: {@link #glBufferData BufferData} */
	public static void glBufferData(int target, ShortBuffer data, int usage) {
		nglBufferData(target, data.remaining() << 1, memAddress(data), usage);
	}

	/** IntBuffer version of: {@link #glBufferData BufferData} */
	public static void glBufferData(int target, IntBuffer data, int usage) {
		nglBufferData(target, data.remaining() << 2, memAddress(data), usage);
	}

	/** FloatBuffer version of: {@link #glBufferData BufferData} */
	public static void glBufferData(int target, FloatBuffer data, int usage) {
		nglBufferData(target, data.remaining() << 2, memAddress(data), usage);
	}

	// --- [ glBufferSubData ] ---

	/** JNI method for {@link #glBufferSubData BufferSubData} */
	@JavadocExclude
	public static native void nglBufferSubData(int target, long offset, long size, long data, long __functionAddress);

	/** Unsafe version of {@link #glBufferSubData BufferSubData} */
	@JavadocExclude
	public static void nglBufferSubData(int target, long offset, long size, long data) {
		long __functionAddress = getInstance().BufferSubData;
		nglBufferSubData(target, offset, size, data, __functionAddress);
	}

	public static void glBufferSubData(int target, long offset, long size, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, size);
		nglBufferSubData(target, offset, size, memAddress(data));
	}

	/** Alternative version of: {@link #glBufferSubData BufferSubData} */
	public static void glBufferSubData(int target, long offset, ByteBuffer data) {
		nglBufferSubData(target, offset, data.remaining(), memAddress(data));
	}

	/** ShortBuffer version of: {@link #glBufferSubData BufferSubData} */
	public static void glBufferSubData(int target, long offset, ShortBuffer data) {
		nglBufferSubData(target, offset, data.remaining() << 1, memAddress(data));
	}

	/** IntBuffer version of: {@link #glBufferSubData BufferSubData} */
	public static void glBufferSubData(int target, long offset, IntBuffer data) {
		nglBufferSubData(target, offset, data.remaining() << 2, memAddress(data));
	}

	/** FloatBuffer version of: {@link #glBufferSubData BufferSubData} */
	public static void glBufferSubData(int target, long offset, FloatBuffer data) {
		nglBufferSubData(target, offset, data.remaining() << 2, memAddress(data));
	}

	// --- [ glCheckFramebufferStatus ] ---

	/** JNI method for {@link #glCheckFramebufferStatus CheckFramebufferStatus} */
	@JavadocExclude
	public static native int nglCheckFramebufferStatus(int target, long __functionAddress);

	public static int glCheckFramebufferStatus(int target) {
		long __functionAddress = getInstance().CheckFramebufferStatus;
		return nglCheckFramebufferStatus(target, __functionAddress);
	}

	// --- [ glClear ] ---

	/** JNI method for {@link #glClear Clear} */
	@JavadocExclude
	public static native void nglClear(int mask, long __functionAddress);

	public static void glClear(int mask) {
		long __functionAddress = getInstance().Clear;
		nglClear(mask, __functionAddress);
	}

	// --- [ glClearColor ] ---

	/** JNI method for {@link #glClearColor ClearColor} */
	@JavadocExclude
	public static native void nglClearColor(float red, float green, float blue, float alpha, long __functionAddress);

	public static void glClearColor(float red, float green, float blue, float alpha) {
		long __functionAddress = getInstance().ClearColor;
		nglClearColor(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glClearDepthf ] ---

	/** JNI method for {@link #glClearDepthf ClearDepthf} */
	@JavadocExclude
	public static native void nglClearDepthf(float d, long __functionAddress);

	public static void glClearDepthf(float d) {
		long __functionAddress = getInstance().ClearDepthf;
		nglClearDepthf(d, __functionAddress);
	}

	// --- [ glClearStencil ] ---

	/** JNI method for {@link #glClearStencil ClearStencil} */
	@JavadocExclude
	public static native void nglClearStencil(int s, long __functionAddress);

	public static void glClearStencil(int s) {
		long __functionAddress = getInstance().ClearStencil;
		nglClearStencil(s, __functionAddress);
	}

	// --- [ glColorMask ] ---

	/** JNI method for {@link #glColorMask ColorMask} */
	@JavadocExclude
	public static native void nglColorMask(boolean red, boolean green, boolean blue, boolean alpha, long __functionAddress);

	public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
		long __functionAddress = getInstance().ColorMask;
		nglColorMask(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glCompileShader ] ---

	/** JNI method for {@link #glCompileShader CompileShader} */
	@JavadocExclude
	public static native void nglCompileShader(int shader, long __functionAddress);

	public static void glCompileShader(int shader) {
		long __functionAddress = getInstance().CompileShader;
		nglCompileShader(shader, __functionAddress);
	}

	// --- [ glCompressedTexImage2D ] ---

	/** JNI method for {@link #glCompressedTexImage2D CompressedTexImage2D} */
	@JavadocExclude
	public static native void nglCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTexImage2D CompressedTexImage2D} */
	@JavadocExclude
	public static void nglCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTexImage2D;
		nglCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data, __functionAddress);
	}

	public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			if ( data != null ) checkBuffer(data, imageSize);
		nglCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, memAddressSafe(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTexImage2D CompressedTexImage2D} */
	public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long dataOffset) {
		nglCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTexImage2D CompressedTexImage2D} */
	public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
		nglCompressedTexImage2D(target, level, internalformat, width, height, border, data == null ? 0 : data.remaining(), memAddressSafe(data));
	}

	// --- [ glCompressedTexSubImage2D ] ---

	/** JNI method for {@link #glCompressedTexSubImage2D CompressedTexSubImage2D} */
	@JavadocExclude
	public static native void nglCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTexSubImage2D CompressedTexSubImage2D} */
	@JavadocExclude
	public static void nglCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTexSubImage2D;
		nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data, __functionAddress);
	}

	public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, imageSize);
		nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTexSubImage2D CompressedTexSubImage2D} */
	public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long dataOffset) {
		nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTexSubImage2D CompressedTexSubImage2D} */
	public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
		nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
	}

	// --- [ glCopyTexImage2D ] ---

	/** JNI method for {@link #glCopyTexImage2D CopyTexImage2D} */
	@JavadocExclude
	public static native void nglCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border, long __functionAddress);

	public static void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
		long __functionAddress = getInstance().CopyTexImage2D;
		nglCopyTexImage2D(target, level, internalformat, x, y, width, height, border, __functionAddress);
	}

	// --- [ glCopyTexSubImage2D ] ---

	/** JNI method for {@link #glCopyTexSubImage2D CopyTexSubImage2D} */
	@JavadocExclude
	public static native void nglCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height, long __functionAddress);

	public static void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().CopyTexSubImage2D;
		nglCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height, __functionAddress);
	}

	// --- [ glCreateProgram ] ---

	/** JNI method for {@link #glCreateProgram CreateProgram} */
	@JavadocExclude
	public static native int nglCreateProgram(long __functionAddress);

	public static int glCreateProgram() {
		long __functionAddress = getInstance().CreateProgram;
		return nglCreateProgram(__functionAddress);
	}

	// --- [ glCreateShader ] ---

	/** JNI method for {@link #glCreateShader CreateShader} */
	@JavadocExclude
	public static native int nglCreateShader(int type, long __functionAddress);

	public static int glCreateShader(int type) {
		long __functionAddress = getInstance().CreateShader;
		return nglCreateShader(type, __functionAddress);
	}

	// --- [ glCullFace ] ---

	/** JNI method for {@link #glCullFace CullFace} */
	@JavadocExclude
	public static native void nglCullFace(int mode, long __functionAddress);

	public static void glCullFace(int mode) {
		long __functionAddress = getInstance().CullFace;
		nglCullFace(mode, __functionAddress);
	}

	// --- [ glDeleteBuffers ] ---

	/** JNI method for {@link #glDeleteBuffers DeleteBuffers} */
	@JavadocExclude
	public static native void nglDeleteBuffers(int n, long buffers, long __functionAddress);

	/** Unsafe version of {@link #glDeleteBuffers DeleteBuffers} */
	@JavadocExclude
	public static void nglDeleteBuffers(int n, long buffers) {
		long __functionAddress = getInstance().DeleteBuffers;
		nglDeleteBuffers(n, buffers, __functionAddress);
	}

	public static void glDeleteBuffers(int n, ByteBuffer buffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffers, n << 2);
		nglDeleteBuffers(n, memAddress(buffers));
	}

	/** Alternative version of: {@link #glDeleteBuffers DeleteBuffers} */
	public static void glDeleteBuffers(IntBuffer buffers) {
		nglDeleteBuffers(buffers.remaining(), memAddress(buffers));
	}

	/** Single value version of: {@link #glDeleteBuffers DeleteBuffers} */
	public static void glDeleteBuffers(int buffer) {
		APIBuffer __buffer = apiBuffer();
		int buffers = __buffer.intParam(buffer);
		nglDeleteBuffers(1, __buffer.address(buffers));
	}

	// --- [ glDeleteFramebuffers ] ---

	/** JNI method for {@link #glDeleteFramebuffers DeleteFramebuffers} */
	@JavadocExclude
	public static native void nglDeleteFramebuffers(int n, long framebuffers, long __functionAddress);

	/** Unsafe version of {@link #glDeleteFramebuffers DeleteFramebuffers} */
	@JavadocExclude
	public static void nglDeleteFramebuffers(int n, long framebuffers) {
		long __functionAddress = getInstance().DeleteFramebuffers;
		nglDeleteFramebuffers(n, framebuffers, __functionAddress);
	}

	public static void glDeleteFramebuffers(int n, ByteBuffer framebuffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(framebuffers, n << 2);
		nglDeleteFramebuffers(n, memAddress(framebuffers));
	}

	/** Alternative version of: {@link #glDeleteFramebuffers DeleteFramebuffers} */
	public static void glDeleteFramebuffers(IntBuffer framebuffers) {
		nglDeleteFramebuffers(framebuffers.remaining(), memAddress(framebuffers));
	}

	/** Single value version of: {@link #glDeleteFramebuffers DeleteFramebuffers} */
	public static void glDeleteFramebuffers(int framebuffer) {
		APIBuffer __buffer = apiBuffer();
		int framebuffers = __buffer.intParam(framebuffer);
		nglDeleteFramebuffers(1, __buffer.address(framebuffers));
	}

	// --- [ glDeleteProgram ] ---

	/** JNI method for {@link #glDeleteProgram DeleteProgram} */
	@JavadocExclude
	public static native void nglDeleteProgram(int program, long __functionAddress);

	public static void glDeleteProgram(int program) {
		long __functionAddress = getInstance().DeleteProgram;
		nglDeleteProgram(program, __functionAddress);
	}

	// --- [ glDeleteRenderbuffers ] ---

	/** JNI method for {@link #glDeleteRenderbuffers DeleteRenderbuffers} */
	@JavadocExclude
	public static native void nglDeleteRenderbuffers(int n, long renderbuffers, long __functionAddress);

	/** Unsafe version of {@link #glDeleteRenderbuffers DeleteRenderbuffers} */
	@JavadocExclude
	public static void nglDeleteRenderbuffers(int n, long renderbuffers) {
		long __functionAddress = getInstance().DeleteRenderbuffers;
		nglDeleteRenderbuffers(n, renderbuffers, __functionAddress);
	}

	public static void glDeleteRenderbuffers(int n, ByteBuffer renderbuffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(renderbuffers, n << 2);
		nglDeleteRenderbuffers(n, memAddress(renderbuffers));
	}

	/** Alternative version of: {@link #glDeleteRenderbuffers DeleteRenderbuffers} */
	public static void glDeleteRenderbuffers(IntBuffer renderbuffers) {
		nglDeleteRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers));
	}

	/** Single value version of: {@link #glDeleteRenderbuffers DeleteRenderbuffers} */
	public static void glDeleteRenderbuffers(int renderbuffer) {
		APIBuffer __buffer = apiBuffer();
		int renderbuffers = __buffer.intParam(renderbuffer);
		nglDeleteRenderbuffers(1, __buffer.address(renderbuffers));
	}

	// --- [ glDeleteShader ] ---

	/** JNI method for {@link #glDeleteShader DeleteShader} */
	@JavadocExclude
	public static native void nglDeleteShader(int shader, long __functionAddress);

	public static void glDeleteShader(int shader) {
		long __functionAddress = getInstance().DeleteShader;
		nglDeleteShader(shader, __functionAddress);
	}

	// --- [ glDeleteTextures ] ---

	/** JNI method for {@link #glDeleteTextures DeleteTextures} */
	@JavadocExclude
	public static native void nglDeleteTextures(int n, long textures, long __functionAddress);

	/** Unsafe version of {@link #glDeleteTextures DeleteTextures} */
	@JavadocExclude
	public static void nglDeleteTextures(int n, long textures) {
		long __functionAddress = getInstance().DeleteTextures;
		nglDeleteTextures(n, textures, __functionAddress);
	}

	public static void glDeleteTextures(int n, ByteBuffer textures) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(textures, n << 2);
		nglDeleteTextures(n, memAddress(textures));
	}

	/** Alternative version of: {@link #glDeleteTextures DeleteTextures} */
	public static void glDeleteTextures(IntBuffer textures) {
		nglDeleteTextures(textures.remaining(), memAddress(textures));
	}

	/** Single value version of: {@link #glDeleteTextures DeleteTextures} */
	public static void glDeleteTextures(int texture) {
		APIBuffer __buffer = apiBuffer();
		int textures = __buffer.intParam(texture);
		nglDeleteTextures(1, __buffer.address(textures));
	}

	// --- [ glDepthFunc ] ---

	/** JNI method for {@link #glDepthFunc DepthFunc} */
	@JavadocExclude
	public static native void nglDepthFunc(int func, long __functionAddress);

	public static void glDepthFunc(int func) {
		long __functionAddress = getInstance().DepthFunc;
		nglDepthFunc(func, __functionAddress);
	}

	// --- [ glDepthMask ] ---

	/** JNI method for {@link #glDepthMask DepthMask} */
	@JavadocExclude
	public static native void nglDepthMask(boolean flag, long __functionAddress);

	public static void glDepthMask(boolean flag) {
		long __functionAddress = getInstance().DepthMask;
		nglDepthMask(flag, __functionAddress);
	}

	// --- [ glDepthRangef ] ---

	/** JNI method for {@link #glDepthRangef DepthRangef} */
	@JavadocExclude
	public static native void nglDepthRangef(float n, float f, long __functionAddress);

	public static void glDepthRangef(float n, float f) {
		long __functionAddress = getInstance().DepthRangef;
		nglDepthRangef(n, f, __functionAddress);
	}

	// --- [ glDetachShader ] ---

	/** JNI method for {@link #glDetachShader DetachShader} */
	@JavadocExclude
	public static native void nglDetachShader(int program, int shader, long __functionAddress);

	public static void glDetachShader(int program, int shader) {
		long __functionAddress = getInstance().DetachShader;
		nglDetachShader(program, shader, __functionAddress);
	}

	// --- [ glDisable ] ---

	/** JNI method for {@link #glDisable Disable} */
	@JavadocExclude
	public static native void nglDisable(int cap, long __functionAddress);

	public static void glDisable(int cap) {
		long __functionAddress = getInstance().Disable;
		nglDisable(cap, __functionAddress);
	}

	// --- [ glDisableVertexAttribArray ] ---

	/** JNI method for {@link #glDisableVertexAttribArray DisableVertexAttribArray} */
	@JavadocExclude
	public static native void nglDisableVertexAttribArray(int index, long __functionAddress);

	public static void glDisableVertexAttribArray(int index) {
		long __functionAddress = getInstance().DisableVertexAttribArray;
		nglDisableVertexAttribArray(index, __functionAddress);
	}

	// --- [ glDrawArrays ] ---

	/** JNI method for {@link #glDrawArrays DrawArrays} */
	@JavadocExclude
	public static native void nglDrawArrays(int mode, int first, int count, long __functionAddress);

	public static void glDrawArrays(int mode, int first, int count) {
		long __functionAddress = getInstance().DrawArrays;
		nglDrawArrays(mode, first, count, __functionAddress);
	}

	// --- [ glDrawElements ] ---

	/** JNI method for {@link #glDrawElements DrawElements} */
	@JavadocExclude
	public static native void nglDrawElements(int mode, int count, int type, long indices, long __functionAddress);

	/** Unsafe version of {@link #glDrawElements DrawElements} */
	@JavadocExclude
	public static void nglDrawElements(int mode, int count, int type, long indices) {
		long __functionAddress = getInstance().DrawElements;
		nglDrawElements(mode, count, type, indices, __functionAddress);
	}

	public static void glDrawElements(int mode, int count, int type, ByteBuffer indices) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, count << GLESChecks.typeToByteShift(type));
		nglDrawElements(mode, count, type, memAddress(indices));
	}

	/** Buffer object offset version of: {@link #glDrawElements DrawElements} */
	public static void glDrawElements(int mode, int count, int type, long indicesOffset) {
		nglDrawElements(mode, count, type, indicesOffset);
	}

	/** Alternative version of: {@link #glDrawElements DrawElements} */
	public static void glDrawElements(int mode, int type, ByteBuffer indices) {
		nglDrawElements(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices));
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElements DrawElements} */
	public static void glDrawElements(int mode, ByteBuffer indices) {
		nglDrawElements(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices));
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElements DrawElements} */
	public static void glDrawElements(int mode, ShortBuffer indices) {
		nglDrawElements(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices));
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElements DrawElements} */
	public static void glDrawElements(int mode, IntBuffer indices) {
		nglDrawElements(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices));
	}

	// --- [ glEnable ] ---

	/** JNI method for {@link #glEnable Enable} */
	@JavadocExclude
	public static native void nglEnable(int cap, long __functionAddress);

	public static void glEnable(int cap) {
		long __functionAddress = getInstance().Enable;
		nglEnable(cap, __functionAddress);
	}

	// --- [ glEnableVertexAttribArray ] ---

	/** JNI method for {@link #glEnableVertexAttribArray EnableVertexAttribArray} */
	@JavadocExclude
	public static native void nglEnableVertexAttribArray(int index, long __functionAddress);

	public static void glEnableVertexAttribArray(int index) {
		long __functionAddress = getInstance().EnableVertexAttribArray;
		nglEnableVertexAttribArray(index, __functionAddress);
	}

	// --- [ glFinish ] ---

	/** JNI method for {@link #glFinish Finish} */
	@JavadocExclude
	public static native void nglFinish(long __functionAddress);

	public static void glFinish() {
		long __functionAddress = getInstance().Finish;
		nglFinish(__functionAddress);
	}

	// --- [ glFlush ] ---

	/** JNI method for {@link #glFlush Flush} */
	@JavadocExclude
	public static native void nglFlush(long __functionAddress);

	public static void glFlush() {
		long __functionAddress = getInstance().Flush;
		nglFlush(__functionAddress);
	}

	// --- [ glFramebufferRenderbuffer ] ---

	/** JNI method for {@link #glFramebufferRenderbuffer FramebufferRenderbuffer} */
	@JavadocExclude
	public static native void nglFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer, long __functionAddress);

	public static void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
		long __functionAddress = getInstance().FramebufferRenderbuffer;
		nglFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer, __functionAddress);
	}

	// --- [ glFramebufferTexture2D ] ---

	/** JNI method for {@link #glFramebufferTexture2D FramebufferTexture2D} */
	@JavadocExclude
	public static native void nglFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level, long __functionAddress);

	public static void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
		long __functionAddress = getInstance().FramebufferTexture2D;
		nglFramebufferTexture2D(target, attachment, textarget, texture, level, __functionAddress);
	}

	// --- [ glFrontFace ] ---

	/** JNI method for {@link #glFrontFace FrontFace} */
	@JavadocExclude
	public static native void nglFrontFace(int mode, long __functionAddress);

	public static void glFrontFace(int mode) {
		long __functionAddress = getInstance().FrontFace;
		nglFrontFace(mode, __functionAddress);
	}

	// --- [ glGenBuffers ] ---

	/** JNI method for {@link #glGenBuffers GenBuffers} */
	@JavadocExclude
	public static native void nglGenBuffers(int n, long buffers, long __functionAddress);

	/** Unsafe version of {@link #glGenBuffers GenBuffers} */
	@JavadocExclude
	public static void nglGenBuffers(int n, long buffers) {
		long __functionAddress = getInstance().GenBuffers;
		nglGenBuffers(n, buffers, __functionAddress);
	}

	public static void glGenBuffers(int n, ByteBuffer buffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffers, n << 2);
		nglGenBuffers(n, memAddress(buffers));
	}

	/** Alternative version of: {@link #glGenBuffers GenBuffers} */
	public static void glGenBuffers(IntBuffer buffers) {
		nglGenBuffers(buffers.remaining(), memAddress(buffers));
	}

	/** Single return value version of: {@link #glGenBuffers GenBuffers} */
	public static int glGenBuffers() {
		APIBuffer __buffer = apiBuffer();
		int buffers = __buffer.intParam();
		nglGenBuffers(1, __buffer.address(buffers));
		return __buffer.intValue(buffers);
	}

	// --- [ glGenerateMipmap ] ---

	/** JNI method for {@link #glGenerateMipmap GenerateMipmap} */
	@JavadocExclude
	public static native void nglGenerateMipmap(int target, long __functionAddress);

	public static void glGenerateMipmap(int target) {
		long __functionAddress = getInstance().GenerateMipmap;
		nglGenerateMipmap(target, __functionAddress);
	}

	// --- [ glGenFramebuffers ] ---

	/** JNI method for {@link #glGenFramebuffers GenFramebuffers} */
	@JavadocExclude
	public static native void nglGenFramebuffers(int n, long framebuffers, long __functionAddress);

	/** Unsafe version of {@link #glGenFramebuffers GenFramebuffers} */
	@JavadocExclude
	public static void nglGenFramebuffers(int n, long framebuffers) {
		long __functionAddress = getInstance().GenFramebuffers;
		nglGenFramebuffers(n, framebuffers, __functionAddress);
	}

	public static void glGenFramebuffers(int n, ByteBuffer framebuffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(framebuffers, n << 2);
		nglGenFramebuffers(n, memAddress(framebuffers));
	}

	/** Alternative version of: {@link #glGenFramebuffers GenFramebuffers} */
	public static void glGenFramebuffers(IntBuffer framebuffers) {
		nglGenFramebuffers(framebuffers.remaining(), memAddress(framebuffers));
	}

	/** Single return value version of: {@link #glGenFramebuffers GenFramebuffers} */
	public static int glGenFramebuffers() {
		APIBuffer __buffer = apiBuffer();
		int framebuffers = __buffer.intParam();
		nglGenFramebuffers(1, __buffer.address(framebuffers));
		return __buffer.intValue(framebuffers);
	}

	// --- [ glGenRenderbuffers ] ---

	/** JNI method for {@link #glGenRenderbuffers GenRenderbuffers} */
	@JavadocExclude
	public static native void nglGenRenderbuffers(int n, long renderbuffers, long __functionAddress);

	/** Unsafe version of {@link #glGenRenderbuffers GenRenderbuffers} */
	@JavadocExclude
	public static void nglGenRenderbuffers(int n, long renderbuffers) {
		long __functionAddress = getInstance().GenRenderbuffers;
		nglGenRenderbuffers(n, renderbuffers, __functionAddress);
	}

	public static void glGenRenderbuffers(int n, ByteBuffer renderbuffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(renderbuffers, n << 2);
		nglGenRenderbuffers(n, memAddress(renderbuffers));
	}

	/** Alternative version of: {@link #glGenRenderbuffers GenRenderbuffers} */
	public static void glGenRenderbuffers(IntBuffer renderbuffers) {
		nglGenRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers));
	}

	/** Single return value version of: {@link #glGenRenderbuffers GenRenderbuffers} */
	public static int glGenRenderbuffers() {
		APIBuffer __buffer = apiBuffer();
		int renderbuffers = __buffer.intParam();
		nglGenRenderbuffers(1, __buffer.address(renderbuffers));
		return __buffer.intValue(renderbuffers);
	}

	// --- [ glGenTextures ] ---

	/** JNI method for {@link #glGenTextures GenTextures} */
	@JavadocExclude
	public static native void nglGenTextures(int n, long textures, long __functionAddress);

	/** Unsafe version of {@link #glGenTextures GenTextures} */
	@JavadocExclude
	public static void nglGenTextures(int n, long textures) {
		long __functionAddress = getInstance().GenTextures;
		nglGenTextures(n, textures, __functionAddress);
	}

	public static void glGenTextures(int n, ByteBuffer textures) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(textures, n << 2);
		nglGenTextures(n, memAddress(textures));
	}

	/** Alternative version of: {@link #glGenTextures GenTextures} */
	public static void glGenTextures(IntBuffer textures) {
		nglGenTextures(textures.remaining(), memAddress(textures));
	}

	/** Single return value version of: {@link #glGenTextures GenTextures} */
	public static int glGenTextures() {
		APIBuffer __buffer = apiBuffer();
		int textures = __buffer.intParam();
		nglGenTextures(1, __buffer.address(textures));
		return __buffer.intValue(textures);
	}

	// --- [ glGetActiveAttrib ] ---

	/** JNI method for {@link #glGetActiveAttrib GetActiveAttrib} */
	@JavadocExclude
	public static native void nglGetActiveAttrib(int program, int index, int bufSize, long length, long size, long type, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetActiveAttrib GetActiveAttrib} */
	@JavadocExclude
	public static void nglGetActiveAttrib(int program, int index, int bufSize, long length, long size, long type, long name) {
		long __functionAddress = getInstance().GetActiveAttrib;
		nglGetActiveAttrib(program, index, bufSize, length, size, type, name, __functionAddress);
	}

	public static void glGetActiveAttrib(int program, int index, int bufSize, ByteBuffer length, ByteBuffer size, ByteBuffer type, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
			checkBuffer(size, 1 << 2);
			checkBuffer(type, 1 << 2);
		}
		nglGetActiveAttrib(program, index, bufSize, memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** Alternative version of: {@link #glGetActiveAttrib GetActiveAttrib} */
	public static void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetActiveAttrib(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** String return version of: {@link #glGetActiveAttrib GetActiveAttrib} */
	public static String glGetActiveAttrib(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetActiveAttrib(program, index, bufSize, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(__buffer.buffer(), __buffer.intValue(length), name);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveAttrib GetActiveAttrib} */
	public static String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		int bufSize = glGetProgrami(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetActiveAttrib(program, index, bufSize, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(__buffer.buffer(), __buffer.intValue(length), name);
	}

	// --- [ glGetActiveUniform ] ---

	/** JNI method for {@link #glGetActiveUniform GetActiveUniform} */
	@JavadocExclude
	public static native void nglGetActiveUniform(int program, int index, int bufSize, long length, long size, long type, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetActiveUniform GetActiveUniform} */
	@JavadocExclude
	public static void nglGetActiveUniform(int program, int index, int bufSize, long length, long size, long type, long name) {
		long __functionAddress = getInstance().GetActiveUniform;
		nglGetActiveUniform(program, index, bufSize, length, size, type, name, __functionAddress);
	}

	public static void glGetActiveUniform(int program, int index, int bufSize, ByteBuffer length, ByteBuffer size, ByteBuffer type, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
			checkBuffer(size, 1 << 2);
			checkBuffer(type, 1 << 2);
		}
		nglGetActiveUniform(program, index, bufSize, memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
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
	public static String glGetActiveUniform(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetActiveUniform(program, index, bufSize, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(__buffer.buffer(), __buffer.intValue(length), name);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveUniform GetActiveUniform} */
	public static String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		int bufSize = glGetProgrami(program, GL_ACTIVE_UNIFORM_MAX_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetActiveUniform(program, index, bufSize, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(__buffer.buffer(), __buffer.intValue(length), name);
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

	// --- [ glGetBooleanv ] ---

	/** JNI method for {@link #glGetBooleanv GetBooleanv} */
	@JavadocExclude
	public static native void nglGetBooleanv(int pname, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetBooleanv GetBooleanv} */
	@JavadocExclude
	public static void nglGetBooleanv(int pname, long data) {
		long __functionAddress = getInstance().GetBooleanv;
		nglGetBooleanv(pname, data, __functionAddress);
	}

	public static void glGetBooleanv(int pname, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetBooleanv(pname, memAddress(data));
	}

	/** Single return value version of: {@link #glGetBooleanv GetBooleanv} */
	public static boolean glGetBoolean(int pname) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.booleanParam();
		nglGetBooleanv(pname, __buffer.address(data));
		return __buffer.booleanValue(data);
	}

	// --- [ glGetBufferParameteriv ] ---

	/** JNI method for {@link #glGetBufferParameteriv GetBufferParameteriv} */
	@JavadocExclude
	public static native void nglGetBufferParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetBufferParameteriv GetBufferParameteriv} */
	@JavadocExclude
	public static void nglGetBufferParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetBufferParameteriv;
		nglGetBufferParameteriv(target, pname, params, __functionAddress);
	}

	public static void glGetBufferParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetBufferParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetBufferParameteriv GetBufferParameteriv} */
	public static void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetBufferParameteriv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetBufferParameteriv GetBufferParameteriv} */
	public static int glGetBufferParameteri(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetBufferParameteriv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetError ] ---

	/** JNI method for {@link #glGetError GetError} */
	@JavadocExclude
	public static native int nglGetError(long __functionAddress);

	public static int glGetError() {
		long __functionAddress = getInstance().GetError;
		return nglGetError(__functionAddress);
	}

	// --- [ glGetFloatv ] ---

	/** JNI method for {@link #glGetFloatv GetFloatv} */
	@JavadocExclude
	public static native void nglGetFloatv(int pname, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetFloatv GetFloatv} */
	@JavadocExclude
	public static void nglGetFloatv(int pname, long data) {
		long __functionAddress = getInstance().GetFloatv;
		nglGetFloatv(pname, data, __functionAddress);
	}

	public static void glGetFloatv(int pname, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1 << 2);
		nglGetFloatv(pname, memAddress(data));
	}

	/** Alternative version of: {@link #glGetFloatv GetFloatv} */
	public static void glGetFloatv(int pname, FloatBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetFloatv(pname, memAddress(data));
	}

	/** Single return value version of: {@link #glGetFloatv GetFloatv} */
	public static float glGetFloat(int pname) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetFloatv(pname, __buffer.address(data));
		return __buffer.floatValue(data);
	}

	// --- [ glGetFramebufferAttachmentParameteriv ] ---

	/** JNI method for {@link #glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv} */
	@JavadocExclude
	public static native void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv} */
	@JavadocExclude
	public static void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params) {
		long __functionAddress = getInstance().GetFramebufferAttachmentParameteriv;
		nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params, __functionAddress);
	}

	public static void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetFramebufferAttachmentParameteriv(target, attachment, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv} */
	public static void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetFramebufferAttachmentParameteriv(target, attachment, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv} */
	public static int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetFramebufferAttachmentParameteriv(target, attachment, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetIntegerv ] ---

	/** JNI method for {@link #glGetIntegerv GetIntegerv} */
	@JavadocExclude
	public static native void nglGetIntegerv(int pname, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetIntegerv GetIntegerv} */
	@JavadocExclude
	public static void nglGetIntegerv(int pname, long data) {
		long __functionAddress = getInstance().GetIntegerv;
		nglGetIntegerv(pname, data, __functionAddress);
	}

	public static void glGetIntegerv(int pname, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1 << 2);
		nglGetIntegerv(pname, memAddress(data));
	}

	/** Alternative version of: {@link #glGetIntegerv GetIntegerv} */
	public static void glGetIntegerv(int pname, IntBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetIntegerv(pname, memAddress(data));
	}

	/** Single return value version of: {@link #glGetIntegerv GetIntegerv} */
	public static int glGetInteger(int pname) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetIntegerv(pname, __buffer.address(data));
		return __buffer.intValue(data);
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

	// --- [ glGetProgramInfoLog ] ---

	/** JNI method for {@link #glGetProgramInfoLog GetProgramInfoLog} */
	@JavadocExclude
	public static native void nglGetProgramInfoLog(int program, int bufSize, long length, long infoLog, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramInfoLog GetProgramInfoLog} */
	@JavadocExclude
	public static void nglGetProgramInfoLog(int program, int bufSize, long length, long infoLog) {
		long __functionAddress = getInstance().GetProgramInfoLog;
		nglGetProgramInfoLog(program, bufSize, length, infoLog, __functionAddress);
	}

	public static void glGetProgramInfoLog(int program, int bufSize, ByteBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(infoLog, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramInfoLog(program, bufSize, memAddressSafe(length), memAddress(infoLog));
	}

	/** Alternative version of: {@link #glGetProgramInfoLog GetProgramInfoLog} */
	public static void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramInfoLog(program, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
	}

	/** String return version of: {@link #glGetProgramInfoLog GetProgramInfoLog} */
	public static String glGetProgramInfoLog(int program, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(bufSize);
		nglGetProgramInfoLog(program, bufSize, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), infoLog);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetProgramInfoLog GetProgramInfoLog} */
	public static String glGetProgramInfoLog(int program) {
		int bufSize = glGetProgrami(program, GL_INFO_LOG_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(bufSize);
		nglGetProgramInfoLog(program, bufSize, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), infoLog);
	}

	// --- [ glGetRenderbufferParameteriv ] ---

	/** JNI method for {@link #glGetRenderbufferParameteriv GetRenderbufferParameteriv} */
	@JavadocExclude
	public static native void nglGetRenderbufferParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetRenderbufferParameteriv GetRenderbufferParameteriv} */
	@JavadocExclude
	public static void nglGetRenderbufferParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetRenderbufferParameteriv;
		nglGetRenderbufferParameteriv(target, pname, params, __functionAddress);
	}

	public static void glGetRenderbufferParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetRenderbufferParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetRenderbufferParameteriv GetRenderbufferParameteriv} */
	public static void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetRenderbufferParameteriv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetRenderbufferParameteriv GetRenderbufferParameteriv} */
	public static int glGetRenderbufferParameteri(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetRenderbufferParameteriv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
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

	// --- [ glGetShaderInfoLog ] ---

	/** JNI method for {@link #glGetShaderInfoLog GetShaderInfoLog} */
	@JavadocExclude
	public static native void nglGetShaderInfoLog(int shader, int bufSize, long length, long infoLog, long __functionAddress);

	/** Unsafe version of {@link #glGetShaderInfoLog GetShaderInfoLog} */
	@JavadocExclude
	public static void nglGetShaderInfoLog(int shader, int bufSize, long length, long infoLog) {
		long __functionAddress = getInstance().GetShaderInfoLog;
		nglGetShaderInfoLog(shader, bufSize, length, infoLog, __functionAddress);
	}

	public static void glGetShaderInfoLog(int shader, int bufSize, ByteBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(infoLog, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetShaderInfoLog(shader, bufSize, memAddressSafe(length), memAddress(infoLog));
	}

	/** Alternative version of: {@link #glGetShaderInfoLog GetShaderInfoLog} */
	public static void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetShaderInfoLog(shader, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
	}

	/** String return version of: {@link #glGetShaderInfoLog GetShaderInfoLog} */
	public static String glGetShaderInfoLog(int shader, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(bufSize);
		nglGetShaderInfoLog(shader, bufSize, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), infoLog);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetShaderInfoLog GetShaderInfoLog} */
	public static String glGetShaderInfoLog(int shader) {
		int bufSize = glGetShaderi(shader, GL_INFO_LOG_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(bufSize);
		nglGetShaderInfoLog(shader, bufSize, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), infoLog);
	}

	// --- [ glGetShaderPrecisionFormat ] ---

	/** JNI method for {@link #glGetShaderPrecisionFormat GetShaderPrecisionFormat} */
	@JavadocExclude
	public static native void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision, long __functionAddress);

	/** Unsafe version of {@link #glGetShaderPrecisionFormat GetShaderPrecisionFormat} */
	@JavadocExclude
	public static void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision) {
		long __functionAddress = getInstance().GetShaderPrecisionFormat;
		nglGetShaderPrecisionFormat(shadertype, precisiontype, range, precision, __functionAddress);
	}

	public static void glGetShaderPrecisionFormat(int shadertype, int precisiontype, ByteBuffer range, ByteBuffer precision) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(range, 2 << 2);
			checkBuffer(precision, 2 << 2);
		}
		nglGetShaderPrecisionFormat(shadertype, precisiontype, memAddress(range), memAddress(precision));
	}

	/** Alternative version of: {@link #glGetShaderPrecisionFormat GetShaderPrecisionFormat} */
	public static void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(range, 2);
			checkBuffer(precision, 2);
		}
		nglGetShaderPrecisionFormat(shadertype, precisiontype, memAddress(range), memAddress(precision));
	}

	// --- [ glGetShaderSource ] ---

	/** JNI method for {@link #glGetShaderSource GetShaderSource} */
	@JavadocExclude
	public static native void nglGetShaderSource(int shader, int bufSize, long length, long source, long __functionAddress);

	/** Unsafe version of {@link #glGetShaderSource GetShaderSource} */
	@JavadocExclude
	public static void nglGetShaderSource(int shader, int bufSize, long length, long source) {
		long __functionAddress = getInstance().GetShaderSource;
		nglGetShaderSource(shader, bufSize, length, source, __functionAddress);
	}

	public static void glGetShaderSource(int shader, int bufSize, ByteBuffer length, ByteBuffer source) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(source, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetShaderSource(shader, bufSize, memAddressSafe(length), memAddress(source));
	}

	/** Alternative version of: {@link #glGetShaderSource GetShaderSource} */
	public static void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetShaderSource(shader, source.remaining(), memAddressSafe(length), memAddress(source));
	}

	/** String return version of: {@link #glGetShaderSource GetShaderSource} */
	public static String glGetShaderSource(int shader, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int source = __buffer.bufferParam(bufSize);
		nglGetShaderSource(shader, bufSize, __buffer.address(length), __buffer.address(source));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), source);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetShaderSource GetShaderSource} */
	public static String glGetShaderSource(int shader) {
		int bufSize = glGetShaderi(shader, GL_SHADER_SOURCE_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int source = __buffer.bufferParam(bufSize);
		nglGetShaderSource(shader, bufSize, __buffer.address(length), __buffer.address(source));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), source);
	}

	// --- [ glGetString ] ---

	/** JNI method for {@link #glGetString GetString} */
	@JavadocExclude
	public static native long nglGetString(int name, long __functionAddress);

	/** Unsafe version of {@link #glGetString GetString} */
	@JavadocExclude
	public static long nglGetString(int name) {
		long __functionAddress = getInstance().GetString;
		return nglGetString(name, __functionAddress);
	}

	public static String glGetString(int name) {
		long __result = nglGetString(name);
		return memDecodeUTF8(__result);
	}

	// --- [ glGetTexParameterfv ] ---

	/** JNI method for {@link #glGetTexParameterfv GetTexParameterfv} */
	@JavadocExclude
	public static native void nglGetTexParameterfv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTexParameterfv GetTexParameterfv} */
	@JavadocExclude
	public static void nglGetTexParameterfv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetTexParameterfv;
		nglGetTexParameterfv(target, pname, params, __functionAddress);
	}

	public static void glGetTexParameterfv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexParameterfv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexParameterfv GetTexParameterfv} */
	public static void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterfv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexParameterfv GetTexParameterfv} */
	public static float glGetTexParameterf(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetTexParameterfv(target, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetTexParameteriv ] ---

	/** JNI method for {@link #glGetTexParameteriv GetTexParameteriv} */
	@JavadocExclude
	public static native void nglGetTexParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTexParameteriv GetTexParameteriv} */
	@JavadocExclude
	public static void nglGetTexParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetTexParameteriv;
		nglGetTexParameteriv(target, pname, params, __functionAddress);
	}

	public static void glGetTexParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexParameteriv GetTexParameteriv} */
	public static void glGetTexParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameteriv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexParameteriv GetTexParameteriv} */
	public static int glGetTexParameteri(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTexParameteriv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
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

	public static void glGetVertexAttribiv(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetVertexAttribiv(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribiv GetVertexAttribiv} */
	public static void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribiv(index, pname, memAddress(params));
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

	// --- [ glHint ] ---

	/** JNI method for {@link #glHint Hint} */
	@JavadocExclude
	public static native void nglHint(int target, int mode, long __functionAddress);

	public static void glHint(int target, int mode) {
		long __functionAddress = getInstance().Hint;
		nglHint(target, mode, __functionAddress);
	}

	// --- [ glIsBuffer ] ---

	/** JNI method for {@link #glIsBuffer IsBuffer} */
	@JavadocExclude
	public static native boolean nglIsBuffer(int buffer, long __functionAddress);

	public static boolean glIsBuffer(int buffer) {
		long __functionAddress = getInstance().IsBuffer;
		return nglIsBuffer(buffer, __functionAddress);
	}

	// --- [ glIsEnabled ] ---

	/** JNI method for {@link #glIsEnabled IsEnabled} */
	@JavadocExclude
	public static native boolean nglIsEnabled(int cap, long __functionAddress);

	public static boolean glIsEnabled(int cap) {
		long __functionAddress = getInstance().IsEnabled;
		return nglIsEnabled(cap, __functionAddress);
	}

	// --- [ glIsFramebuffer ] ---

	/** JNI method for {@link #glIsFramebuffer IsFramebuffer} */
	@JavadocExclude
	public static native boolean nglIsFramebuffer(int framebuffer, long __functionAddress);

	public static boolean glIsFramebuffer(int framebuffer) {
		long __functionAddress = getInstance().IsFramebuffer;
		return nglIsFramebuffer(framebuffer, __functionAddress);
	}

	// --- [ glIsProgram ] ---

	/** JNI method for {@link #glIsProgram IsProgram} */
	@JavadocExclude
	public static native boolean nglIsProgram(int program, long __functionAddress);

	public static boolean glIsProgram(int program) {
		long __functionAddress = getInstance().IsProgram;
		return nglIsProgram(program, __functionAddress);
	}

	// --- [ glIsRenderbuffer ] ---

	/** JNI method for {@link #glIsRenderbuffer IsRenderbuffer} */
	@JavadocExclude
	public static native boolean nglIsRenderbuffer(int renderbuffer, long __functionAddress);

	public static boolean glIsRenderbuffer(int renderbuffer) {
		long __functionAddress = getInstance().IsRenderbuffer;
		return nglIsRenderbuffer(renderbuffer, __functionAddress);
	}

	// --- [ glIsShader ] ---

	/** JNI method for {@link #glIsShader IsShader} */
	@JavadocExclude
	public static native boolean nglIsShader(int shader, long __functionAddress);

	public static boolean glIsShader(int shader) {
		long __functionAddress = getInstance().IsShader;
		return nglIsShader(shader, __functionAddress);
	}

	// --- [ glIsTexture ] ---

	/** JNI method for {@link #glIsTexture IsTexture} */
	@JavadocExclude
	public static native boolean nglIsTexture(int texture, long __functionAddress);

	public static boolean glIsTexture(int texture) {
		long __functionAddress = getInstance().IsTexture;
		return nglIsTexture(texture, __functionAddress);
	}

	// --- [ glLineWidth ] ---

	/** JNI method for {@link #glLineWidth LineWidth} */
	@JavadocExclude
	public static native void nglLineWidth(float width, long __functionAddress);

	public static void glLineWidth(float width) {
		long __functionAddress = getInstance().LineWidth;
		nglLineWidth(width, __functionAddress);
	}

	// --- [ glLinkProgram ] ---

	/** JNI method for {@link #glLinkProgram LinkProgram} */
	@JavadocExclude
	public static native void nglLinkProgram(int program, long __functionAddress);

	public static void glLinkProgram(int program) {
		long __functionAddress = getInstance().LinkProgram;
		nglLinkProgram(program, __functionAddress);
	}

	// --- [ glPixelStorei ] ---

	/** JNI method for {@link #glPixelStorei PixelStorei} */
	@JavadocExclude
	public static native void nglPixelStorei(int pname, int param, long __functionAddress);

	public static void glPixelStorei(int pname, int param) {
		long __functionAddress = getInstance().PixelStorei;
		nglPixelStorei(pname, param, __functionAddress);
	}

	// --- [ glPolygonOffset ] ---

	/** JNI method for {@link #glPolygonOffset PolygonOffset} */
	@JavadocExclude
	public static native void nglPolygonOffset(float factor, float units, long __functionAddress);

	public static void glPolygonOffset(float factor, float units) {
		long __functionAddress = getInstance().PolygonOffset;
		nglPolygonOffset(factor, units, __functionAddress);
	}

	// --- [ glReadPixels ] ---

	/** JNI method for {@link #glReadPixels ReadPixels} */
	@JavadocExclude
	public static native void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glReadPixels ReadPixels} */
	@JavadocExclude
	public static void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
		long __functionAddress = getInstance().ReadPixels;
		nglReadPixels(x, y, width, height, format, type, pixels, __functionAddress);
	}

	public static void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glReadPixels ReadPixels} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, long pixelsOffset) {
		nglReadPixels(x, y, width, height, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glReadPixels ReadPixels} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glReadPixels ReadPixels} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glReadPixels ReadPixels} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	// --- [ glReleaseShaderCompiler ] ---

	/** JNI method for {@link #glReleaseShaderCompiler ReleaseShaderCompiler} */
	@JavadocExclude
	public static native void nglReleaseShaderCompiler(long __functionAddress);

	public static void glReleaseShaderCompiler() {
		long __functionAddress = getInstance().ReleaseShaderCompiler;
		nglReleaseShaderCompiler(__functionAddress);
	}

	// --- [ glRenderbufferStorage ] ---

	/** JNI method for {@link #glRenderbufferStorage RenderbufferStorage} */
	@JavadocExclude
	public static native void nglRenderbufferStorage(int target, int internalformat, int width, int height, long __functionAddress);

	public static void glRenderbufferStorage(int target, int internalformat, int width, int height) {
		long __functionAddress = getInstance().RenderbufferStorage;
		nglRenderbufferStorage(target, internalformat, width, height, __functionAddress);
	}

	// --- [ glSampleCoverage ] ---

	/** JNI method for {@link #glSampleCoverage SampleCoverage} */
	@JavadocExclude
	public static native void nglSampleCoverage(float value, boolean invert, long __functionAddress);

	public static void glSampleCoverage(float value, boolean invert) {
		long __functionAddress = getInstance().SampleCoverage;
		nglSampleCoverage(value, invert, __functionAddress);
	}

	// --- [ glScissor ] ---

	/** JNI method for {@link #glScissor Scissor} */
	@JavadocExclude
	public static native void nglScissor(int x, int y, int width, int height, long __functionAddress);

	public static void glScissor(int x, int y, int width, int height) {
		long __functionAddress = getInstance().Scissor;
		nglScissor(x, y, width, height, __functionAddress);
	}

	// --- [ glShaderBinary ] ---

	/** JNI method for {@link #glShaderBinary ShaderBinary} */
	@JavadocExclude
	public static native void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length, long __functionAddress);

	/** Unsafe version of {@link #glShaderBinary ShaderBinary} */
	@JavadocExclude
	public static void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length) {
		long __functionAddress = getInstance().ShaderBinary;
		nglShaderBinary(count, shaders, binaryformat, binary, length, __functionAddress);
	}

	public static void glShaderBinary(int count, ByteBuffer shaders, int binaryformat, ByteBuffer binary, int length) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(shaders, count << 2);
			checkBuffer(binary, length);
		}
		nglShaderBinary(count, memAddress(shaders), binaryformat, memAddress(binary), length);
	}

	/** Alternative version of: {@link #glShaderBinary ShaderBinary} */
	public static void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary) {
		nglShaderBinary(shaders.remaining(), memAddress(shaders), binaryformat, memAddress(binary), binary.remaining());
	}

	// --- [ glShaderSource ] ---

	/** JNI method for {@link #glShaderSource ShaderSource} */
	@JavadocExclude
	public static native void nglShaderSource(int shader, int count, long string, long length, long __functionAddress);

	/** Unsafe version of {@link #glShaderSource ShaderSource} */
	@JavadocExclude
	public static void nglShaderSource(int shader, int count, long string, long length) {
		long __functionAddress = getInstance().ShaderSource;
		nglShaderSource(shader, count, string, length, __functionAddress);
	}

	public static void glShaderSource(int shader, int count, ByteBuffer string, ByteBuffer length) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(string, count << POINTER_SHIFT);
			if ( length != null ) checkBuffer(length, count << 2);
		}
		nglShaderSource(shader, count, memAddress(string), memAddressSafe(length));
	}

	/** Alternative version of: {@link #glShaderSource ShaderSource} */
	public static void glShaderSource(int shader, PointerBuffer string, IntBuffer length) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, string.remaining());
		nglShaderSource(shader, string.remaining(), memAddress(string), memAddressSafe(length));
	}

	/** Array version of: {@link #glShaderSource ShaderSource} */
	public static void glShaderSource(int shader, CharSequence... string) {
		APIBuffer __buffer = apiBuffer();
		int stringLengths = __buffer.bufferParam(string.length << 2);
		for ( int i = 0; i < string.length; i++ )
			__buffer.intParam(stringLengths, i, string[i].length());
		int stringAddress = __buffer.bufferParam(string.length << POINTER_SHIFT);
		ByteBuffer[] stringBuffers = new ByteBuffer[string.length];
		for ( int i = 0; i < string.length; i++ )
			__buffer.pointerParam(stringAddress, i, memAddress(stringBuffers[i] = memEncodeUTF8(string[i], false)));
		nglShaderSource(shader, string.length, __buffer.address(stringAddress), __buffer.address(stringLengths));
	}

	/** Single string version of: {@link #glShaderSource ShaderSource} */
	public static void glShaderSource(int shader, CharSequence string) {
		APIBuffer __buffer = apiBuffer();
		int stringLengths = __buffer.intParam(string.length());
		ByteBuffer stringBuffers = memEncodeUTF8(string, false);
		int stringAddress = __buffer.pointerParam(memAddress(stringBuffers));
		nglShaderSource(shader, 1, __buffer.address(stringAddress), __buffer.address(stringLengths));
	}

	// --- [ glStencilFunc ] ---

	/** JNI method for {@link #glStencilFunc StencilFunc} */
	@JavadocExclude
	public static native void nglStencilFunc(int func, int ref, int mask, long __functionAddress);

	public static void glStencilFunc(int func, int ref, int mask) {
		long __functionAddress = getInstance().StencilFunc;
		nglStencilFunc(func, ref, mask, __functionAddress);
	}

	// --- [ glStencilFuncSeparate ] ---

	/** JNI method for {@link #glStencilFuncSeparate StencilFuncSeparate} */
	@JavadocExclude
	public static native void nglStencilFuncSeparate(int face, int func, int ref, int mask, long __functionAddress);

	public static void glStencilFuncSeparate(int face, int func, int ref, int mask) {
		long __functionAddress = getInstance().StencilFuncSeparate;
		nglStencilFuncSeparate(face, func, ref, mask, __functionAddress);
	}

	// --- [ glStencilMask ] ---

	/** JNI method for {@link #glStencilMask StencilMask} */
	@JavadocExclude
	public static native void nglStencilMask(int mask, long __functionAddress);

	public static void glStencilMask(int mask) {
		long __functionAddress = getInstance().StencilMask;
		nglStencilMask(mask, __functionAddress);
	}

	// --- [ glStencilMaskSeparate ] ---

	/** JNI method for {@link #glStencilMaskSeparate StencilMaskSeparate} */
	@JavadocExclude
	public static native void nglStencilMaskSeparate(int face, int mask, long __functionAddress);

	public static void glStencilMaskSeparate(int face, int mask) {
		long __functionAddress = getInstance().StencilMaskSeparate;
		nglStencilMaskSeparate(face, mask, __functionAddress);
	}

	// --- [ glStencilOp ] ---

	/** JNI method for {@link #glStencilOp StencilOp} */
	@JavadocExclude
	public static native void nglStencilOp(int fail, int zfail, int zpass, long __functionAddress);

	public static void glStencilOp(int fail, int zfail, int zpass) {
		long __functionAddress = getInstance().StencilOp;
		nglStencilOp(fail, zfail, zpass, __functionAddress);
	}

	// --- [ glStencilOpSeparate ] ---

	/** JNI method for {@link #glStencilOpSeparate StencilOpSeparate} */
	@JavadocExclude
	public static native void nglStencilOpSeparate(int face, int sfail, int dpfail, int dppass, long __functionAddress);

	public static void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
		long __functionAddress = getInstance().StencilOpSeparate;
		nglStencilOpSeparate(face, sfail, dpfail, dppass, __functionAddress);
	}

	// --- [ glTexImage2D ] ---

	/** JNI method for {@link #glTexImage2D TexImage2D} */
	@JavadocExclude
	public static native void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glTexImage2D TexImage2D} */
	@JavadocExclude
	public static void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().TexImage2D;
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
	}

	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** Buffer object offset version of: {@link #glTexImage2D TexImage2D} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixelsOffset) {
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTexImage2D TexImage2D} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glTexImage2D TexImage2D} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glTexImage2D TexImage2D} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glTexParameterf ] ---

	/** JNI method for {@link #glTexParameterf TexParameterf} */
	@JavadocExclude
	public static native void nglTexParameterf(int target, int pname, float param, long __functionAddress);

	public static void glTexParameterf(int target, int pname, float param) {
		long __functionAddress = getInstance().TexParameterf;
		nglTexParameterf(target, pname, param, __functionAddress);
	}

	// --- [ glTexParameterfv ] ---

	/** JNI method for {@link #glTexParameterfv TexParameterfv} */
	@JavadocExclude
	public static native void nglTexParameterfv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTexParameterfv TexParameterfv} */
	@JavadocExclude
	public static void nglTexParameterfv(int target, int pname, long params) {
		long __functionAddress = getInstance().TexParameterfv;
		nglTexParameterfv(target, pname, params, __functionAddress);
	}

	public static void glTexParameterfv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglTexParameterfv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexParameterfv TexParameterfv} */
	public static void glTexParameterfv(int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglTexParameterfv(target, pname, memAddress(params));
	}

	// --- [ glTexParameteri ] ---

	/** JNI method for {@link #glTexParameteri TexParameteri} */
	@JavadocExclude
	public static native void nglTexParameteri(int target, int pname, int param, long __functionAddress);

	public static void glTexParameteri(int target, int pname, int param) {
		long __functionAddress = getInstance().TexParameteri;
		nglTexParameteri(target, pname, param, __functionAddress);
	}

	// --- [ glTexParameteriv ] ---

	/** JNI method for {@link #glTexParameteriv TexParameteriv} */
	@JavadocExclude
	public static native void nglTexParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTexParameteriv TexParameteriv} */
	@JavadocExclude
	public static void nglTexParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().TexParameteriv;
		nglTexParameteriv(target, pname, params, __functionAddress);
	}

	public static void glTexParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglTexParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexParameteriv TexParameteriv} */
	public static void glTexParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglTexParameteriv(target, pname, memAddress(params));
	}

	// --- [ glTexSubImage2D ] ---

	/** JNI method for {@link #glTexSubImage2D TexSubImage2D} */
	@JavadocExclude
	public static native void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glTexSubImage2D TexSubImage2D} */
	@JavadocExclude
	public static void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
		long __functionAddress = getInstance().TexSubImage2D;
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
	}

	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glTexSubImage2D TexSubImage2D} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixelsOffset) {
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	// --- [ glUniform1f ] ---

	/** JNI method for {@link #glUniform1f Uniform1f} */
	@JavadocExclude
	public static native void nglUniform1f(int location, float v0, long __functionAddress);

	public static void glUniform1f(int location, float v0) {
		long __functionAddress = getInstance().Uniform1f;
		nglUniform1f(location, v0, __functionAddress);
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

	public static void glUniform1fv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglUniform1fv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1fv Uniform1fv} */
	public static void glUniform1fv(int location, FloatBuffer value) {
		nglUniform1fv(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform1i ] ---

	/** JNI method for {@link #glUniform1i Uniform1i} */
	@JavadocExclude
	public static native void nglUniform1i(int location, int v0, long __functionAddress);

	public static void glUniform1i(int location, int v0) {
		long __functionAddress = getInstance().Uniform1i;
		nglUniform1i(location, v0, __functionAddress);
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

	public static void glUniform1iv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglUniform1iv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1iv Uniform1iv} */
	public static void glUniform1iv(int location, IntBuffer value) {
		nglUniform1iv(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2f ] ---

	/** JNI method for {@link #glUniform2f Uniform2f} */
	@JavadocExclude
	public static native void nglUniform2f(int location, float v0, float v1, long __functionAddress);

	public static void glUniform2f(int location, float v0, float v1) {
		long __functionAddress = getInstance().Uniform2f;
		nglUniform2f(location, v0, v1, __functionAddress);
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

	public static void glUniform2fv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglUniform2fv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2fv Uniform2fv} */
	public static void glUniform2fv(int location, FloatBuffer value) {
		nglUniform2fv(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform2i ] ---

	/** JNI method for {@link #glUniform2i Uniform2i} */
	@JavadocExclude
	public static native void nglUniform2i(int location, int v0, int v1, long __functionAddress);

	public static void glUniform2i(int location, int v0, int v1) {
		long __functionAddress = getInstance().Uniform2i;
		nglUniform2i(location, v0, v1, __functionAddress);
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

	public static void glUniform2iv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglUniform2iv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2iv Uniform2iv} */
	public static void glUniform2iv(int location, IntBuffer value) {
		nglUniform2iv(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3f ] ---

	/** JNI method for {@link #glUniform3f Uniform3f} */
	@JavadocExclude
	public static native void nglUniform3f(int location, float v0, float v1, float v2, long __functionAddress);

	public static void glUniform3f(int location, float v0, float v1, float v2) {
		long __functionAddress = getInstance().Uniform3f;
		nglUniform3f(location, v0, v1, v2, __functionAddress);
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

	public static void glUniform3fv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglUniform3fv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3fv Uniform3fv} */
	public static void glUniform3fv(int location, FloatBuffer value) {
		nglUniform3fv(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform3i ] ---

	/** JNI method for {@link #glUniform3i Uniform3i} */
	@JavadocExclude
	public static native void nglUniform3i(int location, int v0, int v1, int v2, long __functionAddress);

	public static void glUniform3i(int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().Uniform3i;
		nglUniform3i(location, v0, v1, v2, __functionAddress);
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

	public static void glUniform3iv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglUniform3iv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3iv Uniform3iv} */
	public static void glUniform3iv(int location, IntBuffer value) {
		nglUniform3iv(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4f ] ---

	/** JNI method for {@link #glUniform4f Uniform4f} */
	@JavadocExclude
	public static native void nglUniform4f(int location, float v0, float v1, float v2, float v3, long __functionAddress);

	public static void glUniform4f(int location, float v0, float v1, float v2, float v3) {
		long __functionAddress = getInstance().Uniform4f;
		nglUniform4f(location, v0, v1, v2, v3, __functionAddress);
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

	public static void glUniform4fv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglUniform4fv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4fv Uniform4fv} */
	public static void glUniform4fv(int location, FloatBuffer value) {
		nglUniform4fv(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glUniform4i ] ---

	/** JNI method for {@link #glUniform4i Uniform4i} */
	@JavadocExclude
	public static native void nglUniform4i(int location, int v0, int v1, int v2, int v3, long __functionAddress);

	public static void glUniform4i(int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().Uniform4i;
		nglUniform4i(location, v0, v1, v2, v3, __functionAddress);
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

	public static void glUniformMatrix4fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 4) << 2);
		nglUniformMatrix4fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4fv UniformMatrix4fv} */
	public static void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4fv(location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glUseProgram ] ---

	/** JNI method for {@link #glUseProgram UseProgram} */
	@JavadocExclude
	public static native void nglUseProgram(int program, long __functionAddress);

	public static void glUseProgram(int program) {
		long __functionAddress = getInstance().UseProgram;
		nglUseProgram(program, __functionAddress);
	}

	// --- [ glValidateProgram ] ---

	/** JNI method for {@link #glValidateProgram ValidateProgram} */
	@JavadocExclude
	public static native void nglValidateProgram(int program, long __functionAddress);

	public static void glValidateProgram(int program) {
		long __functionAddress = getInstance().ValidateProgram;
		nglValidateProgram(program, __functionAddress);
	}

	// --- [ glVertexAttrib1f ] ---

	/** JNI method for {@link #glVertexAttrib1f VertexAttrib1f} */
	@JavadocExclude
	public static native void nglVertexAttrib1f(int index, float x, long __functionAddress);

	public static void glVertexAttrib1f(int index, float x) {
		long __functionAddress = getInstance().VertexAttrib1f;
		nglVertexAttrib1f(index, x, __functionAddress);
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

	// --- [ glVertexAttrib2f ] ---

	/** JNI method for {@link #glVertexAttrib2f VertexAttrib2f} */
	@JavadocExclude
	public static native void nglVertexAttrib2f(int index, float x, float y, long __functionAddress);

	public static void glVertexAttrib2f(int index, float x, float y) {
		long __functionAddress = getInstance().VertexAttrib2f;
		nglVertexAttrib2f(index, x, y, __functionAddress);
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

	// --- [ glVertexAttrib3f ] ---

	/** JNI method for {@link #glVertexAttrib3f VertexAttrib3f} */
	@JavadocExclude
	public static native void nglVertexAttrib3f(int index, float x, float y, float z, long __functionAddress);

	public static void glVertexAttrib3f(int index, float x, float y, float z) {
		long __functionAddress = getInstance().VertexAttrib3f;
		nglVertexAttrib3f(index, x, y, z, __functionAddress);
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

	// --- [ glVertexAttrib4f ] ---

	/** JNI method for {@link #glVertexAttrib4f VertexAttrib4f} */
	@JavadocExclude
	public static native void nglVertexAttrib4f(int index, float x, float y, float z, float w, long __functionAddress);

	public static void glVertexAttrib4f(int index, float x, float y, float z, float w) {
		long __functionAddress = getInstance().VertexAttrib4f;
		nglVertexAttrib4f(index, x, y, z, w, __functionAddress);
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

	public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
		nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glVertexAttribPointer VertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointerOffset) {
		nglVertexAttribPointer(index, size, type, normalized, stride, pointerOffset);
	}

	/** GL_FLOAT version of: {@link #glVertexAttribPointer VertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, FloatBuffer pointer) {
		nglVertexAttribPointer(index, size, GLES20.GL_FLOAT, normalized, stride, memAddress(pointer));
	}

	/** ShortBuffer version of: {@link #glVertexAttribPointer VertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer) {
		nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
	}

	/** IntBuffer version of: {@link #glVertexAttribPointer VertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer) {
		nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
	}

	// --- [ glViewport ] ---

	/** JNI method for {@link #glViewport Viewport} */
	@JavadocExclude
	public static native void nglViewport(int x, int y, int width, int height, long __functionAddress);

	public static void glViewport(int x, int y, int width, int height) {
		long __functionAddress = getInstance().Viewport;
		nglViewport(x, y, width, height, __functionAddress);
	}

}