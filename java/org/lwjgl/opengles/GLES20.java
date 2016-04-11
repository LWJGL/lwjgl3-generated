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
import static org.lwjgl.system.Pointer.*;

/** The core OpenGL ES 2.0 functionality. */
public class GLES20 {

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

	protected GLES20() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glActiveTexture, caps.glAttachShader, caps.glBindAttribLocation, caps.glBindBuffer, caps.glBindFramebuffer, caps.glBindRenderbuffer, 
			caps.glBindTexture, caps.glBlendColor, caps.glBlendEquation, caps.glBlendEquationSeparate, caps.glBlendFunc, caps.glBlendFuncSeparate, 
			caps.glBufferData, caps.glBufferSubData, caps.glCheckFramebufferStatus, caps.glClear, caps.glClearColor, caps.glClearDepthf, caps.glClearStencil, 
			caps.glColorMask, caps.glCompileShader, caps.glCompressedTexImage2D, caps.glCompressedTexSubImage2D, caps.glCopyTexImage2D, 
			caps.glCopyTexSubImage2D, caps.glCreateProgram, caps.glCreateShader, caps.glCullFace, caps.glDeleteBuffers, caps.glDeleteFramebuffers, 
			caps.glDeleteProgram, caps.glDeleteRenderbuffers, caps.glDeleteShader, caps.glDeleteTextures, caps.glDepthFunc, caps.glDepthMask, 
			caps.glDepthRangef, caps.glDetachShader, caps.glDisable, caps.glDisableVertexAttribArray, caps.glDrawArrays, caps.glDrawElements, caps.glEnable, 
			caps.glEnableVertexAttribArray, caps.glFinish, caps.glFlush, caps.glFramebufferRenderbuffer, caps.glFramebufferTexture2D, caps.glFrontFace, 
			caps.glGenBuffers, caps.glGenerateMipmap, caps.glGenFramebuffers, caps.glGenRenderbuffers, caps.glGenTextures, caps.glGetActiveAttrib, 
			caps.glGetActiveUniform, caps.glGetAttachedShaders, caps.glGetAttribLocation, caps.glGetBooleanv, caps.glGetBufferParameteriv, caps.glGetError, 
			caps.glGetFloatv, caps.glGetFramebufferAttachmentParameteriv, caps.glGetIntegerv, caps.glGetProgramiv, caps.glGetProgramInfoLog, 
			caps.glGetRenderbufferParameteriv, caps.glGetShaderiv, caps.glGetShaderInfoLog, caps.glGetShaderPrecisionFormat, caps.glGetShaderSource, 
			caps.glGetString, caps.glGetTexParameterfv, caps.glGetTexParameteriv, caps.glGetUniformfv, caps.glGetUniformiv, caps.glGetUniformLocation, 
			caps.glGetVertexAttribfv, caps.glGetVertexAttribiv, caps.glGetVertexAttribPointerv, caps.glHint, caps.glIsBuffer, caps.glIsEnabled, 
			caps.glIsFramebuffer, caps.glIsProgram, caps.glIsRenderbuffer, caps.glIsShader, caps.glIsTexture, caps.glLineWidth, caps.glLinkProgram, 
			caps.glPixelStorei, caps.glPolygonOffset, caps.glReadPixels, caps.glReleaseShaderCompiler, caps.glRenderbufferStorage, caps.glSampleCoverage, 
			caps.glScissor, caps.glShaderBinary, caps.glShaderSource, caps.glStencilFunc, caps.glStencilFuncSeparate, caps.glStencilMask, 
			caps.glStencilMaskSeparate, caps.glStencilOp, caps.glStencilOpSeparate, caps.glTexImage2D, caps.glTexParameterf, caps.glTexParameterfv, 
			caps.glTexParameteri, caps.glTexParameteriv, caps.glTexSubImage2D, caps.glUniform1f, caps.glUniform1fv, caps.glUniform1i, caps.glUniform1iv, 
			caps.glUniform2f, caps.glUniform2fv, caps.glUniform2i, caps.glUniform2iv, caps.glUniform3f, caps.glUniform3fv, caps.glUniform3i, caps.glUniform3iv, 
			caps.glUniform4f, caps.glUniform4fv, caps.glUniform4i, caps.glUniform4iv, caps.glUniformMatrix2fv, caps.glUniformMatrix3fv, caps.glUniformMatrix4fv, 
			caps.glUseProgram, caps.glValidateProgram, caps.glVertexAttrib1f, caps.glVertexAttrib1fv, caps.glVertexAttrib2f, caps.glVertexAttrib2fv, 
			caps.glVertexAttrib3f, caps.glVertexAttrib3fv, caps.glVertexAttrib4f, caps.glVertexAttrib4fv, caps.glVertexAttribPointer, caps.glViewport
		);
	}

	// --- [ glActiveTexture ] ---

	public static void glActiveTexture(int texture) {
		long __functionAddress = GLES.getCapabilities().glActiveTexture;
		callIV(__functionAddress, texture);
	}

	// --- [ glAttachShader ] ---

	public static void glAttachShader(int program, int shader) {
		long __functionAddress = GLES.getCapabilities().glAttachShader;
		callIIV(__functionAddress, program, shader);
	}

	// --- [ glBindAttribLocation ] ---

	public static void nglBindAttribLocation(int program, int index, long name) {
		long __functionAddress = GLES.getCapabilities().glBindAttribLocation;
		callIIPV(__functionAddress, program, index, name);
	}

	public static void glBindAttribLocation(int program, int index, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		nglBindAttribLocation(program, index, memAddress(name));
	}

	public static void glBindAttribLocation(int program, int index, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			nglBindAttribLocation(program, index, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glBindBuffer ] ---

	public static void glBindBuffer(int target, int buffer) {
		long __functionAddress = GLES.getCapabilities().glBindBuffer;
		callIIV(__functionAddress, target, buffer);
	}

	// --- [ glBindFramebuffer ] ---

	public static void glBindFramebuffer(int target, int framebuffer) {
		long __functionAddress = GLES.getCapabilities().glBindFramebuffer;
		callIIV(__functionAddress, target, framebuffer);
	}

	// --- [ glBindRenderbuffer ] ---

	public static void glBindRenderbuffer(int target, int renderbuffer) {
		long __functionAddress = GLES.getCapabilities().glBindRenderbuffer;
		callIIV(__functionAddress, target, renderbuffer);
	}

	// --- [ glBindTexture ] ---

	public static void glBindTexture(int target, int texture) {
		long __functionAddress = GLES.getCapabilities().glBindTexture;
		callIIV(__functionAddress, target, texture);
	}

	// --- [ glBlendColor ] ---

	public static void glBlendColor(float red, float green, float blue, float alpha) {
		long __functionAddress = GLES.getCapabilities().glBlendColor;
		callFFFFV(__functionAddress, red, green, blue, alpha);
	}

	// --- [ glBlendEquation ] ---

	public static void glBlendEquation(int mode) {
		long __functionAddress = GLES.getCapabilities().glBlendEquation;
		callIV(__functionAddress, mode);
	}

	// --- [ glBlendEquationSeparate ] ---

	public static void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
		long __functionAddress = GLES.getCapabilities().glBlendEquationSeparate;
		callIIV(__functionAddress, modeRGB, modeAlpha);
	}

	// --- [ glBlendFunc ] ---

	public static void glBlendFunc(int sfactor, int dfactor) {
		long __functionAddress = GLES.getCapabilities().glBlendFunc;
		callIIV(__functionAddress, sfactor, dfactor);
	}

	// --- [ glBlendFuncSeparate ] ---

	public static void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		long __functionAddress = GLES.getCapabilities().glBlendFuncSeparate;
		callIIIIV(__functionAddress, sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
	}

	// --- [ glBufferData ] ---

	public static void nglBufferData(int target, long size, long data, int usage) {
		long __functionAddress = GLES.getCapabilities().glBufferData;
		callIPPIV(__functionAddress, target, size, data, usage);
	}

	public static void glBufferData(int target, long size, int usage) {
		nglBufferData(target, size, NULL, usage);
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

	public static void nglBufferSubData(int target, long offset, long size, long data) {
		long __functionAddress = GLES.getCapabilities().glBufferSubData;
		callIPPPV(__functionAddress, target, offset, size, data);
	}

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

	public static int glCheckFramebufferStatus(int target) {
		long __functionAddress = GLES.getCapabilities().glCheckFramebufferStatus;
		return callII(__functionAddress, target);
	}

	// --- [ glClear ] ---

	public static void glClear(int mask) {
		long __functionAddress = GLES.getCapabilities().glClear;
		callIV(__functionAddress, mask);
	}

	// --- [ glClearColor ] ---

	public static void glClearColor(float red, float green, float blue, float alpha) {
		long __functionAddress = GLES.getCapabilities().glClearColor;
		callFFFFV(__functionAddress, red, green, blue, alpha);
	}

	// --- [ glClearDepthf ] ---

	public static void glClearDepthf(float d) {
		long __functionAddress = GLES.getCapabilities().glClearDepthf;
		callFV(__functionAddress, d);
	}

	// --- [ glClearStencil ] ---

	public static void glClearStencil(int s) {
		long __functionAddress = GLES.getCapabilities().glClearStencil;
		callIV(__functionAddress, s);
	}

	// --- [ glColorMask ] ---

	public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
		long __functionAddress = GLES.getCapabilities().glColorMask;
		callZZZZV(__functionAddress, red, green, blue, alpha);
	}

	// --- [ glCompileShader ] ---

	public static void glCompileShader(int shader) {
		long __functionAddress = GLES.getCapabilities().glCompileShader;
		callIV(__functionAddress, shader);
	}

	// --- [ glCompressedTexImage2D ] ---

	public static void nglCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
		long __functionAddress = GLES.getCapabilities().glCompressedTexImage2D;
		callIIIIIIIPV(__functionAddress, target, level, internalformat, width, height, border, imageSize, data);
	}

	public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
	}

	public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexImage2D(target, level, internalformat, width, height, border, data == null ? 0 : data.remaining(), memAddressSafe(data));
	}

	// --- [ glCompressedTexSubImage2D ] ---

	public static void nglCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
		long __functionAddress = GLES.getCapabilities().glCompressedTexSubImage2D;
		callIIIIIIIIPV(__functionAddress, target, level, xoffset, yoffset, width, height, format, imageSize, data);
	}

	public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
	}

	public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
	}

	// --- [ glCopyTexImage2D ] ---

	public static void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
		long __functionAddress = GLES.getCapabilities().glCopyTexImage2D;
		callIIIIIIIIV(__functionAddress, target, level, internalformat, x, y, width, height, border);
	}

	// --- [ glCopyTexSubImage2D ] ---

	public static void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
		long __functionAddress = GLES.getCapabilities().glCopyTexSubImage2D;
		callIIIIIIIIV(__functionAddress, target, level, xoffset, yoffset, x, y, width, height);
	}

	// --- [ glCreateProgram ] ---

	public static int glCreateProgram() {
		long __functionAddress = GLES.getCapabilities().glCreateProgram;
		return callI(__functionAddress);
	}

	// --- [ glCreateShader ] ---

	public static int glCreateShader(int type) {
		long __functionAddress = GLES.getCapabilities().glCreateShader;
		return callII(__functionAddress, type);
	}

	// --- [ glCullFace ] ---

	public static void glCullFace(int mode) {
		long __functionAddress = GLES.getCapabilities().glCullFace;
		callIV(__functionAddress, mode);
	}

	// --- [ glDeleteBuffers ] ---

	public static void nglDeleteBuffers(int n, long buffers) {
		long __functionAddress = GLES.getCapabilities().glDeleteBuffers;
		callIPV(__functionAddress, n, buffers);
	}

	public static void glDeleteBuffers(IntBuffer buffers) {
		nglDeleteBuffers(buffers.remaining(), memAddress(buffers));
	}

	public static void glDeleteBuffers(int buffer) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer buffers = stack.ints(buffer);
			nglDeleteBuffers(1, memAddress(buffers));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDeleteFramebuffers ] ---

	public static void nglDeleteFramebuffers(int n, long framebuffers) {
		long __functionAddress = GLES.getCapabilities().glDeleteFramebuffers;
		callIPV(__functionAddress, n, framebuffers);
	}

	public static void glDeleteFramebuffers(IntBuffer framebuffers) {
		nglDeleteFramebuffers(framebuffers.remaining(), memAddress(framebuffers));
	}

	public static void glDeleteFramebuffers(int framebuffer) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer framebuffers = stack.ints(framebuffer);
			nglDeleteFramebuffers(1, memAddress(framebuffers));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDeleteProgram ] ---

	public static void glDeleteProgram(int program) {
		long __functionAddress = GLES.getCapabilities().glDeleteProgram;
		callIV(__functionAddress, program);
	}

	// --- [ glDeleteRenderbuffers ] ---

	public static void nglDeleteRenderbuffers(int n, long renderbuffers) {
		long __functionAddress = GLES.getCapabilities().glDeleteRenderbuffers;
		callIPV(__functionAddress, n, renderbuffers);
	}

	public static void glDeleteRenderbuffers(IntBuffer renderbuffers) {
		nglDeleteRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers));
	}

	public static void glDeleteRenderbuffers(int renderbuffer) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer renderbuffers = stack.ints(renderbuffer);
			nglDeleteRenderbuffers(1, memAddress(renderbuffers));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDeleteShader ] ---

	public static void glDeleteShader(int shader) {
		long __functionAddress = GLES.getCapabilities().glDeleteShader;
		callIV(__functionAddress, shader);
	}

	// --- [ glDeleteTextures ] ---

	public static void nglDeleteTextures(int n, long textures) {
		long __functionAddress = GLES.getCapabilities().glDeleteTextures;
		callIPV(__functionAddress, n, textures);
	}

	public static void glDeleteTextures(IntBuffer textures) {
		nglDeleteTextures(textures.remaining(), memAddress(textures));
	}

	public static void glDeleteTextures(int texture) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer textures = stack.ints(texture);
			nglDeleteTextures(1, memAddress(textures));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDepthFunc ] ---

	public static void glDepthFunc(int func) {
		long __functionAddress = GLES.getCapabilities().glDepthFunc;
		callIV(__functionAddress, func);
	}

	// --- [ glDepthMask ] ---

	public static void glDepthMask(boolean flag) {
		long __functionAddress = GLES.getCapabilities().glDepthMask;
		callZV(__functionAddress, flag);
	}

	// --- [ glDepthRangef ] ---

	public static void glDepthRangef(float n, float f) {
		long __functionAddress = GLES.getCapabilities().glDepthRangef;
		callFFV(__functionAddress, n, f);
	}

	// --- [ glDetachShader ] ---

	public static void glDetachShader(int program, int shader) {
		long __functionAddress = GLES.getCapabilities().glDetachShader;
		callIIV(__functionAddress, program, shader);
	}

	// --- [ glDisable ] ---

	public static void glDisable(int cap) {
		long __functionAddress = GLES.getCapabilities().glDisable;
		callIV(__functionAddress, cap);
	}

	// --- [ glDisableVertexAttribArray ] ---

	public static void glDisableVertexAttribArray(int index) {
		long __functionAddress = GLES.getCapabilities().glDisableVertexAttribArray;
		callIV(__functionAddress, index);
	}

	// --- [ glDrawArrays ] ---

	public static void glDrawArrays(int mode, int first, int count) {
		long __functionAddress = GLES.getCapabilities().glDrawArrays;
		callIIIV(__functionAddress, mode, first, count);
	}

	// --- [ glDrawElements ] ---

	public static void nglDrawElements(int mode, int count, int type, long indices) {
		long __functionAddress = GLES.getCapabilities().glDrawElements;
		callIIIPV(__functionAddress, mode, count, type, indices);
	}

	public static void glDrawElements(int mode, int count, int type, long indices) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElements(mode, count, type, indices);
	}

	public static void glDrawElements(int mode, int type, ByteBuffer indices) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElements(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices));
	}

	public static void glDrawElements(int mode, ByteBuffer indices) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElements(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices));
	}

	public static void glDrawElements(int mode, ShortBuffer indices) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElements(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices));
	}

	public static void glDrawElements(int mode, IntBuffer indices) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElements(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices));
	}

	// --- [ glEnable ] ---

	public static void glEnable(int cap) {
		long __functionAddress = GLES.getCapabilities().glEnable;
		callIV(__functionAddress, cap);
	}

	// --- [ glEnableVertexAttribArray ] ---

	public static void glEnableVertexAttribArray(int index) {
		long __functionAddress = GLES.getCapabilities().glEnableVertexAttribArray;
		callIV(__functionAddress, index);
	}

	// --- [ glFinish ] ---

	public static void glFinish() {
		long __functionAddress = GLES.getCapabilities().glFinish;
		callV(__functionAddress);
	}

	// --- [ glFlush ] ---

	public static void glFlush() {
		long __functionAddress = GLES.getCapabilities().glFlush;
		callV(__functionAddress);
	}

	// --- [ glFramebufferRenderbuffer ] ---

	public static void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
		long __functionAddress = GLES.getCapabilities().glFramebufferRenderbuffer;
		callIIIIV(__functionAddress, target, attachment, renderbuffertarget, renderbuffer);
	}

	// --- [ glFramebufferTexture2D ] ---

	public static void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
		long __functionAddress = GLES.getCapabilities().glFramebufferTexture2D;
		callIIIIIV(__functionAddress, target, attachment, textarget, texture, level);
	}

	// --- [ glFrontFace ] ---

	public static void glFrontFace(int mode) {
		long __functionAddress = GLES.getCapabilities().glFrontFace;
		callIV(__functionAddress, mode);
	}

	// --- [ glGenBuffers ] ---

	public static void nglGenBuffers(int n, long buffers) {
		long __functionAddress = GLES.getCapabilities().glGenBuffers;
		callIPV(__functionAddress, n, buffers);
	}

	public static void glGenBuffers(IntBuffer buffers) {
		nglGenBuffers(buffers.remaining(), memAddress(buffers));
	}

	public static int glGenBuffers() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer buffers = stack.callocInt(1);
			nglGenBuffers(1, memAddress(buffers));
			return buffers.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenerateMipmap ] ---

	public static void glGenerateMipmap(int target) {
		long __functionAddress = GLES.getCapabilities().glGenerateMipmap;
		callIV(__functionAddress, target);
	}

	// --- [ glGenFramebuffers ] ---

	public static void nglGenFramebuffers(int n, long framebuffers) {
		long __functionAddress = GLES.getCapabilities().glGenFramebuffers;
		callIPV(__functionAddress, n, framebuffers);
	}

	public static void glGenFramebuffers(IntBuffer framebuffers) {
		nglGenFramebuffers(framebuffers.remaining(), memAddress(framebuffers));
	}

	public static int glGenFramebuffers() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer framebuffers = stack.callocInt(1);
			nglGenFramebuffers(1, memAddress(framebuffers));
			return framebuffers.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenRenderbuffers ] ---

	public static void nglGenRenderbuffers(int n, long renderbuffers) {
		long __functionAddress = GLES.getCapabilities().glGenRenderbuffers;
		callIPV(__functionAddress, n, renderbuffers);
	}

	public static void glGenRenderbuffers(IntBuffer renderbuffers) {
		nglGenRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers));
	}

	public static int glGenRenderbuffers() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer renderbuffers = stack.callocInt(1);
			nglGenRenderbuffers(1, memAddress(renderbuffers));
			return renderbuffers.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenTextures ] ---

	public static void nglGenTextures(int n, long textures) {
		long __functionAddress = GLES.getCapabilities().glGenTextures;
		callIPV(__functionAddress, n, textures);
	}

	public static void glGenTextures(IntBuffer textures) {
		nglGenTextures(textures.remaining(), memAddress(textures));
	}

	public static int glGenTextures() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer textures = stack.callocInt(1);
			nglGenTextures(1, memAddress(textures));
			return textures.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetActiveAttrib ] ---

	public static void nglGetActiveAttrib(int program, int index, int bufSize, long length, long size, long type, long name) {
		long __functionAddress = GLES.getCapabilities().glGetActiveAttrib;
		callIIIPPPPV(__functionAddress, program, index, bufSize, length, size, type, name);
	}

	public static void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		if ( CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetActiveAttrib(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	public static String glGetActiveAttrib(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
		if ( CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufSize);
			nglGetActiveAttrib(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	public static String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type) {
		int bufSize = glGetProgrami(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH);
		if ( CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufSize);
			nglGetActiveAttrib(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetActiveUniform ] ---

	public static void nglGetActiveUniform(int program, int index, int bufSize, long length, long size, long type, long name) {
		long __functionAddress = GLES.getCapabilities().glGetActiveUniform;
		callIIIPPPPV(__functionAddress, program, index, bufSize, length, size, type, name);
	}

	public static void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		if ( CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetActiveUniform(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	public static String glGetActiveUniform(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
		if ( CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufSize);
			nglGetActiveUniform(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	public static String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type) {
		int bufSize = glGetProgrami(program, GL_ACTIVE_UNIFORM_MAX_LENGTH);
		if ( CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufSize);
			nglGetActiveUniform(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetAttachedShaders ] ---

	public static void nglGetAttachedShaders(int program, int maxCount, long count, long shaders) {
		long __functionAddress = GLES.getCapabilities().glGetAttachedShaders;
		callIIPPV(__functionAddress, program, maxCount, count, shaders);
	}

	public static void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders) {
		if ( CHECKS )
			if ( count != null ) checkBuffer(count, 1);
		nglGetAttachedShaders(program, shaders.remaining(), memAddressSafe(count), memAddress(shaders));
	}

	// --- [ glGetAttribLocation ] ---

	public static int nglGetAttribLocation(int program, long name) {
		long __functionAddress = GLES.getCapabilities().glGetAttribLocation;
		return callIPI(__functionAddress, program, name);
	}

	public static int glGetAttribLocation(int program, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetAttribLocation(program, memAddress(name));
	}

	public static int glGetAttribLocation(int program, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetAttribLocation(program, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetBooleanv ] ---

	public static void nglGetBooleanv(int pname, long data) {
		long __functionAddress = GLES.getCapabilities().glGetBooleanv;
		callIPV(__functionAddress, pname, data);
	}

	public static void glGetBooleanv(int pname, ByteBuffer data) {
		if ( CHECKS )
			checkBuffer(data, 1);
		nglGetBooleanv(pname, memAddress(data));
	}

	public static byte glGetBoolean(int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer data = stack.calloc(1);
			nglGetBooleanv(pname, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetBufferParameteriv ] ---

	public static void nglGetBufferParameteriv(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetBufferParameteriv;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetBufferParameteriv(target, pname, memAddress(params));
	}

	public static int glGetBufferParameteri(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetBufferParameteriv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetError ] ---

	public static int glGetError() {
		long __functionAddress = GLES.getCapabilities().glGetError;
		return callI(__functionAddress);
	}

	// --- [ glGetFloatv ] ---

	public static void nglGetFloatv(int pname, long data) {
		long __functionAddress = GLES.getCapabilities().glGetFloatv;
		callIPV(__functionAddress, pname, data);
	}

	public static void glGetFloatv(int pname, FloatBuffer data) {
		if ( CHECKS )
			checkBuffer(data, 1);
		nglGetFloatv(pname, memAddress(data));
	}

	public static float glGetFloat(int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer data = stack.callocFloat(1);
			nglGetFloatv(pname, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetFramebufferAttachmentParameteriv ] ---

	public static void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetFramebufferAttachmentParameteriv;
		callIIIPV(__functionAddress, target, attachment, pname, params);
	}

	public static void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetFramebufferAttachmentParameteriv(target, attachment, pname, memAddress(params));
	}

	public static int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetFramebufferAttachmentParameteriv(target, attachment, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetIntegerv ] ---

	public static void nglGetIntegerv(int pname, long data) {
		long __functionAddress = GLES.getCapabilities().glGetIntegerv;
		callIPV(__functionAddress, pname, data);
	}

	public static void glGetIntegerv(int pname, IntBuffer data) {
		if ( CHECKS )
			checkBuffer(data, 1);
		nglGetIntegerv(pname, memAddress(data));
	}

	public static int glGetInteger(int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer data = stack.callocInt(1);
			nglGetIntegerv(pname, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetProgramiv ] ---

	public static void nglGetProgramiv(int program, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetProgramiv;
		callIIPV(__functionAddress, program, pname, params);
	}

	public static void glGetProgramiv(int program, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetProgramiv(program, pname, memAddress(params));
	}

	public static int glGetProgrami(int program, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetProgramiv(program, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetProgramInfoLog ] ---

	public static void nglGetProgramInfoLog(int program, int bufSize, long length, long infoLog) {
		long __functionAddress = GLES.getCapabilities().glGetProgramInfoLog;
		callIIPPV(__functionAddress, program, bufSize, length, infoLog);
	}

	public static void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramInfoLog(program, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
	}

	public static String glGetProgramInfoLog(int program, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		ByteBuffer infoLog = memAlloc(bufSize);
		try {
			IntBuffer length = stack.ints(0);
			nglGetProgramInfoLog(program, bufSize, memAddress(length), memAddress(infoLog));
			return memUTF8(infoLog, length.get(0));
		} finally {
			memFree(infoLog);
			stack.setPointer(stackPointer);
		}
	}

	public static String glGetProgramInfoLog(int program) {
		int bufSize = glGetProgrami(program, GL_INFO_LOG_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		ByteBuffer infoLog = memAlloc(bufSize);
		try {
			IntBuffer length = stack.ints(0);
			nglGetProgramInfoLog(program, bufSize, memAddress(length), memAddress(infoLog));
			return memUTF8(infoLog, length.get(0));
		} finally {
			memFree(infoLog);
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetRenderbufferParameteriv ] ---

	public static void nglGetRenderbufferParameteriv(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetRenderbufferParameteriv;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetRenderbufferParameteriv(target, pname, memAddress(params));
	}

	public static int glGetRenderbufferParameteri(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetRenderbufferParameteriv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetShaderiv ] ---

	public static void nglGetShaderiv(int shader, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetShaderiv;
		callIIPV(__functionAddress, shader, pname, params);
	}

	public static void glGetShaderiv(int shader, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetShaderiv(shader, pname, memAddress(params));
	}

	public static int glGetShaderi(int shader, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetShaderiv(shader, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetShaderInfoLog ] ---

	public static void nglGetShaderInfoLog(int shader, int bufSize, long length, long infoLog) {
		long __functionAddress = GLES.getCapabilities().glGetShaderInfoLog;
		callIIPPV(__functionAddress, shader, bufSize, length, infoLog);
	}

	public static void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetShaderInfoLog(shader, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
	}

	public static String glGetShaderInfoLog(int shader, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		ByteBuffer infoLog = memAlloc(bufSize);
		try {
			IntBuffer length = stack.ints(0);
			nglGetShaderInfoLog(shader, bufSize, memAddress(length), memAddress(infoLog));
			return memUTF8(infoLog, length.get(0));
		} finally {
			memFree(infoLog);
			stack.setPointer(stackPointer);
		}
	}

	public static String glGetShaderInfoLog(int shader) {
		int bufSize = glGetShaderi(shader, GL_INFO_LOG_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		ByteBuffer infoLog = memAlloc(bufSize);
		try {
			IntBuffer length = stack.ints(0);
			nglGetShaderInfoLog(shader, bufSize, memAddress(length), memAddress(infoLog));
			return memUTF8(infoLog, length.get(0));
		} finally {
			memFree(infoLog);
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetShaderPrecisionFormat ] ---

	public static void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision) {
		long __functionAddress = GLES.getCapabilities().glGetShaderPrecisionFormat;
		callIIPPV(__functionAddress, shadertype, precisiontype, range, precision);
	}

	public static void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision) {
		if ( CHECKS ) {
			checkBuffer(range, 2);
			checkBuffer(precision, 2);
		}
		nglGetShaderPrecisionFormat(shadertype, precisiontype, memAddress(range), memAddress(precision));
	}

	// --- [ glGetShaderSource ] ---

	public static void nglGetShaderSource(int shader, int bufSize, long length, long source) {
		long __functionAddress = GLES.getCapabilities().glGetShaderSource;
		callIIPPV(__functionAddress, shader, bufSize, length, source);
	}

	public static void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetShaderSource(shader, source.remaining(), memAddressSafe(length), memAddress(source));
	}

	public static String glGetShaderSource(int shader, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		ByteBuffer source = memAlloc(bufSize);
		try {
			IntBuffer length = stack.ints(0);
			nglGetShaderSource(shader, bufSize, memAddress(length), memAddress(source));
			return memUTF8(source, length.get(0));
		} finally {
			memFree(source);
			stack.setPointer(stackPointer);
		}
	}

	public static String glGetShaderSource(int shader) {
		int bufSize = glGetShaderi(shader, GL_SHADER_SOURCE_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		ByteBuffer source = memAlloc(bufSize);
		try {
			IntBuffer length = stack.ints(0);
			nglGetShaderSource(shader, bufSize, memAddress(length), memAddress(source));
			return memUTF8(source, length.get(0));
		} finally {
			memFree(source);
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetString ] ---

	public static long nglGetString(int name) {
		long __functionAddress = GLES.getCapabilities().glGetString;
		return callIP(__functionAddress, name);
	}

	public static String glGetString(int name) {
		long __result = nglGetString(name);
		return memUTF8(__result);
	}

	// --- [ glGetTexParameterfv ] ---

	public static void nglGetTexParameterfv(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetTexParameterfv;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterfv(target, pname, memAddress(params));
	}

	public static float glGetTexParameterf(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetTexParameterfv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexParameteriv ] ---

	public static void nglGetTexParameteriv(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetTexParameteriv;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetTexParameteriv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameteriv(target, pname, memAddress(params));
	}

	public static int glGetTexParameteri(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetTexParameteriv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetUniformfv ] ---

	public static void nglGetUniformfv(int program, int location, long params) {
		long __functionAddress = GLES.getCapabilities().glGetUniformfv;
		callIIPV(__functionAddress, program, location, params);
	}

	public static void glGetUniformfv(int program, int location, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetUniformfv(program, location, memAddress(params));
	}

	public static float glGetUniformf(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetUniformfv(program, location, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetUniformiv ] ---

	public static void nglGetUniformiv(int program, int location, long params) {
		long __functionAddress = GLES.getCapabilities().glGetUniformiv;
		callIIPV(__functionAddress, program, location, params);
	}

	public static void glGetUniformiv(int program, int location, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetUniformiv(program, location, memAddress(params));
	}

	public static int glGetUniformi(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetUniformiv(program, location, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetUniformLocation ] ---

	public static int nglGetUniformLocation(int program, long name) {
		long __functionAddress = GLES.getCapabilities().glGetUniformLocation;
		return callIPI(__functionAddress, program, name);
	}

	public static int glGetUniformLocation(int program, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetUniformLocation(program, memAddress(name));
	}

	public static int glGetUniformLocation(int program, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetUniformLocation(program, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetVertexAttribfv ] ---

	public static void nglGetVertexAttribfv(int index, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetVertexAttribfv;
		callIIPV(__functionAddress, index, pname, params);
	}

	public static void glGetVertexAttribfv(int index, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribfv(index, pname, memAddress(params));
	}

	// --- [ glGetVertexAttribiv ] ---

	public static void nglGetVertexAttribiv(int index, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetVertexAttribiv;
		callIIPV(__functionAddress, index, pname, params);
	}

	public static void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribiv(index, pname, memAddress(params));
	}

	// --- [ glGetVertexAttribPointerv ] ---

	public static void nglGetVertexAttribPointerv(int index, int pname, long pointer) {
		long __functionAddress = GLES.getCapabilities().glGetVertexAttribPointerv;
		callIIPV(__functionAddress, index, pname, pointer);
	}

	public static void glGetVertexAttribPointerv(int index, int pname, PointerBuffer pointer) {
		if ( CHECKS )
			checkBuffer(pointer, 1);
		nglGetVertexAttribPointerv(index, pname, memAddress(pointer));
	}

	public static long glGetVertexAttribPointer(int index, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			PointerBuffer pointer = stack.callocPointer(1);
			nglGetVertexAttribPointerv(index, pname, memAddress(pointer));
			return pointer.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glHint ] ---

	public static void glHint(int target, int mode) {
		long __functionAddress = GLES.getCapabilities().glHint;
		callIIV(__functionAddress, target, mode);
	}

	// --- [ glIsBuffer ] ---

	public static boolean glIsBuffer(int buffer) {
		long __functionAddress = GLES.getCapabilities().glIsBuffer;
		return callIZ(__functionAddress, buffer);
	}

	// --- [ glIsEnabled ] ---

	public static boolean glIsEnabled(int cap) {
		long __functionAddress = GLES.getCapabilities().glIsEnabled;
		return callIZ(__functionAddress, cap);
	}

	// --- [ glIsFramebuffer ] ---

	public static boolean glIsFramebuffer(int framebuffer) {
		long __functionAddress = GLES.getCapabilities().glIsFramebuffer;
		return callIZ(__functionAddress, framebuffer);
	}

	// --- [ glIsProgram ] ---

	public static boolean glIsProgram(int program) {
		long __functionAddress = GLES.getCapabilities().glIsProgram;
		return callIZ(__functionAddress, program);
	}

	// --- [ glIsRenderbuffer ] ---

	public static boolean glIsRenderbuffer(int renderbuffer) {
		long __functionAddress = GLES.getCapabilities().glIsRenderbuffer;
		return callIZ(__functionAddress, renderbuffer);
	}

	// --- [ glIsShader ] ---

	public static boolean glIsShader(int shader) {
		long __functionAddress = GLES.getCapabilities().glIsShader;
		return callIZ(__functionAddress, shader);
	}

	// --- [ glIsTexture ] ---

	public static boolean glIsTexture(int texture) {
		long __functionAddress = GLES.getCapabilities().glIsTexture;
		return callIZ(__functionAddress, texture);
	}

	// --- [ glLineWidth ] ---

	public static void glLineWidth(float width) {
		long __functionAddress = GLES.getCapabilities().glLineWidth;
		callFV(__functionAddress, width);
	}

	// --- [ glLinkProgram ] ---

	public static void glLinkProgram(int program) {
		long __functionAddress = GLES.getCapabilities().glLinkProgram;
		callIV(__functionAddress, program);
	}

	// --- [ glPixelStorei ] ---

	public static void glPixelStorei(int pname, int param) {
		long __functionAddress = GLES.getCapabilities().glPixelStorei;
		callIIV(__functionAddress, pname, param);
	}

	// --- [ glPolygonOffset ] ---

	public static void glPolygonOffset(float factor, float units) {
		long __functionAddress = GLES.getCapabilities().glPolygonOffset;
		callFFV(__functionAddress, factor, units);
	}

	// --- [ glReadPixels ] ---

	public static void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
		long __functionAddress = GLES.getCapabilities().glReadPixels;
		callIIIIIIPV(__functionAddress, x, y, width, height, format, type, pixels);
	}

	public static void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	public static void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglReadPixels(x, y, width, height, format, type, pixels);
	}

	/** ShortBuffer version of: {@link #glReadPixels ReadPixels} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glReadPixels ReadPixels} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glReadPixels ReadPixels} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	// --- [ glReleaseShaderCompiler ] ---

	public static void glReleaseShaderCompiler() {
		long __functionAddress = GLES.getCapabilities().glReleaseShaderCompiler;
		callV(__functionAddress);
	}

	// --- [ glRenderbufferStorage ] ---

	public static void glRenderbufferStorage(int target, int internalformat, int width, int height) {
		long __functionAddress = GLES.getCapabilities().glRenderbufferStorage;
		callIIIIV(__functionAddress, target, internalformat, width, height);
	}

	// --- [ glSampleCoverage ] ---

	public static void glSampleCoverage(float value, boolean invert) {
		long __functionAddress = GLES.getCapabilities().glSampleCoverage;
		callFZV(__functionAddress, value, invert);
	}

	// --- [ glScissor ] ---

	public static void glScissor(int x, int y, int width, int height) {
		long __functionAddress = GLES.getCapabilities().glScissor;
		callIIIIV(__functionAddress, x, y, width, height);
	}

	// --- [ glShaderBinary ] ---

	public static void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length) {
		long __functionAddress = GLES.getCapabilities().glShaderBinary;
		callIPIPIV(__functionAddress, count, shaders, binaryformat, binary, length);
	}

	public static void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary) {
		nglShaderBinary(shaders.remaining(), memAddress(shaders), binaryformat, memAddress(binary), binary.remaining());
	}

	// --- [ glShaderSource ] ---

	public static void nglShaderSource(int shader, int count, long string, long length) {
		long __functionAddress = GLES.getCapabilities().glShaderSource;
		callIIPPV(__functionAddress, shader, count, string, length);
	}

	public static void glShaderSource(int shader, PointerBuffer string, IntBuffer length) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, string.remaining());
		nglShaderSource(shader, string.remaining(), memAddress(string), memAddressSafe(length));
	}

	public static void glShaderSource(int shader, CharSequence... string) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long stringAddress = org.lwjgl.system.APIUtil.apiArrayUTF8i(stack, string);
			nglShaderSource(shader, string.length, stringAddress, stringAddress - (string.length << 2));
			org.lwjgl.system.APIUtil.apiArrayFree(stringAddress, string.length);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	public static void glShaderSource(int shader, CharSequence string) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long stringAddress = org.lwjgl.system.APIUtil.apiArrayUTF8i(stack, string);
			nglShaderSource(shader, 1, stringAddress, stringAddress - 4);
			org.lwjgl.system.APIUtil.apiArrayFree(stringAddress, 1);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glStencilFunc ] ---

	public static void glStencilFunc(int func, int ref, int mask) {
		long __functionAddress = GLES.getCapabilities().glStencilFunc;
		callIIIV(__functionAddress, func, ref, mask);
	}

	// --- [ glStencilFuncSeparate ] ---

	public static void glStencilFuncSeparate(int face, int func, int ref, int mask) {
		long __functionAddress = GLES.getCapabilities().glStencilFuncSeparate;
		callIIIIV(__functionAddress, face, func, ref, mask);
	}

	// --- [ glStencilMask ] ---

	public static void glStencilMask(int mask) {
		long __functionAddress = GLES.getCapabilities().glStencilMask;
		callIV(__functionAddress, mask);
	}

	// --- [ glStencilMaskSeparate ] ---

	public static void glStencilMaskSeparate(int face, int mask) {
		long __functionAddress = GLES.getCapabilities().glStencilMaskSeparate;
		callIIV(__functionAddress, face, mask);
	}

	// --- [ glStencilOp ] ---

	public static void glStencilOp(int fail, int zfail, int zpass) {
		long __functionAddress = GLES.getCapabilities().glStencilOp;
		callIIIV(__functionAddress, fail, zfail, zpass);
	}

	// --- [ glStencilOpSeparate ] ---

	public static void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
		long __functionAddress = GLES.getCapabilities().glStencilOpSeparate;
		callIIIIV(__functionAddress, face, sfail, dpfail, dppass);
	}

	// --- [ glTexImage2D ] ---

	public static void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
		long __functionAddress = GLES.getCapabilities().glTexImage2D;
		callIIIIIIIIPV(__functionAddress, target, level, internalformat, width, height, border, format, type, pixels);
	}

	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
	}

	/** ShortBuffer version of: {@link #glTexImage2D TexImage2D} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glTexImage2D TexImage2D} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glTexImage2D TexImage2D} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glTexParameterf ] ---

	public static void glTexParameterf(int target, int pname, float param) {
		long __functionAddress = GLES.getCapabilities().glTexParameterf;
		callIIFV(__functionAddress, target, pname, param);
	}

	// --- [ glTexParameterfv ] ---

	public static void nglTexParameterfv(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glTexParameterfv;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glTexParameterfv(int target, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglTexParameterfv(target, pname, memAddress(params));
	}

	// --- [ glTexParameteri ] ---

	public static void glTexParameteri(int target, int pname, int param) {
		long __functionAddress = GLES.getCapabilities().glTexParameteri;
		callIIIV(__functionAddress, target, pname, param);
	}

	// --- [ glTexParameteriv ] ---

	public static void nglTexParameteriv(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glTexParameteriv;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glTexParameteriv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglTexParameteriv(target, pname, memAddress(params));
	}

	// --- [ glTexSubImage2D ] ---

	public static void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
		long __functionAddress = GLES.getCapabilities().glTexSubImage2D;
		callIIIIIIIIPV(__functionAddress, target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/** ShortBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	// --- [ glUniform1f ] ---

	public static void glUniform1f(int location, float v0) {
		long __functionAddress = GLES.getCapabilities().glUniform1f;
		callIFV(__functionAddress, location, v0);
	}

	// --- [ glUniform1fv ] ---

	public static void nglUniform1fv(int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glUniform1fv;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform1fv(int location, FloatBuffer value) {
		nglUniform1fv(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform1i ] ---

	public static void glUniform1i(int location, int v0) {
		long __functionAddress = GLES.getCapabilities().glUniform1i;
		callIIV(__functionAddress, location, v0);
	}

	// --- [ glUniform1iv ] ---

	public static void nglUniform1iv(int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glUniform1iv;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform1iv(int location, IntBuffer value) {
		nglUniform1iv(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2f ] ---

	public static void glUniform2f(int location, float v0, float v1) {
		long __functionAddress = GLES.getCapabilities().glUniform2f;
		callIFFV(__functionAddress, location, v0, v1);
	}

	// --- [ glUniform2fv ] ---

	public static void nglUniform2fv(int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glUniform2fv;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform2fv(int location, FloatBuffer value) {
		nglUniform2fv(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform2i ] ---

	public static void glUniform2i(int location, int v0, int v1) {
		long __functionAddress = GLES.getCapabilities().glUniform2i;
		callIIIV(__functionAddress, location, v0, v1);
	}

	// --- [ glUniform2iv ] ---

	public static void nglUniform2iv(int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glUniform2iv;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform2iv(int location, IntBuffer value) {
		nglUniform2iv(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3f ] ---

	public static void glUniform3f(int location, float v0, float v1, float v2) {
		long __functionAddress = GLES.getCapabilities().glUniform3f;
		callIFFFV(__functionAddress, location, v0, v1, v2);
	}

	// --- [ glUniform3fv ] ---

	public static void nglUniform3fv(int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glUniform3fv;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform3fv(int location, FloatBuffer value) {
		nglUniform3fv(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform3i ] ---

	public static void glUniform3i(int location, int v0, int v1, int v2) {
		long __functionAddress = GLES.getCapabilities().glUniform3i;
		callIIIIV(__functionAddress, location, v0, v1, v2);
	}

	// --- [ glUniform3iv ] ---

	public static void nglUniform3iv(int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glUniform3iv;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform3iv(int location, IntBuffer value) {
		nglUniform3iv(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4f ] ---

	public static void glUniform4f(int location, float v0, float v1, float v2, float v3) {
		long __functionAddress = GLES.getCapabilities().glUniform4f;
		callIFFFFV(__functionAddress, location, v0, v1, v2, v3);
	}

	// --- [ glUniform4fv ] ---

	public static void nglUniform4fv(int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glUniform4fv;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform4fv(int location, FloatBuffer value) {
		nglUniform4fv(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glUniform4i ] ---

	public static void glUniform4i(int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = GLES.getCapabilities().glUniform4i;
		callIIIIIV(__functionAddress, location, v0, v1, v2, v3);
	}

	// --- [ glUniform4iv ] ---

	public static void nglUniform4iv(int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glUniform4iv;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform4iv(int location, IntBuffer value) {
		nglUniform4iv(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glUniformMatrix2fv ] ---

	public static void nglUniformMatrix2fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix2fv;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix2fv(location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3fv ] ---

	public static void nglUniformMatrix3fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix3fv;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix3fv(location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4fv ] ---

	public static void nglUniformMatrix4fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glUniformMatrix4fv;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4fv(location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glUseProgram ] ---

	public static void glUseProgram(int program) {
		long __functionAddress = GLES.getCapabilities().glUseProgram;
		callIV(__functionAddress, program);
	}

	// --- [ glValidateProgram ] ---

	public static void glValidateProgram(int program) {
		long __functionAddress = GLES.getCapabilities().glValidateProgram;
		callIV(__functionAddress, program);
	}

	// --- [ glVertexAttrib1f ] ---

	public static void glVertexAttrib1f(int index, float x) {
		long __functionAddress = GLES.getCapabilities().glVertexAttrib1f;
		callIFV(__functionAddress, index, x);
	}

	// --- [ glVertexAttrib1fv ] ---

	public static void nglVertexAttrib1fv(int index, long v) {
		long __functionAddress = GLES.getCapabilities().glVertexAttrib1fv;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttrib1fv(int index, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1fv(index, memAddress(v));
	}

	// --- [ glVertexAttrib2f ] ---

	public static void glVertexAttrib2f(int index, float x, float y) {
		long __functionAddress = GLES.getCapabilities().glVertexAttrib2f;
		callIFFV(__functionAddress, index, x, y);
	}

	// --- [ glVertexAttrib2fv ] ---

	public static void nglVertexAttrib2fv(int index, long v) {
		long __functionAddress = GLES.getCapabilities().glVertexAttrib2fv;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttrib2fv(int index, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2fv(index, memAddress(v));
	}

	// --- [ glVertexAttrib3f ] ---

	public static void glVertexAttrib3f(int index, float x, float y, float z) {
		long __functionAddress = GLES.getCapabilities().glVertexAttrib3f;
		callIFFFV(__functionAddress, index, x, y, z);
	}

	// --- [ glVertexAttrib3fv ] ---

	public static void nglVertexAttrib3fv(int index, long v) {
		long __functionAddress = GLES.getCapabilities().glVertexAttrib3fv;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttrib3fv(int index, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3fv(index, memAddress(v));
	}

	// --- [ glVertexAttrib4f ] ---

	public static void glVertexAttrib4f(int index, float x, float y, float z, float w) {
		long __functionAddress = GLES.getCapabilities().glVertexAttrib4f;
		callIFFFFV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttrib4fv ] ---

	public static void nglVertexAttrib4fv(int index, long v) {
		long __functionAddress = GLES.getCapabilities().glVertexAttrib4fv;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttrib4fv(int index, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4fv(index, memAddress(v));
	}

	// --- [ glVertexAttribPointer ] ---

	public static void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribPointer;
		callIIIZIPV(__functionAddress, index, size, type, normalized, stride, pointer);
	}

	public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
	}

	public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ARRAY_BUFFER_BINDING, true);
		nglVertexAttribPointer(index, size, type, normalized, stride, pointer);
	}

	/** ShortBuffer version of: {@link #glVertexAttribPointer VertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
	}

	/** IntBuffer version of: {@link #glVertexAttribPointer VertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
	}

	/** FloatBuffer version of: {@link #glVertexAttribPointer VertexAttribPointer} */
	public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
	}

	// --- [ glViewport ] ---

	public static void glViewport(int x, int y, int width, int height) {
		long __functionAddress = GLES.getCapabilities().glViewport;
		callIIIIV(__functionAddress, x, y, width, height);
	}

}