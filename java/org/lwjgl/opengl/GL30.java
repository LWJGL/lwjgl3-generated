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

/** The core OpenGL 3.0 functionality. */
public final class GL30 {

	/** GetTarget */
	public static final int
		GL_MAJOR_VERSION                       = 0x821B,
		GL_MINOR_VERSION                       = 0x821C,
		GL_NUM_EXTENSIONS                      = 0x821D,
		GL_CONTEXT_FLAGS                       = 0x821E,
		GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x1;

	/** Renamed tokens. */
	public static final int
		GL_COMPARE_REF_TO_TEXTURE = GL14.GL_COMPARE_R_TO_TEXTURE,
		GL_CLIP_DISTANCE0         = GL11.GL_CLIP_PLANE0,
		GL_CLIP_DISTANCE1         = GL11.GL_CLIP_PLANE1,
		GL_CLIP_DISTANCE2         = GL11.GL_CLIP_PLANE2,
		GL_CLIP_DISTANCE3         = GL11.GL_CLIP_PLANE3,
		GL_CLIP_DISTANCE4         = GL11.GL_CLIP_PLANE4,
		GL_CLIP_DISTANCE5         = GL11.GL_CLIP_PLANE5,
		GL_CLIP_DISTANCE6         = 0x3006,
		GL_CLIP_DISTANCE7         = 0x3007,
		GL_MAX_CLIP_DISTANCES     = GL11.GL_MAX_CLIP_PLANES,
		GL_MAX_VARYING_COMPONENTS = GL20.GL_MAX_VARYING_FLOATS;

	/** Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, GetVertexAttribiv, GetVertexAttribIuiv and GetVertexAttribIiv. */
	public static final int
		GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int
		GL_SAMPLER_1D_ARRAY              = 0x8DC0,
		GL_SAMPLER_2D_ARRAY              = 0x8DC1,
		GL_SAMPLER_BUFFER                = 0x8DC2,
		GL_SAMPLER_1D_ARRAY_SHADOW       = 0x8DC3,
		GL_SAMPLER_2D_ARRAY_SHADOW       = 0x8DC4,
		GL_SAMPLER_CUBE_SHADOW           = 0x8DC5,
		GL_UNSIGNED_INT_VEC2             = 0x8DC6,
		GL_UNSIGNED_INT_VEC3             = 0x8DC7,
		GL_UNSIGNED_INT_VEC4             = 0x8DC8,
		GL_INT_SAMPLER_1D                = 0x8DC9,
		GL_INT_SAMPLER_2D                = 0x8DCA,
		GL_INT_SAMPLER_3D                = 0x8DCB,
		GL_INT_SAMPLER_CUBE              = 0x8DCC,
		GL_INT_SAMPLER_2D_RECT           = 0x8DCD,
		GL_INT_SAMPLER_1D_ARRAY          = 0x8DCE,
		GL_INT_SAMPLER_2D_ARRAY          = 0x8DCF,
		GL_INT_SAMPLER_BUFFER            = 0x8DD0,
		GL_UNSIGNED_INT_SAMPLER_1D       = 0x8DD1,
		GL_UNSIGNED_INT_SAMPLER_2D       = 0x8DD2,
		GL_UNSIGNED_INT_SAMPLER_3D       = 0x8DD3,
		GL_UNSIGNED_INT_SAMPLER_CUBE     = 0x8DD4,
		GL_UNSIGNED_INT_SAMPLER_2D_RECT  = 0x8DD5,
		GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6,
		GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7,
		GL_UNSIGNED_INT_SAMPLER_BUFFER   = 0x8DD8;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904,
		GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;

	/** Accepted by the {@code mode} parameter of BeginConditionalRender. */
	public static final int
		GL_QUERY_WAIT              = 0x8E13,
		GL_QUERY_NO_WAIT           = 0x8E14,
		GL_QUERY_BY_REGION_WAIT    = 0x8E15,
		GL_QUERY_BY_REGION_NO_WAIT = 0x8E16;

	/** Accepted by the {@code access} parameter of MapBufferRange. */
	public static final int
		GL_MAP_READ_BIT              = 0x1,
		GL_MAP_WRITE_BIT             = 0x2,
		GL_MAP_INVALIDATE_RANGE_BIT  = 0x4,
		GL_MAP_INVALIDATE_BUFFER_BIT = 0x8,
		GL_MAP_FLUSH_EXPLICIT_BIT    = 0x10,
		GL_MAP_UNSYNCHRONIZED_BIT    = 0x20;

	/** Accepted by the {@code pname} parameter of GetBufferParameteriv. */
	public static final int
		GL_BUFFER_ACCESS_FLAGS  = 0x911F,
		GL_BUFFER_MAP_LENGTH    = 0x9120,
		GL_BUFFER_MAP_OFFSET    = 0x9121;

	/** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_RGBA_FLOAT_MODE = 0x8820;

	/** Accepted by the {@code target} parameter of ClampColor and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_CLAMP_VERTEX_COLOR   = 0x891A,
		GL_CLAMP_FRAGMENT_COLOR = 0x891B,
		GL_CLAMP_READ_COLOR     = 0x891C;

	/** Accepted by the {@code clamp} parameter of ClampColor. */
	public static final int
		GL_FIXED_ONLY = 0x891D;

	/**
	 * Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
	 * returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
	 */
	public static final int
		GL_DEPTH_COMPONENT32F = 0x8CAC,
		GL_DEPTH32F_STENCIL8  = 0x8CAD;

	/**
	 * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
	 * GetTexImage.
	 */
	public static final int
		GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;

	/** Accepted by the {@code value} parameter of GetTexLevelParameter. */
	public static final int
		GL_TEXTURE_RED_TYPE       = 0x8C10,
		GL_TEXTURE_GREEN_TYPE     = 0x8C11,
		GL_TEXTURE_BLUE_TYPE      = 0x8C12,
		GL_TEXTURE_ALPHA_TYPE     = 0x8C13,
		GL_TEXTURE_LUMINANCE_TYPE = 0x8C14,
		GL_TEXTURE_INTENSITY_TYPE = 0x8C15,
		GL_TEXTURE_DEPTH_TYPE     = 0x8C16;

	/** Returned by the {@code params} parameter of GetTexLevelParameter. */
	public static final int
		GL_UNSIGNED_NORMALIZED = 0x8C17;

	/** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
	public static final int
		GL_RGBA32F = 0x8814,
		GL_RGB32F  = 0x8815,
		GL_RGBA16F = 0x881A,
		GL_RGB16F  = 0x881B;

	/** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage. */
	public static final int
		GL_R11F_G11F_B10F = 0x8C3A;

	/**
	 * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
	 * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
	 * GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
	 */
	public static final int
		GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;

	/** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage. */
	public static final int
		GL_RGB9_E5 = 0x8C3D;

	/**
	 * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
	 * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
	 * GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
	 */
	public static final int
		GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;

	/** Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv. */
	public static final int
		GL_TEXTURE_SHARED_SIZE = 0x8C3F;

	/**
	 * Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and
	 * GetFramebufferAttachmentParameteriv.
	 */
	public static final int
		GL_FRAMEBUFFER      = 0x8D40,
		GL_READ_FRAMEBUFFER = 0x8CA8,
		GL_DRAW_FRAMEBUFFER = 0x8CA9;

	/**
	 * Accepted by the {@code target} parameter of BindRenderbuffer, RenderbufferStorage, and GetRenderbufferParameteriv, and returned by
	 * GetFramebufferAttachmentParameteriv.
	 */
	public static final int
		GL_RENDERBUFFER = 0x8D41;

	/** Accepted by the {@code internalformat} parameter of RenderbufferStorage. */
	public static final int
		GL_STENCIL_INDEX1  = 0x8D46,
		GL_STENCIL_INDEX4  = 0x8D47,
		GL_STENCIL_INDEX8  = 0x8D48,
		GL_STENCIL_INDEX16 = 0x8D49;

	/** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv. */
	public static final int
		GL_RENDERBUFFER_WIDTH           = 0x8D42,
		GL_RENDERBUFFER_HEIGHT          = 0x8D43,
		GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44,
		GL_RENDERBUFFER_RED_SIZE        = 0x8D50,
		GL_RENDERBUFFER_GREEN_SIZE      = 0x8D51,
		GL_RENDERBUFFER_BLUE_SIZE       = 0x8D52,
		GL_RENDERBUFFER_ALPHA_SIZE      = 0x8D53,
		GL_RENDERBUFFER_DEPTH_SIZE      = 0x8D54,
		GL_RENDERBUFFER_STENCIL_SIZE    = 0x8D55,
		GL_RENDERBUFFER_SAMPLES         = 0x8CAB;

	/** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
	public static final int
		GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE           = 0x8CD0,
		GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME           = 0x8CD1,
		GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL         = 0x8CD2,
		GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3,
		GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER         = 0x8CD4,
		GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING        = 0x8210,
		GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE        = 0x8211,
		GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE              = 0x8212,
		GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE            = 0x8213,
		GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE             = 0x8214,
		GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE            = 0x8215,
		GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE            = 0x8216,
		GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE          = 0x8217;

	/** Returned in {@code params} by GetFramebufferAttachmentParameteriv. */
	public static final int
		GL_SRGB                = 0x8C40,
		GL_FRAMEBUFFER_DEFAULT = 0x8218,
		GL_INDEX               = 0x8222;

	/** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv. */
	public static final int
		GL_COLOR_ATTACHMENT0        = 0x8CE0,
		GL_COLOR_ATTACHMENT1        = 0x8CE1,
		GL_COLOR_ATTACHMENT2        = 0x8CE2,
		GL_COLOR_ATTACHMENT3        = 0x8CE3,
		GL_COLOR_ATTACHMENT4        = 0x8CE4,
		GL_COLOR_ATTACHMENT5        = 0x8CE5,
		GL_COLOR_ATTACHMENT6        = 0x8CE6,
		GL_COLOR_ATTACHMENT7        = 0x8CE7,
		GL_COLOR_ATTACHMENT8        = 0x8CE8,
		GL_COLOR_ATTACHMENT9        = 0x8CE9,
		GL_COLOR_ATTACHMENT10       = 0x8CEA,
		GL_COLOR_ATTACHMENT11       = 0x8CEB,
		GL_COLOR_ATTACHMENT12       = 0x8CEC,
		GL_COLOR_ATTACHMENT13       = 0x8CED,
		GL_COLOR_ATTACHMENT14       = 0x8CEE,
		GL_COLOR_ATTACHMENT15       = 0x8CEF,
		GL_DEPTH_ATTACHMENT         = 0x8D00,
		GL_STENCIL_ATTACHMENT       = 0x8D20,
		GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_SAMPLES = 0x8D57;

	/** Returned by CheckFramebufferStatus(). */
	public static final int
		GL_FRAMEBUFFER_COMPLETE                      = 0x8CD5,
		GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT         = 0x8CD6,
		GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7,
		GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER        = 0x8CDB,
		GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER        = 0x8CDC,
		GL_FRAMEBUFFER_UNSUPPORTED                   = 0x8CDD,
		GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE        = 0x8D56,
		GL_FRAMEBUFFER_UNDEFINED                     = 0x8219;

	/** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev. */
	public static final int
		GL_FRAMEBUFFER_BINDING      = 0x8CA6,
		GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6,
		GL_READ_FRAMEBUFFER_BINDING = 0x8CAA,
		GL_RENDERBUFFER_BINDING     = 0x8CA7,
		GL_MAX_COLOR_ATTACHMENTS    = 0x8CDF,
		GL_MAX_RENDERBUFFER_SIZE    = 0x84E8;

	/** Returned by GetError(). */
	public static final int
		GL_INVALID_FRAMEBUFFER_OPERATION = 0x506;

	/**
	 * Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
	 * GetTexImage, by the {@code type} parameter of CopyPixels, by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D,
	 * CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
	 */
	public static final int
		GL_DEPTH_STENCIL = 0x84F9;

	/**
	 * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
	 * GetTexImage.
	 */
	public static final int
		GL_UNSIGNED_INT_24_8 = 0x84FA;

	/**
	 * Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
	 * returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
	 */
	public static final int
		GL_DEPTH24_STENCIL8 = 0x88F0;

	/** Accepted by the {@code value} parameter of GetTexLevelParameter. */
	public static final int
		GL_TEXTURE_STENCIL_SIZE = 0x88F1;

	/**
	 * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, GetTexImage, TexSubImage1D, TexSubImage2D,
	 * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter,
	 * ColorTable, ColorSubTable, and GetColorTable.
	 * <p/>
	 * Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, FogCoordPointer, TexCoordPointer, and
	 * VertexAttribPointer.
	 */
	public static final int
		GL_HALF_FLOAT = 0x140B;

	/** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_RGBA_INTEGER_MODE = 0x8D9E;

	/** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
	public static final int
		GL_RGBA32UI = 0x8D70,
		GL_RGB32UI  = 0x8D71,
		GL_RGBA16UI = 0x8D76,
		GL_RGB16UI  = 0x8D77,
		GL_RGBA8UI  = 0x8D7C,
		GL_RGB8UI   = 0x8D7D,
		GL_RGBA32I  = 0x8D82,
		GL_RGB32I   = 0x8D83,
		GL_RGBA16I  = 0x8D88,
		GL_RGB16I   = 0x8D89,
		GL_RGBA8I   = 0x8D8E,
		GL_RGB8I    = 0x8D8F;

	/** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels. */
	public static final int
		GL_RED_INTEGER   = 0x8D94,
		GL_GREEN_INTEGER = 0x8D95,
		GL_BLUE_INTEGER  = 0x8D96,
		GL_ALPHA_INTEGER = 0x8D97,
		GL_RGB_INTEGER   = 0x8D98,
		GL_RGBA_INTEGER  = 0x8D99,
		GL_BGR_INTEGER   = 0x8D9A,
		GL_BGRA_INTEGER  = 0x8D9B;

	/** Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmap, and BindTexture. */
	public static final int
		GL_TEXTURE_1D_ARRAY = 0x8C18,
		GL_TEXTURE_2D_ARRAY = 0x8C1A;

	/** Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CopyTexSubImage3D, CompressedTexImage3D, and CompressedTexSubImage3D. */
	public static final int
		GL_PROXY_TEXTURE_2D_ARRAY = 0x8C1B;

	/**
	 * Accepted by the {@code target} parameter of TexImage2D, TexSubImage2D, CopyTexImage2D, CopyTexSubImage2D, CompressedTexImage2D, and
	 * CompressedTexSubImage2D.
	 */
	public static final int
		GL_PROXY_TEXTURE_1D_ARRAY = 0x8C19;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
	public static final int
		GL_TEXTURE_BINDING_1D_ARRAY = 0x8C1C,
		GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D,
		GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;

	/**
	 * Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
	 * CompressedTexSubImage2D.
	 */
	public static final int
		GL_COMPRESSED_RED_RGTC1        = 0x8DBB,
		GL_COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC,
		GL_COMPRESSED_RG_RGTC2         = 0x8DBD,
		GL_COMPRESSED_SIGNED_RG_RGTC2  = 0x8DBE;

	/** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D. */
	public static final int
		GL_R8             = 0x8229,
		GL_R16            = 0x822A,
		GL_RG8            = 0x822B,
		GL_RG16           = 0x822C,
		GL_R16F           = 0x822D,
		GL_R32F           = 0x822E,
		GL_RG16F          = 0x822F,
		GL_RG32F          = 0x8230,
		GL_R8I            = 0x8231,
		GL_R8UI           = 0x8232,
		GL_R16I           = 0x8233,
		GL_R16UI          = 0x8234,
		GL_R32I           = 0x8235,
		GL_R32UI          = 0x8236,
		GL_RG8I           = 0x8237,
		GL_RG8UI          = 0x8238,
		GL_RG16I          = 0x8239,
		GL_RG16UI         = 0x823A,
		GL_RG32I          = 0x823B,
		GL_RG32UI         = 0x823C,
		GL_RG             = 0x8227,
		GL_COMPRESSED_RED = 0x8225,
		GL_COMPRESSED_RG  = 0x8226;

	/** Accepted by the {@code format} parameter of TexImage3D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and ReadPixels. */
	public static final int
		GL_RG_INTEGER = 0x8228;

	/**
	 * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
	 * BindBufferRange, BindBufferOffset and BindBufferBase.
	 */
	public static final int
		GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;

	/** Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v. */
	public static final int
		GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84,
		GL_TRANSFORM_FEEDBACK_BUFFER_SIZE  = 0x8C85;

	/**
	 * Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v, and by the {@code pname} parameter of GetBooleanv,
	 * GetDoublev, GetIntegerv, and GetFloatv.
	 */
	public static final int
		GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;

	/** Accepted by the {@code bufferMode} parameter of TransformFeedbackVaryings. */
	public static final int
		GL_INTERLEAVED_ATTRIBS = 0x8C8C,
		GL_SEPARATE_ATTRIBS    = 0x8C8D;

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
	public static final int
		GL_PRIMITIVES_GENERATED                  = 0x8C87,
		GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int
		GL_RASTERIZER_DISCARD = 0x8C89;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A,
		GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS       = 0x8C8B,
		GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS    = 0x8C80;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int
		GL_TRANSFORM_FEEDBACK_VARYINGS           = 0x8C83,
		GL_TRANSFORM_FEEDBACK_BUFFER_MODE        = 0x8C7F,
		GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_VERTEX_ARRAY_BINDING = 0x85B5;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int
		GL_FRAMEBUFFER_SRGB = 0x8DB9;

	private GL30() {}

	// --- [ glGetStringi ] ---

	/** JNI method for {@link #glGetStringi} */
	public static native long nglGetStringi(int name, int index, long __functionAddress);

	/**
	 * Queries indexed string state.
	 *
	 * @param name  the indexed state to query. One of:<p/>{@link GL11#GL_EXTENSIONS}, {@link GL20#GL_SHADING_LANGUAGE_VERSION}
	 * @param index the index of the particular element being queried
	 */
	public static String glGetStringi(int name, int index) {
		long __functionAddress = getInstance().glGetStringi;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long __result = nglGetStringi(name, index, __functionAddress);
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glVertexAttribI1i ] ---

	/** JNI method for {@link #glVertexAttribI1i} */
	public static native void nglVertexAttribI1i(int index, int x, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI1i.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 */
	public static void glVertexAttribI1i(int index, int x) {
		long __functionAddress = getInstance().glVertexAttribI1i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribI1i(index, x, __functionAddress);
	}

	// --- [ glVertexAttribI2i ] ---

	/** JNI method for {@link #glVertexAttribI2i} */
	public static native void nglVertexAttribI2i(int index, int x, int y, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI2i.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 */
	public static void glVertexAttribI2i(int index, int x, int y) {
		long __functionAddress = getInstance().glVertexAttribI2i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribI2i(index, x, y, __functionAddress);
	}

	// --- [ glVertexAttribI3i ] ---

	/** JNI method for {@link #glVertexAttribI3i} */
	public static native void nglVertexAttribI3i(int index, int x, int y, int z, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI3i.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a pure integer generic vertex attribute. The w component is implicitly set to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 */
	public static void glVertexAttribI3i(int index, int x, int y, int z) {
		long __functionAddress = getInstance().glVertexAttribI3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribI3i(index, x, y, z, __functionAddress);
	}

	// --- [ glVertexAttribI4i ] ---

	/** JNI method for {@link #glVertexAttribI4i} */
	public static native void nglVertexAttribI4i(int index, int x, int y, int z, int w, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI4i.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a pure integer generic vertex attribute.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 * @param w     the vertex attribute w component
	 */
	public static void glVertexAttribI4i(int index, int x, int y, int z, int w) {
		long __functionAddress = getInstance().glVertexAttribI4i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribI4i(index, x, y, z, w, __functionAddress);
	}

	// --- [ glVertexAttribI1ui ] ---

	/** JNI method for {@link #glVertexAttribI1ui} */
	public static native void nglVertexAttribI1ui(int index, int x, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI1ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of an unsigned pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 */
	public static void glVertexAttribI1ui(int index, int x) {
		long __functionAddress = getInstance().glVertexAttribI1ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribI1ui(index, x, __functionAddress);
	}

	// --- [ glVertexAttribI2ui ] ---

	/** JNI method for {@link #glVertexAttribI2ui} */
	public static native void nglVertexAttribI2ui(int index, int x, int y, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI2ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of an unsigned pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 */
	public static void glVertexAttribI2ui(int index, int x, int y) {
		long __functionAddress = getInstance().glVertexAttribI2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribI2ui(index, x, y, __functionAddress);
	}

	// --- [ glVertexAttribI3ui ] ---

	/** JNI method for {@link #glVertexAttribI3ui} */
	public static native void nglVertexAttribI3ui(int index, int x, int y, int z, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI3ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of an unsigned pure integer generic vertex attribute. The w component is implicitly set to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 */
	public static void glVertexAttribI3ui(int index, int x, int y, int z) {
		long __functionAddress = getInstance().glVertexAttribI3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribI3ui(index, x, y, z, __functionAddress);
	}

	// --- [ glVertexAttribI4ui ] ---

	/** JNI method for {@link #glVertexAttribI4ui} */
	public static native void nglVertexAttribI4ui(int index, int x, int y, int z, int w, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI4ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of an unsigned pure integer generic vertex attribute.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 * @param w     the vertex attribute w component
	 */
	public static void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
		long __functionAddress = getInstance().glVertexAttribI4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribI4ui(index, x, y, z, w, __functionAddress);
	}

	// --- [ glVertexAttribI1iv ] ---

	/** JNI method for {@link #glVertexAttribI1i(int, ByteBuffer)} */
	public static native void nglVertexAttribI1iv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI1.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribI1i}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI1i(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI1iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 2);
		}
		nglVertexAttribI1iv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribI1i(int, ByteBuffer)} */
	public static void glVertexAttribI1(int index, IntBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI1iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglVertexAttribI1iv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribI2iv ] ---

	/** JNI method for {@link #glVertexAttribI2i(int, ByteBuffer)} */
	public static native void nglVertexAttribI2iv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribI2i}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI2i(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 2);
		}
		nglVertexAttribI2iv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribI2i(int, ByteBuffer)} */
	public static void glVertexAttribI2(int index, IntBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglVertexAttribI2iv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribI3iv ] ---

	/** JNI method for {@link #glVertexAttribI3i(int, ByteBuffer)} */
	public static native void nglVertexAttribI3iv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribI3i}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI3i(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglVertexAttribI3iv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribI3i(int, ByteBuffer)} */
	public static void glVertexAttribI3(int index, IntBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglVertexAttribI3iv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribI4iv ] ---

	/** JNI method for {@link #glVertexAttribI4i(int, ByteBuffer)} */
	public static native void nglVertexAttribI4iv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribI4i}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4i(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglVertexAttribI4iv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribI4i(int, ByteBuffer)} */
	public static void glVertexAttribI4(int index, IntBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttribI4iv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribI1uiv ] ---

	/** JNI method for {@link #glVertexAttribI1ui(int, ByteBuffer)} */
	public static native void nglVertexAttribI1uiv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI1.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribI1ui}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI1ui(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI1uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 2);
		}
		nglVertexAttribI1uiv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribI1ui(int, ByteBuffer)} */
	public static void glVertexAttribI1u(int index, IntBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI1uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglVertexAttribI1uiv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribI2uiv ] ---

	/** JNI method for {@link #glVertexAttribI2ui(int, ByteBuffer)} */
	public static native void nglVertexAttribI2uiv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribI2ui}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI2ui(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI2uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 2);
		}
		nglVertexAttribI2uiv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribI2ui(int, ByteBuffer)} */
	public static void glVertexAttribI2u(int index, IntBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI2uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglVertexAttribI2uiv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribI3uiv ] ---

	/** JNI method for {@link #glVertexAttribI3ui(int, ByteBuffer)} */
	public static native void nglVertexAttribI3uiv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribI3ui}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI3ui(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglVertexAttribI3uiv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribI3ui(int, ByteBuffer)} */
	public static void glVertexAttribI3u(int index, IntBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglVertexAttribI3uiv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribI4uiv ] ---

	/** JNI method for {@link #glVertexAttribI4ui(int, ByteBuffer)} */
	public static native void nglVertexAttribI4uiv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribI4ui}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4ui(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglVertexAttribI4uiv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribI4ui(int, ByteBuffer)} */
	public static void glVertexAttribI4u(int index, IntBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttribI4uiv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribI4bv ] ---

	/** JNI method for {@link #glVertexAttribI4b(int, ByteBuffer)} */
	public static native void nglVertexAttribI4bv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI4b.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Byte version of {@link #glVertexAttribI4i(int, ByteBuffer)}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4b(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI4bv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttribI4bv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribI4sv ] ---

	/** JNI method for {@link #glVertexAttribI4s(int, ByteBuffer)} */
	public static native void nglVertexAttribI4sv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Short version of {@link #glVertexAttribI4i(int, ByteBuffer)}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4s(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 1);
		}
		nglVertexAttribI4sv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribI4s(int, ByteBuffer)} */
	public static void glVertexAttribI4(int index, ShortBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttribI4sv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribI4ubv ] ---

	/** JNI method for {@link #glVertexAttribI4ub(int, ByteBuffer)} */
	public static native void nglVertexAttribI4ubv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI4ub.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Byte version of {@link #glVertexAttribI4ui(int, ByteBuffer)}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4ub(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI4ubv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttribI4ubv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribI4usv ] ---

	/** JNI method for {@link #glVertexAttribI4us(int, ByteBuffer)} */
	public static native void nglVertexAttribI4usv(int index, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribI4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Short version of {@link #glVertexAttribI4ui(int, ByteBuffer)}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4us(int index, ByteBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI4usv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 1);
		}
		nglVertexAttribI4usv(index, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribI4us(int, ByteBuffer)} */
	public static void glVertexAttribI4u(int index, ShortBuffer v) {
		long __functionAddress = getInstance().glVertexAttribI4usv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglVertexAttribI4usv(index, memAddress(v), __functionAddress);
	}

	// --- [ glVertexAttribIPointer ] ---

	/** JNI method for {@link #glVertexAttribIPointer} */
	public static native void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribIPointer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the location and organization of a pure integer vertex attribute array.
	 *
	 * @param index   the index of the pure integer generic vertex attribute to be modified
	 * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<p/>1, 2, 3, 4, {@link GL12#GL_BGRA}
	 * @param type    the data type of each component in the array. One of:<p/>{@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_INT}, {@link GL11#GL_UNSIGNED_INT}
	 * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                the array. The initial value is 0.
	 * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                currently bound to the GL15#GL_ARRAY_BUFFER target. The initial value is 0.
	 */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().glVertexAttribIPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glVertexAttribIPointer} */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, long pointerOffset) {
		long __functionAddress = getInstance().glVertexAttribIPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		}
		nglVertexAttribIPointer(index, size, type, stride, pointerOffset, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glVertexAttribIPointer} */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer) {
		long __functionAddress = getInstance().glVertexAttribIPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer), __functionAddress);
	}

	/** IntBuffer version of: {@link #glVertexAttribIPointer} */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer) {
		long __functionAddress = getInstance().glVertexAttribIPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer), __functionAddress);
	}

	// --- [ glGetVertexAttribIiv ] ---

	/** JNI method for {@link #glGetVertexAttribIi(int, int, ByteBuffer)} */
	public static native void nglGetVertexAttribIiv(int index, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetVertexAttribI.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the value of a pure integer generic vertex attribute parameter.
	 *
	 * @param index  the index of the pure integer generic vertex attribute to be modified
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried. Must be:<p/>{@link GL20#GL_CURRENT_VERTEX_ATTRIB}
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribIi(int index, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetVertexAttribIiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglGetVertexAttribIiv(index, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetVertexAttribIi(int, int, ByteBuffer)} */
	public static void glGetVertexAttribI(int index, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetVertexAttribIiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglGetVertexAttribIiv(index, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetVertexAttribIi(int, int, ByteBuffer)} */
	public static int glGetVertexAttribIi(int index, int pname) {
		long __functionAddress = getInstance().glGetVertexAttribIiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetVertexAttribIiv(index, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetVertexAttribIuiv ] ---

	/** JNI method for {@link #glGetVertexAttribIui(int, int, ByteBuffer)} */
	public static native void nglGetVertexAttribIuiv(int index, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetVertexAttribI.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Unsigned version of {@link #glGetVertexAttribIi(int, int, ByteBuffer)}.
	 *
	 * @param index  the index of the pure integer generic vertex attribute to be modified
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried. Must be:<p/>{@link GL20#GL_CURRENT_VERTEX_ATTRIB}
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribIui(int index, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetVertexAttribIuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglGetVertexAttribIuiv(index, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetVertexAttribIui(int, int, ByteBuffer)} */
	public static void glGetVertexAttribIu(int index, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetVertexAttribIuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglGetVertexAttribIuiv(index, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetVertexAttribIui(int, int, ByteBuffer)} */
	public static int glGetVertexAttribIui(int index, int pname) {
		long __functionAddress = getInstance().glGetVertexAttribIuiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetVertexAttribIuiv(index, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glUniform1ui ] ---

	/** JNI method for {@link #glUniform1ui} */
	public static native void nglUniform1ui(int location, int v0, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform1ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a uint uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform value
	 */
	public static void glUniform1ui(int location, int v0) {
		long __functionAddress = getInstance().glUniform1ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform1ui(location, v0, __functionAddress);
	}

	// --- [ glUniform2ui ] ---

	/** JNI method for {@link #glUniform2ui} */
	public static native void nglUniform2ui(int location, int v0, int v1, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform2ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a uvec2 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 */
	public static void glUniform2ui(int location, int v0, int v1) {
		long __functionAddress = getInstance().glUniform2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform2ui(location, v0, v1, __functionAddress);
	}

	// --- [ glUniform3ui ] ---

	/** JNI method for {@link #glUniform3ui} */
	public static native void nglUniform3ui(int location, int v0, int v1, int v2, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform3ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a uvec3 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 */
	public static void glUniform3ui(int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().glUniform3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform3ui(location, v0, v1, v2, __functionAddress);
	}

	// --- [ glUniform4ui ] ---

	/** JNI method for {@link #glUniform4ui} */
	public static native void nglUniform4ui(int location, int v0, int v1, int v2, int v3, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform4ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a uvec4 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 * @param v3       the uniform w value
	 */
	public static void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().glUniform4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform4ui(location, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glUniform1uiv ] ---

	/** JNI method for {@link #glUniform1ui(int, int, ByteBuffer)} */
	public static native void nglUniform1uiv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform1.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single uint uniform variable or a uint uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform1ui(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform1uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, count << 2);
		}
		nglUniform1uiv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform1ui(int, int, ByteBuffer)} */
	public static void glUniform1u(int location, IntBuffer value) {
		long __functionAddress = getInstance().glUniform1uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform1uiv(location, value.remaining(), memAddress(value), __functionAddress);
	}

	// --- [ glUniform2uiv ] ---

	/** JNI method for {@link #glUniform2ui(int, int, ByteBuffer)} */
	public static native void nglUniform2uiv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single uvec2 uniform variable or a uvec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform2ui(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform2uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 1) << 2);
		}
		nglUniform2uiv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform2ui(int, int, ByteBuffer)} */
	public static void glUniform2u(int location, IntBuffer value) {
		long __functionAddress = getInstance().glUniform2uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform2uiv(location, value.remaining() >> 1, memAddress(value), __functionAddress);
	}

	// --- [ glUniform3uiv ] ---

	/** JNI method for {@link #glUniform3ui(int, int, ByteBuffer)} */
	public static native void nglUniform3uiv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single uvec3 uniform variable or a uvec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform3ui(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 3) << 2);
		}
		nglUniform3uiv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform3ui(int, int, ByteBuffer)} */
	public static void glUniform3u(int location, IntBuffer value) {
		long __functionAddress = getInstance().glUniform3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform3uiv(location, value.remaining() / 3, memAddress(value), __functionAddress);
	}

	// --- [ glUniform4uiv ] ---

	/** JNI method for {@link #glUniform4ui(int, int, ByteBuffer)} */
	public static native void nglUniform4uiv(int location, int count, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniform4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single uvec4 uniform variable or a uvec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform4ui(int location, int count, ByteBuffer value) {
		long __functionAddress = getInstance().glUniform4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 2) << 2);
		}
		nglUniform4uiv(location, count, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniform4ui(int, int, ByteBuffer)} */
	public static void glUniform4u(int location, IntBuffer value) {
		long __functionAddress = getInstance().glUniform4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniform4uiv(location, value.remaining() >> 2, memAddress(value), __functionAddress);
	}

	// --- [ glGetUniformuiv ] ---

	/** JNI method for {@link #glGetUniformui(int, int, ByteBuffer)} */
	public static native void nglGetUniformuiv(int program, int location, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetUniform.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the uint value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetUniformui(int program, int location, ByteBuffer params) {
		long __functionAddress = getInstance().glGetUniformuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetUniformuiv(program, location, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetUniformui(int, int, ByteBuffer)} */
	public static void glGetUniformu(int program, int location, IntBuffer params) {
		long __functionAddress = getInstance().glGetUniformuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetUniformuiv(program, location, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetUniformui(int, int, ByteBuffer)} */
	public static int glGetUniformui(int program, int location) {
		long __functionAddress = getInstance().glGetUniformuiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetUniformuiv(program, location, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glBindFragDataLocation ] ---

	/** JNI method for {@link #glBindFragDataLocation} */
	public static native void nglBindFragDataLocation(int program, int colorNumber, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindFragDataLocation.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds a user-defined varying out variable to a fragment shader color number.
	 *
	 * @param program     the name of the program containing varying out variable whose binding to modify
	 * @param colorNumber the color number to bind the user-defined varying out variable to
	 * @param name        the name of the user-defined varying out variable whose binding to modify
	 */
	public static void glBindFragDataLocation(int program, int colorNumber, ByteBuffer name) {
		long __functionAddress = getInstance().glBindFragDataLocation;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(name);
		}
		nglBindFragDataLocation(program, colorNumber, memAddress(name), __functionAddress);
	}

	/** CharSequence version of: {@link #glBindFragDataLocation} */
	public static void glBindFragDataLocation(int program, int colorNumber, CharSequence name) {
		long __functionAddress = getInstance().glBindFragDataLocation;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindFragDataLocation(program, colorNumber, memAddress(memEncodeASCII(name)), __functionAddress);
	}

	// --- [ glGetFragDataLocation ] ---

	/** JNI method for {@link #glGetFragDataLocation} */
	public static native int nglGetFragDataLocation(int program, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetFragDataLocation.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries the bindings of color numbers to user-defined varying out variables.
	 *
	 * @param program the name of the program containing varying out variable whose binding to query
	 * @param name    the name of the user-defined varying out variable whose binding to query
	 */
	public static int glGetFragDataLocation(int program, ByteBuffer name) {
		long __functionAddress = getInstance().glGetFragDataLocation;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(name);
		}
		return nglGetFragDataLocation(program, memAddress(name), __functionAddress);
	}

	/** CharSequence version of: {@link #glGetFragDataLocation} */
	public static int glGetFragDataLocation(int program, CharSequence name) {
		long __functionAddress = getInstance().glGetFragDataLocation;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGetFragDataLocation(program, memAddress(memEncodeASCII(name)), __functionAddress);
	}

	// --- [ glBeginConditionalRender ] ---

	/** JNI method for {@link #glBeginConditionalRender} */
	public static native void nglBeginConditionalRender(int id, int mode, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBeginConditionalRender.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Starts conditional rendering.
	 *
	 * @param id   the name of an occlusion query object whose results are used to determine if the rendering commands are discarded
	 * @param mode how {@code glBeginConditionalRender} interprets the results of the occlusion query. One of:<p/>{@link #GL_QUERY_WAIT}, {@link #GL_QUERY_NO_WAIT}, {@link #GL_QUERY_BY_REGION_WAIT}, {@link #GL_QUERY_BY_REGION_NO_WAIT}
	 */
	public static void glBeginConditionalRender(int id, int mode) {
		long __functionAddress = getInstance().glBeginConditionalRender;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBeginConditionalRender(id, mode, __functionAddress);
	}

	// --- [ glEndConditionalRender ] ---

	/** JNI method for {@link #glEndConditionalRender} */
	public static native void nglEndConditionalRender(long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBeginConditionalRender.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Ends conditional rendering.
	 */
	public static void glEndConditionalRender() {
		long __functionAddress = getInstance().glEndConditionalRender;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEndConditionalRender(__functionAddress);
	}

	// --- [ glMapBufferRange ] ---

	/** JNI method for {@link #glMapBufferRange} */
	public static native long nglMapBufferRange(int target, long offset, long length, int access, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glMapBufferRange.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Maps a section of a buffer object's data store.
	 * <p/>
	 * <b>LWJGL note</b>: This method comes in 2 flavors:
	 * <ol>
	 * <li>{@link #glMapBufferRange(int, long, long, int)} - Always returns a new ByteBuffer instance.</li>
	 * <li>{@link #glMapBufferRange(int, long, long, int, ByteBuffer)} - The {@code old_buffer} parameter is reused if the given length and returned pointer match the buffer capacity and address, respectively.</li>
	 * </ol>
	 *
	 * @param target a binding to which the target buffer is bound. One of:<p/>{@link GL15#GL_ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER}
	 * @param offset the starting offset within the buffer of the range to be mapped
	 * @param length the length of the range to be mapped
	 * @param access a combination of access flags indicating the desired access to the range. One of:<p/>{@link #GL_MAP_READ_BIT}, {@link #GL_MAP_WRITE_BIT}, {@link #GL_MAP_INVALIDATE_RANGE_BIT}, {@link #GL_MAP_INVALIDATE_BUFFER_BIT}, {@link #GL_MAP_FLUSH_EXPLICIT_BIT}, {@link #GL_MAP_UNSYNCHRONIZED_BIT}
	 */
	public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access) {
		long __functionAddress = getInstance().glMapBufferRange;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long __result = nglMapBufferRange(target, offset, length, access, __functionAddress);
		return memByteBuffer(__result, length);
	}

	/** Alternative version of: {@link #glMapBufferRange} */
	public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer) {
		long __functionAddress = getInstance().glMapBufferRange;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long __result = nglMapBufferRange(target, offset, length, access, __functionAddress);
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	// --- [ glFlushMappedBufferRange ] ---

	/** JNI method for {@link #glFlushMappedBufferRange} */
	public static native void nglFlushMappedBufferRange(int target, long offset, long length, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glFlushMappedBufferRange.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Indicates modifications to a range of a mapped buffer.
	 *
	 * @param target the target of the flush operation. One of:<p/>{@link GL15#GL_ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER}
	 * @param offset the start of the buffer subrange, in basic machine units
	 * @param length the length of the buffer subrange, in basic machine units
	 */
	public static void glFlushMappedBufferRange(int target, long offset, long length) {
		long __functionAddress = getInstance().glFlushMappedBufferRange;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFlushMappedBufferRange(target, offset, length, __functionAddress);
	}

	// --- [ glClampColor ] ---

	/** JNI method for {@link #glClampColor} */
	public static native void nglClampColor(int target, int clamp, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glClampColor.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies whether data read via {@link GL11#glReadPixels} should be clamped.
	 *
	 * @param target target for color clamping. Must be:<p/>{@link #GL_CLAMP_READ_COLOR}
	 * @param clamp  whether to apply color clamping. One of:<p/>{@link GL11#GL_TRUE}, {@link GL11#GL_FALSE}
	 */
	public static void glClampColor(int target, int clamp) {
		long __functionAddress = getInstance().glClampColor;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClampColor(target, clamp, __functionAddress);
	}

	// --- [ glIsRenderbuffer ] ---

	/** JNI method for {@link #glIsRenderbuffer} */
	public static native boolean nglIsRenderbuffer(int renderbuffer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glIsRenderbuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Determines if a name corresponds to a renderbuffer object.
	 *
	 * @param renderbuffer a value that may be the name of a renderbuffer object
	 */
	public static boolean glIsRenderbuffer(int renderbuffer) {
		long __functionAddress = getInstance().glIsRenderbuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsRenderbuffer(renderbuffer, __functionAddress);
	}

	// --- [ glBindRenderbuffer ] ---

	/** JNI method for {@link #glBindRenderbuffer} */
	public static native void nglBindRenderbuffer(int target, int renderbuffer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindRenderbuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds a renderbuffer to a renderbuffer target.
	 *
	 * @param target       the renderbuffer target of the binding operation. Must be:<p/>{@link #GL_RENDERBUFFER}
	 * @param renderbuffer the name of the renderbuffer object to bind
	 */
	public static void glBindRenderbuffer(int target, int renderbuffer) {
		long __functionAddress = getInstance().glBindRenderbuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindRenderbuffer(target, renderbuffer, __functionAddress);
	}

	// --- [ glDeleteRenderbuffers ] ---

	/** JNI method for {@link #glDeleteRenderbuffers} */
	public static native void nglDeleteRenderbuffers(int n, long renderbuffers, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDeleteRenderbuffers.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Deletes renderbuffer objects.
	 *
	 * @param n             the number of renderbuffer objects to be deleted
	 * @param renderbuffers an array containing {@code n} renderbuffer objects to be deleted
	 */
	public static void glDeleteRenderbuffers(int n, ByteBuffer renderbuffers) {
		long __functionAddress = getInstance().glDeleteRenderbuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(renderbuffers, n << 2);
		}
		nglDeleteRenderbuffers(n, memAddress(renderbuffers), __functionAddress);
	}

	/** Alternative version of: {@link #glDeleteRenderbuffers} */
	public static void glDeleteRenderbuffers(IntBuffer renderbuffers) {
		long __functionAddress = getInstance().glDeleteRenderbuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDeleteRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers), __functionAddress);
	}

	/** Single value version of: {@link #glDeleteRenderbuffers} */
	public static void glDeleteRenderbuffers(int renderbuffer) {
		long __functionAddress = getInstance().glDeleteRenderbuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int renderbuffers = __buffer.intParam();
		__buffer.intValue(renderbuffers, renderbuffer);
		nglDeleteRenderbuffers(1, __buffer.address() + renderbuffers, __functionAddress);
	}

	// --- [ glGenRenderbuffers ] ---

	/** JNI method for {@link #glGenRenderbuffers} */
	public static native void nglGenRenderbuffers(int n, long renderbuffers, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGenRenderbuffers.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Generates renderbuffer object names.
	 *
	 * @param n             the number of renderbuffer object names to generate
	 * @param renderbuffers an array in which the generated renderbuffer object names are stored
	 */
	public static void glGenRenderbuffers(int n, ByteBuffer renderbuffers) {
		long __functionAddress = getInstance().glGenRenderbuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(renderbuffers, n << 2);
		}
		nglGenRenderbuffers(n, memAddress(renderbuffers), __functionAddress);
	}

	/** Alternative version of: {@link #glGenRenderbuffers} */
	public static void glGenRenderbuffers(IntBuffer renderbuffers) {
		long __functionAddress = getInstance().glGenRenderbuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGenRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers), __functionAddress);
	}

	/** Single return value version of: {@link #glGenRenderbuffers} */
	public static int glGenRenderbuffers() {
		long __functionAddress = getInstance().glGenRenderbuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int renderbuffers = __buffer.intParam();
		nglGenRenderbuffers(1, __buffer.address() + renderbuffers, __functionAddress);
		return __buffer.intValue(renderbuffers);
	}

	// --- [ glRenderbufferStorage ] ---

	/** JNI method for {@link #glRenderbufferStorage} */
	public static native void nglRenderbufferStorage(int target, int internalformat, int width, int height, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glRenderbufferStorage.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Establishes data storage, format and dimensions of a renderbuffer object's image.
	 * <p/>
	 * This method is equivalent to calling {@link #glRenderbufferStorageMultisample} with the samples set to zero.
	 *
	 * @param target         the target of the allocation. Must be:<p/>{@link #GL_RENDERBUFFER}
	 * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
	 * @param width          the width of the renderbuffer, in pixels
	 * @param height         the height of the renderbuffer, in pixels
	 */
	public static void glRenderbufferStorage(int target, int internalformat, int width, int height) {
		long __functionAddress = getInstance().glRenderbufferStorage;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRenderbufferStorage(target, internalformat, width, height, __functionAddress);
	}

	// --- [ glRenderbufferStorageMultisample ] ---

	/** JNI method for {@link #glRenderbufferStorageMultisample} */
	public static native void nglRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glRenderbufferStorageMultisample.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Establishes data storage, format, dimensions and sample count of a renderbuffer object's image.
	 *
	 * @param target         the target of the allocation. Must be:<p/>{@link #GL_RENDERBUFFER}
	 * @param samples        the number of samples to be used for the renderbuffer object's storage
	 * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
	 * @param width          the width of the renderbuffer, in pixels
	 * @param height         the height of the renderbuffer, in pixels
	 */
	public static void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
		long __functionAddress = getInstance().glRenderbufferStorageMultisample;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRenderbufferStorageMultisample(target, samples, internalformat, width, height, __functionAddress);
	}

	// --- [ glGetRenderbufferParameteriv ] ---

	/** JNI method for {@link #glGetRenderbufferParameteri(int, int, ByteBuffer)} */
	public static native void nglGetRenderbufferParameteriv(int target, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetRenderbufferParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves information about a bound renderbuffer object.
	 *
	 * @param target the target of the query operation. Must be:<p/>{@link #GL_RENDERBUFFER}
	 * @param pname  the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<p/>{@link #GL_RENDERBUFFER_WIDTH}, {@link #GL_RENDERBUFFER_HEIGHT}, {@link #GL_RENDERBUFFER_INTERNAL_FORMAT}, {@link #GL_RENDERBUFFER_RED_SIZE}, {@link #GL_RENDERBUFFER_GREEN_SIZE}, {@link #GL_RENDERBUFFER_BLUE_SIZE}, {@link #GL_RENDERBUFFER_ALPHA_SIZE}, {@link #GL_RENDERBUFFER_DEPTH_SIZE}, {@link #GL_RENDERBUFFER_STENCIL_SIZE}, {@link #GL_RENDERBUFFER_SAMPLES}
	 * @param params an array to receive the value of the queried parameter
	 */
	public static void glGetRenderbufferParameteri(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetRenderbufferParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetRenderbufferParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetRenderbufferParameteri(int, int, ByteBuffer)} */
	public static void glGetRenderbufferParameter(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetRenderbufferParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetRenderbufferParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetRenderbufferParameteri(int, int, ByteBuffer)} */
	public static int glGetRenderbufferParameteri(int target, int pname) {
		long __functionAddress = getInstance().glGetRenderbufferParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetRenderbufferParameteriv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glIsFramebuffer ] ---

	/** JNI method for {@link #glIsFramebuffer} */
	public static native boolean nglIsFramebuffer(int framebuffer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glIsFramebuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Determines if a name corresponds to a framebuffer object.
	 *
	 * @param framebuffer a value that may be the name of a framebuffer object
	 */
	public static boolean glIsFramebuffer(int framebuffer) {
		long __functionAddress = getInstance().glIsFramebuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsFramebuffer(framebuffer, __functionAddress);
	}

	// --- [ glBindFramebuffer ] ---

	/** JNI method for {@link #glBindFramebuffer} */
	public static native void nglBindFramebuffer(int target, int framebuffer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindFramebuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds a framebuffer to a framebuffer target.
	 *
	 * @param target      the framebuffer target of the binding operation. One of:<p/>{@link #GL_FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER}
	 * @param framebuffer the name of the framebuffer object to bind
	 */
	public static void glBindFramebuffer(int target, int framebuffer) {
		long __functionAddress = getInstance().glBindFramebuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindFramebuffer(target, framebuffer, __functionAddress);
	}

	// --- [ glDeleteFramebuffers ] ---

	/** JNI method for {@link #glDeleteFramebuffers} */
	public static native void nglDeleteFramebuffers(int n, long framebuffers, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDeleteFramebuffers.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Deletes framebuffer objects.
	 *
	 * @param n            the number of framebuffer objects to be deleted
	 * @param framebuffers an array containing {@code n} framebuffer objects to be deleted
	 */
	public static void glDeleteFramebuffers(int n, ByteBuffer framebuffers) {
		long __functionAddress = getInstance().glDeleteFramebuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(framebuffers, n << 2);
		}
		nglDeleteFramebuffers(n, memAddress(framebuffers), __functionAddress);
	}

	/** Alternative version of: {@link #glDeleteFramebuffers} */
	public static void glDeleteFramebuffers(IntBuffer framebuffers) {
		long __functionAddress = getInstance().glDeleteFramebuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDeleteFramebuffers(framebuffers.remaining(), memAddress(framebuffers), __functionAddress);
	}

	/** Single value version of: {@link #glDeleteFramebuffers} */
	public static void glDeleteFramebuffers(int framebuffer) {
		long __functionAddress = getInstance().glDeleteFramebuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int framebuffers = __buffer.intParam();
		__buffer.intValue(framebuffers, framebuffer);
		nglDeleteFramebuffers(1, __buffer.address() + framebuffers, __functionAddress);
	}

	// --- [ glGenFramebuffers ] ---

	/** JNI method for {@link #glGenFramebuffers} */
	public static native void nglGenFramebuffers(int n, long framebuffers, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGenFramebuffers.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Generates framebuffer object names.
	 *
	 * @param n            the number of framebuffer object names to generate
	 * @param framebuffers an array in which the generated framebuffer object names are stored
	 */
	public static void glGenFramebuffers(int n, ByteBuffer framebuffers) {
		long __functionAddress = getInstance().glGenFramebuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(framebuffers, n << 2);
		}
		nglGenFramebuffers(n, memAddress(framebuffers), __functionAddress);
	}

	/** Alternative version of: {@link #glGenFramebuffers} */
	public static void glGenFramebuffers(IntBuffer framebuffers) {
		long __functionAddress = getInstance().glGenFramebuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGenFramebuffers(framebuffers.remaining(), memAddress(framebuffers), __functionAddress);
	}

	/** Single return value version of: {@link #glGenFramebuffers} */
	public static int glGenFramebuffers() {
		long __functionAddress = getInstance().glGenFramebuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int framebuffers = __buffer.intParam();
		nglGenFramebuffers(1, __buffer.address() + framebuffers, __functionAddress);
		return __buffer.intValue(framebuffers);
	}

	// --- [ glCheckFramebufferStatus ] ---

	/** JNI method for {@link #glCheckFramebufferStatus} */
	public static native int nglCheckFramebufferStatus(int target, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCheckFramebufferStatus.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Checks the completeness status of a framebuffer.
	 *
	 * @param target the target of the framebuffer completeness check. One of:<p/>{@link #GL_FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER}
	 */
	public static int glCheckFramebufferStatus(int target) {
		long __functionAddress = getInstance().glCheckFramebufferStatus;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglCheckFramebufferStatus(target, __functionAddress);
	}

	// --- [ glFramebufferTexture1D ] ---

	/** JNI method for {@link #glFramebufferTexture1D} */
	public static native void nglFramebufferTexture1D(int target, int attachment, int textarget, int texture, int level, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glFramebufferTexture1D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Attaches a level of a 1D texture object as a logical buffer to the currently bound framebuffer object.
	 *
	 * @param target     the framebuffer target. One of:<p/>{@link #GL_FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER}
	 * @param attachment the attachment point of the framebuffer. One of:<p/>{@link #GL_COLOR_ATTACHMENT0}, {@link #GL_COLOR_ATTACHMENT1}, {@link #GL_COLOR_ATTACHMENT2}, {@link #GL_COLOR_ATTACHMENT3}, {@link #GL_COLOR_ATTACHMENT4}, {@link #GL_COLOR_ATTACHMENT5}, {@link #GL_COLOR_ATTACHMENT6}, {@link #GL_COLOR_ATTACHMENT7}, {@link #GL_COLOR_ATTACHMENT8}, {@link #GL_COLOR_ATTACHMENT9}, {@link #GL_COLOR_ATTACHMENT10}, {@link #GL_COLOR_ATTACHMENT11}, {@link #GL_COLOR_ATTACHMENT12}, {@link #GL_COLOR_ATTACHMENT13}, {@link #GL_COLOR_ATTACHMENT14}, {@link #GL_COLOR_ATTACHMENT15}, {@link #GL_DEPTH_ATTACHMENT}, {@link #GL_STENCIL_ATTACHMENT}, {@link #GL_DEPTH_STENCIL_ATTACHMENT}
	 * @param textarget  the type of texture
	 * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level      the mipmap level of {@code texture} to attach
	 */
	public static void glFramebufferTexture1D(int target, int attachment, int textarget, int texture, int level) {
		long __functionAddress = getInstance().glFramebufferTexture1D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFramebufferTexture1D(target, attachment, textarget, texture, level, __functionAddress);
	}

	// --- [ glFramebufferTexture2D ] ---

	/** JNI method for {@link #glFramebufferTexture2D} */
	public static native void nglFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glFramebufferTexture2D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Attaches a level of a 2D texture object as a logical buffer to the currently bound framebuffer object.
	 *
	 * @param target     the framebuffer target. One of:<p/>{@link #GL_FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER}
	 * @param attachment the attachment point of the framebuffer. One of:<p/>{@link #GL_COLOR_ATTACHMENT0}, {@link #GL_COLOR_ATTACHMENT1}, {@link #GL_COLOR_ATTACHMENT2}, {@link #GL_COLOR_ATTACHMENT3}, {@link #GL_COLOR_ATTACHMENT4}, {@link #GL_COLOR_ATTACHMENT5}, {@link #GL_COLOR_ATTACHMENT6}, {@link #GL_COLOR_ATTACHMENT7}, {@link #GL_COLOR_ATTACHMENT8}, {@link #GL_COLOR_ATTACHMENT9}, {@link #GL_COLOR_ATTACHMENT10}, {@link #GL_COLOR_ATTACHMENT11}, {@link #GL_COLOR_ATTACHMENT12}, {@link #GL_COLOR_ATTACHMENT13}, {@link #GL_COLOR_ATTACHMENT14}, {@link #GL_COLOR_ATTACHMENT15}, {@link #GL_DEPTH_ATTACHMENT}, {@link #GL_STENCIL_ATTACHMENT}, {@link #GL_DEPTH_STENCIL_ATTACHMENT}
	 * @param textarget  the type of texture
	 * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level      the mipmap level of {@code texture} to attach
	 */
	public static void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
		long __functionAddress = getInstance().glFramebufferTexture2D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFramebufferTexture2D(target, attachment, textarget, texture, level, __functionAddress);
	}

	// --- [ glFramebufferTexture3D ] ---

	/** JNI method for {@link #glFramebufferTexture3D} */
	public static native void nglFramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int layer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glFramebufferTexture3D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Attaches a layer of a 3D texture object as a logical buffer to the currently bound framebuffer object.
	 *
	 * @param target     the framebuffer target. One of:<p/>{@link #GL_FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER}
	 * @param attachment the attachment point of the framebuffer. One of:<p/>{@link #GL_COLOR_ATTACHMENT0}, {@link #GL_COLOR_ATTACHMENT1}, {@link #GL_COLOR_ATTACHMENT2}, {@link #GL_COLOR_ATTACHMENT3}, {@link #GL_COLOR_ATTACHMENT4}, {@link #GL_COLOR_ATTACHMENT5}, {@link #GL_COLOR_ATTACHMENT6}, {@link #GL_COLOR_ATTACHMENT7}, {@link #GL_COLOR_ATTACHMENT8}, {@link #GL_COLOR_ATTACHMENT9}, {@link #GL_COLOR_ATTACHMENT10}, {@link #GL_COLOR_ATTACHMENT11}, {@link #GL_COLOR_ATTACHMENT12}, {@link #GL_COLOR_ATTACHMENT13}, {@link #GL_COLOR_ATTACHMENT14}, {@link #GL_COLOR_ATTACHMENT15}, {@link #GL_DEPTH_ATTACHMENT}, {@link #GL_STENCIL_ATTACHMENT}, {@link #GL_DEPTH_STENCIL_ATTACHMENT}
	 * @param textarget  the type of texture
	 * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level      the mipmap level of {@code texture} to attach
	 * @param layer      the layer of a 2-dimensional image within the 3-dimensional texture.
	 */
	public static void glFramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int layer) {
		long __functionAddress = getInstance().glFramebufferTexture3D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFramebufferTexture3D(target, attachment, textarget, texture, level, layer, __functionAddress);
	}

	// --- [ glFramebufferTextureLayer ] ---

	/** JNI method for {@link #glFramebufferTextureLayer} */
	public static native void nglFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glFramebufferTextureLayer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Attaches a single layer of a texture to a framebuffer
	 *
	 * @param target     the framebuffer target. One of:<p/>{@link #GL_FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER}
	 * @param attachment the attachment point of the framebuffer. One of:<p/>{@link #GL_COLOR_ATTACHMENT0}, {@link #GL_COLOR_ATTACHMENT1}, {@link #GL_COLOR_ATTACHMENT2}, {@link #GL_COLOR_ATTACHMENT3}, {@link #GL_COLOR_ATTACHMENT4}, {@link #GL_COLOR_ATTACHMENT5}, {@link #GL_COLOR_ATTACHMENT6}, {@link #GL_COLOR_ATTACHMENT7}, {@link #GL_COLOR_ATTACHMENT8}, {@link #GL_COLOR_ATTACHMENT9}, {@link #GL_COLOR_ATTACHMENT10}, {@link #GL_COLOR_ATTACHMENT11}, {@link #GL_COLOR_ATTACHMENT12}, {@link #GL_COLOR_ATTACHMENT13}, {@link #GL_COLOR_ATTACHMENT14}, {@link #GL_COLOR_ATTACHMENT15}, {@link #GL_DEPTH_ATTACHMENT}, {@link #GL_STENCIL_ATTACHMENT}, {@link #GL_DEPTH_STENCIL_ATTACHMENT}
	 * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level      the mipmap level of {@code texture} to attach
	 * @param layer      the layer of {@code texture} to attach.
	 */
	public static void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
		long __functionAddress = getInstance().glFramebufferTextureLayer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFramebufferTextureLayer(target, attachment, texture, level, layer, __functionAddress);
	}

	// --- [ glFramebufferRenderbuffer ] ---

	/** JNI method for {@link #glFramebufferRenderbuffer} */
	public static native void nglFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glFramebufferRenderbuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Attaches a renderbuffer as a logical buffer to the currently bound framebuffer object.
	 *
	 * @param target             the framebuffer target. One of:<p/>{@link #GL_FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER}
	 * @param attachment         the attachment point of the framebuffer. One of:<p/>{@link #GL_COLOR_ATTACHMENT0}, {@link #GL_COLOR_ATTACHMENT1}, {@link #GL_COLOR_ATTACHMENT2}, {@link #GL_COLOR_ATTACHMENT3}, {@link #GL_COLOR_ATTACHMENT4}, {@link #GL_COLOR_ATTACHMENT5}, {@link #GL_COLOR_ATTACHMENT6}, {@link #GL_COLOR_ATTACHMENT7}, {@link #GL_COLOR_ATTACHMENT8}, {@link #GL_COLOR_ATTACHMENT9}, {@link #GL_COLOR_ATTACHMENT10}, {@link #GL_COLOR_ATTACHMENT11}, {@link #GL_COLOR_ATTACHMENT12}, {@link #GL_COLOR_ATTACHMENT13}, {@link #GL_COLOR_ATTACHMENT14}, {@link #GL_COLOR_ATTACHMENT15}, {@link #GL_DEPTH_ATTACHMENT}, {@link #GL_STENCIL_ATTACHMENT}, {@link #GL_DEPTH_STENCIL_ATTACHMENT}
	 * @param renderbuffertarget the renderbuffer target. Must be:<p/>{@link #GL_RENDERBUFFER}
	 * @param renderbuffer       the name of an existing renderbuffer object of type {@code renderbuffertarget} to attach
	 */
	public static void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
		long __functionAddress = getInstance().glFramebufferRenderbuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer, __functionAddress);
	}

	// --- [ glGetFramebufferAttachmentParameteriv ] ---

	/** JNI method for {@link #glGetFramebufferAttachmentParameteri(int, int, int, ByteBuffer)} */
	public static native void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetFramebufferAttachmentParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrievees information about attachments of a bound framebuffer object.
	 *
	 * @param target     the target of the query operation. One of:<p/>{@link #GL_FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER}
	 * @param attachment the attachment within {@code target}. One of:<p/>{@link #GL_COLOR_ATTACHMENT0}, {@link #GL_COLOR_ATTACHMENT1}, {@link #GL_COLOR_ATTACHMENT2}, {@link #GL_COLOR_ATTACHMENT3}, {@link #GL_COLOR_ATTACHMENT4}, {@link #GL_COLOR_ATTACHMENT5}, {@link #GL_COLOR_ATTACHMENT6}, {@link #GL_COLOR_ATTACHMENT7}, {@link #GL_COLOR_ATTACHMENT8}, {@link #GL_COLOR_ATTACHMENT9}, {@link #GL_COLOR_ATTACHMENT10}, {@link #GL_COLOR_ATTACHMENT11}, {@link #GL_COLOR_ATTACHMENT12}, {@link #GL_COLOR_ATTACHMENT13}, {@link #GL_COLOR_ATTACHMENT14}, {@link #GL_COLOR_ATTACHMENT15}, {@link #GL_DEPTH_ATTACHMENT}, {@link #GL_STENCIL_ATTACHMENT}, {@link #GL_DEPTH_STENCIL_ATTACHMENT}
	 * @param pname      the parameter of {@code attachment} to query. One of:<p/>{@link #GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}, {@link #GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}, {@link #GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}, {@link #GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}, {@link #GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}
	 * @param params     an array to receive the value of the queried parameter
	 */
	public static void glGetFramebufferAttachmentParameteri(int target, int attachment, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetFramebufferAttachmentParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetFramebufferAttachmentParameteriv(target, attachment, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetFramebufferAttachmentParameteri(int, int, int, ByteBuffer)} */
	public static void glGetFramebufferAttachmentParameter(int target, int attachment, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetFramebufferAttachmentParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetFramebufferAttachmentParameteriv(target, attachment, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetFramebufferAttachmentParameteri(int, int, int, ByteBuffer)} */
	public static int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname) {
		long __functionAddress = getInstance().glGetFramebufferAttachmentParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetFramebufferAttachmentParameteriv(target, attachment, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glBlitFramebuffer ] ---

	/** JNI method for {@link #glBlitFramebuffer} */
	public static native void nglBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBlitFramebuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Copies a block of pixels from the read framebuffer to the draw framebuffer.
	 *
	 * @param srcX0  the lower-left coordinate of the source rectangle within the read buffer
	 * @param srcY0  the upper-left coordinate of the source rectangle within the read buffer
	 * @param srcX1  the lower-right coordinate of the source rectangle within the read buffer
	 * @param srcY1  the upper-right coordinate of the source rectangle within the read buffer
	 * @param dstX0  the lower-left coordinate of the destination rectangle within the write buffer
	 * @param dstY0  the upper-left coordinate of the destination rectangle within the write buffer
	 * @param dstX1  the lower-right coordinate of the destination rectangle within the write buffer
	 * @param dstY1  the upper-right coordinate of the destination rectangle within the write buffer
	 * @param mask   the bitwise OR of the flags indicating which buffers are to be copied. One of:<p/>{@link GL11#GL_COLOR_BUFFER_BIT}, {@link GL11#GL_DEPTH_BUFFER_BIT}, {@link GL11#GL_STENCIL_BUFFER_BIT}
	 * @param filter the interpolation to be applied if the image is stretched. One of:<p/>{@link GL11#GL_NEAREST}, {@link GL11#GL_LINEAR}
	 */
	public static void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = getInstance().glBlitFramebuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
	}

	// --- [ glGenerateMipmap ] ---

	/** JNI method for {@link #glGenerateMipmap} */
	public static native void nglGenerateMipmap(int target, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGenerateMipmap.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Generate mipmaps for a specified texture target.
	 *
	 * @param target the target to which the texture whose mimaps to generate is bound. One of:<p/>{@link GL11#GL_TEXTURE_1D}, {@link GL11#GL_TEXTURE_2D}, {@link GL12#GL_TEXTURE_3D}, {@link #GL_TEXTURE_1D_ARRAY}, {@link #GL_TEXTURE_2D_ARRAY}, {@link GL13#GL_TEXTURE_CUBE_MAP}
	 */
	public static void glGenerateMipmap(int target) {
		long __functionAddress = getInstance().glGenerateMipmap;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGenerateMipmap(target, __functionAddress);
	}

	// --- [ glTexParameterIiv ] ---

	/** JNI method for {@link #glTexParameterIi(int, int, ByteBuffer)} */
	public static native void nglTexParameterIiv(int target, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexParameterI.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the integer value of a texture parameter.
	 *
	 * @param target the texture target
	 * @param pname  the symbolic name of a single-valued texture parameter
	 * @param params the value of {@code pname}
	 */
	public static void glTexParameterIi(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glTexParameterIiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglTexParameterIiv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glTexParameterIi(int, int, ByteBuffer)} */
	public static void glTexParameterI(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glTexParameterIiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglTexParameterIiv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single value version of: {@link #glTexParameterIi(int, int, ByteBuffer)} */
	public static void glTexParameterIi(int target, int pname, int param) {
		long __functionAddress = getInstance().glTexParameterIiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		__buffer.intValue(params, param);
		nglTexParameterIiv(target, pname, __buffer.address() + params, __functionAddress);
	}

	// --- [ glTexParameterIuiv ] ---

	/** JNI method for {@link #glTexParameterIui(int, int, ByteBuffer)} */
	public static native void nglTexParameterIuiv(int target, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexParameterI.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the unsigned integer value of a texture parameter.
	 *
	 * @param target the texture target
	 * @param pname  the symbolic name of a single-valued texture parameter
	 * @param params the value of {@code pname}
	 */
	public static void glTexParameterIui(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glTexParameterIuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglTexParameterIuiv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glTexParameterIui(int, int, ByteBuffer)} */
	public static void glTexParameterIu(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glTexParameterIuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglTexParameterIuiv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single value version of: {@link #glTexParameterIui(int, int, ByteBuffer)} */
	public static void glTexParameterIui(int target, int pname, int param) {
		long __functionAddress = getInstance().glTexParameterIuiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		__buffer.intValue(params, param);
		nglTexParameterIuiv(target, pname, __buffer.address() + params, __functionAddress);
	}

	// --- [ glGetTexParameterIiv ] ---

	/** JNI method for {@link #glGetTexParameterIi(int, int, ByteBuffer)} */
	public static native void nglGetTexParameterIiv(int target, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetTexParameterI.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the integer value of a texture parameter.
	 *
	 * @param target the texture target
	 * @param pname  the symbolic name of a texture parameter
	 * @param params returns the texture parameter value
	 */
	public static void glGetTexParameterIi(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetTexParameterIiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetTexParameterIiv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetTexParameterIi(int, int, ByteBuffer)} */
	public static void glGetTexParameterI(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetTexParameterIiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetTexParameterIiv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetTexParameterIi(int, int, ByteBuffer)} */
	public static int glGetTexParameterIi(int target, int pname) {
		long __functionAddress = getInstance().glGetTexParameterIiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTexParameterIiv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetTexParameterIuiv ] ---

	/** JNI method for {@link #glGetTexParameterIui(int, int, ByteBuffer)} */
	public static native void nglGetTexParameterIuiv(int target, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetTexParameterI.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the unsigned integer value of a texture parameter.
	 *
	 * @param target the texture target
	 * @param pname  the symbolic name of a texture parameter
	 * @param params returns the texture parameter value
	 */
	public static void glGetTexParameterIui(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetTexParameterIuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetTexParameterIuiv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetTexParameterIui(int, int, ByteBuffer)} */
	public static void glGetTexParameterIu(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetTexParameterIuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetTexParameterIuiv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetTexParameterIui(int, int, ByteBuffer)} */
	public static int glGetTexParameterIui(int target, int pname) {
		long __functionAddress = getInstance().glGetTexParameterIuiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTexParameterIuiv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glColorMaski ] ---

	/** JNI method for {@link #glColorMaski} */
	public static native void nglColorMaski(int buf, boolean r, boolean g, boolean b, boolean a, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glColorMaski.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Enables and disables writing of frame buffer color components.
	 *
	 * @param buf the index of the draw buffer whose color mask to set
	 * @param r   whether R values are written or not
	 * @param g   whether G values are written or not
	 * @param b   whether B values are written or not
	 * @param a   whether A values are written or not
	 */
	public static void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a) {
		long __functionAddress = getInstance().glColorMaski;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorMaski(buf, r, g, b, a, __functionAddress);
	}

	// --- [ glGetBooleani_v ] ---

	/** JNI method for {@link #glGetBooleani(int, int, ByteBuffer)} */
	public static native void nglGetBooleani_v(int target, int index, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGet.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries the boolean value of an indexed state variable.
	 *
	 * @param target the indexed state to query
	 * @param index  the index of the element being queried
	 * @param data   a scalar or array in which to place the returned data
	 */
	public static void glGetBooleani(int target, int index, ByteBuffer data) {
		long __functionAddress = getInstance().glGetBooleani_v;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1);
		}
		nglGetBooleani_v(target, index, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetBooleani(int, int, ByteBuffer)} */
	public static boolean glGetBooleani(int target, int index) {
		long __functionAddress = getInstance().glGetBooleani_v;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.booleanParam();
		nglGetBooleani_v(target, index, __buffer.address() + data, __functionAddress);
		return __buffer.booleanValue(data);
	}

	// --- [ glGetIntegeri_v ] ---

	/** JNI method for {@link #glGetIntegeri(int, int, ByteBuffer)} */
	public static native void nglGetIntegeri_v(int target, int index, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGet.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries the integer value of an indexed state variable.
	 *
	 * @param target the indexed state to query
	 * @param index  the index of the element being queried
	 * @param data   a scalar or array in which to place the returned data
	 */
	public static void glGetIntegeri(int target, int index, ByteBuffer data) {
		long __functionAddress = getInstance().glGetIntegeri_v;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1 << 2);
		}
		nglGetIntegeri_v(target, index, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetIntegeri(int, int, ByteBuffer)} */
	public static void glGetInteger(int target, int index, IntBuffer data) {
		long __functionAddress = getInstance().glGetIntegeri_v;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1);
		}
		nglGetIntegeri_v(target, index, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetIntegeri(int, int, ByteBuffer)} */
	public static int glGetIntegeri(int target, int index) {
		long __functionAddress = getInstance().glGetIntegeri_v;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetIntegeri_v(target, index, __buffer.address() + data, __functionAddress);
		return __buffer.intValue(data);
	}

	// --- [ glEnablei ] ---

	/** JNI method for {@link #glEnablei} */
	public static native void nglEnablei(int cap, int index, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glEnablei.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Enables an indexed capability.
	 *
	 * @param cap   the indexed capability to enable
	 * @param index the index to enable
	 */
	public static void glEnablei(int cap, int index) {
		long __functionAddress = getInstance().glEnablei;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEnablei(cap, index, __functionAddress);
	}

	// --- [ glDisablei ] ---

	/** JNI method for {@link #glDisablei} */
	public static native void nglDisablei(int target, int index, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDisablei.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Disables an indexed capability.
	 *
	 * @param target the indexed capability to disable
	 * @param index  the index to disable
	 */
	public static void glDisablei(int target, int index) {
		long __functionAddress = getInstance().glDisablei;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDisablei(target, index, __functionAddress);
	}

	// --- [ glIsEnabledi ] ---

	/** JNI method for {@link #glIsEnabledi} */
	public static native boolean nglIsEnabledi(int target, int index, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glIsEnabledi.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Tests whether an indexed capability is enabled.
	 *
	 * @param target the indexed capability to query
	 * @param index  the index to query
	 */
	public static boolean glIsEnabledi(int target, int index) {
		long __functionAddress = getInstance().glIsEnabledi;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsEnabledi(target, index, __functionAddress);
	}

	// --- [ glBindBufferRange ] ---

	/** JNI method for {@link #glBindBufferRange} */
	public static native void nglBindBufferRange(int target, int index, int buffer, long offset, long size, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindBufferRange.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds a range within a buffer object to an indexed buffer target.
	 *
	 * @param target the target of the bind operation. One of:<p/>{@link #GL_TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER}
	 * @param index  the index of the binding point within the array specified by {@code target}
	 * @param buffer a buffer object to bind to the specified binding point
	 * @param offset the starting offset in basic machine units into the buffer object {@code buffer}
	 * @param size   the amount of data in machine units that can be read from the buffer object while used as an indexed target
	 */
	public static void glBindBufferRange(int target, int index, int buffer, long offset, long size) {
		long __functionAddress = getInstance().glBindBufferRange;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindBufferRange(target, index, buffer, offset, size, __functionAddress);
	}

	// --- [ glBindBufferBase ] ---

	/** JNI method for {@link #glBindBufferBase} */
	public static native void nglBindBufferBase(int target, int index, int buffer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindBufferBase.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds a buffer object to an indexed buffer target.
	 *
	 * @param target the target of the bind operation. One of:<p/>{@link #GL_TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER}
	 * @param index  the index of the binding point within the array specified by {@code target}
	 * @param buffer a buffer object to bind to the specified binding point
	 */
	public static void glBindBufferBase(int target, int index, int buffer) {
		long __functionAddress = getInstance().glBindBufferBase;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindBufferBase(target, index, buffer, __functionAddress);
	}

	// --- [ glBeginTransformFeedback ] ---

	/** JNI method for {@link #glBeginTransformFeedback} */
	public static native void nglBeginTransformFeedback(int primitiveMode, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBeginTransformFeedback.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Starts transform feedback operation.
	 *
	 * @param primitiveMode the output type of the primitives that will be recorded into the buffer objects that are bound for transform feedback. One of:<p/>{@link GL11#GL_POINTS}, {@link GL11#GL_LINES}, {@link GL11#GL_TRIANGLES}
	 */
	public static void glBeginTransformFeedback(int primitiveMode) {
		long __functionAddress = getInstance().glBeginTransformFeedback;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBeginTransformFeedback(primitiveMode, __functionAddress);
	}

	// --- [ glEndTransformFeedback ] ---

	/** JNI method for {@link #glEndTransformFeedback} */
	public static native void nglEndTransformFeedback(long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBeginTransformFeedback.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Ends transform feedback operation.
	 */
	public static void glEndTransformFeedback() {
		long __functionAddress = getInstance().glEndTransformFeedback;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEndTransformFeedback(__functionAddress);
	}

	// --- [ glTransformFeedbackVaryings ] ---

	/** JNI method for {@link #glTransformFeedbackVaryings} */
	public static native void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTransformFeedbackVaryings.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies values to record in transform feedback buffers.
	 *
	 * @param program    the target program object
	 * @param count      the number of varying variables used for transform feedback
	 * @param varyings   an array of {@code count} zero-terminated strings specifying the names of the varying variables to use for transform feedback
	 * @param bufferMode the mode used to capture the varying variables when transform feedback is active. One of:<p/>{@link #GL_INTERLEAVED_ATTRIBS}, {@link #GL_SEPARATE_ATTRIBS}
	 */
	public static void glTransformFeedbackVaryings(int program, int count, ByteBuffer varyings, int bufferMode) {
		long __functionAddress = getInstance().glTransformFeedbackVaryings;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(varyings, count << POINTER_SHIFT);
		}
		nglTransformFeedbackVaryings(program, count, memAddress(varyings), bufferMode, __functionAddress);
	}

	/** Alternative version of: {@link #glTransformFeedbackVaryings} */
	public static void glTransformFeedbackVaryings(int program, PointerBuffer varyings, int bufferMode) {
		long __functionAddress = getInstance().glTransformFeedbackVaryings;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTransformFeedbackVaryings(program, varyings.remaining(), memAddress(varyings), bufferMode, __functionAddress);
	}

	/** Array version of: {@link #glTransformFeedbackVaryings} */
	public static void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode) {
		long __functionAddress = getInstance().glTransformFeedbackVaryings;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int varyingsAddress = __buffer.bufferParam(varyings.length << POINTER_SHIFT);
		ByteBuffer[] varyingsBuffers = new ByteBuffer[varyings.length];
		for ( int i = 0; i < varyings.length; i++ )
			__buffer.pointerValue(varyingsAddress + (i << POINTER_SHIFT), memAddress(varyingsBuffers[i] = memEncodeASCII(varyings[i], true)));
		nglTransformFeedbackVaryings(program, varyings.length, __buffer.address() + varyingsAddress, bufferMode, __functionAddress);
	}

	/** Single varying version of: {@link #glTransformFeedbackVaryings} */
	public static void glTransformFeedbackVaryings(int program, CharSequence varying, int bufferMode) {
		long __functionAddress = getInstance().glTransformFeedbackVaryings;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int varyingsAddress = __buffer.pointerParam();
		ByteBuffer varyingBuffers = memEncodeASCII(varying, true);
		__buffer.pointerValue(varyingsAddress, memAddress(varyingBuffers));
		nglTransformFeedbackVaryings(program, 1, __buffer.address() + varyingsAddress, bufferMode, __functionAddress);
	}

	// --- [ glGetTransformFeedbackVarying ] ---

	/** JNI method for {@link #glGetTransformFeedbackVarying} */
	public static native void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetTransformFeedbackVarying.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves information about varying variables selected for transform feedback.
	 *
	 * @param program the target program object
	 * @param index   the index of the varying variable whose information to retrieve
	 * @param bufSize the maximum number of characters, including the null terminator, that may be written into {@code name}
	 * @param length  a variable which will receive the number of characters written into {@code name}, excluding the null-terminator. If {@code length} is NULL no length is returned.
	 * @param size    a variable that will receive the size of the varying
	 * @param type    a variable that will receive the type of the varying
	 * @param name    a buffer into which will be written the name of the varying
	 */
	public static void glGetTransformFeedbackVarying(int program, int index, int bufSize, ByteBuffer length, ByteBuffer size, ByteBuffer type, ByteBuffer name) {
		long __functionAddress = getInstance().glGetTransformFeedbackVarying;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(name, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
			checkBuffer(size, 1 << 2);
			checkBuffer(type, 1 << 2);
		}
		nglGetTransformFeedbackVarying(program, index, bufSize, memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name), __functionAddress);
	}

	/** Alternative version of: {@link #glGetTransformFeedbackVarying} */
	public static void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		long __functionAddress = getInstance().glGetTransformFeedbackVarying;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetTransformFeedbackVarying(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name), __functionAddress);
	}

	/** String return version of: {@link #glGetTransformFeedbackVarying} */
	public static String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
		long __functionAddress = getInstance().glGetTransformFeedbackVarying;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int name = __buffer.bufferParam(bufSize);
		int length = __buffer.intParam();
		nglGetTransformFeedbackVarying(program, index, bufSize, __buffer.address() + length, memAddress(size), memAddress(type), __buffer.address() + name, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + name, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetTransformFeedbackVarying} */
	public static String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type) {
		long __functionAddress = getInstance().glGetTransformFeedbackVarying;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		int bufSize = GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int name = __buffer.bufferParam(bufSize);
		int length = __buffer.intParam();
		nglGetTransformFeedbackVarying(program, index, bufSize, __buffer.address() + length, memAddress(size), memAddress(type), __buffer.address() + name, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + name, __buffer.intValue(length)));
	}

	// --- [ glBindVertexArray ] ---

	/** JNI method for {@link #glBindVertexArray} */
	public static native void nglBindVertexArray(int array, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindVertexArray.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds a vertex array object
	 *
	 * @param array the name of the vertex array to bind
	 */
	public static void glBindVertexArray(int array) {
		long __functionAddress = getInstance().glBindVertexArray;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindVertexArray(array, __functionAddress);
	}

	// --- [ glDeleteVertexArrays ] ---

	/** JNI method for {@link #glDeleteVertexArrays} */
	public static native void nglDeleteVertexArrays(int n, long arrays, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDeleteVertexArrays.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Deletes vertex array objects.
	 *
	 * @param n      the number of vertex array objects to be deleted
	 * @param arrays an array containing the n names of the objects to be deleted
	 */
	public static void glDeleteVertexArrays(int n, ByteBuffer arrays) {
		long __functionAddress = getInstance().glDeleteVertexArrays;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(arrays, n << 2);
		}
		nglDeleteVertexArrays(n, memAddress(arrays), __functionAddress);
	}

	/** Alternative version of: {@link #glDeleteVertexArrays} */
	public static void glDeleteVertexArrays(IntBuffer arrays) {
		long __functionAddress = getInstance().glDeleteVertexArrays;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDeleteVertexArrays(arrays.remaining(), memAddress(arrays), __functionAddress);
	}

	/** Single value version of: {@link #glDeleteVertexArrays} */
	public static void glDeleteVertexArrays(int array) {
		long __functionAddress = getInstance().glDeleteVertexArrays;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int arrays = __buffer.intParam();
		__buffer.intValue(arrays, array);
		nglDeleteVertexArrays(1, __buffer.address() + arrays, __functionAddress);
	}

	// --- [ glGenVertexArrays ] ---

	/** JNI method for {@link #glGenVertexArrays} */
	public static native void nglGenVertexArrays(int n, long arrays, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGenVertexArrays.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Generates vertex array object names.
	 *
	 * @param n      the number of vertex array object names to generate
	 * @param arrays an array in which the generated vertex array object names are stored
	 */
	public static void glGenVertexArrays(int n, ByteBuffer arrays) {
		long __functionAddress = getInstance().glGenVertexArrays;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(arrays, n << 2);
		}
		nglGenVertexArrays(n, memAddress(arrays), __functionAddress);
	}

	/** Alternative version of: {@link #glGenVertexArrays} */
	public static void glGenVertexArrays(IntBuffer arrays) {
		long __functionAddress = getInstance().glGenVertexArrays;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGenVertexArrays(arrays.remaining(), memAddress(arrays), __functionAddress);
	}

	/** Single return value version of: {@link #glGenVertexArrays} */
	public static int glGenVertexArrays() {
		long __functionAddress = getInstance().glGenVertexArrays;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int arrays = __buffer.intParam();
		nglGenVertexArrays(1, __buffer.address() + arrays, __functionAddress);
		return __buffer.intValue(arrays);
	}

	// --- [ glIsVertexArray ] ---

	/** JNI method for {@link #glIsVertexArray} */
	public static native boolean nglIsVertexArray(int array, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glIsVertexArray.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Determines if a name corresponds to a vertex array object.
	 *
	 * @param array a value that may be the name of a vertex array object
	 */
	public static boolean glIsVertexArray(int array) {
		long __functionAddress = getInstance().glIsVertexArray;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsVertexArray(array, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GL30;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL30") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glGetStringi) &&
			GL.isFunctionSupported(funcs.glVertexAttribI1i) &&
			GL.isFunctionSupported(funcs.glVertexAttribI2i) &&
			GL.isFunctionSupported(funcs.glVertexAttribI3i) &&
			GL.isFunctionSupported(funcs.glVertexAttribI4i) &&
			GL.isFunctionSupported(funcs.glVertexAttribI1ui) &&
			GL.isFunctionSupported(funcs.glVertexAttribI2ui) &&
			GL.isFunctionSupported(funcs.glVertexAttribI3ui) &&
			GL.isFunctionSupported(funcs.glVertexAttribI4ui) &&
			GL.isFunctionSupported(funcs.glVertexAttribI1iv) &&
			GL.isFunctionSupported(funcs.glVertexAttribI2iv) &&
			GL.isFunctionSupported(funcs.glVertexAttribI3iv) &&
			GL.isFunctionSupported(funcs.glVertexAttribI4iv) &&
			GL.isFunctionSupported(funcs.glVertexAttribI1uiv) &&
			GL.isFunctionSupported(funcs.glVertexAttribI2uiv) &&
			GL.isFunctionSupported(funcs.glVertexAttribI3uiv) &&
			GL.isFunctionSupported(funcs.glVertexAttribI4uiv) &&
			GL.isFunctionSupported(funcs.glVertexAttribI4bv) &&
			GL.isFunctionSupported(funcs.glVertexAttribI4sv) &&
			GL.isFunctionSupported(funcs.glVertexAttribI4ubv) &&
			GL.isFunctionSupported(funcs.glVertexAttribI4usv) &&
			GL.isFunctionSupported(funcs.glVertexAttribIPointer) &&
			GL.isFunctionSupported(funcs.glGetVertexAttribIiv) &&
			GL.isFunctionSupported(funcs.glGetVertexAttribIuiv) &&
			GL.isFunctionSupported(funcs.glUniform1ui) &&
			GL.isFunctionSupported(funcs.glUniform2ui) &&
			GL.isFunctionSupported(funcs.glUniform3ui) &&
			GL.isFunctionSupported(funcs.glUniform4ui) &&
			GL.isFunctionSupported(funcs.glUniform1uiv) &&
			GL.isFunctionSupported(funcs.glUniform2uiv) &&
			GL.isFunctionSupported(funcs.glUniform3uiv) &&
			GL.isFunctionSupported(funcs.glUniform4uiv) &&
			GL.isFunctionSupported(funcs.glGetUniformuiv) &&
			GL.isFunctionSupported(funcs.glBindFragDataLocation) &&
			GL.isFunctionSupported(funcs.glGetFragDataLocation) &&
			GL.isFunctionSupported(funcs.glBeginConditionalRender) &&
			GL.isFunctionSupported(funcs.glEndConditionalRender) &&
			GL.isFunctionSupported(funcs.glMapBufferRange) &&
			GL.isFunctionSupported(funcs.glFlushMappedBufferRange) &&
			GL.isFunctionSupported(funcs.glClampColor) &&
			GL.isFunctionSupported(funcs.glIsRenderbuffer) &&
			GL.isFunctionSupported(funcs.glBindRenderbuffer) &&
			GL.isFunctionSupported(funcs.glDeleteRenderbuffers) &&
			GL.isFunctionSupported(funcs.glGenRenderbuffers) &&
			GL.isFunctionSupported(funcs.glRenderbufferStorage) &&
			GL.isFunctionSupported(funcs.glRenderbufferStorageMultisample) &&
			GL.isFunctionSupported(funcs.glGetRenderbufferParameteriv) &&
			GL.isFunctionSupported(funcs.glIsFramebuffer) &&
			GL.isFunctionSupported(funcs.glBindFramebuffer) &&
			GL.isFunctionSupported(funcs.glDeleteFramebuffers) &&
			GL.isFunctionSupported(funcs.glGenFramebuffers) &&
			GL.isFunctionSupported(funcs.glCheckFramebufferStatus) &&
			GL.isFunctionSupported(funcs.glFramebufferTexture1D) &&
			GL.isFunctionSupported(funcs.glFramebufferTexture2D) &&
			GL.isFunctionSupported(funcs.glFramebufferTexture3D) &&
			GL.isFunctionSupported(funcs.glFramebufferTextureLayer) &&
			GL.isFunctionSupported(funcs.glFramebufferRenderbuffer) &&
			GL.isFunctionSupported(funcs.glGetFramebufferAttachmentParameteriv) &&
			GL.isFunctionSupported(funcs.glBlitFramebuffer) &&
			GL.isFunctionSupported(funcs.glGenerateMipmap) &&
			GL.isFunctionSupported(funcs.glTexParameterIiv) &&
			GL.isFunctionSupported(funcs.glTexParameterIuiv) &&
			GL.isFunctionSupported(funcs.glGetTexParameterIiv) &&
			GL.isFunctionSupported(funcs.glGetTexParameterIuiv) &&
			GL.isFunctionSupported(funcs.glColorMaski) &&
			GL.isFunctionSupported(funcs.glGetBooleani_v) &&
			GL.isFunctionSupported(funcs.glGetIntegeri_v) &&
			GL.isFunctionSupported(funcs.glEnablei) &&
			GL.isFunctionSupported(funcs.glDisablei) &&
			GL.isFunctionSupported(funcs.glIsEnabledi) &&
			GL.isFunctionSupported(funcs.glBindBufferRange) &&
			GL.isFunctionSupported(funcs.glBindBufferBase) &&
			GL.isFunctionSupported(funcs.glBeginTransformFeedback) &&
			GL.isFunctionSupported(funcs.glEndTransformFeedback) &&
			GL.isFunctionSupported(funcs.glTransformFeedbackVaryings) &&
			GL.isFunctionSupported(funcs.glGetTransformFeedbackVarying) &&
			GL.isFunctionSupported(funcs.glBindVertexArray) &&
			GL.isFunctionSupported(funcs.glDeleteVertexArrays) &&
			GL.isFunctionSupported(funcs.glGenVertexArrays) &&
			GL.isFunctionSupported(funcs.glIsVertexArray);

		return GL.checkExtension("OpenGL30", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GL30}. */
	public static final class Functions implements FunctionMap {

		public final long
			glGetStringi,
			glVertexAttribI1i,
			glVertexAttribI2i,
			glVertexAttribI3i,
			glVertexAttribI4i,
			glVertexAttribI1ui,
			glVertexAttribI2ui,
			glVertexAttribI3ui,
			glVertexAttribI4ui,
			glVertexAttribI1iv,
			glVertexAttribI2iv,
			glVertexAttribI3iv,
			glVertexAttribI4iv,
			glVertexAttribI1uiv,
			glVertexAttribI2uiv,
			glVertexAttribI3uiv,
			glVertexAttribI4uiv,
			glVertexAttribI4bv,
			glVertexAttribI4sv,
			glVertexAttribI4ubv,
			glVertexAttribI4usv,
			glVertexAttribIPointer,
			glGetVertexAttribIiv,
			glGetVertexAttribIuiv,
			glUniform1ui,
			glUniform2ui,
			glUniform3ui,
			glUniform4ui,
			glUniform1uiv,
			glUniform2uiv,
			glUniform3uiv,
			glUniform4uiv,
			glGetUniformuiv,
			glBindFragDataLocation,
			glGetFragDataLocation,
			glBeginConditionalRender,
			glEndConditionalRender,
			glMapBufferRange,
			glFlushMappedBufferRange,
			glClampColor,
			glIsRenderbuffer,
			glBindRenderbuffer,
			glDeleteRenderbuffers,
			glGenRenderbuffers,
			glRenderbufferStorage,
			glRenderbufferStorageMultisample,
			glGetRenderbufferParameteriv,
			glIsFramebuffer,
			glBindFramebuffer,
			glDeleteFramebuffers,
			glGenFramebuffers,
			glCheckFramebufferStatus,
			glFramebufferTexture1D,
			glFramebufferTexture2D,
			glFramebufferTexture3D,
			glFramebufferTextureLayer,
			glFramebufferRenderbuffer,
			glGetFramebufferAttachmentParameteriv,
			glBlitFramebuffer,
			glGenerateMipmap,
			glTexParameterIiv,
			glTexParameterIuiv,
			glGetTexParameterIiv,
			glGetTexParameterIuiv,
			glColorMaski,
			glGetBooleani_v,
			glGetIntegeri_v,
			glEnablei,
			glDisablei,
			glIsEnabledi,
			glBindBufferRange,
			glBindBufferBase,
			glBeginTransformFeedback,
			glEndTransformFeedback,
			glTransformFeedbackVaryings,
			glGetTransformFeedbackVarying,
			glBindVertexArray,
			glDeleteVertexArrays,
			glGenVertexArrays,
			glIsVertexArray;

		public Functions(FunctionProvider provider) {
			glGetStringi = provider.getFunctionAddress("glGetStringi");
			glVertexAttribI1i = provider.getFunctionAddress("glVertexAttribI1i");
			glVertexAttribI2i = provider.getFunctionAddress("glVertexAttribI2i");
			glVertexAttribI3i = provider.getFunctionAddress("glVertexAttribI3i");
			glVertexAttribI4i = provider.getFunctionAddress("glVertexAttribI4i");
			glVertexAttribI1ui = provider.getFunctionAddress("glVertexAttribI1ui");
			glVertexAttribI2ui = provider.getFunctionAddress("glVertexAttribI2ui");
			glVertexAttribI3ui = provider.getFunctionAddress("glVertexAttribI3ui");
			glVertexAttribI4ui = provider.getFunctionAddress("glVertexAttribI4ui");
			glVertexAttribI1iv = provider.getFunctionAddress("glVertexAttribI1iv");
			glVertexAttribI2iv = provider.getFunctionAddress("glVertexAttribI2iv");
			glVertexAttribI3iv = provider.getFunctionAddress("glVertexAttribI3iv");
			glVertexAttribI4iv = provider.getFunctionAddress("glVertexAttribI4iv");
			glVertexAttribI1uiv = provider.getFunctionAddress("glVertexAttribI1uiv");
			glVertexAttribI2uiv = provider.getFunctionAddress("glVertexAttribI2uiv");
			glVertexAttribI3uiv = provider.getFunctionAddress("glVertexAttribI3uiv");
			glVertexAttribI4uiv = provider.getFunctionAddress("glVertexAttribI4uiv");
			glVertexAttribI4bv = provider.getFunctionAddress("glVertexAttribI4bv");
			glVertexAttribI4sv = provider.getFunctionAddress("glVertexAttribI4sv");
			glVertexAttribI4ubv = provider.getFunctionAddress("glVertexAttribI4ubv");
			glVertexAttribI4usv = provider.getFunctionAddress("glVertexAttribI4usv");
			glVertexAttribIPointer = provider.getFunctionAddress("glVertexAttribIPointer");
			glGetVertexAttribIiv = provider.getFunctionAddress("glGetVertexAttribIiv");
			glGetVertexAttribIuiv = provider.getFunctionAddress("glGetVertexAttribIuiv");
			glUniform1ui = provider.getFunctionAddress("glUniform1ui");
			glUniform2ui = provider.getFunctionAddress("glUniform2ui");
			glUniform3ui = provider.getFunctionAddress("glUniform3ui");
			glUniform4ui = provider.getFunctionAddress("glUniform4ui");
			glUniform1uiv = provider.getFunctionAddress("glUniform1uiv");
			glUniform2uiv = provider.getFunctionAddress("glUniform2uiv");
			glUniform3uiv = provider.getFunctionAddress("glUniform3uiv");
			glUniform4uiv = provider.getFunctionAddress("glUniform4uiv");
			glGetUniformuiv = provider.getFunctionAddress("glGetUniformuiv");
			glBindFragDataLocation = provider.getFunctionAddress("glBindFragDataLocation");
			glGetFragDataLocation = provider.getFunctionAddress("glGetFragDataLocation");
			glBeginConditionalRender = provider.getFunctionAddress("glBeginConditionalRender");
			glEndConditionalRender = provider.getFunctionAddress("glEndConditionalRender");
			glMapBufferRange = provider.getFunctionAddress("glMapBufferRange");
			glFlushMappedBufferRange = provider.getFunctionAddress("glFlushMappedBufferRange");
			glClampColor = provider.getFunctionAddress("glClampColor");
			glIsRenderbuffer = provider.getFunctionAddress("glIsRenderbuffer");
			glBindRenderbuffer = provider.getFunctionAddress("glBindRenderbuffer");
			glDeleteRenderbuffers = provider.getFunctionAddress("glDeleteRenderbuffers");
			glGenRenderbuffers = provider.getFunctionAddress("glGenRenderbuffers");
			glRenderbufferStorage = provider.getFunctionAddress("glRenderbufferStorage");
			glRenderbufferStorageMultisample = provider.getFunctionAddress("glRenderbufferStorageMultisample");
			glGetRenderbufferParameteriv = provider.getFunctionAddress("glGetRenderbufferParameteriv");
			glIsFramebuffer = provider.getFunctionAddress("glIsFramebuffer");
			glBindFramebuffer = provider.getFunctionAddress("glBindFramebuffer");
			glDeleteFramebuffers = provider.getFunctionAddress("glDeleteFramebuffers");
			glGenFramebuffers = provider.getFunctionAddress("glGenFramebuffers");
			glCheckFramebufferStatus = provider.getFunctionAddress("glCheckFramebufferStatus");
			glFramebufferTexture1D = provider.getFunctionAddress("glFramebufferTexture1D");
			glFramebufferTexture2D = provider.getFunctionAddress("glFramebufferTexture2D");
			glFramebufferTexture3D = provider.getFunctionAddress("glFramebufferTexture3D");
			glFramebufferTextureLayer = provider.getFunctionAddress("glFramebufferTextureLayer");
			glFramebufferRenderbuffer = provider.getFunctionAddress("glFramebufferRenderbuffer");
			glGetFramebufferAttachmentParameteriv = provider.getFunctionAddress("glGetFramebufferAttachmentParameteriv");
			glBlitFramebuffer = provider.getFunctionAddress("glBlitFramebuffer");
			glGenerateMipmap = provider.getFunctionAddress("glGenerateMipmap");
			glTexParameterIiv = provider.getFunctionAddress("glTexParameterIiv");
			glTexParameterIuiv = provider.getFunctionAddress("glTexParameterIuiv");
			glGetTexParameterIiv = provider.getFunctionAddress("glGetTexParameterIiv");
			glGetTexParameterIuiv = provider.getFunctionAddress("glGetTexParameterIuiv");
			glColorMaski = provider.getFunctionAddress("glColorMaski");
			glGetBooleani_v = provider.getFunctionAddress("glGetBooleani_v");
			glGetIntegeri_v = provider.getFunctionAddress("glGetIntegeri_v");
			glEnablei = provider.getFunctionAddress("glEnablei");
			glDisablei = provider.getFunctionAddress("glDisablei");
			glIsEnabledi = provider.getFunctionAddress("glIsEnabledi");
			glBindBufferRange = provider.getFunctionAddress("glBindBufferRange");
			glBindBufferBase = provider.getFunctionAddress("glBindBufferBase");
			glBeginTransformFeedback = provider.getFunctionAddress("glBeginTransformFeedback");
			glEndTransformFeedback = provider.getFunctionAddress("glEndTransformFeedback");
			glTransformFeedbackVaryings = provider.getFunctionAddress("glTransformFeedbackVaryings");
			glGetTransformFeedbackVarying = provider.getFunctionAddress("glGetTransformFeedbackVarying");
			glBindVertexArray = provider.getFunctionAddress("glBindVertexArray");
			glDeleteVertexArrays = provider.getFunctionAddress("glDeleteVertexArrays");
			glGenVertexArrays = provider.getFunctionAddress("glGenVertexArrays");
			glIsVertexArray = provider.getFunctionAddress("glIsVertexArray");
		}

	}

}