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

/**
 * The core OpenGL 1.1 functionality.
 * 
 * <p>Extensions promoted to core in this release:
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/vertex_array.txt">EXT_vertex_array</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/polygon_offset.txt">EXT_polygon_offset</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/blend_logic_op.txt">EXT_blend_logic_op</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/texture.txt">EXT_texture</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/copy_texture.txt">EXT_copy_texture</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/subtexture.txt">EXT_subtexture</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/texture_object.txt">EXT_texture_object</a></li>
 * </ul></p>
 */
public final class GL11 {

	/** AccumOp */
	public static final int
		GL_ACCUM  = 0x100,
		GL_LOAD   = 0x101,
		GL_RETURN = 0x102,
		GL_MULT   = 0x103,
		GL_ADD    = 0x104;

	/** AlphaFunction */
	public static final int
		GL_NEVER    = 0x200,
		GL_LESS     = 0x201,
		GL_EQUAL    = 0x202,
		GL_LEQUAL   = 0x203,
		GL_GREATER  = 0x204,
		GL_NOTEQUAL = 0x205,
		GL_GEQUAL   = 0x206,
		GL_ALWAYS   = 0x207;

	/** AttribMask */
	public static final int
		GL_CURRENT_BIT         = 0x1,
		GL_POINT_BIT           = 0x2,
		GL_LINE_BIT            = 0x4,
		GL_POLYGON_BIT         = 0x8,
		GL_POLYGON_STIPPLE_BIT = 0x10,
		GL_PIXEL_MODE_BIT      = 0x20,
		GL_LIGHTING_BIT        = 0x40,
		GL_FOG_BIT             = 0x80,
		GL_DEPTH_BUFFER_BIT    = 0x100,
		GL_ACCUM_BUFFER_BIT    = 0x200,
		GL_STENCIL_BUFFER_BIT  = 0x400,
		GL_VIEWPORT_BIT        = 0x800,
		GL_TRANSFORM_BIT       = 0x1000,
		GL_ENABLE_BIT          = 0x2000,
		GL_COLOR_BUFFER_BIT    = 0x4000,
		GL_HINT_BIT            = 0x8000,
		GL_EVAL_BIT            = 0x10000,
		GL_LIST_BIT            = 0x20000,
		GL_TEXTURE_BIT         = 0x40000,
		GL_SCISSOR_BIT         = 0x80000,
		GL_ALL_ATTRIB_BITS     = 0xFFFFF;

	/** BeginMode */
	public static final int
		GL_POINTS         = 0x0,
		GL_LINES          = 0x1,
		GL_LINE_LOOP      = 0x2,
		GL_LINE_STRIP     = 0x3,
		GL_TRIANGLES      = 0x4,
		GL_TRIANGLE_STRIP = 0x5,
		GL_TRIANGLE_FAN   = 0x6,
		GL_QUADS          = 0x7,
		GL_QUAD_STRIP     = 0x8,
		GL_POLYGON        = 0x9;

	/** BlendingFactorDest */
	public static final int
		GL_ZERO                = 0x0,
		GL_ONE                 = 0x1,
		GL_SRC_COLOR           = 0x300,
		GL_ONE_MINUS_SRC_COLOR = 0x301,
		GL_SRC_ALPHA           = 0x302,
		GL_ONE_MINUS_SRC_ALPHA = 0x303,
		GL_DST_ALPHA           = 0x304,
		GL_ONE_MINUS_DST_ALPHA = 0x305;

	/** BlendingFactorSrc */
	public static final int
		GL_DST_COLOR                = 0x306,
		GL_ONE_MINUS_DST_COLOR      = 0x307,
		GL_SRC_ALPHA_SATURATE       = 0x308,
		GL_CONSTANT_COLOR           = 0x8001,
		GL_ONE_MINUS_CONSTANT_COLOR = 0x8002,
		GL_CONSTANT_ALPHA           = 0x8003,
		GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;

	/** Boolean */
	public static final int
		GL_TRUE  = 0x1,
		GL_FALSE = 0x0;

	/** ClipPlaneName */
	public static final int
		GL_CLIP_PLANE0 = 0x3000,
		GL_CLIP_PLANE1 = 0x3001,
		GL_CLIP_PLANE2 = 0x3002,
		GL_CLIP_PLANE3 = 0x3003,
		GL_CLIP_PLANE4 = 0x3004,
		GL_CLIP_PLANE5 = 0x3005;

	/** DataType */
	public static final int
		GL_BYTE           = 0x1400,
		GL_UNSIGNED_BYTE  = 0x1401,
		GL_SHORT          = 0x1402,
		GL_UNSIGNED_SHORT = 0x1403,
		GL_INT            = 0x1404,
		GL_UNSIGNED_INT   = 0x1405,
		GL_FLOAT          = 0x1406,
		GL_2_BYTES        = 0x1407,
		GL_3_BYTES        = 0x1408,
		GL_4_BYTES        = 0x1409,
		GL_DOUBLE         = 0x140A;

	/** DrawBufferMode */
	public static final int
		GL_NONE           = 0x0,
		GL_FRONT_LEFT     = 0x400,
		GL_FRONT_RIGHT    = 0x401,
		GL_BACK_LEFT      = 0x402,
		GL_BACK_RIGHT     = 0x403,
		GL_FRONT          = 0x404,
		GL_BACK           = 0x405,
		GL_LEFT           = 0x406,
		GL_RIGHT          = 0x407,
		GL_FRONT_AND_BACK = 0x408,
		GL_AUX0           = 0x409,
		GL_AUX1           = 0x40A,
		GL_AUX2           = 0x40B,
		GL_AUX3           = 0x40C;

	/** ErrorCode */
	public static final int
		GL_NO_ERROR          = 0x0,
		GL_INVALID_ENUM      = 0x500,
		GL_INVALID_VALUE     = 0x501,
		GL_INVALID_OPERATION = 0x502,
		GL_STACK_OVERFLOW    = 0x503,
		GL_STACK_UNDERFLOW   = 0x504,
		GL_OUT_OF_MEMORY     = 0x505;

	/** FeedBackMode */
	public static final int
		GL_2D               = 0x600,
		GL_3D               = 0x601,
		GL_3D_COLOR         = 0x602,
		GL_3D_COLOR_TEXTURE = 0x603,
		GL_4D_COLOR_TEXTURE = 0x604;

	/** FeedBackToken */
	public static final int
		GL_PASS_THROUGH_TOKEN = 0x700,
		GL_POINT_TOKEN        = 0x701,
		GL_LINE_TOKEN         = 0x702,
		GL_POLYGON_TOKEN      = 0x703,
		GL_BITMAP_TOKEN       = 0x704,
		GL_DRAW_PIXEL_TOKEN   = 0x705,
		GL_COPY_PIXEL_TOKEN   = 0x706,
		GL_LINE_RESET_TOKEN   = 0x707;

	/** FogMode */
	public static final int
		GL_EXP  = 0x800,
		GL_EXP2 = 0x801;

	/** FrontFaceDirection */
	public static final int
		GL_CW  = 0x900,
		GL_CCW = 0x901;

	/** GetMapTarget */
	public static final int
		GL_COEFF  = 0xA00,
		GL_ORDER  = 0xA01,
		GL_DOMAIN = 0xA02;

	/** GetTarget */
	public static final int
		GL_CURRENT_COLOR                 = 0xB00,
		GL_CURRENT_INDEX                 = 0xB01,
		GL_CURRENT_NORMAL                = 0xB02,
		GL_CURRENT_TEXTURE_COORDS        = 0xB03,
		GL_CURRENT_RASTER_COLOR          = 0xB04,
		GL_CURRENT_RASTER_INDEX          = 0xB05,
		GL_CURRENT_RASTER_TEXTURE_COORDS = 0xB06,
		GL_CURRENT_RASTER_POSITION       = 0xB07,
		GL_CURRENT_RASTER_POSITION_VALID = 0xB08,
		GL_CURRENT_RASTER_DISTANCE       = 0xB09,
		GL_POINT_SMOOTH                  = 0xB10,
		GL_POINT_SIZE                    = 0xB11,
		GL_POINT_SIZE_RANGE              = 0xB12,
		GL_POINT_SIZE_GRANULARITY        = 0xB13,
		GL_LINE_SMOOTH                   = 0xB20,
		GL_LINE_WIDTH                    = 0xB21,
		GL_LINE_WIDTH_RANGE              = 0xB22,
		GL_LINE_WIDTH_GRANULARITY        = 0xB23,
		GL_LINE_STIPPLE                  = 0xB24,
		GL_LINE_STIPPLE_PATTERN          = 0xB25,
		GL_LINE_STIPPLE_REPEAT           = 0xB26,
		GL_LIST_MODE                     = 0xB30,
		GL_MAX_LIST_NESTING              = 0xB31,
		GL_LIST_BASE                     = 0xB32,
		GL_LIST_INDEX                    = 0xB33,
		GL_POLYGON_MODE                  = 0xB40,
		GL_POLYGON_SMOOTH                = 0xB41,
		GL_POLYGON_STIPPLE               = 0xB42,
		GL_EDGE_FLAG                     = 0xB43,
		GL_CULL_FACE                     = 0xB44,
		GL_CULL_FACE_MODE                = 0xB45,
		GL_FRONT_FACE                    = 0xB46,
		GL_LIGHTING                      = 0xB50,
		GL_LIGHT_MODEL_LOCAL_VIEWER      = 0xB51,
		GL_LIGHT_MODEL_TWO_SIDE          = 0xB52,
		GL_LIGHT_MODEL_AMBIENT           = 0xB53,
		GL_SHADE_MODEL                   = 0xB54,
		GL_COLOR_MATERIAL_FACE           = 0xB55,
		GL_COLOR_MATERIAL_PARAMETER      = 0xB56,
		GL_COLOR_MATERIAL                = 0xB57,
		GL_FOG                           = 0xB60,
		GL_FOG_INDEX                     = 0xB61,
		GL_FOG_DENSITY                   = 0xB62,
		GL_FOG_START                     = 0xB63,
		GL_FOG_END                       = 0xB64,
		GL_FOG_MODE                      = 0xB65,
		GL_FOG_COLOR                     = 0xB66,
		GL_DEPTH_RANGE                   = 0xB70,
		GL_DEPTH_TEST                    = 0xB71,
		GL_DEPTH_WRITEMASK               = 0xB72,
		GL_DEPTH_CLEAR_VALUE             = 0xB73,
		GL_DEPTH_FUNC                    = 0xB74,
		GL_ACCUM_CLEAR_VALUE             = 0xB80,
		GL_STENCIL_TEST                  = 0xB90,
		GL_STENCIL_CLEAR_VALUE           = 0xB91,
		GL_STENCIL_FUNC                  = 0xB92,
		GL_STENCIL_VALUE_MASK            = 0xB93,
		GL_STENCIL_FAIL                  = 0xB94,
		GL_STENCIL_PASS_DEPTH_FAIL       = 0xB95,
		GL_STENCIL_PASS_DEPTH_PASS       = 0xB96,
		GL_STENCIL_REF                   = 0xB97,
		GL_STENCIL_WRITEMASK             = 0xB98,
		GL_MATRIX_MODE                   = 0xBA0,
		GL_NORMALIZE                     = 0xBA1,
		GL_VIEWPORT                      = 0xBA2,
		GL_MODELVIEW_STACK_DEPTH         = 0xBA3,
		GL_PROJECTION_STACK_DEPTH        = 0xBA4,
		GL_TEXTURE_STACK_DEPTH           = 0xBA5,
		GL_MODELVIEW_MATRIX              = 0xBA6,
		GL_PROJECTION_MATRIX             = 0xBA7,
		GL_TEXTURE_MATRIX                = 0xBA8,
		GL_ATTRIB_STACK_DEPTH            = 0xBB0,
		GL_CLIENT_ATTRIB_STACK_DEPTH     = 0xBB1,
		GL_ALPHA_TEST                    = 0xBC0,
		GL_ALPHA_TEST_FUNC               = 0xBC1,
		GL_ALPHA_TEST_REF                = 0xBC2,
		GL_DITHER                        = 0xBD0,
		GL_BLEND_DST                     = 0xBE0,
		GL_BLEND_SRC                     = 0xBE1,
		GL_BLEND                         = 0xBE2,
		GL_LOGIC_OP_MODE                 = 0xBF0,
		GL_INDEX_LOGIC_OP                = 0xBF1,
		GL_COLOR_LOGIC_OP                = 0xBF2,
		GL_AUX_BUFFERS                   = 0xC00,
		GL_DRAW_BUFFER                   = 0xC01,
		GL_READ_BUFFER                   = 0xC02,
		GL_SCISSOR_BOX                   = 0xC10,
		GL_SCISSOR_TEST                  = 0xC11,
		GL_INDEX_CLEAR_VALUE             = 0xC20,
		GL_INDEX_WRITEMASK               = 0xC21,
		GL_COLOR_CLEAR_VALUE             = 0xC22,
		GL_COLOR_WRITEMASK               = 0xC23,
		GL_INDEX_MODE                    = 0xC30,
		GL_RGBA_MODE                     = 0xC31,
		GL_DOUBLEBUFFER                  = 0xC32,
		GL_STEREO                        = 0xC33,
		GL_RENDER_MODE                   = 0xC40,
		GL_PERSPECTIVE_CORRECTION_HINT   = 0xC50,
		GL_POINT_SMOOTH_HINT             = 0xC51,
		GL_LINE_SMOOTH_HINT              = 0xC52,
		GL_POLYGON_SMOOTH_HINT           = 0xC53,
		GL_FOG_HINT                      = 0xC54,
		GL_TEXTURE_GEN_S                 = 0xC60,
		GL_TEXTURE_GEN_T                 = 0xC61,
		GL_TEXTURE_GEN_R                 = 0xC62,
		GL_TEXTURE_GEN_Q                 = 0xC63,
		GL_PIXEL_MAP_I_TO_I              = 0xC70,
		GL_PIXEL_MAP_S_TO_S              = 0xC71,
		GL_PIXEL_MAP_I_TO_R              = 0xC72,
		GL_PIXEL_MAP_I_TO_G              = 0xC73,
		GL_PIXEL_MAP_I_TO_B              = 0xC74,
		GL_PIXEL_MAP_I_TO_A              = 0xC75,
		GL_PIXEL_MAP_R_TO_R              = 0xC76,
		GL_PIXEL_MAP_G_TO_G              = 0xC77,
		GL_PIXEL_MAP_B_TO_B              = 0xC78,
		GL_PIXEL_MAP_A_TO_A              = 0xC79,
		GL_PIXEL_MAP_I_TO_I_SIZE         = 0xCB0,
		GL_PIXEL_MAP_S_TO_S_SIZE         = 0xCB1,
		GL_PIXEL_MAP_I_TO_R_SIZE         = 0xCB2,
		GL_PIXEL_MAP_I_TO_G_SIZE         = 0xCB3,
		GL_PIXEL_MAP_I_TO_B_SIZE         = 0xCB4,
		GL_PIXEL_MAP_I_TO_A_SIZE         = 0xCB5,
		GL_PIXEL_MAP_R_TO_R_SIZE         = 0xCB6,
		GL_PIXEL_MAP_G_TO_G_SIZE         = 0xCB7,
		GL_PIXEL_MAP_B_TO_B_SIZE         = 0xCB8,
		GL_PIXEL_MAP_A_TO_A_SIZE         = 0xCB9,
		GL_UNPACK_SWAP_BYTES             = 0xCF0,
		GL_UNPACK_LSB_FIRST              = 0xCF1,
		GL_UNPACK_ROW_LENGTH             = 0xCF2,
		GL_UNPACK_SKIP_ROWS              = 0xCF3,
		GL_UNPACK_SKIP_PIXELS            = 0xCF4,
		GL_UNPACK_ALIGNMENT              = 0xCF5,
		GL_PACK_SWAP_BYTES               = 0xD00,
		GL_PACK_LSB_FIRST                = 0xD01,
		GL_PACK_ROW_LENGTH               = 0xD02,
		GL_PACK_SKIP_ROWS                = 0xD03,
		GL_PACK_SKIP_PIXELS              = 0xD04,
		GL_PACK_ALIGNMENT                = 0xD05,
		GL_MAP_COLOR                     = 0xD10,
		GL_MAP_STENCIL                   = 0xD11,
		GL_INDEX_SHIFT                   = 0xD12,
		GL_INDEX_OFFSET                  = 0xD13,
		GL_RED_SCALE                     = 0xD14,
		GL_RED_BIAS                      = 0xD15,
		GL_ZOOM_X                        = 0xD16,
		GL_ZOOM_Y                        = 0xD17,
		GL_GREEN_SCALE                   = 0xD18,
		GL_GREEN_BIAS                    = 0xD19,
		GL_BLUE_SCALE                    = 0xD1A,
		GL_BLUE_BIAS                     = 0xD1B,
		GL_ALPHA_SCALE                   = 0xD1C,
		GL_ALPHA_BIAS                    = 0xD1D,
		GL_DEPTH_SCALE                   = 0xD1E,
		GL_DEPTH_BIAS                    = 0xD1F,
		GL_MAX_EVAL_ORDER                = 0xD30,
		GL_MAX_LIGHTS                    = 0xD31,
		GL_MAX_CLIP_PLANES               = 0xD32,
		GL_MAX_TEXTURE_SIZE              = 0xD33,
		GL_MAX_PIXEL_MAP_TABLE           = 0xD34,
		GL_MAX_ATTRIB_STACK_DEPTH        = 0xD35,
		GL_MAX_MODELVIEW_STACK_DEPTH     = 0xD36,
		GL_MAX_NAME_STACK_DEPTH          = 0xD37,
		GL_MAX_PROJECTION_STACK_DEPTH    = 0xD38,
		GL_MAX_TEXTURE_STACK_DEPTH       = 0xD39,
		GL_MAX_VIEWPORT_DIMS             = 0xD3A,
		GL_MAX_CLIENT_ATTRIB_STACK_DEPTH = 0xD3B,
		GL_SUBPIXEL_BITS                 = 0xD50,
		GL_INDEX_BITS                    = 0xD51,
		GL_RED_BITS                      = 0xD52,
		GL_GREEN_BITS                    = 0xD53,
		GL_BLUE_BITS                     = 0xD54,
		GL_ALPHA_BITS                    = 0xD55,
		GL_DEPTH_BITS                    = 0xD56,
		GL_STENCIL_BITS                  = 0xD57,
		GL_ACCUM_RED_BITS                = 0xD58,
		GL_ACCUM_GREEN_BITS              = 0xD59,
		GL_ACCUM_BLUE_BITS               = 0xD5A,
		GL_ACCUM_ALPHA_BITS              = 0xD5B,
		GL_NAME_STACK_DEPTH              = 0xD70,
		GL_AUTO_NORMAL                   = 0xD80,
		GL_MAP1_COLOR_4                  = 0xD90,
		GL_MAP1_INDEX                    = 0xD91,
		GL_MAP1_NORMAL                   = 0xD92,
		GL_MAP1_TEXTURE_COORD_1          = 0xD93,
		GL_MAP1_TEXTURE_COORD_2          = 0xD94,
		GL_MAP1_TEXTURE_COORD_3          = 0xD95,
		GL_MAP1_TEXTURE_COORD_4          = 0xD96,
		GL_MAP1_VERTEX_3                 = 0xD97,
		GL_MAP1_VERTEX_4                 = 0xD98,
		GL_MAP2_COLOR_4                  = 0xDB0,
		GL_MAP2_INDEX                    = 0xDB1,
		GL_MAP2_NORMAL                   = 0xDB2,
		GL_MAP2_TEXTURE_COORD_1          = 0xDB3,
		GL_MAP2_TEXTURE_COORD_2          = 0xDB4,
		GL_MAP2_TEXTURE_COORD_3          = 0xDB5,
		GL_MAP2_TEXTURE_COORD_4          = 0xDB6,
		GL_MAP2_VERTEX_3                 = 0xDB7,
		GL_MAP2_VERTEX_4                 = 0xDB8,
		GL_MAP1_GRID_DOMAIN              = 0xDD0,
		GL_MAP1_GRID_SEGMENTS            = 0xDD1,
		GL_MAP2_GRID_DOMAIN              = 0xDD2,
		GL_MAP2_GRID_SEGMENTS            = 0xDD3,
		GL_TEXTURE_1D                    = 0xDE0,
		GL_TEXTURE_2D                    = 0xDE1,
		GL_FEEDBACK_BUFFER_POINTER       = 0xDF0,
		GL_FEEDBACK_BUFFER_SIZE          = 0xDF1,
		GL_FEEDBACK_BUFFER_TYPE          = 0xDF2,
		GL_SELECTION_BUFFER_POINTER      = 0xDF3,
		GL_SELECTION_BUFFER_SIZE         = 0xDF4;

	/** GetTextureParameter */
	public static final int
		GL_TEXTURE_WIDTH           = 0x1000,
		GL_TEXTURE_HEIGHT          = 0x1001,
		GL_TEXTURE_INTERNAL_FORMAT = 0x1003,
		GL_TEXTURE_BORDER_COLOR    = 0x1004,
		GL_TEXTURE_BORDER          = 0x1005;

	/** HintMode */
	public static final int
		GL_DONT_CARE = 0x1100,
		GL_FASTEST   = 0x1101,
		GL_NICEST    = 0x1102;

	/** LightName */
	public static final int
		GL_LIGHT0 = 0x4000,
		GL_LIGHT1 = 0x4001,
		GL_LIGHT2 = 0x4002,
		GL_LIGHT3 = 0x4003,
		GL_LIGHT4 = 0x4004,
		GL_LIGHT5 = 0x4005,
		GL_LIGHT6 = 0x4006,
		GL_LIGHT7 = 0x4007;

	/** LightParameter */
	public static final int
		GL_AMBIENT               = 0x1200,
		GL_DIFFUSE               = 0x1201,
		GL_SPECULAR              = 0x1202,
		GL_POSITION              = 0x1203,
		GL_SPOT_DIRECTION        = 0x1204,
		GL_SPOT_EXPONENT         = 0x1205,
		GL_SPOT_CUTOFF           = 0x1206,
		GL_CONSTANT_ATTENUATION  = 0x1207,
		GL_LINEAR_ATTENUATION    = 0x1208,
		GL_QUADRATIC_ATTENUATION = 0x1209;

	/** ListMode */
	public static final int
		GL_COMPILE             = 0x1300,
		GL_COMPILE_AND_EXECUTE = 0x1301;

	/** LogicOp */
	public static final int
		GL_CLEAR         = 0x1500,
		GL_AND           = 0x1501,
		GL_AND_REVERSE   = 0x1502,
		GL_COPY          = 0x1503,
		GL_AND_INVERTED  = 0x1504,
		GL_NOOP          = 0x1505,
		GL_XOR           = 0x1506,
		GL_OR            = 0x1507,
		GL_NOR           = 0x1508,
		GL_EQUIV         = 0x1509,
		GL_INVERT        = 0x150A,
		GL_OR_REVERSE    = 0x150B,
		GL_COPY_INVERTED = 0x150C,
		GL_OR_INVERTED   = 0x150D,
		GL_NAND          = 0x150E,
		GL_SET           = 0x150F;

	/** MaterialParameter */
	public static final int
		GL_EMISSION            = 0x1600,
		GL_SHININESS           = 0x1601,
		GL_AMBIENT_AND_DIFFUSE = 0x1602,
		GL_COLOR_INDEXES       = 0x1603;

	/** MatrixMode */
	public static final int
		GL_MODELVIEW  = 0x1700,
		GL_PROJECTION = 0x1701,
		GL_TEXTURE    = 0x1702;

	/** PixelCopyType */
	public static final int
		GL_COLOR   = 0x1800,
		GL_DEPTH   = 0x1801,
		GL_STENCIL = 0x1802;

	/** PixelFormat */
	public static final int
		GL_COLOR_INDEX     = 0x1900,
		GL_STENCIL_INDEX   = 0x1901,
		GL_DEPTH_COMPONENT = 0x1902,
		GL_RED             = 0x1903,
		GL_GREEN           = 0x1904,
		GL_BLUE            = 0x1905,
		GL_ALPHA           = 0x1906,
		GL_RGB             = 0x1907,
		GL_RGBA            = 0x1908,
		GL_LUMINANCE       = 0x1909,
		GL_LUMINANCE_ALPHA = 0x190A;

	/** PixelType */
	public static final int GL_BITMAP = 0x1A00;

	/** PolygonMode */
	public static final int
		GL_POINT = 0x1B00,
		GL_LINE  = 0x1B01,
		GL_FILL  = 0x1B02;

	/** RenderingMode */
	public static final int
		GL_RENDER   = 0x1C00,
		GL_FEEDBACK = 0x1C01,
		GL_SELECT   = 0x1C02;

	/** ShadingModel */
	public static final int
		GL_FLAT   = 0x1D00,
		GL_SMOOTH = 0x1D01;

	/** StencilOp */
	public static final int
		GL_KEEP    = 0x1E00,
		GL_REPLACE = 0x1E01,
		GL_INCR    = 0x1E02,
		GL_DECR    = 0x1E03;

	/** StringName */
	public static final int
		GL_VENDOR     = 0x1F00,
		GL_RENDERER   = 0x1F01,
		GL_VERSION    = 0x1F02,
		GL_EXTENSIONS = 0x1F03;

	/** TextureCoordName */
	public static final int
		GL_S = 0x2000,
		GL_T = 0x2001,
		GL_R = 0x2002,
		GL_Q = 0x2003;

	/** TextureEnvMode */
	public static final int
		GL_MODULATE = 0x2100,
		GL_DECAL    = 0x2101;

	/** TextureEnvParameter */
	public static final int
		GL_TEXTURE_ENV_MODE  = 0x2200,
		GL_TEXTURE_ENV_COLOR = 0x2201;

	/** TextureEnvTarget */
	public static final int GL_TEXTURE_ENV = 0x2300;

	/** TextureGenMode */
	public static final int
		GL_EYE_LINEAR    = 0x2400,
		GL_OBJECT_LINEAR = 0x2401,
		GL_SPHERE_MAP    = 0x2402;

	/** TextureGenParameter */
	public static final int
		GL_TEXTURE_GEN_MODE = 0x2500,
		GL_OBJECT_PLANE     = 0x2501,
		GL_EYE_PLANE        = 0x2502;

	/** TextureMagFilter */
	public static final int
		GL_NEAREST = 0x2600,
		GL_LINEAR  = 0x2601;

	/** TextureMinFilter */
	public static final int
		GL_NEAREST_MIPMAP_NEAREST = 0x2700,
		GL_LINEAR_MIPMAP_NEAREST  = 0x2701,
		GL_NEAREST_MIPMAP_LINEAR  = 0x2702,
		GL_LINEAR_MIPMAP_LINEAR   = 0x2703;

	/** TextureParameterName */
	public static final int
		GL_TEXTURE_MAG_FILTER = 0x2800,
		GL_TEXTURE_MIN_FILTER = 0x2801,
		GL_TEXTURE_WRAP_S     = 0x2802,
		GL_TEXTURE_WRAP_T     = 0x2803;

	/** TextureWrapMode */
	public static final int
		GL_CLAMP  = 0x2900,
		GL_REPEAT = 0x2901;

	/** ClientAttribMask */
	public static final int
		GL_CLIENT_PIXEL_STORE_BIT  = 0x1,
		GL_CLIENT_VERTEX_ARRAY_BIT = 0x2,
		GL_CLIENT_ALL_ATTRIB_BITS  = 0xFFFFFFFF;

	/** polygon_offset */
	public static final int
		GL_POLYGON_OFFSET_FACTOR = 0x8038,
		GL_POLYGON_OFFSET_UNITS  = 0x2A00,
		GL_POLYGON_OFFSET_POINT  = 0x2A01,
		GL_POLYGON_OFFSET_LINE   = 0x2A02,
		GL_POLYGON_OFFSET_FILL   = 0x8037;

	/** texture */
	public static final int
		GL_ALPHA4                 = 0x803B,
		GL_ALPHA8                 = 0x803C,
		GL_ALPHA12                = 0x803D,
		GL_ALPHA16                = 0x803E,
		GL_LUMINANCE4             = 0x803F,
		GL_LUMINANCE8             = 0x8040,
		GL_LUMINANCE12            = 0x8041,
		GL_LUMINANCE16            = 0x8042,
		GL_LUMINANCE4_ALPHA4      = 0x8043,
		GL_LUMINANCE6_ALPHA2      = 0x8044,
		GL_LUMINANCE8_ALPHA8      = 0x8045,
		GL_LUMINANCE12_ALPHA4     = 0x8046,
		GL_LUMINANCE12_ALPHA12    = 0x8047,
		GL_LUMINANCE16_ALPHA16    = 0x8048,
		GL_INTENSITY              = 0x8049,
		GL_INTENSITY4             = 0x804A,
		GL_INTENSITY8             = 0x804B,
		GL_INTENSITY12            = 0x804C,
		GL_INTENSITY16            = 0x804D,
		GL_R3_G3_B2               = 0x2A10,
		GL_RGB4                   = 0x804F,
		GL_RGB5                   = 0x8050,
		GL_RGB8                   = 0x8051,
		GL_RGB10                  = 0x8052,
		GL_RGB12                  = 0x8053,
		GL_RGB16                  = 0x8054,
		GL_RGBA2                  = 0x8055,
		GL_RGBA4                  = 0x8056,
		GL_RGB5_A1                = 0x8057,
		GL_RGBA8                  = 0x8058,
		GL_RGB10_A2               = 0x8059,
		GL_RGBA12                 = 0x805A,
		GL_RGBA16                 = 0x805B,
		GL_TEXTURE_RED_SIZE       = 0x805C,
		GL_TEXTURE_GREEN_SIZE     = 0x805D,
		GL_TEXTURE_BLUE_SIZE      = 0x805E,
		GL_TEXTURE_ALPHA_SIZE     = 0x805F,
		GL_TEXTURE_LUMINANCE_SIZE = 0x8060,
		GL_TEXTURE_INTENSITY_SIZE = 0x8061,
		GL_PROXY_TEXTURE_1D       = 0x8063,
		GL_PROXY_TEXTURE_2D       = 0x8064;

	/** texture_object */
	public static final int
		GL_TEXTURE_PRIORITY   = 0x8066,
		GL_TEXTURE_RESIDENT   = 0x8067,
		GL_TEXTURE_BINDING_1D = 0x8068,
		GL_TEXTURE_BINDING_2D = 0x8069;

	/** vertex_array */
	public static final int
		GL_VERTEX_ARRAY                = 0x8074,
		GL_NORMAL_ARRAY                = 0x8075,
		GL_COLOR_ARRAY                 = 0x8076,
		GL_INDEX_ARRAY                 = 0x8077,
		GL_TEXTURE_COORD_ARRAY         = 0x8078,
		GL_EDGE_FLAG_ARRAY             = 0x8079,
		GL_VERTEX_ARRAY_SIZE           = 0x807A,
		GL_VERTEX_ARRAY_TYPE           = 0x807B,
		GL_VERTEX_ARRAY_STRIDE         = 0x807C,
		GL_NORMAL_ARRAY_TYPE           = 0x807E,
		GL_NORMAL_ARRAY_STRIDE         = 0x807F,
		GL_COLOR_ARRAY_SIZE            = 0x8081,
		GL_COLOR_ARRAY_TYPE            = 0x8082,
		GL_COLOR_ARRAY_STRIDE          = 0x8083,
		GL_INDEX_ARRAY_TYPE            = 0x8085,
		GL_INDEX_ARRAY_STRIDE          = 0x8086,
		GL_TEXTURE_COORD_ARRAY_SIZE    = 0x8088,
		GL_TEXTURE_COORD_ARRAY_TYPE    = 0x8089,
		GL_TEXTURE_COORD_ARRAY_STRIDE  = 0x808A,
		GL_EDGE_FLAG_ARRAY_STRIDE      = 0x808C,
		GL_VERTEX_ARRAY_POINTER        = 0x808E,
		GL_NORMAL_ARRAY_POINTER        = 0x808F,
		GL_COLOR_ARRAY_POINTER         = 0x8090,
		GL_INDEX_ARRAY_POINTER         = 0x8091,
		GL_TEXTURE_COORD_ARRAY_POINTER = 0x8092,
		GL_EDGE_FLAG_ARRAY_POINTER     = 0x8093,
		GL_V2F                         = 0x2A20,
		GL_V3F                         = 0x2A21,
		GL_C4UB_V2F                    = 0x2A22,
		GL_C4UB_V3F                    = 0x2A23,
		GL_C3F_V3F                     = 0x2A24,
		GL_N3F_V3F                     = 0x2A25,
		GL_C4F_N3F_V3F                 = 0x2A26,
		GL_T2F_V3F                     = 0x2A27,
		GL_T4F_V4F                     = 0x2A28,
		GL_T2F_C4UB_V3F                = 0x2A29,
		GL_T2F_C3F_V3F                 = 0x2A2A,
		GL_T2F_N3F_V3F                 = 0x2A2B,
		GL_T2F_C4F_N3F_V3F             = 0x2A2C,
		GL_T4F_C4F_N3F_V4F             = 0x2A2D;

	/** Function address. */
	@JavadocExclude
	public final long
		Enable,
		Disable,
		Accum,
		AlphaFunc,
		AreTexturesResident,
		ArrayElement,
		Begin,
		BindTexture,
		Bitmap,
		BlendFunc,
		CallList,
		CallLists,
		Clear,
		ClearAccum,
		ClearColor,
		ClearDepth,
		ClearIndex,
		ClearStencil,
		ClipPlane,
		Color3b,
		Color3s,
		Color3i,
		Color3f,
		Color3d,
		Color3ub,
		Color3us,
		Color3ui,
		Color3bv,
		Color3sv,
		Color3iv,
		Color3fv,
		Color3dv,
		Color3ubv,
		Color3usv,
		Color3uiv,
		Color4b,
		Color4s,
		Color4i,
		Color4f,
		Color4d,
		Color4ub,
		Color4us,
		Color4ui,
		Color4bv,
		Color4sv,
		Color4iv,
		Color4fv,
		Color4dv,
		Color4ubv,
		Color4usv,
		Color4uiv,
		ColorMask,
		ColorMaterial,
		ColorPointer,
		CopyPixels,
		CullFace,
		DeleteLists,
		DepthFunc,
		DepthMask,
		DepthRange,
		DisableClientState,
		DrawArrays,
		DrawBuffer,
		DrawElements,
		DrawPixels,
		EdgeFlag,
		EdgeFlagv,
		EdgeFlagPointer,
		EnableClientState,
		End,
		EvalCoord1f,
		EvalCoord1fv,
		EvalCoord1d,
		EvalCoord1dv,
		EvalCoord2f,
		EvalCoord2fv,
		EvalCoord2d,
		EvalCoord2dv,
		EvalMesh1,
		EvalMesh2,
		EvalPoint1,
		EvalPoint2,
		FeedbackBuffer,
		Finish,
		Flush,
		Fogi,
		Fogiv,
		Fogf,
		Fogfv,
		FrontFace,
		GenLists,
		GenTextures,
		DeleteTextures,
		GetClipPlane,
		GetBooleanv,
		GetFloatv,
		GetIntegerv,
		GetDoublev,
		GetError,
		GetLightiv,
		GetLightfv,
		GetMapiv,
		GetMapfv,
		GetMapdv,
		GetMaterialiv,
		GetMaterialfv,
		GetPixelMapfv,
		GetPixelMapusv,
		GetPixelMapuiv,
		GetPointerv,
		GetPolygonStipple,
		GetString,
		GetTexEnviv,
		GetTexEnvfv,
		GetTexGeniv,
		GetTexGenfv,
		GetTexGendv,
		GetTexImage,
		GetTexLevelParameteriv,
		GetTexLevelParameterfv,
		GetTexParameteriv,
		GetTexParameterfv,
		Hint,
		Indexi,
		Indexub,
		Indexs,
		Indexf,
		Indexd,
		Indexiv,
		Indexubv,
		Indexsv,
		Indexfv,
		Indexdv,
		IndexMask,
		IndexPointer,
		InitNames,
		InterleavedArrays,
		IsEnabled,
		IsList,
		IsTexture,
		LightModeli,
		LightModelf,
		LightModeliv,
		LightModelfv,
		Lighti,
		Lightf,
		Lightiv,
		Lightfv,
		LineStipple,
		LineWidth,
		ListBase,
		LoadMatrixf,
		LoadMatrixd,
		LoadIdentity,
		LoadName,
		LogicOp,
		Map1f,
		Map1d,
		Map2f,
		Map2d,
		MapGrid1f,
		MapGrid1d,
		MapGrid2f,
		MapGrid2d,
		Materiali,
		Materialf,
		Materialiv,
		Materialfv,
		MatrixMode,
		MultMatrixf,
		MultMatrixd,
		Frustum,
		NewList,
		EndList,
		Normal3f,
		Normal3b,
		Normal3s,
		Normal3i,
		Normal3d,
		Normal3fv,
		Normal3bv,
		Normal3sv,
		Normal3iv,
		Normal3dv,
		NormalPointer,
		Ortho,
		PassThrough,
		PixelMapfv,
		PixelMapusv,
		PixelMapuiv,
		PixelStorei,
		PixelStoref,
		PixelTransferi,
		PixelTransferf,
		PixelZoom,
		PointSize,
		PolygonMode,
		PolygonOffset,
		PolygonStipple,
		PushAttrib,
		PushClientAttrib,
		PopAttrib,
		PopClientAttrib,
		PopMatrix,
		PopName,
		PrioritizeTextures,
		PushMatrix,
		PushName,
		RasterPos2i,
		RasterPos2s,
		RasterPos2f,
		RasterPos2d,
		RasterPos2iv,
		RasterPos2sv,
		RasterPos2fv,
		RasterPos2dv,
		RasterPos3i,
		RasterPos3s,
		RasterPos3f,
		RasterPos3d,
		RasterPos3iv,
		RasterPos3sv,
		RasterPos3fv,
		RasterPos3dv,
		RasterPos4i,
		RasterPos4s,
		RasterPos4f,
		RasterPos4d,
		RasterPos4iv,
		RasterPos4sv,
		RasterPos4fv,
		RasterPos4dv,
		ReadBuffer,
		ReadPixels,
		Recti,
		Rects,
		Rectf,
		Rectd,
		Rectiv,
		Rectsv,
		Rectfv,
		Rectdv,
		RenderMode,
		Rotatef,
		Rotated,
		Scalef,
		Scaled,
		Scissor,
		SelectBuffer,
		ShadeModel,
		StencilFunc,
		StencilMask,
		StencilOp,
		TexCoord1f,
		TexCoord1s,
		TexCoord1i,
		TexCoord1d,
		TexCoord1fv,
		TexCoord1sv,
		TexCoord1iv,
		TexCoord1dv,
		TexCoord2f,
		TexCoord2s,
		TexCoord2i,
		TexCoord2d,
		TexCoord2fv,
		TexCoord2sv,
		TexCoord2iv,
		TexCoord2dv,
		TexCoord3f,
		TexCoord3s,
		TexCoord3i,
		TexCoord3d,
		TexCoord3fv,
		TexCoord3sv,
		TexCoord3iv,
		TexCoord3dv,
		TexCoord4f,
		TexCoord4s,
		TexCoord4i,
		TexCoord4d,
		TexCoord4fv,
		TexCoord4sv,
		TexCoord4iv,
		TexCoord4dv,
		TexCoordPointer,
		TexEnvi,
		TexEnviv,
		TexEnvf,
		TexEnvfv,
		TexGeni,
		TexGeniv,
		TexGenf,
		TexGenfv,
		TexGend,
		TexGendv,
		TexImage2D,
		TexImage1D,
		CopyTexImage2D,
		CopyTexImage1D,
		CopyTexSubImage1D,
		CopyTexSubImage2D,
		TexParameteri,
		TexParameteriv,
		TexParameterf,
		TexParameterfv,
		TexSubImage1D,
		TexSubImage2D,
		Translatef,
		Translated,
		Vertex2f,
		Vertex2s,
		Vertex2i,
		Vertex2d,
		Vertex2fv,
		Vertex2sv,
		Vertex2iv,
		Vertex2dv,
		Vertex3f,
		Vertex3s,
		Vertex3i,
		Vertex3d,
		Vertex3fv,
		Vertex3sv,
		Vertex3iv,
		Vertex3dv,
		Vertex4f,
		Vertex4s,
		Vertex4i,
		Vertex4d,
		Vertex4fv,
		Vertex4sv,
		Vertex4iv,
		Vertex4dv,
		VertexPointer,
		Viewport;

	@JavadocExclude
	public GL11(FunctionProvider provider, boolean fc) {
		Enable = provider.getFunctionAddress("glEnable");
		Disable = provider.getFunctionAddress("glDisable");
		Accum = GL.getFunctionAddress(provider, "glAccum", fc);
		AlphaFunc = GL.getFunctionAddress(provider, "glAlphaFunc", fc);
		AreTexturesResident = GL.getFunctionAddress(provider, "glAreTexturesResident", fc);
		ArrayElement = provider.getFunctionAddress("glArrayElement");
		Begin = GL.getFunctionAddress(provider, "glBegin", fc);
		BindTexture = provider.getFunctionAddress("glBindTexture");
		Bitmap = GL.getFunctionAddress(provider, "glBitmap", fc);
		BlendFunc = provider.getFunctionAddress("glBlendFunc");
		CallList = GL.getFunctionAddress(provider, "glCallList", fc);
		CallLists = GL.getFunctionAddress(provider, "glCallLists", fc);
		Clear = provider.getFunctionAddress("glClear");
		ClearAccum = GL.getFunctionAddress(provider, "glClearAccum", fc);
		ClearColor = provider.getFunctionAddress("glClearColor");
		ClearDepth = provider.getFunctionAddress("glClearDepth");
		ClearIndex = GL.getFunctionAddress(provider, "glClearIndex", fc);
		ClearStencil = provider.getFunctionAddress("glClearStencil");
		ClipPlane = provider.getFunctionAddress("glClipPlane");
		Color3b = GL.getFunctionAddress(provider, "glColor3b", fc);
		Color3s = GL.getFunctionAddress(provider, "glColor3s", fc);
		Color3i = GL.getFunctionAddress(provider, "glColor3i", fc);
		Color3f = GL.getFunctionAddress(provider, "glColor3f", fc);
		Color3d = GL.getFunctionAddress(provider, "glColor3d", fc);
		Color3ub = GL.getFunctionAddress(provider, "glColor3ub", fc);
		Color3us = GL.getFunctionAddress(provider, "glColor3us", fc);
		Color3ui = GL.getFunctionAddress(provider, "glColor3ui", fc);
		Color3bv = GL.getFunctionAddress(provider, "glColor3bv", fc);
		Color3sv = GL.getFunctionAddress(provider, "glColor3sv", fc);
		Color3iv = GL.getFunctionAddress(provider, "glColor3iv", fc);
		Color3fv = GL.getFunctionAddress(provider, "glColor3fv", fc);
		Color3dv = GL.getFunctionAddress(provider, "glColor3dv", fc);
		Color3ubv = GL.getFunctionAddress(provider, "glColor3ubv", fc);
		Color3usv = GL.getFunctionAddress(provider, "glColor3usv", fc);
		Color3uiv = GL.getFunctionAddress(provider, "glColor3uiv", fc);
		Color4b = GL.getFunctionAddress(provider, "glColor4b", fc);
		Color4s = GL.getFunctionAddress(provider, "glColor4s", fc);
		Color4i = GL.getFunctionAddress(provider, "glColor4i", fc);
		Color4f = GL.getFunctionAddress(provider, "glColor4f", fc);
		Color4d = GL.getFunctionAddress(provider, "glColor4d", fc);
		Color4ub = GL.getFunctionAddress(provider, "glColor4ub", fc);
		Color4us = GL.getFunctionAddress(provider, "glColor4us", fc);
		Color4ui = GL.getFunctionAddress(provider, "glColor4ui", fc);
		Color4bv = GL.getFunctionAddress(provider, "glColor4bv", fc);
		Color4sv = GL.getFunctionAddress(provider, "glColor4sv", fc);
		Color4iv = GL.getFunctionAddress(provider, "glColor4iv", fc);
		Color4fv = GL.getFunctionAddress(provider, "glColor4fv", fc);
		Color4dv = GL.getFunctionAddress(provider, "glColor4dv", fc);
		Color4ubv = GL.getFunctionAddress(provider, "glColor4ubv", fc);
		Color4usv = GL.getFunctionAddress(provider, "glColor4usv", fc);
		Color4uiv = GL.getFunctionAddress(provider, "glColor4uiv", fc);
		ColorMask = provider.getFunctionAddress("glColorMask");
		ColorMaterial = GL.getFunctionAddress(provider, "glColorMaterial", fc);
		ColorPointer = GL.getFunctionAddress(provider, "glColorPointer", fc);
		CopyPixels = provider.getFunctionAddress("glCopyPixels");
		CullFace = provider.getFunctionAddress("glCullFace");
		DeleteLists = GL.getFunctionAddress(provider, "glDeleteLists", fc);
		DepthFunc = provider.getFunctionAddress("glDepthFunc");
		DepthMask = provider.getFunctionAddress("glDepthMask");
		DepthRange = provider.getFunctionAddress("glDepthRange");
		DisableClientState = GL.getFunctionAddress(provider, "glDisableClientState", fc);
		DrawArrays = provider.getFunctionAddress("glDrawArrays");
		DrawBuffer = provider.getFunctionAddress("glDrawBuffer");
		DrawElements = provider.getFunctionAddress("glDrawElements");
		DrawPixels = GL.getFunctionAddress(provider, "glDrawPixels", fc);
		EdgeFlag = GL.getFunctionAddress(provider, "glEdgeFlag", fc);
		EdgeFlagv = GL.getFunctionAddress(provider, "glEdgeFlagv", fc);
		EdgeFlagPointer = GL.getFunctionAddress(provider, "glEdgeFlagPointer", fc);
		EnableClientState = GL.getFunctionAddress(provider, "glEnableClientState", fc);
		End = GL.getFunctionAddress(provider, "glEnd", fc);
		EvalCoord1f = GL.getFunctionAddress(provider, "glEvalCoord1f", fc);
		EvalCoord1fv = GL.getFunctionAddress(provider, "glEvalCoord1fv", fc);
		EvalCoord1d = GL.getFunctionAddress(provider, "glEvalCoord1d", fc);
		EvalCoord1dv = GL.getFunctionAddress(provider, "glEvalCoord1dv", fc);
		EvalCoord2f = GL.getFunctionAddress(provider, "glEvalCoord2f", fc);
		EvalCoord2fv = GL.getFunctionAddress(provider, "glEvalCoord2fv", fc);
		EvalCoord2d = GL.getFunctionAddress(provider, "glEvalCoord2d", fc);
		EvalCoord2dv = GL.getFunctionAddress(provider, "glEvalCoord2dv", fc);
		EvalMesh1 = GL.getFunctionAddress(provider, "glEvalMesh1", fc);
		EvalMesh2 = GL.getFunctionAddress(provider, "glEvalMesh2", fc);
		EvalPoint1 = GL.getFunctionAddress(provider, "glEvalPoint1", fc);
		EvalPoint2 = GL.getFunctionAddress(provider, "glEvalPoint2", fc);
		FeedbackBuffer = GL.getFunctionAddress(provider, "glFeedbackBuffer", fc);
		Finish = provider.getFunctionAddress("glFinish");
		Flush = provider.getFunctionAddress("glFlush");
		Fogi = GL.getFunctionAddress(provider, "glFogi", fc);
		Fogiv = GL.getFunctionAddress(provider, "glFogiv", fc);
		Fogf = GL.getFunctionAddress(provider, "glFogf", fc);
		Fogfv = GL.getFunctionAddress(provider, "glFogfv", fc);
		FrontFace = provider.getFunctionAddress("glFrontFace");
		GenLists = GL.getFunctionAddress(provider, "glGenLists", fc);
		GenTextures = provider.getFunctionAddress("glGenTextures");
		DeleteTextures = provider.getFunctionAddress("glDeleteTextures");
		GetClipPlane = provider.getFunctionAddress("glGetClipPlane");
		GetBooleanv = provider.getFunctionAddress("glGetBooleanv");
		GetFloatv = provider.getFunctionAddress("glGetFloatv");
		GetIntegerv = provider.getFunctionAddress("glGetIntegerv");
		GetDoublev = provider.getFunctionAddress("glGetDoublev");
		GetError = provider.getFunctionAddress("glGetError");
		GetLightiv = GL.getFunctionAddress(provider, "glGetLightiv", fc);
		GetLightfv = GL.getFunctionAddress(provider, "glGetLightfv", fc);
		GetMapiv = GL.getFunctionAddress(provider, "glGetMapiv", fc);
		GetMapfv = GL.getFunctionAddress(provider, "glGetMapfv", fc);
		GetMapdv = GL.getFunctionAddress(provider, "glGetMapdv", fc);
		GetMaterialiv = GL.getFunctionAddress(provider, "glGetMaterialiv", fc);
		GetMaterialfv = GL.getFunctionAddress(provider, "glGetMaterialfv", fc);
		GetPixelMapfv = GL.getFunctionAddress(provider, "glGetPixelMapfv", fc);
		GetPixelMapusv = GL.getFunctionAddress(provider, "glGetPixelMapusv", fc);
		GetPixelMapuiv = GL.getFunctionAddress(provider, "glGetPixelMapuiv", fc);
		GetPointerv = provider.getFunctionAddress("glGetPointerv");
		GetPolygonStipple = GL.getFunctionAddress(provider, "glGetPolygonStipple", fc);
		GetString = provider.getFunctionAddress("glGetString");
		GetTexEnviv = provider.getFunctionAddress("glGetTexEnviv");
		GetTexEnvfv = provider.getFunctionAddress("glGetTexEnvfv");
		GetTexGeniv = GL.getFunctionAddress(provider, "glGetTexGeniv", fc);
		GetTexGenfv = GL.getFunctionAddress(provider, "glGetTexGenfv", fc);
		GetTexGendv = GL.getFunctionAddress(provider, "glGetTexGendv", fc);
		GetTexImage = provider.getFunctionAddress("glGetTexImage");
		GetTexLevelParameteriv = provider.getFunctionAddress("glGetTexLevelParameteriv");
		GetTexLevelParameterfv = provider.getFunctionAddress("glGetTexLevelParameterfv");
		GetTexParameteriv = provider.getFunctionAddress("glGetTexParameteriv");
		GetTexParameterfv = provider.getFunctionAddress("glGetTexParameterfv");
		Hint = provider.getFunctionAddress("glHint");
		Indexi = GL.getFunctionAddress(provider, "glIndexi", fc);
		Indexub = GL.getFunctionAddress(provider, "glIndexub", fc);
		Indexs = GL.getFunctionAddress(provider, "glIndexs", fc);
		Indexf = GL.getFunctionAddress(provider, "glIndexf", fc);
		Indexd = GL.getFunctionAddress(provider, "glIndexd", fc);
		Indexiv = GL.getFunctionAddress(provider, "glIndexiv", fc);
		Indexubv = GL.getFunctionAddress(provider, "glIndexubv", fc);
		Indexsv = GL.getFunctionAddress(provider, "glIndexsv", fc);
		Indexfv = GL.getFunctionAddress(provider, "glIndexfv", fc);
		Indexdv = GL.getFunctionAddress(provider, "glIndexdv", fc);
		IndexMask = GL.getFunctionAddress(provider, "glIndexMask", fc);
		IndexPointer = GL.getFunctionAddress(provider, "glIndexPointer", fc);
		InitNames = GL.getFunctionAddress(provider, "glInitNames", fc);
		InterleavedArrays = provider.getFunctionAddress("glInterleavedArrays");
		IsEnabled = provider.getFunctionAddress("glIsEnabled");
		IsList = GL.getFunctionAddress(provider, "glIsList", fc);
		IsTexture = provider.getFunctionAddress("glIsTexture");
		LightModeli = GL.getFunctionAddress(provider, "glLightModeli", fc);
		LightModelf = GL.getFunctionAddress(provider, "glLightModelf", fc);
		LightModeliv = GL.getFunctionAddress(provider, "glLightModeliv", fc);
		LightModelfv = GL.getFunctionAddress(provider, "glLightModelfv", fc);
		Lighti = GL.getFunctionAddress(provider, "glLighti", fc);
		Lightf = GL.getFunctionAddress(provider, "glLightf", fc);
		Lightiv = GL.getFunctionAddress(provider, "glLightiv", fc);
		Lightfv = GL.getFunctionAddress(provider, "glLightfv", fc);
		LineStipple = GL.getFunctionAddress(provider, "glLineStipple", fc);
		LineWidth = provider.getFunctionAddress("glLineWidth");
		ListBase = GL.getFunctionAddress(provider, "glListBase", fc);
		LoadMatrixf = GL.getFunctionAddress(provider, "glLoadMatrixf", fc);
		LoadMatrixd = GL.getFunctionAddress(provider, "glLoadMatrixd", fc);
		LoadIdentity = GL.getFunctionAddress(provider, "glLoadIdentity", fc);
		LoadName = GL.getFunctionAddress(provider, "glLoadName", fc);
		LogicOp = provider.getFunctionAddress("glLogicOp");
		Map1f = GL.getFunctionAddress(provider, "glMap1f", fc);
		Map1d = GL.getFunctionAddress(provider, "glMap1d", fc);
		Map2f = GL.getFunctionAddress(provider, "glMap2f", fc);
		Map2d = GL.getFunctionAddress(provider, "glMap2d", fc);
		MapGrid1f = GL.getFunctionAddress(provider, "glMapGrid1f", fc);
		MapGrid1d = GL.getFunctionAddress(provider, "glMapGrid1d", fc);
		MapGrid2f = GL.getFunctionAddress(provider, "glMapGrid2f", fc);
		MapGrid2d = GL.getFunctionAddress(provider, "glMapGrid2d", fc);
		Materiali = GL.getFunctionAddress(provider, "glMateriali", fc);
		Materialf = GL.getFunctionAddress(provider, "glMaterialf", fc);
		Materialiv = GL.getFunctionAddress(provider, "glMaterialiv", fc);
		Materialfv = GL.getFunctionAddress(provider, "glMaterialfv", fc);
		MatrixMode = GL.getFunctionAddress(provider, "glMatrixMode", fc);
		MultMatrixf = GL.getFunctionAddress(provider, "glMultMatrixf", fc);
		MultMatrixd = GL.getFunctionAddress(provider, "glMultMatrixd", fc);
		Frustum = GL.getFunctionAddress(provider, "glFrustum", fc);
		NewList = GL.getFunctionAddress(provider, "glNewList", fc);
		EndList = GL.getFunctionAddress(provider, "glEndList", fc);
		Normal3f = GL.getFunctionAddress(provider, "glNormal3f", fc);
		Normal3b = GL.getFunctionAddress(provider, "glNormal3b", fc);
		Normal3s = GL.getFunctionAddress(provider, "glNormal3s", fc);
		Normal3i = GL.getFunctionAddress(provider, "glNormal3i", fc);
		Normal3d = GL.getFunctionAddress(provider, "glNormal3d", fc);
		Normal3fv = GL.getFunctionAddress(provider, "glNormal3fv", fc);
		Normal3bv = GL.getFunctionAddress(provider, "glNormal3bv", fc);
		Normal3sv = GL.getFunctionAddress(provider, "glNormal3sv", fc);
		Normal3iv = GL.getFunctionAddress(provider, "glNormal3iv", fc);
		Normal3dv = GL.getFunctionAddress(provider, "glNormal3dv", fc);
		NormalPointer = GL.getFunctionAddress(provider, "glNormalPointer", fc);
		Ortho = GL.getFunctionAddress(provider, "glOrtho", fc);
		PassThrough = GL.getFunctionAddress(provider, "glPassThrough", fc);
		PixelMapfv = GL.getFunctionAddress(provider, "glPixelMapfv", fc);
		PixelMapusv = GL.getFunctionAddress(provider, "glPixelMapusv", fc);
		PixelMapuiv = GL.getFunctionAddress(provider, "glPixelMapuiv", fc);
		PixelStorei = provider.getFunctionAddress("glPixelStorei");
		PixelStoref = provider.getFunctionAddress("glPixelStoref");
		PixelTransferi = GL.getFunctionAddress(provider, "glPixelTransferi", fc);
		PixelTransferf = GL.getFunctionAddress(provider, "glPixelTransferf", fc);
		PixelZoom = GL.getFunctionAddress(provider, "glPixelZoom", fc);
		PointSize = provider.getFunctionAddress("glPointSize");
		PolygonMode = provider.getFunctionAddress("glPolygonMode");
		PolygonOffset = provider.getFunctionAddress("glPolygonOffset");
		PolygonStipple = GL.getFunctionAddress(provider, "glPolygonStipple", fc);
		PushAttrib = GL.getFunctionAddress(provider, "glPushAttrib", fc);
		PushClientAttrib = GL.getFunctionAddress(provider, "glPushClientAttrib", fc);
		PopAttrib = GL.getFunctionAddress(provider, "glPopAttrib", fc);
		PopClientAttrib = GL.getFunctionAddress(provider, "glPopClientAttrib", fc);
		PopMatrix = GL.getFunctionAddress(provider, "glPopMatrix", fc);
		PopName = GL.getFunctionAddress(provider, "glPopName", fc);
		PrioritizeTextures = GL.getFunctionAddress(provider, "glPrioritizeTextures", fc);
		PushMatrix = GL.getFunctionAddress(provider, "glPushMatrix", fc);
		PushName = GL.getFunctionAddress(provider, "glPushName", fc);
		RasterPos2i = GL.getFunctionAddress(provider, "glRasterPos2i", fc);
		RasterPos2s = GL.getFunctionAddress(provider, "glRasterPos2s", fc);
		RasterPos2f = GL.getFunctionAddress(provider, "glRasterPos2f", fc);
		RasterPos2d = GL.getFunctionAddress(provider, "glRasterPos2d", fc);
		RasterPos2iv = GL.getFunctionAddress(provider, "glRasterPos2iv", fc);
		RasterPos2sv = GL.getFunctionAddress(provider, "glRasterPos2sv", fc);
		RasterPos2fv = GL.getFunctionAddress(provider, "glRasterPos2fv", fc);
		RasterPos2dv = GL.getFunctionAddress(provider, "glRasterPos2dv", fc);
		RasterPos3i = GL.getFunctionAddress(provider, "glRasterPos3i", fc);
		RasterPos3s = GL.getFunctionAddress(provider, "glRasterPos3s", fc);
		RasterPos3f = GL.getFunctionAddress(provider, "glRasterPos3f", fc);
		RasterPos3d = GL.getFunctionAddress(provider, "glRasterPos3d", fc);
		RasterPos3iv = GL.getFunctionAddress(provider, "glRasterPos3iv", fc);
		RasterPos3sv = GL.getFunctionAddress(provider, "glRasterPos3sv", fc);
		RasterPos3fv = GL.getFunctionAddress(provider, "glRasterPos3fv", fc);
		RasterPos3dv = GL.getFunctionAddress(provider, "glRasterPos3dv", fc);
		RasterPos4i = GL.getFunctionAddress(provider, "glRasterPos4i", fc);
		RasterPos4s = GL.getFunctionAddress(provider, "glRasterPos4s", fc);
		RasterPos4f = GL.getFunctionAddress(provider, "glRasterPos4f", fc);
		RasterPos4d = GL.getFunctionAddress(provider, "glRasterPos4d", fc);
		RasterPos4iv = GL.getFunctionAddress(provider, "glRasterPos4iv", fc);
		RasterPos4sv = GL.getFunctionAddress(provider, "glRasterPos4sv", fc);
		RasterPos4fv = GL.getFunctionAddress(provider, "glRasterPos4fv", fc);
		RasterPos4dv = GL.getFunctionAddress(provider, "glRasterPos4dv", fc);
		ReadBuffer = provider.getFunctionAddress("glReadBuffer");
		ReadPixels = provider.getFunctionAddress("glReadPixels");
		Recti = GL.getFunctionAddress(provider, "glRecti", fc);
		Rects = GL.getFunctionAddress(provider, "glRects", fc);
		Rectf = GL.getFunctionAddress(provider, "glRectf", fc);
		Rectd = GL.getFunctionAddress(provider, "glRectd", fc);
		Rectiv = GL.getFunctionAddress(provider, "glRectiv", fc);
		Rectsv = GL.getFunctionAddress(provider, "glRectsv", fc);
		Rectfv = GL.getFunctionAddress(provider, "glRectfv", fc);
		Rectdv = GL.getFunctionAddress(provider, "glRectdv", fc);
		RenderMode = GL.getFunctionAddress(provider, "glRenderMode", fc);
		Rotatef = GL.getFunctionAddress(provider, "glRotatef", fc);
		Rotated = GL.getFunctionAddress(provider, "glRotated", fc);
		Scalef = GL.getFunctionAddress(provider, "glScalef", fc);
		Scaled = GL.getFunctionAddress(provider, "glScaled", fc);
		Scissor = provider.getFunctionAddress("glScissor");
		SelectBuffer = GL.getFunctionAddress(provider, "glSelectBuffer", fc);
		ShadeModel = GL.getFunctionAddress(provider, "glShadeModel", fc);
		StencilFunc = provider.getFunctionAddress("glStencilFunc");
		StencilMask = provider.getFunctionAddress("glStencilMask");
		StencilOp = provider.getFunctionAddress("glStencilOp");
		TexCoord1f = GL.getFunctionAddress(provider, "glTexCoord1f", fc);
		TexCoord1s = GL.getFunctionAddress(provider, "glTexCoord1s", fc);
		TexCoord1i = GL.getFunctionAddress(provider, "glTexCoord1i", fc);
		TexCoord1d = GL.getFunctionAddress(provider, "glTexCoord1d", fc);
		TexCoord1fv = GL.getFunctionAddress(provider, "glTexCoord1fv", fc);
		TexCoord1sv = GL.getFunctionAddress(provider, "glTexCoord1sv", fc);
		TexCoord1iv = GL.getFunctionAddress(provider, "glTexCoord1iv", fc);
		TexCoord1dv = GL.getFunctionAddress(provider, "glTexCoord1dv", fc);
		TexCoord2f = GL.getFunctionAddress(provider, "glTexCoord2f", fc);
		TexCoord2s = GL.getFunctionAddress(provider, "glTexCoord2s", fc);
		TexCoord2i = GL.getFunctionAddress(provider, "glTexCoord2i", fc);
		TexCoord2d = GL.getFunctionAddress(provider, "glTexCoord2d", fc);
		TexCoord2fv = GL.getFunctionAddress(provider, "glTexCoord2fv", fc);
		TexCoord2sv = GL.getFunctionAddress(provider, "glTexCoord2sv", fc);
		TexCoord2iv = GL.getFunctionAddress(provider, "glTexCoord2iv", fc);
		TexCoord2dv = GL.getFunctionAddress(provider, "glTexCoord2dv", fc);
		TexCoord3f = GL.getFunctionAddress(provider, "glTexCoord3f", fc);
		TexCoord3s = GL.getFunctionAddress(provider, "glTexCoord3s", fc);
		TexCoord3i = GL.getFunctionAddress(provider, "glTexCoord3i", fc);
		TexCoord3d = GL.getFunctionAddress(provider, "glTexCoord3d", fc);
		TexCoord3fv = GL.getFunctionAddress(provider, "glTexCoord3fv", fc);
		TexCoord3sv = GL.getFunctionAddress(provider, "glTexCoord3sv", fc);
		TexCoord3iv = GL.getFunctionAddress(provider, "glTexCoord3iv", fc);
		TexCoord3dv = GL.getFunctionAddress(provider, "glTexCoord3dv", fc);
		TexCoord4f = GL.getFunctionAddress(provider, "glTexCoord4f", fc);
		TexCoord4s = GL.getFunctionAddress(provider, "glTexCoord4s", fc);
		TexCoord4i = GL.getFunctionAddress(provider, "glTexCoord4i", fc);
		TexCoord4d = GL.getFunctionAddress(provider, "glTexCoord4d", fc);
		TexCoord4fv = GL.getFunctionAddress(provider, "glTexCoord4fv", fc);
		TexCoord4sv = GL.getFunctionAddress(provider, "glTexCoord4sv", fc);
		TexCoord4iv = GL.getFunctionAddress(provider, "glTexCoord4iv", fc);
		TexCoord4dv = GL.getFunctionAddress(provider, "glTexCoord4dv", fc);
		TexCoordPointer = GL.getFunctionAddress(provider, "glTexCoordPointer", fc);
		TexEnvi = provider.getFunctionAddress("glTexEnvi");
		TexEnviv = provider.getFunctionAddress("glTexEnviv");
		TexEnvf = provider.getFunctionAddress("glTexEnvf");
		TexEnvfv = provider.getFunctionAddress("glTexEnvfv");
		TexGeni = GL.getFunctionAddress(provider, "glTexGeni", fc);
		TexGeniv = GL.getFunctionAddress(provider, "glTexGeniv", fc);
		TexGenf = GL.getFunctionAddress(provider, "glTexGenf", fc);
		TexGenfv = GL.getFunctionAddress(provider, "glTexGenfv", fc);
		TexGend = GL.getFunctionAddress(provider, "glTexGend", fc);
		TexGendv = GL.getFunctionAddress(provider, "glTexGendv", fc);
		TexImage2D = provider.getFunctionAddress("glTexImage2D");
		TexImage1D = provider.getFunctionAddress("glTexImage1D");
		CopyTexImage2D = provider.getFunctionAddress("glCopyTexImage2D");
		CopyTexImage1D = provider.getFunctionAddress("glCopyTexImage1D");
		CopyTexSubImage1D = provider.getFunctionAddress("glCopyTexSubImage1D");
		CopyTexSubImage2D = provider.getFunctionAddress("glCopyTexSubImage2D");
		TexParameteri = provider.getFunctionAddress("glTexParameteri");
		TexParameteriv = provider.getFunctionAddress("glTexParameteriv");
		TexParameterf = provider.getFunctionAddress("glTexParameterf");
		TexParameterfv = provider.getFunctionAddress("glTexParameterfv");
		TexSubImage1D = provider.getFunctionAddress("glTexSubImage1D");
		TexSubImage2D = provider.getFunctionAddress("glTexSubImage2D");
		Translatef = GL.getFunctionAddress(provider, "glTranslatef", fc);
		Translated = GL.getFunctionAddress(provider, "glTranslated", fc);
		Vertex2f = GL.getFunctionAddress(provider, "glVertex2f", fc);
		Vertex2s = GL.getFunctionAddress(provider, "glVertex2s", fc);
		Vertex2i = GL.getFunctionAddress(provider, "glVertex2i", fc);
		Vertex2d = GL.getFunctionAddress(provider, "glVertex2d", fc);
		Vertex2fv = GL.getFunctionAddress(provider, "glVertex2fv", fc);
		Vertex2sv = GL.getFunctionAddress(provider, "glVertex2sv", fc);
		Vertex2iv = GL.getFunctionAddress(provider, "glVertex2iv", fc);
		Vertex2dv = GL.getFunctionAddress(provider, "glVertex2dv", fc);
		Vertex3f = GL.getFunctionAddress(provider, "glVertex3f", fc);
		Vertex3s = GL.getFunctionAddress(provider, "glVertex3s", fc);
		Vertex3i = GL.getFunctionAddress(provider, "glVertex3i", fc);
		Vertex3d = GL.getFunctionAddress(provider, "glVertex3d", fc);
		Vertex3fv = GL.getFunctionAddress(provider, "glVertex3fv", fc);
		Vertex3sv = GL.getFunctionAddress(provider, "glVertex3sv", fc);
		Vertex3iv = GL.getFunctionAddress(provider, "glVertex3iv", fc);
		Vertex3dv = GL.getFunctionAddress(provider, "glVertex3dv", fc);
		Vertex4f = GL.getFunctionAddress(provider, "glVertex4f", fc);
		Vertex4s = GL.getFunctionAddress(provider, "glVertex4s", fc);
		Vertex4i = GL.getFunctionAddress(provider, "glVertex4i", fc);
		Vertex4d = GL.getFunctionAddress(provider, "glVertex4d", fc);
		Vertex4fv = GL.getFunctionAddress(provider, "glVertex4fv", fc);
		Vertex4sv = GL.getFunctionAddress(provider, "glVertex4sv", fc);
		Vertex4iv = GL.getFunctionAddress(provider, "glVertex4iv", fc);
		Vertex4dv = GL.getFunctionAddress(provider, "glVertex4dv", fc);
		VertexPointer = GL.getFunctionAddress(provider, "glVertexPointer", fc);
		Viewport = provider.getFunctionAddress("glViewport");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL11} instance for the current context. */
	public static GL11 getInstance() {
		return checkFunctionality(GL.getCapabilities().__GL11);
	}

	static GL11 create(java.util.Set<String> ext, FunctionProvider provider, boolean fc) {
		if ( !ext.contains("OpenGL11") ) return null;

		GL11 funcs = new GL11(provider, fc);

		boolean supported = (fc || checkFunctions(
			funcs.Accum, funcs.AlphaFunc, funcs.AreTexturesResident, funcs.Begin, funcs.Bitmap, funcs.CallList, funcs.CallLists, funcs.ClearAccum, 
			funcs.ClearIndex, funcs.Color3b, funcs.Color3s, funcs.Color3i, funcs.Color3f, funcs.Color3d, funcs.Color3ub, funcs.Color3us, funcs.Color3ui, 
			funcs.Color3bv, funcs.Color3sv, funcs.Color3iv, funcs.Color3fv, funcs.Color3dv, funcs.Color3ubv, funcs.Color3usv, funcs.Color3uiv, funcs.Color4b, 
			funcs.Color4s, funcs.Color4i, funcs.Color4f, funcs.Color4d, funcs.Color4ub, funcs.Color4us, funcs.Color4ui, funcs.Color4bv, funcs.Color4sv, 
			funcs.Color4iv, funcs.Color4fv, funcs.Color4dv, funcs.Color4ubv, funcs.Color4usv, funcs.Color4uiv, funcs.ColorMaterial, funcs.ColorPointer, 
			funcs.DeleteLists, funcs.DisableClientState, funcs.DrawPixels, funcs.EdgeFlag, funcs.EdgeFlagv, funcs.EdgeFlagPointer, funcs.EnableClientState, 
			funcs.End, funcs.EvalCoord1f, funcs.EvalCoord1fv, funcs.EvalCoord1d, funcs.EvalCoord1dv, funcs.EvalCoord2f, funcs.EvalCoord2fv, funcs.EvalCoord2d, 
			funcs.EvalCoord2dv, funcs.EvalMesh1, funcs.EvalMesh2, funcs.EvalPoint1, funcs.EvalPoint2, funcs.FeedbackBuffer, funcs.Fogi, funcs.Fogiv, funcs.Fogf, 
			funcs.Fogfv, funcs.GenLists, funcs.GetLightiv, funcs.GetLightfv, funcs.GetMapiv, funcs.GetMapfv, funcs.GetMapdv, funcs.GetMaterialiv, 
			funcs.GetMaterialfv, funcs.GetPixelMapfv, funcs.GetPixelMapusv, funcs.GetPixelMapuiv, funcs.GetPolygonStipple, funcs.GetTexGeniv, funcs.GetTexGenfv, 
			funcs.GetTexGendv, funcs.Indexi, funcs.Indexub, funcs.Indexs, funcs.Indexf, funcs.Indexd, funcs.Indexiv, funcs.Indexubv, funcs.Indexsv, 
			funcs.Indexfv, funcs.Indexdv, funcs.IndexMask, funcs.IndexPointer, funcs.InitNames, funcs.IsList, funcs.LightModeli, funcs.LightModelf, 
			funcs.LightModeliv, funcs.LightModelfv, funcs.Lighti, funcs.Lightf, funcs.Lightiv, funcs.Lightfv, funcs.LineStipple, funcs.ListBase, 
			funcs.LoadMatrixf, funcs.LoadMatrixd, funcs.LoadIdentity, funcs.LoadName, funcs.Map1f, funcs.Map1d, funcs.Map2f, funcs.Map2d, funcs.MapGrid1f, 
			funcs.MapGrid1d, funcs.MapGrid2f, funcs.MapGrid2d, funcs.Materiali, funcs.Materialf, funcs.Materialiv, funcs.Materialfv, funcs.MatrixMode, 
			funcs.MultMatrixf, funcs.MultMatrixd, funcs.Frustum, funcs.NewList, funcs.EndList, funcs.Normal3f, funcs.Normal3b, funcs.Normal3s, funcs.Normal3i, 
			funcs.Normal3d, funcs.Normal3fv, funcs.Normal3bv, funcs.Normal3sv, funcs.Normal3iv, funcs.Normal3dv, funcs.NormalPointer, funcs.Ortho, 
			funcs.PassThrough, funcs.PixelMapfv, funcs.PixelMapusv, funcs.PixelMapuiv, funcs.PixelTransferi, funcs.PixelTransferf, funcs.PixelZoom, 
			funcs.PolygonStipple, funcs.PushAttrib, funcs.PushClientAttrib, funcs.PopAttrib, funcs.PopClientAttrib, funcs.PopMatrix, funcs.PopName, 
			funcs.PrioritizeTextures, funcs.PushMatrix, funcs.PushName, funcs.RasterPos2i, funcs.RasterPos2s, funcs.RasterPos2f, funcs.RasterPos2d, 
			funcs.RasterPos2iv, funcs.RasterPos2sv, funcs.RasterPos2fv, funcs.RasterPos2dv, funcs.RasterPos3i, funcs.RasterPos3s, funcs.RasterPos3f, 
			funcs.RasterPos3d, funcs.RasterPos3iv, funcs.RasterPos3sv, funcs.RasterPos3fv, funcs.RasterPos3dv, funcs.RasterPos4i, funcs.RasterPos4s, 
			funcs.RasterPos4f, funcs.RasterPos4d, funcs.RasterPos4iv, funcs.RasterPos4sv, funcs.RasterPos4fv, funcs.RasterPos4dv, funcs.Recti, funcs.Rects, 
			funcs.Rectf, funcs.Rectd, funcs.Rectiv, funcs.Rectsv, funcs.Rectfv, funcs.Rectdv, funcs.RenderMode, funcs.Rotatef, funcs.Rotated, funcs.Scalef, 
			funcs.Scaled, funcs.SelectBuffer, funcs.ShadeModel, funcs.TexCoord1f, funcs.TexCoord1s, funcs.TexCoord1i, funcs.TexCoord1d, funcs.TexCoord1fv, 
			funcs.TexCoord1sv, funcs.TexCoord1iv, funcs.TexCoord1dv, funcs.TexCoord2f, funcs.TexCoord2s, funcs.TexCoord2i, funcs.TexCoord2d, funcs.TexCoord2fv, 
			funcs.TexCoord2sv, funcs.TexCoord2iv, funcs.TexCoord2dv, funcs.TexCoord3f, funcs.TexCoord3s, funcs.TexCoord3i, funcs.TexCoord3d, funcs.TexCoord3fv, 
			funcs.TexCoord3sv, funcs.TexCoord3iv, funcs.TexCoord3dv, funcs.TexCoord4f, funcs.TexCoord4s, funcs.TexCoord4i, funcs.TexCoord4d, funcs.TexCoord4fv, 
			funcs.TexCoord4sv, funcs.TexCoord4iv, funcs.TexCoord4dv, funcs.TexCoordPointer, funcs.TexGeni, funcs.TexGeniv, funcs.TexGenf, funcs.TexGenfv, 
			funcs.TexGend, funcs.TexGendv, funcs.Translatef, funcs.Translated, funcs.Vertex2f, funcs.Vertex2s, funcs.Vertex2i, funcs.Vertex2d, funcs.Vertex2fv, 
			funcs.Vertex2sv, funcs.Vertex2iv, funcs.Vertex2dv, funcs.Vertex3f, funcs.Vertex3s, funcs.Vertex3i, funcs.Vertex3d, funcs.Vertex3fv, funcs.Vertex3sv, 
			funcs.Vertex3iv, funcs.Vertex3dv, funcs.Vertex4f, funcs.Vertex4s, funcs.Vertex4i, funcs.Vertex4d, funcs.Vertex4fv, funcs.Vertex4sv, funcs.Vertex4iv, 
			funcs.Vertex4dv, funcs.VertexPointer
		)) && checkFunctions(
			funcs.Enable, funcs.Disable, funcs.ArrayElement, funcs.BindTexture, funcs.BlendFunc, funcs.Clear, funcs.ClearColor, funcs.ClearDepth, 
			funcs.ClearStencil, funcs.ClipPlane, funcs.ColorMask, funcs.CopyPixels, funcs.CullFace, funcs.DepthFunc, funcs.DepthMask, funcs.DepthRange, 
			funcs.DrawArrays, funcs.DrawBuffer, funcs.DrawElements, funcs.Finish, funcs.Flush, funcs.FrontFace, funcs.GenTextures, funcs.DeleteTextures, 
			funcs.GetClipPlane, funcs.GetBooleanv, funcs.GetFloatv, funcs.GetIntegerv, funcs.GetDoublev, funcs.GetError, funcs.GetPointerv, funcs.GetString, 
			funcs.GetTexEnviv, funcs.GetTexEnvfv, funcs.GetTexImage, funcs.GetTexLevelParameteriv, funcs.GetTexLevelParameterfv, funcs.GetTexParameteriv, 
			funcs.GetTexParameterfv, funcs.Hint, funcs.InterleavedArrays, funcs.IsEnabled, funcs.IsTexture, funcs.LineWidth, funcs.LogicOp, funcs.PixelStorei, 
			funcs.PixelStoref, funcs.PointSize, funcs.PolygonMode, funcs.PolygonOffset, funcs.ReadBuffer, funcs.ReadPixels, funcs.Scissor, funcs.StencilFunc, 
			funcs.StencilMask, funcs.StencilOp, funcs.TexEnvi, funcs.TexEnviv, funcs.TexEnvf, funcs.TexEnvfv, funcs.TexImage2D, funcs.TexImage1D, 
			funcs.CopyTexImage2D, funcs.CopyTexImage1D, funcs.CopyTexSubImage1D, funcs.CopyTexSubImage2D, funcs.TexParameteri, funcs.TexParameteriv, 
			funcs.TexParameterf, funcs.TexParameterfv, funcs.TexSubImage1D, funcs.TexSubImage2D, funcs.Viewport
		);

		return GL.checkExtension("OpenGL11", funcs, supported);
	}

	// --- [ glEnable ] ---

	/** JNI method for {@link #glEnable Enable} */
	@JavadocExclude
	public static native void nglEnable(int target, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glEnable.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Enables the specified OpenGL state.
	 *
	 * @param target the OpenGL state to enable
	 */
	public static void glEnable(int target) {
		long __functionAddress = getInstance().Enable;
		nglEnable(target, __functionAddress);
	}

	// --- [ glDisable ] ---

	/** JNI method for {@link #glDisable Disable} */
	@JavadocExclude
	public static native void nglDisable(int target, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glEnable.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Disables the specified OpenGL state.
	 *
	 * @param target the OpenGL state to disable
	 */
	public static void glDisable(int target) {
		long __functionAddress = getInstance().Disable;
		nglDisable(target, __functionAddress);
	}

	// --- [ glAccum ] ---

	/** JNI method for {@link #glAccum Accum} */
	@JavadocExclude
	public static native void nglAccum(int op, float value, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glAccum.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Each portion of a pixel in the accumulation buffer consists of four values: one for each of R, G, B, and A. The accumulation buffer is controlled
	 * exclusively through the use of this method (except for clearing it).
	 *
	 * @param op    a symbolic constant indicating an accumulation buffer operation
	 * @param value a floating-point value to be used in that operation. One of:<br>{@link #GL_ACCUM ACCUM}, {@link #GL_LOAD LOAD}, {@link #GL_RETURN RETURN}, {@link #GL_MULT MULT}, {@link #GL_ADD ADD}
	 */
	public static void glAccum(int op, float value) {
		long __functionAddress = getInstance().Accum;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglAccum(op, value, __functionAddress);
	}

	// --- [ glAlphaFunc ] ---

	/** JNI method for {@link #glAlphaFunc AlphaFunc} */
	@JavadocExclude
	public static native void nglAlphaFunc(int func, float ref, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glAlphaFunc.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * The alpha test discards a fragment conditionally based on the outcome of a comparison between the incoming fragment’s alpha value and a constant value.
	 * The comparison is enabled or disabled with the generic {@link #glEnable Enable} and {@link #glDisable Disable} commands using the symbolic constant {@link #GL_ALPHA_TEST ALPHA_TEST}.
	 * When disabled, it is as if the comparison always passes. The test is controlled with this method.
	 *
	 * @param func a symbolic constant indicating the alpha test function. One of:<br>{@link #GL_NEVER NEVER}, {@link #GL_ALWAYS ALWAYS}, {@link #GL_LESS LESS}, {@link #GL_LEQUAL LEQUAL}, {@link #GL_EQUAL EQUAL}, {@link #GL_GEQUAL GEQUAL}, {@link #GL_GREATER GREATER}, {@link #GL_NOTEQUAL NOTEQUAL}
	 * @param ref  a reference value clamped to the range [0, 1]. When performing the alpha test, the GL will convert the reference value to the same representation as the fragment's alpha value (floating-point or fixed-point).
	 */
	public static void glAlphaFunc(int func, float ref) {
		long __functionAddress = getInstance().AlphaFunc;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglAlphaFunc(func, ref, __functionAddress);
	}

	// --- [ glAreTexturesResident ] ---

	/** JNI method for {@link #glAreTexturesResident AreTexturesResident} */
	@JavadocExclude
	public static native boolean nglAreTexturesResident(int n, long textures, long residences, long __functionAddress);

	/** Unsafe version of {@link #glAreTexturesResident AreTexturesResident} */
	@JavadocExclude
	public static boolean nglAreTexturesResident(int n, long textures, long residences) {
		long __functionAddress = getInstance().AreTexturesResident;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglAreTexturesResident(n, textures, residences, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glAreTexturesResident.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns {@link #GL_TRUE TRUE} if all of the texture objects named in textures are resident, or if the implementation does not distinguish a working set. If
	 * at least one of the texture objects named in textures is not resident, then {@link #GL_FALSE FALSE} is returned, and the residence of each texture object is
	 * returned in residences. Otherwise the contents of residences are not changed.
	 *
	 * @param n          the number of texture objects in {@code textures}
	 * @param textures   an array of texture objects
	 * @param residences returns the residences of each texture object
	 */
	public static boolean glAreTexturesResident(int n, ByteBuffer textures, ByteBuffer residences) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(textures, n << 2);
			checkBuffer(residences, n);
		}
		return nglAreTexturesResident(n, memAddress(textures), memAddress(residences));
	}

	/** Alternative version of: {@link #glAreTexturesResident AreTexturesResident} */
	public static boolean glAreTexturesResident(IntBuffer textures, ByteBuffer residences) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(residences, textures.remaining());
		return nglAreTexturesResident(textures.remaining(), memAddress(textures), memAddress(residences));
	}

	/** Single value version of: {@link #glAreTexturesResident AreTexturesResident} */
	public static boolean glAreTexturesResident(int texture, ByteBuffer residences) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(residences, 1);
		APIBuffer __buffer = apiBuffer();
		int textures = __buffer.intParam(texture);
		return nglAreTexturesResident(1, __buffer.address(textures), memAddress(residences));
	}

	// --- [ glArrayElement ] ---

	/** JNI method for {@link #glArrayElement ArrayElement} */
	@JavadocExclude
	public static native void nglArrayElement(int i, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glArrayElement.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Transfers the ith element of every enabled, non-instanced array, and the first element of every enabled, instanced array to the GL.
	 *
	 * @param i the element to transfer
	 */
	public static void glArrayElement(int i) {
		long __functionAddress = getInstance().ArrayElement;
		nglArrayElement(i, __functionAddress);
	}

	// --- [ glBegin ] ---

	/** JNI method for {@link #glBegin Begin} */
	@JavadocExclude
	public static native void nglBegin(int mode, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glBegin.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Begins the definition of vertex attributes of a sequence of primitives to be transferred to the GL.
	 *
	 * @param mode the primitive type being defined. One of:<br>{@link #GL_POINTS POINTS}, {@link #GL_LINE_STRIP LINE_STRIP}, {@link #GL_LINE_LOOP LINE_LOOP}, {@link #GL_LINES LINES}, {@link #GL_POLYGON POLYGON}, {@link #GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link #GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link #GL_TRIANGLES TRIANGLES}, {@link #GL_QUAD_STRIP QUAD_STRIP}, {@link #GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 */
	public static void glBegin(int mode) {
		long __functionAddress = getInstance().Begin;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBegin(mode, __functionAddress);
	}

	// --- [ glBindTexture ] ---

	/** JNI method for {@link #glBindTexture BindTexture} */
	@JavadocExclude
	public static native void nglBindTexture(int target, int texture, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindTexture.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds the a texture to a texture target.
	 * 
	 * <p>While a texture object is bound, GL operations on the target to which it is bound affect the bound object, and queries of the target to which it is
	 * bound return state from the bound object. If texture mapping of the dimensionality of the target to which a texture object is bound is enabled, the
	 * state of the bound texture object directs the texturing operation.</p>
	 *
	 * @param target  the texture target. One of:<br>{@link #GL_TEXTURE_1D TEXTURE_1D}, {@link #GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param texture the texture object to bind
	 */
	public static void glBindTexture(int target, int texture) {
		long __functionAddress = getInstance().BindTexture;
		nglBindTexture(target, texture, __functionAddress);
	}

	// --- [ glBitmap ] ---

	/** JNI method for {@link #glBitmap Bitmap} */
	@JavadocExclude
	public static native void nglBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data, long __functionAddress);

	/** Unsafe version of {@link #glBitmap Bitmap} */
	@JavadocExclude
	public static void nglBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data) {
		long __functionAddress = getInstance().Bitmap;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBitmap(w, h, xOrig, yOrig, xInc, yInc, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glBitmap.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sents a bitmap to the GL. Bitmaps are rectangles of zeros and ones specifying a particular pattern of fragments to be produced. Each of these fragments
	 * has the same associated data. These data are those associated with the current raster position.
	 *
	 * @param w     the bitmap width
	 * @param h     the bitmap width
	 * @param xOrig the bitmap origin x coordinate
	 * @param yOrig the bitmap origin y coordinate
	 * @param xInc  the x increment added to the raster position
	 * @param yInc  the y increment added to the raster position
	 * @param data  the buffer containing the bitmap data.
	 */
	public static void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglBitmap(w, h, xOrig, yOrig, xInc, yInc, memAddressSafe(data));
	}

	/** Buffer object offset version of: {@link #glBitmap Bitmap} */
	public static void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglBitmap(w, h, xOrig, yOrig, xInc, yInc, dataOffset);
	}

	// --- [ glBlendFunc ] ---

	/** JNI method for {@link #glBlendFunc BlendFunc} */
	@JavadocExclude
	public static native void nglBlendFunc(int sfactor, int dfactor, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBlendFunc.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the weighting factors used by the blend equation, for both RGB and alpha functions and for all draw buffers.
	 *
	 * @param sfactor the source weighting factor. One of:<br>{@link #GL_ZERO ZERO}, {@link #GL_ONE ONE}, {@link #GL_SRC_COLOR SRC_COLOR}, {@link #GL_ONE_MINUS_SRC_COLOR ONE_MINUS_SRC_COLOR}, {@link #GL_DST_COLOR DST_COLOR}, {@link #GL_ONE_MINUS_DST_COLOR ONE_MINUS_DST_COLOR}, {@link #GL_SRC_ALPHA SRC_ALPHA}, {@link #GL_ONE_MINUS_SRC_ALPHA ONE_MINUS_SRC_ALPHA}, {@link #GL_DST_ALPHA DST_ALPHA}, {@link #GL_ONE_MINUS_DST_ALPHA ONE_MINUS_DST_ALPHA}, {@link #GL_CONSTANT_COLOR CONSTANT_COLOR}, {@link #GL_ONE_MINUS_CONSTANT_COLOR ONE_MINUS_CONSTANT_COLOR}, {@link #GL_CONSTANT_ALPHA CONSTANT_ALPHA}, {@link #GL_ONE_MINUS_CONSTANT_ALPHA ONE_MINUS_CONSTANT_ALPHA}, {@link #GL_SRC_ALPHA_SATURATE SRC_ALPHA_SATURATE}, {@link GL33#GL_SRC1_COLOR SRC1_COLOR}, {@link GL33#GL_ONE_MINUS_SRC1_COLOR ONE_MINUS_SRC1_COLOR}, {@link GL15#GL_SRC1_ALPHA SRC1_ALPHA}, {@link GL33#GL_ONE_MINUS_SRC1_ALPHA ONE_MINUS_SRC1_ALPHA}
	 * @param dfactor the destination weighting factor
	 */
	public static void glBlendFunc(int sfactor, int dfactor) {
		long __functionAddress = getInstance().BlendFunc;
		nglBlendFunc(sfactor, dfactor, __functionAddress);
	}

	// --- [ glCallList ] ---

	/** JNI method for {@link #glCallList CallList} */
	@JavadocExclude
	public static native void nglCallList(int list, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glCallList.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Executes a display list. Causes the commands saved in the display list to be executed, in order, just as if they were issued without using a display list.
	 *
	 * @param list the index of the display list to be called
	 */
	public static void glCallList(int list) {
		long __functionAddress = getInstance().CallList;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCallList(list, __functionAddress);
	}

	// --- [ glCallLists ] ---

	/** JNI method for {@link #glCallLists CallLists} */
	@JavadocExclude
	public static native void nglCallLists(int n, int type, long lists, long __functionAddress);

	/** Unsafe version of {@link #glCallLists CallLists} */
	@JavadocExclude
	public static void nglCallLists(int n, int type, long lists) {
		long __functionAddress = getInstance().CallLists;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCallLists(n, type, lists, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glCallLists.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Provides an efficient means for executing a number of display lists.
	 *
	 * @param n     the number of display lists to be called
	 * @param type  the data type of each element in {@code lists}. One of:<br>{@link #GL_BYTE BYTE}, {@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_SHORT SHORT}, {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_INT INT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}, {@link #GL_FLOAT FLOAT}, {@link #GL_2_BYTES 2_BYTES}, {@link #GL_3_BYTES 3_BYTES}, {@link #GL_4_BYTES 4_BYTES}
	 * @param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.
	 */
	public static void glCallLists(int n, int type, ByteBuffer lists) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(lists, n * GLChecks.typeToBytes(type));
		nglCallLists(n, type, memAddress(lists));
	}

	/** Alternative version of: {@link #glCallLists CallLists} */
	public static void glCallLists(int type, ByteBuffer lists) {
		nglCallLists(lists.remaining() / GLChecks.typeToBytes(type), type, memAddress(lists));
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glCallLists CallLists} */
	public static void glCallLists(ByteBuffer lists) {
		nglCallLists(lists.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(lists));
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glCallLists CallLists} */
	public static void glCallLists(ShortBuffer lists) {
		nglCallLists(lists.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(lists));
	}

	/** GL_UNSIGNED_INT version of: {@link #glCallLists CallLists} */
	public static void glCallLists(IntBuffer lists) {
		nglCallLists(lists.remaining(), GL11.GL_UNSIGNED_INT, memAddress(lists));
	}

	// --- [ glClear ] ---

	/** JNI method for {@link #glClear Clear} */
	@JavadocExclude
	public static native void nglClear(int mask, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClear.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets portions of every pixel in a particular buffer to the same value. The value to which each buffer is cleared depends on the setting of the clear
	 * value for that buffer.
	 *
	 * @param mask Zero or the bitwise OR of one or more values indicating which buffers are to be cleared. One or more of:<br>{@link #GL_ACCUM_BUFFER_BIT ACCUM_BUFFER_BIT}, {@link #GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}, {@link #GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}, {@link #GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}
	 */
	public static void glClear(int mask) {
		long __functionAddress = getInstance().Clear;
		nglClear(mask, __functionAddress);
	}

	// --- [ glClearAccum ] ---

	/** JNI method for {@link #glClearAccum ClearAccum} */
	@JavadocExclude
	public static native void nglClearAccum(float red, float green, float blue, float alpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glClearAccum.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the clear values for the accumulation buffer. These values are clamped to the range [-1,1] when they are specified.
	 *
	 * @param red   the value to which to clear the R values of the accumulation buffer
	 * @param green the value to which to clear the G values of the accumulation buffer
	 * @param blue  the value to which to clear the B values of the accumulation buffer
	 * @param alpha the value to which to clear the A values of the accumulation buffer
	 */
	public static void glClearAccum(float red, float green, float blue, float alpha) {
		long __functionAddress = getInstance().ClearAccum;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClearAccum(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glClearColor ] ---

	/** JNI method for {@link #glClearColor ClearColor} */
	@JavadocExclude
	public static native void nglClearColor(float red, float green, float blue, float alpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearColor.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the clear value for fixed-point and floating-point color buffers in RGBA mode. The specified components are stored as floating-point values.
	 *
	 * @param red   the value to which to clear the R channel of the color buffer
	 * @param green the value to which to clear the G channel of the color buffer
	 * @param blue  the value to which to clear the B channel of the color buffer
	 * @param alpha the value to which to clear the A channel of the color buffer
	 */
	public static void glClearColor(float red, float green, float blue, float alpha) {
		long __functionAddress = getInstance().ClearColor;
		nglClearColor(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glClearDepth ] ---

	/** JNI method for {@link #glClearDepth ClearDepth} */
	@JavadocExclude
	public static native void nglClearDepth(double depth, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearDepth.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the depth value used when clearing the depth buffer. When clearing a fixedpoint depth buffer, {@code depth} is clamped to the range [0,1] and
	 * converted to fixed-point. No conversion is applied when clearing a floating-point depth buffer.
	 *
	 * @param depth the value to which to clear the depth buffer
	 */
	public static void glClearDepth(double depth) {
		long __functionAddress = getInstance().ClearDepth;
		nglClearDepth(depth, __functionAddress);
	}

	// --- [ glClearIndex ] ---

	/** JNI method for {@link #glClearIndex ClearIndex} */
	@JavadocExclude
	public static native void nglClearIndex(float index, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glClearIndex.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * sets the clear color index. index is converted to a fixed-point value with unspecified precision to the left of the binary point; the integer part of
	 * this value is then masked with <code style="font-family: monospace">2<sup>m</sup> &ndash; 1</code>, where {@code m} is the number of bits in a color index value stored in the
	 * framebuffer.
	 *
	 * @param index the value to which to clear the color buffer in color index mode
	 */
	public static void glClearIndex(float index) {
		long __functionAddress = getInstance().ClearIndex;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClearIndex(index, __functionAddress);
	}

	// --- [ glClearStencil ] ---

	/** JNI method for {@link #glClearStencil ClearStencil} */
	@JavadocExclude
	public static native void nglClearStencil(int s, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearStencil.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the value to which to clear the stencil buffer. {@code s} is masked to the number of bitplanes in the stencil buffer.
	 *
	 * @param s the value to which to clear the stencil buffer
	 */
	public static void glClearStencil(int s) {
		long __functionAddress = getInstance().ClearStencil;
		nglClearStencil(s, __functionAddress);
	}

	// --- [ glClipPlane ] ---

	/** JNI method for {@link #glClipPlane ClipPlane} */
	@JavadocExclude
	public static native void nglClipPlane(int plane, long equation, long __functionAddress);

	/** Unsafe version of {@link #glClipPlane ClipPlane} */
	@JavadocExclude
	public static void nglClipPlane(int plane, long equation) {
		long __functionAddress = getInstance().ClipPlane;
		nglClipPlane(plane, equation, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClipPlane.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies a client-defined clip plane.
	 * 
	 * <p>The value of the first argument, {@code plane}, is a symbolic constant, CLIP_PLANEi, where i is an integer between 0 and n &ndash; 1, indicating one of
	 * n client-defined clip planes. {@code equation} is an array of four double-precision floating-point values. These are the coefficients of a plane
	 * equation in object coordinates: p1, p2, p3, and p4 (in that order).</p>
	 *
	 * @param plane    the clip plane to define
	 * @param equation the clip plane coefficients
	 */
	public static void glClipPlane(int plane, ByteBuffer equation) {
		nglClipPlane(plane, memAddress(equation));
	}

	/** Alternative version of: {@link #glClipPlane ClipPlane} */
	public static void glClipPlane(int plane, DoubleBuffer equation) {
		nglClipPlane(plane, memAddress(equation));
	}

	// --- [ glColor3b ] ---

	/** JNI method for {@link #glColor3b Color3b} */
	@JavadocExclude
	public static native void nglColor3b(byte red, byte green, byte blue, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3b.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the R, G, and B components of the current color. The alpha component is set to 1.0.
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3b(byte red, byte green, byte blue) {
		long __functionAddress = getInstance().Color3b;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3b(red, green, blue, __functionAddress);
	}

	// --- [ glColor3s ] ---

	/** JNI method for {@link #glColor3s Color3s} */
	@JavadocExclude
	public static native void nglColor3s(short red, short green, short blue, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3s(short red, short green, short blue) {
		long __functionAddress = getInstance().Color3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3s(red, green, blue, __functionAddress);
	}

	// --- [ glColor3i ] ---

	/** JNI method for {@link #glColor3i Color3i} */
	@JavadocExclude
	public static native void nglColor3i(int red, int green, int blue, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3i(int red, int green, int blue) {
		long __functionAddress = getInstance().Color3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3i(red, green, blue, __functionAddress);
	}

	// --- [ glColor3f ] ---

	/** JNI method for {@link #glColor3f Color3f} */
	@JavadocExclude
	public static native void nglColor3f(float red, float green, float blue, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3f(float red, float green, float blue) {
		long __functionAddress = getInstance().Color3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3f(red, green, blue, __functionAddress);
	}

	// --- [ glColor3d ] ---

	/** JNI method for {@link #glColor3d Color3d} */
	@JavadocExclude
	public static native void nglColor3d(double red, double green, double blue, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3d(double red, double green, double blue) {
		long __functionAddress = getInstance().Color3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3d(red, green, blue, __functionAddress);
	}

	// --- [ glColor3ub ] ---

	/** JNI method for {@link #glColor3ub Color3ub} */
	@JavadocExclude
	public static native void nglColor3ub(byte red, byte green, byte blue, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3ub.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3ub(byte red, byte green, byte blue) {
		long __functionAddress = getInstance().Color3ub;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3ub(red, green, blue, __functionAddress);
	}

	// --- [ glColor3us ] ---

	/** JNI method for {@link #glColor3us Color3us} */
	@JavadocExclude
	public static native void nglColor3us(short red, short green, short blue, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3us.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned short version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3us(short red, short green, short blue) {
		long __functionAddress = getInstance().Color3us;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3us(red, green, blue, __functionAddress);
	}

	// --- [ glColor3ui ] ---

	/** JNI method for {@link #glColor3ui Color3ui} */
	@JavadocExclude
	public static native void nglColor3ui(int red, int green, int blue, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned int version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3ui(int red, int green, int blue) {
		long __functionAddress = getInstance().Color3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3ui(red, green, blue, __functionAddress);
	}

	// --- [ glColor3bv ] ---

	/** JNI method for {@link #glColor3bv Color3bv} */
	@JavadocExclude
	public static native void nglColor3bv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor3bv Color3bv} */
	@JavadocExclude
	public static void nglColor3bv(long v) {
		long __functionAddress = getInstance().Color3bv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3bv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3b.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Byte pointer version of {@link #glColor3b Color3b}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3bv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglColor3bv(memAddress(v));
	}

	// --- [ glColor3sv ] ---

	/** JNI method for {@link #glColor3sv Color3sv} */
	@JavadocExclude
	public static native void nglColor3sv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor3sv Color3sv} */
	@JavadocExclude
	public static void nglColor3sv(long v) {
		long __functionAddress = getInstance().Color3sv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3sv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3s Color3s}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3sv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglColor3sv(memAddress(v));
	}

	/** Alternative version of: {@link #glColor3sv Color3sv} */
	public static void glColor3sv(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglColor3sv(memAddress(v));
	}

	// --- [ glColor3iv ] ---

	/** JNI method for {@link #glColor3iv Color3iv} */
	@JavadocExclude
	public static native void nglColor3iv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor3iv Color3iv} */
	@JavadocExclude
	public static void nglColor3iv(long v) {
		long __functionAddress = getInstance().Color3iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3iv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3i Color3i}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3iv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglColor3iv(memAddress(v));
	}

	/** Alternative version of: {@link #glColor3iv Color3iv} */
	public static void glColor3iv(IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglColor3iv(memAddress(v));
	}

	// --- [ glColor3fv ] ---

	/** JNI method for {@link #glColor3fv Color3fv} */
	@JavadocExclude
	public static native void nglColor3fv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor3fv Color3fv} */
	@JavadocExclude
	public static void nglColor3fv(long v) {
		long __functionAddress = getInstance().Color3fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3fv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3f Color3f}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3fv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglColor3fv(memAddress(v));
	}

	/** Alternative version of: {@link #glColor3fv Color3fv} */
	public static void glColor3fv(FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglColor3fv(memAddress(v));
	}

	// --- [ glColor3dv ] ---

	/** JNI method for {@link #glColor3dv Color3dv} */
	@JavadocExclude
	public static native void nglColor3dv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor3dv Color3dv} */
	@JavadocExclude
	public static void nglColor3dv(long v) {
		long __functionAddress = getInstance().Color3dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3dv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3d Color3d}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3dv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 3);
		nglColor3dv(memAddress(v));
	}

	/** Alternative version of: {@link #glColor3dv Color3dv} */
	public static void glColor3dv(DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglColor3dv(memAddress(v));
	}

	// --- [ glColor3ubv ] ---

	/** JNI method for {@link #glColor3ubv Color3ubv} */
	@JavadocExclude
	public static native void nglColor3ubv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor3ubv Color3ubv} */
	@JavadocExclude
	public static void nglColor3ubv(long v) {
		long __functionAddress = getInstance().Color3ubv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3ubv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3ub.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3ub Color3ub}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3ubv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglColor3ubv(memAddress(v));
	}

	// --- [ glColor3usv ] ---

	/** JNI method for {@link #glColor3usv Color3usv} */
	@JavadocExclude
	public static native void nglColor3usv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor3usv Color3usv} */
	@JavadocExclude
	public static void nglColor3usv(long v) {
		long __functionAddress = getInstance().Color3usv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3usv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3us Color3us}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3usv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglColor3usv(memAddress(v));
	}

	/** Alternative version of: {@link #glColor3usv Color3usv} */
	public static void glColor3usv(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglColor3usv(memAddress(v));
	}

	// --- [ glColor3uiv ] ---

	/** JNI method for {@link #glColor3uiv Color3uiv} */
	@JavadocExclude
	public static native void nglColor3uiv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor3uiv Color3uiv} */
	@JavadocExclude
	public static void nglColor3uiv(long v) {
		long __functionAddress = getInstance().Color3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3uiv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3ui Color3ui}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3uiv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglColor3uiv(memAddress(v));
	}

	/** Alternative version of: {@link #glColor3uiv Color3uiv} */
	public static void glColor3uiv(IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglColor3uiv(memAddress(v));
	}

	// --- [ glColor4b ] ---

	/** JNI method for {@link #glColor4b Color4b} */
	@JavadocExclude
	public static native void nglColor4b(byte red, byte green, byte blue, byte alpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4b.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current color.
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4b(byte red, byte green, byte blue, byte alpha) {
		long __functionAddress = getInstance().Color4b;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4b(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4s ] ---

	/** JNI method for {@link #glColor4s Color4s} */
	@JavadocExclude
	public static native void nglColor4s(short red, short green, short blue, short alpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4s(short red, short green, short blue, short alpha) {
		long __functionAddress = getInstance().Color4s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4s(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4i ] ---

	/** JNI method for {@link #glColor4i Color4i} */
	@JavadocExclude
	public static native void nglColor4i(int red, int green, int blue, int alpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4i(int red, int green, int blue, int alpha) {
		long __functionAddress = getInstance().Color4i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4i(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4f ] ---

	/** JNI method for {@link #glColor4f Color4f} */
	@JavadocExclude
	public static native void nglColor4f(float red, float green, float blue, float alpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4f(float red, float green, float blue, float alpha) {
		long __functionAddress = getInstance().Color4f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4f(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4d ] ---

	/** JNI method for {@link #glColor4d Color4d} */
	@JavadocExclude
	public static native void nglColor4d(double red, double green, double blue, double alpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4d(double red, double green, double blue, double alpha) {
		long __functionAddress = getInstance().Color4d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4d(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4ub ] ---

	/** JNI method for {@link #glColor4ub Color4ub} */
	@JavadocExclude
	public static native void nglColor4ub(byte red, byte green, byte blue, byte alpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4ub.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4ub(byte red, byte green, byte blue, byte alpha) {
		long __functionAddress = getInstance().Color4ub;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4ub(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4us ] ---

	/** JNI method for {@link #glColor4us Color4us} */
	@JavadocExclude
	public static native void nglColor4us(short red, short green, short blue, short alpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4us.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned short version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4us(short red, short green, short blue, short alpha) {
		long __functionAddress = getInstance().Color4us;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4us(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4ui ] ---

	/** JNI method for {@link #glColor4ui Color4ui} */
	@JavadocExclude
	public static native void nglColor4ui(int red, int green, int blue, int alpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned int version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4ui(int red, int green, int blue, int alpha) {
		long __functionAddress = getInstance().Color4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4ui(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4bv ] ---

	/** JNI method for {@link #glColor4bv Color4bv} */
	@JavadocExclude
	public static native void nglColor4bv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor4bv Color4bv} */
	@JavadocExclude
	public static void nglColor4bv(long v) {
		long __functionAddress = getInstance().Color4bv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4bv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4b.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4b Color4b}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4bv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglColor4bv(memAddress(v));
	}

	// --- [ glColor4sv ] ---

	/** JNI method for {@link #glColor4sv Color4sv} */
	@JavadocExclude
	public static native void nglColor4sv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor4sv Color4sv} */
	@JavadocExclude
	public static void nglColor4sv(long v) {
		long __functionAddress = getInstance().Color4sv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4sv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4s Color4s}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4sv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglColor4sv(memAddress(v));
	}

	/** Alternative version of: {@link #glColor4sv Color4sv} */
	public static void glColor4sv(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglColor4sv(memAddress(v));
	}

	// --- [ glColor4iv ] ---

	/** JNI method for {@link #glColor4iv Color4iv} */
	@JavadocExclude
	public static native void nglColor4iv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor4iv Color4iv} */
	@JavadocExclude
	public static void nglColor4iv(long v) {
		long __functionAddress = getInstance().Color4iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4iv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4i Color4i}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4iv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglColor4iv(memAddress(v));
	}

	/** Alternative version of: {@link #glColor4iv Color4iv} */
	public static void glColor4iv(IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglColor4iv(memAddress(v));
	}

	// --- [ glColor4fv ] ---

	/** JNI method for {@link #glColor4fv Color4fv} */
	@JavadocExclude
	public static native void nglColor4fv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor4fv Color4fv} */
	@JavadocExclude
	public static void nglColor4fv(long v) {
		long __functionAddress = getInstance().Color4fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4fv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4f Color4f}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4fv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglColor4fv(memAddress(v));
	}

	/** Alternative version of: {@link #glColor4fv Color4fv} */
	public static void glColor4fv(FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglColor4fv(memAddress(v));
	}

	// --- [ glColor4dv ] ---

	/** JNI method for {@link #glColor4dv Color4dv} */
	@JavadocExclude
	public static native void nglColor4dv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor4dv Color4dv} */
	@JavadocExclude
	public static void nglColor4dv(long v) {
		long __functionAddress = getInstance().Color4dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4dv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4d Color4d}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4dv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 3);
		nglColor4dv(memAddress(v));
	}

	/** Alternative version of: {@link #glColor4dv Color4dv} */
	public static void glColor4dv(DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglColor4dv(memAddress(v));
	}

	// --- [ glColor4ubv ] ---

	/** JNI method for {@link #glColor4ubv Color4ubv} */
	@JavadocExclude
	public static native void nglColor4ubv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor4ubv Color4ubv} */
	@JavadocExclude
	public static void nglColor4ubv(long v) {
		long __functionAddress = getInstance().Color4ubv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4ubv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4ub.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4ub Color4ub}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4ubv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglColor4ubv(memAddress(v));
	}

	// --- [ glColor4usv ] ---

	/** JNI method for {@link #glColor4usv Color4usv} */
	@JavadocExclude
	public static native void nglColor4usv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor4usv Color4usv} */
	@JavadocExclude
	public static void nglColor4usv(long v) {
		long __functionAddress = getInstance().Color4usv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4usv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4us Color4us}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4usv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglColor4usv(memAddress(v));
	}

	/** Alternative version of: {@link #glColor4usv Color4usv} */
	public static void glColor4usv(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglColor4usv(memAddress(v));
	}

	// --- [ glColor4uiv ] ---

	/** JNI method for {@link #glColor4uiv Color4uiv} */
	@JavadocExclude
	public static native void nglColor4uiv(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor4uiv Color4uiv} */
	@JavadocExclude
	public static void nglColor4uiv(long v) {
		long __functionAddress = getInstance().Color4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4uiv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColor4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4ui Color4ui}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4uiv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglColor4uiv(memAddress(v));
	}

	/** Alternative version of: {@link #glColor4uiv Color4uiv} */
	public static void glColor4uiv(IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglColor4uiv(memAddress(v));
	}

	// --- [ glColorMask ] ---

	/** JNI method for {@link #glColorMask ColorMask} */
	@JavadocExclude
	public static native void nglColorMask(boolean red, boolean green, boolean blue, boolean alpha, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glColorMask.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Masks the writing of R, G, B and A values to all draw buffers. In the initial state, all color values are enabled for writing for all draw buffers.
	 *
	 * @param red   whether R values are written or not
	 * @param green whether G values are written or not
	 * @param blue  whether B values are written or not
	 * @param alpha whether A values are written or not
	 */
	public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
		long __functionAddress = getInstance().ColorMask;
		nglColorMask(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColorMaterial ] ---

	/** JNI method for {@link #glColorMaterial ColorMaterial} */
	@JavadocExclude
	public static native void nglColorMaterial(int face, int mode, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorMaterial.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * It is possible to attach one or more material properties to the current color, so that they continuously track its component values. This behavior is
	 * enabled and disabled by calling {@link #glEnable Enable} or {@link #glDisable Disable} with the symbolic value {@link #GL_COLOR_MATERIAL COLOR_MATERIAL}. This function controls which
	 * of these modes is selected.
	 *
	 * @param face specifies which material face is affected by the current color. One of:<br>{@link #GL_FRONT FRONT}, {@link #GL_BACK BACK}, {@link #GL_FRONT_AND_BACK FRONT_AND_BACK}
	 * @param mode specifies which material property or properties track the current color. One of:<br>{@link #GL_EMISSION EMISSION}, {@link #GL_AMBIENT AMBIENT}, {@link #GL_DIFFUSE DIFFUSE}, {@link #GL_SPECULAR SPECULAR}, {@link #GL_AMBIENT_AND_DIFFUSE AMBIENT_AND_DIFFUSE}
	 */
	public static void glColorMaterial(int face, int mode) {
		long __functionAddress = getInstance().ColorMaterial;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorMaterial(face, mode, __functionAddress);
	}

	// --- [ glColorPointer ] ---

	/** JNI method for {@link #glColorPointer ColorPointer} */
	@JavadocExclude
	public static native void nglColorPointer(int size, int type, int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glColorPointer ColorPointer} */
	@JavadocExclude
	public static void nglColorPointer(int size, int type, int stride, long pointer) {
		long __functionAddress = getInstance().ColorPointer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorPointer(size, type, stride, pointer, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. One of:<br>3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type    the data type of the values stored in the array. One of:<br>{@link #GL_BYTE BYTE}, {@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_SHORT SHORT}, {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_INT INT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT FLOAT}, {@link #GL_DOUBLE DOUBLE}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the color array data
	 */
	public static void glColorPointer(int size, int type, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglColorPointer(size, type, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glColorPointer ColorPointer} */
	public static void glColorPointer(int size, int type, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglColorPointer(size, type, stride, pointerOffset);
	}

	/** GL_UNSIGNED_BYTE / GL_BYTE version of: {@link #glColorPointer ColorPointer} */
	public static void glColorPointer(int size, boolean unsigned, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglColorPointer(size, unsigned ? GL11.GL_UNSIGNED_BYTE : GL11.GL_BYTE, stride, memAddress(pointer));
	}

	/** GL_UNSIGNED_SHORT / GL_SHORT version of: {@link #glColorPointer ColorPointer} */
	public static void glColorPointer(int size, boolean unsigned, int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglColorPointer(size, unsigned ? GL11.GL_UNSIGNED_SHORT : GL11.GL_SHORT, stride, memAddress(pointer));
	}

	/** GL_FLOAT version of: {@link #glColorPointer ColorPointer} */
	public static void glColorPointer(int size, int stride, FloatBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglColorPointer(size, GL11.GL_FLOAT, stride, memAddress(pointer));
	}

	// --- [ glCopyPixels ] ---

	/** JNI method for {@link #glCopyPixels CopyPixels} */
	@JavadocExclude
	public static native void nglCopyPixels(int x, int y, int width, int height, int type, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCopyPixels.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Transfers a rectangle of pixel values from one region of the read framebuffer to another in the draw framebuffer
	 *
	 * @param x      the left framebuffer pixel coordinate
	 * @param y      the lower framebuffer pixel coordinate
	 * @param width  the rectangle width
	 * @param height the rectangle height
	 * @param type   Indicates the type of values to be transfered. One of:<br>{@link #GL_COLOR COLOR}, {@link #GL_STENCIL STENCIL}, {@link #GL_DEPTH DEPTH}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}
	 */
	public static void glCopyPixels(int x, int y, int width, int height, int type) {
		long __functionAddress = getInstance().CopyPixels;
		nglCopyPixels(x, y, width, height, type, __functionAddress);
	}

	// --- [ glCullFace ] ---

	/** JNI method for {@link #glCullFace CullFace} */
	@JavadocExclude
	public static native void nglCullFace(int mode, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCullFace.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies which polygon faces are culled if {@link #GL_CULL_FACE CULL_FACE} is enabled. Front-facing polygons are rasterized if either culling is disabled or the
	 * CullFace mode is {@link #GL_BACK BACK} while back-facing polygons are rasterized only if either culling is disabled or the CullFace mode is
	 * {@link #GL_FRONT FRONT}. The initial setting of the CullFace mode is {@link #GL_BACK BACK}. Initially, culling is disabled.
	 *
	 * @param mode the CullFace mode. One of:<br>{@link #GL_FRONT FRONT}, {@link #GL_BACK BACK}, {@link #GL_FRONT_AND_BACK FRONT_AND_BACK}
	 */
	public static void glCullFace(int mode) {
		long __functionAddress = getInstance().CullFace;
		nglCullFace(mode, __functionAddress);
	}

	// --- [ glDeleteLists ] ---

	/** JNI method for {@link #glDeleteLists DeleteLists} */
	@JavadocExclude
	public static native void nglDeleteLists(int list, int range, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glDeleteLists.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Deletes a contiguous group of display lists. All information about the display lists is lost, and the indices become unused. Indices to which no display
	 * list corresponds are ignored. If {@code range} is zero, nothing happens.
	 *
	 * @param list  the index of the first display list to be deleted
	 * @param range the number of display lists to be deleted
	 */
	public static void glDeleteLists(int list, int range) {
		long __functionAddress = getInstance().DeleteLists;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDeleteLists(list, range, __functionAddress);
	}

	// --- [ glDepthFunc ] ---

	/** JNI method for {@link #glDepthFunc DepthFunc} */
	@JavadocExclude
	public static native void nglDepthFunc(int func, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDepthFunc.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the comparison that takes place during the depth buffer test (when {@link #GL_DEPTH_TEST DEPTH_TEST} is enabled).
	 *
	 * @param func the depth test comparison. One of:<br>{@link #GL_NEVER NEVER}, {@link #GL_ALWAYS ALWAYS}, {@link #GL_LESS LESS}, {@link #GL_LEQUAL LEQUAL}, {@link #GL_EQUAL EQUAL}, {@link #GL_GREATER GREATER}, {@link #GL_GEQUAL GEQUAL}, {@link #GL_NOTEQUAL NOTEQUAL}
	 */
	public static void glDepthFunc(int func) {
		long __functionAddress = getInstance().DepthFunc;
		nglDepthFunc(func, __functionAddress);
	}

	// --- [ glDepthMask ] ---

	/** JNI method for {@link #glDepthMask DepthMask} */
	@JavadocExclude
	public static native void nglDepthMask(boolean flag, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDepthMask.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Masks the writing of depth values to the depth buffer. In the initial state, the depth buffer is enabled for writing.
	 *
	 * @param flag whether depth values are written or not.
	 */
	public static void glDepthMask(boolean flag) {
		long __functionAddress = getInstance().DepthMask;
		nglDepthMask(flag, __functionAddress);
	}

	// --- [ glDepthRange ] ---

	/** JNI method for {@link #glDepthRange DepthRange} */
	@JavadocExclude
	public static native void nglDepthRange(double zNear, double zFar, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDepthRange.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the depth range for all viewports to the same values.
	 *
	 * @param zNear the near depth range
	 * @param zFar  the far depth range
	 */
	public static void glDepthRange(double zNear, double zFar) {
		long __functionAddress = getInstance().DepthRange;
		nglDepthRange(zNear, zFar, __functionAddress);
	}

	// --- [ glDisableClientState ] ---

	/** JNI method for {@link #glDisableClientState DisableClientState} */
	@JavadocExclude
	public static native void nglDisableClientState(int array, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glDisableClientState.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Disables the specified fixed-function attribute array.
	 *
	 * @param array the attribute array to disable. One of:<br>{@link #GL_VERTEX_ARRAY VERTEX_ARRAY}, {@link #GL_NORMAL_ARRAY NORMAL_ARRAY}, {@link #GL_COLOR_ARRAY COLOR_ARRAY}, {@link GL14#GL_SECONDARY_COLOR_ARRAY SECONDARY_COLOR_ARRAY}, {@link #GL_EDGE_FLAG_ARRAY EDGE_FLAG_ARRAY}, {@link GL15#GL_FOG_COORD_ARRAY FOG_COORD_ARRAY}, {@link #GL_TEXTURE_COORD_ARRAY TEXTURE_COORD_ARRAY}
	 */
	public static void glDisableClientState(int array) {
		long __functionAddress = getInstance().DisableClientState;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDisableClientState(array, __functionAddress);
	}

	// --- [ glDrawArrays ] ---

	/** JNI method for {@link #glDrawArrays DrawArrays} */
	@JavadocExclude
	public static native void nglDrawArrays(int mode, int first, int count, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawArrays.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices. Elements {@code first} through
	 * <code style="font-family: monospace">first + count &ndash; 1</code> of each enabled non-instanced array are transferred to the GL.
	 * 
	 * <p>If an array corresponding to an attribute required by a vertex shader is not enabled, then the corresponding element is taken from the current attribute
	 * state. If an array is enabled, the corresponding current vertex attribute value is unaffected by the execution of this function.</p>
	 *
	 * @param mode  the kind of primitives being constructed
	 * @param first the first vertex to transfer to the GL
	 * @param count the number of vertices after {@code first} to transfer to the GL
	 */
	public static void glDrawArrays(int mode, int first, int count) {
		long __functionAddress = getInstance().DrawArrays;
		nglDrawArrays(mode, first, count, __functionAddress);
	}

	// --- [ glDrawBuffer ] ---

	/** JNI method for {@link #glDrawBuffer DrawBuffer} */
	@JavadocExclude
	public static native void nglDrawBuffer(int buf, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Defines the color buffer to which fragment color zero is written.
	 * 
	 * <p>Acceptable values for {@code buf} depend on whether the GL is using the default framebuffer (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is zero), or
	 * a framebuffer object (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is non-zero). In the initial state, the GL is bound to the default framebuffer.</p>
	 *
	 * @param buf the color buffer to draw to. One of:<br>{@link #GL_NONE NONE}, {@link #GL_FRONT_LEFT FRONT_LEFT}, {@link #GL_FRONT_RIGHT FRONT_RIGHT}, {@link #GL_BACK_LEFT BACK_LEFT}, {@link #GL_BACK_RIGHT BACK_RIGHT}, {@link #GL_FRONT FRONT}, {@link #GL_BACK BACK}, {@link #GL_LEFT LEFT}, {@link #GL_RIGHT RIGHT}, {@link #GL_FRONT_AND_BACK FRONT_AND_BACK}, {@link #GL_AUX0 AUX0}, {@link #GL_AUX1 AUX1}, {@link #GL_AUX2 AUX2}, {@link #GL_AUX3 AUX3}, {@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, GL30.GL_COLOR_ATTACHMENT[1-15]
	 */
	public static void glDrawBuffer(int buf) {
		long __functionAddress = getInstance().DrawBuffer;
		nglDrawBuffer(buf, __functionAddress);
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElements.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices to the GL.
	 * The i<sup>th</sup> element transferred by {@code DrawElements} will be taken from element {@code indices[i]} (if no element array buffer is bound), or
	 * from the element whose index is stored in the currently bound element array buffer at offset {@code indices + i}.
	 *
	 * @param mode    the kind of primitives being constructed. One of:<br>{@link #GL_POINTS POINTS}, {@link #GL_LINE_STRIP LINE_STRIP}, {@link #GL_LINE_LOOP LINE_LOOP}, {@link #GL_LINES LINES}, {@link #GL_POLYGON POLYGON}, {@link #GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link #GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link #GL_TRIANGLES TRIANGLES}, {@link #GL_QUAD_STRIP QUAD_STRIP}, {@link #GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count   the number of vertices to transfer to the GL
	 * @param type    indicates the type of index values in {@code indices}. One of:<br>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices the index values
	 */
	public static void glDrawElements(int mode, int count, int type, ByteBuffer indices) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indices, count << GLChecks.typeToByteShift(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElements(mode, count, type, memAddress(indices));
	}

	/** Buffer object offset version of: {@link #glDrawElements DrawElements} */
	public static void glDrawElements(int mode, int count, int type, long indicesOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElements(mode, count, type, indicesOffset);
	}

	/** Alternative version of: {@link #glDrawElements DrawElements} */
	public static void glDrawElements(int mode, int type, ByteBuffer indices) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElements(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices));
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElements DrawElements} */
	public static void glDrawElements(int mode, ByteBuffer indices) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElements(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices));
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElements DrawElements} */
	public static void glDrawElements(int mode, ShortBuffer indices) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElements(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices));
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElements DrawElements} */
	public static void glDrawElements(int mode, IntBuffer indices) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElements(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices));
	}

	// --- [ glDrawPixels ] ---

	/** JNI method for {@link #glDrawPixels DrawPixels} */
	@JavadocExclude
	public static native void nglDrawPixels(int width, int height, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glDrawPixels DrawPixels} */
	@JavadocExclude
	public static void nglDrawPixels(int width, int height, int format, int type, long pixels) {
		long __functionAddress = getInstance().DrawPixels;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDrawPixels(width, height, format, type, pixels, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glDrawPixels.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Draws a pixel rectangle to the active draw buffers.
	 *
	 * @param width  the pixel rectangle width
	 * @param height the pixel rectangle height
	 * @param format the pixel data format. One of:<br>{@link #GL_STENCIL_INDEX STENCIL_INDEX}, {@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link #GL_RED RED}, {@link #GL_GREEN GREEN}, {@link #GL_BLUE BLUE}, {@link #GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link #GL_RGB RGB}, {@link #GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link #GL_LUMINANCE LUMINANCE}, {@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type   the pixel data type. One of:<br>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_BYTE BYTE}, {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_SHORT SHORT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}, {@link #GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link #GL_BITMAP BITMAP}
	 * @param pixels the pixel data
	 */
	public static void glDrawPixels(int width, int height, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglDrawPixels(width, height, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glDrawPixels DrawPixels} */
	public static void glDrawPixels(int width, int height, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglDrawPixels(width, height, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glDrawPixels DrawPixels} */
	public static void glDrawPixels(int width, int height, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglDrawPixels(width, height, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glDrawPixels DrawPixels} */
	public static void glDrawPixels(int width, int height, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglDrawPixels(width, height, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glDrawPixels DrawPixels} */
	public static void glDrawPixels(int width, int height, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglDrawPixels(width, height, format, type, memAddress(pixels));
	}

	// --- [ glEdgeFlag ] ---

	/** JNI method for {@link #glEdgeFlag EdgeFlag} */
	@JavadocExclude
	public static native void nglEdgeFlag(boolean flag, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEdgeFlag.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Each edge of each polygon primitive generated is flagged as either boundary or non-boundary. These classifications are used during polygon
	 * rasterization; some modes affect the interpretation of polygon boundary edges. By default, all edges are boundary edges, but the flagging of polygons,
	 * separate triangles, or separate quadrilaterals may be altered by calling this function.
	 * 
	 * <p>When a primitive of type {@link #GL_POLYGON POLYGON}, {@link #GL_TRIANGLES TRIANGLES}, or {@link #GL_QUADS QUADS} is drawn, each vertex transferred begins an edge. If the edge
	 * flag bit is TRUE, then each specified vertex begins an edge that is flagged as boundary. If the bit is FALSE, then induced edges are flagged as
	 * non-boundary.</p>
	 *
	 * @param flag the edge flag bit
	 */
	public static void glEdgeFlag(boolean flag) {
		long __functionAddress = getInstance().EdgeFlag;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEdgeFlag(flag, __functionAddress);
	}

	// --- [ glEdgeFlagv ] ---

	/** JNI method for {@link #glEdgeFlagv EdgeFlagv} */
	@JavadocExclude
	public static native void nglEdgeFlagv(long flag, long __functionAddress);

	/** Unsafe version of {@link #glEdgeFlagv EdgeFlagv} */
	@JavadocExclude
	public static void nglEdgeFlagv(long flag) {
		long __functionAddress = getInstance().EdgeFlagv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEdgeFlagv(flag, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEdgeFlag.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glEdgeFlag EdgeFlag}.
	 *
	 * @param flag the edge flag buffer
	 */
	public static void glEdgeFlagv(ByteBuffer flag) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(flag, 1);
		nglEdgeFlagv(memAddress(flag));
	}

	// --- [ glEdgeFlagPointer ] ---

	/** JNI method for {@link #glEdgeFlagPointer EdgeFlagPointer} */
	@JavadocExclude
	public static native void nglEdgeFlagPointer(int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glEdgeFlagPointer EdgeFlagPointer} */
	@JavadocExclude
	public static void nglEdgeFlagPointer(int stride, long pointer) {
		long __functionAddress = getInstance().EdgeFlagPointer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEdgeFlagPointer(stride, pointer, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEdgeFlagPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of an edge flag array.
	 *
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the edge flag array data
	 */
	public static void glEdgeFlagPointer(int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglEdgeFlagPointer(stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glEdgeFlagPointer EdgeFlagPointer} */
	public static void glEdgeFlagPointer(int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglEdgeFlagPointer(stride, pointerOffset);
	}

	// --- [ glEnableClientState ] ---

	/** JNI method for {@link #glEnableClientState EnableClientState} */
	@JavadocExclude
	public static native void nglEnableClientState(int array, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEnableClientState.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Enables the specified fixed-function attribute array.
	 *
	 * @param array the attribute array to enable. One of:<br>{@link #GL_VERTEX_ARRAY VERTEX_ARRAY}, {@link #GL_NORMAL_ARRAY NORMAL_ARRAY}, {@link #GL_COLOR_ARRAY COLOR_ARRAY}, {@link GL14#GL_SECONDARY_COLOR_ARRAY SECONDARY_COLOR_ARRAY}, {@link #GL_EDGE_FLAG_ARRAY EDGE_FLAG_ARRAY}, {@link GL15#GL_FOG_COORD_ARRAY FOG_COORD_ARRAY}, {@link #GL_TEXTURE_COORD_ARRAY TEXTURE_COORD_ARRAY}
	 */
	public static void glEnableClientState(int array) {
		long __functionAddress = getInstance().EnableClientState;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEnableClientState(array, __functionAddress);
	}

	// --- [ glEnd ] ---

	/** JNI method for {@link #glEnd End} */
	@JavadocExclude
	public static native void nglEnd(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEnd.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
Ends the definition of vertex attributes of a sequence of primitives to be transferred to the GL.
	 */
	public static void glEnd() {
		long __functionAddress = getInstance().End;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEnd(__functionAddress);
	}

	// --- [ glEvalCoord1f ] ---

	/** JNI method for {@link #glEvalCoord1f EvalCoord1f} */
	@JavadocExclude
	public static native void nglEvalCoord1f(float u, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord1f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Causes evaluation of the enabled one-dimensional evaluator maps.
	 *
	 * @param u the domain coordinate u
	 */
	public static void glEvalCoord1f(float u) {
		long __functionAddress = getInstance().EvalCoord1f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord1f(u, __functionAddress);
	}

	// --- [ glEvalCoord1fv ] ---

	/** JNI method for {@link #glEvalCoord1fv EvalCoord1fv} */
	@JavadocExclude
	public static native void nglEvalCoord1fv(long u, long __functionAddress);

	/** Unsafe version of {@link #glEvalCoord1fv EvalCoord1fv} */
	@JavadocExclude
	public static void nglEvalCoord1fv(long u) {
		long __functionAddress = getInstance().EvalCoord1fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord1fv(u, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glEvalCoord1f EvalCoord1f}.
	 *
	 * @param u the domain coordinate buffer
	 */
	public static void glEvalCoord1fv(ByteBuffer u) {
		nglEvalCoord1fv(memAddress(u));
	}

	/** Alternative version of: {@link #glEvalCoord1fv EvalCoord1fv} */
	public static void glEvalCoord1fv(FloatBuffer u) {
		nglEvalCoord1fv(memAddress(u));
	}

	// --- [ glEvalCoord1d ] ---

	/** JNI method for {@link #glEvalCoord1d EvalCoord1d} */
	@JavadocExclude
	public static native void nglEvalCoord1d(double u, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord1d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glEvalCoord1f EvalCoord1f}.
	 *
	 * @param u the domain coordinate u
	 */
	public static void glEvalCoord1d(double u) {
		long __functionAddress = getInstance().EvalCoord1d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord1d(u, __functionAddress);
	}

	// --- [ glEvalCoord1dv ] ---

	/** JNI method for {@link #glEvalCoord1dv EvalCoord1dv} */
	@JavadocExclude
	public static native void nglEvalCoord1dv(long u, long __functionAddress);

	/** Unsafe version of {@link #glEvalCoord1dv EvalCoord1dv} */
	@JavadocExclude
	public static void nglEvalCoord1dv(long u) {
		long __functionAddress = getInstance().EvalCoord1dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord1dv(u, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glEvalCoord1d EvalCoord1d}.
	 *
	 * @param u the domain coordinate buffer
	 */
	public static void glEvalCoord1dv(ByteBuffer u) {
		nglEvalCoord1dv(memAddress(u));
	}

	/** Alternative version of: {@link #glEvalCoord1dv EvalCoord1dv} */
	public static void glEvalCoord1dv(DoubleBuffer u) {
		nglEvalCoord1dv(memAddress(u));
	}

	// --- [ glEvalCoord2f ] ---

	/** JNI method for {@link #glEvalCoord2f EvalCoord2f} */
	@JavadocExclude
	public static native void nglEvalCoord2f(float u, float v, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord2f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Causes evaluation of the enabled two-dimensional evaluator maps.
	 *
	 * @param u the domain coordinate u
	 * @param v the domain coordinate v
	 */
	public static void glEvalCoord2f(float u, float v) {
		long __functionAddress = getInstance().EvalCoord2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord2f(u, v, __functionAddress);
	}

	// --- [ glEvalCoord2fv ] ---

	/** JNI method for {@link #glEvalCoord2fv EvalCoord2fv} */
	@JavadocExclude
	public static native void nglEvalCoord2fv(long u, long __functionAddress);

	/** Unsafe version of {@link #glEvalCoord2fv EvalCoord2fv} */
	@JavadocExclude
	public static void nglEvalCoord2fv(long u) {
		long __functionAddress = getInstance().EvalCoord2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord2fv(u, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glEvalCoord2f EvalCoord2f}.
	 *
	 * @param u the domain coordinate buffer
	 */
	public static void glEvalCoord2fv(ByteBuffer u) {
		nglEvalCoord2fv(memAddress(u));
	}

	/** Alternative version of: {@link #glEvalCoord2fv EvalCoord2fv} */
	public static void glEvalCoord2fv(FloatBuffer u) {
		nglEvalCoord2fv(memAddress(u));
	}

	// --- [ glEvalCoord2d ] ---

	/** JNI method for {@link #glEvalCoord2d EvalCoord2d} */
	@JavadocExclude
	public static native void nglEvalCoord2d(double u, double v, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord2d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glEvalCoord2f EvalCoord2f}.
	 *
	 * @param u the domain coordinate u
	 * @param v the domain coordinate v
	 */
	public static void glEvalCoord2d(double u, double v) {
		long __functionAddress = getInstance().EvalCoord2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord2d(u, v, __functionAddress);
	}

	// --- [ glEvalCoord2dv ] ---

	/** JNI method for {@link #glEvalCoord2dv EvalCoord2dv} */
	@JavadocExclude
	public static native void nglEvalCoord2dv(long u, long __functionAddress);

	/** Unsafe version of {@link #glEvalCoord2dv EvalCoord2dv} */
	@JavadocExclude
	public static void nglEvalCoord2dv(long u) {
		long __functionAddress = getInstance().EvalCoord2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord2dv(u, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glEvalCoord2d EvalCoord2d}.
	 *
	 * @param u the domain coordinate buffer
	 */
	public static void glEvalCoord2dv(ByteBuffer u) {
		nglEvalCoord2dv(memAddress(u));
	}

	/** Alternative version of: {@link #glEvalCoord2dv EvalCoord2dv} */
	public static void glEvalCoord2dv(DoubleBuffer u) {
		nglEvalCoord2dv(memAddress(u));
	}

	// --- [ glEvalMesh1 ] ---

	/** JNI method for {@link #glEvalMesh1 EvalMesh1} */
	@JavadocExclude
	public static native void nglEvalMesh1(int mode, int i1, int i2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEvalMesh1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Carries out an evaluation on a subset of the one-dimensional map grid.
	 *
	 * @param mode the mesh type. One of:<br>{@link #GL_POINT POINT}, {@link #GL_LINE LINE}
	 * @param i1   the start index
	 * @param i2   the end index
	 */
	public static void glEvalMesh1(int mode, int i1, int i2) {
		long __functionAddress = getInstance().EvalMesh1;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalMesh1(mode, i1, i2, __functionAddress);
	}

	// --- [ glEvalMesh2 ] ---

	/** JNI method for {@link #glEvalMesh2 EvalMesh2} */
	@JavadocExclude
	public static native void nglEvalMesh2(int mode, int i1, int i2, int j1, int j2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEvalMesh2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Carries out an evaluation on a rectangular subset of the two-dimensional map grid.
	 *
	 * @param mode the mesh type. One of:<br>{@link #GL_FILL FILL}, {@link #GL_LINE LINE}, {@link #GL_POINT POINT}
	 * @param i1   the u-dimension start index
	 * @param i2   the u-dimension end index
	 * @param j1   the v-dimension start index
	 * @param j2   the v-dimension end index
	 */
	public static void glEvalMesh2(int mode, int i1, int i2, int j1, int j2) {
		long __functionAddress = getInstance().EvalMesh2;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalMesh2(mode, i1, i2, j1, j2, __functionAddress);
	}

	// --- [ glEvalPoint1 ] ---

	/** JNI method for {@link #glEvalPoint1 EvalPoint1} */
	@JavadocExclude
	public static native void nglEvalPoint1(int i, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEvalPoint1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Carries out an evalutation of a single point on the one-dimensional map grid.
	 *
	 * @param i the grid index
	 */
	public static void glEvalPoint1(int i) {
		long __functionAddress = getInstance().EvalPoint1;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalPoint1(i, __functionAddress);
	}

	// --- [ glEvalPoint2 ] ---

	/** JNI method for {@link #glEvalPoint2 EvalPoint2} */
	@JavadocExclude
	public static native void nglEvalPoint2(int i, int j, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEvalPoint2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Carries out an evalutation of a single point on the two-dimensional map grid.
	 *
	 * @param i the u-dimension grid index
	 * @param j the v-dimension grid index
	 */
	public static void glEvalPoint2(int i, int j) {
		long __functionAddress = getInstance().EvalPoint2;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalPoint2(i, j, __functionAddress);
	}

	// --- [ glFeedbackBuffer ] ---

	/** JNI method for {@link #glFeedbackBuffer FeedbackBuffer} */
	@JavadocExclude
	public static native void nglFeedbackBuffer(int size, int type, long buffer, long __functionAddress);

	/** Unsafe version of {@link #glFeedbackBuffer FeedbackBuffer} */
	@JavadocExclude
	public static void nglFeedbackBuffer(int size, int type, long buffer) {
		long __functionAddress = getInstance().FeedbackBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFeedbackBuffer(size, type, buffer, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFeedbackBuffer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns information about primitives when the GL is in feedback mode.
	 *
	 * @param size   the maximum number of values that can be written to {@code buffer}
	 * @param type   the type of information to feed back for each vertex. One of:<br>{@link #GL_2D 2D}, {@link #GL_3D 3D}, {@link #GL_3D_COLOR 3D_COLOR}, {@link #GL_3D_COLOR_TEXTURE 3D_COLOR_TEXTURE}, {@link #GL_4D_COLOR_TEXTURE 4D_COLOR_TEXTURE}
	 * @param buffer an array of floating-point values into which feedback information will be placed
	 */
	public static void glFeedbackBuffer(int size, int type, ByteBuffer buffer) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffer, size << 2);
		nglFeedbackBuffer(size, type, memAddress(buffer));
	}

	/** Alternative version of: {@link #glFeedbackBuffer FeedbackBuffer} */
	public static void glFeedbackBuffer(int type, FloatBuffer buffer) {
		nglFeedbackBuffer(buffer.remaining(), type, memAddress(buffer));
	}

	// --- [ glFinish ] ---

	/** JNI method for {@link #glFinish Finish} */
	@JavadocExclude
	public static native void nglFinish(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glFinish.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Forces all previously issued GL commands to complete. {@code Finish} does not return until all effects from such commands on GL client and server
	 * state and the framebuffer are fully realized.
	 */
	public static void glFinish() {
		long __functionAddress = getInstance().Finish;
		nglFinish(__functionAddress);
	}

	// --- [ glFlush ] ---

	/** JNI method for {@link #glFlush Flush} */
	@JavadocExclude
	public static native void nglFlush(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glFlush.xhtml">OpenGL SDK Reference</a></p>
	 * 
Causes all previously issued GL commands to complete in finite time (although such commands may still be executing when {@code Flush} returns).
	 */
	public static void glFlush() {
		long __functionAddress = getInstance().Flush;
		nglFlush(__functionAddress);
	}

	// --- [ glFogi ] ---

	/** JNI method for {@link #glFogi Fogi} */
	@JavadocExclude
	public static native void nglFogi(int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogi.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the integer value of a fog parameter.
	 *
	 * @param pname the fog parameter. One of:<br>{@link #GL_FOG_MODE FOG_MODE}, {@link GL15#GL_FOG_COORD_SRC FOG_COORD_SRC}
	 * @param param the fog parameter value. One of:<br>{@link #GL_EXP EXP}, {@link #GL_EXP2 EXP2}, {@link #GL_LINEAR LINEAR}, {@link GL14#GL_FRAGMENT_DEPTH FRAGMENT_DEPTH}, {@link GL15#GL_FOG_COORD FOG_COORD}
	 */
	public static void glFogi(int pname, int param) {
		long __functionAddress = getInstance().Fogi;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFogi(pname, param, __functionAddress);
	}

	// --- [ glFogiv ] ---

	/** JNI method for {@link #glFogiv Fogiv} */
	@JavadocExclude
	public static native void nglFogiv(int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glFogiv Fogiv} */
	@JavadocExclude
	public static void nglFogiv(int pname, long params) {
		long __functionAddress = getInstance().Fogiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFogiv(pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFog.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glFogi Fogi}.
	 *
	 * @param pname  the fog parameter. One of:<br>{@link #GL_FOG_MODE FOG_MODE}, {@link GL15#GL_FOG_COORD_SRC FOG_COORD_SRC}
	 * @param params the fog parameter buffer
	 */
	public static void glFogiv(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglFogiv(pname, memAddress(params));
	}

	/** Alternative version of: {@link #glFogiv Fogiv} */
	public static void glFogiv(int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglFogiv(pname, memAddress(params));
	}

	// --- [ glFogf ] ---

	/** JNI method for {@link #glFogf Fogf} */
	@JavadocExclude
	public static native void nglFogf(int pname, float param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogf.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the float value of a fog parameter.
	 *
	 * @param pname the fog parameter. One of:<br>{@link #GL_FOG_DENSITY FOG_DENSITY}, {@link #GL_FOG_START FOG_START}, {@link #GL_FOG_END FOG_END}
	 * @param param the fog parameter value
	 */
	public static void glFogf(int pname, float param) {
		long __functionAddress = getInstance().Fogf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFogf(pname, param, __functionAddress);
	}

	// --- [ glFogfv ] ---

	/** JNI method for {@link #glFogfv Fogfv} */
	@JavadocExclude
	public static native void nglFogfv(int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glFogfv Fogfv} */
	@JavadocExclude
	public static void nglFogfv(int pname, long params) {
		long __functionAddress = getInstance().Fogfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFogfv(pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFog.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glFogf Fogf}.
	 *
	 * @param pname  the fog parameter. One of:<br>{@link #GL_FOG_DENSITY FOG_DENSITY}, {@link #GL_FOG_START FOG_START}, {@link #GL_FOG_END FOG_END}
	 * @param params the fog parameter buffer
	 */
	public static void glFogfv(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglFogfv(pname, memAddress(params));
	}

	/** Alternative version of: {@link #glFogfv Fogfv} */
	public static void glFogfv(int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglFogfv(pname, memAddress(params));
	}

	// --- [ glFrontFace ] ---

	/** JNI method for {@link #glFrontFace FrontFace} */
	@JavadocExclude
	public static native void nglFrontFace(int dir, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glFrontFace.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * The first step of polygon rasterization is to determine if the polygon is back-facing or front-facing. This determination is made based on the sign of
	 * the (clipped or unclipped) polygon's area computed in window coordinates. The interpretation of the sign of this value is controlled with this function.
	 * In the initial state, the front face direction is set to {@link #GL_CCW CCW}.
	 *
	 * @param dir the front face direction. One of:<br>{@link #GL_CCW CCW}, {@link #GL_CW CW}
	 */
	public static void glFrontFace(int dir) {
		long __functionAddress = getInstance().FrontFace;
		nglFrontFace(dir, __functionAddress);
	}

	// --- [ glGenLists ] ---

	/** JNI method for {@link #glGenLists GenLists} */
	@JavadocExclude
	public static native int nglGenLists(int s, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGenLists.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns an integer n such that the indices {@code n,..., n + s - 1} are previously unused (i.e. there are {@code s} previously unused display list
	 * indices starting at n). {@code GenLists} also has the effect of creating an empty display list for each of the indices {@code n,..., n + s - 1}, so
	 * that these indices all become used. {@code GenLists} returns zero if there is no group of {@code s} contiguous previously unused display list indices,
	 * or if {@code s = 0}.
	 *
	 * @param s the number of display lists to create
	 */
	public static int glGenLists(int s) {
		long __functionAddress = getInstance().GenLists;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGenLists(s, __functionAddress);
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenTextures.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns n previously unused texture names in textures. These names are marked as used, for the purposes of GenTextures only, but they acquire texture
	 * state and a dimensionality only when they are first bound, just as if they were unused.
	 *
	 * @param n        the number of textures to create
	 * @param textures a scalar or buffer in which to place the returned texture names
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteTextures.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes texture objects. After a texture object is deleted, it has no contents or dimensionality, and its name is again unused. If a texture that is
	 * currently bound to any of the target bindings of {@link #glBindTexture BindTexture} is deleted, it is as though {@link #glBindTexture BindTexture} had been executed with the
	 * same target and texture zero. Additionally, special care must be taken when deleting a texture if any of the images of the texture are attached to a
	 * framebuffer object.
	 * 
	 * <p>Unused names in textures that have been marked as used for the purposes of {@link #glGenTextures GenTextures} are marked as unused again. Unused names in textures are
	 * silently ignored, as is the name zero.</p>
	 *
	 * @param n        the number of texture names in the {@code textures} parameter
	 * @param textures contains {@code n} names of texture objects to be deleted
	 */
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

	// --- [ glGetClipPlane ] ---

	/** JNI method for {@link #glGetClipPlane GetClipPlane} */
	@JavadocExclude
	public static native void nglGetClipPlane(int plane, long equation, long __functionAddress);

	/** Unsafe version of {@link #glGetClipPlane GetClipPlane} */
	@JavadocExclude
	public static void nglGetClipPlane(int plane, long equation) {
		long __functionAddress = getInstance().GetClipPlane;
		nglGetClipPlane(plane, equation, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetClipPlane.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns four double-precision values in {@code equation}; these are the coefficients of the plane equation of plane in eye coordinates (these
	 * coordinates are those that were computed when the plane was specified).
	 *
	 * @param plane    the clip plane
	 * @param equation a buffer in which to place the returned values
	 */
	public static void glGetClipPlane(int plane, ByteBuffer equation) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(equation, 4 << 3);
		nglGetClipPlane(plane, memAddress(equation));
	}

	/** Alternative version of: {@link #glGetClipPlane GetClipPlane} */
	public static void glGetClipPlane(int plane, DoubleBuffer equation) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(equation, 4);
		nglGetClipPlane(plane, memAddress(equation));
	}

	// --- [ glGetBooleanv ] ---

	/** JNI method for {@link #glGetBooleanv GetBooleanv} */
	@JavadocExclude
	public static native void nglGetBooleanv(int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetBooleanv GetBooleanv} */
	@JavadocExclude
	public static void nglGetBooleanv(int pname, long params) {
		long __functionAddress = getInstance().GetBooleanv;
		nglGetBooleanv(pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the current boolean value of the specified state variable.
	 * 
	 * <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
	 * LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
	 * OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>
	 *
	 * @param pname  the state variable
	 * @param params a scalar or buffer in which to place the returned data
	 */
	public static void glGetBooleanv(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetBooleanv(pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetBooleanv GetBooleanv} */
	public static boolean glGetBoolean(int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.booleanParam();
		nglGetBooleanv(pname, __buffer.address(params));
		return __buffer.booleanValue(params);
	}

	// --- [ glGetFloatv ] ---

	/** JNI method for {@link #glGetFloatv GetFloatv} */
	@JavadocExclude
	public static native void nglGetFloatv(int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetFloatv GetFloatv} */
	@JavadocExclude
	public static void nglGetFloatv(int pname, long params) {
		long __functionAddress = getInstance().GetFloatv;
		nglGetFloatv(pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the current float value of the specified state variable.
	 * 
	 * <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
	 * LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
	 * OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>
	 *
	 * @param pname  the state variable
	 * @param params a scalar or buffer in which to place the returned data
	 */
	public static void glGetFloatv(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetFloatv(pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetFloatv GetFloatv} */
	public static void glGetFloatv(int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetFloatv(pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetFloatv GetFloatv} */
	public static float glGetFloat(int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetFloatv(pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetIntegerv ] ---

	/** JNI method for {@link #glGetIntegerv GetIntegerv} */
	@JavadocExclude
	public static native void nglGetIntegerv(int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetIntegerv GetIntegerv} */
	@JavadocExclude
	public static void nglGetIntegerv(int pname, long params) {
		long __functionAddress = getInstance().GetIntegerv;
		nglGetIntegerv(pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the current integer value of the specified state variable.
	 * 
	 * <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
	 * LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
	 * OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>
	 *
	 * @param pname  the state variable
	 * @param params a scalar or buffer in which to place the returned data
	 */
	public static void glGetIntegerv(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetIntegerv(pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetIntegerv GetIntegerv} */
	public static void glGetIntegerv(int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetIntegerv(pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetIntegerv GetIntegerv} */
	public static int glGetInteger(int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetIntegerv(pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetDoublev ] ---

	/** JNI method for {@link #glGetDoublev GetDoublev} */
	@JavadocExclude
	public static native void nglGetDoublev(int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetDoublev GetDoublev} */
	@JavadocExclude
	public static void nglGetDoublev(int pname, long params) {
		long __functionAddress = getInstance().GetDoublev;
		nglGetDoublev(pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the current double value of the specified state variable.
	 * 
	 * <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
	 * LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
	 * OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>
	 *
	 * @param pname  the state variable
	 * @param params a scalar or buffer in which to place the returned data
	 */
	public static void glGetDoublev(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetDoublev(pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetDoublev GetDoublev} */
	public static void glGetDoublev(int pname, DoubleBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetDoublev(pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetDoublev GetDoublev} */
	public static double glGetDouble(int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.doubleParam();
		nglGetDoublev(pname, __buffer.address(params));
		return __buffer.doubleValue(params);
	}

	// --- [ glGetError ] ---

	/** JNI method for {@link #glGetError GetError} */
	@JavadocExclude
	public static native int nglGetError(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetError.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns error information. Each detectable error is assigned a numeric code. When an error is detected, a flag is set and the code is recorded. Further
	 * errors, if they occur, do not affect this recorded code. When {@code GetError} is called, the code is returned and the flag is cleared, so that a
	 * further error will again record its code. If a call to {@code GetError} returns {@link #GL_NO_ERROR NO_ERROR}, then there has been no detectable error since
	 * the last call to {@code GetError} (or since the GL was initialized).
	 */
	public static int glGetError() {
		long __functionAddress = getInstance().GetError;
		return nglGetError(__functionAddress);
	}

	// --- [ glGetLightiv ] ---

	/** JNI method for {@link #glGetLightiv GetLightiv} */
	@JavadocExclude
	public static native void nglGetLightiv(int light, int pname, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetLightiv GetLightiv} */
	@JavadocExclude
	public static void nglGetLightiv(int light, int pname, long data) {
		long __functionAddress = getInstance().GetLightiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetLightiv(light, pname, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetLight.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns integer information about light parameter {@code value} for {@code light} in {@code data}.
	 *
	 * @param light the light for which to return information. One of:<br>{@link #GL_LIGHT0 LIGHT0}, GL_LIGHT[1-7]
	 * @param pname the light parameter to query. One of:<br>{@link #GL_AMBIENT AMBIENT}, {@link #GL_DIFFUSE DIFFUSE}, {@link #GL_SPECULAR SPECULAR}, {@link #GL_POSITION POSITION}, {@link #GL_CONSTANT_ATTENUATION CONSTANT_ATTENUATION}, {@link #GL_LINEAR_ATTENUATION LINEAR_ATTENUATION}, {@link #GL_QUADRATIC_ATTENUATION QUADRATIC_ATTENUATION}, {@link #GL_SPOT_DIRECTION SPOT_DIRECTION}, {@link #GL_SPOT_EXPONENT SPOT_EXPONENT}, {@link #GL_SPOT_CUTOFF SPOT_CUTOFF}
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetLightiv(int light, int pname, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4 << 2);
		nglGetLightiv(light, pname, memAddress(data));
	}

	/** Alternative version of: {@link #glGetLightiv GetLightiv} */
	public static void glGetLightiv(int light, int pname, IntBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4);
		nglGetLightiv(light, pname, memAddress(data));
	}

	/** Single return value version of: {@link #glGetLightiv GetLightiv} */
	public static int glGetLighti(int light, int pname) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetLightiv(light, pname, __buffer.address(data));
		return __buffer.intValue(data);
	}

	// --- [ glGetLightfv ] ---

	/** JNI method for {@link #glGetLightfv GetLightfv} */
	@JavadocExclude
	public static native void nglGetLightfv(int light, int pname, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetLightfv GetLightfv} */
	@JavadocExclude
	public static void nglGetLightfv(int light, int pname, long data) {
		long __functionAddress = getInstance().GetLightfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetLightfv(light, pname, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetLight.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glGetLightiv GetLightiv}.
	 *
	 * @param light the light for which to return information
	 * @param pname the light parameter to query
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetLightfv(int light, int pname, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4 << 2);
		nglGetLightfv(light, pname, memAddress(data));
	}

	/** Alternative version of: {@link #glGetLightfv GetLightfv} */
	public static void glGetLightfv(int light, int pname, FloatBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4);
		nglGetLightfv(light, pname, memAddress(data));
	}

	/** Single return value version of: {@link #glGetLightfv GetLightfv} */
	public static float glGetLightf(int light, int pname) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetLightfv(light, pname, __buffer.address(data));
		return __buffer.floatValue(data);
	}

	// --- [ glGetMapiv ] ---

	/** JNI method for {@link #glGetMapiv GetMapiv} */
	@JavadocExclude
	public static native void nglGetMapiv(int target, int query, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetMapiv GetMapiv} */
	@JavadocExclude
	public static void nglGetMapiv(int target, int query, long data) {
		long __functionAddress = getInstance().GetMapiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMapiv(target, query, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetMap.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns integer information about {@code query} for evaluator map {@code target} in {@code data}.
	 *
	 * @param target the evaluator target. One of:<br>{@link #GL_MAP1_VERTEX_3 MAP1_VERTEX_3}, {@link #GL_MAP1_VERTEX_4 MAP1_VERTEX_4}, {@link #GL_MAP1_COLOR_4 MAP1_COLOR_4}, {@link #GL_MAP1_NORMAL MAP1_NORMAL}, {@link #GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}, {@link #GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}, {@link #GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}, {@link #GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}, {@link #GL_MAP2_VERTEX_3 MAP2_VERTEX_3}, {@link #GL_MAP2_VERTEX_4 MAP2_VERTEX_4}, {@link #GL_MAP2_COLOR_4 MAP2_COLOR_4}, {@link #GL_MAP2_NORMAL MAP2_NORMAL}, {@link #GL_MAP2_TEXTURE_COORD_1 MAP2_TEXTURE_COORD_1}, {@link #GL_MAP2_TEXTURE_COORD_2 MAP2_TEXTURE_COORD_2}, {@link #GL_MAP2_TEXTURE_COORD_3 MAP2_TEXTURE_COORD_3}, {@link #GL_MAP2_TEXTURE_COORD_4 MAP2_TEXTURE_COORD_4}
	 * @param query  the information to query. One of:<br>{@link #GL_ORDER ORDER}, {@link #GL_COEFF COEFF}, {@link #GL_DOMAIN DOMAIN}
	 * @param data   a scalar or buffer in which to place the returned data
	 */
	public static void glGetMapiv(int target, int query, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4 << 2);
		nglGetMapiv(target, query, memAddress(data));
	}

	/** Alternative version of: {@link #glGetMapiv GetMapiv} */
	public static void glGetMapiv(int target, int query, IntBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4);
		nglGetMapiv(target, query, memAddress(data));
	}

	/** Single return value version of: {@link #glGetMapiv GetMapiv} */
	public static int glGetMapi(int target, int query) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetMapiv(target, query, __buffer.address(data));
		return __buffer.intValue(data);
	}

	// --- [ glGetMapfv ] ---

	/** JNI method for {@link #glGetMapfv GetMapfv} */
	@JavadocExclude
	public static native void nglGetMapfv(int target, int query, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetMapfv GetMapfv} */
	@JavadocExclude
	public static void nglGetMapfv(int target, int query, long data) {
		long __functionAddress = getInstance().GetMapfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMapfv(target, query, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetMap.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glGetMapiv GetMapiv}.
	 *
	 * @param target the evaluator map
	 * @param query  the information to query
	 * @param data   a scalar or buffer in which to place the returned data
	 */
	public static void glGetMapfv(int target, int query, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4 << 2);
		nglGetMapfv(target, query, memAddress(data));
	}

	/** Alternative version of: {@link #glGetMapfv GetMapfv} */
	public static void glGetMapfv(int target, int query, FloatBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4);
		nglGetMapfv(target, query, memAddress(data));
	}

	/** Single return value version of: {@link #glGetMapfv GetMapfv} */
	public static float glGetMapf(int target, int query) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetMapfv(target, query, __buffer.address(data));
		return __buffer.floatValue(data);
	}

	// --- [ glGetMapdv ] ---

	/** JNI method for {@link #glGetMapdv GetMapdv} */
	@JavadocExclude
	public static native void nglGetMapdv(int target, int query, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetMapdv GetMapdv} */
	@JavadocExclude
	public static void nglGetMapdv(int target, int query, long data) {
		long __functionAddress = getInstance().GetMapdv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMapdv(target, query, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetMap.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glGetMapiv GetMapiv}.
	 *
	 * @param target the evaluator map
	 * @param query  the information to query
	 * @param data   a scalar or buffer in which to place the returned data
	 */
	public static void glGetMapdv(int target, int query, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4 << 3);
		nglGetMapdv(target, query, memAddress(data));
	}

	/** Alternative version of: {@link #glGetMapdv GetMapdv} */
	public static void glGetMapdv(int target, int query, DoubleBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4);
		nglGetMapdv(target, query, memAddress(data));
	}

	/** Single return value version of: {@link #glGetMapdv GetMapdv} */
	public static double glGetMapd(int target, int query) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.doubleParam();
		nglGetMapdv(target, query, __buffer.address(data));
		return __buffer.doubleValue(data);
	}

	// --- [ glGetMaterialiv ] ---

	/** JNI method for {@link #glGetMaterialiv GetMaterialiv} */
	@JavadocExclude
	public static native void nglGetMaterialiv(int face, int pname, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetMaterialiv GetMaterialiv} */
	@JavadocExclude
	public static void nglGetMaterialiv(int face, int pname, long data) {
		long __functionAddress = getInstance().GetMaterialiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMaterialiv(face, pname, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetMaterial.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns integer information about material property {@code value} for {@code face} in {@code data}.
	 *
	 * @param face  the material face for which to return information. One of:<br>{@link #GL_FRONT FRONT}, {@link #GL_BACK BACK}
	 * @param pname the information to query. One of:<br>{@link #GL_AMBIENT AMBIENT}, {@link #GL_DIFFUSE DIFFUSE}, {@link #GL_SPECULAR SPECULAR}, {@link #GL_EMISSION EMISSION}, {@link #GL_SHININESS SHININESS}
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetMaterialiv(int face, int pname, ByteBuffer data) {
		nglGetMaterialiv(face, pname, memAddress(data));
	}

	/** Alternative version of: {@link #glGetMaterialiv GetMaterialiv} */
	public static void glGetMaterialiv(int face, int pname, IntBuffer data) {
		nglGetMaterialiv(face, pname, memAddress(data));
	}

	// --- [ glGetMaterialfv ] ---

	/** JNI method for {@link #glGetMaterialfv GetMaterialfv} */
	@JavadocExclude
	public static native void nglGetMaterialfv(int face, int pname, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetMaterialfv GetMaterialfv} */
	@JavadocExclude
	public static void nglGetMaterialfv(int face, int pname, long data) {
		long __functionAddress = getInstance().GetMaterialfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMaterialfv(face, pname, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetMaterial.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glGetMaterialiv GetMaterialiv}.
	 *
	 * @param face  the material face for which to return information
	 * @param pname the information to query
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetMaterialfv(int face, int pname, ByteBuffer data) {
		nglGetMaterialfv(face, pname, memAddress(data));
	}

	/** Alternative version of: {@link #glGetMaterialfv GetMaterialfv} */
	public static void glGetMaterialfv(int face, int pname, FloatBuffer data) {
		nglGetMaterialfv(face, pname, memAddress(data));
	}

	// --- [ glGetPixelMapfv ] ---

	/** JNI method for {@link #glGetPixelMapfv GetPixelMapfv} */
	@JavadocExclude
	public static native void nglGetPixelMapfv(int map, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetPixelMapfv GetPixelMapfv} */
	@JavadocExclude
	public static void nglGetPixelMapfv(int map, long data) {
		long __functionAddress = getInstance().GetPixelMapfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetPixelMapfv(map, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetPixelMap.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns all float values in the pixel map {@code map} in {@code data}.
	 *
	 * @param map  the pixel map parameter to query. One of:<br>{@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}, {@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}, {@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}, {@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}, {@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}, {@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}, {@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}, {@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}, {@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}, {@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}
	 * @param data a buffer in which to place the returned data
	 */
	public static void glGetPixelMapfv(int map, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, 32 << 2);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetPixelMapfv(map, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glGetPixelMapfv GetPixelMapfv} */
	public static void glGetPixelMapfv(int map, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetPixelMapfv(map, dataOffset);
	}

	/** Alternative version of: {@link #glGetPixelMapfv GetPixelMapfv} */
	public static void glGetPixelMapfv(int map, FloatBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, 32);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetPixelMapfv(map, memAddress(data));
	}

	// --- [ glGetPixelMapusv ] ---

	/** JNI method for {@link #glGetPixelMapusv GetPixelMapusv} */
	@JavadocExclude
	public static native void nglGetPixelMapusv(int map, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetPixelMapusv GetPixelMapusv} */
	@JavadocExclude
	public static void nglGetPixelMapusv(int map, long data) {
		long __functionAddress = getInstance().GetPixelMapusv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetPixelMapusv(map, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetPixelMap.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned short version of {@link #glGetPixelMapfv GetPixelMapfv}.
	 *
	 * @param map  the pixel map parameter to query
	 * @param data a buffer in which to place the returned data
	 */
	public static void glGetPixelMapusv(int map, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, 32 << 1);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetPixelMapusv(map, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glGetPixelMapusv GetPixelMapusv} */
	public static void glGetPixelMapusv(int map, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetPixelMapusv(map, dataOffset);
	}

	/** Alternative version of: {@link #glGetPixelMapusv GetPixelMapusv} */
	public static void glGetPixelMapusv(int map, ShortBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, 32);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetPixelMapusv(map, memAddress(data));
	}

	// --- [ glGetPixelMapuiv ] ---

	/** JNI method for {@link #glGetPixelMapuiv GetPixelMapuiv} */
	@JavadocExclude
	public static native void nglGetPixelMapuiv(int map, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetPixelMapuiv GetPixelMapuiv} */
	@JavadocExclude
	public static void nglGetPixelMapuiv(int map, long data) {
		long __functionAddress = getInstance().GetPixelMapuiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetPixelMapuiv(map, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetPixelMap.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned integer version of {@link #glGetPixelMapfv GetPixelMapfv}.
	 *
	 * @param map  the pixel map parameter to query
	 * @param data a buffer in which to place the returned data
	 */
	public static void glGetPixelMapuiv(int map, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, 32 << 2);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetPixelMapuiv(map, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glGetPixelMapuiv GetPixelMapuiv} */
	public static void glGetPixelMapuiv(int map, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetPixelMapuiv(map, dataOffset);
	}

	/** Alternative version of: {@link #glGetPixelMapuiv GetPixelMapuiv} */
	public static void glGetPixelMapuiv(int map, IntBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, 32);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetPixelMapuiv(map, memAddress(data));
	}

	// --- [ glGetPointerv ] ---

	/** JNI method for {@link #glGetPointerv GetPointerv} */
	@JavadocExclude
	public static native void nglGetPointerv(int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetPointerv GetPointerv} */
	@JavadocExclude
	public static void nglGetPointerv(int pname, long params) {
		long __functionAddress = getInstance().GetPointerv;
		nglGetPointerv(pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetPointer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns a pointer in the current GL context.
	 *
	 * @param pname  the pointer to return. One of:<br>{@link #GL_FEEDBACK_BUFFER_POINTER FEEDBACK_BUFFER_POINTER}, {@link #GL_SELECTION_BUFFER_POINTER SELECTION_BUFFER_POINTER}, {@link #GL_VERTEX_ARRAY_POINTER VERTEX_ARRAY_POINTER}, {@link #GL_NORMAL_ARRAY_POINTER NORMAL_ARRAY_POINTER}, {@link #GL_COLOR_ARRAY_POINTER COLOR_ARRAY_POINTER}, {@link #GL_INDEX_ARRAY_POINTER INDEX_ARRAY_POINTER}, {@link #GL_TEXTURE_COORD_ARRAY_POINTER TEXTURE_COORD_ARRAY_POINTER}, {@link #GL_EDGE_FLAG_ARRAY_POINTER EDGE_FLAG_ARRAY_POINTER}, {@link GL14#GL_SECONDARY_COLOR_ARRAY_POINTER SECONDARY_COLOR_ARRAY_POINTER}, {@link GL15#GL_FOG_COORD_ARRAY_POINTER FOG_COORD_ARRAY_POINTER}, {@link GL43#GL_DEBUG_CALLBACK_FUNCTION DEBUG_CALLBACK_FUNCTION}, {@link GL43#GL_DEBUG_CALLBACK_USER_PARAM DEBUG_CALLBACK_USER_PARAM}
	 * @param params a buffer in which to place the returned pointer
	 */
	public static void glGetPointerv(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << POINTER_SHIFT);
		nglGetPointerv(pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetPointerv GetPointerv} */
	public static void glGetPointerv(int pname, PointerBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetPointerv(pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetPointerv GetPointerv} */
	public static long glGetPointer(int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.pointerParam();
		nglGetPointerv(pname, __buffer.address(params));
		return __buffer.pointerValue(params);
	}

	// --- [ glGetPolygonStipple ] ---

	/** JNI method for {@link #glGetPolygonStipple GetPolygonStipple} */
	@JavadocExclude
	public static native void nglGetPolygonStipple(long pattern, long __functionAddress);

	/** Unsafe version of {@link #glGetPolygonStipple GetPolygonStipple} */
	@JavadocExclude
	public static void nglGetPolygonStipple(long pattern) {
		long __functionAddress = getInstance().GetPolygonStipple;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetPolygonStipple(pattern, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetPolygonStipple.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Obtains the polygon stipple.
	 *
	 * @param pattern a buffer in which to place the returned data
	 */
	public static void glGetPolygonStipple(ByteBuffer pattern) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pattern, 128);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetPolygonStipple(memAddress(pattern));
	}

	/** Buffer object offset version of: {@link #glGetPolygonStipple GetPolygonStipple} */
	public static void glGetPolygonStipple(long patternOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetPolygonStipple(patternOffset);
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

	/**
	 * Return strings describing properties of the current GL context.
	 *
	 * @param name the property to query. One of:<br>{@link #GL_RENDERER RENDERER}, {@link #GL_VENDOR VENDOR}, {@link #GL_EXTENSIONS EXTENSIONS}, {@link #GL_VERSION VERSION}, {@link GL20#GL_SHADING_LANGUAGE_VERSION SHADING_LANGUAGE_VERSION}
	 */
	public static String glGetString(int name) {
		long __result = nglGetString(name);
		return memDecodeUTF8(__result);
	}

	// --- [ glGetTexEnviv ] ---

	/** JNI method for {@link #glGetTexEnviv GetTexEnviv} */
	@JavadocExclude
	public static native void nglGetTexEnviv(int env, int pname, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetTexEnviv GetTexEnviv} */
	@JavadocExclude
	public static void nglGetTexEnviv(int env, int pname, long data) {
		long __functionAddress = getInstance().GetTexEnviv;
		nglGetTexEnviv(env, pname, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTexEnv.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns integer information about {@code value} for {@code env} in {@code data}.
	 *
	 * @param env   the texture environment to query. One of:<br>{@link GL20#GL_POINT_SPRITE POINT_SPRITE}, {@link #GL_TEXTURE_ENV TEXTURE_ENV}, {@link GL14#GL_TEXTURE_FILTER_CONTROL TEXTURE_FILTER_CONTROL}
	 * @param pname the parameter to query. One of:<br>{@link GL20#GL_COORD_REPLACE COORD_REPLACE}, {@link #GL_TEXTURE_ENV_MODE TEXTURE_ENV_MODE}, {@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}, {@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}, {@link GL13#GL_COMBINE_RGB COMBINE_RGB}, {@link GL13#GL_COMBINE_ALPHA COMBINE_ALPHA}, {@link GL15#GL_SRC0_RGB SRC0_RGB}, {@link GL15#GL_SRC1_RGB SRC1_RGB}, {@link GL15#GL_SRC2_RGB SRC2_RGB}, {@link GL15#GL_SRC0_ALPHA SRC0_ALPHA}, {@link GL15#GL_SRC1_ALPHA SRC1_ALPHA}, {@link GL15#GL_SRC2_ALPHA SRC2_ALPHA}, {@link GL13#GL_OPERAND0_RGB OPERAND0_RGB}, {@link GL13#GL_OPERAND1_RGB OPERAND1_RGB}, {@link GL13#GL_OPERAND2_RGB OPERAND2_RGB}, {@link GL13#GL_OPERAND0_ALPHA OPERAND0_ALPHA}, {@link GL13#GL_OPERAND1_ALPHA OPERAND1_ALPHA}, {@link GL13#GL_OPERAND2_ALPHA OPERAND2_ALPHA}, {@link GL13#GL_RGB_SCALE RGB_SCALE}, {@link #GL_ALPHA_SCALE ALPHA_SCALE}
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexEnviv(int env, int pname, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1 << 2);
		nglGetTexEnviv(env, pname, memAddress(data));
	}

	/** Alternative version of: {@link #glGetTexEnviv GetTexEnviv} */
	public static void glGetTexEnviv(int env, int pname, IntBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetTexEnviv(env, pname, memAddress(data));
	}

	/** Single return value version of: {@link #glGetTexEnviv GetTexEnviv} */
	public static int glGetTexEnvi(int env, int pname) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetTexEnviv(env, pname, __buffer.address(data));
		return __buffer.intValue(data);
	}

	// --- [ glGetTexEnvfv ] ---

	/** JNI method for {@link #glGetTexEnvfv GetTexEnvfv} */
	@JavadocExclude
	public static native void nglGetTexEnvfv(int env, int pname, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetTexEnvfv GetTexEnvfv} */
	@JavadocExclude
	public static void nglGetTexEnvfv(int env, int pname, long data) {
		long __functionAddress = getInstance().GetTexEnvfv;
		nglGetTexEnvfv(env, pname, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTexEnv.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Float version of {@link #glGetTexEnviv GetTexEnviv}.
	 *
	 * @param env   the texture environment to query
	 * @param pname the parameter to query
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexEnvfv(int env, int pname, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1 << 2);
		nglGetTexEnvfv(env, pname, memAddress(data));
	}

	/** Alternative version of: {@link #glGetTexEnvfv GetTexEnvfv} */
	public static void glGetTexEnvfv(int env, int pname, FloatBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetTexEnvfv(env, pname, memAddress(data));
	}

	/** Single return value version of: {@link #glGetTexEnvfv GetTexEnvfv} */
	public static float glGetTexEnvf(int env, int pname) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetTexEnvfv(env, pname, __buffer.address(data));
		return __buffer.floatValue(data);
	}

	// --- [ glGetTexGeniv ] ---

	/** JNI method for {@link #glGetTexGeniv GetTexGeniv} */
	@JavadocExclude
	public static native void nglGetTexGeniv(int coord, int pname, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetTexGeniv GetTexGeniv} */
	@JavadocExclude
	public static void nglGetTexGeniv(int coord, int pname, long data) {
		long __functionAddress = getInstance().GetTexGeniv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetTexGeniv(coord, pname, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetTexGen.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns integer information about {@code value} for {@code coord} in {@code data}.
	 *
	 * @param coord the coord to query. One of:<br>{@link #GL_S S}, {@link #GL_T T}, {@link #GL_R R}, {@link #GL_Q Q}
	 * @param pname the parameter to query. One of:<br>{@link #GL_EYE_PLANE EYE_PLANE}, {@link #GL_OBJECT_PLANE OBJECT_PLANE}, {@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE}
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexGeniv(int coord, int pname, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1 << 2);
		nglGetTexGeniv(coord, pname, memAddress(data));
	}

	/** Alternative version of: {@link #glGetTexGeniv GetTexGeniv} */
	public static void glGetTexGeniv(int coord, int pname, IntBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetTexGeniv(coord, pname, memAddress(data));
	}

	/** Single return value version of: {@link #glGetTexGeniv GetTexGeniv} */
	public static int glGetTexGeni(int coord, int pname) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetTexGeniv(coord, pname, __buffer.address(data));
		return __buffer.intValue(data);
	}

	// --- [ glGetTexGenfv ] ---

	/** JNI method for {@link #glGetTexGenfv GetTexGenfv} */
	@JavadocExclude
	public static native void nglGetTexGenfv(int coord, int pname, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetTexGenfv GetTexGenfv} */
	@JavadocExclude
	public static void nglGetTexGenfv(int coord, int pname, long data) {
		long __functionAddress = getInstance().GetTexGenfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetTexGenfv(coord, pname, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetTexGen.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glGetTexGeniv GetTexGeniv}.
	 *
	 * @param coord the coord to query
	 * @param pname the parameter to query
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexGenfv(int coord, int pname, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4 << 2);
		nglGetTexGenfv(coord, pname, memAddress(data));
	}

	/** Alternative version of: {@link #glGetTexGenfv GetTexGenfv} */
	public static void glGetTexGenfv(int coord, int pname, FloatBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4);
		nglGetTexGenfv(coord, pname, memAddress(data));
	}

	/** Single return value version of: {@link #glGetTexGenfv GetTexGenfv} */
	public static float glGetTexGenf(int coord, int pname) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetTexGenfv(coord, pname, __buffer.address(data));
		return __buffer.floatValue(data);
	}

	// --- [ glGetTexGendv ] ---

	/** JNI method for {@link #glGetTexGendv GetTexGendv} */
	@JavadocExclude
	public static native void nglGetTexGendv(int coord, int pname, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetTexGendv GetTexGendv} */
	@JavadocExclude
	public static void nglGetTexGendv(int coord, int pname, long data) {
		long __functionAddress = getInstance().GetTexGendv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetTexGendv(coord, pname, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glGetTexGen.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glGetTexGeniv GetTexGeniv}.
	 *
	 * @param coord the coord to query
	 * @param pname the parameter to query
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexGendv(int coord, int pname, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4 << 3);
		nglGetTexGendv(coord, pname, memAddress(data));
	}

	/** Alternative version of: {@link #glGetTexGendv GetTexGendv} */
	public static void glGetTexGendv(int coord, int pname, DoubleBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 4);
		nglGetTexGendv(coord, pname, memAddress(data));
	}

	/** Single return value version of: {@link #glGetTexGendv GetTexGendv} */
	public static double glGetTexGend(int coord, int pname) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.doubleParam();
		nglGetTexGendv(coord, pname, __buffer.address(data));
		return __buffer.doubleValue(data);
	}

	// --- [ glGetTexImage ] ---

	/** JNI method for {@link #glGetTexImage GetTexImage} */
	@JavadocExclude
	public static native void nglGetTexImage(int tex, int level, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glGetTexImage GetTexImage} */
	@JavadocExclude
	public static void nglGetTexImage(int tex, int level, int format, int type, long pixels) {
		long __functionAddress = getInstance().GetTexImage;
		nglGetTexImage(tex, level, format, type, pixels, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Obtains texture images.
	 *
	 * @param tex    the texture (or texture face) to be obtained. One of:<br>{@link #GL_TEXTURE_1D TEXTURE_1D}, {@link #GL_TEXTURE_2D TEXTURE_2D}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}
	 * @param level  the level-of-detail number
	 * @param format the pixel format. One of:<br>{@link #GL_STENCIL_INDEX STENCIL_INDEX}, {@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link #GL_RED RED}, {@link #GL_GREEN GREEN}, {@link #GL_BLUE BLUE}, {@link #GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link #GL_RGB RGB}, {@link #GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link #GL_LUMINANCE LUMINANCE}, {@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type   the pixel type. One of:<br>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_BYTE BYTE}, {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_SHORT SHORT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}, {@link #GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link #GL_BITMAP BITMAP}
	 * @param pixels the buffer in which to place the returned data
	 */
	public static void glGetTexImage(int tex, int level, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTexImage(tex, level, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glGetTexImage GetTexImage} */
	public static void glGetTexImage(int tex, int level, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetTexImage(tex, level, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glGetTexImage GetTexImage} */
	public static void glGetTexImage(int tex, int level, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTexImage(tex, level, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glGetTexImage GetTexImage} */
	public static void glGetTexImage(int tex, int level, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTexImage(tex, level, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glGetTexImage GetTexImage} */
	public static void glGetTexImage(int tex, int level, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTexImage(tex, level, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glGetTexImage GetTexImage} */
	public static void glGetTexImage(int tex, int level, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTexImage(tex, level, format, type, memAddress(pixels));
	}

	// --- [ glGetTexLevelParameteriv ] ---

	/** JNI method for {@link #glGetTexLevelParameteriv GetTexLevelParameteriv} */
	@JavadocExclude
	public static native void nglGetTexLevelParameteriv(int target, int level, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTexLevelParameteriv GetTexLevelParameteriv} */
	@JavadocExclude
	public static void nglGetTexLevelParameteriv(int target, int level, int pname, long params) {
		long __functionAddress = getInstance().GetTexLevelParameteriv;
		nglGetTexLevelParameteriv(target, level, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTexLevelParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Places integer information about texture image parameter {@code value} for level-of-detail {@code lod} of the specified {@code target} into {@code data}.
	 *
	 * @param target the texture image target. One of:<br>{@link #GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link #GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}, {@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}, {@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}, {@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}, {@link #GL_TEXTURE_1D TEXTURE_1D}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}, {@link #GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}, {@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}, {@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}, {@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}, {@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param level  the level-of-detail number
	 * @param pname  the parameter to query. One of:<br>{@link #GL_TEXTURE_WIDTH TEXTURE_WIDTH}, {@link #GL_TEXTURE_HEIGHT TEXTURE_HEIGHT}, {@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH}, {@link #GL_TEXTURE_BORDER TEXTURE_BORDER}, {@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES}, {@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS TEXTURE_FIXED_SAMPLE_LOCATIONS}, {@link #GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT}, {@link #GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE}, {@link #GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE}, {@link #GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE}, {@link #GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE}, {@link #GL_TEXTURE_LUMINANCE_SIZE TEXTURE_LUMINANCE_SIZE}, {@link #GL_TEXTURE_INTENSITY_SIZE TEXTURE_INTENSITY_SIZE}, {@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE}, {@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE}, {@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE}, {@link GL30#GL_TEXTURE_RED_TYPE TEXTURE_RED_TYPE}, {@link GL30#GL_TEXTURE_GREEN_TYPE TEXTURE_GREEN_TYPE}, {@link GL30#GL_TEXTURE_BLUE_TYPE TEXTURE_BLUE_TYPE}, {@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE}, {@link GL30#GL_TEXTURE_LUMINANCE_TYPE TEXTURE_LUMINANCE_TYPE}, {@link GL30#GL_TEXTURE_INTENSITY_TYPE TEXTURE_INTENSITY_TYPE}, {@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE}, {@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED}, {@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE TEXTURE_COMPRESSED_IMAGE_SIZE}, {@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING TEXTURE_BUFFER_DATA_STORE_BINDING}, {@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET}, {@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}
	 * @param params a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexLevelParameteriv(int target, int level, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexLevelParameteriv GetTexLevelParameteriv} */
	public static void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexLevelParameteriv GetTexLevelParameteriv} */
	public static int glGetTexLevelParameteri(int target, int level, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTexLevelParameteriv(target, level, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetTexLevelParameterfv ] ---

	/** JNI method for {@link #glGetTexLevelParameterfv GetTexLevelParameterfv} */
	@JavadocExclude
	public static native void nglGetTexLevelParameterfv(int target, int level, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTexLevelParameterfv GetTexLevelParameterfv} */
	@JavadocExclude
	public static void nglGetTexLevelParameterfv(int target, int level, int pname, long params) {
		long __functionAddress = getInstance().GetTexLevelParameterfv;
		nglGetTexLevelParameterfv(target, level, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTexLevelParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Float version of {@link #glGetTexLevelParameteriv GetTexLevelParameteriv}.
	 *
	 * @param target the texture image target
	 * @param level  the level-of-detail number
	 * @param pname  the parameter to query
	 * @param params a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexLevelParameterfv(int target, int level, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexLevelParameterfv GetTexLevelParameterfv} */
	public static void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexLevelParameterfv GetTexLevelParameterfv} */
	public static float glGetTexLevelParameterf(int target, int level, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetTexLevelParameterfv(target, level, pname, __buffer.address(params));
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTexParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Place integer information about texture parameter {@code value} for the specified {@code target} into {@code data}.
	 *
	 * @param target the texture target. One of:<br>{@link #GL_TEXTURE_1D TEXTURE_1D}, {@link #GL_TEXTURE_2D TEXTURE_2D}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param pname  the parameter to query. One of:<br>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}, {@link #GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}, {@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}, {@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}, {@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}, {@link #GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}, {@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}, {@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}, {@link #GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}, {@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}, {@link #GL_TEXTURE_PRIORITY TEXTURE_PRIORITY}, {@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}, {@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}, {@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}, {@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}, {@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}, {@link #GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}, {@link #GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}, {@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}, {@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}, {@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}, {@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE IMAGE_FORMAT_COMPATIBILITY_TYPE}, {@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT TEXTURE_IMMUTABLE_FORMAT}, {@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS TEXTURE_IMMUTABLE_LEVELS}, {@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL}, {@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS TEXTURE_VIEW_NUM_LEVELS}, {@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER}, {@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS TEXTURE_VIEW_NUM_LAYERS}, {@link #GL_TEXTURE_RESIDENT TEXTURE_RESIDENT}
	 * @param params a scalar or buffer in which to place the returned data
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTexParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Float version of {@link #glGetTexParameteriv GetTexParameteriv}.
	 *
	 * @param target the texture target
	 * @param pname  the parameter to query
	 * @param params a scalar or buffer in which to place the returned data
	 */
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

	// --- [ glHint ] ---

	/** JNI method for {@link #glHint Hint} */
	@JavadocExclude
	public static native void nglHint(int target, int hint, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glHint.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Certain aspects of GL behavior, when there is room for variation, may be controlled with this function. The initial value for all hints is
	 * {@link #GL_DONT_CARE DONT_CARE}.
	 *
	 * @param target the behavior to control. One of:<br>{@link #GL_PERSPECTIVE_CORRECTION_HINT PERSPECTIVE_CORRECTION_HINT}, {@link #GL_POINT_SMOOTH_HINT POINT_SMOOTH_HINT}, {@link #GL_LINE_SMOOTH_HINT LINE_SMOOTH_HINT}, {@link #GL_POLYGON_SMOOTH_HINT POLYGON_SMOOTH_HINT}, {@link #GL_FOG_HINT FOG_HINT}, {@link GL14#GL_GENERATE_MIPMAP_HINT GENERATE_MIPMAP_HINT}, {@link GL13#GL_TEXTURE_COMPRESSION_HINT TEXTURE_COMPRESSION_HINT}, {@link GL20#GL_FRAGMENT_SHADER_DERIVATIVE_HINT FRAGMENT_SHADER_DERIVATIVE_HINT}
	 * @param hint   the behavior hint. One of:<br>{@link #GL_FASTEST FASTEST}, {@link #GL_NICEST NICEST}, {@link #GL_DONT_CARE DONT_CARE}
	 */
	public static void glHint(int target, int hint) {
		long __functionAddress = getInstance().Hint;
		nglHint(target, hint, __functionAddress);
	}

	// --- [ glIndexi ] ---

	/** JNI method for {@link #glIndexi Indexi} */
	@JavadocExclude
	public static native void nglIndexi(int index, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glIndexi.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Updates the current (single-valued) color index.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexi(int index) {
		long __functionAddress = getInstance().Indexi;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglIndexi(index, __functionAddress);
	}

	// --- [ glIndexub ] ---

	/** JNI method for {@link #glIndexub Indexub} */
	@JavadocExclude
	public static native void nglIndexub(byte index, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glIndexub.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned byte version of {@link #glIndexi Indexi}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexub(byte index) {
		long __functionAddress = getInstance().Indexub;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglIndexub(index, __functionAddress);
	}

	// --- [ glIndexs ] ---

	/** JNI method for {@link #glIndexs Indexs} */
	@JavadocExclude
	public static native void nglIndexs(short index, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glIndexs.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glIndexi Indexi}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexs(short index) {
		long __functionAddress = getInstance().Indexs;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglIndexs(index, __functionAddress);
	}

	// --- [ glIndexf ] ---

	/** JNI method for {@link #glIndexf Indexf} */
	@JavadocExclude
	public static native void nglIndexf(float index, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glIndexf.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glIndexi Indexi}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexf(float index) {
		long __functionAddress = getInstance().Indexf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglIndexf(index, __functionAddress);
	}

	// --- [ glIndexd ] ---

	/** JNI method for {@link #glIndexd Indexd} */
	@JavadocExclude
	public static native void nglIndexd(double index, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glIndexd.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glIndexi Indexi}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexd(double index) {
		long __functionAddress = getInstance().Indexd;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglIndexd(index, __functionAddress);
	}

	// --- [ glIndexiv ] ---

	/** JNI method for {@link #glIndexiv Indexiv} */
	@JavadocExclude
	public static native void nglIndexiv(long index, long __functionAddress);

	/** Unsafe version of {@link #glIndexiv Indexiv} */
	@JavadocExclude
	public static void nglIndexiv(long index) {
		long __functionAddress = getInstance().Indexiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglIndexiv(index, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glIndex.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glIndexi Indexi}
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexiv(ByteBuffer index) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(index, 1 << 2);
		nglIndexiv(memAddress(index));
	}

	/** Alternative version of: {@link #glIndexiv Indexiv} */
	public static void glIndexiv(IntBuffer index) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(index, 1);
		nglIndexiv(memAddress(index));
	}

	// --- [ glIndexubv ] ---

	/** JNI method for {@link #glIndexubv Indexubv} */
	@JavadocExclude
	public static native void nglIndexubv(long index, long __functionAddress);

	/** Unsafe version of {@link #glIndexubv Indexubv} */
	@JavadocExclude
	public static void nglIndexubv(long index) {
		long __functionAddress = getInstance().Indexubv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglIndexubv(index, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glIndexub.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glIndexub Indexub}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexubv(ByteBuffer index) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(index, 1);
		nglIndexubv(memAddress(index));
	}

	// --- [ glIndexsv ] ---

	/** JNI method for {@link #glIndexsv Indexsv} */
	@JavadocExclude
	public static native void nglIndexsv(long index, long __functionAddress);

	/** Unsafe version of {@link #glIndexsv Indexsv} */
	@JavadocExclude
	public static void nglIndexsv(long index) {
		long __functionAddress = getInstance().Indexsv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglIndexsv(index, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glIndex.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glIndexs Indexs}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexsv(ByteBuffer index) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(index, 1 << 1);
		nglIndexsv(memAddress(index));
	}

	/** Alternative version of: {@link #glIndexsv Indexsv} */
	public static void glIndexsv(ShortBuffer index) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(index, 1);
		nglIndexsv(memAddress(index));
	}

	// --- [ glIndexfv ] ---

	/** JNI method for {@link #glIndexfv Indexfv} */
	@JavadocExclude
	public static native void nglIndexfv(long index, long __functionAddress);

	/** Unsafe version of {@link #glIndexfv Indexfv} */
	@JavadocExclude
	public static void nglIndexfv(long index) {
		long __functionAddress = getInstance().Indexfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglIndexfv(index, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glIndex.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glIndexf Indexf}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexfv(ByteBuffer index) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(index, 1 << 2);
		nglIndexfv(memAddress(index));
	}

	/** Alternative version of: {@link #glIndexfv Indexfv} */
	public static void glIndexfv(FloatBuffer index) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(index, 1);
		nglIndexfv(memAddress(index));
	}

	// --- [ glIndexdv ] ---

	/** JNI method for {@link #glIndexdv Indexdv} */
	@JavadocExclude
	public static native void nglIndexdv(long index, long __functionAddress);

	/** Unsafe version of {@link #glIndexdv Indexdv} */
	@JavadocExclude
	public static void nglIndexdv(long index) {
		long __functionAddress = getInstance().Indexdv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglIndexdv(index, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glIndex.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glIndexd Indexd}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexdv(ByteBuffer index) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(index, 1 << 3);
		nglIndexdv(memAddress(index));
	}

	/** Alternative version of: {@link #glIndexdv Indexdv} */
	public static void glIndexdv(DoubleBuffer index) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(index, 1);
		nglIndexdv(memAddress(index));
	}

	// --- [ glIndexMask ] ---

	/** JNI method for {@link #glIndexMask IndexMask} */
	@JavadocExclude
	public static native void nglIndexMask(int mask, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glIndexMask.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * The least significant n bits of mask, where n is the number of bits in a color index buffer, specify a mask. Where a 1 appears in this mask, the
	 * corresponding bit in the color index buffer (or buffers) is written; where a 0 appears, the bit is not written. This mask applies only in color index
	 * mode.
	 *
	 * @param mask the color index mask value
	 */
	public static void glIndexMask(int mask) {
		long __functionAddress = getInstance().IndexMask;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglIndexMask(mask, __functionAddress);
	}

	// --- [ glIndexPointer ] ---

	/** JNI method for {@link #glIndexPointer IndexPointer} */
	@JavadocExclude
	public static native void nglIndexPointer(int type, int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glIndexPointer IndexPointer} */
	@JavadocExclude
	public static void nglIndexPointer(int type, int stride, long pointer) {
		long __functionAddress = getInstance().IndexPointer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglIndexPointer(type, stride, pointer, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glIndexPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a color index array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<br>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_SHORT SHORT}, {@link #GL_INT INT}, {@link #GL_FLOAT FLOAT}, {@link #GL_DOUBLE DOUBLE}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the color index array data
	 */
	public static void glIndexPointer(int type, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglIndexPointer(type, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glIndexPointer IndexPointer} */
	public static void glIndexPointer(int type, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglIndexPointer(type, stride, pointerOffset);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glIndexPointer IndexPointer} */
	public static void glIndexPointer(int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglIndexPointer(GL11.GL_UNSIGNED_BYTE, stride, memAddress(pointer));
	}

	/** GL_SHORT version of: {@link #glIndexPointer IndexPointer} */
	public static void glIndexPointer(int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglIndexPointer(GL11.GL_SHORT, stride, memAddress(pointer));
	}

	/** GL_INT version of: {@link #glIndexPointer IndexPointer} */
	public static void glIndexPointer(int stride, IntBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglIndexPointer(GL11.GL_INT, stride, memAddress(pointer));
	}

	/** GL_FLOAT version of: {@link #glIndexPointer IndexPointer} */
	public static void glIndexPointer(int stride, FloatBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglIndexPointer(GL11.GL_FLOAT, stride, memAddress(pointer));
	}

	/** GL_DOUBLE version of: {@link #glIndexPointer IndexPointer} */
	public static void glIndexPointer(int stride, DoubleBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglIndexPointer(GL11.GL_DOUBLE, stride, memAddress(pointer));
	}

	// --- [ glInitNames ] ---

	/** JNI method for {@link #glInitNames InitNames} */
	@JavadocExclude
	public static native void nglInitNames(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glInitNames.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
Clears the selection name stack.
	 */
	public static void glInitNames() {
		long __functionAddress = getInstance().InitNames;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglInitNames(__functionAddress);
	}

	// --- [ glInterleavedArrays ] ---

	/** JNI method for {@link #glInterleavedArrays InterleavedArrays} */
	@JavadocExclude
	public static native void nglInterleavedArrays(int format, int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glInterleavedArrays InterleavedArrays} */
	@JavadocExclude
	public static void nglInterleavedArrays(int format, int stride, long pointer) {
		long __functionAddress = getInstance().InterleavedArrays;
		nglInterleavedArrays(format, stride, pointer, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInterleavedArrays.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
	 *
	 * @param format  the interleaved array format. One of:<br>{@link #GL_V2F V2F}, {@link #GL_V3F V3F}, {@link #GL_C4UB_V2F C4UB_V2F}, {@link #GL_C4UB_V3F C4UB_V3F}, {@link #GL_C3F_V3F C3F_V3F}, {@link #GL_N3F_V3F N3F_V3F}, {@link #GL_C4F_N3F_V3F C4F_N3F_V3F}, {@link #GL_T2F_V3F T2F_V3F}, {@link #GL_T4F_V4F T4F_V4F}, {@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}, {@link #GL_T2F_C3F_V3F T2F_C3F_V3F}, {@link #GL_T2F_N3F_V3F T2F_N3F_V3F}, {@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}, {@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glInterleavedArrays(int format, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglInterleavedArrays(format, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glInterleavedArrays InterleavedArrays} */
	public static void glInterleavedArrays(int format, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglInterleavedArrays(format, stride, pointerOffset);
	}

	/** ShortBuffer version of: {@link #glInterleavedArrays InterleavedArrays} */
	public static void glInterleavedArrays(int format, int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglInterleavedArrays(format, stride, memAddress(pointer));
	}

	/** IntBuffer version of: {@link #glInterleavedArrays InterleavedArrays} */
	public static void glInterleavedArrays(int format, int stride, IntBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglInterleavedArrays(format, stride, memAddress(pointer));
	}

	/** FloatBuffer version of: {@link #glInterleavedArrays InterleavedArrays} */
	public static void glInterleavedArrays(int format, int stride, FloatBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglInterleavedArrays(format, stride, memAddress(pointer));
	}

	/** DoubleBuffer version of: {@link #glInterleavedArrays InterleavedArrays} */
	public static void glInterleavedArrays(int format, int stride, DoubleBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglInterleavedArrays(format, stride, memAddress(pointer));
	}

	// --- [ glIsEnabled ] ---

	/** JNI method for {@link #glIsEnabled IsEnabled} */
	@JavadocExclude
	public static native boolean nglIsEnabled(int cap, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsEnabled.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Determines if {@code cap} is currently enabled (as with {@link #glEnable Enable}) or disabled.
	 *
	 * @param cap the enable state to query
	 */
	public static boolean glIsEnabled(int cap) {
		long __functionAddress = getInstance().IsEnabled;
		return nglIsEnabled(cap, __functionAddress);
	}

	// --- [ glIsList ] ---

	/** JNI method for {@link #glIsList IsList} */
	@JavadocExclude
	public static native boolean nglIsList(int list, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glIsList.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns true if the {@code list} is the index of some display list.
	 *
	 * @param list the list index to query
	 */
	public static boolean glIsList(int list) {
		long __functionAddress = getInstance().IsList;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsList(list, __functionAddress);
	}

	// --- [ glIsTexture ] ---

	/** JNI method for {@link #glIsTexture IsTexture} */
	@JavadocExclude
	public static native boolean nglIsTexture(int texture, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsTexture.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns true if {@code texture} is the name of a texture object.
	 *
	 * @param texture the texture name to query
	 */
	public static boolean glIsTexture(int texture) {
		long __functionAddress = getInstance().IsTexture;
		return nglIsTexture(texture, __functionAddress);
	}

	// --- [ glLightModeli ] ---

	/** JNI method for {@link #glLightModeli LightModeli} */
	@JavadocExclude
	public static native void nglLightModeli(int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLightModeli.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Set the integer value of a lighting model parameter.
	 *
	 * @param pname the lighting model parameter to set. One of:<br>{@link #GL_LIGHT_MODEL_AMBIENT LIGHT_MODEL_AMBIENT}, {@link #GL_LIGHT_MODEL_LOCAL_VIEWER LIGHT_MODEL_LOCAL_VIEWER}, {@link #GL_LIGHT_MODEL_TWO_SIDE LIGHT_MODEL_TWO_SIDE}, {@link GL12#GL_LIGHT_MODEL_COLOR_CONTROL LIGHT_MODEL_COLOR_CONTROL}
	 * @param param the parameter value
	 */
	public static void glLightModeli(int pname, int param) {
		long __functionAddress = getInstance().LightModeli;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLightModeli(pname, param, __functionAddress);
	}

	// --- [ glLightModelf ] ---

	/** JNI method for {@link #glLightModelf LightModelf} */
	@JavadocExclude
	public static native void nglLightModelf(int pname, float param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLightModelf.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glLightModeli LightModeli}.
	 *
	 * @param pname the lighting model parameter to set
	 * @param param the parameter value
	 */
	public static void glLightModelf(int pname, float param) {
		long __functionAddress = getInstance().LightModelf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLightModelf(pname, param, __functionAddress);
	}

	// --- [ glLightModeliv ] ---

	/** JNI method for {@link #glLightModeliv LightModeliv} */
	@JavadocExclude
	public static native void nglLightModeliv(int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glLightModeliv LightModeliv} */
	@JavadocExclude
	public static void nglLightModeliv(int pname, long params) {
		long __functionAddress = getInstance().LightModeliv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLightModeliv(pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLightModel.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glLightModeli LightModeli}.
	 *
	 * @param pname  the lighting model parameter to set
	 * @param params the parameter value
	 */
	public static void glLightModeliv(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglLightModeliv(pname, memAddress(params));
	}

	/** Alternative version of: {@link #glLightModeliv LightModeliv} */
	public static void glLightModeliv(int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglLightModeliv(pname, memAddress(params));
	}

	// --- [ glLightModelfv ] ---

	/** JNI method for {@link #glLightModelfv LightModelfv} */
	@JavadocExclude
	public static native void nglLightModelfv(int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glLightModelfv LightModelfv} */
	@JavadocExclude
	public static void nglLightModelfv(int pname, long params) {
		long __functionAddress = getInstance().LightModelfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLightModelfv(pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLightModel.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glLightModelf LightModelf}.
	 *
	 * @param pname  the lighting model parameter to set
	 * @param params the parameter value
	 */
	public static void glLightModelfv(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglLightModelfv(pname, memAddress(params));
	}

	/** Alternative version of: {@link #glLightModelfv LightModelfv} */
	public static void glLightModelfv(int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglLightModelfv(pname, memAddress(params));
	}

	// --- [ glLighti ] ---

	/** JNI method for {@link #glLighti Lighti} */
	@JavadocExclude
	public static native void nglLighti(int light, int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLighti.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the integer value of a light parameter.
	 *
	 * @param light the light for which to set the parameter. One of:<br>{@link #GL_LIGHT0 LIGHT0}, GL_LIGHT[1-7]
	 * @param pname the parameter to set. One of:<br>{@link #GL_AMBIENT AMBIENT}, {@link #GL_DIFFUSE DIFFUSE}, {@link #GL_SPECULAR SPECULAR}, {@link #GL_POSITION POSITION}, {@link #GL_CONSTANT_ATTENUATION CONSTANT_ATTENUATION}, {@link #GL_LINEAR_ATTENUATION LINEAR_ATTENUATION}, {@link #GL_QUADRATIC_ATTENUATION QUADRATIC_ATTENUATION}, {@link #GL_SPOT_DIRECTION SPOT_DIRECTION}, {@link #GL_SPOT_EXPONENT SPOT_EXPONENT}, {@link #GL_SPOT_CUTOFF SPOT_CUTOFF}
	 * @param param the parameter value
	 */
	public static void glLighti(int light, int pname, int param) {
		long __functionAddress = getInstance().Lighti;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLighti(light, pname, param, __functionAddress);
	}

	// --- [ glLightf ] ---

	/** JNI method for {@link #glLightf Lightf} */
	@JavadocExclude
	public static native void nglLightf(int light, int pname, float param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLightf.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glLighti Lighti}.
	 *
	 * @param light the light for which to set the parameter
	 * @param pname the parameter to set
	 * @param param the parameter value
	 */
	public static void glLightf(int light, int pname, float param) {
		long __functionAddress = getInstance().Lightf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLightf(light, pname, param, __functionAddress);
	}

	// --- [ glLightiv ] ---

	/** JNI method for {@link #glLightiv Lightiv} */
	@JavadocExclude
	public static native void nglLightiv(int light, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glLightiv Lightiv} */
	@JavadocExclude
	public static void nglLightiv(int light, int pname, long params) {
		long __functionAddress = getInstance().Lightiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLightiv(light, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLight.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glLighti Lighti}.
	 *
	 * @param light  the light for which to set the parameter
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glLightiv(int light, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglLightiv(light, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glLightiv Lightiv} */
	public static void glLightiv(int light, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglLightiv(light, pname, memAddress(params));
	}

	// --- [ glLightfv ] ---

	/** JNI method for {@link #glLightfv Lightfv} */
	@JavadocExclude
	public static native void nglLightfv(int light, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glLightfv Lightfv} */
	@JavadocExclude
	public static void nglLightfv(int light, int pname, long params) {
		long __functionAddress = getInstance().Lightfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLightfv(light, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLight.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glLightf Lightf}.
	 *
	 * @param light  the light for which to set the parameter
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glLightfv(int light, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglLightfv(light, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glLightfv Lightfv} */
	public static void glLightfv(int light, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglLightfv(light, pname, memAddress(params));
	}

	// --- [ glLineStipple ] ---

	/** JNI method for {@link #glLineStipple LineStipple} */
	@JavadocExclude
	public static native void nglLineStipple(int factor, short pattern, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLineStipple.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Defines a line stipple. It determines those fragments that are to be drawn when the line is rasterized. Line stippling may be enabled or disabled using
	 * {@link #glEnable Enable} or {@link #glDisable Disable} with the constant {@link #GL_LINE_STIPPLE LINE_STIPPLE}. When disabled, it is as if the line stipple has its default value.
	 *
	 * @param factor  a count that is used to modify the effective line stipple by causing each bit in pattern to be used {@code factor} times. {@code factor} is clamped
	 *                to the range [1, 256].
	 * @param pattern an unsigned short integer whose 16 bits define the stipple pattern
	 */
	public static void glLineStipple(int factor, short pattern) {
		long __functionAddress = getInstance().LineStipple;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLineStipple(factor, pattern, __functionAddress);
	}

	// --- [ glLineWidth ] ---

	/** JNI method for {@link #glLineWidth LineWidth} */
	@JavadocExclude
	public static native void nglLineWidth(float width, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glLineWidth.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the width of rasterized line segments. The default width is 1.0.
	 *
	 * @param width the line width
	 */
	public static void glLineWidth(float width) {
		long __functionAddress = getInstance().LineWidth;
		nglLineWidth(width, __functionAddress);
	}

	// --- [ glListBase ] ---

	/** JNI method for {@link #glListBase ListBase} */
	@JavadocExclude
	public static native void nglListBase(int base, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glListBase.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the display list base.
	 *
	 * @param base the display list base offset
	 */
	public static void glListBase(int base) {
		long __functionAddress = getInstance().ListBase;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglListBase(base, __functionAddress);
	}

	// --- [ glLoadMatrixf ] ---

	/** JNI method for {@link #glLoadMatrixf LoadMatrixf} */
	@JavadocExclude
	public static native void nglLoadMatrixf(long m, long __functionAddress);

	/** Unsafe version of {@link #glLoadMatrixf LoadMatrixf} */
	@JavadocExclude
	public static void nglLoadMatrixf(long m) {
		long __functionAddress = getInstance().LoadMatrixf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLoadMatrixf(m, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLoadMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current matrix to a 4 &times; 4 matrix in column-major order.
	 * 
	 * <p>The matrix is stored as 16 consecutive values, i.e. as:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr><td>a1</td><td>a5</td><td>a9</td><td>a13</td></tr>
	 * <tr><td>a2</td><td>a6</td><td>a10</td><td>a14</td></tr>
	 * <tr><td>a3</td><td>a7</td><td>a11</td><td>a15</td></tr>
	 * <tr><td>a4</td><td>a8</td><td>a12</td><td>a16</td></tr>
	 * </table></p>
	 * 
	 * <p>This differs from the standard row-major ordering for matrix elements. If the standard ordering is used, all of the subsequent transformation equations
	 * are transposed, and the columns representing vectors become rows.</p>
	 *
	 * @param m the matrix data
	 */
	public static void glLoadMatrixf(ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 2);
		nglLoadMatrixf(memAddress(m));
	}

	/** Alternative version of: {@link #glLoadMatrixf LoadMatrixf} */
	public static void glLoadMatrixf(FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglLoadMatrixf(memAddress(m));
	}

	// --- [ glLoadMatrixd ] ---

	/** JNI method for {@link #glLoadMatrixd LoadMatrixd} */
	@JavadocExclude
	public static native void nglLoadMatrixd(long m, long __functionAddress);

	/** Unsafe version of {@link #glLoadMatrixd LoadMatrixd} */
	@JavadocExclude
	public static void nglLoadMatrixd(long m) {
		long __functionAddress = getInstance().LoadMatrixd;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLoadMatrixd(m, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLoadMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glLoadMatrixf LoadMatrixf}.
	 *
	 * @param m the matrix data
	 */
	public static void glLoadMatrixd(ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 3);
		nglLoadMatrixd(memAddress(m));
	}

	/** Alternative version of: {@link #glLoadMatrixd LoadMatrixd} */
	public static void glLoadMatrixd(DoubleBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglLoadMatrixd(memAddress(m));
	}

	// --- [ glLoadIdentity ] ---

	/** JNI method for {@link #glLoadIdentity LoadIdentity} */
	@JavadocExclude
	public static native void nglLoadIdentity(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLoadIdentity.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current matrix to the identity matrix.
	 * 
	 * <p>Calling this function is equivalent to calling {@link #glLoadMatrixf LoadMatrixf} with the following matrix:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr><td>1</td><td>0</td><td>0</td><td>0</td></tr>
	 * <tr><td>0</td><td>1</td><td>0</td><td>0</td></tr>
	 * <tr><td>0</td><td>0</td><td>1</td><td>0</td></tr>
	 * <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table></p>
	 */
	public static void glLoadIdentity() {
		long __functionAddress = getInstance().LoadIdentity;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLoadIdentity(__functionAddress);
	}

	// --- [ glLoadName ] ---

	/** JNI method for {@link #glLoadName LoadName} */
	@JavadocExclude
	public static native void nglLoadName(int name, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLoadName.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Replaces the value on the top of the selection stack with {@code name}.
	 *
	 * @param name the name to load
	 */
	public static void glLoadName(int name) {
		long __functionAddress = getInstance().LoadName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLoadName(name, __functionAddress);
	}

	// --- [ glLogicOp ] ---

	/** JNI method for {@link #glLogicOp LogicOp} */
	@JavadocExclude
	public static native void nglLogicOp(int op, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glLogicOp.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the logical framebuffer operation.
	 *
	 * @param op the operation to set. One of:<br>{@link #GL_CLEAR CLEAR}, {@link #GL_AND AND}, {@link #GL_AND_REVERSE AND_REVERSE}, {@link #GL_COPY COPY}, {@link #GL_AND_INVERTED AND_INVERTED}, {@link #GL_NOOP NOOP}, {@link #GL_XOR XOR}, {@link #GL_OR OR}, {@link #GL_NOR NOR}, {@link #GL_EQUIV EQUIV}, {@link #GL_INVERT INVERT}, {@link #GL_OR_REVERSE OR_REVERSE}, {@link #GL_COPY_INVERTED COPY_INVERTED}, {@link #GL_OR_INVERTED OR_INVERTED}, {@link #GL_NAND NAND}, {@link #GL_SET SET}
	 */
	public static void glLogicOp(int op) {
		long __functionAddress = getInstance().LogicOp;
		nglLogicOp(op, __functionAddress);
	}

	// --- [ glMap1f ] ---

	/** JNI method for {@link #glMap1f Map1f} */
	@JavadocExclude
	public static native void nglMap1f(int target, float u1, float u2, int stride, int order, long points, long __functionAddress);

	/** Unsafe version of {@link #glMap1f Map1f} */
	@JavadocExclude
	public static void nglMap1f(int target, float u1, float u2, int stride, int order, long points) {
		long __functionAddress = getInstance().Map1f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMap1f(target, u1, u2, stride, order, points, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMap1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Defines a polynomial or rational polynomial mapping to produce vertex, normal, texture coordinates and colors. The values so produced are sent on to
	 * further stages of the GL as if they had been provided directly by the client.
	 *
	 * @param target the evaluator target. One of:<br>{@link #GL_MAP1_VERTEX_3 MAP1_VERTEX_3}, {@link #GL_MAP1_VERTEX_4 MAP1_VERTEX_4}, {@link #GL_MAP1_COLOR_4 MAP1_COLOR_4}, {@link #GL_MAP1_NORMAL MAP1_NORMAL}, {@link #GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}, {@link #GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}, {@link #GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}, {@link #GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}
	 * @param u1     the first endpoint of the pre-image of the map
	 * @param u2     the second endpoint of the pre-image of the map
	 * @param stride the number of values in each block of storage
	 * @param order  the polynomial order
	 * @param points a set of {@code order} blocks of storage containing control points
	 */
	public static void glMap1f(int target, float u1, float u2, int stride, int order, ByteBuffer points) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(points, (order * stride) << 2);
		nglMap1f(target, u1, u2, stride, order, memAddress(points));
	}

	/** Alternative version of: {@link #glMap1f Map1f} */
	public static void glMap1f(int target, float u1, float u2, int stride, int order, FloatBuffer points) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(points, order * stride);
		nglMap1f(target, u1, u2, stride, order, memAddress(points));
	}

	// --- [ glMap1d ] ---

	/** JNI method for {@link #glMap1d Map1d} */
	@JavadocExclude
	public static native void nglMap1d(int target, double u1, double u2, int stride, int order, long points, long __functionAddress);

	/** Unsafe version of {@link #glMap1d Map1d} */
	@JavadocExclude
	public static void nglMap1d(int target, double u1, double u2, int stride, int order, long points) {
		long __functionAddress = getInstance().Map1d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMap1d(target, u1, u2, stride, order, points, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMap1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glMap1f Map1f}.
	 *
	 * @param target the evaluator target
	 * @param u1     the first endpoint of the pre-image of the map
	 * @param u2     the second endpoint of the pre-image of the map
	 * @param stride the number of values in each block of storage
	 * @param order  the polynomial order
	 * @param points a set of {@code order} blocks of storage containing control points
	 */
	public static void glMap1d(int target, double u1, double u2, int stride, int order, ByteBuffer points) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(points, (stride * order) << 3);
		nglMap1d(target, u1, u2, stride, order, memAddress(points));
	}

	/** Alternative version of: {@link #glMap1d Map1d} */
	public static void glMap1d(int target, double u1, double u2, int stride, int order, DoubleBuffer points) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(points, stride * order);
		nglMap1d(target, u1, u2, stride, order, memAddress(points));
	}

	// --- [ glMap2f ] ---

	/** JNI method for {@link #glMap2f Map2f} */
	@JavadocExclude
	public static native void nglMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, long points, long __functionAddress);

	/** Unsafe version of {@link #glMap2f Map2f} */
	@JavadocExclude
	public static void nglMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, long points) {
		long __functionAddress = getInstance().Map2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMap2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Bivariate version of {@link #glMap1f Map1f}.
	 *
	 * @param target  the evaluator target
	 * @param u1      the first u-dimension endpoint of the pre-image rectangle of the map
	 * @param u2      the second u-dimension endpoint of the pre-image rectangle of the map
	 * @param ustride the number of values in the u-dimension in each block of storage
	 * @param uorder  the polynomial order in the u-dimension
	 * @param v1      the first v-dimension endpoint of the pre-image rectangle of the map
	 * @param v2      the second v-dimension endpoint of the pre-image rectangle of the map
	 * @param vstride the number of values in the v-dimension in each block of storage
	 * @param vorder  the polynomial order in the v-dimension
	 * @param points  a set of <code style="font-family: monospace">uorder &times; vorder</code> blocks of storage containing control points
	 */
	public static void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, ByteBuffer points) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(points, (ustride * uorder * vstride * vorder) << 2);
		nglMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points));
	}

	/** Alternative version of: {@link #glMap2f Map2f} */
	public static void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(points, ustride * uorder * vstride * vorder);
		nglMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points));
	}

	// --- [ glMap2d ] ---

	/** JNI method for {@link #glMap2d Map2d} */
	@JavadocExclude
	public static native void nglMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, long points, long __functionAddress);

	/** Unsafe version of {@link #glMap2d Map2d} */
	@JavadocExclude
	public static void nglMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, long points) {
		long __functionAddress = getInstance().Map2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMap2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glMap2f Map2f}.
	 *
	 * @param target  the evaluator target
	 * @param u1      the first u-dimension endpoint of the pre-image rectangle of the map
	 * @param u2      the second u-dimension endpoint of the pre-image rectangle of the map
	 * @param ustride the number of values in the u-dimension in each block of storage
	 * @param uorder  the polynomial order in the u-dimension
	 * @param v1      the first v-dimension endpoint of the pre-image rectangle of the map
	 * @param v2      the second v-dimension endpoint of the pre-image rectangle of the map
	 * @param vstride the number of values in the v-dimension in each block of storage
	 * @param vorder  the polynomial order in the v-dimension
	 * @param points  a set of <code style="font-family: monospace">uorder &times; vorder</code> blocks of storage containing control points
	 */
	public static void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, ByteBuffer points) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(points, (ustride * uorder * vstride * vorder) << 3);
		nglMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points));
	}

	/** Alternative version of: {@link #glMap2d Map2d} */
	public static void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(points, ustride * uorder * vstride * vorder);
		nglMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points));
	}

	// --- [ glMapGrid1f ] ---

	/** JNI method for {@link #glMapGrid1f MapGrid1f} */
	@JavadocExclude
	public static native void nglMapGrid1f(int n, float u1, float u2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMapGrid1f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Defines a one-dimensional grid in the map evaluator domain.
	 *
	 * @param n  the number of partitions of the interval
	 * @param u1 the first interval endpoint
	 * @param u2 the second interval endpoint
	 */
	public static void glMapGrid1f(int n, float u1, float u2) {
		long __functionAddress = getInstance().MapGrid1f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMapGrid1f(n, u1, u2, __functionAddress);
	}

	// --- [ glMapGrid1d ] ---

	/** JNI method for {@link #glMapGrid1d MapGrid1d} */
	@JavadocExclude
	public static native void nglMapGrid1d(int n, double u1, double u2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMapGrid1d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glMapGrid1f MapGrid1f}.
	 *
	 * @param n  the number of partitions of the interval
	 * @param u1 the first interval endpoint
	 * @param u2 the second interval endpoint
	 */
	public static void glMapGrid1d(int n, double u1, double u2) {
		long __functionAddress = getInstance().MapGrid1d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMapGrid1d(n, u1, u2, __functionAddress);
	}

	// --- [ glMapGrid2f ] ---

	/** JNI method for {@link #glMapGrid2f MapGrid2f} */
	@JavadocExclude
	public static native void nglMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMapGrid2f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Defines a two-dimensional grid in the map evaluator domain.
	 *
	 * @param un the number of partitions of the interval in the u-dimension
	 * @param u1 the first u-dimension interval endpoint
	 * @param u2 the second u-dimension interval endpoint
	 * @param vn the number of partitions of the interval in the v-dimension
	 * @param v1 the first v-dimension interval endpoint
	 * @param v2 the second v-dimension interval endpoint
	 */
	public static void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2) {
		long __functionAddress = getInstance().MapGrid2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMapGrid2f(un, u1, u2, vn, v1, v2, __functionAddress);
	}

	// --- [ glMapGrid2d ] ---

	/** JNI method for {@link #glMapGrid2d MapGrid2d} */
	@JavadocExclude
	public static native void nglMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMapGrid2d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glMapGrid2f MapGrid2f}.
	 *
	 * @param un the number of partitions of the interval in the u-dimension
	 * @param u1 the first u-dimension interval endpoint
	 * @param u2 the second u-dimension interval endpoint
	 * @param vn the number of partitions of the interval in the v-dimension
	 * @param v1 the first v-dimension interval endpoint
	 * @param v2 the second v-dimension interval endpoint
	 */
	public static void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2) {
		long __functionAddress = getInstance().MapGrid2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMapGrid2d(un, u1, u2, vn, v1, v2, __functionAddress);
	}

	// --- [ glMateriali ] ---

	/** JNI method for {@link #glMateriali Materiali} */
	@JavadocExclude
	public static native void nglMateriali(int face, int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMateriali.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the integer value of a material parameter.
	 *
	 * @param face  the material face for which to set the parameter. One of:<br>{@link #GL_FRONT FRONT}, {@link #GL_BACK BACK}, {@link #GL_FRONT_AND_BACK FRONT_AND_BACK}
	 * @param pname the parameter to set. Must be:<br>{@link #GL_SHININESS SHININESS}
	 * @param param the parameter value
	 */
	public static void glMateriali(int face, int pname, int param) {
		long __functionAddress = getInstance().Materiali;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMateriali(face, pname, param, __functionAddress);
	}

	// --- [ glMaterialf ] ---

	/** JNI method for {@link #glMaterialf Materialf} */
	@JavadocExclude
	public static native void nglMaterialf(int face, int pname, float param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMaterialf.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glMateriali Materiali}.
	 *
	 * @param face  the material face for which to set the parameter
	 * @param pname the parameter to set
	 * @param param the parameter value
	 */
	public static void glMaterialf(int face, int pname, float param) {
		long __functionAddress = getInstance().Materialf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMaterialf(face, pname, param, __functionAddress);
	}

	// --- [ glMaterialiv ] ---

	/** JNI method for {@link #glMaterialiv Materialiv} */
	@JavadocExclude
	public static native void nglMaterialiv(int face, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glMaterialiv Materialiv} */
	@JavadocExclude
	public static void nglMaterialiv(int face, int pname, long params) {
		long __functionAddress = getInstance().Materialiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMaterialiv(face, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMaterial.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMateriali Materiali}.
	 *
	 * @param face   the material face for which to set the parameter
	 * @param pname  the parameter to set. One of:<br>{@link #GL_AMBIENT AMBIENT}, {@link #GL_DIFFUSE DIFFUSE}, {@link #GL_AMBIENT_AND_DIFFUSE AMBIENT_AND_DIFFUSE}, {@link #GL_SPECULAR SPECULAR}, {@link #GL_EMISSION EMISSION}
	 * @param params the parameter value
	 */
	public static void glMaterialiv(int face, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglMaterialiv(face, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glMaterialiv Materialiv} */
	public static void glMaterialiv(int face, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglMaterialiv(face, pname, memAddress(params));
	}

	// --- [ glMaterialfv ] ---

	/** JNI method for {@link #glMaterialfv Materialfv} */
	@JavadocExclude
	public static native void nglMaterialfv(int face, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glMaterialfv Materialfv} */
	@JavadocExclude
	public static void nglMaterialfv(int face, int pname, long params) {
		long __functionAddress = getInstance().Materialfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMaterialfv(face, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMaterial.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMaterialf Materialf}.
	 *
	 * @param face   the material face for which to set the parameter
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glMaterialfv(int face, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglMaterialfv(face, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glMaterialfv Materialfv} */
	public static void glMaterialfv(int face, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglMaterialfv(face, pname, memAddress(params));
	}

	// --- [ glMatrixMode ] ---

	/** JNI method for {@link #glMatrixMode MatrixMode} */
	@JavadocExclude
	public static native void nglMatrixMode(int mode, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMatrixMode.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Set the current matrix mode.
	 *
	 * @param mode the matrix mode. One of:<br>{@link #GL_MODELVIEW MODELVIEW}, {@link #GL_PROJECTION PROJECTION}, {@link #GL_TEXTURE TEXTURE}, {@link #GL_COLOR COLOR}
	 */
	public static void glMatrixMode(int mode) {
		long __functionAddress = getInstance().MatrixMode;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMatrixMode(mode, __functionAddress);
	}

	// --- [ glMultMatrixf ] ---

	/** JNI method for {@link #glMultMatrixf MultMatrixf} */
	@JavadocExclude
	public static native void nglMultMatrixf(long m, long __functionAddress);

	/** Unsafe version of {@link #glMultMatrixf MultMatrixf} */
	@JavadocExclude
	public static void nglMultMatrixf(long m) {
		long __functionAddress = getInstance().MultMatrixf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultMatrixf(m, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Multiplies the current matrix with a 4 &times; 4 matrix in column-major order. See {@link #glLoadMatrixf LoadMatrixf} for details.
	 *
	 * @param m the matrix data
	 */
	public static void glMultMatrixf(ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 2);
		nglMultMatrixf(memAddress(m));
	}

	/** Alternative version of: {@link #glMultMatrixf MultMatrixf} */
	public static void glMultMatrixf(FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglMultMatrixf(memAddress(m));
	}

	// --- [ glMultMatrixd ] ---

	/** JNI method for {@link #glMultMatrixd MultMatrixd} */
	@JavadocExclude
	public static native void nglMultMatrixd(long m, long __functionAddress);

	/** Unsafe version of {@link #glMultMatrixd MultMatrixd} */
	@JavadocExclude
	public static void nglMultMatrixd(long m) {
		long __functionAddress = getInstance().MultMatrixd;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultMatrixd(m, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glMultMatrixf MultMatrixf}.
	 *
	 * @param m the matrix data
	 */
	public static void glMultMatrixd(ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 3);
		nglMultMatrixd(memAddress(m));
	}

	/** Alternative version of: {@link #glMultMatrixd MultMatrixd} */
	public static void glMultMatrixd(DoubleBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglMultMatrixd(memAddress(m));
	}

	// --- [ glFrustum ] ---

	/** JNI method for {@link #glFrustum Frustum} */
	@JavadocExclude
	public static native void nglFrustum(double l, double r, double b, double t, double n, double f, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFrustum.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Manipulates the current matrix with a matrix that produces perspective projection, in such a way that the coordinates <code style="font-family: monospace">(lb &ndash; n)<sup>T</sup></code>
	 * and <code style="font-family: monospace">(rt &ndash; n)<sup>T</sup></code> specify the points on the near clipping plane that are mapped to the lower left and upper right corners of the
	 * window, respectively (assuming that the eye is located at <code style="font-family: monospace">(0 0 0)<sup>T</sup></code>). {@code f} gives the distance from the eye to the far clipping
	 * plane.
	 * 
	 * <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr><td>2n / (r - l)</td><td>0</td><td>(r + l) / (r - l)</td><td>0</td></tr>
	 * <tr><td>0</td><td>2n / (t - b)</td><td>(t + b) / (t - b)</td><td>0</td></tr>
	 * <tr><td>0</td><td>0</td><td>- (f + n) / (f - n)</td><td>- (2fn) / (f - n)</td></tr>
	 * <tr><td>0</td><td>0</td><td>-1</td><td>0</td></tr>
	 * </table></p>
	 *
	 * @param l the left frustum plane
	 * @param r the right frustum plane
	 * @param b the bottom frustum plane
	 * @param t the top frustum plane
	 * @param n the near frustum plane
	 * @param f the far frustum plane
	 */
	public static void glFrustum(double l, double r, double b, double t, double n, double f) {
		long __functionAddress = getInstance().Frustum;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFrustum(l, r, b, t, n, f, __functionAddress);
	}

	// --- [ glNewList ] ---

	/** JNI method for {@link #glNewList NewList} */
	@JavadocExclude
	public static native void nglNewList(int n, int mode, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNewList.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Begins the definition of a display list.
	 *
	 * @param n    a positive integer to which the display list that follows is assigned
	 * @param mode a symbolic constant that controls the behavior of the GL during display list creation. One of:<br>{@link #GL_COMPILE COMPILE}, {@link #GL_COMPILE_AND_EXECUTE COMPILE_AND_EXECUTE}
	 */
	public static void glNewList(int n, int mode) {
		long __functionAddress = getInstance().NewList;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNewList(n, mode, __functionAddress);
	}

	// --- [ glEndList ] ---

	/** JNI method for {@link #glEndList EndList} */
	@JavadocExclude
	public static native void nglEndList(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glEndList.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Ends the definition of GL commands to be placed in a display list. It is only when {@code EndList} occurs that the specified display list is actually
	 * associated with the index indicated with {@link #glNewList NewList}.
	 */
	public static void glEndList() {
		long __functionAddress = getInstance().EndList;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEndList(__functionAddress);
	}

	// --- [ glNormal3f ] ---

	/** JNI method for {@link #glNormal3f Normal3f} */
	@JavadocExclude
	public static native void nglNormal3f(float nx, float ny, float nz, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current normal.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static void glNormal3f(float nx, float ny, float nz) {
		long __functionAddress = getInstance().Normal3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3f(nx, ny, nz, __functionAddress);
	}

	// --- [ glNormal3b ] ---

	/** JNI method for {@link #glNormal3b Normal3b} */
	@JavadocExclude
	public static native void nglNormal3b(byte nx, byte ny, byte nz, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3b.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Byte version of {@link #glNormal3f Normal3f}.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static void glNormal3b(byte nx, byte ny, byte nz) {
		long __functionAddress = getInstance().Normal3b;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3b(nx, ny, nz, __functionAddress);
	}

	// --- [ glNormal3s ] ---

	/** JNI method for {@link #glNormal3s Normal3s} */
	@JavadocExclude
	public static native void nglNormal3s(short nx, short ny, short nz, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glNormal3f Normal3f}.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static void glNormal3s(short nx, short ny, short nz) {
		long __functionAddress = getInstance().Normal3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3s(nx, ny, nz, __functionAddress);
	}

	// --- [ glNormal3i ] ---

	/** JNI method for {@link #glNormal3i Normal3i} */
	@JavadocExclude
	public static native void nglNormal3i(int nx, int ny, int nz, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glNormal3f Normal3f}.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static void glNormal3i(int nx, int ny, int nz) {
		long __functionAddress = getInstance().Normal3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3i(nx, ny, nz, __functionAddress);
	}

	// --- [ glNormal3d ] ---

	/** JNI method for {@link #glNormal3d Normal3d} */
	@JavadocExclude
	public static native void nglNormal3d(double nx, double ny, double nz, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glNormal3f Normal3f}.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static void glNormal3d(double nx, double ny, double nz) {
		long __functionAddress = getInstance().Normal3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3d(nx, ny, nz, __functionAddress);
	}

	// --- [ glNormal3fv ] ---

	/** JNI method for {@link #glNormal3fv Normal3fv} */
	@JavadocExclude
	public static native void nglNormal3fv(long v, long __functionAddress);

	/** Unsafe version of {@link #glNormal3fv Normal3fv} */
	@JavadocExclude
	public static void nglNormal3fv(long v) {
		long __functionAddress = getInstance().Normal3fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3fv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glNormal3f Normal3f}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3fv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglNormal3fv(memAddress(v));
	}

	/** Alternative version of: {@link #glNormal3fv Normal3fv} */
	public static void glNormal3fv(FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglNormal3fv(memAddress(v));
	}

	// --- [ glNormal3bv ] ---

	/** JNI method for {@link #glNormal3bv Normal3bv} */
	@JavadocExclude
	public static native void nglNormal3bv(long v, long __functionAddress);

	/** Unsafe version of {@link #glNormal3bv Normal3bv} */
	@JavadocExclude
	public static void nglNormal3bv(long v) {
		long __functionAddress = getInstance().Normal3bv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3bv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3b.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glNormal3b Normal3b}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3bv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglNormal3bv(memAddress(v));
	}

	// --- [ glNormal3sv ] ---

	/** JNI method for {@link #glNormal3sv Normal3sv} */
	@JavadocExclude
	public static native void nglNormal3sv(long v, long __functionAddress);

	/** Unsafe version of {@link #glNormal3sv Normal3sv} */
	@JavadocExclude
	public static void nglNormal3sv(long v) {
		long __functionAddress = getInstance().Normal3sv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3sv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glNormal3s Normal3s}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3sv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglNormal3sv(memAddress(v));
	}

	/** Alternative version of: {@link #glNormal3sv Normal3sv} */
	public static void glNormal3sv(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglNormal3sv(memAddress(v));
	}

	// --- [ glNormal3iv ] ---

	/** JNI method for {@link #glNormal3iv Normal3iv} */
	@JavadocExclude
	public static native void nglNormal3iv(long v, long __functionAddress);

	/** Unsafe version of {@link #glNormal3iv Normal3iv} */
	@JavadocExclude
	public static void nglNormal3iv(long v) {
		long __functionAddress = getInstance().Normal3iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3iv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glNormal3i Normal3i}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3iv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglNormal3iv(memAddress(v));
	}

	/** Alternative version of: {@link #glNormal3iv Normal3iv} */
	public static void glNormal3iv(IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglNormal3iv(memAddress(v));
	}

	// --- [ glNormal3dv ] ---

	/** JNI method for {@link #glNormal3dv Normal3dv} */
	@JavadocExclude
	public static native void nglNormal3dv(long v, long __functionAddress);

	/** Unsafe version of {@link #glNormal3dv Normal3dv} */
	@JavadocExclude
	public static void nglNormal3dv(long v) {
		long __functionAddress = getInstance().Normal3dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3dv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glNormal3d Normal3d}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3dv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 3);
		nglNormal3dv(memAddress(v));
	}

	/** Alternative version of: {@link #glNormal3dv Normal3dv} */
	public static void glNormal3dv(DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglNormal3dv(memAddress(v));
	}

	// --- [ glNormalPointer ] ---

	/** JNI method for {@link #glNormalPointer NormalPointer} */
	@JavadocExclude
	public static native void nglNormalPointer(int type, int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glNormalPointer NormalPointer} */
	@JavadocExclude
	public static void nglNormalPointer(int type, int stride, long pointer) {
		long __functionAddress = getInstance().NormalPointer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormalPointer(type, stride, pointer, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormalPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a normal array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<br>{@link #GL_BYTE BYTE}, {@link #GL_SHORT SHORT}, {@link #GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT FLOAT}, {@link #GL_DOUBLE DOUBLE}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the normal array data
	 */
	public static void glNormalPointer(int type, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglNormalPointer(type, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glNormalPointer NormalPointer} */
	public static void glNormalPointer(int type, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglNormalPointer(type, stride, pointerOffset);
	}

	/** GL_BYTE version of: {@link #glNormalPointer NormalPointer} */
	public static void glNormalPointer(int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglNormalPointer(GL11.GL_BYTE, stride, memAddress(pointer));
	}

	/** GL_SHORT version of: {@link #glNormalPointer NormalPointer} */
	public static void glNormalPointer(int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglNormalPointer(GL11.GL_SHORT, stride, memAddress(pointer));
	}

	/** GL_FLOAT version of: {@link #glNormalPointer NormalPointer} */
	public static void glNormalPointer(int stride, FloatBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglNormalPointer(GL11.GL_FLOAT, stride, memAddress(pointer));
	}

	// --- [ glOrtho ] ---

	/** JNI method for {@link #glOrtho Ortho} */
	@JavadocExclude
	public static native void nglOrtho(double l, double r, double b, double t, double n, double f, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glOrtho.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Manipulates the current matrix with a matrix that produces parallel projection, in such a way that the coordinates <code style="font-family: monospace">(lb &ndash; n)<sup>T</sup></code>
	 * and <code style="font-family: monospace">(rt &ndash; n)<sup>T</sup></code> specify the points on the near clipping plane that are mapped to the lower left and upper right corners of the
	 * window, respectively (assuming that the eye is located at <code style="font-family: monospace">(0 0 0)<sup>T</sup></code>). {@code f} gives the distance from the eye to the far clipping
	 * plane.
	 * 
	 * <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr><td>2 / (r - l)</td><td>0</td><td>0</td><td>- (r + l) / (r - l)</td></tr>
	 * <tr><td>0</td><td>2 / (t - b)</td><td>0</td><td>- (t + b) / (t - b)</td></tr>
	 * <tr><td>0</td><td>0</td><td>- 2 / (f - n)</td><td>- (f + n) / (f - n)</td></tr>
	 * <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table></p>
	 *
	 * @param l the left frustum plane
	 * @param r the right frustum plane
	 * @param b the bottom frustum plane
	 * @param t the top frustum plane
	 * @param n the near frustum plane
	 * @param f the far frustum plane
	 */
	public static void glOrtho(double l, double r, double b, double t, double n, double f) {
		long __functionAddress = getInstance().Ortho;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglOrtho(l, r, b, t, n, f, __functionAddress);
	}

	// --- [ glPassThrough ] ---

	/** JNI method for {@link #glPassThrough PassThrough} */
	@JavadocExclude
	public static native void nglPassThrough(float token, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPassThrough.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Inserts a marker when the GL is in feeback mode. {@code token} is returned as if it were a primitive; it is indicated with its own unique identifying
	 * value. The ordering of any {@code PassThrough} commands with respect to primitive specification is maintained by feedback. {@code PassThrough} may
	 * not occur between {@link #glBegin Begin} and {@link #glEnd End}.
	 *
	 * @param token the marker value to insert
	 */
	public static void glPassThrough(float token) {
		long __functionAddress = getInstance().PassThrough;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPassThrough(token, __functionAddress);
	}

	// --- [ glPixelMapfv ] ---

	/** JNI method for {@link #glPixelMapfv PixelMapfv} */
	@JavadocExclude
	public static native void nglPixelMapfv(int map, int size, long values, long __functionAddress);

	/** Unsafe version of {@link #glPixelMapfv PixelMapfv} */
	@JavadocExclude
	public static void nglPixelMapfv(int map, int size, long values) {
		long __functionAddress = getInstance().PixelMapfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPixelMapfv(map, size, values, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPixelMap.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets a pixel map lookup table.
	 *
	 * @param map    the map to set. One of:<br>{@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}, {@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}, {@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}, {@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}, {@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}, {@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}, {@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}, {@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}, {@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}, {@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}
	 * @param size   the map size
	 * @param values the map values
	 */
	public static void glPixelMapfv(int map, int size, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(values, size << 2);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglPixelMapfv(map, size, memAddress(values));
	}

	/** Buffer object offset version of: {@link #glPixelMapfv PixelMapfv} */
	public static void glPixelMapfv(int map, int size, long valuesOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglPixelMapfv(map, size, valuesOffset);
	}

	/** Alternative version of: {@link #glPixelMapfv PixelMapfv} */
	public static void glPixelMapfv(int map, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglPixelMapfv(map, values.remaining(), memAddress(values));
	}

	// --- [ glPixelMapusv ] ---

	/** JNI method for {@link #glPixelMapusv PixelMapusv} */
	@JavadocExclude
	public static native void nglPixelMapusv(int map, int size, long values, long __functionAddress);

	/** Unsafe version of {@link #glPixelMapusv PixelMapusv} */
	@JavadocExclude
	public static void nglPixelMapusv(int map, int size, long values) {
		long __functionAddress = getInstance().PixelMapusv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPixelMapusv(map, size, values, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPixelMap.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned short version of {@link #glPixelMapfv PixelMapfv}.
	 *
	 * @param map    the map to set
	 * @param size   the map size
	 * @param values the map values
	 */
	public static void glPixelMapusv(int map, int size, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(values, size << 1);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglPixelMapusv(map, size, memAddress(values));
	}

	/** Buffer object offset version of: {@link #glPixelMapusv PixelMapusv} */
	public static void glPixelMapusv(int map, int size, long valuesOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglPixelMapusv(map, size, valuesOffset);
	}

	/** Alternative version of: {@link #glPixelMapusv PixelMapusv} */
	public static void glPixelMapusv(int map, ShortBuffer values) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglPixelMapusv(map, values.remaining(), memAddress(values));
	}

	// --- [ glPixelMapuiv ] ---

	/** JNI method for {@link #glPixelMapuiv PixelMapuiv} */
	@JavadocExclude
	public static native void nglPixelMapuiv(int map, int size, long values, long __functionAddress);

	/** Unsafe version of {@link #glPixelMapuiv PixelMapuiv} */
	@JavadocExclude
	public static void nglPixelMapuiv(int map, int size, long values) {
		long __functionAddress = getInstance().PixelMapuiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPixelMapuiv(map, size, values, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPixelMap.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned integer version of {@link #glPixelMapfv PixelMapfv}.
	 *
	 * @param map    the map to set
	 * @param size   the map size
	 * @param values the map values
	 */
	public static void glPixelMapuiv(int map, int size, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(values, size << 2);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglPixelMapuiv(map, size, memAddress(values));
	}

	/** Buffer object offset version of: {@link #glPixelMapuiv PixelMapuiv} */
	public static void glPixelMapuiv(int map, int size, long valuesOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglPixelMapuiv(map, size, valuesOffset);
	}

	/** Alternative version of: {@link #glPixelMapuiv PixelMapuiv} */
	public static void glPixelMapuiv(int map, IntBuffer values) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglPixelMapuiv(map, values.remaining(), memAddress(values));
	}

	// --- [ glPixelStorei ] ---

	/** JNI method for {@link #glPixelStorei PixelStorei} */
	@JavadocExclude
	public static native void nglPixelStorei(int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPixelStorei.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the integer value of a pixel store parameter.
	 *
	 * @param pname the pixel store parameter to set. One of:<br>{@link #GL_UNPACK_SWAP_BYTES UNPACK_SWAP_BYTES}, {@link #GL_UNPACK_LSB_FIRST UNPACK_LSB_FIRST}, {@link #GL_UNPACK_ROW_LENGTH UNPACK_ROW_LENGTH}, {@link #GL_UNPACK_SKIP_ROWS UNPACK_SKIP_ROWS}, {@link #GL_UNPACK_SKIP_PIXELS UNPACK_SKIP_PIXELS}, {@link #GL_UNPACK_ALIGNMENT UNPACK_ALIGNMENT}, {@link GL12#GL_UNPACK_IMAGE_HEIGHT UNPACK_IMAGE_HEIGHT}, {@link GL12#GL_UNPACK_SKIP_IMAGES UNPACK_SKIP_IMAGES}, {@link GL42#GL_UNPACK_COMPRESSED_BLOCK_WIDTH UNPACK_COMPRESSED_BLOCK_WIDTH}, {@link GL42#GL_UNPACK_COMPRESSED_BLOCK_HEIGHT UNPACK_COMPRESSED_BLOCK_HEIGHT}, {@link GL42#GL_UNPACK_COMPRESSED_BLOCK_DEPTH UNPACK_COMPRESSED_BLOCK_DEPTH}, {@link GL42#GL_UNPACK_COMPRESSED_BLOCK_SIZE UNPACK_COMPRESSED_BLOCK_SIZE}
	 * @param param the parameter value
	 */
	public static void glPixelStorei(int pname, int param) {
		long __functionAddress = getInstance().PixelStorei;
		nglPixelStorei(pname, param, __functionAddress);
	}

	// --- [ glPixelStoref ] ---

	/** JNI method for {@link #glPixelStoref PixelStoref} */
	@JavadocExclude
	public static native void nglPixelStoref(int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPixelStoref.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Float version of {@link #glPixelStorei PixelStorei}.
	 *
	 * @param pname the pixel store parameter to set
	 * @param param the parameter value
	 */
	public static void glPixelStoref(int pname, int param) {
		long __functionAddress = getInstance().PixelStoref;
		nglPixelStoref(pname, param, __functionAddress);
	}

	// --- [ glPixelTransferi ] ---

	/** JNI method for {@link #glPixelTransferi PixelTransferi} */
	@JavadocExclude
	public static native void nglPixelTransferi(int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPixelTransferi.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the integer value of a pixel transfer parameter.
	 *
	 * @param pname the pixel transfer parameter to set. One of:<br>{@link #GL_MAP_COLOR MAP_COLOR}, {@link #GL_MAP_STENCIL MAP_STENCIL}, {@link #GL_INDEX_SHIFT INDEX_SHIFT}, {@link #GL_INDEX_OFFSET INDEX_OFFSET}, {@link #GL_RED_SCALE RED_SCALE}, {@link #GL_GREEN_SCALE GREEN_SCALE}, {@link #GL_BLUE_SCALE BLUE_SCALE}, {@link #GL_ALPHA_SCALE ALPHA_SCALE}, {@link #GL_DEPTH_SCALE DEPTH_SCALE}, {@link #GL_RED_BIAS RED_BIAS}, {@link #GL_GREEN_BIAS GREEN_BIAS}, {@link #GL_BLUE_BIAS BLUE_BIAS}, {@link #GL_ALPHA_BIAS ALPHA_BIAS}, {@link #GL_DEPTH_BIAS DEPTH_BIAS}, {@link ARBImaging#GL_POST_CONVOLUTION_RED_SCALE POST_CONVOLUTION_RED_SCALE}, {@link ARBImaging#GL_POST_CONVOLUTION_RED_BIAS POST_CONVOLUTION_RED_BIAS}, {@link ARBImaging#GL_POST_COLOR_MATRIX_RED_SCALE POST_COLOR_MATRIX_RED_SCALE}, {@link ARBImaging#GL_POST_COLOR_MATRIX_RED_BIAS POST_COLOR_MATRIX_RED_BIAS}, {@link ARBImaging#GL_POST_CONVOLUTION_GREEN_SCALE POST_CONVOLUTION_GREEN_SCALE}, {@link ARBImaging#GL_POST_CONVOLUTION_GREEN_BIAS POST_CONVOLUTION_GREEN_BIAS}, {@link ARBImaging#GL_POST_COLOR_MATRIX_GREEN_SCALE POST_COLOR_MATRIX_GREEN_SCALE}, {@link ARBImaging#GL_POST_COLOR_MATRIX_GREEN_BIAS POST_COLOR_MATRIX_GREEN_BIAS}, {@link ARBImaging#GL_POST_CONVOLUTION_BLUE_SCALE POST_CONVOLUTION_BLUE_SCALE}, {@link ARBImaging#GL_POST_CONVOLUTION_BLUE_BIAS POST_CONVOLUTION_BLUE_BIAS}, {@link ARBImaging#GL_POST_COLOR_MATRIX_BLUE_SCALE POST_COLOR_MATRIX_BLUE_SCALE}, {@link ARBImaging#GL_POST_COLOR_MATRIX_BLUE_BIAS POST_COLOR_MATRIX_BLUE_BIAS}, {@link ARBImaging#GL_POST_CONVOLUTION_ALPHA_SCALE POST_CONVOLUTION_ALPHA_SCALE}, {@link ARBImaging#GL_POST_CONVOLUTION_ALPHA_BIAS POST_CONVOLUTION_ALPHA_BIAS}, {@link ARBImaging#GL_POST_COLOR_MATRIX_ALPHA_SCALE POST_COLOR_MATRIX_ALPHA_SCALE}, {@link ARBImaging#GL_POST_COLOR_MATRIX_ALPHA_BIAS POST_COLOR_MATRIX_ALPHA_BIAS}
	 * @param param the parameter value
	 */
	public static void glPixelTransferi(int pname, int param) {
		long __functionAddress = getInstance().PixelTransferi;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPixelTransferi(pname, param, __functionAddress);
	}

	// --- [ glPixelTransferf ] ---

	/** JNI method for {@link #glPixelTransferf PixelTransferf} */
	@JavadocExclude
	public static native void nglPixelTransferf(int pname, float param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPixelTransferf.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glPixelTransferi PixelTransferi}.
	 *
	 * @param pname the pixel transfer parameter to set
	 * @param param the parameter value
	 */
	public static void glPixelTransferf(int pname, float param) {
		long __functionAddress = getInstance().PixelTransferf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPixelTransferf(pname, param, __functionAddress);
	}

	// --- [ glPixelZoom ] ---

	/** JNI method for {@link #glPixelZoom PixelZoom} */
	@JavadocExclude
	public static native void nglPixelZoom(float xfactor, float yfactor, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPixelZoom.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Controls the conversion of a group of fragments.
	 * 
	 * <p>Let (x<sub>rp</sub>, y<sub>rp</sub>) be the current raster position. If a particular group is the n<sup>th</sup> in a row and belongs to the
	 * m<sup>th</sup> row, consider the region in window coordinates bounded by the rectangle with corners</p>
	 * 
	 * <p>(x<sub>rp</sub> + z<sub>x</sub>n, y<sub>rp</sub> + z<sub>y</sub>m) and (x<sub>rp</sub> + z<sub>x</sub>(n + 1), y<sub>rp</sub> + z<sub>y</sub>(m + 1))</p>
	 * 
	 * <p>(either z<sub>x</sub> or z<sub>y</sub> may be negative). A fragment representing group {@code (n, m)} is produced for each framebuffer pixel inside, or
	 * on the bottom or left boundary, of this rectangle.</p>
	 *
	 * @param xfactor the z<sub>x</sub> factor
	 * @param yfactor the z<sub>y</sub> factor
	 */
	public static void glPixelZoom(float xfactor, float yfactor) {
		long __functionAddress = getInstance().PixelZoom;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPixelZoom(xfactor, yfactor, __functionAddress);
	}

	// --- [ glPointSize ] ---

	/** JNI method for {@link #glPointSize PointSize} */
	@JavadocExclude
	public static native void nglPointSize(float size, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPointSize.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Controls the rasterization of points if no vertex, tessellation control, tessellation evaluation, or geometry shader is active. The default point size is 1.0.
	 *
	 * @param size the request size of a point
	 */
	public static void glPointSize(float size) {
		long __functionAddress = getInstance().PointSize;
		nglPointSize(size, __functionAddress);
	}

	// --- [ glPolygonMode ] ---

	/** JNI method for {@link #glPolygonMode PolygonMode} */
	@JavadocExclude
	public static native void nglPolygonMode(int face, int mode, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPolygonMode.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Controls the interpretation of polygons for rasterization.
	 * 
	 * <p>{@link #GL_FILL FILL} is the default mode of polygon rasterization. Note that these modes affect only the final rasterization of polygons: in particular, a
	 * polygon's vertices are lit, and the polygon is clipped and possibly culled before these modes are applied. Polygon antialiasing applies only to the
	 * {@link #GL_FILL FILL} state of PolygonMode. For {@link #GL_POINT POINT} or {@link #GL_LINE LINE}, point antialiasing or line segment antialiasing, respectively, apply.</p>
	 *
	 * @param face the face for which to set the rasterizing method. One of:<br>{@link #GL_FRONT FRONT}, {@link #GL_BACK BACK}, {@link #GL_FRONT_AND_BACK FRONT_AND_BACK}
	 * @param mode the rasterization mode. One of:<br>{@link #GL_POINT POINT}, {@link #GL_LINE LINE}, {@link #GL_FILL FILL}
	 */
	public static void glPolygonMode(int face, int mode) {
		long __functionAddress = getInstance().PolygonMode;
		nglPolygonMode(face, mode, __functionAddress);
	}

	// --- [ glPolygonOffset ] ---

	/** JNI method for {@link #glPolygonOffset PolygonOffset} */
	@JavadocExclude
	public static native void nglPolygonOffset(float factor, float units, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPolygonOffset.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * The depth values of all fragments generated by the rasterization of a polygon may be offset by a single value that is computed for that polygon. This
	 * function determines that value.
	 * 
	 * <p>{@code factor} scales the maximum depth slope of the polygon, and {@code units} scales an implementation-dependent constant that relates to the usable
	 * resolution of the depth buffer. The resulting values are summed to produce the polygon offset value.</p>
	 *
	 * @param factor the maximum depth slope factor
	 * @param units  the constant scale
	 */
	public static void glPolygonOffset(float factor, float units) {
		long __functionAddress = getInstance().PolygonOffset;
		nglPolygonOffset(factor, units, __functionAddress);
	}

	// --- [ glPolygonStipple ] ---

	/** JNI method for {@link #glPolygonStipple PolygonStipple} */
	@JavadocExclude
	public static native void nglPolygonStipple(long pattern, long __functionAddress);

	/** Unsafe version of {@link #glPolygonStipple PolygonStipple} */
	@JavadocExclude
	public static void nglPolygonStipple(long pattern) {
		long __functionAddress = getInstance().PolygonStipple;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPolygonStipple(pattern, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPolygonStipple.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Defines a polygon stipple. It works much the same way as {@link #glLineStipple LineStipple}, masking out certain fragments produced by rasterization so that they
	 * are not sent to the next stage of the GL. This is the case regardless of the state of polygon antialiasing.
	 * 
	 * <p>If x<sub>w</sub> and y<sub>w</sub> are the window coordinates of a rasterized polygon fragment, then that fragment is sent to the next stage of the GL
	 * if and only if the bit of the pattern (x<sub>w</sub> mod 32, y<sub>w</sub> mod 32) is 1.</p>
	 * 
	 * <p>Polygon stippling may be enabled or disabled with {@link #glEnable Enable} or {@link #glDisable Disable} using the constant {@link #GL_POLYGON_STIPPLE POLYGON_STIPPLE}. When disabled,
	 * it is as if the stipple pattern were all ones.</p>
	 *
	 * @param pattern a pointer to memory into which a 32 &times; 32 pattern is packed
	 */
	public static void glPolygonStipple(ByteBuffer pattern) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglPolygonStipple(memAddress(pattern));
	}

	/** Buffer object offset version of: {@link #glPolygonStipple PolygonStipple} */
	public static void glPolygonStipple(long patternOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglPolygonStipple(patternOffset);
	}

	// --- [ glPushAttrib ] ---

	/** JNI method for {@link #glPushAttrib PushAttrib} */
	@JavadocExclude
	public static native void nglPushAttrib(int mask, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPushAttrib.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Takes a bitwise OR of symbolic constants indicating which groups of state variables to push onto the server attribute stack. Each constant refers to a
	 * group of state variables.
	 * 
	 * <p>Bits set in mask that do not correspond to an attribute group are ignored. The special mask value {@link #GL_ALL_ATTRIB_BITS ALL_ATTRIB_BITS} may be used to push all
	 * stackable server state.</p>
	 * 
	 * <p>A {@link #GL_STACK_OVERFLOW STACK_OVERFLOW} error is generated if {@code PushAttrib} is called and the attribute stack depth is equal to the value of
	 * {@link #GL_MAX_ATTRIB_STACK_DEPTH MAX_ATTRIB_STACK_DEPTH}.</p>
	 *
	 * @param mask the state variables to push. One or more of:<br>{@link #GL_ACCUM_BUFFER_BIT ACCUM_BUFFER_BIT}, {@link #GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}, {@link #GL_CURRENT_BIT CURRENT_BIT}, {@link #GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}, {@link #GL_ENABLE_BIT ENABLE_BIT}, {@link #GL_EVAL_BIT EVAL_BIT}, {@link #GL_FOG_BIT FOG_BIT}, {@link #GL_HINT_BIT HINT_BIT}, {@link #GL_LIGHTING_BIT LIGHTING_BIT}, {@link #GL_LINE_BIT LINE_BIT}, {@link #GL_LIST_BIT LIST_BIT}, {@link GL13#GL_MULTISAMPLE_BIT MULTISAMPLE_BIT}, {@link #GL_PIXEL_MODE_BIT PIXEL_MODE_BIT}, {@link #GL_POINT_BIT POINT_BIT}, {@link #GL_POLYGON_BIT POLYGON_BIT}, {@link #GL_POLYGON_STIPPLE_BIT POLYGON_STIPPLE_BIT}, {@link #GL_SCISSOR_BIT SCISSOR_BIT}, {@link #GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}, {@link #GL_TEXTURE_BIT TEXTURE_BIT}, {@link #GL_TRANSFORM_BIT TRANSFORM_BIT}, {@link #GL_VIEWPORT_BIT VIEWPORT_BIT}, {@link #GL_ALL_ATTRIB_BITS ALL_ATTRIB_BITS}
	 */
	public static void glPushAttrib(int mask) {
		long __functionAddress = getInstance().PushAttrib;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPushAttrib(mask, __functionAddress);
	}

	// --- [ glPushClientAttrib ] ---

	/** JNI method for {@link #glPushClientAttrib PushClientAttrib} */
	@JavadocExclude
	public static native void nglPushClientAttrib(int mask, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPushClientAttrib.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Takes a bitwise OR of symbolic constants indicating which groups of state variables to push onto the client attribute stack. Each constant refers to a
	 * group of state variables.
	 * 
	 * <p>Bits set in mask that do not correspond to an attribute group are ignored. The special mask value {@link #GL_CLIENT_ALL_ATTRIB_BITS CLIENT_ALL_ATTRIB_BITS} may be used to push
	 * all stackable client state.</p>
	 * 
	 * <p>A {@link #GL_STACK_OVERFLOW STACK_OVERFLOW} error is generated if {@code PushAttrib} is called and the client attribute stack depth is equal to the value of
	 * {@link #GL_MAX_CLIENT_ATTRIB_STACK_DEPTH MAX_CLIENT_ATTRIB_STACK_DEPTH}.</p>
	 *
	 * @param mask the state variables to push. One or more of:<br>{@link #GL_CLIENT_VERTEX_ARRAY_BIT CLIENT_VERTEX_ARRAY_BIT}, {@link #GL_CLIENT_PIXEL_STORE_BIT CLIENT_PIXEL_STORE_BIT}, {@link #GL_CLIENT_ALL_ATTRIB_BITS CLIENT_ALL_ATTRIB_BITS}
	 */
	public static void glPushClientAttrib(int mask) {
		long __functionAddress = getInstance().PushClientAttrib;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPushClientAttrib(mask, __functionAddress);
	}

	// --- [ glPopAttrib ] ---

	/** JNI method for {@link #glPopAttrib PopAttrib} */
	@JavadocExclude
	public static native void nglPopAttrib(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPopAttrib.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
Resets the values of those state variables that were saved with the last {@link #glPushAttrib PushAttrib}. Those not saved remain unchanged.
	 */
	public static void glPopAttrib() {
		long __functionAddress = getInstance().PopAttrib;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPopAttrib(__functionAddress);
	}

	// --- [ glPopClientAttrib ] ---

	/** JNI method for {@link #glPopClientAttrib PopClientAttrib} */
	@JavadocExclude
	public static native void nglPopClientAttrib(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPopClientAttrib.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
Resets the values of those state variables that were saved with the last {@link #glPushClientAttrib PushClientAttrib}. Those not saved remain unchanged.
	 */
	public static void glPopClientAttrib() {
		long __functionAddress = getInstance().PopClientAttrib;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPopClientAttrib(__functionAddress);
	}

	// --- [ glPopMatrix ] ---

	/** JNI method for {@link #glPopMatrix PopMatrix} */
	@JavadocExclude
	public static native void nglPopMatrix(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPopMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
Pops the top entry off the current matrix stack, replacing the current matrix with the matrix that was the second entry in the stack.
	 */
	public static void glPopMatrix() {
		long __functionAddress = getInstance().PopMatrix;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPopMatrix(__functionAddress);
	}

	// --- [ glPopName ] ---

	/** JNI method for {@link #glPopName PopName} */
	@JavadocExclude
	public static native void nglPopName(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPopName.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
Pops one name off the top of the selection name stack.
	 */
	public static void glPopName() {
		long __functionAddress = getInstance().PopName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPopName(__functionAddress);
	}

	// --- [ glPrioritizeTextures ] ---

	/** JNI method for {@link #glPrioritizeTextures PrioritizeTextures} */
	@JavadocExclude
	public static native void nglPrioritizeTextures(int n, long textures, long priorities, long __functionAddress);

	/** Unsafe version of {@link #glPrioritizeTextures PrioritizeTextures} */
	@JavadocExclude
	public static void nglPrioritizeTextures(int n, long textures, long priorities) {
		long __functionAddress = getInstance().PrioritizeTextures;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPrioritizeTextures(n, textures, priorities, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPrioritizeTextures.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the priority of texture objects. Each priority value is clamped to the range [0, 1] before it is assigned. Zero indicates the lowest priority, with
	 * the least likelihood of being resident. One indicates the highest priority, with the greatest likelihood of being resident.
	 *
	 * @param n          the number of texture object priorities to set
	 * @param textures   an array of texture object names
	 * @param priorities an array of texture object priorities
	 */
	public static void glPrioritizeTextures(int n, ByteBuffer textures, ByteBuffer priorities) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(textures, n << 2);
			checkBuffer(priorities, n << 2);
		}
		nglPrioritizeTextures(n, memAddress(textures), memAddress(priorities));
	}

	/** Alternative version of: {@link #glPrioritizeTextures PrioritizeTextures} */
	public static void glPrioritizeTextures(IntBuffer textures, FloatBuffer priorities) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(priorities, textures.remaining());
		nglPrioritizeTextures(textures.remaining(), memAddress(textures), memAddress(priorities));
	}

	// --- [ glPushMatrix ] ---

	/** JNI method for {@link #glPushMatrix PushMatrix} */
	@JavadocExclude
	public static native void nglPushMatrix(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPushMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
Pushes the current matrix stack down by one, duplicating the current matrix in both the top of the stack and the entry below it.
	 */
	public static void glPushMatrix() {
		long __functionAddress = getInstance().PushMatrix;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPushMatrix(__functionAddress);
	}

	// --- [ glPushName ] ---

	/** JNI method for {@link #glPushName PushName} */
	@JavadocExclude
	public static native void nglPushName(int name, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glPushName.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Causes {@code name} to be pushed onto the selection name stack.
	 *
	 * @param name the name to push
	 */
	public static void glPushName(int name) {
		long __functionAddress = getInstance().PushName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPushName(name, __functionAddress);
	}

	// --- [ glRasterPos2i ] ---

	/** JNI method for {@link #glRasterPos2i RasterPos2i} */
	@JavadocExclude
	public static native void nglRasterPos2i(int x, int y, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the two-dimensional current raster position. {@code z} is implicitly set to 0 and {@code w} implicitly set to 1.
	 * 
	 * <p>The coordinates are treated as if they were specified in a Vertex command. If a vertex shader is active, this vertex shader is executed using the x, y,
	 * z, and w coordinates as the object coordinates of the vertex. Otherwise, the x, y, z, and w coordinates are transformed by the current model-view and
	 * projection matrices. These coordinates, along with current values, are used to generate primary and secondary colors and texture coordinates just as is
	 * done for a vertex. The colors and texture coordinates so produced replace the colors and texture coordinates stored in the current raster position's
	 * associated data.</p>
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 */
	public static void glRasterPos2i(int x, int y) {
		long __functionAddress = getInstance().RasterPos2i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos2i(x, y, __functionAddress);
	}

	// --- [ glRasterPos2s ] ---

	/** JNI method for {@link #glRasterPos2s RasterPos2s} */
	@JavadocExclude
	public static native void nglRasterPos2s(short x, short y, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glRasterPos2i RasterPos2i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 */
	public static void glRasterPos2s(short x, short y) {
		long __functionAddress = getInstance().RasterPos2s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos2s(x, y, __functionAddress);
	}

	// --- [ glRasterPos2f ] ---

	/** JNI method for {@link #glRasterPos2f RasterPos2f} */
	@JavadocExclude
	public static native void nglRasterPos2f(float x, float y, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glRasterPos2i RasterPos2i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 */
	public static void glRasterPos2f(float x, float y) {
		long __functionAddress = getInstance().RasterPos2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos2f(x, y, __functionAddress);
	}

	// --- [ glRasterPos2d ] ---

	/** JNI method for {@link #glRasterPos2d RasterPos2d} */
	@JavadocExclude
	public static native void nglRasterPos2d(double x, double y, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glRasterPos2i RasterPos2i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 */
	public static void glRasterPos2d(double x, double y) {
		long __functionAddress = getInstance().RasterPos2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos2d(x, y, __functionAddress);
	}

	// --- [ glRasterPos2iv ] ---

	/** JNI method for {@link #glRasterPos2iv RasterPos2iv} */
	@JavadocExclude
	public static native void nglRasterPos2iv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glRasterPos2iv RasterPos2iv} */
	@JavadocExclude
	public static void nglRasterPos2iv(long coords) {
		long __functionAddress = getInstance().RasterPos2iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos2iv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos2i RasterPos2i}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos2iv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2 << 2);
		nglRasterPos2iv(memAddress(coords));
	}

	/** Alternative version of: {@link #glRasterPos2iv RasterPos2iv} */
	public static void glRasterPos2iv(IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2);
		nglRasterPos2iv(memAddress(coords));
	}

	// --- [ glRasterPos2sv ] ---

	/** JNI method for {@link #glRasterPos2sv RasterPos2sv} */
	@JavadocExclude
	public static native void nglRasterPos2sv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glRasterPos2sv RasterPos2sv} */
	@JavadocExclude
	public static void nglRasterPos2sv(long coords) {
		long __functionAddress = getInstance().RasterPos2sv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos2sv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos2s RasterPos2s}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos2sv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2 << 1);
		nglRasterPos2sv(memAddress(coords));
	}

	/** Alternative version of: {@link #glRasterPos2sv RasterPos2sv} */
	public static void glRasterPos2sv(ShortBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2);
		nglRasterPos2sv(memAddress(coords));
	}

	// --- [ glRasterPos2fv ] ---

	/** JNI method for {@link #glRasterPos2fv RasterPos2fv} */
	@JavadocExclude
	public static native void nglRasterPos2fv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glRasterPos2fv RasterPos2fv} */
	@JavadocExclude
	public static void nglRasterPos2fv(long coords) {
		long __functionAddress = getInstance().RasterPos2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos2fv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos2f RasterPos2f}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos2fv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2 << 2);
		nglRasterPos2fv(memAddress(coords));
	}

	/** Alternative version of: {@link #glRasterPos2fv RasterPos2fv} */
	public static void glRasterPos2fv(FloatBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2);
		nglRasterPos2fv(memAddress(coords));
	}

	// --- [ glRasterPos2dv ] ---

	/** JNI method for {@link #glRasterPos2dv RasterPos2dv} */
	@JavadocExclude
	public static native void nglRasterPos2dv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glRasterPos2dv RasterPos2dv} */
	@JavadocExclude
	public static void nglRasterPos2dv(long coords) {
		long __functionAddress = getInstance().RasterPos2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos2dv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos2d RasterPos2d}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos2dv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2 << 3);
		nglRasterPos2dv(memAddress(coords));
	}

	/** Alternative version of: {@link #glRasterPos2dv RasterPos2dv} */
	public static void glRasterPos2dv(DoubleBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2);
		nglRasterPos2dv(memAddress(coords));
	}

	// --- [ glRasterPos3i ] ---

	/** JNI method for {@link #glRasterPos3i RasterPos3i} */
	@JavadocExclude
	public static native void nglRasterPos3i(int x, int y, int z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the three-dimensional current raster position. {@code w} is implicitly set to 1. See {@link #glRasterPos2i RasterPos2i} for more details.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 */
	public static void glRasterPos3i(int x, int y, int z) {
		long __functionAddress = getInstance().RasterPos3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos3i(x, y, z, __functionAddress);
	}

	// --- [ glRasterPos3s ] ---

	/** JNI method for {@link #glRasterPos3s RasterPos3s} */
	@JavadocExclude
	public static native void nglRasterPos3s(short x, short y, short z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glRasterPos3i RasterPos3i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 */
	public static void glRasterPos3s(short x, short y, short z) {
		long __functionAddress = getInstance().RasterPos3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos3s(x, y, z, __functionAddress);
	}

	// --- [ glRasterPos3f ] ---

	/** JNI method for {@link #glRasterPos3f RasterPos3f} */
	@JavadocExclude
	public static native void nglRasterPos3f(float x, float y, float z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glRasterPos3i RasterPos3i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 */
	public static void glRasterPos3f(float x, float y, float z) {
		long __functionAddress = getInstance().RasterPos3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos3f(x, y, z, __functionAddress);
	}

	// --- [ glRasterPos3d ] ---

	/** JNI method for {@link #glRasterPos3d RasterPos3d} */
	@JavadocExclude
	public static native void nglRasterPos3d(double x, double y, double z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glRasterPos3i RasterPos3i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 */
	public static void glRasterPos3d(double x, double y, double z) {
		long __functionAddress = getInstance().RasterPos3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos3d(x, y, z, __functionAddress);
	}

	// --- [ glRasterPos3iv ] ---

	/** JNI method for {@link #glRasterPos3iv RasterPos3iv} */
	@JavadocExclude
	public static native void nglRasterPos3iv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glRasterPos3iv RasterPos3iv} */
	@JavadocExclude
	public static void nglRasterPos3iv(long coords) {
		long __functionAddress = getInstance().RasterPos3iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos3iv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos3i RasterPos3i}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos3iv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3 << 2);
		nglRasterPos3iv(memAddress(coords));
	}

	/** Alternative version of: {@link #glRasterPos3iv RasterPos3iv} */
	public static void glRasterPos3iv(IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3);
		nglRasterPos3iv(memAddress(coords));
	}

	// --- [ glRasterPos3sv ] ---

	/** JNI method for {@link #glRasterPos3sv RasterPos3sv} */
	@JavadocExclude
	public static native void nglRasterPos3sv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glRasterPos3sv RasterPos3sv} */
	@JavadocExclude
	public static void nglRasterPos3sv(long coords) {
		long __functionAddress = getInstance().RasterPos3sv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos3sv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos3s RasterPos3s}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos3sv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3 << 1);
		nglRasterPos3sv(memAddress(coords));
	}

	/** Alternative version of: {@link #glRasterPos3sv RasterPos3sv} */
	public static void glRasterPos3sv(ShortBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3);
		nglRasterPos3sv(memAddress(coords));
	}

	// --- [ glRasterPos3fv ] ---

	/** JNI method for {@link #glRasterPos3fv RasterPos3fv} */
	@JavadocExclude
	public static native void nglRasterPos3fv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glRasterPos3fv RasterPos3fv} */
	@JavadocExclude
	public static void nglRasterPos3fv(long coords) {
		long __functionAddress = getInstance().RasterPos3fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos3fv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos3f RasterPos3f}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos3fv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3 << 2);
		nglRasterPos3fv(memAddress(coords));
	}

	/** Alternative version of: {@link #glRasterPos3fv RasterPos3fv} */
	public static void glRasterPos3fv(FloatBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3);
		nglRasterPos3fv(memAddress(coords));
	}

	// --- [ glRasterPos3dv ] ---

	/** JNI method for {@link #glRasterPos3dv RasterPos3dv} */
	@JavadocExclude
	public static native void nglRasterPos3dv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glRasterPos3dv RasterPos3dv} */
	@JavadocExclude
	public static void nglRasterPos3dv(long coords) {
		long __functionAddress = getInstance().RasterPos3dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos3dv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos3d RasterPos3d}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos3dv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3 << 3);
		nglRasterPos3dv(memAddress(coords));
	}

	/** Alternative version of: {@link #glRasterPos3dv RasterPos3dv} */
	public static void glRasterPos3dv(DoubleBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3);
		nglRasterPos3dv(memAddress(coords));
	}

	// --- [ glRasterPos4i ] ---

	/** JNI method for {@link #glRasterPos4i RasterPos4i} */
	@JavadocExclude
	public static native void nglRasterPos4i(int x, int y, int z, int w, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the four-dimensional current raster position. See {@link #glRasterPos2i RasterPos2i} for more details.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 * @param w the {@code w} raster coordinate
	 */
	public static void glRasterPos4i(int x, int y, int z, int w) {
		long __functionAddress = getInstance().RasterPos4i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos4i(x, y, z, w, __functionAddress);
	}

	// --- [ glRasterPos4s ] ---

	/** JNI method for {@link #glRasterPos4s RasterPos4s} */
	@JavadocExclude
	public static native void nglRasterPos4s(short x, short y, short z, short w, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glRasterPos4i RasterPos4i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 * @param w the {@code w} raster coordinate
	 */
	public static void glRasterPos4s(short x, short y, short z, short w) {
		long __functionAddress = getInstance().RasterPos4s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos4s(x, y, z, w, __functionAddress);
	}

	// --- [ glRasterPos4f ] ---

	/** JNI method for {@link #glRasterPos4f RasterPos4f} */
	@JavadocExclude
	public static native void nglRasterPos4f(float x, float y, float z, float w, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of RasterPos4i.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 * @param w the {@code w} raster coordinate
	 */
	public static void glRasterPos4f(float x, float y, float z, float w) {
		long __functionAddress = getInstance().RasterPos4f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos4f(x, y, z, w, __functionAddress);
	}

	// --- [ glRasterPos4d ] ---

	/** JNI method for {@link #glRasterPos4d RasterPos4d} */
	@JavadocExclude
	public static native void nglRasterPos4d(double x, double y, double z, double w, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glRasterPos4i RasterPos4i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 * @param w the {@code w} raster coordinate
	 */
	public static void glRasterPos4d(double x, double y, double z, double w) {
		long __functionAddress = getInstance().RasterPos4d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos4d(x, y, z, w, __functionAddress);
	}

	// --- [ glRasterPos4iv ] ---

	/** JNI method for {@link #glRasterPos4iv RasterPos4iv} */
	@JavadocExclude
	public static native void nglRasterPos4iv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glRasterPos4iv RasterPos4iv} */
	@JavadocExclude
	public static void nglRasterPos4iv(long coords) {
		long __functionAddress = getInstance().RasterPos4iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos4iv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos4i RasterPos4i}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos4iv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4 << 2);
		nglRasterPos4iv(memAddress(coords));
	}

	/** Alternative version of: {@link #glRasterPos4iv RasterPos4iv} */
	public static void glRasterPos4iv(IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4);
		nglRasterPos4iv(memAddress(coords));
	}

	// --- [ glRasterPos4sv ] ---

	/** JNI method for {@link #glRasterPos4sv RasterPos4sv} */
	@JavadocExclude
	public static native void nglRasterPos4sv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glRasterPos4sv RasterPos4sv} */
	@JavadocExclude
	public static void nglRasterPos4sv(long coords) {
		long __functionAddress = getInstance().RasterPos4sv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos4sv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos4s RasterPos4s}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos4sv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4 << 1);
		nglRasterPos4sv(memAddress(coords));
	}

	/** Alternative version of: {@link #glRasterPos4sv RasterPos4sv} */
	public static void glRasterPos4sv(ShortBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4);
		nglRasterPos4sv(memAddress(coords));
	}

	// --- [ glRasterPos4fv ] ---

	/** JNI method for {@link #glRasterPos4fv RasterPos4fv} */
	@JavadocExclude
	public static native void nglRasterPos4fv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glRasterPos4fv RasterPos4fv} */
	@JavadocExclude
	public static void nglRasterPos4fv(long coords) {
		long __functionAddress = getInstance().RasterPos4fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos4fv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos4f RasterPos4f}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos4fv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4 << 2);
		nglRasterPos4fv(memAddress(coords));
	}

	/** Alternative version of: {@link #glRasterPos4fv RasterPos4fv} */
	public static void glRasterPos4fv(FloatBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4);
		nglRasterPos4fv(memAddress(coords));
	}

	// --- [ glRasterPos4dv ] ---

	/** JNI method for {@link #glRasterPos4dv RasterPos4dv} */
	@JavadocExclude
	public static native void nglRasterPos4dv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glRasterPos4dv RasterPos4dv} */
	@JavadocExclude
	public static void nglRasterPos4dv(long coords) {
		long __functionAddress = getInstance().RasterPos4dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos4dv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos4d RasterPos4d}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos4dv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4 << 3);
		nglRasterPos4dv(memAddress(coords));
	}

	/** Alternative version of: {@link #glRasterPos4dv RasterPos4dv} */
	public static void glRasterPos4dv(DoubleBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4);
		nglRasterPos4dv(memAddress(coords));
	}

	// --- [ glReadBuffer ] ---

	/** JNI method for {@link #glReadBuffer ReadBuffer} */
	@JavadocExclude
	public static native void nglReadBuffer(int src, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glReadBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Defines the color buffer from which values are obtained.
	 * 
	 * <p>Acceptable values for {@code src} depend on whether the GL is using the default framebuffer (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is zero), or
	 * a framebuffer object (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is non-zero). In the initial state, the GL is bound to the default framebuffer.</p>
	 *
	 * @param src the color buffer to read from. One of:<br>{@link #GL_NONE NONE}, {@link #GL_FRONT_LEFT FRONT_LEFT}, {@link #GL_FRONT_RIGHT FRONT_RIGHT}, {@link #GL_BACK_LEFT BACK_LEFT}, {@link #GL_BACK_RIGHT BACK_RIGHT}, {@link #GL_FRONT FRONT}, {@link #GL_BACK BACK}, {@link #GL_LEFT LEFT}, {@link #GL_RIGHT RIGHT}, {@link #GL_FRONT_AND_BACK FRONT_AND_BACK}, {@link #GL_AUX0 AUX0}, {@link #GL_AUX1 AUX1}, {@link #GL_AUX2 AUX2}, {@link #GL_AUX3 AUX3}, {@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, GL30.GL_COLOR_ATTACHMENT[1-15]
	 */
	public static void glReadBuffer(int src) {
		long __functionAddress = getInstance().ReadBuffer;
		nglReadBuffer(src, __functionAddress);
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glReadPixels.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ReadPixels obtains values from the selected read buffer from each pixel with lower left hand corner at {@code (x + i, y + j)} for {@code 0 <= i < width}
	 * and {@code 0 <= j < height}; this pixel is said to be the i<sup>th</sup> pixel in the j<sup>th</sup> row. If any of these pixels lies outside of the
	 * window allocated to the current GL context, or outside of the image attached to the currently bound read framebuffer object, then the values obtained
	 * for those pixels are undefined. When {@link GL30#GL_READ_FRAMEBUFFER_BINDING READ_FRAMEBUFFER_BINDING} is zero, values are also undefined for individual pixels that are not owned by
	 * the current context. Otherwise, {@code ReadPixels} obtains values from the selected buffer, regardless of how those values were placed there.
	 *
	 * @param x      the left pixel coordinate
	 * @param y      the lower pixel coordinate
	 * @param width  the number of pixels to read in the x-dimension
	 * @param height the number of pixels to read in the y-dimension
	 * @param format the pixel format. One of:<br>{@link #GL_STENCIL_INDEX STENCIL_INDEX}, {@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link #GL_RED RED}, {@link #GL_GREEN GREEN}, {@link #GL_BLUE BLUE}, {@link #GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link #GL_RGB RGB}, {@link #GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link #GL_LUMINANCE LUMINANCE}, {@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type   the pixel type. One of:<br>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_BYTE BYTE}, {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_SHORT SHORT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}, {@link #GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link #GL_BITMAP BITMAP}
	 * @param pixels a buffer in which to place the returned pixel data
	 */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glReadPixels ReadPixels} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglReadPixels(x, y, width, height, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glReadPixels ReadPixels} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glReadPixels ReadPixels} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glReadPixels ReadPixels} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	// --- [ glRecti ] ---

	/** JNI method for {@link #glRecti Recti} */
	@JavadocExclude
	public static native void nglRecti(int x1, int y1, int x2, int y2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRecti.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies a rectangle as two corner vertices. The effect of the Rect command
	 * 
	 * <p>{@code Rect(x1, y1, x2, y2);}</p>
	 * 
	 * <p>is exactly the same as the following sequence of commands:
	 * {@code
	 * Begin(POLYGON);
	 * Vertex2(x1, y1);
	 * Vertex2(x2, y1);
	 * Vertex2(x2, y2);
	 * Vertex2(x1, y2);
	 * End();}</p>
	 * 
	 * <p>The appropriate Vertex2 command would be invoked depending on which of the Rect commands is issued.</p>
	 *
	 * @param x1 the x coordinate of the first corner vertex
	 * @param y1 the y coordinate of the first corner vertex
	 * @param x2 the x coordinate of the second corner vertex
	 * @param y2 the y coordinate of the second corner vertex
	 */
	public static void glRecti(int x1, int y1, int x2, int y2) {
		long __functionAddress = getInstance().Recti;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRecti(x1, y1, x2, y2, __functionAddress);
	}

	// --- [ glRects ] ---

	/** JNI method for {@link #glRects Rects} */
	@JavadocExclude
	public static native void nglRects(short x1, short y1, short x2, short y2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRects.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glRecti Recti}.
	 *
	 * @param x1 the x coordinate of the first corner vertex
	 * @param y1 the y coordinate of the first corner vertex
	 * @param x2 the x coordinate of the second corner vertex
	 * @param y2 the y coordinate of the second corner vertex
	 */
	public static void glRects(short x1, short y1, short x2, short y2) {
		long __functionAddress = getInstance().Rects;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRects(x1, y1, x2, y2, __functionAddress);
	}

	// --- [ glRectf ] ---

	/** JNI method for {@link #glRectf Rectf} */
	@JavadocExclude
	public static native void nglRectf(float x1, float y1, float x2, float y2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRectf.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glRecti Recti}.
	 *
	 * @param x1 the x coordinate of the first corner vertex
	 * @param y1 the y coordinate of the first corner vertex
	 * @param x2 the x coordinate of the second corner vertex
	 * @param y2 the y coordinate of the second corner vertex
	 */
	public static void glRectf(float x1, float y1, float x2, float y2) {
		long __functionAddress = getInstance().Rectf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRectf(x1, y1, x2, y2, __functionAddress);
	}

	// --- [ glRectd ] ---

	/** JNI method for {@link #glRectd Rectd} */
	@JavadocExclude
	public static native void nglRectd(double x1, double y1, double x2, double y2, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRectd.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glRecti Recti}.
	 *
	 * @param x1 the x coordinate of the first corner vertex
	 * @param y1 the y coordinate of the first corner vertex
	 * @param x2 the x coordinate of the second corner vertex
	 * @param y2 the y coordinate of the second corner vertex
	 */
	public static void glRectd(double x1, double y1, double x2, double y2) {
		long __functionAddress = getInstance().Rectd;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRectd(x1, y1, x2, y2, __functionAddress);
	}

	// --- [ glRectiv ] ---

	/** JNI method for {@link #glRectiv Rectiv} */
	@JavadocExclude
	public static native void nglRectiv(long v1, long v2, long __functionAddress);

	/** Unsafe version of {@link #glRectiv Rectiv} */
	@JavadocExclude
	public static void nglRectiv(long v1, long v2) {
		long __functionAddress = getInstance().Rectiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRectiv(v1, v2, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRect.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRecti Recti}.
	 *
	 * @param v1 the first vertex buffer
	 * @param v2 the second vertex buffer
	 */
	public static void glRectiv(ByteBuffer v1, ByteBuffer v2) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(v1, 2 << 2);
			checkBuffer(v2, 2 << 2);
		}
		nglRectiv(memAddress(v1), memAddress(v2));
	}

	/** Alternative version of: {@link #glRectiv Rectiv} */
	public static void glRectiv(IntBuffer v1, IntBuffer v2) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(v1, 2);
			checkBuffer(v2, 2);
		}
		nglRectiv(memAddress(v1), memAddress(v2));
	}

	// --- [ glRectsv ] ---

	/** JNI method for {@link #glRectsv Rectsv} */
	@JavadocExclude
	public static native void nglRectsv(long v1, long v2, long __functionAddress);

	/** Unsafe version of {@link #glRectsv Rectsv} */
	@JavadocExclude
	public static void nglRectsv(long v1, long v2) {
		long __functionAddress = getInstance().Rectsv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRectsv(v1, v2, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRect.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRects Rects}.
	 *
	 * @param v1 the first vertex buffer
	 * @param v2 the second vertex buffer
	 */
	public static void glRectsv(ByteBuffer v1, ByteBuffer v2) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(v1, 2 << 1);
			checkBuffer(v2, 2 << 1);
		}
		nglRectsv(memAddress(v1), memAddress(v2));
	}

	/** Alternative version of: {@link #glRectsv Rectsv} */
	public static void glRectsv(ShortBuffer v1, ShortBuffer v2) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(v1, 2);
			checkBuffer(v2, 2);
		}
		nglRectsv(memAddress(v1), memAddress(v2));
	}

	// --- [ glRectfv ] ---

	/** JNI method for {@link #glRectfv Rectfv} */
	@JavadocExclude
	public static native void nglRectfv(long v1, long v2, long __functionAddress);

	/** Unsafe version of {@link #glRectfv Rectfv} */
	@JavadocExclude
	public static void nglRectfv(long v1, long v2) {
		long __functionAddress = getInstance().Rectfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRectfv(v1, v2, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRect.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRectf Rectf}.
	 *
	 * @param v1 the first vertex buffer
	 * @param v2 the second vertex buffer
	 */
	public static void glRectfv(ByteBuffer v1, ByteBuffer v2) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(v1, 2 << 2);
			checkBuffer(v2, 2 << 2);
		}
		nglRectfv(memAddress(v1), memAddress(v2));
	}

	/** Alternative version of: {@link #glRectfv Rectfv} */
	public static void glRectfv(FloatBuffer v1, FloatBuffer v2) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(v1, 2);
			checkBuffer(v2, 2);
		}
		nglRectfv(memAddress(v1), memAddress(v2));
	}

	// --- [ glRectdv ] ---

	/** JNI method for {@link #glRectdv Rectdv} */
	@JavadocExclude
	public static native void nglRectdv(long v1, long v2, long __functionAddress);

	/** Unsafe version of {@link #glRectdv Rectdv} */
	@JavadocExclude
	public static void nglRectdv(long v1, long v2) {
		long __functionAddress = getInstance().Rectdv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRectdv(v1, v2, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRect.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRectd Rectd}.
	 *
	 * @param v1 the first vertex buffer
	 * @param v2 the second vertex buffer
	 */
	public static void glRectdv(ByteBuffer v1, ByteBuffer v2) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(v1, 2 << 3);
			checkBuffer(v2, 2 << 3);
		}
		nglRectdv(memAddress(v1), memAddress(v2));
	}

	/** Alternative version of: {@link #glRectdv Rectdv} */
	public static void glRectdv(DoubleBuffer v1, DoubleBuffer v2) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(v1, 2);
			checkBuffer(v2, 2);
		}
		nglRectdv(memAddress(v1), memAddress(v2));
	}

	// --- [ glRenderMode ] ---

	/** JNI method for {@link #glRenderMode RenderMode} */
	@JavadocExclude
	public static native int nglRenderMode(int mode, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRenderMode.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current render mode. The default is {@link #GL_RENDER RENDER}.
	 *
	 * @param mode the render mode. One of:<br>{@link #GL_RENDER RENDER}, {@link #GL_SELECT SELECT}, {@link #GL_FEEDBACK FEEDBACK}
	 */
	public static int glRenderMode(int mode) {
		long __functionAddress = getInstance().RenderMode;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglRenderMode(mode, __functionAddress);
	}

	// --- [ glRotatef ] ---

	/** JNI method for {@link #glRotatef Rotatef} */
	@JavadocExclude
	public static native void nglRotatef(float angle, float x, float y, float z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRotatef.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Manipulates the current matrix with a rotation matrix.
	 * 
	 * <p>{@code angle} gives an angle of rotation in degrees; the coordinates of a vector v are given by <code style="font-family: monospace">v = (x y z)<sup>T</sup></code>. The computed matrix
	 * is a counter-clockwise rotation about the line through the origin with the specified axis when that axis is pointing up (i.e. the right-hand rule
	 * determines the sense of the rotation angle). The matrix is thus
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr><td colspan=3 rowspan=3><b>R</b></td><td>0</td></tr>
	 * <tr><td>0</td></tr>
	 * <tr><td>0</td></tr>
	 * <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table></p>
	 * 
	 * <p>Let <code>u = v / ||v|| = (x' y' z')<sup>T</sup></code>. If <b>S</b> =
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr><td>0</td><td>-z'</td><td>y'</td></tr>
	 * <tr><td>z'</td><td>0</td><td>-x'</td></tr>
	 * <tr><td>-y'</td><td>x'</td><td>0</td></tr>
	 * </table></p>
	 * 
	 * <p>then <code style="font-family: monospace"><b>R</b> = uu<sup>T</sup> + cos(angle)(I - uu<sup>T</sup>) + sin(angle)<b>S</b></code></p>
	 *
	 * @param angle the angle of rotation in degrees
	 * @param x     the x coordinate of the rotation vector
	 * @param y     the y coordinate of the rotation vector
	 * @param z     the z coordinate of the rotation vector
	 */
	public static void glRotatef(float angle, float x, float y, float z) {
		long __functionAddress = getInstance().Rotatef;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRotatef(angle, x, y, z, __functionAddress);
	}

	// --- [ glRotated ] ---

	/** JNI method for {@link #glRotated Rotated} */
	@JavadocExclude
	public static native void nglRotated(double angle, double x, double y, double z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glRotated.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glRotatef Rotatef}.
	 *
	 * @param angle the angle of rotation in degrees
	 * @param x     the x coordinate of the rotation vector
	 * @param y     the y coordinate of the rotation vector
	 * @param z     the z coordinate of the rotation vector
	 */
	public static void glRotated(double angle, double x, double y, double z) {
		long __functionAddress = getInstance().Rotated;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRotated(angle, x, y, z, __functionAddress);
	}

	// --- [ glScalef ] ---

	/** JNI method for {@link #glScalef Scalef} */
	@JavadocExclude
	public static native void nglScalef(float x, float y, float z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glScalef.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Manipulates the current matrix with a general scaling matrix along the x-, y- and z- axes.
	 * 
	 * <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr><td>x</td><td>0</td><td>0</td><td>0</td></tr>
	 * <tr><td>0</td><td>y</td><td>0</td><td>0</td></tr>
	 * <tr><td>0</td><td>0</td><td>z</td><td>0</td></tr>
	 * <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table></p>
	 *
	 * @param x the x-axis scaling factor
	 * @param y the y-axis scaling factor
	 * @param z the z-axis scaling factor
	 */
	public static void glScalef(float x, float y, float z) {
		long __functionAddress = getInstance().Scalef;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglScalef(x, y, z, __functionAddress);
	}

	// --- [ glScaled ] ---

	/** JNI method for {@link #glScaled Scaled} */
	@JavadocExclude
	public static native void nglScaled(double x, double y, double z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glScaled.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glScalef Scalef}.
	 *
	 * @param x the x-axis scaling factor
	 * @param y the y-axis scaling factor
	 * @param z the z-axis scaling factor
	 */
	public static void glScaled(double x, double y, double z) {
		long __functionAddress = getInstance().Scaled;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglScaled(x, y, z, __functionAddress);
	}

	// --- [ glScissor ] ---

	/** JNI method for {@link #glScissor Scissor} */
	@JavadocExclude
	public static native void nglScissor(int x, int y, int width, int height, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glScissor.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Defines the scissor rectangle for all viewports. The scissor test is enabled or disabled for all viewports using {@link #glEnable Enable} or {@link #glDisable Disable}
	 * with the symbolic constant {@link #GL_SCISSOR_TEST SCISSOR_TEST}. When disabled, it is as if the scissor test always passes. When enabled, if
	 * <code style="font-family: monospace">left <= x<sub>w</sub> < left + width</code> and <code style="font-family: monospace">bottom <= y<sub>w</sub> < bottom + height</code> for the scissor rectangle, then the scissor
	 * test passes. Otherwise, the test fails and the fragment is discarded.
	 *
	 * @param x      the left scissor rectangle coordinate
	 * @param y      the bottom scissor rectangle coordinate
	 * @param width  the scissor rectangle width
	 * @param height the scissor rectangle height
	 */
	public static void glScissor(int x, int y, int width, int height) {
		long __functionAddress = getInstance().Scissor;
		nglScissor(x, y, width, height, __functionAddress);
	}

	// --- [ glSelectBuffer ] ---

	/** JNI method for {@link #glSelectBuffer SelectBuffer} */
	@JavadocExclude
	public static native void nglSelectBuffer(int size, long buffer, long __functionAddress);

	/** Unsafe version of {@link #glSelectBuffer SelectBuffer} */
	@JavadocExclude
	public static void nglSelectBuffer(int size, long buffer) {
		long __functionAddress = getInstance().SelectBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSelectBuffer(size, buffer, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSelectBuffer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the selection array.
	 *
	 * @param size   the maximum number of values that can be stored in {@code buffer}
	 * @param buffer an array of unsigned integers to be potentially filled names
	 */
	public static void glSelectBuffer(int size, ByteBuffer buffer) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffer, size << 2);
		nglSelectBuffer(size, memAddress(buffer));
	}

	/** Alternative version of: {@link #glSelectBuffer SelectBuffer} */
	public static void glSelectBuffer(IntBuffer buffer) {
		nglSelectBuffer(buffer.remaining(), memAddress(buffer));
	}

	// --- [ glShadeModel ] ---

	/** JNI method for {@link #glShadeModel ShadeModel} */
	@JavadocExclude
	public static native void nglShadeModel(int mode, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glShadeModel.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current shade mode. The initial value of the shade mode is {@link #GL_SMOOTH SMOOTH}.
	 * 
	 * <p>If mode is {@link #GL_SMOOTH SMOOTH}, vertex colors are treated individually. If mode is {@link #GL_FLAT FLAT}, flatshading is enabled and colors are taken from the
	 * provoking vertex of the primitive. The colors selected are those derived from current values, generated by lighting, or generated by vertex shading, if
	 * lighting is disabled, enabled, or a vertex shader is in use, respectively.</p>
	 *
	 * @param mode the shade mode. One of:<br>{@link #GL_SMOOTH SMOOTH}, {@link #GL_FLAT FLAT}
	 */
	public static void glShadeModel(int mode) {
		long __functionAddress = getInstance().ShadeModel;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglShadeModel(mode, __functionAddress);
	}

	// --- [ glStencilFunc ] ---

	/** JNI method for {@link #glStencilFunc StencilFunc} */
	@JavadocExclude
	public static native void nglStencilFunc(int func, int ref, int mask, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glStencilFunc.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Controls the stencil test.
	 * 
	 * <p>{@code ref} is an integer reference value that is used in the unsigned stencil comparison. Stencil comparison operations and queries of {@code ref}
	 * clamp its value to the range [0, 2<sup>s</sup> &ndash; 1], where s is the number of bits in the stencil buffer attached to the draw framebuffer. The s
	 * least significant bits of {@code mask} are bitwise ANDed with both the reference and the stored stencil value, and the resulting masked values are those that
	 * participate in the comparison controlled by {@code func}.</p>
	 *
	 * @param func the stencil comparison function. One of:<br>{@link #GL_NEVER NEVER}, {@link #GL_ALWAYS ALWAYS}, {@link #GL_LESS LESS}, {@link #GL_LEQUAL LEQUAL}, {@link #GL_EQUAL EQUAL}, {@link #GL_GEQUAL GEQUAL}, {@link #GL_GREATER GREATER}, {@link #GL_NOTEQUAL NOTEQUAL}
	 * @param ref  the reference value
	 * @param mask the stencil comparison mask
	 */
	public static void glStencilFunc(int func, int ref, int mask) {
		long __functionAddress = getInstance().StencilFunc;
		nglStencilFunc(func, ref, mask, __functionAddress);
	}

	// --- [ glStencilMask ] ---

	/** JNI method for {@link #glStencilMask StencilMask} */
	@JavadocExclude
	public static native void nglStencilMask(int mask, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glStencilMask.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Masks the writing of particular bits into the stencil plans.
	 * 
	 * <p>The least significant s bits of {@code mask}, where s is the number of bits in the stencil buffer, specify an integer mask. Where a 1 appears in this
	 * mask, the corresponding bit in the stencil buffer is written; where a 0 appears, the bit is not written.</p>
	 *
	 * @param mask the stencil mask
	 */
	public static void glStencilMask(int mask) {
		long __functionAddress = getInstance().StencilMask;
		nglStencilMask(mask, __functionAddress);
	}

	// --- [ glStencilOp ] ---

	/** JNI method for {@link #glStencilOp StencilOp} */
	@JavadocExclude
	public static native void nglStencilOp(int sfail, int dpfail, int dppass, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glStencilOp.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Indicates what happens to the stored stencil value if this or certain subsequent tests fail or pass.
	 * 
	 * <p>The supported actions are {@link #GL_KEEP KEEP}, {@link #GL_ZERO ZERO}, {@link #GL_REPLACE REPLACE}, {@link #GL_INCR INCR}, {@link #GL_DECR DECR}, {@link #GL_INVERT INVERT},
	 * {@link GL14#GL_INCR_WRAP INCR_WRAP} and {@link GL14#GL_DECR_WRAP DECR_WRAP}. These correspond to keeping the current value, setting to zero, replacing with the reference value,
	 * incrementing with saturation, decrementing with saturation, bitwise inverting it, incrementing without saturation, and decrementing without saturation.</p>
	 * 
	 * <p>For purposes of increment and decrement, the stencil bits are considered as an unsigned integer. Incrementing or decrementing with saturation clamps
	 * the stencil value at 0 and the maximum representable value. Incrementing or decrementing without saturation will wrap such that incrementing the maximum
	 * representable value results in 0, and decrementing 0 results in the maximum representable value.</p>
	 *
	 * @param sfail  the action to take if the stencil test fails
	 * @param dpfail the action to take if the depth buffer test fails
	 * @param dppass the action to take if the depth buffer test passes
	 */
	public static void glStencilOp(int sfail, int dpfail, int dppass) {
		long __functionAddress = getInstance().StencilOp;
		nglStencilOp(sfail, dpfail, dppass, __functionAddress);
	}

	// --- [ glTexCoord1f ] ---

	/** JNI method for {@link #glTexCoord1f TexCoord1f} */
	@JavadocExclude
	public static native void nglTexCoord1f(float s, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current one-dimensional texture coordinate. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.
	 *
	 * @param s the s component of the current texture coordinates
	 */
	public static void glTexCoord1f(float s) {
		long __functionAddress = getInstance().TexCoord1f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord1f(s, __functionAddress);
	}

	// --- [ glTexCoord1s ] ---

	/** JNI method for {@link #glTexCoord1s TexCoord1s} */
	@JavadocExclude
	public static native void nglTexCoord1s(short s, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glTexCoord1f TexCoord1f}.
	 *
	 * @param s the s component of the current texture coordinates
	 */
	public static void glTexCoord1s(short s) {
		long __functionAddress = getInstance().TexCoord1s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord1s(s, __functionAddress);
	}

	// --- [ glTexCoord1i ] ---

	/** JNI method for {@link #glTexCoord1i TexCoord1i} */
	@JavadocExclude
	public static native void nglTexCoord1i(int s, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glTexCoord1f TexCoord1f}.
	 *
	 * @param s the s component of the current texture coordinates
	 */
	public static void glTexCoord1i(int s) {
		long __functionAddress = getInstance().TexCoord1i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord1i(s, __functionAddress);
	}

	// --- [ glTexCoord1d ] ---

	/** JNI method for {@link #glTexCoord1d TexCoord1d} */
	@JavadocExclude
	public static native void nglTexCoord1d(double s, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glTexCoord1f TexCoord1f}.
	 *
	 * @param s the s component of the current texture coordinates
	 */
	public static void glTexCoord1d(double s) {
		long __functionAddress = getInstance().TexCoord1d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord1d(s, __functionAddress);
	}

	// --- [ glTexCoord1fv ] ---

	/** JNI method for {@link #glTexCoord1fv TexCoord1fv} */
	@JavadocExclude
	public static native void nglTexCoord1fv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord1fv TexCoord1fv} */
	@JavadocExclude
	public static void nglTexCoord1fv(long v) {
		long __functionAddress = getInstance().TexCoord1fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord1fv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord1f TexCoord1f}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord1fv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 2);
		nglTexCoord1fv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord1fv TexCoord1fv} */
	public static void glTexCoord1fv(FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglTexCoord1fv(memAddress(v));
	}

	// --- [ glTexCoord1sv ] ---

	/** JNI method for {@link #glTexCoord1sv TexCoord1sv} */
	@JavadocExclude
	public static native void nglTexCoord1sv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord1sv TexCoord1sv} */
	@JavadocExclude
	public static void nglTexCoord1sv(long v) {
		long __functionAddress = getInstance().TexCoord1sv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord1sv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord1s TexCoord1s}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord1sv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 1);
		nglTexCoord1sv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord1sv TexCoord1sv} */
	public static void glTexCoord1sv(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglTexCoord1sv(memAddress(v));
	}

	// --- [ glTexCoord1iv ] ---

	/** JNI method for {@link #glTexCoord1iv TexCoord1iv} */
	@JavadocExclude
	public static native void nglTexCoord1iv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord1iv TexCoord1iv} */
	@JavadocExclude
	public static void nglTexCoord1iv(long v) {
		long __functionAddress = getInstance().TexCoord1iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord1iv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord1i TexCoord1i}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord1iv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 2);
		nglTexCoord1iv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord1iv TexCoord1iv} */
	public static void glTexCoord1iv(IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglTexCoord1iv(memAddress(v));
	}

	// --- [ glTexCoord1dv ] ---

	/** JNI method for {@link #glTexCoord1dv TexCoord1dv} */
	@JavadocExclude
	public static native void nglTexCoord1dv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord1dv TexCoord1dv} */
	@JavadocExclude
	public static void nglTexCoord1dv(long v) {
		long __functionAddress = getInstance().TexCoord1dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord1dv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord1d TexCoord1d}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord1dv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 3);
		nglTexCoord1dv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord1dv TexCoord1dv} */
	public static void glTexCoord1dv(DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglTexCoord1dv(memAddress(v));
	}

	// --- [ glTexCoord2f ] ---

	/** JNI method for {@link #glTexCoord2f TexCoord2f} */
	@JavadocExclude
	public static native void nglTexCoord2f(float s, float t, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current two-dimensional texture coordinate. {@code r} is implicitly set to 0 and {@code q} to 1.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 */
	public static void glTexCoord2f(float s, float t) {
		long __functionAddress = getInstance().TexCoord2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord2f(s, t, __functionAddress);
	}

	// --- [ glTexCoord2s ] ---

	/** JNI method for {@link #glTexCoord2s TexCoord2s} */
	@JavadocExclude
	public static native void nglTexCoord2s(short s, short t, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glTexCoord2f TexCoord2f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 */
	public static void glTexCoord2s(short s, short t) {
		long __functionAddress = getInstance().TexCoord2s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord2s(s, t, __functionAddress);
	}

	// --- [ glTexCoord2i ] ---

	/** JNI method for {@link #glTexCoord2i TexCoord2i} */
	@JavadocExclude
	public static native void nglTexCoord2i(int s, int t, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glTexCoord2f TexCoord2f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 */
	public static void glTexCoord2i(int s, int t) {
		long __functionAddress = getInstance().TexCoord2i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord2i(s, t, __functionAddress);
	}

	// --- [ glTexCoord2d ] ---

	/** JNI method for {@link #glTexCoord2d TexCoord2d} */
	@JavadocExclude
	public static native void nglTexCoord2d(double s, double t, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glTexCoord2f TexCoord2f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 */
	public static void glTexCoord2d(double s, double t) {
		long __functionAddress = getInstance().TexCoord2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord2d(s, t, __functionAddress);
	}

	// --- [ glTexCoord2fv ] ---

	/** JNI method for {@link #glTexCoord2fv TexCoord2fv} */
	@JavadocExclude
	public static native void nglTexCoord2fv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord2fv TexCoord2fv} */
	@JavadocExclude
	public static void nglTexCoord2fv(long v) {
		long __functionAddress = getInstance().TexCoord2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord2fv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord2f TexCoord2f}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord2fv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 2);
		nglTexCoord2fv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord2fv TexCoord2fv} */
	public static void glTexCoord2fv(FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglTexCoord2fv(memAddress(v));
	}

	// --- [ glTexCoord2sv ] ---

	/** JNI method for {@link #glTexCoord2sv TexCoord2sv} */
	@JavadocExclude
	public static native void nglTexCoord2sv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord2sv TexCoord2sv} */
	@JavadocExclude
	public static void nglTexCoord2sv(long v) {
		long __functionAddress = getInstance().TexCoord2sv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord2sv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord2s TexCoord2s}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord2sv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 1);
		nglTexCoord2sv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord2sv TexCoord2sv} */
	public static void glTexCoord2sv(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglTexCoord2sv(memAddress(v));
	}

	// --- [ glTexCoord2iv ] ---

	/** JNI method for {@link #glTexCoord2iv TexCoord2iv} */
	@JavadocExclude
	public static native void nglTexCoord2iv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord2iv TexCoord2iv} */
	@JavadocExclude
	public static void nglTexCoord2iv(long v) {
		long __functionAddress = getInstance().TexCoord2iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord2iv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord2i TexCoord2i}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord2iv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 2);
		nglTexCoord2iv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord2iv TexCoord2iv} */
	public static void glTexCoord2iv(IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglTexCoord2iv(memAddress(v));
	}

	// --- [ glTexCoord2dv ] ---

	/** JNI method for {@link #glTexCoord2dv TexCoord2dv} */
	@JavadocExclude
	public static native void nglTexCoord2dv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord2dv TexCoord2dv} */
	@JavadocExclude
	public static void nglTexCoord2dv(long v) {
		long __functionAddress = getInstance().TexCoord2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord2dv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord2d TexCoord2d}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord2dv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 3);
		nglTexCoord2dv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord2dv TexCoord2dv} */
	public static void glTexCoord2dv(DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglTexCoord2dv(memAddress(v));
	}

	// --- [ glTexCoord3f ] ---

	/** JNI method for {@link #glTexCoord3f TexCoord3f} */
	@JavadocExclude
	public static native void nglTexCoord3f(float s, float t, float r, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current three-dimensional texture coordinate. {@code q} is implicitly set to 1.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 */
	public static void glTexCoord3f(float s, float t, float r) {
		long __functionAddress = getInstance().TexCoord3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord3f(s, t, r, __functionAddress);
	}

	// --- [ glTexCoord3s ] ---

	/** JNI method for {@link #glTexCoord3s TexCoord3s} */
	@JavadocExclude
	public static native void nglTexCoord3s(short s, short t, short r, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glTexCoord3f TexCoord3f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 */
	public static void glTexCoord3s(short s, short t, short r) {
		long __functionAddress = getInstance().TexCoord3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord3s(s, t, r, __functionAddress);
	}

	// --- [ glTexCoord3i ] ---

	/** JNI method for {@link #glTexCoord3i TexCoord3i} */
	@JavadocExclude
	public static native void nglTexCoord3i(int s, int t, int r, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glTexCoord3f TexCoord3f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 */
	public static void glTexCoord3i(int s, int t, int r) {
		long __functionAddress = getInstance().TexCoord3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord3i(s, t, r, __functionAddress);
	}

	// --- [ glTexCoord3d ] ---

	/** JNI method for {@link #glTexCoord3d TexCoord3d} */
	@JavadocExclude
	public static native void nglTexCoord3d(double s, double t, double r, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glTexCoord3f TexCoord3f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 */
	public static void glTexCoord3d(double s, double t, double r) {
		long __functionAddress = getInstance().TexCoord3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord3d(s, t, r, __functionAddress);
	}

	// --- [ glTexCoord3fv ] ---

	/** JNI method for {@link #glTexCoord3fv TexCoord3fv} */
	@JavadocExclude
	public static native void nglTexCoord3fv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord3fv TexCoord3fv} */
	@JavadocExclude
	public static void nglTexCoord3fv(long v) {
		long __functionAddress = getInstance().TexCoord3fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord3fv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord3f TexCoord3f}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord3fv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglTexCoord3fv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord3fv TexCoord3fv} */
	public static void glTexCoord3fv(FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglTexCoord3fv(memAddress(v));
	}

	// --- [ glTexCoord3sv ] ---

	/** JNI method for {@link #glTexCoord3sv TexCoord3sv} */
	@JavadocExclude
	public static native void nglTexCoord3sv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord3sv TexCoord3sv} */
	@JavadocExclude
	public static void nglTexCoord3sv(long v) {
		long __functionAddress = getInstance().TexCoord3sv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord3sv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord3s TexCoord3s}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord3sv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglTexCoord3sv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord3sv TexCoord3sv} */
	public static void glTexCoord3sv(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglTexCoord3sv(memAddress(v));
	}

	// --- [ glTexCoord3iv ] ---

	/** JNI method for {@link #glTexCoord3iv TexCoord3iv} */
	@JavadocExclude
	public static native void nglTexCoord3iv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord3iv TexCoord3iv} */
	@JavadocExclude
	public static void nglTexCoord3iv(long v) {
		long __functionAddress = getInstance().TexCoord3iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord3iv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord3i TexCoord3i}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord3iv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglTexCoord3iv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord3iv TexCoord3iv} */
	public static void glTexCoord3iv(IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglTexCoord3iv(memAddress(v));
	}

	// --- [ glTexCoord3dv ] ---

	/** JNI method for {@link #glTexCoord3dv TexCoord3dv} */
	@JavadocExclude
	public static native void nglTexCoord3dv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord3dv TexCoord3dv} */
	@JavadocExclude
	public static void nglTexCoord3dv(long v) {
		long __functionAddress = getInstance().TexCoord3dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord3dv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord3d TexCoord3d}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord3dv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 3);
		nglTexCoord3dv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord3dv TexCoord3dv} */
	public static void glTexCoord3dv(DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglTexCoord3dv(memAddress(v));
	}

	// --- [ glTexCoord4f ] ---

	/** JNI method for {@link #glTexCoord4f TexCoord4f} */
	@JavadocExclude
	public static native void nglTexCoord4f(float s, float t, float r, float q, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current four-dimensional texture coordinate.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 * @param q the q component of the current texture coordinates
	 */
	public static void glTexCoord4f(float s, float t, float r, float q) {
		long __functionAddress = getInstance().TexCoord4f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord4f(s, t, r, q, __functionAddress);
	}

	// --- [ glTexCoord4s ] ---

	/** JNI method for {@link #glTexCoord4s TexCoord4s} */
	@JavadocExclude
	public static native void nglTexCoord4s(short s, short t, short r, short q, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glTexCoord4f TexCoord4f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 * @param q the q component of the current texture coordinates
	 */
	public static void glTexCoord4s(short s, short t, short r, short q) {
		long __functionAddress = getInstance().TexCoord4s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord4s(s, t, r, q, __functionAddress);
	}

	// --- [ glTexCoord4i ] ---

	/** JNI method for {@link #glTexCoord4i TexCoord4i} */
	@JavadocExclude
	public static native void nglTexCoord4i(int s, int t, int r, int q, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glTexCoord4f TexCoord4f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 * @param q the q component of the current texture coordinates
	 */
	public static void glTexCoord4i(int s, int t, int r, int q) {
		long __functionAddress = getInstance().TexCoord4i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord4i(s, t, r, q, __functionAddress);
	}

	// --- [ glTexCoord4d ] ---

	/** JNI method for {@link #glTexCoord4d TexCoord4d} */
	@JavadocExclude
	public static native void nglTexCoord4d(double s, double t, double r, double q, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glTexCoord4f TexCoord4f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 * @param q the q component of the current texture coordinates
	 */
	public static void glTexCoord4d(double s, double t, double r, double q) {
		long __functionAddress = getInstance().TexCoord4d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord4d(s, t, r, q, __functionAddress);
	}

	// --- [ glTexCoord4fv ] ---

	/** JNI method for {@link #glTexCoord4fv TexCoord4fv} */
	@JavadocExclude
	public static native void nglTexCoord4fv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord4fv TexCoord4fv} */
	@JavadocExclude
	public static void nglTexCoord4fv(long v) {
		long __functionAddress = getInstance().TexCoord4fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord4fv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord4f TexCoord4f}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord4fv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglTexCoord4fv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord4fv TexCoord4fv} */
	public static void glTexCoord4fv(FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglTexCoord4fv(memAddress(v));
	}

	// --- [ glTexCoord4sv ] ---

	/** JNI method for {@link #glTexCoord4sv TexCoord4sv} */
	@JavadocExclude
	public static native void nglTexCoord4sv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord4sv TexCoord4sv} */
	@JavadocExclude
	public static void nglTexCoord4sv(long v) {
		long __functionAddress = getInstance().TexCoord4sv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord4sv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord4s TexCoord4s}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord4sv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglTexCoord4sv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord4sv TexCoord4sv} */
	public static void glTexCoord4sv(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglTexCoord4sv(memAddress(v));
	}

	// --- [ glTexCoord4iv ] ---

	/** JNI method for {@link #glTexCoord4iv TexCoord4iv} */
	@JavadocExclude
	public static native void nglTexCoord4iv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord4iv TexCoord4iv} */
	@JavadocExclude
	public static void nglTexCoord4iv(long v) {
		long __functionAddress = getInstance().TexCoord4iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord4iv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord4i TexCoord4i}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord4iv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglTexCoord4iv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord4iv TexCoord4iv} */
	public static void glTexCoord4iv(IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglTexCoord4iv(memAddress(v));
	}

	// --- [ glTexCoord4dv ] ---

	/** JNI method for {@link #glTexCoord4dv TexCoord4dv} */
	@JavadocExclude
	public static native void nglTexCoord4dv(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord4dv TexCoord4dv} */
	@JavadocExclude
	public static void nglTexCoord4dv(long v) {
		long __functionAddress = getInstance().TexCoord4dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord4dv(v, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord4d TexCoord4d}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord4dv(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 3);
		nglTexCoord4dv(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord4dv TexCoord4dv} */
	public static void glTexCoord4dv(DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglTexCoord4dv(memAddress(v));
	}

	// --- [ glTexCoordPointer ] ---

	/** JNI method for {@link #glTexCoordPointer TexCoordPointer} */
	@JavadocExclude
	public static native void nglTexCoordPointer(int size, int type, int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glTexCoordPointer TexCoordPointer} */
	@JavadocExclude
	public static void nglTexCoordPointer(int size, int type, int stride, long pointer) {
		long __functionAddress = getInstance().TexCoordPointer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoordPointer(size, type, stride, pointer, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a texture coordinate array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<br>1, 2, 3, 4
	 * @param type    the data type of the values stored in the array. One of:<br>{@link #GL_SHORT SHORT}, {@link #GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT FLOAT}, {@link #GL_DOUBLE DOUBLE}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the texture coordinate array data
	 */
	public static void glTexCoordPointer(int size, int type, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglTexCoordPointer(size, type, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glTexCoordPointer TexCoordPointer} */
	public static void glTexCoordPointer(int size, int type, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglTexCoordPointer(size, type, stride, pointerOffset);
	}

	/** GL_HALF_FLOAT version of: {@link #glTexCoordPointer TexCoordPointer} */
	public static void glTexCoordPointer(int size, int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglTexCoordPointer(size, GL30.GL_HALF_FLOAT, stride, memAddress(pointer));
	}

	/** GL_FLOAT version of: {@link #glTexCoordPointer TexCoordPointer} */
	public static void glTexCoordPointer(int size, int stride, FloatBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglTexCoordPointer(size, GL11.GL_FLOAT, stride, memAddress(pointer));
	}

	// --- [ glTexEnvi ] ---

	/** JNI method for {@link #glTexEnvi TexEnvi} */
	@JavadocExclude
	public static native void nglTexEnvi(int target, int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexEnvi.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets parameters of the texture environment that specifies how texture values are interpreted when texturing a fragment, or sets per-texture-unit
	 * filtering parameters.
	 *
	 * @param target the texture environment target. One of:<br>{@link #GL_TEXTURE_ENV TEXTURE_ENV}, {@link GL14#GL_TEXTURE_FILTER_CONTROL TEXTURE_FILTER_CONTROL}, {@link GL20#GL_POINT_SPRITE POINT_SPRITE}
	 * @param pname  the parameter to set. One of:<br>{@link GL20#GL_COORD_REPLACE COORD_REPLACE}, {@link #GL_TEXTURE_ENV_MODE TEXTURE_ENV_MODE}, {@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}, {@link GL13#GL_COMBINE_RGB COMBINE_RGB}, {@link GL13#GL_COMBINE_ALPHA COMBINE_ALPHA}, {@link GL15#GL_SRC0_RGB SRC0_RGB}, {@link GL15#GL_SRC1_RGB SRC1_RGB}, {@link GL15#GL_SRC2_RGB SRC2_RGB}, {@link GL15#GL_SRC0_ALPHA SRC0_ALPHA}, {@link GL15#GL_SRC1_ALPHA SRC1_ALPHA}, {@link GL15#GL_SRC2_ALPHA SRC2_ALPHA}, {@link GL13#GL_OPERAND0_RGB OPERAND0_RGB}, {@link GL13#GL_OPERAND1_RGB OPERAND1_RGB}, {@link GL13#GL_OPERAND2_RGB OPERAND2_RGB}, {@link GL13#GL_OPERAND0_ALPHA OPERAND0_ALPHA}, {@link GL13#GL_OPERAND1_ALPHA OPERAND1_ALPHA}, {@link GL13#GL_OPERAND2_ALPHA OPERAND2_ALPHA}, {@link GL13#GL_RGB_SCALE RGB_SCALE}, {@link #GL_ALPHA_SCALE ALPHA_SCALE}
	 * @param param  the parameter value. Scalar value or one of:<br>{@link #GL_REPLACE REPLACE}, {@link #GL_MODULATE MODULATE}, {@link #GL_DECAL DECAL}, {@link #GL_BLEND BLEND}, {@link #GL_ADD ADD}, {@link GL13#GL_COMBINE COMBINE}, {@link GL13#GL_ADD_SIGNED ADD_SIGNED}, {@link GL13#GL_INTERPOLATE INTERPOLATE}, {@link GL13#GL_SUBTRACT SUBTRACT}, {@link GL13#GL_DOT3_RGB DOT3_RGB}, {@link GL13#GL_DOT3_RGBA DOT3_RGBA}, {@link #GL_TEXTURE TEXTURE}, {@link GL13#GL_TEXTURE0 TEXTURE0}, GL13.GL_TEXTURE[1-31], {@link GL13#GL_CONSTANT CONSTANT}, {@link GL13#GL_PRIMARY_COLOR PRIMARY_COLOR}, {@link GL13#GL_PREVIOUS PREVIOUS}
	 */
	public static void glTexEnvi(int target, int pname, int param) {
		long __functionAddress = getInstance().TexEnvi;
		nglTexEnvi(target, pname, param, __functionAddress);
	}

	// --- [ glTexEnviv ] ---

	/** JNI method for {@link #glTexEnviv TexEnviv} */
	@JavadocExclude
	public static native void nglTexEnviv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTexEnviv TexEnviv} */
	@JavadocExclude
	public static void nglTexEnviv(int target, int pname, long params) {
		long __functionAddress = getInstance().TexEnviv;
		nglTexEnviv(target, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexEnv.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glTexEnvi TexEnvi}.
	 *
	 * @param target the texture environment target. Must be:<br>{@link #GL_TEXTURE_ENV TEXTURE_ENV}
	 * @param pname  the parameter to set. Must be:<br>{@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}
	 * @param params the parameter value
	 */
	public static void glTexEnviv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglTexEnviv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexEnviv TexEnviv} */
	public static void glTexEnviv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglTexEnviv(target, pname, memAddress(params));
	}

	// --- [ glTexEnvf ] ---

	/** JNI method for {@link #glTexEnvf TexEnvf} */
	@JavadocExclude
	public static native void nglTexEnvf(int target, int pname, float param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexEnvf.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Float version of {@link #glTexEnvi TexEnvi}.
	 *
	 * @param target the texture environment target
	 * @param pname  the parameter to set
	 * @param param  the parameter value
	 */
	public static void glTexEnvf(int target, int pname, float param) {
		long __functionAddress = getInstance().TexEnvf;
		nglTexEnvf(target, pname, param, __functionAddress);
	}

	// --- [ glTexEnvfv ] ---

	/** JNI method for {@link #glTexEnvfv TexEnvfv} */
	@JavadocExclude
	public static native void nglTexEnvfv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTexEnvfv TexEnvfv} */
	@JavadocExclude
	public static void nglTexEnvfv(int target, int pname, long params) {
		long __functionAddress = getInstance().TexEnvfv;
		nglTexEnvfv(target, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexEnv.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glTexEnvf TexEnvf}.
	 *
	 * @param target the texture environment target. Must be:<br>{@link #GL_TEXTURE_ENV TEXTURE_ENV}
	 * @param pname  the parameter to set. Must be:<br>{@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}
	 * @param params the parameter value
	 */
	public static void glTexEnvfv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglTexEnvfv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexEnvfv TexEnvfv} */
	public static void glTexEnvfv(int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglTexEnvfv(target, pname, memAddress(params));
	}

	// --- [ glTexGeni ] ---

	/** JNI method for {@link #glTexGeni TexGeni} */
	@JavadocExclude
	public static native void nglTexGeni(int coord, int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexGeni.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets an integer texture coordinate generation parameter.
	 * 
	 * <p>A texture coordinate generation function is enabled or disabled using {@link #glEnable Enable} and {@link #glDisable Disable} with an argument of
	 * {@link #GL_TEXTURE_GEN_S TEXTURE_GEN_S}, {@link #GL_TEXTURE_GEN_T TEXTURE_GEN_T}, {@link #GL_TEXTURE_GEN_R TEXTURE_GEN_R}, or {@link #GL_TEXTURE_GEN_Q TEXTURE_GEN_Q} (each indicates the corresponding texture
	 * coordinate). When enabled, the specified texture coordinate is computed according to the current {@link #GL_EYE_LINEAR EYE_LINEAR}, {@link #GL_OBJECT_LINEAR OBJECT_LINEAR} or
	 * {@link #GL_SPHERE_MAP SPHERE_MAP} specification, depending on the current setting of {@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE} for that coordinate. When disabled, subsequent
	 * vertices will take the indicated texture coordinate from the current texture coordinates.</p>
	 * 
	 * <p>The initial state has the texture generation function disabled for all texture coordinates. Initially all texture generation modes are EYE_LINEAR.</p>
	 *
	 * @param coord the coordinate for which to set the parameter. One of:<br>{@link #GL_S S}, {@link #GL_T T}, {@link #GL_R R}, {@link #GL_Q Q}
	 * @param pname the parameter to set. Must be:<br>{@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE}
	 * @param param the parameter value. One of:<br>{@link #GL_OBJECT_LINEAR OBJECT_LINEAR}, {@link #GL_EYE_LINEAR EYE_LINEAR}, {@link #GL_SPHERE_MAP SPHERE_MAP}, {@link GL13#GL_REFLECTION_MAP REFLECTION_MAP}, {@link GL13#GL_NORMAL_MAP NORMAL_MAP}
	 */
	public static void glTexGeni(int coord, int pname, int param) {
		long __functionAddress = getInstance().TexGeni;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexGeni(coord, pname, param, __functionAddress);
	}

	// --- [ glTexGeniv ] ---

	/** JNI method for {@link #glTexGeniv TexGeniv} */
	@JavadocExclude
	public static native void nglTexGeniv(int coord, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTexGeniv TexGeniv} */
	@JavadocExclude
	public static void nglTexGeniv(int coord, int pname, long params) {
		long __functionAddress = getInstance().TexGeniv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexGeniv(coord, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexGen.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexGeni TexGeni}.
	 *
	 * @param coord  the coordinate for which to set the parameter
	 * @param pname  the parameter to set. One of:<br>{@link #GL_OBJECT_PLANE OBJECT_PLANE}, {@link #GL_EYE_PLANE EYE_PLANE}
	 * @param params the parameter value
	 */
	public static void glTexGeniv(int coord, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglTexGeniv(coord, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexGeniv TexGeniv} */
	public static void glTexGeniv(int coord, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglTexGeniv(coord, pname, memAddress(params));
	}

	// --- [ glTexGenf ] ---

	/** JNI method for {@link #glTexGenf TexGenf} */
	@JavadocExclude
	public static native void nglTexGenf(int coord, int pname, float param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexGenf.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glTexGeni TexGeni}.
	 *
	 * @param coord the coordinate for which to set the parameter
	 * @param pname the parameter to set
	 * @param param the parameter value
	 */
	public static void glTexGenf(int coord, int pname, float param) {
		long __functionAddress = getInstance().TexGenf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexGenf(coord, pname, param, __functionAddress);
	}

	// --- [ glTexGenfv ] ---

	/** JNI method for {@link #glTexGenfv TexGenfv} */
	@JavadocExclude
	public static native void nglTexGenfv(int coord, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTexGenfv TexGenfv} */
	@JavadocExclude
	public static void nglTexGenfv(int coord, int pname, long params) {
		long __functionAddress = getInstance().TexGenfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexGenfv(coord, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexGen.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexGenf TexGenf}.
	 *
	 * @param coord  the coordinate for which to set the parameter
	 * @param pname  the parameter to set. One of:<br>{@link #GL_OBJECT_PLANE OBJECT_PLANE}, {@link #GL_EYE_PLANE EYE_PLANE}
	 * @param params the parameter value
	 */
	public static void glTexGenfv(int coord, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglTexGenfv(coord, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexGenfv TexGenfv} */
	public static void glTexGenfv(int coord, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglTexGenfv(coord, pname, memAddress(params));
	}

	// --- [ glTexGend ] ---

	/** JNI method for {@link #glTexGend TexGend} */
	@JavadocExclude
	public static native void nglTexGend(int coord, int pname, double param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexGend.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glTexGeni TexGeni}.
	 *
	 * @param coord the coordinate for which to set the parameter
	 * @param pname the parameter to set
	 * @param param the parameter value
	 */
	public static void glTexGend(int coord, int pname, double param) {
		long __functionAddress = getInstance().TexGend;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexGend(coord, pname, param, __functionAddress);
	}

	// --- [ glTexGendv ] ---

	/** JNI method for {@link #glTexGendv TexGendv} */
	@JavadocExclude
	public static native void nglTexGendv(int coord, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTexGendv TexGendv} */
	@JavadocExclude
	public static void nglTexGendv(int coord, int pname, long params) {
		long __functionAddress = getInstance().TexGendv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexGendv(coord, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexGen.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexGend TexGend}.
	 *
	 * @param coord  the coordinate for which to set the parameter
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glTexGendv(int coord, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 3);
		nglTexGendv(coord, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexGendv TexGendv} */
	public static void glTexGendv(int coord, int pname, DoubleBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglTexGendv(coord, pname, memAddress(params));
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies a two-dimensional texture image.
	 *
	 * @param target         the texture target. One of:<br>{@link #GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link #GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}, {@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}, {@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}, {@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format. One of:<br>{@link #GL_RED RED}, {@link GL30#GL_RG RG}, {@link #GL_RGB RGB}, {@link #GL_RGBA RGBA}, {@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL30#GL_R8 R8}, {@link GL31#GL_R8_SNORM R8_SNORM}, {@link GL30#GL_R16 R16}, {@link GL31#GL_R16_SNORM R16_SNORM}, {@link GL30#GL_RG8 RG8}, {@link GL31#GL_RG8_SNORM RG8_SNORM}, {@link GL30#GL_RG16 RG16}, {@link GL31#GL_RG16_SNORM RG16_SNORM}, {@link #GL_R3_G3_B2 R3_G3_B2}, {@link #GL_RGB4 RGB4}, {@link #GL_RGB5 RGB5}, {@link GL41#GL_RGB565 RGB565}, {@link #GL_RGB8 RGB8}, {@link GL31#GL_RGB8_SNORM RGB8_SNORM}, {@link #GL_RGB10 RGB10}, {@link #GL_RGB12 RGB12}, {@link #GL_RGB16 RGB16}, {@link GL31#GL_RGB16_SNORM RGB16_SNORM}, {@link #GL_RGBA2 RGBA2}, {@link #GL_RGBA4 RGBA4}, {@link #GL_RGB5_A1 RGB5_A1}, {@link #GL_RGBA8 RGBA8}, {@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}, {@link #GL_RGB10_A2 RGB10_A2}, {@link GL33#GL_RGB10_A2UI RGB10_A2UI}, {@link #GL_RGBA12 RGBA12}, {@link #GL_RGBA16 RGBA16}, {@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}, {@link GL21#GL_SRGB8 SRGB8}, {@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}, {@link GL30#GL_R16F R16F}, {@link GL30#GL_RG16F RG16F}, {@link GL30#GL_RGB16F RGB16F}, {@link GL30#GL_RGBA16F RGBA16F}, {@link GL30#GL_R32F R32F}, {@link GL30#GL_RG32F RG32F}, {@link GL30#GL_RGB32F RGB32F}, {@link GL30#GL_RGBA32F RGBA32F}, {@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}, {@link GL30#GL_RGB9_E5 RGB9_E5}, {@link GL30#GL_R8I R8I}, {@link GL30#GL_R8UI R8UI}, {@link GL30#GL_R16I R16I}, {@link GL30#GL_R16UI R16UI}, {@link GL30#GL_R32I R32I}, {@link GL30#GL_R32UI R32UI}, {@link GL30#GL_RG8I RG8I}, {@link GL30#GL_RG8UI RG8UI}, {@link GL30#GL_RG16I RG16I}, {@link GL30#GL_RG16UI RG16UI}, {@link GL30#GL_RG32I RG32I}, {@link GL30#GL_RG32UI RG32UI}, {@link GL30#GL_RGB8I RGB8I}, {@link GL30#GL_RGB8UI RGB8UI}, {@link GL30#GL_RGB16I RGB16I}, {@link GL30#GL_RGB16UI RGB16UI}, {@link GL30#GL_RGB32I RGB32I}, {@link GL30#GL_RGB32UI RGB32UI}, {@link GL30#GL_RGBA8I RGBA8I}, {@link GL30#GL_RGBA8UI RGBA8UI}, {@link GL30#GL_RGBA16I RGBA16I}, {@link GL30#GL_RGBA16UI RGBA16UI}, {@link GL30#GL_RGBA32I RGBA32I}, {@link GL30#GL_RGBA32UI RGBA32UI}, {@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16}, {@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24}, {@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32}, {@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8}, {@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F}, {@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8}, {@link GL30#GL_COMPRESSED_RED COMPRESSED_RED}, {@link GL30#GL_COMPRESSED_RG COMPRESSED_RG}, {@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB}, {@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA}, {@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB}, {@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA}, {@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}
	 * @param width          the texture width
	 * @param height         the texture height
	 * @param border         the texture border width
	 * @param format         the texel data format. One of:<br>{@link #GL_STENCIL_INDEX STENCIL_INDEX}, {@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link #GL_RED RED}, {@link #GL_GREEN GREEN}, {@link #GL_BLUE BLUE}, {@link #GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link #GL_RGB RGB}, {@link #GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link #GL_LUMINANCE LUMINANCE}, {@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type           the texel data type. One of:<br>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_BYTE BYTE}, {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_SHORT SHORT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}, {@link #GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link #GL_BITMAP BITMAP}
	 * @param pixels         the texel data
	 */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** Buffer object offset version of: {@link #glTexImage2D TexImage2D} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTexImage2D TexImage2D} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glTexImage2D TexImage2D} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glTexImage2D TexImage2D} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/** DoubleBuffer version of: {@link #glTexImage2D TexImage2D} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glTexImage1D ] ---

	/** JNI method for {@link #glTexImage1D TexImage1D} */
	@JavadocExclude
	public static native void nglTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glTexImage1D TexImage1D} */
	@JavadocExclude
	public static void nglTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
		long __functionAddress = getInstance().TexImage1D;
		nglTexImage1D(target, level, internalformat, width, border, format, type, pixels, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
	 *
	 * @param target         the texture target. One of:<br>{@link #GL_TEXTURE_1D TEXTURE_1D}, {@link #GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format
	 * @param width          the texture width
	 * @param border         the texture border width
	 * @param format         the texel data format
	 * @param type           the texel data type
	 * @param pixels         the texel data
	 */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/** Buffer object offset version of: {@link #glTexImage1D TexImage1D} */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTexImage1D(target, level, internalformat, width, border, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTexImage1D TexImage1D} */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/** IntBuffer version of: {@link #glTexImage1D TexImage1D} */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/** FloatBuffer version of: {@link #glTexImage1D TexImage1D} */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/** DoubleBuffer version of: {@link #glTexImage1D TexImage1D} */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glCopyTexImage2D ] ---

	/** JNI method for {@link #glCopyTexImage2D CopyTexImage2D} */
	@JavadocExclude
	public static native void nglCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCopyTexImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Defines a two-dimensional texel array in exactly the manner of {@link #glTexImage2D TexImage2D}, except that the image data are taken from the framebuffer rather
	 * than from client memory.
	 * 
	 * <p>{@code x}, {@code y}, {@code width}, and {@code height} correspond precisely to the corresponding arguments to {@link #glReadPixels ReadPixels}; they specify the
	 * image's width and height, and the lower left (x, y) coordinates of the framebuffer region to be copied.</p>
	 * 
	 * <p>The image is taken from the framebuffer exactly as if these arguments were passed to {@link #glCopyPixels CopyPixels} with argument type set to {@link #GL_COLOR COLOR},
	 * {@link #GL_DEPTH DEPTH}, or {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, depending on {@code internalformat}. RGBA data is taken from the current color buffer, while depth
	 * component and stencil index data are taken from the depth and stencil buffers, respectively.</p>
	 * 
	 * <p>Subsequent processing is identical to that described for {@link #glTexImage2D TexImage2D}, beginning with clamping of the R, G, B, A, or depth values, and masking
	 * of the stencil index values from the resulting pixel groups. Parameters {@code level}, {@code internalformat}, and {@code border} are specified using
	 * the same values, with the same meanings, as the corresponding arguments of {@link #glTexImage2D TexImage2D}.</p>
	 * 
	 * <p>The constraints on width, height, and border are exactly those for the corresponding arguments of {@link #glTexImage2D TexImage2D}.</p>
	 *
	 * @param target         the texture target. One of:<br>{@link #GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}
	 * @param level          the level-of-detail number
	 * @param internalFormat the texture internal format. See {@link #glTexImage2D TexImage2D} for a list of supported formats.
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the texture width
	 * @param height         the texture height
	 * @param border         the texture border width
	 */
	public static void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
		long __functionAddress = getInstance().CopyTexImage2D;
		nglCopyTexImage2D(target, level, internalFormat, x, y, width, height, border, __functionAddress);
	}

	// --- [ glCopyTexImage1D ] ---

	/** JNI method for {@link #glCopyTexImage1D CopyTexImage1D} */
	@JavadocExclude
	public static native void nglCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCopyTexImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Defines a one-dimensional texel array in exactly the manner of {@link #glTexImage1D TexImage1D}, except that the image data are taken from the framebuffer rather
	 * than from client memory. For the purposes of decoding the texture image, {@code CopyTexImage1D} is equivalent to calling {@link #glCopyTexImage2D CopyTexImage2D}
	 * with corresponding arguments and height of 1, except that the height of the image is always 1, regardless of the value of border. level, internalformat,
	 * and border are specified using the same values, with the same meanings, as the corresponding arguments of {@link #glTexImage1D TexImage1D}. The constraints on
	 * width and border are exactly those of the corresponding arguments of {@link #glTexImage1D TexImage1D}.
	 *
	 * @param target         the texture target. Must be:<br>{@link #GL_TEXTURE_1D TEXTURE_1D}
	 * @param level          the level-of-detail number
	 * @param internalFormat the texture internal format. See {@link #glTexImage2D TexImage2D} for a list of supported formats.
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the texture width
	 * @param border         the texture border width
	 */
	public static void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) {
		long __functionAddress = getInstance().CopyTexImage1D;
		nglCopyTexImage1D(target, level, internalFormat, x, y, width, border, __functionAddress);
	}

	// --- [ glCopyTexSubImage1D ] ---

	/** JNI method for {@link #glCopyTexSubImage1D CopyTexSubImage1D} */
	@JavadocExclude
	public static native void nglCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCopyTexSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the {@code internalformat}, {@code width} or {@code border}
	 * parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See {@link #glCopyTexImage1D CopyTexImage1D} for more
	 * details.
	 *
	 * @param target  the texture target. Must be:<br>{@link #GL_TEXTURE_1D TEXTURE_1D}
	 * @param level   the level-of-detail number
	 * @param xoffset the left texel coordinate of the texture subregion to update
	 * @param x       the left framebuffer pixel coordinate
	 * @param y       the lower framebuffer pixel coordinate
	 * @param width   the texture subregion width
	 */
	public static void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
		long __functionAddress = getInstance().CopyTexSubImage1D;
		nglCopyTexSubImage1D(target, level, xoffset, x, y, width, __functionAddress);
	}

	// --- [ glCopyTexSubImage2D ] ---

	/** JNI method for {@link #glCopyTexSubImage2D CopyTexSubImage2D} */
	@JavadocExclude
	public static native void nglCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCopyTexSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the {@code internalformat}, {@code width}, {@code height},
	 * or {@code border} parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See
	 * {@link #glCopyTexImage2D CopyTexImage2D} for more details.
	 *
	 * @param target  the texture target. One of:<br>{@link #GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}
	 * @param level   the level-of-detail number
	 * @param xoffset the left texel coordinate of the texture subregion to update
	 * @param yoffset the lower texel coordinate of the texture subregion to update
	 * @param x       the left framebuffer pixel coordinate
	 * @param y       the lower framebuffer pixel coordinate
	 * @param width   the texture subregion width
	 * @param height  the texture subregion height
	 */
	public static void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().CopyTexSubImage2D;
		nglCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height, __functionAddress);
	}

	// --- [ glTexParameteri ] ---

	/** JNI method for {@link #glTexParameteri TexParameteri} */
	@JavadocExclude
	public static native void nglTexParameteri(int target, int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexParameteri.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the integer value of a texture parameter, which controls how the texel array is treated when specified or changed, and when applied to a fragment.
	 *
	 * @param target the texture target. One of:<br>{@link #GL_TEXTURE_1D TEXTURE_1D}, {@link #GL_TEXTURE_2D TEXTURE_2D}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param pname  the parameter to set. One of:<br>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}, {@link #GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}, {@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}, {@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}, {@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}, {@link #GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}, {@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}, {@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}, {@link #GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}, {@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}, {@link #GL_TEXTURE_PRIORITY TEXTURE_PRIORITY}, {@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}, {@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}, {@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}, {@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}, {@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}, {@link #GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}, {@link #GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}, {@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}, {@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}, {@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}
	 * @param param  the parameter value
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glTexParameteri TexParameteri}.
	 *
	 * @param target the texture target
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glTexParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglTexParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexParameteriv TexParameteriv} */
	public static void glTexParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglTexParameteriv(target, pname, memAddress(params));
	}

	// --- [ glTexParameterf ] ---

	/** JNI method for {@link #glTexParameterf TexParameterf} */
	@JavadocExclude
	public static native void nglTexParameterf(int target, int pname, float param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexParameterf.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Float version of {@link #glTexParameteri TexParameteri}.
	 *
	 * @param target the texture target
	 * @param pname  the parameter to set
	 * @param param  the parameter value
	 */
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glTexParameterf TexParameterf}.
	 *
	 * @param target the texture target
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glTexParameterfv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglTexParameterfv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexParameterfv TexParameterfv} */
	public static void glTexParameterfv(int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglTexParameterfv(target, pname, memAddress(params));
	}

	// --- [ glTexSubImage1D ] ---

	/** JNI method for {@link #glTexSubImage1D TexSubImage1D} */
	@JavadocExclude
	public static native void nglTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glTexSubImage1D TexSubImage1D} */
	@JavadocExclude
	public static void nglTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels) {
		long __functionAddress = getInstance().TexSubImage1D;
		nglTexSubImage1D(target, level, xoffset, width, format, type, pixels, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
	 *
	 * @param target  the texture target. Must be:<br>{@link #GL_TEXTURE_1D TEXTURE_1D}
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param format  the pixel data format. One of:<br>{@link #GL_STENCIL_INDEX STENCIL_INDEX}, {@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link #GL_RED RED}, {@link #GL_GREEN GREEN}, {@link #GL_BLUE BLUE}, {@link #GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link #GL_RGB RGB}, {@link #GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link #GL_LUMINANCE LUMINANCE}, {@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the pixel data type. One of:<br>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_BYTE BYTE}, {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_SHORT SHORT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}, {@link #GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link #GL_BITMAP BITMAP}
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glTexSubImage1D TexSubImage1D} */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTexSubImage1D(target, level, xoffset, width, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTexSubImage1D TexSubImage1D} */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTexSubImage1D TexSubImage1D} */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTexSubImage1D TexSubImage1D} */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glTexSubImage1D TexSubImage1D} */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
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

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of
	 * the specified texel array, nor is any change made to texel values outside the specified subregion.
	 *
	 * @param target  the texture target. One of:<br>{@link #GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param yoffset the bottom coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param format  the pixel data format. One of:<br>{@link #GL_STENCIL_INDEX STENCIL_INDEX}, {@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link #GL_RED RED}, {@link #GL_GREEN GREEN}, {@link #GL_BLUE BLUE}, {@link #GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link #GL_RGB RGB}, {@link #GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link #GL_LUMINANCE LUMINANCE}, {@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the pixel data type. One of:<br>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_BYTE BYTE}, {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_SHORT SHORT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}, {@link #GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link #GL_BITMAP BITMAP}
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glTexSubImage2D TexSubImage2D} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	// --- [ glTranslatef ] ---

	/** JNI method for {@link #glTranslatef Translatef} */
	@JavadocExclude
	public static native void nglTranslatef(float x, float y, float z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTranslatef.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Manipulates the current matrix with a translation matrix along the x-, y- and z- axes.
	 * 
	 * <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr><td>1</td><td>0</td><td>0</td><td>x</td></tr>
	 * <tr><td>0</td><td>1</td><td>0</td><td>y</td></tr>
	 * <tr><td>0</td><td>0</td><td>1</td><td>z</td></tr>
	 * <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table></p>
	 *
	 * @param x the x-axis translation
	 * @param y the y-axis translation
	 * @param z the z-axis translation
	 */
	public static void glTranslatef(float x, float y, float z) {
		long __functionAddress = getInstance().Translatef;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTranslatef(x, y, z, __functionAddress);
	}

	// --- [ glTranslated ] ---

	/** JNI method for {@link #glTranslated Translated} */
	@JavadocExclude
	public static native void nglTranslated(double x, double y, double z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTranslated.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glTranslatef Translatef}.
	 *
	 * @param x the x-axis translation
	 * @param y the y-axis translation
	 * @param z the z-axis translation
	 */
	public static void glTranslated(double x, double y, double z) {
		long __functionAddress = getInstance().Translated;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTranslated(x, y, z, __functionAddress);
	}

	// --- [ glVertex2f ] ---

	/** JNI method for {@link #glVertex2f Vertex2f} */
	@JavadocExclude
	public static native void nglVertex2f(float x, float y, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies a single vertex between {@link #glBegin Begin} and {@link #glEnd End} by giving its coordinates in two dimensions. The z coordinate is implicitly set
	 * to zero and the w coordinate to one.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 */
	public static void glVertex2f(float x, float y) {
		long __functionAddress = getInstance().Vertex2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex2f(x, y, __functionAddress);
	}

	// --- [ glVertex2s ] ---

	/** JNI method for {@link #glVertex2s Vertex2s} */
	@JavadocExclude
	public static native void nglVertex2s(short x, short y, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glVertex2f Vertex2f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 */
	public static void glVertex2s(short x, short y) {
		long __functionAddress = getInstance().Vertex2s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex2s(x, y, __functionAddress);
	}

	// --- [ glVertex2i ] ---

	/** JNI method for {@link #glVertex2i Vertex2i} */
	@JavadocExclude
	public static native void nglVertex2i(int x, int y, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glVertex2f Vertex2f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 */
	public static void glVertex2i(int x, int y) {
		long __functionAddress = getInstance().Vertex2i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex2i(x, y, __functionAddress);
	}

	// --- [ glVertex2d ] ---

	/** JNI method for {@link #glVertex2d Vertex2d} */
	@JavadocExclude
	public static native void nglVertex2d(double x, double y, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glVertex2f Vertex2f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 */
	public static void glVertex2d(double x, double y) {
		long __functionAddress = getInstance().Vertex2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex2d(x, y, __functionAddress);
	}

	// --- [ glVertex2fv ] ---

	/** JNI method for {@link #glVertex2fv Vertex2fv} */
	@JavadocExclude
	public static native void nglVertex2fv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glVertex2fv Vertex2fv} */
	@JavadocExclude
	public static void nglVertex2fv(long coords) {
		long __functionAddress = getInstance().Vertex2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex2fv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex2f Vertex2f}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex2fv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2 << 2);
		nglVertex2fv(memAddress(coords));
	}

	/** Alternative version of: {@link #glVertex2fv Vertex2fv} */
	public static void glVertex2fv(FloatBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2);
		nglVertex2fv(memAddress(coords));
	}

	// --- [ glVertex2sv ] ---

	/** JNI method for {@link #glVertex2sv Vertex2sv} */
	@JavadocExclude
	public static native void nglVertex2sv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glVertex2sv Vertex2sv} */
	@JavadocExclude
	public static void nglVertex2sv(long coords) {
		long __functionAddress = getInstance().Vertex2sv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex2sv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex2s Vertex2s}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex2sv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2 << 1);
		nglVertex2sv(memAddress(coords));
	}

	/** Alternative version of: {@link #glVertex2sv Vertex2sv} */
	public static void glVertex2sv(ShortBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2);
		nglVertex2sv(memAddress(coords));
	}

	// --- [ glVertex2iv ] ---

	/** JNI method for {@link #glVertex2iv Vertex2iv} */
	@JavadocExclude
	public static native void nglVertex2iv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glVertex2iv Vertex2iv} */
	@JavadocExclude
	public static void nglVertex2iv(long coords) {
		long __functionAddress = getInstance().Vertex2iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex2iv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex2i Vertex2i}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex2iv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2 << 2);
		nglVertex2iv(memAddress(coords));
	}

	/** Alternative version of: {@link #glVertex2iv Vertex2iv} */
	public static void glVertex2iv(IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2);
		nglVertex2iv(memAddress(coords));
	}

	// --- [ glVertex2dv ] ---

	/** JNI method for {@link #glVertex2dv Vertex2dv} */
	@JavadocExclude
	public static native void nglVertex2dv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glVertex2dv Vertex2dv} */
	@JavadocExclude
	public static void nglVertex2dv(long coords) {
		long __functionAddress = getInstance().Vertex2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex2dv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex2d Vertex2d}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex2dv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2 << 3);
		nglVertex2dv(memAddress(coords));
	}

	/** Alternative version of: {@link #glVertex2dv Vertex2dv} */
	public static void glVertex2dv(DoubleBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 2);
		nglVertex2dv(memAddress(coords));
	}

	// --- [ glVertex3f ] ---

	/** JNI method for {@link #glVertex3f Vertex3f} */
	@JavadocExclude
	public static native void nglVertex3f(float x, float y, float z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies a single vertex between {@link #glBegin Begin} and {@link #glEnd End} by giving its coordinates in three dimensions. The w coordinate is implicitly set
	 * to one.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 */
	public static void glVertex3f(float x, float y, float z) {
		long __functionAddress = getInstance().Vertex3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex3f(x, y, z, __functionAddress);
	}

	// --- [ glVertex3s ] ---

	/** JNI method for {@link #glVertex3s Vertex3s} */
	@JavadocExclude
	public static native void nglVertex3s(short x, short y, short z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glVertex3f Vertex3f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 */
	public static void glVertex3s(short x, short y, short z) {
		long __functionAddress = getInstance().Vertex3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex3s(x, y, z, __functionAddress);
	}

	// --- [ glVertex3i ] ---

	/** JNI method for {@link #glVertex3i Vertex3i} */
	@JavadocExclude
	public static native void nglVertex3i(int x, int y, int z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glVertex3f Vertex3f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 */
	public static void glVertex3i(int x, int y, int z) {
		long __functionAddress = getInstance().Vertex3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex3i(x, y, z, __functionAddress);
	}

	// --- [ glVertex3d ] ---

	/** JNI method for {@link #glVertex3d Vertex3d} */
	@JavadocExclude
	public static native void nglVertex3d(double x, double y, double z, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glVertex3f Vertex3f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 */
	public static void glVertex3d(double x, double y, double z) {
		long __functionAddress = getInstance().Vertex3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex3d(x, y, z, __functionAddress);
	}

	// --- [ glVertex3fv ] ---

	/** JNI method for {@link #glVertex3fv Vertex3fv} */
	@JavadocExclude
	public static native void nglVertex3fv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glVertex3fv Vertex3fv} */
	@JavadocExclude
	public static void nglVertex3fv(long coords) {
		long __functionAddress = getInstance().Vertex3fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex3fv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex3f Vertex3f}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex3fv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3 << 2);
		nglVertex3fv(memAddress(coords));
	}

	/** Alternative version of: {@link #glVertex3fv Vertex3fv} */
	public static void glVertex3fv(FloatBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3);
		nglVertex3fv(memAddress(coords));
	}

	// --- [ glVertex3sv ] ---

	/** JNI method for {@link #glVertex3sv Vertex3sv} */
	@JavadocExclude
	public static native void nglVertex3sv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glVertex3sv Vertex3sv} */
	@JavadocExclude
	public static void nglVertex3sv(long coords) {
		long __functionAddress = getInstance().Vertex3sv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex3sv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex3s Vertex3s}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex3sv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3 << 1);
		nglVertex3sv(memAddress(coords));
	}

	/** Alternative version of: {@link #glVertex3sv Vertex3sv} */
	public static void glVertex3sv(ShortBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3);
		nglVertex3sv(memAddress(coords));
	}

	// --- [ glVertex3iv ] ---

	/** JNI method for {@link #glVertex3iv Vertex3iv} */
	@JavadocExclude
	public static native void nglVertex3iv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glVertex3iv Vertex3iv} */
	@JavadocExclude
	public static void nglVertex3iv(long coords) {
		long __functionAddress = getInstance().Vertex3iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex3iv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex3i Vertex3i}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex3iv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3 << 2);
		nglVertex3iv(memAddress(coords));
	}

	/** Alternative version of: {@link #glVertex3iv Vertex3iv} */
	public static void glVertex3iv(IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3);
		nglVertex3iv(memAddress(coords));
	}

	// --- [ glVertex3dv ] ---

	/** JNI method for {@link #glVertex3dv Vertex3dv} */
	@JavadocExclude
	public static native void nglVertex3dv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glVertex3dv Vertex3dv} */
	@JavadocExclude
	public static void nglVertex3dv(long coords) {
		long __functionAddress = getInstance().Vertex3dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex3dv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex3d Vertex3d}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex3dv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3 << 3);
		nglVertex3dv(memAddress(coords));
	}

	/** Alternative version of: {@link #glVertex3dv Vertex3dv} */
	public static void glVertex3dv(DoubleBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 3);
		nglVertex3dv(memAddress(coords));
	}

	// --- [ glVertex4f ] ---

	/** JNI method for {@link #glVertex4f Vertex4f} */
	@JavadocExclude
	public static native void nglVertex4f(float x, float y, float z, float w, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies a single vertex between {@link #glBegin Begin} and {@link #glEnd End} by giving its coordinates in four dimensions.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 * @param w the vertex w coordinate
	 */
	public static void glVertex4f(float x, float y, float z, float w) {
		long __functionAddress = getInstance().Vertex4f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex4f(x, y, z, w, __functionAddress);
	}

	// --- [ glVertex4s ] ---

	/** JNI method for {@link #glVertex4s Vertex4s} */
	@JavadocExclude
	public static native void nglVertex4s(short x, short y, short z, short w, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glVertex4f Vertex4f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 * @param w the vertex w coordinate
	 */
	public static void glVertex4s(short x, short y, short z, short w) {
		long __functionAddress = getInstance().Vertex4s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex4s(x, y, z, w, __functionAddress);
	}

	// --- [ glVertex4i ] ---

	/** JNI method for {@link #glVertex4i Vertex4i} */
	@JavadocExclude
	public static native void nglVertex4i(int x, int y, int z, int w, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glVertex4f Vertex4f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 * @param w the vertex w coordinate
	 */
	public static void glVertex4i(int x, int y, int z, int w) {
		long __functionAddress = getInstance().Vertex4i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex4i(x, y, z, w, __functionAddress);
	}

	// --- [ glVertex4d ] ---

	/** JNI method for {@link #glVertex4d Vertex4d} */
	@JavadocExclude
	public static native void nglVertex4d(double x, double y, double z, double w, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glVertex4f Vertex4f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 * @param w the vertex w coordinate
	 */
	public static void glVertex4d(double x, double y, double z, double w) {
		long __functionAddress = getInstance().Vertex4d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex4d(x, y, z, w, __functionAddress);
	}

	// --- [ glVertex4fv ] ---

	/** JNI method for {@link #glVertex4fv Vertex4fv} */
	@JavadocExclude
	public static native void nglVertex4fv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glVertex4fv Vertex4fv} */
	@JavadocExclude
	public static void nglVertex4fv(long coords) {
		long __functionAddress = getInstance().Vertex4fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex4fv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex4f Vertex4f}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex4fv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4 << 2);
		nglVertex4fv(memAddress(coords));
	}

	/** Alternative version of: {@link #glVertex4fv Vertex4fv} */
	public static void glVertex4fv(FloatBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4);
		nglVertex4fv(memAddress(coords));
	}

	// --- [ glVertex4sv ] ---

	/** JNI method for {@link #glVertex4sv Vertex4sv} */
	@JavadocExclude
	public static native void nglVertex4sv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glVertex4sv Vertex4sv} */
	@JavadocExclude
	public static void nglVertex4sv(long coords) {
		long __functionAddress = getInstance().Vertex4sv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex4sv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex4s Vertex4s}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex4sv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4 << 1);
		nglVertex4sv(memAddress(coords));
	}

	/** Alternative version of: {@link #glVertex4sv Vertex4sv} */
	public static void glVertex4sv(ShortBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4);
		nglVertex4sv(memAddress(coords));
	}

	// --- [ glVertex4iv ] ---

	/** JNI method for {@link #glVertex4iv Vertex4iv} */
	@JavadocExclude
	public static native void nglVertex4iv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glVertex4iv Vertex4iv} */
	@JavadocExclude
	public static void nglVertex4iv(long coords) {
		long __functionAddress = getInstance().Vertex4iv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex4iv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex4i Vertex4i}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex4iv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4 << 2);
		nglVertex4iv(memAddress(coords));
	}

	/** Alternative version of: {@link #glVertex4iv Vertex4iv} */
	public static void glVertex4iv(IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4);
		nglVertex4iv(memAddress(coords));
	}

	// --- [ glVertex4dv ] ---

	/** JNI method for {@link #glVertex4dv Vertex4dv} */
	@JavadocExclude
	public static native void nglVertex4dv(long coords, long __functionAddress);

	/** Unsafe version of {@link #glVertex4dv Vertex4dv} */
	@JavadocExclude
	public static void nglVertex4dv(long coords) {
		long __functionAddress = getInstance().Vertex4dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex4dv(coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex4d Vertex4d}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex4dv(ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4 << 3);
		nglVertex4dv(memAddress(coords));
	}

	/** Alternative version of: {@link #glVertex4dv Vertex4dv} */
	public static void glVertex4dv(DoubleBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 4);
		nglVertex4dv(memAddress(coords));
	}

	// --- [ glVertexPointer ] ---

	/** JNI method for {@link #glVertexPointer VertexPointer} */
	@JavadocExclude
	public static native void nglVertexPointer(int size, int type, int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glVertexPointer VertexPointer} */
	@JavadocExclude
	public static void nglVertexPointer(int size, int type, int stride, long pointer) {
		long __functionAddress = getInstance().VertexPointer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexPointer(size, type, stride, pointer, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a vertex array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<br>2, 3, 4
	 * @param type    the data type of the values stored in the array. One of:<br>{@link #GL_SHORT SHORT}, {@link #GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT FLOAT}, {@link #GL_DOUBLE DOUBLE}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glVertexPointer(int size, int type, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexPointer(size, type, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glVertexPointer VertexPointer} */
	public static void glVertexPointer(int size, int type, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglVertexPointer(size, type, stride, pointerOffset);
	}

	/** GL_SHORT version of: {@link #glVertexPointer VertexPointer} */
	public static void glVertexPointer(int size, int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexPointer(size, GL11.GL_SHORT, stride, memAddress(pointer));
	}

	/** GL_INT version of: {@link #glVertexPointer VertexPointer} */
	public static void glVertexPointer(int size, int stride, IntBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexPointer(size, GL11.GL_INT, stride, memAddress(pointer));
	}

	/** GL_FLOAT version of: {@link #glVertexPointer VertexPointer} */
	public static void glVertexPointer(int size, int stride, FloatBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexPointer(size, GL11.GL_FLOAT, stride, memAddress(pointer));
	}

	/** GL_DOUBLE version of: {@link #glVertexPointer VertexPointer} */
	public static void glVertexPointer(int size, int stride, DoubleBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexPointer(size, GL11.GL_DOUBLE, stride, memAddress(pointer));
	}

	// --- [ glViewport ] ---

	/** JNI method for {@link #glViewport Viewport} */
	@JavadocExclude
	public static native void nglViewport(int x, int y, int w, int h, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glViewport.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the viewport transformation parameters for all viewports.
	 * 
	 * <p>The location of the viewport's bottom-left corner, given by {@code (x, y)}, are clamped to be within the implementation-dependent viewport bounds range.
	 * The viewport bounds range {@code [min, max]} tuple may be determined by calling {@link #glGetFloat GetFloat} with the symbolic
	 * constant {@link GL41#GL_VIEWPORT_BOUNDS_RANGE VIEWPORT_BOUNDS_RANGE}. Viewport width and height are clamped to implementation-dependent maximums when specified. The maximum
	 * width and height may be found by calling {@link #glGetFloat GetFloat} with the symbolic constant {@link #GL_MAX_VIEWPORT_DIMS MAX_VIEWPORT_DIMS}. The
	 * maximum viewport dimensions must be greater than or equal to the larger of the visible dimensions of the display being rendered to (if a display
	 * exists), and the largest renderbuffer image which can be successfully created and attached to a framebuffer object.</p>
	 * 
	 * <p>In the initial state, {@code w} and {@code h} for each viewport are set to the width and height, respectively, of the window into which the GL is to do
	 * its rendering. If the default framebuffer is bound but no default framebuffer is associated with the GL context, then {@code w} and {@code h} are
	 * initially set to zero.</p>
	 *
	 * @param x the left viewport coordinate
	 * @param y the bottom viewport coordinate
	 * @param w the viewport width
	 * @param h the viewport height
	 */
	public static void glViewport(int x, int y, int w, int h) {
		long __functionAddress = getInstance().Viewport;
		nglViewport(x, y, w, h, __functionAddress);
	}

}