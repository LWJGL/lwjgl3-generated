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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * The core OpenGL 3.0 functionality. OpenGL 3.0 implementations are guaranteed to support at least versions 1.10, 1.20 and 1.30 of the shading language,
 * although versions 1.10 and 1.20 are deprecated in a forward-compatible context.
 * 
 * <p>Extensions promoted to core in this release:
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/gpu_shader4.txt">EXT_gpu_shader4</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/NV/conditional_render.txt">NV_conditional_render</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/APPLE/flush_buffer_range.txt">APPLE_flush_buffer_range</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/color_buffer_float.txt">ARB_color_buffer_float</a>, <a href="http://www.opengl.org/registry/specs/NV/depth_buffer_float.txt">NV_depth_buffer_float</a>, <a href="http://www.opengl.org/registry/specs/ARB/texture_float.txt">ARB_texture_float</a>,
 * <a href="http://www.opengl.org/registry/specs/EXT/packed_float.txt">EXT_packed_float</a> and <a href="http://www.opengl.org/registry/specs/EXT/texture_shared_exponent.txt">EXT_texture_shared_exponent</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/framebuffer_object.txt">EXT_framebuffer_object</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/NV/half_float.txt">NV_half_float</a> and <a href="http://www.opengl.org/registry/specs/ARB/half_float_pixel.txt">ARB_half_float_pixel</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/framebuffer_multisample.txt">EXT_framebuffer_multisample</a> and <a href="http://www.opengl.org/registry/specs/EXT/framebuffer_blit.txt">EXT_framebuffer_blit</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/texture_integer.txt">EXT_texture_integer</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/texture_array.txt">EXT_texture_array</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/packed_depth_stencil.txt">EXT_packed_depth_stencil</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/draw_buffers2.txt">EXT_draw_buffers2</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/texture_compression_rgtc.txt">EXT_texture_compression_rgtc</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/transform_feedback.txt">EXT_transform_feedback</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/APPLE/vertex_array_object.txt">APPLE_vertex_array_object</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/framebuffer_sRGB.txt">EXT_framebuffer_sRGB</a></li>
 * </ul></p>
 */
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
	public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int
		GL_SAMPLER_1D_ARRAY              = 0x8DC0,
		GL_SAMPLER_2D_ARRAY              = 0x8DC1,
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
		GL_INT_SAMPLER_1D_ARRAY          = 0x8DCE,
		GL_INT_SAMPLER_2D_ARRAY          = 0x8DCF,
		GL_UNSIGNED_INT_SAMPLER_1D       = 0x8DD1,
		GL_UNSIGNED_INT_SAMPLER_2D       = 0x8DD2,
		GL_UNSIGNED_INT_SAMPLER_3D       = 0x8DD3,
		GL_UNSIGNED_INT_SAMPLER_CUBE     = 0x8DD4,
		GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6,
		GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;

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

	/** Accepted by the {@code target} parameter of ClampColor and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_CLAMP_VERTEX_COLOR   = 0x891A,
		GL_CLAMP_FRAGMENT_COLOR = 0x891B,
		GL_CLAMP_READ_COLOR     = 0x891C;

	/** Accepted by the {@code clamp} parameter of ClampColor. */
	public static final int GL_FIXED_ONLY = 0x891D;

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
	public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;

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
	public static final int GL_UNSIGNED_NORMALIZED = 0x8C17;

	/** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
	public static final int
		GL_RGBA32F = 0x8814,
		GL_RGB32F  = 0x8815,
		GL_RGBA16F = 0x881A,
		GL_RGB16F  = 0x881B;

	/** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage. */
	public static final int GL_R11F_G11F_B10F = 0x8C3A;

	/**
	 * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
	 * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
	 * GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
	 */
	public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;

	/** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage. */
	public static final int GL_RGB9_E5 = 0x8C3D;

	/**
	 * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
	 * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
	 * GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
	 */
	public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;

	/** Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv. */
	public static final int GL_TEXTURE_SHARED_SIZE = 0x8C3F;

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
	public static final int GL_RENDERBUFFER = 0x8D41;

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
		GL_COLOR_ATTACHMENT16       = 0x8CF0,
		GL_COLOR_ATTACHMENT17       = 0x8CF1,
		GL_COLOR_ATTACHMENT18       = 0x8CF2,
		GL_COLOR_ATTACHMENT19       = 0x8CF3,
		GL_COLOR_ATTACHMENT20       = 0x8CF4,
		GL_COLOR_ATTACHMENT21       = 0x8CF5,
		GL_COLOR_ATTACHMENT22       = 0x8CF6,
		GL_COLOR_ATTACHMENT23       = 0x8CF7,
		GL_COLOR_ATTACHMENT24       = 0x8CF8,
		GL_COLOR_ATTACHMENT25       = 0x8CF9,
		GL_COLOR_ATTACHMENT26       = 0x8CFA,
		GL_COLOR_ATTACHMENT27       = 0x8CFB,
		GL_COLOR_ATTACHMENT28       = 0x8CFC,
		GL_COLOR_ATTACHMENT29       = 0x8CFD,
		GL_COLOR_ATTACHMENT30       = 0x8CFE,
		GL_COLOR_ATTACHMENT31       = 0x8CFF,
		GL_DEPTH_ATTACHMENT         = 0x8D00,
		GL_STENCIL_ATTACHMENT       = 0x8D20,
		GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_MAX_SAMPLES = 0x8D57;

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
	public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x506;

	/**
	 * Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
	 * GetTexImage, by the {@code type} parameter of CopyPixels, by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D,
	 * CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
	 */
	public static final int GL_DEPTH_STENCIL = 0x84F9;

	/**
	 * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
	 * GetTexImage.
	 */
	public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;

	/**
	 * Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
	 * returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
	 */
	public static final int GL_DEPTH24_STENCIL8 = 0x88F0;

	/** Accepted by the {@code value} parameter of GetTexLevelParameter. */
	public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;

	/**
	 * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, GetTexImage, TexSubImage1D, TexSubImage2D,
	 * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter,
	 * ColorTable, ColorSubTable, and GetColorTable.
	 * 
	 * <p>Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, FogCoordPointer, TexCoordPointer, and
	 * VertexAttribPointer.</p>
	 */
	public static final int GL_HALF_FLOAT = 0x140B;

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
	public static final int GL_PROXY_TEXTURE_2D_ARRAY = 0x8C1B;

	/**
	 * Accepted by the {@code target} parameter of TexImage2D, TexSubImage2D, CopyTexImage2D, CopyTexSubImage2D, CompressedTexImage2D, and
	 * CompressedTexSubImage2D.
	 */
	public static final int GL_PROXY_TEXTURE_1D_ARRAY = 0x8C19;

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
	public static final int GL_RG_INTEGER = 0x8228;

	/**
	 * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
	 * BindBufferRange, BindBufferOffset and BindBufferBase.
	 */
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;

	/** Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v. */
	public static final int
		GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84,
		GL_TRANSFORM_FEEDBACK_BUFFER_SIZE  = 0x8C85;

	/**
	 * Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v, and by the {@code pname} parameter of GetBooleanv,
	 * GetDoublev, GetIntegerv, and GetFloatv.
	 */
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;

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
	public static final int GL_RASTERIZER_DISCARD = 0x8C89;

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
	public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int GL_FRAMEBUFFER_SRGB = 0x8DB9;

	/** Function address. */
	@JavadocExclude
	public final long
		GetStringi,
		ClearBufferiv,
		ClearBufferuiv,
		ClearBufferfv,
		ClearBufferfi,
		VertexAttribI1i,
		VertexAttribI2i,
		VertexAttribI3i,
		VertexAttribI4i,
		VertexAttribI1ui,
		VertexAttribI2ui,
		VertexAttribI3ui,
		VertexAttribI4ui,
		VertexAttribI1iv,
		VertexAttribI2iv,
		VertexAttribI3iv,
		VertexAttribI4iv,
		VertexAttribI1uiv,
		VertexAttribI2uiv,
		VertexAttribI3uiv,
		VertexAttribI4uiv,
		VertexAttribI4bv,
		VertexAttribI4sv,
		VertexAttribI4ubv,
		VertexAttribI4usv,
		VertexAttribIPointer,
		GetVertexAttribIiv,
		GetVertexAttribIuiv,
		Uniform1ui,
		Uniform2ui,
		Uniform3ui,
		Uniform4ui,
		Uniform1uiv,
		Uniform2uiv,
		Uniform3uiv,
		Uniform4uiv,
		GetUniformuiv,
		BindFragDataLocation,
		GetFragDataLocation,
		BeginConditionalRender,
		EndConditionalRender,
		MapBufferRange,
		FlushMappedBufferRange,
		ClampColor,
		IsRenderbuffer,
		BindRenderbuffer,
		DeleteRenderbuffers,
		GenRenderbuffers,
		RenderbufferStorage,
		RenderbufferStorageMultisample,
		GetRenderbufferParameteriv,
		IsFramebuffer,
		BindFramebuffer,
		DeleteFramebuffers,
		GenFramebuffers,
		CheckFramebufferStatus,
		FramebufferTexture1D,
		FramebufferTexture2D,
		FramebufferTexture3D,
		FramebufferTextureLayer,
		FramebufferRenderbuffer,
		GetFramebufferAttachmentParameteriv,
		BlitFramebuffer,
		GenerateMipmap,
		TexParameterIiv,
		TexParameterIuiv,
		GetTexParameterIiv,
		GetTexParameterIuiv,
		ColorMaski,
		GetBooleani_v,
		GetIntegeri_v,
		Enablei,
		Disablei,
		IsEnabledi,
		BindBufferRange,
		BindBufferBase,
		BeginTransformFeedback,
		EndTransformFeedback,
		TransformFeedbackVaryings,
		GetTransformFeedbackVarying,
		BindVertexArray,
		DeleteVertexArrays,
		GenVertexArrays,
		IsVertexArray;

	@JavadocExclude
	public GL30(FunctionProvider provider) {
		GetStringi = provider.getFunctionAddress("glGetStringi");
		ClearBufferiv = provider.getFunctionAddress("glClearBufferiv");
		ClearBufferuiv = provider.getFunctionAddress("glClearBufferuiv");
		ClearBufferfv = provider.getFunctionAddress("glClearBufferfv");
		ClearBufferfi = provider.getFunctionAddress("glClearBufferfi");
		VertexAttribI1i = provider.getFunctionAddress("glVertexAttribI1i");
		VertexAttribI2i = provider.getFunctionAddress("glVertexAttribI2i");
		VertexAttribI3i = provider.getFunctionAddress("glVertexAttribI3i");
		VertexAttribI4i = provider.getFunctionAddress("glVertexAttribI4i");
		VertexAttribI1ui = provider.getFunctionAddress("glVertexAttribI1ui");
		VertexAttribI2ui = provider.getFunctionAddress("glVertexAttribI2ui");
		VertexAttribI3ui = provider.getFunctionAddress("glVertexAttribI3ui");
		VertexAttribI4ui = provider.getFunctionAddress("glVertexAttribI4ui");
		VertexAttribI1iv = provider.getFunctionAddress("glVertexAttribI1iv");
		VertexAttribI2iv = provider.getFunctionAddress("glVertexAttribI2iv");
		VertexAttribI3iv = provider.getFunctionAddress("glVertexAttribI3iv");
		VertexAttribI4iv = provider.getFunctionAddress("glVertexAttribI4iv");
		VertexAttribI1uiv = provider.getFunctionAddress("glVertexAttribI1uiv");
		VertexAttribI2uiv = provider.getFunctionAddress("glVertexAttribI2uiv");
		VertexAttribI3uiv = provider.getFunctionAddress("glVertexAttribI3uiv");
		VertexAttribI4uiv = provider.getFunctionAddress("glVertexAttribI4uiv");
		VertexAttribI4bv = provider.getFunctionAddress("glVertexAttribI4bv");
		VertexAttribI4sv = provider.getFunctionAddress("glVertexAttribI4sv");
		VertexAttribI4ubv = provider.getFunctionAddress("glVertexAttribI4ubv");
		VertexAttribI4usv = provider.getFunctionAddress("glVertexAttribI4usv");
		VertexAttribIPointer = provider.getFunctionAddress("glVertexAttribIPointer");
		GetVertexAttribIiv = provider.getFunctionAddress("glGetVertexAttribIiv");
		GetVertexAttribIuiv = provider.getFunctionAddress("glGetVertexAttribIuiv");
		Uniform1ui = provider.getFunctionAddress("glUniform1ui");
		Uniform2ui = provider.getFunctionAddress("glUniform2ui");
		Uniform3ui = provider.getFunctionAddress("glUniform3ui");
		Uniform4ui = provider.getFunctionAddress("glUniform4ui");
		Uniform1uiv = provider.getFunctionAddress("glUniform1uiv");
		Uniform2uiv = provider.getFunctionAddress("glUniform2uiv");
		Uniform3uiv = provider.getFunctionAddress("glUniform3uiv");
		Uniform4uiv = provider.getFunctionAddress("glUniform4uiv");
		GetUniformuiv = provider.getFunctionAddress("glGetUniformuiv");
		BindFragDataLocation = provider.getFunctionAddress("glBindFragDataLocation");
		GetFragDataLocation = provider.getFunctionAddress("glGetFragDataLocation");
		BeginConditionalRender = provider.getFunctionAddress("glBeginConditionalRender");
		EndConditionalRender = provider.getFunctionAddress("glEndConditionalRender");
		MapBufferRange = provider.getFunctionAddress("glMapBufferRange");
		FlushMappedBufferRange = provider.getFunctionAddress("glFlushMappedBufferRange");
		ClampColor = provider.getFunctionAddress("glClampColor");
		IsRenderbuffer = provider.getFunctionAddress("glIsRenderbuffer");
		BindRenderbuffer = provider.getFunctionAddress("glBindRenderbuffer");
		DeleteRenderbuffers = provider.getFunctionAddress("glDeleteRenderbuffers");
		GenRenderbuffers = provider.getFunctionAddress("glGenRenderbuffers");
		RenderbufferStorage = provider.getFunctionAddress("glRenderbufferStorage");
		RenderbufferStorageMultisample = provider.getFunctionAddress("glRenderbufferStorageMultisample");
		GetRenderbufferParameteriv = provider.getFunctionAddress("glGetRenderbufferParameteriv");
		IsFramebuffer = provider.getFunctionAddress("glIsFramebuffer");
		BindFramebuffer = provider.getFunctionAddress("glBindFramebuffer");
		DeleteFramebuffers = provider.getFunctionAddress("glDeleteFramebuffers");
		GenFramebuffers = provider.getFunctionAddress("glGenFramebuffers");
		CheckFramebufferStatus = provider.getFunctionAddress("glCheckFramebufferStatus");
		FramebufferTexture1D = provider.getFunctionAddress("glFramebufferTexture1D");
		FramebufferTexture2D = provider.getFunctionAddress("glFramebufferTexture2D");
		FramebufferTexture3D = provider.getFunctionAddress("glFramebufferTexture3D");
		FramebufferTextureLayer = provider.getFunctionAddress("glFramebufferTextureLayer");
		FramebufferRenderbuffer = provider.getFunctionAddress("glFramebufferRenderbuffer");
		GetFramebufferAttachmentParameteriv = provider.getFunctionAddress("glGetFramebufferAttachmentParameteriv");
		BlitFramebuffer = provider.getFunctionAddress("glBlitFramebuffer");
		GenerateMipmap = provider.getFunctionAddress("glGenerateMipmap");
		TexParameterIiv = provider.getFunctionAddress("glTexParameterIiv");
		TexParameterIuiv = provider.getFunctionAddress("glTexParameterIuiv");
		GetTexParameterIiv = provider.getFunctionAddress("glGetTexParameterIiv");
		GetTexParameterIuiv = provider.getFunctionAddress("glGetTexParameterIuiv");
		ColorMaski = provider.getFunctionAddress("glColorMaski");
		GetBooleani_v = provider.getFunctionAddress("glGetBooleani_v");
		GetIntegeri_v = provider.getFunctionAddress("glGetIntegeri_v");
		Enablei = provider.getFunctionAddress("glEnablei");
		Disablei = provider.getFunctionAddress("glDisablei");
		IsEnabledi = provider.getFunctionAddress("glIsEnabledi");
		BindBufferRange = provider.getFunctionAddress("glBindBufferRange");
		BindBufferBase = provider.getFunctionAddress("glBindBufferBase");
		BeginTransformFeedback = provider.getFunctionAddress("glBeginTransformFeedback");
		EndTransformFeedback = provider.getFunctionAddress("glEndTransformFeedback");
		TransformFeedbackVaryings = provider.getFunctionAddress("glTransformFeedbackVaryings");
		GetTransformFeedbackVarying = provider.getFunctionAddress("glGetTransformFeedbackVarying");
		BindVertexArray = provider.getFunctionAddress("glBindVertexArray");
		DeleteVertexArrays = provider.getFunctionAddress("glDeleteVertexArrays");
		GenVertexArrays = provider.getFunctionAddress("glGenVertexArrays");
		IsVertexArray = provider.getFunctionAddress("glIsVertexArray");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL30} instance for the current context. */
	public static GL30 getInstance() {
		return checkFunctionality(GL.getCapabilities().__GL30);
	}

	static GL30 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL30") ) return null;

		GL30 funcs = new GL30(provider);

		boolean supported = checkFunctions(
			funcs.GetStringi, funcs.ClearBufferiv, funcs.ClearBufferuiv, funcs.ClearBufferfv, funcs.ClearBufferfi, funcs.VertexAttribI1i, funcs.VertexAttribI2i, 
			funcs.VertexAttribI3i, funcs.VertexAttribI4i, funcs.VertexAttribI1ui, funcs.VertexAttribI2ui, funcs.VertexAttribI3ui, funcs.VertexAttribI4ui, 
			funcs.VertexAttribI1iv, funcs.VertexAttribI2iv, funcs.VertexAttribI3iv, funcs.VertexAttribI4iv, funcs.VertexAttribI1uiv, funcs.VertexAttribI2uiv, 
			funcs.VertexAttribI3uiv, funcs.VertexAttribI4uiv, funcs.VertexAttribI4bv, funcs.VertexAttribI4sv, funcs.VertexAttribI4ubv, funcs.VertexAttribI4usv, 
			funcs.VertexAttribIPointer, funcs.GetVertexAttribIiv, funcs.GetVertexAttribIuiv, funcs.Uniform1ui, funcs.Uniform2ui, funcs.Uniform3ui, 
			funcs.Uniform4ui, funcs.Uniform1uiv, funcs.Uniform2uiv, funcs.Uniform3uiv, funcs.Uniform4uiv, funcs.GetUniformuiv, funcs.BindFragDataLocation, 
			funcs.GetFragDataLocation, funcs.BeginConditionalRender, funcs.EndConditionalRender, funcs.MapBufferRange, funcs.FlushMappedBufferRange, 
			funcs.ClampColor, funcs.IsRenderbuffer, funcs.BindRenderbuffer, funcs.DeleteRenderbuffers, funcs.GenRenderbuffers, funcs.RenderbufferStorage, 
			funcs.RenderbufferStorageMultisample, funcs.GetRenderbufferParameteriv, funcs.IsFramebuffer, funcs.BindFramebuffer, funcs.DeleteFramebuffers, 
			funcs.GenFramebuffers, funcs.CheckFramebufferStatus, funcs.FramebufferTexture1D, funcs.FramebufferTexture2D, funcs.FramebufferTexture3D, 
			funcs.FramebufferTextureLayer, funcs.FramebufferRenderbuffer, funcs.GetFramebufferAttachmentParameteriv, funcs.BlitFramebuffer, 
			funcs.GenerateMipmap, funcs.TexParameterIiv, funcs.TexParameterIuiv, funcs.GetTexParameterIiv, funcs.GetTexParameterIuiv, funcs.ColorMaski, 
			funcs.GetBooleani_v, funcs.GetIntegeri_v, funcs.Enablei, funcs.Disablei, funcs.IsEnabledi, funcs.BindBufferRange, funcs.BindBufferBase, 
			funcs.BeginTransformFeedback, funcs.EndTransformFeedback, funcs.TransformFeedbackVaryings, funcs.GetTransformFeedbackVarying, funcs.BindVertexArray, 
			funcs.DeleteVertexArrays, funcs.GenVertexArrays, funcs.IsVertexArray
		);

		return GL.checkExtension("OpenGL30", funcs, supported);
	}

	// --- [ glGetStringi ] ---

	/** Unsafe version of {@link #glGetStringi GetStringi} */
	@JavadocExclude
	public static long nglGetStringi(int name, int index) {
		long __functionAddress = getInstance().GetStringi;
		return callIIP(__functionAddress, name, index);
	}

	/**
	 * Queries indexed string state.
	 *
	 * @param name  the indexed state to query. One of:<br>{@link GL11#GL_EXTENSIONS EXTENSIONS}, {@link GL20#GL_SHADING_LANGUAGE_VERSION SHADING_LANGUAGE_VERSION}
	 * @param index the index of the particular element being queried
	 */
	public static String glGetStringi(int name, int index) {
		long __result = nglGetStringi(name, index);
		return memDecodeUTF8(__result);
	}

	// --- [ glClearBufferiv ] ---

	/** Unsafe version of {@link #glClearBufferiv ClearBufferiv} */
	@JavadocExclude
	public static void nglClearBufferiv(int buffer, int drawbuffer, long value) {
		long __functionAddress = getInstance().ClearBufferiv;
		callIIPV(__functionAddress, buffer, drawbuffer, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Clears an individual buffer of the currently bound framebuffer object to the {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.
	 *
	 * @param buffer     the buffer to clear. One of:<br>{@link GL11#GL_COLOR COLOR}, {@link GL11#GL_STENCIL STENCIL}
	 * @param drawbuffer the draw buffer to clear
	 * @param value      for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For stencil buffers, a pointer to a
	 *                   single stencil value to clear the buffer to.
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Clears an individual buffer of the currently bound framebuffer object to the {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.
	 *
	 * @param buffer     the buffer to clear. Must be:<br>{@link GL11#GL_COLOR COLOR}
	 * @param drawbuffer the draw buffer to clear
	 * @param value      a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to
	 */
	public static void glClearBufferuiv(int buffer, int drawbuffer, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 4 << 2);
		nglClearBufferuiv(buffer, drawbuffer, memAddress(value));
	}

	/** Alternative version of: {@link #glClearBufferuiv ClearBufferuiv} */
	public static void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 4);
		nglClearBufferuiv(buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearBufferfv ] ---

	/** Unsafe version of {@link #glClearBufferfv ClearBufferfv} */
	@JavadocExclude
	public static void nglClearBufferfv(int buffer, int drawbuffer, long value) {
		long __functionAddress = getInstance().ClearBufferfv;
		callIIPV(__functionAddress, buffer, drawbuffer, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Clears an individual buffer of the currently bound framebuffer object to the {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.
	 *
	 * @param buffer     the buffer to clear. One of:<br>{@link GL11#GL_COLOR COLOR}, {@link GL11#GL_DEPTH DEPTH}
	 * @param drawbuffer the draw buffer to clear
	 * @param value      for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For depth buffers, a pointer to a
	 *                   single depth value to clear the buffer to.
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearBufferfi.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Clears an individual buffer of the currently bound framebuffer object to the {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.
	 *
	 * @param buffer     the buffer to clear. Must be:<br>{@link #GL_DEPTH_STENCIL DEPTH_STENCIL}
	 * @param drawbuffer the draw buffer to clear
	 * @param depth      the depth value to clear the buffer to
	 * @param stencil    the stencil value to clear the buffer to
	 */
	public static void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
		long __functionAddress = getInstance().ClearBufferfi;
		callIIFIV(__functionAddress, buffer, drawbuffer, depth, stencil);
	}

	// --- [ glVertexAttribI1i ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI1i.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 */
	public static void glVertexAttribI1i(int index, int x) {
		long __functionAddress = getInstance().VertexAttribI1i;
		callIIV(__functionAddress, index, x);
	}

	// --- [ glVertexAttribI2i ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI2i.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 */
	public static void glVertexAttribI2i(int index, int x, int y) {
		long __functionAddress = getInstance().VertexAttribI2i;
		callIIIV(__functionAddress, index, x, y);
	}

	// --- [ glVertexAttribI3i ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI3i.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a pure integer generic vertex attribute. The w component is implicitly set to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 */
	public static void glVertexAttribI3i(int index, int x, int y, int z) {
		long __functionAddress = getInstance().VertexAttribI3i;
		callIIIIV(__functionAddress, index, x, y, z);
	}

	// --- [ glVertexAttribI4i ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI4i.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a pure integer generic vertex attribute.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 * @param w     the vertex attribute w component
	 */
	public static void glVertexAttribI4i(int index, int x, int y, int z, int w) {
		long __functionAddress = getInstance().VertexAttribI4i;
		callIIIIIV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribI1ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI1ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of an unsigned pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 */
	public static void glVertexAttribI1ui(int index, int x) {
		long __functionAddress = getInstance().VertexAttribI1ui;
		callIIV(__functionAddress, index, x);
	}

	// --- [ glVertexAttribI2ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI2ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of an unsigned pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 */
	public static void glVertexAttribI2ui(int index, int x, int y) {
		long __functionAddress = getInstance().VertexAttribI2ui;
		callIIIV(__functionAddress, index, x, y);
	}

	// --- [ glVertexAttribI3ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI3ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of an unsigned pure integer generic vertex attribute. The w component is implicitly set to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 */
	public static void glVertexAttribI3ui(int index, int x, int y, int z) {
		long __functionAddress = getInstance().VertexAttribI3ui;
		callIIIIV(__functionAddress, index, x, y, z);
	}

	// --- [ glVertexAttribI4ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI4ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of an unsigned pure integer generic vertex attribute.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 * @param w     the vertex attribute w component
	 */
	public static void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
		long __functionAddress = getInstance().VertexAttribI4ui;
		callIIIIIV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribI1iv ] ---

	/** Unsafe version of {@link #glVertexAttribI1iv VertexAttribI1iv} */
	@JavadocExclude
	public static void nglVertexAttribI1iv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI1iv;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI1.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribI1i VertexAttribI1i}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI1iv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 2);
		nglVertexAttribI1iv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI1iv VertexAttribI1iv} */
	public static void glVertexAttribI1iv(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglVertexAttribI1iv(index, memAddress(v));
	}

	// --- [ glVertexAttribI2iv ] ---

	/** Unsafe version of {@link #glVertexAttribI2iv VertexAttribI2iv} */
	@JavadocExclude
	public static void nglVertexAttribI2iv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI2iv;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribI2i VertexAttribI2i}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI2iv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 2);
		nglVertexAttribI2iv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI2iv VertexAttribI2iv} */
	public static void glVertexAttribI2iv(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertexAttribI2iv(index, memAddress(v));
	}

	// --- [ glVertexAttribI3iv ] ---

	/** Unsafe version of {@link #glVertexAttribI3iv VertexAttribI3iv} */
	@JavadocExclude
	public static void nglVertexAttribI3iv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI3iv;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribI3i VertexAttribI3i}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI3iv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglVertexAttribI3iv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI3iv VertexAttribI3iv} */
	public static void glVertexAttribI3iv(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertexAttribI3iv(index, memAddress(v));
	}

	// --- [ glVertexAttribI4iv ] ---

	/** Unsafe version of {@link #glVertexAttribI4iv VertexAttribI4iv} */
	@JavadocExclude
	public static void nglVertexAttribI4iv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4iv;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribI4i VertexAttribI4i}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
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

	// --- [ glVertexAttribI1uiv ] ---

	/** Unsafe version of {@link #glVertexAttribI1uiv VertexAttribI1uiv} */
	@JavadocExclude
	public static void nglVertexAttribI1uiv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI1uiv;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI1.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribI1ui VertexAttribI1ui}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI1uiv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 2);
		nglVertexAttribI1uiv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI1uiv VertexAttribI1uiv} */
	public static void glVertexAttribI1uiv(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglVertexAttribI1uiv(index, memAddress(v));
	}

	// --- [ glVertexAttribI2uiv ] ---

	/** Unsafe version of {@link #glVertexAttribI2uiv VertexAttribI2uiv} */
	@JavadocExclude
	public static void nglVertexAttribI2uiv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI2uiv;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribI2ui VertexAttribI2ui}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI2uiv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 2);
		nglVertexAttribI2uiv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI2uiv VertexAttribI2uiv} */
	public static void glVertexAttribI2uiv(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertexAttribI2uiv(index, memAddress(v));
	}

	// --- [ glVertexAttribI3uiv ] ---

	/** Unsafe version of {@link #glVertexAttribI3uiv VertexAttribI3uiv} */
	@JavadocExclude
	public static void nglVertexAttribI3uiv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI3uiv;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribI3ui VertexAttribI3ui}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI3uiv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglVertexAttribI3uiv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI3uiv VertexAttribI3uiv} */
	public static void glVertexAttribI3uiv(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertexAttribI3uiv(index, memAddress(v));
	}

	// --- [ glVertexAttribI4uiv ] ---

	/** Unsafe version of {@link #glVertexAttribI4uiv VertexAttribI4uiv} */
	@JavadocExclude
	public static void nglVertexAttribI4uiv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4uiv;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribI4ui VertexAttribI4ui}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
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

	// --- [ glVertexAttribI4bv ] ---

	/** Unsafe version of {@link #glVertexAttribI4bv VertexAttribI4bv} */
	@JavadocExclude
	public static void nglVertexAttribI4bv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4bv;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI4b.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Byte version of {@link #glVertexAttribI4iv VertexAttribI4iv}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4bv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4bv(index, memAddress(v));
	}

	// --- [ glVertexAttribI4sv ] ---

	/** Unsafe version of {@link #glVertexAttribI4sv VertexAttribI4sv} */
	@JavadocExclude
	public static void nglVertexAttribI4sv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4sv;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Short version of {@link #glVertexAttribI4iv VertexAttribI4iv}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4sv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertexAttribI4sv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI4sv VertexAttribI4sv} */
	public static void glVertexAttribI4sv(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4sv(index, memAddress(v));
	}

	// --- [ glVertexAttribI4ubv ] ---

	/** Unsafe version of {@link #glVertexAttribI4ubv VertexAttribI4ubv} */
	@JavadocExclude
	public static void nglVertexAttribI4ubv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4ubv;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI4ub.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Byte version of {@link #glVertexAttribI4uiv VertexAttribI4uiv}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4ubv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4ubv(index, memAddress(v));
	}

	// --- [ glVertexAttribI4usv ] ---

	/** Unsafe version of {@link #glVertexAttribI4usv VertexAttribI4usv} */
	@JavadocExclude
	public static void nglVertexAttribI4usv(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4usv;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribI4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Short version of {@link #glVertexAttribI4uiv VertexAttribI4uiv}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4usv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertexAttribI4usv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI4usv VertexAttribI4usv} */
	public static void glVertexAttribI4usv(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4usv(index, memAddress(v));
	}

	// --- [ glVertexAttribIPointer ] ---

	/** Unsafe version of {@link #glVertexAttribIPointer VertexAttribIPointer} */
	@JavadocExclude
	public static void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
		long __functionAddress = getInstance().VertexAttribIPointer;
		callIIIIPV(__functionAddress, index, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribIPointer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the location and organization of a pure integer vertex attribute array.
	 *
	 * @param index   the index of the pure integer generic vertex attribute to be modified
	 * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type    the data type of each component in the array. One of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                the array. The initial value is 0.
	 * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glVertexAttribIPointer VertexAttribIPointer} */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglVertexAttribIPointer(index, size, type, stride, pointerOffset);
	}

	/** ShortBuffer version of: {@link #glVertexAttribIPointer VertexAttribIPointer} */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
	}

	/** IntBuffer version of: {@link #glVertexAttribIPointer VertexAttribIPointer} */
	public static void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
	}

	// --- [ glGetVertexAttribIiv ] ---

	/** Unsafe version of {@link #glGetVertexAttribIiv GetVertexAttribIiv} */
	@JavadocExclude
	public static void nglGetVertexAttribIiv(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribIiv;
		callIIPV(__functionAddress, index, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexAttribI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the value of a pure integer generic vertex attribute parameter.
	 *
	 * @param index  the index of the pure integer generic vertex attribute to be modified
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried. Must be:<br>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribIiv(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetVertexAttribIiv(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribIiv GetVertexAttribIiv} */
	public static void glGetVertexAttribIiv(int index, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexAttribI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned version of {@link #glGetVertexAttribIiv GetVertexAttribIiv}.
	 *
	 * @param index  the index of the pure integer generic vertex attribute to be modified
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried. Must be:<br>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribIuiv(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetVertexAttribIuiv(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribIuiv GetVertexAttribIuiv} */
	public static void glGetVertexAttribIuiv(int index, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribIuiv(index, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetVertexAttribIuiv GetVertexAttribIuiv} */
	public static int glGetVertexAttribIui(int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetVertexAttribIuiv(index, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glUniform1ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform1ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a uint uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform value
	 */
	public static void glUniform1ui(int location, int v0) {
		long __functionAddress = getInstance().Uniform1ui;
		callIIV(__functionAddress, location, v0);
	}

	// --- [ glUniform2ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform2ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a uvec2 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 */
	public static void glUniform2ui(int location, int v0, int v1) {
		long __functionAddress = getInstance().Uniform2ui;
		callIIIV(__functionAddress, location, v0, v1);
	}

	// --- [ glUniform3ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform3ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a uvec3 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 */
	public static void glUniform3ui(int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().Uniform3ui;
		callIIIIV(__functionAddress, location, v0, v1, v2);
	}

	// --- [ glUniform4ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform4ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a uvec4 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 * @param v3       the uniform w value
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform1.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single uint uniform variable or a uint uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single uvec2 uniform variable or a uvec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single uvec3 uniform variable or a uvec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniform4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single uvec4 uniform variable or a uvec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform4uiv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglUniform4uiv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4uiv Uniform4uiv} */
	public static void glUniform4uiv(int location, IntBuffer value) {
		nglUniform4uiv(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glGetUniformuiv ] ---

	/** Unsafe version of {@link #glGetUniformuiv GetUniformuiv} */
	@JavadocExclude
	public static void nglGetUniformuiv(int program, int location, long params) {
		long __functionAddress = getInstance().GetUniformuiv;
		callIIPV(__functionAddress, program, location, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the uint value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
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

	// --- [ glBindFragDataLocation ] ---

	/** Unsafe version of {@link #glBindFragDataLocation BindFragDataLocation} */
	@JavadocExclude
	public static void nglBindFragDataLocation(int program, int colorNumber, long name) {
		long __functionAddress = getInstance().BindFragDataLocation;
		callIIPV(__functionAddress, program, colorNumber, name);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindFragDataLocation.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a user-defined varying out variable to a fragment shader color number.
	 *
	 * @param program     the name of the program containing varying out variable whose binding to modify
	 * @param colorNumber the color number to bind the user-defined varying out variable to
	 * @param name        the name of the user-defined varying out variable whose binding to modify
	 */
	public static void glBindFragDataLocation(int program, int colorNumber, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		nglBindFragDataLocation(program, colorNumber, memAddress(name));
	}

	/** CharSequence version of: {@link #glBindFragDataLocation BindFragDataLocation} */
	public static void glBindFragDataLocation(int program, int colorNumber, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		nglBindFragDataLocation(program, colorNumber, __buffer.address(nameEncoded));
	}

	// --- [ glGetFragDataLocation ] ---

	/** Unsafe version of {@link #glGetFragDataLocation GetFragDataLocation} */
	@JavadocExclude
	public static int nglGetFragDataLocation(int program, long name) {
		long __functionAddress = getInstance().GetFragDataLocation;
		return callIPI(__functionAddress, program, name);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetFragDataLocation.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the bindings of color numbers to user-defined varying out variables.
	 *
	 * @param program the name of the program containing varying out variable whose binding to query
	 * @param name    the name of the user-defined varying out variable whose binding to query
	 */
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

	// --- [ glBeginConditionalRender ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBeginConditionalRender.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Starts conditional rendering.
	 *
	 * @param id   the name of an occlusion query object whose results are used to determine if the rendering commands are discarded
	 * @param mode how {@code glBeginConditionalRender} interprets the results of the occlusion query. One of:<br>{@link #GL_QUERY_WAIT QUERY_WAIT}, {@link #GL_QUERY_NO_WAIT QUERY_NO_WAIT}, {@link #GL_QUERY_BY_REGION_WAIT QUERY_BY_REGION_WAIT}, {@link #GL_QUERY_BY_REGION_NO_WAIT QUERY_BY_REGION_NO_WAIT}, {@link GL45#GL_QUERY_WAIT_INVERTED QUERY_WAIT_INVERTED}, {@link GL45#GL_QUERY_NO_WAIT_INVERTED QUERY_NO_WAIT_INVERTED}, {@link GL45#GL_QUERY_BY_REGION_WAIT_INVERTED QUERY_BY_REGION_WAIT_INVERTED}, {@link GL45#GL_QUERY_BY_REGION_NO_WAIT_INVERTED QUERY_BY_REGION_NO_WAIT_INVERTED}
	 */
	public static void glBeginConditionalRender(int id, int mode) {
		long __functionAddress = getInstance().BeginConditionalRender;
		callIIV(__functionAddress, id, mode);
	}

	// --- [ glEndConditionalRender ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBeginConditionalRender.xhtml">OpenGL SDK Reference</a></p>
	 * 
Ends conditional rendering.
	 */
	public static void glEndConditionalRender() {
		long __functionAddress = getInstance().EndConditionalRender;
		callV(__functionAddress);
	}

	// --- [ glMapBufferRange ] ---

	/** Unsafe version of {@link #glMapBufferRange MapBufferRange} */
	@JavadocExclude
	public static long nglMapBufferRange(int target, long offset, long length, int access) {
		long __functionAddress = getInstance().MapBufferRange;
		return callIPPIP(__functionAddress, target, offset, length, access);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMapBufferRange.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Maps a section of a buffer object's data store.
	 * 
	 * <p><b>LWJGL note</b>: This method comes in 2 flavors:
	 * <ol>
	 * <li>{@link #glMapBufferRange(int, long, long, int)} - Always returns a new ByteBuffer instance.</li>
	 * <li>{@link #glMapBufferRange(int, long, long, int, ByteBuffer)} - The {@code old_buffer} parameter is reused if not null.</li>
	 * </ol></p>
	 *
	 * @param target a binding to which the target buffer is bound. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link #GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param offset the starting offset within the buffer of the range to be mapped
	 * @param length the length of the range to be mapped
	 * @param access a combination of access flags indicating the desired access to the range. One or more of:<br>{@link #GL_MAP_READ_BIT MAP_READ_BIT}, {@link #GL_MAP_WRITE_BIT MAP_WRITE_BIT}, {@link #GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}, {@link #GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}, {@link #GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}, {@link #GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glFlushMappedBufferRange.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Indicates modifications to a range of a mapped buffer.
	 *
	 * @param target the target of the flush operation. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link #GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param offset the start of the buffer subrange, in basic machine units
	 * @param length the length of the buffer subrange, in basic machine units
	 */
	public static void glFlushMappedBufferRange(int target, long offset, long length) {
		long __functionAddress = getInstance().FlushMappedBufferRange;
		callIPPV(__functionAddress, target, offset, length);
	}

	// --- [ glClampColor ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClampColor.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Controls color clamping.
	 *
	 * @param target target for color clamping. One of:<br>{@link #GL_CLAMP_VERTEX_COLOR CLAMP_VERTEX_COLOR}, {@link #GL_CLAMP_FRAGMENT_COLOR CLAMP_FRAGMENT_COLOR}, {@link #GL_CLAMP_READ_COLOR CLAMP_READ_COLOR}
	 * @param clamp  whether to apply color clamping. One of:<br>{@link GL11#GL_TRUE TRUE}, {@link GL11#GL_FALSE FALSE}, {@link #GL_FIXED_ONLY FIXED_ONLY}
	 */
	public static void glClampColor(int target, int clamp) {
		long __functionAddress = getInstance().ClampColor;
		callIIV(__functionAddress, target, clamp);
	}

	// --- [ glIsRenderbuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsRenderbuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Determines if a name corresponds to a renderbuffer object.
	 *
	 * @param renderbuffer a value that may be the name of a renderbuffer object
	 */
	public static boolean glIsRenderbuffer(int renderbuffer) {
		long __functionAddress = getInstance().IsRenderbuffer;
		return callIZ(__functionAddress, renderbuffer);
	}

	// --- [ glBindRenderbuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindRenderbuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a renderbuffer to a renderbuffer target.
	 *
	 * @param target       the renderbuffer target of the binding operation. Must be:<br>{@link #GL_RENDERBUFFER RENDERBUFFER}
	 * @param renderbuffer the name of the renderbuffer object to bind
	 */
	public static void glBindRenderbuffer(int target, int renderbuffer) {
		long __functionAddress = getInstance().BindRenderbuffer;
		callIIV(__functionAddress, target, renderbuffer);
	}

	// --- [ glDeleteRenderbuffers ] ---

	/** Unsafe version of {@link #glDeleteRenderbuffers DeleteRenderbuffers} */
	@JavadocExclude
	public static void nglDeleteRenderbuffers(int n, long renderbuffers) {
		long __functionAddress = getInstance().DeleteRenderbuffers;
		callIPV(__functionAddress, n, renderbuffers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteRenderbuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes renderbuffer objects.
	 *
	 * @param n             the number of renderbuffer objects to be deleted
	 * @param renderbuffers an array containing {@code n} renderbuffer objects to be deleted
	 */
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

	// --- [ glGenRenderbuffers ] ---

	/** Unsafe version of {@link #glGenRenderbuffers GenRenderbuffers} */
	@JavadocExclude
	public static void nglGenRenderbuffers(int n, long renderbuffers) {
		long __functionAddress = getInstance().GenRenderbuffers;
		callIPV(__functionAddress, n, renderbuffers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenRenderbuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Generates renderbuffer object names.
	 *
	 * @param n             the number of renderbuffer object names to generate
	 * @param renderbuffers a buffer in which the generated renderbuffer object names are stored
	 */
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

	// --- [ glRenderbufferStorage ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glRenderbufferStorage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Establishes data storage, format and dimensions of a renderbuffer object's image.
	 *
	 * @param target         the target of the allocation. Must be:<br>{@link #GL_RENDERBUFFER RENDERBUFFER}
	 * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
	 * @param width          the width of the renderbuffer, in pixels
	 * @param height         the height of the renderbuffer, in pixels
	 */
	public static void glRenderbufferStorage(int target, int internalformat, int width, int height) {
		long __functionAddress = getInstance().RenderbufferStorage;
		callIIIIV(__functionAddress, target, internalformat, width, height);
	}

	// --- [ glRenderbufferStorageMultisample ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glRenderbufferStorageMultisample.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Establishes data storage, format, dimensions and sample count of a renderbuffer object's image.
	 * 
	 * <p>{@link #glRenderbufferStorage RenderbufferStorage} is equivalent to calling this method with the samples set to zero.</p>
	 *
	 * @param target         the target of the allocation. Must be:<br>{@link #GL_RENDERBUFFER RENDERBUFFER}
	 * @param samples        the number of samples to be used for the renderbuffer object's storage
	 * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
	 * @param width          the width of the renderbuffer, in pixels
	 * @param height         the height of the renderbuffer, in pixels
	 */
	public static void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
		long __functionAddress = getInstance().RenderbufferStorageMultisample;
		callIIIIIV(__functionAddress, target, samples, internalformat, width, height);
	}

	// --- [ glGetRenderbufferParameteriv ] ---

	/** Unsafe version of {@link #glGetRenderbufferParameteriv GetRenderbufferParameteriv} */
	@JavadocExclude
	public static void nglGetRenderbufferParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetRenderbufferParameteriv;
		callIIPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetRenderbufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves information about a bound renderbuffer object.
	 *
	 * @param target the target of the query operation. Must be:<br>{@link #GL_RENDERBUFFER RENDERBUFFER}
	 * @param pname  the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br>{@link #GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}, {@link #GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}, {@link #GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}, {@link #GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}, {@link #GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}, {@link #GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}, {@link #GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}, {@link #GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}, {@link #GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}, {@link #GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}
	 * @param params an array to receive the value of the queried parameter
	 */
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

	// --- [ glIsFramebuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Determines if a name corresponds to a framebuffer object.
	 *
	 * @param framebuffer a value that may be the name of a framebuffer object
	 */
	public static boolean glIsFramebuffer(int framebuffer) {
		long __functionAddress = getInstance().IsFramebuffer;
		return callIZ(__functionAddress, framebuffer);
	}

	// --- [ glBindFramebuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a framebuffer to a framebuffer target.
	 *
	 * @param target      the framebuffer target of the binding operation. One of:<br>{@link #GL_FRAMEBUFFER FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}
	 * @param framebuffer the name of the framebuffer object to bind
	 */
	public static void glBindFramebuffer(int target, int framebuffer) {
		long __functionAddress = getInstance().BindFramebuffer;
		callIIV(__functionAddress, target, framebuffer);
	}

	// --- [ glDeleteFramebuffers ] ---

	/** Unsafe version of {@link #glDeleteFramebuffers DeleteFramebuffers} */
	@JavadocExclude
	public static void nglDeleteFramebuffers(int n, long framebuffers) {
		long __functionAddress = getInstance().DeleteFramebuffers;
		callIPV(__functionAddress, n, framebuffers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteFramebuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes framebuffer objects.
	 *
	 * @param n            the number of framebuffer objects to be deleted
	 * @param framebuffers an array containing {@code n} framebuffer objects to be deleted
	 */
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

	// --- [ glGenFramebuffers ] ---

	/** Unsafe version of {@link #glGenFramebuffers GenFramebuffers} */
	@JavadocExclude
	public static void nglGenFramebuffers(int n, long framebuffers) {
		long __functionAddress = getInstance().GenFramebuffers;
		callIPV(__functionAddress, n, framebuffers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenFramebuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Generates framebuffer object names.
	 *
	 * @param n            the number of framebuffer object names to generate
	 * @param framebuffers a buffer in which the generated framebuffer object names are stored
	 */
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

	// --- [ glCheckFramebufferStatus ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCheckFramebufferStatus.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Checks the completeness status of a framebuffer.
	 *
	 * @param target the target of the framebuffer completeness check. One of:<br>{@link #GL_FRAMEBUFFER FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}
	 */
	public static int glCheckFramebufferStatus(int target) {
		long __functionAddress = getInstance().CheckFramebufferStatus;
		return callII(__functionAddress, target);
	}

	// --- [ glFramebufferTexture1D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glFramebufferTexture1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Attaches a level of a 1D texture object as a logical buffer to the currently bound framebuffer object.
	 *
	 * @param target     the framebuffer target. One of:<br>{@link #GL_FRAMEBUFFER FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}
	 * @param attachment the attachment point of the framebuffer. One of:<br>{@link #GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, {@link #GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}, {@link #GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}, {@link #GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}, {@link #GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}, {@link #GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}, {@link #GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}, {@link #GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}, {@link #GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}, {@link #GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}, {@link #GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}, {@link #GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}, {@link #GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}, {@link #GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}, {@link #GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}, {@link #GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}, {@link #GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}, {@link #GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}, {@link #GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}, {@link #GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}, {@link #GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}, {@link #GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}, {@link #GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}, {@link #GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}, {@link #GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}, {@link #GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}, {@link #GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}, {@link #GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}, {@link #GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}, {@link #GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}, {@link #GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}, {@link #GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}, {@link #GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}, {@link #GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}, {@link #GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}
	 * @param textarget  the type of texture
	 * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level      the mipmap level of {@code texture} to attach
	 */
	public static void glFramebufferTexture1D(int target, int attachment, int textarget, int texture, int level) {
		long __functionAddress = getInstance().FramebufferTexture1D;
		callIIIIIV(__functionAddress, target, attachment, textarget, texture, level);
	}

	// --- [ glFramebufferTexture2D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glFramebufferTexture2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Attaches a level of a 2D texture object as a logical buffer to the currently bound framebuffer object.
	 *
	 * @param target     the framebuffer target. One of:<br>{@link #GL_FRAMEBUFFER FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}
	 * @param attachment the attachment point of the framebuffer. One of:<br>{@link #GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, {@link #GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}, {@link #GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}, {@link #GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}, {@link #GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}, {@link #GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}, {@link #GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}, {@link #GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}, {@link #GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}, {@link #GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}, {@link #GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}, {@link #GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}, {@link #GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}, {@link #GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}, {@link #GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}, {@link #GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}, {@link #GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}, {@link #GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}, {@link #GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}, {@link #GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}, {@link #GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}, {@link #GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}, {@link #GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}, {@link #GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}, {@link #GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}, {@link #GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}, {@link #GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}, {@link #GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}, {@link #GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}, {@link #GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}, {@link #GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}, {@link #GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}, {@link #GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}, {@link #GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}, {@link #GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}
	 * @param textarget  the type of texture
	 * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level      the mipmap level of {@code texture} to attach
	 */
	public static void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
		long __functionAddress = getInstance().FramebufferTexture2D;
		callIIIIIV(__functionAddress, target, attachment, textarget, texture, level);
	}

	// --- [ glFramebufferTexture3D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glFramebufferTexture3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Attaches a layer of a 3D texture object as a logical buffer to the currently bound framebuffer object.
	 *
	 * @param target     the framebuffer target. One of:<br>{@link #GL_FRAMEBUFFER FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}
	 * @param attachment the attachment point of the framebuffer. One of:<br>{@link #GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, {@link #GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}, {@link #GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}, {@link #GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}, {@link #GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}, {@link #GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}, {@link #GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}, {@link #GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}, {@link #GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}, {@link #GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}, {@link #GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}, {@link #GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}, {@link #GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}, {@link #GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}, {@link #GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}, {@link #GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}, {@link #GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}, {@link #GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}, {@link #GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}, {@link #GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}, {@link #GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}, {@link #GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}, {@link #GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}, {@link #GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}, {@link #GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}, {@link #GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}, {@link #GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}, {@link #GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}, {@link #GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}, {@link #GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}, {@link #GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}, {@link #GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}, {@link #GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}, {@link #GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}, {@link #GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}
	 * @param textarget  the type of texture
	 * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level      the mipmap level of {@code texture} to attach
	 * @param layer      the layer of a 2-dimensional image within the 3-dimensional texture.
	 */
	public static void glFramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int layer) {
		long __functionAddress = getInstance().FramebufferTexture3D;
		callIIIIIIV(__functionAddress, target, attachment, textarget, texture, level, layer);
	}

	// --- [ glFramebufferTextureLayer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glFramebufferTextureLayer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Attaches a single layer of a texture to a framebuffer
	 *
	 * @param target     the framebuffer target. One of:<br>{@link #GL_FRAMEBUFFER FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}
	 * @param attachment the attachment point of the framebuffer. One of:<br>{@link #GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, {@link #GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}, {@link #GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}, {@link #GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}, {@link #GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}, {@link #GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}, {@link #GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}, {@link #GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}, {@link #GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}, {@link #GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}, {@link #GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}, {@link #GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}, {@link #GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}, {@link #GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}, {@link #GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}, {@link #GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}, {@link #GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}, {@link #GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}, {@link #GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}, {@link #GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}, {@link #GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}, {@link #GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}, {@link #GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}, {@link #GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}, {@link #GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}, {@link #GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}, {@link #GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}, {@link #GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}, {@link #GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}, {@link #GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}, {@link #GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}, {@link #GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}, {@link #GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}, {@link #GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}, {@link #GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}
	 * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level      the mipmap level of {@code texture} to attach
	 * @param layer      the layer of {@code texture} to attach.
	 */
	public static void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
		long __functionAddress = getInstance().FramebufferTextureLayer;
		callIIIIIV(__functionAddress, target, attachment, texture, level, layer);
	}

	// --- [ glFramebufferRenderbuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glFramebufferRenderbuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Attaches a renderbuffer as a logical buffer to the currently bound framebuffer object.
	 *
	 * @param target             the framebuffer target. One of:<br>{@link #GL_FRAMEBUFFER FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}
	 * @param attachment         the attachment point of the framebuffer. One of:<br>{@link #GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, {@link #GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}, {@link #GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}, {@link #GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}, {@link #GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}, {@link #GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}, {@link #GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}, {@link #GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}, {@link #GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}, {@link #GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}, {@link #GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}, {@link #GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}, {@link #GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}, {@link #GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}, {@link #GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}, {@link #GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}, {@link #GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}, {@link #GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}, {@link #GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}, {@link #GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}, {@link #GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}, {@link #GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}, {@link #GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}, {@link #GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}, {@link #GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}, {@link #GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}, {@link #GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}, {@link #GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}, {@link #GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}, {@link #GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}, {@link #GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}, {@link #GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}, {@link #GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}, {@link #GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}, {@link #GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}
	 * @param renderbuffertarget the renderbuffer target. Must be:<br>{@link #GL_RENDERBUFFER RENDERBUFFER}
	 * @param renderbuffer       the name of an existing renderbuffer object of type {@code renderbuffertarget} to attach
	 */
	public static void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
		long __functionAddress = getInstance().FramebufferRenderbuffer;
		callIIIIV(__functionAddress, target, attachment, renderbuffertarget, renderbuffer);
	}

	// --- [ glGetFramebufferAttachmentParameteriv ] ---

	/** Unsafe version of {@link #glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv} */
	@JavadocExclude
	public static void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params) {
		long __functionAddress = getInstance().GetFramebufferAttachmentParameteriv;
		callIIIPV(__functionAddress, target, attachment, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetFramebufferAttachmentParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrievees information about attachments of a bound framebuffer object.
	 *
	 * @param target     the target of the query operation. One of:<br>{@link #GL_FRAMEBUFFER FRAMEBUFFER}, {@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}
	 * @param attachment the attachment within {@code target}. One of:<br>{@link #GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, {@link #GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}, {@link #GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}, {@link #GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}, {@link #GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}, {@link #GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}, {@link #GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}, {@link #GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}, {@link #GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}, {@link #GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}, {@link #GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}, {@link #GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}, {@link #GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}, {@link #GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}, {@link #GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}, {@link #GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}, {@link #GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}, {@link #GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}, {@link #GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}, {@link #GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}, {@link #GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}, {@link #GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}, {@link #GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}, {@link #GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}, {@link #GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}, {@link #GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}, {@link #GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}, {@link #GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}, {@link #GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}, {@link #GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}, {@link #GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}, {@link #GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}, {@link #GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}, {@link #GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}, {@link #GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}
	 * @param pname      the parameter of {@code attachment} to query. One of:<br>{@link #GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}, {@link #GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}, {@link #GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}, {@link #GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}, {@link #GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}, {@link #GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}
	 * @param params     an array to receive the value of the queried parameter
	 */
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

	// --- [ glBlitFramebuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBlitFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
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
	 * @param mask   the bitwise OR of the flags indicating which buffers are to be copied. One of:<br>{@link GL11#GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}, {@link GL11#GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}, {@link GL11#GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}
	 * @param filter the interpolation to be applied if the image is stretched. One of:<br>{@link GL11#GL_NEAREST NEAREST}, {@link GL11#GL_LINEAR LINEAR}
	 */
	public static void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = getInstance().BlitFramebuffer;
		callIIIIIIIIIIV(__functionAddress, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}

	// --- [ glGenerateMipmap ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenerateMipmap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Generate mipmaps for a specified texture target.
	 *
	 * @param target the target to which the texture whose mimaps to generate is bound. One of:<br>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link #GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link #GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}
	 */
	public static void glGenerateMipmap(int target) {
		long __functionAddress = getInstance().GenerateMipmap;
		callIV(__functionAddress, target);
	}

	// --- [ glTexParameterIiv ] ---

	/** Unsafe version of {@link #glTexParameterIiv TexParameterIiv} */
	@JavadocExclude
	public static void nglTexParameterIiv(int target, int pname, long params) {
		long __functionAddress = getInstance().TexParameterIiv;
		callIIPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the integer value of a texture parameter.
	 *
	 * @param target the texture target
	 * @param pname  the symbolic name of a single-valued texture parameter
	 * @param params the value of {@code pname}
	 */
	public static void glTexParameterIiv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglTexParameterIiv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexParameterIiv TexParameterIiv} */
	public static void glTexParameterIiv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglTexParameterIiv(target, pname, memAddress(params));
	}

	/** Single value version of: {@link #glTexParameterIiv TexParameterIiv} */
	public static void glTexParameterIi(int target, int pname, int param) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam(param);
		nglTexParameterIiv(target, pname, __buffer.address(params));
	}

	// --- [ glTexParameterIuiv ] ---

	/** Unsafe version of {@link #glTexParameterIuiv TexParameterIuiv} */
	@JavadocExclude
	public static void nglTexParameterIuiv(int target, int pname, long params) {
		long __functionAddress = getInstance().TexParameterIuiv;
		callIIPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the unsigned integer value of a texture parameter.
	 *
	 * @param target the texture target
	 * @param pname  the symbolic name of a single-valued texture parameter
	 * @param params the value of {@code pname}
	 */
	public static void glTexParameterIuiv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglTexParameterIuiv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexParameterIuiv TexParameterIuiv} */
	public static void glTexParameterIuiv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglTexParameterIuiv(target, pname, memAddress(params));
	}

	/** Single value version of: {@link #glTexParameterIuiv TexParameterIuiv} */
	public static void glTexParameterIui(int target, int pname, int param) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam(param);
		nglTexParameterIuiv(target, pname, __buffer.address(params));
	}

	// --- [ glGetTexParameterIiv ] ---

	/** Unsafe version of {@link #glGetTexParameterIiv GetTexParameterIiv} */
	@JavadocExclude
	public static void nglGetTexParameterIiv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetTexParameterIiv;
		callIIPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTexParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the integer value of a texture parameter.
	 *
	 * @param target the texture target
	 * @param pname  the symbolic name of a texture parameter
	 * @param params returns the texture parameter value
	 */
	public static void glGetTexParameterIiv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexParameterIiv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexParameterIiv GetTexParameterIiv} */
	public static void glGetTexParameterIiv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterIiv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexParameterIiv GetTexParameterIiv} */
	public static int glGetTexParameterIi(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTexParameterIiv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetTexParameterIuiv ] ---

	/** Unsafe version of {@link #glGetTexParameterIuiv GetTexParameterIuiv} */
	@JavadocExclude
	public static void nglGetTexParameterIuiv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetTexParameterIuiv;
		callIIPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTexParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the unsigned integer value of a texture parameter.
	 *
	 * @param target the texture target
	 * @param pname  the symbolic name of a texture parameter
	 * @param params returns the texture parameter value
	 */
	public static void glGetTexParameterIuiv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexParameterIuiv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexParameterIuiv GetTexParameterIuiv} */
	public static void glGetTexParameterIuiv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterIuiv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexParameterIuiv GetTexParameterIuiv} */
	public static int glGetTexParameterIui(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTexParameterIuiv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glColorMaski ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glColorMaski.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Enables and disables writing of frame buffer color components.
	 *
	 * @param buf the index of the draw buffer whose color mask to set
	 * @param r   whether R values are written or not
	 * @param g   whether G values are written or not
	 * @param b   whether B values are written or not
	 * @param a   whether A values are written or not
	 */
	public static void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a) {
		long __functionAddress = getInstance().ColorMaski;
		callIZZZZV(__functionAddress, buf, r, g, b, a);
	}

	// --- [ glGetBooleani_v ] ---

	/** Unsafe version of {@link #glGetBooleani_v GetBooleani_v} */
	@JavadocExclude
	public static void nglGetBooleani_v(int target, int index, long data) {
		long __functionAddress = getInstance().GetBooleani_v;
		callIIPV(__functionAddress, target, index, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the boolean value of an indexed state variable.
	 *
	 * @param target the indexed state to query
	 * @param index  the index of the element being queried
	 * @param data   a scalar or buffer in which to place the returned data
	 */
	public static void glGetBooleani_v(int target, int index, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetBooleani_v(target, index, memAddress(data));
	}

	/** Single return value version of: {@link #glGetBooleani_v GetBooleani_v} */
	public static boolean glGetBooleani(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.booleanParam();
		nglGetBooleani_v(target, index, __buffer.address(data));
		return __buffer.booleanValue(data);
	}

	// --- [ glGetIntegeri_v ] ---

	/** Unsafe version of {@link #glGetIntegeri_v GetIntegeri_v} */
	@JavadocExclude
	public static void nglGetIntegeri_v(int target, int index, long data) {
		long __functionAddress = getInstance().GetIntegeri_v;
		callIIPV(__functionAddress, target, index, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the integer value of an indexed state variable.
	 *
	 * @param target the indexed state to query
	 * @param index  the index of the element being queried
	 * @param data   a scalar or buffer in which to place the returned data
	 */
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

	// --- [ glEnablei ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glEnablei.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Enables an indexed capability.
	 *
	 * @param cap   the indexed capability to enable
	 * @param index the index to enable
	 */
	public static void glEnablei(int cap, int index) {
		long __functionAddress = getInstance().Enablei;
		callIIV(__functionAddress, cap, index);
	}

	// --- [ glDisablei ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDisablei.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Disables an indexed capability.
	 *
	 * @param target the indexed capability to disable
	 * @param index  the index to disable
	 */
	public static void glDisablei(int target, int index) {
		long __functionAddress = getInstance().Disablei;
		callIIV(__functionAddress, target, index);
	}

	// --- [ glIsEnabledi ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsEnabledi.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Tests whether an indexed capability is enabled.
	 *
	 * @param target the indexed capability to query
	 * @param index  the index to query
	 */
	public static boolean glIsEnabledi(int target, int index) {
		long __functionAddress = getInstance().IsEnabledi;
		return callIIZ(__functionAddress, target, index);
	}

	// --- [ glBindBufferRange ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindBufferRange.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a range within a buffer object to an indexed buffer target.
	 *
	 * @param target the target of the bind operation. One of:<br>{@link #GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}
	 * @param index  the index of the binding point within the array specified by {@code target}
	 * @param buffer a buffer object to bind to the specified binding point
	 * @param offset the starting offset in basic machine units into the buffer object {@code buffer}
	 * @param size   the amount of data in machine units that can be read from the buffer object while used as an indexed target
	 */
	public static void glBindBufferRange(int target, int index, int buffer, long offset, long size) {
		long __functionAddress = getInstance().BindBufferRange;
		callIIIPPV(__functionAddress, target, index, buffer, offset, size);
	}

	// --- [ glBindBufferBase ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindBufferBase.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a buffer object to an indexed buffer target.
	 *
	 * @param target the target of the bind operation. One of:<br>{@link #GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}
	 * @param index  the index of the binding point within the array specified by {@code target}
	 * @param buffer a buffer object to bind to the specified binding point
	 */
	public static void glBindBufferBase(int target, int index, int buffer) {
		long __functionAddress = getInstance().BindBufferBase;
		callIIIV(__functionAddress, target, index, buffer);
	}

	// --- [ glBeginTransformFeedback ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBeginTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Starts transform feedback operation.
	 *
	 * @param primitiveMode the output type of the primitives that will be recorded into the buffer objects that are bound for transform feedback. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_TRIANGLES TRIANGLES}
	 */
	public static void glBeginTransformFeedback(int primitiveMode) {
		long __functionAddress = getInstance().BeginTransformFeedback;
		callIV(__functionAddress, primitiveMode);
	}

	// --- [ glEndTransformFeedback ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBeginTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
Ends transform feedback operation.
	 */
	public static void glEndTransformFeedback() {
		long __functionAddress = getInstance().EndTransformFeedback;
		callV(__functionAddress);
	}

	// --- [ glTransformFeedbackVaryings ] ---

	/** Unsafe version of {@link #glTransformFeedbackVaryings TransformFeedbackVaryings} */
	@JavadocExclude
	public static void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode) {
		long __functionAddress = getInstance().TransformFeedbackVaryings;
		callIIPIV(__functionAddress, program, count, varyings, bufferMode);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTransformFeedbackVaryings.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies values to record in transform feedback buffers.
	 *
	 * @param program    the target program object
	 * @param count      the number of varying variables used for transform feedback
	 * @param varyings   an array of {@code count} zero-terminated strings specifying the names of the varying variables to use for transform feedback
	 * @param bufferMode the mode used to capture the varying variables when transform feedback is active. One of:<br>{@link #GL_INTERLEAVED_ATTRIBS INTERLEAVED_ATTRIBS}, {@link #GL_SEPARATE_ATTRIBS SEPARATE_ATTRIBS}
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedbackVarying.xhtml">OpenGL SDK Reference</a></p>
	 * 
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
		int bufSize = GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH);
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

	// --- [ glBindVertexArray ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindVertexArray.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a vertex array object
	 *
	 * @param array the name of the vertex array to bind
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteVertexArrays.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes vertex array objects.
	 *
	 * @param n      the number of vertex array objects to be deleted
	 * @param arrays an array containing the n names of the objects to be deleted
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenVertexArrays.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Generates vertex array object names.
	 *
	 * @param n      the number of vertex array object names to generate
	 * @param arrays a buffer in which the generated vertex array object names are stored
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsVertexArray.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Determines if a name corresponds to a vertex array object.
	 *
	 * @param array a value that may be the name of a vertex array object
	 */
	public static boolean glIsVertexArray(int array) {
		long __functionAddress = getInstance().IsVertexArray;
		return callIZ(__functionAddress, array);
	}

}