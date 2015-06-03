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

/**
 * The core OpenGL 4.3 functionality. OpenGL 4.3 implementations support revision 4.30 of the OpenGL Shading Language.
 * 
 * <p>Extensions promoted to core in this release:
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/arrays_of_arrays.txt">ARB_arrays_of_arrays</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/ES3_compatibility.txt">ARB_ES3_compatibility</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/clear_buffer_object.txt">ARB_clear_buffer_object</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/compute_shader.txt">ARB_compute_shader</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/copy_image.txt">ARB_copy_image</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/debug_group.txt">ARB_debug_group</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/debug_label.txt">ARB_debug_label</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/debug_output2.txt">ARB_debug_output2</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/debug_output.txt">ARB_debug_output</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/explicit_uniform_location.txt">ARB_explicit_uniform_location</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/fragment_layer_viewport.txt">ARB_fragment_layer_viewport</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/framebuffer_no_attachments.txt">ARB_framebuffer_no_attachments</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/internalformat_query2.txt">ARB_internalformat_query2</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/invalidate_subdata.txt">ARB_invalidate_subdata</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/multi_draw_indirect.txt">ARB_multi_draw_indirect</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/program_interface_query.txt">ARB_program_interface_query</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/robust_buffer_access_behavior.txt">ARB_robust_buffer_access_behavior</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/shader_image_size.txt">ARB_shader_image_size</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/shader_storage_buffer_object.txt">ARB_shader_storage_buffer_object</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/stencil_texturing.txt">ARB_stencil_texturing</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_buffer_range.txt">ARB_texture_buffer_range</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_query_levels.txt">ARB_texture_query_levels</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_storage_multisample.txt">ARB_texture_storage_multisample</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_view.txt">ARB_texture_view</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/vertex_attrib_binding.txt">ARB_vertex_attrib_binding</a></li>
 * </ul></p>
 */
public final class GL43 {

	/** No. of supported Shading Language Versions. Accepted by the {@code pname} parameter of GetIntegerv. */
	public static final int GL_NUM_SHADING_LANGUAGE_VERSIONS = 0x82E9;

	/** Vertex attrib array has unconverted doubles. Accepted by the {@code pname} parameter of GetVertexAttribiv. */
	public static final int GL_VERTEX_ATTRIB_ARRAY_LONG = 0x874E;

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
	public static final int GL_PRIMITIVE_RESTART_FIXED_INDEX = 0x8D69;

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, GetQueryIndexediv and GetQueryiv. */
	public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;

	/** Accepted by the {@code value} parameter of the GetInteger* functions. */
	public static final int GL_MAX_ELEMENT_INDEX = 0x8D6B;

	/** Accepted by the {@code pname} parameters of GetTexParameterfv and  GetTexParameteriv. */
	public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 0x82DF;

	/** Accepted by the {@code type} parameter of CreateShader and returned in the {@code params} parameter by GetShaderiv. */
	public static final int GL_COMPUTE_SHADER = 0x91B9;

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
	public static final int GL_COMPUTE_WORK_GROUP_SIZE = 0x8267;

	/** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv. */
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 0x90EC;

	/** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv. */
	public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 0x90ED;

	/** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv. */
	public static final int GL_DISPATCH_INDIRECT_BUFFER = 0x90EE;

	/** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int GL_DISPATCH_INDIRECT_BUFFER_BINDING = 0x90EF;

	/** Accepted by the {@code stages} parameter of UseProgramStages. */
	public static final int GL_COMPUTE_SHADER_BIT = 0x20;

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
	public static final int GL_MAX_UNIFORM_LOCATIONS = 0x826E;

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

	/** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v. */
	public static final int
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
		GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST    = 0x82AC,
		GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST  = 0x82AD,
		GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE   = 0x82AE,
		GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE = 0x82AF,
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
	public static final int GL_SHADER_STORAGE_BUFFER = 0x90D2;

	/**
	 * Accepted by the {@code pname} parameter of GetIntegerv, GetIntegeri_v, GetBooleanv, GetInteger64v, GetFloatv, GetDoublev, GetBooleani_v, GetIntegeri_v,
	 * GetFloati_v, GetDoublei_v, and GetInteger64i_v.
	 */
	public static final int GL_SHADER_STORAGE_BUFFER_BINDING = 0x90D3;

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
	public static final int GL_SHADER_STORAGE_BARRIER_BIT = 0x2000;

	/** Alias for the existing token MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS. */
	public static final int GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 0x8F39;

	/** Accepted by the {@code pname} parameter of TexParameter* and GetTexParameter*. */
	public static final int GL_DEPTH_STENCIL_TEXTURE_MODE = 0x90EA;

	/** Accepted by the {@code pname} parameter of GetTexLevelParameter. */
	public static final int
		GL_TEXTURE_BUFFER_OFFSET = 0x919D,
		GL_TEXTURE_BUFFER_SIZE   = 0x919E;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;

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
		GL_VERTEX_BINDING_STRIDE  = 0x82D8,
		GL_VERTEX_BINDING_BUFFER  = 0x8F4F;

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
		PopDebugGroup,
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
		PopDebugGroup = provider.getFunctionAddress("glPopDebugGroup");
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
		return checkFunctionality(GL.getCapabilities().__GL43);
	}

	static GL43 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL43") ) return null;

		GL43 funcs = new GL43(provider);

		boolean supported = checkFunctions(
			funcs.ClearBufferData, funcs.ClearBufferSubData, funcs.DispatchCompute, funcs.DispatchComputeIndirect, funcs.CopyImageSubData, 
			funcs.DebugMessageControl, funcs.DebugMessageInsert, funcs.DebugMessageCallback, funcs.GetDebugMessageLog, funcs.PushDebugGroup, 
			funcs.PopDebugGroup, funcs.ObjectLabel, funcs.GetObjectLabel, funcs.ObjectPtrLabel, funcs.GetObjectPtrLabel, funcs.FramebufferParameteri, 
			funcs.GetFramebufferParameteriv, funcs.GetInternalformati64v, funcs.InvalidateTexSubImage, funcs.InvalidateTexImage, funcs.InvalidateBufferSubData, 
			funcs.InvalidateBufferData, funcs.InvalidateFramebuffer, funcs.InvalidateSubFramebuffer, funcs.MultiDrawArraysIndirect, 
			funcs.MultiDrawElementsIndirect, funcs.GetProgramInterfaceiv, funcs.GetProgramResourceIndex, funcs.GetProgramResourceName, 
			funcs.GetProgramResourceiv, funcs.GetProgramResourceLocation, funcs.GetProgramResourceLocationIndex, funcs.ShaderStorageBlockBinding, 
			funcs.TexBufferRange, funcs.TexStorage2DMultisample, funcs.TexStorage3DMultisample, funcs.TextureView, funcs.BindVertexBuffer, 
			funcs.VertexAttribFormat, funcs.VertexAttribIFormat, funcs.VertexAttribLFormat, funcs.VertexAttribBinding, funcs.VertexBindingDivisor
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
		nglClearBufferData(target, internalformat, format, type, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Fills a buffer object's data store with a fixed value.
	 *
	 * @param target         the target of the operation. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link #GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link #GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param data           buffer containing the data to be used as the source of the constant fill value.
	 *                       The elements of data are converted by the GL into the format specified by internalformat,
	 *                       and then used to fill the specified range of the destination buffer.
	 *                       If data is {@code NULL}, then it is ignored and the sub-range of the buffer is filled with zeros.
	 */
	public static void glClearBufferData(int target, int internalformat, int format, int type, ByteBuffer data) {
		nglClearBufferData(target, internalformat, format, type, memAddressSafe(data));
	}

	/** ShortBuffer version of: {@link #glClearBufferData ClearBufferData} */
	public static void glClearBufferData(int target, int internalformat, int format, int type, ShortBuffer data) {
		nglClearBufferData(target, internalformat, format, type, memAddressSafe(data));
	}

	/** IntBuffer version of: {@link #glClearBufferData ClearBufferData} */
	public static void glClearBufferData(int target, int internalformat, int format, int type, IntBuffer data) {
		nglClearBufferData(target, internalformat, format, type, memAddressSafe(data));
	}

	/** FloatBuffer version of: {@link #glClearBufferData ClearBufferData} */
	public static void glClearBufferData(int target, int internalformat, int format, int type, FloatBuffer data) {
		nglClearBufferData(target, internalformat, format, type, memAddressSafe(data));
	}

	// --- [ glClearBufferSubData ] ---

	/** JNI method for {@link #glClearBufferSubData ClearBufferSubData} */
	@JavadocExclude
	public static native void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data, long __functionAddress);

	/** Unsafe version of {@link #glClearBufferSubData ClearBufferSubData} */
	@JavadocExclude
	public static void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data) {
		long __functionAddress = getInstance().ClearBufferSubData;
		nglClearBufferSubData(target, internalformat, offset, size, format, type, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Fills all or part of buffer object's data store with a fixed value.
	 *
	 * @param target         the target of the operation. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link #GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link #GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param offset         the offset, in basic machine units into the buffer object's data store at which to start filling
	 * @param size           the size, in basic machine units of the range of the data store to fill
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param data           buffer containing the data to be used as the source of the constant fill value.
	 *                       The elements of data are converted by the GL into the format specified by internalformat,
	 *                       and then used to fill the specified range of the destination buffer.
	 *                       If data is {@code NULL}, then it is ignored and the sub-range of the buffer is filled with zeros.
	 */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, ByteBuffer data) {
		nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/** ShortBuffer version of: {@link #glClearBufferSubData ClearBufferSubData} */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, ShortBuffer data) {
		nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/** IntBuffer version of: {@link #glClearBufferSubData ClearBufferSubData} */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, IntBuffer data) {
		nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/** FloatBuffer version of: {@link #glClearBufferSubData ClearBufferSubData} */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, FloatBuffer data) {
		nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	// --- [ glDispatchCompute ] ---

	/** JNI method for {@link #glDispatchCompute DispatchCompute} */
	@JavadocExclude
	public static native void nglDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDispatchCompute.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Launches one or more compute work groups.
	 *
	 * @param num_groups_x the number of work groups to be launched in the X dimension
	 * @param num_groups_y the number of work groups to be launched in the Y dimension
	 * @param num_groups_z the number of work groups to be launched in the Z dimension
	 */
	public static void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
		long __functionAddress = getInstance().DispatchCompute;
		nglDispatchCompute(num_groups_x, num_groups_y, num_groups_z, __functionAddress);
	}

	// --- [ glDispatchComputeIndirect ] ---

	/** JNI method for {@link #glDispatchComputeIndirect DispatchComputeIndirect} */
	@JavadocExclude
	public static native void nglDispatchComputeIndirect(long indirect, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDispatchComputeIndirect.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Launches one or more compute work groups using parameters stored in a buffer.
	 * 
	 * <p>The parameters addressed by indirect are packed a structure, which takes the form (in C):
	 * <pre><code style="font-family: monospace">
	 * typedef struct {
	 * 	uint num_groups_x;
	 * 	uint num_groups_y;
	 * 	uint num_groups_z;
	 * } DispatchIndirectCommand;</code></pre></p>
	 * 
	 * <p>A call to {@code glDispatchComputeIndirect} is equivalent, assuming no errors are generated, to:
	 * <pre><code style="font-family: monospace">
	 * cmd = (const DispatchIndirectCommand *)indirect;
	 * glDispatchCompute(cmd->num_groups_x, cmd->num_groups_y, cmd->num_groups_z);</code></pre></p>
	 *
	 * @param indirect the offset into the buffer object currently bound to the {@link #GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER} buffer target at which the dispatch parameters are
	 *                 stored.
	 */
	public static void glDispatchComputeIndirect(long indirect) {
		long __functionAddress = getInstance().DispatchComputeIndirect;
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL43.GL_DISPATCH_INDIRECT_BUFFER_BINDING, true);
		nglDispatchComputeIndirect(indirect, __functionAddress);
	}

	// --- [ glCopyImageSubData ] ---

	/** JNI method for {@link #glCopyImageSubData CopyImageSubData} */
	@JavadocExclude
	public static native void nglCopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCopyImageSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
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
		nglDebugMessageControl(source, type, severity, count, ids, enabled, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDebugMessageControl.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Controls the volume of debug output in the active debug group, by disabling specific or groups of messages.
	 * 
	 * <p>If {@code enabled} is {@link GL11#GL_TRUE TRUE}, the referenced subset of messages will be enabled. If {@link GL11#GL_FALSE FALSE}, then those messages will be disabled.</p>
	 * 
	 * <p>This command can reference different subsets of messages by first considering the set of all messages, and filtering out messages based on the following
	 * ways:
	 * <ul>
	 * <li>If {@code source}, {@code type}, or {@code severity} is {@link GL11#GL_DONT_CARE DONT_CARE}, the messages from all sources, of all types, or of all severities are
	 * referenced respectively.</li>
	 * <li>When values other than {@link GL11#GL_DONT_CARE DONT_CARE} are specified, all messages whose source, type, or severity match the specified {@code source}, {@code type},
	 * or {@code severity} respectively will be referenced.</li>
	 * <li>If {@code count} is greater than zero, then {@code ids} is an array of {@code count} message IDs for the specified combination of {@code source} and
	 * {@code type}. In this case, if {@code source} or {@code type} is {@link GL11#GL_DONT_CARE DONT_CARE}, or {@code severity} is not {@link GL11#GL_DONT_CARE DONT_CARE}, the error
	 * {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated.</li>
	 * </ul></p>
	 * 
	 * <p>Unrecognized message IDs in {@code ids} are ignored. If {@code count} is zero, the value if {@code ids} is ignored.</p>
	 * 
	 * <p>Although messages are grouped into an implicit hierarchy by their sources and types, there is no explicit per-source, per-type or per-severity enabled
	 * state. Instead, the enabled state is stored individually for each message. There is no difference between disabling all messages from one source in a
	 * single call, and individually disabling all messages from that source using their types and IDs.</p>
	 * 
	 * <p>If the {@link #GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled the GL operates the same as if messages of every {@code source}, {@code type} or {@code severity} are disabled.</p>
	 *
	 * @param source   the source of debug messages to enable or disable. One of:<br>{@link #GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}, {@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}, {@link #GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}, {@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}, {@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}, {@link #GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}
	 * @param type     the type of debug messages to enable or disable. One of:<br>{@link #GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}, {@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}, {@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}, {@link #GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}, {@link #GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}, {@link #GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}, {@link #GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}
	 * @param severity the severity of debug messages to enable or disable. One of:<br>{@link #GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}, {@link #GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}, {@link #GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}, {@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}
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
		nglDebugMessageControl(source, type, severity, 1, __buffer.address(ids), enabled);
	}

	// --- [ glDebugMessageInsert ] ---

	/** JNI method for {@link #glDebugMessageInsert DebugMessageInsert} */
	@JavadocExclude
	public static native void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message, long __functionAddress);

	/** Unsafe version of {@link #glDebugMessageInsert DebugMessageInsert} */
	@JavadocExclude
	public static void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message) {
		long __functionAddress = getInstance().DebugMessageInsert;
		nglDebugMessageInsert(source, type, id, severity, length, message, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDebugMessageInsert.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * This function can be called by applications and third-party libraries to generate their own messages, such as ones containing timestamp information or
	 * signals about specific render system events.
	 * 
	 * <p>The value of {@code id} specifies the ID for the message and {@code severity} indicates its severity level as defined by the caller. The string
	 * {@code buf} contains the string representation of the message. The parameter {@code length} contains the number of characters in {@code buf}. If
	 * {@code length} is negative, it is implied that {@code buf} contains a null terminated string. The error {@link GL11#GL_INVALID_VALUE INVALID_VALUE} will be generated if the
	 * number of characters in {@code buf}, excluding the null terminator when {@code length} is negative, is not less than the value of
	 * {@link #GL_MAX_DEBUG_MESSAGE_LENGTH MAX_DEBUG_MESSAGE_LENGTH}.</p>
	 * 
	 * <p>If the {@link #GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled calls to DebugMessageInsert are discarded and do not generate an error.</p>
	 *
	 * @param source   the source of the debug message to insert. One of:<br>{@link #GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}, {@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}, {@link #GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}, {@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}, {@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}, {@link #GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}
	 * @param type     the type of the debug message insert. One of:<br>{@link #GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}, {@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}, {@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}, {@link #GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}, {@link #GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}, {@link #GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}, {@link #GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}
	 * @param id       the user-supplied identifier of the message to insert. One of:<br>{@link #GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}, {@link #GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}, {@link #GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}, {@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}
	 * @param severity the severity of the debug messages to insert
	 * @param length   the length of the string contained in the character array whose address is given by {@code message}
	 * @param message  a character array containing the message to insert
	 */
	public static void glDebugMessageInsert(int source, int type, int id, int severity, int length, ByteBuffer message) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(message, length);
		nglDebugMessageInsert(source, type, id, severity, length, memAddress(message));
	}

	/** Alternative version of: {@link #glDebugMessageInsert DebugMessageInsert} */
	public static void glDebugMessageInsert(int source, int type, int id, int severity, ByteBuffer message) {
		nglDebugMessageInsert(source, type, id, severity, message.remaining(), memAddress(message));
	}

	/** CharSequence version of: {@link #glDebugMessageInsert DebugMessageInsert} */
	public static void glDebugMessageInsert(int source, int type, int id, int severity, CharSequence message) {
		APIBuffer __buffer = apiBuffer();
		int messageEncoded = __buffer.stringParamUTF8(message, false);
		int messageEncodedLen = __buffer.getOffset() - messageEncoded;
		nglDebugMessageInsert(source, type, id, severity, messageEncodedLen, __buffer.address(messageEncoded));
	}

	// --- [ glDebugMessageCallback ] ---

	/** JNI method for {@link #glDebugMessageCallback DebugMessageCallback} */
	@JavadocExclude
	public static native void nglDebugMessageCallback(long callback, long userParam, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDebugMessageCallback.xhtml">OpenGL SDK Reference</a></p>
	 * 
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
	 * <p>Applications can query the current callback function and the current user-specified parameter by obtaining the values of {@link #GL_DEBUG_CALLBACK_FUNCTION DEBUG_CALLBACK_FUNCTION} and
	 * {@link #GL_DEBUG_CALLBACK_USER_PARAM DEBUG_CALLBACK_USER_PARAM}, respectively.</p>
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
	public static void glDebugMessageCallback(GLDebugMessageCallback callback, long userParam) {
		long __functionAddress = getInstance().DebugMessageCallback;
		nglDebugMessageCallback(callback == null ? NULL : callback.getPointer(), userParam, __functionAddress);
	}

	// --- [ glGetDebugMessageLog ] ---

	/** JNI method for {@link #glGetDebugMessageLog GetDebugMessageLog} */
	@JavadocExclude
	public static native int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog, long __functionAddress);

	/** Unsafe version of {@link #glGetDebugMessageLog GetDebugMessageLog} */
	@JavadocExclude
	public static int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog) {
		long __functionAddress = getInstance().GetDebugMessageLog;
		return nglGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetDebugMessageLog.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves messages from the debug message log.
	 * 
	 * <p>This function fetches a maximum of <count> messages from the message log, and will return the number of messages successfully fetched.</p>
	 * 
	 * <p>Messages will be fetched from the log in order of oldest to newest. Those messages that were fetched will be removed from the log.</p>
	 * 
	 * <p>The sources, types, severities, IDs, and string lengths of fetched messages will be stored in the application-provided arrays {@code sources},
	 * {@code types}, {@code severities}, {@code ids}, and {@code lengths}, respectively. The application is responsible for allocating enough space for each
	 * array to hold up to {@code count} elements. The string representations of all fetched messages are stored in the {@code messageLog} array. If multiple
	 * messages are fetched, their strings are concatenated into the same {@code messageLog} array and will be separated by single null terminators. The last
	 * string in the array will also be null-terminated. The maximum size of {@code messageLog}, including the space used by all null terminators, is given by
	 * {@code bufSize}. If {@code bufSize} is less than zero and {@code messageLog} is not {@code NULL}, an {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error will be generated. If a message's
	 * string, including its null terminator, can not fully fit within the {@code messageLog} array's remaining space, then that message and any subsequent
	 * messages will not be fetched and will remain in the log. The string lengths stored in the array {@code lengths} include the space for the null terminator of each string.</p>
	 * 
	 * <p>Any or all of the arrays {@code sources}, {@code types}, {@code ids}, {@code severities}, {@code lengths} and {@code messageLog} can also be null
	 * pointers, which causes the attributes for such arrays to be discarded when messages are fetched, however those messages will still be removed from the
	 * log. Thus to simply delete up to {@code count} messages from the message log while ignoring their attributes, the application can call the function with
	 * null pointers for all attribute arrays.</p>
	 * 
	 * <p>If the context was created without the {@link #GL_CONTEXT_FLAG_DEBUG_BIT CONTEXT_FLAG_DEBUG_BIT} in the {@link GL30#GL_CONTEXT_FLAGS CONTEXT_FLAGS} state, then the GL can opt to never add messages to the message
	 * log so GetDebugMessageLog will always return zero.</p>
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

	// --- [ glPushDebugGroup ] ---

	/** JNI method for {@link #glPushDebugGroup PushDebugGroup} */
	@JavadocExclude
	public static native void nglPushDebugGroup(int source, int id, int length, long message, long __functionAddress);

	/** Unsafe version of {@link #glPushDebugGroup PushDebugGroup} */
	@JavadocExclude
	public static void nglPushDebugGroup(int source, int id, int length, long message) {
		long __functionAddress = getInstance().PushDebugGroup;
		nglPushDebugGroup(source, id, length, message, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPushDebugGroup.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pushes a debug group described by the string {@code message} into the command stream. The value of {@code id} specifies the ID of messages generated.
	 * The parameter {@code length} contains the number of characters in {@code message}. If {@code length} is negative, it is implied that {@code message}
	 * contains a null terminated string. The message has the specified {@code source} and {@code id}, {@code type} {@link #GL_DEBUG_TYPE_PUSH_GROUP DEBUG_TYPE_PUSH_GROUP}, and
	 * {@code severity} {@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}. The GL will put a new debug group on top of the debug group stack which inherits the control of the
	 * volume of debug output of the debug group previously residing on the top of the debug group stack. Because debug groups are strictly hierarchical, any
	 * additional control of the debug output volume will only apply within the active debug group and the debug groups pushed on top of the active debug group.
	 * 
	 * <p>An {@link GL11#GL_INVALID_ENUM INVALID_ENUM} error is generated if the value of {@code source} is neither {@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION} nor {@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}. An
	 * {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if {@code length} is negative and the number of characters in {@code message}, excluding the null-terminator, is
	 * not less than the value of {@link #GL_MAX_DEBUG_MESSAGE_LENGTH MAX_DEBUG_MESSAGE_LENGTH}.</p>
	 *
	 * @param source  the source of the debug message. One of:<br>{@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}, {@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}
	 * @param id      the identifier of the message
	 * @param length  the length of the message to be sent to the debug output stream
	 * @param message a string containing the message to be sent to the debug output stream
	 */
	public static void glPushDebugGroup(int source, int id, int length, ByteBuffer message) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(message, length);
		nglPushDebugGroup(source, id, length, memAddress(message));
	}

	/** Alternative version of: {@link #glPushDebugGroup PushDebugGroup} */
	public static void glPushDebugGroup(int source, int id, ByteBuffer message) {
		nglPushDebugGroup(source, id, message.remaining(), memAddress(message));
	}

	/** CharSequence version of: {@link #glPushDebugGroup PushDebugGroup} */
	public static void glPushDebugGroup(int source, int id, CharSequence message) {
		APIBuffer __buffer = apiBuffer();
		int messageEncoded = __buffer.stringParamUTF8(message, false);
		int messageEncodedLen = __buffer.getOffset() - messageEncoded;
		nglPushDebugGroup(source, id, messageEncodedLen, __buffer.address(messageEncoded));
	}

	// --- [ glPopDebugGroup ] ---

	/** JNI method for {@link #glPopDebugGroup PopDebugGroup} */
	@JavadocExclude
	public static native void nglPopDebugGroup(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPopDebugGroup.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pops the active debug group. When a debug group is popped, the GL will also generate a debug output message describing its cause based on the
	 * {@code message} string, the source {@code source}, and an ID {@code id} submitted to the associated {@link #glPushDebugGroup PushDebugGroup} command. {@link #GL_DEBUG_TYPE_PUSH_GROUP DEBUG_TYPE_PUSH_GROUP}
	 * and {@link #GL_DEBUG_TYPE_POP_GROUP DEBUG_TYPE_POP_GROUP} share a single namespace for message {@code id}. {@code severity} has the value {@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}. The {@code type}
	 * has the value {@link #GL_DEBUG_TYPE_POP_GROUP DEBUG_TYPE_POP_GROUP}. Popping a debug group restores the debug output volume control of the parent debug group.
	 * 
	 * <p>Attempting to pop the default debug group off the stack generates a {@link GL11#GL_STACK_UNDERFLOW STACK_UNDERFLOW} error; pushing a debug group onto a stack containing
	 * {@link #GL_MAX_DEBUG_GROUP_STACK_DEPTH MAX_DEBUG_GROUP_STACK_DEPTH} minus one elements will generate a {@link GL11#GL_STACK_OVERFLOW STACK_OVERFLOW} error.</p>
	 */
	public static void glPopDebugGroup() {
		long __functionAddress = getInstance().PopDebugGroup;
		nglPopDebugGroup(__functionAddress);
	}

	// --- [ glObjectLabel ] ---

	/** JNI method for {@link #glObjectLabel ObjectLabel} */
	@JavadocExclude
	public static native void nglObjectLabel(int identifier, int name, int length, long label, long __functionAddress);

	/** Unsafe version of {@link #glObjectLabel ObjectLabel} */
	@JavadocExclude
	public static void nglObjectLabel(int identifier, int name, int length, long label) {
		long __functionAddress = getInstance().ObjectLabel;
		nglObjectLabel(identifier, name, length, label, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glObjectLabel.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Labels a named object identified within a namespace.
	 *
	 * @param identifier the namespace from which the name of the object is allocated. One of:<br>{@link #GL_BUFFER BUFFER}, {@link #GL_SHADER SHADER}, {@link #GL_PROGRAM PROGRAM}, {@link #GL_QUERY QUERY}, {@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}, {@link #GL_SAMPLER SAMPLER}, {@link #GL_DISPLAY_LIST DISPLAY_LIST}, {@link GL11#GL_VERTEX_ARRAY VERTEX_ARRAY}, {@link GL11#GL_TEXTURE TEXTURE}, {@link GL30#GL_RENDERBUFFER RENDERBUFFER}, {@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}, {@link GL40#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}
	 * @param name       the name of the object to label
	 * @param length     the length of the label to be used for the object
	 * @param label      a string containing the label to assign to the object
	 */
	public static void glObjectLabel(int identifier, int name, int length, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(label, length);
		nglObjectLabel(identifier, name, length, memAddress(label));
	}

	/** Alternative version of: {@link #glObjectLabel ObjectLabel} */
	public static void glObjectLabel(int identifier, int name, ByteBuffer label) {
		nglObjectLabel(identifier, name, label.remaining(), memAddress(label));
	}

	/** CharSequence version of: {@link #glObjectLabel ObjectLabel} */
	public static void glObjectLabel(int identifier, int name, CharSequence label) {
		APIBuffer __buffer = apiBuffer();
		int labelEncoded = __buffer.stringParamUTF8(label, false);
		int labelEncodedLen = __buffer.getOffset() - labelEncoded;
		nglObjectLabel(identifier, name, labelEncodedLen, __buffer.address(labelEncoded));
	}

	// --- [ glGetObjectLabel ] ---

	/** JNI method for {@link #glGetObjectLabel GetObjectLabel} */
	@JavadocExclude
	public static native void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label, long __functionAddress);

	/** Unsafe version of {@link #glGetObjectLabel GetObjectLabel} */
	@JavadocExclude
	public static void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label) {
		long __functionAddress = getInstance().GetObjectLabel;
		nglGetObjectLabel(identifier, name, bufSize, length, label, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetObjectLabel.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves the label of a named object identified within a namespace.
	 *
	 * @param identifier the namespace from which the name of the object is allocated. One of:<br>{@link #GL_BUFFER BUFFER}, {@link #GL_SHADER SHADER}, {@link #GL_PROGRAM PROGRAM}, {@link #GL_QUERY QUERY}, {@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}, {@link #GL_SAMPLER SAMPLER}, {@link #GL_DISPLAY_LIST DISPLAY_LIST}, {@link GL11#GL_VERTEX_ARRAY VERTEX_ARRAY}, {@link GL11#GL_TEXTURE TEXTURE}, {@link GL30#GL_RENDERBUFFER RENDERBUFFER}, {@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}, {@link GL40#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}
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
		nglGetObjectLabel(identifier, name, bufSize, __buffer.address(length), __buffer.address(label));
		return memDecodeUTF8(memByteBuffer(__buffer.address(label), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetObjectLabel GetObjectLabel} */
	public static String glGetObjectLabel(int identifier, int name) {
		int bufSize = GL11.glGetInteger(GL_MAX_LABEL_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int label = __buffer.bufferParam(bufSize);
		nglGetObjectLabel(identifier, name, bufSize, __buffer.address(length), __buffer.address(label));
		return memDecodeUTF8(memByteBuffer(__buffer.address(label), __buffer.intValue(length)));
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
			checkPointer(ptr);
		nglObjectPtrLabel(ptr, length, label, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glObjectPtrLabel.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Labels a sync object identified by a pointer.
	 *
	 * @param ptr    a pointer identifying a sync object
	 * @param length the length of the label to be used for the object
	 * @param label  a string containing the label to assign to the object
	 */
	public static void glObjectPtrLabel(long ptr, int length, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(label, length);
		nglObjectPtrLabel(ptr, length, memAddress(label));
	}

	/** Alternative version of: {@link #glObjectPtrLabel ObjectPtrLabel} */
	public static void glObjectPtrLabel(long ptr, ByteBuffer label) {
		nglObjectPtrLabel(ptr, label.remaining(), memAddress(label));
	}

	/** CharSequence version of: {@link #glObjectPtrLabel ObjectPtrLabel} */
	public static void glObjectPtrLabel(long ptr, CharSequence label) {
		APIBuffer __buffer = apiBuffer();
		int labelEncoded = __buffer.stringParamUTF8(label, false);
		int labelEncodedLen = __buffer.getOffset() - labelEncoded;
		nglObjectPtrLabel(ptr, labelEncodedLen, __buffer.address(labelEncoded));
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
			checkPointer(ptr);
		nglGetObjectPtrLabel(ptr, bufSize, length, label, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetObjectPtrLabel.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves the label of a sync object identified by a pointer.
	 *
	 * @param ptr     the name of the sync object whose label to retrieve
	 * @param bufSize the length of the buffer whose address is in {@code label}
	 * @param length  a variable to receive the length of the object label
	 * @param label   a string that will receive the object label
	 */
	public static void glGetObjectPtrLabel(long ptr, int bufSize, ByteBuffer length, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(label, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetObjectPtrLabel(ptr, bufSize, memAddressSafe(length), memAddress(label));
	}

	/** Alternative version of: {@link #glGetObjectPtrLabel GetObjectPtrLabel} */
	public static void glGetObjectPtrLabel(long ptr, IntBuffer length, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetObjectPtrLabel(ptr, label.remaining(), memAddressSafe(length), memAddress(label));
	}

	/** String return version of: {@link #glGetObjectPtrLabel GetObjectPtrLabel} */
	public static String glGetObjectPtrLabel(long ptr, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int label = __buffer.bufferParam(bufSize);
		nglGetObjectPtrLabel(ptr, bufSize, __buffer.address(length), __buffer.address(label));
		return memDecodeUTF8(memByteBuffer(__buffer.address(label), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetObjectPtrLabel GetObjectPtrLabel} */
	public static String glGetObjectPtrLabel(long ptr) {
		int bufSize = GL11.glGetInteger(GL_MAX_LABEL_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int label = __buffer.bufferParam(bufSize);
		nglGetObjectPtrLabel(ptr, bufSize, __buffer.address(length), __buffer.address(label));
		return memDecodeUTF8(memByteBuffer(__buffer.address(label), __buffer.intValue(length)));
	}

	// --- [ glFramebufferParameteri ] ---

	/** JNI method for {@link #glFramebufferParameteri FramebufferParameteri} */
	@JavadocExclude
	public static native void nglFramebufferParameteri(int target, int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glFramebufferParameteri.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets a named parameter of a framebuffer.
	 *
	 * @param target target of the operation. One of:<br>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}, {@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}
	 * @param pname  a token indicating the parameter to be modified. One of:<br>{@link #GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}, {@link #GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}, {@link #GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}, {@link #GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}, {@link #GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}
	 * @param param  the new value for the parameter named {@code pname}
	 */
	public static void glFramebufferParameteri(int target, int pname, int param) {
		long __functionAddress = getInstance().FramebufferParameteri;
		nglFramebufferParameteri(target, pname, param, __functionAddress);
	}

	// --- [ glGetFramebufferParameteriv ] ---

	/** JNI method for {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
	@JavadocExclude
	public static native void nglGetFramebufferParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
	@JavadocExclude
	public static void nglGetFramebufferParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetFramebufferParameteriv;
		nglGetFramebufferParameteriv(target, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetFramebufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves a named parameter from a framebuffer.
	 *
	 * @param target target of the operation. One of:<br>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}, {@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}
	 * @param pname  a token indicating the parameter to be retrieved. One of:<br>{@link #GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}, {@link #GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}, {@link #GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}, {@link #GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}, {@link #GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}
	 * @param params a variable to receive the value of the parameter named {@code pname}
	 */
	public static void glGetFramebufferParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetFramebufferParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
	public static void glGetFramebufferParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetFramebufferParameteriv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
	public static int glGetFramebufferParameteri(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetFramebufferParameteriv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetInternalformati64v ] ---

	/** JNI method for {@link #glGetInternalformati64v GetInternalformati64v} */
	@JavadocExclude
	public static native void nglGetInternalformati64v(int target, int internalformat, int pname, int bufSize, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetInternalformati64v GetInternalformati64v} */
	@JavadocExclude
	public static void nglGetInternalformati64v(int target, int internalformat, int pname, int bufSize, long params) {
		long __functionAddress = getInstance().GetInternalformati64v;
		nglGetInternalformati64v(target, internalformat, pname, bufSize, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetInternalformat.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves information about implementation-dependent support for internal formats.
	 *
	 * @param target         the usage of the internal format. One of:<br>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL30#GL_RENDERBUFFER RENDERBUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param internalformat the internal format about which to retrieve information
	 * @param pname          the type of information to query
	 * @param bufSize        the maximum number of values that may be written to params by the function
	 * @param params         a variable into which to write the retrieved information
	 */
	public static void glGetInternalformati64v(int target, int internalformat, int pname, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 3);
		nglGetInternalformati64v(target, internalformat, pname, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetInternalformati64v GetInternalformati64v} */
	public static void glGetInternalformati64v(int target, int internalformat, int pname, LongBuffer params) {
		nglGetInternalformati64v(target, internalformat, pname, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetInternalformati64v GetInternalformati64v} */
	public static long glGetInternalformati64(int target, int internalformat, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetInternalformati64v(target, internalformat, pname, 1, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glInvalidateTexSubImage ] ---

	/** JNI method for {@link #glInvalidateTexSubImage InvalidateTexSubImage} */
	@JavadocExclude
	public static native void nglInvalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateTexSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
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
		nglInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, __functionAddress);
	}

	// --- [ glInvalidateTexImage ] ---

	/** JNI method for {@link #glInvalidateTexImage InvalidateTexImage} */
	@JavadocExclude
	public static native void nglInvalidateTexImage(int texture, int level, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Invalidates the entirety of a texture image.
	 *
	 * @param texture the name of a texture object to invalidate
	 * @param level   the level of detail of the texture object to invalidate
	 */
	public static void glInvalidateTexImage(int texture, int level) {
		long __functionAddress = getInstance().InvalidateTexImage;
		nglInvalidateTexImage(texture, level, __functionAddress);
	}

	// --- [ glInvalidateBufferSubData ] ---

	/** JNI method for {@link #glInvalidateBufferSubData InvalidateBufferSubData} */
	@JavadocExclude
	public static native void nglInvalidateBufferSubData(int buffer, long offset, long length, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Invalidates a region of a buffer object's data store.
	 *
	 * @param buffer the name of a buffer object, a subrange of whose data store to invalidate
	 * @param offset the offset within the buffer's data store of the start of the range to be invalidated
	 * @param length the length of the range within the buffer's data store to be invalidated
	 */
	public static void glInvalidateBufferSubData(int buffer, long offset, long length) {
		long __functionAddress = getInstance().InvalidateBufferSubData;
		nglInvalidateBufferSubData(buffer, offset, length, __functionAddress);
	}

	// --- [ glInvalidateBufferData ] ---

	/** JNI method for {@link #glInvalidateBufferData InvalidateBufferData} */
	@JavadocExclude
	public static native void nglInvalidateBufferData(int buffer, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Invalidates the content of a buffer object's data store.
	 *
	 * @param buffer the name of a buffer object whose data store to invalidate
	 */
	public static void glInvalidateBufferData(int buffer) {
		long __functionAddress = getInstance().InvalidateBufferData;
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
		nglInvalidateFramebuffer(target, numAttachments, attachments, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Invalidate the content some or all of a framebuffer object's attachments.
	 *
	 * @param target         the target to which the framebuffer is attached. One of:<br>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}, {@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}
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
		nglInvalidateFramebuffer(target, 1, __buffer.address(attachments));
	}

	// --- [ glInvalidateSubFramebuffer ] ---

	/** JNI method for {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer} */
	@JavadocExclude
	public static native void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height, long __functionAddress);

	/** Unsafe version of {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer} */
	@JavadocExclude
	public static void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height) {
		long __functionAddress = getInstance().InvalidateSubFramebuffer;
		nglInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateSubFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Invalidates the content of a region of some or all of a framebuffer object's attachments.
	 *
	 * @param target         the target to which the framebuffer is attached. One of:<br>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}, {@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}
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
		nglInvalidateSubFramebuffer(target, 1, __buffer.address(attachments), x, y, width, height);
	}

	// --- [ glMultiDrawArraysIndirect ] ---

	/** JNI method for {@link #glMultiDrawArraysIndirect MultiDrawArraysIndirect} */
	@JavadocExclude
	public static native void nglMultiDrawArraysIndirect(int mode, long indirect, int primcount, int stride, long __functionAddress);

	/** Unsafe version of {@link #glMultiDrawArraysIndirect MultiDrawArraysIndirect} */
	@JavadocExclude
	public static void nglMultiDrawArraysIndirect(int mode, long indirect, int primcount, int stride) {
		long __functionAddress = getInstance().MultiDrawArraysIndirect;
		nglMultiDrawArraysIndirect(mode, indirect, primcount, stride, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMultiDrawArraysIndirect.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple sets of primitives from array data, taking parameters from memory.
	 * 
	 * <p>The parameters addressed by {@code indirect} are packed into an array of structures, each element of which takes the form (in C):
	 * <pre><code style="font-family: monospace">
	 * typedef struct {
	 * 	uint count;
	 * 	uint primCount;
	 * 	uint first;
	 * 	uint baseInstance;
	 * } DrawArraysIndirectCommand;</code></pre></p>
	 * 
	 * <p>A single call to {@code glMultiDrawArraysIndirect} is equivalent, assuming no errors are generated to:
	 * <pre><code style="font-family: monospace">
	 * const ubyte *ptr = (const ubyte *)indirect;
	 * for ( i = 0; i < primcount; i++ ) {
	 * 	DrawArraysIndirect(mode, (DrawArraysIndirectCommand*)ptr);
	 * 	if ( stride == 0 )
	 * 		ptr += sizeof(DrawArraysIndirectCommand);
	 * 	else
	 * 		ptr += stride;
	 * }</code></pre></p>
	 *
	 * @param mode      what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param indirect  an array of structures containing the draw parameters
	 * @param primcount the number of elements in the array of draw parameter structures
	 * @param stride    the distance in basic machine units between elements of the draw parameter array
	 */
	public static void glMultiDrawArraysIndirect(int mode, ByteBuffer indirect, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirect, primcount * (stride == 0 ? (4 * 4) : stride));
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglMultiDrawArraysIndirect(mode, memAddress(indirect), primcount, stride);
	}

	/** Buffer object offset version of: {@link #glMultiDrawArraysIndirect MultiDrawArraysIndirect} */
	public static void glMultiDrawArraysIndirect(int mode, long indirectOffset, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, true);
		nglMultiDrawArraysIndirect(mode, indirectOffset, primcount, stride);
	}

	/** IntBuffer version of: {@link #glMultiDrawArraysIndirect MultiDrawArraysIndirect} */
	public static void glMultiDrawArraysIndirect(int mode, IntBuffer indirect, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirect, (primcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
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
		nglMultiDrawElementsIndirect(mode, type, indirect, primcount, stride, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMultiDrawElementsIndirect.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple indexed primitives from array data, taking parameters from memory.
	 * 
	 * <p>The parameters addressed by indirect are packed into a structure that takes the form (in C):
	 * <pre><code style="font-family: monospace">
	 * typedef struct {
	 * 	uint count;
	 * 	uint primCount;
	 * 	uint firstIndex;
	 * 	uint baseVertex;
	 * 	uint baseInstance;
	 * } DrawElementsIndirectCommand;</code></pre></p>
	 * 
	 * <p>A single call to {@code glMultiDrawElementsIndirect} is equivalent, assuming no errors are generated to:
	 * <pre><code style="font-family: monospace">
	 * const ubyte *ptr = (const ubyte *)indirect;
	 * for ( i = 0; i < primcount; i++ ) {
	 * 	DrawElementsIndirect(mode, type, (DrawElementsIndirectCommand *)ptr);
	 * 	if ( stride == 0 )
	 * 		ptr += sizeof(DrawElementsIndirectCommand);
	 * 	else
	 * 		ptr += stride;
	 * }</code></pre></p>
	 *
	 * @param mode      what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param type      the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indirect  a structure containing an array of draw parameters
	 * @param primcount the number of elements in the array addressed by {@code indirect}
	 * @param stride    the distance in basic machine units between elements of the draw parameter array
	 */
	public static void glMultiDrawElementsIndirect(int mode, int type, ByteBuffer indirect, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirect, primcount * (stride == 0 ? (5 * 4) : stride));
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglMultiDrawElementsIndirect(mode, type, memAddress(indirect), primcount, stride);
	}

	/** Buffer object offset version of: {@link #glMultiDrawElementsIndirect MultiDrawElementsIndirect} */
	public static void glMultiDrawElementsIndirect(int mode, int type, long indirectOffset, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, true);
		nglMultiDrawElementsIndirect(mode, type, indirectOffset, primcount, stride);
	}

	/** IntBuffer version of: {@link #glMultiDrawElementsIndirect MultiDrawElementsIndirect} */
	public static void glMultiDrawElementsIndirect(int mode, int type, IntBuffer indirect, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirect, (primcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglMultiDrawElementsIndirect(mode, type, memAddress(indirect), primcount, stride);
	}

	// --- [ glGetProgramInterfaceiv ] ---

	/** JNI method for {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
	@JavadocExclude
	public static native void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
	@JavadocExclude
	public static void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
		long __functionAddress = getInstance().GetProgramInterfaceiv;
		nglGetProgramInterfaceiv(program, programInterface, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetProgramInterface.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries a property of an interface in a program.
	 *
	 * @param program          the name of a program object whose interface to query
	 * @param programInterface a token identifying the interface within {@code program} to query. One of:<br>{@link #GL_UNIFORM UNIFORM}, {@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}, {@link #GL_PROGRAM_INPUT PROGRAM_INPUT}, {@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}, {@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}, {@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}, {@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}, {@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}, {@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}, {@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}, {@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}, {@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}, {@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}, {@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}, {@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}, {@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}, {@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}, {@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}, {@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}
	 * @param pname            the name of the parameter within {@code programInterface} to query. One of:<br>{@link #GL_ACTIVE_RESOURCES ACTIVE_RESOURCES}, {@link #GL_MAX_NAME_LENGTH MAX_NAME_LENGTH}, {@link #GL_MAX_NUM_ACTIVE_VARIABLES MAX_NUM_ACTIVE_VARIABLES}, {@link #GL_MAX_NUM_COMPATIBLE_SUBROUTINES MAX_NUM_COMPATIBLE_SUBROUTINES}
	 * @param params           a variable to retrieve the value of {@code pname} for the program interface
	 */
	public static void glGetProgramInterfaceiv(int program, int programInterface, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
	public static void glGetProgramInterfaceiv(int program, int programInterface, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
	public static int glGetProgramInterfacei(int program, int programInterface, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetProgramInterfaceiv(program, programInterface, pname, __buffer.address(params));
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
		return nglGetProgramResourceIndex(program, programInterface, name, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetProgramResourceIndex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the index of a named resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {Wcode name}. One of:<br>{@link #GL_UNIFORM UNIFORM}, {@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}, {@link #GL_PROGRAM_INPUT PROGRAM_INPUT}, {@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}, {@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}, {@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}, {@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}, {@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}, {@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}, {@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}, {@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}, {@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}, {@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}, {@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}, {@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}, {@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}, {@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}, {@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}, {@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}
	 * @param name             the name of the resource to query the index of
	 */
	public static int glGetProgramResourceIndex(int program, int programInterface, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetProgramResourceIndex(program, programInterface, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetProgramResourceIndex GetProgramResourceIndex} */
	public static int glGetProgramResourceIndex(int program, int programInterface, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nglGetProgramResourceIndex(program, programInterface, __buffer.address(nameEncoded));
	}

	// --- [ glGetProgramResourceName ] ---

	/** JNI method for {@link #glGetProgramResourceName GetProgramResourceName} */
	@JavadocExclude
	public static native void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourceName GetProgramResourceName} */
	@JavadocExclude
	public static void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
		long __functionAddress = getInstance().GetProgramResourceName;
		nglGetProgramResourceName(program, programInterface, index, bufSize, length, name, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetProgramResourceName.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the name of an indexed resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the indexed resource. One of:<br>{@link #GL_UNIFORM UNIFORM}, {@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}, {@link #GL_PROGRAM_INPUT PROGRAM_INPUT}, {@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}, {@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}, {@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}, {@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}, {@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}, {@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}, {@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}, {@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}, {@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}, {@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}, {@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}, {@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}, {@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}, {@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}, {@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}, {@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}
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
		nglGetProgramResourceName(program, programInterface, index, bufSize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetProgramResourceName GetProgramResourceName} */
	public static String glGetProgramResourceName(int program, int programInterface, int index) {
		int bufSize = glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetProgramResourceName(program, programInterface, index, bufSize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	// --- [ glGetProgramResourceiv ] ---

	/** JNI method for {@link #glGetProgramResourceiv GetProgramResourceiv} */
	@JavadocExclude
	public static native void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourceiv GetProgramResourceiv} */
	@JavadocExclude
	public static void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
		long __functionAddress = getInstance().GetProgramResourceiv;
		nglGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetProgramResource.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves values for multiple properties of a single active resource within a program object.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. One of:<br>{@link #GL_UNIFORM UNIFORM}, {@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}, {@link #GL_PROGRAM_INPUT PROGRAM_INPUT}, {@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}, {@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}, {@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}, {@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}, {@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}, {@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}, {@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}, {@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}, {@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}, {@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}, {@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}, {@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}, {@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}, {@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}, {@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}, {@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}
	 * @param index            the active resource index
	 * @param propCount        the number of properties in {@code props}
	 * @param props            an array that will receive the active resource properties
	 * @param bufSize          the size of the integer array whose address is given by {@code params}
	 * @param length           a variable which will receive the number of values returned
	 * @param params           an array that will receive the property values
	 */
	public static void glGetProgramResourceiv(int program, int programInterface, int index, int propCount, ByteBuffer props, int bufSize, ByteBuffer length, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(props, propCount << 2);
			checkBuffer(params, bufSize << 2);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramResourceiv(program, programInterface, index, propCount, memAddress(props), bufSize, memAddressSafe(length), memAddress(params));
	}

	/** Alternative version of: {@link #glGetProgramResourceiv GetProgramResourceiv} */
	public static void glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, IntBuffer length, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramResourceiv(program, programInterface, index, props.remaining(), memAddress(props), params.remaining(), memAddressSafe(length), memAddress(params));
	}

	/** Buffer return version of: {@link #glGetProgramResourceiv GetProgramResourceiv} */
	public static IntBuffer glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int params = __buffer.bufferParam(bufSize << 2);
		nglGetProgramResourceiv(program, programInterface, index, props.remaining(), memAddress(props), bufSize, __buffer.address(length), __buffer.address(params));
		return memIntBuffer(__buffer.address(params), __buffer.intValue(length));
	}

	// --- [ glGetProgramResourceLocation ] ---

	/** JNI method for {@link #glGetProgramResourceLocation GetProgramResourceLocation} */
	@JavadocExclude
	public static native int nglGetProgramResourceLocation(int program, int programInterface, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourceLocation GetProgramResourceLocation} */
	@JavadocExclude
	public static int nglGetProgramResourceLocation(int program, int programInterface, long name) {
		long __functionAddress = getInstance().GetProgramResourceLocation;
		return nglGetProgramResourceLocation(program, programInterface, name, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetProgramResourceLocation.xhtml">OpenGL SDK Reference</a></p>
	 * 
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
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetProgramResourceLocation(program, programInterface, __buffer.address(nameEncoded));
	}

	// --- [ glGetProgramResourceLocationIndex ] ---

	/** JNI method for {@link #glGetProgramResourceLocationIndex GetProgramResourceLocationIndex} */
	@JavadocExclude
	public static native int nglGetProgramResourceLocationIndex(int program, int programInterface, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourceLocationIndex GetProgramResourceLocationIndex} */
	@JavadocExclude
	public static int nglGetProgramResourceLocationIndex(int program, int programInterface, long name) {
		long __functionAddress = getInstance().GetProgramResourceLocationIndex;
		return nglGetProgramResourceLocationIndex(program, programInterface, name, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetProgramResourceLocationIndex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the fragment color index of a named variable within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. Must be:<br>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}
	 * @param name             the name of the resource to query the location of
	 */
	public static int glGetProgramResourceLocationIndex(int program, int programInterface, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetProgramResourceLocationIndex(program, programInterface, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetProgramResourceLocationIndex GetProgramResourceLocationIndex} */
	public static int glGetProgramResourceLocationIndex(int program, int programInterface, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetProgramResourceLocationIndex(program, programInterface, __buffer.address(nameEncoded));
	}

	// --- [ glShaderStorageBlockBinding ] ---

	/** JNI method for {@link #glShaderStorageBlockBinding ShaderStorageBlockBinding} */
	@JavadocExclude
	public static native void nglShaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glShaderStorageBlockBinding.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Changes an active shader storage block binding.
	 *
	 * @param program             the name of the program containing the block whose binding to change
	 * @param storageBlockIndex   the index storage block within the program
	 * @param storageBlockBinding the index storage block binding to associate with the specified storage block
	 */
	public static void glShaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding) {
		long __functionAddress = getInstance().ShaderStorageBlockBinding;
		nglShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding, __functionAddress);
	}

	// --- [ glTexBufferRange ] ---

	/** JNI method for {@link #glTexBufferRange TexBufferRange} */
	@JavadocExclude
	public static native void nglTexBufferRange(int target, int internalformat, int buffer, long offset, long size, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexBufferRange.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a range of a buffer's data store to a buffer texture.
	 *
	 * @param target         the target of the operation. Must be:<br>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}
	 * @param internalformat the internal format of the data in the store belonging to {@code buffer}
	 * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
	 * @param offset         the offset of the start of the range of the buffer's data store to attach
	 * @param size           the size of the range of the buffer's data store to attach
	 */
	public static void glTexBufferRange(int target, int internalformat, int buffer, long offset, long size) {
		long __functionAddress = getInstance().TexBufferRange;
		nglTexBufferRange(target, internalformat, buffer, offset, size, __functionAddress);
	}

	// --- [ glTexStorage2DMultisample ] ---

	/** JNI method for {@link #glTexStorage2DMultisample TexStorage2DMultisample} */
	@JavadocExclude
	public static native void nglTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexStorage2DMultisample.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies storage for a two-dimensional multisample texture.
	 *
	 * @param target               the target of the operation. One of:<br>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}
	 * @param samples              the number of samples in the texture
	 * @param internalformat       the sized internal format to be used to store texture image data
	 * @param width                the width of the texture, in texels
	 * @param height               the height of the texture, in texels
	 * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
	 *                             depend on the internal format or size of the image
	 */
	public static void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
		long __functionAddress = getInstance().TexStorage2DMultisample;
		nglTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations, __functionAddress);
	}

	// --- [ glTexStorage3DMultisample ] ---

	/** JNI method for {@link #glTexStorage3DMultisample TexStorage3DMultisample} */
	@JavadocExclude
	public static native void nglTexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexStorage3DMultisample.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies storage for a two-dimensional multisample array texture.
	 *
	 * @param target               the target of the operation. One of:<br>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}, {@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}
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
		nglTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations, __functionAddress);
	}

	// --- [ glTextureView ] ---

	/** JNI method for {@link #glTextureView TextureView} */
	@JavadocExclude
	public static native void nglTextureView(int texture, int target, int origtexture, int internalformat, int minlevel, int numlevels, int minlayer, int numlayers, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureView.xhtml">OpenGL SDK Reference</a></p>
	 * 
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
		nglTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers, __functionAddress);
	}

	// --- [ glBindVertexBuffer ] ---

	/** JNI method for {@link #glBindVertexBuffer BindVertexBuffer} */
	@JavadocExclude
	public static native void nglBindVertexBuffer(int bindingindex, int buffer, long offset, int stride, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindVertexBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a buffer to a vertex buffer bind point.
	 *
	 * @param bindingindex the index of the vertex buffer binding point to which to bind the buffer
	 * @param buffer       the name of an existing buffer to bind to the vertex buffer binding point
	 * @param offset       the offset of the first element of the buffer
	 * @param stride       the distance between elements within the buffer
	 */
	public static void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
		long __functionAddress = getInstance().BindVertexBuffer;
		nglBindVertexBuffer(bindingindex, buffer, offset, stride, __functionAddress);
	}

	// --- [ glVertexAttribFormat ] ---

	/** JNI method for {@link #glVertexAttribFormat VertexAttribFormat} */
	@JavadocExclude
	public static native void nglVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribFormat.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the organization of data in vertex arrays.
	 *
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param normalized     if true then integer data is normalized to the range [-1, 1] or [0, 1] if it is signed or unsigned, respectively. If false then integer data is
	 *                       directly converted to floating point.
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
		long __functionAddress = getInstance().VertexAttribFormat;
		nglVertexAttribFormat(attribindex, size, type, normalized, relativeoffset, __functionAddress);
	}

	// --- [ glVertexAttribIFormat ] ---

	/** JNI method for {@link #glVertexAttribIFormat VertexAttribIFormat} */
	@JavadocExclude
	public static native void nglVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribIFormat.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the organization of pure integer data in vertex arrays.
	 *
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = getInstance().VertexAttribIFormat;
		nglVertexAttribIFormat(attribindex, size, type, relativeoffset, __functionAddress);
	}

	// --- [ glVertexAttribLFormat ] ---

	/** JNI method for {@link #glVertexAttribLFormat VertexAttribLFormat} */
	@JavadocExclude
	public static native void nglVertexAttribLFormat(int attribindex, int size, int type, int relativeoffset, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribLFormat.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the organization of 64-bit double data in vertex arrays.
	 *
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexAttribLFormat(int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = getInstance().VertexAttribLFormat;
		nglVertexAttribLFormat(attribindex, size, type, relativeoffset, __functionAddress);
	}

	// --- [ glVertexAttribBinding ] ---

	/** JNI method for {@link #glVertexAttribBinding VertexAttribBinding} */
	@JavadocExclude
	public static native void nglVertexAttribBinding(int attribindex, int bindingindex, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribBinding.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Associate a vertex attribute and a vertex buffer binding.
	 *
	 * @param attribindex  the index of the attribute to associate with a vertex buffer binding
	 * @param bindingindex the index of the vertex buffer binding with which to associate the generic vertex attribute
	 */
	public static void glVertexAttribBinding(int attribindex, int bindingindex) {
		long __functionAddress = getInstance().VertexAttribBinding;
		nglVertexAttribBinding(attribindex, bindingindex, __functionAddress);
	}

	// --- [ glVertexBindingDivisor ] ---

	/** JNI method for {@link #glVertexBindingDivisor VertexBindingDivisor} */
	@JavadocExclude
	public static native void nglVertexBindingDivisor(int bindingindex, int divisor, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexBindingDivisor.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Modifies the rate at which generic vertex attributes advance during instanced rendering.
	 *
	 * @param bindingindex the index of the generic vertex attribute
	 * @param divisor      the number of instances that will pass between updates of the generic attribute at slot {@code index}
	 */
	public static void glVertexBindingDivisor(int bindingindex, int divisor) {
		long __functionAddress = getInstance().VertexBindingDivisor;
		nglVertexBindingDivisor(bindingindex, divisor, __functionAddress);
	}

     /**
	 * Creates a {@link GLDebugMessageCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLDebugMessageCallback} instance
	 */
	public static GLDebugMessageCallback GLDebugMessageCallback(final GLDebugMessageCallback.SAM sam) {
		return new GLDebugMessageCallback() {
			@Override
			public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
				sam.invoke(source, type, id, severity, length, message, userParam);
			}
		};
	}

}